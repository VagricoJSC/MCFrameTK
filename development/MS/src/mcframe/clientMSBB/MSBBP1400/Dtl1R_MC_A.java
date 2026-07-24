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
 * ブロック"Dtl1"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Dtl1R_MC_A extends MCConstRow {

	public static final String $dpt_cd = "dpt_cd";
	public static final String $dpt_nm = "dpt_nm";
	public static final String $itm_grp_cd = "itm_grp_cd";
	public static final String $itm_grp_nm = "itm_grp_nm";
	public static final String $row_sort_col = "row_sort_col";
	public static final String $row_title_nm = "row_title_nm";
	public static final String $slo = "slo";
	public static final String $slo_bl = "slo_bl";
	public static final String $sls = "sls";
	public static final String $sum = "sum";
	public static final String $spln = "spln";
	public static final String $spln_per_cmpl_slo = "spln_per_cmpl_slo";
	public static final String $spln_per_cmpl_sls = "spln_per_cmpl_sls";
	public static final String $bdg_sls = "bdg_sls";
	public static final String $bdg_per_cmpl_slo = "bdg_per_cmpl_slo";
	public static final String $bdg_per_cmpl_sls = "bdg_per_cmpl_sls";
	public static final String $col_00 = "col_00";
	public static final String $col_01 = "col_01";
	public static final String $col_02 = "col_02";
	public static final String $col_03 = "col_03";
	public static final String $col_04 = "col_04";
	public static final String $col_05 = "col_05";
	public static final String $col_06 = "col_06";
	public static final String $col_07 = "col_07";
	public static final String $col_08 = "col_08";
	public static final String $col_09 = "col_09";
	public static final String $col_10 = "col_10";
	public static final String $col_11 = "col_11";
	public static final String $col_12 = "col_12";
	public static final String $col_13 = "col_13";
	public static final String $col_14 = "col_14";
	public static final String $col_15 = "col_15";
	public static final String $col_16 = "col_16";
	public static final String $col_17 = "col_17";
	public static final String $amt_dec_place = "amt_dec_place";
	public static final String $rate_dec_place = "rate_dec_place";
	public static final String $dpt1_key = "dpt1_key";
	public static final String $dpt_nm1_key = "dpt_nm1_key";
	public static final String $dpt2_key = "dpt2_key";
	public static final String $dpt_nm2_key = "dpt_nm2_key";
	public static final String $itm_grp1_key = "itm_grp1_key";
	public static final String $itm_grp_nm1_key = "itm_grp_nm1_key";
	public static final String $itm_grp2_key = "itm_grp2_key";
	public static final String $itm_grp_nm2_key = "itm_grp_nm2_key";


	public static final MCMeta dpt_cd_META = createCommonMeta($dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta dpt_nm_META = createCommonMeta($dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta itm_grp_cd_META = createCommonMeta($itm_grp_cd, mcframe.commonMA.meta.MA_META.SLS_ITM_GRP_CD);
	public static final MCMeta itm_grp_nm_META = createCommonMeta($itm_grp_nm, mcframe.commonMA.meta.MA_META.SLS_ITM_GRP_NM);
	public static final MCMeta row_sort_col_META = createNumberMeta($row_sort_col);
	public static final MCMeta row_title_nm_META = createStringMeta($row_title_nm, 30);
	public static final MCMeta slo_META = createNumberMeta($slo, 30, 0, false);
	public static final MCMeta slo_bl_META = createNumberMeta($slo_bl, 30, 0, false);
	public static final MCMeta sls_META = createNumberMeta($sls, 30, 0, false);
	public static final MCMeta sum_META = createNumberMeta($sum, 30, 0, false);
	public static final MCMeta spln_META = createNumberMeta($spln, 30, 0, false);
	public static final MCMeta spln_per_cmpl_slo_META = createNumberMeta($spln_per_cmpl_slo, 30, 0, false);
	public static final MCMeta spln_per_cmpl_sls_META = createNumberMeta($spln_per_cmpl_sls, 30, 0, false);
	public static final MCMeta bdg_sls_META = createNumberMeta($bdg_sls, 30, 0, false);
	public static final MCMeta bdg_per_cmpl_slo_META = createNumberMeta($bdg_per_cmpl_slo, 30, 0, false);
	public static final MCMeta bdg_per_cmpl_sls_META = createNumberMeta($bdg_per_cmpl_sls, 30, 0, false);
	public static final MCMeta col_00_META = createNumberMeta($col_00, 30, 0, false);
	public static final MCMeta col_01_META = createNumberMeta($col_01, 30, 0, false);
	public static final MCMeta col_02_META = createNumberMeta($col_02, 30, 0, false);
	public static final MCMeta col_03_META = createNumberMeta($col_03, 30, 0, false);
	public static final MCMeta col_04_META = createNumberMeta($col_04, 30, 0, false);
	public static final MCMeta col_05_META = createNumberMeta($col_05, 30, 0, false);
	public static final MCMeta col_06_META = createNumberMeta($col_06, 30, 0, false);
	public static final MCMeta col_07_META = createNumberMeta($col_07, 30, 0, false);
	public static final MCMeta col_08_META = createNumberMeta($col_08, 30, 0, false);
	public static final MCMeta col_09_META = createNumberMeta($col_09, 30, 0, false);
	public static final MCMeta col_10_META = createNumberMeta($col_10, 30, 0, false);
	public static final MCMeta col_11_META = createNumberMeta($col_11, 30, 0, false);
	public static final MCMeta col_12_META = createNumberMeta($col_12, 30, 0, false);
	public static final MCMeta col_13_META = createNumberMeta($col_13, 30, 0, false);
	public static final MCMeta col_14_META = createNumberMeta($col_14, 30, 0, false);
	public static final MCMeta col_15_META = createNumberMeta($col_15, 30, 0, false);
	public static final MCMeta col_16_META = createNumberMeta($col_16, 30, 0, false);
	public static final MCMeta col_17_META = createNumberMeta($col_17, 30, 0, false);
	public static final MCMeta amt_dec_place_META = createCommonMeta($amt_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta rate_dec_place_META = createCommonMeta($rate_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta dpt1_key_META = createCommonMeta($dpt1_key, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta dpt_nm1_key_META = createCommonMeta($dpt_nm1_key, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta dpt2_key_META = createCommonMeta($dpt2_key, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta dpt_nm2_key_META = createCommonMeta($dpt_nm2_key, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta itm_grp1_key_META = createCommonMeta($itm_grp1_key, mcframe.commonMA.meta.MA_META.SLS_ITM_GRP_CD);
	public static final MCMeta itm_grp_nm1_key_META = createCommonMeta($itm_grp_nm1_key, mcframe.commonMA.meta.MA_META.SLS_ITM_GRP_NM);
	public static final MCMeta itm_grp2_key_META = createCommonMeta($itm_grp2_key, mcframe.commonMA.meta.MA_META.SLS_ITM_GRP_CD);
	public static final MCMeta itm_grp_nm2_key_META = createCommonMeta($itm_grp_nm2_key, mcframe.commonMA.meta.MA_META.SLS_ITM_GRP_NM);

	protected static final ConstMetaList<Dtl1R> constMetas = new ConstMetaList<Dtl1R>(
		MCConstRow.constMetas,
		new MCMeta[]{
			dpt_cd_META,
			dpt_nm_META,
			itm_grp_cd_META,
			itm_grp_nm_META,
			row_sort_col_META,
			row_title_nm_META,
			slo_META,
			slo_bl_META,
			sls_META,
			sum_META,
			spln_META,
			spln_per_cmpl_slo_META,
			spln_per_cmpl_sls_META,
			bdg_sls_META,
			bdg_per_cmpl_slo_META,
			bdg_per_cmpl_sls_META,
			col_00_META,
			col_01_META,
			col_02_META,
			col_03_META,
			col_04_META,
			col_05_META,
			col_06_META,
			col_07_META,
			col_08_META,
			col_09_META,
			col_10_META,
			col_11_META,
			col_12_META,
			col_13_META,
			col_14_META,
			col_15_META,
			col_16_META,
			col_17_META,
			amt_dec_place_META,
			rate_dec_place_META,
			dpt1_key_META,
			dpt_nm1_key_META,
			dpt2_key_META,
			dpt_nm2_key_META,
			itm_grp1_key_META,
			itm_grp_nm1_key_META,
			itm_grp2_key_META,
			itm_grp_nm2_key_META
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
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
			new String[][]{
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
	protected Dtl1R_MC_A(ConstMetaList<? extends Dtl1R> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Dtl1R clone() {
		return (Dtl1R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Dtl1R createInstance() {
		return (Dtl1R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Dtl1R getValues(String... names) {
		return (Dtl1R) super.getValues(names);
	}



	public String dpt_cd() {
		return getConstString(offset + 0, $dpt_cd);
	}

	public void dpt_cd(String value) {
		setConstString(offset + 0, $dpt_cd, value);
	}


	public String dpt_nm() {
		return getConstString(offset + 1, $dpt_nm);
	}

	public void dpt_nm(String value) {
		setConstString(offset + 1, $dpt_nm, value);
	}


	public String itm_grp_cd() {
		return getConstString(offset + 2, $itm_grp_cd);
	}

	public void itm_grp_cd(String value) {
		setConstString(offset + 2, $itm_grp_cd, value);
	}


	public String itm_grp_nm() {
		return getConstString(offset + 3, $itm_grp_nm);
	}

	public void itm_grp_nm(String value) {
		setConstString(offset + 3, $itm_grp_nm, value);
	}


	public MCNumber row_sort_col() {
		return getConstNumber(offset + 4, $row_sort_col);
	}

	public void row_sort_col(MCNumber value) {
		setConstNumber(offset + 4, $row_sort_col, value);
	}

	public void row_sort_col(int value) {
		setConstNumber(offset + 4, $row_sort_col, value);
	}

	public void row_sort_col(long value) {
		setConstNumber(offset + 4, $row_sort_col, value);
	}

	public void row_sort_col(float value) {
		setConstNumber(offset + 4, $row_sort_col, value);
	}

	public void row_sort_col(double value) {
		setConstNumber(offset + 4, $row_sort_col, value);
	}


	public String row_title_nm() {
		return getConstString(offset + 5, $row_title_nm);
	}

	public void row_title_nm(String value) {
		setConstString(offset + 5, $row_title_nm, value);
	}


	public MCNumber slo() {
		return getConstNumber(offset + 6, $slo);
	}

	public void slo(MCNumber value) {
		setConstNumber(offset + 6, $slo, value);
	}

	public void slo(int value) {
		setConstNumber(offset + 6, $slo, value);
	}

	public void slo(long value) {
		setConstNumber(offset + 6, $slo, value);
	}

	public void slo(float value) {
		setConstNumber(offset + 6, $slo, value);
	}

	public void slo(double value) {
		setConstNumber(offset + 6, $slo, value);
	}


	public MCNumber slo_bl() {
		return getConstNumber(offset + 7, $slo_bl);
	}

	public void slo_bl(MCNumber value) {
		setConstNumber(offset + 7, $slo_bl, value);
	}

	public void slo_bl(int value) {
		setConstNumber(offset + 7, $slo_bl, value);
	}

	public void slo_bl(long value) {
		setConstNumber(offset + 7, $slo_bl, value);
	}

	public void slo_bl(float value) {
		setConstNumber(offset + 7, $slo_bl, value);
	}

	public void slo_bl(double value) {
		setConstNumber(offset + 7, $slo_bl, value);
	}


	public MCNumber sls() {
		return getConstNumber(offset + 8, $sls);
	}

	public void sls(MCNumber value) {
		setConstNumber(offset + 8, $sls, value);
	}

	public void sls(int value) {
		setConstNumber(offset + 8, $sls, value);
	}

	public void sls(long value) {
		setConstNumber(offset + 8, $sls, value);
	}

	public void sls(float value) {
		setConstNumber(offset + 8, $sls, value);
	}

	public void sls(double value) {
		setConstNumber(offset + 8, $sls, value);
	}


	public MCNumber sum() {
		return getConstNumber(offset + 9, $sum);
	}

	public void sum(MCNumber value) {
		setConstNumber(offset + 9, $sum, value);
	}

	public void sum(int value) {
		setConstNumber(offset + 9, $sum, value);
	}

	public void sum(long value) {
		setConstNumber(offset + 9, $sum, value);
	}

	public void sum(float value) {
		setConstNumber(offset + 9, $sum, value);
	}

	public void sum(double value) {
		setConstNumber(offset + 9, $sum, value);
	}


	public MCNumber spln() {
		return getConstNumber(offset + 10, $spln);
	}

	public void spln(MCNumber value) {
		setConstNumber(offset + 10, $spln, value);
	}

	public void spln(int value) {
		setConstNumber(offset + 10, $spln, value);
	}

	public void spln(long value) {
		setConstNumber(offset + 10, $spln, value);
	}

	public void spln(float value) {
		setConstNumber(offset + 10, $spln, value);
	}

	public void spln(double value) {
		setConstNumber(offset + 10, $spln, value);
	}


	public MCNumber spln_per_cmpl_slo() {
		return getConstNumber(offset + 11, $spln_per_cmpl_slo);
	}

	public void spln_per_cmpl_slo(MCNumber value) {
		setConstNumber(offset + 11, $spln_per_cmpl_slo, value);
	}

	public void spln_per_cmpl_slo(int value) {
		setConstNumber(offset + 11, $spln_per_cmpl_slo, value);
	}

	public void spln_per_cmpl_slo(long value) {
		setConstNumber(offset + 11, $spln_per_cmpl_slo, value);
	}

	public void spln_per_cmpl_slo(float value) {
		setConstNumber(offset + 11, $spln_per_cmpl_slo, value);
	}

	public void spln_per_cmpl_slo(double value) {
		setConstNumber(offset + 11, $spln_per_cmpl_slo, value);
	}


	public MCNumber spln_per_cmpl_sls() {
		return getConstNumber(offset + 12, $spln_per_cmpl_sls);
	}

	public void spln_per_cmpl_sls(MCNumber value) {
		setConstNumber(offset + 12, $spln_per_cmpl_sls, value);
	}

	public void spln_per_cmpl_sls(int value) {
		setConstNumber(offset + 12, $spln_per_cmpl_sls, value);
	}

	public void spln_per_cmpl_sls(long value) {
		setConstNumber(offset + 12, $spln_per_cmpl_sls, value);
	}

	public void spln_per_cmpl_sls(float value) {
		setConstNumber(offset + 12, $spln_per_cmpl_sls, value);
	}

	public void spln_per_cmpl_sls(double value) {
		setConstNumber(offset + 12, $spln_per_cmpl_sls, value);
	}


	public MCNumber bdg_sls() {
		return getConstNumber(offset + 13, $bdg_sls);
	}

	public void bdg_sls(MCNumber value) {
		setConstNumber(offset + 13, $bdg_sls, value);
	}

	public void bdg_sls(int value) {
		setConstNumber(offset + 13, $bdg_sls, value);
	}

	public void bdg_sls(long value) {
		setConstNumber(offset + 13, $bdg_sls, value);
	}

	public void bdg_sls(float value) {
		setConstNumber(offset + 13, $bdg_sls, value);
	}

	public void bdg_sls(double value) {
		setConstNumber(offset + 13, $bdg_sls, value);
	}


	public MCNumber bdg_per_cmpl_slo() {
		return getConstNumber(offset + 14, $bdg_per_cmpl_slo);
	}

	public void bdg_per_cmpl_slo(MCNumber value) {
		setConstNumber(offset + 14, $bdg_per_cmpl_slo, value);
	}

	public void bdg_per_cmpl_slo(int value) {
		setConstNumber(offset + 14, $bdg_per_cmpl_slo, value);
	}

	public void bdg_per_cmpl_slo(long value) {
		setConstNumber(offset + 14, $bdg_per_cmpl_slo, value);
	}

	public void bdg_per_cmpl_slo(float value) {
		setConstNumber(offset + 14, $bdg_per_cmpl_slo, value);
	}

	public void bdg_per_cmpl_slo(double value) {
		setConstNumber(offset + 14, $bdg_per_cmpl_slo, value);
	}


	public MCNumber bdg_per_cmpl_sls() {
		return getConstNumber(offset + 15, $bdg_per_cmpl_sls);
	}

	public void bdg_per_cmpl_sls(MCNumber value) {
		setConstNumber(offset + 15, $bdg_per_cmpl_sls, value);
	}

	public void bdg_per_cmpl_sls(int value) {
		setConstNumber(offset + 15, $bdg_per_cmpl_sls, value);
	}

	public void bdg_per_cmpl_sls(long value) {
		setConstNumber(offset + 15, $bdg_per_cmpl_sls, value);
	}

	public void bdg_per_cmpl_sls(float value) {
		setConstNumber(offset + 15, $bdg_per_cmpl_sls, value);
	}

	public void bdg_per_cmpl_sls(double value) {
		setConstNumber(offset + 15, $bdg_per_cmpl_sls, value);
	}


	public MCNumber col_00() {
		return getConstNumber(offset + 16, $col_00);
	}

	public void col_00(MCNumber value) {
		setConstNumber(offset + 16, $col_00, value);
	}

	public void col_00(int value) {
		setConstNumber(offset + 16, $col_00, value);
	}

	public void col_00(long value) {
		setConstNumber(offset + 16, $col_00, value);
	}

	public void col_00(float value) {
		setConstNumber(offset + 16, $col_00, value);
	}

	public void col_00(double value) {
		setConstNumber(offset + 16, $col_00, value);
	}


	public MCNumber col_01() {
		return getConstNumber(offset + 17, $col_01);
	}

	public void col_01(MCNumber value) {
		setConstNumber(offset + 17, $col_01, value);
	}

	public void col_01(int value) {
		setConstNumber(offset + 17, $col_01, value);
	}

	public void col_01(long value) {
		setConstNumber(offset + 17, $col_01, value);
	}

	public void col_01(float value) {
		setConstNumber(offset + 17, $col_01, value);
	}

	public void col_01(double value) {
		setConstNumber(offset + 17, $col_01, value);
	}


	public MCNumber col_02() {
		return getConstNumber(offset + 18, $col_02);
	}

	public void col_02(MCNumber value) {
		setConstNumber(offset + 18, $col_02, value);
	}

	public void col_02(int value) {
		setConstNumber(offset + 18, $col_02, value);
	}

	public void col_02(long value) {
		setConstNumber(offset + 18, $col_02, value);
	}

	public void col_02(float value) {
		setConstNumber(offset + 18, $col_02, value);
	}

	public void col_02(double value) {
		setConstNumber(offset + 18, $col_02, value);
	}


	public MCNumber col_03() {
		return getConstNumber(offset + 19, $col_03);
	}

	public void col_03(MCNumber value) {
		setConstNumber(offset + 19, $col_03, value);
	}

	public void col_03(int value) {
		setConstNumber(offset + 19, $col_03, value);
	}

	public void col_03(long value) {
		setConstNumber(offset + 19, $col_03, value);
	}

	public void col_03(float value) {
		setConstNumber(offset + 19, $col_03, value);
	}

	public void col_03(double value) {
		setConstNumber(offset + 19, $col_03, value);
	}


	public MCNumber col_04() {
		return getConstNumber(offset + 20, $col_04);
	}

	public void col_04(MCNumber value) {
		setConstNumber(offset + 20, $col_04, value);
	}

	public void col_04(int value) {
		setConstNumber(offset + 20, $col_04, value);
	}

	public void col_04(long value) {
		setConstNumber(offset + 20, $col_04, value);
	}

	public void col_04(float value) {
		setConstNumber(offset + 20, $col_04, value);
	}

	public void col_04(double value) {
		setConstNumber(offset + 20, $col_04, value);
	}


	public MCNumber col_05() {
		return getConstNumber(offset + 21, $col_05);
	}

	public void col_05(MCNumber value) {
		setConstNumber(offset + 21, $col_05, value);
	}

	public void col_05(int value) {
		setConstNumber(offset + 21, $col_05, value);
	}

	public void col_05(long value) {
		setConstNumber(offset + 21, $col_05, value);
	}

	public void col_05(float value) {
		setConstNumber(offset + 21, $col_05, value);
	}

	public void col_05(double value) {
		setConstNumber(offset + 21, $col_05, value);
	}


	public MCNumber col_06() {
		return getConstNumber(offset + 22, $col_06);
	}

	public void col_06(MCNumber value) {
		setConstNumber(offset + 22, $col_06, value);
	}

	public void col_06(int value) {
		setConstNumber(offset + 22, $col_06, value);
	}

	public void col_06(long value) {
		setConstNumber(offset + 22, $col_06, value);
	}

	public void col_06(float value) {
		setConstNumber(offset + 22, $col_06, value);
	}

	public void col_06(double value) {
		setConstNumber(offset + 22, $col_06, value);
	}


	public MCNumber col_07() {
		return getConstNumber(offset + 23, $col_07);
	}

	public void col_07(MCNumber value) {
		setConstNumber(offset + 23, $col_07, value);
	}

	public void col_07(int value) {
		setConstNumber(offset + 23, $col_07, value);
	}

	public void col_07(long value) {
		setConstNumber(offset + 23, $col_07, value);
	}

	public void col_07(float value) {
		setConstNumber(offset + 23, $col_07, value);
	}

	public void col_07(double value) {
		setConstNumber(offset + 23, $col_07, value);
	}


	public MCNumber col_08() {
		return getConstNumber(offset + 24, $col_08);
	}

	public void col_08(MCNumber value) {
		setConstNumber(offset + 24, $col_08, value);
	}

	public void col_08(int value) {
		setConstNumber(offset + 24, $col_08, value);
	}

	public void col_08(long value) {
		setConstNumber(offset + 24, $col_08, value);
	}

	public void col_08(float value) {
		setConstNumber(offset + 24, $col_08, value);
	}

	public void col_08(double value) {
		setConstNumber(offset + 24, $col_08, value);
	}


	public MCNumber col_09() {
		return getConstNumber(offset + 25, $col_09);
	}

	public void col_09(MCNumber value) {
		setConstNumber(offset + 25, $col_09, value);
	}

	public void col_09(int value) {
		setConstNumber(offset + 25, $col_09, value);
	}

	public void col_09(long value) {
		setConstNumber(offset + 25, $col_09, value);
	}

	public void col_09(float value) {
		setConstNumber(offset + 25, $col_09, value);
	}

	public void col_09(double value) {
		setConstNumber(offset + 25, $col_09, value);
	}


	public MCNumber col_10() {
		return getConstNumber(offset + 26, $col_10);
	}

	public void col_10(MCNumber value) {
		setConstNumber(offset + 26, $col_10, value);
	}

	public void col_10(int value) {
		setConstNumber(offset + 26, $col_10, value);
	}

	public void col_10(long value) {
		setConstNumber(offset + 26, $col_10, value);
	}

	public void col_10(float value) {
		setConstNumber(offset + 26, $col_10, value);
	}

	public void col_10(double value) {
		setConstNumber(offset + 26, $col_10, value);
	}


	public MCNumber col_11() {
		return getConstNumber(offset + 27, $col_11);
	}

	public void col_11(MCNumber value) {
		setConstNumber(offset + 27, $col_11, value);
	}

	public void col_11(int value) {
		setConstNumber(offset + 27, $col_11, value);
	}

	public void col_11(long value) {
		setConstNumber(offset + 27, $col_11, value);
	}

	public void col_11(float value) {
		setConstNumber(offset + 27, $col_11, value);
	}

	public void col_11(double value) {
		setConstNumber(offset + 27, $col_11, value);
	}


	public MCNumber col_12() {
		return getConstNumber(offset + 28, $col_12);
	}

	public void col_12(MCNumber value) {
		setConstNumber(offset + 28, $col_12, value);
	}

	public void col_12(int value) {
		setConstNumber(offset + 28, $col_12, value);
	}

	public void col_12(long value) {
		setConstNumber(offset + 28, $col_12, value);
	}

	public void col_12(float value) {
		setConstNumber(offset + 28, $col_12, value);
	}

	public void col_12(double value) {
		setConstNumber(offset + 28, $col_12, value);
	}


	public MCNumber col_13() {
		return getConstNumber(offset + 29, $col_13);
	}

	public void col_13(MCNumber value) {
		setConstNumber(offset + 29, $col_13, value);
	}

	public void col_13(int value) {
		setConstNumber(offset + 29, $col_13, value);
	}

	public void col_13(long value) {
		setConstNumber(offset + 29, $col_13, value);
	}

	public void col_13(float value) {
		setConstNumber(offset + 29, $col_13, value);
	}

	public void col_13(double value) {
		setConstNumber(offset + 29, $col_13, value);
	}


	public MCNumber col_14() {
		return getConstNumber(offset + 30, $col_14);
	}

	public void col_14(MCNumber value) {
		setConstNumber(offset + 30, $col_14, value);
	}

	public void col_14(int value) {
		setConstNumber(offset + 30, $col_14, value);
	}

	public void col_14(long value) {
		setConstNumber(offset + 30, $col_14, value);
	}

	public void col_14(float value) {
		setConstNumber(offset + 30, $col_14, value);
	}

	public void col_14(double value) {
		setConstNumber(offset + 30, $col_14, value);
	}


	public MCNumber col_15() {
		return getConstNumber(offset + 31, $col_15);
	}

	public void col_15(MCNumber value) {
		setConstNumber(offset + 31, $col_15, value);
	}

	public void col_15(int value) {
		setConstNumber(offset + 31, $col_15, value);
	}

	public void col_15(long value) {
		setConstNumber(offset + 31, $col_15, value);
	}

	public void col_15(float value) {
		setConstNumber(offset + 31, $col_15, value);
	}

	public void col_15(double value) {
		setConstNumber(offset + 31, $col_15, value);
	}


	public MCNumber col_16() {
		return getConstNumber(offset + 32, $col_16);
	}

	public void col_16(MCNumber value) {
		setConstNumber(offset + 32, $col_16, value);
	}

	public void col_16(int value) {
		setConstNumber(offset + 32, $col_16, value);
	}

	public void col_16(long value) {
		setConstNumber(offset + 32, $col_16, value);
	}

	public void col_16(float value) {
		setConstNumber(offset + 32, $col_16, value);
	}

	public void col_16(double value) {
		setConstNumber(offset + 32, $col_16, value);
	}


	public MCNumber col_17() {
		return getConstNumber(offset + 33, $col_17);
	}

	public void col_17(MCNumber value) {
		setConstNumber(offset + 33, $col_17, value);
	}

	public void col_17(int value) {
		setConstNumber(offset + 33, $col_17, value);
	}

	public void col_17(long value) {
		setConstNumber(offset + 33, $col_17, value);
	}

	public void col_17(float value) {
		setConstNumber(offset + 33, $col_17, value);
	}

	public void col_17(double value) {
		setConstNumber(offset + 33, $col_17, value);
	}


	public MCNumber amt_dec_place() {
		return getConstNumber(offset + 34, $amt_dec_place);
	}

	public void amt_dec_place(MCNumber value) {
		setConstNumber(offset + 34, $amt_dec_place, value);
	}

	public void amt_dec_place(int value) {
		setConstNumber(offset + 34, $amt_dec_place, value);
	}

	public void amt_dec_place(long value) {
		setConstNumber(offset + 34, $amt_dec_place, value);
	}

	public void amt_dec_place(float value) {
		setConstNumber(offset + 34, $amt_dec_place, value);
	}

	public void amt_dec_place(double value) {
		setConstNumber(offset + 34, $amt_dec_place, value);
	}


	public MCNumber rate_dec_place() {
		return getConstNumber(offset + 35, $rate_dec_place);
	}

	public void rate_dec_place(MCNumber value) {
		setConstNumber(offset + 35, $rate_dec_place, value);
	}

	public void rate_dec_place(int value) {
		setConstNumber(offset + 35, $rate_dec_place, value);
	}

	public void rate_dec_place(long value) {
		setConstNumber(offset + 35, $rate_dec_place, value);
	}

	public void rate_dec_place(float value) {
		setConstNumber(offset + 35, $rate_dec_place, value);
	}

	public void rate_dec_place(double value) {
		setConstNumber(offset + 35, $rate_dec_place, value);
	}


	public String dpt1_key() {
		return getConstString(offset + 36, $dpt1_key);
	}

	public void dpt1_key(String value) {
		setConstString(offset + 36, $dpt1_key, value);
	}


	public String dpt_nm1_key() {
		return getConstString(offset + 37, $dpt_nm1_key);
	}

	public void dpt_nm1_key(String value) {
		setConstString(offset + 37, $dpt_nm1_key, value);
	}


	public String dpt2_key() {
		return getConstString(offset + 38, $dpt2_key);
	}

	public void dpt2_key(String value) {
		setConstString(offset + 38, $dpt2_key, value);
	}


	public String dpt_nm2_key() {
		return getConstString(offset + 39, $dpt_nm2_key);
	}

	public void dpt_nm2_key(String value) {
		setConstString(offset + 39, $dpt_nm2_key, value);
	}


	public String itm_grp1_key() {
		return getConstString(offset + 40, $itm_grp1_key);
	}

	public void itm_grp1_key(String value) {
		setConstString(offset + 40, $itm_grp1_key, value);
	}


	public String itm_grp_nm1_key() {
		return getConstString(offset + 41, $itm_grp_nm1_key);
	}

	public void itm_grp_nm1_key(String value) {
		setConstString(offset + 41, $itm_grp_nm1_key, value);
	}


	public String itm_grp2_key() {
		return getConstString(offset + 42, $itm_grp2_key);
	}

	public void itm_grp2_key(String value) {
		setConstString(offset + 42, $itm_grp2_key, value);
	}


	public String itm_grp_nm2_key() {
		return getConstString(offset + 43, $itm_grp_nm2_key);
	}

	public void itm_grp_nm2_key(String value) {
		setConstString(offset + 43, $itm_grp_nm2_key, value);
	}


	public String getString(String name) {
		if ($dpt_cd.equalsIgnoreCase(name)) {
			return dpt_cd();
		}
		if ($dpt_nm.equalsIgnoreCase(name)) {
			return dpt_nm();
		}
		if ($itm_grp_cd.equalsIgnoreCase(name)) {
			return itm_grp_cd();
		}
		if ($itm_grp_nm.equalsIgnoreCase(name)) {
			return itm_grp_nm();
		}
		if ($row_title_nm.equalsIgnoreCase(name)) {
			return row_title_nm();
		}
		if ($dpt1_key.equalsIgnoreCase(name)) {
			return dpt1_key();
		}
		if ($dpt_nm1_key.equalsIgnoreCase(name)) {
			return dpt_nm1_key();
		}
		if ($dpt2_key.equalsIgnoreCase(name)) {
			return dpt2_key();
		}
		if ($dpt_nm2_key.equalsIgnoreCase(name)) {
			return dpt_nm2_key();
		}
		if ($itm_grp1_key.equalsIgnoreCase(name)) {
			return itm_grp1_key();
		}
		if ($itm_grp_nm1_key.equalsIgnoreCase(name)) {
			return itm_grp_nm1_key();
		}
		if ($itm_grp2_key.equalsIgnoreCase(name)) {
			return itm_grp2_key();
		}
		if ($itm_grp_nm2_key.equalsIgnoreCase(name)) {
			return itm_grp_nm2_key();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($row_sort_col.equalsIgnoreCase(name)) {
			return row_sort_col();
		}
		if ($slo.equalsIgnoreCase(name)) {
			return slo();
		}
		if ($slo_bl.equalsIgnoreCase(name)) {
			return slo_bl();
		}
		if ($sls.equalsIgnoreCase(name)) {
			return sls();
		}
		if ($sum.equalsIgnoreCase(name)) {
			return sum();
		}
		if ($spln.equalsIgnoreCase(name)) {
			return spln();
		}
		if ($spln_per_cmpl_slo.equalsIgnoreCase(name)) {
			return spln_per_cmpl_slo();
		}
		if ($spln_per_cmpl_sls.equalsIgnoreCase(name)) {
			return spln_per_cmpl_sls();
		}
		if ($bdg_sls.equalsIgnoreCase(name)) {
			return bdg_sls();
		}
		if ($bdg_per_cmpl_slo.equalsIgnoreCase(name)) {
			return bdg_per_cmpl_slo();
		}
		if ($bdg_per_cmpl_sls.equalsIgnoreCase(name)) {
			return bdg_per_cmpl_sls();
		}
		if ($col_00.equalsIgnoreCase(name)) {
			return col_00();
		}
		if ($col_01.equalsIgnoreCase(name)) {
			return col_01();
		}
		if ($col_02.equalsIgnoreCase(name)) {
			return col_02();
		}
		if ($col_03.equalsIgnoreCase(name)) {
			return col_03();
		}
		if ($col_04.equalsIgnoreCase(name)) {
			return col_04();
		}
		if ($col_05.equalsIgnoreCase(name)) {
			return col_05();
		}
		if ($col_06.equalsIgnoreCase(name)) {
			return col_06();
		}
		if ($col_07.equalsIgnoreCase(name)) {
			return col_07();
		}
		if ($col_08.equalsIgnoreCase(name)) {
			return col_08();
		}
		if ($col_09.equalsIgnoreCase(name)) {
			return col_09();
		}
		if ($col_10.equalsIgnoreCase(name)) {
			return col_10();
		}
		if ($col_11.equalsIgnoreCase(name)) {
			return col_11();
		}
		if ($col_12.equalsIgnoreCase(name)) {
			return col_12();
		}
		if ($col_13.equalsIgnoreCase(name)) {
			return col_13();
		}
		if ($col_14.equalsIgnoreCase(name)) {
			return col_14();
		}
		if ($col_15.equalsIgnoreCase(name)) {
			return col_15();
		}
		if ($col_16.equalsIgnoreCase(name)) {
			return col_16();
		}
		if ($col_17.equalsIgnoreCase(name)) {
			return col_17();
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			return amt_dec_place();
		}
		if ($rate_dec_place.equalsIgnoreCase(name)) {
			return rate_dec_place();
		}
		return super.getNumber(name);
	}

	public String getStringNE(String name) {
		if ($dpt_cd.equalsIgnoreCase(name)) {
			return dpt_cd();
		}
		if ($dpt_nm.equalsIgnoreCase(name)) {
			return dpt_nm();
		}
		if ($itm_grp_cd.equalsIgnoreCase(name)) {
			return itm_grp_cd();
		}
		if ($itm_grp_nm.equalsIgnoreCase(name)) {
			return itm_grp_nm();
		}
		if ($row_title_nm.equalsIgnoreCase(name)) {
			return row_title_nm();
		}
		if ($dpt1_key.equalsIgnoreCase(name)) {
			return dpt1_key();
		}
		if ($dpt_nm1_key.equalsIgnoreCase(name)) {
			return dpt_nm1_key();
		}
		if ($dpt2_key.equalsIgnoreCase(name)) {
			return dpt2_key();
		}
		if ($dpt_nm2_key.equalsIgnoreCase(name)) {
			return dpt_nm2_key();
		}
		if ($itm_grp1_key.equalsIgnoreCase(name)) {
			return itm_grp1_key();
		}
		if ($itm_grp_nm1_key.equalsIgnoreCase(name)) {
			return itm_grp_nm1_key();
		}
		if ($itm_grp2_key.equalsIgnoreCase(name)) {
			return itm_grp2_key();
		}
		if ($itm_grp_nm2_key.equalsIgnoreCase(name)) {
			return itm_grp_nm2_key();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($row_sort_col.equalsIgnoreCase(name)) {
			return row_sort_col();
		}
		if ($slo.equalsIgnoreCase(name)) {
			return slo();
		}
		if ($slo_bl.equalsIgnoreCase(name)) {
			return slo_bl();
		}
		if ($sls.equalsIgnoreCase(name)) {
			return sls();
		}
		if ($sum.equalsIgnoreCase(name)) {
			return sum();
		}
		if ($spln.equalsIgnoreCase(name)) {
			return spln();
		}
		if ($spln_per_cmpl_slo.equalsIgnoreCase(name)) {
			return spln_per_cmpl_slo();
		}
		if ($spln_per_cmpl_sls.equalsIgnoreCase(name)) {
			return spln_per_cmpl_sls();
		}
		if ($bdg_sls.equalsIgnoreCase(name)) {
			return bdg_sls();
		}
		if ($bdg_per_cmpl_slo.equalsIgnoreCase(name)) {
			return bdg_per_cmpl_slo();
		}
		if ($bdg_per_cmpl_sls.equalsIgnoreCase(name)) {
			return bdg_per_cmpl_sls();
		}
		if ($col_00.equalsIgnoreCase(name)) {
			return col_00();
		}
		if ($col_01.equalsIgnoreCase(name)) {
			return col_01();
		}
		if ($col_02.equalsIgnoreCase(name)) {
			return col_02();
		}
		if ($col_03.equalsIgnoreCase(name)) {
			return col_03();
		}
		if ($col_04.equalsIgnoreCase(name)) {
			return col_04();
		}
		if ($col_05.equalsIgnoreCase(name)) {
			return col_05();
		}
		if ($col_06.equalsIgnoreCase(name)) {
			return col_06();
		}
		if ($col_07.equalsIgnoreCase(name)) {
			return col_07();
		}
		if ($col_08.equalsIgnoreCase(name)) {
			return col_08();
		}
		if ($col_09.equalsIgnoreCase(name)) {
			return col_09();
		}
		if ($col_10.equalsIgnoreCase(name)) {
			return col_10();
		}
		if ($col_11.equalsIgnoreCase(name)) {
			return col_11();
		}
		if ($col_12.equalsIgnoreCase(name)) {
			return col_12();
		}
		if ($col_13.equalsIgnoreCase(name)) {
			return col_13();
		}
		if ($col_14.equalsIgnoreCase(name)) {
			return col_14();
		}
		if ($col_15.equalsIgnoreCase(name)) {
			return col_15();
		}
		if ($col_16.equalsIgnoreCase(name)) {
			return col_16();
		}
		if ($col_17.equalsIgnoreCase(name)) {
			return col_17();
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			return amt_dec_place();
		}
		if ($rate_dec_place.equalsIgnoreCase(name)) {
			return rate_dec_place();
		}
		return super.getNumberNE(name);
	}

	public void setString(String name, String value) {
		if ($dpt_cd.equalsIgnoreCase(name)) {
			dpt_cd(value);
			return;
		}
		if ($dpt_nm.equalsIgnoreCase(name)) {
			dpt_nm(value);
			return;
		}
		if ($itm_grp_cd.equalsIgnoreCase(name)) {
			itm_grp_cd(value);
			return;
		}
		if ($itm_grp_nm.equalsIgnoreCase(name)) {
			itm_grp_nm(value);
			return;
		}
		if ($row_title_nm.equalsIgnoreCase(name)) {
			row_title_nm(value);
			return;
		}
		if ($dpt1_key.equalsIgnoreCase(name)) {
			dpt1_key(value);
			return;
		}
		if ($dpt_nm1_key.equalsIgnoreCase(name)) {
			dpt_nm1_key(value);
			return;
		}
		if ($dpt2_key.equalsIgnoreCase(name)) {
			dpt2_key(value);
			return;
		}
		if ($dpt_nm2_key.equalsIgnoreCase(name)) {
			dpt_nm2_key(value);
			return;
		}
		if ($itm_grp1_key.equalsIgnoreCase(name)) {
			itm_grp1_key(value);
			return;
		}
		if ($itm_grp_nm1_key.equalsIgnoreCase(name)) {
			itm_grp_nm1_key(value);
			return;
		}
		if ($itm_grp2_key.equalsIgnoreCase(name)) {
			itm_grp2_key(value);
			return;
		}
		if ($itm_grp_nm2_key.equalsIgnoreCase(name)) {
			itm_grp_nm2_key(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($row_sort_col.equalsIgnoreCase(name)) {
			row_sort_col(value);
			return;
		}
		if ($slo.equalsIgnoreCase(name)) {
			slo(value);
			return;
		}
		if ($slo_bl.equalsIgnoreCase(name)) {
			slo_bl(value);
			return;
		}
		if ($sls.equalsIgnoreCase(name)) {
			sls(value);
			return;
		}
		if ($sum.equalsIgnoreCase(name)) {
			sum(value);
			return;
		}
		if ($spln.equalsIgnoreCase(name)) {
			spln(value);
			return;
		}
		if ($spln_per_cmpl_slo.equalsIgnoreCase(name)) {
			spln_per_cmpl_slo(value);
			return;
		}
		if ($spln_per_cmpl_sls.equalsIgnoreCase(name)) {
			spln_per_cmpl_sls(value);
			return;
		}
		if ($bdg_sls.equalsIgnoreCase(name)) {
			bdg_sls(value);
			return;
		}
		if ($bdg_per_cmpl_slo.equalsIgnoreCase(name)) {
			bdg_per_cmpl_slo(value);
			return;
		}
		if ($bdg_per_cmpl_sls.equalsIgnoreCase(name)) {
			bdg_per_cmpl_sls(value);
			return;
		}
		if ($col_00.equalsIgnoreCase(name)) {
			col_00(value);
			return;
		}
		if ($col_01.equalsIgnoreCase(name)) {
			col_01(value);
			return;
		}
		if ($col_02.equalsIgnoreCase(name)) {
			col_02(value);
			return;
		}
		if ($col_03.equalsIgnoreCase(name)) {
			col_03(value);
			return;
		}
		if ($col_04.equalsIgnoreCase(name)) {
			col_04(value);
			return;
		}
		if ($col_05.equalsIgnoreCase(name)) {
			col_05(value);
			return;
		}
		if ($col_06.equalsIgnoreCase(name)) {
			col_06(value);
			return;
		}
		if ($col_07.equalsIgnoreCase(name)) {
			col_07(value);
			return;
		}
		if ($col_08.equalsIgnoreCase(name)) {
			col_08(value);
			return;
		}
		if ($col_09.equalsIgnoreCase(name)) {
			col_09(value);
			return;
		}
		if ($col_10.equalsIgnoreCase(name)) {
			col_10(value);
			return;
		}
		if ($col_11.equalsIgnoreCase(name)) {
			col_11(value);
			return;
		}
		if ($col_12.equalsIgnoreCase(name)) {
			col_12(value);
			return;
		}
		if ($col_13.equalsIgnoreCase(name)) {
			col_13(value);
			return;
		}
		if ($col_14.equalsIgnoreCase(name)) {
			col_14(value);
			return;
		}
		if ($col_15.equalsIgnoreCase(name)) {
			col_15(value);
			return;
		}
		if ($col_16.equalsIgnoreCase(name)) {
			col_16(value);
			return;
		}
		if ($col_17.equalsIgnoreCase(name)) {
			col_17(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($rate_dec_place.equalsIgnoreCase(name)) {
			rate_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($row_sort_col.equalsIgnoreCase(name)) {
			row_sort_col(value);
			return;
		}
		if ($slo.equalsIgnoreCase(name)) {
			slo(value);
			return;
		}
		if ($slo_bl.equalsIgnoreCase(name)) {
			slo_bl(value);
			return;
		}
		if ($sls.equalsIgnoreCase(name)) {
			sls(value);
			return;
		}
		if ($sum.equalsIgnoreCase(name)) {
			sum(value);
			return;
		}
		if ($spln.equalsIgnoreCase(name)) {
			spln(value);
			return;
		}
		if ($spln_per_cmpl_slo.equalsIgnoreCase(name)) {
			spln_per_cmpl_slo(value);
			return;
		}
		if ($spln_per_cmpl_sls.equalsIgnoreCase(name)) {
			spln_per_cmpl_sls(value);
			return;
		}
		if ($bdg_sls.equalsIgnoreCase(name)) {
			bdg_sls(value);
			return;
		}
		if ($bdg_per_cmpl_slo.equalsIgnoreCase(name)) {
			bdg_per_cmpl_slo(value);
			return;
		}
		if ($bdg_per_cmpl_sls.equalsIgnoreCase(name)) {
			bdg_per_cmpl_sls(value);
			return;
		}
		if ($col_00.equalsIgnoreCase(name)) {
			col_00(value);
			return;
		}
		if ($col_01.equalsIgnoreCase(name)) {
			col_01(value);
			return;
		}
		if ($col_02.equalsIgnoreCase(name)) {
			col_02(value);
			return;
		}
		if ($col_03.equalsIgnoreCase(name)) {
			col_03(value);
			return;
		}
		if ($col_04.equalsIgnoreCase(name)) {
			col_04(value);
			return;
		}
		if ($col_05.equalsIgnoreCase(name)) {
			col_05(value);
			return;
		}
		if ($col_06.equalsIgnoreCase(name)) {
			col_06(value);
			return;
		}
		if ($col_07.equalsIgnoreCase(name)) {
			col_07(value);
			return;
		}
		if ($col_08.equalsIgnoreCase(name)) {
			col_08(value);
			return;
		}
		if ($col_09.equalsIgnoreCase(name)) {
			col_09(value);
			return;
		}
		if ($col_10.equalsIgnoreCase(name)) {
			col_10(value);
			return;
		}
		if ($col_11.equalsIgnoreCase(name)) {
			col_11(value);
			return;
		}
		if ($col_12.equalsIgnoreCase(name)) {
			col_12(value);
			return;
		}
		if ($col_13.equalsIgnoreCase(name)) {
			col_13(value);
			return;
		}
		if ($col_14.equalsIgnoreCase(name)) {
			col_14(value);
			return;
		}
		if ($col_15.equalsIgnoreCase(name)) {
			col_15(value);
			return;
		}
		if ($col_16.equalsIgnoreCase(name)) {
			col_16(value);
			return;
		}
		if ($col_17.equalsIgnoreCase(name)) {
			col_17(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($rate_dec_place.equalsIgnoreCase(name)) {
			rate_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($row_sort_col.equalsIgnoreCase(name)) {
			row_sort_col(value);
			return;
		}
		if ($slo.equalsIgnoreCase(name)) {
			slo(value);
			return;
		}
		if ($slo_bl.equalsIgnoreCase(name)) {
			slo_bl(value);
			return;
		}
		if ($sls.equalsIgnoreCase(name)) {
			sls(value);
			return;
		}
		if ($sum.equalsIgnoreCase(name)) {
			sum(value);
			return;
		}
		if ($spln.equalsIgnoreCase(name)) {
			spln(value);
			return;
		}
		if ($spln_per_cmpl_slo.equalsIgnoreCase(name)) {
			spln_per_cmpl_slo(value);
			return;
		}
		if ($spln_per_cmpl_sls.equalsIgnoreCase(name)) {
			spln_per_cmpl_sls(value);
			return;
		}
		if ($bdg_sls.equalsIgnoreCase(name)) {
			bdg_sls(value);
			return;
		}
		if ($bdg_per_cmpl_slo.equalsIgnoreCase(name)) {
			bdg_per_cmpl_slo(value);
			return;
		}
		if ($bdg_per_cmpl_sls.equalsIgnoreCase(name)) {
			bdg_per_cmpl_sls(value);
			return;
		}
		if ($col_00.equalsIgnoreCase(name)) {
			col_00(value);
			return;
		}
		if ($col_01.equalsIgnoreCase(name)) {
			col_01(value);
			return;
		}
		if ($col_02.equalsIgnoreCase(name)) {
			col_02(value);
			return;
		}
		if ($col_03.equalsIgnoreCase(name)) {
			col_03(value);
			return;
		}
		if ($col_04.equalsIgnoreCase(name)) {
			col_04(value);
			return;
		}
		if ($col_05.equalsIgnoreCase(name)) {
			col_05(value);
			return;
		}
		if ($col_06.equalsIgnoreCase(name)) {
			col_06(value);
			return;
		}
		if ($col_07.equalsIgnoreCase(name)) {
			col_07(value);
			return;
		}
		if ($col_08.equalsIgnoreCase(name)) {
			col_08(value);
			return;
		}
		if ($col_09.equalsIgnoreCase(name)) {
			col_09(value);
			return;
		}
		if ($col_10.equalsIgnoreCase(name)) {
			col_10(value);
			return;
		}
		if ($col_11.equalsIgnoreCase(name)) {
			col_11(value);
			return;
		}
		if ($col_12.equalsIgnoreCase(name)) {
			col_12(value);
			return;
		}
		if ($col_13.equalsIgnoreCase(name)) {
			col_13(value);
			return;
		}
		if ($col_14.equalsIgnoreCase(name)) {
			col_14(value);
			return;
		}
		if ($col_15.equalsIgnoreCase(name)) {
			col_15(value);
			return;
		}
		if ($col_16.equalsIgnoreCase(name)) {
			col_16(value);
			return;
		}
		if ($col_17.equalsIgnoreCase(name)) {
			col_17(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($rate_dec_place.equalsIgnoreCase(name)) {
			rate_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($row_sort_col.equalsIgnoreCase(name)) {
			row_sort_col(value);
			return;
		}
		if ($slo.equalsIgnoreCase(name)) {
			slo(value);
			return;
		}
		if ($slo_bl.equalsIgnoreCase(name)) {
			slo_bl(value);
			return;
		}
		if ($sls.equalsIgnoreCase(name)) {
			sls(value);
			return;
		}
		if ($sum.equalsIgnoreCase(name)) {
			sum(value);
			return;
		}
		if ($spln.equalsIgnoreCase(name)) {
			spln(value);
			return;
		}
		if ($spln_per_cmpl_slo.equalsIgnoreCase(name)) {
			spln_per_cmpl_slo(value);
			return;
		}
		if ($spln_per_cmpl_sls.equalsIgnoreCase(name)) {
			spln_per_cmpl_sls(value);
			return;
		}
		if ($bdg_sls.equalsIgnoreCase(name)) {
			bdg_sls(value);
			return;
		}
		if ($bdg_per_cmpl_slo.equalsIgnoreCase(name)) {
			bdg_per_cmpl_slo(value);
			return;
		}
		if ($bdg_per_cmpl_sls.equalsIgnoreCase(name)) {
			bdg_per_cmpl_sls(value);
			return;
		}
		if ($col_00.equalsIgnoreCase(name)) {
			col_00(value);
			return;
		}
		if ($col_01.equalsIgnoreCase(name)) {
			col_01(value);
			return;
		}
		if ($col_02.equalsIgnoreCase(name)) {
			col_02(value);
			return;
		}
		if ($col_03.equalsIgnoreCase(name)) {
			col_03(value);
			return;
		}
		if ($col_04.equalsIgnoreCase(name)) {
			col_04(value);
			return;
		}
		if ($col_05.equalsIgnoreCase(name)) {
			col_05(value);
			return;
		}
		if ($col_06.equalsIgnoreCase(name)) {
			col_06(value);
			return;
		}
		if ($col_07.equalsIgnoreCase(name)) {
			col_07(value);
			return;
		}
		if ($col_08.equalsIgnoreCase(name)) {
			col_08(value);
			return;
		}
		if ($col_09.equalsIgnoreCase(name)) {
			col_09(value);
			return;
		}
		if ($col_10.equalsIgnoreCase(name)) {
			col_10(value);
			return;
		}
		if ($col_11.equalsIgnoreCase(name)) {
			col_11(value);
			return;
		}
		if ($col_12.equalsIgnoreCase(name)) {
			col_12(value);
			return;
		}
		if ($col_13.equalsIgnoreCase(name)) {
			col_13(value);
			return;
		}
		if ($col_14.equalsIgnoreCase(name)) {
			col_14(value);
			return;
		}
		if ($col_15.equalsIgnoreCase(name)) {
			col_15(value);
			return;
		}
		if ($col_16.equalsIgnoreCase(name)) {
			col_16(value);
			return;
		}
		if ($col_17.equalsIgnoreCase(name)) {
			col_17(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($rate_dec_place.equalsIgnoreCase(name)) {
			rate_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($row_sort_col.equalsIgnoreCase(name)) {
			row_sort_col(value);
			return;
		}
		if ($slo.equalsIgnoreCase(name)) {
			slo(value);
			return;
		}
		if ($slo_bl.equalsIgnoreCase(name)) {
			slo_bl(value);
			return;
		}
		if ($sls.equalsIgnoreCase(name)) {
			sls(value);
			return;
		}
		if ($sum.equalsIgnoreCase(name)) {
			sum(value);
			return;
		}
		if ($spln.equalsIgnoreCase(name)) {
			spln(value);
			return;
		}
		if ($spln_per_cmpl_slo.equalsIgnoreCase(name)) {
			spln_per_cmpl_slo(value);
			return;
		}
		if ($spln_per_cmpl_sls.equalsIgnoreCase(name)) {
			spln_per_cmpl_sls(value);
			return;
		}
		if ($bdg_sls.equalsIgnoreCase(name)) {
			bdg_sls(value);
			return;
		}
		if ($bdg_per_cmpl_slo.equalsIgnoreCase(name)) {
			bdg_per_cmpl_slo(value);
			return;
		}
		if ($bdg_per_cmpl_sls.equalsIgnoreCase(name)) {
			bdg_per_cmpl_sls(value);
			return;
		}
		if ($col_00.equalsIgnoreCase(name)) {
			col_00(value);
			return;
		}
		if ($col_01.equalsIgnoreCase(name)) {
			col_01(value);
			return;
		}
		if ($col_02.equalsIgnoreCase(name)) {
			col_02(value);
			return;
		}
		if ($col_03.equalsIgnoreCase(name)) {
			col_03(value);
			return;
		}
		if ($col_04.equalsIgnoreCase(name)) {
			col_04(value);
			return;
		}
		if ($col_05.equalsIgnoreCase(name)) {
			col_05(value);
			return;
		}
		if ($col_06.equalsIgnoreCase(name)) {
			col_06(value);
			return;
		}
		if ($col_07.equalsIgnoreCase(name)) {
			col_07(value);
			return;
		}
		if ($col_08.equalsIgnoreCase(name)) {
			col_08(value);
			return;
		}
		if ($col_09.equalsIgnoreCase(name)) {
			col_09(value);
			return;
		}
		if ($col_10.equalsIgnoreCase(name)) {
			col_10(value);
			return;
		}
		if ($col_11.equalsIgnoreCase(name)) {
			col_11(value);
			return;
		}
		if ($col_12.equalsIgnoreCase(name)) {
			col_12(value);
			return;
		}
		if ($col_13.equalsIgnoreCase(name)) {
			col_13(value);
			return;
		}
		if ($col_14.equalsIgnoreCase(name)) {
			col_14(value);
			return;
		}
		if ($col_15.equalsIgnoreCase(name)) {
			col_15(value);
			return;
		}
		if ($col_16.equalsIgnoreCase(name)) {
			col_16(value);
			return;
		}
		if ($col_17.equalsIgnoreCase(name)) {
			col_17(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($rate_dec_place.equalsIgnoreCase(name)) {
			rate_dec_place(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($dpt_cd.equalsIgnoreCase(name)) {
			dpt_cd(value);
			return;
		}
		if ($dpt_nm.equalsIgnoreCase(name)) {
			dpt_nm(value);
			return;
		}
		if ($itm_grp_cd.equalsIgnoreCase(name)) {
			itm_grp_cd(value);
			return;
		}
		if ($itm_grp_nm.equalsIgnoreCase(name)) {
			itm_grp_nm(value);
			return;
		}
		if ($row_title_nm.equalsIgnoreCase(name)) {
			row_title_nm(value);
			return;
		}
		if ($dpt1_key.equalsIgnoreCase(name)) {
			dpt1_key(value);
			return;
		}
		if ($dpt_nm1_key.equalsIgnoreCase(name)) {
			dpt_nm1_key(value);
			return;
		}
		if ($dpt2_key.equalsIgnoreCase(name)) {
			dpt2_key(value);
			return;
		}
		if ($dpt_nm2_key.equalsIgnoreCase(name)) {
			dpt_nm2_key(value);
			return;
		}
		if ($itm_grp1_key.equalsIgnoreCase(name)) {
			itm_grp1_key(value);
			return;
		}
		if ($itm_grp_nm1_key.equalsIgnoreCase(name)) {
			itm_grp_nm1_key(value);
			return;
		}
		if ($itm_grp2_key.equalsIgnoreCase(name)) {
			itm_grp2_key(value);
			return;
		}
		if ($itm_grp_nm2_key.equalsIgnoreCase(name)) {
			itm_grp_nm2_key(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($row_sort_col.equalsIgnoreCase(name)) {
			row_sort_col(value);
			return;
		}
		if ($slo.equalsIgnoreCase(name)) {
			slo(value);
			return;
		}
		if ($slo_bl.equalsIgnoreCase(name)) {
			slo_bl(value);
			return;
		}
		if ($sls.equalsIgnoreCase(name)) {
			sls(value);
			return;
		}
		if ($sum.equalsIgnoreCase(name)) {
			sum(value);
			return;
		}
		if ($spln.equalsIgnoreCase(name)) {
			spln(value);
			return;
		}
		if ($spln_per_cmpl_slo.equalsIgnoreCase(name)) {
			spln_per_cmpl_slo(value);
			return;
		}
		if ($spln_per_cmpl_sls.equalsIgnoreCase(name)) {
			spln_per_cmpl_sls(value);
			return;
		}
		if ($bdg_sls.equalsIgnoreCase(name)) {
			bdg_sls(value);
			return;
		}
		if ($bdg_per_cmpl_slo.equalsIgnoreCase(name)) {
			bdg_per_cmpl_slo(value);
			return;
		}
		if ($bdg_per_cmpl_sls.equalsIgnoreCase(name)) {
			bdg_per_cmpl_sls(value);
			return;
		}
		if ($col_00.equalsIgnoreCase(name)) {
			col_00(value);
			return;
		}
		if ($col_01.equalsIgnoreCase(name)) {
			col_01(value);
			return;
		}
		if ($col_02.equalsIgnoreCase(name)) {
			col_02(value);
			return;
		}
		if ($col_03.equalsIgnoreCase(name)) {
			col_03(value);
			return;
		}
		if ($col_04.equalsIgnoreCase(name)) {
			col_04(value);
			return;
		}
		if ($col_05.equalsIgnoreCase(name)) {
			col_05(value);
			return;
		}
		if ($col_06.equalsIgnoreCase(name)) {
			col_06(value);
			return;
		}
		if ($col_07.equalsIgnoreCase(name)) {
			col_07(value);
			return;
		}
		if ($col_08.equalsIgnoreCase(name)) {
			col_08(value);
			return;
		}
		if ($col_09.equalsIgnoreCase(name)) {
			col_09(value);
			return;
		}
		if ($col_10.equalsIgnoreCase(name)) {
			col_10(value);
			return;
		}
		if ($col_11.equalsIgnoreCase(name)) {
			col_11(value);
			return;
		}
		if ($col_12.equalsIgnoreCase(name)) {
			col_12(value);
			return;
		}
		if ($col_13.equalsIgnoreCase(name)) {
			col_13(value);
			return;
		}
		if ($col_14.equalsIgnoreCase(name)) {
			col_14(value);
			return;
		}
		if ($col_15.equalsIgnoreCase(name)) {
			col_15(value);
			return;
		}
		if ($col_16.equalsIgnoreCase(name)) {
			col_16(value);
			return;
		}
		if ($col_17.equalsIgnoreCase(name)) {
			col_17(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($rate_dec_place.equalsIgnoreCase(name)) {
			rate_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($row_sort_col.equalsIgnoreCase(name)) {
			row_sort_col(value);
			return;
		}
		if ($slo.equalsIgnoreCase(name)) {
			slo(value);
			return;
		}
		if ($slo_bl.equalsIgnoreCase(name)) {
			slo_bl(value);
			return;
		}
		if ($sls.equalsIgnoreCase(name)) {
			sls(value);
			return;
		}
		if ($sum.equalsIgnoreCase(name)) {
			sum(value);
			return;
		}
		if ($spln.equalsIgnoreCase(name)) {
			spln(value);
			return;
		}
		if ($spln_per_cmpl_slo.equalsIgnoreCase(name)) {
			spln_per_cmpl_slo(value);
			return;
		}
		if ($spln_per_cmpl_sls.equalsIgnoreCase(name)) {
			spln_per_cmpl_sls(value);
			return;
		}
		if ($bdg_sls.equalsIgnoreCase(name)) {
			bdg_sls(value);
			return;
		}
		if ($bdg_per_cmpl_slo.equalsIgnoreCase(name)) {
			bdg_per_cmpl_slo(value);
			return;
		}
		if ($bdg_per_cmpl_sls.equalsIgnoreCase(name)) {
			bdg_per_cmpl_sls(value);
			return;
		}
		if ($col_00.equalsIgnoreCase(name)) {
			col_00(value);
			return;
		}
		if ($col_01.equalsIgnoreCase(name)) {
			col_01(value);
			return;
		}
		if ($col_02.equalsIgnoreCase(name)) {
			col_02(value);
			return;
		}
		if ($col_03.equalsIgnoreCase(name)) {
			col_03(value);
			return;
		}
		if ($col_04.equalsIgnoreCase(name)) {
			col_04(value);
			return;
		}
		if ($col_05.equalsIgnoreCase(name)) {
			col_05(value);
			return;
		}
		if ($col_06.equalsIgnoreCase(name)) {
			col_06(value);
			return;
		}
		if ($col_07.equalsIgnoreCase(name)) {
			col_07(value);
			return;
		}
		if ($col_08.equalsIgnoreCase(name)) {
			col_08(value);
			return;
		}
		if ($col_09.equalsIgnoreCase(name)) {
			col_09(value);
			return;
		}
		if ($col_10.equalsIgnoreCase(name)) {
			col_10(value);
			return;
		}
		if ($col_11.equalsIgnoreCase(name)) {
			col_11(value);
			return;
		}
		if ($col_12.equalsIgnoreCase(name)) {
			col_12(value);
			return;
		}
		if ($col_13.equalsIgnoreCase(name)) {
			col_13(value);
			return;
		}
		if ($col_14.equalsIgnoreCase(name)) {
			col_14(value);
			return;
		}
		if ($col_15.equalsIgnoreCase(name)) {
			col_15(value);
			return;
		}
		if ($col_16.equalsIgnoreCase(name)) {
			col_16(value);
			return;
		}
		if ($col_17.equalsIgnoreCase(name)) {
			col_17(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($rate_dec_place.equalsIgnoreCase(name)) {
			rate_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($row_sort_col.equalsIgnoreCase(name)) {
			row_sort_col(value);
			return;
		}
		if ($slo.equalsIgnoreCase(name)) {
			slo(value);
			return;
		}
		if ($slo_bl.equalsIgnoreCase(name)) {
			slo_bl(value);
			return;
		}
		if ($sls.equalsIgnoreCase(name)) {
			sls(value);
			return;
		}
		if ($sum.equalsIgnoreCase(name)) {
			sum(value);
			return;
		}
		if ($spln.equalsIgnoreCase(name)) {
			spln(value);
			return;
		}
		if ($spln_per_cmpl_slo.equalsIgnoreCase(name)) {
			spln_per_cmpl_slo(value);
			return;
		}
		if ($spln_per_cmpl_sls.equalsIgnoreCase(name)) {
			spln_per_cmpl_sls(value);
			return;
		}
		if ($bdg_sls.equalsIgnoreCase(name)) {
			bdg_sls(value);
			return;
		}
		if ($bdg_per_cmpl_slo.equalsIgnoreCase(name)) {
			bdg_per_cmpl_slo(value);
			return;
		}
		if ($bdg_per_cmpl_sls.equalsIgnoreCase(name)) {
			bdg_per_cmpl_sls(value);
			return;
		}
		if ($col_00.equalsIgnoreCase(name)) {
			col_00(value);
			return;
		}
		if ($col_01.equalsIgnoreCase(name)) {
			col_01(value);
			return;
		}
		if ($col_02.equalsIgnoreCase(name)) {
			col_02(value);
			return;
		}
		if ($col_03.equalsIgnoreCase(name)) {
			col_03(value);
			return;
		}
		if ($col_04.equalsIgnoreCase(name)) {
			col_04(value);
			return;
		}
		if ($col_05.equalsIgnoreCase(name)) {
			col_05(value);
			return;
		}
		if ($col_06.equalsIgnoreCase(name)) {
			col_06(value);
			return;
		}
		if ($col_07.equalsIgnoreCase(name)) {
			col_07(value);
			return;
		}
		if ($col_08.equalsIgnoreCase(name)) {
			col_08(value);
			return;
		}
		if ($col_09.equalsIgnoreCase(name)) {
			col_09(value);
			return;
		}
		if ($col_10.equalsIgnoreCase(name)) {
			col_10(value);
			return;
		}
		if ($col_11.equalsIgnoreCase(name)) {
			col_11(value);
			return;
		}
		if ($col_12.equalsIgnoreCase(name)) {
			col_12(value);
			return;
		}
		if ($col_13.equalsIgnoreCase(name)) {
			col_13(value);
			return;
		}
		if ($col_14.equalsIgnoreCase(name)) {
			col_14(value);
			return;
		}
		if ($col_15.equalsIgnoreCase(name)) {
			col_15(value);
			return;
		}
		if ($col_16.equalsIgnoreCase(name)) {
			col_16(value);
			return;
		}
		if ($col_17.equalsIgnoreCase(name)) {
			col_17(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($rate_dec_place.equalsIgnoreCase(name)) {
			rate_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($row_sort_col.equalsIgnoreCase(name)) {
			row_sort_col(value);
			return;
		}
		if ($slo.equalsIgnoreCase(name)) {
			slo(value);
			return;
		}
		if ($slo_bl.equalsIgnoreCase(name)) {
			slo_bl(value);
			return;
		}
		if ($sls.equalsIgnoreCase(name)) {
			sls(value);
			return;
		}
		if ($sum.equalsIgnoreCase(name)) {
			sum(value);
			return;
		}
		if ($spln.equalsIgnoreCase(name)) {
			spln(value);
			return;
		}
		if ($spln_per_cmpl_slo.equalsIgnoreCase(name)) {
			spln_per_cmpl_slo(value);
			return;
		}
		if ($spln_per_cmpl_sls.equalsIgnoreCase(name)) {
			spln_per_cmpl_sls(value);
			return;
		}
		if ($bdg_sls.equalsIgnoreCase(name)) {
			bdg_sls(value);
			return;
		}
		if ($bdg_per_cmpl_slo.equalsIgnoreCase(name)) {
			bdg_per_cmpl_slo(value);
			return;
		}
		if ($bdg_per_cmpl_sls.equalsIgnoreCase(name)) {
			bdg_per_cmpl_sls(value);
			return;
		}
		if ($col_00.equalsIgnoreCase(name)) {
			col_00(value);
			return;
		}
		if ($col_01.equalsIgnoreCase(name)) {
			col_01(value);
			return;
		}
		if ($col_02.equalsIgnoreCase(name)) {
			col_02(value);
			return;
		}
		if ($col_03.equalsIgnoreCase(name)) {
			col_03(value);
			return;
		}
		if ($col_04.equalsIgnoreCase(name)) {
			col_04(value);
			return;
		}
		if ($col_05.equalsIgnoreCase(name)) {
			col_05(value);
			return;
		}
		if ($col_06.equalsIgnoreCase(name)) {
			col_06(value);
			return;
		}
		if ($col_07.equalsIgnoreCase(name)) {
			col_07(value);
			return;
		}
		if ($col_08.equalsIgnoreCase(name)) {
			col_08(value);
			return;
		}
		if ($col_09.equalsIgnoreCase(name)) {
			col_09(value);
			return;
		}
		if ($col_10.equalsIgnoreCase(name)) {
			col_10(value);
			return;
		}
		if ($col_11.equalsIgnoreCase(name)) {
			col_11(value);
			return;
		}
		if ($col_12.equalsIgnoreCase(name)) {
			col_12(value);
			return;
		}
		if ($col_13.equalsIgnoreCase(name)) {
			col_13(value);
			return;
		}
		if ($col_14.equalsIgnoreCase(name)) {
			col_14(value);
			return;
		}
		if ($col_15.equalsIgnoreCase(name)) {
			col_15(value);
			return;
		}
		if ($col_16.equalsIgnoreCase(name)) {
			col_16(value);
			return;
		}
		if ($col_17.equalsIgnoreCase(name)) {
			col_17(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($rate_dec_place.equalsIgnoreCase(name)) {
			rate_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($row_sort_col.equalsIgnoreCase(name)) {
			row_sort_col(value);
			return;
		}
		if ($slo.equalsIgnoreCase(name)) {
			slo(value);
			return;
		}
		if ($slo_bl.equalsIgnoreCase(name)) {
			slo_bl(value);
			return;
		}
		if ($sls.equalsIgnoreCase(name)) {
			sls(value);
			return;
		}
		if ($sum.equalsIgnoreCase(name)) {
			sum(value);
			return;
		}
		if ($spln.equalsIgnoreCase(name)) {
			spln(value);
			return;
		}
		if ($spln_per_cmpl_slo.equalsIgnoreCase(name)) {
			spln_per_cmpl_slo(value);
			return;
		}
		if ($spln_per_cmpl_sls.equalsIgnoreCase(name)) {
			spln_per_cmpl_sls(value);
			return;
		}
		if ($bdg_sls.equalsIgnoreCase(name)) {
			bdg_sls(value);
			return;
		}
		if ($bdg_per_cmpl_slo.equalsIgnoreCase(name)) {
			bdg_per_cmpl_slo(value);
			return;
		}
		if ($bdg_per_cmpl_sls.equalsIgnoreCase(name)) {
			bdg_per_cmpl_sls(value);
			return;
		}
		if ($col_00.equalsIgnoreCase(name)) {
			col_00(value);
			return;
		}
		if ($col_01.equalsIgnoreCase(name)) {
			col_01(value);
			return;
		}
		if ($col_02.equalsIgnoreCase(name)) {
			col_02(value);
			return;
		}
		if ($col_03.equalsIgnoreCase(name)) {
			col_03(value);
			return;
		}
		if ($col_04.equalsIgnoreCase(name)) {
			col_04(value);
			return;
		}
		if ($col_05.equalsIgnoreCase(name)) {
			col_05(value);
			return;
		}
		if ($col_06.equalsIgnoreCase(name)) {
			col_06(value);
			return;
		}
		if ($col_07.equalsIgnoreCase(name)) {
			col_07(value);
			return;
		}
		if ($col_08.equalsIgnoreCase(name)) {
			col_08(value);
			return;
		}
		if ($col_09.equalsIgnoreCase(name)) {
			col_09(value);
			return;
		}
		if ($col_10.equalsIgnoreCase(name)) {
			col_10(value);
			return;
		}
		if ($col_11.equalsIgnoreCase(name)) {
			col_11(value);
			return;
		}
		if ($col_12.equalsIgnoreCase(name)) {
			col_12(value);
			return;
		}
		if ($col_13.equalsIgnoreCase(name)) {
			col_13(value);
			return;
		}
		if ($col_14.equalsIgnoreCase(name)) {
			col_14(value);
			return;
		}
		if ($col_15.equalsIgnoreCase(name)) {
			col_15(value);
			return;
		}
		if ($col_16.equalsIgnoreCase(name)) {
			col_16(value);
			return;
		}
		if ($col_17.equalsIgnoreCase(name)) {
			col_17(value);
			return;
		}
		if ($amt_dec_place.equalsIgnoreCase(name)) {
			amt_dec_place(value);
			return;
		}
		if ($rate_dec_place.equalsIgnoreCase(name)) {
			rate_dec_place(value);
			return;
		}
		super.setNumberNE(name, value);
	}



}

