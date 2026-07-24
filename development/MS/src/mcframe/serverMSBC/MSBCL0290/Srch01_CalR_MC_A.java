package mcframe.serverMSBC.MSBCL0290;

import java.util.List;
import java.util.Map;
import java.util.Set;
import mcframe.commonCore.container.MCExtMap;
import mcframe.commonCore.container.MCExtList;
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
 * ブロック"Srch01_Cal"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Srch01_CalR_MC_A extends MCConstRow {

	/**
	 * Calendar cd. カレンダＣＤ.<p>
	 *
	 */
	public static final String $cal_cd = "cal_cd";
	/**
	 * Non-working day 非稼働日.<p>
	 *
	 */
	public static final String $off_dt = "off_dt";


	public static final MCMeta cal_cd_META = createCommonMeta($cal_cd, mcframe.commonMA.meta.MA_META.CAL_CD);
	public static final MCMeta off_dt_META = createCommonMeta($off_dt, mcframe.commonMA.meta.MA_META.DT);

	protected static final ConstMetaList<Srch01_CalR> constMetas = new ConstMetaList<Srch01_CalR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			cal_cd_META,
			off_dt_META
		},
		new String[][]{
			{
			},
			{
			}
		}
	);

	/** 項目属性情報のグループ[CONST]のキー定数 */
	public static final String $$CONST = "CONST";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$CONST, new MCExtList(
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
	 * 指定グループの項目属性情報を返します。
	 */
	public Map<String, String> getExtMap(String aGroup){
		if(aGroup == null) return null;
		return EXTMAP.get(aGroup);
	}

	/**
	 * 指定グループの項目属性が登録された項目リストを返します。
	 */
	public List<String> getKeys(String aGroup){
		if(aGroup == null) return null;
		return EXTMAP.getKeyList(aGroup);
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
	protected Srch01_CalR_MC_A(ConstMetaList<? extends Srch01_CalR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_CalR clone() {
		return (Srch01_CalR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_CalR createInstance() {
		return (Srch01_CalR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_CalR getValues(String... names) {
		return (Srch01_CalR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Calendar cd. カレンダＣＤ.<p>
	 *
	 */
	public String cal_cd() {
		return getConstString(offset + 0, $cal_cd);
	}

	/**
	 * Calendar cd. カレンダＣＤ.<p>
	 *
	 */
	public void cal_cd(String value) {
		setConstString(offset + 0, $cal_cd, value);
	}


	/**
	 * Non-working day 非稼働日.<p>
	 *
	 */
	public MCDate off_dt() {
		return getConstDate(offset + 1, $off_dt);
	}

	/**
	 * Non-working day 非稼働日.<p>
	 *
	 */
	public void off_dt(MCDate value) {
		setConstDate(offset + 1, $off_dt, value);
	}


	public String getString(String name) {
		if ($cal_cd.equalsIgnoreCase(name)) {
			return cal_cd();
		}
		return super.getString(name);
	}
	public MCDate getDate(String name) {
		if ($off_dt.equalsIgnoreCase(name)) {
			return off_dt();
		}
		return super.getDate(name);
	}

	public String getStringNE(String name) {
		if ($cal_cd.equalsIgnoreCase(name)) {
			return cal_cd();
		}
		return super.getStringNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($off_dt.equalsIgnoreCase(name)) {
			return off_dt();
		}
		return super.getDateNE(name);
	}

	public void setString(String name, String value) {
		if ($cal_cd.equalsIgnoreCase(name)) {
			cal_cd(value);
			return;
		}
		super.setString(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($off_dt.equalsIgnoreCase(name)) {
			off_dt(value);
			return;
		}
		super.setDate(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($cal_cd.equalsIgnoreCase(name)) {
			cal_cd(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($off_dt.equalsIgnoreCase(name)) {
			off_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}



}

