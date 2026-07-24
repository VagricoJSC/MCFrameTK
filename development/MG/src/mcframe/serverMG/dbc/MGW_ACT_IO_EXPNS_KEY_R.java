package mcframe.serverMG.dbc;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import mcframe.commonCore.container.MCExtMap;
import mcframe.commonCore.container.MCRow;
import mcframe.serverCore.queryapi.IFMCSQL.MCStringPermColumn;
import mcframe.commonCore.meta.MCMeta;
import mcframe.commonCore.lang.MCDataType;
import mcframe.serverCore.queryapi.MCDBContainer;
import mcframe.serverCore.queryapi.MCDBContainer.MCTableType;
import mcframe.serverCore.queryapi.IFMCSQL.MCPermColumn;
import mcframe.serverCore.queryapi.IFMCSQL.MCPermColumnInfo;
import mcframe.serverCore.queryapi.MCForeignInfo;

/**
 * "入出庫実績費目別原価 // Cost by GR/GI result cost element"PKワークテーブルDBコンテナRowクラスです。<p>
 *
 * <br>
 *
 * <table border=1 cellspacing=0 cellpadding=2 >
 *  <caption>[項目定義]</caption>
 * 	<tr bgcolor="#cccccc">
 *  	<th>区分</th>
 *  	<th>項目名</th>
 *  	<th>型</th>
 *  	<th>桁</th>
 *  	<th>Null</th>
 *  	<th>別名/参照先</th>
 *  	<th>日本語</th>
 *  	<th>フルネーム</th>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>K</td>
 *  	<td>act_io_id</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>入出庫実績ＩＤ</td>
 *  	<td>GR/GI result ID</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>act_io_id_sub</td>
 *  	<td>C</td>
 *  	<td>3</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>入出庫実績ＩＤ枝番</td>
 *  	<td>GR/GI result ID branch No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>K</td>
 *  	<td>expns_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>費目ＣＤ</td>
 *  	<td>Cost element cd.</td>
 *  </tr>
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
public class MGW_ACT_IO_EXPNS_KEY_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.TEMP_TABLE_ON_COMMIT_DELETE_ROWS;

	public static final String TABLE_NAME = "MGW_ACT_IO_EXPNS_KEY";

	public static final boolean EX_CTRL = false;
	
	public static final boolean LCL_TABLE = false;
	
	/**
	 * 入出庫実績ＩＤ. GR/GI result ID.<p>
	 *
	 */
	public static final String $act_io_id = "act_io_id";
	private static final MCPermColumnInfo _act_io_id = createColumnInfo("act_io_id");
	public final MCStringPermColumn act_io_id = createStringColumn(_act_io_id);
	
	/**
	 * 入出庫実績ＩＤ枝番. GR/GI result ID branch No..<p>
	 *
	 */
	public static final String $act_io_id_sub = "act_io_id_sub";
	private static final MCPermColumnInfo _act_io_id_sub = createColumnInfo("act_io_id_sub");
	public final MCStringPermColumn act_io_id_sub = createStringColumn(_act_io_id_sub);
	
	/**
	 * 費目ＣＤ. Cost element cd..<p>
	 *
	 */
	public static final String $expns_cd = "expns_cd";
	private static final MCPermColumnInfo _expns_cd = createColumnInfo("expns_cd");
	public final MCStringPermColumn expns_cd = createStringColumn(_expns_cd);
	
	public static final MCMeta act_io_id_META = createCommonMeta($act_io_id, mcframe.commonMG.meta.MG_META.ACT_IO_ID);
	public static final MCMeta act_io_id_sub_META = createCommonMeta($act_io_id_sub, mcframe.commonMG.meta.MG_META.ACT_IO_ID_SUB);
	public static final MCMeta expns_cd_META = createCommonMeta($expns_cd, mcframe.commonMA.meta.MA_META.EXPNS_CD);

	protected static final List<MCForeignInfo> FOREIGN_INFO_LIST = new ArrayList<>();
	
	protected static final ConstMetaList<MGW_ACT_IO_EXPNS_KEY_R> constMetas = new ConstMetaList<MGW_ACT_IO_EXPNS_KEY_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			act_io_id_META,
			act_io_id_sub_META,
			expns_cd_META
		},
		new String[][]{
			{
			},
			{
			}
		}
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
	 * コンストラクタです。
	 */
	protected MGW_ACT_IO_EXPNS_KEY_R(ConstMetaList<? extends MGW_ACT_IO_EXPNS_KEY_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MGW_ACT_IO_EXPNS_KEY_R(ConstMetaList<? extends MGW_ACT_IO_EXPNS_KEY_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MGW_ACT_IO_EXPNS_KEY_R.$act_io_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGW_ACT_IO_EXPNS_KEY_R.$act_io_id,
				"act_io_id",
				act_io_id,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGW_ACT_IO_EXPNS_KEY_R.$act_io_id_sub,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGW_ACT_IO_EXPNS_KEY_R.$act_io_id_sub,
				"act_io_id_sub",
				act_io_id_sub,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGW_ACT_IO_EXPNS_KEY_R.$expns_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGW_ACT_IO_EXPNS_KEY_R.$expns_cd,
				"expns_cd",
				expns_cd,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		return COLUMN_MAP;
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MGW_ACT_IO_EXPNS_KEY_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MGW_ACT_IO_EXPNS_KEY_R create(String alias) {
		MGW_ACT_IO_EXPNS_KEY_R row = new MGW_ACT_IO_EXPNS_KEY_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MGW_ACT_IO_EXPNS_KEY_R createByName(T proto) {
		MGW_ACT_IO_EXPNS_KEY_R row = MGW_ACT_IO_EXPNS_KEY_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MGW_ACT_IO_EXPNS_KEY_R clone() {
		return (MGW_ACT_IO_EXPNS_KEY_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MGW_ACT_IO_EXPNS_KEY_R createInstance() {
		return (MGW_ACT_IO_EXPNS_KEY_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MGW_ACT_IO_EXPNS_KEY_R getValues(String... names) {
		return (MGW_ACT_IO_EXPNS_KEY_R) super.getValues(names);
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	protected void fireValueChanged(String column,
							Comparable<?> newvalue, Comparable<?> oldvalue) {
	}

	/*
	 * MCDBContainerのオーバーライドメソッドです。
	 */
	public boolean hasCocdFilter() {
		return false;
	}

	/*
	 * MCDBContainerのオーバーライドメソッドです。
	 */
	public boolean hasLclFilter() {
		return false;
	}

	/*
	 * MCDBContainerのオーバーライドメソッドです。
	 */
	 public MCDBContainer getPkWorkDbc(String alias) {
	 	return null;
	 }

	/*
	 * MCDBContainerのオーバーライドメソッドです。
	 */
	 public MCDBContainer getPkWorkDbc() {
	 	return null;
	 }

	/**
	 * 入出庫実績ＩＤ. GR/GI result ID.<p>
	 *
	 */
	public String act_io_id() {
		return getConstString(offset + 0, $act_io_id);
	}

	/**
	 * 入出庫実績ＩＤ. GR/GI result ID.<p>
	 *
	 */
	public void act_io_id(String value) {
		setConstString(offset + 0, $act_io_id, value);
	}

	/**
	 * 入出庫実績ＩＤ枝番. GR/GI result ID branch No..<p>
	 *
	 */
	public String act_io_id_sub() {
		return getConstString(offset + 1, $act_io_id_sub);
	}

	/**
	 * 入出庫実績ＩＤ枝番. GR/GI result ID branch No..<p>
	 *
	 */
	public void act_io_id_sub(String value) {
		setConstString(offset + 1, $act_io_id_sub, value);
	}

	/**
	 * 費目ＣＤ. Cost element cd..<p>
	 *
	 */
	public String expns_cd() {
		return getConstString(offset + 2, $expns_cd);
	}

	/**
	 * 費目ＣＤ. Cost element cd..<p>
	 *
	 */
	public void expns_cd(String value) {
		setConstString(offset + 2, $expns_cd, value);
	}

	public String getString(String name) {
		if ($act_io_id.equalsIgnoreCase(name)) {
			return act_io_id();
		}
		if ($act_io_id_sub.equalsIgnoreCase(name)) {
			return act_io_id_sub();
		}
		if ($expns_cd.equalsIgnoreCase(name)) {
			return expns_cd();
		}
		return super.getString(name);
	}

	public String getStringNE(String name) {
		if ($act_io_id.equalsIgnoreCase(name)) {
			return act_io_id();
		}
		if ($act_io_id_sub.equalsIgnoreCase(name)) {
			return act_io_id_sub();
		}
		if ($expns_cd.equalsIgnoreCase(name)) {
			return expns_cd();
		}
		return super.getStringNE(name);
	}

	public void setString(String name, String value) {
		if ($act_io_id.equalsIgnoreCase(name)) {
			act_io_id(value);
			return;
		}
		if ($act_io_id_sub.equalsIgnoreCase(name)) {
			act_io_id_sub(value);
			return;
		}
		if ($expns_cd.equalsIgnoreCase(name)) {
			expns_cd(value);
			return;
		}
		super.setString(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($act_io_id.equalsIgnoreCase(name)) {
			act_io_id(value);
			return;
		}
		if ($act_io_id_sub.equalsIgnoreCase(name)) {
			act_io_id_sub(value);
			return;
		}
		if ($expns_cd.equalsIgnoreCase(name)) {
			expns_cd(value);
			return;
		}
		super.setStringNE(name, value);
	}

}
