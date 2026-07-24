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
import mcframe.serverCore.queryapi.IFMCSQL.MCBooleanPermColumn;
import mcframe.commonCore.meta.MCMeta;
import mcframe.commonCore.lang.MCDataType;
import mcframe.serverCore.queryapi.MCDBContainer;
import mcframe.serverCore.queryapi.MCDBContainer.MCTableType;
import mcframe.serverCore.queryapi.IFMCSQL.MCPermColumn;
import mcframe.serverCore.queryapi.IFMCSQL.MCPermColumnInfo;
import mcframe.serverCore.queryapi.MCForeignInfo;

/**
 * "工程オーダ情報ワーク // Operation order info. work"DBコンテナRowクラスです。<p>
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
 *  	<td>oper_ord_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>工程オーダＮＯ</td>
 *  	<td>Operation order No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>st_schd_tm</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>工程着手予定日時</td>
 *  	<td>Scheduled operation start date and time</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>inst_st_schd_tm</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>工程着手予定日時（指図）</td>
 *  	<td>Scheduled operation start date and time (Order)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>act_st_tm</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>工程着手実績日時</td>
 *  	<td>Actual operation start date and time</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>end_schd_tm</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>工程終了予定日時</td>
 *  	<td>Scheduled operation end date and time</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>inst_end_schd_tm</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>工程終了予定日時（指図）</td>
 *  	<td>Scheduled operation end date and time (Order)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>act_end_tm</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>工程終了実績日時</td>
 *  	<td>Actual operation end date and time</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>oper_lt</td>
 *  	<td>N</td>
 *  	<td>9,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>工程ＬＴ</td>
 *  	<td>Operation LT</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>act_oper_lt</td>
 *  	<td>N</td>
 *  	<td>9,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>工程ＬＴ（実績）</td>
 *  	<td>Operation LT (Result)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>oper_offst_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>工程オフセット区分</td>
 *  	<td>Operation offset type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>oper_offst</td>
 *  	<td>N</td>
 *  	<td>9,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>工程オフセット</td>
 *  	<td>Operation offset</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>oper_schd_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>工程指図予定数量</td>
 *  	<td>Operation order scheduled qty.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>not_oper_schd_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>工程未指図数量</td>
 *  	<td>Operation unordered qty.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>itm_ord_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目オーダＮＯ</td>
 *  	<td>Item order No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>disp_seq</td>
 *  	<td>N</td>
 *  	<td>9,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>工順</td>
 *  	<td>Routing</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>oper_ptn</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>工程パタン</td>
 *  	<td>Operation pattern</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>oper_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>工程ＣＤ</td>
 *  	<td>Operation cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>oper_seq</td>
 *  	<td>N</td>
 *  	<td>9,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>工程連番</td>
 *  	<td>Operation sequence number</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>loc_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>場所ＣＤ</td>
 *  	<td>Location cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>oper_ord_sts_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>工程オーダ状況区分</td>
 *  	<td>Operation order status type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>itm_ord_sts_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目オーダ状況区分</td>
 *  	<td>Item order status type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>wg_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>WG ＣＤ</td>
 *  	<td>WG cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>yield_oper_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>出来高計上工程ＦＬＧ</td>
 *  	<td>Create inventory flg.</td>
 *  </tr>
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
public class MSW_OPER_ORDER_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.TEMP_TABLE_ON_COMMIT_DELETE_ROWS;

	public static final String TABLE_NAME = "MSW_OPER_ORDER";

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
	 * 工程オーダＮＯ. Operation order No..<p>
	 *
	 */
	public static final String $oper_ord_no = "oper_ord_no";
	private static final MCPermColumnInfo _oper_ord_no = createColumnInfo("oper_ord_no");
	public final MCStringPermColumn oper_ord_no = createStringColumn(_oper_ord_no);
	
	/**
	 * 工程着手予定日時. Scheduled operation start date and time.<p>
	 *
	 */
	public static final String $st_schd_tm = "st_schd_tm";
	private static final MCPermColumnInfo _st_schd_tm = createColumnInfo("st_schd_tm");
	public final MCDatePermColumn st_schd_tm = createDateColumn(_st_schd_tm);
	
	/**
	 * 工程着手予定日時（指図）. Scheduled operation start date and time (Order).<p>
	 *
	 */
	public static final String $inst_st_schd_tm = "inst_st_schd_tm";
	private static final MCPermColumnInfo _inst_st_schd_tm = createColumnInfo("inst_st_schd_tm");
	public final MCDatePermColumn inst_st_schd_tm = createDateColumn(_inst_st_schd_tm);
	
	/**
	 * 工程着手実績日時. Actual operation start date and time.<p>
	 *
	 */
	public static final String $act_st_tm = "act_st_tm";
	private static final MCPermColumnInfo _act_st_tm = createColumnInfo("act_st_tm");
	public final MCDatePermColumn act_st_tm = createDateColumn(_act_st_tm);
	
	/**
	 * 工程終了予定日時. Scheduled operation end date and time.<p>
	 *
	 */
	public static final String $end_schd_tm = "end_schd_tm";
	private static final MCPermColumnInfo _end_schd_tm = createColumnInfo("end_schd_tm");
	public final MCDatePermColumn end_schd_tm = createDateColumn(_end_schd_tm);
	
	/**
	 * 工程終了予定日時（指図）. Scheduled operation end date and time (Order).<p>
	 *
	 */
	public static final String $inst_end_schd_tm = "inst_end_schd_tm";
	private static final MCPermColumnInfo _inst_end_schd_tm = createColumnInfo("inst_end_schd_tm");
	public final MCDatePermColumn inst_end_schd_tm = createDateColumn(_inst_end_schd_tm);
	
	/**
	 * 工程終了実績日時. Actual operation end date and time.<p>
	 *
	 */
	public static final String $act_end_tm = "act_end_tm";
	private static final MCPermColumnInfo _act_end_tm = createColumnInfo("act_end_tm");
	public final MCDatePermColumn act_end_tm = createDateColumn(_act_end_tm);
	
	/**
	 * 工程ＬＴ. Operation LT.<p>
	 *
	 */
	public static final String $oper_lt = "oper_lt";
	private static final MCPermColumnInfo _oper_lt = createColumnInfo("oper_lt");
	public final MCNumberPermColumn oper_lt = createNumberColumn(_oper_lt);
	
	/**
	 * 工程ＬＴ（実績）. Operation LT (Result).<p>
	 *
	 */
	public static final String $act_oper_lt = "act_oper_lt";
	private static final MCPermColumnInfo _act_oper_lt = createColumnInfo("act_oper_lt");
	public final MCNumberPermColumn act_oper_lt = createNumberColumn(_act_oper_lt);
	
	/**
	 * 工程オフセット区分. Operation offset type.<p>
	 *
	 */
	public static final String $oper_offst_typ = "oper_offst_typ";
	private static final MCPermColumnInfo _oper_offst_typ = createColumnInfo("oper_offst_typ");
	public final MCStringPermColumn oper_offst_typ = createStringColumn(_oper_offst_typ);
	
	/**
	 * 工程オフセット. Operation offset.<p>
	 *
	 */
	public static final String $oper_offst = "oper_offst";
	private static final MCPermColumnInfo _oper_offst = createColumnInfo("oper_offst");
	public final MCNumberPermColumn oper_offst = createNumberColumn(_oper_offst);
	
	/**
	 * 工程指図予定数量. Operation order scheduled qty..<p>
	 *
	 */
	public static final String $oper_schd_qty = "oper_schd_qty";
	private static final MCPermColumnInfo _oper_schd_qty = createColumnInfo("oper_schd_qty");
	public final MCNumberPermColumn oper_schd_qty = createNumberColumn(_oper_schd_qty);
	
	/**
	 * 工程未指図数量. Operation unordered qty..<p>
	 *
	 */
	public static final String $not_oper_schd_qty = "not_oper_schd_qty";
	private static final MCPermColumnInfo _not_oper_schd_qty = createColumnInfo("not_oper_schd_qty");
	public final MCNumberPermColumn not_oper_schd_qty = createNumberColumn(_not_oper_schd_qty);
	
	/**
	 * 品目オーダＮＯ. Item order No..<p>
	 *
	 */
	public static final String $itm_ord_no = "itm_ord_no";
	private static final MCPermColumnInfo _itm_ord_no = createColumnInfo("itm_ord_no");
	public final MCStringPermColumn itm_ord_no = createStringColumn(_itm_ord_no);
	
	/**
	 * 工順. Routing.<p>
	 *
	 */
	public static final String $disp_seq = "disp_seq";
	private static final MCPermColumnInfo _disp_seq = createColumnInfo("disp_seq");
	public final MCNumberPermColumn disp_seq = createNumberColumn(_disp_seq);
	
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
	 * 場所ＣＤ. Location cd..<p>
	 *
	 */
	public static final String $loc_cd = "loc_cd";
	private static final MCPermColumnInfo _loc_cd = createColumnInfo("loc_cd");
	public final MCStringPermColumn loc_cd = createStringColumn(_loc_cd);
	
	/**
	 * 工程オーダ状況区分. Operation order status type.<p>
	 *
	 */
	public static final String $oper_ord_sts_typ = "oper_ord_sts_typ";
	private static final MCPermColumnInfo _oper_ord_sts_typ = createColumnInfo("oper_ord_sts_typ");
	public final MCStringPermColumn oper_ord_sts_typ = createStringColumn(_oper_ord_sts_typ);
	
	/**
	 * 品目オーダ状況区分. Item order status type.<p>
	 *
	 */
	public static final String $itm_ord_sts_typ = "itm_ord_sts_typ";
	private static final MCPermColumnInfo _itm_ord_sts_typ = createColumnInfo("itm_ord_sts_typ");
	public final MCStringPermColumn itm_ord_sts_typ = createStringColumn(_itm_ord_sts_typ);
	
	/**
	 * WG ＣＤ. WG cd..<p>
	 *
	 */
	public static final String $wg_cd = "wg_cd";
	private static final MCPermColumnInfo _wg_cd = createColumnInfo("wg_cd");
	public final MCStringPermColumn wg_cd = createStringColumn(_wg_cd);
	
	/**
	 * 出来高計上工程ＦＬＧ. Create inventory flg..<p>
	 *
	 */
	public static final String $yield_oper_flg = "yield_oper_flg";
	private static final MCPermColumnInfo _yield_oper_flg = createColumnInfo("yield_oper_flg");
	public final MCBooleanPermColumn yield_oper_flg = createBooleanColumn(_yield_oper_flg);
	
	public static final MCMeta peg_no_META = createCommonMeta($peg_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta oper_ord_no_META = createCommonMeta($oper_ord_no, mcframe.commonMA.meta.MA_META.OPER_ORD_NO);
	public static final MCMeta st_schd_tm_META = createCommonMeta($st_schd_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta inst_st_schd_tm_META = createCommonMeta($inst_st_schd_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta act_st_tm_META = createCommonMeta($act_st_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta end_schd_tm_META = createCommonMeta($end_schd_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta inst_end_schd_tm_META = createCommonMeta($inst_end_schd_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta act_end_tm_META = createCommonMeta($act_end_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta oper_lt_META = createCommonMeta($oper_lt, mcframe.commonMA.meta.MA_META.LT);
	public static final MCMeta act_oper_lt_META = createCommonMeta($act_oper_lt, mcframe.commonMA.meta.MA_META.LT);
	public static final MCMeta oper_offst_typ_META = createCommonMeta($oper_offst_typ, mcframe.commonMA.meta.MA_META.OFFST_TYP);
	public static final MCMeta oper_offst_META = createCommonMeta($oper_offst, mcframe.commonMA.meta.MA_META.OFFST);
	public static final MCMeta oper_schd_qty_META = createCommonMeta($oper_schd_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta not_oper_schd_qty_META = createCommonMeta($not_oper_schd_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta itm_ord_no_META = createCommonMeta($itm_ord_no, mcframe.commonMA.meta.MA_META.ITM_ORD_NO);
	public static final MCMeta disp_seq_META = createCommonMeta($disp_seq, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta oper_ptn_META = createCommonMeta($oper_ptn, mcframe.commonMA.meta.MA_META.OPER_PTN);
	public static final MCMeta oper_cd_META = createCommonMeta($oper_cd, mcframe.commonMA.meta.MA_META.OPER_CD);
	public static final MCMeta oper_seq_META = createCommonMeta($oper_seq, mcframe.commonMA.meta.MA_META.OPER_SEQ);
	public static final MCMeta loc_cd_META = createCommonMeta($loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta oper_ord_sts_typ_META = createCommonMeta($oper_ord_sts_typ, mcframe.commonMS.meta.MS_META.OPER_ORD_STS_TYP);
	public static final MCMeta itm_ord_sts_typ_META = createCommonMeta($itm_ord_sts_typ, mcframe.commonMS.meta.MS_META.ITM_ORD_STS_TYP);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta yield_oper_flg_META = createCommonMeta($yield_oper_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final List<MCForeignInfo> FOREIGN_INFO_LIST = new ArrayList<>();
	static {
	}
	
	protected static final ConstMetaList<MSW_OPER_ORDER_R> constMetas = new ConstMetaList<MSW_OPER_ORDER_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			peg_no_META,
			oper_ord_no_META,
			st_schd_tm_META,
			inst_st_schd_tm_META,
			act_st_tm_META,
			end_schd_tm_META,
			inst_end_schd_tm_META,
			act_end_tm_META,
			oper_lt_META,
			act_oper_lt_META,
			oper_offst_typ_META,
			oper_offst_META,
			oper_schd_qty_META,
			not_oper_schd_qty_META,
			itm_ord_no_META,
			disp_seq_META,
			oper_ptn_META,
			oper_cd_META,
			oper_seq_META,
			loc_cd_META,
			oper_ord_sts_typ_META,
			itm_ord_sts_typ_META,
			wg_cd_META,
			yield_oper_flg_META
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
	protected MSW_OPER_ORDER_R(ConstMetaList<? extends MSW_OPER_ORDER_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MSW_OPER_ORDER_R(ConstMetaList<? extends MSW_OPER_ORDER_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MSW_OPER_ORDER_R.$peg_no,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MSW_OPER_ORDER_R.$peg_no,
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
			MSW_OPER_ORDER_R.$oper_ord_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_OPER_ORDER_R.$oper_ord_no,
				"oper_ord_no",
				oper_ord_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_OPER_ORDER_R.$st_schd_tm,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MSW_OPER_ORDER_R.$st_schd_tm,
				"st_schd_tm",
				st_schd_tm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_OPER_ORDER_R.$inst_st_schd_tm,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MSW_OPER_ORDER_R.$inst_st_schd_tm,
				"inst_st_schd_tm",
				inst_st_schd_tm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_OPER_ORDER_R.$act_st_tm,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MSW_OPER_ORDER_R.$act_st_tm,
				"act_st_tm",
				act_st_tm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_OPER_ORDER_R.$end_schd_tm,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MSW_OPER_ORDER_R.$end_schd_tm,
				"end_schd_tm",
				end_schd_tm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_OPER_ORDER_R.$inst_end_schd_tm,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MSW_OPER_ORDER_R.$inst_end_schd_tm,
				"inst_end_schd_tm",
				inst_end_schd_tm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_OPER_ORDER_R.$act_end_tm,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MSW_OPER_ORDER_R.$act_end_tm,
				"act_end_tm",
				act_end_tm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_OPER_ORDER_R.$oper_lt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MSW_OPER_ORDER_R.$oper_lt,
				"oper_lt",
				oper_lt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_OPER_ORDER_R.$act_oper_lt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MSW_OPER_ORDER_R.$act_oper_lt,
				"act_oper_lt",
				act_oper_lt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_OPER_ORDER_R.$oper_offst_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_OPER_ORDER_R.$oper_offst_typ,
				"oper_offst_typ",
				oper_offst_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_OPER_ORDER_R.$oper_offst,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MSW_OPER_ORDER_R.$oper_offst,
				"oper_offst",
				oper_offst,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_OPER_ORDER_R.$oper_schd_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MSW_OPER_ORDER_R.$oper_schd_qty,
				"oper_schd_qty",
				oper_schd_qty,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_OPER_ORDER_R.$not_oper_schd_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MSW_OPER_ORDER_R.$not_oper_schd_qty,
				"not_oper_schd_qty",
				not_oper_schd_qty,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_OPER_ORDER_R.$itm_ord_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_OPER_ORDER_R.$itm_ord_no,
				"itm_ord_no",
				itm_ord_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_OPER_ORDER_R.$disp_seq,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MSW_OPER_ORDER_R.$disp_seq,
				"disp_seq",
				disp_seq,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_OPER_ORDER_R.$oper_ptn,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_OPER_ORDER_R.$oper_ptn,
				"oper_ptn",
				oper_ptn,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_OPER_ORDER_R.$oper_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_OPER_ORDER_R.$oper_cd,
				"oper_cd",
				oper_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_OPER_ORDER_R.$oper_seq,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MSW_OPER_ORDER_R.$oper_seq,
				"oper_seq",
				oper_seq,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_OPER_ORDER_R.$loc_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_OPER_ORDER_R.$loc_cd,
				"loc_cd",
				loc_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_OPER_ORDER_R.$oper_ord_sts_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_OPER_ORDER_R.$oper_ord_sts_typ,
				"oper_ord_sts_typ",
				oper_ord_sts_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_OPER_ORDER_R.$itm_ord_sts_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_OPER_ORDER_R.$itm_ord_sts_typ,
				"itm_ord_sts_typ",
				itm_ord_sts_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSW_OPER_ORDER_R.$wg_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSW_OPER_ORDER_R.$wg_cd,
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
			MSW_OPER_ORDER_R.$yield_oper_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MSW_OPER_ORDER_R.$yield_oper_flg,
				"yield_oper_flg",
				yield_oper_flg,
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
	public static MSW_OPER_ORDER_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MSW_OPER_ORDER_R create(String alias) {
		MSW_OPER_ORDER_R row = new MSW_OPER_ORDER_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MSW_OPER_ORDER_R createByName(T proto) {
		MSW_OPER_ORDER_R row = MSW_OPER_ORDER_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MSW_OPER_ORDER_R clone() {
		return (MSW_OPER_ORDER_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MSW_OPER_ORDER_R createInstance() {
		return (MSW_OPER_ORDER_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MSW_OPER_ORDER_R getValues(String... names) {
		return (MSW_OPER_ORDER_R) super.getValues(names);
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
	 * 工程オーダＮＯ. Operation order No..<p>
	 *
	 */
	public String oper_ord_no() {
		return getConstString(offset + 1, $oper_ord_no);
	}

	/**
	 * 工程オーダＮＯ. Operation order No..<p>
	 *
	 */
	public void oper_ord_no(String value) {
		setConstString(offset + 1, $oper_ord_no, value);
	}

	/**
	 * 工程着手予定日時. Scheduled operation start date and time.<p>
	 *
	 */
	public MCDate st_schd_tm() {
		return getConstDate(offset + 2, $st_schd_tm);
	}

	/**
	 * 工程着手予定日時. Scheduled operation start date and time.<p>
	 *
	 */
	public void st_schd_tm(MCDate value) {
		setConstDate(offset + 2, $st_schd_tm, value);
	}

	/**
	 * 工程着手予定日時（指図）. Scheduled operation start date and time (Order).<p>
	 *
	 */
	public MCDate inst_st_schd_tm() {
		return getConstDate(offset + 3, $inst_st_schd_tm);
	}

	/**
	 * 工程着手予定日時（指図）. Scheduled operation start date and time (Order).<p>
	 *
	 */
	public void inst_st_schd_tm(MCDate value) {
		setConstDate(offset + 3, $inst_st_schd_tm, value);
	}

	/**
	 * 工程着手実績日時. Actual operation start date and time.<p>
	 *
	 */
	public MCDate act_st_tm() {
		return getConstDate(offset + 4, $act_st_tm);
	}

	/**
	 * 工程着手実績日時. Actual operation start date and time.<p>
	 *
	 */
	public void act_st_tm(MCDate value) {
		setConstDate(offset + 4, $act_st_tm, value);
	}

	/**
	 * 工程終了予定日時. Scheduled operation end date and time.<p>
	 *
	 */
	public MCDate end_schd_tm() {
		return getConstDate(offset + 5, $end_schd_tm);
	}

	/**
	 * 工程終了予定日時. Scheduled operation end date and time.<p>
	 *
	 */
	public void end_schd_tm(MCDate value) {
		setConstDate(offset + 5, $end_schd_tm, value);
	}

	/**
	 * 工程終了予定日時（指図）. Scheduled operation end date and time (Order).<p>
	 *
	 */
	public MCDate inst_end_schd_tm() {
		return getConstDate(offset + 6, $inst_end_schd_tm);
	}

	/**
	 * 工程終了予定日時（指図）. Scheduled operation end date and time (Order).<p>
	 *
	 */
	public void inst_end_schd_tm(MCDate value) {
		setConstDate(offset + 6, $inst_end_schd_tm, value);
	}

	/**
	 * 工程終了実績日時. Actual operation end date and time.<p>
	 *
	 */
	public MCDate act_end_tm() {
		return getConstDate(offset + 7, $act_end_tm);
	}

	/**
	 * 工程終了実績日時. Actual operation end date and time.<p>
	 *
	 */
	public void act_end_tm(MCDate value) {
		setConstDate(offset + 7, $act_end_tm, value);
	}

	/**
	 * 工程ＬＴ. Operation LT.<p>
	 *
	 */
	public MCNumber oper_lt() {
		return getConstNumber(offset + 8, $oper_lt);
	}

	/**
	 * 工程ＬＴ. Operation LT.<p>
	 *
	 */
	public void oper_lt(MCNumber value) {
		setConstNumber(offset + 8, $oper_lt, value);
	}
	
	/**
	 * 工程ＬＴ. Operation LT.<p>
	 *
	 */
	public void oper_lt(int value) {
		setConstNumber(offset + 8, $oper_lt, value);
	}
	
	/**
	 * 工程ＬＴ. Operation LT.<p>
	 *
	 */
	public void oper_lt(long value) {
		setConstNumber(offset + 8, $oper_lt, value);
	}
	
	/**
	 * 工程ＬＴ. Operation LT.<p>
	 *
	 */
	public void oper_lt(float value) {
		setConstNumber(offset + 8, $oper_lt, value);
	}
	
	/**
	 * 工程ＬＴ. Operation LT.<p>
	 *
	 */
	public void oper_lt(double value) {
		setConstNumber(offset + 8, $oper_lt, value);
	}
	
	/**
	 * 工程ＬＴ（実績）. Operation LT (Result).<p>
	 *
	 */
	public MCNumber act_oper_lt() {
		return getConstNumber(offset + 9, $act_oper_lt);
	}

	/**
	 * 工程ＬＴ（実績）. Operation LT (Result).<p>
	 *
	 */
	public void act_oper_lt(MCNumber value) {
		setConstNumber(offset + 9, $act_oper_lt, value);
	}
	
	/**
	 * 工程ＬＴ（実績）. Operation LT (Result).<p>
	 *
	 */
	public void act_oper_lt(int value) {
		setConstNumber(offset + 9, $act_oper_lt, value);
	}
	
	/**
	 * 工程ＬＴ（実績）. Operation LT (Result).<p>
	 *
	 */
	public void act_oper_lt(long value) {
		setConstNumber(offset + 9, $act_oper_lt, value);
	}
	
	/**
	 * 工程ＬＴ（実績）. Operation LT (Result).<p>
	 *
	 */
	public void act_oper_lt(float value) {
		setConstNumber(offset + 9, $act_oper_lt, value);
	}
	
	/**
	 * 工程ＬＴ（実績）. Operation LT (Result).<p>
	 *
	 */
	public void act_oper_lt(double value) {
		setConstNumber(offset + 9, $act_oper_lt, value);
	}
	
	/**
	 * 工程オフセット区分. Operation offset type.<p>
	 *
	 */
	public String oper_offst_typ() {
		return getConstString(offset + 10, $oper_offst_typ);
	}

	/**
	 * 工程オフセット区分. Operation offset type.<p>
	 *
	 */
	public void oper_offst_typ(String value) {
		setConstString(offset + 10, $oper_offst_typ, value);
	}

	/**
	 * 工程オフセット. Operation offset.<p>
	 *
	 */
	public MCNumber oper_offst() {
		return getConstNumber(offset + 11, $oper_offst);
	}

	/**
	 * 工程オフセット. Operation offset.<p>
	 *
	 */
	public void oper_offst(MCNumber value) {
		setConstNumber(offset + 11, $oper_offst, value);
	}
	
	/**
	 * 工程オフセット. Operation offset.<p>
	 *
	 */
	public void oper_offst(int value) {
		setConstNumber(offset + 11, $oper_offst, value);
	}
	
	/**
	 * 工程オフセット. Operation offset.<p>
	 *
	 */
	public void oper_offst(long value) {
		setConstNumber(offset + 11, $oper_offst, value);
	}
	
	/**
	 * 工程オフセット. Operation offset.<p>
	 *
	 */
	public void oper_offst(float value) {
		setConstNumber(offset + 11, $oper_offst, value);
	}
	
	/**
	 * 工程オフセット. Operation offset.<p>
	 *
	 */
	public void oper_offst(double value) {
		setConstNumber(offset + 11, $oper_offst, value);
	}
	
	/**
	 * 工程指図予定数量. Operation order scheduled qty..<p>
	 *
	 */
	public MCNumber oper_schd_qty() {
		return getConstNumber(offset + 12, $oper_schd_qty);
	}

	/**
	 * 工程指図予定数量. Operation order scheduled qty..<p>
	 *
	 */
	public void oper_schd_qty(MCNumber value) {
		setConstNumber(offset + 12, $oper_schd_qty, value);
	}
	
	/**
	 * 工程指図予定数量. Operation order scheduled qty..<p>
	 *
	 */
	public void oper_schd_qty(int value) {
		setConstNumber(offset + 12, $oper_schd_qty, value);
	}
	
	/**
	 * 工程指図予定数量. Operation order scheduled qty..<p>
	 *
	 */
	public void oper_schd_qty(long value) {
		setConstNumber(offset + 12, $oper_schd_qty, value);
	}
	
	/**
	 * 工程指図予定数量. Operation order scheduled qty..<p>
	 *
	 */
	public void oper_schd_qty(float value) {
		setConstNumber(offset + 12, $oper_schd_qty, value);
	}
	
	/**
	 * 工程指図予定数量. Operation order scheduled qty..<p>
	 *
	 */
	public void oper_schd_qty(double value) {
		setConstNumber(offset + 12, $oper_schd_qty, value);
	}
	
	/**
	 * 工程未指図数量. Operation unordered qty..<p>
	 *
	 */
	public MCNumber not_oper_schd_qty() {
		return getConstNumber(offset + 13, $not_oper_schd_qty);
	}

	/**
	 * 工程未指図数量. Operation unordered qty..<p>
	 *
	 */
	public void not_oper_schd_qty(MCNumber value) {
		setConstNumber(offset + 13, $not_oper_schd_qty, value);
	}
	
	/**
	 * 工程未指図数量. Operation unordered qty..<p>
	 *
	 */
	public void not_oper_schd_qty(int value) {
		setConstNumber(offset + 13, $not_oper_schd_qty, value);
	}
	
	/**
	 * 工程未指図数量. Operation unordered qty..<p>
	 *
	 */
	public void not_oper_schd_qty(long value) {
		setConstNumber(offset + 13, $not_oper_schd_qty, value);
	}
	
	/**
	 * 工程未指図数量. Operation unordered qty..<p>
	 *
	 */
	public void not_oper_schd_qty(float value) {
		setConstNumber(offset + 13, $not_oper_schd_qty, value);
	}
	
	/**
	 * 工程未指図数量. Operation unordered qty..<p>
	 *
	 */
	public void not_oper_schd_qty(double value) {
		setConstNumber(offset + 13, $not_oper_schd_qty, value);
	}
	
	/**
	 * 品目オーダＮＯ. Item order No..<p>
	 *
	 */
	public String itm_ord_no() {
		return getConstString(offset + 14, $itm_ord_no);
	}

	/**
	 * 品目オーダＮＯ. Item order No..<p>
	 *
	 */
	public void itm_ord_no(String value) {
		setConstString(offset + 14, $itm_ord_no, value);
	}

	/**
	 * 工順. Routing.<p>
	 *
	 */
	public MCNumber disp_seq() {
		return getConstNumber(offset + 15, $disp_seq);
	}

	/**
	 * 工順. Routing.<p>
	 *
	 */
	public void disp_seq(MCNumber value) {
		setConstNumber(offset + 15, $disp_seq, value);
	}
	
	/**
	 * 工順. Routing.<p>
	 *
	 */
	public void disp_seq(int value) {
		setConstNumber(offset + 15, $disp_seq, value);
	}
	
	/**
	 * 工順. Routing.<p>
	 *
	 */
	public void disp_seq(long value) {
		setConstNumber(offset + 15, $disp_seq, value);
	}
	
	/**
	 * 工順. Routing.<p>
	 *
	 */
	public void disp_seq(float value) {
		setConstNumber(offset + 15, $disp_seq, value);
	}
	
	/**
	 * 工順. Routing.<p>
	 *
	 */
	public void disp_seq(double value) {
		setConstNumber(offset + 15, $disp_seq, value);
	}
	
	/**
	 * 工程パタン. Operation pattern.<p>
	 *
	 */
	public String oper_ptn() {
		return getConstString(offset + 16, $oper_ptn);
	}

	/**
	 * 工程パタン. Operation pattern.<p>
	 *
	 */
	public void oper_ptn(String value) {
		setConstString(offset + 16, $oper_ptn, value);
	}

	/**
	 * 工程ＣＤ. Operation cd..<p>
	 *
	 */
	public String oper_cd() {
		return getConstString(offset + 17, $oper_cd);
	}

	/**
	 * 工程ＣＤ. Operation cd..<p>
	 *
	 */
	public void oper_cd(String value) {
		setConstString(offset + 17, $oper_cd, value);
	}

	/**
	 * 工程連番. Operation sequence number.<p>
	 *
	 */
	public MCNumber oper_seq() {
		return getConstNumber(offset + 18, $oper_seq);
	}

	/**
	 * 工程連番. Operation sequence number.<p>
	 *
	 */
	public void oper_seq(MCNumber value) {
		setConstNumber(offset + 18, $oper_seq, value);
	}
	
	/**
	 * 工程連番. Operation sequence number.<p>
	 *
	 */
	public void oper_seq(int value) {
		setConstNumber(offset + 18, $oper_seq, value);
	}
	
	/**
	 * 工程連番. Operation sequence number.<p>
	 *
	 */
	public void oper_seq(long value) {
		setConstNumber(offset + 18, $oper_seq, value);
	}
	
	/**
	 * 工程連番. Operation sequence number.<p>
	 *
	 */
	public void oper_seq(float value) {
		setConstNumber(offset + 18, $oper_seq, value);
	}
	
	/**
	 * 工程連番. Operation sequence number.<p>
	 *
	 */
	public void oper_seq(double value) {
		setConstNumber(offset + 18, $oper_seq, value);
	}
	
	/**
	 * 場所ＣＤ. Location cd..<p>
	 *
	 */
	public String loc_cd() {
		return getConstString(offset + 19, $loc_cd);
	}

	/**
	 * 場所ＣＤ. Location cd..<p>
	 *
	 */
	public void loc_cd(String value) {
		setConstString(offset + 19, $loc_cd, value);
	}

	/**
	 * 工程オーダ状況区分. Operation order status type.<p>
	 *
	 */
	public String oper_ord_sts_typ() {
		return getConstString(offset + 20, $oper_ord_sts_typ);
	}

	/**
	 * 工程オーダ状況区分. Operation order status type.<p>
	 *
	 */
	public void oper_ord_sts_typ(String value) {
		setConstString(offset + 20, $oper_ord_sts_typ, value);
	}

	/**
	 * 品目オーダ状況区分. Item order status type.<p>
	 *
	 */
	public String itm_ord_sts_typ() {
		return getConstString(offset + 21, $itm_ord_sts_typ);
	}

	/**
	 * 品目オーダ状況区分. Item order status type.<p>
	 *
	 */
	public void itm_ord_sts_typ(String value) {
		setConstString(offset + 21, $itm_ord_sts_typ, value);
	}

	/**
	 * WG ＣＤ. WG cd..<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 22, $wg_cd);
	}

	/**
	 * WG ＣＤ. WG cd..<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 22, $wg_cd, value);
	}

	/**
	 * 出来高計上工程ＦＬＧ. Create inventory flg..<p>
	 *
	 */
	public boolean yield_oper_flg() {
		return getConstBoolean(offset + 23, $yield_oper_flg);
	}

	/**
	 * 出来高計上工程ＦＬＧ. Create inventory flg..<p>
	 *
	 */
	public void yield_oper_flg(boolean value) {
		setConstBoolean(offset + 23, $yield_oper_flg, value);
	}

	public String getString(String name) {
		if ($oper_ord_no.equalsIgnoreCase(name)) {
			return oper_ord_no();
		}
		if ($oper_offst_typ.equalsIgnoreCase(name)) {
			return oper_offst_typ();
		}
		if ($itm_ord_no.equalsIgnoreCase(name)) {
			return itm_ord_no();
		}
		if ($oper_ptn.equalsIgnoreCase(name)) {
			return oper_ptn();
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			return oper_cd();
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			return loc_cd();
		}
		if ($oper_ord_sts_typ.equalsIgnoreCase(name)) {
			return oper_ord_sts_typ();
		}
		if ($itm_ord_sts_typ.equalsIgnoreCase(name)) {
			return itm_ord_sts_typ();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		return super.getString(name);
	}

	public MCNumber getNumber(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($oper_lt.equalsIgnoreCase(name)) {
			return oper_lt();
		}
		if ($act_oper_lt.equalsIgnoreCase(name)) {
			return act_oper_lt();
		}
		if ($oper_offst.equalsIgnoreCase(name)) {
			return oper_offst();
		}
		if ($oper_schd_qty.equalsIgnoreCase(name)) {
			return oper_schd_qty();
		}
		if ($not_oper_schd_qty.equalsIgnoreCase(name)) {
			return not_oper_schd_qty();
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			return disp_seq();
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			return oper_seq();
		}
		return super.getNumber(name);
	}

	public MCDate getDate(String name) {
		if ($st_schd_tm.equalsIgnoreCase(name)) {
			return st_schd_tm();
		}
		if ($inst_st_schd_tm.equalsIgnoreCase(name)) {
			return inst_st_schd_tm();
		}
		if ($act_st_tm.equalsIgnoreCase(name)) {
			return act_st_tm();
		}
		if ($end_schd_tm.equalsIgnoreCase(name)) {
			return end_schd_tm();
		}
		if ($inst_end_schd_tm.equalsIgnoreCase(name)) {
			return inst_end_schd_tm();
		}
		if ($act_end_tm.equalsIgnoreCase(name)) {
			return act_end_tm();
		}
		return super.getDate(name);
	}

	public boolean getBoolean(String name) {
		if ($yield_oper_flg.equalsIgnoreCase(name)) {
			return yield_oper_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($oper_ord_no.equalsIgnoreCase(name)) {
			return oper_ord_no();
		}
		if ($oper_offst_typ.equalsIgnoreCase(name)) {
			return oper_offst_typ();
		}
		if ($itm_ord_no.equalsIgnoreCase(name)) {
			return itm_ord_no();
		}
		if ($oper_ptn.equalsIgnoreCase(name)) {
			return oper_ptn();
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			return oper_cd();
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			return loc_cd();
		}
		if ($oper_ord_sts_typ.equalsIgnoreCase(name)) {
			return oper_ord_sts_typ();
		}
		if ($itm_ord_sts_typ.equalsIgnoreCase(name)) {
			return itm_ord_sts_typ();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		return super.getStringNE(name);
	}

	public MCNumber getNumberNE(String name) {
		if ($peg_no.equalsIgnoreCase(name)) {
			return peg_no();
		}
		if ($oper_lt.equalsIgnoreCase(name)) {
			return oper_lt();
		}
		if ($act_oper_lt.equalsIgnoreCase(name)) {
			return act_oper_lt();
		}
		if ($oper_offst.equalsIgnoreCase(name)) {
			return oper_offst();
		}
		if ($oper_schd_qty.equalsIgnoreCase(name)) {
			return oper_schd_qty();
		}
		if ($not_oper_schd_qty.equalsIgnoreCase(name)) {
			return not_oper_schd_qty();
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			return disp_seq();
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			return oper_seq();
		}
		return super.getNumberNE(name);
	}

	public MCDate getDateNE(String name) {
		if ($st_schd_tm.equalsIgnoreCase(name)) {
			return st_schd_tm();
		}
		if ($inst_st_schd_tm.equalsIgnoreCase(name)) {
			return inst_st_schd_tm();
		}
		if ($act_st_tm.equalsIgnoreCase(name)) {
			return act_st_tm();
		}
		if ($end_schd_tm.equalsIgnoreCase(name)) {
			return end_schd_tm();
		}
		if ($inst_end_schd_tm.equalsIgnoreCase(name)) {
			return inst_end_schd_tm();
		}
		if ($act_end_tm.equalsIgnoreCase(name)) {
			return act_end_tm();
		}
		return super.getDateNE(name);
	}

	public boolean getBooleanNE(String name) {
		if ($yield_oper_flg.equalsIgnoreCase(name)) {
			return yield_oper_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($oper_ord_no.equalsIgnoreCase(name)) {
			oper_ord_no(value);
			return;
		}
		if ($oper_offst_typ.equalsIgnoreCase(name)) {
			oper_offst_typ(value);
			return;
		}
		if ($itm_ord_no.equalsIgnoreCase(name)) {
			itm_ord_no(value);
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
		if ($loc_cd.equalsIgnoreCase(name)) {
			loc_cd(value);
			return;
		}
		if ($oper_ord_sts_typ.equalsIgnoreCase(name)) {
			oper_ord_sts_typ(value);
			return;
		}
		if ($itm_ord_sts_typ.equalsIgnoreCase(name)) {
			itm_ord_sts_typ(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		super.setString(name, value);
	}

	public void setNumber(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($oper_lt.equalsIgnoreCase(name)) {
			oper_lt(value);
			return;
		}
		if ($act_oper_lt.equalsIgnoreCase(name)) {
			act_oper_lt(value);
			return;
		}
		if ($oper_offst.equalsIgnoreCase(name)) {
			oper_offst(value);
			return;
		}
		if ($oper_schd_qty.equalsIgnoreCase(name)) {
			oper_schd_qty(value);
			return;
		}
		if ($not_oper_schd_qty.equalsIgnoreCase(name)) {
			not_oper_schd_qty(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($oper_lt.equalsIgnoreCase(name)) {
			oper_lt(value);
			return;
		}
		if ($act_oper_lt.equalsIgnoreCase(name)) {
			act_oper_lt(value);
			return;
		}
		if ($oper_offst.equalsIgnoreCase(name)) {
			oper_offst(value);
			return;
		}
		if ($oper_schd_qty.equalsIgnoreCase(name)) {
			oper_schd_qty(value);
			return;
		}
		if ($not_oper_schd_qty.equalsIgnoreCase(name)) {
			not_oper_schd_qty(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($oper_lt.equalsIgnoreCase(name)) {
			oper_lt(value);
			return;
		}
		if ($act_oper_lt.equalsIgnoreCase(name)) {
			act_oper_lt(value);
			return;
		}
		if ($oper_offst.equalsIgnoreCase(name)) {
			oper_offst(value);
			return;
		}
		if ($oper_schd_qty.equalsIgnoreCase(name)) {
			oper_schd_qty(value);
			return;
		}
		if ($not_oper_schd_qty.equalsIgnoreCase(name)) {
			not_oper_schd_qty(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($oper_lt.equalsIgnoreCase(name)) {
			oper_lt(value);
			return;
		}
		if ($act_oper_lt.equalsIgnoreCase(name)) {
			act_oper_lt(value);
			return;
		}
		if ($oper_offst.equalsIgnoreCase(name)) {
			oper_offst(value);
			return;
		}
		if ($oper_schd_qty.equalsIgnoreCase(name)) {
			oper_schd_qty(value);
			return;
		}
		if ($not_oper_schd_qty.equalsIgnoreCase(name)) {
			not_oper_schd_qty(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($oper_lt.equalsIgnoreCase(name)) {
			oper_lt(value);
			return;
		}
		if ($act_oper_lt.equalsIgnoreCase(name)) {
			act_oper_lt(value);
			return;
		}
		if ($oper_offst.equalsIgnoreCase(name)) {
			oper_offst(value);
			return;
		}
		if ($oper_schd_qty.equalsIgnoreCase(name)) {
			oper_schd_qty(value);
			return;
		}
		if ($not_oper_schd_qty.equalsIgnoreCase(name)) {
			not_oper_schd_qty(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setDate(String name, MCDate value) {
		if ($st_schd_tm.equalsIgnoreCase(name)) {
			st_schd_tm(value);
			return;
		}
		if ($inst_st_schd_tm.equalsIgnoreCase(name)) {
			inst_st_schd_tm(value);
			return;
		}
		if ($act_st_tm.equalsIgnoreCase(name)) {
			act_st_tm(value);
			return;
		}
		if ($end_schd_tm.equalsIgnoreCase(name)) {
			end_schd_tm(value);
			return;
		}
		if ($inst_end_schd_tm.equalsIgnoreCase(name)) {
			inst_end_schd_tm(value);
			return;
		}
		if ($act_end_tm.equalsIgnoreCase(name)) {
			act_end_tm(value);
			return;
		}
		super.setDate(name, value);
	}

	public void setBoolean(String name, boolean value) {
		if ($yield_oper_flg.equalsIgnoreCase(name)) {
			yield_oper_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($oper_ord_no.equalsIgnoreCase(name)) {
			oper_ord_no(value);
			return;
		}
		if ($oper_offst_typ.equalsIgnoreCase(name)) {
			oper_offst_typ(value);
			return;
		}
		if ($itm_ord_no.equalsIgnoreCase(name)) {
			itm_ord_no(value);
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
		if ($loc_cd.equalsIgnoreCase(name)) {
			loc_cd(value);
			return;
		}
		if ($oper_ord_sts_typ.equalsIgnoreCase(name)) {
			oper_ord_sts_typ(value);
			return;
		}
		if ($itm_ord_sts_typ.equalsIgnoreCase(name)) {
			itm_ord_sts_typ(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		super.setStringNE(name, value);
	}

	public void setNumberNE(String name, MCNumber value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($oper_lt.equalsIgnoreCase(name)) {
			oper_lt(value);
			return;
		}
		if ($act_oper_lt.equalsIgnoreCase(name)) {
			act_oper_lt(value);
			return;
		}
		if ($oper_offst.equalsIgnoreCase(name)) {
			oper_offst(value);
			return;
		}
		if ($oper_schd_qty.equalsIgnoreCase(name)) {
			oper_schd_qty(value);
			return;
		}
		if ($not_oper_schd_qty.equalsIgnoreCase(name)) {
			not_oper_schd_qty(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, int value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($oper_lt.equalsIgnoreCase(name)) {
			oper_lt(value);
			return;
		}
		if ($act_oper_lt.equalsIgnoreCase(name)) {
			act_oper_lt(value);
			return;
		}
		if ($oper_offst.equalsIgnoreCase(name)) {
			oper_offst(value);
			return;
		}
		if ($oper_schd_qty.equalsIgnoreCase(name)) {
			oper_schd_qty(value);
			return;
		}
		if ($not_oper_schd_qty.equalsIgnoreCase(name)) {
			not_oper_schd_qty(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, long value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($oper_lt.equalsIgnoreCase(name)) {
			oper_lt(value);
			return;
		}
		if ($act_oper_lt.equalsIgnoreCase(name)) {
			act_oper_lt(value);
			return;
		}
		if ($oper_offst.equalsIgnoreCase(name)) {
			oper_offst(value);
			return;
		}
		if ($oper_schd_qty.equalsIgnoreCase(name)) {
			oper_schd_qty(value);
			return;
		}
		if ($not_oper_schd_qty.equalsIgnoreCase(name)) {
			not_oper_schd_qty(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, float value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($oper_lt.equalsIgnoreCase(name)) {
			oper_lt(value);
			return;
		}
		if ($act_oper_lt.equalsIgnoreCase(name)) {
			act_oper_lt(value);
			return;
		}
		if ($oper_offst.equalsIgnoreCase(name)) {
			oper_offst(value);
			return;
		}
		if ($oper_schd_qty.equalsIgnoreCase(name)) {
			oper_schd_qty(value);
			return;
		}
		if ($not_oper_schd_qty.equalsIgnoreCase(name)) {
			not_oper_schd_qty(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, double value) {
		if ($peg_no.equalsIgnoreCase(name)) {
			peg_no(value);
			return;
		}
		if ($oper_lt.equalsIgnoreCase(name)) {
			oper_lt(value);
			return;
		}
		if ($act_oper_lt.equalsIgnoreCase(name)) {
			act_oper_lt(value);
			return;
		}
		if ($oper_offst.equalsIgnoreCase(name)) {
			oper_offst(value);
			return;
		}
		if ($oper_schd_qty.equalsIgnoreCase(name)) {
			oper_schd_qty(value);
			return;
		}
		if ($not_oper_schd_qty.equalsIgnoreCase(name)) {
			not_oper_schd_qty(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setDateNE(String name, MCDate value) {
		if ($st_schd_tm.equalsIgnoreCase(name)) {
			st_schd_tm(value);
			return;
		}
		if ($inst_st_schd_tm.equalsIgnoreCase(name)) {
			inst_st_schd_tm(value);
			return;
		}
		if ($act_st_tm.equalsIgnoreCase(name)) {
			act_st_tm(value);
			return;
		}
		if ($end_schd_tm.equalsIgnoreCase(name)) {
			end_schd_tm(value);
			return;
		}
		if ($inst_end_schd_tm.equalsIgnoreCase(name)) {
			inst_end_schd_tm(value);
			return;
		}
		if ($act_end_tm.equalsIgnoreCase(name)) {
			act_end_tm(value);
			return;
		}
		super.setDateNE(name, value);
	}

	public void setBooleanNE(String name, boolean value) {
		if ($yield_oper_flg.equalsIgnoreCase(name)) {
			yield_oper_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

}
