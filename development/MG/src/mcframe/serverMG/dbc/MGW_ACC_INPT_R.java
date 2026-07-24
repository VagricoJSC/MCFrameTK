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
import mcframe.serverCore.queryapi.IFMCSQL.MCBooleanPermColumn;
import mcframe.commonCore.meta.MCMeta;
import mcframe.commonCore.lang.MCDataType;
import mcframe.serverCore.queryapi.MCDBContainer;
import mcframe.serverCore.queryapi.MCDBContainer.MCTableType;
import mcframe.serverCore.queryapi.IFMCSQL.MCPermColumn;
import mcframe.serverCore.queryapi.IFMCSQL.MCPermColumnInfo;
import mcframe.serverCore.queryapi.MCForeignInfo;

/**
 * "原価内訳照会ワーク // Cost breakdown list work"DBコンテナRowクラスです。<p>
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
 *  	<td>lvl</td>
 *  	<td>N</td>
 *  	<td>3,0</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>レベル</td>
 *  	<td>Level</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>wg_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ワーキンググループＣＤ</td>
 *  	<td>WG cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>itm_cd</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>品目ＣＤ</td>
 *  	<td>Item cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>itm_sub1</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>枝番１</td>
 *  	<td>Branch No. 1</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>itm_sub2</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>枝番２</td>
 *  	<td>Branch No. 2</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>itm_sub3</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>枝番３</td>
 *  	<td>Branch No. 3</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>mfg_purc_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>製造購買区分</td>
 *  	<td>Mfg. purchase type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>inpt_rec_no</td>
 *  	<td>N</td>
 *  	<td>13,0</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>投入レコードＮＯ</td>
 *  	<td>Input record No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>act_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>実際使用数量</td>
 *  	<td>Actual used qty.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>std_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>標準使用数量</td>
 *  	<td>Standard use qty.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>expns_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>費目ＣＤ</td>
 *  	<td>Cost element cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>act_cost</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>実際原価</td>
 *  	<td>Actual cost</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>std_cost</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>標準原価</td>
 *  	<td>Standard cost</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sml_inpt_rec_no</td>
 *  	<td>N</td>
 *  	<td>13,0</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>集計投入レコードＮＯ</td>
 *  	<td>Aggregation input record No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>calc_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>原価計算ＮＯ</td>
 *  	<td>Calculation No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>bottom_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>最下位ＦＬＧ</td>
 *  	<td>Bottom flg.</td>
 *  </tr>
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
public class MGW_ACC_INPT_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.TEMP_TABLE_ON_COMMIT_DELETE_ROWS;

	public static final String TABLE_NAME = "MGW_ACC_INPT";

	public static final boolean EX_CTRL = false;
	
	public static final boolean LCL_TABLE = false;
	
	/**
	 * レベル. Level.<p>
	 *
	 */
	public static final String $lvl = "lvl";
	private static final MCPermColumnInfo _lvl = createColumnInfo("lvl");
	public final MCNumberPermColumn lvl = createNumberColumn(_lvl);
	
	/**
	 * ワーキンググループＣＤ. WG cd..<p>
	 *
	 */
	public static final String $wg_cd = "wg_cd";
	private static final MCPermColumnInfo _wg_cd = createColumnInfo("wg_cd");
	public final MCStringPermColumn wg_cd = createStringColumn(_wg_cd);
	
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
	 * 製造購買区分. Mfg. purchase type.<p>
	 *
	 */
	public static final String $mfg_purc_typ = "mfg_purc_typ";
	private static final MCPermColumnInfo _mfg_purc_typ = createColumnInfo("mfg_purc_typ");
	public final MCStringPermColumn mfg_purc_typ = createStringColumn(_mfg_purc_typ);
	
	/**
	 * 投入レコードＮＯ. Input record No..<p>
	 *
	 */
	public static final String $inpt_rec_no = "inpt_rec_no";
	private static final MCPermColumnInfo _inpt_rec_no = createColumnInfo("inpt_rec_no");
	public final MCNumberPermColumn inpt_rec_no = createNumberColumn(_inpt_rec_no);
	
	/**
	 * 実際使用数量. Actual used qty..<p>
	 *
	 */
	public static final String $act_qty = "act_qty";
	private static final MCPermColumnInfo _act_qty = createColumnInfo("act_qty");
	public final MCNumberPermColumn act_qty = createNumberColumn(_act_qty);
	
	/**
	 * 標準使用数量. Standard use qty..<p>
	 *
	 */
	public static final String $std_qty = "std_qty";
	private static final MCPermColumnInfo _std_qty = createColumnInfo("std_qty");
	public final MCNumberPermColumn std_qty = createNumberColumn(_std_qty);
	
	/**
	 * 費目ＣＤ. Cost element cd..<p>
	 *
	 */
	public static final String $expns_cd = "expns_cd";
	private static final MCPermColumnInfo _expns_cd = createColumnInfo("expns_cd");
	public final MCStringPermColumn expns_cd = createStringColumn(_expns_cd);
	
	/**
	 * 実際原価. Actual cost.<p>
	 *
	 */
	public static final String $act_cost = "act_cost";
	private static final MCPermColumnInfo _act_cost = createColumnInfo("act_cost");
	public final MCNumberPermColumn act_cost = createNumberColumn(_act_cost);
	
	/**
	 * 標準原価. Standard cost.<p>
	 *
	 */
	public static final String $std_cost = "std_cost";
	private static final MCPermColumnInfo _std_cost = createColumnInfo("std_cost");
	public final MCNumberPermColumn std_cost = createNumberColumn(_std_cost);
	
	/**
	 * 集計投入レコードＮＯ. Aggregation input record No..<p>
	 *
	 */
	public static final String $sml_inpt_rec_no = "sml_inpt_rec_no";
	private static final MCPermColumnInfo _sml_inpt_rec_no = createColumnInfo("sml_inpt_rec_no");
	public final MCNumberPermColumn sml_inpt_rec_no = createNumberColumn(_sml_inpt_rec_no);
	
	/**
	 * 原価計算ＮＯ. Calculation No..<p>
	 *
	 */
	public static final String $calc_no = "calc_no";
	private static final MCPermColumnInfo _calc_no = createColumnInfo("calc_no");
	public final MCStringPermColumn calc_no = createStringColumn(_calc_no);
	
	/**
	 * 最下位ＦＬＧ. Bottom flg..<p>
	 *
	 */
	public static final String $bottom_flg = "bottom_flg";
	private static final MCPermColumnInfo _bottom_flg = createColumnInfo("bottom_flg");
	public final MCBooleanPermColumn bottom_flg = createBooleanColumn(_bottom_flg);
	
	public static final MCMeta lvl_META = createCommonMeta($lvl, mcframe.commonMG.meta.MG_META.CALC_LVL);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta mfg_purc_typ_META = createCommonMeta($mfg_purc_typ, mcframe.commonMA.meta.MA_META.MFG_PURC_TYP);
	public static final MCMeta inpt_rec_no_META = createCommonMeta($inpt_rec_no, mcframe.commonMG.meta.MG_META.SML_INPT_REC_NO);
	public static final MCMeta act_qty_META = createCommonMeta($act_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta std_qty_META = createCommonMeta($std_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta expns_cd_META = createCommonMeta($expns_cd, mcframe.commonMA.meta.MA_META.EXPNS_CD);
	public static final MCMeta act_cost_META = createCommonMeta($act_cost, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta std_cost_META = createCommonMeta($std_cost, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta sml_inpt_rec_no_META = createCommonMeta($sml_inpt_rec_no, mcframe.commonMG.meta.MG_META.SML_INPT_REC_NO);
	public static final MCMeta calc_no_META = createCommonMeta($calc_no, mcframe.commonMA.meta.MA_META.CALC_NO);
	public static final MCMeta bottom_flg_META = createCommonMeta($bottom_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final List<MCForeignInfo> FOREIGN_INFO_LIST = new ArrayList<>();
	static {
	}
	
	protected static final ConstMetaList<MGW_ACC_INPT_R> constMetas = new ConstMetaList<MGW_ACC_INPT_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			lvl_META,
			wg_cd_META,
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			mfg_purc_typ_META,
			inpt_rec_no_META,
			act_qty_META,
			std_qty_META,
			expns_cd_META,
			act_cost_META,
			std_cost_META,
			sml_inpt_rec_no_META,
			calc_no_META,
			bottom_flg_META
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
	protected MGW_ACC_INPT_R(ConstMetaList<? extends MGW_ACC_INPT_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MGW_ACC_INPT_R(ConstMetaList<? extends MGW_ACC_INPT_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MGW_ACC_INPT_R.$lvl,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGW_ACC_INPT_R.$lvl,
				"lvl",
				lvl,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGW_ACC_INPT_R.$wg_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGW_ACC_INPT_R.$wg_cd,
				"wg_cd",
				wg_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGW_ACC_INPT_R.$itm_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGW_ACC_INPT_R.$itm_cd,
				"itm_cd",
				itm_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGW_ACC_INPT_R.$itm_sub1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGW_ACC_INPT_R.$itm_sub1,
				"itm_sub1",
				itm_sub1,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGW_ACC_INPT_R.$itm_sub2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGW_ACC_INPT_R.$itm_sub2,
				"itm_sub2",
				itm_sub2,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGW_ACC_INPT_R.$itm_sub3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGW_ACC_INPT_R.$itm_sub3,
				"itm_sub3",
				itm_sub3,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGW_ACC_INPT_R.$mfg_purc_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGW_ACC_INPT_R.$mfg_purc_typ,
				"mfg_purc_typ",
				mfg_purc_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGW_ACC_INPT_R.$inpt_rec_no,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGW_ACC_INPT_R.$inpt_rec_no,
				"inpt_rec_no",
				inpt_rec_no,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGW_ACC_INPT_R.$act_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGW_ACC_INPT_R.$act_qty,
				"act_qty",
				act_qty,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGW_ACC_INPT_R.$std_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGW_ACC_INPT_R.$std_qty,
				"std_qty",
				std_qty,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGW_ACC_INPT_R.$expns_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGW_ACC_INPT_R.$expns_cd,
				"expns_cd",
				expns_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGW_ACC_INPT_R.$act_cost,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGW_ACC_INPT_R.$act_cost,
				"act_cost",
				act_cost,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGW_ACC_INPT_R.$std_cost,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGW_ACC_INPT_R.$std_cost,
				"std_cost",
				std_cost,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGW_ACC_INPT_R.$sml_inpt_rec_no,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGW_ACC_INPT_R.$sml_inpt_rec_no,
				"sml_inpt_rec_no",
				sml_inpt_rec_no,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGW_ACC_INPT_R.$calc_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGW_ACC_INPT_R.$calc_no,
				"calc_no",
				calc_no,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGW_ACC_INPT_R.$bottom_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MGW_ACC_INPT_R.$bottom_flg,
				"bottom_flg",
				bottom_flg,
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
	public static MGW_ACC_INPT_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MGW_ACC_INPT_R create(String alias) {
		MGW_ACC_INPT_R row = new MGW_ACC_INPT_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MGW_ACC_INPT_R createByName(T proto) {
		MGW_ACC_INPT_R row = MGW_ACC_INPT_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MGW_ACC_INPT_R clone() {
		return (MGW_ACC_INPT_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MGW_ACC_INPT_R createInstance() {
		return (MGW_ACC_INPT_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MGW_ACC_INPT_R getValues(String... names) {
		return (MGW_ACC_INPT_R) super.getValues(names);
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
	 * レベル. Level.<p>
	 *
	 */
	public MCNumber lvl() {
		return getConstNumber(offset + 0, $lvl);
	}

	/**
	 * レベル. Level.<p>
	 *
	 */
	public void lvl(MCNumber value) {
		setConstNumber(offset + 0, $lvl, value);
	}
	
	/**
	 * レベル. Level.<p>
	 *
	 */
	public void lvl(int value) {
		setConstNumber(offset + 0, $lvl, value);
	}
	
	/**
	 * レベル. Level.<p>
	 *
	 */
	public void lvl(long value) {
		setConstNumber(offset + 0, $lvl, value);
	}
	
	/**
	 * レベル. Level.<p>
	 *
	 */
	public void lvl(float value) {
		setConstNumber(offset + 0, $lvl, value);
	}
	
	/**
	 * レベル. Level.<p>
	 *
	 */
	public void lvl(double value) {
		setConstNumber(offset + 0, $lvl, value);
	}
	
	/**
	 * ワーキンググループＣＤ. WG cd..<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 1, $wg_cd);
	}

	/**
	 * ワーキンググループＣＤ. WG cd..<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 1, $wg_cd, value);
	}

	/**
	 * 品目ＣＤ. Item cd..<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 2, $itm_cd);
	}

	/**
	 * 品目ＣＤ. Item cd..<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 2, $itm_cd, value);
	}

	/**
	 * 枝番１. Branch No. 1.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 3, $itm_sub1);
	}

	/**
	 * 枝番１. Branch No. 1.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 3, $itm_sub1, value);
	}

	/**
	 * 枝番２. Branch No. 2.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 4, $itm_sub2);
	}

	/**
	 * 枝番２. Branch No. 2.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 4, $itm_sub2, value);
	}

	/**
	 * 枝番３. Branch No. 3.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 5, $itm_sub3);
	}

	/**
	 * 枝番３. Branch No. 3.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 5, $itm_sub3, value);
	}

	/**
	 * 製造購買区分. Mfg. purchase type.<p>
	 *
	 */
	public String mfg_purc_typ() {
		return getConstString(offset + 6, $mfg_purc_typ);
	}

	/**
	 * 製造購買区分. Mfg. purchase type.<p>
	 *
	 */
	public void mfg_purc_typ(String value) {
		setConstString(offset + 6, $mfg_purc_typ, value);
	}

	/**
	 * 投入レコードＮＯ. Input record No..<p>
	 *
	 */
	public MCNumber inpt_rec_no() {
		return getConstNumber(offset + 7, $inpt_rec_no);
	}

	/**
	 * 投入レコードＮＯ. Input record No..<p>
	 *
	 */
	public void inpt_rec_no(MCNumber value) {
		setConstNumber(offset + 7, $inpt_rec_no, value);
	}
	
	/**
	 * 投入レコードＮＯ. Input record No..<p>
	 *
	 */
	public void inpt_rec_no(int value) {
		setConstNumber(offset + 7, $inpt_rec_no, value);
	}
	
	/**
	 * 投入レコードＮＯ. Input record No..<p>
	 *
	 */
	public void inpt_rec_no(long value) {
		setConstNumber(offset + 7, $inpt_rec_no, value);
	}
	
	/**
	 * 投入レコードＮＯ. Input record No..<p>
	 *
	 */
	public void inpt_rec_no(float value) {
		setConstNumber(offset + 7, $inpt_rec_no, value);
	}
	
	/**
	 * 投入レコードＮＯ. Input record No..<p>
	 *
	 */
	public void inpt_rec_no(double value) {
		setConstNumber(offset + 7, $inpt_rec_no, value);
	}
	
	/**
	 * 実際使用数量. Actual used qty..<p>
	 *
	 */
	public MCNumber act_qty() {
		return getConstNumber(offset + 8, $act_qty);
	}

	/**
	 * 実際使用数量. Actual used qty..<p>
	 *
	 */
	public void act_qty(MCNumber value) {
		setConstNumber(offset + 8, $act_qty, value);
	}
	
	/**
	 * 実際使用数量. Actual used qty..<p>
	 *
	 */
	public void act_qty(int value) {
		setConstNumber(offset + 8, $act_qty, value);
	}
	
	/**
	 * 実際使用数量. Actual used qty..<p>
	 *
	 */
	public void act_qty(long value) {
		setConstNumber(offset + 8, $act_qty, value);
	}
	
	/**
	 * 実際使用数量. Actual used qty..<p>
	 *
	 */
	public void act_qty(float value) {
		setConstNumber(offset + 8, $act_qty, value);
	}
	
	/**
	 * 実際使用数量. Actual used qty..<p>
	 *
	 */
	public void act_qty(double value) {
		setConstNumber(offset + 8, $act_qty, value);
	}
	
	/**
	 * 標準使用数量. Standard use qty..<p>
	 *
	 */
	public MCNumber std_qty() {
		return getConstNumber(offset + 9, $std_qty);
	}

	/**
	 * 標準使用数量. Standard use qty..<p>
	 *
	 */
	public void std_qty(MCNumber value) {
		setConstNumber(offset + 9, $std_qty, value);
	}
	
	/**
	 * 標準使用数量. Standard use qty..<p>
	 *
	 */
	public void std_qty(int value) {
		setConstNumber(offset + 9, $std_qty, value);
	}
	
	/**
	 * 標準使用数量. Standard use qty..<p>
	 *
	 */
	public void std_qty(long value) {
		setConstNumber(offset + 9, $std_qty, value);
	}
	
	/**
	 * 標準使用数量. Standard use qty..<p>
	 *
	 */
	public void std_qty(float value) {
		setConstNumber(offset + 9, $std_qty, value);
	}
	
	/**
	 * 標準使用数量. Standard use qty..<p>
	 *
	 */
	public void std_qty(double value) {
		setConstNumber(offset + 9, $std_qty, value);
	}
	
	/**
	 * 費目ＣＤ. Cost element cd..<p>
	 *
	 */
	public String expns_cd() {
		return getConstString(offset + 10, $expns_cd);
	}

	/**
	 * 費目ＣＤ. Cost element cd..<p>
	 *
	 */
	public void expns_cd(String value) {
		setConstString(offset + 10, $expns_cd, value);
	}

	/**
	 * 実際原価. Actual cost.<p>
	 *
	 */
	public MCNumber act_cost() {
		return getConstNumber(offset + 11, $act_cost);
	}

	/**
	 * 実際原価. Actual cost.<p>
	 *
	 */
	public void act_cost(MCNumber value) {
		setConstNumber(offset + 11, $act_cost, value);
	}
	
	/**
	 * 実際原価. Actual cost.<p>
	 *
	 */
	public void act_cost(int value) {
		setConstNumber(offset + 11, $act_cost, value);
	}
	
	/**
	 * 実際原価. Actual cost.<p>
	 *
	 */
	public void act_cost(long value) {
		setConstNumber(offset + 11, $act_cost, value);
	}
	
	/**
	 * 実際原価. Actual cost.<p>
	 *
	 */
	public void act_cost(float value) {
		setConstNumber(offset + 11, $act_cost, value);
	}
	
	/**
	 * 実際原価. Actual cost.<p>
	 *
	 */
	public void act_cost(double value) {
		setConstNumber(offset + 11, $act_cost, value);
	}
	
	/**
	 * 標準原価. Standard cost.<p>
	 *
	 */
	public MCNumber std_cost() {
		return getConstNumber(offset + 12, $std_cost);
	}

	/**
	 * 標準原価. Standard cost.<p>
	 *
	 */
	public void std_cost(MCNumber value) {
		setConstNumber(offset + 12, $std_cost, value);
	}
	
	/**
	 * 標準原価. Standard cost.<p>
	 *
	 */
	public void std_cost(int value) {
		setConstNumber(offset + 12, $std_cost, value);
	}
	
	/**
	 * 標準原価. Standard cost.<p>
	 *
	 */
	public void std_cost(long value) {
		setConstNumber(offset + 12, $std_cost, value);
	}
	
	/**
	 * 標準原価. Standard cost.<p>
	 *
	 */
	public void std_cost(float value) {
		setConstNumber(offset + 12, $std_cost, value);
	}
	
	/**
	 * 標準原価. Standard cost.<p>
	 *
	 */
	public void std_cost(double value) {
		setConstNumber(offset + 12, $std_cost, value);
	}
	
	/**
	 * 集計投入レコードＮＯ. Aggregation input record No..<p>
	 *
	 */
	public MCNumber sml_inpt_rec_no() {
		return getConstNumber(offset + 13, $sml_inpt_rec_no);
	}

	/**
	 * 集計投入レコードＮＯ. Aggregation input record No..<p>
	 *
	 */
	public void sml_inpt_rec_no(MCNumber value) {
		setConstNumber(offset + 13, $sml_inpt_rec_no, value);
	}
	
	/**
	 * 集計投入レコードＮＯ. Aggregation input record No..<p>
	 *
	 */
	public void sml_inpt_rec_no(int value) {
		setConstNumber(offset + 13, $sml_inpt_rec_no, value);
	}
	
	/**
	 * 集計投入レコードＮＯ. Aggregation input record No..<p>
	 *
	 */
	public void sml_inpt_rec_no(long value) {
		setConstNumber(offset + 13, $sml_inpt_rec_no, value);
	}
	
	/**
	 * 集計投入レコードＮＯ. Aggregation input record No..<p>
	 *
	 */
	public void sml_inpt_rec_no(float value) {
		setConstNumber(offset + 13, $sml_inpt_rec_no, value);
	}
	
	/**
	 * 集計投入レコードＮＯ. Aggregation input record No..<p>
	 *
	 */
	public void sml_inpt_rec_no(double value) {
		setConstNumber(offset + 13, $sml_inpt_rec_no, value);
	}
	
	/**
	 * 原価計算ＮＯ. Calculation No..<p>
	 *
	 */
	public String calc_no() {
		return getConstString(offset + 14, $calc_no);
	}

	/**
	 * 原価計算ＮＯ. Calculation No..<p>
	 *
	 */
	public void calc_no(String value) {
		setConstString(offset + 14, $calc_no, value);
	}

	/**
	 * 最下位ＦＬＧ. Bottom flg..<p>
	 *
	 */
	public boolean bottom_flg() {
		return getConstBoolean(offset + 15, $bottom_flg);
	}

	/**
	 * 最下位ＦＬＧ. Bottom flg..<p>
	 *
	 */
	public void bottom_flg(boolean value) {
		setConstBoolean(offset + 15, $bottom_flg, value);
	}

	public String getString(String name) {
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
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
		if ($mfg_purc_typ.equalsIgnoreCase(name)) {
			return mfg_purc_typ();
		}
		if ($expns_cd.equalsIgnoreCase(name)) {
			return expns_cd();
		}
		if ($calc_no.equalsIgnoreCase(name)) {
			return calc_no();
		}
		return super.getString(name);
	}

	public MCNumber getNumber(String name) {
		if ($lvl.equalsIgnoreCase(name)) {
			return lvl();
		}
		if ($inpt_rec_no.equalsIgnoreCase(name)) {
			return inpt_rec_no();
		}
		if ($act_qty.equalsIgnoreCase(name)) {
			return act_qty();
		}
		if ($std_qty.equalsIgnoreCase(name)) {
			return std_qty();
		}
		if ($act_cost.equalsIgnoreCase(name)) {
			return act_cost();
		}
		if ($std_cost.equalsIgnoreCase(name)) {
			return std_cost();
		}
		if ($sml_inpt_rec_no.equalsIgnoreCase(name)) {
			return sml_inpt_rec_no();
		}
		return super.getNumber(name);
	}

	public boolean getBoolean(String name) {
		if ($bottom_flg.equalsIgnoreCase(name)) {
			return bottom_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
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
		if ($mfg_purc_typ.equalsIgnoreCase(name)) {
			return mfg_purc_typ();
		}
		if ($expns_cd.equalsIgnoreCase(name)) {
			return expns_cd();
		}
		if ($calc_no.equalsIgnoreCase(name)) {
			return calc_no();
		}
		return super.getStringNE(name);
	}

	public MCNumber getNumberNE(String name) {
		if ($lvl.equalsIgnoreCase(name)) {
			return lvl();
		}
		if ($inpt_rec_no.equalsIgnoreCase(name)) {
			return inpt_rec_no();
		}
		if ($act_qty.equalsIgnoreCase(name)) {
			return act_qty();
		}
		if ($std_qty.equalsIgnoreCase(name)) {
			return std_qty();
		}
		if ($act_cost.equalsIgnoreCase(name)) {
			return act_cost();
		}
		if ($std_cost.equalsIgnoreCase(name)) {
			return std_cost();
		}
		if ($sml_inpt_rec_no.equalsIgnoreCase(name)) {
			return sml_inpt_rec_no();
		}
		return super.getNumberNE(name);
	}

	public boolean getBooleanNE(String name) {
		if ($bottom_flg.equalsIgnoreCase(name)) {
			return bottom_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
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
		if ($mfg_purc_typ.equalsIgnoreCase(name)) {
			mfg_purc_typ(value);
			return;
		}
		if ($expns_cd.equalsIgnoreCase(name)) {
			expns_cd(value);
			return;
		}
		if ($calc_no.equalsIgnoreCase(name)) {
			calc_no(value);
			return;
		}
		super.setString(name, value);
	}

	public void setNumber(String name, MCNumber value) {
		if ($lvl.equalsIgnoreCase(name)) {
			lvl(value);
			return;
		}
		if ($inpt_rec_no.equalsIgnoreCase(name)) {
			inpt_rec_no(value);
			return;
		}
		if ($act_qty.equalsIgnoreCase(name)) {
			act_qty(value);
			return;
		}
		if ($std_qty.equalsIgnoreCase(name)) {
			std_qty(value);
			return;
		}
		if ($act_cost.equalsIgnoreCase(name)) {
			act_cost(value);
			return;
		}
		if ($std_cost.equalsIgnoreCase(name)) {
			std_cost(value);
			return;
		}
		if ($sml_inpt_rec_no.equalsIgnoreCase(name)) {
			sml_inpt_rec_no(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, int value) {
		if ($lvl.equalsIgnoreCase(name)) {
			lvl(value);
			return;
		}
		if ($inpt_rec_no.equalsIgnoreCase(name)) {
			inpt_rec_no(value);
			return;
		}
		if ($act_qty.equalsIgnoreCase(name)) {
			act_qty(value);
			return;
		}
		if ($std_qty.equalsIgnoreCase(name)) {
			std_qty(value);
			return;
		}
		if ($act_cost.equalsIgnoreCase(name)) {
			act_cost(value);
			return;
		}
		if ($std_cost.equalsIgnoreCase(name)) {
			std_cost(value);
			return;
		}
		if ($sml_inpt_rec_no.equalsIgnoreCase(name)) {
			sml_inpt_rec_no(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, long value) {
		if ($lvl.equalsIgnoreCase(name)) {
			lvl(value);
			return;
		}
		if ($inpt_rec_no.equalsIgnoreCase(name)) {
			inpt_rec_no(value);
			return;
		}
		if ($act_qty.equalsIgnoreCase(name)) {
			act_qty(value);
			return;
		}
		if ($std_qty.equalsIgnoreCase(name)) {
			std_qty(value);
			return;
		}
		if ($act_cost.equalsIgnoreCase(name)) {
			act_cost(value);
			return;
		}
		if ($std_cost.equalsIgnoreCase(name)) {
			std_cost(value);
			return;
		}
		if ($sml_inpt_rec_no.equalsIgnoreCase(name)) {
			sml_inpt_rec_no(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, float value) {
		if ($lvl.equalsIgnoreCase(name)) {
			lvl(value);
			return;
		}
		if ($inpt_rec_no.equalsIgnoreCase(name)) {
			inpt_rec_no(value);
			return;
		}
		if ($act_qty.equalsIgnoreCase(name)) {
			act_qty(value);
			return;
		}
		if ($std_qty.equalsIgnoreCase(name)) {
			std_qty(value);
			return;
		}
		if ($act_cost.equalsIgnoreCase(name)) {
			act_cost(value);
			return;
		}
		if ($std_cost.equalsIgnoreCase(name)) {
			std_cost(value);
			return;
		}
		if ($sml_inpt_rec_no.equalsIgnoreCase(name)) {
			sml_inpt_rec_no(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, double value) {
		if ($lvl.equalsIgnoreCase(name)) {
			lvl(value);
			return;
		}
		if ($inpt_rec_no.equalsIgnoreCase(name)) {
			inpt_rec_no(value);
			return;
		}
		if ($act_qty.equalsIgnoreCase(name)) {
			act_qty(value);
			return;
		}
		if ($std_qty.equalsIgnoreCase(name)) {
			std_qty(value);
			return;
		}
		if ($act_cost.equalsIgnoreCase(name)) {
			act_cost(value);
			return;
		}
		if ($std_cost.equalsIgnoreCase(name)) {
			std_cost(value);
			return;
		}
		if ($sml_inpt_rec_no.equalsIgnoreCase(name)) {
			sml_inpt_rec_no(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setBoolean(String name, boolean value) {
		if ($bottom_flg.equalsIgnoreCase(name)) {
			bottom_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
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
		if ($mfg_purc_typ.equalsIgnoreCase(name)) {
			mfg_purc_typ(value);
			return;
		}
		if ($expns_cd.equalsIgnoreCase(name)) {
			expns_cd(value);
			return;
		}
		if ($calc_no.equalsIgnoreCase(name)) {
			calc_no(value);
			return;
		}
		super.setStringNE(name, value);
	}

	public void setNumberNE(String name, MCNumber value) {
		if ($lvl.equalsIgnoreCase(name)) {
			lvl(value);
			return;
		}
		if ($inpt_rec_no.equalsIgnoreCase(name)) {
			inpt_rec_no(value);
			return;
		}
		if ($act_qty.equalsIgnoreCase(name)) {
			act_qty(value);
			return;
		}
		if ($std_qty.equalsIgnoreCase(name)) {
			std_qty(value);
			return;
		}
		if ($act_cost.equalsIgnoreCase(name)) {
			act_cost(value);
			return;
		}
		if ($std_cost.equalsIgnoreCase(name)) {
			std_cost(value);
			return;
		}
		if ($sml_inpt_rec_no.equalsIgnoreCase(name)) {
			sml_inpt_rec_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, int value) {
		if ($lvl.equalsIgnoreCase(name)) {
			lvl(value);
			return;
		}
		if ($inpt_rec_no.equalsIgnoreCase(name)) {
			inpt_rec_no(value);
			return;
		}
		if ($act_qty.equalsIgnoreCase(name)) {
			act_qty(value);
			return;
		}
		if ($std_qty.equalsIgnoreCase(name)) {
			std_qty(value);
			return;
		}
		if ($act_cost.equalsIgnoreCase(name)) {
			act_cost(value);
			return;
		}
		if ($std_cost.equalsIgnoreCase(name)) {
			std_cost(value);
			return;
		}
		if ($sml_inpt_rec_no.equalsIgnoreCase(name)) {
			sml_inpt_rec_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, long value) {
		if ($lvl.equalsIgnoreCase(name)) {
			lvl(value);
			return;
		}
		if ($inpt_rec_no.equalsIgnoreCase(name)) {
			inpt_rec_no(value);
			return;
		}
		if ($act_qty.equalsIgnoreCase(name)) {
			act_qty(value);
			return;
		}
		if ($std_qty.equalsIgnoreCase(name)) {
			std_qty(value);
			return;
		}
		if ($act_cost.equalsIgnoreCase(name)) {
			act_cost(value);
			return;
		}
		if ($std_cost.equalsIgnoreCase(name)) {
			std_cost(value);
			return;
		}
		if ($sml_inpt_rec_no.equalsIgnoreCase(name)) {
			sml_inpt_rec_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, float value) {
		if ($lvl.equalsIgnoreCase(name)) {
			lvl(value);
			return;
		}
		if ($inpt_rec_no.equalsIgnoreCase(name)) {
			inpt_rec_no(value);
			return;
		}
		if ($act_qty.equalsIgnoreCase(name)) {
			act_qty(value);
			return;
		}
		if ($std_qty.equalsIgnoreCase(name)) {
			std_qty(value);
			return;
		}
		if ($act_cost.equalsIgnoreCase(name)) {
			act_cost(value);
			return;
		}
		if ($std_cost.equalsIgnoreCase(name)) {
			std_cost(value);
			return;
		}
		if ($sml_inpt_rec_no.equalsIgnoreCase(name)) {
			sml_inpt_rec_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, double value) {
		if ($lvl.equalsIgnoreCase(name)) {
			lvl(value);
			return;
		}
		if ($inpt_rec_no.equalsIgnoreCase(name)) {
			inpt_rec_no(value);
			return;
		}
		if ($act_qty.equalsIgnoreCase(name)) {
			act_qty(value);
			return;
		}
		if ($std_qty.equalsIgnoreCase(name)) {
			std_qty(value);
			return;
		}
		if ($act_cost.equalsIgnoreCase(name)) {
			act_cost(value);
			return;
		}
		if ($std_cost.equalsIgnoreCase(name)) {
			std_cost(value);
			return;
		}
		if ($sml_inpt_rec_no.equalsIgnoreCase(name)) {
			sml_inpt_rec_no(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setBooleanNE(String name, boolean value) {
		if ($bottom_flg.equalsIgnoreCase(name)) {
			bottom_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

}
