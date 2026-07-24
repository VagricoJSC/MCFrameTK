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
 * "出来高予定進捗ビュー // Output schedule progress view"DBコンテナRowクラスです。<p>
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
 *  	<td>yield_schd_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>出来高予定ＮＯ</td>
 *  	<td>Output schedule No.</td>
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
 *  	<td>yield_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>出来高区分</td>
 *  	<td>Output type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>trd_unit_yield_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>取引単位出来高着手数量</td>
 *  	<td>Transaction unit output remaining starting qty.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>trd_unit_yield_rem_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>取引単位出来高残数量</td>
 *  	<td>Transaction unit remaining output qty.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>trd_unit_yield_abort_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>取引単位出来高打切数量</td>
 *  	<td>Transaction unit cancelled remaining output qty.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>base_unit_yield_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>基準単位出来高着手数量</td>
 *  	<td>Base unit output start qty.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>base_unit_yield_rem_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>基準単位出来高残数量</td>
 *  	<td>Base unit remaining output qty.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>base_unit_yield_abort_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>基準単位出来高打切数量</td>
 *  	<td>Base unit cancelled remaining output qty.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>stk_lst_prnt_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>現品票発行済ＦＬＧ</td>
 *  	<td>Identification tag issued flg.</td>
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
public class MSVT_YIELD_SCHD_PR_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.VIEW;

	public static final String TABLE_NAME = "MSVT_YIELD_SCHD_PR";

	public static final boolean EX_CTRL = false;
	
	public static final boolean LCL_TABLE = false;
	
	/**
	 * 出来高予定ＮＯ. Output schedule No..<p>
	 *
	 */
	public static final String $yield_schd_no = "yield_schd_no";
	private static final MCPermColumnInfo _yield_schd_no = createColumnInfo("yield_schd_no");
	public final MCStringPermColumn yield_schd_no = createStringColumn(_yield_schd_no);
	
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
	 * 出来高区分. Output type.<p>
	 *
	 */
	public static final String $yield_typ = "yield_typ";
	private static final MCPermColumnInfo _yield_typ = createColumnInfo("yield_typ");
	public final MCStringPermColumn yield_typ = createStringColumn(_yield_typ);
	
	/**
	 * 取引単位出来高着手数量. Transaction unit output remaining starting qty..<p>
	 *
	 */
	public static final String $trd_unit_yield_qty = "trd_unit_yield_qty";
	private static final MCPermColumnInfo _trd_unit_yield_qty = createColumnInfo("trd_unit_yield_qty");
	public final MCNumberPermColumn trd_unit_yield_qty = createNumberColumn(_trd_unit_yield_qty);
	
	/**
	 * 取引単位出来高残数量. Transaction unit remaining output qty..<p>
	 *
	 */
	public static final String $trd_unit_yield_rem_qty = "trd_unit_yield_rem_qty";
	private static final MCPermColumnInfo _trd_unit_yield_rem_qty = createColumnInfo("trd_unit_yield_rem_qty");
	public final MCNumberPermColumn trd_unit_yield_rem_qty = createNumberColumn(_trd_unit_yield_rem_qty);
	
	/**
	 * 取引単位出来高打切数量. Transaction unit cancelled remaining output qty..<p>
	 *
	 */
	public static final String $trd_unit_yield_abort_qty = "trd_unit_yield_abort_qty";
	private static final MCPermColumnInfo _trd_unit_yield_abort_qty = createColumnInfo("trd_unit_yield_abort_qty");
	public final MCNumberPermColumn trd_unit_yield_abort_qty = createNumberColumn(_trd_unit_yield_abort_qty);
	
	/**
	 * 基準単位出来高着手数量. Base unit output start qty..<p>
	 *
	 */
	public static final String $base_unit_yield_qty = "base_unit_yield_qty";
	private static final MCPermColumnInfo _base_unit_yield_qty = createColumnInfo("base_unit_yield_qty");
	public final MCNumberPermColumn base_unit_yield_qty = createNumberColumn(_base_unit_yield_qty);
	
	/**
	 * 基準単位出来高残数量. Base unit remaining output qty..<p>
	 *
	 */
	public static final String $base_unit_yield_rem_qty = "base_unit_yield_rem_qty";
	private static final MCPermColumnInfo _base_unit_yield_rem_qty = createColumnInfo("base_unit_yield_rem_qty");
	public final MCNumberPermColumn base_unit_yield_rem_qty = createNumberColumn(_base_unit_yield_rem_qty);
	
	/**
	 * 基準単位出来高打切数量. Base unit cancelled remaining output qty..<p>
	 *
	 */
	public static final String $base_unit_yield_abort_qty = "base_unit_yield_abort_qty";
	private static final MCPermColumnInfo _base_unit_yield_abort_qty = createColumnInfo("base_unit_yield_abort_qty");
	public final MCNumberPermColumn base_unit_yield_abort_qty = createNumberColumn(_base_unit_yield_abort_qty);
	
	/**
	 * 現品票発行済ＦＬＧ. Identification tag issued flg..<p>
	 *
	 */
	public static final String $stk_lst_prnt_flg = "stk_lst_prnt_flg";
	private static final MCPermColumnInfo _stk_lst_prnt_flg = createColumnInfo("stk_lst_prnt_flg");
	public final MCBooleanPermColumn stk_lst_prnt_flg = createBooleanColumn(_stk_lst_prnt_flg);
	
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
	
	public static final MCMeta yield_schd_no_META = createCommonMeta($yield_schd_no, mcframe.commonMA.meta.MA_META.YIELD_SCHD_NO);
	public static final MCMeta mfg_sts_typ_META = createCommonMeta($mfg_sts_typ, mcframe.commonMS.meta.MS_META.MFG_STS_TYP);
	public static final MCMeta mfg_inst_no_META = createCommonMeta($mfg_inst_no, mcframe.commonMA.meta.MA_META.MFG_INST_NO);
	public static final MCMeta itm_mfg_inst_no_META = createCommonMeta($itm_mfg_inst_no, mcframe.commonMA.meta.MA_META.ITM_MFG_INST_NO);
	public static final MCMeta oper_inst_no_META = createCommonMeta($oper_inst_no, mcframe.commonMA.meta.MA_META.OPER_INST_NO);
	public static final MCMeta yield_typ_META = createCommonMeta($yield_typ, mcframe.commonMA.meta.MA_META.YIELD_TYP);
	public static final MCMeta trd_unit_yield_qty_META = createCommonMeta($trd_unit_yield_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta trd_unit_yield_rem_qty_META = createCommonMeta($trd_unit_yield_rem_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta trd_unit_yield_abort_qty_META = createCommonMeta($trd_unit_yield_abort_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_yield_qty_META = createCommonMeta($base_unit_yield_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_yield_rem_qty_META = createCommonMeta($base_unit_yield_rem_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_yield_abort_qty_META = createCommonMeta($base_unit_yield_abort_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta stk_lst_prnt_flg_META = createCommonMeta($stk_lst_prnt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.YIELD_ACT_REM_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.YIELD_ACT_REM_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.YIELD_ACT_REM_SUB_CHAR3);

	protected static final List<MCForeignInfo> FOREIGN_INFO_LIST = new ArrayList<>();
	static {
	}
	
	protected static final ConstMetaList<MSVT_YIELD_SCHD_PR_R> constMetas = new ConstMetaList<MSVT_YIELD_SCHD_PR_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			yield_schd_no_META,
			mfg_sts_typ_META,
			mfg_inst_no_META,
			itm_mfg_inst_no_META,
			oper_inst_no_META,
			yield_typ_META,
			trd_unit_yield_qty_META,
			trd_unit_yield_rem_qty_META,
			trd_unit_yield_abort_qty_META,
			base_unit_yield_qty_META,
			base_unit_yield_rem_qty_META,
			base_unit_yield_abort_qty_META,
			stk_lst_prnt_flg_META,
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
	protected MSVT_YIELD_SCHD_PR_R(ConstMetaList<? extends MSVT_YIELD_SCHD_PR_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MSVT_YIELD_SCHD_PR_R(ConstMetaList<? extends MSVT_YIELD_SCHD_PR_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MSVT_YIELD_SCHD_PR_R.$yield_schd_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_YIELD_SCHD_PR_R.$yield_schd_no,
				"yield_schd_no",
				yield_schd_no,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_YIELD_SCHD_PR_R.$mfg_sts_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_YIELD_SCHD_PR_R.$mfg_sts_typ,
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
			MSVT_YIELD_SCHD_PR_R.$mfg_inst_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_YIELD_SCHD_PR_R.$mfg_inst_no,
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
			MSVT_YIELD_SCHD_PR_R.$itm_mfg_inst_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_YIELD_SCHD_PR_R.$itm_mfg_inst_no,
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
			MSVT_YIELD_SCHD_PR_R.$oper_inst_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_YIELD_SCHD_PR_R.$oper_inst_no,
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
			MSVT_YIELD_SCHD_PR_R.$yield_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_YIELD_SCHD_PR_R.$yield_typ,
				"yield_typ",
				yield_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_YIELD_SCHD_PR_R.$trd_unit_yield_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MSVT_YIELD_SCHD_PR_R.$trd_unit_yield_qty,
				"trd_unit_yield_qty",
				trd_unit_yield_qty,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_YIELD_SCHD_PR_R.$trd_unit_yield_rem_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MSVT_YIELD_SCHD_PR_R.$trd_unit_yield_rem_qty,
				"trd_unit_yield_rem_qty",
				trd_unit_yield_rem_qty,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_YIELD_SCHD_PR_R.$trd_unit_yield_abort_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MSVT_YIELD_SCHD_PR_R.$trd_unit_yield_abort_qty,
				"trd_unit_yield_abort_qty",
				trd_unit_yield_abort_qty,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_YIELD_SCHD_PR_R.$base_unit_yield_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MSVT_YIELD_SCHD_PR_R.$base_unit_yield_qty,
				"base_unit_yield_qty",
				base_unit_yield_qty,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_YIELD_SCHD_PR_R.$base_unit_yield_rem_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MSVT_YIELD_SCHD_PR_R.$base_unit_yield_rem_qty,
				"base_unit_yield_rem_qty",
				base_unit_yield_rem_qty,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_YIELD_SCHD_PR_R.$base_unit_yield_abort_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MSVT_YIELD_SCHD_PR_R.$base_unit_yield_abort_qty,
				"base_unit_yield_abort_qty",
				base_unit_yield_abort_qty,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_YIELD_SCHD_PR_R.$stk_lst_prnt_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MSVT_YIELD_SCHD_PR_R.$stk_lst_prnt_flg,
				"stk_lst_prnt_flg",
				stk_lst_prnt_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_YIELD_SCHD_PR_R.$sub_char1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_YIELD_SCHD_PR_R.$sub_char1,
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
			MSVT_YIELD_SCHD_PR_R.$sub_char2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_YIELD_SCHD_PR_R.$sub_char2,
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
			MSVT_YIELD_SCHD_PR_R.$sub_char3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_YIELD_SCHD_PR_R.$sub_char3,
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
	public static MSVT_YIELD_SCHD_PR_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MSVT_YIELD_SCHD_PR_R create(String alias) {
		MSVT_YIELD_SCHD_PR_R row = new MSVT_YIELD_SCHD_PR_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MSVT_YIELD_SCHD_PR_R createByName(T proto) {
		MSVT_YIELD_SCHD_PR_R row = MSVT_YIELD_SCHD_PR_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MSVT_YIELD_SCHD_PR_R clone() {
		return (MSVT_YIELD_SCHD_PR_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MSVT_YIELD_SCHD_PR_R createInstance() {
		return (MSVT_YIELD_SCHD_PR_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MSVT_YIELD_SCHD_PR_R getValues(String... names) {
		return (MSVT_YIELD_SCHD_PR_R) super.getValues(names);
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
	 * 出来高予定ＮＯ. Output schedule No..<p>
	 *
	 */
	public String yield_schd_no() {
		return getConstString(offset + 0, $yield_schd_no);
	}

	/**
	 * 出来高予定ＮＯ. Output schedule No..<p>
	 *
	 */
	public void yield_schd_no(String value) {
		setConstString(offset + 0, $yield_schd_no, value);
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
	 * 出来高区分. Output type.<p>
	 *
	 */
	public String yield_typ() {
		return getConstString(offset + 5, $yield_typ);
	}

	/**
	 * 出来高区分. Output type.<p>
	 *
	 */
	public void yield_typ(String value) {
		setConstString(offset + 5, $yield_typ, value);
	}

	/**
	 * 取引単位出来高着手数量. Transaction unit output remaining starting qty..<p>
	 *
	 */
	public MCNumber trd_unit_yield_qty() {
		return getConstNumber(offset + 6, $trd_unit_yield_qty);
	}

	/**
	 * 取引単位出来高着手数量. Transaction unit output remaining starting qty..<p>
	 *
	 */
	public void trd_unit_yield_qty(MCNumber value) {
		setConstNumber(offset + 6, $trd_unit_yield_qty, value);
	}
	
	/**
	 * 取引単位出来高着手数量. Transaction unit output remaining starting qty..<p>
	 *
	 */
	public void trd_unit_yield_qty(int value) {
		setConstNumber(offset + 6, $trd_unit_yield_qty, value);
	}
	
	/**
	 * 取引単位出来高着手数量. Transaction unit output remaining starting qty..<p>
	 *
	 */
	public void trd_unit_yield_qty(long value) {
		setConstNumber(offset + 6, $trd_unit_yield_qty, value);
	}
	
	/**
	 * 取引単位出来高着手数量. Transaction unit output remaining starting qty..<p>
	 *
	 */
	public void trd_unit_yield_qty(float value) {
		setConstNumber(offset + 6, $trd_unit_yield_qty, value);
	}
	
	/**
	 * 取引単位出来高着手数量. Transaction unit output remaining starting qty..<p>
	 *
	 */
	public void trd_unit_yield_qty(double value) {
		setConstNumber(offset + 6, $trd_unit_yield_qty, value);
	}
	
	/**
	 * 取引単位出来高残数量. Transaction unit remaining output qty..<p>
	 *
	 */
	public MCNumber trd_unit_yield_rem_qty() {
		return getConstNumber(offset + 7, $trd_unit_yield_rem_qty);
	}

	/**
	 * 取引単位出来高残数量. Transaction unit remaining output qty..<p>
	 *
	 */
	public void trd_unit_yield_rem_qty(MCNumber value) {
		setConstNumber(offset + 7, $trd_unit_yield_rem_qty, value);
	}
	
	/**
	 * 取引単位出来高残数量. Transaction unit remaining output qty..<p>
	 *
	 */
	public void trd_unit_yield_rem_qty(int value) {
		setConstNumber(offset + 7, $trd_unit_yield_rem_qty, value);
	}
	
	/**
	 * 取引単位出来高残数量. Transaction unit remaining output qty..<p>
	 *
	 */
	public void trd_unit_yield_rem_qty(long value) {
		setConstNumber(offset + 7, $trd_unit_yield_rem_qty, value);
	}
	
	/**
	 * 取引単位出来高残数量. Transaction unit remaining output qty..<p>
	 *
	 */
	public void trd_unit_yield_rem_qty(float value) {
		setConstNumber(offset + 7, $trd_unit_yield_rem_qty, value);
	}
	
	/**
	 * 取引単位出来高残数量. Transaction unit remaining output qty..<p>
	 *
	 */
	public void trd_unit_yield_rem_qty(double value) {
		setConstNumber(offset + 7, $trd_unit_yield_rem_qty, value);
	}
	
	/**
	 * 取引単位出来高打切数量. Transaction unit cancelled remaining output qty..<p>
	 *
	 */
	public MCNumber trd_unit_yield_abort_qty() {
		return getConstNumber(offset + 8, $trd_unit_yield_abort_qty);
	}

	/**
	 * 取引単位出来高打切数量. Transaction unit cancelled remaining output qty..<p>
	 *
	 */
	public void trd_unit_yield_abort_qty(MCNumber value) {
		setConstNumber(offset + 8, $trd_unit_yield_abort_qty, value);
	}
	
	/**
	 * 取引単位出来高打切数量. Transaction unit cancelled remaining output qty..<p>
	 *
	 */
	public void trd_unit_yield_abort_qty(int value) {
		setConstNumber(offset + 8, $trd_unit_yield_abort_qty, value);
	}
	
	/**
	 * 取引単位出来高打切数量. Transaction unit cancelled remaining output qty..<p>
	 *
	 */
	public void trd_unit_yield_abort_qty(long value) {
		setConstNumber(offset + 8, $trd_unit_yield_abort_qty, value);
	}
	
	/**
	 * 取引単位出来高打切数量. Transaction unit cancelled remaining output qty..<p>
	 *
	 */
	public void trd_unit_yield_abort_qty(float value) {
		setConstNumber(offset + 8, $trd_unit_yield_abort_qty, value);
	}
	
	/**
	 * 取引単位出来高打切数量. Transaction unit cancelled remaining output qty..<p>
	 *
	 */
	public void trd_unit_yield_abort_qty(double value) {
		setConstNumber(offset + 8, $trd_unit_yield_abort_qty, value);
	}
	
	/**
	 * 基準単位出来高着手数量. Base unit output start qty..<p>
	 *
	 */
	public MCNumber base_unit_yield_qty() {
		return getConstNumber(offset + 9, $base_unit_yield_qty);
	}

	/**
	 * 基準単位出来高着手数量. Base unit output start qty..<p>
	 *
	 */
	public void base_unit_yield_qty(MCNumber value) {
		setConstNumber(offset + 9, $base_unit_yield_qty, value);
	}
	
	/**
	 * 基準単位出来高着手数量. Base unit output start qty..<p>
	 *
	 */
	public void base_unit_yield_qty(int value) {
		setConstNumber(offset + 9, $base_unit_yield_qty, value);
	}
	
	/**
	 * 基準単位出来高着手数量. Base unit output start qty..<p>
	 *
	 */
	public void base_unit_yield_qty(long value) {
		setConstNumber(offset + 9, $base_unit_yield_qty, value);
	}
	
	/**
	 * 基準単位出来高着手数量. Base unit output start qty..<p>
	 *
	 */
	public void base_unit_yield_qty(float value) {
		setConstNumber(offset + 9, $base_unit_yield_qty, value);
	}
	
	/**
	 * 基準単位出来高着手数量. Base unit output start qty..<p>
	 *
	 */
	public void base_unit_yield_qty(double value) {
		setConstNumber(offset + 9, $base_unit_yield_qty, value);
	}
	
	/**
	 * 基準単位出来高残数量. Base unit remaining output qty..<p>
	 *
	 */
	public MCNumber base_unit_yield_rem_qty() {
		return getConstNumber(offset + 10, $base_unit_yield_rem_qty);
	}

	/**
	 * 基準単位出来高残数量. Base unit remaining output qty..<p>
	 *
	 */
	public void base_unit_yield_rem_qty(MCNumber value) {
		setConstNumber(offset + 10, $base_unit_yield_rem_qty, value);
	}
	
	/**
	 * 基準単位出来高残数量. Base unit remaining output qty..<p>
	 *
	 */
	public void base_unit_yield_rem_qty(int value) {
		setConstNumber(offset + 10, $base_unit_yield_rem_qty, value);
	}
	
	/**
	 * 基準単位出来高残数量. Base unit remaining output qty..<p>
	 *
	 */
	public void base_unit_yield_rem_qty(long value) {
		setConstNumber(offset + 10, $base_unit_yield_rem_qty, value);
	}
	
	/**
	 * 基準単位出来高残数量. Base unit remaining output qty..<p>
	 *
	 */
	public void base_unit_yield_rem_qty(float value) {
		setConstNumber(offset + 10, $base_unit_yield_rem_qty, value);
	}
	
	/**
	 * 基準単位出来高残数量. Base unit remaining output qty..<p>
	 *
	 */
	public void base_unit_yield_rem_qty(double value) {
		setConstNumber(offset + 10, $base_unit_yield_rem_qty, value);
	}
	
	/**
	 * 基準単位出来高打切数量. Base unit cancelled remaining output qty..<p>
	 *
	 */
	public MCNumber base_unit_yield_abort_qty() {
		return getConstNumber(offset + 11, $base_unit_yield_abort_qty);
	}

	/**
	 * 基準単位出来高打切数量. Base unit cancelled remaining output qty..<p>
	 *
	 */
	public void base_unit_yield_abort_qty(MCNumber value) {
		setConstNumber(offset + 11, $base_unit_yield_abort_qty, value);
	}
	
	/**
	 * 基準単位出来高打切数量. Base unit cancelled remaining output qty..<p>
	 *
	 */
	public void base_unit_yield_abort_qty(int value) {
		setConstNumber(offset + 11, $base_unit_yield_abort_qty, value);
	}
	
	/**
	 * 基準単位出来高打切数量. Base unit cancelled remaining output qty..<p>
	 *
	 */
	public void base_unit_yield_abort_qty(long value) {
		setConstNumber(offset + 11, $base_unit_yield_abort_qty, value);
	}
	
	/**
	 * 基準単位出来高打切数量. Base unit cancelled remaining output qty..<p>
	 *
	 */
	public void base_unit_yield_abort_qty(float value) {
		setConstNumber(offset + 11, $base_unit_yield_abort_qty, value);
	}
	
	/**
	 * 基準単位出来高打切数量. Base unit cancelled remaining output qty..<p>
	 *
	 */
	public void base_unit_yield_abort_qty(double value) {
		setConstNumber(offset + 11, $base_unit_yield_abort_qty, value);
	}
	
	/**
	 * 現品票発行済ＦＬＧ. Identification tag issued flg..<p>
	 *
	 */
	public boolean stk_lst_prnt_flg() {
		return getConstBoolean(offset + 12, $stk_lst_prnt_flg);
	}

	/**
	 * 現品票発行済ＦＬＧ. Identification tag issued flg..<p>
	 *
	 */
	public void stk_lst_prnt_flg(boolean value) {
		setConstBoolean(offset + 12, $stk_lst_prnt_flg, value);
	}

	/**
	 * 予備１. Spare 1.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 13, $sub_char1);
	}

	/**
	 * 予備１. Spare 1.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 13, $sub_char1, value);
	}

	/**
	 * 予備２. Spare 2.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 14, $sub_char2);
	}

	/**
	 * 予備２. Spare 2.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 14, $sub_char2, value);
	}

	/**
	 * 予備３. Spare 3.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 15, $sub_char3);
	}

	/**
	 * 予備３. Spare 3.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 15, $sub_char3, value);
	}

	public String getString(String name) {
		if ($yield_schd_no.equalsIgnoreCase(name)) {
			return yield_schd_no();
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
		if ($yield_typ.equalsIgnoreCase(name)) {
			return yield_typ();
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
		if ($trd_unit_yield_qty.equalsIgnoreCase(name)) {
			return trd_unit_yield_qty();
		}
		if ($trd_unit_yield_rem_qty.equalsIgnoreCase(name)) {
			return trd_unit_yield_rem_qty();
		}
		if ($trd_unit_yield_abort_qty.equalsIgnoreCase(name)) {
			return trd_unit_yield_abort_qty();
		}
		if ($base_unit_yield_qty.equalsIgnoreCase(name)) {
			return base_unit_yield_qty();
		}
		if ($base_unit_yield_rem_qty.equalsIgnoreCase(name)) {
			return base_unit_yield_rem_qty();
		}
		if ($base_unit_yield_abort_qty.equalsIgnoreCase(name)) {
			return base_unit_yield_abort_qty();
		}
		return super.getNumber(name);
	}

	public boolean getBoolean(String name) {
		if ($stk_lst_prnt_flg.equalsIgnoreCase(name)) {
			return stk_lst_prnt_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($yield_schd_no.equalsIgnoreCase(name)) {
			return yield_schd_no();
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
		if ($yield_typ.equalsIgnoreCase(name)) {
			return yield_typ();
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
		if ($trd_unit_yield_qty.equalsIgnoreCase(name)) {
			return trd_unit_yield_qty();
		}
		if ($trd_unit_yield_rem_qty.equalsIgnoreCase(name)) {
			return trd_unit_yield_rem_qty();
		}
		if ($trd_unit_yield_abort_qty.equalsIgnoreCase(name)) {
			return trd_unit_yield_abort_qty();
		}
		if ($base_unit_yield_qty.equalsIgnoreCase(name)) {
			return base_unit_yield_qty();
		}
		if ($base_unit_yield_rem_qty.equalsIgnoreCase(name)) {
			return base_unit_yield_rem_qty();
		}
		if ($base_unit_yield_abort_qty.equalsIgnoreCase(name)) {
			return base_unit_yield_abort_qty();
		}
		return super.getNumberNE(name);
	}

	public boolean getBooleanNE(String name) {
		if ($stk_lst_prnt_flg.equalsIgnoreCase(name)) {
			return stk_lst_prnt_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($yield_schd_no.equalsIgnoreCase(name)) {
			yield_schd_no(value);
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
		if ($yield_typ.equalsIgnoreCase(name)) {
			yield_typ(value);
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
		if ($trd_unit_yield_qty.equalsIgnoreCase(name)) {
			trd_unit_yield_qty(value);
			return;
		}
		if ($trd_unit_yield_rem_qty.equalsIgnoreCase(name)) {
			trd_unit_yield_rem_qty(value);
			return;
		}
		if ($trd_unit_yield_abort_qty.equalsIgnoreCase(name)) {
			trd_unit_yield_abort_qty(value);
			return;
		}
		if ($base_unit_yield_qty.equalsIgnoreCase(name)) {
			base_unit_yield_qty(value);
			return;
		}
		if ($base_unit_yield_rem_qty.equalsIgnoreCase(name)) {
			base_unit_yield_rem_qty(value);
			return;
		}
		if ($base_unit_yield_abort_qty.equalsIgnoreCase(name)) {
			base_unit_yield_abort_qty(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, int value) {
		if ($trd_unit_yield_qty.equalsIgnoreCase(name)) {
			trd_unit_yield_qty(value);
			return;
		}
		if ($trd_unit_yield_rem_qty.equalsIgnoreCase(name)) {
			trd_unit_yield_rem_qty(value);
			return;
		}
		if ($trd_unit_yield_abort_qty.equalsIgnoreCase(name)) {
			trd_unit_yield_abort_qty(value);
			return;
		}
		if ($base_unit_yield_qty.equalsIgnoreCase(name)) {
			base_unit_yield_qty(value);
			return;
		}
		if ($base_unit_yield_rem_qty.equalsIgnoreCase(name)) {
			base_unit_yield_rem_qty(value);
			return;
		}
		if ($base_unit_yield_abort_qty.equalsIgnoreCase(name)) {
			base_unit_yield_abort_qty(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, long value) {
		if ($trd_unit_yield_qty.equalsIgnoreCase(name)) {
			trd_unit_yield_qty(value);
			return;
		}
		if ($trd_unit_yield_rem_qty.equalsIgnoreCase(name)) {
			trd_unit_yield_rem_qty(value);
			return;
		}
		if ($trd_unit_yield_abort_qty.equalsIgnoreCase(name)) {
			trd_unit_yield_abort_qty(value);
			return;
		}
		if ($base_unit_yield_qty.equalsIgnoreCase(name)) {
			base_unit_yield_qty(value);
			return;
		}
		if ($base_unit_yield_rem_qty.equalsIgnoreCase(name)) {
			base_unit_yield_rem_qty(value);
			return;
		}
		if ($base_unit_yield_abort_qty.equalsIgnoreCase(name)) {
			base_unit_yield_abort_qty(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, float value) {
		if ($trd_unit_yield_qty.equalsIgnoreCase(name)) {
			trd_unit_yield_qty(value);
			return;
		}
		if ($trd_unit_yield_rem_qty.equalsIgnoreCase(name)) {
			trd_unit_yield_rem_qty(value);
			return;
		}
		if ($trd_unit_yield_abort_qty.equalsIgnoreCase(name)) {
			trd_unit_yield_abort_qty(value);
			return;
		}
		if ($base_unit_yield_qty.equalsIgnoreCase(name)) {
			base_unit_yield_qty(value);
			return;
		}
		if ($base_unit_yield_rem_qty.equalsIgnoreCase(name)) {
			base_unit_yield_rem_qty(value);
			return;
		}
		if ($base_unit_yield_abort_qty.equalsIgnoreCase(name)) {
			base_unit_yield_abort_qty(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, double value) {
		if ($trd_unit_yield_qty.equalsIgnoreCase(name)) {
			trd_unit_yield_qty(value);
			return;
		}
		if ($trd_unit_yield_rem_qty.equalsIgnoreCase(name)) {
			trd_unit_yield_rem_qty(value);
			return;
		}
		if ($trd_unit_yield_abort_qty.equalsIgnoreCase(name)) {
			trd_unit_yield_abort_qty(value);
			return;
		}
		if ($base_unit_yield_qty.equalsIgnoreCase(name)) {
			base_unit_yield_qty(value);
			return;
		}
		if ($base_unit_yield_rem_qty.equalsIgnoreCase(name)) {
			base_unit_yield_rem_qty(value);
			return;
		}
		if ($base_unit_yield_abort_qty.equalsIgnoreCase(name)) {
			base_unit_yield_abort_qty(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setBoolean(String name, boolean value) {
		if ($stk_lst_prnt_flg.equalsIgnoreCase(name)) {
			stk_lst_prnt_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($yield_schd_no.equalsIgnoreCase(name)) {
			yield_schd_no(value);
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
		if ($yield_typ.equalsIgnoreCase(name)) {
			yield_typ(value);
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
		if ($trd_unit_yield_qty.equalsIgnoreCase(name)) {
			trd_unit_yield_qty(value);
			return;
		}
		if ($trd_unit_yield_rem_qty.equalsIgnoreCase(name)) {
			trd_unit_yield_rem_qty(value);
			return;
		}
		if ($trd_unit_yield_abort_qty.equalsIgnoreCase(name)) {
			trd_unit_yield_abort_qty(value);
			return;
		}
		if ($base_unit_yield_qty.equalsIgnoreCase(name)) {
			base_unit_yield_qty(value);
			return;
		}
		if ($base_unit_yield_rem_qty.equalsIgnoreCase(name)) {
			base_unit_yield_rem_qty(value);
			return;
		}
		if ($base_unit_yield_abort_qty.equalsIgnoreCase(name)) {
			base_unit_yield_abort_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, int value) {
		if ($trd_unit_yield_qty.equalsIgnoreCase(name)) {
			trd_unit_yield_qty(value);
			return;
		}
		if ($trd_unit_yield_rem_qty.equalsIgnoreCase(name)) {
			trd_unit_yield_rem_qty(value);
			return;
		}
		if ($trd_unit_yield_abort_qty.equalsIgnoreCase(name)) {
			trd_unit_yield_abort_qty(value);
			return;
		}
		if ($base_unit_yield_qty.equalsIgnoreCase(name)) {
			base_unit_yield_qty(value);
			return;
		}
		if ($base_unit_yield_rem_qty.equalsIgnoreCase(name)) {
			base_unit_yield_rem_qty(value);
			return;
		}
		if ($base_unit_yield_abort_qty.equalsIgnoreCase(name)) {
			base_unit_yield_abort_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, long value) {
		if ($trd_unit_yield_qty.equalsIgnoreCase(name)) {
			trd_unit_yield_qty(value);
			return;
		}
		if ($trd_unit_yield_rem_qty.equalsIgnoreCase(name)) {
			trd_unit_yield_rem_qty(value);
			return;
		}
		if ($trd_unit_yield_abort_qty.equalsIgnoreCase(name)) {
			trd_unit_yield_abort_qty(value);
			return;
		}
		if ($base_unit_yield_qty.equalsIgnoreCase(name)) {
			base_unit_yield_qty(value);
			return;
		}
		if ($base_unit_yield_rem_qty.equalsIgnoreCase(name)) {
			base_unit_yield_rem_qty(value);
			return;
		}
		if ($base_unit_yield_abort_qty.equalsIgnoreCase(name)) {
			base_unit_yield_abort_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, float value) {
		if ($trd_unit_yield_qty.equalsIgnoreCase(name)) {
			trd_unit_yield_qty(value);
			return;
		}
		if ($trd_unit_yield_rem_qty.equalsIgnoreCase(name)) {
			trd_unit_yield_rem_qty(value);
			return;
		}
		if ($trd_unit_yield_abort_qty.equalsIgnoreCase(name)) {
			trd_unit_yield_abort_qty(value);
			return;
		}
		if ($base_unit_yield_qty.equalsIgnoreCase(name)) {
			base_unit_yield_qty(value);
			return;
		}
		if ($base_unit_yield_rem_qty.equalsIgnoreCase(name)) {
			base_unit_yield_rem_qty(value);
			return;
		}
		if ($base_unit_yield_abort_qty.equalsIgnoreCase(name)) {
			base_unit_yield_abort_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, double value) {
		if ($trd_unit_yield_qty.equalsIgnoreCase(name)) {
			trd_unit_yield_qty(value);
			return;
		}
		if ($trd_unit_yield_rem_qty.equalsIgnoreCase(name)) {
			trd_unit_yield_rem_qty(value);
			return;
		}
		if ($trd_unit_yield_abort_qty.equalsIgnoreCase(name)) {
			trd_unit_yield_abort_qty(value);
			return;
		}
		if ($base_unit_yield_qty.equalsIgnoreCase(name)) {
			base_unit_yield_qty(value);
			return;
		}
		if ($base_unit_yield_rem_qty.equalsIgnoreCase(name)) {
			base_unit_yield_rem_qty(value);
			return;
		}
		if ($base_unit_yield_abort_qty.equalsIgnoreCase(name)) {
			base_unit_yield_abort_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setBooleanNE(String name, boolean value) {
		if ($stk_lst_prnt_flg.equalsIgnoreCase(name)) {
			stk_lst_prnt_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

}
