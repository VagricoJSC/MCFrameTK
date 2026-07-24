package mcframe.serverMSBI.MSBIL0010;

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
 * ブロック"Srch01_Cnd"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Srch01_CndR_MC_A extends MCConstRow {

	/**
	 * Closing type 締処理区分.<p>
	 *
	 */
	public static final String $cl_typ = "cl_typ";
	/**
	 * Month to process 処理対象年月.<p>
	 *
	 */
	public static final String $cl_ym = "cl_ym";
	/**
	 * Closing date 締日.<p>
	 *
	 */
	public static final String $cl_dt = "cl_dt";


	public static final MCMeta cl_typ_META = createStringMeta($cl_typ);
	public static final MCMeta cl_ym_META = createCommonMeta($cl_ym, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta cl_dt_META = createCommonMeta($cl_dt, mcframe.commonMA.meta.MA_META.DT);

	protected static final ConstMetaList<Srch01_CndR> constMetas = new ConstMetaList<Srch01_CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			cl_typ_META,
			cl_ym_META,
			cl_dt_META
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
	protected Srch01_CndR_MC_A(ConstMetaList<? extends Srch01_CndR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_CndR clone() {
		return (Srch01_CndR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_CndR createInstance() {
		return (Srch01_CndR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_CndR getValues(String... names) {
		return (Srch01_CndR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Closing type 締処理区分.<p>
	 *
	 */
	public String cl_typ() {
		return getConstString(offset + 0, $cl_typ);
	}

	/**
	 * Closing type 締処理区分.<p>
	 *
	 */
	public void cl_typ(String value) {
		setConstString(offset + 0, $cl_typ, value);
	}


	/**
	 * Month to process 処理対象年月.<p>
	 *
	 */
	public MCDate cl_ym() {
		return getConstDate(offset + 1, $cl_ym);
	}

	/**
	 * Month to process 処理対象年月.<p>
	 *
	 */
	public void cl_ym(MCDate value) {
		setConstDate(offset + 1, $cl_ym, value);
	}


	/**
	 * Closing date 締日.<p>
	 *
	 */
	public MCDate cl_dt() {
		return getConstDate(offset + 2, $cl_dt);
	}

	/**
	 * Closing date 締日.<p>
	 *
	 */
	public void cl_dt(MCDate value) {
		setConstDate(offset + 2, $cl_dt, value);
	}


	public String getString(String name) {
		if ($cl_typ.equalsIgnoreCase(name)) {
			return cl_typ();
		}
		return super.getString(name);
	}
	public MCDate getDate(String name) {
		if ($cl_ym.equalsIgnoreCase(name)) {
			return cl_ym();
		}
		if ($cl_dt.equalsIgnoreCase(name)) {
			return cl_dt();
		}
		return super.getDate(name);
	}

	public String getStringNE(String name) {
		if ($cl_typ.equalsIgnoreCase(name)) {
			return cl_typ();
		}
		return super.getStringNE(name);
	}
	public MCDate getDateNE(String name) {
		if ($cl_ym.equalsIgnoreCase(name)) {
			return cl_ym();
		}
		if ($cl_dt.equalsIgnoreCase(name)) {
			return cl_dt();
		}
		return super.getDateNE(name);
	}

	public void setString(String name, String value) {
		if ($cl_typ.equalsIgnoreCase(name)) {
			cl_typ(value);
			return;
		}
		super.setString(name, value);
	}
	public void setDate(String name, MCDate value) {
		if ($cl_ym.equalsIgnoreCase(name)) {
			cl_ym(value);
			return;
		}
		if ($cl_dt.equalsIgnoreCase(name)) {
			cl_dt(value);
			return;
		}
		super.setDate(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($cl_typ.equalsIgnoreCase(name)) {
			cl_typ(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setDateNE(String name, MCDate value) {
		if ($cl_ym.equalsIgnoreCase(name)) {
			cl_ym(value);
			return;
		}
		if ($cl_dt.equalsIgnoreCase(name)) {
			cl_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}



}

