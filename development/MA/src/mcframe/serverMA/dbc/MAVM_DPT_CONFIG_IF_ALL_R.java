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
 * "原価部門構成マスタ送信ＩＦ // Cost dept. structure master export IF"DBコンテナRowクラスです。<p>
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
 *  	<td>C</td>
 *  	<td>term</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>期</td>
 *  	<td>Term</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>lv01_dpt_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>部門ＣＤ（階層レベル１）</td>
 *  	<td>Dept. cd. (Hierarchy level 1)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>lv02_dpt_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>部門ＣＤ（階層レベル２）</td>
 *  	<td>Dept. cd. (Hierarchy level 2)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>lv03_dpt_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>部門ＣＤ（階層レベル３）</td>
 *  	<td>Dept. cd. (Hierarchy level 3)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>lv04_dpt_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>部門ＣＤ（階層レベル４）</td>
 *  	<td>Dept. cd. (Hierarchy level 4)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>lv05_dpt_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>部門ＣＤ（階層レベル５）</td>
 *  	<td>Dept. cd. (Hierarchy level 5)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>lv06_dpt_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>部門ＣＤ（階層レベル６）</td>
 *  	<td>Dept. cd. (Hierarchy level 6)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>lv07_dpt_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>部門ＣＤ（階層レベル７）</td>
 *  	<td>Dept. cd. (Hierarchy level 7)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>lv08_dpt_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>部門ＣＤ（階層レベル８）</td>
 *  	<td>Dept. cd. (Hierarchy level 8)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>lv09_dpt_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>部門ＣＤ（階層レベル９）</td>
 *  	<td>Dept. cd. (Hierarchy level 9)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>lv10_dpt_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>部門ＣＤ（階層レベル１０）</td>
 *  	<td>Dept. cd. (Hierarchy level 10)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>memo1</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>メモ１</td>
 *  	<td>Memo 1</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>memo2</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>メモ２</td>
 *  	<td>Memo 2</td>
 *  </tr>
 *  <tr >
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
public class MAVM_DPT_CONFIG_IF_ALL_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.VIEW;

	public static final String TABLE_NAME = "MAVM_DPT_CONFIG_IF_ALL";

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
	 * 期. Term.<p>
	 *
	 */
	public static final String $term = "term";
	private static final MCPermColumnInfo _term = createColumnInfo("term");
	public final MCDatePermColumn term = createDateColumn(_term);
	
	/**
	 * 部門ＣＤ（階層レベル１）. Dept. cd. (Hierarchy level 1).<p>
	 *
	 */
	public static final String $lv01_dpt_cd = "lv01_dpt_cd";
	private static final MCPermColumnInfo _lv01_dpt_cd = createColumnInfo("lv01_dpt_cd");
	public final MCStringPermColumn lv01_dpt_cd = createStringColumn(_lv01_dpt_cd);
	
	/**
	 * 部門ＣＤ（階層レベル２）. Dept. cd. (Hierarchy level 2).<p>
	 *
	 */
	public static final String $lv02_dpt_cd = "lv02_dpt_cd";
	private static final MCPermColumnInfo _lv02_dpt_cd = createColumnInfo("lv02_dpt_cd");
	public final MCStringPermColumn lv02_dpt_cd = createStringColumn(_lv02_dpt_cd);
	
	/**
	 * 部門ＣＤ（階層レベル３）. Dept. cd. (Hierarchy level 3).<p>
	 *
	 */
	public static final String $lv03_dpt_cd = "lv03_dpt_cd";
	private static final MCPermColumnInfo _lv03_dpt_cd = createColumnInfo("lv03_dpt_cd");
	public final MCStringPermColumn lv03_dpt_cd = createStringColumn(_lv03_dpt_cd);
	
	/**
	 * 部門ＣＤ（階層レベル４）. Dept. cd. (Hierarchy level 4).<p>
	 *
	 */
	public static final String $lv04_dpt_cd = "lv04_dpt_cd";
	private static final MCPermColumnInfo _lv04_dpt_cd = createColumnInfo("lv04_dpt_cd");
	public final MCStringPermColumn lv04_dpt_cd = createStringColumn(_lv04_dpt_cd);
	
	/**
	 * 部門ＣＤ（階層レベル５）. Dept. cd. (Hierarchy level 5).<p>
	 *
	 */
	public static final String $lv05_dpt_cd = "lv05_dpt_cd";
	private static final MCPermColumnInfo _lv05_dpt_cd = createColumnInfo("lv05_dpt_cd");
	public final MCStringPermColumn lv05_dpt_cd = createStringColumn(_lv05_dpt_cd);
	
	/**
	 * 部門ＣＤ（階層レベル６）. Dept. cd. (Hierarchy level 6).<p>
	 *
	 */
	public static final String $lv06_dpt_cd = "lv06_dpt_cd";
	private static final MCPermColumnInfo _lv06_dpt_cd = createColumnInfo("lv06_dpt_cd");
	public final MCStringPermColumn lv06_dpt_cd = createStringColumn(_lv06_dpt_cd);
	
	/**
	 * 部門ＣＤ（階層レベル７）. Dept. cd. (Hierarchy level 7).<p>
	 *
	 */
	public static final String $lv07_dpt_cd = "lv07_dpt_cd";
	private static final MCPermColumnInfo _lv07_dpt_cd = createColumnInfo("lv07_dpt_cd");
	public final MCStringPermColumn lv07_dpt_cd = createStringColumn(_lv07_dpt_cd);
	
	/**
	 * 部門ＣＤ（階層レベル８）. Dept. cd. (Hierarchy level 8).<p>
	 *
	 */
	public static final String $lv08_dpt_cd = "lv08_dpt_cd";
	private static final MCPermColumnInfo _lv08_dpt_cd = createColumnInfo("lv08_dpt_cd");
	public final MCStringPermColumn lv08_dpt_cd = createStringColumn(_lv08_dpt_cd);
	
	/**
	 * 部門ＣＤ（階層レベル９）. Dept. cd. (Hierarchy level 9).<p>
	 *
	 */
	public static final String $lv09_dpt_cd = "lv09_dpt_cd";
	private static final MCPermColumnInfo _lv09_dpt_cd = createColumnInfo("lv09_dpt_cd");
	public final MCStringPermColumn lv09_dpt_cd = createStringColumn(_lv09_dpt_cd);
	
	/**
	 * 部門ＣＤ（階層レベル１０）. Dept. cd. (Hierarchy level 10).<p>
	 *
	 */
	public static final String $lv10_dpt_cd = "lv10_dpt_cd";
	private static final MCPermColumnInfo _lv10_dpt_cd = createColumnInfo("lv10_dpt_cd");
	public final MCStringPermColumn lv10_dpt_cd = createStringColumn(_lv10_dpt_cd);
	
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
	public static final MCMeta dpt_cd_META = createCommonMeta($dpt_cd, mcframe.commonMA.meta.MA_META.COST_DPT_CD);
	public static final MCMeta term_META = createCommonMeta($term, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta lv01_dpt_cd_META = createCommonMeta($lv01_dpt_cd, mcframe.commonMA.meta.MA_META.COST_DPT_CD);
	public static final MCMeta lv02_dpt_cd_META = createCommonMeta($lv02_dpt_cd, mcframe.commonMA.meta.MA_META.COST_DPT_CD);
	public static final MCMeta lv03_dpt_cd_META = createCommonMeta($lv03_dpt_cd, mcframe.commonMA.meta.MA_META.COST_DPT_CD);
	public static final MCMeta lv04_dpt_cd_META = createCommonMeta($lv04_dpt_cd, mcframe.commonMA.meta.MA_META.COST_DPT_CD);
	public static final MCMeta lv05_dpt_cd_META = createCommonMeta($lv05_dpt_cd, mcframe.commonMA.meta.MA_META.COST_DPT_CD);
	public static final MCMeta lv06_dpt_cd_META = createCommonMeta($lv06_dpt_cd, mcframe.commonMA.meta.MA_META.COST_DPT_CD);
	public static final MCMeta lv07_dpt_cd_META = createCommonMeta($lv07_dpt_cd, mcframe.commonMA.meta.MA_META.COST_DPT_CD);
	public static final MCMeta lv08_dpt_cd_META = createCommonMeta($lv08_dpt_cd, mcframe.commonMA.meta.MA_META.COST_DPT_CD);
	public static final MCMeta lv09_dpt_cd_META = createCommonMeta($lv09_dpt_cd, mcframe.commonMA.meta.MA_META.COST_DPT_CD);
	public static final MCMeta lv10_dpt_cd_META = createCommonMeta($lv10_dpt_cd, mcframe.commonMA.meta.MA_META.COST_DPT_CD);
	public static final MCMeta memo1_META = createCommonMeta($memo1, mcframe.commonMA.meta.MA_META.MST_MEMO1);
	public static final MCMeta memo2_META = createCommonMeta($memo2, mcframe.commonMA.meta.MA_META.MST_MEMO2);
	public static final MCMeta memo3_META = createCommonMeta($memo3, mcframe.commonMA.meta.MA_META.MST_MEMO3);

	protected static final List<MCForeignInfo> FOREIGN_INFO_LIST = new ArrayList<>();
	static {
	}
	
	protected static final ConstMetaList<MAVM_DPT_CONFIG_IF_ALL_R> constMetas = new ConstMetaList<MAVM_DPT_CONFIG_IF_ALL_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			co_cd_META,
			dpt_cd_META,
			term_META,
			lv01_dpt_cd_META,
			lv02_dpt_cd_META,
			lv03_dpt_cd_META,
			lv04_dpt_cd_META,
			lv05_dpt_cd_META,
			lv06_dpt_cd_META,
			lv07_dpt_cd_META,
			lv08_dpt_cd_META,
			lv09_dpt_cd_META,
			lv10_dpt_cd_META,
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
	protected MAVM_DPT_CONFIG_IF_ALL_R(ConstMetaList<? extends MAVM_DPT_CONFIG_IF_ALL_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MAVM_DPT_CONFIG_IF_ALL_R(ConstMetaList<? extends MAVM_DPT_CONFIG_IF_ALL_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MAVM_DPT_CONFIG_IF_ALL_R.$co_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_DPT_CONFIG_IF_ALL_R.$co_cd,
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
			MAVM_DPT_CONFIG_IF_ALL_R.$dpt_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_DPT_CONFIG_IF_ALL_R.$dpt_cd,
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
			MAVM_DPT_CONFIG_IF_ALL_R.$term,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MAVM_DPT_CONFIG_IF_ALL_R.$term,
				"term",
				term,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_DPT_CONFIG_IF_ALL_R.$lv01_dpt_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_DPT_CONFIG_IF_ALL_R.$lv01_dpt_cd,
				"lv01_dpt_cd",
				lv01_dpt_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_DPT_CONFIG_IF_ALL_R.$lv02_dpt_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_DPT_CONFIG_IF_ALL_R.$lv02_dpt_cd,
				"lv02_dpt_cd",
				lv02_dpt_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_DPT_CONFIG_IF_ALL_R.$lv03_dpt_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_DPT_CONFIG_IF_ALL_R.$lv03_dpt_cd,
				"lv03_dpt_cd",
				lv03_dpt_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_DPT_CONFIG_IF_ALL_R.$lv04_dpt_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_DPT_CONFIG_IF_ALL_R.$lv04_dpt_cd,
				"lv04_dpt_cd",
				lv04_dpt_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_DPT_CONFIG_IF_ALL_R.$lv05_dpt_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_DPT_CONFIG_IF_ALL_R.$lv05_dpt_cd,
				"lv05_dpt_cd",
				lv05_dpt_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_DPT_CONFIG_IF_ALL_R.$lv06_dpt_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_DPT_CONFIG_IF_ALL_R.$lv06_dpt_cd,
				"lv06_dpt_cd",
				lv06_dpt_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_DPT_CONFIG_IF_ALL_R.$lv07_dpt_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_DPT_CONFIG_IF_ALL_R.$lv07_dpt_cd,
				"lv07_dpt_cd",
				lv07_dpt_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_DPT_CONFIG_IF_ALL_R.$lv08_dpt_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_DPT_CONFIG_IF_ALL_R.$lv08_dpt_cd,
				"lv08_dpt_cd",
				lv08_dpt_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_DPT_CONFIG_IF_ALL_R.$lv09_dpt_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_DPT_CONFIG_IF_ALL_R.$lv09_dpt_cd,
				"lv09_dpt_cd",
				lv09_dpt_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_DPT_CONFIG_IF_ALL_R.$lv10_dpt_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_DPT_CONFIG_IF_ALL_R.$lv10_dpt_cd,
				"lv10_dpt_cd",
				lv10_dpt_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_DPT_CONFIG_IF_ALL_R.$memo1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_DPT_CONFIG_IF_ALL_R.$memo1,
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
			MAVM_DPT_CONFIG_IF_ALL_R.$memo2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_DPT_CONFIG_IF_ALL_R.$memo2,
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
			MAVM_DPT_CONFIG_IF_ALL_R.$memo3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_DPT_CONFIG_IF_ALL_R.$memo3,
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
	public static MAVM_DPT_CONFIG_IF_ALL_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MAVM_DPT_CONFIG_IF_ALL_R create(String alias) {
		MAVM_DPT_CONFIG_IF_ALL_R row = new MAVM_DPT_CONFIG_IF_ALL_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MAVM_DPT_CONFIG_IF_ALL_R createByName(T proto) {
		MAVM_DPT_CONFIG_IF_ALL_R row = MAVM_DPT_CONFIG_IF_ALL_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAVM_DPT_CONFIG_IF_ALL_R clone() {
		return (MAVM_DPT_CONFIG_IF_ALL_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAVM_DPT_CONFIG_IF_ALL_R createInstance() {
		return (MAVM_DPT_CONFIG_IF_ALL_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAVM_DPT_CONFIG_IF_ALL_R getValues(String... names) {
		return (MAVM_DPT_CONFIG_IF_ALL_R) super.getValues(names);
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
	 * 期. Term.<p>
	 *
	 */
	public MCDate term() {
		return getConstDate(offset + 2, $term);
	}

	/**
	 * 期. Term.<p>
	 *
	 */
	public void term(MCDate value) {
		setConstDate(offset + 2, $term, value);
	}

	/**
	 * 部門ＣＤ（階層レベル１）. Dept. cd. (Hierarchy level 1).<p>
	 *
	 */
	public String lv01_dpt_cd() {
		return getConstString(offset + 3, $lv01_dpt_cd);
	}

	/**
	 * 部門ＣＤ（階層レベル１）. Dept. cd. (Hierarchy level 1).<p>
	 *
	 */
	public void lv01_dpt_cd(String value) {
		setConstString(offset + 3, $lv01_dpt_cd, value);
	}

	/**
	 * 部門ＣＤ（階層レベル２）. Dept. cd. (Hierarchy level 2).<p>
	 *
	 */
	public String lv02_dpt_cd() {
		return getConstString(offset + 4, $lv02_dpt_cd);
	}

	/**
	 * 部門ＣＤ（階層レベル２）. Dept. cd. (Hierarchy level 2).<p>
	 *
	 */
	public void lv02_dpt_cd(String value) {
		setConstString(offset + 4, $lv02_dpt_cd, value);
	}

	/**
	 * 部門ＣＤ（階層レベル３）. Dept. cd. (Hierarchy level 3).<p>
	 *
	 */
	public String lv03_dpt_cd() {
		return getConstString(offset + 5, $lv03_dpt_cd);
	}

	/**
	 * 部門ＣＤ（階層レベル３）. Dept. cd. (Hierarchy level 3).<p>
	 *
	 */
	public void lv03_dpt_cd(String value) {
		setConstString(offset + 5, $lv03_dpt_cd, value);
	}

	/**
	 * 部門ＣＤ（階層レベル４）. Dept. cd. (Hierarchy level 4).<p>
	 *
	 */
	public String lv04_dpt_cd() {
		return getConstString(offset + 6, $lv04_dpt_cd);
	}

	/**
	 * 部門ＣＤ（階層レベル４）. Dept. cd. (Hierarchy level 4).<p>
	 *
	 */
	public void lv04_dpt_cd(String value) {
		setConstString(offset + 6, $lv04_dpt_cd, value);
	}

	/**
	 * 部門ＣＤ（階層レベル５）. Dept. cd. (Hierarchy level 5).<p>
	 *
	 */
	public String lv05_dpt_cd() {
		return getConstString(offset + 7, $lv05_dpt_cd);
	}

	/**
	 * 部門ＣＤ（階層レベル５）. Dept. cd. (Hierarchy level 5).<p>
	 *
	 */
	public void lv05_dpt_cd(String value) {
		setConstString(offset + 7, $lv05_dpt_cd, value);
	}

	/**
	 * 部門ＣＤ（階層レベル６）. Dept. cd. (Hierarchy level 6).<p>
	 *
	 */
	public String lv06_dpt_cd() {
		return getConstString(offset + 8, $lv06_dpt_cd);
	}

	/**
	 * 部門ＣＤ（階層レベル６）. Dept. cd. (Hierarchy level 6).<p>
	 *
	 */
	public void lv06_dpt_cd(String value) {
		setConstString(offset + 8, $lv06_dpt_cd, value);
	}

	/**
	 * 部門ＣＤ（階層レベル７）. Dept. cd. (Hierarchy level 7).<p>
	 *
	 */
	public String lv07_dpt_cd() {
		return getConstString(offset + 9, $lv07_dpt_cd);
	}

	/**
	 * 部門ＣＤ（階層レベル７）. Dept. cd. (Hierarchy level 7).<p>
	 *
	 */
	public void lv07_dpt_cd(String value) {
		setConstString(offset + 9, $lv07_dpt_cd, value);
	}

	/**
	 * 部門ＣＤ（階層レベル８）. Dept. cd. (Hierarchy level 8).<p>
	 *
	 */
	public String lv08_dpt_cd() {
		return getConstString(offset + 10, $lv08_dpt_cd);
	}

	/**
	 * 部門ＣＤ（階層レベル８）. Dept. cd. (Hierarchy level 8).<p>
	 *
	 */
	public void lv08_dpt_cd(String value) {
		setConstString(offset + 10, $lv08_dpt_cd, value);
	}

	/**
	 * 部門ＣＤ（階層レベル９）. Dept. cd. (Hierarchy level 9).<p>
	 *
	 */
	public String lv09_dpt_cd() {
		return getConstString(offset + 11, $lv09_dpt_cd);
	}

	/**
	 * 部門ＣＤ（階層レベル９）. Dept. cd. (Hierarchy level 9).<p>
	 *
	 */
	public void lv09_dpt_cd(String value) {
		setConstString(offset + 11, $lv09_dpt_cd, value);
	}

	/**
	 * 部門ＣＤ（階層レベル１０）. Dept. cd. (Hierarchy level 10).<p>
	 *
	 */
	public String lv10_dpt_cd() {
		return getConstString(offset + 12, $lv10_dpt_cd);
	}

	/**
	 * 部門ＣＤ（階層レベル１０）. Dept. cd. (Hierarchy level 10).<p>
	 *
	 */
	public void lv10_dpt_cd(String value) {
		setConstString(offset + 12, $lv10_dpt_cd, value);
	}

	/**
	 * メモ１. Memo 1.<p>
	 *
	 */
	public String memo1() {
		return getConstString(offset + 13, $memo1);
	}

	/**
	 * メモ１. Memo 1.<p>
	 *
	 */
	public void memo1(String value) {
		setConstString(offset + 13, $memo1, value);
	}

	/**
	 * メモ２. Memo 2.<p>
	 *
	 */
	public String memo2() {
		return getConstString(offset + 14, $memo2);
	}

	/**
	 * メモ２. Memo 2.<p>
	 *
	 */
	public void memo2(String value) {
		setConstString(offset + 14, $memo2, value);
	}

	/**
	 * メモ３. Memo 3.<p>
	 *
	 */
	public String memo3() {
		return getConstString(offset + 15, $memo3);
	}

	/**
	 * メモ３. Memo 3.<p>
	 *
	 */
	public void memo3(String value) {
		setConstString(offset + 15, $memo3, value);
	}

	public String getString(String name) {
		if ($co_cd.equalsIgnoreCase(name)) {
			return co_cd();
		}
		if ($dpt_cd.equalsIgnoreCase(name)) {
			return dpt_cd();
		}
		if ($lv01_dpt_cd.equalsIgnoreCase(name)) {
			return lv01_dpt_cd();
		}
		if ($lv02_dpt_cd.equalsIgnoreCase(name)) {
			return lv02_dpt_cd();
		}
		if ($lv03_dpt_cd.equalsIgnoreCase(name)) {
			return lv03_dpt_cd();
		}
		if ($lv04_dpt_cd.equalsIgnoreCase(name)) {
			return lv04_dpt_cd();
		}
		if ($lv05_dpt_cd.equalsIgnoreCase(name)) {
			return lv05_dpt_cd();
		}
		if ($lv06_dpt_cd.equalsIgnoreCase(name)) {
			return lv06_dpt_cd();
		}
		if ($lv07_dpt_cd.equalsIgnoreCase(name)) {
			return lv07_dpt_cd();
		}
		if ($lv08_dpt_cd.equalsIgnoreCase(name)) {
			return lv08_dpt_cd();
		}
		if ($lv09_dpt_cd.equalsIgnoreCase(name)) {
			return lv09_dpt_cd();
		}
		if ($lv10_dpt_cd.equalsIgnoreCase(name)) {
			return lv10_dpt_cd();
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
		if ($term.equalsIgnoreCase(name)) {
			return term();
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
		if ($lv01_dpt_cd.equalsIgnoreCase(name)) {
			return lv01_dpt_cd();
		}
		if ($lv02_dpt_cd.equalsIgnoreCase(name)) {
			return lv02_dpt_cd();
		}
		if ($lv03_dpt_cd.equalsIgnoreCase(name)) {
			return lv03_dpt_cd();
		}
		if ($lv04_dpt_cd.equalsIgnoreCase(name)) {
			return lv04_dpt_cd();
		}
		if ($lv05_dpt_cd.equalsIgnoreCase(name)) {
			return lv05_dpt_cd();
		}
		if ($lv06_dpt_cd.equalsIgnoreCase(name)) {
			return lv06_dpt_cd();
		}
		if ($lv07_dpt_cd.equalsIgnoreCase(name)) {
			return lv07_dpt_cd();
		}
		if ($lv08_dpt_cd.equalsIgnoreCase(name)) {
			return lv08_dpt_cd();
		}
		if ($lv09_dpt_cd.equalsIgnoreCase(name)) {
			return lv09_dpt_cd();
		}
		if ($lv10_dpt_cd.equalsIgnoreCase(name)) {
			return lv10_dpt_cd();
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
		if ($term.equalsIgnoreCase(name)) {
			return term();
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
		if ($lv01_dpt_cd.equalsIgnoreCase(name)) {
			lv01_dpt_cd(value);
			return;
		}
		if ($lv02_dpt_cd.equalsIgnoreCase(name)) {
			lv02_dpt_cd(value);
			return;
		}
		if ($lv03_dpt_cd.equalsIgnoreCase(name)) {
			lv03_dpt_cd(value);
			return;
		}
		if ($lv04_dpt_cd.equalsIgnoreCase(name)) {
			lv04_dpt_cd(value);
			return;
		}
		if ($lv05_dpt_cd.equalsIgnoreCase(name)) {
			lv05_dpt_cd(value);
			return;
		}
		if ($lv06_dpt_cd.equalsIgnoreCase(name)) {
			lv06_dpt_cd(value);
			return;
		}
		if ($lv07_dpt_cd.equalsIgnoreCase(name)) {
			lv07_dpt_cd(value);
			return;
		}
		if ($lv08_dpt_cd.equalsIgnoreCase(name)) {
			lv08_dpt_cd(value);
			return;
		}
		if ($lv09_dpt_cd.equalsIgnoreCase(name)) {
			lv09_dpt_cd(value);
			return;
		}
		if ($lv10_dpt_cd.equalsIgnoreCase(name)) {
			lv10_dpt_cd(value);
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
		if ($term.equalsIgnoreCase(name)) {
			term(value);
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
		if ($lv01_dpt_cd.equalsIgnoreCase(name)) {
			lv01_dpt_cd(value);
			return;
		}
		if ($lv02_dpt_cd.equalsIgnoreCase(name)) {
			lv02_dpt_cd(value);
			return;
		}
		if ($lv03_dpt_cd.equalsIgnoreCase(name)) {
			lv03_dpt_cd(value);
			return;
		}
		if ($lv04_dpt_cd.equalsIgnoreCase(name)) {
			lv04_dpt_cd(value);
			return;
		}
		if ($lv05_dpt_cd.equalsIgnoreCase(name)) {
			lv05_dpt_cd(value);
			return;
		}
		if ($lv06_dpt_cd.equalsIgnoreCase(name)) {
			lv06_dpt_cd(value);
			return;
		}
		if ($lv07_dpt_cd.equalsIgnoreCase(name)) {
			lv07_dpt_cd(value);
			return;
		}
		if ($lv08_dpt_cd.equalsIgnoreCase(name)) {
			lv08_dpt_cd(value);
			return;
		}
		if ($lv09_dpt_cd.equalsIgnoreCase(name)) {
			lv09_dpt_cd(value);
			return;
		}
		if ($lv10_dpt_cd.equalsIgnoreCase(name)) {
			lv10_dpt_cd(value);
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
		if ($term.equalsIgnoreCase(name)) {
			term(value);
			return;
		}
		super.setDateNE(name, value);
	}

}
