package mcframe.serverMGBB.MGBBL0010;

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
 * ブロック"Ins01_Rslt"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Ins01_RsltR_MC_A extends MCConstRow {

	/**
	 * Common data type 共通データ種類区分.<p>
	 *
	 */
	public static final String $ct_data_typ = "ct_data_typ";


	public static final MCMeta ct_data_typ_META = createCommonMeta($ct_data_typ, mcframe.commonMG.meta.MG_META.CT_DATA_TYP);

	protected static final ConstMetaList<Ins01_RsltR> constMetas = new ConstMetaList<Ins01_RsltR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			ct_data_typ_META
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
	protected Ins01_RsltR_MC_A(ConstMetaList<? extends Ins01_RsltR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Ins01_RsltR clone() {
		return (Ins01_RsltR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Ins01_RsltR createInstance() {
		return (Ins01_RsltR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Ins01_RsltR getValues(String... names) {
		return (Ins01_RsltR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Common data type 共通データ種類区分.<p>
	 *
	 */
	public String ct_data_typ() {
		return getConstString(offset + 0, $ct_data_typ);
	}

	/**
	 * Common data type 共通データ種類区分.<p>
	 *
	 */
	public void ct_data_typ(String value) {
		setConstString(offset + 0, $ct_data_typ, value);
	}


	public String getString(String name) {
		if ($ct_data_typ.equalsIgnoreCase(name)) {
			return ct_data_typ();
		}
		return super.getString(name);
	}

	public String getStringNE(String name) {
		if ($ct_data_typ.equalsIgnoreCase(name)) {
			return ct_data_typ();
		}
		return super.getStringNE(name);
	}

	public void setString(String name, String value) {
		if ($ct_data_typ.equalsIgnoreCase(name)) {
			ct_data_typ(value);
			return;
		}
		super.setString(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($ct_data_typ.equalsIgnoreCase(name)) {
			ct_data_typ(value);
			return;
		}
		super.setStringNE(name, value);
	}



}

