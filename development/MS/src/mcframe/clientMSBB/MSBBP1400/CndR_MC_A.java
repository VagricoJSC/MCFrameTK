package mcframe.clientMSBB.MSBBP1400;

import java.util.List;
import java.util.Map;
import java.util.Set;
import mcframe.commonCore.container.MCExtMap;
import mcframe.commonCore.container.MCExtList;
import mcframe.clientCore.container.MCKeyList;
import mcframe.clientCore.container.MCConstRow;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.container.MCContainerMeta;
import mcframe.commonCore.meta.MCMeta;
import mcframe.commonCore.lang.MCNumber;
import mcframe.commonCore.lang.MCDate;
import mcframe.commonCore.lang.MCTimestamp;
import mcframe.commonCore.lang.MCDataType;
import mcframe.commonCore.lang.MCBinary;

/**
 * ブロック"Cnd"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class CndR_MC_A extends MCConstRow {

	/**
	 * Specified month 指定年月.<p>
	 *
	 */
	public static final String $inpt_ym_d = "inpt_ym_d";
	/**
	 * Display sales forecasting 売上推移表示.<p>
	 *
	 */
	public static final String $sls_trnst_disp_d = "sls_trnst_disp_d";
	/**
	 * Sales display period 売上表示期間.<p>
	 *
	 */
	public static final String $sls_disp_term_d = "sls_disp_term_d";
	/**
	 * Aggregation period 集計期間.<p>
	 *
	 */
	public static final String $sum_term_d = "sum_term_d";
	/**
	 * Budget classification 予算分類.<p>
	 *
	 */
	public static final String $sls_bdg_grp_d = "sls_bdg_grp_d";
	/**
	 * Exchange rate cd. 為替レートＣＤ.<p>
	 *
	 */
	public static final String $xrate_cd_d = "xrate_cd_d";
	/**
	 * Exchange rate name 為替レート名.<p>
	 *
	 */
	public static final String $xrate_nm_d = "xrate_nm_d";
	/**
	 * Convert result by rate at sales 実績を売上時レートで換算.<p>
	 *
	 */
	public static final String $use_act_xrate_flg_d = "use_act_xrate_flg_d";
	/**
	 * Dept. hierarchy 部門階層.<p>
	 *
	 */
	public static final String $dpt_lvl_cd_d = "dpt_lvl_cd_d";
	/**
	 * Dept. hierarchy name 部門階層名.<p>
	 *
	 */
	public static final String $dpt_lvl_nm_d = "dpt_lvl_nm_d";
	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public static final String $dpt_cd_d = "dpt_cd_d";
	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public static final String $dpt_nm_d = "dpt_nm_d";
	/**
	 * Specified month 指定年月.<p>
	 *
	 */
	public static final String $inpt_ym_ig = "inpt_ym_ig";
	/**
	 * Display sales forecasting 売上推移表示.<p>
	 *
	 */
	public static final String $sls_trnst_disp_ig = "sls_trnst_disp_ig";
	/**
	 * Sales display period 売上表示期間.<p>
	 *
	 */
	public static final String $sls_disp_term_ig = "sls_disp_term_ig";
	/**
	 * Aggregation period 集計期間.<p>
	 *
	 */
	public static final String $sum_term_ig = "sum_term_ig";
	/**
	 * Budget classification 予算分類.<p>
	 *
	 */
	public static final String $sls_bdg_grp_ig = "sls_bdg_grp_ig";
	/**
	 * Exchange rate cd. 為替レートＣＤ.<p>
	 *
	 */
	public static final String $xrate_cd_ig = "xrate_cd_ig";
	/**
	 * Exchange rate name 為替レート名.<p>
	 *
	 */
	public static final String $xrate_nm_ig = "xrate_nm_ig";
	/**
	 * Convert result by rate at sales 実績を売上時レートで換算.<p>
	 *
	 */
	public static final String $use_act_xrate_flg_ig = "use_act_xrate_flg_ig";
	/**
	 * Item system hierarchy 品目体系階層.<p>
	 *
	 */
	public static final String $sls_itm_grp_lvl = "sls_itm_grp_lvl";
	/**
	 * Item system cd. 品目体系ＣＤ.<p>
	 *
	 */
	public static final String $sls_itm_grp_cd_ig = "sls_itm_grp_cd_ig";
	/**
	 * Item system name 品目体系名.<p>
	 *
	 */
	public static final String $sls_itm_grp_nm_ig = "sls_itm_grp_nm_ig";


	public static final MCMeta inpt_ym_d_META = createCommonMeta($inpt_ym_d, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta sls_trnst_disp_d_META = createCommonMeta($sls_trnst_disp_d, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sls_disp_term_d_META = createCommonMeta($sls_disp_term_d, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta sum_term_d_META = createCommonMeta($sum_term_d, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta sls_bdg_grp_d_META = createCommonMeta($sls_bdg_grp_d, mcframe.commonMS.meta.MS_META.SLS_BDG_GRP);
	public static final MCMeta xrate_cd_d_META = createCommonMeta($xrate_cd_d, mcframe.commonMA.meta.MA_META.XRATE_CD);
	public static final MCMeta xrate_nm_d_META = createCommonMeta($xrate_nm_d, mcframe.commonMA.meta.MA_META.XRATE_NM);
	public static final MCMeta use_act_xrate_flg_d_META = createCommonMeta($use_act_xrate_flg_d, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dpt_lvl_cd_d_META = createCommonMeta($dpt_lvl_cd_d, mcframe.commonMA.meta.MA_META.DPT_LVL_CD);
	public static final MCMeta dpt_lvl_nm_d_META = createCommonMeta($dpt_lvl_nm_d, mcframe.commonMA.meta.MA_META.DPT_LVL_NM);
	public static final MCMeta dpt_cd_d_META = createCommonMeta($dpt_cd_d, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta dpt_nm_d_META = createCommonMeta($dpt_nm_d, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta inpt_ym_ig_META = createCommonMeta($inpt_ym_ig, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta sls_trnst_disp_ig_META = createCommonMeta($sls_trnst_disp_ig, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sls_disp_term_ig_META = createCommonMeta($sls_disp_term_ig, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta sum_term_ig_META = createCommonMeta($sum_term_ig, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta sls_bdg_grp_ig_META = createCommonMeta($sls_bdg_grp_ig, mcframe.commonMS.meta.MS_META.SLS_BDG_GRP);
	public static final MCMeta xrate_cd_ig_META = createCommonMeta($xrate_cd_ig, mcframe.commonMA.meta.MA_META.XRATE_CD);
	public static final MCMeta xrate_nm_ig_META = createCommonMeta($xrate_nm_ig, mcframe.commonMA.meta.MA_META.XRATE_NM);
	public static final MCMeta use_act_xrate_flg_ig_META = createCommonMeta($use_act_xrate_flg_ig, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sls_itm_grp_lvl_META = createCommonMeta($sls_itm_grp_lvl, mcframe.commonMA.meta.MA_META.INT4);
	public static final MCMeta sls_itm_grp_cd_ig_META = createCommonMeta($sls_itm_grp_cd_ig, mcframe.commonMA.meta.MA_META.SLS_ITM_GRP_CD);
	public static final MCMeta sls_itm_grp_nm_ig_META = createCommonMeta($sls_itm_grp_nm_ig, mcframe.commonMA.meta.MA_META.SLS_ITM_GRP_NM);

	protected static final ConstMetaList<CndR> constMetas = new ConstMetaList<CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			inpt_ym_d_META,
			sls_trnst_disp_d_META,
			sls_disp_term_d_META,
			sum_term_d_META,
			sls_bdg_grp_d_META,
			xrate_cd_d_META,
			xrate_nm_d_META,
			use_act_xrate_flg_d_META,
			dpt_lvl_cd_d_META,
			dpt_lvl_nm_d_META,
			dpt_cd_d_META,
			dpt_nm_d_META,
			inpt_ym_ig_META,
			sls_trnst_disp_ig_META,
			sls_disp_term_ig_META,
			sum_term_ig_META,
			sls_bdg_grp_ig_META,
			xrate_cd_ig_META,
			xrate_nm_ig_META,
			use_act_xrate_flg_ig_META,
			sls_itm_grp_lvl_META,
			sls_itm_grp_cd_ig_META,
			sls_itm_grp_nm_ig_META
		},
		new String[][]{
			{
			},
			{
			}
		}
	);

	/**
	 * "KEYS"グループのキー項目情報です。
	 */
	protected static final MCKeyList KEYS = new MCKeyList(
		null,
		new String[]{
		}
	);

	/** 項目属性情報のグループ[LIST_OUT_BASE]のキー定数 */
	public static final String $$LIST_OUT_BASE = "LIST_OUT_BASE";
	/** 項目属性情報のグループ[LIST_IN]のキー定数 */
	public static final String $$LIST_IN = "LIST_IN";
	/** 項目属性情報のグループ[LIST_IN_BASE]のキー定数 */
	public static final String $$LIST_IN_BASE = "LIST_IN_BASE";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$LIST_OUT_BASE, new MCExtList(
			new String[][]{
				{$xrate_cd_d, "xrate_nm"},	// xrate_cd_d
				{$dpt_lvl_cd_d, "dpt_lvl_nm"},	// dpt_lvl_cd_d
				{$dpt_cd_d, "dpt_nm"},	// dpt_cd_d
				{$xrate_cd_ig, "xrate_nm"},	// xrate_cd_ig
				{$sls_itm_grp_cd_ig, "sls_itm_grp_nm"}	// sls_itm_grp_cd_ig
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
				{$sls_bdg_grp_d, "true"},	// sls_bdg_grp_d
				{$dpt_cd_d, "dpt_lvl_cd_d;MAC_DPT_IS_SRCH_TYP.SLS;true;true"},	// dpt_cd_d
				{$sls_bdg_grp_ig, "true"},	// sls_bdg_grp_ig
				{$sls_itm_grp_cd_ig, "sls_itm_grp_lvl"}	// sls_itm_grp_cd_ig
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
				{$sls_bdg_grp_d, "dpt_flg"},	// sls_bdg_grp_d
				{$dpt_cd_d, "dpt_lvl_cd;dpt_is_srch_typ;mode_today_flg;dpt_nm_rem_flg"},	// dpt_cd_d
				{$sls_bdg_grp_ig, "itm_grp_flg"},	// sls_bdg_grp_ig
				{$sls_itm_grp_cd_ig, "sls_itm_grp_lvl"}	// sls_itm_grp_cd_ig
			}
		))
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
	 * "KEYS"グループのキー項目情報を返します。
	 */
	public MCKeyList getKeys(){
		return KEYS;
	}

	/**
	 * 指定グループの項目属性情報を返します。
	 */
	public Map<String, String> getExtMap(String aGroup){
		if(aGroup == null) return null;
		return EXTMAP.get(aGroup);
	}

	/**
	 * 指定グループの項目属性が登録された項目リストを返します。
	 */
	public MCKeyList getKeys(String aGroup){
		if(aGroup == null) return null;
		return new MCKeyList(EXTMAP.getKeyList(aGroup));
	}

	/**
	 * 項目属性のグループのSet情報を返します。
	 */
	public Set<String> getExtGroups(){
		Set<String> ret = EXTMAP.keySet();
		return ret;
	}

	/**
	 * コンストラクタです。
	 */
	protected CndR_MC_A(ConstMetaList<? extends CndR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public CndR clone() {
		return (CndR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public CndR createInstance() {
		return (CndR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public CndR getValues(String... names) {
		return (CndR) super.getValues(names);
	}



	/**
	 * Specified month 指定年月.<p>
	 *
	 */
	public MCDate inpt_ym_d() {
		return getConstDate(offset + 0, $inpt_ym_d);
	}

	/**
	 * Specified month 指定年月.<p>
	 *
	 */
	public void inpt_ym_d(MCDate value) {
		setConstDate(offset + 0, $inpt_ym_d, value);
	}


	/**
	 * Display sales forecasting 売上推移表示.<p>
	 *
	 */
	public boolean sls_trnst_disp_d() {
		return getConstBoolean(offset + 1, $sls_trnst_disp_d);
	}

	/**
	 * Display sales forecasting 売上推移表示.<p>
	 *
	 */
	public void sls_trnst_disp_d(boolean value) {
		setConstBoolean(offset + 1, $sls_trnst_disp_d, value);
	}


	/**
	 * Sales display period 売上表示期間.<p>
	 *
	 */
	public MCNumber sls_disp_term_d() {
		return getConstNumber(offset + 2, $sls_disp_term_d);
	}

	/**
	 * Sales display period 売上表示期間.<p>
	 *
	 */
	public void sls_disp_term_d(MCNumber value) {
		setConstNumber(offset + 2, $sls_disp_term_d, value);
	}

	/**
	 * Sales display period 売上表示期間.<p>
	 *
	 */
	public void sls_disp_term_d(int value) {
		setConstNumber(offset + 2, $sls_disp_term_d, value);
	}

	/**
	 * Sales display period 売上表示期間.<p>
	 *
	 */
	public void sls_disp_term_d(long value) {
		setConstNumber(offset + 2, $sls_disp_term_d, value);
	}

	/**
	 * Sales display period 売上表示期間.<p>
	 *
	 */
	public void sls_disp_term_d(float value) {
		setConstNumber(offset + 2, $sls_disp_term_d, value);
	}

	/**
	 * Sales display period 売上表示期間.<p>
	 *
	 */
	public void sls_disp_term_d(double value) {
		setConstNumber(offset + 2, $sls_disp_term_d, value);
	}


	/**
	 * Aggregation period 集計期間.<p>
	 *
	 */
	public MCNumber sum_term_d() {
		return getConstNumber(offset + 3, $sum_term_d);
	}

	/**
	 * Aggregation period 集計期間.<p>
	 *
	 */
	public void sum_term_d(MCNumber value) {
		setConstNumber(offset + 3, $sum_term_d, value);
	}

	/**
	 * Aggregation period 集計期間.<p>
	 *
	 */
	public void sum_term_d(int value) {
		setConstNumber(offset + 3, $sum_term_d, value);
	}

	/**
	 * Aggregation period 集計期間.<p>
	 *
	 */
	public void sum_term_d(long value) {
		setConstNumber(offset + 3, $sum_term_d, value);
	}

	/**
	 * Aggregation period 集計期間.<p>
	 *
	 */
	public void sum_term_d(float value) {
		setConstNumber(offset + 3, $sum_term_d, value);
	}

	/**
	 * Aggregation period 集計期間.<p>
	 *
	 */
	public void sum_term_d(double value) {
		setConstNumber(offset + 3, $sum_term_d, value);
	}


	/**
	 * Budget classification 予算分類.<p>
	 *
	 */
	public String sls_bdg_grp_d() {
		return getConstString(offset + 4, $sls_bdg_grp_d);
	}

	/**
	 * Budget classification 予算分類.<p>
	 *
	 */
	public void sls_bdg_grp_d(String value) {
		setConstString(offset + 4, $sls_bdg_grp_d, value);
	}


	/**
	 * Exchange rate cd. 為替レートＣＤ.<p>
	 *
	 */
	public String xrate_cd_d() {
		return getConstString(offset + 5, $xrate_cd_d);
	}

	/**
	 * Exchange rate cd. 為替レートＣＤ.<p>
	 *
	 */
	public void xrate_cd_d(String value) {
		setConstString(offset + 5, $xrate_cd_d, value);
	}


	/**
	 * Exchange rate name 為替レート名.<p>
	 *
	 */
	public String xrate_nm_d() {
		return getConstString(offset + 6, $xrate_nm_d);
	}

	/**
	 * Exchange rate name 為替レート名.<p>
	 *
	 */
	public void xrate_nm_d(String value) {
		setConstString(offset + 6, $xrate_nm_d, value);
	}


	/**
	 * Convert result by rate at sales 実績を売上時レートで換算.<p>
	 *
	 */
	public boolean use_act_xrate_flg_d() {
		return getConstBoolean(offset + 7, $use_act_xrate_flg_d);
	}

	/**
	 * Convert result by rate at sales 実績を売上時レートで換算.<p>
	 *
	 */
	public void use_act_xrate_flg_d(boolean value) {
		setConstBoolean(offset + 7, $use_act_xrate_flg_d, value);
	}


	/**
	 * Dept. hierarchy 部門階層.<p>
	 *
	 */
	public String dpt_lvl_cd_d() {
		return getConstString(offset + 8, $dpt_lvl_cd_d);
	}

	/**
	 * Dept. hierarchy 部門階層.<p>
	 *
	 */
	public void dpt_lvl_cd_d(String value) {
		setConstString(offset + 8, $dpt_lvl_cd_d, value);
	}


	/**
	 * Dept. hierarchy name 部門階層名.<p>
	 *
	 */
	public String dpt_lvl_nm_d() {
		return getConstString(offset + 9, $dpt_lvl_nm_d);
	}

	/**
	 * Dept. hierarchy name 部門階層名.<p>
	 *
	 */
	public void dpt_lvl_nm_d(String value) {
		setConstString(offset + 9, $dpt_lvl_nm_d, value);
	}


	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public String dpt_cd_d() {
		return getConstString(offset + 10, $dpt_cd_d);
	}

	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public void dpt_cd_d(String value) {
		setConstString(offset + 10, $dpt_cd_d, value);
	}


	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public String dpt_nm_d() {
		return getConstString(offset + 11, $dpt_nm_d);
	}

	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public void dpt_nm_d(String value) {
		setConstString(offset + 11, $dpt_nm_d, value);
	}


	/**
	 * Specified month 指定年月.<p>
	 *
	 */
	public MCDate inpt_ym_ig() {
		return getConstDate(offset + 12, $inpt_ym_ig);
	}

	/**
	 * Specified month 指定年月.<p>
	 *
	 */
	public void inpt_ym_ig(MCDate value) {
		setConstDate(offset + 12, $inpt_ym_ig, value);
	}


	/**
	 * Display sales forecasting 売上推移表示.<p>
	 *
	 */
	public boolean sls_trnst_disp_ig() {
		return getConstBoolean(offset + 13, $sls_trnst_disp_ig);
	}

	/**
	 * Display sales forecasting 売上推移表示.<p>
	 *
	 */
	public void sls_trnst_disp_ig(boolean value) {
		setConstBoolean(offset + 13, $sls_trnst_disp_ig, value);
	}


	/**
	 * Sales display period 売上表示期間.<p>
	 *
	 */
	public MCNumber sls_disp_term_ig() {
		return getConstNumber(offset + 14, $sls_disp_term_ig);
	}

	/**
	 * Sales display period 売上表示期間.<p>
	 *
	 */
	public void sls_disp_term_ig(MCNumber value) {
		setConstNumber(offset + 14, $sls_disp_term_ig, value);
	}

	/**
	 * Sales display period 売上表示期間.<p>
	 *
	 */
	public void sls_disp_term_ig(int value) {
		setConstNumber(offset + 14, $sls_disp_term_ig, value);
	}

	/**
	 * Sales display period 売上表示期間.<p>
	 *
	 */
	public void sls_disp_term_ig(long value) {
		setConstNumber(offset + 14, $sls_disp_term_ig, value);
	}

	/**
	 * Sales display period 売上表示期間.<p>
	 *
	 */
	public void sls_disp_term_ig(float value) {
		setConstNumber(offset + 14, $sls_disp_term_ig, value);
	}

	/**
	 * Sales display period 売上表示期間.<p>
	 *
	 */
	public void sls_disp_term_ig(double value) {
		setConstNumber(offset + 14, $sls_disp_term_ig, value);
	}


	/**
	 * Aggregation period 集計期間.<p>
	 *
	 */
	public MCNumber sum_term_ig() {
		return getConstNumber(offset + 15, $sum_term_ig);
	}

	/**
	 * Aggregation period 集計期間.<p>
	 *
	 */
	public void sum_term_ig(MCNumber value) {
		setConstNumber(offset + 15, $sum_term_ig, value);
	}

	/**
	 * Aggregation period 集計期間.<p>
	 *
	 */
	public void sum_term_ig(int value) {
		setConstNumber(offset + 15, $sum_term_ig, value);
	}

	/**
	 * Aggregation period 集計期間.<p>
	 *
	 */
	public void sum_term_ig(long value) {
		setConstNumber(offset + 15, $sum_term_ig, value);
	}

	/**
	 * Aggregation period 集計期間.<p>
	 *
	 */
	public void sum_term_ig(float value) {
		setConstNumber(offset + 15, $sum_term_ig, value);
	}

	/**
	 * Aggregation period 集計期間.<p>
	 *
	 */
	public void sum_term_ig(double value) {
		setConstNumber(offset + 15, $sum_term_ig, value);
	}


	/**
	 * Budget classification 予算分類.<p>
	 *
	 */
	public String sls_bdg_grp_ig() {
		return getConstString(offset + 16, $sls_bdg_grp_ig);
	}

	/**
	 * Budget classification 予算分類.<p>
	 *
	 */
	public void sls_bdg_grp_ig(String value) {
		setConstString(offset + 16, $sls_bdg_grp_ig, value);
	}


	/**
	 * Exchange rate cd. 為替レートＣＤ.<p>
	 *
	 */
	public String xrate_cd_ig() {
		return getConstString(offset + 17, $xrate_cd_ig);
	}

	/**
	 * Exchange rate cd. 為替レートＣＤ.<p>
	 *
	 */
	public void xrate_cd_ig(String value) {
		setConstString(offset + 17, $xrate_cd_ig, value);
	}


	/**
	 * Exchange rate name 為替レート名.<p>
	 *
	 */
	public String xrate_nm_ig() {
		return getConstString(offset + 18, $xrate_nm_ig);
	}

	/**
	 * Exchange rate name 為替レート名.<p>
	 *
	 */
	public void xrate_nm_ig(String value) {
		setConstString(offset + 18, $xrate_nm_ig, value);
	}


	/**
	 * Convert result by rate at sales 実績を売上時レートで換算.<p>
	 *
	 */
	public boolean use_act_xrate_flg_ig() {
		return getConstBoolean(offset + 19, $use_act_xrate_flg_ig);
	}

	/**
	 * Convert result by rate at sales 実績を売上時レートで換算.<p>
	 *
	 */
	public void use_act_xrate_flg_ig(boolean value) {
		setConstBoolean(offset + 19, $use_act_xrate_flg_ig, value);
	}


	/**
	 * Item system hierarchy 品目体系階層.<p>
	 *
	 */
	public MCNumber sls_itm_grp_lvl() {
		return getConstNumber(offset + 20, $sls_itm_grp_lvl);
	}

	/**
	 * Item system hierarchy 品目体系階層.<p>
	 *
	 */
	public void sls_itm_grp_lvl(MCNumber value) {
		setConstNumber(offset + 20, $sls_itm_grp_lvl, value);
	}

	/**
	 * Item system hierarchy 品目体系階層.<p>
	 *
	 */
	public void sls_itm_grp_lvl(int value) {
		setConstNumber(offset + 20, $sls_itm_grp_lvl, value);
	}

	/**
	 * Item system hierarchy 品目体系階層.<p>
	 *
	 */
	public void sls_itm_grp_lvl(long value) {
		setConstNumber(offset + 20, $sls_itm_grp_lvl, value);
	}

	/**
	 * Item system hierarchy 品目体系階層.<p>
	 *
	 */
	public void sls_itm_grp_lvl(float value) {
		setConstNumber(offset + 20, $sls_itm_grp_lvl, value);
	}

	/**
	 * Item system hierarchy 品目体系階層.<p>
	 *
	 */
	public void sls_itm_grp_lvl(double value) {
		setConstNumber(offset + 20, $sls_itm_grp_lvl, value);
	}


	/**
	 * Item system cd. 品目体系ＣＤ.<p>
	 *
	 */
	public String sls_itm_grp_cd_ig() {
		return getConstString(offset + 21, $sls_itm_grp_cd_ig);
	}

	/**
	 * Item system cd. 品目体系ＣＤ.<p>
	 *
	 */
	public void sls_itm_grp_cd_ig(String value) {
		setConstString(offset + 21, $sls_itm_grp_cd_ig, value);
	}


	/**
	 * Item system name 品目体系名.<p>
	 *
	 */
	public String sls_itm_grp_nm_ig() {
		return getConstString(offset + 22, $sls_itm_grp_nm_ig);
	}

	/**
	 * Item system name 品目体系名.<p>
	 *
	 */
	public void sls_itm_grp_nm_ig(String value) {
		setConstString(offset + 22, $sls_itm_grp_nm_ig, value);
	}


	public String getString(String name) {
		if ($sls_bdg_grp_d.equalsIgnoreCase(name)) {
			return sls_bdg_grp_d();
		}
		if ($xrate_cd_d.equalsIgnoreCase(name)) {
			return xrate_cd_d();
		}
		if ($xrate_nm_d.equalsIgnoreCase(name)) {
			return xrate_nm_d();
		}
		if ($dpt_lvl_cd_d.equalsIgnoreCase(name)) {
			return dpt_lvl_cd_d();
		}
		if ($dpt_lvl_nm_d.equalsIgnoreCase(name)) {
			return dpt_lvl_nm_d();
		}
		if ($dpt_cd_d.equalsIgnoreCase(name)) {
			return dpt_cd_d();
		}
		if ($dpt_nm_d.equalsIgnoreCase(name)) {
			return dpt_nm_d();
		}
		if ($sls_bdg_grp_ig.equalsIgnoreCase(name)) {
			return sls_bdg_grp_ig();
		}
		if ($xrate_cd_ig.equalsIgnoreCase(name)) {
			return xrate_cd_ig();
		}
		if ($xrate_nm_ig.equalsIgnoreCase(name)) {
			return xrate_nm_ig();
		}
		if ($sls_itm_grp_cd_ig.equalsIgnoreCase(name)) {
			return sls_itm_grp_cd_ig();
		}
		if ($sls_itm_grp_nm_ig.equalsIgnoreCase(name)) {
			return sls_itm_grp_nm_ig();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($sls_disp_term_d.equalsIgnoreCase(name)) {
			return sls_disp_term_d();
		}
		if ($sum_term_d.equalsIgnoreCase(name)) {
			return sum_term_d();
		}
		if ($sls_disp_term_ig.equalsIgnoreCase(name)) {
			return sls_disp_term_ig();
		}
		if ($sum_term_ig.equalsIgnoreCase(name)) {
			return sum_term_ig();
		}
		if ($sls_itm_grp_lvl.equalsIgnoreCase(name)) {
			return sls_itm_grp_lvl();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($inpt_ym_d.equalsIgnoreCase(name)) {
			return inpt_ym_d();
		}
		if ($inpt_ym_ig.equalsIgnoreCase(name)) {
			return inpt_ym_ig();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($sls_trnst_disp_d.equalsIgnoreCase(name)) {
			return sls_trnst_disp_d();
		}
		if ($use_act_xrate_flg_d.equalsIgnoreCase(name)) {
			return use_act_xrate_flg_d();
		}
		if ($sls_trnst_disp_ig.equalsIgnoreCase(name)) {
			return sls_trnst_disp_ig();
		}
		if ($use_act_xrate_flg_ig.equalsIgnoreCase(name)) {
			return use_act_xrate_flg_ig();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($sls_bdg_grp_d.equalsIgnoreCase(name)) {
			return sls_bdg_grp_d();
		}
		if ($xrate_cd_d.equalsIgnoreCase(name)) {
			return xrate_cd_d();
		}
		if ($xrate_nm_d.equalsIgnoreCase(name)) {
			return xrate_nm_d();
		}
		if ($dpt_lvl_cd_d.equalsIgnoreCase(name)) {
			return dpt_lvl_cd_d();
		}
		if ($dpt_lvl_nm_d.equalsIgnoreCase(name)) {
			return dpt_lvl_nm_d();
		}
		if ($dpt_cd_d.equalsIgnoreCase(name)) {
			return dpt_cd_d();
		}
		if ($dpt_nm_d.equalsIgnoreCase(name)) {
			return dpt_nm_d();
		}
		if ($sls_bdg_grp_ig.equalsIgnoreCase(name)) {
			return sls_bdg_grp_ig();
		}
		if ($xrate_cd_ig.equalsIgnoreCase(name)) {
			return xrate_cd_ig();
		}
		if ($xrate_nm_ig.equalsIgnoreCase(name)) {
			return xrate_nm_ig();
		}
		if ($sls_itm_grp_cd_ig.equalsIgnoreCase(name)) {
			return sls_itm_grp_cd_ig();
		}
		if ($sls_itm_grp_nm_ig.equalsIgnoreCase(name)) {
			return sls_itm_grp_nm_ig();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($sls_disp_term_d.equalsIgnoreCase(name)) {
			return sls_disp_term_d();
		}
		if ($sum_term_d.equalsIgnoreCase(name)) {
			return sum_term_d();
		}
		if ($sls_disp_term_ig.equalsIgnoreCase(name)) {
			return sls_disp_term_ig();
		}
		if ($sum_term_ig.equalsIgnoreCase(name)) {
			return sum_term_ig();
		}
		if ($sls_itm_grp_lvl.equalsIgnoreCase(name)) {
			return sls_itm_grp_lvl();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($inpt_ym_d.equalsIgnoreCase(name)) {
			return inpt_ym_d();
		}
		if ($inpt_ym_ig.equalsIgnoreCase(name)) {
			return inpt_ym_ig();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($sls_trnst_disp_d.equalsIgnoreCase(name)) {
			return sls_trnst_disp_d();
		}
		if ($use_act_xrate_flg_d.equalsIgnoreCase(name)) {
			return use_act_xrate_flg_d();
		}
		if ($sls_trnst_disp_ig.equalsIgnoreCase(name)) {
			return sls_trnst_disp_ig();
		}
		if ($use_act_xrate_flg_ig.equalsIgnoreCase(name)) {
			return use_act_xrate_flg_ig();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($sls_bdg_grp_d.equalsIgnoreCase(name)) {
			sls_bdg_grp_d(value);
			return;
		}
		if ($xrate_cd_d.equalsIgnoreCase(name)) {
			xrate_cd_d(value);
			return;
		}
		if ($xrate_nm_d.equalsIgnoreCase(name)) {
			xrate_nm_d(value);
			return;
		}
		if ($dpt_lvl_cd_d.equalsIgnoreCase(name)) {
			dpt_lvl_cd_d(value);
			return;
		}
		if ($dpt_lvl_nm_d.equalsIgnoreCase(name)) {
			dpt_lvl_nm_d(value);
			return;
		}
		if ($dpt_cd_d.equalsIgnoreCase(name)) {
			dpt_cd_d(value);
			return;
		}
		if ($dpt_nm_d.equalsIgnoreCase(name)) {
			dpt_nm_d(value);
			return;
		}
		if ($sls_bdg_grp_ig.equalsIgnoreCase(name)) {
			sls_bdg_grp_ig(value);
			return;
		}
		if ($xrate_cd_ig.equalsIgnoreCase(name)) {
			xrate_cd_ig(value);
			return;
		}
		if ($xrate_nm_ig.equalsIgnoreCase(name)) {
			xrate_nm_ig(value);
			return;
		}
		if ($sls_itm_grp_cd_ig.equalsIgnoreCase(name)) {
			sls_itm_grp_cd_ig(value);
			return;
		}
		if ($sls_itm_grp_nm_ig.equalsIgnoreCase(name)) {
			sls_itm_grp_nm_ig(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($sls_disp_term_d.equalsIgnoreCase(name)) {
			sls_disp_term_d(value);
			return;
		}
		if ($sum_term_d.equalsIgnoreCase(name)) {
			sum_term_d(value);
			return;
		}
		if ($sls_disp_term_ig.equalsIgnoreCase(name)) {
			sls_disp_term_ig(value);
			return;
		}
		if ($sum_term_ig.equalsIgnoreCase(name)) {
			sum_term_ig(value);
			return;
		}
		if ($sls_itm_grp_lvl.equalsIgnoreCase(name)) {
			sls_itm_grp_lvl(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($sls_disp_term_d.equalsIgnoreCase(name)) {
			sls_disp_term_d(value);
			return;
		}
		if ($sum_term_d.equalsIgnoreCase(name)) {
			sum_term_d(value);
			return;
		}
		if ($sls_disp_term_ig.equalsIgnoreCase(name)) {
			sls_disp_term_ig(value);
			return;
		}
		if ($sum_term_ig.equalsIgnoreCase(name)) {
			sum_term_ig(value);
			return;
		}
		if ($sls_itm_grp_lvl.equalsIgnoreCase(name)) {
			sls_itm_grp_lvl(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($sls_disp_term_d.equalsIgnoreCase(name)) {
			sls_disp_term_d(value);
			return;
		}
		if ($sum_term_d.equalsIgnoreCase(name)) {
			sum_term_d(value);
			return;
		}
		if ($sls_disp_term_ig.equalsIgnoreCase(name)) {
			sls_disp_term_ig(value);
			return;
		}
		if ($sum_term_ig.equalsIgnoreCase(name)) {
			sum_term_ig(value);
			return;
		}
		if ($sls_itm_grp_lvl.equalsIgnoreCase(name)) {
			sls_itm_grp_lvl(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($sls_disp_term_d.equalsIgnoreCase(name)) {
			sls_disp_term_d(value);
			return;
		}
		if ($sum_term_d.equalsIgnoreCase(name)) {
			sum_term_d(value);
			return;
		}
		if ($sls_disp_term_ig.equalsIgnoreCase(name)) {
			sls_disp_term_ig(value);
			return;
		}
		if ($sum_term_ig.equalsIgnoreCase(name)) {
			sum_term_ig(value);
			return;
		}
		if ($sls_itm_grp_lvl.equalsIgnoreCase(name)) {
			sls_itm_grp_lvl(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($sls_disp_term_d.equalsIgnoreCase(name)) {
			sls_disp_term_d(value);
			return;
		}
		if ($sum_term_d.equalsIgnoreCase(name)) {
			sum_term_d(value);
			return;
		}
		if ($sls_disp_term_ig.equalsIgnoreCase(name)) {
			sls_disp_term_ig(value);
			return;
		}
		if ($sum_term_ig.equalsIgnoreCase(name)) {
			sum_term_ig(value);
			return;
		}
		if ($sls_itm_grp_lvl.equalsIgnoreCase(name)) {
			sls_itm_grp_lvl(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($inpt_ym_d.equalsIgnoreCase(name)) {
			inpt_ym_d(value);
			return;
		}
		if ($inpt_ym_ig.equalsIgnoreCase(name)) {
			inpt_ym_ig(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($sls_trnst_disp_d.equalsIgnoreCase(name)) {
			sls_trnst_disp_d(value);
			return;
		}
		if ($use_act_xrate_flg_d.equalsIgnoreCase(name)) {
			use_act_xrate_flg_d(value);
			return;
		}
		if ($sls_trnst_disp_ig.equalsIgnoreCase(name)) {
			sls_trnst_disp_ig(value);
			return;
		}
		if ($use_act_xrate_flg_ig.equalsIgnoreCase(name)) {
			use_act_xrate_flg_ig(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($sls_bdg_grp_d.equalsIgnoreCase(name)) {
			sls_bdg_grp_d(value);
			return;
		}
		if ($xrate_cd_d.equalsIgnoreCase(name)) {
			xrate_cd_d(value);
			return;
		}
		if ($xrate_nm_d.equalsIgnoreCase(name)) {
			xrate_nm_d(value);
			return;
		}
		if ($dpt_lvl_cd_d.equalsIgnoreCase(name)) {
			dpt_lvl_cd_d(value);
			return;
		}
		if ($dpt_lvl_nm_d.equalsIgnoreCase(name)) {
			dpt_lvl_nm_d(value);
			return;
		}
		if ($dpt_cd_d.equalsIgnoreCase(name)) {
			dpt_cd_d(value);
			return;
		}
		if ($dpt_nm_d.equalsIgnoreCase(name)) {
			dpt_nm_d(value);
			return;
		}
		if ($sls_bdg_grp_ig.equalsIgnoreCase(name)) {
			sls_bdg_grp_ig(value);
			return;
		}
		if ($xrate_cd_ig.equalsIgnoreCase(name)) {
			xrate_cd_ig(value);
			return;
		}
		if ($xrate_nm_ig.equalsIgnoreCase(name)) {
			xrate_nm_ig(value);
			return;
		}
		if ($sls_itm_grp_cd_ig.equalsIgnoreCase(name)) {
			sls_itm_grp_cd_ig(value);
			return;
		}
		if ($sls_itm_grp_nm_ig.equalsIgnoreCase(name)) {
			sls_itm_grp_nm_ig(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($sls_disp_term_d.equalsIgnoreCase(name)) {
			sls_disp_term_d(value);
			return;
		}
		if ($sum_term_d.equalsIgnoreCase(name)) {
			sum_term_d(value);
			return;
		}
		if ($sls_disp_term_ig.equalsIgnoreCase(name)) {
			sls_disp_term_ig(value);
			return;
		}
		if ($sum_term_ig.equalsIgnoreCase(name)) {
			sum_term_ig(value);
			return;
		}
		if ($sls_itm_grp_lvl.equalsIgnoreCase(name)) {
			sls_itm_grp_lvl(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($sls_disp_term_d.equalsIgnoreCase(name)) {
			sls_disp_term_d(value);
			return;
		}
		if ($sum_term_d.equalsIgnoreCase(name)) {
			sum_term_d(value);
			return;
		}
		if ($sls_disp_term_ig.equalsIgnoreCase(name)) {
			sls_disp_term_ig(value);
			return;
		}
		if ($sum_term_ig.equalsIgnoreCase(name)) {
			sum_term_ig(value);
			return;
		}
		if ($sls_itm_grp_lvl.equalsIgnoreCase(name)) {
			sls_itm_grp_lvl(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($sls_disp_term_d.equalsIgnoreCase(name)) {
			sls_disp_term_d(value);
			return;
		}
		if ($sum_term_d.equalsIgnoreCase(name)) {
			sum_term_d(value);
			return;
		}
		if ($sls_disp_term_ig.equalsIgnoreCase(name)) {
			sls_disp_term_ig(value);
			return;
		}
		if ($sum_term_ig.equalsIgnoreCase(name)) {
			sum_term_ig(value);
			return;
		}
		if ($sls_itm_grp_lvl.equalsIgnoreCase(name)) {
			sls_itm_grp_lvl(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($sls_disp_term_d.equalsIgnoreCase(name)) {
			sls_disp_term_d(value);
			return;
		}
		if ($sum_term_d.equalsIgnoreCase(name)) {
			sum_term_d(value);
			return;
		}
		if ($sls_disp_term_ig.equalsIgnoreCase(name)) {
			sls_disp_term_ig(value);
			return;
		}
		if ($sum_term_ig.equalsIgnoreCase(name)) {
			sum_term_ig(value);
			return;
		}
		if ($sls_itm_grp_lvl.equalsIgnoreCase(name)) {
			sls_itm_grp_lvl(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($sls_disp_term_d.equalsIgnoreCase(name)) {
			sls_disp_term_d(value);
			return;
		}
		if ($sum_term_d.equalsIgnoreCase(name)) {
			sum_term_d(value);
			return;
		}
		if ($sls_disp_term_ig.equalsIgnoreCase(name)) {
			sls_disp_term_ig(value);
			return;
		}
		if ($sum_term_ig.equalsIgnoreCase(name)) {
			sum_term_ig(value);
			return;
		}
		if ($sls_itm_grp_lvl.equalsIgnoreCase(name)) {
			sls_itm_grp_lvl(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($inpt_ym_d.equalsIgnoreCase(name)) {
			inpt_ym_d(value);
			return;
		}
		if ($inpt_ym_ig.equalsIgnoreCase(name)) {
			inpt_ym_ig(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($sls_trnst_disp_d.equalsIgnoreCase(name)) {
			sls_trnst_disp_d(value);
			return;
		}
		if ($use_act_xrate_flg_d.equalsIgnoreCase(name)) {
			use_act_xrate_flg_d(value);
			return;
		}
		if ($sls_trnst_disp_ig.equalsIgnoreCase(name)) {
			sls_trnst_disp_ig(value);
			return;
		}
		if ($use_act_xrate_flg_ig.equalsIgnoreCase(name)) {
			use_act_xrate_flg_ig(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

