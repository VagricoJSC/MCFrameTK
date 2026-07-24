package mcframe.serverMABC.MABCL0040;

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
 * ブロック"Srch01_Rslt1"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Srch01_Rslt1R_MC_A extends MCConstRow {

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
	 * Master setting type マスタ設定区分.<p>
	 *
	 */
	public static final String $mst_set_typ = "mst_set_typ";
	/**
	 * Master setting type name マスタ設定区分名.<p>
	 *
	 */
	public static final String $mst_set_typ_nm = "mst_set_typ_nm";
	/**
	 * Master string マスタ文字列.<p>
	 *
	 */
	public static final String $mst_key = "mst_key";
	/**
	 * Locale management ロケール管理.<p>
	 *
	 */
	public static final String $lcl_flg = "lcl_flg";
	/**
	 * Sort order ソート順.<p>
	 *
	 */
	public static final String $multi_sort = "multi_sort";


	public static final MCMeta mst_nm_META = createCommonMeta($mst_nm, mcframe.commonMA.meta.MA_META.ORA_OBJ_NM);
	public static final MCMeta mst_nm_nm_META = createStringMeta($mst_nm_nm);
	public static final MCMeta mst_set_typ_META = createCommonMeta($mst_set_typ, mcframe.commonMA.meta.MA_META.MST_SET_TYP);
	public static final MCMeta mst_set_typ_nm_META = createCommonMeta($mst_set_typ_nm, mcframe.commonMA.meta.MA_META.MST_SET_TYP_NM);
	public static final MCMeta mst_key_META = createStringMeta($mst_key);
	public static final MCMeta lcl_flg_META = createCommonMeta($lcl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta multi_sort_META = createNumberMeta($multi_sort);

	protected static final ConstMetaList<Srch01_Rslt1R> constMetas = new ConstMetaList<Srch01_Rslt1R>(
		MCConstRow.constMetas,
		new MCMeta[]{
			mst_nm_META,
			mst_nm_nm_META,
			mst_set_typ_META,
			mst_set_typ_nm_META,
			mst_key_META,
			lcl_flg_META,
			multi_sort_META
		},
		new String[][]{
			{
			},
			{
			}
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
	protected Srch01_Rslt1R_MC_A(ConstMetaList<? extends Srch01_Rslt1R> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_Rslt1R clone() {
		return (Srch01_Rslt1R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_Rslt1R createInstance() {
		return (Srch01_Rslt1R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_Rslt1R getValues(String... names) {
		return (Srch01_Rslt1R) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
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
	 * Master setting type マスタ設定区分.<p>
	 *
	 */
	public String mst_set_typ() {
		return getConstString(offset + 2, $mst_set_typ);
	}

	/**
	 * Master setting type マスタ設定区分.<p>
	 *
	 */
	public void mst_set_typ(String value) {
		setConstString(offset + 2, $mst_set_typ, value);
	}


	/**
	 * Master setting type name マスタ設定区分名.<p>
	 *
	 */
	public String mst_set_typ_nm() {
		return getConstString(offset + 3, $mst_set_typ_nm);
	}

	/**
	 * Master setting type name マスタ設定区分名.<p>
	 *
	 */
	public void mst_set_typ_nm(String value) {
		setConstString(offset + 3, $mst_set_typ_nm, value);
	}


	/**
	 * Master string マスタ文字列.<p>
	 *
	 */
	public String mst_key() {
		return getConstString(offset + 4, $mst_key);
	}

	/**
	 * Master string マスタ文字列.<p>
	 *
	 */
	public void mst_key(String value) {
		setConstString(offset + 4, $mst_key, value);
	}


	/**
	 * Locale management ロケール管理.<p>
	 *
	 */
	public boolean lcl_flg() {
		return getConstBoolean(offset + 5, $lcl_flg);
	}

	/**
	 * Locale management ロケール管理.<p>
	 *
	 */
	public void lcl_flg(boolean value) {
		setConstBoolean(offset + 5, $lcl_flg, value);
	}


	/**
	 * Sort order ソート順.<p>
	 *
	 */
	public MCNumber multi_sort() {
		return getConstNumber(offset + 6, $multi_sort);
	}

	/**
	 * Sort order ソート順.<p>
	 *
	 */
	public void multi_sort(MCNumber value) {
		setConstNumber(offset + 6, $multi_sort, value);
	}

	/**
	 * Sort order ソート順.<p>
	 *
	 */
	public void multi_sort(int value) {
		setConstNumber(offset + 6, $multi_sort, value);
	}

	/**
	 * Sort order ソート順.<p>
	 *
	 */
	public void multi_sort(long value) {
		setConstNumber(offset + 6, $multi_sort, value);
	}

	/**
	 * Sort order ソート順.<p>
	 *
	 */
	public void multi_sort(float value) {
		setConstNumber(offset + 6, $multi_sort, value);
	}

	/**
	 * Sort order ソート順.<p>
	 *
	 */
	public void multi_sort(double value) {
		setConstNumber(offset + 6, $multi_sort, value);
	}


	public String getString(String name) {
		if ($mst_nm.equalsIgnoreCase(name)) {
			return mst_nm();
		}
		if ($mst_nm_nm.equalsIgnoreCase(name)) {
			return mst_nm_nm();
		}
		if ($mst_set_typ.equalsIgnoreCase(name)) {
			return mst_set_typ();
		}
		if ($mst_set_typ_nm.equalsIgnoreCase(name)) {
			return mst_set_typ_nm();
		}
		if ($mst_key.equalsIgnoreCase(name)) {
			return mst_key();
		}
		return super.getString(name);
	}
	public MCNumber getNumber(String name) {
		if ($multi_sort.equalsIgnoreCase(name)) {
			return multi_sort();
		}
		return super.getNumber(name);
	}
	public boolean getBoolean(String name) {
		if ($lcl_flg.equalsIgnoreCase(name)) {
			return lcl_flg();
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
		if ($mst_set_typ.equalsIgnoreCase(name)) {
			return mst_set_typ();
		}
		if ($mst_set_typ_nm.equalsIgnoreCase(name)) {
			return mst_set_typ_nm();
		}
		if ($mst_key.equalsIgnoreCase(name)) {
			return mst_key();
		}
		return super.getStringNE(name);
	}
	public MCNumber getNumberNE(String name) {
		if ($multi_sort.equalsIgnoreCase(name)) {
			return multi_sort();
		}
		return super.getNumberNE(name);
	}
	public boolean getBooleanNE(String name) {
		if ($lcl_flg.equalsIgnoreCase(name)) {
			return lcl_flg();
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
		if ($mst_set_typ.equalsIgnoreCase(name)) {
			mst_set_typ(value);
			return;
		}
		if ($mst_set_typ_nm.equalsIgnoreCase(name)) {
			mst_set_typ_nm(value);
			return;
		}
		if ($mst_key.equalsIgnoreCase(name)) {
			mst_key(value);
			return;
		}
		super.setString(name, value);
	}
	public void setNumber(String name, MCNumber value) {
		if ($multi_sort.equalsIgnoreCase(name)) {
			multi_sort(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, int value) {
		if ($multi_sort.equalsIgnoreCase(name)) {
			multi_sort(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, long value) {
		if ($multi_sort.equalsIgnoreCase(name)) {
			multi_sort(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, float value) {
		if ($multi_sort.equalsIgnoreCase(name)) {
			multi_sort(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setNumber(String name, double value) {
		if ($multi_sort.equalsIgnoreCase(name)) {
			multi_sort(value);
			return;
		}
		super.setNumber(name, value);
	}
	public void setBoolean(String name, boolean value) {
		if ($lcl_flg.equalsIgnoreCase(name)) {
			lcl_flg(value);
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
		if ($mst_set_typ.equalsIgnoreCase(name)) {
			mst_set_typ(value);
			return;
		}
		if ($mst_set_typ_nm.equalsIgnoreCase(name)) {
			mst_set_typ_nm(value);
			return;
		}
		if ($mst_key.equalsIgnoreCase(name)) {
			mst_key(value);
			return;
		}
		super.setStringNE(name, value);
	}
	public void setNumberNE(String name, MCNumber value) {
		if ($multi_sort.equalsIgnoreCase(name)) {
			multi_sort(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, int value) {
		if ($multi_sort.equalsIgnoreCase(name)) {
			multi_sort(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, long value) {
		if ($multi_sort.equalsIgnoreCase(name)) {
			multi_sort(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, float value) {
		if ($multi_sort.equalsIgnoreCase(name)) {
			multi_sort(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setNumberNE(String name, double value) {
		if ($multi_sort.equalsIgnoreCase(name)) {
			multi_sort(value);
			return;
		}
		super.setNumberNE(name, value);
	}
	public void setBooleanNE(String name, boolean value) {
		if ($lcl_flg.equalsIgnoreCase(name)) {
			lcl_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}



}

