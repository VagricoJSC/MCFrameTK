package mcframe.commonMSBE.MSBER0130;

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
 * ブロック"XfrInstDtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class XfrInstDtlR_MC_A extends MCConstRow {

	/**
	 *  品目.<p>
	 *
	 */
	public static final String $itm_cd = "itm_cd";
	/**
	 *  枝番１(表示用).<p>
	 *
	 */
	public static final String $itm_sub1_view = "itm_sub1_view";
	/**
	 *  枝番１(データ).<p>
	 *
	 */
	public static final String $itm_sub1_data = "itm_sub1_data";
	/**
	 *  枝番２(表示用).<p>
	 *
	 */
	public static final String $itm_sub2_view = "itm_sub2_view";
	/**
	 *  枝番２(データ).<p>
	 *
	 */
	public static final String $itm_sub2_data = "itm_sub2_data";
	/**
	 *  枝番３(表示用).<p>
	 *
	 */
	public static final String $itm_sub3_view = "itm_sub3_view";
	/**
	 *  枝番３(データ).<p>
	 *
	 */
	public static final String $itm_sub3_data = "itm_sub3_data";
	/**
	 *  品名.<p>
	 *
	 */
	public static final String $itm_nm = "itm_nm";
	/**
	 *  品目別名１.<p>
	 *
	 */
	public static final String $itm_alt_nm1 = "itm_alt_nm1";
	/**
	 *  品目別名２.<p>
	 *
	 */
	public static final String $itm_alt_nm2 = "itm_alt_nm2";
	/**
	 *  品目別名３.<p>
	 *
	 */
	public static final String $itm_alt_nm3 = "itm_alt_nm3";
	/**
	 *  品目別名４.<p>
	 *
	 */
	public static final String $itm_alt_nm4 = "itm_alt_nm4";
	/**
	 *  出庫場所名.<p>
	 *
	 */
	public static final String $gi_loc_nm = "gi_loc_nm";
	/**
	 *  出庫棚・ライン名.<p>
	 *
	 */
	public static final String $gi_str_ln_nm = "gi_str_ln_nm";
	/**
	 *  入庫棚・ライン名.<p>
	 *
	 */
	public static final String $gr_str_ln_nm = "gr_str_ln_nm";
	/**
	 *  ロットＮＯ（表示用）.<p>
	 *
	 */
	public static final String $lot_no_view = "lot_no_view";
	/**
	 *  ロットＮＯ（データ）.<p>
	 *
	 */
	public static final String $lot_no_data = "lot_no_data";
	/**
	 *  サブロットＮＯ（表示用）.<p>
	 *
	 */
	public static final String $sublot_no_view = "sublot_no_view";
	/**
	 *  サブロットＮＯ（データ）.<p>
	 *
	 */
	public static final String $sublot_no_data = "sublot_no_data";
	/**
	 *  版ＮＯ（ラベル）.<p>
	 *
	 */
	public static final String $ver_no_lbl = "ver_no_lbl";
	/**
	 *  手配ＮＯ１（ラベル）.<p>
	 *
	 */
	public static final String $sno1_lbl = "sno1_lbl";
	/**
	 *  手配ＮＯ２（ラベル）.<p>
	 *
	 */
	public static final String $sno2_lbl = "sno2_lbl";
	/**
	 *  手配ＮＯ３（ラベル）.<p>
	 *
	 */
	public static final String $sno3_lbl = "sno3_lbl";
	/**
	 *  手配ＮＯ４（ラベル）.<p>
	 *
	 */
	public static final String $sno4_lbl = "sno4_lbl";
	/**
	 *  版ＮＯ.<p>
	 *
	 */
	public static final String $ver_no = "ver_no";
	/**
	 *  手配ＮＯ１.<p>
	 *
	 */
	public static final String $sno1_view = "sno1_view";
	/**
	 *  手配ＮＯ１（データ）.<p>
	 *
	 */
	public static final String $sno1_data = "sno1_data";
	/**
	 *  手配ＮＯ２.<p>
	 *
	 */
	public static final String $sno2_view = "sno2_view";
	/**
	 *  手配ＮＯ２（データ）.<p>
	 *
	 */
	public static final String $sno2_data = "sno2_data";
	/**
	 *  手配ＮＯ３.<p>
	 *
	 */
	public static final String $sno3_view = "sno3_view";
	/**
	 *  手配ＮＯ３（データ）.<p>
	 *
	 */
	public static final String $sno3_data = "sno3_data";
	/**
	 *  手配ＮＯ４.<p>
	 *
	 */
	public static final String $sno4_view = "sno4_view";
	/**
	 *  手配ＮＯ４（データ）.<p>
	 *
	 */
	public static final String $sno4_data = "sno4_data";
	/**
	 *  良品（データ）.<p>
	 *
	 */
	public static final String $quality_typ = "quality_typ";
	/**
	 *  良品.<p>
	 *
	 */
	public static final String $quality_typ_nm = "quality_typ_nm";
	/**
	 *  格付ＣＤ（データ）.<p>
	 *
	 */
	public static final String $gd_cd = "gd_cd";
	/**
	 *  格付名.<p>
	 *
	 */
	public static final String $gd_nm = "gd_nm";
	/**
	 *  在庫検査（ラベル）.<p>
	 *
	 */
	public static final String $stk_insp_typ_lbl = "stk_insp_typ_lbl";
	/**
	 *  在庫検査（データ）.<p>
	 *
	 */
	public static final String $stk_insp_typ = "stk_insp_typ";
	/**
	 *  在庫検査.<p>
	 *
	 */
	public static final String $stk_insp_typ_nm = "stk_insp_typ_nm";
	/**
	 *  在庫識別（データ）.<p>
	 *
	 */
	public static final String $stk_id_typ = "stk_id_typ";
	/**
	 *  在庫識別.<p>
	 *
	 */
	public static final String $stk_id_typ_nm = "stk_id_typ_nm";
	/**
	 *  取引先ＣＤ（データ）.<p>
	 *
	 */
	public static final String $stk_bp_cd = "stk_bp_cd";
	/**
	 *  取引先名.<p>
	 *
	 */
	public static final String $stk_bp_nm = "stk_bp_nm";
	/**
	 *  在庫取引先別名１.<p>
	 *
	 */
	public static final String $stk_bp_alt_nm1 = "stk_bp_alt_nm1";
	/**
	 *  在庫取引先別名２.<p>
	 *
	 */
	public static final String $stk_bp_alt_nm2 = "stk_bp_alt_nm2";
	/**
	 *  在庫取引先別名３.<p>
	 *
	 */
	public static final String $stk_bp_alt_nm3 = "stk_bp_alt_nm3";
	/**
	 *  在庫取引先別名４.<p>
	 *
	 */
	public static final String $stk_bp_alt_nm4 = "stk_bp_alt_nm4";
	/**
	 *  数量（データ）.<p>
	 *
	 */
	public static final String $trd_unit_qty = "trd_unit_qty";
	/**
	 *  数量（文字列）.<p>
	 *
	 */
	public static final String $s_trd_unit_qty = "s_trd_unit_qty";
	/**
	 *  数量（整数部）.<p>
	 *
	 */
	public static final String $s_int_trd_unit_qty = "s_int_trd_unit_qty";
	/**
	 *  数量（小数部）.<p>
	 *
	 */
	public static final String $s_dec_trd_unit_qty = "s_dec_trd_unit_qty";
	/**
	 *  単位ＣＤ（データ）.<p>
	 *
	 */
	public static final String $trd_unit_cd = "trd_unit_cd";
	/**
	 *  単位名.<p>
	 *
	 */
	public static final String $trd_unit_nm = "trd_unit_nm";
	/**
	 *  （明細）備考.<p>
	 *
	 */
	public static final String $inst_d_rmrks = "inst_d_rmrks";
	/**
	 *  表示順.<p>
	 *
	 */
	public static final String $disp_seq = "disp_seq";
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


	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_view_META = createCommonMeta($itm_sub1_view, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub1_data_META = createCommonMeta($itm_sub1_data, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_view_META = createCommonMeta($itm_sub2_view, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub2_data_META = createCommonMeta($itm_sub2_data, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_view_META = createCommonMeta($itm_sub3_view, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta itm_sub3_data_META = createCommonMeta($itm_sub3_data, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta itm_nm_META = createCommonMeta($itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta itm_alt_nm1_META = createCommonMeta($itm_alt_nm1, mcframe.commonMA.meta.MA_META.ITM_ALT_NM1);
	public static final MCMeta itm_alt_nm2_META = createCommonMeta($itm_alt_nm2, mcframe.commonMA.meta.MA_META.ITM_ALT_NM2);
	public static final MCMeta itm_alt_nm3_META = createCommonMeta($itm_alt_nm3, mcframe.commonMA.meta.MA_META.ITM_ALT_NM3);
	public static final MCMeta itm_alt_nm4_META = createCommonMeta($itm_alt_nm4, mcframe.commonMA.meta.MA_META.ITM_ALT_NM4);
	public static final MCMeta gi_loc_nm_META = createCommonMeta($gi_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta gi_str_ln_nm_META = createCommonMeta($gi_str_ln_nm, mcframe.commonMA.meta.MA_META.STR_LN_NM);
	public static final MCMeta gr_str_ln_nm_META = createCommonMeta($gr_str_ln_nm, mcframe.commonMA.meta.MA_META.STR_LN_NM);
	public static final MCMeta lot_no_view_META = createCommonMeta($lot_no_view, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta lot_no_data_META = createCommonMeta($lot_no_data, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta sublot_no_view_META = createCommonMeta($sublot_no_view, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta sublot_no_data_META = createCommonMeta($sublot_no_data, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta ver_no_lbl_META = createStringMeta($ver_no_lbl);
	public static final MCMeta sno1_lbl_META = createStringMeta($sno1_lbl);
	public static final MCMeta sno2_lbl_META = createStringMeta($sno2_lbl);
	public static final MCMeta sno3_lbl_META = createStringMeta($sno3_lbl);
	public static final MCMeta sno4_lbl_META = createStringMeta($sno4_lbl);
	public static final MCMeta ver_no_META = createCommonMeta($ver_no, mcframe.commonMA.meta.MA_META.VER_NO);
	public static final MCMeta sno1_view_META = createCommonMeta($sno1_view, mcframe.commonMA.meta.MA_META.SNO1);
	public static final MCMeta sno1_data_META = createCommonMeta($sno1_data, mcframe.commonMA.meta.MA_META.SNO1);
	public static final MCMeta sno2_view_META = createCommonMeta($sno2_view, mcframe.commonMA.meta.MA_META.SNO2);
	public static final MCMeta sno2_data_META = createCommonMeta($sno2_data, mcframe.commonMA.meta.MA_META.SNO2);
	public static final MCMeta sno3_view_META = createCommonMeta($sno3_view, mcframe.commonMA.meta.MA_META.SNO3);
	public static final MCMeta sno3_data_META = createCommonMeta($sno3_data, mcframe.commonMA.meta.MA_META.SNO3);
	public static final MCMeta sno4_view_META = createCommonMeta($sno4_view, mcframe.commonMA.meta.MA_META.SNO4);
	public static final MCMeta sno4_data_META = createCommonMeta($sno4_data, mcframe.commonMA.meta.MA_META.SNO4);
	public static final MCMeta quality_typ_META = createCommonMeta($quality_typ, mcframe.commonMA.meta.MA_META.QUALITY_TYP);
	public static final MCMeta quality_typ_nm_META = createCommonMeta($quality_typ_nm, mcframe.commonMA.meta.MA_META.QUALITY_TYP_NM);
	public static final MCMeta gd_cd_META = createCommonMeta($gd_cd, mcframe.commonMA.meta.MA_META.STK_GD_CD);
	public static final MCMeta gd_nm_META = createCommonMeta($gd_nm, mcframe.commonMA.meta.MA_META.STK_GD_NM);
	public static final MCMeta stk_insp_typ_lbl_META = createStringMeta($stk_insp_typ_lbl);
	public static final MCMeta stk_insp_typ_META = createCommonMeta($stk_insp_typ, mcframe.commonMS.meta.MS_META.STK_INSP_TYP);
	public static final MCMeta stk_insp_typ_nm_META = createCommonMeta($stk_insp_typ_nm, mcframe.commonMS.meta.MS_META.STK_INSP_TYP_NM);
	public static final MCMeta stk_id_typ_META = createCommonMeta($stk_id_typ, mcframe.commonMS.meta.MS_META.STK_ID_TYP);
	public static final MCMeta stk_id_typ_nm_META = createCommonMeta($stk_id_typ_nm, mcframe.commonMS.meta.MS_META.STK_ID_TYP_NM);
	public static final MCMeta stk_bp_cd_META = createCommonMeta($stk_bp_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta stk_bp_nm_META = createCommonMeta($stk_bp_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta stk_bp_alt_nm1_META = createCommonMeta($stk_bp_alt_nm1, mcframe.commonMA.meta.MA_META.BP_ALT_NM1);
	public static final MCMeta stk_bp_alt_nm2_META = createCommonMeta($stk_bp_alt_nm2, mcframe.commonMA.meta.MA_META.BP_ALT_NM2);
	public static final MCMeta stk_bp_alt_nm3_META = createCommonMeta($stk_bp_alt_nm3, mcframe.commonMA.meta.MA_META.BP_ALT_NM3);
	public static final MCMeta stk_bp_alt_nm4_META = createCommonMeta($stk_bp_alt_nm4, mcframe.commonMA.meta.MA_META.BP_ALT_NM4);
	public static final MCMeta trd_unit_qty_META = createCommonMeta($trd_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta s_trd_unit_qty_META = createStringMeta($s_trd_unit_qty);
	public static final MCMeta s_int_trd_unit_qty_META = createStringMeta($s_int_trd_unit_qty);
	public static final MCMeta s_dec_trd_unit_qty_META = createStringMeta($s_dec_trd_unit_qty);
	public static final MCMeta trd_unit_cd_META = createCommonMeta($trd_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta trd_unit_nm_META = createCommonMeta($trd_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta inst_d_rmrks_META = createCommonMeta($inst_d_rmrks, mcframe.commonMS.meta.MS_META.XFR_INST_D_RMRKS);
	public static final MCMeta disp_seq_META = createCommonMeta($disp_seq, mcframe.commonMA.meta.MA_META.DISP_SEQ);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.XFR_INST_D_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.XFR_INST_D_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.XFR_INST_D_SUB_CHAR3);

	protected static final ConstMetaList<XfrInstDtlR> constMetas = new ConstMetaList<XfrInstDtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			itm_cd_META,
			itm_sub1_view_META,
			itm_sub1_data_META,
			itm_sub2_view_META,
			itm_sub2_data_META,
			itm_sub3_view_META,
			itm_sub3_data_META,
			itm_nm_META,
			itm_alt_nm1_META,
			itm_alt_nm2_META,
			itm_alt_nm3_META,
			itm_alt_nm4_META,
			gi_loc_nm_META,
			gi_str_ln_nm_META,
			gr_str_ln_nm_META,
			lot_no_view_META,
			lot_no_data_META,
			sublot_no_view_META,
			sublot_no_data_META,
			ver_no_lbl_META,
			sno1_lbl_META,
			sno2_lbl_META,
			sno3_lbl_META,
			sno4_lbl_META,
			ver_no_META,
			sno1_view_META,
			sno1_data_META,
			sno2_view_META,
			sno2_data_META,
			sno3_view_META,
			sno3_data_META,
			sno4_view_META,
			sno4_data_META,
			quality_typ_META,
			quality_typ_nm_META,
			gd_cd_META,
			gd_nm_META,
			stk_insp_typ_lbl_META,
			stk_insp_typ_META,
			stk_insp_typ_nm_META,
			stk_id_typ_META,
			stk_id_typ_nm_META,
			stk_bp_cd_META,
			stk_bp_nm_META,
			stk_bp_alt_nm1_META,
			stk_bp_alt_nm2_META,
			stk_bp_alt_nm3_META,
			stk_bp_alt_nm4_META,
			trd_unit_qty_META,
			s_trd_unit_qty_META,
			s_int_trd_unit_qty_META,
			s_dec_trd_unit_qty_META,
			trd_unit_cd_META,
			trd_unit_nm_META,
			inst_d_rmrks_META,
			disp_seq_META,
			sub_char1_META,
			sub_char2_META,
			sub_char3_META
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
	protected XfrInstDtlR_MC_A(ConstMetaList<? extends XfrInstDtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public XfrInstDtlR clone() {
		return (XfrInstDtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public XfrInstDtlR createInstance() {
		return (XfrInstDtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public XfrInstDtlR getValues(String... names) {
		return (XfrInstDtlR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 *  品目.<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 0, $itm_cd);
	}

	/**
	 *  品目.<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 0, $itm_cd, value);
	}


	/**
	 *  枝番１(表示用).<p>
	 *
	 */
	public String itm_sub1_view() {
		return getConstString(offset + 1, $itm_sub1_view);
	}

	/**
	 *  枝番１(表示用).<p>
	 *
	 */
	public void itm_sub1_view(String value) {
		setConstString(offset + 1, $itm_sub1_view, value);
	}


	/**
	 *  枝番１(データ).<p>
	 *
	 */
	public String itm_sub1_data() {
		return getConstString(offset + 2, $itm_sub1_data);
	}

	/**
	 *  枝番１(データ).<p>
	 *
	 */
	public void itm_sub1_data(String value) {
		setConstString(offset + 2, $itm_sub1_data, value);
	}


	/**
	 *  枝番２(表示用).<p>
	 *
	 */
	public String itm_sub2_view() {
		return getConstString(offset + 3, $itm_sub2_view);
	}

	/**
	 *  枝番２(表示用).<p>
	 *
	 */
	public void itm_sub2_view(String value) {
		setConstString(offset + 3, $itm_sub2_view, value);
	}


	/**
	 *  枝番２(データ).<p>
	 *
	 */
	public String itm_sub2_data() {
		return getConstString(offset + 4, $itm_sub2_data);
	}

	/**
	 *  枝番２(データ).<p>
	 *
	 */
	public void itm_sub2_data(String value) {
		setConstString(offset + 4, $itm_sub2_data, value);
	}


	/**
	 *  枝番３(表示用).<p>
	 *
	 */
	public String itm_sub3_view() {
		return getConstString(offset + 5, $itm_sub3_view);
	}

	/**
	 *  枝番３(表示用).<p>
	 *
	 */
	public void itm_sub3_view(String value) {
		setConstString(offset + 5, $itm_sub3_view, value);
	}


	/**
	 *  枝番３(データ).<p>
	 *
	 */
	public String itm_sub3_data() {
		return getConstString(offset + 6, $itm_sub3_data);
	}

	/**
	 *  枝番３(データ).<p>
	 *
	 */
	public void itm_sub3_data(String value) {
		setConstString(offset + 6, $itm_sub3_data, value);
	}


	/**
	 *  品名.<p>
	 *
	 */
	public String itm_nm() {
		return getConstString(offset + 7, $itm_nm);
	}

	/**
	 *  品名.<p>
	 *
	 */
	public void itm_nm(String value) {
		setConstString(offset + 7, $itm_nm, value);
	}


	/**
	 *  品目別名１.<p>
	 *
	 */
	public String itm_alt_nm1() {
		return getConstString(offset + 8, $itm_alt_nm1);
	}

	/**
	 *  品目別名１.<p>
	 *
	 */
	public void itm_alt_nm1(String value) {
		setConstString(offset + 8, $itm_alt_nm1, value);
	}


	/**
	 *  品目別名２.<p>
	 *
	 */
	public String itm_alt_nm2() {
		return getConstString(offset + 9, $itm_alt_nm2);
	}

	/**
	 *  品目別名２.<p>
	 *
	 */
	public void itm_alt_nm2(String value) {
		setConstString(offset + 9, $itm_alt_nm2, value);
	}


	/**
	 *  品目別名３.<p>
	 *
	 */
	public String itm_alt_nm3() {
		return getConstString(offset + 10, $itm_alt_nm3);
	}

	/**
	 *  品目別名３.<p>
	 *
	 */
	public void itm_alt_nm3(String value) {
		setConstString(offset + 10, $itm_alt_nm3, value);
	}


	/**
	 *  品目別名４.<p>
	 *
	 */
	public String itm_alt_nm4() {
		return getConstString(offset + 11, $itm_alt_nm4);
	}

	/**
	 *  品目別名４.<p>
	 *
	 */
	public void itm_alt_nm4(String value) {
		setConstString(offset + 11, $itm_alt_nm4, value);
	}


	/**
	 *  出庫場所名.<p>
	 *
	 */
	public String gi_loc_nm() {
		return getConstString(offset + 12, $gi_loc_nm);
	}

	/**
	 *  出庫場所名.<p>
	 *
	 */
	public void gi_loc_nm(String value) {
		setConstString(offset + 12, $gi_loc_nm, value);
	}


	/**
	 *  出庫棚・ライン名.<p>
	 *
	 */
	public String gi_str_ln_nm() {
		return getConstString(offset + 13, $gi_str_ln_nm);
	}

	/**
	 *  出庫棚・ライン名.<p>
	 *
	 */
	public void gi_str_ln_nm(String value) {
		setConstString(offset + 13, $gi_str_ln_nm, value);
	}


	/**
	 *  入庫棚・ライン名.<p>
	 *
	 */
	public String gr_str_ln_nm() {
		return getConstString(offset + 14, $gr_str_ln_nm);
	}

	/**
	 *  入庫棚・ライン名.<p>
	 *
	 */
	public void gr_str_ln_nm(String value) {
		setConstString(offset + 14, $gr_str_ln_nm, value);
	}


	/**
	 *  ロットＮＯ（表示用）.<p>
	 *
	 */
	public String lot_no_view() {
		return getConstString(offset + 15, $lot_no_view);
	}

	/**
	 *  ロットＮＯ（表示用）.<p>
	 *
	 */
	public void lot_no_view(String value) {
		setConstString(offset + 15, $lot_no_view, value);
	}


	/**
	 *  ロットＮＯ（データ）.<p>
	 *
	 */
	public String lot_no_data() {
		return getConstString(offset + 16, $lot_no_data);
	}

	/**
	 *  ロットＮＯ（データ）.<p>
	 *
	 */
	public void lot_no_data(String value) {
		setConstString(offset + 16, $lot_no_data, value);
	}


	/**
	 *  サブロットＮＯ（表示用）.<p>
	 *
	 */
	public String sublot_no_view() {
		return getConstString(offset + 17, $sublot_no_view);
	}

	/**
	 *  サブロットＮＯ（表示用）.<p>
	 *
	 */
	public void sublot_no_view(String value) {
		setConstString(offset + 17, $sublot_no_view, value);
	}


	/**
	 *  サブロットＮＯ（データ）.<p>
	 *
	 */
	public String sublot_no_data() {
		return getConstString(offset + 18, $sublot_no_data);
	}

	/**
	 *  サブロットＮＯ（データ）.<p>
	 *
	 */
	public void sublot_no_data(String value) {
		setConstString(offset + 18, $sublot_no_data, value);
	}


	/**
	 *  版ＮＯ（ラベル）.<p>
	 *
	 */
	public String ver_no_lbl() {
		return getConstString(offset + 19, $ver_no_lbl);
	}

	/**
	 *  版ＮＯ（ラベル）.<p>
	 *
	 */
	public void ver_no_lbl(String value) {
		setConstString(offset + 19, $ver_no_lbl, value);
	}


	/**
	 *  手配ＮＯ１（ラベル）.<p>
	 *
	 */
	public String sno1_lbl() {
		return getConstString(offset + 20, $sno1_lbl);
	}

	/**
	 *  手配ＮＯ１（ラベル）.<p>
	 *
	 */
	public void sno1_lbl(String value) {
		setConstString(offset + 20, $sno1_lbl, value);
	}


	/**
	 *  手配ＮＯ２（ラベル）.<p>
	 *
	 */
	public String sno2_lbl() {
		return getConstString(offset + 21, $sno2_lbl);
	}

	/**
	 *  手配ＮＯ２（ラベル）.<p>
	 *
	 */
	public void sno2_lbl(String value) {
		setConstString(offset + 21, $sno2_lbl, value);
	}


	/**
	 *  手配ＮＯ３（ラベル）.<p>
	 *
	 */
	public String sno3_lbl() {
		return getConstString(offset + 22, $sno3_lbl);
	}

	/**
	 *  手配ＮＯ３（ラベル）.<p>
	 *
	 */
	public void sno3_lbl(String value) {
		setConstString(offset + 22, $sno3_lbl, value);
	}


	/**
	 *  手配ＮＯ４（ラベル）.<p>
	 *
	 */
	public String sno4_lbl() {
		return getConstString(offset + 23, $sno4_lbl);
	}

	/**
	 *  手配ＮＯ４（ラベル）.<p>
	 *
	 */
	public void sno4_lbl(String value) {
		setConstString(offset + 23, $sno4_lbl, value);
	}


	/**
	 *  版ＮＯ.<p>
	 *
	 */
	public String ver_no() {
		return getConstString(offset + 24, $ver_no);
	}

	/**
	 *  版ＮＯ.<p>
	 *
	 */
	public void ver_no(String value) {
		setConstString(offset + 24, $ver_no, value);
	}


	/**
	 *  手配ＮＯ１.<p>
	 *
	 */
	public String sno1_view() {
		return getConstString(offset + 25, $sno1_view);
	}

	/**
	 *  手配ＮＯ１.<p>
	 *
	 */
	public void sno1_view(String value) {
		setConstString(offset + 25, $sno1_view, value);
	}


	/**
	 *  手配ＮＯ１（データ）.<p>
	 *
	 */
	public String sno1_data() {
		return getConstString(offset + 26, $sno1_data);
	}

	/**
	 *  手配ＮＯ１（データ）.<p>
	 *
	 */
	public void sno1_data(String value) {
		setConstString(offset + 26, $sno1_data, value);
	}


	/**
	 *  手配ＮＯ２.<p>
	 *
	 */
	public String sno2_view() {
		return getConstString(offset + 27, $sno2_view);
	}

	/**
	 *  手配ＮＯ２.<p>
	 *
	 */
	public void sno2_view(String value) {
		setConstString(offset + 27, $sno2_view, value);
	}


	/**
	 *  手配ＮＯ２（データ）.<p>
	 *
	 */
	public String sno2_data() {
		return getConstString(offset + 28, $sno2_data);
	}

	/**
	 *  手配ＮＯ２（データ）.<p>
	 *
	 */
	public void sno2_data(String value) {
		setConstString(offset + 28, $sno2_data, value);
	}


	/**
	 *  手配ＮＯ３.<p>
	 *
	 */
	public String sno3_view() {
		return getConstString(offset + 29, $sno3_view);
	}

	/**
	 *  手配ＮＯ３.<p>
	 *
	 */
	public void sno3_view(String value) {
		setConstString(offset + 29, $sno3_view, value);
	}


	/**
	 *  手配ＮＯ３（データ）.<p>
	 *
	 */
	public String sno3_data() {
		return getConstString(offset + 30, $sno3_data);
	}

	/**
	 *  手配ＮＯ３（データ）.<p>
	 *
	 */
	public void sno3_data(String value) {
		setConstString(offset + 30, $sno3_data, value);
	}


	/**
	 *  手配ＮＯ４.<p>
	 *
	 */
	public String sno4_view() {
		return getConstString(offset + 31, $sno4_view);
	}

	/**
	 *  手配ＮＯ４.<p>
	 *
	 */
	public void sno4_view(String value) {
		setConstString(offset + 31, $sno4_view, value);
	}


	/**
	 *  手配ＮＯ４（データ）.<p>
	 *
	 */
	public String sno4_data() {
		return getConstString(offset + 32, $sno4_data);
	}

	/**
	 *  手配ＮＯ４（データ）.<p>
	 *
	 */
	public void sno4_data(String value) {
		setConstString(offset + 32, $sno4_data, value);
	}


	/**
	 *  良品（データ）.<p>
	 *
	 */
	public String quality_typ() {
		return getConstString(offset + 33, $quality_typ);
	}

	/**
	 *  良品（データ）.<p>
	 *
	 */
	public void quality_typ(String value) {
		setConstString(offset + 33, $quality_typ, value);
	}


	/**
	 *  良品.<p>
	 *
	 */
	public String quality_typ_nm() {
		return getConstString(offset + 34, $quality_typ_nm);
	}

	/**
	 *  良品.<p>
	 *
	 */
	public void quality_typ_nm(String value) {
		setConstString(offset + 34, $quality_typ_nm, value);
	}


	/**
	 *  格付ＣＤ（データ）.<p>
	 *
	 */
	public String gd_cd() {
		return getConstString(offset + 35, $gd_cd);
	}

	/**
	 *  格付ＣＤ（データ）.<p>
	 *
	 */
	public void gd_cd(String value) {
		setConstString(offset + 35, $gd_cd, value);
	}


	/**
	 *  格付名.<p>
	 *
	 */
	public String gd_nm() {
		return getConstString(offset + 36, $gd_nm);
	}

	/**
	 *  格付名.<p>
	 *
	 */
	public void gd_nm(String value) {
		setConstString(offset + 36, $gd_nm, value);
	}


	/**
	 *  在庫検査（ラベル）.<p>
	 *
	 */
	public String stk_insp_typ_lbl() {
		return getConstString(offset + 37, $stk_insp_typ_lbl);
	}

	/**
	 *  在庫検査（ラベル）.<p>
	 *
	 */
	public void stk_insp_typ_lbl(String value) {
		setConstString(offset + 37, $stk_insp_typ_lbl, value);
	}


	/**
	 *  在庫検査（データ）.<p>
	 *
	 */
	public String stk_insp_typ() {
		return getConstString(offset + 38, $stk_insp_typ);
	}

	/**
	 *  在庫検査（データ）.<p>
	 *
	 */
	public void stk_insp_typ(String value) {
		setConstString(offset + 38, $stk_insp_typ, value);
	}


	/**
	 *  在庫検査.<p>
	 *
	 */
	public String stk_insp_typ_nm() {
		return getConstString(offset + 39, $stk_insp_typ_nm);
	}

	/**
	 *  在庫検査.<p>
	 *
	 */
	public void stk_insp_typ_nm(String value) {
		setConstString(offset + 39, $stk_insp_typ_nm, value);
	}


	/**
	 *  在庫識別（データ）.<p>
	 *
	 */
	public String stk_id_typ() {
		return getConstString(offset + 40, $stk_id_typ);
	}

	/**
	 *  在庫識別（データ）.<p>
	 *
	 */
	public void stk_id_typ(String value) {
		setConstString(offset + 40, $stk_id_typ, value);
	}


	/**
	 *  在庫識別.<p>
	 *
	 */
	public String stk_id_typ_nm() {
		return getConstString(offset + 41, $stk_id_typ_nm);
	}

	/**
	 *  在庫識別.<p>
	 *
	 */
	public void stk_id_typ_nm(String value) {
		setConstString(offset + 41, $stk_id_typ_nm, value);
	}


	/**
	 *  取引先ＣＤ（データ）.<p>
	 *
	 */
	public String stk_bp_cd() {
		return getConstString(offset + 42, $stk_bp_cd);
	}

	/**
	 *  取引先ＣＤ（データ）.<p>
	 *
	 */
	public void stk_bp_cd(String value) {
		setConstString(offset + 42, $stk_bp_cd, value);
	}


	/**
	 *  取引先名.<p>
	 *
	 */
	public String stk_bp_nm() {
		return getConstString(offset + 43, $stk_bp_nm);
	}

	/**
	 *  取引先名.<p>
	 *
	 */
	public void stk_bp_nm(String value) {
		setConstString(offset + 43, $stk_bp_nm, value);
	}


	/**
	 *  在庫取引先別名１.<p>
	 *
	 */
	public String stk_bp_alt_nm1() {
		return getConstString(offset + 44, $stk_bp_alt_nm1);
	}

	/**
	 *  在庫取引先別名１.<p>
	 *
	 */
	public void stk_bp_alt_nm1(String value) {
		setConstString(offset + 44, $stk_bp_alt_nm1, value);
	}


	/**
	 *  在庫取引先別名２.<p>
	 *
	 */
	public String stk_bp_alt_nm2() {
		return getConstString(offset + 45, $stk_bp_alt_nm2);
	}

	/**
	 *  在庫取引先別名２.<p>
	 *
	 */
	public void stk_bp_alt_nm2(String value) {
		setConstString(offset + 45, $stk_bp_alt_nm2, value);
	}


	/**
	 *  在庫取引先別名３.<p>
	 *
	 */
	public String stk_bp_alt_nm3() {
		return getConstString(offset + 46, $stk_bp_alt_nm3);
	}

	/**
	 *  在庫取引先別名３.<p>
	 *
	 */
	public void stk_bp_alt_nm3(String value) {
		setConstString(offset + 46, $stk_bp_alt_nm3, value);
	}


	/**
	 *  在庫取引先別名４.<p>
	 *
	 */
	public String stk_bp_alt_nm4() {
		return getConstString(offset + 47, $stk_bp_alt_nm4);
	}

	/**
	 *  在庫取引先別名４.<p>
	 *
	 */
	public void stk_bp_alt_nm4(String value) {
		setConstString(offset + 47, $stk_bp_alt_nm4, value);
	}


	/**
	 *  数量（データ）.<p>
	 *
	 */
	public MCNumber trd_unit_qty() {
		return getConstNumber(offset + 48, $trd_unit_qty);
	}

	/**
	 *  数量（データ）.<p>
	 *
	 */
	public void trd_unit_qty(MCNumber value) {
		setConstNumber(offset + 48, $trd_unit_qty, value);
	}

	/**
	 *  数量（データ）.<p>
	 *
	 */
	public void trd_unit_qty(int value) {
		setConstNumber(offset + 48, $trd_unit_qty, value);
	}

	/**
	 *  数量（データ）.<p>
	 *
	 */
	public void trd_unit_qty(long value) {
		setConstNumber(offset + 48, $trd_unit_qty, value);
	}

	/**
	 *  数量（データ）.<p>
	 *
	 */
	public void trd_unit_qty(float value) {
		setConstNumber(offset + 48, $trd_unit_qty, value);
	}

	/**
	 *  数量（データ）.<p>
	 *
	 */
	public void trd_unit_qty(double value) {
		setConstNumber(offset + 48, $trd_unit_qty, value);
	}


	/**
	 *  数量（文字列）.<p>
	 *
	 */
	public String s_trd_unit_qty() {
		return getConstString(offset + 49, $s_trd_unit_qty);
	}

	/**
	 *  数量（文字列）.<p>
	 *
	 */
	public void s_trd_unit_qty(String value) {
		setConstString(offset + 49, $s_trd_unit_qty, value);
	}


	/**
	 *  数量（整数部）.<p>
	 *
	 */
	public String s_int_trd_unit_qty() {
		return getConstString(offset + 50, $s_int_trd_unit_qty);
	}

	/**
	 *  数量（整数部）.<p>
	 *
	 */
	public void s_int_trd_unit_qty(String value) {
		setConstString(offset + 50, $s_int_trd_unit_qty, value);
	}


	/**
	 *  数量（小数部）.<p>
	 *
	 */
	public String s_dec_trd_unit_qty() {
		return getConstString(offset + 51, $s_dec_trd_unit_qty);
	}

	/**
	 *  数量（小数部）.<p>
	 *
	 */
	public void s_dec_trd_unit_qty(String value) {
		setConstString(offset + 51, $s_dec_trd_unit_qty, value);
	}


	/**
	 *  単位ＣＤ（データ）.<p>
	 *
	 */
	public String trd_unit_cd() {
		return getConstString(offset + 52, $trd_unit_cd);
	}

	/**
	 *  単位ＣＤ（データ）.<p>
	 *
	 */
	public void trd_unit_cd(String value) {
		setConstString(offset + 52, $trd_unit_cd, value);
	}


	/**
	 *  単位名.<p>
	 *
	 */
	public String trd_unit_nm() {
		return getConstString(offset + 53, $trd_unit_nm);
	}

	/**
	 *  単位名.<p>
	 *
	 */
	public void trd_unit_nm(String value) {
		setConstString(offset + 53, $trd_unit_nm, value);
	}


	/**
	 *  （明細）備考.<p>
	 *
	 */
	public String inst_d_rmrks() {
		return getConstString(offset + 54, $inst_d_rmrks);
	}

	/**
	 *  （明細）備考.<p>
	 *
	 */
	public void inst_d_rmrks(String value) {
		setConstString(offset + 54, $inst_d_rmrks, value);
	}


	/**
	 *  表示順.<p>
	 *
	 */
	public MCNumber disp_seq() {
		return getConstNumber(offset + 55, $disp_seq);
	}

	/**
	 *  表示順.<p>
	 *
	 */
	public void disp_seq(MCNumber value) {
		setConstNumber(offset + 55, $disp_seq, value);
	}

	/**
	 *  表示順.<p>
	 *
	 */
	public void disp_seq(int value) {
		setConstNumber(offset + 55, $disp_seq, value);
	}

	/**
	 *  表示順.<p>
	 *
	 */
	public void disp_seq(long value) {
		setConstNumber(offset + 55, $disp_seq, value);
	}

	/**
	 *  表示順.<p>
	 *
	 */
	public void disp_seq(float value) {
		setConstNumber(offset + 55, $disp_seq, value);
	}

	/**
	 *  表示順.<p>
	 *
	 */
	public void disp_seq(double value) {
		setConstNumber(offset + 55, $disp_seq, value);
	}


	/**
	 *  予備１.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 56, $sub_char1);
	}

	/**
	 *  予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 56, $sub_char1, value);
	}


	/**
	 *  予備２.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 57, $sub_char2);
	}

	/**
	 *  予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 57, $sub_char2, value);
	}


	/**
	 *  予備３.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 58, $sub_char3);
	}

	/**
	 *  予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 58, $sub_char3, value);
	}


	public String getString(String name) {
		if ($itm_cd.equalsIgnoreCase(name)) {
			return itm_cd();
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
		if ($gi_loc_nm.equalsIgnoreCase(name)) {
			return gi_loc_nm();
		}
		if ($gi_str_ln_nm.equalsIgnoreCase(name)) {
			return gi_str_ln_nm();
		}
		if ($gr_str_ln_nm.equalsIgnoreCase(name)) {
			return gr_str_ln_nm();
		}
		if ($lot_no_view.equalsIgnoreCase(name)) {
			return lot_no_view();
		}
		if ($lot_no_data.equalsIgnoreCase(name)) {
			return lot_no_data();
		}
		if ($sublot_no_view.equalsIgnoreCase(name)) {
			return sublot_no_view();
		}
		if ($sublot_no_data.equalsIgnoreCase(name)) {
			return sublot_no_data();
		}
		if ($ver_no_lbl.equalsIgnoreCase(name)) {
			return ver_no_lbl();
		}
		if ($sno1_lbl.equalsIgnoreCase(name)) {
			return sno1_lbl();
		}
		if ($sno2_lbl.equalsIgnoreCase(name)) {
			return sno2_lbl();
		}
		if ($sno3_lbl.equalsIgnoreCase(name)) {
			return sno3_lbl();
		}
		if ($sno4_lbl.equalsIgnoreCase(name)) {
			return sno4_lbl();
		}
		if ($ver_no.equalsIgnoreCase(name)) {
			return ver_no();
		}
		if ($sno1_view.equalsIgnoreCase(name)) {
			return sno1_view();
		}
		if ($sno1_data.equalsIgnoreCase(name)) {
			return sno1_data();
		}
		if ($sno2_view.equalsIgnoreCase(name)) {
			return sno2_view();
		}
		if ($sno2_data.equalsIgnoreCase(name)) {
			return sno2_data();
		}
		if ($sno3_view.equalsIgnoreCase(name)) {
			return sno3_view();
		}
		if ($sno3_data.equalsIgnoreCase(name)) {
			return sno3_data();
		}
		if ($sno4_view.equalsIgnoreCase(name)) {
			return sno4_view();
		}
		if ($sno4_data.equalsIgnoreCase(name)) {
			return sno4_data();
		}
		if ($quality_typ.equalsIgnoreCase(name)) {
			return quality_typ();
		}
		if ($quality_typ_nm.equalsIgnoreCase(name)) {
			return quality_typ_nm();
		}
		if ($gd_cd.equalsIgnoreCase(name)) {
			return gd_cd();
		}
		if ($gd_nm.equalsIgnoreCase(name)) {
			return gd_nm();
		}
		if ($stk_insp_typ_lbl.equalsIgnoreCase(name)) {
			return stk_insp_typ_lbl();
		}
		if ($stk_insp_typ.equalsIgnoreCase(name)) {
			return stk_insp_typ();
		}
		if ($stk_insp_typ_nm.equalsIgnoreCase(name)) {
			return stk_insp_typ_nm();
		}
		if ($stk_id_typ.equalsIgnoreCase(name)) {
			return stk_id_typ();
		}
		if ($stk_id_typ_nm.equalsIgnoreCase(name)) {
			return stk_id_typ_nm();
		}
		if ($stk_bp_cd.equalsIgnoreCase(name)) {
			return stk_bp_cd();
		}
		if ($stk_bp_nm.equalsIgnoreCase(name)) {
			return stk_bp_nm();
		}
		if ($stk_bp_alt_nm1.equalsIgnoreCase(name)) {
			return stk_bp_alt_nm1();
		}
		if ($stk_bp_alt_nm2.equalsIgnoreCase(name)) {
			return stk_bp_alt_nm2();
		}
		if ($stk_bp_alt_nm3.equalsIgnoreCase(name)) {
			return stk_bp_alt_nm3();
		}
		if ($stk_bp_alt_nm4.equalsIgnoreCase(name)) {
			return stk_bp_alt_nm4();
		}
		if ($s_trd_unit_qty.equalsIgnoreCase(name)) {
			return s_trd_unit_qty();
		}
		if ($s_int_trd_unit_qty.equalsIgnoreCase(name)) {
			return s_int_trd_unit_qty();
		}
		if ($s_dec_trd_unit_qty.equalsIgnoreCase(name)) {
			return s_dec_trd_unit_qty();
		}
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			return trd_unit_cd();
		}
		if ($trd_unit_nm.equalsIgnoreCase(name)) {
			return trd_unit_nm();
		}
		if ($inst_d_rmrks.equalsIgnoreCase(name)) {
			return inst_d_rmrks();
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
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			return trd_unit_qty();
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			return disp_seq();
		}
		return super.getNumber(name);
	}

	public String getStringNE(String name) {
		if ($itm_cd.equalsIgnoreCase(name)) {
			return itm_cd();
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
		if ($gi_loc_nm.equalsIgnoreCase(name)) {
			return gi_loc_nm();
		}
		if ($gi_str_ln_nm.equalsIgnoreCase(name)) {
			return gi_str_ln_nm();
		}
		if ($gr_str_ln_nm.equalsIgnoreCase(name)) {
			return gr_str_ln_nm();
		}
		if ($lot_no_view.equalsIgnoreCase(name)) {
			return lot_no_view();
		}
		if ($lot_no_data.equalsIgnoreCase(name)) {
			return lot_no_data();
		}
		if ($sublot_no_view.equalsIgnoreCase(name)) {
			return sublot_no_view();
		}
		if ($sublot_no_data.equalsIgnoreCase(name)) {
			return sublot_no_data();
		}
		if ($ver_no_lbl.equalsIgnoreCase(name)) {
			return ver_no_lbl();
		}
		if ($sno1_lbl.equalsIgnoreCase(name)) {
			return sno1_lbl();
		}
		if ($sno2_lbl.equalsIgnoreCase(name)) {
			return sno2_lbl();
		}
		if ($sno3_lbl.equalsIgnoreCase(name)) {
			return sno3_lbl();
		}
		if ($sno4_lbl.equalsIgnoreCase(name)) {
			return sno4_lbl();
		}
		if ($ver_no.equalsIgnoreCase(name)) {
			return ver_no();
		}
		if ($sno1_view.equalsIgnoreCase(name)) {
			return sno1_view();
		}
		if ($sno1_data.equalsIgnoreCase(name)) {
			return sno1_data();
		}
		if ($sno2_view.equalsIgnoreCase(name)) {
			return sno2_view();
		}
		if ($sno2_data.equalsIgnoreCase(name)) {
			return sno2_data();
		}
		if ($sno3_view.equalsIgnoreCase(name)) {
			return sno3_view();
		}
		if ($sno3_data.equalsIgnoreCase(name)) {
			return sno3_data();
		}
		if ($sno4_view.equalsIgnoreCase(name)) {
			return sno4_view();
		}
		if ($sno4_data.equalsIgnoreCase(name)) {
			return sno4_data();
		}
		if ($quality_typ.equalsIgnoreCase(name)) {
			return quality_typ();
		}
		if ($quality_typ_nm.equalsIgnoreCase(name)) {
			return quality_typ_nm();
		}
		if ($gd_cd.equalsIgnoreCase(name)) {
			return gd_cd();
		}
		if ($gd_nm.equalsIgnoreCase(name)) {
			return gd_nm();
		}
		if ($stk_insp_typ_lbl.equalsIgnoreCase(name)) {
			return stk_insp_typ_lbl();
		}
		if ($stk_insp_typ.equalsIgnoreCase(name)) {
			return stk_insp_typ();
		}
		if ($stk_insp_typ_nm.equalsIgnoreCase(name)) {
			return stk_insp_typ_nm();
		}
		if ($stk_id_typ.equalsIgnoreCase(name)) {
			return stk_id_typ();
		}
		if ($stk_id_typ_nm.equalsIgnoreCase(name)) {
			return stk_id_typ_nm();
		}
		if ($stk_bp_cd.equalsIgnoreCase(name)) {
			return stk_bp_cd();
		}
		if ($stk_bp_nm.equalsIgnoreCase(name)) {
			return stk_bp_nm();
		}
		if ($stk_bp_alt_nm1.equalsIgnoreCase(name)) {
			return stk_bp_alt_nm1();
		}
		if ($stk_bp_alt_nm2.equalsIgnoreCase(name)) {
			return stk_bp_alt_nm2();
		}
		if ($stk_bp_alt_nm3.equalsIgnoreCase(name)) {
			return stk_bp_alt_nm3();
		}
		if ($stk_bp_alt_nm4.equalsIgnoreCase(name)) {
			return stk_bp_alt_nm4();
		}
		if ($s_trd_unit_qty.equalsIgnoreCase(name)) {
			return s_trd_unit_qty();
		}
		if ($s_int_trd_unit_qty.equalsIgnoreCase(name)) {
			return s_int_trd_unit_qty();
		}
		if ($s_dec_trd_unit_qty.equalsIgnoreCase(name)) {
			return s_dec_trd_unit_qty();
		}
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			return trd_unit_cd();
		}
		if ($trd_unit_nm.equalsIgnoreCase(name)) {
			return trd_unit_nm();
		}
		if ($inst_d_rmrks.equalsIgnoreCase(name)) {
			return inst_d_rmrks();
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
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			return trd_unit_qty();
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			return disp_seq();
		}
		return super.getNumberNE(name);
	}

	public void setString(String name, String value) {
		if ($itm_cd.equalsIgnoreCase(name)) {
			itm_cd(value);
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
		if ($gi_loc_nm.equalsIgnoreCase(name)) {
			gi_loc_nm(value);
			return;
		}
		if ($gi_str_ln_nm.equalsIgnoreCase(name)) {
			gi_str_ln_nm(value);
			return;
		}
		if ($gr_str_ln_nm.equalsIgnoreCase(name)) {
			gr_str_ln_nm(value);
			return;
		}
		if ($lot_no_view.equalsIgnoreCase(name)) {
			lot_no_view(value);
			return;
		}
		if ($lot_no_data.equalsIgnoreCase(name)) {
			lot_no_data(value);
			return;
		}
		if ($sublot_no_view.equalsIgnoreCase(name)) {
			sublot_no_view(value);
			return;
		}
		if ($sublot_no_data.equalsIgnoreCase(name)) {
			sublot_no_data(value);
			return;
		}
		if ($ver_no_lbl.equalsIgnoreCase(name)) {
			ver_no_lbl(value);
			return;
		}
		if ($sno1_lbl.equalsIgnoreCase(name)) {
			sno1_lbl(value);
			return;
		}
		if ($sno2_lbl.equalsIgnoreCase(name)) {
			sno2_lbl(value);
			return;
		}
		if ($sno3_lbl.equalsIgnoreCase(name)) {
			sno3_lbl(value);
			return;
		}
		if ($sno4_lbl.equalsIgnoreCase(name)) {
			sno4_lbl(value);
			return;
		}
		if ($ver_no.equalsIgnoreCase(name)) {
			ver_no(value);
			return;
		}
		if ($sno1_view.equalsIgnoreCase(name)) {
			sno1_view(value);
			return;
		}
		if ($sno1_data.equalsIgnoreCase(name)) {
			sno1_data(value);
			return;
		}
		if ($sno2_view.equalsIgnoreCase(name)) {
			sno2_view(value);
			return;
		}
		if ($sno2_data.equalsIgnoreCase(name)) {
			sno2_data(value);
			return;
		}
		if ($sno3_view.equalsIgnoreCase(name)) {
			sno3_view(value);
			return;
		}
		if ($sno3_data.equalsIgnoreCase(name)) {
			sno3_data(value);
			return;
		}
		if ($sno4_view.equalsIgnoreCase(name)) {
			sno4_view(value);
			return;
		}
		if ($sno4_data.equalsIgnoreCase(name)) {
			sno4_data(value);
			return;
		}
		if ($quality_typ.equalsIgnoreCase(name)) {
			quality_typ(value);
			return;
		}
		if ($quality_typ_nm.equalsIgnoreCase(name)) {
			quality_typ_nm(value);
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
		if ($stk_insp_typ_lbl.equalsIgnoreCase(name)) {
			stk_insp_typ_lbl(value);
			return;
		}
		if ($stk_insp_typ.equalsIgnoreCase(name)) {
			stk_insp_typ(value);
			return;
		}
		if ($stk_insp_typ_nm.equalsIgnoreCase(name)) {
			stk_insp_typ_nm(value);
			return;
		}
		if ($stk_id_typ.equalsIgnoreCase(name)) {
			stk_id_typ(value);
			return;
		}
		if ($stk_id_typ_nm.equalsIgnoreCase(name)) {
			stk_id_typ_nm(value);
			return;
		}
		if ($stk_bp_cd.equalsIgnoreCase(name)) {
			stk_bp_cd(value);
			return;
		}
		if ($stk_bp_nm.equalsIgnoreCase(name)) {
			stk_bp_nm(value);
			return;
		}
		if ($stk_bp_alt_nm1.equalsIgnoreCase(name)) {
			stk_bp_alt_nm1(value);
			return;
		}
		if ($stk_bp_alt_nm2.equalsIgnoreCase(name)) {
			stk_bp_alt_nm2(value);
			return;
		}
		if ($stk_bp_alt_nm3.equalsIgnoreCase(name)) {
			stk_bp_alt_nm3(value);
			return;
		}
		if ($stk_bp_alt_nm4.equalsIgnoreCase(name)) {
			stk_bp_alt_nm4(value);
			return;
		}
		if ($s_trd_unit_qty.equalsIgnoreCase(name)) {
			s_trd_unit_qty(value);
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
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			trd_unit_cd(value);
			return;
		}
		if ($trd_unit_nm.equalsIgnoreCase(name)) {
			trd_unit_nm(value);
			return;
		}
		if ($inst_d_rmrks.equalsIgnoreCase(name)) {
			inst_d_rmrks(value);
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
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($itm_cd.equalsIgnoreCase(name)) {
			itm_cd(value);
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
		if ($gi_loc_nm.equalsIgnoreCase(name)) {
			gi_loc_nm(value);
			return;
		}
		if ($gi_str_ln_nm.equalsIgnoreCase(name)) {
			gi_str_ln_nm(value);
			return;
		}
		if ($gr_str_ln_nm.equalsIgnoreCase(name)) {
			gr_str_ln_nm(value);
			return;
		}
		if ($lot_no_view.equalsIgnoreCase(name)) {
			lot_no_view(value);
			return;
		}
		if ($lot_no_data.equalsIgnoreCase(name)) {
			lot_no_data(value);
			return;
		}
		if ($sublot_no_view.equalsIgnoreCase(name)) {
			sublot_no_view(value);
			return;
		}
		if ($sublot_no_data.equalsIgnoreCase(name)) {
			sublot_no_data(value);
			return;
		}
		if ($ver_no_lbl.equalsIgnoreCase(name)) {
			ver_no_lbl(value);
			return;
		}
		if ($sno1_lbl.equalsIgnoreCase(name)) {
			sno1_lbl(value);
			return;
		}
		if ($sno2_lbl.equalsIgnoreCase(name)) {
			sno2_lbl(value);
			return;
		}
		if ($sno3_lbl.equalsIgnoreCase(name)) {
			sno3_lbl(value);
			return;
		}
		if ($sno4_lbl.equalsIgnoreCase(name)) {
			sno4_lbl(value);
			return;
		}
		if ($ver_no.equalsIgnoreCase(name)) {
			ver_no(value);
			return;
		}
		if ($sno1_view.equalsIgnoreCase(name)) {
			sno1_view(value);
			return;
		}
		if ($sno1_data.equalsIgnoreCase(name)) {
			sno1_data(value);
			return;
		}
		if ($sno2_view.equalsIgnoreCase(name)) {
			sno2_view(value);
			return;
		}
		if ($sno2_data.equalsIgnoreCase(name)) {
			sno2_data(value);
			return;
		}
		if ($sno3_view.equalsIgnoreCase(name)) {
			sno3_view(value);
			return;
		}
		if ($sno3_data.equalsIgnoreCase(name)) {
			sno3_data(value);
			return;
		}
		if ($sno4_view.equalsIgnoreCase(name)) {
			sno4_view(value);
			return;
		}
		if ($sno4_data.equalsIgnoreCase(name)) {
			sno4_data(value);
			return;
		}
		if ($quality_typ.equalsIgnoreCase(name)) {
			quality_typ(value);
			return;
		}
		if ($quality_typ_nm.equalsIgnoreCase(name)) {
			quality_typ_nm(value);
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
		if ($stk_insp_typ_lbl.equalsIgnoreCase(name)) {
			stk_insp_typ_lbl(value);
			return;
		}
		if ($stk_insp_typ.equalsIgnoreCase(name)) {
			stk_insp_typ(value);
			return;
		}
		if ($stk_insp_typ_nm.equalsIgnoreCase(name)) {
			stk_insp_typ_nm(value);
			return;
		}
		if ($stk_id_typ.equalsIgnoreCase(name)) {
			stk_id_typ(value);
			return;
		}
		if ($stk_id_typ_nm.equalsIgnoreCase(name)) {
			stk_id_typ_nm(value);
			return;
		}
		if ($stk_bp_cd.equalsIgnoreCase(name)) {
			stk_bp_cd(value);
			return;
		}
		if ($stk_bp_nm.equalsIgnoreCase(name)) {
			stk_bp_nm(value);
			return;
		}
		if ($stk_bp_alt_nm1.equalsIgnoreCase(name)) {
			stk_bp_alt_nm1(value);
			return;
		}
		if ($stk_bp_alt_nm2.equalsIgnoreCase(name)) {
			stk_bp_alt_nm2(value);
			return;
		}
		if ($stk_bp_alt_nm3.equalsIgnoreCase(name)) {
			stk_bp_alt_nm3(value);
			return;
		}
		if ($stk_bp_alt_nm4.equalsIgnoreCase(name)) {
			stk_bp_alt_nm4(value);
			return;
		}
		if ($s_trd_unit_qty.equalsIgnoreCase(name)) {
			s_trd_unit_qty(value);
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
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			trd_unit_cd(value);
			return;
		}
		if ($trd_unit_nm.equalsIgnoreCase(name)) {
			trd_unit_nm(value);
			return;
		}
		if ($inst_d_rmrks.equalsIgnoreCase(name)) {
			inst_d_rmrks(value);
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
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}



}

