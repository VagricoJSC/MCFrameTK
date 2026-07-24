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
 * "投入予定進捗ビュー // Input schedule progress view"DBコンテナRowクラスです。<p>
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
 *  	<td>inpt_schd_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>投入予定ＮＯ</td>
 *  	<td>Input schedule No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>mfg_sts_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
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
 *  	<td>base_unit_inpt_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>基準単位投入着手数量</td>
 *  	<td>Base unit input start qty.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>base_unit_rqmt_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>基準単位必要着手数量</td>
 *  	<td>Base unit required start qty.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>base_unit_fxd_rqmt_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>基準単位固定必要着手数量</td>
 *  	<td>Base unit fixed required qty. to start</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>base_unit_inpt_rem_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>基準単位投入残数量</td>
 *  	<td>Base unit remaining input qty.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>base_unit_rqmt_rem_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>基準単位必要残数量</td>
 *  	<td>Base unit required remaining qty.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>base_unit_fxd_rqmt_rem_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>基準単位固定必要残数量</td>
 *  	<td>Remaining qty. of base unit fixed required qty.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>base_unit_inpt_abort_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>基準単位投入打切数量</td>
 *  	<td>Base unit cancelled remaining input qty.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>cont_inpt_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>有効成分（投入着手数量）</td>
 *  	<td>Active ingredient (Input start qty.)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>cont_rqmt_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>有効成分（必要着手数量）</td>
 *  	<td>Active ingredient (Required start qty.)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>cont_fxd_rqmt_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>有効成分（固定必要着手数量）</td>
 *  	<td>Active ingredient (Fixed required qty.)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>cont_inpt_rem_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>有効成分（投入残数量）</td>
 *  	<td>Active ingredient (Remaining input qty.)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>cont_rqmt_rem_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>有効成分（必要残数量）</td>
 *  	<td>Active ingredient (Required remaining qty.)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>cont_fxd_rqmt_rem_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>有効成分（固定必要残数量）</td>
 *  	<td>Active ingredient (Remaining qty. of fixed required qty.)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sub_char1</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備１</td>
 *  	<td>Spare 1</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sub_char2</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備２</td>
 *  	<td>Spare 2</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
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
public class MSVT_INPT_SCHD_PR_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.VIEW;

	public static final String TABLE_NAME = "MSVT_INPT_SCHD_PR";

	public static final boolean EX_CTRL = false;
	
	public static final boolean LCL_TABLE = false;
	
	/**
	 * 投入予定ＮＯ. Input schedule No..<p>
	 *
	 */
	public static final String $inpt_schd_no = "inpt_schd_no";
	private static final MCPermColumnInfo _inpt_schd_no = createColumnInfo("inpt_schd_no");
	public final MCStringPermColumn inpt_schd_no = createStringColumn(_inpt_schd_no);
	
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
	 * 基準単位投入着手数量. Base unit input start qty..<p>
	 *
	 */
	public static final String $base_unit_inpt_qty = "base_unit_inpt_qty";
	private static final MCPermColumnInfo _base_unit_inpt_qty = createColumnInfo("base_unit_inpt_qty");
	public final MCNumberPermColumn base_unit_inpt_qty = createNumberColumn(_base_unit_inpt_qty);
	
	/**
	 * 基準単位必要着手数量. Base unit required start qty..<p>
	 *
	 */
	public static final String $base_unit_rqmt_qty = "base_unit_rqmt_qty";
	private static final MCPermColumnInfo _base_unit_rqmt_qty = createColumnInfo("base_unit_rqmt_qty");
	public final MCNumberPermColumn base_unit_rqmt_qty = createNumberColumn(_base_unit_rqmt_qty);
	
	/**
	 * 基準単位固定必要着手数量. Base unit fixed required qty. to start.<p>
	 *
	 */
	public static final String $base_unit_fxd_rqmt_qty = "base_unit_fxd_rqmt_qty";
	private static final MCPermColumnInfo _base_unit_fxd_rqmt_qty = createColumnInfo("base_unit_fxd_rqmt_qty");
	public final MCNumberPermColumn base_unit_fxd_rqmt_qty = createNumberColumn(_base_unit_fxd_rqmt_qty);
	
	/**
	 * 基準単位投入残数量. Base unit remaining input qty..<p>
	 *
	 */
	public static final String $base_unit_inpt_rem_qty = "base_unit_inpt_rem_qty";
	private static final MCPermColumnInfo _base_unit_inpt_rem_qty = createColumnInfo("base_unit_inpt_rem_qty");
	public final MCNumberPermColumn base_unit_inpt_rem_qty = createNumberColumn(_base_unit_inpt_rem_qty);
	
	/**
	 * 基準単位必要残数量. Base unit required remaining qty..<p>
	 *
	 */
	public static final String $base_unit_rqmt_rem_qty = "base_unit_rqmt_rem_qty";
	private static final MCPermColumnInfo _base_unit_rqmt_rem_qty = createColumnInfo("base_unit_rqmt_rem_qty");
	public final MCNumberPermColumn base_unit_rqmt_rem_qty = createNumberColumn(_base_unit_rqmt_rem_qty);
	
	/**
	 * 基準単位固定必要残数量. Remaining qty. of base unit fixed required qty..<p>
	 *
	 */
	public static final String $base_unit_fxd_rqmt_rem_qty = "base_unit_fxd_rqmt_rem_qty";
	private static final MCPermColumnInfo _base_unit_fxd_rqmt_rem_qty = createColumnInfo("base_unit_fxd_rqmt_rem_qty");
	public final MCNumberPermColumn base_unit_fxd_rqmt_rem_qty = createNumberColumn(_base_unit_fxd_rqmt_rem_qty);
	
	/**
	 * 基準単位投入打切数量. Base unit cancelled remaining input qty..<p>
	 *
	 */
	public static final String $base_unit_inpt_abort_qty = "base_unit_inpt_abort_qty";
	private static final MCPermColumnInfo _base_unit_inpt_abort_qty = createColumnInfo("base_unit_inpt_abort_qty");
	public final MCNumberPermColumn base_unit_inpt_abort_qty = createNumberColumn(_base_unit_inpt_abort_qty);
	
	/**
	 * 有効成分（投入着手数量）. Active ingredient (Input start qty.).<p>
	 *
	 */
	public static final String $cont_inpt_qty = "cont_inpt_qty";
	private static final MCPermColumnInfo _cont_inpt_qty = createColumnInfo("cont_inpt_qty");
	public final MCNumberPermColumn cont_inpt_qty = createNumberColumn(_cont_inpt_qty);
	
	/**
	 * 有効成分（必要着手数量）. Active ingredient (Required start qty.).<p>
	 *
	 */
	public static final String $cont_rqmt_qty = "cont_rqmt_qty";
	private static final MCPermColumnInfo _cont_rqmt_qty = createColumnInfo("cont_rqmt_qty");
	public final MCNumberPermColumn cont_rqmt_qty = createNumberColumn(_cont_rqmt_qty);
	
	/**
	 * 有効成分（固定必要着手数量）. Active ingredient (Fixed required qty.).<p>
	 *
	 */
	public static final String $cont_fxd_rqmt_qty = "cont_fxd_rqmt_qty";
	private static final MCPermColumnInfo _cont_fxd_rqmt_qty = createColumnInfo("cont_fxd_rqmt_qty");
	public final MCNumberPermColumn cont_fxd_rqmt_qty = createNumberColumn(_cont_fxd_rqmt_qty);
	
	/**
	 * 有効成分（投入残数量）. Active ingredient (Remaining input qty.).<p>
	 *
	 */
	public static final String $cont_inpt_rem_qty = "cont_inpt_rem_qty";
	private static final MCPermColumnInfo _cont_inpt_rem_qty = createColumnInfo("cont_inpt_rem_qty");
	public final MCNumberPermColumn cont_inpt_rem_qty = createNumberColumn(_cont_inpt_rem_qty);
	
	/**
	 * 有効成分（必要残数量）. Active ingredient (Required remaining qty.).<p>
	 *
	 */
	public static final String $cont_rqmt_rem_qty = "cont_rqmt_rem_qty";
	private static final MCPermColumnInfo _cont_rqmt_rem_qty = createColumnInfo("cont_rqmt_rem_qty");
	public final MCNumberPermColumn cont_rqmt_rem_qty = createNumberColumn(_cont_rqmt_rem_qty);
	
	/**
	 * 有効成分（固定必要残数量）. Active ingredient (Remaining qty. of fixed required qty.).<p>
	 *
	 */
	public static final String $cont_fxd_rqmt_rem_qty = "cont_fxd_rqmt_rem_qty";
	private static final MCPermColumnInfo _cont_fxd_rqmt_rem_qty = createColumnInfo("cont_fxd_rqmt_rem_qty");
	public final MCNumberPermColumn cont_fxd_rqmt_rem_qty = createNumberColumn(_cont_fxd_rqmt_rem_qty);
	
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
	
	public static final MCMeta inpt_schd_no_META = createCommonMeta($inpt_schd_no, mcframe.commonMA.meta.MA_META.INPT_SCHD_NO);
	public static final MCMeta mfg_sts_typ_META = createCommonMeta($mfg_sts_typ, mcframe.commonMS.meta.MS_META.MFG_STS_TYP);
	public static final MCMeta mfg_inst_no_META = createCommonMeta($mfg_inst_no, mcframe.commonMA.meta.MA_META.MFG_INST_NO);
	public static final MCMeta itm_mfg_inst_no_META = createCommonMeta($itm_mfg_inst_no, mcframe.commonMA.meta.MA_META.ITM_MFG_INST_NO);
	public static final MCMeta oper_inst_no_META = createCommonMeta($oper_inst_no, mcframe.commonMA.meta.MA_META.OPER_INST_NO);
	public static final MCMeta base_unit_inpt_qty_META = createCommonMeta($base_unit_inpt_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_rqmt_qty_META = createCommonMeta($base_unit_rqmt_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_fxd_rqmt_qty_META = createCommonMeta($base_unit_fxd_rqmt_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_inpt_rem_qty_META = createCommonMeta($base_unit_inpt_rem_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_rqmt_rem_qty_META = createCommonMeta($base_unit_rqmt_rem_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_fxd_rqmt_rem_qty_META = createCommonMeta($base_unit_fxd_rqmt_rem_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_inpt_abort_qty_META = createCommonMeta($base_unit_inpt_abort_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta cont_inpt_qty_META = createCommonMeta($cont_inpt_qty, mcframe.commonMA.meta.MA_META.CONT_QTY);
	public static final MCMeta cont_rqmt_qty_META = createCommonMeta($cont_rqmt_qty, mcframe.commonMA.meta.MA_META.CONT_QTY);
	public static final MCMeta cont_fxd_rqmt_qty_META = createCommonMeta($cont_fxd_rqmt_qty, mcframe.commonMA.meta.MA_META.CONT_QTY);
	public static final MCMeta cont_inpt_rem_qty_META = createCommonMeta($cont_inpt_rem_qty, mcframe.commonMA.meta.MA_META.CONT_QTY);
	public static final MCMeta cont_rqmt_rem_qty_META = createCommonMeta($cont_rqmt_rem_qty, mcframe.commonMA.meta.MA_META.CONT_QTY);
	public static final MCMeta cont_fxd_rqmt_rem_qty_META = createCommonMeta($cont_fxd_rqmt_rem_qty, mcframe.commonMA.meta.MA_META.CONT_QTY);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.INPT_ACT_REM_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.INPT_ACT_REM_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.INPT_ACT_REM_SUB_CHAR3);

	protected static final List<MCForeignInfo> FOREIGN_INFO_LIST = new ArrayList<>();
	static {
	}
	
	protected static final ConstMetaList<MSVT_INPT_SCHD_PR_R> constMetas = new ConstMetaList<MSVT_INPT_SCHD_PR_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			inpt_schd_no_META,
			mfg_sts_typ_META,
			mfg_inst_no_META,
			itm_mfg_inst_no_META,
			oper_inst_no_META,
			base_unit_inpt_qty_META,
			base_unit_rqmt_qty_META,
			base_unit_fxd_rqmt_qty_META,
			base_unit_inpt_rem_qty_META,
			base_unit_rqmt_rem_qty_META,
			base_unit_fxd_rqmt_rem_qty_META,
			base_unit_inpt_abort_qty_META,
			cont_inpt_qty_META,
			cont_rqmt_qty_META,
			cont_fxd_rqmt_qty_META,
			cont_inpt_rem_qty_META,
			cont_rqmt_rem_qty_META,
			cont_fxd_rqmt_rem_qty_META,
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
	protected MSVT_INPT_SCHD_PR_R(ConstMetaList<? extends MSVT_INPT_SCHD_PR_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MSVT_INPT_SCHD_PR_R(ConstMetaList<? extends MSVT_INPT_SCHD_PR_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MSVT_INPT_SCHD_PR_R.$inpt_schd_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_INPT_SCHD_PR_R.$inpt_schd_no,
				"inpt_schd_no",
				inpt_schd_no,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_INPT_SCHD_PR_R.$mfg_sts_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_INPT_SCHD_PR_R.$mfg_sts_typ,
				"mfg_sts_typ",
				mfg_sts_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_INPT_SCHD_PR_R.$mfg_inst_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_INPT_SCHD_PR_R.$mfg_inst_no,
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
			MSVT_INPT_SCHD_PR_R.$itm_mfg_inst_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_INPT_SCHD_PR_R.$itm_mfg_inst_no,
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
			MSVT_INPT_SCHD_PR_R.$oper_inst_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_INPT_SCHD_PR_R.$oper_inst_no,
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
			MSVT_INPT_SCHD_PR_R.$base_unit_inpt_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MSVT_INPT_SCHD_PR_R.$base_unit_inpt_qty,
				"base_unit_inpt_qty",
				base_unit_inpt_qty,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_INPT_SCHD_PR_R.$base_unit_rqmt_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MSVT_INPT_SCHD_PR_R.$base_unit_rqmt_qty,
				"base_unit_rqmt_qty",
				base_unit_rqmt_qty,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_INPT_SCHD_PR_R.$base_unit_fxd_rqmt_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MSVT_INPT_SCHD_PR_R.$base_unit_fxd_rqmt_qty,
				"base_unit_fxd_rqmt_qty",
				base_unit_fxd_rqmt_qty,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_INPT_SCHD_PR_R.$base_unit_inpt_rem_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MSVT_INPT_SCHD_PR_R.$base_unit_inpt_rem_qty,
				"base_unit_inpt_rem_qty",
				base_unit_inpt_rem_qty,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_INPT_SCHD_PR_R.$base_unit_rqmt_rem_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MSVT_INPT_SCHD_PR_R.$base_unit_rqmt_rem_qty,
				"base_unit_rqmt_rem_qty",
				base_unit_rqmt_rem_qty,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_INPT_SCHD_PR_R.$base_unit_fxd_rqmt_rem_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MSVT_INPT_SCHD_PR_R.$base_unit_fxd_rqmt_rem_qty,
				"base_unit_fxd_rqmt_rem_qty",
				base_unit_fxd_rqmt_rem_qty,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_INPT_SCHD_PR_R.$base_unit_inpt_abort_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MSVT_INPT_SCHD_PR_R.$base_unit_inpt_abort_qty,
				"base_unit_inpt_abort_qty",
				base_unit_inpt_abort_qty,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_INPT_SCHD_PR_R.$cont_inpt_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MSVT_INPT_SCHD_PR_R.$cont_inpt_qty,
				"cont_inpt_qty",
				cont_inpt_qty,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_INPT_SCHD_PR_R.$cont_rqmt_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MSVT_INPT_SCHD_PR_R.$cont_rqmt_qty,
				"cont_rqmt_qty",
				cont_rqmt_qty,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_INPT_SCHD_PR_R.$cont_fxd_rqmt_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MSVT_INPT_SCHD_PR_R.$cont_fxd_rqmt_qty,
				"cont_fxd_rqmt_qty",
				cont_fxd_rqmt_qty,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_INPT_SCHD_PR_R.$cont_inpt_rem_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MSVT_INPT_SCHD_PR_R.$cont_inpt_rem_qty,
				"cont_inpt_rem_qty",
				cont_inpt_rem_qty,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_INPT_SCHD_PR_R.$cont_rqmt_rem_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MSVT_INPT_SCHD_PR_R.$cont_rqmt_rem_qty,
				"cont_rqmt_rem_qty",
				cont_rqmt_rem_qty,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_INPT_SCHD_PR_R.$cont_fxd_rqmt_rem_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MSVT_INPT_SCHD_PR_R.$cont_fxd_rqmt_rem_qty,
				"cont_fxd_rqmt_rem_qty",
				cont_fxd_rqmt_rem_qty,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_INPT_SCHD_PR_R.$sub_char1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_INPT_SCHD_PR_R.$sub_char1,
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
			MSVT_INPT_SCHD_PR_R.$sub_char2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_INPT_SCHD_PR_R.$sub_char2,
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
			MSVT_INPT_SCHD_PR_R.$sub_char3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_INPT_SCHD_PR_R.$sub_char3,
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
	public static MSVT_INPT_SCHD_PR_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MSVT_INPT_SCHD_PR_R create(String alias) {
		MSVT_INPT_SCHD_PR_R row = new MSVT_INPT_SCHD_PR_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MSVT_INPT_SCHD_PR_R createByName(T proto) {
		MSVT_INPT_SCHD_PR_R row = MSVT_INPT_SCHD_PR_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MSVT_INPT_SCHD_PR_R clone() {
		return (MSVT_INPT_SCHD_PR_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MSVT_INPT_SCHD_PR_R createInstance() {
		return (MSVT_INPT_SCHD_PR_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MSVT_INPT_SCHD_PR_R getValues(String... names) {
		return (MSVT_INPT_SCHD_PR_R) super.getValues(names);
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
	 * 投入予定ＮＯ. Input schedule No..<p>
	 *
	 */
	public String inpt_schd_no() {
		return getConstString(offset + 0, $inpt_schd_no);
	}

	/**
	 * 投入予定ＮＯ. Input schedule No..<p>
	 *
	 */
	public void inpt_schd_no(String value) {
		setConstString(offset + 0, $inpt_schd_no, value);
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
	 * 基準単位投入着手数量. Base unit input start qty..<p>
	 *
	 */
	public MCNumber base_unit_inpt_qty() {
		return getConstNumber(offset + 5, $base_unit_inpt_qty);
	}

	/**
	 * 基準単位投入着手数量. Base unit input start qty..<p>
	 *
	 */
	public void base_unit_inpt_qty(MCNumber value) {
		setConstNumber(offset + 5, $base_unit_inpt_qty, value);
	}
	
	/**
	 * 基準単位投入着手数量. Base unit input start qty..<p>
	 *
	 */
	public void base_unit_inpt_qty(int value) {
		setConstNumber(offset + 5, $base_unit_inpt_qty, value);
	}
	
	/**
	 * 基準単位投入着手数量. Base unit input start qty..<p>
	 *
	 */
	public void base_unit_inpt_qty(long value) {
		setConstNumber(offset + 5, $base_unit_inpt_qty, value);
	}
	
	/**
	 * 基準単位投入着手数量. Base unit input start qty..<p>
	 *
	 */
	public void base_unit_inpt_qty(float value) {
		setConstNumber(offset + 5, $base_unit_inpt_qty, value);
	}
	
	/**
	 * 基準単位投入着手数量. Base unit input start qty..<p>
	 *
	 */
	public void base_unit_inpt_qty(double value) {
		setConstNumber(offset + 5, $base_unit_inpt_qty, value);
	}
	
	/**
	 * 基準単位必要着手数量. Base unit required start qty..<p>
	 *
	 */
	public MCNumber base_unit_rqmt_qty() {
		return getConstNumber(offset + 6, $base_unit_rqmt_qty);
	}

	/**
	 * 基準単位必要着手数量. Base unit required start qty..<p>
	 *
	 */
	public void base_unit_rqmt_qty(MCNumber value) {
		setConstNumber(offset + 6, $base_unit_rqmt_qty, value);
	}
	
	/**
	 * 基準単位必要着手数量. Base unit required start qty..<p>
	 *
	 */
	public void base_unit_rqmt_qty(int value) {
		setConstNumber(offset + 6, $base_unit_rqmt_qty, value);
	}
	
	/**
	 * 基準単位必要着手数量. Base unit required start qty..<p>
	 *
	 */
	public void base_unit_rqmt_qty(long value) {
		setConstNumber(offset + 6, $base_unit_rqmt_qty, value);
	}
	
	/**
	 * 基準単位必要着手数量. Base unit required start qty..<p>
	 *
	 */
	public void base_unit_rqmt_qty(float value) {
		setConstNumber(offset + 6, $base_unit_rqmt_qty, value);
	}
	
	/**
	 * 基準単位必要着手数量. Base unit required start qty..<p>
	 *
	 */
	public void base_unit_rqmt_qty(double value) {
		setConstNumber(offset + 6, $base_unit_rqmt_qty, value);
	}
	
	/**
	 * 基準単位固定必要着手数量. Base unit fixed required qty. to start.<p>
	 *
	 */
	public MCNumber base_unit_fxd_rqmt_qty() {
		return getConstNumber(offset + 7, $base_unit_fxd_rqmt_qty);
	}

	/**
	 * 基準単位固定必要着手数量. Base unit fixed required qty. to start.<p>
	 *
	 */
	public void base_unit_fxd_rqmt_qty(MCNumber value) {
		setConstNumber(offset + 7, $base_unit_fxd_rqmt_qty, value);
	}
	
	/**
	 * 基準単位固定必要着手数量. Base unit fixed required qty. to start.<p>
	 *
	 */
	public void base_unit_fxd_rqmt_qty(int value) {
		setConstNumber(offset + 7, $base_unit_fxd_rqmt_qty, value);
	}
	
	/**
	 * 基準単位固定必要着手数量. Base unit fixed required qty. to start.<p>
	 *
	 */
	public void base_unit_fxd_rqmt_qty(long value) {
		setConstNumber(offset + 7, $base_unit_fxd_rqmt_qty, value);
	}
	
	/**
	 * 基準単位固定必要着手数量. Base unit fixed required qty. to start.<p>
	 *
	 */
	public void base_unit_fxd_rqmt_qty(float value) {
		setConstNumber(offset + 7, $base_unit_fxd_rqmt_qty, value);
	}
	
	/**
	 * 基準単位固定必要着手数量. Base unit fixed required qty. to start.<p>
	 *
	 */
	public void base_unit_fxd_rqmt_qty(double value) {
		setConstNumber(offset + 7, $base_unit_fxd_rqmt_qty, value);
	}
	
	/**
	 * 基準単位投入残数量. Base unit remaining input qty..<p>
	 *
	 */
	public MCNumber base_unit_inpt_rem_qty() {
		return getConstNumber(offset + 8, $base_unit_inpt_rem_qty);
	}

	/**
	 * 基準単位投入残数量. Base unit remaining input qty..<p>
	 *
	 */
	public void base_unit_inpt_rem_qty(MCNumber value) {
		setConstNumber(offset + 8, $base_unit_inpt_rem_qty, value);
	}
	
	/**
	 * 基準単位投入残数量. Base unit remaining input qty..<p>
	 *
	 */
	public void base_unit_inpt_rem_qty(int value) {
		setConstNumber(offset + 8, $base_unit_inpt_rem_qty, value);
	}
	
	/**
	 * 基準単位投入残数量. Base unit remaining input qty..<p>
	 *
	 */
	public void base_unit_inpt_rem_qty(long value) {
		setConstNumber(offset + 8, $base_unit_inpt_rem_qty, value);
	}
	
	/**
	 * 基準単位投入残数量. Base unit remaining input qty..<p>
	 *
	 */
	public void base_unit_inpt_rem_qty(float value) {
		setConstNumber(offset + 8, $base_unit_inpt_rem_qty, value);
	}
	
	/**
	 * 基準単位投入残数量. Base unit remaining input qty..<p>
	 *
	 */
	public void base_unit_inpt_rem_qty(double value) {
		setConstNumber(offset + 8, $base_unit_inpt_rem_qty, value);
	}
	
	/**
	 * 基準単位必要残数量. Base unit required remaining qty..<p>
	 *
	 */
	public MCNumber base_unit_rqmt_rem_qty() {
		return getConstNumber(offset + 9, $base_unit_rqmt_rem_qty);
	}

	/**
	 * 基準単位必要残数量. Base unit required remaining qty..<p>
	 *
	 */
	public void base_unit_rqmt_rem_qty(MCNumber value) {
		setConstNumber(offset + 9, $base_unit_rqmt_rem_qty, value);
	}
	
	/**
	 * 基準単位必要残数量. Base unit required remaining qty..<p>
	 *
	 */
	public void base_unit_rqmt_rem_qty(int value) {
		setConstNumber(offset + 9, $base_unit_rqmt_rem_qty, value);
	}
	
	/**
	 * 基準単位必要残数量. Base unit required remaining qty..<p>
	 *
	 */
	public void base_unit_rqmt_rem_qty(long value) {
		setConstNumber(offset + 9, $base_unit_rqmt_rem_qty, value);
	}
	
	/**
	 * 基準単位必要残数量. Base unit required remaining qty..<p>
	 *
	 */
	public void base_unit_rqmt_rem_qty(float value) {
		setConstNumber(offset + 9, $base_unit_rqmt_rem_qty, value);
	}
	
	/**
	 * 基準単位必要残数量. Base unit required remaining qty..<p>
	 *
	 */
	public void base_unit_rqmt_rem_qty(double value) {
		setConstNumber(offset + 9, $base_unit_rqmt_rem_qty, value);
	}
	
	/**
	 * 基準単位固定必要残数量. Remaining qty. of base unit fixed required qty..<p>
	 *
	 */
	public MCNumber base_unit_fxd_rqmt_rem_qty() {
		return getConstNumber(offset + 10, $base_unit_fxd_rqmt_rem_qty);
	}

	/**
	 * 基準単位固定必要残数量. Remaining qty. of base unit fixed required qty..<p>
	 *
	 */
	public void base_unit_fxd_rqmt_rem_qty(MCNumber value) {
		setConstNumber(offset + 10, $base_unit_fxd_rqmt_rem_qty, value);
	}
	
	/**
	 * 基準単位固定必要残数量. Remaining qty. of base unit fixed required qty..<p>
	 *
	 */
	public void base_unit_fxd_rqmt_rem_qty(int value) {
		setConstNumber(offset + 10, $base_unit_fxd_rqmt_rem_qty, value);
	}
	
	/**
	 * 基準単位固定必要残数量. Remaining qty. of base unit fixed required qty..<p>
	 *
	 */
	public void base_unit_fxd_rqmt_rem_qty(long value) {
		setConstNumber(offset + 10, $base_unit_fxd_rqmt_rem_qty, value);
	}
	
	/**
	 * 基準単位固定必要残数量. Remaining qty. of base unit fixed required qty..<p>
	 *
	 */
	public void base_unit_fxd_rqmt_rem_qty(float value) {
		setConstNumber(offset + 10, $base_unit_fxd_rqmt_rem_qty, value);
	}
	
	/**
	 * 基準単位固定必要残数量. Remaining qty. of base unit fixed required qty..<p>
	 *
	 */
	public void base_unit_fxd_rqmt_rem_qty(double value) {
		setConstNumber(offset + 10, $base_unit_fxd_rqmt_rem_qty, value);
	}
	
	/**
	 * 基準単位投入打切数量. Base unit cancelled remaining input qty..<p>
	 *
	 */
	public MCNumber base_unit_inpt_abort_qty() {
		return getConstNumber(offset + 11, $base_unit_inpt_abort_qty);
	}

	/**
	 * 基準単位投入打切数量. Base unit cancelled remaining input qty..<p>
	 *
	 */
	public void base_unit_inpt_abort_qty(MCNumber value) {
		setConstNumber(offset + 11, $base_unit_inpt_abort_qty, value);
	}
	
	/**
	 * 基準単位投入打切数量. Base unit cancelled remaining input qty..<p>
	 *
	 */
	public void base_unit_inpt_abort_qty(int value) {
		setConstNumber(offset + 11, $base_unit_inpt_abort_qty, value);
	}
	
	/**
	 * 基準単位投入打切数量. Base unit cancelled remaining input qty..<p>
	 *
	 */
	public void base_unit_inpt_abort_qty(long value) {
		setConstNumber(offset + 11, $base_unit_inpt_abort_qty, value);
	}
	
	/**
	 * 基準単位投入打切数量. Base unit cancelled remaining input qty..<p>
	 *
	 */
	public void base_unit_inpt_abort_qty(float value) {
		setConstNumber(offset + 11, $base_unit_inpt_abort_qty, value);
	}
	
	/**
	 * 基準単位投入打切数量. Base unit cancelled remaining input qty..<p>
	 *
	 */
	public void base_unit_inpt_abort_qty(double value) {
		setConstNumber(offset + 11, $base_unit_inpt_abort_qty, value);
	}
	
	/**
	 * 有効成分（投入着手数量）. Active ingredient (Input start qty.).<p>
	 *
	 */
	public MCNumber cont_inpt_qty() {
		return getConstNumber(offset + 12, $cont_inpt_qty);
	}

	/**
	 * 有効成分（投入着手数量）. Active ingredient (Input start qty.).<p>
	 *
	 */
	public void cont_inpt_qty(MCNumber value) {
		setConstNumber(offset + 12, $cont_inpt_qty, value);
	}
	
	/**
	 * 有効成分（投入着手数量）. Active ingredient (Input start qty.).<p>
	 *
	 */
	public void cont_inpt_qty(int value) {
		setConstNumber(offset + 12, $cont_inpt_qty, value);
	}
	
	/**
	 * 有効成分（投入着手数量）. Active ingredient (Input start qty.).<p>
	 *
	 */
	public void cont_inpt_qty(long value) {
		setConstNumber(offset + 12, $cont_inpt_qty, value);
	}
	
	/**
	 * 有効成分（投入着手数量）. Active ingredient (Input start qty.).<p>
	 *
	 */
	public void cont_inpt_qty(float value) {
		setConstNumber(offset + 12, $cont_inpt_qty, value);
	}
	
	/**
	 * 有効成分（投入着手数量）. Active ingredient (Input start qty.).<p>
	 *
	 */
	public void cont_inpt_qty(double value) {
		setConstNumber(offset + 12, $cont_inpt_qty, value);
	}
	
	/**
	 * 有効成分（必要着手数量）. Active ingredient (Required start qty.).<p>
	 *
	 */
	public MCNumber cont_rqmt_qty() {
		return getConstNumber(offset + 13, $cont_rqmt_qty);
	}

	/**
	 * 有効成分（必要着手数量）. Active ingredient (Required start qty.).<p>
	 *
	 */
	public void cont_rqmt_qty(MCNumber value) {
		setConstNumber(offset + 13, $cont_rqmt_qty, value);
	}
	
	/**
	 * 有効成分（必要着手数量）. Active ingredient (Required start qty.).<p>
	 *
	 */
	public void cont_rqmt_qty(int value) {
		setConstNumber(offset + 13, $cont_rqmt_qty, value);
	}
	
	/**
	 * 有効成分（必要着手数量）. Active ingredient (Required start qty.).<p>
	 *
	 */
	public void cont_rqmt_qty(long value) {
		setConstNumber(offset + 13, $cont_rqmt_qty, value);
	}
	
	/**
	 * 有効成分（必要着手数量）. Active ingredient (Required start qty.).<p>
	 *
	 */
	public void cont_rqmt_qty(float value) {
		setConstNumber(offset + 13, $cont_rqmt_qty, value);
	}
	
	/**
	 * 有効成分（必要着手数量）. Active ingredient (Required start qty.).<p>
	 *
	 */
	public void cont_rqmt_qty(double value) {
		setConstNumber(offset + 13, $cont_rqmt_qty, value);
	}
	
	/**
	 * 有効成分（固定必要着手数量）. Active ingredient (Fixed required qty.).<p>
	 *
	 */
	public MCNumber cont_fxd_rqmt_qty() {
		return getConstNumber(offset + 14, $cont_fxd_rqmt_qty);
	}

	/**
	 * 有効成分（固定必要着手数量）. Active ingredient (Fixed required qty.).<p>
	 *
	 */
	public void cont_fxd_rqmt_qty(MCNumber value) {
		setConstNumber(offset + 14, $cont_fxd_rqmt_qty, value);
	}
	
	/**
	 * 有効成分（固定必要着手数量）. Active ingredient (Fixed required qty.).<p>
	 *
	 */
	public void cont_fxd_rqmt_qty(int value) {
		setConstNumber(offset + 14, $cont_fxd_rqmt_qty, value);
	}
	
	/**
	 * 有効成分（固定必要着手数量）. Active ingredient (Fixed required qty.).<p>
	 *
	 */
	public void cont_fxd_rqmt_qty(long value) {
		setConstNumber(offset + 14, $cont_fxd_rqmt_qty, value);
	}
	
	/**
	 * 有効成分（固定必要着手数量）. Active ingredient (Fixed required qty.).<p>
	 *
	 */
	public void cont_fxd_rqmt_qty(float value) {
		setConstNumber(offset + 14, $cont_fxd_rqmt_qty, value);
	}
	
	/**
	 * 有効成分（固定必要着手数量）. Active ingredient (Fixed required qty.).<p>
	 *
	 */
	public void cont_fxd_rqmt_qty(double value) {
		setConstNumber(offset + 14, $cont_fxd_rqmt_qty, value);
	}
	
	/**
	 * 有効成分（投入残数量）. Active ingredient (Remaining input qty.).<p>
	 *
	 */
	public MCNumber cont_inpt_rem_qty() {
		return getConstNumber(offset + 15, $cont_inpt_rem_qty);
	}

	/**
	 * 有効成分（投入残数量）. Active ingredient (Remaining input qty.).<p>
	 *
	 */
	public void cont_inpt_rem_qty(MCNumber value) {
		setConstNumber(offset + 15, $cont_inpt_rem_qty, value);
	}
	
	/**
	 * 有効成分（投入残数量）. Active ingredient (Remaining input qty.).<p>
	 *
	 */
	public void cont_inpt_rem_qty(int value) {
		setConstNumber(offset + 15, $cont_inpt_rem_qty, value);
	}
	
	/**
	 * 有効成分（投入残数量）. Active ingredient (Remaining input qty.).<p>
	 *
	 */
	public void cont_inpt_rem_qty(long value) {
		setConstNumber(offset + 15, $cont_inpt_rem_qty, value);
	}
	
	/**
	 * 有効成分（投入残数量）. Active ingredient (Remaining input qty.).<p>
	 *
	 */
	public void cont_inpt_rem_qty(float value) {
		setConstNumber(offset + 15, $cont_inpt_rem_qty, value);
	}
	
	/**
	 * 有効成分（投入残数量）. Active ingredient (Remaining input qty.).<p>
	 *
	 */
	public void cont_inpt_rem_qty(double value) {
		setConstNumber(offset + 15, $cont_inpt_rem_qty, value);
	}
	
	/**
	 * 有効成分（必要残数量）. Active ingredient (Required remaining qty.).<p>
	 *
	 */
	public MCNumber cont_rqmt_rem_qty() {
		return getConstNumber(offset + 16, $cont_rqmt_rem_qty);
	}

	/**
	 * 有効成分（必要残数量）. Active ingredient (Required remaining qty.).<p>
	 *
	 */
	public void cont_rqmt_rem_qty(MCNumber value) {
		setConstNumber(offset + 16, $cont_rqmt_rem_qty, value);
	}
	
	/**
	 * 有効成分（必要残数量）. Active ingredient (Required remaining qty.).<p>
	 *
	 */
	public void cont_rqmt_rem_qty(int value) {
		setConstNumber(offset + 16, $cont_rqmt_rem_qty, value);
	}
	
	/**
	 * 有効成分（必要残数量）. Active ingredient (Required remaining qty.).<p>
	 *
	 */
	public void cont_rqmt_rem_qty(long value) {
		setConstNumber(offset + 16, $cont_rqmt_rem_qty, value);
	}
	
	/**
	 * 有効成分（必要残数量）. Active ingredient (Required remaining qty.).<p>
	 *
	 */
	public void cont_rqmt_rem_qty(float value) {
		setConstNumber(offset + 16, $cont_rqmt_rem_qty, value);
	}
	
	/**
	 * 有効成分（必要残数量）. Active ingredient (Required remaining qty.).<p>
	 *
	 */
	public void cont_rqmt_rem_qty(double value) {
		setConstNumber(offset + 16, $cont_rqmt_rem_qty, value);
	}
	
	/**
	 * 有効成分（固定必要残数量）. Active ingredient (Remaining qty. of fixed required qty.).<p>
	 *
	 */
	public MCNumber cont_fxd_rqmt_rem_qty() {
		return getConstNumber(offset + 17, $cont_fxd_rqmt_rem_qty);
	}

	/**
	 * 有効成分（固定必要残数量）. Active ingredient (Remaining qty. of fixed required qty.).<p>
	 *
	 */
	public void cont_fxd_rqmt_rem_qty(MCNumber value) {
		setConstNumber(offset + 17, $cont_fxd_rqmt_rem_qty, value);
	}
	
	/**
	 * 有効成分（固定必要残数量）. Active ingredient (Remaining qty. of fixed required qty.).<p>
	 *
	 */
	public void cont_fxd_rqmt_rem_qty(int value) {
		setConstNumber(offset + 17, $cont_fxd_rqmt_rem_qty, value);
	}
	
	/**
	 * 有効成分（固定必要残数量）. Active ingredient (Remaining qty. of fixed required qty.).<p>
	 *
	 */
	public void cont_fxd_rqmt_rem_qty(long value) {
		setConstNumber(offset + 17, $cont_fxd_rqmt_rem_qty, value);
	}
	
	/**
	 * 有効成分（固定必要残数量）. Active ingredient (Remaining qty. of fixed required qty.).<p>
	 *
	 */
	public void cont_fxd_rqmt_rem_qty(float value) {
		setConstNumber(offset + 17, $cont_fxd_rqmt_rem_qty, value);
	}
	
	/**
	 * 有効成分（固定必要残数量）. Active ingredient (Remaining qty. of fixed required qty.).<p>
	 *
	 */
	public void cont_fxd_rqmt_rem_qty(double value) {
		setConstNumber(offset + 17, $cont_fxd_rqmt_rem_qty, value);
	}
	
	/**
	 * 予備１. Spare 1.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 18, $sub_char1);
	}

	/**
	 * 予備１. Spare 1.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 18, $sub_char1, value);
	}

	/**
	 * 予備２. Spare 2.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 19, $sub_char2);
	}

	/**
	 * 予備２. Spare 2.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 19, $sub_char2, value);
	}

	/**
	 * 予備３. Spare 3.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 20, $sub_char3);
	}

	/**
	 * 予備３. Spare 3.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 20, $sub_char3, value);
	}

	public String getString(String name) {
		if ($inpt_schd_no.equalsIgnoreCase(name)) {
			return inpt_schd_no();
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
		if ($base_unit_inpt_qty.equalsIgnoreCase(name)) {
			return base_unit_inpt_qty();
		}
		if ($base_unit_rqmt_qty.equalsIgnoreCase(name)) {
			return base_unit_rqmt_qty();
		}
		if ($base_unit_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			return base_unit_fxd_rqmt_qty();
		}
		if ($base_unit_inpt_rem_qty.equalsIgnoreCase(name)) {
			return base_unit_inpt_rem_qty();
		}
		if ($base_unit_rqmt_rem_qty.equalsIgnoreCase(name)) {
			return base_unit_rqmt_rem_qty();
		}
		if ($base_unit_fxd_rqmt_rem_qty.equalsIgnoreCase(name)) {
			return base_unit_fxd_rqmt_rem_qty();
		}
		if ($base_unit_inpt_abort_qty.equalsIgnoreCase(name)) {
			return base_unit_inpt_abort_qty();
		}
		if ($cont_inpt_qty.equalsIgnoreCase(name)) {
			return cont_inpt_qty();
		}
		if ($cont_rqmt_qty.equalsIgnoreCase(name)) {
			return cont_rqmt_qty();
		}
		if ($cont_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			return cont_fxd_rqmt_qty();
		}
		if ($cont_inpt_rem_qty.equalsIgnoreCase(name)) {
			return cont_inpt_rem_qty();
		}
		if ($cont_rqmt_rem_qty.equalsIgnoreCase(name)) {
			return cont_rqmt_rem_qty();
		}
		if ($cont_fxd_rqmt_rem_qty.equalsIgnoreCase(name)) {
			return cont_fxd_rqmt_rem_qty();
		}
		return super.getNumber(name);
	}

	public String getStringNE(String name) {
		if ($inpt_schd_no.equalsIgnoreCase(name)) {
			return inpt_schd_no();
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
		if ($base_unit_inpt_qty.equalsIgnoreCase(name)) {
			return base_unit_inpt_qty();
		}
		if ($base_unit_rqmt_qty.equalsIgnoreCase(name)) {
			return base_unit_rqmt_qty();
		}
		if ($base_unit_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			return base_unit_fxd_rqmt_qty();
		}
		if ($base_unit_inpt_rem_qty.equalsIgnoreCase(name)) {
			return base_unit_inpt_rem_qty();
		}
		if ($base_unit_rqmt_rem_qty.equalsIgnoreCase(name)) {
			return base_unit_rqmt_rem_qty();
		}
		if ($base_unit_fxd_rqmt_rem_qty.equalsIgnoreCase(name)) {
			return base_unit_fxd_rqmt_rem_qty();
		}
		if ($base_unit_inpt_abort_qty.equalsIgnoreCase(name)) {
			return base_unit_inpt_abort_qty();
		}
		if ($cont_inpt_qty.equalsIgnoreCase(name)) {
			return cont_inpt_qty();
		}
		if ($cont_rqmt_qty.equalsIgnoreCase(name)) {
			return cont_rqmt_qty();
		}
		if ($cont_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			return cont_fxd_rqmt_qty();
		}
		if ($cont_inpt_rem_qty.equalsIgnoreCase(name)) {
			return cont_inpt_rem_qty();
		}
		if ($cont_rqmt_rem_qty.equalsIgnoreCase(name)) {
			return cont_rqmt_rem_qty();
		}
		if ($cont_fxd_rqmt_rem_qty.equalsIgnoreCase(name)) {
			return cont_fxd_rqmt_rem_qty();
		}
		return super.getNumberNE(name);
	}

	public void setString(String name, String value) {
		if ($inpt_schd_no.equalsIgnoreCase(name)) {
			inpt_schd_no(value);
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
		if ($base_unit_inpt_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_qty(value);
			return;
		}
		if ($base_unit_rqmt_qty.equalsIgnoreCase(name)) {
			base_unit_rqmt_qty(value);
			return;
		}
		if ($base_unit_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			base_unit_fxd_rqmt_qty(value);
			return;
		}
		if ($base_unit_inpt_rem_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_rem_qty(value);
			return;
		}
		if ($base_unit_rqmt_rem_qty.equalsIgnoreCase(name)) {
			base_unit_rqmt_rem_qty(value);
			return;
		}
		if ($base_unit_fxd_rqmt_rem_qty.equalsIgnoreCase(name)) {
			base_unit_fxd_rqmt_rem_qty(value);
			return;
		}
		if ($base_unit_inpt_abort_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_abort_qty(value);
			return;
		}
		if ($cont_inpt_qty.equalsIgnoreCase(name)) {
			cont_inpt_qty(value);
			return;
		}
		if ($cont_rqmt_qty.equalsIgnoreCase(name)) {
			cont_rqmt_qty(value);
			return;
		}
		if ($cont_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			cont_fxd_rqmt_qty(value);
			return;
		}
		if ($cont_inpt_rem_qty.equalsIgnoreCase(name)) {
			cont_inpt_rem_qty(value);
			return;
		}
		if ($cont_rqmt_rem_qty.equalsIgnoreCase(name)) {
			cont_rqmt_rem_qty(value);
			return;
		}
		if ($cont_fxd_rqmt_rem_qty.equalsIgnoreCase(name)) {
			cont_fxd_rqmt_rem_qty(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, int value) {
		if ($base_unit_inpt_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_qty(value);
			return;
		}
		if ($base_unit_rqmt_qty.equalsIgnoreCase(name)) {
			base_unit_rqmt_qty(value);
			return;
		}
		if ($base_unit_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			base_unit_fxd_rqmt_qty(value);
			return;
		}
		if ($base_unit_inpt_rem_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_rem_qty(value);
			return;
		}
		if ($base_unit_rqmt_rem_qty.equalsIgnoreCase(name)) {
			base_unit_rqmt_rem_qty(value);
			return;
		}
		if ($base_unit_fxd_rqmt_rem_qty.equalsIgnoreCase(name)) {
			base_unit_fxd_rqmt_rem_qty(value);
			return;
		}
		if ($base_unit_inpt_abort_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_abort_qty(value);
			return;
		}
		if ($cont_inpt_qty.equalsIgnoreCase(name)) {
			cont_inpt_qty(value);
			return;
		}
		if ($cont_rqmt_qty.equalsIgnoreCase(name)) {
			cont_rqmt_qty(value);
			return;
		}
		if ($cont_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			cont_fxd_rqmt_qty(value);
			return;
		}
		if ($cont_inpt_rem_qty.equalsIgnoreCase(name)) {
			cont_inpt_rem_qty(value);
			return;
		}
		if ($cont_rqmt_rem_qty.equalsIgnoreCase(name)) {
			cont_rqmt_rem_qty(value);
			return;
		}
		if ($cont_fxd_rqmt_rem_qty.equalsIgnoreCase(name)) {
			cont_fxd_rqmt_rem_qty(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, long value) {
		if ($base_unit_inpt_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_qty(value);
			return;
		}
		if ($base_unit_rqmt_qty.equalsIgnoreCase(name)) {
			base_unit_rqmt_qty(value);
			return;
		}
		if ($base_unit_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			base_unit_fxd_rqmt_qty(value);
			return;
		}
		if ($base_unit_inpt_rem_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_rem_qty(value);
			return;
		}
		if ($base_unit_rqmt_rem_qty.equalsIgnoreCase(name)) {
			base_unit_rqmt_rem_qty(value);
			return;
		}
		if ($base_unit_fxd_rqmt_rem_qty.equalsIgnoreCase(name)) {
			base_unit_fxd_rqmt_rem_qty(value);
			return;
		}
		if ($base_unit_inpt_abort_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_abort_qty(value);
			return;
		}
		if ($cont_inpt_qty.equalsIgnoreCase(name)) {
			cont_inpt_qty(value);
			return;
		}
		if ($cont_rqmt_qty.equalsIgnoreCase(name)) {
			cont_rqmt_qty(value);
			return;
		}
		if ($cont_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			cont_fxd_rqmt_qty(value);
			return;
		}
		if ($cont_inpt_rem_qty.equalsIgnoreCase(name)) {
			cont_inpt_rem_qty(value);
			return;
		}
		if ($cont_rqmt_rem_qty.equalsIgnoreCase(name)) {
			cont_rqmt_rem_qty(value);
			return;
		}
		if ($cont_fxd_rqmt_rem_qty.equalsIgnoreCase(name)) {
			cont_fxd_rqmt_rem_qty(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, float value) {
		if ($base_unit_inpt_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_qty(value);
			return;
		}
		if ($base_unit_rqmt_qty.equalsIgnoreCase(name)) {
			base_unit_rqmt_qty(value);
			return;
		}
		if ($base_unit_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			base_unit_fxd_rqmt_qty(value);
			return;
		}
		if ($base_unit_inpt_rem_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_rem_qty(value);
			return;
		}
		if ($base_unit_rqmt_rem_qty.equalsIgnoreCase(name)) {
			base_unit_rqmt_rem_qty(value);
			return;
		}
		if ($base_unit_fxd_rqmt_rem_qty.equalsIgnoreCase(name)) {
			base_unit_fxd_rqmt_rem_qty(value);
			return;
		}
		if ($base_unit_inpt_abort_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_abort_qty(value);
			return;
		}
		if ($cont_inpt_qty.equalsIgnoreCase(name)) {
			cont_inpt_qty(value);
			return;
		}
		if ($cont_rqmt_qty.equalsIgnoreCase(name)) {
			cont_rqmt_qty(value);
			return;
		}
		if ($cont_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			cont_fxd_rqmt_qty(value);
			return;
		}
		if ($cont_inpt_rem_qty.equalsIgnoreCase(name)) {
			cont_inpt_rem_qty(value);
			return;
		}
		if ($cont_rqmt_rem_qty.equalsIgnoreCase(name)) {
			cont_rqmt_rem_qty(value);
			return;
		}
		if ($cont_fxd_rqmt_rem_qty.equalsIgnoreCase(name)) {
			cont_fxd_rqmt_rem_qty(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, double value) {
		if ($base_unit_inpt_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_qty(value);
			return;
		}
		if ($base_unit_rqmt_qty.equalsIgnoreCase(name)) {
			base_unit_rqmt_qty(value);
			return;
		}
		if ($base_unit_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			base_unit_fxd_rqmt_qty(value);
			return;
		}
		if ($base_unit_inpt_rem_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_rem_qty(value);
			return;
		}
		if ($base_unit_rqmt_rem_qty.equalsIgnoreCase(name)) {
			base_unit_rqmt_rem_qty(value);
			return;
		}
		if ($base_unit_fxd_rqmt_rem_qty.equalsIgnoreCase(name)) {
			base_unit_fxd_rqmt_rem_qty(value);
			return;
		}
		if ($base_unit_inpt_abort_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_abort_qty(value);
			return;
		}
		if ($cont_inpt_qty.equalsIgnoreCase(name)) {
			cont_inpt_qty(value);
			return;
		}
		if ($cont_rqmt_qty.equalsIgnoreCase(name)) {
			cont_rqmt_qty(value);
			return;
		}
		if ($cont_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			cont_fxd_rqmt_qty(value);
			return;
		}
		if ($cont_inpt_rem_qty.equalsIgnoreCase(name)) {
			cont_inpt_rem_qty(value);
			return;
		}
		if ($cont_rqmt_rem_qty.equalsIgnoreCase(name)) {
			cont_rqmt_rem_qty(value);
			return;
		}
		if ($cont_fxd_rqmt_rem_qty.equalsIgnoreCase(name)) {
			cont_fxd_rqmt_rem_qty(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($inpt_schd_no.equalsIgnoreCase(name)) {
			inpt_schd_no(value);
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
		if ($base_unit_inpt_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_qty(value);
			return;
		}
		if ($base_unit_rqmt_qty.equalsIgnoreCase(name)) {
			base_unit_rqmt_qty(value);
			return;
		}
		if ($base_unit_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			base_unit_fxd_rqmt_qty(value);
			return;
		}
		if ($base_unit_inpt_rem_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_rem_qty(value);
			return;
		}
		if ($base_unit_rqmt_rem_qty.equalsIgnoreCase(name)) {
			base_unit_rqmt_rem_qty(value);
			return;
		}
		if ($base_unit_fxd_rqmt_rem_qty.equalsIgnoreCase(name)) {
			base_unit_fxd_rqmt_rem_qty(value);
			return;
		}
		if ($base_unit_inpt_abort_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_abort_qty(value);
			return;
		}
		if ($cont_inpt_qty.equalsIgnoreCase(name)) {
			cont_inpt_qty(value);
			return;
		}
		if ($cont_rqmt_qty.equalsIgnoreCase(name)) {
			cont_rqmt_qty(value);
			return;
		}
		if ($cont_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			cont_fxd_rqmt_qty(value);
			return;
		}
		if ($cont_inpt_rem_qty.equalsIgnoreCase(name)) {
			cont_inpt_rem_qty(value);
			return;
		}
		if ($cont_rqmt_rem_qty.equalsIgnoreCase(name)) {
			cont_rqmt_rem_qty(value);
			return;
		}
		if ($cont_fxd_rqmt_rem_qty.equalsIgnoreCase(name)) {
			cont_fxd_rqmt_rem_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, int value) {
		if ($base_unit_inpt_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_qty(value);
			return;
		}
		if ($base_unit_rqmt_qty.equalsIgnoreCase(name)) {
			base_unit_rqmt_qty(value);
			return;
		}
		if ($base_unit_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			base_unit_fxd_rqmt_qty(value);
			return;
		}
		if ($base_unit_inpt_rem_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_rem_qty(value);
			return;
		}
		if ($base_unit_rqmt_rem_qty.equalsIgnoreCase(name)) {
			base_unit_rqmt_rem_qty(value);
			return;
		}
		if ($base_unit_fxd_rqmt_rem_qty.equalsIgnoreCase(name)) {
			base_unit_fxd_rqmt_rem_qty(value);
			return;
		}
		if ($base_unit_inpt_abort_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_abort_qty(value);
			return;
		}
		if ($cont_inpt_qty.equalsIgnoreCase(name)) {
			cont_inpt_qty(value);
			return;
		}
		if ($cont_rqmt_qty.equalsIgnoreCase(name)) {
			cont_rqmt_qty(value);
			return;
		}
		if ($cont_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			cont_fxd_rqmt_qty(value);
			return;
		}
		if ($cont_inpt_rem_qty.equalsIgnoreCase(name)) {
			cont_inpt_rem_qty(value);
			return;
		}
		if ($cont_rqmt_rem_qty.equalsIgnoreCase(name)) {
			cont_rqmt_rem_qty(value);
			return;
		}
		if ($cont_fxd_rqmt_rem_qty.equalsIgnoreCase(name)) {
			cont_fxd_rqmt_rem_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, long value) {
		if ($base_unit_inpt_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_qty(value);
			return;
		}
		if ($base_unit_rqmt_qty.equalsIgnoreCase(name)) {
			base_unit_rqmt_qty(value);
			return;
		}
		if ($base_unit_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			base_unit_fxd_rqmt_qty(value);
			return;
		}
		if ($base_unit_inpt_rem_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_rem_qty(value);
			return;
		}
		if ($base_unit_rqmt_rem_qty.equalsIgnoreCase(name)) {
			base_unit_rqmt_rem_qty(value);
			return;
		}
		if ($base_unit_fxd_rqmt_rem_qty.equalsIgnoreCase(name)) {
			base_unit_fxd_rqmt_rem_qty(value);
			return;
		}
		if ($base_unit_inpt_abort_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_abort_qty(value);
			return;
		}
		if ($cont_inpt_qty.equalsIgnoreCase(name)) {
			cont_inpt_qty(value);
			return;
		}
		if ($cont_rqmt_qty.equalsIgnoreCase(name)) {
			cont_rqmt_qty(value);
			return;
		}
		if ($cont_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			cont_fxd_rqmt_qty(value);
			return;
		}
		if ($cont_inpt_rem_qty.equalsIgnoreCase(name)) {
			cont_inpt_rem_qty(value);
			return;
		}
		if ($cont_rqmt_rem_qty.equalsIgnoreCase(name)) {
			cont_rqmt_rem_qty(value);
			return;
		}
		if ($cont_fxd_rqmt_rem_qty.equalsIgnoreCase(name)) {
			cont_fxd_rqmt_rem_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, float value) {
		if ($base_unit_inpt_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_qty(value);
			return;
		}
		if ($base_unit_rqmt_qty.equalsIgnoreCase(name)) {
			base_unit_rqmt_qty(value);
			return;
		}
		if ($base_unit_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			base_unit_fxd_rqmt_qty(value);
			return;
		}
		if ($base_unit_inpt_rem_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_rem_qty(value);
			return;
		}
		if ($base_unit_rqmt_rem_qty.equalsIgnoreCase(name)) {
			base_unit_rqmt_rem_qty(value);
			return;
		}
		if ($base_unit_fxd_rqmt_rem_qty.equalsIgnoreCase(name)) {
			base_unit_fxd_rqmt_rem_qty(value);
			return;
		}
		if ($base_unit_inpt_abort_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_abort_qty(value);
			return;
		}
		if ($cont_inpt_qty.equalsIgnoreCase(name)) {
			cont_inpt_qty(value);
			return;
		}
		if ($cont_rqmt_qty.equalsIgnoreCase(name)) {
			cont_rqmt_qty(value);
			return;
		}
		if ($cont_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			cont_fxd_rqmt_qty(value);
			return;
		}
		if ($cont_inpt_rem_qty.equalsIgnoreCase(name)) {
			cont_inpt_rem_qty(value);
			return;
		}
		if ($cont_rqmt_rem_qty.equalsIgnoreCase(name)) {
			cont_rqmt_rem_qty(value);
			return;
		}
		if ($cont_fxd_rqmt_rem_qty.equalsIgnoreCase(name)) {
			cont_fxd_rqmt_rem_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, double value) {
		if ($base_unit_inpt_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_qty(value);
			return;
		}
		if ($base_unit_rqmt_qty.equalsIgnoreCase(name)) {
			base_unit_rqmt_qty(value);
			return;
		}
		if ($base_unit_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			base_unit_fxd_rqmt_qty(value);
			return;
		}
		if ($base_unit_inpt_rem_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_rem_qty(value);
			return;
		}
		if ($base_unit_rqmt_rem_qty.equalsIgnoreCase(name)) {
			base_unit_rqmt_rem_qty(value);
			return;
		}
		if ($base_unit_fxd_rqmt_rem_qty.equalsIgnoreCase(name)) {
			base_unit_fxd_rqmt_rem_qty(value);
			return;
		}
		if ($base_unit_inpt_abort_qty.equalsIgnoreCase(name)) {
			base_unit_inpt_abort_qty(value);
			return;
		}
		if ($cont_inpt_qty.equalsIgnoreCase(name)) {
			cont_inpt_qty(value);
			return;
		}
		if ($cont_rqmt_qty.equalsIgnoreCase(name)) {
			cont_rqmt_qty(value);
			return;
		}
		if ($cont_fxd_rqmt_qty.equalsIgnoreCase(name)) {
			cont_fxd_rqmt_qty(value);
			return;
		}
		if ($cont_inpt_rem_qty.equalsIgnoreCase(name)) {
			cont_inpt_rem_qty(value);
			return;
		}
		if ($cont_rqmt_rem_qty.equalsIgnoreCase(name)) {
			cont_rqmt_rem_qty(value);
			return;
		}
		if ($cont_fxd_rqmt_rem_qty.equalsIgnoreCase(name)) {
			cont_fxd_rqmt_rem_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}

}
