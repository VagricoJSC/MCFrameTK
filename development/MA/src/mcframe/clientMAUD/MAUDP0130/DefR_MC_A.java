package mcframe.clientMAUD.MAUDP0130;

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
 * ブロック"Def"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class DefR_MC_A extends MCConstRow {

	/**
	 * XLSX,xlsx,10;CSV,csv,20 XLSX,xlsx,10;CSV,csv,20.<p>
	 *
	 */
	public static final String $file_typ_over_cap = "file_typ_over_cap";


	public static final MCMeta file_typ_over_cap_META = createStringMeta($file_typ_over_cap);

	protected static final ConstMetaList<DefR> constMetas = new ConstMetaList<DefR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			file_typ_over_cap_META
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
	protected DefR_MC_A(ConstMetaList<? extends DefR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DefR clone() {
		return (DefR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DefR createInstance() {
		return (DefR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DefR getValues(String... names) {
		return (DefR) super.getValues(names);
	}



	/**
	 * XLSX,xlsx,10;CSV,csv,20 XLSX,xlsx,10;CSV,csv,20.<p>
	 *
	 */
	public String file_typ_over_cap() {
		return getConstString(offset + 0, $file_typ_over_cap);
	}

	/**
	 * XLSX,xlsx,10;CSV,csv,20 XLSX,xlsx,10;CSV,csv,20.<p>
	 *
	 */
	public void file_typ_over_cap(String value) {
		setConstString(offset + 0, $file_typ_over_cap, value);
	}


	public String getString(String name) {
		if ($file_typ_over_cap.equalsIgnoreCase(name)) {
			return file_typ_over_cap();
		}
		return super.getString(name);
	}

	public String getStringNE(String name) {
		if ($file_typ_over_cap.equalsIgnoreCase(name)) {
			return file_typ_over_cap();
		}
		return super.getStringNE(name);
	}

	public void setString(String name, String value) {
		if ($file_typ_over_cap.equalsIgnoreCase(name)) {
			file_typ_over_cap(value);
			return;
		}
		super.setString(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($file_typ_over_cap.equalsIgnoreCase(name)) {
			file_typ_over_cap(value);
			return;
		}
		super.setStringNE(name, value);
	}



}

