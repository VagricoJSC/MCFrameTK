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
 * "ＭＲＰ用カレンダマスタ // Calendar master for MRP"DBコンテナRowクラスです。<p>
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
 *  	<td>st_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>適用開始日</td>
 *  	<td>Application start date</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>end_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>適用終了日</td>
 *  	<td>Application end date</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sun_off_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>日曜休日ＦＬＧ</td>
 *  	<td>Sunday holiday flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>mon_off_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>月曜休日ＦＬＧ</td>
 *  	<td>Monday holiday flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>tue_off_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>火曜休日ＦＬＧ</td>
 *  	<td>Tuesday holiday flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>wed_off_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>水曜休日ＦＬＧ</td>
 *  	<td>Wednesday holiday flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>thu_off_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>木曜休日ＦＬＧ</td>
 *  	<td>Thursday holiday flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>fri_off_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>金曜休日ＦＬＧ</td>
 *  	<td>Friday holiday flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sat_off_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>土曜休日ＦＬＧ</td>
 *  	<td>Saturday holiday flg.</td>
 *  </tr>
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
public class MSVM_MRP_CAL_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.VIEW;

	public static final String TABLE_NAME = "MSVM_MRP_CAL";

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
	 * 適用開始日. Application start date.<p>
	 *
	 */
	public static final String $st_dt = "st_dt";
	private static final MCPermColumnInfo _st_dt = createColumnInfo("st_dt");
	public final MCDatePermColumn st_dt = createDateColumn(_st_dt);
	
	/**
	 * 適用終了日. Application end date.<p>
	 *
	 */
	public static final String $end_dt = "end_dt";
	private static final MCPermColumnInfo _end_dt = createColumnInfo("end_dt");
	public final MCDatePermColumn end_dt = createDateColumn(_end_dt);
	
	/**
	 * 日曜休日ＦＬＧ. Sunday holiday flg..<p>
	 *
	 */
	public static final String $sun_off_flg = "sun_off_flg";
	private static final MCPermColumnInfo _sun_off_flg = createColumnInfo("sun_off_flg");
	public final MCBooleanPermColumn sun_off_flg = createBooleanColumn(_sun_off_flg);
	
	/**
	 * 月曜休日ＦＬＧ. Monday holiday flg..<p>
	 *
	 */
	public static final String $mon_off_flg = "mon_off_flg";
	private static final MCPermColumnInfo _mon_off_flg = createColumnInfo("mon_off_flg");
	public final MCBooleanPermColumn mon_off_flg = createBooleanColumn(_mon_off_flg);
	
	/**
	 * 火曜休日ＦＬＧ. Tuesday holiday flg..<p>
	 *
	 */
	public static final String $tue_off_flg = "tue_off_flg";
	private static final MCPermColumnInfo _tue_off_flg = createColumnInfo("tue_off_flg");
	public final MCBooleanPermColumn tue_off_flg = createBooleanColumn(_tue_off_flg);
	
	/**
	 * 水曜休日ＦＬＧ. Wednesday holiday flg..<p>
	 *
	 */
	public static final String $wed_off_flg = "wed_off_flg";
	private static final MCPermColumnInfo _wed_off_flg = createColumnInfo("wed_off_flg");
	public final MCBooleanPermColumn wed_off_flg = createBooleanColumn(_wed_off_flg);
	
	/**
	 * 木曜休日ＦＬＧ. Thursday holiday flg..<p>
	 *
	 */
	public static final String $thu_off_flg = "thu_off_flg";
	private static final MCPermColumnInfo _thu_off_flg = createColumnInfo("thu_off_flg");
	public final MCBooleanPermColumn thu_off_flg = createBooleanColumn(_thu_off_flg);
	
	/**
	 * 金曜休日ＦＬＧ. Friday holiday flg..<p>
	 *
	 */
	public static final String $fri_off_flg = "fri_off_flg";
	private static final MCPermColumnInfo _fri_off_flg = createColumnInfo("fri_off_flg");
	public final MCBooleanPermColumn fri_off_flg = createBooleanColumn(_fri_off_flg);
	
	/**
	 * 土曜休日ＦＬＧ. Saturday holiday flg..<p>
	 *
	 */
	public static final String $sat_off_flg = "sat_off_flg";
	private static final MCPermColumnInfo _sat_off_flg = createColumnInfo("sat_off_flg");
	public final MCBooleanPermColumn sat_off_flg = createBooleanColumn(_sat_off_flg);
	
	public static final MCMeta cal_cd_META = createCommonMeta($cal_cd, mcframe.commonMA.meta.MA_META.CAL_CD);
	public static final MCMeta st_dt_META = createCommonMeta($st_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta end_dt_META = createCommonMeta($end_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta sun_off_flg_META = createCommonMeta($sun_off_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta mon_off_flg_META = createCommonMeta($mon_off_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta tue_off_flg_META = createCommonMeta($tue_off_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta wed_off_flg_META = createCommonMeta($wed_off_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta thu_off_flg_META = createCommonMeta($thu_off_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta fri_off_flg_META = createCommonMeta($fri_off_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sat_off_flg_META = createCommonMeta($sat_off_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final List<MCForeignInfo> FOREIGN_INFO_LIST = new ArrayList<>();
	static {
	}
	
	protected static final ConstMetaList<MSVM_MRP_CAL_R> constMetas = new ConstMetaList<MSVM_MRP_CAL_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			cal_cd_META,
			st_dt_META,
			end_dt_META,
			sun_off_flg_META,
			mon_off_flg_META,
			tue_off_flg_META,
			wed_off_flg_META,
			thu_off_flg_META,
			fri_off_flg_META,
			sat_off_flg_META
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
	protected MSVM_MRP_CAL_R(ConstMetaList<? extends MSVM_MRP_CAL_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MSVM_MRP_CAL_R(ConstMetaList<? extends MSVM_MRP_CAL_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MSVM_MRP_CAL_R.$cal_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVM_MRP_CAL_R.$cal_cd,
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
			MSVM_MRP_CAL_R.$st_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MSVM_MRP_CAL_R.$st_dt,
				"st_dt",
				st_dt,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVM_MRP_CAL_R.$end_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MSVM_MRP_CAL_R.$end_dt,
				"end_dt",
				end_dt,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVM_MRP_CAL_R.$sun_off_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MSVM_MRP_CAL_R.$sun_off_flg,
				"sun_off_flg",
				sun_off_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVM_MRP_CAL_R.$mon_off_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MSVM_MRP_CAL_R.$mon_off_flg,
				"mon_off_flg",
				mon_off_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVM_MRP_CAL_R.$tue_off_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MSVM_MRP_CAL_R.$tue_off_flg,
				"tue_off_flg",
				tue_off_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVM_MRP_CAL_R.$wed_off_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MSVM_MRP_CAL_R.$wed_off_flg,
				"wed_off_flg",
				wed_off_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVM_MRP_CAL_R.$thu_off_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MSVM_MRP_CAL_R.$thu_off_flg,
				"thu_off_flg",
				thu_off_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVM_MRP_CAL_R.$fri_off_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MSVM_MRP_CAL_R.$fri_off_flg,
				"fri_off_flg",
				fri_off_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVM_MRP_CAL_R.$sat_off_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MSVM_MRP_CAL_R.$sat_off_flg,
				"sat_off_flg",
				sat_off_flg,
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
	public static MSVM_MRP_CAL_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MSVM_MRP_CAL_R create(String alias) {
		MSVM_MRP_CAL_R row = new MSVM_MRP_CAL_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MSVM_MRP_CAL_R createByName(T proto) {
		MSVM_MRP_CAL_R row = MSVM_MRP_CAL_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MSVM_MRP_CAL_R clone() {
		return (MSVM_MRP_CAL_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MSVM_MRP_CAL_R createInstance() {
		return (MSVM_MRP_CAL_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MSVM_MRP_CAL_R getValues(String... names) {
		return (MSVM_MRP_CAL_R) super.getValues(names);
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
	 * 適用開始日. Application start date.<p>
	 *
	 */
	public MCDate st_dt() {
		return getConstDate(offset + 1, $st_dt);
	}

	/**
	 * 適用開始日. Application start date.<p>
	 *
	 */
	public void st_dt(MCDate value) {
		setConstDate(offset + 1, $st_dt, value);
	}

	/**
	 * 適用終了日. Application end date.<p>
	 *
	 */
	public MCDate end_dt() {
		return getConstDate(offset + 2, $end_dt);
	}

	/**
	 * 適用終了日. Application end date.<p>
	 *
	 */
	public void end_dt(MCDate value) {
		setConstDate(offset + 2, $end_dt, value);
	}

	/**
	 * 日曜休日ＦＬＧ. Sunday holiday flg..<p>
	 *
	 */
	public boolean sun_off_flg() {
		return getConstBoolean(offset + 3, $sun_off_flg);
	}

	/**
	 * 日曜休日ＦＬＧ. Sunday holiday flg..<p>
	 *
	 */
	public void sun_off_flg(boolean value) {
		setConstBoolean(offset + 3, $sun_off_flg, value);
	}

	/**
	 * 月曜休日ＦＬＧ. Monday holiday flg..<p>
	 *
	 */
	public boolean mon_off_flg() {
		return getConstBoolean(offset + 4, $mon_off_flg);
	}

	/**
	 * 月曜休日ＦＬＧ. Monday holiday flg..<p>
	 *
	 */
	public void mon_off_flg(boolean value) {
		setConstBoolean(offset + 4, $mon_off_flg, value);
	}

	/**
	 * 火曜休日ＦＬＧ. Tuesday holiday flg..<p>
	 *
	 */
	public boolean tue_off_flg() {
		return getConstBoolean(offset + 5, $tue_off_flg);
	}

	/**
	 * 火曜休日ＦＬＧ. Tuesday holiday flg..<p>
	 *
	 */
	public void tue_off_flg(boolean value) {
		setConstBoolean(offset + 5, $tue_off_flg, value);
	}

	/**
	 * 水曜休日ＦＬＧ. Wednesday holiday flg..<p>
	 *
	 */
	public boolean wed_off_flg() {
		return getConstBoolean(offset + 6, $wed_off_flg);
	}

	/**
	 * 水曜休日ＦＬＧ. Wednesday holiday flg..<p>
	 *
	 */
	public void wed_off_flg(boolean value) {
		setConstBoolean(offset + 6, $wed_off_flg, value);
	}

	/**
	 * 木曜休日ＦＬＧ. Thursday holiday flg..<p>
	 *
	 */
	public boolean thu_off_flg() {
		return getConstBoolean(offset + 7, $thu_off_flg);
	}

	/**
	 * 木曜休日ＦＬＧ. Thursday holiday flg..<p>
	 *
	 */
	public void thu_off_flg(boolean value) {
		setConstBoolean(offset + 7, $thu_off_flg, value);
	}

	/**
	 * 金曜休日ＦＬＧ. Friday holiday flg..<p>
	 *
	 */
	public boolean fri_off_flg() {
		return getConstBoolean(offset + 8, $fri_off_flg);
	}

	/**
	 * 金曜休日ＦＬＧ. Friday holiday flg..<p>
	 *
	 */
	public void fri_off_flg(boolean value) {
		setConstBoolean(offset + 8, $fri_off_flg, value);
	}

	/**
	 * 土曜休日ＦＬＧ. Saturday holiday flg..<p>
	 *
	 */
	public boolean sat_off_flg() {
		return getConstBoolean(offset + 9, $sat_off_flg);
	}

	/**
	 * 土曜休日ＦＬＧ. Saturday holiday flg..<p>
	 *
	 */
	public void sat_off_flg(boolean value) {
		setConstBoolean(offset + 9, $sat_off_flg, value);
	}

	public String getString(String name) {
		if ($cal_cd.equalsIgnoreCase(name)) {
			return cal_cd();
		}
		return super.getString(name);
	}

	public MCDate getDate(String name) {
		if ($st_dt.equalsIgnoreCase(name)) {
			return st_dt();
		}
		if ($end_dt.equalsIgnoreCase(name)) {
			return end_dt();
		}
		return super.getDate(name);
	}

	public boolean getBoolean(String name) {
		if ($sun_off_flg.equalsIgnoreCase(name)) {
			return sun_off_flg();
		}
		if ($mon_off_flg.equalsIgnoreCase(name)) {
			return mon_off_flg();
		}
		if ($tue_off_flg.equalsIgnoreCase(name)) {
			return tue_off_flg();
		}
		if ($wed_off_flg.equalsIgnoreCase(name)) {
			return wed_off_flg();
		}
		if ($thu_off_flg.equalsIgnoreCase(name)) {
			return thu_off_flg();
		}
		if ($fri_off_flg.equalsIgnoreCase(name)) {
			return fri_off_flg();
		}
		if ($sat_off_flg.equalsIgnoreCase(name)) {
			return sat_off_flg();
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
		if ($st_dt.equalsIgnoreCase(name)) {
			return st_dt();
		}
		if ($end_dt.equalsIgnoreCase(name)) {
			return end_dt();
		}
		return super.getDateNE(name);
	}

	public boolean getBooleanNE(String name) {
		if ($sun_off_flg.equalsIgnoreCase(name)) {
			return sun_off_flg();
		}
		if ($mon_off_flg.equalsIgnoreCase(name)) {
			return mon_off_flg();
		}
		if ($tue_off_flg.equalsIgnoreCase(name)) {
			return tue_off_flg();
		}
		if ($wed_off_flg.equalsIgnoreCase(name)) {
			return wed_off_flg();
		}
		if ($thu_off_flg.equalsIgnoreCase(name)) {
			return thu_off_flg();
		}
		if ($fri_off_flg.equalsIgnoreCase(name)) {
			return fri_off_flg();
		}
		if ($sat_off_flg.equalsIgnoreCase(name)) {
			return sat_off_flg();
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
		if ($st_dt.equalsIgnoreCase(name)) {
			st_dt(value);
			return;
		}
		if ($end_dt.equalsIgnoreCase(name)) {
			end_dt(value);
			return;
		}
		super.setDate(name, value);
	}

	public void setBoolean(String name, boolean value) {
		if ($sun_off_flg.equalsIgnoreCase(name)) {
			sun_off_flg(value);
			return;
		}
		if ($mon_off_flg.equalsIgnoreCase(name)) {
			mon_off_flg(value);
			return;
		}
		if ($tue_off_flg.equalsIgnoreCase(name)) {
			tue_off_flg(value);
			return;
		}
		if ($wed_off_flg.equalsIgnoreCase(name)) {
			wed_off_flg(value);
			return;
		}
		if ($thu_off_flg.equalsIgnoreCase(name)) {
			thu_off_flg(value);
			return;
		}
		if ($fri_off_flg.equalsIgnoreCase(name)) {
			fri_off_flg(value);
			return;
		}
		if ($sat_off_flg.equalsIgnoreCase(name)) {
			sat_off_flg(value);
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
		if ($st_dt.equalsIgnoreCase(name)) {
			st_dt(value);
			return;
		}
		if ($end_dt.equalsIgnoreCase(name)) {
			end_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}

	public void setBooleanNE(String name, boolean value) {
		if ($sun_off_flg.equalsIgnoreCase(name)) {
			sun_off_flg(value);
			return;
		}
		if ($mon_off_flg.equalsIgnoreCase(name)) {
			mon_off_flg(value);
			return;
		}
		if ($tue_off_flg.equalsIgnoreCase(name)) {
			tue_off_flg(value);
			return;
		}
		if ($wed_off_flg.equalsIgnoreCase(name)) {
			wed_off_flg(value);
			return;
		}
		if ($thu_off_flg.equalsIgnoreCase(name)) {
			thu_off_flg(value);
			return;
		}
		if ($fri_off_flg.equalsIgnoreCase(name)) {
			fri_off_flg(value);
			return;
		}
		if ($sat_off_flg.equalsIgnoreCase(name)) {
			sat_off_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

}
