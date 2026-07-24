package mcframe.clientMABS.MABSP0250;

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
 * ブロック"BulkSet"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class BulkSetR_MC_A extends MCConstRow {

	/**
	 * Rev. rate (%) 改定率（％）.<p>
	 *
	 */
	public static final String $rev_rate = "rev_rate";
	/**
	 * Rounding type 端数処理区分.<p>
	 *
	 */
	public static final String $rnd_typ = "rnd_typ";
	/**
	 * Rounding type name 端数処理区分名.<p>
	 *
	 */
	public static final String $rnd_typ_nm = "rnd_typ_nm";
	/**
	 * Rev. date 改定日.<p>
	 *
	 */
	public static final String $rev_date = "rev_date";
	/**
	 * Application start date 適用開始日.<p>
	 *
	 */
	public static final String $st_dt = "st_dt";
	/**
	 * Application end date 適用終了日.<p>
	 *
	 */
	public static final String $end_dt = "end_dt";


	public static final MCMeta rev_rate_META = createCommonMeta($rev_rate, mcframe.commonMA.meta.MA_META.PER);
	public static final MCMeta rnd_typ_META = createCommonMeta($rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta rnd_typ_nm_META = createCommonMeta($rnd_typ_nm, mcframe.commonMA.meta.MA_META.RND_TYP_NM);
	public static final MCMeta rev_date_META = createCommonMeta($rev_date, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta st_dt_META = createCommonMeta($st_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta end_dt_META = createCommonMeta($end_dt, mcframe.commonMA.meta.MA_META.DT);

	protected static final ConstMetaList<BulkSetR> constMetas = new ConstMetaList<BulkSetR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			rev_rate_META,
			rnd_typ_META,
			rnd_typ_nm_META,
			rev_date_META,
			st_dt_META,
			end_dt_META
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
	/** 項目属性情報のグループ[DISP_CTL]のキー定数 */
	public static final String $$DISP_CTL = "DISP_CTL";

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
		)),
		new MCExtMap.Entry($$DISP_CTL, new MCExtList(
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
	protected BulkSetR_MC_A(ConstMetaList<? extends BulkSetR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public BulkSetR clone() {
		return (BulkSetR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public BulkSetR createInstance() {
		return (BulkSetR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public BulkSetR getValues(String... names) {
		return (BulkSetR) super.getValues(names);
	}



	/**
	 * Rev. rate (%) 改定率（％）.<p>
	 *
	 */
	public MCNumber rev_rate() {
		return getConstNumber(offset + 0, $rev_rate);
	}

	/**
	 * Rev. rate (%) 改定率（％）.<p>
	 *
	 */
	public void rev_rate(MCNumber value) {
		setConstNumber(offset + 0, $rev_rate, value);
	}

	/**
	 * Rev. rate (%) 改定率（％）.<p>
	 *
	 */
	public void rev_rate(int value) {
		setConstNumber(offset + 0, $rev_rate, value);
	}

	/**
	 * Rev. rate (%) 改定率（％）.<p>
	 *
	 */
	public void rev_rate(long value) {
		setConstNumber(offset + 0, $rev_rate, value);
	}

	/**
	 * Rev. rate (%) 改定率（％）.<p>
	 *
	 */
	public void rev_rate(float value) {
		setConstNumber(offset + 0, $rev_rate, value);
	}

	/**
	 * Rev. rate (%) 改定率（％）.<p>
	 *
	 */
	public void rev_rate(double value) {
		setConstNumber(offset + 0, $rev_rate, value);
	}


	/**
	 * Rounding type 端数処理区分.<p>
	 *
	 */
	public String rnd_typ() {
		return getConstString(offset + 1, $rnd_typ);
	}

	/**
	 * Rounding type 端数処理区分.<p>
	 *
	 */
	public void rnd_typ(String value) {
		setConstString(offset + 1, $rnd_typ, value);
	}


	/**
	 * Rounding type name 端数処理区分名.<p>
	 *
	 */
	public String rnd_typ_nm() {
		return getConstString(offset + 2, $rnd_typ_nm);
	}

	/**
	 * Rounding type name 端数処理区分名.<p>
	 *
	 */
	public void rnd_typ_nm(String value) {
		setConstString(offset + 2, $rnd_typ_nm, value);
	}


	/**
	 * Rev. date 改定日.<p>
	 *
	 */
	public MCDate rev_date() {
		return getConstDate(offset + 3, $rev_date);
	}

	/**
	 * Rev. date 改定日.<p>
	 *
	 */
	public void rev_date(MCDate value) {
		setConstDate(offset + 3, $rev_date, value);
	}


	/**
	 * Application start date 適用開始日.<p>
	 *
	 */
	public MCDate st_dt() {
		return getConstDate(offset + 4, $st_dt);
	}

	/**
	 * Application start date 適用開始日.<p>
	 *
	 */
	public void st_dt(MCDate value) {
		setConstDate(offset + 4, $st_dt, value);
	}


	/**
	 * Application end date 適用終了日.<p>
	 *
	 */
	public MCDate end_dt() {
		return getConstDate(offset + 5, $end_dt);
	}

	/**
	 * Application end date 適用終了日.<p>
	 *
	 */
	public void end_dt(MCDate value) {
		setConstDate(offset + 5, $end_dt, value);
	}


	public String getString(String name) {
		if ($rnd_typ.equalsIgnoreCase(name)) {
			return rnd_typ();
		}
		if ($rnd_typ_nm.equalsIgnoreCase(name)) {
			return rnd_typ_nm();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($rev_rate.equalsIgnoreCase(name)) {
			return rev_rate();
		}
		return super.getNumber(name);
	}
	public MCDate getDate(String name) {
		if ($rev_date.equalsIgnoreCase(name)) {
			return rev_date();
		}
		if ($st_dt.equalsIgnoreCase(name)) {
			return st_dt();
		}
		if ($end_dt.equalsIgnoreCase(name)) {
			return end_dt();
		}
		return super.getDate(name);
	}

	public String getStringNE(String name) {
		if ($rnd_typ.equalsIgnoreCase(name)) {
			return rnd_typ();
		}
		if ($rnd_typ_nm.equalsIgnoreCase(name)) {
			return rnd_typ_nm();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($rev_rate.equalsIgnoreCase(name)) {
			return rev_rate();
		}
		return super.getNumberNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($rev_date.equalsIgnoreCase(name)) {
			return rev_date();
		}
		if ($st_dt.equalsIgnoreCase(name)) {
			return st_dt();
		}
		if ($end_dt.equalsIgnoreCase(name)) {
			return end_dt();
		}
		return super.getDateNE(name);
	}

	public void setString(String name, String value) {
		if ($rnd_typ.equalsIgnoreCase(name)) {
			rnd_typ(value);
			return;
		}
		if ($rnd_typ_nm.equalsIgnoreCase(name)) {
			rnd_typ_nm(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($rev_rate.equalsIgnoreCase(name)) {
			rev_rate(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($rev_rate.equalsIgnoreCase(name)) {
			rev_rate(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($rev_rate.equalsIgnoreCase(name)) {
			rev_rate(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($rev_rate.equalsIgnoreCase(name)) {
			rev_rate(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($rev_rate.equalsIgnoreCase(name)) {
			rev_rate(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($rev_date.equalsIgnoreCase(name)) {
			rev_date(value);
			return;
		}
		if ($st_dt.equalsIgnoreCase(name)) {
			st_dt(value);
			return;
		}
		if ($end_dt.equalsIgnoreCase(name)) {
			end_dt(value);
			return;
		}
		super.setDate(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($rnd_typ.equalsIgnoreCase(name)) {
			rnd_typ(value);
			return;
		}
		if ($rnd_typ_nm.equalsIgnoreCase(name)) {
			rnd_typ_nm(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($rev_rate.equalsIgnoreCase(name)) {
			rev_rate(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($rev_rate.equalsIgnoreCase(name)) {
			rev_rate(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($rev_rate.equalsIgnoreCase(name)) {
			rev_rate(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($rev_rate.equalsIgnoreCase(name)) {
			rev_rate(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($rev_rate.equalsIgnoreCase(name)) {
			rev_rate(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($rev_date.equalsIgnoreCase(name)) {
			rev_date(value);
			return;
		}
		if ($st_dt.equalsIgnoreCase(name)) {
			st_dt(value);
			return;
		}
		if ($end_dt.equalsIgnoreCase(name)) {
			end_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}



}

