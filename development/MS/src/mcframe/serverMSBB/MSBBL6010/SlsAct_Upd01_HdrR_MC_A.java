package mcframe.serverMSBB.MSBBL6010;

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
 * ブロック"SlsAct_Upd01_Hdr"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class SlsAct_Upd01_HdrR_MC_A extends MCConstRow {

	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public static final String $hdr_peg_no = "hdr_peg_no";
	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public static final String $data_crud_typ = "data_crud_typ";
	/**
	 * Sales result No. 売上実績ＮＯ.<p>
	 *
	 */
	public static final String $sls_act_no = "sls_act_no";
	/**
	 * Sales result sequence number 売上実績連番.<p>
	 *
	 */
	public static final String $sls_act_seq = "sls_act_seq";
	/**
	 * Sales result rev. number 売上実績改訂番号.<p>
	 *
	 */
	public static final String $sls_act_rev = "sls_act_rev";
	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public static final String $trd_cd = "trd_cd";
	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public static final String $trd_ptn_typ = "trd_ptn_typ";
	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public static final String $ac_dt = "ac_dt";
	/**
	 * Cancellation recording date 取消計上日.<p>
	 *
	 */
	public static final String $can_ac_dt = "can_ac_dt";
	/**
	 * Sales PIC cd. 売上担当者ＣＤ.<p>
	 *
	 */
	public static final String $sls_usr_cd = "sls_usr_cd";
	/**
	 * Sales dept. cd. 売上部門ＣＤ.<p>
	 *
	 */
	public static final String $sls_dpt_cd = "sls_dpt_cd";
	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public static final String $wg_cd = "wg_cd";
	/**
	 * Sales date 売上日.<p>
	 *
	 */
	public static final String $sls_dt = "sls_dt";
	/**
	 * Shipping date and time 出荷日時.<p>
	 *
	 */
	public static final String $ship_tm = "ship_tm";
	/**
	 * Delivery date and time 納品日時.<p>
	 *
	 */
	public static final String $dlv_tm = "dlv_tm";
	/**
	 * Transportation method cd. 輸送方法ＣＤ.<p>
	 *
	 */
	public static final String $trnspt_cd = "trnspt_cd";
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
	 * Estimated stopover date 経由予定日.<p>
	 *
	 */
	public static final String $via_schd_dt = "via_schd_dt";
	/**
	 * Transaction terms cd. 取引条件ＣＤ.<p>
	 *
	 */
	public static final String $iv_tterm_cd1 = "iv_tterm_cd1";
	/**
	 * Transaction terms remarks 取引条件備考.<p>
	 *
	 */
	public static final String $iv_tterm_rmrks1 = "iv_tterm_rmrks1";
	/**
	 * Delivery location cd. 受渡場所ＣＤ.<p>
	 *
	 */
	public static final String $iv_tterm_cd2 = "iv_tterm_cd2";
	/**
	 * Delivery location remarks 受渡場所備考.<p>
	 *
	 */
	public static final String $iv_tterm_rmrks2 = "iv_tterm_rmrks2";
	/**
	 * Payment terms cd. 支払条件ＣＤ.<p>
	 *
	 */
	public static final String $iv_tterm_cd3 = "iv_tterm_cd3";
	/**
	 * Payment terms remarks 支払条件備考.<p>
	 *
	 */
	public static final String $iv_tterm_rmrks3 = "iv_tterm_rmrks3";
	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public static final String $cst_cd = "cst_cd";
	/**
	 * Customer invoice transaction 得意先インボイス取引.<p>
	 *
	 */
	public static final String $cst_iv_flg = "cst_iv_flg";
	/**
	 * Invoice creating source type インボイス作成元区分.<p>
	 *
	 */
	public static final String $iv_src_typ = "iv_src_typ";
	/**
	 * Invoice management No. インボイス管理ＮＯ.<p>
	 *
	 */
	public static final String $iv_mng_no = "iv_mng_no";
	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public static final String $iv_no = "iv_no";
	/**
	 * Invoice rev. number インボイス改訂番号.<p>
	 *
	 */
	public static final String $iv_rev = "iv_rev";
	/**
	 * Corresponding I/V No. 対応インボイスＮＯ.<p>
	 *
	 */
	public static final String $ref_iv_no = "ref_iv_no";
	/**
	 * Purchase invoice management No. 受領インボイス管理ＮＯ.<p>
	 *
	 */
	public static final String $rcpt_iv_mng_no = "rcpt_iv_mng_no";
	/**
	 * Purchase invoice No. 受領インボイスＮＯ.<p>
	 *
	 */
	public static final String $rcpt_iv_no = "rcpt_iv_no";
	/**
	 * Auto 自動.<p>
	 *
	 */
	public static final String $num_flg = "num_flg";
	/**
	 * Invoice date インボイス日付.<p>
	 *
	 */
	public static final String $iv_dt = "iv_dt";
	/**
	 * Omit packing list パッキングリスト省略.<p>
	 *
	 */
	public static final String $pl_skip_flg = "pl_skip_flg";
	/**
	 * Invoice immediate issue インボイス即時発行.<p>
	 *
	 */
	public static final String $iv_immed_prnt_flg = "iv_immed_prnt_flg";
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
	 * Invoice internal remarks インボイス内部備考.<p>
	 *
	 */
	public static final String $iv_intr_rmrks = "iv_intr_rmrks";
	/**
	 * Invoice spare 1 インボイス予備１.<p>
	 *
	 */
	public static final String $iv_sub_char1 = "iv_sub_char1";
	/**
	 * Invoice spare 2 インボイス予備２.<p>
	 *
	 */
	public static final String $iv_sub_char2 = "iv_sub_char2";
	/**
	 * Invoice spare 3 インボイス予備３.<p>
	 *
	 */
	public static final String $iv_sub_char3 = "iv_sub_char3";
	/**
	 * Delete rows of all details linked to sales header 売上ヘッダに紐づく全明細を行削除.<p>
	 *
	 */
	public static final String $del_all_sls_d_flg = "del_all_sls_d_flg";
	/**
	 * Transaction terms cd. 1 取引条件ＣＤ１.<p>
	 *
	 */
	public static final String $tterm_cd1 = "tterm_cd1";
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
	 * Transaction terms remarks 3 取引条件備考３.<p>
	 *
	 */
	public static final String $tterm_rmrks3 = "tterm_rmrks3";
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
	 * Scheduled payment receipt date 入金予定日.<p>
	 *
	 */
	public static final String $rcv_schd_dt = "rcv_schd_dt";
	/**
	 * Billing base date 請求起算日.<p>
	 *
	 */
	public static final String $bill_basis_dt = "bill_basis_dt";
	/**
	 * Credit managed BP cd. 与信管理先ＣＤ.<p>
	 *
	 */
	public static final String $cred_cd = "cred_cd";
	/**
	 * Billing customer cd. 請求先ＣＤ.<p>
	 *
	 */
	public static final String $bcst_cd = "bcst_cd";
	/**
	 * AR customer cd. 売掛先ＣＤ.<p>
	 *
	 */
	public static final String $acst_cd = "acst_cd";
	/**
	 * AR dept. cd. 債権部門ＣＤ.<p>
	 *
	 */
	public static final String $ar_dpt_cd = "ar_dpt_cd";
	/**
	 * AP dept. cd. 債務部門ＣＤ.<p>
	 *
	 */
	public static final String $ap_dpt_cd = "ap_dpt_cd";
	/**
	 * Customer order No. 得意先注文ＮＯ.<p>
	 *
	 */
	public static final String $cst_po_no = "cst_po_no";
	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public static final String $trd_cur_cd = "trd_cur_cd";
	/**
	 * Base currency cd. 基準通貨ＣＤ.<p>
	 *
	 */
	public static final String $base_cur_cd = "base_cur_cd";
	/**
	 * Exchange rate cd. 為替レートＣＤ.<p>
	 *
	 */
	public static final String $xrate_cd = "xrate_cd";
	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public static final String $xrate = "xrate";
	/**
	 * Taxpaying currency cd. 納税通貨ＣＤ.<p>
	 *
	 */
	public static final String $ptax_cur_cd = "ptax_cur_cd";
	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public static final String $ptax_xrate = "ptax_xrate";
	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public static final String $trd_rmrks = "trd_rmrks";
	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public static final String $intr_rmrks = "intr_rmrks";
	/**
	 * Shipping result No. 出荷実績ＮＯ.<p>
	 *
	 */
	public static final String $ship_act_no = "ship_act_no";
	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public static final String $slo_no = "slo_no";
	/**
	 * Sales return schedule No. 売上返品予定ＮＯ.<p>
	 *
	 */
	public static final String $sls_ret_schd_no = "sls_ret_schd_no";
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
	 * Delivery note No. 納品書ＮＯ.<p>
	 *
	 */
	public static final String $dlv_slip_no = "dlv_slip_no";
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
	 * Revenue recording type 売上計上区分.<p>
	 *
	 */
	public static final String $sls_basis_typ = "sls_basis_typ";
	/**
	 * Adjustment required date 調整対象日.<p>
	 *
	 */
	public static final String $adjst_tgt_dt = "adjst_tgt_dt";
	/**
	 * Sales adjustment type 売上調整区分.<p>
	 *
	 */
	public static final String $sls_adjst_typ = "sls_adjst_typ";
	/**
	 * Adjustment method type 調整方法区分.<p>
	 *
	 */
	public static final String $adjst_mtd_typ = "adjst_mtd_typ";
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
	 * Delivery note immediate issue 納品書即時発行.<p>
	 *
	 */
	public static final String $dlv_slip_prnt_flg = "dlv_slip_prnt_flg";
	/**
	 * Via shipping result service 出荷実績サービス経由.<p>
	 *
	 */
	public static final String $ship_act_service_via_flg = "ship_act_service_via_flg";
	/**
	 * Slip split unnecessary 伝票分割不要.<p>
	 *
	 */
	public static final String $slip_split_non_flg = "slip_split_non_flg";
	/**
	 * Execute shipping result service 出荷実績サービス実行.<p>
	 *
	 */
	public static final String $ship_act_service_exec_flg = "ship_act_service_exec_flg";
	/**
	 * Ignore lot check ロットチェック無視.<p>
	 *
	 */
	public static final String $lot_chk_off_flg = "lot_chk_off_flg";
	/**
	 * Correction of sales details 売上明細訂正.<p>
	 *
	 */
	public static final String $sls_dtl_mod_flg = "sls_dtl_mod_flg";
	/**
	 * No credit update required 与信更新不要.<p>
	 *
	 */
	public static final String $no_cred_upd_flg = "no_cred_upd_flg";
	/**
	 * Shipping result simultaneously recording 出荷実績同時計上.<p>
	 *
	 */
	public static final String $ship_act_sync_flg = "ship_act_sync_flg";
	/**
	 * New header pegging No. 新ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public static final String $new_hdr_peg_no = "new_hdr_peg_no";
	/**
	 * Header delivery destination cd. ヘッダ納品先ＣＤ.<p>
	 *
	 */
	public static final String $hdr_dlv_cd = "hdr_dlv_cd";
	/**
	 * Miscellaneous header delivery destination ヘッダ納品先諸口.<p>
	 *
	 */
	public static final String $hdr_dlv_sundry_flg = "hdr_dlv_sundry_flg";
	/**
	 * Header delivery destination name ヘッダ納品先名.<p>
	 *
	 */
	public static final String $hdr_dlv_nm = "hdr_dlv_nm";
	/**
	 * Header delivery destination zip code ヘッダ納品先郵便番号.<p>
	 *
	 */
	public static final String $hdr_dlv_zip_cd = "hdr_dlv_zip_cd";
	/**
	 * Heading delivery destination address 1 ヘッダ納品先住所１.<p>
	 *
	 */
	public static final String $hdr_dlv_addr1 = "hdr_dlv_addr1";
	/**
	 * Heading delivery destination address 2 ヘッダ納品先住所２.<p>
	 *
	 */
	public static final String $hdr_dlv_addr2 = "hdr_dlv_addr2";
	/**
	 * Heading delivery destination address 3 ヘッダ納品先住所３.<p>
	 *
	 */
	public static final String $hdr_dlv_addr3 = "hdr_dlv_addr3";
	/**
	 * Heading delivery destination address 4 ヘッダ納品先住所４.<p>
	 *
	 */
	public static final String $hdr_dlv_addr4 = "hdr_dlv_addr4";
	/**
	 * Header delivery destination dept. ヘッダ納品先部署.<p>
	 *
	 */
	public static final String $hdr_dlv_cntct_dpt = "hdr_dlv_cntct_dpt";
	/**
	 * Header delivery destination PIC ヘッダ納品先担当者.<p>
	 *
	 */
	public static final String $hdr_dlv_cntct_psn = "hdr_dlv_cntct_psn";
	/**
	 * Header delivery destination TEL ヘッダ納品先ＴＥＬ.<p>
	 *
	 */
	public static final String $hdr_dlv_tel = "hdr_dlv_tel";
	/**
	 * Header delivery destination FAX ヘッダ納品先ＦＡＸ.<p>
	 *
	 */
	public static final String $hdr_dlv_fax = "hdr_dlv_fax";
	/**
	 * Header tax rate ヘッダ税率.<p>
	 *
	 */
	public static final String $hdr_tax_rate = "hdr_tax_rate";
	/**
	 * Slip report cd. 伝票帳票ＣＤ.<p>
	 *
	 */
	public static final String $slip_form_cd = "slip_form_cd";
	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public static final String $trd_cur_amt = "trd_cur_amt";
	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public static final String $trd_cur_tax_amt = "trd_cur_tax_amt";
	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public static final String $base_cur_amt = "base_cur_amt";
	/**
	 * Tax amount (Base currency) 基準通貨税額.<p>
	 *
	 */
	public static final String $base_cur_tax_amt = "base_cur_tax_amt";
	/**
	 * Transaction currency unit price number of decimal places 取引通貨単価小数部有効桁数.<p>
	 *
	 */
	public static final String $trd_cur_upri_dec_place = "trd_cur_upri_dec_place";
	/**
	 * Transaction currency amount number of decimal places 取引通貨金額小数部有効桁数.<p>
	 *
	 */
	public static final String $trd_cur_amt_dec_place = "trd_cur_amt_dec_place";
	/**
	 * Base currency unit price number of decimal places 基準通貨単価小数部有効桁数.<p>
	 *
	 */
	public static final String $base_cur_upri_dec_place = "base_cur_upri_dec_place";
	/**
	 * Base currency amount number of decimal places 基準通貨金額小数部有効桁数.<p>
	 *
	 */
	public static final String $base_cur_amt_dec_place = "base_cur_amt_dec_place";
	/**
	 * Tax currency unit number of decimal places 納税通貨単価小数部有効桁数.<p>
	 *
	 */
	public static final String $ptax_cur_upri_dec_place = "ptax_cur_upri_dec_place";
	/**
	 * Tax currency amount number of decimal places 納税通貨金額小数部有効桁数.<p>
	 *
	 */
	public static final String $ptax_cur_amt_dec_place = "ptax_cur_amt_dec_place";
	/**
	 * Exchange rounding type 為替端数処理区分.<p>
	 *
	 */
	public static final String $xrate_rnd_typ = "xrate_rnd_typ";
	/**
	 * Rounding type (Amount) 金額端数処理区分.<p>
	 *
	 */
	public static final String $amt_rnd_typ = "amt_rnd_typ";
	/**
	 * Tax rounding type 税端数処理区分.<p>
	 *
	 */
	public static final String $tax_rnd_typ = "tax_rnd_typ";
	/**
	 * Slip status type 伝票状況区分.<p>
	 *
	 */
	public static final String $slip_sts_typ = "slip_sts_typ";
	/**
	 * Recording month 計上年月.<p>
	 *
	 */
	public static final String $ac_ym = "ac_ym";
	/**
	 * Delivery note sequence number 納品書連番.<p>
	 *
	 */
	public static final String $dlv_slip_seq = "dlv_slip_seq";
	/**
	 * Delivery note rev. number 納品書改訂番号.<p>
	 *
	 */
	public static final String $dlv_slip_rev = "dlv_slip_rev";
	/**
	 * Leading delivery note No. 先行納品書ＮＯ.<p>
	 *
	 */
	public static final String $bef_dlv_slip_no = "bef_dlv_slip_no";
	/**
	 * Leading invoice No. 先行インボイスＮＯ.<p>
	 *
	 */
	public static final String $bef_iv_no = "bef_iv_no";
	/**
	 * Approval target before correction 訂正前承認対象.<p>
	 *
	 */
	public static final String $bef_aprv_flg = "bef_aprv_flg";
	/**
	 * Direct-delivery sales 直送売上.<p>
	 *
	 */
	public static final String $ddlv_sls_flg = "ddlv_sls_flg";
	/**
	 * Billing closing type 請求締処理区分.<p>
	 *
	 */
	public static final String $bill_cl_typ = "bill_cl_typ";
	/**
	 * Shipping distribution group cd. 出荷物流グループＣＤ.<p>
	 *
	 */
	public static final String $ship_lg_grp_cd = "ship_lg_grp_cd";
	/**
	 * EDI ＥＤＩ.<p>
	 *
	 */
	public static final String $edi_flg = "edi_flg";
	/**
	 * Delivery note No. at shipping 出荷時納品書ＮＯ.<p>
	 *
	 */
	public static final String $ship_dlv_slip_no = "ship_dlv_slip_no";
	/**
	 * Direct delivery delivery note No. 仕入直送納品書ＮＯ.<p>
	 *
	 */
	public static final String $purc_ddlv_dlv_slip_no = "purc_ddlv_dlv_slip_no";
	/**
	 * Invoice header update counter インボイスヘッダ更新カウンタ.<p>
	 *
	 */
	public static final String $iv_upd_cntr = "iv_upd_cntr";
	/**
	 * Execute invoice service インボイスサービス実行.<p>
	 *
	 */
	public static final String $iv_service_exec_flg = "iv_service_exec_flg";
	/**
	 * Amount calculation 金額計算.<p>
	 *
	 */
	public static final String $amt_calc_flg = "amt_calc_flg";


	public static final MCMeta hdr_peg_no_META = createCommonMeta($hdr_peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta data_crud_typ_META = createCommonMeta($data_crud_typ, mcframe.commonMA.meta.MA_META.DATA_CRUD_TYP);
	public static final MCMeta sls_act_no_META = createCommonMeta($sls_act_no, mcframe.commonMA.meta.MA_META.SLS_ACT_NO);
	public static final MCMeta sls_act_seq_META = createCommonMeta($sls_act_seq, mcframe.commonMA.meta.MA_META.SLIP_SEQ);
	public static final MCMeta sls_act_rev_META = createCommonMeta($sls_act_rev, mcframe.commonMA.meta.MA_META.SLIP_REV);
	public static final MCMeta trd_cd_META = createCommonMeta($trd_cd, mcframe.commonMA.meta.MA_META.TRD_CD);
	public static final MCMeta trd_ptn_typ_META = createCommonMeta($trd_ptn_typ, mcframe.commonMA.meta.MA_META.TRD_PTN_TYP);
	public static final MCMeta ac_dt_META = createCommonMeta($ac_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta can_ac_dt_META = createCommonMeta($can_ac_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta sls_usr_cd_META = createCommonMeta($sls_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta sls_dpt_cd_META = createCommonMeta($sls_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta sls_dt_META = createCommonMeta($sls_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta ship_tm_META = createCommonMeta($ship_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta dlv_tm_META = createCommonMeta($dlv_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta trnspt_cd_META = createCommonMeta($trnspt_cd, mcframe.commonMA.meta.MA_META.TRNSPT_CD);
	public static final MCMeta vssl_flght_META = createCommonMeta($vssl_flght, mcframe.commonMA.meta.MA_META.VSSL_FLGHT);
	public static final MCMeta load_port_cd_META = createCommonMeta($load_port_cd, mcframe.commonMA.meta.MA_META.PORT_CD);
	public static final MCMeta etd_dt_META = createCommonMeta($etd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta dschrg_port_cd_META = createCommonMeta($dschrg_port_cd, mcframe.commonMA.meta.MA_META.PORT_CD);
	public static final MCMeta eta_dt_META = createCommonMeta($eta_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta via_port_cd_META = createCommonMeta($via_port_cd, mcframe.commonMA.meta.MA_META.PORT_CD);
	public static final MCMeta via_schd_dt_META = createCommonMeta($via_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta iv_tterm_cd1_META = createCommonMeta($iv_tterm_cd1, mcframe.commonMA.meta.MA_META.TTERM_CD);
	public static final MCMeta iv_tterm_rmrks1_META = createCommonMeta($iv_tterm_rmrks1, mcframe.commonMS.meta.MS_META.TTERM_RMRKS1);
	public static final MCMeta iv_tterm_cd2_META = createCommonMeta($iv_tterm_cd2, mcframe.commonMA.meta.MA_META.TTERM_CD);
	public static final MCMeta iv_tterm_rmrks2_META = createCommonMeta($iv_tterm_rmrks2, mcframe.commonMS.meta.MS_META.TTERM_RMRKS2);
	public static final MCMeta iv_tterm_cd3_META = createCommonMeta($iv_tterm_cd3, mcframe.commonMA.meta.MA_META.TTERM_CD);
	public static final MCMeta iv_tterm_rmrks3_META = createCommonMeta($iv_tterm_rmrks3, mcframe.commonMS.meta.MS_META.TTERM_RMRKS3);
	public static final MCMeta cst_cd_META = createCommonMeta($cst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta cst_iv_flg_META = createCommonMeta($cst_iv_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta iv_src_typ_META = createCommonMeta($iv_src_typ, mcframe.commonMS.meta.MS_META.IV_SRC_TYP);
	public static final MCMeta iv_mng_no_META = createCommonMeta($iv_mng_no, mcframe.commonMA.meta.MA_META.IV_MNG_NO);
	public static final MCMeta iv_no_META = createCommonMeta($iv_no, mcframe.commonMA.meta.MA_META.IV_NO);
	public static final MCMeta iv_rev_META = createCommonMeta($iv_rev, mcframe.commonMA.meta.MA_META.SLIP_REV);
	public static final MCMeta ref_iv_no_META = createCommonMeta($ref_iv_no, mcframe.commonMA.meta.MA_META.IV_NO);
	public static final MCMeta rcpt_iv_mng_no_META = createCommonMeta($rcpt_iv_mng_no, mcframe.commonMA.meta.MA_META.RCPT_IV_MNG_NO);
	public static final MCMeta rcpt_iv_no_META = createCommonMeta($rcpt_iv_no, mcframe.commonMA.meta.MA_META.IV_NO);
	public static final MCMeta num_flg_META = createCommonMeta($num_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta iv_dt_META = createCommonMeta($iv_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta pl_skip_flg_META = createCommonMeta($pl_skip_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta iv_immed_prnt_flg_META = createCommonMeta($iv_immed_prnt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta iv_rmrks_META = createCommonMeta($iv_rmrks, mcframe.commonMS.meta.MS_META.IV_RMRKS);
	public static final MCMeta case_mrk1_META = createCommonMeta($case_mrk1, mcframe.commonMS.meta.MS_META.CASE_MRK);
	public static final MCMeta case_mrk2_META = createCommonMeta($case_mrk2, mcframe.commonMS.meta.MS_META.CASE_MRK);
	public static final MCMeta case_mrk3_META = createCommonMeta($case_mrk3, mcframe.commonMS.meta.MS_META.CASE_MRK);
	public static final MCMeta case_mrk4_META = createCommonMeta($case_mrk4, mcframe.commonMS.meta.MS_META.CASE_MRK);
	public static final MCMeta case_mrk5_META = createCommonMeta($case_mrk5, mcframe.commonMS.meta.MS_META.CASE_MRK);
	public static final MCMeta case_mrk6_META = createCommonMeta($case_mrk6, mcframe.commonMS.meta.MS_META.CASE_MRK);
	public static final MCMeta iv_intr_rmrks_META = createCommonMeta($iv_intr_rmrks, mcframe.commonMS.meta.MS_META.IV_INTR_RMRKS);
	public static final MCMeta iv_sub_char1_META = createCommonMeta($iv_sub_char1, mcframe.commonMS.meta.MS_META.IV_SUB_CHAR1);
	public static final MCMeta iv_sub_char2_META = createCommonMeta($iv_sub_char2, mcframe.commonMS.meta.MS_META.IV_SUB_CHAR2);
	public static final MCMeta iv_sub_char3_META = createCommonMeta($iv_sub_char3, mcframe.commonMS.meta.MS_META.IV_SUB_CHAR3);
	public static final MCMeta del_all_sls_d_flg_META = createCommonMeta($del_all_sls_d_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta tterm_cd1_META = createCommonMeta($tterm_cd1, mcframe.commonMA.meta.MA_META.TTERM_CD);
	public static final MCMeta tterm_rmrks1_META = createCommonMeta($tterm_rmrks1, mcframe.commonMS.meta.MS_META.TTERM_RMRKS1);
	public static final MCMeta tterm_cd2_META = createCommonMeta($tterm_cd2, mcframe.commonMA.meta.MA_META.TTERM_CD);
	public static final MCMeta tterm_rmrks2_META = createCommonMeta($tterm_rmrks2, mcframe.commonMS.meta.MS_META.TTERM_RMRKS2);
	public static final MCMeta tterm_cd3_META = createCommonMeta($tterm_cd3, mcframe.commonMA.meta.MA_META.TTERM_CD);
	public static final MCMeta tterm_rmrks3_META = createCommonMeta($tterm_rmrks3, mcframe.commonMS.meta.MS_META.TTERM_RMRKS3);
	public static final MCMeta lc_no_META = createCommonMeta($lc_no, mcframe.commonMA.meta.MA_META.LC_NO);
	public static final MCMeta lc_dt_META = createCommonMeta($lc_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta lc_rmrks_META = createCommonMeta($lc_rmrks, mcframe.commonMS.meta.MS_META.LC_RMRKS);
	public static final MCMeta bl_no_META = createCommonMeta($bl_no, mcframe.commonMA.meta.MA_META.BL_NO);
	public static final MCMeta bl_dt_META = createCommonMeta($bl_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta bl_rmrks_META = createCommonMeta($bl_rmrks, mcframe.commonMS.meta.MS_META.BL_RMRKS);
	public static final MCMeta rcv_schd_dt_META = createCommonMeta($rcv_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta bill_basis_dt_META = createCommonMeta($bill_basis_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta cred_cd_META = createCommonMeta($cred_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta bcst_cd_META = createCommonMeta($bcst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta acst_cd_META = createCommonMeta($acst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta ar_dpt_cd_META = createCommonMeta($ar_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta ap_dpt_cd_META = createCommonMeta($ap_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta cst_po_no_META = createCommonMeta($cst_po_no, mcframe.commonMA.meta.MA_META.CST_PO_NO);
	public static final MCMeta trd_cur_cd_META = createCommonMeta($trd_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta base_cur_cd_META = createCommonMeta($base_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta xrate_cd_META = createCommonMeta($xrate_cd, mcframe.commonMA.meta.MA_META.XRATE_CD);
	public static final MCMeta xrate_META = createCommonMeta($xrate, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta ptax_cur_cd_META = createCommonMeta($ptax_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta ptax_xrate_META = createCommonMeta($ptax_xrate, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta trd_rmrks_META = createCommonMeta($trd_rmrks, mcframe.commonMA.meta.MA_META.TRD_RMRKS);
	public static final MCMeta intr_rmrks_META = createCommonMeta($intr_rmrks, mcframe.commonMS.meta.MS_META.SLS_ACT_INTR_RMRKS);
	public static final MCMeta ship_act_no_META = createCommonMeta($ship_act_no, mcframe.commonMA.meta.MA_META.SHIP_ACT_NO);
	public static final MCMeta slo_no_META = createCommonMeta($slo_no, mcframe.commonMA.meta.MA_META.SLO_NO);
	public static final MCMeta sls_ret_schd_no_META = createCommonMeta($sls_ret_schd_no, mcframe.commonMA.meta.MA_META.SLS_RET_SCHD_NO);
	public static final MCMeta qtn_no_META = createCommonMeta($qtn_no, mcframe.commonMA.meta.MA_META.QTN_NO);
	public static final MCMeta qtn_rev_META = createCommonMeta($qtn_rev, mcframe.commonMA.meta.MA_META.SLIP_REV);
	public static final MCMeta dlv_slip_no_META = createCommonMeta($dlv_slip_no, mcframe.commonMA.meta.MA_META.DLV_SLIP_NO);
	public static final MCMeta aprv_flg_META = createCommonMeta($aprv_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta aprv_no_META = createCommonMeta($aprv_no, mcframe.commonMA.meta.MA_META.APRV_NO);
	public static final MCMeta aprv_sts_typ_META = createCommonMeta($aprv_sts_typ, mcframe.commonMA.meta.MA_META.APRV_STS_TYP);
	public static final MCMeta sls_basis_typ_META = createCommonMeta($sls_basis_typ, mcframe.commonMA.meta.MA_META.SLS_BASIS_TYP);
	public static final MCMeta adjst_tgt_dt_META = createCommonMeta($adjst_tgt_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta sls_adjst_typ_META = createCommonMeta($sls_adjst_typ, mcframe.commonMS.meta.MS_META.SLS_ADJST_TYP);
	public static final MCMeta adjst_mtd_typ_META = createCommonMeta($adjst_mtd_typ, mcframe.commonMS.meta.MS_META.ADJST_MTD_TYP);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.SLS_ACT_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.SLS_ACT_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.SLS_ACT_SUB_CHAR3);
	public static final MCMeta dlv_slip_prnt_flg_META = createCommonMeta($dlv_slip_prnt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ship_act_service_via_flg_META = createCommonMeta($ship_act_service_via_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta slip_split_non_flg_META = createCommonMeta($slip_split_non_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ship_act_service_exec_flg_META = createCommonMeta($ship_act_service_exec_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta lot_chk_off_flg_META = createCommonMeta($lot_chk_off_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sls_dtl_mod_flg_META = createCommonMeta($sls_dtl_mod_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta no_cred_upd_flg_META = createCommonMeta($no_cred_upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ship_act_sync_flg_META = createCommonMeta($ship_act_sync_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta new_hdr_peg_no_META = createCommonMeta($new_hdr_peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta hdr_dlv_cd_META = createCommonMeta($hdr_dlv_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta hdr_dlv_sundry_flg_META = createCommonMeta($hdr_dlv_sundry_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta hdr_dlv_nm_META = createCommonMeta($hdr_dlv_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta hdr_dlv_zip_cd_META = createCommonMeta($hdr_dlv_zip_cd, mcframe.commonMA.meta.MA_META.ZIP_CD);
	public static final MCMeta hdr_dlv_addr1_META = createCommonMeta($hdr_dlv_addr1, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta hdr_dlv_addr2_META = createCommonMeta($hdr_dlv_addr2, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta hdr_dlv_addr3_META = createCommonMeta($hdr_dlv_addr3, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta hdr_dlv_addr4_META = createCommonMeta($hdr_dlv_addr4, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta hdr_dlv_cntct_dpt_META = createCommonMeta($hdr_dlv_cntct_dpt, mcframe.commonMA.meta.MA_META.BP_CNTCT_DPT);
	public static final MCMeta hdr_dlv_cntct_psn_META = createCommonMeta($hdr_dlv_cntct_psn, mcframe.commonMA.meta.MA_META.BP_CNTCT_PSN);
	public static final MCMeta hdr_dlv_tel_META = createCommonMeta($hdr_dlv_tel, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta hdr_dlv_fax_META = createCommonMeta($hdr_dlv_fax, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta hdr_tax_rate_META = createCommonMeta($hdr_tax_rate, mcframe.commonMA.meta.MA_META.TAX_RATE);
	public static final MCMeta slip_form_cd_META = createCommonMeta($slip_form_cd, mcframe.commonMA.meta.MA_META.SLIP_FORM_CD);
	public static final MCMeta trd_cur_amt_META = createCommonMeta($trd_cur_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta trd_cur_tax_amt_META = createCommonMeta($trd_cur_tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_amt_META = createCommonMeta($base_cur_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_tax_amt_META = createCommonMeta($base_cur_tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta trd_cur_upri_dec_place_META = createCommonMeta($trd_cur_upri_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta trd_cur_amt_dec_place_META = createCommonMeta($trd_cur_amt_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta base_cur_upri_dec_place_META = createCommonMeta($base_cur_upri_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta base_cur_amt_dec_place_META = createCommonMeta($base_cur_amt_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta ptax_cur_upri_dec_place_META = createCommonMeta($ptax_cur_upri_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta ptax_cur_amt_dec_place_META = createCommonMeta($ptax_cur_amt_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta xrate_rnd_typ_META = createCommonMeta($xrate_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta amt_rnd_typ_META = createCommonMeta($amt_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta tax_rnd_typ_META = createCommonMeta($tax_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta slip_sts_typ_META = createCommonMeta($slip_sts_typ, mcframe.commonMA.meta.MA_META.SLIP_STS_TYP);
	public static final MCMeta ac_ym_META = createCommonMeta($ac_ym, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta dlv_slip_seq_META = createCommonMeta($dlv_slip_seq, mcframe.commonMA.meta.MA_META.SLIP_SEQ);
	public static final MCMeta dlv_slip_rev_META = createCommonMeta($dlv_slip_rev, mcframe.commonMA.meta.MA_META.SLIP_REV);
	public static final MCMeta bef_dlv_slip_no_META = createCommonMeta($bef_dlv_slip_no, mcframe.commonMA.meta.MA_META.DLV_SLIP_NO);
	public static final MCMeta bef_iv_no_META = createCommonMeta($bef_iv_no, mcframe.commonMA.meta.MA_META.IV_NO);
	public static final MCMeta bef_aprv_flg_META = createCommonMeta($bef_aprv_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ddlv_sls_flg_META = createCommonMeta($ddlv_sls_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bill_cl_typ_META = createCommonMeta($bill_cl_typ, mcframe.commonMA.meta.MA_META.BILL_CL_TYP);
	public static final MCMeta ship_lg_grp_cd_META = createCommonMeta($ship_lg_grp_cd, mcframe.commonMA.meta.MA_META.LG_GRP_CD);
	public static final MCMeta edi_flg_META = createCommonMeta($edi_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ship_dlv_slip_no_META = createCommonMeta($ship_dlv_slip_no, mcframe.commonMA.meta.MA_META.DLV_SLIP_NO);
	public static final MCMeta purc_ddlv_dlv_slip_no_META = createCommonMeta($purc_ddlv_dlv_slip_no, mcframe.commonMA.meta.MA_META.DLV_SLIP_NO);
	public static final MCMeta iv_upd_cntr_META = createCommonMeta($iv_upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);
	public static final MCMeta iv_service_exec_flg_META = createCommonMeta($iv_service_exec_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta amt_calc_flg_META = createCommonMeta($amt_calc_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<SlsAct_Upd01_HdrR> constMetas = new ConstMetaList<SlsAct_Upd01_HdrR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			hdr_peg_no_META,
			data_crud_typ_META,
			sls_act_no_META,
			sls_act_seq_META,
			sls_act_rev_META,
			trd_cd_META,
			trd_ptn_typ_META,
			ac_dt_META,
			can_ac_dt_META,
			sls_usr_cd_META,
			sls_dpt_cd_META,
			wg_cd_META,
			sls_dt_META,
			ship_tm_META,
			dlv_tm_META,
			trnspt_cd_META,
			vssl_flght_META,
			load_port_cd_META,
			etd_dt_META,
			dschrg_port_cd_META,
			eta_dt_META,
			via_port_cd_META,
			via_schd_dt_META,
			iv_tterm_cd1_META,
			iv_tterm_rmrks1_META,
			iv_tterm_cd2_META,
			iv_tterm_rmrks2_META,
			iv_tterm_cd3_META,
			iv_tterm_rmrks3_META,
			cst_cd_META,
			cst_iv_flg_META,
			iv_src_typ_META,
			iv_mng_no_META,
			iv_no_META,
			iv_rev_META,
			ref_iv_no_META,
			rcpt_iv_mng_no_META,
			rcpt_iv_no_META,
			num_flg_META,
			iv_dt_META,
			pl_skip_flg_META,
			iv_immed_prnt_flg_META,
			iv_rmrks_META,
			case_mrk1_META,
			case_mrk2_META,
			case_mrk3_META,
			case_mrk4_META,
			case_mrk5_META,
			case_mrk6_META,
			iv_intr_rmrks_META,
			iv_sub_char1_META,
			iv_sub_char2_META,
			iv_sub_char3_META,
			del_all_sls_d_flg_META,
			tterm_cd1_META,
			tterm_rmrks1_META,
			tterm_cd2_META,
			tterm_rmrks2_META,
			tterm_cd3_META,
			tterm_rmrks3_META,
			lc_no_META,
			lc_dt_META,
			lc_rmrks_META,
			bl_no_META,
			bl_dt_META,
			bl_rmrks_META,
			rcv_schd_dt_META,
			bill_basis_dt_META,
			cred_cd_META,
			bcst_cd_META,
			acst_cd_META,
			ar_dpt_cd_META,
			ap_dpt_cd_META,
			cst_po_no_META,
			trd_cur_cd_META,
			base_cur_cd_META,
			xrate_cd_META,
			xrate_META,
			ptax_cur_cd_META,
			ptax_xrate_META,
			trd_rmrks_META,
			intr_rmrks_META,
			ship_act_no_META,
			slo_no_META,
			sls_ret_schd_no_META,
			qtn_no_META,
			qtn_rev_META,
			dlv_slip_no_META,
			aprv_flg_META,
			aprv_no_META,
			aprv_sts_typ_META,
			sls_basis_typ_META,
			adjst_tgt_dt_META,
			sls_adjst_typ_META,
			adjst_mtd_typ_META,
			sub_char1_META,
			sub_char2_META,
			sub_char3_META,
			dlv_slip_prnt_flg_META,
			ship_act_service_via_flg_META,
			slip_split_non_flg_META,
			ship_act_service_exec_flg_META,
			lot_chk_off_flg_META,
			sls_dtl_mod_flg_META,
			no_cred_upd_flg_META,
			ship_act_sync_flg_META,
			new_hdr_peg_no_META,
			hdr_dlv_cd_META,
			hdr_dlv_sundry_flg_META,
			hdr_dlv_nm_META,
			hdr_dlv_zip_cd_META,
			hdr_dlv_addr1_META,
			hdr_dlv_addr2_META,
			hdr_dlv_addr3_META,
			hdr_dlv_addr4_META,
			hdr_dlv_cntct_dpt_META,
			hdr_dlv_cntct_psn_META,
			hdr_dlv_tel_META,
			hdr_dlv_fax_META,
			hdr_tax_rate_META,
			slip_form_cd_META,
			trd_cur_amt_META,
			trd_cur_tax_amt_META,
			base_cur_amt_META,
			base_cur_tax_amt_META,
			trd_cur_upri_dec_place_META,
			trd_cur_amt_dec_place_META,
			base_cur_upri_dec_place_META,
			base_cur_amt_dec_place_META,
			ptax_cur_upri_dec_place_META,
			ptax_cur_amt_dec_place_META,
			xrate_rnd_typ_META,
			amt_rnd_typ_META,
			tax_rnd_typ_META,
			slip_sts_typ_META,
			ac_ym_META,
			dlv_slip_seq_META,
			dlv_slip_rev_META,
			bef_dlv_slip_no_META,
			bef_iv_no_META,
			bef_aprv_flg_META,
			ddlv_sls_flg_META,
			bill_cl_typ_META,
			ship_lg_grp_cd_META,
			edi_flg_META,
			ship_dlv_slip_no_META,
			purc_ddlv_dlv_slip_no_META,
			iv_upd_cntr_META,
			iv_service_exec_flg_META,
			amt_calc_flg_META
		},
		new String[][]{
			{
			},
			{
			}
		}
	);


	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null
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
	protected SlsAct_Upd01_HdrR_MC_A(ConstMetaList<? extends SlsAct_Upd01_HdrR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public SlsAct_Upd01_HdrR clone() {
		return (SlsAct_Upd01_HdrR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public SlsAct_Upd01_HdrR createInstance() {
		return (SlsAct_Upd01_HdrR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public SlsAct_Upd01_HdrR getValues(String... names) {
		return (SlsAct_Upd01_HdrR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public MCNumber hdr_peg_no() {
		return getConstNumber(offset + 0, $hdr_peg_no);
	}

	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public void hdr_peg_no(MCNumber value) {
		setConstNumber(offset + 0, $hdr_peg_no, value);
	}

	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public void hdr_peg_no(int value) {
		setConstNumber(offset + 0, $hdr_peg_no, value);
	}

	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public void hdr_peg_no(long value) {
		setConstNumber(offset + 0, $hdr_peg_no, value);
	}

	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public void hdr_peg_no(float value) {
		setConstNumber(offset + 0, $hdr_peg_no, value);
	}

	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public void hdr_peg_no(double value) {
		setConstNumber(offset + 0, $hdr_peg_no, value);
	}


	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public String data_crud_typ() {
		return getConstString(offset + 1, $data_crud_typ);
	}

	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public void data_crud_typ(String value) {
		setConstString(offset + 1, $data_crud_typ, value);
	}


	/**
	 * Sales result No. 売上実績ＮＯ.<p>
	 *
	 */
	public String sls_act_no() {
		return getConstString(offset + 2, $sls_act_no);
	}

	/**
	 * Sales result No. 売上実績ＮＯ.<p>
	 *
	 */
	public void sls_act_no(String value) {
		setConstString(offset + 2, $sls_act_no, value);
	}


	/**
	 * Sales result sequence number 売上実績連番.<p>
	 *
	 */
	public MCNumber sls_act_seq() {
		return getConstNumber(offset + 3, $sls_act_seq);
	}

	/**
	 * Sales result sequence number 売上実績連番.<p>
	 *
	 */
	public void sls_act_seq(MCNumber value) {
		setConstNumber(offset + 3, $sls_act_seq, value);
	}

	/**
	 * Sales result sequence number 売上実績連番.<p>
	 *
	 */
	public void sls_act_seq(int value) {
		setConstNumber(offset + 3, $sls_act_seq, value);
	}

	/**
	 * Sales result sequence number 売上実績連番.<p>
	 *
	 */
	public void sls_act_seq(long value) {
		setConstNumber(offset + 3, $sls_act_seq, value);
	}

	/**
	 * Sales result sequence number 売上実績連番.<p>
	 *
	 */
	public void sls_act_seq(float value) {
		setConstNumber(offset + 3, $sls_act_seq, value);
	}

	/**
	 * Sales result sequence number 売上実績連番.<p>
	 *
	 */
	public void sls_act_seq(double value) {
		setConstNumber(offset + 3, $sls_act_seq, value);
	}


	/**
	 * Sales result rev. number 売上実績改訂番号.<p>
	 *
	 */
	public MCNumber sls_act_rev() {
		return getConstNumber(offset + 4, $sls_act_rev);
	}

	/**
	 * Sales result rev. number 売上実績改訂番号.<p>
	 *
	 */
	public void sls_act_rev(MCNumber value) {
		setConstNumber(offset + 4, $sls_act_rev, value);
	}

	/**
	 * Sales result rev. number 売上実績改訂番号.<p>
	 *
	 */
	public void sls_act_rev(int value) {
		setConstNumber(offset + 4, $sls_act_rev, value);
	}

	/**
	 * Sales result rev. number 売上実績改訂番号.<p>
	 *
	 */
	public void sls_act_rev(long value) {
		setConstNumber(offset + 4, $sls_act_rev, value);
	}

	/**
	 * Sales result rev. number 売上実績改訂番号.<p>
	 *
	 */
	public void sls_act_rev(float value) {
		setConstNumber(offset + 4, $sls_act_rev, value);
	}

	/**
	 * Sales result rev. number 売上実績改訂番号.<p>
	 *
	 */
	public void sls_act_rev(double value) {
		setConstNumber(offset + 4, $sls_act_rev, value);
	}


	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public String trd_cd() {
		return getConstString(offset + 5, $trd_cd);
	}

	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public void trd_cd(String value) {
		setConstString(offset + 5, $trd_cd, value);
	}


	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public String trd_ptn_typ() {
		return getConstString(offset + 6, $trd_ptn_typ);
	}

	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public void trd_ptn_typ(String value) {
		setConstString(offset + 6, $trd_ptn_typ, value);
	}


	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public MCDate ac_dt() {
		return getConstDate(offset + 7, $ac_dt);
	}

	/**
	 * Recording date 計上日.<p>
	 *
	 */
	public void ac_dt(MCDate value) {
		setConstDate(offset + 7, $ac_dt, value);
	}


	/**
	 * Cancellation recording date 取消計上日.<p>
	 *
	 */
	public MCDate can_ac_dt() {
		return getConstDate(offset + 8, $can_ac_dt);
	}

	/**
	 * Cancellation recording date 取消計上日.<p>
	 *
	 */
	public void can_ac_dt(MCDate value) {
		setConstDate(offset + 8, $can_ac_dt, value);
	}


	/**
	 * Sales PIC cd. 売上担当者ＣＤ.<p>
	 *
	 */
	public String sls_usr_cd() {
		return getConstString(offset + 9, $sls_usr_cd);
	}

	/**
	 * Sales PIC cd. 売上担当者ＣＤ.<p>
	 *
	 */
	public void sls_usr_cd(String value) {
		setConstString(offset + 9, $sls_usr_cd, value);
	}


	/**
	 * Sales dept. cd. 売上部門ＣＤ.<p>
	 *
	 */
	public String sls_dpt_cd() {
		return getConstString(offset + 10, $sls_dpt_cd);
	}

	/**
	 * Sales dept. cd. 売上部門ＣＤ.<p>
	 *
	 */
	public void sls_dpt_cd(String value) {
		setConstString(offset + 10, $sls_dpt_cd, value);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 11, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 11, $wg_cd, value);
	}


	/**
	 * Sales date 売上日.<p>
	 *
	 */
	public MCDate sls_dt() {
		return getConstDate(offset + 12, $sls_dt);
	}

	/**
	 * Sales date 売上日.<p>
	 *
	 */
	public void sls_dt(MCDate value) {
		setConstDate(offset + 12, $sls_dt, value);
	}


	/**
	 * Shipping date and time 出荷日時.<p>
	 *
	 */
	public MCDate ship_tm() {
		return getConstDate(offset + 13, $ship_tm);
	}

	/**
	 * Shipping date and time 出荷日時.<p>
	 *
	 */
	public void ship_tm(MCDate value) {
		setConstDate(offset + 13, $ship_tm, value);
	}


	/**
	 * Delivery date and time 納品日時.<p>
	 *
	 */
	public MCDate dlv_tm() {
		return getConstDate(offset + 14, $dlv_tm);
	}

	/**
	 * Delivery date and time 納品日時.<p>
	 *
	 */
	public void dlv_tm(MCDate value) {
		setConstDate(offset + 14, $dlv_tm, value);
	}


	/**
	 * Transportation method cd. 輸送方法ＣＤ.<p>
	 *
	 */
	public String trnspt_cd() {
		return getConstString(offset + 15, $trnspt_cd);
	}

	/**
	 * Transportation method cd. 輸送方法ＣＤ.<p>
	 *
	 */
	public void trnspt_cd(String value) {
		setConstString(offset + 15, $trnspt_cd, value);
	}


	/**
	 * Ship/flight name 船名／便名.<p>
	 *
	 */
	public String vssl_flght() {
		return getConstString(offset + 16, $vssl_flght);
	}

	/**
	 * Ship/flight name 船名／便名.<p>
	 *
	 */
	public void vssl_flght(String value) {
		setConstString(offset + 16, $vssl_flght, value);
	}


	/**
	 * Loading port cd. 船積港ＣＤ.<p>
	 *
	 */
	public String load_port_cd() {
		return getConstString(offset + 17, $load_port_cd);
	}

	/**
	 * Loading port cd. 船積港ＣＤ.<p>
	 *
	 */
	public void load_port_cd(String value) {
		setConstString(offset + 17, $load_port_cd, value);
	}


	/**
	 * Estimated date of loading 船積予定日.<p>
	 *
	 */
	public MCDate etd_dt() {
		return getConstDate(offset + 18, $etd_dt);
	}

	/**
	 * Estimated date of loading 船積予定日.<p>
	 *
	 */
	public void etd_dt(MCDate value) {
		setConstDate(offset + 18, $etd_dt, value);
	}


	/**
	 * Unloading port cd. 船卸港ＣＤ.<p>
	 *
	 */
	public String dschrg_port_cd() {
		return getConstString(offset + 19, $dschrg_port_cd);
	}

	/**
	 * Unloading port cd. 船卸港ＣＤ.<p>
	 *
	 */
	public void dschrg_port_cd(String value) {
		setConstString(offset + 19, $dschrg_port_cd, value);
	}


	/**
	 * Estimated date of unloading 船卸予定日.<p>
	 *
	 */
	public MCDate eta_dt() {
		return getConstDate(offset + 20, $eta_dt);
	}

	/**
	 * Estimated date of unloading 船卸予定日.<p>
	 *
	 */
	public void eta_dt(MCDate value) {
		setConstDate(offset + 20, $eta_dt, value);
	}


	/**
	 * Stopover point cd. 経由地ＣＤ.<p>
	 *
	 */
	public String via_port_cd() {
		return getConstString(offset + 21, $via_port_cd);
	}

	/**
	 * Stopover point cd. 経由地ＣＤ.<p>
	 *
	 */
	public void via_port_cd(String value) {
		setConstString(offset + 21, $via_port_cd, value);
	}


	/**
	 * Estimated stopover date 経由予定日.<p>
	 *
	 */
	public MCDate via_schd_dt() {
		return getConstDate(offset + 22, $via_schd_dt);
	}

	/**
	 * Estimated stopover date 経由予定日.<p>
	 *
	 */
	public void via_schd_dt(MCDate value) {
		setConstDate(offset + 22, $via_schd_dt, value);
	}


	/**
	 * Transaction terms cd. 取引条件ＣＤ.<p>
	 *
	 */
	public String iv_tterm_cd1() {
		return getConstString(offset + 23, $iv_tterm_cd1);
	}

	/**
	 * Transaction terms cd. 取引条件ＣＤ.<p>
	 *
	 */
	public void iv_tterm_cd1(String value) {
		setConstString(offset + 23, $iv_tterm_cd1, value);
	}


	/**
	 * Transaction terms remarks 取引条件備考.<p>
	 *
	 */
	public String iv_tterm_rmrks1() {
		return getConstString(offset + 24, $iv_tterm_rmrks1);
	}

	/**
	 * Transaction terms remarks 取引条件備考.<p>
	 *
	 */
	public void iv_tterm_rmrks1(String value) {
		setConstString(offset + 24, $iv_tterm_rmrks1, value);
	}


	/**
	 * Delivery location cd. 受渡場所ＣＤ.<p>
	 *
	 */
	public String iv_tterm_cd2() {
		return getConstString(offset + 25, $iv_tterm_cd2);
	}

	/**
	 * Delivery location cd. 受渡場所ＣＤ.<p>
	 *
	 */
	public void iv_tterm_cd2(String value) {
		setConstString(offset + 25, $iv_tterm_cd2, value);
	}


	/**
	 * Delivery location remarks 受渡場所備考.<p>
	 *
	 */
	public String iv_tterm_rmrks2() {
		return getConstString(offset + 26, $iv_tterm_rmrks2);
	}

	/**
	 * Delivery location remarks 受渡場所備考.<p>
	 *
	 */
	public void iv_tterm_rmrks2(String value) {
		setConstString(offset + 26, $iv_tterm_rmrks2, value);
	}


	/**
	 * Payment terms cd. 支払条件ＣＤ.<p>
	 *
	 */
	public String iv_tterm_cd3() {
		return getConstString(offset + 27, $iv_tterm_cd3);
	}

	/**
	 * Payment terms cd. 支払条件ＣＤ.<p>
	 *
	 */
	public void iv_tterm_cd3(String value) {
		setConstString(offset + 27, $iv_tterm_cd3, value);
	}


	/**
	 * Payment terms remarks 支払条件備考.<p>
	 *
	 */
	public String iv_tterm_rmrks3() {
		return getConstString(offset + 28, $iv_tterm_rmrks3);
	}

	/**
	 * Payment terms remarks 支払条件備考.<p>
	 *
	 */
	public void iv_tterm_rmrks3(String value) {
		setConstString(offset + 28, $iv_tterm_rmrks3, value);
	}


	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public String cst_cd() {
		return getConstString(offset + 29, $cst_cd);
	}

	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public void cst_cd(String value) {
		setConstString(offset + 29, $cst_cd, value);
	}


	/**
	 * Customer invoice transaction 得意先インボイス取引.<p>
	 *
	 */
	public boolean cst_iv_flg() {
		return getConstBoolean(offset + 30, $cst_iv_flg);
	}

	/**
	 * Customer invoice transaction 得意先インボイス取引.<p>
	 *
	 */
	public void cst_iv_flg(boolean value) {
		setConstBoolean(offset + 30, $cst_iv_flg, value);
	}


	/**
	 * Invoice creating source type インボイス作成元区分.<p>
	 *
	 */
	public String iv_src_typ() {
		return getConstString(offset + 31, $iv_src_typ);
	}

	/**
	 * Invoice creating source type インボイス作成元区分.<p>
	 *
	 */
	public void iv_src_typ(String value) {
		setConstString(offset + 31, $iv_src_typ, value);
	}


	/**
	 * Invoice management No. インボイス管理ＮＯ.<p>
	 *
	 */
	public String iv_mng_no() {
		return getConstString(offset + 32, $iv_mng_no);
	}

	/**
	 * Invoice management No. インボイス管理ＮＯ.<p>
	 *
	 */
	public void iv_mng_no(String value) {
		setConstString(offset + 32, $iv_mng_no, value);
	}


	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public String iv_no() {
		return getConstString(offset + 33, $iv_no);
	}

	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public void iv_no(String value) {
		setConstString(offset + 33, $iv_no, value);
	}


	/**
	 * Invoice rev. number インボイス改訂番号.<p>
	 *
	 */
	public MCNumber iv_rev() {
		return getConstNumber(offset + 34, $iv_rev);
	}

	/**
	 * Invoice rev. number インボイス改訂番号.<p>
	 *
	 */
	public void iv_rev(MCNumber value) {
		setConstNumber(offset + 34, $iv_rev, value);
	}

	/**
	 * Invoice rev. number インボイス改訂番号.<p>
	 *
	 */
	public void iv_rev(int value) {
		setConstNumber(offset + 34, $iv_rev, value);
	}

	/**
	 * Invoice rev. number インボイス改訂番号.<p>
	 *
	 */
	public void iv_rev(long value) {
		setConstNumber(offset + 34, $iv_rev, value);
	}

	/**
	 * Invoice rev. number インボイス改訂番号.<p>
	 *
	 */
	public void iv_rev(float value) {
		setConstNumber(offset + 34, $iv_rev, value);
	}

	/**
	 * Invoice rev. number インボイス改訂番号.<p>
	 *
	 */
	public void iv_rev(double value) {
		setConstNumber(offset + 34, $iv_rev, value);
	}


	/**
	 * Corresponding I/V No. 対応インボイスＮＯ.<p>
	 *
	 */
	public String ref_iv_no() {
		return getConstString(offset + 35, $ref_iv_no);
	}

	/**
	 * Corresponding I/V No. 対応インボイスＮＯ.<p>
	 *
	 */
	public void ref_iv_no(String value) {
		setConstString(offset + 35, $ref_iv_no, value);
	}


	/**
	 * Purchase invoice management No. 受領インボイス管理ＮＯ.<p>
	 *
	 */
	public String rcpt_iv_mng_no() {
		return getConstString(offset + 36, $rcpt_iv_mng_no);
	}

	/**
	 * Purchase invoice management No. 受領インボイス管理ＮＯ.<p>
	 *
	 */
	public void rcpt_iv_mng_no(String value) {
		setConstString(offset + 36, $rcpt_iv_mng_no, value);
	}


	/**
	 * Purchase invoice No. 受領インボイスＮＯ.<p>
	 *
	 */
	public String rcpt_iv_no() {
		return getConstString(offset + 37, $rcpt_iv_no);
	}

	/**
	 * Purchase invoice No. 受領インボイスＮＯ.<p>
	 *
	 */
	public void rcpt_iv_no(String value) {
		setConstString(offset + 37, $rcpt_iv_no, value);
	}


	/**
	 * Auto 自動.<p>
	 *
	 */
	public boolean num_flg() {
		return getConstBoolean(offset + 38, $num_flg);
	}

	/**
	 * Auto 自動.<p>
	 *
	 */
	public void num_flg(boolean value) {
		setConstBoolean(offset + 38, $num_flg, value);
	}


	/**
	 * Invoice date インボイス日付.<p>
	 *
	 */
	public MCDate iv_dt() {
		return getConstDate(offset + 39, $iv_dt);
	}

	/**
	 * Invoice date インボイス日付.<p>
	 *
	 */
	public void iv_dt(MCDate value) {
		setConstDate(offset + 39, $iv_dt, value);
	}


	/**
	 * Omit packing list パッキングリスト省略.<p>
	 *
	 */
	public boolean pl_skip_flg() {
		return getConstBoolean(offset + 40, $pl_skip_flg);
	}

	/**
	 * Omit packing list パッキングリスト省略.<p>
	 *
	 */
	public void pl_skip_flg(boolean value) {
		setConstBoolean(offset + 40, $pl_skip_flg, value);
	}


	/**
	 * Invoice immediate issue インボイス即時発行.<p>
	 *
	 */
	public boolean iv_immed_prnt_flg() {
		return getConstBoolean(offset + 41, $iv_immed_prnt_flg);
	}

	/**
	 * Invoice immediate issue インボイス即時発行.<p>
	 *
	 */
	public void iv_immed_prnt_flg(boolean value) {
		setConstBoolean(offset + 41, $iv_immed_prnt_flg, value);
	}


	/**
	 * Invoice remarks インボイス備考.<p>
	 *
	 */
	public String iv_rmrks() {
		return getConstString(offset + 42, $iv_rmrks);
	}

	/**
	 * Invoice remarks インボイス備考.<p>
	 *
	 */
	public void iv_rmrks(String value) {
		setConstString(offset + 42, $iv_rmrks, value);
	}


	/**
	 * Case mark 1 ケースマーク１.<p>
	 *
	 */
	public String case_mrk1() {
		return getConstString(offset + 43, $case_mrk1);
	}

	/**
	 * Case mark 1 ケースマーク１.<p>
	 *
	 */
	public void case_mrk1(String value) {
		setConstString(offset + 43, $case_mrk1, value);
	}


	/**
	 * Case mark 2 ケースマーク２.<p>
	 *
	 */
	public String case_mrk2() {
		return getConstString(offset + 44, $case_mrk2);
	}

	/**
	 * Case mark 2 ケースマーク２.<p>
	 *
	 */
	public void case_mrk2(String value) {
		setConstString(offset + 44, $case_mrk2, value);
	}


	/**
	 * Case mark 3 ケースマーク３.<p>
	 *
	 */
	public String case_mrk3() {
		return getConstString(offset + 45, $case_mrk3);
	}

	/**
	 * Case mark 3 ケースマーク３.<p>
	 *
	 */
	public void case_mrk3(String value) {
		setConstString(offset + 45, $case_mrk3, value);
	}


	/**
	 * Case mark 4 ケースマーク４.<p>
	 *
	 */
	public String case_mrk4() {
		return getConstString(offset + 46, $case_mrk4);
	}

	/**
	 * Case mark 4 ケースマーク４.<p>
	 *
	 */
	public void case_mrk4(String value) {
		setConstString(offset + 46, $case_mrk4, value);
	}


	/**
	 * Case mark 5 ケースマーク５.<p>
	 *
	 */
	public String case_mrk5() {
		return getConstString(offset + 47, $case_mrk5);
	}

	/**
	 * Case mark 5 ケースマーク５.<p>
	 *
	 */
	public void case_mrk5(String value) {
		setConstString(offset + 47, $case_mrk5, value);
	}


	/**
	 * Case mark 6 ケースマーク６.<p>
	 *
	 */
	public String case_mrk6() {
		return getConstString(offset + 48, $case_mrk6);
	}

	/**
	 * Case mark 6 ケースマーク６.<p>
	 *
	 */
	public void case_mrk6(String value) {
		setConstString(offset + 48, $case_mrk6, value);
	}


	/**
	 * Invoice internal remarks インボイス内部備考.<p>
	 *
	 */
	public String iv_intr_rmrks() {
		return getConstString(offset + 49, $iv_intr_rmrks);
	}

	/**
	 * Invoice internal remarks インボイス内部備考.<p>
	 *
	 */
	public void iv_intr_rmrks(String value) {
		setConstString(offset + 49, $iv_intr_rmrks, value);
	}


	/**
	 * Invoice spare 1 インボイス予備１.<p>
	 *
	 */
	public String iv_sub_char1() {
		return getConstString(offset + 50, $iv_sub_char1);
	}

	/**
	 * Invoice spare 1 インボイス予備１.<p>
	 *
	 */
	public void iv_sub_char1(String value) {
		setConstString(offset + 50, $iv_sub_char1, value);
	}


	/**
	 * Invoice spare 2 インボイス予備２.<p>
	 *
	 */
	public String iv_sub_char2() {
		return getConstString(offset + 51, $iv_sub_char2);
	}

	/**
	 * Invoice spare 2 インボイス予備２.<p>
	 *
	 */
	public void iv_sub_char2(String value) {
		setConstString(offset + 51, $iv_sub_char2, value);
	}


	/**
	 * Invoice spare 3 インボイス予備３.<p>
	 *
	 */
	public String iv_sub_char3() {
		return getConstString(offset + 52, $iv_sub_char3);
	}

	/**
	 * Invoice spare 3 インボイス予備３.<p>
	 *
	 */
	public void iv_sub_char3(String value) {
		setConstString(offset + 52, $iv_sub_char3, value);
	}


	/**
	 * Delete rows of all details linked to sales header 売上ヘッダに紐づく全明細を行削除.<p>
	 *
	 */
	public boolean del_all_sls_d_flg() {
		return getConstBoolean(offset + 53, $del_all_sls_d_flg);
	}

	/**
	 * Delete rows of all details linked to sales header 売上ヘッダに紐づく全明細を行削除.<p>
	 *
	 */
	public void del_all_sls_d_flg(boolean value) {
		setConstBoolean(offset + 53, $del_all_sls_d_flg, value);
	}


	/**
	 * Transaction terms cd. 1 取引条件ＣＤ１.<p>
	 *
	 */
	public String tterm_cd1() {
		return getConstString(offset + 54, $tterm_cd1);
	}

	/**
	 * Transaction terms cd. 1 取引条件ＣＤ１.<p>
	 *
	 */
	public void tterm_cd1(String value) {
		setConstString(offset + 54, $tterm_cd1, value);
	}


	/**
	 * Transaction terms remarks 1 取引条件備考１.<p>
	 *
	 */
	public String tterm_rmrks1() {
		return getConstString(offset + 55, $tterm_rmrks1);
	}

	/**
	 * Transaction terms remarks 1 取引条件備考１.<p>
	 *
	 */
	public void tterm_rmrks1(String value) {
		setConstString(offset + 55, $tterm_rmrks1, value);
	}


	/**
	 * Transaction terms cd. 2 取引条件ＣＤ２.<p>
	 *
	 */
	public String tterm_cd2() {
		return getConstString(offset + 56, $tterm_cd2);
	}

	/**
	 * Transaction terms cd. 2 取引条件ＣＤ２.<p>
	 *
	 */
	public void tterm_cd2(String value) {
		setConstString(offset + 56, $tterm_cd2, value);
	}


	/**
	 * Transaction terms remarks 2 取引条件備考２.<p>
	 *
	 */
	public String tterm_rmrks2() {
		return getConstString(offset + 57, $tterm_rmrks2);
	}

	/**
	 * Transaction terms remarks 2 取引条件備考２.<p>
	 *
	 */
	public void tterm_rmrks2(String value) {
		setConstString(offset + 57, $tterm_rmrks2, value);
	}


	/**
	 * Transaction terms cd. 3 取引条件ＣＤ３.<p>
	 *
	 */
	public String tterm_cd3() {
		return getConstString(offset + 58, $tterm_cd3);
	}

	/**
	 * Transaction terms cd. 3 取引条件ＣＤ３.<p>
	 *
	 */
	public void tterm_cd3(String value) {
		setConstString(offset + 58, $tterm_cd3, value);
	}


	/**
	 * Transaction terms remarks 3 取引条件備考３.<p>
	 *
	 */
	public String tterm_rmrks3() {
		return getConstString(offset + 59, $tterm_rmrks3);
	}

	/**
	 * Transaction terms remarks 3 取引条件備考３.<p>
	 *
	 */
	public void tterm_rmrks3(String value) {
		setConstString(offset + 59, $tterm_rmrks3, value);
	}


	/**
	 * L/C No. Ｌ／ＣＮＯ.<p>
	 *
	 */
	public String lc_no() {
		return getConstString(offset + 60, $lc_no);
	}

	/**
	 * L/C No. Ｌ／ＣＮＯ.<p>
	 *
	 */
	public void lc_no(String value) {
		setConstString(offset + 60, $lc_no, value);
	}


	/**
	 * L/C Date Ｌ／Ｃ日付.<p>
	 *
	 */
	public MCDate lc_dt() {
		return getConstDate(offset + 61, $lc_dt);
	}

	/**
	 * L/C Date Ｌ／Ｃ日付.<p>
	 *
	 */
	public void lc_dt(MCDate value) {
		setConstDate(offset + 61, $lc_dt, value);
	}


	/**
	 * L/C remarks Ｌ／Ｃ備考.<p>
	 *
	 */
	public String lc_rmrks() {
		return getConstString(offset + 62, $lc_rmrks);
	}

	/**
	 * L/C remarks Ｌ／Ｃ備考.<p>
	 *
	 */
	public void lc_rmrks(String value) {
		setConstString(offset + 62, $lc_rmrks, value);
	}


	/**
	 * B/L No. Ｂ／ＬＮＯ.<p>
	 *
	 */
	public String bl_no() {
		return getConstString(offset + 63, $bl_no);
	}

	/**
	 * B/L No. Ｂ／ＬＮＯ.<p>
	 *
	 */
	public void bl_no(String value) {
		setConstString(offset + 63, $bl_no, value);
	}


	/**
	 * B/L date Ｂ／Ｌ日付.<p>
	 *
	 */
	public MCDate bl_dt() {
		return getConstDate(offset + 64, $bl_dt);
	}

	/**
	 * B/L date Ｂ／Ｌ日付.<p>
	 *
	 */
	public void bl_dt(MCDate value) {
		setConstDate(offset + 64, $bl_dt, value);
	}


	/**
	 * B/L remarks Ｂ／Ｌ備考.<p>
	 *
	 */
	public String bl_rmrks() {
		return getConstString(offset + 65, $bl_rmrks);
	}

	/**
	 * B/L remarks Ｂ／Ｌ備考.<p>
	 *
	 */
	public void bl_rmrks(String value) {
		setConstString(offset + 65, $bl_rmrks, value);
	}


	/**
	 * Scheduled payment receipt date 入金予定日.<p>
	 *
	 */
	public MCDate rcv_schd_dt() {
		return getConstDate(offset + 66, $rcv_schd_dt);
	}

	/**
	 * Scheduled payment receipt date 入金予定日.<p>
	 *
	 */
	public void rcv_schd_dt(MCDate value) {
		setConstDate(offset + 66, $rcv_schd_dt, value);
	}


	/**
	 * Billing base date 請求起算日.<p>
	 *
	 */
	public MCDate bill_basis_dt() {
		return getConstDate(offset + 67, $bill_basis_dt);
	}

	/**
	 * Billing base date 請求起算日.<p>
	 *
	 */
	public void bill_basis_dt(MCDate value) {
		setConstDate(offset + 67, $bill_basis_dt, value);
	}


	/**
	 * Credit managed BP cd. 与信管理先ＣＤ.<p>
	 *
	 */
	public String cred_cd() {
		return getConstString(offset + 68, $cred_cd);
	}

	/**
	 * Credit managed BP cd. 与信管理先ＣＤ.<p>
	 *
	 */
	public void cred_cd(String value) {
		setConstString(offset + 68, $cred_cd, value);
	}


	/**
	 * Billing customer cd. 請求先ＣＤ.<p>
	 *
	 */
	public String bcst_cd() {
		return getConstString(offset + 69, $bcst_cd);
	}

	/**
	 * Billing customer cd. 請求先ＣＤ.<p>
	 *
	 */
	public void bcst_cd(String value) {
		setConstString(offset + 69, $bcst_cd, value);
	}


	/**
	 * AR customer cd. 売掛先ＣＤ.<p>
	 *
	 */
	public String acst_cd() {
		return getConstString(offset + 70, $acst_cd);
	}

	/**
	 * AR customer cd. 売掛先ＣＤ.<p>
	 *
	 */
	public void acst_cd(String value) {
		setConstString(offset + 70, $acst_cd, value);
	}


	/**
	 * AR dept. cd. 債権部門ＣＤ.<p>
	 *
	 */
	public String ar_dpt_cd() {
		return getConstString(offset + 71, $ar_dpt_cd);
	}

	/**
	 * AR dept. cd. 債権部門ＣＤ.<p>
	 *
	 */
	public void ar_dpt_cd(String value) {
		setConstString(offset + 71, $ar_dpt_cd, value);
	}


	/**
	 * AP dept. cd. 債務部門ＣＤ.<p>
	 *
	 */
	public String ap_dpt_cd() {
		return getConstString(offset + 72, $ap_dpt_cd);
	}

	/**
	 * AP dept. cd. 債務部門ＣＤ.<p>
	 *
	 */
	public void ap_dpt_cd(String value) {
		setConstString(offset + 72, $ap_dpt_cd, value);
	}


	/**
	 * Customer order No. 得意先注文ＮＯ.<p>
	 *
	 */
	public String cst_po_no() {
		return getConstString(offset + 73, $cst_po_no);
	}

	/**
	 * Customer order No. 得意先注文ＮＯ.<p>
	 *
	 */
	public void cst_po_no(String value) {
		setConstString(offset + 73, $cst_po_no, value);
	}


	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public String trd_cur_cd() {
		return getConstString(offset + 74, $trd_cur_cd);
	}

	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public void trd_cur_cd(String value) {
		setConstString(offset + 74, $trd_cur_cd, value);
	}


	/**
	 * Base currency cd. 基準通貨ＣＤ.<p>
	 *
	 */
	public String base_cur_cd() {
		return getConstString(offset + 75, $base_cur_cd);
	}

	/**
	 * Base currency cd. 基準通貨ＣＤ.<p>
	 *
	 */
	public void base_cur_cd(String value) {
		setConstString(offset + 75, $base_cur_cd, value);
	}


	/**
	 * Exchange rate cd. 為替レートＣＤ.<p>
	 *
	 */
	public String xrate_cd() {
		return getConstString(offset + 76, $xrate_cd);
	}

	/**
	 * Exchange rate cd. 為替レートＣＤ.<p>
	 *
	 */
	public void xrate_cd(String value) {
		setConstString(offset + 76, $xrate_cd, value);
	}


	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public MCNumber xrate() {
		return getConstNumber(offset + 77, $xrate);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(MCNumber value) {
		setConstNumber(offset + 77, $xrate, value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(int value) {
		setConstNumber(offset + 77, $xrate, value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(long value) {
		setConstNumber(offset + 77, $xrate, value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(float value) {
		setConstNumber(offset + 77, $xrate, value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(double value) {
		setConstNumber(offset + 77, $xrate, value);
	}


	/**
	 * Taxpaying currency cd. 納税通貨ＣＤ.<p>
	 *
	 */
	public String ptax_cur_cd() {
		return getConstString(offset + 78, $ptax_cur_cd);
	}

	/**
	 * Taxpaying currency cd. 納税通貨ＣＤ.<p>
	 *
	 */
	public void ptax_cur_cd(String value) {
		setConstString(offset + 78, $ptax_cur_cd, value);
	}


	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public MCNumber ptax_xrate() {
		return getConstNumber(offset + 79, $ptax_xrate);
	}

	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public void ptax_xrate(MCNumber value) {
		setConstNumber(offset + 79, $ptax_xrate, value);
	}

	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public void ptax_xrate(int value) {
		setConstNumber(offset + 79, $ptax_xrate, value);
	}

	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public void ptax_xrate(long value) {
		setConstNumber(offset + 79, $ptax_xrate, value);
	}

	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public void ptax_xrate(float value) {
		setConstNumber(offset + 79, $ptax_xrate, value);
	}

	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public void ptax_xrate(double value) {
		setConstNumber(offset + 79, $ptax_xrate, value);
	}


	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public String trd_rmrks() {
		return getConstString(offset + 80, $trd_rmrks);
	}

	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public void trd_rmrks(String value) {
		setConstString(offset + 80, $trd_rmrks, value);
	}


	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public String intr_rmrks() {
		return getConstString(offset + 81, $intr_rmrks);
	}

	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public void intr_rmrks(String value) {
		setConstString(offset + 81, $intr_rmrks, value);
	}


	/**
	 * Shipping result No. 出荷実績ＮＯ.<p>
	 *
	 */
	public String ship_act_no() {
		return getConstString(offset + 82, $ship_act_no);
	}

	/**
	 * Shipping result No. 出荷実績ＮＯ.<p>
	 *
	 */
	public void ship_act_no(String value) {
		setConstString(offset + 82, $ship_act_no, value);
	}


	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public String slo_no() {
		return getConstString(offset + 83, $slo_no);
	}

	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public void slo_no(String value) {
		setConstString(offset + 83, $slo_no, value);
	}


	/**
	 * Sales return schedule No. 売上返品予定ＮＯ.<p>
	 *
	 */
	public String sls_ret_schd_no() {
		return getConstString(offset + 84, $sls_ret_schd_no);
	}

	/**
	 * Sales return schedule No. 売上返品予定ＮＯ.<p>
	 *
	 */
	public void sls_ret_schd_no(String value) {
		setConstString(offset + 84, $sls_ret_schd_no, value);
	}


	/**
	 * Quotation No. 見積ＮＯ.<p>
	 *
	 */
	public String qtn_no() {
		return getConstString(offset + 85, $qtn_no);
	}

	/**
	 * Quotation No. 見積ＮＯ.<p>
	 *
	 */
	public void qtn_no(String value) {
		setConstString(offset + 85, $qtn_no, value);
	}


	/**
	 * Quotation rev. number 見積改訂番号.<p>
	 *
	 */
	public MCNumber qtn_rev() {
		return getConstNumber(offset + 86, $qtn_rev);
	}

	/**
	 * Quotation rev. number 見積改訂番号.<p>
	 *
	 */
	public void qtn_rev(MCNumber value) {
		setConstNumber(offset + 86, $qtn_rev, value);
	}

	/**
	 * Quotation rev. number 見積改訂番号.<p>
	 *
	 */
	public void qtn_rev(int value) {
		setConstNumber(offset + 86, $qtn_rev, value);
	}

	/**
	 * Quotation rev. number 見積改訂番号.<p>
	 *
	 */
	public void qtn_rev(long value) {
		setConstNumber(offset + 86, $qtn_rev, value);
	}

	/**
	 * Quotation rev. number 見積改訂番号.<p>
	 *
	 */
	public void qtn_rev(float value) {
		setConstNumber(offset + 86, $qtn_rev, value);
	}

	/**
	 * Quotation rev. number 見積改訂番号.<p>
	 *
	 */
	public void qtn_rev(double value) {
		setConstNumber(offset + 86, $qtn_rev, value);
	}


	/**
	 * Delivery note No. 納品書ＮＯ.<p>
	 *
	 */
	public String dlv_slip_no() {
		return getConstString(offset + 87, $dlv_slip_no);
	}

	/**
	 * Delivery note No. 納品書ＮＯ.<p>
	 *
	 */
	public void dlv_slip_no(String value) {
		setConstString(offset + 87, $dlv_slip_no, value);
	}


	/**
	 * For Approval 承認対象.<p>
	 *
	 */
	public boolean aprv_flg() {
		return getConstBoolean(offset + 88, $aprv_flg);
	}

	/**
	 * For Approval 承認対象.<p>
	 *
	 */
	public void aprv_flg(boolean value) {
		setConstBoolean(offset + 88, $aprv_flg, value);
	}


	/**
	 * Approval No. 承認ＮＯ.<p>
	 *
	 */
	public String aprv_no() {
		return getConstString(offset + 89, $aprv_no);
	}

	/**
	 * Approval No. 承認ＮＯ.<p>
	 *
	 */
	public void aprv_no(String value) {
		setConstString(offset + 89, $aprv_no, value);
	}


	/**
	 * Approval status type 承認状況区分.<p>
	 *
	 */
	public String aprv_sts_typ() {
		return getConstString(offset + 90, $aprv_sts_typ);
	}

	/**
	 * Approval status type 承認状況区分.<p>
	 *
	 */
	public void aprv_sts_typ(String value) {
		setConstString(offset + 90, $aprv_sts_typ, value);
	}


	/**
	 * Revenue recording type 売上計上区分.<p>
	 *
	 */
	public String sls_basis_typ() {
		return getConstString(offset + 91, $sls_basis_typ);
	}

	/**
	 * Revenue recording type 売上計上区分.<p>
	 *
	 */
	public void sls_basis_typ(String value) {
		setConstString(offset + 91, $sls_basis_typ, value);
	}


	/**
	 * Adjustment required date 調整対象日.<p>
	 *
	 */
	public MCDate adjst_tgt_dt() {
		return getConstDate(offset + 92, $adjst_tgt_dt);
	}

	/**
	 * Adjustment required date 調整対象日.<p>
	 *
	 */
	public void adjst_tgt_dt(MCDate value) {
		setConstDate(offset + 92, $adjst_tgt_dt, value);
	}


	/**
	 * Sales adjustment type 売上調整区分.<p>
	 *
	 */
	public String sls_adjst_typ() {
		return getConstString(offset + 93, $sls_adjst_typ);
	}

	/**
	 * Sales adjustment type 売上調整区分.<p>
	 *
	 */
	public void sls_adjst_typ(String value) {
		setConstString(offset + 93, $sls_adjst_typ, value);
	}


	/**
	 * Adjustment method type 調整方法区分.<p>
	 *
	 */
	public String adjst_mtd_typ() {
		return getConstString(offset + 94, $adjst_mtd_typ);
	}

	/**
	 * Adjustment method type 調整方法区分.<p>
	 *
	 */
	public void adjst_mtd_typ(String value) {
		setConstString(offset + 94, $adjst_mtd_typ, value);
	}


	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 95, $sub_char1);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 95, $sub_char1, value);
	}


	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 96, $sub_char2);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 96, $sub_char2, value);
	}


	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 97, $sub_char3);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 97, $sub_char3, value);
	}


	/**
	 * Delivery note immediate issue 納品書即時発行.<p>
	 *
	 */
	public boolean dlv_slip_prnt_flg() {
		return getConstBoolean(offset + 98, $dlv_slip_prnt_flg);
	}

	/**
	 * Delivery note immediate issue 納品書即時発行.<p>
	 *
	 */
	public void dlv_slip_prnt_flg(boolean value) {
		setConstBoolean(offset + 98, $dlv_slip_prnt_flg, value);
	}


	/**
	 * Via shipping result service 出荷実績サービス経由.<p>
	 *
	 */
	public boolean ship_act_service_via_flg() {
		return getConstBoolean(offset + 99, $ship_act_service_via_flg);
	}

	/**
	 * Via shipping result service 出荷実績サービス経由.<p>
	 *
	 */
	public void ship_act_service_via_flg(boolean value) {
		setConstBoolean(offset + 99, $ship_act_service_via_flg, value);
	}


	/**
	 * Slip split unnecessary 伝票分割不要.<p>
	 *
	 */
	public boolean slip_split_non_flg() {
		return getConstBoolean(offset + 100, $slip_split_non_flg);
	}

	/**
	 * Slip split unnecessary 伝票分割不要.<p>
	 *
	 */
	public void slip_split_non_flg(boolean value) {
		setConstBoolean(offset + 100, $slip_split_non_flg, value);
	}


	/**
	 * Execute shipping result service 出荷実績サービス実行.<p>
	 *
	 */
	public boolean ship_act_service_exec_flg() {
		return getConstBoolean(offset + 101, $ship_act_service_exec_flg);
	}

	/**
	 * Execute shipping result service 出荷実績サービス実行.<p>
	 *
	 */
	public void ship_act_service_exec_flg(boolean value) {
		setConstBoolean(offset + 101, $ship_act_service_exec_flg, value);
	}


	/**
	 * Ignore lot check ロットチェック無視.<p>
	 *
	 */
	public boolean lot_chk_off_flg() {
		return getConstBoolean(offset + 102, $lot_chk_off_flg);
	}

	/**
	 * Ignore lot check ロットチェック無視.<p>
	 *
	 */
	public void lot_chk_off_flg(boolean value) {
		setConstBoolean(offset + 102, $lot_chk_off_flg, value);
	}


	/**
	 * Correction of sales details 売上明細訂正.<p>
	 *
	 */
	public boolean sls_dtl_mod_flg() {
		return getConstBoolean(offset + 103, $sls_dtl_mod_flg);
	}

	/**
	 * Correction of sales details 売上明細訂正.<p>
	 *
	 */
	public void sls_dtl_mod_flg(boolean value) {
		setConstBoolean(offset + 103, $sls_dtl_mod_flg, value);
	}


	/**
	 * No credit update required 与信更新不要.<p>
	 *
	 */
	public boolean no_cred_upd_flg() {
		return getConstBoolean(offset + 104, $no_cred_upd_flg);
	}

	/**
	 * No credit update required 与信更新不要.<p>
	 *
	 */
	public void no_cred_upd_flg(boolean value) {
		setConstBoolean(offset + 104, $no_cred_upd_flg, value);
	}


	/**
	 * Shipping result simultaneously recording 出荷実績同時計上.<p>
	 *
	 */
	public boolean ship_act_sync_flg() {
		return getConstBoolean(offset + 105, $ship_act_sync_flg);
	}

	/**
	 * Shipping result simultaneously recording 出荷実績同時計上.<p>
	 *
	 */
	public void ship_act_sync_flg(boolean value) {
		setConstBoolean(offset + 105, $ship_act_sync_flg, value);
	}


	/**
	 * New header pegging No. 新ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public MCNumber new_hdr_peg_no() {
		return getConstNumber(offset + 106, $new_hdr_peg_no);
	}

	/**
	 * New header pegging No. 新ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public void new_hdr_peg_no(MCNumber value) {
		setConstNumber(offset + 106, $new_hdr_peg_no, value);
	}

	/**
	 * New header pegging No. 新ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public void new_hdr_peg_no(int value) {
		setConstNumber(offset + 106, $new_hdr_peg_no, value);
	}

	/**
	 * New header pegging No. 新ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public void new_hdr_peg_no(long value) {
		setConstNumber(offset + 106, $new_hdr_peg_no, value);
	}

	/**
	 * New header pegging No. 新ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public void new_hdr_peg_no(float value) {
		setConstNumber(offset + 106, $new_hdr_peg_no, value);
	}

	/**
	 * New header pegging No. 新ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public void new_hdr_peg_no(double value) {
		setConstNumber(offset + 106, $new_hdr_peg_no, value);
	}


	/**
	 * Header delivery destination cd. ヘッダ納品先ＣＤ.<p>
	 *
	 */
	public String hdr_dlv_cd() {
		return getConstString(offset + 107, $hdr_dlv_cd);
	}

	/**
	 * Header delivery destination cd. ヘッダ納品先ＣＤ.<p>
	 *
	 */
	public void hdr_dlv_cd(String value) {
		setConstString(offset + 107, $hdr_dlv_cd, value);
	}


	/**
	 * Miscellaneous header delivery destination ヘッダ納品先諸口.<p>
	 *
	 */
	public boolean hdr_dlv_sundry_flg() {
		return getConstBoolean(offset + 108, $hdr_dlv_sundry_flg);
	}

	/**
	 * Miscellaneous header delivery destination ヘッダ納品先諸口.<p>
	 *
	 */
	public void hdr_dlv_sundry_flg(boolean value) {
		setConstBoolean(offset + 108, $hdr_dlv_sundry_flg, value);
	}


	/**
	 * Header delivery destination name ヘッダ納品先名.<p>
	 *
	 */
	public String hdr_dlv_nm() {
		return getConstString(offset + 109, $hdr_dlv_nm);
	}

	/**
	 * Header delivery destination name ヘッダ納品先名.<p>
	 *
	 */
	public void hdr_dlv_nm(String value) {
		setConstString(offset + 109, $hdr_dlv_nm, value);
	}


	/**
	 * Header delivery destination zip code ヘッダ納品先郵便番号.<p>
	 *
	 */
	public String hdr_dlv_zip_cd() {
		return getConstString(offset + 110, $hdr_dlv_zip_cd);
	}

	/**
	 * Header delivery destination zip code ヘッダ納品先郵便番号.<p>
	 *
	 */
	public void hdr_dlv_zip_cd(String value) {
		setConstString(offset + 110, $hdr_dlv_zip_cd, value);
	}


	/**
	 * Heading delivery destination address 1 ヘッダ納品先住所１.<p>
	 *
	 */
	public String hdr_dlv_addr1() {
		return getConstString(offset + 111, $hdr_dlv_addr1);
	}

	/**
	 * Heading delivery destination address 1 ヘッダ納品先住所１.<p>
	 *
	 */
	public void hdr_dlv_addr1(String value) {
		setConstString(offset + 111, $hdr_dlv_addr1, value);
	}


	/**
	 * Heading delivery destination address 2 ヘッダ納品先住所２.<p>
	 *
	 */
	public String hdr_dlv_addr2() {
		return getConstString(offset + 112, $hdr_dlv_addr2);
	}

	/**
	 * Heading delivery destination address 2 ヘッダ納品先住所２.<p>
	 *
	 */
	public void hdr_dlv_addr2(String value) {
		setConstString(offset + 112, $hdr_dlv_addr2, value);
	}


	/**
	 * Heading delivery destination address 3 ヘッダ納品先住所３.<p>
	 *
	 */
	public String hdr_dlv_addr3() {
		return getConstString(offset + 113, $hdr_dlv_addr3);
	}

	/**
	 * Heading delivery destination address 3 ヘッダ納品先住所３.<p>
	 *
	 */
	public void hdr_dlv_addr3(String value) {
		setConstString(offset + 113, $hdr_dlv_addr3, value);
	}


	/**
	 * Heading delivery destination address 4 ヘッダ納品先住所４.<p>
	 *
	 */
	public String hdr_dlv_addr4() {
		return getConstString(offset + 114, $hdr_dlv_addr4);
	}

	/**
	 * Heading delivery destination address 4 ヘッダ納品先住所４.<p>
	 *
	 */
	public void hdr_dlv_addr4(String value) {
		setConstString(offset + 114, $hdr_dlv_addr4, value);
	}


	/**
	 * Header delivery destination dept. ヘッダ納品先部署.<p>
	 *
	 */
	public String hdr_dlv_cntct_dpt() {
		return getConstString(offset + 115, $hdr_dlv_cntct_dpt);
	}

	/**
	 * Header delivery destination dept. ヘッダ納品先部署.<p>
	 *
	 */
	public void hdr_dlv_cntct_dpt(String value) {
		setConstString(offset + 115, $hdr_dlv_cntct_dpt, value);
	}


	/**
	 * Header delivery destination PIC ヘッダ納品先担当者.<p>
	 *
	 */
	public String hdr_dlv_cntct_psn() {
		return getConstString(offset + 116, $hdr_dlv_cntct_psn);
	}

	/**
	 * Header delivery destination PIC ヘッダ納品先担当者.<p>
	 *
	 */
	public void hdr_dlv_cntct_psn(String value) {
		setConstString(offset + 116, $hdr_dlv_cntct_psn, value);
	}


	/**
	 * Header delivery destination TEL ヘッダ納品先ＴＥＬ.<p>
	 *
	 */
	public String hdr_dlv_tel() {
		return getConstString(offset + 117, $hdr_dlv_tel);
	}

	/**
	 * Header delivery destination TEL ヘッダ納品先ＴＥＬ.<p>
	 *
	 */
	public void hdr_dlv_tel(String value) {
		setConstString(offset + 117, $hdr_dlv_tel, value);
	}


	/**
	 * Header delivery destination FAX ヘッダ納品先ＦＡＸ.<p>
	 *
	 */
	public String hdr_dlv_fax() {
		return getConstString(offset + 118, $hdr_dlv_fax);
	}

	/**
	 * Header delivery destination FAX ヘッダ納品先ＦＡＸ.<p>
	 *
	 */
	public void hdr_dlv_fax(String value) {
		setConstString(offset + 118, $hdr_dlv_fax, value);
	}


	/**
	 * Header tax rate ヘッダ税率.<p>
	 *
	 */
	public MCNumber hdr_tax_rate() {
		return getConstNumber(offset + 119, $hdr_tax_rate);
	}

	/**
	 * Header tax rate ヘッダ税率.<p>
	 *
	 */
	public void hdr_tax_rate(MCNumber value) {
		setConstNumber(offset + 119, $hdr_tax_rate, value);
	}

	/**
	 * Header tax rate ヘッダ税率.<p>
	 *
	 */
	public void hdr_tax_rate(int value) {
		setConstNumber(offset + 119, $hdr_tax_rate, value);
	}

	/**
	 * Header tax rate ヘッダ税率.<p>
	 *
	 */
	public void hdr_tax_rate(long value) {
		setConstNumber(offset + 119, $hdr_tax_rate, value);
	}

	/**
	 * Header tax rate ヘッダ税率.<p>
	 *
	 */
	public void hdr_tax_rate(float value) {
		setConstNumber(offset + 119, $hdr_tax_rate, value);
	}

	/**
	 * Header tax rate ヘッダ税率.<p>
	 *
	 */
	public void hdr_tax_rate(double value) {
		setConstNumber(offset + 119, $hdr_tax_rate, value);
	}


	/**
	 * Slip report cd. 伝票帳票ＣＤ.<p>
	 *
	 */
	public String slip_form_cd() {
		return getConstString(offset + 120, $slip_form_cd);
	}

	/**
	 * Slip report cd. 伝票帳票ＣＤ.<p>
	 *
	 */
	public void slip_form_cd(String value) {
		setConstString(offset + 120, $slip_form_cd, value);
	}


	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public MCNumber trd_cur_amt() {
		return getConstNumber(offset + 121, $trd_cur_amt);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(MCNumber value) {
		setConstNumber(offset + 121, $trd_cur_amt, value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(int value) {
		setConstNumber(offset + 121, $trd_cur_amt, value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(long value) {
		setConstNumber(offset + 121, $trd_cur_amt, value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(float value) {
		setConstNumber(offset + 121, $trd_cur_amt, value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(double value) {
		setConstNumber(offset + 121, $trd_cur_amt, value);
	}


	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public MCNumber trd_cur_tax_amt() {
		return getConstNumber(offset + 122, $trd_cur_tax_amt);
	}

	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(MCNumber value) {
		setConstNumber(offset + 122, $trd_cur_tax_amt, value);
	}

	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(int value) {
		setConstNumber(offset + 122, $trd_cur_tax_amt, value);
	}

	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(long value) {
		setConstNumber(offset + 122, $trd_cur_tax_amt, value);
	}

	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(float value) {
		setConstNumber(offset + 122, $trd_cur_tax_amt, value);
	}

	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(double value) {
		setConstNumber(offset + 122, $trd_cur_tax_amt, value);
	}


	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public MCNumber base_cur_amt() {
		return getConstNumber(offset + 123, $base_cur_amt);
	}

	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public void base_cur_amt(MCNumber value) {
		setConstNumber(offset + 123, $base_cur_amt, value);
	}

	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public void base_cur_amt(int value) {
		setConstNumber(offset + 123, $base_cur_amt, value);
	}

	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public void base_cur_amt(long value) {
		setConstNumber(offset + 123, $base_cur_amt, value);
	}

	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public void base_cur_amt(float value) {
		setConstNumber(offset + 123, $base_cur_amt, value);
	}

	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public void base_cur_amt(double value) {
		setConstNumber(offset + 123, $base_cur_amt, value);
	}


	/**
	 * Tax amount (Base currency) 基準通貨税額.<p>
	 *
	 */
	public MCNumber base_cur_tax_amt() {
		return getConstNumber(offset + 124, $base_cur_tax_amt);
	}

	/**
	 * Tax amount (Base currency) 基準通貨税額.<p>
	 *
	 */
	public void base_cur_tax_amt(MCNumber value) {
		setConstNumber(offset + 124, $base_cur_tax_amt, value);
	}

	/**
	 * Tax amount (Base currency) 基準通貨税額.<p>
	 *
	 */
	public void base_cur_tax_amt(int value) {
		setConstNumber(offset + 124, $base_cur_tax_amt, value);
	}

	/**
	 * Tax amount (Base currency) 基準通貨税額.<p>
	 *
	 */
	public void base_cur_tax_amt(long value) {
		setConstNumber(offset + 124, $base_cur_tax_amt, value);
	}

	/**
	 * Tax amount (Base currency) 基準通貨税額.<p>
	 *
	 */
	public void base_cur_tax_amt(float value) {
		setConstNumber(offset + 124, $base_cur_tax_amt, value);
	}

	/**
	 * Tax amount (Base currency) 基準通貨税額.<p>
	 *
	 */
	public void base_cur_tax_amt(double value) {
		setConstNumber(offset + 124, $base_cur_tax_amt, value);
	}


	/**
	 * Transaction currency unit price number of decimal places 取引通貨単価小数部有効桁数.<p>
	 *
	 */
	public MCNumber trd_cur_upri_dec_place() {
		return getConstNumber(offset + 125, $trd_cur_upri_dec_place);
	}

	/**
	 * Transaction currency unit price number of decimal places 取引通貨単価小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_upri_dec_place(MCNumber value) {
		setConstNumber(offset + 125, $trd_cur_upri_dec_place, value);
	}

	/**
	 * Transaction currency unit price number of decimal places 取引通貨単価小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_upri_dec_place(int value) {
		setConstNumber(offset + 125, $trd_cur_upri_dec_place, value);
	}

	/**
	 * Transaction currency unit price number of decimal places 取引通貨単価小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_upri_dec_place(long value) {
		setConstNumber(offset + 125, $trd_cur_upri_dec_place, value);
	}

	/**
	 * Transaction currency unit price number of decimal places 取引通貨単価小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_upri_dec_place(float value) {
		setConstNumber(offset + 125, $trd_cur_upri_dec_place, value);
	}

	/**
	 * Transaction currency unit price number of decimal places 取引通貨単価小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_upri_dec_place(double value) {
		setConstNumber(offset + 125, $trd_cur_upri_dec_place, value);
	}


	/**
	 * Transaction currency amount number of decimal places 取引通貨金額小数部有効桁数.<p>
	 *
	 */
	public MCNumber trd_cur_amt_dec_place() {
		return getConstNumber(offset + 126, $trd_cur_amt_dec_place);
	}

	/**
	 * Transaction currency amount number of decimal places 取引通貨金額小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_amt_dec_place(MCNumber value) {
		setConstNumber(offset + 126, $trd_cur_amt_dec_place, value);
	}

	/**
	 * Transaction currency amount number of decimal places 取引通貨金額小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_amt_dec_place(int value) {
		setConstNumber(offset + 126, $trd_cur_amt_dec_place, value);
	}

	/**
	 * Transaction currency amount number of decimal places 取引通貨金額小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_amt_dec_place(long value) {
		setConstNumber(offset + 126, $trd_cur_amt_dec_place, value);
	}

	/**
	 * Transaction currency amount number of decimal places 取引通貨金額小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_amt_dec_place(float value) {
		setConstNumber(offset + 126, $trd_cur_amt_dec_place, value);
	}

	/**
	 * Transaction currency amount number of decimal places 取引通貨金額小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_amt_dec_place(double value) {
		setConstNumber(offset + 126, $trd_cur_amt_dec_place, value);
	}


	/**
	 * Base currency unit price number of decimal places 基準通貨単価小数部有効桁数.<p>
	 *
	 */
	public MCNumber base_cur_upri_dec_place() {
		return getConstNumber(offset + 127, $base_cur_upri_dec_place);
	}

	/**
	 * Base currency unit price number of decimal places 基準通貨単価小数部有効桁数.<p>
	 *
	 */
	public void base_cur_upri_dec_place(MCNumber value) {
		setConstNumber(offset + 127, $base_cur_upri_dec_place, value);
	}

	/**
	 * Base currency unit price number of decimal places 基準通貨単価小数部有効桁数.<p>
	 *
	 */
	public void base_cur_upri_dec_place(int value) {
		setConstNumber(offset + 127, $base_cur_upri_dec_place, value);
	}

	/**
	 * Base currency unit price number of decimal places 基準通貨単価小数部有効桁数.<p>
	 *
	 */
	public void base_cur_upri_dec_place(long value) {
		setConstNumber(offset + 127, $base_cur_upri_dec_place, value);
	}

	/**
	 * Base currency unit price number of decimal places 基準通貨単価小数部有効桁数.<p>
	 *
	 */
	public void base_cur_upri_dec_place(float value) {
		setConstNumber(offset + 127, $base_cur_upri_dec_place, value);
	}

	/**
	 * Base currency unit price number of decimal places 基準通貨単価小数部有効桁数.<p>
	 *
	 */
	public void base_cur_upri_dec_place(double value) {
		setConstNumber(offset + 127, $base_cur_upri_dec_place, value);
	}


	/**
	 * Base currency amount number of decimal places 基準通貨金額小数部有効桁数.<p>
	 *
	 */
	public MCNumber base_cur_amt_dec_place() {
		return getConstNumber(offset + 128, $base_cur_amt_dec_place);
	}

	/**
	 * Base currency amount number of decimal places 基準通貨金額小数部有効桁数.<p>
	 *
	 */
	public void base_cur_amt_dec_place(MCNumber value) {
		setConstNumber(offset + 128, $base_cur_amt_dec_place, value);
	}

	/**
	 * Base currency amount number of decimal places 基準通貨金額小数部有効桁数.<p>
	 *
	 */
	public void base_cur_amt_dec_place(int value) {
		setConstNumber(offset + 128, $base_cur_amt_dec_place, value);
	}

	/**
	 * Base currency amount number of decimal places 基準通貨金額小数部有効桁数.<p>
	 *
	 */
	public void base_cur_amt_dec_place(long value) {
		setConstNumber(offset + 128, $base_cur_amt_dec_place, value);
	}

	/**
	 * Base currency amount number of decimal places 基準通貨金額小数部有効桁数.<p>
	 *
	 */
	public void base_cur_amt_dec_place(float value) {
		setConstNumber(offset + 128, $base_cur_amt_dec_place, value);
	}

	/**
	 * Base currency amount number of decimal places 基準通貨金額小数部有効桁数.<p>
	 *
	 */
	public void base_cur_amt_dec_place(double value) {
		setConstNumber(offset + 128, $base_cur_amt_dec_place, value);
	}


	/**
	 * Tax currency unit number of decimal places 納税通貨単価小数部有効桁数.<p>
	 *
	 */
	public MCNumber ptax_cur_upri_dec_place() {
		return getConstNumber(offset + 129, $ptax_cur_upri_dec_place);
	}

	/**
	 * Tax currency unit number of decimal places 納税通貨単価小数部有効桁数.<p>
	 *
	 */
	public void ptax_cur_upri_dec_place(MCNumber value) {
		setConstNumber(offset + 129, $ptax_cur_upri_dec_place, value);
	}

	/**
	 * Tax currency unit number of decimal places 納税通貨単価小数部有効桁数.<p>
	 *
	 */
	public void ptax_cur_upri_dec_place(int value) {
		setConstNumber(offset + 129, $ptax_cur_upri_dec_place, value);
	}

	/**
	 * Tax currency unit number of decimal places 納税通貨単価小数部有効桁数.<p>
	 *
	 */
	public void ptax_cur_upri_dec_place(long value) {
		setConstNumber(offset + 129, $ptax_cur_upri_dec_place, value);
	}

	/**
	 * Tax currency unit number of decimal places 納税通貨単価小数部有効桁数.<p>
	 *
	 */
	public void ptax_cur_upri_dec_place(float value) {
		setConstNumber(offset + 129, $ptax_cur_upri_dec_place, value);
	}

	/**
	 * Tax currency unit number of decimal places 納税通貨単価小数部有効桁数.<p>
	 *
	 */
	public void ptax_cur_upri_dec_place(double value) {
		setConstNumber(offset + 129, $ptax_cur_upri_dec_place, value);
	}


	/**
	 * Tax currency amount number of decimal places 納税通貨金額小数部有効桁数.<p>
	 *
	 */
	public MCNumber ptax_cur_amt_dec_place() {
		return getConstNumber(offset + 130, $ptax_cur_amt_dec_place);
	}

	/**
	 * Tax currency amount number of decimal places 納税通貨金額小数部有効桁数.<p>
	 *
	 */
	public void ptax_cur_amt_dec_place(MCNumber value) {
		setConstNumber(offset + 130, $ptax_cur_amt_dec_place, value);
	}

	/**
	 * Tax currency amount number of decimal places 納税通貨金額小数部有効桁数.<p>
	 *
	 */
	public void ptax_cur_amt_dec_place(int value) {
		setConstNumber(offset + 130, $ptax_cur_amt_dec_place, value);
	}

	/**
	 * Tax currency amount number of decimal places 納税通貨金額小数部有効桁数.<p>
	 *
	 */
	public void ptax_cur_amt_dec_place(long value) {
		setConstNumber(offset + 130, $ptax_cur_amt_dec_place, value);
	}

	/**
	 * Tax currency amount number of decimal places 納税通貨金額小数部有効桁数.<p>
	 *
	 */
	public void ptax_cur_amt_dec_place(float value) {
		setConstNumber(offset + 130, $ptax_cur_amt_dec_place, value);
	}

	/**
	 * Tax currency amount number of decimal places 納税通貨金額小数部有効桁数.<p>
	 *
	 */
	public void ptax_cur_amt_dec_place(double value) {
		setConstNumber(offset + 130, $ptax_cur_amt_dec_place, value);
	}


	/**
	 * Exchange rounding type 為替端数処理区分.<p>
	 *
	 */
	public String xrate_rnd_typ() {
		return getConstString(offset + 131, $xrate_rnd_typ);
	}

	/**
	 * Exchange rounding type 為替端数処理区分.<p>
	 *
	 */
	public void xrate_rnd_typ(String value) {
		setConstString(offset + 131, $xrate_rnd_typ, value);
	}


	/**
	 * Rounding type (Amount) 金額端数処理区分.<p>
	 *
	 */
	public String amt_rnd_typ() {
		return getConstString(offset + 132, $amt_rnd_typ);
	}

	/**
	 * Rounding type (Amount) 金額端数処理区分.<p>
	 *
	 */
	public void amt_rnd_typ(String value) {
		setConstString(offset + 132, $amt_rnd_typ, value);
	}


	/**
	 * Tax rounding type 税端数処理区分.<p>
	 *
	 */
	public String tax_rnd_typ() {
		return getConstString(offset + 133, $tax_rnd_typ);
	}

	/**
	 * Tax rounding type 税端数処理区分.<p>
	 *
	 */
	public void tax_rnd_typ(String value) {
		setConstString(offset + 133, $tax_rnd_typ, value);
	}


	/**
	 * Slip status type 伝票状況区分.<p>
	 *
	 */
	public String slip_sts_typ() {
		return getConstString(offset + 134, $slip_sts_typ);
	}

	/**
	 * Slip status type 伝票状況区分.<p>
	 *
	 */
	public void slip_sts_typ(String value) {
		setConstString(offset + 134, $slip_sts_typ, value);
	}


	/**
	 * Recording month 計上年月.<p>
	 *
	 */
	public MCDate ac_ym() {
		return getConstDate(offset + 135, $ac_ym);
	}

	/**
	 * Recording month 計上年月.<p>
	 *
	 */
	public void ac_ym(MCDate value) {
		setConstDate(offset + 135, $ac_ym, value);
	}


	/**
	 * Delivery note sequence number 納品書連番.<p>
	 *
	 */
	public MCNumber dlv_slip_seq() {
		return getConstNumber(offset + 136, $dlv_slip_seq);
	}

	/**
	 * Delivery note sequence number 納品書連番.<p>
	 *
	 */
	public void dlv_slip_seq(MCNumber value) {
		setConstNumber(offset + 136, $dlv_slip_seq, value);
	}

	/**
	 * Delivery note sequence number 納品書連番.<p>
	 *
	 */
	public void dlv_slip_seq(int value) {
		setConstNumber(offset + 136, $dlv_slip_seq, value);
	}

	/**
	 * Delivery note sequence number 納品書連番.<p>
	 *
	 */
	public void dlv_slip_seq(long value) {
		setConstNumber(offset + 136, $dlv_slip_seq, value);
	}

	/**
	 * Delivery note sequence number 納品書連番.<p>
	 *
	 */
	public void dlv_slip_seq(float value) {
		setConstNumber(offset + 136, $dlv_slip_seq, value);
	}

	/**
	 * Delivery note sequence number 納品書連番.<p>
	 *
	 */
	public void dlv_slip_seq(double value) {
		setConstNumber(offset + 136, $dlv_slip_seq, value);
	}


	/**
	 * Delivery note rev. number 納品書改訂番号.<p>
	 *
	 */
	public MCNumber dlv_slip_rev() {
		return getConstNumber(offset + 137, $dlv_slip_rev);
	}

	/**
	 * Delivery note rev. number 納品書改訂番号.<p>
	 *
	 */
	public void dlv_slip_rev(MCNumber value) {
		setConstNumber(offset + 137, $dlv_slip_rev, value);
	}

	/**
	 * Delivery note rev. number 納品書改訂番号.<p>
	 *
	 */
	public void dlv_slip_rev(int value) {
		setConstNumber(offset + 137, $dlv_slip_rev, value);
	}

	/**
	 * Delivery note rev. number 納品書改訂番号.<p>
	 *
	 */
	public void dlv_slip_rev(long value) {
		setConstNumber(offset + 137, $dlv_slip_rev, value);
	}

	/**
	 * Delivery note rev. number 納品書改訂番号.<p>
	 *
	 */
	public void dlv_slip_rev(float value) {
		setConstNumber(offset + 137, $dlv_slip_rev, value);
	}

	/**
	 * Delivery note rev. number 納品書改訂番号.<p>
	 *
	 */
	public void dlv_slip_rev(double value) {
		setConstNumber(offset + 137, $dlv_slip_rev, value);
	}


	/**
	 * Leading delivery note No. 先行納品書ＮＯ.<p>
	 *
	 */
	public String bef_dlv_slip_no() {
		return getConstString(offset + 138, $bef_dlv_slip_no);
	}

	/**
	 * Leading delivery note No. 先行納品書ＮＯ.<p>
	 *
	 */
	public void bef_dlv_slip_no(String value) {
		setConstString(offset + 138, $bef_dlv_slip_no, value);
	}


	/**
	 * Leading invoice No. 先行インボイスＮＯ.<p>
	 *
	 */
	public String bef_iv_no() {
		return getConstString(offset + 139, $bef_iv_no);
	}

	/**
	 * Leading invoice No. 先行インボイスＮＯ.<p>
	 *
	 */
	public void bef_iv_no(String value) {
		setConstString(offset + 139, $bef_iv_no, value);
	}


	/**
	 * Approval target before correction 訂正前承認対象.<p>
	 *
	 */
	public boolean bef_aprv_flg() {
		return getConstBoolean(offset + 140, $bef_aprv_flg);
	}

	/**
	 * Approval target before correction 訂正前承認対象.<p>
	 *
	 */
	public void bef_aprv_flg(boolean value) {
		setConstBoolean(offset + 140, $bef_aprv_flg, value);
	}


	/**
	 * Direct-delivery sales 直送売上.<p>
	 *
	 */
	public boolean ddlv_sls_flg() {
		return getConstBoolean(offset + 141, $ddlv_sls_flg);
	}

	/**
	 * Direct-delivery sales 直送売上.<p>
	 *
	 */
	public void ddlv_sls_flg(boolean value) {
		setConstBoolean(offset + 141, $ddlv_sls_flg, value);
	}


	/**
	 * Billing closing type 請求締処理区分.<p>
	 *
	 */
	public String bill_cl_typ() {
		return getConstString(offset + 142, $bill_cl_typ);
	}

	/**
	 * Billing closing type 請求締処理区分.<p>
	 *
	 */
	public void bill_cl_typ(String value) {
		setConstString(offset + 142, $bill_cl_typ, value);
	}


	/**
	 * Shipping distribution group cd. 出荷物流グループＣＤ.<p>
	 *
	 */
	public String ship_lg_grp_cd() {
		return getConstString(offset + 143, $ship_lg_grp_cd);
	}

	/**
	 * Shipping distribution group cd. 出荷物流グループＣＤ.<p>
	 *
	 */
	public void ship_lg_grp_cd(String value) {
		setConstString(offset + 143, $ship_lg_grp_cd, value);
	}


	/**
	 * EDI ＥＤＩ.<p>
	 *
	 */
	public boolean edi_flg() {
		return getConstBoolean(offset + 144, $edi_flg);
	}

	/**
	 * EDI ＥＤＩ.<p>
	 *
	 */
	public void edi_flg(boolean value) {
		setConstBoolean(offset + 144, $edi_flg, value);
	}


	/**
	 * Delivery note No. at shipping 出荷時納品書ＮＯ.<p>
	 *
	 */
	public String ship_dlv_slip_no() {
		return getConstString(offset + 145, $ship_dlv_slip_no);
	}

	/**
	 * Delivery note No. at shipping 出荷時納品書ＮＯ.<p>
	 *
	 */
	public void ship_dlv_slip_no(String value) {
		setConstString(offset + 145, $ship_dlv_slip_no, value);
	}


	/**
	 * Direct delivery delivery note No. 仕入直送納品書ＮＯ.<p>
	 *
	 */
	public String purc_ddlv_dlv_slip_no() {
		return getConstString(offset + 146, $purc_ddlv_dlv_slip_no);
	}

	/**
	 * Direct delivery delivery note No. 仕入直送納品書ＮＯ.<p>
	 *
	 */
	public void purc_ddlv_dlv_slip_no(String value) {
		setConstString(offset + 146, $purc_ddlv_dlv_slip_no, value);
	}


	/**
	 * Invoice header update counter インボイスヘッダ更新カウンタ.<p>
	 *
	 */
	public MCNumber iv_upd_cntr() {
		return getConstNumber(offset + 147, $iv_upd_cntr);
	}

	/**
	 * Invoice header update counter インボイスヘッダ更新カウンタ.<p>
	 *
	 */
	public void iv_upd_cntr(MCNumber value) {
		setConstNumber(offset + 147, $iv_upd_cntr, value);
	}

	/**
	 * Invoice header update counter インボイスヘッダ更新カウンタ.<p>
	 *
	 */
	public void iv_upd_cntr(int value) {
		setConstNumber(offset + 147, $iv_upd_cntr, value);
	}

	/**
	 * Invoice header update counter インボイスヘッダ更新カウンタ.<p>
	 *
	 */
	public void iv_upd_cntr(long value) {
		setConstNumber(offset + 147, $iv_upd_cntr, value);
	}

	/**
	 * Invoice header update counter インボイスヘッダ更新カウンタ.<p>
	 *
	 */
	public void iv_upd_cntr(float value) {
		setConstNumber(offset + 147, $iv_upd_cntr, value);
	}

	/**
	 * Invoice header update counter インボイスヘッダ更新カウンタ.<p>
	 *
	 */
	public void iv_upd_cntr(double value) {
		setConstNumber(offset + 147, $iv_upd_cntr, value);
	}


	/**
	 * Execute invoice service インボイスサービス実行.<p>
	 *
	 */
	public boolean iv_service_exec_flg() {
		return getConstBoolean(offset + 148, $iv_service_exec_flg);
	}

	/**
	 * Execute invoice service インボイスサービス実行.<p>
	 *
	 */
	public void iv_service_exec_flg(boolean value) {
		setConstBoolean(offset + 148, $iv_service_exec_flg, value);
	}


	/**
	 * Amount calculation 金額計算.<p>
	 *
	 */
	public boolean amt_calc_flg() {
		return getConstBoolean(offset + 149, $amt_calc_flg);
	}

	/**
	 * Amount calculation 金額計算.<p>
	 *
	 */
	public void amt_calc_flg(boolean value) {
		setConstBoolean(offset + 149, $amt_calc_flg, value);
	}


	public String getString(String name) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($sls_act_no.equalsIgnoreCase(name)) {
			return sls_act_no();
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			return trd_cd();
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			return trd_ptn_typ();
		}
		if ($sls_usr_cd.equalsIgnoreCase(name)) {
			return sls_usr_cd();
		}
		if ($sls_dpt_cd.equalsIgnoreCase(name)) {
			return sls_dpt_cd();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($trnspt_cd.equalsIgnoreCase(name)) {
			return trnspt_cd();
		}
		if ($vssl_flght.equalsIgnoreCase(name)) {
			return vssl_flght();
		}
		if ($load_port_cd.equalsIgnoreCase(name)) {
			return load_port_cd();
		}
		if ($dschrg_port_cd.equalsIgnoreCase(name)) {
			return dschrg_port_cd();
		}
		if ($via_port_cd.equalsIgnoreCase(name)) {
			return via_port_cd();
		}
		if ($iv_tterm_cd1.equalsIgnoreCase(name)) {
			return iv_tterm_cd1();
		}
		if ($iv_tterm_rmrks1.equalsIgnoreCase(name)) {
			return iv_tterm_rmrks1();
		}
		if ($iv_tterm_cd2.equalsIgnoreCase(name)) {
			return iv_tterm_cd2();
		}
		if ($iv_tterm_rmrks2.equalsIgnoreCase(name)) {
			return iv_tterm_rmrks2();
		}
		if ($iv_tterm_cd3.equalsIgnoreCase(name)) {
			return iv_tterm_cd3();
		}
		if ($iv_tterm_rmrks3.equalsIgnoreCase(name)) {
			return iv_tterm_rmrks3();
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			return cst_cd();
		}
		if ($iv_src_typ.equalsIgnoreCase(name)) {
			return iv_src_typ();
		}
		if ($iv_mng_no.equalsIgnoreCase(name)) {
			return iv_mng_no();
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			return iv_no();
		}
		if ($ref_iv_no.equalsIgnoreCase(name)) {
			return ref_iv_no();
		}
		if ($rcpt_iv_mng_no.equalsIgnoreCase(name)) {
			return rcpt_iv_mng_no();
		}
		if ($rcpt_iv_no.equalsIgnoreCase(name)) {
			return rcpt_iv_no();
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
		if ($iv_intr_rmrks.equalsIgnoreCase(name)) {
			return iv_intr_rmrks();
		}
		if ($iv_sub_char1.equalsIgnoreCase(name)) {
			return iv_sub_char1();
		}
		if ($iv_sub_char2.equalsIgnoreCase(name)) {
			return iv_sub_char2();
		}
		if ($iv_sub_char3.equalsIgnoreCase(name)) {
			return iv_sub_char3();
		}
		if ($tterm_cd1.equalsIgnoreCase(name)) {
			return tterm_cd1();
		}
		if ($tterm_rmrks1.equalsIgnoreCase(name)) {
			return tterm_rmrks1();
		}
		if ($tterm_cd2.equalsIgnoreCase(name)) {
			return tterm_cd2();
		}
		if ($tterm_rmrks2.equalsIgnoreCase(name)) {
			return tterm_rmrks2();
		}
		if ($tterm_cd3.equalsIgnoreCase(name)) {
			return tterm_cd3();
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
		if ($cred_cd.equalsIgnoreCase(name)) {
			return cred_cd();
		}
		if ($bcst_cd.equalsIgnoreCase(name)) {
			return bcst_cd();
		}
		if ($acst_cd.equalsIgnoreCase(name)) {
			return acst_cd();
		}
		if ($ar_dpt_cd.equalsIgnoreCase(name)) {
			return ar_dpt_cd();
		}
		if ($ap_dpt_cd.equalsIgnoreCase(name)) {
			return ap_dpt_cd();
		}
		if ($cst_po_no.equalsIgnoreCase(name)) {
			return cst_po_no();
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($base_cur_cd.equalsIgnoreCase(name)) {
			return base_cur_cd();
		}
		if ($xrate_cd.equalsIgnoreCase(name)) {
			return xrate_cd();
		}
		if ($ptax_cur_cd.equalsIgnoreCase(name)) {
			return ptax_cur_cd();
		}
		if ($trd_rmrks.equalsIgnoreCase(name)) {
			return trd_rmrks();
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			return intr_rmrks();
		}
		if ($ship_act_no.equalsIgnoreCase(name)) {
			return ship_act_no();
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			return slo_no();
		}
		if ($sls_ret_schd_no.equalsIgnoreCase(name)) {
			return sls_ret_schd_no();
		}
		if ($qtn_no.equalsIgnoreCase(name)) {
			return qtn_no();
		}
		if ($dlv_slip_no.equalsIgnoreCase(name)) {
			return dlv_slip_no();
		}
		if ($aprv_no.equalsIgnoreCase(name)) {
			return aprv_no();
		}
		if ($aprv_sts_typ.equalsIgnoreCase(name)) {
			return aprv_sts_typ();
		}
		if ($sls_basis_typ.equalsIgnoreCase(name)) {
			return sls_basis_typ();
		}
		if ($sls_adjst_typ.equalsIgnoreCase(name)) {
			return sls_adjst_typ();
		}
		if ($adjst_mtd_typ.equalsIgnoreCase(name)) {
			return adjst_mtd_typ();
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
		if ($hdr_dlv_cd.equalsIgnoreCase(name)) {
			return hdr_dlv_cd();
		}
		if ($hdr_dlv_nm.equalsIgnoreCase(name)) {
			return hdr_dlv_nm();
		}
		if ($hdr_dlv_zip_cd.equalsIgnoreCase(name)) {
			return hdr_dlv_zip_cd();
		}
		if ($hdr_dlv_addr1.equalsIgnoreCase(name)) {
			return hdr_dlv_addr1();
		}
		if ($hdr_dlv_addr2.equalsIgnoreCase(name)) {
			return hdr_dlv_addr2();
		}
		if ($hdr_dlv_addr3.equalsIgnoreCase(name)) {
			return hdr_dlv_addr3();
		}
		if ($hdr_dlv_addr4.equalsIgnoreCase(name)) {
			return hdr_dlv_addr4();
		}
		if ($hdr_dlv_cntct_dpt.equalsIgnoreCase(name)) {
			return hdr_dlv_cntct_dpt();
		}
		if ($hdr_dlv_cntct_psn.equalsIgnoreCase(name)) {
			return hdr_dlv_cntct_psn();
		}
		if ($hdr_dlv_tel.equalsIgnoreCase(name)) {
			return hdr_dlv_tel();
		}
		if ($hdr_dlv_fax.equalsIgnoreCase(name)) {
			return hdr_dlv_fax();
		}
		if ($slip_form_cd.equalsIgnoreCase(name)) {
			return slip_form_cd();
		}
		if ($xrate_rnd_typ.equalsIgnoreCase(name)) {
			return xrate_rnd_typ();
		}
		if ($amt_rnd_typ.equalsIgnoreCase(name)) {
			return amt_rnd_typ();
		}
		if ($tax_rnd_typ.equalsIgnoreCase(name)) {
			return tax_rnd_typ();
		}
		if ($slip_sts_typ.equalsIgnoreCase(name)) {
			return slip_sts_typ();
		}
		if ($bef_dlv_slip_no.equalsIgnoreCase(name)) {
			return bef_dlv_slip_no();
		}
		if ($bef_iv_no.equalsIgnoreCase(name)) {
			return bef_iv_no();
		}
		if ($bill_cl_typ.equalsIgnoreCase(name)) {
			return bill_cl_typ();
		}
		if ($ship_lg_grp_cd.equalsIgnoreCase(name)) {
			return ship_lg_grp_cd();
		}
		if ($ship_dlv_slip_no.equalsIgnoreCase(name)) {
			return ship_dlv_slip_no();
		}
		if ($purc_ddlv_dlv_slip_no.equalsIgnoreCase(name)) {
			return purc_ddlv_dlv_slip_no();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			return hdr_peg_no();
		}
		if ($sls_act_seq.equalsIgnoreCase(name)) {
			return sls_act_seq();
		}
		if ($sls_act_rev.equalsIgnoreCase(name)) {
			return sls_act_rev();
		}
		if ($iv_rev.equalsIgnoreCase(name)) {
			return iv_rev();
		}
		if ($xrate.equalsIgnoreCase(name)) {
			return xrate();
		}
		if ($ptax_xrate.equalsIgnoreCase(name)) {
			return ptax_xrate();
		}
		if ($qtn_rev.equalsIgnoreCase(name)) {
			return qtn_rev();
		}
		if ($new_hdr_peg_no.equalsIgnoreCase(name)) {
			return new_hdr_peg_no();
		}
		if ($hdr_tax_rate.equalsIgnoreCase(name)) {
			return hdr_tax_rate();
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			return trd_cur_amt();
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			return trd_cur_tax_amt();
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			return base_cur_amt();
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			return base_cur_tax_amt();
		}
		if ($trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			return trd_cur_upri_dec_place();
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			return trd_cur_amt_dec_place();
		}
		if ($base_cur_upri_dec_place.equalsIgnoreCase(name)) {
			return base_cur_upri_dec_place();
		}
		if ($base_cur_amt_dec_place.equalsIgnoreCase(name)) {
			return base_cur_amt_dec_place();
		}
		if ($ptax_cur_upri_dec_place.equalsIgnoreCase(name)) {
			return ptax_cur_upri_dec_place();
		}
		if ($ptax_cur_amt_dec_place.equalsIgnoreCase(name)) {
			return ptax_cur_amt_dec_place();
		}
		if ($dlv_slip_seq.equalsIgnoreCase(name)) {
			return dlv_slip_seq();
		}
		if ($dlv_slip_rev.equalsIgnoreCase(name)) {
			return dlv_slip_rev();
		}
		if ($iv_upd_cntr.equalsIgnoreCase(name)) {
			return iv_upd_cntr();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($ac_dt.equalsIgnoreCase(name)) {
			return ac_dt();
		}
		if ($can_ac_dt.equalsIgnoreCase(name)) {
			return can_ac_dt();
		}
		if ($sls_dt.equalsIgnoreCase(name)) {
			return sls_dt();
		}
		if ($ship_tm.equalsIgnoreCase(name)) {
			return ship_tm();
		}
		if ($dlv_tm.equalsIgnoreCase(name)) {
			return dlv_tm();
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
		if ($iv_dt.equalsIgnoreCase(name)) {
			return iv_dt();
		}
		if ($lc_dt.equalsIgnoreCase(name)) {
			return lc_dt();
		}
		if ($bl_dt.equalsIgnoreCase(name)) {
			return bl_dt();
		}
		if ($rcv_schd_dt.equalsIgnoreCase(name)) {
			return rcv_schd_dt();
		}
		if ($bill_basis_dt.equalsIgnoreCase(name)) {
			return bill_basis_dt();
		}
		if ($adjst_tgt_dt.equalsIgnoreCase(name)) {
			return adjst_tgt_dt();
		}
		if ($ac_ym.equalsIgnoreCase(name)) {
			return ac_ym();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($cst_iv_flg.equalsIgnoreCase(name)) {
			return cst_iv_flg();
		}
		if ($num_flg.equalsIgnoreCase(name)) {
			return num_flg();
		}
		if ($pl_skip_flg.equalsIgnoreCase(name)) {
			return pl_skip_flg();
		}
		if ($iv_immed_prnt_flg.equalsIgnoreCase(name)) {
			return iv_immed_prnt_flg();
		}
		if ($del_all_sls_d_flg.equalsIgnoreCase(name)) {
			return del_all_sls_d_flg();
		}
		if ($aprv_flg.equalsIgnoreCase(name)) {
			return aprv_flg();
		}
		if ($dlv_slip_prnt_flg.equalsIgnoreCase(name)) {
			return dlv_slip_prnt_flg();
		}
		if ($ship_act_service_via_flg.equalsIgnoreCase(name)) {
			return ship_act_service_via_flg();
		}
		if ($slip_split_non_flg.equalsIgnoreCase(name)) {
			return slip_split_non_flg();
		}
		if ($ship_act_service_exec_flg.equalsIgnoreCase(name)) {
			return ship_act_service_exec_flg();
		}
		if ($lot_chk_off_flg.equalsIgnoreCase(name)) {
			return lot_chk_off_flg();
		}
		if ($sls_dtl_mod_flg.equalsIgnoreCase(name)) {
			return sls_dtl_mod_flg();
		}
		if ($no_cred_upd_flg.equalsIgnoreCase(name)) {
			return no_cred_upd_flg();
		}
		if ($ship_act_sync_flg.equalsIgnoreCase(name)) {
			return ship_act_sync_flg();
		}
		if ($hdr_dlv_sundry_flg.equalsIgnoreCase(name)) {
			return hdr_dlv_sundry_flg();
		}
		if ($bef_aprv_flg.equalsIgnoreCase(name)) {
			return bef_aprv_flg();
		}
		if ($ddlv_sls_flg.equalsIgnoreCase(name)) {
			return ddlv_sls_flg();
		}
		if ($edi_flg.equalsIgnoreCase(name)) {
			return edi_flg();
		}
		if ($iv_service_exec_flg.equalsIgnoreCase(name)) {
			return iv_service_exec_flg();
		}
		if ($amt_calc_flg.equalsIgnoreCase(name)) {
			return amt_calc_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($sls_act_no.equalsIgnoreCase(name)) {
			return sls_act_no();
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			return trd_cd();
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			return trd_ptn_typ();
		}
		if ($sls_usr_cd.equalsIgnoreCase(name)) {
			return sls_usr_cd();
		}
		if ($sls_dpt_cd.equalsIgnoreCase(name)) {
			return sls_dpt_cd();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($trnspt_cd.equalsIgnoreCase(name)) {
			return trnspt_cd();
		}
		if ($vssl_flght.equalsIgnoreCase(name)) {
			return vssl_flght();
		}
		if ($load_port_cd.equalsIgnoreCase(name)) {
			return load_port_cd();
		}
		if ($dschrg_port_cd.equalsIgnoreCase(name)) {
			return dschrg_port_cd();
		}
		if ($via_port_cd.equalsIgnoreCase(name)) {
			return via_port_cd();
		}
		if ($iv_tterm_cd1.equalsIgnoreCase(name)) {
			return iv_tterm_cd1();
		}
		if ($iv_tterm_rmrks1.equalsIgnoreCase(name)) {
			return iv_tterm_rmrks1();
		}
		if ($iv_tterm_cd2.equalsIgnoreCase(name)) {
			return iv_tterm_cd2();
		}
		if ($iv_tterm_rmrks2.equalsIgnoreCase(name)) {
			return iv_tterm_rmrks2();
		}
		if ($iv_tterm_cd3.equalsIgnoreCase(name)) {
			return iv_tterm_cd3();
		}
		if ($iv_tterm_rmrks3.equalsIgnoreCase(name)) {
			return iv_tterm_rmrks3();
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			return cst_cd();
		}
		if ($iv_src_typ.equalsIgnoreCase(name)) {
			return iv_src_typ();
		}
		if ($iv_mng_no.equalsIgnoreCase(name)) {
			return iv_mng_no();
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			return iv_no();
		}
		if ($ref_iv_no.equalsIgnoreCase(name)) {
			return ref_iv_no();
		}
		if ($rcpt_iv_mng_no.equalsIgnoreCase(name)) {
			return rcpt_iv_mng_no();
		}
		if ($rcpt_iv_no.equalsIgnoreCase(name)) {
			return rcpt_iv_no();
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
		if ($iv_intr_rmrks.equalsIgnoreCase(name)) {
			return iv_intr_rmrks();
		}
		if ($iv_sub_char1.equalsIgnoreCase(name)) {
			return iv_sub_char1();
		}
		if ($iv_sub_char2.equalsIgnoreCase(name)) {
			return iv_sub_char2();
		}
		if ($iv_sub_char3.equalsIgnoreCase(name)) {
			return iv_sub_char3();
		}
		if ($tterm_cd1.equalsIgnoreCase(name)) {
			return tterm_cd1();
		}
		if ($tterm_rmrks1.equalsIgnoreCase(name)) {
			return tterm_rmrks1();
		}
		if ($tterm_cd2.equalsIgnoreCase(name)) {
			return tterm_cd2();
		}
		if ($tterm_rmrks2.equalsIgnoreCase(name)) {
			return tterm_rmrks2();
		}
		if ($tterm_cd3.equalsIgnoreCase(name)) {
			return tterm_cd3();
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
		if ($cred_cd.equalsIgnoreCase(name)) {
			return cred_cd();
		}
		if ($bcst_cd.equalsIgnoreCase(name)) {
			return bcst_cd();
		}
		if ($acst_cd.equalsIgnoreCase(name)) {
			return acst_cd();
		}
		if ($ar_dpt_cd.equalsIgnoreCase(name)) {
			return ar_dpt_cd();
		}
		if ($ap_dpt_cd.equalsIgnoreCase(name)) {
			return ap_dpt_cd();
		}
		if ($cst_po_no.equalsIgnoreCase(name)) {
			return cst_po_no();
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($base_cur_cd.equalsIgnoreCase(name)) {
			return base_cur_cd();
		}
		if ($xrate_cd.equalsIgnoreCase(name)) {
			return xrate_cd();
		}
		if ($ptax_cur_cd.equalsIgnoreCase(name)) {
			return ptax_cur_cd();
		}
		if ($trd_rmrks.equalsIgnoreCase(name)) {
			return trd_rmrks();
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			return intr_rmrks();
		}
		if ($ship_act_no.equalsIgnoreCase(name)) {
			return ship_act_no();
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			return slo_no();
		}
		if ($sls_ret_schd_no.equalsIgnoreCase(name)) {
			return sls_ret_schd_no();
		}
		if ($qtn_no.equalsIgnoreCase(name)) {
			return qtn_no();
		}
		if ($dlv_slip_no.equalsIgnoreCase(name)) {
			return dlv_slip_no();
		}
		if ($aprv_no.equalsIgnoreCase(name)) {
			return aprv_no();
		}
		if ($aprv_sts_typ.equalsIgnoreCase(name)) {
			return aprv_sts_typ();
		}
		if ($sls_basis_typ.equalsIgnoreCase(name)) {
			return sls_basis_typ();
		}
		if ($sls_adjst_typ.equalsIgnoreCase(name)) {
			return sls_adjst_typ();
		}
		if ($adjst_mtd_typ.equalsIgnoreCase(name)) {
			return adjst_mtd_typ();
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
		if ($hdr_dlv_cd.equalsIgnoreCase(name)) {
			return hdr_dlv_cd();
		}
		if ($hdr_dlv_nm.equalsIgnoreCase(name)) {
			return hdr_dlv_nm();
		}
		if ($hdr_dlv_zip_cd.equalsIgnoreCase(name)) {
			return hdr_dlv_zip_cd();
		}
		if ($hdr_dlv_addr1.equalsIgnoreCase(name)) {
			return hdr_dlv_addr1();
		}
		if ($hdr_dlv_addr2.equalsIgnoreCase(name)) {
			return hdr_dlv_addr2();
		}
		if ($hdr_dlv_addr3.equalsIgnoreCase(name)) {
			return hdr_dlv_addr3();
		}
		if ($hdr_dlv_addr4.equalsIgnoreCase(name)) {
			return hdr_dlv_addr4();
		}
		if ($hdr_dlv_cntct_dpt.equalsIgnoreCase(name)) {
			return hdr_dlv_cntct_dpt();
		}
		if ($hdr_dlv_cntct_psn.equalsIgnoreCase(name)) {
			return hdr_dlv_cntct_psn();
		}
		if ($hdr_dlv_tel.equalsIgnoreCase(name)) {
			return hdr_dlv_tel();
		}
		if ($hdr_dlv_fax.equalsIgnoreCase(name)) {
			return hdr_dlv_fax();
		}
		if ($slip_form_cd.equalsIgnoreCase(name)) {
			return slip_form_cd();
		}
		if ($xrate_rnd_typ.equalsIgnoreCase(name)) {
			return xrate_rnd_typ();
		}
		if ($amt_rnd_typ.equalsIgnoreCase(name)) {
			return amt_rnd_typ();
		}
		if ($tax_rnd_typ.equalsIgnoreCase(name)) {
			return tax_rnd_typ();
		}
		if ($slip_sts_typ.equalsIgnoreCase(name)) {
			return slip_sts_typ();
		}
		if ($bef_dlv_slip_no.equalsIgnoreCase(name)) {
			return bef_dlv_slip_no();
		}
		if ($bef_iv_no.equalsIgnoreCase(name)) {
			return bef_iv_no();
		}
		if ($bill_cl_typ.equalsIgnoreCase(name)) {
			return bill_cl_typ();
		}
		if ($ship_lg_grp_cd.equalsIgnoreCase(name)) {
			return ship_lg_grp_cd();
		}
		if ($ship_dlv_slip_no.equalsIgnoreCase(name)) {
			return ship_dlv_slip_no();
		}
		if ($purc_ddlv_dlv_slip_no.equalsIgnoreCase(name)) {
			return purc_ddlv_dlv_slip_no();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			return hdr_peg_no();
		}
		if ($sls_act_seq.equalsIgnoreCase(name)) {
			return sls_act_seq();
		}
		if ($sls_act_rev.equalsIgnoreCase(name)) {
			return sls_act_rev();
		}
		if ($iv_rev.equalsIgnoreCase(name)) {
			return iv_rev();
		}
		if ($xrate.equalsIgnoreCase(name)) {
			return xrate();
		}
		if ($ptax_xrate.equalsIgnoreCase(name)) {
			return ptax_xrate();
		}
		if ($qtn_rev.equalsIgnoreCase(name)) {
			return qtn_rev();
		}
		if ($new_hdr_peg_no.equalsIgnoreCase(name)) {
			return new_hdr_peg_no();
		}
		if ($hdr_tax_rate.equalsIgnoreCase(name)) {
			return hdr_tax_rate();
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			return trd_cur_amt();
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			return trd_cur_tax_amt();
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			return base_cur_amt();
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			return base_cur_tax_amt();
		}
		if ($trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			return trd_cur_upri_dec_place();
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			return trd_cur_amt_dec_place();
		}
		if ($base_cur_upri_dec_place.equalsIgnoreCase(name)) {
			return base_cur_upri_dec_place();
		}
		if ($base_cur_amt_dec_place.equalsIgnoreCase(name)) {
			return base_cur_amt_dec_place();
		}
		if ($ptax_cur_upri_dec_place.equalsIgnoreCase(name)) {
			return ptax_cur_upri_dec_place();
		}
		if ($ptax_cur_amt_dec_place.equalsIgnoreCase(name)) {
			return ptax_cur_amt_dec_place();
		}
		if ($dlv_slip_seq.equalsIgnoreCase(name)) {
			return dlv_slip_seq();
		}
		if ($dlv_slip_rev.equalsIgnoreCase(name)) {
			return dlv_slip_rev();
		}
		if ($iv_upd_cntr.equalsIgnoreCase(name)) {
			return iv_upd_cntr();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($ac_dt.equalsIgnoreCase(name)) {
			return ac_dt();
		}
		if ($can_ac_dt.equalsIgnoreCase(name)) {
			return can_ac_dt();
		}
		if ($sls_dt.equalsIgnoreCase(name)) {
			return sls_dt();
		}
		if ($ship_tm.equalsIgnoreCase(name)) {
			return ship_tm();
		}
		if ($dlv_tm.equalsIgnoreCase(name)) {
			return dlv_tm();
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
		if ($iv_dt.equalsIgnoreCase(name)) {
			return iv_dt();
		}
		if ($lc_dt.equalsIgnoreCase(name)) {
			return lc_dt();
		}
		if ($bl_dt.equalsIgnoreCase(name)) {
			return bl_dt();
		}
		if ($rcv_schd_dt.equalsIgnoreCase(name)) {
			return rcv_schd_dt();
		}
		if ($bill_basis_dt.equalsIgnoreCase(name)) {
			return bill_basis_dt();
		}
		if ($adjst_tgt_dt.equalsIgnoreCase(name)) {
			return adjst_tgt_dt();
		}
		if ($ac_ym.equalsIgnoreCase(name)) {
			return ac_ym();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($cst_iv_flg.equalsIgnoreCase(name)) {
			return cst_iv_flg();
		}
		if ($num_flg.equalsIgnoreCase(name)) {
			return num_flg();
		}
		if ($pl_skip_flg.equalsIgnoreCase(name)) {
			return pl_skip_flg();
		}
		if ($iv_immed_prnt_flg.equalsIgnoreCase(name)) {
			return iv_immed_prnt_flg();
		}
		if ($del_all_sls_d_flg.equalsIgnoreCase(name)) {
			return del_all_sls_d_flg();
		}
		if ($aprv_flg.equalsIgnoreCase(name)) {
			return aprv_flg();
		}
		if ($dlv_slip_prnt_flg.equalsIgnoreCase(name)) {
			return dlv_slip_prnt_flg();
		}
		if ($ship_act_service_via_flg.equalsIgnoreCase(name)) {
			return ship_act_service_via_flg();
		}
		if ($slip_split_non_flg.equalsIgnoreCase(name)) {
			return slip_split_non_flg();
		}
		if ($ship_act_service_exec_flg.equalsIgnoreCase(name)) {
			return ship_act_service_exec_flg();
		}
		if ($lot_chk_off_flg.equalsIgnoreCase(name)) {
			return lot_chk_off_flg();
		}
		if ($sls_dtl_mod_flg.equalsIgnoreCase(name)) {
			return sls_dtl_mod_flg();
		}
		if ($no_cred_upd_flg.equalsIgnoreCase(name)) {
			return no_cred_upd_flg();
		}
		if ($ship_act_sync_flg.equalsIgnoreCase(name)) {
			return ship_act_sync_flg();
		}
		if ($hdr_dlv_sundry_flg.equalsIgnoreCase(name)) {
			return hdr_dlv_sundry_flg();
		}
		if ($bef_aprv_flg.equalsIgnoreCase(name)) {
			return bef_aprv_flg();
		}
		if ($ddlv_sls_flg.equalsIgnoreCase(name)) {
			return ddlv_sls_flg();
		}
		if ($edi_flg.equalsIgnoreCase(name)) {
			return edi_flg();
		}
		if ($iv_service_exec_flg.equalsIgnoreCase(name)) {
			return iv_service_exec_flg();
		}
		if ($amt_calc_flg.equalsIgnoreCase(name)) {
			return amt_calc_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		if ($sls_act_no.equalsIgnoreCase(name)) {
			sls_act_no(value);
			return;
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			trd_cd(value);
			return;
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			trd_ptn_typ(value);
			return;
		}
		if ($sls_usr_cd.equalsIgnoreCase(name)) {
			sls_usr_cd(value);
			return;
		}
		if ($sls_dpt_cd.equalsIgnoreCase(name)) {
			sls_dpt_cd(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($trnspt_cd.equalsIgnoreCase(name)) {
			trnspt_cd(value);
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
		if ($dschrg_port_cd.equalsIgnoreCase(name)) {
			dschrg_port_cd(value);
			return;
		}
		if ($via_port_cd.equalsIgnoreCase(name)) {
			via_port_cd(value);
			return;
		}
		if ($iv_tterm_cd1.equalsIgnoreCase(name)) {
			iv_tterm_cd1(value);
			return;
		}
		if ($iv_tterm_rmrks1.equalsIgnoreCase(name)) {
			iv_tterm_rmrks1(value);
			return;
		}
		if ($iv_tterm_cd2.equalsIgnoreCase(name)) {
			iv_tterm_cd2(value);
			return;
		}
		if ($iv_tterm_rmrks2.equalsIgnoreCase(name)) {
			iv_tterm_rmrks2(value);
			return;
		}
		if ($iv_tterm_cd3.equalsIgnoreCase(name)) {
			iv_tterm_cd3(value);
			return;
		}
		if ($iv_tterm_rmrks3.equalsIgnoreCase(name)) {
			iv_tterm_rmrks3(value);
			return;
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			cst_cd(value);
			return;
		}
		if ($iv_src_typ.equalsIgnoreCase(name)) {
			iv_src_typ(value);
			return;
		}
		if ($iv_mng_no.equalsIgnoreCase(name)) {
			iv_mng_no(value);
			return;
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			iv_no(value);
			return;
		}
		if ($ref_iv_no.equalsIgnoreCase(name)) {
			ref_iv_no(value);
			return;
		}
		if ($rcpt_iv_mng_no.equalsIgnoreCase(name)) {
			rcpt_iv_mng_no(value);
			return;
		}
		if ($rcpt_iv_no.equalsIgnoreCase(name)) {
			rcpt_iv_no(value);
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
		if ($iv_intr_rmrks.equalsIgnoreCase(name)) {
			iv_intr_rmrks(value);
			return;
		}
		if ($iv_sub_char1.equalsIgnoreCase(name)) {
			iv_sub_char1(value);
			return;
		}
		if ($iv_sub_char2.equalsIgnoreCase(name)) {
			iv_sub_char2(value);
			return;
		}
		if ($iv_sub_char3.equalsIgnoreCase(name)) {
			iv_sub_char3(value);
			return;
		}
		if ($tterm_cd1.equalsIgnoreCase(name)) {
			tterm_cd1(value);
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
		if ($tterm_rmrks2.equalsIgnoreCase(name)) {
			tterm_rmrks2(value);
			return;
		}
		if ($tterm_cd3.equalsIgnoreCase(name)) {
			tterm_cd3(value);
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
		if ($cred_cd.equalsIgnoreCase(name)) {
			cred_cd(value);
			return;
		}
		if ($bcst_cd.equalsIgnoreCase(name)) {
			bcst_cd(value);
			return;
		}
		if ($acst_cd.equalsIgnoreCase(name)) {
			acst_cd(value);
			return;
		}
		if ($ar_dpt_cd.equalsIgnoreCase(name)) {
			ar_dpt_cd(value);
			return;
		}
		if ($ap_dpt_cd.equalsIgnoreCase(name)) {
			ap_dpt_cd(value);
			return;
		}
		if ($cst_po_no.equalsIgnoreCase(name)) {
			cst_po_no(value);
			return;
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			trd_cur_cd(value);
			return;
		}
		if ($base_cur_cd.equalsIgnoreCase(name)) {
			base_cur_cd(value);
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
		if ($trd_rmrks.equalsIgnoreCase(name)) {
			trd_rmrks(value);
			return;
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			intr_rmrks(value);
			return;
		}
		if ($ship_act_no.equalsIgnoreCase(name)) {
			ship_act_no(value);
			return;
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			slo_no(value);
			return;
		}
		if ($sls_ret_schd_no.equalsIgnoreCase(name)) {
			sls_ret_schd_no(value);
			return;
		}
		if ($qtn_no.equalsIgnoreCase(name)) {
			qtn_no(value);
			return;
		}
		if ($dlv_slip_no.equalsIgnoreCase(name)) {
			dlv_slip_no(value);
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
		if ($sls_basis_typ.equalsIgnoreCase(name)) {
			sls_basis_typ(value);
			return;
		}
		if ($sls_adjst_typ.equalsIgnoreCase(name)) {
			sls_adjst_typ(value);
			return;
		}
		if ($adjst_mtd_typ.equalsIgnoreCase(name)) {
			adjst_mtd_typ(value);
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
		if ($hdr_dlv_cd.equalsIgnoreCase(name)) {
			hdr_dlv_cd(value);
			return;
		}
		if ($hdr_dlv_nm.equalsIgnoreCase(name)) {
			hdr_dlv_nm(value);
			return;
		}
		if ($hdr_dlv_zip_cd.equalsIgnoreCase(name)) {
			hdr_dlv_zip_cd(value);
			return;
		}
		if ($hdr_dlv_addr1.equalsIgnoreCase(name)) {
			hdr_dlv_addr1(value);
			return;
		}
		if ($hdr_dlv_addr2.equalsIgnoreCase(name)) {
			hdr_dlv_addr2(value);
			return;
		}
		if ($hdr_dlv_addr3.equalsIgnoreCase(name)) {
			hdr_dlv_addr3(value);
			return;
		}
		if ($hdr_dlv_addr4.equalsIgnoreCase(name)) {
			hdr_dlv_addr4(value);
			return;
		}
		if ($hdr_dlv_cntct_dpt.equalsIgnoreCase(name)) {
			hdr_dlv_cntct_dpt(value);
			return;
		}
		if ($hdr_dlv_cntct_psn.equalsIgnoreCase(name)) {
			hdr_dlv_cntct_psn(value);
			return;
		}
		if ($hdr_dlv_tel.equalsIgnoreCase(name)) {
			hdr_dlv_tel(value);
			return;
		}
		if ($hdr_dlv_fax.equalsIgnoreCase(name)) {
			hdr_dlv_fax(value);
			return;
		}
		if ($slip_form_cd.equalsIgnoreCase(name)) {
			slip_form_cd(value);
			return;
		}
		if ($xrate_rnd_typ.equalsIgnoreCase(name)) {
			xrate_rnd_typ(value);
			return;
		}
		if ($amt_rnd_typ.equalsIgnoreCase(name)) {
			amt_rnd_typ(value);
			return;
		}
		if ($tax_rnd_typ.equalsIgnoreCase(name)) {
			tax_rnd_typ(value);
			return;
		}
		if ($slip_sts_typ.equalsIgnoreCase(name)) {
			slip_sts_typ(value);
			return;
		}
		if ($bef_dlv_slip_no.equalsIgnoreCase(name)) {
			bef_dlv_slip_no(value);
			return;
		}
		if ($bef_iv_no.equalsIgnoreCase(name)) {
			bef_iv_no(value);
			return;
		}
		if ($bill_cl_typ.equalsIgnoreCase(name)) {
			bill_cl_typ(value);
			return;
		}
		if ($ship_lg_grp_cd.equalsIgnoreCase(name)) {
			ship_lg_grp_cd(value);
			return;
		}
		if ($ship_dlv_slip_no.equalsIgnoreCase(name)) {
			ship_dlv_slip_no(value);
			return;
		}
		if ($purc_ddlv_dlv_slip_no.equalsIgnoreCase(name)) {
			purc_ddlv_dlv_slip_no(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($sls_act_seq.equalsIgnoreCase(name)) {
			sls_act_seq(value);
			return;
		}
		if ($sls_act_rev.equalsIgnoreCase(name)) {
			sls_act_rev(value);
			return;
		}
		if ($iv_rev.equalsIgnoreCase(name)) {
			iv_rev(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($ptax_xrate.equalsIgnoreCase(name)) {
			ptax_xrate(value);
			return;
		}
		if ($qtn_rev.equalsIgnoreCase(name)) {
			qtn_rev(value);
			return;
		}
		if ($new_hdr_peg_no.equalsIgnoreCase(name)) {
			new_hdr_peg_no(value);
			return;
		}
		if ($hdr_tax_rate.equalsIgnoreCase(name)) {
			hdr_tax_rate(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
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
		if ($base_cur_upri_dec_place.equalsIgnoreCase(name)) {
			base_cur_upri_dec_place(value);
			return;
		}
		if ($base_cur_amt_dec_place.equalsIgnoreCase(name)) {
			base_cur_amt_dec_place(value);
			return;
		}
		if ($ptax_cur_upri_dec_place.equalsIgnoreCase(name)) {
			ptax_cur_upri_dec_place(value);
			return;
		}
		if ($ptax_cur_amt_dec_place.equalsIgnoreCase(name)) {
			ptax_cur_amt_dec_place(value);
			return;
		}
		if ($dlv_slip_seq.equalsIgnoreCase(name)) {
			dlv_slip_seq(value);
			return;
		}
		if ($dlv_slip_rev.equalsIgnoreCase(name)) {
			dlv_slip_rev(value);
			return;
		}
		if ($iv_upd_cntr.equalsIgnoreCase(name)) {
			iv_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($sls_act_seq.equalsIgnoreCase(name)) {
			sls_act_seq(value);
			return;
		}
		if ($sls_act_rev.equalsIgnoreCase(name)) {
			sls_act_rev(value);
			return;
		}
		if ($iv_rev.equalsIgnoreCase(name)) {
			iv_rev(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($ptax_xrate.equalsIgnoreCase(name)) {
			ptax_xrate(value);
			return;
		}
		if ($qtn_rev.equalsIgnoreCase(name)) {
			qtn_rev(value);
			return;
		}
		if ($new_hdr_peg_no.equalsIgnoreCase(name)) {
			new_hdr_peg_no(value);
			return;
		}
		if ($hdr_tax_rate.equalsIgnoreCase(name)) {
			hdr_tax_rate(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
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
		if ($base_cur_upri_dec_place.equalsIgnoreCase(name)) {
			base_cur_upri_dec_place(value);
			return;
		}
		if ($base_cur_amt_dec_place.equalsIgnoreCase(name)) {
			base_cur_amt_dec_place(value);
			return;
		}
		if ($ptax_cur_upri_dec_place.equalsIgnoreCase(name)) {
			ptax_cur_upri_dec_place(value);
			return;
		}
		if ($ptax_cur_amt_dec_place.equalsIgnoreCase(name)) {
			ptax_cur_amt_dec_place(value);
			return;
		}
		if ($dlv_slip_seq.equalsIgnoreCase(name)) {
			dlv_slip_seq(value);
			return;
		}
		if ($dlv_slip_rev.equalsIgnoreCase(name)) {
			dlv_slip_rev(value);
			return;
		}
		if ($iv_upd_cntr.equalsIgnoreCase(name)) {
			iv_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($sls_act_seq.equalsIgnoreCase(name)) {
			sls_act_seq(value);
			return;
		}
		if ($sls_act_rev.equalsIgnoreCase(name)) {
			sls_act_rev(value);
			return;
		}
		if ($iv_rev.equalsIgnoreCase(name)) {
			iv_rev(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($ptax_xrate.equalsIgnoreCase(name)) {
			ptax_xrate(value);
			return;
		}
		if ($qtn_rev.equalsIgnoreCase(name)) {
			qtn_rev(value);
			return;
		}
		if ($new_hdr_peg_no.equalsIgnoreCase(name)) {
			new_hdr_peg_no(value);
			return;
		}
		if ($hdr_tax_rate.equalsIgnoreCase(name)) {
			hdr_tax_rate(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
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
		if ($base_cur_upri_dec_place.equalsIgnoreCase(name)) {
			base_cur_upri_dec_place(value);
			return;
		}
		if ($base_cur_amt_dec_place.equalsIgnoreCase(name)) {
			base_cur_amt_dec_place(value);
			return;
		}
		if ($ptax_cur_upri_dec_place.equalsIgnoreCase(name)) {
			ptax_cur_upri_dec_place(value);
			return;
		}
		if ($ptax_cur_amt_dec_place.equalsIgnoreCase(name)) {
			ptax_cur_amt_dec_place(value);
			return;
		}
		if ($dlv_slip_seq.equalsIgnoreCase(name)) {
			dlv_slip_seq(value);
			return;
		}
		if ($dlv_slip_rev.equalsIgnoreCase(name)) {
			dlv_slip_rev(value);
			return;
		}
		if ($iv_upd_cntr.equalsIgnoreCase(name)) {
			iv_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($sls_act_seq.equalsIgnoreCase(name)) {
			sls_act_seq(value);
			return;
		}
		if ($sls_act_rev.equalsIgnoreCase(name)) {
			sls_act_rev(value);
			return;
		}
		if ($iv_rev.equalsIgnoreCase(name)) {
			iv_rev(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($ptax_xrate.equalsIgnoreCase(name)) {
			ptax_xrate(value);
			return;
		}
		if ($qtn_rev.equalsIgnoreCase(name)) {
			qtn_rev(value);
			return;
		}
		if ($new_hdr_peg_no.equalsIgnoreCase(name)) {
			new_hdr_peg_no(value);
			return;
		}
		if ($hdr_tax_rate.equalsIgnoreCase(name)) {
			hdr_tax_rate(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
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
		if ($base_cur_upri_dec_place.equalsIgnoreCase(name)) {
			base_cur_upri_dec_place(value);
			return;
		}
		if ($base_cur_amt_dec_place.equalsIgnoreCase(name)) {
			base_cur_amt_dec_place(value);
			return;
		}
		if ($ptax_cur_upri_dec_place.equalsIgnoreCase(name)) {
			ptax_cur_upri_dec_place(value);
			return;
		}
		if ($ptax_cur_amt_dec_place.equalsIgnoreCase(name)) {
			ptax_cur_amt_dec_place(value);
			return;
		}
		if ($dlv_slip_seq.equalsIgnoreCase(name)) {
			dlv_slip_seq(value);
			return;
		}
		if ($dlv_slip_rev.equalsIgnoreCase(name)) {
			dlv_slip_rev(value);
			return;
		}
		if ($iv_upd_cntr.equalsIgnoreCase(name)) {
			iv_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($sls_act_seq.equalsIgnoreCase(name)) {
			sls_act_seq(value);
			return;
		}
		if ($sls_act_rev.equalsIgnoreCase(name)) {
			sls_act_rev(value);
			return;
		}
		if ($iv_rev.equalsIgnoreCase(name)) {
			iv_rev(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($ptax_xrate.equalsIgnoreCase(name)) {
			ptax_xrate(value);
			return;
		}
		if ($qtn_rev.equalsIgnoreCase(name)) {
			qtn_rev(value);
			return;
		}
		if ($new_hdr_peg_no.equalsIgnoreCase(name)) {
			new_hdr_peg_no(value);
			return;
		}
		if ($hdr_tax_rate.equalsIgnoreCase(name)) {
			hdr_tax_rate(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
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
		if ($base_cur_upri_dec_place.equalsIgnoreCase(name)) {
			base_cur_upri_dec_place(value);
			return;
		}
		if ($base_cur_amt_dec_place.equalsIgnoreCase(name)) {
			base_cur_amt_dec_place(value);
			return;
		}
		if ($ptax_cur_upri_dec_place.equalsIgnoreCase(name)) {
			ptax_cur_upri_dec_place(value);
			return;
		}
		if ($ptax_cur_amt_dec_place.equalsIgnoreCase(name)) {
			ptax_cur_amt_dec_place(value);
			return;
		}
		if ($dlv_slip_seq.equalsIgnoreCase(name)) {
			dlv_slip_seq(value);
			return;
		}
		if ($dlv_slip_rev.equalsIgnoreCase(name)) {
			dlv_slip_rev(value);
			return;
		}
		if ($iv_upd_cntr.equalsIgnoreCase(name)) {
			iv_upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($ac_dt.equalsIgnoreCase(name)) {
			ac_dt(value);
			return;
		}
		if ($can_ac_dt.equalsIgnoreCase(name)) {
			can_ac_dt(value);
			return;
		}
		if ($sls_dt.equalsIgnoreCase(name)) {
			sls_dt(value);
			return;
		}
		if ($ship_tm.equalsIgnoreCase(name)) {
			ship_tm(value);
			return;
		}
		if ($dlv_tm.equalsIgnoreCase(name)) {
			dlv_tm(value);
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
		if ($iv_dt.equalsIgnoreCase(name)) {
			iv_dt(value);
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
		if ($rcv_schd_dt.equalsIgnoreCase(name)) {
			rcv_schd_dt(value);
			return;
		}
		if ($bill_basis_dt.equalsIgnoreCase(name)) {
			bill_basis_dt(value);
			return;
		}
		if ($adjst_tgt_dt.equalsIgnoreCase(name)) {
			adjst_tgt_dt(value);
			return;
		}
		if ($ac_ym.equalsIgnoreCase(name)) {
			ac_ym(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($cst_iv_flg.equalsIgnoreCase(name)) {
			cst_iv_flg(value);
			return;
		}
		if ($num_flg.equalsIgnoreCase(name)) {
			num_flg(value);
			return;
		}
		if ($pl_skip_flg.equalsIgnoreCase(name)) {
			pl_skip_flg(value);
			return;
		}
		if ($iv_immed_prnt_flg.equalsIgnoreCase(name)) {
			iv_immed_prnt_flg(value);
			return;
		}
		if ($del_all_sls_d_flg.equalsIgnoreCase(name)) {
			del_all_sls_d_flg(value);
			return;
		}
		if ($aprv_flg.equalsIgnoreCase(name)) {
			aprv_flg(value);
			return;
		}
		if ($dlv_slip_prnt_flg.equalsIgnoreCase(name)) {
			dlv_slip_prnt_flg(value);
			return;
		}
		if ($ship_act_service_via_flg.equalsIgnoreCase(name)) {
			ship_act_service_via_flg(value);
			return;
		}
		if ($slip_split_non_flg.equalsIgnoreCase(name)) {
			slip_split_non_flg(value);
			return;
		}
		if ($ship_act_service_exec_flg.equalsIgnoreCase(name)) {
			ship_act_service_exec_flg(value);
			return;
		}
		if ($lot_chk_off_flg.equalsIgnoreCase(name)) {
			lot_chk_off_flg(value);
			return;
		}
		if ($sls_dtl_mod_flg.equalsIgnoreCase(name)) {
			sls_dtl_mod_flg(value);
			return;
		}
		if ($no_cred_upd_flg.equalsIgnoreCase(name)) {
			no_cred_upd_flg(value);
			return;
		}
		if ($ship_act_sync_flg.equalsIgnoreCase(name)) {
			ship_act_sync_flg(value);
			return;
		}
		if ($hdr_dlv_sundry_flg.equalsIgnoreCase(name)) {
			hdr_dlv_sundry_flg(value);
			return;
		}
		if ($bef_aprv_flg.equalsIgnoreCase(name)) {
			bef_aprv_flg(value);
			return;
		}
		if ($ddlv_sls_flg.equalsIgnoreCase(name)) {
			ddlv_sls_flg(value);
			return;
		}
		if ($edi_flg.equalsIgnoreCase(name)) {
			edi_flg(value);
			return;
		}
		if ($iv_service_exec_flg.equalsIgnoreCase(name)) {
			iv_service_exec_flg(value);
			return;
		}
		if ($amt_calc_flg.equalsIgnoreCase(name)) {
			amt_calc_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		if ($sls_act_no.equalsIgnoreCase(name)) {
			sls_act_no(value);
			return;
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			trd_cd(value);
			return;
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			trd_ptn_typ(value);
			return;
		}
		if ($sls_usr_cd.equalsIgnoreCase(name)) {
			sls_usr_cd(value);
			return;
		}
		if ($sls_dpt_cd.equalsIgnoreCase(name)) {
			sls_dpt_cd(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($trnspt_cd.equalsIgnoreCase(name)) {
			trnspt_cd(value);
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
		if ($dschrg_port_cd.equalsIgnoreCase(name)) {
			dschrg_port_cd(value);
			return;
		}
		if ($via_port_cd.equalsIgnoreCase(name)) {
			via_port_cd(value);
			return;
		}
		if ($iv_tterm_cd1.equalsIgnoreCase(name)) {
			iv_tterm_cd1(value);
			return;
		}
		if ($iv_tterm_rmrks1.equalsIgnoreCase(name)) {
			iv_tterm_rmrks1(value);
			return;
		}
		if ($iv_tterm_cd2.equalsIgnoreCase(name)) {
			iv_tterm_cd2(value);
			return;
		}
		if ($iv_tterm_rmrks2.equalsIgnoreCase(name)) {
			iv_tterm_rmrks2(value);
			return;
		}
		if ($iv_tterm_cd3.equalsIgnoreCase(name)) {
			iv_tterm_cd3(value);
			return;
		}
		if ($iv_tterm_rmrks3.equalsIgnoreCase(name)) {
			iv_tterm_rmrks3(value);
			return;
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			cst_cd(value);
			return;
		}
		if ($iv_src_typ.equalsIgnoreCase(name)) {
			iv_src_typ(value);
			return;
		}
		if ($iv_mng_no.equalsIgnoreCase(name)) {
			iv_mng_no(value);
			return;
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			iv_no(value);
			return;
		}
		if ($ref_iv_no.equalsIgnoreCase(name)) {
			ref_iv_no(value);
			return;
		}
		if ($rcpt_iv_mng_no.equalsIgnoreCase(name)) {
			rcpt_iv_mng_no(value);
			return;
		}
		if ($rcpt_iv_no.equalsIgnoreCase(name)) {
			rcpt_iv_no(value);
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
		if ($iv_intr_rmrks.equalsIgnoreCase(name)) {
			iv_intr_rmrks(value);
			return;
		}
		if ($iv_sub_char1.equalsIgnoreCase(name)) {
			iv_sub_char1(value);
			return;
		}
		if ($iv_sub_char2.equalsIgnoreCase(name)) {
			iv_sub_char2(value);
			return;
		}
		if ($iv_sub_char3.equalsIgnoreCase(name)) {
			iv_sub_char3(value);
			return;
		}
		if ($tterm_cd1.equalsIgnoreCase(name)) {
			tterm_cd1(value);
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
		if ($tterm_rmrks2.equalsIgnoreCase(name)) {
			tterm_rmrks2(value);
			return;
		}
		if ($tterm_cd3.equalsIgnoreCase(name)) {
			tterm_cd3(value);
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
		if ($cred_cd.equalsIgnoreCase(name)) {
			cred_cd(value);
			return;
		}
		if ($bcst_cd.equalsIgnoreCase(name)) {
			bcst_cd(value);
			return;
		}
		if ($acst_cd.equalsIgnoreCase(name)) {
			acst_cd(value);
			return;
		}
		if ($ar_dpt_cd.equalsIgnoreCase(name)) {
			ar_dpt_cd(value);
			return;
		}
		if ($ap_dpt_cd.equalsIgnoreCase(name)) {
			ap_dpt_cd(value);
			return;
		}
		if ($cst_po_no.equalsIgnoreCase(name)) {
			cst_po_no(value);
			return;
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			trd_cur_cd(value);
			return;
		}
		if ($base_cur_cd.equalsIgnoreCase(name)) {
			base_cur_cd(value);
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
		if ($trd_rmrks.equalsIgnoreCase(name)) {
			trd_rmrks(value);
			return;
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			intr_rmrks(value);
			return;
		}
		if ($ship_act_no.equalsIgnoreCase(name)) {
			ship_act_no(value);
			return;
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			slo_no(value);
			return;
		}
		if ($sls_ret_schd_no.equalsIgnoreCase(name)) {
			sls_ret_schd_no(value);
			return;
		}
		if ($qtn_no.equalsIgnoreCase(name)) {
			qtn_no(value);
			return;
		}
		if ($dlv_slip_no.equalsIgnoreCase(name)) {
			dlv_slip_no(value);
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
		if ($sls_basis_typ.equalsIgnoreCase(name)) {
			sls_basis_typ(value);
			return;
		}
		if ($sls_adjst_typ.equalsIgnoreCase(name)) {
			sls_adjst_typ(value);
			return;
		}
		if ($adjst_mtd_typ.equalsIgnoreCase(name)) {
			adjst_mtd_typ(value);
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
		if ($hdr_dlv_cd.equalsIgnoreCase(name)) {
			hdr_dlv_cd(value);
			return;
		}
		if ($hdr_dlv_nm.equalsIgnoreCase(name)) {
			hdr_dlv_nm(value);
			return;
		}
		if ($hdr_dlv_zip_cd.equalsIgnoreCase(name)) {
			hdr_dlv_zip_cd(value);
			return;
		}
		if ($hdr_dlv_addr1.equalsIgnoreCase(name)) {
			hdr_dlv_addr1(value);
			return;
		}
		if ($hdr_dlv_addr2.equalsIgnoreCase(name)) {
			hdr_dlv_addr2(value);
			return;
		}
		if ($hdr_dlv_addr3.equalsIgnoreCase(name)) {
			hdr_dlv_addr3(value);
			return;
		}
		if ($hdr_dlv_addr4.equalsIgnoreCase(name)) {
			hdr_dlv_addr4(value);
			return;
		}
		if ($hdr_dlv_cntct_dpt.equalsIgnoreCase(name)) {
			hdr_dlv_cntct_dpt(value);
			return;
		}
		if ($hdr_dlv_cntct_psn.equalsIgnoreCase(name)) {
			hdr_dlv_cntct_psn(value);
			return;
		}
		if ($hdr_dlv_tel.equalsIgnoreCase(name)) {
			hdr_dlv_tel(value);
			return;
		}
		if ($hdr_dlv_fax.equalsIgnoreCase(name)) {
			hdr_dlv_fax(value);
			return;
		}
		if ($slip_form_cd.equalsIgnoreCase(name)) {
			slip_form_cd(value);
			return;
		}
		if ($xrate_rnd_typ.equalsIgnoreCase(name)) {
			xrate_rnd_typ(value);
			return;
		}
		if ($amt_rnd_typ.equalsIgnoreCase(name)) {
			amt_rnd_typ(value);
			return;
		}
		if ($tax_rnd_typ.equalsIgnoreCase(name)) {
			tax_rnd_typ(value);
			return;
		}
		if ($slip_sts_typ.equalsIgnoreCase(name)) {
			slip_sts_typ(value);
			return;
		}
		if ($bef_dlv_slip_no.equalsIgnoreCase(name)) {
			bef_dlv_slip_no(value);
			return;
		}
		if ($bef_iv_no.equalsIgnoreCase(name)) {
			bef_iv_no(value);
			return;
		}
		if ($bill_cl_typ.equalsIgnoreCase(name)) {
			bill_cl_typ(value);
			return;
		}
		if ($ship_lg_grp_cd.equalsIgnoreCase(name)) {
			ship_lg_grp_cd(value);
			return;
		}
		if ($ship_dlv_slip_no.equalsIgnoreCase(name)) {
			ship_dlv_slip_no(value);
			return;
		}
		if ($purc_ddlv_dlv_slip_no.equalsIgnoreCase(name)) {
			purc_ddlv_dlv_slip_no(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($sls_act_seq.equalsIgnoreCase(name)) {
			sls_act_seq(value);
			return;
		}
		if ($sls_act_rev.equalsIgnoreCase(name)) {
			sls_act_rev(value);
			return;
		}
		if ($iv_rev.equalsIgnoreCase(name)) {
			iv_rev(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($ptax_xrate.equalsIgnoreCase(name)) {
			ptax_xrate(value);
			return;
		}
		if ($qtn_rev.equalsIgnoreCase(name)) {
			qtn_rev(value);
			return;
		}
		if ($new_hdr_peg_no.equalsIgnoreCase(name)) {
			new_hdr_peg_no(value);
			return;
		}
		if ($hdr_tax_rate.equalsIgnoreCase(name)) {
			hdr_tax_rate(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
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
		if ($base_cur_upri_dec_place.equalsIgnoreCase(name)) {
			base_cur_upri_dec_place(value);
			return;
		}
		if ($base_cur_amt_dec_place.equalsIgnoreCase(name)) {
			base_cur_amt_dec_place(value);
			return;
		}
		if ($ptax_cur_upri_dec_place.equalsIgnoreCase(name)) {
			ptax_cur_upri_dec_place(value);
			return;
		}
		if ($ptax_cur_amt_dec_place.equalsIgnoreCase(name)) {
			ptax_cur_amt_dec_place(value);
			return;
		}
		if ($dlv_slip_seq.equalsIgnoreCase(name)) {
			dlv_slip_seq(value);
			return;
		}
		if ($dlv_slip_rev.equalsIgnoreCase(name)) {
			dlv_slip_rev(value);
			return;
		}
		if ($iv_upd_cntr.equalsIgnoreCase(name)) {
			iv_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($sls_act_seq.equalsIgnoreCase(name)) {
			sls_act_seq(value);
			return;
		}
		if ($sls_act_rev.equalsIgnoreCase(name)) {
			sls_act_rev(value);
			return;
		}
		if ($iv_rev.equalsIgnoreCase(name)) {
			iv_rev(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($ptax_xrate.equalsIgnoreCase(name)) {
			ptax_xrate(value);
			return;
		}
		if ($qtn_rev.equalsIgnoreCase(name)) {
			qtn_rev(value);
			return;
		}
		if ($new_hdr_peg_no.equalsIgnoreCase(name)) {
			new_hdr_peg_no(value);
			return;
		}
		if ($hdr_tax_rate.equalsIgnoreCase(name)) {
			hdr_tax_rate(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
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
		if ($base_cur_upri_dec_place.equalsIgnoreCase(name)) {
			base_cur_upri_dec_place(value);
			return;
		}
		if ($base_cur_amt_dec_place.equalsIgnoreCase(name)) {
			base_cur_amt_dec_place(value);
			return;
		}
		if ($ptax_cur_upri_dec_place.equalsIgnoreCase(name)) {
			ptax_cur_upri_dec_place(value);
			return;
		}
		if ($ptax_cur_amt_dec_place.equalsIgnoreCase(name)) {
			ptax_cur_amt_dec_place(value);
			return;
		}
		if ($dlv_slip_seq.equalsIgnoreCase(name)) {
			dlv_slip_seq(value);
			return;
		}
		if ($dlv_slip_rev.equalsIgnoreCase(name)) {
			dlv_slip_rev(value);
			return;
		}
		if ($iv_upd_cntr.equalsIgnoreCase(name)) {
			iv_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($sls_act_seq.equalsIgnoreCase(name)) {
			sls_act_seq(value);
			return;
		}
		if ($sls_act_rev.equalsIgnoreCase(name)) {
			sls_act_rev(value);
			return;
		}
		if ($iv_rev.equalsIgnoreCase(name)) {
			iv_rev(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($ptax_xrate.equalsIgnoreCase(name)) {
			ptax_xrate(value);
			return;
		}
		if ($qtn_rev.equalsIgnoreCase(name)) {
			qtn_rev(value);
			return;
		}
		if ($new_hdr_peg_no.equalsIgnoreCase(name)) {
			new_hdr_peg_no(value);
			return;
		}
		if ($hdr_tax_rate.equalsIgnoreCase(name)) {
			hdr_tax_rate(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
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
		if ($base_cur_upri_dec_place.equalsIgnoreCase(name)) {
			base_cur_upri_dec_place(value);
			return;
		}
		if ($base_cur_amt_dec_place.equalsIgnoreCase(name)) {
			base_cur_amt_dec_place(value);
			return;
		}
		if ($ptax_cur_upri_dec_place.equalsIgnoreCase(name)) {
			ptax_cur_upri_dec_place(value);
			return;
		}
		if ($ptax_cur_amt_dec_place.equalsIgnoreCase(name)) {
			ptax_cur_amt_dec_place(value);
			return;
		}
		if ($dlv_slip_seq.equalsIgnoreCase(name)) {
			dlv_slip_seq(value);
			return;
		}
		if ($dlv_slip_rev.equalsIgnoreCase(name)) {
			dlv_slip_rev(value);
			return;
		}
		if ($iv_upd_cntr.equalsIgnoreCase(name)) {
			iv_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($sls_act_seq.equalsIgnoreCase(name)) {
			sls_act_seq(value);
			return;
		}
		if ($sls_act_rev.equalsIgnoreCase(name)) {
			sls_act_rev(value);
			return;
		}
		if ($iv_rev.equalsIgnoreCase(name)) {
			iv_rev(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($ptax_xrate.equalsIgnoreCase(name)) {
			ptax_xrate(value);
			return;
		}
		if ($qtn_rev.equalsIgnoreCase(name)) {
			qtn_rev(value);
			return;
		}
		if ($new_hdr_peg_no.equalsIgnoreCase(name)) {
			new_hdr_peg_no(value);
			return;
		}
		if ($hdr_tax_rate.equalsIgnoreCase(name)) {
			hdr_tax_rate(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
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
		if ($base_cur_upri_dec_place.equalsIgnoreCase(name)) {
			base_cur_upri_dec_place(value);
			return;
		}
		if ($base_cur_amt_dec_place.equalsIgnoreCase(name)) {
			base_cur_amt_dec_place(value);
			return;
		}
		if ($ptax_cur_upri_dec_place.equalsIgnoreCase(name)) {
			ptax_cur_upri_dec_place(value);
			return;
		}
		if ($ptax_cur_amt_dec_place.equalsIgnoreCase(name)) {
			ptax_cur_amt_dec_place(value);
			return;
		}
		if ($dlv_slip_seq.equalsIgnoreCase(name)) {
			dlv_slip_seq(value);
			return;
		}
		if ($dlv_slip_rev.equalsIgnoreCase(name)) {
			dlv_slip_rev(value);
			return;
		}
		if ($iv_upd_cntr.equalsIgnoreCase(name)) {
			iv_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($sls_act_seq.equalsIgnoreCase(name)) {
			sls_act_seq(value);
			return;
		}
		if ($sls_act_rev.equalsIgnoreCase(name)) {
			sls_act_rev(value);
			return;
		}
		if ($iv_rev.equalsIgnoreCase(name)) {
			iv_rev(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($ptax_xrate.equalsIgnoreCase(name)) {
			ptax_xrate(value);
			return;
		}
		if ($qtn_rev.equalsIgnoreCase(name)) {
			qtn_rev(value);
			return;
		}
		if ($new_hdr_peg_no.equalsIgnoreCase(name)) {
			new_hdr_peg_no(value);
			return;
		}
		if ($hdr_tax_rate.equalsIgnoreCase(name)) {
			hdr_tax_rate(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
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
		if ($base_cur_upri_dec_place.equalsIgnoreCase(name)) {
			base_cur_upri_dec_place(value);
			return;
		}
		if ($base_cur_amt_dec_place.equalsIgnoreCase(name)) {
			base_cur_amt_dec_place(value);
			return;
		}
		if ($ptax_cur_upri_dec_place.equalsIgnoreCase(name)) {
			ptax_cur_upri_dec_place(value);
			return;
		}
		if ($ptax_cur_amt_dec_place.equalsIgnoreCase(name)) {
			ptax_cur_amt_dec_place(value);
			return;
		}
		if ($dlv_slip_seq.equalsIgnoreCase(name)) {
			dlv_slip_seq(value);
			return;
		}
		if ($dlv_slip_rev.equalsIgnoreCase(name)) {
			dlv_slip_rev(value);
			return;
		}
		if ($iv_upd_cntr.equalsIgnoreCase(name)) {
			iv_upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($ac_dt.equalsIgnoreCase(name)) {
			ac_dt(value);
			return;
		}
		if ($can_ac_dt.equalsIgnoreCase(name)) {
			can_ac_dt(value);
			return;
		}
		if ($sls_dt.equalsIgnoreCase(name)) {
			sls_dt(value);
			return;
		}
		if ($ship_tm.equalsIgnoreCase(name)) {
			ship_tm(value);
			return;
		}
		if ($dlv_tm.equalsIgnoreCase(name)) {
			dlv_tm(value);
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
		if ($iv_dt.equalsIgnoreCase(name)) {
			iv_dt(value);
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
		if ($rcv_schd_dt.equalsIgnoreCase(name)) {
			rcv_schd_dt(value);
			return;
		}
		if ($bill_basis_dt.equalsIgnoreCase(name)) {
			bill_basis_dt(value);
			return;
		}
		if ($adjst_tgt_dt.equalsIgnoreCase(name)) {
			adjst_tgt_dt(value);
			return;
		}
		if ($ac_ym.equalsIgnoreCase(name)) {
			ac_ym(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($cst_iv_flg.equalsIgnoreCase(name)) {
			cst_iv_flg(value);
			return;
		}
		if ($num_flg.equalsIgnoreCase(name)) {
			num_flg(value);
			return;
		}
		if ($pl_skip_flg.equalsIgnoreCase(name)) {
			pl_skip_flg(value);
			return;
		}
		if ($iv_immed_prnt_flg.equalsIgnoreCase(name)) {
			iv_immed_prnt_flg(value);
			return;
		}
		if ($del_all_sls_d_flg.equalsIgnoreCase(name)) {
			del_all_sls_d_flg(value);
			return;
		}
		if ($aprv_flg.equalsIgnoreCase(name)) {
			aprv_flg(value);
			return;
		}
		if ($dlv_slip_prnt_flg.equalsIgnoreCase(name)) {
			dlv_slip_prnt_flg(value);
			return;
		}
		if ($ship_act_service_via_flg.equalsIgnoreCase(name)) {
			ship_act_service_via_flg(value);
			return;
		}
		if ($slip_split_non_flg.equalsIgnoreCase(name)) {
			slip_split_non_flg(value);
			return;
		}
		if ($ship_act_service_exec_flg.equalsIgnoreCase(name)) {
			ship_act_service_exec_flg(value);
			return;
		}
		if ($lot_chk_off_flg.equalsIgnoreCase(name)) {
			lot_chk_off_flg(value);
			return;
		}
		if ($sls_dtl_mod_flg.equalsIgnoreCase(name)) {
			sls_dtl_mod_flg(value);
			return;
		}
		if ($no_cred_upd_flg.equalsIgnoreCase(name)) {
			no_cred_upd_flg(value);
			return;
		}
		if ($ship_act_sync_flg.equalsIgnoreCase(name)) {
			ship_act_sync_flg(value);
			return;
		}
		if ($hdr_dlv_sundry_flg.equalsIgnoreCase(name)) {
			hdr_dlv_sundry_flg(value);
			return;
		}
		if ($bef_aprv_flg.equalsIgnoreCase(name)) {
			bef_aprv_flg(value);
			return;
		}
		if ($ddlv_sls_flg.equalsIgnoreCase(name)) {
			ddlv_sls_flg(value);
			return;
		}
		if ($edi_flg.equalsIgnoreCase(name)) {
			edi_flg(value);
			return;
		}
		if ($iv_service_exec_flg.equalsIgnoreCase(name)) {
			iv_service_exec_flg(value);
			return;
		}
		if ($amt_calc_flg.equalsIgnoreCase(name)) {
			amt_calc_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

