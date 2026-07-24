package mcframe.serverMA.dbc;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import mcframe.commonCore.container.MCExtMap;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.lang.MCNumber;
import mcframe.serverCore.queryapi.IFMCSQL.MCStringPermColumn;
import mcframe.serverCore.queryapi.IFMCSQL.MCNumberPermColumn;
import mcframe.commonCore.meta.MCMeta;
import mcframe.commonCore.lang.MCDataType;
import mcframe.serverCore.queryapi.MCDBContainer;
import mcframe.serverCore.queryapi.MCDBContainer.MCTableType;
import mcframe.serverCore.queryapi.IFMCSQL.MCPermColumn;
import mcframe.serverCore.queryapi.IFMCSQL.MCPermColumnInfo;
import mcframe.serverCore.queryapi.MCForeignInfo;

/**
 * "原価個別受払表項目マスタ // Custom T account column master"PKワークテーブルDBコンテナRowクラスです。<p>
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
 *  	<td>cost_io_id</td>
 *  	<td>N</td>
 *  	<td>2,0</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>受払表ＩＤ</td>
 *  	<td>GR/GI list ID</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>io_col_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>受払項目ＣＤ</td>
 *  	<td>GR/GI column cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>K</td>
 *  	<td>ac_slip_typ</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>会計伝票区分</td>
 *  	<td>Accounting slip type</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>ac_rsn_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>会計理由ＣＤ</td>
 *  	<td>Accounting reason cd.</td>
 *  </tr>
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
public class MAW_COST_IO_COL_KEY_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.TEMP_TABLE_ON_COMMIT_DELETE_ROWS;

	public static final String TABLE_NAME = "MAW_COST_IO_COL_KEY";

	public static final boolean EX_CTRL = false;
	
	public static final boolean LCL_TABLE = false;
	
	/**
	 * 受払表ＩＤ. GR/GI list ID.<p>
	 *
	 */
	public static final String $cost_io_id = "cost_io_id";
	private static final MCPermColumnInfo _cost_io_id = createColumnInfo("cost_io_id");
	public final MCNumberPermColumn cost_io_id = createNumberColumn(_cost_io_id);
	
	/**
	 * 受払項目ＣＤ. GR/GI column cd..<p>
	 *
	 */
	public static final String $io_col_cd = "io_col_cd";
	private static final MCPermColumnInfo _io_col_cd = createColumnInfo("io_col_cd");
	public final MCStringPermColumn io_col_cd = createStringColumn(_io_col_cd);
	
	/**
	 * 会計伝票区分. Accounting slip type.<p>
	 *
	 */
	public static final String $ac_slip_typ = "ac_slip_typ";
	private static final MCPermColumnInfo _ac_slip_typ = createColumnInfo("ac_slip_typ");
	public final MCStringPermColumn ac_slip_typ = createStringColumn(_ac_slip_typ);
	
	/**
	 * 会計理由ＣＤ. Accounting reason cd..<p>
	 *
	 */
	public static final String $ac_rsn_cd = "ac_rsn_cd";
	private static final MCPermColumnInfo _ac_rsn_cd = createColumnInfo("ac_rsn_cd");
	public final MCStringPermColumn ac_rsn_cd = createStringColumn(_ac_rsn_cd);
	
	public static final MCMeta cost_io_id_META = createCommonMeta($cost_io_id, mcframe.commonMA.meta.MA_META.COST_IO_ID);
	public static final MCMeta io_col_cd_META = createCommonMeta($io_col_cd, mcframe.commonMA.meta.MA_META.IO_COL_CD);
	public static final MCMeta ac_slip_typ_META = createCommonMeta($ac_slip_typ, mcframe.commonMA.meta.MA_META.AC_SLIP_TYP);
	public static final MCMeta ac_rsn_cd_META = createCommonMeta($ac_rsn_cd, mcframe.commonMA.meta.MA_META.AC_RSN_CD);

	protected static final List<MCForeignInfo> FOREIGN_INFO_LIST = new ArrayList<>();
	
	protected static final ConstMetaList<MAW_COST_IO_COL_KEY_R> constMetas = new ConstMetaList<MAW_COST_IO_COL_KEY_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			cost_io_id_META,
			io_col_cd_META,
			ac_slip_typ_META,
			ac_rsn_cd_META
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
	protected MAW_COST_IO_COL_KEY_R(ConstMetaList<? extends MAW_COST_IO_COL_KEY_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MAW_COST_IO_COL_KEY_R(ConstMetaList<? extends MAW_COST_IO_COL_KEY_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MAW_COST_IO_COL_KEY_R.$cost_io_id,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAW_COST_IO_COL_KEY_R.$cost_io_id,
				"cost_io_id",
				cost_io_id,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAW_COST_IO_COL_KEY_R.$io_col_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_COST_IO_COL_KEY_R.$io_col_cd,
				"io_col_cd",
				io_col_cd,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAW_COST_IO_COL_KEY_R.$ac_slip_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_COST_IO_COL_KEY_R.$ac_slip_typ,
				"ac_slip_typ",
				ac_slip_typ,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAW_COST_IO_COL_KEY_R.$ac_rsn_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_COST_IO_COL_KEY_R.$ac_rsn_cd,
				"ac_rsn_cd",
				ac_rsn_cd,
				true,
				true,
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
	public static MAW_COST_IO_COL_KEY_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MAW_COST_IO_COL_KEY_R create(String alias) {
		MAW_COST_IO_COL_KEY_R row = new MAW_COST_IO_COL_KEY_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MAW_COST_IO_COL_KEY_R createByName(T proto) {
		MAW_COST_IO_COL_KEY_R row = MAW_COST_IO_COL_KEY_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAW_COST_IO_COL_KEY_R clone() {
		return (MAW_COST_IO_COL_KEY_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAW_COST_IO_COL_KEY_R createInstance() {
		return (MAW_COST_IO_COL_KEY_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAW_COST_IO_COL_KEY_R getValues(String... names) {
		return (MAW_COST_IO_COL_KEY_R) super.getValues(names);
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
	 * 受払表ＩＤ. GR/GI list ID.<p>
	 *
	 */
	public MCNumber cost_io_id() {
		return getConstNumber(offset + 0, $cost_io_id);
	}

	/**
	 * 受払表ＩＤ. GR/GI list ID.<p>
	 *
	 */
	public void cost_io_id(MCNumber value) {
		setConstNumber(offset + 0, $cost_io_id, value);
	}
	
	/**
	 * 受払表ＩＤ. GR/GI list ID.<p>
	 *
	 */
	public void cost_io_id(int value) {
		setConstNumber(offset + 0, $cost_io_id, value);
	}
	
	/**
	 * 受払表ＩＤ. GR/GI list ID.<p>
	 *
	 */
	public void cost_io_id(long value) {
		setConstNumber(offset + 0, $cost_io_id, value);
	}
	
	/**
	 * 受払表ＩＤ. GR/GI list ID.<p>
	 *
	 */
	public void cost_io_id(float value) {
		setConstNumber(offset + 0, $cost_io_id, value);
	}
	
	/**
	 * 受払表ＩＤ. GR/GI list ID.<p>
	 *
	 */
	public void cost_io_id(double value) {
		setConstNumber(offset + 0, $cost_io_id, value);
	}
	
	/**
	 * 受払項目ＣＤ. GR/GI column cd..<p>
	 *
	 */
	public String io_col_cd() {
		return getConstString(offset + 1, $io_col_cd);
	}

	/**
	 * 受払項目ＣＤ. GR/GI column cd..<p>
	 *
	 */
	public void io_col_cd(String value) {
		setConstString(offset + 1, $io_col_cd, value);
	}

	/**
	 * 会計伝票区分. Accounting slip type.<p>
	 *
	 */
	public String ac_slip_typ() {
		return getConstString(offset + 2, $ac_slip_typ);
	}

	/**
	 * 会計伝票区分. Accounting slip type.<p>
	 *
	 */
	public void ac_slip_typ(String value) {
		setConstString(offset + 2, $ac_slip_typ, value);
	}

	/**
	 * 会計理由ＣＤ. Accounting reason cd..<p>
	 *
	 */
	public String ac_rsn_cd() {
		return getConstString(offset + 3, $ac_rsn_cd);
	}

	/**
	 * 会計理由ＣＤ. Accounting reason cd..<p>
	 *
	 */
	public void ac_rsn_cd(String value) {
		setConstString(offset + 3, $ac_rsn_cd, value);
	}

	public String getString(String name) {
		if ($io_col_cd.equalsIgnoreCase(name)) {
			return io_col_cd();
		}
		if ($ac_slip_typ.equalsIgnoreCase(name)) {
			return ac_slip_typ();
		}
		if ($ac_rsn_cd.equalsIgnoreCase(name)) {
			return ac_rsn_cd();
		}
		return super.getString(name);
	}

	public MCNumber getNumber(String name) {
		if ($cost_io_id.equalsIgnoreCase(name)) {
			return cost_io_id();
		}
		return super.getNumber(name);
	}

	public String getStringNE(String name) {
		if ($io_col_cd.equalsIgnoreCase(name)) {
			return io_col_cd();
		}
		if ($ac_slip_typ.equalsIgnoreCase(name)) {
			return ac_slip_typ();
		}
		if ($ac_rsn_cd.equalsIgnoreCase(name)) {
			return ac_rsn_cd();
		}
		return super.getStringNE(name);
	}

	public MCNumber getNumberNE(String name) {
		if ($cost_io_id.equalsIgnoreCase(name)) {
			return cost_io_id();
		}
		return super.getNumberNE(name);
	}

	public void setString(String name, String value) {
		if ($io_col_cd.equalsIgnoreCase(name)) {
			io_col_cd(value);
			return;
		}
		if ($ac_slip_typ.equalsIgnoreCase(name)) {
			ac_slip_typ(value);
			return;
		}
		if ($ac_rsn_cd.equalsIgnoreCase(name)) {
			ac_rsn_cd(value);
			return;
		}
		super.setString(name, value);
	}

	public void setNumber(String name, MCNumber value) {
		if ($cost_io_id.equalsIgnoreCase(name)) {
			cost_io_id(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, int value) {
		if ($cost_io_id.equalsIgnoreCase(name)) {
			cost_io_id(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, long value) {
		if ($cost_io_id.equalsIgnoreCase(name)) {
			cost_io_id(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, float value) {
		if ($cost_io_id.equalsIgnoreCase(name)) {
			cost_io_id(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, double value) {
		if ($cost_io_id.equalsIgnoreCase(name)) {
			cost_io_id(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($io_col_cd.equalsIgnoreCase(name)) {
			io_col_cd(value);
			return;
		}
		if ($ac_slip_typ.equalsIgnoreCase(name)) {
			ac_slip_typ(value);
			return;
		}
		if ($ac_rsn_cd.equalsIgnoreCase(name)) {
			ac_rsn_cd(value);
			return;
		}
		super.setStringNE(name, value);
	}

	public void setNumberNE(String name, MCNumber value) {
		if ($cost_io_id.equalsIgnoreCase(name)) {
			cost_io_id(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, int value) {
		if ($cost_io_id.equalsIgnoreCase(name)) {
			cost_io_id(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, long value) {
		if ($cost_io_id.equalsIgnoreCase(name)) {
			cost_io_id(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, float value) {
		if ($cost_io_id.equalsIgnoreCase(name)) {
			cost_io_id(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, double value) {
		if ($cost_io_id.equalsIgnoreCase(name)) {
			cost_io_id(value);
			return;
		}
		super.setNumberNE(name, value);
	}

}
