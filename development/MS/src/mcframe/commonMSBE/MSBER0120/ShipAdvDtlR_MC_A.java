package mcframe.commonMSBE.MSBER0120;

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
 * ブロック"ShipAdvDtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class ShipAdvDtlR_MC_A extends MCConstRow {

	/**
	 *  品目ＣＤ.<p>
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
	 *  手配ＮＯ１.<p>
	 *
	 */
	public static final String $sno1 = "sno1";
	/**
	 *  手配ＮＯ２.<p>
	 *
	 */
	public static final String $sno2 = "sno2";
	/**
	 *  手配ＮＯ３.<p>
	 *
	 */
	public static final String $sno3 = "sno3";
	/**
	 *  手配ＮＯ４.<p>
	 *
	 */
	public static final String $sno4 = "sno4";
	/**
	 *  ロットＮＯ(表示用).<p>
	 *
	 */
	public static final String $lot_no_view = "lot_no_view";
	/**
	 *  ロットＮＯ(データ).<p>
	 *
	 */
	public static final String $lot_no_data = "lot_no_data";
	/**
	 *  ロット複数ＦＬＧ.<p>
	 *
	 */
	public static final String $lot_plural_flg = "lot_plural_flg";
	/**
	 *  ロット複数ＦＬＧ文字列.<p>
	 *
	 */
	public static final String $s_lot_plural_flg = "s_lot_plural_flg";
	/**
	 *  サブロットＮＯ(表示用).<p>
	 *
	 */
	public static final String $sublot_no_view = "sublot_no_view";
	/**
	 *  サブロットＮＯ(データ).<p>
	 *
	 */
	public static final String $sublot_no_data = "sublot_no_data";
	/**
	 *  サブロット複数ＦＬＧ.<p>
	 *
	 */
	public static final String $sublot_plural_flg = "sublot_plural_flg";
	/**
	 *  サブロット複数ＦＬＧ文字列.<p>
	 *
	 */
	public static final String $s_sublot_plural_flg = "s_sublot_plural_flg";
	/**
	 *  数量(データ).<p>
	 *
	 */
	public static final String $trd_unit_qty = "trd_unit_qty";
	/**
	 *  数量(文字列).<p>
	 *
	 */
	public static final String $s_trd_unit_qty = "s_trd_unit_qty";
	/**
	 *  数量(整数部).<p>
	 *
	 */
	public static final String $s_int_trd_unit_qty = "s_int_trd_unit_qty";
	/**
	 *  数量(小数部).<p>
	 *
	 */
	public static final String $s_dec_trd_unit_qty = "s_dec_trd_unit_qty";
	/**
	 *  基準単位数量(データ).<p>
	 *
	 */
	public static final String $base_unit_qty = "base_unit_qty";
	/**
	 *  基準単位数量(文字列).<p>
	 *
	 */
	public static final String $s_base_unit_qty = "s_base_unit_qty";
	/**
	 *  基準単位数量(整数部).<p>
	 *
	 */
	public static final String $s_int_base_unit_qty = "s_int_base_unit_qty";
	/**
	 *  基準単位数量(小数部).<p>
	 *
	 */
	public static final String $s_dec_base_unit_qty = "s_dec_base_unit_qty";
	/**
	 *  取引単位.<p>
	 *
	 */
	public static final String $trd_unit_nm = "trd_unit_nm";
	/**
	 *  取引単位ＣＤ(データ).<p>
	 *
	 */
	public static final String $trd_unit_cd = "trd_unit_cd";
	/**
	 *  基準単位名(データ).<p>
	 *
	 */
	public static final String $base_unit_nm = "base_unit_nm";
	/**
	 *  基準単位ＣＤ(データ).<p>
	 *
	 */
	public static final String $base_unit_cd = "base_unit_cd";
	/**
	 *  取引明細備考.<p>
	 *
	 */
	public static final String $trd_d_rmrks = "trd_d_rmrks";
	/**
	 *  納品書明細ＮＯ.<p>
	 *
	 */
	public static final String $dlv_slip_d_no = "dlv_slip_d_no";
	/**
	 *  得意先注文明細ＮＯ.<p>
	 *
	 */
	public static final String $cst_po_d_no = "cst_po_d_no";
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
	/**
	 *  得意先品目ＣＤ.<p>
	 *
	 */
	public static final String $cst_itm_cd = "cst_itm_cd";
	/**
	 *  得意先品名.<p>
	 *
	 */
	public static final String $cst_itm_nm = "cst_itm_nm";


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
	public static final MCMeta sno1_META = createCommonMeta($sno1, mcframe.commonMA.meta.MA_META.SNO1);
	public static final MCMeta sno2_META = createCommonMeta($sno2, mcframe.commonMA.meta.MA_META.SNO2);
	public static final MCMeta sno3_META = createCommonMeta($sno3, mcframe.commonMA.meta.MA_META.SNO3);
	public static final MCMeta sno4_META = createCommonMeta($sno4, mcframe.commonMA.meta.MA_META.SNO4);
	public static final MCMeta lot_no_view_META = createCommonMeta($lot_no_view, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta lot_no_data_META = createCommonMeta($lot_no_data, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta lot_plural_flg_META = createCommonMeta($lot_plural_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta s_lot_plural_flg_META = createStringMeta($s_lot_plural_flg);
	public static final MCMeta sublot_no_view_META = createCommonMeta($sublot_no_view, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta sublot_no_data_META = createCommonMeta($sublot_no_data, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta sublot_plural_flg_META = createCommonMeta($sublot_plural_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta s_sublot_plural_flg_META = createStringMeta($s_sublot_plural_flg);
	public static final MCMeta trd_unit_qty_META = createCommonMeta($trd_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta s_trd_unit_qty_META = createStringMeta($s_trd_unit_qty);
	public static final MCMeta s_int_trd_unit_qty_META = createStringMeta($s_int_trd_unit_qty);
	public static final MCMeta s_dec_trd_unit_qty_META = createStringMeta($s_dec_trd_unit_qty);
	public static final MCMeta base_unit_qty_META = createCommonMeta($base_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta s_base_unit_qty_META = createStringMeta($s_base_unit_qty);
	public static final MCMeta s_int_base_unit_qty_META = createStringMeta($s_int_base_unit_qty);
	public static final MCMeta s_dec_base_unit_qty_META = createStringMeta($s_dec_base_unit_qty);
	public static final MCMeta trd_unit_nm_META = createCommonMeta($trd_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta trd_unit_cd_META = createCommonMeta($trd_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta base_unit_nm_META = createCommonMeta($base_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta base_unit_cd_META = createCommonMeta($base_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta trd_d_rmrks_META = createCommonMeta($trd_d_rmrks, mcframe.commonMA.meta.MA_META.TRD_D_RMRKS);
	public static final MCMeta dlv_slip_d_no_META = createCommonMeta($dlv_slip_d_no, mcframe.commonMA.meta.MA_META.DLV_SLIP_D_NO);
	public static final MCMeta cst_po_d_no_META = createCommonMeta($cst_po_d_no, mcframe.commonMA.meta.MA_META.CST_PO_D_NO);
	public static final MCMeta d_sub_char1_META = createCommonMeta($d_sub_char1, mcframe.commonMS.meta.MS_META.DLV_SLIP_D_SUB_CHAR1);
	public static final MCMeta d_sub_char2_META = createCommonMeta($d_sub_char2, mcframe.commonMS.meta.MS_META.DLV_SLIP_D_SUB_CHAR2);
	public static final MCMeta d_sub_char3_META = createCommonMeta($d_sub_char3, mcframe.commonMS.meta.MS_META.DLV_SLIP_D_SUB_CHAR3);
	public static final MCMeta cst_itm_cd_META = createCommonMeta($cst_itm_cd, mcframe.commonMA.meta.MA_META.BP_ITM_CD);
	public static final MCMeta cst_itm_nm_META = createCommonMeta($cst_itm_nm, mcframe.commonMA.meta.MA_META.BP_ITM_NM);

	protected static final ConstMetaList<ShipAdvDtlR> constMetas = new ConstMetaList<ShipAdvDtlR>(
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
			sno1_META,
			sno2_META,
			sno3_META,
			sno4_META,
			lot_no_view_META,
			lot_no_data_META,
			lot_plural_flg_META,
			s_lot_plural_flg_META,
			sublot_no_view_META,
			sublot_no_data_META,
			sublot_plural_flg_META,
			s_sublot_plural_flg_META,
			trd_unit_qty_META,
			s_trd_unit_qty_META,
			s_int_trd_unit_qty_META,
			s_dec_trd_unit_qty_META,
			base_unit_qty_META,
			s_base_unit_qty_META,
			s_int_base_unit_qty_META,
			s_dec_base_unit_qty_META,
			trd_unit_nm_META,
			trd_unit_cd_META,
			base_unit_nm_META,
			base_unit_cd_META,
			trd_d_rmrks_META,
			dlv_slip_d_no_META,
			cst_po_d_no_META,
			d_sub_char1_META,
			d_sub_char2_META,
			d_sub_char3_META,
			cst_itm_cd_META,
			cst_itm_nm_META
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
	protected ShipAdvDtlR_MC_A(ConstMetaList<? extends ShipAdvDtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ShipAdvDtlR clone() {
		return (ShipAdvDtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ShipAdvDtlR createInstance() {
		return (ShipAdvDtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public ShipAdvDtlR getValues(String... names) {
		return (ShipAdvDtlR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 *  品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 0, $itm_cd);
	}

	/**
	 *  品目ＣＤ.<p>
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
	 *  手配ＮＯ１.<p>
	 *
	 */
	public String sno1() {
		return getConstString(offset + 12, $sno1);
	}

	/**
	 *  手配ＮＯ１.<p>
	 *
	 */
	public void sno1(String value) {
		setConstString(offset + 12, $sno1, value);
	}


	/**
	 *  手配ＮＯ２.<p>
	 *
	 */
	public String sno2() {
		return getConstString(offset + 13, $sno2);
	}

	/**
	 *  手配ＮＯ２.<p>
	 *
	 */
	public void sno2(String value) {
		setConstString(offset + 13, $sno2, value);
	}


	/**
	 *  手配ＮＯ３.<p>
	 *
	 */
	public String sno3() {
		return getConstString(offset + 14, $sno3);
	}

	/**
	 *  手配ＮＯ３.<p>
	 *
	 */
	public void sno3(String value) {
		setConstString(offset + 14, $sno3, value);
	}


	/**
	 *  手配ＮＯ４.<p>
	 *
	 */
	public String sno4() {
		return getConstString(offset + 15, $sno4);
	}

	/**
	 *  手配ＮＯ４.<p>
	 *
	 */
	public void sno4(String value) {
		setConstString(offset + 15, $sno4, value);
	}


	/**
	 *  ロットＮＯ(表示用).<p>
	 *
	 */
	public String lot_no_view() {
		return getConstString(offset + 16, $lot_no_view);
	}

	/**
	 *  ロットＮＯ(表示用).<p>
	 *
	 */
	public void lot_no_view(String value) {
		setConstString(offset + 16, $lot_no_view, value);
	}


	/**
	 *  ロットＮＯ(データ).<p>
	 *
	 */
	public String lot_no_data() {
		return getConstString(offset + 17, $lot_no_data);
	}

	/**
	 *  ロットＮＯ(データ).<p>
	 *
	 */
	public void lot_no_data(String value) {
		setConstString(offset + 17, $lot_no_data, value);
	}


	/**
	 *  ロット複数ＦＬＧ.<p>
	 *
	 */
	public boolean lot_plural_flg() {
		return getConstBoolean(offset + 18, $lot_plural_flg);
	}

	/**
	 *  ロット複数ＦＬＧ.<p>
	 *
	 */
	public void lot_plural_flg(boolean value) {
		setConstBoolean(offset + 18, $lot_plural_flg, value);
	}


	/**
	 *  ロット複数ＦＬＧ文字列.<p>
	 *
	 */
	public String s_lot_plural_flg() {
		return getConstString(offset + 19, $s_lot_plural_flg);
	}

	/**
	 *  ロット複数ＦＬＧ文字列.<p>
	 *
	 */
	public void s_lot_plural_flg(String value) {
		setConstString(offset + 19, $s_lot_plural_flg, value);
	}


	/**
	 *  サブロットＮＯ(表示用).<p>
	 *
	 */
	public String sublot_no_view() {
		return getConstString(offset + 20, $sublot_no_view);
	}

	/**
	 *  サブロットＮＯ(表示用).<p>
	 *
	 */
	public void sublot_no_view(String value) {
		setConstString(offset + 20, $sublot_no_view, value);
	}


	/**
	 *  サブロットＮＯ(データ).<p>
	 *
	 */
	public String sublot_no_data() {
		return getConstString(offset + 21, $sublot_no_data);
	}

	/**
	 *  サブロットＮＯ(データ).<p>
	 *
	 */
	public void sublot_no_data(String value) {
		setConstString(offset + 21, $sublot_no_data, value);
	}


	/**
	 *  サブロット複数ＦＬＧ.<p>
	 *
	 */
	public boolean sublot_plural_flg() {
		return getConstBoolean(offset + 22, $sublot_plural_flg);
	}

	/**
	 *  サブロット複数ＦＬＧ.<p>
	 *
	 */
	public void sublot_plural_flg(boolean value) {
		setConstBoolean(offset + 22, $sublot_plural_flg, value);
	}


	/**
	 *  サブロット複数ＦＬＧ文字列.<p>
	 *
	 */
	public String s_sublot_plural_flg() {
		return getConstString(offset + 23, $s_sublot_plural_flg);
	}

	/**
	 *  サブロット複数ＦＬＧ文字列.<p>
	 *
	 */
	public void s_sublot_plural_flg(String value) {
		setConstString(offset + 23, $s_sublot_plural_flg, value);
	}


	/**
	 *  数量(データ).<p>
	 *
	 */
	public MCNumber trd_unit_qty() {
		return getConstNumber(offset + 24, $trd_unit_qty);
	}

	/**
	 *  数量(データ).<p>
	 *
	 */
	public void trd_unit_qty(MCNumber value) {
		setConstNumber(offset + 24, $trd_unit_qty, value);
	}

	/**
	 *  数量(データ).<p>
	 *
	 */
	public void trd_unit_qty(int value) {
		setConstNumber(offset + 24, $trd_unit_qty, value);
	}

	/**
	 *  数量(データ).<p>
	 *
	 */
	public void trd_unit_qty(long value) {
		setConstNumber(offset + 24, $trd_unit_qty, value);
	}

	/**
	 *  数量(データ).<p>
	 *
	 */
	public void trd_unit_qty(float value) {
		setConstNumber(offset + 24, $trd_unit_qty, value);
	}

	/**
	 *  数量(データ).<p>
	 *
	 */
	public void trd_unit_qty(double value) {
		setConstNumber(offset + 24, $trd_unit_qty, value);
	}


	/**
	 *  数量(文字列).<p>
	 *
	 */
	public String s_trd_unit_qty() {
		return getConstString(offset + 25, $s_trd_unit_qty);
	}

	/**
	 *  数量(文字列).<p>
	 *
	 */
	public void s_trd_unit_qty(String value) {
		setConstString(offset + 25, $s_trd_unit_qty, value);
	}


	/**
	 *  数量(整数部).<p>
	 *
	 */
	public String s_int_trd_unit_qty() {
		return getConstString(offset + 26, $s_int_trd_unit_qty);
	}

	/**
	 *  数量(整数部).<p>
	 *
	 */
	public void s_int_trd_unit_qty(String value) {
		setConstString(offset + 26, $s_int_trd_unit_qty, value);
	}


	/**
	 *  数量(小数部).<p>
	 *
	 */
	public String s_dec_trd_unit_qty() {
		return getConstString(offset + 27, $s_dec_trd_unit_qty);
	}

	/**
	 *  数量(小数部).<p>
	 *
	 */
	public void s_dec_trd_unit_qty(String value) {
		setConstString(offset + 27, $s_dec_trd_unit_qty, value);
	}


	/**
	 *  基準単位数量(データ).<p>
	 *
	 */
	public MCNumber base_unit_qty() {
		return getConstNumber(offset + 28, $base_unit_qty);
	}

	/**
	 *  基準単位数量(データ).<p>
	 *
	 */
	public void base_unit_qty(MCNumber value) {
		setConstNumber(offset + 28, $base_unit_qty, value);
	}

	/**
	 *  基準単位数量(データ).<p>
	 *
	 */
	public void base_unit_qty(int value) {
		setConstNumber(offset + 28, $base_unit_qty, value);
	}

	/**
	 *  基準単位数量(データ).<p>
	 *
	 */
	public void base_unit_qty(long value) {
		setConstNumber(offset + 28, $base_unit_qty, value);
	}

	/**
	 *  基準単位数量(データ).<p>
	 *
	 */
	public void base_unit_qty(float value) {
		setConstNumber(offset + 28, $base_unit_qty, value);
	}

	/**
	 *  基準単位数量(データ).<p>
	 *
	 */
	public void base_unit_qty(double value) {
		setConstNumber(offset + 28, $base_unit_qty, value);
	}


	/**
	 *  基準単位数量(文字列).<p>
	 *
	 */
	public String s_base_unit_qty() {
		return getConstString(offset + 29, $s_base_unit_qty);
	}

	/**
	 *  基準単位数量(文字列).<p>
	 *
	 */
	public void s_base_unit_qty(String value) {
		setConstString(offset + 29, $s_base_unit_qty, value);
	}


	/**
	 *  基準単位数量(整数部).<p>
	 *
	 */
	public String s_int_base_unit_qty() {
		return getConstString(offset + 30, $s_int_base_unit_qty);
	}

	/**
	 *  基準単位数量(整数部).<p>
	 *
	 */
	public void s_int_base_unit_qty(String value) {
		setConstString(offset + 30, $s_int_base_unit_qty, value);
	}


	/**
	 *  基準単位数量(小数部).<p>
	 *
	 */
	public String s_dec_base_unit_qty() {
		return getConstString(offset + 31, $s_dec_base_unit_qty);
	}

	/**
	 *  基準単位数量(小数部).<p>
	 *
	 */
	public void s_dec_base_unit_qty(String value) {
		setConstString(offset + 31, $s_dec_base_unit_qty, value);
	}


	/**
	 *  取引単位.<p>
	 *
	 */
	public String trd_unit_nm() {
		return getConstString(offset + 32, $trd_unit_nm);
	}

	/**
	 *  取引単位.<p>
	 *
	 */
	public void trd_unit_nm(String value) {
		setConstString(offset + 32, $trd_unit_nm, value);
	}


	/**
	 *  取引単位ＣＤ(データ).<p>
	 *
	 */
	public String trd_unit_cd() {
		return getConstString(offset + 33, $trd_unit_cd);
	}

	/**
	 *  取引単位ＣＤ(データ).<p>
	 *
	 */
	public void trd_unit_cd(String value) {
		setConstString(offset + 33, $trd_unit_cd, value);
	}


	/**
	 *  基準単位名(データ).<p>
	 *
	 */
	public String base_unit_nm() {
		return getConstString(offset + 34, $base_unit_nm);
	}

	/**
	 *  基準単位名(データ).<p>
	 *
	 */
	public void base_unit_nm(String value) {
		setConstString(offset + 34, $base_unit_nm, value);
	}


	/**
	 *  基準単位ＣＤ(データ).<p>
	 *
	 */
	public String base_unit_cd() {
		return getConstString(offset + 35, $base_unit_cd);
	}

	/**
	 *  基準単位ＣＤ(データ).<p>
	 *
	 */
	public void base_unit_cd(String value) {
		setConstString(offset + 35, $base_unit_cd, value);
	}


	/**
	 *  取引明細備考.<p>
	 *
	 */
	public String trd_d_rmrks() {
		return getConstString(offset + 36, $trd_d_rmrks);
	}

	/**
	 *  取引明細備考.<p>
	 *
	 */
	public void trd_d_rmrks(String value) {
		setConstString(offset + 36, $trd_d_rmrks, value);
	}


	/**
	 *  納品書明細ＮＯ.<p>
	 *
	 */
	public String dlv_slip_d_no() {
		return getConstString(offset + 37, $dlv_slip_d_no);
	}

	/**
	 *  納品書明細ＮＯ.<p>
	 *
	 */
	public void dlv_slip_d_no(String value) {
		setConstString(offset + 37, $dlv_slip_d_no, value);
	}


	/**
	 *  得意先注文明細ＮＯ.<p>
	 *
	 */
	public String cst_po_d_no() {
		return getConstString(offset + 38, $cst_po_d_no);
	}

	/**
	 *  得意先注文明細ＮＯ.<p>
	 *
	 */
	public void cst_po_d_no(String value) {
		setConstString(offset + 38, $cst_po_d_no, value);
	}


	/**
	 *  予備１.<p>
	 *
	 */
	public String d_sub_char1() {
		return getConstString(offset + 39, $d_sub_char1);
	}

	/**
	 *  予備１.<p>
	 *
	 */
	public void d_sub_char1(String value) {
		setConstString(offset + 39, $d_sub_char1, value);
	}


	/**
	 *  予備２.<p>
	 *
	 */
	public String d_sub_char2() {
		return getConstString(offset + 40, $d_sub_char2);
	}

	/**
	 *  予備２.<p>
	 *
	 */
	public void d_sub_char2(String value) {
		setConstString(offset + 40, $d_sub_char2, value);
	}


	/**
	 *  予備３.<p>
	 *
	 */
	public String d_sub_char3() {
		return getConstString(offset + 41, $d_sub_char3);
	}

	/**
	 *  予備３.<p>
	 *
	 */
	public void d_sub_char3(String value) {
		setConstString(offset + 41, $d_sub_char3, value);
	}


	/**
	 *  得意先品目ＣＤ.<p>
	 *
	 */
	public String cst_itm_cd() {
		return getConstString(offset + 42, $cst_itm_cd);
	}

	/**
	 *  得意先品目ＣＤ.<p>
	 *
	 */
	public void cst_itm_cd(String value) {
		setConstString(offset + 42, $cst_itm_cd, value);
	}


	/**
	 *  得意先品名.<p>
	 *
	 */
	public String cst_itm_nm() {
		return getConstString(offset + 43, $cst_itm_nm);
	}

	/**
	 *  得意先品名.<p>
	 *
	 */
	public void cst_itm_nm(String value) {
		setConstString(offset + 43, $cst_itm_nm, value);
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
		if ($lot_no_view.equalsIgnoreCase(name)) {
			return lot_no_view();
		}
		if ($lot_no_data.equalsIgnoreCase(name)) {
			return lot_no_data();
		}
		if ($s_lot_plural_flg.equalsIgnoreCase(name)) {
			return s_lot_plural_flg();
		}
		if ($sublot_no_view.equalsIgnoreCase(name)) {
			return sublot_no_view();
		}
		if ($sublot_no_data.equalsIgnoreCase(name)) {
			return sublot_no_data();
		}
		if ($s_sublot_plural_flg.equalsIgnoreCase(name)) {
			return s_sublot_plural_flg();
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
		if ($s_base_unit_qty.equalsIgnoreCase(name)) {
			return s_base_unit_qty();
		}
		if ($s_int_base_unit_qty.equalsIgnoreCase(name)) {
			return s_int_base_unit_qty();
		}
		if ($s_dec_base_unit_qty.equalsIgnoreCase(name)) {
			return s_dec_base_unit_qty();
		}
		if ($trd_unit_nm.equalsIgnoreCase(name)) {
			return trd_unit_nm();
		}
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			return trd_unit_cd();
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			return base_unit_nm();
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($trd_d_rmrks.equalsIgnoreCase(name)) {
			return trd_d_rmrks();
		}
		if ($dlv_slip_d_no.equalsIgnoreCase(name)) {
			return dlv_slip_d_no();
		}
		if ($cst_po_d_no.equalsIgnoreCase(name)) {
			return cst_po_d_no();
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
		if ($cst_itm_cd.equalsIgnoreCase(name)) {
			return cst_itm_cd();
		}
		if ($cst_itm_nm.equalsIgnoreCase(name)) {
			return cst_itm_nm();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			return trd_unit_qty();
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			return base_unit_qty();
		}
		return super.getNumber(name);
	}
	public boolean getBoolean(String name) {
		if ($lot_plural_flg.equalsIgnoreCase(name)) {
			return lot_plural_flg();
		}
		if ($sublot_plural_flg.equalsIgnoreCase(name)) {
			return sublot_plural_flg();
		}
		return super.getBoolean(name);
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
		if ($lot_no_view.equalsIgnoreCase(name)) {
			return lot_no_view();
		}
		if ($lot_no_data.equalsIgnoreCase(name)) {
			return lot_no_data();
		}
		if ($s_lot_plural_flg.equalsIgnoreCase(name)) {
			return s_lot_plural_flg();
		}
		if ($sublot_no_view.equalsIgnoreCase(name)) {
			return sublot_no_view();
		}
		if ($sublot_no_data.equalsIgnoreCase(name)) {
			return sublot_no_data();
		}
		if ($s_sublot_plural_flg.equalsIgnoreCase(name)) {
			return s_sublot_plural_flg();
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
		if ($s_base_unit_qty.equalsIgnoreCase(name)) {
			return s_base_unit_qty();
		}
		if ($s_int_base_unit_qty.equalsIgnoreCase(name)) {
			return s_int_base_unit_qty();
		}
		if ($s_dec_base_unit_qty.equalsIgnoreCase(name)) {
			return s_dec_base_unit_qty();
		}
		if ($trd_unit_nm.equalsIgnoreCase(name)) {
			return trd_unit_nm();
		}
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			return trd_unit_cd();
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			return base_unit_nm();
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($trd_d_rmrks.equalsIgnoreCase(name)) {
			return trd_d_rmrks();
		}
		if ($dlv_slip_d_no.equalsIgnoreCase(name)) {
			return dlv_slip_d_no();
		}
		if ($cst_po_d_no.equalsIgnoreCase(name)) {
			return cst_po_d_no();
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
		if ($cst_itm_cd.equalsIgnoreCase(name)) {
			return cst_itm_cd();
		}
		if ($cst_itm_nm.equalsIgnoreCase(name)) {
			return cst_itm_nm();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			return trd_unit_qty();
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			return base_unit_qty();
		}
		return super.getNumberNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($lot_plural_flg.equalsIgnoreCase(name)) {
			return lot_plural_flg();
		}
		if ($sublot_plural_flg.equalsIgnoreCase(name)) {
			return sublot_plural_flg();
		}
		return super.getBooleanNE(name);
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
		if ($lot_no_view.equalsIgnoreCase(name)) {
			lot_no_view(value);
			return;
		}
		if ($lot_no_data.equalsIgnoreCase(name)) {
			lot_no_data(value);
			return;
		}
		if ($s_lot_plural_flg.equalsIgnoreCase(name)) {
			s_lot_plural_flg(value);
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
		if ($s_sublot_plural_flg.equalsIgnoreCase(name)) {
			s_sublot_plural_flg(value);
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
		if ($s_base_unit_qty.equalsIgnoreCase(name)) {
			s_base_unit_qty(value);
			return;
		}
		if ($s_int_base_unit_qty.equalsIgnoreCase(name)) {
			s_int_base_unit_qty(value);
			return;
		}
		if ($s_dec_base_unit_qty.equalsIgnoreCase(name)) {
			s_dec_base_unit_qty(value);
			return;
		}
		if ($trd_unit_nm.equalsIgnoreCase(name)) {
			trd_unit_nm(value);
			return;
		}
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			trd_unit_cd(value);
			return;
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			base_unit_nm(value);
			return;
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			base_unit_cd(value);
			return;
		}
		if ($trd_d_rmrks.equalsIgnoreCase(name)) {
			trd_d_rmrks(value);
			return;
		}
		if ($dlv_slip_d_no.equalsIgnoreCase(name)) {
			dlv_slip_d_no(value);
			return;
		}
		if ($cst_po_d_no.equalsIgnoreCase(name)) {
			cst_po_d_no(value);
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
		if ($cst_itm_cd.equalsIgnoreCase(name)) {
			cst_itm_cd(value);
			return;
		}
		if ($cst_itm_nm.equalsIgnoreCase(name)) {
			cst_itm_nm(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($lot_plural_flg.equalsIgnoreCase(name)) {
			lot_plural_flg(value);
			return;
		}
		if ($sublot_plural_flg.equalsIgnoreCase(name)) {
			sublot_plural_flg(value);
			return;
		}
		super.setBoolean(name, value);
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
		if ($lot_no_view.equalsIgnoreCase(name)) {
			lot_no_view(value);
			return;
		}
		if ($lot_no_data.equalsIgnoreCase(name)) {
			lot_no_data(value);
			return;
		}
		if ($s_lot_plural_flg.equalsIgnoreCase(name)) {
			s_lot_plural_flg(value);
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
		if ($s_sublot_plural_flg.equalsIgnoreCase(name)) {
			s_sublot_plural_flg(value);
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
		if ($s_base_unit_qty.equalsIgnoreCase(name)) {
			s_base_unit_qty(value);
			return;
		}
		if ($s_int_base_unit_qty.equalsIgnoreCase(name)) {
			s_int_base_unit_qty(value);
			return;
		}
		if ($s_dec_base_unit_qty.equalsIgnoreCase(name)) {
			s_dec_base_unit_qty(value);
			return;
		}
		if ($trd_unit_nm.equalsIgnoreCase(name)) {
			trd_unit_nm(value);
			return;
		}
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			trd_unit_cd(value);
			return;
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			base_unit_nm(value);
			return;
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			base_unit_cd(value);
			return;
		}
		if ($trd_d_rmrks.equalsIgnoreCase(name)) {
			trd_d_rmrks(value);
			return;
		}
		if ($dlv_slip_d_no.equalsIgnoreCase(name)) {
			dlv_slip_d_no(value);
			return;
		}
		if ($cst_po_d_no.equalsIgnoreCase(name)) {
			cst_po_d_no(value);
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
		if ($cst_itm_cd.equalsIgnoreCase(name)) {
			cst_itm_cd(value);
			return;
		}
		if ($cst_itm_nm.equalsIgnoreCase(name)) {
			cst_itm_nm(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($lot_plural_flg.equalsIgnoreCase(name)) {
			lot_plural_flg(value);
			return;
		}
		if ($sublot_plural_flg.equalsIgnoreCase(name)) {
			sublot_plural_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

