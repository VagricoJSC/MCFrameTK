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
 * ブロック"PfRptDtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class PfRptDtlR_MC_A extends MCConstRow {

	/**
	 *  弊社品目.<p>
	 *
	 */
	public static final String $itm_cd = "itm_cd";
	/**
	 *  弊社品目別名１.<p>
	 *
	 */
	public static final String $itm_alt_nm1 = "itm_alt_nm1";
	/**
	 *  弊社品目別名２.<p>
	 *
	 */
	public static final String $itm_alt_nm2 = "itm_alt_nm2";
	/**
	 *  弊社品目別名３.<p>
	 *
	 */
	public static final String $itm_alt_nm3 = "itm_alt_nm3";
	/**
	 *  弊社品目別名４.<p>
	 *
	 */
	public static final String $itm_alt_nm4 = "itm_alt_nm4";
	/**
	 *  枝番１（表示用）.<p>
	 *
	 */
	public static final String $itm_sub1_view = "itm_sub1_view";
	/**
	 *  枝番１（データ）.<p>
	 *
	 */
	public static final String $itm_sub1_data = "itm_sub1_data";
	/**
	 *  枝番２（表示用）.<p>
	 *
	 */
	public static final String $itm_sub2_view = "itm_sub2_view";
	/**
	 *  枝番２（データ）.<p>
	 *
	 */
	public static final String $itm_sub2_data = "itm_sub2_data";
	/**
	 *  枝番３（表示用）.<p>
	 *
	 */
	public static final String $itm_sub3_view = "itm_sub3_view";
	/**
	 *  枝番３（データ）.<p>
	 *
	 */
	public static final String $itm_sub3_data = "itm_sub3_data";
	/**
	 *  弊社品名.<p>
	 *
	 */
	public static final String $itm_nm = "itm_nm";
	/**
	 *  貴社品目.<p>
	 *
	 */
	public static final String $sppl_itm_cd = "sppl_itm_cd";
	/**
	 *  貴社品名.<p>
	 *
	 */
	public static final String $sppl_itm_nm = "sppl_itm_nm";
	/**
	 *  単位.<p>
	 *
	 */
	public static final String $unit_cd = "unit_cd";
	/**
	 *  単位名.<p>
	 *
	 */
	public static final String $unit_nm = "unit_nm";
	/**
	 *  備考.<p>
	 *
	 */
	public static final String $pf_rpt_d_rmrks = "pf_rpt_d_rmrks";
	/**
	 *  内示期間区分.<p>
	 *
	 */
	public static final String $pf_period_typ = "pf_period_typ";
	/**
	 *  内示期間区分名.<p>
	 *
	 */
	public static final String $pf_period_typ_nm = "pf_period_typ_nm";
	/**
	 *  内示期間開始日.<p>
	 *
	 */
	public static final String $pf_period_st_dt = "pf_period_st_dt";
	/**
	 *  内示期間終了日.<p>
	 *
	 */
	public static final String $pf_period_end_dt = "pf_period_end_dt";
	/**
	 *  確定期間文字（前月度）.<p>
	 *
	 */
	public static final String $pre_ym_flg = "pre_ym_flg";
	/**
	 *  前月度内示数.<p>
	 *
	 */
	public static final String $pre_qty = "pre_qty";
	/**
	 *  前月度内示数文字列.<p>
	 *
	 */
	public static final String $s_pre_qty = "s_pre_qty";
	/**
	 *  前月度内示数文字列（整数部）.<p>
	 *
	 */
	public static final String $s_int_pre_qty = "s_int_pre_qty";
	/**
	 *  前月度内示数文字列（少数部）.<p>
	 *
	 */
	public static final String $s_dec_pre_qty = "s_dec_pre_qty";
	/**
	 *  確定期間文字（当月）.<p>
	 *
	 */
	public static final String $ym_flg = "ym_flg";
	/**
	 *  当月内示数.<p>
	 *
	 */
	public static final String $qty = "qty";
	/**
	 *  当月内示数文字列.<p>
	 *
	 */
	public static final String $s_qty = "s_qty";
	/**
	 *  当月内示数文字列（整数部）.<p>
	 *
	 */
	public static final String $s_int_qty = "s_int_qty";
	/**
	 *  当月内示数文字列（少数部）.<p>
	 *
	 */
	public static final String $s_dec_qty = "s_dec_qty";
	/**
	 *  発注済数.<p>
	 *
	 */
	public static final String $po_qty = "po_qty";
	/**
	 *  発注済数文字列.<p>
	 *
	 */
	public static final String $s_po_qty = "s_po_qty";
	/**
	 *  発注済数文字列（整数部）.<p>
	 *
	 */
	public static final String $s_int_po_qty = "s_int_po_qty";
	/**
	 *  発注済数文字列（少数部）.<p>
	 *
	 */
	public static final String $s_dec_po_qty = "s_dec_po_qty";
	/**
	 *  表示順.<p>
	 *
	 */
	public static final String $disp_seq = "disp_seq";
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


	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_alt_nm1_META = createCommonMeta($itm_alt_nm1, mcframe.commonMA.meta.MA_META.ITM_ALT_NM1);
	public static final MCMeta itm_alt_nm2_META = createCommonMeta($itm_alt_nm2, mcframe.commonMA.meta.MA_META.ITM_ALT_NM2);
	public static final MCMeta itm_alt_nm3_META = createCommonMeta($itm_alt_nm3, mcframe.commonMA.meta.MA_META.ITM_ALT_NM3);
	public static final MCMeta itm_alt_nm4_META = createCommonMeta($itm_alt_nm4, mcframe.commonMA.meta.MA_META.ITM_ALT_NM4);
	public static final MCMeta itm_sub1_view_META = createCommonMeta($itm_sub1_view, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub1_data_META = createCommonMeta($itm_sub1_data, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_view_META = createCommonMeta($itm_sub2_view, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub2_data_META = createCommonMeta($itm_sub2_data, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_view_META = createCommonMeta($itm_sub3_view, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta itm_sub3_data_META = createCommonMeta($itm_sub3_data, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta itm_nm_META = createCommonMeta($itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta sppl_itm_cd_META = createCommonMeta($sppl_itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta sppl_itm_nm_META = createCommonMeta($sppl_itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta unit_cd_META = createCommonMeta($unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta unit_nm_META = createCommonMeta($unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta pf_rpt_d_rmrks_META = createCommonMeta($pf_rpt_d_rmrks, mcframe.commonMS.meta.MS_META.PF_FIX_RPT_RMRKS);
	public static final MCMeta pf_period_typ_META = createCommonMeta($pf_period_typ, mcframe.commonMA.meta.MA_META.PERIOD_TYP);
	public static final MCMeta pf_period_typ_nm_META = createCommonMeta($pf_period_typ_nm, mcframe.commonMA.meta.MA_META.PERIOD_TYP_NM);
	public static final MCMeta pf_period_st_dt_META = createCommonMeta($pf_period_st_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta pf_period_end_dt_META = createCommonMeta($pf_period_end_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta pre_ym_flg_META = createCommonMeta($pre_ym_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta pre_qty_META = createCommonMeta($pre_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta s_pre_qty_META = createStringMeta($s_pre_qty);
	public static final MCMeta s_int_pre_qty_META = createStringMeta($s_int_pre_qty);
	public static final MCMeta s_dec_pre_qty_META = createStringMeta($s_dec_pre_qty);
	public static final MCMeta ym_flg_META = createCommonMeta($ym_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta qty_META = createCommonMeta($qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta s_qty_META = createStringMeta($s_qty);
	public static final MCMeta s_int_qty_META = createStringMeta($s_int_qty);
	public static final MCMeta s_dec_qty_META = createStringMeta($s_dec_qty);
	public static final MCMeta po_qty_META = createCommonMeta($po_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta s_po_qty_META = createStringMeta($s_po_qty);
	public static final MCMeta s_int_po_qty_META = createStringMeta($s_int_po_qty);
	public static final MCMeta s_dec_po_qty_META = createStringMeta($s_dec_po_qty);
	public static final MCMeta disp_seq_META = createCommonMeta($disp_seq, mcframe.commonMA.meta.MA_META.DISP_SEQ);
	public static final MCMeta d_sub_char1_META = createCommonMeta($d_sub_char1, mcframe.commonMS.meta.MS_META.PF_FIX_SUB_CHAR1);
	public static final MCMeta d_sub_char2_META = createCommonMeta($d_sub_char2, mcframe.commonMS.meta.MS_META.PF_FIX_SUB_CHAR2);
	public static final MCMeta d_sub_char3_META = createCommonMeta($d_sub_char3, mcframe.commonMS.meta.MS_META.PF_FIX_SUB_CHAR3);

	protected static final ConstMetaList<PfRptDtlR> constMetas = new ConstMetaList<PfRptDtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			itm_cd_META,
			itm_alt_nm1_META,
			itm_alt_nm2_META,
			itm_alt_nm3_META,
			itm_alt_nm4_META,
			itm_sub1_view_META,
			itm_sub1_data_META,
			itm_sub2_view_META,
			itm_sub2_data_META,
			itm_sub3_view_META,
			itm_sub3_data_META,
			itm_nm_META,
			sppl_itm_cd_META,
			sppl_itm_nm_META,
			unit_cd_META,
			unit_nm_META,
			pf_rpt_d_rmrks_META,
			pf_period_typ_META,
			pf_period_typ_nm_META,
			pf_period_st_dt_META,
			pf_period_end_dt_META,
			pre_ym_flg_META,
			pre_qty_META,
			s_pre_qty_META,
			s_int_pre_qty_META,
			s_dec_pre_qty_META,
			ym_flg_META,
			qty_META,
			s_qty_META,
			s_int_qty_META,
			s_dec_qty_META,
			po_qty_META,
			s_po_qty_META,
			s_int_po_qty_META,
			s_dec_po_qty_META,
			disp_seq_META,
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
	protected PfRptDtlR_MC_A(ConstMetaList<? extends PfRptDtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public PfRptDtlR clone() {
		return (PfRptDtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public PfRptDtlR createInstance() {
		return (PfRptDtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public PfRptDtlR getValues(String... names) {
		return (PfRptDtlR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 *  弊社品目.<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 0, $itm_cd);
	}

	/**
	 *  弊社品目.<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 0, $itm_cd, value);
	}


	/**
	 *  弊社品目別名１.<p>
	 *
	 */
	public String itm_alt_nm1() {
		return getConstString(offset + 1, $itm_alt_nm1);
	}

	/**
	 *  弊社品目別名１.<p>
	 *
	 */
	public void itm_alt_nm1(String value) {
		setConstString(offset + 1, $itm_alt_nm1, value);
	}


	/**
	 *  弊社品目別名２.<p>
	 *
	 */
	public String itm_alt_nm2() {
		return getConstString(offset + 2, $itm_alt_nm2);
	}

	/**
	 *  弊社品目別名２.<p>
	 *
	 */
	public void itm_alt_nm2(String value) {
		setConstString(offset + 2, $itm_alt_nm2, value);
	}


	/**
	 *  弊社品目別名３.<p>
	 *
	 */
	public String itm_alt_nm3() {
		return getConstString(offset + 3, $itm_alt_nm3);
	}

	/**
	 *  弊社品目別名３.<p>
	 *
	 */
	public void itm_alt_nm3(String value) {
		setConstString(offset + 3, $itm_alt_nm3, value);
	}


	/**
	 *  弊社品目別名４.<p>
	 *
	 */
	public String itm_alt_nm4() {
		return getConstString(offset + 4, $itm_alt_nm4);
	}

	/**
	 *  弊社品目別名４.<p>
	 *
	 */
	public void itm_alt_nm4(String value) {
		setConstString(offset + 4, $itm_alt_nm4, value);
	}


	/**
	 *  枝番１（表示用）.<p>
	 *
	 */
	public String itm_sub1_view() {
		return getConstString(offset + 5, $itm_sub1_view);
	}

	/**
	 *  枝番１（表示用）.<p>
	 *
	 */
	public void itm_sub1_view(String value) {
		setConstString(offset + 5, $itm_sub1_view, value);
	}


	/**
	 *  枝番１（データ）.<p>
	 *
	 */
	public String itm_sub1_data() {
		return getConstString(offset + 6, $itm_sub1_data);
	}

	/**
	 *  枝番１（データ）.<p>
	 *
	 */
	public void itm_sub1_data(String value) {
		setConstString(offset + 6, $itm_sub1_data, value);
	}


	/**
	 *  枝番２（表示用）.<p>
	 *
	 */
	public String itm_sub2_view() {
		return getConstString(offset + 7, $itm_sub2_view);
	}

	/**
	 *  枝番２（表示用）.<p>
	 *
	 */
	public void itm_sub2_view(String value) {
		setConstString(offset + 7, $itm_sub2_view, value);
	}


	/**
	 *  枝番２（データ）.<p>
	 *
	 */
	public String itm_sub2_data() {
		return getConstString(offset + 8, $itm_sub2_data);
	}

	/**
	 *  枝番２（データ）.<p>
	 *
	 */
	public void itm_sub2_data(String value) {
		setConstString(offset + 8, $itm_sub2_data, value);
	}


	/**
	 *  枝番３（表示用）.<p>
	 *
	 */
	public String itm_sub3_view() {
		return getConstString(offset + 9, $itm_sub3_view);
	}

	/**
	 *  枝番３（表示用）.<p>
	 *
	 */
	public void itm_sub3_view(String value) {
		setConstString(offset + 9, $itm_sub3_view, value);
	}


	/**
	 *  枝番３（データ）.<p>
	 *
	 */
	public String itm_sub3_data() {
		return getConstString(offset + 10, $itm_sub3_data);
	}

	/**
	 *  枝番３（データ）.<p>
	 *
	 */
	public void itm_sub3_data(String value) {
		setConstString(offset + 10, $itm_sub3_data, value);
	}


	/**
	 *  弊社品名.<p>
	 *
	 */
	public String itm_nm() {
		return getConstString(offset + 11, $itm_nm);
	}

	/**
	 *  弊社品名.<p>
	 *
	 */
	public void itm_nm(String value) {
		setConstString(offset + 11, $itm_nm, value);
	}


	/**
	 *  貴社品目.<p>
	 *
	 */
	public String sppl_itm_cd() {
		return getConstString(offset + 12, $sppl_itm_cd);
	}

	/**
	 *  貴社品目.<p>
	 *
	 */
	public void sppl_itm_cd(String value) {
		setConstString(offset + 12, $sppl_itm_cd, value);
	}


	/**
	 *  貴社品名.<p>
	 *
	 */
	public String sppl_itm_nm() {
		return getConstString(offset + 13, $sppl_itm_nm);
	}

	/**
	 *  貴社品名.<p>
	 *
	 */
	public void sppl_itm_nm(String value) {
		setConstString(offset + 13, $sppl_itm_nm, value);
	}


	/**
	 *  単位.<p>
	 *
	 */
	public String unit_cd() {
		return getConstString(offset + 14, $unit_cd);
	}

	/**
	 *  単位.<p>
	 *
	 */
	public void unit_cd(String value) {
		setConstString(offset + 14, $unit_cd, value);
	}


	/**
	 *  単位名.<p>
	 *
	 */
	public String unit_nm() {
		return getConstString(offset + 15, $unit_nm);
	}

	/**
	 *  単位名.<p>
	 *
	 */
	public void unit_nm(String value) {
		setConstString(offset + 15, $unit_nm, value);
	}


	/**
	 *  備考.<p>
	 *
	 */
	public String pf_rpt_d_rmrks() {
		return getConstString(offset + 16, $pf_rpt_d_rmrks);
	}

	/**
	 *  備考.<p>
	 *
	 */
	public void pf_rpt_d_rmrks(String value) {
		setConstString(offset + 16, $pf_rpt_d_rmrks, value);
	}


	/**
	 *  内示期間区分.<p>
	 *
	 */
	public String pf_period_typ() {
		return getConstString(offset + 17, $pf_period_typ);
	}

	/**
	 *  内示期間区分.<p>
	 *
	 */
	public void pf_period_typ(String value) {
		setConstString(offset + 17, $pf_period_typ, value);
	}


	/**
	 *  内示期間区分名.<p>
	 *
	 */
	public String pf_period_typ_nm() {
		return getConstString(offset + 18, $pf_period_typ_nm);
	}

	/**
	 *  内示期間区分名.<p>
	 *
	 */
	public void pf_period_typ_nm(String value) {
		setConstString(offset + 18, $pf_period_typ_nm, value);
	}


	/**
	 *  内示期間開始日.<p>
	 *
	 */
	public MCDate pf_period_st_dt() {
		return getConstDate(offset + 19, $pf_period_st_dt);
	}

	/**
	 *  内示期間開始日.<p>
	 *
	 */
	public void pf_period_st_dt(MCDate value) {
		setConstDate(offset + 19, $pf_period_st_dt, value);
	}


	/**
	 *  内示期間終了日.<p>
	 *
	 */
	public MCDate pf_period_end_dt() {
		return getConstDate(offset + 20, $pf_period_end_dt);
	}

	/**
	 *  内示期間終了日.<p>
	 *
	 */
	public void pf_period_end_dt(MCDate value) {
		setConstDate(offset + 20, $pf_period_end_dt, value);
	}


	/**
	 *  確定期間文字（前月度）.<p>
	 *
	 */
	public boolean pre_ym_flg() {
		return getConstBoolean(offset + 21, $pre_ym_flg);
	}

	/**
	 *  確定期間文字（前月度）.<p>
	 *
	 */
	public void pre_ym_flg(boolean value) {
		setConstBoolean(offset + 21, $pre_ym_flg, value);
	}


	/**
	 *  前月度内示数.<p>
	 *
	 */
	public MCNumber pre_qty() {
		return getConstNumber(offset + 22, $pre_qty);
	}

	/**
	 *  前月度内示数.<p>
	 *
	 */
	public void pre_qty(MCNumber value) {
		setConstNumber(offset + 22, $pre_qty, value);
	}

	/**
	 *  前月度内示数.<p>
	 *
	 */
	public void pre_qty(int value) {
		setConstNumber(offset + 22, $pre_qty, value);
	}

	/**
	 *  前月度内示数.<p>
	 *
	 */
	public void pre_qty(long value) {
		setConstNumber(offset + 22, $pre_qty, value);
	}

	/**
	 *  前月度内示数.<p>
	 *
	 */
	public void pre_qty(float value) {
		setConstNumber(offset + 22, $pre_qty, value);
	}

	/**
	 *  前月度内示数.<p>
	 *
	 */
	public void pre_qty(double value) {
		setConstNumber(offset + 22, $pre_qty, value);
	}


	/**
	 *  前月度内示数文字列.<p>
	 *
	 */
	public String s_pre_qty() {
		return getConstString(offset + 23, $s_pre_qty);
	}

	/**
	 *  前月度内示数文字列.<p>
	 *
	 */
	public void s_pre_qty(String value) {
		setConstString(offset + 23, $s_pre_qty, value);
	}


	/**
	 *  前月度内示数文字列（整数部）.<p>
	 *
	 */
	public String s_int_pre_qty() {
		return getConstString(offset + 24, $s_int_pre_qty);
	}

	/**
	 *  前月度内示数文字列（整数部）.<p>
	 *
	 */
	public void s_int_pre_qty(String value) {
		setConstString(offset + 24, $s_int_pre_qty, value);
	}


	/**
	 *  前月度内示数文字列（少数部）.<p>
	 *
	 */
	public String s_dec_pre_qty() {
		return getConstString(offset + 25, $s_dec_pre_qty);
	}

	/**
	 *  前月度内示数文字列（少数部）.<p>
	 *
	 */
	public void s_dec_pre_qty(String value) {
		setConstString(offset + 25, $s_dec_pre_qty, value);
	}


	/**
	 *  確定期間文字（当月）.<p>
	 *
	 */
	public boolean ym_flg() {
		return getConstBoolean(offset + 26, $ym_flg);
	}

	/**
	 *  確定期間文字（当月）.<p>
	 *
	 */
	public void ym_flg(boolean value) {
		setConstBoolean(offset + 26, $ym_flg, value);
	}


	/**
	 *  当月内示数.<p>
	 *
	 */
	public MCNumber qty() {
		return getConstNumber(offset + 27, $qty);
	}

	/**
	 *  当月内示数.<p>
	 *
	 */
	public void qty(MCNumber value) {
		setConstNumber(offset + 27, $qty, value);
	}

	/**
	 *  当月内示数.<p>
	 *
	 */
	public void qty(int value) {
		setConstNumber(offset + 27, $qty, value);
	}

	/**
	 *  当月内示数.<p>
	 *
	 */
	public void qty(long value) {
		setConstNumber(offset + 27, $qty, value);
	}

	/**
	 *  当月内示数.<p>
	 *
	 */
	public void qty(float value) {
		setConstNumber(offset + 27, $qty, value);
	}

	/**
	 *  当月内示数.<p>
	 *
	 */
	public void qty(double value) {
		setConstNumber(offset + 27, $qty, value);
	}


	/**
	 *  当月内示数文字列.<p>
	 *
	 */
	public String s_qty() {
		return getConstString(offset + 28, $s_qty);
	}

	/**
	 *  当月内示数文字列.<p>
	 *
	 */
	public void s_qty(String value) {
		setConstString(offset + 28, $s_qty, value);
	}


	/**
	 *  当月内示数文字列（整数部）.<p>
	 *
	 */
	public String s_int_qty() {
		return getConstString(offset + 29, $s_int_qty);
	}

	/**
	 *  当月内示数文字列（整数部）.<p>
	 *
	 */
	public void s_int_qty(String value) {
		setConstString(offset + 29, $s_int_qty, value);
	}


	/**
	 *  当月内示数文字列（少数部）.<p>
	 *
	 */
	public String s_dec_qty() {
		return getConstString(offset + 30, $s_dec_qty);
	}

	/**
	 *  当月内示数文字列（少数部）.<p>
	 *
	 */
	public void s_dec_qty(String value) {
		setConstString(offset + 30, $s_dec_qty, value);
	}


	/**
	 *  発注済数.<p>
	 *
	 */
	public MCNumber po_qty() {
		return getConstNumber(offset + 31, $po_qty);
	}

	/**
	 *  発注済数.<p>
	 *
	 */
	public void po_qty(MCNumber value) {
		setConstNumber(offset + 31, $po_qty, value);
	}

	/**
	 *  発注済数.<p>
	 *
	 */
	public void po_qty(int value) {
		setConstNumber(offset + 31, $po_qty, value);
	}

	/**
	 *  発注済数.<p>
	 *
	 */
	public void po_qty(long value) {
		setConstNumber(offset + 31, $po_qty, value);
	}

	/**
	 *  発注済数.<p>
	 *
	 */
	public void po_qty(float value) {
		setConstNumber(offset + 31, $po_qty, value);
	}

	/**
	 *  発注済数.<p>
	 *
	 */
	public void po_qty(double value) {
		setConstNumber(offset + 31, $po_qty, value);
	}


	/**
	 *  発注済数文字列.<p>
	 *
	 */
	public String s_po_qty() {
		return getConstString(offset + 32, $s_po_qty);
	}

	/**
	 *  発注済数文字列.<p>
	 *
	 */
	public void s_po_qty(String value) {
		setConstString(offset + 32, $s_po_qty, value);
	}


	/**
	 *  発注済数文字列（整数部）.<p>
	 *
	 */
	public String s_int_po_qty() {
		return getConstString(offset + 33, $s_int_po_qty);
	}

	/**
	 *  発注済数文字列（整数部）.<p>
	 *
	 */
	public void s_int_po_qty(String value) {
		setConstString(offset + 33, $s_int_po_qty, value);
	}


	/**
	 *  発注済数文字列（少数部）.<p>
	 *
	 */
	public String s_dec_po_qty() {
		return getConstString(offset + 34, $s_dec_po_qty);
	}

	/**
	 *  発注済数文字列（少数部）.<p>
	 *
	 */
	public void s_dec_po_qty(String value) {
		setConstString(offset + 34, $s_dec_po_qty, value);
	}


	/**
	 *  表示順.<p>
	 *
	 */
	public MCNumber disp_seq() {
		return getConstNumber(offset + 35, $disp_seq);
	}

	/**
	 *  表示順.<p>
	 *
	 */
	public void disp_seq(MCNumber value) {
		setConstNumber(offset + 35, $disp_seq, value);
	}

	/**
	 *  表示順.<p>
	 *
	 */
	public void disp_seq(int value) {
		setConstNumber(offset + 35, $disp_seq, value);
	}

	/**
	 *  表示順.<p>
	 *
	 */
	public void disp_seq(long value) {
		setConstNumber(offset + 35, $disp_seq, value);
	}

	/**
	 *  表示順.<p>
	 *
	 */
	public void disp_seq(float value) {
		setConstNumber(offset + 35, $disp_seq, value);
	}

	/**
	 *  表示順.<p>
	 *
	 */
	public void disp_seq(double value) {
		setConstNumber(offset + 35, $disp_seq, value);
	}


	/**
	 *  予備１.<p>
	 *
	 */
	public String d_sub_char1() {
		return getConstString(offset + 36, $d_sub_char1);
	}

	/**
	 *  予備１.<p>
	 *
	 */
	public void d_sub_char1(String value) {
		setConstString(offset + 36, $d_sub_char1, value);
	}


	/**
	 *  予備２.<p>
	 *
	 */
	public String d_sub_char2() {
		return getConstString(offset + 37, $d_sub_char2);
	}

	/**
	 *  予備２.<p>
	 *
	 */
	public void d_sub_char2(String value) {
		setConstString(offset + 37, $d_sub_char2, value);
	}


	/**
	 *  予備３.<p>
	 *
	 */
	public String d_sub_char3() {
		return getConstString(offset + 38, $d_sub_char3);
	}

	/**
	 *  予備３.<p>
	 *
	 */
	public void d_sub_char3(String value) {
		setConstString(offset + 38, $d_sub_char3, value);
	}


	public String getString(String name) {
		if ($itm_cd.equalsIgnoreCase(name)) {
			return itm_cd();
		}
		if ($itm_alt_nm1.equalsIgnoreCase(name)) {
			return itm_alt_nm1();
		}
		if ($itm_alt_nm2.equalsIgnoreCase(name)) {
			return itm_alt_nm2();
		}
		if ($itm_alt_nm3.equalsIgnoreCase(name)) {
			return itm_alt_nm3();
		}
		if ($itm_alt_nm4.equalsIgnoreCase(name)) {
			return itm_alt_nm4();
		}
		if ($itm_sub1_view.equalsIgnoreCase(name)) {
			return itm_sub1_view();
		}
		if ($itm_sub1_data.equalsIgnoreCase(name)) {
			return itm_sub1_data();
		}
		if ($itm_sub2_view.equalsIgnoreCase(name)) {
			return itm_sub2_view();
		}
		if ($itm_sub2_data.equalsIgnoreCase(name)) {
			return itm_sub2_data();
		}
		if ($itm_sub3_view.equalsIgnoreCase(name)) {
			return itm_sub3_view();
		}
		if ($itm_sub3_data.equalsIgnoreCase(name)) {
			return itm_sub3_data();
		}
		if ($itm_nm.equalsIgnoreCase(name)) {
			return itm_nm();
		}
		if ($sppl_itm_cd.equalsIgnoreCase(name)) {
			return sppl_itm_cd();
		}
		if ($sppl_itm_nm.equalsIgnoreCase(name)) {
			return sppl_itm_nm();
		}
		if ($unit_cd.equalsIgnoreCase(name)) {
			return unit_cd();
		}
		if ($unit_nm.equalsIgnoreCase(name)) {
			return unit_nm();
		}
		if ($pf_rpt_d_rmrks.equalsIgnoreCase(name)) {
			return pf_rpt_d_rmrks();
		}
		if ($pf_period_typ.equalsIgnoreCase(name)) {
			return pf_period_typ();
		}
		if ($pf_period_typ_nm.equalsIgnoreCase(name)) {
			return pf_period_typ_nm();
		}
		if ($s_pre_qty.equalsIgnoreCase(name)) {
			return s_pre_qty();
		}
		if ($s_int_pre_qty.equalsIgnoreCase(name)) {
			return s_int_pre_qty();
		}
		if ($s_dec_pre_qty.equalsIgnoreCase(name)) {
			return s_dec_pre_qty();
		}
		if ($s_qty.equalsIgnoreCase(name)) {
			return s_qty();
		}
		if ($s_int_qty.equalsIgnoreCase(name)) {
			return s_int_qty();
		}
		if ($s_dec_qty.equalsIgnoreCase(name)) {
			return s_dec_qty();
		}
		if ($s_po_qty.equalsIgnoreCase(name)) {
			return s_po_qty();
		}
		if ($s_int_po_qty.equalsIgnoreCase(name)) {
			return s_int_po_qty();
		}
		if ($s_dec_po_qty.equalsIgnoreCase(name)) {
			return s_dec_po_qty();
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
		if ($pre_qty.equalsIgnoreCase(name)) {
			return pre_qty();
		}
		if ($qty.equalsIgnoreCase(name)) {
			return qty();
		}
		if ($po_qty.equalsIgnoreCase(name)) {
			return po_qty();
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			return disp_seq();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($pf_period_st_dt.equalsIgnoreCase(name)) {
			return pf_period_st_dt();
		}
		if ($pf_period_end_dt.equalsIgnoreCase(name)) {
			return pf_period_end_dt();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($pre_ym_flg.equalsIgnoreCase(name)) {
			return pre_ym_flg();
		}
		if ($ym_flg.equalsIgnoreCase(name)) {
			return ym_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($itm_cd.equalsIgnoreCase(name)) {
			return itm_cd();
		}
		if ($itm_alt_nm1.equalsIgnoreCase(name)) {
			return itm_alt_nm1();
		}
		if ($itm_alt_nm2.equalsIgnoreCase(name)) {
			return itm_alt_nm2();
		}
		if ($itm_alt_nm3.equalsIgnoreCase(name)) {
			return itm_alt_nm3();
		}
		if ($itm_alt_nm4.equalsIgnoreCase(name)) {
			return itm_alt_nm4();
		}
		if ($itm_sub1_view.equalsIgnoreCase(name)) {
			return itm_sub1_view();
		}
		if ($itm_sub1_data.equalsIgnoreCase(name)) {
			return itm_sub1_data();
		}
		if ($itm_sub2_view.equalsIgnoreCase(name)) {
			return itm_sub2_view();
		}
		if ($itm_sub2_data.equalsIgnoreCase(name)) {
			return itm_sub2_data();
		}
		if ($itm_sub3_view.equalsIgnoreCase(name)) {
			return itm_sub3_view();
		}
		if ($itm_sub3_data.equalsIgnoreCase(name)) {
			return itm_sub3_data();
		}
		if ($itm_nm.equalsIgnoreCase(name)) {
			return itm_nm();
		}
		if ($sppl_itm_cd.equalsIgnoreCase(name)) {
			return sppl_itm_cd();
		}
		if ($sppl_itm_nm.equalsIgnoreCase(name)) {
			return sppl_itm_nm();
		}
		if ($unit_cd.equalsIgnoreCase(name)) {
			return unit_cd();
		}
		if ($unit_nm.equalsIgnoreCase(name)) {
			return unit_nm();
		}
		if ($pf_rpt_d_rmrks.equalsIgnoreCase(name)) {
			return pf_rpt_d_rmrks();
		}
		if ($pf_period_typ.equalsIgnoreCase(name)) {
			return pf_period_typ();
		}
		if ($pf_period_typ_nm.equalsIgnoreCase(name)) {
			return pf_period_typ_nm();
		}
		if ($s_pre_qty.equalsIgnoreCase(name)) {
			return s_pre_qty();
		}
		if ($s_int_pre_qty.equalsIgnoreCase(name)) {
			return s_int_pre_qty();
		}
		if ($s_dec_pre_qty.equalsIgnoreCase(name)) {
			return s_dec_pre_qty();
		}
		if ($s_qty.equalsIgnoreCase(name)) {
			return s_qty();
		}
		if ($s_int_qty.equalsIgnoreCase(name)) {
			return s_int_qty();
		}
		if ($s_dec_qty.equalsIgnoreCase(name)) {
			return s_dec_qty();
		}
		if ($s_po_qty.equalsIgnoreCase(name)) {
			return s_po_qty();
		}
		if ($s_int_po_qty.equalsIgnoreCase(name)) {
			return s_int_po_qty();
		}
		if ($s_dec_po_qty.equalsIgnoreCase(name)) {
			return s_dec_po_qty();
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
		if ($pre_qty.equalsIgnoreCase(name)) {
			return pre_qty();
		}
		if ($qty.equalsIgnoreCase(name)) {
			return qty();
		}
		if ($po_qty.equalsIgnoreCase(name)) {
			return po_qty();
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			return disp_seq();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($pf_period_st_dt.equalsIgnoreCase(name)) {
			return pf_period_st_dt();
		}
		if ($pf_period_end_dt.equalsIgnoreCase(name)) {
			return pf_period_end_dt();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($pre_ym_flg.equalsIgnoreCase(name)) {
			return pre_ym_flg();
		}
		if ($ym_flg.equalsIgnoreCase(name)) {
			return ym_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($itm_cd.equalsIgnoreCase(name)) {
			itm_cd(value);
			return;
		}
		if ($itm_alt_nm1.equalsIgnoreCase(name)) {
			itm_alt_nm1(value);
			return;
		}
		if ($itm_alt_nm2.equalsIgnoreCase(name)) {
			itm_alt_nm2(value);
			return;
		}
		if ($itm_alt_nm3.equalsIgnoreCase(name)) {
			itm_alt_nm3(value);
			return;
		}
		if ($itm_alt_nm4.equalsIgnoreCase(name)) {
			itm_alt_nm4(value);
			return;
		}
		if ($itm_sub1_view.equalsIgnoreCase(name)) {
			itm_sub1_view(value);
			return;
		}
		if ($itm_sub1_data.equalsIgnoreCase(name)) {
			itm_sub1_data(value);
			return;
		}
		if ($itm_sub2_view.equalsIgnoreCase(name)) {
			itm_sub2_view(value);
			return;
		}
		if ($itm_sub2_data.equalsIgnoreCase(name)) {
			itm_sub2_data(value);
			return;
		}
		if ($itm_sub3_view.equalsIgnoreCase(name)) {
			itm_sub3_view(value);
			return;
		}
		if ($itm_sub3_data.equalsIgnoreCase(name)) {
			itm_sub3_data(value);
			return;
		}
		if ($itm_nm.equalsIgnoreCase(name)) {
			itm_nm(value);
			return;
		}
		if ($sppl_itm_cd.equalsIgnoreCase(name)) {
			sppl_itm_cd(value);
			return;
		}
		if ($sppl_itm_nm.equalsIgnoreCase(name)) {
			sppl_itm_nm(value);
			return;
		}
		if ($unit_cd.equalsIgnoreCase(name)) {
			unit_cd(value);
			return;
		}
		if ($unit_nm.equalsIgnoreCase(name)) {
			unit_nm(value);
			return;
		}
		if ($pf_rpt_d_rmrks.equalsIgnoreCase(name)) {
			pf_rpt_d_rmrks(value);
			return;
		}
		if ($pf_period_typ.equalsIgnoreCase(name)) {
			pf_period_typ(value);
			return;
		}
		if ($pf_period_typ_nm.equalsIgnoreCase(name)) {
			pf_period_typ_nm(value);
			return;
		}
		if ($s_pre_qty.equalsIgnoreCase(name)) {
			s_pre_qty(value);
			return;
		}
		if ($s_int_pre_qty.equalsIgnoreCase(name)) {
			s_int_pre_qty(value);
			return;
		}
		if ($s_dec_pre_qty.equalsIgnoreCase(name)) {
			s_dec_pre_qty(value);
			return;
		}
		if ($s_qty.equalsIgnoreCase(name)) {
			s_qty(value);
			return;
		}
		if ($s_int_qty.equalsIgnoreCase(name)) {
			s_int_qty(value);
			return;
		}
		if ($s_dec_qty.equalsIgnoreCase(name)) {
			s_dec_qty(value);
			return;
		}
		if ($s_po_qty.equalsIgnoreCase(name)) {
			s_po_qty(value);
			return;
		}
		if ($s_int_po_qty.equalsIgnoreCase(name)) {
			s_int_po_qty(value);
			return;
		}
		if ($s_dec_po_qty.equalsIgnoreCase(name)) {
			s_dec_po_qty(value);
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
		if ($pre_qty.equalsIgnoreCase(name)) {
			pre_qty(value);
			return;
		}
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($po_qty.equalsIgnoreCase(name)) {
			po_qty(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($pre_qty.equalsIgnoreCase(name)) {
			pre_qty(value);
			return;
		}
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($po_qty.equalsIgnoreCase(name)) {
			po_qty(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($pre_qty.equalsIgnoreCase(name)) {
			pre_qty(value);
			return;
		}
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($po_qty.equalsIgnoreCase(name)) {
			po_qty(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($pre_qty.equalsIgnoreCase(name)) {
			pre_qty(value);
			return;
		}
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($po_qty.equalsIgnoreCase(name)) {
			po_qty(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($pre_qty.equalsIgnoreCase(name)) {
			pre_qty(value);
			return;
		}
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($po_qty.equalsIgnoreCase(name)) {
			po_qty(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($pf_period_st_dt.equalsIgnoreCase(name)) {
			pf_period_st_dt(value);
			return;
		}
		if ($pf_period_end_dt.equalsIgnoreCase(name)) {
			pf_period_end_dt(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($pre_ym_flg.equalsIgnoreCase(name)) {
			pre_ym_flg(value);
			return;
		}
		if ($ym_flg.equalsIgnoreCase(name)) {
			ym_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($itm_cd.equalsIgnoreCase(name)) {
			itm_cd(value);
			return;
		}
		if ($itm_alt_nm1.equalsIgnoreCase(name)) {
			itm_alt_nm1(value);
			return;
		}
		if ($itm_alt_nm2.equalsIgnoreCase(name)) {
			itm_alt_nm2(value);
			return;
		}
		if ($itm_alt_nm3.equalsIgnoreCase(name)) {
			itm_alt_nm3(value);
			return;
		}
		if ($itm_alt_nm4.equalsIgnoreCase(name)) {
			itm_alt_nm4(value);
			return;
		}
		if ($itm_sub1_view.equalsIgnoreCase(name)) {
			itm_sub1_view(value);
			return;
		}
		if ($itm_sub1_data.equalsIgnoreCase(name)) {
			itm_sub1_data(value);
			return;
		}
		if ($itm_sub2_view.equalsIgnoreCase(name)) {
			itm_sub2_view(value);
			return;
		}
		if ($itm_sub2_data.equalsIgnoreCase(name)) {
			itm_sub2_data(value);
			return;
		}
		if ($itm_sub3_view.equalsIgnoreCase(name)) {
			itm_sub3_view(value);
			return;
		}
		if ($itm_sub3_data.equalsIgnoreCase(name)) {
			itm_sub3_data(value);
			return;
		}
		if ($itm_nm.equalsIgnoreCase(name)) {
			itm_nm(value);
			return;
		}
		if ($sppl_itm_cd.equalsIgnoreCase(name)) {
			sppl_itm_cd(value);
			return;
		}
		if ($sppl_itm_nm.equalsIgnoreCase(name)) {
			sppl_itm_nm(value);
			return;
		}
		if ($unit_cd.equalsIgnoreCase(name)) {
			unit_cd(value);
			return;
		}
		if ($unit_nm.equalsIgnoreCase(name)) {
			unit_nm(value);
			return;
		}
		if ($pf_rpt_d_rmrks.equalsIgnoreCase(name)) {
			pf_rpt_d_rmrks(value);
			return;
		}
		if ($pf_period_typ.equalsIgnoreCase(name)) {
			pf_period_typ(value);
			return;
		}
		if ($pf_period_typ_nm.equalsIgnoreCase(name)) {
			pf_period_typ_nm(value);
			return;
		}
		if ($s_pre_qty.equalsIgnoreCase(name)) {
			s_pre_qty(value);
			return;
		}
		if ($s_int_pre_qty.equalsIgnoreCase(name)) {
			s_int_pre_qty(value);
			return;
		}
		if ($s_dec_pre_qty.equalsIgnoreCase(name)) {
			s_dec_pre_qty(value);
			return;
		}
		if ($s_qty.equalsIgnoreCase(name)) {
			s_qty(value);
			return;
		}
		if ($s_int_qty.equalsIgnoreCase(name)) {
			s_int_qty(value);
			return;
		}
		if ($s_dec_qty.equalsIgnoreCase(name)) {
			s_dec_qty(value);
			return;
		}
		if ($s_po_qty.equalsIgnoreCase(name)) {
			s_po_qty(value);
			return;
		}
		if ($s_int_po_qty.equalsIgnoreCase(name)) {
			s_int_po_qty(value);
			return;
		}
		if ($s_dec_po_qty.equalsIgnoreCase(name)) {
			s_dec_po_qty(value);
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
		if ($pre_qty.equalsIgnoreCase(name)) {
			pre_qty(value);
			return;
		}
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($po_qty.equalsIgnoreCase(name)) {
			po_qty(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($pre_qty.equalsIgnoreCase(name)) {
			pre_qty(value);
			return;
		}
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($po_qty.equalsIgnoreCase(name)) {
			po_qty(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($pre_qty.equalsIgnoreCase(name)) {
			pre_qty(value);
			return;
		}
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($po_qty.equalsIgnoreCase(name)) {
			po_qty(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($pre_qty.equalsIgnoreCase(name)) {
			pre_qty(value);
			return;
		}
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($po_qty.equalsIgnoreCase(name)) {
			po_qty(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($pre_qty.equalsIgnoreCase(name)) {
			pre_qty(value);
			return;
		}
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($po_qty.equalsIgnoreCase(name)) {
			po_qty(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($pf_period_st_dt.equalsIgnoreCase(name)) {
			pf_period_st_dt(value);
			return;
		}
		if ($pf_period_end_dt.equalsIgnoreCase(name)) {
			pf_period_end_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($pre_ym_flg.equalsIgnoreCase(name)) {
			pre_ym_flg(value);
			return;
		}
		if ($ym_flg.equalsIgnoreCase(name)) {
			ym_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

