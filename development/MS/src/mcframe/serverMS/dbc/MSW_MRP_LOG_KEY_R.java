package mcframe.serverMS.dbc;

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
 * "ＭＲＰログ情報 // MRP log info."PKワークテーブルDBコンテナRowクラスです。<p>
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
 *  	<td>mrp_calc_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>ＭＲＰ計算ＮＯ</td>
 *  	<td>MRP calculation No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>K</td>
 *  	<td>seq_no</td>
 *  	<td>N</td>
 *  	<td>9,0</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>シーケンス</td>
 *  	<td>Sequence</td>
 *  </tr>
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
public class MSW_MRP_LOG_KEY_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.TEMP_TABLE_ON_COMMIT_DELETE_ROWS;

	public static final String TABLE_NAME = "MSW_MRP_LOG_KEY";

	public static final boolean EX_CTRL = false;
	
	public static final boolean LCL_TABLE = false;
	
	/**
	 * ワーキンググループＣＤ. WG cd..<p>
	 *
	 */
	public static final String $wg_cd = "wg_cd";
	private static final MCPermColumnInfo _wg_cd = createColumnInfo("wg_cd");
	public final MCStringPermColumn wg_cd = createStringColumn(_wg_cd);
	
	/**
	 * ＭＲＰ計算ＮＯ. MRP calculation No..<p>
	 *
	 */
	public static final String $mrp_calc_no = "mrp_calc_no";
	private static final MCPermColumnInfo _mrp_calc_no = createColumnInfo("mrp_calc_no");
	public final MCStringPermColumn mrp_calc_no = createStringColumn(_mrp_calc_no);
	
	/**
	 * シーケンス. Sequence.<p>
	 *
	 */
	public static final String $seq_no = "seq_no";
	private static final MCPermColumnInfo _seq_no = createColumnInfo("seq_no");
	public final MCNumberPermColumn seq_no = createNumberColumn(_seq_no);
	
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta mrp_calc_no_META = createCommonMeta($mrp_calc_no, mcframe.commonMA.meta.MA_META.MRP_CALC_NO);
	public static final MCMeta seq_no_META = createCommonMeta($seq_no, mcframe.commonMA.meta.MA_META.INT);

	protected static final List<MCForeignInfo> FOREIGN_INFO_LIST = new ArrayList<>();
	
	protected static final ConstMetaList<MSW_MRP_LOG_KEY_R> constMetas = new ConstMetaList<MSW_MRP_LOG_KEY_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			wg_cd_META,
			mrp_calc_no_META,
			seq_no_META
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
	protected MSW_MRP_LOG_KEY_R(ConstMetaList<? extends MSW_MRP_LOG_KEY_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MSW_MRP_LOG_KEY_R(ConstMetaList<? extends MSW_MRP_LOG_KEY_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MSW_MRP_LOG_KEY_R.$wg_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_MRP_LOG_KEY_R.$wg_cd,
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
			MSW_MRP_LOG_KEY_R.$mrp_calc_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_MRP_LOG_KEY_R.$mrp_calc_no,
				"mrp_calc_no",
				mrp_calc_no,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_MRP_LOG_KEY_R.$seq_no,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MSW_MRP_LOG_KEY_R.$seq_no,
				"seq_no",
				seq_no,
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
	public static MSW_MRP_LOG_KEY_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MSW_MRP_LOG_KEY_R create(String alias) {
		MSW_MRP_LOG_KEY_R row = new MSW_MRP_LOG_KEY_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MSW_MRP_LOG_KEY_R createByName(T proto) {
		MSW_MRP_LOG_KEY_R row = MSW_MRP_LOG_KEY_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MSW_MRP_LOG_KEY_R clone() {
		return (MSW_MRP_LOG_KEY_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MSW_MRP_LOG_KEY_R createInstance() {
		return (MSW_MRP_LOG_KEY_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MSW_MRP_LOG_KEY_R getValues(String... names) {
		return (MSW_MRP_LOG_KEY_R) super.getValues(names);
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
	 * ワーキンググループＣＤ. WG cd..<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 0, $wg_cd);
	}

	/**
	 * ワーキンググループＣＤ. WG cd..<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 0, $wg_cd, value);
	}

	/**
	 * ＭＲＰ計算ＮＯ. MRP calculation No..<p>
	 *
	 */
	public String mrp_calc_no() {
		return getConstString(offset + 1, $mrp_calc_no);
	}

	/**
	 * ＭＲＰ計算ＮＯ. MRP calculation No..<p>
	 *
	 */
	public void mrp_calc_no(String value) {
		setConstString(offset + 1, $mrp_calc_no, value);
	}

	/**
	 * シーケンス. Sequence.<p>
	 *
	 */
	public MCNumber seq_no() {
		return getConstNumber(offset + 2, $seq_no);
	}

	/**
	 * シーケンス. Sequence.<p>
	 *
	 */
	public void seq_no(MCNumber value) {
		setConstNumber(offset + 2, $seq_no, value);
	}
	
	/**
	 * シーケンス. Sequence.<p>
	 *
	 */
	public void seq_no(int value) {
		setConstNumber(offset + 2, $seq_no, value);
	}
	
	/**
	 * シーケンス. Sequence.<p>
	 *
	 */
	public void seq_no(long value) {
		setConstNumber(offset + 2, $seq_no, value);
	}
	
	/**
	 * シーケンス. Sequence.<p>
	 *
	 */
	public void seq_no(float value) {
		setConstNumber(offset + 2, $seq_no, value);
	}
	
	/**
	 * シーケンス. Sequence.<p>
	 *
	 */
	public void seq_no(double value) {
		setConstNumber(offset + 2, $seq_no, value);
	}
	
	public String getString(String name) {
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($mrp_calc_no.equalsIgnoreCase(name)) {
			return mrp_calc_no();
		}
		return super.getString(name);
	}

	public MCNumber getNumber(String name) {
		if ($seq_no.equalsIgnoreCase(name)) {
			return seq_no();
		}
		return super.getNumber(name);
	}

	public String getStringNE(String name) {
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($mrp_calc_no.equalsIgnoreCase(name)) {
			return mrp_calc_no();
		}
		return super.getStringNE(name);
	}

	public MCNumber getNumberNE(String name) {
		if ($seq_no.equalsIgnoreCase(name)) {
			return seq_no();
		}
		return super.getNumberNE(name);
	}

	public void setString(String name, String value) {
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($mrp_calc_no.equalsIgnoreCase(name)) {
			mrp_calc_no(value);
			return;
		}
		super.setString(name, value);
	}

	public void setNumber(String name, MCNumber value) {
		if ($seq_no.equalsIgnoreCase(name)) {
			seq_no(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, int value) {
		if ($seq_no.equalsIgnoreCase(name)) {
			seq_no(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, long value) {
		if ($seq_no.equalsIgnoreCase(name)) {
			seq_no(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, float value) {
		if ($seq_no.equalsIgnoreCase(name)) {
			seq_no(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, double value) {
		if ($seq_no.equalsIgnoreCase(name)) {
			seq_no(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($mrp_calc_no.equalsIgnoreCase(name)) {
			mrp_calc_no(value);
			return;
		}
		super.setStringNE(name, value);
	}

	public void setNumberNE(String name, MCNumber value) {
		if ($seq_no.equalsIgnoreCase(name)) {
			seq_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, int value) {
		if ($seq_no.equalsIgnoreCase(name)) {
			seq_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, long value) {
		if ($seq_no.equalsIgnoreCase(name)) {
			seq_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, float value) {
		if ($seq_no.equalsIgnoreCase(name)) {
			seq_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, double value) {
		if ($seq_no.equalsIgnoreCase(name)) {
			seq_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}

}
