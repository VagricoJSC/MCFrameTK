package mcframe.commonMSBF.MSBFR0040;

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
 * ブロック"PlntAprvHdr"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class PlntAprvHdrR_MC_A extends MCConstRow {

	/**
	 *  工場出荷承認ＮＯ.<p>
	 *
	 */
	public static final String $plnt_aprv_no = "plnt_aprv_no";
	/**
	 *  発行日時.<p>
	 *
	 */
	public static final String $prnt_tm = "prnt_tm";
	/**
	 *  品目ＣＤ.<p>
	 *
	 */
	public static final String $itm_cd = "itm_cd";
	/**
	 *  枝番１.<p>
	 *
	 */
	public static final String $itm_sub1 = "itm_sub1";
	/**
	 *  枝番２.<p>
	 *
	 */
	public static final String $itm_sub2 = "itm_sub2";
	/**
	 *  枝番３.<p>
	 *
	 */
	public static final String $itm_sub3 = "itm_sub3";
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
	 *  届出名.<p>
	 *
	 */
	public static final String $ntfy_nm = "ntfy_nm";
	/**
	 *  ロットＮＯ (表示用).<p>
	 *
	 */
	public static final String $lot_no_view = "lot_no_view";
	/**
	 *  ロットＮＯ (データ用).<p>
	 *
	 */
	public static final String $lot_no_data = "lot_no_data";
	/**
	 *  サブロットＮＯ（ラベル）.<p>
	 *
	 */
	public static final String $sublot_no_lbl = "sublot_no_lbl";
	/**
	 *  サブロットＮＯ (表示用).<p>
	 *
	 */
	public static final String $sublot_no_view = "sublot_no_view";
	/**
	 *  サブロットＮＯ (データ用).<p>
	 *
	 */
	public static final String $sublot_no_data = "sublot_no_data";
	/**
	 *  数量.<p>
	 *
	 */
	public static final String $base_unit_qty = "base_unit_qty";
	/**
	 *  数量文字列.<p>
	 *
	 */
	public static final String $s_base_unit_qty = "s_base_unit_qty";
	/**
	 *  単位ＣＤ.<p>
	 *
	 */
	public static final String $base_unit_cd = "base_unit_cd";
	/**
	 *  単位名.<p>
	 *
	 */
	public static final String $base_unit_nm = "base_unit_nm";
	/**
	 *  小数部有効桁数.<p>
	 *
	 */
	public static final String $base_dec_place = "base_dec_place";
	/**
	 *  出荷承認日.<p>
	 *
	 */
	public static final String $aprv_dt = "aprv_dt";
	/**
	 *  検査判定日.<p>
	 *
	 */
	public static final String $insp_judg_dt = "insp_judg_dt";
	/**
	 *  製造記録承認日.<p>
	 *
	 */
	public static final String $act_aprv_dt = "act_aprv_dt";
	/**
	 *  工場出荷承認区分.<p>
	 *
	 */
	public static final String $plnt_aprv_sts_typ = "plnt_aprv_sts_typ";
	/**
	 *  工場出荷承認区分名.<p>
	 *
	 */
	public static final String $plnt_aprv_sts_typ_nm = "plnt_aprv_sts_typ_nm";
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
	 *  承認者ＣＤ.<p>
	 *
	 */
	public static final String $aprv_usr_cd = "aprv_usr_cd";
	/**
	 *  承認者名.<p>
	 *
	 */
	public static final String $aprv_usr_nm = "aprv_usr_nm";
	/**
	 *  承認部門ＣＤ.<p>
	 *
	 */
	public static final String $aprv_dpt_cd = "aprv_dpt_cd";
	/**
	 *  承認部門名.<p>
	 *
	 */
	public static final String $aprv_dpt_nm = "aprv_dpt_nm";
	/**
	 *  承認理由.<p>
	 *
	 */
	public static final String $aprv_rsn = "aprv_rsn";
	/**
	 *  工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public static final String $site_cd = "site_cd";
	/**
	 *  工場・物流倉庫名.<p>
	 *
	 */
	public static final String $site_nm = "site_nm";


	public static final MCMeta plnt_aprv_no_META = createCommonMeta($plnt_aprv_no, mcframe.commonMA.meta.MA_META.PLNT_APRV_NO);
	public static final MCMeta prnt_tm_META = createCommonMeta($prnt_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta itm_nm_META = createCommonMeta($itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta itm_alt_nm1_META = createCommonMeta($itm_alt_nm1, mcframe.commonMA.meta.MA_META.ITM_ALT_NM1);
	public static final MCMeta itm_alt_nm2_META = createCommonMeta($itm_alt_nm2, mcframe.commonMA.meta.MA_META.ITM_ALT_NM2);
	public static final MCMeta itm_alt_nm3_META = createCommonMeta($itm_alt_nm3, mcframe.commonMA.meta.MA_META.ITM_ALT_NM3);
	public static final MCMeta itm_alt_nm4_META = createCommonMeta($itm_alt_nm4, mcframe.commonMA.meta.MA_META.ITM_ALT_NM4);
	public static final MCMeta ntfy_nm_META = createCommonMeta($ntfy_nm, mcframe.commonMA.meta.MA_META.NTFY_NM);
	public static final MCMeta lot_no_view_META = createCommonMeta($lot_no_view, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta lot_no_data_META = createCommonMeta($lot_no_data, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta sublot_no_lbl_META = createStringMeta($sublot_no_lbl);
	public static final MCMeta sublot_no_view_META = createCommonMeta($sublot_no_view, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta sublot_no_data_META = createCommonMeta($sublot_no_data, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta base_unit_qty_META = createCommonMeta($base_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta s_base_unit_qty_META = createStringMeta($s_base_unit_qty);
	public static final MCMeta base_unit_cd_META = createCommonMeta($base_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta base_unit_nm_META = createCommonMeta($base_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta base_dec_place_META = createCommonMeta($base_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta aprv_dt_META = createCommonMeta($aprv_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta insp_judg_dt_META = createCommonMeta($insp_judg_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta act_aprv_dt_META = createCommonMeta($act_aprv_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta plnt_aprv_sts_typ_META = createCommonMeta($plnt_aprv_sts_typ, mcframe.commonMS.meta.MS_META.PLNT_APRV_STS_TYP);
	public static final MCMeta plnt_aprv_sts_typ_nm_META = createStringMeta($plnt_aprv_sts_typ_nm);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.PLNT_APRV_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.PLNT_APRV_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.PLNT_APRV_SUB_CHAR3);
	public static final MCMeta aprv_usr_cd_META = createCommonMeta($aprv_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta aprv_usr_nm_META = createCommonMeta($aprv_usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta aprv_dpt_cd_META = createCommonMeta($aprv_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta aprv_dpt_nm_META = createCommonMeta($aprv_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta aprv_rsn_META = createCommonMeta($aprv_rsn, mcframe.commonMS.meta.MS_META.PLNT_APRV_RSN);
	public static final MCMeta site_cd_META = createCommonMeta($site_cd, mcframe.commonMA.meta.MA_META.SITE_CD);
	public static final MCMeta site_nm_META = createCommonMeta($site_nm, mcframe.commonMA.meta.MA_META.SITE_NM);

	protected static final ConstMetaList<PlntAprvHdrR> constMetas = new ConstMetaList<PlntAprvHdrR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			plnt_aprv_no_META,
			prnt_tm_META,
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			itm_nm_META,
			itm_alt_nm1_META,
			itm_alt_nm2_META,
			itm_alt_nm3_META,
			itm_alt_nm4_META,
			ntfy_nm_META,
			lot_no_view_META,
			lot_no_data_META,
			sublot_no_lbl_META,
			sublot_no_view_META,
			sublot_no_data_META,
			base_unit_qty_META,
			s_base_unit_qty_META,
			base_unit_cd_META,
			base_unit_nm_META,
			base_dec_place_META,
			aprv_dt_META,
			insp_judg_dt_META,
			act_aprv_dt_META,
			plnt_aprv_sts_typ_META,
			plnt_aprv_sts_typ_nm_META,
			sub_char1_META,
			sub_char2_META,
			sub_char3_META,
			aprv_usr_cd_META,
			aprv_usr_nm_META,
			aprv_dpt_cd_META,
			aprv_dpt_nm_META,
			aprv_rsn_META,
			site_cd_META,
			site_nm_META
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
	protected PlntAprvHdrR_MC_A(ConstMetaList<? extends PlntAprvHdrR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public PlntAprvHdrR clone() {
		return (PlntAprvHdrR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public PlntAprvHdrR createInstance() {
		return (PlntAprvHdrR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public PlntAprvHdrR getValues(String... names) {
		return (PlntAprvHdrR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 *  工場出荷承認ＮＯ.<p>
	 *
	 */
	public String plnt_aprv_no() {
		return getConstString(offset + 0, $plnt_aprv_no);
	}

	/**
	 *  工場出荷承認ＮＯ.<p>
	 *
	 */
	public void plnt_aprv_no(String value) {
		setConstString(offset + 0, $plnt_aprv_no, value);
	}


	/**
	 *  発行日時.<p>
	 *
	 */
	public MCDate prnt_tm() {
		return getConstDate(offset + 1, $prnt_tm);
	}

	/**
	 *  発行日時.<p>
	 *
	 */
	public void prnt_tm(MCDate value) {
		setConstDate(offset + 1, $prnt_tm, value);
	}


	/**
	 *  品目ＣＤ.<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 2, $itm_cd);
	}

	/**
	 *  品目ＣＤ.<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 2, $itm_cd, value);
	}


	/**
	 *  枝番１.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 3, $itm_sub1);
	}

	/**
	 *  枝番１.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 3, $itm_sub1, value);
	}


	/**
	 *  枝番２.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 4, $itm_sub2);
	}

	/**
	 *  枝番２.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 4, $itm_sub2, value);
	}


	/**
	 *  枝番３.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 5, $itm_sub3);
	}

	/**
	 *  枝番３.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 5, $itm_sub3, value);
	}


	/**
	 *  品名.<p>
	 *
	 */
	public String itm_nm() {
		return getConstString(offset + 6, $itm_nm);
	}

	/**
	 *  品名.<p>
	 *
	 */
	public void itm_nm(String value) {
		setConstString(offset + 6, $itm_nm, value);
	}


	/**
	 *  品目別名１.<p>
	 *
	 */
	public String itm_alt_nm1() {
		return getConstString(offset + 7, $itm_alt_nm1);
	}

	/**
	 *  品目別名１.<p>
	 *
	 */
	public void itm_alt_nm1(String value) {
		setConstString(offset + 7, $itm_alt_nm1, value);
	}


	/**
	 *  品目別名２.<p>
	 *
	 */
	public String itm_alt_nm2() {
		return getConstString(offset + 8, $itm_alt_nm2);
	}

	/**
	 *  品目別名２.<p>
	 *
	 */
	public void itm_alt_nm2(String value) {
		setConstString(offset + 8, $itm_alt_nm2, value);
	}


	/**
	 *  品目別名３.<p>
	 *
	 */
	public String itm_alt_nm3() {
		return getConstString(offset + 9, $itm_alt_nm3);
	}

	/**
	 *  品目別名３.<p>
	 *
	 */
	public void itm_alt_nm3(String value) {
		setConstString(offset + 9, $itm_alt_nm3, value);
	}


	/**
	 *  品目別名４.<p>
	 *
	 */
	public String itm_alt_nm4() {
		return getConstString(offset + 10, $itm_alt_nm4);
	}

	/**
	 *  品目別名４.<p>
	 *
	 */
	public void itm_alt_nm4(String value) {
		setConstString(offset + 10, $itm_alt_nm4, value);
	}


	/**
	 *  届出名.<p>
	 *
	 */
	public String ntfy_nm() {
		return getConstString(offset + 11, $ntfy_nm);
	}

	/**
	 *  届出名.<p>
	 *
	 */
	public void ntfy_nm(String value) {
		setConstString(offset + 11, $ntfy_nm, value);
	}


	/**
	 *  ロットＮＯ (表示用).<p>
	 *
	 */
	public String lot_no_view() {
		return getConstString(offset + 12, $lot_no_view);
	}

	/**
	 *  ロットＮＯ (表示用).<p>
	 *
	 */
	public void lot_no_view(String value) {
		setConstString(offset + 12, $lot_no_view, value);
	}


	/**
	 *  ロットＮＯ (データ用).<p>
	 *
	 */
	public String lot_no_data() {
		return getConstString(offset + 13, $lot_no_data);
	}

	/**
	 *  ロットＮＯ (データ用).<p>
	 *
	 */
	public void lot_no_data(String value) {
		setConstString(offset + 13, $lot_no_data, value);
	}


	/**
	 *  サブロットＮＯ（ラベル）.<p>
	 *
	 */
	public String sublot_no_lbl() {
		return getConstString(offset + 14, $sublot_no_lbl);
	}

	/**
	 *  サブロットＮＯ（ラベル）.<p>
	 *
	 */
	public void sublot_no_lbl(String value) {
		setConstString(offset + 14, $sublot_no_lbl, value);
	}


	/**
	 *  サブロットＮＯ (表示用).<p>
	 *
	 */
	public String sublot_no_view() {
		return getConstString(offset + 15, $sublot_no_view);
	}

	/**
	 *  サブロットＮＯ (表示用).<p>
	 *
	 */
	public void sublot_no_view(String value) {
		setConstString(offset + 15, $sublot_no_view, value);
	}


	/**
	 *  サブロットＮＯ (データ用).<p>
	 *
	 */
	public String sublot_no_data() {
		return getConstString(offset + 16, $sublot_no_data);
	}

	/**
	 *  サブロットＮＯ (データ用).<p>
	 *
	 */
	public void sublot_no_data(String value) {
		setConstString(offset + 16, $sublot_no_data, value);
	}


	/**
	 *  数量.<p>
	 *
	 */
	public MCNumber base_unit_qty() {
		return getConstNumber(offset + 17, $base_unit_qty);
	}

	/**
	 *  数量.<p>
	 *
	 */
	public void base_unit_qty(MCNumber value) {
		setConstNumber(offset + 17, $base_unit_qty, value);
	}

	/**
	 *  数量.<p>
	 *
	 */
	public void base_unit_qty(int value) {
		setConstNumber(offset + 17, $base_unit_qty, value);
	}

	/**
	 *  数量.<p>
	 *
	 */
	public void base_unit_qty(long value) {
		setConstNumber(offset + 17, $base_unit_qty, value);
	}

	/**
	 *  数量.<p>
	 *
	 */
	public void base_unit_qty(float value) {
		setConstNumber(offset + 17, $base_unit_qty, value);
	}

	/**
	 *  数量.<p>
	 *
	 */
	public void base_unit_qty(double value) {
		setConstNumber(offset + 17, $base_unit_qty, value);
	}


	/**
	 *  数量文字列.<p>
	 *
	 */
	public String s_base_unit_qty() {
		return getConstString(offset + 18, $s_base_unit_qty);
	}

	/**
	 *  数量文字列.<p>
	 *
	 */
	public void s_base_unit_qty(String value) {
		setConstString(offset + 18, $s_base_unit_qty, value);
	}


	/**
	 *  単位ＣＤ.<p>
	 *
	 */
	public String base_unit_cd() {
		return getConstString(offset + 19, $base_unit_cd);
	}

	/**
	 *  単位ＣＤ.<p>
	 *
	 */
	public void base_unit_cd(String value) {
		setConstString(offset + 19, $base_unit_cd, value);
	}


	/**
	 *  単位名.<p>
	 *
	 */
	public String base_unit_nm() {
		return getConstString(offset + 20, $base_unit_nm);
	}

	/**
	 *  単位名.<p>
	 *
	 */
	public void base_unit_nm(String value) {
		setConstString(offset + 20, $base_unit_nm, value);
	}


	/**
	 *  小数部有効桁数.<p>
	 *
	 */
	public MCNumber base_dec_place() {
		return getConstNumber(offset + 21, $base_dec_place);
	}

	/**
	 *  小数部有効桁数.<p>
	 *
	 */
	public void base_dec_place(MCNumber value) {
		setConstNumber(offset + 21, $base_dec_place, value);
	}

	/**
	 *  小数部有効桁数.<p>
	 *
	 */
	public void base_dec_place(int value) {
		setConstNumber(offset + 21, $base_dec_place, value);
	}

	/**
	 *  小数部有効桁数.<p>
	 *
	 */
	public void base_dec_place(long value) {
		setConstNumber(offset + 21, $base_dec_place, value);
	}

	/**
	 *  小数部有効桁数.<p>
	 *
	 */
	public void base_dec_place(float value) {
		setConstNumber(offset + 21, $base_dec_place, value);
	}

	/**
	 *  小数部有効桁数.<p>
	 *
	 */
	public void base_dec_place(double value) {
		setConstNumber(offset + 21, $base_dec_place, value);
	}


	/**
	 *  出荷承認日.<p>
	 *
	 */
	public MCDate aprv_dt() {
		return getConstDate(offset + 22, $aprv_dt);
	}

	/**
	 *  出荷承認日.<p>
	 *
	 */
	public void aprv_dt(MCDate value) {
		setConstDate(offset + 22, $aprv_dt, value);
	}


	/**
	 *  検査判定日.<p>
	 *
	 */
	public MCDate insp_judg_dt() {
		return getConstDate(offset + 23, $insp_judg_dt);
	}

	/**
	 *  検査判定日.<p>
	 *
	 */
	public void insp_judg_dt(MCDate value) {
		setConstDate(offset + 23, $insp_judg_dt, value);
	}


	/**
	 *  製造記録承認日.<p>
	 *
	 */
	public MCDate act_aprv_dt() {
		return getConstDate(offset + 24, $act_aprv_dt);
	}

	/**
	 *  製造記録承認日.<p>
	 *
	 */
	public void act_aprv_dt(MCDate value) {
		setConstDate(offset + 24, $act_aprv_dt, value);
	}


	/**
	 *  工場出荷承認区分.<p>
	 *
	 */
	public String plnt_aprv_sts_typ() {
		return getConstString(offset + 25, $plnt_aprv_sts_typ);
	}

	/**
	 *  工場出荷承認区分.<p>
	 *
	 */
	public void plnt_aprv_sts_typ(String value) {
		setConstString(offset + 25, $plnt_aprv_sts_typ, value);
	}


	/**
	 *  工場出荷承認区分名.<p>
	 *
	 */
	public String plnt_aprv_sts_typ_nm() {
		return getConstString(offset + 26, $plnt_aprv_sts_typ_nm);
	}

	/**
	 *  工場出荷承認区分名.<p>
	 *
	 */
	public void plnt_aprv_sts_typ_nm(String value) {
		setConstString(offset + 26, $plnt_aprv_sts_typ_nm, value);
	}


	/**
	 *  予備１.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 27, $sub_char1);
	}

	/**
	 *  予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 27, $sub_char1, value);
	}


	/**
	 *  予備２.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 28, $sub_char2);
	}

	/**
	 *  予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 28, $sub_char2, value);
	}


	/**
	 *  予備３.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 29, $sub_char3);
	}

	/**
	 *  予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 29, $sub_char3, value);
	}


	/**
	 *  承認者ＣＤ.<p>
	 *
	 */
	public String aprv_usr_cd() {
		return getConstString(offset + 30, $aprv_usr_cd);
	}

	/**
	 *  承認者ＣＤ.<p>
	 *
	 */
	public void aprv_usr_cd(String value) {
		setConstString(offset + 30, $aprv_usr_cd, value);
	}


	/**
	 *  承認者名.<p>
	 *
	 */
	public String aprv_usr_nm() {
		return getConstString(offset + 31, $aprv_usr_nm);
	}

	/**
	 *  承認者名.<p>
	 *
	 */
	public void aprv_usr_nm(String value) {
		setConstString(offset + 31, $aprv_usr_nm, value);
	}


	/**
	 *  承認部門ＣＤ.<p>
	 *
	 */
	public String aprv_dpt_cd() {
		return getConstString(offset + 32, $aprv_dpt_cd);
	}

	/**
	 *  承認部門ＣＤ.<p>
	 *
	 */
	public void aprv_dpt_cd(String value) {
		setConstString(offset + 32, $aprv_dpt_cd, value);
	}


	/**
	 *  承認部門名.<p>
	 *
	 */
	public String aprv_dpt_nm() {
		return getConstString(offset + 33, $aprv_dpt_nm);
	}

	/**
	 *  承認部門名.<p>
	 *
	 */
	public void aprv_dpt_nm(String value) {
		setConstString(offset + 33, $aprv_dpt_nm, value);
	}


	/**
	 *  承認理由.<p>
	 *
	 */
	public String aprv_rsn() {
		return getConstString(offset + 34, $aprv_rsn);
	}

	/**
	 *  承認理由.<p>
	 *
	 */
	public void aprv_rsn(String value) {
		setConstString(offset + 34, $aprv_rsn, value);
	}


	/**
	 *  工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public String site_cd() {
		return getConstString(offset + 35, $site_cd);
	}

	/**
	 *  工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public void site_cd(String value) {
		setConstString(offset + 35, $site_cd, value);
	}


	/**
	 *  工場・物流倉庫名.<p>
	 *
	 */
	public String site_nm() {
		return getConstString(offset + 36, $site_nm);
	}

	/**
	 *  工場・物流倉庫名.<p>
	 *
	 */
	public void site_nm(String value) {
		setConstString(offset + 36, $site_nm, value);
	}


	public String getString(String name) {
		if ($plnt_aprv_no.equalsIgnoreCase(name)) {
			return plnt_aprv_no();
		}
		if ($itm_cd.equalsIgnoreCase(name)) {
			return itm_cd();
		}
		if ($itm_sub1.equalsIgnoreCase(name)) {
			return itm_sub1();
		}
		if ($itm_sub2.equalsIgnoreCase(name)) {
			return itm_sub2();
		}
		if ($itm_sub3.equalsIgnoreCase(name)) {
			return itm_sub3();
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
		if ($ntfy_nm.equalsIgnoreCase(name)) {
			return ntfy_nm();
		}
		if ($lot_no_view.equalsIgnoreCase(name)) {
			return lot_no_view();
		}
		if ($lot_no_data.equalsIgnoreCase(name)) {
			return lot_no_data();
		}
		if ($sublot_no_lbl.equalsIgnoreCase(name)) {
			return sublot_no_lbl();
		}
		if ($sublot_no_view.equalsIgnoreCase(name)) {
			return sublot_no_view();
		}
		if ($sublot_no_data.equalsIgnoreCase(name)) {
			return sublot_no_data();
		}
		if ($s_base_unit_qty.equalsIgnoreCase(name)) {
			return s_base_unit_qty();
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			return base_unit_nm();
		}
		if ($plnt_aprv_sts_typ.equalsIgnoreCase(name)) {
			return plnt_aprv_sts_typ();
		}
		if ($plnt_aprv_sts_typ_nm.equalsIgnoreCase(name)) {
			return plnt_aprv_sts_typ_nm();
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
		if ($aprv_usr_cd.equalsIgnoreCase(name)) {
			return aprv_usr_cd();
		}
		if ($aprv_usr_nm.equalsIgnoreCase(name)) {
			return aprv_usr_nm();
		}
		if ($aprv_dpt_cd.equalsIgnoreCase(name)) {
			return aprv_dpt_cd();
		}
		if ($aprv_dpt_nm.equalsIgnoreCase(name)) {
			return aprv_dpt_nm();
		}
		if ($aprv_rsn.equalsIgnoreCase(name)) {
			return aprv_rsn();
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			return site_cd();
		}
		if ($site_nm.equalsIgnoreCase(name)) {
			return site_nm();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			return base_unit_qty();
		}
		if ($base_dec_place.equalsIgnoreCase(name)) {
			return base_dec_place();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($prnt_tm.equalsIgnoreCase(name)) {
			return prnt_tm();
		}
		if ($aprv_dt.equalsIgnoreCase(name)) {
			return aprv_dt();
		}
		if ($insp_judg_dt.equalsIgnoreCase(name)) {
			return insp_judg_dt();
		}
		if ($act_aprv_dt.equalsIgnoreCase(name)) {
			return act_aprv_dt();
		}
		return super.getDate(name);
	}

	public String getStringNE(String name) {
		if ($plnt_aprv_no.equalsIgnoreCase(name)) {
			return plnt_aprv_no();
		}
		if ($itm_cd.equalsIgnoreCase(name)) {
			return itm_cd();
		}
		if ($itm_sub1.equalsIgnoreCase(name)) {
			return itm_sub1();
		}
		if ($itm_sub2.equalsIgnoreCase(name)) {
			return itm_sub2();
		}
		if ($itm_sub3.equalsIgnoreCase(name)) {
			return itm_sub3();
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
		if ($ntfy_nm.equalsIgnoreCase(name)) {
			return ntfy_nm();
		}
		if ($lot_no_view.equalsIgnoreCase(name)) {
			return lot_no_view();
		}
		if ($lot_no_data.equalsIgnoreCase(name)) {
			return lot_no_data();
		}
		if ($sublot_no_lbl.equalsIgnoreCase(name)) {
			return sublot_no_lbl();
		}
		if ($sublot_no_view.equalsIgnoreCase(name)) {
			return sublot_no_view();
		}
		if ($sublot_no_data.equalsIgnoreCase(name)) {
			return sublot_no_data();
		}
		if ($s_base_unit_qty.equalsIgnoreCase(name)) {
			return s_base_unit_qty();
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			return base_unit_nm();
		}
		if ($plnt_aprv_sts_typ.equalsIgnoreCase(name)) {
			return plnt_aprv_sts_typ();
		}
		if ($plnt_aprv_sts_typ_nm.equalsIgnoreCase(name)) {
			return plnt_aprv_sts_typ_nm();
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
		if ($aprv_usr_cd.equalsIgnoreCase(name)) {
			return aprv_usr_cd();
		}
		if ($aprv_usr_nm.equalsIgnoreCase(name)) {
			return aprv_usr_nm();
		}
		if ($aprv_dpt_cd.equalsIgnoreCase(name)) {
			return aprv_dpt_cd();
		}
		if ($aprv_dpt_nm.equalsIgnoreCase(name)) {
			return aprv_dpt_nm();
		}
		if ($aprv_rsn.equalsIgnoreCase(name)) {
			return aprv_rsn();
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			return site_cd();
		}
		if ($site_nm.equalsIgnoreCase(name)) {
			return site_nm();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			return base_unit_qty();
		}
		if ($base_dec_place.equalsIgnoreCase(name)) {
			return base_dec_place();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($prnt_tm.equalsIgnoreCase(name)) {
			return prnt_tm();
		}
		if ($aprv_dt.equalsIgnoreCase(name)) {
			return aprv_dt();
		}
		if ($insp_judg_dt.equalsIgnoreCase(name)) {
			return insp_judg_dt();
		}
		if ($act_aprv_dt.equalsIgnoreCase(name)) {
			return act_aprv_dt();
		}
		return super.getDateNE(name);
	}

	public void setString(String name, String value) {
		if ($plnt_aprv_no.equalsIgnoreCase(name)) {
			plnt_aprv_no(value);
			return;
		}
		if ($itm_cd.equalsIgnoreCase(name)) {
			itm_cd(value);
			return;
		}
		if ($itm_sub1.equalsIgnoreCase(name)) {
			itm_sub1(value);
			return;
		}
		if ($itm_sub2.equalsIgnoreCase(name)) {
			itm_sub2(value);
			return;
		}
		if ($itm_sub3.equalsIgnoreCase(name)) {
			itm_sub3(value);
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
		if ($ntfy_nm.equalsIgnoreCase(name)) {
			ntfy_nm(value);
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
		if ($sublot_no_lbl.equalsIgnoreCase(name)) {
			sublot_no_lbl(value);
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
		if ($s_base_unit_qty.equalsIgnoreCase(name)) {
			s_base_unit_qty(value);
			return;
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			base_unit_cd(value);
			return;
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			base_unit_nm(value);
			return;
		}
		if ($plnt_aprv_sts_typ.equalsIgnoreCase(name)) {
			plnt_aprv_sts_typ(value);
			return;
		}
		if ($plnt_aprv_sts_typ_nm.equalsIgnoreCase(name)) {
			plnt_aprv_sts_typ_nm(value);
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
		if ($aprv_usr_cd.equalsIgnoreCase(name)) {
			aprv_usr_cd(value);
			return;
		}
		if ($aprv_usr_nm.equalsIgnoreCase(name)) {
			aprv_usr_nm(value);
			return;
		}
		if ($aprv_dpt_cd.equalsIgnoreCase(name)) {
			aprv_dpt_cd(value);
			return;
		}
		if ($aprv_dpt_nm.equalsIgnoreCase(name)) {
			aprv_dpt_nm(value);
			return;
		}
		if ($aprv_rsn.equalsIgnoreCase(name)) {
			aprv_rsn(value);
			return;
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			site_cd(value);
			return;
		}
		if ($site_nm.equalsIgnoreCase(name)) {
			site_nm(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($base_dec_place.equalsIgnoreCase(name)) {
			base_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($base_dec_place.equalsIgnoreCase(name)) {
			base_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($base_dec_place.equalsIgnoreCase(name)) {
			base_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($base_dec_place.equalsIgnoreCase(name)) {
			base_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($base_dec_place.equalsIgnoreCase(name)) {
			base_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($prnt_tm.equalsIgnoreCase(name)) {
			prnt_tm(value);
			return;
		}
		if ($aprv_dt.equalsIgnoreCase(name)) {
			aprv_dt(value);
			return;
		}
		if ($insp_judg_dt.equalsIgnoreCase(name)) {
			insp_judg_dt(value);
			return;
		}
		if ($act_aprv_dt.equalsIgnoreCase(name)) {
			act_aprv_dt(value);
			return;
		}
		super.setDate(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($plnt_aprv_no.equalsIgnoreCase(name)) {
			plnt_aprv_no(value);
			return;
		}
		if ($itm_cd.equalsIgnoreCase(name)) {
			itm_cd(value);
			return;
		}
		if ($itm_sub1.equalsIgnoreCase(name)) {
			itm_sub1(value);
			return;
		}
		if ($itm_sub2.equalsIgnoreCase(name)) {
			itm_sub2(value);
			return;
		}
		if ($itm_sub3.equalsIgnoreCase(name)) {
			itm_sub3(value);
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
		if ($ntfy_nm.equalsIgnoreCase(name)) {
			ntfy_nm(value);
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
		if ($sublot_no_lbl.equalsIgnoreCase(name)) {
			sublot_no_lbl(value);
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
		if ($s_base_unit_qty.equalsIgnoreCase(name)) {
			s_base_unit_qty(value);
			return;
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			base_unit_cd(value);
			return;
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			base_unit_nm(value);
			return;
		}
		if ($plnt_aprv_sts_typ.equalsIgnoreCase(name)) {
			plnt_aprv_sts_typ(value);
			return;
		}
		if ($plnt_aprv_sts_typ_nm.equalsIgnoreCase(name)) {
			plnt_aprv_sts_typ_nm(value);
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
		if ($aprv_usr_cd.equalsIgnoreCase(name)) {
			aprv_usr_cd(value);
			return;
		}
		if ($aprv_usr_nm.equalsIgnoreCase(name)) {
			aprv_usr_nm(value);
			return;
		}
		if ($aprv_dpt_cd.equalsIgnoreCase(name)) {
			aprv_dpt_cd(value);
			return;
		}
		if ($aprv_dpt_nm.equalsIgnoreCase(name)) {
			aprv_dpt_nm(value);
			return;
		}
		if ($aprv_rsn.equalsIgnoreCase(name)) {
			aprv_rsn(value);
			return;
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			site_cd(value);
			return;
		}
		if ($site_nm.equalsIgnoreCase(name)) {
			site_nm(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($base_dec_place.equalsIgnoreCase(name)) {
			base_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($base_dec_place.equalsIgnoreCase(name)) {
			base_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($base_dec_place.equalsIgnoreCase(name)) {
			base_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($base_dec_place.equalsIgnoreCase(name)) {
			base_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($base_dec_place.equalsIgnoreCase(name)) {
			base_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($prnt_tm.equalsIgnoreCase(name)) {
			prnt_tm(value);
			return;
		}
		if ($aprv_dt.equalsIgnoreCase(name)) {
			aprv_dt(value);
			return;
		}
		if ($insp_judg_dt.equalsIgnoreCase(name)) {
			insp_judg_dt(value);
			return;
		}
		if ($act_aprv_dt.equalsIgnoreCase(name)) {
			act_aprv_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}



}

