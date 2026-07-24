package mcframe.clientMSBB.MSBBP1120;

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
 * ブロック"Cnd"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class CndR_MC_A extends MCConstRow {

	/**
	 * PRNT,Issue report;REF,View; PRNT,帳票発行する;REF,参照する;.<p>
	 *
	 */
	public static final String $ope = "ope";
	/**
	 * DTL,Details,DTL;HDR,Header,HDR DTL,明細,DTL;HDR,ヘッダ,HDR.<p>
	 *
	 */
	public static final String $disp = "disp";
	/**
	 * Creating 作成中.<p>
	 *
	 */
	public static final String $creating = "creating";
	/**
	 * Temporary quotation 仮見積.<p>
	 *
	 */
	public static final String $pre_qtn = "pre_qtn";
	/**
	 * Quotation 本見積.<p>
	 *
	 */
	public static final String $qtn = "qtn";
	/**
	 * Uncopied 未引継.<p>
	 *
	 */
	public static final String $non = "non";
	/**
	 * Partial copy 一部引継.<p>
	 *
	 */
	public static final String $part = "part";
	/**
	 * Copy all 全引継.<p>
	 *
	 */
	public static final String $compl = "compl";
	/**
	 * Waiting 未承認.<p>
	 *
	 */
	public static final String $opn = "opn";
	/**
	 * Preliminary approval 一次承認済.<p>
	 *
	 */
	public static final String $fix = "fix";
	/**
	 * Final approval 最終承認済.<p>
	 *
	 */
	public static final String $acpt = "acpt";
	/**
	 * Reject 却下.<p>
	 *
	 */
	public static final String $rjct = "rjct";
	/**
	 * Denied 否認.<p>
	 *
	 */
	public static final String $last_rjct = "last_rjct";
	/**
	 * Non-target 対象外.<p>
	 *
	 */
	public static final String $excld = "excld";
	/**
	 * Unissued 未発行.<p>
	 *
	 */
	public static final String $yet = "yet";
	/**
	 * Issued 発行済.<p>
	 *
	 */
	public static final String $prnt = "prnt";
	/**
	 * Target 対象.<p>
	 *
	 */
	public static final String $iv_trgt_flg = "iv_trgt_flg";
	/**
	 * Non-target 対象外.<p>
	 *
	 */
	public static final String $iv_not_trgt_flg = "iv_not_trgt_flg";
	/**
	 * Quotation date FROM 見積日ＦＲＯＭ.<p>
	 *
	 */
	public static final String $qtn_dt_fr = "qtn_dt_fr";
	/**
	 * Quotation date TO 見積日ＴＯ.<p>
	 *
	 */
	public static final String $qtn_dt_to = "qtn_dt_to";
	/**
	 * Quotation expiration date FROM 見積有効期限ＦＲＯＭ.<p>
	 *
	 */
	public static final String $valid_dt_fr = "valid_dt_fr";
	/**
	 * Quotation expiration date TO 見積有効期限ＴＯ.<p>
	 *
	 */
	public static final String $valid_dt_to = "valid_dt_to";
	/**
	 * Receiving date FROM 受付日ＦＲＯＭ.<p>
	 *
	 */
	public static final String $rcpt_dt_fr = "rcpt_dt_fr";
	/**
	 * Receiving date TO 受付日ＴＯ.<p>
	 *
	 */
	public static final String $rcpt_dt_to = "rcpt_dt_to";
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
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public static final String $dlv_cd = "dlv_cd";
	/**
	 * Delivery destination name 納品先名.<p>
	 *
	 */
	public static final String $dlv_nm = "dlv_nm";
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
	 * Customer quotation request No. 得意先見積依頼ＮＯ.<p>
	 *
	 */
	public static final String $cst_qtn_rqst_no = "cst_qtn_rqst_no";
	/**
	 * Customer quotation request details No. 得意先見積依頼明細ＮＯ.<p>
	 *
	 */
	public static final String $cst_qtn_rqst_d_no = "cst_qtn_rqst_d_no";
	public static final String $itm_typ_p = "itm_typ_p";
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
	public static final String $itm_p = "itm_p";
	public static final String $sno_p = "sno_p";
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
	 * Quotation details result reason cd. 見積明細結果理由ＣＤ.<p>
	 *
	 */
	public static final String $qtn_d_rslt_rsn_cd = "qtn_d_rslt_rsn_cd";
	/**
	 * Quotation details result reason name 見積明細結果理由名.<p>
	 *
	 */
	public static final String $qtn_d_rslt_rsn_nm = "qtn_d_rslt_rsn_nm";
	/**
	 * Quotation remarks 見積備考.<p>
	 *
	 */
	public static final String $qtn_rmrks = "qtn_rmrks";
	/**
	 * Quotation details remarks 見積明細備考.<p>
	 *
	 */
	public static final String $qtn_d_rmrks = "qtn_d_rmrks";
	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public static final String $intr_rmrks = "intr_rmrks";
	/**
	 * Internal details remarks 内部明細備考.<p>
	 *
	 */
	public static final String $intr_d_rmrks = "intr_d_rmrks";
	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public static final String $qtn_sub_char1 = "qtn_sub_char1";
	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public static final String $qtn_sub_char2 = "qtn_sub_char2";
	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public static final String $qtn_sub_char3 = "qtn_sub_char3";
	/**
	 * Details spare 1 明細予備１.<p>
	 *
	 */
	public static final String $qtn_d_sub_char1 = "qtn_d_sub_char1";
	/**
	 * Details spare 2 明細予備２.<p>
	 *
	 */
	public static final String $qtn_d_sub_char2 = "qtn_d_sub_char2";
	/**
	 * Details spare 3 明細予備３.<p>
	 *
	 */
	public static final String $qtn_d_sub_char3 = "qtn_d_sub_char3";
	/**
	 * Including failed order 失注含む.<p>
	 *
	 */
	public static final String $inc_failure_flg = "inc_failure_flg";
	/**
	 * Include cancel 取消含む.<p>
	 *
	 */
	public static final String $inc_can_flg = "inc_can_flg";
	public static final String $cst_grp_p = "cst_grp_p";
	public static final String $dlv_grp_p = "dlv_grp_p";
	public static final String $itm_grp_p = "itm_grp_p";

	public static final String $itm_typ = $itm_typ_p + ".itm_typ";
	public static final String $itm_typ_d_cd = $itm_typ_p + ".itm_typ_d_cd";
	public static final String $itm_typ_d_nm = $itm_typ_p + ".itm_typ_d_nm";
	public static final String $itm_cd = $itm_p + ".itm_cd";
	public static final String $itm_sub1 = $itm_p + ".itm_sub1";
	public static final String $itm_sub2 = $itm_p + ".itm_sub2";
	public static final String $itm_sub3 = $itm_p + ".itm_sub3";
	public static final String $itm_nm = $itm_p + ".itm_nm";
	public static final String $sno1 = $sno_p + ".sno1";
	public static final String $sno2 = $sno_p + ".sno2";
	public static final String $sno3 = $sno_p + ".sno3";
	public static final String $sno4 = $sno_p + ".sno4";
	public static final String $wrk_no = $sno_p + ".wrk_no";
	public static final String $wrk_nm = $sno_p + ".wrk_nm";
	public static final String $cst_grp_lab1 = $cst_grp_p + ".bp_grp_lab1";
	public static final String $cst_grp_flg1 = $cst_grp_p + ".bp_grp_flg1";
	public static final String $cst_grp_cd1 = $cst_grp_p + ".bp_grp_cd1";
	public static final String $cst_grp_nm1 = $cst_grp_p + ".bp_grp_nm1";
	public static final String $cst_grp_lab2 = $cst_grp_p + ".bp_grp_lab2";
	public static final String $cst_grp_flg2 = $cst_grp_p + ".bp_grp_flg2";
	public static final String $cst_grp_cd2 = $cst_grp_p + ".bp_grp_cd2";
	public static final String $cst_grp_nm2 = $cst_grp_p + ".bp_grp_nm2";
	public static final String $cst_grp_lab3 = $cst_grp_p + ".bp_grp_lab3";
	public static final String $cst_grp_flg3 = $cst_grp_p + ".bp_grp_flg3";
	public static final String $cst_grp_cd3 = $cst_grp_p + ".bp_grp_cd3";
	public static final String $cst_grp_nm3 = $cst_grp_p + ".bp_grp_nm3";
	public static final String $cst_grp_lab4 = $cst_grp_p + ".bp_grp_lab4";
	public static final String $cst_grp_flg4 = $cst_grp_p + ".bp_grp_flg4";
	public static final String $cst_grp_cd4 = $cst_grp_p + ".bp_grp_cd4";
	public static final String $cst_grp_nm4 = $cst_grp_p + ".bp_grp_nm4";
	public static final String $cst_grp_lab5 = $cst_grp_p + ".bp_grp_lab5";
	public static final String $cst_grp_flg5 = $cst_grp_p + ".bp_grp_flg5";
	public static final String $cst_grp_cd5 = $cst_grp_p + ".bp_grp_cd5";
	public static final String $cst_grp_nm5 = $cst_grp_p + ".bp_grp_nm5";
	public static final String $cst_grp_lab6 = $cst_grp_p + ".bp_grp_lab6";
	public static final String $cst_grp_flg6 = $cst_grp_p + ".bp_grp_flg6";
	public static final String $cst_grp_cd6 = $cst_grp_p + ".bp_grp_cd6";
	public static final String $cst_grp_nm6 = $cst_grp_p + ".bp_grp_nm6";
	public static final String $cst_grp_lab7 = $cst_grp_p + ".bp_grp_lab7";
	public static final String $cst_grp_flg7 = $cst_grp_p + ".bp_grp_flg7";
	public static final String $cst_grp_cd7 = $cst_grp_p + ".bp_grp_cd7";
	public static final String $cst_grp_nm7 = $cst_grp_p + ".bp_grp_nm7";
	public static final String $cst_grp_lab8 = $cst_grp_p + ".bp_grp_lab8";
	public static final String $cst_grp_flg8 = $cst_grp_p + ".bp_grp_flg8";
	public static final String $cst_grp_cd8 = $cst_grp_p + ".bp_grp_cd8";
	public static final String $cst_grp_nm8 = $cst_grp_p + ".bp_grp_nm8";
	public static final String $cst_grp_lab9 = $cst_grp_p + ".bp_grp_lab9";
	public static final String $cst_grp_flg9 = $cst_grp_p + ".bp_grp_flg9";
	public static final String $cst_grp_cd9 = $cst_grp_p + ".bp_grp_cd9";
	public static final String $cst_grp_nm9 = $cst_grp_p + ".bp_grp_nm9";
	public static final String $cst_grp_lab10 = $cst_grp_p + ".bp_grp_lab10";
	public static final String $cst_grp_flg10 = $cst_grp_p + ".bp_grp_flg10";
	public static final String $cst_grp_cd10 = $cst_grp_p + ".bp_grp_cd10";
	public static final String $cst_grp_nm10 = $cst_grp_p + ".bp_grp_nm10";
	public static final String $dlv_grp_lab1 = $dlv_grp_p + ".bp_grp_lab1";
	public static final String $dlv_grp_flg1 = $dlv_grp_p + ".bp_grp_flg1";
	public static final String $dlv_grp_cd1 = $dlv_grp_p + ".bp_grp_cd1";
	public static final String $dlv_grp_nm1 = $dlv_grp_p + ".bp_grp_nm1";
	public static final String $dlv_grp_lab2 = $dlv_grp_p + ".bp_grp_lab2";
	public static final String $dlv_grp_flg2 = $dlv_grp_p + ".bp_grp_flg2";
	public static final String $dlv_grp_cd2 = $dlv_grp_p + ".bp_grp_cd2";
	public static final String $dlv_grp_nm2 = $dlv_grp_p + ".bp_grp_nm2";
	public static final String $dlv_grp_lab3 = $dlv_grp_p + ".bp_grp_lab3";
	public static final String $dlv_grp_flg3 = $dlv_grp_p + ".bp_grp_flg3";
	public static final String $dlv_grp_cd3 = $dlv_grp_p + ".bp_grp_cd3";
	public static final String $dlv_grp_nm3 = $dlv_grp_p + ".bp_grp_nm3";
	public static final String $dlv_grp_lab4 = $dlv_grp_p + ".bp_grp_lab4";
	public static final String $dlv_grp_flg4 = $dlv_grp_p + ".bp_grp_flg4";
	public static final String $dlv_grp_cd4 = $dlv_grp_p + ".bp_grp_cd4";
	public static final String $dlv_grp_nm4 = $dlv_grp_p + ".bp_grp_nm4";
	public static final String $dlv_grp_lab5 = $dlv_grp_p + ".bp_grp_lab5";
	public static final String $dlv_grp_flg5 = $dlv_grp_p + ".bp_grp_flg5";
	public static final String $dlv_grp_cd5 = $dlv_grp_p + ".bp_grp_cd5";
	public static final String $dlv_grp_nm5 = $dlv_grp_p + ".bp_grp_nm5";
	public static final String $dlv_grp_lab6 = $dlv_grp_p + ".bp_grp_lab6";
	public static final String $dlv_grp_flg6 = $dlv_grp_p + ".bp_grp_flg6";
	public static final String $dlv_grp_cd6 = $dlv_grp_p + ".bp_grp_cd6";
	public static final String $dlv_grp_nm6 = $dlv_grp_p + ".bp_grp_nm6";
	public static final String $dlv_grp_lab7 = $dlv_grp_p + ".bp_grp_lab7";
	public static final String $dlv_grp_flg7 = $dlv_grp_p + ".bp_grp_flg7";
	public static final String $dlv_grp_cd7 = $dlv_grp_p + ".bp_grp_cd7";
	public static final String $dlv_grp_nm7 = $dlv_grp_p + ".bp_grp_nm7";
	public static final String $dlv_grp_lab8 = $dlv_grp_p + ".bp_grp_lab8";
	public static final String $dlv_grp_flg8 = $dlv_grp_p + ".bp_grp_flg8";
	public static final String $dlv_grp_cd8 = $dlv_grp_p + ".bp_grp_cd8";
	public static final String $dlv_grp_nm8 = $dlv_grp_p + ".bp_grp_nm8";
	public static final String $dlv_grp_lab9 = $dlv_grp_p + ".bp_grp_lab9";
	public static final String $dlv_grp_flg9 = $dlv_grp_p + ".bp_grp_flg9";
	public static final String $dlv_grp_cd9 = $dlv_grp_p + ".bp_grp_cd9";
	public static final String $dlv_grp_nm9 = $dlv_grp_p + ".bp_grp_nm9";
	public static final String $dlv_grp_lab10 = $dlv_grp_p + ".bp_grp_lab10";
	public static final String $dlv_grp_flg10 = $dlv_grp_p + ".bp_grp_flg10";
	public static final String $dlv_grp_cd10 = $dlv_grp_p + ".bp_grp_cd10";
	public static final String $dlv_grp_nm10 = $dlv_grp_p + ".bp_grp_nm10";
	public static final String $itm_grp_lab1 = $itm_grp_p + ".itm_grp_lab1";
	public static final String $itm_grp_flg1 = $itm_grp_p + ".itm_grp_flg1";
	public static final String $itm_grp_cd1 = $itm_grp_p + ".itm_grp_cd1";
	public static final String $itm_grp_nm1 = $itm_grp_p + ".itm_grp_nm1";
	public static final String $itm_grp_lab2 = $itm_grp_p + ".itm_grp_lab2";
	public static final String $itm_grp_flg2 = $itm_grp_p + ".itm_grp_flg2";
	public static final String $itm_grp_cd2 = $itm_grp_p + ".itm_grp_cd2";
	public static final String $itm_grp_nm2 = $itm_grp_p + ".itm_grp_nm2";
	public static final String $itm_grp_lab3 = $itm_grp_p + ".itm_grp_lab3";
	public static final String $itm_grp_flg3 = $itm_grp_p + ".itm_grp_flg3";
	public static final String $itm_grp_cd3 = $itm_grp_p + ".itm_grp_cd3";
	public static final String $itm_grp_nm3 = $itm_grp_p + ".itm_grp_nm3";
	public static final String $itm_grp_lab4 = $itm_grp_p + ".itm_grp_lab4";
	public static final String $itm_grp_flg4 = $itm_grp_p + ".itm_grp_flg4";
	public static final String $itm_grp_cd4 = $itm_grp_p + ".itm_grp_cd4";
	public static final String $itm_grp_nm4 = $itm_grp_p + ".itm_grp_nm4";
	public static final String $itm_grp_lab5 = $itm_grp_p + ".itm_grp_lab5";
	public static final String $itm_grp_flg5 = $itm_grp_p + ".itm_grp_flg5";
	public static final String $itm_grp_cd5 = $itm_grp_p + ".itm_grp_cd5";
	public static final String $itm_grp_nm5 = $itm_grp_p + ".itm_grp_nm5";
	public static final String $itm_grp_lab6 = $itm_grp_p + ".itm_grp_lab6";
	public static final String $itm_grp_flg6 = $itm_grp_p + ".itm_grp_flg6";
	public static final String $itm_grp_cd6 = $itm_grp_p + ".itm_grp_cd6";
	public static final String $itm_grp_nm6 = $itm_grp_p + ".itm_grp_nm6";
	public static final String $itm_grp_lab7 = $itm_grp_p + ".itm_grp_lab7";
	public static final String $itm_grp_flg7 = $itm_grp_p + ".itm_grp_flg7";
	public static final String $itm_grp_cd7 = $itm_grp_p + ".itm_grp_cd7";
	public static final String $itm_grp_nm7 = $itm_grp_p + ".itm_grp_nm7";
	public static final String $itm_grp_lab8 = $itm_grp_p + ".itm_grp_lab8";
	public static final String $itm_grp_flg8 = $itm_grp_p + ".itm_grp_flg8";
	public static final String $itm_grp_cd8 = $itm_grp_p + ".itm_grp_cd8";
	public static final String $itm_grp_nm8 = $itm_grp_p + ".itm_grp_nm8";
	public static final String $itm_grp_lab9 = $itm_grp_p + ".itm_grp_lab9";
	public static final String $itm_grp_flg9 = $itm_grp_p + ".itm_grp_flg9";
	public static final String $itm_grp_cd9 = $itm_grp_p + ".itm_grp_cd9";
	public static final String $itm_grp_nm9 = $itm_grp_p + ".itm_grp_nm9";
	public static final String $itm_grp_lab10 = $itm_grp_p + ".itm_grp_lab10";
	public static final String $itm_grp_flg10 = $itm_grp_p + ".itm_grp_flg10";
	public static final String $itm_grp_cd10 = $itm_grp_p + ".itm_grp_cd10";
	public static final String $itm_grp_nm10 = $itm_grp_p + ".itm_grp_nm10";

	public static final MCMeta ope_META = createStringMeta($ope);
	public static final MCMeta disp_META = createStringMeta($disp);
	public static final MCMeta creating_META = createCommonMeta($creating, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta pre_qtn_META = createCommonMeta($pre_qtn, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta qtn_META = createCommonMeta($qtn, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta non_META = createCommonMeta($non, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta part_META = createCommonMeta($part, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta compl_META = createCommonMeta($compl, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta opn_META = createCommonMeta($opn, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta fix_META = createCommonMeta($fix, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta acpt_META = createCommonMeta($acpt, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rjct_META = createCommonMeta($rjct, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta last_rjct_META = createCommonMeta($last_rjct, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta excld_META = createCommonMeta($excld, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta yet_META = createCommonMeta($yet, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta prnt_META = createCommonMeta($prnt, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta iv_trgt_flg_META = createCommonMeta($iv_trgt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta iv_not_trgt_flg_META = createCommonMeta($iv_not_trgt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta qtn_dt_fr_META = createCommonMeta($qtn_dt_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta qtn_dt_to_META = createCommonMeta($qtn_dt_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta valid_dt_fr_META = createCommonMeta($valid_dt_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta valid_dt_to_META = createCommonMeta($valid_dt_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta rcpt_dt_fr_META = createCommonMeta($rcpt_dt_fr, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta rcpt_dt_to_META = createCommonMeta($rcpt_dt_to, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta sls_usr_cd_META = createCommonMeta($sls_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta sls_usr_nm_META = createCommonMeta($sls_usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta sls_dpt_cd_META = createCommonMeta($sls_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta sls_dpt_nm_META = createCommonMeta($sls_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta wg_nm_META = createCommonMeta($wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta rcpt_usr_cd_META = createCommonMeta($rcpt_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta rcpt_usr_nm_META = createCommonMeta($rcpt_usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta cst_cd_META = createCommonMeta($cst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta cst_nm_META = createCommonMeta($cst_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta dlv_cd_META = createCommonMeta($dlv_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta dlv_nm_META = createCommonMeta($dlv_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta dest_cd1_META = createCommonMeta($dest_cd1, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta dest_nm1_META = createCommonMeta($dest_nm1, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta dest_cd2_META = createCommonMeta($dest_cd2, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta dest_nm2_META = createCommonMeta($dest_nm2, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta dest_cd3_META = createCommonMeta($dest_cd3, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta dest_nm3_META = createCommonMeta($dest_nm3, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta qtn_no_META = createCommonMeta($qtn_no, mcframe.commonMA.meta.MA_META.QTN_NO);
	public static final MCMeta qtn_rev_META = createCommonMeta($qtn_rev, mcframe.commonMA.meta.MA_META.SLIP_REV);
	public static final MCMeta cst_qtn_rqst_no_META = createCommonMeta($cst_qtn_rqst_no, mcframe.commonMA.meta.MA_META.CST_QTN_RQST_NO);
	public static final MCMeta cst_qtn_rqst_d_no_META = createCommonMeta($cst_qtn_rqst_d_no, mcframe.commonMA.meta.MA_META.CST_QTN_RQST_D_NO);
	public static final MCMeta itm_typ_p_META = createInnerRowMeta($itm_typ_p, mcframe.clientMAUB.MAUBP0100.ItmTypR.class);
	public static final MCMeta cst_itm_cd_META = createCommonMeta($cst_itm_cd, mcframe.commonMA.meta.MA_META.BP_ITM_CD);
	public static final MCMeta cst_itm_nm_META = createCommonMeta($cst_itm_nm, mcframe.commonMA.meta.MA_META.BP_ITM_NM);
	public static final MCMeta itm_p_META = createInnerRowMeta($itm_p, mcframe.clientMAUB.MAUBP0030.ItmR.class);
	public static final MCMeta sno_p_META = createInnerRowMeta($sno_p, mcframe.clientMSUB.MSUBP0020.SnoWrkNoR.class);
	public static final MCMeta trd_cd_META = createCommonMeta($trd_cd, mcframe.commonMA.meta.MA_META.TRD_CD);
	public static final MCMeta trd_nm_META = createCommonMeta($trd_nm, mcframe.commonMA.meta.MA_META.TRD_NM);
	public static final MCMeta trd_cur_cd_META = createCommonMeta($trd_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta trd_cur_nm_META = createCommonMeta($trd_cur_nm, mcframe.commonMA.meta.MA_META.CUR_NM);
	public static final MCMeta gd_cd_META = createCommonMeta($gd_cd, mcframe.commonMA.meta.MA_META.STK_GD_CD);
	public static final MCMeta gd_nm_META = createCommonMeta($gd_nm, mcframe.commonMA.meta.MA_META.STK_GD_NM);
	public static final MCMeta qtn_term_cd_META = createCommonMeta($qtn_term_cd, mcframe.commonMS.meta.MS_META.SLO_RSN_CD);
	public static final MCMeta qtn_term_nm_META = createCommonMeta($qtn_term_nm, mcframe.commonMS.meta.MS_META.SLO_RSN_NM);
	public static final MCMeta qtn_rslt_rsn_cd_META = createCommonMeta($qtn_rslt_rsn_cd, mcframe.commonMS.meta.MS_META.SLO_RSN_CD);
	public static final MCMeta qtn_rslt_rsn_nm_META = createCommonMeta($qtn_rslt_rsn_nm, mcframe.commonMS.meta.MS_META.SLO_RSN_NM);
	public static final MCMeta qtn_d_rslt_rsn_cd_META = createCommonMeta($qtn_d_rslt_rsn_cd, mcframe.commonMS.meta.MS_META.SLO_RSN_CD);
	public static final MCMeta qtn_d_rslt_rsn_nm_META = createCommonMeta($qtn_d_rslt_rsn_nm, mcframe.commonMS.meta.MS_META.SLO_RSN_NM);
	public static final MCMeta qtn_rmrks_META = createCommonMeta($qtn_rmrks, mcframe.commonMS.meta.MS_META.QTN_RMRKS);
	public static final MCMeta qtn_d_rmrks_META = createCommonMeta($qtn_d_rmrks, mcframe.commonMS.meta.MS_META.QTN_D_RMRKS);
	public static final MCMeta intr_rmrks_META = createCommonMeta($intr_rmrks, mcframe.commonMS.meta.MS_META.QTN_INTR_RMRKS);
	public static final MCMeta intr_d_rmrks_META = createCommonMeta($intr_d_rmrks, mcframe.commonMS.meta.MS_META.QTN_D_INTR_RMRKS);
	public static final MCMeta qtn_sub_char1_META = createCommonMeta($qtn_sub_char1, mcframe.commonMS.meta.MS_META.QTN_SUB_CHAR1);
	public static final MCMeta qtn_sub_char2_META = createCommonMeta($qtn_sub_char2, mcframe.commonMS.meta.MS_META.QTN_SUB_CHAR2);
	public static final MCMeta qtn_sub_char3_META = createCommonMeta($qtn_sub_char3, mcframe.commonMS.meta.MS_META.QTN_SUB_CHAR3);
	public static final MCMeta qtn_d_sub_char1_META = createCommonMeta($qtn_d_sub_char1, mcframe.commonMS.meta.MS_META.QTN_D_SUB_CHAR1);
	public static final MCMeta qtn_d_sub_char2_META = createCommonMeta($qtn_d_sub_char2, mcframe.commonMS.meta.MS_META.QTN_D_SUB_CHAR2);
	public static final MCMeta qtn_d_sub_char3_META = createCommonMeta($qtn_d_sub_char3, mcframe.commonMS.meta.MS_META.QTN_D_SUB_CHAR3);
	public static final MCMeta inc_failure_flg_META = createCommonMeta($inc_failure_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta inc_can_flg_META = createCommonMeta($inc_can_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cst_grp_p_META = createInnerRowMeta($cst_grp_p, mcframe.clientMAUB.MAUBP0260.BpGrpR.class);
	public static final MCMeta dlv_grp_p_META = createInnerRowMeta($dlv_grp_p, mcframe.clientMAUB.MAUBP0260.BpGrpR.class);
	public static final MCMeta itm_grp_p_META = createInnerRowMeta($itm_grp_p, mcframe.clientMAUB.MAUBP0250.ItmGrpR.class);

	protected static final ConstMetaList<CndR> constMetas = new ConstMetaList<CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			ope_META,
			disp_META,
			creating_META,
			pre_qtn_META,
			qtn_META,
			non_META,
			part_META,
			compl_META,
			opn_META,
			fix_META,
			acpt_META,
			rjct_META,
			last_rjct_META,
			excld_META,
			yet_META,
			prnt_META,
			iv_trgt_flg_META,
			iv_not_trgt_flg_META,
			qtn_dt_fr_META,
			qtn_dt_to_META,
			valid_dt_fr_META,
			valid_dt_to_META,
			rcpt_dt_fr_META,
			rcpt_dt_to_META,
			sls_usr_cd_META,
			sls_usr_nm_META,
			sls_dpt_cd_META,
			sls_dpt_nm_META,
			wg_cd_META,
			wg_nm_META,
			rcpt_usr_cd_META,
			rcpt_usr_nm_META,
			cst_cd_META,
			cst_nm_META,
			dlv_cd_META,
			dlv_nm_META,
			dest_cd1_META,
			dest_nm1_META,
			dest_cd2_META,
			dest_nm2_META,
			dest_cd3_META,
			dest_nm3_META,
			qtn_no_META,
			qtn_rev_META,
			cst_qtn_rqst_no_META,
			cst_qtn_rqst_d_no_META,
			itm_typ_p_META,
			cst_itm_cd_META,
			cst_itm_nm_META,
			itm_p_META,
			sno_p_META,
			trd_cd_META,
			trd_nm_META,
			trd_cur_cd_META,
			trd_cur_nm_META,
			gd_cd_META,
			gd_nm_META,
			qtn_term_cd_META,
			qtn_term_nm_META,
			qtn_rslt_rsn_cd_META,
			qtn_rslt_rsn_nm_META,
			qtn_d_rslt_rsn_cd_META,
			qtn_d_rslt_rsn_nm_META,
			qtn_rmrks_META,
			qtn_d_rmrks_META,
			intr_rmrks_META,
			intr_d_rmrks_META,
			qtn_sub_char1_META,
			qtn_sub_char2_META,
			qtn_sub_char3_META,
			qtn_d_sub_char1_META,
			qtn_d_sub_char2_META,
			qtn_d_sub_char3_META,
			inc_failure_flg_META,
			inc_can_flg_META,
			cst_grp_p_META,
			dlv_grp_p_META,
			itm_grp_p_META
		},
		new String[][]{
			{
				"itm_typ",
				"itm_typ_d_cd",
				"itm_typ_d_nm",
				"itm_cd",
				"itm_sub1",
				"itm_sub2",
				"itm_sub3",
				"itm_nm",
				"sno1",
				"sno2",
				"sno3",
				"sno4",
				"wrk_no",
				"wrk_nm",
				"cst_grp_flg1",
				"cst_grp_cd1",
				"cst_grp_nm1",
				"cst_grp_flg2",
				"cst_grp_cd2",
				"cst_grp_nm2",
				"cst_grp_flg3",
				"cst_grp_cd3",
				"cst_grp_nm3",
				"cst_grp_flg4",
				"cst_grp_cd4",
				"cst_grp_nm4",
				"cst_grp_flg5",
				"cst_grp_cd5",
				"cst_grp_nm5",
				"cst_grp_flg6",
				"cst_grp_cd6",
				"cst_grp_nm6",
				"cst_grp_flg7",
				"cst_grp_cd7",
				"cst_grp_nm7",
				"cst_grp_flg8",
				"cst_grp_cd8",
				"cst_grp_nm8",
				"cst_grp_flg9",
				"cst_grp_cd9",
				"cst_grp_nm9",
				"cst_grp_flg10",
				"cst_grp_cd10",
				"cst_grp_nm10",
				"dlv_grp_flg1",
				"dlv_grp_cd1",
				"dlv_grp_nm1",
				"dlv_grp_flg2",
				"dlv_grp_cd2",
				"dlv_grp_nm2",
				"dlv_grp_flg3",
				"dlv_grp_cd3",
				"dlv_grp_nm3",
				"dlv_grp_flg4",
				"dlv_grp_cd4",
				"dlv_grp_nm4",
				"dlv_grp_flg5",
				"dlv_grp_cd5",
				"dlv_grp_nm5",
				"dlv_grp_flg6",
				"dlv_grp_cd6",
				"dlv_grp_nm6",
				"dlv_grp_flg7",
				"dlv_grp_cd7",
				"dlv_grp_nm7",
				"dlv_grp_flg8",
				"dlv_grp_cd8",
				"dlv_grp_nm8",
				"dlv_grp_flg9",
				"dlv_grp_cd9",
				"dlv_grp_nm9",
				"dlv_grp_flg10",
				"dlv_grp_cd10",
				"dlv_grp_nm10",
				"itm_grp_flg1",
				"itm_grp_cd1",
				"itm_grp_nm1",
				"itm_grp_flg2",
				"itm_grp_cd2",
				"itm_grp_nm2",
				"itm_grp_flg3",
				"itm_grp_cd3",
				"itm_grp_nm3",
				"itm_grp_flg4",
				"itm_grp_cd4",
				"itm_grp_nm4",
				"itm_grp_flg5",
				"itm_grp_cd5",
				"itm_grp_nm5",
				"itm_grp_flg6",
				"itm_grp_cd6",
				"itm_grp_nm6",
				"itm_grp_flg7",
				"itm_grp_cd7",
				"itm_grp_nm7",
				"itm_grp_flg8",
				"itm_grp_cd8",
				"itm_grp_nm8",
				"itm_grp_flg9",
				"itm_grp_cd9",
				"itm_grp_nm9",
				"itm_grp_flg10",
				"itm_grp_cd10",
				"itm_grp_nm10"
			},
			{
				$itm_typ,
				$itm_typ_d_cd,
				$itm_typ_d_nm,
				$itm_cd,
				$itm_sub1,
				$itm_sub2,
				$itm_sub3,
				$itm_nm,
				$sno1,
				$sno2,
				$sno3,
				$sno4,
				$wrk_no,
				$wrk_nm,
				$cst_grp_flg1,
				$cst_grp_cd1,
				$cst_grp_nm1,
				$cst_grp_flg2,
				$cst_grp_cd2,
				$cst_grp_nm2,
				$cst_grp_flg3,
				$cst_grp_cd3,
				$cst_grp_nm3,
				$cst_grp_flg4,
				$cst_grp_cd4,
				$cst_grp_nm4,
				$cst_grp_flg5,
				$cst_grp_cd5,
				$cst_grp_nm5,
				$cst_grp_flg6,
				$cst_grp_cd6,
				$cst_grp_nm6,
				$cst_grp_flg7,
				$cst_grp_cd7,
				$cst_grp_nm7,
				$cst_grp_flg8,
				$cst_grp_cd8,
				$cst_grp_nm8,
				$cst_grp_flg9,
				$cst_grp_cd9,
				$cst_grp_nm9,
				$cst_grp_flg10,
				$cst_grp_cd10,
				$cst_grp_nm10,
				$dlv_grp_flg1,
				$dlv_grp_cd1,
				$dlv_grp_nm1,
				$dlv_grp_flg2,
				$dlv_grp_cd2,
				$dlv_grp_nm2,
				$dlv_grp_flg3,
				$dlv_grp_cd3,
				$dlv_grp_nm3,
				$dlv_grp_flg4,
				$dlv_grp_cd4,
				$dlv_grp_nm4,
				$dlv_grp_flg5,
				$dlv_grp_cd5,
				$dlv_grp_nm5,
				$dlv_grp_flg6,
				$dlv_grp_cd6,
				$dlv_grp_nm6,
				$dlv_grp_flg7,
				$dlv_grp_cd7,
				$dlv_grp_nm7,
				$dlv_grp_flg8,
				$dlv_grp_cd8,
				$dlv_grp_nm8,
				$dlv_grp_flg9,
				$dlv_grp_cd9,
				$dlv_grp_nm9,
				$dlv_grp_flg10,
				$dlv_grp_cd10,
				$dlv_grp_nm10,
				$itm_grp_flg1,
				$itm_grp_cd1,
				$itm_grp_nm1,
				$itm_grp_flg2,
				$itm_grp_cd2,
				$itm_grp_nm2,
				$itm_grp_flg3,
				$itm_grp_cd3,
				$itm_grp_nm3,
				$itm_grp_flg4,
				$itm_grp_cd4,
				$itm_grp_nm4,
				$itm_grp_flg5,
				$itm_grp_cd5,
				$itm_grp_nm5,
				$itm_grp_flg6,
				$itm_grp_cd6,
				$itm_grp_nm6,
				$itm_grp_flg7,
				$itm_grp_cd7,
				$itm_grp_nm7,
				$itm_grp_flg8,
				$itm_grp_cd8,
				$itm_grp_nm8,
				$itm_grp_flg9,
				$itm_grp_cd9,
				$itm_grp_nm9,
				$itm_grp_flg10,
				$itm_grp_cd10,
				$itm_grp_nm10
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
				{$sls_usr_cd, "usr_nm"},	// sls_usr_cd
				{$sls_dpt_cd, "dpt_nm"},	// sls_dpt_cd
				{$rcpt_usr_cd, "usr_nm"},	// rcpt_usr_cd
				{$cst_cd, "bp_nm"},	// cst_cd
				{$dlv_cd, "bp_nm"},	// dlv_cd
				{$dest_cd1, "bp_nm"},	// dest_cd1
				{$dest_cd2, "bp_nm"},	// dest_cd2
				{$dest_cd3, "bp_nm"},	// dest_cd3
				{$cst_itm_cd, "bp_itm_nm"},	// cst_itm_cd
				{$trd_cur_cd, "cur_nm"},	// trd_cur_cd
				{$qtn_term_cd, "slo_rsn_nm"},	// qtn_term_cd
				{$qtn_rslt_rsn_cd, "slo_rsn_nm"},	// qtn_rslt_rsn_cd
				{$qtn_d_rslt_rsn_cd, "slo_rsn_nm"}	// qtn_d_rslt_rsn_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$sls_dpt_cd, "MAC_DPT_IS_SRCH_TYP.SLS;true;true"},	// sls_dpt_cd
				{$cst_cd, "MAC_BP_IS_SRCH_TYP.CST;true"},	// cst_cd
				{$dlv_cd, "MAC_BP_IS_SRCH_TYP.DLV"},	// dlv_cd
				{$dest_cd1, "MAC_BP_IS_SRCH_TYP.DEST"},	// dest_cd1
				{$dest_cd2, "MAC_BP_IS_SRCH_TYP.DEST"},	// dest_cd2
				{$dest_cd3, "MAC_BP_IS_SRCH_TYP.DEST"},	// dest_cd3
				{$itm_p + ".itm_cd", "MAC_ITM_IS_SRCH_TYP.NOT_ASSET3;true"},	// itm_p.itm_cd
				{$itm_p + ".itm_sub1", "MAC_ITM_IS_SRCH_TYP.NOT_ASSET3;true"},	// itm_p.itm_sub1
				{$itm_p + ".itm_sub2", "MAC_ITM_IS_SRCH_TYP.NOT_ASSET3;true"},	// itm_p.itm_sub2
				{$itm_p + ".itm_sub3", "MAC_ITM_IS_SRCH_TYP.NOT_ASSET3;true"}	// itm_p.itm_sub3
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$sls_dpt_cd, "dpt_is_srch_typ;mode_today_flg;dpt_nm_rem_flg"},	// sls_dpt_cd
				{$cst_cd, "bp_is_srch_typ;sundry_bp_nm_rem_flg"},	// cst_cd
				{$dlv_cd, "bp_is_srch_typ"},	// dlv_cd
				{$dest_cd1, "bp_is_srch_typ"},	// dest_cd1
				{$dest_cd2, "bp_is_srch_typ"},	// dest_cd2
				{$dest_cd3, "bp_is_srch_typ"},	// dest_cd3
				{$itm_p + ".itm_cd", "itm_is_srch_typ;sundry_itm_nm_rem_flg"},	// itm_p.itm_cd
				{$itm_p + ".itm_sub1", "itm_is_srch_typ;sundry_itm_nm_rem_flg"},	// itm_p.itm_sub1
				{$itm_p + ".itm_sub2", "itm_is_srch_typ;sundry_itm_nm_rem_flg"},	// itm_p.itm_sub2
				{$itm_p + ".itm_sub3", "itm_is_srch_typ;sundry_itm_nm_rem_flg"}	// itm_p.itm_sub3
			}
		)),
		new MCExtMap.Entry($$DISP_CTL, new MCExtList(
			new String[][]{
				{$wg_cd, "WG"},	// wg_cd
				{$wg_nm, "WG"},	// wg_nm
				{$dest_cd1, "DEST1"},	// dest_cd1
				{$dest_nm1, "DEST1"},	// dest_nm1
				{$dest_cd2, "DEST2"},	// dest_cd2
				{$dest_nm2, "DEST2"},	// dest_nm2
				{$dest_cd3, "DEST3"},	// dest_cd3
				{$dest_nm3, "DEST3"},	// dest_nm3
				{$gd_cd, "STK_GD"},	// gd_cd
				{$gd_nm, "STK_GD"}	// gd_nm
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
	protected CndR_MC_A(ConstMetaList<? extends CndR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public CndR clone() {
		return (CndR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public CndR createInstance() {
		return (CndR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public CndR getValues(String... names) {
		return (CndR) super.getValues(names);
	}



	/**
	 * PRNT,Issue report;REF,View; PRNT,帳票発行する;REF,参照する;.<p>
	 *
	 */
	public String ope() {
		return getConstString(offset + 0, $ope);
	}

	/**
	 * PRNT,Issue report;REF,View; PRNT,帳票発行する;REF,参照する;.<p>
	 *
	 */
	public void ope(String value) {
		setConstString(offset + 0, $ope, value);
	}


	/**
	 * DTL,Details,DTL;HDR,Header,HDR DTL,明細,DTL;HDR,ヘッダ,HDR.<p>
	 *
	 */
	public String disp() {
		return getConstString(offset + 1, $disp);
	}

	/**
	 * DTL,Details,DTL;HDR,Header,HDR DTL,明細,DTL;HDR,ヘッダ,HDR.<p>
	 *
	 */
	public void disp(String value) {
		setConstString(offset + 1, $disp, value);
	}


	/**
	 * Creating 作成中.<p>
	 *
	 */
	public boolean creating() {
		return getConstBoolean(offset + 2, $creating);
	}

	/**
	 * Creating 作成中.<p>
	 *
	 */
	public void creating(boolean value) {
		setConstBoolean(offset + 2, $creating, value);
	}


	/**
	 * Temporary quotation 仮見積.<p>
	 *
	 */
	public boolean pre_qtn() {
		return getConstBoolean(offset + 3, $pre_qtn);
	}

	/**
	 * Temporary quotation 仮見積.<p>
	 *
	 */
	public void pre_qtn(boolean value) {
		setConstBoolean(offset + 3, $pre_qtn, value);
	}


	/**
	 * Quotation 本見積.<p>
	 *
	 */
	public boolean qtn() {
		return getConstBoolean(offset + 4, $qtn);
	}

	/**
	 * Quotation 本見積.<p>
	 *
	 */
	public void qtn(boolean value) {
		setConstBoolean(offset + 4, $qtn, value);
	}


	/**
	 * Uncopied 未引継.<p>
	 *
	 */
	public boolean non() {
		return getConstBoolean(offset + 5, $non);
	}

	/**
	 * Uncopied 未引継.<p>
	 *
	 */
	public void non(boolean value) {
		setConstBoolean(offset + 5, $non, value);
	}


	/**
	 * Partial copy 一部引継.<p>
	 *
	 */
	public boolean part() {
		return getConstBoolean(offset + 6, $part);
	}

	/**
	 * Partial copy 一部引継.<p>
	 *
	 */
	public void part(boolean value) {
		setConstBoolean(offset + 6, $part, value);
	}


	/**
	 * Copy all 全引継.<p>
	 *
	 */
	public boolean compl() {
		return getConstBoolean(offset + 7, $compl);
	}

	/**
	 * Copy all 全引継.<p>
	 *
	 */
	public void compl(boolean value) {
		setConstBoolean(offset + 7, $compl, value);
	}


	/**
	 * Waiting 未承認.<p>
	 *
	 */
	public boolean opn() {
		return getConstBoolean(offset + 8, $opn);
	}

	/**
	 * Waiting 未承認.<p>
	 *
	 */
	public void opn(boolean value) {
		setConstBoolean(offset + 8, $opn, value);
	}


	/**
	 * Preliminary approval 一次承認済.<p>
	 *
	 */
	public boolean fix() {
		return getConstBoolean(offset + 9, $fix);
	}

	/**
	 * Preliminary approval 一次承認済.<p>
	 *
	 */
	public void fix(boolean value) {
		setConstBoolean(offset + 9, $fix, value);
	}


	/**
	 * Final approval 最終承認済.<p>
	 *
	 */
	public boolean acpt() {
		return getConstBoolean(offset + 10, $acpt);
	}

	/**
	 * Final approval 最終承認済.<p>
	 *
	 */
	public void acpt(boolean value) {
		setConstBoolean(offset + 10, $acpt, value);
	}


	/**
	 * Reject 却下.<p>
	 *
	 */
	public boolean rjct() {
		return getConstBoolean(offset + 11, $rjct);
	}

	/**
	 * Reject 却下.<p>
	 *
	 */
	public void rjct(boolean value) {
		setConstBoolean(offset + 11, $rjct, value);
	}


	/**
	 * Denied 否認.<p>
	 *
	 */
	public boolean last_rjct() {
		return getConstBoolean(offset + 12, $last_rjct);
	}

	/**
	 * Denied 否認.<p>
	 *
	 */
	public void last_rjct(boolean value) {
		setConstBoolean(offset + 12, $last_rjct, value);
	}


	/**
	 * Non-target 対象外.<p>
	 *
	 */
	public boolean excld() {
		return getConstBoolean(offset + 13, $excld);
	}

	/**
	 * Non-target 対象外.<p>
	 *
	 */
	public void excld(boolean value) {
		setConstBoolean(offset + 13, $excld, value);
	}


	/**
	 * Unissued 未発行.<p>
	 *
	 */
	public boolean yet() {
		return getConstBoolean(offset + 14, $yet);
	}

	/**
	 * Unissued 未発行.<p>
	 *
	 */
	public void yet(boolean value) {
		setConstBoolean(offset + 14, $yet, value);
	}


	/**
	 * Issued 発行済.<p>
	 *
	 */
	public boolean prnt() {
		return getConstBoolean(offset + 15, $prnt);
	}

	/**
	 * Issued 発行済.<p>
	 *
	 */
	public void prnt(boolean value) {
		setConstBoolean(offset + 15, $prnt, value);
	}


	/**
	 * Target 対象.<p>
	 *
	 */
	public boolean iv_trgt_flg() {
		return getConstBoolean(offset + 16, $iv_trgt_flg);
	}

	/**
	 * Target 対象.<p>
	 *
	 */
	public void iv_trgt_flg(boolean value) {
		setConstBoolean(offset + 16, $iv_trgt_flg, value);
	}


	/**
	 * Non-target 対象外.<p>
	 *
	 */
	public boolean iv_not_trgt_flg() {
		return getConstBoolean(offset + 17, $iv_not_trgt_flg);
	}

	/**
	 * Non-target 対象外.<p>
	 *
	 */
	public void iv_not_trgt_flg(boolean value) {
		setConstBoolean(offset + 17, $iv_not_trgt_flg, value);
	}


	/**
	 * Quotation date FROM 見積日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate qtn_dt_fr() {
		return getConstDate(offset + 18, $qtn_dt_fr);
	}

	/**
	 * Quotation date FROM 見積日ＦＲＯＭ.<p>
	 *
	 */
	public void qtn_dt_fr(MCDate value) {
		setConstDate(offset + 18, $qtn_dt_fr, value);
	}


	/**
	 * Quotation date TO 見積日ＴＯ.<p>
	 *
	 */
	public MCDate qtn_dt_to() {
		return getConstDate(offset + 19, $qtn_dt_to);
	}

	/**
	 * Quotation date TO 見積日ＴＯ.<p>
	 *
	 */
	public void qtn_dt_to(MCDate value) {
		setConstDate(offset + 19, $qtn_dt_to, value);
	}


	/**
	 * Quotation expiration date FROM 見積有効期限ＦＲＯＭ.<p>
	 *
	 */
	public MCDate valid_dt_fr() {
		return getConstDate(offset + 20, $valid_dt_fr);
	}

	/**
	 * Quotation expiration date FROM 見積有効期限ＦＲＯＭ.<p>
	 *
	 */
	public void valid_dt_fr(MCDate value) {
		setConstDate(offset + 20, $valid_dt_fr, value);
	}


	/**
	 * Quotation expiration date TO 見積有効期限ＴＯ.<p>
	 *
	 */
	public MCDate valid_dt_to() {
		return getConstDate(offset + 21, $valid_dt_to);
	}

	/**
	 * Quotation expiration date TO 見積有効期限ＴＯ.<p>
	 *
	 */
	public void valid_dt_to(MCDate value) {
		setConstDate(offset + 21, $valid_dt_to, value);
	}


	/**
	 * Receiving date FROM 受付日ＦＲＯＭ.<p>
	 *
	 */
	public MCDate rcpt_dt_fr() {
		return getConstDate(offset + 22, $rcpt_dt_fr);
	}

	/**
	 * Receiving date FROM 受付日ＦＲＯＭ.<p>
	 *
	 */
	public void rcpt_dt_fr(MCDate value) {
		setConstDate(offset + 22, $rcpt_dt_fr, value);
	}


	/**
	 * Receiving date TO 受付日ＴＯ.<p>
	 *
	 */
	public MCDate rcpt_dt_to() {
		return getConstDate(offset + 23, $rcpt_dt_to);
	}

	/**
	 * Receiving date TO 受付日ＴＯ.<p>
	 *
	 */
	public void rcpt_dt_to(MCDate value) {
		setConstDate(offset + 23, $rcpt_dt_to, value);
	}


	/**
	 * Sales PIC cd. 売上担当者ＣＤ.<p>
	 *
	 */
	public String sls_usr_cd() {
		return getConstString(offset + 24, $sls_usr_cd);
	}

	/**
	 * Sales PIC cd. 売上担当者ＣＤ.<p>
	 *
	 */
	public void sls_usr_cd(String value) {
		setConstString(offset + 24, $sls_usr_cd, value);
	}


	/**
	 * Sales PIC name 売上担当者名.<p>
	 *
	 */
	public String sls_usr_nm() {
		return getConstString(offset + 25, $sls_usr_nm);
	}

	/**
	 * Sales PIC name 売上担当者名.<p>
	 *
	 */
	public void sls_usr_nm(String value) {
		setConstString(offset + 25, $sls_usr_nm, value);
	}


	/**
	 * Sales dept. cd. 売上部門ＣＤ.<p>
	 *
	 */
	public String sls_dpt_cd() {
		return getConstString(offset + 26, $sls_dpt_cd);
	}

	/**
	 * Sales dept. cd. 売上部門ＣＤ.<p>
	 *
	 */
	public void sls_dpt_cd(String value) {
		setConstString(offset + 26, $sls_dpt_cd, value);
	}


	/**
	 * Sales dept. name 売上部門名.<p>
	 *
	 */
	public String sls_dpt_nm() {
		return getConstString(offset + 27, $sls_dpt_nm);
	}

	/**
	 * Sales dept. name 売上部門名.<p>
	 *
	 */
	public void sls_dpt_nm(String value) {
		setConstString(offset + 27, $sls_dpt_nm, value);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 28, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 28, $wg_cd, value);
	}


	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public String wg_nm() {
		return getConstString(offset + 29, $wg_nm);
	}

	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public void wg_nm(String value) {
		setConstString(offset + 29, $wg_nm, value);
	}


	/**
	 * Receiving PIC cd. 受付担当者ＣＤ.<p>
	 *
	 */
	public String rcpt_usr_cd() {
		return getConstString(offset + 30, $rcpt_usr_cd);
	}

	/**
	 * Receiving PIC cd. 受付担当者ＣＤ.<p>
	 *
	 */
	public void rcpt_usr_cd(String value) {
		setConstString(offset + 30, $rcpt_usr_cd, value);
	}


	/**
	 * Receiving PIC name 受付担当者名.<p>
	 *
	 */
	public String rcpt_usr_nm() {
		return getConstString(offset + 31, $rcpt_usr_nm);
	}

	/**
	 * Receiving PIC name 受付担当者名.<p>
	 *
	 */
	public void rcpt_usr_nm(String value) {
		setConstString(offset + 31, $rcpt_usr_nm, value);
	}


	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public String cst_cd() {
		return getConstString(offset + 32, $cst_cd);
	}

	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public void cst_cd(String value) {
		setConstString(offset + 32, $cst_cd, value);
	}


	/**
	 * Customer name 得意先名.<p>
	 *
	 */
	public String cst_nm() {
		return getConstString(offset + 33, $cst_nm);
	}

	/**
	 * Customer name 得意先名.<p>
	 *
	 */
	public void cst_nm(String value) {
		setConstString(offset + 33, $cst_nm, value);
	}


	/**
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public String dlv_cd() {
		return getConstString(offset + 34, $dlv_cd);
	}

	/**
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public void dlv_cd(String value) {
		setConstString(offset + 34, $dlv_cd, value);
	}


	/**
	 * Delivery destination name 納品先名.<p>
	 *
	 */
	public String dlv_nm() {
		return getConstString(offset + 35, $dlv_nm);
	}

	/**
	 * Delivery destination name 納品先名.<p>
	 *
	 */
	public void dlv_nm(String value) {
		setConstString(offset + 35, $dlv_nm, value);
	}


	/**
	 * Distribution channel cd. 1 仕向先ＣＤ１.<p>
	 *
	 */
	public String dest_cd1() {
		return getConstString(offset + 36, $dest_cd1);
	}

	/**
	 * Distribution channel cd. 1 仕向先ＣＤ１.<p>
	 *
	 */
	public void dest_cd1(String value) {
		setConstString(offset + 36, $dest_cd1, value);
	}


	/**
	 * Distribution channel name 1 仕向先名１.<p>
	 *
	 */
	public String dest_nm1() {
		return getConstString(offset + 37, $dest_nm1);
	}

	/**
	 * Distribution channel name 1 仕向先名１.<p>
	 *
	 */
	public void dest_nm1(String value) {
		setConstString(offset + 37, $dest_nm1, value);
	}


	/**
	 * Distribution channel cd. 2 仕向先ＣＤ２.<p>
	 *
	 */
	public String dest_cd2() {
		return getConstString(offset + 38, $dest_cd2);
	}

	/**
	 * Distribution channel cd. 2 仕向先ＣＤ２.<p>
	 *
	 */
	public void dest_cd2(String value) {
		setConstString(offset + 38, $dest_cd2, value);
	}


	/**
	 * Distribution channel name 2 仕向先名２.<p>
	 *
	 */
	public String dest_nm2() {
		return getConstString(offset + 39, $dest_nm2);
	}

	/**
	 * Distribution channel name 2 仕向先名２.<p>
	 *
	 */
	public void dest_nm2(String value) {
		setConstString(offset + 39, $dest_nm2, value);
	}


	/**
	 * Distribution channel cd. 3 仕向先ＣＤ３.<p>
	 *
	 */
	public String dest_cd3() {
		return getConstString(offset + 40, $dest_cd3);
	}

	/**
	 * Distribution channel cd. 3 仕向先ＣＤ３.<p>
	 *
	 */
	public void dest_cd3(String value) {
		setConstString(offset + 40, $dest_cd3, value);
	}


	/**
	 * Distribution channel name 3 仕向先名３.<p>
	 *
	 */
	public String dest_nm3() {
		return getConstString(offset + 41, $dest_nm3);
	}

	/**
	 * Distribution channel name 3 仕向先名３.<p>
	 *
	 */
	public void dest_nm3(String value) {
		setConstString(offset + 41, $dest_nm3, value);
	}


	/**
	 * Quotation No. 見積ＮＯ.<p>
	 *
	 */
	public String qtn_no() {
		return getConstString(offset + 42, $qtn_no);
	}

	/**
	 * Quotation No. 見積ＮＯ.<p>
	 *
	 */
	public void qtn_no(String value) {
		setConstString(offset + 42, $qtn_no, value);
	}


	/**
	 * Quotation rev. number 見積改訂番号.<p>
	 *
	 */
	public MCNumber qtn_rev() {
		return getConstNumber(offset + 43, $qtn_rev);
	}

	/**
	 * Quotation rev. number 見積改訂番号.<p>
	 *
	 */
	public void qtn_rev(MCNumber value) {
		setConstNumber(offset + 43, $qtn_rev, value);
	}

	/**
	 * Quotation rev. number 見積改訂番号.<p>
	 *
	 */
	public void qtn_rev(int value) {
		setConstNumber(offset + 43, $qtn_rev, value);
	}

	/**
	 * Quotation rev. number 見積改訂番号.<p>
	 *
	 */
	public void qtn_rev(long value) {
		setConstNumber(offset + 43, $qtn_rev, value);
	}

	/**
	 * Quotation rev. number 見積改訂番号.<p>
	 *
	 */
	public void qtn_rev(float value) {
		setConstNumber(offset + 43, $qtn_rev, value);
	}

	/**
	 * Quotation rev. number 見積改訂番号.<p>
	 *
	 */
	public void qtn_rev(double value) {
		setConstNumber(offset + 43, $qtn_rev, value);
	}


	/**
	 * Customer quotation request No. 得意先見積依頼ＮＯ.<p>
	 *
	 */
	public String cst_qtn_rqst_no() {
		return getConstString(offset + 44, $cst_qtn_rqst_no);
	}

	/**
	 * Customer quotation request No. 得意先見積依頼ＮＯ.<p>
	 *
	 */
	public void cst_qtn_rqst_no(String value) {
		setConstString(offset + 44, $cst_qtn_rqst_no, value);
	}


	/**
	 * Customer quotation request details No. 得意先見積依頼明細ＮＯ.<p>
	 *
	 */
	public String cst_qtn_rqst_d_no() {
		return getConstString(offset + 45, $cst_qtn_rqst_d_no);
	}

	/**
	 * Customer quotation request details No. 得意先見積依頼明細ＮＯ.<p>
	 *
	 */
	public void cst_qtn_rqst_d_no(String value) {
		setConstString(offset + 45, $cst_qtn_rqst_d_no, value);
	}


	public mcframe.clientMAUB.MAUBP0100.ItmTypR itm_typ_p(){
		return (mcframe.clientMAUB.MAUBP0100.ItmTypR) getConstInnerRow(offset + 46, $itm_typ_p);
	}
	
	public void itm_typ_p(mcframe.clientMAUB.MAUBP0100.ItmTypR row){
		setConstInnerRow(offset + 46, $itm_typ_p, row);
	}


	/**
	 * Customer item cd. 得意先品目ＣＤ.<p>
	 *
	 */
	public String cst_itm_cd() {
		return getConstString(offset + 47, $cst_itm_cd);
	}

	/**
	 * Customer item cd. 得意先品目ＣＤ.<p>
	 *
	 */
	public void cst_itm_cd(String value) {
		setConstString(offset + 47, $cst_itm_cd, value);
	}


	/**
	 * Customer item name 得意先品名.<p>
	 *
	 */
	public String cst_itm_nm() {
		return getConstString(offset + 48, $cst_itm_nm);
	}

	/**
	 * Customer item name 得意先品名.<p>
	 *
	 */
	public void cst_itm_nm(String value) {
		setConstString(offset + 48, $cst_itm_nm, value);
	}


	public mcframe.clientMAUB.MAUBP0030.ItmR itm_p(){
		return (mcframe.clientMAUB.MAUBP0030.ItmR) getConstInnerRow(offset + 49, $itm_p);
	}
	
	public void itm_p(mcframe.clientMAUB.MAUBP0030.ItmR row){
		setConstInnerRow(offset + 49, $itm_p, row);
	}


	public mcframe.clientMSUB.MSUBP0020.SnoWrkNoR sno_p(){
		return (mcframe.clientMSUB.MSUBP0020.SnoWrkNoR) getConstInnerRow(offset + 50, $sno_p);
	}
	
	public void sno_p(mcframe.clientMSUB.MSUBP0020.SnoWrkNoR row){
		setConstInnerRow(offset + 50, $sno_p, row);
	}


	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public String trd_cd() {
		return getConstString(offset + 51, $trd_cd);
	}

	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public void trd_cd(String value) {
		setConstString(offset + 51, $trd_cd, value);
	}


	/**
	 * Transaction name 取引名.<p>
	 *
	 */
	public String trd_nm() {
		return getConstString(offset + 52, $trd_nm);
	}

	/**
	 * Transaction name 取引名.<p>
	 *
	 */
	public void trd_nm(String value) {
		setConstString(offset + 52, $trd_nm, value);
	}


	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public String trd_cur_cd() {
		return getConstString(offset + 53, $trd_cur_cd);
	}

	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public void trd_cur_cd(String value) {
		setConstString(offset + 53, $trd_cur_cd, value);
	}


	/**
	 * Transaction currency name 取引通貨名.<p>
	 *
	 */
	public String trd_cur_nm() {
		return getConstString(offset + 54, $trd_cur_nm);
	}

	/**
	 * Transaction currency name 取引通貨名.<p>
	 *
	 */
	public void trd_cur_nm(String value) {
		setConstString(offset + 54, $trd_cur_nm, value);
	}


	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public String gd_cd() {
		return getConstString(offset + 55, $gd_cd);
	}

	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public void gd_cd(String value) {
		setConstString(offset + 55, $gd_cd, value);
	}


	/**
	 * Grading name 格付名.<p>
	 *
	 */
	public String gd_nm() {
		return getConstString(offset + 56, $gd_nm);
	}

	/**
	 * Grading name 格付名.<p>
	 *
	 */
	public void gd_nm(String value) {
		setConstString(offset + 56, $gd_nm, value);
	}


	/**
	 * Quotation terms cd. 見積条件ＣＤ.<p>
	 *
	 */
	public String qtn_term_cd() {
		return getConstString(offset + 57, $qtn_term_cd);
	}

	/**
	 * Quotation terms cd. 見積条件ＣＤ.<p>
	 *
	 */
	public void qtn_term_cd(String value) {
		setConstString(offset + 57, $qtn_term_cd, value);
	}


	/**
	 * Quotation terms name 見積条件名.<p>
	 *
	 */
	public String qtn_term_nm() {
		return getConstString(offset + 58, $qtn_term_nm);
	}

	/**
	 * Quotation terms name 見積条件名.<p>
	 *
	 */
	public void qtn_term_nm(String value) {
		setConstString(offset + 58, $qtn_term_nm, value);
	}


	/**
	 * Quotation result reason cd. 見積結果理由ＣＤ.<p>
	 *
	 */
	public String qtn_rslt_rsn_cd() {
		return getConstString(offset + 59, $qtn_rslt_rsn_cd);
	}

	/**
	 * Quotation result reason cd. 見積結果理由ＣＤ.<p>
	 *
	 */
	public void qtn_rslt_rsn_cd(String value) {
		setConstString(offset + 59, $qtn_rslt_rsn_cd, value);
	}


	/**
	 * Quotation result reason name 見積結果理由名.<p>
	 *
	 */
	public String qtn_rslt_rsn_nm() {
		return getConstString(offset + 60, $qtn_rslt_rsn_nm);
	}

	/**
	 * Quotation result reason name 見積結果理由名.<p>
	 *
	 */
	public void qtn_rslt_rsn_nm(String value) {
		setConstString(offset + 60, $qtn_rslt_rsn_nm, value);
	}


	/**
	 * Quotation details result reason cd. 見積明細結果理由ＣＤ.<p>
	 *
	 */
	public String qtn_d_rslt_rsn_cd() {
		return getConstString(offset + 61, $qtn_d_rslt_rsn_cd);
	}

	/**
	 * Quotation details result reason cd. 見積明細結果理由ＣＤ.<p>
	 *
	 */
	public void qtn_d_rslt_rsn_cd(String value) {
		setConstString(offset + 61, $qtn_d_rslt_rsn_cd, value);
	}


	/**
	 * Quotation details result reason name 見積明細結果理由名.<p>
	 *
	 */
	public String qtn_d_rslt_rsn_nm() {
		return getConstString(offset + 62, $qtn_d_rslt_rsn_nm);
	}

	/**
	 * Quotation details result reason name 見積明細結果理由名.<p>
	 *
	 */
	public void qtn_d_rslt_rsn_nm(String value) {
		setConstString(offset + 62, $qtn_d_rslt_rsn_nm, value);
	}


	/**
	 * Quotation remarks 見積備考.<p>
	 *
	 */
	public String qtn_rmrks() {
		return getConstString(offset + 63, $qtn_rmrks);
	}

	/**
	 * Quotation remarks 見積備考.<p>
	 *
	 */
	public void qtn_rmrks(String value) {
		setConstString(offset + 63, $qtn_rmrks, value);
	}


	/**
	 * Quotation details remarks 見積明細備考.<p>
	 *
	 */
	public String qtn_d_rmrks() {
		return getConstString(offset + 64, $qtn_d_rmrks);
	}

	/**
	 * Quotation details remarks 見積明細備考.<p>
	 *
	 */
	public void qtn_d_rmrks(String value) {
		setConstString(offset + 64, $qtn_d_rmrks, value);
	}


	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public String intr_rmrks() {
		return getConstString(offset + 65, $intr_rmrks);
	}

	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public void intr_rmrks(String value) {
		setConstString(offset + 65, $intr_rmrks, value);
	}


	/**
	 * Internal details remarks 内部明細備考.<p>
	 *
	 */
	public String intr_d_rmrks() {
		return getConstString(offset + 66, $intr_d_rmrks);
	}

	/**
	 * Internal details remarks 内部明細備考.<p>
	 *
	 */
	public void intr_d_rmrks(String value) {
		setConstString(offset + 66, $intr_d_rmrks, value);
	}


	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String qtn_sub_char1() {
		return getConstString(offset + 67, $qtn_sub_char1);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void qtn_sub_char1(String value) {
		setConstString(offset + 67, $qtn_sub_char1, value);
	}


	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String qtn_sub_char2() {
		return getConstString(offset + 68, $qtn_sub_char2);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void qtn_sub_char2(String value) {
		setConstString(offset + 68, $qtn_sub_char2, value);
	}


	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String qtn_sub_char3() {
		return getConstString(offset + 69, $qtn_sub_char3);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void qtn_sub_char3(String value) {
		setConstString(offset + 69, $qtn_sub_char3, value);
	}


	/**
	 * Details spare 1 明細予備１.<p>
	 *
	 */
	public String qtn_d_sub_char1() {
		return getConstString(offset + 70, $qtn_d_sub_char1);
	}

	/**
	 * Details spare 1 明細予備１.<p>
	 *
	 */
	public void qtn_d_sub_char1(String value) {
		setConstString(offset + 70, $qtn_d_sub_char1, value);
	}


	/**
	 * Details spare 2 明細予備２.<p>
	 *
	 */
	public String qtn_d_sub_char2() {
		return getConstString(offset + 71, $qtn_d_sub_char2);
	}

	/**
	 * Details spare 2 明細予備２.<p>
	 *
	 */
	public void qtn_d_sub_char2(String value) {
		setConstString(offset + 71, $qtn_d_sub_char2, value);
	}


	/**
	 * Details spare 3 明細予備３.<p>
	 *
	 */
	public String qtn_d_sub_char3() {
		return getConstString(offset + 72, $qtn_d_sub_char3);
	}

	/**
	 * Details spare 3 明細予備３.<p>
	 *
	 */
	public void qtn_d_sub_char3(String value) {
		setConstString(offset + 72, $qtn_d_sub_char3, value);
	}


	/**
	 * Including failed order 失注含む.<p>
	 *
	 */
	public boolean inc_failure_flg() {
		return getConstBoolean(offset + 73, $inc_failure_flg);
	}

	/**
	 * Including failed order 失注含む.<p>
	 *
	 */
	public void inc_failure_flg(boolean value) {
		setConstBoolean(offset + 73, $inc_failure_flg, value);
	}


	/**
	 * Include cancel 取消含む.<p>
	 *
	 */
	public boolean inc_can_flg() {
		return getConstBoolean(offset + 74, $inc_can_flg);
	}

	/**
	 * Include cancel 取消含む.<p>
	 *
	 */
	public void inc_can_flg(boolean value) {
		setConstBoolean(offset + 74, $inc_can_flg, value);
	}


	public mcframe.clientMAUB.MAUBP0260.BpGrpR cst_grp_p(){
		return (mcframe.clientMAUB.MAUBP0260.BpGrpR) getConstInnerRow(offset + 75, $cst_grp_p);
	}
	
	public void cst_grp_p(mcframe.clientMAUB.MAUBP0260.BpGrpR row){
		setConstInnerRow(offset + 75, $cst_grp_p, row);
	}


	public mcframe.clientMAUB.MAUBP0260.BpGrpR dlv_grp_p(){
		return (mcframe.clientMAUB.MAUBP0260.BpGrpR) getConstInnerRow(offset + 76, $dlv_grp_p);
	}
	
	public void dlv_grp_p(mcframe.clientMAUB.MAUBP0260.BpGrpR row){
		setConstInnerRow(offset + 76, $dlv_grp_p, row);
	}


	public mcframe.clientMAUB.MAUBP0250.ItmGrpR itm_grp_p(){
		return (mcframe.clientMAUB.MAUBP0250.ItmGrpR) getConstInnerRow(offset + 77, $itm_grp_p);
	}
	
	public void itm_grp_p(mcframe.clientMAUB.MAUBP0250.ItmGrpR row){
		setConstInnerRow(offset + 77, $itm_grp_p, row);
	}


	public String getString(String name) {
		if ($ope.equalsIgnoreCase(name)) {
			return ope();
		}
		if ($disp.equalsIgnoreCase(name)) {
			return disp();
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
		if ($rcpt_usr_cd.equalsIgnoreCase(name)) {
			return rcpt_usr_cd();
		}
		if ($rcpt_usr_nm.equalsIgnoreCase(name)) {
			return rcpt_usr_nm();
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			return cst_cd();
		}
		if ($cst_nm.equalsIgnoreCase(name)) {
			return cst_nm();
		}
		if ($dlv_cd.equalsIgnoreCase(name)) {
			return dlv_cd();
		}
		if ($dlv_nm.equalsIgnoreCase(name)) {
			return dlv_nm();
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
		if ($qtn_no.equalsIgnoreCase(name)) {
			return qtn_no();
		}
		if ($cst_qtn_rqst_no.equalsIgnoreCase(name)) {
			return cst_qtn_rqst_no();
		}
		if ($cst_qtn_rqst_d_no.equalsIgnoreCase(name)) {
			return cst_qtn_rqst_d_no();
		}
		if ($cst_itm_cd.equalsIgnoreCase(name)) {
			return cst_itm_cd();
		}
		if ($cst_itm_nm.equalsIgnoreCase(name)) {
			return cst_itm_nm();
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			return trd_cd();
		}
		if ($trd_nm.equalsIgnoreCase(name)) {
			return trd_nm();
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($trd_cur_nm.equalsIgnoreCase(name)) {
			return trd_cur_nm();
		}
		if ($gd_cd.equalsIgnoreCase(name)) {
			return gd_cd();
		}
		if ($gd_nm.equalsIgnoreCase(name)) {
			return gd_nm();
		}
		if ($qtn_term_cd.equalsIgnoreCase(name)) {
			return qtn_term_cd();
		}
		if ($qtn_term_nm.equalsIgnoreCase(name)) {
			return qtn_term_nm();
		}
		if ($qtn_rslt_rsn_cd.equalsIgnoreCase(name)) {
			return qtn_rslt_rsn_cd();
		}
		if ($qtn_rslt_rsn_nm.equalsIgnoreCase(name)) {
			return qtn_rslt_rsn_nm();
		}
		if ($qtn_d_rslt_rsn_cd.equalsIgnoreCase(name)) {
			return qtn_d_rslt_rsn_cd();
		}
		if ($qtn_d_rslt_rsn_nm.equalsIgnoreCase(name)) {
			return qtn_d_rslt_rsn_nm();
		}
		if ($qtn_rmrks.equalsIgnoreCase(name)) {
			return qtn_rmrks();
		}
		if ($qtn_d_rmrks.equalsIgnoreCase(name)) {
			return qtn_d_rmrks();
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			return intr_rmrks();
		}
		if ($intr_d_rmrks.equalsIgnoreCase(name)) {
			return intr_d_rmrks();
		}
		if ($qtn_sub_char1.equalsIgnoreCase(name)) {
			return qtn_sub_char1();
		}
		if ($qtn_sub_char2.equalsIgnoreCase(name)) {
			return qtn_sub_char2();
		}
		if ($qtn_sub_char3.equalsIgnoreCase(name)) {
			return qtn_sub_char3();
		}
		if ($qtn_d_sub_char1.equalsIgnoreCase(name)) {
			return qtn_d_sub_char1();
		}
		if ($qtn_d_sub_char2.equalsIgnoreCase(name)) {
			return qtn_d_sub_char2();
		}
		if ($qtn_d_sub_char3.equalsIgnoreCase(name)) {
			return qtn_d_sub_char3();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($qtn_rev.equalsIgnoreCase(name)) {
			return qtn_rev();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($qtn_dt_fr.equalsIgnoreCase(name)) {
			return qtn_dt_fr();
		}
		if ($qtn_dt_to.equalsIgnoreCase(name)) {
			return qtn_dt_to();
		}
		if ($valid_dt_fr.equalsIgnoreCase(name)) {
			return valid_dt_fr();
		}
		if ($valid_dt_to.equalsIgnoreCase(name)) {
			return valid_dt_to();
		}
		if ($rcpt_dt_fr.equalsIgnoreCase(name)) {
			return rcpt_dt_fr();
		}
		if ($rcpt_dt_to.equalsIgnoreCase(name)) {
			return rcpt_dt_to();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($creating.equalsIgnoreCase(name)) {
			return creating();
		}
		if ($pre_qtn.equalsIgnoreCase(name)) {
			return pre_qtn();
		}
		if ($qtn.equalsIgnoreCase(name)) {
			return qtn();
		}
		if ($non.equalsIgnoreCase(name)) {
			return non();
		}
		if ($part.equalsIgnoreCase(name)) {
			return part();
		}
		if ($compl.equalsIgnoreCase(name)) {
			return compl();
		}
		if ($opn.equalsIgnoreCase(name)) {
			return opn();
		}
		if ($fix.equalsIgnoreCase(name)) {
			return fix();
		}
		if ($acpt.equalsIgnoreCase(name)) {
			return acpt();
		}
		if ($rjct.equalsIgnoreCase(name)) {
			return rjct();
		}
		if ($last_rjct.equalsIgnoreCase(name)) {
			return last_rjct();
		}
		if ($excld.equalsIgnoreCase(name)) {
			return excld();
		}
		if ($yet.equalsIgnoreCase(name)) {
			return yet();
		}
		if ($prnt.equalsIgnoreCase(name)) {
			return prnt();
		}
		if ($iv_trgt_flg.equalsIgnoreCase(name)) {
			return iv_trgt_flg();
		}
		if ($iv_not_trgt_flg.equalsIgnoreCase(name)) {
			return iv_not_trgt_flg();
		}
		if ($inc_failure_flg.equalsIgnoreCase(name)) {
			return inc_failure_flg();
		}
		if ($inc_can_flg.equalsIgnoreCase(name)) {
			return inc_can_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($ope.equalsIgnoreCase(name)) {
			return ope();
		}
		if ($disp.equalsIgnoreCase(name)) {
			return disp();
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
		if ($rcpt_usr_cd.equalsIgnoreCase(name)) {
			return rcpt_usr_cd();
		}
		if ($rcpt_usr_nm.equalsIgnoreCase(name)) {
			return rcpt_usr_nm();
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			return cst_cd();
		}
		if ($cst_nm.equalsIgnoreCase(name)) {
			return cst_nm();
		}
		if ($dlv_cd.equalsIgnoreCase(name)) {
			return dlv_cd();
		}
		if ($dlv_nm.equalsIgnoreCase(name)) {
			return dlv_nm();
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
		if ($qtn_no.equalsIgnoreCase(name)) {
			return qtn_no();
		}
		if ($cst_qtn_rqst_no.equalsIgnoreCase(name)) {
			return cst_qtn_rqst_no();
		}
		if ($cst_qtn_rqst_d_no.equalsIgnoreCase(name)) {
			return cst_qtn_rqst_d_no();
		}
		if ($cst_itm_cd.equalsIgnoreCase(name)) {
			return cst_itm_cd();
		}
		if ($cst_itm_nm.equalsIgnoreCase(name)) {
			return cst_itm_nm();
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			return trd_cd();
		}
		if ($trd_nm.equalsIgnoreCase(name)) {
			return trd_nm();
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($trd_cur_nm.equalsIgnoreCase(name)) {
			return trd_cur_nm();
		}
		if ($gd_cd.equalsIgnoreCase(name)) {
			return gd_cd();
		}
		if ($gd_nm.equalsIgnoreCase(name)) {
			return gd_nm();
		}
		if ($qtn_term_cd.equalsIgnoreCase(name)) {
			return qtn_term_cd();
		}
		if ($qtn_term_nm.equalsIgnoreCase(name)) {
			return qtn_term_nm();
		}
		if ($qtn_rslt_rsn_cd.equalsIgnoreCase(name)) {
			return qtn_rslt_rsn_cd();
		}
		if ($qtn_rslt_rsn_nm.equalsIgnoreCase(name)) {
			return qtn_rslt_rsn_nm();
		}
		if ($qtn_d_rslt_rsn_cd.equalsIgnoreCase(name)) {
			return qtn_d_rslt_rsn_cd();
		}
		if ($qtn_d_rslt_rsn_nm.equalsIgnoreCase(name)) {
			return qtn_d_rslt_rsn_nm();
		}
		if ($qtn_rmrks.equalsIgnoreCase(name)) {
			return qtn_rmrks();
		}
		if ($qtn_d_rmrks.equalsIgnoreCase(name)) {
			return qtn_d_rmrks();
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			return intr_rmrks();
		}
		if ($intr_d_rmrks.equalsIgnoreCase(name)) {
			return intr_d_rmrks();
		}
		if ($qtn_sub_char1.equalsIgnoreCase(name)) {
			return qtn_sub_char1();
		}
		if ($qtn_sub_char2.equalsIgnoreCase(name)) {
			return qtn_sub_char2();
		}
		if ($qtn_sub_char3.equalsIgnoreCase(name)) {
			return qtn_sub_char3();
		}
		if ($qtn_d_sub_char1.equalsIgnoreCase(name)) {
			return qtn_d_sub_char1();
		}
		if ($qtn_d_sub_char2.equalsIgnoreCase(name)) {
			return qtn_d_sub_char2();
		}
		if ($qtn_d_sub_char3.equalsIgnoreCase(name)) {
			return qtn_d_sub_char3();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($qtn_rev.equalsIgnoreCase(name)) {
			return qtn_rev();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($qtn_dt_fr.equalsIgnoreCase(name)) {
			return qtn_dt_fr();
		}
		if ($qtn_dt_to.equalsIgnoreCase(name)) {
			return qtn_dt_to();
		}
		if ($valid_dt_fr.equalsIgnoreCase(name)) {
			return valid_dt_fr();
		}
		if ($valid_dt_to.equalsIgnoreCase(name)) {
			return valid_dt_to();
		}
		if ($rcpt_dt_fr.equalsIgnoreCase(name)) {
			return rcpt_dt_fr();
		}
		if ($rcpt_dt_to.equalsIgnoreCase(name)) {
			return rcpt_dt_to();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($creating.equalsIgnoreCase(name)) {
			return creating();
		}
		if ($pre_qtn.equalsIgnoreCase(name)) {
			return pre_qtn();
		}
		if ($qtn.equalsIgnoreCase(name)) {
			return qtn();
		}
		if ($non.equalsIgnoreCase(name)) {
			return non();
		}
		if ($part.equalsIgnoreCase(name)) {
			return part();
		}
		if ($compl.equalsIgnoreCase(name)) {
			return compl();
		}
		if ($opn.equalsIgnoreCase(name)) {
			return opn();
		}
		if ($fix.equalsIgnoreCase(name)) {
			return fix();
		}
		if ($acpt.equalsIgnoreCase(name)) {
			return acpt();
		}
		if ($rjct.equalsIgnoreCase(name)) {
			return rjct();
		}
		if ($last_rjct.equalsIgnoreCase(name)) {
			return last_rjct();
		}
		if ($excld.equalsIgnoreCase(name)) {
			return excld();
		}
		if ($yet.equalsIgnoreCase(name)) {
			return yet();
		}
		if ($prnt.equalsIgnoreCase(name)) {
			return prnt();
		}
		if ($iv_trgt_flg.equalsIgnoreCase(name)) {
			return iv_trgt_flg();
		}
		if ($iv_not_trgt_flg.equalsIgnoreCase(name)) {
			return iv_not_trgt_flg();
		}
		if ($inc_failure_flg.equalsIgnoreCase(name)) {
			return inc_failure_flg();
		}
		if ($inc_can_flg.equalsIgnoreCase(name)) {
			return inc_can_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($ope.equalsIgnoreCase(name)) {
			ope(value);
			return;
		}
		if ($disp.equalsIgnoreCase(name)) {
			disp(value);
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
		if ($rcpt_usr_cd.equalsIgnoreCase(name)) {
			rcpt_usr_cd(value);
			return;
		}
		if ($rcpt_usr_nm.equalsIgnoreCase(name)) {
			rcpt_usr_nm(value);
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
		if ($dlv_cd.equalsIgnoreCase(name)) {
			dlv_cd(value);
			return;
		}
		if ($dlv_nm.equalsIgnoreCase(name)) {
			dlv_nm(value);
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
		if ($qtn_no.equalsIgnoreCase(name)) {
			qtn_no(value);
			return;
		}
		if ($cst_qtn_rqst_no.equalsIgnoreCase(name)) {
			cst_qtn_rqst_no(value);
			return;
		}
		if ($cst_qtn_rqst_d_no.equalsIgnoreCase(name)) {
			cst_qtn_rqst_d_no(value);
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
		if ($trd_cd.equalsIgnoreCase(name)) {
			trd_cd(value);
			return;
		}
		if ($trd_nm.equalsIgnoreCase(name)) {
			trd_nm(value);
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
		if ($gd_cd.equalsIgnoreCase(name)) {
			gd_cd(value);
			return;
		}
		if ($gd_nm.equalsIgnoreCase(name)) {
			gd_nm(value);
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
		if ($qtn_rslt_rsn_cd.equalsIgnoreCase(name)) {
			qtn_rslt_rsn_cd(value);
			return;
		}
		if ($qtn_rslt_rsn_nm.equalsIgnoreCase(name)) {
			qtn_rslt_rsn_nm(value);
			return;
		}
		if ($qtn_d_rslt_rsn_cd.equalsIgnoreCase(name)) {
			qtn_d_rslt_rsn_cd(value);
			return;
		}
		if ($qtn_d_rslt_rsn_nm.equalsIgnoreCase(name)) {
			qtn_d_rslt_rsn_nm(value);
			return;
		}
		if ($qtn_rmrks.equalsIgnoreCase(name)) {
			qtn_rmrks(value);
			return;
		}
		if ($qtn_d_rmrks.equalsIgnoreCase(name)) {
			qtn_d_rmrks(value);
			return;
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			intr_rmrks(value);
			return;
		}
		if ($intr_d_rmrks.equalsIgnoreCase(name)) {
			intr_d_rmrks(value);
			return;
		}
		if ($qtn_sub_char1.equalsIgnoreCase(name)) {
			qtn_sub_char1(value);
			return;
		}
		if ($qtn_sub_char2.equalsIgnoreCase(name)) {
			qtn_sub_char2(value);
			return;
		}
		if ($qtn_sub_char3.equalsIgnoreCase(name)) {
			qtn_sub_char3(value);
			return;
		}
		if ($qtn_d_sub_char1.equalsIgnoreCase(name)) {
			qtn_d_sub_char1(value);
			return;
		}
		if ($qtn_d_sub_char2.equalsIgnoreCase(name)) {
			qtn_d_sub_char2(value);
			return;
		}
		if ($qtn_d_sub_char3.equalsIgnoreCase(name)) {
			qtn_d_sub_char3(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($qtn_rev.equalsIgnoreCase(name)) {
			qtn_rev(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($qtn_rev.equalsIgnoreCase(name)) {
			qtn_rev(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($qtn_rev.equalsIgnoreCase(name)) {
			qtn_rev(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($qtn_rev.equalsIgnoreCase(name)) {
			qtn_rev(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($qtn_rev.equalsIgnoreCase(name)) {
			qtn_rev(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($qtn_dt_fr.equalsIgnoreCase(name)) {
			qtn_dt_fr(value);
			return;
		}
		if ($qtn_dt_to.equalsIgnoreCase(name)) {
			qtn_dt_to(value);
			return;
		}
		if ($valid_dt_fr.equalsIgnoreCase(name)) {
			valid_dt_fr(value);
			return;
		}
		if ($valid_dt_to.equalsIgnoreCase(name)) {
			valid_dt_to(value);
			return;
		}
		if ($rcpt_dt_fr.equalsIgnoreCase(name)) {
			rcpt_dt_fr(value);
			return;
		}
		if ($rcpt_dt_to.equalsIgnoreCase(name)) {
			rcpt_dt_to(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($creating.equalsIgnoreCase(name)) {
			creating(value);
			return;
		}
		if ($pre_qtn.equalsIgnoreCase(name)) {
			pre_qtn(value);
			return;
		}
		if ($qtn.equalsIgnoreCase(name)) {
			qtn(value);
			return;
		}
		if ($non.equalsIgnoreCase(name)) {
			non(value);
			return;
		}
		if ($part.equalsIgnoreCase(name)) {
			part(value);
			return;
		}
		if ($compl.equalsIgnoreCase(name)) {
			compl(value);
			return;
		}
		if ($opn.equalsIgnoreCase(name)) {
			opn(value);
			return;
		}
		if ($fix.equalsIgnoreCase(name)) {
			fix(value);
			return;
		}
		if ($acpt.equalsIgnoreCase(name)) {
			acpt(value);
			return;
		}
		if ($rjct.equalsIgnoreCase(name)) {
			rjct(value);
			return;
		}
		if ($last_rjct.equalsIgnoreCase(name)) {
			last_rjct(value);
			return;
		}
		if ($excld.equalsIgnoreCase(name)) {
			excld(value);
			return;
		}
		if ($yet.equalsIgnoreCase(name)) {
			yet(value);
			return;
		}
		if ($prnt.equalsIgnoreCase(name)) {
			prnt(value);
			return;
		}
		if ($iv_trgt_flg.equalsIgnoreCase(name)) {
			iv_trgt_flg(value);
			return;
		}
		if ($iv_not_trgt_flg.equalsIgnoreCase(name)) {
			iv_not_trgt_flg(value);
			return;
		}
		if ($inc_failure_flg.equalsIgnoreCase(name)) {
			inc_failure_flg(value);
			return;
		}
		if ($inc_can_flg.equalsIgnoreCase(name)) {
			inc_can_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($ope.equalsIgnoreCase(name)) {
			ope(value);
			return;
		}
		if ($disp.equalsIgnoreCase(name)) {
			disp(value);
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
		if ($rcpt_usr_cd.equalsIgnoreCase(name)) {
			rcpt_usr_cd(value);
			return;
		}
		if ($rcpt_usr_nm.equalsIgnoreCase(name)) {
			rcpt_usr_nm(value);
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
		if ($dlv_cd.equalsIgnoreCase(name)) {
			dlv_cd(value);
			return;
		}
		if ($dlv_nm.equalsIgnoreCase(name)) {
			dlv_nm(value);
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
		if ($qtn_no.equalsIgnoreCase(name)) {
			qtn_no(value);
			return;
		}
		if ($cst_qtn_rqst_no.equalsIgnoreCase(name)) {
			cst_qtn_rqst_no(value);
			return;
		}
		if ($cst_qtn_rqst_d_no.equalsIgnoreCase(name)) {
			cst_qtn_rqst_d_no(value);
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
		if ($trd_cd.equalsIgnoreCase(name)) {
			trd_cd(value);
			return;
		}
		if ($trd_nm.equalsIgnoreCase(name)) {
			trd_nm(value);
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
		if ($gd_cd.equalsIgnoreCase(name)) {
			gd_cd(value);
			return;
		}
		if ($gd_nm.equalsIgnoreCase(name)) {
			gd_nm(value);
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
		if ($qtn_rslt_rsn_cd.equalsIgnoreCase(name)) {
			qtn_rslt_rsn_cd(value);
			return;
		}
		if ($qtn_rslt_rsn_nm.equalsIgnoreCase(name)) {
			qtn_rslt_rsn_nm(value);
			return;
		}
		if ($qtn_d_rslt_rsn_cd.equalsIgnoreCase(name)) {
			qtn_d_rslt_rsn_cd(value);
			return;
		}
		if ($qtn_d_rslt_rsn_nm.equalsIgnoreCase(name)) {
			qtn_d_rslt_rsn_nm(value);
			return;
		}
		if ($qtn_rmrks.equalsIgnoreCase(name)) {
			qtn_rmrks(value);
			return;
		}
		if ($qtn_d_rmrks.equalsIgnoreCase(name)) {
			qtn_d_rmrks(value);
			return;
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			intr_rmrks(value);
			return;
		}
		if ($intr_d_rmrks.equalsIgnoreCase(name)) {
			intr_d_rmrks(value);
			return;
		}
		if ($qtn_sub_char1.equalsIgnoreCase(name)) {
			qtn_sub_char1(value);
			return;
		}
		if ($qtn_sub_char2.equalsIgnoreCase(name)) {
			qtn_sub_char2(value);
			return;
		}
		if ($qtn_sub_char3.equalsIgnoreCase(name)) {
			qtn_sub_char3(value);
			return;
		}
		if ($qtn_d_sub_char1.equalsIgnoreCase(name)) {
			qtn_d_sub_char1(value);
			return;
		}
		if ($qtn_d_sub_char2.equalsIgnoreCase(name)) {
			qtn_d_sub_char2(value);
			return;
		}
		if ($qtn_d_sub_char3.equalsIgnoreCase(name)) {
			qtn_d_sub_char3(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($qtn_rev.equalsIgnoreCase(name)) {
			qtn_rev(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($qtn_rev.equalsIgnoreCase(name)) {
			qtn_rev(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($qtn_rev.equalsIgnoreCase(name)) {
			qtn_rev(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($qtn_rev.equalsIgnoreCase(name)) {
			qtn_rev(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($qtn_rev.equalsIgnoreCase(name)) {
			qtn_rev(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($qtn_dt_fr.equalsIgnoreCase(name)) {
			qtn_dt_fr(value);
			return;
		}
		if ($qtn_dt_to.equalsIgnoreCase(name)) {
			qtn_dt_to(value);
			return;
		}
		if ($valid_dt_fr.equalsIgnoreCase(name)) {
			valid_dt_fr(value);
			return;
		}
		if ($valid_dt_to.equalsIgnoreCase(name)) {
			valid_dt_to(value);
			return;
		}
		if ($rcpt_dt_fr.equalsIgnoreCase(name)) {
			rcpt_dt_fr(value);
			return;
		}
		if ($rcpt_dt_to.equalsIgnoreCase(name)) {
			rcpt_dt_to(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($creating.equalsIgnoreCase(name)) {
			creating(value);
			return;
		}
		if ($pre_qtn.equalsIgnoreCase(name)) {
			pre_qtn(value);
			return;
		}
		if ($qtn.equalsIgnoreCase(name)) {
			qtn(value);
			return;
		}
		if ($non.equalsIgnoreCase(name)) {
			non(value);
			return;
		}
		if ($part.equalsIgnoreCase(name)) {
			part(value);
			return;
		}
		if ($compl.equalsIgnoreCase(name)) {
			compl(value);
			return;
		}
		if ($opn.equalsIgnoreCase(name)) {
			opn(value);
			return;
		}
		if ($fix.equalsIgnoreCase(name)) {
			fix(value);
			return;
		}
		if ($acpt.equalsIgnoreCase(name)) {
			acpt(value);
			return;
		}
		if ($rjct.equalsIgnoreCase(name)) {
			rjct(value);
			return;
		}
		if ($last_rjct.equalsIgnoreCase(name)) {
			last_rjct(value);
			return;
		}
		if ($excld.equalsIgnoreCase(name)) {
			excld(value);
			return;
		}
		if ($yet.equalsIgnoreCase(name)) {
			yet(value);
			return;
		}
		if ($prnt.equalsIgnoreCase(name)) {
			prnt(value);
			return;
		}
		if ($iv_trgt_flg.equalsIgnoreCase(name)) {
			iv_trgt_flg(value);
			return;
		}
		if ($iv_not_trgt_flg.equalsIgnoreCase(name)) {
			iv_not_trgt_flg(value);
			return;
		}
		if ($inc_failure_flg.equalsIgnoreCase(name)) {
			inc_failure_flg(value);
			return;
		}
		if ($inc_can_flg.equalsIgnoreCase(name)) {
			inc_can_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public MCRow getInnerRow(String name) {
		if ($itm_typ_p.equalsIgnoreCase(name)) {
			return itm_typ_p();
		}
		if ($itm_p.equalsIgnoreCase(name)) {
			return itm_p();
		}
		if ($sno_p.equalsIgnoreCase(name)) {
			return sno_p();
		}
		if ($cst_grp_p.equalsIgnoreCase(name)) {
			return cst_grp_p();
		}
		if ($dlv_grp_p.equalsIgnoreCase(name)) {
			return dlv_grp_p();
		}
		if ($itm_grp_p.equalsIgnoreCase(name)) {
			return itm_grp_p();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($itm_typ_p.equalsIgnoreCase(name)) {
			itm_typ_p(
				((MCContainerMeta) itm_typ_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0100.ItmTypR.class, value)
			);
			return;
		}
		if ($itm_p.equalsIgnoreCase(name)) {
			itm_p(
				((MCContainerMeta) itm_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0030.ItmR.class, value)
			);
			return;
		}
		if ($sno_p.equalsIgnoreCase(name)) {
			sno_p(
				((MCContainerMeta) sno_p_META).castInnerRow(mcframe.clientMSUB.MSUBP0020.SnoWrkNoR.class, value)
			);
			return;
		}
		if ($cst_grp_p.equalsIgnoreCase(name)) {
			cst_grp_p(
				((MCContainerMeta) cst_grp_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0260.BpGrpR.class, value)
			);
			return;
		}
		if ($dlv_grp_p.equalsIgnoreCase(name)) {
			dlv_grp_p(
				((MCContainerMeta) dlv_grp_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0260.BpGrpR.class, value)
			);
			return;
		}
		if ($itm_grp_p.equalsIgnoreCase(name)) {
			itm_grp_p(
				((MCContainerMeta) itm_grp_p_META).castInnerRow(mcframe.clientMAUB.MAUBP0250.ItmGrpR.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	public String itm_typ() {
		return itm_typ_p().itm_typ();
	}

	public void itm_typ(String value) {
		itm_typ_p().itm_typ(value);
	}

	public String itm_typ_d_cd() {
		return itm_typ_p().itm_typ_d_cd();
	}

	public void itm_typ_d_cd(String value) {
		itm_typ_p().itm_typ_d_cd(value);
	}

	public String itm_typ_d_nm() {
		return itm_typ_p().itm_typ_d_nm();
	}

	public void itm_typ_d_nm(String value) {
		itm_typ_p().itm_typ_d_nm(value);
	}

	public String itm_cd() {
		return itm_p().itm_cd();
	}

	public void itm_cd(String value) {
		itm_p().itm_cd(value);
	}

	public String itm_sub1() {
		return itm_p().itm_sub1();
	}

	public void itm_sub1(String value) {
		itm_p().itm_sub1(value);
	}

	public String itm_sub2() {
		return itm_p().itm_sub2();
	}

	public void itm_sub2(String value) {
		itm_p().itm_sub2(value);
	}

	public String itm_sub3() {
		return itm_p().itm_sub3();
	}

	public void itm_sub3(String value) {
		itm_p().itm_sub3(value);
	}

	public String itm_nm() {
		return itm_p().itm_nm();
	}

	public void itm_nm(String value) {
		itm_p().itm_nm(value);
	}

	public String sno1() {
		return sno_p().sno1();
	}

	public void sno1(String value) {
		sno_p().sno1(value);
	}

	public String sno2() {
		return sno_p().sno2();
	}

	public void sno2(String value) {
		sno_p().sno2(value);
	}

	public String sno3() {
		return sno_p().sno3();
	}

	public void sno3(String value) {
		sno_p().sno3(value);
	}

	public String sno4() {
		return sno_p().sno4();
	}

	public void sno4(String value) {
		sno_p().sno4(value);
	}

	public String wrk_no() {
		return sno_p().wrk_no();
	}

	public void wrk_no(String value) {
		sno_p().wrk_no(value);
	}

	public String wrk_nm() {
		return sno_p().wrk_nm();
	}

	public void wrk_nm(String value) {
		sno_p().wrk_nm(value);
	}

	/**
	 * Customer classification 1 得意先分類１.<p>
	 *
	 */
	public boolean cst_grp_flg1() {
		return cst_grp_p().bp_grp_flg1();
	}

	/**
	 * Customer classification 1 得意先分類１.<p>
	 *
	 */
	public void cst_grp_flg1(boolean value) {
		cst_grp_p().bp_grp_flg1(value);
	}

	/**
	 * Customer classification cd. 1 得意先分類ＣＤ１.<p>
	 *
	 */
	public String cst_grp_cd1() {
		return cst_grp_p().bp_grp_cd1();
	}

	/**
	 * Customer classification cd. 1 得意先分類ＣＤ１.<p>
	 *
	 */
	public void cst_grp_cd1(String value) {
		cst_grp_p().bp_grp_cd1(value);
	}

	/**
	 * Customer classification name 1 得意先分類名１.<p>
	 *
	 */
	public String cst_grp_nm1() {
		return cst_grp_p().bp_grp_nm1();
	}

	/**
	 * Customer classification name 1 得意先分類名１.<p>
	 *
	 */
	public void cst_grp_nm1(String value) {
		cst_grp_p().bp_grp_nm1(value);
	}

	/**
	 * Customer classification 2 得意先分類２.<p>
	 *
	 */
	public boolean cst_grp_flg2() {
		return cst_grp_p().bp_grp_flg2();
	}

	/**
	 * Customer classification 2 得意先分類２.<p>
	 *
	 */
	public void cst_grp_flg2(boolean value) {
		cst_grp_p().bp_grp_flg2(value);
	}

	/**
	 * Customer classification cd. 2 得意先分類ＣＤ２.<p>
	 *
	 */
	public String cst_grp_cd2() {
		return cst_grp_p().bp_grp_cd2();
	}

	/**
	 * Customer classification cd. 2 得意先分類ＣＤ２.<p>
	 *
	 */
	public void cst_grp_cd2(String value) {
		cst_grp_p().bp_grp_cd2(value);
	}

	/**
	 * Customer classification name 2 得意先分類名２.<p>
	 *
	 */
	public String cst_grp_nm2() {
		return cst_grp_p().bp_grp_nm2();
	}

	/**
	 * Customer classification name 2 得意先分類名２.<p>
	 *
	 */
	public void cst_grp_nm2(String value) {
		cst_grp_p().bp_grp_nm2(value);
	}

	/**
	 * Customer classification 3 得意先分類３.<p>
	 *
	 */
	public boolean cst_grp_flg3() {
		return cst_grp_p().bp_grp_flg3();
	}

	/**
	 * Customer classification 3 得意先分類３.<p>
	 *
	 */
	public void cst_grp_flg3(boolean value) {
		cst_grp_p().bp_grp_flg3(value);
	}

	/**
	 * Customer classification cd. 3 得意先分類ＣＤ３.<p>
	 *
	 */
	public String cst_grp_cd3() {
		return cst_grp_p().bp_grp_cd3();
	}

	/**
	 * Customer classification cd. 3 得意先分類ＣＤ３.<p>
	 *
	 */
	public void cst_grp_cd3(String value) {
		cst_grp_p().bp_grp_cd3(value);
	}

	/**
	 * Customer classification name 3 得意先分類名３.<p>
	 *
	 */
	public String cst_grp_nm3() {
		return cst_grp_p().bp_grp_nm3();
	}

	/**
	 * Customer classification name 3 得意先分類名３.<p>
	 *
	 */
	public void cst_grp_nm3(String value) {
		cst_grp_p().bp_grp_nm3(value);
	}

	/**
	 * Customer classification 4 得意先分類４.<p>
	 *
	 */
	public boolean cst_grp_flg4() {
		return cst_grp_p().bp_grp_flg4();
	}

	/**
	 * Customer classification 4 得意先分類４.<p>
	 *
	 */
	public void cst_grp_flg4(boolean value) {
		cst_grp_p().bp_grp_flg4(value);
	}

	/**
	 * Customer classification cd. 4 得意先分類ＣＤ４.<p>
	 *
	 */
	public String cst_grp_cd4() {
		return cst_grp_p().bp_grp_cd4();
	}

	/**
	 * Customer classification cd. 4 得意先分類ＣＤ４.<p>
	 *
	 */
	public void cst_grp_cd4(String value) {
		cst_grp_p().bp_grp_cd4(value);
	}

	/**
	 * Customer classification name 4 得意先分類名４.<p>
	 *
	 */
	public String cst_grp_nm4() {
		return cst_grp_p().bp_grp_nm4();
	}

	/**
	 * Customer classification name 4 得意先分類名４.<p>
	 *
	 */
	public void cst_grp_nm4(String value) {
		cst_grp_p().bp_grp_nm4(value);
	}

	/**
	 * Customer classification 5 得意先分類５.<p>
	 *
	 */
	public boolean cst_grp_flg5() {
		return cst_grp_p().bp_grp_flg5();
	}

	/**
	 * Customer classification 5 得意先分類５.<p>
	 *
	 */
	public void cst_grp_flg5(boolean value) {
		cst_grp_p().bp_grp_flg5(value);
	}

	/**
	 * Customer classification cd. 5 得意先分類ＣＤ５.<p>
	 *
	 */
	public String cst_grp_cd5() {
		return cst_grp_p().bp_grp_cd5();
	}

	/**
	 * Customer classification cd. 5 得意先分類ＣＤ５.<p>
	 *
	 */
	public void cst_grp_cd5(String value) {
		cst_grp_p().bp_grp_cd5(value);
	}

	/**
	 * Customer classification name 5 得意先分類名５.<p>
	 *
	 */
	public String cst_grp_nm5() {
		return cst_grp_p().bp_grp_nm5();
	}

	/**
	 * Customer classification name 5 得意先分類名５.<p>
	 *
	 */
	public void cst_grp_nm5(String value) {
		cst_grp_p().bp_grp_nm5(value);
	}

	/**
	 * Customer classification 6 得意先分類６.<p>
	 *
	 */
	public boolean cst_grp_flg6() {
		return cst_grp_p().bp_grp_flg6();
	}

	/**
	 * Customer classification 6 得意先分類６.<p>
	 *
	 */
	public void cst_grp_flg6(boolean value) {
		cst_grp_p().bp_grp_flg6(value);
	}

	/**
	 * Customer classification cd. 6 得意先分類ＣＤ６.<p>
	 *
	 */
	public String cst_grp_cd6() {
		return cst_grp_p().bp_grp_cd6();
	}

	/**
	 * Customer classification cd. 6 得意先分類ＣＤ６.<p>
	 *
	 */
	public void cst_grp_cd6(String value) {
		cst_grp_p().bp_grp_cd6(value);
	}

	/**
	 * Customer classification name 6 得意先分類名６.<p>
	 *
	 */
	public String cst_grp_nm6() {
		return cst_grp_p().bp_grp_nm6();
	}

	/**
	 * Customer classification name 6 得意先分類名６.<p>
	 *
	 */
	public void cst_grp_nm6(String value) {
		cst_grp_p().bp_grp_nm6(value);
	}

	/**
	 * Customer classification 7 得意先分類７.<p>
	 *
	 */
	public boolean cst_grp_flg7() {
		return cst_grp_p().bp_grp_flg7();
	}

	/**
	 * Customer classification 7 得意先分類７.<p>
	 *
	 */
	public void cst_grp_flg7(boolean value) {
		cst_grp_p().bp_grp_flg7(value);
	}

	/**
	 * Customer classification cd. 7 得意先分類ＣＤ７.<p>
	 *
	 */
	public String cst_grp_cd7() {
		return cst_grp_p().bp_grp_cd7();
	}

	/**
	 * Customer classification cd. 7 得意先分類ＣＤ７.<p>
	 *
	 */
	public void cst_grp_cd7(String value) {
		cst_grp_p().bp_grp_cd7(value);
	}

	/**
	 * Customer classification name 7 得意先分類名７.<p>
	 *
	 */
	public String cst_grp_nm7() {
		return cst_grp_p().bp_grp_nm7();
	}

	/**
	 * Customer classification name 7 得意先分類名７.<p>
	 *
	 */
	public void cst_grp_nm7(String value) {
		cst_grp_p().bp_grp_nm7(value);
	}

	/**
	 * Customer classification 8 得意先分類８.<p>
	 *
	 */
	public boolean cst_grp_flg8() {
		return cst_grp_p().bp_grp_flg8();
	}

	/**
	 * Customer classification 8 得意先分類８.<p>
	 *
	 */
	public void cst_grp_flg8(boolean value) {
		cst_grp_p().bp_grp_flg8(value);
	}

	/**
	 * Customer classification cd. 8 得意先分類ＣＤ８.<p>
	 *
	 */
	public String cst_grp_cd8() {
		return cst_grp_p().bp_grp_cd8();
	}

	/**
	 * Customer classification cd. 8 得意先分類ＣＤ８.<p>
	 *
	 */
	public void cst_grp_cd8(String value) {
		cst_grp_p().bp_grp_cd8(value);
	}

	/**
	 * Customer classification name 8 得意先分類名８.<p>
	 *
	 */
	public String cst_grp_nm8() {
		return cst_grp_p().bp_grp_nm8();
	}

	/**
	 * Customer classification name 8 得意先分類名８.<p>
	 *
	 */
	public void cst_grp_nm8(String value) {
		cst_grp_p().bp_grp_nm8(value);
	}

	/**
	 * Customer classification 9 得意先分類９.<p>
	 *
	 */
	public boolean cst_grp_flg9() {
		return cst_grp_p().bp_grp_flg9();
	}

	/**
	 * Customer classification 9 得意先分類９.<p>
	 *
	 */
	public void cst_grp_flg9(boolean value) {
		cst_grp_p().bp_grp_flg9(value);
	}

	/**
	 * Customer classification cd. 9 得意先分類ＣＤ９.<p>
	 *
	 */
	public String cst_grp_cd9() {
		return cst_grp_p().bp_grp_cd9();
	}

	/**
	 * Customer classification cd. 9 得意先分類ＣＤ９.<p>
	 *
	 */
	public void cst_grp_cd9(String value) {
		cst_grp_p().bp_grp_cd9(value);
	}

	/**
	 * Customer classification name 9 得意先分類名９.<p>
	 *
	 */
	public String cst_grp_nm9() {
		return cst_grp_p().bp_grp_nm9();
	}

	/**
	 * Customer classification name 9 得意先分類名９.<p>
	 *
	 */
	public void cst_grp_nm9(String value) {
		cst_grp_p().bp_grp_nm9(value);
	}

	/**
	 * Customer classification 10 得意先分類１０.<p>
	 *
	 */
	public boolean cst_grp_flg10() {
		return cst_grp_p().bp_grp_flg10();
	}

	/**
	 * Customer classification 10 得意先分類１０.<p>
	 *
	 */
	public void cst_grp_flg10(boolean value) {
		cst_grp_p().bp_grp_flg10(value);
	}

	/**
	 * Customer classification cd. 10 得意先分類ＣＤ１０.<p>
	 *
	 */
	public String cst_grp_cd10() {
		return cst_grp_p().bp_grp_cd10();
	}

	/**
	 * Customer classification cd. 10 得意先分類ＣＤ１０.<p>
	 *
	 */
	public void cst_grp_cd10(String value) {
		cst_grp_p().bp_grp_cd10(value);
	}

	/**
	 * Customer classification name 10 得意先分類名１０.<p>
	 *
	 */
	public String cst_grp_nm10() {
		return cst_grp_p().bp_grp_nm10();
	}

	/**
	 * Customer classification name 10 得意先分類名１０.<p>
	 *
	 */
	public void cst_grp_nm10(String value) {
		cst_grp_p().bp_grp_nm10(value);
	}

	/**
	 * Delivery destination classification 1 納品先分類１.<p>
	 *
	 */
	public boolean dlv_grp_flg1() {
		return dlv_grp_p().bp_grp_flg1();
	}

	/**
	 * Delivery destination classification 1 納品先分類１.<p>
	 *
	 */
	public void dlv_grp_flg1(boolean value) {
		dlv_grp_p().bp_grp_flg1(value);
	}

	/**
	 * Delivery destination classification cd. 1 納品先分類ＣＤ１.<p>
	 *
	 */
	public String dlv_grp_cd1() {
		return dlv_grp_p().bp_grp_cd1();
	}

	/**
	 * Delivery destination classification cd. 1 納品先分類ＣＤ１.<p>
	 *
	 */
	public void dlv_grp_cd1(String value) {
		dlv_grp_p().bp_grp_cd1(value);
	}

	/**
	 * Delivery destination classification name 1 納品先分類名１.<p>
	 *
	 */
	public String dlv_grp_nm1() {
		return dlv_grp_p().bp_grp_nm1();
	}

	/**
	 * Delivery destination classification name 1 納品先分類名１.<p>
	 *
	 */
	public void dlv_grp_nm1(String value) {
		dlv_grp_p().bp_grp_nm1(value);
	}

	/**
	 * Delivery destination classification 2 納品先分類２.<p>
	 *
	 */
	public boolean dlv_grp_flg2() {
		return dlv_grp_p().bp_grp_flg2();
	}

	/**
	 * Delivery destination classification 2 納品先分類２.<p>
	 *
	 */
	public void dlv_grp_flg2(boolean value) {
		dlv_grp_p().bp_grp_flg2(value);
	}

	/**
	 * Delivery destination classification cd. 2 納品先分類ＣＤ２.<p>
	 *
	 */
	public String dlv_grp_cd2() {
		return dlv_grp_p().bp_grp_cd2();
	}

	/**
	 * Delivery destination classification cd. 2 納品先分類ＣＤ２.<p>
	 *
	 */
	public void dlv_grp_cd2(String value) {
		dlv_grp_p().bp_grp_cd2(value);
	}

	/**
	 * Delivery destination classification name 2 納品先分類名２.<p>
	 *
	 */
	public String dlv_grp_nm2() {
		return dlv_grp_p().bp_grp_nm2();
	}

	/**
	 * Delivery destination classification name 2 納品先分類名２.<p>
	 *
	 */
	public void dlv_grp_nm2(String value) {
		dlv_grp_p().bp_grp_nm2(value);
	}

	/**
	 * Delivery destination classification 3 納品先分類３.<p>
	 *
	 */
	public boolean dlv_grp_flg3() {
		return dlv_grp_p().bp_grp_flg3();
	}

	/**
	 * Delivery destination classification 3 納品先分類３.<p>
	 *
	 */
	public void dlv_grp_flg3(boolean value) {
		dlv_grp_p().bp_grp_flg3(value);
	}

	/**
	 * Delivery destination classification cd. 3 納品先分類ＣＤ３.<p>
	 *
	 */
	public String dlv_grp_cd3() {
		return dlv_grp_p().bp_grp_cd3();
	}

	/**
	 * Delivery destination classification cd. 3 納品先分類ＣＤ３.<p>
	 *
	 */
	public void dlv_grp_cd3(String value) {
		dlv_grp_p().bp_grp_cd3(value);
	}

	/**
	 * Delivery destination classification name 3 納品先分類名３.<p>
	 *
	 */
	public String dlv_grp_nm3() {
		return dlv_grp_p().bp_grp_nm3();
	}

	/**
	 * Delivery destination classification name 3 納品先分類名３.<p>
	 *
	 */
	public void dlv_grp_nm3(String value) {
		dlv_grp_p().bp_grp_nm3(value);
	}

	/**
	 * Delivery destination classification 4 納品先分類４.<p>
	 *
	 */
	public boolean dlv_grp_flg4() {
		return dlv_grp_p().bp_grp_flg4();
	}

	/**
	 * Delivery destination classification 4 納品先分類４.<p>
	 *
	 */
	public void dlv_grp_flg4(boolean value) {
		dlv_grp_p().bp_grp_flg4(value);
	}

	/**
	 * Delivery destination classification cd. 4 納品先分類ＣＤ４.<p>
	 *
	 */
	public String dlv_grp_cd4() {
		return dlv_grp_p().bp_grp_cd4();
	}

	/**
	 * Delivery destination classification cd. 4 納品先分類ＣＤ４.<p>
	 *
	 */
	public void dlv_grp_cd4(String value) {
		dlv_grp_p().bp_grp_cd4(value);
	}

	/**
	 * Delivery destination classification name 4 納品先分類名４.<p>
	 *
	 */
	public String dlv_grp_nm4() {
		return dlv_grp_p().bp_grp_nm4();
	}

	/**
	 * Delivery destination classification name 4 納品先分類名４.<p>
	 *
	 */
	public void dlv_grp_nm4(String value) {
		dlv_grp_p().bp_grp_nm4(value);
	}

	/**
	 * Delivery destination classification 5 納品先分類５.<p>
	 *
	 */
	public boolean dlv_grp_flg5() {
		return dlv_grp_p().bp_grp_flg5();
	}

	/**
	 * Delivery destination classification 5 納品先分類５.<p>
	 *
	 */
	public void dlv_grp_flg5(boolean value) {
		dlv_grp_p().bp_grp_flg5(value);
	}

	/**
	 * Delivery destination classification cd. 5 納品先分類ＣＤ５.<p>
	 *
	 */
	public String dlv_grp_cd5() {
		return dlv_grp_p().bp_grp_cd5();
	}

	/**
	 * Delivery destination classification cd. 5 納品先分類ＣＤ５.<p>
	 *
	 */
	public void dlv_grp_cd5(String value) {
		dlv_grp_p().bp_grp_cd5(value);
	}

	/**
	 * Delivery destination classification name 5 納品先分類名５.<p>
	 *
	 */
	public String dlv_grp_nm5() {
		return dlv_grp_p().bp_grp_nm5();
	}

	/**
	 * Delivery destination classification name 5 納品先分類名５.<p>
	 *
	 */
	public void dlv_grp_nm5(String value) {
		dlv_grp_p().bp_grp_nm5(value);
	}

	/**
	 * Delivery destination classification 6 納品先分類６.<p>
	 *
	 */
	public boolean dlv_grp_flg6() {
		return dlv_grp_p().bp_grp_flg6();
	}

	/**
	 * Delivery destination classification 6 納品先分類６.<p>
	 *
	 */
	public void dlv_grp_flg6(boolean value) {
		dlv_grp_p().bp_grp_flg6(value);
	}

	/**
	 * Delivery destination classification cd. 6 納品先分類ＣＤ６.<p>
	 *
	 */
	public String dlv_grp_cd6() {
		return dlv_grp_p().bp_grp_cd6();
	}

	/**
	 * Delivery destination classification cd. 6 納品先分類ＣＤ６.<p>
	 *
	 */
	public void dlv_grp_cd6(String value) {
		dlv_grp_p().bp_grp_cd6(value);
	}

	/**
	 * Delivery destination classification name 6 納品先分類名６.<p>
	 *
	 */
	public String dlv_grp_nm6() {
		return dlv_grp_p().bp_grp_nm6();
	}

	/**
	 * Delivery destination classification name 6 納品先分類名６.<p>
	 *
	 */
	public void dlv_grp_nm6(String value) {
		dlv_grp_p().bp_grp_nm6(value);
	}

	/**
	 * Delivery destination classification 7 納品先分類７.<p>
	 *
	 */
	public boolean dlv_grp_flg7() {
		return dlv_grp_p().bp_grp_flg7();
	}

	/**
	 * Delivery destination classification 7 納品先分類７.<p>
	 *
	 */
	public void dlv_grp_flg7(boolean value) {
		dlv_grp_p().bp_grp_flg7(value);
	}

	/**
	 * Delivery destination classification cd. 7 納品先分類ＣＤ７.<p>
	 *
	 */
	public String dlv_grp_cd7() {
		return dlv_grp_p().bp_grp_cd7();
	}

	/**
	 * Delivery destination classification cd. 7 納品先分類ＣＤ７.<p>
	 *
	 */
	public void dlv_grp_cd7(String value) {
		dlv_grp_p().bp_grp_cd7(value);
	}

	/**
	 * Delivery destination classification name 7 納品先分類名７.<p>
	 *
	 */
	public String dlv_grp_nm7() {
		return dlv_grp_p().bp_grp_nm7();
	}

	/**
	 * Delivery destination classification name 7 納品先分類名７.<p>
	 *
	 */
	public void dlv_grp_nm7(String value) {
		dlv_grp_p().bp_grp_nm7(value);
	}

	/**
	 * Delivery destination classification 8 納品先分類８.<p>
	 *
	 */
	public boolean dlv_grp_flg8() {
		return dlv_grp_p().bp_grp_flg8();
	}

	/**
	 * Delivery destination classification 8 納品先分類８.<p>
	 *
	 */
	public void dlv_grp_flg8(boolean value) {
		dlv_grp_p().bp_grp_flg8(value);
	}

	/**
	 * Delivery destination classification cd. 8 納品先分類ＣＤ８.<p>
	 *
	 */
	public String dlv_grp_cd8() {
		return dlv_grp_p().bp_grp_cd8();
	}

	/**
	 * Delivery destination classification cd. 8 納品先分類ＣＤ８.<p>
	 *
	 */
	public void dlv_grp_cd8(String value) {
		dlv_grp_p().bp_grp_cd8(value);
	}

	/**
	 * Delivery destination classification name 8 納品先分類名８.<p>
	 *
	 */
	public String dlv_grp_nm8() {
		return dlv_grp_p().bp_grp_nm8();
	}

	/**
	 * Delivery destination classification name 8 納品先分類名８.<p>
	 *
	 */
	public void dlv_grp_nm8(String value) {
		dlv_grp_p().bp_grp_nm8(value);
	}

	/**
	 * Delivery destination classification 9 納品先分類９.<p>
	 *
	 */
	public boolean dlv_grp_flg9() {
		return dlv_grp_p().bp_grp_flg9();
	}

	/**
	 * Delivery destination classification 9 納品先分類９.<p>
	 *
	 */
	public void dlv_grp_flg9(boolean value) {
		dlv_grp_p().bp_grp_flg9(value);
	}

	/**
	 * Delivery destination classification cd. 9 納品先分類ＣＤ９.<p>
	 *
	 */
	public String dlv_grp_cd9() {
		return dlv_grp_p().bp_grp_cd9();
	}

	/**
	 * Delivery destination classification cd. 9 納品先分類ＣＤ９.<p>
	 *
	 */
	public void dlv_grp_cd9(String value) {
		dlv_grp_p().bp_grp_cd9(value);
	}

	/**
	 * Delivery destination classification name 9 納品先分類名９.<p>
	 *
	 */
	public String dlv_grp_nm9() {
		return dlv_grp_p().bp_grp_nm9();
	}

	/**
	 * Delivery destination classification name 9 納品先分類名９.<p>
	 *
	 */
	public void dlv_grp_nm9(String value) {
		dlv_grp_p().bp_grp_nm9(value);
	}

	/**
	 * Delivery destination classification 10 納品先分類１０.<p>
	 *
	 */
	public boolean dlv_grp_flg10() {
		return dlv_grp_p().bp_grp_flg10();
	}

	/**
	 * Delivery destination classification 10 納品先分類１０.<p>
	 *
	 */
	public void dlv_grp_flg10(boolean value) {
		dlv_grp_p().bp_grp_flg10(value);
	}

	/**
	 * Delivery destination classification cd. 10 納品先分類ＣＤ１０.<p>
	 *
	 */
	public String dlv_grp_cd10() {
		return dlv_grp_p().bp_grp_cd10();
	}

	/**
	 * Delivery destination classification cd. 10 納品先分類ＣＤ１０.<p>
	 *
	 */
	public void dlv_grp_cd10(String value) {
		dlv_grp_p().bp_grp_cd10(value);
	}

	/**
	 * Delivery destination classification name 10 納品先分類名１０.<p>
	 *
	 */
	public String dlv_grp_nm10() {
		return dlv_grp_p().bp_grp_nm10();
	}

	/**
	 * Delivery destination classification name 10 納品先分類名１０.<p>
	 *
	 */
	public void dlv_grp_nm10(String value) {
		dlv_grp_p().bp_grp_nm10(value);
	}

	public boolean itm_grp_flg1() {
		return itm_grp_p().itm_grp_flg1();
	}

	public void itm_grp_flg1(boolean value) {
		itm_grp_p().itm_grp_flg1(value);
	}

	public String itm_grp_cd1() {
		return itm_grp_p().itm_grp_cd1();
	}

	public void itm_grp_cd1(String value) {
		itm_grp_p().itm_grp_cd1(value);
	}

	public String itm_grp_nm1() {
		return itm_grp_p().itm_grp_nm1();
	}

	public void itm_grp_nm1(String value) {
		itm_grp_p().itm_grp_nm1(value);
	}

	public boolean itm_grp_flg2() {
		return itm_grp_p().itm_grp_flg2();
	}

	public void itm_grp_flg2(boolean value) {
		itm_grp_p().itm_grp_flg2(value);
	}

	public String itm_grp_cd2() {
		return itm_grp_p().itm_grp_cd2();
	}

	public void itm_grp_cd2(String value) {
		itm_grp_p().itm_grp_cd2(value);
	}

	public String itm_grp_nm2() {
		return itm_grp_p().itm_grp_nm2();
	}

	public void itm_grp_nm2(String value) {
		itm_grp_p().itm_grp_nm2(value);
	}

	public boolean itm_grp_flg3() {
		return itm_grp_p().itm_grp_flg3();
	}

	public void itm_grp_flg3(boolean value) {
		itm_grp_p().itm_grp_flg3(value);
	}

	public String itm_grp_cd3() {
		return itm_grp_p().itm_grp_cd3();
	}

	public void itm_grp_cd3(String value) {
		itm_grp_p().itm_grp_cd3(value);
	}

	public String itm_grp_nm3() {
		return itm_grp_p().itm_grp_nm3();
	}

	public void itm_grp_nm3(String value) {
		itm_grp_p().itm_grp_nm3(value);
	}

	public boolean itm_grp_flg4() {
		return itm_grp_p().itm_grp_flg4();
	}

	public void itm_grp_flg4(boolean value) {
		itm_grp_p().itm_grp_flg4(value);
	}

	public String itm_grp_cd4() {
		return itm_grp_p().itm_grp_cd4();
	}

	public void itm_grp_cd4(String value) {
		itm_grp_p().itm_grp_cd4(value);
	}

	public String itm_grp_nm4() {
		return itm_grp_p().itm_grp_nm4();
	}

	public void itm_grp_nm4(String value) {
		itm_grp_p().itm_grp_nm4(value);
	}

	public boolean itm_grp_flg5() {
		return itm_grp_p().itm_grp_flg5();
	}

	public void itm_grp_flg5(boolean value) {
		itm_grp_p().itm_grp_flg5(value);
	}

	public String itm_grp_cd5() {
		return itm_grp_p().itm_grp_cd5();
	}

	public void itm_grp_cd5(String value) {
		itm_grp_p().itm_grp_cd5(value);
	}

	public String itm_grp_nm5() {
		return itm_grp_p().itm_grp_nm5();
	}

	public void itm_grp_nm5(String value) {
		itm_grp_p().itm_grp_nm5(value);
	}

	public boolean itm_grp_flg6() {
		return itm_grp_p().itm_grp_flg6();
	}

	public void itm_grp_flg6(boolean value) {
		itm_grp_p().itm_grp_flg6(value);
	}

	public String itm_grp_cd6() {
		return itm_grp_p().itm_grp_cd6();
	}

	public void itm_grp_cd6(String value) {
		itm_grp_p().itm_grp_cd6(value);
	}

	public String itm_grp_nm6() {
		return itm_grp_p().itm_grp_nm6();
	}

	public void itm_grp_nm6(String value) {
		itm_grp_p().itm_grp_nm6(value);
	}

	public boolean itm_grp_flg7() {
		return itm_grp_p().itm_grp_flg7();
	}

	public void itm_grp_flg7(boolean value) {
		itm_grp_p().itm_grp_flg7(value);
	}

	public String itm_grp_cd7() {
		return itm_grp_p().itm_grp_cd7();
	}

	public void itm_grp_cd7(String value) {
		itm_grp_p().itm_grp_cd7(value);
	}

	public String itm_grp_nm7() {
		return itm_grp_p().itm_grp_nm7();
	}

	public void itm_grp_nm7(String value) {
		itm_grp_p().itm_grp_nm7(value);
	}

	public boolean itm_grp_flg8() {
		return itm_grp_p().itm_grp_flg8();
	}

	public void itm_grp_flg8(boolean value) {
		itm_grp_p().itm_grp_flg8(value);
	}

	public String itm_grp_cd8() {
		return itm_grp_p().itm_grp_cd8();
	}

	public void itm_grp_cd8(String value) {
		itm_grp_p().itm_grp_cd8(value);
	}

	public String itm_grp_nm8() {
		return itm_grp_p().itm_grp_nm8();
	}

	public void itm_grp_nm8(String value) {
		itm_grp_p().itm_grp_nm8(value);
	}

	public boolean itm_grp_flg9() {
		return itm_grp_p().itm_grp_flg9();
	}

	public void itm_grp_flg9(boolean value) {
		itm_grp_p().itm_grp_flg9(value);
	}

	public String itm_grp_cd9() {
		return itm_grp_p().itm_grp_cd9();
	}

	public void itm_grp_cd9(String value) {
		itm_grp_p().itm_grp_cd9(value);
	}

	public String itm_grp_nm9() {
		return itm_grp_p().itm_grp_nm9();
	}

	public void itm_grp_nm9(String value) {
		itm_grp_p().itm_grp_nm9(value);
	}

	public boolean itm_grp_flg10() {
		return itm_grp_p().itm_grp_flg10();
	}

	public void itm_grp_flg10(boolean value) {
		itm_grp_p().itm_grp_flg10(value);
	}

	public String itm_grp_cd10() {
		return itm_grp_p().itm_grp_cd10();
	}

	public void itm_grp_cd10(String value) {
		itm_grp_p().itm_grp_cd10(value);
	}

	public String itm_grp_nm10() {
		return itm_grp_p().itm_grp_nm10();
	}

	public void itm_grp_nm10(String value) {
		itm_grp_p().itm_grp_nm10(value);
	}

}

