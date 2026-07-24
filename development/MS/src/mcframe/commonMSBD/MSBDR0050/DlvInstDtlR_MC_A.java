package mcframe.commonMSBD.MSBDR0050;

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
 * ブロック"DlvInstDtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class DlvInstDtlR_MC_A extends MCConstRow {

	/**
	 *  納入指示明細ＮＯ.<p>
	 *
	 */
	public static final String $dlv_inst_d_no = "dlv_inst_d_no";
	/**
	 *  納期（日付）.<p>
	 *
	 */
	public static final String $dtl_dlv_rqst_dt = "dtl_dlv_rqst_dt";
	/**
	 *  納期（時刻）.<p>
	 *
	 */
	public static final String $dtl_dlv_rqst_tm = "dtl_dlv_rqst_tm";
	/**
	 *  納入指示数量.<p>
	 *
	 */
	public static final String $trd_unit_qty = "trd_unit_qty";
	/**
	 *  納入指示数量文字列（整数部）.<p>
	 *
	 */
	public static final String $s_int_trd_unit_qty = "s_int_trd_unit_qty";
	/**
	 *  納入指示数量文字列（小数部）.<p>
	 *
	 */
	public static final String $s_dec_trd_unit_qty = "s_dec_trd_unit_qty";
	/**
	 *  単位.<p>
	 *
	 */
	public static final String $dtl_trd_unit_cd = "dtl_trd_unit_cd";
	/**
	 *  納入指示単位名.<p>
	 *
	 */
	public static final String $dtl_trd_unit_nm = "dtl_trd_unit_nm";
	/**
	 *  検査完了日（ラベル）.<p>
	 *
	 */
	public static final String $insp_end_dt_lbl = "insp_end_dt_lbl";
	/**
	 *  検査完了日.<p>
	 *
	 */
	public static final String $insp_end_dt = "insp_end_dt";
	/**
	 *  納入場所.<p>
	 *
	 */
	public static final String $dtl_in_to_loc_cd = "dtl_in_to_loc_cd";
	/**
	 *  納入場所名.<p>
	 *
	 */
	public static final String $dtl_in_to_loc_nm = "dtl_in_to_loc_nm";
	/**
	 *  納入場所別名１.<p>
	 *
	 */
	public static final String $dtl_in_to_loc_alt_nm1 = "dtl_in_to_loc_alt_nm1";
	/**
	 *  納入場所別名２.<p>
	 *
	 */
	public static final String $dtl_in_to_loc_alt_nm2 = "dtl_in_to_loc_alt_nm2";
	/**
	 *  納入場所別名３.<p>
	 *
	 */
	public static final String $dtl_in_to_loc_alt_nm3 = "dtl_in_to_loc_alt_nm3";
	/**
	 *  納入場所別名４.<p>
	 *
	 */
	public static final String $dtl_in_to_loc_alt_nm4 = "dtl_in_to_loc_alt_nm4";
	/**
	 *  備考.<p>
	 *
	 */
	public static final String $dlv_inst_prnt_d_rmrks = "dlv_inst_prnt_d_rmrks";
	/**
	 *  予備１.<p>
	 *
	 */
	public static final String $dlv_inst_d_sub_char1 = "dlv_inst_d_sub_char1";
	/**
	 *  予備２.<p>
	 *
	 */
	public static final String $dlv_inst_d_sub_char2 = "dlv_inst_d_sub_char2";
	/**
	 *  予備３.<p>
	 *
	 */
	public static final String $dlv_inst_d_sub_char3 = "dlv_inst_d_sub_char3";
	/**
	 *  納入場所郵便番号.<p>
	 *
	 */
	public static final String $dtl_in_to_loc_zip_cd = "dtl_in_to_loc_zip_cd";
	/**
	 *  納入場所住所１.<p>
	 *
	 */
	public static final String $dtl_in_to_loc_addr1 = "dtl_in_to_loc_addr1";
	/**
	 *  納入場所住所２.<p>
	 *
	 */
	public static final String $dtl_in_to_loc_addr2 = "dtl_in_to_loc_addr2";
	/**
	 *  納入場所住所３.<p>
	 *
	 */
	public static final String $dtl_in_to_loc_addr3 = "dtl_in_to_loc_addr3";
	/**
	 *  納入場所住所４.<p>
	 *
	 */
	public static final String $dtl_in_to_loc_addr4 = "dtl_in_to_loc_addr4";
	/**
	 *  納入場所住所１－４（データ用）.<p>
	 *
	 */
	public static final String $dtl_in_to_loc_addr = "dtl_in_to_loc_addr";
	/**
	 *  納入場所ＴＥＬ.<p>
	 *
	 */
	public static final String $dtl_in_to_loc_tel = "dtl_in_to_loc_tel";
	/**
	 *  納入場所ＦＡＸ.<p>
	 *
	 */
	public static final String $dtl_in_to_loc_fax = "dtl_in_to_loc_fax";
	/**
	 *  納入場所国名.<p>
	 *
	 */
	public static final String $dtl_in_to_cntry_nm = "dtl_in_to_cntry_nm";


	public static final MCMeta dlv_inst_d_no_META = createCommonMeta($dlv_inst_d_no, mcframe.commonMA.meta.MA_META.DLV_INST_D_NO);
	public static final MCMeta dtl_dlv_rqst_dt_META = createCommonMeta($dtl_dlv_rqst_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta dtl_dlv_rqst_tm_META = createCommonMeta($dtl_dlv_rqst_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta trd_unit_qty_META = createCommonMeta($trd_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta s_int_trd_unit_qty_META = createStringMeta($s_int_trd_unit_qty);
	public static final MCMeta s_dec_trd_unit_qty_META = createStringMeta($s_dec_trd_unit_qty);
	public static final MCMeta dtl_trd_unit_cd_META = createCommonMeta($dtl_trd_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta dtl_trd_unit_nm_META = createCommonMeta($dtl_trd_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta insp_end_dt_lbl_META = createStringMeta($insp_end_dt_lbl);
	public static final MCMeta insp_end_dt_META = createCommonMeta($insp_end_dt, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta dtl_in_to_loc_cd_META = createCommonMeta($dtl_in_to_loc_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta dtl_in_to_loc_nm_META = createCommonMeta($dtl_in_to_loc_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta dtl_in_to_loc_alt_nm1_META = createCommonMeta($dtl_in_to_loc_alt_nm1, mcframe.commonMA.meta.MA_META.BP_ALT_NM1);
	public static final MCMeta dtl_in_to_loc_alt_nm2_META = createCommonMeta($dtl_in_to_loc_alt_nm2, mcframe.commonMA.meta.MA_META.BP_ALT_NM2);
	public static final MCMeta dtl_in_to_loc_alt_nm3_META = createCommonMeta($dtl_in_to_loc_alt_nm3, mcframe.commonMA.meta.MA_META.BP_ALT_NM3);
	public static final MCMeta dtl_in_to_loc_alt_nm4_META = createCommonMeta($dtl_in_to_loc_alt_nm4, mcframe.commonMA.meta.MA_META.BP_ALT_NM4);
	public static final MCMeta dlv_inst_prnt_d_rmrks_META = createCommonMeta($dlv_inst_prnt_d_rmrks, mcframe.commonMS.meta.MS_META.DLV_INST_PRINT_D_RMRKS);
	public static final MCMeta dlv_inst_d_sub_char1_META = createCommonMeta($dlv_inst_d_sub_char1, mcframe.commonMS.meta.MS_META.DLV_INST_D_SUB_CHAR1);
	public static final MCMeta dlv_inst_d_sub_char2_META = createCommonMeta($dlv_inst_d_sub_char2, mcframe.commonMS.meta.MS_META.DLV_INST_D_SUB_CHAR2);
	public static final MCMeta dlv_inst_d_sub_char3_META = createCommonMeta($dlv_inst_d_sub_char3, mcframe.commonMS.meta.MS_META.DLV_INST_D_SUB_CHAR3);
	public static final MCMeta dtl_in_to_loc_zip_cd_META = createCommonMeta($dtl_in_to_loc_zip_cd, mcframe.commonMA.meta.MA_META.ZIP_CD);
	public static final MCMeta dtl_in_to_loc_addr1_META = createCommonMeta($dtl_in_to_loc_addr1, mcframe.commonMA.meta.MA_META.ADDR1);
	public static final MCMeta dtl_in_to_loc_addr2_META = createCommonMeta($dtl_in_to_loc_addr2, mcframe.commonMA.meta.MA_META.ADDR2);
	public static final MCMeta dtl_in_to_loc_addr3_META = createCommonMeta($dtl_in_to_loc_addr3, mcframe.commonMA.meta.MA_META.ADDR3);
	public static final MCMeta dtl_in_to_loc_addr4_META = createCommonMeta($dtl_in_to_loc_addr4, mcframe.commonMA.meta.MA_META.ADDR4);
	public static final MCMeta dtl_in_to_loc_addr_META = createStringMeta($dtl_in_to_loc_addr);
	public static final MCMeta dtl_in_to_loc_tel_META = createCommonMeta($dtl_in_to_loc_tel, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta dtl_in_to_loc_fax_META = createCommonMeta($dtl_in_to_loc_fax, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta dtl_in_to_cntry_nm_META = createCommonMeta($dtl_in_to_cntry_nm, mcframe.commonMA.meta.MA_META.CNTRY_NM);

	protected static final ConstMetaList<DlvInstDtlR> constMetas = new ConstMetaList<DlvInstDtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			dlv_inst_d_no_META,
			dtl_dlv_rqst_dt_META,
			dtl_dlv_rqst_tm_META,
			trd_unit_qty_META,
			s_int_trd_unit_qty_META,
			s_dec_trd_unit_qty_META,
			dtl_trd_unit_cd_META,
			dtl_trd_unit_nm_META,
			insp_end_dt_lbl_META,
			insp_end_dt_META,
			dtl_in_to_loc_cd_META,
			dtl_in_to_loc_nm_META,
			dtl_in_to_loc_alt_nm1_META,
			dtl_in_to_loc_alt_nm2_META,
			dtl_in_to_loc_alt_nm3_META,
			dtl_in_to_loc_alt_nm4_META,
			dlv_inst_prnt_d_rmrks_META,
			dlv_inst_d_sub_char1_META,
			dlv_inst_d_sub_char2_META,
			dlv_inst_d_sub_char3_META,
			dtl_in_to_loc_zip_cd_META,
			dtl_in_to_loc_addr1_META,
			dtl_in_to_loc_addr2_META,
			dtl_in_to_loc_addr3_META,
			dtl_in_to_loc_addr4_META,
			dtl_in_to_loc_addr_META,
			dtl_in_to_loc_tel_META,
			dtl_in_to_loc_fax_META,
			dtl_in_to_cntry_nm_META
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
	protected DlvInstDtlR_MC_A(ConstMetaList<? extends DlvInstDtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DlvInstDtlR clone() {
		return (DlvInstDtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DlvInstDtlR createInstance() {
		return (DlvInstDtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DlvInstDtlR getValues(String... names) {
		return (DlvInstDtlR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 *  納入指示明細ＮＯ.<p>
	 *
	 */
	public String dlv_inst_d_no() {
		return getConstString(offset + 0, $dlv_inst_d_no);
	}

	/**
	 *  納入指示明細ＮＯ.<p>
	 *
	 */
	public void dlv_inst_d_no(String value) {
		setConstString(offset + 0, $dlv_inst_d_no, value);
	}


	/**
	 *  納期（日付）.<p>
	 *
	 */
	public MCDate dtl_dlv_rqst_dt() {
		return getConstDate(offset + 1, $dtl_dlv_rqst_dt);
	}

	/**
	 *  納期（日付）.<p>
	 *
	 */
	public void dtl_dlv_rqst_dt(MCDate value) {
		setConstDate(offset + 1, $dtl_dlv_rqst_dt, value);
	}


	/**
	 *  納期（時刻）.<p>
	 *
	 */
	public MCDate dtl_dlv_rqst_tm() {
		return getConstDate(offset + 2, $dtl_dlv_rqst_tm);
	}

	/**
	 *  納期（時刻）.<p>
	 *
	 */
	public void dtl_dlv_rqst_tm(MCDate value) {
		setConstDate(offset + 2, $dtl_dlv_rqst_tm, value);
	}


	/**
	 *  納入指示数量.<p>
	 *
	 */
	public MCNumber trd_unit_qty() {
		return getConstNumber(offset + 3, $trd_unit_qty);
	}

	/**
	 *  納入指示数量.<p>
	 *
	 */
	public void trd_unit_qty(MCNumber value) {
		setConstNumber(offset + 3, $trd_unit_qty, value);
	}

	/**
	 *  納入指示数量.<p>
	 *
	 */
	public void trd_unit_qty(int value) {
		setConstNumber(offset + 3, $trd_unit_qty, value);
	}

	/**
	 *  納入指示数量.<p>
	 *
	 */
	public void trd_unit_qty(long value) {
		setConstNumber(offset + 3, $trd_unit_qty, value);
	}

	/**
	 *  納入指示数量.<p>
	 *
	 */
	public void trd_unit_qty(float value) {
		setConstNumber(offset + 3, $trd_unit_qty, value);
	}

	/**
	 *  納入指示数量.<p>
	 *
	 */
	public void trd_unit_qty(double value) {
		setConstNumber(offset + 3, $trd_unit_qty, value);
	}


	/**
	 *  納入指示数量文字列（整数部）.<p>
	 *
	 */
	public String s_int_trd_unit_qty() {
		return getConstString(offset + 4, $s_int_trd_unit_qty);
	}

	/**
	 *  納入指示数量文字列（整数部）.<p>
	 *
	 */
	public void s_int_trd_unit_qty(String value) {
		setConstString(offset + 4, $s_int_trd_unit_qty, value);
	}


	/**
	 *  納入指示数量文字列（小数部）.<p>
	 *
	 */
	public String s_dec_trd_unit_qty() {
		return getConstString(offset + 5, $s_dec_trd_unit_qty);
	}

	/**
	 *  納入指示数量文字列（小数部）.<p>
	 *
	 */
	public void s_dec_trd_unit_qty(String value) {
		setConstString(offset + 5, $s_dec_trd_unit_qty, value);
	}


	/**
	 *  単位.<p>
	 *
	 */
	public String dtl_trd_unit_cd() {
		return getConstString(offset + 6, $dtl_trd_unit_cd);
	}

	/**
	 *  単位.<p>
	 *
	 */
	public void dtl_trd_unit_cd(String value) {
		setConstString(offset + 6, $dtl_trd_unit_cd, value);
	}


	/**
	 *  納入指示単位名.<p>
	 *
	 */
	public String dtl_trd_unit_nm() {
		return getConstString(offset + 7, $dtl_trd_unit_nm);
	}

	/**
	 *  納入指示単位名.<p>
	 *
	 */
	public void dtl_trd_unit_nm(String value) {
		setConstString(offset + 7, $dtl_trd_unit_nm, value);
	}


	/**
	 *  検査完了日（ラベル）.<p>
	 *
	 */
	public String insp_end_dt_lbl() {
		return getConstString(offset + 8, $insp_end_dt_lbl);
	}

	/**
	 *  検査完了日（ラベル）.<p>
	 *
	 */
	public void insp_end_dt_lbl(String value) {
		setConstString(offset + 8, $insp_end_dt_lbl, value);
	}


	/**
	 *  検査完了日.<p>
	 *
	 */
	public MCDate insp_end_dt() {
		return getConstDate(offset + 9, $insp_end_dt);
	}

	/**
	 *  検査完了日.<p>
	 *
	 */
	public void insp_end_dt(MCDate value) {
		setConstDate(offset + 9, $insp_end_dt, value);
	}


	/**
	 *  納入場所.<p>
	 *
	 */
	public String dtl_in_to_loc_cd() {
		return getConstString(offset + 10, $dtl_in_to_loc_cd);
	}

	/**
	 *  納入場所.<p>
	 *
	 */
	public void dtl_in_to_loc_cd(String value) {
		setConstString(offset + 10, $dtl_in_to_loc_cd, value);
	}


	/**
	 *  納入場所名.<p>
	 *
	 */
	public String dtl_in_to_loc_nm() {
		return getConstString(offset + 11, $dtl_in_to_loc_nm);
	}

	/**
	 *  納入場所名.<p>
	 *
	 */
	public void dtl_in_to_loc_nm(String value) {
		setConstString(offset + 11, $dtl_in_to_loc_nm, value);
	}


	/**
	 *  納入場所別名１.<p>
	 *
	 */
	public String dtl_in_to_loc_alt_nm1() {
		return getConstString(offset + 12, $dtl_in_to_loc_alt_nm1);
	}

	/**
	 *  納入場所別名１.<p>
	 *
	 */
	public void dtl_in_to_loc_alt_nm1(String value) {
		setConstString(offset + 12, $dtl_in_to_loc_alt_nm1, value);
	}


	/**
	 *  納入場所別名２.<p>
	 *
	 */
	public String dtl_in_to_loc_alt_nm2() {
		return getConstString(offset + 13, $dtl_in_to_loc_alt_nm2);
	}

	/**
	 *  納入場所別名２.<p>
	 *
	 */
	public void dtl_in_to_loc_alt_nm2(String value) {
		setConstString(offset + 13, $dtl_in_to_loc_alt_nm2, value);
	}


	/**
	 *  納入場所別名３.<p>
	 *
	 */
	public String dtl_in_to_loc_alt_nm3() {
		return getConstString(offset + 14, $dtl_in_to_loc_alt_nm3);
	}

	/**
	 *  納入場所別名３.<p>
	 *
	 */
	public void dtl_in_to_loc_alt_nm3(String value) {
		setConstString(offset + 14, $dtl_in_to_loc_alt_nm3, value);
	}


	/**
	 *  納入場所別名４.<p>
	 *
	 */
	public String dtl_in_to_loc_alt_nm4() {
		return getConstString(offset + 15, $dtl_in_to_loc_alt_nm4);
	}

	/**
	 *  納入場所別名４.<p>
	 *
	 */
	public void dtl_in_to_loc_alt_nm4(String value) {
		setConstString(offset + 15, $dtl_in_to_loc_alt_nm4, value);
	}


	/**
	 *  備考.<p>
	 *
	 */
	public String dlv_inst_prnt_d_rmrks() {
		return getConstString(offset + 16, $dlv_inst_prnt_d_rmrks);
	}

	/**
	 *  備考.<p>
	 *
	 */
	public void dlv_inst_prnt_d_rmrks(String value) {
		setConstString(offset + 16, $dlv_inst_prnt_d_rmrks, value);
	}


	/**
	 *  予備１.<p>
	 *
	 */
	public String dlv_inst_d_sub_char1() {
		return getConstString(offset + 17, $dlv_inst_d_sub_char1);
	}

	/**
	 *  予備１.<p>
	 *
	 */
	public void dlv_inst_d_sub_char1(String value) {
		setConstString(offset + 17, $dlv_inst_d_sub_char1, value);
	}


	/**
	 *  予備２.<p>
	 *
	 */
	public String dlv_inst_d_sub_char2() {
		return getConstString(offset + 18, $dlv_inst_d_sub_char2);
	}

	/**
	 *  予備２.<p>
	 *
	 */
	public void dlv_inst_d_sub_char2(String value) {
		setConstString(offset + 18, $dlv_inst_d_sub_char2, value);
	}


	/**
	 *  予備３.<p>
	 *
	 */
	public String dlv_inst_d_sub_char3() {
		return getConstString(offset + 19, $dlv_inst_d_sub_char3);
	}

	/**
	 *  予備３.<p>
	 *
	 */
	public void dlv_inst_d_sub_char3(String value) {
		setConstString(offset + 19, $dlv_inst_d_sub_char3, value);
	}


	/**
	 *  納入場所郵便番号.<p>
	 *
	 */
	public String dtl_in_to_loc_zip_cd() {
		return getConstString(offset + 20, $dtl_in_to_loc_zip_cd);
	}

	/**
	 *  納入場所郵便番号.<p>
	 *
	 */
	public void dtl_in_to_loc_zip_cd(String value) {
		setConstString(offset + 20, $dtl_in_to_loc_zip_cd, value);
	}


	/**
	 *  納入場所住所１.<p>
	 *
	 */
	public String dtl_in_to_loc_addr1() {
		return getConstString(offset + 21, $dtl_in_to_loc_addr1);
	}

	/**
	 *  納入場所住所１.<p>
	 *
	 */
	public void dtl_in_to_loc_addr1(String value) {
		setConstString(offset + 21, $dtl_in_to_loc_addr1, value);
	}


	/**
	 *  納入場所住所２.<p>
	 *
	 */
	public String dtl_in_to_loc_addr2() {
		return getConstString(offset + 22, $dtl_in_to_loc_addr2);
	}

	/**
	 *  納入場所住所２.<p>
	 *
	 */
	public void dtl_in_to_loc_addr2(String value) {
		setConstString(offset + 22, $dtl_in_to_loc_addr2, value);
	}


	/**
	 *  納入場所住所３.<p>
	 *
	 */
	public String dtl_in_to_loc_addr3() {
		return getConstString(offset + 23, $dtl_in_to_loc_addr3);
	}

	/**
	 *  納入場所住所３.<p>
	 *
	 */
	public void dtl_in_to_loc_addr3(String value) {
		setConstString(offset + 23, $dtl_in_to_loc_addr3, value);
	}


	/**
	 *  納入場所住所４.<p>
	 *
	 */
	public String dtl_in_to_loc_addr4() {
		return getConstString(offset + 24, $dtl_in_to_loc_addr4);
	}

	/**
	 *  納入場所住所４.<p>
	 *
	 */
	public void dtl_in_to_loc_addr4(String value) {
		setConstString(offset + 24, $dtl_in_to_loc_addr4, value);
	}


	/**
	 *  納入場所住所１－４（データ用）.<p>
	 *
	 */
	public String dtl_in_to_loc_addr() {
		return getConstString(offset + 25, $dtl_in_to_loc_addr);
	}

	/**
	 *  納入場所住所１－４（データ用）.<p>
	 *
	 */
	public void dtl_in_to_loc_addr(String value) {
		setConstString(offset + 25, $dtl_in_to_loc_addr, value);
	}


	/**
	 *  納入場所ＴＥＬ.<p>
	 *
	 */
	public String dtl_in_to_loc_tel() {
		return getConstString(offset + 26, $dtl_in_to_loc_tel);
	}

	/**
	 *  納入場所ＴＥＬ.<p>
	 *
	 */
	public void dtl_in_to_loc_tel(String value) {
		setConstString(offset + 26, $dtl_in_to_loc_tel, value);
	}


	/**
	 *  納入場所ＦＡＸ.<p>
	 *
	 */
	public String dtl_in_to_loc_fax() {
		return getConstString(offset + 27, $dtl_in_to_loc_fax);
	}

	/**
	 *  納入場所ＦＡＸ.<p>
	 *
	 */
	public void dtl_in_to_loc_fax(String value) {
		setConstString(offset + 27, $dtl_in_to_loc_fax, value);
	}


	/**
	 *  納入場所国名.<p>
	 *
	 */
	public String dtl_in_to_cntry_nm() {
		return getConstString(offset + 28, $dtl_in_to_cntry_nm);
	}

	/**
	 *  納入場所国名.<p>
	 *
	 */
	public void dtl_in_to_cntry_nm(String value) {
		setConstString(offset + 28, $dtl_in_to_cntry_nm, value);
	}


	public String getString(String name) {
		if ($dlv_inst_d_no.equalsIgnoreCase(name)) {
			return dlv_inst_d_no();
		}
		if ($s_int_trd_unit_qty.equalsIgnoreCase(name)) {
			return s_int_trd_unit_qty();
		}
		if ($s_dec_trd_unit_qty.equalsIgnoreCase(name)) {
			return s_dec_trd_unit_qty();
		}
		if ($dtl_trd_unit_cd.equalsIgnoreCase(name)) {
			return dtl_trd_unit_cd();
		}
		if ($dtl_trd_unit_nm.equalsIgnoreCase(name)) {
			return dtl_trd_unit_nm();
		}
		if ($insp_end_dt_lbl.equalsIgnoreCase(name)) {
			return insp_end_dt_lbl();
		}
		if ($dtl_in_to_loc_cd.equalsIgnoreCase(name)) {
			return dtl_in_to_loc_cd();
		}
		if ($dtl_in_to_loc_nm.equalsIgnoreCase(name)) {
			return dtl_in_to_loc_nm();
		}
		if ($dtl_in_to_loc_alt_nm1.equalsIgnoreCase(name)) {
			return dtl_in_to_loc_alt_nm1();
		}
		if ($dtl_in_to_loc_alt_nm2.equalsIgnoreCase(name)) {
			return dtl_in_to_loc_alt_nm2();
		}
		if ($dtl_in_to_loc_alt_nm3.equalsIgnoreCase(name)) {
			return dtl_in_to_loc_alt_nm3();
		}
		if ($dtl_in_to_loc_alt_nm4.equalsIgnoreCase(name)) {
			return dtl_in_to_loc_alt_nm4();
		}
		if ($dlv_inst_prnt_d_rmrks.equalsIgnoreCase(name)) {
			return dlv_inst_prnt_d_rmrks();
		}
		if ($dlv_inst_d_sub_char1.equalsIgnoreCase(name)) {
			return dlv_inst_d_sub_char1();
		}
		if ($dlv_inst_d_sub_char2.equalsIgnoreCase(name)) {
			return dlv_inst_d_sub_char2();
		}
		if ($dlv_inst_d_sub_char3.equalsIgnoreCase(name)) {
			return dlv_inst_d_sub_char3();
		}
		if ($dtl_in_to_loc_zip_cd.equalsIgnoreCase(name)) {
			return dtl_in_to_loc_zip_cd();
		}
		if ($dtl_in_to_loc_addr1.equalsIgnoreCase(name)) {
			return dtl_in_to_loc_addr1();
		}
		if ($dtl_in_to_loc_addr2.equalsIgnoreCase(name)) {
			return dtl_in_to_loc_addr2();
		}
		if ($dtl_in_to_loc_addr3.equalsIgnoreCase(name)) {
			return dtl_in_to_loc_addr3();
		}
		if ($dtl_in_to_loc_addr4.equalsIgnoreCase(name)) {
			return dtl_in_to_loc_addr4();
		}
		if ($dtl_in_to_loc_addr.equalsIgnoreCase(name)) {
			return dtl_in_to_loc_addr();
		}
		if ($dtl_in_to_loc_tel.equalsIgnoreCase(name)) {
			return dtl_in_to_loc_tel();
		}
		if ($dtl_in_to_loc_fax.equalsIgnoreCase(name)) {
			return dtl_in_to_loc_fax();
		}
		if ($dtl_in_to_cntry_nm.equalsIgnoreCase(name)) {
			return dtl_in_to_cntry_nm();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			return trd_unit_qty();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($dtl_dlv_rqst_dt.equalsIgnoreCase(name)) {
			return dtl_dlv_rqst_dt();
		}
		if ($dtl_dlv_rqst_tm.equalsIgnoreCase(name)) {
			return dtl_dlv_rqst_tm();
		}
		if ($insp_end_dt.equalsIgnoreCase(name)) {
			return insp_end_dt();
		}
		return super.getDate(name);
	}

	public String getStringNE(String name) {
		if ($dlv_inst_d_no.equalsIgnoreCase(name)) {
			return dlv_inst_d_no();
		}
		if ($s_int_trd_unit_qty.equalsIgnoreCase(name)) {
			return s_int_trd_unit_qty();
		}
		if ($s_dec_trd_unit_qty.equalsIgnoreCase(name)) {
			return s_dec_trd_unit_qty();
		}
		if ($dtl_trd_unit_cd.equalsIgnoreCase(name)) {
			return dtl_trd_unit_cd();
		}
		if ($dtl_trd_unit_nm.equalsIgnoreCase(name)) {
			return dtl_trd_unit_nm();
		}
		if ($insp_end_dt_lbl.equalsIgnoreCase(name)) {
			return insp_end_dt_lbl();
		}
		if ($dtl_in_to_loc_cd.equalsIgnoreCase(name)) {
			return dtl_in_to_loc_cd();
		}
		if ($dtl_in_to_loc_nm.equalsIgnoreCase(name)) {
			return dtl_in_to_loc_nm();
		}
		if ($dtl_in_to_loc_alt_nm1.equalsIgnoreCase(name)) {
			return dtl_in_to_loc_alt_nm1();
		}
		if ($dtl_in_to_loc_alt_nm2.equalsIgnoreCase(name)) {
			return dtl_in_to_loc_alt_nm2();
		}
		if ($dtl_in_to_loc_alt_nm3.equalsIgnoreCase(name)) {
			return dtl_in_to_loc_alt_nm3();
		}
		if ($dtl_in_to_loc_alt_nm4.equalsIgnoreCase(name)) {
			return dtl_in_to_loc_alt_nm4();
		}
		if ($dlv_inst_prnt_d_rmrks.equalsIgnoreCase(name)) {
			return dlv_inst_prnt_d_rmrks();
		}
		if ($dlv_inst_d_sub_char1.equalsIgnoreCase(name)) {
			return dlv_inst_d_sub_char1();
		}
		if ($dlv_inst_d_sub_char2.equalsIgnoreCase(name)) {
			return dlv_inst_d_sub_char2();
		}
		if ($dlv_inst_d_sub_char3.equalsIgnoreCase(name)) {
			return dlv_inst_d_sub_char3();
		}
		if ($dtl_in_to_loc_zip_cd.equalsIgnoreCase(name)) {
			return dtl_in_to_loc_zip_cd();
		}
		if ($dtl_in_to_loc_addr1.equalsIgnoreCase(name)) {
			return dtl_in_to_loc_addr1();
		}
		if ($dtl_in_to_loc_addr2.equalsIgnoreCase(name)) {
			return dtl_in_to_loc_addr2();
		}
		if ($dtl_in_to_loc_addr3.equalsIgnoreCase(name)) {
			return dtl_in_to_loc_addr3();
		}
		if ($dtl_in_to_loc_addr4.equalsIgnoreCase(name)) {
			return dtl_in_to_loc_addr4();
		}
		if ($dtl_in_to_loc_addr.equalsIgnoreCase(name)) {
			return dtl_in_to_loc_addr();
		}
		if ($dtl_in_to_loc_tel.equalsIgnoreCase(name)) {
			return dtl_in_to_loc_tel();
		}
		if ($dtl_in_to_loc_fax.equalsIgnoreCase(name)) {
			return dtl_in_to_loc_fax();
		}
		if ($dtl_in_to_cntry_nm.equalsIgnoreCase(name)) {
			return dtl_in_to_cntry_nm();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			return trd_unit_qty();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($dtl_dlv_rqst_dt.equalsIgnoreCase(name)) {
			return dtl_dlv_rqst_dt();
		}
		if ($dtl_dlv_rqst_tm.equalsIgnoreCase(name)) {
			return dtl_dlv_rqst_tm();
		}
		if ($insp_end_dt.equalsIgnoreCase(name)) {
			return insp_end_dt();
		}
		return super.getDateNE(name);
	}

	public void setString(String name, String value) {
		if ($dlv_inst_d_no.equalsIgnoreCase(name)) {
			dlv_inst_d_no(value);
			return;
		}
		if ($s_int_trd_unit_qty.equalsIgnoreCase(name)) {
			s_int_trd_unit_qty(value);
			return;
		}
		if ($s_dec_trd_unit_qty.equalsIgnoreCase(name)) {
			s_dec_trd_unit_qty(value);
			return;
		}
		if ($dtl_trd_unit_cd.equalsIgnoreCase(name)) {
			dtl_trd_unit_cd(value);
			return;
		}
		if ($dtl_trd_unit_nm.equalsIgnoreCase(name)) {
			dtl_trd_unit_nm(value);
			return;
		}
		if ($insp_end_dt_lbl.equalsIgnoreCase(name)) {
			insp_end_dt_lbl(value);
			return;
		}
		if ($dtl_in_to_loc_cd.equalsIgnoreCase(name)) {
			dtl_in_to_loc_cd(value);
			return;
		}
		if ($dtl_in_to_loc_nm.equalsIgnoreCase(name)) {
			dtl_in_to_loc_nm(value);
			return;
		}
		if ($dtl_in_to_loc_alt_nm1.equalsIgnoreCase(name)) {
			dtl_in_to_loc_alt_nm1(value);
			return;
		}
		if ($dtl_in_to_loc_alt_nm2.equalsIgnoreCase(name)) {
			dtl_in_to_loc_alt_nm2(value);
			return;
		}
		if ($dtl_in_to_loc_alt_nm3.equalsIgnoreCase(name)) {
			dtl_in_to_loc_alt_nm3(value);
			return;
		}
		if ($dtl_in_to_loc_alt_nm4.equalsIgnoreCase(name)) {
			dtl_in_to_loc_alt_nm4(value);
			return;
		}
		if ($dlv_inst_prnt_d_rmrks.equalsIgnoreCase(name)) {
			dlv_inst_prnt_d_rmrks(value);
			return;
		}
		if ($dlv_inst_d_sub_char1.equalsIgnoreCase(name)) {
			dlv_inst_d_sub_char1(value);
			return;
		}
		if ($dlv_inst_d_sub_char2.equalsIgnoreCase(name)) {
			dlv_inst_d_sub_char2(value);
			return;
		}
		if ($dlv_inst_d_sub_char3.equalsIgnoreCase(name)) {
			dlv_inst_d_sub_char3(value);
			return;
		}
		if ($dtl_in_to_loc_zip_cd.equalsIgnoreCase(name)) {
			dtl_in_to_loc_zip_cd(value);
			return;
		}
		if ($dtl_in_to_loc_addr1.equalsIgnoreCase(name)) {
			dtl_in_to_loc_addr1(value);
			return;
		}
		if ($dtl_in_to_loc_addr2.equalsIgnoreCase(name)) {
			dtl_in_to_loc_addr2(value);
			return;
		}
		if ($dtl_in_to_loc_addr3.equalsIgnoreCase(name)) {
			dtl_in_to_loc_addr3(value);
			return;
		}
		if ($dtl_in_to_loc_addr4.equalsIgnoreCase(name)) {
			dtl_in_to_loc_addr4(value);
			return;
		}
		if ($dtl_in_to_loc_addr.equalsIgnoreCase(name)) {
			dtl_in_to_loc_addr(value);
			return;
		}
		if ($dtl_in_to_loc_tel.equalsIgnoreCase(name)) {
			dtl_in_to_loc_tel(value);
			return;
		}
		if ($dtl_in_to_loc_fax.equalsIgnoreCase(name)) {
			dtl_in_to_loc_fax(value);
			return;
		}
		if ($dtl_in_to_cntry_nm.equalsIgnoreCase(name)) {
			dtl_in_to_cntry_nm(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($dtl_dlv_rqst_dt.equalsIgnoreCase(name)) {
			dtl_dlv_rqst_dt(value);
			return;
		}
		if ($dtl_dlv_rqst_tm.equalsIgnoreCase(name)) {
			dtl_dlv_rqst_tm(value);
			return;
		}
		if ($insp_end_dt.equalsIgnoreCase(name)) {
			insp_end_dt(value);
			return;
		}
		super.setDate(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($dlv_inst_d_no.equalsIgnoreCase(name)) {
			dlv_inst_d_no(value);
			return;
		}
		if ($s_int_trd_unit_qty.equalsIgnoreCase(name)) {
			s_int_trd_unit_qty(value);
			return;
		}
		if ($s_dec_trd_unit_qty.equalsIgnoreCase(name)) {
			s_dec_trd_unit_qty(value);
			return;
		}
		if ($dtl_trd_unit_cd.equalsIgnoreCase(name)) {
			dtl_trd_unit_cd(value);
			return;
		}
		if ($dtl_trd_unit_nm.equalsIgnoreCase(name)) {
			dtl_trd_unit_nm(value);
			return;
		}
		if ($insp_end_dt_lbl.equalsIgnoreCase(name)) {
			insp_end_dt_lbl(value);
			return;
		}
		if ($dtl_in_to_loc_cd.equalsIgnoreCase(name)) {
			dtl_in_to_loc_cd(value);
			return;
		}
		if ($dtl_in_to_loc_nm.equalsIgnoreCase(name)) {
			dtl_in_to_loc_nm(value);
			return;
		}
		if ($dtl_in_to_loc_alt_nm1.equalsIgnoreCase(name)) {
			dtl_in_to_loc_alt_nm1(value);
			return;
		}
		if ($dtl_in_to_loc_alt_nm2.equalsIgnoreCase(name)) {
			dtl_in_to_loc_alt_nm2(value);
			return;
		}
		if ($dtl_in_to_loc_alt_nm3.equalsIgnoreCase(name)) {
			dtl_in_to_loc_alt_nm3(value);
			return;
		}
		if ($dtl_in_to_loc_alt_nm4.equalsIgnoreCase(name)) {
			dtl_in_to_loc_alt_nm4(value);
			return;
		}
		if ($dlv_inst_prnt_d_rmrks.equalsIgnoreCase(name)) {
			dlv_inst_prnt_d_rmrks(value);
			return;
		}
		if ($dlv_inst_d_sub_char1.equalsIgnoreCase(name)) {
			dlv_inst_d_sub_char1(value);
			return;
		}
		if ($dlv_inst_d_sub_char2.equalsIgnoreCase(name)) {
			dlv_inst_d_sub_char2(value);
			return;
		}
		if ($dlv_inst_d_sub_char3.equalsIgnoreCase(name)) {
			dlv_inst_d_sub_char3(value);
			return;
		}
		if ($dtl_in_to_loc_zip_cd.equalsIgnoreCase(name)) {
			dtl_in_to_loc_zip_cd(value);
			return;
		}
		if ($dtl_in_to_loc_addr1.equalsIgnoreCase(name)) {
			dtl_in_to_loc_addr1(value);
			return;
		}
		if ($dtl_in_to_loc_addr2.equalsIgnoreCase(name)) {
			dtl_in_to_loc_addr2(value);
			return;
		}
		if ($dtl_in_to_loc_addr3.equalsIgnoreCase(name)) {
			dtl_in_to_loc_addr3(value);
			return;
		}
		if ($dtl_in_to_loc_addr4.equalsIgnoreCase(name)) {
			dtl_in_to_loc_addr4(value);
			return;
		}
		if ($dtl_in_to_loc_addr.equalsIgnoreCase(name)) {
			dtl_in_to_loc_addr(value);
			return;
		}
		if ($dtl_in_to_loc_tel.equalsIgnoreCase(name)) {
			dtl_in_to_loc_tel(value);
			return;
		}
		if ($dtl_in_to_loc_fax.equalsIgnoreCase(name)) {
			dtl_in_to_loc_fax(value);
			return;
		}
		if ($dtl_in_to_cntry_nm.equalsIgnoreCase(name)) {
			dtl_in_to_cntry_nm(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($dtl_dlv_rqst_dt.equalsIgnoreCase(name)) {
			dtl_dlv_rqst_dt(value);
			return;
		}
		if ($dtl_dlv_rqst_tm.equalsIgnoreCase(name)) {
			dtl_dlv_rqst_tm(value);
			return;
		}
		if ($insp_end_dt.equalsIgnoreCase(name)) {
			insp_end_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}



}

