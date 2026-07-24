package mcframe.serverMSBB.MSBBL6090;

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
 * ブロック"Hdr"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class HdrR_MC_A extends MCConstRow {

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
	 * Rev. number update 改訂番号更新.<p>
	 *
	 */
	public static final String $rev_upd_flg = "rev_upd_flg";
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
	 * Quotation type 見積区分.<p>
	 *
	 */
	public static final String $qtn_typ = "qtn_typ";
	/**
	 * Quotation type before change 変更前見積区分.<p>
	 *
	 */
	public static final String $bef_qtn_typ = "bef_qtn_typ";
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
	 * Quotation immediate issue 見積書即時発行.<p>
	 *
	 */
	public static final String $qtn_out_flg = "qtn_out_flg";
	/**
	 * Quotation issued 見積書発行済.<p>
	 *
	 */
	public static final String $qtn_prnt_flg = "qtn_prnt_flg";
	/**
	 * Failed order 失注.<p>
	 *
	 */
	public static final String $failure_flg = "failure_flg";
	/**
	 * Failed order before change 変更前失注.<p>
	 *
	 */
	public static final String $bef_failure_flg = "bef_failure_flg";
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
	 * Customer invoice transaction 得意先インボイス取引.<p>
	 *
	 */
	public static final String $cst_iv_flg = "cst_iv_flg";
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
	 * Quotation terms cd. 見積条件ＣＤ.<p>
	 *
	 */
	public static final String $qtn_term_cd = "qtn_term_cd";
	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public static final String $trd_cur_cd = "trd_cur_cd";
	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public static final String $amt_dec_place = "amt_dec_place";
	/**
	 * Specify foreign exchange 為替指定.<p>
	 *
	 */
	public static final String $xrate_inpt_flg = "xrate_inpt_flg";
	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public static final String $xrate = "xrate";
	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public static final String $wrk_no = "wrk_no";
	/**
	 * Customer quotation request No. 得意先見積依頼ＮＯ.<p>
	 *
	 */
	public static final String $cst_qtn_rqst_no = "cst_qtn_rqst_no";
	/**
	 * Transportation method cd. 輸送方法ＣＤ.<p>
	 *
	 */
	public static final String $trnspt_cd = "trnspt_cd";
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
	 * Quotation sequence number 見積書連番.<p>
	 *
	 */
	public static final String $qtn_prnt_seq = "qtn_prnt_seq";
	/**
	 * Quotation update counter 見積更新カウンタ.<p>
	 *
	 */
	public static final String $qtn_upd_cntr = "qtn_upd_cntr";
	/**
	 * Discount unit amount (Transaction currency) 取引通貨仕切金額.<p>
	 *
	 */
	public static final String $trd_cur_amt = "trd_cur_amt";
	/**
	 * Discount unit tax (Transaction currency) 取引通貨仕切税額.<p>
	 *
	 */
	public static final String $trd_cur_tax_amt = "trd_cur_tax_amt";
	/**
	 * Error エラー.<p>
	 *
	 */
	public static final String $err_flg = "err_flg";


	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta data_crud_typ_META = createCommonMeta($data_crud_typ, mcframe.commonMA.meta.MA_META.DATA_CRUD_TYP);
	public static final MCMeta trd_cd_META = createCommonMeta($trd_cd, mcframe.commonMA.meta.MA_META.TRD_CD);
	public static final MCMeta trd_ptn_typ_META = createCommonMeta($trd_ptn_typ, mcframe.commonMA.meta.MA_META.TRD_PTN_TYP);
	public static final MCMeta rev_upd_flg_META = createCommonMeta($rev_upd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta qtn_no_META = createCommonMeta($qtn_no, mcframe.commonMA.meta.MA_META.QTN_NO);
	public static final MCMeta qtn_rev_META = createCommonMeta($qtn_rev, mcframe.commonMA.meta.MA_META.SLIP_REV);
	public static final MCMeta qtn_typ_META = createCommonMeta($qtn_typ, mcframe.commonMS.meta.MS_META.QTN_TYP);
	public static final MCMeta bef_qtn_typ_META = createCommonMeta($bef_qtn_typ, mcframe.commonMS.meta.MS_META.QTN_TYP);
	public static final MCMeta qtn_dt_META = createCommonMeta($qtn_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta valid_dt_META = createCommonMeta($valid_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta qtn_out_flg_META = createCommonMeta($qtn_out_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta qtn_prnt_flg_META = createCommonMeta($qtn_prnt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta failure_flg_META = createCommonMeta($failure_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bef_failure_flg_META = createCommonMeta($bef_failure_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta aprv_flg_META = createCommonMeta($aprv_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta aprv_back_flg_META = createCommonMeta($aprv_back_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta aprv_no_META = createCommonMeta($aprv_no, mcframe.commonMA.meta.MA_META.APRV_NO);
	public static final MCMeta aprv_sts_typ_META = createCommonMeta($aprv_sts_typ, mcframe.commonMA.meta.MA_META.APRV_STS_TYP);
	public static final MCMeta aprv_sts_typ_nm_META = createCommonMeta($aprv_sts_typ_nm, mcframe.commonMA.meta.MA_META.APRV_STS_TYP_NM);
	public static final MCMeta cst_cd_META = createCommonMeta($cst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta cst_sundry_flg_META = createCommonMeta($cst_sundry_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cst_iv_flg_META = createCommonMeta($cst_iv_flg, mcframe.commonMA.meta.MA_META.FLG);
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
	public static final MCMeta sls_amt_rnd_typ_META = createCommonMeta($sls_amt_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta sls_tax_rnd_typ_META = createCommonMeta($sls_tax_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta sls_usr_cd_META = createCommonMeta($sls_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta sls_dpt_cd_META = createCommonMeta($sls_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta qtn_term_cd_META = createCommonMeta($qtn_term_cd, mcframe.commonMS.meta.MS_META.SLO_RSN_CD);
	public static final MCMeta trd_cur_cd_META = createCommonMeta($trd_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta amt_dec_place_META = createCommonMeta($amt_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta xrate_inpt_flg_META = createCommonMeta($xrate_inpt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta xrate_META = createCommonMeta($xrate, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta wrk_no_META = createCommonMeta($wrk_no, mcframe.commonMA.meta.MA_META.WRK_NO);
	public static final MCMeta cst_qtn_rqst_no_META = createCommonMeta($cst_qtn_rqst_no, mcframe.commonMA.meta.MA_META.CST_QTN_RQST_NO);
	public static final MCMeta trnspt_cd_META = createCommonMeta($trnspt_cd, mcframe.commonMA.meta.MA_META.TRNSPT_CD);
	public static final MCMeta tterm_cd1_META = createCommonMeta($tterm_cd1, mcframe.commonMA.meta.MA_META.TTERM_CD);
	public static final MCMeta tterm_rmrks1_META = createCommonMeta($tterm_rmrks1, mcframe.commonMS.meta.MS_META.TTERM_RMRKS1);
	public static final MCMeta tterm_cd2_META = createCommonMeta($tterm_cd2, mcframe.commonMA.meta.MA_META.TTERM_CD);
	public static final MCMeta tterm_rmrks2_META = createCommonMeta($tterm_rmrks2, mcframe.commonMS.meta.MS_META.TTERM_RMRKS2);
	public static final MCMeta tterm_cd3_META = createCommonMeta($tterm_cd3, mcframe.commonMA.meta.MA_META.TTERM_CD);
	public static final MCMeta tterm_rmrks3_META = createCommonMeta($tterm_rmrks3, mcframe.commonMS.meta.MS_META.TTERM_RMRKS3);
	public static final MCMeta rcpt_dt_META = createCommonMeta($rcpt_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta rcpt_usr_cd_META = createCommonMeta($rcpt_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta qtn_rmrks_META = createCommonMeta($qtn_rmrks, mcframe.commonMS.meta.MS_META.QTN_RMRKS);
	public static final MCMeta intr_rmrks_META = createCommonMeta($intr_rmrks, mcframe.commonMS.meta.MS_META.QTN_INTR_RMRKS);
	public static final MCMeta qtn_rslt_rsn_cd_META = createCommonMeta($qtn_rslt_rsn_cd, mcframe.commonMS.meta.MS_META.SLO_RSN_CD);
	public static final MCMeta qtn_rslt_rsn_rmrks_META = createCommonMeta($qtn_rslt_rsn_rmrks, mcframe.commonMS.meta.MS_META.QTN_RSLT_RSN_RMRKS);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.QTN_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.QTN_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.QTN_SUB_CHAR3);
	public static final MCMeta qtn_prnt_seq_META = createCommonMeta($qtn_prnt_seq, mcframe.commonMA.meta.MA_META.PRNT_SEQ);
	public static final MCMeta qtn_upd_cntr_META = createCommonMeta($qtn_upd_cntr, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta trd_cur_amt_META = createCommonMeta($trd_cur_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta trd_cur_tax_amt_META = createCommonMeta($trd_cur_tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta err_flg_META = createCommonMeta($err_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<HdrR> constMetas = new ConstMetaList<HdrR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			peg_no_META,
			data_crud_typ_META,
			trd_cd_META,
			trd_ptn_typ_META,
			rev_upd_flg_META,
			qtn_no_META,
			qtn_rev_META,
			qtn_typ_META,
			bef_qtn_typ_META,
			qtn_dt_META,
			valid_dt_META,
			qtn_out_flg_META,
			qtn_prnt_flg_META,
			failure_flg_META,
			bef_failure_flg_META,
			aprv_flg_META,
			aprv_back_flg_META,
			aprv_no_META,
			aprv_sts_typ_META,
			aprv_sts_typ_nm_META,
			cst_cd_META,
			cst_sundry_flg_META,
			cst_iv_flg_META,
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
			sls_amt_rnd_typ_META,
			sls_tax_rnd_typ_META,
			sls_usr_cd_META,
			sls_dpt_cd_META,
			wg_cd_META,
			qtn_term_cd_META,
			trd_cur_cd_META,
			amt_dec_place_META,
			xrate_inpt_flg_META,
			xrate_META,
			wrk_no_META,
			cst_qtn_rqst_no_META,
			trnspt_cd_META,
			tterm_cd1_META,
			tterm_rmrks1_META,
			tterm_cd2_META,
			tterm_rmrks2_META,
			tterm_cd3_META,
			tterm_rmrks3_META,
			rcpt_dt_META,
			rcpt_usr_cd_META,
			qtn_rmrks_META,
			intr_rmrks_META,
			qtn_rslt_rsn_cd_META,
			qtn_rslt_rsn_rmrks_META,
			sub_char1_META,
			sub_char2_META,
			sub_char3_META,
			qtn_prnt_seq_META,
			qtn_upd_cntr_META,
			trd_cur_amt_META,
			trd_cur_tax_amt_META,
			err_flg_META
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
				{$qtn_typ, "E"},	// qtn_typ
				{$qtn_dt, "E"},	// qtn_dt
				{$valid_dt, "E"},	// valid_dt
				{$cst_cd, "E"},	// cst_cd
				{$sls_dpt_cd, "E"},	// sls_dpt_cd
				{$trd_cur_cd, "E"}	// trd_cur_cd
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
				{$rcpt_dt, "bfToday"}	// rcpt_dt
			}
		)),
		new MCExtMap.Entry($$BEFORE_AFTER, new MCExtList(
			new String[][]{
				{$qtn_dt, "vaild_dt:BF"},	// qtn_dt
				{$valid_dt, "vaild_dt:AF"}	// valid_dt
			}
		)),
		new MCExtMap.Entry($$CHK_PTN, new MCExtList(
			new String[][]{
				{$cst_zip_cd, "ZIP"},	// cst_zip_cd
				{$cst_tel, "TEL"},	// cst_tel
				{$cst_fax, "TEL"}	// cst_fax
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
				{$qtn_term_cd, "MS.MSUAL0030.QtnTerm"},	// qtn_term_cd
				{$trd_cur_cd, "MA.MAUAL0010.Cur"},	// trd_cur_cd
				{$trnspt_cd, "MA.MAUAL0010.Trnspt"},	// trnspt_cd
				{$tterm_cd1, "MA.MAUAL0010.Tterm1"},	// tterm_cd1
				{$tterm_cd2, "MA.MAUAL0010.Tterm2"},	// tterm_cd2
				{$tterm_cd3, "MA.MAUAL0010.Tterm3"},	// tterm_cd3
				{$rcpt_usr_cd, "MA.MAUAL0010.Usr"},	// rcpt_usr_cd
				{$qtn_rslt_rsn_cd, "MS.MSUAL0030.QtnRsltRsn"}	// qtn_rslt_rsn_cd
			}
		)),
		new MCExtMap.Entry($$LIST_OUT, new MCExtList(
			new String[][]{
				{$trd_cd, "trd_ptn_typ"},	// trd_cd
				{$cst_cd, "cst_sundry_flg;sls_amt_rnd_typ;sls_tax_rnd_typ;cst_iv_flg;cst_zip_cd;cst_addr1;cst_addr2;cst_addr3;cst_addr4;cst_tel;cst_fax;cst_cntct_dpt;cst_cntct_psn;"},	// cst_cd
				{$sls_dpt_cd, "wg_cd"},	// sls_dpt_cd
				{$trd_cur_cd, "amt_dec_place"}	// trd_cur_cd
			}
		)),
		new MCExtMap.Entry($$LIST_OUT_BASE, new MCExtList(
			new String[][]{
				{$cst_cd, "cst_sundry_flg;sls_amt_rnd_typ;sls_tax_rnd_typ;cst_iv_flg;zip_cd;addr1;addr2;addr3;addr4;tel;fax;cst_cntct_dpt;cst_cntct_psn;"},	// cst_cd
				{$sls_dpt_cd, "wg_cd"}	// sls_dpt_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$cst_cd, "MAC_BP_IS_SRCH_TYP.CST;qtn_dt"},	// cst_cd
				{$sls_dpt_cd, "qtn_dt;sls_usr_cd;MAC_DPT_IS_SRCH_TYP.SLS"},	// sls_dpt_cd
				{$rcpt_usr_cd, "false"}	// rcpt_usr_cd
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$cst_cd, "bp_is_srch_typ;dt"},	// cst_cd
				{$sls_dpt_cd, "dt;usr_cd;dpt_is_srch_typ"},	// sls_dpt_cd
				{$rcpt_usr_cd, "referring_usr_acl_flg"}	// rcpt_usr_cd
			}
		)),
		new MCExtMap.Entry($$CONST, new MCExtList(
			new String[][]{
				{$qtn_typ, "MSC_QTN_TYP"},	// qtn_typ
				{$bef_qtn_typ, "MSC_QTN_TYP"},	// bef_qtn_typ
				{$aprv_sts_typ, "MAC_APRV_STS_TYP"}	// aprv_sts_typ
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
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public String trd_cd() {
		return getConstString(offset + 2, $trd_cd);
	}

	/**
	 * Transaction cd. 取引ＣＤ.<p>
	 *
	 */
	public void trd_cd(String value) {
		setConstString(offset + 2, $trd_cd, value);
	}


	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public String trd_ptn_typ() {
		return getConstString(offset + 3, $trd_ptn_typ);
	}

	/**
	 * Transaction pattern type 取引パタン区分.<p>
	 *
	 */
	public void trd_ptn_typ(String value) {
		setConstString(offset + 3, $trd_ptn_typ, value);
	}


	/**
	 * Rev. number update 改訂番号更新.<p>
	 *
	 */
	public boolean rev_upd_flg() {
		return getConstBoolean(offset + 4, $rev_upd_flg);
	}

	/**
	 * Rev. number update 改訂番号更新.<p>
	 *
	 */
	public void rev_upd_flg(boolean value) {
		setConstBoolean(offset + 4, $rev_upd_flg, value);
	}


	/**
	 * Quotation No. 見積ＮＯ.<p>
	 *
	 */
	public String qtn_no() {
		return getConstString(offset + 5, $qtn_no);
	}

	/**
	 * Quotation No. 見積ＮＯ.<p>
	 *
	 */
	public void qtn_no(String value) {
		setConstString(offset + 5, $qtn_no, value);
	}


	/**
	 * Quotation rev. number 見積改訂番号.<p>
	 *
	 */
	public MCNumber qtn_rev() {
		return getConstNumber(offset + 6, $qtn_rev);
	}

	/**
	 * Quotation rev. number 見積改訂番号.<p>
	 *
	 */
	public void qtn_rev(MCNumber value) {
		setConstNumber(offset + 6, $qtn_rev, value);
	}

	/**
	 * Quotation rev. number 見積改訂番号.<p>
	 *
	 */
	public void qtn_rev(int value) {
		setConstNumber(offset + 6, $qtn_rev, value);
	}

	/**
	 * Quotation rev. number 見積改訂番号.<p>
	 *
	 */
	public void qtn_rev(long value) {
		setConstNumber(offset + 6, $qtn_rev, value);
	}

	/**
	 * Quotation rev. number 見積改訂番号.<p>
	 *
	 */
	public void qtn_rev(float value) {
		setConstNumber(offset + 6, $qtn_rev, value);
	}

	/**
	 * Quotation rev. number 見積改訂番号.<p>
	 *
	 */
	public void qtn_rev(double value) {
		setConstNumber(offset + 6, $qtn_rev, value);
	}


	/**
	 * Quotation type 見積区分.<p>
	 *
	 */
	public String qtn_typ() {
		return getConstString(offset + 7, $qtn_typ);
	}

	/**
	 * Quotation type 見積区分.<p>
	 *
	 */
	public void qtn_typ(String value) {
		setConstString(offset + 7, $qtn_typ, value);
	}


	/**
	 * Quotation type before change 変更前見積区分.<p>
	 *
	 */
	public String bef_qtn_typ() {
		return getConstString(offset + 8, $bef_qtn_typ);
	}

	/**
	 * Quotation type before change 変更前見積区分.<p>
	 *
	 */
	public void bef_qtn_typ(String value) {
		setConstString(offset + 8, $bef_qtn_typ, value);
	}


	/**
	 * Quotation date 見積日.<p>
	 *
	 */
	public MCDate qtn_dt() {
		return getConstDate(offset + 9, $qtn_dt);
	}

	/**
	 * Quotation date 見積日.<p>
	 *
	 */
	public void qtn_dt(MCDate value) {
		setConstDate(offset + 9, $qtn_dt, value);
	}


	/**
	 * Expiration date 有効期限.<p>
	 *
	 */
	public MCDate valid_dt() {
		return getConstDate(offset + 10, $valid_dt);
	}

	/**
	 * Expiration date 有効期限.<p>
	 *
	 */
	public void valid_dt(MCDate value) {
		setConstDate(offset + 10, $valid_dt, value);
	}


	/**
	 * Quotation immediate issue 見積書即時発行.<p>
	 *
	 */
	public boolean qtn_out_flg() {
		return getConstBoolean(offset + 11, $qtn_out_flg);
	}

	/**
	 * Quotation immediate issue 見積書即時発行.<p>
	 *
	 */
	public void qtn_out_flg(boolean value) {
		setConstBoolean(offset + 11, $qtn_out_flg, value);
	}


	/**
	 * Quotation issued 見積書発行済.<p>
	 *
	 */
	public boolean qtn_prnt_flg() {
		return getConstBoolean(offset + 12, $qtn_prnt_flg);
	}

	/**
	 * Quotation issued 見積書発行済.<p>
	 *
	 */
	public void qtn_prnt_flg(boolean value) {
		setConstBoolean(offset + 12, $qtn_prnt_flg, value);
	}


	/**
	 * Failed order 失注.<p>
	 *
	 */
	public boolean failure_flg() {
		return getConstBoolean(offset + 13, $failure_flg);
	}

	/**
	 * Failed order 失注.<p>
	 *
	 */
	public void failure_flg(boolean value) {
		setConstBoolean(offset + 13, $failure_flg, value);
	}


	/**
	 * Failed order before change 変更前失注.<p>
	 *
	 */
	public boolean bef_failure_flg() {
		return getConstBoolean(offset + 14, $bef_failure_flg);
	}

	/**
	 * Failed order before change 変更前失注.<p>
	 *
	 */
	public void bef_failure_flg(boolean value) {
		setConstBoolean(offset + 14, $bef_failure_flg, value);
	}


	/**
	 * For Approval 承認対象.<p>
	 *
	 */
	public boolean aprv_flg() {
		return getConstBoolean(offset + 15, $aprv_flg);
	}

	/**
	 * For Approval 承認対象.<p>
	 *
	 */
	public void aprv_flg(boolean value) {
		setConstBoolean(offset + 15, $aprv_flg, value);
	}


	/**
	 * Approval withdraw 承認引戻.<p>
	 *
	 */
	public boolean aprv_back_flg() {
		return getConstBoolean(offset + 16, $aprv_back_flg);
	}

	/**
	 * Approval withdraw 承認引戻.<p>
	 *
	 */
	public void aprv_back_flg(boolean value) {
		setConstBoolean(offset + 16, $aprv_back_flg, value);
	}


	/**
	 * Approval No. 承認ＮＯ.<p>
	 *
	 */
	public String aprv_no() {
		return getConstString(offset + 17, $aprv_no);
	}

	/**
	 * Approval No. 承認ＮＯ.<p>
	 *
	 */
	public void aprv_no(String value) {
		setConstString(offset + 17, $aprv_no, value);
	}


	/**
	 * Approval status type 承認状況区分.<p>
	 *
	 */
	public String aprv_sts_typ() {
		return getConstString(offset + 18, $aprv_sts_typ);
	}

	/**
	 * Approval status type 承認状況区分.<p>
	 *
	 */
	public void aprv_sts_typ(String value) {
		setConstString(offset + 18, $aprv_sts_typ, value);
	}


	/**
	 * Approval status type name 承認状況区分名.<p>
	 *
	 */
	public String aprv_sts_typ_nm() {
		return getConstString(offset + 19, $aprv_sts_typ_nm);
	}

	/**
	 * Approval status type name 承認状況区分名.<p>
	 *
	 */
	public void aprv_sts_typ_nm(String value) {
		setConstString(offset + 19, $aprv_sts_typ_nm, value);
	}


	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public String cst_cd() {
		return getConstString(offset + 20, $cst_cd);
	}

	/**
	 * Customer cd. 得意先ＣＤ.<p>
	 *
	 */
	public void cst_cd(String value) {
		setConstString(offset + 20, $cst_cd, value);
	}


	/**
	 * Miscellaneous customer 得意先諸口.<p>
	 *
	 */
	public boolean cst_sundry_flg() {
		return getConstBoolean(offset + 21, $cst_sundry_flg);
	}

	/**
	 * Miscellaneous customer 得意先諸口.<p>
	 *
	 */
	public void cst_sundry_flg(boolean value) {
		setConstBoolean(offset + 21, $cst_sundry_flg, value);
	}


	/**
	 * Customer invoice transaction 得意先インボイス取引.<p>
	 *
	 */
	public boolean cst_iv_flg() {
		return getConstBoolean(offset + 22, $cst_iv_flg);
	}

	/**
	 * Customer invoice transaction 得意先インボイス取引.<p>
	 *
	 */
	public void cst_iv_flg(boolean value) {
		setConstBoolean(offset + 22, $cst_iv_flg, value);
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
	 * Rounding type (Sales amount) 売上金額端数処理区分.<p>
	 *
	 */
	public String sls_amt_rnd_typ() {
		return getConstString(offset + 33, $sls_amt_rnd_typ);
	}

	/**
	 * Rounding type (Sales amount) 売上金額端数処理区分.<p>
	 *
	 */
	public void sls_amt_rnd_typ(String value) {
		setConstString(offset + 33, $sls_amt_rnd_typ, value);
	}


	/**
	 * Sales tax rounding type 売上税端数処理区分.<p>
	 *
	 */
	public String sls_tax_rnd_typ() {
		return getConstString(offset + 34, $sls_tax_rnd_typ);
	}

	/**
	 * Sales tax rounding type 売上税端数処理区分.<p>
	 *
	 */
	public void sls_tax_rnd_typ(String value) {
		setConstString(offset + 34, $sls_tax_rnd_typ, value);
	}


	/**
	 * Sales PIC cd. 売上担当者ＣＤ.<p>
	 *
	 */
	public String sls_usr_cd() {
		return getConstString(offset + 35, $sls_usr_cd);
	}

	/**
	 * Sales PIC cd. 売上担当者ＣＤ.<p>
	 *
	 */
	public void sls_usr_cd(String value) {
		setConstString(offset + 35, $sls_usr_cd, value);
	}


	/**
	 * Sales dept. cd. 売上部門ＣＤ.<p>
	 *
	 */
	public String sls_dpt_cd() {
		return getConstString(offset + 36, $sls_dpt_cd);
	}

	/**
	 * Sales dept. cd. 売上部門ＣＤ.<p>
	 *
	 */
	public void sls_dpt_cd(String value) {
		setConstString(offset + 36, $sls_dpt_cd, value);
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
	 * Quotation terms cd. 見積条件ＣＤ.<p>
	 *
	 */
	public String qtn_term_cd() {
		return getConstString(offset + 38, $qtn_term_cd);
	}

	/**
	 * Quotation terms cd. 見積条件ＣＤ.<p>
	 *
	 */
	public void qtn_term_cd(String value) {
		setConstString(offset + 38, $qtn_term_cd, value);
	}


	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public String trd_cur_cd() {
		return getConstString(offset + 39, $trd_cur_cd);
	}

	/**
	 * Transaction currency cd. 取引通貨ＣＤ.<p>
	 *
	 */
	public void trd_cur_cd(String value) {
		setConstString(offset + 39, $trd_cur_cd, value);
	}


	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public MCNumber amt_dec_place() {
		return getConstNumber(offset + 40, $amt_dec_place);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(MCNumber value) {
		setConstNumber(offset + 40, $amt_dec_place, value);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(int value) {
		setConstNumber(offset + 40, $amt_dec_place, value);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(long value) {
		setConstNumber(offset + 40, $amt_dec_place, value);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(float value) {
		setConstNumber(offset + 40, $amt_dec_place, value);
	}

	/**
	 * Amount number of decimal places 金額小数部有効桁数.<p>
	 *
	 */
	public void amt_dec_place(double value) {
		setConstNumber(offset + 40, $amt_dec_place, value);
	}


	/**
	 * Specify foreign exchange 為替指定.<p>
	 *
	 */
	public boolean xrate_inpt_flg() {
		return getConstBoolean(offset + 41, $xrate_inpt_flg);
	}

	/**
	 * Specify foreign exchange 為替指定.<p>
	 *
	 */
	public void xrate_inpt_flg(boolean value) {
		setConstBoolean(offset + 41, $xrate_inpt_flg, value);
	}


	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public MCNumber xrate() {
		return getConstNumber(offset + 42, $xrate);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(MCNumber value) {
		setConstNumber(offset + 42, $xrate, value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(int value) {
		setConstNumber(offset + 42, $xrate, value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(long value) {
		setConstNumber(offset + 42, $xrate, value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(float value) {
		setConstNumber(offset + 42, $xrate, value);
	}

	/**
	 * Exchange rate 為替レート.<p>
	 *
	 */
	public void xrate(double value) {
		setConstNumber(offset + 42, $xrate, value);
	}


	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public String wrk_no() {
		return getConstString(offset + 43, $wrk_no);
	}

	/**
	 * Sales project No. 案件ＮＯ.<p>
	 *
	 */
	public void wrk_no(String value) {
		setConstString(offset + 43, $wrk_no, value);
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
	 * Transportation method cd. 輸送方法ＣＤ.<p>
	 *
	 */
	public String trnspt_cd() {
		return getConstString(offset + 45, $trnspt_cd);
	}

	/**
	 * Transportation method cd. 輸送方法ＣＤ.<p>
	 *
	 */
	public void trnspt_cd(String value) {
		setConstString(offset + 45, $trnspt_cd, value);
	}


	/**
	 * Transaction terms cd. 1 取引条件ＣＤ１.<p>
	 *
	 */
	public String tterm_cd1() {
		return getConstString(offset + 46, $tterm_cd1);
	}

	/**
	 * Transaction terms cd. 1 取引条件ＣＤ１.<p>
	 *
	 */
	public void tterm_cd1(String value) {
		setConstString(offset + 46, $tterm_cd1, value);
	}


	/**
	 * Transaction terms remarks 1 取引条件備考１.<p>
	 *
	 */
	public String tterm_rmrks1() {
		return getConstString(offset + 47, $tterm_rmrks1);
	}

	/**
	 * Transaction terms remarks 1 取引条件備考１.<p>
	 *
	 */
	public void tterm_rmrks1(String value) {
		setConstString(offset + 47, $tterm_rmrks1, value);
	}


	/**
	 * Transaction terms cd. 2 取引条件ＣＤ２.<p>
	 *
	 */
	public String tterm_cd2() {
		return getConstString(offset + 48, $tterm_cd2);
	}

	/**
	 * Transaction terms cd. 2 取引条件ＣＤ２.<p>
	 *
	 */
	public void tterm_cd2(String value) {
		setConstString(offset + 48, $tterm_cd2, value);
	}


	/**
	 * Transaction terms remarks 2 取引条件備考２.<p>
	 *
	 */
	public String tterm_rmrks2() {
		return getConstString(offset + 49, $tterm_rmrks2);
	}

	/**
	 * Transaction terms remarks 2 取引条件備考２.<p>
	 *
	 */
	public void tterm_rmrks2(String value) {
		setConstString(offset + 49, $tterm_rmrks2, value);
	}


	/**
	 * Transaction terms cd. 3 取引条件ＣＤ３.<p>
	 *
	 */
	public String tterm_cd3() {
		return getConstString(offset + 50, $tterm_cd3);
	}

	/**
	 * Transaction terms cd. 3 取引条件ＣＤ３.<p>
	 *
	 */
	public void tterm_cd3(String value) {
		setConstString(offset + 50, $tterm_cd3, value);
	}


	/**
	 * Transaction terms remarks 3 取引条件備考３.<p>
	 *
	 */
	public String tterm_rmrks3() {
		return getConstString(offset + 51, $tterm_rmrks3);
	}

	/**
	 * Transaction terms remarks 3 取引条件備考３.<p>
	 *
	 */
	public void tterm_rmrks3(String value) {
		setConstString(offset + 51, $tterm_rmrks3, value);
	}


	/**
	 * Receiving date 受付日.<p>
	 *
	 */
	public MCDate rcpt_dt() {
		return getConstDate(offset + 52, $rcpt_dt);
	}

	/**
	 * Receiving date 受付日.<p>
	 *
	 */
	public void rcpt_dt(MCDate value) {
		setConstDate(offset + 52, $rcpt_dt, value);
	}


	/**
	 * Receiving PIC cd. 受付担当者ＣＤ.<p>
	 *
	 */
	public String rcpt_usr_cd() {
		return getConstString(offset + 53, $rcpt_usr_cd);
	}

	/**
	 * Receiving PIC cd. 受付担当者ＣＤ.<p>
	 *
	 */
	public void rcpt_usr_cd(String value) {
		setConstString(offset + 53, $rcpt_usr_cd, value);
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
	 * Quotation result reason cd. 見積結果理由ＣＤ.<p>
	 *
	 */
	public String qtn_rslt_rsn_cd() {
		return getConstString(offset + 56, $qtn_rslt_rsn_cd);
	}

	/**
	 * Quotation result reason cd. 見積結果理由ＣＤ.<p>
	 *
	 */
	public void qtn_rslt_rsn_cd(String value) {
		setConstString(offset + 56, $qtn_rslt_rsn_cd, value);
	}


	/**
	 * Quotation result reason remarks 見積結果理由備考.<p>
	 *
	 */
	public String qtn_rslt_rsn_rmrks() {
		return getConstString(offset + 57, $qtn_rslt_rsn_rmrks);
	}

	/**
	 * Quotation result reason remarks 見積結果理由備考.<p>
	 *
	 */
	public void qtn_rslt_rsn_rmrks(String value) {
		setConstString(offset + 57, $qtn_rslt_rsn_rmrks, value);
	}


	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 58, $sub_char1);
	}

	/**
	 * Spare 1 予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 58, $sub_char1, value);
	}


	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 59, $sub_char2);
	}

	/**
	 * Spare 2 予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 59, $sub_char2, value);
	}


	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 60, $sub_char3);
	}

	/**
	 * Spare 3 予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 60, $sub_char3, value);
	}


	/**
	 * Quotation sequence number 見積書連番.<p>
	 *
	 */
	public MCNumber qtn_prnt_seq() {
		return getConstNumber(offset + 61, $qtn_prnt_seq);
	}

	/**
	 * Quotation sequence number 見積書連番.<p>
	 *
	 */
	public void qtn_prnt_seq(MCNumber value) {
		setConstNumber(offset + 61, $qtn_prnt_seq, value);
	}

	/**
	 * Quotation sequence number 見積書連番.<p>
	 *
	 */
	public void qtn_prnt_seq(int value) {
		setConstNumber(offset + 61, $qtn_prnt_seq, value);
	}

	/**
	 * Quotation sequence number 見積書連番.<p>
	 *
	 */
	public void qtn_prnt_seq(long value) {
		setConstNumber(offset + 61, $qtn_prnt_seq, value);
	}

	/**
	 * Quotation sequence number 見積書連番.<p>
	 *
	 */
	public void qtn_prnt_seq(float value) {
		setConstNumber(offset + 61, $qtn_prnt_seq, value);
	}

	/**
	 * Quotation sequence number 見積書連番.<p>
	 *
	 */
	public void qtn_prnt_seq(double value) {
		setConstNumber(offset + 61, $qtn_prnt_seq, value);
	}


	/**
	 * Quotation update counter 見積更新カウンタ.<p>
	 *
	 */
	public MCNumber qtn_upd_cntr() {
		return getConstNumber(offset + 62, $qtn_upd_cntr);
	}

	/**
	 * Quotation update counter 見積更新カウンタ.<p>
	 *
	 */
	public void qtn_upd_cntr(MCNumber value) {
		setConstNumber(offset + 62, $qtn_upd_cntr, value);
	}

	/**
	 * Quotation update counter 見積更新カウンタ.<p>
	 *
	 */
	public void qtn_upd_cntr(int value) {
		setConstNumber(offset + 62, $qtn_upd_cntr, value);
	}

	/**
	 * Quotation update counter 見積更新カウンタ.<p>
	 *
	 */
	public void qtn_upd_cntr(long value) {
		setConstNumber(offset + 62, $qtn_upd_cntr, value);
	}

	/**
	 * Quotation update counter 見積更新カウンタ.<p>
	 *
	 */
	public void qtn_upd_cntr(float value) {
		setConstNumber(offset + 62, $qtn_upd_cntr, value);
	}

	/**
	 * Quotation update counter 見積更新カウンタ.<p>
	 *
	 */
	public void qtn_upd_cntr(double value) {
		setConstNumber(offset + 62, $qtn_upd_cntr, value);
	}


	/**
	 * Discount unit amount (Transaction currency) 取引通貨仕切金額.<p>
	 *
	 */
	public MCNumber trd_cur_amt() {
		return getConstNumber(offset + 63, $trd_cur_amt);
	}

	/**
	 * Discount unit amount (Transaction currency) 取引通貨仕切金額.<p>
	 *
	 */
	public void trd_cur_amt(MCNumber value) {
		setConstNumber(offset + 63, $trd_cur_amt, value);
	}

	/**
	 * Discount unit amount (Transaction currency) 取引通貨仕切金額.<p>
	 *
	 */
	public void trd_cur_amt(int value) {
		setConstNumber(offset + 63, $trd_cur_amt, value);
	}

	/**
	 * Discount unit amount (Transaction currency) 取引通貨仕切金額.<p>
	 *
	 */
	public void trd_cur_amt(long value) {
		setConstNumber(offset + 63, $trd_cur_amt, value);
	}

	/**
	 * Discount unit amount (Transaction currency) 取引通貨仕切金額.<p>
	 *
	 */
	public void trd_cur_amt(float value) {
		setConstNumber(offset + 63, $trd_cur_amt, value);
	}

	/**
	 * Discount unit amount (Transaction currency) 取引通貨仕切金額.<p>
	 *
	 */
	public void trd_cur_amt(double value) {
		setConstNumber(offset + 63, $trd_cur_amt, value);
	}


	/**
	 * Discount unit tax (Transaction currency) 取引通貨仕切税額.<p>
	 *
	 */
	public MCNumber trd_cur_tax_amt() {
		return getConstNumber(offset + 64, $trd_cur_tax_amt);
	}

	/**
	 * Discount unit tax (Transaction currency) 取引通貨仕切税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(MCNumber value) {
		setConstNumber(offset + 64, $trd_cur_tax_amt, value);
	}

	/**
	 * Discount unit tax (Transaction currency) 取引通貨仕切税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(int value) {
		setConstNumber(offset + 64, $trd_cur_tax_amt, value);
	}

	/**
	 * Discount unit tax (Transaction currency) 取引通貨仕切税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(long value) {
		setConstNumber(offset + 64, $trd_cur_tax_amt, value);
	}

	/**
	 * Discount unit tax (Transaction currency) 取引通貨仕切税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(float value) {
		setConstNumber(offset + 64, $trd_cur_tax_amt, value);
	}

	/**
	 * Discount unit tax (Transaction currency) 取引通貨仕切税額.<p>
	 *
	 */
	public void trd_cur_tax_amt(double value) {
		setConstNumber(offset + 64, $trd_cur_tax_amt, value);
	}


	/**
	 * Error エラー.<p>
	 *
	 */
	public boolean err_flg() {
		return getConstBoolean(offset + 65, $err_flg);
	}

	/**
	 * Error エラー.<p>
	 *
	 */
	public void err_flg(boolean value) {
		setConstBoolean(offset + 65, $err_flg, value);
	}


	public String getString(String name) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			return trd_cd();
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
		if ($bef_qtn_typ.equalsIgnoreCase(name)) {
			return bef_qtn_typ();
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
		if ($sls_dpt_cd.equalsIgnoreCase(name)) {
			return sls_dpt_cd();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($qtn_term_cd.equalsIgnoreCase(name)) {
			return qtn_term_cd();
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			return wrk_no();
		}
		if ($cst_qtn_rqst_no.equalsIgnoreCase(name)) {
			return cst_qtn_rqst_no();
		}
		if ($trnspt_cd.equalsIgnoreCase(name)) {
			return trnspt_cd();
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
		if ($rcpt_usr_cd.equalsIgnoreCase(name)) {
			return rcpt_usr_cd();
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
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($qtn_rev.equalsIgnoreCase(name)) {
			return qtn_rev();
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			return amt_dec_place();
		}
		if ($xrate.equalsIgnoreCase(name)) {
			return xrate();
		}
		if ($qtn_prnt_seq.equalsIgnoreCase(name)) {
			return qtn_prnt_seq();
		}
		if ($qtn_upd_cntr.equalsIgnoreCase(name)) {
			return qtn_upd_cntr();
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			return trd_cur_amt();
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			return trd_cur_tax_amt();
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
		if ($rcpt_dt.equalsIgnoreCase(name)) {
			return rcpt_dt();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($rev_upd_flg.equalsIgnoreCase(name)) {
			return rev_upd_flg();
		}
		if ($qtn_out_flg.equalsIgnoreCase(name)) {
			return qtn_out_flg();
		}
		if ($qtn_prnt_flg.equalsIgnoreCase(name)) {
			return qtn_prnt_flg();
		}
		if ($failure_flg.equalsIgnoreCase(name)) {
			return failure_flg();
		}
		if ($bef_failure_flg.equalsIgnoreCase(name)) {
			return bef_failure_flg();
		}
		if ($aprv_flg.equalsIgnoreCase(name)) {
			return aprv_flg();
		}
		if ($aprv_back_flg.equalsIgnoreCase(name)) {
			return aprv_back_flg();
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
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			return trd_cd();
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
		if ($bef_qtn_typ.equalsIgnoreCase(name)) {
			return bef_qtn_typ();
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
		if ($sls_dpt_cd.equalsIgnoreCase(name)) {
			return sls_dpt_cd();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($qtn_term_cd.equalsIgnoreCase(name)) {
			return qtn_term_cd();
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			return wrk_no();
		}
		if ($cst_qtn_rqst_no.equalsIgnoreCase(name)) {
			return cst_qtn_rqst_no();
		}
		if ($trnspt_cd.equalsIgnoreCase(name)) {
			return trnspt_cd();
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
		if ($rcpt_usr_cd.equalsIgnoreCase(name)) {
			return rcpt_usr_cd();
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
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($qtn_rev.equalsIgnoreCase(name)) {
			return qtn_rev();
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			return amt_dec_place();
		}
		if ($xrate.equalsIgnoreCase(name)) {
			return xrate();
		}
		if ($qtn_prnt_seq.equalsIgnoreCase(name)) {
			return qtn_prnt_seq();
		}
		if ($qtn_upd_cntr.equalsIgnoreCase(name)) {
			return qtn_upd_cntr();
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			return trd_cur_amt();
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			return trd_cur_tax_amt();
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
		if ($rcpt_dt.equalsIgnoreCase(name)) {
			return rcpt_dt();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($rev_upd_flg.equalsIgnoreCase(name)) {
			return rev_upd_flg();
		}
		if ($qtn_out_flg.equalsIgnoreCase(name)) {
			return qtn_out_flg();
		}
		if ($qtn_prnt_flg.equalsIgnoreCase(name)) {
			return qtn_prnt_flg();
		}
		if ($failure_flg.equalsIgnoreCase(name)) {
			return failure_flg();
		}
		if ($bef_failure_flg.equalsIgnoreCase(name)) {
			return bef_failure_flg();
		}
		if ($aprv_flg.equalsIgnoreCase(name)) {
			return aprv_flg();
		}
		if ($aprv_back_flg.equalsIgnoreCase(name)) {
			return aprv_back_flg();
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
		if ($err_flg.equalsIgnoreCase(name)) {
			return err_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
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
		if ($qtn_no.equalsIgnoreCase(name)) {
			qtn_no(value);
			return;
		}
		if ($qtn_typ.equalsIgnoreCase(name)) {
			qtn_typ(value);
			return;
		}
		if ($bef_qtn_typ.equalsIgnoreCase(name)) {
			bef_qtn_typ(value);
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
		if ($sls_dpt_cd.equalsIgnoreCase(name)) {
			sls_dpt_cd(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($qtn_term_cd.equalsIgnoreCase(name)) {
			qtn_term_cd(value);
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
		if ($cst_qtn_rqst_no.equalsIgnoreCase(name)) {
			cst_qtn_rqst_no(value);
			return;
		}
		if ($trnspt_cd.equalsIgnoreCase(name)) {
			trnspt_cd(value);
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
		if ($rcpt_usr_cd.equalsIgnoreCase(name)) {
			rcpt_usr_cd(value);
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
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($qtn_rev.equalsIgnoreCase(name)) {
			qtn_rev(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
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
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($qtn_rev.equalsIgnoreCase(name)) {
			qtn_rev(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
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
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($qtn_rev.equalsIgnoreCase(name)) {
			qtn_rev(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
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
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($qtn_rev.equalsIgnoreCase(name)) {
			qtn_rev(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
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
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($qtn_rev.equalsIgnoreCase(name)) {
			qtn_rev(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
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
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
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
		if ($rcpt_dt.equalsIgnoreCase(name)) {
			rcpt_dt(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($rev_upd_flg.equalsIgnoreCase(name)) {
			rev_upd_flg(value);
			return;
		}
		if ($qtn_out_flg.equalsIgnoreCase(name)) {
			qtn_out_flg(value);
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
		if ($bef_failure_flg.equalsIgnoreCase(name)) {
			bef_failure_flg(value);
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
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
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
		if ($qtn_no.equalsIgnoreCase(name)) {
			qtn_no(value);
			return;
		}
		if ($qtn_typ.equalsIgnoreCase(name)) {
			qtn_typ(value);
			return;
		}
		if ($bef_qtn_typ.equalsIgnoreCase(name)) {
			bef_qtn_typ(value);
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
		if ($sls_dpt_cd.equalsIgnoreCase(name)) {
			sls_dpt_cd(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($qtn_term_cd.equalsIgnoreCase(name)) {
			qtn_term_cd(value);
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
		if ($cst_qtn_rqst_no.equalsIgnoreCase(name)) {
			cst_qtn_rqst_no(value);
			return;
		}
		if ($trnspt_cd.equalsIgnoreCase(name)) {
			trnspt_cd(value);
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
		if ($rcpt_usr_cd.equalsIgnoreCase(name)) {
			rcpt_usr_cd(value);
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
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($qtn_rev.equalsIgnoreCase(name)) {
			qtn_rev(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
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
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($qtn_rev.equalsIgnoreCase(name)) {
			qtn_rev(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
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
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($qtn_rev.equalsIgnoreCase(name)) {
			qtn_rev(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
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
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($qtn_rev.equalsIgnoreCase(name)) {
			qtn_rev(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
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
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($qtn_rev.equalsIgnoreCase(name)) {
			qtn_rev(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
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
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
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
		if ($rcpt_dt.equalsIgnoreCase(name)) {
			rcpt_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($rev_upd_flg.equalsIgnoreCase(name)) {
			rev_upd_flg(value);
			return;
		}
		if ($qtn_out_flg.equalsIgnoreCase(name)) {
			qtn_out_flg(value);
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
		if ($bef_failure_flg.equalsIgnoreCase(name)) {
			bef_failure_flg(value);
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
		if ($err_flg.equalsIgnoreCase(name)) {
			err_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

