package mcframe.serverMSBB.MSBBL6020;

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
 * ブロック"Slo_BulkImp_Chk01_Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Slo_BulkImp_Chk01_DtlR_MC_A extends MCConstRow {

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public static final String $peg_no = "peg_no";
	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public static final String $data_crud_typ = "data_crud_typ";
	/**
	 * Process result status type 処理結果状況区分.<p>
	 *
	 */
	public static final String $rtn_sts_typ = "rtn_sts_typ";
	/**
	 * Error エラー.<p>
	 *
	 */
	public static final String $err_flg = "err_flg";
	/**
	 * Sales status type 販売状況区分.<p>
	 *
	 */
	public static final String $sls_sts_typ = "sls_sts_typ";
	/**
	 * Sales status type name 販売状況区分名.<p>
	 *
	 */
	public static final String $sls_sts_typ_nm = "sls_sts_typ_nm";
	/**
	 * Shipping progress status type 出荷進捗状況区分.<p>
	 *
	 */
	public static final String $pr_sts_typ = "pr_sts_typ";
	/**
	 * Shipping progress status type name 出荷進捗状況区分名.<p>
	 *
	 */
	public static final String $pr_sts_typ_nm = "pr_sts_typ_nm";
	/**
	 * Allocation status type 引当状況区分.<p>
	 *
	 */
	public static final String $alloc_sts_typ = "alloc_sts_typ";
	/**
	 * Allocation status type name 引当状況区分名.<p>
	 *
	 */
	public static final String $alloc_sts_typ_nm = "alloc_sts_typ_nm";
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
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public static final String $slo_no = "slo_no";
	/**
	 * Rev. number 改訂番号.<p>
	 *
	 */
	public static final String $slo_rev = "slo_rev";
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
	 * Sales order date 受注日.<p>
	 *
	 */
	public static final String $slo_dt = "slo_dt";
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
	 * For quotation approval 見積承認対象.<p>
	 *
	 */
	public static final String $qtn_aprv_flg = "qtn_aprv_flg";
	/**
	 * Quotation approval No. 見積承認ＮＯ.<p>
	 *
	 */
	public static final String $qtn_aprv_no = "qtn_aprv_no";
	/**
	 * Updatable 更新可能.<p>
	 *
	 */
	public static final String $can_upd_flg = "can_upd_flg";
	/**
	 * Cancellable 取消可能.<p>
	 *
	 */
	public static final String $can_del_flg = "can_del_flg";
	/**
	 * Sales order details No. 受注明細ＮＯ.<p>
	 *
	 */
	public static final String $slo_d_no = "slo_d_no";
	/**
	 * Rev. number (Order details) 改訂番号（受注明細）.<p>
	 *
	 */
	public static final String $slo_d_rev = "slo_d_rev";
	/**
	 * Simulation allocation schedule type シミュレーション引当予定区分.<p>
	 *
	 */
	public static final String $sim_alloc_pln_typ = "sim_alloc_pln_typ";
	/**
	 * Simulation allocation schedule type name シミュレーション引当予定区分名.<p>
	 *
	 */
	public static final String $sim_alloc_pln_typ_nm = "sim_alloc_pln_typ_nm";
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
	 * Customer invoice transaction 得意先インボイス取引.<p>
	 *
	 */
	public static final String $cst_iv_flg = "cst_iv_flg";
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
	 * Set exchange rate 為替レート指定.<p>
	 *
	 */
	public static final String $xrate_inpt_flg = "xrate_inpt_flg";
	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public static final String $xrate = "xrate";
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
	 * Unit price (Base currency) 基準通貨単価.<p>
	 *
	 */
	public static final String $base_cur_upri = "base_cur_upri";
	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public static final String $base_cur_amt = "base_cur_amt";
	/**
	 * Tax included amount (Base currency) 基準通貨税込金額.<p>
	 *
	 */
	public static final String $base_cur_inc_tax_amt = "base_cur_inc_tax_amt";
	/**
	 * Tax amount (Base currency) 基準通貨税額.<p>
	 *
	 */
	public static final String $base_cur_tax_amt = "base_cur_tax_amt";
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
	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public static final String $ptax_xrate = "ptax_xrate";
	/**
	 * Unit price (Tax currency) 納税通貨単価.<p>
	 *
	 */
	public static final String $ptax_cur_upri = "ptax_cur_upri";
	/**
	 * Amount (Tax currency) 納税通貨金額.<p>
	 *
	 */
	public static final String $ptax_cur_amt = "ptax_cur_amt";
	/**
	 * Tax included amount (Tax currency) 納税通貨税込金額.<p>
	 *
	 */
	public static final String $ptax_cur_inc_tax_amt = "ptax_cur_inc_tax_amt";
	/**
	 * Tax amount (Tax currency) 納税通貨税額.<p>
	 *
	 */
	public static final String $ptax_cur_tax_amt = "ptax_cur_tax_amt";
	/**
	 * Gross profit rate 粗利率.<p>
	 *
	 */
	public static final String $prof_rate = "prof_rate";
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
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public static final String $iv_no = "iv_no";
	/**
	 * Auto-numbering 自動発番.<p>
	 *
	 */
	public static final String $iv_num_flg = "iv_num_flg";
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
	/**
	 * Advance received billing amount 前受金請求額.<p>
	 *
	 */
	public static final String $adv_bill_amt = "adv_bill_amt";
	/**
	 * Advance received payment amount 前受金入金額.<p>
	 *
	 */
	public static final String $adv_rcv_amt = "adv_rcv_amt";
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
	 * EDI ＥＤＩ.<p>
	 *
	 */
	public static final String $edi_flg = "edi_flg";
	/**
	 * Country cd. 国ＣＤ.<p>
	 *
	 */
	public static final String $cntry_cd = "cntry_cd";
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
	/**
	 * Rounding type (Sales amount) 売上金額端数処理区分.<p>
	 *
	 */
	public static final String $sls_amt_rnd_typ = "sls_amt_rnd_typ";
	/**
	 * Sales tax rounding type 売上税額端数処理区分.<p>
	 *
	 */
	public static final String $sls_tax_rnd_typ = "sls_tax_rnd_typ";
	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public static final String $amt_dec_place = "amt_dec_place";
	/**
	 * Caller batch process 呼出元バッチ処理.<p>
	 *
	 */
	public static final String $is_src_batch_flg = "is_src_batch_flg";
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
	 * Cancel 取消.<p>
	 *
	 */
	public static final String $can_flg = "can_flg";
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
	 * Header group No. ヘッダグループＮＯ.<p>
	 *
	 */
	public static final String $hdr_grp_no = "hdr_grp_no";
	/**
	 * Header error ヘッダエラー.<p>
	 *
	 */
	public static final String $hdr_err_flg = "hdr_err_flg";
	/**
	 * Cancel remaining 打切.<p>
	 *
	 */
	public static final String $abort_flg = "abort_flg";
	/**
	 * Customer item cd. 得意先品目ＣＤ.<p>
	 *
	 */
	public static final String $cst_itm_cd = "cst_itm_cd";
	/**
	 * Customer item name 得意先品名.<p>
	 *
	 */
	public static final String $cst_itm_nm = "cst_itm_nm";
	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public static final String $itm_cd = "itm_cd";
	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public static final String $itm_sub1 = "itm_sub1";
	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public static final String $itm_sub2 = "itm_sub2";
	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public static final String $itm_sub3 = "itm_sub3";
	/**
	 * Item name 品名.<p>
	 *
	 */
	public static final String $itm_nm = "itm_nm";
	/**
	 * Configuration/specification management type 構成・仕様管理区分.<p>
	 *
	 */
	public static final String $comp_spec_typ = "comp_spec_typ";
	/**
	 * Configuration/specification management type name 構成・仕様管理区分名.<p>
	 *
	 */
	public static final String $comp_spec_typ_nm = "comp_spec_typ_nm";
	/**
	 * Configuration rev. number 構成改訂番号.<p>
	 *
	 */
	public static final String $itm_comp_rev_no = "itm_comp_rev_no";
	/**
	 * Item name for I/V Ｉ／Ｖ表記品名.<p>
	 *
	 */
	public static final String $iv_itm_nm = "iv_itm_nm";
	/**
	 * Place of origin cd. 原産地ＣＤ.<p>
	 *
	 */
	public static final String $cntry_org_cd = "cntry_org_cd";
	/**
	 * Place of origin name 原産地名.<p>
	 *
	 */
	public static final String $cntry_org_nm = "cntry_org_nm";
	/**
	 * Asset management type 資産管理区分.<p>
	 *
	 */
	public static final String $asset_mng_typ = "asset_mng_typ";
	/**
	 * Asset management type name 資産管理区分名.<p>
	 *
	 */
	public static final String $asset_mng_typ_nm = "asset_mng_typ_nm";
	/**
	 * Consignment 貸出.<p>
	 *
	 */
	public static final String $vmi_flg = "vmi_flg";
	/**
	 * Discount item 値引品目.<p>
	 *
	 */
	public static final String $dscnt_itm_flg = "dscnt_itm_flg";
	/**
	 * Allocation extra days 引当余裕日数.<p>
	 *
	 */
	public static final String $alloc_margin_days = "alloc_margin_days";
	/**
	 * Inventory management type 在庫管理区分.<p>
	 *
	 */
	public static final String $stk_mng_typ = "stk_mng_typ";
	/**
	 * Miscellaneous item 諸口品.<p>
	 *
	 */
	public static final String $sundry_itm_flg = "sundry_itm_flg";
	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public static final String $trd_unit_cd = "trd_unit_cd";
	/**
	 * Transaction unit name 取引単位名.<p>
	 *
	 */
	public static final String $trd_unit_nm = "trd_unit_nm";
	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public static final String $trd_unit_qty = "trd_unit_qty";
	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public static final String $trd_unit_dec_place = "trd_unit_dec_place";
	/**
	 * Transaction unit conversion base qty. 取引単位分母数量.<p>
	 *
	 */
	public static final String $trd_unit_conv_base_qty = "trd_unit_conv_base_qty";
	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public static final String $trd_unit_conv_qty = "trd_unit_conv_qty";
	/**
	 * Not to reacquire unit price 単価再取得対象外.<p>
	 *
	 */
	public static final String $upri_not_tgt_flg = "upri_not_tgt_flg";
	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public static final String $trd_cur_upri = "trd_cur_upri";
	/**
	 * Temporary unit price 仮単価.<p>
	 *
	 */
	public static final String $interim_flg = "interim_flg";
	/**
	 * Amount 金額.<p>
	 *
	 */
	public static final String $trd_cur_amt = "trd_cur_amt";
	/**
	 * Tax included amount 税込金額.<p>
	 *
	 */
	public static final String $trd_cur_inc_tax_amt = "trd_cur_inc_tax_amt";
	/**
	 * Unit cost 原価単価.<p>
	 *
	 */
	public static final String $cost_upri = "cost_upri";
	/**
	 * Total cost 原価金額.<p>
	 *
	 */
	public static final String $cost_amt = "cost_amt";
	/**
	 * Discount amount (Transaction currency) 取引通貨値引額.<p>
	 *
	 */
	public static final String $trd_cur_dscnt_amt = "trd_cur_dscnt_amt";
	/**
	 * Discount reason cd. 値引理由ＣＤ.<p>
	 *
	 */
	public static final String $dscnt_rsn_cd = "dscnt_rsn_cd";
	/**
	 * Discount reason name 値引理由名.<p>
	 *
	 */
	public static final String $dscnt_rsn_nm = "dscnt_rsn_nm";
	/**
	 * I/V unit price Ｉ／Ｖ単価.<p>
	 *
	 */
	public static final String $iv_upri = "iv_upri";
	/**
	 * I/V amount Ｉ／Ｖ金額.<p>
	 *
	 */
	public static final String $iv_amt = "iv_amt";
	/**
	 * Set tax 税指定.<p>
	 *
	 */
	public static final String $tax_fix_flg = "tax_fix_flg";
	/**
	 * Tax cd. 税ＣＤ.<p>
	 *
	 */
	public static final String $tax_cd = "tax_cd";
	/**
	 * Tax name 税名.<p>
	 *
	 */
	public static final String $tax_nm = "tax_nm";
	/**
	 * Tax rate 税率.<p>
	 *
	 */
	public static final String $tax_rate = "tax_rate";
	/**
	 * Tax inclusive 内税.<p>
	 *
	 */
	public static final String $inc_tax_flg = "inc_tax_flg";
	/**
	 * Tax amount 税額.<p>
	 *
	 */
	public static final String $trd_cur_tax_amt = "trd_cur_tax_amt";
	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public static final String $wtax_rate = "wtax_rate";
	/**
	 * Withholding tax 源泉税額.<p>
	 *
	 */
	public static final String $wtax_amt = "wtax_amt";
	/**
	 * Billing carry-over count 請求繰越回数.<p>
	 *
	 */
	public static final String $bill_crryovr_times = "bill_crryovr_times";
	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public static final String $gd_cd = "gd_cd";
	/**
	 * Grading name 格付名.<p>
	 *
	 */
	public static final String $gd_nm = "gd_nm";
	/**
	 * Numbering SEIBAN No. 手配ＮＯ発番.<p>
	 *
	 */
	public static final String $sno_num_flg = "sno_num_flg";
	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public static final String $sno1 = "sno1";
	/**
	 * Allow without SEIBAN No. 1 手配ＮＯ１無し可.<p>
	 *
	 */
	public static final String $sno1_null_flg = "sno1_null_flg";
	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public static final String $sno2 = "sno2";
	/**
	 * Allow without SEIBAN No. 2 手配ＮＯ２無し可.<p>
	 *
	 */
	public static final String $sno2_null_flg = "sno2_null_flg";
	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public static final String $sno3 = "sno3";
	/**
	 * Allow without SEIBAN No. 3 手配ＮＯ３無し可.<p>
	 *
	 */
	public static final String $sno3_null_flg = "sno3_null_flg";
	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public static final String $sno4 = "sno4";
	/**
	 * Allow without SEIBAN No. 4 手配ＮＯ４無し可.<p>
	 *
	 */
	public static final String $sno4_null_flg = "sno4_null_flg";
	/**
	 * SEIBAN No. 1 management type 手配ＮＯ１管理区分.<p>
	 *
	 */
	public static final String $sno1_mng_typ = "sno1_mng_typ";
	/**
	 * SEIBAN No. 2 management type 手配ＮＯ２管理区分.<p>
	 *
	 */
	public static final String $sno2_mng_typ = "sno2_mng_typ";
	/**
	 * SEIBAN No. 3 management type 手配ＮＯ３管理区分.<p>
	 *
	 */
	public static final String $sno3_mng_typ = "sno3_mng_typ";
	/**
	 * SEIBAN No. 4 management type 手配ＮＯ４管理区分.<p>
	 *
	 */
	public static final String $sno4_mng_typ = "sno4_mng_typ";
	/**
	 * SEIBAN No. 1 numbering type 手配ＮＯ１発番区分.<p>
	 *
	 */
	public static final String $sno1_num_typ = "sno1_num_typ";
	/**
	 * SEIBAN No. 2 numbering type 手配ＮＯ２発番区分.<p>
	 *
	 */
	public static final String $sno2_num_typ = "sno2_num_typ";
	/**
	 * SEIBAN No. 3 numbering type 手配ＮＯ３発番区分.<p>
	 *
	 */
	public static final String $sno3_num_typ = "sno3_num_typ";
	/**
	 * SEIBAN No. 4 numbering type 手配ＮＯ４発番区分.<p>
	 *
	 */
	public static final String $sno4_num_typ = "sno4_num_typ";
	/**
	 * SEIBAN No. 1 numbering pattern cd. 手配ＮＯ１発番パタンＣＤ.<p>
	 *
	 */
	public static final String $sno1_ptn_cd = "sno1_ptn_cd";
	/**
	 * SEIBAN No. 2 numbering pattern cd. 手配ＮＯ２発番パタンＣＤ.<p>
	 *
	 */
	public static final String $sno2_ptn_cd = "sno2_ptn_cd";
	/**
	 * SEIBAN No. 3 numbering pattern cd. 手配ＮＯ３発番パタンＣＤ.<p>
	 *
	 */
	public static final String $sno3_ptn_cd = "sno3_ptn_cd";
	/**
	 * SEIBAN No. 4 numbering pattern cd. 手配ＮＯ４発番パタンＣＤ.<p>
	 *
	 */
	public static final String $sno4_ptn_cd = "sno4_ptn_cd";
	/**
	 * Sales order SEIBAN No. 1 required 受注手配ＮＯ１必須.<p>
	 *
	 */
	public static final String $slo_sno1_flg = "slo_sno1_flg";
	/**
	 * Sales order SEIBAN No. 2 required 受注手配ＮＯ２必須.<p>
	 *
	 */
	public static final String $slo_sno2_flg = "slo_sno2_flg";
	/**
	 * Sales order SEIBAN No. 3 required 受注手配ＮＯ３必須.<p>
	 *
	 */
	public static final String $slo_sno3_flg = "slo_sno3_flg";
	/**
	 * Sales order SEIBAN No. 4 required 受注手配ＮＯ４必須.<p>
	 *
	 */
	public static final String $slo_sno4_flg = "slo_sno4_flg";
	/**
	 * Assortment group No. 品揃グループＮＯ.<p>
	 *
	 */
	public static final String $set_itm_grp_no = "set_itm_grp_no";
	/**
	 * Desired shipping date and time 出荷希望日時.<p>
	 *
	 */
	public static final String $ship_rqst_tm = "ship_rqst_tm";
	/**
	 * Desired shipping date 出荷希望日.<p>
	 *
	 */
	public static final String $ship_rqst_dt = "ship_rqst_dt";
	/**
	 * Desired shipping time 出荷希望時刻.<p>
	 *
	 */
	public static final String $ship_rqst_hm = "ship_rqst_hm";
	/**
	 * Desired delivery date and time 納入希望日時.<p>
	 *
	 */
	public static final String $dlv_rqst_tm = "dlv_rqst_tm";
	/**
	 * Desired delivery date 納入希望日.<p>
	 *
	 */
	public static final String $dlv_rqst_dt = "dlv_rqst_dt";
	/**
	 * Desired delivery time 納入希望時刻.<p>
	 *
	 */
	public static final String $dlv_rqst_hm = "dlv_rqst_hm";
	/**
	 * Delivery request date 納品依頼日.<p>
	 *
	 */
	public static final String $pd_inst_dlv_dt = "pd_inst_dlv_dt";
	/**
	 * Delivery request time 納品依頼時刻.<p>
	 *
	 */
	public static final String $pd_inst_dlv_hm = "pd_inst_dlv_hm";
	/**
	 * Scheduled acceptance date 検収予定日.<p>
	 *
	 */
	public static final String $accpt_schd_dt = "accpt_schd_dt";
	/**
	 * Scheduled sales date 売上予定日.<p>
	 *
	 */
	public static final String $sls_schd_dt = "sls_schd_dt";
	/**
	 * Split shipping schedule 出荷予定分割.<p>
	 *
	 */
	public static final String $ship_schd_split_flg = "ship_schd_split_flg";
	/**
	 * Shipping available 出荷可能.<p>
	 *
	 */
	public static final String $ship_abl_flg = "ship_abl_flg";
	/**
	 * Scheduled shipping date and time 出荷予定日時.<p>
	 *
	 */
	public static final String $ship_schd_tm = "ship_schd_tm";
	/**
	 * Scheduled shipping date 出荷予定日.<p>
	 *
	 */
	public static final String $ship_schd_dt = "ship_schd_dt";
	/**
	 * Shipping schedule time 出荷予定時刻.<p>
	 *
	 */
	public static final String $ship_schd_hm = "ship_schd_hm";
	/**
	 * Scheduled delivery date and time 納品予定日時.<p>
	 *
	 */
	public static final String $dlv_schd_tm = "dlv_schd_tm";
	/**
	 * Scheduled delivery date 納品予定日.<p>
	 *
	 */
	public static final String $dlv_schd_dt = "dlv_schd_dt";
	/**
	 * Schedule delivery time 納品予定時刻.<p>
	 *
	 */
	public static final String $dlv_schd_hm = "dlv_schd_hm";
	/**
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public static final String $dlv_cd = "dlv_cd";
	/**
	 * Miscellaneous delivery destination 納品先諸口.<p>
	 *
	 */
	public static final String $dlv_sundry_flg = "dlv_sundry_flg";
	/**
	 * Delivery destination name 納品先名.<p>
	 *
	 */
	public static final String $dlv_nm = "dlv_nm";
	/**
	 * Delivery destination dept. 納品先部署.<p>
	 *
	 */
	public static final String $dlv_cntct_dpt = "dlv_cntct_dpt";
	/**
	 * Delivery destination PIC 納品先担当者.<p>
	 *
	 */
	public static final String $dlv_cntct_psn = "dlv_cntct_psn";
	/**
	 * Zip code (Delivery destination) 納品先郵便番号.<p>
	 *
	 */
	public static final String $dlv_zip_cd = "dlv_zip_cd";
	/**
	 * Address 1 (Delivery destination) 納品先住所１.<p>
	 *
	 */
	public static final String $dlv_addr1 = "dlv_addr1";
	/**
	 * Address 2 (Delivery destination) 納品先住所２.<p>
	 *
	 */
	public static final String $dlv_addr2 = "dlv_addr2";
	/**
	 * Address 3 (Delivery destination) 納品先住所３.<p>
	 *
	 */
	public static final String $dlv_addr3 = "dlv_addr3";
	/**
	 * Address 4 (Delivery destination) 納品先住所４.<p>
	 *
	 */
	public static final String $dlv_addr4 = "dlv_addr4";
	/**
	 * TEL (Delivery destination) 納品先ＴＥＬ.<p>
	 *
	 */
	public static final String $dlv_tel = "dlv_tel";
	/**
	 * FAX (Delivery destination) 納品先ＦＡＸ.<p>
	 *
	 */
	public static final String $dlv_fax = "dlv_fax";
	/**
	 * Delivery destination country cd. 納品先国ＣＤ.<p>
	 *
	 */
	public static final String $dlv_cntry_cd = "dlv_cntry_cd";
	/**
	 * Delivery destination country name 納品先国名.<p>
	 *
	 */
	public static final String $dlv_cntry_nm = "dlv_cntry_nm";
	/**
	 * Delivery destination distribution group cd. 納品先物流グループＣＤ.<p>
	 *
	 */
	public static final String $dlv_lg_grp_cd = "dlv_lg_grp_cd";
	/**
	 * Delivery destination distribution group name 納品先物流グループ名.<p>
	 *
	 */
	public static final String $dlv_lg_grp_nm = "dlv_lg_grp_nm";
	/**
	 * Print price type 価格印字区分.<p>
	 *
	 */
	public static final String $pri_prnt_typ = "pri_prnt_typ";
	/**
	 * Print price 価格印字.<p>
	 *
	 */
	public static final String $pri_prnt_flg = "pri_prnt_flg";
	/**
	 * Distribution channel cd. 1 仕向先ＣＤ１.<p>
	 *
	 */
	public static final String $dest_cd1 = "dest_cd1";
	/**
	 * Distribution channel name 1 仕向先１名.<p>
	 *
	 */
	public static final String $dest_nm1 = "dest_nm1";
	/**
	 * Distribution channel cd. 2 仕向先ＣＤ２.<p>
	 *
	 */
	public static final String $dest_cd2 = "dest_cd2";
	/**
	 * Distribution channel name 2 仕向先２名.<p>
	 *
	 */
	public static final String $dest_nm2 = "dest_nm2";
	/**
	 * Distribution channel cd. 3 仕向先ＣＤ３.<p>
	 *
	 */
	public static final String $dest_cd3 = "dest_cd3";
	/**
	 * Distribution channel name 3 仕向先３名.<p>
	 *
	 */
	public static final String $dest_nm3 = "dest_nm3";
	/**
	 * Receiving point cd. 配送先ＣＤ.<p>
	 *
	 */
	public static final String $tdlv_cd = "tdlv_cd";
	/**
	 * Receiving point required 配送先必須.<p>
	 *
	 */
	public static final String $tdlv_req_flg = "tdlv_req_flg";
	/**
	 * Receiving point name 配送先名.<p>
	 *
	 */
	public static final String $tdlv_nm = "tdlv_nm";
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
	 * Miscellaneous receiving point 配送先諸口.<p>
	 *
	 */
	public static final String $tdlv_sundry_flg = "tdlv_sundry_flg";
	/**
	 * Receiving point dept. 配送先部署.<p>
	 *
	 */
	public static final String $tdlv_cntct_dpt = "tdlv_cntct_dpt";
	/**
	 * Receiving point PIC 配送先担当者.<p>
	 *
	 */
	public static final String $tdlv_cntct_psn = "tdlv_cntct_psn";
	/**
	 * Receiving point zip code 配送先郵便番号.<p>
	 *
	 */
	public static final String $tdlv_zip_cd = "tdlv_zip_cd";
	/**
	 * Receiving point address 1 配送先住所１.<p>
	 *
	 */
	public static final String $tdlv_addr1 = "tdlv_addr1";
	/**
	 * Receiving point address 2 配送先住所２.<p>
	 *
	 */
	public static final String $tdlv_addr2 = "tdlv_addr2";
	/**
	 * Receiving point address 3 配送先住所３.<p>
	 *
	 */
	public static final String $tdlv_addr3 = "tdlv_addr3";
	/**
	 * Receiving point address 4 配送先住所４.<p>
	 *
	 */
	public static final String $tdlv_addr4 = "tdlv_addr4";
	/**
	 * Receiving point TEL 配送先ＴＥＬ.<p>
	 *
	 */
	public static final String $tdlv_tel = "tdlv_tel";
	/**
	 * Receiving point FAX 配送先ＦＡＸ.<p>
	 *
	 */
	public static final String $tdlv_fax = "tdlv_fax";
	/**
	 * Receiving point country cd. 配送先国ＣＤ.<p>
	 *
	 */
	public static final String $tdlv_cntry_cd = "tdlv_cntry_cd";
	/**
	 * Receiving point country name 配送先国名.<p>
	 *
	 */
	public static final String $tdlv_cntry_nm = "tdlv_cntry_nm";
	/**
	 * Receiving point distribution group cd. 配送先物流グループＣＤ.<p>
	 *
	 */
	public static final String $tdlv_lg_grp_cd = "tdlv_lg_grp_cd";
	/**
	 * Receiving point distribution group name 配送先物流グループ名.<p>
	 *
	 */
	public static final String $tdlv_lg_grp_nm = "tdlv_lg_grp_nm";
	/**
	 * Arrival day of week 着曜日.<p>
	 *
	 */
	public static final String $dlv_day_week_typ = "dlv_day_week_typ";
	/**
	 * Arrival day of week 着曜日.<p>
	 *
	 */
	public static final String $dlv_day_week_typ_nm = "dlv_day_week_typ_nm";
	/**
	 * Sales keeping customer inventory 預り売上.<p>
	 *
	 */
	public static final String $sls_cststk_flg = "sls_cststk_flg";
	/**
	 * Procurement type 手配区分.<p>
	 *
	 */
	public static final String $proc_typ = "proc_typ";
	/**
	 * Procurement type name 手配区分名.<p>
	 *
	 */
	public static final String $proc_typ_nm = "proc_typ_nm";
	/**
	 * Order type 指図区分.<p>
	 *
	 */
	public static final String $ship_inst_typ = "ship_inst_typ";
	/**
	 * Order type name 指図区分名.<p>
	 *
	 */
	public static final String $ship_inst_typ_nm = "ship_inst_typ_nm";
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
	 * Allocation range type 引当範囲区分.<p>
	 *
	 */
	public static final String $alloc_scope_typ = "alloc_scope_typ";
	/**
	 * Allocation range type name 引当範囲区分名.<p>
	 *
	 */
	public static final String $alloc_scope_typ_nm = "alloc_scope_typ_nm";
	/**
	 * Prohibit mixed distribution G 物流Ｇ混在不可.<p>
	 *
	 */
	public static final String $not_lg_mix_flg = "not_lg_mix_flg";
	/**
	 * Allocation type 引当区分.<p>
	 *
	 */
	public static final String $alloc_typ = "alloc_typ";
	/**
	 * Allocation type name 引当区分名.<p>
	 *
	 */
	public static final String $alloc_typ_nm = "alloc_typ_nm";
	/**
	 * Requested location cd. 依頼先場所ＣＤ.<p>
	 *
	 */
	public static final String $rqst_to_loc_cd = "rqst_to_loc_cd";
	/**
	 * Location name (Requested) 依頼先場所名.<p>
	 *
	 */
	public static final String $rqst_to_loc_nm = "rqst_to_loc_nm";
	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public static final String $sppl_cd = "sppl_cd";
	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public static final String $sppl_nm = "sppl_nm";
	/**
	 * Maker cd. メーカＣＤ.<p>
	 *
	 */
	public static final String $maker_cd = "maker_cd";
	/**
	 * Maker name メーカ名.<p>
	 *
	 */
	public static final String $maker_nm = "maker_nm";
	/**
	 * Request date 依頼日.<p>
	 *
	 */
	public static final String $rqst_dt = "rqst_dt";
	/**
	 * Request desired delivery date 依頼納入希望日.<p>
	 *
	 */
	public static final String $rqst_dlv_rqst_dt = "rqst_dlv_rqst_dt";
	/**
	 * Request replied date 依頼回答日.<p>
	 *
	 */
	public static final String $rqst_prms_dt = "rqst_prms_dt";
	/**
	 * Request replied delivery date 依頼回答納入日.<p>
	 *
	 */
	public static final String $rqst_prms_dlv_dt = "rqst_prms_dlv_dt";
	/**
	 * Requested contact remarks 依頼先連絡備考.<p>
	 *
	 */
	public static final String $wg_rqst_cnt_rmrks = "wg_rqst_cnt_rmrks";
	/**
	 * Requested WG cd. 依頼先ワーキンググループＣＤ.<p>
	 *
	 */
	public static final String $rqst_to_wg_cd = "rqst_to_wg_cd";
	/**
	 * Gross allocation location group cd. 総量引当場所グループＣＤ.<p>
	 *
	 */
	public static final String $alloc_grp_cd = "alloc_grp_cd";
	/**
	 * Gross allocation location group name 総量引当場所グループ名.<p>
	 *
	 */
	public static final String $alloc_grp_nm = "alloc_grp_nm";
	/**
	 * Shipping distribution group cd. 出荷物流グループＣＤ.<p>
	 *
	 */
	public static final String $ship_lg_grp_cd = "ship_lg_grp_cd";
	/**
	 * Shipping distribution group name 出荷物流グループ名.<p>
	 *
	 */
	public static final String $ship_lg_grp_nm = "ship_lg_grp_nm";
	/**
	 * Normal shipping location cd. 通常出荷場所ＣＤ.<p>
	 *
	 */
	public static final String $def_loc_cd = "def_loc_cd";
	/**
	 * Normal shipping location name 通常出荷場所名.<p>
	 *
	 */
	public static final String $def_loc_nm = "def_loc_nm";
	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public static final String $loc_cd = "loc_cd";
	/**
	 * Location name 場所名.<p>
	 *
	 */
	public static final String $loc_nm = "loc_nm";
	/**
	 * For rack/line 棚・ライン対象.<p>
	 *
	 */
	public static final String $str_ln_tgt_flg = "str_ln_tgt_flg";
	/**
	 * Rack/Line cd. 棚・ラインＣＤ.<p>
	 *
	 */
	public static final String $str_ln_cd = "str_ln_cd";
	/**
	 * Rack/Line name 棚・ライン名.<p>
	 *
	 */
	public static final String $str_ln_nm = "str_ln_nm";
	/**
	 * Without rack/line 棚・ライン無.<p>
	 *
	 */
	public static final String $str_ln_cd_none_flg = "str_ln_cd_none_flg";
	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public static final String $lot_no = "lot_no";
	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public static final String $sublot_no = "sublot_no";
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
	/**
	 * For version control 版管理対象.<p>
	 *
	 */
	public static final String $ver_flg = "ver_flg";
	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public static final String $ver_no = "ver_no";
	/**
	 * Shipping conditions cd. 出荷条件ＣＤ.<p>
	 *
	 */
	public static final String $ship_term_cd = "ship_term_cd";
	/**
	 * Shipping conditions name 出荷条件名.<p>
	 *
	 */
	public static final String $ship_term_nm = "ship_term_nm";
	/**
	 * Pending shipping 出荷留め.<p>
	 *
	 */
	public static final String $ship_block_flg = "ship_block_flg";
	/**
	 * Shipping notification remarks 出荷連絡備考.<p>
	 *
	 */
	public static final String $ship_cnt_rmrks = "ship_cnt_rmrks";
	/**
	 * Customer order details No. 得意先注文明細ＮＯ.<p>
	 *
	 */
	public static final String $cst_po_d_no = "cst_po_d_no";
	/**
	 * Customer order details remarks 得意先注文明細備考.<p>
	 *
	 */
	public static final String $cst_po_d_rmrks = "cst_po_d_rmrks";
	/**
	 * Sales reason cd. 売上理由ＣＤ.<p>
	 *
	 */
	public static final String $sls_rsn_cd = "sls_rsn_cd";
	/**
	 * Sales reason name 売上理由名.<p>
	 *
	 */
	public static final String $sls_rsn_nm = "sls_rsn_nm";
	/**
	 * Sales other accounting 販売他勘定.<p>
	 *
	 */
	public static final String $sls_acxfr_flg = "sls_acxfr_flg";
	/**
	 * Charged dept. cd. 負担部門ＣＤ.<p>
	 *
	 */
	public static final String $bd_dpt_cd = "bd_dpt_cd";
	/**
	 * Charged dept. name 負担部門名.<p>
	 *
	 */
	public static final String $bd_dpt_nm = "bd_dpt_nm";
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
	 * GR/GI progress management No. 受払進捗管理ＮＯ.<p>
	 *
	 */
	public static final String $io_schd_pr_no = "io_schd_pr_no";
	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public static final String $trd_d_rmrks = "trd_d_rmrks";
	/**
	 * Internal details remarks 内部明細備考.<p>
	 *
	 */
	public static final String $slo_d_intr_rmrks = "slo_d_intr_rmrks";
	/**
	 * Details spare 1 明細予備１.<p>
	 *
	 */
	public static final String $slo_d_sub_char1 = "slo_d_sub_char1";
	/**
	 * Details spare 2 明細予備２.<p>
	 *
	 */
	public static final String $slo_d_sub_char2 = "slo_d_sub_char2";
	/**
	 * Details spare 3 明細予備３.<p>
	 *
	 */
	public static final String $slo_d_sub_char3 = "slo_d_sub_char3";
	/**
	 * Quotation details No. 見積明細ＮＯ.<p>
	 *
	 */
	public static final String $qtn_d_no = "qtn_d_no";
	/**
	 * Not auto-calculate 自動計算しない.<p>
	 *
	 */
	public static final String $not_dt_calc_flg = "not_dt_calc_flg";
	/**
	 * EDI details spare CHAR column 1 ＥＤＩ明細予備ＣＨＡＲ項目１.<p>
	 *
	 */
	public static final String $edi_sub_d_char1 = "edi_sub_d_char1";
	/**
	 * EDI details spare CHAR column 2 ＥＤＩ明細予備ＣＨＡＲ項目２.<p>
	 *
	 */
	public static final String $edi_sub_d_char2 = "edi_sub_d_char2";
	/**
	 * EDI details spare CHAR column 3 ＥＤＩ明細予備ＣＨＡＲ項目３.<p>
	 *
	 */
	public static final String $edi_sub_d_char3 = "edi_sub_d_char3";
	/**
	 * EDI details spare CHAR column 4 ＥＤＩ明細予備ＣＨＡＲ項目４.<p>
	 *
	 */
	public static final String $edi_sub_d_char4 = "edi_sub_d_char4";
	/**
	 * EDI details spare CHAR column 5 ＥＤＩ明細予備ＣＨＡＲ項目５.<p>
	 *
	 */
	public static final String $edi_sub_d_char5 = "edi_sub_d_char5";
	/**
	 * EDI details spare NUM column 1 ＥＤＩ明細予備ＮＵＭ項目１.<p>
	 *
	 */
	public static final String $edi_sub_d_num1 = "edi_sub_d_num1";
	/**
	 * EDI details spare DATE column 1 ＥＤＩ明細予備ＤＡＴＥ項目１.<p>
	 *
	 */
	public static final String $edi_sub_d_dt1 = "edi_sub_d_dt1";
	/**
	 * Cancel details 明細取消.<p>
	 *
	 */
	public static final String $slo_d_can_flg = "slo_d_can_flg";
	/**
	 * Details cancel reason cd. 明細取消理由ＣＤ.<p>
	 *
	 */
	public static final String $slo_d_can_rsn_cd = "slo_d_can_rsn_cd";
	/**
	 * Details cancel reason name 明細取消理由名.<p>
	 *
	 */
	public static final String $slo_d_can_rsn_nm = "slo_d_can_rsn_nm";
	/**
	 * Details cancel remarks 明細取消備考.<p>
	 *
	 */
	public static final String $slo_d_can_rmkrs = "slo_d_can_rmkrs";
	/**
	 * Shipping progress No. 出荷進捗ＮＯ.<p>
	 *
	 */
	public static final String $ship_pr_no = "ship_pr_no";
	/**
	 * Item shipping group cd. 品目出荷グループＣＤ.<p>
	 *
	 */
	public static final String $itm_ship_grp_cd = "itm_ship_grp_cd";
	/**
	 * Shipping progress update counter 出荷進捗更新カウンタ.<p>
	 *
	 */
	public static final String $ship_pr_upd_cntr = "ship_pr_upd_cntr";
	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public static final String $hdr_peg_no = "hdr_peg_no";
	/**
	 * Error エラー.<p>
	 *
	 */
	public static final String $dtl_err_flg = "dtl_err_flg";
	/**
	 * Not for update counter check 更新カウンタチェック対象外.<p>
	 *
	 */
	public static final String $upd_cntr_not_chk_flg = "upd_cntr_not_chk_flg";
	/**
	 * Shipping completed 出荷完了.<p>
	 *
	 */
	public static final String $ship_cmpl_flg = "ship_cmpl_flg";
	/**
	 * Sales completed 売上完了.<p>
	 *
	 */
	public static final String $sls_cmpl_flg = "sls_cmpl_flg";
	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public static final String $base_unit_cd = "base_unit_cd";
	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public static final String $base_unit_nm = "base_unit_nm";
	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public static final String $base_unit_qty = "base_unit_qty";
	/**
	 * Shipping progress base unit qty. 出荷進捗基準単位数量.<p>
	 *
	 */
	public static final String $ship_pr_base_unit_qty = "ship_pr_base_unit_qty";
	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public static final String $base_unit_dec_place = "base_unit_dec_place";
	/**
	 * Base unit rounding type 基準単位端数処理区分.<p>
	 *
	 */
	public static final String $base_unit_rnd_typ = "base_unit_rnd_typ";
	/**
	 * Transaction unit rounding type 取引単位端数処理区分.<p>
	 *
	 */
	public static final String $trd_unit_rnd_typ = "trd_unit_rnd_typ";
	/**
	 * SKU 荷姿単位.<p>
	 *
	 */
	public static final String $pack_flg = "pack_flg";
	/**
	 * Order promising qty. 納期回答数量.<p>
	 *
	 */
	public static final String $prms_qty = "prms_qty";
	/**
	 * Delivery order received qty. 納入指示受領数量.<p>
	 *
	 */
	public static final String $dlv_inst_rcpt_qty = "dlv_inst_rcpt_qty";
	/**
	 * Delivery order replied qty. 納入指示回答数量.<p>
	 *
	 */
	public static final String $dlv_inst_prms_qty = "dlv_inst_prms_qty";
	/**
	 * Allocation qty. 引当数量.<p>
	 *
	 */
	public static final String $alloc_qty = "alloc_qty";
	/**
	 * Pending qty. 保留数量.<p>
	 *
	 */
	public static final String $wait_qty = "wait_qty";
	/**
	 * Shipping order qty. 出荷指図数量.<p>
	 *
	 */
	public static final String $ship_inst_qty = "ship_inst_qty";
	/**
	 * Shipping result qty. 出荷実績数量.<p>
	 *
	 */
	public static final String $ship_act_qty = "ship_act_qty";
	/**
	 * Invoice shipping scheduled qty. インボイス出荷予定数量.<p>
	 *
	 */
	public static final String $iv_schd_qty = "iv_schd_qty";
	/**
	 * Invoice shipping result qty. インボイス出荷実績数量.<p>
	 *
	 */
	public static final String $iv_act_qty = "iv_act_qty";
	/**
	 * Sales qty. 売上数量.<p>
	 *
	 */
	public static final String $sls_qty = "sls_qty";
	/**
	 * Shipping return qty. 出荷返品数量.<p>
	 *
	 */
	public static final String $ship_ret_qty = "ship_ret_qty";
	/**
	 * Scheduled re-shipping qty. 再出荷予定数量.<p>
	 *
	 */
	public static final String $re_ship_schd_qty = "re_ship_schd_qty";
	/**
	 * Firm 確定.<p>
	 *
	 */
	public static final String $fix_flg = "fix_flg";
	/**
	 * Reschedule shipment 再出荷予定.<p>
	 *
	 */
	public static final String $re_ship_schd_flg = "re_ship_schd_flg";
	/**
	 * Cancelled remaining shipping schedule qty. 出荷予定打切数量.<p>
	 *
	 */
	public static final String $ship_schd_abort_qty = "ship_schd_abort_qty";
	/**
	 * Cancelled remaining sales schedule qty. 売上予定打切数量.<p>
	 *
	 */
	public static final String $sls_schd_abort_qty = "sls_schd_abort_qty";
	/**
	 * order promising date 納期回答日.<p>
	 *
	 */
	public static final String $prms_dt = "prms_dt";
	/**
	 * Delivery order received date 納入指示受領日.<p>
	 *
	 */
	public static final String $dlv_inst_rcpt_dt = "dlv_inst_rcpt_dt";
	/**
	 * Delivery order replied date 納入指示回答日.<p>
	 *
	 */
	public static final String $dlv_inst_prms_dt = "dlv_inst_prms_dt";
	/**
	 * Delivery order date 納入指示日.<p>
	 *
	 */
	public static final String $dlv_inst_dt = "dlv_inst_dt";
	/**
	 * Delivery order time 納入指示時刻.<p>
	 *
	 */
	public static final String $dlv_inst_hm = "dlv_inst_hm";
	/**
	 * Replied delivery date 回答納入日.<p>
	 *
	 */
	public static final String $prms_dlv_dt = "prms_dlv_dt";
	/**
	 * Remaining delivery qty. 納品残数量.<p>
	 *
	 */
	public static final String $not_dlv_qty = "not_dlv_qty";
	/**
	 * Delay expectation qty. 遅れ見込数量.<p>
	 *
	 */
	public static final String $overdue_prspct_qty = "overdue_prspct_qty";
	/**
	 * Shipping progress 出荷進捗率.<p>
	 *
	 */
	public static final String $ship_pr_rate = "ship_pr_rate";
	/**
	 * Sales progress 売上進捗率.<p>
	 *
	 */
	public static final String $sls_pr_rate = "sls_pr_rate";
	/**
	 * Shipping date 出荷日.<p>
	 *
	 */
	public static final String $ship_dt = "ship_dt";
	/**
	 * Shipping time 出荷時刻.<p>
	 *
	 */
	public static final String $ship_hm = "ship_hm";
	/**
	 * Delivery date 納品日.<p>
	 *
	 */
	public static final String $dlv_dt = "dlv_dt";
	/**
	 * Delivery time 納品時刻.<p>
	 *
	 */
	public static final String $dlv_hm = "dlv_hm";
	/**
	 * Delivery LT 納品ＬＴ.<p>
	 *
	 */
	public static final String $act_dlv_lt = "act_dlv_lt";
	/**
	 * Sales date 売上日.<p>
	 *
	 */
	public static final String $sls_dt = "sls_dt";
	/**
	 * Delivery qty. 納品数量.<p>
	 *
	 */
	public static final String $dlv_qty = "dlv_qty";
	/**
	 * Desired delivery date delayed (Result) 納入希望日遅れ（実績）.<p>
	 *
	 */
	public static final String $dlv_rqst_dt_overdue_act_flg = "dlv_rqst_dt_overdue_act_flg";
	/**
	 * Replied delivery date delayed (Result) 回答納入日遅れ（実績）.<p>
	 *
	 */
	public static final String $prms_dlv_dt_overdue_act_flg = "prms_dlv_dt_overdue_act_flg";
	/**
	 * Display order 表示順.<p>
	 *
	 */
	public static final String $disp_seq = "disp_seq";
	/**
	 * Charged dept. (Sales dept.) 負担部門（売上部門）.<p>
	 *
	 */
	public static final String $bd_dpt_flg = "bd_dpt_flg";
	/**
	 * Shipping schedule split type (Master) 出荷予定分割区分（マスタ）.<p>
	 *
	 */
	public static final String $cst_ship_schd_split_typ = "cst_ship_schd_split_typ";
	/**
	 * Revenue recording type (Master) 売上計上区分（マスタ）.<p>
	 *
	 */
	public static final String $cst_sls_basis_typ = "cst_sls_basis_typ";
	/**
	 * Sales PIC cd. (Master) 売上担当者ＣＤ（マスタ）.<p>
	 *
	 */
	public static final String $cst_sls_usr_cd = "cst_sls_usr_cd";
	/**
	 * Sales dept. cd. (master) 売上部門ＣＤ（マスタ）.<p>
	 *
	 */
	public static final String $cst_sls_dpt_cd = "cst_sls_dpt_cd";
	/**
	 * AR dept. cd. (Master) 債権部門ＣＤ（マスタ）.<p>
	 *
	 */
	public static final String $cst_ar_dpt_cd = "cst_ar_dpt_cd";
	/**
	 * Billing carry-over count (BP master) 請求繰越回数（取引先マスタ）.<p>
	 *
	 */
	public static final String $cst_bill_crryovr_times = "cst_bill_crryovr_times";
	/**
	 * Sales unit price acquisition type (BP master) 販売単価取得区分（取引先マスタ）.<p>
	 *
	 */
	public static final String $cst_sls_upri_req_typ = "cst_sls_upri_req_typ";
	/**
	 * Allow sales unit price change (BP master) 販売単価変更許可（取引先マスタ）.<p>
	 *
	 */
	public static final String $cst_sls_upri_cng_flg = "cst_sls_upri_cng_flg";
	/**
	 * AR dept. type (Master) 債権部門区分（マスタ）.<p>
	 *
	 */
	public static final String $ar_dpt_typ = "ar_dpt_typ";
	/**
	 * Transaction currency cd. (Master) 取引通貨ＣＤ（マスタ）.<p>
	 *
	 */
	public static final String $cst_trd_cur_cd = "cst_trd_cur_cd";
	/**
	 * Unit price number of decimal places (Master) 単価小数部有効桁数（マスタ）.<p>
	 *
	 */
	public static final String $cst_upri_dec_place = "cst_upri_dec_place";
	/**
	 * Amount number of decimal places (Master) 金額小数部有効桁数（マスタ）.<p>
	 *
	 */
	public static final String $cst_amt_dec_place = "cst_amt_dec_place";
	/**
	 * Unit price number of decimal places 単価小数部有効桁数.<p>
	 *
	 */
	public static final String $upri_dec_place = "upri_dec_place";
	/**
	 * Delivery destination name (Master) 納品先名（マスタ）.<p>
	 *
	 */
	public static final String $mst_dlv_nm = "mst_dlv_nm";
	/**
	 * Delivery destination dept. (Master) 納品先部署（マスタ）.<p>
	 *
	 */
	public static final String $mst_dlv_cntct_dpt = "mst_dlv_cntct_dpt";
	/**
	 * Delivery destination PIC (Master) 納品先担当者（マスタ）.<p>
	 *
	 */
	public static final String $mst_dlv_cntct_psn = "mst_dlv_cntct_psn";
	/**
	 * Delivery destination postal code (Master) 納品先郵便番号（マスタ）.<p>
	 *
	 */
	public static final String $mst_dlv_zip_cd = "mst_dlv_zip_cd";
	/**
	 * Delivery destination address 1 (Master) 納品先住所１（マスタ）.<p>
	 *
	 */
	public static final String $mst_dlv_addr1 = "mst_dlv_addr1";
	/**
	 * Delivery address 2 (Master) 納品先住所２（マスタ）.<p>
	 *
	 */
	public static final String $mst_dlv_addr2 = "mst_dlv_addr2";
	/**
	 * Delivery address 3 (Master) 納品先住所３（マスタ）.<p>
	 *
	 */
	public static final String $mst_dlv_addr3 = "mst_dlv_addr3";
	/**
	 * Delivery address 4 (Master) 納品先住所４（マスタ）.<p>
	 *
	 */
	public static final String $mst_dlv_addr4 = "mst_dlv_addr4";
	/**
	 * Delivery destination TEL (Master) 納品先ＴＥＬ（マスタ）.<p>
	 *
	 */
	public static final String $mst_dlv_tel = "mst_dlv_tel";
	/**
	 * Delivery destination FAX (Master) 納品先ＦＡＸ（マスタ）.<p>
	 *
	 */
	public static final String $mst_dlv_fax = "mst_dlv_fax";
	/**
	 * Delivery destination distribution group cd. (Master) 納品先物流グループＣＤ（マスタ）.<p>
	 *
	 */
	public static final String $mst_dlv_lg_grp_cd = "mst_dlv_lg_grp_cd";
	/**
	 * Report output locale cd. (master) 帳票出力ロケールＣＤ（マスタ）.<p>
	 *
	 */
	public static final String $prnt_lcl_cd = "prnt_lcl_cd";
	/**
	 * Delivery name (master) 配送先名（マスタ）.<p>
	 *
	 */
	public static final String $mst_tdlv_nm = "mst_tdlv_nm";
	/**
	 * Destination dept. (master) 配送先部署（マスタ）.<p>
	 *
	 */
	public static final String $mst_tdlv_cntct_dpt = "mst_tdlv_cntct_dpt";
	/**
	 * Delivery person in charge (master) 配送先担当者（マスタ）.<p>
	 *
	 */
	public static final String $mst_tdlv_cntct_psn = "mst_tdlv_cntct_psn";
	/**
	 * Delivery destination postal code (master) 配送先郵便番号（マスタ）.<p>
	 *
	 */
	public static final String $mst_tdlv_zip_cd = "mst_tdlv_zip_cd";
	/**
	 * Shipping address 1 (master) 配送先住所１（マスタ）.<p>
	 *
	 */
	public static final String $mst_tdlv_addr1 = "mst_tdlv_addr1";
	/**
	 * Shipping address 2 (master) 配送先住所２（マスタ）.<p>
	 *
	 */
	public static final String $mst_tdlv_addr2 = "mst_tdlv_addr2";
	/**
	 * Shipping address 3 (master) 配送先住所３（マスタ）.<p>
	 *
	 */
	public static final String $mst_tdlv_addr3 = "mst_tdlv_addr3";
	/**
	 * Shipping address 4 (master) 配送先住所４（マスタ）.<p>
	 *
	 */
	public static final String $mst_tdlv_addr4 = "mst_tdlv_addr4";
	/**
	 * Delivery destination TEL (master) 配送先ＴＥＬ（マスタ）.<p>
	 *
	 */
	public static final String $mst_tdlv_tel = "mst_tdlv_tel";
	/**
	 * Delivery destination fax (master) 配送先ＦＡＸ（マスタ）.<p>
	 *
	 */
	public static final String $mst_tdlv_fax = "mst_tdlv_fax";
	/**
	 * Delivery destination distribution group cd. (master) 配送先物流グループＣＤ（マスタ）.<p>
	 *
	 */
	public static final String $mst_tdlv_lg_grp_cd = "mst_tdlv_lg_grp_cd";
	/**
	 * Destination via classification (master) 配送先経由区分（マスタ）.<p>
	 *
	 */
	public static final String $mst_via_dlv_typ = "mst_via_dlv_typ";
	/**
	 * Unit price (Master) (Transaction currency) 取引通貨単価（マスタ）.<p>
	 *
	 */
	public static final String $mst_trd_cur_upri = "mst_trd_cur_upri";
	/**
	 * Temporary unit price (Master) 仮単価（マスタ）.<p>
	 *
	 */
	public static final String $mst_interim_flg = "mst_interim_flg";
	/**
	 * Direct delivery/relay location cd. 仕入直送中継場所場所ＣＤ.<p>
	 *
	 */
	public static final String $mid_loc_cd = "mid_loc_cd";
	/**
	 * WG cd. (Location) ワーキンググループＣＤ（場所）.<p>
	 *
	 */
	public static final String $loc_wg_cd = "loc_wg_cd";
	/**
	 * Tax type 税区分.<p>
	 *
	 */
	public static final String $tax_typ = "tax_typ";
	/**
	 * Billing carry-over count (Item master) 請求繰越回数（品目マスタ）.<p>
	 *
	 */
	public static final String $itm_bill_crryovr_times = "itm_bill_crryovr_times";
	/**
	 * Allow sales unit price change (Item master) 販売単価変更許可（品目マスタ）.<p>
	 *
	 */
	public static final String $itm_sls_upri_cng_flg = "itm_sls_upri_cng_flg";
	/**
	 * Origin cd. (Item master) 原産地ＣＤ（品目マスタ）.<p>
	 *
	 */
	public static final String $itm_cntry_org_cd = "itm_cntry_org_cd";
	/**
	 * Lot management type ロット管理区分.<p>
	 *
	 */
	public static final String $lot_mng_typ = "lot_mng_typ";
	/**
	 * Sublot management type サブロット管理区分.<p>
	 *
	 */
	public static final String $sublot_mng_typ = "sublot_mng_typ";
	/**
	 * Sales order procurement item (Master) 受注手配品（マスタ）.<p>
	 *
	 */
	public static final String $slo_proc_flg = "slo_proc_flg";
	/**
	 * Transaction unit cd. (Master) 取引単位ＣＤ（マスタ）.<p>
	 *
	 */
	public static final String $itm_trd_unit_cd = "itm_trd_unit_cd";
	/**
	 * Procurement type (Master) 手配区分（マスタ）.<p>
	 *
	 */
	public static final String $itm_proc_typ = "itm_proc_typ";
	/**
	 * Order type (Master) 指図区分（マスタ）.<p>
	 *
	 */
	public static final String $itm_ship_inst_typ = "itm_ship_inst_typ";
	/**
	 * Shipping conditions cd. (Master) 出荷条件ＣＤ（マスタ）.<p>
	 *
	 */
	public static final String $itm_ship_term_cd = "itm_ship_term_cd";
	/**
	 * Credit managed BP cd. 与信管理先ＣＤ.<p>
	 *
	 */
	public static final String $cred_cd = "cred_cd";
	/**
	 * Customer item name 得意先品名.<p>
	 *
	 */
	public static final String $mst_cst_itm_nm = "mst_cst_itm_nm";
	/**
	 * Item name 品名.<p>
	 *
	 */
	public static final String $mst_itm_nm = "mst_itm_nm";
	/**
	 * Copy quotation 見積引継.<p>
	 *
	 */
	public static final String $qtn_no_copy_flg = "qtn_no_copy_flg";


	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta data_crud_typ_META = createCommonMeta($data_crud_typ, mcframe.commonMA.meta.MA_META.DATA_CRUD_TYP);
	public static final MCMeta rtn_sts_typ_META = createCommonMeta($rtn_sts_typ, mcframe.commonMA.meta.MA_META.RTN_STS_TYP);
	public static final MCMeta err_flg_META = createCommonMeta($err_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sls_sts_typ_META = createCommonMeta($sls_sts_typ, mcframe.commonMS.meta.MS_META.SLS_STS_TYP);
	public static final MCMeta sls_sts_typ_nm_META = createCommonMeta($sls_sts_typ_nm, mcframe.commonMS.meta.MS_META.SLS_STS_TYP_NM);
	public static final MCMeta pr_sts_typ_META = createCommonMeta($pr_sts_typ, mcframe.commonMS.meta.MS_META.PR_STS_TYP);
	public static final MCMeta pr_sts_typ_nm_META = createCommonMeta($pr_sts_typ_nm, mcframe.commonMS.meta.MS_META.PR_STS_TYP_NM);
	public static final MCMeta alloc_sts_typ_META = createCommonMeta($alloc_sts_typ, mcframe.commonMS.meta.MS_META.ALLOC_STS_TYP);
	public static final MCMeta alloc_sts_typ_nm_META = createCommonMeta($alloc_sts_typ_nm, mcframe.commonMS.meta.MS_META.ALLOC_STS_TYP_NM);
	public static final MCMeta trd_cd_META = createCommonMeta($trd_cd, mcframe.commonMA.meta.MA_META.TRD_CD);
	public static final MCMeta trd_nm_META = createCommonMeta($trd_nm, mcframe.commonMA.meta.MA_META.TRD_NM);
	public static final MCMeta trd_ptn_typ_META = createCommonMeta($trd_ptn_typ, mcframe.commonMA.meta.MA_META.TRD_PTN_TYP);
	public static final MCMeta slo_no_META = createCommonMeta($slo_no, mcframe.commonMA.meta.MA_META.SLO_NO);
	public static final MCMeta slo_rev_META = createCommonMeta($slo_rev, mcframe.commonMA.meta.MA_META.SLIP_REV);
	public static final MCMeta slo_typ_META = createCommonMeta($slo_typ, mcframe.commonMS.meta.MS_META.SLO_TYP);
	public static final MCMeta slo_typ_nm_META = createCommonMeta($slo_typ_nm, mcframe.commonMS.meta.MS_META.SLO_TYP_NM);
	public static final MCMeta slo_dt_META = createCommonMeta($slo_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta qtn_no_META = createCommonMeta($qtn_no, mcframe.commonMA.meta.MA_META.QTN_NO);
	public static final MCMeta qtn_rev_META = createCommonMeta($qtn_rev, mcframe.commonMA.meta.MA_META.SLIP_REV);
	public static final MCMeta qtn_aprv_flg_META = createCommonMeta($qtn_aprv_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta qtn_aprv_no_META = createCommonMeta($qtn_aprv_no, mcframe.commonMA.meta.MA_META.APRV_NO);
	public static final MCMeta can_upd_flg_META = createCommonMeta($can_upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta can_del_flg_META = createCommonMeta($can_del_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta slo_d_no_META = createCommonMeta($slo_d_no, mcframe.commonMA.meta.MA_META.SLO_D_NO);
	public static final MCMeta slo_d_rev_META = createCommonMeta($slo_d_rev, mcframe.commonMA.meta.MA_META.SLIP_REV);
	public static final MCMeta sim_alloc_pln_typ_META = createCommonMeta($sim_alloc_pln_typ, mcframe.commonMS.meta.MS_META.SIM_ALLOC_PLN_TYP);
	public static final MCMeta sim_alloc_pln_typ_nm_META = createCommonMeta($sim_alloc_pln_typ_nm, mcframe.commonMS.meta.MS_META.SIM_ALLOC_PLN_TYP_NM);
	public static final MCMeta cst_cd_META = createCommonMeta($cst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta cst_nm_META = createCommonMeta($cst_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta cst_iv_flg_META = createCommonMeta($cst_iv_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sls_basis_typ_META = createCommonMeta($sls_basis_typ, mcframe.commonMA.meta.MA_META.SLS_BASIS_TYP);
	public static final MCMeta sls_basis_typ_nm_META = createCommonMeta($sls_basis_typ_nm, mcframe.commonMA.meta.MA_META.SLS_BASIS_TYP_NM);
	public static final MCMeta sls_usr_cd_META = createCommonMeta($sls_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta sls_usr_nm_META = createCommonMeta($sls_usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta sls_dpt_cd_META = createCommonMeta($sls_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta sls_dpt_nm_META = createCommonMeta($sls_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta wg_nm_META = createCommonMeta($wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta assort_typ_META = createCommonMeta($assort_typ, mcframe.commonMS.meta.MS_META.SHIP_ASSORT_TYP);
	public static final MCMeta assort_typ_nm_META = createCommonMeta($assort_typ_nm, mcframe.commonMS.meta.MS_META.SHIP_ASSORT_TYP_NM);
	public static final MCMeta trd_cur_cd_META = createCommonMeta($trd_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta trd_cur_nm_META = createCommonMeta($trd_cur_nm, mcframe.commonMA.meta.MA_META.CUR_NM);
	public static final MCMeta trd_cur_upri_dec_place_META = createCommonMeta($trd_cur_upri_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta trd_cur_amt_dec_place_META = createCommonMeta($trd_cur_amt_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta xrate_inpt_flg_META = createCommonMeta($xrate_inpt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta xrate_META = createCommonMeta($xrate, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_cd_META = createCommonMeta($base_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta base_cur_nm_META = createCommonMeta($base_cur_nm, mcframe.commonMA.meta.MA_META.CUR_NM);
	public static final MCMeta base_cur_upri_META = createCommonMeta($base_cur_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_amt_META = createCommonMeta($base_cur_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_inc_tax_amt_META = createCommonMeta($base_cur_inc_tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_tax_amt_META = createCommonMeta($base_cur_tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta ptax_cur_cd_META = createCommonMeta($ptax_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta ptax_cur_nm_META = createCommonMeta($ptax_cur_nm, mcframe.commonMA.meta.MA_META.CUR_NM);
	public static final MCMeta ptax_xrate_inpt_flg_META = createCommonMeta($ptax_xrate_inpt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ptax_xrate_META = createCommonMeta($ptax_xrate, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta ptax_cur_upri_META = createCommonMeta($ptax_cur_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta ptax_cur_amt_META = createCommonMeta($ptax_cur_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta ptax_cur_inc_tax_amt_META = createCommonMeta($ptax_cur_inc_tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta ptax_cur_tax_amt_META = createCommonMeta($ptax_cur_tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta prof_rate_META = createCommonMeta($prof_rate, mcframe.commonMA.meta.MA_META.PER);
	public static final MCMeta wrk_no_META = createCommonMeta($wrk_no, mcframe.commonMA.meta.MA_META.WRK_NO);
	public static final MCMeta wrk_nm_META = createCommonMeta($wrk_nm, mcframe.commonMA.meta.MA_META.WRK_NM);
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
	public static final MCMeta iv_no_META = createCommonMeta($iv_no, mcframe.commonMA.meta.MA_META.IV_NO);
	public static final MCMeta iv_num_flg_META = createCommonMeta($iv_num_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta adv_ship_ctrl_typ_META = createCommonMeta($adv_ship_ctrl_typ, mcframe.commonMS.meta.MS_META.ADV_SHIP_CTRL_TYP);
	public static final MCMeta adv_ship_ctrl_typ_nm_META = createCommonMeta($adv_ship_ctrl_typ_nm, mcframe.commonMS.meta.MS_META.ADV_SHIP_CTRL_TYP_NM);
	public static final MCMeta adv_bill_amt_META = createCommonMeta($adv_bill_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta adv_rcv_amt_META = createCommonMeta($adv_rcv_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta tterm_cd1_META = createCommonMeta($tterm_cd1, mcframe.commonMA.meta.MA_META.TTERM_CD);
	public static final MCMeta tterm_nm1_META = createCommonMeta($tterm_nm1, mcframe.commonMA.meta.MA_META.TTERM_NM);
	public static final MCMeta tterm_rmrks1_META = createCommonMeta($tterm_rmrks1, mcframe.commonMS.meta.MS_META.TTERM_RMRKS1);
	public static final MCMeta tterm_cd2_META = createCommonMeta($tterm_cd2, mcframe.commonMA.meta.MA_META.TTERM_CD);
	public static final MCMeta tterm_nm2_META = createCommonMeta($tterm_nm2, mcframe.commonMA.meta.MA_META.TTERM_NM);
	public static final MCMeta tterm_rmrks2_META = createCommonMeta($tterm_rmrks2, mcframe.commonMS.meta.MS_META.TTERM_RMRKS2);
	public static final MCMeta tterm_cd3_META = createCommonMeta($tterm_cd3, mcframe.commonMA.meta.MA_META.TTERM_CD);
	public static final MCMeta tterm_nm3_META = createCommonMeta($tterm_nm3, mcframe.commonMA.meta.MA_META.TTERM_NM);
	public static final MCMeta tterm_rmrks3_META = createCommonMeta($tterm_rmrks3, mcframe.commonMS.meta.MS_META.TTERM_RMRKS3);
	public static final MCMeta cst_po_no_META = createCommonMeta($cst_po_no, mcframe.commonMA.meta.MA_META.CST_PO_NO);
	public static final MCMeta cst_po_rev_META = createCommonMeta($cst_po_rev, mcframe.commonMA.meta.MA_META.SLIP_REV);
	public static final MCMeta acst_cd_META = createCommonMeta($acst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta acst_nm_META = createCommonMeta($acst_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta ar_dpt_cd_META = createCommonMeta($ar_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta ar_dpt_nm_META = createCommonMeta($ar_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta rcpt_dt_META = createCommonMeta($rcpt_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta rcpt_usr_cd_META = createCommonMeta($rcpt_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta rcpt_usr_nm_META = createCommonMeta($rcpt_usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta cst_po_rmrks_META = createCommonMeta($cst_po_rmrks, mcframe.commonMS.meta.MS_META.CST_PO_RMRKS);
	public static final MCMeta trd_rmrks_META = createCommonMeta($trd_rmrks, mcframe.commonMA.meta.MA_META.TRD_RMRKS);
	public static final MCMeta intr_rmrks_META = createCommonMeta($intr_rmrks, mcframe.commonMS.meta.MS_META.SLS_ACT_INTR_RMRKS);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.SLO_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.SLO_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.SLO_SUB_CHAR3);
	public static final MCMeta edi_flg_META = createCommonMeta($edi_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cntry_cd_META = createCommonMeta($cntry_cd, mcframe.commonMA.meta.MA_META.CNTRY_CD);
	public static final MCMeta slo_upd_cntr_META = createCommonMeta($slo_upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);
	public static final MCMeta qtn_upd_cntr_META = createCommonMeta($qtn_upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);
	public static final MCMeta sls_amt_rnd_typ_META = createCommonMeta($sls_amt_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta sls_tax_rnd_typ_META = createCommonMeta($sls_tax_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta amt_dec_place_META = createCommonMeta($amt_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta is_src_batch_flg_META = createCommonMeta($is_src_batch_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta edi_sub_char1_META = createCommonMeta($edi_sub_char1, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR1);
	public static final MCMeta edi_sub_char2_META = createCommonMeta($edi_sub_char2, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR2);
	public static final MCMeta edi_sub_char3_META = createCommonMeta($edi_sub_char3, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR3);
	public static final MCMeta edi_sub_char4_META = createCommonMeta($edi_sub_char4, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR4);
	public static final MCMeta edi_sub_char5_META = createCommonMeta($edi_sub_char5, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR5);
	public static final MCMeta edi_sub_num1_META = createCommonMeta($edi_sub_num1, mcframe.commonMA.meta.MA_META.IF_SUB_NUM1);
	public static final MCMeta edi_sub_dt1_META = createCommonMeta($edi_sub_dt1, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta aprv_flg_META = createCommonMeta($aprv_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta aprv_back_flg_META = createCommonMeta($aprv_back_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta aprv_no_META = createCommonMeta($aprv_no, mcframe.commonMA.meta.MA_META.APRV_NO);
	public static final MCMeta aprv_sts_typ_META = createCommonMeta($aprv_sts_typ, mcframe.commonMA.meta.MA_META.APRV_STS_TYP);
	public static final MCMeta aprv_sts_typ_nm_META = createCommonMeta($aprv_sts_typ_nm, mcframe.commonMA.meta.MA_META.APRV_STS_TYP_NM);
	public static final MCMeta can_flg_META = createCommonMeta($can_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta can_rsn_cd_META = createCommonMeta($can_rsn_cd, mcframe.commonMS.meta.MS_META.SLO_RSN_CD);
	public static final MCMeta can_rsn_nm_META = createCommonMeta($can_rsn_nm, mcframe.commonMS.meta.MS_META.SLO_RSN_NM);
	public static final MCMeta can_rmrks_META = createCommonMeta($can_rmrks, mcframe.commonMS.meta.MS_META.SLO_CAN_RMRKS);
	public static final MCMeta hdr_grp_no_META = createCommonMeta($hdr_grp_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta hdr_err_flg_META = createCommonMeta($hdr_err_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta abort_flg_META = createCommonMeta($abort_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cst_itm_cd_META = createCommonMeta($cst_itm_cd, mcframe.commonMA.meta.MA_META.BP_ITM_CD);
	public static final MCMeta cst_itm_nm_META = createCommonMeta($cst_itm_nm, mcframe.commonMA.meta.MA_META.BP_ITM_NM);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta itm_nm_META = createCommonMeta($itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta comp_spec_typ_META = createCommonMeta($comp_spec_typ, mcframe.commonMA.meta.MA_META.COMP_SPEC_TYP);
	public static final MCMeta comp_spec_typ_nm_META = createCommonMeta($comp_spec_typ_nm, mcframe.commonMA.meta.MA_META.COMP_SPEC_TYP_NM);
	public static final MCMeta itm_comp_rev_no_META = createCommonMeta($itm_comp_rev_no, mcframe.commonMA.meta.MA_META.ITM_COMP_REV_NO);
	public static final MCMeta iv_itm_nm_META = createCommonMeta($iv_itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta cntry_org_cd_META = createCommonMeta($cntry_org_cd, mcframe.commonMA.meta.MA_META.CNTRY_CD);
	public static final MCMeta cntry_org_nm_META = createCommonMeta($cntry_org_nm, mcframe.commonMA.meta.MA_META.CNTRY_NM);
	public static final MCMeta asset_mng_typ_META = createCommonMeta($asset_mng_typ, mcframe.commonMA.meta.MA_META.ASSET_MNG_TYP);
	public static final MCMeta asset_mng_typ_nm_META = createCommonMeta($asset_mng_typ_nm, mcframe.commonMA.meta.MA_META.ASSET_MNG_TYP_NM);
	public static final MCMeta vmi_flg_META = createCommonMeta($vmi_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dscnt_itm_flg_META = createCommonMeta($dscnt_itm_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta alloc_margin_days_META = createCommonMeta($alloc_margin_days, mcframe.commonMA.meta.MA_META.DAYS);
	public static final MCMeta stk_mng_typ_META = createCommonMeta($stk_mng_typ, mcframe.commonMA.meta.MA_META.STK_MNG_TYP);
	public static final MCMeta sundry_itm_flg_META = createCommonMeta($sundry_itm_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta trd_unit_cd_META = createCommonMeta($trd_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta trd_unit_nm_META = createCommonMeta($trd_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta trd_unit_qty_META = createCommonMeta($trd_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta trd_unit_dec_place_META = createCommonMeta($trd_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta trd_unit_conv_base_qty_META = createCommonMeta($trd_unit_conv_base_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta trd_unit_conv_qty_META = createCommonMeta($trd_unit_conv_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta upri_not_tgt_flg_META = createCommonMeta($upri_not_tgt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta trd_cur_upri_META = createCommonMeta($trd_cur_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta interim_flg_META = createCommonMeta($interim_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta trd_cur_amt_META = createCommonMeta($trd_cur_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta trd_cur_inc_tax_amt_META = createCommonMeta($trd_cur_inc_tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta cost_upri_META = createCommonMeta($cost_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta cost_amt_META = createCommonMeta($cost_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta trd_cur_dscnt_amt_META = createCommonMeta($trd_cur_dscnt_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta dscnt_rsn_cd_META = createCommonMeta($dscnt_rsn_cd, mcframe.commonMA.meta.MA_META.BIZ_RSN_CD);
	public static final MCMeta dscnt_rsn_nm_META = createCommonMeta($dscnt_rsn_nm, mcframe.commonMA.meta.MA_META.BIZ_RSN_NM);
	public static final MCMeta iv_upri_META = createCommonMeta($iv_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta iv_amt_META = createCommonMeta($iv_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta tax_fix_flg_META = createCommonMeta($tax_fix_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta tax_cd_META = createCommonMeta($tax_cd, mcframe.commonMA.meta.MA_META.TAX_CD);
	public static final MCMeta tax_nm_META = createCommonMeta($tax_nm, mcframe.commonMA.meta.MA_META.TAX_NM);
	public static final MCMeta tax_rate_META = createCommonMeta($tax_rate, mcframe.commonMA.meta.MA_META.TAX_RATE);
	public static final MCMeta inc_tax_flg_META = createCommonMeta($inc_tax_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta trd_cur_tax_amt_META = createCommonMeta($trd_cur_tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta wtax_rate_META = createCommonMeta($wtax_rate, mcframe.commonMA.meta.MA_META.WTAX_RATE);
	public static final MCMeta wtax_amt_META = createCommonMeta($wtax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta bill_crryovr_times_META = createCommonMeta($bill_crryovr_times, mcframe.commonMA.meta.MA_META.CRRYOVR_TIMES);
	public static final MCMeta gd_cd_META = createCommonMeta($gd_cd, mcframe.commonMA.meta.MA_META.STK_GD_CD);
	public static final MCMeta gd_nm_META = createCommonMeta($gd_nm, mcframe.commonMA.meta.MA_META.STK_GD_NM);
	public static final MCMeta sno_num_flg_META = createCommonMeta($sno_num_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sno1_META = createCommonMeta($sno1, mcframe.commonMA.meta.MA_META.SNO1);
	public static final MCMeta sno1_null_flg_META = createCommonMeta($sno1_null_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sno2_META = createCommonMeta($sno2, mcframe.commonMA.meta.MA_META.SNO2);
	public static final MCMeta sno2_null_flg_META = createCommonMeta($sno2_null_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sno3_META = createCommonMeta($sno3, mcframe.commonMA.meta.MA_META.SNO3);
	public static final MCMeta sno3_null_flg_META = createCommonMeta($sno3_null_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sno4_META = createCommonMeta($sno4, mcframe.commonMA.meta.MA_META.SNO4);
	public static final MCMeta sno4_null_flg_META = createCommonMeta($sno4_null_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sno1_mng_typ_META = createCommonMeta($sno1_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta sno2_mng_typ_META = createCommonMeta($sno2_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta sno3_mng_typ_META = createCommonMeta($sno3_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta sno4_mng_typ_META = createCommonMeta($sno4_mng_typ, mcframe.commonMA.meta.MA_META.SNO_MNG_TYP);
	public static final MCMeta sno1_num_typ_META = createCommonMeta($sno1_num_typ, mcframe.commonMA.meta.MA_META.SNO_NUM_TYP);
	public static final MCMeta sno2_num_typ_META = createCommonMeta($sno2_num_typ, mcframe.commonMA.meta.MA_META.SNO_NUM_TYP);
	public static final MCMeta sno3_num_typ_META = createCommonMeta($sno3_num_typ, mcframe.commonMA.meta.MA_META.SNO_NUM_TYP);
	public static final MCMeta sno4_num_typ_META = createCommonMeta($sno4_num_typ, mcframe.commonMA.meta.MA_META.SNO_NUM_TYP);
	public static final MCMeta sno1_ptn_cd_META = createCommonMeta($sno1_ptn_cd, mcframe.commonMA.meta.MA_META.NUM_PTN_CD);
	public static final MCMeta sno2_ptn_cd_META = createCommonMeta($sno2_ptn_cd, mcframe.commonMA.meta.MA_META.NUM_PTN_CD);
	public static final MCMeta sno3_ptn_cd_META = createCommonMeta($sno3_ptn_cd, mcframe.commonMA.meta.MA_META.NUM_PTN_CD);
	public static final MCMeta sno4_ptn_cd_META = createCommonMeta($sno4_ptn_cd, mcframe.commonMA.meta.MA_META.NUM_PTN_CD);
	public static final MCMeta slo_sno1_flg_META = createCommonMeta($slo_sno1_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta slo_sno2_flg_META = createCommonMeta($slo_sno2_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta slo_sno3_flg_META = createCommonMeta($slo_sno3_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta slo_sno4_flg_META = createCommonMeta($slo_sno4_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta set_itm_grp_no_META = createCommonMeta($set_itm_grp_no, mcframe.commonMA.meta.MA_META.SET_ITM_GRP_NO);
	public static final MCMeta ship_rqst_tm_META = createCommonMeta($ship_rqst_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta ship_rqst_dt_META = createCommonMeta($ship_rqst_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta ship_rqst_hm_META = createCommonMeta($ship_rqst_hm, mcframe.commonMA.meta.MA_META.HM);
	public static final MCMeta dlv_rqst_tm_META = createCommonMeta($dlv_rqst_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta dlv_rqst_dt_META = createCommonMeta($dlv_rqst_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta dlv_rqst_hm_META = createCommonMeta($dlv_rqst_hm, mcframe.commonMA.meta.MA_META.HM);
	public static final MCMeta pd_inst_dlv_dt_META = createCommonMeta($pd_inst_dlv_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta pd_inst_dlv_hm_META = createCommonMeta($pd_inst_dlv_hm, mcframe.commonMA.meta.MA_META.HM);
	public static final MCMeta accpt_schd_dt_META = createCommonMeta($accpt_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta sls_schd_dt_META = createCommonMeta($sls_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta ship_schd_split_flg_META = createCommonMeta($ship_schd_split_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ship_abl_flg_META = createCommonMeta($ship_abl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ship_schd_tm_META = createCommonMeta($ship_schd_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta ship_schd_dt_META = createCommonMeta($ship_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta ship_schd_hm_META = createCommonMeta($ship_schd_hm, mcframe.commonMA.meta.MA_META.HM);
	public static final MCMeta dlv_schd_tm_META = createCommonMeta($dlv_schd_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta dlv_schd_dt_META = createCommonMeta($dlv_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta dlv_schd_hm_META = createCommonMeta($dlv_schd_hm, mcframe.commonMA.meta.MA_META.HM);
	public static final MCMeta dlv_cd_META = createCommonMeta($dlv_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta dlv_sundry_flg_META = createCommonMeta($dlv_sundry_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dlv_nm_META = createCommonMeta($dlv_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta dlv_cntct_dpt_META = createCommonMeta($dlv_cntct_dpt, mcframe.commonMA.meta.MA_META.BP_CNTCT_DPT);
	public static final MCMeta dlv_cntct_psn_META = createCommonMeta($dlv_cntct_psn, mcframe.commonMA.meta.MA_META.BP_CNTCT_PSN);
	public static final MCMeta dlv_zip_cd_META = createCommonMeta($dlv_zip_cd, mcframe.commonMA.meta.MA_META.ZIP_CD);
	public static final MCMeta dlv_addr1_META = createCommonMeta($dlv_addr1, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta dlv_addr2_META = createCommonMeta($dlv_addr2, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta dlv_addr3_META = createCommonMeta($dlv_addr3, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta dlv_addr4_META = createCommonMeta($dlv_addr4, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta dlv_tel_META = createCommonMeta($dlv_tel, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta dlv_fax_META = createCommonMeta($dlv_fax, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta dlv_cntry_cd_META = createCommonMeta($dlv_cntry_cd, mcframe.commonMA.meta.MA_META.CNTRY_CD);
	public static final MCMeta dlv_cntry_nm_META = createCommonMeta($dlv_cntry_nm, mcframe.commonMA.meta.MA_META.CNTRY_NM);
	public static final MCMeta dlv_lg_grp_cd_META = createCommonMeta($dlv_lg_grp_cd, mcframe.commonMA.meta.MA_META.LG_GRP_CD);
	public static final MCMeta dlv_lg_grp_nm_META = createCommonMeta($dlv_lg_grp_nm, mcframe.commonMA.meta.MA_META.LG_GRP_NM);
	public static final MCMeta pri_prnt_typ_META = createCommonMeta($pri_prnt_typ, mcframe.commonMA.meta.MA_META.PRI_PRNT_TYP);
	public static final MCMeta pri_prnt_flg_META = createCommonMeta($pri_prnt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dest_cd1_META = createCommonMeta($dest_cd1, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta dest_nm1_META = createCommonMeta($dest_nm1, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta dest_cd2_META = createCommonMeta($dest_cd2, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta dest_nm2_META = createCommonMeta($dest_nm2, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta dest_cd3_META = createCommonMeta($dest_cd3, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta dest_nm3_META = createCommonMeta($dest_nm3, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta tdlv_cd_META = createCommonMeta($tdlv_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta tdlv_req_flg_META = createCommonMeta($tdlv_req_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta tdlv_nm_META = createCommonMeta($tdlv_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta via_dlv_typ_META = createCommonMeta($via_dlv_typ, mcframe.commonMA.meta.MA_META.VIA_DLV_TYP);
	public static final MCMeta via_dlv_typ_nm_META = createCommonMeta($via_dlv_typ_nm, mcframe.commonMA.meta.MA_META.VIA_DLV_TYP_NM);
	public static final MCMeta tdlv_sundry_flg_META = createCommonMeta($tdlv_sundry_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta tdlv_cntct_dpt_META = createCommonMeta($tdlv_cntct_dpt, mcframe.commonMA.meta.MA_META.BP_CNTCT_DPT);
	public static final MCMeta tdlv_cntct_psn_META = createCommonMeta($tdlv_cntct_psn, mcframe.commonMA.meta.MA_META.BP_CNTCT_PSN);
	public static final MCMeta tdlv_zip_cd_META = createCommonMeta($tdlv_zip_cd, mcframe.commonMA.meta.MA_META.ZIP_CD);
	public static final MCMeta tdlv_addr1_META = createCommonMeta($tdlv_addr1, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta tdlv_addr2_META = createCommonMeta($tdlv_addr2, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta tdlv_addr3_META = createCommonMeta($tdlv_addr3, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta tdlv_addr4_META = createCommonMeta($tdlv_addr4, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta tdlv_tel_META = createCommonMeta($tdlv_tel, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta tdlv_fax_META = createCommonMeta($tdlv_fax, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta tdlv_cntry_cd_META = createCommonMeta($tdlv_cntry_cd, mcframe.commonMA.meta.MA_META.CNTRY_CD);
	public static final MCMeta tdlv_cntry_nm_META = createCommonMeta($tdlv_cntry_nm, mcframe.commonMA.meta.MA_META.CNTRY_NM);
	public static final MCMeta tdlv_lg_grp_cd_META = createCommonMeta($tdlv_lg_grp_cd, mcframe.commonMA.meta.MA_META.LG_GRP_CD);
	public static final MCMeta tdlv_lg_grp_nm_META = createCommonMeta($tdlv_lg_grp_nm, mcframe.commonMA.meta.MA_META.LG_GRP_NM);
	public static final MCMeta dlv_day_week_typ_META = createCommonMeta($dlv_day_week_typ, mcframe.commonMA.meta.MA_META.DAY_WEEK_TYP);
	public static final MCMeta dlv_day_week_typ_nm_META = createCommonMeta($dlv_day_week_typ_nm, mcframe.commonMA.meta.MA_META.DAY_WEEK_TYP_NM);
	public static final MCMeta sls_cststk_flg_META = createCommonMeta($sls_cststk_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta proc_typ_META = createCommonMeta($proc_typ, mcframe.commonMA.meta.MA_META.SLO_PROC_TYP);
	public static final MCMeta proc_typ_nm_META = createCommonMeta($proc_typ_nm, mcframe.commonMA.meta.MA_META.SLO_PROC_TYP_NM);
	public static final MCMeta ship_inst_typ_META = createCommonMeta($ship_inst_typ, mcframe.commonMA.meta.MA_META.SHIP_INST_TYP);
	public static final MCMeta ship_inst_typ_nm_META = createCommonMeta($ship_inst_typ_nm, mcframe.commonMA.meta.MA_META.SHIP_INST_TYP_NM);
	public static final MCMeta ship_schd_split_typ_META = createCommonMeta($ship_schd_split_typ, mcframe.commonMA.meta.MA_META.SHIP_SCHD_SPLIT_TYP);
	public static final MCMeta ship_schd_split_typ_nm_META = createCommonMeta($ship_schd_split_typ_nm, mcframe.commonMA.meta.MA_META.SHIP_SCHD_SPLIT_TYP_NM);
	public static final MCMeta alloc_scope_typ_META = createCommonMeta($alloc_scope_typ, mcframe.commonMA.meta.MA_META.ALLOC_SCOPE_TYP);
	public static final MCMeta alloc_scope_typ_nm_META = createCommonMeta($alloc_scope_typ_nm, mcframe.commonMA.meta.MA_META.ALLOC_SCOPE_TYP_NM);
	public static final MCMeta not_lg_mix_flg_META = createCommonMeta($not_lg_mix_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta alloc_typ_META = createCommonMeta($alloc_typ, mcframe.commonMA.meta.MA_META.ALLOC_TYP);
	public static final MCMeta alloc_typ_nm_META = createCommonMeta($alloc_typ_nm, mcframe.commonMA.meta.MA_META.ALLOC_TYP_NM);
	public static final MCMeta rqst_to_loc_cd_META = createCommonMeta($rqst_to_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta rqst_to_loc_nm_META = createCommonMeta($rqst_to_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta sppl_cd_META = createCommonMeta($sppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta sppl_nm_META = createCommonMeta($sppl_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta maker_cd_META = createCommonMeta($maker_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta maker_nm_META = createCommonMeta($maker_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta rqst_dt_META = createCommonMeta($rqst_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta rqst_dlv_rqst_dt_META = createCommonMeta($rqst_dlv_rqst_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta rqst_prms_dt_META = createCommonMeta($rqst_prms_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta rqst_prms_dlv_dt_META = createCommonMeta($rqst_prms_dlv_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta wg_rqst_cnt_rmrks_META = createCommonMeta($wg_rqst_cnt_rmrks, mcframe.commonMS.meta.MS_META.WG_RQST_CNT_RMRKS);
	public static final MCMeta rqst_to_wg_cd_META = createCommonMeta($rqst_to_wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta alloc_grp_cd_META = createCommonMeta($alloc_grp_cd, mcframe.commonMA.meta.MA_META.ALLOC_GRP_CD);
	public static final MCMeta alloc_grp_nm_META = createCommonMeta($alloc_grp_nm, mcframe.commonMA.meta.MA_META.ALLOC_GRP_NM);
	public static final MCMeta ship_lg_grp_cd_META = createCommonMeta($ship_lg_grp_cd, mcframe.commonMA.meta.MA_META.LG_GRP_CD);
	public static final MCMeta ship_lg_grp_nm_META = createCommonMeta($ship_lg_grp_nm, mcframe.commonMA.meta.MA_META.LG_GRP_NM);
	public static final MCMeta def_loc_cd_META = createCommonMeta($def_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta def_loc_nm_META = createCommonMeta($def_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta loc_cd_META = createCommonMeta($loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta loc_nm_META = createCommonMeta($loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta str_ln_tgt_flg_META = createCommonMeta($str_ln_tgt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta str_ln_cd_META = createCommonMeta($str_ln_cd, mcframe.commonMA.meta.MA_META.STR_LN_CD);
	public static final MCMeta str_ln_nm_META = createCommonMeta($str_ln_nm, mcframe.commonMA.meta.MA_META.STR_LN_NM);
	public static final MCMeta str_ln_cd_none_flg_META = createCommonMeta($str_ln_cd_none_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta lot_no_META = createCommonMeta($lot_no, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta sublot_no_META = createCommonMeta($sublot_no, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta not_lot_mix_flg_META = createCommonMeta($not_lot_mix_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta not_sublot_mix_flg_META = createCommonMeta($not_sublot_mix_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ver_flg_META = createCommonMeta($ver_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ver_no_META = createCommonMeta($ver_no, mcframe.commonMA.meta.MA_META.VER_NO);
	public static final MCMeta ship_term_cd_META = createCommonMeta($ship_term_cd, mcframe.commonMA.meta.MA_META.SHIP_TERM_CD);
	public static final MCMeta ship_term_nm_META = createCommonMeta($ship_term_nm, mcframe.commonMA.meta.MA_META.SHIP_TERM_NM);
	public static final MCMeta ship_block_flg_META = createCommonMeta($ship_block_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ship_cnt_rmrks_META = createCommonMeta($ship_cnt_rmrks, mcframe.commonMS.meta.MS_META.SHIP_CNT_RMRKS);
	public static final MCMeta cst_po_d_no_META = createCommonMeta($cst_po_d_no, mcframe.commonMA.meta.MA_META.CST_PO_D_NO);
	public static final MCMeta cst_po_d_rmrks_META = createCommonMeta($cst_po_d_rmrks, mcframe.commonMS.meta.MS_META.CST_PO_D_RMRKS);
	public static final MCMeta sls_rsn_cd_META = createCommonMeta($sls_rsn_cd, mcframe.commonMA.meta.MA_META.BIZ_RSN_CD);
	public static final MCMeta sls_rsn_nm_META = createCommonMeta($sls_rsn_nm, mcframe.commonMA.meta.MA_META.BIZ_RSN_NM);
	public static final MCMeta sls_acxfr_flg_META = createCommonMeta($sls_acxfr_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bd_dpt_cd_META = createCommonMeta($bd_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta bd_dpt_nm_META = createCommonMeta($bd_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta sls_upri_req_typ_META = createCommonMeta($sls_upri_req_typ, mcframe.commonMA.meta.MA_META.SLS_UPRI_REQ_TYP);
	public static final MCMeta sls_upri_req_typ_nm_META = createCommonMeta($sls_upri_req_typ_nm, mcframe.commonMA.meta.MA_META.SLS_UPRI_REQ_TYP_NM);
	public static final MCMeta io_schd_pr_no_META = createCommonMeta($io_schd_pr_no, mcframe.commonMA.meta.MA_META.IO_SCHD_PR_NO);
	public static final MCMeta trd_d_rmrks_META = createCommonMeta($trd_d_rmrks, mcframe.commonMA.meta.MA_META.TRD_D_RMRKS);
	public static final MCMeta slo_d_intr_rmrks_META = createCommonMeta($slo_d_intr_rmrks, mcframe.commonMS.meta.MS_META.SLO_D_INTR_RMRKS);
	public static final MCMeta slo_d_sub_char1_META = createCommonMeta($slo_d_sub_char1, mcframe.commonMS.meta.MS_META.SLO_D_SUB_CHAR1);
	public static final MCMeta slo_d_sub_char2_META = createCommonMeta($slo_d_sub_char2, mcframe.commonMS.meta.MS_META.SLO_D_SUB_CHAR2);
	public static final MCMeta slo_d_sub_char3_META = createCommonMeta($slo_d_sub_char3, mcframe.commonMS.meta.MS_META.SLO_D_SUB_CHAR3);
	public static final MCMeta qtn_d_no_META = createCommonMeta($qtn_d_no, mcframe.commonMA.meta.MA_META.QTN_D_NO);
	public static final MCMeta not_dt_calc_flg_META = createCommonMeta($not_dt_calc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta edi_sub_d_char1_META = createCommonMeta($edi_sub_d_char1, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR1);
	public static final MCMeta edi_sub_d_char2_META = createCommonMeta($edi_sub_d_char2, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR2);
	public static final MCMeta edi_sub_d_char3_META = createCommonMeta($edi_sub_d_char3, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR3);
	public static final MCMeta edi_sub_d_char4_META = createCommonMeta($edi_sub_d_char4, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR4);
	public static final MCMeta edi_sub_d_char5_META = createCommonMeta($edi_sub_d_char5, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR5);
	public static final MCMeta edi_sub_d_num1_META = createCommonMeta($edi_sub_d_num1, mcframe.commonMA.meta.MA_META.IF_SUB_NUM1);
	public static final MCMeta edi_sub_d_dt1_META = createCommonMeta($edi_sub_d_dt1, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta slo_d_can_flg_META = createCommonMeta($slo_d_can_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta slo_d_can_rsn_cd_META = createCommonMeta($slo_d_can_rsn_cd, mcframe.commonMS.meta.MS_META.SLO_RSN_CD);
	public static final MCMeta slo_d_can_rsn_nm_META = createCommonMeta($slo_d_can_rsn_nm, mcframe.commonMS.meta.MS_META.SLO_RSN_NM);
	public static final MCMeta slo_d_can_rmkrs_META = createCommonMeta($slo_d_can_rmkrs, mcframe.commonMS.meta.MS_META.SLO_D_CAN_RMKRS);
	public static final MCMeta ship_pr_no_META = createCommonMeta($ship_pr_no, mcframe.commonMA.meta.MA_META.SHIP_PR_NO);
	public static final MCMeta itm_ship_grp_cd_META = createCommonMeta($itm_ship_grp_cd, mcframe.commonMA.meta.MA_META.ITM_SHIP_GRP_CD);
	public static final MCMeta ship_pr_upd_cntr_META = createCommonMeta($ship_pr_upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);
	public static final MCMeta hdr_peg_no_META = createCommonMeta($hdr_peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta dtl_err_flg_META = createCommonMeta($dtl_err_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta upd_cntr_not_chk_flg_META = createCommonMeta($upd_cntr_not_chk_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ship_cmpl_flg_META = createCommonMeta($ship_cmpl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sls_cmpl_flg_META = createCommonMeta($sls_cmpl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta base_unit_cd_META = createCommonMeta($base_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta base_unit_nm_META = createCommonMeta($base_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta base_unit_qty_META = createCommonMeta($base_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta ship_pr_base_unit_qty_META = createCommonMeta($ship_pr_base_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_dec_place_META = createCommonMeta($base_unit_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta base_unit_rnd_typ_META = createCommonMeta($base_unit_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta trd_unit_rnd_typ_META = createCommonMeta($trd_unit_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta pack_flg_META = createCommonMeta($pack_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta prms_qty_META = createCommonMeta($prms_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta dlv_inst_rcpt_qty_META = createCommonMeta($dlv_inst_rcpt_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta dlv_inst_prms_qty_META = createCommonMeta($dlv_inst_prms_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta alloc_qty_META = createCommonMeta($alloc_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta wait_qty_META = createCommonMeta($wait_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta ship_inst_qty_META = createCommonMeta($ship_inst_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta ship_act_qty_META = createCommonMeta($ship_act_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta iv_schd_qty_META = createCommonMeta($iv_schd_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta iv_act_qty_META = createCommonMeta($iv_act_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta sls_qty_META = createCommonMeta($sls_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta ship_ret_qty_META = createCommonMeta($ship_ret_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta re_ship_schd_qty_META = createCommonMeta($re_ship_schd_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta fix_flg_META = createCommonMeta($fix_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta re_ship_schd_flg_META = createCommonMeta($re_ship_schd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ship_schd_abort_qty_META = createCommonMeta($ship_schd_abort_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta sls_schd_abort_qty_META = createCommonMeta($sls_schd_abort_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta prms_dt_META = createCommonMeta($prms_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta dlv_inst_rcpt_dt_META = createCommonMeta($dlv_inst_rcpt_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta dlv_inst_prms_dt_META = createCommonMeta($dlv_inst_prms_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta dlv_inst_dt_META = createCommonMeta($dlv_inst_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta dlv_inst_hm_META = createCommonMeta($dlv_inst_hm, mcframe.commonMA.meta.MA_META.HM);
	public static final MCMeta prms_dlv_dt_META = createCommonMeta($prms_dlv_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta not_dlv_qty_META = createCommonMeta($not_dlv_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta overdue_prspct_qty_META = createCommonMeta($overdue_prspct_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta ship_pr_rate_META = createCommonMeta($ship_pr_rate, mcframe.commonMA.meta.MA_META.PER);
	public static final MCMeta sls_pr_rate_META = createCommonMeta($sls_pr_rate, mcframe.commonMA.meta.MA_META.PER);
	public static final MCMeta ship_dt_META = createCommonMeta($ship_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta ship_hm_META = createCommonMeta($ship_hm, mcframe.commonMA.meta.MA_META.HM);
	public static final MCMeta dlv_dt_META = createCommonMeta($dlv_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta dlv_hm_META = createCommonMeta($dlv_hm, mcframe.commonMA.meta.MA_META.HM);
	public static final MCMeta act_dlv_lt_META = createCommonMeta($act_dlv_lt, mcframe.commonMA.meta.MA_META.LT);
	public static final MCMeta sls_dt_META = createCommonMeta($sls_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta dlv_qty_META = createCommonMeta($dlv_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta dlv_rqst_dt_overdue_act_flg_META = createCommonMeta($dlv_rqst_dt_overdue_act_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta prms_dlv_dt_overdue_act_flg_META = createCommonMeta($prms_dlv_dt_overdue_act_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta disp_seq_META = createCommonMeta($disp_seq, mcframe.commonMA.meta.MA_META.DISP_SEQ);
	public static final MCMeta bd_dpt_flg_META = createCommonMeta($bd_dpt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cst_ship_schd_split_typ_META = createCommonMeta($cst_ship_schd_split_typ, mcframe.commonMA.meta.MA_META.SHIP_SCHD_SPLIT_TYP);
	public static final MCMeta cst_sls_basis_typ_META = createCommonMeta($cst_sls_basis_typ, mcframe.commonMA.meta.MA_META.SLS_BASIS_TYP);
	public static final MCMeta cst_sls_usr_cd_META = createCommonMeta($cst_sls_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta cst_sls_dpt_cd_META = createCommonMeta($cst_sls_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta cst_ar_dpt_cd_META = createCommonMeta($cst_ar_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta cst_bill_crryovr_times_META = createCommonMeta($cst_bill_crryovr_times, mcframe.commonMA.meta.MA_META.CRRYOVR_TIMES);
	public static final MCMeta cst_sls_upri_req_typ_META = createCommonMeta($cst_sls_upri_req_typ, mcframe.commonMA.meta.MA_META.SLS_UPRI_REQ_TYP);
	public static final MCMeta cst_sls_upri_cng_flg_META = createCommonMeta($cst_sls_upri_cng_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ar_dpt_typ_META = createCommonMeta($ar_dpt_typ, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta cst_trd_cur_cd_META = createCommonMeta($cst_trd_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta cst_upri_dec_place_META = createCommonMeta($cst_upri_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta cst_amt_dec_place_META = createCommonMeta($cst_amt_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta upri_dec_place_META = createCommonMeta($upri_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta mst_dlv_nm_META = createCommonMeta($mst_dlv_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta mst_dlv_cntct_dpt_META = createCommonMeta($mst_dlv_cntct_dpt, mcframe.commonMA.meta.MA_META.BP_CNTCT_DPT);
	public static final MCMeta mst_dlv_cntct_psn_META = createCommonMeta($mst_dlv_cntct_psn, mcframe.commonMA.meta.MA_META.BP_CNTCT_PSN);
	public static final MCMeta mst_dlv_zip_cd_META = createCommonMeta($mst_dlv_zip_cd, mcframe.commonMA.meta.MA_META.ZIP_CD);
	public static final MCMeta mst_dlv_addr1_META = createCommonMeta($mst_dlv_addr1, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta mst_dlv_addr2_META = createCommonMeta($mst_dlv_addr2, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta mst_dlv_addr3_META = createCommonMeta($mst_dlv_addr3, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta mst_dlv_addr4_META = createCommonMeta($mst_dlv_addr4, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta mst_dlv_tel_META = createCommonMeta($mst_dlv_tel, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta mst_dlv_fax_META = createCommonMeta($mst_dlv_fax, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta mst_dlv_lg_grp_cd_META = createCommonMeta($mst_dlv_lg_grp_cd, mcframe.commonMA.meta.MA_META.LG_GRP_CD);
	public static final MCMeta prnt_lcl_cd_META = createCommonMeta($prnt_lcl_cd, mcframe.commonMA.meta.MA_META.LCL_CD);
	public static final MCMeta mst_tdlv_nm_META = createCommonMeta($mst_tdlv_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta mst_tdlv_cntct_dpt_META = createCommonMeta($mst_tdlv_cntct_dpt, mcframe.commonMA.meta.MA_META.BP_CNTCT_DPT);
	public static final MCMeta mst_tdlv_cntct_psn_META = createCommonMeta($mst_tdlv_cntct_psn, mcframe.commonMA.meta.MA_META.BP_CNTCT_PSN);
	public static final MCMeta mst_tdlv_zip_cd_META = createCommonMeta($mst_tdlv_zip_cd, mcframe.commonMA.meta.MA_META.ZIP_CD);
	public static final MCMeta mst_tdlv_addr1_META = createCommonMeta($mst_tdlv_addr1, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta mst_tdlv_addr2_META = createCommonMeta($mst_tdlv_addr2, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta mst_tdlv_addr3_META = createCommonMeta($mst_tdlv_addr3, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta mst_tdlv_addr4_META = createCommonMeta($mst_tdlv_addr4, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta mst_tdlv_tel_META = createCommonMeta($mst_tdlv_tel, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta mst_tdlv_fax_META = createCommonMeta($mst_tdlv_fax, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta mst_tdlv_lg_grp_cd_META = createCommonMeta($mst_tdlv_lg_grp_cd, mcframe.commonMA.meta.MA_META.LG_GRP_CD);
	public static final MCMeta mst_via_dlv_typ_META = createCommonMeta($mst_via_dlv_typ, mcframe.commonMA.meta.MA_META.VIA_DLV_TYP);
	public static final MCMeta mst_trd_cur_upri_META = createCommonMeta($mst_trd_cur_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta mst_interim_flg_META = createCommonMeta($mst_interim_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta mid_loc_cd_META = createCommonMeta($mid_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta loc_wg_cd_META = createCommonMeta($loc_wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta tax_typ_META = createCommonMeta($tax_typ, mcframe.commonMA.meta.MA_META.TAX_TYP);
	public static final MCMeta itm_bill_crryovr_times_META = createCommonMeta($itm_bill_crryovr_times, mcframe.commonMA.meta.MA_META.CRRYOVR_TIMES);
	public static final MCMeta itm_sls_upri_cng_flg_META = createCommonMeta($itm_sls_upri_cng_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_cntry_org_cd_META = createCommonMeta($itm_cntry_org_cd, mcframe.commonMA.meta.MA_META.CNTRY_CD);
	public static final MCMeta lot_mng_typ_META = createCommonMeta($lot_mng_typ, mcframe.commonMA.meta.MA_META.LOT_MNG_TYP);
	public static final MCMeta sublot_mng_typ_META = createCommonMeta($sublot_mng_typ, mcframe.commonMA.meta.MA_META.SUBLOT_MNG_TYP);
	public static final MCMeta slo_proc_flg_META = createCommonMeta($slo_proc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_trd_unit_cd_META = createCommonMeta($itm_trd_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta itm_proc_typ_META = createCommonMeta($itm_proc_typ, mcframe.commonMA.meta.MA_META.SLO_PROC_TYP);
	public static final MCMeta itm_ship_inst_typ_META = createCommonMeta($itm_ship_inst_typ, mcframe.commonMA.meta.MA_META.SHIP_INST_TYP);
	public static final MCMeta itm_ship_term_cd_META = createCommonMeta($itm_ship_term_cd, mcframe.commonMA.meta.MA_META.SHIP_TERM_CD);
	public static final MCMeta cred_cd_META = createCommonMeta($cred_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta mst_cst_itm_nm_META = createCommonMeta($mst_cst_itm_nm, mcframe.commonMA.meta.MA_META.BP_ITM_NM);
	public static final MCMeta mst_itm_nm_META = createCommonMeta($mst_itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta qtn_no_copy_flg_META = createCommonMeta($qtn_no_copy_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<Slo_BulkImp_Chk01_DtlR> constMetas = new ConstMetaList<Slo_BulkImp_Chk01_DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			peg_no_META,
			data_crud_typ_META,
			rtn_sts_typ_META,
			err_flg_META,
			sls_sts_typ_META,
			sls_sts_typ_nm_META,
			pr_sts_typ_META,
			pr_sts_typ_nm_META,
			alloc_sts_typ_META,
			alloc_sts_typ_nm_META,
			trd_cd_META,
			trd_nm_META,
			trd_ptn_typ_META,
			slo_no_META,
			slo_rev_META,
			slo_typ_META,
			slo_typ_nm_META,
			slo_dt_META,
			qtn_no_META,
			qtn_rev_META,
			qtn_aprv_flg_META,
			qtn_aprv_no_META,
			can_upd_flg_META,
			can_del_flg_META,
			slo_d_no_META,
			slo_d_rev_META,
			sim_alloc_pln_typ_META,
			sim_alloc_pln_typ_nm_META,
			cst_cd_META,
			cst_nm_META,
			cst_iv_flg_META,
			sls_basis_typ_META,
			sls_basis_typ_nm_META,
			sls_usr_cd_META,
			sls_usr_nm_META,
			sls_dpt_cd_META,
			sls_dpt_nm_META,
			wg_cd_META,
			wg_nm_META,
			assort_typ_META,
			assort_typ_nm_META,
			trd_cur_cd_META,
			trd_cur_nm_META,
			trd_cur_upri_dec_place_META,
			trd_cur_amt_dec_place_META,
			xrate_inpt_flg_META,
			xrate_META,
			base_cur_cd_META,
			base_cur_nm_META,
			base_cur_upri_META,
			base_cur_amt_META,
			base_cur_inc_tax_amt_META,
			base_cur_tax_amt_META,
			ptax_cur_cd_META,
			ptax_cur_nm_META,
			ptax_xrate_inpt_flg_META,
			ptax_xrate_META,
			ptax_cur_upri_META,
			ptax_cur_amt_META,
			ptax_cur_inc_tax_amt_META,
			ptax_cur_tax_amt_META,
			prof_rate_META,
			wrk_no_META,
			wrk_nm_META,
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
			iv_no_META,
			iv_num_flg_META,
			adv_ship_ctrl_typ_META,
			adv_ship_ctrl_typ_nm_META,
			adv_bill_amt_META,
			adv_rcv_amt_META,
			tterm_cd1_META,
			tterm_nm1_META,
			tterm_rmrks1_META,
			tterm_cd2_META,
			tterm_nm2_META,
			tterm_rmrks2_META,
			tterm_cd3_META,
			tterm_nm3_META,
			tterm_rmrks3_META,
			cst_po_no_META,
			cst_po_rev_META,
			acst_cd_META,
			acst_nm_META,
			ar_dpt_cd_META,
			ar_dpt_nm_META,
			rcpt_dt_META,
			rcpt_usr_cd_META,
			rcpt_usr_nm_META,
			cst_po_rmrks_META,
			trd_rmrks_META,
			intr_rmrks_META,
			sub_char1_META,
			sub_char2_META,
			sub_char3_META,
			edi_flg_META,
			cntry_cd_META,
			slo_upd_cntr_META,
			qtn_upd_cntr_META,
			sls_amt_rnd_typ_META,
			sls_tax_rnd_typ_META,
			amt_dec_place_META,
			is_src_batch_flg_META,
			edi_sub_char1_META,
			edi_sub_char2_META,
			edi_sub_char3_META,
			edi_sub_char4_META,
			edi_sub_char5_META,
			edi_sub_num1_META,
			edi_sub_dt1_META,
			aprv_flg_META,
			aprv_back_flg_META,
			aprv_no_META,
			aprv_sts_typ_META,
			aprv_sts_typ_nm_META,
			can_flg_META,
			can_rsn_cd_META,
			can_rsn_nm_META,
			can_rmrks_META,
			hdr_grp_no_META,
			hdr_err_flg_META,
			abort_flg_META,
			cst_itm_cd_META,
			cst_itm_nm_META,
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			itm_nm_META,
			comp_spec_typ_META,
			comp_spec_typ_nm_META,
			itm_comp_rev_no_META,
			iv_itm_nm_META,
			cntry_org_cd_META,
			cntry_org_nm_META,
			asset_mng_typ_META,
			asset_mng_typ_nm_META,
			vmi_flg_META,
			dscnt_itm_flg_META,
			alloc_margin_days_META,
			stk_mng_typ_META,
			sundry_itm_flg_META,
			trd_unit_cd_META,
			trd_unit_nm_META,
			trd_unit_qty_META,
			trd_unit_dec_place_META,
			trd_unit_conv_base_qty_META,
			trd_unit_conv_qty_META,
			upri_not_tgt_flg_META,
			trd_cur_upri_META,
			interim_flg_META,
			trd_cur_amt_META,
			trd_cur_inc_tax_amt_META,
			cost_upri_META,
			cost_amt_META,
			trd_cur_dscnt_amt_META,
			dscnt_rsn_cd_META,
			dscnt_rsn_nm_META,
			iv_upri_META,
			iv_amt_META,
			tax_fix_flg_META,
			tax_cd_META,
			tax_nm_META,
			tax_rate_META,
			inc_tax_flg_META,
			trd_cur_tax_amt_META,
			wtax_rate_META,
			wtax_amt_META,
			bill_crryovr_times_META,
			gd_cd_META,
			gd_nm_META,
			sno_num_flg_META,
			sno1_META,
			sno1_null_flg_META,
			sno2_META,
			sno2_null_flg_META,
			sno3_META,
			sno3_null_flg_META,
			sno4_META,
			sno4_null_flg_META,
			sno1_mng_typ_META,
			sno2_mng_typ_META,
			sno3_mng_typ_META,
			sno4_mng_typ_META,
			sno1_num_typ_META,
			sno2_num_typ_META,
			sno3_num_typ_META,
			sno4_num_typ_META,
			sno1_ptn_cd_META,
			sno2_ptn_cd_META,
			sno3_ptn_cd_META,
			sno4_ptn_cd_META,
			slo_sno1_flg_META,
			slo_sno2_flg_META,
			slo_sno3_flg_META,
			slo_sno4_flg_META,
			set_itm_grp_no_META,
			ship_rqst_tm_META,
			ship_rqst_dt_META,
			ship_rqst_hm_META,
			dlv_rqst_tm_META,
			dlv_rqst_dt_META,
			dlv_rqst_hm_META,
			pd_inst_dlv_dt_META,
			pd_inst_dlv_hm_META,
			accpt_schd_dt_META,
			sls_schd_dt_META,
			ship_schd_split_flg_META,
			ship_abl_flg_META,
			ship_schd_tm_META,
			ship_schd_dt_META,
			ship_schd_hm_META,
			dlv_schd_tm_META,
			dlv_schd_dt_META,
			dlv_schd_hm_META,
			dlv_cd_META,
			dlv_sundry_flg_META,
			dlv_nm_META,
			dlv_cntct_dpt_META,
			dlv_cntct_psn_META,
			dlv_zip_cd_META,
			dlv_addr1_META,
			dlv_addr2_META,
			dlv_addr3_META,
			dlv_addr4_META,
			dlv_tel_META,
			dlv_fax_META,
			dlv_cntry_cd_META,
			dlv_cntry_nm_META,
			dlv_lg_grp_cd_META,
			dlv_lg_grp_nm_META,
			pri_prnt_typ_META,
			pri_prnt_flg_META,
			dest_cd1_META,
			dest_nm1_META,
			dest_cd2_META,
			dest_nm2_META,
			dest_cd3_META,
			dest_nm3_META,
			tdlv_cd_META,
			tdlv_req_flg_META,
			tdlv_nm_META,
			via_dlv_typ_META,
			via_dlv_typ_nm_META,
			tdlv_sundry_flg_META,
			tdlv_cntct_dpt_META,
			tdlv_cntct_psn_META,
			tdlv_zip_cd_META,
			tdlv_addr1_META,
			tdlv_addr2_META,
			tdlv_addr3_META,
			tdlv_addr4_META,
			tdlv_tel_META,
			tdlv_fax_META,
			tdlv_cntry_cd_META,
			tdlv_cntry_nm_META,
			tdlv_lg_grp_cd_META,
			tdlv_lg_grp_nm_META,
			dlv_day_week_typ_META,
			dlv_day_week_typ_nm_META,
			sls_cststk_flg_META,
			proc_typ_META,
			proc_typ_nm_META,
			ship_inst_typ_META,
			ship_inst_typ_nm_META,
			ship_schd_split_typ_META,
			ship_schd_split_typ_nm_META,
			alloc_scope_typ_META,
			alloc_scope_typ_nm_META,
			not_lg_mix_flg_META,
			alloc_typ_META,
			alloc_typ_nm_META,
			rqst_to_loc_cd_META,
			rqst_to_loc_nm_META,
			sppl_cd_META,
			sppl_nm_META,
			maker_cd_META,
			maker_nm_META,
			rqst_dt_META,
			rqst_dlv_rqst_dt_META,
			rqst_prms_dt_META,
			rqst_prms_dlv_dt_META,
			wg_rqst_cnt_rmrks_META,
			rqst_to_wg_cd_META,
			alloc_grp_cd_META,
			alloc_grp_nm_META,
			ship_lg_grp_cd_META,
			ship_lg_grp_nm_META,
			def_loc_cd_META,
			def_loc_nm_META,
			loc_cd_META,
			loc_nm_META,
			str_ln_tgt_flg_META,
			str_ln_cd_META,
			str_ln_nm_META,
			str_ln_cd_none_flg_META,
			lot_no_META,
			sublot_no_META,
			not_lot_mix_flg_META,
			not_sublot_mix_flg_META,
			ver_flg_META,
			ver_no_META,
			ship_term_cd_META,
			ship_term_nm_META,
			ship_block_flg_META,
			ship_cnt_rmrks_META,
			cst_po_d_no_META,
			cst_po_d_rmrks_META,
			sls_rsn_cd_META,
			sls_rsn_nm_META,
			sls_acxfr_flg_META,
			bd_dpt_cd_META,
			bd_dpt_nm_META,
			sls_upri_req_typ_META,
			sls_upri_req_typ_nm_META,
			io_schd_pr_no_META,
			trd_d_rmrks_META,
			slo_d_intr_rmrks_META,
			slo_d_sub_char1_META,
			slo_d_sub_char2_META,
			slo_d_sub_char3_META,
			qtn_d_no_META,
			not_dt_calc_flg_META,
			edi_sub_d_char1_META,
			edi_sub_d_char2_META,
			edi_sub_d_char3_META,
			edi_sub_d_char4_META,
			edi_sub_d_char5_META,
			edi_sub_d_num1_META,
			edi_sub_d_dt1_META,
			slo_d_can_flg_META,
			slo_d_can_rsn_cd_META,
			slo_d_can_rsn_nm_META,
			slo_d_can_rmkrs_META,
			ship_pr_no_META,
			itm_ship_grp_cd_META,
			ship_pr_upd_cntr_META,
			hdr_peg_no_META,
			dtl_err_flg_META,
			upd_cntr_not_chk_flg_META,
			ship_cmpl_flg_META,
			sls_cmpl_flg_META,
			base_unit_cd_META,
			base_unit_nm_META,
			base_unit_qty_META,
			ship_pr_base_unit_qty_META,
			base_unit_dec_place_META,
			base_unit_rnd_typ_META,
			trd_unit_rnd_typ_META,
			pack_flg_META,
			prms_qty_META,
			dlv_inst_rcpt_qty_META,
			dlv_inst_prms_qty_META,
			alloc_qty_META,
			wait_qty_META,
			ship_inst_qty_META,
			ship_act_qty_META,
			iv_schd_qty_META,
			iv_act_qty_META,
			sls_qty_META,
			ship_ret_qty_META,
			re_ship_schd_qty_META,
			fix_flg_META,
			re_ship_schd_flg_META,
			ship_schd_abort_qty_META,
			sls_schd_abort_qty_META,
			prms_dt_META,
			dlv_inst_rcpt_dt_META,
			dlv_inst_prms_dt_META,
			dlv_inst_dt_META,
			dlv_inst_hm_META,
			prms_dlv_dt_META,
			not_dlv_qty_META,
			overdue_prspct_qty_META,
			ship_pr_rate_META,
			sls_pr_rate_META,
			ship_dt_META,
			ship_hm_META,
			dlv_dt_META,
			dlv_hm_META,
			act_dlv_lt_META,
			sls_dt_META,
			dlv_qty_META,
			dlv_rqst_dt_overdue_act_flg_META,
			prms_dlv_dt_overdue_act_flg_META,
			disp_seq_META,
			bd_dpt_flg_META,
			cst_ship_schd_split_typ_META,
			cst_sls_basis_typ_META,
			cst_sls_usr_cd_META,
			cst_sls_dpt_cd_META,
			cst_ar_dpt_cd_META,
			cst_bill_crryovr_times_META,
			cst_sls_upri_req_typ_META,
			cst_sls_upri_cng_flg_META,
			ar_dpt_typ_META,
			cst_trd_cur_cd_META,
			cst_upri_dec_place_META,
			cst_amt_dec_place_META,
			upri_dec_place_META,
			mst_dlv_nm_META,
			mst_dlv_cntct_dpt_META,
			mst_dlv_cntct_psn_META,
			mst_dlv_zip_cd_META,
			mst_dlv_addr1_META,
			mst_dlv_addr2_META,
			mst_dlv_addr3_META,
			mst_dlv_addr4_META,
			mst_dlv_tel_META,
			mst_dlv_fax_META,
			mst_dlv_lg_grp_cd_META,
			prnt_lcl_cd_META,
			mst_tdlv_nm_META,
			mst_tdlv_cntct_dpt_META,
			mst_tdlv_cntct_psn_META,
			mst_tdlv_zip_cd_META,
			mst_tdlv_addr1_META,
			mst_tdlv_addr2_META,
			mst_tdlv_addr3_META,
			mst_tdlv_addr4_META,
			mst_tdlv_tel_META,
			mst_tdlv_fax_META,
			mst_tdlv_lg_grp_cd_META,
			mst_via_dlv_typ_META,
			mst_trd_cur_upri_META,
			mst_interim_flg_META,
			mid_loc_cd_META,
			loc_wg_cd_META,
			tax_typ_META,
			itm_bill_crryovr_times_META,
			itm_sls_upri_cng_flg_META,
			itm_cntry_org_cd_META,
			lot_mng_typ_META,
			sublot_mng_typ_META,
			slo_proc_flg_META,
			itm_trd_unit_cd_META,
			itm_proc_typ_META,
			itm_ship_inst_typ_META,
			itm_ship_term_cd_META,
			cred_cd_META,
			mst_cst_itm_nm_META,
			mst_itm_nm_META,
			qtn_no_copy_flg_META
		},
		new String[][]{
			{
			},
			{
			}
		}
	);

	/** 項目属性情報のグループ[REQ_UPD_CNT_CHK]のキー定数 */
	public static final String $$REQ_UPD_CNT_CHK = "REQ_UPD_CNT_CHK";
	/** 項目属性情報のグループ[REQUIRED]のキー定数 */
	public static final String $$REQUIRED = "REQUIRED";
	/** 項目属性情報のグループ[CHK_NUM]のキー定数 */
	public static final String $$CHK_NUM = "CHK_NUM";
	/** 項目属性情報のグループ[SMALL_LARGE]のキー定数 */
	public static final String $$SMALL_LARGE = "SMALL_LARGE";
	/** 項目属性情報のグループ[CHK_DT]のキー定数 */
	public static final String $$CHK_DT = "CHK_DT";
	/** 項目属性情報のグループ[BEFORE_AFTER]のキー定数 */
	public static final String $$BEFORE_AFTER = "BEFORE_AFTER";
	/** 項目属性情報のグループ[CHK_PTN]のキー定数 */
	public static final String $$CHK_PTN = "CHK_PTN";
	/** 項目属性情報のグループ[DUPLICATE]のキー定数 */
	public static final String $$DUPLICATE = "DUPLICATE";
	/** 項目属性情報のグループ[TOO_MANY_INPUTS]のキー定数 */
	public static final String $$TOO_MANY_INPUTS = "TOO_MANY_INPUTS";
	/** 項目属性情報のグループ[AT_LEAST_ONE]のキー定数 */
	public static final String $$AT_LEAST_ONE = "AT_LEAST_ONE";
	/** 項目属性情報のグループ[ONLY_ONE_INPUT]のキー定数 */
	public static final String $$ONLY_ONE_INPUT = "ONLY_ONE_INPUT";
	/** 項目属性情報のグループ[LIST_LOGIC]のキー定数 */
	public static final String $$LIST_LOGIC = "LIST_LOGIC";
	/** 項目属性情報のグループ[LIST_OUT]のキー定数 */
	public static final String $$LIST_OUT = "LIST_OUT";
	/** 項目属性情報のグループ[LIST_OUT_BASE]のキー定数 */
	public static final String $$LIST_OUT_BASE = "LIST_OUT_BASE";
	/** 項目属性情報のグループ[LIST_IN]のキー定数 */
	public static final String $$LIST_IN = "LIST_IN";
	/** 項目属性情報のグループ[LIST_IN_BASE]のキー定数 */
	public static final String $$LIST_IN_BASE = "LIST_IN_BASE";
	/** 項目属性情報のグループ[CONST]のキー定数 */
	public static final String $$CONST = "CONST";
	/** 項目属性情報のグループ[NULL_VAL]のキー定数 */
	public static final String $$NULL_VAL = "NULL_VAL";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$REQ_UPD_CNT_CHK, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$REQUIRED, new MCExtList(
			new String[][]{
				{$trd_cd, "E"},	// trd_cd
				{$cst_cd, "E"},	// cst_cd
				{$trd_unit_qty, "E"},	// trd_unit_qty
				{$dlv_cd, "E"}	// dlv_cd
			}
		)),
		new MCExtMap.Entry($$CHK_NUM, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$SMALL_LARGE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$CHK_DT, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$BEFORE_AFTER, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$CHK_PTN, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$DUPLICATE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$TOO_MANY_INPUTS, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$AT_LEAST_ONE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$ONLY_ONE_INPUT, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$LIST_LOGIC, new MCExtList(
			new String[][]{
				{$trd_cd, "MA.MAUAL0010.Trd"},	// trd_cd
				{$cst_cd, "MA.MAUAL0010.Bp"},	// cst_cd
				{$sls_usr_cd, "MA.MAUAL0010.Usr"},	// sls_usr_cd
				{$sls_dpt_cd, "MA.MAUAL0010.Dpt"},	// sls_dpt_cd
				{$trd_cur_cd, "MA.MAUAL0010.Cur"},	// trd_cur_cd
				{$wrk_no, "MS.MSUAL0030.WrkNo"},	// wrk_no
				{$trnspt_cd, "MA.MAUAL0010.Trnspt"},	// trnspt_cd
				{$load_port_cd, "MA.MAUAL0010.EximPort"},	// load_port_cd
				{$dschrg_port_cd, "MA.MAUAL0010.EximPort"},	// dschrg_port_cd
				{$via_port_cd, "MA.MAUAL0010.EximPort"},	// via_port_cd
				{$tterm_cd1, "MA.MAUAL0010.Tterm1"},	// tterm_cd1
				{$tterm_cd2, "MA.MAUAL0010.Tterm2"},	// tterm_cd2
				{$tterm_cd3, "MA.MAUAL0010.Tterm3"},	// tterm_cd3
				{$ar_dpt_cd, "MA.MAUAL0010.Dpt"},	// ar_dpt_cd
				{$rcpt_usr_cd, "MA.MAUAL0010.Usr"},	// rcpt_usr_cd
				{$cst_itm_cd, "MS.MSUAL0010.CstItm"},	// cst_itm_cd
				{$itm_sub3, "MA.MAUAL0010.ItmSub3"},	// itm_sub3
				{$cntry_org_cd, "MA.MAUAL0010.Cntry"},	// cntry_org_cd
				{$trd_unit_cd, "MA.MAUAL0010.ItmUnit"},	// trd_unit_cd
				{$dscnt_rsn_cd, "MA.MAUAL0010.SlsDscntBizRsn"},	// dscnt_rsn_cd
				{$tax_cd, "MA.MAUAL0010.SlsTax"},	// tax_cd
				{$gd_cd, "MA.MAUAL0010.SloStkGd"},	// gd_cd
				{$dlv_cd, "MA.MAUAL0010.Bp"},	// dlv_cd
				{$dlv_lg_grp_cd, "MA.MAUAL0010.LgGrp"},	// dlv_lg_grp_cd
				{$dest_cd1, "MA.MAUAL0010.Bp"},	// dest_cd1
				{$dest_cd2, "MA.MAUAL0010.Bp"},	// dest_cd2
				{$dest_cd3, "MA.MAUAL0010.Bp"},	// dest_cd3
				{$tdlv_cd, "MA.MAUAL0010.Bp"},	// tdlv_cd
				{$tdlv_lg_grp_cd, "MA.MAUAL0010.LgGrp"},	// tdlv_lg_grp_cd
				{$rqst_to_loc_cd, "MA.MAUAL0010.Loc"},	// rqst_to_loc_cd
				{$sppl_cd, "MA.MAUAL0010.Bp"},	// sppl_cd
				{$maker_cd, "MA.MAUAL0010.Bp"},	// maker_cd
				{$alloc_grp_cd, "MA.MAUAL0010.AllocGrp"},	// alloc_grp_cd
				{$ship_lg_grp_cd, "MA.MAUAL0010.LgGrp"},	// ship_lg_grp_cd
				{$loc_cd, "MA.MAUAL0010.Loc"},	// loc_cd
				{$str_ln_cd, "MA.MAUAL0010.StrLn"},	// str_ln_cd
				{$ship_term_cd, "MA.MAUAL0010.ShipTerm"},	// ship_term_cd
				{$sls_rsn_cd, "MA.MAUAL0010.SlsBizRsn"},	// sls_rsn_cd
				{$bd_dpt_cd, "MA.MAUAL0010.Dpt"}	// bd_dpt_cd
			}
		)),
		new MCExtMap.Entry($$LIST_OUT, new MCExtList(
			new String[][]{
				{$trd_cd, "trd_nm;trd_ptn_typ"},	// trd_cd
				{$cst_cd, "cst_nm;cst_iv_flg;cst_sls_basis_typ;cst_trd_cur_cd;cst_upri_dec_place;cst_amt_dec_place;sls_amt_rnd_typ;sls_tax_rnd_typ;cst_ar_dpt_cd;cst_bill_crryovr_times;cst_ship_schd_split_typ;cst_sls_upri_req_typ;cst_sls_upri_cng_flg;cst_sls_usr_cd;cst_sls_dpt_cd;ar_dpt_typ;acst_cd;acst_nm;cred_cd;not_lg_mix_flg;not_lot_mix_flg;not_sublot_mix_flg"},	// cst_cd
				{$sls_usr_cd, "sls_usr_nm;sls_usr_def_dpt_cd"},	// sls_usr_cd
				{$sls_dpt_cd, "sls_dpt_nm;wg_cd;wg_nm"},	// sls_dpt_cd
				{$trd_cur_cd, "trd_cur_nm;upri_dec_place;amt_dec_place"},	// trd_cur_cd
				{$wrk_no, "wrk_nm"},	// wrk_no
				{$trnspt_cd, "trnspt_nm"},	// trnspt_cd
				{$load_port_cd, "load_port_nm"},	// load_port_cd
				{$dschrg_port_cd, "dschrg_port_nm"},	// dschrg_port_cd
				{$via_port_cd, "via_port_nm"},	// via_port_cd
				{$tterm_cd1, "tterm_nm1"},	// tterm_cd1
				{$tterm_cd2, "tterm_nm2"},	// tterm_cd2
				{$tterm_cd3, "tterm_nm3"},	// tterm_cd3
				{$ar_dpt_cd, "ar_dpt_nm"},	// ar_dpt_cd
				{$rcpt_usr_cd, "rcpt_usr_nm"},	// rcpt_usr_cd
				{$cst_itm_cd, "mst_cst_itm_nm;itm_cd;itm_sub1;itm_sub2;itm_sub3"},	// cst_itm_cd
				{$itm_sub3, "mst_itm_nm;sundry_itm_flg;dscnt_itm_flg;stk_mng_typ;itm_cntry_org_cd;asset_mng_typ;itm_trd_unit_cd;itm_bill_crryovr_times;itm_sls_upri_cng_flg;itm_proc_typ;slo_proc_flg;itm_ship_inst_typ;itm_ship_term_cd;sno1_mng_typ;sno2_mng_typ;sno3_mng_typ;sno4_mng_typ;sno1_num_typ;sno2_num_typ;sno3_num_typ;sno4_num_typ;slo_sno1_flg;slo_sno2_flg;slo_sno3_flg;slo_sno4_flg;sno1_ptn_cd;sno2_ptn_cd;sno3_ptn_cd;sno4_ptn_cd;itm_ship_grp_cd;ver_flg;lot_mng_typ;sublot_mng_typ;base_unit_cd;base_unit_nm"},	// itm_sub3
				{$cntry_org_cd, "cntry_org_nm"},	// cntry_org_cd
				{$trd_unit_cd, "trd_unit_nm;trd_unit_dec_place"},	// trd_unit_cd
				{$dscnt_rsn_cd, "dscnt_rsn_nm"},	// dscnt_rsn_cd
				{$tax_cd, "tax_nm;tax_rate;tax_typ;inc_tax_flg"},	// tax_cd
				{$gd_cd, "gd_nm"},	// gd_cd
				{$dlv_cd, "mst_dlv_nm;dlv_sundry_flg;pri_prnt_flg;mst_dlv_zip_cd;mst_dlv_addr1;mst_dlv_addr2;mst_dlv_addr3;mst_dlv_addr4;dlv_cntry_cd;dlv_cntry_nm;mst_dlv_tel;mst_dlv_fax;mst_dlv_cntct_dpt;mst_dlv_cntct_psn;mst_dlv_lg_grp_cd;tdlv_req_flg;prnt_lcl_cd"},	// dlv_cd
				{$dlv_lg_grp_cd, "dlv_lg_grp_nm"},	// dlv_lg_grp_cd
				{$dest_cd1, "dest_nm1"},	// dest_cd1
				{$dest_cd2, "dest_nm2"},	// dest_cd2
				{$dest_cd3, "dest_nm3"},	// dest_cd3
				{$tdlv_cd, "mst_tdlv_nm;tdlv_sundry_flg;mst_tdlv_lg_grp_cd;mst_tdlv_zip_cd;mst_tdlv_addr1;mst_tdlv_addr2;mst_tdlv_addr3;mst_tdlv_addr4;mst_tdlv_tel;mst_tdlv_fax;mst_tdlv_cntct_dpt;mst_tdlv_cntct_psn;mst_via_dlv_typ;tdlv_cntry_cd"},	// tdlv_cd
				{$tdlv_lg_grp_cd, "tdlv_lg_grp_nm"},	// tdlv_lg_grp_cd
				{$rqst_to_loc_cd, "rqst_to_loc_nm"},	// rqst_to_loc_cd
				{$sppl_cd, "sppl_nm"},	// sppl_cd
				{$maker_cd, "maker_nm"},	// maker_cd
				{$alloc_grp_cd, "alloc_grp_nm"},	// alloc_grp_cd
				{$ship_lg_grp_cd, "ship_lg_grp_nm"},	// ship_lg_grp_cd
				{$loc_cd, "loc_nm;str_ln_tgt_flg"},	// loc_cd
				{$str_ln_cd, "str_ln_nm"},	// str_ln_cd
				{$ship_term_cd, "ship_term_nm"},	// ship_term_cd
				{$sls_rsn_cd, "sls_rsn_nm;sls_acxfr_flg"},	// sls_rsn_cd
				{$bd_dpt_cd, "bd_dpt_nm"}	// bd_dpt_cd
			}
		)),
		new MCExtMap.Entry($$LIST_OUT_BASE, new MCExtList(
			new String[][]{
				{$cst_cd, "bp_nm;cst_iv_flg;sls_basis_typ;cur_cd;upri_dec_place;amt_dec_place;sls_amt_rnd_typ;sls_tax_rnd_typ;ar_dpt_cd;bill_crryovr_times;ship_schd_split_typ;sls_upri_req_typ;sls_upri_cng_flg;cst_usr_cd;cst_dpt_cd;ar_dpt_typ;acst_cd;acst_nm;ar_cred_cd;not_lg_mix_flg;not_lot_mix_flg;not_sublot_mix_flg"},	// cst_cd
				{$sls_usr_cd, "usr_nm;dpt_cd"},	// sls_usr_cd
				{$sls_dpt_cd, "dpt_nm;wg_cd;wg_nm"},	// sls_dpt_cd
				{$trd_cur_cd, "cur_nm;upri_dec_place;amt_dec_place"},	// trd_cur_cd
				{$wrk_no, "wrk_nm"},	// wrk_no
				{$trnspt_cd, "trnspt_nm"},	// trnspt_cd
				{$load_port_cd, "port_nm"},	// load_port_cd
				{$dschrg_port_cd, "port_nm"},	// dschrg_port_cd
				{$via_port_cd, "port_nm"},	// via_port_cd
				{$tterm_cd1, "tterm_nm"},	// tterm_cd1
				{$tterm_cd2, "tterm_nm"},	// tterm_cd2
				{$tterm_cd3, "tterm_nm"},	// tterm_cd3
				{$ar_dpt_cd, "dpt_nm"},	// ar_dpt_cd
				{$rcpt_usr_cd, "usr_nm"},	// rcpt_usr_cd
				{$cst_itm_cd, "bp_itm_nm;itm_cd;itm_sub1;itm_sub2;itm_sub3"},	// cst_itm_cd
				{$itm_sub3, "itm_nm;sundry_itm_flg;dscnt_itm_flg;stk_mng_typ;cntry_org_cd;asset_mng_typ;ship_unit_cd;bill_crryovr_times;sls_upri_cng_flg;slo_proc_typ;slo_proc_flg;ship_inst_typ;ship_term_cd;sno1_mng_typ;sno2_mng_typ;sno3_mng_typ;sno4_mng_typ;sno1_num_typ;sno2_num_typ;sno3_num_typ;sno4_num_typ;slo_sno1_flg;slo_sno2_flg;slo_sno3_flg;slo_sno4_flg;sno1_ptn_cd;sno2_ptn_cd;sno3_ptn_cd;sno4_ptn_cd;itm_ship_grp_cd;ver_flg;lot_mng_typ;sublot_mng_typ;unit_cd;unit_nm"},	// itm_sub3
				{$cntry_org_cd, "cntry_nm"},	// cntry_org_cd
				{$trd_unit_cd, "unit_nm;dec_place"},	// trd_unit_cd
				{$dscnt_rsn_cd, "biz_rsn_nm"},	// dscnt_rsn_cd
				{$dlv_cd, "bp_nm;dlv_sundry_flg;pri_prnt_flg;zip_cd;addr1;addr2;addr3;addr4;cntry_cd;cntry_nm;tel;fax;dlv_cntct_dpt;dlv_cntct_psn;lg_grp_cd;tdlv_req_flg;prnt_lcl_cd"},	// dlv_cd
				{$dlv_lg_grp_cd, "lg_grp_nm"},	// dlv_lg_grp_cd
				{$dest_cd1, "bp_nm"},	// dest_cd1
				{$dest_cd2, "bp_nm"},	// dest_cd2
				{$dest_cd3, "bp_nm"},	// dest_cd3
				{$tdlv_cd, "bp_nm;dlv_sundry_flg;lg_grp_cd;zip_cd;addr1;addr2;addr3;addr4;tel;fax;dlv_cntct_dpt;dlv_cntct_psn;via_dlv_typ;cntry_cd"},	// tdlv_cd
				{$tdlv_lg_grp_cd, "lg_grp_nm"},	// tdlv_lg_grp_cd
				{$rqst_to_loc_cd, "loc_nm"},	// rqst_to_loc_cd
				{$sppl_cd, "bp_nm"},	// sppl_cd
				{$maker_cd, "bp_nm"},	// maker_cd
				{$alloc_grp_cd, "alloc_grp_nm"},	// alloc_grp_cd
				{$ship_lg_grp_cd, "lg_grp_nm"},	// ship_lg_grp_cd
				{$loc_cd, "loc_nm;str_ln_tgt_flg"},	// loc_cd
				{$str_ln_cd, "str_ln_nm"},	// str_ln_cd
				{$ship_term_cd, "ship_term_nm"},	// ship_term_cd
				{$sls_rsn_cd, "biz_rsn_nm;sls_acxfr_flg"},	// sls_rsn_cd
				{$bd_dpt_cd, "dpt_nm"}	// bd_dpt_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$cst_cd, "MAC_BP_IS_SRCH_TYP.CST_NOT_SUNDRY;slo_dt"},	// cst_cd
				{$sls_dpt_cd, "slo_dt;MAC_DPT_IS_SRCH_TYP.SLS;sls_usr_cd"},	// sls_dpt_cd
				{$ar_dpt_cd, "MAC_DPT_IS_SRCH_TYP.AR;slo_dt"},	// ar_dpt_cd
				{$cst_itm_cd, "cst_cd;cst_nm;slo_dt"},	// cst_itm_cd
				{$itm_sub3, "MAC_ITM_IS_SRCH_TYP.NOT_ASSET3;itm_cd;itm_sub1;itm_sub2"},	// itm_sub3
				{$trd_unit_cd, "itm_cd;itm_sub1;itm_sub2;itm_sub3"},	// trd_unit_cd
				{$dlv_cd, "MAC_BP_IS_SRCH_TYP.DLV;slo_dt"},	// dlv_cd
				{$dest_cd1, "MAC_BP_IS_SRCH_TYP.DEST"},	// dest_cd1
				{$dest_cd2, "MAC_BP_IS_SRCH_TYP.DEST"},	// dest_cd2
				{$dest_cd3, "MAC_BP_IS_SRCH_TYP.DEST"},	// dest_cd3
				{$tdlv_cd, "MAC_BP_IS_SRCH_TYP.TDLV;slo_dt"},	// tdlv_cd
				{$rqst_to_loc_cd, "MAC_LOC_IS_SRCH_TYP.COMM"},	// rqst_to_loc_cd
				{$sppl_cd, "MAC_BP_IS_SRCH_TYP.SPPL"},	// sppl_cd
				{$maker_cd, "MAC_BP_IS_SRCH_TYP.MAKER;true"},	// maker_cd
				{$loc_cd, "MAC_LOC_IS_SRCH_TYP.COMM"},	// loc_cd
				{$str_ln_cd, "loc_cd;true"},	// str_ln_cd
				{$bd_dpt_cd, "MAC_DPT_IS_SRCH_TYP.BD;slo_dt"}	// bd_dpt_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$cst_cd, "bp_is_srch_typ;dt"},	// cst_cd
				{$sls_dpt_cd, "dt;dpt_is_srch_typ;usr_cd"},	// sls_dpt_cd
				{$ar_dpt_cd, "dpt_is_srch_typ;dt"},	// ar_dpt_cd
				{$cst_itm_cd, "bp_cd;bp_nm;dt"},	// cst_itm_cd
				{$itm_sub3, "itm_is_srch_typ;itm_cd;itm_sub1;itm_sub2"},	// itm_sub3
				{$dlv_cd, "bp_is_srch_typ;dt"},	// dlv_cd
				{$dest_cd1, "bp_is_srch_typ"},	// dest_cd1
				{$dest_cd2, "bp_is_srch_typ"},	// dest_cd2
				{$dest_cd3, "bp_is_srch_typ"},	// dest_cd3
				{$tdlv_cd, "bp_is_srch_typ;dt"},	// tdlv_cd
				{$rqst_to_loc_cd, "loc_is_srch_typ"},	// rqst_to_loc_cd
				{$sppl_cd, "bp_is_srch_typ"},	// sppl_cd
				{$maker_cd, "bp_is_srch_typ;mode_nullval_flg"},	// maker_cd
				{$loc_cd, "loc_is_srch_typ"},	// loc_cd
				{$str_ln_cd, "loc_cd;mode_nullval_flg"},	// str_ln_cd
				{$bd_dpt_cd, "dpt_is_srch_typ;dt"}	// bd_dpt_cd
			}
		)),
		new MCExtMap.Entry($$CONST, new MCExtList(
			new String[][]{
				{$alloc_sts_typ, "MSC_ALLOC_STS_TYP"},	// alloc_sts_typ
				{$slo_typ, "MSC_SLO_TYP"},	// slo_typ
				{$sls_basis_typ, "MAC_SLS_BASIS_TYP"},	// sls_basis_typ
				{$assort_typ, "MSC_SHIP_ASSORT_TYP"},	// assort_typ
				{$adv_ship_ctrl_typ, "MSC_ADV_SHIP_CTRL_TYP"},	// adv_ship_ctrl_typ
				{$asset_mng_typ, "MAC_ASSET_MNG_TYP"},	// asset_mng_typ
				{$pri_prnt_typ, "MAC_PRI_PRNT_TYP"},	// pri_prnt_typ
				{$via_dlv_typ, "MAC_VIA_DLV_TYP"},	// via_dlv_typ
				{$dlv_day_week_typ, "MAC_DAY_WEEK_TYP"},	// dlv_day_week_typ
				{$proc_typ, "MAC_SLO_PROC_TYP"},	// proc_typ
				{$ship_inst_typ, "MAC_SHIP_INST_TYP"},	// ship_inst_typ
				{$ship_schd_split_typ, "MAC_SHIP_SCHD_SPLIT_TYP"},	// ship_schd_split_typ
				{$alloc_scope_typ, "MAC_ALLOC_SCOPE_TYP"},	// alloc_scope_typ
				{$alloc_typ, "MAC_ALLOC_TYP"},	// alloc_typ
				{$sls_upri_req_typ, "MAC_SLS_UPRI_REQ_TYP"}	// sls_upri_req_typ
			}
		)),
		new MCExtMap.Entry($$NULL_VAL, new MCExtList(
			new String[][]{
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
	protected Slo_BulkImp_Chk01_DtlR_MC_A(ConstMetaList<? extends Slo_BulkImp_Chk01_DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Slo_BulkImp_Chk01_DtlR clone() {
		return (Slo_BulkImp_Chk01_DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Slo_BulkImp_Chk01_DtlR createInstance() {
		return (Slo_BulkImp_Chk01_DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Slo_BulkImp_Chk01_DtlR getValues(String... names) {
		return (Slo_BulkImp_Chk01_DtlR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public MCNumber peg_no() {
		return getConstNumber(offset + 0, $peg_no);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(MCNumber value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(int value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(long value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(float value) {
		setConstNumber(offset + 0, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(double value) {
		setConstNumber(offset + 0, $peg_no, value);
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
	 * Process result status type 処理結果状況区分.<p>
	 *
	 */
	public String rtn_sts_typ() {
		return getConstString(offset + 2, $rtn_sts_typ);
	}

	/**
	 * Process result status type 処理結果状況区分.<p>
	 *
	 */
	public void rtn_sts_typ(String value) {
		setConstString(offset + 2, $rtn_sts_typ, value);
	}


	/**
	 * Error エラー.<p>
	 *
	 */
	public boolean err_flg() {
		return getConstBoolean(offset + 3, $err_flg);
	}

	/**
	 * Error エラー.<p>
	 *
	 */
	public void err_flg(boolean value) {
		setConstBoolean(offset + 3, $err_flg, value);
	}


	/**
	 * Sales status type 販売状況区分.<p>
	 *
	 */
	public String sls_sts_typ() {
		return getConstString(offset + 4, $sls_sts_typ);
	}

	/**
	 * Sales status type 販売状況区分.<p>
	 *
	 */
	public void sls_sts_typ(String value) {
		setConstString(offset + 4, $sls_sts_typ, value);
	}


	/**
	 * Sales status type name 販売状況区分名.<p>
	 *
	 */
	public String sls_sts_typ_nm() {
		return getConstString(offset + 5, $sls_sts_typ_nm);
	}

	/**
	 * Sales status type name 販売状況区分名.<p>
	 *
	 */
	public void sls_sts_typ_nm(String value) {
		setConstString(offset + 5, $sls_sts_typ_nm, value);
	}


	/**
	 * Shipping progress status type 出荷進捗状況区分.<p>
	 *
	 */
	public String pr_sts_typ() {
		return getConstString(offset + 6, $pr_sts_typ);
	}

	/**
	 * Shipping progress status type 出荷進捗状況区分.<p>
	 *
	 */
	public void pr_sts_typ(String value) {
		setConstString(offset + 6, $pr_sts_typ, value);
	}


	/**
	 * Shipping progress status type name 出荷進捗状況区分名.<p>
	 *
	 */
	public String pr_sts_typ_nm() {
		return getConstString(offset + 7, $pr_sts_typ_nm);
	}

	/**
	 * Shipping progress status type name 出荷進捗状況区分名.<p>
	 *
	 */
	public void pr_sts_typ_nm(String value) {
		setConstString(offset + 7, $pr_sts_typ_nm, value);
	}


	/**
	 * Allocation status type 引当状況区分.<p>
	 *
	 */
	public String alloc_sts_typ() {
		return getConstString(offset + 8, $alloc_sts_typ);
	}

	/**
	 * Allocation status type 引当状況区分.<p>
	 *
	 */
	public void alloc_sts_typ(String value) {
		setConstString(offset + 8, $alloc_sts_typ, value);
	}


	/**
	 * Allocation status type name 引当状況区分名.<p>
	 *
	 */
	public String alloc_sts_typ_nm() {
		return getConstString(offset + 9, $alloc_sts_typ_nm);
	}

	/**
	 * Allocation status type name 引当状況区分名.<p>
	 *
	 */
	public void alloc_sts_typ_nm(String value) {
		setConstString(offset + 9, $alloc_sts_typ_nm, value);
	}


	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public String trd_cd() {
		return getConstString(offset + 10, $trd_cd);
	}

	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public void trd_cd(String value) {
		setConstString(offset + 10, $trd_cd, value);
	}


	/**
	 * Transaction name 取引名.<p>
	 *
	 */
	public String trd_nm() {
		return getConstString(offset + 11, $trd_nm);
	}

	/**
	 * Transaction name 取引名.<p>
	 *
	 */
	public void trd_nm(String value) {
		setConstString(offset + 11, $trd_nm, value);
	}


	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public String trd_ptn_typ() {
		return getConstString(offset + 12, $trd_ptn_typ);
	}

	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public void trd_ptn_typ(String value) {
		setConstString(offset + 12, $trd_ptn_typ, value);
	}


	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public String slo_no() {
		return getConstString(offset + 13, $slo_no);
	}

	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public void slo_no(String value) {
		setConstString(offset + 13, $slo_no, value);
	}


	/**
	 * Rev. number 改訂番号.<p>
	 *
	 */
	public MCNumber slo_rev() {
		return getConstNumber(offset + 14, $slo_rev);
	}

	/**
	 * Rev. number 改訂番号.<p>
	 *
	 */
	public void slo_rev(MCNumber value) {
		setConstNumber(offset + 14, $slo_rev, value);
	}

	/**
	 * Rev. number 改訂番号.<p>
	 *
	 */
	public void slo_rev(int value) {
		setConstNumber(offset + 14, $slo_rev, value);
	}

	/**
	 * Rev. number 改訂番号.<p>
	 *
	 */
	public void slo_rev(long value) {
		setConstNumber(offset + 14, $slo_rev, value);
	}

	/**
	 * Rev. number 改訂番号.<p>
	 *
	 */
	public void slo_rev(float value) {
		setConstNumber(offset + 14, $slo_rev, value);
	}

	/**
	 * Rev. number 改訂番号.<p>
	 *
	 */
	public void slo_rev(double value) {
		setConstNumber(offset + 14, $slo_rev, value);
	}


	/**
	 * Sales order type 受注区分.<p>
	 *
	 */
	public String slo_typ() {
		return getConstString(offset + 15, $slo_typ);
	}

	/**
	 * Sales order type 受注区分.<p>
	 *
	 */
	public void slo_typ(String value) {
		setConstString(offset + 15, $slo_typ, value);
	}


	/**
	 * Sales order type name 受注区分名.<p>
	 *
	 */
	public String slo_typ_nm() {
		return getConstString(offset + 16, $slo_typ_nm);
	}

	/**
	 * Sales order type name 受注区分名.<p>
	 *
	 */
	public void slo_typ_nm(String value) {
		setConstString(offset + 16, $slo_typ_nm, value);
	}


	/**
	 * Sales order date 受注日.<p>
	 *
	 */
	public MCDate slo_dt() {
		return getConstDate(offset + 17, $slo_dt);
	}

	/**
	 * Sales order date 受注日.<p>
	 *
	 */
	public void slo_dt(MCDate value) {
		setConstDate(offset + 17, $slo_dt, value);
	}


	/**
	 * Quotation No. 見積ＮＯ.<p>
	 *
	 */
	public String qtn_no() {
		return getConstString(offset + 18, $qtn_no);
	}

	/**
	 * Quotation No. 見積ＮＯ.<p>
	 *
	 */
	public void qtn_no(String value) {
		setConstString(offset + 18, $qtn_no, value);
	}


	/**
	 * Quotation rev. number 見積改訂番号.<p>
	 *
	 */
	public MCNumber qtn_rev() {
		return getConstNumber(offset + 19, $qtn_rev);
	}

	/**
	 * Quotation rev. number 見積改訂番号.<p>
	 *
	 */
	public void qtn_rev(MCNumber value) {
		setConstNumber(offset + 19, $qtn_rev, value);
	}

	/**
	 * Quotation rev. number 見積改訂番号.<p>
	 *
	 */
	public void qtn_rev(int value) {
		setConstNumber(offset + 19, $qtn_rev, value);
	}

	/**
	 * Quotation rev. number 見積改訂番号.<p>
	 *
	 */
	public void qtn_rev(long value) {
		setConstNumber(offset + 19, $qtn_rev, value);
	}

	/**
	 * Quotation rev. number 見積改訂番号.<p>
	 *
	 */
	public void qtn_rev(float value) {
		setConstNumber(offset + 19, $qtn_rev, value);
	}

	/**
	 * Quotation rev. number 見積改訂番号.<p>
	 *
	 */
	public void qtn_rev(double value) {
		setConstNumber(offset + 19, $qtn_rev, value);
	}


	/**
	 * For quotation approval 見積承認対象.<p>
	 *
	 */
	public boolean qtn_aprv_flg() {
		return getConstBoolean(offset + 20, $qtn_aprv_flg);
	}

	/**
	 * For quotation approval 見積承認対象.<p>
	 *
	 */
	public void qtn_aprv_flg(boolean value) {
		setConstBoolean(offset + 20, $qtn_aprv_flg, value);
	}


	/**
	 * Quotation approval No. 見積承認ＮＯ.<p>
	 *
	 */
	public String qtn_aprv_no() {
		return getConstString(offset + 21, $qtn_aprv_no);
	}

	/**
	 * Quotation approval No. 見積承認ＮＯ.<p>
	 *
	 */
	public void qtn_aprv_no(String value) {
		setConstString(offset + 21, $qtn_aprv_no, value);
	}


	/**
	 * Updatable 更新可能.<p>
	 *
	 */
	public boolean can_upd_flg() {
		return getConstBoolean(offset + 22, $can_upd_flg);
	}

	/**
	 * Updatable 更新可能.<p>
	 *
	 */
	public void can_upd_flg(boolean value) {
		setConstBoolean(offset + 22, $can_upd_flg, value);
	}


	/**
	 * Cancellable 取消可能.<p>
	 *
	 */
	public boolean can_del_flg() {
		return getConstBoolean(offset + 23, $can_del_flg);
	}

	/**
	 * Cancellable 取消可能.<p>
	 *
	 */
	public void can_del_flg(boolean value) {
		setConstBoolean(offset + 23, $can_del_flg, value);
	}


	/**
	 * Sales order details No. 受注明細ＮＯ.<p>
	 *
	 */
	public String slo_d_no() {
		return getConstString(offset + 24, $slo_d_no);
	}

	/**
	 * Sales order details No. 受注明細ＮＯ.<p>
	 *
	 */
	public void slo_d_no(String value) {
		setConstString(offset + 24, $slo_d_no, value);
	}


	/**
	 * Rev. number (Order details) 改訂番号（受注明細）.<p>
	 *
	 */
	public MCNumber slo_d_rev() {
		return getConstNumber(offset + 25, $slo_d_rev);
	}

	/**
	 * Rev. number (Order details) 改訂番号（受注明細）.<p>
	 *
	 */
	public void slo_d_rev(MCNumber value) {
		setConstNumber(offset + 25, $slo_d_rev, value);
	}

	/**
	 * Rev. number (Order details) 改訂番号（受注明細）.<p>
	 *
	 */
	public void slo_d_rev(int value) {
		setConstNumber(offset + 25, $slo_d_rev, value);
	}

	/**
	 * Rev. number (Order details) 改訂番号（受注明細）.<p>
	 *
	 */
	public void slo_d_rev(long value) {
		setConstNumber(offset + 25, $slo_d_rev, value);
	}

	/**
	 * Rev. number (Order details) 改訂番号（受注明細）.<p>
	 *
	 */
	public void slo_d_rev(float value) {
		setConstNumber(offset + 25, $slo_d_rev, value);
	}

	/**
	 * Rev. number (Order details) 改訂番号（受注明細）.<p>
	 *
	 */
	public void slo_d_rev(double value) {
		setConstNumber(offset + 25, $slo_d_rev, value);
	}


	/**
	 * Simulation allocation schedule type シミュレーション引当予定区分.<p>
	 *
	 */
	public String sim_alloc_pln_typ() {
		return getConstString(offset + 26, $sim_alloc_pln_typ);
	}

	/**
	 * Simulation allocation schedule type シミュレーション引当予定区分.<p>
	 *
	 */
	public void sim_alloc_pln_typ(String value) {
		setConstString(offset + 26, $sim_alloc_pln_typ, value);
	}


	/**
	 * Simulation allocation schedule type name シミュレーション引当予定区分名.<p>
	 *
	 */
	public String sim_alloc_pln_typ_nm() {
		return getConstString(offset + 27, $sim_alloc_pln_typ_nm);
	}

	/**
	 * Simulation allocation schedule type name シミュレーション引当予定区分名.<p>
	 *
	 */
	public void sim_alloc_pln_typ_nm(String value) {
		setConstString(offset + 27, $sim_alloc_pln_typ_nm, value);
	}


	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public String cst_cd() {
		return getConstString(offset + 28, $cst_cd);
	}

	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public void cst_cd(String value) {
		setConstString(offset + 28, $cst_cd, value);
	}


	/**
	 * Customer name 得意先名.<p>
	 *
	 */
	public String cst_nm() {
		return getConstString(offset + 29, $cst_nm);
	}

	/**
	 * Customer name 得意先名.<p>
	 *
	 */
	public void cst_nm(String value) {
		setConstString(offset + 29, $cst_nm, value);
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
	 * Revenue recording type 売上計上区分.<p>
	 *
	 */
	public String sls_basis_typ() {
		return getConstString(offset + 31, $sls_basis_typ);
	}

	/**
	 * Revenue recording type 売上計上区分.<p>
	 *
	 */
	public void sls_basis_typ(String value) {
		setConstString(offset + 31, $sls_basis_typ, value);
	}


	/**
	 * Revenue recording type name 売上計上区分名.<p>
	 *
	 */
	public String sls_basis_typ_nm() {
		return getConstString(offset + 32, $sls_basis_typ_nm);
	}

	/**
	 * Revenue recording type name 売上計上区分名.<p>
	 *
	 */
	public void sls_basis_typ_nm(String value) {
		setConstString(offset + 32, $sls_basis_typ_nm, value);
	}


	/**
	 * Sales PIC cd. 売上担当者ＣＤ.<p>
	 *
	 */
	public String sls_usr_cd() {
		return getConstString(offset + 33, $sls_usr_cd);
	}

	/**
	 * Sales PIC cd. 売上担当者ＣＤ.<p>
	 *
	 */
	public void sls_usr_cd(String value) {
		setConstString(offset + 33, $sls_usr_cd, value);
	}


	/**
	 * Sales PIC name 売上担当者名.<p>
	 *
	 */
	public String sls_usr_nm() {
		return getConstString(offset + 34, $sls_usr_nm);
	}

	/**
	 * Sales PIC name 売上担当者名.<p>
	 *
	 */
	public void sls_usr_nm(String value) {
		setConstString(offset + 34, $sls_usr_nm, value);
	}


	/**
	 * Sales dept. cd. 売上部門ＣＤ.<p>
	 *
	 */
	public String sls_dpt_cd() {
		return getConstString(offset + 35, $sls_dpt_cd);
	}

	/**
	 * Sales dept. cd. 売上部門ＣＤ.<p>
	 *
	 */
	public void sls_dpt_cd(String value) {
		setConstString(offset + 35, $sls_dpt_cd, value);
	}


	/**
	 * Sales dept. name 売上部門名.<p>
	 *
	 */
	public String sls_dpt_nm() {
		return getConstString(offset + 36, $sls_dpt_nm);
	}

	/**
	 * Sales dept. name 売上部門名.<p>
	 *
	 */
	public void sls_dpt_nm(String value) {
		setConstString(offset + 36, $sls_dpt_nm, value);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 37, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 37, $wg_cd, value);
	}


	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public String wg_nm() {
		return getConstString(offset + 38, $wg_nm);
	}

	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public void wg_nm(String value) {
		setConstString(offset + 38, $wg_nm, value);
	}


	/**
	 * Assortment type 品揃区分.<p>
	 *
	 */
	public String assort_typ() {
		return getConstString(offset + 39, $assort_typ);
	}

	/**
	 * Assortment type 品揃区分.<p>
	 *
	 */
	public void assort_typ(String value) {
		setConstString(offset + 39, $assort_typ, value);
	}


	/**
	 * Assortment type name 品揃区分名.<p>
	 *
	 */
	public String assort_typ_nm() {
		return getConstString(offset + 40, $assort_typ_nm);
	}

	/**
	 * Assortment type name 品揃区分名.<p>
	 *
	 */
	public void assort_typ_nm(String value) {
		setConstString(offset + 40, $assort_typ_nm, value);
	}


	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public String trd_cur_cd() {
		return getConstString(offset + 41, $trd_cur_cd);
	}

	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public void trd_cur_cd(String value) {
		setConstString(offset + 41, $trd_cur_cd, value);
	}


	/**
	 * Transaction currency name 取引通貨名.<p>
	 *
	 */
	public String trd_cur_nm() {
		return getConstString(offset + 42, $trd_cur_nm);
	}

	/**
	 * Transaction currency name 取引通貨名.<p>
	 *
	 */
	public void trd_cur_nm(String value) {
		setConstString(offset + 42, $trd_cur_nm, value);
	}


	/**
	 * Transaction currency unit price number of decimal places 取引通貨単価小数部有効桁数.<p>
	 *
	 */
	public MCNumber trd_cur_upri_dec_place() {
		return getConstNumber(offset + 43, $trd_cur_upri_dec_place);
	}

	/**
	 * Transaction currency unit price number of decimal places 取引通貨単価小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_upri_dec_place(MCNumber value) {
		setConstNumber(offset + 43, $trd_cur_upri_dec_place, value);
	}

	/**
	 * Transaction currency unit price number of decimal places 取引通貨単価小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_upri_dec_place(int value) {
		setConstNumber(offset + 43, $trd_cur_upri_dec_place, value);
	}

	/**
	 * Transaction currency unit price number of decimal places 取引通貨単価小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_upri_dec_place(long value) {
		setConstNumber(offset + 43, $trd_cur_upri_dec_place, value);
	}

	/**
	 * Transaction currency unit price number of decimal places 取引通貨単価小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_upri_dec_place(float value) {
		setConstNumber(offset + 43, $trd_cur_upri_dec_place, value);
	}

	/**
	 * Transaction currency unit price number of decimal places 取引通貨単価小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_upri_dec_place(double value) {
		setConstNumber(offset + 43, $trd_cur_upri_dec_place, value);
	}


	/**
	 * Transaction currency amount number of decimal places 取引通貨金額小数部有効桁数.<p>
	 *
	 */
	public MCNumber trd_cur_amt_dec_place() {
		return getConstNumber(offset + 44, $trd_cur_amt_dec_place);
	}

	/**
	 * Transaction currency amount number of decimal places 取引通貨金額小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_amt_dec_place(MCNumber value) {
		setConstNumber(offset + 44, $trd_cur_amt_dec_place, value);
	}

	/**
	 * Transaction currency amount number of decimal places 取引通貨金額小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_amt_dec_place(int value) {
		setConstNumber(offset + 44, $trd_cur_amt_dec_place, value);
	}

	/**
	 * Transaction currency amount number of decimal places 取引通貨金額小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_amt_dec_place(long value) {
		setConstNumber(offset + 44, $trd_cur_amt_dec_place, value);
	}

	/**
	 * Transaction currency amount number of decimal places 取引通貨金額小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_amt_dec_place(float value) {
		setConstNumber(offset + 44, $trd_cur_amt_dec_place, value);
	}

	/**
	 * Transaction currency amount number of decimal places 取引通貨金額小数部有効桁数.<p>
	 *
	 */
	public void trd_cur_amt_dec_place(double value) {
		setConstNumber(offset + 44, $trd_cur_amt_dec_place, value);
	}


	/**
	 * Set exchange rate 為替レート指定.<p>
	 *
	 */
	public boolean xrate_inpt_flg() {
		return getConstBoolean(offset + 45, $xrate_inpt_flg);
	}

	/**
	 * Set exchange rate 為替レート指定.<p>
	 *
	 */
	public void xrate_inpt_flg(boolean value) {
		setConstBoolean(offset + 45, $xrate_inpt_flg, value);
	}


	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public MCNumber xrate() {
		return getConstNumber(offset + 46, $xrate);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(MCNumber value) {
		setConstNumber(offset + 46, $xrate, value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(int value) {
		setConstNumber(offset + 46, $xrate, value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(long value) {
		setConstNumber(offset + 46, $xrate, value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(float value) {
		setConstNumber(offset + 46, $xrate, value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(double value) {
		setConstNumber(offset + 46, $xrate, value);
	}


	/**
	 * Base currency cd. 基準通貨ＣＤ.<p>
	 *
	 */
	public String base_cur_cd() {
		return getConstString(offset + 47, $base_cur_cd);
	}

	/**
	 * Base currency cd. 基準通貨ＣＤ.<p>
	 *
	 */
	public void base_cur_cd(String value) {
		setConstString(offset + 47, $base_cur_cd, value);
	}


	/**
	 * Base currency name 基準通貨名.<p>
	 *
	 */
	public String base_cur_nm() {
		return getConstString(offset + 48, $base_cur_nm);
	}

	/**
	 * Base currency name 基準通貨名.<p>
	 *
	 */
	public void base_cur_nm(String value) {
		setConstString(offset + 48, $base_cur_nm, value);
	}


	/**
	 * Unit price (Base currency) 基準通貨単価.<p>
	 *
	 */
	public MCNumber base_cur_upri() {
		return getConstNumber(offset + 49, $base_cur_upri);
	}

	/**
	 * Unit price (Base currency) 基準通貨単価.<p>
	 *
	 */
	public void base_cur_upri(MCNumber value) {
		setConstNumber(offset + 49, $base_cur_upri, value);
	}

	/**
	 * Unit price (Base currency) 基準通貨単価.<p>
	 *
	 */
	public void base_cur_upri(int value) {
		setConstNumber(offset + 49, $base_cur_upri, value);
	}

	/**
	 * Unit price (Base currency) 基準通貨単価.<p>
	 *
	 */
	public void base_cur_upri(long value) {
		setConstNumber(offset + 49, $base_cur_upri, value);
	}

	/**
	 * Unit price (Base currency) 基準通貨単価.<p>
	 *
	 */
	public void base_cur_upri(float value) {
		setConstNumber(offset + 49, $base_cur_upri, value);
	}

	/**
	 * Unit price (Base currency) 基準通貨単価.<p>
	 *
	 */
	public void base_cur_upri(double value) {
		setConstNumber(offset + 49, $base_cur_upri, value);
	}


	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public MCNumber base_cur_amt() {
		return getConstNumber(offset + 50, $base_cur_amt);
	}

	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public void base_cur_amt(MCNumber value) {
		setConstNumber(offset + 50, $base_cur_amt, value);
	}

	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public void base_cur_amt(int value) {
		setConstNumber(offset + 50, $base_cur_amt, value);
	}

	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public void base_cur_amt(long value) {
		setConstNumber(offset + 50, $base_cur_amt, value);
	}

	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public void base_cur_amt(float value) {
		setConstNumber(offset + 50, $base_cur_amt, value);
	}

	/**
	 * Amount (Base currency) 基準通貨金額.<p>
	 *
	 */
	public void base_cur_amt(double value) {
		setConstNumber(offset + 50, $base_cur_amt, value);
	}


	/**
	 * Tax included amount (Base currency) 基準通貨税込金額.<p>
	 *
	 */
	public MCNumber base_cur_inc_tax_amt() {
		return getConstNumber(offset + 51, $base_cur_inc_tax_amt);
	}

	/**
	 * Tax included amount (Base currency) 基準通貨税込金額.<p>
	 *
	 */
	public void base_cur_inc_tax_amt(MCNumber value) {
		setConstNumber(offset + 51, $base_cur_inc_tax_amt, value);
	}

	/**
	 * Tax included amount (Base currency) 基準通貨税込金額.<p>
	 *
	 */
	public void base_cur_inc_tax_amt(int value) {
		setConstNumber(offset + 51, $base_cur_inc_tax_amt, value);
	}

	/**
	 * Tax included amount (Base currency) 基準通貨税込金額.<p>
	 *
	 */
	public void base_cur_inc_tax_amt(long value) {
		setConstNumber(offset + 51, $base_cur_inc_tax_amt, value);
	}

	/**
	 * Tax included amount (Base currency) 基準通貨税込金額.<p>
	 *
	 */
	public void base_cur_inc_tax_amt(float value) {
		setConstNumber(offset + 51, $base_cur_inc_tax_amt, value);
	}

	/**
	 * Tax included amount (Base currency) 基準通貨税込金額.<p>
	 *
	 */
	public void base_cur_inc_tax_amt(double value) {
		setConstNumber(offset + 51, $base_cur_inc_tax_amt, value);
	}


	/**
	 * Tax amount (Base currency) 基準通貨税額.<p>
	 *
	 */
	public MCNumber base_cur_tax_amt() {
		return getConstNumber(offset + 52, $base_cur_tax_amt);
	}

	/**
	 * Tax amount (Base currency) 基準通貨税額.<p>
	 *
	 */
	public void base_cur_tax_amt(MCNumber value) {
		setConstNumber(offset + 52, $base_cur_tax_amt, value);
	}

	/**
	 * Tax amount (Base currency) 基準通貨税額.<p>
	 *
	 */
	public void base_cur_tax_amt(int value) {
		setConstNumber(offset + 52, $base_cur_tax_amt, value);
	}

	/**
	 * Tax amount (Base currency) 基準通貨税額.<p>
	 *
	 */
	public void base_cur_tax_amt(long value) {
		setConstNumber(offset + 52, $base_cur_tax_amt, value);
	}

	/**
	 * Tax amount (Base currency) 基準通貨税額.<p>
	 *
	 */
	public void base_cur_tax_amt(float value) {
		setConstNumber(offset + 52, $base_cur_tax_amt, value);
	}

	/**
	 * Tax amount (Base currency) 基準通貨税額.<p>
	 *
	 */
	public void base_cur_tax_amt(double value) {
		setConstNumber(offset + 52, $base_cur_tax_amt, value);
	}


	/**
	 * Taxpaying currency cd. 納税通貨ＣＤ.<p>
	 *
	 */
	public String ptax_cur_cd() {
		return getConstString(offset + 53, $ptax_cur_cd);
	}

	/**
	 * Taxpaying currency cd. 納税通貨ＣＤ.<p>
	 *
	 */
	public void ptax_cur_cd(String value) {
		setConstString(offset + 53, $ptax_cur_cd, value);
	}


	/**
	 * Tax currency name 納税通貨名.<p>
	 *
	 */
	public String ptax_cur_nm() {
		return getConstString(offset + 54, $ptax_cur_nm);
	}

	/**
	 * Tax currency name 納税通貨名.<p>
	 *
	 */
	public void ptax_cur_nm(String value) {
		setConstString(offset + 54, $ptax_cur_nm, value);
	}


	/**
	 * Set tax exchange rate 納税為替レート指定.<p>
	 *
	 */
	public boolean ptax_xrate_inpt_flg() {
		return getConstBoolean(offset + 55, $ptax_xrate_inpt_flg);
	}

	/**
	 * Set tax exchange rate 納税為替レート指定.<p>
	 *
	 */
	public void ptax_xrate_inpt_flg(boolean value) {
		setConstBoolean(offset + 55, $ptax_xrate_inpt_flg, value);
	}


	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public MCNumber ptax_xrate() {
		return getConstNumber(offset + 56, $ptax_xrate);
	}

	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public void ptax_xrate(MCNumber value) {
		setConstNumber(offset + 56, $ptax_xrate, value);
	}

	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public void ptax_xrate(int value) {
		setConstNumber(offset + 56, $ptax_xrate, value);
	}

	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public void ptax_xrate(long value) {
		setConstNumber(offset + 56, $ptax_xrate, value);
	}

	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public void ptax_xrate(float value) {
		setConstNumber(offset + 56, $ptax_xrate, value);
	}

	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public void ptax_xrate(double value) {
		setConstNumber(offset + 56, $ptax_xrate, value);
	}


	/**
	 * Unit price (Tax currency) 納税通貨単価.<p>
	 *
	 */
	public MCNumber ptax_cur_upri() {
		return getConstNumber(offset + 57, $ptax_cur_upri);
	}

	/**
	 * Unit price (Tax currency) 納税通貨単価.<p>
	 *
	 */
	public void ptax_cur_upri(MCNumber value) {
		setConstNumber(offset + 57, $ptax_cur_upri, value);
	}

	/**
	 * Unit price (Tax currency) 納税通貨単価.<p>
	 *
	 */
	public void ptax_cur_upri(int value) {
		setConstNumber(offset + 57, $ptax_cur_upri, value);
	}

	/**
	 * Unit price (Tax currency) 納税通貨単価.<p>
	 *
	 */
	public void ptax_cur_upri(long value) {
		setConstNumber(offset + 57, $ptax_cur_upri, value);
	}

	/**
	 * Unit price (Tax currency) 納税通貨単価.<p>
	 *
	 */
	public void ptax_cur_upri(float value) {
		setConstNumber(offset + 57, $ptax_cur_upri, value);
	}

	/**
	 * Unit price (Tax currency) 納税通貨単価.<p>
	 *
	 */
	public void ptax_cur_upri(double value) {
		setConstNumber(offset + 57, $ptax_cur_upri, value);
	}


	/**
	 * Amount (Tax currency) 納税通貨金額.<p>
	 *
	 */
	public MCNumber ptax_cur_amt() {
		return getConstNumber(offset + 58, $ptax_cur_amt);
	}

	/**
	 * Amount (Tax currency) 納税通貨金額.<p>
	 *
	 */
	public void ptax_cur_amt(MCNumber value) {
		setConstNumber(offset + 58, $ptax_cur_amt, value);
	}

	/**
	 * Amount (Tax currency) 納税通貨金額.<p>
	 *
	 */
	public void ptax_cur_amt(int value) {
		setConstNumber(offset + 58, $ptax_cur_amt, value);
	}

	/**
	 * Amount (Tax currency) 納税通貨金額.<p>
	 *
	 */
	public void ptax_cur_amt(long value) {
		setConstNumber(offset + 58, $ptax_cur_amt, value);
	}

	/**
	 * Amount (Tax currency) 納税通貨金額.<p>
	 *
	 */
	public void ptax_cur_amt(float value) {
		setConstNumber(offset + 58, $ptax_cur_amt, value);
	}

	/**
	 * Amount (Tax currency) 納税通貨金額.<p>
	 *
	 */
	public void ptax_cur_amt(double value) {
		setConstNumber(offset + 58, $ptax_cur_amt, value);
	}


	/**
	 * Tax included amount (Tax currency) 納税通貨税込金額.<p>
	 *
	 */
	public MCNumber ptax_cur_inc_tax_amt() {
		return getConstNumber(offset + 59, $ptax_cur_inc_tax_amt);
	}

	/**
	 * Tax included amount (Tax currency) 納税通貨税込金額.<p>
	 *
	 */
	public void ptax_cur_inc_tax_amt(MCNumber value) {
		setConstNumber(offset + 59, $ptax_cur_inc_tax_amt, value);
	}

	/**
	 * Tax included amount (Tax currency) 納税通貨税込金額.<p>
	 *
	 */
	public void ptax_cur_inc_tax_amt(int value) {
		setConstNumber(offset + 59, $ptax_cur_inc_tax_amt, value);
	}

	/**
	 * Tax included amount (Tax currency) 納税通貨税込金額.<p>
	 *
	 */
	public void ptax_cur_inc_tax_amt(long value) {
		setConstNumber(offset + 59, $ptax_cur_inc_tax_amt, value);
	}

	/**
	 * Tax included amount (Tax currency) 納税通貨税込金額.<p>
	 *
	 */
	public void ptax_cur_inc_tax_amt(float value) {
		setConstNumber(offset + 59, $ptax_cur_inc_tax_amt, value);
	}

	/**
	 * Tax included amount (Tax currency) 納税通貨税込金額.<p>
	 *
	 */
	public void ptax_cur_inc_tax_amt(double value) {
		setConstNumber(offset + 59, $ptax_cur_inc_tax_amt, value);
	}


	/**
	 * Tax amount (Tax currency) 納税通貨税額.<p>
	 *
	 */
	public MCNumber ptax_cur_tax_amt() {
		return getConstNumber(offset + 60, $ptax_cur_tax_amt);
	}

	/**
	 * Tax amount (Tax currency) 納税通貨税額.<p>
	 *
	 */
	public void ptax_cur_tax_amt(MCNumber value) {
		setConstNumber(offset + 60, $ptax_cur_tax_amt, value);
	}

	/**
	 * Tax amount (Tax currency) 納税通貨税額.<p>
	 *
	 */
	public void ptax_cur_tax_amt(int value) {
		setConstNumber(offset + 60, $ptax_cur_tax_amt, value);
	}

	/**
	 * Tax amount (Tax currency) 納税通貨税額.<p>
	 *
	 */
	public void ptax_cur_tax_amt(long value) {
		setConstNumber(offset + 60, $ptax_cur_tax_amt, value);
	}

	/**
	 * Tax amount (Tax currency) 納税通貨税額.<p>
	 *
	 */
	public void ptax_cur_tax_amt(float value) {
		setConstNumber(offset + 60, $ptax_cur_tax_amt, value);
	}

	/**
	 * Tax amount (Tax currency) 納税通貨税額.<p>
	 *
	 */
	public void ptax_cur_tax_amt(double value) {
		setConstNumber(offset + 60, $ptax_cur_tax_amt, value);
	}


	/**
	 * Gross profit rate 粗利率.<p>
	 *
	 */
	public MCNumber prof_rate() {
		return getConstNumber(offset + 61, $prof_rate);
	}

	/**
	 * Gross profit rate 粗利率.<p>
	 *
	 */
	public void prof_rate(MCNumber value) {
		setConstNumber(offset + 61, $prof_rate, value);
	}

	/**
	 * Gross profit rate 粗利率.<p>
	 *
	 */
	public void prof_rate(int value) {
		setConstNumber(offset + 61, $prof_rate, value);
	}

	/**
	 * Gross profit rate 粗利率.<p>
	 *
	 */
	public void prof_rate(long value) {
		setConstNumber(offset + 61, $prof_rate, value);
	}

	/**
	 * Gross profit rate 粗利率.<p>
	 *
	 */
	public void prof_rate(float value) {
		setConstNumber(offset + 61, $prof_rate, value);
	}

	/**
	 * Gross profit rate 粗利率.<p>
	 *
	 */
	public void prof_rate(double value) {
		setConstNumber(offset + 61, $prof_rate, value);
	}


	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public String wrk_no() {
		return getConstString(offset + 62, $wrk_no);
	}

	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public void wrk_no(String value) {
		setConstString(offset + 62, $wrk_no, value);
	}


	/**
	 * Sales project name 案件名.<p>
	 *
	 */
	public String wrk_nm() {
		return getConstString(offset + 63, $wrk_nm);
	}

	/**
	 * Sales project name 案件名.<p>
	 *
	 */
	public void wrk_nm(String value) {
		setConstString(offset + 63, $wrk_nm, value);
	}


	/**
	 * Transportation method cd. 輸送方法ＣＤ.<p>
	 *
	 */
	public String trnspt_cd() {
		return getConstString(offset + 64, $trnspt_cd);
	}

	/**
	 * Transportation method cd. 輸送方法ＣＤ.<p>
	 *
	 */
	public void trnspt_cd(String value) {
		setConstString(offset + 64, $trnspt_cd, value);
	}


	/**
	 * Transportation method name 輸送方法名.<p>
	 *
	 */
	public String trnspt_nm() {
		return getConstString(offset + 65, $trnspt_nm);
	}

	/**
	 * Transportation method name 輸送方法名.<p>
	 *
	 */
	public void trnspt_nm(String value) {
		setConstString(offset + 65, $trnspt_nm, value);
	}


	/**
	 * Ship/flight name 船名／便名.<p>
	 *
	 */
	public String vssl_flght() {
		return getConstString(offset + 66, $vssl_flght);
	}

	/**
	 * Ship/flight name 船名／便名.<p>
	 *
	 */
	public void vssl_flght(String value) {
		setConstString(offset + 66, $vssl_flght, value);
	}


	/**
	 * Loading port cd. 船積港ＣＤ.<p>
	 *
	 */
	public String load_port_cd() {
		return getConstString(offset + 67, $load_port_cd);
	}

	/**
	 * Loading port cd. 船積港ＣＤ.<p>
	 *
	 */
	public void load_port_cd(String value) {
		setConstString(offset + 67, $load_port_cd, value);
	}


	/**
	 * Loading port name 船積港名.<p>
	 *
	 */
	public String load_port_nm() {
		return getConstString(offset + 68, $load_port_nm);
	}

	/**
	 * Loading port name 船積港名.<p>
	 *
	 */
	public void load_port_nm(String value) {
		setConstString(offset + 68, $load_port_nm, value);
	}


	/**
	 * Estimated date of loading 船積予定日.<p>
	 *
	 */
	public MCDate etd_dt() {
		return getConstDate(offset + 69, $etd_dt);
	}

	/**
	 * Estimated date of loading 船積予定日.<p>
	 *
	 */
	public void etd_dt(MCDate value) {
		setConstDate(offset + 69, $etd_dt, value);
	}


	/**
	 * Unloading port cd. 船卸港ＣＤ.<p>
	 *
	 */
	public String dschrg_port_cd() {
		return getConstString(offset + 70, $dschrg_port_cd);
	}

	/**
	 * Unloading port cd. 船卸港ＣＤ.<p>
	 *
	 */
	public void dschrg_port_cd(String value) {
		setConstString(offset + 70, $dschrg_port_cd, value);
	}


	/**
	 * Unloading port name 船卸港名.<p>
	 *
	 */
	public String dschrg_port_nm() {
		return getConstString(offset + 71, $dschrg_port_nm);
	}

	/**
	 * Unloading port name 船卸港名.<p>
	 *
	 */
	public void dschrg_port_nm(String value) {
		setConstString(offset + 71, $dschrg_port_nm, value);
	}


	/**
	 * Estimated date of unloading 船卸予定日.<p>
	 *
	 */
	public MCDate eta_dt() {
		return getConstDate(offset + 72, $eta_dt);
	}

	/**
	 * Estimated date of unloading 船卸予定日.<p>
	 *
	 */
	public void eta_dt(MCDate value) {
		setConstDate(offset + 72, $eta_dt, value);
	}


	/**
	 * Stopover point cd. 経由地ＣＤ.<p>
	 *
	 */
	public String via_port_cd() {
		return getConstString(offset + 73, $via_port_cd);
	}

	/**
	 * Stopover point cd. 経由地ＣＤ.<p>
	 *
	 */
	public void via_port_cd(String value) {
		setConstString(offset + 73, $via_port_cd, value);
	}


	/**
	 * Stopover point name 経由地名.<p>
	 *
	 */
	public String via_port_nm() {
		return getConstString(offset + 74, $via_port_nm);
	}

	/**
	 * Stopover point name 経由地名.<p>
	 *
	 */
	public void via_port_nm(String value) {
		setConstString(offset + 74, $via_port_nm, value);
	}


	/**
	 * Estimated stopover date 経由予定日.<p>
	 *
	 */
	public MCDate via_schd_dt() {
		return getConstDate(offset + 75, $via_schd_dt);
	}

	/**
	 * Estimated stopover date 経由予定日.<p>
	 *
	 */
	public void via_schd_dt(MCDate value) {
		setConstDate(offset + 75, $via_schd_dt, value);
	}


	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public String iv_no() {
		return getConstString(offset + 76, $iv_no);
	}

	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public void iv_no(String value) {
		setConstString(offset + 76, $iv_no, value);
	}


	/**
	 * Auto-numbering 自動発番.<p>
	 *
	 */
	public boolean iv_num_flg() {
		return getConstBoolean(offset + 77, $iv_num_flg);
	}

	/**
	 * Auto-numbering 自動発番.<p>
	 *
	 */
	public void iv_num_flg(boolean value) {
		setConstBoolean(offset + 77, $iv_num_flg, value);
	}


	/**
	 * Advance received control shipping type 前受金出荷制御区分.<p>
	 *
	 */
	public String adv_ship_ctrl_typ() {
		return getConstString(offset + 78, $adv_ship_ctrl_typ);
	}

	/**
	 * Advance received control shipping type 前受金出荷制御区分.<p>
	 *
	 */
	public void adv_ship_ctrl_typ(String value) {
		setConstString(offset + 78, $adv_ship_ctrl_typ, value);
	}


	/**
	 * Advance received shipping control type name 前受金出荷制御区分名.<p>
	 *
	 */
	public String adv_ship_ctrl_typ_nm() {
		return getConstString(offset + 79, $adv_ship_ctrl_typ_nm);
	}

	/**
	 * Advance received shipping control type name 前受金出荷制御区分名.<p>
	 *
	 */
	public void adv_ship_ctrl_typ_nm(String value) {
		setConstString(offset + 79, $adv_ship_ctrl_typ_nm, value);
	}


	/**
	 * Advance received billing amount 前受金請求額.<p>
	 *
	 */
	public MCNumber adv_bill_amt() {
		return getConstNumber(offset + 80, $adv_bill_amt);
	}

	/**
	 * Advance received billing amount 前受金請求額.<p>
	 *
	 */
	public void adv_bill_amt(MCNumber value) {
		setConstNumber(offset + 80, $adv_bill_amt, value);
	}

	/**
	 * Advance received billing amount 前受金請求額.<p>
	 *
	 */
	public void adv_bill_amt(int value) {
		setConstNumber(offset + 80, $adv_bill_amt, value);
	}

	/**
	 * Advance received billing amount 前受金請求額.<p>
	 *
	 */
	public void adv_bill_amt(long value) {
		setConstNumber(offset + 80, $adv_bill_amt, value);
	}

	/**
	 * Advance received billing amount 前受金請求額.<p>
	 *
	 */
	public void adv_bill_amt(float value) {
		setConstNumber(offset + 80, $adv_bill_amt, value);
	}

	/**
	 * Advance received billing amount 前受金請求額.<p>
	 *
	 */
	public void adv_bill_amt(double value) {
		setConstNumber(offset + 80, $adv_bill_amt, value);
	}


	/**
	 * Advance received payment amount 前受金入金額.<p>
	 *
	 */
	public MCNumber adv_rcv_amt() {
		return getConstNumber(offset + 81, $adv_rcv_amt);
	}

	/**
	 * Advance received payment amount 前受金入金額.<p>
	 *
	 */
	public void adv_rcv_amt(MCNumber value) {
		setConstNumber(offset + 81, $adv_rcv_amt, value);
	}

	/**
	 * Advance received payment amount 前受金入金額.<p>
	 *
	 */
	public void adv_rcv_amt(int value) {
		setConstNumber(offset + 81, $adv_rcv_amt, value);
	}

	/**
	 * Advance received payment amount 前受金入金額.<p>
	 *
	 */
	public void adv_rcv_amt(long value) {
		setConstNumber(offset + 81, $adv_rcv_amt, value);
	}

	/**
	 * Advance received payment amount 前受金入金額.<p>
	 *
	 */
	public void adv_rcv_amt(float value) {
		setConstNumber(offset + 81, $adv_rcv_amt, value);
	}

	/**
	 * Advance received payment amount 前受金入金額.<p>
	 *
	 */
	public void adv_rcv_amt(double value) {
		setConstNumber(offset + 81, $adv_rcv_amt, value);
	}


	/**
	 * Transaction terms cd. 1 取引条件ＣＤ１.<p>
	 *
	 */
	public String tterm_cd1() {
		return getConstString(offset + 82, $tterm_cd1);
	}

	/**
	 * Transaction terms cd. 1 取引条件ＣＤ１.<p>
	 *
	 */
	public void tterm_cd1(String value) {
		setConstString(offset + 82, $tterm_cd1, value);
	}


	/**
	 * Transaction terms name 1 取引条件名１.<p>
	 *
	 */
	public String tterm_nm1() {
		return getConstString(offset + 83, $tterm_nm1);
	}

	/**
	 * Transaction terms name 1 取引条件名１.<p>
	 *
	 */
	public void tterm_nm1(String value) {
		setConstString(offset + 83, $tterm_nm1, value);
	}


	/**
	 * Transaction terms remarks 1 取引条件備考１.<p>
	 *
	 */
	public String tterm_rmrks1() {
		return getConstString(offset + 84, $tterm_rmrks1);
	}

	/**
	 * Transaction terms remarks 1 取引条件備考１.<p>
	 *
	 */
	public void tterm_rmrks1(String value) {
		setConstString(offset + 84, $tterm_rmrks1, value);
	}


	/**
	 * Transaction terms cd. 2 取引条件ＣＤ２.<p>
	 *
	 */
	public String tterm_cd2() {
		return getConstString(offset + 85, $tterm_cd2);
	}

	/**
	 * Transaction terms cd. 2 取引条件ＣＤ２.<p>
	 *
	 */
	public void tterm_cd2(String value) {
		setConstString(offset + 85, $tterm_cd2, value);
	}


	/**
	 * Transaction terms name 2 取引条件名２.<p>
	 *
	 */
	public String tterm_nm2() {
		return getConstString(offset + 86, $tterm_nm2);
	}

	/**
	 * Transaction terms name 2 取引条件名２.<p>
	 *
	 */
	public void tterm_nm2(String value) {
		setConstString(offset + 86, $tterm_nm2, value);
	}


	/**
	 * Transaction terms remarks 2 取引条件備考２.<p>
	 *
	 */
	public String tterm_rmrks2() {
		return getConstString(offset + 87, $tterm_rmrks2);
	}

	/**
	 * Transaction terms remarks 2 取引条件備考２.<p>
	 *
	 */
	public void tterm_rmrks2(String value) {
		setConstString(offset + 87, $tterm_rmrks2, value);
	}


	/**
	 * Transaction terms cd. 3 取引条件ＣＤ３.<p>
	 *
	 */
	public String tterm_cd3() {
		return getConstString(offset + 88, $tterm_cd3);
	}

	/**
	 * Transaction terms cd. 3 取引条件ＣＤ３.<p>
	 *
	 */
	public void tterm_cd3(String value) {
		setConstString(offset + 88, $tterm_cd3, value);
	}


	/**
	 * Transaction terms name 3 取引条件名３.<p>
	 *
	 */
	public String tterm_nm3() {
		return getConstString(offset + 89, $tterm_nm3);
	}

	/**
	 * Transaction terms name 3 取引条件名３.<p>
	 *
	 */
	public void tterm_nm3(String value) {
		setConstString(offset + 89, $tterm_nm3, value);
	}


	/**
	 * Transaction terms remarks 3 取引条件備考３.<p>
	 *
	 */
	public String tterm_rmrks3() {
		return getConstString(offset + 90, $tterm_rmrks3);
	}

	/**
	 * Transaction terms remarks 3 取引条件備考３.<p>
	 *
	 */
	public void tterm_rmrks3(String value) {
		setConstString(offset + 90, $tterm_rmrks3, value);
	}


	/**
	 * Customer order No. 得意先注文ＮＯ.<p>
	 *
	 */
	public String cst_po_no() {
		return getConstString(offset + 91, $cst_po_no);
	}

	/**
	 * Customer order No. 得意先注文ＮＯ.<p>
	 *
	 */
	public void cst_po_no(String value) {
		setConstString(offset + 91, $cst_po_no, value);
	}


	/**
	 * Customer order rev. number 得意先注文改訂番号.<p>
	 *
	 */
	public MCNumber cst_po_rev() {
		return getConstNumber(offset + 92, $cst_po_rev);
	}

	/**
	 * Customer order rev. number 得意先注文改訂番号.<p>
	 *
	 */
	public void cst_po_rev(MCNumber value) {
		setConstNumber(offset + 92, $cst_po_rev, value);
	}

	/**
	 * Customer order rev. number 得意先注文改訂番号.<p>
	 *
	 */
	public void cst_po_rev(int value) {
		setConstNumber(offset + 92, $cst_po_rev, value);
	}

	/**
	 * Customer order rev. number 得意先注文改訂番号.<p>
	 *
	 */
	public void cst_po_rev(long value) {
		setConstNumber(offset + 92, $cst_po_rev, value);
	}

	/**
	 * Customer order rev. number 得意先注文改訂番号.<p>
	 *
	 */
	public void cst_po_rev(float value) {
		setConstNumber(offset + 92, $cst_po_rev, value);
	}

	/**
	 * Customer order rev. number 得意先注文改訂番号.<p>
	 *
	 */
	public void cst_po_rev(double value) {
		setConstNumber(offset + 92, $cst_po_rev, value);
	}


	/**
	 * AR customer cd. 売掛先ＣＤ.<p>
	 *
	 */
	public String acst_cd() {
		return getConstString(offset + 93, $acst_cd);
	}

	/**
	 * AR customer cd. 売掛先ＣＤ.<p>
	 *
	 */
	public void acst_cd(String value) {
		setConstString(offset + 93, $acst_cd, value);
	}


	/**
	 * AR customer name 売掛先名.<p>
	 *
	 */
	public String acst_nm() {
		return getConstString(offset + 94, $acst_nm);
	}

	/**
	 * AR customer name 売掛先名.<p>
	 *
	 */
	public void acst_nm(String value) {
		setConstString(offset + 94, $acst_nm, value);
	}


	/**
	 * AR dept. cd. 債権部門ＣＤ.<p>
	 *
	 */
	public String ar_dpt_cd() {
		return getConstString(offset + 95, $ar_dpt_cd);
	}

	/**
	 * AR dept. cd. 債権部門ＣＤ.<p>
	 *
	 */
	public void ar_dpt_cd(String value) {
		setConstString(offset + 95, $ar_dpt_cd, value);
	}


	/**
	 * AR dept. name 債権部門名.<p>
	 *
	 */
	public String ar_dpt_nm() {
		return getConstString(offset + 96, $ar_dpt_nm);
	}

	/**
	 * AR dept. name 債権部門名.<p>
	 *
	 */
	public void ar_dpt_nm(String value) {
		setConstString(offset + 96, $ar_dpt_nm, value);
	}


	/**
	 * Receiving date 受付日.<p>
	 *
	 */
	public MCDate rcpt_dt() {
		return getConstDate(offset + 97, $rcpt_dt);
	}

	/**
	 * Receiving date 受付日.<p>
	 *
	 */
	public void rcpt_dt(MCDate value) {
		setConstDate(offset + 97, $rcpt_dt, value);
	}


	/**
	 * Receiving PIC cd. 受付担当者ＣＤ.<p>
	 *
	 */
	public String rcpt_usr_cd() {
		return getConstString(offset + 98, $rcpt_usr_cd);
	}

	/**
	 * Receiving PIC cd. 受付担当者ＣＤ.<p>
	 *
	 */
	public void rcpt_usr_cd(String value) {
		setConstString(offset + 98, $rcpt_usr_cd, value);
	}


	/**
	 * Receiving PIC name 受付担当者名.<p>
	 *
	 */
	public String rcpt_usr_nm() {
		return getConstString(offset + 99, $rcpt_usr_nm);
	}

	/**
	 * Receiving PIC name 受付担当者名.<p>
	 *
	 */
	public void rcpt_usr_nm(String value) {
		setConstString(offset + 99, $rcpt_usr_nm, value);
	}


	/**
	 * Customer order remarks 得意先注文備考.<p>
	 *
	 */
	public String cst_po_rmrks() {
		return getConstString(offset + 100, $cst_po_rmrks);
	}

	/**
	 * Customer order remarks 得意先注文備考.<p>
	 *
	 */
	public void cst_po_rmrks(String value) {
		setConstString(offset + 100, $cst_po_rmrks, value);
	}


	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public String trd_rmrks() {
		return getConstString(offset + 101, $trd_rmrks);
	}

	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public void trd_rmrks(String value) {
		setConstString(offset + 101, $trd_rmrks, value);
	}


	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public String intr_rmrks() {
		return getConstString(offset + 102, $intr_rmrks);
	}

	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public void intr_rmrks(String value) {
		setConstString(offset + 102, $intr_rmrks, value);
	}


	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 103, $sub_char1);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 103, $sub_char1, value);
	}


	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 104, $sub_char2);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 104, $sub_char2, value);
	}


	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 105, $sub_char3);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 105, $sub_char3, value);
	}


	/**
	 * EDI ＥＤＩ.<p>
	 *
	 */
	public boolean edi_flg() {
		return getConstBoolean(offset + 106, $edi_flg);
	}

	/**
	 * EDI ＥＤＩ.<p>
	 *
	 */
	public void edi_flg(boolean value) {
		setConstBoolean(offset + 106, $edi_flg, value);
	}


	/**
	 * Country cd. 国ＣＤ.<p>
	 *
	 */
	public String cntry_cd() {
		return getConstString(offset + 107, $cntry_cd);
	}

	/**
	 * Country cd. 国ＣＤ.<p>
	 *
	 */
	public void cntry_cd(String value) {
		setConstString(offset + 107, $cntry_cd, value);
	}


	/**
	 * Sales order header update counter 受注ヘッダ更新カウンタ.<p>
	 *
	 */
	public MCNumber slo_upd_cntr() {
		return getConstNumber(offset + 108, $slo_upd_cntr);
	}

	/**
	 * Sales order header update counter 受注ヘッダ更新カウンタ.<p>
	 *
	 */
	public void slo_upd_cntr(MCNumber value) {
		setConstNumber(offset + 108, $slo_upd_cntr, value);
	}

	/**
	 * Sales order header update counter 受注ヘッダ更新カウンタ.<p>
	 *
	 */
	public void slo_upd_cntr(int value) {
		setConstNumber(offset + 108, $slo_upd_cntr, value);
	}

	/**
	 * Sales order header update counter 受注ヘッダ更新カウンタ.<p>
	 *
	 */
	public void slo_upd_cntr(long value) {
		setConstNumber(offset + 108, $slo_upd_cntr, value);
	}

	/**
	 * Sales order header update counter 受注ヘッダ更新カウンタ.<p>
	 *
	 */
	public void slo_upd_cntr(float value) {
		setConstNumber(offset + 108, $slo_upd_cntr, value);
	}

	/**
	 * Sales order header update counter 受注ヘッダ更新カウンタ.<p>
	 *
	 */
	public void slo_upd_cntr(double value) {
		setConstNumber(offset + 108, $slo_upd_cntr, value);
	}


	/**
	 * Quotation header update counter 見積ヘッダ更新カウンタ.<p>
	 *
	 */
	public MCNumber qtn_upd_cntr() {
		return getConstNumber(offset + 109, $qtn_upd_cntr);
	}

	/**
	 * Quotation header update counter 見積ヘッダ更新カウンタ.<p>
	 *
	 */
	public void qtn_upd_cntr(MCNumber value) {
		setConstNumber(offset + 109, $qtn_upd_cntr, value);
	}

	/**
	 * Quotation header update counter 見積ヘッダ更新カウンタ.<p>
	 *
	 */
	public void qtn_upd_cntr(int value) {
		setConstNumber(offset + 109, $qtn_upd_cntr, value);
	}

	/**
	 * Quotation header update counter 見積ヘッダ更新カウンタ.<p>
	 *
	 */
	public void qtn_upd_cntr(long value) {
		setConstNumber(offset + 109, $qtn_upd_cntr, value);
	}

	/**
	 * Quotation header update counter 見積ヘッダ更新カウンタ.<p>
	 *
	 */
	public void qtn_upd_cntr(float value) {
		setConstNumber(offset + 109, $qtn_upd_cntr, value);
	}

	/**
	 * Quotation header update counter 見積ヘッダ更新カウンタ.<p>
	 *
	 */
	public void qtn_upd_cntr(double value) {
		setConstNumber(offset + 109, $qtn_upd_cntr, value);
	}


	/**
	 * Rounding type (Sales amount) 売上金額端数処理区分.<p>
	 *
	 */
	public String sls_amt_rnd_typ() {
		return getConstString(offset + 110, $sls_amt_rnd_typ);
	}

	/**
	 * Rounding type (Sales amount) 売上金額端数処理区分.<p>
	 *
	 */
	public void sls_amt_rnd_typ(String value) {
		setConstString(offset + 110, $sls_amt_rnd_typ, value);
	}


	/**
	 * Sales tax rounding type 売上税額端数処理区分.<p>
	 *
	 */
	public String sls_tax_rnd_typ() {
		return getConstString(offset + 111, $sls_tax_rnd_typ);
	}

	/**
	 * Sales tax rounding type 売上税額端数処理区分.<p>
	 *
	 */
	public void sls_tax_rnd_typ(String value) {
		setConstString(offset + 111, $sls_tax_rnd_typ, value);
	}


	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public MCNumber amt_dec_place() {
		return getConstNumber(offset + 112, $amt_dec_place);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(MCNumber value) {
		setConstNumber(offset + 112, $amt_dec_place, value);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(int value) {
		setConstNumber(offset + 112, $amt_dec_place, value);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(long value) {
		setConstNumber(offset + 112, $amt_dec_place, value);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(float value) {
		setConstNumber(offset + 112, $amt_dec_place, value);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(double value) {
		setConstNumber(offset + 112, $amt_dec_place, value);
	}


	/**
	 * Caller batch process 呼出元バッチ処理.<p>
	 *
	 */
	public boolean is_src_batch_flg() {
		return getConstBoolean(offset + 113, $is_src_batch_flg);
	}

	/**
	 * Caller batch process 呼出元バッチ処理.<p>
	 *
	 */
	public void is_src_batch_flg(boolean value) {
		setConstBoolean(offset + 113, $is_src_batch_flg, value);
	}


	/**
	 * EDI spare CHAR column 1 ＥＤＩ予備ＣＨＡＲ項目１.<p>
	 *
	 */
	public String edi_sub_char1() {
		return getConstString(offset + 114, $edi_sub_char1);
	}

	/**
	 * EDI spare CHAR column 1 ＥＤＩ予備ＣＨＡＲ項目１.<p>
	 *
	 */
	public void edi_sub_char1(String value) {
		setConstString(offset + 114, $edi_sub_char1, value);
	}


	/**
	 * EDI spare CHAR column 2 ＥＤＩ予備ＣＨＡＲ項目２.<p>
	 *
	 */
	public String edi_sub_char2() {
		return getConstString(offset + 115, $edi_sub_char2);
	}

	/**
	 * EDI spare CHAR column 2 ＥＤＩ予備ＣＨＡＲ項目２.<p>
	 *
	 */
	public void edi_sub_char2(String value) {
		setConstString(offset + 115, $edi_sub_char2, value);
	}


	/**
	 * EDI spare CHAR column 3 ＥＤＩ予備ＣＨＡＲ項目３.<p>
	 *
	 */
	public String edi_sub_char3() {
		return getConstString(offset + 116, $edi_sub_char3);
	}

	/**
	 * EDI spare CHAR column 3 ＥＤＩ予備ＣＨＡＲ項目３.<p>
	 *
	 */
	public void edi_sub_char3(String value) {
		setConstString(offset + 116, $edi_sub_char3, value);
	}


	/**
	 * EDI spare CHAR column 4 ＥＤＩ予備ＣＨＡＲ項目４.<p>
	 *
	 */
	public String edi_sub_char4() {
		return getConstString(offset + 117, $edi_sub_char4);
	}

	/**
	 * EDI spare CHAR column 4 ＥＤＩ予備ＣＨＡＲ項目４.<p>
	 *
	 */
	public void edi_sub_char4(String value) {
		setConstString(offset + 117, $edi_sub_char4, value);
	}


	/**
	 * EDI spare CHAR column 5 ＥＤＩ予備ＣＨＡＲ項目５.<p>
	 *
	 */
	public String edi_sub_char5() {
		return getConstString(offset + 118, $edi_sub_char5);
	}

	/**
	 * EDI spare CHAR column 5 ＥＤＩ予備ＣＨＡＲ項目５.<p>
	 *
	 */
	public void edi_sub_char5(String value) {
		setConstString(offset + 118, $edi_sub_char5, value);
	}


	/**
	 * EDI spare NUM column 1 ＥＤＩ予備ＮＵＭ項目１.<p>
	 *
	 */
	public MCNumber edi_sub_num1() {
		return getConstNumber(offset + 119, $edi_sub_num1);
	}

	/**
	 * EDI spare NUM column 1 ＥＤＩ予備ＮＵＭ項目１.<p>
	 *
	 */
	public void edi_sub_num1(MCNumber value) {
		setConstNumber(offset + 119, $edi_sub_num1, value);
	}

	/**
	 * EDI spare NUM column 1 ＥＤＩ予備ＮＵＭ項目１.<p>
	 *
	 */
	public void edi_sub_num1(int value) {
		setConstNumber(offset + 119, $edi_sub_num1, value);
	}

	/**
	 * EDI spare NUM column 1 ＥＤＩ予備ＮＵＭ項目１.<p>
	 *
	 */
	public void edi_sub_num1(long value) {
		setConstNumber(offset + 119, $edi_sub_num1, value);
	}

	/**
	 * EDI spare NUM column 1 ＥＤＩ予備ＮＵＭ項目１.<p>
	 *
	 */
	public void edi_sub_num1(float value) {
		setConstNumber(offset + 119, $edi_sub_num1, value);
	}

	/**
	 * EDI spare NUM column 1 ＥＤＩ予備ＮＵＭ項目１.<p>
	 *
	 */
	public void edi_sub_num1(double value) {
		setConstNumber(offset + 119, $edi_sub_num1, value);
	}


	/**
	 * EDI spare DATE column 1 ＥＤＩ予備ＤＡＴＥ項目１.<p>
	 *
	 */
	public MCDate edi_sub_dt1() {
		return getConstDate(offset + 120, $edi_sub_dt1);
	}

	/**
	 * EDI spare DATE column 1 ＥＤＩ予備ＤＡＴＥ項目１.<p>
	 *
	 */
	public void edi_sub_dt1(MCDate value) {
		setConstDate(offset + 120, $edi_sub_dt1, value);
	}


	/**
	 * For Approval 承認対象.<p>
	 *
	 */
	public boolean aprv_flg() {
		return getConstBoolean(offset + 121, $aprv_flg);
	}

	/**
	 * For Approval 承認対象.<p>
	 *
	 */
	public void aprv_flg(boolean value) {
		setConstBoolean(offset + 121, $aprv_flg, value);
	}


	/**
	 * Approval withdraw 承認引戻.<p>
	 *
	 */
	public boolean aprv_back_flg() {
		return getConstBoolean(offset + 122, $aprv_back_flg);
	}

	/**
	 * Approval withdraw 承認引戻.<p>
	 *
	 */
	public void aprv_back_flg(boolean value) {
		setConstBoolean(offset + 122, $aprv_back_flg, value);
	}


	/**
	 * Approval No. 承認ＮＯ.<p>
	 *
	 */
	public String aprv_no() {
		return getConstString(offset + 123, $aprv_no);
	}

	/**
	 * Approval No. 承認ＮＯ.<p>
	 *
	 */
	public void aprv_no(String value) {
		setConstString(offset + 123, $aprv_no, value);
	}


	/**
	 * Approval status type 承認状況区分.<p>
	 *
	 */
	public String aprv_sts_typ() {
		return getConstString(offset + 124, $aprv_sts_typ);
	}

	/**
	 * Approval status type 承認状況区分.<p>
	 *
	 */
	public void aprv_sts_typ(String value) {
		setConstString(offset + 124, $aprv_sts_typ, value);
	}


	/**
	 * Approval status type name 承認状況区分名.<p>
	 *
	 */
	public String aprv_sts_typ_nm() {
		return getConstString(offset + 125, $aprv_sts_typ_nm);
	}

	/**
	 * Approval status type name 承認状況区分名.<p>
	 *
	 */
	public void aprv_sts_typ_nm(String value) {
		setConstString(offset + 125, $aprv_sts_typ_nm, value);
	}


	/**
	 * Cancel 取消.<p>
	 *
	 */
	public boolean can_flg() {
		return getConstBoolean(offset + 126, $can_flg);
	}

	/**
	 * Cancel 取消.<p>
	 *
	 */
	public void can_flg(boolean value) {
		setConstBoolean(offset + 126, $can_flg, value);
	}


	/**
	 * Canceling reason cd. 取消理由ＣＤ.<p>
	 *
	 */
	public String can_rsn_cd() {
		return getConstString(offset + 127, $can_rsn_cd);
	}

	/**
	 * Canceling reason cd. 取消理由ＣＤ.<p>
	 *
	 */
	public void can_rsn_cd(String value) {
		setConstString(offset + 127, $can_rsn_cd, value);
	}


	/**
	 * Canceling reason name 取消理由名.<p>
	 *
	 */
	public String can_rsn_nm() {
		return getConstString(offset + 128, $can_rsn_nm);
	}

	/**
	 * Canceling reason name 取消理由名.<p>
	 *
	 */
	public void can_rsn_nm(String value) {
		setConstString(offset + 128, $can_rsn_nm, value);
	}


	/**
	 * Cancel remarks 取消備考.<p>
	 *
	 */
	public String can_rmrks() {
		return getConstString(offset + 129, $can_rmrks);
	}

	/**
	 * Cancel remarks 取消備考.<p>
	 *
	 */
	public void can_rmrks(String value) {
		setConstString(offset + 129, $can_rmrks, value);
	}


	/**
	 * Header group No. ヘッダグループＮＯ.<p>
	 *
	 */
	public MCNumber hdr_grp_no() {
		return getConstNumber(offset + 130, $hdr_grp_no);
	}

	/**
	 * Header group No. ヘッダグループＮＯ.<p>
	 *
	 */
	public void hdr_grp_no(MCNumber value) {
		setConstNumber(offset + 130, $hdr_grp_no, value);
	}

	/**
	 * Header group No. ヘッダグループＮＯ.<p>
	 *
	 */
	public void hdr_grp_no(int value) {
		setConstNumber(offset + 130, $hdr_grp_no, value);
	}

	/**
	 * Header group No. ヘッダグループＮＯ.<p>
	 *
	 */
	public void hdr_grp_no(long value) {
		setConstNumber(offset + 130, $hdr_grp_no, value);
	}

	/**
	 * Header group No. ヘッダグループＮＯ.<p>
	 *
	 */
	public void hdr_grp_no(float value) {
		setConstNumber(offset + 130, $hdr_grp_no, value);
	}

	/**
	 * Header group No. ヘッダグループＮＯ.<p>
	 *
	 */
	public void hdr_grp_no(double value) {
		setConstNumber(offset + 130, $hdr_grp_no, value);
	}


	/**
	 * Header error ヘッダエラー.<p>
	 *
	 */
	public boolean hdr_err_flg() {
		return getConstBoolean(offset + 131, $hdr_err_flg);
	}

	/**
	 * Header error ヘッダエラー.<p>
	 *
	 */
	public void hdr_err_flg(boolean value) {
		setConstBoolean(offset + 131, $hdr_err_flg, value);
	}


	/**
	 * Cancel remaining 打切.<p>
	 *
	 */
	public boolean abort_flg() {
		return getConstBoolean(offset + 132, $abort_flg);
	}

	/**
	 * Cancel remaining 打切.<p>
	 *
	 */
	public void abort_flg(boolean value) {
		setConstBoolean(offset + 132, $abort_flg, value);
	}


	/**
	 * Customer item cd. 得意先品目ＣＤ.<p>
	 *
	 */
	public String cst_itm_cd() {
		return getConstString(offset + 133, $cst_itm_cd);
	}

	/**
	 * Customer item cd. 得意先品目ＣＤ.<p>
	 *
	 */
	public void cst_itm_cd(String value) {
		setConstString(offset + 133, $cst_itm_cd, value);
	}


	/**
	 * Customer item name 得意先品名.<p>
	 *
	 */
	public String cst_itm_nm() {
		return getConstString(offset + 134, $cst_itm_nm);
	}

	/**
	 * Customer item name 得意先品名.<p>
	 *
	 */
	public void cst_itm_nm(String value) {
		setConstString(offset + 134, $cst_itm_nm, value);
	}


	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 135, $itm_cd);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 135, $itm_cd, value);
	}


	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 136, $itm_sub1);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 136, $itm_sub1, value);
	}


	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 137, $itm_sub2);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 137, $itm_sub2, value);
	}


	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 138, $itm_sub3);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 138, $itm_sub3, value);
	}


	/**
	 * Item name 品名.<p>
	 *
	 */
	public String itm_nm() {
		return getConstString(offset + 139, $itm_nm);
	}

	/**
	 * Item name 品名.<p>
	 *
	 */
	public void itm_nm(String value) {
		setConstString(offset + 139, $itm_nm, value);
	}


	/**
	 * Configuration/specification management type 構成・仕様管理区分.<p>
	 *
	 */
	public String comp_spec_typ() {
		return getConstString(offset + 140, $comp_spec_typ);
	}

	/**
	 * Configuration/specification management type 構成・仕様管理区分.<p>
	 *
	 */
	public void comp_spec_typ(String value) {
		setConstString(offset + 140, $comp_spec_typ, value);
	}


	/**
	 * Configuration/specification management type name 構成・仕様管理区分名.<p>
	 *
	 */
	public String comp_spec_typ_nm() {
		return getConstString(offset + 141, $comp_spec_typ_nm);
	}

	/**
	 * Configuration/specification management type name 構成・仕様管理区分名.<p>
	 *
	 */
	public void comp_spec_typ_nm(String value) {
		setConstString(offset + 141, $comp_spec_typ_nm, value);
	}


	/**
	 * Configuration rev. number 構成改訂番号.<p>
	 *
	 */
	public String itm_comp_rev_no() {
		return getConstString(offset + 142, $itm_comp_rev_no);
	}

	/**
	 * Configuration rev. number 構成改訂番号.<p>
	 *
	 */
	public void itm_comp_rev_no(String value) {
		setConstString(offset + 142, $itm_comp_rev_no, value);
	}


	/**
	 * Item name for I/V Ｉ／Ｖ表記品名.<p>
	 *
	 */
	public String iv_itm_nm() {
		return getConstString(offset + 143, $iv_itm_nm);
	}

	/**
	 * Item name for I/V Ｉ／Ｖ表記品名.<p>
	 *
	 */
	public void iv_itm_nm(String value) {
		setConstString(offset + 143, $iv_itm_nm, value);
	}


	/**
	 * Place of origin cd. 原産地ＣＤ.<p>
	 *
	 */
	public String cntry_org_cd() {
		return getConstString(offset + 144, $cntry_org_cd);
	}

	/**
	 * Place of origin cd. 原産地ＣＤ.<p>
	 *
	 */
	public void cntry_org_cd(String value) {
		setConstString(offset + 144, $cntry_org_cd, value);
	}


	/**
	 * Place of origin name 原産地名.<p>
	 *
	 */
	public String cntry_org_nm() {
		return getConstString(offset + 145, $cntry_org_nm);
	}

	/**
	 * Place of origin name 原産地名.<p>
	 *
	 */
	public void cntry_org_nm(String value) {
		setConstString(offset + 145, $cntry_org_nm, value);
	}


	/**
	 * Asset management type 資産管理区分.<p>
	 *
	 */
	public String asset_mng_typ() {
		return getConstString(offset + 146, $asset_mng_typ);
	}

	/**
	 * Asset management type 資産管理区分.<p>
	 *
	 */
	public void asset_mng_typ(String value) {
		setConstString(offset + 146, $asset_mng_typ, value);
	}


	/**
	 * Asset management type name 資産管理区分名.<p>
	 *
	 */
	public String asset_mng_typ_nm() {
		return getConstString(offset + 147, $asset_mng_typ_nm);
	}

	/**
	 * Asset management type name 資産管理区分名.<p>
	 *
	 */
	public void asset_mng_typ_nm(String value) {
		setConstString(offset + 147, $asset_mng_typ_nm, value);
	}


	/**
	 * Consignment 貸出.<p>
	 *
	 */
	public boolean vmi_flg() {
		return getConstBoolean(offset + 148, $vmi_flg);
	}

	/**
	 * Consignment 貸出.<p>
	 *
	 */
	public void vmi_flg(boolean value) {
		setConstBoolean(offset + 148, $vmi_flg, value);
	}


	/**
	 * Discount item 値引品目.<p>
	 *
	 */
	public boolean dscnt_itm_flg() {
		return getConstBoolean(offset + 149, $dscnt_itm_flg);
	}

	/**
	 * Discount item 値引品目.<p>
	 *
	 */
	public void dscnt_itm_flg(boolean value) {
		setConstBoolean(offset + 149, $dscnt_itm_flg, value);
	}


	/**
	 * Allocation extra days 引当余裕日数.<p>
	 *
	 */
	public MCNumber alloc_margin_days() {
		return getConstNumber(offset + 150, $alloc_margin_days);
	}

	/**
	 * Allocation extra days 引当余裕日数.<p>
	 *
	 */
	public void alloc_margin_days(MCNumber value) {
		setConstNumber(offset + 150, $alloc_margin_days, value);
	}

	/**
	 * Allocation extra days 引当余裕日数.<p>
	 *
	 */
	public void alloc_margin_days(int value) {
		setConstNumber(offset + 150, $alloc_margin_days, value);
	}

	/**
	 * Allocation extra days 引当余裕日数.<p>
	 *
	 */
	public void alloc_margin_days(long value) {
		setConstNumber(offset + 150, $alloc_margin_days, value);
	}

	/**
	 * Allocation extra days 引当余裕日数.<p>
	 *
	 */
	public void alloc_margin_days(float value) {
		setConstNumber(offset + 150, $alloc_margin_days, value);
	}

	/**
	 * Allocation extra days 引当余裕日数.<p>
	 *
	 */
	public void alloc_margin_days(double value) {
		setConstNumber(offset + 150, $alloc_margin_days, value);
	}


	/**
	 * Inventory management type 在庫管理区分.<p>
	 *
	 */
	public String stk_mng_typ() {
		return getConstString(offset + 151, $stk_mng_typ);
	}

	/**
	 * Inventory management type 在庫管理区分.<p>
	 *
	 */
	public void stk_mng_typ(String value) {
		setConstString(offset + 151, $stk_mng_typ, value);
	}


	/**
	 * Miscellaneous item 諸口品.<p>
	 *
	 */
	public boolean sundry_itm_flg() {
		return getConstBoolean(offset + 152, $sundry_itm_flg);
	}

	/**
	 * Miscellaneous item 諸口品.<p>
	 *
	 */
	public void sundry_itm_flg(boolean value) {
		setConstBoolean(offset + 152, $sundry_itm_flg, value);
	}


	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public String trd_unit_cd() {
		return getConstString(offset + 153, $trd_unit_cd);
	}

	/**
	 * Transaction unit cd. 取引単位ＣＤ.<p>
	 *
	 */
	public void trd_unit_cd(String value) {
		setConstString(offset + 153, $trd_unit_cd, value);
	}


	/**
	 * Transaction unit name 取引単位名.<p>
	 *
	 */
	public String trd_unit_nm() {
		return getConstString(offset + 154, $trd_unit_nm);
	}

	/**
	 * Transaction unit name 取引単位名.<p>
	 *
	 */
	public void trd_unit_nm(String value) {
		setConstString(offset + 154, $trd_unit_nm, value);
	}


	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public MCNumber trd_unit_qty() {
		return getConstNumber(offset + 155, $trd_unit_qty);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(MCNumber value) {
		setConstNumber(offset + 155, $trd_unit_qty, value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(int value) {
		setConstNumber(offset + 155, $trd_unit_qty, value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(long value) {
		setConstNumber(offset + 155, $trd_unit_qty, value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(float value) {
		setConstNumber(offset + 155, $trd_unit_qty, value);
	}

	/**
	 * Transaction unit qty. 取引単位数量.<p>
	 *
	 */
	public void trd_unit_qty(double value) {
		setConstNumber(offset + 155, $trd_unit_qty, value);
	}


	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber trd_unit_dec_place() {
		return getConstNumber(offset + 156, $trd_unit_dec_place);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 156, $trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(int value) {
		setConstNumber(offset + 156, $trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(long value) {
		setConstNumber(offset + 156, $trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(float value) {
		setConstNumber(offset + 156, $trd_unit_dec_place, value);
	}

	/**
	 * Transaction unit number of decimal places 取引単位小数部有効桁数.<p>
	 *
	 */
	public void trd_unit_dec_place(double value) {
		setConstNumber(offset + 156, $trd_unit_dec_place, value);
	}


	/**
	 * Transaction unit conversion base qty. 取引単位分母数量.<p>
	 *
	 */
	public MCNumber trd_unit_conv_base_qty() {
		return getConstNumber(offset + 157, $trd_unit_conv_base_qty);
	}

	/**
	 * Transaction unit conversion base qty. 取引単位分母数量.<p>
	 *
	 */
	public void trd_unit_conv_base_qty(MCNumber value) {
		setConstNumber(offset + 157, $trd_unit_conv_base_qty, value);
	}

	/**
	 * Transaction unit conversion base qty. 取引単位分母数量.<p>
	 *
	 */
	public void trd_unit_conv_base_qty(int value) {
		setConstNumber(offset + 157, $trd_unit_conv_base_qty, value);
	}

	/**
	 * Transaction unit conversion base qty. 取引単位分母数量.<p>
	 *
	 */
	public void trd_unit_conv_base_qty(long value) {
		setConstNumber(offset + 157, $trd_unit_conv_base_qty, value);
	}

	/**
	 * Transaction unit conversion base qty. 取引単位分母数量.<p>
	 *
	 */
	public void trd_unit_conv_base_qty(float value) {
		setConstNumber(offset + 157, $trd_unit_conv_base_qty, value);
	}

	/**
	 * Transaction unit conversion base qty. 取引単位分母数量.<p>
	 *
	 */
	public void trd_unit_conv_base_qty(double value) {
		setConstNumber(offset + 157, $trd_unit_conv_base_qty, value);
	}


	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public MCNumber trd_unit_conv_qty() {
		return getConstNumber(offset + 158, $trd_unit_conv_qty);
	}

	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public void trd_unit_conv_qty(MCNumber value) {
		setConstNumber(offset + 158, $trd_unit_conv_qty, value);
	}

	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public void trd_unit_conv_qty(int value) {
		setConstNumber(offset + 158, $trd_unit_conv_qty, value);
	}

	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public void trd_unit_conv_qty(long value) {
		setConstNumber(offset + 158, $trd_unit_conv_qty, value);
	}

	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public void trd_unit_conv_qty(float value) {
		setConstNumber(offset + 158, $trd_unit_conv_qty, value);
	}

	/**
	 * Transaction unit conversion qty. 取引単位換算数量.<p>
	 *
	 */
	public void trd_unit_conv_qty(double value) {
		setConstNumber(offset + 158, $trd_unit_conv_qty, value);
	}


	/**
	 * Not to reacquire unit price 単価再取得対象外.<p>
	 *
	 */
	public boolean upri_not_tgt_flg() {
		return getConstBoolean(offset + 159, $upri_not_tgt_flg);
	}

	/**
	 * Not to reacquire unit price 単価再取得対象外.<p>
	 *
	 */
	public void upri_not_tgt_flg(boolean value) {
		setConstBoolean(offset + 159, $upri_not_tgt_flg, value);
	}


	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public MCNumber trd_cur_upri() {
		return getConstNumber(offset + 160, $trd_cur_upri);
	}

	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public void trd_cur_upri(MCNumber value) {
		setConstNumber(offset + 160, $trd_cur_upri, value);
	}

	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public void trd_cur_upri(int value) {
		setConstNumber(offset + 160, $trd_cur_upri, value);
	}

	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public void trd_cur_upri(long value) {
		setConstNumber(offset + 160, $trd_cur_upri, value);
	}

	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public void trd_cur_upri(float value) {
		setConstNumber(offset + 160, $trd_cur_upri, value);
	}

	/**
	 * Unit price (Transaction currency) 取引通貨単価.<p>
	 *
	 */
	public void trd_cur_upri(double value) {
		setConstNumber(offset + 160, $trd_cur_upri, value);
	}


	/**
	 * Temporary unit price 仮単価.<p>
	 *
	 */
	public boolean interim_flg() {
		return getConstBoolean(offset + 161, $interim_flg);
	}

	/**
	 * Temporary unit price 仮単価.<p>
	 *
	 */
	public void interim_flg(boolean value) {
		setConstBoolean(offset + 161, $interim_flg, value);
	}


	/**
	 * Amount 金額.<p>
	 *
	 */
	public MCNumber trd_cur_amt() {
		return getConstNumber(offset + 162, $trd_cur_amt);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void trd_cur_amt(MCNumber value) {
		setConstNumber(offset + 162, $trd_cur_amt, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void trd_cur_amt(int value) {
		setConstNumber(offset + 162, $trd_cur_amt, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void trd_cur_amt(long value) {
		setConstNumber(offset + 162, $trd_cur_amt, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void trd_cur_amt(float value) {
		setConstNumber(offset + 162, $trd_cur_amt, value);
	}

	/**
	 * Amount 金額.<p>
	 *
	 */
	public void trd_cur_amt(double value) {
		setConstNumber(offset + 162, $trd_cur_amt, value);
	}


	/**
	 * Tax included amount 税込金額.<p>
	 *
	 */
	public MCNumber trd_cur_inc_tax_amt() {
		return getConstNumber(offset + 163, $trd_cur_inc_tax_amt);
	}

	/**
	 * Tax included amount 税込金額.<p>
	 *
	 */
	public void trd_cur_inc_tax_amt(MCNumber value) {
		setConstNumber(offset + 163, $trd_cur_inc_tax_amt, value);
	}

	/**
	 * Tax included amount 税込金額.<p>
	 *
	 */
	public void trd_cur_inc_tax_amt(int value) {
		setConstNumber(offset + 163, $trd_cur_inc_tax_amt, value);
	}

	/**
	 * Tax included amount 税込金額.<p>
	 *
	 */
	public void trd_cur_inc_tax_amt(long value) {
		setConstNumber(offset + 163, $trd_cur_inc_tax_amt, value);
	}

	/**
	 * Tax included amount 税込金額.<p>
	 *
	 */
	public void trd_cur_inc_tax_amt(float value) {
		setConstNumber(offset + 163, $trd_cur_inc_tax_amt, value);
	}

	/**
	 * Tax included amount 税込金額.<p>
	 *
	 */
	public void trd_cur_inc_tax_amt(double value) {
		setConstNumber(offset + 163, $trd_cur_inc_tax_amt, value);
	}


	/**
	 * Unit cost 原価単価.<p>
	 *
	 */
	public MCNumber cost_upri() {
		return getConstNumber(offset + 164, $cost_upri);
	}

	/**
	 * Unit cost 原価単価.<p>
	 *
	 */
	public void cost_upri(MCNumber value) {
		setConstNumber(offset + 164, $cost_upri, value);
	}

	/**
	 * Unit cost 原価単価.<p>
	 *
	 */
	public void cost_upri(int value) {
		setConstNumber(offset + 164, $cost_upri, value);
	}

	/**
	 * Unit cost 原価単価.<p>
	 *
	 */
	public void cost_upri(long value) {
		setConstNumber(offset + 164, $cost_upri, value);
	}

	/**
	 * Unit cost 原価単価.<p>
	 *
	 */
	public void cost_upri(float value) {
		setConstNumber(offset + 164, $cost_upri, value);
	}

	/**
	 * Unit cost 原価単価.<p>
	 *
	 */
	public void cost_upri(double value) {
		setConstNumber(offset + 164, $cost_upri, value);
	}


	/**
	 * Total cost 原価金額.<p>
	 *
	 */
	public MCNumber cost_amt() {
		return getConstNumber(offset + 165, $cost_amt);
	}

	/**
	 * Total cost 原価金額.<p>
	 *
	 */
	public void cost_amt(MCNumber value) {
		setConstNumber(offset + 165, $cost_amt, value);
	}

	/**
	 * Total cost 原価金額.<p>
	 *
	 */
	public void cost_amt(int value) {
		setConstNumber(offset + 165, $cost_amt, value);
	}

	/**
	 * Total cost 原価金額.<p>
	 *
	 */
	public void cost_amt(long value) {
		setConstNumber(offset + 165, $cost_amt, value);
	}

	/**
	 * Total cost 原価金額.<p>
	 *
	 */
	public void cost_amt(float value) {
		setConstNumber(offset + 165, $cost_amt, value);
	}

	/**
	 * Total cost 原価金額.<p>
	 *
	 */
	public void cost_amt(double value) {
		setConstNumber(offset + 165, $cost_amt, value);
	}


	/**
	 * Discount amount (Transaction currency) 取引通貨値引額.<p>
	 *
	 */
	public MCNumber trd_cur_dscnt_amt() {
		return getConstNumber(offset + 166, $trd_cur_dscnt_amt);
	}

	/**
	 * Discount amount (Transaction currency) 取引通貨値引額.<p>
	 *
	 */
	public void trd_cur_dscnt_amt(MCNumber value) {
		setConstNumber(offset + 166, $trd_cur_dscnt_amt, value);
	}

	/**
	 * Discount amount (Transaction currency) 取引通貨値引額.<p>
	 *
	 */
	public void trd_cur_dscnt_amt(int value) {
		setConstNumber(offset + 166, $trd_cur_dscnt_amt, value);
	}

	/**
	 * Discount amount (Transaction currency) 取引通貨値引額.<p>
	 *
	 */
	public void trd_cur_dscnt_amt(long value) {
		setConstNumber(offset + 166, $trd_cur_dscnt_amt, value);
	}

	/**
	 * Discount amount (Transaction currency) 取引通貨値引額.<p>
	 *
	 */
	public void trd_cur_dscnt_amt(float value) {
		setConstNumber(offset + 166, $trd_cur_dscnt_amt, value);
	}

	/**
	 * Discount amount (Transaction currency) 取引通貨値引額.<p>
	 *
	 */
	public void trd_cur_dscnt_amt(double value) {
		setConstNumber(offset + 166, $trd_cur_dscnt_amt, value);
	}


	/**
	 * Discount reason cd. 値引理由ＣＤ.<p>
	 *
	 */
	public String dscnt_rsn_cd() {
		return getConstString(offset + 167, $dscnt_rsn_cd);
	}

	/**
	 * Discount reason cd. 値引理由ＣＤ.<p>
	 *
	 */
	public void dscnt_rsn_cd(String value) {
		setConstString(offset + 167, $dscnt_rsn_cd, value);
	}


	/**
	 * Discount reason name 値引理由名.<p>
	 *
	 */
	public String dscnt_rsn_nm() {
		return getConstString(offset + 168, $dscnt_rsn_nm);
	}

	/**
	 * Discount reason name 値引理由名.<p>
	 *
	 */
	public void dscnt_rsn_nm(String value) {
		setConstString(offset + 168, $dscnt_rsn_nm, value);
	}


	/**
	 * I/V unit price Ｉ／Ｖ単価.<p>
	 *
	 */
	public MCNumber iv_upri() {
		return getConstNumber(offset + 169, $iv_upri);
	}

	/**
	 * I/V unit price Ｉ／Ｖ単価.<p>
	 *
	 */
	public void iv_upri(MCNumber value) {
		setConstNumber(offset + 169, $iv_upri, value);
	}

	/**
	 * I/V unit price Ｉ／Ｖ単価.<p>
	 *
	 */
	public void iv_upri(int value) {
		setConstNumber(offset + 169, $iv_upri, value);
	}

	/**
	 * I/V unit price Ｉ／Ｖ単価.<p>
	 *
	 */
	public void iv_upri(long value) {
		setConstNumber(offset + 169, $iv_upri, value);
	}

	/**
	 * I/V unit price Ｉ／Ｖ単価.<p>
	 *
	 */
	public void iv_upri(float value) {
		setConstNumber(offset + 169, $iv_upri, value);
	}

	/**
	 * I/V unit price Ｉ／Ｖ単価.<p>
	 *
	 */
	public void iv_upri(double value) {
		setConstNumber(offset + 169, $iv_upri, value);
	}


	/**
	 * I/V amount Ｉ／Ｖ金額.<p>
	 *
	 */
	public MCNumber iv_amt() {
		return getConstNumber(offset + 170, $iv_amt);
	}

	/**
	 * I/V amount Ｉ／Ｖ金額.<p>
	 *
	 */
	public void iv_amt(MCNumber value) {
		setConstNumber(offset + 170, $iv_amt, value);
	}

	/**
	 * I/V amount Ｉ／Ｖ金額.<p>
	 *
	 */
	public void iv_amt(int value) {
		setConstNumber(offset + 170, $iv_amt, value);
	}

	/**
	 * I/V amount Ｉ／Ｖ金額.<p>
	 *
	 */
	public void iv_amt(long value) {
		setConstNumber(offset + 170, $iv_amt, value);
	}

	/**
	 * I/V amount Ｉ／Ｖ金額.<p>
	 *
	 */
	public void iv_amt(float value) {
		setConstNumber(offset + 170, $iv_amt, value);
	}

	/**
	 * I/V amount Ｉ／Ｖ金額.<p>
	 *
	 */
	public void iv_amt(double value) {
		setConstNumber(offset + 170, $iv_amt, value);
	}


	/**
	 * Set tax 税指定.<p>
	 *
	 */
	public boolean tax_fix_flg() {
		return getConstBoolean(offset + 171, $tax_fix_flg);
	}

	/**
	 * Set tax 税指定.<p>
	 *
	 */
	public void tax_fix_flg(boolean value) {
		setConstBoolean(offset + 171, $tax_fix_flg, value);
	}


	/**
	 * Tax cd. 税ＣＤ.<p>
	 *
	 */
	public String tax_cd() {
		return getConstString(offset + 172, $tax_cd);
	}

	/**
	 * Tax cd. 税ＣＤ.<p>
	 *
	 */
	public void tax_cd(String value) {
		setConstString(offset + 172, $tax_cd, value);
	}


	/**
	 * Tax name 税名.<p>
	 *
	 */
	public String tax_nm() {
		return getConstString(offset + 173, $tax_nm);
	}

	/**
	 * Tax name 税名.<p>
	 *
	 */
	public void tax_nm(String value) {
		setConstString(offset + 173, $tax_nm, value);
	}


	/**
	 * Tax rate 税率.<p>
	 *
	 */
	public MCNumber tax_rate() {
		return getConstNumber(offset + 174, $tax_rate);
	}

	/**
	 * Tax rate 税率.<p>
	 *
	 */
	public void tax_rate(MCNumber value) {
		setConstNumber(offset + 174, $tax_rate, value);
	}

	/**
	 * Tax rate 税率.<p>
	 *
	 */
	public void tax_rate(int value) {
		setConstNumber(offset + 174, $tax_rate, value);
	}

	/**
	 * Tax rate 税率.<p>
	 *
	 */
	public void tax_rate(long value) {
		setConstNumber(offset + 174, $tax_rate, value);
	}

	/**
	 * Tax rate 税率.<p>
	 *
	 */
	public void tax_rate(float value) {
		setConstNumber(offset + 174, $tax_rate, value);
	}

	/**
	 * Tax rate 税率.<p>
	 *
	 */
	public void tax_rate(double value) {
		setConstNumber(offset + 174, $tax_rate, value);
	}


	/**
	 * Tax inclusive 内税.<p>
	 *
	 */
	public boolean inc_tax_flg() {
		return getConstBoolean(offset + 175, $inc_tax_flg);
	}

	/**
	 * Tax inclusive 内税.<p>
	 *
	 */
	public void inc_tax_flg(boolean value) {
		setConstBoolean(offset + 175, $inc_tax_flg, value);
	}


	/**
	 * Tax amount 税額.<p>
	 *
	 */
	public MCNumber trd_cur_tax_amt() {
		return getConstNumber(offset + 176, $trd_cur_tax_amt);
	}

	/**
	 * Tax amount 税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(MCNumber value) {
		setConstNumber(offset + 176, $trd_cur_tax_amt, value);
	}

	/**
	 * Tax amount 税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(int value) {
		setConstNumber(offset + 176, $trd_cur_tax_amt, value);
	}

	/**
	 * Tax amount 税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(long value) {
		setConstNumber(offset + 176, $trd_cur_tax_amt, value);
	}

	/**
	 * Tax amount 税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(float value) {
		setConstNumber(offset + 176, $trd_cur_tax_amt, value);
	}

	/**
	 * Tax amount 税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(double value) {
		setConstNumber(offset + 176, $trd_cur_tax_amt, value);
	}


	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public MCNumber wtax_rate() {
		return getConstNumber(offset + 177, $wtax_rate);
	}

	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public void wtax_rate(MCNumber value) {
		setConstNumber(offset + 177, $wtax_rate, value);
	}

	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public void wtax_rate(int value) {
		setConstNumber(offset + 177, $wtax_rate, value);
	}

	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public void wtax_rate(long value) {
		setConstNumber(offset + 177, $wtax_rate, value);
	}

	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public void wtax_rate(float value) {
		setConstNumber(offset + 177, $wtax_rate, value);
	}

	/**
	 * Withholding tax rate 源泉税率.<p>
	 *
	 */
	public void wtax_rate(double value) {
		setConstNumber(offset + 177, $wtax_rate, value);
	}


	/**
	 * Withholding tax 源泉税額.<p>
	 *
	 */
	public MCNumber wtax_amt() {
		return getConstNumber(offset + 178, $wtax_amt);
	}

	/**
	 * Withholding tax 源泉税額.<p>
	 *
	 */
	public void wtax_amt(MCNumber value) {
		setConstNumber(offset + 178, $wtax_amt, value);
	}

	/**
	 * Withholding tax 源泉税額.<p>
	 *
	 */
	public void wtax_amt(int value) {
		setConstNumber(offset + 178, $wtax_amt, value);
	}

	/**
	 * Withholding tax 源泉税額.<p>
	 *
	 */
	public void wtax_amt(long value) {
		setConstNumber(offset + 178, $wtax_amt, value);
	}

	/**
	 * Withholding tax 源泉税額.<p>
	 *
	 */
	public void wtax_amt(float value) {
		setConstNumber(offset + 178, $wtax_amt, value);
	}

	/**
	 * Withholding tax 源泉税額.<p>
	 *
	 */
	public void wtax_amt(double value) {
		setConstNumber(offset + 178, $wtax_amt, value);
	}


	/**
	 * Billing carry-over count 請求繰越回数.<p>
	 *
	 */
	public MCNumber bill_crryovr_times() {
		return getConstNumber(offset + 179, $bill_crryovr_times);
	}

	/**
	 * Billing carry-over count 請求繰越回数.<p>
	 *
	 */
	public void bill_crryovr_times(MCNumber value) {
		setConstNumber(offset + 179, $bill_crryovr_times, value);
	}

	/**
	 * Billing carry-over count 請求繰越回数.<p>
	 *
	 */
	public void bill_crryovr_times(int value) {
		setConstNumber(offset + 179, $bill_crryovr_times, value);
	}

	/**
	 * Billing carry-over count 請求繰越回数.<p>
	 *
	 */
	public void bill_crryovr_times(long value) {
		setConstNumber(offset + 179, $bill_crryovr_times, value);
	}

	/**
	 * Billing carry-over count 請求繰越回数.<p>
	 *
	 */
	public void bill_crryovr_times(float value) {
		setConstNumber(offset + 179, $bill_crryovr_times, value);
	}

	/**
	 * Billing carry-over count 請求繰越回数.<p>
	 *
	 */
	public void bill_crryovr_times(double value) {
		setConstNumber(offset + 179, $bill_crryovr_times, value);
	}


	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public String gd_cd() {
		return getConstString(offset + 180, $gd_cd);
	}

	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public void gd_cd(String value) {
		setConstString(offset + 180, $gd_cd, value);
	}


	/**
	 * Grading name 格付名.<p>
	 *
	 */
	public String gd_nm() {
		return getConstString(offset + 181, $gd_nm);
	}

	/**
	 * Grading name 格付名.<p>
	 *
	 */
	public void gd_nm(String value) {
		setConstString(offset + 181, $gd_nm, value);
	}


	/**
	 * Numbering SEIBAN No. 手配ＮＯ発番.<p>
	 *
	 */
	public boolean sno_num_flg() {
		return getConstBoolean(offset + 182, $sno_num_flg);
	}

	/**
	 * Numbering SEIBAN No. 手配ＮＯ発番.<p>
	 *
	 */
	public void sno_num_flg(boolean value) {
		setConstBoolean(offset + 182, $sno_num_flg, value);
	}


	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public String sno1() {
		return getConstString(offset + 183, $sno1);
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public void sno1(String value) {
		setConstString(offset + 183, $sno1, value);
	}


	/**
	 * Allow without SEIBAN No. 1 手配ＮＯ１無し可.<p>
	 *
	 */
	public boolean sno1_null_flg() {
		return getConstBoolean(offset + 184, $sno1_null_flg);
	}

	/**
	 * Allow without SEIBAN No. 1 手配ＮＯ１無し可.<p>
	 *
	 */
	public void sno1_null_flg(boolean value) {
		setConstBoolean(offset + 184, $sno1_null_flg, value);
	}


	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public String sno2() {
		return getConstString(offset + 185, $sno2);
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public void sno2(String value) {
		setConstString(offset + 185, $sno2, value);
	}


	/**
	 * Allow without SEIBAN No. 2 手配ＮＯ２無し可.<p>
	 *
	 */
	public boolean sno2_null_flg() {
		return getConstBoolean(offset + 186, $sno2_null_flg);
	}

	/**
	 * Allow without SEIBAN No. 2 手配ＮＯ２無し可.<p>
	 *
	 */
	public void sno2_null_flg(boolean value) {
		setConstBoolean(offset + 186, $sno2_null_flg, value);
	}


	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public String sno3() {
		return getConstString(offset + 187, $sno3);
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public void sno3(String value) {
		setConstString(offset + 187, $sno3, value);
	}


	/**
	 * Allow without SEIBAN No. 3 手配ＮＯ３無し可.<p>
	 *
	 */
	public boolean sno3_null_flg() {
		return getConstBoolean(offset + 188, $sno3_null_flg);
	}

	/**
	 * Allow without SEIBAN No. 3 手配ＮＯ３無し可.<p>
	 *
	 */
	public void sno3_null_flg(boolean value) {
		setConstBoolean(offset + 188, $sno3_null_flg, value);
	}


	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public String sno4() {
		return getConstString(offset + 189, $sno4);
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public void sno4(String value) {
		setConstString(offset + 189, $sno4, value);
	}


	/**
	 * Allow without SEIBAN No. 4 手配ＮＯ４無し可.<p>
	 *
	 */
	public boolean sno4_null_flg() {
		return getConstBoolean(offset + 190, $sno4_null_flg);
	}

	/**
	 * Allow without SEIBAN No. 4 手配ＮＯ４無し可.<p>
	 *
	 */
	public void sno4_null_flg(boolean value) {
		setConstBoolean(offset + 190, $sno4_null_flg, value);
	}


	/**
	 * SEIBAN No. 1 management type 手配ＮＯ１管理区分.<p>
	 *
	 */
	public String sno1_mng_typ() {
		return getConstString(offset + 191, $sno1_mng_typ);
	}

	/**
	 * SEIBAN No. 1 management type 手配ＮＯ１管理区分.<p>
	 *
	 */
	public void sno1_mng_typ(String value) {
		setConstString(offset + 191, $sno1_mng_typ, value);
	}


	/**
	 * SEIBAN No. 2 management type 手配ＮＯ２管理区分.<p>
	 *
	 */
	public String sno2_mng_typ() {
		return getConstString(offset + 192, $sno2_mng_typ);
	}

	/**
	 * SEIBAN No. 2 management type 手配ＮＯ２管理区分.<p>
	 *
	 */
	public void sno2_mng_typ(String value) {
		setConstString(offset + 192, $sno2_mng_typ, value);
	}


	/**
	 * SEIBAN No. 3 management type 手配ＮＯ３管理区分.<p>
	 *
	 */
	public String sno3_mng_typ() {
		return getConstString(offset + 193, $sno3_mng_typ);
	}

	/**
	 * SEIBAN No. 3 management type 手配ＮＯ３管理区分.<p>
	 *
	 */
	public void sno3_mng_typ(String value) {
		setConstString(offset + 193, $sno3_mng_typ, value);
	}


	/**
	 * SEIBAN No. 4 management type 手配ＮＯ４管理区分.<p>
	 *
	 */
	public String sno4_mng_typ() {
		return getConstString(offset + 194, $sno4_mng_typ);
	}

	/**
	 * SEIBAN No. 4 management type 手配ＮＯ４管理区分.<p>
	 *
	 */
	public void sno4_mng_typ(String value) {
		setConstString(offset + 194, $sno4_mng_typ, value);
	}


	/**
	 * SEIBAN No. 1 numbering type 手配ＮＯ１発番区分.<p>
	 *
	 */
	public String sno1_num_typ() {
		return getConstString(offset + 195, $sno1_num_typ);
	}

	/**
	 * SEIBAN No. 1 numbering type 手配ＮＯ１発番区分.<p>
	 *
	 */
	public void sno1_num_typ(String value) {
		setConstString(offset + 195, $sno1_num_typ, value);
	}


	/**
	 * SEIBAN No. 2 numbering type 手配ＮＯ２発番区分.<p>
	 *
	 */
	public String sno2_num_typ() {
		return getConstString(offset + 196, $sno2_num_typ);
	}

	/**
	 * SEIBAN No. 2 numbering type 手配ＮＯ２発番区分.<p>
	 *
	 */
	public void sno2_num_typ(String value) {
		setConstString(offset + 196, $sno2_num_typ, value);
	}


	/**
	 * SEIBAN No. 3 numbering type 手配ＮＯ３発番区分.<p>
	 *
	 */
	public String sno3_num_typ() {
		return getConstString(offset + 197, $sno3_num_typ);
	}

	/**
	 * SEIBAN No. 3 numbering type 手配ＮＯ３発番区分.<p>
	 *
	 */
	public void sno3_num_typ(String value) {
		setConstString(offset + 197, $sno3_num_typ, value);
	}


	/**
	 * SEIBAN No. 4 numbering type 手配ＮＯ４発番区分.<p>
	 *
	 */
	public String sno4_num_typ() {
		return getConstString(offset + 198, $sno4_num_typ);
	}

	/**
	 * SEIBAN No. 4 numbering type 手配ＮＯ４発番区分.<p>
	 *
	 */
	public void sno4_num_typ(String value) {
		setConstString(offset + 198, $sno4_num_typ, value);
	}


	/**
	 * SEIBAN No. 1 numbering pattern cd. 手配ＮＯ１発番パタンＣＤ.<p>
	 *
	 */
	public String sno1_ptn_cd() {
		return getConstString(offset + 199, $sno1_ptn_cd);
	}

	/**
	 * SEIBAN No. 1 numbering pattern cd. 手配ＮＯ１発番パタンＣＤ.<p>
	 *
	 */
	public void sno1_ptn_cd(String value) {
		setConstString(offset + 199, $sno1_ptn_cd, value);
	}


	/**
	 * SEIBAN No. 2 numbering pattern cd. 手配ＮＯ２発番パタンＣＤ.<p>
	 *
	 */
	public String sno2_ptn_cd() {
		return getConstString(offset + 200, $sno2_ptn_cd);
	}

	/**
	 * SEIBAN No. 2 numbering pattern cd. 手配ＮＯ２発番パタンＣＤ.<p>
	 *
	 */
	public void sno2_ptn_cd(String value) {
		setConstString(offset + 200, $sno2_ptn_cd, value);
	}


	/**
	 * SEIBAN No. 3 numbering pattern cd. 手配ＮＯ３発番パタンＣＤ.<p>
	 *
	 */
	public String sno3_ptn_cd() {
		return getConstString(offset + 201, $sno3_ptn_cd);
	}

	/**
	 * SEIBAN No. 3 numbering pattern cd. 手配ＮＯ３発番パタンＣＤ.<p>
	 *
	 */
	public void sno3_ptn_cd(String value) {
		setConstString(offset + 201, $sno3_ptn_cd, value);
	}


	/**
	 * SEIBAN No. 4 numbering pattern cd. 手配ＮＯ４発番パタンＣＤ.<p>
	 *
	 */
	public String sno4_ptn_cd() {
		return getConstString(offset + 202, $sno4_ptn_cd);
	}

	/**
	 * SEIBAN No. 4 numbering pattern cd. 手配ＮＯ４発番パタンＣＤ.<p>
	 *
	 */
	public void sno4_ptn_cd(String value) {
		setConstString(offset + 202, $sno4_ptn_cd, value);
	}


	/**
	 * Sales order SEIBAN No. 1 required 受注手配ＮＯ１必須.<p>
	 *
	 */
	public boolean slo_sno1_flg() {
		return getConstBoolean(offset + 203, $slo_sno1_flg);
	}

	/**
	 * Sales order SEIBAN No. 1 required 受注手配ＮＯ１必須.<p>
	 *
	 */
	public void slo_sno1_flg(boolean value) {
		setConstBoolean(offset + 203, $slo_sno1_flg, value);
	}


	/**
	 * Sales order SEIBAN No. 2 required 受注手配ＮＯ２必須.<p>
	 *
	 */
	public boolean slo_sno2_flg() {
		return getConstBoolean(offset + 204, $slo_sno2_flg);
	}

	/**
	 * Sales order SEIBAN No. 2 required 受注手配ＮＯ２必須.<p>
	 *
	 */
	public void slo_sno2_flg(boolean value) {
		setConstBoolean(offset + 204, $slo_sno2_flg, value);
	}


	/**
	 * Sales order SEIBAN No. 3 required 受注手配ＮＯ３必須.<p>
	 *
	 */
	public boolean slo_sno3_flg() {
		return getConstBoolean(offset + 205, $slo_sno3_flg);
	}

	/**
	 * Sales order SEIBAN No. 3 required 受注手配ＮＯ３必須.<p>
	 *
	 */
	public void slo_sno3_flg(boolean value) {
		setConstBoolean(offset + 205, $slo_sno3_flg, value);
	}


	/**
	 * Sales order SEIBAN No. 4 required 受注手配ＮＯ４必須.<p>
	 *
	 */
	public boolean slo_sno4_flg() {
		return getConstBoolean(offset + 206, $slo_sno4_flg);
	}

	/**
	 * Sales order SEIBAN No. 4 required 受注手配ＮＯ４必須.<p>
	 *
	 */
	public void slo_sno4_flg(boolean value) {
		setConstBoolean(offset + 206, $slo_sno4_flg, value);
	}


	/**
	 * Assortment group No. 品揃グループＮＯ.<p>
	 *
	 */
	public MCNumber set_itm_grp_no() {
		return getConstNumber(offset + 207, $set_itm_grp_no);
	}

	/**
	 * Assortment group No. 品揃グループＮＯ.<p>
	 *
	 */
	public void set_itm_grp_no(MCNumber value) {
		setConstNumber(offset + 207, $set_itm_grp_no, value);
	}

	/**
	 * Assortment group No. 品揃グループＮＯ.<p>
	 *
	 */
	public void set_itm_grp_no(int value) {
		setConstNumber(offset + 207, $set_itm_grp_no, value);
	}

	/**
	 * Assortment group No. 品揃グループＮＯ.<p>
	 *
	 */
	public void set_itm_grp_no(long value) {
		setConstNumber(offset + 207, $set_itm_grp_no, value);
	}

	/**
	 * Assortment group No. 品揃グループＮＯ.<p>
	 *
	 */
	public void set_itm_grp_no(float value) {
		setConstNumber(offset + 207, $set_itm_grp_no, value);
	}

	/**
	 * Assortment group No. 品揃グループＮＯ.<p>
	 *
	 */
	public void set_itm_grp_no(double value) {
		setConstNumber(offset + 207, $set_itm_grp_no, value);
	}


	/**
	 * Desired shipping date and time 出荷希望日時.<p>
	 *
	 */
	public MCDate ship_rqst_tm() {
		return getConstDate(offset + 208, $ship_rqst_tm);
	}

	/**
	 * Desired shipping date and time 出荷希望日時.<p>
	 *
	 */
	public void ship_rqst_tm(MCDate value) {
		setConstDate(offset + 208, $ship_rqst_tm, value);
	}


	/**
	 * Desired shipping date 出荷希望日.<p>
	 *
	 */
	public MCDate ship_rqst_dt() {
		return getConstDate(offset + 209, $ship_rqst_dt);
	}

	/**
	 * Desired shipping date 出荷希望日.<p>
	 *
	 */
	public void ship_rqst_dt(MCDate value) {
		setConstDate(offset + 209, $ship_rqst_dt, value);
	}


	/**
	 * Desired shipping time 出荷希望時刻.<p>
	 *
	 */
	public MCDate ship_rqst_hm() {
		return getConstDate(offset + 210, $ship_rqst_hm);
	}

	/**
	 * Desired shipping time 出荷希望時刻.<p>
	 *
	 */
	public void ship_rqst_hm(MCDate value) {
		setConstDate(offset + 210, $ship_rqst_hm, value);
	}


	/**
	 * Desired delivery date and time 納入希望日時.<p>
	 *
	 */
	public MCDate dlv_rqst_tm() {
		return getConstDate(offset + 211, $dlv_rqst_tm);
	}

	/**
	 * Desired delivery date and time 納入希望日時.<p>
	 *
	 */
	public void dlv_rqst_tm(MCDate value) {
		setConstDate(offset + 211, $dlv_rqst_tm, value);
	}


	/**
	 * Desired delivery date 納入希望日.<p>
	 *
	 */
	public MCDate dlv_rqst_dt() {
		return getConstDate(offset + 212, $dlv_rqst_dt);
	}

	/**
	 * Desired delivery date 納入希望日.<p>
	 *
	 */
	public void dlv_rqst_dt(MCDate value) {
		setConstDate(offset + 212, $dlv_rqst_dt, value);
	}


	/**
	 * Desired delivery time 納入希望時刻.<p>
	 *
	 */
	public MCDate dlv_rqst_hm() {
		return getConstDate(offset + 213, $dlv_rqst_hm);
	}

	/**
	 * Desired delivery time 納入希望時刻.<p>
	 *
	 */
	public void dlv_rqst_hm(MCDate value) {
		setConstDate(offset + 213, $dlv_rqst_hm, value);
	}


	/**
	 * Delivery request date 納品依頼日.<p>
	 *
	 */
	public MCDate pd_inst_dlv_dt() {
		return getConstDate(offset + 214, $pd_inst_dlv_dt);
	}

	/**
	 * Delivery request date 納品依頼日.<p>
	 *
	 */
	public void pd_inst_dlv_dt(MCDate value) {
		setConstDate(offset + 214, $pd_inst_dlv_dt, value);
	}


	/**
	 * Delivery request time 納品依頼時刻.<p>
	 *
	 */
	public MCDate pd_inst_dlv_hm() {
		return getConstDate(offset + 215, $pd_inst_dlv_hm);
	}

	/**
	 * Delivery request time 納品依頼時刻.<p>
	 *
	 */
	public void pd_inst_dlv_hm(MCDate value) {
		setConstDate(offset + 215, $pd_inst_dlv_hm, value);
	}


	/**
	 * Scheduled acceptance date 検収予定日.<p>
	 *
	 */
	public MCDate accpt_schd_dt() {
		return getConstDate(offset + 216, $accpt_schd_dt);
	}

	/**
	 * Scheduled acceptance date 検収予定日.<p>
	 *
	 */
	public void accpt_schd_dt(MCDate value) {
		setConstDate(offset + 216, $accpt_schd_dt, value);
	}


	/**
	 * Scheduled sales date 売上予定日.<p>
	 *
	 */
	public MCDate sls_schd_dt() {
		return getConstDate(offset + 217, $sls_schd_dt);
	}

	/**
	 * Scheduled sales date 売上予定日.<p>
	 *
	 */
	public void sls_schd_dt(MCDate value) {
		setConstDate(offset + 217, $sls_schd_dt, value);
	}


	/**
	 * Split shipping schedule 出荷予定分割.<p>
	 *
	 */
	public boolean ship_schd_split_flg() {
		return getConstBoolean(offset + 218, $ship_schd_split_flg);
	}

	/**
	 * Split shipping schedule 出荷予定分割.<p>
	 *
	 */
	public void ship_schd_split_flg(boolean value) {
		setConstBoolean(offset + 218, $ship_schd_split_flg, value);
	}


	/**
	 * Shipping available 出荷可能.<p>
	 *
	 */
	public boolean ship_abl_flg() {
		return getConstBoolean(offset + 219, $ship_abl_flg);
	}

	/**
	 * Shipping available 出荷可能.<p>
	 *
	 */
	public void ship_abl_flg(boolean value) {
		setConstBoolean(offset + 219, $ship_abl_flg, value);
	}


	/**
	 * Scheduled shipping date and time 出荷予定日時.<p>
	 *
	 */
	public MCDate ship_schd_tm() {
		return getConstDate(offset + 220, $ship_schd_tm);
	}

	/**
	 * Scheduled shipping date and time 出荷予定日時.<p>
	 *
	 */
	public void ship_schd_tm(MCDate value) {
		setConstDate(offset + 220, $ship_schd_tm, value);
	}


	/**
	 * Scheduled shipping date 出荷予定日.<p>
	 *
	 */
	public MCDate ship_schd_dt() {
		return getConstDate(offset + 221, $ship_schd_dt);
	}

	/**
	 * Scheduled shipping date 出荷予定日.<p>
	 *
	 */
	public void ship_schd_dt(MCDate value) {
		setConstDate(offset + 221, $ship_schd_dt, value);
	}


	/**
	 * Shipping schedule time 出荷予定時刻.<p>
	 *
	 */
	public MCDate ship_schd_hm() {
		return getConstDate(offset + 222, $ship_schd_hm);
	}

	/**
	 * Shipping schedule time 出荷予定時刻.<p>
	 *
	 */
	public void ship_schd_hm(MCDate value) {
		setConstDate(offset + 222, $ship_schd_hm, value);
	}


	/**
	 * Scheduled delivery date and time 納品予定日時.<p>
	 *
	 */
	public MCDate dlv_schd_tm() {
		return getConstDate(offset + 223, $dlv_schd_tm);
	}

	/**
	 * Scheduled delivery date and time 納品予定日時.<p>
	 *
	 */
	public void dlv_schd_tm(MCDate value) {
		setConstDate(offset + 223, $dlv_schd_tm, value);
	}


	/**
	 * Scheduled delivery date 納品予定日.<p>
	 *
	 */
	public MCDate dlv_schd_dt() {
		return getConstDate(offset + 224, $dlv_schd_dt);
	}

	/**
	 * Scheduled delivery date 納品予定日.<p>
	 *
	 */
	public void dlv_schd_dt(MCDate value) {
		setConstDate(offset + 224, $dlv_schd_dt, value);
	}


	/**
	 * Schedule delivery time 納品予定時刻.<p>
	 *
	 */
	public MCDate dlv_schd_hm() {
		return getConstDate(offset + 225, $dlv_schd_hm);
	}

	/**
	 * Schedule delivery time 納品予定時刻.<p>
	 *
	 */
	public void dlv_schd_hm(MCDate value) {
		setConstDate(offset + 225, $dlv_schd_hm, value);
	}


	/**
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public String dlv_cd() {
		return getConstString(offset + 226, $dlv_cd);
	}

	/**
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public void dlv_cd(String value) {
		setConstString(offset + 226, $dlv_cd, value);
	}


	/**
	 * Miscellaneous delivery destination 納品先諸口.<p>
	 *
	 */
	public boolean dlv_sundry_flg() {
		return getConstBoolean(offset + 227, $dlv_sundry_flg);
	}

	/**
	 * Miscellaneous delivery destination 納品先諸口.<p>
	 *
	 */
	public void dlv_sundry_flg(boolean value) {
		setConstBoolean(offset + 227, $dlv_sundry_flg, value);
	}


	/**
	 * Delivery destination name 納品先名.<p>
	 *
	 */
	public String dlv_nm() {
		return getConstString(offset + 228, $dlv_nm);
	}

	/**
	 * Delivery destination name 納品先名.<p>
	 *
	 */
	public void dlv_nm(String value) {
		setConstString(offset + 228, $dlv_nm, value);
	}


	/**
	 * Delivery destination dept. 納品先部署.<p>
	 *
	 */
	public String dlv_cntct_dpt() {
		return getConstString(offset + 229, $dlv_cntct_dpt);
	}

	/**
	 * Delivery destination dept. 納品先部署.<p>
	 *
	 */
	public void dlv_cntct_dpt(String value) {
		setConstString(offset + 229, $dlv_cntct_dpt, value);
	}


	/**
	 * Delivery destination PIC 納品先担当者.<p>
	 *
	 */
	public String dlv_cntct_psn() {
		return getConstString(offset + 230, $dlv_cntct_psn);
	}

	/**
	 * Delivery destination PIC 納品先担当者.<p>
	 *
	 */
	public void dlv_cntct_psn(String value) {
		setConstString(offset + 230, $dlv_cntct_psn, value);
	}


	/**
	 * Zip code (Delivery destination) 納品先郵便番号.<p>
	 *
	 */
	public String dlv_zip_cd() {
		return getConstString(offset + 231, $dlv_zip_cd);
	}

	/**
	 * Zip code (Delivery destination) 納品先郵便番号.<p>
	 *
	 */
	public void dlv_zip_cd(String value) {
		setConstString(offset + 231, $dlv_zip_cd, value);
	}


	/**
	 * Address 1 (Delivery destination) 納品先住所１.<p>
	 *
	 */
	public String dlv_addr1() {
		return getConstString(offset + 232, $dlv_addr1);
	}

	/**
	 * Address 1 (Delivery destination) 納品先住所１.<p>
	 *
	 */
	public void dlv_addr1(String value) {
		setConstString(offset + 232, $dlv_addr1, value);
	}


	/**
	 * Address 2 (Delivery destination) 納品先住所２.<p>
	 *
	 */
	public String dlv_addr2() {
		return getConstString(offset + 233, $dlv_addr2);
	}

	/**
	 * Address 2 (Delivery destination) 納品先住所２.<p>
	 *
	 */
	public void dlv_addr2(String value) {
		setConstString(offset + 233, $dlv_addr2, value);
	}


	/**
	 * Address 3 (Delivery destination) 納品先住所３.<p>
	 *
	 */
	public String dlv_addr3() {
		return getConstString(offset + 234, $dlv_addr3);
	}

	/**
	 * Address 3 (Delivery destination) 納品先住所３.<p>
	 *
	 */
	public void dlv_addr3(String value) {
		setConstString(offset + 234, $dlv_addr3, value);
	}


	/**
	 * Address 4 (Delivery destination) 納品先住所４.<p>
	 *
	 */
	public String dlv_addr4() {
		return getConstString(offset + 235, $dlv_addr4);
	}

	/**
	 * Address 4 (Delivery destination) 納品先住所４.<p>
	 *
	 */
	public void dlv_addr4(String value) {
		setConstString(offset + 235, $dlv_addr4, value);
	}


	/**
	 * TEL (Delivery destination) 納品先ＴＥＬ.<p>
	 *
	 */
	public String dlv_tel() {
		return getConstString(offset + 236, $dlv_tel);
	}

	/**
	 * TEL (Delivery destination) 納品先ＴＥＬ.<p>
	 *
	 */
	public void dlv_tel(String value) {
		setConstString(offset + 236, $dlv_tel, value);
	}


	/**
	 * FAX (Delivery destination) 納品先ＦＡＸ.<p>
	 *
	 */
	public String dlv_fax() {
		return getConstString(offset + 237, $dlv_fax);
	}

	/**
	 * FAX (Delivery destination) 納品先ＦＡＸ.<p>
	 *
	 */
	public void dlv_fax(String value) {
		setConstString(offset + 237, $dlv_fax, value);
	}


	/**
	 * Delivery destination country cd. 納品先国ＣＤ.<p>
	 *
	 */
	public String dlv_cntry_cd() {
		return getConstString(offset + 238, $dlv_cntry_cd);
	}

	/**
	 * Delivery destination country cd. 納品先国ＣＤ.<p>
	 *
	 */
	public void dlv_cntry_cd(String value) {
		setConstString(offset + 238, $dlv_cntry_cd, value);
	}


	/**
	 * Delivery destination country name 納品先国名.<p>
	 *
	 */
	public String dlv_cntry_nm() {
		return getConstString(offset + 239, $dlv_cntry_nm);
	}

	/**
	 * Delivery destination country name 納品先国名.<p>
	 *
	 */
	public void dlv_cntry_nm(String value) {
		setConstString(offset + 239, $dlv_cntry_nm, value);
	}


	/**
	 * Delivery destination distribution group cd. 納品先物流グループＣＤ.<p>
	 *
	 */
	public String dlv_lg_grp_cd() {
		return getConstString(offset + 240, $dlv_lg_grp_cd);
	}

	/**
	 * Delivery destination distribution group cd. 納品先物流グループＣＤ.<p>
	 *
	 */
	public void dlv_lg_grp_cd(String value) {
		setConstString(offset + 240, $dlv_lg_grp_cd, value);
	}


	/**
	 * Delivery destination distribution group name 納品先物流グループ名.<p>
	 *
	 */
	public String dlv_lg_grp_nm() {
		return getConstString(offset + 241, $dlv_lg_grp_nm);
	}

	/**
	 * Delivery destination distribution group name 納品先物流グループ名.<p>
	 *
	 */
	public void dlv_lg_grp_nm(String value) {
		setConstString(offset + 241, $dlv_lg_grp_nm, value);
	}


	/**
	 * Print price type 価格印字区分.<p>
	 *
	 */
	public String pri_prnt_typ() {
		return getConstString(offset + 242, $pri_prnt_typ);
	}

	/**
	 * Print price type 価格印字区分.<p>
	 *
	 */
	public void pri_prnt_typ(String value) {
		setConstString(offset + 242, $pri_prnt_typ, value);
	}


	/**
	 * Print price 価格印字.<p>
	 *
	 */
	public boolean pri_prnt_flg() {
		return getConstBoolean(offset + 243, $pri_prnt_flg);
	}

	/**
	 * Print price 価格印字.<p>
	 *
	 */
	public void pri_prnt_flg(boolean value) {
		setConstBoolean(offset + 243, $pri_prnt_flg, value);
	}


	/**
	 * Distribution channel cd. 1 仕向先ＣＤ１.<p>
	 *
	 */
	public String dest_cd1() {
		return getConstString(offset + 244, $dest_cd1);
	}

	/**
	 * Distribution channel cd. 1 仕向先ＣＤ１.<p>
	 *
	 */
	public void dest_cd1(String value) {
		setConstString(offset + 244, $dest_cd1, value);
	}


	/**
	 * Distribution channel name 1 仕向先１名.<p>
	 *
	 */
	public String dest_nm1() {
		return getConstString(offset + 245, $dest_nm1);
	}

	/**
	 * Distribution channel name 1 仕向先１名.<p>
	 *
	 */
	public void dest_nm1(String value) {
		setConstString(offset + 245, $dest_nm1, value);
	}


	/**
	 * Distribution channel cd. 2 仕向先ＣＤ２.<p>
	 *
	 */
	public String dest_cd2() {
		return getConstString(offset + 246, $dest_cd2);
	}

	/**
	 * Distribution channel cd. 2 仕向先ＣＤ２.<p>
	 *
	 */
	public void dest_cd2(String value) {
		setConstString(offset + 246, $dest_cd2, value);
	}


	/**
	 * Distribution channel name 2 仕向先２名.<p>
	 *
	 */
	public String dest_nm2() {
		return getConstString(offset + 247, $dest_nm2);
	}

	/**
	 * Distribution channel name 2 仕向先２名.<p>
	 *
	 */
	public void dest_nm2(String value) {
		setConstString(offset + 247, $dest_nm2, value);
	}


	/**
	 * Distribution channel cd. 3 仕向先ＣＤ３.<p>
	 *
	 */
	public String dest_cd3() {
		return getConstString(offset + 248, $dest_cd3);
	}

	/**
	 * Distribution channel cd. 3 仕向先ＣＤ３.<p>
	 *
	 */
	public void dest_cd3(String value) {
		setConstString(offset + 248, $dest_cd3, value);
	}


	/**
	 * Distribution channel name 3 仕向先３名.<p>
	 *
	 */
	public String dest_nm3() {
		return getConstString(offset + 249, $dest_nm3);
	}

	/**
	 * Distribution channel name 3 仕向先３名.<p>
	 *
	 */
	public void dest_nm3(String value) {
		setConstString(offset + 249, $dest_nm3, value);
	}


	/**
	 * Receiving point cd. 配送先ＣＤ.<p>
	 *
	 */
	public String tdlv_cd() {
		return getConstString(offset + 250, $tdlv_cd);
	}

	/**
	 * Receiving point cd. 配送先ＣＤ.<p>
	 *
	 */
	public void tdlv_cd(String value) {
		setConstString(offset + 250, $tdlv_cd, value);
	}


	/**
	 * Receiving point required 配送先必須.<p>
	 *
	 */
	public boolean tdlv_req_flg() {
		return getConstBoolean(offset + 251, $tdlv_req_flg);
	}

	/**
	 * Receiving point required 配送先必須.<p>
	 *
	 */
	public void tdlv_req_flg(boolean value) {
		setConstBoolean(offset + 251, $tdlv_req_flg, value);
	}


	/**
	 * Receiving point name 配送先名.<p>
	 *
	 */
	public String tdlv_nm() {
		return getConstString(offset + 252, $tdlv_nm);
	}

	/**
	 * Receiving point name 配送先名.<p>
	 *
	 */
	public void tdlv_nm(String value) {
		setConstString(offset + 252, $tdlv_nm, value);
	}


	/**
	 * Receiving point stopover type 配送先経由区分.<p>
	 *
	 */
	public String via_dlv_typ() {
		return getConstString(offset + 253, $via_dlv_typ);
	}

	/**
	 * Receiving point stopover type 配送先経由区分.<p>
	 *
	 */
	public void via_dlv_typ(String value) {
		setConstString(offset + 253, $via_dlv_typ, value);
	}


	/**
	 * Receiving point stopover name 配送先経由区分名.<p>
	 *
	 */
	public String via_dlv_typ_nm() {
		return getConstString(offset + 254, $via_dlv_typ_nm);
	}

	/**
	 * Receiving point stopover name 配送先経由区分名.<p>
	 *
	 */
	public void via_dlv_typ_nm(String value) {
		setConstString(offset + 254, $via_dlv_typ_nm, value);
	}


	/**
	 * Miscellaneous receiving point 配送先諸口.<p>
	 *
	 */
	public boolean tdlv_sundry_flg() {
		return getConstBoolean(offset + 255, $tdlv_sundry_flg);
	}

	/**
	 * Miscellaneous receiving point 配送先諸口.<p>
	 *
	 */
	public void tdlv_sundry_flg(boolean value) {
		setConstBoolean(offset + 255, $tdlv_sundry_flg, value);
	}


	/**
	 * Receiving point dept. 配送先部署.<p>
	 *
	 */
	public String tdlv_cntct_dpt() {
		return getConstString(offset + 256, $tdlv_cntct_dpt);
	}

	/**
	 * Receiving point dept. 配送先部署.<p>
	 *
	 */
	public void tdlv_cntct_dpt(String value) {
		setConstString(offset + 256, $tdlv_cntct_dpt, value);
	}


	/**
	 * Receiving point PIC 配送先担当者.<p>
	 *
	 */
	public String tdlv_cntct_psn() {
		return getConstString(offset + 257, $tdlv_cntct_psn);
	}

	/**
	 * Receiving point PIC 配送先担当者.<p>
	 *
	 */
	public void tdlv_cntct_psn(String value) {
		setConstString(offset + 257, $tdlv_cntct_psn, value);
	}


	/**
	 * Receiving point zip code 配送先郵便番号.<p>
	 *
	 */
	public String tdlv_zip_cd() {
		return getConstString(offset + 258, $tdlv_zip_cd);
	}

	/**
	 * Receiving point zip code 配送先郵便番号.<p>
	 *
	 */
	public void tdlv_zip_cd(String value) {
		setConstString(offset + 258, $tdlv_zip_cd, value);
	}


	/**
	 * Receiving point address 1 配送先住所１.<p>
	 *
	 */
	public String tdlv_addr1() {
		return getConstString(offset + 259, $tdlv_addr1);
	}

	/**
	 * Receiving point address 1 配送先住所１.<p>
	 *
	 */
	public void tdlv_addr1(String value) {
		setConstString(offset + 259, $tdlv_addr1, value);
	}


	/**
	 * Receiving point address 2 配送先住所２.<p>
	 *
	 */
	public String tdlv_addr2() {
		return getConstString(offset + 260, $tdlv_addr2);
	}

	/**
	 * Receiving point address 2 配送先住所２.<p>
	 *
	 */
	public void tdlv_addr2(String value) {
		setConstString(offset + 260, $tdlv_addr2, value);
	}


	/**
	 * Receiving point address 3 配送先住所３.<p>
	 *
	 */
	public String tdlv_addr3() {
		return getConstString(offset + 261, $tdlv_addr3);
	}

	/**
	 * Receiving point address 3 配送先住所３.<p>
	 *
	 */
	public void tdlv_addr3(String value) {
		setConstString(offset + 261, $tdlv_addr3, value);
	}


	/**
	 * Receiving point address 4 配送先住所４.<p>
	 *
	 */
	public String tdlv_addr4() {
		return getConstString(offset + 262, $tdlv_addr4);
	}

	/**
	 * Receiving point address 4 配送先住所４.<p>
	 *
	 */
	public void tdlv_addr4(String value) {
		setConstString(offset + 262, $tdlv_addr4, value);
	}


	/**
	 * Receiving point TEL 配送先ＴＥＬ.<p>
	 *
	 */
	public String tdlv_tel() {
		return getConstString(offset + 263, $tdlv_tel);
	}

	/**
	 * Receiving point TEL 配送先ＴＥＬ.<p>
	 *
	 */
	public void tdlv_tel(String value) {
		setConstString(offset + 263, $tdlv_tel, value);
	}


	/**
	 * Receiving point FAX 配送先ＦＡＸ.<p>
	 *
	 */
	public String tdlv_fax() {
		return getConstString(offset + 264, $tdlv_fax);
	}

	/**
	 * Receiving point FAX 配送先ＦＡＸ.<p>
	 *
	 */
	public void tdlv_fax(String value) {
		setConstString(offset + 264, $tdlv_fax, value);
	}


	/**
	 * Receiving point country cd. 配送先国ＣＤ.<p>
	 *
	 */
	public String tdlv_cntry_cd() {
		return getConstString(offset + 265, $tdlv_cntry_cd);
	}

	/**
	 * Receiving point country cd. 配送先国ＣＤ.<p>
	 *
	 */
	public void tdlv_cntry_cd(String value) {
		setConstString(offset + 265, $tdlv_cntry_cd, value);
	}


	/**
	 * Receiving point country name 配送先国名.<p>
	 *
	 */
	public String tdlv_cntry_nm() {
		return getConstString(offset + 266, $tdlv_cntry_nm);
	}

	/**
	 * Receiving point country name 配送先国名.<p>
	 *
	 */
	public void tdlv_cntry_nm(String value) {
		setConstString(offset + 266, $tdlv_cntry_nm, value);
	}


	/**
	 * Receiving point distribution group cd. 配送先物流グループＣＤ.<p>
	 *
	 */
	public String tdlv_lg_grp_cd() {
		return getConstString(offset + 267, $tdlv_lg_grp_cd);
	}

	/**
	 * Receiving point distribution group cd. 配送先物流グループＣＤ.<p>
	 *
	 */
	public void tdlv_lg_grp_cd(String value) {
		setConstString(offset + 267, $tdlv_lg_grp_cd, value);
	}


	/**
	 * Receiving point distribution group name 配送先物流グループ名.<p>
	 *
	 */
	public String tdlv_lg_grp_nm() {
		return getConstString(offset + 268, $tdlv_lg_grp_nm);
	}

	/**
	 * Receiving point distribution group name 配送先物流グループ名.<p>
	 *
	 */
	public void tdlv_lg_grp_nm(String value) {
		setConstString(offset + 268, $tdlv_lg_grp_nm, value);
	}


	/**
	 * Arrival day of week 着曜日.<p>
	 *
	 */
	public String dlv_day_week_typ() {
		return getConstString(offset + 269, $dlv_day_week_typ);
	}

	/**
	 * Arrival day of week 着曜日.<p>
	 *
	 */
	public void dlv_day_week_typ(String value) {
		setConstString(offset + 269, $dlv_day_week_typ, value);
	}


	/**
	 * Arrival day of week 着曜日.<p>
	 *
	 */
	public String dlv_day_week_typ_nm() {
		return getConstString(offset + 270, $dlv_day_week_typ_nm);
	}

	/**
	 * Arrival day of week 着曜日.<p>
	 *
	 */
	public void dlv_day_week_typ_nm(String value) {
		setConstString(offset + 270, $dlv_day_week_typ_nm, value);
	}


	/**
	 * Sales keeping customer inventory 預り売上.<p>
	 *
	 */
	public boolean sls_cststk_flg() {
		return getConstBoolean(offset + 271, $sls_cststk_flg);
	}

	/**
	 * Sales keeping customer inventory 預り売上.<p>
	 *
	 */
	public void sls_cststk_flg(boolean value) {
		setConstBoolean(offset + 271, $sls_cststk_flg, value);
	}


	/**
	 * Procurement type 手配区分.<p>
	 *
	 */
	public String proc_typ() {
		return getConstString(offset + 272, $proc_typ);
	}

	/**
	 * Procurement type 手配区分.<p>
	 *
	 */
	public void proc_typ(String value) {
		setConstString(offset + 272, $proc_typ, value);
	}


	/**
	 * Procurement type name 手配区分名.<p>
	 *
	 */
	public String proc_typ_nm() {
		return getConstString(offset + 273, $proc_typ_nm);
	}

	/**
	 * Procurement type name 手配区分名.<p>
	 *
	 */
	public void proc_typ_nm(String value) {
		setConstString(offset + 273, $proc_typ_nm, value);
	}


	/**
	 * Order type 指図区分.<p>
	 *
	 */
	public String ship_inst_typ() {
		return getConstString(offset + 274, $ship_inst_typ);
	}

	/**
	 * Order type 指図区分.<p>
	 *
	 */
	public void ship_inst_typ(String value) {
		setConstString(offset + 274, $ship_inst_typ, value);
	}


	/**
	 * Order type name 指図区分名.<p>
	 *
	 */
	public String ship_inst_typ_nm() {
		return getConstString(offset + 275, $ship_inst_typ_nm);
	}

	/**
	 * Order type name 指図区分名.<p>
	 *
	 */
	public void ship_inst_typ_nm(String value) {
		setConstString(offset + 275, $ship_inst_typ_nm, value);
	}


	/**
	 * Shipping schedule split type 出荷予定分割区分.<p>
	 *
	 */
	public String ship_schd_split_typ() {
		return getConstString(offset + 276, $ship_schd_split_typ);
	}

	/**
	 * Shipping schedule split type 出荷予定分割区分.<p>
	 *
	 */
	public void ship_schd_split_typ(String value) {
		setConstString(offset + 276, $ship_schd_split_typ, value);
	}


	/**
	 * Shipping schedule split type name 出荷予定分割区分名.<p>
	 *
	 */
	public String ship_schd_split_typ_nm() {
		return getConstString(offset + 277, $ship_schd_split_typ_nm);
	}

	/**
	 * Shipping schedule split type name 出荷予定分割区分名.<p>
	 *
	 */
	public void ship_schd_split_typ_nm(String value) {
		setConstString(offset + 277, $ship_schd_split_typ_nm, value);
	}


	/**
	 * Allocation range type 引当範囲区分.<p>
	 *
	 */
	public String alloc_scope_typ() {
		return getConstString(offset + 278, $alloc_scope_typ);
	}

	/**
	 * Allocation range type 引当範囲区分.<p>
	 *
	 */
	public void alloc_scope_typ(String value) {
		setConstString(offset + 278, $alloc_scope_typ, value);
	}


	/**
	 * Allocation range type name 引当範囲区分名.<p>
	 *
	 */
	public String alloc_scope_typ_nm() {
		return getConstString(offset + 279, $alloc_scope_typ_nm);
	}

	/**
	 * Allocation range type name 引当範囲区分名.<p>
	 *
	 */
	public void alloc_scope_typ_nm(String value) {
		setConstString(offset + 279, $alloc_scope_typ_nm, value);
	}


	/**
	 * Prohibit mixed distribution G 物流Ｇ混在不可.<p>
	 *
	 */
	public boolean not_lg_mix_flg() {
		return getConstBoolean(offset + 280, $not_lg_mix_flg);
	}

	/**
	 * Prohibit mixed distribution G 物流Ｇ混在不可.<p>
	 *
	 */
	public void not_lg_mix_flg(boolean value) {
		setConstBoolean(offset + 280, $not_lg_mix_flg, value);
	}


	/**
	 * Allocation type 引当区分.<p>
	 *
	 */
	public String alloc_typ() {
		return getConstString(offset + 281, $alloc_typ);
	}

	/**
	 * Allocation type 引当区分.<p>
	 *
	 */
	public void alloc_typ(String value) {
		setConstString(offset + 281, $alloc_typ, value);
	}


	/**
	 * Allocation type name 引当区分名.<p>
	 *
	 */
	public String alloc_typ_nm() {
		return getConstString(offset + 282, $alloc_typ_nm);
	}

	/**
	 * Allocation type name 引当区分名.<p>
	 *
	 */
	public void alloc_typ_nm(String value) {
		setConstString(offset + 282, $alloc_typ_nm, value);
	}


	/**
	 * Requested location cd. 依頼先場所ＣＤ.<p>
	 *
	 */
	public String rqst_to_loc_cd() {
		return getConstString(offset + 283, $rqst_to_loc_cd);
	}

	/**
	 * Requested location cd. 依頼先場所ＣＤ.<p>
	 *
	 */
	public void rqst_to_loc_cd(String value) {
		setConstString(offset + 283, $rqst_to_loc_cd, value);
	}


	/**
	 * Location name (Requested) 依頼先場所名.<p>
	 *
	 */
	public String rqst_to_loc_nm() {
		return getConstString(offset + 284, $rqst_to_loc_nm);
	}

	/**
	 * Location name (Requested) 依頼先場所名.<p>
	 *
	 */
	public void rqst_to_loc_nm(String value) {
		setConstString(offset + 284, $rqst_to_loc_nm, value);
	}


	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public String sppl_cd() {
		return getConstString(offset + 285, $sppl_cd);
	}

	/**
	 * Supplier cd. 発注先ＣＤ.<p>
	 *
	 */
	public void sppl_cd(String value) {
		setConstString(offset + 285, $sppl_cd, value);
	}


	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public String sppl_nm() {
		return getConstString(offset + 286, $sppl_nm);
	}

	/**
	 * Supplier name 発注先名.<p>
	 *
	 */
	public void sppl_nm(String value) {
		setConstString(offset + 286, $sppl_nm, value);
	}


	/**
	 * Maker cd. メーカＣＤ.<p>
	 *
	 */
	public String maker_cd() {
		return getConstString(offset + 287, $maker_cd);
	}

	/**
	 * Maker cd. メーカＣＤ.<p>
	 *
	 */
	public void maker_cd(String value) {
		setConstString(offset + 287, $maker_cd, value);
	}


	/**
	 * Maker name メーカ名.<p>
	 *
	 */
	public String maker_nm() {
		return getConstString(offset + 288, $maker_nm);
	}

	/**
	 * Maker name メーカ名.<p>
	 *
	 */
	public void maker_nm(String value) {
		setConstString(offset + 288, $maker_nm, value);
	}


	/**
	 * Request date 依頼日.<p>
	 *
	 */
	public MCDate rqst_dt() {
		return getConstDate(offset + 289, $rqst_dt);
	}

	/**
	 * Request date 依頼日.<p>
	 *
	 */
	public void rqst_dt(MCDate value) {
		setConstDate(offset + 289, $rqst_dt, value);
	}


	/**
	 * Request desired delivery date 依頼納入希望日.<p>
	 *
	 */
	public MCDate rqst_dlv_rqst_dt() {
		return getConstDate(offset + 290, $rqst_dlv_rqst_dt);
	}

	/**
	 * Request desired delivery date 依頼納入希望日.<p>
	 *
	 */
	public void rqst_dlv_rqst_dt(MCDate value) {
		setConstDate(offset + 290, $rqst_dlv_rqst_dt, value);
	}


	/**
	 * Request replied date 依頼回答日.<p>
	 *
	 */
	public MCDate rqst_prms_dt() {
		return getConstDate(offset + 291, $rqst_prms_dt);
	}

	/**
	 * Request replied date 依頼回答日.<p>
	 *
	 */
	public void rqst_prms_dt(MCDate value) {
		setConstDate(offset + 291, $rqst_prms_dt, value);
	}


	/**
	 * Request replied delivery date 依頼回答納入日.<p>
	 *
	 */
	public MCDate rqst_prms_dlv_dt() {
		return getConstDate(offset + 292, $rqst_prms_dlv_dt);
	}

	/**
	 * Request replied delivery date 依頼回答納入日.<p>
	 *
	 */
	public void rqst_prms_dlv_dt(MCDate value) {
		setConstDate(offset + 292, $rqst_prms_dlv_dt, value);
	}


	/**
	 * Requested contact remarks 依頼先連絡備考.<p>
	 *
	 */
	public String wg_rqst_cnt_rmrks() {
		return getConstString(offset + 293, $wg_rqst_cnt_rmrks);
	}

	/**
	 * Requested contact remarks 依頼先連絡備考.<p>
	 *
	 */
	public void wg_rqst_cnt_rmrks(String value) {
		setConstString(offset + 293, $wg_rqst_cnt_rmrks, value);
	}


	/**
	 * Requested WG cd. 依頼先ワーキンググループＣＤ.<p>
	 *
	 */
	public String rqst_to_wg_cd() {
		return getConstString(offset + 294, $rqst_to_wg_cd);
	}

	/**
	 * Requested WG cd. 依頼先ワーキンググループＣＤ.<p>
	 *
	 */
	public void rqst_to_wg_cd(String value) {
		setConstString(offset + 294, $rqst_to_wg_cd, value);
	}


	/**
	 * Gross allocation location group cd. 総量引当場所グループＣＤ.<p>
	 *
	 */
	public String alloc_grp_cd() {
		return getConstString(offset + 295, $alloc_grp_cd);
	}

	/**
	 * Gross allocation location group cd. 総量引当場所グループＣＤ.<p>
	 *
	 */
	public void alloc_grp_cd(String value) {
		setConstString(offset + 295, $alloc_grp_cd, value);
	}


	/**
	 * Gross allocation location group name 総量引当場所グループ名.<p>
	 *
	 */
	public String alloc_grp_nm() {
		return getConstString(offset + 296, $alloc_grp_nm);
	}

	/**
	 * Gross allocation location group name 総量引当場所グループ名.<p>
	 *
	 */
	public void alloc_grp_nm(String value) {
		setConstString(offset + 296, $alloc_grp_nm, value);
	}


	/**
	 * Shipping distribution group cd. 出荷物流グループＣＤ.<p>
	 *
	 */
	public String ship_lg_grp_cd() {
		return getConstString(offset + 297, $ship_lg_grp_cd);
	}

	/**
	 * Shipping distribution group cd. 出荷物流グループＣＤ.<p>
	 *
	 */
	public void ship_lg_grp_cd(String value) {
		setConstString(offset + 297, $ship_lg_grp_cd, value);
	}


	/**
	 * Shipping distribution group name 出荷物流グループ名.<p>
	 *
	 */
	public String ship_lg_grp_nm() {
		return getConstString(offset + 298, $ship_lg_grp_nm);
	}

	/**
	 * Shipping distribution group name 出荷物流グループ名.<p>
	 *
	 */
	public void ship_lg_grp_nm(String value) {
		setConstString(offset + 298, $ship_lg_grp_nm, value);
	}


	/**
	 * Normal shipping location cd. 通常出荷場所ＣＤ.<p>
	 *
	 */
	public String def_loc_cd() {
		return getConstString(offset + 299, $def_loc_cd);
	}

	/**
	 * Normal shipping location cd. 通常出荷場所ＣＤ.<p>
	 *
	 */
	public void def_loc_cd(String value) {
		setConstString(offset + 299, $def_loc_cd, value);
	}


	/**
	 * Normal shipping location name 通常出荷場所名.<p>
	 *
	 */
	public String def_loc_nm() {
		return getConstString(offset + 300, $def_loc_nm);
	}

	/**
	 * Normal shipping location name 通常出荷場所名.<p>
	 *
	 */
	public void def_loc_nm(String value) {
		setConstString(offset + 300, $def_loc_nm, value);
	}


	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public String loc_cd() {
		return getConstString(offset + 301, $loc_cd);
	}

	/**
	 * Location cd. 場所ＣＤ.<p>
	 *
	 */
	public void loc_cd(String value) {
		setConstString(offset + 301, $loc_cd, value);
	}


	/**
	 * Location name 場所名.<p>
	 *
	 */
	public String loc_nm() {
		return getConstString(offset + 302, $loc_nm);
	}

	/**
	 * Location name 場所名.<p>
	 *
	 */
	public void loc_nm(String value) {
		setConstString(offset + 302, $loc_nm, value);
	}


	/**
	 * For rack/line 棚・ライン対象.<p>
	 *
	 */
	public boolean str_ln_tgt_flg() {
		return getConstBoolean(offset + 303, $str_ln_tgt_flg);
	}

	/**
	 * For rack/line 棚・ライン対象.<p>
	 *
	 */
	public void str_ln_tgt_flg(boolean value) {
		setConstBoolean(offset + 303, $str_ln_tgt_flg, value);
	}


	/**
	 * Rack/Line cd. 棚・ラインＣＤ.<p>
	 *
	 */
	public String str_ln_cd() {
		return getConstString(offset + 304, $str_ln_cd);
	}

	/**
	 * Rack/Line cd. 棚・ラインＣＤ.<p>
	 *
	 */
	public void str_ln_cd(String value) {
		setConstString(offset + 304, $str_ln_cd, value);
	}


	/**
	 * Rack/Line name 棚・ライン名.<p>
	 *
	 */
	public String str_ln_nm() {
		return getConstString(offset + 305, $str_ln_nm);
	}

	/**
	 * Rack/Line name 棚・ライン名.<p>
	 *
	 */
	public void str_ln_nm(String value) {
		setConstString(offset + 305, $str_ln_nm, value);
	}


	/**
	 * Without rack/line 棚・ライン無.<p>
	 *
	 */
	public boolean str_ln_cd_none_flg() {
		return getConstBoolean(offset + 306, $str_ln_cd_none_flg);
	}

	/**
	 * Without rack/line 棚・ライン無.<p>
	 *
	 */
	public void str_ln_cd_none_flg(boolean value) {
		setConstBoolean(offset + 306, $str_ln_cd_none_flg, value);
	}


	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public String lot_no() {
		return getConstString(offset + 307, $lot_no);
	}

	/**
	 * Lot No. ロットＮＯ.<p>
	 *
	 */
	public void lot_no(String value) {
		setConstString(offset + 307, $lot_no, value);
	}


	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public String sublot_no() {
		return getConstString(offset + 308, $sublot_no);
	}

	/**
	 * Sublot No. サブロットＮＯ.<p>
	 *
	 */
	public void sublot_no(String value) {
		setConstString(offset + 308, $sublot_no, value);
	}


	/**
	 * Prohibit mixed lots ロット混在不可.<p>
	 *
	 */
	public boolean not_lot_mix_flg() {
		return getConstBoolean(offset + 309, $not_lot_mix_flg);
	}

	/**
	 * Prohibit mixed lots ロット混在不可.<p>
	 *
	 */
	public void not_lot_mix_flg(boolean value) {
		setConstBoolean(offset + 309, $not_lot_mix_flg, value);
	}


	/**
	 * Prohibit mixed sublots サブロット混在不可.<p>
	 *
	 */
	public boolean not_sublot_mix_flg() {
		return getConstBoolean(offset + 310, $not_sublot_mix_flg);
	}

	/**
	 * Prohibit mixed sublots サブロット混在不可.<p>
	 *
	 */
	public void not_sublot_mix_flg(boolean value) {
		setConstBoolean(offset + 310, $not_sublot_mix_flg, value);
	}


	/**
	 * For version control 版管理対象.<p>
	 *
	 */
	public boolean ver_flg() {
		return getConstBoolean(offset + 311, $ver_flg);
	}

	/**
	 * For version control 版管理対象.<p>
	 *
	 */
	public void ver_flg(boolean value) {
		setConstBoolean(offset + 311, $ver_flg, value);
	}


	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public String ver_no() {
		return getConstString(offset + 312, $ver_no);
	}

	/**
	 * Version No. 版ＮＯ.<p>
	 *
	 */
	public void ver_no(String value) {
		setConstString(offset + 312, $ver_no, value);
	}


	/**
	 * Shipping conditions cd. 出荷条件ＣＤ.<p>
	 *
	 */
	public String ship_term_cd() {
		return getConstString(offset + 313, $ship_term_cd);
	}

	/**
	 * Shipping conditions cd. 出荷条件ＣＤ.<p>
	 *
	 */
	public void ship_term_cd(String value) {
		setConstString(offset + 313, $ship_term_cd, value);
	}


	/**
	 * Shipping conditions name 出荷条件名.<p>
	 *
	 */
	public String ship_term_nm() {
		return getConstString(offset + 314, $ship_term_nm);
	}

	/**
	 * Shipping conditions name 出荷条件名.<p>
	 *
	 */
	public void ship_term_nm(String value) {
		setConstString(offset + 314, $ship_term_nm, value);
	}


	/**
	 * Pending shipping 出荷留め.<p>
	 *
	 */
	public boolean ship_block_flg() {
		return getConstBoolean(offset + 315, $ship_block_flg);
	}

	/**
	 * Pending shipping 出荷留め.<p>
	 *
	 */
	public void ship_block_flg(boolean value) {
		setConstBoolean(offset + 315, $ship_block_flg, value);
	}


	/**
	 * Shipping notification remarks 出荷連絡備考.<p>
	 *
	 */
	public String ship_cnt_rmrks() {
		return getConstString(offset + 316, $ship_cnt_rmrks);
	}

	/**
	 * Shipping notification remarks 出荷連絡備考.<p>
	 *
	 */
	public void ship_cnt_rmrks(String value) {
		setConstString(offset + 316, $ship_cnt_rmrks, value);
	}


	/**
	 * Customer order details No. 得意先注文明細ＮＯ.<p>
	 *
	 */
	public String cst_po_d_no() {
		return getConstString(offset + 317, $cst_po_d_no);
	}

	/**
	 * Customer order details No. 得意先注文明細ＮＯ.<p>
	 *
	 */
	public void cst_po_d_no(String value) {
		setConstString(offset + 317, $cst_po_d_no, value);
	}


	/**
	 * Customer order details remarks 得意先注文明細備考.<p>
	 *
	 */
	public String cst_po_d_rmrks() {
		return getConstString(offset + 318, $cst_po_d_rmrks);
	}

	/**
	 * Customer order details remarks 得意先注文明細備考.<p>
	 *
	 */
	public void cst_po_d_rmrks(String value) {
		setConstString(offset + 318, $cst_po_d_rmrks, value);
	}


	/**
	 * Sales reason cd. 売上理由ＣＤ.<p>
	 *
	 */
	public String sls_rsn_cd() {
		return getConstString(offset + 319, $sls_rsn_cd);
	}

	/**
	 * Sales reason cd. 売上理由ＣＤ.<p>
	 *
	 */
	public void sls_rsn_cd(String value) {
		setConstString(offset + 319, $sls_rsn_cd, value);
	}


	/**
	 * Sales reason name 売上理由名.<p>
	 *
	 */
	public String sls_rsn_nm() {
		return getConstString(offset + 320, $sls_rsn_nm);
	}

	/**
	 * Sales reason name 売上理由名.<p>
	 *
	 */
	public void sls_rsn_nm(String value) {
		setConstString(offset + 320, $sls_rsn_nm, value);
	}


	/**
	 * Sales other accounting 販売他勘定.<p>
	 *
	 */
	public boolean sls_acxfr_flg() {
		return getConstBoolean(offset + 321, $sls_acxfr_flg);
	}

	/**
	 * Sales other accounting 販売他勘定.<p>
	 *
	 */
	public void sls_acxfr_flg(boolean value) {
		setConstBoolean(offset + 321, $sls_acxfr_flg, value);
	}


	/**
	 * Charged dept. cd. 負担部門ＣＤ.<p>
	 *
	 */
	public String bd_dpt_cd() {
		return getConstString(offset + 322, $bd_dpt_cd);
	}

	/**
	 * Charged dept. cd. 負担部門ＣＤ.<p>
	 *
	 */
	public void bd_dpt_cd(String value) {
		setConstString(offset + 322, $bd_dpt_cd, value);
	}


	/**
	 * Charged dept. name 負担部門名.<p>
	 *
	 */
	public String bd_dpt_nm() {
		return getConstString(offset + 323, $bd_dpt_nm);
	}

	/**
	 * Charged dept. name 負担部門名.<p>
	 *
	 */
	public void bd_dpt_nm(String value) {
		setConstString(offset + 323, $bd_dpt_nm, value);
	}


	/**
	 * Sales unit price acquisition type 販売単価取得区分.<p>
	 *
	 */
	public String sls_upri_req_typ() {
		return getConstString(offset + 324, $sls_upri_req_typ);
	}

	/**
	 * Sales unit price acquisition type 販売単価取得区分.<p>
	 *
	 */
	public void sls_upri_req_typ(String value) {
		setConstString(offset + 324, $sls_upri_req_typ, value);
	}


	/**
	 * Sales unit price acquisition type name 販売単価取得区分名.<p>
	 *
	 */
	public String sls_upri_req_typ_nm() {
		return getConstString(offset + 325, $sls_upri_req_typ_nm);
	}

	/**
	 * Sales unit price acquisition type name 販売単価取得区分名.<p>
	 *
	 */
	public void sls_upri_req_typ_nm(String value) {
		setConstString(offset + 325, $sls_upri_req_typ_nm, value);
	}


	/**
	 * GR/GI progress management No. 受払進捗管理ＮＯ.<p>
	 *
	 */
	public String io_schd_pr_no() {
		return getConstString(offset + 326, $io_schd_pr_no);
	}

	/**
	 * GR/GI progress management No. 受払進捗管理ＮＯ.<p>
	 *
	 */
	public void io_schd_pr_no(String value) {
		setConstString(offset + 326, $io_schd_pr_no, value);
	}


	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public String trd_d_rmrks() {
		return getConstString(offset + 327, $trd_d_rmrks);
	}

	/**
	 * Transaction details remarks 取引明細備考.<p>
	 *
	 */
	public void trd_d_rmrks(String value) {
		setConstString(offset + 327, $trd_d_rmrks, value);
	}


	/**
	 * Internal details remarks 内部明細備考.<p>
	 *
	 */
	public String slo_d_intr_rmrks() {
		return getConstString(offset + 328, $slo_d_intr_rmrks);
	}

	/**
	 * Internal details remarks 内部明細備考.<p>
	 *
	 */
	public void slo_d_intr_rmrks(String value) {
		setConstString(offset + 328, $slo_d_intr_rmrks, value);
	}


	/**
	 * Details spare 1 明細予備１.<p>
	 *
	 */
	public String slo_d_sub_char1() {
		return getConstString(offset + 329, $slo_d_sub_char1);
	}

	/**
	 * Details spare 1 明細予備１.<p>
	 *
	 */
	public void slo_d_sub_char1(String value) {
		setConstString(offset + 329, $slo_d_sub_char1, value);
	}


	/**
	 * Details spare 2 明細予備２.<p>
	 *
	 */
	public String slo_d_sub_char2() {
		return getConstString(offset + 330, $slo_d_sub_char2);
	}

	/**
	 * Details spare 2 明細予備２.<p>
	 *
	 */
	public void slo_d_sub_char2(String value) {
		setConstString(offset + 330, $slo_d_sub_char2, value);
	}


	/**
	 * Details spare 3 明細予備３.<p>
	 *
	 */
	public String slo_d_sub_char3() {
		return getConstString(offset + 331, $slo_d_sub_char3);
	}

	/**
	 * Details spare 3 明細予備３.<p>
	 *
	 */
	public void slo_d_sub_char3(String value) {
		setConstString(offset + 331, $slo_d_sub_char3, value);
	}


	/**
	 * Quotation details No. 見積明細ＮＯ.<p>
	 *
	 */
	public String qtn_d_no() {
		return getConstString(offset + 332, $qtn_d_no);
	}

	/**
	 * Quotation details No. 見積明細ＮＯ.<p>
	 *
	 */
	public void qtn_d_no(String value) {
		setConstString(offset + 332, $qtn_d_no, value);
	}


	/**
	 * Not auto-calculate 自動計算しない.<p>
	 *
	 */
	public boolean not_dt_calc_flg() {
		return getConstBoolean(offset + 333, $not_dt_calc_flg);
	}

	/**
	 * Not auto-calculate 自動計算しない.<p>
	 *
	 */
	public void not_dt_calc_flg(boolean value) {
		setConstBoolean(offset + 333, $not_dt_calc_flg, value);
	}


	/**
	 * EDI details spare CHAR column 1 ＥＤＩ明細予備ＣＨＡＲ項目１.<p>
	 *
	 */
	public String edi_sub_d_char1() {
		return getConstString(offset + 334, $edi_sub_d_char1);
	}

	/**
	 * EDI details spare CHAR column 1 ＥＤＩ明細予備ＣＨＡＲ項目１.<p>
	 *
	 */
	public void edi_sub_d_char1(String value) {
		setConstString(offset + 334, $edi_sub_d_char1, value);
	}


	/**
	 * EDI details spare CHAR column 2 ＥＤＩ明細予備ＣＨＡＲ項目２.<p>
	 *
	 */
	public String edi_sub_d_char2() {
		return getConstString(offset + 335, $edi_sub_d_char2);
	}

	/**
	 * EDI details spare CHAR column 2 ＥＤＩ明細予備ＣＨＡＲ項目２.<p>
	 *
	 */
	public void edi_sub_d_char2(String value) {
		setConstString(offset + 335, $edi_sub_d_char2, value);
	}


	/**
	 * EDI details spare CHAR column 3 ＥＤＩ明細予備ＣＨＡＲ項目３.<p>
	 *
	 */
	public String edi_sub_d_char3() {
		return getConstString(offset + 336, $edi_sub_d_char3);
	}

	/**
	 * EDI details spare CHAR column 3 ＥＤＩ明細予備ＣＨＡＲ項目３.<p>
	 *
	 */
	public void edi_sub_d_char3(String value) {
		setConstString(offset + 336, $edi_sub_d_char3, value);
	}


	/**
	 * EDI details spare CHAR column 4 ＥＤＩ明細予備ＣＨＡＲ項目４.<p>
	 *
	 */
	public String edi_sub_d_char4() {
		return getConstString(offset + 337, $edi_sub_d_char4);
	}

	/**
	 * EDI details spare CHAR column 4 ＥＤＩ明細予備ＣＨＡＲ項目４.<p>
	 *
	 */
	public void edi_sub_d_char4(String value) {
		setConstString(offset + 337, $edi_sub_d_char4, value);
	}


	/**
	 * EDI details spare CHAR column 5 ＥＤＩ明細予備ＣＨＡＲ項目５.<p>
	 *
	 */
	public String edi_sub_d_char5() {
		return getConstString(offset + 338, $edi_sub_d_char5);
	}

	/**
	 * EDI details spare CHAR column 5 ＥＤＩ明細予備ＣＨＡＲ項目５.<p>
	 *
	 */
	public void edi_sub_d_char5(String value) {
		setConstString(offset + 338, $edi_sub_d_char5, value);
	}


	/**
	 * EDI details spare NUM column 1 ＥＤＩ明細予備ＮＵＭ項目１.<p>
	 *
	 */
	public MCNumber edi_sub_d_num1() {
		return getConstNumber(offset + 339, $edi_sub_d_num1);
	}

	/**
	 * EDI details spare NUM column 1 ＥＤＩ明細予備ＮＵＭ項目１.<p>
	 *
	 */
	public void edi_sub_d_num1(MCNumber value) {
		setConstNumber(offset + 339, $edi_sub_d_num1, value);
	}

	/**
	 * EDI details spare NUM column 1 ＥＤＩ明細予備ＮＵＭ項目１.<p>
	 *
	 */
	public void edi_sub_d_num1(int value) {
		setConstNumber(offset + 339, $edi_sub_d_num1, value);
	}

	/**
	 * EDI details spare NUM column 1 ＥＤＩ明細予備ＮＵＭ項目１.<p>
	 *
	 */
	public void edi_sub_d_num1(long value) {
		setConstNumber(offset + 339, $edi_sub_d_num1, value);
	}

	/**
	 * EDI details spare NUM column 1 ＥＤＩ明細予備ＮＵＭ項目１.<p>
	 *
	 */
	public void edi_sub_d_num1(float value) {
		setConstNumber(offset + 339, $edi_sub_d_num1, value);
	}

	/**
	 * EDI details spare NUM column 1 ＥＤＩ明細予備ＮＵＭ項目１.<p>
	 *
	 */
	public void edi_sub_d_num1(double value) {
		setConstNumber(offset + 339, $edi_sub_d_num1, value);
	}


	/**
	 * EDI details spare DATE column 1 ＥＤＩ明細予備ＤＡＴＥ項目１.<p>
	 *
	 */
	public MCDate edi_sub_d_dt1() {
		return getConstDate(offset + 340, $edi_sub_d_dt1);
	}

	/**
	 * EDI details spare DATE column 1 ＥＤＩ明細予備ＤＡＴＥ項目１.<p>
	 *
	 */
	public void edi_sub_d_dt1(MCDate value) {
		setConstDate(offset + 340, $edi_sub_d_dt1, value);
	}


	/**
	 * Cancel details 明細取消.<p>
	 *
	 */
	public boolean slo_d_can_flg() {
		return getConstBoolean(offset + 341, $slo_d_can_flg);
	}

	/**
	 * Cancel details 明細取消.<p>
	 *
	 */
	public void slo_d_can_flg(boolean value) {
		setConstBoolean(offset + 341, $slo_d_can_flg, value);
	}


	/**
	 * Details cancel reason cd. 明細取消理由ＣＤ.<p>
	 *
	 */
	public String slo_d_can_rsn_cd() {
		return getConstString(offset + 342, $slo_d_can_rsn_cd);
	}

	/**
	 * Details cancel reason cd. 明細取消理由ＣＤ.<p>
	 *
	 */
	public void slo_d_can_rsn_cd(String value) {
		setConstString(offset + 342, $slo_d_can_rsn_cd, value);
	}


	/**
	 * Details cancel reason name 明細取消理由名.<p>
	 *
	 */
	public String slo_d_can_rsn_nm() {
		return getConstString(offset + 343, $slo_d_can_rsn_nm);
	}

	/**
	 * Details cancel reason name 明細取消理由名.<p>
	 *
	 */
	public void slo_d_can_rsn_nm(String value) {
		setConstString(offset + 343, $slo_d_can_rsn_nm, value);
	}


	/**
	 * Details cancel remarks 明細取消備考.<p>
	 *
	 */
	public String slo_d_can_rmkrs() {
		return getConstString(offset + 344, $slo_d_can_rmkrs);
	}

	/**
	 * Details cancel remarks 明細取消備考.<p>
	 *
	 */
	public void slo_d_can_rmkrs(String value) {
		setConstString(offset + 344, $slo_d_can_rmkrs, value);
	}


	/**
	 * Shipping progress No. 出荷進捗ＮＯ.<p>
	 *
	 */
	public String ship_pr_no() {
		return getConstString(offset + 345, $ship_pr_no);
	}

	/**
	 * Shipping progress No. 出荷進捗ＮＯ.<p>
	 *
	 */
	public void ship_pr_no(String value) {
		setConstString(offset + 345, $ship_pr_no, value);
	}


	/**
	 * Item shipping group cd. 品目出荷グループＣＤ.<p>
	 *
	 */
	public String itm_ship_grp_cd() {
		return getConstString(offset + 346, $itm_ship_grp_cd);
	}

	/**
	 * Item shipping group cd. 品目出荷グループＣＤ.<p>
	 *
	 */
	public void itm_ship_grp_cd(String value) {
		setConstString(offset + 346, $itm_ship_grp_cd, value);
	}


	/**
	 * Shipping progress update counter 出荷進捗更新カウンタ.<p>
	 *
	 */
	public MCNumber ship_pr_upd_cntr() {
		return getConstNumber(offset + 347, $ship_pr_upd_cntr);
	}

	/**
	 * Shipping progress update counter 出荷進捗更新カウンタ.<p>
	 *
	 */
	public void ship_pr_upd_cntr(MCNumber value) {
		setConstNumber(offset + 347, $ship_pr_upd_cntr, value);
	}

	/**
	 * Shipping progress update counter 出荷進捗更新カウンタ.<p>
	 *
	 */
	public void ship_pr_upd_cntr(int value) {
		setConstNumber(offset + 347, $ship_pr_upd_cntr, value);
	}

	/**
	 * Shipping progress update counter 出荷進捗更新カウンタ.<p>
	 *
	 */
	public void ship_pr_upd_cntr(long value) {
		setConstNumber(offset + 347, $ship_pr_upd_cntr, value);
	}

	/**
	 * Shipping progress update counter 出荷進捗更新カウンタ.<p>
	 *
	 */
	public void ship_pr_upd_cntr(float value) {
		setConstNumber(offset + 347, $ship_pr_upd_cntr, value);
	}

	/**
	 * Shipping progress update counter 出荷進捗更新カウンタ.<p>
	 *
	 */
	public void ship_pr_upd_cntr(double value) {
		setConstNumber(offset + 347, $ship_pr_upd_cntr, value);
	}


	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public MCNumber hdr_peg_no() {
		return getConstNumber(offset + 348, $hdr_peg_no);
	}

	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public void hdr_peg_no(MCNumber value) {
		setConstNumber(offset + 348, $hdr_peg_no, value);
	}

	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public void hdr_peg_no(int value) {
		setConstNumber(offset + 348, $hdr_peg_no, value);
	}

	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public void hdr_peg_no(long value) {
		setConstNumber(offset + 348, $hdr_peg_no, value);
	}

	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public void hdr_peg_no(float value) {
		setConstNumber(offset + 348, $hdr_peg_no, value);
	}

	/**
	 * Header pegging No. ヘッダ紐付けＮＯ.<p>
	 *
	 */
	public void hdr_peg_no(double value) {
		setConstNumber(offset + 348, $hdr_peg_no, value);
	}


	/**
	 * Error エラー.<p>
	 *
	 */
	public boolean dtl_err_flg() {
		return getConstBoolean(offset + 349, $dtl_err_flg);
	}

	/**
	 * Error エラー.<p>
	 *
	 */
	public void dtl_err_flg(boolean value) {
		setConstBoolean(offset + 349, $dtl_err_flg, value);
	}


	/**
	 * Not for update counter check 更新カウンタチェック対象外.<p>
	 *
	 */
	public boolean upd_cntr_not_chk_flg() {
		return getConstBoolean(offset + 350, $upd_cntr_not_chk_flg);
	}

	/**
	 * Not for update counter check 更新カウンタチェック対象外.<p>
	 *
	 */
	public void upd_cntr_not_chk_flg(boolean value) {
		setConstBoolean(offset + 350, $upd_cntr_not_chk_flg, value);
	}


	/**
	 * Shipping completed 出荷完了.<p>
	 *
	 */
	public boolean ship_cmpl_flg() {
		return getConstBoolean(offset + 351, $ship_cmpl_flg);
	}

	/**
	 * Shipping completed 出荷完了.<p>
	 *
	 */
	public void ship_cmpl_flg(boolean value) {
		setConstBoolean(offset + 351, $ship_cmpl_flg, value);
	}


	/**
	 * Sales completed 売上完了.<p>
	 *
	 */
	public boolean sls_cmpl_flg() {
		return getConstBoolean(offset + 352, $sls_cmpl_flg);
	}

	/**
	 * Sales completed 売上完了.<p>
	 *
	 */
	public void sls_cmpl_flg(boolean value) {
		setConstBoolean(offset + 352, $sls_cmpl_flg, value);
	}


	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public String base_unit_cd() {
		return getConstString(offset + 353, $base_unit_cd);
	}

	/**
	 * Base unit cd. 基準単位ＣＤ.<p>
	 *
	 */
	public void base_unit_cd(String value) {
		setConstString(offset + 353, $base_unit_cd, value);
	}


	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public String base_unit_nm() {
		return getConstString(offset + 354, $base_unit_nm);
	}

	/**
	 * Base unit name 基準単位名.<p>
	 *
	 */
	public void base_unit_nm(String value) {
		setConstString(offset + 354, $base_unit_nm, value);
	}


	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public MCNumber base_unit_qty() {
		return getConstNumber(offset + 355, $base_unit_qty);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(MCNumber value) {
		setConstNumber(offset + 355, $base_unit_qty, value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(int value) {
		setConstNumber(offset + 355, $base_unit_qty, value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(long value) {
		setConstNumber(offset + 355, $base_unit_qty, value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(float value) {
		setConstNumber(offset + 355, $base_unit_qty, value);
	}

	/**
	 * Base unit qty. 基準単位数量.<p>
	 *
	 */
	public void base_unit_qty(double value) {
		setConstNumber(offset + 355, $base_unit_qty, value);
	}


	/**
	 * Shipping progress base unit qty. 出荷進捗基準単位数量.<p>
	 *
	 */
	public MCNumber ship_pr_base_unit_qty() {
		return getConstNumber(offset + 356, $ship_pr_base_unit_qty);
	}

	/**
	 * Shipping progress base unit qty. 出荷進捗基準単位数量.<p>
	 *
	 */
	public void ship_pr_base_unit_qty(MCNumber value) {
		setConstNumber(offset + 356, $ship_pr_base_unit_qty, value);
	}

	/**
	 * Shipping progress base unit qty. 出荷進捗基準単位数量.<p>
	 *
	 */
	public void ship_pr_base_unit_qty(int value) {
		setConstNumber(offset + 356, $ship_pr_base_unit_qty, value);
	}

	/**
	 * Shipping progress base unit qty. 出荷進捗基準単位数量.<p>
	 *
	 */
	public void ship_pr_base_unit_qty(long value) {
		setConstNumber(offset + 356, $ship_pr_base_unit_qty, value);
	}

	/**
	 * Shipping progress base unit qty. 出荷進捗基準単位数量.<p>
	 *
	 */
	public void ship_pr_base_unit_qty(float value) {
		setConstNumber(offset + 356, $ship_pr_base_unit_qty, value);
	}

	/**
	 * Shipping progress base unit qty. 出荷進捗基準単位数量.<p>
	 *
	 */
	public void ship_pr_base_unit_qty(double value) {
		setConstNumber(offset + 356, $ship_pr_base_unit_qty, value);
	}


	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public MCNumber base_unit_dec_place() {
		return getConstNumber(offset + 357, $base_unit_dec_place);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(MCNumber value) {
		setConstNumber(offset + 357, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(int value) {
		setConstNumber(offset + 357, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(long value) {
		setConstNumber(offset + 357, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(float value) {
		setConstNumber(offset + 357, $base_unit_dec_place, value);
	}

	/**
	 * Base unit number of decimal places 基準単位小数部有効桁数.<p>
	 *
	 */
	public void base_unit_dec_place(double value) {
		setConstNumber(offset + 357, $base_unit_dec_place, value);
	}


	/**
	 * Base unit rounding type 基準単位端数処理区分.<p>
	 *
	 */
	public String base_unit_rnd_typ() {
		return getConstString(offset + 358, $base_unit_rnd_typ);
	}

	/**
	 * Base unit rounding type 基準単位端数処理区分.<p>
	 *
	 */
	public void base_unit_rnd_typ(String value) {
		setConstString(offset + 358, $base_unit_rnd_typ, value);
	}


	/**
	 * Transaction unit rounding type 取引単位端数処理区分.<p>
	 *
	 */
	public String trd_unit_rnd_typ() {
		return getConstString(offset + 359, $trd_unit_rnd_typ);
	}

	/**
	 * Transaction unit rounding type 取引単位端数処理区分.<p>
	 *
	 */
	public void trd_unit_rnd_typ(String value) {
		setConstString(offset + 359, $trd_unit_rnd_typ, value);
	}


	/**
	 * SKU 荷姿単位.<p>
	 *
	 */
	public boolean pack_flg() {
		return getConstBoolean(offset + 360, $pack_flg);
	}

	/**
	 * SKU 荷姿単位.<p>
	 *
	 */
	public void pack_flg(boolean value) {
		setConstBoolean(offset + 360, $pack_flg, value);
	}


	/**
	 * Order promising qty. 納期回答数量.<p>
	 *
	 */
	public MCNumber prms_qty() {
		return getConstNumber(offset + 361, $prms_qty);
	}

	/**
	 * Order promising qty. 納期回答数量.<p>
	 *
	 */
	public void prms_qty(MCNumber value) {
		setConstNumber(offset + 361, $prms_qty, value);
	}

	/**
	 * Order promising qty. 納期回答数量.<p>
	 *
	 */
	public void prms_qty(int value) {
		setConstNumber(offset + 361, $prms_qty, value);
	}

	/**
	 * Order promising qty. 納期回答数量.<p>
	 *
	 */
	public void prms_qty(long value) {
		setConstNumber(offset + 361, $prms_qty, value);
	}

	/**
	 * Order promising qty. 納期回答数量.<p>
	 *
	 */
	public void prms_qty(float value) {
		setConstNumber(offset + 361, $prms_qty, value);
	}

	/**
	 * Order promising qty. 納期回答数量.<p>
	 *
	 */
	public void prms_qty(double value) {
		setConstNumber(offset + 361, $prms_qty, value);
	}


	/**
	 * Delivery order received qty. 納入指示受領数量.<p>
	 *
	 */
	public MCNumber dlv_inst_rcpt_qty() {
		return getConstNumber(offset + 362, $dlv_inst_rcpt_qty);
	}

	/**
	 * Delivery order received qty. 納入指示受領数量.<p>
	 *
	 */
	public void dlv_inst_rcpt_qty(MCNumber value) {
		setConstNumber(offset + 362, $dlv_inst_rcpt_qty, value);
	}

	/**
	 * Delivery order received qty. 納入指示受領数量.<p>
	 *
	 */
	public void dlv_inst_rcpt_qty(int value) {
		setConstNumber(offset + 362, $dlv_inst_rcpt_qty, value);
	}

	/**
	 * Delivery order received qty. 納入指示受領数量.<p>
	 *
	 */
	public void dlv_inst_rcpt_qty(long value) {
		setConstNumber(offset + 362, $dlv_inst_rcpt_qty, value);
	}

	/**
	 * Delivery order received qty. 納入指示受領数量.<p>
	 *
	 */
	public void dlv_inst_rcpt_qty(float value) {
		setConstNumber(offset + 362, $dlv_inst_rcpt_qty, value);
	}

	/**
	 * Delivery order received qty. 納入指示受領数量.<p>
	 *
	 */
	public void dlv_inst_rcpt_qty(double value) {
		setConstNumber(offset + 362, $dlv_inst_rcpt_qty, value);
	}


	/**
	 * Delivery order replied qty. 納入指示回答数量.<p>
	 *
	 */
	public MCNumber dlv_inst_prms_qty() {
		return getConstNumber(offset + 363, $dlv_inst_prms_qty);
	}

	/**
	 * Delivery order replied qty. 納入指示回答数量.<p>
	 *
	 */
	public void dlv_inst_prms_qty(MCNumber value) {
		setConstNumber(offset + 363, $dlv_inst_prms_qty, value);
	}

	/**
	 * Delivery order replied qty. 納入指示回答数量.<p>
	 *
	 */
	public void dlv_inst_prms_qty(int value) {
		setConstNumber(offset + 363, $dlv_inst_prms_qty, value);
	}

	/**
	 * Delivery order replied qty. 納入指示回答数量.<p>
	 *
	 */
	public void dlv_inst_prms_qty(long value) {
		setConstNumber(offset + 363, $dlv_inst_prms_qty, value);
	}

	/**
	 * Delivery order replied qty. 納入指示回答数量.<p>
	 *
	 */
	public void dlv_inst_prms_qty(float value) {
		setConstNumber(offset + 363, $dlv_inst_prms_qty, value);
	}

	/**
	 * Delivery order replied qty. 納入指示回答数量.<p>
	 *
	 */
	public void dlv_inst_prms_qty(double value) {
		setConstNumber(offset + 363, $dlv_inst_prms_qty, value);
	}


	/**
	 * Allocation qty. 引当数量.<p>
	 *
	 */
	public MCNumber alloc_qty() {
		return getConstNumber(offset + 364, $alloc_qty);
	}

	/**
	 * Allocation qty. 引当数量.<p>
	 *
	 */
	public void alloc_qty(MCNumber value) {
		setConstNumber(offset + 364, $alloc_qty, value);
	}

	/**
	 * Allocation qty. 引当数量.<p>
	 *
	 */
	public void alloc_qty(int value) {
		setConstNumber(offset + 364, $alloc_qty, value);
	}

	/**
	 * Allocation qty. 引当数量.<p>
	 *
	 */
	public void alloc_qty(long value) {
		setConstNumber(offset + 364, $alloc_qty, value);
	}

	/**
	 * Allocation qty. 引当数量.<p>
	 *
	 */
	public void alloc_qty(float value) {
		setConstNumber(offset + 364, $alloc_qty, value);
	}

	/**
	 * Allocation qty. 引当数量.<p>
	 *
	 */
	public void alloc_qty(double value) {
		setConstNumber(offset + 364, $alloc_qty, value);
	}


	/**
	 * Pending qty. 保留数量.<p>
	 *
	 */
	public MCNumber wait_qty() {
		return getConstNumber(offset + 365, $wait_qty);
	}

	/**
	 * Pending qty. 保留数量.<p>
	 *
	 */
	public void wait_qty(MCNumber value) {
		setConstNumber(offset + 365, $wait_qty, value);
	}

	/**
	 * Pending qty. 保留数量.<p>
	 *
	 */
	public void wait_qty(int value) {
		setConstNumber(offset + 365, $wait_qty, value);
	}

	/**
	 * Pending qty. 保留数量.<p>
	 *
	 */
	public void wait_qty(long value) {
		setConstNumber(offset + 365, $wait_qty, value);
	}

	/**
	 * Pending qty. 保留数量.<p>
	 *
	 */
	public void wait_qty(float value) {
		setConstNumber(offset + 365, $wait_qty, value);
	}

	/**
	 * Pending qty. 保留数量.<p>
	 *
	 */
	public void wait_qty(double value) {
		setConstNumber(offset + 365, $wait_qty, value);
	}


	/**
	 * Shipping order qty. 出荷指図数量.<p>
	 *
	 */
	public MCNumber ship_inst_qty() {
		return getConstNumber(offset + 366, $ship_inst_qty);
	}

	/**
	 * Shipping order qty. 出荷指図数量.<p>
	 *
	 */
	public void ship_inst_qty(MCNumber value) {
		setConstNumber(offset + 366, $ship_inst_qty, value);
	}

	/**
	 * Shipping order qty. 出荷指図数量.<p>
	 *
	 */
	public void ship_inst_qty(int value) {
		setConstNumber(offset + 366, $ship_inst_qty, value);
	}

	/**
	 * Shipping order qty. 出荷指図数量.<p>
	 *
	 */
	public void ship_inst_qty(long value) {
		setConstNumber(offset + 366, $ship_inst_qty, value);
	}

	/**
	 * Shipping order qty. 出荷指図数量.<p>
	 *
	 */
	public void ship_inst_qty(float value) {
		setConstNumber(offset + 366, $ship_inst_qty, value);
	}

	/**
	 * Shipping order qty. 出荷指図数量.<p>
	 *
	 */
	public void ship_inst_qty(double value) {
		setConstNumber(offset + 366, $ship_inst_qty, value);
	}


	/**
	 * Shipping result qty. 出荷実績数量.<p>
	 *
	 */
	public MCNumber ship_act_qty() {
		return getConstNumber(offset + 367, $ship_act_qty);
	}

	/**
	 * Shipping result qty. 出荷実績数量.<p>
	 *
	 */
	public void ship_act_qty(MCNumber value) {
		setConstNumber(offset + 367, $ship_act_qty, value);
	}

	/**
	 * Shipping result qty. 出荷実績数量.<p>
	 *
	 */
	public void ship_act_qty(int value) {
		setConstNumber(offset + 367, $ship_act_qty, value);
	}

	/**
	 * Shipping result qty. 出荷実績数量.<p>
	 *
	 */
	public void ship_act_qty(long value) {
		setConstNumber(offset + 367, $ship_act_qty, value);
	}

	/**
	 * Shipping result qty. 出荷実績数量.<p>
	 *
	 */
	public void ship_act_qty(float value) {
		setConstNumber(offset + 367, $ship_act_qty, value);
	}

	/**
	 * Shipping result qty. 出荷実績数量.<p>
	 *
	 */
	public void ship_act_qty(double value) {
		setConstNumber(offset + 367, $ship_act_qty, value);
	}


	/**
	 * Invoice shipping scheduled qty. インボイス出荷予定数量.<p>
	 *
	 */
	public MCNumber iv_schd_qty() {
		return getConstNumber(offset + 368, $iv_schd_qty);
	}

	/**
	 * Invoice shipping scheduled qty. インボイス出荷予定数量.<p>
	 *
	 */
	public void iv_schd_qty(MCNumber value) {
		setConstNumber(offset + 368, $iv_schd_qty, value);
	}

	/**
	 * Invoice shipping scheduled qty. インボイス出荷予定数量.<p>
	 *
	 */
	public void iv_schd_qty(int value) {
		setConstNumber(offset + 368, $iv_schd_qty, value);
	}

	/**
	 * Invoice shipping scheduled qty. インボイス出荷予定数量.<p>
	 *
	 */
	public void iv_schd_qty(long value) {
		setConstNumber(offset + 368, $iv_schd_qty, value);
	}

	/**
	 * Invoice shipping scheduled qty. インボイス出荷予定数量.<p>
	 *
	 */
	public void iv_schd_qty(float value) {
		setConstNumber(offset + 368, $iv_schd_qty, value);
	}

	/**
	 * Invoice shipping scheduled qty. インボイス出荷予定数量.<p>
	 *
	 */
	public void iv_schd_qty(double value) {
		setConstNumber(offset + 368, $iv_schd_qty, value);
	}


	/**
	 * Invoice shipping result qty. インボイス出荷実績数量.<p>
	 *
	 */
	public MCNumber iv_act_qty() {
		return getConstNumber(offset + 369, $iv_act_qty);
	}

	/**
	 * Invoice shipping result qty. インボイス出荷実績数量.<p>
	 *
	 */
	public void iv_act_qty(MCNumber value) {
		setConstNumber(offset + 369, $iv_act_qty, value);
	}

	/**
	 * Invoice shipping result qty. インボイス出荷実績数量.<p>
	 *
	 */
	public void iv_act_qty(int value) {
		setConstNumber(offset + 369, $iv_act_qty, value);
	}

	/**
	 * Invoice shipping result qty. インボイス出荷実績数量.<p>
	 *
	 */
	public void iv_act_qty(long value) {
		setConstNumber(offset + 369, $iv_act_qty, value);
	}

	/**
	 * Invoice shipping result qty. インボイス出荷実績数量.<p>
	 *
	 */
	public void iv_act_qty(float value) {
		setConstNumber(offset + 369, $iv_act_qty, value);
	}

	/**
	 * Invoice shipping result qty. インボイス出荷実績数量.<p>
	 *
	 */
	public void iv_act_qty(double value) {
		setConstNumber(offset + 369, $iv_act_qty, value);
	}


	/**
	 * Sales qty. 売上数量.<p>
	 *
	 */
	public MCNumber sls_qty() {
		return getConstNumber(offset + 370, $sls_qty);
	}

	/**
	 * Sales qty. 売上数量.<p>
	 *
	 */
	public void sls_qty(MCNumber value) {
		setConstNumber(offset + 370, $sls_qty, value);
	}

	/**
	 * Sales qty. 売上数量.<p>
	 *
	 */
	public void sls_qty(int value) {
		setConstNumber(offset + 370, $sls_qty, value);
	}

	/**
	 * Sales qty. 売上数量.<p>
	 *
	 */
	public void sls_qty(long value) {
		setConstNumber(offset + 370, $sls_qty, value);
	}

	/**
	 * Sales qty. 売上数量.<p>
	 *
	 */
	public void sls_qty(float value) {
		setConstNumber(offset + 370, $sls_qty, value);
	}

	/**
	 * Sales qty. 売上数量.<p>
	 *
	 */
	public void sls_qty(double value) {
		setConstNumber(offset + 370, $sls_qty, value);
	}


	/**
	 * Shipping return qty. 出荷返品数量.<p>
	 *
	 */
	public MCNumber ship_ret_qty() {
		return getConstNumber(offset + 371, $ship_ret_qty);
	}

	/**
	 * Shipping return qty. 出荷返品数量.<p>
	 *
	 */
	public void ship_ret_qty(MCNumber value) {
		setConstNumber(offset + 371, $ship_ret_qty, value);
	}

	/**
	 * Shipping return qty. 出荷返品数量.<p>
	 *
	 */
	public void ship_ret_qty(int value) {
		setConstNumber(offset + 371, $ship_ret_qty, value);
	}

	/**
	 * Shipping return qty. 出荷返品数量.<p>
	 *
	 */
	public void ship_ret_qty(long value) {
		setConstNumber(offset + 371, $ship_ret_qty, value);
	}

	/**
	 * Shipping return qty. 出荷返品数量.<p>
	 *
	 */
	public void ship_ret_qty(float value) {
		setConstNumber(offset + 371, $ship_ret_qty, value);
	}

	/**
	 * Shipping return qty. 出荷返品数量.<p>
	 *
	 */
	public void ship_ret_qty(double value) {
		setConstNumber(offset + 371, $ship_ret_qty, value);
	}


	/**
	 * Scheduled re-shipping qty. 再出荷予定数量.<p>
	 *
	 */
	public MCNumber re_ship_schd_qty() {
		return getConstNumber(offset + 372, $re_ship_schd_qty);
	}

	/**
	 * Scheduled re-shipping qty. 再出荷予定数量.<p>
	 *
	 */
	public void re_ship_schd_qty(MCNumber value) {
		setConstNumber(offset + 372, $re_ship_schd_qty, value);
	}

	/**
	 * Scheduled re-shipping qty. 再出荷予定数量.<p>
	 *
	 */
	public void re_ship_schd_qty(int value) {
		setConstNumber(offset + 372, $re_ship_schd_qty, value);
	}

	/**
	 * Scheduled re-shipping qty. 再出荷予定数量.<p>
	 *
	 */
	public void re_ship_schd_qty(long value) {
		setConstNumber(offset + 372, $re_ship_schd_qty, value);
	}

	/**
	 * Scheduled re-shipping qty. 再出荷予定数量.<p>
	 *
	 */
	public void re_ship_schd_qty(float value) {
		setConstNumber(offset + 372, $re_ship_schd_qty, value);
	}

	/**
	 * Scheduled re-shipping qty. 再出荷予定数量.<p>
	 *
	 */
	public void re_ship_schd_qty(double value) {
		setConstNumber(offset + 372, $re_ship_schd_qty, value);
	}


	/**
	 * Firm 確定.<p>
	 *
	 */
	public boolean fix_flg() {
		return getConstBoolean(offset + 373, $fix_flg);
	}

	/**
	 * Firm 確定.<p>
	 *
	 */
	public void fix_flg(boolean value) {
		setConstBoolean(offset + 373, $fix_flg, value);
	}


	/**
	 * Reschedule shipment 再出荷予定.<p>
	 *
	 */
	public boolean re_ship_schd_flg() {
		return getConstBoolean(offset + 374, $re_ship_schd_flg);
	}

	/**
	 * Reschedule shipment 再出荷予定.<p>
	 *
	 */
	public void re_ship_schd_flg(boolean value) {
		setConstBoolean(offset + 374, $re_ship_schd_flg, value);
	}


	/**
	 * Cancelled remaining shipping schedule qty. 出荷予定打切数量.<p>
	 *
	 */
	public MCNumber ship_schd_abort_qty() {
		return getConstNumber(offset + 375, $ship_schd_abort_qty);
	}

	/**
	 * Cancelled remaining shipping schedule qty. 出荷予定打切数量.<p>
	 *
	 */
	public void ship_schd_abort_qty(MCNumber value) {
		setConstNumber(offset + 375, $ship_schd_abort_qty, value);
	}

	/**
	 * Cancelled remaining shipping schedule qty. 出荷予定打切数量.<p>
	 *
	 */
	public void ship_schd_abort_qty(int value) {
		setConstNumber(offset + 375, $ship_schd_abort_qty, value);
	}

	/**
	 * Cancelled remaining shipping schedule qty. 出荷予定打切数量.<p>
	 *
	 */
	public void ship_schd_abort_qty(long value) {
		setConstNumber(offset + 375, $ship_schd_abort_qty, value);
	}

	/**
	 * Cancelled remaining shipping schedule qty. 出荷予定打切数量.<p>
	 *
	 */
	public void ship_schd_abort_qty(float value) {
		setConstNumber(offset + 375, $ship_schd_abort_qty, value);
	}

	/**
	 * Cancelled remaining shipping schedule qty. 出荷予定打切数量.<p>
	 *
	 */
	public void ship_schd_abort_qty(double value) {
		setConstNumber(offset + 375, $ship_schd_abort_qty, value);
	}


	/**
	 * Cancelled remaining sales schedule qty. 売上予定打切数量.<p>
	 *
	 */
	public MCNumber sls_schd_abort_qty() {
		return getConstNumber(offset + 376, $sls_schd_abort_qty);
	}

	/**
	 * Cancelled remaining sales schedule qty. 売上予定打切数量.<p>
	 *
	 */
	public void sls_schd_abort_qty(MCNumber value) {
		setConstNumber(offset + 376, $sls_schd_abort_qty, value);
	}

	/**
	 * Cancelled remaining sales schedule qty. 売上予定打切数量.<p>
	 *
	 */
	public void sls_schd_abort_qty(int value) {
		setConstNumber(offset + 376, $sls_schd_abort_qty, value);
	}

	/**
	 * Cancelled remaining sales schedule qty. 売上予定打切数量.<p>
	 *
	 */
	public void sls_schd_abort_qty(long value) {
		setConstNumber(offset + 376, $sls_schd_abort_qty, value);
	}

	/**
	 * Cancelled remaining sales schedule qty. 売上予定打切数量.<p>
	 *
	 */
	public void sls_schd_abort_qty(float value) {
		setConstNumber(offset + 376, $sls_schd_abort_qty, value);
	}

	/**
	 * Cancelled remaining sales schedule qty. 売上予定打切数量.<p>
	 *
	 */
	public void sls_schd_abort_qty(double value) {
		setConstNumber(offset + 376, $sls_schd_abort_qty, value);
	}


	/**
	 * order promising date 納期回答日.<p>
	 *
	 */
	public MCDate prms_dt() {
		return getConstDate(offset + 377, $prms_dt);
	}

	/**
	 * order promising date 納期回答日.<p>
	 *
	 */
	public void prms_dt(MCDate value) {
		setConstDate(offset + 377, $prms_dt, value);
	}


	/**
	 * Delivery order received date 納入指示受領日.<p>
	 *
	 */
	public MCDate dlv_inst_rcpt_dt() {
		return getConstDate(offset + 378, $dlv_inst_rcpt_dt);
	}

	/**
	 * Delivery order received date 納入指示受領日.<p>
	 *
	 */
	public void dlv_inst_rcpt_dt(MCDate value) {
		setConstDate(offset + 378, $dlv_inst_rcpt_dt, value);
	}


	/**
	 * Delivery order replied date 納入指示回答日.<p>
	 *
	 */
	public MCDate dlv_inst_prms_dt() {
		return getConstDate(offset + 379, $dlv_inst_prms_dt);
	}

	/**
	 * Delivery order replied date 納入指示回答日.<p>
	 *
	 */
	public void dlv_inst_prms_dt(MCDate value) {
		setConstDate(offset + 379, $dlv_inst_prms_dt, value);
	}


	/**
	 * Delivery order date 納入指示日.<p>
	 *
	 */
	public MCDate dlv_inst_dt() {
		return getConstDate(offset + 380, $dlv_inst_dt);
	}

	/**
	 * Delivery order date 納入指示日.<p>
	 *
	 */
	public void dlv_inst_dt(MCDate value) {
		setConstDate(offset + 380, $dlv_inst_dt, value);
	}


	/**
	 * Delivery order time 納入指示時刻.<p>
	 *
	 */
	public MCDate dlv_inst_hm() {
		return getConstDate(offset + 381, $dlv_inst_hm);
	}

	/**
	 * Delivery order time 納入指示時刻.<p>
	 *
	 */
	public void dlv_inst_hm(MCDate value) {
		setConstDate(offset + 381, $dlv_inst_hm, value);
	}


	/**
	 * Replied delivery date 回答納入日.<p>
	 *
	 */
	public MCDate prms_dlv_dt() {
		return getConstDate(offset + 382, $prms_dlv_dt);
	}

	/**
	 * Replied delivery date 回答納入日.<p>
	 *
	 */
	public void prms_dlv_dt(MCDate value) {
		setConstDate(offset + 382, $prms_dlv_dt, value);
	}


	/**
	 * Remaining delivery qty. 納品残数量.<p>
	 *
	 */
	public MCNumber not_dlv_qty() {
		return getConstNumber(offset + 383, $not_dlv_qty);
	}

	/**
	 * Remaining delivery qty. 納品残数量.<p>
	 *
	 */
	public void not_dlv_qty(MCNumber value) {
		setConstNumber(offset + 383, $not_dlv_qty, value);
	}

	/**
	 * Remaining delivery qty. 納品残数量.<p>
	 *
	 */
	public void not_dlv_qty(int value) {
		setConstNumber(offset + 383, $not_dlv_qty, value);
	}

	/**
	 * Remaining delivery qty. 納品残数量.<p>
	 *
	 */
	public void not_dlv_qty(long value) {
		setConstNumber(offset + 383, $not_dlv_qty, value);
	}

	/**
	 * Remaining delivery qty. 納品残数量.<p>
	 *
	 */
	public void not_dlv_qty(float value) {
		setConstNumber(offset + 383, $not_dlv_qty, value);
	}

	/**
	 * Remaining delivery qty. 納品残数量.<p>
	 *
	 */
	public void not_dlv_qty(double value) {
		setConstNumber(offset + 383, $not_dlv_qty, value);
	}


	/**
	 * Delay expectation qty. 遅れ見込数量.<p>
	 *
	 */
	public MCNumber overdue_prspct_qty() {
		return getConstNumber(offset + 384, $overdue_prspct_qty);
	}

	/**
	 * Delay expectation qty. 遅れ見込数量.<p>
	 *
	 */
	public void overdue_prspct_qty(MCNumber value) {
		setConstNumber(offset + 384, $overdue_prspct_qty, value);
	}

	/**
	 * Delay expectation qty. 遅れ見込数量.<p>
	 *
	 */
	public void overdue_prspct_qty(int value) {
		setConstNumber(offset + 384, $overdue_prspct_qty, value);
	}

	/**
	 * Delay expectation qty. 遅れ見込数量.<p>
	 *
	 */
	public void overdue_prspct_qty(long value) {
		setConstNumber(offset + 384, $overdue_prspct_qty, value);
	}

	/**
	 * Delay expectation qty. 遅れ見込数量.<p>
	 *
	 */
	public void overdue_prspct_qty(float value) {
		setConstNumber(offset + 384, $overdue_prspct_qty, value);
	}

	/**
	 * Delay expectation qty. 遅れ見込数量.<p>
	 *
	 */
	public void overdue_prspct_qty(double value) {
		setConstNumber(offset + 384, $overdue_prspct_qty, value);
	}


	/**
	 * Shipping progress 出荷進捗率.<p>
	 *
	 */
	public MCNumber ship_pr_rate() {
		return getConstNumber(offset + 385, $ship_pr_rate);
	}

	/**
	 * Shipping progress 出荷進捗率.<p>
	 *
	 */
	public void ship_pr_rate(MCNumber value) {
		setConstNumber(offset + 385, $ship_pr_rate, value);
	}

	/**
	 * Shipping progress 出荷進捗率.<p>
	 *
	 */
	public void ship_pr_rate(int value) {
		setConstNumber(offset + 385, $ship_pr_rate, value);
	}

	/**
	 * Shipping progress 出荷進捗率.<p>
	 *
	 */
	public void ship_pr_rate(long value) {
		setConstNumber(offset + 385, $ship_pr_rate, value);
	}

	/**
	 * Shipping progress 出荷進捗率.<p>
	 *
	 */
	public void ship_pr_rate(float value) {
		setConstNumber(offset + 385, $ship_pr_rate, value);
	}

	/**
	 * Shipping progress 出荷進捗率.<p>
	 *
	 */
	public void ship_pr_rate(double value) {
		setConstNumber(offset + 385, $ship_pr_rate, value);
	}


	/**
	 * Sales progress 売上進捗率.<p>
	 *
	 */
	public MCNumber sls_pr_rate() {
		return getConstNumber(offset + 386, $sls_pr_rate);
	}

	/**
	 * Sales progress 売上進捗率.<p>
	 *
	 */
	public void sls_pr_rate(MCNumber value) {
		setConstNumber(offset + 386, $sls_pr_rate, value);
	}

	/**
	 * Sales progress 売上進捗率.<p>
	 *
	 */
	public void sls_pr_rate(int value) {
		setConstNumber(offset + 386, $sls_pr_rate, value);
	}

	/**
	 * Sales progress 売上進捗率.<p>
	 *
	 */
	public void sls_pr_rate(long value) {
		setConstNumber(offset + 386, $sls_pr_rate, value);
	}

	/**
	 * Sales progress 売上進捗率.<p>
	 *
	 */
	public void sls_pr_rate(float value) {
		setConstNumber(offset + 386, $sls_pr_rate, value);
	}

	/**
	 * Sales progress 売上進捗率.<p>
	 *
	 */
	public void sls_pr_rate(double value) {
		setConstNumber(offset + 386, $sls_pr_rate, value);
	}


	/**
	 * Shipping date 出荷日.<p>
	 *
	 */
	public MCDate ship_dt() {
		return getConstDate(offset + 387, $ship_dt);
	}

	/**
	 * Shipping date 出荷日.<p>
	 *
	 */
	public void ship_dt(MCDate value) {
		setConstDate(offset + 387, $ship_dt, value);
	}


	/**
	 * Shipping time 出荷時刻.<p>
	 *
	 */
	public MCDate ship_hm() {
		return getConstDate(offset + 388, $ship_hm);
	}

	/**
	 * Shipping time 出荷時刻.<p>
	 *
	 */
	public void ship_hm(MCDate value) {
		setConstDate(offset + 388, $ship_hm, value);
	}


	/**
	 * Delivery date 納品日.<p>
	 *
	 */
	public MCDate dlv_dt() {
		return getConstDate(offset + 389, $dlv_dt);
	}

	/**
	 * Delivery date 納品日.<p>
	 *
	 */
	public void dlv_dt(MCDate value) {
		setConstDate(offset + 389, $dlv_dt, value);
	}


	/**
	 * Delivery time 納品時刻.<p>
	 *
	 */
	public MCDate dlv_hm() {
		return getConstDate(offset + 390, $dlv_hm);
	}

	/**
	 * Delivery time 納品時刻.<p>
	 *
	 */
	public void dlv_hm(MCDate value) {
		setConstDate(offset + 390, $dlv_hm, value);
	}


	/**
	 * Delivery LT 納品ＬＴ.<p>
	 *
	 */
	public MCNumber act_dlv_lt() {
		return getConstNumber(offset + 391, $act_dlv_lt);
	}

	/**
	 * Delivery LT 納品ＬＴ.<p>
	 *
	 */
	public void act_dlv_lt(MCNumber value) {
		setConstNumber(offset + 391, $act_dlv_lt, value);
	}

	/**
	 * Delivery LT 納品ＬＴ.<p>
	 *
	 */
	public void act_dlv_lt(int value) {
		setConstNumber(offset + 391, $act_dlv_lt, value);
	}

	/**
	 * Delivery LT 納品ＬＴ.<p>
	 *
	 */
	public void act_dlv_lt(long value) {
		setConstNumber(offset + 391, $act_dlv_lt, value);
	}

	/**
	 * Delivery LT 納品ＬＴ.<p>
	 *
	 */
	public void act_dlv_lt(float value) {
		setConstNumber(offset + 391, $act_dlv_lt, value);
	}

	/**
	 * Delivery LT 納品ＬＴ.<p>
	 *
	 */
	public void act_dlv_lt(double value) {
		setConstNumber(offset + 391, $act_dlv_lt, value);
	}


	/**
	 * Sales date 売上日.<p>
	 *
	 */
	public MCDate sls_dt() {
		return getConstDate(offset + 392, $sls_dt);
	}

	/**
	 * Sales date 売上日.<p>
	 *
	 */
	public void sls_dt(MCDate value) {
		setConstDate(offset + 392, $sls_dt, value);
	}


	/**
	 * Delivery qty. 納品数量.<p>
	 *
	 */
	public MCNumber dlv_qty() {
		return getConstNumber(offset + 393, $dlv_qty);
	}

	/**
	 * Delivery qty. 納品数量.<p>
	 *
	 */
	public void dlv_qty(MCNumber value) {
		setConstNumber(offset + 393, $dlv_qty, value);
	}

	/**
	 * Delivery qty. 納品数量.<p>
	 *
	 */
	public void dlv_qty(int value) {
		setConstNumber(offset + 393, $dlv_qty, value);
	}

	/**
	 * Delivery qty. 納品数量.<p>
	 *
	 */
	public void dlv_qty(long value) {
		setConstNumber(offset + 393, $dlv_qty, value);
	}

	/**
	 * Delivery qty. 納品数量.<p>
	 *
	 */
	public void dlv_qty(float value) {
		setConstNumber(offset + 393, $dlv_qty, value);
	}

	/**
	 * Delivery qty. 納品数量.<p>
	 *
	 */
	public void dlv_qty(double value) {
		setConstNumber(offset + 393, $dlv_qty, value);
	}


	/**
	 * Desired delivery date delayed (Result) 納入希望日遅れ（実績）.<p>
	 *
	 */
	public boolean dlv_rqst_dt_overdue_act_flg() {
		return getConstBoolean(offset + 394, $dlv_rqst_dt_overdue_act_flg);
	}

	/**
	 * Desired delivery date delayed (Result) 納入希望日遅れ（実績）.<p>
	 *
	 */
	public void dlv_rqst_dt_overdue_act_flg(boolean value) {
		setConstBoolean(offset + 394, $dlv_rqst_dt_overdue_act_flg, value);
	}


	/**
	 * Replied delivery date delayed (Result) 回答納入日遅れ（実績）.<p>
	 *
	 */
	public boolean prms_dlv_dt_overdue_act_flg() {
		return getConstBoolean(offset + 395, $prms_dlv_dt_overdue_act_flg);
	}

	/**
	 * Replied delivery date delayed (Result) 回答納入日遅れ（実績）.<p>
	 *
	 */
	public void prms_dlv_dt_overdue_act_flg(boolean value) {
		setConstBoolean(offset + 395, $prms_dlv_dt_overdue_act_flg, value);
	}


	/**
	 * Display order 表示順.<p>
	 *
	 */
	public MCNumber disp_seq() {
		return getConstNumber(offset + 396, $disp_seq);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(MCNumber value) {
		setConstNumber(offset + 396, $disp_seq, value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(int value) {
		setConstNumber(offset + 396, $disp_seq, value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(long value) {
		setConstNumber(offset + 396, $disp_seq, value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(float value) {
		setConstNumber(offset + 396, $disp_seq, value);
	}

	/**
	 * Display order 表示順.<p>
	 *
	 */
	public void disp_seq(double value) {
		setConstNumber(offset + 396, $disp_seq, value);
	}


	/**
	 * Charged dept. (Sales dept.) 負担部門（売上部門）.<p>
	 *
	 */
	public boolean bd_dpt_flg() {
		return getConstBoolean(offset + 397, $bd_dpt_flg);
	}

	/**
	 * Charged dept. (Sales dept.) 負担部門（売上部門）.<p>
	 *
	 */
	public void bd_dpt_flg(boolean value) {
		setConstBoolean(offset + 397, $bd_dpt_flg, value);
	}


	/**
	 * Shipping schedule split type (Master) 出荷予定分割区分（マスタ）.<p>
	 *
	 */
	public String cst_ship_schd_split_typ() {
		return getConstString(offset + 398, $cst_ship_schd_split_typ);
	}

	/**
	 * Shipping schedule split type (Master) 出荷予定分割区分（マスタ）.<p>
	 *
	 */
	public void cst_ship_schd_split_typ(String value) {
		setConstString(offset + 398, $cst_ship_schd_split_typ, value);
	}


	/**
	 * Revenue recording type (Master) 売上計上区分（マスタ）.<p>
	 *
	 */
	public String cst_sls_basis_typ() {
		return getConstString(offset + 399, $cst_sls_basis_typ);
	}

	/**
	 * Revenue recording type (Master) 売上計上区分（マスタ）.<p>
	 *
	 */
	public void cst_sls_basis_typ(String value) {
		setConstString(offset + 399, $cst_sls_basis_typ, value);
	}


	/**
	 * Sales PIC cd. (Master) 売上担当者ＣＤ（マスタ）.<p>
	 *
	 */
	public String cst_sls_usr_cd() {
		return getConstString(offset + 400, $cst_sls_usr_cd);
	}

	/**
	 * Sales PIC cd. (Master) 売上担当者ＣＤ（マスタ）.<p>
	 *
	 */
	public void cst_sls_usr_cd(String value) {
		setConstString(offset + 400, $cst_sls_usr_cd, value);
	}


	/**
	 * Sales dept. cd. (master) 売上部門ＣＤ（マスタ）.<p>
	 *
	 */
	public String cst_sls_dpt_cd() {
		return getConstString(offset + 401, $cst_sls_dpt_cd);
	}

	/**
	 * Sales dept. cd. (master) 売上部門ＣＤ（マスタ）.<p>
	 *
	 */
	public void cst_sls_dpt_cd(String value) {
		setConstString(offset + 401, $cst_sls_dpt_cd, value);
	}


	/**
	 * AR dept. cd. (Master) 債権部門ＣＤ（マスタ）.<p>
	 *
	 */
	public String cst_ar_dpt_cd() {
		return getConstString(offset + 402, $cst_ar_dpt_cd);
	}

	/**
	 * AR dept. cd. (Master) 債権部門ＣＤ（マスタ）.<p>
	 *
	 */
	public void cst_ar_dpt_cd(String value) {
		setConstString(offset + 402, $cst_ar_dpt_cd, value);
	}


	/**
	 * Billing carry-over count (BP master) 請求繰越回数（取引先マスタ）.<p>
	 *
	 */
	public MCNumber cst_bill_crryovr_times() {
		return getConstNumber(offset + 403, $cst_bill_crryovr_times);
	}

	/**
	 * Billing carry-over count (BP master) 請求繰越回数（取引先マスタ）.<p>
	 *
	 */
	public void cst_bill_crryovr_times(MCNumber value) {
		setConstNumber(offset + 403, $cst_bill_crryovr_times, value);
	}

	/**
	 * Billing carry-over count (BP master) 請求繰越回数（取引先マスタ）.<p>
	 *
	 */
	public void cst_bill_crryovr_times(int value) {
		setConstNumber(offset + 403, $cst_bill_crryovr_times, value);
	}

	/**
	 * Billing carry-over count (BP master) 請求繰越回数（取引先マスタ）.<p>
	 *
	 */
	public void cst_bill_crryovr_times(long value) {
		setConstNumber(offset + 403, $cst_bill_crryovr_times, value);
	}

	/**
	 * Billing carry-over count (BP master) 請求繰越回数（取引先マスタ）.<p>
	 *
	 */
	public void cst_bill_crryovr_times(float value) {
		setConstNumber(offset + 403, $cst_bill_crryovr_times, value);
	}

	/**
	 * Billing carry-over count (BP master) 請求繰越回数（取引先マスタ）.<p>
	 *
	 */
	public void cst_bill_crryovr_times(double value) {
		setConstNumber(offset + 403, $cst_bill_crryovr_times, value);
	}


	/**
	 * Sales unit price acquisition type (BP master) 販売単価取得区分（取引先マスタ）.<p>
	 *
	 */
	public String cst_sls_upri_req_typ() {
		return getConstString(offset + 404, $cst_sls_upri_req_typ);
	}

	/**
	 * Sales unit price acquisition type (BP master) 販売単価取得区分（取引先マスタ）.<p>
	 *
	 */
	public void cst_sls_upri_req_typ(String value) {
		setConstString(offset + 404, $cst_sls_upri_req_typ, value);
	}


	/**
	 * Allow sales unit price change (BP master) 販売単価変更許可（取引先マスタ）.<p>
	 *
	 */
	public boolean cst_sls_upri_cng_flg() {
		return getConstBoolean(offset + 405, $cst_sls_upri_cng_flg);
	}

	/**
	 * Allow sales unit price change (BP master) 販売単価変更許可（取引先マスタ）.<p>
	 *
	 */
	public void cst_sls_upri_cng_flg(boolean value) {
		setConstBoolean(offset + 405, $cst_sls_upri_cng_flg, value);
	}


	/**
	 * AR dept. type (Master) 債権部門区分（マスタ）.<p>
	 *
	 */
	public String ar_dpt_typ() {
		return getConstString(offset + 406, $ar_dpt_typ);
	}

	/**
	 * AR dept. type (Master) 債権部門区分（マスタ）.<p>
	 *
	 */
	public void ar_dpt_typ(String value) {
		setConstString(offset + 406, $ar_dpt_typ, value);
	}


	/**
	 * Transaction currency cd. (Master) 取引通貨ＣＤ（マスタ）.<p>
	 *
	 */
	public String cst_trd_cur_cd() {
		return getConstString(offset + 407, $cst_trd_cur_cd);
	}

	/**
	 * Transaction currency cd. (Master) 取引通貨ＣＤ（マスタ）.<p>
	 *
	 */
	public void cst_trd_cur_cd(String value) {
		setConstString(offset + 407, $cst_trd_cur_cd, value);
	}


	/**
	 * Unit price number of decimal places (Master) 単価小数部有効桁数（マスタ）.<p>
	 *
	 */
	public MCNumber cst_upri_dec_place() {
		return getConstNumber(offset + 408, $cst_upri_dec_place);
	}

	/**
	 * Unit price number of decimal places (Master) 単価小数部有効桁数（マスタ）.<p>
	 *
	 */
	public void cst_upri_dec_place(MCNumber value) {
		setConstNumber(offset + 408, $cst_upri_dec_place, value);
	}

	/**
	 * Unit price number of decimal places (Master) 単価小数部有効桁数（マスタ）.<p>
	 *
	 */
	public void cst_upri_dec_place(int value) {
		setConstNumber(offset + 408, $cst_upri_dec_place, value);
	}

	/**
	 * Unit price number of decimal places (Master) 単価小数部有効桁数（マスタ）.<p>
	 *
	 */
	public void cst_upri_dec_place(long value) {
		setConstNumber(offset + 408, $cst_upri_dec_place, value);
	}

	/**
	 * Unit price number of decimal places (Master) 単価小数部有効桁数（マスタ）.<p>
	 *
	 */
	public void cst_upri_dec_place(float value) {
		setConstNumber(offset + 408, $cst_upri_dec_place, value);
	}

	/**
	 * Unit price number of decimal places (Master) 単価小数部有効桁数（マスタ）.<p>
	 *
	 */
	public void cst_upri_dec_place(double value) {
		setConstNumber(offset + 408, $cst_upri_dec_place, value);
	}


	/**
	 * Amount number of decimal places (Master) 金額小数部有効桁数（マスタ）.<p>
	 *
	 */
	public MCNumber cst_amt_dec_place() {
		return getConstNumber(offset + 409, $cst_amt_dec_place);
	}

	/**
	 * Amount number of decimal places (Master) 金額小数部有効桁数（マスタ）.<p>
	 *
	 */
	public void cst_amt_dec_place(MCNumber value) {
		setConstNumber(offset + 409, $cst_amt_dec_place, value);
	}

	/**
	 * Amount number of decimal places (Master) 金額小数部有効桁数（マスタ）.<p>
	 *
	 */
	public void cst_amt_dec_place(int value) {
		setConstNumber(offset + 409, $cst_amt_dec_place, value);
	}

	/**
	 * Amount number of decimal places (Master) 金額小数部有効桁数（マスタ）.<p>
	 *
	 */
	public void cst_amt_dec_place(long value) {
		setConstNumber(offset + 409, $cst_amt_dec_place, value);
	}

	/**
	 * Amount number of decimal places (Master) 金額小数部有効桁数（マスタ）.<p>
	 *
	 */
	public void cst_amt_dec_place(float value) {
		setConstNumber(offset + 409, $cst_amt_dec_place, value);
	}

	/**
	 * Amount number of decimal places (Master) 金額小数部有効桁数（マスタ）.<p>
	 *
	 */
	public void cst_amt_dec_place(double value) {
		setConstNumber(offset + 409, $cst_amt_dec_place, value);
	}


	/**
	 * Unit price number of decimal places 単価小数部有効桁数.<p>
	 *
	 */
	public MCNumber upri_dec_place() {
		return getConstNumber(offset + 410, $upri_dec_place);
	}

	/**
	 * Unit price number of decimal places 単価小数部有効桁数.<p>
	 *
	 */
	public void upri_dec_place(MCNumber value) {
		setConstNumber(offset + 410, $upri_dec_place, value);
	}

	/**
	 * Unit price number of decimal places 単価小数部有効桁数.<p>
	 *
	 */
	public void upri_dec_place(int value) {
		setConstNumber(offset + 410, $upri_dec_place, value);
	}

	/**
	 * Unit price number of decimal places 単価小数部有効桁数.<p>
	 *
	 */
	public void upri_dec_place(long value) {
		setConstNumber(offset + 410, $upri_dec_place, value);
	}

	/**
	 * Unit price number of decimal places 単価小数部有効桁数.<p>
	 *
	 */
	public void upri_dec_place(float value) {
		setConstNumber(offset + 410, $upri_dec_place, value);
	}

	/**
	 * Unit price number of decimal places 単価小数部有効桁数.<p>
	 *
	 */
	public void upri_dec_place(double value) {
		setConstNumber(offset + 410, $upri_dec_place, value);
	}


	/**
	 * Delivery destination name (Master) 納品先名（マスタ）.<p>
	 *
	 */
	public String mst_dlv_nm() {
		return getConstString(offset + 411, $mst_dlv_nm);
	}

	/**
	 * Delivery destination name (Master) 納品先名（マスタ）.<p>
	 *
	 */
	public void mst_dlv_nm(String value) {
		setConstString(offset + 411, $mst_dlv_nm, value);
	}


	/**
	 * Delivery destination dept. (Master) 納品先部署（マスタ）.<p>
	 *
	 */
	public String mst_dlv_cntct_dpt() {
		return getConstString(offset + 412, $mst_dlv_cntct_dpt);
	}

	/**
	 * Delivery destination dept. (Master) 納品先部署（マスタ）.<p>
	 *
	 */
	public void mst_dlv_cntct_dpt(String value) {
		setConstString(offset + 412, $mst_dlv_cntct_dpt, value);
	}


	/**
	 * Delivery destination PIC (Master) 納品先担当者（マスタ）.<p>
	 *
	 */
	public String mst_dlv_cntct_psn() {
		return getConstString(offset + 413, $mst_dlv_cntct_psn);
	}

	/**
	 * Delivery destination PIC (Master) 納品先担当者（マスタ）.<p>
	 *
	 */
	public void mst_dlv_cntct_psn(String value) {
		setConstString(offset + 413, $mst_dlv_cntct_psn, value);
	}


	/**
	 * Delivery destination postal code (Master) 納品先郵便番号（マスタ）.<p>
	 *
	 */
	public String mst_dlv_zip_cd() {
		return getConstString(offset + 414, $mst_dlv_zip_cd);
	}

	/**
	 * Delivery destination postal code (Master) 納品先郵便番号（マスタ）.<p>
	 *
	 */
	public void mst_dlv_zip_cd(String value) {
		setConstString(offset + 414, $mst_dlv_zip_cd, value);
	}


	/**
	 * Delivery destination address 1 (Master) 納品先住所１（マスタ）.<p>
	 *
	 */
	public String mst_dlv_addr1() {
		return getConstString(offset + 415, $mst_dlv_addr1);
	}

	/**
	 * Delivery destination address 1 (Master) 納品先住所１（マスタ）.<p>
	 *
	 */
	public void mst_dlv_addr1(String value) {
		setConstString(offset + 415, $mst_dlv_addr1, value);
	}


	/**
	 * Delivery address 2 (Master) 納品先住所２（マスタ）.<p>
	 *
	 */
	public String mst_dlv_addr2() {
		return getConstString(offset + 416, $mst_dlv_addr2);
	}

	/**
	 * Delivery address 2 (Master) 納品先住所２（マスタ）.<p>
	 *
	 */
	public void mst_dlv_addr2(String value) {
		setConstString(offset + 416, $mst_dlv_addr2, value);
	}


	/**
	 * Delivery address 3 (Master) 納品先住所３（マスタ）.<p>
	 *
	 */
	public String mst_dlv_addr3() {
		return getConstString(offset + 417, $mst_dlv_addr3);
	}

	/**
	 * Delivery address 3 (Master) 納品先住所３（マスタ）.<p>
	 *
	 */
	public void mst_dlv_addr3(String value) {
		setConstString(offset + 417, $mst_dlv_addr3, value);
	}


	/**
	 * Delivery address 4 (Master) 納品先住所４（マスタ）.<p>
	 *
	 */
	public String mst_dlv_addr4() {
		return getConstString(offset + 418, $mst_dlv_addr4);
	}

	/**
	 * Delivery address 4 (Master) 納品先住所４（マスタ）.<p>
	 *
	 */
	public void mst_dlv_addr4(String value) {
		setConstString(offset + 418, $mst_dlv_addr4, value);
	}


	/**
	 * Delivery destination TEL (Master) 納品先ＴＥＬ（マスタ）.<p>
	 *
	 */
	public String mst_dlv_tel() {
		return getConstString(offset + 419, $mst_dlv_tel);
	}

	/**
	 * Delivery destination TEL (Master) 納品先ＴＥＬ（マスタ）.<p>
	 *
	 */
	public void mst_dlv_tel(String value) {
		setConstString(offset + 419, $mst_dlv_tel, value);
	}


	/**
	 * Delivery destination FAX (Master) 納品先ＦＡＸ（マスタ）.<p>
	 *
	 */
	public String mst_dlv_fax() {
		return getConstString(offset + 420, $mst_dlv_fax);
	}

	/**
	 * Delivery destination FAX (Master) 納品先ＦＡＸ（マスタ）.<p>
	 *
	 */
	public void mst_dlv_fax(String value) {
		setConstString(offset + 420, $mst_dlv_fax, value);
	}


	/**
	 * Delivery destination distribution group cd. (Master) 納品先物流グループＣＤ（マスタ）.<p>
	 *
	 */
	public String mst_dlv_lg_grp_cd() {
		return getConstString(offset + 421, $mst_dlv_lg_grp_cd);
	}

	/**
	 * Delivery destination distribution group cd. (Master) 納品先物流グループＣＤ（マスタ）.<p>
	 *
	 */
	public void mst_dlv_lg_grp_cd(String value) {
		setConstString(offset + 421, $mst_dlv_lg_grp_cd, value);
	}


	/**
	 * Report output locale cd. (master) 帳票出力ロケールＣＤ（マスタ）.<p>
	 *
	 */
	public String prnt_lcl_cd() {
		return getConstString(offset + 422, $prnt_lcl_cd);
	}

	/**
	 * Report output locale cd. (master) 帳票出力ロケールＣＤ（マスタ）.<p>
	 *
	 */
	public void prnt_lcl_cd(String value) {
		setConstString(offset + 422, $prnt_lcl_cd, value);
	}


	/**
	 * Delivery name (master) 配送先名（マスタ）.<p>
	 *
	 */
	public String mst_tdlv_nm() {
		return getConstString(offset + 423, $mst_tdlv_nm);
	}

	/**
	 * Delivery name (master) 配送先名（マスタ）.<p>
	 *
	 */
	public void mst_tdlv_nm(String value) {
		setConstString(offset + 423, $mst_tdlv_nm, value);
	}


	/**
	 * Destination dept. (master) 配送先部署（マスタ）.<p>
	 *
	 */
	public String mst_tdlv_cntct_dpt() {
		return getConstString(offset + 424, $mst_tdlv_cntct_dpt);
	}

	/**
	 * Destination dept. (master) 配送先部署（マスタ）.<p>
	 *
	 */
	public void mst_tdlv_cntct_dpt(String value) {
		setConstString(offset + 424, $mst_tdlv_cntct_dpt, value);
	}


	/**
	 * Delivery person in charge (master) 配送先担当者（マスタ）.<p>
	 *
	 */
	public String mst_tdlv_cntct_psn() {
		return getConstString(offset + 425, $mst_tdlv_cntct_psn);
	}

	/**
	 * Delivery person in charge (master) 配送先担当者（マスタ）.<p>
	 *
	 */
	public void mst_tdlv_cntct_psn(String value) {
		setConstString(offset + 425, $mst_tdlv_cntct_psn, value);
	}


	/**
	 * Delivery destination postal code (master) 配送先郵便番号（マスタ）.<p>
	 *
	 */
	public String mst_tdlv_zip_cd() {
		return getConstString(offset + 426, $mst_tdlv_zip_cd);
	}

	/**
	 * Delivery destination postal code (master) 配送先郵便番号（マスタ）.<p>
	 *
	 */
	public void mst_tdlv_zip_cd(String value) {
		setConstString(offset + 426, $mst_tdlv_zip_cd, value);
	}


	/**
	 * Shipping address 1 (master) 配送先住所１（マスタ）.<p>
	 *
	 */
	public String mst_tdlv_addr1() {
		return getConstString(offset + 427, $mst_tdlv_addr1);
	}

	/**
	 * Shipping address 1 (master) 配送先住所１（マスタ）.<p>
	 *
	 */
	public void mst_tdlv_addr1(String value) {
		setConstString(offset + 427, $mst_tdlv_addr1, value);
	}


	/**
	 * Shipping address 2 (master) 配送先住所２（マスタ）.<p>
	 *
	 */
	public String mst_tdlv_addr2() {
		return getConstString(offset + 428, $mst_tdlv_addr2);
	}

	/**
	 * Shipping address 2 (master) 配送先住所２（マスタ）.<p>
	 *
	 */
	public void mst_tdlv_addr2(String value) {
		setConstString(offset + 428, $mst_tdlv_addr2, value);
	}


	/**
	 * Shipping address 3 (master) 配送先住所３（マスタ）.<p>
	 *
	 */
	public String mst_tdlv_addr3() {
		return getConstString(offset + 429, $mst_tdlv_addr3);
	}

	/**
	 * Shipping address 3 (master) 配送先住所３（マスタ）.<p>
	 *
	 */
	public void mst_tdlv_addr3(String value) {
		setConstString(offset + 429, $mst_tdlv_addr3, value);
	}


	/**
	 * Shipping address 4 (master) 配送先住所４（マスタ）.<p>
	 *
	 */
	public String mst_tdlv_addr4() {
		return getConstString(offset + 430, $mst_tdlv_addr4);
	}

	/**
	 * Shipping address 4 (master) 配送先住所４（マスタ）.<p>
	 *
	 */
	public void mst_tdlv_addr4(String value) {
		setConstString(offset + 430, $mst_tdlv_addr4, value);
	}


	/**
	 * Delivery destination TEL (master) 配送先ＴＥＬ（マスタ）.<p>
	 *
	 */
	public String mst_tdlv_tel() {
		return getConstString(offset + 431, $mst_tdlv_tel);
	}

	/**
	 * Delivery destination TEL (master) 配送先ＴＥＬ（マスタ）.<p>
	 *
	 */
	public void mst_tdlv_tel(String value) {
		setConstString(offset + 431, $mst_tdlv_tel, value);
	}


	/**
	 * Delivery destination fax (master) 配送先ＦＡＸ（マスタ）.<p>
	 *
	 */
	public String mst_tdlv_fax() {
		return getConstString(offset + 432, $mst_tdlv_fax);
	}

	/**
	 * Delivery destination fax (master) 配送先ＦＡＸ（マスタ）.<p>
	 *
	 */
	public void mst_tdlv_fax(String value) {
		setConstString(offset + 432, $mst_tdlv_fax, value);
	}


	/**
	 * Delivery destination distribution group cd. (master) 配送先物流グループＣＤ（マスタ）.<p>
	 *
	 */
	public String mst_tdlv_lg_grp_cd() {
		return getConstString(offset + 433, $mst_tdlv_lg_grp_cd);
	}

	/**
	 * Delivery destination distribution group cd. (master) 配送先物流グループＣＤ（マスタ）.<p>
	 *
	 */
	public void mst_tdlv_lg_grp_cd(String value) {
		setConstString(offset + 433, $mst_tdlv_lg_grp_cd, value);
	}


	/**
	 * Destination via classification (master) 配送先経由区分（マスタ）.<p>
	 *
	 */
	public String mst_via_dlv_typ() {
		return getConstString(offset + 434, $mst_via_dlv_typ);
	}

	/**
	 * Destination via classification (master) 配送先経由区分（マスタ）.<p>
	 *
	 */
	public void mst_via_dlv_typ(String value) {
		setConstString(offset + 434, $mst_via_dlv_typ, value);
	}


	/**
	 * Unit price (Master) (Transaction currency) 取引通貨単価（マスタ）.<p>
	 *
	 */
	public MCNumber mst_trd_cur_upri() {
		return getConstNumber(offset + 435, $mst_trd_cur_upri);
	}

	/**
	 * Unit price (Master) (Transaction currency) 取引通貨単価（マスタ）.<p>
	 *
	 */
	public void mst_trd_cur_upri(MCNumber value) {
		setConstNumber(offset + 435, $mst_trd_cur_upri, value);
	}

	/**
	 * Unit price (Master) (Transaction currency) 取引通貨単価（マスタ）.<p>
	 *
	 */
	public void mst_trd_cur_upri(int value) {
		setConstNumber(offset + 435, $mst_trd_cur_upri, value);
	}

	/**
	 * Unit price (Master) (Transaction currency) 取引通貨単価（マスタ）.<p>
	 *
	 */
	public void mst_trd_cur_upri(long value) {
		setConstNumber(offset + 435, $mst_trd_cur_upri, value);
	}

	/**
	 * Unit price (Master) (Transaction currency) 取引通貨単価（マスタ）.<p>
	 *
	 */
	public void mst_trd_cur_upri(float value) {
		setConstNumber(offset + 435, $mst_trd_cur_upri, value);
	}

	/**
	 * Unit price (Master) (Transaction currency) 取引通貨単価（マスタ）.<p>
	 *
	 */
	public void mst_trd_cur_upri(double value) {
		setConstNumber(offset + 435, $mst_trd_cur_upri, value);
	}


	/**
	 * Temporary unit price (Master) 仮単価（マスタ）.<p>
	 *
	 */
	public boolean mst_interim_flg() {
		return getConstBoolean(offset + 436, $mst_interim_flg);
	}

	/**
	 * Temporary unit price (Master) 仮単価（マスタ）.<p>
	 *
	 */
	public void mst_interim_flg(boolean value) {
		setConstBoolean(offset + 436, $mst_interim_flg, value);
	}


	/**
	 * Direct delivery/relay location cd. 仕入直送中継場所場所ＣＤ.<p>
	 *
	 */
	public String mid_loc_cd() {
		return getConstString(offset + 437, $mid_loc_cd);
	}

	/**
	 * Direct delivery/relay location cd. 仕入直送中継場所場所ＣＤ.<p>
	 *
	 */
	public void mid_loc_cd(String value) {
		setConstString(offset + 437, $mid_loc_cd, value);
	}


	/**
	 * WG cd. (Location) ワーキンググループＣＤ（場所）.<p>
	 *
	 */
	public String loc_wg_cd() {
		return getConstString(offset + 438, $loc_wg_cd);
	}

	/**
	 * WG cd. (Location) ワーキンググループＣＤ（場所）.<p>
	 *
	 */
	public void loc_wg_cd(String value) {
		setConstString(offset + 438, $loc_wg_cd, value);
	}


	/**
	 * Tax type 税区分.<p>
	 *
	 */
	public String tax_typ() {
		return getConstString(offset + 439, $tax_typ);
	}

	/**
	 * Tax type 税区分.<p>
	 *
	 */
	public void tax_typ(String value) {
		setConstString(offset + 439, $tax_typ, value);
	}


	/**
	 * Billing carry-over count (Item master) 請求繰越回数（品目マスタ）.<p>
	 *
	 */
	public MCNumber itm_bill_crryovr_times() {
		return getConstNumber(offset + 440, $itm_bill_crryovr_times);
	}

	/**
	 * Billing carry-over count (Item master) 請求繰越回数（品目マスタ）.<p>
	 *
	 */
	public void itm_bill_crryovr_times(MCNumber value) {
		setConstNumber(offset + 440, $itm_bill_crryovr_times, value);
	}

	/**
	 * Billing carry-over count (Item master) 請求繰越回数（品目マスタ）.<p>
	 *
	 */
	public void itm_bill_crryovr_times(int value) {
		setConstNumber(offset + 440, $itm_bill_crryovr_times, value);
	}

	/**
	 * Billing carry-over count (Item master) 請求繰越回数（品目マスタ）.<p>
	 *
	 */
	public void itm_bill_crryovr_times(long value) {
		setConstNumber(offset + 440, $itm_bill_crryovr_times, value);
	}

	/**
	 * Billing carry-over count (Item master) 請求繰越回数（品目マスタ）.<p>
	 *
	 */
	public void itm_bill_crryovr_times(float value) {
		setConstNumber(offset + 440, $itm_bill_crryovr_times, value);
	}

	/**
	 * Billing carry-over count (Item master) 請求繰越回数（品目マスタ）.<p>
	 *
	 */
	public void itm_bill_crryovr_times(double value) {
		setConstNumber(offset + 440, $itm_bill_crryovr_times, value);
	}


	/**
	 * Allow sales unit price change (Item master) 販売単価変更許可（品目マスタ）.<p>
	 *
	 */
	public boolean itm_sls_upri_cng_flg() {
		return getConstBoolean(offset + 441, $itm_sls_upri_cng_flg);
	}

	/**
	 * Allow sales unit price change (Item master) 販売単価変更許可（品目マスタ）.<p>
	 *
	 */
	public void itm_sls_upri_cng_flg(boolean value) {
		setConstBoolean(offset + 441, $itm_sls_upri_cng_flg, value);
	}


	/**
	 * Origin cd. (Item master) 原産地ＣＤ（品目マスタ）.<p>
	 *
	 */
	public String itm_cntry_org_cd() {
		return getConstString(offset + 442, $itm_cntry_org_cd);
	}

	/**
	 * Origin cd. (Item master) 原産地ＣＤ（品目マスタ）.<p>
	 *
	 */
	public void itm_cntry_org_cd(String value) {
		setConstString(offset + 442, $itm_cntry_org_cd, value);
	}


	/**
	 * Lot management type ロット管理区分.<p>
	 *
	 */
	public String lot_mng_typ() {
		return getConstString(offset + 443, $lot_mng_typ);
	}

	/**
	 * Lot management type ロット管理区分.<p>
	 *
	 */
	public void lot_mng_typ(String value) {
		setConstString(offset + 443, $lot_mng_typ, value);
	}


	/**
	 * Sublot management type サブロット管理区分.<p>
	 *
	 */
	public String sublot_mng_typ() {
		return getConstString(offset + 444, $sublot_mng_typ);
	}

	/**
	 * Sublot management type サブロット管理区分.<p>
	 *
	 */
	public void sublot_mng_typ(String value) {
		setConstString(offset + 444, $sublot_mng_typ, value);
	}


	/**
	 * Sales order procurement item (Master) 受注手配品（マスタ）.<p>
	 *
	 */
	public boolean slo_proc_flg() {
		return getConstBoolean(offset + 445, $slo_proc_flg);
	}

	/**
	 * Sales order procurement item (Master) 受注手配品（マスタ）.<p>
	 *
	 */
	public void slo_proc_flg(boolean value) {
		setConstBoolean(offset + 445, $slo_proc_flg, value);
	}


	/**
	 * Transaction unit cd. (Master) 取引単位ＣＤ（マスタ）.<p>
	 *
	 */
	public String itm_trd_unit_cd() {
		return getConstString(offset + 446, $itm_trd_unit_cd);
	}

	/**
	 * Transaction unit cd. (Master) 取引単位ＣＤ（マスタ）.<p>
	 *
	 */
	public void itm_trd_unit_cd(String value) {
		setConstString(offset + 446, $itm_trd_unit_cd, value);
	}


	/**
	 * Procurement type (Master) 手配区分（マスタ）.<p>
	 *
	 */
	public String itm_proc_typ() {
		return getConstString(offset + 447, $itm_proc_typ);
	}

	/**
	 * Procurement type (Master) 手配区分（マスタ）.<p>
	 *
	 */
	public void itm_proc_typ(String value) {
		setConstString(offset + 447, $itm_proc_typ, value);
	}


	/**
	 * Order type (Master) 指図区分（マスタ）.<p>
	 *
	 */
	public String itm_ship_inst_typ() {
		return getConstString(offset + 448, $itm_ship_inst_typ);
	}

	/**
	 * Order type (Master) 指図区分（マスタ）.<p>
	 *
	 */
	public void itm_ship_inst_typ(String value) {
		setConstString(offset + 448, $itm_ship_inst_typ, value);
	}


	/**
	 * Shipping conditions cd. (Master) 出荷条件ＣＤ（マスタ）.<p>
	 *
	 */
	public String itm_ship_term_cd() {
		return getConstString(offset + 449, $itm_ship_term_cd);
	}

	/**
	 * Shipping conditions cd. (Master) 出荷条件ＣＤ（マスタ）.<p>
	 *
	 */
	public void itm_ship_term_cd(String value) {
		setConstString(offset + 449, $itm_ship_term_cd, value);
	}


	/**
	 * Credit managed BP cd. 与信管理先ＣＤ.<p>
	 *
	 */
	public String cred_cd() {
		return getConstString(offset + 450, $cred_cd);
	}

	/**
	 * Credit managed BP cd. 与信管理先ＣＤ.<p>
	 *
	 */
	public void cred_cd(String value) {
		setConstString(offset + 450, $cred_cd, value);
	}


	/**
	 * Customer item name 得意先品名.<p>
	 *
	 */
	public String mst_cst_itm_nm() {
		return getConstString(offset + 451, $mst_cst_itm_nm);
	}

	/**
	 * Customer item name 得意先品名.<p>
	 *
	 */
	public void mst_cst_itm_nm(String value) {
		setConstString(offset + 451, $mst_cst_itm_nm, value);
	}


	/**
	 * Item name 品名.<p>
	 *
	 */
	public String mst_itm_nm() {
		return getConstString(offset + 452, $mst_itm_nm);
	}

	/**
	 * Item name 品名.<p>
	 *
	 */
	public void mst_itm_nm(String value) {
		setConstString(offset + 452, $mst_itm_nm, value);
	}


	/**
	 * Copy quotation 見積引継.<p>
	 *
	 */
	public boolean qtn_no_copy_flg() {
		return getConstBoolean(offset + 453, $qtn_no_copy_flg);
	}

	/**
	 * Copy quotation 見積引継.<p>
	 *
	 */
	public void qtn_no_copy_flg(boolean value) {
		setConstBoolean(offset + 453, $qtn_no_copy_flg, value);
	}


	public String getString(String name) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($rtn_sts_typ.equalsIgnoreCase(name)) {
			return rtn_sts_typ();
		}
		if ($sls_sts_typ.equalsIgnoreCase(name)) {
			return sls_sts_typ();
		}
		if ($sls_sts_typ_nm.equalsIgnoreCase(name)) {
			return sls_sts_typ_nm();
		}
		if ($pr_sts_typ.equalsIgnoreCase(name)) {
			return pr_sts_typ();
		}
		if ($pr_sts_typ_nm.equalsIgnoreCase(name)) {
			return pr_sts_typ_nm();
		}
		if ($alloc_sts_typ.equalsIgnoreCase(name)) {
			return alloc_sts_typ();
		}
		if ($alloc_sts_typ_nm.equalsIgnoreCase(name)) {
			return alloc_sts_typ_nm();
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			return trd_cd();
		}
		if ($trd_nm.equalsIgnoreCase(name)) {
			return trd_nm();
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			return trd_ptn_typ();
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
		if ($qtn_no.equalsIgnoreCase(name)) {
			return qtn_no();
		}
		if ($qtn_aprv_no.equalsIgnoreCase(name)) {
			return qtn_aprv_no();
		}
		if ($slo_d_no.equalsIgnoreCase(name)) {
			return slo_d_no();
		}
		if ($sim_alloc_pln_typ.equalsIgnoreCase(name)) {
			return sim_alloc_pln_typ();
		}
		if ($sim_alloc_pln_typ_nm.equalsIgnoreCase(name)) {
			return sim_alloc_pln_typ_nm();
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
		if ($assort_typ.equalsIgnoreCase(name)) {
			return assort_typ();
		}
		if ($assort_typ_nm.equalsIgnoreCase(name)) {
			return assort_typ_nm();
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
		if ($ptax_cur_cd.equalsIgnoreCase(name)) {
			return ptax_cur_cd();
		}
		if ($ptax_cur_nm.equalsIgnoreCase(name)) {
			return ptax_cur_nm();
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			return wrk_no();
		}
		if ($wrk_nm.equalsIgnoreCase(name)) {
			return wrk_nm();
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
		if ($iv_no.equalsIgnoreCase(name)) {
			return iv_no();
		}
		if ($adv_ship_ctrl_typ.equalsIgnoreCase(name)) {
			return adv_ship_ctrl_typ();
		}
		if ($adv_ship_ctrl_typ_nm.equalsIgnoreCase(name)) {
			return adv_ship_ctrl_typ_nm();
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
		if ($cst_po_no.equalsIgnoreCase(name)) {
			return cst_po_no();
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
		if ($rcpt_usr_cd.equalsIgnoreCase(name)) {
			return rcpt_usr_cd();
		}
		if ($rcpt_usr_nm.equalsIgnoreCase(name)) {
			return rcpt_usr_nm();
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
		if ($cntry_cd.equalsIgnoreCase(name)) {
			return cntry_cd();
		}
		if ($sls_amt_rnd_typ.equalsIgnoreCase(name)) {
			return sls_amt_rnd_typ();
		}
		if ($sls_tax_rnd_typ.equalsIgnoreCase(name)) {
			return sls_tax_rnd_typ();
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
		if ($aprv_no.equalsIgnoreCase(name)) {
			return aprv_no();
		}
		if ($aprv_sts_typ.equalsIgnoreCase(name)) {
			return aprv_sts_typ();
		}
		if ($aprv_sts_typ_nm.equalsIgnoreCase(name)) {
			return aprv_sts_typ_nm();
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
		if ($cst_itm_cd.equalsIgnoreCase(name)) {
			return cst_itm_cd();
		}
		if ($cst_itm_nm.equalsIgnoreCase(name)) {
			return cst_itm_nm();
		}
		if ($itm_cd.equalsIgnoreCase(name)) {
			return itm_cd();
		}
		if ($itm_sub1.equalsIgnoreCase(name)) {
			return itm_sub1();
		}
		if ($itm_sub2.equalsIgnoreCase(name)) {
			return itm_sub2();
		}
		if ($itm_sub3.equalsIgnoreCase(name)) {
			return itm_sub3();
		}
		if ($itm_nm.equalsIgnoreCase(name)) {
			return itm_nm();
		}
		if ($comp_spec_typ.equalsIgnoreCase(name)) {
			return comp_spec_typ();
		}
		if ($comp_spec_typ_nm.equalsIgnoreCase(name)) {
			return comp_spec_typ_nm();
		}
		if ($itm_comp_rev_no.equalsIgnoreCase(name)) {
			return itm_comp_rev_no();
		}
		if ($iv_itm_nm.equalsIgnoreCase(name)) {
			return iv_itm_nm();
		}
		if ($cntry_org_cd.equalsIgnoreCase(name)) {
			return cntry_org_cd();
		}
		if ($cntry_org_nm.equalsIgnoreCase(name)) {
			return cntry_org_nm();
		}
		if ($asset_mng_typ.equalsIgnoreCase(name)) {
			return asset_mng_typ();
		}
		if ($asset_mng_typ_nm.equalsIgnoreCase(name)) {
			return asset_mng_typ_nm();
		}
		if ($stk_mng_typ.equalsIgnoreCase(name)) {
			return stk_mng_typ();
		}
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			return trd_unit_cd();
		}
		if ($trd_unit_nm.equalsIgnoreCase(name)) {
			return trd_unit_nm();
		}
		if ($dscnt_rsn_cd.equalsIgnoreCase(name)) {
			return dscnt_rsn_cd();
		}
		if ($dscnt_rsn_nm.equalsIgnoreCase(name)) {
			return dscnt_rsn_nm();
		}
		if ($tax_cd.equalsIgnoreCase(name)) {
			return tax_cd();
		}
		if ($tax_nm.equalsIgnoreCase(name)) {
			return tax_nm();
		}
		if ($gd_cd.equalsIgnoreCase(name)) {
			return gd_cd();
		}
		if ($gd_nm.equalsIgnoreCase(name)) {
			return gd_nm();
		}
		if ($sno1.equalsIgnoreCase(name)) {
			return sno1();
		}
		if ($sno2.equalsIgnoreCase(name)) {
			return sno2();
		}
		if ($sno3.equalsIgnoreCase(name)) {
			return sno3();
		}
		if ($sno4.equalsIgnoreCase(name)) {
			return sno4();
		}
		if ($sno1_mng_typ.equalsIgnoreCase(name)) {
			return sno1_mng_typ();
		}
		if ($sno2_mng_typ.equalsIgnoreCase(name)) {
			return sno2_mng_typ();
		}
		if ($sno3_mng_typ.equalsIgnoreCase(name)) {
			return sno3_mng_typ();
		}
		if ($sno4_mng_typ.equalsIgnoreCase(name)) {
			return sno4_mng_typ();
		}
		if ($sno1_num_typ.equalsIgnoreCase(name)) {
			return sno1_num_typ();
		}
		if ($sno2_num_typ.equalsIgnoreCase(name)) {
			return sno2_num_typ();
		}
		if ($sno3_num_typ.equalsIgnoreCase(name)) {
			return sno3_num_typ();
		}
		if ($sno4_num_typ.equalsIgnoreCase(name)) {
			return sno4_num_typ();
		}
		if ($sno1_ptn_cd.equalsIgnoreCase(name)) {
			return sno1_ptn_cd();
		}
		if ($sno2_ptn_cd.equalsIgnoreCase(name)) {
			return sno2_ptn_cd();
		}
		if ($sno3_ptn_cd.equalsIgnoreCase(name)) {
			return sno3_ptn_cd();
		}
		if ($sno4_ptn_cd.equalsIgnoreCase(name)) {
			return sno4_ptn_cd();
		}
		if ($dlv_cd.equalsIgnoreCase(name)) {
			return dlv_cd();
		}
		if ($dlv_nm.equalsIgnoreCase(name)) {
			return dlv_nm();
		}
		if ($dlv_cntct_dpt.equalsIgnoreCase(name)) {
			return dlv_cntct_dpt();
		}
		if ($dlv_cntct_psn.equalsIgnoreCase(name)) {
			return dlv_cntct_psn();
		}
		if ($dlv_zip_cd.equalsIgnoreCase(name)) {
			return dlv_zip_cd();
		}
		if ($dlv_addr1.equalsIgnoreCase(name)) {
			return dlv_addr1();
		}
		if ($dlv_addr2.equalsIgnoreCase(name)) {
			return dlv_addr2();
		}
		if ($dlv_addr3.equalsIgnoreCase(name)) {
			return dlv_addr3();
		}
		if ($dlv_addr4.equalsIgnoreCase(name)) {
			return dlv_addr4();
		}
		if ($dlv_tel.equalsIgnoreCase(name)) {
			return dlv_tel();
		}
		if ($dlv_fax.equalsIgnoreCase(name)) {
			return dlv_fax();
		}
		if ($dlv_cntry_cd.equalsIgnoreCase(name)) {
			return dlv_cntry_cd();
		}
		if ($dlv_cntry_nm.equalsIgnoreCase(name)) {
			return dlv_cntry_nm();
		}
		if ($dlv_lg_grp_cd.equalsIgnoreCase(name)) {
			return dlv_lg_grp_cd();
		}
		if ($dlv_lg_grp_nm.equalsIgnoreCase(name)) {
			return dlv_lg_grp_nm();
		}
		if ($pri_prnt_typ.equalsIgnoreCase(name)) {
			return pri_prnt_typ();
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
		if ($tdlv_cd.equalsIgnoreCase(name)) {
			return tdlv_cd();
		}
		if ($tdlv_nm.equalsIgnoreCase(name)) {
			return tdlv_nm();
		}
		if ($via_dlv_typ.equalsIgnoreCase(name)) {
			return via_dlv_typ();
		}
		if ($via_dlv_typ_nm.equalsIgnoreCase(name)) {
			return via_dlv_typ_nm();
		}
		if ($tdlv_cntct_dpt.equalsIgnoreCase(name)) {
			return tdlv_cntct_dpt();
		}
		if ($tdlv_cntct_psn.equalsIgnoreCase(name)) {
			return tdlv_cntct_psn();
		}
		if ($tdlv_zip_cd.equalsIgnoreCase(name)) {
			return tdlv_zip_cd();
		}
		if ($tdlv_addr1.equalsIgnoreCase(name)) {
			return tdlv_addr1();
		}
		if ($tdlv_addr2.equalsIgnoreCase(name)) {
			return tdlv_addr2();
		}
		if ($tdlv_addr3.equalsIgnoreCase(name)) {
			return tdlv_addr3();
		}
		if ($tdlv_addr4.equalsIgnoreCase(name)) {
			return tdlv_addr4();
		}
		if ($tdlv_tel.equalsIgnoreCase(name)) {
			return tdlv_tel();
		}
		if ($tdlv_fax.equalsIgnoreCase(name)) {
			return tdlv_fax();
		}
		if ($tdlv_cntry_cd.equalsIgnoreCase(name)) {
			return tdlv_cntry_cd();
		}
		if ($tdlv_cntry_nm.equalsIgnoreCase(name)) {
			return tdlv_cntry_nm();
		}
		if ($tdlv_lg_grp_cd.equalsIgnoreCase(name)) {
			return tdlv_lg_grp_cd();
		}
		if ($tdlv_lg_grp_nm.equalsIgnoreCase(name)) {
			return tdlv_lg_grp_nm();
		}
		if ($dlv_day_week_typ.equalsIgnoreCase(name)) {
			return dlv_day_week_typ();
		}
		if ($dlv_day_week_typ_nm.equalsIgnoreCase(name)) {
			return dlv_day_week_typ_nm();
		}
		if ($proc_typ.equalsIgnoreCase(name)) {
			return proc_typ();
		}
		if ($proc_typ_nm.equalsIgnoreCase(name)) {
			return proc_typ_nm();
		}
		if ($ship_inst_typ.equalsIgnoreCase(name)) {
			return ship_inst_typ();
		}
		if ($ship_inst_typ_nm.equalsIgnoreCase(name)) {
			return ship_inst_typ_nm();
		}
		if ($ship_schd_split_typ.equalsIgnoreCase(name)) {
			return ship_schd_split_typ();
		}
		if ($ship_schd_split_typ_nm.equalsIgnoreCase(name)) {
			return ship_schd_split_typ_nm();
		}
		if ($alloc_scope_typ.equalsIgnoreCase(name)) {
			return alloc_scope_typ();
		}
		if ($alloc_scope_typ_nm.equalsIgnoreCase(name)) {
			return alloc_scope_typ_nm();
		}
		if ($alloc_typ.equalsIgnoreCase(name)) {
			return alloc_typ();
		}
		if ($alloc_typ_nm.equalsIgnoreCase(name)) {
			return alloc_typ_nm();
		}
		if ($rqst_to_loc_cd.equalsIgnoreCase(name)) {
			return rqst_to_loc_cd();
		}
		if ($rqst_to_loc_nm.equalsIgnoreCase(name)) {
			return rqst_to_loc_nm();
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			return sppl_cd();
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			return sppl_nm();
		}
		if ($maker_cd.equalsIgnoreCase(name)) {
			return maker_cd();
		}
		if ($maker_nm.equalsIgnoreCase(name)) {
			return maker_nm();
		}
		if ($wg_rqst_cnt_rmrks.equalsIgnoreCase(name)) {
			return wg_rqst_cnt_rmrks();
		}
		if ($rqst_to_wg_cd.equalsIgnoreCase(name)) {
			return rqst_to_wg_cd();
		}
		if ($alloc_grp_cd.equalsIgnoreCase(name)) {
			return alloc_grp_cd();
		}
		if ($alloc_grp_nm.equalsIgnoreCase(name)) {
			return alloc_grp_nm();
		}
		if ($ship_lg_grp_cd.equalsIgnoreCase(name)) {
			return ship_lg_grp_cd();
		}
		if ($ship_lg_grp_nm.equalsIgnoreCase(name)) {
			return ship_lg_grp_nm();
		}
		if ($def_loc_cd.equalsIgnoreCase(name)) {
			return def_loc_cd();
		}
		if ($def_loc_nm.equalsIgnoreCase(name)) {
			return def_loc_nm();
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			return loc_cd();
		}
		if ($loc_nm.equalsIgnoreCase(name)) {
			return loc_nm();
		}
		if ($str_ln_cd.equalsIgnoreCase(name)) {
			return str_ln_cd();
		}
		if ($str_ln_nm.equalsIgnoreCase(name)) {
			return str_ln_nm();
		}
		if ($lot_no.equalsIgnoreCase(name)) {
			return lot_no();
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			return sublot_no();
		}
		if ($ver_no.equalsIgnoreCase(name)) {
			return ver_no();
		}
		if ($ship_term_cd.equalsIgnoreCase(name)) {
			return ship_term_cd();
		}
		if ($ship_term_nm.equalsIgnoreCase(name)) {
			return ship_term_nm();
		}
		if ($ship_cnt_rmrks.equalsIgnoreCase(name)) {
			return ship_cnt_rmrks();
		}
		if ($cst_po_d_no.equalsIgnoreCase(name)) {
			return cst_po_d_no();
		}
		if ($cst_po_d_rmrks.equalsIgnoreCase(name)) {
			return cst_po_d_rmrks();
		}
		if ($sls_rsn_cd.equalsIgnoreCase(name)) {
			return sls_rsn_cd();
		}
		if ($sls_rsn_nm.equalsIgnoreCase(name)) {
			return sls_rsn_nm();
		}
		if ($bd_dpt_cd.equalsIgnoreCase(name)) {
			return bd_dpt_cd();
		}
		if ($bd_dpt_nm.equalsIgnoreCase(name)) {
			return bd_dpt_nm();
		}
		if ($sls_upri_req_typ.equalsIgnoreCase(name)) {
			return sls_upri_req_typ();
		}
		if ($sls_upri_req_typ_nm.equalsIgnoreCase(name)) {
			return sls_upri_req_typ_nm();
		}
		if ($io_schd_pr_no.equalsIgnoreCase(name)) {
			return io_schd_pr_no();
		}
		if ($trd_d_rmrks.equalsIgnoreCase(name)) {
			return trd_d_rmrks();
		}
		if ($slo_d_intr_rmrks.equalsIgnoreCase(name)) {
			return slo_d_intr_rmrks();
		}
		if ($slo_d_sub_char1.equalsIgnoreCase(name)) {
			return slo_d_sub_char1();
		}
		if ($slo_d_sub_char2.equalsIgnoreCase(name)) {
			return slo_d_sub_char2();
		}
		if ($slo_d_sub_char3.equalsIgnoreCase(name)) {
			return slo_d_sub_char3();
		}
		if ($qtn_d_no.equalsIgnoreCase(name)) {
			return qtn_d_no();
		}
		if ($edi_sub_d_char1.equalsIgnoreCase(name)) {
			return edi_sub_d_char1();
		}
		if ($edi_sub_d_char2.equalsIgnoreCase(name)) {
			return edi_sub_d_char2();
		}
		if ($edi_sub_d_char3.equalsIgnoreCase(name)) {
			return edi_sub_d_char3();
		}
		if ($edi_sub_d_char4.equalsIgnoreCase(name)) {
			return edi_sub_d_char4();
		}
		if ($edi_sub_d_char5.equalsIgnoreCase(name)) {
			return edi_sub_d_char5();
		}
		if ($slo_d_can_rsn_cd.equalsIgnoreCase(name)) {
			return slo_d_can_rsn_cd();
		}
		if ($slo_d_can_rsn_nm.equalsIgnoreCase(name)) {
			return slo_d_can_rsn_nm();
		}
		if ($slo_d_can_rmkrs.equalsIgnoreCase(name)) {
			return slo_d_can_rmkrs();
		}
		if ($ship_pr_no.equalsIgnoreCase(name)) {
			return ship_pr_no();
		}
		if ($itm_ship_grp_cd.equalsIgnoreCase(name)) {
			return itm_ship_grp_cd();
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			return base_unit_nm();
		}
		if ($base_unit_rnd_typ.equalsIgnoreCase(name)) {
			return base_unit_rnd_typ();
		}
		if ($trd_unit_rnd_typ.equalsIgnoreCase(name)) {
			return trd_unit_rnd_typ();
		}
		if ($cst_ship_schd_split_typ.equalsIgnoreCase(name)) {
			return cst_ship_schd_split_typ();
		}
		if ($cst_sls_basis_typ.equalsIgnoreCase(name)) {
			return cst_sls_basis_typ();
		}
		if ($cst_sls_usr_cd.equalsIgnoreCase(name)) {
			return cst_sls_usr_cd();
		}
		if ($cst_sls_dpt_cd.equalsIgnoreCase(name)) {
			return cst_sls_dpt_cd();
		}
		if ($cst_ar_dpt_cd.equalsIgnoreCase(name)) {
			return cst_ar_dpt_cd();
		}
		if ($cst_sls_upri_req_typ.equalsIgnoreCase(name)) {
			return cst_sls_upri_req_typ();
		}
		if ($ar_dpt_typ.equalsIgnoreCase(name)) {
			return ar_dpt_typ();
		}
		if ($cst_trd_cur_cd.equalsIgnoreCase(name)) {
			return cst_trd_cur_cd();
		}
		if ($mst_dlv_nm.equalsIgnoreCase(name)) {
			return mst_dlv_nm();
		}
		if ($mst_dlv_cntct_dpt.equalsIgnoreCase(name)) {
			return mst_dlv_cntct_dpt();
		}
		if ($mst_dlv_cntct_psn.equalsIgnoreCase(name)) {
			return mst_dlv_cntct_psn();
		}
		if ($mst_dlv_zip_cd.equalsIgnoreCase(name)) {
			return mst_dlv_zip_cd();
		}
		if ($mst_dlv_addr1.equalsIgnoreCase(name)) {
			return mst_dlv_addr1();
		}
		if ($mst_dlv_addr2.equalsIgnoreCase(name)) {
			return mst_dlv_addr2();
		}
		if ($mst_dlv_addr3.equalsIgnoreCase(name)) {
			return mst_dlv_addr3();
		}
		if ($mst_dlv_addr4.equalsIgnoreCase(name)) {
			return mst_dlv_addr4();
		}
		if ($mst_dlv_tel.equalsIgnoreCase(name)) {
			return mst_dlv_tel();
		}
		if ($mst_dlv_fax.equalsIgnoreCase(name)) {
			return mst_dlv_fax();
		}
		if ($mst_dlv_lg_grp_cd.equalsIgnoreCase(name)) {
			return mst_dlv_lg_grp_cd();
		}
		if ($prnt_lcl_cd.equalsIgnoreCase(name)) {
			return prnt_lcl_cd();
		}
		if ($mst_tdlv_nm.equalsIgnoreCase(name)) {
			return mst_tdlv_nm();
		}
		if ($mst_tdlv_cntct_dpt.equalsIgnoreCase(name)) {
			return mst_tdlv_cntct_dpt();
		}
		if ($mst_tdlv_cntct_psn.equalsIgnoreCase(name)) {
			return mst_tdlv_cntct_psn();
		}
		if ($mst_tdlv_zip_cd.equalsIgnoreCase(name)) {
			return mst_tdlv_zip_cd();
		}
		if ($mst_tdlv_addr1.equalsIgnoreCase(name)) {
			return mst_tdlv_addr1();
		}
		if ($mst_tdlv_addr2.equalsIgnoreCase(name)) {
			return mst_tdlv_addr2();
		}
		if ($mst_tdlv_addr3.equalsIgnoreCase(name)) {
			return mst_tdlv_addr3();
		}
		if ($mst_tdlv_addr4.equalsIgnoreCase(name)) {
			return mst_tdlv_addr4();
		}
		if ($mst_tdlv_tel.equalsIgnoreCase(name)) {
			return mst_tdlv_tel();
		}
		if ($mst_tdlv_fax.equalsIgnoreCase(name)) {
			return mst_tdlv_fax();
		}
		if ($mst_tdlv_lg_grp_cd.equalsIgnoreCase(name)) {
			return mst_tdlv_lg_grp_cd();
		}
		if ($mst_via_dlv_typ.equalsIgnoreCase(name)) {
			return mst_via_dlv_typ();
		}
		if ($mid_loc_cd.equalsIgnoreCase(name)) {
			return mid_loc_cd();
		}
		if ($loc_wg_cd.equalsIgnoreCase(name)) {
			return loc_wg_cd();
		}
		if ($tax_typ.equalsIgnoreCase(name)) {
			return tax_typ();
		}
		if ($itm_cntry_org_cd.equalsIgnoreCase(name)) {
			return itm_cntry_org_cd();
		}
		if ($lot_mng_typ.equalsIgnoreCase(name)) {
			return lot_mng_typ();
		}
		if ($sublot_mng_typ.equalsIgnoreCase(name)) {
			return sublot_mng_typ();
		}
		if ($itm_trd_unit_cd.equalsIgnoreCase(name)) {
			return itm_trd_unit_cd();
		}
		if ($itm_proc_typ.equalsIgnoreCase(name)) {
			return itm_proc_typ();
		}
		if ($itm_ship_inst_typ.equalsIgnoreCase(name)) {
			return itm_ship_inst_typ();
		}
		if ($itm_ship_term_cd.equalsIgnoreCase(name)) {
			return itm_ship_term_cd();
		}
		if ($cred_cd.equalsIgnoreCase(name)) {
			return cred_cd();
		}
		if ($mst_cst_itm_nm.equalsIgnoreCase(name)) {
			return mst_cst_itm_nm();
		}
		if ($mst_itm_nm.equalsIgnoreCase(name)) {
			return mst_itm_nm();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($slo_rev.equalsIgnoreCase(name)) {
			return slo_rev();
		}
		if ($qtn_rev.equalsIgnoreCase(name)) {
			return qtn_rev();
		}
		if ($slo_d_rev.equalsIgnoreCase(name)) {
			return slo_d_rev();
		}
		if ($trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			return trd_cur_upri_dec_place();
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			return trd_cur_amt_dec_place();
		}
		if ($xrate.equalsIgnoreCase(name)) {
			return xrate();
		}
		if ($base_cur_upri.equalsIgnoreCase(name)) {
			return base_cur_upri();
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			return base_cur_amt();
		}
		if ($base_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			return base_cur_inc_tax_amt();
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			return base_cur_tax_amt();
		}
		if ($ptax_xrate.equalsIgnoreCase(name)) {
			return ptax_xrate();
		}
		if ($ptax_cur_upri.equalsIgnoreCase(name)) {
			return ptax_cur_upri();
		}
		if ($ptax_cur_amt.equalsIgnoreCase(name)) {
			return ptax_cur_amt();
		}
		if ($ptax_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			return ptax_cur_inc_tax_amt();
		}
		if ($ptax_cur_tax_amt.equalsIgnoreCase(name)) {
			return ptax_cur_tax_amt();
		}
		if ($prof_rate.equalsIgnoreCase(name)) {
			return prof_rate();
		}
		if ($adv_bill_amt.equalsIgnoreCase(name)) {
			return adv_bill_amt();
		}
		if ($adv_rcv_amt.equalsIgnoreCase(name)) {
			return adv_rcv_amt();
		}
		if ($cst_po_rev.equalsIgnoreCase(name)) {
			return cst_po_rev();
		}
		if ($slo_upd_cntr.equalsIgnoreCase(name)) {
			return slo_upd_cntr();
		}
		if ($qtn_upd_cntr.equalsIgnoreCase(name)) {
			return qtn_upd_cntr();
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			return amt_dec_place();
		}
		if ($edi_sub_num1.equalsIgnoreCase(name)) {
			return edi_sub_num1();
		}
		if ($hdr_grp_no.equalsIgnoreCase(name)) {
			return hdr_grp_no();
		}
		if ($alloc_margin_days.equalsIgnoreCase(name)) {
			return alloc_margin_days();
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			return trd_unit_qty();
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			return trd_unit_dec_place();
		}
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			return trd_unit_conv_base_qty();
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			return trd_unit_conv_qty();
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			return trd_cur_upri();
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			return trd_cur_amt();
		}
		if ($trd_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			return trd_cur_inc_tax_amt();
		}
		if ($cost_upri.equalsIgnoreCase(name)) {
			return cost_upri();
		}
		if ($cost_amt.equalsIgnoreCase(name)) {
			return cost_amt();
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			return trd_cur_dscnt_amt();
		}
		if ($iv_upri.equalsIgnoreCase(name)) {
			return iv_upri();
		}
		if ($iv_amt.equalsIgnoreCase(name)) {
			return iv_amt();
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			return tax_rate();
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			return trd_cur_tax_amt();
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			return wtax_rate();
		}
		if ($wtax_amt.equalsIgnoreCase(name)) {
			return wtax_amt();
		}
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			return bill_crryovr_times();
		}
		if ($set_itm_grp_no.equalsIgnoreCase(name)) {
			return set_itm_grp_no();
		}
		if ($edi_sub_d_num1.equalsIgnoreCase(name)) {
			return edi_sub_d_num1();
		}
		if ($ship_pr_upd_cntr.equalsIgnoreCase(name)) {
			return ship_pr_upd_cntr();
		}
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			return hdr_peg_no();
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			return base_unit_qty();
		}
		if ($ship_pr_base_unit_qty.equalsIgnoreCase(name)) {
			return ship_pr_base_unit_qty();
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			return base_unit_dec_place();
		}
		if ($prms_qty.equalsIgnoreCase(name)) {
			return prms_qty();
		}
		if ($dlv_inst_rcpt_qty.equalsIgnoreCase(name)) {
			return dlv_inst_rcpt_qty();
		}
		if ($dlv_inst_prms_qty.equalsIgnoreCase(name)) {
			return dlv_inst_prms_qty();
		}
		if ($alloc_qty.equalsIgnoreCase(name)) {
			return alloc_qty();
		}
		if ($wait_qty.equalsIgnoreCase(name)) {
			return wait_qty();
		}
		if ($ship_inst_qty.equalsIgnoreCase(name)) {
			return ship_inst_qty();
		}
		if ($ship_act_qty.equalsIgnoreCase(name)) {
			return ship_act_qty();
		}
		if ($iv_schd_qty.equalsIgnoreCase(name)) {
			return iv_schd_qty();
		}
		if ($iv_act_qty.equalsIgnoreCase(name)) {
			return iv_act_qty();
		}
		if ($sls_qty.equalsIgnoreCase(name)) {
			return sls_qty();
		}
		if ($ship_ret_qty.equalsIgnoreCase(name)) {
			return ship_ret_qty();
		}
		if ($re_ship_schd_qty.equalsIgnoreCase(name)) {
			return re_ship_schd_qty();
		}
		if ($ship_schd_abort_qty.equalsIgnoreCase(name)) {
			return ship_schd_abort_qty();
		}
		if ($sls_schd_abort_qty.equalsIgnoreCase(name)) {
			return sls_schd_abort_qty();
		}
		if ($not_dlv_qty.equalsIgnoreCase(name)) {
			return not_dlv_qty();
		}
		if ($overdue_prspct_qty.equalsIgnoreCase(name)) {
			return overdue_prspct_qty();
		}
		if ($ship_pr_rate.equalsIgnoreCase(name)) {
			return ship_pr_rate();
		}
		if ($sls_pr_rate.equalsIgnoreCase(name)) {
			return sls_pr_rate();
		}
		if ($act_dlv_lt.equalsIgnoreCase(name)) {
			return act_dlv_lt();
		}
		if ($dlv_qty.equalsIgnoreCase(name)) {
			return dlv_qty();
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			return disp_seq();
		}
		if ($cst_bill_crryovr_times.equalsIgnoreCase(name)) {
			return cst_bill_crryovr_times();
		}
		if ($cst_upri_dec_place.equalsIgnoreCase(name)) {
			return cst_upri_dec_place();
		}
		if ($cst_amt_dec_place.equalsIgnoreCase(name)) {
			return cst_amt_dec_place();
		}
		if ($upri_dec_place.equalsIgnoreCase(name)) {
			return upri_dec_place();
		}
		if ($mst_trd_cur_upri.equalsIgnoreCase(name)) {
			return mst_trd_cur_upri();
		}
		if ($itm_bill_crryovr_times.equalsIgnoreCase(name)) {
			return itm_bill_crryovr_times();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($slo_dt.equalsIgnoreCase(name)) {
			return slo_dt();
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
		if ($rcpt_dt.equalsIgnoreCase(name)) {
			return rcpt_dt();
		}
		if ($edi_sub_dt1.equalsIgnoreCase(name)) {
			return edi_sub_dt1();
		}
		if ($ship_rqst_tm.equalsIgnoreCase(name)) {
			return ship_rqst_tm();
		}
		if ($ship_rqst_dt.equalsIgnoreCase(name)) {
			return ship_rqst_dt();
		}
		if ($ship_rqst_hm.equalsIgnoreCase(name)) {
			return ship_rqst_hm();
		}
		if ($dlv_rqst_tm.equalsIgnoreCase(name)) {
			return dlv_rqst_tm();
		}
		if ($dlv_rqst_dt.equalsIgnoreCase(name)) {
			return dlv_rqst_dt();
		}
		if ($dlv_rqst_hm.equalsIgnoreCase(name)) {
			return dlv_rqst_hm();
		}
		if ($pd_inst_dlv_dt.equalsIgnoreCase(name)) {
			return pd_inst_dlv_dt();
		}
		if ($pd_inst_dlv_hm.equalsIgnoreCase(name)) {
			return pd_inst_dlv_hm();
		}
		if ($accpt_schd_dt.equalsIgnoreCase(name)) {
			return accpt_schd_dt();
		}
		if ($sls_schd_dt.equalsIgnoreCase(name)) {
			return sls_schd_dt();
		}
		if ($ship_schd_tm.equalsIgnoreCase(name)) {
			return ship_schd_tm();
		}
		if ($ship_schd_dt.equalsIgnoreCase(name)) {
			return ship_schd_dt();
		}
		if ($ship_schd_hm.equalsIgnoreCase(name)) {
			return ship_schd_hm();
		}
		if ($dlv_schd_tm.equalsIgnoreCase(name)) {
			return dlv_schd_tm();
		}
		if ($dlv_schd_dt.equalsIgnoreCase(name)) {
			return dlv_schd_dt();
		}
		if ($dlv_schd_hm.equalsIgnoreCase(name)) {
			return dlv_schd_hm();
		}
		if ($rqst_dt.equalsIgnoreCase(name)) {
			return rqst_dt();
		}
		if ($rqst_dlv_rqst_dt.equalsIgnoreCase(name)) {
			return rqst_dlv_rqst_dt();
		}
		if ($rqst_prms_dt.equalsIgnoreCase(name)) {
			return rqst_prms_dt();
		}
		if ($rqst_prms_dlv_dt.equalsIgnoreCase(name)) {
			return rqst_prms_dlv_dt();
		}
		if ($edi_sub_d_dt1.equalsIgnoreCase(name)) {
			return edi_sub_d_dt1();
		}
		if ($prms_dt.equalsIgnoreCase(name)) {
			return prms_dt();
		}
		if ($dlv_inst_rcpt_dt.equalsIgnoreCase(name)) {
			return dlv_inst_rcpt_dt();
		}
		if ($dlv_inst_prms_dt.equalsIgnoreCase(name)) {
			return dlv_inst_prms_dt();
		}
		if ($dlv_inst_dt.equalsIgnoreCase(name)) {
			return dlv_inst_dt();
		}
		if ($dlv_inst_hm.equalsIgnoreCase(name)) {
			return dlv_inst_hm();
		}
		if ($prms_dlv_dt.equalsIgnoreCase(name)) {
			return prms_dlv_dt();
		}
		if ($ship_dt.equalsIgnoreCase(name)) {
			return ship_dt();
		}
		if ($ship_hm.equalsIgnoreCase(name)) {
			return ship_hm();
		}
		if ($dlv_dt.equalsIgnoreCase(name)) {
			return dlv_dt();
		}
		if ($dlv_hm.equalsIgnoreCase(name)) {
			return dlv_hm();
		}
		if ($sls_dt.equalsIgnoreCase(name)) {
			return sls_dt();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		if ($qtn_aprv_flg.equalsIgnoreCase(name)) {
			return qtn_aprv_flg();
		}
		if ($can_upd_flg.equalsIgnoreCase(name)) {
			return can_upd_flg();
		}
		if ($can_del_flg.equalsIgnoreCase(name)) {
			return can_del_flg();
		}
		if ($cst_iv_flg.equalsIgnoreCase(name)) {
			return cst_iv_flg();
		}
		if ($xrate_inpt_flg.equalsIgnoreCase(name)) {
			return xrate_inpt_flg();
		}
		if ($ptax_xrate_inpt_flg.equalsIgnoreCase(name)) {
			return ptax_xrate_inpt_flg();
		}
		if ($iv_num_flg.equalsIgnoreCase(name)) {
			return iv_num_flg();
		}
		if ($edi_flg.equalsIgnoreCase(name)) {
			return edi_flg();
		}
		if ($is_src_batch_flg.equalsIgnoreCase(name)) {
			return is_src_batch_flg();
		}
		if ($aprv_flg.equalsIgnoreCase(name)) {
			return aprv_flg();
		}
		if ($aprv_back_flg.equalsIgnoreCase(name)) {
			return aprv_back_flg();
		}
		if ($can_flg.equalsIgnoreCase(name)) {
			return can_flg();
		}
		if ($hdr_err_flg.equalsIgnoreCase(name)) {
			return hdr_err_flg();
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			return abort_flg();
		}
		if ($vmi_flg.equalsIgnoreCase(name)) {
			return vmi_flg();
		}
		if ($dscnt_itm_flg.equalsIgnoreCase(name)) {
			return dscnt_itm_flg();
		}
		if ($sundry_itm_flg.equalsIgnoreCase(name)) {
			return sundry_itm_flg();
		}
		if ($upri_not_tgt_flg.equalsIgnoreCase(name)) {
			return upri_not_tgt_flg();
		}
		if ($interim_flg.equalsIgnoreCase(name)) {
			return interim_flg();
		}
		if ($tax_fix_flg.equalsIgnoreCase(name)) {
			return tax_fix_flg();
		}
		if ($inc_tax_flg.equalsIgnoreCase(name)) {
			return inc_tax_flg();
		}
		if ($sno_num_flg.equalsIgnoreCase(name)) {
			return sno_num_flg();
		}
		if ($sno1_null_flg.equalsIgnoreCase(name)) {
			return sno1_null_flg();
		}
		if ($sno2_null_flg.equalsIgnoreCase(name)) {
			return sno2_null_flg();
		}
		if ($sno3_null_flg.equalsIgnoreCase(name)) {
			return sno3_null_flg();
		}
		if ($sno4_null_flg.equalsIgnoreCase(name)) {
			return sno4_null_flg();
		}
		if ($slo_sno1_flg.equalsIgnoreCase(name)) {
			return slo_sno1_flg();
		}
		if ($slo_sno2_flg.equalsIgnoreCase(name)) {
			return slo_sno2_flg();
		}
		if ($slo_sno3_flg.equalsIgnoreCase(name)) {
			return slo_sno3_flg();
		}
		if ($slo_sno4_flg.equalsIgnoreCase(name)) {
			return slo_sno4_flg();
		}
		if ($ship_schd_split_flg.equalsIgnoreCase(name)) {
			return ship_schd_split_flg();
		}
		if ($ship_abl_flg.equalsIgnoreCase(name)) {
			return ship_abl_flg();
		}
		if ($dlv_sundry_flg.equalsIgnoreCase(name)) {
			return dlv_sundry_flg();
		}
		if ($pri_prnt_flg.equalsIgnoreCase(name)) {
			return pri_prnt_flg();
		}
		if ($tdlv_req_flg.equalsIgnoreCase(name)) {
			return tdlv_req_flg();
		}
		if ($tdlv_sundry_flg.equalsIgnoreCase(name)) {
			return tdlv_sundry_flg();
		}
		if ($sls_cststk_flg.equalsIgnoreCase(name)) {
			return sls_cststk_flg();
		}
		if ($not_lg_mix_flg.equalsIgnoreCase(name)) {
			return not_lg_mix_flg();
		}
		if ($str_ln_tgt_flg.equalsIgnoreCase(name)) {
			return str_ln_tgt_flg();
		}
		if ($str_ln_cd_none_flg.equalsIgnoreCase(name)) {
			return str_ln_cd_none_flg();
		}
		if ($not_lot_mix_flg.equalsIgnoreCase(name)) {
			return not_lot_mix_flg();
		}
		if ($not_sublot_mix_flg.equalsIgnoreCase(name)) {
			return not_sublot_mix_flg();
		}
		if ($ver_flg.equalsIgnoreCase(name)) {
			return ver_flg();
		}
		if ($ship_block_flg.equalsIgnoreCase(name)) {
			return ship_block_flg();
		}
		if ($sls_acxfr_flg.equalsIgnoreCase(name)) {
			return sls_acxfr_flg();
		}
		if ($not_dt_calc_flg.equalsIgnoreCase(name)) {
			return not_dt_calc_flg();
		}
		if ($slo_d_can_flg.equalsIgnoreCase(name)) {
			return slo_d_can_flg();
		}
		if ($dtl_err_flg.equalsIgnoreCase(name)) {
			return dtl_err_flg();
		}
		if ($upd_cntr_not_chk_flg.equalsIgnoreCase(name)) {
			return upd_cntr_not_chk_flg();
		}
		if ($ship_cmpl_flg.equalsIgnoreCase(name)) {
			return ship_cmpl_flg();
		}
		if ($sls_cmpl_flg.equalsIgnoreCase(name)) {
			return sls_cmpl_flg();
		}
		if ($pack_flg.equalsIgnoreCase(name)) {
			return pack_flg();
		}
		if ($fix_flg.equalsIgnoreCase(name)) {
			return fix_flg();
		}
		if ($re_ship_schd_flg.equalsIgnoreCase(name)) {
			return re_ship_schd_flg();
		}
		if ($dlv_rqst_dt_overdue_act_flg.equalsIgnoreCase(name)) {
			return dlv_rqst_dt_overdue_act_flg();
		}
		if ($prms_dlv_dt_overdue_act_flg.equalsIgnoreCase(name)) {
			return prms_dlv_dt_overdue_act_flg();
		}
		if ($bd_dpt_flg.equalsIgnoreCase(name)) {
			return bd_dpt_flg();
		}
		if ($cst_sls_upri_cng_flg.equalsIgnoreCase(name)) {
			return cst_sls_upri_cng_flg();
		}
		if ($mst_interim_flg.equalsIgnoreCase(name)) {
			return mst_interim_flg();
		}
		if ($itm_sls_upri_cng_flg.equalsIgnoreCase(name)) {
			return itm_sls_upri_cng_flg();
		}
		if ($slo_proc_flg.equalsIgnoreCase(name)) {
			return slo_proc_flg();
		}
		if ($qtn_no_copy_flg.equalsIgnoreCase(name)) {
			return qtn_no_copy_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($rtn_sts_typ.equalsIgnoreCase(name)) {
			return rtn_sts_typ();
		}
		if ($sls_sts_typ.equalsIgnoreCase(name)) {
			return sls_sts_typ();
		}
		if ($sls_sts_typ_nm.equalsIgnoreCase(name)) {
			return sls_sts_typ_nm();
		}
		if ($pr_sts_typ.equalsIgnoreCase(name)) {
			return pr_sts_typ();
		}
		if ($pr_sts_typ_nm.equalsIgnoreCase(name)) {
			return pr_sts_typ_nm();
		}
		if ($alloc_sts_typ.equalsIgnoreCase(name)) {
			return alloc_sts_typ();
		}
		if ($alloc_sts_typ_nm.equalsIgnoreCase(name)) {
			return alloc_sts_typ_nm();
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			return trd_cd();
		}
		if ($trd_nm.equalsIgnoreCase(name)) {
			return trd_nm();
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			return trd_ptn_typ();
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
		if ($qtn_no.equalsIgnoreCase(name)) {
			return qtn_no();
		}
		if ($qtn_aprv_no.equalsIgnoreCase(name)) {
			return qtn_aprv_no();
		}
		if ($slo_d_no.equalsIgnoreCase(name)) {
			return slo_d_no();
		}
		if ($sim_alloc_pln_typ.equalsIgnoreCase(name)) {
			return sim_alloc_pln_typ();
		}
		if ($sim_alloc_pln_typ_nm.equalsIgnoreCase(name)) {
			return sim_alloc_pln_typ_nm();
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
		if ($assort_typ.equalsIgnoreCase(name)) {
			return assort_typ();
		}
		if ($assort_typ_nm.equalsIgnoreCase(name)) {
			return assort_typ_nm();
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
		if ($ptax_cur_cd.equalsIgnoreCase(name)) {
			return ptax_cur_cd();
		}
		if ($ptax_cur_nm.equalsIgnoreCase(name)) {
			return ptax_cur_nm();
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			return wrk_no();
		}
		if ($wrk_nm.equalsIgnoreCase(name)) {
			return wrk_nm();
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
		if ($iv_no.equalsIgnoreCase(name)) {
			return iv_no();
		}
		if ($adv_ship_ctrl_typ.equalsIgnoreCase(name)) {
			return adv_ship_ctrl_typ();
		}
		if ($adv_ship_ctrl_typ_nm.equalsIgnoreCase(name)) {
			return adv_ship_ctrl_typ_nm();
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
		if ($cst_po_no.equalsIgnoreCase(name)) {
			return cst_po_no();
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
		if ($rcpt_usr_cd.equalsIgnoreCase(name)) {
			return rcpt_usr_cd();
		}
		if ($rcpt_usr_nm.equalsIgnoreCase(name)) {
			return rcpt_usr_nm();
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
		if ($cntry_cd.equalsIgnoreCase(name)) {
			return cntry_cd();
		}
		if ($sls_amt_rnd_typ.equalsIgnoreCase(name)) {
			return sls_amt_rnd_typ();
		}
		if ($sls_tax_rnd_typ.equalsIgnoreCase(name)) {
			return sls_tax_rnd_typ();
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
		if ($aprv_no.equalsIgnoreCase(name)) {
			return aprv_no();
		}
		if ($aprv_sts_typ.equalsIgnoreCase(name)) {
			return aprv_sts_typ();
		}
		if ($aprv_sts_typ_nm.equalsIgnoreCase(name)) {
			return aprv_sts_typ_nm();
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
		if ($cst_itm_cd.equalsIgnoreCase(name)) {
			return cst_itm_cd();
		}
		if ($cst_itm_nm.equalsIgnoreCase(name)) {
			return cst_itm_nm();
		}
		if ($itm_cd.equalsIgnoreCase(name)) {
			return itm_cd();
		}
		if ($itm_sub1.equalsIgnoreCase(name)) {
			return itm_sub1();
		}
		if ($itm_sub2.equalsIgnoreCase(name)) {
			return itm_sub2();
		}
		if ($itm_sub3.equalsIgnoreCase(name)) {
			return itm_sub3();
		}
		if ($itm_nm.equalsIgnoreCase(name)) {
			return itm_nm();
		}
		if ($comp_spec_typ.equalsIgnoreCase(name)) {
			return comp_spec_typ();
		}
		if ($comp_spec_typ_nm.equalsIgnoreCase(name)) {
			return comp_spec_typ_nm();
		}
		if ($itm_comp_rev_no.equalsIgnoreCase(name)) {
			return itm_comp_rev_no();
		}
		if ($iv_itm_nm.equalsIgnoreCase(name)) {
			return iv_itm_nm();
		}
		if ($cntry_org_cd.equalsIgnoreCase(name)) {
			return cntry_org_cd();
		}
		if ($cntry_org_nm.equalsIgnoreCase(name)) {
			return cntry_org_nm();
		}
		if ($asset_mng_typ.equalsIgnoreCase(name)) {
			return asset_mng_typ();
		}
		if ($asset_mng_typ_nm.equalsIgnoreCase(name)) {
			return asset_mng_typ_nm();
		}
		if ($stk_mng_typ.equalsIgnoreCase(name)) {
			return stk_mng_typ();
		}
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			return trd_unit_cd();
		}
		if ($trd_unit_nm.equalsIgnoreCase(name)) {
			return trd_unit_nm();
		}
		if ($dscnt_rsn_cd.equalsIgnoreCase(name)) {
			return dscnt_rsn_cd();
		}
		if ($dscnt_rsn_nm.equalsIgnoreCase(name)) {
			return dscnt_rsn_nm();
		}
		if ($tax_cd.equalsIgnoreCase(name)) {
			return tax_cd();
		}
		if ($tax_nm.equalsIgnoreCase(name)) {
			return tax_nm();
		}
		if ($gd_cd.equalsIgnoreCase(name)) {
			return gd_cd();
		}
		if ($gd_nm.equalsIgnoreCase(name)) {
			return gd_nm();
		}
		if ($sno1.equalsIgnoreCase(name)) {
			return sno1();
		}
		if ($sno2.equalsIgnoreCase(name)) {
			return sno2();
		}
		if ($sno3.equalsIgnoreCase(name)) {
			return sno3();
		}
		if ($sno4.equalsIgnoreCase(name)) {
			return sno4();
		}
		if ($sno1_mng_typ.equalsIgnoreCase(name)) {
			return sno1_mng_typ();
		}
		if ($sno2_mng_typ.equalsIgnoreCase(name)) {
			return sno2_mng_typ();
		}
		if ($sno3_mng_typ.equalsIgnoreCase(name)) {
			return sno3_mng_typ();
		}
		if ($sno4_mng_typ.equalsIgnoreCase(name)) {
			return sno4_mng_typ();
		}
		if ($sno1_num_typ.equalsIgnoreCase(name)) {
			return sno1_num_typ();
		}
		if ($sno2_num_typ.equalsIgnoreCase(name)) {
			return sno2_num_typ();
		}
		if ($sno3_num_typ.equalsIgnoreCase(name)) {
			return sno3_num_typ();
		}
		if ($sno4_num_typ.equalsIgnoreCase(name)) {
			return sno4_num_typ();
		}
		if ($sno1_ptn_cd.equalsIgnoreCase(name)) {
			return sno1_ptn_cd();
		}
		if ($sno2_ptn_cd.equalsIgnoreCase(name)) {
			return sno2_ptn_cd();
		}
		if ($sno3_ptn_cd.equalsIgnoreCase(name)) {
			return sno3_ptn_cd();
		}
		if ($sno4_ptn_cd.equalsIgnoreCase(name)) {
			return sno4_ptn_cd();
		}
		if ($dlv_cd.equalsIgnoreCase(name)) {
			return dlv_cd();
		}
		if ($dlv_nm.equalsIgnoreCase(name)) {
			return dlv_nm();
		}
		if ($dlv_cntct_dpt.equalsIgnoreCase(name)) {
			return dlv_cntct_dpt();
		}
		if ($dlv_cntct_psn.equalsIgnoreCase(name)) {
			return dlv_cntct_psn();
		}
		if ($dlv_zip_cd.equalsIgnoreCase(name)) {
			return dlv_zip_cd();
		}
		if ($dlv_addr1.equalsIgnoreCase(name)) {
			return dlv_addr1();
		}
		if ($dlv_addr2.equalsIgnoreCase(name)) {
			return dlv_addr2();
		}
		if ($dlv_addr3.equalsIgnoreCase(name)) {
			return dlv_addr3();
		}
		if ($dlv_addr4.equalsIgnoreCase(name)) {
			return dlv_addr4();
		}
		if ($dlv_tel.equalsIgnoreCase(name)) {
			return dlv_tel();
		}
		if ($dlv_fax.equalsIgnoreCase(name)) {
			return dlv_fax();
		}
		if ($dlv_cntry_cd.equalsIgnoreCase(name)) {
			return dlv_cntry_cd();
		}
		if ($dlv_cntry_nm.equalsIgnoreCase(name)) {
			return dlv_cntry_nm();
		}
		if ($dlv_lg_grp_cd.equalsIgnoreCase(name)) {
			return dlv_lg_grp_cd();
		}
		if ($dlv_lg_grp_nm.equalsIgnoreCase(name)) {
			return dlv_lg_grp_nm();
		}
		if ($pri_prnt_typ.equalsIgnoreCase(name)) {
			return pri_prnt_typ();
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
		if ($tdlv_cd.equalsIgnoreCase(name)) {
			return tdlv_cd();
		}
		if ($tdlv_nm.equalsIgnoreCase(name)) {
			return tdlv_nm();
		}
		if ($via_dlv_typ.equalsIgnoreCase(name)) {
			return via_dlv_typ();
		}
		if ($via_dlv_typ_nm.equalsIgnoreCase(name)) {
			return via_dlv_typ_nm();
		}
		if ($tdlv_cntct_dpt.equalsIgnoreCase(name)) {
			return tdlv_cntct_dpt();
		}
		if ($tdlv_cntct_psn.equalsIgnoreCase(name)) {
			return tdlv_cntct_psn();
		}
		if ($tdlv_zip_cd.equalsIgnoreCase(name)) {
			return tdlv_zip_cd();
		}
		if ($tdlv_addr1.equalsIgnoreCase(name)) {
			return tdlv_addr1();
		}
		if ($tdlv_addr2.equalsIgnoreCase(name)) {
			return tdlv_addr2();
		}
		if ($tdlv_addr3.equalsIgnoreCase(name)) {
			return tdlv_addr3();
		}
		if ($tdlv_addr4.equalsIgnoreCase(name)) {
			return tdlv_addr4();
		}
		if ($tdlv_tel.equalsIgnoreCase(name)) {
			return tdlv_tel();
		}
		if ($tdlv_fax.equalsIgnoreCase(name)) {
			return tdlv_fax();
		}
		if ($tdlv_cntry_cd.equalsIgnoreCase(name)) {
			return tdlv_cntry_cd();
		}
		if ($tdlv_cntry_nm.equalsIgnoreCase(name)) {
			return tdlv_cntry_nm();
		}
		if ($tdlv_lg_grp_cd.equalsIgnoreCase(name)) {
			return tdlv_lg_grp_cd();
		}
		if ($tdlv_lg_grp_nm.equalsIgnoreCase(name)) {
			return tdlv_lg_grp_nm();
		}
		if ($dlv_day_week_typ.equalsIgnoreCase(name)) {
			return dlv_day_week_typ();
		}
		if ($dlv_day_week_typ_nm.equalsIgnoreCase(name)) {
			return dlv_day_week_typ_nm();
		}
		if ($proc_typ.equalsIgnoreCase(name)) {
			return proc_typ();
		}
		if ($proc_typ_nm.equalsIgnoreCase(name)) {
			return proc_typ_nm();
		}
		if ($ship_inst_typ.equalsIgnoreCase(name)) {
			return ship_inst_typ();
		}
		if ($ship_inst_typ_nm.equalsIgnoreCase(name)) {
			return ship_inst_typ_nm();
		}
		if ($ship_schd_split_typ.equalsIgnoreCase(name)) {
			return ship_schd_split_typ();
		}
		if ($ship_schd_split_typ_nm.equalsIgnoreCase(name)) {
			return ship_schd_split_typ_nm();
		}
		if ($alloc_scope_typ.equalsIgnoreCase(name)) {
			return alloc_scope_typ();
		}
		if ($alloc_scope_typ_nm.equalsIgnoreCase(name)) {
			return alloc_scope_typ_nm();
		}
		if ($alloc_typ.equalsIgnoreCase(name)) {
			return alloc_typ();
		}
		if ($alloc_typ_nm.equalsIgnoreCase(name)) {
			return alloc_typ_nm();
		}
		if ($rqst_to_loc_cd.equalsIgnoreCase(name)) {
			return rqst_to_loc_cd();
		}
		if ($rqst_to_loc_nm.equalsIgnoreCase(name)) {
			return rqst_to_loc_nm();
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			return sppl_cd();
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			return sppl_nm();
		}
		if ($maker_cd.equalsIgnoreCase(name)) {
			return maker_cd();
		}
		if ($maker_nm.equalsIgnoreCase(name)) {
			return maker_nm();
		}
		if ($wg_rqst_cnt_rmrks.equalsIgnoreCase(name)) {
			return wg_rqst_cnt_rmrks();
		}
		if ($rqst_to_wg_cd.equalsIgnoreCase(name)) {
			return rqst_to_wg_cd();
		}
		if ($alloc_grp_cd.equalsIgnoreCase(name)) {
			return alloc_grp_cd();
		}
		if ($alloc_grp_nm.equalsIgnoreCase(name)) {
			return alloc_grp_nm();
		}
		if ($ship_lg_grp_cd.equalsIgnoreCase(name)) {
			return ship_lg_grp_cd();
		}
		if ($ship_lg_grp_nm.equalsIgnoreCase(name)) {
			return ship_lg_grp_nm();
		}
		if ($def_loc_cd.equalsIgnoreCase(name)) {
			return def_loc_cd();
		}
		if ($def_loc_nm.equalsIgnoreCase(name)) {
			return def_loc_nm();
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			return loc_cd();
		}
		if ($loc_nm.equalsIgnoreCase(name)) {
			return loc_nm();
		}
		if ($str_ln_cd.equalsIgnoreCase(name)) {
			return str_ln_cd();
		}
		if ($str_ln_nm.equalsIgnoreCase(name)) {
			return str_ln_nm();
		}
		if ($lot_no.equalsIgnoreCase(name)) {
			return lot_no();
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			return sublot_no();
		}
		if ($ver_no.equalsIgnoreCase(name)) {
			return ver_no();
		}
		if ($ship_term_cd.equalsIgnoreCase(name)) {
			return ship_term_cd();
		}
		if ($ship_term_nm.equalsIgnoreCase(name)) {
			return ship_term_nm();
		}
		if ($ship_cnt_rmrks.equalsIgnoreCase(name)) {
			return ship_cnt_rmrks();
		}
		if ($cst_po_d_no.equalsIgnoreCase(name)) {
			return cst_po_d_no();
		}
		if ($cst_po_d_rmrks.equalsIgnoreCase(name)) {
			return cst_po_d_rmrks();
		}
		if ($sls_rsn_cd.equalsIgnoreCase(name)) {
			return sls_rsn_cd();
		}
		if ($sls_rsn_nm.equalsIgnoreCase(name)) {
			return sls_rsn_nm();
		}
		if ($bd_dpt_cd.equalsIgnoreCase(name)) {
			return bd_dpt_cd();
		}
		if ($bd_dpt_nm.equalsIgnoreCase(name)) {
			return bd_dpt_nm();
		}
		if ($sls_upri_req_typ.equalsIgnoreCase(name)) {
			return sls_upri_req_typ();
		}
		if ($sls_upri_req_typ_nm.equalsIgnoreCase(name)) {
			return sls_upri_req_typ_nm();
		}
		if ($io_schd_pr_no.equalsIgnoreCase(name)) {
			return io_schd_pr_no();
		}
		if ($trd_d_rmrks.equalsIgnoreCase(name)) {
			return trd_d_rmrks();
		}
		if ($slo_d_intr_rmrks.equalsIgnoreCase(name)) {
			return slo_d_intr_rmrks();
		}
		if ($slo_d_sub_char1.equalsIgnoreCase(name)) {
			return slo_d_sub_char1();
		}
		if ($slo_d_sub_char2.equalsIgnoreCase(name)) {
			return slo_d_sub_char2();
		}
		if ($slo_d_sub_char3.equalsIgnoreCase(name)) {
			return slo_d_sub_char3();
		}
		if ($qtn_d_no.equalsIgnoreCase(name)) {
			return qtn_d_no();
		}
		if ($edi_sub_d_char1.equalsIgnoreCase(name)) {
			return edi_sub_d_char1();
		}
		if ($edi_sub_d_char2.equalsIgnoreCase(name)) {
			return edi_sub_d_char2();
		}
		if ($edi_sub_d_char3.equalsIgnoreCase(name)) {
			return edi_sub_d_char3();
		}
		if ($edi_sub_d_char4.equalsIgnoreCase(name)) {
			return edi_sub_d_char4();
		}
		if ($edi_sub_d_char5.equalsIgnoreCase(name)) {
			return edi_sub_d_char5();
		}
		if ($slo_d_can_rsn_cd.equalsIgnoreCase(name)) {
			return slo_d_can_rsn_cd();
		}
		if ($slo_d_can_rsn_nm.equalsIgnoreCase(name)) {
			return slo_d_can_rsn_nm();
		}
		if ($slo_d_can_rmkrs.equalsIgnoreCase(name)) {
			return slo_d_can_rmkrs();
		}
		if ($ship_pr_no.equalsIgnoreCase(name)) {
			return ship_pr_no();
		}
		if ($itm_ship_grp_cd.equalsIgnoreCase(name)) {
			return itm_ship_grp_cd();
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			return base_unit_nm();
		}
		if ($base_unit_rnd_typ.equalsIgnoreCase(name)) {
			return base_unit_rnd_typ();
		}
		if ($trd_unit_rnd_typ.equalsIgnoreCase(name)) {
			return trd_unit_rnd_typ();
		}
		if ($cst_ship_schd_split_typ.equalsIgnoreCase(name)) {
			return cst_ship_schd_split_typ();
		}
		if ($cst_sls_basis_typ.equalsIgnoreCase(name)) {
			return cst_sls_basis_typ();
		}
		if ($cst_sls_usr_cd.equalsIgnoreCase(name)) {
			return cst_sls_usr_cd();
		}
		if ($cst_sls_dpt_cd.equalsIgnoreCase(name)) {
			return cst_sls_dpt_cd();
		}
		if ($cst_ar_dpt_cd.equalsIgnoreCase(name)) {
			return cst_ar_dpt_cd();
		}
		if ($cst_sls_upri_req_typ.equalsIgnoreCase(name)) {
			return cst_sls_upri_req_typ();
		}
		if ($ar_dpt_typ.equalsIgnoreCase(name)) {
			return ar_dpt_typ();
		}
		if ($cst_trd_cur_cd.equalsIgnoreCase(name)) {
			return cst_trd_cur_cd();
		}
		if ($mst_dlv_nm.equalsIgnoreCase(name)) {
			return mst_dlv_nm();
		}
		if ($mst_dlv_cntct_dpt.equalsIgnoreCase(name)) {
			return mst_dlv_cntct_dpt();
		}
		if ($mst_dlv_cntct_psn.equalsIgnoreCase(name)) {
			return mst_dlv_cntct_psn();
		}
		if ($mst_dlv_zip_cd.equalsIgnoreCase(name)) {
			return mst_dlv_zip_cd();
		}
		if ($mst_dlv_addr1.equalsIgnoreCase(name)) {
			return mst_dlv_addr1();
		}
		if ($mst_dlv_addr2.equalsIgnoreCase(name)) {
			return mst_dlv_addr2();
		}
		if ($mst_dlv_addr3.equalsIgnoreCase(name)) {
			return mst_dlv_addr3();
		}
		if ($mst_dlv_addr4.equalsIgnoreCase(name)) {
			return mst_dlv_addr4();
		}
		if ($mst_dlv_tel.equalsIgnoreCase(name)) {
			return mst_dlv_tel();
		}
		if ($mst_dlv_fax.equalsIgnoreCase(name)) {
			return mst_dlv_fax();
		}
		if ($mst_dlv_lg_grp_cd.equalsIgnoreCase(name)) {
			return mst_dlv_lg_grp_cd();
		}
		if ($prnt_lcl_cd.equalsIgnoreCase(name)) {
			return prnt_lcl_cd();
		}
		if ($mst_tdlv_nm.equalsIgnoreCase(name)) {
			return mst_tdlv_nm();
		}
		if ($mst_tdlv_cntct_dpt.equalsIgnoreCase(name)) {
			return mst_tdlv_cntct_dpt();
		}
		if ($mst_tdlv_cntct_psn.equalsIgnoreCase(name)) {
			return mst_tdlv_cntct_psn();
		}
		if ($mst_tdlv_zip_cd.equalsIgnoreCase(name)) {
			return mst_tdlv_zip_cd();
		}
		if ($mst_tdlv_addr1.equalsIgnoreCase(name)) {
			return mst_tdlv_addr1();
		}
		if ($mst_tdlv_addr2.equalsIgnoreCase(name)) {
			return mst_tdlv_addr2();
		}
		if ($mst_tdlv_addr3.equalsIgnoreCase(name)) {
			return mst_tdlv_addr3();
		}
		if ($mst_tdlv_addr4.equalsIgnoreCase(name)) {
			return mst_tdlv_addr4();
		}
		if ($mst_tdlv_tel.equalsIgnoreCase(name)) {
			return mst_tdlv_tel();
		}
		if ($mst_tdlv_fax.equalsIgnoreCase(name)) {
			return mst_tdlv_fax();
		}
		if ($mst_tdlv_lg_grp_cd.equalsIgnoreCase(name)) {
			return mst_tdlv_lg_grp_cd();
		}
		if ($mst_via_dlv_typ.equalsIgnoreCase(name)) {
			return mst_via_dlv_typ();
		}
		if ($mid_loc_cd.equalsIgnoreCase(name)) {
			return mid_loc_cd();
		}
		if ($loc_wg_cd.equalsIgnoreCase(name)) {
			return loc_wg_cd();
		}
		if ($tax_typ.equalsIgnoreCase(name)) {
			return tax_typ();
		}
		if ($itm_cntry_org_cd.equalsIgnoreCase(name)) {
			return itm_cntry_org_cd();
		}
		if ($lot_mng_typ.equalsIgnoreCase(name)) {
			return lot_mng_typ();
		}
		if ($sublot_mng_typ.equalsIgnoreCase(name)) {
			return sublot_mng_typ();
		}
		if ($itm_trd_unit_cd.equalsIgnoreCase(name)) {
			return itm_trd_unit_cd();
		}
		if ($itm_proc_typ.equalsIgnoreCase(name)) {
			return itm_proc_typ();
		}
		if ($itm_ship_inst_typ.equalsIgnoreCase(name)) {
			return itm_ship_inst_typ();
		}
		if ($itm_ship_term_cd.equalsIgnoreCase(name)) {
			return itm_ship_term_cd();
		}
		if ($cred_cd.equalsIgnoreCase(name)) {
			return cred_cd();
		}
		if ($mst_cst_itm_nm.equalsIgnoreCase(name)) {
			return mst_cst_itm_nm();
		}
		if ($mst_itm_nm.equalsIgnoreCase(name)) {
			return mst_itm_nm();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($slo_rev.equalsIgnoreCase(name)) {
			return slo_rev();
		}
		if ($qtn_rev.equalsIgnoreCase(name)) {
			return qtn_rev();
		}
		if ($slo_d_rev.equalsIgnoreCase(name)) {
			return slo_d_rev();
		}
		if ($trd_cur_upri_dec_place.equalsIgnoreCase(name)) {
			return trd_cur_upri_dec_place();
		}
		if ($trd_cur_amt_dec_place.equalsIgnoreCase(name)) {
			return trd_cur_amt_dec_place();
		}
		if ($xrate.equalsIgnoreCase(name)) {
			return xrate();
		}
		if ($base_cur_upri.equalsIgnoreCase(name)) {
			return base_cur_upri();
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			return base_cur_amt();
		}
		if ($base_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			return base_cur_inc_tax_amt();
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			return base_cur_tax_amt();
		}
		if ($ptax_xrate.equalsIgnoreCase(name)) {
			return ptax_xrate();
		}
		if ($ptax_cur_upri.equalsIgnoreCase(name)) {
			return ptax_cur_upri();
		}
		if ($ptax_cur_amt.equalsIgnoreCase(name)) {
			return ptax_cur_amt();
		}
		if ($ptax_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			return ptax_cur_inc_tax_amt();
		}
		if ($ptax_cur_tax_amt.equalsIgnoreCase(name)) {
			return ptax_cur_tax_amt();
		}
		if ($prof_rate.equalsIgnoreCase(name)) {
			return prof_rate();
		}
		if ($adv_bill_amt.equalsIgnoreCase(name)) {
			return adv_bill_amt();
		}
		if ($adv_rcv_amt.equalsIgnoreCase(name)) {
			return adv_rcv_amt();
		}
		if ($cst_po_rev.equalsIgnoreCase(name)) {
			return cst_po_rev();
		}
		if ($slo_upd_cntr.equalsIgnoreCase(name)) {
			return slo_upd_cntr();
		}
		if ($qtn_upd_cntr.equalsIgnoreCase(name)) {
			return qtn_upd_cntr();
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			return amt_dec_place();
		}
		if ($edi_sub_num1.equalsIgnoreCase(name)) {
			return edi_sub_num1();
		}
		if ($hdr_grp_no.equalsIgnoreCase(name)) {
			return hdr_grp_no();
		}
		if ($alloc_margin_days.equalsIgnoreCase(name)) {
			return alloc_margin_days();
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			return trd_unit_qty();
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			return trd_unit_dec_place();
		}
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			return trd_unit_conv_base_qty();
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			return trd_unit_conv_qty();
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			return trd_cur_upri();
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			return trd_cur_amt();
		}
		if ($trd_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			return trd_cur_inc_tax_amt();
		}
		if ($cost_upri.equalsIgnoreCase(name)) {
			return cost_upri();
		}
		if ($cost_amt.equalsIgnoreCase(name)) {
			return cost_amt();
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			return trd_cur_dscnt_amt();
		}
		if ($iv_upri.equalsIgnoreCase(name)) {
			return iv_upri();
		}
		if ($iv_amt.equalsIgnoreCase(name)) {
			return iv_amt();
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			return tax_rate();
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			return trd_cur_tax_amt();
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			return wtax_rate();
		}
		if ($wtax_amt.equalsIgnoreCase(name)) {
			return wtax_amt();
		}
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			return bill_crryovr_times();
		}
		if ($set_itm_grp_no.equalsIgnoreCase(name)) {
			return set_itm_grp_no();
		}
		if ($edi_sub_d_num1.equalsIgnoreCase(name)) {
			return edi_sub_d_num1();
		}
		if ($ship_pr_upd_cntr.equalsIgnoreCase(name)) {
			return ship_pr_upd_cntr();
		}
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			return hdr_peg_no();
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			return base_unit_qty();
		}
		if ($ship_pr_base_unit_qty.equalsIgnoreCase(name)) {
			return ship_pr_base_unit_qty();
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			return base_unit_dec_place();
		}
		if ($prms_qty.equalsIgnoreCase(name)) {
			return prms_qty();
		}
		if ($dlv_inst_rcpt_qty.equalsIgnoreCase(name)) {
			return dlv_inst_rcpt_qty();
		}
		if ($dlv_inst_prms_qty.equalsIgnoreCase(name)) {
			return dlv_inst_prms_qty();
		}
		if ($alloc_qty.equalsIgnoreCase(name)) {
			return alloc_qty();
		}
		if ($wait_qty.equalsIgnoreCase(name)) {
			return wait_qty();
		}
		if ($ship_inst_qty.equalsIgnoreCase(name)) {
			return ship_inst_qty();
		}
		if ($ship_act_qty.equalsIgnoreCase(name)) {
			return ship_act_qty();
		}
		if ($iv_schd_qty.equalsIgnoreCase(name)) {
			return iv_schd_qty();
		}
		if ($iv_act_qty.equalsIgnoreCase(name)) {
			return iv_act_qty();
		}
		if ($sls_qty.equalsIgnoreCase(name)) {
			return sls_qty();
		}
		if ($ship_ret_qty.equalsIgnoreCase(name)) {
			return ship_ret_qty();
		}
		if ($re_ship_schd_qty.equalsIgnoreCase(name)) {
			return re_ship_schd_qty();
		}
		if ($ship_schd_abort_qty.equalsIgnoreCase(name)) {
			return ship_schd_abort_qty();
		}
		if ($sls_schd_abort_qty.equalsIgnoreCase(name)) {
			return sls_schd_abort_qty();
		}
		if ($not_dlv_qty.equalsIgnoreCase(name)) {
			return not_dlv_qty();
		}
		if ($overdue_prspct_qty.equalsIgnoreCase(name)) {
			return overdue_prspct_qty();
		}
		if ($ship_pr_rate.equalsIgnoreCase(name)) {
			return ship_pr_rate();
		}
		if ($sls_pr_rate.equalsIgnoreCase(name)) {
			return sls_pr_rate();
		}
		if ($act_dlv_lt.equalsIgnoreCase(name)) {
			return act_dlv_lt();
		}
		if ($dlv_qty.equalsIgnoreCase(name)) {
			return dlv_qty();
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			return disp_seq();
		}
		if ($cst_bill_crryovr_times.equalsIgnoreCase(name)) {
			return cst_bill_crryovr_times();
		}
		if ($cst_upri_dec_place.equalsIgnoreCase(name)) {
			return cst_upri_dec_place();
		}
		if ($cst_amt_dec_place.equalsIgnoreCase(name)) {
			return cst_amt_dec_place();
		}
		if ($upri_dec_place.equalsIgnoreCase(name)) {
			return upri_dec_place();
		}
		if ($mst_trd_cur_upri.equalsIgnoreCase(name)) {
			return mst_trd_cur_upri();
		}
		if ($itm_bill_crryovr_times.equalsIgnoreCase(name)) {
			return itm_bill_crryovr_times();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($slo_dt.equalsIgnoreCase(name)) {
			return slo_dt();
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
		if ($rcpt_dt.equalsIgnoreCase(name)) {
			return rcpt_dt();
		}
		if ($edi_sub_dt1.equalsIgnoreCase(name)) {
			return edi_sub_dt1();
		}
		if ($ship_rqst_tm.equalsIgnoreCase(name)) {
			return ship_rqst_tm();
		}
		if ($ship_rqst_dt.equalsIgnoreCase(name)) {
			return ship_rqst_dt();
		}
		if ($ship_rqst_hm.equalsIgnoreCase(name)) {
			return ship_rqst_hm();
		}
		if ($dlv_rqst_tm.equalsIgnoreCase(name)) {
			return dlv_rqst_tm();
		}
		if ($dlv_rqst_dt.equalsIgnoreCase(name)) {
			return dlv_rqst_dt();
		}
		if ($dlv_rqst_hm.equalsIgnoreCase(name)) {
			return dlv_rqst_hm();
		}
		if ($pd_inst_dlv_dt.equalsIgnoreCase(name)) {
			return pd_inst_dlv_dt();
		}
		if ($pd_inst_dlv_hm.equalsIgnoreCase(name)) {
			return pd_inst_dlv_hm();
		}
		if ($accpt_schd_dt.equalsIgnoreCase(name)) {
			return accpt_schd_dt();
		}
		if ($sls_schd_dt.equalsIgnoreCase(name)) {
			return sls_schd_dt();
		}
		if ($ship_schd_tm.equalsIgnoreCase(name)) {
			return ship_schd_tm();
		}
		if ($ship_schd_dt.equalsIgnoreCase(name)) {
			return ship_schd_dt();
		}
		if ($ship_schd_hm.equalsIgnoreCase(name)) {
			return ship_schd_hm();
		}
		if ($dlv_schd_tm.equalsIgnoreCase(name)) {
			return dlv_schd_tm();
		}
		if ($dlv_schd_dt.equalsIgnoreCase(name)) {
			return dlv_schd_dt();
		}
		if ($dlv_schd_hm.equalsIgnoreCase(name)) {
			return dlv_schd_hm();
		}
		if ($rqst_dt.equalsIgnoreCase(name)) {
			return rqst_dt();
		}
		if ($rqst_dlv_rqst_dt.equalsIgnoreCase(name)) {
			return rqst_dlv_rqst_dt();
		}
		if ($rqst_prms_dt.equalsIgnoreCase(name)) {
			return rqst_prms_dt();
		}
		if ($rqst_prms_dlv_dt.equalsIgnoreCase(name)) {
			return rqst_prms_dlv_dt();
		}
		if ($edi_sub_d_dt1.equalsIgnoreCase(name)) {
			return edi_sub_d_dt1();
		}
		if ($prms_dt.equalsIgnoreCase(name)) {
			return prms_dt();
		}
		if ($dlv_inst_rcpt_dt.equalsIgnoreCase(name)) {
			return dlv_inst_rcpt_dt();
		}
		if ($dlv_inst_prms_dt.equalsIgnoreCase(name)) {
			return dlv_inst_prms_dt();
		}
		if ($dlv_inst_dt.equalsIgnoreCase(name)) {
			return dlv_inst_dt();
		}
		if ($dlv_inst_hm.equalsIgnoreCase(name)) {
			return dlv_inst_hm();
		}
		if ($prms_dlv_dt.equalsIgnoreCase(name)) {
			return prms_dlv_dt();
		}
		if ($ship_dt.equalsIgnoreCase(name)) {
			return ship_dt();
		}
		if ($ship_hm.equalsIgnoreCase(name)) {
			return ship_hm();
		}
		if ($dlv_dt.equalsIgnoreCase(name)) {
			return dlv_dt();
		}
		if ($dlv_hm.equalsIgnoreCase(name)) {
			return dlv_hm();
		}
		if ($sls_dt.equalsIgnoreCase(name)) {
			return sls_dt();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		if ($qtn_aprv_flg.equalsIgnoreCase(name)) {
			return qtn_aprv_flg();
		}
		if ($can_upd_flg.equalsIgnoreCase(name)) {
			return can_upd_flg();
		}
		if ($can_del_flg.equalsIgnoreCase(name)) {
			return can_del_flg();
		}
		if ($cst_iv_flg.equalsIgnoreCase(name)) {
			return cst_iv_flg();
		}
		if ($xrate_inpt_flg.equalsIgnoreCase(name)) {
			return xrate_inpt_flg();
		}
		if ($ptax_xrate_inpt_flg.equalsIgnoreCase(name)) {
			return ptax_xrate_inpt_flg();
		}
		if ($iv_num_flg.equalsIgnoreCase(name)) {
			return iv_num_flg();
		}
		if ($edi_flg.equalsIgnoreCase(name)) {
			return edi_flg();
		}
		if ($is_src_batch_flg.equalsIgnoreCase(name)) {
			return is_src_batch_flg();
		}
		if ($aprv_flg.equalsIgnoreCase(name)) {
			return aprv_flg();
		}
		if ($aprv_back_flg.equalsIgnoreCase(name)) {
			return aprv_back_flg();
		}
		if ($can_flg.equalsIgnoreCase(name)) {
			return can_flg();
		}
		if ($hdr_err_flg.equalsIgnoreCase(name)) {
			return hdr_err_flg();
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			return abort_flg();
		}
		if ($vmi_flg.equalsIgnoreCase(name)) {
			return vmi_flg();
		}
		if ($dscnt_itm_flg.equalsIgnoreCase(name)) {
			return dscnt_itm_flg();
		}
		if ($sundry_itm_flg.equalsIgnoreCase(name)) {
			return sundry_itm_flg();
		}
		if ($upri_not_tgt_flg.equalsIgnoreCase(name)) {
			return upri_not_tgt_flg();
		}
		if ($interim_flg.equalsIgnoreCase(name)) {
			return interim_flg();
		}
		if ($tax_fix_flg.equalsIgnoreCase(name)) {
			return tax_fix_flg();
		}
		if ($inc_tax_flg.equalsIgnoreCase(name)) {
			return inc_tax_flg();
		}
		if ($sno_num_flg.equalsIgnoreCase(name)) {
			return sno_num_flg();
		}
		if ($sno1_null_flg.equalsIgnoreCase(name)) {
			return sno1_null_flg();
		}
		if ($sno2_null_flg.equalsIgnoreCase(name)) {
			return sno2_null_flg();
		}
		if ($sno3_null_flg.equalsIgnoreCase(name)) {
			return sno3_null_flg();
		}
		if ($sno4_null_flg.equalsIgnoreCase(name)) {
			return sno4_null_flg();
		}
		if ($slo_sno1_flg.equalsIgnoreCase(name)) {
			return slo_sno1_flg();
		}
		if ($slo_sno2_flg.equalsIgnoreCase(name)) {
			return slo_sno2_flg();
		}
		if ($slo_sno3_flg.equalsIgnoreCase(name)) {
			return slo_sno3_flg();
		}
		if ($slo_sno4_flg.equalsIgnoreCase(name)) {
			return slo_sno4_flg();
		}
		if ($ship_schd_split_flg.equalsIgnoreCase(name)) {
			return ship_schd_split_flg();
		}
		if ($ship_abl_flg.equalsIgnoreCase(name)) {
			return ship_abl_flg();
		}
		if ($dlv_sundry_flg.equalsIgnoreCase(name)) {
			return dlv_sundry_flg();
		}
		if ($pri_prnt_flg.equalsIgnoreCase(name)) {
			return pri_prnt_flg();
		}
		if ($tdlv_req_flg.equalsIgnoreCase(name)) {
			return tdlv_req_flg();
		}
		if ($tdlv_sundry_flg.equalsIgnoreCase(name)) {
			return tdlv_sundry_flg();
		}
		if ($sls_cststk_flg.equalsIgnoreCase(name)) {
			return sls_cststk_flg();
		}
		if ($not_lg_mix_flg.equalsIgnoreCase(name)) {
			return not_lg_mix_flg();
		}
		if ($str_ln_tgt_flg.equalsIgnoreCase(name)) {
			return str_ln_tgt_flg();
		}
		if ($str_ln_cd_none_flg.equalsIgnoreCase(name)) {
			return str_ln_cd_none_flg();
		}
		if ($not_lot_mix_flg.equalsIgnoreCase(name)) {
			return not_lot_mix_flg();
		}
		if ($not_sublot_mix_flg.equalsIgnoreCase(name)) {
			return not_sublot_mix_flg();
		}
		if ($ver_flg.equalsIgnoreCase(name)) {
			return ver_flg();
		}
		if ($ship_block_flg.equalsIgnoreCase(name)) {
			return ship_block_flg();
		}
		if ($sls_acxfr_flg.equalsIgnoreCase(name)) {
			return sls_acxfr_flg();
		}
		if ($not_dt_calc_flg.equalsIgnoreCase(name)) {
			return not_dt_calc_flg();
		}
		if ($slo_d_can_flg.equalsIgnoreCase(name)) {
			return slo_d_can_flg();
		}
		if ($dtl_err_flg.equalsIgnoreCase(name)) {
			return dtl_err_flg();
		}
		if ($upd_cntr_not_chk_flg.equalsIgnoreCase(name)) {
			return upd_cntr_not_chk_flg();
		}
		if ($ship_cmpl_flg.equalsIgnoreCase(name)) {
			return ship_cmpl_flg();
		}
		if ($sls_cmpl_flg.equalsIgnoreCase(name)) {
			return sls_cmpl_flg();
		}
		if ($pack_flg.equalsIgnoreCase(name)) {
			return pack_flg();
		}
		if ($fix_flg.equalsIgnoreCase(name)) {
			return fix_flg();
		}
		if ($re_ship_schd_flg.equalsIgnoreCase(name)) {
			return re_ship_schd_flg();
		}
		if ($dlv_rqst_dt_overdue_act_flg.equalsIgnoreCase(name)) {
			return dlv_rqst_dt_overdue_act_flg();
		}
		if ($prms_dlv_dt_overdue_act_flg.equalsIgnoreCase(name)) {
			return prms_dlv_dt_overdue_act_flg();
		}
		if ($bd_dpt_flg.equalsIgnoreCase(name)) {
			return bd_dpt_flg();
		}
		if ($cst_sls_upri_cng_flg.equalsIgnoreCase(name)) {
			return cst_sls_upri_cng_flg();
		}
		if ($mst_interim_flg.equalsIgnoreCase(name)) {
			return mst_interim_flg();
		}
		if ($itm_sls_upri_cng_flg.equalsIgnoreCase(name)) {
			return itm_sls_upri_cng_flg();
		}
		if ($slo_proc_flg.equalsIgnoreCase(name)) {
			return slo_proc_flg();
		}
		if ($qtn_no_copy_flg.equalsIgnoreCase(name)) {
			return qtn_no_copy_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		if ($rtn_sts_typ.equalsIgnoreCase(name)) {
			rtn_sts_typ(value);
			return;
		}
		if ($sls_sts_typ.equalsIgnoreCase(name)) {
			sls_sts_typ(value);
			return;
		}
		if ($sls_sts_typ_nm.equalsIgnoreCase(name)) {
			sls_sts_typ_nm(value);
			return;
		}
		if ($pr_sts_typ.equalsIgnoreCase(name)) {
			pr_sts_typ(value);
			return;
		}
		if ($pr_sts_typ_nm.equalsIgnoreCase(name)) {
			pr_sts_typ_nm(value);
			return;
		}
		if ($alloc_sts_typ.equalsIgnoreCase(name)) {
			alloc_sts_typ(value);
			return;
		}
		if ($alloc_sts_typ_nm.equalsIgnoreCase(name)) {
			alloc_sts_typ_nm(value);
			return;
		}
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
		if ($qtn_no.equalsIgnoreCase(name)) {
			qtn_no(value);
			return;
		}
		if ($qtn_aprv_no.equalsIgnoreCase(name)) {
			qtn_aprv_no(value);
			return;
		}
		if ($slo_d_no.equalsIgnoreCase(name)) {
			slo_d_no(value);
			return;
		}
		if ($sim_alloc_pln_typ.equalsIgnoreCase(name)) {
			sim_alloc_pln_typ(value);
			return;
		}
		if ($sim_alloc_pln_typ_nm.equalsIgnoreCase(name)) {
			sim_alloc_pln_typ_nm(value);
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
		if ($assort_typ.equalsIgnoreCase(name)) {
			assort_typ(value);
			return;
		}
		if ($assort_typ_nm.equalsIgnoreCase(name)) {
			assort_typ_nm(value);
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
		if ($ptax_cur_cd.equalsIgnoreCase(name)) {
			ptax_cur_cd(value);
			return;
		}
		if ($ptax_cur_nm.equalsIgnoreCase(name)) {
			ptax_cur_nm(value);
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
		if ($iv_no.equalsIgnoreCase(name)) {
			iv_no(value);
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
		if ($cst_po_no.equalsIgnoreCase(name)) {
			cst_po_no(value);
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
		if ($rcpt_usr_cd.equalsIgnoreCase(name)) {
			rcpt_usr_cd(value);
			return;
		}
		if ($rcpt_usr_nm.equalsIgnoreCase(name)) {
			rcpt_usr_nm(value);
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
		if ($cntry_cd.equalsIgnoreCase(name)) {
			cntry_cd(value);
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
		if ($cst_itm_cd.equalsIgnoreCase(name)) {
			cst_itm_cd(value);
			return;
		}
		if ($cst_itm_nm.equalsIgnoreCase(name)) {
			cst_itm_nm(value);
			return;
		}
		if ($itm_cd.equalsIgnoreCase(name)) {
			itm_cd(value);
			return;
		}
		if ($itm_sub1.equalsIgnoreCase(name)) {
			itm_sub1(value);
			return;
		}
		if ($itm_sub2.equalsIgnoreCase(name)) {
			itm_sub2(value);
			return;
		}
		if ($itm_sub3.equalsIgnoreCase(name)) {
			itm_sub3(value);
			return;
		}
		if ($itm_nm.equalsIgnoreCase(name)) {
			itm_nm(value);
			return;
		}
		if ($comp_spec_typ.equalsIgnoreCase(name)) {
			comp_spec_typ(value);
			return;
		}
		if ($comp_spec_typ_nm.equalsIgnoreCase(name)) {
			comp_spec_typ_nm(value);
			return;
		}
		if ($itm_comp_rev_no.equalsIgnoreCase(name)) {
			itm_comp_rev_no(value);
			return;
		}
		if ($iv_itm_nm.equalsIgnoreCase(name)) {
			iv_itm_nm(value);
			return;
		}
		if ($cntry_org_cd.equalsIgnoreCase(name)) {
			cntry_org_cd(value);
			return;
		}
		if ($cntry_org_nm.equalsIgnoreCase(name)) {
			cntry_org_nm(value);
			return;
		}
		if ($asset_mng_typ.equalsIgnoreCase(name)) {
			asset_mng_typ(value);
			return;
		}
		if ($asset_mng_typ_nm.equalsIgnoreCase(name)) {
			asset_mng_typ_nm(value);
			return;
		}
		if ($stk_mng_typ.equalsIgnoreCase(name)) {
			stk_mng_typ(value);
			return;
		}
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			trd_unit_cd(value);
			return;
		}
		if ($trd_unit_nm.equalsIgnoreCase(name)) {
			trd_unit_nm(value);
			return;
		}
		if ($dscnt_rsn_cd.equalsIgnoreCase(name)) {
			dscnt_rsn_cd(value);
			return;
		}
		if ($dscnt_rsn_nm.equalsIgnoreCase(name)) {
			dscnt_rsn_nm(value);
			return;
		}
		if ($tax_cd.equalsIgnoreCase(name)) {
			tax_cd(value);
			return;
		}
		if ($tax_nm.equalsIgnoreCase(name)) {
			tax_nm(value);
			return;
		}
		if ($gd_cd.equalsIgnoreCase(name)) {
			gd_cd(value);
			return;
		}
		if ($gd_nm.equalsIgnoreCase(name)) {
			gd_nm(value);
			return;
		}
		if ($sno1.equalsIgnoreCase(name)) {
			sno1(value);
			return;
		}
		if ($sno2.equalsIgnoreCase(name)) {
			sno2(value);
			return;
		}
		if ($sno3.equalsIgnoreCase(name)) {
			sno3(value);
			return;
		}
		if ($sno4.equalsIgnoreCase(name)) {
			sno4(value);
			return;
		}
		if ($sno1_mng_typ.equalsIgnoreCase(name)) {
			sno1_mng_typ(value);
			return;
		}
		if ($sno2_mng_typ.equalsIgnoreCase(name)) {
			sno2_mng_typ(value);
			return;
		}
		if ($sno3_mng_typ.equalsIgnoreCase(name)) {
			sno3_mng_typ(value);
			return;
		}
		if ($sno4_mng_typ.equalsIgnoreCase(name)) {
			sno4_mng_typ(value);
			return;
		}
		if ($sno1_num_typ.equalsIgnoreCase(name)) {
			sno1_num_typ(value);
			return;
		}
		if ($sno2_num_typ.equalsIgnoreCase(name)) {
			sno2_num_typ(value);
			return;
		}
		if ($sno3_num_typ.equalsIgnoreCase(name)) {
			sno3_num_typ(value);
			return;
		}
		if ($sno4_num_typ.equalsIgnoreCase(name)) {
			sno4_num_typ(value);
			return;
		}
		if ($sno1_ptn_cd.equalsIgnoreCase(name)) {
			sno1_ptn_cd(value);
			return;
		}
		if ($sno2_ptn_cd.equalsIgnoreCase(name)) {
			sno2_ptn_cd(value);
			return;
		}
		if ($sno3_ptn_cd.equalsIgnoreCase(name)) {
			sno3_ptn_cd(value);
			return;
		}
		if ($sno4_ptn_cd.equalsIgnoreCase(name)) {
			sno4_ptn_cd(value);
			return;
		}
		if ($dlv_cd.equalsIgnoreCase(name)) {
			dlv_cd(value);
			return;
		}
		if ($dlv_nm.equalsIgnoreCase(name)) {
			dlv_nm(value);
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
		if ($dlv_zip_cd.equalsIgnoreCase(name)) {
			dlv_zip_cd(value);
			return;
		}
		if ($dlv_addr1.equalsIgnoreCase(name)) {
			dlv_addr1(value);
			return;
		}
		if ($dlv_addr2.equalsIgnoreCase(name)) {
			dlv_addr2(value);
			return;
		}
		if ($dlv_addr3.equalsIgnoreCase(name)) {
			dlv_addr3(value);
			return;
		}
		if ($dlv_addr4.equalsIgnoreCase(name)) {
			dlv_addr4(value);
			return;
		}
		if ($dlv_tel.equalsIgnoreCase(name)) {
			dlv_tel(value);
			return;
		}
		if ($dlv_fax.equalsIgnoreCase(name)) {
			dlv_fax(value);
			return;
		}
		if ($dlv_cntry_cd.equalsIgnoreCase(name)) {
			dlv_cntry_cd(value);
			return;
		}
		if ($dlv_cntry_nm.equalsIgnoreCase(name)) {
			dlv_cntry_nm(value);
			return;
		}
		if ($dlv_lg_grp_cd.equalsIgnoreCase(name)) {
			dlv_lg_grp_cd(value);
			return;
		}
		if ($dlv_lg_grp_nm.equalsIgnoreCase(name)) {
			dlv_lg_grp_nm(value);
			return;
		}
		if ($pri_prnt_typ.equalsIgnoreCase(name)) {
			pri_prnt_typ(value);
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
		if ($tdlv_cd.equalsIgnoreCase(name)) {
			tdlv_cd(value);
			return;
		}
		if ($tdlv_nm.equalsIgnoreCase(name)) {
			tdlv_nm(value);
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
		if ($tdlv_cntct_dpt.equalsIgnoreCase(name)) {
			tdlv_cntct_dpt(value);
			return;
		}
		if ($tdlv_cntct_psn.equalsIgnoreCase(name)) {
			tdlv_cntct_psn(value);
			return;
		}
		if ($tdlv_zip_cd.equalsIgnoreCase(name)) {
			tdlv_zip_cd(value);
			return;
		}
		if ($tdlv_addr1.equalsIgnoreCase(name)) {
			tdlv_addr1(value);
			return;
		}
		if ($tdlv_addr2.equalsIgnoreCase(name)) {
			tdlv_addr2(value);
			return;
		}
		if ($tdlv_addr3.equalsIgnoreCase(name)) {
			tdlv_addr3(value);
			return;
		}
		if ($tdlv_addr4.equalsIgnoreCase(name)) {
			tdlv_addr4(value);
			return;
		}
		if ($tdlv_tel.equalsIgnoreCase(name)) {
			tdlv_tel(value);
			return;
		}
		if ($tdlv_fax.equalsIgnoreCase(name)) {
			tdlv_fax(value);
			return;
		}
		if ($tdlv_cntry_cd.equalsIgnoreCase(name)) {
			tdlv_cntry_cd(value);
			return;
		}
		if ($tdlv_cntry_nm.equalsIgnoreCase(name)) {
			tdlv_cntry_nm(value);
			return;
		}
		if ($tdlv_lg_grp_cd.equalsIgnoreCase(name)) {
			tdlv_lg_grp_cd(value);
			return;
		}
		if ($tdlv_lg_grp_nm.equalsIgnoreCase(name)) {
			tdlv_lg_grp_nm(value);
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
		if ($proc_typ.equalsIgnoreCase(name)) {
			proc_typ(value);
			return;
		}
		if ($proc_typ_nm.equalsIgnoreCase(name)) {
			proc_typ_nm(value);
			return;
		}
		if ($ship_inst_typ.equalsIgnoreCase(name)) {
			ship_inst_typ(value);
			return;
		}
		if ($ship_inst_typ_nm.equalsIgnoreCase(name)) {
			ship_inst_typ_nm(value);
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
		if ($alloc_scope_typ.equalsIgnoreCase(name)) {
			alloc_scope_typ(value);
			return;
		}
		if ($alloc_scope_typ_nm.equalsIgnoreCase(name)) {
			alloc_scope_typ_nm(value);
			return;
		}
		if ($alloc_typ.equalsIgnoreCase(name)) {
			alloc_typ(value);
			return;
		}
		if ($alloc_typ_nm.equalsIgnoreCase(name)) {
			alloc_typ_nm(value);
			return;
		}
		if ($rqst_to_loc_cd.equalsIgnoreCase(name)) {
			rqst_to_loc_cd(value);
			return;
		}
		if ($rqst_to_loc_nm.equalsIgnoreCase(name)) {
			rqst_to_loc_nm(value);
			return;
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			sppl_cd(value);
			return;
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			sppl_nm(value);
			return;
		}
		if ($maker_cd.equalsIgnoreCase(name)) {
			maker_cd(value);
			return;
		}
		if ($maker_nm.equalsIgnoreCase(name)) {
			maker_nm(value);
			return;
		}
		if ($wg_rqst_cnt_rmrks.equalsIgnoreCase(name)) {
			wg_rqst_cnt_rmrks(value);
			return;
		}
		if ($rqst_to_wg_cd.equalsIgnoreCase(name)) {
			rqst_to_wg_cd(value);
			return;
		}
		if ($alloc_grp_cd.equalsIgnoreCase(name)) {
			alloc_grp_cd(value);
			return;
		}
		if ($alloc_grp_nm.equalsIgnoreCase(name)) {
			alloc_grp_nm(value);
			return;
		}
		if ($ship_lg_grp_cd.equalsIgnoreCase(name)) {
			ship_lg_grp_cd(value);
			return;
		}
		if ($ship_lg_grp_nm.equalsIgnoreCase(name)) {
			ship_lg_grp_nm(value);
			return;
		}
		if ($def_loc_cd.equalsIgnoreCase(name)) {
			def_loc_cd(value);
			return;
		}
		if ($def_loc_nm.equalsIgnoreCase(name)) {
			def_loc_nm(value);
			return;
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			loc_cd(value);
			return;
		}
		if ($loc_nm.equalsIgnoreCase(name)) {
			loc_nm(value);
			return;
		}
		if ($str_ln_cd.equalsIgnoreCase(name)) {
			str_ln_cd(value);
			return;
		}
		if ($str_ln_nm.equalsIgnoreCase(name)) {
			str_ln_nm(value);
			return;
		}
		if ($lot_no.equalsIgnoreCase(name)) {
			lot_no(value);
			return;
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			sublot_no(value);
			return;
		}
		if ($ver_no.equalsIgnoreCase(name)) {
			ver_no(value);
			return;
		}
		if ($ship_term_cd.equalsIgnoreCase(name)) {
			ship_term_cd(value);
			return;
		}
		if ($ship_term_nm.equalsIgnoreCase(name)) {
			ship_term_nm(value);
			return;
		}
		if ($ship_cnt_rmrks.equalsIgnoreCase(name)) {
			ship_cnt_rmrks(value);
			return;
		}
		if ($cst_po_d_no.equalsIgnoreCase(name)) {
			cst_po_d_no(value);
			return;
		}
		if ($cst_po_d_rmrks.equalsIgnoreCase(name)) {
			cst_po_d_rmrks(value);
			return;
		}
		if ($sls_rsn_cd.equalsIgnoreCase(name)) {
			sls_rsn_cd(value);
			return;
		}
		if ($sls_rsn_nm.equalsIgnoreCase(name)) {
			sls_rsn_nm(value);
			return;
		}
		if ($bd_dpt_cd.equalsIgnoreCase(name)) {
			bd_dpt_cd(value);
			return;
		}
		if ($bd_dpt_nm.equalsIgnoreCase(name)) {
			bd_dpt_nm(value);
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
		if ($io_schd_pr_no.equalsIgnoreCase(name)) {
			io_schd_pr_no(value);
			return;
		}
		if ($trd_d_rmrks.equalsIgnoreCase(name)) {
			trd_d_rmrks(value);
			return;
		}
		if ($slo_d_intr_rmrks.equalsIgnoreCase(name)) {
			slo_d_intr_rmrks(value);
			return;
		}
		if ($slo_d_sub_char1.equalsIgnoreCase(name)) {
			slo_d_sub_char1(value);
			return;
		}
		if ($slo_d_sub_char2.equalsIgnoreCase(name)) {
			slo_d_sub_char2(value);
			return;
		}
		if ($slo_d_sub_char3.equalsIgnoreCase(name)) {
			slo_d_sub_char3(value);
			return;
		}
		if ($qtn_d_no.equalsIgnoreCase(name)) {
			qtn_d_no(value);
			return;
		}
		if ($edi_sub_d_char1.equalsIgnoreCase(name)) {
			edi_sub_d_char1(value);
			return;
		}
		if ($edi_sub_d_char2.equalsIgnoreCase(name)) {
			edi_sub_d_char2(value);
			return;
		}
		if ($edi_sub_d_char3.equalsIgnoreCase(name)) {
			edi_sub_d_char3(value);
			return;
		}
		if ($edi_sub_d_char4.equalsIgnoreCase(name)) {
			edi_sub_d_char4(value);
			return;
		}
		if ($edi_sub_d_char5.equalsIgnoreCase(name)) {
			edi_sub_d_char5(value);
			return;
		}
		if ($slo_d_can_rsn_cd.equalsIgnoreCase(name)) {
			slo_d_can_rsn_cd(value);
			return;
		}
		if ($slo_d_can_rsn_nm.equalsIgnoreCase(name)) {
			slo_d_can_rsn_nm(value);
			return;
		}
		if ($slo_d_can_rmkrs.equalsIgnoreCase(name)) {
			slo_d_can_rmkrs(value);
			return;
		}
		if ($ship_pr_no.equalsIgnoreCase(name)) {
			ship_pr_no(value);
			return;
		}
		if ($itm_ship_grp_cd.equalsIgnoreCase(name)) {
			itm_ship_grp_cd(value);
			return;
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			base_unit_cd(value);
			return;
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			base_unit_nm(value);
			return;
		}
		if ($base_unit_rnd_typ.equalsIgnoreCase(name)) {
			base_unit_rnd_typ(value);
			return;
		}
		if ($trd_unit_rnd_typ.equalsIgnoreCase(name)) {
			trd_unit_rnd_typ(value);
			return;
		}
		if ($cst_ship_schd_split_typ.equalsIgnoreCase(name)) {
			cst_ship_schd_split_typ(value);
			return;
		}
		if ($cst_sls_basis_typ.equalsIgnoreCase(name)) {
			cst_sls_basis_typ(value);
			return;
		}
		if ($cst_sls_usr_cd.equalsIgnoreCase(name)) {
			cst_sls_usr_cd(value);
			return;
		}
		if ($cst_sls_dpt_cd.equalsIgnoreCase(name)) {
			cst_sls_dpt_cd(value);
			return;
		}
		if ($cst_ar_dpt_cd.equalsIgnoreCase(name)) {
			cst_ar_dpt_cd(value);
			return;
		}
		if ($cst_sls_upri_req_typ.equalsIgnoreCase(name)) {
			cst_sls_upri_req_typ(value);
			return;
		}
		if ($ar_dpt_typ.equalsIgnoreCase(name)) {
			ar_dpt_typ(value);
			return;
		}
		if ($cst_trd_cur_cd.equalsIgnoreCase(name)) {
			cst_trd_cur_cd(value);
			return;
		}
		if ($mst_dlv_nm.equalsIgnoreCase(name)) {
			mst_dlv_nm(value);
			return;
		}
		if ($mst_dlv_cntct_dpt.equalsIgnoreCase(name)) {
			mst_dlv_cntct_dpt(value);
			return;
		}
		if ($mst_dlv_cntct_psn.equalsIgnoreCase(name)) {
			mst_dlv_cntct_psn(value);
			return;
		}
		if ($mst_dlv_zip_cd.equalsIgnoreCase(name)) {
			mst_dlv_zip_cd(value);
			return;
		}
		if ($mst_dlv_addr1.equalsIgnoreCase(name)) {
			mst_dlv_addr1(value);
			return;
		}
		if ($mst_dlv_addr2.equalsIgnoreCase(name)) {
			mst_dlv_addr2(value);
			return;
		}
		if ($mst_dlv_addr3.equalsIgnoreCase(name)) {
			mst_dlv_addr3(value);
			return;
		}
		if ($mst_dlv_addr4.equalsIgnoreCase(name)) {
			mst_dlv_addr4(value);
			return;
		}
		if ($mst_dlv_tel.equalsIgnoreCase(name)) {
			mst_dlv_tel(value);
			return;
		}
		if ($mst_dlv_fax.equalsIgnoreCase(name)) {
			mst_dlv_fax(value);
			return;
		}
		if ($mst_dlv_lg_grp_cd.equalsIgnoreCase(name)) {
			mst_dlv_lg_grp_cd(value);
			return;
		}
		if ($prnt_lcl_cd.equalsIgnoreCase(name)) {
			prnt_lcl_cd(value);
			return;
		}
		if ($mst_tdlv_nm.equalsIgnoreCase(name)) {
			mst_tdlv_nm(value);
			return;
		}
		if ($mst_tdlv_cntct_dpt.equalsIgnoreCase(name)) {
			mst_tdlv_cntct_dpt(value);
			return;
		}
		if ($mst_tdlv_cntct_psn.equalsIgnoreCase(name)) {
			mst_tdlv_cntct_psn(value);
			return;
		}
		if ($mst_tdlv_zip_cd.equalsIgnoreCase(name)) {
			mst_tdlv_zip_cd(value);
			return;
		}
		if ($mst_tdlv_addr1.equalsIgnoreCase(name)) {
			mst_tdlv_addr1(value);
			return;
		}
		if ($mst_tdlv_addr2.equalsIgnoreCase(name)) {
			mst_tdlv_addr2(value);
			return;
		}
		if ($mst_tdlv_addr3.equalsIgnoreCase(name)) {
			mst_tdlv_addr3(value);
			return;
		}
		if ($mst_tdlv_addr4.equalsIgnoreCase(name)) {
			mst_tdlv_addr4(value);
			return;
		}
		if ($mst_tdlv_tel.equalsIgnoreCase(name)) {
			mst_tdlv_tel(value);
			return;
		}
		if ($mst_tdlv_fax.equalsIgnoreCase(name)) {
			mst_tdlv_fax(value);
			return;
		}
		if ($mst_tdlv_lg_grp_cd.equalsIgnoreCase(name)) {
			mst_tdlv_lg_grp_cd(value);
			return;
		}
		if ($mst_via_dlv_typ.equalsIgnoreCase(name)) {
			mst_via_dlv_typ(value);
			return;
		}
		if ($mid_loc_cd.equalsIgnoreCase(name)) {
			mid_loc_cd(value);
			return;
		}
		if ($loc_wg_cd.equalsIgnoreCase(name)) {
			loc_wg_cd(value);
			return;
		}
		if ($tax_typ.equalsIgnoreCase(name)) {
			tax_typ(value);
			return;
		}
		if ($itm_cntry_org_cd.equalsIgnoreCase(name)) {
			itm_cntry_org_cd(value);
			return;
		}
		if ($lot_mng_typ.equalsIgnoreCase(name)) {
			lot_mng_typ(value);
			return;
		}
		if ($sublot_mng_typ.equalsIgnoreCase(name)) {
			sublot_mng_typ(value);
			return;
		}
		if ($itm_trd_unit_cd.equalsIgnoreCase(name)) {
			itm_trd_unit_cd(value);
			return;
		}
		if ($itm_proc_typ.equalsIgnoreCase(name)) {
			itm_proc_typ(value);
			return;
		}
		if ($itm_ship_inst_typ.equalsIgnoreCase(name)) {
			itm_ship_inst_typ(value);
			return;
		}
		if ($itm_ship_term_cd.equalsIgnoreCase(name)) {
			itm_ship_term_cd(value);
			return;
		}
		if ($cred_cd.equalsIgnoreCase(name)) {
			cred_cd(value);
			return;
		}
		if ($mst_cst_itm_nm.equalsIgnoreCase(name)) {
			mst_cst_itm_nm(value);
			return;
		}
		if ($mst_itm_nm.equalsIgnoreCase(name)) {
			mst_itm_nm(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($slo_rev.equalsIgnoreCase(name)) {
			slo_rev(value);
			return;
		}
		if ($qtn_rev.equalsIgnoreCase(name)) {
			qtn_rev(value);
			return;
		}
		if ($slo_d_rev.equalsIgnoreCase(name)) {
			slo_d_rev(value);
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
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($base_cur_upri.equalsIgnoreCase(name)) {
			base_cur_upri(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			base_cur_inc_tax_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($ptax_xrate.equalsIgnoreCase(name)) {
			ptax_xrate(value);
			return;
		}
		if ($ptax_cur_upri.equalsIgnoreCase(name)) {
			ptax_cur_upri(value);
			return;
		}
		if ($ptax_cur_amt.equalsIgnoreCase(name)) {
			ptax_cur_amt(value);
			return;
		}
		if ($ptax_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			ptax_cur_inc_tax_amt(value);
			return;
		}
		if ($ptax_cur_tax_amt.equalsIgnoreCase(name)) {
			ptax_cur_tax_amt(value);
			return;
		}
		if ($prof_rate.equalsIgnoreCase(name)) {
			prof_rate(value);
			return;
		}
		if ($adv_bill_amt.equalsIgnoreCase(name)) {
			adv_bill_amt(value);
			return;
		}
		if ($adv_rcv_amt.equalsIgnoreCase(name)) {
			adv_rcv_amt(value);
			return;
		}
		if ($cst_po_rev.equalsIgnoreCase(name)) {
			cst_po_rev(value);
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
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($edi_sub_num1.equalsIgnoreCase(name)) {
			edi_sub_num1(value);
			return;
		}
		if ($hdr_grp_no.equalsIgnoreCase(name)) {
			hdr_grp_no(value);
			return;
		}
		if ($alloc_margin_days.equalsIgnoreCase(name)) {
			alloc_margin_days(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_base_qty(value);
			return;
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_qty(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
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
		if ($cost_upri.equalsIgnoreCase(name)) {
			cost_upri(value);
			return;
		}
		if ($cost_amt.equalsIgnoreCase(name)) {
			cost_amt(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
			return;
		}
		if ($iv_upri.equalsIgnoreCase(name)) {
			iv_upri(value);
			return;
		}
		if ($iv_amt.equalsIgnoreCase(name)) {
			iv_amt(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($wtax_amt.equalsIgnoreCase(name)) {
			wtax_amt(value);
			return;
		}
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			bill_crryovr_times(value);
			return;
		}
		if ($set_itm_grp_no.equalsIgnoreCase(name)) {
			set_itm_grp_no(value);
			return;
		}
		if ($edi_sub_d_num1.equalsIgnoreCase(name)) {
			edi_sub_d_num1(value);
			return;
		}
		if ($ship_pr_upd_cntr.equalsIgnoreCase(name)) {
			ship_pr_upd_cntr(value);
			return;
		}
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($ship_pr_base_unit_qty.equalsIgnoreCase(name)) {
			ship_pr_base_unit_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($prms_qty.equalsIgnoreCase(name)) {
			prms_qty(value);
			return;
		}
		if ($dlv_inst_rcpt_qty.equalsIgnoreCase(name)) {
			dlv_inst_rcpt_qty(value);
			return;
		}
		if ($dlv_inst_prms_qty.equalsIgnoreCase(name)) {
			dlv_inst_prms_qty(value);
			return;
		}
		if ($alloc_qty.equalsIgnoreCase(name)) {
			alloc_qty(value);
			return;
		}
		if ($wait_qty.equalsIgnoreCase(name)) {
			wait_qty(value);
			return;
		}
		if ($ship_inst_qty.equalsIgnoreCase(name)) {
			ship_inst_qty(value);
			return;
		}
		if ($ship_act_qty.equalsIgnoreCase(name)) {
			ship_act_qty(value);
			return;
		}
		if ($iv_schd_qty.equalsIgnoreCase(name)) {
			iv_schd_qty(value);
			return;
		}
		if ($iv_act_qty.equalsIgnoreCase(name)) {
			iv_act_qty(value);
			return;
		}
		if ($sls_qty.equalsIgnoreCase(name)) {
			sls_qty(value);
			return;
		}
		if ($ship_ret_qty.equalsIgnoreCase(name)) {
			ship_ret_qty(value);
			return;
		}
		if ($re_ship_schd_qty.equalsIgnoreCase(name)) {
			re_ship_schd_qty(value);
			return;
		}
		if ($ship_schd_abort_qty.equalsIgnoreCase(name)) {
			ship_schd_abort_qty(value);
			return;
		}
		if ($sls_schd_abort_qty.equalsIgnoreCase(name)) {
			sls_schd_abort_qty(value);
			return;
		}
		if ($not_dlv_qty.equalsIgnoreCase(name)) {
			not_dlv_qty(value);
			return;
		}
		if ($overdue_prspct_qty.equalsIgnoreCase(name)) {
			overdue_prspct_qty(value);
			return;
		}
		if ($ship_pr_rate.equalsIgnoreCase(name)) {
			ship_pr_rate(value);
			return;
		}
		if ($sls_pr_rate.equalsIgnoreCase(name)) {
			sls_pr_rate(value);
			return;
		}
		if ($act_dlv_lt.equalsIgnoreCase(name)) {
			act_dlv_lt(value);
			return;
		}
		if ($dlv_qty.equalsIgnoreCase(name)) {
			dlv_qty(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($cst_bill_crryovr_times.equalsIgnoreCase(name)) {
			cst_bill_crryovr_times(value);
			return;
		}
		if ($cst_upri_dec_place.equalsIgnoreCase(name)) {
			cst_upri_dec_place(value);
			return;
		}
		if ($cst_amt_dec_place.equalsIgnoreCase(name)) {
			cst_amt_dec_place(value);
			return;
		}
		if ($upri_dec_place.equalsIgnoreCase(name)) {
			upri_dec_place(value);
			return;
		}
		if ($mst_trd_cur_upri.equalsIgnoreCase(name)) {
			mst_trd_cur_upri(value);
			return;
		}
		if ($itm_bill_crryovr_times.equalsIgnoreCase(name)) {
			itm_bill_crryovr_times(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($slo_rev.equalsIgnoreCase(name)) {
			slo_rev(value);
			return;
		}
		if ($qtn_rev.equalsIgnoreCase(name)) {
			qtn_rev(value);
			return;
		}
		if ($slo_d_rev.equalsIgnoreCase(name)) {
			slo_d_rev(value);
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
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($base_cur_upri.equalsIgnoreCase(name)) {
			base_cur_upri(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			base_cur_inc_tax_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($ptax_xrate.equalsIgnoreCase(name)) {
			ptax_xrate(value);
			return;
		}
		if ($ptax_cur_upri.equalsIgnoreCase(name)) {
			ptax_cur_upri(value);
			return;
		}
		if ($ptax_cur_amt.equalsIgnoreCase(name)) {
			ptax_cur_amt(value);
			return;
		}
		if ($ptax_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			ptax_cur_inc_tax_amt(value);
			return;
		}
		if ($ptax_cur_tax_amt.equalsIgnoreCase(name)) {
			ptax_cur_tax_amt(value);
			return;
		}
		if ($prof_rate.equalsIgnoreCase(name)) {
			prof_rate(value);
			return;
		}
		if ($adv_bill_amt.equalsIgnoreCase(name)) {
			adv_bill_amt(value);
			return;
		}
		if ($adv_rcv_amt.equalsIgnoreCase(name)) {
			adv_rcv_amt(value);
			return;
		}
		if ($cst_po_rev.equalsIgnoreCase(name)) {
			cst_po_rev(value);
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
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($edi_sub_num1.equalsIgnoreCase(name)) {
			edi_sub_num1(value);
			return;
		}
		if ($hdr_grp_no.equalsIgnoreCase(name)) {
			hdr_grp_no(value);
			return;
		}
		if ($alloc_margin_days.equalsIgnoreCase(name)) {
			alloc_margin_days(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_base_qty(value);
			return;
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_qty(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
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
		if ($cost_upri.equalsIgnoreCase(name)) {
			cost_upri(value);
			return;
		}
		if ($cost_amt.equalsIgnoreCase(name)) {
			cost_amt(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
			return;
		}
		if ($iv_upri.equalsIgnoreCase(name)) {
			iv_upri(value);
			return;
		}
		if ($iv_amt.equalsIgnoreCase(name)) {
			iv_amt(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($wtax_amt.equalsIgnoreCase(name)) {
			wtax_amt(value);
			return;
		}
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			bill_crryovr_times(value);
			return;
		}
		if ($set_itm_grp_no.equalsIgnoreCase(name)) {
			set_itm_grp_no(value);
			return;
		}
		if ($edi_sub_d_num1.equalsIgnoreCase(name)) {
			edi_sub_d_num1(value);
			return;
		}
		if ($ship_pr_upd_cntr.equalsIgnoreCase(name)) {
			ship_pr_upd_cntr(value);
			return;
		}
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($ship_pr_base_unit_qty.equalsIgnoreCase(name)) {
			ship_pr_base_unit_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($prms_qty.equalsIgnoreCase(name)) {
			prms_qty(value);
			return;
		}
		if ($dlv_inst_rcpt_qty.equalsIgnoreCase(name)) {
			dlv_inst_rcpt_qty(value);
			return;
		}
		if ($dlv_inst_prms_qty.equalsIgnoreCase(name)) {
			dlv_inst_prms_qty(value);
			return;
		}
		if ($alloc_qty.equalsIgnoreCase(name)) {
			alloc_qty(value);
			return;
		}
		if ($wait_qty.equalsIgnoreCase(name)) {
			wait_qty(value);
			return;
		}
		if ($ship_inst_qty.equalsIgnoreCase(name)) {
			ship_inst_qty(value);
			return;
		}
		if ($ship_act_qty.equalsIgnoreCase(name)) {
			ship_act_qty(value);
			return;
		}
		if ($iv_schd_qty.equalsIgnoreCase(name)) {
			iv_schd_qty(value);
			return;
		}
		if ($iv_act_qty.equalsIgnoreCase(name)) {
			iv_act_qty(value);
			return;
		}
		if ($sls_qty.equalsIgnoreCase(name)) {
			sls_qty(value);
			return;
		}
		if ($ship_ret_qty.equalsIgnoreCase(name)) {
			ship_ret_qty(value);
			return;
		}
		if ($re_ship_schd_qty.equalsIgnoreCase(name)) {
			re_ship_schd_qty(value);
			return;
		}
		if ($ship_schd_abort_qty.equalsIgnoreCase(name)) {
			ship_schd_abort_qty(value);
			return;
		}
		if ($sls_schd_abort_qty.equalsIgnoreCase(name)) {
			sls_schd_abort_qty(value);
			return;
		}
		if ($not_dlv_qty.equalsIgnoreCase(name)) {
			not_dlv_qty(value);
			return;
		}
		if ($overdue_prspct_qty.equalsIgnoreCase(name)) {
			overdue_prspct_qty(value);
			return;
		}
		if ($ship_pr_rate.equalsIgnoreCase(name)) {
			ship_pr_rate(value);
			return;
		}
		if ($sls_pr_rate.equalsIgnoreCase(name)) {
			sls_pr_rate(value);
			return;
		}
		if ($act_dlv_lt.equalsIgnoreCase(name)) {
			act_dlv_lt(value);
			return;
		}
		if ($dlv_qty.equalsIgnoreCase(name)) {
			dlv_qty(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($cst_bill_crryovr_times.equalsIgnoreCase(name)) {
			cst_bill_crryovr_times(value);
			return;
		}
		if ($cst_upri_dec_place.equalsIgnoreCase(name)) {
			cst_upri_dec_place(value);
			return;
		}
		if ($cst_amt_dec_place.equalsIgnoreCase(name)) {
			cst_amt_dec_place(value);
			return;
		}
		if ($upri_dec_place.equalsIgnoreCase(name)) {
			upri_dec_place(value);
			return;
		}
		if ($mst_trd_cur_upri.equalsIgnoreCase(name)) {
			mst_trd_cur_upri(value);
			return;
		}
		if ($itm_bill_crryovr_times.equalsIgnoreCase(name)) {
			itm_bill_crryovr_times(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($slo_rev.equalsIgnoreCase(name)) {
			slo_rev(value);
			return;
		}
		if ($qtn_rev.equalsIgnoreCase(name)) {
			qtn_rev(value);
			return;
		}
		if ($slo_d_rev.equalsIgnoreCase(name)) {
			slo_d_rev(value);
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
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($base_cur_upri.equalsIgnoreCase(name)) {
			base_cur_upri(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			base_cur_inc_tax_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($ptax_xrate.equalsIgnoreCase(name)) {
			ptax_xrate(value);
			return;
		}
		if ($ptax_cur_upri.equalsIgnoreCase(name)) {
			ptax_cur_upri(value);
			return;
		}
		if ($ptax_cur_amt.equalsIgnoreCase(name)) {
			ptax_cur_amt(value);
			return;
		}
		if ($ptax_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			ptax_cur_inc_tax_amt(value);
			return;
		}
		if ($ptax_cur_tax_amt.equalsIgnoreCase(name)) {
			ptax_cur_tax_amt(value);
			return;
		}
		if ($prof_rate.equalsIgnoreCase(name)) {
			prof_rate(value);
			return;
		}
		if ($adv_bill_amt.equalsIgnoreCase(name)) {
			adv_bill_amt(value);
			return;
		}
		if ($adv_rcv_amt.equalsIgnoreCase(name)) {
			adv_rcv_amt(value);
			return;
		}
		if ($cst_po_rev.equalsIgnoreCase(name)) {
			cst_po_rev(value);
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
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($edi_sub_num1.equalsIgnoreCase(name)) {
			edi_sub_num1(value);
			return;
		}
		if ($hdr_grp_no.equalsIgnoreCase(name)) {
			hdr_grp_no(value);
			return;
		}
		if ($alloc_margin_days.equalsIgnoreCase(name)) {
			alloc_margin_days(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_base_qty(value);
			return;
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_qty(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
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
		if ($cost_upri.equalsIgnoreCase(name)) {
			cost_upri(value);
			return;
		}
		if ($cost_amt.equalsIgnoreCase(name)) {
			cost_amt(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
			return;
		}
		if ($iv_upri.equalsIgnoreCase(name)) {
			iv_upri(value);
			return;
		}
		if ($iv_amt.equalsIgnoreCase(name)) {
			iv_amt(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($wtax_amt.equalsIgnoreCase(name)) {
			wtax_amt(value);
			return;
		}
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			bill_crryovr_times(value);
			return;
		}
		if ($set_itm_grp_no.equalsIgnoreCase(name)) {
			set_itm_grp_no(value);
			return;
		}
		if ($edi_sub_d_num1.equalsIgnoreCase(name)) {
			edi_sub_d_num1(value);
			return;
		}
		if ($ship_pr_upd_cntr.equalsIgnoreCase(name)) {
			ship_pr_upd_cntr(value);
			return;
		}
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($ship_pr_base_unit_qty.equalsIgnoreCase(name)) {
			ship_pr_base_unit_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($prms_qty.equalsIgnoreCase(name)) {
			prms_qty(value);
			return;
		}
		if ($dlv_inst_rcpt_qty.equalsIgnoreCase(name)) {
			dlv_inst_rcpt_qty(value);
			return;
		}
		if ($dlv_inst_prms_qty.equalsIgnoreCase(name)) {
			dlv_inst_prms_qty(value);
			return;
		}
		if ($alloc_qty.equalsIgnoreCase(name)) {
			alloc_qty(value);
			return;
		}
		if ($wait_qty.equalsIgnoreCase(name)) {
			wait_qty(value);
			return;
		}
		if ($ship_inst_qty.equalsIgnoreCase(name)) {
			ship_inst_qty(value);
			return;
		}
		if ($ship_act_qty.equalsIgnoreCase(name)) {
			ship_act_qty(value);
			return;
		}
		if ($iv_schd_qty.equalsIgnoreCase(name)) {
			iv_schd_qty(value);
			return;
		}
		if ($iv_act_qty.equalsIgnoreCase(name)) {
			iv_act_qty(value);
			return;
		}
		if ($sls_qty.equalsIgnoreCase(name)) {
			sls_qty(value);
			return;
		}
		if ($ship_ret_qty.equalsIgnoreCase(name)) {
			ship_ret_qty(value);
			return;
		}
		if ($re_ship_schd_qty.equalsIgnoreCase(name)) {
			re_ship_schd_qty(value);
			return;
		}
		if ($ship_schd_abort_qty.equalsIgnoreCase(name)) {
			ship_schd_abort_qty(value);
			return;
		}
		if ($sls_schd_abort_qty.equalsIgnoreCase(name)) {
			sls_schd_abort_qty(value);
			return;
		}
		if ($not_dlv_qty.equalsIgnoreCase(name)) {
			not_dlv_qty(value);
			return;
		}
		if ($overdue_prspct_qty.equalsIgnoreCase(name)) {
			overdue_prspct_qty(value);
			return;
		}
		if ($ship_pr_rate.equalsIgnoreCase(name)) {
			ship_pr_rate(value);
			return;
		}
		if ($sls_pr_rate.equalsIgnoreCase(name)) {
			sls_pr_rate(value);
			return;
		}
		if ($act_dlv_lt.equalsIgnoreCase(name)) {
			act_dlv_lt(value);
			return;
		}
		if ($dlv_qty.equalsIgnoreCase(name)) {
			dlv_qty(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($cst_bill_crryovr_times.equalsIgnoreCase(name)) {
			cst_bill_crryovr_times(value);
			return;
		}
		if ($cst_upri_dec_place.equalsIgnoreCase(name)) {
			cst_upri_dec_place(value);
			return;
		}
		if ($cst_amt_dec_place.equalsIgnoreCase(name)) {
			cst_amt_dec_place(value);
			return;
		}
		if ($upri_dec_place.equalsIgnoreCase(name)) {
			upri_dec_place(value);
			return;
		}
		if ($mst_trd_cur_upri.equalsIgnoreCase(name)) {
			mst_trd_cur_upri(value);
			return;
		}
		if ($itm_bill_crryovr_times.equalsIgnoreCase(name)) {
			itm_bill_crryovr_times(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($slo_rev.equalsIgnoreCase(name)) {
			slo_rev(value);
			return;
		}
		if ($qtn_rev.equalsIgnoreCase(name)) {
			qtn_rev(value);
			return;
		}
		if ($slo_d_rev.equalsIgnoreCase(name)) {
			slo_d_rev(value);
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
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($base_cur_upri.equalsIgnoreCase(name)) {
			base_cur_upri(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			base_cur_inc_tax_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($ptax_xrate.equalsIgnoreCase(name)) {
			ptax_xrate(value);
			return;
		}
		if ($ptax_cur_upri.equalsIgnoreCase(name)) {
			ptax_cur_upri(value);
			return;
		}
		if ($ptax_cur_amt.equalsIgnoreCase(name)) {
			ptax_cur_amt(value);
			return;
		}
		if ($ptax_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			ptax_cur_inc_tax_amt(value);
			return;
		}
		if ($ptax_cur_tax_amt.equalsIgnoreCase(name)) {
			ptax_cur_tax_amt(value);
			return;
		}
		if ($prof_rate.equalsIgnoreCase(name)) {
			prof_rate(value);
			return;
		}
		if ($adv_bill_amt.equalsIgnoreCase(name)) {
			adv_bill_amt(value);
			return;
		}
		if ($adv_rcv_amt.equalsIgnoreCase(name)) {
			adv_rcv_amt(value);
			return;
		}
		if ($cst_po_rev.equalsIgnoreCase(name)) {
			cst_po_rev(value);
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
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($edi_sub_num1.equalsIgnoreCase(name)) {
			edi_sub_num1(value);
			return;
		}
		if ($hdr_grp_no.equalsIgnoreCase(name)) {
			hdr_grp_no(value);
			return;
		}
		if ($alloc_margin_days.equalsIgnoreCase(name)) {
			alloc_margin_days(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_base_qty(value);
			return;
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_qty(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
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
		if ($cost_upri.equalsIgnoreCase(name)) {
			cost_upri(value);
			return;
		}
		if ($cost_amt.equalsIgnoreCase(name)) {
			cost_amt(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
			return;
		}
		if ($iv_upri.equalsIgnoreCase(name)) {
			iv_upri(value);
			return;
		}
		if ($iv_amt.equalsIgnoreCase(name)) {
			iv_amt(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($wtax_amt.equalsIgnoreCase(name)) {
			wtax_amt(value);
			return;
		}
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			bill_crryovr_times(value);
			return;
		}
		if ($set_itm_grp_no.equalsIgnoreCase(name)) {
			set_itm_grp_no(value);
			return;
		}
		if ($edi_sub_d_num1.equalsIgnoreCase(name)) {
			edi_sub_d_num1(value);
			return;
		}
		if ($ship_pr_upd_cntr.equalsIgnoreCase(name)) {
			ship_pr_upd_cntr(value);
			return;
		}
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($ship_pr_base_unit_qty.equalsIgnoreCase(name)) {
			ship_pr_base_unit_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($prms_qty.equalsIgnoreCase(name)) {
			prms_qty(value);
			return;
		}
		if ($dlv_inst_rcpt_qty.equalsIgnoreCase(name)) {
			dlv_inst_rcpt_qty(value);
			return;
		}
		if ($dlv_inst_prms_qty.equalsIgnoreCase(name)) {
			dlv_inst_prms_qty(value);
			return;
		}
		if ($alloc_qty.equalsIgnoreCase(name)) {
			alloc_qty(value);
			return;
		}
		if ($wait_qty.equalsIgnoreCase(name)) {
			wait_qty(value);
			return;
		}
		if ($ship_inst_qty.equalsIgnoreCase(name)) {
			ship_inst_qty(value);
			return;
		}
		if ($ship_act_qty.equalsIgnoreCase(name)) {
			ship_act_qty(value);
			return;
		}
		if ($iv_schd_qty.equalsIgnoreCase(name)) {
			iv_schd_qty(value);
			return;
		}
		if ($iv_act_qty.equalsIgnoreCase(name)) {
			iv_act_qty(value);
			return;
		}
		if ($sls_qty.equalsIgnoreCase(name)) {
			sls_qty(value);
			return;
		}
		if ($ship_ret_qty.equalsIgnoreCase(name)) {
			ship_ret_qty(value);
			return;
		}
		if ($re_ship_schd_qty.equalsIgnoreCase(name)) {
			re_ship_schd_qty(value);
			return;
		}
		if ($ship_schd_abort_qty.equalsIgnoreCase(name)) {
			ship_schd_abort_qty(value);
			return;
		}
		if ($sls_schd_abort_qty.equalsIgnoreCase(name)) {
			sls_schd_abort_qty(value);
			return;
		}
		if ($not_dlv_qty.equalsIgnoreCase(name)) {
			not_dlv_qty(value);
			return;
		}
		if ($overdue_prspct_qty.equalsIgnoreCase(name)) {
			overdue_prspct_qty(value);
			return;
		}
		if ($ship_pr_rate.equalsIgnoreCase(name)) {
			ship_pr_rate(value);
			return;
		}
		if ($sls_pr_rate.equalsIgnoreCase(name)) {
			sls_pr_rate(value);
			return;
		}
		if ($act_dlv_lt.equalsIgnoreCase(name)) {
			act_dlv_lt(value);
			return;
		}
		if ($dlv_qty.equalsIgnoreCase(name)) {
			dlv_qty(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($cst_bill_crryovr_times.equalsIgnoreCase(name)) {
			cst_bill_crryovr_times(value);
			return;
		}
		if ($cst_upri_dec_place.equalsIgnoreCase(name)) {
			cst_upri_dec_place(value);
			return;
		}
		if ($cst_amt_dec_place.equalsIgnoreCase(name)) {
			cst_amt_dec_place(value);
			return;
		}
		if ($upri_dec_place.equalsIgnoreCase(name)) {
			upri_dec_place(value);
			return;
		}
		if ($mst_trd_cur_upri.equalsIgnoreCase(name)) {
			mst_trd_cur_upri(value);
			return;
		}
		if ($itm_bill_crryovr_times.equalsIgnoreCase(name)) {
			itm_bill_crryovr_times(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($slo_rev.equalsIgnoreCase(name)) {
			slo_rev(value);
			return;
		}
		if ($qtn_rev.equalsIgnoreCase(name)) {
			qtn_rev(value);
			return;
		}
		if ($slo_d_rev.equalsIgnoreCase(name)) {
			slo_d_rev(value);
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
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($base_cur_upri.equalsIgnoreCase(name)) {
			base_cur_upri(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			base_cur_inc_tax_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($ptax_xrate.equalsIgnoreCase(name)) {
			ptax_xrate(value);
			return;
		}
		if ($ptax_cur_upri.equalsIgnoreCase(name)) {
			ptax_cur_upri(value);
			return;
		}
		if ($ptax_cur_amt.equalsIgnoreCase(name)) {
			ptax_cur_amt(value);
			return;
		}
		if ($ptax_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			ptax_cur_inc_tax_amt(value);
			return;
		}
		if ($ptax_cur_tax_amt.equalsIgnoreCase(name)) {
			ptax_cur_tax_amt(value);
			return;
		}
		if ($prof_rate.equalsIgnoreCase(name)) {
			prof_rate(value);
			return;
		}
		if ($adv_bill_amt.equalsIgnoreCase(name)) {
			adv_bill_amt(value);
			return;
		}
		if ($adv_rcv_amt.equalsIgnoreCase(name)) {
			adv_rcv_amt(value);
			return;
		}
		if ($cst_po_rev.equalsIgnoreCase(name)) {
			cst_po_rev(value);
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
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($edi_sub_num1.equalsIgnoreCase(name)) {
			edi_sub_num1(value);
			return;
		}
		if ($hdr_grp_no.equalsIgnoreCase(name)) {
			hdr_grp_no(value);
			return;
		}
		if ($alloc_margin_days.equalsIgnoreCase(name)) {
			alloc_margin_days(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_base_qty(value);
			return;
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_qty(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
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
		if ($cost_upri.equalsIgnoreCase(name)) {
			cost_upri(value);
			return;
		}
		if ($cost_amt.equalsIgnoreCase(name)) {
			cost_amt(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
			return;
		}
		if ($iv_upri.equalsIgnoreCase(name)) {
			iv_upri(value);
			return;
		}
		if ($iv_amt.equalsIgnoreCase(name)) {
			iv_amt(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($wtax_amt.equalsIgnoreCase(name)) {
			wtax_amt(value);
			return;
		}
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			bill_crryovr_times(value);
			return;
		}
		if ($set_itm_grp_no.equalsIgnoreCase(name)) {
			set_itm_grp_no(value);
			return;
		}
		if ($edi_sub_d_num1.equalsIgnoreCase(name)) {
			edi_sub_d_num1(value);
			return;
		}
		if ($ship_pr_upd_cntr.equalsIgnoreCase(name)) {
			ship_pr_upd_cntr(value);
			return;
		}
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($ship_pr_base_unit_qty.equalsIgnoreCase(name)) {
			ship_pr_base_unit_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($prms_qty.equalsIgnoreCase(name)) {
			prms_qty(value);
			return;
		}
		if ($dlv_inst_rcpt_qty.equalsIgnoreCase(name)) {
			dlv_inst_rcpt_qty(value);
			return;
		}
		if ($dlv_inst_prms_qty.equalsIgnoreCase(name)) {
			dlv_inst_prms_qty(value);
			return;
		}
		if ($alloc_qty.equalsIgnoreCase(name)) {
			alloc_qty(value);
			return;
		}
		if ($wait_qty.equalsIgnoreCase(name)) {
			wait_qty(value);
			return;
		}
		if ($ship_inst_qty.equalsIgnoreCase(name)) {
			ship_inst_qty(value);
			return;
		}
		if ($ship_act_qty.equalsIgnoreCase(name)) {
			ship_act_qty(value);
			return;
		}
		if ($iv_schd_qty.equalsIgnoreCase(name)) {
			iv_schd_qty(value);
			return;
		}
		if ($iv_act_qty.equalsIgnoreCase(name)) {
			iv_act_qty(value);
			return;
		}
		if ($sls_qty.equalsIgnoreCase(name)) {
			sls_qty(value);
			return;
		}
		if ($ship_ret_qty.equalsIgnoreCase(name)) {
			ship_ret_qty(value);
			return;
		}
		if ($re_ship_schd_qty.equalsIgnoreCase(name)) {
			re_ship_schd_qty(value);
			return;
		}
		if ($ship_schd_abort_qty.equalsIgnoreCase(name)) {
			ship_schd_abort_qty(value);
			return;
		}
		if ($sls_schd_abort_qty.equalsIgnoreCase(name)) {
			sls_schd_abort_qty(value);
			return;
		}
		if ($not_dlv_qty.equalsIgnoreCase(name)) {
			not_dlv_qty(value);
			return;
		}
		if ($overdue_prspct_qty.equalsIgnoreCase(name)) {
			overdue_prspct_qty(value);
			return;
		}
		if ($ship_pr_rate.equalsIgnoreCase(name)) {
			ship_pr_rate(value);
			return;
		}
		if ($sls_pr_rate.equalsIgnoreCase(name)) {
			sls_pr_rate(value);
			return;
		}
		if ($act_dlv_lt.equalsIgnoreCase(name)) {
			act_dlv_lt(value);
			return;
		}
		if ($dlv_qty.equalsIgnoreCase(name)) {
			dlv_qty(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($cst_bill_crryovr_times.equalsIgnoreCase(name)) {
			cst_bill_crryovr_times(value);
			return;
		}
		if ($cst_upri_dec_place.equalsIgnoreCase(name)) {
			cst_upri_dec_place(value);
			return;
		}
		if ($cst_amt_dec_place.equalsIgnoreCase(name)) {
			cst_amt_dec_place(value);
			return;
		}
		if ($upri_dec_place.equalsIgnoreCase(name)) {
			upri_dec_place(value);
			return;
		}
		if ($mst_trd_cur_upri.equalsIgnoreCase(name)) {
			mst_trd_cur_upri(value);
			return;
		}
		if ($itm_bill_crryovr_times.equalsIgnoreCase(name)) {
			itm_bill_crryovr_times(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($slo_dt.equalsIgnoreCase(name)) {
			slo_dt(value);
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
		if ($rcpt_dt.equalsIgnoreCase(name)) {
			rcpt_dt(value);
			return;
		}
		if ($edi_sub_dt1.equalsIgnoreCase(name)) {
			edi_sub_dt1(value);
			return;
		}
		if ($ship_rqst_tm.equalsIgnoreCase(name)) {
			ship_rqst_tm(value);
			return;
		}
		if ($ship_rqst_dt.equalsIgnoreCase(name)) {
			ship_rqst_dt(value);
			return;
		}
		if ($ship_rqst_hm.equalsIgnoreCase(name)) {
			ship_rqst_hm(value);
			return;
		}
		if ($dlv_rqst_tm.equalsIgnoreCase(name)) {
			dlv_rqst_tm(value);
			return;
		}
		if ($dlv_rqst_dt.equalsIgnoreCase(name)) {
			dlv_rqst_dt(value);
			return;
		}
		if ($dlv_rqst_hm.equalsIgnoreCase(name)) {
			dlv_rqst_hm(value);
			return;
		}
		if ($pd_inst_dlv_dt.equalsIgnoreCase(name)) {
			pd_inst_dlv_dt(value);
			return;
		}
		if ($pd_inst_dlv_hm.equalsIgnoreCase(name)) {
			pd_inst_dlv_hm(value);
			return;
		}
		if ($accpt_schd_dt.equalsIgnoreCase(name)) {
			accpt_schd_dt(value);
			return;
		}
		if ($sls_schd_dt.equalsIgnoreCase(name)) {
			sls_schd_dt(value);
			return;
		}
		if ($ship_schd_tm.equalsIgnoreCase(name)) {
			ship_schd_tm(value);
			return;
		}
		if ($ship_schd_dt.equalsIgnoreCase(name)) {
			ship_schd_dt(value);
			return;
		}
		if ($ship_schd_hm.equalsIgnoreCase(name)) {
			ship_schd_hm(value);
			return;
		}
		if ($dlv_schd_tm.equalsIgnoreCase(name)) {
			dlv_schd_tm(value);
			return;
		}
		if ($dlv_schd_dt.equalsIgnoreCase(name)) {
			dlv_schd_dt(value);
			return;
		}
		if ($dlv_schd_hm.equalsIgnoreCase(name)) {
			dlv_schd_hm(value);
			return;
		}
		if ($rqst_dt.equalsIgnoreCase(name)) {
			rqst_dt(value);
			return;
		}
		if ($rqst_dlv_rqst_dt.equalsIgnoreCase(name)) {
			rqst_dlv_rqst_dt(value);
			return;
		}
		if ($rqst_prms_dt.equalsIgnoreCase(name)) {
			rqst_prms_dt(value);
			return;
		}
		if ($rqst_prms_dlv_dt.equalsIgnoreCase(name)) {
			rqst_prms_dlv_dt(value);
			return;
		}
		if ($edi_sub_d_dt1.equalsIgnoreCase(name)) {
			edi_sub_d_dt1(value);
			return;
		}
		if ($prms_dt.equalsIgnoreCase(name)) {
			prms_dt(value);
			return;
		}
		if ($dlv_inst_rcpt_dt.equalsIgnoreCase(name)) {
			dlv_inst_rcpt_dt(value);
			return;
		}
		if ($dlv_inst_prms_dt.equalsIgnoreCase(name)) {
			dlv_inst_prms_dt(value);
			return;
		}
		if ($dlv_inst_dt.equalsIgnoreCase(name)) {
			dlv_inst_dt(value);
			return;
		}
		if ($dlv_inst_hm.equalsIgnoreCase(name)) {
			dlv_inst_hm(value);
			return;
		}
		if ($prms_dlv_dt.equalsIgnoreCase(name)) {
			prms_dlv_dt(value);
			return;
		}
		if ($ship_dt.equalsIgnoreCase(name)) {
			ship_dt(value);
			return;
		}
		if ($ship_hm.equalsIgnoreCase(name)) {
			ship_hm(value);
			return;
		}
		if ($dlv_dt.equalsIgnoreCase(name)) {
			dlv_dt(value);
			return;
		}
		if ($dlv_hm.equalsIgnoreCase(name)) {
			dlv_hm(value);
			return;
		}
		if ($sls_dt.equalsIgnoreCase(name)) {
			sls_dt(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		if ($qtn_aprv_flg.equalsIgnoreCase(name)) {
			qtn_aprv_flg(value);
			return;
		}
		if ($can_upd_flg.equalsIgnoreCase(name)) {
			can_upd_flg(value);
			return;
		}
		if ($can_del_flg.equalsIgnoreCase(name)) {
			can_del_flg(value);
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
		if ($ptax_xrate_inpt_flg.equalsIgnoreCase(name)) {
			ptax_xrate_inpt_flg(value);
			return;
		}
		if ($iv_num_flg.equalsIgnoreCase(name)) {
			iv_num_flg(value);
			return;
		}
		if ($edi_flg.equalsIgnoreCase(name)) {
			edi_flg(value);
			return;
		}
		if ($is_src_batch_flg.equalsIgnoreCase(name)) {
			is_src_batch_flg(value);
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
		if ($can_flg.equalsIgnoreCase(name)) {
			can_flg(value);
			return;
		}
		if ($hdr_err_flg.equalsIgnoreCase(name)) {
			hdr_err_flg(value);
			return;
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			abort_flg(value);
			return;
		}
		if ($vmi_flg.equalsIgnoreCase(name)) {
			vmi_flg(value);
			return;
		}
		if ($dscnt_itm_flg.equalsIgnoreCase(name)) {
			dscnt_itm_flg(value);
			return;
		}
		if ($sundry_itm_flg.equalsIgnoreCase(name)) {
			sundry_itm_flg(value);
			return;
		}
		if ($upri_not_tgt_flg.equalsIgnoreCase(name)) {
			upri_not_tgt_flg(value);
			return;
		}
		if ($interim_flg.equalsIgnoreCase(name)) {
			interim_flg(value);
			return;
		}
		if ($tax_fix_flg.equalsIgnoreCase(name)) {
			tax_fix_flg(value);
			return;
		}
		if ($inc_tax_flg.equalsIgnoreCase(name)) {
			inc_tax_flg(value);
			return;
		}
		if ($sno_num_flg.equalsIgnoreCase(name)) {
			sno_num_flg(value);
			return;
		}
		if ($sno1_null_flg.equalsIgnoreCase(name)) {
			sno1_null_flg(value);
			return;
		}
		if ($sno2_null_flg.equalsIgnoreCase(name)) {
			sno2_null_flg(value);
			return;
		}
		if ($sno3_null_flg.equalsIgnoreCase(name)) {
			sno3_null_flg(value);
			return;
		}
		if ($sno4_null_flg.equalsIgnoreCase(name)) {
			sno4_null_flg(value);
			return;
		}
		if ($slo_sno1_flg.equalsIgnoreCase(name)) {
			slo_sno1_flg(value);
			return;
		}
		if ($slo_sno2_flg.equalsIgnoreCase(name)) {
			slo_sno2_flg(value);
			return;
		}
		if ($slo_sno3_flg.equalsIgnoreCase(name)) {
			slo_sno3_flg(value);
			return;
		}
		if ($slo_sno4_flg.equalsIgnoreCase(name)) {
			slo_sno4_flg(value);
			return;
		}
		if ($ship_schd_split_flg.equalsIgnoreCase(name)) {
			ship_schd_split_flg(value);
			return;
		}
		if ($ship_abl_flg.equalsIgnoreCase(name)) {
			ship_abl_flg(value);
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
		if ($tdlv_req_flg.equalsIgnoreCase(name)) {
			tdlv_req_flg(value);
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
		if ($not_lg_mix_flg.equalsIgnoreCase(name)) {
			not_lg_mix_flg(value);
			return;
		}
		if ($str_ln_tgt_flg.equalsIgnoreCase(name)) {
			str_ln_tgt_flg(value);
			return;
		}
		if ($str_ln_cd_none_flg.equalsIgnoreCase(name)) {
			str_ln_cd_none_flg(value);
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
		if ($ver_flg.equalsIgnoreCase(name)) {
			ver_flg(value);
			return;
		}
		if ($ship_block_flg.equalsIgnoreCase(name)) {
			ship_block_flg(value);
			return;
		}
		if ($sls_acxfr_flg.equalsIgnoreCase(name)) {
			sls_acxfr_flg(value);
			return;
		}
		if ($not_dt_calc_flg.equalsIgnoreCase(name)) {
			not_dt_calc_flg(value);
			return;
		}
		if ($slo_d_can_flg.equalsIgnoreCase(name)) {
			slo_d_can_flg(value);
			return;
		}
		if ($dtl_err_flg.equalsIgnoreCase(name)) {
			dtl_err_flg(value);
			return;
		}
		if ($upd_cntr_not_chk_flg.equalsIgnoreCase(name)) {
			upd_cntr_not_chk_flg(value);
			return;
		}
		if ($ship_cmpl_flg.equalsIgnoreCase(name)) {
			ship_cmpl_flg(value);
			return;
		}
		if ($sls_cmpl_flg.equalsIgnoreCase(name)) {
			sls_cmpl_flg(value);
			return;
		}
		if ($pack_flg.equalsIgnoreCase(name)) {
			pack_flg(value);
			return;
		}
		if ($fix_flg.equalsIgnoreCase(name)) {
			fix_flg(value);
			return;
		}
		if ($re_ship_schd_flg.equalsIgnoreCase(name)) {
			re_ship_schd_flg(value);
			return;
		}
		if ($dlv_rqst_dt_overdue_act_flg.equalsIgnoreCase(name)) {
			dlv_rqst_dt_overdue_act_flg(value);
			return;
		}
		if ($prms_dlv_dt_overdue_act_flg.equalsIgnoreCase(name)) {
			prms_dlv_dt_overdue_act_flg(value);
			return;
		}
		if ($bd_dpt_flg.equalsIgnoreCase(name)) {
			bd_dpt_flg(value);
			return;
		}
		if ($cst_sls_upri_cng_flg.equalsIgnoreCase(name)) {
			cst_sls_upri_cng_flg(value);
			return;
		}
		if ($mst_interim_flg.equalsIgnoreCase(name)) {
			mst_interim_flg(value);
			return;
		}
		if ($itm_sls_upri_cng_flg.equalsIgnoreCase(name)) {
			itm_sls_upri_cng_flg(value);
			return;
		}
		if ($slo_proc_flg.equalsIgnoreCase(name)) {
			slo_proc_flg(value);
			return;
		}
		if ($qtn_no_copy_flg.equalsIgnoreCase(name)) {
			qtn_no_copy_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		if ($rtn_sts_typ.equalsIgnoreCase(name)) {
			rtn_sts_typ(value);
			return;
		}
		if ($sls_sts_typ.equalsIgnoreCase(name)) {
			sls_sts_typ(value);
			return;
		}
		if ($sls_sts_typ_nm.equalsIgnoreCase(name)) {
			sls_sts_typ_nm(value);
			return;
		}
		if ($pr_sts_typ.equalsIgnoreCase(name)) {
			pr_sts_typ(value);
			return;
		}
		if ($pr_sts_typ_nm.equalsIgnoreCase(name)) {
			pr_sts_typ_nm(value);
			return;
		}
		if ($alloc_sts_typ.equalsIgnoreCase(name)) {
			alloc_sts_typ(value);
			return;
		}
		if ($alloc_sts_typ_nm.equalsIgnoreCase(name)) {
			alloc_sts_typ_nm(value);
			return;
		}
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
		if ($qtn_no.equalsIgnoreCase(name)) {
			qtn_no(value);
			return;
		}
		if ($qtn_aprv_no.equalsIgnoreCase(name)) {
			qtn_aprv_no(value);
			return;
		}
		if ($slo_d_no.equalsIgnoreCase(name)) {
			slo_d_no(value);
			return;
		}
		if ($sim_alloc_pln_typ.equalsIgnoreCase(name)) {
			sim_alloc_pln_typ(value);
			return;
		}
		if ($sim_alloc_pln_typ_nm.equalsIgnoreCase(name)) {
			sim_alloc_pln_typ_nm(value);
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
		if ($assort_typ.equalsIgnoreCase(name)) {
			assort_typ(value);
			return;
		}
		if ($assort_typ_nm.equalsIgnoreCase(name)) {
			assort_typ_nm(value);
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
		if ($ptax_cur_cd.equalsIgnoreCase(name)) {
			ptax_cur_cd(value);
			return;
		}
		if ($ptax_cur_nm.equalsIgnoreCase(name)) {
			ptax_cur_nm(value);
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
		if ($iv_no.equalsIgnoreCase(name)) {
			iv_no(value);
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
		if ($cst_po_no.equalsIgnoreCase(name)) {
			cst_po_no(value);
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
		if ($rcpt_usr_cd.equalsIgnoreCase(name)) {
			rcpt_usr_cd(value);
			return;
		}
		if ($rcpt_usr_nm.equalsIgnoreCase(name)) {
			rcpt_usr_nm(value);
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
		if ($cntry_cd.equalsIgnoreCase(name)) {
			cntry_cd(value);
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
		if ($cst_itm_cd.equalsIgnoreCase(name)) {
			cst_itm_cd(value);
			return;
		}
		if ($cst_itm_nm.equalsIgnoreCase(name)) {
			cst_itm_nm(value);
			return;
		}
		if ($itm_cd.equalsIgnoreCase(name)) {
			itm_cd(value);
			return;
		}
		if ($itm_sub1.equalsIgnoreCase(name)) {
			itm_sub1(value);
			return;
		}
		if ($itm_sub2.equalsIgnoreCase(name)) {
			itm_sub2(value);
			return;
		}
		if ($itm_sub3.equalsIgnoreCase(name)) {
			itm_sub3(value);
			return;
		}
		if ($itm_nm.equalsIgnoreCase(name)) {
			itm_nm(value);
			return;
		}
		if ($comp_spec_typ.equalsIgnoreCase(name)) {
			comp_spec_typ(value);
			return;
		}
		if ($comp_spec_typ_nm.equalsIgnoreCase(name)) {
			comp_spec_typ_nm(value);
			return;
		}
		if ($itm_comp_rev_no.equalsIgnoreCase(name)) {
			itm_comp_rev_no(value);
			return;
		}
		if ($iv_itm_nm.equalsIgnoreCase(name)) {
			iv_itm_nm(value);
			return;
		}
		if ($cntry_org_cd.equalsIgnoreCase(name)) {
			cntry_org_cd(value);
			return;
		}
		if ($cntry_org_nm.equalsIgnoreCase(name)) {
			cntry_org_nm(value);
			return;
		}
		if ($asset_mng_typ.equalsIgnoreCase(name)) {
			asset_mng_typ(value);
			return;
		}
		if ($asset_mng_typ_nm.equalsIgnoreCase(name)) {
			asset_mng_typ_nm(value);
			return;
		}
		if ($stk_mng_typ.equalsIgnoreCase(name)) {
			stk_mng_typ(value);
			return;
		}
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			trd_unit_cd(value);
			return;
		}
		if ($trd_unit_nm.equalsIgnoreCase(name)) {
			trd_unit_nm(value);
			return;
		}
		if ($dscnt_rsn_cd.equalsIgnoreCase(name)) {
			dscnt_rsn_cd(value);
			return;
		}
		if ($dscnt_rsn_nm.equalsIgnoreCase(name)) {
			dscnt_rsn_nm(value);
			return;
		}
		if ($tax_cd.equalsIgnoreCase(name)) {
			tax_cd(value);
			return;
		}
		if ($tax_nm.equalsIgnoreCase(name)) {
			tax_nm(value);
			return;
		}
		if ($gd_cd.equalsIgnoreCase(name)) {
			gd_cd(value);
			return;
		}
		if ($gd_nm.equalsIgnoreCase(name)) {
			gd_nm(value);
			return;
		}
		if ($sno1.equalsIgnoreCase(name)) {
			sno1(value);
			return;
		}
		if ($sno2.equalsIgnoreCase(name)) {
			sno2(value);
			return;
		}
		if ($sno3.equalsIgnoreCase(name)) {
			sno3(value);
			return;
		}
		if ($sno4.equalsIgnoreCase(name)) {
			sno4(value);
			return;
		}
		if ($sno1_mng_typ.equalsIgnoreCase(name)) {
			sno1_mng_typ(value);
			return;
		}
		if ($sno2_mng_typ.equalsIgnoreCase(name)) {
			sno2_mng_typ(value);
			return;
		}
		if ($sno3_mng_typ.equalsIgnoreCase(name)) {
			sno3_mng_typ(value);
			return;
		}
		if ($sno4_mng_typ.equalsIgnoreCase(name)) {
			sno4_mng_typ(value);
			return;
		}
		if ($sno1_num_typ.equalsIgnoreCase(name)) {
			sno1_num_typ(value);
			return;
		}
		if ($sno2_num_typ.equalsIgnoreCase(name)) {
			sno2_num_typ(value);
			return;
		}
		if ($sno3_num_typ.equalsIgnoreCase(name)) {
			sno3_num_typ(value);
			return;
		}
		if ($sno4_num_typ.equalsIgnoreCase(name)) {
			sno4_num_typ(value);
			return;
		}
		if ($sno1_ptn_cd.equalsIgnoreCase(name)) {
			sno1_ptn_cd(value);
			return;
		}
		if ($sno2_ptn_cd.equalsIgnoreCase(name)) {
			sno2_ptn_cd(value);
			return;
		}
		if ($sno3_ptn_cd.equalsIgnoreCase(name)) {
			sno3_ptn_cd(value);
			return;
		}
		if ($sno4_ptn_cd.equalsIgnoreCase(name)) {
			sno4_ptn_cd(value);
			return;
		}
		if ($dlv_cd.equalsIgnoreCase(name)) {
			dlv_cd(value);
			return;
		}
		if ($dlv_nm.equalsIgnoreCase(name)) {
			dlv_nm(value);
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
		if ($dlv_zip_cd.equalsIgnoreCase(name)) {
			dlv_zip_cd(value);
			return;
		}
		if ($dlv_addr1.equalsIgnoreCase(name)) {
			dlv_addr1(value);
			return;
		}
		if ($dlv_addr2.equalsIgnoreCase(name)) {
			dlv_addr2(value);
			return;
		}
		if ($dlv_addr3.equalsIgnoreCase(name)) {
			dlv_addr3(value);
			return;
		}
		if ($dlv_addr4.equalsIgnoreCase(name)) {
			dlv_addr4(value);
			return;
		}
		if ($dlv_tel.equalsIgnoreCase(name)) {
			dlv_tel(value);
			return;
		}
		if ($dlv_fax.equalsIgnoreCase(name)) {
			dlv_fax(value);
			return;
		}
		if ($dlv_cntry_cd.equalsIgnoreCase(name)) {
			dlv_cntry_cd(value);
			return;
		}
		if ($dlv_cntry_nm.equalsIgnoreCase(name)) {
			dlv_cntry_nm(value);
			return;
		}
		if ($dlv_lg_grp_cd.equalsIgnoreCase(name)) {
			dlv_lg_grp_cd(value);
			return;
		}
		if ($dlv_lg_grp_nm.equalsIgnoreCase(name)) {
			dlv_lg_grp_nm(value);
			return;
		}
		if ($pri_prnt_typ.equalsIgnoreCase(name)) {
			pri_prnt_typ(value);
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
		if ($tdlv_cd.equalsIgnoreCase(name)) {
			tdlv_cd(value);
			return;
		}
		if ($tdlv_nm.equalsIgnoreCase(name)) {
			tdlv_nm(value);
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
		if ($tdlv_cntct_dpt.equalsIgnoreCase(name)) {
			tdlv_cntct_dpt(value);
			return;
		}
		if ($tdlv_cntct_psn.equalsIgnoreCase(name)) {
			tdlv_cntct_psn(value);
			return;
		}
		if ($tdlv_zip_cd.equalsIgnoreCase(name)) {
			tdlv_zip_cd(value);
			return;
		}
		if ($tdlv_addr1.equalsIgnoreCase(name)) {
			tdlv_addr1(value);
			return;
		}
		if ($tdlv_addr2.equalsIgnoreCase(name)) {
			tdlv_addr2(value);
			return;
		}
		if ($tdlv_addr3.equalsIgnoreCase(name)) {
			tdlv_addr3(value);
			return;
		}
		if ($tdlv_addr4.equalsIgnoreCase(name)) {
			tdlv_addr4(value);
			return;
		}
		if ($tdlv_tel.equalsIgnoreCase(name)) {
			tdlv_tel(value);
			return;
		}
		if ($tdlv_fax.equalsIgnoreCase(name)) {
			tdlv_fax(value);
			return;
		}
		if ($tdlv_cntry_cd.equalsIgnoreCase(name)) {
			tdlv_cntry_cd(value);
			return;
		}
		if ($tdlv_cntry_nm.equalsIgnoreCase(name)) {
			tdlv_cntry_nm(value);
			return;
		}
		if ($tdlv_lg_grp_cd.equalsIgnoreCase(name)) {
			tdlv_lg_grp_cd(value);
			return;
		}
		if ($tdlv_lg_grp_nm.equalsIgnoreCase(name)) {
			tdlv_lg_grp_nm(value);
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
		if ($proc_typ.equalsIgnoreCase(name)) {
			proc_typ(value);
			return;
		}
		if ($proc_typ_nm.equalsIgnoreCase(name)) {
			proc_typ_nm(value);
			return;
		}
		if ($ship_inst_typ.equalsIgnoreCase(name)) {
			ship_inst_typ(value);
			return;
		}
		if ($ship_inst_typ_nm.equalsIgnoreCase(name)) {
			ship_inst_typ_nm(value);
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
		if ($alloc_scope_typ.equalsIgnoreCase(name)) {
			alloc_scope_typ(value);
			return;
		}
		if ($alloc_scope_typ_nm.equalsIgnoreCase(name)) {
			alloc_scope_typ_nm(value);
			return;
		}
		if ($alloc_typ.equalsIgnoreCase(name)) {
			alloc_typ(value);
			return;
		}
		if ($alloc_typ_nm.equalsIgnoreCase(name)) {
			alloc_typ_nm(value);
			return;
		}
		if ($rqst_to_loc_cd.equalsIgnoreCase(name)) {
			rqst_to_loc_cd(value);
			return;
		}
		if ($rqst_to_loc_nm.equalsIgnoreCase(name)) {
			rqst_to_loc_nm(value);
			return;
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			sppl_cd(value);
			return;
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			sppl_nm(value);
			return;
		}
		if ($maker_cd.equalsIgnoreCase(name)) {
			maker_cd(value);
			return;
		}
		if ($maker_nm.equalsIgnoreCase(name)) {
			maker_nm(value);
			return;
		}
		if ($wg_rqst_cnt_rmrks.equalsIgnoreCase(name)) {
			wg_rqst_cnt_rmrks(value);
			return;
		}
		if ($rqst_to_wg_cd.equalsIgnoreCase(name)) {
			rqst_to_wg_cd(value);
			return;
		}
		if ($alloc_grp_cd.equalsIgnoreCase(name)) {
			alloc_grp_cd(value);
			return;
		}
		if ($alloc_grp_nm.equalsIgnoreCase(name)) {
			alloc_grp_nm(value);
			return;
		}
		if ($ship_lg_grp_cd.equalsIgnoreCase(name)) {
			ship_lg_grp_cd(value);
			return;
		}
		if ($ship_lg_grp_nm.equalsIgnoreCase(name)) {
			ship_lg_grp_nm(value);
			return;
		}
		if ($def_loc_cd.equalsIgnoreCase(name)) {
			def_loc_cd(value);
			return;
		}
		if ($def_loc_nm.equalsIgnoreCase(name)) {
			def_loc_nm(value);
			return;
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			loc_cd(value);
			return;
		}
		if ($loc_nm.equalsIgnoreCase(name)) {
			loc_nm(value);
			return;
		}
		if ($str_ln_cd.equalsIgnoreCase(name)) {
			str_ln_cd(value);
			return;
		}
		if ($str_ln_nm.equalsIgnoreCase(name)) {
			str_ln_nm(value);
			return;
		}
		if ($lot_no.equalsIgnoreCase(name)) {
			lot_no(value);
			return;
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			sublot_no(value);
			return;
		}
		if ($ver_no.equalsIgnoreCase(name)) {
			ver_no(value);
			return;
		}
		if ($ship_term_cd.equalsIgnoreCase(name)) {
			ship_term_cd(value);
			return;
		}
		if ($ship_term_nm.equalsIgnoreCase(name)) {
			ship_term_nm(value);
			return;
		}
		if ($ship_cnt_rmrks.equalsIgnoreCase(name)) {
			ship_cnt_rmrks(value);
			return;
		}
		if ($cst_po_d_no.equalsIgnoreCase(name)) {
			cst_po_d_no(value);
			return;
		}
		if ($cst_po_d_rmrks.equalsIgnoreCase(name)) {
			cst_po_d_rmrks(value);
			return;
		}
		if ($sls_rsn_cd.equalsIgnoreCase(name)) {
			sls_rsn_cd(value);
			return;
		}
		if ($sls_rsn_nm.equalsIgnoreCase(name)) {
			sls_rsn_nm(value);
			return;
		}
		if ($bd_dpt_cd.equalsIgnoreCase(name)) {
			bd_dpt_cd(value);
			return;
		}
		if ($bd_dpt_nm.equalsIgnoreCase(name)) {
			bd_dpt_nm(value);
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
		if ($io_schd_pr_no.equalsIgnoreCase(name)) {
			io_schd_pr_no(value);
			return;
		}
		if ($trd_d_rmrks.equalsIgnoreCase(name)) {
			trd_d_rmrks(value);
			return;
		}
		if ($slo_d_intr_rmrks.equalsIgnoreCase(name)) {
			slo_d_intr_rmrks(value);
			return;
		}
		if ($slo_d_sub_char1.equalsIgnoreCase(name)) {
			slo_d_sub_char1(value);
			return;
		}
		if ($slo_d_sub_char2.equalsIgnoreCase(name)) {
			slo_d_sub_char2(value);
			return;
		}
		if ($slo_d_sub_char3.equalsIgnoreCase(name)) {
			slo_d_sub_char3(value);
			return;
		}
		if ($qtn_d_no.equalsIgnoreCase(name)) {
			qtn_d_no(value);
			return;
		}
		if ($edi_sub_d_char1.equalsIgnoreCase(name)) {
			edi_sub_d_char1(value);
			return;
		}
		if ($edi_sub_d_char2.equalsIgnoreCase(name)) {
			edi_sub_d_char2(value);
			return;
		}
		if ($edi_sub_d_char3.equalsIgnoreCase(name)) {
			edi_sub_d_char3(value);
			return;
		}
		if ($edi_sub_d_char4.equalsIgnoreCase(name)) {
			edi_sub_d_char4(value);
			return;
		}
		if ($edi_sub_d_char5.equalsIgnoreCase(name)) {
			edi_sub_d_char5(value);
			return;
		}
		if ($slo_d_can_rsn_cd.equalsIgnoreCase(name)) {
			slo_d_can_rsn_cd(value);
			return;
		}
		if ($slo_d_can_rsn_nm.equalsIgnoreCase(name)) {
			slo_d_can_rsn_nm(value);
			return;
		}
		if ($slo_d_can_rmkrs.equalsIgnoreCase(name)) {
			slo_d_can_rmkrs(value);
			return;
		}
		if ($ship_pr_no.equalsIgnoreCase(name)) {
			ship_pr_no(value);
			return;
		}
		if ($itm_ship_grp_cd.equalsIgnoreCase(name)) {
			itm_ship_grp_cd(value);
			return;
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			base_unit_cd(value);
			return;
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			base_unit_nm(value);
			return;
		}
		if ($base_unit_rnd_typ.equalsIgnoreCase(name)) {
			base_unit_rnd_typ(value);
			return;
		}
		if ($trd_unit_rnd_typ.equalsIgnoreCase(name)) {
			trd_unit_rnd_typ(value);
			return;
		}
		if ($cst_ship_schd_split_typ.equalsIgnoreCase(name)) {
			cst_ship_schd_split_typ(value);
			return;
		}
		if ($cst_sls_basis_typ.equalsIgnoreCase(name)) {
			cst_sls_basis_typ(value);
			return;
		}
		if ($cst_sls_usr_cd.equalsIgnoreCase(name)) {
			cst_sls_usr_cd(value);
			return;
		}
		if ($cst_sls_dpt_cd.equalsIgnoreCase(name)) {
			cst_sls_dpt_cd(value);
			return;
		}
		if ($cst_ar_dpt_cd.equalsIgnoreCase(name)) {
			cst_ar_dpt_cd(value);
			return;
		}
		if ($cst_sls_upri_req_typ.equalsIgnoreCase(name)) {
			cst_sls_upri_req_typ(value);
			return;
		}
		if ($ar_dpt_typ.equalsIgnoreCase(name)) {
			ar_dpt_typ(value);
			return;
		}
		if ($cst_trd_cur_cd.equalsIgnoreCase(name)) {
			cst_trd_cur_cd(value);
			return;
		}
		if ($mst_dlv_nm.equalsIgnoreCase(name)) {
			mst_dlv_nm(value);
			return;
		}
		if ($mst_dlv_cntct_dpt.equalsIgnoreCase(name)) {
			mst_dlv_cntct_dpt(value);
			return;
		}
		if ($mst_dlv_cntct_psn.equalsIgnoreCase(name)) {
			mst_dlv_cntct_psn(value);
			return;
		}
		if ($mst_dlv_zip_cd.equalsIgnoreCase(name)) {
			mst_dlv_zip_cd(value);
			return;
		}
		if ($mst_dlv_addr1.equalsIgnoreCase(name)) {
			mst_dlv_addr1(value);
			return;
		}
		if ($mst_dlv_addr2.equalsIgnoreCase(name)) {
			mst_dlv_addr2(value);
			return;
		}
		if ($mst_dlv_addr3.equalsIgnoreCase(name)) {
			mst_dlv_addr3(value);
			return;
		}
		if ($mst_dlv_addr4.equalsIgnoreCase(name)) {
			mst_dlv_addr4(value);
			return;
		}
		if ($mst_dlv_tel.equalsIgnoreCase(name)) {
			mst_dlv_tel(value);
			return;
		}
		if ($mst_dlv_fax.equalsIgnoreCase(name)) {
			mst_dlv_fax(value);
			return;
		}
		if ($mst_dlv_lg_grp_cd.equalsIgnoreCase(name)) {
			mst_dlv_lg_grp_cd(value);
			return;
		}
		if ($prnt_lcl_cd.equalsIgnoreCase(name)) {
			prnt_lcl_cd(value);
			return;
		}
		if ($mst_tdlv_nm.equalsIgnoreCase(name)) {
			mst_tdlv_nm(value);
			return;
		}
		if ($mst_tdlv_cntct_dpt.equalsIgnoreCase(name)) {
			mst_tdlv_cntct_dpt(value);
			return;
		}
		if ($mst_tdlv_cntct_psn.equalsIgnoreCase(name)) {
			mst_tdlv_cntct_psn(value);
			return;
		}
		if ($mst_tdlv_zip_cd.equalsIgnoreCase(name)) {
			mst_tdlv_zip_cd(value);
			return;
		}
		if ($mst_tdlv_addr1.equalsIgnoreCase(name)) {
			mst_tdlv_addr1(value);
			return;
		}
		if ($mst_tdlv_addr2.equalsIgnoreCase(name)) {
			mst_tdlv_addr2(value);
			return;
		}
		if ($mst_tdlv_addr3.equalsIgnoreCase(name)) {
			mst_tdlv_addr3(value);
			return;
		}
		if ($mst_tdlv_addr4.equalsIgnoreCase(name)) {
			mst_tdlv_addr4(value);
			return;
		}
		if ($mst_tdlv_tel.equalsIgnoreCase(name)) {
			mst_tdlv_tel(value);
			return;
		}
		if ($mst_tdlv_fax.equalsIgnoreCase(name)) {
			mst_tdlv_fax(value);
			return;
		}
		if ($mst_tdlv_lg_grp_cd.equalsIgnoreCase(name)) {
			mst_tdlv_lg_grp_cd(value);
			return;
		}
		if ($mst_via_dlv_typ.equalsIgnoreCase(name)) {
			mst_via_dlv_typ(value);
			return;
		}
		if ($mid_loc_cd.equalsIgnoreCase(name)) {
			mid_loc_cd(value);
			return;
		}
		if ($loc_wg_cd.equalsIgnoreCase(name)) {
			loc_wg_cd(value);
			return;
		}
		if ($tax_typ.equalsIgnoreCase(name)) {
			tax_typ(value);
			return;
		}
		if ($itm_cntry_org_cd.equalsIgnoreCase(name)) {
			itm_cntry_org_cd(value);
			return;
		}
		if ($lot_mng_typ.equalsIgnoreCase(name)) {
			lot_mng_typ(value);
			return;
		}
		if ($sublot_mng_typ.equalsIgnoreCase(name)) {
			sublot_mng_typ(value);
			return;
		}
		if ($itm_trd_unit_cd.equalsIgnoreCase(name)) {
			itm_trd_unit_cd(value);
			return;
		}
		if ($itm_proc_typ.equalsIgnoreCase(name)) {
			itm_proc_typ(value);
			return;
		}
		if ($itm_ship_inst_typ.equalsIgnoreCase(name)) {
			itm_ship_inst_typ(value);
			return;
		}
		if ($itm_ship_term_cd.equalsIgnoreCase(name)) {
			itm_ship_term_cd(value);
			return;
		}
		if ($cred_cd.equalsIgnoreCase(name)) {
			cred_cd(value);
			return;
		}
		if ($mst_cst_itm_nm.equalsIgnoreCase(name)) {
			mst_cst_itm_nm(value);
			return;
		}
		if ($mst_itm_nm.equalsIgnoreCase(name)) {
			mst_itm_nm(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($slo_rev.equalsIgnoreCase(name)) {
			slo_rev(value);
			return;
		}
		if ($qtn_rev.equalsIgnoreCase(name)) {
			qtn_rev(value);
			return;
		}
		if ($slo_d_rev.equalsIgnoreCase(name)) {
			slo_d_rev(value);
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
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($base_cur_upri.equalsIgnoreCase(name)) {
			base_cur_upri(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			base_cur_inc_tax_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($ptax_xrate.equalsIgnoreCase(name)) {
			ptax_xrate(value);
			return;
		}
		if ($ptax_cur_upri.equalsIgnoreCase(name)) {
			ptax_cur_upri(value);
			return;
		}
		if ($ptax_cur_amt.equalsIgnoreCase(name)) {
			ptax_cur_amt(value);
			return;
		}
		if ($ptax_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			ptax_cur_inc_tax_amt(value);
			return;
		}
		if ($ptax_cur_tax_amt.equalsIgnoreCase(name)) {
			ptax_cur_tax_amt(value);
			return;
		}
		if ($prof_rate.equalsIgnoreCase(name)) {
			prof_rate(value);
			return;
		}
		if ($adv_bill_amt.equalsIgnoreCase(name)) {
			adv_bill_amt(value);
			return;
		}
		if ($adv_rcv_amt.equalsIgnoreCase(name)) {
			adv_rcv_amt(value);
			return;
		}
		if ($cst_po_rev.equalsIgnoreCase(name)) {
			cst_po_rev(value);
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
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($edi_sub_num1.equalsIgnoreCase(name)) {
			edi_sub_num1(value);
			return;
		}
		if ($hdr_grp_no.equalsIgnoreCase(name)) {
			hdr_grp_no(value);
			return;
		}
		if ($alloc_margin_days.equalsIgnoreCase(name)) {
			alloc_margin_days(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_base_qty(value);
			return;
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_qty(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
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
		if ($cost_upri.equalsIgnoreCase(name)) {
			cost_upri(value);
			return;
		}
		if ($cost_amt.equalsIgnoreCase(name)) {
			cost_amt(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
			return;
		}
		if ($iv_upri.equalsIgnoreCase(name)) {
			iv_upri(value);
			return;
		}
		if ($iv_amt.equalsIgnoreCase(name)) {
			iv_amt(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($wtax_amt.equalsIgnoreCase(name)) {
			wtax_amt(value);
			return;
		}
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			bill_crryovr_times(value);
			return;
		}
		if ($set_itm_grp_no.equalsIgnoreCase(name)) {
			set_itm_grp_no(value);
			return;
		}
		if ($edi_sub_d_num1.equalsIgnoreCase(name)) {
			edi_sub_d_num1(value);
			return;
		}
		if ($ship_pr_upd_cntr.equalsIgnoreCase(name)) {
			ship_pr_upd_cntr(value);
			return;
		}
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($ship_pr_base_unit_qty.equalsIgnoreCase(name)) {
			ship_pr_base_unit_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($prms_qty.equalsIgnoreCase(name)) {
			prms_qty(value);
			return;
		}
		if ($dlv_inst_rcpt_qty.equalsIgnoreCase(name)) {
			dlv_inst_rcpt_qty(value);
			return;
		}
		if ($dlv_inst_prms_qty.equalsIgnoreCase(name)) {
			dlv_inst_prms_qty(value);
			return;
		}
		if ($alloc_qty.equalsIgnoreCase(name)) {
			alloc_qty(value);
			return;
		}
		if ($wait_qty.equalsIgnoreCase(name)) {
			wait_qty(value);
			return;
		}
		if ($ship_inst_qty.equalsIgnoreCase(name)) {
			ship_inst_qty(value);
			return;
		}
		if ($ship_act_qty.equalsIgnoreCase(name)) {
			ship_act_qty(value);
			return;
		}
		if ($iv_schd_qty.equalsIgnoreCase(name)) {
			iv_schd_qty(value);
			return;
		}
		if ($iv_act_qty.equalsIgnoreCase(name)) {
			iv_act_qty(value);
			return;
		}
		if ($sls_qty.equalsIgnoreCase(name)) {
			sls_qty(value);
			return;
		}
		if ($ship_ret_qty.equalsIgnoreCase(name)) {
			ship_ret_qty(value);
			return;
		}
		if ($re_ship_schd_qty.equalsIgnoreCase(name)) {
			re_ship_schd_qty(value);
			return;
		}
		if ($ship_schd_abort_qty.equalsIgnoreCase(name)) {
			ship_schd_abort_qty(value);
			return;
		}
		if ($sls_schd_abort_qty.equalsIgnoreCase(name)) {
			sls_schd_abort_qty(value);
			return;
		}
		if ($not_dlv_qty.equalsIgnoreCase(name)) {
			not_dlv_qty(value);
			return;
		}
		if ($overdue_prspct_qty.equalsIgnoreCase(name)) {
			overdue_prspct_qty(value);
			return;
		}
		if ($ship_pr_rate.equalsIgnoreCase(name)) {
			ship_pr_rate(value);
			return;
		}
		if ($sls_pr_rate.equalsIgnoreCase(name)) {
			sls_pr_rate(value);
			return;
		}
		if ($act_dlv_lt.equalsIgnoreCase(name)) {
			act_dlv_lt(value);
			return;
		}
		if ($dlv_qty.equalsIgnoreCase(name)) {
			dlv_qty(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($cst_bill_crryovr_times.equalsIgnoreCase(name)) {
			cst_bill_crryovr_times(value);
			return;
		}
		if ($cst_upri_dec_place.equalsIgnoreCase(name)) {
			cst_upri_dec_place(value);
			return;
		}
		if ($cst_amt_dec_place.equalsIgnoreCase(name)) {
			cst_amt_dec_place(value);
			return;
		}
		if ($upri_dec_place.equalsIgnoreCase(name)) {
			upri_dec_place(value);
			return;
		}
		if ($mst_trd_cur_upri.equalsIgnoreCase(name)) {
			mst_trd_cur_upri(value);
			return;
		}
		if ($itm_bill_crryovr_times.equalsIgnoreCase(name)) {
			itm_bill_crryovr_times(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($slo_rev.equalsIgnoreCase(name)) {
			slo_rev(value);
			return;
		}
		if ($qtn_rev.equalsIgnoreCase(name)) {
			qtn_rev(value);
			return;
		}
		if ($slo_d_rev.equalsIgnoreCase(name)) {
			slo_d_rev(value);
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
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($base_cur_upri.equalsIgnoreCase(name)) {
			base_cur_upri(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			base_cur_inc_tax_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($ptax_xrate.equalsIgnoreCase(name)) {
			ptax_xrate(value);
			return;
		}
		if ($ptax_cur_upri.equalsIgnoreCase(name)) {
			ptax_cur_upri(value);
			return;
		}
		if ($ptax_cur_amt.equalsIgnoreCase(name)) {
			ptax_cur_amt(value);
			return;
		}
		if ($ptax_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			ptax_cur_inc_tax_amt(value);
			return;
		}
		if ($ptax_cur_tax_amt.equalsIgnoreCase(name)) {
			ptax_cur_tax_amt(value);
			return;
		}
		if ($prof_rate.equalsIgnoreCase(name)) {
			prof_rate(value);
			return;
		}
		if ($adv_bill_amt.equalsIgnoreCase(name)) {
			adv_bill_amt(value);
			return;
		}
		if ($adv_rcv_amt.equalsIgnoreCase(name)) {
			adv_rcv_amt(value);
			return;
		}
		if ($cst_po_rev.equalsIgnoreCase(name)) {
			cst_po_rev(value);
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
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($edi_sub_num1.equalsIgnoreCase(name)) {
			edi_sub_num1(value);
			return;
		}
		if ($hdr_grp_no.equalsIgnoreCase(name)) {
			hdr_grp_no(value);
			return;
		}
		if ($alloc_margin_days.equalsIgnoreCase(name)) {
			alloc_margin_days(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_base_qty(value);
			return;
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_qty(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
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
		if ($cost_upri.equalsIgnoreCase(name)) {
			cost_upri(value);
			return;
		}
		if ($cost_amt.equalsIgnoreCase(name)) {
			cost_amt(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
			return;
		}
		if ($iv_upri.equalsIgnoreCase(name)) {
			iv_upri(value);
			return;
		}
		if ($iv_amt.equalsIgnoreCase(name)) {
			iv_amt(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($wtax_amt.equalsIgnoreCase(name)) {
			wtax_amt(value);
			return;
		}
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			bill_crryovr_times(value);
			return;
		}
		if ($set_itm_grp_no.equalsIgnoreCase(name)) {
			set_itm_grp_no(value);
			return;
		}
		if ($edi_sub_d_num1.equalsIgnoreCase(name)) {
			edi_sub_d_num1(value);
			return;
		}
		if ($ship_pr_upd_cntr.equalsIgnoreCase(name)) {
			ship_pr_upd_cntr(value);
			return;
		}
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($ship_pr_base_unit_qty.equalsIgnoreCase(name)) {
			ship_pr_base_unit_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($prms_qty.equalsIgnoreCase(name)) {
			prms_qty(value);
			return;
		}
		if ($dlv_inst_rcpt_qty.equalsIgnoreCase(name)) {
			dlv_inst_rcpt_qty(value);
			return;
		}
		if ($dlv_inst_prms_qty.equalsIgnoreCase(name)) {
			dlv_inst_prms_qty(value);
			return;
		}
		if ($alloc_qty.equalsIgnoreCase(name)) {
			alloc_qty(value);
			return;
		}
		if ($wait_qty.equalsIgnoreCase(name)) {
			wait_qty(value);
			return;
		}
		if ($ship_inst_qty.equalsIgnoreCase(name)) {
			ship_inst_qty(value);
			return;
		}
		if ($ship_act_qty.equalsIgnoreCase(name)) {
			ship_act_qty(value);
			return;
		}
		if ($iv_schd_qty.equalsIgnoreCase(name)) {
			iv_schd_qty(value);
			return;
		}
		if ($iv_act_qty.equalsIgnoreCase(name)) {
			iv_act_qty(value);
			return;
		}
		if ($sls_qty.equalsIgnoreCase(name)) {
			sls_qty(value);
			return;
		}
		if ($ship_ret_qty.equalsIgnoreCase(name)) {
			ship_ret_qty(value);
			return;
		}
		if ($re_ship_schd_qty.equalsIgnoreCase(name)) {
			re_ship_schd_qty(value);
			return;
		}
		if ($ship_schd_abort_qty.equalsIgnoreCase(name)) {
			ship_schd_abort_qty(value);
			return;
		}
		if ($sls_schd_abort_qty.equalsIgnoreCase(name)) {
			sls_schd_abort_qty(value);
			return;
		}
		if ($not_dlv_qty.equalsIgnoreCase(name)) {
			not_dlv_qty(value);
			return;
		}
		if ($overdue_prspct_qty.equalsIgnoreCase(name)) {
			overdue_prspct_qty(value);
			return;
		}
		if ($ship_pr_rate.equalsIgnoreCase(name)) {
			ship_pr_rate(value);
			return;
		}
		if ($sls_pr_rate.equalsIgnoreCase(name)) {
			sls_pr_rate(value);
			return;
		}
		if ($act_dlv_lt.equalsIgnoreCase(name)) {
			act_dlv_lt(value);
			return;
		}
		if ($dlv_qty.equalsIgnoreCase(name)) {
			dlv_qty(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($cst_bill_crryovr_times.equalsIgnoreCase(name)) {
			cst_bill_crryovr_times(value);
			return;
		}
		if ($cst_upri_dec_place.equalsIgnoreCase(name)) {
			cst_upri_dec_place(value);
			return;
		}
		if ($cst_amt_dec_place.equalsIgnoreCase(name)) {
			cst_amt_dec_place(value);
			return;
		}
		if ($upri_dec_place.equalsIgnoreCase(name)) {
			upri_dec_place(value);
			return;
		}
		if ($mst_trd_cur_upri.equalsIgnoreCase(name)) {
			mst_trd_cur_upri(value);
			return;
		}
		if ($itm_bill_crryovr_times.equalsIgnoreCase(name)) {
			itm_bill_crryovr_times(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($slo_rev.equalsIgnoreCase(name)) {
			slo_rev(value);
			return;
		}
		if ($qtn_rev.equalsIgnoreCase(name)) {
			qtn_rev(value);
			return;
		}
		if ($slo_d_rev.equalsIgnoreCase(name)) {
			slo_d_rev(value);
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
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($base_cur_upri.equalsIgnoreCase(name)) {
			base_cur_upri(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			base_cur_inc_tax_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($ptax_xrate.equalsIgnoreCase(name)) {
			ptax_xrate(value);
			return;
		}
		if ($ptax_cur_upri.equalsIgnoreCase(name)) {
			ptax_cur_upri(value);
			return;
		}
		if ($ptax_cur_amt.equalsIgnoreCase(name)) {
			ptax_cur_amt(value);
			return;
		}
		if ($ptax_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			ptax_cur_inc_tax_amt(value);
			return;
		}
		if ($ptax_cur_tax_amt.equalsIgnoreCase(name)) {
			ptax_cur_tax_amt(value);
			return;
		}
		if ($prof_rate.equalsIgnoreCase(name)) {
			prof_rate(value);
			return;
		}
		if ($adv_bill_amt.equalsIgnoreCase(name)) {
			adv_bill_amt(value);
			return;
		}
		if ($adv_rcv_amt.equalsIgnoreCase(name)) {
			adv_rcv_amt(value);
			return;
		}
		if ($cst_po_rev.equalsIgnoreCase(name)) {
			cst_po_rev(value);
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
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($edi_sub_num1.equalsIgnoreCase(name)) {
			edi_sub_num1(value);
			return;
		}
		if ($hdr_grp_no.equalsIgnoreCase(name)) {
			hdr_grp_no(value);
			return;
		}
		if ($alloc_margin_days.equalsIgnoreCase(name)) {
			alloc_margin_days(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_base_qty(value);
			return;
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_qty(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
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
		if ($cost_upri.equalsIgnoreCase(name)) {
			cost_upri(value);
			return;
		}
		if ($cost_amt.equalsIgnoreCase(name)) {
			cost_amt(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
			return;
		}
		if ($iv_upri.equalsIgnoreCase(name)) {
			iv_upri(value);
			return;
		}
		if ($iv_amt.equalsIgnoreCase(name)) {
			iv_amt(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($wtax_amt.equalsIgnoreCase(name)) {
			wtax_amt(value);
			return;
		}
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			bill_crryovr_times(value);
			return;
		}
		if ($set_itm_grp_no.equalsIgnoreCase(name)) {
			set_itm_grp_no(value);
			return;
		}
		if ($edi_sub_d_num1.equalsIgnoreCase(name)) {
			edi_sub_d_num1(value);
			return;
		}
		if ($ship_pr_upd_cntr.equalsIgnoreCase(name)) {
			ship_pr_upd_cntr(value);
			return;
		}
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($ship_pr_base_unit_qty.equalsIgnoreCase(name)) {
			ship_pr_base_unit_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($prms_qty.equalsIgnoreCase(name)) {
			prms_qty(value);
			return;
		}
		if ($dlv_inst_rcpt_qty.equalsIgnoreCase(name)) {
			dlv_inst_rcpt_qty(value);
			return;
		}
		if ($dlv_inst_prms_qty.equalsIgnoreCase(name)) {
			dlv_inst_prms_qty(value);
			return;
		}
		if ($alloc_qty.equalsIgnoreCase(name)) {
			alloc_qty(value);
			return;
		}
		if ($wait_qty.equalsIgnoreCase(name)) {
			wait_qty(value);
			return;
		}
		if ($ship_inst_qty.equalsIgnoreCase(name)) {
			ship_inst_qty(value);
			return;
		}
		if ($ship_act_qty.equalsIgnoreCase(name)) {
			ship_act_qty(value);
			return;
		}
		if ($iv_schd_qty.equalsIgnoreCase(name)) {
			iv_schd_qty(value);
			return;
		}
		if ($iv_act_qty.equalsIgnoreCase(name)) {
			iv_act_qty(value);
			return;
		}
		if ($sls_qty.equalsIgnoreCase(name)) {
			sls_qty(value);
			return;
		}
		if ($ship_ret_qty.equalsIgnoreCase(name)) {
			ship_ret_qty(value);
			return;
		}
		if ($re_ship_schd_qty.equalsIgnoreCase(name)) {
			re_ship_schd_qty(value);
			return;
		}
		if ($ship_schd_abort_qty.equalsIgnoreCase(name)) {
			ship_schd_abort_qty(value);
			return;
		}
		if ($sls_schd_abort_qty.equalsIgnoreCase(name)) {
			sls_schd_abort_qty(value);
			return;
		}
		if ($not_dlv_qty.equalsIgnoreCase(name)) {
			not_dlv_qty(value);
			return;
		}
		if ($overdue_prspct_qty.equalsIgnoreCase(name)) {
			overdue_prspct_qty(value);
			return;
		}
		if ($ship_pr_rate.equalsIgnoreCase(name)) {
			ship_pr_rate(value);
			return;
		}
		if ($sls_pr_rate.equalsIgnoreCase(name)) {
			sls_pr_rate(value);
			return;
		}
		if ($act_dlv_lt.equalsIgnoreCase(name)) {
			act_dlv_lt(value);
			return;
		}
		if ($dlv_qty.equalsIgnoreCase(name)) {
			dlv_qty(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($cst_bill_crryovr_times.equalsIgnoreCase(name)) {
			cst_bill_crryovr_times(value);
			return;
		}
		if ($cst_upri_dec_place.equalsIgnoreCase(name)) {
			cst_upri_dec_place(value);
			return;
		}
		if ($cst_amt_dec_place.equalsIgnoreCase(name)) {
			cst_amt_dec_place(value);
			return;
		}
		if ($upri_dec_place.equalsIgnoreCase(name)) {
			upri_dec_place(value);
			return;
		}
		if ($mst_trd_cur_upri.equalsIgnoreCase(name)) {
			mst_trd_cur_upri(value);
			return;
		}
		if ($itm_bill_crryovr_times.equalsIgnoreCase(name)) {
			itm_bill_crryovr_times(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($slo_rev.equalsIgnoreCase(name)) {
			slo_rev(value);
			return;
		}
		if ($qtn_rev.equalsIgnoreCase(name)) {
			qtn_rev(value);
			return;
		}
		if ($slo_d_rev.equalsIgnoreCase(name)) {
			slo_d_rev(value);
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
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($base_cur_upri.equalsIgnoreCase(name)) {
			base_cur_upri(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			base_cur_inc_tax_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($ptax_xrate.equalsIgnoreCase(name)) {
			ptax_xrate(value);
			return;
		}
		if ($ptax_cur_upri.equalsIgnoreCase(name)) {
			ptax_cur_upri(value);
			return;
		}
		if ($ptax_cur_amt.equalsIgnoreCase(name)) {
			ptax_cur_amt(value);
			return;
		}
		if ($ptax_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			ptax_cur_inc_tax_amt(value);
			return;
		}
		if ($ptax_cur_tax_amt.equalsIgnoreCase(name)) {
			ptax_cur_tax_amt(value);
			return;
		}
		if ($prof_rate.equalsIgnoreCase(name)) {
			prof_rate(value);
			return;
		}
		if ($adv_bill_amt.equalsIgnoreCase(name)) {
			adv_bill_amt(value);
			return;
		}
		if ($adv_rcv_amt.equalsIgnoreCase(name)) {
			adv_rcv_amt(value);
			return;
		}
		if ($cst_po_rev.equalsIgnoreCase(name)) {
			cst_po_rev(value);
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
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($edi_sub_num1.equalsIgnoreCase(name)) {
			edi_sub_num1(value);
			return;
		}
		if ($hdr_grp_no.equalsIgnoreCase(name)) {
			hdr_grp_no(value);
			return;
		}
		if ($alloc_margin_days.equalsIgnoreCase(name)) {
			alloc_margin_days(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_base_qty(value);
			return;
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_qty(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
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
		if ($cost_upri.equalsIgnoreCase(name)) {
			cost_upri(value);
			return;
		}
		if ($cost_amt.equalsIgnoreCase(name)) {
			cost_amt(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
			return;
		}
		if ($iv_upri.equalsIgnoreCase(name)) {
			iv_upri(value);
			return;
		}
		if ($iv_amt.equalsIgnoreCase(name)) {
			iv_amt(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($wtax_amt.equalsIgnoreCase(name)) {
			wtax_amt(value);
			return;
		}
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			bill_crryovr_times(value);
			return;
		}
		if ($set_itm_grp_no.equalsIgnoreCase(name)) {
			set_itm_grp_no(value);
			return;
		}
		if ($edi_sub_d_num1.equalsIgnoreCase(name)) {
			edi_sub_d_num1(value);
			return;
		}
		if ($ship_pr_upd_cntr.equalsIgnoreCase(name)) {
			ship_pr_upd_cntr(value);
			return;
		}
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($ship_pr_base_unit_qty.equalsIgnoreCase(name)) {
			ship_pr_base_unit_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($prms_qty.equalsIgnoreCase(name)) {
			prms_qty(value);
			return;
		}
		if ($dlv_inst_rcpt_qty.equalsIgnoreCase(name)) {
			dlv_inst_rcpt_qty(value);
			return;
		}
		if ($dlv_inst_prms_qty.equalsIgnoreCase(name)) {
			dlv_inst_prms_qty(value);
			return;
		}
		if ($alloc_qty.equalsIgnoreCase(name)) {
			alloc_qty(value);
			return;
		}
		if ($wait_qty.equalsIgnoreCase(name)) {
			wait_qty(value);
			return;
		}
		if ($ship_inst_qty.equalsIgnoreCase(name)) {
			ship_inst_qty(value);
			return;
		}
		if ($ship_act_qty.equalsIgnoreCase(name)) {
			ship_act_qty(value);
			return;
		}
		if ($iv_schd_qty.equalsIgnoreCase(name)) {
			iv_schd_qty(value);
			return;
		}
		if ($iv_act_qty.equalsIgnoreCase(name)) {
			iv_act_qty(value);
			return;
		}
		if ($sls_qty.equalsIgnoreCase(name)) {
			sls_qty(value);
			return;
		}
		if ($ship_ret_qty.equalsIgnoreCase(name)) {
			ship_ret_qty(value);
			return;
		}
		if ($re_ship_schd_qty.equalsIgnoreCase(name)) {
			re_ship_schd_qty(value);
			return;
		}
		if ($ship_schd_abort_qty.equalsIgnoreCase(name)) {
			ship_schd_abort_qty(value);
			return;
		}
		if ($sls_schd_abort_qty.equalsIgnoreCase(name)) {
			sls_schd_abort_qty(value);
			return;
		}
		if ($not_dlv_qty.equalsIgnoreCase(name)) {
			not_dlv_qty(value);
			return;
		}
		if ($overdue_prspct_qty.equalsIgnoreCase(name)) {
			overdue_prspct_qty(value);
			return;
		}
		if ($ship_pr_rate.equalsIgnoreCase(name)) {
			ship_pr_rate(value);
			return;
		}
		if ($sls_pr_rate.equalsIgnoreCase(name)) {
			sls_pr_rate(value);
			return;
		}
		if ($act_dlv_lt.equalsIgnoreCase(name)) {
			act_dlv_lt(value);
			return;
		}
		if ($dlv_qty.equalsIgnoreCase(name)) {
			dlv_qty(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($cst_bill_crryovr_times.equalsIgnoreCase(name)) {
			cst_bill_crryovr_times(value);
			return;
		}
		if ($cst_upri_dec_place.equalsIgnoreCase(name)) {
			cst_upri_dec_place(value);
			return;
		}
		if ($cst_amt_dec_place.equalsIgnoreCase(name)) {
			cst_amt_dec_place(value);
			return;
		}
		if ($upri_dec_place.equalsIgnoreCase(name)) {
			upri_dec_place(value);
			return;
		}
		if ($mst_trd_cur_upri.equalsIgnoreCase(name)) {
			mst_trd_cur_upri(value);
			return;
		}
		if ($itm_bill_crryovr_times.equalsIgnoreCase(name)) {
			itm_bill_crryovr_times(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($slo_rev.equalsIgnoreCase(name)) {
			slo_rev(value);
			return;
		}
		if ($qtn_rev.equalsIgnoreCase(name)) {
			qtn_rev(value);
			return;
		}
		if ($slo_d_rev.equalsIgnoreCase(name)) {
			slo_d_rev(value);
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
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($base_cur_upri.equalsIgnoreCase(name)) {
			base_cur_upri(value);
			return;
		}
		if ($base_cur_amt.equalsIgnoreCase(name)) {
			base_cur_amt(value);
			return;
		}
		if ($base_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			base_cur_inc_tax_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($ptax_xrate.equalsIgnoreCase(name)) {
			ptax_xrate(value);
			return;
		}
		if ($ptax_cur_upri.equalsIgnoreCase(name)) {
			ptax_cur_upri(value);
			return;
		}
		if ($ptax_cur_amt.equalsIgnoreCase(name)) {
			ptax_cur_amt(value);
			return;
		}
		if ($ptax_cur_inc_tax_amt.equalsIgnoreCase(name)) {
			ptax_cur_inc_tax_amt(value);
			return;
		}
		if ($ptax_cur_tax_amt.equalsIgnoreCase(name)) {
			ptax_cur_tax_amt(value);
			return;
		}
		if ($prof_rate.equalsIgnoreCase(name)) {
			prof_rate(value);
			return;
		}
		if ($adv_bill_amt.equalsIgnoreCase(name)) {
			adv_bill_amt(value);
			return;
		}
		if ($adv_rcv_amt.equalsIgnoreCase(name)) {
			adv_rcv_amt(value);
			return;
		}
		if ($cst_po_rev.equalsIgnoreCase(name)) {
			cst_po_rev(value);
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
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($edi_sub_num1.equalsIgnoreCase(name)) {
			edi_sub_num1(value);
			return;
		}
		if ($hdr_grp_no.equalsIgnoreCase(name)) {
			hdr_grp_no(value);
			return;
		}
		if ($alloc_margin_days.equalsIgnoreCase(name)) {
			alloc_margin_days(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($trd_unit_dec_place.equalsIgnoreCase(name)) {
			trd_unit_dec_place(value);
			return;
		}
		if ($trd_unit_conv_base_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_base_qty(value);
			return;
		}
		if ($trd_unit_conv_qty.equalsIgnoreCase(name)) {
			trd_unit_conv_qty(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
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
		if ($cost_upri.equalsIgnoreCase(name)) {
			cost_upri(value);
			return;
		}
		if ($cost_amt.equalsIgnoreCase(name)) {
			cost_amt(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
			return;
		}
		if ($iv_upri.equalsIgnoreCase(name)) {
			iv_upri(value);
			return;
		}
		if ($iv_amt.equalsIgnoreCase(name)) {
			iv_amt(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($wtax_amt.equalsIgnoreCase(name)) {
			wtax_amt(value);
			return;
		}
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			bill_crryovr_times(value);
			return;
		}
		if ($set_itm_grp_no.equalsIgnoreCase(name)) {
			set_itm_grp_no(value);
			return;
		}
		if ($edi_sub_d_num1.equalsIgnoreCase(name)) {
			edi_sub_d_num1(value);
			return;
		}
		if ($ship_pr_upd_cntr.equalsIgnoreCase(name)) {
			ship_pr_upd_cntr(value);
			return;
		}
		if ($hdr_peg_no.equalsIgnoreCase(name)) {
			hdr_peg_no(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($ship_pr_base_unit_qty.equalsIgnoreCase(name)) {
			ship_pr_base_unit_qty(value);
			return;
		}
		if ($base_unit_dec_place.equalsIgnoreCase(name)) {
			base_unit_dec_place(value);
			return;
		}
		if ($prms_qty.equalsIgnoreCase(name)) {
			prms_qty(value);
			return;
		}
		if ($dlv_inst_rcpt_qty.equalsIgnoreCase(name)) {
			dlv_inst_rcpt_qty(value);
			return;
		}
		if ($dlv_inst_prms_qty.equalsIgnoreCase(name)) {
			dlv_inst_prms_qty(value);
			return;
		}
		if ($alloc_qty.equalsIgnoreCase(name)) {
			alloc_qty(value);
			return;
		}
		if ($wait_qty.equalsIgnoreCase(name)) {
			wait_qty(value);
			return;
		}
		if ($ship_inst_qty.equalsIgnoreCase(name)) {
			ship_inst_qty(value);
			return;
		}
		if ($ship_act_qty.equalsIgnoreCase(name)) {
			ship_act_qty(value);
			return;
		}
		if ($iv_schd_qty.equalsIgnoreCase(name)) {
			iv_schd_qty(value);
			return;
		}
		if ($iv_act_qty.equalsIgnoreCase(name)) {
			iv_act_qty(value);
			return;
		}
		if ($sls_qty.equalsIgnoreCase(name)) {
			sls_qty(value);
			return;
		}
		if ($ship_ret_qty.equalsIgnoreCase(name)) {
			ship_ret_qty(value);
			return;
		}
		if ($re_ship_schd_qty.equalsIgnoreCase(name)) {
			re_ship_schd_qty(value);
			return;
		}
		if ($ship_schd_abort_qty.equalsIgnoreCase(name)) {
			ship_schd_abort_qty(value);
			return;
		}
		if ($sls_schd_abort_qty.equalsIgnoreCase(name)) {
			sls_schd_abort_qty(value);
			return;
		}
		if ($not_dlv_qty.equalsIgnoreCase(name)) {
			not_dlv_qty(value);
			return;
		}
		if ($overdue_prspct_qty.equalsIgnoreCase(name)) {
			overdue_prspct_qty(value);
			return;
		}
		if ($ship_pr_rate.equalsIgnoreCase(name)) {
			ship_pr_rate(value);
			return;
		}
		if ($sls_pr_rate.equalsIgnoreCase(name)) {
			sls_pr_rate(value);
			return;
		}
		if ($act_dlv_lt.equalsIgnoreCase(name)) {
			act_dlv_lt(value);
			return;
		}
		if ($dlv_qty.equalsIgnoreCase(name)) {
			dlv_qty(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($cst_bill_crryovr_times.equalsIgnoreCase(name)) {
			cst_bill_crryovr_times(value);
			return;
		}
		if ($cst_upri_dec_place.equalsIgnoreCase(name)) {
			cst_upri_dec_place(value);
			return;
		}
		if ($cst_amt_dec_place.equalsIgnoreCase(name)) {
			cst_amt_dec_place(value);
			return;
		}
		if ($upri_dec_place.equalsIgnoreCase(name)) {
			upri_dec_place(value);
			return;
		}
		if ($mst_trd_cur_upri.equalsIgnoreCase(name)) {
			mst_trd_cur_upri(value);
			return;
		}
		if ($itm_bill_crryovr_times.equalsIgnoreCase(name)) {
			itm_bill_crryovr_times(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($slo_dt.equalsIgnoreCase(name)) {
			slo_dt(value);
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
		if ($rcpt_dt.equalsIgnoreCase(name)) {
			rcpt_dt(value);
			return;
		}
		if ($edi_sub_dt1.equalsIgnoreCase(name)) {
			edi_sub_dt1(value);
			return;
		}
		if ($ship_rqst_tm.equalsIgnoreCase(name)) {
			ship_rqst_tm(value);
			return;
		}
		if ($ship_rqst_dt.equalsIgnoreCase(name)) {
			ship_rqst_dt(value);
			return;
		}
		if ($ship_rqst_hm.equalsIgnoreCase(name)) {
			ship_rqst_hm(value);
			return;
		}
		if ($dlv_rqst_tm.equalsIgnoreCase(name)) {
			dlv_rqst_tm(value);
			return;
		}
		if ($dlv_rqst_dt.equalsIgnoreCase(name)) {
			dlv_rqst_dt(value);
			return;
		}
		if ($dlv_rqst_hm.equalsIgnoreCase(name)) {
			dlv_rqst_hm(value);
			return;
		}
		if ($pd_inst_dlv_dt.equalsIgnoreCase(name)) {
			pd_inst_dlv_dt(value);
			return;
		}
		if ($pd_inst_dlv_hm.equalsIgnoreCase(name)) {
			pd_inst_dlv_hm(value);
			return;
		}
		if ($accpt_schd_dt.equalsIgnoreCase(name)) {
			accpt_schd_dt(value);
			return;
		}
		if ($sls_schd_dt.equalsIgnoreCase(name)) {
			sls_schd_dt(value);
			return;
		}
		if ($ship_schd_tm.equalsIgnoreCase(name)) {
			ship_schd_tm(value);
			return;
		}
		if ($ship_schd_dt.equalsIgnoreCase(name)) {
			ship_schd_dt(value);
			return;
		}
		if ($ship_schd_hm.equalsIgnoreCase(name)) {
			ship_schd_hm(value);
			return;
		}
		if ($dlv_schd_tm.equalsIgnoreCase(name)) {
			dlv_schd_tm(value);
			return;
		}
		if ($dlv_schd_dt.equalsIgnoreCase(name)) {
			dlv_schd_dt(value);
			return;
		}
		if ($dlv_schd_hm.equalsIgnoreCase(name)) {
			dlv_schd_hm(value);
			return;
		}
		if ($rqst_dt.equalsIgnoreCase(name)) {
			rqst_dt(value);
			return;
		}
		if ($rqst_dlv_rqst_dt.equalsIgnoreCase(name)) {
			rqst_dlv_rqst_dt(value);
			return;
		}
		if ($rqst_prms_dt.equalsIgnoreCase(name)) {
			rqst_prms_dt(value);
			return;
		}
		if ($rqst_prms_dlv_dt.equalsIgnoreCase(name)) {
			rqst_prms_dlv_dt(value);
			return;
		}
		if ($edi_sub_d_dt1.equalsIgnoreCase(name)) {
			edi_sub_d_dt1(value);
			return;
		}
		if ($prms_dt.equalsIgnoreCase(name)) {
			prms_dt(value);
			return;
		}
		if ($dlv_inst_rcpt_dt.equalsIgnoreCase(name)) {
			dlv_inst_rcpt_dt(value);
			return;
		}
		if ($dlv_inst_prms_dt.equalsIgnoreCase(name)) {
			dlv_inst_prms_dt(value);
			return;
		}
		if ($dlv_inst_dt.equalsIgnoreCase(name)) {
			dlv_inst_dt(value);
			return;
		}
		if ($dlv_inst_hm.equalsIgnoreCase(name)) {
			dlv_inst_hm(value);
			return;
		}
		if ($prms_dlv_dt.equalsIgnoreCase(name)) {
			prms_dlv_dt(value);
			return;
		}
		if ($ship_dt.equalsIgnoreCase(name)) {
			ship_dt(value);
			return;
		}
		if ($ship_hm.equalsIgnoreCase(name)) {
			ship_hm(value);
			return;
		}
		if ($dlv_dt.equalsIgnoreCase(name)) {
			dlv_dt(value);
			return;
		}
		if ($dlv_hm.equalsIgnoreCase(name)) {
			dlv_hm(value);
			return;
		}
		if ($sls_dt.equalsIgnoreCase(name)) {
			sls_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		if ($qtn_aprv_flg.equalsIgnoreCase(name)) {
			qtn_aprv_flg(value);
			return;
		}
		if ($can_upd_flg.equalsIgnoreCase(name)) {
			can_upd_flg(value);
			return;
		}
		if ($can_del_flg.equalsIgnoreCase(name)) {
			can_del_flg(value);
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
		if ($ptax_xrate_inpt_flg.equalsIgnoreCase(name)) {
			ptax_xrate_inpt_flg(value);
			return;
		}
		if ($iv_num_flg.equalsIgnoreCase(name)) {
			iv_num_flg(value);
			return;
		}
		if ($edi_flg.equalsIgnoreCase(name)) {
			edi_flg(value);
			return;
		}
		if ($is_src_batch_flg.equalsIgnoreCase(name)) {
			is_src_batch_flg(value);
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
		if ($can_flg.equalsIgnoreCase(name)) {
			can_flg(value);
			return;
		}
		if ($hdr_err_flg.equalsIgnoreCase(name)) {
			hdr_err_flg(value);
			return;
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			abort_flg(value);
			return;
		}
		if ($vmi_flg.equalsIgnoreCase(name)) {
			vmi_flg(value);
			return;
		}
		if ($dscnt_itm_flg.equalsIgnoreCase(name)) {
			dscnt_itm_flg(value);
			return;
		}
		if ($sundry_itm_flg.equalsIgnoreCase(name)) {
			sundry_itm_flg(value);
			return;
		}
		if ($upri_not_tgt_flg.equalsIgnoreCase(name)) {
			upri_not_tgt_flg(value);
			return;
		}
		if ($interim_flg.equalsIgnoreCase(name)) {
			interim_flg(value);
			return;
		}
		if ($tax_fix_flg.equalsIgnoreCase(name)) {
			tax_fix_flg(value);
			return;
		}
		if ($inc_tax_flg.equalsIgnoreCase(name)) {
			inc_tax_flg(value);
			return;
		}
		if ($sno_num_flg.equalsIgnoreCase(name)) {
			sno_num_flg(value);
			return;
		}
		if ($sno1_null_flg.equalsIgnoreCase(name)) {
			sno1_null_flg(value);
			return;
		}
		if ($sno2_null_flg.equalsIgnoreCase(name)) {
			sno2_null_flg(value);
			return;
		}
		if ($sno3_null_flg.equalsIgnoreCase(name)) {
			sno3_null_flg(value);
			return;
		}
		if ($sno4_null_flg.equalsIgnoreCase(name)) {
			sno4_null_flg(value);
			return;
		}
		if ($slo_sno1_flg.equalsIgnoreCase(name)) {
			slo_sno1_flg(value);
			return;
		}
		if ($slo_sno2_flg.equalsIgnoreCase(name)) {
			slo_sno2_flg(value);
			return;
		}
		if ($slo_sno3_flg.equalsIgnoreCase(name)) {
			slo_sno3_flg(value);
			return;
		}
		if ($slo_sno4_flg.equalsIgnoreCase(name)) {
			slo_sno4_flg(value);
			return;
		}
		if ($ship_schd_split_flg.equalsIgnoreCase(name)) {
			ship_schd_split_flg(value);
			return;
		}
		if ($ship_abl_flg.equalsIgnoreCase(name)) {
			ship_abl_flg(value);
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
		if ($tdlv_req_flg.equalsIgnoreCase(name)) {
			tdlv_req_flg(value);
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
		if ($not_lg_mix_flg.equalsIgnoreCase(name)) {
			not_lg_mix_flg(value);
			return;
		}
		if ($str_ln_tgt_flg.equalsIgnoreCase(name)) {
			str_ln_tgt_flg(value);
			return;
		}
		if ($str_ln_cd_none_flg.equalsIgnoreCase(name)) {
			str_ln_cd_none_flg(value);
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
		if ($ver_flg.equalsIgnoreCase(name)) {
			ver_flg(value);
			return;
		}
		if ($ship_block_flg.equalsIgnoreCase(name)) {
			ship_block_flg(value);
			return;
		}
		if ($sls_acxfr_flg.equalsIgnoreCase(name)) {
			sls_acxfr_flg(value);
			return;
		}
		if ($not_dt_calc_flg.equalsIgnoreCase(name)) {
			not_dt_calc_flg(value);
			return;
		}
		if ($slo_d_can_flg.equalsIgnoreCase(name)) {
			slo_d_can_flg(value);
			return;
		}
		if ($dtl_err_flg.equalsIgnoreCase(name)) {
			dtl_err_flg(value);
			return;
		}
		if ($upd_cntr_not_chk_flg.equalsIgnoreCase(name)) {
			upd_cntr_not_chk_flg(value);
			return;
		}
		if ($ship_cmpl_flg.equalsIgnoreCase(name)) {
			ship_cmpl_flg(value);
			return;
		}
		if ($sls_cmpl_flg.equalsIgnoreCase(name)) {
			sls_cmpl_flg(value);
			return;
		}
		if ($pack_flg.equalsIgnoreCase(name)) {
			pack_flg(value);
			return;
		}
		if ($fix_flg.equalsIgnoreCase(name)) {
			fix_flg(value);
			return;
		}
		if ($re_ship_schd_flg.equalsIgnoreCase(name)) {
			re_ship_schd_flg(value);
			return;
		}
		if ($dlv_rqst_dt_overdue_act_flg.equalsIgnoreCase(name)) {
			dlv_rqst_dt_overdue_act_flg(value);
			return;
		}
		if ($prms_dlv_dt_overdue_act_flg.equalsIgnoreCase(name)) {
			prms_dlv_dt_overdue_act_flg(value);
			return;
		}
		if ($bd_dpt_flg.equalsIgnoreCase(name)) {
			bd_dpt_flg(value);
			return;
		}
		if ($cst_sls_upri_cng_flg.equalsIgnoreCase(name)) {
			cst_sls_upri_cng_flg(value);
			return;
		}
		if ($mst_interim_flg.equalsIgnoreCase(name)) {
			mst_interim_flg(value);
			return;
		}
		if ($itm_sls_upri_cng_flg.equalsIgnoreCase(name)) {
			itm_sls_upri_cng_flg(value);
			return;
		}
		if ($slo_proc_flg.equalsIgnoreCase(name)) {
			slo_proc_flg(value);
			return;
		}
		if ($qtn_no_copy_flg.equalsIgnoreCase(name)) {
			qtn_no_copy_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

