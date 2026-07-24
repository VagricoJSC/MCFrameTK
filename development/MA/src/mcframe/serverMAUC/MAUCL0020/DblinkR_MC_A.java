package mcframe.serverMAUC.MAUCL0020;

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
 * ブロック"Dblink"コンテナRowクラスです。<p>
 *
 * <br>
 *
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
abstract class DblinkR_MC_A extends MCConstRow {

	/**
	 * Database link info. for master reference マスタ参照用データベースリンク情報.<p>
	 *
	 */
	public static final String $db = "db";

	public static final String $dblink_nm = $db + ".dblink_nm";

	public static final MCMeta db_META = createInnerRowMeta($db, mcframe.serverMA.dbc.MAM_MST_DBLINK_R.class);

	protected static final ConstMetaList<DblinkR> constMetas = new ConstMetaList<DblinkR>(
		MCConstRow.constMetas,
		new MCMeta[]{
			db_META
		},
		new String[][]{
			{
				"dblink_nm"
			},
			{
				$dblink_nm
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
	protected DblinkR_MC_A(ConstMetaList<? extends DblinkR> metas) {
		super(metas);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DblinkR clone() {
		return (DblinkR) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DblinkR createInstance() {
		return (DblinkR) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public DblinkR getValues(String... names) {
		return (DblinkR) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}


	/**
	 * Database link info. for master reference マスタ参照用データベースリンク情報.<p>
	 *
	 */
	public mcframe.serverMA.dbc.MAM_MST_DBLINK_R db(){
		return (mcframe.serverMA.dbc.MAM_MST_DBLINK_R) getConstInnerRow(offset + 0, $db);
	}
	
	/**
	 * Database link info. for master reference マスタ参照用データベースリンク情報.<p>
	 *
	 */
	public void db(mcframe.serverMA.dbc.MAM_MST_DBLINK_R row){
		setConstInnerRow(offset + 0, $db, row);
	}






	public MCRow getInnerRow(String name) {
		if ($db.equalsIgnoreCase(name)) {
			return db();
		}
		return super.getInnerRow(name);
	}

	public void setInnerRow(String name, MCRow value) {
		if ($db.equalsIgnoreCase(name)) {
			db(
				((MCContainerMeta) db_META).castInnerRow(mcframe.serverMA.dbc.MAM_MST_DBLINK_R.class, value)
			);
			return;
		}
		super.setInnerRow(name, value);
	}


	/**
	 * Database link name データベースリンク名.<p>
	 *
	 */
	public String dblink_nm() {
		return db().dblink_nm();
	}

	/**
	 * Database link name データベースリンク名.<p>
	 *
	 */
	public void dblink_nm(String value) {
		db().dblink_nm(value);
	}

}

