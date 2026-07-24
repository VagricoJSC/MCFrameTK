package mcframe.commonMSBD.MSBDR0010;

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
 * ブロック"PfRptHdr"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class PfRptHdrR_MC_A extends MCConstRow {

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
	 *  内示日.<p>
	 *
	 */
	public static final String $pf_dt = "pf_dt";
	/**
	 *  前回内示日.<p>
	 *
	 */
	public static final String $pre_pf_dt = "pre_pf_dt";
	/**
	 *  内示書ＮＯ.<p>
	 *
	 */
	public static final String $pf_rpt_no = "pf_rpt_no";
	/**
	 *  発行日時.<p>
	 *
	 */
	public static final String $print_hm = "print_hm";
	/**
	 *  発注先.<p>
	 *
	 */
	public static final String $sppl_cd = "sppl_cd";
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
	 *  発注先ＴＥＬ.<p>
	 *
	 */
	public static final String $sppl_tel = "sppl_tel";
	/**
	 *  発注先ＦＡＸ.<p>
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
	 *  部門.<p>
	 *
	 */
	public static final String $pf_dpt_cd = "pf_dpt_cd";
	/**
	 *  部門名.<p>
	 *
	 */
	public static final String $pf_dpt_nm = "pf_dpt_nm";
	/**
	 *  部門国名.<p>
	 *
	 */
	public static final String $dpt_cntry_nm = "dpt_cntry_nm";
	/**
	 *  担当者.<p>
	 *
	 */
	public static final String $pf_usr_cd = "pf_usr_cd";
	/**
	 *  担当者名.<p>
	 *
	 */
	public static final String $pf_usr_nm = "pf_usr_nm";
	/**
	 *  ＷＧ.<p>
	 *
	 */
	public static final String $wg_cd = "wg_cd";
	/**
	 *  ＷＧ名.<p>
	 *
	 */
	public static final String $wg_nm = "wg_nm";
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
	 *  備考.<p>
	 *
	 */
	public static final String $pf_rpt_rmrks = "pf_rpt_rmrks";


	public static final MCMeta rpt_sts_typ_nm_META = createCommonMeta($rpt_sts_typ_nm, mcframe.commonMA.meta.MA_META.RPT_STS_TYP_NM);
	public static final MCMeta rpt_sts_typ_META = createCommonMeta($rpt_sts_typ, mcframe.commonMA.meta.MA_META.RPT_STS_TYP);
	public static final MCMeta pf_dt_META = createCommonMeta($pf_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta pre_pf_dt_META = createCommonMeta($pre_pf_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta pf_rpt_no_META = createCommonMeta($pf_rpt_no, mcframe.commonMA.meta.MA_META.PF_RPT_NO);
	public static final MCMeta print_hm_META = createCommonMeta($print_hm, mcframe.commonMA.meta.MA_META.HM);
	public static final MCMeta sppl_cd_META = createCommonMeta($sppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta sppl_zip_cd_META = createCommonMeta($sppl_zip_cd, mcframe.commonMA.meta.MA_META.ZIP_CD);
	public static final MCMeta sppl_addr1_META = createCommonMeta($sppl_addr1, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta sppl_addr2_META = createCommonMeta($sppl_addr2, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta sppl_addr3_META = createCommonMeta($sppl_addr3, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta sppl_addr4_META = createCommonMeta($sppl_addr4, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta sppl_addr_META = createStringMeta($sppl_addr);
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
	public static final MCMeta pf_dpt_cd_META = createCommonMeta($pf_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta pf_dpt_nm_META = createCommonMeta($pf_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta dpt_cntry_nm_META = createCommonMeta($dpt_cntry_nm, mcframe.commonMA.meta.MA_META.CNTRY_NM);
	public static final MCMeta pf_usr_cd_META = createCommonMeta($pf_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta pf_usr_nm_META = createCommonMeta($pf_usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta wg_nm_META = createCommonMeta($wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.PF_HDR_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.PF_HDR_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.PF_HDR_SUB_CHAR3);
	public static final MCMeta pf_rpt_rmrks_META = createCommonMeta($pf_rpt_rmrks, mcframe.commonMS.meta.MS_META.PF_HDR_RPT_RMRKS);

	protected static final ConstMetaList<PfRptHdrR> constMetas = new ConstMetaList<PfRptHdrR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			rpt_sts_typ_nm_META,
			rpt_sts_typ_META,
			pf_dt_META,
			pre_pf_dt_META,
			pf_rpt_no_META,
			print_hm_META,
			sppl_cd_META,
			sppl_zip_cd_META,
			sppl_addr1_META,
			sppl_addr2_META,
			sppl_addr3_META,
			sppl_addr4_META,
			sppl_addr_META,
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
			pf_dpt_cd_META,
			pf_dpt_nm_META,
			dpt_cntry_nm_META,
			pf_usr_cd_META,
			pf_usr_nm_META,
			wg_cd_META,
			wg_nm_META,
			sub_char1_META,
			sub_char2_META,
			sub_char3_META,
			pf_rpt_rmrks_META
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
	protected PfRptHdrR_MC_A(ConstMetaList<? extends PfRptHdrR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public PfRptHdrR clone() {
		return (PfRptHdrR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public PfRptHdrR createInstance() {
		return (PfRptHdrR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public PfRptHdrR getValues(String... names) {
		return (PfRptHdrR) super.getValues(names);
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
	 *  内示日.<p>
	 *
	 */
	public MCDate pf_dt() {
		return getConstDate(offset + 2, $pf_dt);
	}

	/**
	 *  内示日.<p>
	 *
	 */
	public void pf_dt(MCDate value) {
		setConstDate(offset + 2, $pf_dt, value);
	}


	/**
	 *  前回内示日.<p>
	 *
	 */
	public MCDate pre_pf_dt() {
		return getConstDate(offset + 3, $pre_pf_dt);
	}

	/**
	 *  前回内示日.<p>
	 *
	 */
	public void pre_pf_dt(MCDate value) {
		setConstDate(offset + 3, $pre_pf_dt, value);
	}


	/**
	 *  内示書ＮＯ.<p>
	 *
	 */
	public String pf_rpt_no() {
		return getConstString(offset + 4, $pf_rpt_no);
	}

	/**
	 *  内示書ＮＯ.<p>
	 *
	 */
	public void pf_rpt_no(String value) {
		setConstString(offset + 4, $pf_rpt_no, value);
	}


	/**
	 *  発行日時.<p>
	 *
	 */
	public MCDate print_hm() {
		return getConstDate(offset + 5, $print_hm);
	}

	/**
	 *  発行日時.<p>
	 *
	 */
	public void print_hm(MCDate value) {
		setConstDate(offset + 5, $print_hm, value);
	}


	/**
	 *  発注先.<p>
	 *
	 */
	public String sppl_cd() {
		return getConstString(offset + 6, $sppl_cd);
	}

	/**
	 *  発注先.<p>
	 *
	 */
	public void sppl_cd(String value) {
		setConstString(offset + 6, $sppl_cd, value);
	}


	/**
	 *  発注先郵便番号.<p>
	 *
	 */
	public String sppl_zip_cd() {
		return getConstString(offset + 7, $sppl_zip_cd);
	}

	/**
	 *  発注先郵便番号.<p>
	 *
	 */
	public void sppl_zip_cd(String value) {
		setConstString(offset + 7, $sppl_zip_cd, value);
	}


	/**
	 *  発注先住所１.<p>
	 *
	 */
	public String sppl_addr1() {
		return getConstString(offset + 8, $sppl_addr1);
	}

	/**
	 *  発注先住所１.<p>
	 *
	 */
	public void sppl_addr1(String value) {
		setConstString(offset + 8, $sppl_addr1, value);
	}


	/**
	 *  発注先住所２.<p>
	 *
	 */
	public String sppl_addr2() {
		return getConstString(offset + 9, $sppl_addr2);
	}

	/**
	 *  発注先住所２.<p>
	 *
	 */
	public void sppl_addr2(String value) {
		setConstString(offset + 9, $sppl_addr2, value);
	}


	/**
	 *  発注先住所３.<p>
	 *
	 */
	public String sppl_addr3() {
		return getConstString(offset + 10, $sppl_addr3);
	}

	/**
	 *  発注先住所３.<p>
	 *
	 */
	public void sppl_addr3(String value) {
		setConstString(offset + 10, $sppl_addr3, value);
	}


	/**
	 *  発注先住所４.<p>
	 *
	 */
	public String sppl_addr4() {
		return getConstString(offset + 11, $sppl_addr4);
	}

	/**
	 *  発注先住所４.<p>
	 *
	 */
	public void sppl_addr4(String value) {
		setConstString(offset + 11, $sppl_addr4, value);
	}


	/**
	 *  発注先住所.<p>
	 *
	 */
	public String sppl_addr() {
		return getConstString(offset + 12, $sppl_addr);
	}

	/**
	 *  発注先住所.<p>
	 *
	 */
	public void sppl_addr(String value) {
		setConstString(offset + 12, $sppl_addr, value);
	}


	/**
	 *  発注先名.<p>
	 *
	 */
	public String sppl_nm() {
		return getConstString(offset + 13, $sppl_nm);
	}

	/**
	 *  発注先名.<p>
	 *
	 */
	public void sppl_nm(String value) {
		setConstString(offset + 13, $sppl_nm, value);
	}


	/**
	 *  発注先別名１.<p>
	 *
	 */
	public String sppl_alt_nm1() {
		return getConstString(offset + 14, $sppl_alt_nm1);
	}

	/**
	 *  発注先別名１.<p>
	 *
	 */
	public void sppl_alt_nm1(String value) {
		setConstString(offset + 14, $sppl_alt_nm1, value);
	}


	/**
	 *  発注先別名２.<p>
	 *
	 */
	public String sppl_alt_nm2() {
		return getConstString(offset + 15, $sppl_alt_nm2);
	}

	/**
	 *  発注先別名２.<p>
	 *
	 */
	public void sppl_alt_nm2(String value) {
		setConstString(offset + 15, $sppl_alt_nm2, value);
	}


	/**
	 *  発注先別名３.<p>
	 *
	 */
	public String sppl_alt_nm3() {
		return getConstString(offset + 16, $sppl_alt_nm3);
	}

	/**
	 *  発注先別名３.<p>
	 *
	 */
	public void sppl_alt_nm3(String value) {
		setConstString(offset + 16, $sppl_alt_nm3, value);
	}


	/**
	 *  発注先別名４.<p>
	 *
	 */
	public String sppl_alt_nm4() {
		return getConstString(offset + 17, $sppl_alt_nm4);
	}

	/**
	 *  発注先別名４.<p>
	 *
	 */
	public void sppl_alt_nm4(String value) {
		setConstString(offset + 17, $sppl_alt_nm4, value);
	}


	/**
	 *  発注先部署名.<p>
	 *
	 */
	public String sppl_cntct_dpt() {
		return getConstString(offset + 18, $sppl_cntct_dpt);
	}

	/**
	 *  発注先部署名.<p>
	 *
	 */
	public void sppl_cntct_dpt(String value) {
		setConstString(offset + 18, $sppl_cntct_dpt, value);
	}


	/**
	 *  発注先担当者.<p>
	 *
	 */
	public String sppl_cntct_psn() {
		return getConstString(offset + 19, $sppl_cntct_psn);
	}

	/**
	 *  発注先担当者.<p>
	 *
	 */
	public void sppl_cntct_psn(String value) {
		setConstString(offset + 19, $sppl_cntct_psn, value);
	}


	/**
	 *  発注先担当者敬称.<p>
	 *
	 */
	public String sppl_cntct_psn_title() {
		return getConstString(offset + 20, $sppl_cntct_psn_title);
	}

	/**
	 *  発注先担当者敬称.<p>
	 *
	 */
	public void sppl_cntct_psn_title(String value) {
		setConstString(offset + 20, $sppl_cntct_psn_title, value);
	}


	/**
	 *  発注先ＴＥＬ.<p>
	 *
	 */
	public String sppl_tel() {
		return getConstString(offset + 21, $sppl_tel);
	}

	/**
	 *  発注先ＴＥＬ.<p>
	 *
	 */
	public void sppl_tel(String value) {
		setConstString(offset + 21, $sppl_tel, value);
	}


	/**
	 *  発注先ＦＡＸ.<p>
	 *
	 */
	public String sppl_fax() {
		return getConstString(offset + 22, $sppl_fax);
	}

	/**
	 *  発注先ＦＡＸ.<p>
	 *
	 */
	public void sppl_fax(String value) {
		setConstString(offset + 22, $sppl_fax, value);
	}


	/**
	 *  発注先国名.<p>
	 *
	 */
	public String sppl_cntry_nm() {
		return getConstString(offset + 23, $sppl_cntry_nm);
	}

	/**
	 *  発注先国名.<p>
	 *
	 */
	public void sppl_cntry_nm(String value) {
		setConstString(offset + 23, $sppl_cntry_nm, value);
	}


	/**
	 *  会社.<p>
	 *
	 */
	public String co_cd() {
		return getConstString(offset + 24, $co_cd);
	}

	/**
	 *  会社.<p>
	 *
	 */
	public void co_cd(String value) {
		setConstString(offset + 24, $co_cd, value);
	}


	/**
	 *  会社名.<p>
	 *
	 */
	public String co_nm() {
		return getConstString(offset + 25, $co_nm);
	}

	/**
	 *  会社名.<p>
	 *
	 */
	public void co_nm(String value) {
		setConstString(offset + 25, $co_nm, value);
	}


	/**
	 *  部門郵便番号.<p>
	 *
	 */
	public String dpt_zip_cd() {
		return getConstString(offset + 26, $dpt_zip_cd);
	}

	/**
	 *  部門郵便番号.<p>
	 *
	 */
	public void dpt_zip_cd(String value) {
		setConstString(offset + 26, $dpt_zip_cd, value);
	}


	/**
	 *  部門住所１.<p>
	 *
	 */
	public String dpt_addr1() {
		return getConstString(offset + 27, $dpt_addr1);
	}

	/**
	 *  部門住所１.<p>
	 *
	 */
	public void dpt_addr1(String value) {
		setConstString(offset + 27, $dpt_addr1, value);
	}


	/**
	 *  部門住所２.<p>
	 *
	 */
	public String dpt_addr2() {
		return getConstString(offset + 28, $dpt_addr2);
	}

	/**
	 *  部門住所２.<p>
	 *
	 */
	public void dpt_addr2(String value) {
		setConstString(offset + 28, $dpt_addr2, value);
	}


	/**
	 *  部門住所３.<p>
	 *
	 */
	public String dpt_addr3() {
		return getConstString(offset + 29, $dpt_addr3);
	}

	/**
	 *  部門住所３.<p>
	 *
	 */
	public void dpt_addr3(String value) {
		setConstString(offset + 29, $dpt_addr3, value);
	}


	/**
	 *  部門住所４.<p>
	 *
	 */
	public String dpt_addr4() {
		return getConstString(offset + 30, $dpt_addr4);
	}

	/**
	 *  部門住所４.<p>
	 *
	 */
	public void dpt_addr4(String value) {
		setConstString(offset + 30, $dpt_addr4, value);
	}


	/**
	 *  部門住所.<p>
	 *
	 */
	public String dpt_addr() {
		return getConstString(offset + 31, $dpt_addr);
	}

	/**
	 *  部門住所.<p>
	 *
	 */
	public void dpt_addr(String value) {
		setConstString(offset + 31, $dpt_addr, value);
	}


	/**
	 *  部門ＴＥＬ.<p>
	 *
	 */
	public String dpt_tel() {
		return getConstString(offset + 32, $dpt_tel);
	}

	/**
	 *  部門ＴＥＬ.<p>
	 *
	 */
	public void dpt_tel(String value) {
		setConstString(offset + 32, $dpt_tel, value);
	}


	/**
	 *  部門ＦＡＸ.<p>
	 *
	 */
	public String dpt_fax() {
		return getConstString(offset + 33, $dpt_fax);
	}

	/**
	 *  部門ＦＡＸ.<p>
	 *
	 */
	public void dpt_fax(String value) {
		setConstString(offset + 33, $dpt_fax, value);
	}


	/**
	 *  部門.<p>
	 *
	 */
	public String pf_dpt_cd() {
		return getConstString(offset + 34, $pf_dpt_cd);
	}

	/**
	 *  部門.<p>
	 *
	 */
	public void pf_dpt_cd(String value) {
		setConstString(offset + 34, $pf_dpt_cd, value);
	}


	/**
	 *  部門名.<p>
	 *
	 */
	public String pf_dpt_nm() {
		return getConstString(offset + 35, $pf_dpt_nm);
	}

	/**
	 *  部門名.<p>
	 *
	 */
	public void pf_dpt_nm(String value) {
		setConstString(offset + 35, $pf_dpt_nm, value);
	}


	/**
	 *  部門国名.<p>
	 *
	 */
	public String dpt_cntry_nm() {
		return getConstString(offset + 36, $dpt_cntry_nm);
	}

	/**
	 *  部門国名.<p>
	 *
	 */
	public void dpt_cntry_nm(String value) {
		setConstString(offset + 36, $dpt_cntry_nm, value);
	}


	/**
	 *  担当者.<p>
	 *
	 */
	public String pf_usr_cd() {
		return getConstString(offset + 37, $pf_usr_cd);
	}

	/**
	 *  担当者.<p>
	 *
	 */
	public void pf_usr_cd(String value) {
		setConstString(offset + 37, $pf_usr_cd, value);
	}


	/**
	 *  担当者名.<p>
	 *
	 */
	public String pf_usr_nm() {
		return getConstString(offset + 38, $pf_usr_nm);
	}

	/**
	 *  担当者名.<p>
	 *
	 */
	public void pf_usr_nm(String value) {
		setConstString(offset + 38, $pf_usr_nm, value);
	}


	/**
	 *  ＷＧ.<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 39, $wg_cd);
	}

	/**
	 *  ＷＧ.<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 39, $wg_cd, value);
	}


	/**
	 *  ＷＧ名.<p>
	 *
	 */
	public String wg_nm() {
		return getConstString(offset + 40, $wg_nm);
	}

	/**
	 *  ＷＧ名.<p>
	 *
	 */
	public void wg_nm(String value) {
		setConstString(offset + 40, $wg_nm, value);
	}


	/**
	 *  予備１.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 41, $sub_char1);
	}

	/**
	 *  予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 41, $sub_char1, value);
	}


	/**
	 *  予備２.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 42, $sub_char2);
	}

	/**
	 *  予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 42, $sub_char2, value);
	}


	/**
	 *  予備３.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 43, $sub_char3);
	}

	/**
	 *  予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 43, $sub_char3, value);
	}


	/**
	 *  備考.<p>
	 *
	 */
	public String pf_rpt_rmrks() {
		return getConstString(offset + 44, $pf_rpt_rmrks);
	}

	/**
	 *  備考.<p>
	 *
	 */
	public void pf_rpt_rmrks(String value) {
		setConstString(offset + 44, $pf_rpt_rmrks, value);
	}


	public String getString(String name) {
		if ($rpt_sts_typ_nm.equalsIgnoreCase(name)) {
			return rpt_sts_typ_nm();
		}
		if ($rpt_sts_typ.equalsIgnoreCase(name)) {
			return rpt_sts_typ();
		}
		if ($pf_rpt_no.equalsIgnoreCase(name)) {
			return pf_rpt_no();
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			return sppl_cd();
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
		if ($pf_dpt_cd.equalsIgnoreCase(name)) {
			return pf_dpt_cd();
		}
		if ($pf_dpt_nm.equalsIgnoreCase(name)) {
			return pf_dpt_nm();
		}
		if ($dpt_cntry_nm.equalsIgnoreCase(name)) {
			return dpt_cntry_nm();
		}
		if ($pf_usr_cd.equalsIgnoreCase(name)) {
			return pf_usr_cd();
		}
		if ($pf_usr_nm.equalsIgnoreCase(name)) {
			return pf_usr_nm();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
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
		if ($pf_rpt_rmrks.equalsIgnoreCase(name)) {
			return pf_rpt_rmrks();
		}
		return super.getString(name);
	}
	public MCDate getDate(String name) {
		if ($pf_dt.equalsIgnoreCase(name)) {
			return pf_dt();
		}
		if ($pre_pf_dt.equalsIgnoreCase(name)) {
			return pre_pf_dt();
		}
		if ($print_hm.equalsIgnoreCase(name)) {
			return print_hm();
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
		if ($pf_rpt_no.equalsIgnoreCase(name)) {
			return pf_rpt_no();
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			return sppl_cd();
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
		if ($pf_dpt_cd.equalsIgnoreCase(name)) {
			return pf_dpt_cd();
		}
		if ($pf_dpt_nm.equalsIgnoreCase(name)) {
			return pf_dpt_nm();
		}
		if ($dpt_cntry_nm.equalsIgnoreCase(name)) {
			return dpt_cntry_nm();
		}
		if ($pf_usr_cd.equalsIgnoreCase(name)) {
			return pf_usr_cd();
		}
		if ($pf_usr_nm.equalsIgnoreCase(name)) {
			return pf_usr_nm();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
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
		if ($pf_rpt_rmrks.equalsIgnoreCase(name)) {
			return pf_rpt_rmrks();
		}
		return super.getStringNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($pf_dt.equalsIgnoreCase(name)) {
			return pf_dt();
		}
		if ($pre_pf_dt.equalsIgnoreCase(name)) {
			return pre_pf_dt();
		}
		if ($print_hm.equalsIgnoreCase(name)) {
			return print_hm();
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
		if ($pf_rpt_no.equalsIgnoreCase(name)) {
			pf_rpt_no(value);
			return;
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			sppl_cd(value);
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
		if ($pf_dpt_cd.equalsIgnoreCase(name)) {
			pf_dpt_cd(value);
			return;
		}
		if ($pf_dpt_nm.equalsIgnoreCase(name)) {
			pf_dpt_nm(value);
			return;
		}
		if ($dpt_cntry_nm.equalsIgnoreCase(name)) {
			dpt_cntry_nm(value);
			return;
		}
		if ($pf_usr_cd.equalsIgnoreCase(name)) {
			pf_usr_cd(value);
			return;
		}
		if ($pf_usr_nm.equalsIgnoreCase(name)) {
			pf_usr_nm(value);
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
		if ($pf_rpt_rmrks.equalsIgnoreCase(name)) {
			pf_rpt_rmrks(value);
			return;
		}
		super.setString(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($pf_dt.equalsIgnoreCase(name)) {
			pf_dt(value);
			return;
		}
		if ($pre_pf_dt.equalsIgnoreCase(name)) {
			pre_pf_dt(value);
			return;
		}
		if ($print_hm.equalsIgnoreCase(name)) {
			print_hm(value);
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
		if ($pf_rpt_no.equalsIgnoreCase(name)) {
			pf_rpt_no(value);
			return;
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			sppl_cd(value);
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
		if ($pf_dpt_cd.equalsIgnoreCase(name)) {
			pf_dpt_cd(value);
			return;
		}
		if ($pf_dpt_nm.equalsIgnoreCase(name)) {
			pf_dpt_nm(value);
			return;
		}
		if ($dpt_cntry_nm.equalsIgnoreCase(name)) {
			dpt_cntry_nm(value);
			return;
		}
		if ($pf_usr_cd.equalsIgnoreCase(name)) {
			pf_usr_cd(value);
			return;
		}
		if ($pf_usr_nm.equalsIgnoreCase(name)) {
			pf_usr_nm(value);
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
		if ($pf_rpt_rmrks.equalsIgnoreCase(name)) {
			pf_rpt_rmrks(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($pf_dt.equalsIgnoreCase(name)) {
			pf_dt(value);
			return;
		}
		if ($pre_pf_dt.equalsIgnoreCase(name)) {
			pre_pf_dt(value);
			return;
		}
		if ($print_hm.equalsIgnoreCase(name)) {
			print_hm(value);
			return;
		}
		super.setDateNE(name, value);
	}



}

