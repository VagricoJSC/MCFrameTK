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
 * ブロック"Slo_Upd01_Hdr"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Slo_Upd01_HdrR_MC_A extends MCConstRow {

	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public static final String $data_crud_typ = "data_crud_typ";
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
	 * Sales order type 受注区分.<p>
	 *
	 */
	public static final String $slo_typ = "slo_typ";
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
	 * Sales order date 受注日.<p>
	 *
	 */
	public static final String $slo_dt = "slo_dt";
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
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public static final String $cst_cd = "cst_cd";
	/**
	 * Revenue recording type 売上計上区分.<p>
	 *
	 */
	public static final String $sls_basis_typ = "sls_basis_typ";
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
	 * Assortment type 品揃区分.<p>
	 *
	 */
	public static final String $assort_typ = "assort_typ";
	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public static final String $trd_cur_cd = "trd_cur_cd";
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
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public static final String $wrk_no = "wrk_no";
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
	 * AR dept. cd. 債権部門ＣＤ.<p>
	 *
	 */
	public static final String $ar_dpt_cd = "ar_dpt_cd";
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
	 * EDI_ ＥＤＩ_.<p>
	 *
	 */
	public static final String $edi_flg = "edi_flg";
	/**
	 * Invoice transaction インボイス取引.<p>
	 *
	 */
	public static final String $cst_iv_flg = "cst_iv_flg";
	/**
	 * Country cd. 国ＣＤ.<p>
	 *
	 */
	public static final String $cntry_cd = "cntry_cd";
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
	 * Error エラー.<p>
	 *
	 */
	public static final String $err_flg = "err_flg";
	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public static final String $peg_no = "peg_no";
	/**
	 * Not for update counter check 更新カウンタチェック対象外.<p>
	 *
	 */
	public static final String $upd_cntr_not_chk_flg = "upd_cntr_not_chk_flg";
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


	public static final MCMeta data_crud_typ_META = createCommonMeta($data_crud_typ, mcframe.commonMA.meta.MA_META.DATA_CRUD_TYP);
	public static final MCMeta slo_no_META = createCommonMeta($slo_no, mcframe.commonMA.meta.MA_META.SLO_NO);
	public static final MCMeta slo_rev_META = createCommonMeta($slo_rev, mcframe.commonMA.meta.MA_META.SLIP_REV);
	public static final MCMeta trd_cd_META = createCommonMeta($trd_cd, mcframe.commonMA.meta.MA_META.TRD_CD);
	public static final MCMeta trd_ptn_typ_META = createCommonMeta($trd_ptn_typ, mcframe.commonMA.meta.MA_META.TRD_PTN_TYP);
	public static final MCMeta slo_typ_META = createCommonMeta($slo_typ, mcframe.commonMS.meta.MS_META.SLO_TYP);
	public static final MCMeta aprv_flg_META = createCommonMeta($aprv_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta aprv_back_flg_META = createCommonMeta($aprv_back_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta aprv_no_META = createCommonMeta($aprv_no, mcframe.commonMA.meta.MA_META.APRV_NO);
	public static final MCMeta aprv_sts_typ_META = createCommonMeta($aprv_sts_typ, mcframe.commonMA.meta.MA_META.APRV_STS_TYP);
	public static final MCMeta slo_dt_META = createCommonMeta($slo_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta can_upd_flg_META = createCommonMeta($can_upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta can_del_flg_META = createCommonMeta($can_del_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta qtn_no_META = createCommonMeta($qtn_no, mcframe.commonMA.meta.MA_META.QTN_NO);
	public static final MCMeta qtn_rev_META = createCommonMeta($qtn_rev, mcframe.commonMA.meta.MA_META.SLIP_REV);
	public static final MCMeta qtn_aprv_flg_META = createCommonMeta($qtn_aprv_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta qtn_aprv_no_META = createCommonMeta($qtn_aprv_no, mcframe.commonMA.meta.MA_META.APRV_NO);
	public static final MCMeta cst_cd_META = createCommonMeta($cst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta sls_basis_typ_META = createCommonMeta($sls_basis_typ, mcframe.commonMA.meta.MA_META.SLS_BASIS_TYP);
	public static final MCMeta sls_usr_cd_META = createCommonMeta($sls_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta sls_dpt_cd_META = createCommonMeta($sls_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta assort_typ_META = createCommonMeta($assort_typ, mcframe.commonMS.meta.MS_META.SHIP_ASSORT_TYP);
	public static final MCMeta trd_cur_cd_META = createCommonMeta($trd_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta xrate_inpt_flg_META = createCommonMeta($xrate_inpt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta xrate_META = createCommonMeta($xrate, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta ptax_xrate_inpt_flg_META = createCommonMeta($ptax_xrate_inpt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ptax_xrate_META = createCommonMeta($ptax_xrate, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta wrk_no_META = createCommonMeta($wrk_no, mcframe.commonMA.meta.MA_META.WRK_NO);
	public static final MCMeta trnspt_cd_META = createCommonMeta($trnspt_cd, mcframe.commonMA.meta.MA_META.TRNSPT_CD);
	public static final MCMeta vssl_flght_META = createCommonMeta($vssl_flght, mcframe.commonMA.meta.MA_META.VSSL_FLGHT);
	public static final MCMeta load_port_cd_META = createCommonMeta($load_port_cd, mcframe.commonMA.meta.MA_META.PORT_CD);
	public static final MCMeta etd_dt_META = createCommonMeta($etd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta dschrg_port_cd_META = createCommonMeta($dschrg_port_cd, mcframe.commonMA.meta.MA_META.PORT_CD);
	public static final MCMeta eta_dt_META = createCommonMeta($eta_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta via_port_cd_META = createCommonMeta($via_port_cd, mcframe.commonMA.meta.MA_META.PORT_CD);
	public static final MCMeta via_schd_dt_META = createCommonMeta($via_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta iv_no_META = createCommonMeta($iv_no, mcframe.commonMA.meta.MA_META.IV_NO);
	public static final MCMeta iv_num_flg_META = createCommonMeta($iv_num_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta adv_ship_ctrl_typ_META = createCommonMeta($adv_ship_ctrl_typ, mcframe.commonMS.meta.MS_META.ADV_SHIP_CTRL_TYP);
	public static final MCMeta adv_bill_amt_META = createCommonMeta($adv_bill_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta adv_rcv_amt_META = createCommonMeta($adv_rcv_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta tterm_cd1_META = createCommonMeta($tterm_cd1, mcframe.commonMA.meta.MA_META.TTERM_CD);
	public static final MCMeta tterm_rmrks1_META = createCommonMeta($tterm_rmrks1, mcframe.commonMS.meta.MS_META.TTERM_RMRKS1);
	public static final MCMeta tterm_cd2_META = createCommonMeta($tterm_cd2, mcframe.commonMA.meta.MA_META.TTERM_CD);
	public static final MCMeta tterm_rmrks2_META = createCommonMeta($tterm_rmrks2, mcframe.commonMS.meta.MS_META.TTERM_RMRKS2);
	public static final MCMeta tterm_cd3_META = createCommonMeta($tterm_cd3, mcframe.commonMA.meta.MA_META.TTERM_CD);
	public static final MCMeta tterm_rmrks3_META = createCommonMeta($tterm_rmrks3, mcframe.commonMS.meta.MS_META.TTERM_RMRKS3);
	public static final MCMeta cst_po_no_META = createCommonMeta($cst_po_no, mcframe.commonMA.meta.MA_META.CST_PO_NO);
	public static final MCMeta cst_po_rev_META = createCommonMeta($cst_po_rev, mcframe.commonMA.meta.MA_META.SLIP_REV);
	public static final MCMeta ar_dpt_cd_META = createCommonMeta($ar_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta rcpt_dt_META = createCommonMeta($rcpt_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta rcpt_usr_cd_META = createCommonMeta($rcpt_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta cst_po_rmrks_META = createCommonMeta($cst_po_rmrks, mcframe.commonMS.meta.MS_META.CST_PO_RMRKS);
	public static final MCMeta trd_rmrks_META = createCommonMeta($trd_rmrks, mcframe.commonMA.meta.MA_META.TRD_RMRKS);
	public static final MCMeta intr_rmrks_META = createCommonMeta($intr_rmrks, mcframe.commonMS.meta.MS_META.SLO_INTR_RMRKS);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.SLO_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.SLO_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.SLO_SUB_CHAR3);
	public static final MCMeta edi_flg_META = createCommonMeta($edi_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cst_iv_flg_META = createCommonMeta($cst_iv_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cntry_cd_META = createCommonMeta($cntry_cd, mcframe.commonMA.meta.MA_META.CNTRY_CD);
	public static final MCMeta trd_cur_amt_META = createCommonMeta($trd_cur_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta trd_cur_tax_amt_META = createCommonMeta($trd_cur_tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta old_aprv_flg_META = createCommonMeta($old_aprv_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta old_aprv_no_META = createCommonMeta($old_aprv_no, mcframe.commonMA.meta.MA_META.APRV_NO);
	public static final MCMeta old_aprv_sts_typ_META = createCommonMeta($old_aprv_sts_typ, mcframe.commonMA.meta.MA_META.APRV_STS_TYP);
	public static final MCMeta old_can_upd_flg_META = createCommonMeta($old_can_upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta old_can_del_flg_META = createCommonMeta($old_can_del_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta slo_upd_cntr_META = createCommonMeta($slo_upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);
	public static final MCMeta qtn_upd_cntr_META = createCommonMeta($qtn_upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);
	public static final MCMeta sls_amt_rnd_typ_META = createCommonMeta($sls_amt_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta sls_tax_rnd_typ_META = createCommonMeta($sls_tax_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta amt_dec_place_META = createCommonMeta($amt_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta err_flg_META = createCommonMeta($err_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta upd_cntr_not_chk_flg_META = createCommonMeta($upd_cntr_not_chk_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta is_src_batch_flg_META = createCommonMeta($is_src_batch_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta edi_sub_char1_META = createCommonMeta($edi_sub_char1, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR1);
	public static final MCMeta edi_sub_char2_META = createCommonMeta($edi_sub_char2, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR2);
	public static final MCMeta edi_sub_char3_META = createCommonMeta($edi_sub_char3, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR3);
	public static final MCMeta edi_sub_char4_META = createCommonMeta($edi_sub_char4, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR4);
	public static final MCMeta edi_sub_char5_META = createCommonMeta($edi_sub_char5, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR5);
	public static final MCMeta edi_sub_num1_META = createCommonMeta($edi_sub_num1, mcframe.commonMA.meta.MA_META.IF_SUB_NUM1);
	public static final MCMeta edi_sub_dt1_META = createCommonMeta($edi_sub_dt1, mcframe.commonMA.meta.MA_META.DT);

	protected static final ConstMetaList<Slo_Upd01_HdrR> constMetas = new ConstMetaList<Slo_Upd01_HdrR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			data_crud_typ_META,
			slo_no_META,
			slo_rev_META,
			trd_cd_META,
			trd_ptn_typ_META,
			slo_typ_META,
			aprv_flg_META,
			aprv_back_flg_META,
			aprv_no_META,
			aprv_sts_typ_META,
			slo_dt_META,
			can_upd_flg_META,
			can_del_flg_META,
			qtn_no_META,
			qtn_rev_META,
			qtn_aprv_flg_META,
			qtn_aprv_no_META,
			cst_cd_META,
			sls_basis_typ_META,
			sls_usr_cd_META,
			sls_dpt_cd_META,
			wg_cd_META,
			assort_typ_META,
			trd_cur_cd_META,
			xrate_inpt_flg_META,
			xrate_META,
			ptax_xrate_inpt_flg_META,
			ptax_xrate_META,
			wrk_no_META,
			trnspt_cd_META,
			vssl_flght_META,
			load_port_cd_META,
			etd_dt_META,
			dschrg_port_cd_META,
			eta_dt_META,
			via_port_cd_META,
			via_schd_dt_META,
			iv_no_META,
			iv_num_flg_META,
			adv_ship_ctrl_typ_META,
			adv_bill_amt_META,
			adv_rcv_amt_META,
			tterm_cd1_META,
			tterm_rmrks1_META,
			tterm_cd2_META,
			tterm_rmrks2_META,
			tterm_cd3_META,
			tterm_rmrks3_META,
			cst_po_no_META,
			cst_po_rev_META,
			ar_dpt_cd_META,
			rcpt_dt_META,
			rcpt_usr_cd_META,
			cst_po_rmrks_META,
			trd_rmrks_META,
			intr_rmrks_META,
			sub_char1_META,
			sub_char2_META,
			sub_char3_META,
			edi_flg_META,
			cst_iv_flg_META,
			cntry_cd_META,
			trd_cur_amt_META,
			trd_cur_tax_amt_META,
			old_aprv_flg_META,
			old_aprv_no_META,
			old_aprv_sts_typ_META,
			old_can_upd_flg_META,
			old_can_del_flg_META,
			slo_upd_cntr_META,
			qtn_upd_cntr_META,
			sls_amt_rnd_typ_META,
			sls_tax_rnd_typ_META,
			amt_dec_place_META,
			err_flg_META,
			peg_no_META,
			upd_cntr_not_chk_flg_META,
			is_src_batch_flg_META,
			edi_sub_char1_META,
			edi_sub_char2_META,
			edi_sub_char3_META,
			edi_sub_char4_META,
			edi_sub_char5_META,
			edi_sub_num1_META,
			edi_sub_dt1_META
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
				{$slo_typ, "E"},	// slo_typ
				{$slo_dt, "E"},	// slo_dt
				{$cst_cd, "E"},	// cst_cd
				{$sls_dpt_cd, "E"},	// sls_dpt_cd
				{$assort_typ, "E"}	// assort_typ
			}
		)),
		new MCExtMap.Entry($$CHK_NUM, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$SMALL_LARGE, new MCExtList(
			new String[][]{
				{$adv_bill_amt, "0:"}	// adv_bill_amt
			}
		)),
		new MCExtMap.Entry($$CHK_DT, new MCExtList(
			new String[][]{
				{$slo_dt, "bfToday"}	// slo_dt
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
				{$rcpt_usr_cd, "MA.MAUAL0010.Usr"}	// rcpt_usr_cd
			}
		)),
		new MCExtMap.Entry($$LIST_OUT, new MCExtList(
			new String[][]{
				{$trd_cd, "trd_ptn_typ"},	// trd_cd
				{$cst_cd, "cst_iv_flg;cntry_cd;sls_amt_rnd_typ;sls_tax_rnd_typ"},	// cst_cd
				{$sls_dpt_cd, "wg_cd"},	// sls_dpt_cd
				{$trd_cur_cd, "amt_dec_place"}	// trd_cur_cd
			}
		)),
		new MCExtMap.Entry($$LIST_OUT_BASE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$cst_cd, "MAC_BP_IS_SRCH_TYP.CST_NOT_SUNDRY"},	// cst_cd
				{$sls_dpt_cd, "slo_dt;MAC_DPT_IS_SRCH_TYP.SLS;sls_usr_cd"},	// sls_dpt_cd
				{$ar_dpt_cd, "MAC_DPT_IS_SRCH_TYP.AR;slo_dt"}	// ar_dpt_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$cst_cd, "bp_is_srch_typ"},	// cst_cd
				{$sls_dpt_cd, "dt;dpt_is_srch_typ;usr_cd"},	// sls_dpt_cd
				{$ar_dpt_cd, "dpt_is_srch_typ;dt"}	// ar_dpt_cd
			}
		)),
		new MCExtMap.Entry($$CONST, new MCExtList(
			new String[][]{
				{$slo_typ, "MSC_SLO_TYP"},	// slo_typ
				{$sls_basis_typ, "MAC_SLS_BASIS_TYP"},	// sls_basis_typ
				{$assort_typ, "MSC_SHIP_ASSORT_TYP"},	// assort_typ
				{$adv_ship_ctrl_typ, "MSC_ADV_SHIP_CTRL_TYP"}	// adv_ship_ctrl_typ
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
	protected Slo_Upd01_HdrR_MC_A(ConstMetaList<? extends Slo_Upd01_HdrR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Slo_Upd01_HdrR clone() {
		return (Slo_Upd01_HdrR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Slo_Upd01_HdrR createInstance() {
		return (Slo_Upd01_HdrR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Slo_Upd01_HdrR getValues(String... names) {
		return (Slo_Upd01_HdrR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public String data_crud_typ() {
		return getConstString(offset + 0, $data_crud_typ);
	}

	/**
	 * Data update type データ更新区分.<p>
	 *
	 */
	public void data_crud_typ(String value) {
		setConstString(offset + 0, $data_crud_typ, value);
	}


	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public String slo_no() {
		return getConstString(offset + 1, $slo_no);
	}

	/**
	 * Sales order No. 受注ＮＯ.<p>
	 *
	 */
	public void slo_no(String value) {
		setConstString(offset + 1, $slo_no, value);
	}


	/**
	 * Sales order rev. number 受注改訂番号.<p>
	 *
	 */
	public MCNumber slo_rev() {
		return getConstNumber(offset + 2, $slo_rev);
	}

	/**
	 * Sales order rev. number 受注改訂番号.<p>
	 *
	 */
	public void slo_rev(MCNumber value) {
		setConstNumber(offset + 2, $slo_rev, value);
	}

	/**
	 * Sales order rev. number 受注改訂番号.<p>
	 *
	 */
	public void slo_rev(int value) {
		setConstNumber(offset + 2, $slo_rev, value);
	}

	/**
	 * Sales order rev. number 受注改訂番号.<p>
	 *
	 */
	public void slo_rev(long value) {
		setConstNumber(offset + 2, $slo_rev, value);
	}

	/**
	 * Sales order rev. number 受注改訂番号.<p>
	 *
	 */
	public void slo_rev(float value) {
		setConstNumber(offset + 2, $slo_rev, value);
	}

	/**
	 * Sales order rev. number 受注改訂番号.<p>
	 *
	 */
	public void slo_rev(double value) {
		setConstNumber(offset + 2, $slo_rev, value);
	}


	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public String trd_cd() {
		return getConstString(offset + 3, $trd_cd);
	}

	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public void trd_cd(String value) {
		setConstString(offset + 3, $trd_cd, value);
	}


	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public String trd_ptn_typ() {
		return getConstString(offset + 4, $trd_ptn_typ);
	}

	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public void trd_ptn_typ(String value) {
		setConstString(offset + 4, $trd_ptn_typ, value);
	}


	/**
	 * Sales order type 受注区分.<p>
	 *
	 */
	public String slo_typ() {
		return getConstString(offset + 5, $slo_typ);
	}

	/**
	 * Sales order type 受注区分.<p>
	 *
	 */
	public void slo_typ(String value) {
		setConstString(offset + 5, $slo_typ, value);
	}


	/**
	 * For Approval 承認対象.<p>
	 *
	 */
	public boolean aprv_flg() {
		return getConstBoolean(offset + 6, $aprv_flg);
	}

	/**
	 * For Approval 承認対象.<p>
	 *
	 */
	public void aprv_flg(boolean value) {
		setConstBoolean(offset + 6, $aprv_flg, value);
	}


	/**
	 * Approval withdraw 承認引戻.<p>
	 *
	 */
	public boolean aprv_back_flg() {
		return getConstBoolean(offset + 7, $aprv_back_flg);
	}

	/**
	 * Approval withdraw 承認引戻.<p>
	 *
	 */
	public void aprv_back_flg(boolean value) {
		setConstBoolean(offset + 7, $aprv_back_flg, value);
	}


	/**
	 * Approval No. 承認ＮＯ.<p>
	 *
	 */
	public String aprv_no() {
		return getConstString(offset + 8, $aprv_no);
	}

	/**
	 * Approval No. 承認ＮＯ.<p>
	 *
	 */
	public void aprv_no(String value) {
		setConstString(offset + 8, $aprv_no, value);
	}


	/**
	 * Approval status type 承認状況区分.<p>
	 *
	 */
	public String aprv_sts_typ() {
		return getConstString(offset + 9, $aprv_sts_typ);
	}

	/**
	 * Approval status type 承認状況区分.<p>
	 *
	 */
	public void aprv_sts_typ(String value) {
		setConstString(offset + 9, $aprv_sts_typ, value);
	}


	/**
	 * Sales order date 受注日.<p>
	 *
	 */
	public MCDate slo_dt() {
		return getConstDate(offset + 10, $slo_dt);
	}

	/**
	 * Sales order date 受注日.<p>
	 *
	 */
	public void slo_dt(MCDate value) {
		setConstDate(offset + 10, $slo_dt, value);
	}


	/**
	 * Updatable 更新可能.<p>
	 *
	 */
	public boolean can_upd_flg() {
		return getConstBoolean(offset + 11, $can_upd_flg);
	}

	/**
	 * Updatable 更新可能.<p>
	 *
	 */
	public void can_upd_flg(boolean value) {
		setConstBoolean(offset + 11, $can_upd_flg, value);
	}


	/**
	 * Cancellable 取消可能.<p>
	 *
	 */
	public boolean can_del_flg() {
		return getConstBoolean(offset + 12, $can_del_flg);
	}

	/**
	 * Cancellable 取消可能.<p>
	 *
	 */
	public void can_del_flg(boolean value) {
		setConstBoolean(offset + 12, $can_del_flg, value);
	}


	/**
	 * Quotation No. 見積ＮＯ.<p>
	 *
	 */
	public String qtn_no() {
		return getConstString(offset + 13, $qtn_no);
	}

	/**
	 * Quotation No. 見積ＮＯ.<p>
	 *
	 */
	public void qtn_no(String value) {
		setConstString(offset + 13, $qtn_no, value);
	}


	/**
	 * Quotation rev. number 見積改訂番号.<p>
	 *
	 */
	public MCNumber qtn_rev() {
		return getConstNumber(offset + 14, $qtn_rev);
	}

	/**
	 * Quotation rev. number 見積改訂番号.<p>
	 *
	 */
	public void qtn_rev(MCNumber value) {
		setConstNumber(offset + 14, $qtn_rev, value);
	}

	/**
	 * Quotation rev. number 見積改訂番号.<p>
	 *
	 */
	public void qtn_rev(int value) {
		setConstNumber(offset + 14, $qtn_rev, value);
	}

	/**
	 * Quotation rev. number 見積改訂番号.<p>
	 *
	 */
	public void qtn_rev(long value) {
		setConstNumber(offset + 14, $qtn_rev, value);
	}

	/**
	 * Quotation rev. number 見積改訂番号.<p>
	 *
	 */
	public void qtn_rev(float value) {
		setConstNumber(offset + 14, $qtn_rev, value);
	}

	/**
	 * Quotation rev. number 見積改訂番号.<p>
	 *
	 */
	public void qtn_rev(double value) {
		setConstNumber(offset + 14, $qtn_rev, value);
	}


	/**
	 * For quotation approval 見積承認対象.<p>
	 *
	 */
	public boolean qtn_aprv_flg() {
		return getConstBoolean(offset + 15, $qtn_aprv_flg);
	}

	/**
	 * For quotation approval 見積承認対象.<p>
	 *
	 */
	public void qtn_aprv_flg(boolean value) {
		setConstBoolean(offset + 15, $qtn_aprv_flg, value);
	}


	/**
	 * Quotation approval No. 見積承認ＮＯ.<p>
	 *
	 */
	public String qtn_aprv_no() {
		return getConstString(offset + 16, $qtn_aprv_no);
	}

	/**
	 * Quotation approval No. 見積承認ＮＯ.<p>
	 *
	 */
	public void qtn_aprv_no(String value) {
		setConstString(offset + 16, $qtn_aprv_no, value);
	}


	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public String cst_cd() {
		return getConstString(offset + 17, $cst_cd);
	}

	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public void cst_cd(String value) {
		setConstString(offset + 17, $cst_cd, value);
	}


	/**
	 * Revenue recording type 売上計上区分.<p>
	 *
	 */
	public String sls_basis_typ() {
		return getConstString(offset + 18, $sls_basis_typ);
	}

	/**
	 * Revenue recording type 売上計上区分.<p>
	 *
	 */
	public void sls_basis_typ(String value) {
		setConstString(offset + 18, $sls_basis_typ, value);
	}


	/**
	 * Sales PIC cd. 売上担当者ＣＤ.<p>
	 *
	 */
	public String sls_usr_cd() {
		return getConstString(offset + 19, $sls_usr_cd);
	}

	/**
	 * Sales PIC cd. 売上担当者ＣＤ.<p>
	 *
	 */
	public void sls_usr_cd(String value) {
		setConstString(offset + 19, $sls_usr_cd, value);
	}


	/**
	 * Sales dept. cd. 売上部門ＣＤ.<p>
	 *
	 */
	public String sls_dpt_cd() {
		return getConstString(offset + 20, $sls_dpt_cd);
	}

	/**
	 * Sales dept. cd. 売上部門ＣＤ.<p>
	 *
	 */
	public void sls_dpt_cd(String value) {
		setConstString(offset + 20, $sls_dpt_cd, value);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 21, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 21, $wg_cd, value);
	}


	/**
	 * Assortment type 品揃区分.<p>
	 *
	 */
	public String assort_typ() {
		return getConstString(offset + 22, $assort_typ);
	}

	/**
	 * Assortment type 品揃区分.<p>
	 *
	 */
	public void assort_typ(String value) {
		setConstString(offset + 22, $assort_typ, value);
	}


	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public String trd_cur_cd() {
		return getConstString(offset + 23, $trd_cur_cd);
	}

	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public void trd_cur_cd(String value) {
		setConstString(offset + 23, $trd_cur_cd, value);
	}


	/**
	 * Set exchange rate 為替レート指定.<p>
	 *
	 */
	public boolean xrate_inpt_flg() {
		return getConstBoolean(offset + 24, $xrate_inpt_flg);
	}

	/**
	 * Set exchange rate 為替レート指定.<p>
	 *
	 */
	public void xrate_inpt_flg(boolean value) {
		setConstBoolean(offset + 24, $xrate_inpt_flg, value);
	}


	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public MCNumber xrate() {
		return getConstNumber(offset + 25, $xrate);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(MCNumber value) {
		setConstNumber(offset + 25, $xrate, value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(int value) {
		setConstNumber(offset + 25, $xrate, value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(long value) {
		setConstNumber(offset + 25, $xrate, value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(float value) {
		setConstNumber(offset + 25, $xrate, value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(double value) {
		setConstNumber(offset + 25, $xrate, value);
	}


	/**
	 * Set tax exchange rate 納税為替レート指定.<p>
	 *
	 */
	public boolean ptax_xrate_inpt_flg() {
		return getConstBoolean(offset + 26, $ptax_xrate_inpt_flg);
	}

	/**
	 * Set tax exchange rate 納税為替レート指定.<p>
	 *
	 */
	public void ptax_xrate_inpt_flg(boolean value) {
		setConstBoolean(offset + 26, $ptax_xrate_inpt_flg, value);
	}


	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public MCNumber ptax_xrate() {
		return getConstNumber(offset + 27, $ptax_xrate);
	}

	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public void ptax_xrate(MCNumber value) {
		setConstNumber(offset + 27, $ptax_xrate, value);
	}

	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public void ptax_xrate(int value) {
		setConstNumber(offset + 27, $ptax_xrate, value);
	}

	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public void ptax_xrate(long value) {
		setConstNumber(offset + 27, $ptax_xrate, value);
	}

	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public void ptax_xrate(float value) {
		setConstNumber(offset + 27, $ptax_xrate, value);
	}

	/**
	 * Taxpaying exchange rate 納税為替レート.<p>
	 *
	 */
	public void ptax_xrate(double value) {
		setConstNumber(offset + 27, $ptax_xrate, value);
	}


	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public String wrk_no() {
		return getConstString(offset + 28, $wrk_no);
	}

	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public void wrk_no(String value) {
		setConstString(offset + 28, $wrk_no, value);
	}


	/**
	 * Transportation method cd. 輸送方法ＣＤ.<p>
	 *
	 */
	public String trnspt_cd() {
		return getConstString(offset + 29, $trnspt_cd);
	}

	/**
	 * Transportation method cd. 輸送方法ＣＤ.<p>
	 *
	 */
	public void trnspt_cd(String value) {
		setConstString(offset + 29, $trnspt_cd, value);
	}


	/**
	 * Ship/flight name 船名／便名.<p>
	 *
	 */
	public String vssl_flght() {
		return getConstString(offset + 30, $vssl_flght);
	}

	/**
	 * Ship/flight name 船名／便名.<p>
	 *
	 */
	public void vssl_flght(String value) {
		setConstString(offset + 30, $vssl_flght, value);
	}


	/**
	 * Loading port cd. 船積港ＣＤ.<p>
	 *
	 */
	public String load_port_cd() {
		return getConstString(offset + 31, $load_port_cd);
	}

	/**
	 * Loading port cd. 船積港ＣＤ.<p>
	 *
	 */
	public void load_port_cd(String value) {
		setConstString(offset + 31, $load_port_cd, value);
	}


	/**
	 * Estimated date of loading 船積予定日.<p>
	 *
	 */
	public MCDate etd_dt() {
		return getConstDate(offset + 32, $etd_dt);
	}

	/**
	 * Estimated date of loading 船積予定日.<p>
	 *
	 */
	public void etd_dt(MCDate value) {
		setConstDate(offset + 32, $etd_dt, value);
	}


	/**
	 * Unloading port cd. 船卸港ＣＤ.<p>
	 *
	 */
	public String dschrg_port_cd() {
		return getConstString(offset + 33, $dschrg_port_cd);
	}

	/**
	 * Unloading port cd. 船卸港ＣＤ.<p>
	 *
	 */
	public void dschrg_port_cd(String value) {
		setConstString(offset + 33, $dschrg_port_cd, value);
	}


	/**
	 * Estimated date of unloading 船卸予定日.<p>
	 *
	 */
	public MCDate eta_dt() {
		return getConstDate(offset + 34, $eta_dt);
	}

	/**
	 * Estimated date of unloading 船卸予定日.<p>
	 *
	 */
	public void eta_dt(MCDate value) {
		setConstDate(offset + 34, $eta_dt, value);
	}


	/**
	 * Stopover point cd. 経由地ＣＤ.<p>
	 *
	 */
	public String via_port_cd() {
		return getConstString(offset + 35, $via_port_cd);
	}

	/**
	 * Stopover point cd. 経由地ＣＤ.<p>
	 *
	 */
	public void via_port_cd(String value) {
		setConstString(offset + 35, $via_port_cd, value);
	}


	/**
	 * Estimated stopover date 経由予定日.<p>
	 *
	 */
	public MCDate via_schd_dt() {
		return getConstDate(offset + 36, $via_schd_dt);
	}

	/**
	 * Estimated stopover date 経由予定日.<p>
	 *
	 */
	public void via_schd_dt(MCDate value) {
		setConstDate(offset + 36, $via_schd_dt, value);
	}


	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public String iv_no() {
		return getConstString(offset + 37, $iv_no);
	}

	/**
	 * Invoice No. インボイスＮＯ.<p>
	 *
	 */
	public void iv_no(String value) {
		setConstString(offset + 37, $iv_no, value);
	}


	/**
	 * Auto-numbering 自動発番.<p>
	 *
	 */
	public boolean iv_num_flg() {
		return getConstBoolean(offset + 38, $iv_num_flg);
	}

	/**
	 * Auto-numbering 自動発番.<p>
	 *
	 */
	public void iv_num_flg(boolean value) {
		setConstBoolean(offset + 38, $iv_num_flg, value);
	}


	/**
	 * Advance received control shipping type 前受金出荷制御区分.<p>
	 *
	 */
	public String adv_ship_ctrl_typ() {
		return getConstString(offset + 39, $adv_ship_ctrl_typ);
	}

	/**
	 * Advance received control shipping type 前受金出荷制御区分.<p>
	 *
	 */
	public void adv_ship_ctrl_typ(String value) {
		setConstString(offset + 39, $adv_ship_ctrl_typ, value);
	}


	/**
	 * Advance received billing amount 前受金請求額.<p>
	 *
	 */
	public MCNumber adv_bill_amt() {
		return getConstNumber(offset + 40, $adv_bill_amt);
	}

	/**
	 * Advance received billing amount 前受金請求額.<p>
	 *
	 */
	public void adv_bill_amt(MCNumber value) {
		setConstNumber(offset + 40, $adv_bill_amt, value);
	}

	/**
	 * Advance received billing amount 前受金請求額.<p>
	 *
	 */
	public void adv_bill_amt(int value) {
		setConstNumber(offset + 40, $adv_bill_amt, value);
	}

	/**
	 * Advance received billing amount 前受金請求額.<p>
	 *
	 */
	public void adv_bill_amt(long value) {
		setConstNumber(offset + 40, $adv_bill_amt, value);
	}

	/**
	 * Advance received billing amount 前受金請求額.<p>
	 *
	 */
	public void adv_bill_amt(float value) {
		setConstNumber(offset + 40, $adv_bill_amt, value);
	}

	/**
	 * Advance received billing amount 前受金請求額.<p>
	 *
	 */
	public void adv_bill_amt(double value) {
		setConstNumber(offset + 40, $adv_bill_amt, value);
	}


	/**
	 * Advance received payment amount 前受金入金額.<p>
	 *
	 */
	public MCNumber adv_rcv_amt() {
		return getConstNumber(offset + 41, $adv_rcv_amt);
	}

	/**
	 * Advance received payment amount 前受金入金額.<p>
	 *
	 */
	public void adv_rcv_amt(MCNumber value) {
		setConstNumber(offset + 41, $adv_rcv_amt, value);
	}

	/**
	 * Advance received payment amount 前受金入金額.<p>
	 *
	 */
	public void adv_rcv_amt(int value) {
		setConstNumber(offset + 41, $adv_rcv_amt, value);
	}

	/**
	 * Advance received payment amount 前受金入金額.<p>
	 *
	 */
	public void adv_rcv_amt(long value) {
		setConstNumber(offset + 41, $adv_rcv_amt, value);
	}

	/**
	 * Advance received payment amount 前受金入金額.<p>
	 *
	 */
	public void adv_rcv_amt(float value) {
		setConstNumber(offset + 41, $adv_rcv_amt, value);
	}

	/**
	 * Advance received payment amount 前受金入金額.<p>
	 *
	 */
	public void adv_rcv_amt(double value) {
		setConstNumber(offset + 41, $adv_rcv_amt, value);
	}


	/**
	 * Transaction terms cd. 1 取引条件ＣＤ１.<p>
	 *
	 */
	public String tterm_cd1() {
		return getConstString(offset + 42, $tterm_cd1);
	}

	/**
	 * Transaction terms cd. 1 取引条件ＣＤ１.<p>
	 *
	 */
	public void tterm_cd1(String value) {
		setConstString(offset + 42, $tterm_cd1, value);
	}


	/**
	 * Transaction terms remarks 1 取引条件備考１.<p>
	 *
	 */
	public String tterm_rmrks1() {
		return getConstString(offset + 43, $tterm_rmrks1);
	}

	/**
	 * Transaction terms remarks 1 取引条件備考１.<p>
	 *
	 */
	public void tterm_rmrks1(String value) {
		setConstString(offset + 43, $tterm_rmrks1, value);
	}


	/**
	 * Transaction terms cd. 2 取引条件ＣＤ２.<p>
	 *
	 */
	public String tterm_cd2() {
		return getConstString(offset + 44, $tterm_cd2);
	}

	/**
	 * Transaction terms cd. 2 取引条件ＣＤ２.<p>
	 *
	 */
	public void tterm_cd2(String value) {
		setConstString(offset + 44, $tterm_cd2, value);
	}


	/**
	 * Transaction terms remarks 2 取引条件備考２.<p>
	 *
	 */
	public String tterm_rmrks2() {
		return getConstString(offset + 45, $tterm_rmrks2);
	}

	/**
	 * Transaction terms remarks 2 取引条件備考２.<p>
	 *
	 */
	public void tterm_rmrks2(String value) {
		setConstString(offset + 45, $tterm_rmrks2, value);
	}


	/**
	 * Transaction terms cd. 3 取引条件ＣＤ３.<p>
	 *
	 */
	public String tterm_cd3() {
		return getConstString(offset + 46, $tterm_cd3);
	}

	/**
	 * Transaction terms cd. 3 取引条件ＣＤ３.<p>
	 *
	 */
	public void tterm_cd3(String value) {
		setConstString(offset + 46, $tterm_cd3, value);
	}


	/**
	 * Transaction terms remarks 3 取引条件備考３.<p>
	 *
	 */
	public String tterm_rmrks3() {
		return getConstString(offset + 47, $tterm_rmrks3);
	}

	/**
	 * Transaction terms remarks 3 取引条件備考３.<p>
	 *
	 */
	public void tterm_rmrks3(String value) {
		setConstString(offset + 47, $tterm_rmrks3, value);
	}


	/**
	 * Customer order No. 得意先注文ＮＯ.<p>
	 *
	 */
	public String cst_po_no() {
		return getConstString(offset + 48, $cst_po_no);
	}

	/**
	 * Customer order No. 得意先注文ＮＯ.<p>
	 *
	 */
	public void cst_po_no(String value) {
		setConstString(offset + 48, $cst_po_no, value);
	}


	/**
	 * Customer order rev. number 得意先注文改訂番号.<p>
	 *
	 */
	public MCNumber cst_po_rev() {
		return getConstNumber(offset + 49, $cst_po_rev);
	}

	/**
	 * Customer order rev. number 得意先注文改訂番号.<p>
	 *
	 */
	public void cst_po_rev(MCNumber value) {
		setConstNumber(offset + 49, $cst_po_rev, value);
	}

	/**
	 * Customer order rev. number 得意先注文改訂番号.<p>
	 *
	 */
	public void cst_po_rev(int value) {
		setConstNumber(offset + 49, $cst_po_rev, value);
	}

	/**
	 * Customer order rev. number 得意先注文改訂番号.<p>
	 *
	 */
	public void cst_po_rev(long value) {
		setConstNumber(offset + 49, $cst_po_rev, value);
	}

	/**
	 * Customer order rev. number 得意先注文改訂番号.<p>
	 *
	 */
	public void cst_po_rev(float value) {
		setConstNumber(offset + 49, $cst_po_rev, value);
	}

	/**
	 * Customer order rev. number 得意先注文改訂番号.<p>
	 *
	 */
	public void cst_po_rev(double value) {
		setConstNumber(offset + 49, $cst_po_rev, value);
	}


	/**
	 * AR dept. cd. 債権部門ＣＤ.<p>
	 *
	 */
	public String ar_dpt_cd() {
		return getConstString(offset + 50, $ar_dpt_cd);
	}

	/**
	 * AR dept. cd. 債権部門ＣＤ.<p>
	 *
	 */
	public void ar_dpt_cd(String value) {
		setConstString(offset + 50, $ar_dpt_cd, value);
	}


	/**
	 * Receiving date 受付日.<p>
	 *
	 */
	public MCDate rcpt_dt() {
		return getConstDate(offset + 51, $rcpt_dt);
	}

	/**
	 * Receiving date 受付日.<p>
	 *
	 */
	public void rcpt_dt(MCDate value) {
		setConstDate(offset + 51, $rcpt_dt, value);
	}


	/**
	 * Receiving PIC cd. 受付担当者ＣＤ.<p>
	 *
	 */
	public String rcpt_usr_cd() {
		return getConstString(offset + 52, $rcpt_usr_cd);
	}

	/**
	 * Receiving PIC cd. 受付担当者ＣＤ.<p>
	 *
	 */
	public void rcpt_usr_cd(String value) {
		setConstString(offset + 52, $rcpt_usr_cd, value);
	}


	/**
	 * Customer order remarks 得意先注文備考.<p>
	 *
	 */
	public String cst_po_rmrks() {
		return getConstString(offset + 53, $cst_po_rmrks);
	}

	/**
	 * Customer order remarks 得意先注文備考.<p>
	 *
	 */
	public void cst_po_rmrks(String value) {
		setConstString(offset + 53, $cst_po_rmrks, value);
	}


	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public String trd_rmrks() {
		return getConstString(offset + 54, $trd_rmrks);
	}

	/**
	 * Transaction remarks 取引備考.<p>
	 *
	 */
	public void trd_rmrks(String value) {
		setConstString(offset + 54, $trd_rmrks, value);
	}


	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public String intr_rmrks() {
		return getConstString(offset + 55, $intr_rmrks);
	}

	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public void intr_rmrks(String value) {
		setConstString(offset + 55, $intr_rmrks, value);
	}


	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 56, $sub_char1);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 56, $sub_char1, value);
	}


	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 57, $sub_char2);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 57, $sub_char2, value);
	}


	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 58, $sub_char3);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 58, $sub_char3, value);
	}


	/**
	 * EDI_ ＥＤＩ_.<p>
	 *
	 */
	public boolean edi_flg() {
		return getConstBoolean(offset + 59, $edi_flg);
	}

	/**
	 * EDI_ ＥＤＩ_.<p>
	 *
	 */
	public void edi_flg(boolean value) {
		setConstBoolean(offset + 59, $edi_flg, value);
	}


	/**
	 * Invoice transaction インボイス取引.<p>
	 *
	 */
	public boolean cst_iv_flg() {
		return getConstBoolean(offset + 60, $cst_iv_flg);
	}

	/**
	 * Invoice transaction インボイス取引.<p>
	 *
	 */
	public void cst_iv_flg(boolean value) {
		setConstBoolean(offset + 60, $cst_iv_flg, value);
	}


	/**
	 * Country cd. 国ＣＤ.<p>
	 *
	 */
	public String cntry_cd() {
		return getConstString(offset + 61, $cntry_cd);
	}

	/**
	 * Country cd. 国ＣＤ.<p>
	 *
	 */
	public void cntry_cd(String value) {
		setConstString(offset + 61, $cntry_cd, value);
	}


	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public MCNumber trd_cur_amt() {
		return getConstNumber(offset + 62, $trd_cur_amt);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(MCNumber value) {
		setConstNumber(offset + 62, $trd_cur_amt, value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(int value) {
		setConstNumber(offset + 62, $trd_cur_amt, value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(long value) {
		setConstNumber(offset + 62, $trd_cur_amt, value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(float value) {
		setConstNumber(offset + 62, $trd_cur_amt, value);
	}

	/**
	 * Amount (Transaction currency) 取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(double value) {
		setConstNumber(offset + 62, $trd_cur_amt, value);
	}


	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public MCNumber trd_cur_tax_amt() {
		return getConstNumber(offset + 63, $trd_cur_tax_amt);
	}

	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(MCNumber value) {
		setConstNumber(offset + 63, $trd_cur_tax_amt, value);
	}

	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(int value) {
		setConstNumber(offset + 63, $trd_cur_tax_amt, value);
	}

	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(long value) {
		setConstNumber(offset + 63, $trd_cur_tax_amt, value);
	}

	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(float value) {
		setConstNumber(offset + 63, $trd_cur_tax_amt, value);
	}

	/**
	 * Tax amount (Transaction currency) 取引通貨税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(double value) {
		setConstNumber(offset + 63, $trd_cur_tax_amt, value);
	}


	/**
	 * For original approval 元承認対象.<p>
	 *
	 */
	public boolean old_aprv_flg() {
		return getConstBoolean(offset + 64, $old_aprv_flg);
	}

	/**
	 * For original approval 元承認対象.<p>
	 *
	 */
	public void old_aprv_flg(boolean value) {
		setConstBoolean(offset + 64, $old_aprv_flg, value);
	}


	/**
	 * Original approval No. 元承認ＮＯ.<p>
	 *
	 */
	public String old_aprv_no() {
		return getConstString(offset + 65, $old_aprv_no);
	}

	/**
	 * Original approval No. 元承認ＮＯ.<p>
	 *
	 */
	public void old_aprv_no(String value) {
		setConstString(offset + 65, $old_aprv_no, value);
	}


	/**
	 * Original approval status type 元承認状況区分.<p>
	 *
	 */
	public String old_aprv_sts_typ() {
		return getConstString(offset + 66, $old_aprv_sts_typ);
	}

	/**
	 * Original approval status type 元承認状況区分.<p>
	 *
	 */
	public void old_aprv_sts_typ(String value) {
		setConstString(offset + 66, $old_aprv_sts_typ, value);
	}


	/**
	 * Original update possible 元更新可能.<p>
	 *
	 */
	public boolean old_can_upd_flg() {
		return getConstBoolean(offset + 67, $old_can_upd_flg);
	}

	/**
	 * Original update possible 元更新可能.<p>
	 *
	 */
	public void old_can_upd_flg(boolean value) {
		setConstBoolean(offset + 67, $old_can_upd_flg, value);
	}


	/**
	 * Original cancellation possible 元取消可能.<p>
	 *
	 */
	public boolean old_can_del_flg() {
		return getConstBoolean(offset + 68, $old_can_del_flg);
	}

	/**
	 * Original cancellation possible 元取消可能.<p>
	 *
	 */
	public void old_can_del_flg(boolean value) {
		setConstBoolean(offset + 68, $old_can_del_flg, value);
	}


	/**
	 * Sales order header update counter 受注ヘッダ更新カウンタ.<p>
	 *
	 */
	public MCNumber slo_upd_cntr() {
		return getConstNumber(offset + 69, $slo_upd_cntr);
	}

	/**
	 * Sales order header update counter 受注ヘッダ更新カウンタ.<p>
	 *
	 */
	public void slo_upd_cntr(MCNumber value) {
		setConstNumber(offset + 69, $slo_upd_cntr, value);
	}

	/**
	 * Sales order header update counter 受注ヘッダ更新カウンタ.<p>
	 *
	 */
	public void slo_upd_cntr(int value) {
		setConstNumber(offset + 69, $slo_upd_cntr, value);
	}

	/**
	 * Sales order header update counter 受注ヘッダ更新カウンタ.<p>
	 *
	 */
	public void slo_upd_cntr(long value) {
		setConstNumber(offset + 69, $slo_upd_cntr, value);
	}

	/**
	 * Sales order header update counter 受注ヘッダ更新カウンタ.<p>
	 *
	 */
	public void slo_upd_cntr(float value) {
		setConstNumber(offset + 69, $slo_upd_cntr, value);
	}

	/**
	 * Sales order header update counter 受注ヘッダ更新カウンタ.<p>
	 *
	 */
	public void slo_upd_cntr(double value) {
		setConstNumber(offset + 69, $slo_upd_cntr, value);
	}


	/**
	 * Quotation header update counter 見積ヘッダ更新カウンタ.<p>
	 *
	 */
	public MCNumber qtn_upd_cntr() {
		return getConstNumber(offset + 70, $qtn_upd_cntr);
	}

	/**
	 * Quotation header update counter 見積ヘッダ更新カウンタ.<p>
	 *
	 */
	public void qtn_upd_cntr(MCNumber value) {
		setConstNumber(offset + 70, $qtn_upd_cntr, value);
	}

	/**
	 * Quotation header update counter 見積ヘッダ更新カウンタ.<p>
	 *
	 */
	public void qtn_upd_cntr(int value) {
		setConstNumber(offset + 70, $qtn_upd_cntr, value);
	}

	/**
	 * Quotation header update counter 見積ヘッダ更新カウンタ.<p>
	 *
	 */
	public void qtn_upd_cntr(long value) {
		setConstNumber(offset + 70, $qtn_upd_cntr, value);
	}

	/**
	 * Quotation header update counter 見積ヘッダ更新カウンタ.<p>
	 *
	 */
	public void qtn_upd_cntr(float value) {
		setConstNumber(offset + 70, $qtn_upd_cntr, value);
	}

	/**
	 * Quotation header update counter 見積ヘッダ更新カウンタ.<p>
	 *
	 */
	public void qtn_upd_cntr(double value) {
		setConstNumber(offset + 70, $qtn_upd_cntr, value);
	}


	/**
	 * Rounding type (Sales amount) 売上金額端数処理区分.<p>
	 *
	 */
	public String sls_amt_rnd_typ() {
		return getConstString(offset + 71, $sls_amt_rnd_typ);
	}

	/**
	 * Rounding type (Sales amount) 売上金額端数処理区分.<p>
	 *
	 */
	public void sls_amt_rnd_typ(String value) {
		setConstString(offset + 71, $sls_amt_rnd_typ, value);
	}


	/**
	 * Sales tax rounding type 売上税額端数処理区分.<p>
	 *
	 */
	public String sls_tax_rnd_typ() {
		return getConstString(offset + 72, $sls_tax_rnd_typ);
	}

	/**
	 * Sales tax rounding type 売上税額端数処理区分.<p>
	 *
	 */
	public void sls_tax_rnd_typ(String value) {
		setConstString(offset + 72, $sls_tax_rnd_typ, value);
	}


	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public MCNumber amt_dec_place() {
		return getConstNumber(offset + 73, $amt_dec_place);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(MCNumber value) {
		setConstNumber(offset + 73, $amt_dec_place, value);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(int value) {
		setConstNumber(offset + 73, $amt_dec_place, value);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(long value) {
		setConstNumber(offset + 73, $amt_dec_place, value);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(float value) {
		setConstNumber(offset + 73, $amt_dec_place, value);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(double value) {
		setConstNumber(offset + 73, $amt_dec_place, value);
	}


	/**
	 * Error エラー.<p>
	 *
	 */
	public boolean err_flg() {
		return getConstBoolean(offset + 74, $err_flg);
	}

	/**
	 * Error エラー.<p>
	 *
	 */
	public void err_flg(boolean value) {
		setConstBoolean(offset + 74, $err_flg, value);
	}


	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public MCNumber peg_no() {
		return getConstNumber(offset + 75, $peg_no);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(MCNumber value) {
		setConstNumber(offset + 75, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(int value) {
		setConstNumber(offset + 75, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(long value) {
		setConstNumber(offset + 75, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(float value) {
		setConstNumber(offset + 75, $peg_no, value);
	}

	/**
	 * Pegging No. 紐付けＮＯ.<p>
	 *
	 */
	public void peg_no(double value) {
		setConstNumber(offset + 75, $peg_no, value);
	}


	/**
	 * Not for update counter check 更新カウンタチェック対象外.<p>
	 *
	 */
	public boolean upd_cntr_not_chk_flg() {
		return getConstBoolean(offset + 76, $upd_cntr_not_chk_flg);
	}

	/**
	 * Not for update counter check 更新カウンタチェック対象外.<p>
	 *
	 */
	public void upd_cntr_not_chk_flg(boolean value) {
		setConstBoolean(offset + 76, $upd_cntr_not_chk_flg, value);
	}


	/**
	 * Caller batch process 呼出元バッチ処理.<p>
	 *
	 */
	public boolean is_src_batch_flg() {
		return getConstBoolean(offset + 77, $is_src_batch_flg);
	}

	/**
	 * Caller batch process 呼出元バッチ処理.<p>
	 *
	 */
	public void is_src_batch_flg(boolean value) {
		setConstBoolean(offset + 77, $is_src_batch_flg, value);
	}


	/**
	 * EDI spare CHAR column 1 ＥＤＩ予備ＣＨＡＲ項目１.<p>
	 *
	 */
	public String edi_sub_char1() {
		return getConstString(offset + 78, $edi_sub_char1);
	}

	/**
	 * EDI spare CHAR column 1 ＥＤＩ予備ＣＨＡＲ項目１.<p>
	 *
	 */
	public void edi_sub_char1(String value) {
		setConstString(offset + 78, $edi_sub_char1, value);
	}


	/**
	 * EDI spare CHAR column 2 ＥＤＩ予備ＣＨＡＲ項目２.<p>
	 *
	 */
	public String edi_sub_char2() {
		return getConstString(offset + 79, $edi_sub_char2);
	}

	/**
	 * EDI spare CHAR column 2 ＥＤＩ予備ＣＨＡＲ項目２.<p>
	 *
	 */
	public void edi_sub_char2(String value) {
		setConstString(offset + 79, $edi_sub_char2, value);
	}


	/**
	 * EDI spare CHAR column 3 ＥＤＩ予備ＣＨＡＲ項目３.<p>
	 *
	 */
	public String edi_sub_char3() {
		return getConstString(offset + 80, $edi_sub_char3);
	}

	/**
	 * EDI spare CHAR column 3 ＥＤＩ予備ＣＨＡＲ項目３.<p>
	 *
	 */
	public void edi_sub_char3(String value) {
		setConstString(offset + 80, $edi_sub_char3, value);
	}


	/**
	 * EDI spare CHAR column 4 ＥＤＩ予備ＣＨＡＲ項目４.<p>
	 *
	 */
	public String edi_sub_char4() {
		return getConstString(offset + 81, $edi_sub_char4);
	}

	/**
	 * EDI spare CHAR column 4 ＥＤＩ予備ＣＨＡＲ項目４.<p>
	 *
	 */
	public void edi_sub_char4(String value) {
		setConstString(offset + 81, $edi_sub_char4, value);
	}


	/**
	 * EDI spare CHAR column 5 ＥＤＩ予備ＣＨＡＲ項目５.<p>
	 *
	 */
	public String edi_sub_char5() {
		return getConstString(offset + 82, $edi_sub_char5);
	}

	/**
	 * EDI spare CHAR column 5 ＥＤＩ予備ＣＨＡＲ項目５.<p>
	 *
	 */
	public void edi_sub_char5(String value) {
		setConstString(offset + 82, $edi_sub_char5, value);
	}


	/**
	 * EDI spare NUM column 1 ＥＤＩ予備ＮＵＭ項目１.<p>
	 *
	 */
	public MCNumber edi_sub_num1() {
		return getConstNumber(offset + 83, $edi_sub_num1);
	}

	/**
	 * EDI spare NUM column 1 ＥＤＩ予備ＮＵＭ項目１.<p>
	 *
	 */
	public void edi_sub_num1(MCNumber value) {
		setConstNumber(offset + 83, $edi_sub_num1, value);
	}

	/**
	 * EDI spare NUM column 1 ＥＤＩ予備ＮＵＭ項目１.<p>
	 *
	 */
	public void edi_sub_num1(int value) {
		setConstNumber(offset + 83, $edi_sub_num1, value);
	}

	/**
	 * EDI spare NUM column 1 ＥＤＩ予備ＮＵＭ項目１.<p>
	 *
	 */
	public void edi_sub_num1(long value) {
		setConstNumber(offset + 83, $edi_sub_num1, value);
	}

	/**
	 * EDI spare NUM column 1 ＥＤＩ予備ＮＵＭ項目１.<p>
	 *
	 */
	public void edi_sub_num1(float value) {
		setConstNumber(offset + 83, $edi_sub_num1, value);
	}

	/**
	 * EDI spare NUM column 1 ＥＤＩ予備ＮＵＭ項目１.<p>
	 *
	 */
	public void edi_sub_num1(double value) {
		setConstNumber(offset + 83, $edi_sub_num1, value);
	}


	/**
	 * EDI spare DATE column 1 ＥＤＩ予備ＤＡＴＥ項目１.<p>
	 *
	 */
	public MCDate edi_sub_dt1() {
		return getConstDate(offset + 84, $edi_sub_dt1);
	}

	/**
	 * EDI spare DATE column 1 ＥＤＩ予備ＤＡＴＥ項目１.<p>
	 *
	 */
	public void edi_sub_dt1(MCDate value) {
		setConstDate(offset + 84, $edi_sub_dt1, value);
	}


	public String getString(String name) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			return slo_no();
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			return trd_cd();
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			return trd_ptn_typ();
		}
		if ($slo_typ.equalsIgnoreCase(name)) {
			return slo_typ();
		}
		if ($aprv_no.equalsIgnoreCase(name)) {
			return aprv_no();
		}
		if ($aprv_sts_typ.equalsIgnoreCase(name)) {
			return aprv_sts_typ();
		}
		if ($qtn_no.equalsIgnoreCase(name)) {
			return qtn_no();
		}
		if ($qtn_aprv_no.equalsIgnoreCase(name)) {
			return qtn_aprv_no();
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			return cst_cd();
		}
		if ($sls_basis_typ.equalsIgnoreCase(name)) {
			return sls_basis_typ();
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
		if ($assort_typ.equalsIgnoreCase(name)) {
			return assort_typ();
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			return wrk_no();
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
		if ($iv_no.equalsIgnoreCase(name)) {
			return iv_no();
		}
		if ($adv_ship_ctrl_typ.equalsIgnoreCase(name)) {
			return adv_ship_ctrl_typ();
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
		if ($cst_po_no.equalsIgnoreCase(name)) {
			return cst_po_no();
		}
		if ($ar_dpt_cd.equalsIgnoreCase(name)) {
			return ar_dpt_cd();
		}
		if ($rcpt_usr_cd.equalsIgnoreCase(name)) {
			return rcpt_usr_cd();
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
		if ($old_aprv_no.equalsIgnoreCase(name)) {
			return old_aprv_no();
		}
		if ($old_aprv_sts_typ.equalsIgnoreCase(name)) {
			return old_aprv_sts_typ();
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
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($slo_rev.equalsIgnoreCase(name)) {
			return slo_rev();
		}
		if ($qtn_rev.equalsIgnoreCase(name)) {
			return qtn_rev();
		}
		if ($xrate.equalsIgnoreCase(name)) {
			return xrate();
		}
		if ($ptax_xrate.equalsIgnoreCase(name)) {
			return ptax_xrate();
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
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			return trd_cur_amt();
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			return trd_cur_tax_amt();
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
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($edi_sub_num1.equalsIgnoreCase(name)) {
			return edi_sub_num1();
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
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($aprv_flg.equalsIgnoreCase(name)) {
			return aprv_flg();
		}
		if ($aprv_back_flg.equalsIgnoreCase(name)) {
			return aprv_back_flg();
		}
		if ($can_upd_flg.equalsIgnoreCase(name)) {
			return can_upd_flg();
		}
		if ($can_del_flg.equalsIgnoreCase(name)) {
			return can_del_flg();
		}
		if ($qtn_aprv_flg.equalsIgnoreCase(name)) {
			return qtn_aprv_flg();
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
		if ($cst_iv_flg.equalsIgnoreCase(name)) {
			return cst_iv_flg();
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
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		if ($upd_cntr_not_chk_flg.equalsIgnoreCase(name)) {
			return upd_cntr_not_chk_flg();
		}
		if ($is_src_batch_flg.equalsIgnoreCase(name)) {
			return is_src_batch_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			return slo_no();
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			return trd_cd();
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			return trd_ptn_typ();
		}
		if ($slo_typ.equalsIgnoreCase(name)) {
			return slo_typ();
		}
		if ($aprv_no.equalsIgnoreCase(name)) {
			return aprv_no();
		}
		if ($aprv_sts_typ.equalsIgnoreCase(name)) {
			return aprv_sts_typ();
		}
		if ($qtn_no.equalsIgnoreCase(name)) {
			return qtn_no();
		}
		if ($qtn_aprv_no.equalsIgnoreCase(name)) {
			return qtn_aprv_no();
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			return cst_cd();
		}
		if ($sls_basis_typ.equalsIgnoreCase(name)) {
			return sls_basis_typ();
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
		if ($assort_typ.equalsIgnoreCase(name)) {
			return assort_typ();
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			return wrk_no();
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
		if ($iv_no.equalsIgnoreCase(name)) {
			return iv_no();
		}
		if ($adv_ship_ctrl_typ.equalsIgnoreCase(name)) {
			return adv_ship_ctrl_typ();
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
		if ($cst_po_no.equalsIgnoreCase(name)) {
			return cst_po_no();
		}
		if ($ar_dpt_cd.equalsIgnoreCase(name)) {
			return ar_dpt_cd();
		}
		if ($rcpt_usr_cd.equalsIgnoreCase(name)) {
			return rcpt_usr_cd();
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
		if ($old_aprv_no.equalsIgnoreCase(name)) {
			return old_aprv_no();
		}
		if ($old_aprv_sts_typ.equalsIgnoreCase(name)) {
			return old_aprv_sts_typ();
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
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($slo_rev.equalsIgnoreCase(name)) {
			return slo_rev();
		}
		if ($qtn_rev.equalsIgnoreCase(name)) {
			return qtn_rev();
		}
		if ($xrate.equalsIgnoreCase(name)) {
			return xrate();
		}
		if ($ptax_xrate.equalsIgnoreCase(name)) {
			return ptax_xrate();
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
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			return trd_cur_amt();
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			return trd_cur_tax_amt();
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
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($edi_sub_num1.equalsIgnoreCase(name)) {
			return edi_sub_num1();
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
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($aprv_flg.equalsIgnoreCase(name)) {
			return aprv_flg();
		}
		if ($aprv_back_flg.equalsIgnoreCase(name)) {
			return aprv_back_flg();
		}
		if ($can_upd_flg.equalsIgnoreCase(name)) {
			return can_upd_flg();
		}
		if ($can_del_flg.equalsIgnoreCase(name)) {
			return can_del_flg();
		}
		if ($qtn_aprv_flg.equalsIgnoreCase(name)) {
			return qtn_aprv_flg();
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
		if ($cst_iv_flg.equalsIgnoreCase(name)) {
			return cst_iv_flg();
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
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		if ($upd_cntr_not_chk_flg.equalsIgnoreCase(name)) {
			return upd_cntr_not_chk_flg();
		}
		if ($is_src_batch_flg.equalsIgnoreCase(name)) {
			return is_src_batch_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			slo_no(value);
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
		if ($slo_typ.equalsIgnoreCase(name)) {
			slo_typ(value);
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
		if ($qtn_no.equalsIgnoreCase(name)) {
			qtn_no(value);
			return;
		}
		if ($qtn_aprv_no.equalsIgnoreCase(name)) {
			qtn_aprv_no(value);
			return;
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			cst_cd(value);
			return;
		}
		if ($sls_basis_typ.equalsIgnoreCase(name)) {
			sls_basis_typ(value);
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
		if ($assort_typ.equalsIgnoreCase(name)) {
			assort_typ(value);
			return;
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			trd_cur_cd(value);
			return;
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			wrk_no(value);
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
		if ($iv_no.equalsIgnoreCase(name)) {
			iv_no(value);
			return;
		}
		if ($adv_ship_ctrl_typ.equalsIgnoreCase(name)) {
			adv_ship_ctrl_typ(value);
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
		if ($cst_po_no.equalsIgnoreCase(name)) {
			cst_po_no(value);
			return;
		}
		if ($ar_dpt_cd.equalsIgnoreCase(name)) {
			ar_dpt_cd(value);
			return;
		}
		if ($rcpt_usr_cd.equalsIgnoreCase(name)) {
			rcpt_usr_cd(value);
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
		if ($old_aprv_no.equalsIgnoreCase(name)) {
			old_aprv_no(value);
			return;
		}
		if ($old_aprv_sts_typ.equalsIgnoreCase(name)) {
			old_aprv_sts_typ(value);
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
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($slo_rev.equalsIgnoreCase(name)) {
			slo_rev(value);
			return;
		}
		if ($qtn_rev.equalsIgnoreCase(name)) {
			qtn_rev(value);
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
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
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
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($edi_sub_num1.equalsIgnoreCase(name)) {
			edi_sub_num1(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($slo_rev.equalsIgnoreCase(name)) {
			slo_rev(value);
			return;
		}
		if ($qtn_rev.equalsIgnoreCase(name)) {
			qtn_rev(value);
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
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
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
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($edi_sub_num1.equalsIgnoreCase(name)) {
			edi_sub_num1(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($slo_rev.equalsIgnoreCase(name)) {
			slo_rev(value);
			return;
		}
		if ($qtn_rev.equalsIgnoreCase(name)) {
			qtn_rev(value);
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
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
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
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($edi_sub_num1.equalsIgnoreCase(name)) {
			edi_sub_num1(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($slo_rev.equalsIgnoreCase(name)) {
			slo_rev(value);
			return;
		}
		if ($qtn_rev.equalsIgnoreCase(name)) {
			qtn_rev(value);
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
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
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
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($edi_sub_num1.equalsIgnoreCase(name)) {
			edi_sub_num1(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($slo_rev.equalsIgnoreCase(name)) {
			slo_rev(value);
			return;
		}
		if ($qtn_rev.equalsIgnoreCase(name)) {
			qtn_rev(value);
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
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
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
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($edi_sub_num1.equalsIgnoreCase(name)) {
			edi_sub_num1(value);
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
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($aprv_flg.equalsIgnoreCase(name)) {
			aprv_flg(value);
			return;
		}
		if ($aprv_back_flg.equalsIgnoreCase(name)) {
			aprv_back_flg(value);
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
		if ($qtn_aprv_flg.equalsIgnoreCase(name)) {
			qtn_aprv_flg(value);
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
		if ($cst_iv_flg.equalsIgnoreCase(name)) {
			cst_iv_flg(value);
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
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		if ($upd_cntr_not_chk_flg.equalsIgnoreCase(name)) {
			upd_cntr_not_chk_flg(value);
			return;
		}
		if ($is_src_batch_flg.equalsIgnoreCase(name)) {
			is_src_batch_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			slo_no(value);
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
		if ($slo_typ.equalsIgnoreCase(name)) {
			slo_typ(value);
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
		if ($qtn_no.equalsIgnoreCase(name)) {
			qtn_no(value);
			return;
		}
		if ($qtn_aprv_no.equalsIgnoreCase(name)) {
			qtn_aprv_no(value);
			return;
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			cst_cd(value);
			return;
		}
		if ($sls_basis_typ.equalsIgnoreCase(name)) {
			sls_basis_typ(value);
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
		if ($assort_typ.equalsIgnoreCase(name)) {
			assort_typ(value);
			return;
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			trd_cur_cd(value);
			return;
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			wrk_no(value);
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
		if ($iv_no.equalsIgnoreCase(name)) {
			iv_no(value);
			return;
		}
		if ($adv_ship_ctrl_typ.equalsIgnoreCase(name)) {
			adv_ship_ctrl_typ(value);
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
		if ($cst_po_no.equalsIgnoreCase(name)) {
			cst_po_no(value);
			return;
		}
		if ($ar_dpt_cd.equalsIgnoreCase(name)) {
			ar_dpt_cd(value);
			return;
		}
		if ($rcpt_usr_cd.equalsIgnoreCase(name)) {
			rcpt_usr_cd(value);
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
		if ($old_aprv_no.equalsIgnoreCase(name)) {
			old_aprv_no(value);
			return;
		}
		if ($old_aprv_sts_typ.equalsIgnoreCase(name)) {
			old_aprv_sts_typ(value);
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
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($slo_rev.equalsIgnoreCase(name)) {
			slo_rev(value);
			return;
		}
		if ($qtn_rev.equalsIgnoreCase(name)) {
			qtn_rev(value);
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
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
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
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($edi_sub_num1.equalsIgnoreCase(name)) {
			edi_sub_num1(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($slo_rev.equalsIgnoreCase(name)) {
			slo_rev(value);
			return;
		}
		if ($qtn_rev.equalsIgnoreCase(name)) {
			qtn_rev(value);
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
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
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
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($edi_sub_num1.equalsIgnoreCase(name)) {
			edi_sub_num1(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($slo_rev.equalsIgnoreCase(name)) {
			slo_rev(value);
			return;
		}
		if ($qtn_rev.equalsIgnoreCase(name)) {
			qtn_rev(value);
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
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
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
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($edi_sub_num1.equalsIgnoreCase(name)) {
			edi_sub_num1(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($slo_rev.equalsIgnoreCase(name)) {
			slo_rev(value);
			return;
		}
		if ($qtn_rev.equalsIgnoreCase(name)) {
			qtn_rev(value);
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
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
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
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($edi_sub_num1.equalsIgnoreCase(name)) {
			edi_sub_num1(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($slo_rev.equalsIgnoreCase(name)) {
			slo_rev(value);
			return;
		}
		if ($qtn_rev.equalsIgnoreCase(name)) {
			qtn_rev(value);
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
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
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
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($edi_sub_num1.equalsIgnoreCase(name)) {
			edi_sub_num1(value);
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
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($aprv_flg.equalsIgnoreCase(name)) {
			aprv_flg(value);
			return;
		}
		if ($aprv_back_flg.equalsIgnoreCase(name)) {
			aprv_back_flg(value);
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
		if ($qtn_aprv_flg.equalsIgnoreCase(name)) {
			qtn_aprv_flg(value);
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
		if ($cst_iv_flg.equalsIgnoreCase(name)) {
			cst_iv_flg(value);
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
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		if ($upd_cntr_not_chk_flg.equalsIgnoreCase(name)) {
			upd_cntr_not_chk_flg(value);
			return;
		}
		if ($is_src_batch_flg.equalsIgnoreCase(name)) {
			is_src_batch_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

