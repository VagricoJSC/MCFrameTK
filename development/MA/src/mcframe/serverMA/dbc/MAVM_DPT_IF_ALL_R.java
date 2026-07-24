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
 * "部門マスタ送信ＩＦ // Dept. master export IF"DBコンテナRowクラスです。<p>
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
 *  	<td>co_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>会社ＣＤ</td>
 *  	<td>Company cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>dpt_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>部門ＣＤ</td>
 *  	<td>Dept. cd.</td>
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
 *  <tr >
 *  	<td>C</td>
 *  	<td>end_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>適用終了日</td>
 *  	<td>Application end date</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>dpt_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>部門名</td>
 *  	<td>Dept. name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>dpt_nm_lcl1</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>部門名（ロケール１）</td>
 *  	<td>Dept. name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>dpt_nm_lcl2</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>部門名（ロケール２）</td>
 *  	<td>Dept. name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>dpt_nm_lcl3</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>部門名（ロケール３）</td>
 *  	<td>Dept. name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>dpt_nm_lcl4</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>部門名（ロケール４）</td>
 *  	<td>Dept. name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>dpt_nm_lcl5</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>部門名（ロケール５）</td>
 *  	<td>Dept. name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>wg_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ワーキンググループ名</td>
 *  	<td>WG name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>wg_nm_lcl1</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ワーキンググループ名（ロケール１）</td>
 *  	<td>WG name (Locale 1)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>wg_nm_lcl2</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ワーキンググループ名（ロケール２）</td>
 *  	<td>WG name (Locale 2)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>wg_nm_lcl3</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ワーキンググループ名（ロケール３）</td>
 *  	<td>WG name (Locale 3)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>wg_nm_lcl4</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ワーキンググループ名（ロケール４）</td>
 *  	<td>WG name (Locale 4)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>wg_nm_lcl5</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ワーキンググループ名（ロケール５）</td>
 *  	<td>WG name (Locale 5)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>memo1</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>メモ１</td>
 *  	<td>Memo 1</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>memo2</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>メモ２</td>
 *  	<td>Memo 2</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>memo3</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>メモ３</td>
 *  	<td>Memo 3</td>
 *  </tr>
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
public class MAVM_DPT_IF_ALL_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.VIEW;

	public static final String TABLE_NAME = "MAVM_DPT_IF_ALL";

	public static final boolean EX_CTRL = false;
	
	public static final boolean LCL_TABLE = false;
	
	/**
	 * 会社ＣＤ. Company cd..<p>
	 *
	 */
	public static final String $co_cd = "co_cd";
	private static final MCPermColumnInfo _co_cd = createColumnInfo("co_cd");
	public final MCStringPermColumn co_cd = createStringColumn(_co_cd);
	
	/**
	 * 部門ＣＤ. Dept. cd..<p>
	 *
	 */
	public static final String $dpt_cd = "dpt_cd";
	private static final MCPermColumnInfo _dpt_cd = createColumnInfo("dpt_cd");
	public final MCStringPermColumn dpt_cd = createStringColumn(_dpt_cd);
	
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
	 * 部門名. Dept. name.<p>
	 *
	 */
	public static final String $dpt_nm = "dpt_nm";
	private static final MCPermColumnInfo _dpt_nm = createColumnInfo("dpt_nm");
	public final MCStringPermColumn dpt_nm = createStringColumn(_dpt_nm);
	
	/**
	 * 部門名（ロケール１）. Dept. name.<p>
	 *
	 */
	public static final String $dpt_nm_lcl1 = "dpt_nm_lcl1";
	private static final MCPermColumnInfo _dpt_nm_lcl1 = createColumnInfo("dpt_nm_lcl1");
	public final MCStringPermColumn dpt_nm_lcl1 = createStringColumn(_dpt_nm_lcl1);
	
	/**
	 * 部門名（ロケール２）. Dept. name.<p>
	 *
	 */
	public static final String $dpt_nm_lcl2 = "dpt_nm_lcl2";
	private static final MCPermColumnInfo _dpt_nm_lcl2 = createColumnInfo("dpt_nm_lcl2");
	public final MCStringPermColumn dpt_nm_lcl2 = createStringColumn(_dpt_nm_lcl2);
	
	/**
	 * 部門名（ロケール３）. Dept. name.<p>
	 *
	 */
	public static final String $dpt_nm_lcl3 = "dpt_nm_lcl3";
	private static final MCPermColumnInfo _dpt_nm_lcl3 = createColumnInfo("dpt_nm_lcl3");
	public final MCStringPermColumn dpt_nm_lcl3 = createStringColumn(_dpt_nm_lcl3);
	
	/**
	 * 部門名（ロケール４）. Dept. name.<p>
	 *
	 */
	public static final String $dpt_nm_lcl4 = "dpt_nm_lcl4";
	private static final MCPermColumnInfo _dpt_nm_lcl4 = createColumnInfo("dpt_nm_lcl4");
	public final MCStringPermColumn dpt_nm_lcl4 = createStringColumn(_dpt_nm_lcl4);
	
	/**
	 * 部門名（ロケール５）. Dept. name.<p>
	 *
	 */
	public static final String $dpt_nm_lcl5 = "dpt_nm_lcl5";
	private static final MCPermColumnInfo _dpt_nm_lcl5 = createColumnInfo("dpt_nm_lcl5");
	public final MCStringPermColumn dpt_nm_lcl5 = createStringColumn(_dpt_nm_lcl5);
	
	/**
	 * ワーキンググループ名. WG name.<p>
	 *
	 */
	public static final String $wg_nm = "wg_nm";
	private static final MCPermColumnInfo _wg_nm = createColumnInfo("wg_nm");
	public final MCStringPermColumn wg_nm = createStringColumn(_wg_nm);
	
	/**
	 * ワーキンググループ名（ロケール１）. WG name (Locale 1).<p>
	 *
	 */
	public static final String $wg_nm_lcl1 = "wg_nm_lcl1";
	private static final MCPermColumnInfo _wg_nm_lcl1 = createColumnInfo("wg_nm_lcl1");
	public final MCStringPermColumn wg_nm_lcl1 = createStringColumn(_wg_nm_lcl1);
	
	/**
	 * ワーキンググループ名（ロケール２）. WG name (Locale 2).<p>
	 *
	 */
	public static final String $wg_nm_lcl2 = "wg_nm_lcl2";
	private static final MCPermColumnInfo _wg_nm_lcl2 = createColumnInfo("wg_nm_lcl2");
	public final MCStringPermColumn wg_nm_lcl2 = createStringColumn(_wg_nm_lcl2);
	
	/**
	 * ワーキンググループ名（ロケール３）. WG name (Locale 3).<p>
	 *
	 */
	public static final String $wg_nm_lcl3 = "wg_nm_lcl3";
	private static final MCPermColumnInfo _wg_nm_lcl3 = createColumnInfo("wg_nm_lcl3");
	public final MCStringPermColumn wg_nm_lcl3 = createStringColumn(_wg_nm_lcl3);
	
	/**
	 * ワーキンググループ名（ロケール４）. WG name (Locale 4).<p>
	 *
	 */
	public static final String $wg_nm_lcl4 = "wg_nm_lcl4";
	private static final MCPermColumnInfo _wg_nm_lcl4 = createColumnInfo("wg_nm_lcl4");
	public final MCStringPermColumn wg_nm_lcl4 = createStringColumn(_wg_nm_lcl4);
	
	/**
	 * ワーキンググループ名（ロケール５）. WG name (Locale 5).<p>
	 *
	 */
	public static final String $wg_nm_lcl5 = "wg_nm_lcl5";
	private static final MCPermColumnInfo _wg_nm_lcl5 = createColumnInfo("wg_nm_lcl5");
	public final MCStringPermColumn wg_nm_lcl5 = createStringColumn(_wg_nm_lcl5);
	
	/**
	 * メモ１. Memo 1.<p>
	 *
	 */
	public static final String $memo1 = "memo1";
	private static final MCPermColumnInfo _memo1 = createColumnInfo("memo1");
	public final MCStringPermColumn memo1 = createStringColumn(_memo1);
	
	/**
	 * メモ２. Memo 2.<p>
	 *
	 */
	public static final String $memo2 = "memo2";
	private static final MCPermColumnInfo _memo2 = createColumnInfo("memo2");
	public final MCStringPermColumn memo2 = createStringColumn(_memo2);
	
	/**
	 * メモ３. Memo 3.<p>
	 *
	 */
	public static final String $memo3 = "memo3";
	private static final MCPermColumnInfo _memo3 = createColumnInfo("memo3");
	public final MCStringPermColumn memo3 = createStringColumn(_memo3);
	
	public static final MCMeta co_cd_META = createCommonMeta($co_cd, mcframe.commonMA.meta.MA_META.CO_CD);
	public static final MCMeta dpt_cd_META = createCommonMeta($dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta st_dt_META = createCommonMeta($st_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta end_dt_META = createCommonMeta($end_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta dpt_nm_META = createCommonMeta($dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta dpt_nm_lcl1_META = createCommonMeta($dpt_nm_lcl1, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta dpt_nm_lcl2_META = createCommonMeta($dpt_nm_lcl2, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta dpt_nm_lcl3_META = createCommonMeta($dpt_nm_lcl3, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta dpt_nm_lcl4_META = createCommonMeta($dpt_nm_lcl4, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta dpt_nm_lcl5_META = createCommonMeta($dpt_nm_lcl5, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta wg_nm_META = createCommonMeta($wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta wg_nm_lcl1_META = createCommonMeta($wg_nm_lcl1, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta wg_nm_lcl2_META = createCommonMeta($wg_nm_lcl2, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta wg_nm_lcl3_META = createCommonMeta($wg_nm_lcl3, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta wg_nm_lcl4_META = createCommonMeta($wg_nm_lcl4, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta wg_nm_lcl5_META = createCommonMeta($wg_nm_lcl5, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta memo1_META = createCommonMeta($memo1, mcframe.commonMA.meta.MA_META.MST_MEMO1);
	public static final MCMeta memo2_META = createCommonMeta($memo2, mcframe.commonMA.meta.MA_META.MST_MEMO2);
	public static final MCMeta memo3_META = createCommonMeta($memo3, mcframe.commonMA.meta.MA_META.MST_MEMO3);

	protected static final List<MCForeignInfo> FOREIGN_INFO_LIST = new ArrayList<>();
	static {
	}
	
	protected static final ConstMetaList<MAVM_DPT_IF_ALL_R> constMetas = new ConstMetaList<MAVM_DPT_IF_ALL_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			co_cd_META,
			dpt_cd_META,
			st_dt_META,
			end_dt_META,
			dpt_nm_META,
			dpt_nm_lcl1_META,
			dpt_nm_lcl2_META,
			dpt_nm_lcl3_META,
			dpt_nm_lcl4_META,
			dpt_nm_lcl5_META,
			wg_nm_META,
			wg_nm_lcl1_META,
			wg_nm_lcl2_META,
			wg_nm_lcl3_META,
			wg_nm_lcl4_META,
			wg_nm_lcl5_META,
			memo1_META,
			memo2_META,
			memo3_META
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
	protected MAVM_DPT_IF_ALL_R(ConstMetaList<? extends MAVM_DPT_IF_ALL_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MAVM_DPT_IF_ALL_R(ConstMetaList<? extends MAVM_DPT_IF_ALL_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MAVM_DPT_IF_ALL_R.$co_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_DPT_IF_ALL_R.$co_cd,
				"co_cd",
				co_cd,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_DPT_IF_ALL_R.$dpt_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_DPT_IF_ALL_R.$dpt_cd,
				"dpt_cd",
				dpt_cd,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_DPT_IF_ALL_R.$st_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MAVM_DPT_IF_ALL_R.$st_dt,
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
			MAVM_DPT_IF_ALL_R.$end_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MAVM_DPT_IF_ALL_R.$end_dt,
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
			MAVM_DPT_IF_ALL_R.$dpt_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_DPT_IF_ALL_R.$dpt_nm,
				"dpt_nm",
				dpt_nm,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_DPT_IF_ALL_R.$dpt_nm_lcl1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_DPT_IF_ALL_R.$dpt_nm_lcl1,
				"dpt_nm_lcl1",
				dpt_nm_lcl1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_DPT_IF_ALL_R.$dpt_nm_lcl2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_DPT_IF_ALL_R.$dpt_nm_lcl2,
				"dpt_nm_lcl2",
				dpt_nm_lcl2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_DPT_IF_ALL_R.$dpt_nm_lcl3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_DPT_IF_ALL_R.$dpt_nm_lcl3,
				"dpt_nm_lcl3",
				dpt_nm_lcl3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_DPT_IF_ALL_R.$dpt_nm_lcl4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_DPT_IF_ALL_R.$dpt_nm_lcl4,
				"dpt_nm_lcl4",
				dpt_nm_lcl4,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_DPT_IF_ALL_R.$dpt_nm_lcl5,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_DPT_IF_ALL_R.$dpt_nm_lcl5,
				"dpt_nm_lcl5",
				dpt_nm_lcl5,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_DPT_IF_ALL_R.$wg_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_DPT_IF_ALL_R.$wg_nm,
				"wg_nm",
				wg_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_DPT_IF_ALL_R.$wg_nm_lcl1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_DPT_IF_ALL_R.$wg_nm_lcl1,
				"wg_nm_lcl1",
				wg_nm_lcl1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_DPT_IF_ALL_R.$wg_nm_lcl2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_DPT_IF_ALL_R.$wg_nm_lcl2,
				"wg_nm_lcl2",
				wg_nm_lcl2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_DPT_IF_ALL_R.$wg_nm_lcl3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_DPT_IF_ALL_R.$wg_nm_lcl3,
				"wg_nm_lcl3",
				wg_nm_lcl3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_DPT_IF_ALL_R.$wg_nm_lcl4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_DPT_IF_ALL_R.$wg_nm_lcl4,
				"wg_nm_lcl4",
				wg_nm_lcl4,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_DPT_IF_ALL_R.$wg_nm_lcl5,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_DPT_IF_ALL_R.$wg_nm_lcl5,
				"wg_nm_lcl5",
				wg_nm_lcl5,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_DPT_IF_ALL_R.$memo1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_DPT_IF_ALL_R.$memo1,
				"memo1",
				memo1,
				false,
				true,
				false,
				true,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_DPT_IF_ALL_R.$memo2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_DPT_IF_ALL_R.$memo2,
				"memo2",
				memo2,
				false,
				true,
				false,
				true,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_DPT_IF_ALL_R.$memo3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_DPT_IF_ALL_R.$memo3,
				"memo3",
				memo3,
				false,
				true,
				false,
				true,
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
	public static MAVM_DPT_IF_ALL_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MAVM_DPT_IF_ALL_R create(String alias) {
		MAVM_DPT_IF_ALL_R row = new MAVM_DPT_IF_ALL_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MAVM_DPT_IF_ALL_R createByName(T proto) {
		MAVM_DPT_IF_ALL_R row = MAVM_DPT_IF_ALL_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAVM_DPT_IF_ALL_R clone() {
		return (MAVM_DPT_IF_ALL_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAVM_DPT_IF_ALL_R createInstance() {
		return (MAVM_DPT_IF_ALL_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAVM_DPT_IF_ALL_R getValues(String... names) {
		return (MAVM_DPT_IF_ALL_R) super.getValues(names);
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
	 * 会社ＣＤ. Company cd..<p>
	 *
	 */
	public String co_cd() {
		return getConstString(offset + 0, $co_cd);
	}

	/**
	 * 会社ＣＤ. Company cd..<p>
	 *
	 */
	public void co_cd(String value) {
		setConstString(offset + 0, $co_cd, value);
	}

	/**
	 * 部門ＣＤ. Dept. cd..<p>
	 *
	 */
	public String dpt_cd() {
		return getConstString(offset + 1, $dpt_cd);
	}

	/**
	 * 部門ＣＤ. Dept. cd..<p>
	 *
	 */
	public void dpt_cd(String value) {
		setConstString(offset + 1, $dpt_cd, value);
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

	/**
	 * 適用終了日. Application end date.<p>
	 *
	 */
	public MCDate end_dt() {
		return getConstDate(offset + 3, $end_dt);
	}

	/**
	 * 適用終了日. Application end date.<p>
	 *
	 */
	public void end_dt(MCDate value) {
		setConstDate(offset + 3, $end_dt, value);
	}

	/**
	 * 部門名. Dept. name.<p>
	 *
	 */
	public String dpt_nm() {
		return getConstString(offset + 4, $dpt_nm);
	}

	/**
	 * 部門名. Dept. name.<p>
	 *
	 */
	public void dpt_nm(String value) {
		setConstString(offset + 4, $dpt_nm, value);
	}

	/**
	 * 部門名（ロケール１）. Dept. name.<p>
	 *
	 */
	public String dpt_nm_lcl1() {
		return getConstString(offset + 5, $dpt_nm_lcl1);
	}

	/**
	 * 部門名（ロケール１）. Dept. name.<p>
	 *
	 */
	public void dpt_nm_lcl1(String value) {
		setConstString(offset + 5, $dpt_nm_lcl1, value);
	}

	/**
	 * 部門名（ロケール２）. Dept. name.<p>
	 *
	 */
	public String dpt_nm_lcl2() {
		return getConstString(offset + 6, $dpt_nm_lcl2);
	}

	/**
	 * 部門名（ロケール２）. Dept. name.<p>
	 *
	 */
	public void dpt_nm_lcl2(String value) {
		setConstString(offset + 6, $dpt_nm_lcl2, value);
	}

	/**
	 * 部門名（ロケール３）. Dept. name.<p>
	 *
	 */
	public String dpt_nm_lcl3() {
		return getConstString(offset + 7, $dpt_nm_lcl3);
	}

	/**
	 * 部門名（ロケール３）. Dept. name.<p>
	 *
	 */
	public void dpt_nm_lcl3(String value) {
		setConstString(offset + 7, $dpt_nm_lcl3, value);
	}

	/**
	 * 部門名（ロケール４）. Dept. name.<p>
	 *
	 */
	public String dpt_nm_lcl4() {
		return getConstString(offset + 8, $dpt_nm_lcl4);
	}

	/**
	 * 部門名（ロケール４）. Dept. name.<p>
	 *
	 */
	public void dpt_nm_lcl4(String value) {
		setConstString(offset + 8, $dpt_nm_lcl4, value);
	}

	/**
	 * 部門名（ロケール５）. Dept. name.<p>
	 *
	 */
	public String dpt_nm_lcl5() {
		return getConstString(offset + 9, $dpt_nm_lcl5);
	}

	/**
	 * 部門名（ロケール５）. Dept. name.<p>
	 *
	 */
	public void dpt_nm_lcl5(String value) {
		setConstString(offset + 9, $dpt_nm_lcl5, value);
	}

	/**
	 * ワーキンググループ名. WG name.<p>
	 *
	 */
	public String wg_nm() {
		return getConstString(offset + 10, $wg_nm);
	}

	/**
	 * ワーキンググループ名. WG name.<p>
	 *
	 */
	public void wg_nm(String value) {
		setConstString(offset + 10, $wg_nm, value);
	}

	/**
	 * ワーキンググループ名（ロケール１）. WG name (Locale 1).<p>
	 *
	 */
	public String wg_nm_lcl1() {
		return getConstString(offset + 11, $wg_nm_lcl1);
	}

	/**
	 * ワーキンググループ名（ロケール１）. WG name (Locale 1).<p>
	 *
	 */
	public void wg_nm_lcl1(String value) {
		setConstString(offset + 11, $wg_nm_lcl1, value);
	}

	/**
	 * ワーキンググループ名（ロケール２）. WG name (Locale 2).<p>
	 *
	 */
	public String wg_nm_lcl2() {
		return getConstString(offset + 12, $wg_nm_lcl2);
	}

	/**
	 * ワーキンググループ名（ロケール２）. WG name (Locale 2).<p>
	 *
	 */
	public void wg_nm_lcl2(String value) {
		setConstString(offset + 12, $wg_nm_lcl2, value);
	}

	/**
	 * ワーキンググループ名（ロケール３）. WG name (Locale 3).<p>
	 *
	 */
	public String wg_nm_lcl3() {
		return getConstString(offset + 13, $wg_nm_lcl3);
	}

	/**
	 * ワーキンググループ名（ロケール３）. WG name (Locale 3).<p>
	 *
	 */
	public void wg_nm_lcl3(String value) {
		setConstString(offset + 13, $wg_nm_lcl3, value);
	}

	/**
	 * ワーキンググループ名（ロケール４）. WG name (Locale 4).<p>
	 *
	 */
	public String wg_nm_lcl4() {
		return getConstString(offset + 14, $wg_nm_lcl4);
	}

	/**
	 * ワーキンググループ名（ロケール４）. WG name (Locale 4).<p>
	 *
	 */
	public void wg_nm_lcl4(String value) {
		setConstString(offset + 14, $wg_nm_lcl4, value);
	}

	/**
	 * ワーキンググループ名（ロケール５）. WG name (Locale 5).<p>
	 *
	 */
	public String wg_nm_lcl5() {
		return getConstString(offset + 15, $wg_nm_lcl5);
	}

	/**
	 * ワーキンググループ名（ロケール５）. WG name (Locale 5).<p>
	 *
	 */
	public void wg_nm_lcl5(String value) {
		setConstString(offset + 15, $wg_nm_lcl5, value);
	}

	/**
	 * メモ１. Memo 1.<p>
	 *
	 */
	public String memo1() {
		return getConstString(offset + 16, $memo1);
	}

	/**
	 * メモ１. Memo 1.<p>
	 *
	 */
	public void memo1(String value) {
		setConstString(offset + 16, $memo1, value);
	}

	/**
	 * メモ２. Memo 2.<p>
	 *
	 */
	public String memo2() {
		return getConstString(offset + 17, $memo2);
	}

	/**
	 * メモ２. Memo 2.<p>
	 *
	 */
	public void memo2(String value) {
		setConstString(offset + 17, $memo2, value);
	}

	/**
	 * メモ３. Memo 3.<p>
	 *
	 */
	public String memo3() {
		return getConstString(offset + 18, $memo3);
	}

	/**
	 * メモ３. Memo 3.<p>
	 *
	 */
	public void memo3(String value) {
		setConstString(offset + 18, $memo3, value);
	}

	public String getString(String name) {
		if ($co_cd.equalsIgnoreCase(name)) {
			return co_cd();
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			return dpt_cd();
		}
		if ($dpt_nm.equalsIgnoreCase(name)) {
			return dpt_nm();
		}
		if ($dpt_nm_lcl1.equalsIgnoreCase(name)) {
			return dpt_nm_lcl1();
		}
		if ($dpt_nm_lcl2.equalsIgnoreCase(name)) {
			return dpt_nm_lcl2();
		}
		if ($dpt_nm_lcl3.equalsIgnoreCase(name)) {
			return dpt_nm_lcl3();
		}
		if ($dpt_nm_lcl4.equalsIgnoreCase(name)) {
			return dpt_nm_lcl4();
		}
		if ($dpt_nm_lcl5.equalsIgnoreCase(name)) {
			return dpt_nm_lcl5();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($wg_nm_lcl1.equalsIgnoreCase(name)) {
			return wg_nm_lcl1();
		}
		if ($wg_nm_lcl2.equalsIgnoreCase(name)) {
			return wg_nm_lcl2();
		}
		if ($wg_nm_lcl3.equalsIgnoreCase(name)) {
			return wg_nm_lcl3();
		}
		if ($wg_nm_lcl4.equalsIgnoreCase(name)) {
			return wg_nm_lcl4();
		}
		if ($wg_nm_lcl5.equalsIgnoreCase(name)) {
			return wg_nm_lcl5();
		}
		if ($memo1.equalsIgnoreCase(name)) {
			return memo1();
		}
		if ($memo2.equalsIgnoreCase(name)) {
			return memo2();
		}
		if ($memo3.equalsIgnoreCase(name)) {
			return memo3();
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

	public String getStringNE(String name) {
		if ($co_cd.equalsIgnoreCase(name)) {
			return co_cd();
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			return dpt_cd();
		}
		if ($dpt_nm.equalsIgnoreCase(name)) {
			return dpt_nm();
		}
		if ($dpt_nm_lcl1.equalsIgnoreCase(name)) {
			return dpt_nm_lcl1();
		}
		if ($dpt_nm_lcl2.equalsIgnoreCase(name)) {
			return dpt_nm_lcl2();
		}
		if ($dpt_nm_lcl3.equalsIgnoreCase(name)) {
			return dpt_nm_lcl3();
		}
		if ($dpt_nm_lcl4.equalsIgnoreCase(name)) {
			return dpt_nm_lcl4();
		}
		if ($dpt_nm_lcl5.equalsIgnoreCase(name)) {
			return dpt_nm_lcl5();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($wg_nm_lcl1.equalsIgnoreCase(name)) {
			return wg_nm_lcl1();
		}
		if ($wg_nm_lcl2.equalsIgnoreCase(name)) {
			return wg_nm_lcl2();
		}
		if ($wg_nm_lcl3.equalsIgnoreCase(name)) {
			return wg_nm_lcl3();
		}
		if ($wg_nm_lcl4.equalsIgnoreCase(name)) {
			return wg_nm_lcl4();
		}
		if ($wg_nm_lcl5.equalsIgnoreCase(name)) {
			return wg_nm_lcl5();
		}
		if ($memo1.equalsIgnoreCase(name)) {
			return memo1();
		}
		if ($memo2.equalsIgnoreCase(name)) {
			return memo2();
		}
		if ($memo3.equalsIgnoreCase(name)) {
			return memo3();
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

	public void setString(String name, String value) {
		if ($co_cd.equalsIgnoreCase(name)) {
			co_cd(value);
			return;
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			dpt_cd(value);
			return;
		}
		if ($dpt_nm.equalsIgnoreCase(name)) {
			dpt_nm(value);
			return;
		}
		if ($dpt_nm_lcl1.equalsIgnoreCase(name)) {
			dpt_nm_lcl1(value);
			return;
		}
		if ($dpt_nm_lcl2.equalsIgnoreCase(name)) {
			dpt_nm_lcl2(value);
			return;
		}
		if ($dpt_nm_lcl3.equalsIgnoreCase(name)) {
			dpt_nm_lcl3(value);
			return;
		}
		if ($dpt_nm_lcl4.equalsIgnoreCase(name)) {
			dpt_nm_lcl4(value);
			return;
		}
		if ($dpt_nm_lcl5.equalsIgnoreCase(name)) {
			dpt_nm_lcl5(value);
			return;
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			wg_nm(value);
			return;
		}
		if ($wg_nm_lcl1.equalsIgnoreCase(name)) {
			wg_nm_lcl1(value);
			return;
		}
		if ($wg_nm_lcl2.equalsIgnoreCase(name)) {
			wg_nm_lcl2(value);
			return;
		}
		if ($wg_nm_lcl3.equalsIgnoreCase(name)) {
			wg_nm_lcl3(value);
			return;
		}
		if ($wg_nm_lcl4.equalsIgnoreCase(name)) {
			wg_nm_lcl4(value);
			return;
		}
		if ($wg_nm_lcl5.equalsIgnoreCase(name)) {
			wg_nm_lcl5(value);
			return;
		}
		if ($memo1.equalsIgnoreCase(name)) {
			memo1(value);
			return;
		}
		if ($memo2.equalsIgnoreCase(name)) {
			memo2(value);
			return;
		}
		if ($memo3.equalsIgnoreCase(name)) {
			memo3(value);
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

	public void setStringNE(String name, String value) {
		if ($co_cd.equalsIgnoreCase(name)) {
			co_cd(value);
			return;
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			dpt_cd(value);
			return;
		}
		if ($dpt_nm.equalsIgnoreCase(name)) {
			dpt_nm(value);
			return;
		}
		if ($dpt_nm_lcl1.equalsIgnoreCase(name)) {
			dpt_nm_lcl1(value);
			return;
		}
		if ($dpt_nm_lcl2.equalsIgnoreCase(name)) {
			dpt_nm_lcl2(value);
			return;
		}
		if ($dpt_nm_lcl3.equalsIgnoreCase(name)) {
			dpt_nm_lcl3(value);
			return;
		}
		if ($dpt_nm_lcl4.equalsIgnoreCase(name)) {
			dpt_nm_lcl4(value);
			return;
		}
		if ($dpt_nm_lcl5.equalsIgnoreCase(name)) {
			dpt_nm_lcl5(value);
			return;
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			wg_nm(value);
			return;
		}
		if ($wg_nm_lcl1.equalsIgnoreCase(name)) {
			wg_nm_lcl1(value);
			return;
		}
		if ($wg_nm_lcl2.equalsIgnoreCase(name)) {
			wg_nm_lcl2(value);
			return;
		}
		if ($wg_nm_lcl3.equalsIgnoreCase(name)) {
			wg_nm_lcl3(value);
			return;
		}
		if ($wg_nm_lcl4.equalsIgnoreCase(name)) {
			wg_nm_lcl4(value);
			return;
		}
		if ($wg_nm_lcl5.equalsIgnoreCase(name)) {
			wg_nm_lcl5(value);
			return;
		}
		if ($memo1.equalsIgnoreCase(name)) {
			memo1(value);
			return;
		}
		if ($memo2.equalsIgnoreCase(name)) {
			memo2(value);
			return;
		}
		if ($memo3.equalsIgnoreCase(name)) {
			memo3(value);
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

}
