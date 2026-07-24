package mcframe.serverMG.dbc;

import static mcframe.serverCore.queryapi.IFMCSQL.*;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import mcframe.commonCore.container.MCExtMap;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.lang.MCNumber;
import mcframe.serverCore.queryapi.IFMCSQL.MCStringPermColumn;
import mcframe.serverCore.queryapi.IFMCSQL.MCNumberPermColumn;
import mcframe.commonCore.meta.MCMeta;
import mcframe.commonCore.lang.MCDataType;
import mcframe.serverCore.queryapi.MCDBContainer;
import mcframe.serverCore.queryapi.MCDBContainer.MCTableType;
import mcframe.serverCore.queryapi.IFMCSQL.MCPermColumn;
import mcframe.serverCore.queryapi.IFMCSQL.MCPermColumnInfo;
import mcframe.serverCore.queryapi.MCForeignInfo;

/**
 * "原価計算品目工数ビュー // Cost calculation item man-hour view"DBコンテナRowクラスです。<p>
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
 *  	<td>itm_cd</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>品目ＣＤ</td>
 *  	<td>Item cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>itm_sub1</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>枝番１</td>
 *  	<td>Branch No. 1</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>K</td>
 *  	<td>itm_sub2</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>枝番２</td>
 *  	<td>Branch No. 2</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>itm_sub3</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>枝番３</td>
 *  	<td>Branch No. 3</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>K</td>
 *  	<td>loc_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>場所ＣＤ</td>
 *  	<td>Location cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>oper_ptn</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>工程パタン</td>
 *  	<td>Operation pattern</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>K</td>
 *  	<td>oper_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>工程ＣＤ</td>
 *  	<td>Operation cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>oper_seq</td>
 *  	<td>N</td>
 *  	<td>9,0</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>工程連番</td>
 *  	<td>Operation sequence number</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>K</td>
 *  	<td>wk_cost_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>工数管理ＣＤ</td>
 *  	<td>Work element cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>wg_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>ワーキンググループＣＤ</td>
 *  	<td>WG cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>base_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>基準数量</td>
 *  	<td>Base qty.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>fxd_wk_cost</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>工数（固定）</td>
 *  	<td>Man-hour (Constant)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>wk_cost</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>工数（数量依存）</td>
 *  	<td>Man-hour (Qty.-dependent)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>min_wk_cost</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>最小工数</td>
 *  	<td>Min. Man-hour</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>batch_wk_cost</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>刻み工数</td>
 *  	<td>Increments of man-hour</td>
 *  </tr>
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
public class MGVM_ITM_WK_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.VIEW;

	public static final String TABLE_NAME = "MGVM_ITM_WK";

	public static final boolean EX_CTRL = false;
	
	public static final boolean LCL_TABLE = false;
	
	/**
	 * 品目ＣＤ. Item cd..<p>
	 *
	 */
	public static final String $itm_cd = "itm_cd";
	private static final MCPermColumnInfo _itm_cd = createColumnInfo("itm_cd");
	public final MCStringPermColumn itm_cd = createStringColumn(_itm_cd);
	
	/**
	 * 枝番１. Branch No. 1.<p>
	 *
	 */
	public static final String $itm_sub1 = "itm_sub1";
	private static final MCPermColumnInfo _itm_sub1 = createColumnInfo("itm_sub1");
	public final MCStringPermColumn itm_sub1 = createStringColumn(_itm_sub1);
	
	/**
	 * 枝番２. Branch No. 2.<p>
	 *
	 */
	public static final String $itm_sub2 = "itm_sub2";
	private static final MCPermColumnInfo _itm_sub2 = createColumnInfo("itm_sub2");
	public final MCStringPermColumn itm_sub2 = createStringColumn(_itm_sub2);
	
	/**
	 * 枝番３. Branch No. 3.<p>
	 *
	 */
	public static final String $itm_sub3 = "itm_sub3";
	private static final MCPermColumnInfo _itm_sub3 = createColumnInfo("itm_sub3");
	public final MCStringPermColumn itm_sub3 = createStringColumn(_itm_sub3);
	
	/**
	 * 場所ＣＤ. Location cd..<p>
	 *
	 */
	public static final String $loc_cd = "loc_cd";
	private static final MCPermColumnInfo _loc_cd = createColumnInfo("loc_cd");
	public final MCStringPermColumn loc_cd = createStringColumn(_loc_cd);
	
	/**
	 * 工程パタン. Operation pattern.<p>
	 *
	 */
	public static final String $oper_ptn = "oper_ptn";
	private static final MCPermColumnInfo _oper_ptn = createColumnInfo("oper_ptn");
	public final MCStringPermColumn oper_ptn = createStringColumn(_oper_ptn);
	
	/**
	 * 工程ＣＤ. Operation cd..<p>
	 *
	 */
	public static final String $oper_cd = "oper_cd";
	private static final MCPermColumnInfo _oper_cd = createColumnInfo("oper_cd");
	public final MCStringPermColumn oper_cd = createStringColumn(_oper_cd);
	
	/**
	 * 工程連番. Operation sequence number.<p>
	 *
	 */
	public static final String $oper_seq = "oper_seq";
	private static final MCPermColumnInfo _oper_seq = createColumnInfo("oper_seq");
	public final MCNumberPermColumn oper_seq = createNumberColumn(_oper_seq);
	
	/**
	 * 工数管理ＣＤ. Work element cd..<p>
	 *
	 */
	public static final String $wk_cost_cd = "wk_cost_cd";
	private static final MCPermColumnInfo _wk_cost_cd = createColumnInfo("wk_cost_cd");
	public final MCStringPermColumn wk_cost_cd = createStringColumn(_wk_cost_cd);
	
	/**
	 * ワーキンググループＣＤ. WG cd..<p>
	 *
	 */
	public static final String $wg_cd = "wg_cd";
	private static final MCPermColumnInfo _wg_cd = createColumnInfo("wg_cd");
	public final MCStringPermColumn wg_cd = createStringColumn(_wg_cd);
	
	/**
	 * 基準数量. Base qty..<p>
	 *
	 */
	public static final String $base_qty = "base_qty";
	private static final MCPermColumnInfo _base_qty = createColumnInfo("base_qty");
	public final MCNumberPermColumn base_qty = createNumberColumn(_base_qty);
	
	/**
	 * 工数（固定）. Man-hour (Constant).<p>
	 *
	 */
	public static final String $fxd_wk_cost = "fxd_wk_cost";
	private static final MCPermColumnInfo _fxd_wk_cost = createColumnInfo("fxd_wk_cost");
	public final MCNumberPermColumn fxd_wk_cost = createNumberColumn(_fxd_wk_cost);
	
	/**
	 * 工数（数量依存）. Man-hour (Qty.-dependent).<p>
	 *
	 */
	public static final String $wk_cost = "wk_cost";
	private static final MCPermColumnInfo _wk_cost = createColumnInfo("wk_cost");
	public final MCNumberPermColumn wk_cost = createNumberColumn(_wk_cost);
	
	/**
	 * 最小工数. Min. Man-hour.<p>
	 *
	 */
	public static final String $min_wk_cost = "min_wk_cost";
	private static final MCPermColumnInfo _min_wk_cost = createColumnInfo("min_wk_cost");
	public final MCNumberPermColumn min_wk_cost = createNumberColumn(_min_wk_cost);
	
	/**
	 * 刻み工数. Increments of man-hour.<p>
	 *
	 */
	public static final String $batch_wk_cost = "batch_wk_cost";
	private static final MCPermColumnInfo _batch_wk_cost = createColumnInfo("batch_wk_cost");
	public final MCNumberPermColumn batch_wk_cost = createNumberColumn(_batch_wk_cost);
	
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta loc_cd_META = createCommonMeta($loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta oper_ptn_META = createCommonMeta($oper_ptn, mcframe.commonMA.meta.MA_META.OPER_PTN);
	public static final MCMeta oper_cd_META = createCommonMeta($oper_cd, mcframe.commonMA.meta.MA_META.OPER_CD);
	public static final MCMeta oper_seq_META = createCommonMeta($oper_seq, mcframe.commonMA.meta.MA_META.OPER_SEQ);
	public static final MCMeta wk_cost_cd_META = createCommonMeta($wk_cost_cd, mcframe.commonMA.meta.MA_META.WK_COST_CD);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta base_qty_META = createCommonMeta($base_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta fxd_wk_cost_META = createCommonMeta($fxd_wk_cost, mcframe.commonMA.meta.MA_META.WK_COST_QTY);
	public static final MCMeta wk_cost_META = createCommonMeta($wk_cost, mcframe.commonMA.meta.MA_META.WK_COST_QTY);
	public static final MCMeta min_wk_cost_META = createCommonMeta($min_wk_cost, mcframe.commonMA.meta.MA_META.WK_COST_QTY);
	public static final MCMeta batch_wk_cost_META = createCommonMeta($batch_wk_cost, mcframe.commonMA.meta.MA_META.WK_COST_QTY);

	protected static final List<MCForeignInfo> FOREIGN_INFO_LIST = new ArrayList<>();
	static {
	}
	
	protected static final ConstMetaList<MGVM_ITM_WK_R> constMetas = new ConstMetaList<MGVM_ITM_WK_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			loc_cd_META,
			oper_ptn_META,
			oper_cd_META,
			oper_seq_META,
			wk_cost_cd_META,
			wg_cd_META,
			base_qty_META,
			fxd_wk_cost_META,
			wk_cost_META,
			min_wk_cost_META,
			batch_wk_cost_META
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
	protected MGVM_ITM_WK_R(ConstMetaList<? extends MGVM_ITM_WK_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MGVM_ITM_WK_R(ConstMetaList<? extends MGVM_ITM_WK_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MGVM_ITM_WK_R.$itm_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVM_ITM_WK_R.$itm_cd,
				"itm_cd",
				itm_cd,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVM_ITM_WK_R.$itm_sub1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVM_ITM_WK_R.$itm_sub1,
				"itm_sub1",
				itm_sub1,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVM_ITM_WK_R.$itm_sub2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVM_ITM_WK_R.$itm_sub2,
				"itm_sub2",
				itm_sub2,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVM_ITM_WK_R.$itm_sub3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVM_ITM_WK_R.$itm_sub3,
				"itm_sub3",
				itm_sub3,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVM_ITM_WK_R.$loc_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVM_ITM_WK_R.$loc_cd,
				"loc_cd",
				loc_cd,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVM_ITM_WK_R.$oper_ptn,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVM_ITM_WK_R.$oper_ptn,
				"oper_ptn",
				oper_ptn,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVM_ITM_WK_R.$oper_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVM_ITM_WK_R.$oper_cd,
				"oper_cd",
				oper_cd,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVM_ITM_WK_R.$oper_seq,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVM_ITM_WK_R.$oper_seq,
				"oper_seq",
				oper_seq,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVM_ITM_WK_R.$wk_cost_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVM_ITM_WK_R.$wk_cost_cd,
				"wk_cost_cd",
				wk_cost_cd,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVM_ITM_WK_R.$wg_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVM_ITM_WK_R.$wg_cd,
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
			MGVM_ITM_WK_R.$base_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVM_ITM_WK_R.$base_qty,
				"base_qty",
				base_qty,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVM_ITM_WK_R.$fxd_wk_cost,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVM_ITM_WK_R.$fxd_wk_cost,
				"fxd_wk_cost",
				fxd_wk_cost,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVM_ITM_WK_R.$wk_cost,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVM_ITM_WK_R.$wk_cost,
				"wk_cost",
				wk_cost,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVM_ITM_WK_R.$min_wk_cost,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVM_ITM_WK_R.$min_wk_cost,
				"min_wk_cost",
				min_wk_cost,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVM_ITM_WK_R.$batch_wk_cost,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVM_ITM_WK_R.$batch_wk_cost,
				"batch_wk_cost",
				batch_wk_cost,
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
	public static MGVM_ITM_WK_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MGVM_ITM_WK_R create(String alias) {
		MGVM_ITM_WK_R row = new MGVM_ITM_WK_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MGVM_ITM_WK_R createByName(T proto) {
		MGVM_ITM_WK_R row = MGVM_ITM_WK_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MGVM_ITM_WK_R clone() {
		return (MGVM_ITM_WK_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MGVM_ITM_WK_R createInstance() {
		return (MGVM_ITM_WK_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MGVM_ITM_WK_R getValues(String... names) {
		return (MGVM_ITM_WK_R) super.getValues(names);
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
	 * 品目ＣＤ. Item cd..<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 0, $itm_cd);
	}

	/**
	 * 品目ＣＤ. Item cd..<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 0, $itm_cd, value);
	}

	/**
	 * 枝番１. Branch No. 1.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 1, $itm_sub1);
	}

	/**
	 * 枝番１. Branch No. 1.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 1, $itm_sub1, value);
	}

	/**
	 * 枝番２. Branch No. 2.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 2, $itm_sub2);
	}

	/**
	 * 枝番２. Branch No. 2.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 2, $itm_sub2, value);
	}

	/**
	 * 枝番３. Branch No. 3.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 3, $itm_sub3);
	}

	/**
	 * 枝番３. Branch No. 3.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 3, $itm_sub3, value);
	}

	/**
	 * 場所ＣＤ. Location cd..<p>
	 *
	 */
	public String loc_cd() {
		return getConstString(offset + 4, $loc_cd);
	}

	/**
	 * 場所ＣＤ. Location cd..<p>
	 *
	 */
	public void loc_cd(String value) {
		setConstString(offset + 4, $loc_cd, value);
	}

	/**
	 * 工程パタン. Operation pattern.<p>
	 *
	 */
	public String oper_ptn() {
		return getConstString(offset + 5, $oper_ptn);
	}

	/**
	 * 工程パタン. Operation pattern.<p>
	 *
	 */
	public void oper_ptn(String value) {
		setConstString(offset + 5, $oper_ptn, value);
	}

	/**
	 * 工程ＣＤ. Operation cd..<p>
	 *
	 */
	public String oper_cd() {
		return getConstString(offset + 6, $oper_cd);
	}

	/**
	 * 工程ＣＤ. Operation cd..<p>
	 *
	 */
	public void oper_cd(String value) {
		setConstString(offset + 6, $oper_cd, value);
	}

	/**
	 * 工程連番. Operation sequence number.<p>
	 *
	 */
	public MCNumber oper_seq() {
		return getConstNumber(offset + 7, $oper_seq);
	}

	/**
	 * 工程連番. Operation sequence number.<p>
	 *
	 */
	public void oper_seq(MCNumber value) {
		setConstNumber(offset + 7, $oper_seq, value);
	}
	
	/**
	 * 工程連番. Operation sequence number.<p>
	 *
	 */
	public void oper_seq(int value) {
		setConstNumber(offset + 7, $oper_seq, value);
	}
	
	/**
	 * 工程連番. Operation sequence number.<p>
	 *
	 */
	public void oper_seq(long value) {
		setConstNumber(offset + 7, $oper_seq, value);
	}
	
	/**
	 * 工程連番. Operation sequence number.<p>
	 *
	 */
	public void oper_seq(float value) {
		setConstNumber(offset + 7, $oper_seq, value);
	}
	
	/**
	 * 工程連番. Operation sequence number.<p>
	 *
	 */
	public void oper_seq(double value) {
		setConstNumber(offset + 7, $oper_seq, value);
	}
	
	/**
	 * 工数管理ＣＤ. Work element cd..<p>
	 *
	 */
	public String wk_cost_cd() {
		return getConstString(offset + 8, $wk_cost_cd);
	}

	/**
	 * 工数管理ＣＤ. Work element cd..<p>
	 *
	 */
	public void wk_cost_cd(String value) {
		setConstString(offset + 8, $wk_cost_cd, value);
	}

	/**
	 * ワーキンググループＣＤ. WG cd..<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 9, $wg_cd);
	}

	/**
	 * ワーキンググループＣＤ. WG cd..<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 9, $wg_cd, value);
	}

	/**
	 * 基準数量. Base qty..<p>
	 *
	 */
	public MCNumber base_qty() {
		return getConstNumber(offset + 10, $base_qty);
	}

	/**
	 * 基準数量. Base qty..<p>
	 *
	 */
	public void base_qty(MCNumber value) {
		setConstNumber(offset + 10, $base_qty, value);
	}
	
	/**
	 * 基準数量. Base qty..<p>
	 *
	 */
	public void base_qty(int value) {
		setConstNumber(offset + 10, $base_qty, value);
	}
	
	/**
	 * 基準数量. Base qty..<p>
	 *
	 */
	public void base_qty(long value) {
		setConstNumber(offset + 10, $base_qty, value);
	}
	
	/**
	 * 基準数量. Base qty..<p>
	 *
	 */
	public void base_qty(float value) {
		setConstNumber(offset + 10, $base_qty, value);
	}
	
	/**
	 * 基準数量. Base qty..<p>
	 *
	 */
	public void base_qty(double value) {
		setConstNumber(offset + 10, $base_qty, value);
	}
	
	/**
	 * 工数（固定）. Man-hour (Constant).<p>
	 *
	 */
	public MCNumber fxd_wk_cost() {
		return getConstNumber(offset + 11, $fxd_wk_cost);
	}

	/**
	 * 工数（固定）. Man-hour (Constant).<p>
	 *
	 */
	public void fxd_wk_cost(MCNumber value) {
		setConstNumber(offset + 11, $fxd_wk_cost, value);
	}
	
	/**
	 * 工数（固定）. Man-hour (Constant).<p>
	 *
	 */
	public void fxd_wk_cost(int value) {
		setConstNumber(offset + 11, $fxd_wk_cost, value);
	}
	
	/**
	 * 工数（固定）. Man-hour (Constant).<p>
	 *
	 */
	public void fxd_wk_cost(long value) {
		setConstNumber(offset + 11, $fxd_wk_cost, value);
	}
	
	/**
	 * 工数（固定）. Man-hour (Constant).<p>
	 *
	 */
	public void fxd_wk_cost(float value) {
		setConstNumber(offset + 11, $fxd_wk_cost, value);
	}
	
	/**
	 * 工数（固定）. Man-hour (Constant).<p>
	 *
	 */
	public void fxd_wk_cost(double value) {
		setConstNumber(offset + 11, $fxd_wk_cost, value);
	}
	
	/**
	 * 工数（数量依存）. Man-hour (Qty.-dependent).<p>
	 *
	 */
	public MCNumber wk_cost() {
		return getConstNumber(offset + 12, $wk_cost);
	}

	/**
	 * 工数（数量依存）. Man-hour (Qty.-dependent).<p>
	 *
	 */
	public void wk_cost(MCNumber value) {
		setConstNumber(offset + 12, $wk_cost, value);
	}
	
	/**
	 * 工数（数量依存）. Man-hour (Qty.-dependent).<p>
	 *
	 */
	public void wk_cost(int value) {
		setConstNumber(offset + 12, $wk_cost, value);
	}
	
	/**
	 * 工数（数量依存）. Man-hour (Qty.-dependent).<p>
	 *
	 */
	public void wk_cost(long value) {
		setConstNumber(offset + 12, $wk_cost, value);
	}
	
	/**
	 * 工数（数量依存）. Man-hour (Qty.-dependent).<p>
	 *
	 */
	public void wk_cost(float value) {
		setConstNumber(offset + 12, $wk_cost, value);
	}
	
	/**
	 * 工数（数量依存）. Man-hour (Qty.-dependent).<p>
	 *
	 */
	public void wk_cost(double value) {
		setConstNumber(offset + 12, $wk_cost, value);
	}
	
	/**
	 * 最小工数. Min. Man-hour.<p>
	 *
	 */
	public MCNumber min_wk_cost() {
		return getConstNumber(offset + 13, $min_wk_cost);
	}

	/**
	 * 最小工数. Min. Man-hour.<p>
	 *
	 */
	public void min_wk_cost(MCNumber value) {
		setConstNumber(offset + 13, $min_wk_cost, value);
	}
	
	/**
	 * 最小工数. Min. Man-hour.<p>
	 *
	 */
	public void min_wk_cost(int value) {
		setConstNumber(offset + 13, $min_wk_cost, value);
	}
	
	/**
	 * 最小工数. Min. Man-hour.<p>
	 *
	 */
	public void min_wk_cost(long value) {
		setConstNumber(offset + 13, $min_wk_cost, value);
	}
	
	/**
	 * 最小工数. Min. Man-hour.<p>
	 *
	 */
	public void min_wk_cost(float value) {
		setConstNumber(offset + 13, $min_wk_cost, value);
	}
	
	/**
	 * 最小工数. Min. Man-hour.<p>
	 *
	 */
	public void min_wk_cost(double value) {
		setConstNumber(offset + 13, $min_wk_cost, value);
	}
	
	/**
	 * 刻み工数. Increments of man-hour.<p>
	 *
	 */
	public MCNumber batch_wk_cost() {
		return getConstNumber(offset + 14, $batch_wk_cost);
	}

	/**
	 * 刻み工数. Increments of man-hour.<p>
	 *
	 */
	public void batch_wk_cost(MCNumber value) {
		setConstNumber(offset + 14, $batch_wk_cost, value);
	}
	
	/**
	 * 刻み工数. Increments of man-hour.<p>
	 *
	 */
	public void batch_wk_cost(int value) {
		setConstNumber(offset + 14, $batch_wk_cost, value);
	}
	
	/**
	 * 刻み工数. Increments of man-hour.<p>
	 *
	 */
	public void batch_wk_cost(long value) {
		setConstNumber(offset + 14, $batch_wk_cost, value);
	}
	
	/**
	 * 刻み工数. Increments of man-hour.<p>
	 *
	 */
	public void batch_wk_cost(float value) {
		setConstNumber(offset + 14, $batch_wk_cost, value);
	}
	
	/**
	 * 刻み工数. Increments of man-hour.<p>
	 *
	 */
	public void batch_wk_cost(double value) {
		setConstNumber(offset + 14, $batch_wk_cost, value);
	}
	
	public String getString(String name) {
		if ($itm_cd.equalsIgnoreCase(name)) {
			return itm_cd();
		}
		if ($itm_sub1.equalsIgnoreCase(name)) {
			return itm_sub1();
		}
		if ($itm_sub2.equalsIgnoreCase(name)) {
			return itm_sub2();
		}
		if ($itm_sub3.equalsIgnoreCase(name)) {
			return itm_sub3();
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			return loc_cd();
		}
		if ($oper_ptn.equalsIgnoreCase(name)) {
			return oper_ptn();
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			return oper_cd();
		}
		if ($wk_cost_cd.equalsIgnoreCase(name)) {
			return wk_cost_cd();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		return super.getString(name);
	}

	public MCNumber getNumber(String name) {
		if ($oper_seq.equalsIgnoreCase(name)) {
			return oper_seq();
		}
		if ($base_qty.equalsIgnoreCase(name)) {
			return base_qty();
		}
		if ($fxd_wk_cost.equalsIgnoreCase(name)) {
			return fxd_wk_cost();
		}
		if ($wk_cost.equalsIgnoreCase(name)) {
			return wk_cost();
		}
		if ($min_wk_cost.equalsIgnoreCase(name)) {
			return min_wk_cost();
		}
		if ($batch_wk_cost.equalsIgnoreCase(name)) {
			return batch_wk_cost();
		}
		return super.getNumber(name);
	}

	public String getStringNE(String name) {
		if ($itm_cd.equalsIgnoreCase(name)) {
			return itm_cd();
		}
		if ($itm_sub1.equalsIgnoreCase(name)) {
			return itm_sub1();
		}
		if ($itm_sub2.equalsIgnoreCase(name)) {
			return itm_sub2();
		}
		if ($itm_sub3.equalsIgnoreCase(name)) {
			return itm_sub3();
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			return loc_cd();
		}
		if ($oper_ptn.equalsIgnoreCase(name)) {
			return oper_ptn();
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			return oper_cd();
		}
		if ($wk_cost_cd.equalsIgnoreCase(name)) {
			return wk_cost_cd();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		return super.getStringNE(name);
	}

	public MCNumber getNumberNE(String name) {
		if ($oper_seq.equalsIgnoreCase(name)) {
			return oper_seq();
		}
		if ($base_qty.equalsIgnoreCase(name)) {
			return base_qty();
		}
		if ($fxd_wk_cost.equalsIgnoreCase(name)) {
			return fxd_wk_cost();
		}
		if ($wk_cost.equalsIgnoreCase(name)) {
			return wk_cost();
		}
		if ($min_wk_cost.equalsIgnoreCase(name)) {
			return min_wk_cost();
		}
		if ($batch_wk_cost.equalsIgnoreCase(name)) {
			return batch_wk_cost();
		}
		return super.getNumberNE(name);
	}

	public void setString(String name, String value) {
		if ($itm_cd.equalsIgnoreCase(name)) {
			itm_cd(value);
			return;
		}
		if ($itm_sub1.equalsIgnoreCase(name)) {
			itm_sub1(value);
			return;
		}
		if ($itm_sub2.equalsIgnoreCase(name)) {
			itm_sub2(value);
			return;
		}
		if ($itm_sub3.equalsIgnoreCase(name)) {
			itm_sub3(value);
			return;
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			loc_cd(value);
			return;
		}
		if ($oper_ptn.equalsIgnoreCase(name)) {
			oper_ptn(value);
			return;
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			oper_cd(value);
			return;
		}
		if ($wk_cost_cd.equalsIgnoreCase(name)) {
			wk_cost_cd(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		super.setString(name, value);
	}

	public void setNumber(String name, MCNumber value) {
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($base_qty.equalsIgnoreCase(name)) {
			base_qty(value);
			return;
		}
		if ($fxd_wk_cost.equalsIgnoreCase(name)) {
			fxd_wk_cost(value);
			return;
		}
		if ($wk_cost.equalsIgnoreCase(name)) {
			wk_cost(value);
			return;
		}
		if ($min_wk_cost.equalsIgnoreCase(name)) {
			min_wk_cost(value);
			return;
		}
		if ($batch_wk_cost.equalsIgnoreCase(name)) {
			batch_wk_cost(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, int value) {
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($base_qty.equalsIgnoreCase(name)) {
			base_qty(value);
			return;
		}
		if ($fxd_wk_cost.equalsIgnoreCase(name)) {
			fxd_wk_cost(value);
			return;
		}
		if ($wk_cost.equalsIgnoreCase(name)) {
			wk_cost(value);
			return;
		}
		if ($min_wk_cost.equalsIgnoreCase(name)) {
			min_wk_cost(value);
			return;
		}
		if ($batch_wk_cost.equalsIgnoreCase(name)) {
			batch_wk_cost(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, long value) {
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($base_qty.equalsIgnoreCase(name)) {
			base_qty(value);
			return;
		}
		if ($fxd_wk_cost.equalsIgnoreCase(name)) {
			fxd_wk_cost(value);
			return;
		}
		if ($wk_cost.equalsIgnoreCase(name)) {
			wk_cost(value);
			return;
		}
		if ($min_wk_cost.equalsIgnoreCase(name)) {
			min_wk_cost(value);
			return;
		}
		if ($batch_wk_cost.equalsIgnoreCase(name)) {
			batch_wk_cost(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, float value) {
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($base_qty.equalsIgnoreCase(name)) {
			base_qty(value);
			return;
		}
		if ($fxd_wk_cost.equalsIgnoreCase(name)) {
			fxd_wk_cost(value);
			return;
		}
		if ($wk_cost.equalsIgnoreCase(name)) {
			wk_cost(value);
			return;
		}
		if ($min_wk_cost.equalsIgnoreCase(name)) {
			min_wk_cost(value);
			return;
		}
		if ($batch_wk_cost.equalsIgnoreCase(name)) {
			batch_wk_cost(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, double value) {
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($base_qty.equalsIgnoreCase(name)) {
			base_qty(value);
			return;
		}
		if ($fxd_wk_cost.equalsIgnoreCase(name)) {
			fxd_wk_cost(value);
			return;
		}
		if ($wk_cost.equalsIgnoreCase(name)) {
			wk_cost(value);
			return;
		}
		if ($min_wk_cost.equalsIgnoreCase(name)) {
			min_wk_cost(value);
			return;
		}
		if ($batch_wk_cost.equalsIgnoreCase(name)) {
			batch_wk_cost(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($itm_cd.equalsIgnoreCase(name)) {
			itm_cd(value);
			return;
		}
		if ($itm_sub1.equalsIgnoreCase(name)) {
			itm_sub1(value);
			return;
		}
		if ($itm_sub2.equalsIgnoreCase(name)) {
			itm_sub2(value);
			return;
		}
		if ($itm_sub3.equalsIgnoreCase(name)) {
			itm_sub3(value);
			return;
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			loc_cd(value);
			return;
		}
		if ($oper_ptn.equalsIgnoreCase(name)) {
			oper_ptn(value);
			return;
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			oper_cd(value);
			return;
		}
		if ($wk_cost_cd.equalsIgnoreCase(name)) {
			wk_cost_cd(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		super.setStringNE(name, value);
	}

	public void setNumberNE(String name, MCNumber value) {
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($base_qty.equalsIgnoreCase(name)) {
			base_qty(value);
			return;
		}
		if ($fxd_wk_cost.equalsIgnoreCase(name)) {
			fxd_wk_cost(value);
			return;
		}
		if ($wk_cost.equalsIgnoreCase(name)) {
			wk_cost(value);
			return;
		}
		if ($min_wk_cost.equalsIgnoreCase(name)) {
			min_wk_cost(value);
			return;
		}
		if ($batch_wk_cost.equalsIgnoreCase(name)) {
			batch_wk_cost(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, int value) {
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($base_qty.equalsIgnoreCase(name)) {
			base_qty(value);
			return;
		}
		if ($fxd_wk_cost.equalsIgnoreCase(name)) {
			fxd_wk_cost(value);
			return;
		}
		if ($wk_cost.equalsIgnoreCase(name)) {
			wk_cost(value);
			return;
		}
		if ($min_wk_cost.equalsIgnoreCase(name)) {
			min_wk_cost(value);
			return;
		}
		if ($batch_wk_cost.equalsIgnoreCase(name)) {
			batch_wk_cost(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, long value) {
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($base_qty.equalsIgnoreCase(name)) {
			base_qty(value);
			return;
		}
		if ($fxd_wk_cost.equalsIgnoreCase(name)) {
			fxd_wk_cost(value);
			return;
		}
		if ($wk_cost.equalsIgnoreCase(name)) {
			wk_cost(value);
			return;
		}
		if ($min_wk_cost.equalsIgnoreCase(name)) {
			min_wk_cost(value);
			return;
		}
		if ($batch_wk_cost.equalsIgnoreCase(name)) {
			batch_wk_cost(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, float value) {
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($base_qty.equalsIgnoreCase(name)) {
			base_qty(value);
			return;
		}
		if ($fxd_wk_cost.equalsIgnoreCase(name)) {
			fxd_wk_cost(value);
			return;
		}
		if ($wk_cost.equalsIgnoreCase(name)) {
			wk_cost(value);
			return;
		}
		if ($min_wk_cost.equalsIgnoreCase(name)) {
			min_wk_cost(value);
			return;
		}
		if ($batch_wk_cost.equalsIgnoreCase(name)) {
			batch_wk_cost(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, double value) {
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($base_qty.equalsIgnoreCase(name)) {
			base_qty(value);
			return;
		}
		if ($fxd_wk_cost.equalsIgnoreCase(name)) {
			fxd_wk_cost(value);
			return;
		}
		if ($wk_cost.equalsIgnoreCase(name)) {
			wk_cost(value);
			return;
		}
		if ($min_wk_cost.equalsIgnoreCase(name)) {
			min_wk_cost(value);
			return;
		}
		if ($batch_wk_cost.equalsIgnoreCase(name)) {
			batch_wk_cost(value);
			return;
		}
		super.setNumberNE(name, value);
	}

}
