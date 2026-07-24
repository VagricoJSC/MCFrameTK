package mcframe.serverMB.dbc;

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
import mcframe.commonCore.lang.MCNumber;
import mcframe.serverCore.queryapi.IFMCSQL.MCStringPermColumn;
import mcframe.serverCore.queryapi.IFMCSQL.MCNumberPermColumn;
import mcframe.serverCore.queryapi.IFMCSQL.MCDatePermColumn;
import mcframe.commonCore.meta.MCMeta;
import mcframe.commonCore.lang.MCDataType;
import mcframe.serverCore.queryapi.MCDBContainer;
import mcframe.serverCore.queryapi.MCDBContainer.MCTableType;
import mcframe.serverCore.queryapi.IFMCSQL.MCPermColumn;
import mcframe.serverCore.queryapi.IFMCSQL.MCPermColumnInfo;
import mcframe.serverCore.queryapi.MCForeignInfo;

/**
 * "承認情報ワーク // Approval info. work"DBコンテナRowクラスです。<p>
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
 *  	<td>peg_no</td>
 *  	<td>N</td>
 *  	<td>9,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>紐付けＮＯ</td>
 *  	<td>Pegging No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>master_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>承認マスタ適用日</td>
 *  	<td>Approval master application date</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>aprv_func_typ</td>
 *  	<td>C</td>
 *  	<td>2</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>承認機能区分</td>
 *  	<td>Approval function type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>aprv_rt_ptn</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>承認ルートパタン</td>
 *  	<td>Approval route pattern</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>src_itm_cd</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>承認作成元品目ＣＤ</td>
 *  	<td>Approval creating source item cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>src_itm_sub1</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>承認作成元枝番１</td>
 *  	<td>Approval creating source branch No. 1</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>src_itm_sub2</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>承認作成元枝番２</td>
 *  	<td>Approval creating source branch No. 2</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>src_itm_sub3</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>承認作成元枝番３</td>
 *  	<td>Approval creating source branch No. 3</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>src_dpt_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>承認作成元部門ＣＤ</td>
 *  	<td>Approval creating source dept. cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>src_bp_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>承認作成元取引先ＣＤ</td>
 *  	<td>Approval creating source customer cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>src_cur_cd1</td>
 *  	<td>C</td>
 *  	<td>3</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>承認作成元通貨ＣＤ１</td>
 *  	<td>Approval creating source base currency cd. 1</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>src_cur_cd2</td>
 *  	<td>C</td>
 *  	<td>3</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>承認作成元通貨ＣＤ２</td>
 *  	<td>Approval creating source base currency cd. 2</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>src_cur_cd3</td>
 *  	<td>C</td>
 *  	<td>3</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>承認作成元通貨ＣＤ３</td>
 *  	<td>Approval creating source base currency cd. 3</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>src_ext_key1</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>承認作成元拡張項目１</td>
 *  	<td>Approval creating source extended column 1</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>src_ext_key2</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>承認作成元拡張項目２</td>
 *  	<td>Approval creating source extended column 2</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>src_ext_key3</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>承認作成元拡張項目３</td>
 *  	<td>Approval created-from expanded column 3</td>
 *  </tr>
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
public class MBW_APRV_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.TEMP_TABLE_ON_COMMIT_DELETE_ROWS;

	public static final String TABLE_NAME = "MBW_APRV";

	public static final boolean EX_CTRL = false;
	
	public static final boolean LCL_TABLE = false;
	
	/**
	 * 紐付けＮＯ. Pegging No..<p>
	 *
	 */
	public static final String $peg_no = "peg_no";
	private static final MCPermColumnInfo _peg_no = createColumnInfo("peg_no");
	public final MCNumberPermColumn peg_no = createNumberColumn(_peg_no);
	
	/**
	 * 承認マスタ適用日. Approval master application date.<p>
	 *
	 */
	public static final String $master_dt = "master_dt";
	private static final MCPermColumnInfo _master_dt = createColumnInfo("master_dt");
	public final MCDatePermColumn master_dt = createDateColumn(_master_dt);
	
	/**
	 * 承認機能区分. Approval function type.<p>
	 *
	 */
	public static final String $aprv_func_typ = "aprv_func_typ";
	private static final MCPermColumnInfo _aprv_func_typ = createColumnInfo("aprv_func_typ");
	public final MCStringPermColumn aprv_func_typ = createStringColumn(_aprv_func_typ);
	
	/**
	 * 承認ルートパタン. Approval route pattern.<p>
	 *
	 */
	public static final String $aprv_rt_ptn = "aprv_rt_ptn";
	private static final MCPermColumnInfo _aprv_rt_ptn = createColumnInfo("aprv_rt_ptn");
	public final MCStringPermColumn aprv_rt_ptn = createStringColumn(_aprv_rt_ptn);
	
	/**
	 * 承認作成元品目ＣＤ. Approval creating source item cd..<p>
	 *
	 */
	public static final String $src_itm_cd = "src_itm_cd";
	private static final MCPermColumnInfo _src_itm_cd = createColumnInfo("src_itm_cd");
	public final MCStringPermColumn src_itm_cd = createStringColumn(_src_itm_cd);
	
	/**
	 * 承認作成元枝番１. Approval creating source branch No. 1.<p>
	 *
	 */
	public static final String $src_itm_sub1 = "src_itm_sub1";
	private static final MCPermColumnInfo _src_itm_sub1 = createColumnInfo("src_itm_sub1");
	public final MCStringPermColumn src_itm_sub1 = createStringColumn(_src_itm_sub1);
	
	/**
	 * 承認作成元枝番２. Approval creating source branch No. 2.<p>
	 *
	 */
	public static final String $src_itm_sub2 = "src_itm_sub2";
	private static final MCPermColumnInfo _src_itm_sub2 = createColumnInfo("src_itm_sub2");
	public final MCStringPermColumn src_itm_sub2 = createStringColumn(_src_itm_sub2);
	
	/**
	 * 承認作成元枝番３. Approval creating source branch No. 3.<p>
	 *
	 */
	public static final String $src_itm_sub3 = "src_itm_sub3";
	private static final MCPermColumnInfo _src_itm_sub3 = createColumnInfo("src_itm_sub3");
	public final MCStringPermColumn src_itm_sub3 = createStringColumn(_src_itm_sub3);
	
	/**
	 * 承認作成元部門ＣＤ. Approval creating source dept. cd..<p>
	 *
	 */
	public static final String $src_dpt_cd = "src_dpt_cd";
	private static final MCPermColumnInfo _src_dpt_cd = createColumnInfo("src_dpt_cd");
	public final MCStringPermColumn src_dpt_cd = createStringColumn(_src_dpt_cd);
	
	/**
	 * 承認作成元取引先ＣＤ. Approval creating source customer cd..<p>
	 *
	 */
	public static final String $src_bp_cd = "src_bp_cd";
	private static final MCPermColumnInfo _src_bp_cd = createColumnInfo("src_bp_cd");
	public final MCStringPermColumn src_bp_cd = createStringColumn(_src_bp_cd);
	
	/**
	 * 承認作成元通貨ＣＤ１. Approval creating source base currency cd. 1.<p>
	 *
	 */
	public static final String $src_cur_cd1 = "src_cur_cd1";
	private static final MCPermColumnInfo _src_cur_cd1 = createColumnInfo("src_cur_cd1");
	public final MCStringPermColumn src_cur_cd1 = createStringColumn(_src_cur_cd1);
	
	/**
	 * 承認作成元通貨ＣＤ２. Approval creating source base currency cd. 2.<p>
	 *
	 */
	public static final String $src_cur_cd2 = "src_cur_cd2";
	private static final MCPermColumnInfo _src_cur_cd2 = createColumnInfo("src_cur_cd2");
	public final MCStringPermColumn src_cur_cd2 = createStringColumn(_src_cur_cd2);
	
	/**
	 * 承認作成元通貨ＣＤ３. Approval creating source base currency cd. 3.<p>
	 *
	 */
	public static final String $src_cur_cd3 = "src_cur_cd3";
	private static final MCPermColumnInfo _src_cur_cd3 = createColumnInfo("src_cur_cd3");
	public final MCStringPermColumn src_cur_cd3 = createStringColumn(_src_cur_cd3);
	
	/**
	 * 承認作成元拡張項目１. Approval creating source extended column 1.<p>
	 *
	 */
	public static final String $src_ext_key1 = "src_ext_key1";
	private static final MCPermColumnInfo _src_ext_key1 = createColumnInfo("src_ext_key1");
	public final MCStringPermColumn src_ext_key1 = createStringColumn(_src_ext_key1);
	
	/**
	 * 承認作成元拡張項目２. Approval creating source extended column 2.<p>
	 *
	 */
	public static final String $src_ext_key2 = "src_ext_key2";
	private static final MCPermColumnInfo _src_ext_key2 = createColumnInfo("src_ext_key2");
	public final MCStringPermColumn src_ext_key2 = createStringColumn(_src_ext_key2);
	
	/**
	 * 承認作成元拡張項目３. Approval created-from expanded column 3.<p>
	 *
	 */
	public static final String $src_ext_key3 = "src_ext_key3";
	private static final MCPermColumnInfo _src_ext_key3 = createColumnInfo("src_ext_key3");
	public final MCStringPermColumn src_ext_key3 = createStringColumn(_src_ext_key3);
	
	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta master_dt_META = createCommonMeta($master_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta aprv_func_typ_META = createCommonMeta($aprv_func_typ, mcframe.commonMA.meta.MA_META.APRV_FUNC_TYP);
	public static final MCMeta aprv_rt_ptn_META = createCommonMeta($aprv_rt_ptn, mcframe.commonMA.meta.MA_META.APRV_RT_PTN);
	public static final MCMeta src_itm_cd_META = createCommonMeta($src_itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta src_itm_sub1_META = createCommonMeta($src_itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta src_itm_sub2_META = createCommonMeta($src_itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta src_itm_sub3_META = createCommonMeta($src_itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta src_dpt_cd_META = createCommonMeta($src_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta src_bp_cd_META = createCommonMeta($src_bp_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta src_cur_cd1_META = createCommonMeta($src_cur_cd1, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta src_cur_cd2_META = createCommonMeta($src_cur_cd2, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta src_cur_cd3_META = createCommonMeta($src_cur_cd3, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta src_ext_key1_META = createCommonMeta($src_ext_key1, mcframe.commonMA.meta.MA_META.APRV_EXT_KEY1);
	public static final MCMeta src_ext_key2_META = createCommonMeta($src_ext_key2, mcframe.commonMA.meta.MA_META.APRV_EXT_KEY2);
	public static final MCMeta src_ext_key3_META = createCommonMeta($src_ext_key3, mcframe.commonMA.meta.MA_META.APRV_EXT_KEY3);

	protected static final List<MCForeignInfo> FOREIGN_INFO_LIST = new ArrayList<>();
	static {
	}
	
	protected static final ConstMetaList<MBW_APRV_R> constMetas = new ConstMetaList<MBW_APRV_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			peg_no_META,
			master_dt_META,
			aprv_func_typ_META,
			aprv_rt_ptn_META,
			src_itm_cd_META,
			src_itm_sub1_META,
			src_itm_sub2_META,
			src_itm_sub3_META,
			src_dpt_cd_META,
			src_bp_cd_META,
			src_cur_cd1_META,
			src_cur_cd2_META,
			src_cur_cd3_META,
			src_ext_key1_META,
			src_ext_key2_META,
			src_ext_key3_META
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
	protected MBW_APRV_R(ConstMetaList<? extends MBW_APRV_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MBW_APRV_R(ConstMetaList<? extends MBW_APRV_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MBW_APRV_R.$peg_no,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MBW_APRV_R.$peg_no,
				"peg_no",
				peg_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBW_APRV_R.$master_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MBW_APRV_R.$master_dt,
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
		COLUMN_MAP.put(
			MBW_APRV_R.$aprv_func_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBW_APRV_R.$aprv_func_typ,
				"aprv_func_typ",
				aprv_func_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBW_APRV_R.$aprv_rt_ptn,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBW_APRV_R.$aprv_rt_ptn,
				"aprv_rt_ptn",
				aprv_rt_ptn,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBW_APRV_R.$src_itm_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBW_APRV_R.$src_itm_cd,
				"src_itm_cd",
				src_itm_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBW_APRV_R.$src_itm_sub1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBW_APRV_R.$src_itm_sub1,
				"src_itm_sub1",
				src_itm_sub1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBW_APRV_R.$src_itm_sub2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBW_APRV_R.$src_itm_sub2,
				"src_itm_sub2",
				src_itm_sub2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBW_APRV_R.$src_itm_sub3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBW_APRV_R.$src_itm_sub3,
				"src_itm_sub3",
				src_itm_sub3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBW_APRV_R.$src_dpt_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBW_APRV_R.$src_dpt_cd,
				"src_dpt_cd",
				src_dpt_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBW_APRV_R.$src_bp_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBW_APRV_R.$src_bp_cd,
				"src_bp_cd",
				src_bp_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBW_APRV_R.$src_cur_cd1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBW_APRV_R.$src_cur_cd1,
				"src_cur_cd1",
				src_cur_cd1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBW_APRV_R.$src_cur_cd2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBW_APRV_R.$src_cur_cd2,
				"src_cur_cd2",
				src_cur_cd2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBW_APRV_R.$src_cur_cd3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBW_APRV_R.$src_cur_cd3,
				"src_cur_cd3",
				src_cur_cd3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBW_APRV_R.$src_ext_key1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBW_APRV_R.$src_ext_key1,
				"src_ext_key1",
				src_ext_key1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBW_APRV_R.$src_ext_key2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBW_APRV_R.$src_ext_key2,
				"src_ext_key2",
				src_ext_key2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MBW_APRV_R.$src_ext_key3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MBW_APRV_R.$src_ext_key3,
				"src_ext_key3",
				src_ext_key3,
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
	public static MBW_APRV_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MBW_APRV_R create(String alias) {
		MBW_APRV_R row = new MBW_APRV_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MBW_APRV_R createByName(T proto) {
		MBW_APRV_R row = MBW_APRV_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MBW_APRV_R clone() {
		return (MBW_APRV_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MBW_APRV_R createInstance() {
		return (MBW_APRV_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MBW_APRV_R getValues(String... names) {
		return (MBW_APRV_R) super.getValues(names);
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
	 * 紐付けＮＯ. Pegging No..<p>
	 *
	 */
	public MCNumber peg_no() {
		return getConstNumber(offset + 0, $peg_no);
	}

	/**
	 * 紐付けＮＯ. Pegging No..<p>
	 *
	 */
	public void peg_no(MCNumber value) {
		setConstNumber(offset + 0, $peg_no, value);
	}
	
	/**
	 * 紐付けＮＯ. Pegging No..<p>
	 *
	 */
	public void peg_no(int value) {
		setConstNumber(offset + 0, $peg_no, value);
	}
	
	/**
	 * 紐付けＮＯ. Pegging No..<p>
	 *
	 */
	public void peg_no(long value) {
		setConstNumber(offset + 0, $peg_no, value);
	}
	
	/**
	 * 紐付けＮＯ. Pegging No..<p>
	 *
	 */
	public void peg_no(float value) {
		setConstNumber(offset + 0, $peg_no, value);
	}
	
	/**
	 * 紐付けＮＯ. Pegging No..<p>
	 *
	 */
	public void peg_no(double value) {
		setConstNumber(offset + 0, $peg_no, value);
	}
	
	/**
	 * 承認マスタ適用日. Approval master application date.<p>
	 *
	 */
	public MCDate master_dt() {
		return getConstDate(offset + 1, $master_dt);
	}

	/**
	 * 承認マスタ適用日. Approval master application date.<p>
	 *
	 */
	public void master_dt(MCDate value) {
		setConstDate(offset + 1, $master_dt, value);
	}

	/**
	 * 承認機能区分. Approval function type.<p>
	 *
	 */
	public String aprv_func_typ() {
		return getConstString(offset + 2, $aprv_func_typ);
	}

	/**
	 * 承認機能区分. Approval function type.<p>
	 *
	 */
	public void aprv_func_typ(String value) {
		setConstString(offset + 2, $aprv_func_typ, value);
	}

	/**
	 * 承認ルートパタン. Approval route pattern.<p>
	 *
	 */
	public String aprv_rt_ptn() {
		return getConstString(offset + 3, $aprv_rt_ptn);
	}

	/**
	 * 承認ルートパタン. Approval route pattern.<p>
	 *
	 */
	public void aprv_rt_ptn(String value) {
		setConstString(offset + 3, $aprv_rt_ptn, value);
	}

	/**
	 * 承認作成元品目ＣＤ. Approval creating source item cd..<p>
	 *
	 */
	public String src_itm_cd() {
		return getConstString(offset + 4, $src_itm_cd);
	}

	/**
	 * 承認作成元品目ＣＤ. Approval creating source item cd..<p>
	 *
	 */
	public void src_itm_cd(String value) {
		setConstString(offset + 4, $src_itm_cd, value);
	}

	/**
	 * 承認作成元枝番１. Approval creating source branch No. 1.<p>
	 *
	 */
	public String src_itm_sub1() {
		return getConstString(offset + 5, $src_itm_sub1);
	}

	/**
	 * 承認作成元枝番１. Approval creating source branch No. 1.<p>
	 *
	 */
	public void src_itm_sub1(String value) {
		setConstString(offset + 5, $src_itm_sub1, value);
	}

	/**
	 * 承認作成元枝番２. Approval creating source branch No. 2.<p>
	 *
	 */
	public String src_itm_sub2() {
		return getConstString(offset + 6, $src_itm_sub2);
	}

	/**
	 * 承認作成元枝番２. Approval creating source branch No. 2.<p>
	 *
	 */
	public void src_itm_sub2(String value) {
		setConstString(offset + 6, $src_itm_sub2, value);
	}

	/**
	 * 承認作成元枝番３. Approval creating source branch No. 3.<p>
	 *
	 */
	public String src_itm_sub3() {
		return getConstString(offset + 7, $src_itm_sub3);
	}

	/**
	 * 承認作成元枝番３. Approval creating source branch No. 3.<p>
	 *
	 */
	public void src_itm_sub3(String value) {
		setConstString(offset + 7, $src_itm_sub3, value);
	}

	/**
	 * 承認作成元部門ＣＤ. Approval creating source dept. cd..<p>
	 *
	 */
	public String src_dpt_cd() {
		return getConstString(offset + 8, $src_dpt_cd);
	}

	/**
	 * 承認作成元部門ＣＤ. Approval creating source dept. cd..<p>
	 *
	 */
	public void src_dpt_cd(String value) {
		setConstString(offset + 8, $src_dpt_cd, value);
	}

	/**
	 * 承認作成元取引先ＣＤ. Approval creating source customer cd..<p>
	 *
	 */
	public String src_bp_cd() {
		return getConstString(offset + 9, $src_bp_cd);
	}

	/**
	 * 承認作成元取引先ＣＤ. Approval creating source customer cd..<p>
	 *
	 */
	public void src_bp_cd(String value) {
		setConstString(offset + 9, $src_bp_cd, value);
	}

	/**
	 * 承認作成元通貨ＣＤ１. Approval creating source base currency cd. 1.<p>
	 *
	 */
	public String src_cur_cd1() {
		return getConstString(offset + 10, $src_cur_cd1);
	}

	/**
	 * 承認作成元通貨ＣＤ１. Approval creating source base currency cd. 1.<p>
	 *
	 */
	public void src_cur_cd1(String value) {
		setConstString(offset + 10, $src_cur_cd1, value);
	}

	/**
	 * 承認作成元通貨ＣＤ２. Approval creating source base currency cd. 2.<p>
	 *
	 */
	public String src_cur_cd2() {
		return getConstString(offset + 11, $src_cur_cd2);
	}

	/**
	 * 承認作成元通貨ＣＤ２. Approval creating source base currency cd. 2.<p>
	 *
	 */
	public void src_cur_cd2(String value) {
		setConstString(offset + 11, $src_cur_cd2, value);
	}

	/**
	 * 承認作成元通貨ＣＤ３. Approval creating source base currency cd. 3.<p>
	 *
	 */
	public String src_cur_cd3() {
		return getConstString(offset + 12, $src_cur_cd3);
	}

	/**
	 * 承認作成元通貨ＣＤ３. Approval creating source base currency cd. 3.<p>
	 *
	 */
	public void src_cur_cd3(String value) {
		setConstString(offset + 12, $src_cur_cd3, value);
	}

	/**
	 * 承認作成元拡張項目１. Approval creating source extended column 1.<p>
	 *
	 */
	public String src_ext_key1() {
		return getConstString(offset + 13, $src_ext_key1);
	}

	/**
	 * 承認作成元拡張項目１. Approval creating source extended column 1.<p>
	 *
	 */
	public void src_ext_key1(String value) {
		setConstString(offset + 13, $src_ext_key1, value);
	}

	/**
	 * 承認作成元拡張項目２. Approval creating source extended column 2.<p>
	 *
	 */
	public String src_ext_key2() {
		return getConstString(offset + 14, $src_ext_key2);
	}

	/**
	 * 承認作成元拡張項目２. Approval creating source extended column 2.<p>
	 *
	 */
	public void src_ext_key2(String value) {
		setConstString(offset + 14, $src_ext_key2, value);
	}

	/**
	 * 承認作成元拡張項目３. Approval created-from expanded column 3.<p>
	 *
	 */
	public String src_ext_key3() {
		return getConstString(offset + 15, $src_ext_key3);
	}

	/**
	 * 承認作成元拡張項目３. Approval created-from expanded column 3.<p>
	 *
	 */
	public void src_ext_key3(String value) {
		setConstString(offset + 15, $src_ext_key3, value);
	}

	public String getString(String name) {
		if ($aprv_func_typ.equalsIgnoreCase(name)) {
			return aprv_func_typ();
		}
		if ($aprv_rt_ptn.equalsIgnoreCase(name)) {
			return aprv_rt_ptn();
		}
		if ($src_itm_cd.equalsIgnoreCase(name)) {
			return src_itm_cd();
		}
		if ($src_itm_sub1.equalsIgnoreCase(name)) {
			return src_itm_sub1();
		}
		if ($src_itm_sub2.equalsIgnoreCase(name)) {
			return src_itm_sub2();
		}
		if ($src_itm_sub3.equalsIgnoreCase(name)) {
			return src_itm_sub3();
		}
		if ($src_dpt_cd.equalsIgnoreCase(name)) {
			return src_dpt_cd();
		}
		if ($src_bp_cd.equalsIgnoreCase(name)) {
			return src_bp_cd();
		}
		if ($src_cur_cd1.equalsIgnoreCase(name)) {
			return src_cur_cd1();
		}
		if ($src_cur_cd2.equalsIgnoreCase(name)) {
			return src_cur_cd2();
		}
		if ($src_cur_cd3.equalsIgnoreCase(name)) {
			return src_cur_cd3();
		}
		if ($src_ext_key1.equalsIgnoreCase(name)) {
			return src_ext_key1();
		}
		if ($src_ext_key2.equalsIgnoreCase(name)) {
			return src_ext_key2();
		}
		if ($src_ext_key3.equalsIgnoreCase(name)) {
			return src_ext_key3();
		}
		return super.getString(name);
	}

	public MCNumber getNumber(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		return super.getNumber(name);
	}

	public MCDate getDate(String name) {
		if ($master_dt.equalsIgnoreCase(name)) {
			return master_dt();
		}
		return super.getDate(name);
	}

	public String getStringNE(String name) {
		if ($aprv_func_typ.equalsIgnoreCase(name)) {
			return aprv_func_typ();
		}
		if ($aprv_rt_ptn.equalsIgnoreCase(name)) {
			return aprv_rt_ptn();
		}
		if ($src_itm_cd.equalsIgnoreCase(name)) {
			return src_itm_cd();
		}
		if ($src_itm_sub1.equalsIgnoreCase(name)) {
			return src_itm_sub1();
		}
		if ($src_itm_sub2.equalsIgnoreCase(name)) {
			return src_itm_sub2();
		}
		if ($src_itm_sub3.equalsIgnoreCase(name)) {
			return src_itm_sub3();
		}
		if ($src_dpt_cd.equalsIgnoreCase(name)) {
			return src_dpt_cd();
		}
		if ($src_bp_cd.equalsIgnoreCase(name)) {
			return src_bp_cd();
		}
		if ($src_cur_cd1.equalsIgnoreCase(name)) {
			return src_cur_cd1();
		}
		if ($src_cur_cd2.equalsIgnoreCase(name)) {
			return src_cur_cd2();
		}
		if ($src_cur_cd3.equalsIgnoreCase(name)) {
			return src_cur_cd3();
		}
		if ($src_ext_key1.equalsIgnoreCase(name)) {
			return src_ext_key1();
		}
		if ($src_ext_key2.equalsIgnoreCase(name)) {
			return src_ext_key2();
		}
		if ($src_ext_key3.equalsIgnoreCase(name)) {
			return src_ext_key3();
		}
		return super.getStringNE(name);
	}

	public MCNumber getNumberNE(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		return super.getNumberNE(name);
	}

	public MCDate getDateNE(String name) {
		if ($master_dt.equalsIgnoreCase(name)) {
			return master_dt();
		}
		return super.getDateNE(name);
	}

	public void setString(String name, String value) {
		if ($aprv_func_typ.equalsIgnoreCase(name)) {
			aprv_func_typ(value);
			return;
		}
		if ($aprv_rt_ptn.equalsIgnoreCase(name)) {
			aprv_rt_ptn(value);
			return;
		}
		if ($src_itm_cd.equalsIgnoreCase(name)) {
			src_itm_cd(value);
			return;
		}
		if ($src_itm_sub1.equalsIgnoreCase(name)) {
			src_itm_sub1(value);
			return;
		}
		if ($src_itm_sub2.equalsIgnoreCase(name)) {
			src_itm_sub2(value);
			return;
		}
		if ($src_itm_sub3.equalsIgnoreCase(name)) {
			src_itm_sub3(value);
			return;
		}
		if ($src_dpt_cd.equalsIgnoreCase(name)) {
			src_dpt_cd(value);
			return;
		}
		if ($src_bp_cd.equalsIgnoreCase(name)) {
			src_bp_cd(value);
			return;
		}
		if ($src_cur_cd1.equalsIgnoreCase(name)) {
			src_cur_cd1(value);
			return;
		}
		if ($src_cur_cd2.equalsIgnoreCase(name)) {
			src_cur_cd2(value);
			return;
		}
		if ($src_cur_cd3.equalsIgnoreCase(name)) {
			src_cur_cd3(value);
			return;
		}
		if ($src_ext_key1.equalsIgnoreCase(name)) {
			src_ext_key1(value);
			return;
		}
		if ($src_ext_key2.equalsIgnoreCase(name)) {
			src_ext_key2(value);
			return;
		}
		if ($src_ext_key3.equalsIgnoreCase(name)) {
			src_ext_key3(value);
			return;
		}
		super.setString(name, value);
	}

	public void setNumber(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setDate(String name, MCDate value) {
		if ($master_dt.equalsIgnoreCase(name)) {
			master_dt(value);
			return;
		}
		super.setDate(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($aprv_func_typ.equalsIgnoreCase(name)) {
			aprv_func_typ(value);
			return;
		}
		if ($aprv_rt_ptn.equalsIgnoreCase(name)) {
			aprv_rt_ptn(value);
			return;
		}
		if ($src_itm_cd.equalsIgnoreCase(name)) {
			src_itm_cd(value);
			return;
		}
		if ($src_itm_sub1.equalsIgnoreCase(name)) {
			src_itm_sub1(value);
			return;
		}
		if ($src_itm_sub2.equalsIgnoreCase(name)) {
			src_itm_sub2(value);
			return;
		}
		if ($src_itm_sub3.equalsIgnoreCase(name)) {
			src_itm_sub3(value);
			return;
		}
		if ($src_dpt_cd.equalsIgnoreCase(name)) {
			src_dpt_cd(value);
			return;
		}
		if ($src_bp_cd.equalsIgnoreCase(name)) {
			src_bp_cd(value);
			return;
		}
		if ($src_cur_cd1.equalsIgnoreCase(name)) {
			src_cur_cd1(value);
			return;
		}
		if ($src_cur_cd2.equalsIgnoreCase(name)) {
			src_cur_cd2(value);
			return;
		}
		if ($src_cur_cd3.equalsIgnoreCase(name)) {
			src_cur_cd3(value);
			return;
		}
		if ($src_ext_key1.equalsIgnoreCase(name)) {
			src_ext_key1(value);
			return;
		}
		if ($src_ext_key2.equalsIgnoreCase(name)) {
			src_ext_key2(value);
			return;
		}
		if ($src_ext_key3.equalsIgnoreCase(name)) {
			src_ext_key3(value);
			return;
		}
		super.setStringNE(name, value);
	}

	public void setNumberNE(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setDateNE(String name, MCDate value) {
		if ($master_dt.equalsIgnoreCase(name)) {
			master_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}

}
