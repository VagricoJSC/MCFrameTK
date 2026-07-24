package mcframe.serverMS.dbc;

import static mcframe.serverCore.queryapi.IFMCSQL.*;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import mcframe.commonCore.container.MCExtMap;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.lang.MCDate;
import mcframe.serverCore.queryapi.IFMCSQL.MCStringPermColumn;
import mcframe.serverCore.queryapi.IFMCSQL.MCDatePermColumn;
import mcframe.serverCore.queryapi.IFMCSQL.MCBooleanPermColumn;
import mcframe.commonCore.meta.MCMeta;
import mcframe.commonCore.lang.MCDataType;
import mcframe.serverCore.queryapi.MCDBContainer;
import mcframe.serverCore.queryapi.MCDBContainer.MCTableType;
import mcframe.serverCore.queryapi.IFMCSQL.MCPermColumn;
import mcframe.serverCore.queryapi.IFMCSQL.MCPermColumnInfo;
import mcframe.serverCore.queryapi.MCForeignInfo;

/**
 * "ＭＲＰ用臨時カレンダマスタ // Temporary calendar master for MRP"DBコンテナRowクラスです。<p>
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
 *  	<td>cal_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>カレンダＣＤ</td>
 *  	<td>Calendar cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>年月日</td>
 *  	<td>Date</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>off_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>休日ＦＬＧ</td>
 *  	<td>Holiday flg.</td>
 *  </tr>
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
public class MSVM_MRP_CAL_EXT_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.VIEW;

	public static final String TABLE_NAME = "MSVM_MRP_CAL_EXT";

	public static final boolean EX_CTRL = false;
	
	public static final boolean LCL_TABLE = false;
	
	/**
	 * カレンダＣＤ. Calendar cd..<p>
	 *
	 */
	public static final String $cal_cd = "cal_cd";
	private static final MCPermColumnInfo _cal_cd = createColumnInfo("cal_cd");
	public final MCStringPermColumn cal_cd = createStringColumn(_cal_cd);
	
	/**
	 * 年月日. Date.<p>
	 *
	 */
	public static final String $dt = "dt";
	private static final MCPermColumnInfo _dt = createColumnInfo("dt");
	public final MCDatePermColumn dt = createDateColumn(_dt);
	
	/**
	 * 休日ＦＬＧ. Holiday flg..<p>
	 *
	 */
	public static final String $off_flg = "off_flg";
	private static final MCPermColumnInfo _off_flg = createColumnInfo("off_flg");
	public final MCBooleanPermColumn off_flg = createBooleanColumn(_off_flg);
	
	public static final MCMeta cal_cd_META = createCommonMeta($cal_cd, mcframe.commonMA.meta.MA_META.CAL_CD);
	public static final MCMeta dt_META = createCommonMeta($dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta off_flg_META = createCommonMeta($off_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final List<MCForeignInfo> FOREIGN_INFO_LIST = new ArrayList<>();
	static {
	}
	
	protected static final ConstMetaList<MSVM_MRP_CAL_EXT_R> constMetas = new ConstMetaList<MSVM_MRP_CAL_EXT_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			cal_cd_META,
			dt_META,
			off_flg_META
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
	protected MSVM_MRP_CAL_EXT_R(ConstMetaList<? extends MSVM_MRP_CAL_EXT_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MSVM_MRP_CAL_EXT_R(ConstMetaList<? extends MSVM_MRP_CAL_EXT_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MSVM_MRP_CAL_EXT_R.$cal_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVM_MRP_CAL_EXT_R.$cal_cd,
				"cal_cd",
				cal_cd,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVM_MRP_CAL_EXT_R.$dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MSVM_MRP_CAL_EXT_R.$dt,
				"dt",
				dt,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVM_MRP_CAL_EXT_R.$off_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MSVM_MRP_CAL_EXT_R.$off_flg,
				"off_flg",
				off_flg,
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
	public static MSVM_MRP_CAL_EXT_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MSVM_MRP_CAL_EXT_R create(String alias) {
		MSVM_MRP_CAL_EXT_R row = new MSVM_MRP_CAL_EXT_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MSVM_MRP_CAL_EXT_R createByName(T proto) {
		MSVM_MRP_CAL_EXT_R row = MSVM_MRP_CAL_EXT_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MSVM_MRP_CAL_EXT_R clone() {
		return (MSVM_MRP_CAL_EXT_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MSVM_MRP_CAL_EXT_R createInstance() {
		return (MSVM_MRP_CAL_EXT_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MSVM_MRP_CAL_EXT_R getValues(String... names) {
		return (MSVM_MRP_CAL_EXT_R) super.getValues(names);
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
	 * カレンダＣＤ. Calendar cd..<p>
	 *
	 */
	public String cal_cd() {
		return getConstString(offset + 0, $cal_cd);
	}

	/**
	 * カレンダＣＤ. Calendar cd..<p>
	 *
	 */
	public void cal_cd(String value) {
		setConstString(offset + 0, $cal_cd, value);
	}

	/**
	 * 年月日. Date.<p>
	 *
	 */
	public MCDate dt() {
		return getConstDate(offset + 1, $dt);
	}

	/**
	 * 年月日. Date.<p>
	 *
	 */
	public void dt(MCDate value) {
		setConstDate(offset + 1, $dt, value);
	}

	/**
	 * 休日ＦＬＧ. Holiday flg..<p>
	 *
	 */
	public boolean off_flg() {
		return getConstBoolean(offset + 2, $off_flg);
	}

	/**
	 * 休日ＦＬＧ. Holiday flg..<p>
	 *
	 */
	public void off_flg(boolean value) {
		setConstBoolean(offset + 2, $off_flg, value);
	}

	public String getString(String name) {
		if ($cal_cd.equalsIgnoreCase(name)) {
			return cal_cd();
		}
		return super.getString(name);
	}

	public MCDate getDate(String name) {
		if ($dt.equalsIgnoreCase(name)) {
			return dt();
		}
		return super.getDate(name);
	}

	public boolean getBoolean(String name) {
		if ($off_flg.equalsIgnoreCase(name)) {
			return off_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($cal_cd.equalsIgnoreCase(name)) {
			return cal_cd();
		}
		return super.getStringNE(name);
	}

	public MCDate getDateNE(String name) {
		if ($dt.equalsIgnoreCase(name)) {
			return dt();
		}
		return super.getDateNE(name);
	}

	public boolean getBooleanNE(String name) {
		if ($off_flg.equalsIgnoreCase(name)) {
			return off_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($cal_cd.equalsIgnoreCase(name)) {
			cal_cd(value);
			return;
		}
		super.setString(name, value);
	}

	public void setDate(String name, MCDate value) {
		if ($dt.equalsIgnoreCase(name)) {
			dt(value);
			return;
		}
		super.setDate(name, value);
	}

	public void setBoolean(String name, boolean value) {
		if ($off_flg.equalsIgnoreCase(name)) {
			off_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($cal_cd.equalsIgnoreCase(name)) {
			cal_cd(value);
			return;
		}
		super.setStringNE(name, value);
	}

	public void setDateNE(String name, MCDate value) {
		if ($dt.equalsIgnoreCase(name)) {
			dt(value);
			return;
		}
		super.setDateNE(name, value);
	}

	public void setBooleanNE(String name, boolean value) {
		if ($off_flg.equalsIgnoreCase(name)) {
			off_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

}
