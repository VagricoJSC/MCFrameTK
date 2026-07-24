package mcframe.serverMABC.MABCL1520;

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
 * ブロック"Srch03_Cnd"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Srch03_CndR_MC_A extends MCConstRow {

	/**
	 * External system cd. 外部システムＣＤ.<p>
	 *
	 */
	public static final String $ext_sys_cd3 = "ext_sys_cd3";
	/**
	 * IF column type ＩＦ項目区分.<p>
	 *
	 */
	public static final String $bp_cd3 = "bp_cd3";


	public static final MCMeta ext_sys_cd3_META = createCommonMeta($ext_sys_cd3, mcframe.commonMA.meta.MA_META.EXT_SYS_CD);
	public static final MCMeta bp_cd3_META = createCommonMeta($bp_cd3, mcframe.commonMA.meta.MA_META.IF_COL_TYP);

	protected static final ConstMetaList<Srch03_CndR> constMetas = new ConstMetaList<Srch03_CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			ext_sys_cd3_META,
			bp_cd3_META
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
	protected Srch03_CndR_MC_A(ConstMetaList<? extends Srch03_CndR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch03_CndR clone() {
		return (Srch03_CndR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch03_CndR createInstance() {
		return (Srch03_CndR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch03_CndR getValues(String... names) {
		return (Srch03_CndR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * External system cd. 外部システムＣＤ.<p>
	 *
	 */
	public String ext_sys_cd3() {
		return getConstString(offset + 0, $ext_sys_cd3);
	}

	/**
	 * External system cd. 外部システムＣＤ.<p>
	 *
	 */
	public void ext_sys_cd3(String value) {
		setConstString(offset + 0, $ext_sys_cd3, value);
	}


	/**
	 * IF column type ＩＦ項目区分.<p>
	 *
	 */
	public String bp_cd3() {
		return getConstString(offset + 1, $bp_cd3);
	}

	/**
	 * IF column type ＩＦ項目区分.<p>
	 *
	 */
	public void bp_cd3(String value) {
		setConstString(offset + 1, $bp_cd3, value);
	}


	public String getString(String name) {
		if ($ext_sys_cd3.equalsIgnoreCase(name)) {
			return ext_sys_cd3();
		}
		if ($bp_cd3.equalsIgnoreCase(name)) {
			return bp_cd3();
		}
		return super.getString(name);
	}

	public String getStringNE(String name) {
		if ($ext_sys_cd3.equalsIgnoreCase(name)) {
			return ext_sys_cd3();
		}
		if ($bp_cd3.equalsIgnoreCase(name)) {
			return bp_cd3();
		}
		return super.getStringNE(name);
	}

	public void setString(String name, String value) {
		if ($ext_sys_cd3.equalsIgnoreCase(name)) {
			ext_sys_cd3(value);
			return;
		}
		if ($bp_cd3.equalsIgnoreCase(name)) {
			bp_cd3(value);
			return;
		}
		super.setString(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($ext_sys_cd3.equalsIgnoreCase(name)) {
			ext_sys_cd3(value);
			return;
		}
		if ($bp_cd3.equalsIgnoreCase(name)) {
			bp_cd3(value);
			return;
		}
		super.setStringNE(name, value);
	}



}

