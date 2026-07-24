package mcframe.serverMBBE.MBBEL0060;

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
 * ブロック"Ins01_Sql"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class Ins01_SqlR_MC_A extends MCConstRow {

	/**
	 * SQL ＳＱＬ.<p>
	 *
	 */
	public static final String $sql_src = "sql_src";


	public static final MCMeta sql_src_META = createCommonMeta($sql_src, mcframe.commonMA.meta.MA_META.SQL_SRC);

	protected static final ConstMetaList<Ins01_SqlR> constMetas = new ConstMetaList<Ins01_SqlR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			sql_src_META
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
	protected Ins01_SqlR_MC_A(ConstMetaList<? extends Ins01_SqlR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Ins01_SqlR clone() {
		return (Ins01_SqlR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Ins01_SqlR createInstance() {
		return (Ins01_SqlR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public Ins01_SqlR getValues(String... names) {
		return (Ins01_SqlR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * SQL ＳＱＬ.<p>
	 *
	 */
	public String sql_src() {
		return getConstString(offset + 0, $sql_src);
	}

	/**
	 * SQL ＳＱＬ.<p>
	 *
	 */
	public void sql_src(String value) {
		setConstString(offset + 0, $sql_src, value);
	}


	public String getString(String name) {
		if ($sql_src.equalsIgnoreCase(name)) {
			return sql_src();
		}
		return super.getString(name);
	}

	public String getStringNE(String name) {
		if ($sql_src.equalsIgnoreCase(name)) {
			return sql_src();
		}
		return super.getStringNE(name);
	}

	public void setString(String name, String value) {
		if ($sql_src.equalsIgnoreCase(name)) {
			sql_src(value);
			return;
		}
		super.setString(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($sql_src.equalsIgnoreCase(name)) {
			sql_src(value);
			return;
		}
		super.setStringNE(name, value);
	}



}

