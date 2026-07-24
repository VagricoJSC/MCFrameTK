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
 * "ＭＲＰ用品目品管マスタ // Item inspection master for MRP"DBコンテナRowクラスです。<p>
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
 *  	<td>mfg_loc_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>製造場所ＣＤ</td>
 *  	<td>Mfg. location cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>sppl_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>発注先ＣＤ</td>
 *  	<td>Supplier cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>K</td>
 *  	<td>maker_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>メーカＣＤ</td>
 *  	<td>Maker cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>from_site_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>出荷元工場・物流倉庫ＣＤ</td>
 *  	<td>Shipping point factory/distribution warehouse cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>K</td>
 *  	<td>to_site_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>工場・物流倉庫ＣＤ</td>
 *  	<td>Factory/Distribution warehouse cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>insp_lt</td>
 *  	<td>N</td>
 *  	<td>9,0</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>検査ＬＴ</td>
 *  	<td>Inspection LT</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>insp_offst</td>
 *  	<td>N</td>
 *  	<td>9,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>検査オフセット</td>
 *  	<td>Inspection offset</td>
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
 *  	<td>wg_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>ワーキンググループＣＤ</td>
 *  	<td>WG cd.</td>
 *  </tr>
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
public class MSVM_MRP_ITM_INSP_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.VIEW;

	public static final String TABLE_NAME = "MSVM_MRP_ITM_INSP";

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
	 * 製造場所ＣＤ. Mfg. location cd..<p>
	 *
	 */
	public static final String $mfg_loc_cd = "mfg_loc_cd";
	private static final MCPermColumnInfo _mfg_loc_cd = createColumnInfo("mfg_loc_cd");
	public final MCStringPermColumn mfg_loc_cd = createStringColumn(_mfg_loc_cd);
	
	/**
	 * 発注先ＣＤ. Supplier cd..<p>
	 *
	 */
	public static final String $sppl_cd = "sppl_cd";
	private static final MCPermColumnInfo _sppl_cd = createColumnInfo("sppl_cd");
	public final MCStringPermColumn sppl_cd = createStringColumn(_sppl_cd);
	
	/**
	 * メーカＣＤ. Maker cd..<p>
	 *
	 */
	public static final String $maker_cd = "maker_cd";
	private static final MCPermColumnInfo _maker_cd = createColumnInfo("maker_cd");
	public final MCStringPermColumn maker_cd = createStringColumn(_maker_cd);
	
	/**
	 * 出荷元工場・物流倉庫ＣＤ. Shipping point factory/distribution warehouse cd..<p>
	 *
	 */
	public static final String $from_site_cd = "from_site_cd";
	private static final MCPermColumnInfo _from_site_cd = createColumnInfo("from_site_cd");
	public final MCStringPermColumn from_site_cd = createStringColumn(_from_site_cd);
	
	/**
	 * 工場・物流倉庫ＣＤ. Factory/Distribution warehouse cd..<p>
	 *
	 */
	public static final String $to_site_cd = "to_site_cd";
	private static final MCPermColumnInfo _to_site_cd = createColumnInfo("to_site_cd");
	public final MCStringPermColumn to_site_cd = createStringColumn(_to_site_cd);
	
	/**
	 * 検査ＬＴ. Inspection LT.<p>
	 *
	 */
	public static final String $insp_lt = "insp_lt";
	private static final MCPermColumnInfo _insp_lt = createColumnInfo("insp_lt");
	public final MCNumberPermColumn insp_lt = createNumberColumn(_insp_lt);
	
	/**
	 * 検査オフセット. Inspection offset.<p>
	 *
	 */
	public static final String $insp_offst = "insp_offst";
	private static final MCPermColumnInfo _insp_offst = createColumnInfo("insp_offst");
	public final MCNumberPermColumn insp_offst = createNumberColumn(_insp_offst);
	
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
	 * ワーキンググループＣＤ. WG cd..<p>
	 *
	 */
	public static final String $wg_cd = "wg_cd";
	private static final MCPermColumnInfo _wg_cd = createColumnInfo("wg_cd");
	public final MCStringPermColumn wg_cd = createStringColumn(_wg_cd);
	
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta mfg_loc_cd_META = createCommonMeta($mfg_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta sppl_cd_META = createCommonMeta($sppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta maker_cd_META = createCommonMeta($maker_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta from_site_cd_META = createCommonMeta($from_site_cd, mcframe.commonMA.meta.MA_META.SITE_CD);
	public static final MCMeta to_site_cd_META = createCommonMeta($to_site_cd, mcframe.commonMA.meta.MA_META.SITE_CD);
	public static final MCMeta insp_lt_META = createCommonMeta($insp_lt, mcframe.commonMA.meta.MA_META.LT);
	public static final MCMeta insp_offst_META = createCommonMeta($insp_offst, mcframe.commonMA.meta.MA_META.OFFST);
	public static final MCMeta st_dt_META = createCommonMeta($st_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta end_dt_META = createCommonMeta($end_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);

	protected static final List<MCForeignInfo> FOREIGN_INFO_LIST = new ArrayList<>();
	static {
	}
	
	protected static final ConstMetaList<MSVM_MRP_ITM_INSP_R> constMetas = new ConstMetaList<MSVM_MRP_ITM_INSP_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			mfg_loc_cd_META,
			sppl_cd_META,
			maker_cd_META,
			from_site_cd_META,
			to_site_cd_META,
			insp_lt_META,
			insp_offst_META,
			st_dt_META,
			end_dt_META,
			wg_cd_META
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
	protected MSVM_MRP_ITM_INSP_R(ConstMetaList<? extends MSVM_MRP_ITM_INSP_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MSVM_MRP_ITM_INSP_R(ConstMetaList<? extends MSVM_MRP_ITM_INSP_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MSVM_MRP_ITM_INSP_R.$itm_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVM_MRP_ITM_INSP_R.$itm_cd,
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
			MSVM_MRP_ITM_INSP_R.$itm_sub1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVM_MRP_ITM_INSP_R.$itm_sub1,
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
			MSVM_MRP_ITM_INSP_R.$itm_sub2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVM_MRP_ITM_INSP_R.$itm_sub2,
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
			MSVM_MRP_ITM_INSP_R.$itm_sub3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVM_MRP_ITM_INSP_R.$itm_sub3,
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
			MSVM_MRP_ITM_INSP_R.$mfg_loc_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVM_MRP_ITM_INSP_R.$mfg_loc_cd,
				"mfg_loc_cd",
				mfg_loc_cd,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVM_MRP_ITM_INSP_R.$sppl_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVM_MRP_ITM_INSP_R.$sppl_cd,
				"sppl_cd",
				sppl_cd,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVM_MRP_ITM_INSP_R.$maker_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVM_MRP_ITM_INSP_R.$maker_cd,
				"maker_cd",
				maker_cd,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVM_MRP_ITM_INSP_R.$from_site_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVM_MRP_ITM_INSP_R.$from_site_cd,
				"from_site_cd",
				from_site_cd,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVM_MRP_ITM_INSP_R.$to_site_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVM_MRP_ITM_INSP_R.$to_site_cd,
				"to_site_cd",
				to_site_cd,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVM_MRP_ITM_INSP_R.$insp_lt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MSVM_MRP_ITM_INSP_R.$insp_lt,
				"insp_lt",
				insp_lt,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVM_MRP_ITM_INSP_R.$insp_offst,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MSVM_MRP_ITM_INSP_R.$insp_offst,
				"insp_offst",
				insp_offst,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVM_MRP_ITM_INSP_R.$st_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MSVM_MRP_ITM_INSP_R.$st_dt,
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
			MSVM_MRP_ITM_INSP_R.$end_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MSVM_MRP_ITM_INSP_R.$end_dt,
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
			MSVM_MRP_ITM_INSP_R.$wg_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVM_MRP_ITM_INSP_R.$wg_cd,
				"wg_cd",
				wg_cd,
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
	public static MSVM_MRP_ITM_INSP_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MSVM_MRP_ITM_INSP_R create(String alias) {
		MSVM_MRP_ITM_INSP_R row = new MSVM_MRP_ITM_INSP_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MSVM_MRP_ITM_INSP_R createByName(T proto) {
		MSVM_MRP_ITM_INSP_R row = MSVM_MRP_ITM_INSP_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MSVM_MRP_ITM_INSP_R clone() {
		return (MSVM_MRP_ITM_INSP_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MSVM_MRP_ITM_INSP_R createInstance() {
		return (MSVM_MRP_ITM_INSP_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MSVM_MRP_ITM_INSP_R getValues(String... names) {
		return (MSVM_MRP_ITM_INSP_R) super.getValues(names);
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
	 * 製造場所ＣＤ. Mfg. location cd..<p>
	 *
	 */
	public String mfg_loc_cd() {
		return getConstString(offset + 4, $mfg_loc_cd);
	}

	/**
	 * 製造場所ＣＤ. Mfg. location cd..<p>
	 *
	 */
	public void mfg_loc_cd(String value) {
		setConstString(offset + 4, $mfg_loc_cd, value);
	}

	/**
	 * 発注先ＣＤ. Supplier cd..<p>
	 *
	 */
	public String sppl_cd() {
		return getConstString(offset + 5, $sppl_cd);
	}

	/**
	 * 発注先ＣＤ. Supplier cd..<p>
	 *
	 */
	public void sppl_cd(String value) {
		setConstString(offset + 5, $sppl_cd, value);
	}

	/**
	 * メーカＣＤ. Maker cd..<p>
	 *
	 */
	public String maker_cd() {
		return getConstString(offset + 6, $maker_cd);
	}

	/**
	 * メーカＣＤ. Maker cd..<p>
	 *
	 */
	public void maker_cd(String value) {
		setConstString(offset + 6, $maker_cd, value);
	}

	/**
	 * 出荷元工場・物流倉庫ＣＤ. Shipping point factory/distribution warehouse cd..<p>
	 *
	 */
	public String from_site_cd() {
		return getConstString(offset + 7, $from_site_cd);
	}

	/**
	 * 出荷元工場・物流倉庫ＣＤ. Shipping point factory/distribution warehouse cd..<p>
	 *
	 */
	public void from_site_cd(String value) {
		setConstString(offset + 7, $from_site_cd, value);
	}

	/**
	 * 工場・物流倉庫ＣＤ. Factory/Distribution warehouse cd..<p>
	 *
	 */
	public String to_site_cd() {
		return getConstString(offset + 8, $to_site_cd);
	}

	/**
	 * 工場・物流倉庫ＣＤ. Factory/Distribution warehouse cd..<p>
	 *
	 */
	public void to_site_cd(String value) {
		setConstString(offset + 8, $to_site_cd, value);
	}

	/**
	 * 検査ＬＴ. Inspection LT.<p>
	 *
	 */
	public MCNumber insp_lt() {
		return getConstNumber(offset + 9, $insp_lt);
	}

	/**
	 * 検査ＬＴ. Inspection LT.<p>
	 *
	 */
	public void insp_lt(MCNumber value) {
		setConstNumber(offset + 9, $insp_lt, value);
	}
	
	/**
	 * 検査ＬＴ. Inspection LT.<p>
	 *
	 */
	public void insp_lt(int value) {
		setConstNumber(offset + 9, $insp_lt, value);
	}
	
	/**
	 * 検査ＬＴ. Inspection LT.<p>
	 *
	 */
	public void insp_lt(long value) {
		setConstNumber(offset + 9, $insp_lt, value);
	}
	
	/**
	 * 検査ＬＴ. Inspection LT.<p>
	 *
	 */
	public void insp_lt(float value) {
		setConstNumber(offset + 9, $insp_lt, value);
	}
	
	/**
	 * 検査ＬＴ. Inspection LT.<p>
	 *
	 */
	public void insp_lt(double value) {
		setConstNumber(offset + 9, $insp_lt, value);
	}
	
	/**
	 * 検査オフセット. Inspection offset.<p>
	 *
	 */
	public MCNumber insp_offst() {
		return getConstNumber(offset + 10, $insp_offst);
	}

	/**
	 * 検査オフセット. Inspection offset.<p>
	 *
	 */
	public void insp_offst(MCNumber value) {
		setConstNumber(offset + 10, $insp_offst, value);
	}
	
	/**
	 * 検査オフセット. Inspection offset.<p>
	 *
	 */
	public void insp_offst(int value) {
		setConstNumber(offset + 10, $insp_offst, value);
	}
	
	/**
	 * 検査オフセット. Inspection offset.<p>
	 *
	 */
	public void insp_offst(long value) {
		setConstNumber(offset + 10, $insp_offst, value);
	}
	
	/**
	 * 検査オフセット. Inspection offset.<p>
	 *
	 */
	public void insp_offst(float value) {
		setConstNumber(offset + 10, $insp_offst, value);
	}
	
	/**
	 * 検査オフセット. Inspection offset.<p>
	 *
	 */
	public void insp_offst(double value) {
		setConstNumber(offset + 10, $insp_offst, value);
	}
	
	/**
	 * 適用開始日. Application start date.<p>
	 *
	 */
	public MCDate st_dt() {
		return getConstDate(offset + 11, $st_dt);
	}

	/**
	 * 適用開始日. Application start date.<p>
	 *
	 */
	public void st_dt(MCDate value) {
		setConstDate(offset + 11, $st_dt, value);
	}

	/**
	 * 適用終了日. Application end date.<p>
	 *
	 */
	public MCDate end_dt() {
		return getConstDate(offset + 12, $end_dt);
	}

	/**
	 * 適用終了日. Application end date.<p>
	 *
	 */
	public void end_dt(MCDate value) {
		setConstDate(offset + 12, $end_dt, value);
	}

	/**
	 * ワーキンググループＣＤ. WG cd..<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 13, $wg_cd);
	}

	/**
	 * ワーキンググループＣＤ. WG cd..<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 13, $wg_cd, value);
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
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			return mfg_loc_cd();
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			return sppl_cd();
		}
		if ($maker_cd.equalsIgnoreCase(name)) {
			return maker_cd();
		}
		if ($from_site_cd.equalsIgnoreCase(name)) {
			return from_site_cd();
		}
		if ($to_site_cd.equalsIgnoreCase(name)) {
			return to_site_cd();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		return super.getString(name);
	}

	public MCNumber getNumber(String name) {
		if ($insp_lt.equalsIgnoreCase(name)) {
			return insp_lt();
		}
		if ($insp_offst.equalsIgnoreCase(name)) {
			return insp_offst();
		}
		return super.getNumber(name);
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
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			return mfg_loc_cd();
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			return sppl_cd();
		}
		if ($maker_cd.equalsIgnoreCase(name)) {
			return maker_cd();
		}
		if ($from_site_cd.equalsIgnoreCase(name)) {
			return from_site_cd();
		}
		if ($to_site_cd.equalsIgnoreCase(name)) {
			return to_site_cd();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		return super.getStringNE(name);
	}

	public MCNumber getNumberNE(String name) {
		if ($insp_lt.equalsIgnoreCase(name)) {
			return insp_lt();
		}
		if ($insp_offst.equalsIgnoreCase(name)) {
			return insp_offst();
		}
		return super.getNumberNE(name);
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
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			mfg_loc_cd(value);
			return;
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			sppl_cd(value);
			return;
		}
		if ($maker_cd.equalsIgnoreCase(name)) {
			maker_cd(value);
			return;
		}
		if ($from_site_cd.equalsIgnoreCase(name)) {
			from_site_cd(value);
			return;
		}
		if ($to_site_cd.equalsIgnoreCase(name)) {
			to_site_cd(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		super.setString(name, value);
	}

	public void setNumber(String name, MCNumber value) {
		if ($insp_lt.equalsIgnoreCase(name)) {
			insp_lt(value);
			return;
		}
		if ($insp_offst.equalsIgnoreCase(name)) {
			insp_offst(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, int value) {
		if ($insp_lt.equalsIgnoreCase(name)) {
			insp_lt(value);
			return;
		}
		if ($insp_offst.equalsIgnoreCase(name)) {
			insp_offst(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, long value) {
		if ($insp_lt.equalsIgnoreCase(name)) {
			insp_lt(value);
			return;
		}
		if ($insp_offst.equalsIgnoreCase(name)) {
			insp_offst(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, float value) {
		if ($insp_lt.equalsIgnoreCase(name)) {
			insp_lt(value);
			return;
		}
		if ($insp_offst.equalsIgnoreCase(name)) {
			insp_offst(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, double value) {
		if ($insp_lt.equalsIgnoreCase(name)) {
			insp_lt(value);
			return;
		}
		if ($insp_offst.equalsIgnoreCase(name)) {
			insp_offst(value);
			return;
		}
		super.setNumber(name, value);
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
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			mfg_loc_cd(value);
			return;
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			sppl_cd(value);
			return;
		}
		if ($maker_cd.equalsIgnoreCase(name)) {
			maker_cd(value);
			return;
		}
		if ($from_site_cd.equalsIgnoreCase(name)) {
			from_site_cd(value);
			return;
		}
		if ($to_site_cd.equalsIgnoreCase(name)) {
			to_site_cd(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		super.setStringNE(name, value);
	}

	public void setNumberNE(String name, MCNumber value) {
		if ($insp_lt.equalsIgnoreCase(name)) {
			insp_lt(value);
			return;
		}
		if ($insp_offst.equalsIgnoreCase(name)) {
			insp_offst(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, int value) {
		if ($insp_lt.equalsIgnoreCase(name)) {
			insp_lt(value);
			return;
		}
		if ($insp_offst.equalsIgnoreCase(name)) {
			insp_offst(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, long value) {
		if ($insp_lt.equalsIgnoreCase(name)) {
			insp_lt(value);
			return;
		}
		if ($insp_offst.equalsIgnoreCase(name)) {
			insp_offst(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, float value) {
		if ($insp_lt.equalsIgnoreCase(name)) {
			insp_lt(value);
			return;
		}
		if ($insp_offst.equalsIgnoreCase(name)) {
			insp_offst(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, double value) {
		if ($insp_lt.equalsIgnoreCase(name)) {
			insp_lt(value);
			return;
		}
		if ($insp_offst.equalsIgnoreCase(name)) {
			insp_offst(value);
			return;
		}
		super.setNumberNE(name, value);
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
