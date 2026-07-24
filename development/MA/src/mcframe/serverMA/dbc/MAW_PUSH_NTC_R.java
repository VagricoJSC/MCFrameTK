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
 * "プッシュ通知ワーク // Push notifications work"DBコンテナRowクラスです。<p>
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
 *  	<td>push_ntc_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>プッシュ通知ＮＯ</td>
 *  	<td>Push notifications No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>push_ntc_typ</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>プッシュ通知区分</td>
 *  	<td>Push notification type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ntc_wg_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>通知先ワーキンググループＣＤ</td>
 *  	<td>Notify-to WG cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ntc_dpt_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>通知先部門ＣＤ</td>
 *  	<td>Notify-to dept. cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ntc_aprv_role_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>通知先承認役割ＣＤ</td>
 *  	<td>Notify-to approval role cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ntc_usr_cd</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>通知先担当者ＣＤ</td>
 *  	<td>Notify-to PIC cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>master_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>プッシュ通知マスタ適用日</td>
 *  	<td>Push notification master application date</td>
 *  </tr>
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
public class MAW_PUSH_NTC_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.TEMP_TABLE_ON_COMMIT_DELETE_ROWS;

	public static final String TABLE_NAME = "MAW_PUSH_NTC";

	public static final boolean EX_CTRL = false;
	
	public static final boolean LCL_TABLE = false;
	
	/**
	 * プッシュ通知ＮＯ. Push notifications No..<p>
	 *
	 */
	public static final String $push_ntc_no = "push_ntc_no";
	private static final MCPermColumnInfo _push_ntc_no = createColumnInfo("push_ntc_no");
	public final MCStringPermColumn push_ntc_no = createStringColumn(_push_ntc_no);
	
	/**
	 * プッシュ通知区分. Push notification type.<p>
	 *
	 */
	public static final String $push_ntc_typ = "push_ntc_typ";
	private static final MCPermColumnInfo _push_ntc_typ = createColumnInfo("push_ntc_typ");
	public final MCStringPermColumn push_ntc_typ = createStringColumn(_push_ntc_typ);
	
	/**
	 * 通知先ワーキンググループＣＤ. Notify-to WG cd..<p>
	 *
	 */
	public static final String $ntc_wg_cd = "ntc_wg_cd";
	private static final MCPermColumnInfo _ntc_wg_cd = createColumnInfo("ntc_wg_cd");
	public final MCStringPermColumn ntc_wg_cd = createStringColumn(_ntc_wg_cd);
	
	/**
	 * 通知先部門ＣＤ. Notify-to dept. cd..<p>
	 *
	 */
	public static final String $ntc_dpt_cd = "ntc_dpt_cd";
	private static final MCPermColumnInfo _ntc_dpt_cd = createColumnInfo("ntc_dpt_cd");
	public final MCStringPermColumn ntc_dpt_cd = createStringColumn(_ntc_dpt_cd);
	
	/**
	 * 通知先承認役割ＣＤ. Notify-to approval role cd..<p>
	 *
	 */
	public static final String $ntc_aprv_role_cd = "ntc_aprv_role_cd";
	private static final MCPermColumnInfo _ntc_aprv_role_cd = createColumnInfo("ntc_aprv_role_cd");
	public final MCStringPermColumn ntc_aprv_role_cd = createStringColumn(_ntc_aprv_role_cd);
	
	/**
	 * 通知先担当者ＣＤ. Notify-to PIC cd..<p>
	 *
	 */
	public static final String $ntc_usr_cd = "ntc_usr_cd";
	private static final MCPermColumnInfo _ntc_usr_cd = createColumnInfo("ntc_usr_cd");
	public final MCStringPermColumn ntc_usr_cd = createStringColumn(_ntc_usr_cd);
	
	/**
	 * プッシュ通知マスタ適用日. Push notification master application date.<p>
	 *
	 */
	public static final String $master_dt = "master_dt";
	private static final MCPermColumnInfo _master_dt = createColumnInfo("master_dt");
	public final MCDatePermColumn master_dt = createDateColumn(_master_dt);
	
	public static final MCMeta push_ntc_no_META = createCommonMeta($push_ntc_no, mcframe.commonMA.meta.MA_META.PUSH_NTC_NO);
	public static final MCMeta push_ntc_typ_META = createCommonMeta($push_ntc_typ, mcframe.commonMA.meta.MA_META.PUSH_NTC_TYP);
	public static final MCMeta ntc_wg_cd_META = createCommonMeta($ntc_wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta ntc_dpt_cd_META = createCommonMeta($ntc_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta ntc_aprv_role_cd_META = createCommonMeta($ntc_aprv_role_cd, mcframe.commonMA.meta.MA_META.APRV_ROLE_CD);
	public static final MCMeta ntc_usr_cd_META = createCommonMeta($ntc_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta master_dt_META = createCommonMeta($master_dt, mcframe.commonMA.meta.MA_META.DT);

	protected static final List<MCForeignInfo> FOREIGN_INFO_LIST = new ArrayList<>();
	static {
	}
	
	protected static final ConstMetaList<MAW_PUSH_NTC_R> constMetas = new ConstMetaList<MAW_PUSH_NTC_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			push_ntc_no_META,
			push_ntc_typ_META,
			ntc_wg_cd_META,
			ntc_dpt_cd_META,
			ntc_aprv_role_cd_META,
			ntc_usr_cd_META,
			master_dt_META
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
	protected MAW_PUSH_NTC_R(ConstMetaList<? extends MAW_PUSH_NTC_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MAW_PUSH_NTC_R(ConstMetaList<? extends MAW_PUSH_NTC_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MAW_PUSH_NTC_R.$push_ntc_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_PUSH_NTC_R.$push_ntc_no,
				"push_ntc_no",
				push_ntc_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAW_PUSH_NTC_R.$push_ntc_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_PUSH_NTC_R.$push_ntc_typ,
				"push_ntc_typ",
				push_ntc_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAW_PUSH_NTC_R.$ntc_wg_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_PUSH_NTC_R.$ntc_wg_cd,
				"ntc_wg_cd",
				ntc_wg_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAW_PUSH_NTC_R.$ntc_dpt_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_PUSH_NTC_R.$ntc_dpt_cd,
				"ntc_dpt_cd",
				ntc_dpt_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAW_PUSH_NTC_R.$ntc_aprv_role_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_PUSH_NTC_R.$ntc_aprv_role_cd,
				"ntc_aprv_role_cd",
				ntc_aprv_role_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAW_PUSH_NTC_R.$ntc_usr_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_PUSH_NTC_R.$ntc_usr_cd,
				"ntc_usr_cd",
				ntc_usr_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAW_PUSH_NTC_R.$master_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MAW_PUSH_NTC_R.$master_dt,
				"master_dt",
				master_dt,
				false,
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
	public static MAW_PUSH_NTC_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MAW_PUSH_NTC_R create(String alias) {
		MAW_PUSH_NTC_R row = new MAW_PUSH_NTC_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MAW_PUSH_NTC_R createByName(T proto) {
		MAW_PUSH_NTC_R row = MAW_PUSH_NTC_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAW_PUSH_NTC_R clone() {
		return (MAW_PUSH_NTC_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAW_PUSH_NTC_R createInstance() {
		return (MAW_PUSH_NTC_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAW_PUSH_NTC_R getValues(String... names) {
		return (MAW_PUSH_NTC_R) super.getValues(names);
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
	 * プッシュ通知ＮＯ. Push notifications No..<p>
	 *
	 */
	public String push_ntc_no() {
		return getConstString(offset + 0, $push_ntc_no);
	}

	/**
	 * プッシュ通知ＮＯ. Push notifications No..<p>
	 *
	 */
	public void push_ntc_no(String value) {
		setConstString(offset + 0, $push_ntc_no, value);
	}

	/**
	 * プッシュ通知区分. Push notification type.<p>
	 *
	 */
	public String push_ntc_typ() {
		return getConstString(offset + 1, $push_ntc_typ);
	}

	/**
	 * プッシュ通知区分. Push notification type.<p>
	 *
	 */
	public void push_ntc_typ(String value) {
		setConstString(offset + 1, $push_ntc_typ, value);
	}

	/**
	 * 通知先ワーキンググループＣＤ. Notify-to WG cd..<p>
	 *
	 */
	public String ntc_wg_cd() {
		return getConstString(offset + 2, $ntc_wg_cd);
	}

	/**
	 * 通知先ワーキンググループＣＤ. Notify-to WG cd..<p>
	 *
	 */
	public void ntc_wg_cd(String value) {
		setConstString(offset + 2, $ntc_wg_cd, value);
	}

	/**
	 * 通知先部門ＣＤ. Notify-to dept. cd..<p>
	 *
	 */
	public String ntc_dpt_cd() {
		return getConstString(offset + 3, $ntc_dpt_cd);
	}

	/**
	 * 通知先部門ＣＤ. Notify-to dept. cd..<p>
	 *
	 */
	public void ntc_dpt_cd(String value) {
		setConstString(offset + 3, $ntc_dpt_cd, value);
	}

	/**
	 * 通知先承認役割ＣＤ. Notify-to approval role cd..<p>
	 *
	 */
	public String ntc_aprv_role_cd() {
		return getConstString(offset + 4, $ntc_aprv_role_cd);
	}

	/**
	 * 通知先承認役割ＣＤ. Notify-to approval role cd..<p>
	 *
	 */
	public void ntc_aprv_role_cd(String value) {
		setConstString(offset + 4, $ntc_aprv_role_cd, value);
	}

	/**
	 * 通知先担当者ＣＤ. Notify-to PIC cd..<p>
	 *
	 */
	public String ntc_usr_cd() {
		return getConstString(offset + 5, $ntc_usr_cd);
	}

	/**
	 * 通知先担当者ＣＤ. Notify-to PIC cd..<p>
	 *
	 */
	public void ntc_usr_cd(String value) {
		setConstString(offset + 5, $ntc_usr_cd, value);
	}

	/**
	 * プッシュ通知マスタ適用日. Push notification master application date.<p>
	 *
	 */
	public MCDate master_dt() {
		return getConstDate(offset + 6, $master_dt);
	}

	/**
	 * プッシュ通知マスタ適用日. Push notification master application date.<p>
	 *
	 */
	public void master_dt(MCDate value) {
		setConstDate(offset + 6, $master_dt, value);
	}

	public String getString(String name) {
		if ($push_ntc_no.equalsIgnoreCase(name)) {
			return push_ntc_no();
		}
		if ($push_ntc_typ.equalsIgnoreCase(name)) {
			return push_ntc_typ();
		}
		if ($ntc_wg_cd.equalsIgnoreCase(name)) {
			return ntc_wg_cd();
		}
		if ($ntc_dpt_cd.equalsIgnoreCase(name)) {
			return ntc_dpt_cd();
		}
		if ($ntc_aprv_role_cd.equalsIgnoreCase(name)) {
			return ntc_aprv_role_cd();
		}
		if ($ntc_usr_cd.equalsIgnoreCase(name)) {
			return ntc_usr_cd();
		}
		return super.getString(name);
	}

	public MCDate getDate(String name) {
		if ($master_dt.equalsIgnoreCase(name)) {
			return master_dt();
		}
		return super.getDate(name);
	}

	public String getStringNE(String name) {
		if ($push_ntc_no.equalsIgnoreCase(name)) {
			return push_ntc_no();
		}
		if ($push_ntc_typ.equalsIgnoreCase(name)) {
			return push_ntc_typ();
		}
		if ($ntc_wg_cd.equalsIgnoreCase(name)) {
			return ntc_wg_cd();
		}
		if ($ntc_dpt_cd.equalsIgnoreCase(name)) {
			return ntc_dpt_cd();
		}
		if ($ntc_aprv_role_cd.equalsIgnoreCase(name)) {
			return ntc_aprv_role_cd();
		}
		if ($ntc_usr_cd.equalsIgnoreCase(name)) {
			return ntc_usr_cd();
		}
		return super.getStringNE(name);
	}

	public MCDate getDateNE(String name) {
		if ($master_dt.equalsIgnoreCase(name)) {
			return master_dt();
		}
		return super.getDateNE(name);
	}

	public void setString(String name, String value) {
		if ($push_ntc_no.equalsIgnoreCase(name)) {
			push_ntc_no(value);
			return;
		}
		if ($push_ntc_typ.equalsIgnoreCase(name)) {
			push_ntc_typ(value);
			return;
		}
		if ($ntc_wg_cd.equalsIgnoreCase(name)) {
			ntc_wg_cd(value);
			return;
		}
		if ($ntc_dpt_cd.equalsIgnoreCase(name)) {
			ntc_dpt_cd(value);
			return;
		}
		if ($ntc_aprv_role_cd.equalsIgnoreCase(name)) {
			ntc_aprv_role_cd(value);
			return;
		}
		if ($ntc_usr_cd.equalsIgnoreCase(name)) {
			ntc_usr_cd(value);
			return;
		}
		super.setString(name, value);
	}

	public void setDate(String name, MCDate value) {
		if ($master_dt.equalsIgnoreCase(name)) {
			master_dt(value);
			return;
		}
		super.setDate(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($push_ntc_no.equalsIgnoreCase(name)) {
			push_ntc_no(value);
			return;
		}
		if ($push_ntc_typ.equalsIgnoreCase(name)) {
			push_ntc_typ(value);
			return;
		}
		if ($ntc_wg_cd.equalsIgnoreCase(name)) {
			ntc_wg_cd(value);
			return;
		}
		if ($ntc_dpt_cd.equalsIgnoreCase(name)) {
			ntc_dpt_cd(value);
			return;
		}
		if ($ntc_aprv_role_cd.equalsIgnoreCase(name)) {
			ntc_aprv_role_cd(value);
			return;
		}
		if ($ntc_usr_cd.equalsIgnoreCase(name)) {
			ntc_usr_cd(value);
			return;
		}
		super.setStringNE(name, value);
	}

	public void setDateNE(String name, MCDate value) {
		if ($master_dt.equalsIgnoreCase(name)) {
			master_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}

}
