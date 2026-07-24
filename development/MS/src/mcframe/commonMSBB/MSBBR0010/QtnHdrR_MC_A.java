package mcframe.commonMSBB.MSBBR0010;

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
 * ブロック"QtnHdr"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class QtnHdrR_MC_A extends MCConstRow {

	/**
	 *  取引ＣＤ.<p>
	 *
	 */
	public static final String $trd_cd = "trd_cd";
	/**
	 *  得意先ＣＤ.<p>
	 *
	 */
	public static final String $cst_cd = "cst_cd";
	/**
	 *  得意先郵便番号.<p>
	 *
	 */
	public static final String $cst_zip_cd = "cst_zip_cd";
	/**
	 *  得意先住所１.<p>
	 *
	 */
	public static final String $cst_addr1 = "cst_addr1";
	/**
	 *  得意先住所２.<p>
	 *
	 */
	public static final String $cst_addr2 = "cst_addr2";
	/**
	 *  得意先住所３.<p>
	 *
	 */
	public static final String $cst_addr3 = "cst_addr3";
	/**
	 *  得意先住所４.<p>
	 *
	 */
	public static final String $cst_addr4 = "cst_addr4";
	/**
	 *  得意先住所１～４.<p>
	 *
	 */
	public static final String $cst_addr = "cst_addr";
	/**
	 *  得意先名.<p>
	 *
	 */
	public static final String $cst_nm = "cst_nm";
	/**
	 *  得意先別名１.<p>
	 *
	 */
	public static final String $cst_alt_nm1 = "cst_alt_nm1";
	/**
	 *  得意先別名２.<p>
	 *
	 */
	public static final String $cst_alt_nm2 = "cst_alt_nm2";
	/**
	 *  得意先別名３.<p>
	 *
	 */
	public static final String $cst_alt_nm3 = "cst_alt_nm3";
	/**
	 *  得意先別名４.<p>
	 *
	 */
	public static final String $cst_alt_nm4 = "cst_alt_nm4";
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
	 *  得意先ＴＥＬ.<p>
	 *
	 */
	public static final String $cst_tel = "cst_tel";
	/**
	 *  得意先ＦＡＸ.<p>
	 *
	 */
	public static final String $cst_fax = "cst_fax";
	/**
	 *  得意先国名.<p>
	 *
	 */
	public static final String $cst_cntry_nm = "cst_cntry_nm";
	/**
	 *  見積書発行日.<p>
	 *
	 */
	public static final String $qtn_prnt_dt = "qtn_prnt_dt";
	/**
	 *  売上部門ＣＤ.<p>
	 *
	 */
	public static final String $sls_dpt_cd = "sls_dpt_cd";
	/**
	 *  売上部門郵便番号.<p>
	 *
	 */
	public static final String $sls_dpt_zip_cd = "sls_dpt_zip_cd";
	/**
	 *  売上部門住所１.<p>
	 *
	 */
	public static final String $sls_dpt_addr1 = "sls_dpt_addr1";
	/**
	 *  売上部門住所２.<p>
	 *
	 */
	public static final String $sls_dpt_addr2 = "sls_dpt_addr2";
	/**
	 *  売上部門住所３.<p>
	 *
	 */
	public static final String $sls_dpt_addr3 = "sls_dpt_addr3";
	/**
	 *  売上部門住所４.<p>
	 *
	 */
	public static final String $sls_dpt_addr4 = "sls_dpt_addr4";
	/**
	 *  売上部門住所１～４.<p>
	 *
	 */
	public static final String $sls_dpt_addr = "sls_dpt_addr";
	/**
	 *  会社名.<p>
	 *
	 */
	public static final String $co_nm = "co_nm";
	/**
	 *  売上部門名.<p>
	 *
	 */
	public static final String $sls_dpt_nm = "sls_dpt_nm";
	/**
	 *  売上担当者.<p>
	 *
	 */
	public static final String $sls_usr_cd = "sls_usr_cd";
	/**
	 *  売上担当者名.<p>
	 *
	 */
	public static final String $sls_usr_nm = "sls_usr_nm";
	/**
	 *  売上部門ＴＥＬ.<p>
	 *
	 */
	public static final String $sls_dpt_tel = "sls_dpt_tel";
	/**
	 *  売上部門ＦＡＸ.<p>
	 *
	 */
	public static final String $sls_dpt_fax = "sls_dpt_fax";
	/**
	 *  売上部門国名.<p>
	 *
	 */
	public static final String $sls_cntry_nm = "sls_cntry_nm";
	/**
	 *  仕切金額合計（税抜）.<p>
	 *
	 */
	public static final String $ttl_trd_cur_amt = "ttl_trd_cur_amt";
	/**
	 *  仕切金額合計（税抜）文字列.<p>
	 *
	 */
	public static final String $s_ttl_trd_cur_amt = "s_ttl_trd_cur_amt";
	/**
	 *  仕切税額合計.<p>
	 *
	 */
	public static final String $ttl_trd_cur_tax_amt = "ttl_trd_cur_tax_amt";
	/**
	 *  仕切税額合計文字列.<p>
	 *
	 */
	public static final String $s_ttl_trd_cur_tax_amt = "s_ttl_trd_cur_tax_amt";
	/**
	 *  取引通貨ＣＤ.<p>
	 *
	 */
	public static final String $trd_cur_cd = "trd_cur_cd";
	/**
	 *  取引通貨名.<p>
	 *
	 */
	public static final String $trd_cur_nm = "trd_cur_nm";
	/**
	 *  見積ＮＯ.<p>
	 *
	 */
	public static final String $qtn_no = "qtn_no";
	/**
	 *  見積改訂番号.<p>
	 *
	 */
	public static final String $qtn_rev = "qtn_rev";
	/**
	 *  案件ＮＯ.<p>
	 *
	 */
	public static final String $wrk_no = "wrk_no";
	/**
	 *  案件名.<p>
	 *
	 */
	public static final String $wrk_nm = "wrk_nm";
	/**
	 *  見積日.<p>
	 *
	 */
	public static final String $qtn_dt = "qtn_dt";
	/**
	 *  有効期限.<p>
	 *
	 */
	public static final String $valid_dt = "valid_dt";
	/**
	 *  予備１.<p>
	 *
	 */
	public static final String $sub_char1 = "sub_char1";
	/**
	 *  予備２.<p>
	 *
	 */
	public static final String $sub_char2 = "sub_char2";
	/**
	 *  予備３.<p>
	 *
	 */
	public static final String $sub_char3 = "sub_char3";
	/**
	 *  輸送方法ＣＤ.<p>
	 *
	 */
	public static final String $trnspt_cd = "trnspt_cd";
	/**
	 *  輸送方法名.<p>
	 *
	 */
	public static final String $trnspt_nm = "trnspt_nm";
	/**
	 *  取引条件ＣＤ１.<p>
	 *
	 */
	public static final String $tterm_cd1 = "tterm_cd1";
	/**
	 *  取引条件ＣＤ２.<p>
	 *
	 */
	public static final String $tterm_cd2 = "tterm_cd2";
	/**
	 *  取引条件ＣＤ３.<p>
	 *
	 */
	public static final String $tterm_cd3 = "tterm_cd3";
	/**
	 *  取引条件名１.<p>
	 *
	 */
	public static final String $tterm_nm1 = "tterm_nm1";
	/**
	 *  取引条件備考１.<p>
	 *
	 */
	public static final String $tterm_rmrks1 = "tterm_rmrks1";
	/**
	 *  取引条件名２.<p>
	 *
	 */
	public static final String $tterm_nm2 = "tterm_nm2";
	/**
	 *  取引条件備考２.<p>
	 *
	 */
	public static final String $tterm_rmrks2 = "tterm_rmrks2";
	/**
	 *  取引条件名３.<p>
	 *
	 */
	public static final String $tterm_nm3 = "tterm_nm3";
	/**
	 *  取引条件備考３.<p>
	 *
	 */
	public static final String $tterm_rmrks3 = "tterm_rmrks3";
	/**
	 *  見積条件.<p>
	 *
	 */
	public static final String $qtn_term_cd = "qtn_term_cd";
	/**
	 *  見積条件名.<p>
	 *
	 */
	public static final String $qtn_term_nm = "qtn_term_nm";
	/**
	 *  見積備考.<p>
	 *
	 */
	public static final String $qtn_rmrks = "qtn_rmrks";


	public static final MCMeta trd_cd_META = createCommonMeta($trd_cd, mcframe.commonMA.meta.MA_META.TRD_CD);
	public static final MCMeta cst_cd_META = createCommonMeta($cst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta cst_zip_cd_META = createCommonMeta($cst_zip_cd, mcframe.commonMA.meta.MA_META.ZIP_CD);
	public static final MCMeta cst_addr1_META = createCommonMeta($cst_addr1, mcframe.commonMA.meta.MA_META.ADDR1);
	public static final MCMeta cst_addr2_META = createCommonMeta($cst_addr2, mcframe.commonMA.meta.MA_META.ADDR2);
	public static final MCMeta cst_addr3_META = createCommonMeta($cst_addr3, mcframe.commonMA.meta.MA_META.ADDR3);
	public static final MCMeta cst_addr4_META = createCommonMeta($cst_addr4, mcframe.commonMA.meta.MA_META.ADDR4);
	public static final MCMeta cst_addr_META = createStringMeta($cst_addr);
	public static final MCMeta cst_nm_META = createCommonMeta($cst_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta cst_alt_nm1_META = createCommonMeta($cst_alt_nm1, mcframe.commonMA.meta.MA_META.BP_ALT_NM1);
	public static final MCMeta cst_alt_nm2_META = createCommonMeta($cst_alt_nm2, mcframe.commonMA.meta.MA_META.BP_ALT_NM2);
	public static final MCMeta cst_alt_nm3_META = createCommonMeta($cst_alt_nm3, mcframe.commonMA.meta.MA_META.BP_ALT_NM3);
	public static final MCMeta cst_alt_nm4_META = createCommonMeta($cst_alt_nm4, mcframe.commonMA.meta.MA_META.BP_ALT_NM4);
	public static final MCMeta cst_cntct_dpt_META = createCommonMeta($cst_cntct_dpt, mcframe.commonMA.meta.MA_META.BP_CNTCT_DPT);
	public static final MCMeta cst_cntct_psn_META = createCommonMeta($cst_cntct_psn, mcframe.commonMA.meta.MA_META.BP_CNTCT_PSN);
	public static final MCMeta cst_cntct_psn_title_META = createCommonMeta($cst_cntct_psn_title, mcframe.commonMA.meta.MA_META.BP_PSN_TITLE);
	public static final MCMeta cst_tel_META = createCommonMeta($cst_tel, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta cst_fax_META = createCommonMeta($cst_fax, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta cst_cntry_nm_META = createCommonMeta($cst_cntry_nm, mcframe.commonMA.meta.MA_META.CNTRY_NM);
	public static final MCMeta qtn_prnt_dt_META = createCommonMeta($qtn_prnt_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta sls_dpt_cd_META = createCommonMeta($sls_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta sls_dpt_zip_cd_META = createCommonMeta($sls_dpt_zip_cd, mcframe.commonMA.meta.MA_META.ZIP_CD);
	public static final MCMeta sls_dpt_addr1_META = createCommonMeta($sls_dpt_addr1, mcframe.commonMA.meta.MA_META.ADDR1);
	public static final MCMeta sls_dpt_addr2_META = createCommonMeta($sls_dpt_addr2, mcframe.commonMA.meta.MA_META.ADDR2);
	public static final MCMeta sls_dpt_addr3_META = createCommonMeta($sls_dpt_addr3, mcframe.commonMA.meta.MA_META.ADDR3);
	public static final MCMeta sls_dpt_addr4_META = createCommonMeta($sls_dpt_addr4, mcframe.commonMA.meta.MA_META.ADDR4);
	public static final MCMeta sls_dpt_addr_META = createStringMeta($sls_dpt_addr);
	public static final MCMeta co_nm_META = createCommonMeta($co_nm, mcframe.commonMA.meta.MA_META.CO_NM);
	public static final MCMeta sls_dpt_nm_META = createCommonMeta($sls_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta sls_usr_cd_META = createCommonMeta($sls_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta sls_usr_nm_META = createCommonMeta($sls_usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta sls_dpt_tel_META = createCommonMeta($sls_dpt_tel, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta sls_dpt_fax_META = createCommonMeta($sls_dpt_fax, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta sls_cntry_nm_META = createCommonMeta($sls_cntry_nm, mcframe.commonMA.meta.MA_META.CNTRY_NM);
	public static final MCMeta ttl_trd_cur_amt_META = createCommonMeta($ttl_trd_cur_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta s_ttl_trd_cur_amt_META = createStringMeta($s_ttl_trd_cur_amt);
	public static final MCMeta ttl_trd_cur_tax_amt_META = createCommonMeta($ttl_trd_cur_tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta s_ttl_trd_cur_tax_amt_META = createStringMeta($s_ttl_trd_cur_tax_amt);
	public static final MCMeta trd_cur_cd_META = createCommonMeta($trd_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta trd_cur_nm_META = createCommonMeta($trd_cur_nm, mcframe.commonMA.meta.MA_META.CUR_NM);
	public static final MCMeta qtn_no_META = createCommonMeta($qtn_no, mcframe.commonMA.meta.MA_META.QTN_NO);
	public static final MCMeta qtn_rev_META = createCommonMeta($qtn_rev, mcframe.commonMA.meta.MA_META.SLIP_REV);
	public static final MCMeta wrk_no_META = createCommonMeta($wrk_no, mcframe.commonMA.meta.MA_META.WRK_NO);
	public static final MCMeta wrk_nm_META = createCommonMeta($wrk_nm, mcframe.commonMA.meta.MA_META.WRK_NM);
	public static final MCMeta qtn_dt_META = createCommonMeta($qtn_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta valid_dt_META = createCommonMeta($valid_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.QTN_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.QTN_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.QTN_SUB_CHAR3);
	public static final MCMeta trnspt_cd_META = createCommonMeta($trnspt_cd, mcframe.commonMA.meta.MA_META.TRNSPT_CD);
	public static final MCMeta trnspt_nm_META = createCommonMeta($trnspt_nm, mcframe.commonMA.meta.MA_META.TRNSPT_NM);
	public static final MCMeta tterm_cd1_META = createCommonMeta($tterm_cd1, mcframe.commonMA.meta.MA_META.TTERM_CD);
	public static final MCMeta tterm_cd2_META = createCommonMeta($tterm_cd2, mcframe.commonMA.meta.MA_META.TTERM_CD);
	public static final MCMeta tterm_cd3_META = createCommonMeta($tterm_cd3, mcframe.commonMA.meta.MA_META.TTERM_CD);
	public static final MCMeta tterm_nm1_META = createCommonMeta($tterm_nm1, mcframe.commonMA.meta.MA_META.TTERM_NM);
	public static final MCMeta tterm_rmrks1_META = createCommonMeta($tterm_rmrks1, mcframe.commonMS.meta.MS_META.TTERM_RMRKS1);
	public static final MCMeta tterm_nm2_META = createCommonMeta($tterm_nm2, mcframe.commonMA.meta.MA_META.TTERM_NM);
	public static final MCMeta tterm_rmrks2_META = createCommonMeta($tterm_rmrks2, mcframe.commonMS.meta.MS_META.TTERM_RMRKS2);
	public static final MCMeta tterm_nm3_META = createCommonMeta($tterm_nm3, mcframe.commonMA.meta.MA_META.TTERM_NM);
	public static final MCMeta tterm_rmrks3_META = createCommonMeta($tterm_rmrks3, mcframe.commonMS.meta.MS_META.TTERM_RMRKS3);
	public static final MCMeta qtn_term_cd_META = createCommonMeta($qtn_term_cd, mcframe.commonMS.meta.MS_META.SLO_RSN_CD);
	public static final MCMeta qtn_term_nm_META = createCommonMeta($qtn_term_nm, mcframe.commonMS.meta.MS_META.SLO_RSN_NM);
	public static final MCMeta qtn_rmrks_META = createCommonMeta($qtn_rmrks, mcframe.commonMS.meta.MS_META.QTN_RMRKS);

	protected static final ConstMetaList<QtnHdrR> constMetas = new ConstMetaList<QtnHdrR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			trd_cd_META,
			cst_cd_META,
			cst_zip_cd_META,
			cst_addr1_META,
			cst_addr2_META,
			cst_addr3_META,
			cst_addr4_META,
			cst_addr_META,
			cst_nm_META,
			cst_alt_nm1_META,
			cst_alt_nm2_META,
			cst_alt_nm3_META,
			cst_alt_nm4_META,
			cst_cntct_dpt_META,
			cst_cntct_psn_META,
			cst_cntct_psn_title_META,
			cst_tel_META,
			cst_fax_META,
			cst_cntry_nm_META,
			qtn_prnt_dt_META,
			sls_dpt_cd_META,
			sls_dpt_zip_cd_META,
			sls_dpt_addr1_META,
			sls_dpt_addr2_META,
			sls_dpt_addr3_META,
			sls_dpt_addr4_META,
			sls_dpt_addr_META,
			co_nm_META,
			sls_dpt_nm_META,
			sls_usr_cd_META,
			sls_usr_nm_META,
			sls_dpt_tel_META,
			sls_dpt_fax_META,
			sls_cntry_nm_META,
			ttl_trd_cur_amt_META,
			s_ttl_trd_cur_amt_META,
			ttl_trd_cur_tax_amt_META,
			s_ttl_trd_cur_tax_amt_META,
			trd_cur_cd_META,
			trd_cur_nm_META,
			qtn_no_META,
			qtn_rev_META,
			wrk_no_META,
			wrk_nm_META,
			qtn_dt_META,
			valid_dt_META,
			sub_char1_META,
			sub_char2_META,
			sub_char3_META,
			trnspt_cd_META,
			trnspt_nm_META,
			tterm_cd1_META,
			tterm_cd2_META,
			tterm_cd3_META,
			tterm_nm1_META,
			tterm_rmrks1_META,
			tterm_nm2_META,
			tterm_rmrks2_META,
			tterm_nm3_META,
			tterm_rmrks3_META,
			qtn_term_cd_META,
			qtn_term_nm_META,
			qtn_rmrks_META
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
	protected QtnHdrR_MC_A(ConstMetaList<? extends QtnHdrR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public QtnHdrR clone() {
		return (QtnHdrR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public QtnHdrR createInstance() {
		return (QtnHdrR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public QtnHdrR getValues(String... names) {
		return (QtnHdrR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 *  取引ＣＤ.<p>
	 *
	 */
	public String trd_cd() {
		return getConstString(offset + 0, $trd_cd);
	}

	/**
	 *  取引ＣＤ.<p>
	 *
	 */
	public void trd_cd(String value) {
		setConstString(offset + 0, $trd_cd, value);
	}


	/**
	 *  得意先ＣＤ.<p>
	 *
	 */
	public String cst_cd() {
		return getConstString(offset + 1, $cst_cd);
	}

	/**
	 *  得意先ＣＤ.<p>
	 *
	 */
	public void cst_cd(String value) {
		setConstString(offset + 1, $cst_cd, value);
	}


	/**
	 *  得意先郵便番号.<p>
	 *
	 */
	public String cst_zip_cd() {
		return getConstString(offset + 2, $cst_zip_cd);
	}

	/**
	 *  得意先郵便番号.<p>
	 *
	 */
	public void cst_zip_cd(String value) {
		setConstString(offset + 2, $cst_zip_cd, value);
	}


	/**
	 *  得意先住所１.<p>
	 *
	 */
	public String cst_addr1() {
		return getConstString(offset + 3, $cst_addr1);
	}

	/**
	 *  得意先住所１.<p>
	 *
	 */
	public void cst_addr1(String value) {
		setConstString(offset + 3, $cst_addr1, value);
	}


	/**
	 *  得意先住所２.<p>
	 *
	 */
	public String cst_addr2() {
		return getConstString(offset + 4, $cst_addr2);
	}

	/**
	 *  得意先住所２.<p>
	 *
	 */
	public void cst_addr2(String value) {
		setConstString(offset + 4, $cst_addr2, value);
	}


	/**
	 *  得意先住所３.<p>
	 *
	 */
	public String cst_addr3() {
		return getConstString(offset + 5, $cst_addr3);
	}

	/**
	 *  得意先住所３.<p>
	 *
	 */
	public void cst_addr3(String value) {
		setConstString(offset + 5, $cst_addr3, value);
	}


	/**
	 *  得意先住所４.<p>
	 *
	 */
	public String cst_addr4() {
		return getConstString(offset + 6, $cst_addr4);
	}

	/**
	 *  得意先住所４.<p>
	 *
	 */
	public void cst_addr4(String value) {
		setConstString(offset + 6, $cst_addr4, value);
	}


	/**
	 *  得意先住所１～４.<p>
	 *
	 */
	public String cst_addr() {
		return getConstString(offset + 7, $cst_addr);
	}

	/**
	 *  得意先住所１～４.<p>
	 *
	 */
	public void cst_addr(String value) {
		setConstString(offset + 7, $cst_addr, value);
	}


	/**
	 *  得意先名.<p>
	 *
	 */
	public String cst_nm() {
		return getConstString(offset + 8, $cst_nm);
	}

	/**
	 *  得意先名.<p>
	 *
	 */
	public void cst_nm(String value) {
		setConstString(offset + 8, $cst_nm, value);
	}


	/**
	 *  得意先別名１.<p>
	 *
	 */
	public String cst_alt_nm1() {
		return getConstString(offset + 9, $cst_alt_nm1);
	}

	/**
	 *  得意先別名１.<p>
	 *
	 */
	public void cst_alt_nm1(String value) {
		setConstString(offset + 9, $cst_alt_nm1, value);
	}


	/**
	 *  得意先別名２.<p>
	 *
	 */
	public String cst_alt_nm2() {
		return getConstString(offset + 10, $cst_alt_nm2);
	}

	/**
	 *  得意先別名２.<p>
	 *
	 */
	public void cst_alt_nm2(String value) {
		setConstString(offset + 10, $cst_alt_nm2, value);
	}


	/**
	 *  得意先別名３.<p>
	 *
	 */
	public String cst_alt_nm3() {
		return getConstString(offset + 11, $cst_alt_nm3);
	}

	/**
	 *  得意先別名３.<p>
	 *
	 */
	public void cst_alt_nm3(String value) {
		setConstString(offset + 11, $cst_alt_nm3, value);
	}


	/**
	 *  得意先別名４.<p>
	 *
	 */
	public String cst_alt_nm4() {
		return getConstString(offset + 12, $cst_alt_nm4);
	}

	/**
	 *  得意先別名４.<p>
	 *
	 */
	public void cst_alt_nm4(String value) {
		setConstString(offset + 12, $cst_alt_nm4, value);
	}


	/**
	 *  得意先部署.<p>
	 *
	 */
	public String cst_cntct_dpt() {
		return getConstString(offset + 13, $cst_cntct_dpt);
	}

	/**
	 *  得意先部署.<p>
	 *
	 */
	public void cst_cntct_dpt(String value) {
		setConstString(offset + 13, $cst_cntct_dpt, value);
	}


	/**
	 *  得意先担当者.<p>
	 *
	 */
	public String cst_cntct_psn() {
		return getConstString(offset + 14, $cst_cntct_psn);
	}

	/**
	 *  得意先担当者.<p>
	 *
	 */
	public void cst_cntct_psn(String value) {
		setConstString(offset + 14, $cst_cntct_psn, value);
	}


	/**
	 *  得意先担当者敬称.<p>
	 *
	 */
	public String cst_cntct_psn_title() {
		return getConstString(offset + 15, $cst_cntct_psn_title);
	}

	/**
	 *  得意先担当者敬称.<p>
	 *
	 */
	public void cst_cntct_psn_title(String value) {
		setConstString(offset + 15, $cst_cntct_psn_title, value);
	}


	/**
	 *  得意先ＴＥＬ.<p>
	 *
	 */
	public String cst_tel() {
		return getConstString(offset + 16, $cst_tel);
	}

	/**
	 *  得意先ＴＥＬ.<p>
	 *
	 */
	public void cst_tel(String value) {
		setConstString(offset + 16, $cst_tel, value);
	}


	/**
	 *  得意先ＦＡＸ.<p>
	 *
	 */
	public String cst_fax() {
		return getConstString(offset + 17, $cst_fax);
	}

	/**
	 *  得意先ＦＡＸ.<p>
	 *
	 */
	public void cst_fax(String value) {
		setConstString(offset + 17, $cst_fax, value);
	}


	/**
	 *  得意先国名.<p>
	 *
	 */
	public String cst_cntry_nm() {
		return getConstString(offset + 18, $cst_cntry_nm);
	}

	/**
	 *  得意先国名.<p>
	 *
	 */
	public void cst_cntry_nm(String value) {
		setConstString(offset + 18, $cst_cntry_nm, value);
	}


	/**
	 *  見積書発行日.<p>
	 *
	 */
	public MCDate qtn_prnt_dt() {
		return getConstDate(offset + 19, $qtn_prnt_dt);
	}

	/**
	 *  見積書発行日.<p>
	 *
	 */
	public void qtn_prnt_dt(MCDate value) {
		setConstDate(offset + 19, $qtn_prnt_dt, value);
	}


	/**
	 *  売上部門ＣＤ.<p>
	 *
	 */
	public String sls_dpt_cd() {
		return getConstString(offset + 20, $sls_dpt_cd);
	}

	/**
	 *  売上部門ＣＤ.<p>
	 *
	 */
	public void sls_dpt_cd(String value) {
		setConstString(offset + 20, $sls_dpt_cd, value);
	}


	/**
	 *  売上部門郵便番号.<p>
	 *
	 */
	public String sls_dpt_zip_cd() {
		return getConstString(offset + 21, $sls_dpt_zip_cd);
	}

	/**
	 *  売上部門郵便番号.<p>
	 *
	 */
	public void sls_dpt_zip_cd(String value) {
		setConstString(offset + 21, $sls_dpt_zip_cd, value);
	}


	/**
	 *  売上部門住所１.<p>
	 *
	 */
	public String sls_dpt_addr1() {
		return getConstString(offset + 22, $sls_dpt_addr1);
	}

	/**
	 *  売上部門住所１.<p>
	 *
	 */
	public void sls_dpt_addr1(String value) {
		setConstString(offset + 22, $sls_dpt_addr1, value);
	}


	/**
	 *  売上部門住所２.<p>
	 *
	 */
	public String sls_dpt_addr2() {
		return getConstString(offset + 23, $sls_dpt_addr2);
	}

	/**
	 *  売上部門住所２.<p>
	 *
	 */
	public void sls_dpt_addr2(String value) {
		setConstString(offset + 23, $sls_dpt_addr2, value);
	}


	/**
	 *  売上部門住所３.<p>
	 *
	 */
	public String sls_dpt_addr3() {
		return getConstString(offset + 24, $sls_dpt_addr3);
	}

	/**
	 *  売上部門住所３.<p>
	 *
	 */
	public void sls_dpt_addr3(String value) {
		setConstString(offset + 24, $sls_dpt_addr3, value);
	}


	/**
	 *  売上部門住所４.<p>
	 *
	 */
	public String sls_dpt_addr4() {
		return getConstString(offset + 25, $sls_dpt_addr4);
	}

	/**
	 *  売上部門住所４.<p>
	 *
	 */
	public void sls_dpt_addr4(String value) {
		setConstString(offset + 25, $sls_dpt_addr4, value);
	}


	/**
	 *  売上部門住所１～４.<p>
	 *
	 */
	public String sls_dpt_addr() {
		return getConstString(offset + 26, $sls_dpt_addr);
	}

	/**
	 *  売上部門住所１～４.<p>
	 *
	 */
	public void sls_dpt_addr(String value) {
		setConstString(offset + 26, $sls_dpt_addr, value);
	}


	/**
	 *  会社名.<p>
	 *
	 */
	public String co_nm() {
		return getConstString(offset + 27, $co_nm);
	}

	/**
	 *  会社名.<p>
	 *
	 */
	public void co_nm(String value) {
		setConstString(offset + 27, $co_nm, value);
	}


	/**
	 *  売上部門名.<p>
	 *
	 */
	public String sls_dpt_nm() {
		return getConstString(offset + 28, $sls_dpt_nm);
	}

	/**
	 *  売上部門名.<p>
	 *
	 */
	public void sls_dpt_nm(String value) {
		setConstString(offset + 28, $sls_dpt_nm, value);
	}


	/**
	 *  売上担当者.<p>
	 *
	 */
	public String sls_usr_cd() {
		return getConstString(offset + 29, $sls_usr_cd);
	}

	/**
	 *  売上担当者.<p>
	 *
	 */
	public void sls_usr_cd(String value) {
		setConstString(offset + 29, $sls_usr_cd, value);
	}


	/**
	 *  売上担当者名.<p>
	 *
	 */
	public String sls_usr_nm() {
		return getConstString(offset + 30, $sls_usr_nm);
	}

	/**
	 *  売上担当者名.<p>
	 *
	 */
	public void sls_usr_nm(String value) {
		setConstString(offset + 30, $sls_usr_nm, value);
	}


	/**
	 *  売上部門ＴＥＬ.<p>
	 *
	 */
	public String sls_dpt_tel() {
		return getConstString(offset + 31, $sls_dpt_tel);
	}

	/**
	 *  売上部門ＴＥＬ.<p>
	 *
	 */
	public void sls_dpt_tel(String value) {
		setConstString(offset + 31, $sls_dpt_tel, value);
	}


	/**
	 *  売上部門ＦＡＸ.<p>
	 *
	 */
	public String sls_dpt_fax() {
		return getConstString(offset + 32, $sls_dpt_fax);
	}

	/**
	 *  売上部門ＦＡＸ.<p>
	 *
	 */
	public void sls_dpt_fax(String value) {
		setConstString(offset + 32, $sls_dpt_fax, value);
	}


	/**
	 *  売上部門国名.<p>
	 *
	 */
	public String sls_cntry_nm() {
		return getConstString(offset + 33, $sls_cntry_nm);
	}

	/**
	 *  売上部門国名.<p>
	 *
	 */
	public void sls_cntry_nm(String value) {
		setConstString(offset + 33, $sls_cntry_nm, value);
	}


	/**
	 *  仕切金額合計（税抜）.<p>
	 *
	 */
	public MCNumber ttl_trd_cur_amt() {
		return getConstNumber(offset + 34, $ttl_trd_cur_amt);
	}

	/**
	 *  仕切金額合計（税抜）.<p>
	 *
	 */
	public void ttl_trd_cur_amt(MCNumber value) {
		setConstNumber(offset + 34, $ttl_trd_cur_amt, value);
	}

	/**
	 *  仕切金額合計（税抜）.<p>
	 *
	 */
	public void ttl_trd_cur_amt(int value) {
		setConstNumber(offset + 34, $ttl_trd_cur_amt, value);
	}

	/**
	 *  仕切金額合計（税抜）.<p>
	 *
	 */
	public void ttl_trd_cur_amt(long value) {
		setConstNumber(offset + 34, $ttl_trd_cur_amt, value);
	}

	/**
	 *  仕切金額合計（税抜）.<p>
	 *
	 */
	public void ttl_trd_cur_amt(float value) {
		setConstNumber(offset + 34, $ttl_trd_cur_amt, value);
	}

	/**
	 *  仕切金額合計（税抜）.<p>
	 *
	 */
	public void ttl_trd_cur_amt(double value) {
		setConstNumber(offset + 34, $ttl_trd_cur_amt, value);
	}


	/**
	 *  仕切金額合計（税抜）文字列.<p>
	 *
	 */
	public String s_ttl_trd_cur_amt() {
		return getConstString(offset + 35, $s_ttl_trd_cur_amt);
	}

	/**
	 *  仕切金額合計（税抜）文字列.<p>
	 *
	 */
	public void s_ttl_trd_cur_amt(String value) {
		setConstString(offset + 35, $s_ttl_trd_cur_amt, value);
	}


	/**
	 *  仕切税額合計.<p>
	 *
	 */
	public MCNumber ttl_trd_cur_tax_amt() {
		return getConstNumber(offset + 36, $ttl_trd_cur_tax_amt);
	}

	/**
	 *  仕切税額合計.<p>
	 *
	 */
	public void ttl_trd_cur_tax_amt(MCNumber value) {
		setConstNumber(offset + 36, $ttl_trd_cur_tax_amt, value);
	}

	/**
	 *  仕切税額合計.<p>
	 *
	 */
	public void ttl_trd_cur_tax_amt(int value) {
		setConstNumber(offset + 36, $ttl_trd_cur_tax_amt, value);
	}

	/**
	 *  仕切税額合計.<p>
	 *
	 */
	public void ttl_trd_cur_tax_amt(long value) {
		setConstNumber(offset + 36, $ttl_trd_cur_tax_amt, value);
	}

	/**
	 *  仕切税額合計.<p>
	 *
	 */
	public void ttl_trd_cur_tax_amt(float value) {
		setConstNumber(offset + 36, $ttl_trd_cur_tax_amt, value);
	}

	/**
	 *  仕切税額合計.<p>
	 *
	 */
	public void ttl_trd_cur_tax_amt(double value) {
		setConstNumber(offset + 36, $ttl_trd_cur_tax_amt, value);
	}


	/**
	 *  仕切税額合計文字列.<p>
	 *
	 */
	public String s_ttl_trd_cur_tax_amt() {
		return getConstString(offset + 37, $s_ttl_trd_cur_tax_amt);
	}

	/**
	 *  仕切税額合計文字列.<p>
	 *
	 */
	public void s_ttl_trd_cur_tax_amt(String value) {
		setConstString(offset + 37, $s_ttl_trd_cur_tax_amt, value);
	}


	/**
	 *  取引通貨ＣＤ.<p>
	 *
	 */
	public String trd_cur_cd() {
		return getConstString(offset + 38, $trd_cur_cd);
	}

	/**
	 *  取引通貨ＣＤ.<p>
	 *
	 */
	public void trd_cur_cd(String value) {
		setConstString(offset + 38, $trd_cur_cd, value);
	}


	/**
	 *  取引通貨名.<p>
	 *
	 */
	public String trd_cur_nm() {
		return getConstString(offset + 39, $trd_cur_nm);
	}

	/**
	 *  取引通貨名.<p>
	 *
	 */
	public void trd_cur_nm(String value) {
		setConstString(offset + 39, $trd_cur_nm, value);
	}


	/**
	 *  見積ＮＯ.<p>
	 *
	 */
	public String qtn_no() {
		return getConstString(offset + 40, $qtn_no);
	}

	/**
	 *  見積ＮＯ.<p>
	 *
	 */
	public void qtn_no(String value) {
		setConstString(offset + 40, $qtn_no, value);
	}


	/**
	 *  見積改訂番号.<p>
	 *
	 */
	public MCNumber qtn_rev() {
		return getConstNumber(offset + 41, $qtn_rev);
	}

	/**
	 *  見積改訂番号.<p>
	 *
	 */
	public void qtn_rev(MCNumber value) {
		setConstNumber(offset + 41, $qtn_rev, value);
	}

	/**
	 *  見積改訂番号.<p>
	 *
	 */
	public void qtn_rev(int value) {
		setConstNumber(offset + 41, $qtn_rev, value);
	}

	/**
	 *  見積改訂番号.<p>
	 *
	 */
	public void qtn_rev(long value) {
		setConstNumber(offset + 41, $qtn_rev, value);
	}

	/**
	 *  見積改訂番号.<p>
	 *
	 */
	public void qtn_rev(float value) {
		setConstNumber(offset + 41, $qtn_rev, value);
	}

	/**
	 *  見積改訂番号.<p>
	 *
	 */
	public void qtn_rev(double value) {
		setConstNumber(offset + 41, $qtn_rev, value);
	}


	/**
	 *  案件ＮＯ.<p>
	 *
	 */
	public String wrk_no() {
		return getConstString(offset + 42, $wrk_no);
	}

	/**
	 *  案件ＮＯ.<p>
	 *
	 */
	public void wrk_no(String value) {
		setConstString(offset + 42, $wrk_no, value);
	}


	/**
	 *  案件名.<p>
	 *
	 */
	public String wrk_nm() {
		return getConstString(offset + 43, $wrk_nm);
	}

	/**
	 *  案件名.<p>
	 *
	 */
	public void wrk_nm(String value) {
		setConstString(offset + 43, $wrk_nm, value);
	}


	/**
	 *  見積日.<p>
	 *
	 */
	public MCDate qtn_dt() {
		return getConstDate(offset + 44, $qtn_dt);
	}

	/**
	 *  見積日.<p>
	 *
	 */
	public void qtn_dt(MCDate value) {
		setConstDate(offset + 44, $qtn_dt, value);
	}


	/**
	 *  有効期限.<p>
	 *
	 */
	public MCDate valid_dt() {
		return getConstDate(offset + 45, $valid_dt);
	}

	/**
	 *  有効期限.<p>
	 *
	 */
	public void valid_dt(MCDate value) {
		setConstDate(offset + 45, $valid_dt, value);
	}


	/**
	 *  予備１.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 46, $sub_char1);
	}

	/**
	 *  予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 46, $sub_char1, value);
	}


	/**
	 *  予備２.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 47, $sub_char2);
	}

	/**
	 *  予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 47, $sub_char2, value);
	}


	/**
	 *  予備３.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 48, $sub_char3);
	}

	/**
	 *  予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 48, $sub_char3, value);
	}


	/**
	 *  輸送方法ＣＤ.<p>
	 *
	 */
	public String trnspt_cd() {
		return getConstString(offset + 49, $trnspt_cd);
	}

	/**
	 *  輸送方法ＣＤ.<p>
	 *
	 */
	public void trnspt_cd(String value) {
		setConstString(offset + 49, $trnspt_cd, value);
	}


	/**
	 *  輸送方法名.<p>
	 *
	 */
	public String trnspt_nm() {
		return getConstString(offset + 50, $trnspt_nm);
	}

	/**
	 *  輸送方法名.<p>
	 *
	 */
	public void trnspt_nm(String value) {
		setConstString(offset + 50, $trnspt_nm, value);
	}


	/**
	 *  取引条件ＣＤ１.<p>
	 *
	 */
	public String tterm_cd1() {
		return getConstString(offset + 51, $tterm_cd1);
	}

	/**
	 *  取引条件ＣＤ１.<p>
	 *
	 */
	public void tterm_cd1(String value) {
		setConstString(offset + 51, $tterm_cd1, value);
	}


	/**
	 *  取引条件ＣＤ２.<p>
	 *
	 */
	public String tterm_cd2() {
		return getConstString(offset + 52, $tterm_cd2);
	}

	/**
	 *  取引条件ＣＤ２.<p>
	 *
	 */
	public void tterm_cd2(String value) {
		setConstString(offset + 52, $tterm_cd2, value);
	}


	/**
	 *  取引条件ＣＤ３.<p>
	 *
	 */
	public String tterm_cd3() {
		return getConstString(offset + 53, $tterm_cd3);
	}

	/**
	 *  取引条件ＣＤ３.<p>
	 *
	 */
	public void tterm_cd3(String value) {
		setConstString(offset + 53, $tterm_cd3, value);
	}


	/**
	 *  取引条件名１.<p>
	 *
	 */
	public String tterm_nm1() {
		return getConstString(offset + 54, $tterm_nm1);
	}

	/**
	 *  取引条件名１.<p>
	 *
	 */
	public void tterm_nm1(String value) {
		setConstString(offset + 54, $tterm_nm1, value);
	}


	/**
	 *  取引条件備考１.<p>
	 *
	 */
	public String tterm_rmrks1() {
		return getConstString(offset + 55, $tterm_rmrks1);
	}

	/**
	 *  取引条件備考１.<p>
	 *
	 */
	public void tterm_rmrks1(String value) {
		setConstString(offset + 55, $tterm_rmrks1, value);
	}


	/**
	 *  取引条件名２.<p>
	 *
	 */
	public String tterm_nm2() {
		return getConstString(offset + 56, $tterm_nm2);
	}

	/**
	 *  取引条件名２.<p>
	 *
	 */
	public void tterm_nm2(String value) {
		setConstString(offset + 56, $tterm_nm2, value);
	}


	/**
	 *  取引条件備考２.<p>
	 *
	 */
	public String tterm_rmrks2() {
		return getConstString(offset + 57, $tterm_rmrks2);
	}

	/**
	 *  取引条件備考２.<p>
	 *
	 */
	public void tterm_rmrks2(String value) {
		setConstString(offset + 57, $tterm_rmrks2, value);
	}


	/**
	 *  取引条件名３.<p>
	 *
	 */
	public String tterm_nm3() {
		return getConstString(offset + 58, $tterm_nm3);
	}

	/**
	 *  取引条件名３.<p>
	 *
	 */
	public void tterm_nm3(String value) {
		setConstString(offset + 58, $tterm_nm3, value);
	}


	/**
	 *  取引条件備考３.<p>
	 *
	 */
	public String tterm_rmrks3() {
		return getConstString(offset + 59, $tterm_rmrks3);
	}

	/**
	 *  取引条件備考３.<p>
	 *
	 */
	public void tterm_rmrks3(String value) {
		setConstString(offset + 59, $tterm_rmrks3, value);
	}


	/**
	 *  見積条件.<p>
	 *
	 */
	public String qtn_term_cd() {
		return getConstString(offset + 60, $qtn_term_cd);
	}

	/**
	 *  見積条件.<p>
	 *
	 */
	public void qtn_term_cd(String value) {
		setConstString(offset + 60, $qtn_term_cd, value);
	}


	/**
	 *  見積条件名.<p>
	 *
	 */
	public String qtn_term_nm() {
		return getConstString(offset + 61, $qtn_term_nm);
	}

	/**
	 *  見積条件名.<p>
	 *
	 */
	public void qtn_term_nm(String value) {
		setConstString(offset + 61, $qtn_term_nm, value);
	}


	/**
	 *  見積備考.<p>
	 *
	 */
	public String qtn_rmrks() {
		return getConstString(offset + 62, $qtn_rmrks);
	}

	/**
	 *  見積備考.<p>
	 *
	 */
	public void qtn_rmrks(String value) {
		setConstString(offset + 62, $qtn_rmrks, value);
	}


	public String getString(String name) {
		if ($trd_cd.equalsIgnoreCase(name)) {
			return trd_cd();
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			return cst_cd();
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
		if ($cst_addr.equalsIgnoreCase(name)) {
			return cst_addr();
		}
		if ($cst_nm.equalsIgnoreCase(name)) {
			return cst_nm();
		}
		if ($cst_alt_nm1.equalsIgnoreCase(name)) {
			return cst_alt_nm1();
		}
		if ($cst_alt_nm2.equalsIgnoreCase(name)) {
			return cst_alt_nm2();
		}
		if ($cst_alt_nm3.equalsIgnoreCase(name)) {
			return cst_alt_nm3();
		}
		if ($cst_alt_nm4.equalsIgnoreCase(name)) {
			return cst_alt_nm4();
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
		if ($cst_tel.equalsIgnoreCase(name)) {
			return cst_tel();
		}
		if ($cst_fax.equalsIgnoreCase(name)) {
			return cst_fax();
		}
		if ($cst_cntry_nm.equalsIgnoreCase(name)) {
			return cst_cntry_nm();
		}
		if ($sls_dpt_cd.equalsIgnoreCase(name)) {
			return sls_dpt_cd();
		}
		if ($sls_dpt_zip_cd.equalsIgnoreCase(name)) {
			return sls_dpt_zip_cd();
		}
		if ($sls_dpt_addr1.equalsIgnoreCase(name)) {
			return sls_dpt_addr1();
		}
		if ($sls_dpt_addr2.equalsIgnoreCase(name)) {
			return sls_dpt_addr2();
		}
		if ($sls_dpt_addr3.equalsIgnoreCase(name)) {
			return sls_dpt_addr3();
		}
		if ($sls_dpt_addr4.equalsIgnoreCase(name)) {
			return sls_dpt_addr4();
		}
		if ($sls_dpt_addr.equalsIgnoreCase(name)) {
			return sls_dpt_addr();
		}
		if ($co_nm.equalsIgnoreCase(name)) {
			return co_nm();
		}
		if ($sls_dpt_nm.equalsIgnoreCase(name)) {
			return sls_dpt_nm();
		}
		if ($sls_usr_cd.equalsIgnoreCase(name)) {
			return sls_usr_cd();
		}
		if ($sls_usr_nm.equalsIgnoreCase(name)) {
			return sls_usr_nm();
		}
		if ($sls_dpt_tel.equalsIgnoreCase(name)) {
			return sls_dpt_tel();
		}
		if ($sls_dpt_fax.equalsIgnoreCase(name)) {
			return sls_dpt_fax();
		}
		if ($sls_cntry_nm.equalsIgnoreCase(name)) {
			return sls_cntry_nm();
		}
		if ($s_ttl_trd_cur_amt.equalsIgnoreCase(name)) {
			return s_ttl_trd_cur_amt();
		}
		if ($s_ttl_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			return s_ttl_trd_cur_tax_amt();
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($trd_cur_nm.equalsIgnoreCase(name)) {
			return trd_cur_nm();
		}
		if ($qtn_no.equalsIgnoreCase(name)) {
			return qtn_no();
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			return wrk_no();
		}
		if ($wrk_nm.equalsIgnoreCase(name)) {
			return wrk_nm();
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
		if ($trnspt_cd.equalsIgnoreCase(name)) {
			return trnspt_cd();
		}
		if ($trnspt_nm.equalsIgnoreCase(name)) {
			return trnspt_nm();
		}
		if ($tterm_cd1.equalsIgnoreCase(name)) {
			return tterm_cd1();
		}
		if ($tterm_cd2.equalsIgnoreCase(name)) {
			return tterm_cd2();
		}
		if ($tterm_cd3.equalsIgnoreCase(name)) {
			return tterm_cd3();
		}
		if ($tterm_nm1.equalsIgnoreCase(name)) {
			return tterm_nm1();
		}
		if ($tterm_rmrks1.equalsIgnoreCase(name)) {
			return tterm_rmrks1();
		}
		if ($tterm_nm2.equalsIgnoreCase(name)) {
			return tterm_nm2();
		}
		if ($tterm_rmrks2.equalsIgnoreCase(name)) {
			return tterm_rmrks2();
		}
		if ($tterm_nm3.equalsIgnoreCase(name)) {
			return tterm_nm3();
		}
		if ($tterm_rmrks3.equalsIgnoreCase(name)) {
			return tterm_rmrks3();
		}
		if ($qtn_term_cd.equalsIgnoreCase(name)) {
			return qtn_term_cd();
		}
		if ($qtn_term_nm.equalsIgnoreCase(name)) {
			return qtn_term_nm();
		}
		if ($qtn_rmrks.equalsIgnoreCase(name)) {
			return qtn_rmrks();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($ttl_trd_cur_amt.equalsIgnoreCase(name)) {
			return ttl_trd_cur_amt();
		}
		if ($ttl_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			return ttl_trd_cur_tax_amt();
		}
		if ($qtn_rev.equalsIgnoreCase(name)) {
			return qtn_rev();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($qtn_prnt_dt.equalsIgnoreCase(name)) {
			return qtn_prnt_dt();
		}
		if ($qtn_dt.equalsIgnoreCase(name)) {
			return qtn_dt();
		}
		if ($valid_dt.equalsIgnoreCase(name)) {
			return valid_dt();
		}
		return super.getDate(name);
	}

	public String getStringNE(String name) {
		if ($trd_cd.equalsIgnoreCase(name)) {
			return trd_cd();
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			return cst_cd();
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
		if ($cst_addr.equalsIgnoreCase(name)) {
			return cst_addr();
		}
		if ($cst_nm.equalsIgnoreCase(name)) {
			return cst_nm();
		}
		if ($cst_alt_nm1.equalsIgnoreCase(name)) {
			return cst_alt_nm1();
		}
		if ($cst_alt_nm2.equalsIgnoreCase(name)) {
			return cst_alt_nm2();
		}
		if ($cst_alt_nm3.equalsIgnoreCase(name)) {
			return cst_alt_nm3();
		}
		if ($cst_alt_nm4.equalsIgnoreCase(name)) {
			return cst_alt_nm4();
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
		if ($cst_tel.equalsIgnoreCase(name)) {
			return cst_tel();
		}
		if ($cst_fax.equalsIgnoreCase(name)) {
			return cst_fax();
		}
		if ($cst_cntry_nm.equalsIgnoreCase(name)) {
			return cst_cntry_nm();
		}
		if ($sls_dpt_cd.equalsIgnoreCase(name)) {
			return sls_dpt_cd();
		}
		if ($sls_dpt_zip_cd.equalsIgnoreCase(name)) {
			return sls_dpt_zip_cd();
		}
		if ($sls_dpt_addr1.equalsIgnoreCase(name)) {
			return sls_dpt_addr1();
		}
		if ($sls_dpt_addr2.equalsIgnoreCase(name)) {
			return sls_dpt_addr2();
		}
		if ($sls_dpt_addr3.equalsIgnoreCase(name)) {
			return sls_dpt_addr3();
		}
		if ($sls_dpt_addr4.equalsIgnoreCase(name)) {
			return sls_dpt_addr4();
		}
		if ($sls_dpt_addr.equalsIgnoreCase(name)) {
			return sls_dpt_addr();
		}
		if ($co_nm.equalsIgnoreCase(name)) {
			return co_nm();
		}
		if ($sls_dpt_nm.equalsIgnoreCase(name)) {
			return sls_dpt_nm();
		}
		if ($sls_usr_cd.equalsIgnoreCase(name)) {
			return sls_usr_cd();
		}
		if ($sls_usr_nm.equalsIgnoreCase(name)) {
			return sls_usr_nm();
		}
		if ($sls_dpt_tel.equalsIgnoreCase(name)) {
			return sls_dpt_tel();
		}
		if ($sls_dpt_fax.equalsIgnoreCase(name)) {
			return sls_dpt_fax();
		}
		if ($sls_cntry_nm.equalsIgnoreCase(name)) {
			return sls_cntry_nm();
		}
		if ($s_ttl_trd_cur_amt.equalsIgnoreCase(name)) {
			return s_ttl_trd_cur_amt();
		}
		if ($s_ttl_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			return s_ttl_trd_cur_tax_amt();
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($trd_cur_nm.equalsIgnoreCase(name)) {
			return trd_cur_nm();
		}
		if ($qtn_no.equalsIgnoreCase(name)) {
			return qtn_no();
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			return wrk_no();
		}
		if ($wrk_nm.equalsIgnoreCase(name)) {
			return wrk_nm();
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
		if ($trnspt_cd.equalsIgnoreCase(name)) {
			return trnspt_cd();
		}
		if ($trnspt_nm.equalsIgnoreCase(name)) {
			return trnspt_nm();
		}
		if ($tterm_cd1.equalsIgnoreCase(name)) {
			return tterm_cd1();
		}
		if ($tterm_cd2.equalsIgnoreCase(name)) {
			return tterm_cd2();
		}
		if ($tterm_cd3.equalsIgnoreCase(name)) {
			return tterm_cd3();
		}
		if ($tterm_nm1.equalsIgnoreCase(name)) {
			return tterm_nm1();
		}
		if ($tterm_rmrks1.equalsIgnoreCase(name)) {
			return tterm_rmrks1();
		}
		if ($tterm_nm2.equalsIgnoreCase(name)) {
			return tterm_nm2();
		}
		if ($tterm_rmrks2.equalsIgnoreCase(name)) {
			return tterm_rmrks2();
		}
		if ($tterm_nm3.equalsIgnoreCase(name)) {
			return tterm_nm3();
		}
		if ($tterm_rmrks3.equalsIgnoreCase(name)) {
			return tterm_rmrks3();
		}
		if ($qtn_term_cd.equalsIgnoreCase(name)) {
			return qtn_term_cd();
		}
		if ($qtn_term_nm.equalsIgnoreCase(name)) {
			return qtn_term_nm();
		}
		if ($qtn_rmrks.equalsIgnoreCase(name)) {
			return qtn_rmrks();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($ttl_trd_cur_amt.equalsIgnoreCase(name)) {
			return ttl_trd_cur_amt();
		}
		if ($ttl_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			return ttl_trd_cur_tax_amt();
		}
		if ($qtn_rev.equalsIgnoreCase(name)) {
			return qtn_rev();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($qtn_prnt_dt.equalsIgnoreCase(name)) {
			return qtn_prnt_dt();
		}
		if ($qtn_dt.equalsIgnoreCase(name)) {
			return qtn_dt();
		}
		if ($valid_dt.equalsIgnoreCase(name)) {
			return valid_dt();
		}
		return super.getDateNE(name);
	}

	public void setString(String name, String value) {
		if ($trd_cd.equalsIgnoreCase(name)) {
			trd_cd(value);
			return;
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			cst_cd(value);
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
		if ($cst_addr.equalsIgnoreCase(name)) {
			cst_addr(value);
			return;
		}
		if ($cst_nm.equalsIgnoreCase(name)) {
			cst_nm(value);
			return;
		}
		if ($cst_alt_nm1.equalsIgnoreCase(name)) {
			cst_alt_nm1(value);
			return;
		}
		if ($cst_alt_nm2.equalsIgnoreCase(name)) {
			cst_alt_nm2(value);
			return;
		}
		if ($cst_alt_nm3.equalsIgnoreCase(name)) {
			cst_alt_nm3(value);
			return;
		}
		if ($cst_alt_nm4.equalsIgnoreCase(name)) {
			cst_alt_nm4(value);
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
		if ($cst_tel.equalsIgnoreCase(name)) {
			cst_tel(value);
			return;
		}
		if ($cst_fax.equalsIgnoreCase(name)) {
			cst_fax(value);
			return;
		}
		if ($cst_cntry_nm.equalsIgnoreCase(name)) {
			cst_cntry_nm(value);
			return;
		}
		if ($sls_dpt_cd.equalsIgnoreCase(name)) {
			sls_dpt_cd(value);
			return;
		}
		if ($sls_dpt_zip_cd.equalsIgnoreCase(name)) {
			sls_dpt_zip_cd(value);
			return;
		}
		if ($sls_dpt_addr1.equalsIgnoreCase(name)) {
			sls_dpt_addr1(value);
			return;
		}
		if ($sls_dpt_addr2.equalsIgnoreCase(name)) {
			sls_dpt_addr2(value);
			return;
		}
		if ($sls_dpt_addr3.equalsIgnoreCase(name)) {
			sls_dpt_addr3(value);
			return;
		}
		if ($sls_dpt_addr4.equalsIgnoreCase(name)) {
			sls_dpt_addr4(value);
			return;
		}
		if ($sls_dpt_addr.equalsIgnoreCase(name)) {
			sls_dpt_addr(value);
			return;
		}
		if ($co_nm.equalsIgnoreCase(name)) {
			co_nm(value);
			return;
		}
		if ($sls_dpt_nm.equalsIgnoreCase(name)) {
			sls_dpt_nm(value);
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
		if ($sls_dpt_tel.equalsIgnoreCase(name)) {
			sls_dpt_tel(value);
			return;
		}
		if ($sls_dpt_fax.equalsIgnoreCase(name)) {
			sls_dpt_fax(value);
			return;
		}
		if ($sls_cntry_nm.equalsIgnoreCase(name)) {
			sls_cntry_nm(value);
			return;
		}
		if ($s_ttl_trd_cur_amt.equalsIgnoreCase(name)) {
			s_ttl_trd_cur_amt(value);
			return;
		}
		if ($s_ttl_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			s_ttl_trd_cur_tax_amt(value);
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
		if ($qtn_no.equalsIgnoreCase(name)) {
			qtn_no(value);
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
		if ($tterm_cd2.equalsIgnoreCase(name)) {
			tterm_cd2(value);
			return;
		}
		if ($tterm_cd3.equalsIgnoreCase(name)) {
			tterm_cd3(value);
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
		if ($tterm_nm2.equalsIgnoreCase(name)) {
			tterm_nm2(value);
			return;
		}
		if ($tterm_rmrks2.equalsIgnoreCase(name)) {
			tterm_rmrks2(value);
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
		if ($qtn_term_cd.equalsIgnoreCase(name)) {
			qtn_term_cd(value);
			return;
		}
		if ($qtn_term_nm.equalsIgnoreCase(name)) {
			qtn_term_nm(value);
			return;
		}
		if ($qtn_rmrks.equalsIgnoreCase(name)) {
			qtn_rmrks(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($ttl_trd_cur_amt.equalsIgnoreCase(name)) {
			ttl_trd_cur_amt(value);
			return;
		}
		if ($ttl_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			ttl_trd_cur_tax_amt(value);
			return;
		}
		if ($qtn_rev.equalsIgnoreCase(name)) {
			qtn_rev(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($ttl_trd_cur_amt.equalsIgnoreCase(name)) {
			ttl_trd_cur_amt(value);
			return;
		}
		if ($ttl_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			ttl_trd_cur_tax_amt(value);
			return;
		}
		if ($qtn_rev.equalsIgnoreCase(name)) {
			qtn_rev(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($ttl_trd_cur_amt.equalsIgnoreCase(name)) {
			ttl_trd_cur_amt(value);
			return;
		}
		if ($ttl_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			ttl_trd_cur_tax_amt(value);
			return;
		}
		if ($qtn_rev.equalsIgnoreCase(name)) {
			qtn_rev(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($ttl_trd_cur_amt.equalsIgnoreCase(name)) {
			ttl_trd_cur_amt(value);
			return;
		}
		if ($ttl_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			ttl_trd_cur_tax_amt(value);
			return;
		}
		if ($qtn_rev.equalsIgnoreCase(name)) {
			qtn_rev(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($ttl_trd_cur_amt.equalsIgnoreCase(name)) {
			ttl_trd_cur_amt(value);
			return;
		}
		if ($ttl_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			ttl_trd_cur_tax_amt(value);
			return;
		}
		if ($qtn_rev.equalsIgnoreCase(name)) {
			qtn_rev(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($qtn_prnt_dt.equalsIgnoreCase(name)) {
			qtn_prnt_dt(value);
			return;
		}
		if ($qtn_dt.equalsIgnoreCase(name)) {
			qtn_dt(value);
			return;
		}
		if ($valid_dt.equalsIgnoreCase(name)) {
			valid_dt(value);
			return;
		}
		super.setDate(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($trd_cd.equalsIgnoreCase(name)) {
			trd_cd(value);
			return;
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			cst_cd(value);
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
		if ($cst_addr.equalsIgnoreCase(name)) {
			cst_addr(value);
			return;
		}
		if ($cst_nm.equalsIgnoreCase(name)) {
			cst_nm(value);
			return;
		}
		if ($cst_alt_nm1.equalsIgnoreCase(name)) {
			cst_alt_nm1(value);
			return;
		}
		if ($cst_alt_nm2.equalsIgnoreCase(name)) {
			cst_alt_nm2(value);
			return;
		}
		if ($cst_alt_nm3.equalsIgnoreCase(name)) {
			cst_alt_nm3(value);
			return;
		}
		if ($cst_alt_nm4.equalsIgnoreCase(name)) {
			cst_alt_nm4(value);
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
		if ($cst_tel.equalsIgnoreCase(name)) {
			cst_tel(value);
			return;
		}
		if ($cst_fax.equalsIgnoreCase(name)) {
			cst_fax(value);
			return;
		}
		if ($cst_cntry_nm.equalsIgnoreCase(name)) {
			cst_cntry_nm(value);
			return;
		}
		if ($sls_dpt_cd.equalsIgnoreCase(name)) {
			sls_dpt_cd(value);
			return;
		}
		if ($sls_dpt_zip_cd.equalsIgnoreCase(name)) {
			sls_dpt_zip_cd(value);
			return;
		}
		if ($sls_dpt_addr1.equalsIgnoreCase(name)) {
			sls_dpt_addr1(value);
			return;
		}
		if ($sls_dpt_addr2.equalsIgnoreCase(name)) {
			sls_dpt_addr2(value);
			return;
		}
		if ($sls_dpt_addr3.equalsIgnoreCase(name)) {
			sls_dpt_addr3(value);
			return;
		}
		if ($sls_dpt_addr4.equalsIgnoreCase(name)) {
			sls_dpt_addr4(value);
			return;
		}
		if ($sls_dpt_addr.equalsIgnoreCase(name)) {
			sls_dpt_addr(value);
			return;
		}
		if ($co_nm.equalsIgnoreCase(name)) {
			co_nm(value);
			return;
		}
		if ($sls_dpt_nm.equalsIgnoreCase(name)) {
			sls_dpt_nm(value);
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
		if ($sls_dpt_tel.equalsIgnoreCase(name)) {
			sls_dpt_tel(value);
			return;
		}
		if ($sls_dpt_fax.equalsIgnoreCase(name)) {
			sls_dpt_fax(value);
			return;
		}
		if ($sls_cntry_nm.equalsIgnoreCase(name)) {
			sls_cntry_nm(value);
			return;
		}
		if ($s_ttl_trd_cur_amt.equalsIgnoreCase(name)) {
			s_ttl_trd_cur_amt(value);
			return;
		}
		if ($s_ttl_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			s_ttl_trd_cur_tax_amt(value);
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
		if ($qtn_no.equalsIgnoreCase(name)) {
			qtn_no(value);
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
		if ($tterm_cd2.equalsIgnoreCase(name)) {
			tterm_cd2(value);
			return;
		}
		if ($tterm_cd3.equalsIgnoreCase(name)) {
			tterm_cd3(value);
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
		if ($tterm_nm2.equalsIgnoreCase(name)) {
			tterm_nm2(value);
			return;
		}
		if ($tterm_rmrks2.equalsIgnoreCase(name)) {
			tterm_rmrks2(value);
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
		if ($qtn_term_cd.equalsIgnoreCase(name)) {
			qtn_term_cd(value);
			return;
		}
		if ($qtn_term_nm.equalsIgnoreCase(name)) {
			qtn_term_nm(value);
			return;
		}
		if ($qtn_rmrks.equalsIgnoreCase(name)) {
			qtn_rmrks(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($ttl_trd_cur_amt.equalsIgnoreCase(name)) {
			ttl_trd_cur_amt(value);
			return;
		}
		if ($ttl_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			ttl_trd_cur_tax_amt(value);
			return;
		}
		if ($qtn_rev.equalsIgnoreCase(name)) {
			qtn_rev(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($ttl_trd_cur_amt.equalsIgnoreCase(name)) {
			ttl_trd_cur_amt(value);
			return;
		}
		if ($ttl_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			ttl_trd_cur_tax_amt(value);
			return;
		}
		if ($qtn_rev.equalsIgnoreCase(name)) {
			qtn_rev(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($ttl_trd_cur_amt.equalsIgnoreCase(name)) {
			ttl_trd_cur_amt(value);
			return;
		}
		if ($ttl_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			ttl_trd_cur_tax_amt(value);
			return;
		}
		if ($qtn_rev.equalsIgnoreCase(name)) {
			qtn_rev(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($ttl_trd_cur_amt.equalsIgnoreCase(name)) {
			ttl_trd_cur_amt(value);
			return;
		}
		if ($ttl_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			ttl_trd_cur_tax_amt(value);
			return;
		}
		if ($qtn_rev.equalsIgnoreCase(name)) {
			qtn_rev(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($ttl_trd_cur_amt.equalsIgnoreCase(name)) {
			ttl_trd_cur_amt(value);
			return;
		}
		if ($ttl_trd_cur_tax_amt.equalsIgnoreCase(name)) {
			ttl_trd_cur_tax_amt(value);
			return;
		}
		if ($qtn_rev.equalsIgnoreCase(name)) {
			qtn_rev(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($qtn_prnt_dt.equalsIgnoreCase(name)) {
			qtn_prnt_dt(value);
			return;
		}
		if ($qtn_dt.equalsIgnoreCase(name)) {
			qtn_dt(value);
			return;
		}
		if ($valid_dt.equalsIgnoreCase(name)) {
			valid_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}



}

