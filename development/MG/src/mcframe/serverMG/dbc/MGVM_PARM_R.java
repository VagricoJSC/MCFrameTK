package mcframe.serverMG.dbc;

import static mcframe.serverCore.queryapi.IFMCSQL.*;

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
 * "原価計算パラメータビュー // Cost calculation parameter view"DBコンテナRowクラスです。<p>
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
 *  	<td>parm_key</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>パラメータ</td>
 *  	<td>Parameter</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>parm_val</td>
 *  	<td>C</td>
 *  	<td>200</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>パラメータ値</td>
 *  	<td>Parameter value</td>
 *  </tr>
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
public class MGVM_PARM_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.VIEW;

	public static final String TABLE_NAME = "MGVM_PARM";

	public static final boolean EX_CTRL = false;
	
	public static final boolean LCL_TABLE = false;
	
	/**
	 * パラメータ. Parameter.<p>
	 *
	 */
	public static final String $parm_key = "parm_key";
	private static final MCPermColumnInfo _parm_key = createColumnInfo("parm_key");
	public final MCStringPermColumn parm_key = createStringColumn(_parm_key);
	
	/**
	 * パラメータ値. Parameter value.<p>
	 *
	 */
	public static final String $parm_val = "parm_val";
	private static final MCPermColumnInfo _parm_val = createColumnInfo("parm_val");
	public final MCStringPermColumn parm_val = createStringColumn(_parm_val);
	
	public static final MCMeta parm_key_META = createCommonMeta($parm_key, mcframe.commonMA.meta.MA_META.CALC_PARM_KEY);
	public static final MCMeta parm_val_META = createCommonMeta($parm_val, mcframe.commonMA.meta.MA_META.CALC_PARM_VAL);

	protected static final List<MCForeignInfo> FOREIGN_INFO_LIST = new ArrayList<>();
	static {
	}
	
	protected static final ConstMetaList<MGVM_PARM_R> constMetas = new ConstMetaList<MGVM_PARM_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			parm_key_META,
			parm_val_META
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
	protected MGVM_PARM_R(ConstMetaList<? extends MGVM_PARM_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MGVM_PARM_R(ConstMetaList<? extends MGVM_PARM_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MGVM_PARM_R.$parm_key,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVM_PARM_R.$parm_key,
				"parm_key",
				parm_key,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVM_PARM_R.$parm_val,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVM_PARM_R.$parm_val,
				"parm_val",
				parm_val,
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
	public static MGVM_PARM_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MGVM_PARM_R create(String alias) {
		MGVM_PARM_R row = new MGVM_PARM_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MGVM_PARM_R createByName(T proto) {
		MGVM_PARM_R row = MGVM_PARM_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MGVM_PARM_R clone() {
		return (MGVM_PARM_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MGVM_PARM_R createInstance() {
		return (MGVM_PARM_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MGVM_PARM_R getValues(String... names) {
		return (MGVM_PARM_R) super.getValues(names);
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
	 * パラメータ. Parameter.<p>
	 *
	 */
	public String parm_key() {
		return getConstString(offset + 0, $parm_key);
	}

	/**
	 * パラメータ. Parameter.<p>
	 *
	 */
	public void parm_key(String value) {
		setConstString(offset + 0, $parm_key, value);
	}

	/**
	 * パラメータ値. Parameter value.<p>
	 *
	 */
	public String parm_val() {
		return getConstString(offset + 1, $parm_val);
	}

	/**
	 * パラメータ値. Parameter value.<p>
	 *
	 */
	public void parm_val(String value) {
		setConstString(offset + 1, $parm_val, value);
	}

	public String getString(String name) {
		if ($parm_key.equalsIgnoreCase(name)) {
			return parm_key();
		}
		if ($parm_val.equalsIgnoreCase(name)) {
			return parm_val();
		}
		return super.getString(name);
	}

	public String getStringNE(String name) {
		if ($parm_key.equalsIgnoreCase(name)) {
			return parm_key();
		}
		if ($parm_val.equalsIgnoreCase(name)) {
			return parm_val();
		}
		return super.getStringNE(name);
	}

	public void setString(String name, String value) {
		if ($parm_key.equalsIgnoreCase(name)) {
			parm_key(value);
			return;
		}
		if ($parm_val.equalsIgnoreCase(name)) {
			parm_val(value);
			return;
		}
		super.setString(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($parm_key.equalsIgnoreCase(name)) {
			parm_key(value);
			return;
		}
		if ($parm_val.equalsIgnoreCase(name)) {
			parm_val(value);
			return;
		}
		super.setStringNE(name, value);
	}

}
