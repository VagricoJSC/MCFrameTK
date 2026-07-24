package mcframe.clientMBBE.MBBEP0060;

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
 * ブロック"SqlSrc"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class SqlSrcR_MC_A extends MCConstRow {

	/**
	 * SQL_ORG ＳＱＬ＿ＯＲＧ.<p>
	 *
	 */
	public static final String $sql_src_org = "sql_src_org";
	/**
	 * SQL ＳＱＬ.<p>
	 *
	 */
	public static final String $sql_src = "sql_src";


	public static final MCMeta sql_src_org_META = createCommonMeta($sql_src_org, mcframe.commonMA.meta.MA_META.SQL_SRC);
	public static final MCMeta sql_src_META = createCommonMeta($sql_src, mcframe.commonMA.meta.MA_META.SQL_SRC);

	protected static final ConstMetaList<SqlSrcR> constMetas = new ConstMetaList<SqlSrcR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			sql_src_org_META,
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
	 * "KEYS"グループのキー項目情報です。
	 */
	protected static final MCKeyList KEYS = new MCKeyList(
		null,
		new String[]{
		}
	);

	/** 項目属性情報のグループ[LIST_OUT_BASE]のキー定数 */
	public static final String $$LIST_OUT_BASE = "LIST_OUT_BASE";
	/** 項目属性情報のグループ[LIST_IN]のキー定数 */
	public static final String $$LIST_IN = "LIST_IN";
	/** 項目属性情報のグループ[LIST_IN_BASE]のキー定数 */
	public static final String $$LIST_IN_BASE = "LIST_IN_BASE";

	/**
	 * グループ毎に定義される項目属性情報です。
	 */
	protected static final MCExtMap EXTMAP = new MCExtMap(
		null,
		new MCExtMap.Entry($$LIST_OUT_BASE, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$LIST_IN, new MCExtList(
			new String[][]{
			}
		)),
		new MCExtMap.Entry($$LIST_IN_BASE, new MCExtList(
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
	protected SqlSrcR_MC_A(ConstMetaList<? extends SqlSrcR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public SqlSrcR clone() {
		return (SqlSrcR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public SqlSrcR createInstance() {
		return (SqlSrcR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public SqlSrcR getValues(String... names) {
		return (SqlSrcR) super.getValues(names);
	}



	/**
	 * SQL_ORG ＳＱＬ＿ＯＲＧ.<p>
	 *
	 */
	public String sql_src_org() {
		return getConstString(offset + 0, $sql_src_org);
	}

	/**
	 * SQL_ORG ＳＱＬ＿ＯＲＧ.<p>
	 *
	 */
	public void sql_src_org(String value) {
		setConstString(offset + 0, $sql_src_org, value);
	}


	/**
	 * SQL ＳＱＬ.<p>
	 *
	 */
	public String sql_src() {
		return getConstString(offset + 1, $sql_src);
	}

	/**
	 * SQL ＳＱＬ.<p>
	 *
	 */
	public void sql_src(String value) {
		setConstString(offset + 1, $sql_src, value);
	}


	public String getString(String name) {
		if ($sql_src_org.equalsIgnoreCase(name)) {
			return sql_src_org();
		}
		if ($sql_src.equalsIgnoreCase(name)) {
			return sql_src();
		}
		return super.getString(name);
	}

	public String getStringNE(String name) {
		if ($sql_src_org.equalsIgnoreCase(name)) {
			return sql_src_org();
		}
		if ($sql_src.equalsIgnoreCase(name)) {
			return sql_src();
		}
		return super.getStringNE(name);
	}

	public void setString(String name, String value) {
		if ($sql_src_org.equalsIgnoreCase(name)) {
			sql_src_org(value);
			return;
		}
		if ($sql_src.equalsIgnoreCase(name)) {
			sql_src(value);
			return;
		}
		super.setString(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($sql_src_org.equalsIgnoreCase(name)) {
			sql_src_org(value);
			return;
		}
		if ($sql_src.equalsIgnoreCase(name)) {
			sql_src(value);
			return;
		}
		super.setStringNE(name, value);
	}



}

