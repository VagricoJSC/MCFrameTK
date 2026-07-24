package mcframe.serverMA.dbc;

import static mcframe.serverCore.queryapi.IFMCSQL.*;

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
 * "単価確認用ワークテーブル // Work table for unit price check"DBコンテナRowクラスです。<p>
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
 *  	<td>C</td>
 *  	<td>peg_no</td>
 *  	<td>N</td>
 *  	<td>9,0</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>紐付けＮＯ</td>
 *  	<td>Pegging No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>mst_nm</td>
 *  	<td>C</td>
 *  	<td>30</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>マスタ名</td>
 *  	<td>Master name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>row_id</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>ROWID</td>
 *  	<td>ROW ID</td>
 *  </tr>
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
public class MAW_UPRI_CNF_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.TEMP_TABLE_ON_COMMIT_DELETE_ROWS;

	public static final String TABLE_NAME = "MAW_UPRI_CNF";

	public static final boolean EX_CTRL = false;
	
	public static final boolean LCL_TABLE = false;
	
	/**
	 * 紐付けＮＯ. Pegging No..<p>
	 *
	 */
	public static final String $peg_no = "peg_no";
	private static final MCPermColumnInfo _peg_no = createColumnInfo("peg_no");
	public final MCNumberPermColumn peg_no = createNumberColumn(_peg_no);
	
	/**
	 * マスタ名. Master name.<p>
	 *
	 */
	public static final String $mst_nm = "mst_nm";
	private static final MCPermColumnInfo _mst_nm = createColumnInfo("mst_nm");
	public final MCStringPermColumn mst_nm = createStringColumn(_mst_nm);
	
	/**
	 * ROWID. ROW ID.<p>
	 *
	 */
	public static final String $row_id = "row_id";
	private static final MCPermColumnInfo _row_id = createColumnInfo("row_id");
	public final MCStringPermColumn row_id = createStringColumn(_row_id);
	
	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta mst_nm_META = createCommonMeta($mst_nm, mcframe.commonMA.meta.MA_META.ORA_OBJ_NM);
	public static final MCMeta row_id_META = createCommonMeta($row_id, mcframe.commonMA.meta.MA_META.ROW_ID);

	protected static final List<MCForeignInfo> FOREIGN_INFO_LIST = new ArrayList<>();
	static {
	}
	
	protected static final ConstMetaList<MAW_UPRI_CNF_R> constMetas = new ConstMetaList<MAW_UPRI_CNF_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			peg_no_META,
			mst_nm_META,
			row_id_META
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
	protected MAW_UPRI_CNF_R(ConstMetaList<? extends MAW_UPRI_CNF_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MAW_UPRI_CNF_R(ConstMetaList<? extends MAW_UPRI_CNF_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MAW_UPRI_CNF_R.$peg_no,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAW_UPRI_CNF_R.$peg_no,
				"peg_no",
				peg_no,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAW_UPRI_CNF_R.$mst_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_UPRI_CNF_R.$mst_nm,
				"mst_nm",
				mst_nm,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAW_UPRI_CNF_R.$row_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_UPRI_CNF_R.$row_id,
				"row_id",
				row_id,
				false,
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
	public static MAW_UPRI_CNF_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MAW_UPRI_CNF_R create(String alias) {
		MAW_UPRI_CNF_R row = new MAW_UPRI_CNF_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MAW_UPRI_CNF_R createByName(T proto) {
		MAW_UPRI_CNF_R row = MAW_UPRI_CNF_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAW_UPRI_CNF_R clone() {
		return (MAW_UPRI_CNF_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAW_UPRI_CNF_R createInstance() {
		return (MAW_UPRI_CNF_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAW_UPRI_CNF_R getValues(String... names) {
		return (MAW_UPRI_CNF_R) super.getValues(names);
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
	 * 紐付けＮＯ. Pegging No..<p>
	 *
	 */
	public MCNumber peg_no() {
		return getConstNumber(offset + 0, $peg_no);
	}

	/**
	 * 紐付けＮＯ. Pegging No..<p>
	 *
	 */
	public void peg_no(MCNumber value) {
		setConstNumber(offset + 0, $peg_no, value);
	}
	
	/**
	 * 紐付けＮＯ. Pegging No..<p>
	 *
	 */
	public void peg_no(int value) {
		setConstNumber(offset + 0, $peg_no, value);
	}
	
	/**
	 * 紐付けＮＯ. Pegging No..<p>
	 *
	 */
	public void peg_no(long value) {
		setConstNumber(offset + 0, $peg_no, value);
	}
	
	/**
	 * 紐付けＮＯ. Pegging No..<p>
	 *
	 */
	public void peg_no(float value) {
		setConstNumber(offset + 0, $peg_no, value);
	}
	
	/**
	 * 紐付けＮＯ. Pegging No..<p>
	 *
	 */
	public void peg_no(double value) {
		setConstNumber(offset + 0, $peg_no, value);
	}
	
	/**
	 * マスタ名. Master name.<p>
	 *
	 */
	public String mst_nm() {
		return getConstString(offset + 1, $mst_nm);
	}

	/**
	 * マスタ名. Master name.<p>
	 *
	 */
	public void mst_nm(String value) {
		setConstString(offset + 1, $mst_nm, value);
	}

	/**
	 * ROWID. ROW ID.<p>
	 *
	 */
	public String row_id() {
		return getConstString(offset + 2, $row_id);
	}

	/**
	 * ROWID. ROW ID.<p>
	 *
	 */
	public void row_id(String value) {
		setConstString(offset + 2, $row_id, value);
	}

	public String getString(String name) {
		if ($mst_nm.equalsIgnoreCase(name)) {
			return mst_nm();
		}
		if ($row_id.equalsIgnoreCase(name)) {
			return row_id();
		}
		return super.getString(name);
	}

	public MCNumber getNumber(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		return super.getNumber(name);
	}

	public String getStringNE(String name) {
		if ($mst_nm.equalsIgnoreCase(name)) {
			return mst_nm();
		}
		if ($row_id.equalsIgnoreCase(name)) {
			return row_id();
		}
		return super.getStringNE(name);
	}

	public MCNumber getNumberNE(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		return super.getNumberNE(name);
	}

	public void setString(String name, String value) {
		if ($mst_nm.equalsIgnoreCase(name)) {
			mst_nm(value);
			return;
		}
		if ($row_id.equalsIgnoreCase(name)) {
			row_id(value);
			return;
		}
		super.setString(name, value);
	}

	public void setNumber(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($mst_nm.equalsIgnoreCase(name)) {
			mst_nm(value);
			return;
		}
		if ($row_id.equalsIgnoreCase(name)) {
			row_id(value);
			return;
		}
		super.setStringNE(name, value);
	}

	public void setNumberNE(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}

}
