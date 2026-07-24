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
 * ブロック"Dtl"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class DtlR_MC_A extends MCConstRow {

	/**
	 * Select 選択.<p>
	 *
	 */
	public static final String $check = "check";
	/**
	 * Master マスタ.<p>
	 *
	 */
	public static final String $mst_key = "mst_key";
	/**
	 * Master name マスタ名.<p>
	 *
	 */
	public static final String $mst_nm_nm = "mst_nm_nm";
	/**
	 * Management 管理.<p>
	 *
	 */
	public static final String $mst_set_typ_nm = "mst_set_typ_nm";
	/**
	 * Locale management ロケール管理.<p>
	 *
	 */
	public static final String $lcl_flg = "lcl_flg";
	/**
	 * Master string マスタ文字列.<p>
	 *
	 */
	public static final String $mst_nm = "mst_nm";


	public static final MCMeta check_META = createCommonMeta($check, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta mst_key_META = createCommonMeta($mst_key, mcframe.commonMA.meta.MA_META.ORA_OBJ_NM);
	public static final MCMeta mst_nm_nm_META = createStringMeta($mst_nm_nm);
	public static final MCMeta mst_set_typ_nm_META = createCommonMeta($mst_set_typ_nm, mcframe.commonMA.meta.MA_META.MST_SET_TYP_NM);
	public static final MCMeta lcl_flg_META = createCommonMeta($lcl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta mst_nm_META = createStringMeta($mst_nm);

	protected static final ConstMetaList<DtlR> constMetas = new ConstMetaList<DtlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			check_META,
			mst_key_META,
			mst_nm_nm_META,
			mst_set_typ_nm_META,
			lcl_flg_META,
			mst_nm_META
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
	 * Select 選択.<p>
	 *
	 */
	public boolean check() {
		return getConstBoolean(offset + 0, $check);
	}

	/**
	 * Select 選択.<p>
	 *
	 */
	public void check(boolean value) {
		setConstBoolean(offset + 0, $check, value);
	}


	/**
	 * Master マスタ.<p>
	 *
	 */
	public String mst_key() {
		return getConstString(offset + 1, $mst_key);
	}

	/**
	 * Master マスタ.<p>
	 *
	 */
	public void mst_key(String value) {
		setConstString(offset + 1, $mst_key, value);
	}


	/**
	 * Master name マスタ名.<p>
	 *
	 */
	public String mst_nm_nm() {
		return getConstString(offset + 2, $mst_nm_nm);
	}

	/**
	 * Master name マスタ名.<p>
	 *
	 */
	public void mst_nm_nm(String value) {
		setConstString(offset + 2, $mst_nm_nm, value);
	}


	/**
	 * Management 管理.<p>
	 *
	 */
	public String mst_set_typ_nm() {
		return getConstString(offset + 3, $mst_set_typ_nm);
	}

	/**
	 * Management 管理.<p>
	 *
	 */
	public void mst_set_typ_nm(String value) {
		setConstString(offset + 3, $mst_set_typ_nm, value);
	}


	/**
	 * Locale management ロケール管理.<p>
	 *
	 */
	public boolean lcl_flg() {
		return getConstBoolean(offset + 4, $lcl_flg);
	}

	/**
	 * Locale management ロケール管理.<p>
	 *
	 */
	public void lcl_flg(boolean value) {
		setConstBoolean(offset + 4, $lcl_flg, value);
	}


	/**
	 * Master string マスタ文字列.<p>
	 *
	 */
	public String mst_nm() {
		return getConstString(offset + 5, $mst_nm);
	}

	/**
	 * Master string マスタ文字列.<p>
	 *
	 */
	public void mst_nm(String value) {
		setConstString(offset + 5, $mst_nm, value);
	}


	public String getString(String name) {
		if ($mst_key.equalsIgnoreCase(name)) {
			return mst_key();
		}
		if ($mst_nm_nm.equalsIgnoreCase(name)) {
			return mst_nm_nm();
		}
		if ($mst_set_typ_nm.equalsIgnoreCase(name)) {
			return mst_set_typ_nm();
		}
		if ($mst_nm.equalsIgnoreCase(name)) {
			return mst_nm();
		}
		return super.getString(name);
	}
	public boolean getBoolean(String name) {
		if ($check.equalsIgnoreCase(name)) {
			return check();
		}
		if ($lcl_flg.equalsIgnoreCase(name)) {
			return lcl_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($mst_key.equalsIgnoreCase(name)) {
			return mst_key();
		}
		if ($mst_nm_nm.equalsIgnoreCase(name)) {
			return mst_nm_nm();
		}
		if ($mst_set_typ_nm.equalsIgnoreCase(name)) {
			return mst_set_typ_nm();
		}
		if ($mst_nm.equalsIgnoreCase(name)) {
			return mst_nm();
		}
		return super.getStringNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($check.equalsIgnoreCase(name)) {
			return check();
		}
		if ($lcl_flg.equalsIgnoreCase(name)) {
			return lcl_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($mst_key.equalsIgnoreCase(name)) {
			mst_key(value);
			return;
		}
		if ($mst_nm_nm.equalsIgnoreCase(name)) {
			mst_nm_nm(value);
			return;
		}
		if ($mst_set_typ_nm.equalsIgnoreCase(name)) {
			mst_set_typ_nm(value);
			return;
		}
		if ($mst_nm.equalsIgnoreCase(name)) {
			mst_nm(value);
			return;
		}
		super.setString(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($check.equalsIgnoreCase(name)) {
			check(value);
			return;
		}
		if ($lcl_flg.equalsIgnoreCase(name)) {
			lcl_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($mst_key.equalsIgnoreCase(name)) {
			mst_key(value);
			return;
		}
		if ($mst_nm_nm.equalsIgnoreCase(name)) {
			mst_nm_nm(value);
			return;
		}
		if ($mst_set_typ_nm.equalsIgnoreCase(name)) {
			mst_set_typ_nm(value);
			return;
		}
		if ($mst_nm.equalsIgnoreCase(name)) {
			mst_nm(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($check.equalsIgnoreCase(name)) {
			check(value);
			return;
		}
		if ($lcl_flg.equalsIgnoreCase(name)) {
			lcl_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

