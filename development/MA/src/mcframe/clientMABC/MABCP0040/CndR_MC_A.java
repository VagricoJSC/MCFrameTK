package mcframe.clientMABC.MABCP0040;

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
	 * Master マスタ.<p>
	 *
	 */
	public static final String $mst_nm = "mst_nm";
	/**
	 * Master name マスタ名.<p>
	 *
	 */
	public static final String $mst_nm_nm = "mst_nm_nm";
	/**
	 * Partial match 部分一致.<p>
	 *
	 */
	public static final String $partial_flg = "partial_flg";


	public static final MCMeta mst_nm_META = createCommonMeta($mst_nm, mcframe.commonMA.meta.MA_META.ORA_OBJ_NM);
	public static final MCMeta mst_nm_nm_META = createStringMeta($mst_nm_nm);
	public static final MCMeta partial_flg_META = createCommonMeta($partial_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final ConstMetaList<CndR> constMetas = new ConstMetaList<CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			mst_nm_META,
			mst_nm_nm_META,
			partial_flg_META
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
	 * Master マスタ.<p>
	 *
	 */
	public String mst_nm() {
		return getConstString(offset + 0, $mst_nm);
	}

	/**
	 * Master マスタ.<p>
	 *
	 */
	public void mst_nm(String value) {
		setConstString(offset + 0, $mst_nm, value);
	}


	/**
	 * Master name マスタ名.<p>
	 *
	 */
	public String mst_nm_nm() {
		return getConstString(offset + 1, $mst_nm_nm);
	}

	/**
	 * Master name マスタ名.<p>
	 *
	 */
	public void mst_nm_nm(String value) {
		setConstString(offset + 1, $mst_nm_nm, value);
	}


	/**
	 * Partial match 部分一致.<p>
	 *
	 */
	public boolean partial_flg() {
		return getConstBoolean(offset + 2, $partial_flg);
	}

	/**
	 * Partial match 部分一致.<p>
	 *
	 */
	public void partial_flg(boolean value) {
		setConstBoolean(offset + 2, $partial_flg, value);
	}


	public String getString(String name) {
		if ($mst_nm.equalsIgnoreCase(name)) {
			return mst_nm();
		}
		if ($mst_nm_nm.equalsIgnoreCase(name)) {
			return mst_nm_nm();
		}
		return super.getString(name);
	}
	public boolean getBoolean(String name) {
		if ($partial_flg.equalsIgnoreCase(name)) {
			return partial_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($mst_nm.equalsIgnoreCase(name)) {
			return mst_nm();
		}
		if ($mst_nm_nm.equalsIgnoreCase(name)) {
			return mst_nm_nm();
		}
		return super.getStringNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($partial_flg.equalsIgnoreCase(name)) {
			return partial_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($mst_nm.equalsIgnoreCase(name)) {
			mst_nm(value);
			return;
		}
		if ($mst_nm_nm.equalsIgnoreCase(name)) {
			mst_nm_nm(value);
			return;
		}
		super.setString(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($partial_flg.equalsIgnoreCase(name)) {
			partial_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($mst_nm.equalsIgnoreCase(name)) {
			mst_nm(value);
			return;
		}
		if ($mst_nm_nm.equalsIgnoreCase(name)) {
			mst_nm_nm(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($partial_flg.equalsIgnoreCase(name)) {
			partial_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

