package mcframe.commonMSBF.MSBFR0050;

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
 * ブロック"MrktJudgHdr"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class MrktJudgHdrR_MC_A extends MCConstRow {

	/**
	 *  発行日時.<p>
	 *
	 */
	public static final String $prnt_tm = "prnt_tm";
	/**
	 *  市場出荷判定ＮＯ.<p>
	 *
	 */
	public static final String $mrkt_judg_no = "mrkt_judg_no";
	/**
	 *  販売品名.<p>
	 *
	 */
	public static final String $itm_nm = "itm_nm";
	/**
	 *  販売品目別名１.<p>
	 *
	 */
	public static final String $itm_alt_nm1 = "itm_alt_nm1";
	/**
	 *  販売品目別名２.<p>
	 *
	 */
	public static final String $itm_alt_nm2 = "itm_alt_nm2";
	/**
	 *  販売品目別名３.<p>
	 *
	 */
	public static final String $itm_alt_nm3 = "itm_alt_nm3";
	/**
	 *  販売品目別名４.<p>
	 *
	 */
	public static final String $itm_alt_nm4 = "itm_alt_nm4";
	/**
	 *  届出名.<p>
	 *
	 */
	public static final String $ntfy_nm = "ntfy_nm";
	/**
	 *  ロットＮＯ(表示用).<p>
	 *
	 */
	public static final String $lot_no_view = "lot_no_view";
	/**
	 *  ロットＮＯ(データ用).<p>
	 *
	 */
	public static final String $lot_no_data = "lot_no_data";
	/**
	 *  数量.<p>
	 *
	 */
	public static final String $base_unit_qty = "base_unit_qty";
	/**
	 *  数量文字列.<p>
	 *
	 */
	public static final String $s_unit_qty = "s_unit_qty";
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
	 *  判定結果区分.<p>
	 *
	 */
	public static final String $mrkt_judg_sts_typ = "mrkt_judg_sts_typ";
	/**
	 *  判定結果区分名.<p>
	 *
	 */
	public static final String $mrkt_judg_sts_typ_nm = "mrkt_judg_sts_typ_nm";
	/**
	 *  判定日.<p>
	 *
	 */
	public static final String $judg_dt = "judg_dt";
	/**
	 *  判定者ＣＤ.<p>
	 *
	 */
	public static final String $judg_usr_cd = "judg_usr_cd";
	/**
	 *  判定者名.<p>
	 *
	 */
	public static final String $judg_usr_nm = "judg_usr_nm";
	/**
	 *  判定部門ＣＤ.<p>
	 *
	 */
	public static final String $judg_dpt_cd = "judg_dpt_cd";
	/**
	 *  判定部門名.<p>
	 *
	 */
	public static final String $judg_dpt_nm = "judg_dpt_nm";
	/**
	 *  製造所からの出荷承認結果.<p>
	 *
	 */
	public static final String $mfg_so_aprv_typ = "mfg_so_aprv_typ";
	/**
	 *  製造所からの出荷承認結果名.<p>
	 *
	 */
	public static final String $mfg_so_aprv_typ_nm = "mfg_so_aprv_typ_nm";
	/**
	 *  品質管理結果.<p>
	 *
	 */
	public static final String $quality_mng_typ = "quality_mng_typ";
	/**
	 *  品質管理結果名.<p>
	 *
	 */
	public static final String $quality_mng_typ_nm = "quality_mng_typ_nm";
	/**
	 *  製造管理結果.<p>
	 *
	 */
	public static final String $mfg_mng_typ = "mfg_mng_typ";
	/**
	 *  製造管理結果名.<p>
	 *
	 */
	public static final String $mfg_mng_typ_nm = "mfg_mng_typ_nm";
	/**
	 *  逸脱有無.<p>
	 *
	 */
	public static final String $deviant_typ = "deviant_typ";
	/**
	 *  逸脱有無名.<p>
	 *
	 */
	public static final String $deviant_typ_nm = "deviant_typ_nm";
	/**
	 *  逸脱措置.<p>
	 *
	 */
	public static final String $deviant_msr_typ = "deviant_msr_typ";
	/**
	 *  逸脱措置名.<p>
	 *
	 */
	public static final String $deviant_msr_typ_nm = "deviant_msr_typ_nm";
	/**
	 *  製品の品質有無.<p>
	 *
	 */
	public static final String $prod_itm_info_typ = "prod_itm_info_typ";
	/**
	 *  製品の品質有無名.<p>
	 *
	 */
	public static final String $prod_itm_info_typ_nm = "prod_itm_info_typ_nm";
	/**
	 *  原材料の品質有無.<p>
	 *
	 */
	public static final String $chd_itm_info_typ = "chd_itm_info_typ";
	/**
	 *  原材料の品質有無名.<p>
	 *
	 */
	public static final String $chd_itm_info_typ_nm = "chd_itm_info_typ_nm";
	/**
	 *  理由.<p>
	 *
	 */
	public static final String $judg_rsn = "judg_rsn";
	/**
	 *  特記事項.<p>
	 *
	 */
	public static final String $intr_rmrks = "intr_rmrks";
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
	 *  出荷元工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public static final String $site_cd = "site_cd";
	/**
	 *  出荷元工場・物流倉庫名.<p>
	 *
	 */
	public static final String $site_nm = "site_nm";


	public static final MCMeta prnt_tm_META = createCommonMeta($prnt_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta mrkt_judg_no_META = createCommonMeta($mrkt_judg_no, mcframe.commonMA.meta.MA_META.MRKT_JUDG_NO);
	public static final MCMeta itm_nm_META = createCommonMeta($itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta itm_alt_nm1_META = createCommonMeta($itm_alt_nm1, mcframe.commonMA.meta.MA_META.ITM_ALT_NM1);
	public static final MCMeta itm_alt_nm2_META = createCommonMeta($itm_alt_nm2, mcframe.commonMA.meta.MA_META.ITM_ALT_NM2);
	public static final MCMeta itm_alt_nm3_META = createCommonMeta($itm_alt_nm3, mcframe.commonMA.meta.MA_META.ITM_ALT_NM3);
	public static final MCMeta itm_alt_nm4_META = createCommonMeta($itm_alt_nm4, mcframe.commonMA.meta.MA_META.ITM_ALT_NM4);
	public static final MCMeta ntfy_nm_META = createCommonMeta($ntfy_nm, mcframe.commonMA.meta.MA_META.NTFY_NM);
	public static final MCMeta lot_no_view_META = createCommonMeta($lot_no_view, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta lot_no_data_META = createCommonMeta($lot_no_data, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta base_unit_qty_META = createCommonMeta($base_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta s_unit_qty_META = createStringMeta($s_unit_qty);
	public static final MCMeta base_unit_cd_META = createCommonMeta($base_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta base_unit_nm_META = createStringMeta($base_unit_nm);
	public static final MCMeta base_dec_place_META = createCommonMeta($base_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta mrkt_judg_sts_typ_META = createCommonMeta($mrkt_judg_sts_typ, mcframe.commonMS.meta.MS_META.MRKT_JUDG_STS_TYP);
	public static final MCMeta mrkt_judg_sts_typ_nm_META = createStringMeta($mrkt_judg_sts_typ_nm);
	public static final MCMeta judg_dt_META = createCommonMeta($judg_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta judg_usr_cd_META = createCommonMeta($judg_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta judg_usr_nm_META = createStringMeta($judg_usr_nm);
	public static final MCMeta judg_dpt_cd_META = createCommonMeta($judg_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta judg_dpt_nm_META = createStringMeta($judg_dpt_nm);
	public static final MCMeta mfg_so_aprv_typ_META = createCommonMeta($mfg_so_aprv_typ, mcframe.commonMS.meta.MS_META.MFG_SO_APRV_TYP);
	public static final MCMeta mfg_so_aprv_typ_nm_META = createStringMeta($mfg_so_aprv_typ_nm);
	public static final MCMeta quality_mng_typ_META = createCommonMeta($quality_mng_typ, mcframe.commonMS.meta.MS_META.QUALITY_MNG_TYP);
	public static final MCMeta quality_mng_typ_nm_META = createStringMeta($quality_mng_typ_nm);
	public static final MCMeta mfg_mng_typ_META = createCommonMeta($mfg_mng_typ, mcframe.commonMS.meta.MS_META.MFG_MNG_TYP);
	public static final MCMeta mfg_mng_typ_nm_META = createStringMeta($mfg_mng_typ_nm);
	public static final MCMeta deviant_typ_META = createCommonMeta($deviant_typ, mcframe.commonMS.meta.MS_META.DEVIANT_TYP);
	public static final MCMeta deviant_typ_nm_META = createStringMeta($deviant_typ_nm);
	public static final MCMeta deviant_msr_typ_META = createCommonMeta($deviant_msr_typ, mcframe.commonMS.meta.MS_META.DEVIANT_MSR_TYP);
	public static final MCMeta deviant_msr_typ_nm_META = createStringMeta($deviant_msr_typ_nm);
	public static final MCMeta prod_itm_info_typ_META = createCommonMeta($prod_itm_info_typ, mcframe.commonMS.meta.MS_META.PROD_ITM_INFO_TYP);
	public static final MCMeta prod_itm_info_typ_nm_META = createStringMeta($prod_itm_info_typ_nm);
	public static final MCMeta chd_itm_info_typ_META = createCommonMeta($chd_itm_info_typ, mcframe.commonMS.meta.MS_META.CHD_ITM_INFO_TYP);
	public static final MCMeta chd_itm_info_typ_nm_META = createStringMeta($chd_itm_info_typ_nm);
	public static final MCMeta judg_rsn_META = createCommonMeta($judg_rsn, mcframe.commonMS.meta.MS_META.MRKT_JUDG_RSN);
	public static final MCMeta intr_rmrks_META = createCommonMeta($intr_rmrks, mcframe.commonMS.meta.MS_META.MRKT_JUDG_INTR_RMRKS);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.MRKT_JUDG_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.MRKT_JUDG_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.MRKT_JUDG_SUB_CHAR3);
	public static final MCMeta site_cd_META = createCommonMeta($site_cd, mcframe.commonMA.meta.MA_META.SITE_CD);
	public static final MCMeta site_nm_META = createCommonMeta($site_nm, mcframe.commonMA.meta.MA_META.SITE_NM);

	protected static final ConstMetaList<MrktJudgHdrR> constMetas = new ConstMetaList<MrktJudgHdrR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			prnt_tm_META,
			mrkt_judg_no_META,
			itm_nm_META,
			itm_alt_nm1_META,
			itm_alt_nm2_META,
			itm_alt_nm3_META,
			itm_alt_nm4_META,
			ntfy_nm_META,
			lot_no_view_META,
			lot_no_data_META,
			base_unit_qty_META,
			s_unit_qty_META,
			base_unit_cd_META,
			base_unit_nm_META,
			base_dec_place_META,
			mrkt_judg_sts_typ_META,
			mrkt_judg_sts_typ_nm_META,
			judg_dt_META,
			judg_usr_cd_META,
			judg_usr_nm_META,
			judg_dpt_cd_META,
			judg_dpt_nm_META,
			mfg_so_aprv_typ_META,
			mfg_so_aprv_typ_nm_META,
			quality_mng_typ_META,
			quality_mng_typ_nm_META,
			mfg_mng_typ_META,
			mfg_mng_typ_nm_META,
			deviant_typ_META,
			deviant_typ_nm_META,
			deviant_msr_typ_META,
			deviant_msr_typ_nm_META,
			prod_itm_info_typ_META,
			prod_itm_info_typ_nm_META,
			chd_itm_info_typ_META,
			chd_itm_info_typ_nm_META,
			judg_rsn_META,
			intr_rmrks_META,
			sub_char1_META,
			sub_char2_META,
			sub_char3_META,
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
	protected MrktJudgHdrR_MC_A(ConstMetaList<? extends MrktJudgHdrR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MrktJudgHdrR clone() {
		return (MrktJudgHdrR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MrktJudgHdrR createInstance() {
		return (MrktJudgHdrR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MrktJudgHdrR getValues(String... names) {
		return (MrktJudgHdrR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 *  発行日時.<p>
	 *
	 */
	public MCDate prnt_tm() {
		return getConstDate(offset + 0, $prnt_tm);
	}

	/**
	 *  発行日時.<p>
	 *
	 */
	public void prnt_tm(MCDate value) {
		setConstDate(offset + 0, $prnt_tm, value);
	}


	/**
	 *  市場出荷判定ＮＯ.<p>
	 *
	 */
	public String mrkt_judg_no() {
		return getConstString(offset + 1, $mrkt_judg_no);
	}

	/**
	 *  市場出荷判定ＮＯ.<p>
	 *
	 */
	public void mrkt_judg_no(String value) {
		setConstString(offset + 1, $mrkt_judg_no, value);
	}


	/**
	 *  販売品名.<p>
	 *
	 */
	public String itm_nm() {
		return getConstString(offset + 2, $itm_nm);
	}

	/**
	 *  販売品名.<p>
	 *
	 */
	public void itm_nm(String value) {
		setConstString(offset + 2, $itm_nm, value);
	}


	/**
	 *  販売品目別名１.<p>
	 *
	 */
	public String itm_alt_nm1() {
		return getConstString(offset + 3, $itm_alt_nm1);
	}

	/**
	 *  販売品目別名１.<p>
	 *
	 */
	public void itm_alt_nm1(String value) {
		setConstString(offset + 3, $itm_alt_nm1, value);
	}


	/**
	 *  販売品目別名２.<p>
	 *
	 */
	public String itm_alt_nm2() {
		return getConstString(offset + 4, $itm_alt_nm2);
	}

	/**
	 *  販売品目別名２.<p>
	 *
	 */
	public void itm_alt_nm2(String value) {
		setConstString(offset + 4, $itm_alt_nm2, value);
	}


	/**
	 *  販売品目別名３.<p>
	 *
	 */
	public String itm_alt_nm3() {
		return getConstString(offset + 5, $itm_alt_nm3);
	}

	/**
	 *  販売品目別名３.<p>
	 *
	 */
	public void itm_alt_nm3(String value) {
		setConstString(offset + 5, $itm_alt_nm3, value);
	}


	/**
	 *  販売品目別名４.<p>
	 *
	 */
	public String itm_alt_nm4() {
		return getConstString(offset + 6, $itm_alt_nm4);
	}

	/**
	 *  販売品目別名４.<p>
	 *
	 */
	public void itm_alt_nm4(String value) {
		setConstString(offset + 6, $itm_alt_nm4, value);
	}


	/**
	 *  届出名.<p>
	 *
	 */
	public String ntfy_nm() {
		return getConstString(offset + 7, $ntfy_nm);
	}

	/**
	 *  届出名.<p>
	 *
	 */
	public void ntfy_nm(String value) {
		setConstString(offset + 7, $ntfy_nm, value);
	}


	/**
	 *  ロットＮＯ(表示用).<p>
	 *
	 */
	public String lot_no_view() {
		return getConstString(offset + 8, $lot_no_view);
	}

	/**
	 *  ロットＮＯ(表示用).<p>
	 *
	 */
	public void lot_no_view(String value) {
		setConstString(offset + 8, $lot_no_view, value);
	}


	/**
	 *  ロットＮＯ(データ用).<p>
	 *
	 */
	public String lot_no_data() {
		return getConstString(offset + 9, $lot_no_data);
	}

	/**
	 *  ロットＮＯ(データ用).<p>
	 *
	 */
	public void lot_no_data(String value) {
		setConstString(offset + 9, $lot_no_data, value);
	}


	/**
	 *  数量.<p>
	 *
	 */
	public MCNumber base_unit_qty() {
		return getConstNumber(offset + 10, $base_unit_qty);
	}

	/**
	 *  数量.<p>
	 *
	 */
	public void base_unit_qty(MCNumber value) {
		setConstNumber(offset + 10, $base_unit_qty, value);
	}

	/**
	 *  数量.<p>
	 *
	 */
	public void base_unit_qty(int value) {
		setConstNumber(offset + 10, $base_unit_qty, value);
	}

	/**
	 *  数量.<p>
	 *
	 */
	public void base_unit_qty(long value) {
		setConstNumber(offset + 10, $base_unit_qty, value);
	}

	/**
	 *  数量.<p>
	 *
	 */
	public void base_unit_qty(float value) {
		setConstNumber(offset + 10, $base_unit_qty, value);
	}

	/**
	 *  数量.<p>
	 *
	 */
	public void base_unit_qty(double value) {
		setConstNumber(offset + 10, $base_unit_qty, value);
	}


	/**
	 *  数量文字列.<p>
	 *
	 */
	public String s_unit_qty() {
		return getConstString(offset + 11, $s_unit_qty);
	}

	/**
	 *  数量文字列.<p>
	 *
	 */
	public void s_unit_qty(String value) {
		setConstString(offset + 11, $s_unit_qty, value);
	}


	/**
	 *  単位ＣＤ.<p>
	 *
	 */
	public String base_unit_cd() {
		return getConstString(offset + 12, $base_unit_cd);
	}

	/**
	 *  単位ＣＤ.<p>
	 *
	 */
	public void base_unit_cd(String value) {
		setConstString(offset + 12, $base_unit_cd, value);
	}


	/**
	 *  単位名.<p>
	 *
	 */
	public String base_unit_nm() {
		return getConstString(offset + 13, $base_unit_nm);
	}

	/**
	 *  単位名.<p>
	 *
	 */
	public void base_unit_nm(String value) {
		setConstString(offset + 13, $base_unit_nm, value);
	}


	/**
	 *  小数部有効桁数.<p>
	 *
	 */
	public MCNumber base_dec_place() {
		return getConstNumber(offset + 14, $base_dec_place);
	}

	/**
	 *  小数部有効桁数.<p>
	 *
	 */
	public void base_dec_place(MCNumber value) {
		setConstNumber(offset + 14, $base_dec_place, value);
	}

	/**
	 *  小数部有効桁数.<p>
	 *
	 */
	public void base_dec_place(int value) {
		setConstNumber(offset + 14, $base_dec_place, value);
	}

	/**
	 *  小数部有効桁数.<p>
	 *
	 */
	public void base_dec_place(long value) {
		setConstNumber(offset + 14, $base_dec_place, value);
	}

	/**
	 *  小数部有効桁数.<p>
	 *
	 */
	public void base_dec_place(float value) {
		setConstNumber(offset + 14, $base_dec_place, value);
	}

	/**
	 *  小数部有効桁数.<p>
	 *
	 */
	public void base_dec_place(double value) {
		setConstNumber(offset + 14, $base_dec_place, value);
	}


	/**
	 *  判定結果区分.<p>
	 *
	 */
	public String mrkt_judg_sts_typ() {
		return getConstString(offset + 15, $mrkt_judg_sts_typ);
	}

	/**
	 *  判定結果区分.<p>
	 *
	 */
	public void mrkt_judg_sts_typ(String value) {
		setConstString(offset + 15, $mrkt_judg_sts_typ, value);
	}


	/**
	 *  判定結果区分名.<p>
	 *
	 */
	public String mrkt_judg_sts_typ_nm() {
		return getConstString(offset + 16, $mrkt_judg_sts_typ_nm);
	}

	/**
	 *  判定結果区分名.<p>
	 *
	 */
	public void mrkt_judg_sts_typ_nm(String value) {
		setConstString(offset + 16, $mrkt_judg_sts_typ_nm, value);
	}


	/**
	 *  判定日.<p>
	 *
	 */
	public MCDate judg_dt() {
		return getConstDate(offset + 17, $judg_dt);
	}

	/**
	 *  判定日.<p>
	 *
	 */
	public void judg_dt(MCDate value) {
		setConstDate(offset + 17, $judg_dt, value);
	}


	/**
	 *  判定者ＣＤ.<p>
	 *
	 */
	public String judg_usr_cd() {
		return getConstString(offset + 18, $judg_usr_cd);
	}

	/**
	 *  判定者ＣＤ.<p>
	 *
	 */
	public void judg_usr_cd(String value) {
		setConstString(offset + 18, $judg_usr_cd, value);
	}


	/**
	 *  判定者名.<p>
	 *
	 */
	public String judg_usr_nm() {
		return getConstString(offset + 19, $judg_usr_nm);
	}

	/**
	 *  判定者名.<p>
	 *
	 */
	public void judg_usr_nm(String value) {
		setConstString(offset + 19, $judg_usr_nm, value);
	}


	/**
	 *  判定部門ＣＤ.<p>
	 *
	 */
	public String judg_dpt_cd() {
		return getConstString(offset + 20, $judg_dpt_cd);
	}

	/**
	 *  判定部門ＣＤ.<p>
	 *
	 */
	public void judg_dpt_cd(String value) {
		setConstString(offset + 20, $judg_dpt_cd, value);
	}


	/**
	 *  判定部門名.<p>
	 *
	 */
	public String judg_dpt_nm() {
		return getConstString(offset + 21, $judg_dpt_nm);
	}

	/**
	 *  判定部門名.<p>
	 *
	 */
	public void judg_dpt_nm(String value) {
		setConstString(offset + 21, $judg_dpt_nm, value);
	}


	/**
	 *  製造所からの出荷承認結果.<p>
	 *
	 */
	public String mfg_so_aprv_typ() {
		return getConstString(offset + 22, $mfg_so_aprv_typ);
	}

	/**
	 *  製造所からの出荷承認結果.<p>
	 *
	 */
	public void mfg_so_aprv_typ(String value) {
		setConstString(offset + 22, $mfg_so_aprv_typ, value);
	}


	/**
	 *  製造所からの出荷承認結果名.<p>
	 *
	 */
	public String mfg_so_aprv_typ_nm() {
		return getConstString(offset + 23, $mfg_so_aprv_typ_nm);
	}

	/**
	 *  製造所からの出荷承認結果名.<p>
	 *
	 */
	public void mfg_so_aprv_typ_nm(String value) {
		setConstString(offset + 23, $mfg_so_aprv_typ_nm, value);
	}


	/**
	 *  品質管理結果.<p>
	 *
	 */
	public String quality_mng_typ() {
		return getConstString(offset + 24, $quality_mng_typ);
	}

	/**
	 *  品質管理結果.<p>
	 *
	 */
	public void quality_mng_typ(String value) {
		setConstString(offset + 24, $quality_mng_typ, value);
	}


	/**
	 *  品質管理結果名.<p>
	 *
	 */
	public String quality_mng_typ_nm() {
		return getConstString(offset + 25, $quality_mng_typ_nm);
	}

	/**
	 *  品質管理結果名.<p>
	 *
	 */
	public void quality_mng_typ_nm(String value) {
		setConstString(offset + 25, $quality_mng_typ_nm, value);
	}


	/**
	 *  製造管理結果.<p>
	 *
	 */
	public String mfg_mng_typ() {
		return getConstString(offset + 26, $mfg_mng_typ);
	}

	/**
	 *  製造管理結果.<p>
	 *
	 */
	public void mfg_mng_typ(String value) {
		setConstString(offset + 26, $mfg_mng_typ, value);
	}


	/**
	 *  製造管理結果名.<p>
	 *
	 */
	public String mfg_mng_typ_nm() {
		return getConstString(offset + 27, $mfg_mng_typ_nm);
	}

	/**
	 *  製造管理結果名.<p>
	 *
	 */
	public void mfg_mng_typ_nm(String value) {
		setConstString(offset + 27, $mfg_mng_typ_nm, value);
	}


	/**
	 *  逸脱有無.<p>
	 *
	 */
	public String deviant_typ() {
		return getConstString(offset + 28, $deviant_typ);
	}

	/**
	 *  逸脱有無.<p>
	 *
	 */
	public void deviant_typ(String value) {
		setConstString(offset + 28, $deviant_typ, value);
	}


	/**
	 *  逸脱有無名.<p>
	 *
	 */
	public String deviant_typ_nm() {
		return getConstString(offset + 29, $deviant_typ_nm);
	}

	/**
	 *  逸脱有無名.<p>
	 *
	 */
	public void deviant_typ_nm(String value) {
		setConstString(offset + 29, $deviant_typ_nm, value);
	}


	/**
	 *  逸脱措置.<p>
	 *
	 */
	public String deviant_msr_typ() {
		return getConstString(offset + 30, $deviant_msr_typ);
	}

	/**
	 *  逸脱措置.<p>
	 *
	 */
	public void deviant_msr_typ(String value) {
		setConstString(offset + 30, $deviant_msr_typ, value);
	}


	/**
	 *  逸脱措置名.<p>
	 *
	 */
	public String deviant_msr_typ_nm() {
		return getConstString(offset + 31, $deviant_msr_typ_nm);
	}

	/**
	 *  逸脱措置名.<p>
	 *
	 */
	public void deviant_msr_typ_nm(String value) {
		setConstString(offset + 31, $deviant_msr_typ_nm, value);
	}


	/**
	 *  製品の品質有無.<p>
	 *
	 */
	public String prod_itm_info_typ() {
		return getConstString(offset + 32, $prod_itm_info_typ);
	}

	/**
	 *  製品の品質有無.<p>
	 *
	 */
	public void prod_itm_info_typ(String value) {
		setConstString(offset + 32, $prod_itm_info_typ, value);
	}


	/**
	 *  製品の品質有無名.<p>
	 *
	 */
	public String prod_itm_info_typ_nm() {
		return getConstString(offset + 33, $prod_itm_info_typ_nm);
	}

	/**
	 *  製品の品質有無名.<p>
	 *
	 */
	public void prod_itm_info_typ_nm(String value) {
		setConstString(offset + 33, $prod_itm_info_typ_nm, value);
	}


	/**
	 *  原材料の品質有無.<p>
	 *
	 */
	public String chd_itm_info_typ() {
		return getConstString(offset + 34, $chd_itm_info_typ);
	}

	/**
	 *  原材料の品質有無.<p>
	 *
	 */
	public void chd_itm_info_typ(String value) {
		setConstString(offset + 34, $chd_itm_info_typ, value);
	}


	/**
	 *  原材料の品質有無名.<p>
	 *
	 */
	public String chd_itm_info_typ_nm() {
		return getConstString(offset + 35, $chd_itm_info_typ_nm);
	}

	/**
	 *  原材料の品質有無名.<p>
	 *
	 */
	public void chd_itm_info_typ_nm(String value) {
		setConstString(offset + 35, $chd_itm_info_typ_nm, value);
	}


	/**
	 *  理由.<p>
	 *
	 */
	public String judg_rsn() {
		return getConstString(offset + 36, $judg_rsn);
	}

	/**
	 *  理由.<p>
	 *
	 */
	public void judg_rsn(String value) {
		setConstString(offset + 36, $judg_rsn, value);
	}


	/**
	 *  特記事項.<p>
	 *
	 */
	public String intr_rmrks() {
		return getConstString(offset + 37, $intr_rmrks);
	}

	/**
	 *  特記事項.<p>
	 *
	 */
	public void intr_rmrks(String value) {
		setConstString(offset + 37, $intr_rmrks, value);
	}


	/**
	 *  予備１.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 38, $sub_char1);
	}

	/**
	 *  予備１.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 38, $sub_char1, value);
	}


	/**
	 *  予備２.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 39, $sub_char2);
	}

	/**
	 *  予備２.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 39, $sub_char2, value);
	}


	/**
	 *  予備３.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 40, $sub_char3);
	}

	/**
	 *  予備３.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 40, $sub_char3, value);
	}


	/**
	 *  出荷元工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public String site_cd() {
		return getConstString(offset + 41, $site_cd);
	}

	/**
	 *  出荷元工場・物流倉庫ＣＤ.<p>
	 *
	 */
	public void site_cd(String value) {
		setConstString(offset + 41, $site_cd, value);
	}


	/**
	 *  出荷元工場・物流倉庫名.<p>
	 *
	 */
	public String site_nm() {
		return getConstString(offset + 42, $site_nm);
	}

	/**
	 *  出荷元工場・物流倉庫名.<p>
	 *
	 */
	public void site_nm(String value) {
		setConstString(offset + 42, $site_nm, value);
	}


	public String getString(String name) {
		if ($mrkt_judg_no.equalsIgnoreCase(name)) {
			return mrkt_judg_no();
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
		if ($s_unit_qty.equalsIgnoreCase(name)) {
			return s_unit_qty();
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			return base_unit_nm();
		}
		if ($mrkt_judg_sts_typ.equalsIgnoreCase(name)) {
			return mrkt_judg_sts_typ();
		}
		if ($mrkt_judg_sts_typ_nm.equalsIgnoreCase(name)) {
			return mrkt_judg_sts_typ_nm();
		}
		if ($judg_usr_cd.equalsIgnoreCase(name)) {
			return judg_usr_cd();
		}
		if ($judg_usr_nm.equalsIgnoreCase(name)) {
			return judg_usr_nm();
		}
		if ($judg_dpt_cd.equalsIgnoreCase(name)) {
			return judg_dpt_cd();
		}
		if ($judg_dpt_nm.equalsIgnoreCase(name)) {
			return judg_dpt_nm();
		}
		if ($mfg_so_aprv_typ.equalsIgnoreCase(name)) {
			return mfg_so_aprv_typ();
		}
		if ($mfg_so_aprv_typ_nm.equalsIgnoreCase(name)) {
			return mfg_so_aprv_typ_nm();
		}
		if ($quality_mng_typ.equalsIgnoreCase(name)) {
			return quality_mng_typ();
		}
		if ($quality_mng_typ_nm.equalsIgnoreCase(name)) {
			return quality_mng_typ_nm();
		}
		if ($mfg_mng_typ.equalsIgnoreCase(name)) {
			return mfg_mng_typ();
		}
		if ($mfg_mng_typ_nm.equalsIgnoreCase(name)) {
			return mfg_mng_typ_nm();
		}
		if ($deviant_typ.equalsIgnoreCase(name)) {
			return deviant_typ();
		}
		if ($deviant_typ_nm.equalsIgnoreCase(name)) {
			return deviant_typ_nm();
		}
		if ($deviant_msr_typ.equalsIgnoreCase(name)) {
			return deviant_msr_typ();
		}
		if ($deviant_msr_typ_nm.equalsIgnoreCase(name)) {
			return deviant_msr_typ_nm();
		}
		if ($prod_itm_info_typ.equalsIgnoreCase(name)) {
			return prod_itm_info_typ();
		}
		if ($prod_itm_info_typ_nm.equalsIgnoreCase(name)) {
			return prod_itm_info_typ_nm();
		}
		if ($chd_itm_info_typ.equalsIgnoreCase(name)) {
			return chd_itm_info_typ();
		}
		if ($chd_itm_info_typ_nm.equalsIgnoreCase(name)) {
			return chd_itm_info_typ_nm();
		}
		if ($judg_rsn.equalsIgnoreCase(name)) {
			return judg_rsn();
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			return intr_rmrks();
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
		if ($judg_dt.equalsIgnoreCase(name)) {
			return judg_dt();
		}
		return super.getDate(name);
	}

	public String getStringNE(String name) {
		if ($mrkt_judg_no.equalsIgnoreCase(name)) {
			return mrkt_judg_no();
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
		if ($s_unit_qty.equalsIgnoreCase(name)) {
			return s_unit_qty();
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($base_unit_nm.equalsIgnoreCase(name)) {
			return base_unit_nm();
		}
		if ($mrkt_judg_sts_typ.equalsIgnoreCase(name)) {
			return mrkt_judg_sts_typ();
		}
		if ($mrkt_judg_sts_typ_nm.equalsIgnoreCase(name)) {
			return mrkt_judg_sts_typ_nm();
		}
		if ($judg_usr_cd.equalsIgnoreCase(name)) {
			return judg_usr_cd();
		}
		if ($judg_usr_nm.equalsIgnoreCase(name)) {
			return judg_usr_nm();
		}
		if ($judg_dpt_cd.equalsIgnoreCase(name)) {
			return judg_dpt_cd();
		}
		if ($judg_dpt_nm.equalsIgnoreCase(name)) {
			return judg_dpt_nm();
		}
		if ($mfg_so_aprv_typ.equalsIgnoreCase(name)) {
			return mfg_so_aprv_typ();
		}
		if ($mfg_so_aprv_typ_nm.equalsIgnoreCase(name)) {
			return mfg_so_aprv_typ_nm();
		}
		if ($quality_mng_typ.equalsIgnoreCase(name)) {
			return quality_mng_typ();
		}
		if ($quality_mng_typ_nm.equalsIgnoreCase(name)) {
			return quality_mng_typ_nm();
		}
		if ($mfg_mng_typ.equalsIgnoreCase(name)) {
			return mfg_mng_typ();
		}
		if ($mfg_mng_typ_nm.equalsIgnoreCase(name)) {
			return mfg_mng_typ_nm();
		}
		if ($deviant_typ.equalsIgnoreCase(name)) {
			return deviant_typ();
		}
		if ($deviant_typ_nm.equalsIgnoreCase(name)) {
			return deviant_typ_nm();
		}
		if ($deviant_msr_typ.equalsIgnoreCase(name)) {
			return deviant_msr_typ();
		}
		if ($deviant_msr_typ_nm.equalsIgnoreCase(name)) {
			return deviant_msr_typ_nm();
		}
		if ($prod_itm_info_typ.equalsIgnoreCase(name)) {
			return prod_itm_info_typ();
		}
		if ($prod_itm_info_typ_nm.equalsIgnoreCase(name)) {
			return prod_itm_info_typ_nm();
		}
		if ($chd_itm_info_typ.equalsIgnoreCase(name)) {
			return chd_itm_info_typ();
		}
		if ($chd_itm_info_typ_nm.equalsIgnoreCase(name)) {
			return chd_itm_info_typ_nm();
		}
		if ($judg_rsn.equalsIgnoreCase(name)) {
			return judg_rsn();
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			return intr_rmrks();
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
		if ($judg_dt.equalsIgnoreCase(name)) {
			return judg_dt();
		}
		return super.getDateNE(name);
	}

	public void setString(String name, String value) {
		if ($mrkt_judg_no.equalsIgnoreCase(name)) {
			mrkt_judg_no(value);
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
		if ($s_unit_qty.equalsIgnoreCase(name)) {
			s_unit_qty(value);
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
		if ($mrkt_judg_sts_typ.equalsIgnoreCase(name)) {
			mrkt_judg_sts_typ(value);
			return;
		}
		if ($mrkt_judg_sts_typ_nm.equalsIgnoreCase(name)) {
			mrkt_judg_sts_typ_nm(value);
			return;
		}
		if ($judg_usr_cd.equalsIgnoreCase(name)) {
			judg_usr_cd(value);
			return;
		}
		if ($judg_usr_nm.equalsIgnoreCase(name)) {
			judg_usr_nm(value);
			return;
		}
		if ($judg_dpt_cd.equalsIgnoreCase(name)) {
			judg_dpt_cd(value);
			return;
		}
		if ($judg_dpt_nm.equalsIgnoreCase(name)) {
			judg_dpt_nm(value);
			return;
		}
		if ($mfg_so_aprv_typ.equalsIgnoreCase(name)) {
			mfg_so_aprv_typ(value);
			return;
		}
		if ($mfg_so_aprv_typ_nm.equalsIgnoreCase(name)) {
			mfg_so_aprv_typ_nm(value);
			return;
		}
		if ($quality_mng_typ.equalsIgnoreCase(name)) {
			quality_mng_typ(value);
			return;
		}
		if ($quality_mng_typ_nm.equalsIgnoreCase(name)) {
			quality_mng_typ_nm(value);
			return;
		}
		if ($mfg_mng_typ.equalsIgnoreCase(name)) {
			mfg_mng_typ(value);
			return;
		}
		if ($mfg_mng_typ_nm.equalsIgnoreCase(name)) {
			mfg_mng_typ_nm(value);
			return;
		}
		if ($deviant_typ.equalsIgnoreCase(name)) {
			deviant_typ(value);
			return;
		}
		if ($deviant_typ_nm.equalsIgnoreCase(name)) {
			deviant_typ_nm(value);
			return;
		}
		if ($deviant_msr_typ.equalsIgnoreCase(name)) {
			deviant_msr_typ(value);
			return;
		}
		if ($deviant_msr_typ_nm.equalsIgnoreCase(name)) {
			deviant_msr_typ_nm(value);
			return;
		}
		if ($prod_itm_info_typ.equalsIgnoreCase(name)) {
			prod_itm_info_typ(value);
			return;
		}
		if ($prod_itm_info_typ_nm.equalsIgnoreCase(name)) {
			prod_itm_info_typ_nm(value);
			return;
		}
		if ($chd_itm_info_typ.equalsIgnoreCase(name)) {
			chd_itm_info_typ(value);
			return;
		}
		if ($chd_itm_info_typ_nm.equalsIgnoreCase(name)) {
			chd_itm_info_typ_nm(value);
			return;
		}
		if ($judg_rsn.equalsIgnoreCase(name)) {
			judg_rsn(value);
			return;
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			intr_rmrks(value);
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
		if ($judg_dt.equalsIgnoreCase(name)) {
			judg_dt(value);
			return;
		}
		super.setDate(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($mrkt_judg_no.equalsIgnoreCase(name)) {
			mrkt_judg_no(value);
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
		if ($s_unit_qty.equalsIgnoreCase(name)) {
			s_unit_qty(value);
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
		if ($mrkt_judg_sts_typ.equalsIgnoreCase(name)) {
			mrkt_judg_sts_typ(value);
			return;
		}
		if ($mrkt_judg_sts_typ_nm.equalsIgnoreCase(name)) {
			mrkt_judg_sts_typ_nm(value);
			return;
		}
		if ($judg_usr_cd.equalsIgnoreCase(name)) {
			judg_usr_cd(value);
			return;
		}
		if ($judg_usr_nm.equalsIgnoreCase(name)) {
			judg_usr_nm(value);
			return;
		}
		if ($judg_dpt_cd.equalsIgnoreCase(name)) {
			judg_dpt_cd(value);
			return;
		}
		if ($judg_dpt_nm.equalsIgnoreCase(name)) {
			judg_dpt_nm(value);
			return;
		}
		if ($mfg_so_aprv_typ.equalsIgnoreCase(name)) {
			mfg_so_aprv_typ(value);
			return;
		}
		if ($mfg_so_aprv_typ_nm.equalsIgnoreCase(name)) {
			mfg_so_aprv_typ_nm(value);
			return;
		}
		if ($quality_mng_typ.equalsIgnoreCase(name)) {
			quality_mng_typ(value);
			return;
		}
		if ($quality_mng_typ_nm.equalsIgnoreCase(name)) {
			quality_mng_typ_nm(value);
			return;
		}
		if ($mfg_mng_typ.equalsIgnoreCase(name)) {
			mfg_mng_typ(value);
			return;
		}
		if ($mfg_mng_typ_nm.equalsIgnoreCase(name)) {
			mfg_mng_typ_nm(value);
			return;
		}
		if ($deviant_typ.equalsIgnoreCase(name)) {
			deviant_typ(value);
			return;
		}
		if ($deviant_typ_nm.equalsIgnoreCase(name)) {
			deviant_typ_nm(value);
			return;
		}
		if ($deviant_msr_typ.equalsIgnoreCase(name)) {
			deviant_msr_typ(value);
			return;
		}
		if ($deviant_msr_typ_nm.equalsIgnoreCase(name)) {
			deviant_msr_typ_nm(value);
			return;
		}
		if ($prod_itm_info_typ.equalsIgnoreCase(name)) {
			prod_itm_info_typ(value);
			return;
		}
		if ($prod_itm_info_typ_nm.equalsIgnoreCase(name)) {
			prod_itm_info_typ_nm(value);
			return;
		}
		if ($chd_itm_info_typ.equalsIgnoreCase(name)) {
			chd_itm_info_typ(value);
			return;
		}
		if ($chd_itm_info_typ_nm.equalsIgnoreCase(name)) {
			chd_itm_info_typ_nm(value);
			return;
		}
		if ($judg_rsn.equalsIgnoreCase(name)) {
			judg_rsn(value);
			return;
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			intr_rmrks(value);
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
		if ($judg_dt.equalsIgnoreCase(name)) {
			judg_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}



}

