package mcframe.clientMSBB.MSBBP1210;

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
	 * Search target No. 検索対象ＮＯ.<p>
	 *
	 */
	public static final String $srch_tgt_no = "srch_tgt_no";
	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public static final String $slo_no = "slo_no";
	/**
	 * Sales order rev. number 受注改訂番号.<p>
	 *
	 */
	public static final String $slo_rev = "slo_rev";
	/**
	 * Latest 最新.<p>
	 *
	 */
	public static final String $latest_flg = "latest_flg";
	/**
	 * Sales order date 受注日.<p>
	 *
	 */
	public static final String $slo_dt = "slo_dt";
	/**
	 * Sales order type 受注区分.<p>
	 *
	 */
	public static final String $slo_typ = "slo_typ";
	/**
	 * Sales order type name 受注区分名.<p>
	 *
	 */
	public static final String $slo_typ_nm = "slo_typ_nm";
	/**
	 * For Approval 承認対象.<p>
	 *
	 */
	public static final String $aprv_flg = "aprv_flg";
	/**
	 * Approval withdraw 承認引戻.<p>
	 *
	 */
	public static final String $aprv_back_flg = "aprv_back_flg";
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
	 * Updatable 更新可能.<p>
	 *
	 */
	public static final String $aprv_upd_flg = "aprv_upd_flg";
	/**
	 * Cancellable 取消可能.<p>
	 *
	 */
	public static final String $aprv_can_flg = "aprv_can_flg";
	/**
	 * EDI ＥＤＩ.<p>
	 *
	 */
	public static final String $edi_flg = "edi_flg";
	public static final String $dlv_p = "dlv_p";
	/**
	 * Normal customer cd. 通常得意先ＣＤ.<p>
	 *
	 */
	public static final String $def_cst_cd = "def_cst_cd";
	/**
	 * Report output locale cd. 帳票出力ロケールＣＤ.<p>
	 *
	 */
	public static final String $prnt_lcl_cd = "prnt_lcl_cd";
	/**
	 * Distribution channel cd. 1 仕向先ＣＤ１.<p>
	 *
	 */
	public static final String $dest_cd1 = "dest_cd1";
	/**
	 * Distribution channel name 1 仕向先名１.<p>
	 *
	 */
	public static final String $dest_nm1 = "dest_nm1";
	/**
	 * Distribution channel cd. 2 仕向先ＣＤ２.<p>
	 *
	 */
	public static final String $dest_cd2 = "dest_cd2";
	/**
	 * Distribution channel name 2 仕向先名２.<p>
	 *
	 */
	public static final String $dest_nm2 = "dest_nm2";
	/**
	 * Distribution channel cd. 3 仕向先ＣＤ３.<p>
	 *
	 */
	public static final String $dest_cd3 = "dest_cd3";
	/**
	 * Distribution channel name 3 仕向先名３.<p>
	 *
	 */
	public static final String $dest_nm3 = "dest_nm3";
	public static final String $tdlv_p = "tdlv_p";
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
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public static final String $cst_cd = "cst_cd";
	/**
	 * Customer name 得意先名.<p>
	 *
	 */
	public static final String $cst_nm = "cst_nm";
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
	 * Customer revenue recording type 得意先売上計上区分.<p>
	 *
	 */
	public static final String $bp_sls_basis_typ = "bp_sls_basis_typ";
	public static final String $hdr_not_lg_mix_flg = "hdr_not_lg_mix_flg";
	public static final String $hdr_not_lot_mix_flg = "hdr_not_lot_mix_flg";
	public static final String $hdr_not_sublot_mix_flg = "hdr_not_sublot_mix_flg";
	public static final String $usr_dpt_p = "usr_dpt_p";
	/**
	 * Customer PIC cd. 得意先担当者ＣＤ.<p>
	 *
	 */
	public static final String $cst_usr_cd = "cst_usr_cd";
	/**
	 * Customer dept. in charge cd. 得意先担当部門ＣＤ.<p>
	 *
	 */
	public static final String $cst_dpt_cd = "cst_dpt_cd";
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
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public static final String $trd_cur_cd = "trd_cur_cd";
	/**
	 * Transaction currency name 取引通貨名.<p>
	 *
	 */
	public static final String $trd_cur_nm = "trd_cur_nm";
	public static final String $cred_bal_p = "cred_bal_p";
	/**
	 * Transaction currency amount number of decimal places 取引通貨金額小数部有効桁数.<p>
	 *
	 */
	public static final String $trd_cur_amt_dec_place = "trd_cur_amt_dec_place";
	/**
	 * Transaction currency unit price number of decimal places 取引通貨単価小数部有効桁数.<p>
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
	 * Set exchange rate 為替レート指定.<p>
	 *
	 */
	public static final String $xrate_inpt_flg = "xrate_inpt_flg";
	public static final String $xrate_p = "xrate_p";
	/**
	 * Exchange rate cd. 為替レートＣＤ.<p>
	 *
	 */
	public static final String $xrate_cd = "xrate_cd";
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
	 * Set tax exchange rate 納税為替レート指定.<p>
	 *
	 */
	public static final String $ptax_xrate_inpt_flg = "ptax_xrate_inpt_flg";
	public static final String $ptax_xrate_p = "ptax_xrate_p";
	/**
	 * Tax currency amount number of decimal places 納税通貨金額小数部有効桁数.<p>
	 *
	 */
	public static final String $ptax_cur_amt_dec_place = "ptax_cur_amt_dec_place";
	/**
	 * Tax currency unit number of decimal places 納税通貨単価小数部有効桁数.<p>
	 *
	 */
	public static final String $ptax_cur_upri_dec_place = "ptax_cur_upri_dec_place";
	/**
	 * Receiving point required 配送先必須.<p>
	 *
	 */
	public static final String $tdlv_req_flg = "tdlv_req_flg";
	/**
	 * Allow sales unit price change 販売単価変更許可.<p>
	 *
	 */
	public static final String $sls_upri_cng_flg = "sls_upri_cng_flg";
	/**
	 * Customer invoice transaction 得意先インボイス取引.<p>
	 *
	 */
	public static final String $cst_iv_flg = "cst_iv_flg";
	/**
	 * Billing carry-over count 請求繰越回数.<p>
	 *
	 */
	public static final String $cst_bill_crryovr_times = "cst_bill_crryovr_times";
	/**
	 * Sales unit price acquisition type 販売単価取得区分.<p>
	 *
	 */
	public static final String $sls_upri_req_typ = "sls_upri_req_typ";
	/**
	 * Shipping schedule split type 出荷予定分割区分.<p>
	 *
	 */
	public static final String $ship_schd_split_typ = "ship_schd_split_typ";
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
	 * Exchange rounding type 為替端数処理区分.<p>
	 *
	 */
	public static final String $xrate_rnd_typ = "xrate_rnd_typ";
	/**
	 * Withholding tax rounding type 源泉徴収税端数処理区分.<p>
	 *
	 */
	public static final String $wtax_rnd_typ = "wtax_rnd_typ";
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
	 * Quotation expiration date 見積有効期限.<p>
	 *
	 */
	public static final String $qtn_valid_dt = "qtn_valid_dt";
	public static final String $wrk_no_p = "wrk_no_p";
	/**
	 * Gross profit rate 粗利率.<p>
	 *
	 */
	public static final String $prof_rate = "prof_rate";
	public static final String $ttl_amt_p = "ttl_amt_p";
	public static final String $ttl_amt_no_cost_p = "ttl_amt_no_cost_p";
	/**
	 * Total gross profit amount (Base currency) 基準通貨粗利対象計.<p>
	 *
	 */
	public static final String $base_cur_ttl_amt = "base_cur_ttl_amt";
	/**
	 * Total amount of cost 原価金額計.<p>
	 *
	 */
	public static final String $ttl_cost_amt = "ttl_cost_amt";
	public static final String $trd_cur_amt_p = "trd_cur_amt_p";
	public static final String $trd_cur_inc_tax_amt_p = "trd_cur_inc_tax_amt_p";
	/**
	 * Assortment type 品揃区分.<p>
	 *
	 */
	public static final String $assort_typ = "assort_typ";
	/**
	 * Assortment type name 品揃区分名.<p>
	 *
	 */
	public static final String $assort_typ_nm = "assort_typ_nm";
	/**
	 * Advance received control shipping type 前受金出荷制御区分.<p>
	 *
	 */
	public static final String $adv_ship_ctrl_typ = "adv_ship_ctrl_typ";
	/**
	 * Advance received shipping control type name 前受金出荷制御区分名.<p>
	 *
	 */
	public static final String $adv_ship_ctrl_typ_nm = "adv_ship_ctrl_typ_nm";
	public static final String $adv_bill_amt_p = "adv_bill_amt_p";
	public static final String $adv_rcv_amt_p = "adv_rcv_amt_p";
	/**
	 * Customer order No. 得意先注文ＮＯ.<p>
	 *
	 */
	public static final String $cst_po_no = "cst_po_no";
	/**
	 * Customer order rev. number 得意先注文改訂番号.<p>
	 *
	 */
	public static final String $cst_po_rev = "cst_po_rev";
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
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public static final String $iv_no = "iv_no";
	/**
	 * Auto 自動.<p>
	 *
	 */
	public static final String $iv_num_flg = "iv_num_flg";
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
	 * Customer order remarks 得意先注文備考.<p>
	 *
	 */
	public static final String $cst_po_rmrks = "cst_po_rmrks";
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
	 * EDI spare CHAR column 1 ＥＤＩ予備ＣＨＡＲ項目１.<p>
	 *
	 */
	public static final String $edi_sub_char1 = "edi_sub_char1";
	/**
	 * EDI spare CHAR column 2 ＥＤＩ予備ＣＨＡＲ項目２.<p>
	 *
	 */
	public static final String $edi_sub_char2 = "edi_sub_char2";
	/**
	 * EDI spare CHAR column 3 ＥＤＩ予備ＣＨＡＲ項目３.<p>
	 *
	 */
	public static final String $edi_sub_char3 = "edi_sub_char3";
	/**
	 * EDI spare CHAR column 4 ＥＤＩ予備ＣＨＡＲ項目４.<p>
	 *
	 */
	public static final String $edi_sub_char4 = "edi_sub_char4";
	/**
	 * EDI spare CHAR column 5 ＥＤＩ予備ＣＨＡＲ項目５.<p>
	 *
	 */
	public static final String $edi_sub_char5 = "edi_sub_char5";
	/**
	 * EDI spare NUM column 1 ＥＤＩ予備ＮＵＭ項目１.<p>
	 *
	 */
	public static final String $edi_sub_num1 = "edi_sub_num1";
	/**
	 * EDI spare DATE column 1 ＥＤＩ予備ＤＡＴＥ項目１.<p>
	 *
	 */
	public static final String $edi_sub_dt1 = "edi_sub_dt1";
	/**
	 * Canceling reason cd. 取消理由ＣＤ.<p>
	 *
	 */
	public static final String $can_rsn_cd = "can_rsn_cd";
	/**
	 * Canceling reason name 取消理由名.<p>
	 *
	 */
	public static final String $can_rsn_nm = "can_rsn_nm";
	/**
	 * Cancel remarks 取消備考.<p>
	 *
	 */
	public static final String $can_rmrks = "can_rmrks";
	/**
	 * For original approval 元承認対象.<p>
	 *
	 */
	public static final String $old_aprv_flg = "old_aprv_flg";
	/**
	 * Original approval No. 元承認ＮＯ.<p>
	 *
	 */
	public static final String $old_aprv_no = "old_aprv_no";
	/**
	 * Original approval status type 元承認状況区分.<p>
	 *
	 */
	public static final String $old_aprv_sts_typ = "old_aprv_sts_typ";
	/**
	 * Original update possible 元更新可能.<p>
	 *
	 */
	public static final String $old_can_upd_flg = "old_can_upd_flg";
	/**
	 * Original cancellation possible 元取消可能.<p>
	 *
	 */
	public static final String $old_can_del_flg = "old_can_del_flg";
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
	/**
	 * Sales order header update counter 受注ヘッダ更新カウンタ.<p>
	 *
	 */
	public static final String $slo_upd_cntr = "slo_upd_cntr";
	/**
	 * Quotation header update counter 見積ヘッダ更新カウンタ.<p>
	 *
	 */
	public static final String $qtn_upd_cntr = "qtn_upd_cntr";
	public static final String $ship_rqst_p = "ship_rqst_p";
	public static final String $dlv_rqst_p = "dlv_rqst_p";
	/**
	 * Day type 曜日区分.<p>
	 *
	 */
	public static final String $dlv_day_week_typ = "dlv_day_week_typ";
	/**
	 * Arrival day of week 着曜日.<p>
	 *
	 */
	public static final String $dlv_day_week_typ_nm = "dlv_day_week_typ_nm";
	/**
	 * Free reason 無償理由ＣＤ.<p>
	 *
	 */
	public static final String $frc_rsn_cd = "frc_rsn_cd";
	/**
	 * Free reason name 無償理由.<p>
	 *
	 */
	public static final String $frc_rsn_cd_nm = "frc_rsn_cd_nm";
	/**
	 * Sales condition cd. 売上条件区分ＣＤ.<p>
	 *
	 */
	public static final String $sales_cond = "sales_cond";
	/**
	 * Sales condition name 売上条件区分名.<p>
	 *
	 */
	public static final String $sales_cond_nm = "sales_cond_nm";
	/**
	 * Sales date 売上日.<p>
	 *
	 */
	public static final String $sls_dt = "sls_dt";
	/**
	 *  出荷帳票得意先名印字しない.<p>
	 *
	 */
	public static final String $ship_prnt_no_cst_nm_flg = "ship_prnt_no_cst_nm_flg";
	/**
	 *  元案件ＮＯ.<p>
	 *
	 */
	public static final String $src_wrk_no = "src_wrk_no";
	/**
	 *  ＺＯＨＯ販売予定ＮＯ.<p>
	 *
	 */
	public static final String $zoho_sls_schd_no = "zoho_sls_schd_no";
	/**
	 *  受注最終出荷売上.<p>
	 *
	 */
	public static final String $slo_last_sls_flg = "slo_last_sls_flg";
	public static final String $par_itm_p = "par_itm_p";
	/**
	 *  数量（ヘッダ）.<p>
	 *
	 */
	public static final String $hdr_qty = "hdr_qty";
	/**
	 *  測線数.<p>
	 *
	 */
	public static final String $surv_line_qty = "surv_line_qty";
	/**
	 *  口径.<p>
	 *
	 */
	public static final String $diameter = "diameter";
	/**
	 *  照合キー.<p>
	 *
	 */
	public static final String $match_key = "match_key";

	public static final String $dlv_cd = $dlv_p + ".bp_cd";
	public static final String $dlv_nm = $dlv_p + ".bp_nm";
	public static final String $dlv_sundry_flg = $dlv_p + ".dlv_sundry_flg";
	public static final String $pri_prnt_flg = $dlv_p + ".pri_prnt_flg";
	public static final String $dlv_lg_grp_cd = $dlv_p + ".lg_grp_cd";
	public static final String $dlv_lg_grp_nm = $dlv_p + ".lg_grp_nm";
	public static final String $dlv_cntry_cd = $dlv_p + ".cntry_cd";
	public static final String $dlv_cntry_nm = $dlv_p + ".cntry_nm";
	public static final String $dlv_zip_cd = $dlv_p + ".zip_cd";
	public static final String $dlv_addr1 = $dlv_p + ".addr1";
	public static final String $dlv_addr2 = $dlv_p + ".addr2";
	public static final String $dlv_addr3 = $dlv_p + ".addr3";
	public static final String $dlv_addr4 = $dlv_p + ".addr4";
	public static final String $dlv_tel = $dlv_p + ".tel";
	public static final String $dlv_fax = $dlv_p + ".fax";
	public static final String $dlv_cntct_dpt = $dlv_p + ".dlv_cntct_dpt";
	public static final String $dlv_cntct_psn = $dlv_p + ".dlv_cntct_psn";
	public static final String $tdlv_cd = $tdlv_p + ".bp_cd";
	public static final String $tdlv_nm = $tdlv_p + ".bp_nm";
	public static final String $tdlv_sundry_flg = $tdlv_p + ".dlv_sundry_flg";
	public static final String $tdlv_lg_grp_cd = $tdlv_p + ".lg_grp_cd";
	public static final String $tdlv_lg_grp_nm = $tdlv_p + ".lg_grp_nm";
	public static final String $tdlv_cntry_cd = $tdlv_p + ".cntry_cd";
	public static final String $tdlv_cntry_nm = $tdlv_p + ".cntry_nm";
	public static final String $tdlv_zip_cd = $tdlv_p + ".zip_cd";
	public static final String $tdlv_addr1 = $tdlv_p + ".addr1";
	public static final String $tdlv_addr2 = $tdlv_p + ".addr2";
	public static final String $tdlv_addr3 = $tdlv_p + ".addr3";
	public static final String $tdlv_addr4 = $tdlv_p + ".addr4";
	public static final String $tdlv_tel = $tdlv_p + ".tel";
	public static final String $tdlv_fax = $tdlv_p + ".fax";
	public static final String $tdlv_cntct_dpt = $tdlv_p + ".dlv_cntct_dpt";
	public static final String $tdlv_cntct_psn = $tdlv_p + ".dlv_cntct_psn";
	public static final String $sls_usr_cd = $usr_dpt_p + ".usr_cd";
	public static final String $sls_usr_nm = $usr_dpt_p + ".usr_nm";
	public static final String $sls_dpt_cd = $usr_dpt_p + ".dpt_cd";
	public static final String $sls_dpt_nm = $usr_dpt_p + ".dpt_nm";
	public static final String $cred_bal = $cred_bal_p + ".amt";
	public static final String $xrate = $xrate_p + ".xrate";
	public static final String $ptax_xrate = $ptax_xrate_p + ".xrate";
	public static final String $wrk_no = $wrk_no_p + ".wrk_no";
	public static final String $wrk_nm = $wrk_no_p + ".wrk_nm";
	public static final String $ttl_amt = $ttl_amt_p + ".amt";
	public static final String $ttl_amt_no_cost = $ttl_amt_no_cost_p + ".amt";
	public static final String $trd_cur_amt = $trd_cur_amt_p + ".amt";
	public static final String $trd_cur_inc_tax_amt = $trd_cur_inc_tax_amt_p + ".amt";
	public static final String $adv_bill_amt = $adv_bill_amt_p + ".amt";
	public static final String $adv_rcv_amt = $adv_rcv_amt_p + ".amt";
	public static final String $ship_rqst_dt = $ship_rqst_p + ".ymd";
	public static final String $ship_rqst_hm = $ship_rqst_p + ".hm";
	public static final String $dlv_rqst_dt = $dlv_rqst_p + ".ymd";
	public static final String $dlv_rqst_hm = $dlv_rqst_p + ".hm";
	public static final String $par_itm_cd = $par_itm_p + ".itm_cd";
	public static final String $par_itm_sub1 = $par_itm_p + ".itm_sub1";
	public static final String $par_itm_sub2 = $par_itm_p + ".itm_sub2";
	public static final String $par_itm_sub3 = $par_itm_p + ".itm_sub3";
	public static final String $par_itm_nm = $par_itm_p + ".itm_nm";

	public static final MCMeta trd_cd_META = createCommonMeta($trd_cd, mcframe.commonMA.meta.MA_META.TRD_CD);
	public static final MCMeta trd_nm_META = createCommonMeta($trd_nm, mcframe.commonMA.meta.MA_META.TRD_NM);
	public static final MCMeta trd_ptn_typ_META = createCommonMeta($trd_ptn_typ, mcframe.commonMA.meta.MA_META.TRD_PTN_TYP);
	public static final MCMeta srch_tgt_no_META = createCommonMeta($srch_tgt_no, mcframe.commonMS.meta.MS_META.SRCH_TGT_NO);
	public static final MCMeta slo_no_META = createCommonMeta($slo_no, mcframe.commonMA.meta.MA_META.SLO_NO);
	public static final MCMeta slo_rev_META = createCommonMeta($slo_rev, mcframe.commonMA.meta.MA_META.SLIP_REV);
	public static final MCMeta latest_flg_META = createCommonMeta($latest_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta slo_dt_META = createCommonMeta($slo_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta slo_typ_META = createCommonMeta($slo_typ, mcframe.commonMS.meta.MS_META.SLO_TYP);
	public static final MCMeta slo_typ_nm_META = createCommonMeta($slo_typ_nm, mcframe.commonMS.meta.MS_META.SLO_TYP_NM);
	public static final MCMeta aprv_flg_META = createCommonMeta($aprv_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta aprv_back_flg_META = createCommonMeta($aprv_back_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta aprv_no_META = createCommonMeta($aprv_no, mcframe.commonMA.meta.MA_META.APRV_NO);
	public static final MCMeta aprv_sts_typ_META = createCommonMeta($aprv_sts_typ, mcframe.commonMA.meta.MA_META.APRV_STS_TYP);
	public static final MCMeta aprv_sts_typ_nm_META = createCommonMeta($aprv_sts_typ_nm, mcframe.commonMA.meta.MA_META.APRV_STS_TYP_NM);
	public static final MCMeta aprv_upd_flg_META = createCommonMeta($aprv_upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta aprv_can_flg_META = createCommonMeta($aprv_can_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta edi_flg_META = createCommonMeta($edi_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dlv_p_META = createInnerRowMeta($dlv_p, mcframe.clientMAUB.MAUBP0210.DlvR.class);
	public static final MCMeta def_cst_cd_META = createCommonMeta($def_cst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta prnt_lcl_cd_META = createCommonMeta($prnt_lcl_cd, mcframe.commonMA.meta.MA_META.LCL_CD);
	public static final MCMeta dest_cd1_META = createCommonMeta($dest_cd1, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta dest_nm1_META = createCommonMeta($dest_nm1, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta dest_cd2_META = createCommonMeta($dest_cd2, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta dest_nm2_META = createCommonMeta($dest_nm2, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta dest_cd3_META = createCommonMeta($dest_cd3, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta dest_nm3_META = createCommonMeta($dest_nm3, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta tdlv_p_META = createInnerRowMeta($tdlv_p, mcframe.clientMAUB.MAUBP0210.DlvR.class);
	public static final MCMeta via_dlv_typ_META = createCommonMeta($via_dlv_typ, mcframe.commonMA.meta.MA_META.VIA_DLV_TYP);
	public static final MCMeta via_dlv_typ_nm_META = createCommonMeta($via_dlv_typ_nm, mcframe.commonMA.meta.MA_META.VIA_DLV_TYP_NM);
	public static final MCMeta cst_cd_META = createCommonMeta($cst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta cst_nm_META = createCommonMeta($cst_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta sls_basis_typ_META = createCommonMeta($sls_basis_typ, mcframe.commonMA.meta.MA_META.SLS_BASIS_TYP);
	public static final MCMeta sls_basis_typ_nm_META = createCommonMeta($sls_basis_typ_nm, mcframe.commonMA.meta.MA_META.SLS_BASIS_TYP_NM);
	public static final MCMeta bp_sls_basis_typ_META = createCommonMeta($bp_sls_basis_typ, mcframe.commonMA.meta.MA_META.SLS_BASIS_TYP);
	public static final MCMeta hdr_not_lg_mix_flg_META = createCommonMeta($hdr_not_lg_mix_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta hdr_not_lot_mix_flg_META = createCommonMeta($hdr_not_lot_mix_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta hdr_not_sublot_mix_flg_META = createCommonMeta($hdr_not_sublot_mix_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta usr_dpt_p_META = createInnerRowMeta($usr_dpt_p, mcframe.clientMAUB.MAUBP0320.UsrDptR.class);
	public static final MCMeta cst_usr_cd_META = createCommonMeta($cst_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta cst_dpt_cd_META = createCommonMeta($cst_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta ar_dpt_typ_META = createCommonMeta($ar_dpt_typ, mcframe.commonMA.meta.MA_META.AR_DPT_TYP);
	public static final MCMeta lnk_ar_dpt_cd_META = createCommonMeta($lnk_ar_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta wg_nm_META = createCommonMeta($wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta trd_cur_cd_META = createCommonMeta($trd_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta trd_cur_nm_META = createCommonMeta($trd_cur_nm, mcframe.commonMA.meta.MA_META.CUR_NM);
	public static final MCMeta cred_bal_p_META = createInnerRowMeta($cred_bal_p, mcframe.clientMAUB.MAUBP0060.AmtR.class);
	public static final MCMeta trd_cur_amt_dec_place_META = createCommonMeta($trd_cur_amt_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta trd_cur_upri_dec_place_META = createCommonMeta($trd_cur_upri_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta base_cur_cd_META = createCommonMeta($base_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta base_cur_nm_META = createCommonMeta($base_cur_nm, mcframe.commonMA.meta.MA_META.CUR_NM);
	public static final MCMeta xrate_inpt_flg_META = createCommonMeta($xrate_inpt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta xrate_p_META = createInnerRowMeta($xrate_p, mcframe.clientMAUB.MAUBP0420.XrateR.class);
	public static final MCMeta xrate_cd_META = createCommonMeta($xrate_cd, mcframe.commonMA.meta.MA_META.XRATE_CD);
	public static final MCMeta base_cur_amt_dec_place_META = createCommonMeta($base_cur_amt_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta base_cur_upri_dec_place_META = createCommonMeta($base_cur_upri_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta ptax_cur_cd_META = createCommonMeta($ptax_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta ptax_cur_nm_META = createCommonMeta($ptax_cur_nm, mcframe.commonMA.meta.MA_META.CUR_NM);
	public static final MCMeta ptax_xrate_inpt_flg_META = createCommonMeta($ptax_xrate_inpt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ptax_xrate_p_META = createInnerRowMeta($ptax_xrate_p, mcframe.clientMAUB.MAUBP0420.XrateR.class);
	public static final MCMeta ptax_cur_amt_dec_place_META = createCommonMeta($ptax_cur_amt_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta ptax_cur_upri_dec_place_META = createCommonMeta($ptax_cur_upri_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta tdlv_req_flg_META = createCommonMeta($tdlv_req_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sls_upri_cng_flg_META = createCommonMeta($sls_upri_cng_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cst_iv_flg_META = createCommonMeta($cst_iv_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cst_bill_crryovr_times_META = createCommonMeta($cst_bill_crryovr_times, mcframe.commonMA.meta.MA_META.CRRYOVR_TIMES);
	public static final MCMeta sls_upri_req_typ_META = createCommonMeta($sls_upri_req_typ, mcframe.commonMA.meta.MA_META.SLS_UPRI_REQ_TYP);
	public static final MCMeta ship_schd_split_typ_META = createCommonMeta($ship_schd_split_typ, mcframe.commonMA.meta.MA_META.SHIP_SCHD_SPLIT_TYP);
	public static final MCMeta sls_amt_rnd_typ_META = createCommonMeta($sls_amt_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta sls_tax_rnd_typ_META = createCommonMeta($sls_tax_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta xrate_rnd_typ_META = createCommonMeta($xrate_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta wtax_rnd_typ_META = createCommonMeta($wtax_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta qtn_no_META = createCommonMeta($qtn_no, mcframe.commonMA.meta.MA_META.QTN_NO);
	public static final MCMeta qtn_rev_META = createCommonMeta($qtn_rev, mcframe.commonMA.meta.MA_META.SLIP_REV);
	public static final MCMeta qtn_valid_dt_META = createCommonMeta($qtn_valid_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta wrk_no_p_META = createInnerRowMeta($wrk_no_p, mcframe.clientMSUB.MSUBP0010.WrkNoR.class);
	public static final MCMeta prof_rate_META = createCommonMeta($prof_rate, mcframe.commonMA.meta.MA_META.PER);
	public static final MCMeta ttl_amt_p_META = createInnerRowMeta($ttl_amt_p, mcframe.clientMAUB.MAUBP0060.AmtR.class);
	public static final MCMeta ttl_amt_no_cost_p_META = createInnerRowMeta($ttl_amt_no_cost_p, mcframe.clientMAUB.MAUBP0060.AmtR.class);
	public static final MCMeta base_cur_ttl_amt_META = createCommonMeta($base_cur_ttl_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta ttl_cost_amt_META = createCommonMeta($ttl_cost_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta trd_cur_amt_p_META = createInnerRowMeta($trd_cur_amt_p, mcframe.clientMAUB.MAUBP0060.AmtR.class);
	public static final MCMeta trd_cur_inc_tax_amt_p_META = createInnerRowMeta($trd_cur_inc_tax_amt_p, mcframe.clientMAUB.MAUBP0060.AmtR.class);
	public static final MCMeta assort_typ_META = createCommonMeta($assort_typ, mcframe.commonMS.meta.MS_META.SHIP_ASSORT_TYP);
	public static final MCMeta assort_typ_nm_META = createCommonMeta($assort_typ_nm, mcframe.commonMS.meta.MS_META.SHIP_ASSORT_TYP_NM);
	public static final MCMeta adv_ship_ctrl_typ_META = createCommonMeta($adv_ship_ctrl_typ, mcframe.commonMS.meta.MS_META.ADV_SHIP_CTRL_TYP);
	public static final MCMeta adv_ship_ctrl_typ_nm_META = createCommonMeta($adv_ship_ctrl_typ_nm, mcframe.commonMS.meta.MS_META.ADV_SHIP_CTRL_TYP_NM);
	public static final MCMeta adv_bill_amt_p_META = createInnerRowMeta($adv_bill_amt_p, mcframe.clientMAUB.MAUBP0060.AmtR.class);
	public static final MCMeta adv_rcv_amt_p_META = createInnerRowMeta($adv_rcv_amt_p, mcframe.clientMAUB.MAUBP0060.AmtR.class);
	public static final MCMeta cst_po_no_META = createCommonMeta($cst_po_no, mcframe.commonMA.meta.MA_META.CST_PO_NO);
	public static final MCMeta cst_po_rev_META = createCommonMeta($cst_po_rev, mcframe.commonMA.meta.MA_META.SLIP_REV);
	public static final MCMeta rcpt_dt_META = createCommonMeta($rcpt_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta rcpt_usr_cd_META = createCommonMeta($rcpt_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta rcpt_usr_nm_META = createCommonMeta($rcpt_usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta acst_cd_META = createCommonMeta($acst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta acst_nm_META = createCommonMeta($acst_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta ar_dpt_cd_META = createCommonMeta($ar_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta ar_dpt_nm_META = createCommonMeta($ar_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta iv_no_META = createCommonMeta($iv_no, mcframe.commonMA.meta.MA_META.IV_NO);
	public static final MCMeta iv_num_flg_META = createCommonMeta($iv_num_flg, mcframe.commonMA.meta.MA_META.FLG);
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
	public static final MCMeta tterm_cd3_META = createCommonMeta($tterm_cd3, mcframe.commonMA.meta.MA_META.TTERM_CD);
	public static final MCMeta tterm_nm3_META = createCommonMeta($tterm_nm3, mcframe.commonMA.meta.MA_META.TTERM_NM);
	public static final MCMeta tterm_rmrks3_META = createCommonMeta($tterm_rmrks3, mcframe.commonMS.meta.MS_META.TTERM_RMRKS3);
	public static final MCMeta cst_po_rmrks_META = createCommonMeta($cst_po_rmrks, mcframe.commonMS.meta.MS_META.CST_PO_RMRKS);
	public static final MCMeta trd_rmrks_META = createCommonMeta($trd_rmrks, mcframe.commonMA.meta.MA_META.TRD_RMRKS);
	public static final MCMeta intr_rmrks_META = createCommonMeta($intr_rmrks, mcframe.commonMS.meta.MS_META.SLO_INTR_RMRKS);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.SLO_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.SLO_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.SLO_SUB_CHAR3);
	public static final MCMeta edi_sub_char1_META = createCommonMeta($edi_sub_char1, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR1);
	public static final MCMeta edi_sub_char2_META = createCommonMeta($edi_sub_char2, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR2);
	public static final MCMeta edi_sub_char3_META = createCommonMeta($edi_sub_char3, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR3);
	public static final MCMeta edi_sub_char4_META = createCommonMeta($edi_sub_char4, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR4);
	public static final MCMeta edi_sub_char5_META = createCommonMeta($edi_sub_char5, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR5);
	public static final MCMeta edi_sub_num1_META = createCommonMeta($edi_sub_num1, mcframe.commonMA.meta.MA_META.IF_SUB_NUM1);
	public static final MCMeta edi_sub_dt1_META = createCommonMeta($edi_sub_dt1, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta can_rsn_cd_META = createCommonMeta($can_rsn_cd, mcframe.commonMS.meta.MS_META.SLO_RSN_CD);
	public static final MCMeta can_rsn_nm_META = createCommonMeta($can_rsn_nm, mcframe.commonMS.meta.MS_META.SLO_RSN_NM);
	public static final MCMeta can_rmrks_META = createCommonMeta($can_rmrks, mcframe.commonMS.meta.MS_META.SLO_CAN_RMRKS);
	public static final MCMeta old_aprv_flg_META = createCommonMeta($old_aprv_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta old_aprv_no_META = createCommonMeta($old_aprv_no, mcframe.commonMA.meta.MA_META.APRV_NO);
	public static final MCMeta old_aprv_sts_typ_META = createCommonMeta($old_aprv_sts_typ, mcframe.commonMA.meta.MA_META.APRV_STS_TYP);
	public static final MCMeta old_can_upd_flg_META = createCommonMeta($old_can_upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta old_can_del_flg_META = createCommonMeta($old_can_del_flg, mcframe.commonMA.meta.MA_META.FLG);
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
	public static final MCMeta slo_upd_cntr_META = createCommonMeta($slo_upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);
	public static final MCMeta qtn_upd_cntr_META = createCommonMeta($qtn_upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);
	public static final MCMeta ship_rqst_p_META = createInnerRowMeta($ship_rqst_p, mcframe.clientMAUB.MAUBP0110.YmdHmR.class);
	public static final MCMeta dlv_rqst_p_META = createInnerRowMeta($dlv_rqst_p, mcframe.clientMAUB.MAUBP0110.YmdHmR.class);
	public static final MCMeta dlv_day_week_typ_META = createCommonMeta($dlv_day_week_typ, mcframe.commonMA.meta.MA_META.DAY_WEEK_TYP);
	public static final MCMeta dlv_day_week_typ_nm_META = createCommonMeta($dlv_day_week_typ_nm, mcframe.commonMA.meta.MA_META.DAY_WEEK_TYP_NM);
	public static final MCMeta frc_rsn_cd_META = createCommonMeta($frc_rsn_cd, mcframe.commonMA.meta.MA_META.FRC_RSN_CD);
	public static final MCMeta frc_rsn_cd_nm_META = createCommonMeta($frc_rsn_cd_nm, mcframe.commonMA.meta.MA_META.FRC_RSN_NM);
	public static final MCMeta sales_cond_META = createCommonMeta($sales_cond, mcframe.commonMA.meta.MA_META.SALES_COND);
	public static final MCMeta sales_cond_nm_META = createCommonMeta($sales_cond_nm, mcframe.commonMA.meta.MA_META.SALES_COND_NM);
	public static final MCMeta sls_dt_META = createCommonMeta($sls_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta ship_prnt_no_cst_nm_flg_META = createCommonMeta($ship_prnt_no_cst_nm_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta src_wrk_no_META = createCommonMeta($src_wrk_no, mcframe.commonMA.meta.MA_META.WRK_NO);
	public static final MCMeta zoho_sls_schd_no_META = createCommonMeta($zoho_sls_schd_no, mcframe.commonMA.meta.MA_META.ZOHO_SLS_SCHD_NO);
	public static final MCMeta slo_last_sls_flg_META = createCommonMeta($slo_last_sls_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta par_itm_p_META = createInnerRowMeta($par_itm_p, mcframe.clientMAUB.MAUBP0030.ItmR.class);
	public static final MCMeta hdr_qty_META = createCommonMeta($hdr_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta surv_line_qty_META = createCommonMeta($surv_line_qty, mcframe.commonMA.meta.MA_META.SURV_LINE_QTY);
	public static final MCMeta diameter_META = createCommonMeta($diameter, mcframe.commonMA.meta.MA_META.DIAMETER);
	public static final MCMeta match_key_META = createCommonMeta($match_key, mcframe.commonMA.meta.MA_META.MATCH_KEY);

	protected static final ConstMetaList<HdrR> constMetas = new ConstMetaList<HdrR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			trd_cd_META,
			trd_nm_META,
			trd_ptn_typ_META,
			srch_tgt_no_META,
			slo_no_META,
			slo_rev_META,
			latest_flg_META,
			slo_dt_META,
			slo_typ_META,
			slo_typ_nm_META,
			aprv_flg_META,
			aprv_back_flg_META,
			aprv_no_META,
			aprv_sts_typ_META,
			aprv_sts_typ_nm_META,
			aprv_upd_flg_META,
			aprv_can_flg_META,
			edi_flg_META,
			dlv_p_META,
			def_cst_cd_META,
			prnt_lcl_cd_META,
			dest_cd1_META,
			dest_nm1_META,
			dest_cd2_META,
			dest_nm2_META,
			dest_cd3_META,
			dest_nm3_META,
			tdlv_p_META,
			via_dlv_typ_META,
			via_dlv_typ_nm_META,
			cst_cd_META,
			cst_nm_META,
			sls_basis_typ_META,
			sls_basis_typ_nm_META,
			bp_sls_basis_typ_META,
			hdr_not_lg_mix_flg_META,
			hdr_not_lot_mix_flg_META,
			hdr_not_sublot_mix_flg_META,
			usr_dpt_p_META,
			cst_usr_cd_META,
			cst_dpt_cd_META,
			ar_dpt_typ_META,
			lnk_ar_dpt_cd_META,
			wg_cd_META,
			wg_nm_META,
			trd_cur_cd_META,
			trd_cur_nm_META,
			cred_bal_p_META,
			trd_cur_amt_dec_place_META,
			trd_cur_upri_dec_place_META,
			base_cur_cd_META,
			base_cur_nm_META,
			xrate_inpt_flg_META,
			xrate_p_META,
			xrate_cd_META,
			base_cur_amt_dec_place_META,
			base_cur_upri_dec_place_META,
			ptax_cur_cd_META,
			ptax_cur_nm_META,
			ptax_xrate_inpt_flg_META,
			ptax_xrate_p_META,
			ptax_cur_amt_dec_place_META,
			ptax_cur_upri_dec_place_META,
			tdlv_req_flg_META,
			sls_upri_cng_flg_META,
			cst_iv_flg_META,
			cst_bill_crryovr_times_META,
			sls_upri_req_typ_META,
			ship_schd_split_typ_META,
			sls_amt_rnd_typ_META,
			sls_tax_rnd_typ_META,
			xrate_rnd_typ_META,
			wtax_rnd_typ_META,
			qtn_no_META,
			qtn_rev_META,
			qtn_valid_dt_META,
			wrk_no_p_META,
			prof_rate_META,
			ttl_amt_p_META,
			ttl_amt_no_cost_p_META,
			base_cur_ttl_amt_META,
			ttl_cost_amt_META,
			trd_cur_amt_p_META,
			trd_cur_inc_tax_amt_p_META,
			assort_typ_META,
			assort_typ_nm_META,
			adv_ship_ctrl_typ_META,
			adv_ship_ctrl_typ_nm_META,
			adv_bill_amt_p_META,
			adv_rcv_amt_p_META,
			cst_po_no_META,
			cst_po_rev_META,
			rcpt_dt_META,
			rcpt_usr_cd_META,
			rcpt_usr_nm_META,
			acst_cd_META,
			acst_nm_META,
			ar_dpt_cd_META,
			ar_dpt_nm_META,
			iv_no_META,
			iv_num_flg_META,
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
			tterm_cd3_META,
			tterm_nm3_META,
			tterm_rmrks3_META,
			cst_po_rmrks_META,
			trd_rmrks_META,
			intr_rmrks_META,
			sub_char1_META,
			sub_char2_META,
			sub_char3_META,
			edi_sub_char1_META,
			edi_sub_char2_META,
			edi_sub_char3_META,
			edi_sub_char4_META,
			edi_sub_char5_META,
			edi_sub_num1_META,
			edi_sub_dt1_META,
			can_rsn_cd_META,
			can_rsn_nm_META,
			can_rmrks_META,
			old_aprv_flg_META,
			old_aprv_no_META,
			old_aprv_sts_typ_META,
			old_can_upd_flg_META,
			old_can_del_flg_META,
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
			upd_srv_req_no_META,
			slo_upd_cntr_META,
			qtn_upd_cntr_META,
			ship_rqst_p_META,
			dlv_rqst_p_META,
			dlv_day_week_typ_META,
			dlv_day_week_typ_nm_META,
			frc_rsn_cd_META,
			frc_rsn_cd_nm_META,
			sales_cond_META,
			sales_cond_nm_META,
			sls_dt_META,
			ship_prnt_no_cst_nm_flg_META,
			src_wrk_no_META,
			zoho_sls_schd_no_META,
			slo_last_sls_flg_META,
			par_itm_p_META,
			hdr_qty_META,
			surv_line_qty_META,
			diameter_META,
			match_key_META
		},
		new String[][]{
			{
				"dlv_cd",
				"dlv_nm",
				"dlv_sundry_flg",
				"pri_prnt_flg",
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
				"tdlv_cd",
				"tdlv_nm",
				"tdlv_sundry_flg",
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
				"sls_usr_cd",
				"sls_usr_nm",
				"sls_dpt_cd",
				"sls_dpt_nm",
				"cred_bal",
				"xrate",
				"ptax_xrate",
				"wrk_no",
				"wrk_nm",
				"ttl_amt",
				"ttl_amt_no_cost",
				"trd_cur_amt",
				"trd_cur_inc_tax_amt",
				"adv_bill_amt",
				"adv_rcv_amt",
				"ship_rqst_dt",
				"ship_rqst_hm",
				"dlv_rqst_dt",
				"dlv_rqst_hm",
				"par_itm_cd",
				"par_itm_sub1",
				"par_itm_sub2",
				"par_itm_sub3",
				"par_itm_nm"
			},
			{
				$dlv_cd,
				$dlv_nm,
				$dlv_sundry_flg,
				$pri_prnt_flg,
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
				$tdlv_cd,
				$tdlv_nm,
				$tdlv_sundry_flg,
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
				$sls_usr_cd,
				$sls_usr_nm,
				$sls_dpt_cd,
				$sls_dpt_nm,
				$cred_bal,
				$xrate,
				$ptax_xrate,
				$wrk_no,
				$wrk_nm,
				$ttl_amt,
				$ttl_amt_no_cost,
				$trd_cur_amt,
				$trd_cur_inc_tax_amt,
				$adv_bill_amt,
				$adv_rcv_amt,
				$ship_rqst_dt,
				$ship_rqst_hm,
				$dlv_rqst_dt,
				$dlv_rqst_hm,
				$par_itm_cd,
				$par_itm_sub1,
				$par_itm_sub2,
				$par_itm_sub3,
				$par_itm_nm
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
				{$dlv_p + ".bp_cd", "bp_nm;dlv_sundry_flg;pri_prnt_flg;zip_cd;addr1;addr2;addr3;addr4;cntry_cd;cntry_nm;tel;fax;dlv_cntct_dpt;dlv_cntct_psn;lg_grp_cd;tdlv_req_flg;def_cst_cd;prnt_lcl_cd"},	// dlv_p.bp_cd
				{$dest_cd1, "bp_nm"},	// dest_cd1
				{$dest_cd2, "bp_nm"},	// dest_cd2
				{$dest_cd3, "bp_nm"},	// dest_cd3
				{$tdlv_p + ".bp_cd", "bp_nm;dlv_sundry_flg;lg_grp_cd;cntry_cd;cntry_nm;zip_cd;addr1;addr2;addr3;addr4;tel;fax;dlv_cntct_dpt;dlv_cntct_psn;via_dlv_typ"},	// tdlv_p.bp_cd
				{$cst_cd, "bp_nm;sls_basis_typ;sls_basis_typ;cur_cd;cst_tterm_cd1;cst_tterm_cd2;cst_tterm_cd3;acst_cd;acst_nm;cst_iv_flg;sls_amt_rnd_typ;sls_tax_rnd_typ;sls_upri_cng_flg;cst_usr_cd;cst_dpt_cd;ar_dpt_typ;ar_dpt_cd;sls_upri_req_typ;ship_schd_split_typ;bill_crryovr_times;not_lg_mix_flg;not_lot_mix_flg;not_sublot_mix_flg"},	// cst_cd
				{$usr_dpt_p + ".dpt_cd", "dpt_nm;wg_cd;wg_nm"},	// usr_dpt_p.dpt_cd
				{$trd_cur_cd, "cur_nm;amt_dec_place;upri_dec_place"},	// trd_cur_cd
				{$assort_typ, "ship_assort_typ_nm"},	// assort_typ
				{$rcpt_usr_cd, "usr_nm"},	// rcpt_usr_cd
				{$ar_dpt_cd, "dpt_nm"},	// ar_dpt_cd
				{$load_port_cd, "port_nm"},	// load_port_cd
				{$dschrg_port_cd, "port_nm"},	// dschrg_port_cd
				{$via_port_cd, "port_nm"},	// via_port_cd
				{$tterm_cd1, "tterm_nm"},	// tterm_cd1
				{$tterm_cd2, "tterm_nm"},	// tterm_cd2
				{$tterm_cd3, "tterm_nm"},	// tterm_cd3
				{$can_rsn_cd, "slo_rsn_nm"},	// can_rsn_cd
				{$dlv_day_week_typ_nm, "day_week_typ"}	// dlv_day_week_typ_nm
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$trd_cd, "sls_dpt_cd"},	// trd_cd
				{$dlv_p + ".bp_cd", "MAC_BP_IS_SRCH_TYP.DLV;slo_dt"},	// dlv_p.bp_cd
				{$dest_cd1, "MAC_BP_IS_SRCH_TYP.DEST"},	// dest_cd1
				{$dest_cd2, "MAC_BP_IS_SRCH_TYP.DEST"},	// dest_cd2
				{$dest_cd3, "MAC_BP_IS_SRCH_TYP.DEST"},	// dest_cd3
				{$tdlv_p + ".bp_cd", "MAC_BP_IS_SRCH_TYP.TDLV;slo_dt"},	// tdlv_p.bp_cd
				{$cst_cd, "MAC_BP_IS_SRCH_TYP.CST_NOT_SUNDRY;slo_dt"},	// cst_cd
				{$usr_dpt_p + ".dpt_cd", "MAC_DPT_IS_SRCH_TYP.SLS;slo_dt;sls_usr_cd;true"},	// usr_dpt_p.dpt_cd
				{$rcpt_usr_cd, "false"},	// rcpt_usr_cd
				{$ar_dpt_cd, "MAC_DPT_IS_SRCH_TYP.AR;slo_dt"}	// ar_dpt_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$dlv_p + ".bp_cd", "bp_is_srch_typ;dt"},	// dlv_p.bp_cd
				{$dest_cd1, "bp_is_srch_typ"},	// dest_cd1
				{$dest_cd2, "bp_is_srch_typ"},	// dest_cd2
				{$dest_cd3, "bp_is_srch_typ"},	// dest_cd3
				{$tdlv_p + ".bp_cd", "bp_is_srch_typ;dt"},	// tdlv_p.bp_cd
				{$cst_cd, "bp_is_srch_typ;dt"},	// cst_cd
				{$usr_dpt_p + ".dpt_cd", "dpt_is_srch_typ;dt;usr_cd;wr_flg"},	// usr_dpt_p.dpt_cd
				{$rcpt_usr_cd, "referring_usr_acl_flg"},	// rcpt_usr_cd
				{$ar_dpt_cd, "dpt_is_srch_typ;dt"}	// ar_dpt_cd
			}
		)),
		new MCExtMap.Entry($$DISP_CTL, new MCExtList(
			new String[][]{
				{$dest_cd1, "DEST1"},	// dest_cd1
				{$dest_nm1, "DEST1"},	// dest_nm1
				{$dest_cd2, "DEST2"},	// dest_cd2
				{$dest_nm2, "DEST2"},	// dest_nm2
				{$dest_cd3, "DEST3"},	// dest_cd3
				{$dest_nm3, "DEST3"},	// dest_nm3
				{$wg_cd, "WG"},	// wg_cd
				{$wg_nm, "WG"},	// wg_nm
				{$cred_bal_p + ".amt", "CRED"},	// cred_bal_p.amt
				{$base_cur_cd, "BASE_CUR"},	// base_cur_cd
				{$base_cur_nm, "BASE_CUR"},	// base_cur_nm
				{$xrate_inpt_flg, "BASE_CUR"},	// xrate_inpt_flg
				{$xrate_p + ".xrate", "BASE_CUR"},	// xrate_p.xrate
				{$xrate_cd, "BASE_CUR"},	// xrate_cd
				{$base_cur_amt_dec_place, "BASE_CUR"},	// base_cur_amt_dec_place
				{$base_cur_upri_dec_place, "BASE_CUR"},	// base_cur_upri_dec_place
				{$ptax_cur_cd, "PTAX"},	// ptax_cur_cd
				{$ptax_cur_nm, "PTAX"},	// ptax_cur_nm
				{$ptax_xrate_inpt_flg, "PTAX"},	// ptax_xrate_inpt_flg
				{$ptax_xrate_p + ".xrate", "PTAX"},	// ptax_xrate_p.xrate
				{$ptax_cur_amt_dec_place, "PTAX"},	// ptax_cur_amt_dec_place
				{$ptax_cur_upri_dec_place, "PTAX"},	// ptax_cur_upri_dec_place
				{$xrate_rnd_typ, "BASE_CUR"},	// xrate_rnd_typ
				{$wtax_rnd_typ, "WTAX"},	// wtax_rnd_typ
				{$ship_rqst_p + ".hm", "TM"},	// ship_rqst_p.hm
				{$dlv_rqst_p + ".hm", "TM"}	// dlv_rqst_p.hm
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
	 * Search target No. 検索対象ＮＯ.<p>
	 *
	 */
	public String srch_tgt_no() {
		return getConstString(offset + 3, $srch_tgt_no);
	}

	/**
	 * Search target No. 検索対象ＮＯ.<p>
	 *
	 */
	public void srch_tgt_no(String value) {
		setConstString(offset + 3, $srch_tgt_no, value);
	}


	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public String slo_no() {
		return getConstString(offset + 4, $slo_no);
	}

	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public void slo_no(String value) {
		setConstString(offset + 4, $slo_no, value);
	}


	/**
	 * Sales order rev. number 受注改訂番号.<p>
	 *
	 */
	public MCNumber slo_rev() {
		return getConstNumber(offset + 5, $slo_rev);
	}

	/**
	 * Sales order rev. number 受注改訂番号.<p>
	 *
	 */
	public void slo_rev(MCNumber value) {
		setConstNumber(offset + 5, $slo_rev, value);
	}

	/**
	 * Sales order rev. number 受注改訂番号.<p>
	 *
	 */
	public void slo_rev(int value) {
		setConstNumber(offset + 5, $slo_rev, value);
	}

	/**
	 * Sales order rev. number 受注改訂番号.<p>
	 *
	 */
	public void slo_rev(long value) {
		setConstNumber(offset + 5, $slo_rev, value);
	}

	/**
	 * Sales order rev. number 受注改訂番号.<p>
	 *
	 */
	public void slo_rev(float value) {
		setConstNumber(offset + 5, $slo_rev, value);
	}

	/**
	 * Sales order rev. number 受注改訂番号.<p>
	 *
	 */
	public void slo_rev(double value) {
		setConstNumber(offset + 5, $slo_rev, value);
	}


	/**
	 * Latest 最新.<p>
	 *
	 */
	public boolean latest_flg() {
		return getConstBoolean(offset + 6, $latest_flg);
	}

	/**
	 * Latest 最新.<p>
	 *
	 */
	public void latest_flg(boolean value) {
		setConstBoolean(offset + 6, $latest_flg, value);
	}


	/**
	 * Sales order date 受注日.<p>
	 *
	 */
	public MCDate slo_dt() {
		return getConstDate(offset + 7, $slo_dt);
	}

	/**
	 * Sales order date 受注日.<p>
	 *
	 */
	public void slo_dt(MCDate value) {
		setConstDate(offset + 7, $slo_dt, value);
	}


	/**
	 * Sales order type 受注区分.<p>
	 *
	 */
	public String slo_typ() {
		return getConstString(offset + 8, $slo_typ);
	}

	/**
	 * Sales order type 受注区分.<p>
	 *
	 */
	public void slo_typ(String value) {
		setConstString(offset + 8, $slo_typ, value);
	}


	/**
	 * Sales order type name 受注区分名.<p>
	 *
	 */
	public String slo_typ_nm() {
		return getConstString(offset + 9, $slo_typ_nm);
	}

	/**
	 * Sales order type name 受注区分名.<p>
	 *
	 */
	public void slo_typ_nm(String value) {
		setConstString(offset + 9, $slo_typ_nm, value);
	}


	/**
	 * For Approval 承認対象.<p>
	 *
	 */
	public boolean aprv_flg() {
		return getConstBoolean(offset + 10, $aprv_flg);
	}

	/**
	 * For Approval 承認対象.<p>
	 *
	 */
	public void aprv_flg(boolean value) {
		setConstBoolean(offset + 10, $aprv_flg, value);
	}


	/**
	 * Approval withdraw 承認引戻.<p>
	 *
	 */
	public boolean aprv_back_flg() {
		return getConstBoolean(offset + 11, $aprv_back_flg);
	}

	/**
	 * Approval withdraw 承認引戻.<p>
	 *
	 */
	public void aprv_back_flg(boolean value) {
		setConstBoolean(offset + 11, $aprv_back_flg, value);
	}


	/**
	 * Approval No. 承認ＮＯ.<p>
	 *
	 */
	public String aprv_no() {
		return getConstString(offset + 12, $aprv_no);
	}

	/**
	 * Approval No. 承認ＮＯ.<p>
	 *
	 */
	public void aprv_no(String value) {
		setConstString(offset + 12, $aprv_no, value);
	}


	/**
	 * Approval status type 承認状況区分.<p>
	 *
	 */
	public String aprv_sts_typ() {
		return getConstString(offset + 13, $aprv_sts_typ);
	}

	/**
	 * Approval status type 承認状況区分.<p>
	 *
	 */
	public void aprv_sts_typ(String value) {
		setConstString(offset + 13, $aprv_sts_typ, value);
	}


	/**
	 * Approval status type name 承認状況区分名.<p>
	 *
	 */
	public String aprv_sts_typ_nm() {
		return getConstString(offset + 14, $aprv_sts_typ_nm);
	}

	/**
	 * Approval status type name 承認状況区分名.<p>
	 *
	 */
	public void aprv_sts_typ_nm(String value) {
		setConstString(offset + 14, $aprv_sts_typ_nm, value);
	}


	/**
	 * Updatable 更新可能.<p>
	 *
	 */
	public boolean aprv_upd_flg() {
		return getConstBoolean(offset + 15, $aprv_upd_flg);
	}

	/**
	 * Updatable 更新可能.<p>
	 *
	 */
	public void aprv_upd_flg(boolean value) {
		setConstBoolean(offset + 15, $aprv_upd_flg, value);
	}


	/**
	 * Cancellable 取消可能.<p>
	 *
	 */
	public boolean aprv_can_flg() {
		return getConstBoolean(offset + 16, $aprv_can_flg);
	}

	/**
	 * Cancellable 取消可能.<p>
	 *
	 */
	public void aprv_can_flg(boolean value) {
		setConstBoolean(offset + 16, $aprv_can_flg, value);
	}


	/**
	 * EDI ＥＤＩ.<p>
	 *
	 */
	public boolean edi_flg() {
		return getConstBoolean(offset + 17, $edi_flg);
	}

	/**
	 * EDI ＥＤＩ.<p>
	 *
	 */
	public void edi_flg(boolean value) {
		setConstBoolean(offset + 17, $edi_flg, value);
	}


	public mcframe.clientMAUB.MAUBP0210.DlvR dlv_p(){
		return (mcframe.clientMAUB.MAUBP0210.DlvR) getConstInnerRow(offset + 18, $dlv_p);
	}
	
	public void dlv_p(mcframe.clientMAUB.MAUBP0210.DlvR row){
		setConstInnerRow(offset + 18, $dlv_p, row);
	}


	/**
	 * Normal customer cd. 通常得意先ＣＤ.<p>
	 *
	 */
	public String def_cst_cd() {
		return getConstString(offset + 19, $def_cst_cd);
	}

	/**
	 * Normal customer cd. 通常得意先ＣＤ.<p>
	 *
	 */
	public void def_cst_cd(String value) {
		setConstString(offset + 19, $def_cst_cd, value);
	}


	/**
	 * Report output locale cd. 帳票出力ロケールＣＤ.<p>
	 *
	 */
	public String prnt_lcl_cd() {
		return getConstString(offset + 20, $prnt_lcl_cd);
	}

	/**
	 * Report output locale cd. 帳票出力ロケールＣＤ.<p>
	 *
	 */
	public void prnt_lcl_cd(String value) {
		setConstString(offset + 20, $prnt_lcl_cd, value);
	}


	/**
	 * Distribution channel cd. 1 仕向先ＣＤ１.<p>
	 *
	 */
	public String dest_cd1() {
		return getConstString(offset + 21, $dest_cd1);
	}

	/**
	 * Distribution channel cd. 1 仕向先ＣＤ１.<p>
	 *
	 */
	public void dest_cd1(String value) {
		setConstString(offset + 21, $dest_cd1, value);
	}


	/**
	 * Distribution channel name 1 仕向先名１.<p>
	 *
	 */
	public String dest_nm1() {
		return getConstString(offset + 22, $dest_nm1);
	}

	/**
	 * Distribution channel name 1 仕向先名１.<p>
	 *
	 */
	public void dest_nm1(String value) {
		setConstString(offset + 22, $dest_nm1, value);
	}


	/**
	 * Distribution channel cd. 2 仕向先ＣＤ２.<p>
	 *
	 */
	public String dest_cd2() {
		return getConstString(offset + 23, $dest_cd2);
	}

	/**
	 * Distribution channel cd. 2 仕向先ＣＤ２.<p>
	 *
	 */
	public void dest_cd2(String value) {
		setConstString(offset + 23, $dest_cd2, value);
	}


	/**
	 * Distribution channel name 2 仕向先名２.<p>
	 *
	 */
	public String dest_nm2() {
		return getConstString(offset + 24, $dest_nm2);
	}

	/**
	 * Distribution channel name 2 仕向先名２.<p>
	 *
	 */
	public void dest_nm2(String value) {
		setConstString(offset + 24, $dest_nm2, value);
	}


	/**
	 * Distribution channel cd. 3 仕向先ＣＤ３.<p>
	 *
	 */
	public String dest_cd3() {
		return getConstString(offset + 25, $dest_cd3);
	}

	/**
	 * Distribution channel cd. 3 仕向先ＣＤ３.<p>
	 *
	 */
	public void dest_cd3(String value) {
		setConstString(offset + 25, $dest_cd3, value);
	}


	/**
	 * Distribution channel name 3 仕向先名３.<p>
	 *
	 */
	public String dest_nm3() {
		return getConstString(offset + 26, $dest_nm3);
	}

	/**
	 * Distribution channel name 3 仕向先名３.<p>
	 *
	 */
	public void dest_nm3(String value) {
		setConstString(offset + 26, $dest_nm3, value);
	}


	public mcframe.clientMAUB.MAUBP0210.DlvR tdlv_p(){
		return (mcframe.clientMAUB.MAUBP0210.DlvR) getConstInnerRow(offset + 27, $tdlv_p);
	}
	
	public void tdlv_p(mcframe.clientMAUB.MAUBP0210.DlvR row){
		setConstInnerRow(offset + 27, $tdlv_p, row);
	}


	/**
	 * Receiving point stopover type 配送先経由区分.<p>
	 *
	 */
	public String via_dlv_typ() {
		return getConstString(offset + 28, $via_dlv_typ);
	}

	/**
	 * Receiving point stopover type 配送先経由区分.<p>
	 *
	 */
	public void via_dlv_typ(String value) {
		setConstString(offset + 28, $via_dlv_typ, value);
	}


	/**
	 * Receiving point stopover name 配送先経由区分名.<p>
	 *
	 */
	public String via_dlv_typ_nm() {
		return getConstString(offset + 29, $via_dlv_typ_nm);
	}

	/**
	 * Receiving point stopover name 配送先経由区分名.<p>
	 *
	 */
	public void via_dlv_typ_nm(String value) {
		setConstString(offset + 29, $via_dlv_typ_nm, value);
	}


	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public String cst_cd() {
		return getConstString(offset + 30, $cst_cd);
	}

	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public void cst_cd(String value) {
		setConstString(offset + 30, $cst_cd, value);
	}


	/**
	 * Customer name 得意先名.<p>
	 *
	 */
	public String cst_nm() {
		return getConstString(offset + 31, $cst_nm);
	}

	/**
	 * Customer name 得意先名.<p>
	 *
	 */
	public void cst_nm(String value) {
		setConstString(offset + 31, $cst_nm, value);
	}


	/**
	 * Revenue recording type 売上計上区分.<p>
	 *
	 */
	public String sls_basis_typ() {
		return getConstString(offset + 32, $sls_basis_typ);
	}

	/**
	 * Revenue recording type 売上計上区分.<p>
	 *
	 */
	public void sls_basis_typ(String value) {
		setConstString(offset + 32, $sls_basis_typ, value);
	}


	/**
	 * Revenue recording type name 売上計上区分名.<p>
	 *
	 */
	public String sls_basis_typ_nm() {
		return getConstString(offset + 33, $sls_basis_typ_nm);
	}

	/**
	 * Revenue recording type name 売上計上区分名.<p>
	 *
	 */
	public void sls_basis_typ_nm(String value) {
		setConstString(offset + 33, $sls_basis_typ_nm, value);
	}


	/**
	 * Customer revenue recording type 得意先売上計上区分.<p>
	 *
	 */
	public String bp_sls_basis_typ() {
		return getConstString(offset + 34, $bp_sls_basis_typ);
	}

	/**
	 * Customer revenue recording type 得意先売上計上区分.<p>
	 *
	 */
	public void bp_sls_basis_typ(String value) {
		setConstString(offset + 34, $bp_sls_basis_typ, value);
	}


	public boolean hdr_not_lg_mix_flg() {
		return getConstBoolean(offset + 35, $hdr_not_lg_mix_flg);
	}

	public void hdr_not_lg_mix_flg(boolean value) {
		setConstBoolean(offset + 35, $hdr_not_lg_mix_flg, value);
	}


	public boolean hdr_not_lot_mix_flg() {
		return getConstBoolean(offset + 36, $hdr_not_lot_mix_flg);
	}

	public void hdr_not_lot_mix_flg(boolean value) {
		setConstBoolean(offset + 36, $hdr_not_lot_mix_flg, value);
	}


	public boolean hdr_not_sublot_mix_flg() {
		return getConstBoolean(offset + 37, $hdr_not_sublot_mix_flg);
	}

	public void hdr_not_sublot_mix_flg(boolean value) {
		setConstBoolean(offset + 37, $hdr_not_sublot_mix_flg, value);
	}


	public mcframe.clientMAUB.MAUBP0320.UsrDptR usr_dpt_p(){
		return (mcframe.clientMAUB.MAUBP0320.UsrDptR) getConstInnerRow(offset + 38, $usr_dpt_p);
	}
	
	public void usr_dpt_p(mcframe.clientMAUB.MAUBP0320.UsrDptR row){
		setConstInnerRow(offset + 38, $usr_dpt_p, row);
	}


	/**
	 * Customer PIC cd. 得意先担当者ＣＤ.<p>
	 *
	 */
	public String cst_usr_cd() {
		return getConstString(offset + 39, $cst_usr_cd);
	}

	/**
	 * Customer PIC cd. 得意先担当者ＣＤ.<p>
	 *
	 */
	public void cst_usr_cd(String value) {
		setConstString(offset + 39, $cst_usr_cd, value);
	}


	/**
	 * Customer dept. in charge cd. 得意先担当部門ＣＤ.<p>
	 *
	 */
	public String cst_dpt_cd() {
		return getConstString(offset + 40, $cst_dpt_cd);
	}

	/**
	 * Customer dept. in charge cd. 得意先担当部門ＣＤ.<p>
	 *
	 */
	public void cst_dpt_cd(String value) {
		setConstString(offset + 40, $cst_dpt_cd, value);
	}


	/**
	 * AR dept. type 債権部門区分.<p>
	 *
	 */
	public String ar_dpt_typ() {
		return getConstString(offset + 41, $ar_dpt_typ);
	}

	/**
	 * AR dept. type 債権部門区分.<p>
	 *
	 */
	public void ar_dpt_typ(String value) {
		setConstString(offset + 41, $ar_dpt_typ, value);
	}


	/**
	 * AR dept. cd. 債権部門ＣＤ.<p>
	 *
	 */
	public String lnk_ar_dpt_cd() {
		return getConstString(offset + 42, $lnk_ar_dpt_cd);
	}

	/**
	 * AR dept. cd. 債権部門ＣＤ.<p>
	 *
	 */
	public void lnk_ar_dpt_cd(String value) {
		setConstString(offset + 42, $lnk_ar_dpt_cd, value);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 43, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 43, $wg_cd, value);
	}


	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public String wg_nm() {
		return getConstString(offset + 44, $wg_nm);
	}

	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public void wg_nm(String value) {
		setConstString(offset + 44, $wg_nm, value);
	}


	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public String trd_cur_cd() {
		return getConstString(offset + 45, $trd_cur_cd);
	}

	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public void trd_cur_cd(String value) {
		setConstString(offset + 45, $trd_cur_cd, value);
	}


	/**
	 * Transaction currency name 取引通貨名.<p>
	 *
	 */
	public String trd_cur_nm() {
		return getConstString(offset + 46, $trd_cur_nm);
	}

	/**
	 * Transaction currency name 取引通貨名.<p>
	 *
	 */
	public void trd_cur_nm(String value) {
		setConstString(offset + 46, $trd_cur_nm, value);
	}


	public mcframe.clientMAUB.MAUBP0060.AmtR cred_bal_p(){
		return (mcframe.clientMAUB.MAUBP0060.AmtR) getConstInnerRow(offset + 47, $cred_bal_p);
	}
	
	public void cred_bal_p(mcframe.clientMAUB.MAUBP0060.AmtR row){
		setConstInnerRow(offset + 47, $cred_bal_p, row);
	}


	/**
	 * Transaction currency amount number of decimal places 取引通貨金額小数部有効桁数.<p>
	 *
	 */
	public MCNumber trd_cur_amt_dec_place() {
		return getConstNumber(offset + 48, $trd_cur_amt_dec_place);
	}

	/**
	 * Transaction currency amount number of decimal places 取引通貨金額小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_amt_dec_place(MCNumber value) {
		setConstNumber(offset + 48, $trd_cur_amt_dec_place, value);
	}

	/**
	 * Transaction currency amount number of decimal places 取引通貨金額小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_amt_dec_place(int value) {
		setConstNumber(offset + 48, $trd_cur_amt_dec_place, value);
	}

	/**
	 * Transaction currency amount number of decimal places 取引通貨金額小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_amt_dec_place(long value) {
		setConstNumber(offset + 48, $trd_cur_amt_dec_place, value);
	}

	/**
	 * Transaction currency amount number of decimal places 取引通貨金額小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_amt_dec_place(float value) {
		setConstNumber(offset + 48, $trd_cur_amt_dec_place, value);
	}

	/**
	 * Transaction currency amount number of decimal places 取引通貨金額小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_amt_dec_place(double value) {
		setConstNumber(offset + 48, $trd_cur_amt_dec_place, value);
	}


	/**
	 * Transaction currency unit price number of decimal places 取引通貨単価小数部有効桁数.<p>
	 *
	 */
	public MCNumber trd_cur_upri_dec_place() {
		return getConstNumber(offset + 49, $trd_cur_upri_dec_place);
	}

	/**
	 * Transaction currency unit price number of decimal places 取引通貨単価小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_upri_dec_place(MCNumber value) {
		setConstNumber(offset + 49, $trd_cur_upri_dec_place, value);
	}

	/**
	 * Transaction currency unit price number of decimal places 取引通貨単価小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_upri_dec_place(int value) {
		setConstNumber(offset + 49, $trd_cur_upri_dec_place, value);
	}

	/**
	 * Transaction currency unit price number of decimal places 取引通貨単価小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_upri_dec_place(long value) {
		setConstNumber(offset + 49, $trd_cur_upri_dec_place, value);
	}

	/**
	 * Transaction currency unit price number of decimal places 取引通貨単価小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_upri_dec_place(float value) {
		setConstNumber(offset + 49, $trd_cur_upri_dec_place, value);
	}

	/**
	 * Transaction currency unit price number of decimal places 取引通貨単価小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_upri_dec_place(double value) {
		setConstNumber(offset + 49, $trd_cur_upri_dec_place, value);
	}


	/**
	 * Base currency cd. 基準通貨ＣＤ.<p>
	 *
	 */
	public String base_cur_cd() {
		return getConstString(offset + 50, $base_cur_cd);
	}

	/**
	 * Base currency cd. 基準通貨ＣＤ.<p>
	 *
	 */
	public void base_cur_cd(String value) {
		setConstString(offset + 50, $base_cur_cd, value);
	}


	/**
	 * Base currency name 基準通貨名.<p>
	 *
	 */
	public String base_cur_nm() {
		return getConstString(offset + 51, $base_cur_nm);
	}

	/**
	 * Base currency name 基準通貨名.<p>
	 *
	 */
	public void base_cur_nm(String value) {
		setConstString(offset + 51, $base_cur_nm, value);
	}


	/**
	 * Set exchange rate 為替レート指定.<p>
	 *
	 */
	public boolean xrate_inpt_flg() {
		return getConstBoolean(offset + 52, $xrate_inpt_flg);
	}

	/**
	 * Set exchange rate 為替レート指定.<p>
	 *
	 */
	public void xrate_inpt_flg(boolean value) {
		setConstBoolean(offset + 52, $xrate_inpt_flg, value);
	}


	public mcframe.clientMAUB.MAUBP0420.XrateR xrate_p(){
		return (mcframe.clientMAUB.MAUBP0420.XrateR) getConstInnerRow(offset + 53, $xrate_p);
	}
	
	public void xrate_p(mcframe.clientMAUB.MAUBP0420.XrateR row){
		setConstInnerRow(offset + 53, $xrate_p, row);
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
	 * Base currency amount number of decimal places 基準通貨金額小数部有効桁数.<p>
	 *
	 */
	public MCNumber base_cur_amt_dec_place() {
		return getConstNumber(offset + 55, $base_cur_amt_dec_place);
	}

	/**
	 * Base currency amount number of decimal places 基準通貨金額小数部有効桁数.<p>
	 *
	 */
	public void base_cur_amt_dec_place(MCNumber value) {
		setConstNumber(offset + 55, $base_cur_amt_dec_place, value);
	}

	/**
	 * Base currency amount number of decimal places 基準通貨金額小数部有効桁数.<p>
	 *
	 */
	public void base_cur_amt_dec_place(int value) {
		setConstNumber(offset + 55, $base_cur_amt_dec_place, value);
	}

	/**
	 * Base currency amount number of decimal places 基準通貨金額小数部有効桁数.<p>
	 *
	 */
	public void base_cur_amt_dec_place(long value) {
		setConstNumber(offset + 55, $base_cur_amt_dec_place, value);
	}

	/**
	 * Base currency amount number of decimal places 基準通貨金額小数部有効桁数.<p>
	 *
	 */
	public void base_cur_amt_dec_place(float value) {
		setConstNumber(offset + 55, $base_cur_amt_dec_place, value);
	}

	/**
	 * Base currency amount number of decimal places 基準通貨金額小数部有効桁数.<p>
	 *
	 */
	public void base_cur_amt_dec_place(double value) {
		setConstNumber(offset + 55, $base_cur_amt_dec_place, value);
	}


	/**
	 * Base currency unit price number of decimal places 基準通貨単価小数部有効桁数.<p>
	 *
	 */
	public MCNumber base_cur_upri_dec_place() {
		return getConstNumber(offset + 56, $base_cur_upri_dec_place);
	}

	/**
	 * Base currency unit price number of decimal places 基準通貨単価小数部有効桁数.<p>
	 *
	 */
	public void base_cur_upri_dec_place(MCNumber value) {
		setConstNumber(offset + 56, $base_cur_upri_dec_place, value);
	}

	/**
	 * Base currency unit price number of decimal places 基準通貨単価小数部有効桁数.<p>
	 *
	 */
	public void base_cur_upri_dec_place(int value) {
		setConstNumber(offset + 56, $base_cur_upri_dec_place, value);
	}

	/**
	 * Base currency unit price number of decimal places 基準通貨単価小数部有効桁数.<p>
	 *
	 */
	public void base_cur_upri_dec_place(long value) {
		setConstNumber(offset + 56, $base_cur_upri_dec_place, value);
	}

	/**
	 * Base currency unit price number of decimal places 基準通貨単価小数部有効桁数.<p>
	 *
	 */
	public void base_cur_upri_dec_place(float value) {
		setConstNumber(offset + 56, $base_cur_upri_dec_place, value);
	}

	/**
	 * Base currency unit price number of decimal places 基準通貨単価小数部有効桁数.<p>
	 *
	 */
	public void base_cur_upri_dec_place(double value) {
		setConstNumber(offset + 56, $base_cur_upri_dec_place, value);
	}


	/**
	 * Taxpaying currency cd. 納税通貨ＣＤ.<p>
	 *
	 */
	public String ptax_cur_cd() {
		return getConstString(offset + 57, $ptax_cur_cd);
	}

	/**
	 * Taxpaying currency cd. 納税通貨ＣＤ.<p>
	 *
	 */
	public void ptax_cur_cd(String value) {
		setConstString(offset + 57, $ptax_cur_cd, value);
	}


	/**
	 * Tax currency name 納税通貨名.<p>
	 *
	 */
	public String ptax_cur_nm() {
		return getConstString(offset + 58, $ptax_cur_nm);
	}

	/**
	 * Tax currency name 納税通貨名.<p>
	 *
	 */
	public void ptax_cur_nm(String value) {
		setConstString(offset + 58, $ptax_cur_nm, value);
	}


	/**
	 * Set tax exchange rate 納税為替レート指定.<p>
	 *
	 */
	public boolean ptax_xrate_inpt_flg() {
		return getConstBoolean(offset + 59, $ptax_xrate_inpt_flg);
	}

	/**
	 * Set tax exchange rate 納税為替レート指定.<p>
	 *
	 */
	public void ptax_xrate_inpt_flg(boolean value) {
		setConstBoolean(offset + 59, $ptax_xrate_inpt_flg, value);
	}


	public mcframe.clientMAUB.MAUBP0420.XrateR ptax_xrate_p(){
		return (mcframe.clientMAUB.MAUBP0420.XrateR) getConstInnerRow(offset + 60, $ptax_xrate_p);
	}
	
	public void ptax_xrate_p(mcframe.clientMAUB.MAUBP0420.XrateR row){
		setConstInnerRow(offset + 60, $ptax_xrate_p, row);
	}


	/**
	 * Tax currency amount number of decimal places 納税通貨金額小数部有効桁数.<p>
	 *
	 */
	public MCNumber ptax_cur_amt_dec_place() {
		return getConstNumber(offset + 61, $ptax_cur_amt_dec_place);
	}

	/**
	 * Tax currency amount number of decimal places 納税通貨金額小数部有効桁数.<p>
	 *
	 */
	public void ptax_cur_amt_dec_place(MCNumber value) {
		setConstNumber(offset + 61, $ptax_cur_amt_dec_place, value);
	}

	/**
	 * Tax currency amount number of decimal places 納税通貨金額小数部有効桁数.<p>
	 *
	 */
	public void ptax_cur_amt_dec_place(int value) {
		setConstNumber(offset + 61, $ptax_cur_amt_dec_place, value);
	}

	/**
	 * Tax currency amount number of decimal places 納税通貨金額小数部有効桁数.<p>
	 *
	 */
	public void ptax_cur_amt_dec_place(long value) {
		setConstNumber(offset + 61, $ptax_cur_amt_dec_place, value);
	}

	/**
	 * Tax currency amount number of decimal places 納税通貨金額小数部有効桁数.<p>
	 *
	 */
	public void ptax_cur_amt_dec_place(float value) {
		setConstNumber(offset + 61, $ptax_cur_amt_dec_place, value);
	}

	/**
	 * Tax currency amount number of decimal places 納税通貨金額小数部有効桁数.<p>
	 *
	 */
	public void ptax_cur_amt_dec_place(double value) {
		setConstNumber(offset + 61, $ptax_cur_amt_dec_place, value);
	}


	/**
	 * Tax currency unit number of decimal places 納税通貨単価小数部有効桁数.<p>
	 *
	 */
	public MCNumber ptax_cur_upri_dec_place() {
		return getConstNumber(offset + 62, $ptax_cur_upri_dec_place);
	}

	/**
	 * Tax currency unit number of decimal places 納税通貨単価小数部有効桁数.<p>
	 *
	 */
	public void ptax_cur_upri_dec_place(MCNumber value) {
		setConstNumber(offset + 62, $ptax_cur_upri_dec_place, value);
	}

	/**
	 * Tax currency unit number of decimal places 納税通貨単価小数部有効桁数.<p>
	 *
	 */
	public void ptax_cur_upri_dec_place(int value) {
		setConstNumber(offset + 62, $ptax_cur_upri_dec_place, value);
	}

	/**
	 * Tax currency unit number of decimal places 納税通貨単価小数部有効桁数.<p>
	 *
	 */
	public void ptax_cur_upri_dec_place(long value) {
		setConstNumber(offset + 62, $ptax_cur_upri_dec_place, value);
	}

	/**
	 * Tax currency unit number of decimal places 納税通貨単価小数部有効桁数.<p>
	 *
	 */
	public void ptax_cur_upri_dec_place(float value) {
		setConstNumber(offset + 62, $ptax_cur_upri_dec_place, value);
	}

	/**
	 * Tax currency unit number of decimal places 納税通貨単価小数部有効桁数.<p>
	 *
	 */
	public void ptax_cur_upri_dec_place(double value) {
		setConstNumber(offset + 62, $ptax_cur_upri_dec_place, value);
	}


	/**
	 * Receiving point required 配送先必須.<p>
	 *
	 */
	public boolean tdlv_req_flg() {
		return getConstBoolean(offset + 63, $tdlv_req_flg);
	}

	/**
	 * Receiving point required 配送先必須.<p>
	 *
	 */
	public void tdlv_req_flg(boolean value) {
		setConstBoolean(offset + 63, $tdlv_req_flg, value);
	}


	/**
	 * Allow sales unit price change 販売単価変更許可.<p>
	 *
	 */
	public boolean sls_upri_cng_flg() {
		return getConstBoolean(offset + 64, $sls_upri_cng_flg);
	}

	/**
	 * Allow sales unit price change 販売単価変更許可.<p>
	 *
	 */
	public void sls_upri_cng_flg(boolean value) {
		setConstBoolean(offset + 64, $sls_upri_cng_flg, value);
	}


	/**
	 * Customer invoice transaction 得意先インボイス取引.<p>
	 *
	 */
	public boolean cst_iv_flg() {
		return getConstBoolean(offset + 65, $cst_iv_flg);
	}

	/**
	 * Customer invoice transaction 得意先インボイス取引.<p>
	 *
	 */
	public void cst_iv_flg(boolean value) {
		setConstBoolean(offset + 65, $cst_iv_flg, value);
	}


	/**
	 * Billing carry-over count 請求繰越回数.<p>
	 *
	 */
	public MCNumber cst_bill_crryovr_times() {
		return getConstNumber(offset + 66, $cst_bill_crryovr_times);
	}

	/**
	 * Billing carry-over count 請求繰越回数.<p>
	 *
	 */
	public void cst_bill_crryovr_times(MCNumber value) {
		setConstNumber(offset + 66, $cst_bill_crryovr_times, value);
	}

	/**
	 * Billing carry-over count 請求繰越回数.<p>
	 *
	 */
	public void cst_bill_crryovr_times(int value) {
		setConstNumber(offset + 66, $cst_bill_crryovr_times, value);
	}

	/**
	 * Billing carry-over count 請求繰越回数.<p>
	 *
	 */
	public void cst_bill_crryovr_times(long value) {
		setConstNumber(offset + 66, $cst_bill_crryovr_times, value);
	}

	/**
	 * Billing carry-over count 請求繰越回数.<p>
	 *
	 */
	public void cst_bill_crryovr_times(float value) {
		setConstNumber(offset + 66, $cst_bill_crryovr_times, value);
	}

	/**
	 * Billing carry-over count 請求繰越回数.<p>
	 *
	 */
	public void cst_bill_crryovr_times(double value) {
		setConstNumber(offset + 66, $cst_bill_crryovr_times, value);
	}


	/**
	 * Sales unit price acquisition type 販売単価取得区分.<p>
	 *
	 */
	public String sls_upri_req_typ() {
		return getConstString(offset + 67, $sls_upri_req_typ);
	}

	/**
	 * Sales unit price acquisition type 販売単価取得区分.<p>
	 *
	 */
	public void sls_upri_req_typ(String value) {
		setConstString(offset + 67, $sls_upri_req_typ, value);
	}


	/**
	 * Shipping schedule split type 出荷予定分割区分.<p>
	 *
	 */
	public String ship_schd_split_typ() {
		return getConstString(offset + 68, $ship_schd_split_typ);
	}

	/**
	 * Shipping schedule split type 出荷予定分割区分.<p>
	 *
	 */
	public void ship_schd_split_typ(String value) {
		setConstString(offset + 68, $ship_schd_split_typ, value);
	}


	/**
	 * Rounding type (Sales amount) 売上金額端数処理区分.<p>
	 *
	 */
	public String sls_amt_rnd_typ() {
		return getConstString(offset + 69, $sls_amt_rnd_typ);
	}

	/**
	 * Rounding type (Sales amount) 売上金額端数処理区分.<p>
	 *
	 */
	public void sls_amt_rnd_typ(String value) {
		setConstString(offset + 69, $sls_amt_rnd_typ, value);
	}


	/**
	 * Sales tax rounding type 売上税端数処理区分.<p>
	 *
	 */
	public String sls_tax_rnd_typ() {
		return getConstString(offset + 70, $sls_tax_rnd_typ);
	}

	/**
	 * Sales tax rounding type 売上税端数処理区分.<p>
	 *
	 */
	public void sls_tax_rnd_typ(String value) {
		setConstString(offset + 70, $sls_tax_rnd_typ, value);
	}


	/**
	 * Exchange rounding type 為替端数処理区分.<p>
	 *
	 */
	public String xrate_rnd_typ() {
		return getConstString(offset + 71, $xrate_rnd_typ);
	}

	/**
	 * Exchange rounding type 為替端数処理区分.<p>
	 *
	 */
	public void xrate_rnd_typ(String value) {
		setConstString(offset + 71, $xrate_rnd_typ, value);
	}


	/**
	 * Withholding tax rounding type 源泉徴収税端数処理区分.<p>
	 *
	 */
	public String wtax_rnd_typ() {
		return getConstString(offset + 72, $wtax_rnd_typ);
	}

	/**
	 * Withholding tax rounding type 源泉徴収税端数処理区分.<p>
	 *
	 */
	public void wtax_rnd_typ(String value) {
		setConstString(offset + 72, $wtax_rnd_typ, value);
	}


	/**
	 * Quotation No. 見積ＮＯ.<p>
	 *
	 */
	public String qtn_no() {
		return getConstString(offset + 73, $qtn_no);
	}

	/**
	 * Quotation No. 見積ＮＯ.<p>
	 *
	 */
	public void qtn_no(String value) {
		setConstString(offset + 73, $qtn_no, value);
	}


	/**
	 * Quotation rev. number 見積改訂番号.<p>
	 *
	 */
	public MCNumber qtn_rev() {
		return getConstNumber(offset + 74, $qtn_rev);
	}

	/**
	 * Quotation rev. number 見積改訂番号.<p>
	 *
	 */
	public void qtn_rev(MCNumber value) {
		setConstNumber(offset + 74, $qtn_rev, value);
	}

	/**
	 * Quotation rev. number 見積改訂番号.<p>
	 *
	 */
	public void qtn_rev(int value) {
		setConstNumber(offset + 74, $qtn_rev, value);
	}

	/**
	 * Quotation rev. number 見積改訂番号.<p>
	 *
	 */
	public void qtn_rev(long value) {
		setConstNumber(offset + 74, $qtn_rev, value);
	}

	/**
	 * Quotation rev. number 見積改訂番号.<p>
	 *
	 */
	public void qtn_rev(float value) {
		setConstNumber(offset + 74, $qtn_rev, value);
	}

	/**
	 * Quotation rev. number 見積改訂番号.<p>
	 *
	 */
	public void qtn_rev(double value) {
		setConstNumber(offset + 74, $qtn_rev, value);
	}


	/**
	 * Quotation expiration date 見積有効期限.<p>
	 *
	 */
	public MCDate qtn_valid_dt() {
		return getConstDate(offset + 75, $qtn_valid_dt);
	}

	/**
	 * Quotation expiration date 見積有効期限.<p>
	 *
	 */
	public void qtn_valid_dt(MCDate value) {
		setConstDate(offset + 75, $qtn_valid_dt, value);
	}


	public mcframe.clientMSUB.MSUBP0010.WrkNoR wrk_no_p(){
		return (mcframe.clientMSUB.MSUBP0010.WrkNoR) getConstInnerRow(offset + 76, $wrk_no_p);
	}
	
	public void wrk_no_p(mcframe.clientMSUB.MSUBP0010.WrkNoR row){
		setConstInnerRow(offset + 76, $wrk_no_p, row);
	}


	/**
	 * Gross profit rate 粗利率.<p>
	 *
	 */
	public MCNumber prof_rate() {
		return getConstNumber(offset + 77, $prof_rate);
	}

	/**
	 * Gross profit rate 粗利率.<p>
	 *
	 */
	public void prof_rate(MCNumber value) {
		setConstNumber(offset + 77, $prof_rate, value);
	}

	/**
	 * Gross profit rate 粗利率.<p>
	 *
	 */
	public void prof_rate(int value) {
		setConstNumber(offset + 77, $prof_rate, value);
	}

	/**
	 * Gross profit rate 粗利率.<p>
	 *
	 */
	public void prof_rate(long value) {
		setConstNumber(offset + 77, $prof_rate, value);
	}

	/**
	 * Gross profit rate 粗利率.<p>
	 *
	 */
	public void prof_rate(float value) {
		setConstNumber(offset + 77, $prof_rate, value);
	}

	/**
	 * Gross profit rate 粗利率.<p>
	 *
	 */
	public void prof_rate(double value) {
		setConstNumber(offset + 77, $prof_rate, value);
	}


	public mcframe.clientMAUB.MAUBP0060.AmtR ttl_amt_p(){
		return (mcframe.clientMAUB.MAUBP0060.AmtR) getConstInnerRow(offset + 78, $ttl_amt_p);
	}
	
	public void ttl_amt_p(mcframe.clientMAUB.MAUBP0060.AmtR row){
		setConstInnerRow(offset + 78, $ttl_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP0060.AmtR ttl_amt_no_cost_p(){
		return (mcframe.clientMAUB.MAUBP0060.AmtR) getConstInnerRow(offset + 79, $ttl_amt_no_cost_p);
	}
	
	public void ttl_amt_no_cost_p(mcframe.clientMAUB.MAUBP0060.AmtR row){
		setConstInnerRow(offset + 79, $ttl_amt_no_cost_p, row);
	}


	/**
	 * Total gross profit amount (Base currency) 基準通貨粗利対象計.<p>
	 *
	 */
	public MCNumber base_cur_ttl_amt() {
		return getConstNumber(offset + 80, $base_cur_ttl_amt);
	}

	/**
	 * Total gross profit amount (Base currency) 基準通貨粗利対象計.<p>
	 *
	 */
	public void base_cur_ttl_amt(MCNumber value) {
		setConstNumber(offset + 80, $base_cur_ttl_amt, value);
	}

	/**
	 * Total gross profit amount (Base currency) 基準通貨粗利対象計.<p>
	 *
	 */
	public void base_cur_ttl_amt(int value) {
		setConstNumber(offset + 80, $base_cur_ttl_amt, value);
	}

	/**
	 * Total gross profit amount (Base currency) 基準通貨粗利対象計.<p>
	 *
	 */
	public void base_cur_ttl_amt(long value) {
		setConstNumber(offset + 80, $base_cur_ttl_amt, value);
	}

	/**
	 * Total gross profit amount (Base currency) 基準通貨粗利対象計.<p>
	 *
	 */
	public void base_cur_ttl_amt(float value) {
		setConstNumber(offset + 80, $base_cur_ttl_amt, value);
	}

	/**
	 * Total gross profit amount (Base currency) 基準通貨粗利対象計.<p>
	 *
	 */
	public void base_cur_ttl_amt(double value) {
		setConstNumber(offset + 80, $base_cur_ttl_amt, value);
	}


	/**
	 * Total amount of cost 原価金額計.<p>
	 *
	 */
	public MCNumber ttl_cost_amt() {
		return getConstNumber(offset + 81, $ttl_cost_amt);
	}

	/**
	 * Total amount of cost 原価金額計.<p>
	 *
	 */
	public void ttl_cost_amt(MCNumber value) {
		setConstNumber(offset + 81, $ttl_cost_amt, value);
	}

	/**
	 * Total amount of cost 原価金額計.<p>
	 *
	 */
	public void ttl_cost_amt(int value) {
		setConstNumber(offset + 81, $ttl_cost_amt, value);
	}

	/**
	 * Total amount of cost 原価金額計.<p>
	 *
	 */
	public void ttl_cost_amt(long value) {
		setConstNumber(offset + 81, $ttl_cost_amt, value);
	}

	/**
	 * Total amount of cost 原価金額計.<p>
	 *
	 */
	public void ttl_cost_amt(float value) {
		setConstNumber(offset + 81, $ttl_cost_amt, value);
	}

	/**
	 * Total amount of cost 原価金額計.<p>
	 *
	 */
	public void ttl_cost_amt(double value) {
		setConstNumber(offset + 81, $ttl_cost_amt, value);
	}


	public mcframe.clientMAUB.MAUBP0060.AmtR trd_cur_amt_p(){
		return (mcframe.clientMAUB.MAUBP0060.AmtR) getConstInnerRow(offset + 82, $trd_cur_amt_p);
	}
	
	public void trd_cur_amt_p(mcframe.clientMAUB.MAUBP0060.AmtR row){
		setConstInnerRow(offset + 82, $trd_cur_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP0060.AmtR trd_cur_inc_tax_amt_p(){
		return (mcframe.clientMAUB.MAUBP0060.AmtR) getConstInnerRow(offset + 83, $trd_cur_inc_tax_amt_p);
	}
	
	public void trd_cur_inc_tax_amt_p(mcframe.clientMAUB.MAUBP0060.AmtR row){
		setConstInnerRow(offset + 83, $trd_cur_inc_tax_amt_p, row);
	}


	/**
	 * Assortment type 品揃区分.<p>
	 *
	 */
	public String assort_typ() {
		return getConstString(offset + 84, $assort_typ);
	}

	/**
	 * Assortment type 品揃区分.<p>
	 *
	 */
	public void assort_typ(String value) {
		setConstString(offset + 84, $assort_typ, value);
	}


	/**
	 * Assortment type name 品揃区分名.<p>
	 *
	 */
	public String assort_typ_nm() {
		return getConstString(offset + 85, $assort_typ_nm);
	}

	/**
	 * Assortment type name 品揃区分名.<p>
	 *
	 */
	public void assort_typ_nm(String value) {
		setConstString(offset + 85, $assort_typ_nm, value);
	}


	/**
	 * Advance received control shipping type 前受金出荷制御区分.<p>
	 *
	 */
	public String adv_ship_ctrl_typ() {
		return getConstString(offset + 86, $adv_ship_ctrl_typ);
	}

	/**
	 * Advance received control shipping type 前受金出荷制御区分.<p>
	 *
	 */
	public void adv_ship_ctrl_typ(String value) {
		setConstString(offset + 86, $adv_ship_ctrl_typ, value);
	}


	/**
	 * Advance received shipping control type name 前受金出荷制御区分名.<p>
	 *
	 */
	public String adv_ship_ctrl_typ_nm() {
		return getConstString(offset + 87, $adv_ship_ctrl_typ_nm);
	}

	/**
	 * Advance received shipping control type name 前受金出荷制御区分名.<p>
	 *
	 */
	public void adv_ship_ctrl_typ_nm(String value) {
		setConstString(offset + 87, $adv_ship_ctrl_typ_nm, value);
	}


	public mcframe.clientMAUB.MAUBP0060.AmtR adv_bill_amt_p(){
		return (mcframe.clientMAUB.MAUBP0060.AmtR) getConstInnerRow(offset + 88, $adv_bill_amt_p);
	}
	
	public void adv_bill_amt_p(mcframe.clientMAUB.MAUBP0060.AmtR row){
		setConstInnerRow(offset + 88, $adv_bill_amt_p, row);
	}


	public mcframe.clientMAUB.MAUBP0060.AmtR adv_rcv_amt_p(){
		return (mcframe.clientMAUB.MAUBP0060.AmtR) getConstInnerRow(offset + 89, $adv_rcv_amt_p);
	}
	
	public void adv_rcv_amt_p(mcframe.clientMAUB.MAUBP0060.AmtR row){
		setConstInnerRow(offset + 89, $adv_rcv_amt_p, row);
	}


	/**
	 * Customer order No. 得意先注文ＮＯ.<p>
	 *
	 */
	public String cst_po_no() {
		return getConstString(offset + 90, $cst_po_no);
	}

	/**
	 * Customer order No. 得意先注文ＮＯ.<p>
	 *
	 */
	public void cst_po_no(String value) {
		setConstString(offset + 90, $cst_po_no, value);
	}


	/**
	 * Customer order rev. number 得意先注文改訂番号.<p>
	 *
	 */
	public MCNumber cst_po_rev() {
		return getConstNumber(offset + 91, $cst_po_rev);
	}

	/**
	 * Customer order rev. number 得意先注文改訂番号.<p>
	 *
	 */
	public void cst_po_rev(MCNumber value) {
		setConstNumber(offset + 91, $cst_po_rev, value);
	}

	/**
	 * Customer order rev. number 得意先注文改訂番号.<p>
	 *
	 */
	public void cst_po_rev(int value) {
		setConstNumber(offset + 91, $cst_po_rev, value);
	}

	/**
	 * Customer order rev. number 得意先注文改訂番号.<p>
	 *
	 */
	public void cst_po_rev(long value) {
		setConstNumber(offset + 91, $cst_po_rev, value);
	}

	/**
	 * Customer order rev. number 得意先注文改訂番号.<p>
	 *
	 */
	public void cst_po_rev(float value) {
		setConstNumber(offset + 91, $cst_po_rev, value);
	}

	/**
	 * Customer order rev. number 得意先注文改訂番号.<p>
	 *
	 */
	public void cst_po_rev(double value) {
		setConstNumber(offset + 91, $cst_po_rev, value);
	}


	/**
	 * Receiving date 受付日.<p>
	 *
	 */
	public MCDate rcpt_dt() {
		return getConstDate(offset + 92, $rcpt_dt);
	}

	/**
	 * Receiving date 受付日.<p>
	 *
	 */
	public void rcpt_dt(MCDate value) {
		setConstDate(offset + 92, $rcpt_dt, value);
	}


	/**
	 * Receiving PIC cd. 受付担当者ＣＤ.<p>
	 *
	 */
	public String rcpt_usr_cd() {
		return getConstString(offset + 93, $rcpt_usr_cd);
	}

	/**
	 * Receiving PIC cd. 受付担当者ＣＤ.<p>
	 *
	 */
	public void rcpt_usr_cd(String value) {
		setConstString(offset + 93, $rcpt_usr_cd, value);
	}


	/**
	 * Receiving PIC name 受付担当者名.<p>
	 *
	 */
	public String rcpt_usr_nm() {
		return getConstString(offset + 94, $rcpt_usr_nm);
	}

	/**
	 * Receiving PIC name 受付担当者名.<p>
	 *
	 */
	public void rcpt_usr_nm(String value) {
		setConstString(offset + 94, $rcpt_usr_nm, value);
	}


	/**
	 * AR customer cd. 売掛先ＣＤ.<p>
	 *
	 */
	public String acst_cd() {
		return getConstString(offset + 95, $acst_cd);
	}

	/**
	 * AR customer cd. 売掛先ＣＤ.<p>
	 *
	 */
	public void acst_cd(String value) {
		setConstString(offset + 95, $acst_cd, value);
	}


	/**
	 * AR customer name 売掛先名.<p>
	 *
	 */
	public String acst_nm() {
		return getConstString(offset + 96, $acst_nm);
	}

	/**
	 * AR customer name 売掛先名.<p>
	 *
	 */
	public void acst_nm(String value) {
		setConstString(offset + 96, $acst_nm, value);
	}


	/**
	 * AR dept. cd. 債権部門ＣＤ.<p>
	 *
	 */
	public String ar_dpt_cd() {
		return getConstString(offset + 97, $ar_dpt_cd);
	}

	/**
	 * AR dept. cd. 債権部門ＣＤ.<p>
	 *
	 */
	public void ar_dpt_cd(String value) {
		setConstString(offset + 97, $ar_dpt_cd, value);
	}


	/**
	 * AR dept. name 債権部門名.<p>
	 *
	 */
	public String ar_dpt_nm() {
		return getConstString(offset + 98, $ar_dpt_nm);
	}

	/**
	 * AR dept. name 債権部門名.<p>
	 *
	 */
	public void ar_dpt_nm(String value) {
		setConstString(offset + 98, $ar_dpt_nm, value);
	}


	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public String iv_no() {
		return getConstString(offset + 99, $iv_no);
	}

	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public void iv_no(String value) {
		setConstString(offset + 99, $iv_no, value);
	}


	/**
	 * Auto 自動.<p>
	 *
	 */
	public boolean iv_num_flg() {
		return getConstBoolean(offset + 100, $iv_num_flg);
	}

	/**
	 * Auto 自動.<p>
	 *
	 */
	public void iv_num_flg(boolean value) {
		setConstBoolean(offset + 100, $iv_num_flg, value);
	}


	/**
	 * Transportation method cd. 輸送方法ＣＤ.<p>
	 *
	 */
	public String trnspt_cd() {
		return getConstString(offset + 101, $trnspt_cd);
	}

	/**
	 * Transportation method cd. 輸送方法ＣＤ.<p>
	 *
	 */
	public void trnspt_cd(String value) {
		setConstString(offset + 101, $trnspt_cd, value);
	}


	/**
	 * Transportation method name 輸送方法名.<p>
	 *
	 */
	public String trnspt_nm() {
		return getConstString(offset + 102, $trnspt_nm);
	}

	/**
	 * Transportation method name 輸送方法名.<p>
	 *
	 */
	public void trnspt_nm(String value) {
		setConstString(offset + 102, $trnspt_nm, value);
	}


	/**
	 * Ship/flight name 船名／便名.<p>
	 *
	 */
	public String vssl_flght() {
		return getConstString(offset + 103, $vssl_flght);
	}

	/**
	 * Ship/flight name 船名／便名.<p>
	 *
	 */
	public void vssl_flght(String value) {
		setConstString(offset + 103, $vssl_flght, value);
	}


	/**
	 * Loading port cd. 船積港ＣＤ.<p>
	 *
	 */
	public String load_port_cd() {
		return getConstString(offset + 104, $load_port_cd);
	}

	/**
	 * Loading port cd. 船積港ＣＤ.<p>
	 *
	 */
	public void load_port_cd(String value) {
		setConstString(offset + 104, $load_port_cd, value);
	}


	/**
	 * Loading port name 船積港名.<p>
	 *
	 */
	public String load_port_nm() {
		return getConstString(offset + 105, $load_port_nm);
	}

	/**
	 * Loading port name 船積港名.<p>
	 *
	 */
	public void load_port_nm(String value) {
		setConstString(offset + 105, $load_port_nm, value);
	}


	/**
	 * Estimated date of loading 船積予定日.<p>
	 *
	 */
	public MCDate etd_dt() {
		return getConstDate(offset + 106, $etd_dt);
	}

	/**
	 * Estimated date of loading 船積予定日.<p>
	 *
	 */
	public void etd_dt(MCDate value) {
		setConstDate(offset + 106, $etd_dt, value);
	}


	/**
	 * Unloading port cd. 船卸港ＣＤ.<p>
	 *
	 */
	public String dschrg_port_cd() {
		return getConstString(offset + 107, $dschrg_port_cd);
	}

	/**
	 * Unloading port cd. 船卸港ＣＤ.<p>
	 *
	 */
	public void dschrg_port_cd(String value) {
		setConstString(offset + 107, $dschrg_port_cd, value);
	}


	/**
	 * Unloading port name 船卸港名.<p>
	 *
	 */
	public String dschrg_port_nm() {
		return getConstString(offset + 108, $dschrg_port_nm);
	}

	/**
	 * Unloading port name 船卸港名.<p>
	 *
	 */
	public void dschrg_port_nm(String value) {
		setConstString(offset + 108, $dschrg_port_nm, value);
	}


	/**
	 * Estimated date of unloading 船卸予定日.<p>
	 *
	 */
	public MCDate eta_dt() {
		return getConstDate(offset + 109, $eta_dt);
	}

	/**
	 * Estimated date of unloading 船卸予定日.<p>
	 *
	 */
	public void eta_dt(MCDate value) {
		setConstDate(offset + 109, $eta_dt, value);
	}


	/**
	 * Stopover point cd. 経由地ＣＤ.<p>
	 *
	 */
	public String via_port_cd() {
		return getConstString(offset + 110, $via_port_cd);
	}

	/**
	 * Stopover point cd. 経由地ＣＤ.<p>
	 *
	 */
	public void via_port_cd(String value) {
		setConstString(offset + 110, $via_port_cd, value);
	}


	/**
	 * Stopover point name 経由地名.<p>
	 *
	 */
	public String via_port_nm() {
		return getConstString(offset + 111, $via_port_nm);
	}

	/**
	 * Stopover point name 経由地名.<p>
	 *
	 */
	public void via_port_nm(String value) {
		setConstString(offset + 111, $via_port_nm, value);
	}


	/**
	 * Estimated stopover date 経由予定日.<p>
	 *
	 */
	public MCDate via_schd_dt() {
		return getConstDate(offset + 112, $via_schd_dt);
	}

	/**
	 * Estimated stopover date 経由予定日.<p>
	 *
	 */
	public void via_schd_dt(MCDate value) {
		setConstDate(offset + 112, $via_schd_dt, value);
	}


	/**
	 * Transaction terms cd. 1 取引条件ＣＤ１.<p>
	 *
	 */
	public String tterm_cd1() {
		return getConstString(offset + 113, $tterm_cd1);
	}

	/**
	 * Transaction terms cd. 1 取引条件ＣＤ１.<p>
	 *
	 */
	public void tterm_cd1(String value) {
		setConstString(offset + 113, $tterm_cd1, value);
	}


	/**
	 * Transaction terms name 1 取引条件名１.<p>
	 *
	 */
	public String tterm_nm1() {
		return getConstString(offset + 114, $tterm_nm1);
	}

	/**
	 * Transaction terms name 1 取引条件名１.<p>
	 *
	 */
	public void tterm_nm1(String value) {
		setConstString(offset + 114, $tterm_nm1, value);
	}


	/**
	 * Transaction terms remarks 1 取引条件備考１.<p>
	 *
	 */
	public String tterm_rmrks1() {
		return getConstString(offset + 115, $tterm_rmrks1);
	}

	/**
	 * Transaction terms remarks 1 取引条件備考１.<p>
	 *
	 */
	public void tterm_rmrks1(String value) {
		setConstString(offset + 115, $tterm_rmrks1, value);
	}


	/**
	 * Transaction terms cd. 2 取引条件ＣＤ２.<p>
	 *
	 */
	public String tterm_cd2() {
		return getConstString(offset + 116, $tterm_cd2);
	}

	/**
	 * Transaction terms cd. 2 取引条件ＣＤ２.<p>
	 *
	 */
	public void tterm_cd2(String value) {
		setConstString(offset + 116, $tterm_cd2, value);
	}


	/**
	 * Transaction terms name 2 取引条件名２.<p>
	 *
	 */
	public String tterm_nm2() {
		return getConstString(offset + 117, $tterm_nm2);
	}

	/**
	 * Transaction terms name 2 取引条件名２.<p>
	 *
	 */
	public void tterm_nm2(String value) {
		setConstString(offset + 117, $tterm_nm2, value);
	}


	/**
	 * Transaction terms remarks 2 取引条件備考２.<p>
	 *
	 */
	public String tterm_rmrks2() {
		return getConstString(offset + 118, $tterm_rmrks2);
	}

	/**
	 * Transaction terms remarks 2 取引条件備考２.<p>
	 *
	 */
	public void tterm_rmrks2(String value) {
		setConstString(offset + 118, $tterm_rmrks2, value);
	}


	/**
	 * Transaction terms cd. 3 取引条件ＣＤ３.<p>
	 *
	 */
	public String tterm_cd3() {
		return getConstString(offset + 119, $tterm_cd3);
	}

	/**
	 * Transaction terms cd. 3 取引条件ＣＤ３.<p>
	 *
	 */
	public void tterm_cd3(String value) {
		setConstString(offset + 119, $tterm_cd3, value);
	}


	/**
	 * Transaction terms name 3 取引条件名３.<p>
	 *
	 */
	public String tterm_nm3() {
		return getConstString(offset + 120, $tterm_nm3);
	}

	/**
	 * Transaction terms name 3 取引条件名３.<p>
	 *
	 */
	public void tterm_nm3(String value) {
		setConstString(offset + 120, $tterm_nm3, value);
	}


	/**
	 * Transaction terms remarks 3 取引条件備考３.<p>
	 *
	 */
	public String tterm_rmrks3() {
		return getConstString(offset + 121, $tterm_rmrks3);
	}

	/**
	 * Transaction terms remarks 3 取引条件備考３.<p>
	 *
	 */
	public void tterm_rmrks3(String value) {
		setConstString(offset + 121, $tterm_rmrks3, value);
	}


	/**
	 * Customer order remarks 得意先注文備考.<p>
	 *
	 */
	public String cst_po_rmrks() {
		return getConstString(offset + 122, $cst_po_rmrks);
	}

	/**
	 * Customer order remarks 得意先注文備考.<p>
	 *
	 */
	public void cst_po_rmrks(String value) {
		setConstString(offset + 122, $cst_po_rmrks, value);
	}


	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public String trd_rmrks() {
		return getConstString(offset + 123, $trd_rmrks);
	}

	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public void trd_rmrks(String value) {
		setConstString(offset + 123, $trd_rmrks, value);
	}


	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public String intr_rmrks() {
		return getConstString(offset + 124, $intr_rmrks);
	}

	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public void intr_rmrks(String value) {
		setConstString(offset + 124, $intr_rmrks, value);
	}


	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 125, $sub_char1);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 125, $sub_char1, value);
	}


	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 126, $sub_char2);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 126, $sub_char2, value);
	}


	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 127, $sub_char3);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 127, $sub_char3, value);
	}


	/**
	 * EDI spare CHAR column 1 ＥＤＩ予備ＣＨＡＲ項目１.<p>
	 *
	 */
	public String edi_sub_char1() {
		return getConstString(offset + 128, $edi_sub_char1);
	}

	/**
	 * EDI spare CHAR column 1 ＥＤＩ予備ＣＨＡＲ項目１.<p>
	 *
	 */
	public void edi_sub_char1(String value) {
		setConstString(offset + 128, $edi_sub_char1, value);
	}


	/**
	 * EDI spare CHAR column 2 ＥＤＩ予備ＣＨＡＲ項目２.<p>
	 *
	 */
	public String edi_sub_char2() {
		return getConstString(offset + 129, $edi_sub_char2);
	}

	/**
	 * EDI spare CHAR column 2 ＥＤＩ予備ＣＨＡＲ項目２.<p>
	 *
	 */
	public void edi_sub_char2(String value) {
		setConstString(offset + 129, $edi_sub_char2, value);
	}


	/**
	 * EDI spare CHAR column 3 ＥＤＩ予備ＣＨＡＲ項目３.<p>
	 *
	 */
	public String edi_sub_char3() {
		return getConstString(offset + 130, $edi_sub_char3);
	}

	/**
	 * EDI spare CHAR column 3 ＥＤＩ予備ＣＨＡＲ項目３.<p>
	 *
	 */
	public void edi_sub_char3(String value) {
		setConstString(offset + 130, $edi_sub_char3, value);
	}


	/**
	 * EDI spare CHAR column 4 ＥＤＩ予備ＣＨＡＲ項目４.<p>
	 *
	 */
	public String edi_sub_char4() {
		return getConstString(offset + 131, $edi_sub_char4);
	}

	/**
	 * EDI spare CHAR column 4 ＥＤＩ予備ＣＨＡＲ項目４.<p>
	 *
	 */
	public void edi_sub_char4(String value) {
		setConstString(offset + 131, $edi_sub_char4, value);
	}


	/**
	 * EDI spare CHAR column 5 ＥＤＩ予備ＣＨＡＲ項目５.<p>
	 *
	 */
	public String edi_sub_char5() {
		return getConstString(offset + 132, $edi_sub_char5);
	}

	/**
	 * EDI spare CHAR column 5 ＥＤＩ予備ＣＨＡＲ項目５.<p>
	 *
	 */
	public void edi_sub_char5(String value) {
		setConstString(offset + 132, $edi_sub_char5, value);
	}


	/**
	 * EDI spare NUM column 1 ＥＤＩ予備ＮＵＭ項目１.<p>
	 *
	 */
	public MCNumber edi_sub_num1() {
		return getConstNumber(offset + 133, $edi_sub_num1);
	}

	/**
	 * EDI spare NUM column 1 ＥＤＩ予備ＮＵＭ項目１.<p>
	 *
	 */
	public void edi_sub_num1(MCNumber value) {
		setConstNumber(offset + 133, $edi_sub_num1, value);
	}

	/**
	 * EDI spare NUM column 1 ＥＤＩ予備ＮＵＭ項目１.<p>
	 *
	 */
	public void edi_sub_num1(int value) {
		setConstNumber(offset + 133, $edi_sub_num1, value);
	}

	/**
	 * EDI spare NUM column 1 ＥＤＩ予備ＮＵＭ項目１.<p>
	 *
	 */
	public void edi_sub_num1(long value) {
		setConstNumber(offset + 133, $edi_sub_num1, value);
	}

	/**
	 * EDI spare NUM column 1 ＥＤＩ予備ＮＵＭ項目１.<p>
	 *
	 */
	public void edi_sub_num1(float value) {
		setConstNumber(offset + 133, $edi_sub_num1, value);
	}

	/**
	 * EDI spare NUM column 1 ＥＤＩ予備ＮＵＭ項目１.<p>
	 *
	 */
	public void edi_sub_num1(double value) {
		setConstNumber(offset + 133, $edi_sub_num1, value);
	}


	/**
	 * EDI spare DATE column 1 ＥＤＩ予備ＤＡＴＥ項目１.<p>
	 *
	 */
	public MCDate edi_sub_dt1() {
		return getConstDate(offset + 134, $edi_sub_dt1);
	}

	/**
	 * EDI spare DATE column 1 ＥＤＩ予備ＤＡＴＥ項目１.<p>
	 *
	 */
	public void edi_sub_dt1(MCDate value) {
		setConstDate(offset + 134, $edi_sub_dt1, value);
	}


	/**
	 * Canceling reason cd. 取消理由ＣＤ.<p>
	 *
	 */
	public String can_rsn_cd() {
		return getConstString(offset + 135, $can_rsn_cd);
	}

	/**
	 * Canceling reason cd. 取消理由ＣＤ.<p>
	 *
	 */
	public void can_rsn_cd(String value) {
		setConstString(offset + 135, $can_rsn_cd, value);
	}


	/**
	 * Canceling reason name 取消理由名.<p>
	 *
	 */
	public String can_rsn_nm() {
		return getConstString(offset + 136, $can_rsn_nm);
	}

	/**
	 * Canceling reason name 取消理由名.<p>
	 *
	 */
	public void can_rsn_nm(String value) {
		setConstString(offset + 136, $can_rsn_nm, value);
	}


	/**
	 * Cancel remarks 取消備考.<p>
	 *
	 */
	public String can_rmrks() {
		return getConstString(offset + 137, $can_rmrks);
	}

	/**
	 * Cancel remarks 取消備考.<p>
	 *
	 */
	public void can_rmrks(String value) {
		setConstString(offset + 137, $can_rmrks, value);
	}


	/**
	 * For original approval 元承認対象.<p>
	 *
	 */
	public boolean old_aprv_flg() {
		return getConstBoolean(offset + 138, $old_aprv_flg);
	}

	/**
	 * For original approval 元承認対象.<p>
	 *
	 */
	public void old_aprv_flg(boolean value) {
		setConstBoolean(offset + 138, $old_aprv_flg, value);
	}


	/**
	 * Original approval No. 元承認ＮＯ.<p>
	 *
	 */
	public String old_aprv_no() {
		return getConstString(offset + 139, $old_aprv_no);
	}

	/**
	 * Original approval No. 元承認ＮＯ.<p>
	 *
	 */
	public void old_aprv_no(String value) {
		setConstString(offset + 139, $old_aprv_no, value);
	}


	/**
	 * Original approval status type 元承認状況区分.<p>
	 *
	 */
	public String old_aprv_sts_typ() {
		return getConstString(offset + 140, $old_aprv_sts_typ);
	}

	/**
	 * Original approval status type 元承認状況区分.<p>
	 *
	 */
	public void old_aprv_sts_typ(String value) {
		setConstString(offset + 140, $old_aprv_sts_typ, value);
	}


	/**
	 * Original update possible 元更新可能.<p>
	 *
	 */
	public boolean old_can_upd_flg() {
		return getConstBoolean(offset + 141, $old_can_upd_flg);
	}

	/**
	 * Original update possible 元更新可能.<p>
	 *
	 */
	public void old_can_upd_flg(boolean value) {
		setConstBoolean(offset + 141, $old_can_upd_flg, value);
	}


	/**
	 * Original cancellation possible 元取消可能.<p>
	 *
	 */
	public boolean old_can_del_flg() {
		return getConstBoolean(offset + 142, $old_can_del_flg);
	}

	/**
	 * Original cancellation possible 元取消可能.<p>
	 *
	 */
	public void old_can_del_flg(boolean value) {
		setConstBoolean(offset + 142, $old_can_del_flg, value);
	}


	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 143, $ins_usr_id);
	}

	/**
	 * Entry user ID 登録ユーザＩＤ.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 143, $ins_usr_id, value);
	}


	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 144, $ins_usr_nm);
	}

	/**
	 * Entry user name 登録ユーザ名.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 144, $ins_usr_nm, value);
	}


	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 145, $ins_func_id);
	}

	/**
	 * Entry function ID 登録機能ＩＤ.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 145, $ins_func_id, value);
	}


	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public String ins_func_nm() {
		return getConstString(offset + 146, $ins_func_nm);
	}

	/**
	 * Entry function name 登録機能名.<p>
	 *
	 */
	public void ins_func_nm(String value) {
		setConstString(offset + 146, $ins_func_nm, value);
	}


	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 147, $upd_usr_id);
	}

	/**
	 * Update user ID 更新ユーザＩＤ.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 147, $upd_usr_id, value);
	}


	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 148, $upd_usr_nm);
	}

	/**
	 * Update user name 更新ユーザ名.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 148, $upd_usr_nm, value);
	}


	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 149, $upd_func_id);
	}

	/**
	 * Update function ID 更新機能ＩＤ.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 149, $upd_func_id, value);
	}


	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public String upd_func_nm() {
		return getConstString(offset + 150, $upd_func_nm);
	}

	/**
	 * Update function name 更新機能名.<p>
	 *
	 */
	public void upd_func_nm(String value) {
		setConstString(offset + 150, $upd_func_nm, value);
	}


	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 151, $ins_ts);
	}

	/**
	 * Entry date and time 登録日時.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 151, $ins_ts, value);
	}


	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 152, $upd_ts);
	}

	/**
	 * Update date and time 更新日時.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 152, $upd_ts, value);
	}


	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 153, $upd_srv_req_no);
	}

	/**
	 * Update request No. 更新リクエストＮＯ.<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 153, $upd_srv_req_no, value);
	}


	/**
	 * Sales order header update counter 受注ヘッダ更新カウンタ.<p>
	 *
	 */
	public MCNumber slo_upd_cntr() {
		return getConstNumber(offset + 154, $slo_upd_cntr);
	}

	/**
	 * Sales order header update counter 受注ヘッダ更新カウンタ.<p>
	 *
	 */
	public void slo_upd_cntr(MCNumber value) {
		setConstNumber(offset + 154, $slo_upd_cntr, value);
	}

	/**
	 * Sales order header update counter 受注ヘッダ更新カウンタ.<p>
	 *
	 */
	public void slo_upd_cntr(int value) {
		setConstNumber(offset + 154, $slo_upd_cntr, value);
	}

	/**
	 * Sales order header update counter 受注ヘッダ更新カウンタ.<p>
	 *
	 */
	public void slo_upd_cntr(long value) {
		setConstNumber(offset + 154, $slo_upd_cntr, value);
	}

	/**
	 * Sales order header update counter 受注ヘッダ更新カウンタ.<p>
	 *
	 */
	public void slo_upd_cntr(float value) {
		setConstNumber(offset + 154, $slo_upd_cntr, value);
	}

	/**
	 * Sales order header update counter 受注ヘッダ更新カウンタ.<p>
	 *
	 */
	public void slo_upd_cntr(double value) {
		setConstNumber(offset + 154, $slo_upd_cntr, value);
	}


	/**
	 * Quotation header update counter 見積ヘッダ更新カウンタ.<p>
	 *
	 */
	public MCNumber qtn_upd_cntr() {
		return getConstNumber(offset + 155, $qtn_upd_cntr);
	}

	/**
	 * Quotation header update counter 見積ヘッダ更新カウンタ.<p>
	 *
	 */
	public void qtn_upd_cntr(MCNumber value) {
		setConstNumber(offset + 155, $qtn_upd_cntr, value);
	}

	/**
	 * Quotation header update counter 見積ヘッダ更新カウンタ.<p>
	 *
	 */
	public void qtn_upd_cntr(int value) {
		setConstNumber(offset + 155, $qtn_upd_cntr, value);
	}

	/**
	 * Quotation header update counter 見積ヘッダ更新カウンタ.<p>
	 *
	 */
	public void qtn_upd_cntr(long value) {
		setConstNumber(offset + 155, $qtn_upd_cntr, value);
	}

	/**
	 * Quotation header update counter 見積ヘッダ更新カウンタ.<p>
	 *
	 */
	public void qtn_upd_cntr(float value) {
		setConstNumber(offset + 155, $qtn_upd_cntr, value);
	}

	/**
	 * Quotation header update counter 見積ヘッダ更新カウンタ.<p>
	 *
	 */
	public void qtn_upd_cntr(double value) {
		setConstNumber(offset + 155, $qtn_upd_cntr, value);
	}


	public mcframe.clientMAUB.MAUBP0110.YmdHmR ship_rqst_p(){
		return (mcframe.clientMAUB.MAUBP0110.YmdHmR) getConstInnerRow(offset + 156, $ship_rqst_p);
	}
	
	public void ship_rqst_p(mcframe.clientMAUB.MAUBP0110.YmdHmR row){
		setConstInnerRow(offset + 156, $ship_rqst_p, row);
	}


	public mcframe.clientMAUB.MAUBP0110.YmdHmR dlv_rqst_p(){
		return (mcframe.clientMAUB.MAUBP0110.YmdHmR) getConstInnerRow(offset + 157, $dlv_rqst_p);
	}
	
	public void dlv_rqst_p(mcframe.clientMAUB.MAUBP0110.YmdHmR row){
		setConstInnerRow(offset + 157, $dlv_rqst_p, row);
	}


	/**
	 * Day type 曜日区分.<p>
	 *
	 */
	public String dlv_day_week_typ() {
		return getConstString(offset + 158, $dlv_day_week_typ);
	}

	/**
	 * Day type 曜日区分.<p>
	 *
	 */
	public void dlv_day_week_typ(String value) {
		setConstString(offset + 158, $dlv_day_week_typ, value);
	}


	/**
	 * Arrival day of week 着曜日.<p>
	 *
	 */
	public String dlv_day_week_typ_nm() {
		return getConstString(offset + 159, $dlv_day_week_typ_nm);
	}

	/**
	 * Arrival day of week 着曜日.<p>
	 *
	 */
	public void dlv_day_week_typ_nm(String value) {
		setConstString(offset + 159, $dlv_day_week_typ_nm, value);
	}


	/**
	 * Free reason 無償理由ＣＤ.<p>
	 *
	 */
	public String frc_rsn_cd() {
		return getConstString(offset + 160, $frc_rsn_cd);
	}

	/**
	 * Free reason 無償理由ＣＤ.<p>
	 *
	 */
	public void frc_rsn_cd(String value) {
		setConstString(offset + 160, $frc_rsn_cd, value);
	}


	/**
	 * Free reason name 無償理由.<p>
	 *
	 */
	public String frc_rsn_cd_nm() {
		return getConstString(offset + 161, $frc_rsn_cd_nm);
	}

	/**
	 * Free reason name 無償理由.<p>
	 *
	 */
	public void frc_rsn_cd_nm(String value) {
		setConstString(offset + 161, $frc_rsn_cd_nm, value);
	}


	/**
	 * Sales condition cd. 売上条件区分ＣＤ.<p>
	 *
	 */
	public String sales_cond() {
		return getConstString(offset + 162, $sales_cond);
	}

	/**
	 * Sales condition cd. 売上条件区分ＣＤ.<p>
	 *
	 */
	public void sales_cond(String value) {
		setConstString(offset + 162, $sales_cond, value);
	}


	/**
	 * Sales condition name 売上条件区分名.<p>
	 *
	 */
	public String sales_cond_nm() {
		return getConstString(offset + 163, $sales_cond_nm);
	}

	/**
	 * Sales condition name 売上条件区分名.<p>
	 *
	 */
	public void sales_cond_nm(String value) {
		setConstString(offset + 163, $sales_cond_nm, value);
	}


	/**
	 * Sales date 売上日.<p>
	 *
	 */
	public MCDate sls_dt() {
		return getConstDate(offset + 164, $sls_dt);
	}

	/**
	 * Sales date 売上日.<p>
	 *
	 */
	public void sls_dt(MCDate value) {
		setConstDate(offset + 164, $sls_dt, value);
	}


	/**
	 *  出荷帳票得意先名印字しない.<p>
	 *
	 */
	public boolean ship_prnt_no_cst_nm_flg() {
		return getConstBoolean(offset + 165, $ship_prnt_no_cst_nm_flg);
	}

	/**
	 *  出荷帳票得意先名印字しない.<p>
	 *
	 */
	public void ship_prnt_no_cst_nm_flg(boolean value) {
		setConstBoolean(offset + 165, $ship_prnt_no_cst_nm_flg, value);
	}


	/**
	 *  元案件ＮＯ.<p>
	 *
	 */
	public String src_wrk_no() {
		return getConstString(offset + 166, $src_wrk_no);
	}

	/**
	 *  元案件ＮＯ.<p>
	 *
	 */
	public void src_wrk_no(String value) {
		setConstString(offset + 166, $src_wrk_no, value);
	}


	/**
	 *  ＺＯＨＯ販売予定ＮＯ.<p>
	 *
	 */
	public String zoho_sls_schd_no() {
		return getConstString(offset + 167, $zoho_sls_schd_no);
	}

	/**
	 *  ＺＯＨＯ販売予定ＮＯ.<p>
	 *
	 */
	public void zoho_sls_schd_no(String value) {
		setConstString(offset + 167, $zoho_sls_schd_no, value);
	}


	/**
	 *  受注最終出荷売上.<p>
	 *
	 */
	public boolean slo_last_sls_flg() {
		return getConstBoolean(offset + 168, $slo_last_sls_flg);
	}

	/**
	 *  受注最終出荷売上.<p>
	 *
	 */
	public void slo_last_sls_flg(boolean value) {
		setConstBoolean(offset + 168, $slo_last_sls_flg, value);
	}


	public mcframe.clientMAUB.MAUBP0030.ItmR par_itm_p(){
		return (mcframe.clientMAUB.MAUBP0030.ItmR) getConstInnerRow(offset + 169, $par_itm_p);
	}
	
	public void par_itm_p(mcframe.clientMAUB.MAUBP0030.ItmR row){
		setConstInnerRow(offset + 169, $par_itm_p, row);
	}


	/**
	 *  数量（ヘッダ）.<p>
	 *
	 */
	public MCNumber hdr_qty() {
		return getConstNumber(offset + 170, $hdr_qty);
	}

	/**
	 *  数量（ヘッダ）.<p>
	 *
	 */
	public void hdr_qty(MCNumber value) {
		setConstNumber(offset + 170, $hdr_qty, value);
	}

	/**
	 *  数量（ヘッダ）.<p>
	 *
	 */
	public void hdr_qty(int value) {
		setConstNumber(offset + 170, $hdr_qty, value);
	}

	/**
	 *  数量（ヘッダ）.<p>
	 *
	 */
	public void hdr_qty(long value) {
		setConstNumber(offset + 170, $hdr_qty, value);
	}

	/**
	 *  数量（ヘッダ）.<p>
	 *
	 */
	public void hdr_qty(float value) {
		setConstNumber(offset + 170, $hdr_qty, value);
	}

	/**
	 *  数量（ヘッダ）.<p>
	 *
	 */
	public void hdr_qty(double value) {
		setConstNumber(offset + 170, $hdr_qty, value);
	}


	/**
	 *  測線数.<p>
	 *
	 */
	public String surv_line_qty() {
		return getConstString(offset + 171, $surv_line_qty);
	}

	/**
	 *  測線数.<p>
	 *
	 */
	public void surv_line_qty(String value) {
		setConstString(offset + 171, $surv_line_qty, value);
	}


	/**
	 *  口径.<p>
	 *
	 */
	public String diameter() {
		return getConstString(offset + 172, $diameter);
	}

	/**
	 *  口径.<p>
	 *
	 */
	public void diameter(String value) {
		setConstString(offset + 172, $diameter, value);
	}


	/**
	 *  照合キー.<p>
	 *
	 */
	public String match_key() {
		return getConstString(offset + 173, $match_key);
	}

	/**
	 *  照合キー.<p>
	 *
	 */
	public void match_key(String value) {
		setConstString(offset + 173, $match_key, value);
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
		if ($srch_tgt_no.equalsIgnoreCase(name)) {
			return srch_tgt_no();
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			return slo_no();
		}
		if ($slo_typ.equalsIgnoreCase(name)) {
			return slo_typ();
		}
		if ($slo_typ_nm.equalsIgnoreCase(name)) {
			return slo_typ_nm();
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
		if ($def_cst_cd.equalsIgnoreCase(name)) {
			return def_cst_cd();
		}
		if ($prnt_lcl_cd.equalsIgnoreCase(name)) {
			return prnt_lcl_cd();
		}
		if ($dest_cd1.equalsIgnoreCase(name)) {
			return dest_cd1();
		}
		if ($dest_nm1.equalsIgnoreCase(name)) {
			return dest_nm1();
		}
		if ($dest_cd2.equalsIgnoreCase(name)) {
			return dest_cd2();
		}
		if ($dest_nm2.equalsIgnoreCase(name)) {
			return dest_nm2();
		}
		if ($dest_cd3.equalsIgnoreCase(name)) {
			return dest_cd3();
		}
		if ($dest_nm3.equalsIgnoreCase(name)) {
			return dest_nm3();
		}
		if ($via_dlv_typ.equalsIgnoreCase(name)) {
			return via_dlv_typ();
		}
		if ($via_dlv_typ_nm.equalsIgnoreCase(name)) {
			return via_dlv_typ_nm();
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			return cst_cd();
		}
		if ($cst_nm.equalsIgnoreCase(name)) {
			return cst_nm();
		}
		if ($sls_basis_typ.equalsIgnoreCase(name)) {
			return sls_basis_typ();
		}
		if ($sls_basis_typ_nm.equalsIgnoreCase(name)) {
			return sls_basis_typ_nm();
		}
		if ($bp_sls_basis_typ.equalsIgnoreCase(name)) {
			return bp_sls_basis_typ();
		}
		if ($cst_usr_cd.equalsIgnoreCase(name)) {
			return cst_usr_cd();
		}
		if ($cst_dpt_cd.equalsIgnoreCase(name)) {
			return cst_dpt_cd();
		}
		if ($ar_dpt_typ.equalsIgnoreCase(name)) {
			return ar_dpt_typ();
		}
		if ($lnk_ar_dpt_cd.equalsIgnoreCase(name)) {
			return lnk_ar_dpt_cd();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
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
		if ($ptax_cur_cd.equalsIgnoreCase(name)) {
			return ptax_cur_cd();
		}
		if ($ptax_cur_nm.equalsIgnoreCase(name)) {
			return ptax_cur_nm();
		}
		if ($sls_upri_req_typ.equalsIgnoreCase(name)) {
			return sls_upri_req_typ();
		}
		if ($ship_schd_split_typ.equalsIgnoreCase(name)) {
			return ship_schd_split_typ();
		}
		if ($sls_amt_rnd_typ.equalsIgnoreCase(name)) {
			return sls_amt_rnd_typ();
		}
		if ($sls_tax_rnd_typ.equalsIgnoreCase(name)) {
			return sls_tax_rnd_typ();
		}
		if ($xrate_rnd_typ.equalsIgnoreCase(name)) {
			return xrate_rnd_typ();
		}
		if ($wtax_rnd_typ.equalsIgnoreCase(name)) {
			return wtax_rnd_typ();
		}
		if ($qtn_no.equalsIgnoreCase(name)) {
			return qtn_no();
		}
		if ($assort_typ.equalsIgnoreCase(name)) {
			return assort_typ();
		}
		if ($assort_typ_nm.equalsIgnoreCase(name)) {
			return assort_typ_nm();
		}
		if ($adv_ship_ctrl_typ.equalsIgnoreCase(name)) {
			return adv_ship_ctrl_typ();
		}
		if ($adv_ship_ctrl_typ_nm.equalsIgnoreCase(name)) {
			return adv_ship_ctrl_typ_nm();
		}
		if ($cst_po_no.equalsIgnoreCase(name)) {
			return cst_po_no();
		}
		if ($rcpt_usr_cd.equalsIgnoreCase(name)) {
			return rcpt_usr_cd();
		}
		if ($rcpt_usr_nm.equalsIgnoreCase(name)) {
			return rcpt_usr_nm();
		}
		if ($acst_cd.equalsIgnoreCase(name)) {
			return acst_cd();
		}
		if ($acst_nm.equalsIgnoreCase(name)) {
			return acst_nm();
		}
		if ($ar_dpt_cd.equalsIgnoreCase(name)) {
			return ar_dpt_cd();
		}
		if ($ar_dpt_nm.equalsIgnoreCase(name)) {
			return ar_dpt_nm();
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			return iv_no();
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
		if ($tterm_cd3.equalsIgnoreCase(name)) {
			return tterm_cd3();
		}
		if ($tterm_nm3.equalsIgnoreCase(name)) {
			return tterm_nm3();
		}
		if ($tterm_rmrks3.equalsIgnoreCase(name)) {
			return tterm_rmrks3();
		}
		if ($cst_po_rmrks.equalsIgnoreCase(name)) {
			return cst_po_rmrks();
		}
		if ($trd_rmrks.equalsIgnoreCase(name)) {
			return trd_rmrks();
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
		if ($edi_sub_char1.equalsIgnoreCase(name)) {
			return edi_sub_char1();
		}
		if ($edi_sub_char2.equalsIgnoreCase(name)) {
			return edi_sub_char2();
		}
		if ($edi_sub_char3.equalsIgnoreCase(name)) {
			return edi_sub_char3();
		}
		if ($edi_sub_char4.equalsIgnoreCase(name)) {
			return edi_sub_char4();
		}
		if ($edi_sub_char5.equalsIgnoreCase(name)) {
			return edi_sub_char5();
		}
		if ($can_rsn_cd.equalsIgnoreCase(name)) {
			return can_rsn_cd();
		}
		if ($can_rsn_nm.equalsIgnoreCase(name)) {
			return can_rsn_nm();
		}
		if ($can_rmrks.equalsIgnoreCase(name)) {
			return can_rmrks();
		}
		if ($old_aprv_no.equalsIgnoreCase(name)) {
			return old_aprv_no();
		}
		if ($old_aprv_sts_typ.equalsIgnoreCase(name)) {
			return old_aprv_sts_typ();
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
		if ($dlv_day_week_typ.equalsIgnoreCase(name)) {
			return dlv_day_week_typ();
		}
		if ($dlv_day_week_typ_nm.equalsIgnoreCase(name)) {
			return dlv_day_week_typ_nm();
		}
		if ($frc_rsn_cd.equalsIgnoreCase(name)) {
			return frc_rsn_cd();
		}
		if ($frc_rsn_cd_nm.equalsIgnoreCase(name)) {
			return frc_rsn_cd_nm();
		}
		if ($sales_cond.equalsIgnoreCase(name)) {
			return sales_cond();
		}
		if ($sales_cond_nm.equalsIgnoreCase(name)) {
			return sales_cond_nm();
		}
		if ($src_wrk_no.equalsIgnoreCase(name)) {
			return src_wrk_no();
		}
		if ($zoho_sls_schd_no.equalsIgnoreCase(name)) {
			return zoho_sls_schd_no();
		}
		if ($surv_line_qty.equalsIgnoreCase(name)) {
			return surv_line_qty();
		}
		if ($diameter.equalsIgnoreCase(name)) {
			return diameter();
		}
		if ($match_key.equalsIgnoreCase(name)) {
			return match_key();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($slo_rev.equalsIgnoreCase(name)) {
			return slo_rev();
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
		if ($ptax_cur_amt_dec_place.equalsIgnoreCase(name)) {
			return ptax_cur_amt_dec_place();
		}
		if ($ptax_cur_upri_dec_place.equalsIgnoreCase(name)) {
			return ptax_cur_upri_dec_place();
		}
		if ($cst_bill_crryovr_times.equalsIgnoreCase(name)) {
			return cst_bill_crryovr_times();
		}
		if ($qtn_rev.equalsIgnoreCase(name)) {
			return qtn_rev();
		}
		if ($prof_rate.equalsIgnoreCase(name)) {
			return prof_rate();
		}
		if ($base_cur_ttl_amt.equalsIgnoreCase(name)) {
			return base_cur_ttl_amt();
		}
		if ($ttl_cost_amt.equalsIgnoreCase(name)) {
			return ttl_cost_amt();
		}
		if ($cst_po_rev.equalsIgnoreCase(name)) {
			return cst_po_rev();
		}
		if ($edi_sub_num1.equalsIgnoreCase(name)) {
			return edi_sub_num1();
		}
		if ($slo_upd_cntr.equalsIgnoreCase(name)) {
			return slo_upd_cntr();
		}
		if ($qtn_upd_cntr.equalsIgnoreCase(name)) {
			return qtn_upd_cntr();
		}
		if ($hdr_qty.equalsIgnoreCase(name)) {
			return hdr_qty();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($slo_dt.equalsIgnoreCase(name)) {
			return slo_dt();
		}
		if ($qtn_valid_dt.equalsIgnoreCase(name)) {
			return qtn_valid_dt();
		}
		if ($rcpt_dt.equalsIgnoreCase(name)) {
			return rcpt_dt();
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
		if ($edi_sub_dt1.equalsIgnoreCase(name)) {
			return edi_sub_dt1();
		}
		if ($sls_dt.equalsIgnoreCase(name)) {
			return sls_dt();
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
		if ($latest_flg.equalsIgnoreCase(name)) {
			return latest_flg();
		}
		if ($aprv_flg.equalsIgnoreCase(name)) {
			return aprv_flg();
		}
		if ($aprv_back_flg.equalsIgnoreCase(name)) {
			return aprv_back_flg();
		}
		if ($aprv_upd_flg.equalsIgnoreCase(name)) {
			return aprv_upd_flg();
		}
		if ($aprv_can_flg.equalsIgnoreCase(name)) {
			return aprv_can_flg();
		}
		if ($edi_flg.equalsIgnoreCase(name)) {
			return edi_flg();
		}
		if ($hdr_not_lg_mix_flg.equalsIgnoreCase(name)) {
			return hdr_not_lg_mix_flg();
		}
		if ($hdr_not_lot_mix_flg.equalsIgnoreCase(name)) {
			return hdr_not_lot_mix_flg();
		}
		if ($hdr_not_sublot_mix_flg.equalsIgnoreCase(name)) {
			return hdr_not_sublot_mix_flg();
		}
		if ($xrate_inpt_flg.equalsIgnoreCase(name)) {
			return xrate_inpt_flg();
		}
		if ($ptax_xrate_inpt_flg.equalsIgnoreCase(name)) {
			return ptax_xrate_inpt_flg();
		}
		if ($tdlv_req_flg.equalsIgnoreCase(name)) {
			return tdlv_req_flg();
		}
		if ($sls_upri_cng_flg.equalsIgnoreCase(name)) {
			return sls_upri_cng_flg();
		}
		if ($cst_iv_flg.equalsIgnoreCase(name)) {
			return cst_iv_flg();
		}
		if ($iv_num_flg.equalsIgnoreCase(name)) {
			return iv_num_flg();
		}
		if ($old_aprv_flg.equalsIgnoreCase(name)) {
			return old_aprv_flg();
		}
		if ($old_can_upd_flg.equalsIgnoreCase(name)) {
			return old_can_upd_flg();
		}
		if ($old_can_del_flg.equalsIgnoreCase(name)) {
			return old_can_del_flg();
		}
		if ($ship_prnt_no_cst_nm_flg.equalsIgnoreCase(name)) {
			return ship_prnt_no_cst_nm_flg();
		}
		if ($slo_last_sls_flg.equalsIgnoreCase(name)) {
			return slo_last_sls_flg();
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
		if ($srch_tgt_no.equalsIgnoreCase(name)) {
			return srch_tgt_no();
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			return slo_no();
		}
		if ($slo_typ.equalsIgnoreCase(name)) {
			return slo_typ();
		}
		if ($slo_typ_nm.equalsIgnoreCase(name)) {
			return slo_typ_nm();
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
		if ($def_cst_cd.equalsIgnoreCase(name)) {
			return def_cst_cd();
		}
		if ($prnt_lcl_cd.equalsIgnoreCase(name)) {
			return prnt_lcl_cd();
		}
		if ($dest_cd1.equalsIgnoreCase(name)) {
			return dest_cd1();
		}
		if ($dest_nm1.equalsIgnoreCase(name)) {
			return dest_nm1();
		}
		if ($dest_cd2.equalsIgnoreCase(name)) {
			return dest_cd2();
		}
		if ($dest_nm2.equalsIgnoreCase(name)) {
			return dest_nm2();
		}
		if ($dest_cd3.equalsIgnoreCase(name)) {
			return dest_cd3();
		}
		if ($dest_nm3.equalsIgnoreCase(name)) {
			return dest_nm3();
		}
		if ($via_dlv_typ.equalsIgnoreCase(name)) {
			return via_dlv_typ();
		}
		if ($via_dlv_typ_nm.equalsIgnoreCase(name)) {
			return via_dlv_typ_nm();
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			return cst_cd();
		}
		if ($cst_nm.equalsIgnoreCase(name)) {
			return cst_nm();
		}
		if ($sls_basis_typ.equalsIgnoreCase(name)) {
			return sls_basis_typ();
		}
		if ($sls_basis_typ_nm.equalsIgnoreCase(name)) {
			return sls_basis_typ_nm();
		}
		if ($bp_sls_basis_typ.equalsIgnoreCase(name)) {
			return bp_sls_basis_typ();
		}
		if ($cst_usr_cd.equalsIgnoreCase(name)) {
			return cst_usr_cd();
		}
		if ($cst_dpt_cd.equalsIgnoreCase(name)) {
			return cst_dpt_cd();
		}
		if ($ar_dpt_typ.equalsIgnoreCase(name)) {
			return ar_dpt_typ();
		}
		if ($lnk_ar_dpt_cd.equalsIgnoreCase(name)) {
			return lnk_ar_dpt_cd();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
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
		if ($ptax_cur_cd.equalsIgnoreCase(name)) {
			return ptax_cur_cd();
		}
		if ($ptax_cur_nm.equalsIgnoreCase(name)) {
			return ptax_cur_nm();
		}
		if ($sls_upri_req_typ.equalsIgnoreCase(name)) {
			return sls_upri_req_typ();
		}
		if ($ship_schd_split_typ.equalsIgnoreCase(name)) {
			return ship_schd_split_typ();
		}
		if ($sls_amt_rnd_typ.equalsIgnoreCase(name)) {
			return sls_amt_rnd_typ();
		}
		if ($sls_tax_rnd_typ.equalsIgnoreCase(name)) {
			return sls_tax_rnd_typ();
		}
		if ($xrate_rnd_typ.equalsIgnoreCase(name)) {
			return xrate_rnd_typ();
		}
		if ($wtax_rnd_typ.equalsIgnoreCase(name)) {
			return wtax_rnd_typ();
		}
		if ($qtn_no.equalsIgnoreCase(name)) {
			return qtn_no();
		}
		if ($assort_typ.equalsIgnoreCase(name)) {
			return assort_typ();
		}
		if ($assort_typ_nm.equalsIgnoreCase(name)) {
			return assort_typ_nm();
		}
		if ($adv_ship_ctrl_typ.equalsIgnoreCase(name)) {
			return adv_ship_ctrl_typ();
		}
		if ($adv_ship_ctrl_typ_nm.equalsIgnoreCase(name)) {
			return adv_ship_ctrl_typ_nm();
		}
		if ($cst_po_no.equalsIgnoreCase(name)) {
			return cst_po_no();
		}
		if ($rcpt_usr_cd.equalsIgnoreCase(name)) {
			return rcpt_usr_cd();
		}
		if ($rcpt_usr_nm.equalsIgnoreCase(name)) {
			return rcpt_usr_nm();
		}
		if ($acst_cd.equalsIgnoreCase(name)) {
			return acst_cd();
		}
		if ($acst_nm.equalsIgnoreCase(name)) {
			return acst_nm();
		}
		if ($ar_dpt_cd.equalsIgnoreCase(name)) {
			return ar_dpt_cd();
		}
		if ($ar_dpt_nm.equalsIgnoreCase(name)) {
			return ar_dpt_nm();
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			return iv_no();
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
		if ($tterm_cd3.equalsIgnoreCase(name)) {
			return tterm_cd3();
		}
		if ($tterm_nm3.equalsIgnoreCase(name)) {
			return tterm_nm3();
		}
		if ($tterm_rmrks3.equalsIgnoreCase(name)) {
			return tterm_rmrks3();
		}
		if ($cst_po_rmrks.equalsIgnoreCase(name)) {
			return cst_po_rmrks();
		}
		if ($trd_rmrks.equalsIgnoreCase(name)) {
			return trd_rmrks();
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
		if ($edi_sub_char1.equalsIgnoreCase(name)) {
			return edi_sub_char1();
		}
		if ($edi_sub_char2.equalsIgnoreCase(name)) {
			return edi_sub_char2();
		}
		if ($edi_sub_char3.equalsIgnoreCase(name)) {
			return edi_sub_char3();
		}
		if ($edi_sub_char4.equalsIgnoreCase(name)) {
			return edi_sub_char4();
		}
		if ($edi_sub_char5.equalsIgnoreCase(name)) {
			return edi_sub_char5();
		}
		if ($can_rsn_cd.equalsIgnoreCase(name)) {
			return can_rsn_cd();
		}
		if ($can_rsn_nm.equalsIgnoreCase(name)) {
			return can_rsn_nm();
		}
		if ($can_rmrks.equalsIgnoreCase(name)) {
			return can_rmrks();
		}
		if ($old_aprv_no.equalsIgnoreCase(name)) {
			return old_aprv_no();
		}
		if ($old_aprv_sts_typ.equalsIgnoreCase(name)) {
			return old_aprv_sts_typ();
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
		if ($dlv_day_week_typ.equalsIgnoreCase(name)) {
			return dlv_day_week_typ();
		}
		if ($dlv_day_week_typ_nm.equalsIgnoreCase(name)) {
			return dlv_day_week_typ_nm();
		}
		if ($frc_rsn_cd.equalsIgnoreCase(name)) {
			return frc_rsn_cd();
		}
		if ($frc_rsn_cd_nm.equalsIgnoreCase(name)) {
			return frc_rsn_cd_nm();
		}
		if ($sales_cond.equalsIgnoreCase(name)) {
			return sales_cond();
		}
		if ($sales_cond_nm.equalsIgnoreCase(name)) {
			return sales_cond_nm();
		}
		if ($src_wrk_no.equalsIgnoreCase(name)) {
			return src_wrk_no();
		}
		if ($zoho_sls_schd_no.equalsIgnoreCase(name)) {
			return zoho_sls_schd_no();
		}
		if ($surv_line_qty.equalsIgnoreCase(name)) {
			return surv_line_qty();
		}
		if ($diameter.equalsIgnoreCase(name)) {
			return diameter();
		}
		if ($match_key.equalsIgnoreCase(name)) {
			return match_key();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($slo_rev.equalsIgnoreCase(name)) {
			return slo_rev();
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
		if ($ptax_cur_amt_dec_place.equalsIgnoreCase(name)) {
			return ptax_cur_amt_dec_place();
		}
		if ($ptax_cur_upri_dec_place.equalsIgnoreCase(name)) {
			return ptax_cur_upri_dec_place();
		}
		if ($cst_bill_crryovr_times.equalsIgnoreCase(name)) {
			return cst_bill_crryovr_times();
		}
		if ($qtn_rev.equalsIgnoreCase(name)) {
			return qtn_rev();
		}
		if ($prof_rate.equalsIgnoreCase(name)) {
			return prof_rate();
		}
		if ($base_cur_ttl_amt.equalsIgnoreCase(name)) {
			return base_cur_ttl_amt();
		}
		if ($ttl_cost_amt.equalsIgnoreCase(name)) {
			return ttl_cost_amt();
		}
		if ($cst_po_rev.equalsIgnoreCase(name)) {
			return cst_po_rev();
		}
		if ($edi_sub_num1.equalsIgnoreCase(name)) {
			return edi_sub_num1();
		}
		if ($slo_upd_cntr.equalsIgnoreCase(name)) {
			return slo_upd_cntr();
		}
		if ($qtn_upd_cntr.equalsIgnoreCase(name)) {
			return qtn_upd_cntr();
		}
		if ($hdr_qty.equalsIgnoreCase(name)) {
			return hdr_qty();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($slo_dt.equalsIgnoreCase(name)) {
			return slo_dt();
		}
		if ($qtn_valid_dt.equalsIgnoreCase(name)) {
			return qtn_valid_dt();
		}
		if ($rcpt_dt.equalsIgnoreCase(name)) {
			return rcpt_dt();
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
		if ($edi_sub_dt1.equalsIgnoreCase(name)) {
			return edi_sub_dt1();
		}
		if ($sls_dt.equalsIgnoreCase(name)) {
			return sls_dt();
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
		if ($latest_flg.equalsIgnoreCase(name)) {
			return latest_flg();
		}
		if ($aprv_flg.equalsIgnoreCase(name)) {
			return aprv_flg();
		}
		if ($aprv_back_flg.equalsIgnoreCase(name)) {
			return aprv_back_flg();
		}
		if ($aprv_upd_flg.equalsIgnoreCase(name)) {
			return aprv_upd_flg();
		}
		if ($aprv_can_flg.equalsIgnoreCase(name)) {
			return aprv_can_flg();
		}
		if ($edi_flg.equalsIgnoreCase(name)) {
			return edi_flg();
		}
		if ($hdr_not_lg_mix_flg.equalsIgnoreCase(name)) {
			return hdr_not_lg_mix_flg();
		}
		if ($hdr_not_lot_mix_flg.equalsIgnoreCase(name)) {
			return hdr_not_lot_mix_flg();
		}
		if ($hdr_not_sublot_mix_flg.equalsIgnoreCase(name)) {
			return hdr_not_sublot_mix_flg();
		}
		if ($xrate_inpt_flg.equalsIgnoreCase(name)) {
			return xrate_inpt_flg();
		}
		if ($ptax_xrate_inpt_flg.equalsIgnoreCase(name)) {
			return ptax_xrate_inpt_flg();
		}
		if ($tdlv_req_flg.equalsIgnoreCase(name)) {
			return tdlv_req_flg();
		}
		if ($sls_upri_cng_flg.equalsIgnoreCase(name)) {
			return sls_upri_cng_flg();
		}
		if ($cst_iv_flg.equalsIgnoreCase(name)) {
			return cst_iv_flg();
		}
		if ($iv_num_flg.equalsIgnoreCase(name)) {
			return iv_num_flg();
		}
		if ($old_aprv_flg.equalsIgnoreCase(name)) {
			return old_aprv_flg();
		}
		if ($old_can_upd_flg.equalsIgnoreCase(name)) {
			return old_can_upd_flg();
		}
		if ($old_can_del_flg.equalsIgnoreCase(name)) {
			return old_can_del_flg();
		}
		if ($ship_prnt_no_cst_nm_flg.equalsIgnoreCase(name)) {
			return ship_prnt_no_cst_nm_flg();
		}
		if ($slo_last_sls_flg.equalsIgnoreCase(name)) {
			return slo_last_sls_flg();
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
		if ($srch_tgt_no.equalsIgnoreCase(name)) {
			srch_tgt_no(value);
			return;
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			slo_no(value);
			return;
		}
		if ($slo_typ.equalsIgnoreCase(name)) {
			slo_typ(value);
			return;
		}
		if ($slo_typ_nm.equalsIgnoreCase(name)) {
			slo_typ_nm(value);
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
		if ($def_cst_cd.equalsIgnoreCase(name)) {
			def_cst_cd(value);
			return;
		}
		if ($prnt_lcl_cd.equalsIgnoreCase(name)) {
			prnt_lcl_cd(value);
			return;
		}
		if ($dest_cd1.equalsIgnoreCase(name)) {
			dest_cd1(value);
			return;
		}
		if ($dest_nm1.equalsIgnoreCase(name)) {
			dest_nm1(value);
			return;
		}
		if ($dest_cd2.equalsIgnoreCase(name)) {
			dest_cd2(value);
			return;
		}
		if ($dest_nm2.equalsIgnoreCase(name)) {
			dest_nm2(value);
			return;
		}
		if ($dest_cd3.equalsIgnoreCase(name)) {
			dest_cd3(value);
			return;
		}
		if ($dest_nm3.equalsIgnoreCase(name)) {
			dest_nm3(value);
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
		if ($cst_cd.equalsIgnoreCase(name)) {
			cst_cd(value);
			return;
		}
		if ($cst_nm.equalsIgnoreCase(name)) {
			cst_nm(value);
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
		if ($bp_sls_basis_typ.equalsIgnoreCase(name)) {
			bp_sls_basis_typ(value);
			return;
		}
		if ($cst_usr_cd.equalsIgnoreCase(name)) {
			cst_usr_cd(value);
			return;
		}
		if ($cst_dpt_cd.equalsIgnoreCase(name)) {
			cst_dpt_cd(value);
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
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			wg_nm(value);
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
		if ($ptax_cur_cd.equalsIgnoreCase(name)) {
			ptax_cur_cd(value);
			return;
		}
		if ($ptax_cur_nm.equalsIgnoreCase(name)) {
			ptax_cur_nm(value);
			return;
		}
		if ($sls_upri_req_typ.equalsIgnoreCase(name)) {
			sls_upri_req_typ(value);
			return;
		}
		if ($ship_schd_split_typ.equalsIgnoreCase(name)) {
			ship_schd_split_typ(value);
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
		if ($xrate_rnd_typ.equalsIgnoreCase(name)) {
			xrate_rnd_typ(value);
			return;
		}
		if ($wtax_rnd_typ.equalsIgnoreCase(name)) {
			wtax_rnd_typ(value);
			return;
		}
		if ($qtn_no.equalsIgnoreCase(name)) {
			qtn_no(value);
			return;
		}
		if ($assort_typ.equalsIgnoreCase(name)) {
			assort_typ(value);
			return;
		}
		if ($assort_typ_nm.equalsIgnoreCase(name)) {
			assort_typ_nm(value);
			return;
		}
		if ($adv_ship_ctrl_typ.equalsIgnoreCase(name)) {
			adv_ship_ctrl_typ(value);
			return;
		}
		if ($adv_ship_ctrl_typ_nm.equalsIgnoreCase(name)) {
			adv_ship_ctrl_typ_nm(value);
			return;
		}
		if ($cst_po_no.equalsIgnoreCase(name)) {
			cst_po_no(value);
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
		if ($acst_cd.equalsIgnoreCase(name)) {
			acst_cd(value);
			return;
		}
		if ($acst_nm.equalsIgnoreCase(name)) {
			acst_nm(value);
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
		if ($iv_no.equalsIgnoreCase(name)) {
			iv_no(value);
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
		if ($cst_po_rmrks.equalsIgnoreCase(name)) {
			cst_po_rmrks(value);
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
		if ($edi_sub_char1.equalsIgnoreCase(name)) {
			edi_sub_char1(value);
			return;
		}
		if ($edi_sub_char2.equalsIgnoreCase(name)) {
			edi_sub_char2(value);
			return;
		}
		if ($edi_sub_char3.equalsIgnoreCase(name)) {
			edi_sub_char3(value);
			return;
		}
		if ($edi_sub_char4.equalsIgnoreCase(name)) {
			edi_sub_char4(value);
			return;
		}
		if ($edi_sub_char5.equalsIgnoreCase(name)) {
			edi_sub_char5(value);
			return;
		}
		if ($can_rsn_cd.equalsIgnoreCase(name)) {
			can_rsn_cd(value);
			return;
		}
		if ($can_rsn_nm.equalsIgnoreCase(name)) {
			can_rsn_nm(value);
			return;
		}
		if ($can_rmrks.equalsIgnoreCase(name)) {
			can_rmrks(value);
			return;
		}
		if ($old_aprv_no.equalsIgnoreCase(name)) {
			old_aprv_no(value);
			return;
		}
		if ($old_aprv_sts_typ.equalsIgnoreCase(name)) {
			old_aprv_sts_typ(value);
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
		if ($dlv_day_week_typ.equalsIgnoreCase(name)) {
			dlv_day_week_typ(value);
			return;
		}
		if ($dlv_day_week_typ_nm.equalsIgnoreCase(name)) {
			dlv_day_week_typ_nm(value);
			return;
		}
		if ($frc_rsn_cd.equalsIgnoreCase(name)) {
			frc_rsn_cd(value);
			return;
		}
		if ($frc_rsn_cd_nm.equalsIgnoreCase(name)) {
			frc_rsn_cd_nm(value);
			return;
		}
		if ($sales_cond.equalsIgnoreCase(name)) {
			sales_cond(value);
			return;
		}
		if ($sales_cond_nm.equalsIgnoreCase(name)) {
			sales_cond_nm(value);
			return;
		}
		if ($src_wrk_no.equalsIgnoreCase(name)) {
			src_wrk_no(value);
			return;
		}
		if ($zoho_sls_schd_no.equalsIgnoreCase(name)) {
			zoho_sls_schd_no(value);
			return;
		}
		if ($surv_line_qty.equalsIgnoreCase(name)) {
			surv_line_qty(value);
			return;
		}
		if ($diameter.equalsIgnoreCase(name)) {
			diameter(value);
			return;
		}
		if ($match_key.equalsIgnoreCase(name)) {
			match_key(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($slo_rev.equalsIgnoreCase(name)) {
			slo_rev(value);
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
		if ($ptax_cur_amt_dec_place.equalsIgnoreCase(name)) {
			ptax_cur_amt_dec_place(value);
			return;
		}
		if ($ptax_cur_upri_dec_place.equalsIgnoreCase(name)) {
			ptax_cur_upri_dec_place(value);
			return;
		}
		if ($cst_bill_crryovr_times.equalsIgnoreCase(name)) {
			cst_bill_crryovr_times(value);
			return;
		}
		if ($qtn_rev.equalsIgnoreCase(name)) {
			qtn_rev(value);
			return;
		}
		if ($prof_rate.equalsIgnoreCase(name)) {
			prof_rate(value);
			return;
		}
		if ($base_cur_ttl_amt.equalsIgnoreCase(name)) {
			base_cur_ttl_amt(value);
			return;
		}
		if ($ttl_cost_amt.equalsIgnoreCase(name)) {
			ttl_cost_amt(value);
			return;
		}
		if ($cst_po_rev.equalsIgnoreCase(name)) {
			cst_po_rev(value);
			return;
		}
		if ($edi_sub_num1.equalsIgnoreCase(name)) {
			edi_sub_num1(value);
			return;
		}
		if ($slo_upd_cntr.equalsIgnoreCase(name)) {
			slo_upd_cntr(value);
			return;
		}
		if ($qtn_upd_cntr.equalsIgnoreCase(name)) {
			qtn_upd_cntr(value);
			return;
		}
		if ($hdr_qty.equalsIgnoreCase(name)) {
			hdr_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($slo_rev.equalsIgnoreCase(name)) {
			slo_rev(value);
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
		if ($ptax_cur_amt_dec_place.equalsIgnoreCase(name)) {
			ptax_cur_amt_dec_place(value);
			return;
		}
		if ($ptax_cur_upri_dec_place.equalsIgnoreCase(name)) {
			ptax_cur_upri_dec_place(value);
			return;
		}
		if ($cst_bill_crryovr_times.equalsIgnoreCase(name)) {
			cst_bill_crryovr_times(value);
			return;
		}
		if ($qtn_rev.equalsIgnoreCase(name)) {
			qtn_rev(value);
			return;
		}
		if ($prof_rate.equalsIgnoreCase(name)) {
			prof_rate(value);
			return;
		}
		if ($base_cur_ttl_amt.equalsIgnoreCase(name)) {
			base_cur_ttl_amt(value);
			return;
		}
		if ($ttl_cost_amt.equalsIgnoreCase(name)) {
			ttl_cost_amt(value);
			return;
		}
		if ($cst_po_rev.equalsIgnoreCase(name)) {
			cst_po_rev(value);
			return;
		}
		if ($edi_sub_num1.equalsIgnoreCase(name)) {
			edi_sub_num1(value);
			return;
		}
		if ($slo_upd_cntr.equalsIgnoreCase(name)) {
			slo_upd_cntr(value);
			return;
		}
		if ($qtn_upd_cntr.equalsIgnoreCase(name)) {
			qtn_upd_cntr(value);
			return;
		}
		if ($hdr_qty.equalsIgnoreCase(name)) {
			hdr_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($slo_rev.equalsIgnoreCase(name)) {
			slo_rev(value);
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
		if ($ptax_cur_amt_dec_place.equalsIgnoreCase(name)) {
			ptax_cur_amt_dec_place(value);
			return;
		}
		if ($ptax_cur_upri_dec_place.equalsIgnoreCase(name)) {
			ptax_cur_upri_dec_place(value);
			return;
		}
		if ($cst_bill_crryovr_times.equalsIgnoreCase(name)) {
			cst_bill_crryovr_times(value);
			return;
		}
		if ($qtn_rev.equalsIgnoreCase(name)) {
			qtn_rev(value);
			return;
		}
		if ($prof_rate.equalsIgnoreCase(name)) {
			prof_rate(value);
			return;
		}
		if ($base_cur_ttl_amt.equalsIgnoreCase(name)) {
			base_cur_ttl_amt(value);
			return;
		}
		if ($ttl_cost_amt.equalsIgnoreCase(name)) {
			ttl_cost_amt(value);
			return;
		}
		if ($cst_po_rev.equalsIgnoreCase(name)) {
			cst_po_rev(value);
			return;
		}
		if ($edi_sub_num1.equalsIgnoreCase(name)) {
			edi_sub_num1(value);
			return;
		}
		if ($slo_upd_cntr.equalsIgnoreCase(name)) {
			slo_upd_cntr(value);
			return;
		}
		if ($qtn_upd_cntr.equalsIgnoreCase(name)) {
			qtn_upd_cntr(value);
			return;
		}
		if ($hdr_qty.equalsIgnoreCase(name)) {
			hdr_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($slo_rev.equalsIgnoreCase(name)) {
			slo_rev(value);
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
		if ($ptax_cur_amt_dec_place.equalsIgnoreCase(name)) {
			ptax_cur_amt_dec_place(value);
			return;
		}
		if ($ptax_cur_upri_dec_place.equalsIgnoreCase(name)) {
			ptax_cur_upri_dec_place(value);
			return;
		}
		if ($cst_bill_crryovr_times.equalsIgnoreCase(name)) {
			cst_bill_crryovr_times(value);
			return;
		}
		if ($qtn_rev.equalsIgnoreCase(name)) {
			qtn_rev(value);
			return;
		}
		if ($prof_rate.equalsIgnoreCase(name)) {
			prof_rate(value);
			return;
		}
		if ($base_cur_ttl_amt.equalsIgnoreCase(name)) {
			base_cur_ttl_amt(value);
			return;
		}
		if ($ttl_cost_amt.equalsIgnoreCase(name)) {
			ttl_cost_amt(value);
			return;
		}
		if ($cst_po_rev.equalsIgnoreCase(name)) {
			cst_po_rev(value);
			return;
		}
		if ($edi_sub_num1.equalsIgnoreCase(name)) {
			edi_sub_num1(value);
			return;
		}
		if ($slo_upd_cntr.equalsIgnoreCase(name)) {
			slo_upd_cntr(value);
			return;
		}
		if ($qtn_upd_cntr.equalsIgnoreCase(name)) {
			qtn_upd_cntr(value);
			return;
		}
		if ($hdr_qty.equalsIgnoreCase(name)) {
			hdr_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($slo_rev.equalsIgnoreCase(name)) {
			slo_rev(value);
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
		if ($ptax_cur_amt_dec_place.equalsIgnoreCase(name)) {
			ptax_cur_amt_dec_place(value);
			return;
		}
		if ($ptax_cur_upri_dec_place.equalsIgnoreCase(name)) {
			ptax_cur_upri_dec_place(value);
			return;
		}
		if ($cst_bill_crryovr_times.equalsIgnoreCase(name)) {
			cst_bill_crryovr_times(value);
			return;
		}
		if ($qtn_rev.equalsIgnoreCase(name)) {
			qtn_rev(value);
			return;
		}
		if ($prof_rate.equalsIgnoreCase(name)) {
			prof_rate(value);
			return;
		}
		if ($base_cur_ttl_amt.equalsIgnoreCase(name)) {
			base_cur_ttl_amt(value);
			return;
		}
		if ($ttl_cost_amt.equalsIgnoreCase(name)) {
			ttl_cost_amt(value);
			return;
		}
		if ($cst_po_rev.equalsIgnoreCase(name)) {
			cst_po_rev(value);
			return;
		}
		if ($edi_sub_num1.equalsIgnoreCase(name)) {
			edi_sub_num1(value);
			return;
		}
		if ($slo_upd_cntr.equalsIgnoreCase(name)) {
			slo_upd_cntr(value);
			return;
		}
		if ($qtn_upd_cntr.equalsIgnoreCase(name)) {
			qtn_upd_cntr(value);
			return;
		}
		if ($hdr_qty.equalsIgnoreCase(name)) {
			hdr_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($slo_dt.equalsIgnoreCase(name)) {
			slo_dt(value);
			return;
		}
		if ($qtn_valid_dt.equalsIgnoreCase(name)) {
			qtn_valid_dt(value);
			return;
		}
		if ($rcpt_dt.equalsIgnoreCase(name)) {
			rcpt_dt(value);
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
		if ($edi_sub_dt1.equalsIgnoreCase(name)) {
			edi_sub_dt1(value);
			return;
		}
		if ($sls_dt.equalsIgnoreCase(name)) {
			sls_dt(value);
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
		if ($latest_flg.equalsIgnoreCase(name)) {
			latest_flg(value);
			return;
		}
		if ($aprv_flg.equalsIgnoreCase(name)) {
			aprv_flg(value);
			return;
		}
		if ($aprv_back_flg.equalsIgnoreCase(name)) {
			aprv_back_flg(value);
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
		if ($edi_flg.equalsIgnoreCase(name)) {
			edi_flg(value);
			return;
		}
		if ($hdr_not_lg_mix_flg.equalsIgnoreCase(name)) {
			hdr_not_lg_mix_flg(value);
			return;
		}
		if ($hdr_not_lot_mix_flg.equalsIgnoreCase(name)) {
			hdr_not_lot_mix_flg(value);
			return;
		}
		if ($hdr_not_sublot_mix_flg.equalsIgnoreCase(name)) {
			hdr_not_sublot_mix_flg(value);
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
		if ($tdlv_req_flg.equalsIgnoreCase(name)) {
			tdlv_req_flg(value);
			return;
		}
		if ($sls_upri_cng_flg.equalsIgnoreCase(name)) {
			sls_upri_cng_flg(value);
			return;
		}
		if ($cst_iv_flg.equalsIgnoreCase(name)) {
			cst_iv_flg(value);
			return;
		}
		if ($iv_num_flg.equalsIgnoreCase(name)) {
			iv_num_flg(value);
			return;
		}
		if ($old_aprv_flg.equalsIgnoreCase(name)) {
			old_aprv_flg(value);
			return;
		}
		if ($old_can_upd_flg.equalsIgnoreCase(name)) {
			old_can_upd_flg(value);
			return;
		}
		if ($old_can_del_flg.equalsIgnoreCase(name)) {
			old_can_del_flg(value);
			return;
		}
		if ($ship_prnt_no_cst_nm_flg.equalsIgnoreCase(name)) {
			ship_prnt_no_cst_nm_flg(value);
			return;
		}
		if ($slo_last_sls_flg.equalsIgnoreCase(name)) {
			slo_last_sls_flg(value);
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
		if ($srch_tgt_no.equalsIgnoreCase(name)) {
			srch_tgt_no(value);
			return;
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			slo_no(value);
			return;
		}
		if ($slo_typ.equalsIgnoreCase(name)) {
			slo_typ(value);
			return;
		}
		if ($slo_typ_nm.equalsIgnoreCase(name)) {
			slo_typ_nm(value);
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
		if ($def_cst_cd.equalsIgnoreCase(name)) {
			def_cst_cd(value);
			return;
		}
		if ($prnt_lcl_cd.equalsIgnoreCase(name)) {
			prnt_lcl_cd(value);
			return;
		}
		if ($dest_cd1.equalsIgnoreCase(name)) {
			dest_cd1(value);
			return;
		}
		if ($dest_nm1.equalsIgnoreCase(name)) {
			dest_nm1(value);
			return;
		}
		if ($dest_cd2.equalsIgnoreCase(name)) {
			dest_cd2(value);
			return;
		}
		if ($dest_nm2.equalsIgnoreCase(name)) {
			dest_nm2(value);
			return;
		}
		if ($dest_cd3.equalsIgnoreCase(name)) {
			dest_cd3(value);
			return;
		}
		if ($dest_nm3.equalsIgnoreCase(name)) {
			dest_nm3(value);
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
		if ($cst_cd.equalsIgnoreCase(name)) {
			cst_cd(value);
			return;
		}
		if ($cst_nm.equalsIgnoreCase(name)) {
			cst_nm(value);
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
		if ($bp_sls_basis_typ.equalsIgnoreCase(name)) {
			bp_sls_basis_typ(value);
			return;
		}
		if ($cst_usr_cd.equalsIgnoreCase(name)) {
			cst_usr_cd(value);
			return;
		}
		if ($cst_dpt_cd.equalsIgnoreCase(name)) {
			cst_dpt_cd(value);
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
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			wg_nm(value);
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
		if ($ptax_cur_cd.equalsIgnoreCase(name)) {
			ptax_cur_cd(value);
			return;
		}
		if ($ptax_cur_nm.equalsIgnoreCase(name)) {
			ptax_cur_nm(value);
			return;
		}
		if ($sls_upri_req_typ.equalsIgnoreCase(name)) {
			sls_upri_req_typ(value);
			return;
		}
		if ($ship_schd_split_typ.equalsIgnoreCase(name)) {
			ship_schd_split_typ(value);
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
		if ($xrate_rnd_typ.equalsIgnoreCase(name)) {
			xrate_rnd_typ(value);
			return;
		}
		if ($wtax_rnd_typ.equalsIgnoreCase(name)) {
			wtax_rnd_typ(value);
			return;
		}
		if ($qtn_no.equalsIgnoreCase(name)) {
			qtn_no(value);
			return;
		}
		if ($assort_typ.equalsIgnoreCase(name)) {
			assort_typ(value);
			return;
		}
		if ($assort_typ_nm.equalsIgnoreCase(name)) {
			assort_typ_nm(value);
			return;
		}
		if ($adv_ship_ctrl_typ.equalsIgnoreCase(name)) {
			adv_ship_ctrl_typ(value);
			return;
		}
		if ($adv_ship_ctrl_typ_nm.equalsIgnoreCase(name)) {
			adv_ship_ctrl_typ_nm(value);
			return;
		}
		if ($cst_po_no.equalsIgnoreCase(name)) {
			cst_po_no(value);
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
		if ($acst_cd.equalsIgnoreCase(name)) {
			acst_cd(value);
			return;
		}
		if ($acst_nm.equalsIgnoreCase(name)) {
			acst_nm(value);
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
		if ($iv_no.equalsIgnoreCase(name)) {
			iv_no(value);
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
		if ($cst_po_rmrks.equalsIgnoreCase(name)) {
			cst_po_rmrks(value);
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
		if ($edi_sub_char1.equalsIgnoreCase(name)) {
			edi_sub_char1(value);
			return;
		}
		if ($edi_sub_char2.equalsIgnoreCase(name)) {
			edi_sub_char2(value);
			return;
		}
		if ($edi_sub_char3.equalsIgnoreCase(name)) {
			edi_sub_char3(value);
			return;
		}
		if ($edi_sub_char4.equalsIgnoreCase(name)) {
			edi_sub_char4(value);
			return;
		}
		if ($edi_sub_char5.equalsIgnoreCase(name)) {
			edi_sub_char5(value);
			return;
		}
		if ($can_rsn_cd.equalsIgnoreCase(name)) {
			can_rsn_cd(value);
			return;
		}
		if ($can_rsn_nm.equalsIgnoreCase(name)) {
			can_rsn_nm(value);
			return;
		}
		if ($can_rmrks.equalsIgnoreCase(name)) {
			can_rmrks(value);
			return;
		}
		if ($old_aprv_no.equalsIgnoreCase(name)) {
			old_aprv_no(value);
			return;
		}
		if ($old_aprv_sts_typ.equalsIgnoreCase(name)) {
			old_aprv_sts_typ(value);
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
		if ($dlv_day_week_typ.equalsIgnoreCase(name)) {
			dlv_day_week_typ(value);
			return;
		}
		if ($dlv_day_week_typ_nm.equalsIgnoreCase(name)) {
			dlv_day_week_typ_nm(value);
			return;
		}
		if ($frc_rsn_cd.equalsIgnoreCase(name)) {
			frc_rsn_cd(value);
			return;
		}
		if ($frc_rsn_cd_nm.equalsIgnoreCase(name)) {
			frc_rsn_cd_nm(value);
			return;
		}
		if ($sales_cond.equalsIgnoreCase(name)) {
			sales_cond(value);
			return;
		}
		if ($sales_cond_nm.equalsIgnoreCase(name)) {
			sales_cond_nm(value);
			return;
		}
		if ($src_wrk_no.equalsIgnoreCase(name)) {
			src_wrk_no(value);
			return;
		}
		if ($zoho_sls_schd_no.equalsIgnoreCase(name)) {
			zoho_sls_schd_no(value);
			return;
		}
		if ($surv_line_qty.equalsIgnoreCase(name)) {
			surv_line_qty(value);
			return;
		}
		if ($diameter.equalsIgnoreCase(name)) {
			diameter(value);
			return;
		}
		if ($match_key.equalsIgnoreCase(name)) {
			match_key(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($slo_rev.equalsIgnoreCase(name)) {
			slo_rev(value);
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
		if ($ptax_cur_amt_dec_place.equalsIgnoreCase(name)) {
			ptax_cur_amt_dec_place(value);
			return;
		}
		if ($ptax_cur_upri_dec_place.equalsIgnoreCase(name)) {
			ptax_cur_upri_dec_place(value);
			return;
		}
		if ($cst_bill_crryovr_times.equalsIgnoreCase(name)) {
			cst_bill_crryovr_times(value);
			return;
		}
		if ($qtn_rev.equalsIgnoreCase(name)) {
			qtn_rev(value);
			return;
		}
		if ($prof_rate.equalsIgnoreCase(name)) {
			prof_rate(value);
			return;
		}
		if ($base_cur_ttl_amt.equalsIgnoreCase(name)) {
			base_cur_ttl_amt(value);
			return;
		}
		if ($ttl_cost_amt.equalsIgnoreCase(name)) {
			ttl_cost_amt(value);
			return;
		}
		if ($cst_po_rev.equalsIgnoreCase(name)) {
			cst_po_rev(value);
			return;
		}
		if ($edi_sub_num1.equalsIgnoreCase(name)) {
			edi_sub_num1(value);
			return;
		}
		if ($slo_upd_cntr.equalsIgnoreCase(name)) {
			slo_upd_cntr(value);
			return;
		}
		if ($qtn_upd_cntr.equalsIgnoreCase(name)) {
			qtn_upd_cntr(value);
			return;
		}
		if ($hdr_qty.equalsIgnoreCase(name)) {
			hdr_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($slo_rev.equalsIgnoreCase(name)) {
			slo_rev(value);
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
		if ($ptax_cur_amt_dec_place.equalsIgnoreCase(name)) {
			ptax_cur_amt_dec_place(value);
			return;
		}
		if ($ptax_cur_upri_dec_place.equalsIgnoreCase(name)) {
			ptax_cur_upri_dec_place(value);
			return;
		}
		if ($cst_bill_crryovr_times.equalsIgnoreCase(name)) {
			cst_bill_crryovr_times(value);
			return;
		}
		if ($qtn_rev.equalsIgnoreCase(name)) {
			qtn_rev(value);
			return;
		}
		if ($prof_rate.equalsIgnoreCase(name)) {
			prof_rate(value);
			return;
		}
		if ($base_cur_ttl_amt.equalsIgnoreCase(name)) {
			base_cur_ttl_amt(value);
			return;
		}
		if ($ttl_cost_amt.equalsIgnoreCase(name)) {
			ttl_cost_amt(value);
			return;
		}
		if ($cst_po_rev.equalsIgnoreCase(name)) {
			cst_po_rev(value);
			return;
		}
		if ($edi_sub_num1.equalsIgnoreCase(name)) {
			edi_sub_num1(value);
			return;
		}
		if ($slo_upd_cntr.equalsIgnoreCase(name)) {
			slo_upd_cntr(value);
			return;
		}
		if ($qtn_upd_cntr.equalsIgnoreCase(name)) {
			qtn_upd_cntr(value);
			return;
		}
		if ($hdr_qty.equalsIgnoreCase(name)) {
			hdr_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($slo_rev.equalsIgnoreCase(name)) {
			slo_rev(value);
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
		if ($ptax_cur_amt_dec_place.equalsIgnoreCase(name)) {
			ptax_cur_amt_dec_place(value);
			return;
		}
		if ($ptax_cur_upri_dec_place.equalsIgnoreCase(name)) {
			ptax_cur_upri_dec_place(value);
			return;
		}
		if ($cst_bill_crryovr_times.equalsIgnoreCase(name)) {
			cst_bill_crryovr_times(value);
			return;
		}
		if ($qtn_rev.equalsIgnoreCase(name)) {
			qtn_rev(value);
			return;
		}
		if ($prof_rate.equalsIgnoreCase(name)) {
			prof_rate(value);
			return;
		}
		if ($base_cur_ttl_amt.equalsIgnoreCase(name)) {
			base_cur_ttl_amt(value);
			return;
		}
		if ($ttl_cost_amt.equalsIgnoreCase(name)) {
			ttl_cost_amt(value);
			return;
		}
		if ($cst_po_rev.equalsIgnoreCase(name)) {
			cst_po_rev(value);
			return;
		}
		if ($edi_sub_num1.equalsIgnoreCase(name)) {
			edi_sub_num1(value);
			return;
		}
		if ($slo_upd_cntr.equalsIgnoreCase(name)) {
			slo_upd_cntr(value);
			return;
		}
		if ($qtn_upd_cntr.equalsIgnoreCase(name)) {
			qtn_upd_cntr(value);
			return;
		}
		if ($hdr_qty.equalsIgnoreCase(name)) {
			hdr_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($slo_rev.equalsIgnoreCase(name)) {
			slo_rev(value);
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
		if ($ptax_cur_amt_dec_place.equalsIgnoreCase(name)) {
			ptax_cur_amt_dec_place(value);
			return;
		}
		if ($ptax_cur_upri_dec_place.equalsIgnoreCase(name)) {
			ptax_cur_upri_dec_place(value);
			return;
		}
		if ($cst_bill_crryovr_times.equalsIgnoreCase(name)) {
			cst_bill_crryovr_times(value);
			return;
		}
		if ($qtn_rev.equalsIgnoreCase(name)) {
			qtn_rev(value);
			return;
		}
		if ($prof_rate.equalsIgnoreCase(name)) {
			prof_rate(value);
			return;
		}
		if ($base_cur_ttl_amt.equalsIgnoreCase(name)) {
			base_cur_ttl_amt(value);
			return;
		}
		if ($ttl_cost_amt.equalsIgnoreCase(name)) {
			ttl_cost_amt(value);
			return;
		}
		if ($cst_po_rev.equalsIgnoreCase(name)) {
			cst_po_rev(value);
			return;
		}
		if ($edi_sub_num1.equalsIgnoreCase(name)) {
			edi_sub_num1(value);
			return;
		}
		if ($slo_upd_cntr.equalsIgnoreCase(name)) {
			slo_upd_cntr(value);
			return;
		}
		if ($qtn_upd_cntr.equalsIgnoreCase(name)) {
			qtn_upd_cntr(value);
			return;
		}
		if ($hdr_qty.equalsIgnoreCase(name)) {
			hdr_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($slo_rev.equalsIgnoreCase(name)) {
			slo_rev(value);
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
		if ($ptax_cur_amt_dec_place.equalsIgnoreCase(name)) {
			ptax_cur_amt_dec_place(value);
			return;
		}
		if ($ptax_cur_upri_dec_place.equalsIgnoreCase(name)) {
			ptax_cur_upri_dec_place(value);
			return;
		}
		if ($cst_bill_crryovr_times.equalsIgnoreCase(name)) {
			cst_bill_crryovr_times(value);
			return;
		}
		if ($qtn_rev.equalsIgnoreCase(name)) {
			qtn_rev(value);
			return;
		}
		if ($prof_rate.equalsIgnoreCase(name)) {
			prof_rate(value);
			return;
		}
		if ($base_cur_ttl_amt.equalsIgnoreCase(name)) {
			base_cur_ttl_amt(value);
			return;
		}
		if ($ttl_cost_amt.equalsIgnoreCase(name)) {
			ttl_cost_amt(value);
			return;
		}
		if ($cst_po_rev.equalsIgnoreCase(name)) {
			cst_po_rev(value);
			return;
		}
		if ($edi_sub_num1.equalsIgnoreCase(name)) {
			edi_sub_num1(value);
			return;
		}
		if ($slo_upd_cntr.equalsIgnoreCase(name)) {
			slo_upd_cntr(value);
			return;
		}
		if ($qtn_upd_cntr.equalsIgnoreCase(name)) {
			qtn_upd_cntr(value);
			return;
		}
		if ($hdr_qty.equalsIgnoreCase(name)) {
			hdr_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($slo_dt.equalsIgnoreCase(name)) {
			slo_dt(value);
			return;
		}
		if ($qtn_valid_dt.equalsIgnoreCase(name)) {
			qtn_valid_dt(value);
			return;
		}
		if ($rcpt_dt.equalsIgnoreCase(name)) {
			rcpt_dt(value);
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
		if ($edi_sub_dt1.equalsIgnoreCase(name)) {
			edi_sub_dt1(value);
			return;
		}
		if ($sls_dt.equalsIgnoreCase(name)) {
			sls_dt(value);
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
		if ($latest_flg.equalsIgnoreCase(name)) {
			latest_flg(value);
			return;
		}
		if ($aprv_flg.equalsIgnoreCase(name)) {
			aprv_flg(value);
			return;
		}
		if ($aprv_back_flg.equalsIgnoreCase(name)) {
			aprv_back_flg(value);
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
		if ($edi_flg.equalsIgnoreCase(name)) {
			edi_flg(value);
			return;
		}
		if ($hdr_not_lg_mix_flg.equalsIgnoreCase(name)) {
			hdr_not_lg_mix_flg(value);
			return;
		}
		if ($hdr_not_lot_mix_flg.equalsIgnoreCase(name)) {
			hdr_not_lot_mix_flg(value);
			return;
		}
		if ($hdr_not_sublot_mix_flg.equalsIgnoreCase(name)) {
			hdr_not_sublot_mix_flg(value);
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
		if ($tdlv_req_flg.equalsIgnoreCase(name)) {
			tdlv_req_flg(value);
			return;
		}
		if ($sls_upri_cng_flg.equalsIgnoreCase(name)) {
			sls_upri_cng_flg(value);
			return;
		}
		if ($cst_iv_flg.equalsIgnoreCase(name)) {
			cst_iv_flg(value);
			return;
		}
		if ($iv_num_flg.equalsIgnoreCase(name)) {
			iv_num_flg(value);
			return;
		}
		if ($old_aprv_flg.equalsIgnoreCase(name)) {
			old_aprv_flg(value);
			return;
		}
		if ($old_can_upd_flg.equalsIgnoreCase(name)) {
			old_can_upd_flg(value);
			return;
		}
		if ($old_can_del_flg.equalsIgnoreCase(name)) {
			old_can_del_flg(value);
			return;
		}
		if ($ship_prnt_no_cst_nm_flg.equalsIgnoreCase(name)) {
			ship_prnt_no_cst_nm_flg(value);
			return;
		}
		if ($slo_last_sls_flg.equalsIgnoreCase(name)) {
			slo_last_sls_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($dlv_p.equalsIgnoreCase(name)) {
			return dlv_p();
		}
		if ($tdlv_p.equalsIgnoreCase(name)) {
			return tdlv_p();
		}
		if ($usr_dpt_p.equalsIgnoreCase(name)) {
			return usr_dpt_p();
		}
		if ($cred_bal_p.equalsIgnoreCase(name)) {
			return cred_bal_p();
		}
		if ($xrate_p.equalsIgnoreCase(name)) {
			return xrate_p();
		}
		if ($ptax_xrate_p.equalsIgnoreCase(name)) {
			return ptax_xrate_p();
		}
		if ($wrk_no_p.equalsIgnoreCase(name)) {
			return wrk_no_p();
		}
		if ($ttl_amt_p.equalsIgnoreCase(name)) {
			return ttl_amt_p();
		}
		if ($ttl_amt_no_cost_p.equalsIgnoreCase(name)) {
			return ttl_amt_no_cost_p();
		}
		if ($trd_cur_amt_p.equalsIgnoreCase(name)) {
			return trd_cur_amt_p();
		}
		if ($trd_cur_inc_tax_amt_p.equalsIgnoreCase(name)) {
			return trd_cur_inc_tax_amt_p();
		}
		if ($adv_bill_amt_p.equalsIgnoreCase(name)) {
			return adv_bill_amt_p();
		}
		if ($adv_rcv_amt_p.equalsIgnoreCase(name)) {
			return adv_rcv_amt_p();
		}
		if ($ship_rqst_p.equalsIgnoreCase(name)) {
			return ship_rqst_p();
		}
		if ($dlv_rqst_p.equalsIgnoreCase(name)) {
			return dlv_rqst_p();
		}
		if ($par_itm_p.equalsIgnoreCase(name)) {
			return par_itm_p();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($dlv_p.equalsIgnoreCase(name)) {
			dlv_p(
				((MCContainerMeta) dlv_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0210.DlvR.class, value)
			);
			return;
		}
		if ($tdlv_p.equalsIgnoreCase(name)) {
			tdlv_p(
				((MCContainerMeta) tdlv_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0210.DlvR.class, value)
			);
			return;
		}
		if ($usr_dpt_p.equalsIgnoreCase(name)) {
			usr_dpt_p(
				((MCContainerMeta) usr_dpt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0320.UsrDptR.class, value)
			);
			return;
		}
		if ($cred_bal_p.equalsIgnoreCase(name)) {
			cred_bal_p(
				((MCContainerMeta) cred_bal_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0060.AmtR.class, value)
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
		if ($wrk_no_p.equalsIgnoreCase(name)) {
			wrk_no_p(
				((MCContainerMeta) wrk_no_p_META).castInnerRow(mcframe.clientMSUB.MSUBP0010.WrkNoR.class, value)
			);
			return;
		}
		if ($ttl_amt_p.equalsIgnoreCase(name)) {
			ttl_amt_p(
				((MCContainerMeta) ttl_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0060.AmtR.class, value)
			);
			return;
		}
		if ($ttl_amt_no_cost_p.equalsIgnoreCase(name)) {
			ttl_amt_no_cost_p(
				((MCContainerMeta) ttl_amt_no_cost_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0060.AmtR.class, value)
			);
			return;
		}
		if ($trd_cur_amt_p.equalsIgnoreCase(name)) {
			trd_cur_amt_p(
				((MCContainerMeta) trd_cur_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0060.AmtR.class, value)
			);
			return;
		}
		if ($trd_cur_inc_tax_amt_p.equalsIgnoreCase(name)) {
			trd_cur_inc_tax_amt_p(
				((MCContainerMeta) trd_cur_inc_tax_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0060.AmtR.class, value)
			);
			return;
		}
		if ($adv_bill_amt_p.equalsIgnoreCase(name)) {
			adv_bill_amt_p(
				((MCContainerMeta) adv_bill_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0060.AmtR.class, value)
			);
			return;
		}
		if ($adv_rcv_amt_p.equalsIgnoreCase(name)) {
			adv_rcv_amt_p(
				((MCContainerMeta) adv_rcv_amt_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0060.AmtR.class, value)
			);
			return;
		}
		if ($ship_rqst_p.equalsIgnoreCase(name)) {
			ship_rqst_p(
				((MCContainerMeta) ship_rqst_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0110.YmdHmR.class, value)
			);
			return;
		}
		if ($dlv_rqst_p.equalsIgnoreCase(name)) {
			dlv_rqst_p(
				((MCContainerMeta) dlv_rqst_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0110.YmdHmR.class, value)
			);
			return;
		}
		if ($par_itm_p.equalsIgnoreCase(name)) {
			par_itm_p(
				((MCContainerMeta) par_itm_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0030.ItmR.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	public String dlv_cd() {
		return dlv_p().bp_cd();
	}

	public void dlv_cd(String value) {
		dlv_p().bp_cd(value);
	}

	public String dlv_nm() {
		return dlv_p().bp_nm();
	}

	public void dlv_nm(String value) {
		dlv_p().bp_nm(value);
	}

	public boolean dlv_sundry_flg() {
		return dlv_p().dlv_sundry_flg();
	}

	public void dlv_sundry_flg(boolean value) {
		dlv_p().dlv_sundry_flg(value);
	}

	public boolean pri_prnt_flg() {
		return dlv_p().pri_prnt_flg();
	}

	public void pri_prnt_flg(boolean value) {
		dlv_p().pri_prnt_flg(value);
	}

	public String dlv_lg_grp_cd() {
		return dlv_p().lg_grp_cd();
	}

	public void dlv_lg_grp_cd(String value) {
		dlv_p().lg_grp_cd(value);
	}

	public String dlv_lg_grp_nm() {
		return dlv_p().lg_grp_nm();
	}

	public void dlv_lg_grp_nm(String value) {
		dlv_p().lg_grp_nm(value);
	}

	public String dlv_cntry_cd() {
		return dlv_p().cntry_cd();
	}

	public void dlv_cntry_cd(String value) {
		dlv_p().cntry_cd(value);
	}

	public String dlv_cntry_nm() {
		return dlv_p().cntry_nm();
	}

	public void dlv_cntry_nm(String value) {
		dlv_p().cntry_nm(value);
	}

	public String dlv_zip_cd() {
		return dlv_p().zip_cd();
	}

	public void dlv_zip_cd(String value) {
		dlv_p().zip_cd(value);
	}

	public String dlv_addr1() {
		return dlv_p().addr1();
	}

	public void dlv_addr1(String value) {
		dlv_p().addr1(value);
	}

	public String dlv_addr2() {
		return dlv_p().addr2();
	}

	public void dlv_addr2(String value) {
		dlv_p().addr2(value);
	}

	public String dlv_addr3() {
		return dlv_p().addr3();
	}

	public void dlv_addr3(String value) {
		dlv_p().addr3(value);
	}

	public String dlv_addr4() {
		return dlv_p().addr4();
	}

	public void dlv_addr4(String value) {
		dlv_p().addr4(value);
	}

	public String dlv_tel() {
		return dlv_p().tel();
	}

	public void dlv_tel(String value) {
		dlv_p().tel(value);
	}

	public String dlv_fax() {
		return dlv_p().fax();
	}

	public void dlv_fax(String value) {
		dlv_p().fax(value);
	}

	public String dlv_cntct_dpt() {
		return dlv_p().dlv_cntct_dpt();
	}

	public void dlv_cntct_dpt(String value) {
		dlv_p().dlv_cntct_dpt(value);
	}

	public String dlv_cntct_psn() {
		return dlv_p().dlv_cntct_psn();
	}

	public void dlv_cntct_psn(String value) {
		dlv_p().dlv_cntct_psn(value);
	}

	/**
	 * Receiving point cd. 配送先ＣＤ.<p>
	 *
	 */
	public String tdlv_cd() {
		return tdlv_p().bp_cd();
	}

	/**
	 * Receiving point cd. 配送先ＣＤ.<p>
	 *
	 */
	public void tdlv_cd(String value) {
		tdlv_p().bp_cd(value);
	}

	/**
	 * Receiving point name 配送先名.<p>
	 *
	 */
	public String tdlv_nm() {
		return tdlv_p().bp_nm();
	}

	/**
	 * Receiving point name 配送先名.<p>
	 *
	 */
	public void tdlv_nm(String value) {
		tdlv_p().bp_nm(value);
	}

	/**
	 * Miscellaneous receiving point 配送先諸口.<p>
	 *
	 */
	public boolean tdlv_sundry_flg() {
		return tdlv_p().dlv_sundry_flg();
	}

	/**
	 * Miscellaneous receiving point 配送先諸口.<p>
	 *
	 */
	public void tdlv_sundry_flg(boolean value) {
		tdlv_p().dlv_sundry_flg(value);
	}

	/**
	 * Receiving point distribution group cd. 配送先物流グループＣＤ.<p>
	 *
	 */
	public String tdlv_lg_grp_cd() {
		return tdlv_p().lg_grp_cd();
	}

	/**
	 * Receiving point distribution group cd. 配送先物流グループＣＤ.<p>
	 *
	 */
	public void tdlv_lg_grp_cd(String value) {
		tdlv_p().lg_grp_cd(value);
	}

	/**
	 * Receiving point distribution group name 配送先物流グループ名.<p>
	 *
	 */
	public String tdlv_lg_grp_nm() {
		return tdlv_p().lg_grp_nm();
	}

	/**
	 * Receiving point distribution group name 配送先物流グループ名.<p>
	 *
	 */
	public void tdlv_lg_grp_nm(String value) {
		tdlv_p().lg_grp_nm(value);
	}

	/**
	 * Receiving point country cd. 配送先国ＣＤ.<p>
	 *
	 */
	public String tdlv_cntry_cd() {
		return tdlv_p().cntry_cd();
	}

	/**
	 * Receiving point country cd. 配送先国ＣＤ.<p>
	 *
	 */
	public void tdlv_cntry_cd(String value) {
		tdlv_p().cntry_cd(value);
	}

	/**
	 * Receiving point country name 配送先国名.<p>
	 *
	 */
	public String tdlv_cntry_nm() {
		return tdlv_p().cntry_nm();
	}

	/**
	 * Receiving point country name 配送先国名.<p>
	 *
	 */
	public void tdlv_cntry_nm(String value) {
		tdlv_p().cntry_nm(value);
	}

	/**
	 * Receiving point zip code 配送先郵便番号.<p>
	 *
	 */
	public String tdlv_zip_cd() {
		return tdlv_p().zip_cd();
	}

	/**
	 * Receiving point zip code 配送先郵便番号.<p>
	 *
	 */
	public void tdlv_zip_cd(String value) {
		tdlv_p().zip_cd(value);
	}

	/**
	 * Receiving point address 1 配送先住所１.<p>
	 *
	 */
	public String tdlv_addr1() {
		return tdlv_p().addr1();
	}

	/**
	 * Receiving point address 1 配送先住所１.<p>
	 *
	 */
	public void tdlv_addr1(String value) {
		tdlv_p().addr1(value);
	}

	/**
	 * Receiving point address 2 配送先住所２.<p>
	 *
	 */
	public String tdlv_addr2() {
		return tdlv_p().addr2();
	}

	/**
	 * Receiving point address 2 配送先住所２.<p>
	 *
	 */
	public void tdlv_addr2(String value) {
		tdlv_p().addr2(value);
	}

	/**
	 * Receiving point address 3 配送先住所３.<p>
	 *
	 */
	public String tdlv_addr3() {
		return tdlv_p().addr3();
	}

	/**
	 * Receiving point address 3 配送先住所３.<p>
	 *
	 */
	public void tdlv_addr3(String value) {
		tdlv_p().addr3(value);
	}

	/**
	 * Receiving point address 4 配送先住所４.<p>
	 *
	 */
	public String tdlv_addr4() {
		return tdlv_p().addr4();
	}

	/**
	 * Receiving point address 4 配送先住所４.<p>
	 *
	 */
	public void tdlv_addr4(String value) {
		tdlv_p().addr4(value);
	}

	/**
	 * Receiving point TEL 配送先ＴＥＬ.<p>
	 *
	 */
	public String tdlv_tel() {
		return tdlv_p().tel();
	}

	/**
	 * Receiving point TEL 配送先ＴＥＬ.<p>
	 *
	 */
	public void tdlv_tel(String value) {
		tdlv_p().tel(value);
	}

	/**
	 * Receiving point FAX 配送先ＦＡＸ.<p>
	 *
	 */
	public String tdlv_fax() {
		return tdlv_p().fax();
	}

	/**
	 * Receiving point FAX 配送先ＦＡＸ.<p>
	 *
	 */
	public void tdlv_fax(String value) {
		tdlv_p().fax(value);
	}

	/**
	 * Receiving point dept. 配送先部署.<p>
	 *
	 */
	public String tdlv_cntct_dpt() {
		return tdlv_p().dlv_cntct_dpt();
	}

	/**
	 * Receiving point dept. 配送先部署.<p>
	 *
	 */
	public void tdlv_cntct_dpt(String value) {
		tdlv_p().dlv_cntct_dpt(value);
	}

	/**
	 * Receiving point PIC 配送先担当者.<p>
	 *
	 */
	public String tdlv_cntct_psn() {
		return tdlv_p().dlv_cntct_psn();
	}

	/**
	 * Receiving point PIC 配送先担当者.<p>
	 *
	 */
	public void tdlv_cntct_psn(String value) {
		tdlv_p().dlv_cntct_psn(value);
	}

	/**
	 * Sales PIC cd. 売上担当者ＣＤ.<p>
	 *
	 */
	public String sls_usr_cd() {
		return usr_dpt_p().usr_cd();
	}

	/**
	 * Sales PIC cd. 売上担当者ＣＤ.<p>
	 *
	 */
	public void sls_usr_cd(String value) {
		usr_dpt_p().usr_cd(value);
	}

	/**
	 * Sales PIC name 売上担当者名.<p>
	 *
	 */
	public String sls_usr_nm() {
		return usr_dpt_p().usr_nm();
	}

	/**
	 * Sales PIC name 売上担当者名.<p>
	 *
	 */
	public void sls_usr_nm(String value) {
		usr_dpt_p().usr_nm(value);
	}

	/**
	 * Sales dept. cd. 売上部門ＣＤ.<p>
	 *
	 */
	public String sls_dpt_cd() {
		return usr_dpt_p().dpt_cd();
	}

	/**
	 * Sales dept. cd. 売上部門ＣＤ.<p>
	 *
	 */
	public void sls_dpt_cd(String value) {
		usr_dpt_p().dpt_cd(value);
	}

	/**
	 * Sales dept. name 売上部門名.<p>
	 *
	 */
	public String sls_dpt_nm() {
		return usr_dpt_p().dpt_nm();
	}

	/**
	 * Sales dept. name 売上部門名.<p>
	 *
	 */
	public void sls_dpt_nm(String value) {
		usr_dpt_p().dpt_nm(value);
	}

	/**
	 * Credit line balance 与信枠残高.<p>
	 *
	 */
	public MCNumber cred_bal() {
		return cred_bal_p().amt();
	}

	/**
	 * Credit line balance 与信枠残高.<p>
	 *
	 */
	public void cred_bal(MCNumber value) {
		cred_bal_p().amt(value);
	}

	/**
	 * Credit line balance 与信枠残高.<p>
	 *
	 */
	public void cred_bal(int value) {
		cred_bal_p().amt(value);
	}

	/**
	 * Credit line balance 与信枠残高.<p>
	 *
	 */
	public void cred_bal(long value) {
		cred_bal_p().amt(value);
	}

	/**
	 * Credit line balance 与信枠残高.<p>
	 *
	 */
	public void cred_bal(float value) {
		cred_bal_p().amt(value);
	}

	/**
	 * Credit line balance 与信枠残高.<p>
	 *
	 */
	public void cred_bal(double value) {
		cred_bal_p().amt(value);
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

	public String wrk_no() {
		return wrk_no_p().wrk_no();
	}

	public void wrk_no(String value) {
		wrk_no_p().wrk_no(value);
	}

	public String wrk_nm() {
		return wrk_no_p().wrk_nm();
	}

	public void wrk_nm(String value) {
		wrk_no_p().wrk_nm(value);
	}

	/**
	 * Total amount (within gross profit) 粗利対象計.<p>
	 *
	 */
	public MCNumber ttl_amt() {
		return ttl_amt_p().amt();
	}

	/**
	 * Total amount (within gross profit) 粗利対象計.<p>
	 *
	 */
	public void ttl_amt(MCNumber value) {
		ttl_amt_p().amt(value);
	}

	/**
	 * Total amount (within gross profit) 粗利対象計.<p>
	 *
	 */
	public void ttl_amt(int value) {
		ttl_amt_p().amt(value);
	}

	/**
	 * Total amount (within gross profit) 粗利対象計.<p>
	 *
	 */
	public void ttl_amt(long value) {
		ttl_amt_p().amt(value);
	}

	/**
	 * Total amount (within gross profit) 粗利対象計.<p>
	 *
	 */
	public void ttl_amt(float value) {
		ttl_amt_p().amt(value);
	}

	/**
	 * Total amount (within gross profit) 粗利対象計.<p>
	 *
	 */
	public void ttl_amt(double value) {
		ttl_amt_p().amt(value);
	}

	/**
	 * Total amount (without gross profit) 粗利対象外計.<p>
	 *
	 */
	public MCNumber ttl_amt_no_cost() {
		return ttl_amt_no_cost_p().amt();
	}

	/**
	 * Total amount (without gross profit) 粗利対象外計.<p>
	 *
	 */
	public void ttl_amt_no_cost(MCNumber value) {
		ttl_amt_no_cost_p().amt(value);
	}

	/**
	 * Total amount (without gross profit) 粗利対象外計.<p>
	 *
	 */
	public void ttl_amt_no_cost(int value) {
		ttl_amt_no_cost_p().amt(value);
	}

	/**
	 * Total amount (without gross profit) 粗利対象外計.<p>
	 *
	 */
	public void ttl_amt_no_cost(long value) {
		ttl_amt_no_cost_p().amt(value);
	}

	/**
	 * Total amount (without gross profit) 粗利対象外計.<p>
	 *
	 */
	public void ttl_amt_no_cost(float value) {
		ttl_amt_no_cost_p().amt(value);
	}

	/**
	 * Total amount (without gross profit) 粗利対象外計.<p>
	 *
	 */
	public void ttl_amt_no_cost(double value) {
		ttl_amt_no_cost_p().amt(value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public MCNumber trd_cur_amt() {
		return trd_cur_amt_p().amt();
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(MCNumber value) {
		trd_cur_amt_p().amt(value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(int value) {
		trd_cur_amt_p().amt(value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(long value) {
		trd_cur_amt_p().amt(value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(float value) {
		trd_cur_amt_p().amt(value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(double value) {
		trd_cur_amt_p().amt(value);
	}

	/**
	 * Tax included amount (Transaction currency) 取引通貨税込金額.<p>
	 *
	 */
	public MCNumber trd_cur_inc_tax_amt() {
		return trd_cur_inc_tax_amt_p().amt();
	}

	/**
	 * Tax included amount (Transaction currency) 取引通貨税込金額.<p>
	 *
	 */
	public void trd_cur_inc_tax_amt(MCNumber value) {
		trd_cur_inc_tax_amt_p().amt(value);
	}

	/**
	 * Tax included amount (Transaction currency) 取引通貨税込金額.<p>
	 *
	 */
	public void trd_cur_inc_tax_amt(int value) {
		trd_cur_inc_tax_amt_p().amt(value);
	}

	/**
	 * Tax included amount (Transaction currency) 取引通貨税込金額.<p>
	 *
	 */
	public void trd_cur_inc_tax_amt(long value) {
		trd_cur_inc_tax_amt_p().amt(value);
	}

	/**
	 * Tax included amount (Transaction currency) 取引通貨税込金額.<p>
	 *
	 */
	public void trd_cur_inc_tax_amt(float value) {
		trd_cur_inc_tax_amt_p().amt(value);
	}

	/**
	 * Tax included amount (Transaction currency) 取引通貨税込金額.<p>
	 *
	 */
	public void trd_cur_inc_tax_amt(double value) {
		trd_cur_inc_tax_amt_p().amt(value);
	}

	/**
	 * Advance received billing amount 前受金請求額.<p>
	 *
	 */
	public MCNumber adv_bill_amt() {
		return adv_bill_amt_p().amt();
	}

	/**
	 * Advance received billing amount 前受金請求額.<p>
	 *
	 */
	public void adv_bill_amt(MCNumber value) {
		adv_bill_amt_p().amt(value);
	}

	/**
	 * Advance received billing amount 前受金請求額.<p>
	 *
	 */
	public void adv_bill_amt(int value) {
		adv_bill_amt_p().amt(value);
	}

	/**
	 * Advance received billing amount 前受金請求額.<p>
	 *
	 */
	public void adv_bill_amt(long value) {
		adv_bill_amt_p().amt(value);
	}

	/**
	 * Advance received billing amount 前受金請求額.<p>
	 *
	 */
	public void adv_bill_amt(float value) {
		adv_bill_amt_p().amt(value);
	}

	/**
	 * Advance received billing amount 前受金請求額.<p>
	 *
	 */
	public void adv_bill_amt(double value) {
		adv_bill_amt_p().amt(value);
	}

	/**
	 * Advance received payment amount 前受金入金額.<p>
	 *
	 */
	public MCNumber adv_rcv_amt() {
		return adv_rcv_amt_p().amt();
	}

	/**
	 * Advance received payment amount 前受金入金額.<p>
	 *
	 */
	public void adv_rcv_amt(MCNumber value) {
		adv_rcv_amt_p().amt(value);
	}

	/**
	 * Advance received payment amount 前受金入金額.<p>
	 *
	 */
	public void adv_rcv_amt(int value) {
		adv_rcv_amt_p().amt(value);
	}

	/**
	 * Advance received payment amount 前受金入金額.<p>
	 *
	 */
	public void adv_rcv_amt(long value) {
		adv_rcv_amt_p().amt(value);
	}

	/**
	 * Advance received payment amount 前受金入金額.<p>
	 *
	 */
	public void adv_rcv_amt(float value) {
		adv_rcv_amt_p().amt(value);
	}

	/**
	 * Advance received payment amount 前受金入金額.<p>
	 *
	 */
	public void adv_rcv_amt(double value) {
		adv_rcv_amt_p().amt(value);
	}

	/**
	 * Desired shipping date 出荷希望日.<p>
	 *
	 */
	public MCDate ship_rqst_dt() {
		return ship_rqst_p().ymd();
	}

	/**
	 * Desired shipping date 出荷希望日.<p>
	 *
	 */
	public void ship_rqst_dt(MCDate value) {
		ship_rqst_p().ymd(value);
	}

	/**
	 * Desired shipping time 出荷希望時刻.<p>
	 *
	 */
	public MCDate ship_rqst_hm() {
		return ship_rqst_p().hm();
	}

	/**
	 * Desired shipping time 出荷希望時刻.<p>
	 *
	 */
	public void ship_rqst_hm(MCDate value) {
		ship_rqst_p().hm(value);
	}

	/**
	 * Desired delivery date 納入希望日.<p>
	 *
	 */
	public MCDate dlv_rqst_dt() {
		return dlv_rqst_p().ymd();
	}

	/**
	 * Desired delivery date 納入希望日.<p>
	 *
	 */
	public void dlv_rqst_dt(MCDate value) {
		dlv_rqst_p().ymd(value);
	}

	/**
	 * Desired delivery time 納入希望時刻.<p>
	 *
	 */
	public MCDate dlv_rqst_hm() {
		return dlv_rqst_p().hm();
	}

	/**
	 * Desired delivery time 納入希望時刻.<p>
	 *
	 */
	public void dlv_rqst_hm(MCDate value) {
		dlv_rqst_p().hm(value);
	}

	/**
	 *  製品.<p>
	 *
	 */
	public String par_itm_cd() {
		return par_itm_p().itm_cd();
	}

	/**
	 *  製品.<p>
	 *
	 */
	public void par_itm_cd(String value) {
		par_itm_p().itm_cd(value);
	}

	/**
	 *  製品枝番１.<p>
	 *
	 */
	public String par_itm_sub1() {
		return par_itm_p().itm_sub1();
	}

	/**
	 *  製品枝番１.<p>
	 *
	 */
	public void par_itm_sub1(String value) {
		par_itm_p().itm_sub1(value);
	}

	/**
	 *  製品枝番２.<p>
	 *
	 */
	public String par_itm_sub2() {
		return par_itm_p().itm_sub2();
	}

	/**
	 *  製品枝番２.<p>
	 *
	 */
	public void par_itm_sub2(String value) {
		par_itm_p().itm_sub2(value);
	}

	/**
	 *  製品枝番３.<p>
	 *
	 */
	public String par_itm_sub3() {
		return par_itm_p().itm_sub3();
	}

	/**
	 *  製品枝番３.<p>
	 *
	 */
	public void par_itm_sub3(String value) {
		par_itm_p().itm_sub3(value);
	}

	/**
	 *  製品名.<p>
	 *
	 */
	public String par_itm_nm() {
		return par_itm_p().itm_nm();
	}

	/**
	 *  製品名.<p>
	 *
	 */
	public void par_itm_nm(String value) {
		par_itm_p().itm_nm(value);
	}

}

