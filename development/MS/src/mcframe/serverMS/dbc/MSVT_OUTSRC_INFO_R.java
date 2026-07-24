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
import mcframe.commonCore.meta.MCMeta;
import mcframe.commonCore.lang.MCDataType;
import mcframe.serverCore.queryapi.MCDBContainer;
import mcframe.serverCore.queryapi.MCDBContainer.MCTableType;
import mcframe.serverCore.queryapi.IFMCSQL.MCPermColumn;
import mcframe.serverCore.queryapi.IFMCSQL.MCPermColumnInfo;
import mcframe.serverCore.queryapi.MCForeignInfo;

/**
 * "受払実績用外注製造情報ビュー // Subcontractor mfg. info. view for GR/GI result"DBコンテナRowクラスです。<p>
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
 *  	<td>purc_act_d_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>仕入実績明細ＮＯ</td>
 *  	<td>Purchase result details No.</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>purc_act_d_seq</td>
 *  	<td>N</td>
 *  	<td>4,0</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>仕入実績明細連番</td>
 *  	<td>Purchase result details sequence number</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>itm_mfg_inst_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>品目製造指図ＮＯ</td>
 *  	<td>Item mfg. order No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>itm_inst_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>品目指図数量</td>
 *  	<td>Item order qty.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>mfg_inst_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>製造指図ＮＯ</td>
 *  	<td>Mfg. order No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>mfg_act_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>製造実績ＮＯ</td>
 *  	<td>Mfg. result No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>mfg_st_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>製造着手数量</td>
 *  	<td>Mfg. start qty.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>outsrc_mfg_loc_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>外注製造場所ＣＤ</td>
 *  	<td>Subcontracting mfg. location cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>outsrc_mfg_loc_wg_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>外注製造ワーキンググループＣＤ</td>
 *  	<td>Subcontracting mfg. WG cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>par_lot_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ロットＮＯ（品目製造指図）</td>
 *  	<td>Lot No. (Item mfg. order)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>par_sublot_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>サブロットＮＯ（品目製造指図）</td>
 *  	<td>Sublot No. (Item mfg. order)</td>
 *  </tr>
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
public class MSVT_OUTSRC_INFO_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.VIEW;

	public static final String TABLE_NAME = "MSVT_OUTSRC_INFO";

	public static final boolean EX_CTRL = false;
	
	public static final boolean LCL_TABLE = false;
	
	/**
	 * 仕入実績明細ＮＯ. Purchase result details No..<p>
	 *
	 */
	public static final String $purc_act_d_no = "purc_act_d_no";
	private static final MCPermColumnInfo _purc_act_d_no = createColumnInfo("purc_act_d_no");
	public final MCStringPermColumn purc_act_d_no = createStringColumn(_purc_act_d_no);
	
	/**
	 * 仕入実績明細連番. Purchase result details sequence number.<p>
	 *
	 */
	public static final String $purc_act_d_seq = "purc_act_d_seq";
	private static final MCPermColumnInfo _purc_act_d_seq = createColumnInfo("purc_act_d_seq");
	public final MCNumberPermColumn purc_act_d_seq = createNumberColumn(_purc_act_d_seq);
	
	/**
	 * 品目製造指図ＮＯ. Item mfg. order No..<p>
	 *
	 */
	public static final String $itm_mfg_inst_no = "itm_mfg_inst_no";
	private static final MCPermColumnInfo _itm_mfg_inst_no = createColumnInfo("itm_mfg_inst_no");
	public final MCStringPermColumn itm_mfg_inst_no = createStringColumn(_itm_mfg_inst_no);
	
	/**
	 * 品目指図数量. Item order qty..<p>
	 *
	 */
	public static final String $itm_inst_qty = "itm_inst_qty";
	private static final MCPermColumnInfo _itm_inst_qty = createColumnInfo("itm_inst_qty");
	public final MCNumberPermColumn itm_inst_qty = createNumberColumn(_itm_inst_qty);
	
	/**
	 * 製造指図ＮＯ. Mfg. order No..<p>
	 *
	 */
	public static final String $mfg_inst_no = "mfg_inst_no";
	private static final MCPermColumnInfo _mfg_inst_no = createColumnInfo("mfg_inst_no");
	public final MCStringPermColumn mfg_inst_no = createStringColumn(_mfg_inst_no);
	
	/**
	 * 製造実績ＮＯ. Mfg. result No..<p>
	 *
	 */
	public static final String $mfg_act_no = "mfg_act_no";
	private static final MCPermColumnInfo _mfg_act_no = createColumnInfo("mfg_act_no");
	public final MCStringPermColumn mfg_act_no = createStringColumn(_mfg_act_no);
	
	/**
	 * 製造着手数量. Mfg. start qty..<p>
	 *
	 */
	public static final String $mfg_st_qty = "mfg_st_qty";
	private static final MCPermColumnInfo _mfg_st_qty = createColumnInfo("mfg_st_qty");
	public final MCNumberPermColumn mfg_st_qty = createNumberColumn(_mfg_st_qty);
	
	/**
	 * 外注製造場所ＣＤ. Subcontracting mfg. location cd..<p>
	 *
	 */
	public static final String $outsrc_mfg_loc_cd = "outsrc_mfg_loc_cd";
	private static final MCPermColumnInfo _outsrc_mfg_loc_cd = createColumnInfo("outsrc_mfg_loc_cd");
	public final MCStringPermColumn outsrc_mfg_loc_cd = createStringColumn(_outsrc_mfg_loc_cd);
	
	/**
	 * 外注製造ワーキンググループＣＤ. Subcontracting mfg. WG cd..<p>
	 *
	 */
	public static final String $outsrc_mfg_loc_wg_cd = "outsrc_mfg_loc_wg_cd";
	private static final MCPermColumnInfo _outsrc_mfg_loc_wg_cd = createColumnInfo("outsrc_mfg_loc_wg_cd");
	public final MCStringPermColumn outsrc_mfg_loc_wg_cd = createStringColumn(_outsrc_mfg_loc_wg_cd);
	
	/**
	 * ロットＮＯ（品目製造指図）. Lot No. (Item mfg. order).<p>
	 *
	 */
	public static final String $par_lot_no = "par_lot_no";
	private static final MCPermColumnInfo _par_lot_no = createColumnInfo("par_lot_no");
	public final MCStringPermColumn par_lot_no = createStringColumn(_par_lot_no);
	
	/**
	 * サブロットＮＯ（品目製造指図）. Sublot No. (Item mfg. order).<p>
	 *
	 */
	public static final String $par_sublot_no = "par_sublot_no";
	private static final MCPermColumnInfo _par_sublot_no = createColumnInfo("par_sublot_no");
	public final MCStringPermColumn par_sublot_no = createStringColumn(_par_sublot_no);
	
	public static final MCMeta purc_act_d_no_META = createCommonMeta($purc_act_d_no, mcframe.commonMA.meta.MA_META.PURC_ACT_D_NO);
	public static final MCMeta purc_act_d_seq_META = createCommonMeta($purc_act_d_seq, mcframe.commonMA.meta.MA_META.SLIP_SEQ);
	public static final MCMeta itm_mfg_inst_no_META = createCommonMeta($itm_mfg_inst_no, mcframe.commonMA.meta.MA_META.ITM_MFG_INST_NO);
	public static final MCMeta itm_inst_qty_META = createCommonMeta($itm_inst_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta mfg_inst_no_META = createCommonMeta($mfg_inst_no, mcframe.commonMA.meta.MA_META.MFG_INST_NO);
	public static final MCMeta mfg_act_no_META = createCommonMeta($mfg_act_no, mcframe.commonMA.meta.MA_META.MFG_ACT_NO);
	public static final MCMeta mfg_st_qty_META = createCommonMeta($mfg_st_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta outsrc_mfg_loc_cd_META = createCommonMeta($outsrc_mfg_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta outsrc_mfg_loc_wg_cd_META = createCommonMeta($outsrc_mfg_loc_wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta par_lot_no_META = createCommonMeta($par_lot_no, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta par_sublot_no_META = createCommonMeta($par_sublot_no, mcframe.commonMA.meta.MA_META.SUBLOT_NO);

	protected static final List<MCForeignInfo> FOREIGN_INFO_LIST = new ArrayList<>();
	static {
	}
	
	protected static final ConstMetaList<MSVT_OUTSRC_INFO_R> constMetas = new ConstMetaList<MSVT_OUTSRC_INFO_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			purc_act_d_no_META,
			purc_act_d_seq_META,
			itm_mfg_inst_no_META,
			itm_inst_qty_META,
			mfg_inst_no_META,
			mfg_act_no_META,
			mfg_st_qty_META,
			outsrc_mfg_loc_cd_META,
			outsrc_mfg_loc_wg_cd_META,
			par_lot_no_META,
			par_sublot_no_META
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
	protected MSVT_OUTSRC_INFO_R(ConstMetaList<? extends MSVT_OUTSRC_INFO_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MSVT_OUTSRC_INFO_R(ConstMetaList<? extends MSVT_OUTSRC_INFO_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MSVT_OUTSRC_INFO_R.$purc_act_d_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_OUTSRC_INFO_R.$purc_act_d_no,
				"purc_act_d_no",
				purc_act_d_no,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_OUTSRC_INFO_R.$purc_act_d_seq,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MSVT_OUTSRC_INFO_R.$purc_act_d_seq,
				"purc_act_d_seq",
				purc_act_d_seq,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_OUTSRC_INFO_R.$itm_mfg_inst_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_OUTSRC_INFO_R.$itm_mfg_inst_no,
				"itm_mfg_inst_no",
				itm_mfg_inst_no,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_OUTSRC_INFO_R.$itm_inst_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MSVT_OUTSRC_INFO_R.$itm_inst_qty,
				"itm_inst_qty",
				itm_inst_qty,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_OUTSRC_INFO_R.$mfg_inst_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_OUTSRC_INFO_R.$mfg_inst_no,
				"mfg_inst_no",
				mfg_inst_no,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_OUTSRC_INFO_R.$mfg_act_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_OUTSRC_INFO_R.$mfg_act_no,
				"mfg_act_no",
				mfg_act_no,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_OUTSRC_INFO_R.$mfg_st_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MSVT_OUTSRC_INFO_R.$mfg_st_qty,
				"mfg_st_qty",
				mfg_st_qty,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_OUTSRC_INFO_R.$outsrc_mfg_loc_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_OUTSRC_INFO_R.$outsrc_mfg_loc_cd,
				"outsrc_mfg_loc_cd",
				outsrc_mfg_loc_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_OUTSRC_INFO_R.$outsrc_mfg_loc_wg_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_OUTSRC_INFO_R.$outsrc_mfg_loc_wg_cd,
				"outsrc_mfg_loc_wg_cd",
				outsrc_mfg_loc_wg_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_OUTSRC_INFO_R.$par_lot_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_OUTSRC_INFO_R.$par_lot_no,
				"par_lot_no",
				par_lot_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_OUTSRC_INFO_R.$par_sublot_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_OUTSRC_INFO_R.$par_sublot_no,
				"par_sublot_no",
				par_sublot_no,
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
	public static MSVT_OUTSRC_INFO_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MSVT_OUTSRC_INFO_R create(String alias) {
		MSVT_OUTSRC_INFO_R row = new MSVT_OUTSRC_INFO_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MSVT_OUTSRC_INFO_R createByName(T proto) {
		MSVT_OUTSRC_INFO_R row = MSVT_OUTSRC_INFO_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MSVT_OUTSRC_INFO_R clone() {
		return (MSVT_OUTSRC_INFO_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MSVT_OUTSRC_INFO_R createInstance() {
		return (MSVT_OUTSRC_INFO_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MSVT_OUTSRC_INFO_R getValues(String... names) {
		return (MSVT_OUTSRC_INFO_R) super.getValues(names);
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
	 * 仕入実績明細ＮＯ. Purchase result details No..<p>
	 *
	 */
	public String purc_act_d_no() {
		return getConstString(offset + 0, $purc_act_d_no);
	}

	/**
	 * 仕入実績明細ＮＯ. Purchase result details No..<p>
	 *
	 */
	public void purc_act_d_no(String value) {
		setConstString(offset + 0, $purc_act_d_no, value);
	}

	/**
	 * 仕入実績明細連番. Purchase result details sequence number.<p>
	 *
	 */
	public MCNumber purc_act_d_seq() {
		return getConstNumber(offset + 1, $purc_act_d_seq);
	}

	/**
	 * 仕入実績明細連番. Purchase result details sequence number.<p>
	 *
	 */
	public void purc_act_d_seq(MCNumber value) {
		setConstNumber(offset + 1, $purc_act_d_seq, value);
	}
	
	/**
	 * 仕入実績明細連番. Purchase result details sequence number.<p>
	 *
	 */
	public void purc_act_d_seq(int value) {
		setConstNumber(offset + 1, $purc_act_d_seq, value);
	}
	
	/**
	 * 仕入実績明細連番. Purchase result details sequence number.<p>
	 *
	 */
	public void purc_act_d_seq(long value) {
		setConstNumber(offset + 1, $purc_act_d_seq, value);
	}
	
	/**
	 * 仕入実績明細連番. Purchase result details sequence number.<p>
	 *
	 */
	public void purc_act_d_seq(float value) {
		setConstNumber(offset + 1, $purc_act_d_seq, value);
	}
	
	/**
	 * 仕入実績明細連番. Purchase result details sequence number.<p>
	 *
	 */
	public void purc_act_d_seq(double value) {
		setConstNumber(offset + 1, $purc_act_d_seq, value);
	}
	
	/**
	 * 品目製造指図ＮＯ. Item mfg. order No..<p>
	 *
	 */
	public String itm_mfg_inst_no() {
		return getConstString(offset + 2, $itm_mfg_inst_no);
	}

	/**
	 * 品目製造指図ＮＯ. Item mfg. order No..<p>
	 *
	 */
	public void itm_mfg_inst_no(String value) {
		setConstString(offset + 2, $itm_mfg_inst_no, value);
	}

	/**
	 * 品目指図数量. Item order qty..<p>
	 *
	 */
	public MCNumber itm_inst_qty() {
		return getConstNumber(offset + 3, $itm_inst_qty);
	}

	/**
	 * 品目指図数量. Item order qty..<p>
	 *
	 */
	public void itm_inst_qty(MCNumber value) {
		setConstNumber(offset + 3, $itm_inst_qty, value);
	}
	
	/**
	 * 品目指図数量. Item order qty..<p>
	 *
	 */
	public void itm_inst_qty(int value) {
		setConstNumber(offset + 3, $itm_inst_qty, value);
	}
	
	/**
	 * 品目指図数量. Item order qty..<p>
	 *
	 */
	public void itm_inst_qty(long value) {
		setConstNumber(offset + 3, $itm_inst_qty, value);
	}
	
	/**
	 * 品目指図数量. Item order qty..<p>
	 *
	 */
	public void itm_inst_qty(float value) {
		setConstNumber(offset + 3, $itm_inst_qty, value);
	}
	
	/**
	 * 品目指図数量. Item order qty..<p>
	 *
	 */
	public void itm_inst_qty(double value) {
		setConstNumber(offset + 3, $itm_inst_qty, value);
	}
	
	/**
	 * 製造指図ＮＯ. Mfg. order No..<p>
	 *
	 */
	public String mfg_inst_no() {
		return getConstString(offset + 4, $mfg_inst_no);
	}

	/**
	 * 製造指図ＮＯ. Mfg. order No..<p>
	 *
	 */
	public void mfg_inst_no(String value) {
		setConstString(offset + 4, $mfg_inst_no, value);
	}

	/**
	 * 製造実績ＮＯ. Mfg. result No..<p>
	 *
	 */
	public String mfg_act_no() {
		return getConstString(offset + 5, $mfg_act_no);
	}

	/**
	 * 製造実績ＮＯ. Mfg. result No..<p>
	 *
	 */
	public void mfg_act_no(String value) {
		setConstString(offset + 5, $mfg_act_no, value);
	}

	/**
	 * 製造着手数量. Mfg. start qty..<p>
	 *
	 */
	public MCNumber mfg_st_qty() {
		return getConstNumber(offset + 6, $mfg_st_qty);
	}

	/**
	 * 製造着手数量. Mfg. start qty..<p>
	 *
	 */
	public void mfg_st_qty(MCNumber value) {
		setConstNumber(offset + 6, $mfg_st_qty, value);
	}
	
	/**
	 * 製造着手数量. Mfg. start qty..<p>
	 *
	 */
	public void mfg_st_qty(int value) {
		setConstNumber(offset + 6, $mfg_st_qty, value);
	}
	
	/**
	 * 製造着手数量. Mfg. start qty..<p>
	 *
	 */
	public void mfg_st_qty(long value) {
		setConstNumber(offset + 6, $mfg_st_qty, value);
	}
	
	/**
	 * 製造着手数量. Mfg. start qty..<p>
	 *
	 */
	public void mfg_st_qty(float value) {
		setConstNumber(offset + 6, $mfg_st_qty, value);
	}
	
	/**
	 * 製造着手数量. Mfg. start qty..<p>
	 *
	 */
	public void mfg_st_qty(double value) {
		setConstNumber(offset + 6, $mfg_st_qty, value);
	}
	
	/**
	 * 外注製造場所ＣＤ. Subcontracting mfg. location cd..<p>
	 *
	 */
	public String outsrc_mfg_loc_cd() {
		return getConstString(offset + 7, $outsrc_mfg_loc_cd);
	}

	/**
	 * 外注製造場所ＣＤ. Subcontracting mfg. location cd..<p>
	 *
	 */
	public void outsrc_mfg_loc_cd(String value) {
		setConstString(offset + 7, $outsrc_mfg_loc_cd, value);
	}

	/**
	 * 外注製造ワーキンググループＣＤ. Subcontracting mfg. WG cd..<p>
	 *
	 */
	public String outsrc_mfg_loc_wg_cd() {
		return getConstString(offset + 8, $outsrc_mfg_loc_wg_cd);
	}

	/**
	 * 外注製造ワーキンググループＣＤ. Subcontracting mfg. WG cd..<p>
	 *
	 */
	public void outsrc_mfg_loc_wg_cd(String value) {
		setConstString(offset + 8, $outsrc_mfg_loc_wg_cd, value);
	}

	/**
	 * ロットＮＯ（品目製造指図）. Lot No. (Item mfg. order).<p>
	 *
	 */
	public String par_lot_no() {
		return getConstString(offset + 9, $par_lot_no);
	}

	/**
	 * ロットＮＯ（品目製造指図）. Lot No. (Item mfg. order).<p>
	 *
	 */
	public void par_lot_no(String value) {
		setConstString(offset + 9, $par_lot_no, value);
	}

	/**
	 * サブロットＮＯ（品目製造指図）. Sublot No. (Item mfg. order).<p>
	 *
	 */
	public String par_sublot_no() {
		return getConstString(offset + 10, $par_sublot_no);
	}

	/**
	 * サブロットＮＯ（品目製造指図）. Sublot No. (Item mfg. order).<p>
	 *
	 */
	public void par_sublot_no(String value) {
		setConstString(offset + 10, $par_sublot_no, value);
	}

	public String getString(String name) {
		if ($purc_act_d_no.equalsIgnoreCase(name)) {
			return purc_act_d_no();
		}
		if ($itm_mfg_inst_no.equalsIgnoreCase(name)) {
			return itm_mfg_inst_no();
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			return mfg_inst_no();
		}
		if ($mfg_act_no.equalsIgnoreCase(name)) {
			return mfg_act_no();
		}
		if ($outsrc_mfg_loc_cd.equalsIgnoreCase(name)) {
			return outsrc_mfg_loc_cd();
		}
		if ($outsrc_mfg_loc_wg_cd.equalsIgnoreCase(name)) {
			return outsrc_mfg_loc_wg_cd();
		}
		if ($par_lot_no.equalsIgnoreCase(name)) {
			return par_lot_no();
		}
		if ($par_sublot_no.equalsIgnoreCase(name)) {
			return par_sublot_no();
		}
		return super.getString(name);
	}

	public MCNumber getNumber(String name) {
		if ($purc_act_d_seq.equalsIgnoreCase(name)) {
			return purc_act_d_seq();
		}
		if ($itm_inst_qty.equalsIgnoreCase(name)) {
			return itm_inst_qty();
		}
		if ($mfg_st_qty.equalsIgnoreCase(name)) {
			return mfg_st_qty();
		}
		return super.getNumber(name);
	}

	public String getStringNE(String name) {
		if ($purc_act_d_no.equalsIgnoreCase(name)) {
			return purc_act_d_no();
		}
		if ($itm_mfg_inst_no.equalsIgnoreCase(name)) {
			return itm_mfg_inst_no();
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			return mfg_inst_no();
		}
		if ($mfg_act_no.equalsIgnoreCase(name)) {
			return mfg_act_no();
		}
		if ($outsrc_mfg_loc_cd.equalsIgnoreCase(name)) {
			return outsrc_mfg_loc_cd();
		}
		if ($outsrc_mfg_loc_wg_cd.equalsIgnoreCase(name)) {
			return outsrc_mfg_loc_wg_cd();
		}
		if ($par_lot_no.equalsIgnoreCase(name)) {
			return par_lot_no();
		}
		if ($par_sublot_no.equalsIgnoreCase(name)) {
			return par_sublot_no();
		}
		return super.getStringNE(name);
	}

	public MCNumber getNumberNE(String name) {
		if ($purc_act_d_seq.equalsIgnoreCase(name)) {
			return purc_act_d_seq();
		}
		if ($itm_inst_qty.equalsIgnoreCase(name)) {
			return itm_inst_qty();
		}
		if ($mfg_st_qty.equalsIgnoreCase(name)) {
			return mfg_st_qty();
		}
		return super.getNumberNE(name);
	}

	public void setString(String name, String value) {
		if ($purc_act_d_no.equalsIgnoreCase(name)) {
			purc_act_d_no(value);
			return;
		}
		if ($itm_mfg_inst_no.equalsIgnoreCase(name)) {
			itm_mfg_inst_no(value);
			return;
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			mfg_inst_no(value);
			return;
		}
		if ($mfg_act_no.equalsIgnoreCase(name)) {
			mfg_act_no(value);
			return;
		}
		if ($outsrc_mfg_loc_cd.equalsIgnoreCase(name)) {
			outsrc_mfg_loc_cd(value);
			return;
		}
		if ($outsrc_mfg_loc_wg_cd.equalsIgnoreCase(name)) {
			outsrc_mfg_loc_wg_cd(value);
			return;
		}
		if ($par_lot_no.equalsIgnoreCase(name)) {
			par_lot_no(value);
			return;
		}
		if ($par_sublot_no.equalsIgnoreCase(name)) {
			par_sublot_no(value);
			return;
		}
		super.setString(name, value);
	}

	public void setNumber(String name, MCNumber value) {
		if ($purc_act_d_seq.equalsIgnoreCase(name)) {
			purc_act_d_seq(value);
			return;
		}
		if ($itm_inst_qty.equalsIgnoreCase(name)) {
			itm_inst_qty(value);
			return;
		}
		if ($mfg_st_qty.equalsIgnoreCase(name)) {
			mfg_st_qty(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, int value) {
		if ($purc_act_d_seq.equalsIgnoreCase(name)) {
			purc_act_d_seq(value);
			return;
		}
		if ($itm_inst_qty.equalsIgnoreCase(name)) {
			itm_inst_qty(value);
			return;
		}
		if ($mfg_st_qty.equalsIgnoreCase(name)) {
			mfg_st_qty(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, long value) {
		if ($purc_act_d_seq.equalsIgnoreCase(name)) {
			purc_act_d_seq(value);
			return;
		}
		if ($itm_inst_qty.equalsIgnoreCase(name)) {
			itm_inst_qty(value);
			return;
		}
		if ($mfg_st_qty.equalsIgnoreCase(name)) {
			mfg_st_qty(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, float value) {
		if ($purc_act_d_seq.equalsIgnoreCase(name)) {
			purc_act_d_seq(value);
			return;
		}
		if ($itm_inst_qty.equalsIgnoreCase(name)) {
			itm_inst_qty(value);
			return;
		}
		if ($mfg_st_qty.equalsIgnoreCase(name)) {
			mfg_st_qty(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, double value) {
		if ($purc_act_d_seq.equalsIgnoreCase(name)) {
			purc_act_d_seq(value);
			return;
		}
		if ($itm_inst_qty.equalsIgnoreCase(name)) {
			itm_inst_qty(value);
			return;
		}
		if ($mfg_st_qty.equalsIgnoreCase(name)) {
			mfg_st_qty(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($purc_act_d_no.equalsIgnoreCase(name)) {
			purc_act_d_no(value);
			return;
		}
		if ($itm_mfg_inst_no.equalsIgnoreCase(name)) {
			itm_mfg_inst_no(value);
			return;
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			mfg_inst_no(value);
			return;
		}
		if ($mfg_act_no.equalsIgnoreCase(name)) {
			mfg_act_no(value);
			return;
		}
		if ($outsrc_mfg_loc_cd.equalsIgnoreCase(name)) {
			outsrc_mfg_loc_cd(value);
			return;
		}
		if ($outsrc_mfg_loc_wg_cd.equalsIgnoreCase(name)) {
			outsrc_mfg_loc_wg_cd(value);
			return;
		}
		if ($par_lot_no.equalsIgnoreCase(name)) {
			par_lot_no(value);
			return;
		}
		if ($par_sublot_no.equalsIgnoreCase(name)) {
			par_sublot_no(value);
			return;
		}
		super.setStringNE(name, value);
	}

	public void setNumberNE(String name, MCNumber value) {
		if ($purc_act_d_seq.equalsIgnoreCase(name)) {
			purc_act_d_seq(value);
			return;
		}
		if ($itm_inst_qty.equalsIgnoreCase(name)) {
			itm_inst_qty(value);
			return;
		}
		if ($mfg_st_qty.equalsIgnoreCase(name)) {
			mfg_st_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, int value) {
		if ($purc_act_d_seq.equalsIgnoreCase(name)) {
			purc_act_d_seq(value);
			return;
		}
		if ($itm_inst_qty.equalsIgnoreCase(name)) {
			itm_inst_qty(value);
			return;
		}
		if ($mfg_st_qty.equalsIgnoreCase(name)) {
			mfg_st_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, long value) {
		if ($purc_act_d_seq.equalsIgnoreCase(name)) {
			purc_act_d_seq(value);
			return;
		}
		if ($itm_inst_qty.equalsIgnoreCase(name)) {
			itm_inst_qty(value);
			return;
		}
		if ($mfg_st_qty.equalsIgnoreCase(name)) {
			mfg_st_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, float value) {
		if ($purc_act_d_seq.equalsIgnoreCase(name)) {
			purc_act_d_seq(value);
			return;
		}
		if ($itm_inst_qty.equalsIgnoreCase(name)) {
			itm_inst_qty(value);
			return;
		}
		if ($mfg_st_qty.equalsIgnoreCase(name)) {
			mfg_st_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, double value) {
		if ($purc_act_d_seq.equalsIgnoreCase(name)) {
			purc_act_d_seq(value);
			return;
		}
		if ($itm_inst_qty.equalsIgnoreCase(name)) {
			itm_inst_qty(value);
			return;
		}
		if ($mfg_st_qty.equalsIgnoreCase(name)) {
			mfg_st_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}

}
