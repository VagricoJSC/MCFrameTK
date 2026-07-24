package mcframe.commonMSBH.MSBHR0030;

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
 * ブロック"SwDtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class SwDtlR_MC_A extends MCConstRow {

	/**
	 *  表示順.<p>
	 *
	 */
	public static final String $disp_seq = "disp_seq";
	/**
	 *  買掛先ＣＤ（振替元）.<p>
	 *
	 */
	public static final String $asppl_cd_fr = "asppl_cd_fr";
	/**
	 *  買掛先名（振替元）.<p>
	 *
	 */
	public static final String $asppl_nm_fr = "asppl_nm_fr";
	/**
	 *  買掛先別名１（振替元）.<p>
	 *
	 */
	public static final String $asppl_alt_nm1_fr = "asppl_alt_nm1_fr";
	/**
	 *  買掛先別名２（振替元）.<p>
	 *
	 */
	public static final String $asppl_alt_nm2_fr = "asppl_alt_nm2_fr";
	/**
	 *  買掛先別名３（振替元）.<p>
	 *
	 */
	public static final String $asppl_alt_nm3_fr = "asppl_alt_nm3_fr";
	/**
	 *  買掛先別名４（振替元）.<p>
	 *
	 */
	public static final String $asppl_alt_nm4_fr = "asppl_alt_nm4_fr";
	/**
	 *  支払予定管理先担当部門ＣＤ（振替元）.<p>
	 *
	 */
	public static final String $bsppl_dpt_cd_fr = "bsppl_dpt_cd_fr";
	/**
	 *  支払予定管理先担当部門名（振替元）.<p>
	 *
	 */
	public static final String $bsppl_dpt_nm_fr = "bsppl_dpt_nm_fr";
	/**
	 *  債務部門ＣＤ（振替元）.<p>
	 *
	 */
	public static final String $ap_dpt_cd_fr = "ap_dpt_cd_fr";
	/**
	 *  債務部門名（振替元）.<p>
	 *
	 */
	public static final String $ap_dpt_nm_fr = "ap_dpt_nm_fr";
	/**
	 *  債務区分.<p>
	 *
	 */
	public static final String $ap_typ = "ap_typ";
	/**
	 *  債務区分名.<p>
	 *
	 */
	public static final String $ap_typ_nm = "ap_typ_nm";
	/**
	 *  案件ＮＯ（振替元・表示用）.<p>
	 *
	 */
	public static final String $wrk_no_fr_view = "wrk_no_fr_view";
	/**
	 *  案件ＮＯ（振替元・データ）.<p>
	 *
	 */
	public static final String $wrk_no_fr_data = "wrk_no_fr_data";
	/**
	 *  案件名（振替元）.<p>
	 *
	 */
	public static final String $wrk_nm_fr = "wrk_nm_fr";
	/**
	 *  受領インボイスＮＯ（表示用）.<p>
	 *
	 */
	public static final String $rcpt_iv_no_view = "rcpt_iv_no_view";
	/**
	 *  受領インボイスＮＯ（データ）.<p>
	 *
	 */
	public static final String $rcpt_iv_no_data = "rcpt_iv_no_data";
	/**
	 *  受領インボイス管理ＮＯ（表示用）.<p>
	 *
	 */
	public static final String $rcpt_iv_mng_no_view = "rcpt_iv_mng_no_view";
	/**
	 *  受領インボイス管理ＮＯ（データ）.<p>
	 *
	 */
	public static final String $rcpt_iv_mng_no_data = "rcpt_iv_mng_no_data";
	/**
	 *  買掛明細ＮＯ（振替元・表示用）.<p>
	 *
	 */
	public static final String $ap_d_no_fr_view = "ap_d_no_fr_view";
	/**
	 *  買掛明細ＮＯ（振替元・データ）.<p>
	 *
	 */
	public static final String $ap_d_no_fr_data = "ap_d_no_fr_data";
	/**
	 *  支払予定ＮＯ（振替元・表示用）.<p>
	 *
	 */
	public static final String $pay_schd_no_fr_view = "pay_schd_no_fr_view";
	/**
	 *  支払予定ＮＯ（振替元・データ）.<p>
	 *
	 */
	public static final String $pay_schd_no_fr_data = "pay_schd_no_fr_data";
	/**
	 *  買掛消込予定ＮＯ（振替元・表示用）.<p>
	 *
	 */
	public static final String $ap_appl_schd_no_fr_view = "ap_appl_schd_no_fr_view";
	/**
	 *  買掛消込予定ＮＯ（振替元・データ）.<p>
	 *
	 */
	public static final String $ap_appl_schd_no_fr_data = "ap_appl_schd_no_fr_data";
	/**
	 *  取引通貨金額.<p>
	 *
	 */
	public static final String $trd_cur_amt = "trd_cur_amt";
	/**
	 *  取引通貨金額文字列（整数部）.<p>
	 *
	 */
	public static final String $s_int_trd_cur_amt = "s_int_trd_cur_amt";
	/**
	 *  取引通貨金額文字列（小数部）.<p>
	 *
	 */
	public static final String $s_dec_trd_cur_amt = "s_dec_trd_cur_amt";
	/**
	 *  買掛明細ＮＯ（振替先・表示用）.<p>
	 *
	 */
	public static final String $ap_d_no_to_view = "ap_d_no_to_view";
	/**
	 *  買掛明細ＮＯ（振替先・データ）.<p>
	 *
	 */
	public static final String $ap_d_no_to_data = "ap_d_no_to_data";
	/**
	 *  予備１.<p>
	 *
	 */
	public static final String $d_sub_char1 = "d_sub_char1";
	/**
	 *  予備２.<p>
	 *
	 */
	public static final String $d_sub_char2 = "d_sub_char2";
	/**
	 *  予備３.<p>
	 *
	 */
	public static final String $d_sub_char3 = "d_sub_char3";


	public static final MCMeta disp_seq_META = createCommonMeta($disp_seq, mcframe.commonMA.meta.MA_META.DISP_SEQ);
	public static final MCMeta asppl_cd_fr_META = createCommonMeta($asppl_cd_fr, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta asppl_nm_fr_META = createCommonMeta($asppl_nm_fr, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta asppl_alt_nm1_fr_META = createCommonMeta($asppl_alt_nm1_fr, mcframe.commonMA.meta.MA_META.BP_ALT_NM1);
	public static final MCMeta asppl_alt_nm2_fr_META = createCommonMeta($asppl_alt_nm2_fr, mcframe.commonMA.meta.MA_META.BP_ALT_NM2);
	public static final MCMeta asppl_alt_nm3_fr_META = createCommonMeta($asppl_alt_nm3_fr, mcframe.commonMA.meta.MA_META.BP_ALT_NM3);
	public static final MCMeta asppl_alt_nm4_fr_META = createCommonMeta($asppl_alt_nm4_fr, mcframe.commonMA.meta.MA_META.BP_ALT_NM4);
	public static final MCMeta bsppl_dpt_cd_fr_META = createCommonMeta($bsppl_dpt_cd_fr, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta bsppl_dpt_nm_fr_META = createCommonMeta($bsppl_dpt_nm_fr, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta ap_dpt_cd_fr_META = createCommonMeta($ap_dpt_cd_fr, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta ap_dpt_nm_fr_META = createCommonMeta($ap_dpt_nm_fr, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta ap_typ_META = createCommonMeta($ap_typ, mcframe.commonMA.meta.MA_META.AP_TYP);
	public static final MCMeta ap_typ_nm_META = createCommonMeta($ap_typ_nm, mcframe.commonMA.meta.MA_META.AP_TYP_NM);
	public static final MCMeta wrk_no_fr_view_META = createCommonMeta($wrk_no_fr_view, mcframe.commonMA.meta.MA_META.WRK_NO);
	public static final MCMeta wrk_no_fr_data_META = createCommonMeta($wrk_no_fr_data, mcframe.commonMA.meta.MA_META.WRK_NO);
	public static final MCMeta wrk_nm_fr_META = createCommonMeta($wrk_nm_fr, mcframe.commonMA.meta.MA_META.WRK_NM);
	public static final MCMeta rcpt_iv_no_view_META = createCommonMeta($rcpt_iv_no_view, mcframe.commonMA.meta.MA_META.IV_NO);
	public static final MCMeta rcpt_iv_no_data_META = createCommonMeta($rcpt_iv_no_data, mcframe.commonMA.meta.MA_META.IV_NO);
	public static final MCMeta rcpt_iv_mng_no_view_META = createCommonMeta($rcpt_iv_mng_no_view, mcframe.commonMA.meta.MA_META.RCPT_IV_MNG_NO);
	public static final MCMeta rcpt_iv_mng_no_data_META = createCommonMeta($rcpt_iv_mng_no_data, mcframe.commonMA.meta.MA_META.RCPT_IV_MNG_NO);
	public static final MCMeta ap_d_no_fr_view_META = createCommonMeta($ap_d_no_fr_view, mcframe.commonMA.meta.MA_META.AP_D_NO);
	public static final MCMeta ap_d_no_fr_data_META = createCommonMeta($ap_d_no_fr_data, mcframe.commonMA.meta.MA_META.AP_D_NO);
	public static final MCMeta pay_schd_no_fr_view_META = createCommonMeta($pay_schd_no_fr_view, mcframe.commonMA.meta.MA_META.PAY_SCHD_NO);
	public static final MCMeta pay_schd_no_fr_data_META = createCommonMeta($pay_schd_no_fr_data, mcframe.commonMA.meta.MA_META.PAY_SCHD_NO);
	public static final MCMeta ap_appl_schd_no_fr_view_META = createCommonMeta($ap_appl_schd_no_fr_view, mcframe.commonMA.meta.MA_META.AP_APPL_SCHD_NO);
	public static final MCMeta ap_appl_schd_no_fr_data_META = createCommonMeta($ap_appl_schd_no_fr_data, mcframe.commonMA.meta.MA_META.AP_APPL_SCHD_NO);
	public static final MCMeta trd_cur_amt_META = createCommonMeta($trd_cur_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta s_int_trd_cur_amt_META = createStringMeta($s_int_trd_cur_amt);
	public static final MCMeta s_dec_trd_cur_amt_META = createStringMeta($s_dec_trd_cur_amt);
	public static final MCMeta ap_d_no_to_view_META = createCommonMeta($ap_d_no_to_view, mcframe.commonMA.meta.MA_META.AP_D_NO);
	public static final MCMeta ap_d_no_to_data_META = createCommonMeta($ap_d_no_to_data, mcframe.commonMA.meta.MA_META.AP_D_NO);
	public static final MCMeta d_sub_char1_META = createCommonMeta($d_sub_char1, mcframe.commonMS.meta.MS_META.PAY_ACT_D_SUB_CHAR1);
	public static final MCMeta d_sub_char2_META = createCommonMeta($d_sub_char2, mcframe.commonMS.meta.MS_META.PAY_ACT_D_SUB_CHAR2);
	public static final MCMeta d_sub_char3_META = createCommonMeta($d_sub_char3, mcframe.commonMS.meta.MS_META.PAY_ACT_D_SUB_CHAR3);

	protected static final ConstMetaList<SwDtlR> constMetas = new ConstMetaList<SwDtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			disp_seq_META,
			asppl_cd_fr_META,
			asppl_nm_fr_META,
			asppl_alt_nm1_fr_META,
			asppl_alt_nm2_fr_META,
			asppl_alt_nm3_fr_META,
			asppl_alt_nm4_fr_META,
			bsppl_dpt_cd_fr_META,
			bsppl_dpt_nm_fr_META,
			ap_dpt_cd_fr_META,
			ap_dpt_nm_fr_META,
			ap_typ_META,
			ap_typ_nm_META,
			wrk_no_fr_view_META,
			wrk_no_fr_data_META,
			wrk_nm_fr_META,
			rcpt_iv_no_view_META,
			rcpt_iv_no_data_META,
			rcpt_iv_mng_no_view_META,
			rcpt_iv_mng_no_data_META,
			ap_d_no_fr_view_META,
			ap_d_no_fr_data_META,
			pay_schd_no_fr_view_META,
			pay_schd_no_fr_data_META,
			ap_appl_schd_no_fr_view_META,
			ap_appl_schd_no_fr_data_META,
			trd_cur_amt_META,
			s_int_trd_cur_amt_META,
			s_dec_trd_cur_amt_META,
			ap_d_no_to_view_META,
			ap_d_no_to_data_META,
			d_sub_char1_META,
			d_sub_char2_META,
			d_sub_char3_META
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
	protected SwDtlR_MC_A(ConstMetaList<? extends SwDtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public SwDtlR clone() {
		return (SwDtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public SwDtlR createInstance() {
		return (SwDtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public SwDtlR getValues(String... names) {
		return (SwDtlR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 *  表示順.<p>
	 *
	 */
	public MCNumber disp_seq() {
		return getConstNumber(offset + 0, $disp_seq);
	}

	/**
	 *  表示順.<p>
	 *
	 */
	public void disp_seq(MCNumber value) {
		setConstNumber(offset + 0, $disp_seq, value);
	}

	/**
	 *  表示順.<p>
	 *
	 */
	public void disp_seq(int value) {
		setConstNumber(offset + 0, $disp_seq, value);
	}

	/**
	 *  表示順.<p>
	 *
	 */
	public void disp_seq(long value) {
		setConstNumber(offset + 0, $disp_seq, value);
	}

	/**
	 *  表示順.<p>
	 *
	 */
	public void disp_seq(float value) {
		setConstNumber(offset + 0, $disp_seq, value);
	}

	/**
	 *  表示順.<p>
	 *
	 */
	public void disp_seq(double value) {
		setConstNumber(offset + 0, $disp_seq, value);
	}


	/**
	 *  買掛先ＣＤ（振替元）.<p>
	 *
	 */
	public String asppl_cd_fr() {
		return getConstString(offset + 1, $asppl_cd_fr);
	}

	/**
	 *  買掛先ＣＤ（振替元）.<p>
	 *
	 */
	public void asppl_cd_fr(String value) {
		setConstString(offset + 1, $asppl_cd_fr, value);
	}


	/**
	 *  買掛先名（振替元）.<p>
	 *
	 */
	public String asppl_nm_fr() {
		return getConstString(offset + 2, $asppl_nm_fr);
	}

	/**
	 *  買掛先名（振替元）.<p>
	 *
	 */
	public void asppl_nm_fr(String value) {
		setConstString(offset + 2, $asppl_nm_fr, value);
	}


	/**
	 *  買掛先別名１（振替元）.<p>
	 *
	 */
	public String asppl_alt_nm1_fr() {
		return getConstString(offset + 3, $asppl_alt_nm1_fr);
	}

	/**
	 *  買掛先別名１（振替元）.<p>
	 *
	 */
	public void asppl_alt_nm1_fr(String value) {
		setConstString(offset + 3, $asppl_alt_nm1_fr, value);
	}


	/**
	 *  買掛先別名２（振替元）.<p>
	 *
	 */
	public String asppl_alt_nm2_fr() {
		return getConstString(offset + 4, $asppl_alt_nm2_fr);
	}

	/**
	 *  買掛先別名２（振替元）.<p>
	 *
	 */
	public void asppl_alt_nm2_fr(String value) {
		setConstString(offset + 4, $asppl_alt_nm2_fr, value);
	}


	/**
	 *  買掛先別名３（振替元）.<p>
	 *
	 */
	public String asppl_alt_nm3_fr() {
		return getConstString(offset + 5, $asppl_alt_nm3_fr);
	}

	/**
	 *  買掛先別名３（振替元）.<p>
	 *
	 */
	public void asppl_alt_nm3_fr(String value) {
		setConstString(offset + 5, $asppl_alt_nm3_fr, value);
	}


	/**
	 *  買掛先別名４（振替元）.<p>
	 *
	 */
	public String asppl_alt_nm4_fr() {
		return getConstString(offset + 6, $asppl_alt_nm4_fr);
	}

	/**
	 *  買掛先別名４（振替元）.<p>
	 *
	 */
	public void asppl_alt_nm4_fr(String value) {
		setConstString(offset + 6, $asppl_alt_nm4_fr, value);
	}


	/**
	 *  支払予定管理先担当部門ＣＤ（振替元）.<p>
	 *
	 */
	public String bsppl_dpt_cd_fr() {
		return getConstString(offset + 7, $bsppl_dpt_cd_fr);
	}

	/**
	 *  支払予定管理先担当部門ＣＤ（振替元）.<p>
	 *
	 */
	public void bsppl_dpt_cd_fr(String value) {
		setConstString(offset + 7, $bsppl_dpt_cd_fr, value);
	}


	/**
	 *  支払予定管理先担当部門名（振替元）.<p>
	 *
	 */
	public String bsppl_dpt_nm_fr() {
		return getConstString(offset + 8, $bsppl_dpt_nm_fr);
	}

	/**
	 *  支払予定管理先担当部門名（振替元）.<p>
	 *
	 */
	public void bsppl_dpt_nm_fr(String value) {
		setConstString(offset + 8, $bsppl_dpt_nm_fr, value);
	}


	/**
	 *  債務部門ＣＤ（振替元）.<p>
	 *
	 */
	public String ap_dpt_cd_fr() {
		return getConstString(offset + 9, $ap_dpt_cd_fr);
	}

	/**
	 *  債務部門ＣＤ（振替元）.<p>
	 *
	 */
	public void ap_dpt_cd_fr(String value) {
		setConstString(offset + 9, $ap_dpt_cd_fr, value);
	}


	/**
	 *  債務部門名（振替元）.<p>
	 *
	 */
	public String ap_dpt_nm_fr() {
		return getConstString(offset + 10, $ap_dpt_nm_fr);
	}

	/**
	 *  債務部門名（振替元）.<p>
	 *
	 */
	public void ap_dpt_nm_fr(String value) {
		setConstString(offset + 10, $ap_dpt_nm_fr, value);
	}


	/**
	 *  債務区分.<p>
	 *
	 */
	public String ap_typ() {
		return getConstString(offset + 11, $ap_typ);
	}

	/**
	 *  債務区分.<p>
	 *
	 */
	public void ap_typ(String value) {
		setConstString(offset + 11, $ap_typ, value);
	}


	/**
	 *  債務区分名.<p>
	 *
	 */
	public String ap_typ_nm() {
		return getConstString(offset + 12, $ap_typ_nm);
	}

	/**
	 *  債務区分名.<p>
	 *
	 */
	public void ap_typ_nm(String value) {
		setConstString(offset + 12, $ap_typ_nm, value);
	}


	/**
	 *  案件ＮＯ（振替元・表示用）.<p>
	 *
	 */
	public String wrk_no_fr_view() {
		return getConstString(offset + 13, $wrk_no_fr_view);
	}

	/**
	 *  案件ＮＯ（振替元・表示用）.<p>
	 *
	 */
	public void wrk_no_fr_view(String value) {
		setConstString(offset + 13, $wrk_no_fr_view, value);
	}


	/**
	 *  案件ＮＯ（振替元・データ）.<p>
	 *
	 */
	public String wrk_no_fr_data() {
		return getConstString(offset + 14, $wrk_no_fr_data);
	}

	/**
	 *  案件ＮＯ（振替元・データ）.<p>
	 *
	 */
	public void wrk_no_fr_data(String value) {
		setConstString(offset + 14, $wrk_no_fr_data, value);
	}


	/**
	 *  案件名（振替元）.<p>
	 *
	 */
	public String wrk_nm_fr() {
		return getConstString(offset + 15, $wrk_nm_fr);
	}

	/**
	 *  案件名（振替元）.<p>
	 *
	 */
	public void wrk_nm_fr(String value) {
		setConstString(offset + 15, $wrk_nm_fr, value);
	}


	/**
	 *  受領インボイスＮＯ（表示用）.<p>
	 *
	 */
	public String rcpt_iv_no_view() {
		return getConstString(offset + 16, $rcpt_iv_no_view);
	}

	/**
	 *  受領インボイスＮＯ（表示用）.<p>
	 *
	 */
	public void rcpt_iv_no_view(String value) {
		setConstString(offset + 16, $rcpt_iv_no_view, value);
	}


	/**
	 *  受領インボイスＮＯ（データ）.<p>
	 *
	 */
	public String rcpt_iv_no_data() {
		return getConstString(offset + 17, $rcpt_iv_no_data);
	}

	/**
	 *  受領インボイスＮＯ（データ）.<p>
	 *
	 */
	public void rcpt_iv_no_data(String value) {
		setConstString(offset + 17, $rcpt_iv_no_data, value);
	}


	/**
	 *  受領インボイス管理ＮＯ（表示用）.<p>
	 *
	 */
	public String rcpt_iv_mng_no_view() {
		return getConstString(offset + 18, $rcpt_iv_mng_no_view);
	}

	/**
	 *  受領インボイス管理ＮＯ（表示用）.<p>
	 *
	 */
	public void rcpt_iv_mng_no_view(String value) {
		setConstString(offset + 18, $rcpt_iv_mng_no_view, value);
	}


	/**
	 *  受領インボイス管理ＮＯ（データ）.<p>
	 *
	 */
	public String rcpt_iv_mng_no_data() {
		return getConstString(offset + 19, $rcpt_iv_mng_no_data);
	}

	/**
	 *  受領インボイス管理ＮＯ（データ）.<p>
	 *
	 */
	public void rcpt_iv_mng_no_data(String value) {
		setConstString(offset + 19, $rcpt_iv_mng_no_data, value);
	}


	/**
	 *  買掛明細ＮＯ（振替元・表示用）.<p>
	 *
	 */
	public String ap_d_no_fr_view() {
		return getConstString(offset + 20, $ap_d_no_fr_view);
	}

	/**
	 *  買掛明細ＮＯ（振替元・表示用）.<p>
	 *
	 */
	public void ap_d_no_fr_view(String value) {
		setConstString(offset + 20, $ap_d_no_fr_view, value);
	}


	/**
	 *  買掛明細ＮＯ（振替元・データ）.<p>
	 *
	 */
	public String ap_d_no_fr_data() {
		return getConstString(offset + 21, $ap_d_no_fr_data);
	}

	/**
	 *  買掛明細ＮＯ（振替元・データ）.<p>
	 *
	 */
	public void ap_d_no_fr_data(String value) {
		setConstString(offset + 21, $ap_d_no_fr_data, value);
	}


	/**
	 *  支払予定ＮＯ（振替元・表示用）.<p>
	 *
	 */
	public String pay_schd_no_fr_view() {
		return getConstString(offset + 22, $pay_schd_no_fr_view);
	}

	/**
	 *  支払予定ＮＯ（振替元・表示用）.<p>
	 *
	 */
	public void pay_schd_no_fr_view(String value) {
		setConstString(offset + 22, $pay_schd_no_fr_view, value);
	}


	/**
	 *  支払予定ＮＯ（振替元・データ）.<p>
	 *
	 */
	public String pay_schd_no_fr_data() {
		return getConstString(offset + 23, $pay_schd_no_fr_data);
	}

	/**
	 *  支払予定ＮＯ（振替元・データ）.<p>
	 *
	 */
	public void pay_schd_no_fr_data(String value) {
		setConstString(offset + 23, $pay_schd_no_fr_data, value);
	}


	/**
	 *  買掛消込予定ＮＯ（振替元・表示用）.<p>
	 *
	 */
	public String ap_appl_schd_no_fr_view() {
		return getConstString(offset + 24, $ap_appl_schd_no_fr_view);
	}

	/**
	 *  買掛消込予定ＮＯ（振替元・表示用）.<p>
	 *
	 */
	public void ap_appl_schd_no_fr_view(String value) {
		setConstString(offset + 24, $ap_appl_schd_no_fr_view, value);
	}


	/**
	 *  買掛消込予定ＮＯ（振替元・データ）.<p>
	 *
	 */
	public String ap_appl_schd_no_fr_data() {
		return getConstString(offset + 25, $ap_appl_schd_no_fr_data);
	}

	/**
	 *  買掛消込予定ＮＯ（振替元・データ）.<p>
	 *
	 */
	public void ap_appl_schd_no_fr_data(String value) {
		setConstString(offset + 25, $ap_appl_schd_no_fr_data, value);
	}


	/**
	 *  取引通貨金額.<p>
	 *
	 */
	public MCNumber trd_cur_amt() {
		return getConstNumber(offset + 26, $trd_cur_amt);
	}

	/**
	 *  取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(MCNumber value) {
		setConstNumber(offset + 26, $trd_cur_amt, value);
	}

	/**
	 *  取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(int value) {
		setConstNumber(offset + 26, $trd_cur_amt, value);
	}

	/**
	 *  取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(long value) {
		setConstNumber(offset + 26, $trd_cur_amt, value);
	}

	/**
	 *  取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(float value) {
		setConstNumber(offset + 26, $trd_cur_amt, value);
	}

	/**
	 *  取引通貨金額.<p>
	 *
	 */
	public void trd_cur_amt(double value) {
		setConstNumber(offset + 26, $trd_cur_amt, value);
	}


	/**
	 *  取引通貨金額文字列（整数部）.<p>
	 *
	 */
	public String s_int_trd_cur_amt() {
		return getConstString(offset + 27, $s_int_trd_cur_amt);
	}

	/**
	 *  取引通貨金額文字列（整数部）.<p>
	 *
	 */
	public void s_int_trd_cur_amt(String value) {
		setConstString(offset + 27, $s_int_trd_cur_amt, value);
	}


	/**
	 *  取引通貨金額文字列（小数部）.<p>
	 *
	 */
	public String s_dec_trd_cur_amt() {
		return getConstString(offset + 28, $s_dec_trd_cur_amt);
	}

	/**
	 *  取引通貨金額文字列（小数部）.<p>
	 *
	 */
	public void s_dec_trd_cur_amt(String value) {
		setConstString(offset + 28, $s_dec_trd_cur_amt, value);
	}


	/**
	 *  買掛明細ＮＯ（振替先・表示用）.<p>
	 *
	 */
	public String ap_d_no_to_view() {
		return getConstString(offset + 29, $ap_d_no_to_view);
	}

	/**
	 *  買掛明細ＮＯ（振替先・表示用）.<p>
	 *
	 */
	public void ap_d_no_to_view(String value) {
		setConstString(offset + 29, $ap_d_no_to_view, value);
	}


	/**
	 *  買掛明細ＮＯ（振替先・データ）.<p>
	 *
	 */
	public String ap_d_no_to_data() {
		return getConstString(offset + 30, $ap_d_no_to_data);
	}

	/**
	 *  買掛明細ＮＯ（振替先・データ）.<p>
	 *
	 */
	public void ap_d_no_to_data(String value) {
		setConstString(offset + 30, $ap_d_no_to_data, value);
	}


	/**
	 *  予備１.<p>
	 *
	 */
	public String d_sub_char1() {
		return getConstString(offset + 31, $d_sub_char1);
	}

	/**
	 *  予備１.<p>
	 *
	 */
	public void d_sub_char1(String value) {
		setConstString(offset + 31, $d_sub_char1, value);
	}


	/**
	 *  予備２.<p>
	 *
	 */
	public String d_sub_char2() {
		return getConstString(offset + 32, $d_sub_char2);
	}

	/**
	 *  予備２.<p>
	 *
	 */
	public void d_sub_char2(String value) {
		setConstString(offset + 32, $d_sub_char2, value);
	}


	/**
	 *  予備３.<p>
	 *
	 */
	public String d_sub_char3() {
		return getConstString(offset + 33, $d_sub_char3);
	}

	/**
	 *  予備３.<p>
	 *
	 */
	public void d_sub_char3(String value) {
		setConstString(offset + 33, $d_sub_char3, value);
	}


	public String getString(String name) {
		if ($asppl_cd_fr.equalsIgnoreCase(name)) {
			return asppl_cd_fr();
		}
		if ($asppl_nm_fr.equalsIgnoreCase(name)) {
			return asppl_nm_fr();
		}
		if ($asppl_alt_nm1_fr.equalsIgnoreCase(name)) {
			return asppl_alt_nm1_fr();
		}
		if ($asppl_alt_nm2_fr.equalsIgnoreCase(name)) {
			return asppl_alt_nm2_fr();
		}
		if ($asppl_alt_nm3_fr.equalsIgnoreCase(name)) {
			return asppl_alt_nm3_fr();
		}
		if ($asppl_alt_nm4_fr.equalsIgnoreCase(name)) {
			return asppl_alt_nm4_fr();
		}
		if ($bsppl_dpt_cd_fr.equalsIgnoreCase(name)) {
			return bsppl_dpt_cd_fr();
		}
		if ($bsppl_dpt_nm_fr.equalsIgnoreCase(name)) {
			return bsppl_dpt_nm_fr();
		}
		if ($ap_dpt_cd_fr.equalsIgnoreCase(name)) {
			return ap_dpt_cd_fr();
		}
		if ($ap_dpt_nm_fr.equalsIgnoreCase(name)) {
			return ap_dpt_nm_fr();
		}
		if ($ap_typ.equalsIgnoreCase(name)) {
			return ap_typ();
		}
		if ($ap_typ_nm.equalsIgnoreCase(name)) {
			return ap_typ_nm();
		}
		if ($wrk_no_fr_view.equalsIgnoreCase(name)) {
			return wrk_no_fr_view();
		}
		if ($wrk_no_fr_data.equalsIgnoreCase(name)) {
			return wrk_no_fr_data();
		}
		if ($wrk_nm_fr.equalsIgnoreCase(name)) {
			return wrk_nm_fr();
		}
		if ($rcpt_iv_no_view.equalsIgnoreCase(name)) {
			return rcpt_iv_no_view();
		}
		if ($rcpt_iv_no_data.equalsIgnoreCase(name)) {
			return rcpt_iv_no_data();
		}
		if ($rcpt_iv_mng_no_view.equalsIgnoreCase(name)) {
			return rcpt_iv_mng_no_view();
		}
		if ($rcpt_iv_mng_no_data.equalsIgnoreCase(name)) {
			return rcpt_iv_mng_no_data();
		}
		if ($ap_d_no_fr_view.equalsIgnoreCase(name)) {
			return ap_d_no_fr_view();
		}
		if ($ap_d_no_fr_data.equalsIgnoreCase(name)) {
			return ap_d_no_fr_data();
		}
		if ($pay_schd_no_fr_view.equalsIgnoreCase(name)) {
			return pay_schd_no_fr_view();
		}
		if ($pay_schd_no_fr_data.equalsIgnoreCase(name)) {
			return pay_schd_no_fr_data();
		}
		if ($ap_appl_schd_no_fr_view.equalsIgnoreCase(name)) {
			return ap_appl_schd_no_fr_view();
		}
		if ($ap_appl_schd_no_fr_data.equalsIgnoreCase(name)) {
			return ap_appl_schd_no_fr_data();
		}
		if ($s_int_trd_cur_amt.equalsIgnoreCase(name)) {
			return s_int_trd_cur_amt();
		}
		if ($s_dec_trd_cur_amt.equalsIgnoreCase(name)) {
			return s_dec_trd_cur_amt();
		}
		if ($ap_d_no_to_view.equalsIgnoreCase(name)) {
			return ap_d_no_to_view();
		}
		if ($ap_d_no_to_data.equalsIgnoreCase(name)) {
			return ap_d_no_to_data();
		}
		if ($d_sub_char1.equalsIgnoreCase(name)) {
			return d_sub_char1();
		}
		if ($d_sub_char2.equalsIgnoreCase(name)) {
			return d_sub_char2();
		}
		if ($d_sub_char3.equalsIgnoreCase(name)) {
			return d_sub_char3();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($disp_seq.equalsIgnoreCase(name)) {
			return disp_seq();
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			return trd_cur_amt();
		}
		return super.getNumber(name);
	}

	public String getStringNE(String name) {
		if ($asppl_cd_fr.equalsIgnoreCase(name)) {
			return asppl_cd_fr();
		}
		if ($asppl_nm_fr.equalsIgnoreCase(name)) {
			return asppl_nm_fr();
		}
		if ($asppl_alt_nm1_fr.equalsIgnoreCase(name)) {
			return asppl_alt_nm1_fr();
		}
		if ($asppl_alt_nm2_fr.equalsIgnoreCase(name)) {
			return asppl_alt_nm2_fr();
		}
		if ($asppl_alt_nm3_fr.equalsIgnoreCase(name)) {
			return asppl_alt_nm3_fr();
		}
		if ($asppl_alt_nm4_fr.equalsIgnoreCase(name)) {
			return asppl_alt_nm4_fr();
		}
		if ($bsppl_dpt_cd_fr.equalsIgnoreCase(name)) {
			return bsppl_dpt_cd_fr();
		}
		if ($bsppl_dpt_nm_fr.equalsIgnoreCase(name)) {
			return bsppl_dpt_nm_fr();
		}
		if ($ap_dpt_cd_fr.equalsIgnoreCase(name)) {
			return ap_dpt_cd_fr();
		}
		if ($ap_dpt_nm_fr.equalsIgnoreCase(name)) {
			return ap_dpt_nm_fr();
		}
		if ($ap_typ.equalsIgnoreCase(name)) {
			return ap_typ();
		}
		if ($ap_typ_nm.equalsIgnoreCase(name)) {
			return ap_typ_nm();
		}
		if ($wrk_no_fr_view.equalsIgnoreCase(name)) {
			return wrk_no_fr_view();
		}
		if ($wrk_no_fr_data.equalsIgnoreCase(name)) {
			return wrk_no_fr_data();
		}
		if ($wrk_nm_fr.equalsIgnoreCase(name)) {
			return wrk_nm_fr();
		}
		if ($rcpt_iv_no_view.equalsIgnoreCase(name)) {
			return rcpt_iv_no_view();
		}
		if ($rcpt_iv_no_data.equalsIgnoreCase(name)) {
			return rcpt_iv_no_data();
		}
		if ($rcpt_iv_mng_no_view.equalsIgnoreCase(name)) {
			return rcpt_iv_mng_no_view();
		}
		if ($rcpt_iv_mng_no_data.equalsIgnoreCase(name)) {
			return rcpt_iv_mng_no_data();
		}
		if ($ap_d_no_fr_view.equalsIgnoreCase(name)) {
			return ap_d_no_fr_view();
		}
		if ($ap_d_no_fr_data.equalsIgnoreCase(name)) {
			return ap_d_no_fr_data();
		}
		if ($pay_schd_no_fr_view.equalsIgnoreCase(name)) {
			return pay_schd_no_fr_view();
		}
		if ($pay_schd_no_fr_data.equalsIgnoreCase(name)) {
			return pay_schd_no_fr_data();
		}
		if ($ap_appl_schd_no_fr_view.equalsIgnoreCase(name)) {
			return ap_appl_schd_no_fr_view();
		}
		if ($ap_appl_schd_no_fr_data.equalsIgnoreCase(name)) {
			return ap_appl_schd_no_fr_data();
		}
		if ($s_int_trd_cur_amt.equalsIgnoreCase(name)) {
			return s_int_trd_cur_amt();
		}
		if ($s_dec_trd_cur_amt.equalsIgnoreCase(name)) {
			return s_dec_trd_cur_amt();
		}
		if ($ap_d_no_to_view.equalsIgnoreCase(name)) {
			return ap_d_no_to_view();
		}
		if ($ap_d_no_to_data.equalsIgnoreCase(name)) {
			return ap_d_no_to_data();
		}
		if ($d_sub_char1.equalsIgnoreCase(name)) {
			return d_sub_char1();
		}
		if ($d_sub_char2.equalsIgnoreCase(name)) {
			return d_sub_char2();
		}
		if ($d_sub_char3.equalsIgnoreCase(name)) {
			return d_sub_char3();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($disp_seq.equalsIgnoreCase(name)) {
			return disp_seq();
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			return trd_cur_amt();
		}
		return super.getNumberNE(name);
	}

	public void setString(String name, String value) {
		if ($asppl_cd_fr.equalsIgnoreCase(name)) {
			asppl_cd_fr(value);
			return;
		}
		if ($asppl_nm_fr.equalsIgnoreCase(name)) {
			asppl_nm_fr(value);
			return;
		}
		if ($asppl_alt_nm1_fr.equalsIgnoreCase(name)) {
			asppl_alt_nm1_fr(value);
			return;
		}
		if ($asppl_alt_nm2_fr.equalsIgnoreCase(name)) {
			asppl_alt_nm2_fr(value);
			return;
		}
		if ($asppl_alt_nm3_fr.equalsIgnoreCase(name)) {
			asppl_alt_nm3_fr(value);
			return;
		}
		if ($asppl_alt_nm4_fr.equalsIgnoreCase(name)) {
			asppl_alt_nm4_fr(value);
			return;
		}
		if ($bsppl_dpt_cd_fr.equalsIgnoreCase(name)) {
			bsppl_dpt_cd_fr(value);
			return;
		}
		if ($bsppl_dpt_nm_fr.equalsIgnoreCase(name)) {
			bsppl_dpt_nm_fr(value);
			return;
		}
		if ($ap_dpt_cd_fr.equalsIgnoreCase(name)) {
			ap_dpt_cd_fr(value);
			return;
		}
		if ($ap_dpt_nm_fr.equalsIgnoreCase(name)) {
			ap_dpt_nm_fr(value);
			return;
		}
		if ($ap_typ.equalsIgnoreCase(name)) {
			ap_typ(value);
			return;
		}
		if ($ap_typ_nm.equalsIgnoreCase(name)) {
			ap_typ_nm(value);
			return;
		}
		if ($wrk_no_fr_view.equalsIgnoreCase(name)) {
			wrk_no_fr_view(value);
			return;
		}
		if ($wrk_no_fr_data.equalsIgnoreCase(name)) {
			wrk_no_fr_data(value);
			return;
		}
		if ($wrk_nm_fr.equalsIgnoreCase(name)) {
			wrk_nm_fr(value);
			return;
		}
		if ($rcpt_iv_no_view.equalsIgnoreCase(name)) {
			rcpt_iv_no_view(value);
			return;
		}
		if ($rcpt_iv_no_data.equalsIgnoreCase(name)) {
			rcpt_iv_no_data(value);
			return;
		}
		if ($rcpt_iv_mng_no_view.equalsIgnoreCase(name)) {
			rcpt_iv_mng_no_view(value);
			return;
		}
		if ($rcpt_iv_mng_no_data.equalsIgnoreCase(name)) {
			rcpt_iv_mng_no_data(value);
			return;
		}
		if ($ap_d_no_fr_view.equalsIgnoreCase(name)) {
			ap_d_no_fr_view(value);
			return;
		}
		if ($ap_d_no_fr_data.equalsIgnoreCase(name)) {
			ap_d_no_fr_data(value);
			return;
		}
		if ($pay_schd_no_fr_view.equalsIgnoreCase(name)) {
			pay_schd_no_fr_view(value);
			return;
		}
		if ($pay_schd_no_fr_data.equalsIgnoreCase(name)) {
			pay_schd_no_fr_data(value);
			return;
		}
		if ($ap_appl_schd_no_fr_view.equalsIgnoreCase(name)) {
			ap_appl_schd_no_fr_view(value);
			return;
		}
		if ($ap_appl_schd_no_fr_data.equalsIgnoreCase(name)) {
			ap_appl_schd_no_fr_data(value);
			return;
		}
		if ($s_int_trd_cur_amt.equalsIgnoreCase(name)) {
			s_int_trd_cur_amt(value);
			return;
		}
		if ($s_dec_trd_cur_amt.equalsIgnoreCase(name)) {
			s_dec_trd_cur_amt(value);
			return;
		}
		if ($ap_d_no_to_view.equalsIgnoreCase(name)) {
			ap_d_no_to_view(value);
			return;
		}
		if ($ap_d_no_to_data.equalsIgnoreCase(name)) {
			ap_d_no_to_data(value);
			return;
		}
		if ($d_sub_char1.equalsIgnoreCase(name)) {
			d_sub_char1(value);
			return;
		}
		if ($d_sub_char2.equalsIgnoreCase(name)) {
			d_sub_char2(value);
			return;
		}
		if ($d_sub_char3.equalsIgnoreCase(name)) {
			d_sub_char3(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($asppl_cd_fr.equalsIgnoreCase(name)) {
			asppl_cd_fr(value);
			return;
		}
		if ($asppl_nm_fr.equalsIgnoreCase(name)) {
			asppl_nm_fr(value);
			return;
		}
		if ($asppl_alt_nm1_fr.equalsIgnoreCase(name)) {
			asppl_alt_nm1_fr(value);
			return;
		}
		if ($asppl_alt_nm2_fr.equalsIgnoreCase(name)) {
			asppl_alt_nm2_fr(value);
			return;
		}
		if ($asppl_alt_nm3_fr.equalsIgnoreCase(name)) {
			asppl_alt_nm3_fr(value);
			return;
		}
		if ($asppl_alt_nm4_fr.equalsIgnoreCase(name)) {
			asppl_alt_nm4_fr(value);
			return;
		}
		if ($bsppl_dpt_cd_fr.equalsIgnoreCase(name)) {
			bsppl_dpt_cd_fr(value);
			return;
		}
		if ($bsppl_dpt_nm_fr.equalsIgnoreCase(name)) {
			bsppl_dpt_nm_fr(value);
			return;
		}
		if ($ap_dpt_cd_fr.equalsIgnoreCase(name)) {
			ap_dpt_cd_fr(value);
			return;
		}
		if ($ap_dpt_nm_fr.equalsIgnoreCase(name)) {
			ap_dpt_nm_fr(value);
			return;
		}
		if ($ap_typ.equalsIgnoreCase(name)) {
			ap_typ(value);
			return;
		}
		if ($ap_typ_nm.equalsIgnoreCase(name)) {
			ap_typ_nm(value);
			return;
		}
		if ($wrk_no_fr_view.equalsIgnoreCase(name)) {
			wrk_no_fr_view(value);
			return;
		}
		if ($wrk_no_fr_data.equalsIgnoreCase(name)) {
			wrk_no_fr_data(value);
			return;
		}
		if ($wrk_nm_fr.equalsIgnoreCase(name)) {
			wrk_nm_fr(value);
			return;
		}
		if ($rcpt_iv_no_view.equalsIgnoreCase(name)) {
			rcpt_iv_no_view(value);
			return;
		}
		if ($rcpt_iv_no_data.equalsIgnoreCase(name)) {
			rcpt_iv_no_data(value);
			return;
		}
		if ($rcpt_iv_mng_no_view.equalsIgnoreCase(name)) {
			rcpt_iv_mng_no_view(value);
			return;
		}
		if ($rcpt_iv_mng_no_data.equalsIgnoreCase(name)) {
			rcpt_iv_mng_no_data(value);
			return;
		}
		if ($ap_d_no_fr_view.equalsIgnoreCase(name)) {
			ap_d_no_fr_view(value);
			return;
		}
		if ($ap_d_no_fr_data.equalsIgnoreCase(name)) {
			ap_d_no_fr_data(value);
			return;
		}
		if ($pay_schd_no_fr_view.equalsIgnoreCase(name)) {
			pay_schd_no_fr_view(value);
			return;
		}
		if ($pay_schd_no_fr_data.equalsIgnoreCase(name)) {
			pay_schd_no_fr_data(value);
			return;
		}
		if ($ap_appl_schd_no_fr_view.equalsIgnoreCase(name)) {
			ap_appl_schd_no_fr_view(value);
			return;
		}
		if ($ap_appl_schd_no_fr_data.equalsIgnoreCase(name)) {
			ap_appl_schd_no_fr_data(value);
			return;
		}
		if ($s_int_trd_cur_amt.equalsIgnoreCase(name)) {
			s_int_trd_cur_amt(value);
			return;
		}
		if ($s_dec_trd_cur_amt.equalsIgnoreCase(name)) {
			s_dec_trd_cur_amt(value);
			return;
		}
		if ($ap_d_no_to_view.equalsIgnoreCase(name)) {
			ap_d_no_to_view(value);
			return;
		}
		if ($ap_d_no_to_data.equalsIgnoreCase(name)) {
			ap_d_no_to_data(value);
			return;
		}
		if ($d_sub_char1.equalsIgnoreCase(name)) {
			d_sub_char1(value);
			return;
		}
		if ($d_sub_char2.equalsIgnoreCase(name)) {
			d_sub_char2(value);
			return;
		}
		if ($d_sub_char3.equalsIgnoreCase(name)) {
			d_sub_char3(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		super.setNumberNE(name, value);
	}



}

