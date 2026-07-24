package mcframe.commonMSBC.MSBCR1030;

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
 * ブロック"OperBomYld"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class OperBomYldR_MC_A extends MCConstRow {

	/**
	 *  リビジョンＮＯ.<p>
	 *
	 */
	public static final String $mfg_inst_rev_no = "mfg_inst_rev_no";
	/**
	 *  工程着手予定日.<p>
	 *
	 */
	public static final String $st_schd_dt = "st_schd_dt";
	/**
	 *  工程着手予定時刻.<p>
	 *
	 */
	public static final String $st_schd_hm = "st_schd_hm";
	/**
	 *  工程完了予定日.<p>
	 *
	 */
	public static final String $end_schd_dt = "end_schd_dt";
	/**
	 *  工程完了予定時刻.<p>
	 *
	 */
	public static final String $end_schd_hm = "end_schd_hm";
	/**
	 *  工程単位指図数.<p>
	 *
	 */
	public static final String $oper_unit_inst_qty = "oper_unit_inst_qty";
	/**
	 *  工程単位指図数文字列（整数部）.<p>
	 *
	 */
	public static final String $s_int_oper_unit_inst_qty = "s_int_oper_unit_inst_qty";
	/**
	 *  工程単位指図数文字列（小数部）.<p>
	 *
	 */
	public static final String $s_dec_oper_unit_inst_qty = "s_dec_oper_unit_inst_qty";
	/**
	 *  単位（工程単位指図）.<p>
	 *
	 */
	public static final String $oper_unit_cd = "oper_unit_cd";
	/**
	 *  単位名（工程単位指図）.<p>
	 *
	 */
	public static final String $oper_unit_nm = "oper_unit_nm";
	/**
	 *  工順.<p>
	 *
	 */
	public static final String $oper_disp_seq = "oper_disp_seq";
	/**
	 *  工程ＬＴ.<p>
	 *
	 */
	public static final String $oper_lt = "oper_lt";
	/**
	 *  工程LT加算基準数.<p>
	 *
	 */
	public static final String $oper_lt_add_qty = "oper_lt_add_qty";
	/**
	 *  工程LT加算基準数文字列（整数部）.<p>
	 *
	 */
	public static final String $s_int_oper_lt_add_qty = "s_int_oper_lt_add_qty";
	/**
	 *  工程LT加算基準数文字列（小数部）.<p>
	 *
	 */
	public static final String $s_dec_oper_lt_add_qty = "s_dec_oper_lt_add_qty";
	/**
	 *  工程オフセット区分.<p>
	 *
	 */
	public static final String $oper_offst_typ = "oper_offst_typ";
	/**
	 *  工程オフセット区分名.<p>
	 *
	 */
	public static final String $oper_offst_typ_nm = "oper_offst_typ_nm";
	/**
	 *  工程オフセット.<p>
	 *
	 */
	public static final String $oper_offst = "oper_offst";
	/**
	 *  工程オフセット加算基準数.<p>
	 *
	 */
	public static final String $oper_offst_add_qty = "oper_offst_add_qty";
	/**
	 *  工程オフセット加算基準数文字列（整数部）.<p>
	 *
	 */
	public static final String $s_int_oper_offst_add_qty = "s_int_oper_offst_add_qty";
	/**
	 *  工程オフセット加算基準数文字列（小数部）.<p>
	 *
	 */
	public static final String $s_dec_oper_offst_add_qty = "s_dec_oper_offst_add_qty";
	/**
	 *  工程基準単位数.<p>
	 *
	 */
	public static final String $oper_std_qty = "oper_std_qty";
	/**
	 *  工程基準単位数文字列（整数部）.<p>
	 *
	 */
	public static final String $s_int_oper_std_qty = "s_int_oper_std_qty";
	/**
	 *  工程基準単位数文字列（小数部）.<p>
	 *
	 */
	public static final String $s_dec_oper_std_qty = "s_dec_oper_std_qty";
	/**
	 *  工程換算単位数.<p>
	 *
	 */
	public static final String $oper_conv_qty = "oper_conv_qty";
	/**
	 *  工程換算単位数文字列（整数部）.<p>
	 *
	 */
	public static final String $s_int_oper_conv_qty = "s_int_oper_conv_qty";
	/**
	 *  工程換算単位数文字列（小数部）.<p>
	 *
	 */
	public static final String $s_dec_oper_conv_qty = "s_dec_oper_conv_qty";
	/**
	 *  工程指図予備１.<p>
	 *
	 */
	public static final String $oper_inst_sub_char1 = "oper_inst_sub_char1";
	/**
	 *  工程指図予備２.<p>
	 *
	 */
	public static final String $oper_inst_sub_char2 = "oper_inst_sub_char2";
	/**
	 *  工程指図予備３.<p>
	 *
	 */
	public static final String $oper_inst_sub_char3 = "oper_inst_sub_char3";


	public static final MCMeta mfg_inst_rev_no_META = createCommonMeta($mfg_inst_rev_no, mcframe.commonMA.meta.MA_META.SLIP_SEQ);
	public static final MCMeta st_schd_dt_META = createCommonMeta($st_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta st_schd_hm_META = createCommonMeta($st_schd_hm, mcframe.commonMA.meta.MA_META.HM);
	public static final MCMeta end_schd_dt_META = createCommonMeta($end_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta end_schd_hm_META = createCommonMeta($end_schd_hm, mcframe.commonMA.meta.MA_META.HM);
	public static final MCMeta oper_unit_inst_qty_META = createCommonMeta($oper_unit_inst_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta s_int_oper_unit_inst_qty_META = createStringMeta($s_int_oper_unit_inst_qty);
	public static final MCMeta s_dec_oper_unit_inst_qty_META = createStringMeta($s_dec_oper_unit_inst_qty);
	public static final MCMeta oper_unit_cd_META = createCommonMeta($oper_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta oper_unit_nm_META = createCommonMeta($oper_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta oper_disp_seq_META = createCommonMeta($oper_disp_seq, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta oper_lt_META = createCommonMeta($oper_lt, mcframe.commonMA.meta.MA_META.LT);
	public static final MCMeta oper_lt_add_qty_META = createCommonMeta($oper_lt_add_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta s_int_oper_lt_add_qty_META = createStringMeta($s_int_oper_lt_add_qty);
	public static final MCMeta s_dec_oper_lt_add_qty_META = createStringMeta($s_dec_oper_lt_add_qty);
	public static final MCMeta oper_offst_typ_META = createCommonMeta($oper_offst_typ, mcframe.commonMA.meta.MA_META.OFFST_TYP);
	public static final MCMeta oper_offst_typ_nm_META = createStringMeta($oper_offst_typ_nm);
	public static final MCMeta oper_offst_META = createCommonMeta($oper_offst, mcframe.commonMA.meta.MA_META.OFFST);
	public static final MCMeta oper_offst_add_qty_META = createCommonMeta($oper_offst_add_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta s_int_oper_offst_add_qty_META = createStringMeta($s_int_oper_offst_add_qty);
	public static final MCMeta s_dec_oper_offst_add_qty_META = createStringMeta($s_dec_oper_offst_add_qty);
	public static final MCMeta oper_std_qty_META = createCommonMeta($oper_std_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta s_int_oper_std_qty_META = createStringMeta($s_int_oper_std_qty);
	public static final MCMeta s_dec_oper_std_qty_META = createStringMeta($s_dec_oper_std_qty);
	public static final MCMeta oper_conv_qty_META = createCommonMeta($oper_conv_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta s_int_oper_conv_qty_META = createStringMeta($s_int_oper_conv_qty);
	public static final MCMeta s_dec_oper_conv_qty_META = createStringMeta($s_dec_oper_conv_qty);
	public static final MCMeta oper_inst_sub_char1_META = createCommonMeta($oper_inst_sub_char1, mcframe.commonMS.meta.MS_META.OPER_INST_SUB_CHAR1);
	public static final MCMeta oper_inst_sub_char2_META = createCommonMeta($oper_inst_sub_char2, mcframe.commonMS.meta.MS_META.OPER_INST_SUB_CHAR2);
	public static final MCMeta oper_inst_sub_char3_META = createCommonMeta($oper_inst_sub_char3, mcframe.commonMS.meta.MS_META.OPER_INST_SUB_CHAR3);

	protected static final ConstMetaList<OperBomYldR> constMetas = new ConstMetaList<OperBomYldR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			mfg_inst_rev_no_META,
			st_schd_dt_META,
			st_schd_hm_META,
			end_schd_dt_META,
			end_schd_hm_META,
			oper_unit_inst_qty_META,
			s_int_oper_unit_inst_qty_META,
			s_dec_oper_unit_inst_qty_META,
			oper_unit_cd_META,
			oper_unit_nm_META,
			oper_disp_seq_META,
			oper_lt_META,
			oper_lt_add_qty_META,
			s_int_oper_lt_add_qty_META,
			s_dec_oper_lt_add_qty_META,
			oper_offst_typ_META,
			oper_offst_typ_nm_META,
			oper_offst_META,
			oper_offst_add_qty_META,
			s_int_oper_offst_add_qty_META,
			s_dec_oper_offst_add_qty_META,
			oper_std_qty_META,
			s_int_oper_std_qty_META,
			s_dec_oper_std_qty_META,
			oper_conv_qty_META,
			s_int_oper_conv_qty_META,
			s_dec_oper_conv_qty_META,
			oper_inst_sub_char1_META,
			oper_inst_sub_char2_META,
			oper_inst_sub_char3_META
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
	protected OperBomYldR_MC_A(ConstMetaList<? extends OperBomYldR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public OperBomYldR clone() {
		return (OperBomYldR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public OperBomYldR createInstance() {
		return (OperBomYldR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public OperBomYldR getValues(String... names) {
		return (OperBomYldR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 *  リビジョンＮＯ.<p>
	 *
	 */
	public MCNumber mfg_inst_rev_no() {
		return getConstNumber(offset + 0, $mfg_inst_rev_no);
	}

	/**
	 *  リビジョンＮＯ.<p>
	 *
	 */
	public void mfg_inst_rev_no(MCNumber value) {
		setConstNumber(offset + 0, $mfg_inst_rev_no, value);
	}

	/**
	 *  リビジョンＮＯ.<p>
	 *
	 */
	public void mfg_inst_rev_no(int value) {
		setConstNumber(offset + 0, $mfg_inst_rev_no, value);
	}

	/**
	 *  リビジョンＮＯ.<p>
	 *
	 */
	public void mfg_inst_rev_no(long value) {
		setConstNumber(offset + 0, $mfg_inst_rev_no, value);
	}

	/**
	 *  リビジョンＮＯ.<p>
	 *
	 */
	public void mfg_inst_rev_no(float value) {
		setConstNumber(offset + 0, $mfg_inst_rev_no, value);
	}

	/**
	 *  リビジョンＮＯ.<p>
	 *
	 */
	public void mfg_inst_rev_no(double value) {
		setConstNumber(offset + 0, $mfg_inst_rev_no, value);
	}


	/**
	 *  工程着手予定日.<p>
	 *
	 */
	public MCDate st_schd_dt() {
		return getConstDate(offset + 1, $st_schd_dt);
	}

	/**
	 *  工程着手予定日.<p>
	 *
	 */
	public void st_schd_dt(MCDate value) {
		setConstDate(offset + 1, $st_schd_dt, value);
	}


	/**
	 *  工程着手予定時刻.<p>
	 *
	 */
	public MCDate st_schd_hm() {
		return getConstDate(offset + 2, $st_schd_hm);
	}

	/**
	 *  工程着手予定時刻.<p>
	 *
	 */
	public void st_schd_hm(MCDate value) {
		setConstDate(offset + 2, $st_schd_hm, value);
	}


	/**
	 *  工程完了予定日.<p>
	 *
	 */
	public MCDate end_schd_dt() {
		return getConstDate(offset + 3, $end_schd_dt);
	}

	/**
	 *  工程完了予定日.<p>
	 *
	 */
	public void end_schd_dt(MCDate value) {
		setConstDate(offset + 3, $end_schd_dt, value);
	}


	/**
	 *  工程完了予定時刻.<p>
	 *
	 */
	public MCDate end_schd_hm() {
		return getConstDate(offset + 4, $end_schd_hm);
	}

	/**
	 *  工程完了予定時刻.<p>
	 *
	 */
	public void end_schd_hm(MCDate value) {
		setConstDate(offset + 4, $end_schd_hm, value);
	}


	/**
	 *  工程単位指図数.<p>
	 *
	 */
	public MCNumber oper_unit_inst_qty() {
		return getConstNumber(offset + 5, $oper_unit_inst_qty);
	}

	/**
	 *  工程単位指図数.<p>
	 *
	 */
	public void oper_unit_inst_qty(MCNumber value) {
		setConstNumber(offset + 5, $oper_unit_inst_qty, value);
	}

	/**
	 *  工程単位指図数.<p>
	 *
	 */
	public void oper_unit_inst_qty(int value) {
		setConstNumber(offset + 5, $oper_unit_inst_qty, value);
	}

	/**
	 *  工程単位指図数.<p>
	 *
	 */
	public void oper_unit_inst_qty(long value) {
		setConstNumber(offset + 5, $oper_unit_inst_qty, value);
	}

	/**
	 *  工程単位指図数.<p>
	 *
	 */
	public void oper_unit_inst_qty(float value) {
		setConstNumber(offset + 5, $oper_unit_inst_qty, value);
	}

	/**
	 *  工程単位指図数.<p>
	 *
	 */
	public void oper_unit_inst_qty(double value) {
		setConstNumber(offset + 5, $oper_unit_inst_qty, value);
	}


	/**
	 *  工程単位指図数文字列（整数部）.<p>
	 *
	 */
	public String s_int_oper_unit_inst_qty() {
		return getConstString(offset + 6, $s_int_oper_unit_inst_qty);
	}

	/**
	 *  工程単位指図数文字列（整数部）.<p>
	 *
	 */
	public void s_int_oper_unit_inst_qty(String value) {
		setConstString(offset + 6, $s_int_oper_unit_inst_qty, value);
	}


	/**
	 *  工程単位指図数文字列（小数部）.<p>
	 *
	 */
	public String s_dec_oper_unit_inst_qty() {
		return getConstString(offset + 7, $s_dec_oper_unit_inst_qty);
	}

	/**
	 *  工程単位指図数文字列（小数部）.<p>
	 *
	 */
	public void s_dec_oper_unit_inst_qty(String value) {
		setConstString(offset + 7, $s_dec_oper_unit_inst_qty, value);
	}


	/**
	 *  単位（工程単位指図）.<p>
	 *
	 */
	public String oper_unit_cd() {
		return getConstString(offset + 8, $oper_unit_cd);
	}

	/**
	 *  単位（工程単位指図）.<p>
	 *
	 */
	public void oper_unit_cd(String value) {
		setConstString(offset + 8, $oper_unit_cd, value);
	}


	/**
	 *  単位名（工程単位指図）.<p>
	 *
	 */
	public String oper_unit_nm() {
		return getConstString(offset + 9, $oper_unit_nm);
	}

	/**
	 *  単位名（工程単位指図）.<p>
	 *
	 */
	public void oper_unit_nm(String value) {
		setConstString(offset + 9, $oper_unit_nm, value);
	}


	/**
	 *  工順.<p>
	 *
	 */
	public MCNumber oper_disp_seq() {
		return getConstNumber(offset + 10, $oper_disp_seq);
	}

	/**
	 *  工順.<p>
	 *
	 */
	public void oper_disp_seq(MCNumber value) {
		setConstNumber(offset + 10, $oper_disp_seq, value);
	}

	/**
	 *  工順.<p>
	 *
	 */
	public void oper_disp_seq(int value) {
		setConstNumber(offset + 10, $oper_disp_seq, value);
	}

	/**
	 *  工順.<p>
	 *
	 */
	public void oper_disp_seq(long value) {
		setConstNumber(offset + 10, $oper_disp_seq, value);
	}

	/**
	 *  工順.<p>
	 *
	 */
	public void oper_disp_seq(float value) {
		setConstNumber(offset + 10, $oper_disp_seq, value);
	}

	/**
	 *  工順.<p>
	 *
	 */
	public void oper_disp_seq(double value) {
		setConstNumber(offset + 10, $oper_disp_seq, value);
	}


	/**
	 *  工程ＬＴ.<p>
	 *
	 */
	public MCNumber oper_lt() {
		return getConstNumber(offset + 11, $oper_lt);
	}

	/**
	 *  工程ＬＴ.<p>
	 *
	 */
	public void oper_lt(MCNumber value) {
		setConstNumber(offset + 11, $oper_lt, value);
	}

	/**
	 *  工程ＬＴ.<p>
	 *
	 */
	public void oper_lt(int value) {
		setConstNumber(offset + 11, $oper_lt, value);
	}

	/**
	 *  工程ＬＴ.<p>
	 *
	 */
	public void oper_lt(long value) {
		setConstNumber(offset + 11, $oper_lt, value);
	}

	/**
	 *  工程ＬＴ.<p>
	 *
	 */
	public void oper_lt(float value) {
		setConstNumber(offset + 11, $oper_lt, value);
	}

	/**
	 *  工程ＬＴ.<p>
	 *
	 */
	public void oper_lt(double value) {
		setConstNumber(offset + 11, $oper_lt, value);
	}


	/**
	 *  工程LT加算基準数.<p>
	 *
	 */
	public MCNumber oper_lt_add_qty() {
		return getConstNumber(offset + 12, $oper_lt_add_qty);
	}

	/**
	 *  工程LT加算基準数.<p>
	 *
	 */
	public void oper_lt_add_qty(MCNumber value) {
		setConstNumber(offset + 12, $oper_lt_add_qty, value);
	}

	/**
	 *  工程LT加算基準数.<p>
	 *
	 */
	public void oper_lt_add_qty(int value) {
		setConstNumber(offset + 12, $oper_lt_add_qty, value);
	}

	/**
	 *  工程LT加算基準数.<p>
	 *
	 */
	public void oper_lt_add_qty(long value) {
		setConstNumber(offset + 12, $oper_lt_add_qty, value);
	}

	/**
	 *  工程LT加算基準数.<p>
	 *
	 */
	public void oper_lt_add_qty(float value) {
		setConstNumber(offset + 12, $oper_lt_add_qty, value);
	}

	/**
	 *  工程LT加算基準数.<p>
	 *
	 */
	public void oper_lt_add_qty(double value) {
		setConstNumber(offset + 12, $oper_lt_add_qty, value);
	}


	/**
	 *  工程LT加算基準数文字列（整数部）.<p>
	 *
	 */
	public String s_int_oper_lt_add_qty() {
		return getConstString(offset + 13, $s_int_oper_lt_add_qty);
	}

	/**
	 *  工程LT加算基準数文字列（整数部）.<p>
	 *
	 */
	public void s_int_oper_lt_add_qty(String value) {
		setConstString(offset + 13, $s_int_oper_lt_add_qty, value);
	}


	/**
	 *  工程LT加算基準数文字列（小数部）.<p>
	 *
	 */
	public String s_dec_oper_lt_add_qty() {
		return getConstString(offset + 14, $s_dec_oper_lt_add_qty);
	}

	/**
	 *  工程LT加算基準数文字列（小数部）.<p>
	 *
	 */
	public void s_dec_oper_lt_add_qty(String value) {
		setConstString(offset + 14, $s_dec_oper_lt_add_qty, value);
	}


	/**
	 *  工程オフセット区分.<p>
	 *
	 */
	public String oper_offst_typ() {
		return getConstString(offset + 15, $oper_offst_typ);
	}

	/**
	 *  工程オフセット区分.<p>
	 *
	 */
	public void oper_offst_typ(String value) {
		setConstString(offset + 15, $oper_offst_typ, value);
	}


	/**
	 *  工程オフセット区分名.<p>
	 *
	 */
	public String oper_offst_typ_nm() {
		return getConstString(offset + 16, $oper_offst_typ_nm);
	}

	/**
	 *  工程オフセット区分名.<p>
	 *
	 */
	public void oper_offst_typ_nm(String value) {
		setConstString(offset + 16, $oper_offst_typ_nm, value);
	}


	/**
	 *  工程オフセット.<p>
	 *
	 */
	public MCNumber oper_offst() {
		return getConstNumber(offset + 17, $oper_offst);
	}

	/**
	 *  工程オフセット.<p>
	 *
	 */
	public void oper_offst(MCNumber value) {
		setConstNumber(offset + 17, $oper_offst, value);
	}

	/**
	 *  工程オフセット.<p>
	 *
	 */
	public void oper_offst(int value) {
		setConstNumber(offset + 17, $oper_offst, value);
	}

	/**
	 *  工程オフセット.<p>
	 *
	 */
	public void oper_offst(long value) {
		setConstNumber(offset + 17, $oper_offst, value);
	}

	/**
	 *  工程オフセット.<p>
	 *
	 */
	public void oper_offst(float value) {
		setConstNumber(offset + 17, $oper_offst, value);
	}

	/**
	 *  工程オフセット.<p>
	 *
	 */
	public void oper_offst(double value) {
		setConstNumber(offset + 17, $oper_offst, value);
	}


	/**
	 *  工程オフセット加算基準数.<p>
	 *
	 */
	public MCNumber oper_offst_add_qty() {
		return getConstNumber(offset + 18, $oper_offst_add_qty);
	}

	/**
	 *  工程オフセット加算基準数.<p>
	 *
	 */
	public void oper_offst_add_qty(MCNumber value) {
		setConstNumber(offset + 18, $oper_offst_add_qty, value);
	}

	/**
	 *  工程オフセット加算基準数.<p>
	 *
	 */
	public void oper_offst_add_qty(int value) {
		setConstNumber(offset + 18, $oper_offst_add_qty, value);
	}

	/**
	 *  工程オフセット加算基準数.<p>
	 *
	 */
	public void oper_offst_add_qty(long value) {
		setConstNumber(offset + 18, $oper_offst_add_qty, value);
	}

	/**
	 *  工程オフセット加算基準数.<p>
	 *
	 */
	public void oper_offst_add_qty(float value) {
		setConstNumber(offset + 18, $oper_offst_add_qty, value);
	}

	/**
	 *  工程オフセット加算基準数.<p>
	 *
	 */
	public void oper_offst_add_qty(double value) {
		setConstNumber(offset + 18, $oper_offst_add_qty, value);
	}


	/**
	 *  工程オフセット加算基準数文字列（整数部）.<p>
	 *
	 */
	public String s_int_oper_offst_add_qty() {
		return getConstString(offset + 19, $s_int_oper_offst_add_qty);
	}

	/**
	 *  工程オフセット加算基準数文字列（整数部）.<p>
	 *
	 */
	public void s_int_oper_offst_add_qty(String value) {
		setConstString(offset + 19, $s_int_oper_offst_add_qty, value);
	}


	/**
	 *  工程オフセット加算基準数文字列（小数部）.<p>
	 *
	 */
	public String s_dec_oper_offst_add_qty() {
		return getConstString(offset + 20, $s_dec_oper_offst_add_qty);
	}

	/**
	 *  工程オフセット加算基準数文字列（小数部）.<p>
	 *
	 */
	public void s_dec_oper_offst_add_qty(String value) {
		setConstString(offset + 20, $s_dec_oper_offst_add_qty, value);
	}


	/**
	 *  工程基準単位数.<p>
	 *
	 */
	public MCNumber oper_std_qty() {
		return getConstNumber(offset + 21, $oper_std_qty);
	}

	/**
	 *  工程基準単位数.<p>
	 *
	 */
	public void oper_std_qty(MCNumber value) {
		setConstNumber(offset + 21, $oper_std_qty, value);
	}

	/**
	 *  工程基準単位数.<p>
	 *
	 */
	public void oper_std_qty(int value) {
		setConstNumber(offset + 21, $oper_std_qty, value);
	}

	/**
	 *  工程基準単位数.<p>
	 *
	 */
	public void oper_std_qty(long value) {
		setConstNumber(offset + 21, $oper_std_qty, value);
	}

	/**
	 *  工程基準単位数.<p>
	 *
	 */
	public void oper_std_qty(float value) {
		setConstNumber(offset + 21, $oper_std_qty, value);
	}

	/**
	 *  工程基準単位数.<p>
	 *
	 */
	public void oper_std_qty(double value) {
		setConstNumber(offset + 21, $oper_std_qty, value);
	}


	/**
	 *  工程基準単位数文字列（整数部）.<p>
	 *
	 */
	public String s_int_oper_std_qty() {
		return getConstString(offset + 22, $s_int_oper_std_qty);
	}

	/**
	 *  工程基準単位数文字列（整数部）.<p>
	 *
	 */
	public void s_int_oper_std_qty(String value) {
		setConstString(offset + 22, $s_int_oper_std_qty, value);
	}


	/**
	 *  工程基準単位数文字列（小数部）.<p>
	 *
	 */
	public String s_dec_oper_std_qty() {
		return getConstString(offset + 23, $s_dec_oper_std_qty);
	}

	/**
	 *  工程基準単位数文字列（小数部）.<p>
	 *
	 */
	public void s_dec_oper_std_qty(String value) {
		setConstString(offset + 23, $s_dec_oper_std_qty, value);
	}


	/**
	 *  工程換算単位数.<p>
	 *
	 */
	public MCNumber oper_conv_qty() {
		return getConstNumber(offset + 24, $oper_conv_qty);
	}

	/**
	 *  工程換算単位数.<p>
	 *
	 */
	public void oper_conv_qty(MCNumber value) {
		setConstNumber(offset + 24, $oper_conv_qty, value);
	}

	/**
	 *  工程換算単位数.<p>
	 *
	 */
	public void oper_conv_qty(int value) {
		setConstNumber(offset + 24, $oper_conv_qty, value);
	}

	/**
	 *  工程換算単位数.<p>
	 *
	 */
	public void oper_conv_qty(long value) {
		setConstNumber(offset + 24, $oper_conv_qty, value);
	}

	/**
	 *  工程換算単位数.<p>
	 *
	 */
	public void oper_conv_qty(float value) {
		setConstNumber(offset + 24, $oper_conv_qty, value);
	}

	/**
	 *  工程換算単位数.<p>
	 *
	 */
	public void oper_conv_qty(double value) {
		setConstNumber(offset + 24, $oper_conv_qty, value);
	}


	/**
	 *  工程換算単位数文字列（整数部）.<p>
	 *
	 */
	public String s_int_oper_conv_qty() {
		return getConstString(offset + 25, $s_int_oper_conv_qty);
	}

	/**
	 *  工程換算単位数文字列（整数部）.<p>
	 *
	 */
	public void s_int_oper_conv_qty(String value) {
		setConstString(offset + 25, $s_int_oper_conv_qty, value);
	}


	/**
	 *  工程換算単位数文字列（小数部）.<p>
	 *
	 */
	public String s_dec_oper_conv_qty() {
		return getConstString(offset + 26, $s_dec_oper_conv_qty);
	}

	/**
	 *  工程換算単位数文字列（小数部）.<p>
	 *
	 */
	public void s_dec_oper_conv_qty(String value) {
		setConstString(offset + 26, $s_dec_oper_conv_qty, value);
	}


	/**
	 *  工程指図予備１.<p>
	 *
	 */
	public String oper_inst_sub_char1() {
		return getConstString(offset + 27, $oper_inst_sub_char1);
	}

	/**
	 *  工程指図予備１.<p>
	 *
	 */
	public void oper_inst_sub_char1(String value) {
		setConstString(offset + 27, $oper_inst_sub_char1, value);
	}


	/**
	 *  工程指図予備２.<p>
	 *
	 */
	public String oper_inst_sub_char2() {
		return getConstString(offset + 28, $oper_inst_sub_char2);
	}

	/**
	 *  工程指図予備２.<p>
	 *
	 */
	public void oper_inst_sub_char2(String value) {
		setConstString(offset + 28, $oper_inst_sub_char2, value);
	}


	/**
	 *  工程指図予備３.<p>
	 *
	 */
	public String oper_inst_sub_char3() {
		return getConstString(offset + 29, $oper_inst_sub_char3);
	}

	/**
	 *  工程指図予備３.<p>
	 *
	 */
	public void oper_inst_sub_char3(String value) {
		setConstString(offset + 29, $oper_inst_sub_char3, value);
	}


	public String getString(String name) {
		if ($s_int_oper_unit_inst_qty.equalsIgnoreCase(name)) {
			return s_int_oper_unit_inst_qty();
		}
		if ($s_dec_oper_unit_inst_qty.equalsIgnoreCase(name)) {
			return s_dec_oper_unit_inst_qty();
		}
		if ($oper_unit_cd.equalsIgnoreCase(name)) {
			return oper_unit_cd();
		}
		if ($oper_unit_nm.equalsIgnoreCase(name)) {
			return oper_unit_nm();
		}
		if ($s_int_oper_lt_add_qty.equalsIgnoreCase(name)) {
			return s_int_oper_lt_add_qty();
		}
		if ($s_dec_oper_lt_add_qty.equalsIgnoreCase(name)) {
			return s_dec_oper_lt_add_qty();
		}
		if ($oper_offst_typ.equalsIgnoreCase(name)) {
			return oper_offst_typ();
		}
		if ($oper_offst_typ_nm.equalsIgnoreCase(name)) {
			return oper_offst_typ_nm();
		}
		if ($s_int_oper_offst_add_qty.equalsIgnoreCase(name)) {
			return s_int_oper_offst_add_qty();
		}
		if ($s_dec_oper_offst_add_qty.equalsIgnoreCase(name)) {
			return s_dec_oper_offst_add_qty();
		}
		if ($s_int_oper_std_qty.equalsIgnoreCase(name)) {
			return s_int_oper_std_qty();
		}
		if ($s_dec_oper_std_qty.equalsIgnoreCase(name)) {
			return s_dec_oper_std_qty();
		}
		if ($s_int_oper_conv_qty.equalsIgnoreCase(name)) {
			return s_int_oper_conv_qty();
		}
		if ($s_dec_oper_conv_qty.equalsIgnoreCase(name)) {
			return s_dec_oper_conv_qty();
		}
		if ($oper_inst_sub_char1.equalsIgnoreCase(name)) {
			return oper_inst_sub_char1();
		}
		if ($oper_inst_sub_char2.equalsIgnoreCase(name)) {
			return oper_inst_sub_char2();
		}
		if ($oper_inst_sub_char3.equalsIgnoreCase(name)) {
			return oper_inst_sub_char3();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($mfg_inst_rev_no.equalsIgnoreCase(name)) {
			return mfg_inst_rev_no();
		}
		if ($oper_unit_inst_qty.equalsIgnoreCase(name)) {
			return oper_unit_inst_qty();
		}
		if ($oper_disp_seq.equalsIgnoreCase(name)) {
			return oper_disp_seq();
		}
		if ($oper_lt.equalsIgnoreCase(name)) {
			return oper_lt();
		}
		if ($oper_lt_add_qty.equalsIgnoreCase(name)) {
			return oper_lt_add_qty();
		}
		if ($oper_offst.equalsIgnoreCase(name)) {
			return oper_offst();
		}
		if ($oper_offst_add_qty.equalsIgnoreCase(name)) {
			return oper_offst_add_qty();
		}
		if ($oper_std_qty.equalsIgnoreCase(name)) {
			return oper_std_qty();
		}
		if ($oper_conv_qty.equalsIgnoreCase(name)) {
			return oper_conv_qty();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($st_schd_dt.equalsIgnoreCase(name)) {
			return st_schd_dt();
		}
		if ($st_schd_hm.equalsIgnoreCase(name)) {
			return st_schd_hm();
		}
		if ($end_schd_dt.equalsIgnoreCase(name)) {
			return end_schd_dt();
		}
		if ($end_schd_hm.equalsIgnoreCase(name)) {
			return end_schd_hm();
		}
		return super.getDate(name);
	}

	public String getStringNE(String name) {
		if ($s_int_oper_unit_inst_qty.equalsIgnoreCase(name)) {
			return s_int_oper_unit_inst_qty();
		}
		if ($s_dec_oper_unit_inst_qty.equalsIgnoreCase(name)) {
			return s_dec_oper_unit_inst_qty();
		}
		if ($oper_unit_cd.equalsIgnoreCase(name)) {
			return oper_unit_cd();
		}
		if ($oper_unit_nm.equalsIgnoreCase(name)) {
			return oper_unit_nm();
		}
		if ($s_int_oper_lt_add_qty.equalsIgnoreCase(name)) {
			return s_int_oper_lt_add_qty();
		}
		if ($s_dec_oper_lt_add_qty.equalsIgnoreCase(name)) {
			return s_dec_oper_lt_add_qty();
		}
		if ($oper_offst_typ.equalsIgnoreCase(name)) {
			return oper_offst_typ();
		}
		if ($oper_offst_typ_nm.equalsIgnoreCase(name)) {
			return oper_offst_typ_nm();
		}
		if ($s_int_oper_offst_add_qty.equalsIgnoreCase(name)) {
			return s_int_oper_offst_add_qty();
		}
		if ($s_dec_oper_offst_add_qty.equalsIgnoreCase(name)) {
			return s_dec_oper_offst_add_qty();
		}
		if ($s_int_oper_std_qty.equalsIgnoreCase(name)) {
			return s_int_oper_std_qty();
		}
		if ($s_dec_oper_std_qty.equalsIgnoreCase(name)) {
			return s_dec_oper_std_qty();
		}
		if ($s_int_oper_conv_qty.equalsIgnoreCase(name)) {
			return s_int_oper_conv_qty();
		}
		if ($s_dec_oper_conv_qty.equalsIgnoreCase(name)) {
			return s_dec_oper_conv_qty();
		}
		if ($oper_inst_sub_char1.equalsIgnoreCase(name)) {
			return oper_inst_sub_char1();
		}
		if ($oper_inst_sub_char2.equalsIgnoreCase(name)) {
			return oper_inst_sub_char2();
		}
		if ($oper_inst_sub_char3.equalsIgnoreCase(name)) {
			return oper_inst_sub_char3();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($mfg_inst_rev_no.equalsIgnoreCase(name)) {
			return mfg_inst_rev_no();
		}
		if ($oper_unit_inst_qty.equalsIgnoreCase(name)) {
			return oper_unit_inst_qty();
		}
		if ($oper_disp_seq.equalsIgnoreCase(name)) {
			return oper_disp_seq();
		}
		if ($oper_lt.equalsIgnoreCase(name)) {
			return oper_lt();
		}
		if ($oper_lt_add_qty.equalsIgnoreCase(name)) {
			return oper_lt_add_qty();
		}
		if ($oper_offst.equalsIgnoreCase(name)) {
			return oper_offst();
		}
		if ($oper_offst_add_qty.equalsIgnoreCase(name)) {
			return oper_offst_add_qty();
		}
		if ($oper_std_qty.equalsIgnoreCase(name)) {
			return oper_std_qty();
		}
		if ($oper_conv_qty.equalsIgnoreCase(name)) {
			return oper_conv_qty();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($st_schd_dt.equalsIgnoreCase(name)) {
			return st_schd_dt();
		}
		if ($st_schd_hm.equalsIgnoreCase(name)) {
			return st_schd_hm();
		}
		if ($end_schd_dt.equalsIgnoreCase(name)) {
			return end_schd_dt();
		}
		if ($end_schd_hm.equalsIgnoreCase(name)) {
			return end_schd_hm();
		}
		return super.getDateNE(name);
	}

	public void setString(String name, String value) {
		if ($s_int_oper_unit_inst_qty.equalsIgnoreCase(name)) {
			s_int_oper_unit_inst_qty(value);
			return;
		}
		if ($s_dec_oper_unit_inst_qty.equalsIgnoreCase(name)) {
			s_dec_oper_unit_inst_qty(value);
			return;
		}
		if ($oper_unit_cd.equalsIgnoreCase(name)) {
			oper_unit_cd(value);
			return;
		}
		if ($oper_unit_nm.equalsIgnoreCase(name)) {
			oper_unit_nm(value);
			return;
		}
		if ($s_int_oper_lt_add_qty.equalsIgnoreCase(name)) {
			s_int_oper_lt_add_qty(value);
			return;
		}
		if ($s_dec_oper_lt_add_qty.equalsIgnoreCase(name)) {
			s_dec_oper_lt_add_qty(value);
			return;
		}
		if ($oper_offst_typ.equalsIgnoreCase(name)) {
			oper_offst_typ(value);
			return;
		}
		if ($oper_offst_typ_nm.equalsIgnoreCase(name)) {
			oper_offst_typ_nm(value);
			return;
		}
		if ($s_int_oper_offst_add_qty.equalsIgnoreCase(name)) {
			s_int_oper_offst_add_qty(value);
			return;
		}
		if ($s_dec_oper_offst_add_qty.equalsIgnoreCase(name)) {
			s_dec_oper_offst_add_qty(value);
			return;
		}
		if ($s_int_oper_std_qty.equalsIgnoreCase(name)) {
			s_int_oper_std_qty(value);
			return;
		}
		if ($s_dec_oper_std_qty.equalsIgnoreCase(name)) {
			s_dec_oper_std_qty(value);
			return;
		}
		if ($s_int_oper_conv_qty.equalsIgnoreCase(name)) {
			s_int_oper_conv_qty(value);
			return;
		}
		if ($s_dec_oper_conv_qty.equalsIgnoreCase(name)) {
			s_dec_oper_conv_qty(value);
			return;
		}
		if ($oper_inst_sub_char1.equalsIgnoreCase(name)) {
			oper_inst_sub_char1(value);
			return;
		}
		if ($oper_inst_sub_char2.equalsIgnoreCase(name)) {
			oper_inst_sub_char2(value);
			return;
		}
		if ($oper_inst_sub_char3.equalsIgnoreCase(name)) {
			oper_inst_sub_char3(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($mfg_inst_rev_no.equalsIgnoreCase(name)) {
			mfg_inst_rev_no(value);
			return;
		}
		if ($oper_unit_inst_qty.equalsIgnoreCase(name)) {
			oper_unit_inst_qty(value);
			return;
		}
		if ($oper_disp_seq.equalsIgnoreCase(name)) {
			oper_disp_seq(value);
			return;
		}
		if ($oper_lt.equalsIgnoreCase(name)) {
			oper_lt(value);
			return;
		}
		if ($oper_lt_add_qty.equalsIgnoreCase(name)) {
			oper_lt_add_qty(value);
			return;
		}
		if ($oper_offst.equalsIgnoreCase(name)) {
			oper_offst(value);
			return;
		}
		if ($oper_offst_add_qty.equalsIgnoreCase(name)) {
			oper_offst_add_qty(value);
			return;
		}
		if ($oper_std_qty.equalsIgnoreCase(name)) {
			oper_std_qty(value);
			return;
		}
		if ($oper_conv_qty.equalsIgnoreCase(name)) {
			oper_conv_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($mfg_inst_rev_no.equalsIgnoreCase(name)) {
			mfg_inst_rev_no(value);
			return;
		}
		if ($oper_unit_inst_qty.equalsIgnoreCase(name)) {
			oper_unit_inst_qty(value);
			return;
		}
		if ($oper_disp_seq.equalsIgnoreCase(name)) {
			oper_disp_seq(value);
			return;
		}
		if ($oper_lt.equalsIgnoreCase(name)) {
			oper_lt(value);
			return;
		}
		if ($oper_lt_add_qty.equalsIgnoreCase(name)) {
			oper_lt_add_qty(value);
			return;
		}
		if ($oper_offst.equalsIgnoreCase(name)) {
			oper_offst(value);
			return;
		}
		if ($oper_offst_add_qty.equalsIgnoreCase(name)) {
			oper_offst_add_qty(value);
			return;
		}
		if ($oper_std_qty.equalsIgnoreCase(name)) {
			oper_std_qty(value);
			return;
		}
		if ($oper_conv_qty.equalsIgnoreCase(name)) {
			oper_conv_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($mfg_inst_rev_no.equalsIgnoreCase(name)) {
			mfg_inst_rev_no(value);
			return;
		}
		if ($oper_unit_inst_qty.equalsIgnoreCase(name)) {
			oper_unit_inst_qty(value);
			return;
		}
		if ($oper_disp_seq.equalsIgnoreCase(name)) {
			oper_disp_seq(value);
			return;
		}
		if ($oper_lt.equalsIgnoreCase(name)) {
			oper_lt(value);
			return;
		}
		if ($oper_lt_add_qty.equalsIgnoreCase(name)) {
			oper_lt_add_qty(value);
			return;
		}
		if ($oper_offst.equalsIgnoreCase(name)) {
			oper_offst(value);
			return;
		}
		if ($oper_offst_add_qty.equalsIgnoreCase(name)) {
			oper_offst_add_qty(value);
			return;
		}
		if ($oper_std_qty.equalsIgnoreCase(name)) {
			oper_std_qty(value);
			return;
		}
		if ($oper_conv_qty.equalsIgnoreCase(name)) {
			oper_conv_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($mfg_inst_rev_no.equalsIgnoreCase(name)) {
			mfg_inst_rev_no(value);
			return;
		}
		if ($oper_unit_inst_qty.equalsIgnoreCase(name)) {
			oper_unit_inst_qty(value);
			return;
		}
		if ($oper_disp_seq.equalsIgnoreCase(name)) {
			oper_disp_seq(value);
			return;
		}
		if ($oper_lt.equalsIgnoreCase(name)) {
			oper_lt(value);
			return;
		}
		if ($oper_lt_add_qty.equalsIgnoreCase(name)) {
			oper_lt_add_qty(value);
			return;
		}
		if ($oper_offst.equalsIgnoreCase(name)) {
			oper_offst(value);
			return;
		}
		if ($oper_offst_add_qty.equalsIgnoreCase(name)) {
			oper_offst_add_qty(value);
			return;
		}
		if ($oper_std_qty.equalsIgnoreCase(name)) {
			oper_std_qty(value);
			return;
		}
		if ($oper_conv_qty.equalsIgnoreCase(name)) {
			oper_conv_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($mfg_inst_rev_no.equalsIgnoreCase(name)) {
			mfg_inst_rev_no(value);
			return;
		}
		if ($oper_unit_inst_qty.equalsIgnoreCase(name)) {
			oper_unit_inst_qty(value);
			return;
		}
		if ($oper_disp_seq.equalsIgnoreCase(name)) {
			oper_disp_seq(value);
			return;
		}
		if ($oper_lt.equalsIgnoreCase(name)) {
			oper_lt(value);
			return;
		}
		if ($oper_lt_add_qty.equalsIgnoreCase(name)) {
			oper_lt_add_qty(value);
			return;
		}
		if ($oper_offst.equalsIgnoreCase(name)) {
			oper_offst(value);
			return;
		}
		if ($oper_offst_add_qty.equalsIgnoreCase(name)) {
			oper_offst_add_qty(value);
			return;
		}
		if ($oper_std_qty.equalsIgnoreCase(name)) {
			oper_std_qty(value);
			return;
		}
		if ($oper_conv_qty.equalsIgnoreCase(name)) {
			oper_conv_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($st_schd_dt.equalsIgnoreCase(name)) {
			st_schd_dt(value);
			return;
		}
		if ($st_schd_hm.equalsIgnoreCase(name)) {
			st_schd_hm(value);
			return;
		}
		if ($end_schd_dt.equalsIgnoreCase(name)) {
			end_schd_dt(value);
			return;
		}
		if ($end_schd_hm.equalsIgnoreCase(name)) {
			end_schd_hm(value);
			return;
		}
		super.setDate(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($s_int_oper_unit_inst_qty.equalsIgnoreCase(name)) {
			s_int_oper_unit_inst_qty(value);
			return;
		}
		if ($s_dec_oper_unit_inst_qty.equalsIgnoreCase(name)) {
			s_dec_oper_unit_inst_qty(value);
			return;
		}
		if ($oper_unit_cd.equalsIgnoreCase(name)) {
			oper_unit_cd(value);
			return;
		}
		if ($oper_unit_nm.equalsIgnoreCase(name)) {
			oper_unit_nm(value);
			return;
		}
		if ($s_int_oper_lt_add_qty.equalsIgnoreCase(name)) {
			s_int_oper_lt_add_qty(value);
			return;
		}
		if ($s_dec_oper_lt_add_qty.equalsIgnoreCase(name)) {
			s_dec_oper_lt_add_qty(value);
			return;
		}
		if ($oper_offst_typ.equalsIgnoreCase(name)) {
			oper_offst_typ(value);
			return;
		}
		if ($oper_offst_typ_nm.equalsIgnoreCase(name)) {
			oper_offst_typ_nm(value);
			return;
		}
		if ($s_int_oper_offst_add_qty.equalsIgnoreCase(name)) {
			s_int_oper_offst_add_qty(value);
			return;
		}
		if ($s_dec_oper_offst_add_qty.equalsIgnoreCase(name)) {
			s_dec_oper_offst_add_qty(value);
			return;
		}
		if ($s_int_oper_std_qty.equalsIgnoreCase(name)) {
			s_int_oper_std_qty(value);
			return;
		}
		if ($s_dec_oper_std_qty.equalsIgnoreCase(name)) {
			s_dec_oper_std_qty(value);
			return;
		}
		if ($s_int_oper_conv_qty.equalsIgnoreCase(name)) {
			s_int_oper_conv_qty(value);
			return;
		}
		if ($s_dec_oper_conv_qty.equalsIgnoreCase(name)) {
			s_dec_oper_conv_qty(value);
			return;
		}
		if ($oper_inst_sub_char1.equalsIgnoreCase(name)) {
			oper_inst_sub_char1(value);
			return;
		}
		if ($oper_inst_sub_char2.equalsIgnoreCase(name)) {
			oper_inst_sub_char2(value);
			return;
		}
		if ($oper_inst_sub_char3.equalsIgnoreCase(name)) {
			oper_inst_sub_char3(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($mfg_inst_rev_no.equalsIgnoreCase(name)) {
			mfg_inst_rev_no(value);
			return;
		}
		if ($oper_unit_inst_qty.equalsIgnoreCase(name)) {
			oper_unit_inst_qty(value);
			return;
		}
		if ($oper_disp_seq.equalsIgnoreCase(name)) {
			oper_disp_seq(value);
			return;
		}
		if ($oper_lt.equalsIgnoreCase(name)) {
			oper_lt(value);
			return;
		}
		if ($oper_lt_add_qty.equalsIgnoreCase(name)) {
			oper_lt_add_qty(value);
			return;
		}
		if ($oper_offst.equalsIgnoreCase(name)) {
			oper_offst(value);
			return;
		}
		if ($oper_offst_add_qty.equalsIgnoreCase(name)) {
			oper_offst_add_qty(value);
			return;
		}
		if ($oper_std_qty.equalsIgnoreCase(name)) {
			oper_std_qty(value);
			return;
		}
		if ($oper_conv_qty.equalsIgnoreCase(name)) {
			oper_conv_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($mfg_inst_rev_no.equalsIgnoreCase(name)) {
			mfg_inst_rev_no(value);
			return;
		}
		if ($oper_unit_inst_qty.equalsIgnoreCase(name)) {
			oper_unit_inst_qty(value);
			return;
		}
		if ($oper_disp_seq.equalsIgnoreCase(name)) {
			oper_disp_seq(value);
			return;
		}
		if ($oper_lt.equalsIgnoreCase(name)) {
			oper_lt(value);
			return;
		}
		if ($oper_lt_add_qty.equalsIgnoreCase(name)) {
			oper_lt_add_qty(value);
			return;
		}
		if ($oper_offst.equalsIgnoreCase(name)) {
			oper_offst(value);
			return;
		}
		if ($oper_offst_add_qty.equalsIgnoreCase(name)) {
			oper_offst_add_qty(value);
			return;
		}
		if ($oper_std_qty.equalsIgnoreCase(name)) {
			oper_std_qty(value);
			return;
		}
		if ($oper_conv_qty.equalsIgnoreCase(name)) {
			oper_conv_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($mfg_inst_rev_no.equalsIgnoreCase(name)) {
			mfg_inst_rev_no(value);
			return;
		}
		if ($oper_unit_inst_qty.equalsIgnoreCase(name)) {
			oper_unit_inst_qty(value);
			return;
		}
		if ($oper_disp_seq.equalsIgnoreCase(name)) {
			oper_disp_seq(value);
			return;
		}
		if ($oper_lt.equalsIgnoreCase(name)) {
			oper_lt(value);
			return;
		}
		if ($oper_lt_add_qty.equalsIgnoreCase(name)) {
			oper_lt_add_qty(value);
			return;
		}
		if ($oper_offst.equalsIgnoreCase(name)) {
			oper_offst(value);
			return;
		}
		if ($oper_offst_add_qty.equalsIgnoreCase(name)) {
			oper_offst_add_qty(value);
			return;
		}
		if ($oper_std_qty.equalsIgnoreCase(name)) {
			oper_std_qty(value);
			return;
		}
		if ($oper_conv_qty.equalsIgnoreCase(name)) {
			oper_conv_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($mfg_inst_rev_no.equalsIgnoreCase(name)) {
			mfg_inst_rev_no(value);
			return;
		}
		if ($oper_unit_inst_qty.equalsIgnoreCase(name)) {
			oper_unit_inst_qty(value);
			return;
		}
		if ($oper_disp_seq.equalsIgnoreCase(name)) {
			oper_disp_seq(value);
			return;
		}
		if ($oper_lt.equalsIgnoreCase(name)) {
			oper_lt(value);
			return;
		}
		if ($oper_lt_add_qty.equalsIgnoreCase(name)) {
			oper_lt_add_qty(value);
			return;
		}
		if ($oper_offst.equalsIgnoreCase(name)) {
			oper_offst(value);
			return;
		}
		if ($oper_offst_add_qty.equalsIgnoreCase(name)) {
			oper_offst_add_qty(value);
			return;
		}
		if ($oper_std_qty.equalsIgnoreCase(name)) {
			oper_std_qty(value);
			return;
		}
		if ($oper_conv_qty.equalsIgnoreCase(name)) {
			oper_conv_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($mfg_inst_rev_no.equalsIgnoreCase(name)) {
			mfg_inst_rev_no(value);
			return;
		}
		if ($oper_unit_inst_qty.equalsIgnoreCase(name)) {
			oper_unit_inst_qty(value);
			return;
		}
		if ($oper_disp_seq.equalsIgnoreCase(name)) {
			oper_disp_seq(value);
			return;
		}
		if ($oper_lt.equalsIgnoreCase(name)) {
			oper_lt(value);
			return;
		}
		if ($oper_lt_add_qty.equalsIgnoreCase(name)) {
			oper_lt_add_qty(value);
			return;
		}
		if ($oper_offst.equalsIgnoreCase(name)) {
			oper_offst(value);
			return;
		}
		if ($oper_offst_add_qty.equalsIgnoreCase(name)) {
			oper_offst_add_qty(value);
			return;
		}
		if ($oper_std_qty.equalsIgnoreCase(name)) {
			oper_std_qty(value);
			return;
		}
		if ($oper_conv_qty.equalsIgnoreCase(name)) {
			oper_conv_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($st_schd_dt.equalsIgnoreCase(name)) {
			st_schd_dt(value);
			return;
		}
		if ($st_schd_hm.equalsIgnoreCase(name)) {
			st_schd_hm(value);
			return;
		}
		if ($end_schd_dt.equalsIgnoreCase(name)) {
			end_schd_dt(value);
			return;
		}
		if ($end_schd_hm.equalsIgnoreCase(name)) {
			end_schd_hm(value);
			return;
		}
		super.setDateNE(name, value);
	}



}

