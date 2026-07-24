package mcframe.serverMSBB.MSBBL1120;

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
 * ブロック"Srch01_Cnd"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Srch01_CndR_MC_A extends MCConstRow {

	/**
	 * Operation type 操作種別.<p>
	 *
	 */
	public static final String $ope = "ope";
	/**
	 * Display unit 表示単位.<p>
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
	 * Item type 品目区分.<p>
	 *
	 */
	public static final String $itm_typ = "itm_typ";
	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public static final String $itm_typ_d_cd = "itm_typ_d_cd";
	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public static final String $itm_typ_d_nm = "itm_typ_d_nm";
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
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public static final String $sno1 = "sno1";
	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public static final String $sno2 = "sno2";
	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public static final String $sno3 = "sno3";
	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public static final String $sno4 = "sno4";
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
	 * Customer quotation request No. 得意先見積依頼ＮＯ.<p>
	 *
	 */
	public static final String $cst_qtn_rqst_no = "cst_qtn_rqst_no";
	/**
	 * Customer quotation request details No. 得意先見積依頼明細ＮＯ.<p>
	 *
	 */
	public static final String $cst_qtn_rqst_d_no = "cst_qtn_rqst_d_no";
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
	/**
	 * Customer classification 1 得意先分類１.<p>
	 *
	 */
	public static final String $cst_grp_flg1 = "cst_grp_flg1";
	/**
	 * Customer classification cd. 1 得意先分類ＣＤ１.<p>
	 *
	 */
	public static final String $cst_grp_cd1 = "cst_grp_cd1";
	/**
	 * Customer classification name 1 得意先分類名１.<p>
	 *
	 */
	public static final String $cst_grp_nm1 = "cst_grp_nm1";
	/**
	 * Customer classification 2 得意先分類２.<p>
	 *
	 */
	public static final String $cst_grp_flg2 = "cst_grp_flg2";
	/**
	 * Customer classification cd. 2 得意先分類ＣＤ２.<p>
	 *
	 */
	public static final String $cst_grp_cd2 = "cst_grp_cd2";
	/**
	 * Customer classification name 2 得意先分類名２.<p>
	 *
	 */
	public static final String $cst_grp_nm2 = "cst_grp_nm2";
	/**
	 * Customer classification 3 得意先分類３.<p>
	 *
	 */
	public static final String $cst_grp_flg3 = "cst_grp_flg3";
	/**
	 * Customer classification cd. 3 得意先分類ＣＤ３.<p>
	 *
	 */
	public static final String $cst_grp_cd3 = "cst_grp_cd3";
	/**
	 * Customer classification name 3 得意先分類名３.<p>
	 *
	 */
	public static final String $cst_grp_nm3 = "cst_grp_nm3";
	/**
	 * Customer classification 4 得意先分類４.<p>
	 *
	 */
	public static final String $cst_grp_flg4 = "cst_grp_flg4";
	/**
	 * Customer classification cd. 4 得意先分類ＣＤ４.<p>
	 *
	 */
	public static final String $cst_grp_cd4 = "cst_grp_cd4";
	/**
	 * Customer classification name 4 得意先分類名４.<p>
	 *
	 */
	public static final String $cst_grp_nm4 = "cst_grp_nm4";
	/**
	 * Customer classification 5 得意先分類５.<p>
	 *
	 */
	public static final String $cst_grp_flg5 = "cst_grp_flg5";
	/**
	 * Customer classification cd. 5 得意先分類ＣＤ５.<p>
	 *
	 */
	public static final String $cst_grp_cd5 = "cst_grp_cd5";
	/**
	 * Customer classification name 5 得意先分類名５.<p>
	 *
	 */
	public static final String $cst_grp_nm5 = "cst_grp_nm5";
	/**
	 * Customer classification 6 得意先分類６.<p>
	 *
	 */
	public static final String $cst_grp_flg6 = "cst_grp_flg6";
	/**
	 * Customer classification cd. 6 得意先分類ＣＤ６.<p>
	 *
	 */
	public static final String $cst_grp_cd6 = "cst_grp_cd6";
	/**
	 * Customer classification name 6 得意先分類名６.<p>
	 *
	 */
	public static final String $cst_grp_nm6 = "cst_grp_nm6";
	/**
	 * Customer classification 7 得意先分類７.<p>
	 *
	 */
	public static final String $cst_grp_flg7 = "cst_grp_flg7";
	/**
	 * Customer classification cd. 7 得意先分類ＣＤ７.<p>
	 *
	 */
	public static final String $cst_grp_cd7 = "cst_grp_cd7";
	/**
	 * Customer classification name 7 得意先分類名７.<p>
	 *
	 */
	public static final String $cst_grp_nm7 = "cst_grp_nm7";
	/**
	 * Customer classification 8 得意先分類８.<p>
	 *
	 */
	public static final String $cst_grp_flg8 = "cst_grp_flg8";
	/**
	 * Customer classification cd. 8 得意先分類ＣＤ８.<p>
	 *
	 */
	public static final String $cst_grp_cd8 = "cst_grp_cd8";
	/**
	 * Customer classification name 8 得意先分類名８.<p>
	 *
	 */
	public static final String $cst_grp_nm8 = "cst_grp_nm8";
	/**
	 * Customer classification 9 得意先分類９.<p>
	 *
	 */
	public static final String $cst_grp_flg9 = "cst_grp_flg9";
	/**
	 * Customer classification cd. 9 得意先分類ＣＤ９.<p>
	 *
	 */
	public static final String $cst_grp_cd9 = "cst_grp_cd9";
	/**
	 * Customer classification name 9 得意先分類名９.<p>
	 *
	 */
	public static final String $cst_grp_nm9 = "cst_grp_nm9";
	/**
	 * Customer classification 10 得意先分類１０.<p>
	 *
	 */
	public static final String $cst_grp_flg10 = "cst_grp_flg10";
	/**
	 * Customer classification cd. 10 得意先分類ＣＤ１０.<p>
	 *
	 */
	public static final String $cst_grp_cd10 = "cst_grp_cd10";
	/**
	 * Customer classification name 10 得意先分類名１０.<p>
	 *
	 */
	public static final String $cst_grp_nm10 = "cst_grp_nm10";
	/**
	 * Delivery destination classification 1 納品先分類１.<p>
	 *
	 */
	public static final String $dlv_grp_flg1 = "dlv_grp_flg1";
	/**
	 * Delivery destination classification cd. 1 納品先分類ＣＤ１.<p>
	 *
	 */
	public static final String $dlv_grp_cd1 = "dlv_grp_cd1";
	/**
	 * Delivery destination classification name 1 納品先分類名１.<p>
	 *
	 */
	public static final String $dlv_grp_nm1 = "dlv_grp_nm1";
	/**
	 * Delivery destination classification 2 納品先分類２.<p>
	 *
	 */
	public static final String $dlv_grp_flg2 = "dlv_grp_flg2";
	/**
	 * Delivery destination classification cd. 2 納品先分類ＣＤ２.<p>
	 *
	 */
	public static final String $dlv_grp_cd2 = "dlv_grp_cd2";
	/**
	 * Delivery destination classification name 2 納品先分類名２.<p>
	 *
	 */
	public static final String $dlv_grp_nm2 = "dlv_grp_nm2";
	/**
	 * Delivery destination classification 3 納品先分類３.<p>
	 *
	 */
	public static final String $dlv_grp_flg3 = "dlv_grp_flg3";
	/**
	 * Delivery destination classification cd. 3 納品先分類ＣＤ３.<p>
	 *
	 */
	public static final String $dlv_grp_cd3 = "dlv_grp_cd3";
	/**
	 * Delivery destination classification name 3 納品先分類名３.<p>
	 *
	 */
	public static final String $dlv_grp_nm3 = "dlv_grp_nm3";
	/**
	 * Delivery destination classification 4 納品先分類４.<p>
	 *
	 */
	public static final String $dlv_grp_flg4 = "dlv_grp_flg4";
	/**
	 * Delivery destination classification cd. 4 納品先分類ＣＤ４.<p>
	 *
	 */
	public static final String $dlv_grp_cd4 = "dlv_grp_cd4";
	/**
	 * Delivery destination classification name 4 納品先分類名４.<p>
	 *
	 */
	public static final String $dlv_grp_nm4 = "dlv_grp_nm4";
	/**
	 * Delivery destination classification 5 納品先分類５.<p>
	 *
	 */
	public static final String $dlv_grp_flg5 = "dlv_grp_flg5";
	/**
	 * Delivery destination classification cd. 5 納品先分類ＣＤ５.<p>
	 *
	 */
	public static final String $dlv_grp_cd5 = "dlv_grp_cd5";
	/**
	 * Delivery destination classification name 5 納品先分類名５.<p>
	 *
	 */
	public static final String $dlv_grp_nm5 = "dlv_grp_nm5";
	/**
	 * Delivery destination classification 6 納品先分類６.<p>
	 *
	 */
	public static final String $dlv_grp_flg6 = "dlv_grp_flg6";
	/**
	 * Delivery destination classification cd. 6 納品先分類ＣＤ６.<p>
	 *
	 */
	public static final String $dlv_grp_cd6 = "dlv_grp_cd6";
	/**
	 * Delivery destination classification name 6 納品先分類名６.<p>
	 *
	 */
	public static final String $dlv_grp_nm6 = "dlv_grp_nm6";
	/**
	 * Delivery destination classification 7 納品先分類７.<p>
	 *
	 */
	public static final String $dlv_grp_flg7 = "dlv_grp_flg7";
	/**
	 * Delivery destination classification cd. 7 納品先分類ＣＤ７.<p>
	 *
	 */
	public static final String $dlv_grp_cd7 = "dlv_grp_cd7";
	/**
	 * Delivery destination classification name 7 納品先分類名７.<p>
	 *
	 */
	public static final String $dlv_grp_nm7 = "dlv_grp_nm7";
	/**
	 * Delivery destination classification 8 納品先分類８.<p>
	 *
	 */
	public static final String $dlv_grp_flg8 = "dlv_grp_flg8";
	/**
	 * Delivery destination classification cd. 8 納品先分類ＣＤ８.<p>
	 *
	 */
	public static final String $dlv_grp_cd8 = "dlv_grp_cd8";
	/**
	 * Delivery destination classification name 8 納品先分類名８.<p>
	 *
	 */
	public static final String $dlv_grp_nm8 = "dlv_grp_nm8";
	/**
	 * Delivery destination classification 9 納品先分類９.<p>
	 *
	 */
	public static final String $dlv_grp_flg9 = "dlv_grp_flg9";
	/**
	 * Delivery destination classification cd. 9 納品先分類ＣＤ９.<p>
	 *
	 */
	public static final String $dlv_grp_cd9 = "dlv_grp_cd9";
	/**
	 * Delivery destination classification name 9 納品先分類名９.<p>
	 *
	 */
	public static final String $dlv_grp_nm9 = "dlv_grp_nm9";
	/**
	 * Delivery destination classification 10 納品先分類１０.<p>
	 *
	 */
	public static final String $dlv_grp_flg10 = "dlv_grp_flg10";
	/**
	 * Delivery destination classification cd. 10 納品先分類ＣＤ１０.<p>
	 *
	 */
	public static final String $dlv_grp_cd10 = "dlv_grp_cd10";
	/**
	 * Delivery destination classification name 10 納品先分類名１０.<p>
	 *
	 */
	public static final String $dlv_grp_nm10 = "dlv_grp_nm10";
	/**
	 * Item classification 1 品目分類１.<p>
	 *
	 */
	public static final String $itm_grp_flg1 = "itm_grp_flg1";
	/**
	 * Item classification cd. 1 品目分類ＣＤ１.<p>
	 *
	 */
	public static final String $itm_grp_cd1 = "itm_grp_cd1";
	/**
	 * Item classification name 1 品目分類名１.<p>
	 *
	 */
	public static final String $itm_grp_nm1 = "itm_grp_nm1";
	/**
	 * Item classification 2 品目分類２.<p>
	 *
	 */
	public static final String $itm_grp_flg2 = "itm_grp_flg2";
	/**
	 * Item classification cd. 2 品目分類ＣＤ２.<p>
	 *
	 */
	public static final String $itm_grp_cd2 = "itm_grp_cd2";
	/**
	 * Item classification name 2 品目分類名２.<p>
	 *
	 */
	public static final String $itm_grp_nm2 = "itm_grp_nm2";
	/**
	 * Item classification 3 品目分類３.<p>
	 *
	 */
	public static final String $itm_grp_flg3 = "itm_grp_flg3";
	/**
	 * Item classification cd. 3 品目分類ＣＤ３.<p>
	 *
	 */
	public static final String $itm_grp_cd3 = "itm_grp_cd3";
	/**
	 * Item classification name 3 品目分類名３.<p>
	 *
	 */
	public static final String $itm_grp_nm3 = "itm_grp_nm3";
	/**
	 * Item classification 4 品目分類４.<p>
	 *
	 */
	public static final String $itm_grp_flg4 = "itm_grp_flg4";
	/**
	 * Item classification cd. 4 品目分類ＣＤ４.<p>
	 *
	 */
	public static final String $itm_grp_cd4 = "itm_grp_cd4";
	/**
	 * Item classification name 4 品目分類名４.<p>
	 *
	 */
	public static final String $itm_grp_nm4 = "itm_grp_nm4";
	/**
	 * Item classification 5 品目分類５.<p>
	 *
	 */
	public static final String $itm_grp_flg5 = "itm_grp_flg5";
	/**
	 * Item classification cd. 5 品目分類ＣＤ５.<p>
	 *
	 */
	public static final String $itm_grp_cd5 = "itm_grp_cd5";
	/**
	 * Item classification name 5 品目分類名５.<p>
	 *
	 */
	public static final String $itm_grp_nm5 = "itm_grp_nm5";
	/**
	 * Item classification 6 品目分類６.<p>
	 *
	 */
	public static final String $itm_grp_flg6 = "itm_grp_flg6";
	/**
	 * Item classification cd. 6 品目分類ＣＤ６.<p>
	 *
	 */
	public static final String $itm_grp_cd6 = "itm_grp_cd6";
	/**
	 * Item classification name 6 品目分類名６.<p>
	 *
	 */
	public static final String $itm_grp_nm6 = "itm_grp_nm6";
	/**
	 * Item classification 7 品目分類７.<p>
	 *
	 */
	public static final String $itm_grp_flg7 = "itm_grp_flg7";
	/**
	 * Item classification cd. 7 品目分類ＣＤ７.<p>
	 *
	 */
	public static final String $itm_grp_cd7 = "itm_grp_cd7";
	/**
	 * Item classification name 7 品目分類名７.<p>
	 *
	 */
	public static final String $itm_grp_nm7 = "itm_grp_nm7";
	/**
	 * Item classification 8 品目分類８.<p>
	 *
	 */
	public static final String $itm_grp_flg8 = "itm_grp_flg8";
	/**
	 * Item classification cd. 8 品目分類ＣＤ８.<p>
	 *
	 */
	public static final String $itm_grp_cd8 = "itm_grp_cd8";
	/**
	 * Item classification name 8 品目分類名８.<p>
	 *
	 */
	public static final String $itm_grp_nm8 = "itm_grp_nm8";
	/**
	 * Item classification 9 品目分類９.<p>
	 *
	 */
	public static final String $itm_grp_flg9 = "itm_grp_flg9";
	/**
	 * Item classification cd. 9 品目分類ＣＤ９.<p>
	 *
	 */
	public static final String $itm_grp_cd9 = "itm_grp_cd9";
	/**
	 * Item classification name 9 品目分類名９.<p>
	 *
	 */
	public static final String $itm_grp_nm9 = "itm_grp_nm9";
	/**
	 * Item classification 10 品目分類１０.<p>
	 *
	 */
	public static final String $itm_grp_flg10 = "itm_grp_flg10";
	/**
	 * Item classification cd. 10 品目分類ＣＤ１０.<p>
	 *
	 */
	public static final String $itm_grp_cd10 = "itm_grp_cd10";
	/**
	 * Item classification name 10 品目分類名１０.<p>
	 *
	 */
	public static final String $itm_grp_nm10 = "itm_grp_nm10";


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
	public static final MCMeta dlv_cd_META = createCommonMeta($dlv_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta dlv_nm_META = createCommonMeta($dlv_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta dest_cd1_META = createCommonMeta($dest_cd1, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta dest_nm1_META = createCommonMeta($dest_nm1, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta dest_cd2_META = createCommonMeta($dest_cd2, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta dest_nm2_META = createCommonMeta($dest_nm2, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta dest_cd3_META = createCommonMeta($dest_cd3, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta dest_nm3_META = createCommonMeta($dest_nm3, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta cst_cd_META = createCommonMeta($cst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta cst_nm_META = createCommonMeta($cst_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta itm_typ_META = createCommonMeta($itm_typ, mcframe.commonMA.meta.MA_META.ITM_TYP);
	public static final MCMeta itm_typ_d_cd_META = createCommonMeta($itm_typ_d_cd, mcframe.commonMA.meta.MA_META.ITM_TYP_D_CD);
	public static final MCMeta itm_typ_d_nm_META = createCommonMeta($itm_typ_d_nm, mcframe.commonMA.meta.MA_META.ITM_TYP_D_NM);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta itm_nm_META = createCommonMeta($itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta sno1_META = createCommonMeta($sno1, mcframe.commonMA.meta.MA_META.SNO1);
	public static final MCMeta sno2_META = createCommonMeta($sno2, mcframe.commonMA.meta.MA_META.SNO2);
	public static final MCMeta sno3_META = createCommonMeta($sno3, mcframe.commonMA.meta.MA_META.SNO3);
	public static final MCMeta sno4_META = createCommonMeta($sno4, mcframe.commonMA.meta.MA_META.SNO4);
	public static final MCMeta wrk_no_META = createCommonMeta($wrk_no, mcframe.commonMA.meta.MA_META.WRK_NO);
	public static final MCMeta wrk_nm_META = createCommonMeta($wrk_nm, mcframe.commonMA.meta.MA_META.WRK_NM);
	public static final MCMeta sls_usr_cd_META = createCommonMeta($sls_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta sls_usr_nm_META = createCommonMeta($sls_usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta sls_dpt_cd_META = createCommonMeta($sls_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta sls_dpt_nm_META = createCommonMeta($sls_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta wg_nm_META = createCommonMeta($wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta qtn_rmrks_META = createCommonMeta($qtn_rmrks, mcframe.commonMS.meta.MS_META.QTN_RMRKS);
	public static final MCMeta qtn_d_rmrks_META = createCommonMeta($qtn_d_rmrks, mcframe.commonMS.meta.MS_META.QTN_D_RMRKS);
	public static final MCMeta intr_rmrks_META = createCommonMeta($intr_rmrks, mcframe.commonMS.meta.MS_META.QTN_INTR_RMRKS);
	public static final MCMeta intr_d_rmrks_META = createCommonMeta($intr_d_rmrks, mcframe.commonMS.meta.MS_META.QTN_D_INTR_RMRKS);
	public static final MCMeta trd_cd_META = createCommonMeta($trd_cd, mcframe.commonMA.meta.MA_META.TRD_CD);
	public static final MCMeta trd_nm_META = createCommonMeta($trd_nm, mcframe.commonMA.meta.MA_META.TRD_NM);
	public static final MCMeta qtn_no_META = createCommonMeta($qtn_no, mcframe.commonMA.meta.MA_META.QTN_NO);
	public static final MCMeta qtn_rev_META = createCommonMeta($qtn_rev, mcframe.commonMA.meta.MA_META.SLIP_REV);
	public static final MCMeta trd_cur_cd_META = createCommonMeta($trd_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta trd_cur_nm_META = createCommonMeta($trd_cur_nm, mcframe.commonMA.meta.MA_META.CUR_NM);
	public static final MCMeta cst_qtn_rqst_no_META = createCommonMeta($cst_qtn_rqst_no, mcframe.commonMA.meta.MA_META.CST_QTN_RQST_NO);
	public static final MCMeta cst_qtn_rqst_d_no_META = createCommonMeta($cst_qtn_rqst_d_no, mcframe.commonMA.meta.MA_META.CST_QTN_RQST_D_NO);
	public static final MCMeta cst_itm_cd_META = createCommonMeta($cst_itm_cd, mcframe.commonMA.meta.MA_META.BP_ITM_CD);
	public static final MCMeta cst_itm_nm_META = createCommonMeta($cst_itm_nm, mcframe.commonMA.meta.MA_META.BP_ITM_NM);
	public static final MCMeta gd_cd_META = createCommonMeta($gd_cd, mcframe.commonMA.meta.MA_META.STK_GD_CD);
	public static final MCMeta gd_nm_META = createCommonMeta($gd_nm, mcframe.commonMA.meta.MA_META.STK_GD_NM);
	public static final MCMeta qtn_rslt_rsn_cd_META = createCommonMeta($qtn_rslt_rsn_cd, mcframe.commonMS.meta.MS_META.SLO_RSN_CD);
	public static final MCMeta qtn_rslt_rsn_nm_META = createCommonMeta($qtn_rslt_rsn_nm, mcframe.commonMS.meta.MS_META.SLO_RSN_NM);
	public static final MCMeta qtn_d_rslt_rsn_cd_META = createCommonMeta($qtn_d_rslt_rsn_cd, mcframe.commonMS.meta.MS_META.SLO_RSN_CD);
	public static final MCMeta qtn_d_rslt_rsn_nm_META = createCommonMeta($qtn_d_rslt_rsn_nm, mcframe.commonMS.meta.MS_META.SLO_RSN_NM);
	public static final MCMeta qtn_term_cd_META = createCommonMeta($qtn_term_cd, mcframe.commonMS.meta.MS_META.SLO_RSN_CD);
	public static final MCMeta qtn_term_nm_META = createCommonMeta($qtn_term_nm, mcframe.commonMS.meta.MS_META.SLO_RSN_NM);
	public static final MCMeta rcpt_usr_cd_META = createCommonMeta($rcpt_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta rcpt_usr_nm_META = createCommonMeta($rcpt_usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta qtn_sub_char1_META = createCommonMeta($qtn_sub_char1, mcframe.commonMS.meta.MS_META.QTN_SUB_CHAR1);
	public static final MCMeta qtn_sub_char2_META = createCommonMeta($qtn_sub_char2, mcframe.commonMS.meta.MS_META.QTN_SUB_CHAR2);
	public static final MCMeta qtn_sub_char3_META = createCommonMeta($qtn_sub_char3, mcframe.commonMS.meta.MS_META.QTN_SUB_CHAR3);
	public static final MCMeta qtn_d_sub_char1_META = createCommonMeta($qtn_d_sub_char1, mcframe.commonMS.meta.MS_META.QTN_D_SUB_CHAR1);
	public static final MCMeta qtn_d_sub_char2_META = createCommonMeta($qtn_d_sub_char2, mcframe.commonMS.meta.MS_META.QTN_D_SUB_CHAR2);
	public static final MCMeta qtn_d_sub_char3_META = createCommonMeta($qtn_d_sub_char3, mcframe.commonMS.meta.MS_META.QTN_D_SUB_CHAR3);
	public static final MCMeta inc_failure_flg_META = createCommonMeta($inc_failure_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta inc_can_flg_META = createCommonMeta($inc_can_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cst_grp_flg1_META = createCommonMeta($cst_grp_flg1, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cst_grp_cd1_META = createCommonMeta($cst_grp_cd1, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta cst_grp_nm1_META = createCommonMeta($cst_grp_nm1, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta cst_grp_flg2_META = createCommonMeta($cst_grp_flg2, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cst_grp_cd2_META = createCommonMeta($cst_grp_cd2, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta cst_grp_nm2_META = createCommonMeta($cst_grp_nm2, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta cst_grp_flg3_META = createCommonMeta($cst_grp_flg3, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cst_grp_cd3_META = createCommonMeta($cst_grp_cd3, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta cst_grp_nm3_META = createCommonMeta($cst_grp_nm3, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta cst_grp_flg4_META = createCommonMeta($cst_grp_flg4, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cst_grp_cd4_META = createCommonMeta($cst_grp_cd4, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta cst_grp_nm4_META = createCommonMeta($cst_grp_nm4, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta cst_grp_flg5_META = createCommonMeta($cst_grp_flg5, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cst_grp_cd5_META = createCommonMeta($cst_grp_cd5, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta cst_grp_nm5_META = createCommonMeta($cst_grp_nm5, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta cst_grp_flg6_META = createCommonMeta($cst_grp_flg6, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cst_grp_cd6_META = createCommonMeta($cst_grp_cd6, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta cst_grp_nm6_META = createCommonMeta($cst_grp_nm6, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta cst_grp_flg7_META = createCommonMeta($cst_grp_flg7, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cst_grp_cd7_META = createCommonMeta($cst_grp_cd7, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta cst_grp_nm7_META = createCommonMeta($cst_grp_nm7, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta cst_grp_flg8_META = createCommonMeta($cst_grp_flg8, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cst_grp_cd8_META = createCommonMeta($cst_grp_cd8, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta cst_grp_nm8_META = createCommonMeta($cst_grp_nm8, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta cst_grp_flg9_META = createCommonMeta($cst_grp_flg9, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cst_grp_cd9_META = createCommonMeta($cst_grp_cd9, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta cst_grp_nm9_META = createCommonMeta($cst_grp_nm9, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta cst_grp_flg10_META = createCommonMeta($cst_grp_flg10, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cst_grp_cd10_META = createCommonMeta($cst_grp_cd10, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta cst_grp_nm10_META = createCommonMeta($cst_grp_nm10, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta dlv_grp_flg1_META = createCommonMeta($dlv_grp_flg1, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dlv_grp_cd1_META = createCommonMeta($dlv_grp_cd1, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta dlv_grp_nm1_META = createCommonMeta($dlv_grp_nm1, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta dlv_grp_flg2_META = createCommonMeta($dlv_grp_flg2, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dlv_grp_cd2_META = createCommonMeta($dlv_grp_cd2, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta dlv_grp_nm2_META = createCommonMeta($dlv_grp_nm2, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta dlv_grp_flg3_META = createCommonMeta($dlv_grp_flg3, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dlv_grp_cd3_META = createCommonMeta($dlv_grp_cd3, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta dlv_grp_nm3_META = createCommonMeta($dlv_grp_nm3, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta dlv_grp_flg4_META = createCommonMeta($dlv_grp_flg4, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dlv_grp_cd4_META = createCommonMeta($dlv_grp_cd4, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta dlv_grp_nm4_META = createCommonMeta($dlv_grp_nm4, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta dlv_grp_flg5_META = createCommonMeta($dlv_grp_flg5, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dlv_grp_cd5_META = createCommonMeta($dlv_grp_cd5, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta dlv_grp_nm5_META = createCommonMeta($dlv_grp_nm5, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta dlv_grp_flg6_META = createCommonMeta($dlv_grp_flg6, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dlv_grp_cd6_META = createCommonMeta($dlv_grp_cd6, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta dlv_grp_nm6_META = createCommonMeta($dlv_grp_nm6, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta dlv_grp_flg7_META = createCommonMeta($dlv_grp_flg7, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dlv_grp_cd7_META = createCommonMeta($dlv_grp_cd7, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta dlv_grp_nm7_META = createCommonMeta($dlv_grp_nm7, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta dlv_grp_flg8_META = createCommonMeta($dlv_grp_flg8, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dlv_grp_cd8_META = createCommonMeta($dlv_grp_cd8, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta dlv_grp_nm8_META = createCommonMeta($dlv_grp_nm8, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta dlv_grp_flg9_META = createCommonMeta($dlv_grp_flg9, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dlv_grp_cd9_META = createCommonMeta($dlv_grp_cd9, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta dlv_grp_nm9_META = createCommonMeta($dlv_grp_nm9, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta dlv_grp_flg10_META = createCommonMeta($dlv_grp_flg10, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dlv_grp_cd10_META = createCommonMeta($dlv_grp_cd10, mcframe.commonMA.meta.MA_META.BP_GRP_CD);
	public static final MCMeta dlv_grp_nm10_META = createCommonMeta($dlv_grp_nm10, mcframe.commonMA.meta.MA_META.BP_GRP_NM);
	public static final MCMeta itm_grp_flg1_META = createCommonMeta($itm_grp_flg1, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_grp_cd1_META = createCommonMeta($itm_grp_cd1, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm1_META = createCommonMeta($itm_grp_nm1, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_flg2_META = createCommonMeta($itm_grp_flg2, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_grp_cd2_META = createCommonMeta($itm_grp_cd2, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm2_META = createCommonMeta($itm_grp_nm2, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_flg3_META = createCommonMeta($itm_grp_flg3, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_grp_cd3_META = createCommonMeta($itm_grp_cd3, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm3_META = createCommonMeta($itm_grp_nm3, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_flg4_META = createCommonMeta($itm_grp_flg4, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_grp_cd4_META = createCommonMeta($itm_grp_cd4, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm4_META = createCommonMeta($itm_grp_nm4, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_flg5_META = createCommonMeta($itm_grp_flg5, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_grp_cd5_META = createCommonMeta($itm_grp_cd5, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm5_META = createCommonMeta($itm_grp_nm5, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_flg6_META = createCommonMeta($itm_grp_flg6, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_grp_cd6_META = createCommonMeta($itm_grp_cd6, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm6_META = createCommonMeta($itm_grp_nm6, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_flg7_META = createCommonMeta($itm_grp_flg7, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_grp_cd7_META = createCommonMeta($itm_grp_cd7, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm7_META = createCommonMeta($itm_grp_nm7, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_flg8_META = createCommonMeta($itm_grp_flg8, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_grp_cd8_META = createCommonMeta($itm_grp_cd8, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm8_META = createCommonMeta($itm_grp_nm8, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_flg9_META = createCommonMeta($itm_grp_flg9, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_grp_cd9_META = createCommonMeta($itm_grp_cd9, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm9_META = createCommonMeta($itm_grp_nm9, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);
	public static final MCMeta itm_grp_flg10_META = createCommonMeta($itm_grp_flg10, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_grp_cd10_META = createCommonMeta($itm_grp_cd10, mcframe.commonMA.meta.MA_META.ITM_GRP_CD);
	public static final MCMeta itm_grp_nm10_META = createCommonMeta($itm_grp_nm10, mcframe.commonMA.meta.MA_META.ITM_GRP_NM);

	protected static final ConstMetaList<Srch01_CndR> constMetas = new ConstMetaList<Srch01_CndR>(
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
			dlv_cd_META,
			dlv_nm_META,
			dest_cd1_META,
			dest_nm1_META,
			dest_cd2_META,
			dest_nm2_META,
			dest_cd3_META,
			dest_nm3_META,
			cst_cd_META,
			cst_nm_META,
			itm_typ_META,
			itm_typ_d_cd_META,
			itm_typ_d_nm_META,
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			itm_nm_META,
			sno1_META,
			sno2_META,
			sno3_META,
			sno4_META,
			wrk_no_META,
			wrk_nm_META,
			sls_usr_cd_META,
			sls_usr_nm_META,
			sls_dpt_cd_META,
			sls_dpt_nm_META,
			wg_cd_META,
			wg_nm_META,
			qtn_rmrks_META,
			qtn_d_rmrks_META,
			intr_rmrks_META,
			intr_d_rmrks_META,
			trd_cd_META,
			trd_nm_META,
			qtn_no_META,
			qtn_rev_META,
			trd_cur_cd_META,
			trd_cur_nm_META,
			cst_qtn_rqst_no_META,
			cst_qtn_rqst_d_no_META,
			cst_itm_cd_META,
			cst_itm_nm_META,
			gd_cd_META,
			gd_nm_META,
			qtn_rslt_rsn_cd_META,
			qtn_rslt_rsn_nm_META,
			qtn_d_rslt_rsn_cd_META,
			qtn_d_rslt_rsn_nm_META,
			qtn_term_cd_META,
			qtn_term_nm_META,
			rcpt_usr_cd_META,
			rcpt_usr_nm_META,
			qtn_sub_char1_META,
			qtn_sub_char2_META,
			qtn_sub_char3_META,
			qtn_d_sub_char1_META,
			qtn_d_sub_char2_META,
			qtn_d_sub_char3_META,
			inc_failure_flg_META,
			inc_can_flg_META,
			cst_grp_flg1_META,
			cst_grp_cd1_META,
			cst_grp_nm1_META,
			cst_grp_flg2_META,
			cst_grp_cd2_META,
			cst_grp_nm2_META,
			cst_grp_flg3_META,
			cst_grp_cd3_META,
			cst_grp_nm3_META,
			cst_grp_flg4_META,
			cst_grp_cd4_META,
			cst_grp_nm4_META,
			cst_grp_flg5_META,
			cst_grp_cd5_META,
			cst_grp_nm5_META,
			cst_grp_flg6_META,
			cst_grp_cd6_META,
			cst_grp_nm6_META,
			cst_grp_flg7_META,
			cst_grp_cd7_META,
			cst_grp_nm7_META,
			cst_grp_flg8_META,
			cst_grp_cd8_META,
			cst_grp_nm8_META,
			cst_grp_flg9_META,
			cst_grp_cd9_META,
			cst_grp_nm9_META,
			cst_grp_flg10_META,
			cst_grp_cd10_META,
			cst_grp_nm10_META,
			dlv_grp_flg1_META,
			dlv_grp_cd1_META,
			dlv_grp_nm1_META,
			dlv_grp_flg2_META,
			dlv_grp_cd2_META,
			dlv_grp_nm2_META,
			dlv_grp_flg3_META,
			dlv_grp_cd3_META,
			dlv_grp_nm3_META,
			dlv_grp_flg4_META,
			dlv_grp_cd4_META,
			dlv_grp_nm4_META,
			dlv_grp_flg5_META,
			dlv_grp_cd5_META,
			dlv_grp_nm5_META,
			dlv_grp_flg6_META,
			dlv_grp_cd6_META,
			dlv_grp_nm6_META,
			dlv_grp_flg7_META,
			dlv_grp_cd7_META,
			dlv_grp_nm7_META,
			dlv_grp_flg8_META,
			dlv_grp_cd8_META,
			dlv_grp_nm8_META,
			dlv_grp_flg9_META,
			dlv_grp_cd9_META,
			dlv_grp_nm9_META,
			dlv_grp_flg10_META,
			dlv_grp_cd10_META,
			dlv_grp_nm10_META,
			itm_grp_flg1_META,
			itm_grp_cd1_META,
			itm_grp_nm1_META,
			itm_grp_flg2_META,
			itm_grp_cd2_META,
			itm_grp_nm2_META,
			itm_grp_flg3_META,
			itm_grp_cd3_META,
			itm_grp_nm3_META,
			itm_grp_flg4_META,
			itm_grp_cd4_META,
			itm_grp_nm4_META,
			itm_grp_flg5_META,
			itm_grp_cd5_META,
			itm_grp_nm5_META,
			itm_grp_flg6_META,
			itm_grp_cd6_META,
			itm_grp_nm6_META,
			itm_grp_flg7_META,
			itm_grp_cd7_META,
			itm_grp_nm7_META,
			itm_grp_flg8_META,
			itm_grp_cd8_META,
			itm_grp_nm8_META,
			itm_grp_flg9_META,
			itm_grp_cd9_META,
			itm_grp_nm9_META,
			itm_grp_flg10_META,
			itm_grp_cd10_META,
			itm_grp_nm10_META
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
	protected Srch01_CndR_MC_A(ConstMetaList<? extends Srch01_CndR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_CndR clone() {
		return (Srch01_CndR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_CndR createInstance() {
		return (Srch01_CndR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_CndR getValues(String... names) {
		return (Srch01_CndR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Operation type 操作種別.<p>
	 *
	 */
	public String ope() {
		return getConstString(offset + 0, $ope);
	}

	/**
	 * Operation type 操作種別.<p>
	 *
	 */
	public void ope(String value) {
		setConstString(offset + 0, $ope, value);
	}


	/**
	 * Display unit 表示単位.<p>
	 *
	 */
	public String disp() {
		return getConstString(offset + 1, $disp);
	}

	/**
	 * Display unit 表示単位.<p>
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
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public String dlv_cd() {
		return getConstString(offset + 24, $dlv_cd);
	}

	/**
	 * Delivery destination cd. 納品先ＣＤ.<p>
	 *
	 */
	public void dlv_cd(String value) {
		setConstString(offset + 24, $dlv_cd, value);
	}


	/**
	 * Delivery destination name 納品先名.<p>
	 *
	 */
	public String dlv_nm() {
		return getConstString(offset + 25, $dlv_nm);
	}

	/**
	 * Delivery destination name 納品先名.<p>
	 *
	 */
	public void dlv_nm(String value) {
		setConstString(offset + 25, $dlv_nm, value);
	}


	/**
	 * Distribution channel cd. 1 仕向先ＣＤ１.<p>
	 *
	 */
	public String dest_cd1() {
		return getConstString(offset + 26, $dest_cd1);
	}

	/**
	 * Distribution channel cd. 1 仕向先ＣＤ１.<p>
	 *
	 */
	public void dest_cd1(String value) {
		setConstString(offset + 26, $dest_cd1, value);
	}


	/**
	 * Distribution channel name 1 仕向先名１.<p>
	 *
	 */
	public String dest_nm1() {
		return getConstString(offset + 27, $dest_nm1);
	}

	/**
	 * Distribution channel name 1 仕向先名１.<p>
	 *
	 */
	public void dest_nm1(String value) {
		setConstString(offset + 27, $dest_nm1, value);
	}


	/**
	 * Distribution channel cd. 2 仕向先ＣＤ２.<p>
	 *
	 */
	public String dest_cd2() {
		return getConstString(offset + 28, $dest_cd2);
	}

	/**
	 * Distribution channel cd. 2 仕向先ＣＤ２.<p>
	 *
	 */
	public void dest_cd2(String value) {
		setConstString(offset + 28, $dest_cd2, value);
	}


	/**
	 * Distribution channel name 2 仕向先名２.<p>
	 *
	 */
	public String dest_nm2() {
		return getConstString(offset + 29, $dest_nm2);
	}

	/**
	 * Distribution channel name 2 仕向先名２.<p>
	 *
	 */
	public void dest_nm2(String value) {
		setConstString(offset + 29, $dest_nm2, value);
	}


	/**
	 * Distribution channel cd. 3 仕向先ＣＤ３.<p>
	 *
	 */
	public String dest_cd3() {
		return getConstString(offset + 30, $dest_cd3);
	}

	/**
	 * Distribution channel cd. 3 仕向先ＣＤ３.<p>
	 *
	 */
	public void dest_cd3(String value) {
		setConstString(offset + 30, $dest_cd3, value);
	}


	/**
	 * Distribution channel name 3 仕向先名３.<p>
	 *
	 */
	public String dest_nm3() {
		return getConstString(offset + 31, $dest_nm3);
	}

	/**
	 * Distribution channel name 3 仕向先名３.<p>
	 *
	 */
	public void dest_nm3(String value) {
		setConstString(offset + 31, $dest_nm3, value);
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
	 * Item type 品目区分.<p>
	 *
	 */
	public String itm_typ() {
		return getConstString(offset + 34, $itm_typ);
	}

	/**
	 * Item type 品目区分.<p>
	 *
	 */
	public void itm_typ(String value) {
		setConstString(offset + 34, $itm_typ, value);
	}


	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public String itm_typ_d_cd() {
		return getConstString(offset + 35, $itm_typ_d_cd);
	}

	/**
	 * Item type details cd. 品目区分詳細ＣＤ.<p>
	 *
	 */
	public void itm_typ_d_cd(String value) {
		setConstString(offset + 35, $itm_typ_d_cd, value);
	}


	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public String itm_typ_d_nm() {
		return getConstString(offset + 36, $itm_typ_d_nm);
	}

	/**
	 * Item type details name 品目区分詳細名.<p>
	 *
	 */
	public void itm_typ_d_nm(String value) {
		setConstString(offset + 36, $itm_typ_d_nm, value);
	}


	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 37, $itm_cd);
	}

	/**
	 * Item cd. 品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 37, $itm_cd, value);
	}


	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 38, $itm_sub1);
	}

	/**
	 * Branch No. 1 枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 38, $itm_sub1, value);
	}


	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 39, $itm_sub2);
	}

	/**
	 * Branch No. 2 枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 39, $itm_sub2, value);
	}


	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 40, $itm_sub3);
	}

	/**
	 * Branch No. 3 枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 40, $itm_sub3, value);
	}


	/**
	 * Item name 品名.<p>
	 *
	 */
	public String itm_nm() {
		return getConstString(offset + 41, $itm_nm);
	}

	/**
	 * Item name 品名.<p>
	 *
	 */
	public void itm_nm(String value) {
		setConstString(offset + 41, $itm_nm, value);
	}


	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public String sno1() {
		return getConstString(offset + 42, $sno1);
	}

	/**
	 * SEIBAN No. 1 手配ＮＯ１.<p>
	 *
	 */
	public void sno1(String value) {
		setConstString(offset + 42, $sno1, value);
	}


	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public String sno2() {
		return getConstString(offset + 43, $sno2);
	}

	/**
	 * SEIBAN No. 2 手配ＮＯ２.<p>
	 *
	 */
	public void sno2(String value) {
		setConstString(offset + 43, $sno2, value);
	}


	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public String sno3() {
		return getConstString(offset + 44, $sno3);
	}

	/**
	 * SEIBAN No. 3 手配ＮＯ３.<p>
	 *
	 */
	public void sno3(String value) {
		setConstString(offset + 44, $sno3, value);
	}


	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public String sno4() {
		return getConstString(offset + 45, $sno4);
	}

	/**
	 * SEIBAN No. 4 手配ＮＯ４.<p>
	 *
	 */
	public void sno4(String value) {
		setConstString(offset + 45, $sno4, value);
	}


	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public String wrk_no() {
		return getConstString(offset + 46, $wrk_no);
	}

	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public void wrk_no(String value) {
		setConstString(offset + 46, $wrk_no, value);
	}


	/**
	 * Sales project name 案件名.<p>
	 *
	 */
	public String wrk_nm() {
		return getConstString(offset + 47, $wrk_nm);
	}

	/**
	 * Sales project name 案件名.<p>
	 *
	 */
	public void wrk_nm(String value) {
		setConstString(offset + 47, $wrk_nm, value);
	}


	/**
	 * Sales PIC cd. 売上担当者ＣＤ.<p>
	 *
	 */
	public String sls_usr_cd() {
		return getConstString(offset + 48, $sls_usr_cd);
	}

	/**
	 * Sales PIC cd. 売上担当者ＣＤ.<p>
	 *
	 */
	public void sls_usr_cd(String value) {
		setConstString(offset + 48, $sls_usr_cd, value);
	}


	/**
	 * Sales PIC name 売上担当者名.<p>
	 *
	 */
	public String sls_usr_nm() {
		return getConstString(offset + 49, $sls_usr_nm);
	}

	/**
	 * Sales PIC name 売上担当者名.<p>
	 *
	 */
	public void sls_usr_nm(String value) {
		setConstString(offset + 49, $sls_usr_nm, value);
	}


	/**
	 * Sales dept. cd. 売上部門ＣＤ.<p>
	 *
	 */
	public String sls_dpt_cd() {
		return getConstString(offset + 50, $sls_dpt_cd);
	}

	/**
	 * Sales dept. cd. 売上部門ＣＤ.<p>
	 *
	 */
	public void sls_dpt_cd(String value) {
		setConstString(offset + 50, $sls_dpt_cd, value);
	}


	/**
	 * Sales dept. name 売上部門名.<p>
	 *
	 */
	public String sls_dpt_nm() {
		return getConstString(offset + 51, $sls_dpt_nm);
	}

	/**
	 * Sales dept. name 売上部門名.<p>
	 *
	 */
	public void sls_dpt_nm(String value) {
		setConstString(offset + 51, $sls_dpt_nm, value);
	}


	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 52, $wg_cd);
	}

	/**
	 * WG cd. ワーキンググループＣＤ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 52, $wg_cd, value);
	}


	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public String wg_nm() {
		return getConstString(offset + 53, $wg_nm);
	}

	/**
	 * WG name ワーキンググループ名.<p>
	 *
	 */
	public void wg_nm(String value) {
		setConstString(offset + 53, $wg_nm, value);
	}


	/**
	 * Quotation remarks 見積備考.<p>
	 *
	 */
	public String qtn_rmrks() {
		return getConstString(offset + 54, $qtn_rmrks);
	}

	/**
	 * Quotation remarks 見積備考.<p>
	 *
	 */
	public void qtn_rmrks(String value) {
		setConstString(offset + 54, $qtn_rmrks, value);
	}


	/**
	 * Quotation details remarks 見積明細備考.<p>
	 *
	 */
	public String qtn_d_rmrks() {
		return getConstString(offset + 55, $qtn_d_rmrks);
	}

	/**
	 * Quotation details remarks 見積明細備考.<p>
	 *
	 */
	public void qtn_d_rmrks(String value) {
		setConstString(offset + 55, $qtn_d_rmrks, value);
	}


	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public String intr_rmrks() {
		return getConstString(offset + 56, $intr_rmrks);
	}

	/**
	 * Internal remarks 内部備考.<p>
	 *
	 */
	public void intr_rmrks(String value) {
		setConstString(offset + 56, $intr_rmrks, value);
	}


	/**
	 * Internal details remarks 内部明細備考.<p>
	 *
	 */
	public String intr_d_rmrks() {
		return getConstString(offset + 57, $intr_d_rmrks);
	}

	/**
	 * Internal details remarks 内部明細備考.<p>
	 *
	 */
	public void intr_d_rmrks(String value) {
		setConstString(offset + 57, $intr_d_rmrks, value);
	}


	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public String trd_cd() {
		return getConstString(offset + 58, $trd_cd);
	}

	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public void trd_cd(String value) {
		setConstString(offset + 58, $trd_cd, value);
	}


	/**
	 * Transaction name 取引名.<p>
	 *
	 */
	public String trd_nm() {
		return getConstString(offset + 59, $trd_nm);
	}

	/**
	 * Transaction name 取引名.<p>
	 *
	 */
	public void trd_nm(String value) {
		setConstString(offset + 59, $trd_nm, value);
	}


	/**
	 * Quotation No. 見積ＮＯ.<p>
	 *
	 */
	public String qtn_no() {
		return getConstString(offset + 60, $qtn_no);
	}

	/**
	 * Quotation No. 見積ＮＯ.<p>
	 *
	 */
	public void qtn_no(String value) {
		setConstString(offset + 60, $qtn_no, value);
	}


	/**
	 * Quotation rev. number 見積改訂番号.<p>
	 *
	 */
	public MCNumber qtn_rev() {
		return getConstNumber(offset + 61, $qtn_rev);
	}

	/**
	 * Quotation rev. number 見積改訂番号.<p>
	 *
	 */
	public void qtn_rev(MCNumber value) {
		setConstNumber(offset + 61, $qtn_rev, value);
	}

	/**
	 * Quotation rev. number 見積改訂番号.<p>
	 *
	 */
	public void qtn_rev(int value) {
		setConstNumber(offset + 61, $qtn_rev, value);
	}

	/**
	 * Quotation rev. number 見積改訂番号.<p>
	 *
	 */
	public void qtn_rev(long value) {
		setConstNumber(offset + 61, $qtn_rev, value);
	}

	/**
	 * Quotation rev. number 見積改訂番号.<p>
	 *
	 */
	public void qtn_rev(float value) {
		setConstNumber(offset + 61, $qtn_rev, value);
	}

	/**
	 * Quotation rev. number 見積改訂番号.<p>
	 *
	 */
	public void qtn_rev(double value) {
		setConstNumber(offset + 61, $qtn_rev, value);
	}


	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public String trd_cur_cd() {
		return getConstString(offset + 62, $trd_cur_cd);
	}

	/**
	 * Currency cd. 通貨ＣＤ.<p>
	 *
	 */
	public void trd_cur_cd(String value) {
		setConstString(offset + 62, $trd_cur_cd, value);
	}


	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public String trd_cur_nm() {
		return getConstString(offset + 63, $trd_cur_nm);
	}

	/**
	 * Currency name 通貨名.<p>
	 *
	 */
	public void trd_cur_nm(String value) {
		setConstString(offset + 63, $trd_cur_nm, value);
	}


	/**
	 * Customer quotation request No. 得意先見積依頼ＮＯ.<p>
	 *
	 */
	public String cst_qtn_rqst_no() {
		return getConstString(offset + 64, $cst_qtn_rqst_no);
	}

	/**
	 * Customer quotation request No. 得意先見積依頼ＮＯ.<p>
	 *
	 */
	public void cst_qtn_rqst_no(String value) {
		setConstString(offset + 64, $cst_qtn_rqst_no, value);
	}


	/**
	 * Customer quotation request details No. 得意先見積依頼明細ＮＯ.<p>
	 *
	 */
	public String cst_qtn_rqst_d_no() {
		return getConstString(offset + 65, $cst_qtn_rqst_d_no);
	}

	/**
	 * Customer quotation request details No. 得意先見積依頼明細ＮＯ.<p>
	 *
	 */
	public void cst_qtn_rqst_d_no(String value) {
		setConstString(offset + 65, $cst_qtn_rqst_d_no, value);
	}


	/**
	 * Customer item cd. 得意先品目ＣＤ.<p>
	 *
	 */
	public String cst_itm_cd() {
		return getConstString(offset + 66, $cst_itm_cd);
	}

	/**
	 * Customer item cd. 得意先品目ＣＤ.<p>
	 *
	 */
	public void cst_itm_cd(String value) {
		setConstString(offset + 66, $cst_itm_cd, value);
	}


	/**
	 * Customer item name 得意先品名.<p>
	 *
	 */
	public String cst_itm_nm() {
		return getConstString(offset + 67, $cst_itm_nm);
	}

	/**
	 * Customer item name 得意先品名.<p>
	 *
	 */
	public void cst_itm_nm(String value) {
		setConstString(offset + 67, $cst_itm_nm, value);
	}


	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public String gd_cd() {
		return getConstString(offset + 68, $gd_cd);
	}

	/**
	 * Grading cd. 格付ＣＤ.<p>
	 *
	 */
	public void gd_cd(String value) {
		setConstString(offset + 68, $gd_cd, value);
	}


	/**
	 * Grading name 格付名.<p>
	 *
	 */
	public String gd_nm() {
		return getConstString(offset + 69, $gd_nm);
	}

	/**
	 * Grading name 格付名.<p>
	 *
	 */
	public void gd_nm(String value) {
		setConstString(offset + 69, $gd_nm, value);
	}


	/**
	 * Quotation result reason cd. 見積結果理由ＣＤ.<p>
	 *
	 */
	public String qtn_rslt_rsn_cd() {
		return getConstString(offset + 70, $qtn_rslt_rsn_cd);
	}

	/**
	 * Quotation result reason cd. 見積結果理由ＣＤ.<p>
	 *
	 */
	public void qtn_rslt_rsn_cd(String value) {
		setConstString(offset + 70, $qtn_rslt_rsn_cd, value);
	}


	/**
	 * Quotation result reason name 見積結果理由名.<p>
	 *
	 */
	public String qtn_rslt_rsn_nm() {
		return getConstString(offset + 71, $qtn_rslt_rsn_nm);
	}

	/**
	 * Quotation result reason name 見積結果理由名.<p>
	 *
	 */
	public void qtn_rslt_rsn_nm(String value) {
		setConstString(offset + 71, $qtn_rslt_rsn_nm, value);
	}


	/**
	 * Quotation details result reason cd. 見積明細結果理由ＣＤ.<p>
	 *
	 */
	public String qtn_d_rslt_rsn_cd() {
		return getConstString(offset + 72, $qtn_d_rslt_rsn_cd);
	}

	/**
	 * Quotation details result reason cd. 見積明細結果理由ＣＤ.<p>
	 *
	 */
	public void qtn_d_rslt_rsn_cd(String value) {
		setConstString(offset + 72, $qtn_d_rslt_rsn_cd, value);
	}


	/**
	 * Quotation details result reason name 見積明細結果理由名.<p>
	 *
	 */
	public String qtn_d_rslt_rsn_nm() {
		return getConstString(offset + 73, $qtn_d_rslt_rsn_nm);
	}

	/**
	 * Quotation details result reason name 見積明細結果理由名.<p>
	 *
	 */
	public void qtn_d_rslt_rsn_nm(String value) {
		setConstString(offset + 73, $qtn_d_rslt_rsn_nm, value);
	}


	/**
	 * Quotation terms cd. 見積条件ＣＤ.<p>
	 *
	 */
	public String qtn_term_cd() {
		return getConstString(offset + 74, $qtn_term_cd);
	}

	/**
	 * Quotation terms cd. 見積条件ＣＤ.<p>
	 *
	 */
	public void qtn_term_cd(String value) {
		setConstString(offset + 74, $qtn_term_cd, value);
	}


	/**
	 * Quotation terms name 見積条件名.<p>
	 *
	 */
	public String qtn_term_nm() {
		return getConstString(offset + 75, $qtn_term_nm);
	}

	/**
	 * Quotation terms name 見積条件名.<p>
	 *
	 */
	public void qtn_term_nm(String value) {
		setConstString(offset + 75, $qtn_term_nm, value);
	}


	/**
	 * Receiving PIC cd. 受付担当者ＣＤ.<p>
	 *
	 */
	public String rcpt_usr_cd() {
		return getConstString(offset + 76, $rcpt_usr_cd);
	}

	/**
	 * Receiving PIC cd. 受付担当者ＣＤ.<p>
	 *
	 */
	public void rcpt_usr_cd(String value) {
		setConstString(offset + 76, $rcpt_usr_cd, value);
	}


	/**
	 * Receiving PIC name 受付担当者名.<p>
	 *
	 */
	public String rcpt_usr_nm() {
		return getConstString(offset + 77, $rcpt_usr_nm);
	}

	/**
	 * Receiving PIC name 受付担当者名.<p>
	 *
	 */
	public void rcpt_usr_nm(String value) {
		setConstString(offset + 77, $rcpt_usr_nm, value);
	}


	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String qtn_sub_char1() {
		return getConstString(offset + 78, $qtn_sub_char1);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void qtn_sub_char1(String value) {
		setConstString(offset + 78, $qtn_sub_char1, value);
	}


	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String qtn_sub_char2() {
		return getConstString(offset + 79, $qtn_sub_char2);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void qtn_sub_char2(String value) {
		setConstString(offset + 79, $qtn_sub_char2, value);
	}


	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String qtn_sub_char3() {
		return getConstString(offset + 80, $qtn_sub_char3);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void qtn_sub_char3(String value) {
		setConstString(offset + 80, $qtn_sub_char3, value);
	}


	/**
	 * Details spare 1 明細予備１.<p>
	 *
	 */
	public String qtn_d_sub_char1() {
		return getConstString(offset + 81, $qtn_d_sub_char1);
	}

	/**
	 * Details spare 1 明細予備１.<p>
	 *
	 */
	public void qtn_d_sub_char1(String value) {
		setConstString(offset + 81, $qtn_d_sub_char1, value);
	}


	/**
	 * Details spare 2 明細予備２.<p>
	 *
	 */
	public String qtn_d_sub_char2() {
		return getConstString(offset + 82, $qtn_d_sub_char2);
	}

	/**
	 * Details spare 2 明細予備２.<p>
	 *
	 */
	public void qtn_d_sub_char2(String value) {
		setConstString(offset + 82, $qtn_d_sub_char2, value);
	}


	/**
	 * Details spare 3 明細予備３.<p>
	 *
	 */
	public String qtn_d_sub_char3() {
		return getConstString(offset + 83, $qtn_d_sub_char3);
	}

	/**
	 * Details spare 3 明細予備３.<p>
	 *
	 */
	public void qtn_d_sub_char3(String value) {
		setConstString(offset + 83, $qtn_d_sub_char3, value);
	}


	/**
	 * Including failed order 失注含む.<p>
	 *
	 */
	public boolean inc_failure_flg() {
		return getConstBoolean(offset + 84, $inc_failure_flg);
	}

	/**
	 * Including failed order 失注含む.<p>
	 *
	 */
	public void inc_failure_flg(boolean value) {
		setConstBoolean(offset + 84, $inc_failure_flg, value);
	}


	/**
	 * Include cancel 取消含む.<p>
	 *
	 */
	public boolean inc_can_flg() {
		return getConstBoolean(offset + 85, $inc_can_flg);
	}

	/**
	 * Include cancel 取消含む.<p>
	 *
	 */
	public void inc_can_flg(boolean value) {
		setConstBoolean(offset + 85, $inc_can_flg, value);
	}


	/**
	 * Customer classification 1 得意先分類１.<p>
	 *
	 */
	public boolean cst_grp_flg1() {
		return getConstBoolean(offset + 86, $cst_grp_flg1);
	}

	/**
	 * Customer classification 1 得意先分類１.<p>
	 *
	 */
	public void cst_grp_flg1(boolean value) {
		setConstBoolean(offset + 86, $cst_grp_flg1, value);
	}


	/**
	 * Customer classification cd. 1 得意先分類ＣＤ１.<p>
	 *
	 */
	public String cst_grp_cd1() {
		return getConstString(offset + 87, $cst_grp_cd1);
	}

	/**
	 * Customer classification cd. 1 得意先分類ＣＤ１.<p>
	 *
	 */
	public void cst_grp_cd1(String value) {
		setConstString(offset + 87, $cst_grp_cd1, value);
	}


	/**
	 * Customer classification name 1 得意先分類名１.<p>
	 *
	 */
	public String cst_grp_nm1() {
		return getConstString(offset + 88, $cst_grp_nm1);
	}

	/**
	 * Customer classification name 1 得意先分類名１.<p>
	 *
	 */
	public void cst_grp_nm1(String value) {
		setConstString(offset + 88, $cst_grp_nm1, value);
	}


	/**
	 * Customer classification 2 得意先分類２.<p>
	 *
	 */
	public boolean cst_grp_flg2() {
		return getConstBoolean(offset + 89, $cst_grp_flg2);
	}

	/**
	 * Customer classification 2 得意先分類２.<p>
	 *
	 */
	public void cst_grp_flg2(boolean value) {
		setConstBoolean(offset + 89, $cst_grp_flg2, value);
	}


	/**
	 * Customer classification cd. 2 得意先分類ＣＤ２.<p>
	 *
	 */
	public String cst_grp_cd2() {
		return getConstString(offset + 90, $cst_grp_cd2);
	}

	/**
	 * Customer classification cd. 2 得意先分類ＣＤ２.<p>
	 *
	 */
	public void cst_grp_cd2(String value) {
		setConstString(offset + 90, $cst_grp_cd2, value);
	}


	/**
	 * Customer classification name 2 得意先分類名２.<p>
	 *
	 */
	public String cst_grp_nm2() {
		return getConstString(offset + 91, $cst_grp_nm2);
	}

	/**
	 * Customer classification name 2 得意先分類名２.<p>
	 *
	 */
	public void cst_grp_nm2(String value) {
		setConstString(offset + 91, $cst_grp_nm2, value);
	}


	/**
	 * Customer classification 3 得意先分類３.<p>
	 *
	 */
	public boolean cst_grp_flg3() {
		return getConstBoolean(offset + 92, $cst_grp_flg3);
	}

	/**
	 * Customer classification 3 得意先分類３.<p>
	 *
	 */
	public void cst_grp_flg3(boolean value) {
		setConstBoolean(offset + 92, $cst_grp_flg3, value);
	}


	/**
	 * Customer classification cd. 3 得意先分類ＣＤ３.<p>
	 *
	 */
	public String cst_grp_cd3() {
		return getConstString(offset + 93, $cst_grp_cd3);
	}

	/**
	 * Customer classification cd. 3 得意先分類ＣＤ３.<p>
	 *
	 */
	public void cst_grp_cd3(String value) {
		setConstString(offset + 93, $cst_grp_cd3, value);
	}


	/**
	 * Customer classification name 3 得意先分類名３.<p>
	 *
	 */
	public String cst_grp_nm3() {
		return getConstString(offset + 94, $cst_grp_nm3);
	}

	/**
	 * Customer classification name 3 得意先分類名３.<p>
	 *
	 */
	public void cst_grp_nm3(String value) {
		setConstString(offset + 94, $cst_grp_nm3, value);
	}


	/**
	 * Customer classification 4 得意先分類４.<p>
	 *
	 */
	public boolean cst_grp_flg4() {
		return getConstBoolean(offset + 95, $cst_grp_flg4);
	}

	/**
	 * Customer classification 4 得意先分類４.<p>
	 *
	 */
	public void cst_grp_flg4(boolean value) {
		setConstBoolean(offset + 95, $cst_grp_flg4, value);
	}


	/**
	 * Customer classification cd. 4 得意先分類ＣＤ４.<p>
	 *
	 */
	public String cst_grp_cd4() {
		return getConstString(offset + 96, $cst_grp_cd4);
	}

	/**
	 * Customer classification cd. 4 得意先分類ＣＤ４.<p>
	 *
	 */
	public void cst_grp_cd4(String value) {
		setConstString(offset + 96, $cst_grp_cd4, value);
	}


	/**
	 * Customer classification name 4 得意先分類名４.<p>
	 *
	 */
	public String cst_grp_nm4() {
		return getConstString(offset + 97, $cst_grp_nm4);
	}

	/**
	 * Customer classification name 4 得意先分類名４.<p>
	 *
	 */
	public void cst_grp_nm4(String value) {
		setConstString(offset + 97, $cst_grp_nm4, value);
	}


	/**
	 * Customer classification 5 得意先分類５.<p>
	 *
	 */
	public boolean cst_grp_flg5() {
		return getConstBoolean(offset + 98, $cst_grp_flg5);
	}

	/**
	 * Customer classification 5 得意先分類５.<p>
	 *
	 */
	public void cst_grp_flg5(boolean value) {
		setConstBoolean(offset + 98, $cst_grp_flg5, value);
	}


	/**
	 * Customer classification cd. 5 得意先分類ＣＤ５.<p>
	 *
	 */
	public String cst_grp_cd5() {
		return getConstString(offset + 99, $cst_grp_cd5);
	}

	/**
	 * Customer classification cd. 5 得意先分類ＣＤ５.<p>
	 *
	 */
	public void cst_grp_cd5(String value) {
		setConstString(offset + 99, $cst_grp_cd5, value);
	}


	/**
	 * Customer classification name 5 得意先分類名５.<p>
	 *
	 */
	public String cst_grp_nm5() {
		return getConstString(offset + 100, $cst_grp_nm5);
	}

	/**
	 * Customer classification name 5 得意先分類名５.<p>
	 *
	 */
	public void cst_grp_nm5(String value) {
		setConstString(offset + 100, $cst_grp_nm5, value);
	}


	/**
	 * Customer classification 6 得意先分類６.<p>
	 *
	 */
	public boolean cst_grp_flg6() {
		return getConstBoolean(offset + 101, $cst_grp_flg6);
	}

	/**
	 * Customer classification 6 得意先分類６.<p>
	 *
	 */
	public void cst_grp_flg6(boolean value) {
		setConstBoolean(offset + 101, $cst_grp_flg6, value);
	}


	/**
	 * Customer classification cd. 6 得意先分類ＣＤ６.<p>
	 *
	 */
	public String cst_grp_cd6() {
		return getConstString(offset + 102, $cst_grp_cd6);
	}

	/**
	 * Customer classification cd. 6 得意先分類ＣＤ６.<p>
	 *
	 */
	public void cst_grp_cd6(String value) {
		setConstString(offset + 102, $cst_grp_cd6, value);
	}


	/**
	 * Customer classification name 6 得意先分類名６.<p>
	 *
	 */
	public String cst_grp_nm6() {
		return getConstString(offset + 103, $cst_grp_nm6);
	}

	/**
	 * Customer classification name 6 得意先分類名６.<p>
	 *
	 */
	public void cst_grp_nm6(String value) {
		setConstString(offset + 103, $cst_grp_nm6, value);
	}


	/**
	 * Customer classification 7 得意先分類７.<p>
	 *
	 */
	public boolean cst_grp_flg7() {
		return getConstBoolean(offset + 104, $cst_grp_flg7);
	}

	/**
	 * Customer classification 7 得意先分類７.<p>
	 *
	 */
	public void cst_grp_flg7(boolean value) {
		setConstBoolean(offset + 104, $cst_grp_flg7, value);
	}


	/**
	 * Customer classification cd. 7 得意先分類ＣＤ７.<p>
	 *
	 */
	public String cst_grp_cd7() {
		return getConstString(offset + 105, $cst_grp_cd7);
	}

	/**
	 * Customer classification cd. 7 得意先分類ＣＤ７.<p>
	 *
	 */
	public void cst_grp_cd7(String value) {
		setConstString(offset + 105, $cst_grp_cd7, value);
	}


	/**
	 * Customer classification name 7 得意先分類名７.<p>
	 *
	 */
	public String cst_grp_nm7() {
		return getConstString(offset + 106, $cst_grp_nm7);
	}

	/**
	 * Customer classification name 7 得意先分類名７.<p>
	 *
	 */
	public void cst_grp_nm7(String value) {
		setConstString(offset + 106, $cst_grp_nm7, value);
	}


	/**
	 * Customer classification 8 得意先分類８.<p>
	 *
	 */
	public boolean cst_grp_flg8() {
		return getConstBoolean(offset + 107, $cst_grp_flg8);
	}

	/**
	 * Customer classification 8 得意先分類８.<p>
	 *
	 */
	public void cst_grp_flg8(boolean value) {
		setConstBoolean(offset + 107, $cst_grp_flg8, value);
	}


	/**
	 * Customer classification cd. 8 得意先分類ＣＤ８.<p>
	 *
	 */
	public String cst_grp_cd8() {
		return getConstString(offset + 108, $cst_grp_cd8);
	}

	/**
	 * Customer classification cd. 8 得意先分類ＣＤ８.<p>
	 *
	 */
	public void cst_grp_cd8(String value) {
		setConstString(offset + 108, $cst_grp_cd8, value);
	}


	/**
	 * Customer classification name 8 得意先分類名８.<p>
	 *
	 */
	public String cst_grp_nm8() {
		return getConstString(offset + 109, $cst_grp_nm8);
	}

	/**
	 * Customer classification name 8 得意先分類名８.<p>
	 *
	 */
	public void cst_grp_nm8(String value) {
		setConstString(offset + 109, $cst_grp_nm8, value);
	}


	/**
	 * Customer classification 9 得意先分類９.<p>
	 *
	 */
	public boolean cst_grp_flg9() {
		return getConstBoolean(offset + 110, $cst_grp_flg9);
	}

	/**
	 * Customer classification 9 得意先分類９.<p>
	 *
	 */
	public void cst_grp_flg9(boolean value) {
		setConstBoolean(offset + 110, $cst_grp_flg9, value);
	}


	/**
	 * Customer classification cd. 9 得意先分類ＣＤ９.<p>
	 *
	 */
	public String cst_grp_cd9() {
		return getConstString(offset + 111, $cst_grp_cd9);
	}

	/**
	 * Customer classification cd. 9 得意先分類ＣＤ９.<p>
	 *
	 */
	public void cst_grp_cd9(String value) {
		setConstString(offset + 111, $cst_grp_cd9, value);
	}


	/**
	 * Customer classification name 9 得意先分類名９.<p>
	 *
	 */
	public String cst_grp_nm9() {
		return getConstString(offset + 112, $cst_grp_nm9);
	}

	/**
	 * Customer classification name 9 得意先分類名９.<p>
	 *
	 */
	public void cst_grp_nm9(String value) {
		setConstString(offset + 112, $cst_grp_nm9, value);
	}


	/**
	 * Customer classification 10 得意先分類１０.<p>
	 *
	 */
	public boolean cst_grp_flg10() {
		return getConstBoolean(offset + 113, $cst_grp_flg10);
	}

	/**
	 * Customer classification 10 得意先分類１０.<p>
	 *
	 */
	public void cst_grp_flg10(boolean value) {
		setConstBoolean(offset + 113, $cst_grp_flg10, value);
	}


	/**
	 * Customer classification cd. 10 得意先分類ＣＤ１０.<p>
	 *
	 */
	public String cst_grp_cd10() {
		return getConstString(offset + 114, $cst_grp_cd10);
	}

	/**
	 * Customer classification cd. 10 得意先分類ＣＤ１０.<p>
	 *
	 */
	public void cst_grp_cd10(String value) {
		setConstString(offset + 114, $cst_grp_cd10, value);
	}


	/**
	 * Customer classification name 10 得意先分類名１０.<p>
	 *
	 */
	public String cst_grp_nm10() {
		return getConstString(offset + 115, $cst_grp_nm10);
	}

	/**
	 * Customer classification name 10 得意先分類名１０.<p>
	 *
	 */
	public void cst_grp_nm10(String value) {
		setConstString(offset + 115, $cst_grp_nm10, value);
	}


	/**
	 * Delivery destination classification 1 納品先分類１.<p>
	 *
	 */
	public boolean dlv_grp_flg1() {
		return getConstBoolean(offset + 116, $dlv_grp_flg1);
	}

	/**
	 * Delivery destination classification 1 納品先分類１.<p>
	 *
	 */
	public void dlv_grp_flg1(boolean value) {
		setConstBoolean(offset + 116, $dlv_grp_flg1, value);
	}


	/**
	 * Delivery destination classification cd. 1 納品先分類ＣＤ１.<p>
	 *
	 */
	public String dlv_grp_cd1() {
		return getConstString(offset + 117, $dlv_grp_cd1);
	}

	/**
	 * Delivery destination classification cd. 1 納品先分類ＣＤ１.<p>
	 *
	 */
	public void dlv_grp_cd1(String value) {
		setConstString(offset + 117, $dlv_grp_cd1, value);
	}


	/**
	 * Delivery destination classification name 1 納品先分類名１.<p>
	 *
	 */
	public String dlv_grp_nm1() {
		return getConstString(offset + 118, $dlv_grp_nm1);
	}

	/**
	 * Delivery destination classification name 1 納品先分類名１.<p>
	 *
	 */
	public void dlv_grp_nm1(String value) {
		setConstString(offset + 118, $dlv_grp_nm1, value);
	}


	/**
	 * Delivery destination classification 2 納品先分類２.<p>
	 *
	 */
	public boolean dlv_grp_flg2() {
		return getConstBoolean(offset + 119, $dlv_grp_flg2);
	}

	/**
	 * Delivery destination classification 2 納品先分類２.<p>
	 *
	 */
	public void dlv_grp_flg2(boolean value) {
		setConstBoolean(offset + 119, $dlv_grp_flg2, value);
	}


	/**
	 * Delivery destination classification cd. 2 納品先分類ＣＤ２.<p>
	 *
	 */
	public String dlv_grp_cd2() {
		return getConstString(offset + 120, $dlv_grp_cd2);
	}

	/**
	 * Delivery destination classification cd. 2 納品先分類ＣＤ２.<p>
	 *
	 */
	public void dlv_grp_cd2(String value) {
		setConstString(offset + 120, $dlv_grp_cd2, value);
	}


	/**
	 * Delivery destination classification name 2 納品先分類名２.<p>
	 *
	 */
	public String dlv_grp_nm2() {
		return getConstString(offset + 121, $dlv_grp_nm2);
	}

	/**
	 * Delivery destination classification name 2 納品先分類名２.<p>
	 *
	 */
	public void dlv_grp_nm2(String value) {
		setConstString(offset + 121, $dlv_grp_nm2, value);
	}


	/**
	 * Delivery destination classification 3 納品先分類３.<p>
	 *
	 */
	public boolean dlv_grp_flg3() {
		return getConstBoolean(offset + 122, $dlv_grp_flg3);
	}

	/**
	 * Delivery destination classification 3 納品先分類３.<p>
	 *
	 */
	public void dlv_grp_flg3(boolean value) {
		setConstBoolean(offset + 122, $dlv_grp_flg3, value);
	}


	/**
	 * Delivery destination classification cd. 3 納品先分類ＣＤ３.<p>
	 *
	 */
	public String dlv_grp_cd3() {
		return getConstString(offset + 123, $dlv_grp_cd3);
	}

	/**
	 * Delivery destination classification cd. 3 納品先分類ＣＤ３.<p>
	 *
	 */
	public void dlv_grp_cd3(String value) {
		setConstString(offset + 123, $dlv_grp_cd3, value);
	}


	/**
	 * Delivery destination classification name 3 納品先分類名３.<p>
	 *
	 */
	public String dlv_grp_nm3() {
		return getConstString(offset + 124, $dlv_grp_nm3);
	}

	/**
	 * Delivery destination classification name 3 納品先分類名３.<p>
	 *
	 */
	public void dlv_grp_nm3(String value) {
		setConstString(offset + 124, $dlv_grp_nm3, value);
	}


	/**
	 * Delivery destination classification 4 納品先分類４.<p>
	 *
	 */
	public boolean dlv_grp_flg4() {
		return getConstBoolean(offset + 125, $dlv_grp_flg4);
	}

	/**
	 * Delivery destination classification 4 納品先分類４.<p>
	 *
	 */
	public void dlv_grp_flg4(boolean value) {
		setConstBoolean(offset + 125, $dlv_grp_flg4, value);
	}


	/**
	 * Delivery destination classification cd. 4 納品先分類ＣＤ４.<p>
	 *
	 */
	public String dlv_grp_cd4() {
		return getConstString(offset + 126, $dlv_grp_cd4);
	}

	/**
	 * Delivery destination classification cd. 4 納品先分類ＣＤ４.<p>
	 *
	 */
	public void dlv_grp_cd4(String value) {
		setConstString(offset + 126, $dlv_grp_cd4, value);
	}


	/**
	 * Delivery destination classification name 4 納品先分類名４.<p>
	 *
	 */
	public String dlv_grp_nm4() {
		return getConstString(offset + 127, $dlv_grp_nm4);
	}

	/**
	 * Delivery destination classification name 4 納品先分類名４.<p>
	 *
	 */
	public void dlv_grp_nm4(String value) {
		setConstString(offset + 127, $dlv_grp_nm4, value);
	}


	/**
	 * Delivery destination classification 5 納品先分類５.<p>
	 *
	 */
	public boolean dlv_grp_flg5() {
		return getConstBoolean(offset + 128, $dlv_grp_flg5);
	}

	/**
	 * Delivery destination classification 5 納品先分類５.<p>
	 *
	 */
	public void dlv_grp_flg5(boolean value) {
		setConstBoolean(offset + 128, $dlv_grp_flg5, value);
	}


	/**
	 * Delivery destination classification cd. 5 納品先分類ＣＤ５.<p>
	 *
	 */
	public String dlv_grp_cd5() {
		return getConstString(offset + 129, $dlv_grp_cd5);
	}

	/**
	 * Delivery destination classification cd. 5 納品先分類ＣＤ５.<p>
	 *
	 */
	public void dlv_grp_cd5(String value) {
		setConstString(offset + 129, $dlv_grp_cd5, value);
	}


	/**
	 * Delivery destination classification name 5 納品先分類名５.<p>
	 *
	 */
	public String dlv_grp_nm5() {
		return getConstString(offset + 130, $dlv_grp_nm5);
	}

	/**
	 * Delivery destination classification name 5 納品先分類名５.<p>
	 *
	 */
	public void dlv_grp_nm5(String value) {
		setConstString(offset + 130, $dlv_grp_nm5, value);
	}


	/**
	 * Delivery destination classification 6 納品先分類６.<p>
	 *
	 */
	public boolean dlv_grp_flg6() {
		return getConstBoolean(offset + 131, $dlv_grp_flg6);
	}

	/**
	 * Delivery destination classification 6 納品先分類６.<p>
	 *
	 */
	public void dlv_grp_flg6(boolean value) {
		setConstBoolean(offset + 131, $dlv_grp_flg6, value);
	}


	/**
	 * Delivery destination classification cd. 6 納品先分類ＣＤ６.<p>
	 *
	 */
	public String dlv_grp_cd6() {
		return getConstString(offset + 132, $dlv_grp_cd6);
	}

	/**
	 * Delivery destination classification cd. 6 納品先分類ＣＤ６.<p>
	 *
	 */
	public void dlv_grp_cd6(String value) {
		setConstString(offset + 132, $dlv_grp_cd6, value);
	}


	/**
	 * Delivery destination classification name 6 納品先分類名６.<p>
	 *
	 */
	public String dlv_grp_nm6() {
		return getConstString(offset + 133, $dlv_grp_nm6);
	}

	/**
	 * Delivery destination classification name 6 納品先分類名６.<p>
	 *
	 */
	public void dlv_grp_nm6(String value) {
		setConstString(offset + 133, $dlv_grp_nm6, value);
	}


	/**
	 * Delivery destination classification 7 納品先分類７.<p>
	 *
	 */
	public boolean dlv_grp_flg7() {
		return getConstBoolean(offset + 134, $dlv_grp_flg7);
	}

	/**
	 * Delivery destination classification 7 納品先分類７.<p>
	 *
	 */
	public void dlv_grp_flg7(boolean value) {
		setConstBoolean(offset + 134, $dlv_grp_flg7, value);
	}


	/**
	 * Delivery destination classification cd. 7 納品先分類ＣＤ７.<p>
	 *
	 */
	public String dlv_grp_cd7() {
		return getConstString(offset + 135, $dlv_grp_cd7);
	}

	/**
	 * Delivery destination classification cd. 7 納品先分類ＣＤ７.<p>
	 *
	 */
	public void dlv_grp_cd7(String value) {
		setConstString(offset + 135, $dlv_grp_cd7, value);
	}


	/**
	 * Delivery destination classification name 7 納品先分類名７.<p>
	 *
	 */
	public String dlv_grp_nm7() {
		return getConstString(offset + 136, $dlv_grp_nm7);
	}

	/**
	 * Delivery destination classification name 7 納品先分類名７.<p>
	 *
	 */
	public void dlv_grp_nm7(String value) {
		setConstString(offset + 136, $dlv_grp_nm7, value);
	}


	/**
	 * Delivery destination classification 8 納品先分類８.<p>
	 *
	 */
	public boolean dlv_grp_flg8() {
		return getConstBoolean(offset + 137, $dlv_grp_flg8);
	}

	/**
	 * Delivery destination classification 8 納品先分類８.<p>
	 *
	 */
	public void dlv_grp_flg8(boolean value) {
		setConstBoolean(offset + 137, $dlv_grp_flg8, value);
	}


	/**
	 * Delivery destination classification cd. 8 納品先分類ＣＤ８.<p>
	 *
	 */
	public String dlv_grp_cd8() {
		return getConstString(offset + 138, $dlv_grp_cd8);
	}

	/**
	 * Delivery destination classification cd. 8 納品先分類ＣＤ８.<p>
	 *
	 */
	public void dlv_grp_cd8(String value) {
		setConstString(offset + 138, $dlv_grp_cd8, value);
	}


	/**
	 * Delivery destination classification name 8 納品先分類名８.<p>
	 *
	 */
	public String dlv_grp_nm8() {
		return getConstString(offset + 139, $dlv_grp_nm8);
	}

	/**
	 * Delivery destination classification name 8 納品先分類名８.<p>
	 *
	 */
	public void dlv_grp_nm8(String value) {
		setConstString(offset + 139, $dlv_grp_nm8, value);
	}


	/**
	 * Delivery destination classification 9 納品先分類９.<p>
	 *
	 */
	public boolean dlv_grp_flg9() {
		return getConstBoolean(offset + 140, $dlv_grp_flg9);
	}

	/**
	 * Delivery destination classification 9 納品先分類９.<p>
	 *
	 */
	public void dlv_grp_flg9(boolean value) {
		setConstBoolean(offset + 140, $dlv_grp_flg9, value);
	}


	/**
	 * Delivery destination classification cd. 9 納品先分類ＣＤ９.<p>
	 *
	 */
	public String dlv_grp_cd9() {
		return getConstString(offset + 141, $dlv_grp_cd9);
	}

	/**
	 * Delivery destination classification cd. 9 納品先分類ＣＤ９.<p>
	 *
	 */
	public void dlv_grp_cd9(String value) {
		setConstString(offset + 141, $dlv_grp_cd9, value);
	}


	/**
	 * Delivery destination classification name 9 納品先分類名９.<p>
	 *
	 */
	public String dlv_grp_nm9() {
		return getConstString(offset + 142, $dlv_grp_nm9);
	}

	/**
	 * Delivery destination classification name 9 納品先分類名９.<p>
	 *
	 */
	public void dlv_grp_nm9(String value) {
		setConstString(offset + 142, $dlv_grp_nm9, value);
	}


	/**
	 * Delivery destination classification 10 納品先分類１０.<p>
	 *
	 */
	public boolean dlv_grp_flg10() {
		return getConstBoolean(offset + 143, $dlv_grp_flg10);
	}

	/**
	 * Delivery destination classification 10 納品先分類１０.<p>
	 *
	 */
	public void dlv_grp_flg10(boolean value) {
		setConstBoolean(offset + 143, $dlv_grp_flg10, value);
	}


	/**
	 * Delivery destination classification cd. 10 納品先分類ＣＤ１０.<p>
	 *
	 */
	public String dlv_grp_cd10() {
		return getConstString(offset + 144, $dlv_grp_cd10);
	}

	/**
	 * Delivery destination classification cd. 10 納品先分類ＣＤ１０.<p>
	 *
	 */
	public void dlv_grp_cd10(String value) {
		setConstString(offset + 144, $dlv_grp_cd10, value);
	}


	/**
	 * Delivery destination classification name 10 納品先分類名１０.<p>
	 *
	 */
	public String dlv_grp_nm10() {
		return getConstString(offset + 145, $dlv_grp_nm10);
	}

	/**
	 * Delivery destination classification name 10 納品先分類名１０.<p>
	 *
	 */
	public void dlv_grp_nm10(String value) {
		setConstString(offset + 145, $dlv_grp_nm10, value);
	}


	/**
	 * Item classification 1 品目分類１.<p>
	 *
	 */
	public boolean itm_grp_flg1() {
		return getConstBoolean(offset + 146, $itm_grp_flg1);
	}

	/**
	 * Item classification 1 品目分類１.<p>
	 *
	 */
	public void itm_grp_flg1(boolean value) {
		setConstBoolean(offset + 146, $itm_grp_flg1, value);
	}


	/**
	 * Item classification cd. 1 品目分類ＣＤ１.<p>
	 *
	 */
	public String itm_grp_cd1() {
		return getConstString(offset + 147, $itm_grp_cd1);
	}

	/**
	 * Item classification cd. 1 品目分類ＣＤ１.<p>
	 *
	 */
	public void itm_grp_cd1(String value) {
		setConstString(offset + 147, $itm_grp_cd1, value);
	}


	/**
	 * Item classification name 1 品目分類名１.<p>
	 *
	 */
	public String itm_grp_nm1() {
		return getConstString(offset + 148, $itm_grp_nm1);
	}

	/**
	 * Item classification name 1 品目分類名１.<p>
	 *
	 */
	public void itm_grp_nm1(String value) {
		setConstString(offset + 148, $itm_grp_nm1, value);
	}


	/**
	 * Item classification 2 品目分類２.<p>
	 *
	 */
	public boolean itm_grp_flg2() {
		return getConstBoolean(offset + 149, $itm_grp_flg2);
	}

	/**
	 * Item classification 2 品目分類２.<p>
	 *
	 */
	public void itm_grp_flg2(boolean value) {
		setConstBoolean(offset + 149, $itm_grp_flg2, value);
	}


	/**
	 * Item classification cd. 2 品目分類ＣＤ２.<p>
	 *
	 */
	public String itm_grp_cd2() {
		return getConstString(offset + 150, $itm_grp_cd2);
	}

	/**
	 * Item classification cd. 2 品目分類ＣＤ２.<p>
	 *
	 */
	public void itm_grp_cd2(String value) {
		setConstString(offset + 150, $itm_grp_cd2, value);
	}


	/**
	 * Item classification name 2 品目分類名２.<p>
	 *
	 */
	public String itm_grp_nm2() {
		return getConstString(offset + 151, $itm_grp_nm2);
	}

	/**
	 * Item classification name 2 品目分類名２.<p>
	 *
	 */
	public void itm_grp_nm2(String value) {
		setConstString(offset + 151, $itm_grp_nm2, value);
	}


	/**
	 * Item classification 3 品目分類３.<p>
	 *
	 */
	public boolean itm_grp_flg3() {
		return getConstBoolean(offset + 152, $itm_grp_flg3);
	}

	/**
	 * Item classification 3 品目分類３.<p>
	 *
	 */
	public void itm_grp_flg3(boolean value) {
		setConstBoolean(offset + 152, $itm_grp_flg3, value);
	}


	/**
	 * Item classification cd. 3 品目分類ＣＤ３.<p>
	 *
	 */
	public String itm_grp_cd3() {
		return getConstString(offset + 153, $itm_grp_cd3);
	}

	/**
	 * Item classification cd. 3 品目分類ＣＤ３.<p>
	 *
	 */
	public void itm_grp_cd3(String value) {
		setConstString(offset + 153, $itm_grp_cd3, value);
	}


	/**
	 * Item classification name 3 品目分類名３.<p>
	 *
	 */
	public String itm_grp_nm3() {
		return getConstString(offset + 154, $itm_grp_nm3);
	}

	/**
	 * Item classification name 3 品目分類名３.<p>
	 *
	 */
	public void itm_grp_nm3(String value) {
		setConstString(offset + 154, $itm_grp_nm3, value);
	}


	/**
	 * Item classification 4 品目分類４.<p>
	 *
	 */
	public boolean itm_grp_flg4() {
		return getConstBoolean(offset + 155, $itm_grp_flg4);
	}

	/**
	 * Item classification 4 品目分類４.<p>
	 *
	 */
	public void itm_grp_flg4(boolean value) {
		setConstBoolean(offset + 155, $itm_grp_flg4, value);
	}


	/**
	 * Item classification cd. 4 品目分類ＣＤ４.<p>
	 *
	 */
	public String itm_grp_cd4() {
		return getConstString(offset + 156, $itm_grp_cd4);
	}

	/**
	 * Item classification cd. 4 品目分類ＣＤ４.<p>
	 *
	 */
	public void itm_grp_cd4(String value) {
		setConstString(offset + 156, $itm_grp_cd4, value);
	}


	/**
	 * Item classification name 4 品目分類名４.<p>
	 *
	 */
	public String itm_grp_nm4() {
		return getConstString(offset + 157, $itm_grp_nm4);
	}

	/**
	 * Item classification name 4 品目分類名４.<p>
	 *
	 */
	public void itm_grp_nm4(String value) {
		setConstString(offset + 157, $itm_grp_nm4, value);
	}


	/**
	 * Item classification 5 品目分類５.<p>
	 *
	 */
	public boolean itm_grp_flg5() {
		return getConstBoolean(offset + 158, $itm_grp_flg5);
	}

	/**
	 * Item classification 5 品目分類５.<p>
	 *
	 */
	public void itm_grp_flg5(boolean value) {
		setConstBoolean(offset + 158, $itm_grp_flg5, value);
	}


	/**
	 * Item classification cd. 5 品目分類ＣＤ５.<p>
	 *
	 */
	public String itm_grp_cd5() {
		return getConstString(offset + 159, $itm_grp_cd5);
	}

	/**
	 * Item classification cd. 5 品目分類ＣＤ５.<p>
	 *
	 */
	public void itm_grp_cd5(String value) {
		setConstString(offset + 159, $itm_grp_cd5, value);
	}


	/**
	 * Item classification name 5 品目分類名５.<p>
	 *
	 */
	public String itm_grp_nm5() {
		return getConstString(offset + 160, $itm_grp_nm5);
	}

	/**
	 * Item classification name 5 品目分類名５.<p>
	 *
	 */
	public void itm_grp_nm5(String value) {
		setConstString(offset + 160, $itm_grp_nm5, value);
	}


	/**
	 * Item classification 6 品目分類６.<p>
	 *
	 */
	public boolean itm_grp_flg6() {
		return getConstBoolean(offset + 161, $itm_grp_flg6);
	}

	/**
	 * Item classification 6 品目分類６.<p>
	 *
	 */
	public void itm_grp_flg6(boolean value) {
		setConstBoolean(offset + 161, $itm_grp_flg6, value);
	}


	/**
	 * Item classification cd. 6 品目分類ＣＤ６.<p>
	 *
	 */
	public String itm_grp_cd6() {
		return getConstString(offset + 162, $itm_grp_cd6);
	}

	/**
	 * Item classification cd. 6 品目分類ＣＤ６.<p>
	 *
	 */
	public void itm_grp_cd6(String value) {
		setConstString(offset + 162, $itm_grp_cd6, value);
	}


	/**
	 * Item classification name 6 品目分類名６.<p>
	 *
	 */
	public String itm_grp_nm6() {
		return getConstString(offset + 163, $itm_grp_nm6);
	}

	/**
	 * Item classification name 6 品目分類名６.<p>
	 *
	 */
	public void itm_grp_nm6(String value) {
		setConstString(offset + 163, $itm_grp_nm6, value);
	}


	/**
	 * Item classification 7 品目分類７.<p>
	 *
	 */
	public boolean itm_grp_flg7() {
		return getConstBoolean(offset + 164, $itm_grp_flg7);
	}

	/**
	 * Item classification 7 品目分類７.<p>
	 *
	 */
	public void itm_grp_flg7(boolean value) {
		setConstBoolean(offset + 164, $itm_grp_flg7, value);
	}


	/**
	 * Item classification cd. 7 品目分類ＣＤ７.<p>
	 *
	 */
	public String itm_grp_cd7() {
		return getConstString(offset + 165, $itm_grp_cd7);
	}

	/**
	 * Item classification cd. 7 品目分類ＣＤ７.<p>
	 *
	 */
	public void itm_grp_cd7(String value) {
		setConstString(offset + 165, $itm_grp_cd7, value);
	}


	/**
	 * Item classification name 7 品目分類名７.<p>
	 *
	 */
	public String itm_grp_nm7() {
		return getConstString(offset + 166, $itm_grp_nm7);
	}

	/**
	 * Item classification name 7 品目分類名７.<p>
	 *
	 */
	public void itm_grp_nm7(String value) {
		setConstString(offset + 166, $itm_grp_nm7, value);
	}


	/**
	 * Item classification 8 品目分類８.<p>
	 *
	 */
	public boolean itm_grp_flg8() {
		return getConstBoolean(offset + 167, $itm_grp_flg8);
	}

	/**
	 * Item classification 8 品目分類８.<p>
	 *
	 */
	public void itm_grp_flg8(boolean value) {
		setConstBoolean(offset + 167, $itm_grp_flg8, value);
	}


	/**
	 * Item classification cd. 8 品目分類ＣＤ８.<p>
	 *
	 */
	public String itm_grp_cd8() {
		return getConstString(offset + 168, $itm_grp_cd8);
	}

	/**
	 * Item classification cd. 8 品目分類ＣＤ８.<p>
	 *
	 */
	public void itm_grp_cd8(String value) {
		setConstString(offset + 168, $itm_grp_cd8, value);
	}


	/**
	 * Item classification name 8 品目分類名８.<p>
	 *
	 */
	public String itm_grp_nm8() {
		return getConstString(offset + 169, $itm_grp_nm8);
	}

	/**
	 * Item classification name 8 品目分類名８.<p>
	 *
	 */
	public void itm_grp_nm8(String value) {
		setConstString(offset + 169, $itm_grp_nm8, value);
	}


	/**
	 * Item classification 9 品目分類９.<p>
	 *
	 */
	public boolean itm_grp_flg9() {
		return getConstBoolean(offset + 170, $itm_grp_flg9);
	}

	/**
	 * Item classification 9 品目分類９.<p>
	 *
	 */
	public void itm_grp_flg9(boolean value) {
		setConstBoolean(offset + 170, $itm_grp_flg9, value);
	}


	/**
	 * Item classification cd. 9 品目分類ＣＤ９.<p>
	 *
	 */
	public String itm_grp_cd9() {
		return getConstString(offset + 171, $itm_grp_cd9);
	}

	/**
	 * Item classification cd. 9 品目分類ＣＤ９.<p>
	 *
	 */
	public void itm_grp_cd9(String value) {
		setConstString(offset + 171, $itm_grp_cd9, value);
	}


	/**
	 * Item classification name 9 品目分類名９.<p>
	 *
	 */
	public String itm_grp_nm9() {
		return getConstString(offset + 172, $itm_grp_nm9);
	}

	/**
	 * Item classification name 9 品目分類名９.<p>
	 *
	 */
	public void itm_grp_nm9(String value) {
		setConstString(offset + 172, $itm_grp_nm9, value);
	}


	/**
	 * Item classification 10 品目分類１０.<p>
	 *
	 */
	public boolean itm_grp_flg10() {
		return getConstBoolean(offset + 173, $itm_grp_flg10);
	}

	/**
	 * Item classification 10 品目分類１０.<p>
	 *
	 */
	public void itm_grp_flg10(boolean value) {
		setConstBoolean(offset + 173, $itm_grp_flg10, value);
	}


	/**
	 * Item classification cd. 10 品目分類ＣＤ１０.<p>
	 *
	 */
	public String itm_grp_cd10() {
		return getConstString(offset + 174, $itm_grp_cd10);
	}

	/**
	 * Item classification cd. 10 品目分類ＣＤ１０.<p>
	 *
	 */
	public void itm_grp_cd10(String value) {
		setConstString(offset + 174, $itm_grp_cd10, value);
	}


	/**
	 * Item classification name 10 品目分類名１０.<p>
	 *
	 */
	public String itm_grp_nm10() {
		return getConstString(offset + 175, $itm_grp_nm10);
	}

	/**
	 * Item classification name 10 品目分類名１０.<p>
	 *
	 */
	public void itm_grp_nm10(String value) {
		setConstString(offset + 175, $itm_grp_nm10, value);
	}


	public String getString(String name) {
		if ($ope.equalsIgnoreCase(name)) {
			return ope();
		}
		if ($disp.equalsIgnoreCase(name)) {
			return disp();
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
		if ($cst_cd.equalsIgnoreCase(name)) {
			return cst_cd();
		}
		if ($cst_nm.equalsIgnoreCase(name)) {
			return cst_nm();
		}
		if ($itm_typ.equalsIgnoreCase(name)) {
			return itm_typ();
		}
		if ($itm_typ_d_cd.equalsIgnoreCase(name)) {
			return itm_typ_d_cd();
		}
		if ($itm_typ_d_nm.equalsIgnoreCase(name)) {
			return itm_typ_d_nm();
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
		if ($wrk_no.equalsIgnoreCase(name)) {
			return wrk_no();
		}
		if ($wrk_nm.equalsIgnoreCase(name)) {
			return wrk_nm();
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
		if ($trd_cd.equalsIgnoreCase(name)) {
			return trd_cd();
		}
		if ($trd_nm.equalsIgnoreCase(name)) {
			return trd_nm();
		}
		if ($qtn_no.equalsIgnoreCase(name)) {
			return qtn_no();
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($trd_cur_nm.equalsIgnoreCase(name)) {
			return trd_cur_nm();
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
		if ($gd_cd.equalsIgnoreCase(name)) {
			return gd_cd();
		}
		if ($gd_nm.equalsIgnoreCase(name)) {
			return gd_nm();
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
		if ($qtn_term_cd.equalsIgnoreCase(name)) {
			return qtn_term_cd();
		}
		if ($qtn_term_nm.equalsIgnoreCase(name)) {
			return qtn_term_nm();
		}
		if ($rcpt_usr_cd.equalsIgnoreCase(name)) {
			return rcpt_usr_cd();
		}
		if ($rcpt_usr_nm.equalsIgnoreCase(name)) {
			return rcpt_usr_nm();
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
		if ($cst_grp_cd1.equalsIgnoreCase(name)) {
			return cst_grp_cd1();
		}
		if ($cst_grp_nm1.equalsIgnoreCase(name)) {
			return cst_grp_nm1();
		}
		if ($cst_grp_cd2.equalsIgnoreCase(name)) {
			return cst_grp_cd2();
		}
		if ($cst_grp_nm2.equalsIgnoreCase(name)) {
			return cst_grp_nm2();
		}
		if ($cst_grp_cd3.equalsIgnoreCase(name)) {
			return cst_grp_cd3();
		}
		if ($cst_grp_nm3.equalsIgnoreCase(name)) {
			return cst_grp_nm3();
		}
		if ($cst_grp_cd4.equalsIgnoreCase(name)) {
			return cst_grp_cd4();
		}
		if ($cst_grp_nm4.equalsIgnoreCase(name)) {
			return cst_grp_nm4();
		}
		if ($cst_grp_cd5.equalsIgnoreCase(name)) {
			return cst_grp_cd5();
		}
		if ($cst_grp_nm5.equalsIgnoreCase(name)) {
			return cst_grp_nm5();
		}
		if ($cst_grp_cd6.equalsIgnoreCase(name)) {
			return cst_grp_cd6();
		}
		if ($cst_grp_nm6.equalsIgnoreCase(name)) {
			return cst_grp_nm6();
		}
		if ($cst_grp_cd7.equalsIgnoreCase(name)) {
			return cst_grp_cd7();
		}
		if ($cst_grp_nm7.equalsIgnoreCase(name)) {
			return cst_grp_nm7();
		}
		if ($cst_grp_cd8.equalsIgnoreCase(name)) {
			return cst_grp_cd8();
		}
		if ($cst_grp_nm8.equalsIgnoreCase(name)) {
			return cst_grp_nm8();
		}
		if ($cst_grp_cd9.equalsIgnoreCase(name)) {
			return cst_grp_cd9();
		}
		if ($cst_grp_nm9.equalsIgnoreCase(name)) {
			return cst_grp_nm9();
		}
		if ($cst_grp_cd10.equalsIgnoreCase(name)) {
			return cst_grp_cd10();
		}
		if ($cst_grp_nm10.equalsIgnoreCase(name)) {
			return cst_grp_nm10();
		}
		if ($dlv_grp_cd1.equalsIgnoreCase(name)) {
			return dlv_grp_cd1();
		}
		if ($dlv_grp_nm1.equalsIgnoreCase(name)) {
			return dlv_grp_nm1();
		}
		if ($dlv_grp_cd2.equalsIgnoreCase(name)) {
			return dlv_grp_cd2();
		}
		if ($dlv_grp_nm2.equalsIgnoreCase(name)) {
			return dlv_grp_nm2();
		}
		if ($dlv_grp_cd3.equalsIgnoreCase(name)) {
			return dlv_grp_cd3();
		}
		if ($dlv_grp_nm3.equalsIgnoreCase(name)) {
			return dlv_grp_nm3();
		}
		if ($dlv_grp_cd4.equalsIgnoreCase(name)) {
			return dlv_grp_cd4();
		}
		if ($dlv_grp_nm4.equalsIgnoreCase(name)) {
			return dlv_grp_nm4();
		}
		if ($dlv_grp_cd5.equalsIgnoreCase(name)) {
			return dlv_grp_cd5();
		}
		if ($dlv_grp_nm5.equalsIgnoreCase(name)) {
			return dlv_grp_nm5();
		}
		if ($dlv_grp_cd6.equalsIgnoreCase(name)) {
			return dlv_grp_cd6();
		}
		if ($dlv_grp_nm6.equalsIgnoreCase(name)) {
			return dlv_grp_nm6();
		}
		if ($dlv_grp_cd7.equalsIgnoreCase(name)) {
			return dlv_grp_cd7();
		}
		if ($dlv_grp_nm7.equalsIgnoreCase(name)) {
			return dlv_grp_nm7();
		}
		if ($dlv_grp_cd8.equalsIgnoreCase(name)) {
			return dlv_grp_cd8();
		}
		if ($dlv_grp_nm8.equalsIgnoreCase(name)) {
			return dlv_grp_nm8();
		}
		if ($dlv_grp_cd9.equalsIgnoreCase(name)) {
			return dlv_grp_cd9();
		}
		if ($dlv_grp_nm9.equalsIgnoreCase(name)) {
			return dlv_grp_nm9();
		}
		if ($dlv_grp_cd10.equalsIgnoreCase(name)) {
			return dlv_grp_cd10();
		}
		if ($dlv_grp_nm10.equalsIgnoreCase(name)) {
			return dlv_grp_nm10();
		}
		if ($itm_grp_cd1.equalsIgnoreCase(name)) {
			return itm_grp_cd1();
		}
		if ($itm_grp_nm1.equalsIgnoreCase(name)) {
			return itm_grp_nm1();
		}
		if ($itm_grp_cd2.equalsIgnoreCase(name)) {
			return itm_grp_cd2();
		}
		if ($itm_grp_nm2.equalsIgnoreCase(name)) {
			return itm_grp_nm2();
		}
		if ($itm_grp_cd3.equalsIgnoreCase(name)) {
			return itm_grp_cd3();
		}
		if ($itm_grp_nm3.equalsIgnoreCase(name)) {
			return itm_grp_nm3();
		}
		if ($itm_grp_cd4.equalsIgnoreCase(name)) {
			return itm_grp_cd4();
		}
		if ($itm_grp_nm4.equalsIgnoreCase(name)) {
			return itm_grp_nm4();
		}
		if ($itm_grp_cd5.equalsIgnoreCase(name)) {
			return itm_grp_cd5();
		}
		if ($itm_grp_nm5.equalsIgnoreCase(name)) {
			return itm_grp_nm5();
		}
		if ($itm_grp_cd6.equalsIgnoreCase(name)) {
			return itm_grp_cd6();
		}
		if ($itm_grp_nm6.equalsIgnoreCase(name)) {
			return itm_grp_nm6();
		}
		if ($itm_grp_cd7.equalsIgnoreCase(name)) {
			return itm_grp_cd7();
		}
		if ($itm_grp_nm7.equalsIgnoreCase(name)) {
			return itm_grp_nm7();
		}
		if ($itm_grp_cd8.equalsIgnoreCase(name)) {
			return itm_grp_cd8();
		}
		if ($itm_grp_nm8.equalsIgnoreCase(name)) {
			return itm_grp_nm8();
		}
		if ($itm_grp_cd9.equalsIgnoreCase(name)) {
			return itm_grp_cd9();
		}
		if ($itm_grp_nm9.equalsIgnoreCase(name)) {
			return itm_grp_nm9();
		}
		if ($itm_grp_cd10.equalsIgnoreCase(name)) {
			return itm_grp_cd10();
		}
		if ($itm_grp_nm10.equalsIgnoreCase(name)) {
			return itm_grp_nm10();
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
		if ($cst_grp_flg1.equalsIgnoreCase(name)) {
			return cst_grp_flg1();
		}
		if ($cst_grp_flg2.equalsIgnoreCase(name)) {
			return cst_grp_flg2();
		}
		if ($cst_grp_flg3.equalsIgnoreCase(name)) {
			return cst_grp_flg3();
		}
		if ($cst_grp_flg4.equalsIgnoreCase(name)) {
			return cst_grp_flg4();
		}
		if ($cst_grp_flg5.equalsIgnoreCase(name)) {
			return cst_grp_flg5();
		}
		if ($cst_grp_flg6.equalsIgnoreCase(name)) {
			return cst_grp_flg6();
		}
		if ($cst_grp_flg7.equalsIgnoreCase(name)) {
			return cst_grp_flg7();
		}
		if ($cst_grp_flg8.equalsIgnoreCase(name)) {
			return cst_grp_flg8();
		}
		if ($cst_grp_flg9.equalsIgnoreCase(name)) {
			return cst_grp_flg9();
		}
		if ($cst_grp_flg10.equalsIgnoreCase(name)) {
			return cst_grp_flg10();
		}
		if ($dlv_grp_flg1.equalsIgnoreCase(name)) {
			return dlv_grp_flg1();
		}
		if ($dlv_grp_flg2.equalsIgnoreCase(name)) {
			return dlv_grp_flg2();
		}
		if ($dlv_grp_flg3.equalsIgnoreCase(name)) {
			return dlv_grp_flg3();
		}
		if ($dlv_grp_flg4.equalsIgnoreCase(name)) {
			return dlv_grp_flg4();
		}
		if ($dlv_grp_flg5.equalsIgnoreCase(name)) {
			return dlv_grp_flg5();
		}
		if ($dlv_grp_flg6.equalsIgnoreCase(name)) {
			return dlv_grp_flg6();
		}
		if ($dlv_grp_flg7.equalsIgnoreCase(name)) {
			return dlv_grp_flg7();
		}
		if ($dlv_grp_flg8.equalsIgnoreCase(name)) {
			return dlv_grp_flg8();
		}
		if ($dlv_grp_flg9.equalsIgnoreCase(name)) {
			return dlv_grp_flg9();
		}
		if ($dlv_grp_flg10.equalsIgnoreCase(name)) {
			return dlv_grp_flg10();
		}
		if ($itm_grp_flg1.equalsIgnoreCase(name)) {
			return itm_grp_flg1();
		}
		if ($itm_grp_flg2.equalsIgnoreCase(name)) {
			return itm_grp_flg2();
		}
		if ($itm_grp_flg3.equalsIgnoreCase(name)) {
			return itm_grp_flg3();
		}
		if ($itm_grp_flg4.equalsIgnoreCase(name)) {
			return itm_grp_flg4();
		}
		if ($itm_grp_flg5.equalsIgnoreCase(name)) {
			return itm_grp_flg5();
		}
		if ($itm_grp_flg6.equalsIgnoreCase(name)) {
			return itm_grp_flg6();
		}
		if ($itm_grp_flg7.equalsIgnoreCase(name)) {
			return itm_grp_flg7();
		}
		if ($itm_grp_flg8.equalsIgnoreCase(name)) {
			return itm_grp_flg8();
		}
		if ($itm_grp_flg9.equalsIgnoreCase(name)) {
			return itm_grp_flg9();
		}
		if ($itm_grp_flg10.equalsIgnoreCase(name)) {
			return itm_grp_flg10();
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
		if ($cst_cd.equalsIgnoreCase(name)) {
			return cst_cd();
		}
		if ($cst_nm.equalsIgnoreCase(name)) {
			return cst_nm();
		}
		if ($itm_typ.equalsIgnoreCase(name)) {
			return itm_typ();
		}
		if ($itm_typ_d_cd.equalsIgnoreCase(name)) {
			return itm_typ_d_cd();
		}
		if ($itm_typ_d_nm.equalsIgnoreCase(name)) {
			return itm_typ_d_nm();
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
		if ($wrk_no.equalsIgnoreCase(name)) {
			return wrk_no();
		}
		if ($wrk_nm.equalsIgnoreCase(name)) {
			return wrk_nm();
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
		if ($trd_cd.equalsIgnoreCase(name)) {
			return trd_cd();
		}
		if ($trd_nm.equalsIgnoreCase(name)) {
			return trd_nm();
		}
		if ($qtn_no.equalsIgnoreCase(name)) {
			return qtn_no();
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($trd_cur_nm.equalsIgnoreCase(name)) {
			return trd_cur_nm();
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
		if ($gd_cd.equalsIgnoreCase(name)) {
			return gd_cd();
		}
		if ($gd_nm.equalsIgnoreCase(name)) {
			return gd_nm();
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
		if ($qtn_term_cd.equalsIgnoreCase(name)) {
			return qtn_term_cd();
		}
		if ($qtn_term_nm.equalsIgnoreCase(name)) {
			return qtn_term_nm();
		}
		if ($rcpt_usr_cd.equalsIgnoreCase(name)) {
			return rcpt_usr_cd();
		}
		if ($rcpt_usr_nm.equalsIgnoreCase(name)) {
			return rcpt_usr_nm();
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
		if ($cst_grp_cd1.equalsIgnoreCase(name)) {
			return cst_grp_cd1();
		}
		if ($cst_grp_nm1.equalsIgnoreCase(name)) {
			return cst_grp_nm1();
		}
		if ($cst_grp_cd2.equalsIgnoreCase(name)) {
			return cst_grp_cd2();
		}
		if ($cst_grp_nm2.equalsIgnoreCase(name)) {
			return cst_grp_nm2();
		}
		if ($cst_grp_cd3.equalsIgnoreCase(name)) {
			return cst_grp_cd3();
		}
		if ($cst_grp_nm3.equalsIgnoreCase(name)) {
			return cst_grp_nm3();
		}
		if ($cst_grp_cd4.equalsIgnoreCase(name)) {
			return cst_grp_cd4();
		}
		if ($cst_grp_nm4.equalsIgnoreCase(name)) {
			return cst_grp_nm4();
		}
		if ($cst_grp_cd5.equalsIgnoreCase(name)) {
			return cst_grp_cd5();
		}
		if ($cst_grp_nm5.equalsIgnoreCase(name)) {
			return cst_grp_nm5();
		}
		if ($cst_grp_cd6.equalsIgnoreCase(name)) {
			return cst_grp_cd6();
		}
		if ($cst_grp_nm6.equalsIgnoreCase(name)) {
			return cst_grp_nm6();
		}
		if ($cst_grp_cd7.equalsIgnoreCase(name)) {
			return cst_grp_cd7();
		}
		if ($cst_grp_nm7.equalsIgnoreCase(name)) {
			return cst_grp_nm7();
		}
		if ($cst_grp_cd8.equalsIgnoreCase(name)) {
			return cst_grp_cd8();
		}
		if ($cst_grp_nm8.equalsIgnoreCase(name)) {
			return cst_grp_nm8();
		}
		if ($cst_grp_cd9.equalsIgnoreCase(name)) {
			return cst_grp_cd9();
		}
		if ($cst_grp_nm9.equalsIgnoreCase(name)) {
			return cst_grp_nm9();
		}
		if ($cst_grp_cd10.equalsIgnoreCase(name)) {
			return cst_grp_cd10();
		}
		if ($cst_grp_nm10.equalsIgnoreCase(name)) {
			return cst_grp_nm10();
		}
		if ($dlv_grp_cd1.equalsIgnoreCase(name)) {
			return dlv_grp_cd1();
		}
		if ($dlv_grp_nm1.equalsIgnoreCase(name)) {
			return dlv_grp_nm1();
		}
		if ($dlv_grp_cd2.equalsIgnoreCase(name)) {
			return dlv_grp_cd2();
		}
		if ($dlv_grp_nm2.equalsIgnoreCase(name)) {
			return dlv_grp_nm2();
		}
		if ($dlv_grp_cd3.equalsIgnoreCase(name)) {
			return dlv_grp_cd3();
		}
		if ($dlv_grp_nm3.equalsIgnoreCase(name)) {
			return dlv_grp_nm3();
		}
		if ($dlv_grp_cd4.equalsIgnoreCase(name)) {
			return dlv_grp_cd4();
		}
		if ($dlv_grp_nm4.equalsIgnoreCase(name)) {
			return dlv_grp_nm4();
		}
		if ($dlv_grp_cd5.equalsIgnoreCase(name)) {
			return dlv_grp_cd5();
		}
		if ($dlv_grp_nm5.equalsIgnoreCase(name)) {
			return dlv_grp_nm5();
		}
		if ($dlv_grp_cd6.equalsIgnoreCase(name)) {
			return dlv_grp_cd6();
		}
		if ($dlv_grp_nm6.equalsIgnoreCase(name)) {
			return dlv_grp_nm6();
		}
		if ($dlv_grp_cd7.equalsIgnoreCase(name)) {
			return dlv_grp_cd7();
		}
		if ($dlv_grp_nm7.equalsIgnoreCase(name)) {
			return dlv_grp_nm7();
		}
		if ($dlv_grp_cd8.equalsIgnoreCase(name)) {
			return dlv_grp_cd8();
		}
		if ($dlv_grp_nm8.equalsIgnoreCase(name)) {
			return dlv_grp_nm8();
		}
		if ($dlv_grp_cd9.equalsIgnoreCase(name)) {
			return dlv_grp_cd9();
		}
		if ($dlv_grp_nm9.equalsIgnoreCase(name)) {
			return dlv_grp_nm9();
		}
		if ($dlv_grp_cd10.equalsIgnoreCase(name)) {
			return dlv_grp_cd10();
		}
		if ($dlv_grp_nm10.equalsIgnoreCase(name)) {
			return dlv_grp_nm10();
		}
		if ($itm_grp_cd1.equalsIgnoreCase(name)) {
			return itm_grp_cd1();
		}
		if ($itm_grp_nm1.equalsIgnoreCase(name)) {
			return itm_grp_nm1();
		}
		if ($itm_grp_cd2.equalsIgnoreCase(name)) {
			return itm_grp_cd2();
		}
		if ($itm_grp_nm2.equalsIgnoreCase(name)) {
			return itm_grp_nm2();
		}
		if ($itm_grp_cd3.equalsIgnoreCase(name)) {
			return itm_grp_cd3();
		}
		if ($itm_grp_nm3.equalsIgnoreCase(name)) {
			return itm_grp_nm3();
		}
		if ($itm_grp_cd4.equalsIgnoreCase(name)) {
			return itm_grp_cd4();
		}
		if ($itm_grp_nm4.equalsIgnoreCase(name)) {
			return itm_grp_nm4();
		}
		if ($itm_grp_cd5.equalsIgnoreCase(name)) {
			return itm_grp_cd5();
		}
		if ($itm_grp_nm5.equalsIgnoreCase(name)) {
			return itm_grp_nm5();
		}
		if ($itm_grp_cd6.equalsIgnoreCase(name)) {
			return itm_grp_cd6();
		}
		if ($itm_grp_nm6.equalsIgnoreCase(name)) {
			return itm_grp_nm6();
		}
		if ($itm_grp_cd7.equalsIgnoreCase(name)) {
			return itm_grp_cd7();
		}
		if ($itm_grp_nm7.equalsIgnoreCase(name)) {
			return itm_grp_nm7();
		}
		if ($itm_grp_cd8.equalsIgnoreCase(name)) {
			return itm_grp_cd8();
		}
		if ($itm_grp_nm8.equalsIgnoreCase(name)) {
			return itm_grp_nm8();
		}
		if ($itm_grp_cd9.equalsIgnoreCase(name)) {
			return itm_grp_cd9();
		}
		if ($itm_grp_nm9.equalsIgnoreCase(name)) {
			return itm_grp_nm9();
		}
		if ($itm_grp_cd10.equalsIgnoreCase(name)) {
			return itm_grp_cd10();
		}
		if ($itm_grp_nm10.equalsIgnoreCase(name)) {
			return itm_grp_nm10();
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
		if ($cst_grp_flg1.equalsIgnoreCase(name)) {
			return cst_grp_flg1();
		}
		if ($cst_grp_flg2.equalsIgnoreCase(name)) {
			return cst_grp_flg2();
		}
		if ($cst_grp_flg3.equalsIgnoreCase(name)) {
			return cst_grp_flg3();
		}
		if ($cst_grp_flg4.equalsIgnoreCase(name)) {
			return cst_grp_flg4();
		}
		if ($cst_grp_flg5.equalsIgnoreCase(name)) {
			return cst_grp_flg5();
		}
		if ($cst_grp_flg6.equalsIgnoreCase(name)) {
			return cst_grp_flg6();
		}
		if ($cst_grp_flg7.equalsIgnoreCase(name)) {
			return cst_grp_flg7();
		}
		if ($cst_grp_flg8.equalsIgnoreCase(name)) {
			return cst_grp_flg8();
		}
		if ($cst_grp_flg9.equalsIgnoreCase(name)) {
			return cst_grp_flg9();
		}
		if ($cst_grp_flg10.equalsIgnoreCase(name)) {
			return cst_grp_flg10();
		}
		if ($dlv_grp_flg1.equalsIgnoreCase(name)) {
			return dlv_grp_flg1();
		}
		if ($dlv_grp_flg2.equalsIgnoreCase(name)) {
			return dlv_grp_flg2();
		}
		if ($dlv_grp_flg3.equalsIgnoreCase(name)) {
			return dlv_grp_flg3();
		}
		if ($dlv_grp_flg4.equalsIgnoreCase(name)) {
			return dlv_grp_flg4();
		}
		if ($dlv_grp_flg5.equalsIgnoreCase(name)) {
			return dlv_grp_flg5();
		}
		if ($dlv_grp_flg6.equalsIgnoreCase(name)) {
			return dlv_grp_flg6();
		}
		if ($dlv_grp_flg7.equalsIgnoreCase(name)) {
			return dlv_grp_flg7();
		}
		if ($dlv_grp_flg8.equalsIgnoreCase(name)) {
			return dlv_grp_flg8();
		}
		if ($dlv_grp_flg9.equalsIgnoreCase(name)) {
			return dlv_grp_flg9();
		}
		if ($dlv_grp_flg10.equalsIgnoreCase(name)) {
			return dlv_grp_flg10();
		}
		if ($itm_grp_flg1.equalsIgnoreCase(name)) {
			return itm_grp_flg1();
		}
		if ($itm_grp_flg2.equalsIgnoreCase(name)) {
			return itm_grp_flg2();
		}
		if ($itm_grp_flg3.equalsIgnoreCase(name)) {
			return itm_grp_flg3();
		}
		if ($itm_grp_flg4.equalsIgnoreCase(name)) {
			return itm_grp_flg4();
		}
		if ($itm_grp_flg5.equalsIgnoreCase(name)) {
			return itm_grp_flg5();
		}
		if ($itm_grp_flg6.equalsIgnoreCase(name)) {
			return itm_grp_flg6();
		}
		if ($itm_grp_flg7.equalsIgnoreCase(name)) {
			return itm_grp_flg7();
		}
		if ($itm_grp_flg8.equalsIgnoreCase(name)) {
			return itm_grp_flg8();
		}
		if ($itm_grp_flg9.equalsIgnoreCase(name)) {
			return itm_grp_flg9();
		}
		if ($itm_grp_flg10.equalsIgnoreCase(name)) {
			return itm_grp_flg10();
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
		if ($cst_cd.equalsIgnoreCase(name)) {
			cst_cd(value);
			return;
		}
		if ($cst_nm.equalsIgnoreCase(name)) {
			cst_nm(value);
			return;
		}
		if ($itm_typ.equalsIgnoreCase(name)) {
			itm_typ(value);
			return;
		}
		if ($itm_typ_d_cd.equalsIgnoreCase(name)) {
			itm_typ_d_cd(value);
			return;
		}
		if ($itm_typ_d_nm.equalsIgnoreCase(name)) {
			itm_typ_d_nm(value);
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
		if ($wrk_no.equalsIgnoreCase(name)) {
			wrk_no(value);
			return;
		}
		if ($wrk_nm.equalsIgnoreCase(name)) {
			wrk_nm(value);
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
		if ($trd_cd.equalsIgnoreCase(name)) {
			trd_cd(value);
			return;
		}
		if ($trd_nm.equalsIgnoreCase(name)) {
			trd_nm(value);
			return;
		}
		if ($qtn_no.equalsIgnoreCase(name)) {
			qtn_no(value);
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
		if ($gd_cd.equalsIgnoreCase(name)) {
			gd_cd(value);
			return;
		}
		if ($gd_nm.equalsIgnoreCase(name)) {
			gd_nm(value);
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
		if ($qtn_term_cd.equalsIgnoreCase(name)) {
			qtn_term_cd(value);
			return;
		}
		if ($qtn_term_nm.equalsIgnoreCase(name)) {
			qtn_term_nm(value);
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
		if ($cst_grp_cd1.equalsIgnoreCase(name)) {
			cst_grp_cd1(value);
			return;
		}
		if ($cst_grp_nm1.equalsIgnoreCase(name)) {
			cst_grp_nm1(value);
			return;
		}
		if ($cst_grp_cd2.equalsIgnoreCase(name)) {
			cst_grp_cd2(value);
			return;
		}
		if ($cst_grp_nm2.equalsIgnoreCase(name)) {
			cst_grp_nm2(value);
			return;
		}
		if ($cst_grp_cd3.equalsIgnoreCase(name)) {
			cst_grp_cd3(value);
			return;
		}
		if ($cst_grp_nm3.equalsIgnoreCase(name)) {
			cst_grp_nm3(value);
			return;
		}
		if ($cst_grp_cd4.equalsIgnoreCase(name)) {
			cst_grp_cd4(value);
			return;
		}
		if ($cst_grp_nm4.equalsIgnoreCase(name)) {
			cst_grp_nm4(value);
			return;
		}
		if ($cst_grp_cd5.equalsIgnoreCase(name)) {
			cst_grp_cd5(value);
			return;
		}
		if ($cst_grp_nm5.equalsIgnoreCase(name)) {
			cst_grp_nm5(value);
			return;
		}
		if ($cst_grp_cd6.equalsIgnoreCase(name)) {
			cst_grp_cd6(value);
			return;
		}
		if ($cst_grp_nm6.equalsIgnoreCase(name)) {
			cst_grp_nm6(value);
			return;
		}
		if ($cst_grp_cd7.equalsIgnoreCase(name)) {
			cst_grp_cd7(value);
			return;
		}
		if ($cst_grp_nm7.equalsIgnoreCase(name)) {
			cst_grp_nm7(value);
			return;
		}
		if ($cst_grp_cd8.equalsIgnoreCase(name)) {
			cst_grp_cd8(value);
			return;
		}
		if ($cst_grp_nm8.equalsIgnoreCase(name)) {
			cst_grp_nm8(value);
			return;
		}
		if ($cst_grp_cd9.equalsIgnoreCase(name)) {
			cst_grp_cd9(value);
			return;
		}
		if ($cst_grp_nm9.equalsIgnoreCase(name)) {
			cst_grp_nm9(value);
			return;
		}
		if ($cst_grp_cd10.equalsIgnoreCase(name)) {
			cst_grp_cd10(value);
			return;
		}
		if ($cst_grp_nm10.equalsIgnoreCase(name)) {
			cst_grp_nm10(value);
			return;
		}
		if ($dlv_grp_cd1.equalsIgnoreCase(name)) {
			dlv_grp_cd1(value);
			return;
		}
		if ($dlv_grp_nm1.equalsIgnoreCase(name)) {
			dlv_grp_nm1(value);
			return;
		}
		if ($dlv_grp_cd2.equalsIgnoreCase(name)) {
			dlv_grp_cd2(value);
			return;
		}
		if ($dlv_grp_nm2.equalsIgnoreCase(name)) {
			dlv_grp_nm2(value);
			return;
		}
		if ($dlv_grp_cd3.equalsIgnoreCase(name)) {
			dlv_grp_cd3(value);
			return;
		}
		if ($dlv_grp_nm3.equalsIgnoreCase(name)) {
			dlv_grp_nm3(value);
			return;
		}
		if ($dlv_grp_cd4.equalsIgnoreCase(name)) {
			dlv_grp_cd4(value);
			return;
		}
		if ($dlv_grp_nm4.equalsIgnoreCase(name)) {
			dlv_grp_nm4(value);
			return;
		}
		if ($dlv_grp_cd5.equalsIgnoreCase(name)) {
			dlv_grp_cd5(value);
			return;
		}
		if ($dlv_grp_nm5.equalsIgnoreCase(name)) {
			dlv_grp_nm5(value);
			return;
		}
		if ($dlv_grp_cd6.equalsIgnoreCase(name)) {
			dlv_grp_cd6(value);
			return;
		}
		if ($dlv_grp_nm6.equalsIgnoreCase(name)) {
			dlv_grp_nm6(value);
			return;
		}
		if ($dlv_grp_cd7.equalsIgnoreCase(name)) {
			dlv_grp_cd7(value);
			return;
		}
		if ($dlv_grp_nm7.equalsIgnoreCase(name)) {
			dlv_grp_nm7(value);
			return;
		}
		if ($dlv_grp_cd8.equalsIgnoreCase(name)) {
			dlv_grp_cd8(value);
			return;
		}
		if ($dlv_grp_nm8.equalsIgnoreCase(name)) {
			dlv_grp_nm8(value);
			return;
		}
		if ($dlv_grp_cd9.equalsIgnoreCase(name)) {
			dlv_grp_cd9(value);
			return;
		}
		if ($dlv_grp_nm9.equalsIgnoreCase(name)) {
			dlv_grp_nm9(value);
			return;
		}
		if ($dlv_grp_cd10.equalsIgnoreCase(name)) {
			dlv_grp_cd10(value);
			return;
		}
		if ($dlv_grp_nm10.equalsIgnoreCase(name)) {
			dlv_grp_nm10(value);
			return;
		}
		if ($itm_grp_cd1.equalsIgnoreCase(name)) {
			itm_grp_cd1(value);
			return;
		}
		if ($itm_grp_nm1.equalsIgnoreCase(name)) {
			itm_grp_nm1(value);
			return;
		}
		if ($itm_grp_cd2.equalsIgnoreCase(name)) {
			itm_grp_cd2(value);
			return;
		}
		if ($itm_grp_nm2.equalsIgnoreCase(name)) {
			itm_grp_nm2(value);
			return;
		}
		if ($itm_grp_cd3.equalsIgnoreCase(name)) {
			itm_grp_cd3(value);
			return;
		}
		if ($itm_grp_nm3.equalsIgnoreCase(name)) {
			itm_grp_nm3(value);
			return;
		}
		if ($itm_grp_cd4.equalsIgnoreCase(name)) {
			itm_grp_cd4(value);
			return;
		}
		if ($itm_grp_nm4.equalsIgnoreCase(name)) {
			itm_grp_nm4(value);
			return;
		}
		if ($itm_grp_cd5.equalsIgnoreCase(name)) {
			itm_grp_cd5(value);
			return;
		}
		if ($itm_grp_nm5.equalsIgnoreCase(name)) {
			itm_grp_nm5(value);
			return;
		}
		if ($itm_grp_cd6.equalsIgnoreCase(name)) {
			itm_grp_cd6(value);
			return;
		}
		if ($itm_grp_nm6.equalsIgnoreCase(name)) {
			itm_grp_nm6(value);
			return;
		}
		if ($itm_grp_cd7.equalsIgnoreCase(name)) {
			itm_grp_cd7(value);
			return;
		}
		if ($itm_grp_nm7.equalsIgnoreCase(name)) {
			itm_grp_nm7(value);
			return;
		}
		if ($itm_grp_cd8.equalsIgnoreCase(name)) {
			itm_grp_cd8(value);
			return;
		}
		if ($itm_grp_nm8.equalsIgnoreCase(name)) {
			itm_grp_nm8(value);
			return;
		}
		if ($itm_grp_cd9.equalsIgnoreCase(name)) {
			itm_grp_cd9(value);
			return;
		}
		if ($itm_grp_nm9.equalsIgnoreCase(name)) {
			itm_grp_nm9(value);
			return;
		}
		if ($itm_grp_cd10.equalsIgnoreCase(name)) {
			itm_grp_cd10(value);
			return;
		}
		if ($itm_grp_nm10.equalsIgnoreCase(name)) {
			itm_grp_nm10(value);
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
		if ($cst_grp_flg1.equalsIgnoreCase(name)) {
			cst_grp_flg1(value);
			return;
		}
		if ($cst_grp_flg2.equalsIgnoreCase(name)) {
			cst_grp_flg2(value);
			return;
		}
		if ($cst_grp_flg3.equalsIgnoreCase(name)) {
			cst_grp_flg3(value);
			return;
		}
		if ($cst_grp_flg4.equalsIgnoreCase(name)) {
			cst_grp_flg4(value);
			return;
		}
		if ($cst_grp_flg5.equalsIgnoreCase(name)) {
			cst_grp_flg5(value);
			return;
		}
		if ($cst_grp_flg6.equalsIgnoreCase(name)) {
			cst_grp_flg6(value);
			return;
		}
		if ($cst_grp_flg7.equalsIgnoreCase(name)) {
			cst_grp_flg7(value);
			return;
		}
		if ($cst_grp_flg8.equalsIgnoreCase(name)) {
			cst_grp_flg8(value);
			return;
		}
		if ($cst_grp_flg9.equalsIgnoreCase(name)) {
			cst_grp_flg9(value);
			return;
		}
		if ($cst_grp_flg10.equalsIgnoreCase(name)) {
			cst_grp_flg10(value);
			return;
		}
		if ($dlv_grp_flg1.equalsIgnoreCase(name)) {
			dlv_grp_flg1(value);
			return;
		}
		if ($dlv_grp_flg2.equalsIgnoreCase(name)) {
			dlv_grp_flg2(value);
			return;
		}
		if ($dlv_grp_flg3.equalsIgnoreCase(name)) {
			dlv_grp_flg3(value);
			return;
		}
		if ($dlv_grp_flg4.equalsIgnoreCase(name)) {
			dlv_grp_flg4(value);
			return;
		}
		if ($dlv_grp_flg5.equalsIgnoreCase(name)) {
			dlv_grp_flg5(value);
			return;
		}
		if ($dlv_grp_flg6.equalsIgnoreCase(name)) {
			dlv_grp_flg6(value);
			return;
		}
		if ($dlv_grp_flg7.equalsIgnoreCase(name)) {
			dlv_grp_flg7(value);
			return;
		}
		if ($dlv_grp_flg8.equalsIgnoreCase(name)) {
			dlv_grp_flg8(value);
			return;
		}
		if ($dlv_grp_flg9.equalsIgnoreCase(name)) {
			dlv_grp_flg9(value);
			return;
		}
		if ($dlv_grp_flg10.equalsIgnoreCase(name)) {
			dlv_grp_flg10(value);
			return;
		}
		if ($itm_grp_flg1.equalsIgnoreCase(name)) {
			itm_grp_flg1(value);
			return;
		}
		if ($itm_grp_flg2.equalsIgnoreCase(name)) {
			itm_grp_flg2(value);
			return;
		}
		if ($itm_grp_flg3.equalsIgnoreCase(name)) {
			itm_grp_flg3(value);
			return;
		}
		if ($itm_grp_flg4.equalsIgnoreCase(name)) {
			itm_grp_flg4(value);
			return;
		}
		if ($itm_grp_flg5.equalsIgnoreCase(name)) {
			itm_grp_flg5(value);
			return;
		}
		if ($itm_grp_flg6.equalsIgnoreCase(name)) {
			itm_grp_flg6(value);
			return;
		}
		if ($itm_grp_flg7.equalsIgnoreCase(name)) {
			itm_grp_flg7(value);
			return;
		}
		if ($itm_grp_flg8.equalsIgnoreCase(name)) {
			itm_grp_flg8(value);
			return;
		}
		if ($itm_grp_flg9.equalsIgnoreCase(name)) {
			itm_grp_flg9(value);
			return;
		}
		if ($itm_grp_flg10.equalsIgnoreCase(name)) {
			itm_grp_flg10(value);
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
		if ($cst_cd.equalsIgnoreCase(name)) {
			cst_cd(value);
			return;
		}
		if ($cst_nm.equalsIgnoreCase(name)) {
			cst_nm(value);
			return;
		}
		if ($itm_typ.equalsIgnoreCase(name)) {
			itm_typ(value);
			return;
		}
		if ($itm_typ_d_cd.equalsIgnoreCase(name)) {
			itm_typ_d_cd(value);
			return;
		}
		if ($itm_typ_d_nm.equalsIgnoreCase(name)) {
			itm_typ_d_nm(value);
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
		if ($wrk_no.equalsIgnoreCase(name)) {
			wrk_no(value);
			return;
		}
		if ($wrk_nm.equalsIgnoreCase(name)) {
			wrk_nm(value);
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
		if ($trd_cd.equalsIgnoreCase(name)) {
			trd_cd(value);
			return;
		}
		if ($trd_nm.equalsIgnoreCase(name)) {
			trd_nm(value);
			return;
		}
		if ($qtn_no.equalsIgnoreCase(name)) {
			qtn_no(value);
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
		if ($gd_cd.equalsIgnoreCase(name)) {
			gd_cd(value);
			return;
		}
		if ($gd_nm.equalsIgnoreCase(name)) {
			gd_nm(value);
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
		if ($qtn_term_cd.equalsIgnoreCase(name)) {
			qtn_term_cd(value);
			return;
		}
		if ($qtn_term_nm.equalsIgnoreCase(name)) {
			qtn_term_nm(value);
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
		if ($cst_grp_cd1.equalsIgnoreCase(name)) {
			cst_grp_cd1(value);
			return;
		}
		if ($cst_grp_nm1.equalsIgnoreCase(name)) {
			cst_grp_nm1(value);
			return;
		}
		if ($cst_grp_cd2.equalsIgnoreCase(name)) {
			cst_grp_cd2(value);
			return;
		}
		if ($cst_grp_nm2.equalsIgnoreCase(name)) {
			cst_grp_nm2(value);
			return;
		}
		if ($cst_grp_cd3.equalsIgnoreCase(name)) {
			cst_grp_cd3(value);
			return;
		}
		if ($cst_grp_nm3.equalsIgnoreCase(name)) {
			cst_grp_nm3(value);
			return;
		}
		if ($cst_grp_cd4.equalsIgnoreCase(name)) {
			cst_grp_cd4(value);
			return;
		}
		if ($cst_grp_nm4.equalsIgnoreCase(name)) {
			cst_grp_nm4(value);
			return;
		}
		if ($cst_grp_cd5.equalsIgnoreCase(name)) {
			cst_grp_cd5(value);
			return;
		}
		if ($cst_grp_nm5.equalsIgnoreCase(name)) {
			cst_grp_nm5(value);
			return;
		}
		if ($cst_grp_cd6.equalsIgnoreCase(name)) {
			cst_grp_cd6(value);
			return;
		}
		if ($cst_grp_nm6.equalsIgnoreCase(name)) {
			cst_grp_nm6(value);
			return;
		}
		if ($cst_grp_cd7.equalsIgnoreCase(name)) {
			cst_grp_cd7(value);
			return;
		}
		if ($cst_grp_nm7.equalsIgnoreCase(name)) {
			cst_grp_nm7(value);
			return;
		}
		if ($cst_grp_cd8.equalsIgnoreCase(name)) {
			cst_grp_cd8(value);
			return;
		}
		if ($cst_grp_nm8.equalsIgnoreCase(name)) {
			cst_grp_nm8(value);
			return;
		}
		if ($cst_grp_cd9.equalsIgnoreCase(name)) {
			cst_grp_cd9(value);
			return;
		}
		if ($cst_grp_nm9.equalsIgnoreCase(name)) {
			cst_grp_nm9(value);
			return;
		}
		if ($cst_grp_cd10.equalsIgnoreCase(name)) {
			cst_grp_cd10(value);
			return;
		}
		if ($cst_grp_nm10.equalsIgnoreCase(name)) {
			cst_grp_nm10(value);
			return;
		}
		if ($dlv_grp_cd1.equalsIgnoreCase(name)) {
			dlv_grp_cd1(value);
			return;
		}
		if ($dlv_grp_nm1.equalsIgnoreCase(name)) {
			dlv_grp_nm1(value);
			return;
		}
		if ($dlv_grp_cd2.equalsIgnoreCase(name)) {
			dlv_grp_cd2(value);
			return;
		}
		if ($dlv_grp_nm2.equalsIgnoreCase(name)) {
			dlv_grp_nm2(value);
			return;
		}
		if ($dlv_grp_cd3.equalsIgnoreCase(name)) {
			dlv_grp_cd3(value);
			return;
		}
		if ($dlv_grp_nm3.equalsIgnoreCase(name)) {
			dlv_grp_nm3(value);
			return;
		}
		if ($dlv_grp_cd4.equalsIgnoreCase(name)) {
			dlv_grp_cd4(value);
			return;
		}
		if ($dlv_grp_nm4.equalsIgnoreCase(name)) {
			dlv_grp_nm4(value);
			return;
		}
		if ($dlv_grp_cd5.equalsIgnoreCase(name)) {
			dlv_grp_cd5(value);
			return;
		}
		if ($dlv_grp_nm5.equalsIgnoreCase(name)) {
			dlv_grp_nm5(value);
			return;
		}
		if ($dlv_grp_cd6.equalsIgnoreCase(name)) {
			dlv_grp_cd6(value);
			return;
		}
		if ($dlv_grp_nm6.equalsIgnoreCase(name)) {
			dlv_grp_nm6(value);
			return;
		}
		if ($dlv_grp_cd7.equalsIgnoreCase(name)) {
			dlv_grp_cd7(value);
			return;
		}
		if ($dlv_grp_nm7.equalsIgnoreCase(name)) {
			dlv_grp_nm7(value);
			return;
		}
		if ($dlv_grp_cd8.equalsIgnoreCase(name)) {
			dlv_grp_cd8(value);
			return;
		}
		if ($dlv_grp_nm8.equalsIgnoreCase(name)) {
			dlv_grp_nm8(value);
			return;
		}
		if ($dlv_grp_cd9.equalsIgnoreCase(name)) {
			dlv_grp_cd9(value);
			return;
		}
		if ($dlv_grp_nm9.equalsIgnoreCase(name)) {
			dlv_grp_nm9(value);
			return;
		}
		if ($dlv_grp_cd10.equalsIgnoreCase(name)) {
			dlv_grp_cd10(value);
			return;
		}
		if ($dlv_grp_nm10.equalsIgnoreCase(name)) {
			dlv_grp_nm10(value);
			return;
		}
		if ($itm_grp_cd1.equalsIgnoreCase(name)) {
			itm_grp_cd1(value);
			return;
		}
		if ($itm_grp_nm1.equalsIgnoreCase(name)) {
			itm_grp_nm1(value);
			return;
		}
		if ($itm_grp_cd2.equalsIgnoreCase(name)) {
			itm_grp_cd2(value);
			return;
		}
		if ($itm_grp_nm2.equalsIgnoreCase(name)) {
			itm_grp_nm2(value);
			return;
		}
		if ($itm_grp_cd3.equalsIgnoreCase(name)) {
			itm_grp_cd3(value);
			return;
		}
		if ($itm_grp_nm3.equalsIgnoreCase(name)) {
			itm_grp_nm3(value);
			return;
		}
		if ($itm_grp_cd4.equalsIgnoreCase(name)) {
			itm_grp_cd4(value);
			return;
		}
		if ($itm_grp_nm4.equalsIgnoreCase(name)) {
			itm_grp_nm4(value);
			return;
		}
		if ($itm_grp_cd5.equalsIgnoreCase(name)) {
			itm_grp_cd5(value);
			return;
		}
		if ($itm_grp_nm5.equalsIgnoreCase(name)) {
			itm_grp_nm5(value);
			return;
		}
		if ($itm_grp_cd6.equalsIgnoreCase(name)) {
			itm_grp_cd6(value);
			return;
		}
		if ($itm_grp_nm6.equalsIgnoreCase(name)) {
			itm_grp_nm6(value);
			return;
		}
		if ($itm_grp_cd7.equalsIgnoreCase(name)) {
			itm_grp_cd7(value);
			return;
		}
		if ($itm_grp_nm7.equalsIgnoreCase(name)) {
			itm_grp_nm7(value);
			return;
		}
		if ($itm_grp_cd8.equalsIgnoreCase(name)) {
			itm_grp_cd8(value);
			return;
		}
		if ($itm_grp_nm8.equalsIgnoreCase(name)) {
			itm_grp_nm8(value);
			return;
		}
		if ($itm_grp_cd9.equalsIgnoreCase(name)) {
			itm_grp_cd9(value);
			return;
		}
		if ($itm_grp_nm9.equalsIgnoreCase(name)) {
			itm_grp_nm9(value);
			return;
		}
		if ($itm_grp_cd10.equalsIgnoreCase(name)) {
			itm_grp_cd10(value);
			return;
		}
		if ($itm_grp_nm10.equalsIgnoreCase(name)) {
			itm_grp_nm10(value);
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
		if ($cst_grp_flg1.equalsIgnoreCase(name)) {
			cst_grp_flg1(value);
			return;
		}
		if ($cst_grp_flg2.equalsIgnoreCase(name)) {
			cst_grp_flg2(value);
			return;
		}
		if ($cst_grp_flg3.equalsIgnoreCase(name)) {
			cst_grp_flg3(value);
			return;
		}
		if ($cst_grp_flg4.equalsIgnoreCase(name)) {
			cst_grp_flg4(value);
			return;
		}
		if ($cst_grp_flg5.equalsIgnoreCase(name)) {
			cst_grp_flg5(value);
			return;
		}
		if ($cst_grp_flg6.equalsIgnoreCase(name)) {
			cst_grp_flg6(value);
			return;
		}
		if ($cst_grp_flg7.equalsIgnoreCase(name)) {
			cst_grp_flg7(value);
			return;
		}
		if ($cst_grp_flg8.equalsIgnoreCase(name)) {
			cst_grp_flg8(value);
			return;
		}
		if ($cst_grp_flg9.equalsIgnoreCase(name)) {
			cst_grp_flg9(value);
			return;
		}
		if ($cst_grp_flg10.equalsIgnoreCase(name)) {
			cst_grp_flg10(value);
			return;
		}
		if ($dlv_grp_flg1.equalsIgnoreCase(name)) {
			dlv_grp_flg1(value);
			return;
		}
		if ($dlv_grp_flg2.equalsIgnoreCase(name)) {
			dlv_grp_flg2(value);
			return;
		}
		if ($dlv_grp_flg3.equalsIgnoreCase(name)) {
			dlv_grp_flg3(value);
			return;
		}
		if ($dlv_grp_flg4.equalsIgnoreCase(name)) {
			dlv_grp_flg4(value);
			return;
		}
		if ($dlv_grp_flg5.equalsIgnoreCase(name)) {
			dlv_grp_flg5(value);
			return;
		}
		if ($dlv_grp_flg6.equalsIgnoreCase(name)) {
			dlv_grp_flg6(value);
			return;
		}
		if ($dlv_grp_flg7.equalsIgnoreCase(name)) {
			dlv_grp_flg7(value);
			return;
		}
		if ($dlv_grp_flg8.equalsIgnoreCase(name)) {
			dlv_grp_flg8(value);
			return;
		}
		if ($dlv_grp_flg9.equalsIgnoreCase(name)) {
			dlv_grp_flg9(value);
			return;
		}
		if ($dlv_grp_flg10.equalsIgnoreCase(name)) {
			dlv_grp_flg10(value);
			return;
		}
		if ($itm_grp_flg1.equalsIgnoreCase(name)) {
			itm_grp_flg1(value);
			return;
		}
		if ($itm_grp_flg2.equalsIgnoreCase(name)) {
			itm_grp_flg2(value);
			return;
		}
		if ($itm_grp_flg3.equalsIgnoreCase(name)) {
			itm_grp_flg3(value);
			return;
		}
		if ($itm_grp_flg4.equalsIgnoreCase(name)) {
			itm_grp_flg4(value);
			return;
		}
		if ($itm_grp_flg5.equalsIgnoreCase(name)) {
			itm_grp_flg5(value);
			return;
		}
		if ($itm_grp_flg6.equalsIgnoreCase(name)) {
			itm_grp_flg6(value);
			return;
		}
		if ($itm_grp_flg7.equalsIgnoreCase(name)) {
			itm_grp_flg7(value);
			return;
		}
		if ($itm_grp_flg8.equalsIgnoreCase(name)) {
			itm_grp_flg8(value);
			return;
		}
		if ($itm_grp_flg9.equalsIgnoreCase(name)) {
			itm_grp_flg9(value);
			return;
		}
		if ($itm_grp_flg10.equalsIgnoreCase(name)) {
			itm_grp_flg10(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

