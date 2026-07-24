package mcframe.serverMA.dbc;

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
import mcframe.commonCore.meta.MCMeta;
import mcframe.commonCore.lang.MCDataType;
import mcframe.serverCore.queryapi.MCDBContainer;
import mcframe.serverCore.queryapi.MCDBContainer.MCTableType;
import mcframe.serverCore.queryapi.IFMCSQL.MCPermColumn;
import mcframe.serverCore.queryapi.IFMCSQL.MCPermColumnInfo;
import mcframe.serverCore.queryapi.MCForeignInfo;

/**
 * "バッチ通知制御マスタ // Batch notification control master"PKワークテーブルDBコンテナRowクラスです。<p>
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
 *  	<td>gp_batch_grp_cd</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>処理グループＣＤ</td>
 *  	<td>Process group cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>usr_cd</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>担当者ＣＤ</td>
 *  	<td>PIC cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>K</td>
 *  	<td>st_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>適用開始日</td>
 *  	<td>Application start date</td>
 *  </tr>
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
public class MAW_BATCH_PUSH_NTC_KEY_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.TEMP_TABLE_ON_COMMIT_DELETE_ROWS;

	public static final String TABLE_NAME = "MAW_BATCH_PUSH_NTC_KEY";

	public static final boolean EX_CTRL = false;
	
	public static final boolean LCL_TABLE = false;
	
	/**
	 * 処理グループＣＤ. Process group cd..<p>
	 *
	 */
	public static final String $gp_batch_grp_cd = "gp_batch_grp_cd";
	private static final MCPermColumnInfo _gp_batch_grp_cd = createColumnInfo("gp_batch_grp_cd");
	public final MCStringPermColumn gp_batch_grp_cd = createStringColumn(_gp_batch_grp_cd);
	
	/**
	 * 担当者ＣＤ. PIC cd..<p>
	 *
	 */
	public static final String $usr_cd = "usr_cd";
	private static final MCPermColumnInfo _usr_cd = createColumnInfo("usr_cd");
	public final MCStringPermColumn usr_cd = createStringColumn(_usr_cd);
	
	/**
	 * 適用開始日. Application start date.<p>
	 *
	 */
	public static final String $st_dt = "st_dt";
	private static final MCPermColumnInfo _st_dt = createColumnInfo("st_dt");
	public final MCDatePermColumn st_dt = createDateColumn(_st_dt);
	
	public static final MCMeta gp_batch_grp_cd_META = createCommonMeta($gp_batch_grp_cd, mcframe.commonMA.meta.MA_META.GP_BATCH_GRP_CD);
	public static final MCMeta usr_cd_META = createCommonMeta($usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta st_dt_META = createCommonMeta($st_dt, mcframe.commonMA.meta.MA_META.DT);

	protected static final List<MCForeignInfo> FOREIGN_INFO_LIST = new ArrayList<>();
	
	protected static final ConstMetaList<MAW_BATCH_PUSH_NTC_KEY_R> constMetas = new ConstMetaList<MAW_BATCH_PUSH_NTC_KEY_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			gp_batch_grp_cd_META,
			usr_cd_META,
			st_dt_META
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
	protected MAW_BATCH_PUSH_NTC_KEY_R(ConstMetaList<? extends MAW_BATCH_PUSH_NTC_KEY_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MAW_BATCH_PUSH_NTC_KEY_R(ConstMetaList<? extends MAW_BATCH_PUSH_NTC_KEY_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MAW_BATCH_PUSH_NTC_KEY_R.$gp_batch_grp_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_BATCH_PUSH_NTC_KEY_R.$gp_batch_grp_cd,
				"gp_batch_grp_cd",
				gp_batch_grp_cd,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAW_BATCH_PUSH_NTC_KEY_R.$usr_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_BATCH_PUSH_NTC_KEY_R.$usr_cd,
				"usr_cd",
				usr_cd,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAW_BATCH_PUSH_NTC_KEY_R.$st_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MAW_BATCH_PUSH_NTC_KEY_R.$st_dt,
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
		return COLUMN_MAP;
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MAW_BATCH_PUSH_NTC_KEY_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MAW_BATCH_PUSH_NTC_KEY_R create(String alias) {
		MAW_BATCH_PUSH_NTC_KEY_R row = new MAW_BATCH_PUSH_NTC_KEY_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MAW_BATCH_PUSH_NTC_KEY_R createByName(T proto) {
		MAW_BATCH_PUSH_NTC_KEY_R row = MAW_BATCH_PUSH_NTC_KEY_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAW_BATCH_PUSH_NTC_KEY_R clone() {
		return (MAW_BATCH_PUSH_NTC_KEY_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAW_BATCH_PUSH_NTC_KEY_R createInstance() {
		return (MAW_BATCH_PUSH_NTC_KEY_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAW_BATCH_PUSH_NTC_KEY_R getValues(String... names) {
		return (MAW_BATCH_PUSH_NTC_KEY_R) super.getValues(names);
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
	 * 処理グループＣＤ. Process group cd..<p>
	 *
	 */
	public String gp_batch_grp_cd() {
		return getConstString(offset + 0, $gp_batch_grp_cd);
	}

	/**
	 * 処理グループＣＤ. Process group cd..<p>
	 *
	 */
	public void gp_batch_grp_cd(String value) {
		setConstString(offset + 0, $gp_batch_grp_cd, value);
	}

	/**
	 * 担当者ＣＤ. PIC cd..<p>
	 *
	 */
	public String usr_cd() {
		return getConstString(offset + 1, $usr_cd);
	}

	/**
	 * 担当者ＣＤ. PIC cd..<p>
	 *
	 */
	public void usr_cd(String value) {
		setConstString(offset + 1, $usr_cd, value);
	}

	/**
	 * 適用開始日. Application start date.<p>
	 *
	 */
	public MCDate st_dt() {
		return getConstDate(offset + 2, $st_dt);
	}

	/**
	 * 適用開始日. Application start date.<p>
	 *
	 */
	public void st_dt(MCDate value) {
		setConstDate(offset + 2, $st_dt, value);
	}

	public String getString(String name) {
		if ($gp_batch_grp_cd.equalsIgnoreCase(name)) {
			return gp_batch_grp_cd();
		}
		if ($usr_cd.equalsIgnoreCase(name)) {
			return usr_cd();
		}
		return super.getString(name);
	}

	public MCDate getDate(String name) {
		if ($st_dt.equalsIgnoreCase(name)) {
			return st_dt();
		}
		return super.getDate(name);
	}

	public String getStringNE(String name) {
		if ($gp_batch_grp_cd.equalsIgnoreCase(name)) {
			return gp_batch_grp_cd();
		}
		if ($usr_cd.equalsIgnoreCase(name)) {
			return usr_cd();
		}
		return super.getStringNE(name);
	}

	public MCDate getDateNE(String name) {
		if ($st_dt.equalsIgnoreCase(name)) {
			return st_dt();
		}
		return super.getDateNE(name);
	}

	public void setString(String name, String value) {
		if ($gp_batch_grp_cd.equalsIgnoreCase(name)) {
			gp_batch_grp_cd(value);
			return;
		}
		if ($usr_cd.equalsIgnoreCase(name)) {
			usr_cd(value);
			return;
		}
		super.setString(name, value);
	}

	public void setDate(String name, MCDate value) {
		if ($st_dt.equalsIgnoreCase(name)) {
			st_dt(value);
			return;
		}
		super.setDate(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($gp_batch_grp_cd.equalsIgnoreCase(name)) {
			gp_batch_grp_cd(value);
			return;
		}
		if ($usr_cd.equalsIgnoreCase(name)) {
			usr_cd(value);
			return;
		}
		super.setStringNE(name, value);
	}

	public void setDateNE(String name, MCDate value) {
		if ($st_dt.equalsIgnoreCase(name)) {
			st_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}

}
