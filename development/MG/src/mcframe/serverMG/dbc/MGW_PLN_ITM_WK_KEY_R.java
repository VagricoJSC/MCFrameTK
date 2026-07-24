package mcframe.serverMG.dbc;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import mcframe.commonCore.container.MCExtMap;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.lang.MCNumber;
import mcframe.serverCore.queryapi.IFMCSQL.MCNumberPermColumn;
import mcframe.commonCore.meta.MCMeta;
import mcframe.commonCore.lang.MCDataType;
import mcframe.serverCore.queryapi.MCDBContainer;
import mcframe.serverCore.queryapi.MCDBContainer.MCTableType;
import mcframe.serverCore.queryapi.IFMCSQL.MCPermColumn;
import mcframe.serverCore.queryapi.IFMCSQL.MCPermColumnInfo;
import mcframe.serverCore.queryapi.MCForeignInfo;

/**
 * "品目工数計画 // Item man-hour plan"PKワークテーブルDBコンテナRowクラスです。<p>
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
 *  	<td>pln_itm_wk_key</td>
 *  	<td>N</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>品目工数計画キー</td>
 *  	<td>Item man-hour plan key</td>
 *  </tr>
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
public class MGW_PLN_ITM_WK_KEY_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.TEMP_TABLE_ON_COMMIT_DELETE_ROWS;

	public static final String TABLE_NAME = "MGW_PLN_ITM_WK_KEY";

	public static final boolean EX_CTRL = false;
	
	public static final boolean LCL_TABLE = false;
	
	/**
	 * 品目工数計画キー. Item man-hour plan key.<p>
	 *
	 */
	public static final String $pln_itm_wk_key = "pln_itm_wk_key";
	private static final MCPermColumnInfo _pln_itm_wk_key = createColumnInfo("pln_itm_wk_key");
	public final MCNumberPermColumn pln_itm_wk_key = createNumberColumn(_pln_itm_wk_key);
	
	public static final MCMeta pln_itm_wk_key_META = createCommonMeta($pln_itm_wk_key, mcframe.commonMG.meta.MG_META.ROW_NO);

	protected static final List<MCForeignInfo> FOREIGN_INFO_LIST = new ArrayList<>();
	
	protected static final ConstMetaList<MGW_PLN_ITM_WK_KEY_R> constMetas = new ConstMetaList<MGW_PLN_ITM_WK_KEY_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			pln_itm_wk_key_META
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
	protected MGW_PLN_ITM_WK_KEY_R(ConstMetaList<? extends MGW_PLN_ITM_WK_KEY_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MGW_PLN_ITM_WK_KEY_R(ConstMetaList<? extends MGW_PLN_ITM_WK_KEY_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MGW_PLN_ITM_WK_KEY_R.$pln_itm_wk_key,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGW_PLN_ITM_WK_KEY_R.$pln_itm_wk_key,
				"pln_itm_wk_key",
				pln_itm_wk_key,
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
	public static MGW_PLN_ITM_WK_KEY_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MGW_PLN_ITM_WK_KEY_R create(String alias) {
		MGW_PLN_ITM_WK_KEY_R row = new MGW_PLN_ITM_WK_KEY_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MGW_PLN_ITM_WK_KEY_R createByName(T proto) {
		MGW_PLN_ITM_WK_KEY_R row = MGW_PLN_ITM_WK_KEY_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MGW_PLN_ITM_WK_KEY_R clone() {
		return (MGW_PLN_ITM_WK_KEY_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MGW_PLN_ITM_WK_KEY_R createInstance() {
		return (MGW_PLN_ITM_WK_KEY_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MGW_PLN_ITM_WK_KEY_R getValues(String... names) {
		return (MGW_PLN_ITM_WK_KEY_R) super.getValues(names);
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
	 * 品目工数計画キー. Item man-hour plan key.<p>
	 *
	 */
	public MCNumber pln_itm_wk_key() {
		return getConstNumber(offset + 0, $pln_itm_wk_key);
	}

	/**
	 * 品目工数計画キー. Item man-hour plan key.<p>
	 *
	 */
	public void pln_itm_wk_key(MCNumber value) {
		setConstNumber(offset + 0, $pln_itm_wk_key, value);
	}
	
	/**
	 * 品目工数計画キー. Item man-hour plan key.<p>
	 *
	 */
	public void pln_itm_wk_key(int value) {
		setConstNumber(offset + 0, $pln_itm_wk_key, value);
	}
	
	/**
	 * 品目工数計画キー. Item man-hour plan key.<p>
	 *
	 */
	public void pln_itm_wk_key(long value) {
		setConstNumber(offset + 0, $pln_itm_wk_key, value);
	}
	
	/**
	 * 品目工数計画キー. Item man-hour plan key.<p>
	 *
	 */
	public void pln_itm_wk_key(float value) {
		setConstNumber(offset + 0, $pln_itm_wk_key, value);
	}
	
	/**
	 * 品目工数計画キー. Item man-hour plan key.<p>
	 *
	 */
	public void pln_itm_wk_key(double value) {
		setConstNumber(offset + 0, $pln_itm_wk_key, value);
	}
	
	public MCNumber getNumber(String name) {
		if ($pln_itm_wk_key.equalsIgnoreCase(name)) {
			return pln_itm_wk_key();
		}
		return super.getNumber(name);
	}

	public MCNumber getNumberNE(String name) {
		if ($pln_itm_wk_key.equalsIgnoreCase(name)) {
			return pln_itm_wk_key();
		}
		return super.getNumberNE(name);
	}

	public void setNumber(String name, MCNumber value) {
		if ($pln_itm_wk_key.equalsIgnoreCase(name)) {
			pln_itm_wk_key(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, int value) {
		if ($pln_itm_wk_key.equalsIgnoreCase(name)) {
			pln_itm_wk_key(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, long value) {
		if ($pln_itm_wk_key.equalsIgnoreCase(name)) {
			pln_itm_wk_key(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, float value) {
		if ($pln_itm_wk_key.equalsIgnoreCase(name)) {
			pln_itm_wk_key(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, double value) {
		if ($pln_itm_wk_key.equalsIgnoreCase(name)) {
			pln_itm_wk_key(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumberNE(String name, MCNumber value) {
		if ($pln_itm_wk_key.equalsIgnoreCase(name)) {
			pln_itm_wk_key(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, int value) {
		if ($pln_itm_wk_key.equalsIgnoreCase(name)) {
			pln_itm_wk_key(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, long value) {
		if ($pln_itm_wk_key.equalsIgnoreCase(name)) {
			pln_itm_wk_key(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, float value) {
		if ($pln_itm_wk_key.equalsIgnoreCase(name)) {
			pln_itm_wk_key(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, double value) {
		if ($pln_itm_wk_key.equalsIgnoreCase(name)) {
			pln_itm_wk_key(value);
			return;
		}
		super.setNumberNE(name, value);
	}

}
