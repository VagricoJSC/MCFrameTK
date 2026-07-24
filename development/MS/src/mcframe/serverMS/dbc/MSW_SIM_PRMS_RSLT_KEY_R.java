package mcframe.serverMS.dbc;

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
 * "納期回答用シミュレーション結果 // Simulation result for order promising"PKワークテーブルDBコンテナRowクラスです。<p>
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
 *  	<td>wg_rqst_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＷＧ間依頼ＮＯ</td>
 *  	<td>No. of inventory request from other WG</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>K</td>
 *  	<td>slo_d_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>受注明細ＮＯ</td>
 *  	<td>Sales order details No.</td>
 *  </tr>
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
public class MSW_SIM_PRMS_RSLT_KEY_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.TEMP_TABLE_ON_COMMIT_DELETE_ROWS;

	public static final String TABLE_NAME = "MSW_SIM_PRMS_RSLT_KEY";

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
	 * ＷＧ間依頼ＮＯ. No. of inventory request from other WG.<p>
	 *
	 */
	public static final String $wg_rqst_no = "wg_rqst_no";
	private static final MCPermColumnInfo _wg_rqst_no = createColumnInfo("wg_rqst_no");
	public final MCStringPermColumn wg_rqst_no = createStringColumn(_wg_rqst_no);
	
	/**
	 * 受注明細ＮＯ. Sales order details No..<p>
	 *
	 */
	public static final String $slo_d_no = "slo_d_no";
	private static final MCPermColumnInfo _slo_d_no = createColumnInfo("slo_d_no");
	public final MCStringPermColumn slo_d_no = createStringColumn(_slo_d_no);
	
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta wg_rqst_no_META = createCommonMeta($wg_rqst_no, mcframe.commonMA.meta.MA_META.WG_RQST_NO);
	public static final MCMeta slo_d_no_META = createCommonMeta($slo_d_no, mcframe.commonMA.meta.MA_META.SLO_D_NO);

	protected static final List<MCForeignInfo> FOREIGN_INFO_LIST = new ArrayList<>();
	
	protected static final ConstMetaList<MSW_SIM_PRMS_RSLT_KEY_R> constMetas = new ConstMetaList<MSW_SIM_PRMS_RSLT_KEY_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			wg_cd_META,
			wg_rqst_no_META,
			slo_d_no_META
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
	protected MSW_SIM_PRMS_RSLT_KEY_R(ConstMetaList<? extends MSW_SIM_PRMS_RSLT_KEY_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MSW_SIM_PRMS_RSLT_KEY_R(ConstMetaList<? extends MSW_SIM_PRMS_RSLT_KEY_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MSW_SIM_PRMS_RSLT_KEY_R.$wg_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_SIM_PRMS_RSLT_KEY_R.$wg_cd,
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
			MSW_SIM_PRMS_RSLT_KEY_R.$wg_rqst_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_SIM_PRMS_RSLT_KEY_R.$wg_rqst_no,
				"wg_rqst_no",
				wg_rqst_no,
				true,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_SIM_PRMS_RSLT_KEY_R.$slo_d_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_SIM_PRMS_RSLT_KEY_R.$slo_d_no,
				"slo_d_no",
				slo_d_no,
				true,
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
	public static MSW_SIM_PRMS_RSLT_KEY_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MSW_SIM_PRMS_RSLT_KEY_R create(String alias) {
		MSW_SIM_PRMS_RSLT_KEY_R row = new MSW_SIM_PRMS_RSLT_KEY_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MSW_SIM_PRMS_RSLT_KEY_R createByName(T proto) {
		MSW_SIM_PRMS_RSLT_KEY_R row = MSW_SIM_PRMS_RSLT_KEY_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MSW_SIM_PRMS_RSLT_KEY_R clone() {
		return (MSW_SIM_PRMS_RSLT_KEY_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MSW_SIM_PRMS_RSLT_KEY_R createInstance() {
		return (MSW_SIM_PRMS_RSLT_KEY_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MSW_SIM_PRMS_RSLT_KEY_R getValues(String... names) {
		return (MSW_SIM_PRMS_RSLT_KEY_R) super.getValues(names);
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
	 * ＷＧ間依頼ＮＯ. No. of inventory request from other WG.<p>
	 *
	 */
	public String wg_rqst_no() {
		return getConstString(offset + 1, $wg_rqst_no);
	}

	/**
	 * ＷＧ間依頼ＮＯ. No. of inventory request from other WG.<p>
	 *
	 */
	public void wg_rqst_no(String value) {
		setConstString(offset + 1, $wg_rqst_no, value);
	}

	/**
	 * 受注明細ＮＯ. Sales order details No..<p>
	 *
	 */
	public String slo_d_no() {
		return getConstString(offset + 2, $slo_d_no);
	}

	/**
	 * 受注明細ＮＯ. Sales order details No..<p>
	 *
	 */
	public void slo_d_no(String value) {
		setConstString(offset + 2, $slo_d_no, value);
	}

	public String getString(String name) {
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_rqst_no.equalsIgnoreCase(name)) {
			return wg_rqst_no();
		}
		if ($slo_d_no.equalsIgnoreCase(name)) {
			return slo_d_no();
		}
		return super.getString(name);
	}

	public String getStringNE(String name) {
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($wg_rqst_no.equalsIgnoreCase(name)) {
			return wg_rqst_no();
		}
		if ($slo_d_no.equalsIgnoreCase(name)) {
			return slo_d_no();
		}
		return super.getStringNE(name);
	}

	public void setString(String name, String value) {
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($wg_rqst_no.equalsIgnoreCase(name)) {
			wg_rqst_no(value);
			return;
		}
		if ($slo_d_no.equalsIgnoreCase(name)) {
			slo_d_no(value);
			return;
		}
		super.setString(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($wg_rqst_no.equalsIgnoreCase(name)) {
			wg_rqst_no(value);
			return;
		}
		if ($slo_d_no.equalsIgnoreCase(name)) {
			slo_d_no(value);
			return;
		}
		super.setStringNE(name, value);
	}

}
