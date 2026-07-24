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
 * "ＭＲＰ用引当制御マスタ // Allocation control master for MRP"DBコンテナRowクラスです。<p>
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
 *  	<td>to_loc_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>移動先場所ＣＤ</td>
 *  	<td>Location cd. (Destination)</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>fr_loc_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>移動元場所ＣＤ</td>
 *  	<td>Source location cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>K</td>
 *  	<td>itm_cd</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目ＣＤ</td>
 *  	<td>Item cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>itm_sub1</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>枝番１</td>
 *  	<td>Branch No. 1</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>K</td>
 *  	<td>itm_sub2</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>枝番２</td>
 *  	<td>Branch No. 2</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>itm_sub3</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>枝番３</td>
 *  	<td>Branch No. 3</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>prio</td>
 *  	<td>N</td>
 *  	<td>4,0</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>引当優先順</td>
 *  	<td>Allocation priority</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>xfr_lot_unit_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>移送ロット単位数量</td>
 *  	<td>Transport lot unit qty.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>in_loc_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>投入場所指定ＦＬＧ</td>
 *  	<td>Input location specification flg.</td>
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
public class MSVM_MRP_ALLOC_CTL_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.VIEW;

	public static final String TABLE_NAME = "MSVM_MRP_ALLOC_CTL";

	public static final boolean EX_CTRL = false;
	
	public static final boolean LCL_TABLE = false;
	
	/**
	 * 移動先場所ＣＤ. Location cd. (Destination).<p>
	 *
	 */
	public static final String $to_loc_cd = "to_loc_cd";
	private static final MCPermColumnInfo _to_loc_cd = createColumnInfo("to_loc_cd");
	public final MCStringPermColumn to_loc_cd = createStringColumn(_to_loc_cd);
	
	/**
	 * 移動元場所ＣＤ. Source location cd..<p>
	 *
	 */
	public static final String $fr_loc_cd = "fr_loc_cd";
	private static final MCPermColumnInfo _fr_loc_cd = createColumnInfo("fr_loc_cd");
	public final MCStringPermColumn fr_loc_cd = createStringColumn(_fr_loc_cd);
	
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
	 * 引当優先順. Allocation priority.<p>
	 *
	 */
	public static final String $prio = "prio";
	private static final MCPermColumnInfo _prio = createColumnInfo("prio");
	public final MCNumberPermColumn prio = createNumberColumn(_prio);
	
	/**
	 * 移送ロット単位数量. Transport lot unit qty..<p>
	 *
	 */
	public static final String $xfr_lot_unit_qty = "xfr_lot_unit_qty";
	private static final MCPermColumnInfo _xfr_lot_unit_qty = createColumnInfo("xfr_lot_unit_qty");
	public final MCNumberPermColumn xfr_lot_unit_qty = createNumberColumn(_xfr_lot_unit_qty);
	
	/**
	 * 投入場所指定ＦＬＧ. Input location specification flg..<p>
	 *
	 */
	public static final String $in_loc_flg = "in_loc_flg";
	private static final MCPermColumnInfo _in_loc_flg = createColumnInfo("in_loc_flg");
	public final MCBooleanPermColumn in_loc_flg = createBooleanColumn(_in_loc_flg);
	
	/**
	 * ワーキンググループＣＤ. WG cd..<p>
	 *
	 */
	public static final String $wg_cd = "wg_cd";
	private static final MCPermColumnInfo _wg_cd = createColumnInfo("wg_cd");
	public final MCStringPermColumn wg_cd = createStringColumn(_wg_cd);
	
	public static final MCMeta to_loc_cd_META = createCommonMeta($to_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta fr_loc_cd_META = createCommonMeta($fr_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta prio_META = createCommonMeta($prio, mcframe.commonMA.meta.MA_META.ALLOC_PRIO);
	public static final MCMeta xfr_lot_unit_qty_META = createCommonMeta($xfr_lot_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta in_loc_flg_META = createCommonMeta($in_loc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);

	protected static final List<MCForeignInfo> FOREIGN_INFO_LIST = new ArrayList<>();
	static {
	}
	
	protected static final ConstMetaList<MSVM_MRP_ALLOC_CTL_R> constMetas = new ConstMetaList<MSVM_MRP_ALLOC_CTL_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			to_loc_cd_META,
			fr_loc_cd_META,
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			prio_META,
			xfr_lot_unit_qty_META,
			in_loc_flg_META,
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
	protected MSVM_MRP_ALLOC_CTL_R(ConstMetaList<? extends MSVM_MRP_ALLOC_CTL_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MSVM_MRP_ALLOC_CTL_R(ConstMetaList<? extends MSVM_MRP_ALLOC_CTL_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MSVM_MRP_ALLOC_CTL_R.$to_loc_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVM_MRP_ALLOC_CTL_R.$to_loc_cd,
				"to_loc_cd",
				to_loc_cd,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVM_MRP_ALLOC_CTL_R.$fr_loc_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVM_MRP_ALLOC_CTL_R.$fr_loc_cd,
				"fr_loc_cd",
				fr_loc_cd,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVM_MRP_ALLOC_CTL_R.$itm_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVM_MRP_ALLOC_CTL_R.$itm_cd,
				"itm_cd",
				itm_cd,
				true,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVM_MRP_ALLOC_CTL_R.$itm_sub1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVM_MRP_ALLOC_CTL_R.$itm_sub1,
				"itm_sub1",
				itm_sub1,
				true,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVM_MRP_ALLOC_CTL_R.$itm_sub2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVM_MRP_ALLOC_CTL_R.$itm_sub2,
				"itm_sub2",
				itm_sub2,
				true,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVM_MRP_ALLOC_CTL_R.$itm_sub3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVM_MRP_ALLOC_CTL_R.$itm_sub3,
				"itm_sub3",
				itm_sub3,
				true,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVM_MRP_ALLOC_CTL_R.$prio,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MSVM_MRP_ALLOC_CTL_R.$prio,
				"prio",
				prio,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVM_MRP_ALLOC_CTL_R.$xfr_lot_unit_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MSVM_MRP_ALLOC_CTL_R.$xfr_lot_unit_qty,
				"xfr_lot_unit_qty",
				xfr_lot_unit_qty,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVM_MRP_ALLOC_CTL_R.$in_loc_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MSVM_MRP_ALLOC_CTL_R.$in_loc_flg,
				"in_loc_flg",
				in_loc_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVM_MRP_ALLOC_CTL_R.$wg_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVM_MRP_ALLOC_CTL_R.$wg_cd,
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
	public static MSVM_MRP_ALLOC_CTL_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MSVM_MRP_ALLOC_CTL_R create(String alias) {
		MSVM_MRP_ALLOC_CTL_R row = new MSVM_MRP_ALLOC_CTL_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MSVM_MRP_ALLOC_CTL_R createByName(T proto) {
		MSVM_MRP_ALLOC_CTL_R row = MSVM_MRP_ALLOC_CTL_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MSVM_MRP_ALLOC_CTL_R clone() {
		return (MSVM_MRP_ALLOC_CTL_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MSVM_MRP_ALLOC_CTL_R createInstance() {
		return (MSVM_MRP_ALLOC_CTL_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MSVM_MRP_ALLOC_CTL_R getValues(String... names) {
		return (MSVM_MRP_ALLOC_CTL_R) super.getValues(names);
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
	 * 移動先場所ＣＤ. Location cd. (Destination).<p>
	 *
	 */
	public String to_loc_cd() {
		return getConstString(offset + 0, $to_loc_cd);
	}

	/**
	 * 移動先場所ＣＤ. Location cd. (Destination).<p>
	 *
	 */
	public void to_loc_cd(String value) {
		setConstString(offset + 0, $to_loc_cd, value);
	}

	/**
	 * 移動元場所ＣＤ. Source location cd..<p>
	 *
	 */
	public String fr_loc_cd() {
		return getConstString(offset + 1, $fr_loc_cd);
	}

	/**
	 * 移動元場所ＣＤ. Source location cd..<p>
	 *
	 */
	public void fr_loc_cd(String value) {
		setConstString(offset + 1, $fr_loc_cd, value);
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
	 * 引当優先順. Allocation priority.<p>
	 *
	 */
	public MCNumber prio() {
		return getConstNumber(offset + 6, $prio);
	}

	/**
	 * 引当優先順. Allocation priority.<p>
	 *
	 */
	public void prio(MCNumber value) {
		setConstNumber(offset + 6, $prio, value);
	}
	
	/**
	 * 引当優先順. Allocation priority.<p>
	 *
	 */
	public void prio(int value) {
		setConstNumber(offset + 6, $prio, value);
	}
	
	/**
	 * 引当優先順. Allocation priority.<p>
	 *
	 */
	public void prio(long value) {
		setConstNumber(offset + 6, $prio, value);
	}
	
	/**
	 * 引当優先順. Allocation priority.<p>
	 *
	 */
	public void prio(float value) {
		setConstNumber(offset + 6, $prio, value);
	}
	
	/**
	 * 引当優先順. Allocation priority.<p>
	 *
	 */
	public void prio(double value) {
		setConstNumber(offset + 6, $prio, value);
	}
	
	/**
	 * 移送ロット単位数量. Transport lot unit qty..<p>
	 *
	 */
	public MCNumber xfr_lot_unit_qty() {
		return getConstNumber(offset + 7, $xfr_lot_unit_qty);
	}

	/**
	 * 移送ロット単位数量. Transport lot unit qty..<p>
	 *
	 */
	public void xfr_lot_unit_qty(MCNumber value) {
		setConstNumber(offset + 7, $xfr_lot_unit_qty, value);
	}
	
	/**
	 * 移送ロット単位数量. Transport lot unit qty..<p>
	 *
	 */
	public void xfr_lot_unit_qty(int value) {
		setConstNumber(offset + 7, $xfr_lot_unit_qty, value);
	}
	
	/**
	 * 移送ロット単位数量. Transport lot unit qty..<p>
	 *
	 */
	public void xfr_lot_unit_qty(long value) {
		setConstNumber(offset + 7, $xfr_lot_unit_qty, value);
	}
	
	/**
	 * 移送ロット単位数量. Transport lot unit qty..<p>
	 *
	 */
	public void xfr_lot_unit_qty(float value) {
		setConstNumber(offset + 7, $xfr_lot_unit_qty, value);
	}
	
	/**
	 * 移送ロット単位数量. Transport lot unit qty..<p>
	 *
	 */
	public void xfr_lot_unit_qty(double value) {
		setConstNumber(offset + 7, $xfr_lot_unit_qty, value);
	}
	
	/**
	 * 投入場所指定ＦＬＧ. Input location specification flg..<p>
	 *
	 */
	public boolean in_loc_flg() {
		return getConstBoolean(offset + 8, $in_loc_flg);
	}

	/**
	 * 投入場所指定ＦＬＧ. Input location specification flg..<p>
	 *
	 */
	public void in_loc_flg(boolean value) {
		setConstBoolean(offset + 8, $in_loc_flg, value);
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

	public String getString(String name) {
		if ($to_loc_cd.equalsIgnoreCase(name)) {
			return to_loc_cd();
		}
		if ($fr_loc_cd.equalsIgnoreCase(name)) {
			return fr_loc_cd();
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
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		return super.getString(name);
	}

	public MCNumber getNumber(String name) {
		if ($prio.equalsIgnoreCase(name)) {
			return prio();
		}
		if ($xfr_lot_unit_qty.equalsIgnoreCase(name)) {
			return xfr_lot_unit_qty();
		}
		return super.getNumber(name);
	}

	public boolean getBoolean(String name) {
		if ($in_loc_flg.equalsIgnoreCase(name)) {
			return in_loc_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($to_loc_cd.equalsIgnoreCase(name)) {
			return to_loc_cd();
		}
		if ($fr_loc_cd.equalsIgnoreCase(name)) {
			return fr_loc_cd();
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
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		return super.getStringNE(name);
	}

	public MCNumber getNumberNE(String name) {
		if ($prio.equalsIgnoreCase(name)) {
			return prio();
		}
		if ($xfr_lot_unit_qty.equalsIgnoreCase(name)) {
			return xfr_lot_unit_qty();
		}
		return super.getNumberNE(name);
	}

	public boolean getBooleanNE(String name) {
		if ($in_loc_flg.equalsIgnoreCase(name)) {
			return in_loc_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($to_loc_cd.equalsIgnoreCase(name)) {
			to_loc_cd(value);
			return;
		}
		if ($fr_loc_cd.equalsIgnoreCase(name)) {
			fr_loc_cd(value);
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
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		super.setString(name, value);
	}

	public void setNumber(String name, MCNumber value) {
		if ($prio.equalsIgnoreCase(name)) {
			prio(value);
			return;
		}
		if ($xfr_lot_unit_qty.equalsIgnoreCase(name)) {
			xfr_lot_unit_qty(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, int value) {
		if ($prio.equalsIgnoreCase(name)) {
			prio(value);
			return;
		}
		if ($xfr_lot_unit_qty.equalsIgnoreCase(name)) {
			xfr_lot_unit_qty(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, long value) {
		if ($prio.equalsIgnoreCase(name)) {
			prio(value);
			return;
		}
		if ($xfr_lot_unit_qty.equalsIgnoreCase(name)) {
			xfr_lot_unit_qty(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, float value) {
		if ($prio.equalsIgnoreCase(name)) {
			prio(value);
			return;
		}
		if ($xfr_lot_unit_qty.equalsIgnoreCase(name)) {
			xfr_lot_unit_qty(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, double value) {
		if ($prio.equalsIgnoreCase(name)) {
			prio(value);
			return;
		}
		if ($xfr_lot_unit_qty.equalsIgnoreCase(name)) {
			xfr_lot_unit_qty(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setBoolean(String name, boolean value) {
		if ($in_loc_flg.equalsIgnoreCase(name)) {
			in_loc_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($to_loc_cd.equalsIgnoreCase(name)) {
			to_loc_cd(value);
			return;
		}
		if ($fr_loc_cd.equalsIgnoreCase(name)) {
			fr_loc_cd(value);
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
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		super.setStringNE(name, value);
	}

	public void setNumberNE(String name, MCNumber value) {
		if ($prio.equalsIgnoreCase(name)) {
			prio(value);
			return;
		}
		if ($xfr_lot_unit_qty.equalsIgnoreCase(name)) {
			xfr_lot_unit_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, int value) {
		if ($prio.equalsIgnoreCase(name)) {
			prio(value);
			return;
		}
		if ($xfr_lot_unit_qty.equalsIgnoreCase(name)) {
			xfr_lot_unit_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, long value) {
		if ($prio.equalsIgnoreCase(name)) {
			prio(value);
			return;
		}
		if ($xfr_lot_unit_qty.equalsIgnoreCase(name)) {
			xfr_lot_unit_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, float value) {
		if ($prio.equalsIgnoreCase(name)) {
			prio(value);
			return;
		}
		if ($xfr_lot_unit_qty.equalsIgnoreCase(name)) {
			xfr_lot_unit_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, double value) {
		if ($prio.equalsIgnoreCase(name)) {
			prio(value);
			return;
		}
		if ($xfr_lot_unit_qty.equalsIgnoreCase(name)) {
			xfr_lot_unit_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setBooleanNE(String name, boolean value) {
		if ($in_loc_flg.equalsIgnoreCase(name)) {
			in_loc_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

}
