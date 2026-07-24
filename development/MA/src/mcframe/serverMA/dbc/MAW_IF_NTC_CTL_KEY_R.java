package mcframe.serverMA.dbc;

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
 * "ＩＦ通知制御マスタ // IF notification control master"PKワークテーブルDBコンテナRowクラスです。<p>
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
 *  	<td>module_id</td>
 *  	<td>C</td>
 *  	<td>3</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>モジュールＩＤ</td>
 *  	<td>Module ID</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>logic_id</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>ロジックＩＤ</td>
 *  	<td>Logic ID</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>K</td>
 *  	<td>wg_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>ワーキンググループＣＤ</td>
 *  	<td>WG cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>bp_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>取引先ＣＤ</td>
 *  	<td>BP cd.</td>
 *  </tr>
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
public class MAW_IF_NTC_CTL_KEY_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.TEMP_TABLE_ON_COMMIT_DELETE_ROWS;

	public static final String TABLE_NAME = "MAW_IF_NTC_CTL_KEY";

	public static final boolean EX_CTRL = false;
	
	public static final boolean LCL_TABLE = false;
	
	/**
	 * モジュールＩＤ. Module ID.<p>
	 *
	 */
	public static final String $module_id = "module_id";
	private static final MCPermColumnInfo _module_id = createColumnInfo("module_id");
	public final MCStringPermColumn module_id = createStringColumn(_module_id);
	
	/**
	 * ロジックＩＤ. Logic ID.<p>
	 *
	 */
	public static final String $logic_id = "logic_id";
	private static final MCPermColumnInfo _logic_id = createColumnInfo("logic_id");
	public final MCStringPermColumn logic_id = createStringColumn(_logic_id);
	
	/**
	 * ワーキンググループＣＤ. WG cd..<p>
	 *
	 */
	public static final String $wg_cd = "wg_cd";
	private static final MCPermColumnInfo _wg_cd = createColumnInfo("wg_cd");
	public final MCStringPermColumn wg_cd = createStringColumn(_wg_cd);
	
	/**
	 * 取引先ＣＤ. BP cd..<p>
	 *
	 */
	public static final String $bp_cd = "bp_cd";
	private static final MCPermColumnInfo _bp_cd = createColumnInfo("bp_cd");
	public final MCStringPermColumn bp_cd = createStringColumn(_bp_cd);
	
	public static final MCMeta module_id_META = createCommonMeta($module_id, mcframe.commonMA.meta.MA_META.MODULE_ID);
	public static final MCMeta logic_id_META = createCommonMeta($logic_id, mcframe.commonMA.meta.MA_META.LOGIC_ID);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta bp_cd_META = createCommonMeta($bp_cd, mcframe.commonMA.meta.MA_META.BP_CD);

	protected static final List<MCForeignInfo> FOREIGN_INFO_LIST = new ArrayList<>();
	
	protected static final ConstMetaList<MAW_IF_NTC_CTL_KEY_R> constMetas = new ConstMetaList<MAW_IF_NTC_CTL_KEY_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			module_id_META,
			logic_id_META,
			wg_cd_META,
			bp_cd_META
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
	protected MAW_IF_NTC_CTL_KEY_R(ConstMetaList<? extends MAW_IF_NTC_CTL_KEY_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MAW_IF_NTC_CTL_KEY_R(ConstMetaList<? extends MAW_IF_NTC_CTL_KEY_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MAW_IF_NTC_CTL_KEY_R.$module_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_IF_NTC_CTL_KEY_R.$module_id,
				"module_id",
				module_id,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAW_IF_NTC_CTL_KEY_R.$logic_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_IF_NTC_CTL_KEY_R.$logic_id,
				"logic_id",
				logic_id,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAW_IF_NTC_CTL_KEY_R.$wg_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_IF_NTC_CTL_KEY_R.$wg_cd,
				"wg_cd",
				wg_cd,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAW_IF_NTC_CTL_KEY_R.$bp_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_IF_NTC_CTL_KEY_R.$bp_cd,
				"bp_cd",
				bp_cd,
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
	public static MAW_IF_NTC_CTL_KEY_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MAW_IF_NTC_CTL_KEY_R create(String alias) {
		MAW_IF_NTC_CTL_KEY_R row = new MAW_IF_NTC_CTL_KEY_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MAW_IF_NTC_CTL_KEY_R createByName(T proto) {
		MAW_IF_NTC_CTL_KEY_R row = MAW_IF_NTC_CTL_KEY_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAW_IF_NTC_CTL_KEY_R clone() {
		return (MAW_IF_NTC_CTL_KEY_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAW_IF_NTC_CTL_KEY_R createInstance() {
		return (MAW_IF_NTC_CTL_KEY_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAW_IF_NTC_CTL_KEY_R getValues(String... names) {
		return (MAW_IF_NTC_CTL_KEY_R) super.getValues(names);
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
	 * モジュールＩＤ. Module ID.<p>
	 *
	 */
	public String module_id() {
		return getConstString(offset + 0, $module_id);
	}

	/**
	 * モジュールＩＤ. Module ID.<p>
	 *
	 */
	public void module_id(String value) {
		setConstString(offset + 0, $module_id, value);
	}

	/**
	 * ロジックＩＤ. Logic ID.<p>
	 *
	 */
	public String logic_id() {
		return getConstString(offset + 1, $logic_id);
	}

	/**
	 * ロジックＩＤ. Logic ID.<p>
	 *
	 */
	public void logic_id(String value) {
		setConstString(offset + 1, $logic_id, value);
	}

	/**
	 * ワーキンググループＣＤ. WG cd..<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 2, $wg_cd);
	}

	/**
	 * ワーキンググループＣＤ. WG cd..<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 2, $wg_cd, value);
	}

	/**
	 * 取引先ＣＤ. BP cd..<p>
	 *
	 */
	public String bp_cd() {
		return getConstString(offset + 3, $bp_cd);
	}

	/**
	 * 取引先ＣＤ. BP cd..<p>
	 *
	 */
	public void bp_cd(String value) {
		setConstString(offset + 3, $bp_cd, value);
	}

	public String getString(String name) {
		if ($module_id.equalsIgnoreCase(name)) {
			return module_id();
		}
		if ($logic_id.equalsIgnoreCase(name)) {
			return logic_id();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($bp_cd.equalsIgnoreCase(name)) {
			return bp_cd();
		}
		return super.getString(name);
	}

	public String getStringNE(String name) {
		if ($module_id.equalsIgnoreCase(name)) {
			return module_id();
		}
		if ($logic_id.equalsIgnoreCase(name)) {
			return logic_id();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($bp_cd.equalsIgnoreCase(name)) {
			return bp_cd();
		}
		return super.getStringNE(name);
	}

	public void setString(String name, String value) {
		if ($module_id.equalsIgnoreCase(name)) {
			module_id(value);
			return;
		}
		if ($logic_id.equalsIgnoreCase(name)) {
			logic_id(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($bp_cd.equalsIgnoreCase(name)) {
			bp_cd(value);
			return;
		}
		super.setString(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($module_id.equalsIgnoreCase(name)) {
			module_id(value);
			return;
		}
		if ($logic_id.equalsIgnoreCase(name)) {
			logic_id(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($bp_cd.equalsIgnoreCase(name)) {
			bp_cd(value);
			return;
		}
		super.setStringNE(name, value);
	}

}
