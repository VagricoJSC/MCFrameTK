package mcframe.commonMSBD.MSBDR0060;

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
 * ブロック"PurcRetHdr"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class PurcRetHdrR_MC_A extends MCConstRow {

	/**
	 *  帳票ステータス区分名.<p>
	 *
	 */
	public static final String $rpt_sts_typ_nm = "rpt_sts_typ_nm";
	/**
	 *  帳票ステータス区分.<p>
	 *
	 */
	public static final String $rpt_sts_typ = "rpt_sts_typ";
	/**
	 *  仕入返品実績ＮＯ.<p>
	 *
	 */
	public static final String $purc_ret_act_no = "purc_ret_act_no";
	/**
	 *  仕入返品実績改訂番号.<p>
	 *
	 */
	public static final String $purc_ret_act_rev = "purc_ret_act_rev";
	/**
	 *  発行日時.<p>
	 *
	 */
	public static final String $print_hm = "print_hm";
	/**
	 *  発注先郵便番号.<p>
	 *
	 */
	public static final String $sppl_zip_cd = "sppl_zip_cd";
	/**
	 *  発注先住所１.<p>
	 *
	 */
	public static final String $sppl_addr1 = "sppl_addr1";
	/**
	 *  発注先住所２.<p>
	 *
	 */
	public static final String $sppl_addr2 = "sppl_addr2";
	/**
	 *  発注先住所３.<p>
	 *
	 */
	public static final String $sppl_addr3 = "sppl_addr3";
	/**
	 *  発注先住所４.<p>
	 *
	 */
	public static final String $sppl_addr4 = "sppl_addr4";
	/**
	 *  発注先住所.<p>
	 *
	 */
	public static final String $sppl_addr = "sppl_addr";
	/**
	 *  発注先.<p>
	 *
	 */
	public static final String $sppl_cd = "sppl_cd";
	/**
	 *  発注先名.<p>
	 *
	 */
	public static final String $sppl_nm = "sppl_nm";
	/**
	 *  発注先別名１.<p>
	 *
	 */
	public static final String $sppl_alt_nm1 = "sppl_alt_nm1";
	/**
	 *  発注先別名２.<p>
	 *
	 */
	public static final String $sppl_alt_nm2 = "sppl_alt_nm2";
	/**
	 *  発注先別名３.<p>
	 *
	 */
	public static final String $sppl_alt_nm3 = "sppl_alt_nm3";
	/**
	 *  発注先別名４.<p>
	 *
	 */
	public static final String $sppl_alt_nm4 = "sppl_alt_nm4";
	/**
	 *  発注先部署名.<p>
	 *
	 */
	public static final String $sppl_cntct_dpt = "sppl_cntct_dpt";
	/**
	 *  発注先担当者.<p>
	 *
	 */
	public static final String $sppl_cntct_psn = "sppl_cntct_psn";
	/**
	 *  発注先担当者敬称.<p>
	 *
	 */
	public static final String $sppl_cntct_psn_title = "sppl_cntct_psn_title";
	/**
	 *  ＴＥＬ（発注先）.<p>
	 *
	 */
	public static final String $sppl_tel = "sppl_tel";
	/**
	 *  ＦＡＸ（発注先）.<p>
	 *
	 */
	public static final String $sppl_fax = "sppl_fax";
	/**
	 *  発注先国名.<p>
	 *
	 */
	public static final String $sppl_cntry_nm = "sppl_cntry_nm";
	/**
	 *  会社.<p>
	 *
	 */
	public static final String $co_cd = "co_cd";
	/**
	 *  会社名.<p>
	 *
	 */
	public static final String $co_nm = "co_nm";
	/**
	 *  部門郵便番号.<p>
	 *
	 */
	public static final String $dpt_zip_cd = "dpt_zip_cd";
	/**
	 *  部門住所１.<p>
	 *
	 */
	public static final String $dpt_addr1 = "dpt_addr1";
	/**
	 *  部門住所２.<p>
	 *
	 */
	public static final String $dpt_addr2 = "dpt_addr2";
	/**
	 *  部門住所３.<p>
	 *
	 */
	public static final String $dpt_addr3 = "dpt_addr3";
	/**
	 *  部門住所４.<p>
	 *
	 */
	public static final String $dpt_addr4 = "dpt_addr4";
	/**
	 *  部門住所.<p>
	 *
	 */
	public static final String $dpt_addr = "dpt_addr";
	/**
	 *  部門ＴＥＬ.<p>
	 *
	 */
	public static final String $dpt_tel = "dpt_tel";
	/**
	 *  部門ＦＡＸ.<p>
	 *
	 */
	public static final String $dpt_fax = "dpt_fax";
	/**
	 *  部門国名.<p>
	 *
	 */
	public static final String $dpt_cntry_nm = "dpt_cntry_nm";
	/**
	 *  部門.<p>
	 *
	 */
	public static final String $purc_dpt_cd = "purc_dpt_cd";
	/**
	 *  部門名.<p>
	 *
	 */
	public static final String $purc_dpt_nm = "purc_dpt_nm";
	/**
	 *  担当者.<p>
	 *
	 */
	public static final String $purc_usr_cd = "purc_usr_cd";
	/**
	 *  担当者名.<p>
	 *
	 */
	public static final String $purc_usr_nm = "purc_usr_nm";
	/**
	 *  取引.<p>
	 *
	 */
	public static final String $trd_cd = "trd_cd";
	/**
	 *  仕入返品日.<p>
	 *
	 */
	public static final String $purc_ret_dt = "purc_ret_dt";
	/**
	 *  仕入返品実績予備１.<p>
	 *
	 */
	public static final String $purc_ret_act_sub_char1 = "purc_ret_act_sub_char1";
	/**
	 *  仕入返品実績予備２.<p>
	 *
	 */
	public static final String $purc_ret_act_sub_char2 = "purc_ret_act_sub_char2";
	/**
	 *  仕入返品実績予備３.<p>
	 *
	 */
	public static final String $purc_ret_act_sub_char3 = "purc_ret_act_sub_char3";
	/**
	 *  仕入実績予備１.<p>
	 *
	 */
	public static final String $purc_act_sub_char1 = "purc_act_sub_char1";
	/**
	 *  仕入実績予備２.<p>
	 *
	 */
	public static final String $purc_act_sub_char2 = "purc_act_sub_char2";
	/**
	 *  仕入実績予備３.<p>
	 *
	 */
	public static final String $purc_act_sub_char3 = "purc_act_sub_char3";
	/**
	 *  合計金額.<p>
	 *
	 */
	public static final String $ttl_amt = "ttl_amt";
	/**
	 *  合計金額文字列.<p>
	 *
	 */
	public static final String $s_ttl_amt = "s_ttl_amt";
	/**
	 *  通貨.<p>
	 *
	 */
	public static final String $trd_cur_cd = "trd_cur_cd";
	/**
	 *  通貨名.<p>
	 *
	 */
	public static final String $trd_cur_nm = "trd_cur_nm";
	/**
	 *  合計税額.<p>
	 *
	 */
	public static final String $ttl_tax_amt = "ttl_tax_amt";
	/**
	 *  合計税額文字列.<p>
	 *
	 */
	public static final String $s_ttl_tax_amt = "s_ttl_tax_amt";
	/**
	 *  仕入返品票備考.<p>
	 *
	 */
	public static final String $purc_ret_print_rmrks = "purc_ret_print_rmrks";
	/**
	 *  返品先郵便番号.<p>
	 *
	 */
	public static final String $ret_sppl_zip_cd = "ret_sppl_zip_cd";
	/**
	 *  返品先住所１.<p>
	 *
	 */
	public static final String $ret_sppl_addr1 = "ret_sppl_addr1";
	/**
	 *  返品先住所２.<p>
	 *
	 */
	public static final String $ret_sppl_addr2 = "ret_sppl_addr2";
	/**
	 *  返品先住所３.<p>
	 *
	 */
	public static final String $ret_sppl_addr3 = "ret_sppl_addr3";
	/**
	 *  返品先住所４.<p>
	 *
	 */
	public static final String $ret_sppl_addr4 = "ret_sppl_addr4";
	/**
	 *  返品先住所.<p>
	 *
	 */
	public static final String $ret_sppl_addr = "ret_sppl_addr";
	/**
	 *  返品先名.<p>
	 *
	 */
	public static final String $ret_sppl_nm = "ret_sppl_nm";
	/**
	 *  返品先部署名.<p>
	 *
	 */
	public static final String $ret_sppl_cntct_dpt = "ret_sppl_cntct_dpt";
	/**
	 *  返品先担当者.<p>
	 *
	 */
	public static final String $ret_sppl_cntct_psn = "ret_sppl_cntct_psn";
	/**
	 *  返品先担当者敬称.<p>
	 *
	 */
	public static final String $ret_sppl_cntct_psn_title = "ret_sppl_cntct_psn_title";
	/**
	 *  ＴＥＬ（返品先）.<p>
	 *
	 */
	public static final String $ret_sppl_tel = "ret_sppl_tel";
	/**
	 *  ＦＡＸ（返品先）.<p>
	 *
	 */
	public static final String $ret_sppl_fax = "ret_sppl_fax";
	/**
	 *  返品先国名.<p>
	 *
	 */
	public static final String $ret_cntry_nm = "ret_cntry_nm";


	public static final MCMeta rpt_sts_typ_nm_META = createCommonMeta($rpt_sts_typ_nm, mcframe.commonMA.meta.MA_META.RPT_STS_TYP_NM);
	public static final MCMeta rpt_sts_typ_META = createCommonMeta($rpt_sts_typ, mcframe.commonMA.meta.MA_META.RPT_STS_TYP);
	public static final MCMeta purc_ret_act_no_META = createCommonMeta($purc_ret_act_no, mcframe.commonMA.meta.MA_META.PURC_RET_ACT_NO);
	public static final MCMeta purc_ret_act_rev_META = createCommonMeta($purc_ret_act_rev, mcframe.commonMA.meta.MA_META.SLIP_REV);
	public static final MCMeta print_hm_META = createCommonMeta($print_hm, mcframe.commonMA.meta.MA_META.HM);
	public static final MCMeta sppl_zip_cd_META = createCommonMeta($sppl_zip_cd, mcframe.commonMA.meta.MA_META.ZIP_CD);
	public static final MCMeta sppl_addr1_META = createCommonMeta($sppl_addr1, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta sppl_addr2_META = createCommonMeta($sppl_addr2, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta sppl_addr3_META = createCommonMeta($sppl_addr3, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta sppl_addr4_META = createCommonMeta($sppl_addr4, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta sppl_addr_META = createStringMeta($sppl_addr);
	public static final MCMeta sppl_cd_META = createCommonMeta($sppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta sppl_nm_META = createCommonMeta($sppl_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta sppl_alt_nm1_META = createCommonMeta($sppl_alt_nm1, mcframe.commonMA.meta.MA_META.BP_ALT_NM1);
	public static final MCMeta sppl_alt_nm2_META = createCommonMeta($sppl_alt_nm2, mcframe.commonMA.meta.MA_META.BP_ALT_NM2);
	public static final MCMeta sppl_alt_nm3_META = createCommonMeta($sppl_alt_nm3, mcframe.commonMA.meta.MA_META.BP_ALT_NM3);
	public static final MCMeta sppl_alt_nm4_META = createCommonMeta($sppl_alt_nm4, mcframe.commonMA.meta.MA_META.BP_ALT_NM4);
	public static final MCMeta sppl_cntct_dpt_META = createCommonMeta($sppl_cntct_dpt, mcframe.commonMA.meta.MA_META.BP_CNTCT_DPT);
	public static final MCMeta sppl_cntct_psn_META = createCommonMeta($sppl_cntct_psn, mcframe.commonMA.meta.MA_META.BP_CNTCT_PSN);
	public static final MCMeta sppl_cntct_psn_title_META = createCommonMeta($sppl_cntct_psn_title, mcframe.commonMA.meta.MA_META.BP_PSN_TITLE);
	public static final MCMeta sppl_tel_META = createCommonMeta($sppl_tel, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta sppl_fax_META = createCommonMeta($sppl_fax, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta sppl_cntry_nm_META = createCommonMeta($sppl_cntry_nm, mcframe.commonMA.meta.MA_META.CNTRY_NM);
	public static final MCMeta co_cd_META = createCommonMeta($co_cd, mcframe.commonMA.meta.MA_META.CO_CD);
	public static final MCMeta co_nm_META = createCommonMeta($co_nm, mcframe.commonMA.meta.MA_META.CO_NM);
	public static final MCMeta dpt_zip_cd_META = createCommonMeta($dpt_zip_cd, mcframe.commonMA.meta.MA_META.ZIP_CD);
	public static final MCMeta dpt_addr1_META = createCommonMeta($dpt_addr1, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta dpt_addr2_META = createCommonMeta($dpt_addr2, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta dpt_addr3_META = createCommonMeta($dpt_addr3, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta dpt_addr4_META = createCommonMeta($dpt_addr4, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta dpt_addr_META = createStringMeta($dpt_addr);
	public static final MCMeta dpt_tel_META = createCommonMeta($dpt_tel, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta dpt_fax_META = createCommonMeta($dpt_fax, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta dpt_cntry_nm_META = createCommonMeta($dpt_cntry_nm, mcframe.commonMA.meta.MA_META.CNTRY_NM);
	public static final MCMeta purc_dpt_cd_META = createCommonMeta($purc_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta purc_dpt_nm_META = createCommonMeta($purc_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta purc_usr_cd_META = createCommonMeta($purc_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta purc_usr_nm_META = createCommonMeta($purc_usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta trd_cd_META = createCommonMeta($trd_cd, mcframe.commonMA.meta.MA_META.TRD_CD);
	public static final MCMeta purc_ret_dt_META = createCommonMeta($purc_ret_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta purc_ret_act_sub_char1_META = createCommonMeta($purc_ret_act_sub_char1, mcframe.commonMS.meta.MS_META.PURC_RET_ACT_SUB_CHAR1);
	public static final MCMeta purc_ret_act_sub_char2_META = createCommonMeta($purc_ret_act_sub_char2, mcframe.commonMS.meta.MS_META.PURC_RET_ACT_SUB_CHAR2);
	public static final MCMeta purc_ret_act_sub_char3_META = createCommonMeta($purc_ret_act_sub_char3, mcframe.commonMS.meta.MS_META.PURC_RET_ACT_SUB_CHAR3);
	public static final MCMeta purc_act_sub_char1_META = createCommonMeta($purc_act_sub_char1, mcframe.commonMS.meta.MS_META.PURC_ACT_SUB_CHAR1);
	public static final MCMeta purc_act_sub_char2_META = createCommonMeta($purc_act_sub_char2, mcframe.commonMS.meta.MS_META.PURC_ACT_SUB_CHAR2);
	public static final MCMeta purc_act_sub_char3_META = createCommonMeta($purc_act_sub_char3, mcframe.commonMS.meta.MS_META.PURC_ACT_SUB_CHAR3);
	public static final MCMeta ttl_amt_META = createCommonMeta($ttl_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta s_ttl_amt_META = createStringMeta($s_ttl_amt);
	public static final MCMeta trd_cur_cd_META = createCommonMeta($trd_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta trd_cur_nm_META = createCommonMeta($trd_cur_nm, mcframe.commonMA.meta.MA_META.CUR_NM);
	public static final MCMeta ttl_tax_amt_META = createCommonMeta($ttl_tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta s_ttl_tax_amt_META = createStringMeta($s_ttl_tax_amt);
	public static final MCMeta purc_ret_print_rmrks_META = createCommonMeta($purc_ret_print_rmrks, mcframe.commonMS.meta.MS_META.PURC_RET_PRINT_RMRKS);
	public static final MCMeta ret_sppl_zip_cd_META = createCommonMeta($ret_sppl_zip_cd, mcframe.commonMA.meta.MA_META.ZIP_CD);
	public static final MCMeta ret_sppl_addr1_META = createCommonMeta($ret_sppl_addr1, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta ret_sppl_addr2_META = createCommonMeta($ret_sppl_addr2, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta ret_sppl_addr3_META = createCommonMeta($ret_sppl_addr3, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta ret_sppl_addr4_META = createCommonMeta($ret_sppl_addr4, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta ret_sppl_addr_META = createStringMeta($ret_sppl_addr);
	public static final MCMeta ret_sppl_nm_META = createCommonMeta($ret_sppl_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta ret_sppl_cntct_dpt_META = createCommonMeta($ret_sppl_cntct_dpt, mcframe.commonMA.meta.MA_META.BP_CNTCT_DPT);
	public static final MCMeta ret_sppl_cntct_psn_META = createCommonMeta($ret_sppl_cntct_psn, mcframe.commonMA.meta.MA_META.BP_CNTCT_PSN);
	public static final MCMeta ret_sppl_cntct_psn_title_META = createCommonMeta($ret_sppl_cntct_psn_title, mcframe.commonMA.meta.MA_META.BP_PSN_TITLE);
	public static final MCMeta ret_sppl_tel_META = createCommonMeta($ret_sppl_tel, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta ret_sppl_fax_META = createCommonMeta($ret_sppl_fax, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta ret_cntry_nm_META = createCommonMeta($ret_cntry_nm, mcframe.commonMA.meta.MA_META.CNTRY_NM);

	protected static final ConstMetaList<PurcRetHdrR> constMetas = new ConstMetaList<PurcRetHdrR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			rpt_sts_typ_nm_META,
			rpt_sts_typ_META,
			purc_ret_act_no_META,
			purc_ret_act_rev_META,
			print_hm_META,
			sppl_zip_cd_META,
			sppl_addr1_META,
			sppl_addr2_META,
			sppl_addr3_META,
			sppl_addr4_META,
			sppl_addr_META,
			sppl_cd_META,
			sppl_nm_META,
			sppl_alt_nm1_META,
			sppl_alt_nm2_META,
			sppl_alt_nm3_META,
			sppl_alt_nm4_META,
			sppl_cntct_dpt_META,
			sppl_cntct_psn_META,
			sppl_cntct_psn_title_META,
			sppl_tel_META,
			sppl_fax_META,
			sppl_cntry_nm_META,
			co_cd_META,
			co_nm_META,
			dpt_zip_cd_META,
			dpt_addr1_META,
			dpt_addr2_META,
			dpt_addr3_META,
			dpt_addr4_META,
			dpt_addr_META,
			dpt_tel_META,
			dpt_fax_META,
			dpt_cntry_nm_META,
			purc_dpt_cd_META,
			purc_dpt_nm_META,
			purc_usr_cd_META,
			purc_usr_nm_META,
			trd_cd_META,
			purc_ret_dt_META,
			purc_ret_act_sub_char1_META,
			purc_ret_act_sub_char2_META,
			purc_ret_act_sub_char3_META,
			purc_act_sub_char1_META,
			purc_act_sub_char2_META,
			purc_act_sub_char3_META,
			ttl_amt_META,
			s_ttl_amt_META,
			trd_cur_cd_META,
			trd_cur_nm_META,
			ttl_tax_amt_META,
			s_ttl_tax_amt_META,
			purc_ret_print_rmrks_META,
			ret_sppl_zip_cd_META,
			ret_sppl_addr1_META,
			ret_sppl_addr2_META,
			ret_sppl_addr3_META,
			ret_sppl_addr4_META,
			ret_sppl_addr_META,
			ret_sppl_nm_META,
			ret_sppl_cntct_dpt_META,
			ret_sppl_cntct_psn_META,
			ret_sppl_cntct_psn_title_META,
			ret_sppl_tel_META,
			ret_sppl_fax_META,
			ret_cntry_nm_META
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
	protected PurcRetHdrR_MC_A(ConstMetaList<? extends PurcRetHdrR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public PurcRetHdrR clone() {
		return (PurcRetHdrR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public PurcRetHdrR createInstance() {
		return (PurcRetHdrR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public PurcRetHdrR getValues(String... names) {
		return (PurcRetHdrR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 *  帳票ステータス区分名.<p>
	 *
	 */
	public String rpt_sts_typ_nm() {
		return getConstString(offset + 0, $rpt_sts_typ_nm);
	}

	/**
	 *  帳票ステータス区分名.<p>
	 *
	 */
	public void rpt_sts_typ_nm(String value) {
		setConstString(offset + 0, $rpt_sts_typ_nm, value);
	}


	/**
	 *  帳票ステータス区分.<p>
	 *
	 */
	public String rpt_sts_typ() {
		return getConstString(offset + 1, $rpt_sts_typ);
	}

	/**
	 *  帳票ステータス区分.<p>
	 *
	 */
	public void rpt_sts_typ(String value) {
		setConstString(offset + 1, $rpt_sts_typ, value);
	}


	/**
	 *  仕入返品実績ＮＯ.<p>
	 *
	 */
	public String purc_ret_act_no() {
		return getConstString(offset + 2, $purc_ret_act_no);
	}

	/**
	 *  仕入返品実績ＮＯ.<p>
	 *
	 */
	public void purc_ret_act_no(String value) {
		setConstString(offset + 2, $purc_ret_act_no, value);
	}


	/**
	 *  仕入返品実績改訂番号.<p>
	 *
	 */
	public MCNumber purc_ret_act_rev() {
		return getConstNumber(offset + 3, $purc_ret_act_rev);
	}

	/**
	 *  仕入返品実績改訂番号.<p>
	 *
	 */
	public void purc_ret_act_rev(MCNumber value) {
		setConstNumber(offset + 3, $purc_ret_act_rev, value);
	}

	/**
	 *  仕入返品実績改訂番号.<p>
	 *
	 */
	public void purc_ret_act_rev(int value) {
		setConstNumber(offset + 3, $purc_ret_act_rev, value);
	}

	/**
	 *  仕入返品実績改訂番号.<p>
	 *
	 */
	public void purc_ret_act_rev(long value) {
		setConstNumber(offset + 3, $purc_ret_act_rev, value);
	}

	/**
	 *  仕入返品実績改訂番号.<p>
	 *
	 */
	public void purc_ret_act_rev(float value) {
		setConstNumber(offset + 3, $purc_ret_act_rev, value);
	}

	/**
	 *  仕入返品実績改訂番号.<p>
	 *
	 */
	public void purc_ret_act_rev(double value) {
		setConstNumber(offset + 3, $purc_ret_act_rev, value);
	}


	/**
	 *  発行日時.<p>
	 *
	 */
	public MCDate print_hm() {
		return getConstDate(offset + 4, $print_hm);
	}

	/**
	 *  発行日時.<p>
	 *
	 */
	public void print_hm(MCDate value) {
		setConstDate(offset + 4, $print_hm, value);
	}


	/**
	 *  発注先郵便番号.<p>
	 *
	 */
	public String sppl_zip_cd() {
		return getConstString(offset + 5, $sppl_zip_cd);
	}

	/**
	 *  発注先郵便番号.<p>
	 *
	 */
	public void sppl_zip_cd(String value) {
		setConstString(offset + 5, $sppl_zip_cd, value);
	}


	/**
	 *  発注先住所１.<p>
	 *
	 */
	public String sppl_addr1() {
		return getConstString(offset + 6, $sppl_addr1);
	}

	/**
	 *  発注先住所１.<p>
	 *
	 */
	public void sppl_addr1(String value) {
		setConstString(offset + 6, $sppl_addr1, value);
	}


	/**
	 *  発注先住所２.<p>
	 *
	 */
	public String sppl_addr2() {
		return getConstString(offset + 7, $sppl_addr2);
	}

	/**
	 *  発注先住所２.<p>
	 *
	 */
	public void sppl_addr2(String value) {
		setConstString(offset + 7, $sppl_addr2, value);
	}


	/**
	 *  発注先住所３.<p>
	 *
	 */
	public String sppl_addr3() {
		return getConstString(offset + 8, $sppl_addr3);
	}

	/**
	 *  発注先住所３.<p>
	 *
	 */
	public void sppl_addr3(String value) {
		setConstString(offset + 8, $sppl_addr3, value);
	}


	/**
	 *  発注先住所４.<p>
	 *
	 */
	public String sppl_addr4() {
		return getConstString(offset + 9, $sppl_addr4);
	}

	/**
	 *  発注先住所４.<p>
	 *
	 */
	public void sppl_addr4(String value) {
		setConstString(offset + 9, $sppl_addr4, value);
	}


	/**
	 *  発注先住所.<p>
	 *
	 */
	public String sppl_addr() {
		return getConstString(offset + 10, $sppl_addr);
	}

	/**
	 *  発注先住所.<p>
	 *
	 */
	public void sppl_addr(String value) {
		setConstString(offset + 10, $sppl_addr, value);
	}


	/**
	 *  発注先.<p>
	 *
	 */
	public String sppl_cd() {
		return getConstString(offset + 11, $sppl_cd);
	}

	/**
	 *  発注先.<p>
	 *
	 */
	public void sppl_cd(String value) {
		setConstString(offset + 11, $sppl_cd, value);
	}


	/**
	 *  発注先名.<p>
	 *
	 */
	public String sppl_nm() {
		return getConstString(offset + 12, $sppl_nm);
	}

	/**
	 *  発注先名.<p>
	 *
	 */
	public void sppl_nm(String value) {
		setConstString(offset + 12, $sppl_nm, value);
	}


	/**
	 *  発注先別名１.<p>
	 *
	 */
	public String sppl_alt_nm1() {
		return getConstString(offset + 13, $sppl_alt_nm1);
	}

	/**
	 *  発注先別名１.<p>
	 *
	 */
	public void sppl_alt_nm1(String value) {
		setConstString(offset + 13, $sppl_alt_nm1, value);
	}


	/**
	 *  発注先別名２.<p>
	 *
	 */
	public String sppl_alt_nm2() {
		return getConstString(offset + 14, $sppl_alt_nm2);
	}

	/**
	 *  発注先別名２.<p>
	 *
	 */
	public void sppl_alt_nm2(String value) {
		setConstString(offset + 14, $sppl_alt_nm2, value);
	}


	/**
	 *  発注先別名３.<p>
	 *
	 */
	public String sppl_alt_nm3() {
		return getConstString(offset + 15, $sppl_alt_nm3);
	}

	/**
	 *  発注先別名３.<p>
	 *
	 */
	public void sppl_alt_nm3(String value) {
		setConstString(offset + 15, $sppl_alt_nm3, value);
	}


	/**
	 *  発注先別名４.<p>
	 *
	 */
	public String sppl_alt_nm4() {
		return getConstString(offset + 16, $sppl_alt_nm4);
	}

	/**
	 *  発注先別名４.<p>
	 *
	 */
	public void sppl_alt_nm4(String value) {
		setConstString(offset + 16, $sppl_alt_nm4, value);
	}


	/**
	 *  発注先部署名.<p>
	 *
	 */
	public String sppl_cntct_dpt() {
		return getConstString(offset + 17, $sppl_cntct_dpt);
	}

	/**
	 *  発注先部署名.<p>
	 *
	 */
	public void sppl_cntct_dpt(String value) {
		setConstString(offset + 17, $sppl_cntct_dpt, value);
	}


	/**
	 *  発注先担当者.<p>
	 *
	 */
	public String sppl_cntct_psn() {
		return getConstString(offset + 18, $sppl_cntct_psn);
	}

	/**
	 *  発注先担当者.<p>
	 *
	 */
	public void sppl_cntct_psn(String value) {
		setConstString(offset + 18, $sppl_cntct_psn, value);
	}


	/**
	 *  発注先担当者敬称.<p>
	 *
	 */
	public String sppl_cntct_psn_title() {
		return getConstString(offset + 19, $sppl_cntct_psn_title);
	}

	/**
	 *  発注先担当者敬称.<p>
	 *
	 */
	public void sppl_cntct_psn_title(String value) {
		setConstString(offset + 19, $sppl_cntct_psn_title, value);
	}


	/**
	 *  ＴＥＬ（発注先）.<p>
	 *
	 */
	public String sppl_tel() {
		return getConstString(offset + 20, $sppl_tel);
	}

	/**
	 *  ＴＥＬ（発注先）.<p>
	 *
	 */
	public void sppl_tel(String value) {
		setConstString(offset + 20, $sppl_tel, value);
	}


	/**
	 *  ＦＡＸ（発注先）.<p>
	 *
	 */
	public String sppl_fax() {
		return getConstString(offset + 21, $sppl_fax);
	}

	/**
	 *  ＦＡＸ（発注先）.<p>
	 *
	 */
	public void sppl_fax(String value) {
		setConstString(offset + 21, $sppl_fax, value);
	}


	/**
	 *  発注先国名.<p>
	 *
	 */
	public String sppl_cntry_nm() {
		return getConstString(offset + 22, $sppl_cntry_nm);
	}

	/**
	 *  発注先国名.<p>
	 *
	 */
	public void sppl_cntry_nm(String value) {
		setConstString(offset + 22, $sppl_cntry_nm, value);
	}


	/**
	 *  会社.<p>
	 *
	 */
	public String co_cd() {
		return getConstString(offset + 23, $co_cd);
	}

	/**
	 *  会社.<p>
	 *
	 */
	public void co_cd(String value) {
		setConstString(offset + 23, $co_cd, value);
	}


	/**
	 *  会社名.<p>
	 *
	 */
	public String co_nm() {
		return getConstString(offset + 24, $co_nm);
	}

	/**
	 *  会社名.<p>
	 *
	 */
	public void co_nm(String value) {
		setConstString(offset + 24, $co_nm, value);
	}


	/**
	 *  部門郵便番号.<p>
	 *
	 */
	public String dpt_zip_cd() {
		return getConstString(offset + 25, $dpt_zip_cd);
	}

	/**
	 *  部門郵便番号.<p>
	 *
	 */
	public void dpt_zip_cd(String value) {
		setConstString(offset + 25, $dpt_zip_cd, value);
	}


	/**
	 *  部門住所１.<p>
	 *
	 */
	public String dpt_addr1() {
		return getConstString(offset + 26, $dpt_addr1);
	}

	/**
	 *  部門住所１.<p>
	 *
	 */
	public void dpt_addr1(String value) {
		setConstString(offset + 26, $dpt_addr1, value);
	}


	/**
	 *  部門住所２.<p>
	 *
	 */
	public String dpt_addr2() {
		return getConstString(offset + 27, $dpt_addr2);
	}

	/**
	 *  部門住所２.<p>
	 *
	 */
	public void dpt_addr2(String value) {
		setConstString(offset + 27, $dpt_addr2, value);
	}


	/**
	 *  部門住所３.<p>
	 *
	 */
	public String dpt_addr3() {
		return getConstString(offset + 28, $dpt_addr3);
	}

	/**
	 *  部門住所３.<p>
	 *
	 */
	public void dpt_addr3(String value) {
		setConstString(offset + 28, $dpt_addr3, value);
	}


	/**
	 *  部門住所４.<p>
	 *
	 */
	public String dpt_addr4() {
		return getConstString(offset + 29, $dpt_addr4);
	}

	/**
	 *  部門住所４.<p>
	 *
	 */
	public void dpt_addr4(String value) {
		setConstString(offset + 29, $dpt_addr4, value);
	}


	/**
	 *  部門住所.<p>
	 *
	 */
	public String dpt_addr() {
		return getConstString(offset + 30, $dpt_addr);
	}

	/**
	 *  部門住所.<p>
	 *
	 */
	public void dpt_addr(String value) {
		setConstString(offset + 30, $dpt_addr, value);
	}


	/**
	 *  部門ＴＥＬ.<p>
	 *
	 */
	public String dpt_tel() {
		return getConstString(offset + 31, $dpt_tel);
	}

	/**
	 *  部門ＴＥＬ.<p>
	 *
	 */
	public void dpt_tel(String value) {
		setConstString(offset + 31, $dpt_tel, value);
	}


	/**
	 *  部門ＦＡＸ.<p>
	 *
	 */
	public String dpt_fax() {
		return getConstString(offset + 32, $dpt_fax);
	}

	/**
	 *  部門ＦＡＸ.<p>
	 *
	 */
	public void dpt_fax(String value) {
		setConstString(offset + 32, $dpt_fax, value);
	}


	/**
	 *  部門国名.<p>
	 *
	 */
	public String dpt_cntry_nm() {
		return getConstString(offset + 33, $dpt_cntry_nm);
	}

	/**
	 *  部門国名.<p>
	 *
	 */
	public void dpt_cntry_nm(String value) {
		setConstString(offset + 33, $dpt_cntry_nm, value);
	}


	/**
	 *  部門.<p>
	 *
	 */
	public String purc_dpt_cd() {
		return getConstString(offset + 34, $purc_dpt_cd);
	}

	/**
	 *  部門.<p>
	 *
	 */
	public void purc_dpt_cd(String value) {
		setConstString(offset + 34, $purc_dpt_cd, value);
	}


	/**
	 *  部門名.<p>
	 *
	 */
	public String purc_dpt_nm() {
		return getConstString(offset + 35, $purc_dpt_nm);
	}

	/**
	 *  部門名.<p>
	 *
	 */
	public void purc_dpt_nm(String value) {
		setConstString(offset + 35, $purc_dpt_nm, value);
	}


	/**
	 *  担当者.<p>
	 *
	 */
	public String purc_usr_cd() {
		return getConstString(offset + 36, $purc_usr_cd);
	}

	/**
	 *  担当者.<p>
	 *
	 */
	public void purc_usr_cd(String value) {
		setConstString(offset + 36, $purc_usr_cd, value);
	}


	/**
	 *  担当者名.<p>
	 *
	 */
	public String purc_usr_nm() {
		return getConstString(offset + 37, $purc_usr_nm);
	}

	/**
	 *  担当者名.<p>
	 *
	 */
	public void purc_usr_nm(String value) {
		setConstString(offset + 37, $purc_usr_nm, value);
	}


	/**
	 *  取引.<p>
	 *
	 */
	public String trd_cd() {
		return getConstString(offset + 38, $trd_cd);
	}

	/**
	 *  取引.<p>
	 *
	 */
	public void trd_cd(String value) {
		setConstString(offset + 38, $trd_cd, value);
	}


	/**
	 *  仕入返品日.<p>
	 *
	 */
	public MCDate purc_ret_dt() {
		return getConstDate(offset + 39, $purc_ret_dt);
	}

	/**
	 *  仕入返品日.<p>
	 *
	 */
	public void purc_ret_dt(MCDate value) {
		setConstDate(offset + 39, $purc_ret_dt, value);
	}


	/**
	 *  仕入返品実績予備１.<p>
	 *
	 */
	public String purc_ret_act_sub_char1() {
		return getConstString(offset + 40, $purc_ret_act_sub_char1);
	}

	/**
	 *  仕入返品実績予備１.<p>
	 *
	 */
	public void purc_ret_act_sub_char1(String value) {
		setConstString(offset + 40, $purc_ret_act_sub_char1, value);
	}


	/**
	 *  仕入返品実績予備２.<p>
	 *
	 */
	public String purc_ret_act_sub_char2() {
		return getConstString(offset + 41, $purc_ret_act_sub_char2);
	}

	/**
	 *  仕入返品実績予備２.<p>
	 *
	 */
	public void purc_ret_act_sub_char2(String value) {
		setConstString(offset + 41, $purc_ret_act_sub_char2, value);
	}


	/**
	 *  仕入返品実績予備３.<p>
	 *
	 */
	public String purc_ret_act_sub_char3() {
		return getConstString(offset + 42, $purc_ret_act_sub_char3);
	}

	/**
	 *  仕入返品実績予備３.<p>
	 *
	 */
	public void purc_ret_act_sub_char3(String value) {
		setConstString(offset + 42, $purc_ret_act_sub_char3, value);
	}


	/**
	 *  仕入実績予備１.<p>
	 *
	 */
	public String purc_act_sub_char1() {
		return getConstString(offset + 43, $purc_act_sub_char1);
	}

	/**
	 *  仕入実績予備１.<p>
	 *
	 */
	public void purc_act_sub_char1(String value) {
		setConstString(offset + 43, $purc_act_sub_char1, value);
	}


	/**
	 *  仕入実績予備２.<p>
	 *
	 */
	public String purc_act_sub_char2() {
		return getConstString(offset + 44, $purc_act_sub_char2);
	}

	/**
	 *  仕入実績予備２.<p>
	 *
	 */
	public void purc_act_sub_char2(String value) {
		setConstString(offset + 44, $purc_act_sub_char2, value);
	}


	/**
	 *  仕入実績予備３.<p>
	 *
	 */
	public String purc_act_sub_char3() {
		return getConstString(offset + 45, $purc_act_sub_char3);
	}

	/**
	 *  仕入実績予備３.<p>
	 *
	 */
	public void purc_act_sub_char3(String value) {
		setConstString(offset + 45, $purc_act_sub_char3, value);
	}


	/**
	 *  合計金額.<p>
	 *
	 */
	public MCNumber ttl_amt() {
		return getConstNumber(offset + 46, $ttl_amt);
	}

	/**
	 *  合計金額.<p>
	 *
	 */
	public void ttl_amt(MCNumber value) {
		setConstNumber(offset + 46, $ttl_amt, value);
	}

	/**
	 *  合計金額.<p>
	 *
	 */
	public void ttl_amt(int value) {
		setConstNumber(offset + 46, $ttl_amt, value);
	}

	/**
	 *  合計金額.<p>
	 *
	 */
	public void ttl_amt(long value) {
		setConstNumber(offset + 46, $ttl_amt, value);
	}

	/**
	 *  合計金額.<p>
	 *
	 */
	public void ttl_amt(float value) {
		setConstNumber(offset + 46, $ttl_amt, value);
	}

	/**
	 *  合計金額.<p>
	 *
	 */
	public void ttl_amt(double value) {
		setConstNumber(offset + 46, $ttl_amt, value);
	}


	/**
	 *  合計金額文字列.<p>
	 *
	 */
	public String s_ttl_amt() {
		return getConstString(offset + 47, $s_ttl_amt);
	}

	/**
	 *  合計金額文字列.<p>
	 *
	 */
	public void s_ttl_amt(String value) {
		setConstString(offset + 47, $s_ttl_amt, value);
	}


	/**
	 *  通貨.<p>
	 *
	 */
	public String trd_cur_cd() {
		return getConstString(offset + 48, $trd_cur_cd);
	}

	/**
	 *  通貨.<p>
	 *
	 */
	public void trd_cur_cd(String value) {
		setConstString(offset + 48, $trd_cur_cd, value);
	}


	/**
	 *  通貨名.<p>
	 *
	 */
	public String trd_cur_nm() {
		return getConstString(offset + 49, $trd_cur_nm);
	}

	/**
	 *  通貨名.<p>
	 *
	 */
	public void trd_cur_nm(String value) {
		setConstString(offset + 49, $trd_cur_nm, value);
	}


	/**
	 *  合計税額.<p>
	 *
	 */
	public MCNumber ttl_tax_amt() {
		return getConstNumber(offset + 50, $ttl_tax_amt);
	}

	/**
	 *  合計税額.<p>
	 *
	 */
	public void ttl_tax_amt(MCNumber value) {
		setConstNumber(offset + 50, $ttl_tax_amt, value);
	}

	/**
	 *  合計税額.<p>
	 *
	 */
	public void ttl_tax_amt(int value) {
		setConstNumber(offset + 50, $ttl_tax_amt, value);
	}

	/**
	 *  合計税額.<p>
	 *
	 */
	public void ttl_tax_amt(long value) {
		setConstNumber(offset + 50, $ttl_tax_amt, value);
	}

	/**
	 *  合計税額.<p>
	 *
	 */
	public void ttl_tax_amt(float value) {
		setConstNumber(offset + 50, $ttl_tax_amt, value);
	}

	/**
	 *  合計税額.<p>
	 *
	 */
	public void ttl_tax_amt(double value) {
		setConstNumber(offset + 50, $ttl_tax_amt, value);
	}


	/**
	 *  合計税額文字列.<p>
	 *
	 */
	public String s_ttl_tax_amt() {
		return getConstString(offset + 51, $s_ttl_tax_amt);
	}

	/**
	 *  合計税額文字列.<p>
	 *
	 */
	public void s_ttl_tax_amt(String value) {
		setConstString(offset + 51, $s_ttl_tax_amt, value);
	}


	/**
	 *  仕入返品票備考.<p>
	 *
	 */
	public String purc_ret_print_rmrks() {
		return getConstString(offset + 52, $purc_ret_print_rmrks);
	}

	/**
	 *  仕入返品票備考.<p>
	 *
	 */
	public void purc_ret_print_rmrks(String value) {
		setConstString(offset + 52, $purc_ret_print_rmrks, value);
	}


	/**
	 *  返品先郵便番号.<p>
	 *
	 */
	public String ret_sppl_zip_cd() {
		return getConstString(offset + 53, $ret_sppl_zip_cd);
	}

	/**
	 *  返品先郵便番号.<p>
	 *
	 */
	public void ret_sppl_zip_cd(String value) {
		setConstString(offset + 53, $ret_sppl_zip_cd, value);
	}


	/**
	 *  返品先住所１.<p>
	 *
	 */
	public String ret_sppl_addr1() {
		return getConstString(offset + 54, $ret_sppl_addr1);
	}

	/**
	 *  返品先住所１.<p>
	 *
	 */
	public void ret_sppl_addr1(String value) {
		setConstString(offset + 54, $ret_sppl_addr1, value);
	}


	/**
	 *  返品先住所２.<p>
	 *
	 */
	public String ret_sppl_addr2() {
		return getConstString(offset + 55, $ret_sppl_addr2);
	}

	/**
	 *  返品先住所２.<p>
	 *
	 */
	public void ret_sppl_addr2(String value) {
		setConstString(offset + 55, $ret_sppl_addr2, value);
	}


	/**
	 *  返品先住所３.<p>
	 *
	 */
	public String ret_sppl_addr3() {
		return getConstString(offset + 56, $ret_sppl_addr3);
	}

	/**
	 *  返品先住所３.<p>
	 *
	 */
	public void ret_sppl_addr3(String value) {
		setConstString(offset + 56, $ret_sppl_addr3, value);
	}


	/**
	 *  返品先住所４.<p>
	 *
	 */
	public String ret_sppl_addr4() {
		return getConstString(offset + 57, $ret_sppl_addr4);
	}

	/**
	 *  返品先住所４.<p>
	 *
	 */
	public void ret_sppl_addr4(String value) {
		setConstString(offset + 57, $ret_sppl_addr4, value);
	}


	/**
	 *  返品先住所.<p>
	 *
	 */
	public String ret_sppl_addr() {
		return getConstString(offset + 58, $ret_sppl_addr);
	}

	/**
	 *  返品先住所.<p>
	 *
	 */
	public void ret_sppl_addr(String value) {
		setConstString(offset + 58, $ret_sppl_addr, value);
	}


	/**
	 *  返品先名.<p>
	 *
	 */
	public String ret_sppl_nm() {
		return getConstString(offset + 59, $ret_sppl_nm);
	}

	/**
	 *  返品先名.<p>
	 *
	 */
	public void ret_sppl_nm(String value) {
		setConstString(offset + 59, $ret_sppl_nm, value);
	}


	/**
	 *  返品先部署名.<p>
	 *
	 */
	public String ret_sppl_cntct_dpt() {
		return getConstString(offset + 60, $ret_sppl_cntct_dpt);
	}

	/**
	 *  返品先部署名.<p>
	 *
	 */
	public void ret_sppl_cntct_dpt(String value) {
		setConstString(offset + 60, $ret_sppl_cntct_dpt, value);
	}


	/**
	 *  返品先担当者.<p>
	 *
	 */
	public String ret_sppl_cntct_psn() {
		return getConstString(offset + 61, $ret_sppl_cntct_psn);
	}

	/**
	 *  返品先担当者.<p>
	 *
	 */
	public void ret_sppl_cntct_psn(String value) {
		setConstString(offset + 61, $ret_sppl_cntct_psn, value);
	}


	/**
	 *  返品先担当者敬称.<p>
	 *
	 */
	public String ret_sppl_cntct_psn_title() {
		return getConstString(offset + 62, $ret_sppl_cntct_psn_title);
	}

	/**
	 *  返品先担当者敬称.<p>
	 *
	 */
	public void ret_sppl_cntct_psn_title(String value) {
		setConstString(offset + 62, $ret_sppl_cntct_psn_title, value);
	}


	/**
	 *  ＴＥＬ（返品先）.<p>
	 *
	 */
	public String ret_sppl_tel() {
		return getConstString(offset + 63, $ret_sppl_tel);
	}

	/**
	 *  ＴＥＬ（返品先）.<p>
	 *
	 */
	public void ret_sppl_tel(String value) {
		setConstString(offset + 63, $ret_sppl_tel, value);
	}


	/**
	 *  ＦＡＸ（返品先）.<p>
	 *
	 */
	public String ret_sppl_fax() {
		return getConstString(offset + 64, $ret_sppl_fax);
	}

	/**
	 *  ＦＡＸ（返品先）.<p>
	 *
	 */
	public void ret_sppl_fax(String value) {
		setConstString(offset + 64, $ret_sppl_fax, value);
	}


	/**
	 *  返品先国名.<p>
	 *
	 */
	public String ret_cntry_nm() {
		return getConstString(offset + 65, $ret_cntry_nm);
	}

	/**
	 *  返品先国名.<p>
	 *
	 */
	public void ret_cntry_nm(String value) {
		setConstString(offset + 65, $ret_cntry_nm, value);
	}


	public String getString(String name) {
		if ($rpt_sts_typ_nm.equalsIgnoreCase(name)) {
			return rpt_sts_typ_nm();
		}
		if ($rpt_sts_typ.equalsIgnoreCase(name)) {
			return rpt_sts_typ();
		}
		if ($purc_ret_act_no.equalsIgnoreCase(name)) {
			return purc_ret_act_no();
		}
		if ($sppl_zip_cd.equalsIgnoreCase(name)) {
			return sppl_zip_cd();
		}
		if ($sppl_addr1.equalsIgnoreCase(name)) {
			return sppl_addr1();
		}
		if ($sppl_addr2.equalsIgnoreCase(name)) {
			return sppl_addr2();
		}
		if ($sppl_addr3.equalsIgnoreCase(name)) {
			return sppl_addr3();
		}
		if ($sppl_addr4.equalsIgnoreCase(name)) {
			return sppl_addr4();
		}
		if ($sppl_addr.equalsIgnoreCase(name)) {
			return sppl_addr();
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			return sppl_cd();
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			return sppl_nm();
		}
		if ($sppl_alt_nm1.equalsIgnoreCase(name)) {
			return sppl_alt_nm1();
		}
		if ($sppl_alt_nm2.equalsIgnoreCase(name)) {
			return sppl_alt_nm2();
		}
		if ($sppl_alt_nm3.equalsIgnoreCase(name)) {
			return sppl_alt_nm3();
		}
		if ($sppl_alt_nm4.equalsIgnoreCase(name)) {
			return sppl_alt_nm4();
		}
		if ($sppl_cntct_dpt.equalsIgnoreCase(name)) {
			return sppl_cntct_dpt();
		}
		if ($sppl_cntct_psn.equalsIgnoreCase(name)) {
			return sppl_cntct_psn();
		}
		if ($sppl_cntct_psn_title.equalsIgnoreCase(name)) {
			return sppl_cntct_psn_title();
		}
		if ($sppl_tel.equalsIgnoreCase(name)) {
			return sppl_tel();
		}
		if ($sppl_fax.equalsIgnoreCase(name)) {
			return sppl_fax();
		}
		if ($sppl_cntry_nm.equalsIgnoreCase(name)) {
			return sppl_cntry_nm();
		}
		if ($co_cd.equalsIgnoreCase(name)) {
			return co_cd();
		}
		if ($co_nm.equalsIgnoreCase(name)) {
			return co_nm();
		}
		if ($dpt_zip_cd.equalsIgnoreCase(name)) {
			return dpt_zip_cd();
		}
		if ($dpt_addr1.equalsIgnoreCase(name)) {
			return dpt_addr1();
		}
		if ($dpt_addr2.equalsIgnoreCase(name)) {
			return dpt_addr2();
		}
		if ($dpt_addr3.equalsIgnoreCase(name)) {
			return dpt_addr3();
		}
		if ($dpt_addr4.equalsIgnoreCase(name)) {
			return dpt_addr4();
		}
		if ($dpt_addr.equalsIgnoreCase(name)) {
			return dpt_addr();
		}
		if ($dpt_tel.equalsIgnoreCase(name)) {
			return dpt_tel();
		}
		if ($dpt_fax.equalsIgnoreCase(name)) {
			return dpt_fax();
		}
		if ($dpt_cntry_nm.equalsIgnoreCase(name)) {
			return dpt_cntry_nm();
		}
		if ($purc_dpt_cd.equalsIgnoreCase(name)) {
			return purc_dpt_cd();
		}
		if ($purc_dpt_nm.equalsIgnoreCase(name)) {
			return purc_dpt_nm();
		}
		if ($purc_usr_cd.equalsIgnoreCase(name)) {
			return purc_usr_cd();
		}
		if ($purc_usr_nm.equalsIgnoreCase(name)) {
			return purc_usr_nm();
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			return trd_cd();
		}
		if ($purc_ret_act_sub_char1.equalsIgnoreCase(name)) {
			return purc_ret_act_sub_char1();
		}
		if ($purc_ret_act_sub_char2.equalsIgnoreCase(name)) {
			return purc_ret_act_sub_char2();
		}
		if ($purc_ret_act_sub_char3.equalsIgnoreCase(name)) {
			return purc_ret_act_sub_char3();
		}
		if ($purc_act_sub_char1.equalsIgnoreCase(name)) {
			return purc_act_sub_char1();
		}
		if ($purc_act_sub_char2.equalsIgnoreCase(name)) {
			return purc_act_sub_char2();
		}
		if ($purc_act_sub_char3.equalsIgnoreCase(name)) {
			return purc_act_sub_char3();
		}
		if ($s_ttl_amt.equalsIgnoreCase(name)) {
			return s_ttl_amt();
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($trd_cur_nm.equalsIgnoreCase(name)) {
			return trd_cur_nm();
		}
		if ($s_ttl_tax_amt.equalsIgnoreCase(name)) {
			return s_ttl_tax_amt();
		}
		if ($purc_ret_print_rmrks.equalsIgnoreCase(name)) {
			return purc_ret_print_rmrks();
		}
		if ($ret_sppl_zip_cd.equalsIgnoreCase(name)) {
			return ret_sppl_zip_cd();
		}
		if ($ret_sppl_addr1.equalsIgnoreCase(name)) {
			return ret_sppl_addr1();
		}
		if ($ret_sppl_addr2.equalsIgnoreCase(name)) {
			return ret_sppl_addr2();
		}
		if ($ret_sppl_addr3.equalsIgnoreCase(name)) {
			return ret_sppl_addr3();
		}
		if ($ret_sppl_addr4.equalsIgnoreCase(name)) {
			return ret_sppl_addr4();
		}
		if ($ret_sppl_addr.equalsIgnoreCase(name)) {
			return ret_sppl_addr();
		}
		if ($ret_sppl_nm.equalsIgnoreCase(name)) {
			return ret_sppl_nm();
		}
		if ($ret_sppl_cntct_dpt.equalsIgnoreCase(name)) {
			return ret_sppl_cntct_dpt();
		}
		if ($ret_sppl_cntct_psn.equalsIgnoreCase(name)) {
			return ret_sppl_cntct_psn();
		}
		if ($ret_sppl_cntct_psn_title.equalsIgnoreCase(name)) {
			return ret_sppl_cntct_psn_title();
		}
		if ($ret_sppl_tel.equalsIgnoreCase(name)) {
			return ret_sppl_tel();
		}
		if ($ret_sppl_fax.equalsIgnoreCase(name)) {
			return ret_sppl_fax();
		}
		if ($ret_cntry_nm.equalsIgnoreCase(name)) {
			return ret_cntry_nm();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($purc_ret_act_rev.equalsIgnoreCase(name)) {
			return purc_ret_act_rev();
		}
		if ($ttl_amt.equalsIgnoreCase(name)) {
			return ttl_amt();
		}
		if ($ttl_tax_amt.equalsIgnoreCase(name)) {
			return ttl_tax_amt();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($print_hm.equalsIgnoreCase(name)) {
			return print_hm();
		}
		if ($purc_ret_dt.equalsIgnoreCase(name)) {
			return purc_ret_dt();
		}
		return super.getDate(name);
	}

	public String getStringNE(String name) {
		if ($rpt_sts_typ_nm.equalsIgnoreCase(name)) {
			return rpt_sts_typ_nm();
		}
		if ($rpt_sts_typ.equalsIgnoreCase(name)) {
			return rpt_sts_typ();
		}
		if ($purc_ret_act_no.equalsIgnoreCase(name)) {
			return purc_ret_act_no();
		}
		if ($sppl_zip_cd.equalsIgnoreCase(name)) {
			return sppl_zip_cd();
		}
		if ($sppl_addr1.equalsIgnoreCase(name)) {
			return sppl_addr1();
		}
		if ($sppl_addr2.equalsIgnoreCase(name)) {
			return sppl_addr2();
		}
		if ($sppl_addr3.equalsIgnoreCase(name)) {
			return sppl_addr3();
		}
		if ($sppl_addr4.equalsIgnoreCase(name)) {
			return sppl_addr4();
		}
		if ($sppl_addr.equalsIgnoreCase(name)) {
			return sppl_addr();
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			return sppl_cd();
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			return sppl_nm();
		}
		if ($sppl_alt_nm1.equalsIgnoreCase(name)) {
			return sppl_alt_nm1();
		}
		if ($sppl_alt_nm2.equalsIgnoreCase(name)) {
			return sppl_alt_nm2();
		}
		if ($sppl_alt_nm3.equalsIgnoreCase(name)) {
			return sppl_alt_nm3();
		}
		if ($sppl_alt_nm4.equalsIgnoreCase(name)) {
			return sppl_alt_nm4();
		}
		if ($sppl_cntct_dpt.equalsIgnoreCase(name)) {
			return sppl_cntct_dpt();
		}
		if ($sppl_cntct_psn.equalsIgnoreCase(name)) {
			return sppl_cntct_psn();
		}
		if ($sppl_cntct_psn_title.equalsIgnoreCase(name)) {
			return sppl_cntct_psn_title();
		}
		if ($sppl_tel.equalsIgnoreCase(name)) {
			return sppl_tel();
		}
		if ($sppl_fax.equalsIgnoreCase(name)) {
			return sppl_fax();
		}
		if ($sppl_cntry_nm.equalsIgnoreCase(name)) {
			return sppl_cntry_nm();
		}
		if ($co_cd.equalsIgnoreCase(name)) {
			return co_cd();
		}
		if ($co_nm.equalsIgnoreCase(name)) {
			return co_nm();
		}
		if ($dpt_zip_cd.equalsIgnoreCase(name)) {
			return dpt_zip_cd();
		}
		if ($dpt_addr1.equalsIgnoreCase(name)) {
			return dpt_addr1();
		}
		if ($dpt_addr2.equalsIgnoreCase(name)) {
			return dpt_addr2();
		}
		if ($dpt_addr3.equalsIgnoreCase(name)) {
			return dpt_addr3();
		}
		if ($dpt_addr4.equalsIgnoreCase(name)) {
			return dpt_addr4();
		}
		if ($dpt_addr.equalsIgnoreCase(name)) {
			return dpt_addr();
		}
		if ($dpt_tel.equalsIgnoreCase(name)) {
			return dpt_tel();
		}
		if ($dpt_fax.equalsIgnoreCase(name)) {
			return dpt_fax();
		}
		if ($dpt_cntry_nm.equalsIgnoreCase(name)) {
			return dpt_cntry_nm();
		}
		if ($purc_dpt_cd.equalsIgnoreCase(name)) {
			return purc_dpt_cd();
		}
		if ($purc_dpt_nm.equalsIgnoreCase(name)) {
			return purc_dpt_nm();
		}
		if ($purc_usr_cd.equalsIgnoreCase(name)) {
			return purc_usr_cd();
		}
		if ($purc_usr_nm.equalsIgnoreCase(name)) {
			return purc_usr_nm();
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			return trd_cd();
		}
		if ($purc_ret_act_sub_char1.equalsIgnoreCase(name)) {
			return purc_ret_act_sub_char1();
		}
		if ($purc_ret_act_sub_char2.equalsIgnoreCase(name)) {
			return purc_ret_act_sub_char2();
		}
		if ($purc_ret_act_sub_char3.equalsIgnoreCase(name)) {
			return purc_ret_act_sub_char3();
		}
		if ($purc_act_sub_char1.equalsIgnoreCase(name)) {
			return purc_act_sub_char1();
		}
		if ($purc_act_sub_char2.equalsIgnoreCase(name)) {
			return purc_act_sub_char2();
		}
		if ($purc_act_sub_char3.equalsIgnoreCase(name)) {
			return purc_act_sub_char3();
		}
		if ($s_ttl_amt.equalsIgnoreCase(name)) {
			return s_ttl_amt();
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($trd_cur_nm.equalsIgnoreCase(name)) {
			return trd_cur_nm();
		}
		if ($s_ttl_tax_amt.equalsIgnoreCase(name)) {
			return s_ttl_tax_amt();
		}
		if ($purc_ret_print_rmrks.equalsIgnoreCase(name)) {
			return purc_ret_print_rmrks();
		}
		if ($ret_sppl_zip_cd.equalsIgnoreCase(name)) {
			return ret_sppl_zip_cd();
		}
		if ($ret_sppl_addr1.equalsIgnoreCase(name)) {
			return ret_sppl_addr1();
		}
		if ($ret_sppl_addr2.equalsIgnoreCase(name)) {
			return ret_sppl_addr2();
		}
		if ($ret_sppl_addr3.equalsIgnoreCase(name)) {
			return ret_sppl_addr3();
		}
		if ($ret_sppl_addr4.equalsIgnoreCase(name)) {
			return ret_sppl_addr4();
		}
		if ($ret_sppl_addr.equalsIgnoreCase(name)) {
			return ret_sppl_addr();
		}
		if ($ret_sppl_nm.equalsIgnoreCase(name)) {
			return ret_sppl_nm();
		}
		if ($ret_sppl_cntct_dpt.equalsIgnoreCase(name)) {
			return ret_sppl_cntct_dpt();
		}
		if ($ret_sppl_cntct_psn.equalsIgnoreCase(name)) {
			return ret_sppl_cntct_psn();
		}
		if ($ret_sppl_cntct_psn_title.equalsIgnoreCase(name)) {
			return ret_sppl_cntct_psn_title();
		}
		if ($ret_sppl_tel.equalsIgnoreCase(name)) {
			return ret_sppl_tel();
		}
		if ($ret_sppl_fax.equalsIgnoreCase(name)) {
			return ret_sppl_fax();
		}
		if ($ret_cntry_nm.equalsIgnoreCase(name)) {
			return ret_cntry_nm();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($purc_ret_act_rev.equalsIgnoreCase(name)) {
			return purc_ret_act_rev();
		}
		if ($ttl_amt.equalsIgnoreCase(name)) {
			return ttl_amt();
		}
		if ($ttl_tax_amt.equalsIgnoreCase(name)) {
			return ttl_tax_amt();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($print_hm.equalsIgnoreCase(name)) {
			return print_hm();
		}
		if ($purc_ret_dt.equalsIgnoreCase(name)) {
			return purc_ret_dt();
		}
		return super.getDateNE(name);
	}

	public void setString(String name, String value) {
		if ($rpt_sts_typ_nm.equalsIgnoreCase(name)) {
			rpt_sts_typ_nm(value);
			return;
		}
		if ($rpt_sts_typ.equalsIgnoreCase(name)) {
			rpt_sts_typ(value);
			return;
		}
		if ($purc_ret_act_no.equalsIgnoreCase(name)) {
			purc_ret_act_no(value);
			return;
		}
		if ($sppl_zip_cd.equalsIgnoreCase(name)) {
			sppl_zip_cd(value);
			return;
		}
		if ($sppl_addr1.equalsIgnoreCase(name)) {
			sppl_addr1(value);
			return;
		}
		if ($sppl_addr2.equalsIgnoreCase(name)) {
			sppl_addr2(value);
			return;
		}
		if ($sppl_addr3.equalsIgnoreCase(name)) {
			sppl_addr3(value);
			return;
		}
		if ($sppl_addr4.equalsIgnoreCase(name)) {
			sppl_addr4(value);
			return;
		}
		if ($sppl_addr.equalsIgnoreCase(name)) {
			sppl_addr(value);
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
		if ($sppl_alt_nm1.equalsIgnoreCase(name)) {
			sppl_alt_nm1(value);
			return;
		}
		if ($sppl_alt_nm2.equalsIgnoreCase(name)) {
			sppl_alt_nm2(value);
			return;
		}
		if ($sppl_alt_nm3.equalsIgnoreCase(name)) {
			sppl_alt_nm3(value);
			return;
		}
		if ($sppl_alt_nm4.equalsIgnoreCase(name)) {
			sppl_alt_nm4(value);
			return;
		}
		if ($sppl_cntct_dpt.equalsIgnoreCase(name)) {
			sppl_cntct_dpt(value);
			return;
		}
		if ($sppl_cntct_psn.equalsIgnoreCase(name)) {
			sppl_cntct_psn(value);
			return;
		}
		if ($sppl_cntct_psn_title.equalsIgnoreCase(name)) {
			sppl_cntct_psn_title(value);
			return;
		}
		if ($sppl_tel.equalsIgnoreCase(name)) {
			sppl_tel(value);
			return;
		}
		if ($sppl_fax.equalsIgnoreCase(name)) {
			sppl_fax(value);
			return;
		}
		if ($sppl_cntry_nm.equalsIgnoreCase(name)) {
			sppl_cntry_nm(value);
			return;
		}
		if ($co_cd.equalsIgnoreCase(name)) {
			co_cd(value);
			return;
		}
		if ($co_nm.equalsIgnoreCase(name)) {
			co_nm(value);
			return;
		}
		if ($dpt_zip_cd.equalsIgnoreCase(name)) {
			dpt_zip_cd(value);
			return;
		}
		if ($dpt_addr1.equalsIgnoreCase(name)) {
			dpt_addr1(value);
			return;
		}
		if ($dpt_addr2.equalsIgnoreCase(name)) {
			dpt_addr2(value);
			return;
		}
		if ($dpt_addr3.equalsIgnoreCase(name)) {
			dpt_addr3(value);
			return;
		}
		if ($dpt_addr4.equalsIgnoreCase(name)) {
			dpt_addr4(value);
			return;
		}
		if ($dpt_addr.equalsIgnoreCase(name)) {
			dpt_addr(value);
			return;
		}
		if ($dpt_tel.equalsIgnoreCase(name)) {
			dpt_tel(value);
			return;
		}
		if ($dpt_fax.equalsIgnoreCase(name)) {
			dpt_fax(value);
			return;
		}
		if ($dpt_cntry_nm.equalsIgnoreCase(name)) {
			dpt_cntry_nm(value);
			return;
		}
		if ($purc_dpt_cd.equalsIgnoreCase(name)) {
			purc_dpt_cd(value);
			return;
		}
		if ($purc_dpt_nm.equalsIgnoreCase(name)) {
			purc_dpt_nm(value);
			return;
		}
		if ($purc_usr_cd.equalsIgnoreCase(name)) {
			purc_usr_cd(value);
			return;
		}
		if ($purc_usr_nm.equalsIgnoreCase(name)) {
			purc_usr_nm(value);
			return;
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			trd_cd(value);
			return;
		}
		if ($purc_ret_act_sub_char1.equalsIgnoreCase(name)) {
			purc_ret_act_sub_char1(value);
			return;
		}
		if ($purc_ret_act_sub_char2.equalsIgnoreCase(name)) {
			purc_ret_act_sub_char2(value);
			return;
		}
		if ($purc_ret_act_sub_char3.equalsIgnoreCase(name)) {
			purc_ret_act_sub_char3(value);
			return;
		}
		if ($purc_act_sub_char1.equalsIgnoreCase(name)) {
			purc_act_sub_char1(value);
			return;
		}
		if ($purc_act_sub_char2.equalsIgnoreCase(name)) {
			purc_act_sub_char2(value);
			return;
		}
		if ($purc_act_sub_char3.equalsIgnoreCase(name)) {
			purc_act_sub_char3(value);
			return;
		}
		if ($s_ttl_amt.equalsIgnoreCase(name)) {
			s_ttl_amt(value);
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
		if ($s_ttl_tax_amt.equalsIgnoreCase(name)) {
			s_ttl_tax_amt(value);
			return;
		}
		if ($purc_ret_print_rmrks.equalsIgnoreCase(name)) {
			purc_ret_print_rmrks(value);
			return;
		}
		if ($ret_sppl_zip_cd.equalsIgnoreCase(name)) {
			ret_sppl_zip_cd(value);
			return;
		}
		if ($ret_sppl_addr1.equalsIgnoreCase(name)) {
			ret_sppl_addr1(value);
			return;
		}
		if ($ret_sppl_addr2.equalsIgnoreCase(name)) {
			ret_sppl_addr2(value);
			return;
		}
		if ($ret_sppl_addr3.equalsIgnoreCase(name)) {
			ret_sppl_addr3(value);
			return;
		}
		if ($ret_sppl_addr4.equalsIgnoreCase(name)) {
			ret_sppl_addr4(value);
			return;
		}
		if ($ret_sppl_addr.equalsIgnoreCase(name)) {
			ret_sppl_addr(value);
			return;
		}
		if ($ret_sppl_nm.equalsIgnoreCase(name)) {
			ret_sppl_nm(value);
			return;
		}
		if ($ret_sppl_cntct_dpt.equalsIgnoreCase(name)) {
			ret_sppl_cntct_dpt(value);
			return;
		}
		if ($ret_sppl_cntct_psn.equalsIgnoreCase(name)) {
			ret_sppl_cntct_psn(value);
			return;
		}
		if ($ret_sppl_cntct_psn_title.equalsIgnoreCase(name)) {
			ret_sppl_cntct_psn_title(value);
			return;
		}
		if ($ret_sppl_tel.equalsIgnoreCase(name)) {
			ret_sppl_tel(value);
			return;
		}
		if ($ret_sppl_fax.equalsIgnoreCase(name)) {
			ret_sppl_fax(value);
			return;
		}
		if ($ret_cntry_nm.equalsIgnoreCase(name)) {
			ret_cntry_nm(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($purc_ret_act_rev.equalsIgnoreCase(name)) {
			purc_ret_act_rev(value);
			return;
		}
		if ($ttl_amt.equalsIgnoreCase(name)) {
			ttl_amt(value);
			return;
		}
		if ($ttl_tax_amt.equalsIgnoreCase(name)) {
			ttl_tax_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($purc_ret_act_rev.equalsIgnoreCase(name)) {
			purc_ret_act_rev(value);
			return;
		}
		if ($ttl_amt.equalsIgnoreCase(name)) {
			ttl_amt(value);
			return;
		}
		if ($ttl_tax_amt.equalsIgnoreCase(name)) {
			ttl_tax_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($purc_ret_act_rev.equalsIgnoreCase(name)) {
			purc_ret_act_rev(value);
			return;
		}
		if ($ttl_amt.equalsIgnoreCase(name)) {
			ttl_amt(value);
			return;
		}
		if ($ttl_tax_amt.equalsIgnoreCase(name)) {
			ttl_tax_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($purc_ret_act_rev.equalsIgnoreCase(name)) {
			purc_ret_act_rev(value);
			return;
		}
		if ($ttl_amt.equalsIgnoreCase(name)) {
			ttl_amt(value);
			return;
		}
		if ($ttl_tax_amt.equalsIgnoreCase(name)) {
			ttl_tax_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($purc_ret_act_rev.equalsIgnoreCase(name)) {
			purc_ret_act_rev(value);
			return;
		}
		if ($ttl_amt.equalsIgnoreCase(name)) {
			ttl_amt(value);
			return;
		}
		if ($ttl_tax_amt.equalsIgnoreCase(name)) {
			ttl_tax_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($print_hm.equalsIgnoreCase(name)) {
			print_hm(value);
			return;
		}
		if ($purc_ret_dt.equalsIgnoreCase(name)) {
			purc_ret_dt(value);
			return;
		}
		super.setDate(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($rpt_sts_typ_nm.equalsIgnoreCase(name)) {
			rpt_sts_typ_nm(value);
			return;
		}
		if ($rpt_sts_typ.equalsIgnoreCase(name)) {
			rpt_sts_typ(value);
			return;
		}
		if ($purc_ret_act_no.equalsIgnoreCase(name)) {
			purc_ret_act_no(value);
			return;
		}
		if ($sppl_zip_cd.equalsIgnoreCase(name)) {
			sppl_zip_cd(value);
			return;
		}
		if ($sppl_addr1.equalsIgnoreCase(name)) {
			sppl_addr1(value);
			return;
		}
		if ($sppl_addr2.equalsIgnoreCase(name)) {
			sppl_addr2(value);
			return;
		}
		if ($sppl_addr3.equalsIgnoreCase(name)) {
			sppl_addr3(value);
			return;
		}
		if ($sppl_addr4.equalsIgnoreCase(name)) {
			sppl_addr4(value);
			return;
		}
		if ($sppl_addr.equalsIgnoreCase(name)) {
			sppl_addr(value);
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
		if ($sppl_alt_nm1.equalsIgnoreCase(name)) {
			sppl_alt_nm1(value);
			return;
		}
		if ($sppl_alt_nm2.equalsIgnoreCase(name)) {
			sppl_alt_nm2(value);
			return;
		}
		if ($sppl_alt_nm3.equalsIgnoreCase(name)) {
			sppl_alt_nm3(value);
			return;
		}
		if ($sppl_alt_nm4.equalsIgnoreCase(name)) {
			sppl_alt_nm4(value);
			return;
		}
		if ($sppl_cntct_dpt.equalsIgnoreCase(name)) {
			sppl_cntct_dpt(value);
			return;
		}
		if ($sppl_cntct_psn.equalsIgnoreCase(name)) {
			sppl_cntct_psn(value);
			return;
		}
		if ($sppl_cntct_psn_title.equalsIgnoreCase(name)) {
			sppl_cntct_psn_title(value);
			return;
		}
		if ($sppl_tel.equalsIgnoreCase(name)) {
			sppl_tel(value);
			return;
		}
		if ($sppl_fax.equalsIgnoreCase(name)) {
			sppl_fax(value);
			return;
		}
		if ($sppl_cntry_nm.equalsIgnoreCase(name)) {
			sppl_cntry_nm(value);
			return;
		}
		if ($co_cd.equalsIgnoreCase(name)) {
			co_cd(value);
			return;
		}
		if ($co_nm.equalsIgnoreCase(name)) {
			co_nm(value);
			return;
		}
		if ($dpt_zip_cd.equalsIgnoreCase(name)) {
			dpt_zip_cd(value);
			return;
		}
		if ($dpt_addr1.equalsIgnoreCase(name)) {
			dpt_addr1(value);
			return;
		}
		if ($dpt_addr2.equalsIgnoreCase(name)) {
			dpt_addr2(value);
			return;
		}
		if ($dpt_addr3.equalsIgnoreCase(name)) {
			dpt_addr3(value);
			return;
		}
		if ($dpt_addr4.equalsIgnoreCase(name)) {
			dpt_addr4(value);
			return;
		}
		if ($dpt_addr.equalsIgnoreCase(name)) {
			dpt_addr(value);
			return;
		}
		if ($dpt_tel.equalsIgnoreCase(name)) {
			dpt_tel(value);
			return;
		}
		if ($dpt_fax.equalsIgnoreCase(name)) {
			dpt_fax(value);
			return;
		}
		if ($dpt_cntry_nm.equalsIgnoreCase(name)) {
			dpt_cntry_nm(value);
			return;
		}
		if ($purc_dpt_cd.equalsIgnoreCase(name)) {
			purc_dpt_cd(value);
			return;
		}
		if ($purc_dpt_nm.equalsIgnoreCase(name)) {
			purc_dpt_nm(value);
			return;
		}
		if ($purc_usr_cd.equalsIgnoreCase(name)) {
			purc_usr_cd(value);
			return;
		}
		if ($purc_usr_nm.equalsIgnoreCase(name)) {
			purc_usr_nm(value);
			return;
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			trd_cd(value);
			return;
		}
		if ($purc_ret_act_sub_char1.equalsIgnoreCase(name)) {
			purc_ret_act_sub_char1(value);
			return;
		}
		if ($purc_ret_act_sub_char2.equalsIgnoreCase(name)) {
			purc_ret_act_sub_char2(value);
			return;
		}
		if ($purc_ret_act_sub_char3.equalsIgnoreCase(name)) {
			purc_ret_act_sub_char3(value);
			return;
		}
		if ($purc_act_sub_char1.equalsIgnoreCase(name)) {
			purc_act_sub_char1(value);
			return;
		}
		if ($purc_act_sub_char2.equalsIgnoreCase(name)) {
			purc_act_sub_char2(value);
			return;
		}
		if ($purc_act_sub_char3.equalsIgnoreCase(name)) {
			purc_act_sub_char3(value);
			return;
		}
		if ($s_ttl_amt.equalsIgnoreCase(name)) {
			s_ttl_amt(value);
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
		if ($s_ttl_tax_amt.equalsIgnoreCase(name)) {
			s_ttl_tax_amt(value);
			return;
		}
		if ($purc_ret_print_rmrks.equalsIgnoreCase(name)) {
			purc_ret_print_rmrks(value);
			return;
		}
		if ($ret_sppl_zip_cd.equalsIgnoreCase(name)) {
			ret_sppl_zip_cd(value);
			return;
		}
		if ($ret_sppl_addr1.equalsIgnoreCase(name)) {
			ret_sppl_addr1(value);
			return;
		}
		if ($ret_sppl_addr2.equalsIgnoreCase(name)) {
			ret_sppl_addr2(value);
			return;
		}
		if ($ret_sppl_addr3.equalsIgnoreCase(name)) {
			ret_sppl_addr3(value);
			return;
		}
		if ($ret_sppl_addr4.equalsIgnoreCase(name)) {
			ret_sppl_addr4(value);
			return;
		}
		if ($ret_sppl_addr.equalsIgnoreCase(name)) {
			ret_sppl_addr(value);
			return;
		}
		if ($ret_sppl_nm.equalsIgnoreCase(name)) {
			ret_sppl_nm(value);
			return;
		}
		if ($ret_sppl_cntct_dpt.equalsIgnoreCase(name)) {
			ret_sppl_cntct_dpt(value);
			return;
		}
		if ($ret_sppl_cntct_psn.equalsIgnoreCase(name)) {
			ret_sppl_cntct_psn(value);
			return;
		}
		if ($ret_sppl_cntct_psn_title.equalsIgnoreCase(name)) {
			ret_sppl_cntct_psn_title(value);
			return;
		}
		if ($ret_sppl_tel.equalsIgnoreCase(name)) {
			ret_sppl_tel(value);
			return;
		}
		if ($ret_sppl_fax.equalsIgnoreCase(name)) {
			ret_sppl_fax(value);
			return;
		}
		if ($ret_cntry_nm.equalsIgnoreCase(name)) {
			ret_cntry_nm(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($purc_ret_act_rev.equalsIgnoreCase(name)) {
			purc_ret_act_rev(value);
			return;
		}
		if ($ttl_amt.equalsIgnoreCase(name)) {
			ttl_amt(value);
			return;
		}
		if ($ttl_tax_amt.equalsIgnoreCase(name)) {
			ttl_tax_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($purc_ret_act_rev.equalsIgnoreCase(name)) {
			purc_ret_act_rev(value);
			return;
		}
		if ($ttl_amt.equalsIgnoreCase(name)) {
			ttl_amt(value);
			return;
		}
		if ($ttl_tax_amt.equalsIgnoreCase(name)) {
			ttl_tax_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($purc_ret_act_rev.equalsIgnoreCase(name)) {
			purc_ret_act_rev(value);
			return;
		}
		if ($ttl_amt.equalsIgnoreCase(name)) {
			ttl_amt(value);
			return;
		}
		if ($ttl_tax_amt.equalsIgnoreCase(name)) {
			ttl_tax_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($purc_ret_act_rev.equalsIgnoreCase(name)) {
			purc_ret_act_rev(value);
			return;
		}
		if ($ttl_amt.equalsIgnoreCase(name)) {
			ttl_amt(value);
			return;
		}
		if ($ttl_tax_amt.equalsIgnoreCase(name)) {
			ttl_tax_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($purc_ret_act_rev.equalsIgnoreCase(name)) {
			purc_ret_act_rev(value);
			return;
		}
		if ($ttl_amt.equalsIgnoreCase(name)) {
			ttl_amt(value);
			return;
		}
		if ($ttl_tax_amt.equalsIgnoreCase(name)) {
			ttl_tax_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($print_hm.equalsIgnoreCase(name)) {
			print_hm(value);
			return;
		}
		if ($purc_ret_dt.equalsIgnoreCase(name)) {
			purc_ret_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}



}

