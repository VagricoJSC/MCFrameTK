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
 * "工数予定進捗ビュー // Man-hour schedule progress view"DBコンテナRowクラスです。<p>
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
 *  	<td>wk_schd_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>工数予定ＮＯ</td>
 *  	<td>Man-hour schedule No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>mfg_sts_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>製造状況区分</td>
 *  	<td>Mfg. status type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>mfg_inst_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>製造指図ＮＯ</td>
 *  	<td>Mfg. order No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>itm_mfg_inst_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>品目製造指図ＮＯ</td>
 *  	<td>Item mfg. order No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>oper_inst_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>工程指図ＮＯ</td>
 *  	<td>Operation order No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>fxd_wk_cost</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>固定工数</td>
 *  	<td>Constant man-hour</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>wk_cost</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>数量依存工数</td>
 *  	<td>Qty.-dependent man-hours</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>rem_wk_cost</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>残工数</td>
 *  	<td>Remaining man-hour</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>abort_wk_cost</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>打切工数</td>
 *  	<td>Cancel remaining man-hour</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sub_char1</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備１</td>
 *  	<td>Spare 1</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sub_char2</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備２</td>
 *  	<td>Spare 2</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sub_char3</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備３</td>
 *  	<td>Spare 3</td>
 *  </tr>
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
public class MSVT_WK_SCHD_PR_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.VIEW;

	public static final String TABLE_NAME = "MSVT_WK_SCHD_PR";

	public static final boolean EX_CTRL = false;
	
	public static final boolean LCL_TABLE = false;
	
	/**
	 * 工数予定ＮＯ. Man-hour schedule No..<p>
	 *
	 */
	public static final String $wk_schd_no = "wk_schd_no";
	private static final MCPermColumnInfo _wk_schd_no = createColumnInfo("wk_schd_no");
	public final MCStringPermColumn wk_schd_no = createStringColumn(_wk_schd_no);
	
	/**
	 * 製造状況区分. Mfg. status type.<p>
	 *
	 */
	public static final String $mfg_sts_typ = "mfg_sts_typ";
	private static final MCPermColumnInfo _mfg_sts_typ = createColumnInfo("mfg_sts_typ");
	public final MCStringPermColumn mfg_sts_typ = createStringColumn(_mfg_sts_typ);
	
	/**
	 * 製造指図ＮＯ. Mfg. order No..<p>
	 *
	 */
	public static final String $mfg_inst_no = "mfg_inst_no";
	private static final MCPermColumnInfo _mfg_inst_no = createColumnInfo("mfg_inst_no");
	public final MCStringPermColumn mfg_inst_no = createStringColumn(_mfg_inst_no);
	
	/**
	 * 品目製造指図ＮＯ. Item mfg. order No..<p>
	 *
	 */
	public static final String $itm_mfg_inst_no = "itm_mfg_inst_no";
	private static final MCPermColumnInfo _itm_mfg_inst_no = createColumnInfo("itm_mfg_inst_no");
	public final MCStringPermColumn itm_mfg_inst_no = createStringColumn(_itm_mfg_inst_no);
	
	/**
	 * 工程指図ＮＯ. Operation order No..<p>
	 *
	 */
	public static final String $oper_inst_no = "oper_inst_no";
	private static final MCPermColumnInfo _oper_inst_no = createColumnInfo("oper_inst_no");
	public final MCStringPermColumn oper_inst_no = createStringColumn(_oper_inst_no);
	
	/**
	 * 固定工数. Constant man-hour.<p>
	 *
	 */
	public static final String $fxd_wk_cost = "fxd_wk_cost";
	private static final MCPermColumnInfo _fxd_wk_cost = createColumnInfo("fxd_wk_cost");
	public final MCNumberPermColumn fxd_wk_cost = createNumberColumn(_fxd_wk_cost);
	
	/**
	 * 数量依存工数. Qty.-dependent man-hours.<p>
	 *
	 */
	public static final String $wk_cost = "wk_cost";
	private static final MCPermColumnInfo _wk_cost = createColumnInfo("wk_cost");
	public final MCNumberPermColumn wk_cost = createNumberColumn(_wk_cost);
	
	/**
	 * 残工数. Remaining man-hour.<p>
	 *
	 */
	public static final String $rem_wk_cost = "rem_wk_cost";
	private static final MCPermColumnInfo _rem_wk_cost = createColumnInfo("rem_wk_cost");
	public final MCNumberPermColumn rem_wk_cost = createNumberColumn(_rem_wk_cost);
	
	/**
	 * 打切工数. Cancel remaining man-hour.<p>
	 *
	 */
	public static final String $abort_wk_cost = "abort_wk_cost";
	private static final MCPermColumnInfo _abort_wk_cost = createColumnInfo("abort_wk_cost");
	public final MCNumberPermColumn abort_wk_cost = createNumberColumn(_abort_wk_cost);
	
	/**
	 * 予備１. Spare 1.<p>
	 *
	 */
	public static final String $sub_char1 = "sub_char1";
	private static final MCPermColumnInfo _sub_char1 = createColumnInfo("sub_char1");
	public final MCStringPermColumn sub_char1 = createStringColumn(_sub_char1);
	
	/**
	 * 予備２. Spare 2.<p>
	 *
	 */
	public static final String $sub_char2 = "sub_char2";
	private static final MCPermColumnInfo _sub_char2 = createColumnInfo("sub_char2");
	public final MCStringPermColumn sub_char2 = createStringColumn(_sub_char2);
	
	/**
	 * 予備３. Spare 3.<p>
	 *
	 */
	public static final String $sub_char3 = "sub_char3";
	private static final MCPermColumnInfo _sub_char3 = createColumnInfo("sub_char3");
	public final MCStringPermColumn sub_char3 = createStringColumn(_sub_char3);
	
	public static final MCMeta wk_schd_no_META = createCommonMeta($wk_schd_no, mcframe.commonMA.meta.MA_META.WK_SCHD_NO);
	public static final MCMeta mfg_sts_typ_META = createCommonMeta($mfg_sts_typ, mcframe.commonMS.meta.MS_META.MFG_STS_TYP);
	public static final MCMeta mfg_inst_no_META = createCommonMeta($mfg_inst_no, mcframe.commonMA.meta.MA_META.MFG_INST_NO);
	public static final MCMeta itm_mfg_inst_no_META = createCommonMeta($itm_mfg_inst_no, mcframe.commonMA.meta.MA_META.ITM_MFG_INST_NO);
	public static final MCMeta oper_inst_no_META = createCommonMeta($oper_inst_no, mcframe.commonMA.meta.MA_META.OPER_INST_NO);
	public static final MCMeta fxd_wk_cost_META = createCommonMeta($fxd_wk_cost, mcframe.commonMA.meta.MA_META.WK_COST_QTY);
	public static final MCMeta wk_cost_META = createCommonMeta($wk_cost, mcframe.commonMA.meta.MA_META.WK_COST_QTY);
	public static final MCMeta rem_wk_cost_META = createCommonMeta($rem_wk_cost, mcframe.commonMA.meta.MA_META.WK_COST_QTY);
	public static final MCMeta abort_wk_cost_META = createCommonMeta($abort_wk_cost, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.WK_ACT_REM_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.WK_ACT_REM_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.WK_ACT_REM_SUB_CHAR3);

	protected static final List<MCForeignInfo> FOREIGN_INFO_LIST = new ArrayList<>();
	static {
	}
	
	protected static final ConstMetaList<MSVT_WK_SCHD_PR_R> constMetas = new ConstMetaList<MSVT_WK_SCHD_PR_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			wk_schd_no_META,
			mfg_sts_typ_META,
			mfg_inst_no_META,
			itm_mfg_inst_no_META,
			oper_inst_no_META,
			fxd_wk_cost_META,
			wk_cost_META,
			rem_wk_cost_META,
			abort_wk_cost_META,
			sub_char1_META,
			sub_char2_META,
			sub_char3_META
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
	protected MSVT_WK_SCHD_PR_R(ConstMetaList<? extends MSVT_WK_SCHD_PR_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MSVT_WK_SCHD_PR_R(ConstMetaList<? extends MSVT_WK_SCHD_PR_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MSVT_WK_SCHD_PR_R.$wk_schd_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_WK_SCHD_PR_R.$wk_schd_no,
				"wk_schd_no",
				wk_schd_no,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_WK_SCHD_PR_R.$mfg_sts_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_WK_SCHD_PR_R.$mfg_sts_typ,
				"mfg_sts_typ",
				mfg_sts_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_WK_SCHD_PR_R.$mfg_inst_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_WK_SCHD_PR_R.$mfg_inst_no,
				"mfg_inst_no",
				mfg_inst_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_WK_SCHD_PR_R.$itm_mfg_inst_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_WK_SCHD_PR_R.$itm_mfg_inst_no,
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
			MSVT_WK_SCHD_PR_R.$oper_inst_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_WK_SCHD_PR_R.$oper_inst_no,
				"oper_inst_no",
				oper_inst_no,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_WK_SCHD_PR_R.$fxd_wk_cost,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MSVT_WK_SCHD_PR_R.$fxd_wk_cost,
				"fxd_wk_cost",
				fxd_wk_cost,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_WK_SCHD_PR_R.$wk_cost,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MSVT_WK_SCHD_PR_R.$wk_cost,
				"wk_cost",
				wk_cost,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_WK_SCHD_PR_R.$rem_wk_cost,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MSVT_WK_SCHD_PR_R.$rem_wk_cost,
				"rem_wk_cost",
				rem_wk_cost,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_WK_SCHD_PR_R.$abort_wk_cost,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MSVT_WK_SCHD_PR_R.$abort_wk_cost,
				"abort_wk_cost",
				abort_wk_cost,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_WK_SCHD_PR_R.$sub_char1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_WK_SCHD_PR_R.$sub_char1,
				"sub_char1",
				sub_char1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_WK_SCHD_PR_R.$sub_char2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_WK_SCHD_PR_R.$sub_char2,
				"sub_char2",
				sub_char2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_WK_SCHD_PR_R.$sub_char3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_WK_SCHD_PR_R.$sub_char3,
				"sub_char3",
				sub_char3,
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
	public static MSVT_WK_SCHD_PR_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MSVT_WK_SCHD_PR_R create(String alias) {
		MSVT_WK_SCHD_PR_R row = new MSVT_WK_SCHD_PR_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MSVT_WK_SCHD_PR_R createByName(T proto) {
		MSVT_WK_SCHD_PR_R row = MSVT_WK_SCHD_PR_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MSVT_WK_SCHD_PR_R clone() {
		return (MSVT_WK_SCHD_PR_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MSVT_WK_SCHD_PR_R createInstance() {
		return (MSVT_WK_SCHD_PR_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MSVT_WK_SCHD_PR_R getValues(String... names) {
		return (MSVT_WK_SCHD_PR_R) super.getValues(names);
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
	 * 工数予定ＮＯ. Man-hour schedule No..<p>
	 *
	 */
	public String wk_schd_no() {
		return getConstString(offset + 0, $wk_schd_no);
	}

	/**
	 * 工数予定ＮＯ. Man-hour schedule No..<p>
	 *
	 */
	public void wk_schd_no(String value) {
		setConstString(offset + 0, $wk_schd_no, value);
	}

	/**
	 * 製造状況区分. Mfg. status type.<p>
	 *
	 */
	public String mfg_sts_typ() {
		return getConstString(offset + 1, $mfg_sts_typ);
	}

	/**
	 * 製造状況区分. Mfg. status type.<p>
	 *
	 */
	public void mfg_sts_typ(String value) {
		setConstString(offset + 1, $mfg_sts_typ, value);
	}

	/**
	 * 製造指図ＮＯ. Mfg. order No..<p>
	 *
	 */
	public String mfg_inst_no() {
		return getConstString(offset + 2, $mfg_inst_no);
	}

	/**
	 * 製造指図ＮＯ. Mfg. order No..<p>
	 *
	 */
	public void mfg_inst_no(String value) {
		setConstString(offset + 2, $mfg_inst_no, value);
	}

	/**
	 * 品目製造指図ＮＯ. Item mfg. order No..<p>
	 *
	 */
	public String itm_mfg_inst_no() {
		return getConstString(offset + 3, $itm_mfg_inst_no);
	}

	/**
	 * 品目製造指図ＮＯ. Item mfg. order No..<p>
	 *
	 */
	public void itm_mfg_inst_no(String value) {
		setConstString(offset + 3, $itm_mfg_inst_no, value);
	}

	/**
	 * 工程指図ＮＯ. Operation order No..<p>
	 *
	 */
	public String oper_inst_no() {
		return getConstString(offset + 4, $oper_inst_no);
	}

	/**
	 * 工程指図ＮＯ. Operation order No..<p>
	 *
	 */
	public void oper_inst_no(String value) {
		setConstString(offset + 4, $oper_inst_no, value);
	}

	/**
	 * 固定工数. Constant man-hour.<p>
	 *
	 */
	public MCNumber fxd_wk_cost() {
		return getConstNumber(offset + 5, $fxd_wk_cost);
	}

	/**
	 * 固定工数. Constant man-hour.<p>
	 *
	 */
	public void fxd_wk_cost(MCNumber value) {
		setConstNumber(offset + 5, $fxd_wk_cost, value);
	}
	
	/**
	 * 固定工数. Constant man-hour.<p>
	 *
	 */
	public void fxd_wk_cost(int value) {
		setConstNumber(offset + 5, $fxd_wk_cost, value);
	}
	
	/**
	 * 固定工数. Constant man-hour.<p>
	 *
	 */
	public void fxd_wk_cost(long value) {
		setConstNumber(offset + 5, $fxd_wk_cost, value);
	}
	
	/**
	 * 固定工数. Constant man-hour.<p>
	 *
	 */
	public void fxd_wk_cost(float value) {
		setConstNumber(offset + 5, $fxd_wk_cost, value);
	}
	
	/**
	 * 固定工数. Constant man-hour.<p>
	 *
	 */
	public void fxd_wk_cost(double value) {
		setConstNumber(offset + 5, $fxd_wk_cost, value);
	}
	
	/**
	 * 数量依存工数. Qty.-dependent man-hours.<p>
	 *
	 */
	public MCNumber wk_cost() {
		return getConstNumber(offset + 6, $wk_cost);
	}

	/**
	 * 数量依存工数. Qty.-dependent man-hours.<p>
	 *
	 */
	public void wk_cost(MCNumber value) {
		setConstNumber(offset + 6, $wk_cost, value);
	}
	
	/**
	 * 数量依存工数. Qty.-dependent man-hours.<p>
	 *
	 */
	public void wk_cost(int value) {
		setConstNumber(offset + 6, $wk_cost, value);
	}
	
	/**
	 * 数量依存工数. Qty.-dependent man-hours.<p>
	 *
	 */
	public void wk_cost(long value) {
		setConstNumber(offset + 6, $wk_cost, value);
	}
	
	/**
	 * 数量依存工数. Qty.-dependent man-hours.<p>
	 *
	 */
	public void wk_cost(float value) {
		setConstNumber(offset + 6, $wk_cost, value);
	}
	
	/**
	 * 数量依存工数. Qty.-dependent man-hours.<p>
	 *
	 */
	public void wk_cost(double value) {
		setConstNumber(offset + 6, $wk_cost, value);
	}
	
	/**
	 * 残工数. Remaining man-hour.<p>
	 *
	 */
	public MCNumber rem_wk_cost() {
		return getConstNumber(offset + 7, $rem_wk_cost);
	}

	/**
	 * 残工数. Remaining man-hour.<p>
	 *
	 */
	public void rem_wk_cost(MCNumber value) {
		setConstNumber(offset + 7, $rem_wk_cost, value);
	}
	
	/**
	 * 残工数. Remaining man-hour.<p>
	 *
	 */
	public void rem_wk_cost(int value) {
		setConstNumber(offset + 7, $rem_wk_cost, value);
	}
	
	/**
	 * 残工数. Remaining man-hour.<p>
	 *
	 */
	public void rem_wk_cost(long value) {
		setConstNumber(offset + 7, $rem_wk_cost, value);
	}
	
	/**
	 * 残工数. Remaining man-hour.<p>
	 *
	 */
	public void rem_wk_cost(float value) {
		setConstNumber(offset + 7, $rem_wk_cost, value);
	}
	
	/**
	 * 残工数. Remaining man-hour.<p>
	 *
	 */
	public void rem_wk_cost(double value) {
		setConstNumber(offset + 7, $rem_wk_cost, value);
	}
	
	/**
	 * 打切工数. Cancel remaining man-hour.<p>
	 *
	 */
	public MCNumber abort_wk_cost() {
		return getConstNumber(offset + 8, $abort_wk_cost);
	}

	/**
	 * 打切工数. Cancel remaining man-hour.<p>
	 *
	 */
	public void abort_wk_cost(MCNumber value) {
		setConstNumber(offset + 8, $abort_wk_cost, value);
	}
	
	/**
	 * 打切工数. Cancel remaining man-hour.<p>
	 *
	 */
	public void abort_wk_cost(int value) {
		setConstNumber(offset + 8, $abort_wk_cost, value);
	}
	
	/**
	 * 打切工数. Cancel remaining man-hour.<p>
	 *
	 */
	public void abort_wk_cost(long value) {
		setConstNumber(offset + 8, $abort_wk_cost, value);
	}
	
	/**
	 * 打切工数. Cancel remaining man-hour.<p>
	 *
	 */
	public void abort_wk_cost(float value) {
		setConstNumber(offset + 8, $abort_wk_cost, value);
	}
	
	/**
	 * 打切工数. Cancel remaining man-hour.<p>
	 *
	 */
	public void abort_wk_cost(double value) {
		setConstNumber(offset + 8, $abort_wk_cost, value);
	}
	
	/**
	 * 予備１. Spare 1.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 9, $sub_char1);
	}

	/**
	 * 予備１. Spare 1.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 9, $sub_char1, value);
	}

	/**
	 * 予備２. Spare 2.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 10, $sub_char2);
	}

	/**
	 * 予備２. Spare 2.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 10, $sub_char2, value);
	}

	/**
	 * 予備３. Spare 3.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 11, $sub_char3);
	}

	/**
	 * 予備３. Spare 3.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 11, $sub_char3, value);
	}

	public String getString(String name) {
		if ($wk_schd_no.equalsIgnoreCase(name)) {
			return wk_schd_no();
		}
		if ($mfg_sts_typ.equalsIgnoreCase(name)) {
			return mfg_sts_typ();
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			return mfg_inst_no();
		}
		if ($itm_mfg_inst_no.equalsIgnoreCase(name)) {
			return itm_mfg_inst_no();
		}
		if ($oper_inst_no.equalsIgnoreCase(name)) {
			return oper_inst_no();
		}
		if ($sub_char1.equalsIgnoreCase(name)) {
			return sub_char1();
		}
		if ($sub_char2.equalsIgnoreCase(name)) {
			return sub_char2();
		}
		if ($sub_char3.equalsIgnoreCase(name)) {
			return sub_char3();
		}
		return super.getString(name);
	}

	public MCNumber getNumber(String name) {
		if ($fxd_wk_cost.equalsIgnoreCase(name)) {
			return fxd_wk_cost();
		}
		if ($wk_cost.equalsIgnoreCase(name)) {
			return wk_cost();
		}
		if ($rem_wk_cost.equalsIgnoreCase(name)) {
			return rem_wk_cost();
		}
		if ($abort_wk_cost.equalsIgnoreCase(name)) {
			return abort_wk_cost();
		}
		return super.getNumber(name);
	}

	public String getStringNE(String name) {
		if ($wk_schd_no.equalsIgnoreCase(name)) {
			return wk_schd_no();
		}
		if ($mfg_sts_typ.equalsIgnoreCase(name)) {
			return mfg_sts_typ();
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			return mfg_inst_no();
		}
		if ($itm_mfg_inst_no.equalsIgnoreCase(name)) {
			return itm_mfg_inst_no();
		}
		if ($oper_inst_no.equalsIgnoreCase(name)) {
			return oper_inst_no();
		}
		if ($sub_char1.equalsIgnoreCase(name)) {
			return sub_char1();
		}
		if ($sub_char2.equalsIgnoreCase(name)) {
			return sub_char2();
		}
		if ($sub_char3.equalsIgnoreCase(name)) {
			return sub_char3();
		}
		return super.getStringNE(name);
	}

	public MCNumber getNumberNE(String name) {
		if ($fxd_wk_cost.equalsIgnoreCase(name)) {
			return fxd_wk_cost();
		}
		if ($wk_cost.equalsIgnoreCase(name)) {
			return wk_cost();
		}
		if ($rem_wk_cost.equalsIgnoreCase(name)) {
			return rem_wk_cost();
		}
		if ($abort_wk_cost.equalsIgnoreCase(name)) {
			return abort_wk_cost();
		}
		return super.getNumberNE(name);
	}

	public void setString(String name, String value) {
		if ($wk_schd_no.equalsIgnoreCase(name)) {
			wk_schd_no(value);
			return;
		}
		if ($mfg_sts_typ.equalsIgnoreCase(name)) {
			mfg_sts_typ(value);
			return;
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			mfg_inst_no(value);
			return;
		}
		if ($itm_mfg_inst_no.equalsIgnoreCase(name)) {
			itm_mfg_inst_no(value);
			return;
		}
		if ($oper_inst_no.equalsIgnoreCase(name)) {
			oper_inst_no(value);
			return;
		}
		if ($sub_char1.equalsIgnoreCase(name)) {
			sub_char1(value);
			return;
		}
		if ($sub_char2.equalsIgnoreCase(name)) {
			sub_char2(value);
			return;
		}
		if ($sub_char3.equalsIgnoreCase(name)) {
			sub_char3(value);
			return;
		}
		super.setString(name, value);
	}

	public void setNumber(String name, MCNumber value) {
		if ($fxd_wk_cost.equalsIgnoreCase(name)) {
			fxd_wk_cost(value);
			return;
		}
		if ($wk_cost.equalsIgnoreCase(name)) {
			wk_cost(value);
			return;
		}
		if ($rem_wk_cost.equalsIgnoreCase(name)) {
			rem_wk_cost(value);
			return;
		}
		if ($abort_wk_cost.equalsIgnoreCase(name)) {
			abort_wk_cost(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, int value) {
		if ($fxd_wk_cost.equalsIgnoreCase(name)) {
			fxd_wk_cost(value);
			return;
		}
		if ($wk_cost.equalsIgnoreCase(name)) {
			wk_cost(value);
			return;
		}
		if ($rem_wk_cost.equalsIgnoreCase(name)) {
			rem_wk_cost(value);
			return;
		}
		if ($abort_wk_cost.equalsIgnoreCase(name)) {
			abort_wk_cost(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, long value) {
		if ($fxd_wk_cost.equalsIgnoreCase(name)) {
			fxd_wk_cost(value);
			return;
		}
		if ($wk_cost.equalsIgnoreCase(name)) {
			wk_cost(value);
			return;
		}
		if ($rem_wk_cost.equalsIgnoreCase(name)) {
			rem_wk_cost(value);
			return;
		}
		if ($abort_wk_cost.equalsIgnoreCase(name)) {
			abort_wk_cost(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, float value) {
		if ($fxd_wk_cost.equalsIgnoreCase(name)) {
			fxd_wk_cost(value);
			return;
		}
		if ($wk_cost.equalsIgnoreCase(name)) {
			wk_cost(value);
			return;
		}
		if ($rem_wk_cost.equalsIgnoreCase(name)) {
			rem_wk_cost(value);
			return;
		}
		if ($abort_wk_cost.equalsIgnoreCase(name)) {
			abort_wk_cost(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, double value) {
		if ($fxd_wk_cost.equalsIgnoreCase(name)) {
			fxd_wk_cost(value);
			return;
		}
		if ($wk_cost.equalsIgnoreCase(name)) {
			wk_cost(value);
			return;
		}
		if ($rem_wk_cost.equalsIgnoreCase(name)) {
			rem_wk_cost(value);
			return;
		}
		if ($abort_wk_cost.equalsIgnoreCase(name)) {
			abort_wk_cost(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($wk_schd_no.equalsIgnoreCase(name)) {
			wk_schd_no(value);
			return;
		}
		if ($mfg_sts_typ.equalsIgnoreCase(name)) {
			mfg_sts_typ(value);
			return;
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			mfg_inst_no(value);
			return;
		}
		if ($itm_mfg_inst_no.equalsIgnoreCase(name)) {
			itm_mfg_inst_no(value);
			return;
		}
		if ($oper_inst_no.equalsIgnoreCase(name)) {
			oper_inst_no(value);
			return;
		}
		if ($sub_char1.equalsIgnoreCase(name)) {
			sub_char1(value);
			return;
		}
		if ($sub_char2.equalsIgnoreCase(name)) {
			sub_char2(value);
			return;
		}
		if ($sub_char3.equalsIgnoreCase(name)) {
			sub_char3(value);
			return;
		}
		super.setStringNE(name, value);
	}

	public void setNumberNE(String name, MCNumber value) {
		if ($fxd_wk_cost.equalsIgnoreCase(name)) {
			fxd_wk_cost(value);
			return;
		}
		if ($wk_cost.equalsIgnoreCase(name)) {
			wk_cost(value);
			return;
		}
		if ($rem_wk_cost.equalsIgnoreCase(name)) {
			rem_wk_cost(value);
			return;
		}
		if ($abort_wk_cost.equalsIgnoreCase(name)) {
			abort_wk_cost(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, int value) {
		if ($fxd_wk_cost.equalsIgnoreCase(name)) {
			fxd_wk_cost(value);
			return;
		}
		if ($wk_cost.equalsIgnoreCase(name)) {
			wk_cost(value);
			return;
		}
		if ($rem_wk_cost.equalsIgnoreCase(name)) {
			rem_wk_cost(value);
			return;
		}
		if ($abort_wk_cost.equalsIgnoreCase(name)) {
			abort_wk_cost(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, long value) {
		if ($fxd_wk_cost.equalsIgnoreCase(name)) {
			fxd_wk_cost(value);
			return;
		}
		if ($wk_cost.equalsIgnoreCase(name)) {
			wk_cost(value);
			return;
		}
		if ($rem_wk_cost.equalsIgnoreCase(name)) {
			rem_wk_cost(value);
			return;
		}
		if ($abort_wk_cost.equalsIgnoreCase(name)) {
			abort_wk_cost(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, float value) {
		if ($fxd_wk_cost.equalsIgnoreCase(name)) {
			fxd_wk_cost(value);
			return;
		}
		if ($wk_cost.equalsIgnoreCase(name)) {
			wk_cost(value);
			return;
		}
		if ($rem_wk_cost.equalsIgnoreCase(name)) {
			rem_wk_cost(value);
			return;
		}
		if ($abort_wk_cost.equalsIgnoreCase(name)) {
			abort_wk_cost(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, double value) {
		if ($fxd_wk_cost.equalsIgnoreCase(name)) {
			fxd_wk_cost(value);
			return;
		}
		if ($wk_cost.equalsIgnoreCase(name)) {
			wk_cost(value);
			return;
		}
		if ($rem_wk_cost.equalsIgnoreCase(name)) {
			rem_wk_cost(value);
			return;
		}
		if ($abort_wk_cost.equalsIgnoreCase(name)) {
			abort_wk_cost(value);
			return;
		}
		super.setNumberNE(name, value);
	}

}
