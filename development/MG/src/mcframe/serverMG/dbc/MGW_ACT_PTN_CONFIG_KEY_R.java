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
 * "計算実行パタン構成 // Calculation run pattern configuration"PKワークテーブルDBコンテナRowクラスです。<p>
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
 *  	<td>act_ptn_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>計算実行パタンＣＤ</td>
 *  	<td>Calculation run pattern cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>calc_act_seq</td>
 *  	<td>N</td>
 *  	<td>3,0</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>計算実行順序</td>
 *  	<td>Calculation execute sequence</td>
 *  </tr>
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
public class MGW_ACT_PTN_CONFIG_KEY_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.TEMP_TABLE_ON_COMMIT_DELETE_ROWS;

	public static final String TABLE_NAME = "MGW_ACT_PTN_CONFIG_KEY";

	public static final boolean EX_CTRL = false;
	
	public static final boolean LCL_TABLE = false;
	
	/**
	 * 計算実行パタンＣＤ. Calculation run pattern cd..<p>
	 *
	 */
	public static final String $act_ptn_cd = "act_ptn_cd";
	private static final MCPermColumnInfo _act_ptn_cd = createColumnInfo("act_ptn_cd");
	public final MCStringPermColumn act_ptn_cd = createStringColumn(_act_ptn_cd);
	
	/**
	 * 計算実行順序. Calculation execute sequence.<p>
	 *
	 */
	public static final String $calc_act_seq = "calc_act_seq";
	private static final MCPermColumnInfo _calc_act_seq = createColumnInfo("calc_act_seq");
	public final MCNumberPermColumn calc_act_seq = createNumberColumn(_calc_act_seq);
	
	public static final MCMeta act_ptn_cd_META = createCommonMeta($act_ptn_cd, mcframe.commonMA.meta.MA_META.ACT_PTN_CD);
	public static final MCMeta calc_act_seq_META = createCommonMeta($calc_act_seq, mcframe.commonMG.meta.MG_META.CALC_ACT_SEQ);

	protected static final List<MCForeignInfo> FOREIGN_INFO_LIST = new ArrayList<>();
	
	protected static final ConstMetaList<MGW_ACT_PTN_CONFIG_KEY_R> constMetas = new ConstMetaList<MGW_ACT_PTN_CONFIG_KEY_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			act_ptn_cd_META,
			calc_act_seq_META
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
	protected MGW_ACT_PTN_CONFIG_KEY_R(ConstMetaList<? extends MGW_ACT_PTN_CONFIG_KEY_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MGW_ACT_PTN_CONFIG_KEY_R(ConstMetaList<? extends MGW_ACT_PTN_CONFIG_KEY_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MGW_ACT_PTN_CONFIG_KEY_R.$act_ptn_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGW_ACT_PTN_CONFIG_KEY_R.$act_ptn_cd,
				"act_ptn_cd",
				act_ptn_cd,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGW_ACT_PTN_CONFIG_KEY_R.$calc_act_seq,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGW_ACT_PTN_CONFIG_KEY_R.$calc_act_seq,
				"calc_act_seq",
				calc_act_seq,
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
	public static MGW_ACT_PTN_CONFIG_KEY_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MGW_ACT_PTN_CONFIG_KEY_R create(String alias) {
		MGW_ACT_PTN_CONFIG_KEY_R row = new MGW_ACT_PTN_CONFIG_KEY_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MGW_ACT_PTN_CONFIG_KEY_R createByName(T proto) {
		MGW_ACT_PTN_CONFIG_KEY_R row = MGW_ACT_PTN_CONFIG_KEY_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MGW_ACT_PTN_CONFIG_KEY_R clone() {
		return (MGW_ACT_PTN_CONFIG_KEY_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MGW_ACT_PTN_CONFIG_KEY_R createInstance() {
		return (MGW_ACT_PTN_CONFIG_KEY_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MGW_ACT_PTN_CONFIG_KEY_R getValues(String... names) {
		return (MGW_ACT_PTN_CONFIG_KEY_R) super.getValues(names);
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
	 * 計算実行パタンＣＤ. Calculation run pattern cd..<p>
	 *
	 */
	public String act_ptn_cd() {
		return getConstString(offset + 0, $act_ptn_cd);
	}

	/**
	 * 計算実行パタンＣＤ. Calculation run pattern cd..<p>
	 *
	 */
	public void act_ptn_cd(String value) {
		setConstString(offset + 0, $act_ptn_cd, value);
	}

	/**
	 * 計算実行順序. Calculation execute sequence.<p>
	 *
	 */
	public MCNumber calc_act_seq() {
		return getConstNumber(offset + 1, $calc_act_seq);
	}

	/**
	 * 計算実行順序. Calculation execute sequence.<p>
	 *
	 */
	public void calc_act_seq(MCNumber value) {
		setConstNumber(offset + 1, $calc_act_seq, value);
	}
	
	/**
	 * 計算実行順序. Calculation execute sequence.<p>
	 *
	 */
	public void calc_act_seq(int value) {
		setConstNumber(offset + 1, $calc_act_seq, value);
	}
	
	/**
	 * 計算実行順序. Calculation execute sequence.<p>
	 *
	 */
	public void calc_act_seq(long value) {
		setConstNumber(offset + 1, $calc_act_seq, value);
	}
	
	/**
	 * 計算実行順序. Calculation execute sequence.<p>
	 *
	 */
	public void calc_act_seq(float value) {
		setConstNumber(offset + 1, $calc_act_seq, value);
	}
	
	/**
	 * 計算実行順序. Calculation execute sequence.<p>
	 *
	 */
	public void calc_act_seq(double value) {
		setConstNumber(offset + 1, $calc_act_seq, value);
	}
	
	public String getString(String name) {
		if ($act_ptn_cd.equalsIgnoreCase(name)) {
			return act_ptn_cd();
		}
		return super.getString(name);
	}

	public MCNumber getNumber(String name) {
		if ($calc_act_seq.equalsIgnoreCase(name)) {
			return calc_act_seq();
		}
		return super.getNumber(name);
	}

	public String getStringNE(String name) {
		if ($act_ptn_cd.equalsIgnoreCase(name)) {
			return act_ptn_cd();
		}
		return super.getStringNE(name);
	}

	public MCNumber getNumberNE(String name) {
		if ($calc_act_seq.equalsIgnoreCase(name)) {
			return calc_act_seq();
		}
		return super.getNumberNE(name);
	}

	public void setString(String name, String value) {
		if ($act_ptn_cd.equalsIgnoreCase(name)) {
			act_ptn_cd(value);
			return;
		}
		super.setString(name, value);
	}

	public void setNumber(String name, MCNumber value) {
		if ($calc_act_seq.equalsIgnoreCase(name)) {
			calc_act_seq(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, int value) {
		if ($calc_act_seq.equalsIgnoreCase(name)) {
			calc_act_seq(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, long value) {
		if ($calc_act_seq.equalsIgnoreCase(name)) {
			calc_act_seq(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, float value) {
		if ($calc_act_seq.equalsIgnoreCase(name)) {
			calc_act_seq(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, double value) {
		if ($calc_act_seq.equalsIgnoreCase(name)) {
			calc_act_seq(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($act_ptn_cd.equalsIgnoreCase(name)) {
			act_ptn_cd(value);
			return;
		}
		super.setStringNE(name, value);
	}

	public void setNumberNE(String name, MCNumber value) {
		if ($calc_act_seq.equalsIgnoreCase(name)) {
			calc_act_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, int value) {
		if ($calc_act_seq.equalsIgnoreCase(name)) {
			calc_act_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, long value) {
		if ($calc_act_seq.equalsIgnoreCase(name)) {
			calc_act_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, float value) {
		if ($calc_act_seq.equalsIgnoreCase(name)) {
			calc_act_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, double value) {
		if ($calc_act_seq.equalsIgnoreCase(name)) {
			calc_act_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}

}
