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
 * "支払依頼科目マスタ // Payment request account master"PKワークテーブルDBコンテナRowクラスです。<p>
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
 *  	<td>pay_ap_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>支払債務区分</td>
 *  	<td>Payment obligation type</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>seq</td>
 *  	<td>N</td>
 *  	<td>4,0</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>連番</td>
 *  	<td>Sequence number</td>
 *  </tr>
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
public class MAW_SCHD_PAY_KEY_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.TEMP_TABLE_ON_COMMIT_DELETE_ROWS;

	public static final String TABLE_NAME = "MAW_SCHD_PAY_KEY";

	public static final boolean EX_CTRL = false;
	
	public static final boolean LCL_TABLE = false;
	
	/**
	 * 支払債務区分. Payment obligation type.<p>
	 *
	 */
	public static final String $pay_ap_typ = "pay_ap_typ";
	private static final MCPermColumnInfo _pay_ap_typ = createColumnInfo("pay_ap_typ");
	public final MCStringPermColumn pay_ap_typ = createStringColumn(_pay_ap_typ);
	
	/**
	 * 連番. Sequence number.<p>
	 *
	 */
	public static final String $seq = "seq";
	private static final MCPermColumnInfo _seq = createColumnInfo("seq");
	public final MCNumberPermColumn seq = createNumberColumn(_seq);
	
	public static final MCMeta pay_ap_typ_META = createCommonMeta($pay_ap_typ, mcframe.commonMA.meta.MA_META.PAY_AP_TYP);
	public static final MCMeta seq_META = createCommonMeta($seq, mcframe.commonMA.meta.MA_META.INT4);

	protected static final List<MCForeignInfo> FOREIGN_INFO_LIST = new ArrayList<>();
	
	protected static final ConstMetaList<MAW_SCHD_PAY_KEY_R> constMetas = new ConstMetaList<MAW_SCHD_PAY_KEY_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			pay_ap_typ_META,
			seq_META
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
	protected MAW_SCHD_PAY_KEY_R(ConstMetaList<? extends MAW_SCHD_PAY_KEY_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MAW_SCHD_PAY_KEY_R(ConstMetaList<? extends MAW_SCHD_PAY_KEY_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MAW_SCHD_PAY_KEY_R.$pay_ap_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_SCHD_PAY_KEY_R.$pay_ap_typ,
				"pay_ap_typ",
				pay_ap_typ,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAW_SCHD_PAY_KEY_R.$seq,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAW_SCHD_PAY_KEY_R.$seq,
				"seq",
				seq,
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
	public static MAW_SCHD_PAY_KEY_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MAW_SCHD_PAY_KEY_R create(String alias) {
		MAW_SCHD_PAY_KEY_R row = new MAW_SCHD_PAY_KEY_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MAW_SCHD_PAY_KEY_R createByName(T proto) {
		MAW_SCHD_PAY_KEY_R row = MAW_SCHD_PAY_KEY_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAW_SCHD_PAY_KEY_R clone() {
		return (MAW_SCHD_PAY_KEY_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAW_SCHD_PAY_KEY_R createInstance() {
		return (MAW_SCHD_PAY_KEY_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAW_SCHD_PAY_KEY_R getValues(String... names) {
		return (MAW_SCHD_PAY_KEY_R) super.getValues(names);
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
	 * 支払債務区分. Payment obligation type.<p>
	 *
	 */
	public String pay_ap_typ() {
		return getConstString(offset + 0, $pay_ap_typ);
	}

	/**
	 * 支払債務区分. Payment obligation type.<p>
	 *
	 */
	public void pay_ap_typ(String value) {
		setConstString(offset + 0, $pay_ap_typ, value);
	}

	/**
	 * 連番. Sequence number.<p>
	 *
	 */
	public MCNumber seq() {
		return getConstNumber(offset + 1, $seq);
	}

	/**
	 * 連番. Sequence number.<p>
	 *
	 */
	public void seq(MCNumber value) {
		setConstNumber(offset + 1, $seq, value);
	}
	
	/**
	 * 連番. Sequence number.<p>
	 *
	 */
	public void seq(int value) {
		setConstNumber(offset + 1, $seq, value);
	}
	
	/**
	 * 連番. Sequence number.<p>
	 *
	 */
	public void seq(long value) {
		setConstNumber(offset + 1, $seq, value);
	}
	
	/**
	 * 連番. Sequence number.<p>
	 *
	 */
	public void seq(float value) {
		setConstNumber(offset + 1, $seq, value);
	}
	
	/**
	 * 連番. Sequence number.<p>
	 *
	 */
	public void seq(double value) {
		setConstNumber(offset + 1, $seq, value);
	}
	
	public String getString(String name) {
		if ($pay_ap_typ.equalsIgnoreCase(name)) {
			return pay_ap_typ();
		}
		return super.getString(name);
	}

	public MCNumber getNumber(String name) {
		if ($seq.equalsIgnoreCase(name)) {
			return seq();
		}
		return super.getNumber(name);
	}

	public String getStringNE(String name) {
		if ($pay_ap_typ.equalsIgnoreCase(name)) {
			return pay_ap_typ();
		}
		return super.getStringNE(name);
	}

	public MCNumber getNumberNE(String name) {
		if ($seq.equalsIgnoreCase(name)) {
			return seq();
		}
		return super.getNumberNE(name);
	}

	public void setString(String name, String value) {
		if ($pay_ap_typ.equalsIgnoreCase(name)) {
			pay_ap_typ(value);
			return;
		}
		super.setString(name, value);
	}

	public void setNumber(String name, MCNumber value) {
		if ($seq.equalsIgnoreCase(name)) {
			seq(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, int value) {
		if ($seq.equalsIgnoreCase(name)) {
			seq(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, long value) {
		if ($seq.equalsIgnoreCase(name)) {
			seq(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, float value) {
		if ($seq.equalsIgnoreCase(name)) {
			seq(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, double value) {
		if ($seq.equalsIgnoreCase(name)) {
			seq(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($pay_ap_typ.equalsIgnoreCase(name)) {
			pay_ap_typ(value);
			return;
		}
		super.setStringNE(name, value);
	}

	public void setNumberNE(String name, MCNumber value) {
		if ($seq.equalsIgnoreCase(name)) {
			seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, int value) {
		if ($seq.equalsIgnoreCase(name)) {
			seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, long value) {
		if ($seq.equalsIgnoreCase(name)) {
			seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, float value) {
		if ($seq.equalsIgnoreCase(name)) {
			seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, double value) {
		if ($seq.equalsIgnoreCase(name)) {
			seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}

}
