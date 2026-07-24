package mcframe.serverMGBD.MGBDL0250;

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
 * ブロック"Srch01_Key"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Srch01_KeyR_MC_A extends MCConstRow {

	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public static final String $dpt_cd2 = "dpt_cd2";
	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public static final String $dpt_nm2 = "dpt_nm2";


	public static final MCMeta dpt_cd2_META = createCommonMeta($dpt_cd2, mcframe.commonMA.meta.MA_META.COST_DPT_CD);
	public static final MCMeta dpt_nm2_META = createCommonMeta($dpt_nm2, mcframe.commonMA.meta.MA_META.COST_DPT_NM);

	protected static final ConstMetaList<Srch01_KeyR> constMetas = new ConstMetaList<Srch01_KeyR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			dpt_cd2_META,
			dpt_nm2_META
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
	protected Srch01_KeyR_MC_A(ConstMetaList<? extends Srch01_KeyR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_KeyR clone() {
		return (Srch01_KeyR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_KeyR createInstance() {
		return (Srch01_KeyR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_KeyR getValues(String... names) {
		return (Srch01_KeyR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public String dpt_cd2() {
		return getConstString(offset + 0, $dpt_cd2);
	}

	/**
	 * Dept. cd. 部門ＣＤ.<p>
	 *
	 */
	public void dpt_cd2(String value) {
		setConstString(offset + 0, $dpt_cd2, value);
	}


	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public String dpt_nm2() {
		return getConstString(offset + 1, $dpt_nm2);
	}

	/**
	 * Dept. name 部門名.<p>
	 *
	 */
	public void dpt_nm2(String value) {
		setConstString(offset + 1, $dpt_nm2, value);
	}


	public String getString(String name) {
		if ($dpt_cd2.equalsIgnoreCase(name)) {
			return dpt_cd2();
		}
		if ($dpt_nm2.equalsIgnoreCase(name)) {
			return dpt_nm2();
		}
		return super.getString(name);
	}

	public String getStringNE(String name) {
		if ($dpt_cd2.equalsIgnoreCase(name)) {
			return dpt_cd2();
		}
		if ($dpt_nm2.equalsIgnoreCase(name)) {
			return dpt_nm2();
		}
		return super.getStringNE(name);
	}

	public void setString(String name, String value) {
		if ($dpt_cd2.equalsIgnoreCase(name)) {
			dpt_cd2(value);
			return;
		}
		if ($dpt_nm2.equalsIgnoreCase(name)) {
			dpt_nm2(value);
			return;
		}
		super.setString(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($dpt_cd2.equalsIgnoreCase(name)) {
			dpt_cd2(value);
			return;
		}
		if ($dpt_nm2.equalsIgnoreCase(name)) {
			dpt_nm2(value);
			return;
		}
		super.setStringNE(name, value);
	}



}

