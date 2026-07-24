package mcframe.clientMABC.MABCP0140;

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
 * ブロック"Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class DtlR_MC_A extends MCConstRow {

	/**
	 * Module ID モジュールＩＤ.<p>
	 *
	 */
	public static final String $module_id = "module_id";
	/**
	 * Module name モジュール名.<p>
	 *
	 */
	public static final String $module_nm = "module_nm";
	/**
	 * Constant group 定数グループ.<p>
	 *
	 */
	public static final String $const_grp = "const_grp";
	/**
	 * Constant group name 定数グループ名.<p>
	 *
	 */
	public static final String $const_grp_nm = "const_grp_nm";


	public static final MCMeta module_id_META = createCommonMeta($module_id, mcframe.commonMA.meta.MA_META.MODULE_ID);
	public static final MCMeta module_nm_META = createCommonMeta($module_nm, mcframe.commonMA.meta.MA_META.MODULE_NM);
	public static final MCMeta const_grp_META = createStringMeta($const_grp);
	public static final MCMeta const_grp_nm_META = createStringMeta($const_grp_nm);

	protected static final ConstMetaList<DtlR> constMetas = new ConstMetaList<DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			module_id_META,
			module_nm_META,
			const_grp_META,
			const_grp_nm_META
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


	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null
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
	protected DtlR_MC_A(ConstMetaList<? extends DtlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DtlR clone() {
		return (DtlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DtlR createInstance() {
		return (DtlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DtlR getValues(String... names) {
		return (DtlR) super.getValues(names);
	}



	/**
	 * Module ID モジュールＩＤ.<p>
	 *
	 */
	public String module_id() {
		return getConstString(offset + 0, $module_id);
	}

	/**
	 * Module ID モジュールＩＤ.<p>
	 *
	 */
	public void module_id(String value) {
		setConstString(offset + 0, $module_id, value);
	}


	/**
	 * Module name モジュール名.<p>
	 *
	 */
	public String module_nm() {
		return getConstString(offset + 1, $module_nm);
	}

	/**
	 * Module name モジュール名.<p>
	 *
	 */
	public void module_nm(String value) {
		setConstString(offset + 1, $module_nm, value);
	}


	/**
	 * Constant group 定数グループ.<p>
	 *
	 */
	public String const_grp() {
		return getConstString(offset + 2, $const_grp);
	}

	/**
	 * Constant group 定数グループ.<p>
	 *
	 */
	public void const_grp(String value) {
		setConstString(offset + 2, $const_grp, value);
	}


	/**
	 * Constant group name 定数グループ名.<p>
	 *
	 */
	public String const_grp_nm() {
		return getConstString(offset + 3, $const_grp_nm);
	}

	/**
	 * Constant group name 定数グループ名.<p>
	 *
	 */
	public void const_grp_nm(String value) {
		setConstString(offset + 3, $const_grp_nm, value);
	}


	public String getString(String name) {
		if ($module_id.equalsIgnoreCase(name)) {
			return module_id();
		}
		if ($module_nm.equalsIgnoreCase(name)) {
			return module_nm();
		}
		if ($const_grp.equalsIgnoreCase(name)) {
			return const_grp();
		}
		if ($const_grp_nm.equalsIgnoreCase(name)) {
			return const_grp_nm();
		}
		return super.getString(name);
	}

	public String getStringNE(String name) {
		if ($module_id.equalsIgnoreCase(name)) {
			return module_id();
		}
		if ($module_nm.equalsIgnoreCase(name)) {
			return module_nm();
		}
		if ($const_grp.equalsIgnoreCase(name)) {
			return const_grp();
		}
		if ($const_grp_nm.equalsIgnoreCase(name)) {
			return const_grp_nm();
		}
		return super.getStringNE(name);
	}

	public void setString(String name, String value) {
		if ($module_id.equalsIgnoreCase(name)) {
			module_id(value);
			return;
		}
		if ($module_nm.equalsIgnoreCase(name)) {
			module_nm(value);
			return;
		}
		if ($const_grp.equalsIgnoreCase(name)) {
			const_grp(value);
			return;
		}
		if ($const_grp_nm.equalsIgnoreCase(name)) {
			const_grp_nm(value);
			return;
		}
		super.setString(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($module_id.equalsIgnoreCase(name)) {
			module_id(value);
			return;
		}
		if ($module_nm.equalsIgnoreCase(name)) {
			module_nm(value);
			return;
		}
		if ($const_grp.equalsIgnoreCase(name)) {
			const_grp(value);
			return;
		}
		if ($const_grp_nm.equalsIgnoreCase(name)) {
			const_grp_nm(value);
			return;
		}
		super.setStringNE(name, value);
	}



}

