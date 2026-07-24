package mcframe.clientMSBI.MSBIP0010;

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
	 * 0,Final closing;1,Release final closing;2,Temporary closing;3,Release temporary closing 0,本締;1,本締解除;2,仮締;3,仮締解除.<p>
	 *
	 */
	public static final String $ope = "ope";
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


	public static final MCMeta ope_META = createStringMeta($ope);
	public static final MCMeta cl_ym_META = createCommonMeta($cl_ym, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta cl_dt_META = createCommonMeta($cl_dt, mcframe.commonMA.meta.MA_META.DT);

	protected static final ConstMetaList<CndR> constMetas = new ConstMetaList<CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			ope_META,
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
	 * 0,Final closing;1,Release final closing;2,Temporary closing;3,Release temporary closing 0,本締;1,本締解除;2,仮締;3,仮締解除.<p>
	 *
	 */
	public String ope() {
		return getConstString(offset + 0, $ope);
	}

	/**
	 * 0,Final closing;1,Release final closing;2,Temporary closing;3,Release temporary closing 0,本締;1,本締解除;2,仮締;3,仮締解除.<p>
	 *
	 */
	public void ope(String value) {
		setConstString(offset + 0, $ope, value);
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
		if ($ope.equalsIgnoreCase(name)) {
			return ope();
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
		if ($ope.equalsIgnoreCase(name)) {
			return ope();
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
		if ($ope.equalsIgnoreCase(name)) {
			ope(value);
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
		if ($ope.equalsIgnoreCase(name)) {
			ope(value);
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

