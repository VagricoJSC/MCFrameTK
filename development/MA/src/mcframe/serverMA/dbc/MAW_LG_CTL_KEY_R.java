package mcframe.serverMA.dbc;

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
 * "物流制御マスタ // Distribution control master"PKワークテーブルDBコンテナRowクラスです。<p>
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
 *  	<td>fr_lg_grp_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>出荷元物流グループＣＤ</td>
 *  	<td>Shipping point distribution group cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>to_lg_grp_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>出荷先物流グループＣＤ</td>
 *  	<td>Receiving point distribution group cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>K</td>
 *  	<td>ship_term_cd</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>出荷条件ＣＤ</td>
 *  	<td>Shipping conditions cd.</td>
 *  </tr>
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
public class MAW_LG_CTL_KEY_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.TEMP_TABLE_ON_COMMIT_DELETE_ROWS;

	public static final String TABLE_NAME = "MAW_LG_CTL_KEY";

	public static final boolean EX_CTRL = false;
	
	public static final boolean LCL_TABLE = false;
	
	/**
	 * 出荷元物流グループＣＤ. Shipping point distribution group cd..<p>
	 *
	 */
	public static final String $fr_lg_grp_cd = "fr_lg_grp_cd";
	private static final MCPermColumnInfo _fr_lg_grp_cd = createColumnInfo("fr_lg_grp_cd");
	public final MCStringPermColumn fr_lg_grp_cd = createStringColumn(_fr_lg_grp_cd);
	
	/**
	 * 出荷先物流グループＣＤ. Receiving point distribution group cd..<p>
	 *
	 */
	public static final String $to_lg_grp_cd = "to_lg_grp_cd";
	private static final MCPermColumnInfo _to_lg_grp_cd = createColumnInfo("to_lg_grp_cd");
	public final MCStringPermColumn to_lg_grp_cd = createStringColumn(_to_lg_grp_cd);
	
	/**
	 * 出荷条件ＣＤ. Shipping conditions cd..<p>
	 *
	 */
	public static final String $ship_term_cd = "ship_term_cd";
	private static final MCPermColumnInfo _ship_term_cd = createColumnInfo("ship_term_cd");
	public final MCStringPermColumn ship_term_cd = createStringColumn(_ship_term_cd);
	
	public static final MCMeta fr_lg_grp_cd_META = createCommonMeta($fr_lg_grp_cd, mcframe.commonMA.meta.MA_META.LG_GRP_CD);
	public static final MCMeta to_lg_grp_cd_META = createCommonMeta($to_lg_grp_cd, mcframe.commonMA.meta.MA_META.LG_GRP_CD);
	public static final MCMeta ship_term_cd_META = createCommonMeta($ship_term_cd, mcframe.commonMA.meta.MA_META.SHIP_TERM_CD);

	protected static final List<MCForeignInfo> FOREIGN_INFO_LIST = new ArrayList<>();
	
	protected static final ConstMetaList<MAW_LG_CTL_KEY_R> constMetas = new ConstMetaList<MAW_LG_CTL_KEY_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			fr_lg_grp_cd_META,
			to_lg_grp_cd_META,
			ship_term_cd_META
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
	protected MAW_LG_CTL_KEY_R(ConstMetaList<? extends MAW_LG_CTL_KEY_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MAW_LG_CTL_KEY_R(ConstMetaList<? extends MAW_LG_CTL_KEY_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MAW_LG_CTL_KEY_R.$fr_lg_grp_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_LG_CTL_KEY_R.$fr_lg_grp_cd,
				"fr_lg_grp_cd",
				fr_lg_grp_cd,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAW_LG_CTL_KEY_R.$to_lg_grp_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_LG_CTL_KEY_R.$to_lg_grp_cd,
				"to_lg_grp_cd",
				to_lg_grp_cd,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAW_LG_CTL_KEY_R.$ship_term_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAW_LG_CTL_KEY_R.$ship_term_cd,
				"ship_term_cd",
				ship_term_cd,
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
	public static MAW_LG_CTL_KEY_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MAW_LG_CTL_KEY_R create(String alias) {
		MAW_LG_CTL_KEY_R row = new MAW_LG_CTL_KEY_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MAW_LG_CTL_KEY_R createByName(T proto) {
		MAW_LG_CTL_KEY_R row = MAW_LG_CTL_KEY_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAW_LG_CTL_KEY_R clone() {
		return (MAW_LG_CTL_KEY_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAW_LG_CTL_KEY_R createInstance() {
		return (MAW_LG_CTL_KEY_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAW_LG_CTL_KEY_R getValues(String... names) {
		return (MAW_LG_CTL_KEY_R) super.getValues(names);
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
	 * 出荷元物流グループＣＤ. Shipping point distribution group cd..<p>
	 *
	 */
	public String fr_lg_grp_cd() {
		return getConstString(offset + 0, $fr_lg_grp_cd);
	}

	/**
	 * 出荷元物流グループＣＤ. Shipping point distribution group cd..<p>
	 *
	 */
	public void fr_lg_grp_cd(String value) {
		setConstString(offset + 0, $fr_lg_grp_cd, value);
	}

	/**
	 * 出荷先物流グループＣＤ. Receiving point distribution group cd..<p>
	 *
	 */
	public String to_lg_grp_cd() {
		return getConstString(offset + 1, $to_lg_grp_cd);
	}

	/**
	 * 出荷先物流グループＣＤ. Receiving point distribution group cd..<p>
	 *
	 */
	public void to_lg_grp_cd(String value) {
		setConstString(offset + 1, $to_lg_grp_cd, value);
	}

	/**
	 * 出荷条件ＣＤ. Shipping conditions cd..<p>
	 *
	 */
	public String ship_term_cd() {
		return getConstString(offset + 2, $ship_term_cd);
	}

	/**
	 * 出荷条件ＣＤ. Shipping conditions cd..<p>
	 *
	 */
	public void ship_term_cd(String value) {
		setConstString(offset + 2, $ship_term_cd, value);
	}

	public String getString(String name) {
		if ($fr_lg_grp_cd.equalsIgnoreCase(name)) {
			return fr_lg_grp_cd();
		}
		if ($to_lg_grp_cd.equalsIgnoreCase(name)) {
			return to_lg_grp_cd();
		}
		if ($ship_term_cd.equalsIgnoreCase(name)) {
			return ship_term_cd();
		}
		return super.getString(name);
	}

	public String getStringNE(String name) {
		if ($fr_lg_grp_cd.equalsIgnoreCase(name)) {
			return fr_lg_grp_cd();
		}
		if ($to_lg_grp_cd.equalsIgnoreCase(name)) {
			return to_lg_grp_cd();
		}
		if ($ship_term_cd.equalsIgnoreCase(name)) {
			return ship_term_cd();
		}
		return super.getStringNE(name);
	}

	public void setString(String name, String value) {
		if ($fr_lg_grp_cd.equalsIgnoreCase(name)) {
			fr_lg_grp_cd(value);
			return;
		}
		if ($to_lg_grp_cd.equalsIgnoreCase(name)) {
			to_lg_grp_cd(value);
			return;
		}
		if ($ship_term_cd.equalsIgnoreCase(name)) {
			ship_term_cd(value);
			return;
		}
		super.setString(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($fr_lg_grp_cd.equalsIgnoreCase(name)) {
			fr_lg_grp_cd(value);
			return;
		}
		if ($to_lg_grp_cd.equalsIgnoreCase(name)) {
			to_lg_grp_cd(value);
			return;
		}
		if ($ship_term_cd.equalsIgnoreCase(name)) {
			ship_term_cd(value);
			return;
		}
		super.setStringNE(name, value);
	}

}
