package mcframe.serverMAUD.MAUDL6010;

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
 * ブロック"Srch01_Rslt"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Srch01_RsltR_MC_A extends MCConstRow {

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


	public static final MCMeta mst_set_typ_META = createCommonMeta($mst_set_typ, mcframe.commonMA.meta.MA_META.MST_SET_TYP);
	public static final MCMeta mst_set_typ_nm_META = createCommonMeta($mst_set_typ_nm, mcframe.commonMA.meta.MA_META.MST_SET_TYP_NM);

	protected static final ConstMetaList<Srch01_RsltR> constMetas = new ConstMetaList<Srch01_RsltR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			mst_set_typ_META,
			mst_set_typ_nm_META
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
	protected Srch01_RsltR_MC_A(ConstMetaList<? extends Srch01_RsltR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_RsltR clone() {
		return (Srch01_RsltR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_RsltR createInstance() {
		return (Srch01_RsltR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_RsltR getValues(String... names) {
		return (Srch01_RsltR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Master setting type マスタ設定区分.<p>
	 *
	 */
	public String mst_set_typ() {
		return getConstString(offset + 0, $mst_set_typ);
	}

	/**
	 * Master setting type マスタ設定区分.<p>
	 *
	 */
	public void mst_set_typ(String value) {
		setConstString(offset + 0, $mst_set_typ, value);
	}


	/**
	 * Master setting type name マスタ設定区分名.<p>
	 *
	 */
	public String mst_set_typ_nm() {
		return getConstString(offset + 1, $mst_set_typ_nm);
	}

	/**
	 * Master setting type name マスタ設定区分名.<p>
	 *
	 */
	public void mst_set_typ_nm(String value) {
		setConstString(offset + 1, $mst_set_typ_nm, value);
	}


	public String getString(String name) {
		if ($mst_set_typ.equalsIgnoreCase(name)) {
			return mst_set_typ();
		}
		if ($mst_set_typ_nm.equalsIgnoreCase(name)) {
			return mst_set_typ_nm();
		}
		return super.getString(name);
	}

	public String getStringNE(String name) {
		if ($mst_set_typ.equalsIgnoreCase(name)) {
			return mst_set_typ();
		}
		if ($mst_set_typ_nm.equalsIgnoreCase(name)) {
			return mst_set_typ_nm();
		}
		return super.getStringNE(name);
	}

	public void setString(String name, String value) {
		if ($mst_set_typ.equalsIgnoreCase(name)) {
			mst_set_typ(value);
			return;
		}
		if ($mst_set_typ_nm.equalsIgnoreCase(name)) {
			mst_set_typ_nm(value);
			return;
		}
		super.setString(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($mst_set_typ.equalsIgnoreCase(name)) {
			mst_set_typ(value);
			return;
		}
		if ($mst_set_typ_nm.equalsIgnoreCase(name)) {
			mst_set_typ_nm(value);
			return;
		}
		super.setStringNE(name, value);
	}



}

