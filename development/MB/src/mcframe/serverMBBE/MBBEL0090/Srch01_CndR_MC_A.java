package mcframe.serverMBBE.MBBEL0090;

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
 * ブロック"Srch01_Cnd"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Srch01_CndR_MC_A extends MCConstRow {

	/**
	 * Table category テーブルカテゴリ.<p>
	 *
	 */
	public static final String $table_ctg = "table_ctg";
	/**
	 * Table category name テーブルカテゴリ名.<p>
	 *
	 */
	public static final String $table_ctg_nm = "table_ctg_nm";
	/**
	 * Table ID テーブルＩＤ.<p>
	 *
	 */
	public static final String $table_id = "table_id";
	/**
	 * Table name テーブル名称.<p>
	 *
	 */
	public static final String $table_nm = "table_nm";


	public static final MCMeta table_ctg_META = createCommonMeta($table_ctg, mcframe.commonMA.meta.MA_META.TABLE_CTG);
	public static final MCMeta table_ctg_nm_META = createCommonMeta($table_ctg_nm, mcframe.commonMA.meta.MA_META.TABLE_CTG_NM);
	public static final MCMeta table_id_META = createCommonMeta($table_id, mcframe.commonMA.meta.MA_META.TABLE_ID);
	public static final MCMeta table_nm_META = createCommonMeta($table_nm, mcframe.commonMA.meta.MA_META.TABLE_NM);

	protected static final ConstMetaList<Srch01_CndR> constMetas = new ConstMetaList<Srch01_CndR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			table_ctg_META,
			table_ctg_nm_META,
			table_id_META,
			table_nm_META
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
	protected Srch01_CndR_MC_A(ConstMetaList<? extends Srch01_CndR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_CndR clone() {
		return (Srch01_CndR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_CndR createInstance() {
		return (Srch01_CndR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Srch01_CndR getValues(String... names) {
		return (Srch01_CndR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Table category テーブルカテゴリ.<p>
	 *
	 */
	public String table_ctg() {
		return getConstString(offset + 0, $table_ctg);
	}

	/**
	 * Table category テーブルカテゴリ.<p>
	 *
	 */
	public void table_ctg(String value) {
		setConstString(offset + 0, $table_ctg, value);
	}


	/**
	 * Table category name テーブルカテゴリ名.<p>
	 *
	 */
	public String table_ctg_nm() {
		return getConstString(offset + 1, $table_ctg_nm);
	}

	/**
	 * Table category name テーブルカテゴリ名.<p>
	 *
	 */
	public void table_ctg_nm(String value) {
		setConstString(offset + 1, $table_ctg_nm, value);
	}


	/**
	 * Table ID テーブルＩＤ.<p>
	 *
	 */
	public String table_id() {
		return getConstString(offset + 2, $table_id);
	}

	/**
	 * Table ID テーブルＩＤ.<p>
	 *
	 */
	public void table_id(String value) {
		setConstString(offset + 2, $table_id, value);
	}


	/**
	 * Table name テーブル名称.<p>
	 *
	 */
	public String table_nm() {
		return getConstString(offset + 3, $table_nm);
	}

	/**
	 * Table name テーブル名称.<p>
	 *
	 */
	public void table_nm(String value) {
		setConstString(offset + 3, $table_nm, value);
	}


	public String getString(String name) {
		if ($table_ctg.equalsIgnoreCase(name)) {
			return table_ctg();
		}
		if ($table_ctg_nm.equalsIgnoreCase(name)) {
			return table_ctg_nm();
		}
		if ($table_id.equalsIgnoreCase(name)) {
			return table_id();
		}
		if ($table_nm.equalsIgnoreCase(name)) {
			return table_nm();
		}
		return super.getString(name);
	}

	public String getStringNE(String name) {
		if ($table_ctg.equalsIgnoreCase(name)) {
			return table_ctg();
		}
		if ($table_ctg_nm.equalsIgnoreCase(name)) {
			return table_ctg_nm();
		}
		if ($table_id.equalsIgnoreCase(name)) {
			return table_id();
		}
		if ($table_nm.equalsIgnoreCase(name)) {
			return table_nm();
		}
		return super.getStringNE(name);
	}

	public void setString(String name, String value) {
		if ($table_ctg.equalsIgnoreCase(name)) {
			table_ctg(value);
			return;
		}
		if ($table_ctg_nm.equalsIgnoreCase(name)) {
			table_ctg_nm(value);
			return;
		}
		if ($table_id.equalsIgnoreCase(name)) {
			table_id(value);
			return;
		}
		if ($table_nm.equalsIgnoreCase(name)) {
			table_nm(value);
			return;
		}
		super.setString(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($table_ctg.equalsIgnoreCase(name)) {
			table_ctg(value);
			return;
		}
		if ($table_ctg_nm.equalsIgnoreCase(name)) {
			table_ctg_nm(value);
			return;
		}
		if ($table_id.equalsIgnoreCase(name)) {
			table_id(value);
			return;
		}
		if ($table_nm.equalsIgnoreCase(name)) {
			table_nm(value);
			return;
		}
		super.setStringNE(name, value);
	}



}

