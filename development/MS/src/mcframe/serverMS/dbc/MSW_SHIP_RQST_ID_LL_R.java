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
import mcframe.commonCore.meta.MCMeta;
import mcframe.commonCore.lang.MCDataType;
import mcframe.serverCore.queryapi.MCDBContainer;
import mcframe.serverCore.queryapi.MCDBContainer.MCTableType;
import mcframe.serverCore.queryapi.IFMCSQL.MCPermColumn;
import mcframe.serverCore.queryapi.IFMCSQL.MCPermColumnInfo;
import mcframe.serverCore.queryapi.MCForeignInfo;

/**
 * "出荷依頼先識別リストロジックワーク // Shipping requested identification list logic work"DBコンテナRowクラスです。<p>
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
 *  	<td>ship_rqst_id_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>出荷依頼先識別ＣＤ</td>
 *  	<td>Shipping requested alias cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ship_rqst_id_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>出荷依頼先識別区分</td>
 *  	<td>Shipping requested identification type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>base_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>基準日</td>
 *  	<td>Base date</td>
 *  </tr>
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
public class MSW_SHIP_RQST_ID_LL_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.TEMP_TABLE_ON_COMMIT_DELETE_ROWS;

	public static final String TABLE_NAME = "MSW_SHIP_RQST_ID_LL";

	public static final boolean EX_CTRL = false;
	
	public static final boolean LCL_TABLE = false;
	
	/**
	 * 出荷依頼先識別ＣＤ. Shipping requested alias cd..<p>
	 *
	 */
	public static final String $ship_rqst_id_cd = "ship_rqst_id_cd";
	private static final MCPermColumnInfo _ship_rqst_id_cd = createColumnInfo("ship_rqst_id_cd");
	public final MCStringPermColumn ship_rqst_id_cd = createStringColumn(_ship_rqst_id_cd);
	
	/**
	 * 出荷依頼先識別区分. Shipping requested identification type.<p>
	 *
	 */
	public static final String $ship_rqst_id_typ = "ship_rqst_id_typ";
	private static final MCPermColumnInfo _ship_rqst_id_typ = createColumnInfo("ship_rqst_id_typ");
	public final MCStringPermColumn ship_rqst_id_typ = createStringColumn(_ship_rqst_id_typ);
	
	/**
	 * 基準日. Base date.<p>
	 *
	 */
	public static final String $base_dt = "base_dt";
	private static final MCPermColumnInfo _base_dt = createColumnInfo("base_dt");
	public final MCDatePermColumn base_dt = createDateColumn(_base_dt);
	
	public static final MCMeta ship_rqst_id_cd_META = createCommonMeta($ship_rqst_id_cd, mcframe.commonMS.meta.MS_META.SHIP_RQST_ID_CD);
	public static final MCMeta ship_rqst_id_typ_META = createCommonMeta($ship_rqst_id_typ, mcframe.commonMS.meta.MS_META.SHIP_RQST_ID_TYP);
	public static final MCMeta base_dt_META = createCommonMeta($base_dt, mcframe.commonMA.meta.MA_META.DT);

	protected static final List<MCForeignInfo> FOREIGN_INFO_LIST = new ArrayList<>();
	static {
	}
	
	protected static final ConstMetaList<MSW_SHIP_RQST_ID_LL_R> constMetas = new ConstMetaList<MSW_SHIP_RQST_ID_LL_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			ship_rqst_id_cd_META,
			ship_rqst_id_typ_META,
			base_dt_META
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
	protected MSW_SHIP_RQST_ID_LL_R(ConstMetaList<? extends MSW_SHIP_RQST_ID_LL_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MSW_SHIP_RQST_ID_LL_R(ConstMetaList<? extends MSW_SHIP_RQST_ID_LL_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MSW_SHIP_RQST_ID_LL_R.$ship_rqst_id_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_SHIP_RQST_ID_LL_R.$ship_rqst_id_cd,
				"ship_rqst_id_cd",
				ship_rqst_id_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_SHIP_RQST_ID_LL_R.$ship_rqst_id_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_SHIP_RQST_ID_LL_R.$ship_rqst_id_typ,
				"ship_rqst_id_typ",
				ship_rqst_id_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_SHIP_RQST_ID_LL_R.$base_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MSW_SHIP_RQST_ID_LL_R.$base_dt,
				"base_dt",
				base_dt,
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
	public static MSW_SHIP_RQST_ID_LL_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MSW_SHIP_RQST_ID_LL_R create(String alias) {
		MSW_SHIP_RQST_ID_LL_R row = new MSW_SHIP_RQST_ID_LL_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MSW_SHIP_RQST_ID_LL_R createByName(T proto) {
		MSW_SHIP_RQST_ID_LL_R row = MSW_SHIP_RQST_ID_LL_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MSW_SHIP_RQST_ID_LL_R clone() {
		return (MSW_SHIP_RQST_ID_LL_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MSW_SHIP_RQST_ID_LL_R createInstance() {
		return (MSW_SHIP_RQST_ID_LL_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MSW_SHIP_RQST_ID_LL_R getValues(String... names) {
		return (MSW_SHIP_RQST_ID_LL_R) super.getValues(names);
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
	 * 出荷依頼先識別ＣＤ. Shipping requested alias cd..<p>
	 *
	 */
	public String ship_rqst_id_cd() {
		return getConstString(offset + 0, $ship_rqst_id_cd);
	}

	/**
	 * 出荷依頼先識別ＣＤ. Shipping requested alias cd..<p>
	 *
	 */
	public void ship_rqst_id_cd(String value) {
		setConstString(offset + 0, $ship_rqst_id_cd, value);
	}

	/**
	 * 出荷依頼先識別区分. Shipping requested identification type.<p>
	 *
	 */
	public String ship_rqst_id_typ() {
		return getConstString(offset + 1, $ship_rqst_id_typ);
	}

	/**
	 * 出荷依頼先識別区分. Shipping requested identification type.<p>
	 *
	 */
	public void ship_rqst_id_typ(String value) {
		setConstString(offset + 1, $ship_rqst_id_typ, value);
	}

	/**
	 * 基準日. Base date.<p>
	 *
	 */
	public MCDate base_dt() {
		return getConstDate(offset + 2, $base_dt);
	}

	/**
	 * 基準日. Base date.<p>
	 *
	 */
	public void base_dt(MCDate value) {
		setConstDate(offset + 2, $base_dt, value);
	}

	public String getString(String name) {
		if ($ship_rqst_id_cd.equalsIgnoreCase(name)) {
			return ship_rqst_id_cd();
		}
		if ($ship_rqst_id_typ.equalsIgnoreCase(name)) {
			return ship_rqst_id_typ();
		}
		return super.getString(name);
	}

	public MCDate getDate(String name) {
		if ($base_dt.equalsIgnoreCase(name)) {
			return base_dt();
		}
		return super.getDate(name);
	}

	public String getStringNE(String name) {
		if ($ship_rqst_id_cd.equalsIgnoreCase(name)) {
			return ship_rqst_id_cd();
		}
		if ($ship_rqst_id_typ.equalsIgnoreCase(name)) {
			return ship_rqst_id_typ();
		}
		return super.getStringNE(name);
	}

	public MCDate getDateNE(String name) {
		if ($base_dt.equalsIgnoreCase(name)) {
			return base_dt();
		}
		return super.getDateNE(name);
	}

	public void setString(String name, String value) {
		if ($ship_rqst_id_cd.equalsIgnoreCase(name)) {
			ship_rqst_id_cd(value);
			return;
		}
		if ($ship_rqst_id_typ.equalsIgnoreCase(name)) {
			ship_rqst_id_typ(value);
			return;
		}
		super.setString(name, value);
	}

	public void setDate(String name, MCDate value) {
		if ($base_dt.equalsIgnoreCase(name)) {
			base_dt(value);
			return;
		}
		super.setDate(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($ship_rqst_id_cd.equalsIgnoreCase(name)) {
			ship_rqst_id_cd(value);
			return;
		}
		if ($ship_rqst_id_typ.equalsIgnoreCase(name)) {
			ship_rqst_id_typ(value);
			return;
		}
		super.setStringNE(name, value);
	}

	public void setDateNE(String name, MCDate value) {
		if ($base_dt.equalsIgnoreCase(name)) {
			base_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}

}
