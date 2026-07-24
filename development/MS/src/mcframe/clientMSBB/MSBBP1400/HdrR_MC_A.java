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
 * ブロック"Hdr"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class HdrR_MC_A extends MCConstRow {

	/**
	 * Base currency cd. 基準通貨ＣＤ.<p>
	 *
	 */
	public static final String $base_cur_cd = "base_cur_cd";
	/**
	 * Base currency name 基準通貨名.<p>
	 *
	 */
	public static final String $base_cur_nm = "base_cur_nm";
	/**
	 * Unit 単位.<p>
	 *
	 */
	public static final String $unit = "unit";
	/**
	 * Sales result 売上.<p>
	 *
	 */
	public static final String $sls_flg = "sls_flg";
	/**
	 * Order backlog 受注残.<p>
	 *
	 */
	public static final String $slo_bl_flg = "slo_bl_flg";
	/**
	 * Sales order 受注.<p>
	 *
	 */
	public static final String $slo_flg = "slo_flg";
	/**
	 * Plan 計画.<p>
	 *
	 */
	public static final String $spln_flg = "spln_flg";
	/**
	 * Plan progress rate 計画進捗率.<p>
	 *
	 */
	public static final String $spln_per_cmpl_sls_flg = "spln_per_cmpl_sls_flg";
	/**
	 * Budget 予算.<p>
	 *
	 */
	public static final String $bdg_flg = "bdg_flg";
	/**
	 * Budget progress rate 予算進捗率.<p>
	 *
	 */
	public static final String $bdg_per_cmpl_sls_flg = "bdg_per_cmpl_sls_flg";
	/**
	 * Gross profit amount 粗利額.<p>
	 *
	 */
	public static final String $prof_amt_flg = "prof_amt_flg";
	/**
	 * Gross profit rate 粗利率.<p>
	 *
	 */
	public static final String $prof_rate_flg = "prof_rate_flg";
	/**
	 * Amount unit cd. 金額単位ＣＤ.<p>
	 *
	 */
	public static final String $big_num_rnd_typ = "big_num_rnd_typ";
	/**
	 * Amount unit name 金額単位名.<p>
	 *
	 */
	public static final String $big_num_rnd_typ_nm = "big_num_rnd_typ_nm";
	/**
	 * Specified month 指定年月.<p>
	 *
	 */
	public static final String $inpt_ym = "inpt_ym";
	/**
	 * Display sales forecasting 売上推移表示.<p>
	 *
	 */
	public static final String $sls_trnst_disp = "sls_trnst_disp";
	/**
	 * Sales display period 売上表示期間.<p>
	 *
	 */
	public static final String $sls_disp_term = "sls_disp_term";
	/**
	 * Aggregation period 集計期間.<p>
	 *
	 */
	public static final String $sum_term = "sum_term";


	public static final MCMeta base_cur_cd_META = createCommonMeta($base_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta base_cur_nm_META = createCommonMeta($base_cur_nm, mcframe.commonMA.meta.MA_META.CUR_NM);
	public static final MCMeta unit_META = createStringMeta($unit);
	public static final MCMeta sls_flg_META = createCommonMeta($sls_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta slo_bl_flg_META = createCommonMeta($slo_bl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta slo_flg_META = createCommonMeta($slo_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta spln_flg_META = createCommonMeta($spln_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta spln_per_cmpl_sls_flg_META = createCommonMeta($spln_per_cmpl_sls_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bdg_flg_META = createCommonMeta($bdg_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bdg_per_cmpl_sls_flg_META = createCommonMeta($bdg_per_cmpl_sls_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta prof_amt_flg_META = createCommonMeta($prof_amt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta prof_rate_flg_META = createCommonMeta($prof_rate_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta big_num_rnd_typ_META = createCommonMeta($big_num_rnd_typ, mcframe.commonMA.meta.MA_META.BIG_NUM_RND_TYP);
	public static final MCMeta big_num_rnd_typ_nm_META = createCommonMeta($big_num_rnd_typ_nm, mcframe.commonMA.meta.MA_META.BIG_NUM_RND_TYP_NM);
	public static final MCMeta inpt_ym_META = createCommonMeta($inpt_ym, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta sls_trnst_disp_META = createCommonMeta($sls_trnst_disp, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sls_disp_term_META = createCommonMeta($sls_disp_term, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta sum_term_META = createCommonMeta($sum_term, mcframe.commonMA.meta.MA_META.INT);

	protected static final ConstMetaList<HdrR> constMetas = new ConstMetaList<HdrR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			base_cur_cd_META,
			base_cur_nm_META,
			unit_META,
			sls_flg_META,
			slo_bl_flg_META,
			slo_flg_META,
			spln_flg_META,
			spln_per_cmpl_sls_flg_META,
			bdg_flg_META,
			bdg_per_cmpl_sls_flg_META,
			prof_amt_flg_META,
			prof_rate_flg_META,
			big_num_rnd_typ_META,
			big_num_rnd_typ_nm_META,
			inpt_ym_META,
			sls_trnst_disp_META,
			sls_disp_term_META,
			sum_term_META
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
	protected HdrR_MC_A(ConstMetaList<? extends HdrR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public HdrR clone() {
		return (HdrR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public HdrR createInstance() {
		return (HdrR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public HdrR getValues(String... names) {
		return (HdrR) super.getValues(names);
	}



	/**
	 * Base currency cd. 基準通貨ＣＤ.<p>
	 *
	 */
	public String base_cur_cd() {
		return getConstString(offset + 0, $base_cur_cd);
	}

	/**
	 * Base currency cd. 基準通貨ＣＤ.<p>
	 *
	 */
	public void base_cur_cd(String value) {
		setConstString(offset + 0, $base_cur_cd, value);
	}


	/**
	 * Base currency name 基準通貨名.<p>
	 *
	 */
	public String base_cur_nm() {
		return getConstString(offset + 1, $base_cur_nm);
	}

	/**
	 * Base currency name 基準通貨名.<p>
	 *
	 */
	public void base_cur_nm(String value) {
		setConstString(offset + 1, $base_cur_nm, value);
	}


	/**
	 * Unit 単位.<p>
	 *
	 */
	public String unit() {
		return getConstString(offset + 2, $unit);
	}

	/**
	 * Unit 単位.<p>
	 *
	 */
	public void unit(String value) {
		setConstString(offset + 2, $unit, value);
	}


	/**
	 * Sales result 売上.<p>
	 *
	 */
	public boolean sls_flg() {
		return getConstBoolean(offset + 3, $sls_flg);
	}

	/**
	 * Sales result 売上.<p>
	 *
	 */
	public void sls_flg(boolean value) {
		setConstBoolean(offset + 3, $sls_flg, value);
	}


	/**
	 * Order backlog 受注残.<p>
	 *
	 */
	public boolean slo_bl_flg() {
		return getConstBoolean(offset + 4, $slo_bl_flg);
	}

	/**
	 * Order backlog 受注残.<p>
	 *
	 */
	public void slo_bl_flg(boolean value) {
		setConstBoolean(offset + 4, $slo_bl_flg, value);
	}


	/**
	 * Sales order 受注.<p>
	 *
	 */
	public boolean slo_flg() {
		return getConstBoolean(offset + 5, $slo_flg);
	}

	/**
	 * Sales order 受注.<p>
	 *
	 */
	public void slo_flg(boolean value) {
		setConstBoolean(offset + 5, $slo_flg, value);
	}


	/**
	 * Plan 計画.<p>
	 *
	 */
	public boolean spln_flg() {
		return getConstBoolean(offset + 6, $spln_flg);
	}

	/**
	 * Plan 計画.<p>
	 *
	 */
	public void spln_flg(boolean value) {
		setConstBoolean(offset + 6, $spln_flg, value);
	}


	/**
	 * Plan progress rate 計画進捗率.<p>
	 *
	 */
	public boolean spln_per_cmpl_sls_flg() {
		return getConstBoolean(offset + 7, $spln_per_cmpl_sls_flg);
	}

	/**
	 * Plan progress rate 計画進捗率.<p>
	 *
	 */
	public void spln_per_cmpl_sls_flg(boolean value) {
		setConstBoolean(offset + 7, $spln_per_cmpl_sls_flg, value);
	}


	/**
	 * Budget 予算.<p>
	 *
	 */
	public boolean bdg_flg() {
		return getConstBoolean(offset + 8, $bdg_flg);
	}

	/**
	 * Budget 予算.<p>
	 *
	 */
	public void bdg_flg(boolean value) {
		setConstBoolean(offset + 8, $bdg_flg, value);
	}


	/**
	 * Budget progress rate 予算進捗率.<p>
	 *
	 */
	public boolean bdg_per_cmpl_sls_flg() {
		return getConstBoolean(offset + 9, $bdg_per_cmpl_sls_flg);
	}

	/**
	 * Budget progress rate 予算進捗率.<p>
	 *
	 */
	public void bdg_per_cmpl_sls_flg(boolean value) {
		setConstBoolean(offset + 9, $bdg_per_cmpl_sls_flg, value);
	}


	/**
	 * Gross profit amount 粗利額.<p>
	 *
	 */
	public boolean prof_amt_flg() {
		return getConstBoolean(offset + 10, $prof_amt_flg);
	}

	/**
	 * Gross profit amount 粗利額.<p>
	 *
	 */
	public void prof_amt_flg(boolean value) {
		setConstBoolean(offset + 10, $prof_amt_flg, value);
	}


	/**
	 * Gross profit rate 粗利率.<p>
	 *
	 */
	public boolean prof_rate_flg() {
		return getConstBoolean(offset + 11, $prof_rate_flg);
	}

	/**
	 * Gross profit rate 粗利率.<p>
	 *
	 */
	public void prof_rate_flg(boolean value) {
		setConstBoolean(offset + 11, $prof_rate_flg, value);
	}


	/**
	 * Amount unit cd. 金額単位ＣＤ.<p>
	 *
	 */
	public String big_num_rnd_typ() {
		return getConstString(offset + 12, $big_num_rnd_typ);
	}

	/**
	 * Amount unit cd. 金額単位ＣＤ.<p>
	 *
	 */
	public void big_num_rnd_typ(String value) {
		setConstString(offset + 12, $big_num_rnd_typ, value);
	}


	/**
	 * Amount unit name 金額単位名.<p>
	 *
	 */
	public String big_num_rnd_typ_nm() {
		return getConstString(offset + 13, $big_num_rnd_typ_nm);
	}

	/**
	 * Amount unit name 金額単位名.<p>
	 *
	 */
	public void big_num_rnd_typ_nm(String value) {
		setConstString(offset + 13, $big_num_rnd_typ_nm, value);
	}


	/**
	 * Specified month 指定年月.<p>
	 *
	 */
	public MCDate inpt_ym() {
		return getConstDate(offset + 14, $inpt_ym);
	}

	/**
	 * Specified month 指定年月.<p>
	 *
	 */
	public void inpt_ym(MCDate value) {
		setConstDate(offset + 14, $inpt_ym, value);
	}


	/**
	 * Display sales forecasting 売上推移表示.<p>
	 *
	 */
	public boolean sls_trnst_disp() {
		return getConstBoolean(offset + 15, $sls_trnst_disp);
	}

	/**
	 * Display sales forecasting 売上推移表示.<p>
	 *
	 */
	public void sls_trnst_disp(boolean value) {
		setConstBoolean(offset + 15, $sls_trnst_disp, value);
	}


	/**
	 * Sales display period 売上表示期間.<p>
	 *
	 */
	public MCNumber sls_disp_term() {
		return getConstNumber(offset + 16, $sls_disp_term);
	}

	/**
	 * Sales display period 売上表示期間.<p>
	 *
	 */
	public void sls_disp_term(MCNumber value) {
		setConstNumber(offset + 16, $sls_disp_term, value);
	}

	/**
	 * Sales display period 売上表示期間.<p>
	 *
	 */
	public void sls_disp_term(int value) {
		setConstNumber(offset + 16, $sls_disp_term, value);
	}

	/**
	 * Sales display period 売上表示期間.<p>
	 *
	 */
	public void sls_disp_term(long value) {
		setConstNumber(offset + 16, $sls_disp_term, value);
	}

	/**
	 * Sales display period 売上表示期間.<p>
	 *
	 */
	public void sls_disp_term(float value) {
		setConstNumber(offset + 16, $sls_disp_term, value);
	}

	/**
	 * Sales display period 売上表示期間.<p>
	 *
	 */
	public void sls_disp_term(double value) {
		setConstNumber(offset + 16, $sls_disp_term, value);
	}


	/**
	 * Aggregation period 集計期間.<p>
	 *
	 */
	public MCNumber sum_term() {
		return getConstNumber(offset + 17, $sum_term);
	}

	/**
	 * Aggregation period 集計期間.<p>
	 *
	 */
	public void sum_term(MCNumber value) {
		setConstNumber(offset + 17, $sum_term, value);
	}

	/**
	 * Aggregation period 集計期間.<p>
	 *
	 */
	public void sum_term(int value) {
		setConstNumber(offset + 17, $sum_term, value);
	}

	/**
	 * Aggregation period 集計期間.<p>
	 *
	 */
	public void sum_term(long value) {
		setConstNumber(offset + 17, $sum_term, value);
	}

	/**
	 * Aggregation period 集計期間.<p>
	 *
	 */
	public void sum_term(float value) {
		setConstNumber(offset + 17, $sum_term, value);
	}

	/**
	 * Aggregation period 集計期間.<p>
	 *
	 */
	public void sum_term(double value) {
		setConstNumber(offset + 17, $sum_term, value);
	}


	public String getString(String name) {
		if ($base_cur_cd.equalsIgnoreCase(name)) {
			return base_cur_cd();
		}
		if ($base_cur_nm.equalsIgnoreCase(name)) {
			return base_cur_nm();
		}
		if ($unit.equalsIgnoreCase(name)) {
			return unit();
		}
		if ($big_num_rnd_typ.equalsIgnoreCase(name)) {
			return big_num_rnd_typ();
		}
		if ($big_num_rnd_typ_nm.equalsIgnoreCase(name)) {
			return big_num_rnd_typ_nm();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($sls_disp_term.equalsIgnoreCase(name)) {
			return sls_disp_term();
		}
		if ($sum_term.equalsIgnoreCase(name)) {
			return sum_term();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($inpt_ym.equalsIgnoreCase(name)) {
			return inpt_ym();
		}
		return super.getDate(name);
	}
	public boolean getBoolean(String name) {
		if ($sls_flg.equalsIgnoreCase(name)) {
			return sls_flg();
		}
		if ($slo_bl_flg.equalsIgnoreCase(name)) {
			return slo_bl_flg();
		}
		if ($slo_flg.equalsIgnoreCase(name)) {
			return slo_flg();
		}
		if ($spln_flg.equalsIgnoreCase(name)) {
			return spln_flg();
		}
		if ($spln_per_cmpl_sls_flg.equalsIgnoreCase(name)) {
			return spln_per_cmpl_sls_flg();
		}
		if ($bdg_flg.equalsIgnoreCase(name)) {
			return bdg_flg();
		}
		if ($bdg_per_cmpl_sls_flg.equalsIgnoreCase(name)) {
			return bdg_per_cmpl_sls_flg();
		}
		if ($prof_amt_flg.equalsIgnoreCase(name)) {
			return prof_amt_flg();
		}
		if ($prof_rate_flg.equalsIgnoreCase(name)) {
			return prof_rate_flg();
		}
		if ($sls_trnst_disp.equalsIgnoreCase(name)) {
			return sls_trnst_disp();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($base_cur_cd.equalsIgnoreCase(name)) {
			return base_cur_cd();
		}
		if ($base_cur_nm.equalsIgnoreCase(name)) {
			return base_cur_nm();
		}
		if ($unit.equalsIgnoreCase(name)) {
			return unit();
		}
		if ($big_num_rnd_typ.equalsIgnoreCase(name)) {
			return big_num_rnd_typ();
		}
		if ($big_num_rnd_typ_nm.equalsIgnoreCase(name)) {
			return big_num_rnd_typ_nm();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($sls_disp_term.equalsIgnoreCase(name)) {
			return sls_disp_term();
		}
		if ($sum_term.equalsIgnoreCase(name)) {
			return sum_term();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($inpt_ym.equalsIgnoreCase(name)) {
			return inpt_ym();
		}
		return super.getDateNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($sls_flg.equalsIgnoreCase(name)) {
			return sls_flg();
		}
		if ($slo_bl_flg.equalsIgnoreCase(name)) {
			return slo_bl_flg();
		}
		if ($slo_flg.equalsIgnoreCase(name)) {
			return slo_flg();
		}
		if ($spln_flg.equalsIgnoreCase(name)) {
			return spln_flg();
		}
		if ($spln_per_cmpl_sls_flg.equalsIgnoreCase(name)) {
			return spln_per_cmpl_sls_flg();
		}
		if ($bdg_flg.equalsIgnoreCase(name)) {
			return bdg_flg();
		}
		if ($bdg_per_cmpl_sls_flg.equalsIgnoreCase(name)) {
			return bdg_per_cmpl_sls_flg();
		}
		if ($prof_amt_flg.equalsIgnoreCase(name)) {
			return prof_amt_flg();
		}
		if ($prof_rate_flg.equalsIgnoreCase(name)) {
			return prof_rate_flg();
		}
		if ($sls_trnst_disp.equalsIgnoreCase(name)) {
			return sls_trnst_disp();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($base_cur_cd.equalsIgnoreCase(name)) {
			base_cur_cd(value);
			return;
		}
		if ($base_cur_nm.equalsIgnoreCase(name)) {
			base_cur_nm(value);
			return;
		}
		if ($unit.equalsIgnoreCase(name)) {
			unit(value);
			return;
		}
		if ($big_num_rnd_typ.equalsIgnoreCase(name)) {
			big_num_rnd_typ(value);
			return;
		}
		if ($big_num_rnd_typ_nm.equalsIgnoreCase(name)) {
			big_num_rnd_typ_nm(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($sls_disp_term.equalsIgnoreCase(name)) {
			sls_disp_term(value);
			return;
		}
		if ($sum_term.equalsIgnoreCase(name)) {
			sum_term(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($sls_disp_term.equalsIgnoreCase(name)) {
			sls_disp_term(value);
			return;
		}
		if ($sum_term.equalsIgnoreCase(name)) {
			sum_term(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($sls_disp_term.equalsIgnoreCase(name)) {
			sls_disp_term(value);
			return;
		}
		if ($sum_term.equalsIgnoreCase(name)) {
			sum_term(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($sls_disp_term.equalsIgnoreCase(name)) {
			sls_disp_term(value);
			return;
		}
		if ($sum_term.equalsIgnoreCase(name)) {
			sum_term(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($sls_disp_term.equalsIgnoreCase(name)) {
			sls_disp_term(value);
			return;
		}
		if ($sum_term.equalsIgnoreCase(name)) {
			sum_term(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($inpt_ym.equalsIgnoreCase(name)) {
			inpt_ym(value);
			return;
		}
		super.setDate(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($sls_flg.equalsIgnoreCase(name)) {
			sls_flg(value);
			return;
		}
		if ($slo_bl_flg.equalsIgnoreCase(name)) {
			slo_bl_flg(value);
			return;
		}
		if ($slo_flg.equalsIgnoreCase(name)) {
			slo_flg(value);
			return;
		}
		if ($spln_flg.equalsIgnoreCase(name)) {
			spln_flg(value);
			return;
		}
		if ($spln_per_cmpl_sls_flg.equalsIgnoreCase(name)) {
			spln_per_cmpl_sls_flg(value);
			return;
		}
		if ($bdg_flg.equalsIgnoreCase(name)) {
			bdg_flg(value);
			return;
		}
		if ($bdg_per_cmpl_sls_flg.equalsIgnoreCase(name)) {
			bdg_per_cmpl_sls_flg(value);
			return;
		}
		if ($prof_amt_flg.equalsIgnoreCase(name)) {
			prof_amt_flg(value);
			return;
		}
		if ($prof_rate_flg.equalsIgnoreCase(name)) {
			prof_rate_flg(value);
			return;
		}
		if ($sls_trnst_disp.equalsIgnoreCase(name)) {
			sls_trnst_disp(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($base_cur_cd.equalsIgnoreCase(name)) {
			base_cur_cd(value);
			return;
		}
		if ($base_cur_nm.equalsIgnoreCase(name)) {
			base_cur_nm(value);
			return;
		}
		if ($unit.equalsIgnoreCase(name)) {
			unit(value);
			return;
		}
		if ($big_num_rnd_typ.equalsIgnoreCase(name)) {
			big_num_rnd_typ(value);
			return;
		}
		if ($big_num_rnd_typ_nm.equalsIgnoreCase(name)) {
			big_num_rnd_typ_nm(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($sls_disp_term.equalsIgnoreCase(name)) {
			sls_disp_term(value);
			return;
		}
		if ($sum_term.equalsIgnoreCase(name)) {
			sum_term(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($sls_disp_term.equalsIgnoreCase(name)) {
			sls_disp_term(value);
			return;
		}
		if ($sum_term.equalsIgnoreCase(name)) {
			sum_term(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($sls_disp_term.equalsIgnoreCase(name)) {
			sls_disp_term(value);
			return;
		}
		if ($sum_term.equalsIgnoreCase(name)) {
			sum_term(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($sls_disp_term.equalsIgnoreCase(name)) {
			sls_disp_term(value);
			return;
		}
		if ($sum_term.equalsIgnoreCase(name)) {
			sum_term(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($sls_disp_term.equalsIgnoreCase(name)) {
			sls_disp_term(value);
			return;
		}
		if ($sum_term.equalsIgnoreCase(name)) {
			sum_term(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($inpt_ym.equalsIgnoreCase(name)) {
			inpt_ym(value);
			return;
		}
		super.setDateNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($sls_flg.equalsIgnoreCase(name)) {
			sls_flg(value);
			return;
		}
		if ($slo_bl_flg.equalsIgnoreCase(name)) {
			slo_bl_flg(value);
			return;
		}
		if ($slo_flg.equalsIgnoreCase(name)) {
			slo_flg(value);
			return;
		}
		if ($spln_flg.equalsIgnoreCase(name)) {
			spln_flg(value);
			return;
		}
		if ($spln_per_cmpl_sls_flg.equalsIgnoreCase(name)) {
			spln_per_cmpl_sls_flg(value);
			return;
		}
		if ($bdg_flg.equalsIgnoreCase(name)) {
			bdg_flg(value);
			return;
		}
		if ($bdg_per_cmpl_sls_flg.equalsIgnoreCase(name)) {
			bdg_per_cmpl_sls_flg(value);
			return;
		}
		if ($prof_amt_flg.equalsIgnoreCase(name)) {
			prof_amt_flg(value);
			return;
		}
		if ($prof_rate_flg.equalsIgnoreCase(name)) {
			prof_rate_flg(value);
			return;
		}
		if ($sls_trnst_disp.equalsIgnoreCase(name)) {
			sls_trnst_disp(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

