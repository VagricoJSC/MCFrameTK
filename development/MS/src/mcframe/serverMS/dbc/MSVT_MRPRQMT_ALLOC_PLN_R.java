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
 * "ＭＲＰ所要と引当予定を結合したビュー // A view combining MRP requirements and allocation schedules"DBコンテナRowクラスです。<p>
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
 *  	<td>rqmt_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>所要ＮＯ</td>
 *  	<td>Requirements No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>mrp_rqmt_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>ＭＲＰ所要区分</td>
 *  	<td>MRP required type</td>
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
 *  	<td>io_schd_typ</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>受払予定区分</td>
 *  	<td>GR/GI schedule type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>io_schd_sts_typ</td>
 *  	<td>C</td>
 *  	<td>2</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>受払予定状況区分</td>
 *  	<td>GR/GI schedule status type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>io_schd_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>受払予定ＮＯ</td>
 *  	<td>GR/GI schedule No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>itm_cd</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>品目ＣＤ</td>
 *  	<td>Item cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>itm_sub1</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>枝番１</td>
 *  	<td>Branch No. 1</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>itm_sub2</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>枝番２</td>
 *  	<td>Branch No. 2</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>itm_sub3</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>枝番３</td>
 *  	<td>Branch No. 3</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ver_no</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>版ＮＯ</td>
 *  	<td>Version No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>loc_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>場所ＣＤ</td>
 *  	<td>Location cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>due_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>納期</td>
 *  	<td>Due date</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>net_rqmt_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>正味所要数量</td>
 *  	<td>Net requirements qty.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>alt_grp_cd</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>代替グループＣＤ</td>
 *  	<td>Alternative group cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>alt_grp_seq</td>
 *  	<td>N</td>
 *  	<td>9,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>代替グループ連番</td>
 *  	<td>Alternative group sequence number</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>alt_itm_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>代替品目選択区分</td>
 *  	<td>Alternative item selection type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>alt_itm_ratio</td>
 *  	<td>N</td>
 *  	<td>9,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>代替品目比率</td>
 *  	<td>Alternative item ratio</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>oper_ptn</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>工程パタン</td>
 *  	<td>Operation pattern</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>oper_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>工程ＣＤ</td>
 *  	<td>Operation cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>oper_seq</td>
 *  	<td>N</td>
 *  	<td>9,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>工程連番</td>
 *  	<td>Operation sequence number</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>chd_itm_cd</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>子品目ＣＤ</td>
 *  	<td>Child item cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>chd_itm_sub1</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>子枝番１</td>
 *  	<td>Child branch No. 1</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>chd_itm_sub2</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>子枝番２</td>
 *  	<td>Child branch No. 2</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>chd_itm_sub3</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>子枝番３</td>
 *  	<td>Child branch No. 3</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>chd_ver_no</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>子版ＮＯ</td>
 *  	<td>Child version No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>chd_lot_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>子ロットＮＯ</td>
 *  	<td>Child lot No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>chd_sublot_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>子サブロットＮＯ</td>
 *  	<td>Child sublot No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>chd_loc_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>子場所ＣＤ</td>
 *  	<td>Child location cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>chd_io_schd_pr_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>子受払進捗管理ＮＯ</td>
 *  	<td>Child GR/GI progress management No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>chd_schd_alloc_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>子引当予定数量</td>
 *  	<td>Allocation scheduled qty. of child</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>chd_gi_schd_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>子出庫予定日</td>
 *  	<td>Scheduled GI date of child</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>chd_sno1</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>子手配ＮＯ１</td>
 *  	<td>Child SEIBAN No. 1</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>chd_sno2</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>子手配ＮＯ２</td>
 *  	<td>Child SEIBAN No. 2</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>chd_sno3</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>子手配ＮＯ３</td>
 *  	<td>Child SEIBAN No. 3</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>chd_sno4</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>子手配ＮＯ４</td>
 *  	<td>Child SEIBAN No. 4</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>chd_alloc_avl_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>子引当可能日</td>
 *  	<td>Allocable date of child</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>chd_avl_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>子使用可能数量</td>
 *  	<td>Available qty. of child</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>chd_lmt_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>子期限切れ日</td>
 *  	<td>Expired date of child</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
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
public class MSVT_MRPRQMT_ALLOC_PLN_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.VIEW;

	public static final String TABLE_NAME = "MSVT_MRPRQMT_ALLOC_PLN";

	public static final boolean EX_CTRL = false;
	
	public static final boolean LCL_TABLE = false;
	
	/**
	 * 所要ＮＯ. Requirements No..<p>
	 *
	 */
	public static final String $rqmt_no = "rqmt_no";
	private static final MCPermColumnInfo _rqmt_no = createColumnInfo("rqmt_no");
	public final MCStringPermColumn rqmt_no = createStringColumn(_rqmt_no);
	
	/**
	 * ＭＲＰ所要区分. MRP required type.<p>
	 *
	 */
	public static final String $mrp_rqmt_typ = "mrp_rqmt_typ";
	private static final MCPermColumnInfo _mrp_rqmt_typ = createColumnInfo("mrp_rqmt_typ");
	public final MCStringPermColumn mrp_rqmt_typ = createStringColumn(_mrp_rqmt_typ);
	
	/**
	 * 品目オーダＮＯ. Item order No..<p>
	 *
	 */
	public static final String $itm_ord_no = "itm_ord_no";
	private static final MCPermColumnInfo _itm_ord_no = createColumnInfo("itm_ord_no");
	public final MCStringPermColumn itm_ord_no = createStringColumn(_itm_ord_no);
	
	/**
	 * 工程オーダＮＯ. Operation order No..<p>
	 *
	 */
	public static final String $oper_ord_no = "oper_ord_no";
	private static final MCPermColumnInfo _oper_ord_no = createColumnInfo("oper_ord_no");
	public final MCStringPermColumn oper_ord_no = createStringColumn(_oper_ord_no);
	
	/**
	 * 受払予定区分. GR/GI schedule type.<p>
	 *
	 */
	public static final String $io_schd_typ = "io_schd_typ";
	private static final MCPermColumnInfo _io_schd_typ = createColumnInfo("io_schd_typ");
	public final MCStringPermColumn io_schd_typ = createStringColumn(_io_schd_typ);
	
	/**
	 * 受払予定状況区分. GR/GI schedule status type.<p>
	 *
	 */
	public static final String $io_schd_sts_typ = "io_schd_sts_typ";
	private static final MCPermColumnInfo _io_schd_sts_typ = createColumnInfo("io_schd_sts_typ");
	public final MCStringPermColumn io_schd_sts_typ = createStringColumn(_io_schd_sts_typ);
	
	/**
	 * 受払予定ＮＯ. GR/GI schedule No..<p>
	 *
	 */
	public static final String $io_schd_no = "io_schd_no";
	private static final MCPermColumnInfo _io_schd_no = createColumnInfo("io_schd_no");
	public final MCStringPermColumn io_schd_no = createStringColumn(_io_schd_no);
	
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
	 * 版ＮＯ. Version No..<p>
	 *
	 */
	public static final String $ver_no = "ver_no";
	private static final MCPermColumnInfo _ver_no = createColumnInfo("ver_no");
	public final MCStringPermColumn ver_no = createStringColumn(_ver_no);
	
	/**
	 * 場所ＣＤ. Location cd..<p>
	 *
	 */
	public static final String $loc_cd = "loc_cd";
	private static final MCPermColumnInfo _loc_cd = createColumnInfo("loc_cd");
	public final MCStringPermColumn loc_cd = createStringColumn(_loc_cd);
	
	/**
	 * 納期. Due date.<p>
	 *
	 */
	public static final String $due_dt = "due_dt";
	private static final MCPermColumnInfo _due_dt = createColumnInfo("due_dt");
	public final MCDatePermColumn due_dt = createDateColumn(_due_dt);
	
	/**
	 * 正味所要数量. Net requirements qty..<p>
	 *
	 */
	public static final String $net_rqmt_qty = "net_rqmt_qty";
	private static final MCPermColumnInfo _net_rqmt_qty = createColumnInfo("net_rqmt_qty");
	public final MCNumberPermColumn net_rqmt_qty = createNumberColumn(_net_rqmt_qty);
	
	/**
	 * 代替グループＣＤ. Alternative group cd..<p>
	 *
	 */
	public static final String $alt_grp_cd = "alt_grp_cd";
	private static final MCPermColumnInfo _alt_grp_cd = createColumnInfo("alt_grp_cd");
	public final MCStringPermColumn alt_grp_cd = createStringColumn(_alt_grp_cd);
	
	/**
	 * 代替グループ連番. Alternative group sequence number.<p>
	 *
	 */
	public static final String $alt_grp_seq = "alt_grp_seq";
	private static final MCPermColumnInfo _alt_grp_seq = createColumnInfo("alt_grp_seq");
	public final MCNumberPermColumn alt_grp_seq = createNumberColumn(_alt_grp_seq);
	
	/**
	 * 代替品目選択区分. Alternative item selection type.<p>
	 *
	 */
	public static final String $alt_itm_typ = "alt_itm_typ";
	private static final MCPermColumnInfo _alt_itm_typ = createColumnInfo("alt_itm_typ");
	public final MCStringPermColumn alt_itm_typ = createStringColumn(_alt_itm_typ);
	
	/**
	 * 代替品目比率. Alternative item ratio.<p>
	 *
	 */
	public static final String $alt_itm_ratio = "alt_itm_ratio";
	private static final MCPermColumnInfo _alt_itm_ratio = createColumnInfo("alt_itm_ratio");
	public final MCNumberPermColumn alt_itm_ratio = createNumberColumn(_alt_itm_ratio);
	
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
	 * 子品目ＣＤ. Child item cd..<p>
	 *
	 */
	public static final String $chd_itm_cd = "chd_itm_cd";
	private static final MCPermColumnInfo _chd_itm_cd = createColumnInfo("chd_itm_cd");
	public final MCStringPermColumn chd_itm_cd = createStringColumn(_chd_itm_cd);
	
	/**
	 * 子枝番１. Child branch No. 1.<p>
	 *
	 */
	public static final String $chd_itm_sub1 = "chd_itm_sub1";
	private static final MCPermColumnInfo _chd_itm_sub1 = createColumnInfo("chd_itm_sub1");
	public final MCStringPermColumn chd_itm_sub1 = createStringColumn(_chd_itm_sub1);
	
	/**
	 * 子枝番２. Child branch No. 2.<p>
	 *
	 */
	public static final String $chd_itm_sub2 = "chd_itm_sub2";
	private static final MCPermColumnInfo _chd_itm_sub2 = createColumnInfo("chd_itm_sub2");
	public final MCStringPermColumn chd_itm_sub2 = createStringColumn(_chd_itm_sub2);
	
	/**
	 * 子枝番３. Child branch No. 3.<p>
	 *
	 */
	public static final String $chd_itm_sub3 = "chd_itm_sub3";
	private static final MCPermColumnInfo _chd_itm_sub3 = createColumnInfo("chd_itm_sub3");
	public final MCStringPermColumn chd_itm_sub3 = createStringColumn(_chd_itm_sub3);
	
	/**
	 * 子版ＮＯ. Child version No..<p>
	 *
	 */
	public static final String $chd_ver_no = "chd_ver_no";
	private static final MCPermColumnInfo _chd_ver_no = createColumnInfo("chd_ver_no");
	public final MCStringPermColumn chd_ver_no = createStringColumn(_chd_ver_no);
	
	/**
	 * 子ロットＮＯ. Child lot No..<p>
	 *
	 */
	public static final String $chd_lot_no = "chd_lot_no";
	private static final MCPermColumnInfo _chd_lot_no = createColumnInfo("chd_lot_no");
	public final MCStringPermColumn chd_lot_no = createStringColumn(_chd_lot_no);
	
	/**
	 * 子サブロットＮＯ. Child sublot No..<p>
	 *
	 */
	public static final String $chd_sublot_no = "chd_sublot_no";
	private static final MCPermColumnInfo _chd_sublot_no = createColumnInfo("chd_sublot_no");
	public final MCStringPermColumn chd_sublot_no = createStringColumn(_chd_sublot_no);
	
	/**
	 * 子場所ＣＤ. Child location cd..<p>
	 *
	 */
	public static final String $chd_loc_cd = "chd_loc_cd";
	private static final MCPermColumnInfo _chd_loc_cd = createColumnInfo("chd_loc_cd");
	public final MCStringPermColumn chd_loc_cd = createStringColumn(_chd_loc_cd);
	
	/**
	 * 子受払進捗管理ＮＯ. Child GR/GI progress management No..<p>
	 *
	 */
	public static final String $chd_io_schd_pr_no = "chd_io_schd_pr_no";
	private static final MCPermColumnInfo _chd_io_schd_pr_no = createColumnInfo("chd_io_schd_pr_no");
	public final MCStringPermColumn chd_io_schd_pr_no = createStringColumn(_chd_io_schd_pr_no);
	
	/**
	 * 子引当予定数量. Allocation scheduled qty. of child.<p>
	 *
	 */
	public static final String $chd_schd_alloc_qty = "chd_schd_alloc_qty";
	private static final MCPermColumnInfo _chd_schd_alloc_qty = createColumnInfo("chd_schd_alloc_qty");
	public final MCNumberPermColumn chd_schd_alloc_qty = createNumberColumn(_chd_schd_alloc_qty);
	
	/**
	 * 子出庫予定日. Scheduled GI date of child.<p>
	 *
	 */
	public static final String $chd_gi_schd_dt = "chd_gi_schd_dt";
	private static final MCPermColumnInfo _chd_gi_schd_dt = createColumnInfo("chd_gi_schd_dt");
	public final MCDatePermColumn chd_gi_schd_dt = createDateColumn(_chd_gi_schd_dt);
	
	/**
	 * 子手配ＮＯ１. Child SEIBAN No. 1.<p>
	 *
	 */
	public static final String $chd_sno1 = "chd_sno1";
	private static final MCPermColumnInfo _chd_sno1 = createColumnInfo("chd_sno1");
	public final MCStringPermColumn chd_sno1 = createStringColumn(_chd_sno1);
	
	/**
	 * 子手配ＮＯ２. Child SEIBAN No. 2.<p>
	 *
	 */
	public static final String $chd_sno2 = "chd_sno2";
	private static final MCPermColumnInfo _chd_sno2 = createColumnInfo("chd_sno2");
	public final MCStringPermColumn chd_sno2 = createStringColumn(_chd_sno2);
	
	/**
	 * 子手配ＮＯ３. Child SEIBAN No. 3.<p>
	 *
	 */
	public static final String $chd_sno3 = "chd_sno3";
	private static final MCPermColumnInfo _chd_sno3 = createColumnInfo("chd_sno3");
	public final MCStringPermColumn chd_sno3 = createStringColumn(_chd_sno3);
	
	/**
	 * 子手配ＮＯ４. Child SEIBAN No. 4.<p>
	 *
	 */
	public static final String $chd_sno4 = "chd_sno4";
	private static final MCPermColumnInfo _chd_sno4 = createColumnInfo("chd_sno4");
	public final MCStringPermColumn chd_sno4 = createStringColumn(_chd_sno4);
	
	/**
	 * 子引当可能日. Allocable date of child.<p>
	 *
	 */
	public static final String $chd_alloc_avl_dt = "chd_alloc_avl_dt";
	private static final MCPermColumnInfo _chd_alloc_avl_dt = createColumnInfo("chd_alloc_avl_dt");
	public final MCDatePermColumn chd_alloc_avl_dt = createDateColumn(_chd_alloc_avl_dt);
	
	/**
	 * 子使用可能数量. Available qty. of child.<p>
	 *
	 */
	public static final String $chd_avl_qty = "chd_avl_qty";
	private static final MCPermColumnInfo _chd_avl_qty = createColumnInfo("chd_avl_qty");
	public final MCNumberPermColumn chd_avl_qty = createNumberColumn(_chd_avl_qty);
	
	/**
	 * 子期限切れ日. Expired date of child.<p>
	 *
	 */
	public static final String $chd_lmt_dt = "chd_lmt_dt";
	private static final MCPermColumnInfo _chd_lmt_dt = createColumnInfo("chd_lmt_dt");
	public final MCDatePermColumn chd_lmt_dt = createDateColumn(_chd_lmt_dt);
	
	/**
	 * ワーキンググループＣＤ. WG cd..<p>
	 *
	 */
	public static final String $wg_cd = "wg_cd";
	private static final MCPermColumnInfo _wg_cd = createColumnInfo("wg_cd");
	public final MCStringPermColumn wg_cd = createStringColumn(_wg_cd);
	
	public static final MCMeta rqmt_no_META = createCommonMeta($rqmt_no, mcframe.commonMA.meta.MA_META.RQMT_NO);
	public static final MCMeta mrp_rqmt_typ_META = createCommonMeta($mrp_rqmt_typ, mcframe.commonMS.meta.MS_META.MRP_RQMT_TYP);
	public static final MCMeta itm_ord_no_META = createCommonMeta($itm_ord_no, mcframe.commonMA.meta.MA_META.ITM_ORD_NO);
	public static final MCMeta oper_ord_no_META = createCommonMeta($oper_ord_no, mcframe.commonMA.meta.MA_META.OPER_ORD_NO);
	public static final MCMeta io_schd_typ_META = createCommonMeta($io_schd_typ, mcframe.commonMS.meta.MS_META.IO_SCHD_TYP);
	public static final MCMeta io_schd_sts_typ_META = createCommonMeta($io_schd_sts_typ, mcframe.commonMS.meta.MS_META.IO_SCHD_STS_TYP);
	public static final MCMeta io_schd_no_META = createCommonMeta($io_schd_no, mcframe.commonMA.meta.MA_META.IO_SCHD_NO);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta ver_no_META = createCommonMeta($ver_no, mcframe.commonMA.meta.MA_META.VER_NO);
	public static final MCMeta loc_cd_META = createCommonMeta($loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta due_dt_META = createCommonMeta($due_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta net_rqmt_qty_META = createCommonMeta($net_rqmt_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta alt_grp_cd_META = createCommonMeta($alt_grp_cd, mcframe.commonMA.meta.MA_META.ALT_GRP_CD);
	public static final MCMeta alt_grp_seq_META = createCommonMeta($alt_grp_seq, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta alt_itm_typ_META = createCommonMeta($alt_itm_typ, mcframe.commonMA.meta.MA_META.ALT_ITM_TYP);
	public static final MCMeta alt_itm_ratio_META = createCommonMeta($alt_itm_ratio, mcframe.commonMA.meta.MA_META.ALT_ITM_RATIO);
	public static final MCMeta oper_ptn_META = createCommonMeta($oper_ptn, mcframe.commonMA.meta.MA_META.OPER_PTN);
	public static final MCMeta oper_cd_META = createCommonMeta($oper_cd, mcframe.commonMA.meta.MA_META.OPER_CD);
	public static final MCMeta oper_seq_META = createCommonMeta($oper_seq, mcframe.commonMA.meta.MA_META.OPER_SEQ);
	public static final MCMeta chd_itm_cd_META = createCommonMeta($chd_itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta chd_itm_sub1_META = createCommonMeta($chd_itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta chd_itm_sub2_META = createCommonMeta($chd_itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta chd_itm_sub3_META = createCommonMeta($chd_itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta chd_ver_no_META = createCommonMeta($chd_ver_no, mcframe.commonMA.meta.MA_META.VER_NO);
	public static final MCMeta chd_lot_no_META = createCommonMeta($chd_lot_no, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta chd_sublot_no_META = createCommonMeta($chd_sublot_no, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta chd_loc_cd_META = createCommonMeta($chd_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta chd_io_schd_pr_no_META = createCommonMeta($chd_io_schd_pr_no, mcframe.commonMA.meta.MA_META.IO_SCHD_PR_NO);
	public static final MCMeta chd_schd_alloc_qty_META = createCommonMeta($chd_schd_alloc_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta chd_gi_schd_dt_META = createCommonMeta($chd_gi_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta chd_sno1_META = createCommonMeta($chd_sno1, mcframe.commonMA.meta.MA_META.SNO1);
	public static final MCMeta chd_sno2_META = createCommonMeta($chd_sno2, mcframe.commonMA.meta.MA_META.SNO2);
	public static final MCMeta chd_sno3_META = createCommonMeta($chd_sno3, mcframe.commonMA.meta.MA_META.SNO3);
	public static final MCMeta chd_sno4_META = createCommonMeta($chd_sno4, mcframe.commonMA.meta.MA_META.SNO4);
	public static final MCMeta chd_alloc_avl_dt_META = createCommonMeta($chd_alloc_avl_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta chd_avl_qty_META = createCommonMeta($chd_avl_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta chd_lmt_dt_META = createCommonMeta($chd_lmt_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);

	protected static final List<MCForeignInfo> FOREIGN_INFO_LIST = new ArrayList<>();
	static {
	}
	
	protected static final ConstMetaList<MSVT_MRPRQMT_ALLOC_PLN_R> constMetas = new ConstMetaList<MSVT_MRPRQMT_ALLOC_PLN_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			rqmt_no_META,
			mrp_rqmt_typ_META,
			itm_ord_no_META,
			oper_ord_no_META,
			io_schd_typ_META,
			io_schd_sts_typ_META,
			io_schd_no_META,
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			ver_no_META,
			loc_cd_META,
			due_dt_META,
			net_rqmt_qty_META,
			alt_grp_cd_META,
			alt_grp_seq_META,
			alt_itm_typ_META,
			alt_itm_ratio_META,
			oper_ptn_META,
			oper_cd_META,
			oper_seq_META,
			chd_itm_cd_META,
			chd_itm_sub1_META,
			chd_itm_sub2_META,
			chd_itm_sub3_META,
			chd_ver_no_META,
			chd_lot_no_META,
			chd_sublot_no_META,
			chd_loc_cd_META,
			chd_io_schd_pr_no_META,
			chd_schd_alloc_qty_META,
			chd_gi_schd_dt_META,
			chd_sno1_META,
			chd_sno2_META,
			chd_sno3_META,
			chd_sno4_META,
			chd_alloc_avl_dt_META,
			chd_avl_qty_META,
			chd_lmt_dt_META,
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
	protected MSVT_MRPRQMT_ALLOC_PLN_R(ConstMetaList<? extends MSVT_MRPRQMT_ALLOC_PLN_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MSVT_MRPRQMT_ALLOC_PLN_R(ConstMetaList<? extends MSVT_MRPRQMT_ALLOC_PLN_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MSVT_MRPRQMT_ALLOC_PLN_R.$rqmt_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_MRPRQMT_ALLOC_PLN_R.$rqmt_no,
				"rqmt_no",
				rqmt_no,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_MRPRQMT_ALLOC_PLN_R.$mrp_rqmt_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_MRPRQMT_ALLOC_PLN_R.$mrp_rqmt_typ,
				"mrp_rqmt_typ",
				mrp_rqmt_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_MRPRQMT_ALLOC_PLN_R.$itm_ord_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_MRPRQMT_ALLOC_PLN_R.$itm_ord_no,
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
			MSVT_MRPRQMT_ALLOC_PLN_R.$oper_ord_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_MRPRQMT_ALLOC_PLN_R.$oper_ord_no,
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
			MSVT_MRPRQMT_ALLOC_PLN_R.$io_schd_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_MRPRQMT_ALLOC_PLN_R.$io_schd_typ,
				"io_schd_typ",
				io_schd_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_MRPRQMT_ALLOC_PLN_R.$io_schd_sts_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_MRPRQMT_ALLOC_PLN_R.$io_schd_sts_typ,
				"io_schd_sts_typ",
				io_schd_sts_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_MRPRQMT_ALLOC_PLN_R.$io_schd_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_MRPRQMT_ALLOC_PLN_R.$io_schd_no,
				"io_schd_no",
				io_schd_no,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_MRPRQMT_ALLOC_PLN_R.$itm_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_MRPRQMT_ALLOC_PLN_R.$itm_cd,
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
			MSVT_MRPRQMT_ALLOC_PLN_R.$itm_sub1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_MRPRQMT_ALLOC_PLN_R.$itm_sub1,
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
			MSVT_MRPRQMT_ALLOC_PLN_R.$itm_sub2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_MRPRQMT_ALLOC_PLN_R.$itm_sub2,
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
			MSVT_MRPRQMT_ALLOC_PLN_R.$itm_sub3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_MRPRQMT_ALLOC_PLN_R.$itm_sub3,
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
			MSVT_MRPRQMT_ALLOC_PLN_R.$ver_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_MRPRQMT_ALLOC_PLN_R.$ver_no,
				"ver_no",
				ver_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_MRPRQMT_ALLOC_PLN_R.$loc_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_MRPRQMT_ALLOC_PLN_R.$loc_cd,
				"loc_cd",
				loc_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_MRPRQMT_ALLOC_PLN_R.$due_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MSVT_MRPRQMT_ALLOC_PLN_R.$due_dt,
				"due_dt",
				due_dt,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_MRPRQMT_ALLOC_PLN_R.$net_rqmt_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MSVT_MRPRQMT_ALLOC_PLN_R.$net_rqmt_qty,
				"net_rqmt_qty",
				net_rqmt_qty,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_MRPRQMT_ALLOC_PLN_R.$alt_grp_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_MRPRQMT_ALLOC_PLN_R.$alt_grp_cd,
				"alt_grp_cd",
				alt_grp_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_MRPRQMT_ALLOC_PLN_R.$alt_grp_seq,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MSVT_MRPRQMT_ALLOC_PLN_R.$alt_grp_seq,
				"alt_grp_seq",
				alt_grp_seq,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_MRPRQMT_ALLOC_PLN_R.$alt_itm_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_MRPRQMT_ALLOC_PLN_R.$alt_itm_typ,
				"alt_itm_typ",
				alt_itm_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_MRPRQMT_ALLOC_PLN_R.$alt_itm_ratio,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MSVT_MRPRQMT_ALLOC_PLN_R.$alt_itm_ratio,
				"alt_itm_ratio",
				alt_itm_ratio,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_MRPRQMT_ALLOC_PLN_R.$oper_ptn,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_MRPRQMT_ALLOC_PLN_R.$oper_ptn,
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
			MSVT_MRPRQMT_ALLOC_PLN_R.$oper_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_MRPRQMT_ALLOC_PLN_R.$oper_cd,
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
			MSVT_MRPRQMT_ALLOC_PLN_R.$oper_seq,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MSVT_MRPRQMT_ALLOC_PLN_R.$oper_seq,
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
			MSVT_MRPRQMT_ALLOC_PLN_R.$chd_itm_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_MRPRQMT_ALLOC_PLN_R.$chd_itm_cd,
				"chd_itm_cd",
				chd_itm_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_MRPRQMT_ALLOC_PLN_R.$chd_itm_sub1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_MRPRQMT_ALLOC_PLN_R.$chd_itm_sub1,
				"chd_itm_sub1",
				chd_itm_sub1,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_MRPRQMT_ALLOC_PLN_R.$chd_itm_sub2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_MRPRQMT_ALLOC_PLN_R.$chd_itm_sub2,
				"chd_itm_sub2",
				chd_itm_sub2,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_MRPRQMT_ALLOC_PLN_R.$chd_itm_sub3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_MRPRQMT_ALLOC_PLN_R.$chd_itm_sub3,
				"chd_itm_sub3",
				chd_itm_sub3,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_MRPRQMT_ALLOC_PLN_R.$chd_ver_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_MRPRQMT_ALLOC_PLN_R.$chd_ver_no,
				"chd_ver_no",
				chd_ver_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_MRPRQMT_ALLOC_PLN_R.$chd_lot_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_MRPRQMT_ALLOC_PLN_R.$chd_lot_no,
				"chd_lot_no",
				chd_lot_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_MRPRQMT_ALLOC_PLN_R.$chd_sublot_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_MRPRQMT_ALLOC_PLN_R.$chd_sublot_no,
				"chd_sublot_no",
				chd_sublot_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_MRPRQMT_ALLOC_PLN_R.$chd_loc_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_MRPRQMT_ALLOC_PLN_R.$chd_loc_cd,
				"chd_loc_cd",
				chd_loc_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_MRPRQMT_ALLOC_PLN_R.$chd_io_schd_pr_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_MRPRQMT_ALLOC_PLN_R.$chd_io_schd_pr_no,
				"chd_io_schd_pr_no",
				chd_io_schd_pr_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_MRPRQMT_ALLOC_PLN_R.$chd_schd_alloc_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MSVT_MRPRQMT_ALLOC_PLN_R.$chd_schd_alloc_qty,
				"chd_schd_alloc_qty",
				chd_schd_alloc_qty,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_MRPRQMT_ALLOC_PLN_R.$chd_gi_schd_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MSVT_MRPRQMT_ALLOC_PLN_R.$chd_gi_schd_dt,
				"chd_gi_schd_dt",
				chd_gi_schd_dt,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_MRPRQMT_ALLOC_PLN_R.$chd_sno1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_MRPRQMT_ALLOC_PLN_R.$chd_sno1,
				"chd_sno1",
				chd_sno1,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_MRPRQMT_ALLOC_PLN_R.$chd_sno2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_MRPRQMT_ALLOC_PLN_R.$chd_sno2,
				"chd_sno2",
				chd_sno2,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_MRPRQMT_ALLOC_PLN_R.$chd_sno3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_MRPRQMT_ALLOC_PLN_R.$chd_sno3,
				"chd_sno3",
				chd_sno3,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_MRPRQMT_ALLOC_PLN_R.$chd_sno4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_MRPRQMT_ALLOC_PLN_R.$chd_sno4,
				"chd_sno4",
				chd_sno4,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_MRPRQMT_ALLOC_PLN_R.$chd_alloc_avl_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MSVT_MRPRQMT_ALLOC_PLN_R.$chd_alloc_avl_dt,
				"chd_alloc_avl_dt",
				chd_alloc_avl_dt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_MRPRQMT_ALLOC_PLN_R.$chd_avl_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MSVT_MRPRQMT_ALLOC_PLN_R.$chd_avl_qty,
				"chd_avl_qty",
				chd_avl_qty,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_MRPRQMT_ALLOC_PLN_R.$chd_lmt_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MSVT_MRPRQMT_ALLOC_PLN_R.$chd_lmt_dt,
				"chd_lmt_dt",
				chd_lmt_dt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MSVT_MRPRQMT_ALLOC_PLN_R.$wg_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MSVT_MRPRQMT_ALLOC_PLN_R.$wg_cd,
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
	public static MSVT_MRPRQMT_ALLOC_PLN_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MSVT_MRPRQMT_ALLOC_PLN_R create(String alias) {
		MSVT_MRPRQMT_ALLOC_PLN_R row = new MSVT_MRPRQMT_ALLOC_PLN_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MSVT_MRPRQMT_ALLOC_PLN_R createByName(T proto) {
		MSVT_MRPRQMT_ALLOC_PLN_R row = MSVT_MRPRQMT_ALLOC_PLN_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MSVT_MRPRQMT_ALLOC_PLN_R clone() {
		return (MSVT_MRPRQMT_ALLOC_PLN_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MSVT_MRPRQMT_ALLOC_PLN_R createInstance() {
		return (MSVT_MRPRQMT_ALLOC_PLN_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MSVT_MRPRQMT_ALLOC_PLN_R getValues(String... names) {
		return (MSVT_MRPRQMT_ALLOC_PLN_R) super.getValues(names);
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
	 * 所要ＮＯ. Requirements No..<p>
	 *
	 */
	public String rqmt_no() {
		return getConstString(offset + 0, $rqmt_no);
	}

	/**
	 * 所要ＮＯ. Requirements No..<p>
	 *
	 */
	public void rqmt_no(String value) {
		setConstString(offset + 0, $rqmt_no, value);
	}

	/**
	 * ＭＲＰ所要区分. MRP required type.<p>
	 *
	 */
	public String mrp_rqmt_typ() {
		return getConstString(offset + 1, $mrp_rqmt_typ);
	}

	/**
	 * ＭＲＰ所要区分. MRP required type.<p>
	 *
	 */
	public void mrp_rqmt_typ(String value) {
		setConstString(offset + 1, $mrp_rqmt_typ, value);
	}

	/**
	 * 品目オーダＮＯ. Item order No..<p>
	 *
	 */
	public String itm_ord_no() {
		return getConstString(offset + 2, $itm_ord_no);
	}

	/**
	 * 品目オーダＮＯ. Item order No..<p>
	 *
	 */
	public void itm_ord_no(String value) {
		setConstString(offset + 2, $itm_ord_no, value);
	}

	/**
	 * 工程オーダＮＯ. Operation order No..<p>
	 *
	 */
	public String oper_ord_no() {
		return getConstString(offset + 3, $oper_ord_no);
	}

	/**
	 * 工程オーダＮＯ. Operation order No..<p>
	 *
	 */
	public void oper_ord_no(String value) {
		setConstString(offset + 3, $oper_ord_no, value);
	}

	/**
	 * 受払予定区分. GR/GI schedule type.<p>
	 *
	 */
	public String io_schd_typ() {
		return getConstString(offset + 4, $io_schd_typ);
	}

	/**
	 * 受払予定区分. GR/GI schedule type.<p>
	 *
	 */
	public void io_schd_typ(String value) {
		setConstString(offset + 4, $io_schd_typ, value);
	}

	/**
	 * 受払予定状況区分. GR/GI schedule status type.<p>
	 *
	 */
	public String io_schd_sts_typ() {
		return getConstString(offset + 5, $io_schd_sts_typ);
	}

	/**
	 * 受払予定状況区分. GR/GI schedule status type.<p>
	 *
	 */
	public void io_schd_sts_typ(String value) {
		setConstString(offset + 5, $io_schd_sts_typ, value);
	}

	/**
	 * 受払予定ＮＯ. GR/GI schedule No..<p>
	 *
	 */
	public String io_schd_no() {
		return getConstString(offset + 6, $io_schd_no);
	}

	/**
	 * 受払予定ＮＯ. GR/GI schedule No..<p>
	 *
	 */
	public void io_schd_no(String value) {
		setConstString(offset + 6, $io_schd_no, value);
	}

	/**
	 * 品目ＣＤ. Item cd..<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 7, $itm_cd);
	}

	/**
	 * 品目ＣＤ. Item cd..<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 7, $itm_cd, value);
	}

	/**
	 * 枝番１. Branch No. 1.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 8, $itm_sub1);
	}

	/**
	 * 枝番１. Branch No. 1.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 8, $itm_sub1, value);
	}

	/**
	 * 枝番２. Branch No. 2.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 9, $itm_sub2);
	}

	/**
	 * 枝番２. Branch No. 2.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 9, $itm_sub2, value);
	}

	/**
	 * 枝番３. Branch No. 3.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 10, $itm_sub3);
	}

	/**
	 * 枝番３. Branch No. 3.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 10, $itm_sub3, value);
	}

	/**
	 * 版ＮＯ. Version No..<p>
	 *
	 */
	public String ver_no() {
		return getConstString(offset + 11, $ver_no);
	}

	/**
	 * 版ＮＯ. Version No..<p>
	 *
	 */
	public void ver_no(String value) {
		setConstString(offset + 11, $ver_no, value);
	}

	/**
	 * 場所ＣＤ. Location cd..<p>
	 *
	 */
	public String loc_cd() {
		return getConstString(offset + 12, $loc_cd);
	}

	/**
	 * 場所ＣＤ. Location cd..<p>
	 *
	 */
	public void loc_cd(String value) {
		setConstString(offset + 12, $loc_cd, value);
	}

	/**
	 * 納期. Due date.<p>
	 *
	 */
	public MCDate due_dt() {
		return getConstDate(offset + 13, $due_dt);
	}

	/**
	 * 納期. Due date.<p>
	 *
	 */
	public void due_dt(MCDate value) {
		setConstDate(offset + 13, $due_dt, value);
	}

	/**
	 * 正味所要数量. Net requirements qty..<p>
	 *
	 */
	public MCNumber net_rqmt_qty() {
		return getConstNumber(offset + 14, $net_rqmt_qty);
	}

	/**
	 * 正味所要数量. Net requirements qty..<p>
	 *
	 */
	public void net_rqmt_qty(MCNumber value) {
		setConstNumber(offset + 14, $net_rqmt_qty, value);
	}
	
	/**
	 * 正味所要数量. Net requirements qty..<p>
	 *
	 */
	public void net_rqmt_qty(int value) {
		setConstNumber(offset + 14, $net_rqmt_qty, value);
	}
	
	/**
	 * 正味所要数量. Net requirements qty..<p>
	 *
	 */
	public void net_rqmt_qty(long value) {
		setConstNumber(offset + 14, $net_rqmt_qty, value);
	}
	
	/**
	 * 正味所要数量. Net requirements qty..<p>
	 *
	 */
	public void net_rqmt_qty(float value) {
		setConstNumber(offset + 14, $net_rqmt_qty, value);
	}
	
	/**
	 * 正味所要数量. Net requirements qty..<p>
	 *
	 */
	public void net_rqmt_qty(double value) {
		setConstNumber(offset + 14, $net_rqmt_qty, value);
	}
	
	/**
	 * 代替グループＣＤ. Alternative group cd..<p>
	 *
	 */
	public String alt_grp_cd() {
		return getConstString(offset + 15, $alt_grp_cd);
	}

	/**
	 * 代替グループＣＤ. Alternative group cd..<p>
	 *
	 */
	public void alt_grp_cd(String value) {
		setConstString(offset + 15, $alt_grp_cd, value);
	}

	/**
	 * 代替グループ連番. Alternative group sequence number.<p>
	 *
	 */
	public MCNumber alt_grp_seq() {
		return getConstNumber(offset + 16, $alt_grp_seq);
	}

	/**
	 * 代替グループ連番. Alternative group sequence number.<p>
	 *
	 */
	public void alt_grp_seq(MCNumber value) {
		setConstNumber(offset + 16, $alt_grp_seq, value);
	}
	
	/**
	 * 代替グループ連番. Alternative group sequence number.<p>
	 *
	 */
	public void alt_grp_seq(int value) {
		setConstNumber(offset + 16, $alt_grp_seq, value);
	}
	
	/**
	 * 代替グループ連番. Alternative group sequence number.<p>
	 *
	 */
	public void alt_grp_seq(long value) {
		setConstNumber(offset + 16, $alt_grp_seq, value);
	}
	
	/**
	 * 代替グループ連番. Alternative group sequence number.<p>
	 *
	 */
	public void alt_grp_seq(float value) {
		setConstNumber(offset + 16, $alt_grp_seq, value);
	}
	
	/**
	 * 代替グループ連番. Alternative group sequence number.<p>
	 *
	 */
	public void alt_grp_seq(double value) {
		setConstNumber(offset + 16, $alt_grp_seq, value);
	}
	
	/**
	 * 代替品目選択区分. Alternative item selection type.<p>
	 *
	 */
	public String alt_itm_typ() {
		return getConstString(offset + 17, $alt_itm_typ);
	}

	/**
	 * 代替品目選択区分. Alternative item selection type.<p>
	 *
	 */
	public void alt_itm_typ(String value) {
		setConstString(offset + 17, $alt_itm_typ, value);
	}

	/**
	 * 代替品目比率. Alternative item ratio.<p>
	 *
	 */
	public MCNumber alt_itm_ratio() {
		return getConstNumber(offset + 18, $alt_itm_ratio);
	}

	/**
	 * 代替品目比率. Alternative item ratio.<p>
	 *
	 */
	public void alt_itm_ratio(MCNumber value) {
		setConstNumber(offset + 18, $alt_itm_ratio, value);
	}
	
	/**
	 * 代替品目比率. Alternative item ratio.<p>
	 *
	 */
	public void alt_itm_ratio(int value) {
		setConstNumber(offset + 18, $alt_itm_ratio, value);
	}
	
	/**
	 * 代替品目比率. Alternative item ratio.<p>
	 *
	 */
	public void alt_itm_ratio(long value) {
		setConstNumber(offset + 18, $alt_itm_ratio, value);
	}
	
	/**
	 * 代替品目比率. Alternative item ratio.<p>
	 *
	 */
	public void alt_itm_ratio(float value) {
		setConstNumber(offset + 18, $alt_itm_ratio, value);
	}
	
	/**
	 * 代替品目比率. Alternative item ratio.<p>
	 *
	 */
	public void alt_itm_ratio(double value) {
		setConstNumber(offset + 18, $alt_itm_ratio, value);
	}
	
	/**
	 * 工程パタン. Operation pattern.<p>
	 *
	 */
	public String oper_ptn() {
		return getConstString(offset + 19, $oper_ptn);
	}

	/**
	 * 工程パタン. Operation pattern.<p>
	 *
	 */
	public void oper_ptn(String value) {
		setConstString(offset + 19, $oper_ptn, value);
	}

	/**
	 * 工程ＣＤ. Operation cd..<p>
	 *
	 */
	public String oper_cd() {
		return getConstString(offset + 20, $oper_cd);
	}

	/**
	 * 工程ＣＤ. Operation cd..<p>
	 *
	 */
	public void oper_cd(String value) {
		setConstString(offset + 20, $oper_cd, value);
	}

	/**
	 * 工程連番. Operation sequence number.<p>
	 *
	 */
	public MCNumber oper_seq() {
		return getConstNumber(offset + 21, $oper_seq);
	}

	/**
	 * 工程連番. Operation sequence number.<p>
	 *
	 */
	public void oper_seq(MCNumber value) {
		setConstNumber(offset + 21, $oper_seq, value);
	}
	
	/**
	 * 工程連番. Operation sequence number.<p>
	 *
	 */
	public void oper_seq(int value) {
		setConstNumber(offset + 21, $oper_seq, value);
	}
	
	/**
	 * 工程連番. Operation sequence number.<p>
	 *
	 */
	public void oper_seq(long value) {
		setConstNumber(offset + 21, $oper_seq, value);
	}
	
	/**
	 * 工程連番. Operation sequence number.<p>
	 *
	 */
	public void oper_seq(float value) {
		setConstNumber(offset + 21, $oper_seq, value);
	}
	
	/**
	 * 工程連番. Operation sequence number.<p>
	 *
	 */
	public void oper_seq(double value) {
		setConstNumber(offset + 21, $oper_seq, value);
	}
	
	/**
	 * 子品目ＣＤ. Child item cd..<p>
	 *
	 */
	public String chd_itm_cd() {
		return getConstString(offset + 22, $chd_itm_cd);
	}

	/**
	 * 子品目ＣＤ. Child item cd..<p>
	 *
	 */
	public void chd_itm_cd(String value) {
		setConstString(offset + 22, $chd_itm_cd, value);
	}

	/**
	 * 子枝番１. Child branch No. 1.<p>
	 *
	 */
	public String chd_itm_sub1() {
		return getConstString(offset + 23, $chd_itm_sub1);
	}

	/**
	 * 子枝番１. Child branch No. 1.<p>
	 *
	 */
	public void chd_itm_sub1(String value) {
		setConstString(offset + 23, $chd_itm_sub1, value);
	}

	/**
	 * 子枝番２. Child branch No. 2.<p>
	 *
	 */
	public String chd_itm_sub2() {
		return getConstString(offset + 24, $chd_itm_sub2);
	}

	/**
	 * 子枝番２. Child branch No. 2.<p>
	 *
	 */
	public void chd_itm_sub2(String value) {
		setConstString(offset + 24, $chd_itm_sub2, value);
	}

	/**
	 * 子枝番３. Child branch No. 3.<p>
	 *
	 */
	public String chd_itm_sub3() {
		return getConstString(offset + 25, $chd_itm_sub3);
	}

	/**
	 * 子枝番３. Child branch No. 3.<p>
	 *
	 */
	public void chd_itm_sub3(String value) {
		setConstString(offset + 25, $chd_itm_sub3, value);
	}

	/**
	 * 子版ＮＯ. Child version No..<p>
	 *
	 */
	public String chd_ver_no() {
		return getConstString(offset + 26, $chd_ver_no);
	}

	/**
	 * 子版ＮＯ. Child version No..<p>
	 *
	 */
	public void chd_ver_no(String value) {
		setConstString(offset + 26, $chd_ver_no, value);
	}

	/**
	 * 子ロットＮＯ. Child lot No..<p>
	 *
	 */
	public String chd_lot_no() {
		return getConstString(offset + 27, $chd_lot_no);
	}

	/**
	 * 子ロットＮＯ. Child lot No..<p>
	 *
	 */
	public void chd_lot_no(String value) {
		setConstString(offset + 27, $chd_lot_no, value);
	}

	/**
	 * 子サブロットＮＯ. Child sublot No..<p>
	 *
	 */
	public String chd_sublot_no() {
		return getConstString(offset + 28, $chd_sublot_no);
	}

	/**
	 * 子サブロットＮＯ. Child sublot No..<p>
	 *
	 */
	public void chd_sublot_no(String value) {
		setConstString(offset + 28, $chd_sublot_no, value);
	}

	/**
	 * 子場所ＣＤ. Child location cd..<p>
	 *
	 */
	public String chd_loc_cd() {
		return getConstString(offset + 29, $chd_loc_cd);
	}

	/**
	 * 子場所ＣＤ. Child location cd..<p>
	 *
	 */
	public void chd_loc_cd(String value) {
		setConstString(offset + 29, $chd_loc_cd, value);
	}

	/**
	 * 子受払進捗管理ＮＯ. Child GR/GI progress management No..<p>
	 *
	 */
	public String chd_io_schd_pr_no() {
		return getConstString(offset + 30, $chd_io_schd_pr_no);
	}

	/**
	 * 子受払進捗管理ＮＯ. Child GR/GI progress management No..<p>
	 *
	 */
	public void chd_io_schd_pr_no(String value) {
		setConstString(offset + 30, $chd_io_schd_pr_no, value);
	}

	/**
	 * 子引当予定数量. Allocation scheduled qty. of child.<p>
	 *
	 */
	public MCNumber chd_schd_alloc_qty() {
		return getConstNumber(offset + 31, $chd_schd_alloc_qty);
	}

	/**
	 * 子引当予定数量. Allocation scheduled qty. of child.<p>
	 *
	 */
	public void chd_schd_alloc_qty(MCNumber value) {
		setConstNumber(offset + 31, $chd_schd_alloc_qty, value);
	}
	
	/**
	 * 子引当予定数量. Allocation scheduled qty. of child.<p>
	 *
	 */
	public void chd_schd_alloc_qty(int value) {
		setConstNumber(offset + 31, $chd_schd_alloc_qty, value);
	}
	
	/**
	 * 子引当予定数量. Allocation scheduled qty. of child.<p>
	 *
	 */
	public void chd_schd_alloc_qty(long value) {
		setConstNumber(offset + 31, $chd_schd_alloc_qty, value);
	}
	
	/**
	 * 子引当予定数量. Allocation scheduled qty. of child.<p>
	 *
	 */
	public void chd_schd_alloc_qty(float value) {
		setConstNumber(offset + 31, $chd_schd_alloc_qty, value);
	}
	
	/**
	 * 子引当予定数量. Allocation scheduled qty. of child.<p>
	 *
	 */
	public void chd_schd_alloc_qty(double value) {
		setConstNumber(offset + 31, $chd_schd_alloc_qty, value);
	}
	
	/**
	 * 子出庫予定日. Scheduled GI date of child.<p>
	 *
	 */
	public MCDate chd_gi_schd_dt() {
		return getConstDate(offset + 32, $chd_gi_schd_dt);
	}

	/**
	 * 子出庫予定日. Scheduled GI date of child.<p>
	 *
	 */
	public void chd_gi_schd_dt(MCDate value) {
		setConstDate(offset + 32, $chd_gi_schd_dt, value);
	}

	/**
	 * 子手配ＮＯ１. Child SEIBAN No. 1.<p>
	 *
	 */
	public String chd_sno1() {
		return getConstString(offset + 33, $chd_sno1);
	}

	/**
	 * 子手配ＮＯ１. Child SEIBAN No. 1.<p>
	 *
	 */
	public void chd_sno1(String value) {
		setConstString(offset + 33, $chd_sno1, value);
	}

	/**
	 * 子手配ＮＯ２. Child SEIBAN No. 2.<p>
	 *
	 */
	public String chd_sno2() {
		return getConstString(offset + 34, $chd_sno2);
	}

	/**
	 * 子手配ＮＯ２. Child SEIBAN No. 2.<p>
	 *
	 */
	public void chd_sno2(String value) {
		setConstString(offset + 34, $chd_sno2, value);
	}

	/**
	 * 子手配ＮＯ３. Child SEIBAN No. 3.<p>
	 *
	 */
	public String chd_sno3() {
		return getConstString(offset + 35, $chd_sno3);
	}

	/**
	 * 子手配ＮＯ３. Child SEIBAN No. 3.<p>
	 *
	 */
	public void chd_sno3(String value) {
		setConstString(offset + 35, $chd_sno3, value);
	}

	/**
	 * 子手配ＮＯ４. Child SEIBAN No. 4.<p>
	 *
	 */
	public String chd_sno4() {
		return getConstString(offset + 36, $chd_sno4);
	}

	/**
	 * 子手配ＮＯ４. Child SEIBAN No. 4.<p>
	 *
	 */
	public void chd_sno4(String value) {
		setConstString(offset + 36, $chd_sno4, value);
	}

	/**
	 * 子引当可能日. Allocable date of child.<p>
	 *
	 */
	public MCDate chd_alloc_avl_dt() {
		return getConstDate(offset + 37, $chd_alloc_avl_dt);
	}

	/**
	 * 子引当可能日. Allocable date of child.<p>
	 *
	 */
	public void chd_alloc_avl_dt(MCDate value) {
		setConstDate(offset + 37, $chd_alloc_avl_dt, value);
	}

	/**
	 * 子使用可能数量. Available qty. of child.<p>
	 *
	 */
	public MCNumber chd_avl_qty() {
		return getConstNumber(offset + 38, $chd_avl_qty);
	}

	/**
	 * 子使用可能数量. Available qty. of child.<p>
	 *
	 */
	public void chd_avl_qty(MCNumber value) {
		setConstNumber(offset + 38, $chd_avl_qty, value);
	}
	
	/**
	 * 子使用可能数量. Available qty. of child.<p>
	 *
	 */
	public void chd_avl_qty(int value) {
		setConstNumber(offset + 38, $chd_avl_qty, value);
	}
	
	/**
	 * 子使用可能数量. Available qty. of child.<p>
	 *
	 */
	public void chd_avl_qty(long value) {
		setConstNumber(offset + 38, $chd_avl_qty, value);
	}
	
	/**
	 * 子使用可能数量. Available qty. of child.<p>
	 *
	 */
	public void chd_avl_qty(float value) {
		setConstNumber(offset + 38, $chd_avl_qty, value);
	}
	
	/**
	 * 子使用可能数量. Available qty. of child.<p>
	 *
	 */
	public void chd_avl_qty(double value) {
		setConstNumber(offset + 38, $chd_avl_qty, value);
	}
	
	/**
	 * 子期限切れ日. Expired date of child.<p>
	 *
	 */
	public MCDate chd_lmt_dt() {
		return getConstDate(offset + 39, $chd_lmt_dt);
	}

	/**
	 * 子期限切れ日. Expired date of child.<p>
	 *
	 */
	public void chd_lmt_dt(MCDate value) {
		setConstDate(offset + 39, $chd_lmt_dt, value);
	}

	/**
	 * ワーキンググループＣＤ. WG cd..<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 40, $wg_cd);
	}

	/**
	 * ワーキンググループＣＤ. WG cd..<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 40, $wg_cd, value);
	}

	public String getString(String name) {
		if ($rqmt_no.equalsIgnoreCase(name)) {
			return rqmt_no();
		}
		if ($mrp_rqmt_typ.equalsIgnoreCase(name)) {
			return mrp_rqmt_typ();
		}
		if ($itm_ord_no.equalsIgnoreCase(name)) {
			return itm_ord_no();
		}
		if ($oper_ord_no.equalsIgnoreCase(name)) {
			return oper_ord_no();
		}
		if ($io_schd_typ.equalsIgnoreCase(name)) {
			return io_schd_typ();
		}
		if ($io_schd_sts_typ.equalsIgnoreCase(name)) {
			return io_schd_sts_typ();
		}
		if ($io_schd_no.equalsIgnoreCase(name)) {
			return io_schd_no();
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
		if ($ver_no.equalsIgnoreCase(name)) {
			return ver_no();
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			return loc_cd();
		}
		if ($alt_grp_cd.equalsIgnoreCase(name)) {
			return alt_grp_cd();
		}
		if ($alt_itm_typ.equalsIgnoreCase(name)) {
			return alt_itm_typ();
		}
		if ($oper_ptn.equalsIgnoreCase(name)) {
			return oper_ptn();
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			return oper_cd();
		}
		if ($chd_itm_cd.equalsIgnoreCase(name)) {
			return chd_itm_cd();
		}
		if ($chd_itm_sub1.equalsIgnoreCase(name)) {
			return chd_itm_sub1();
		}
		if ($chd_itm_sub2.equalsIgnoreCase(name)) {
			return chd_itm_sub2();
		}
		if ($chd_itm_sub3.equalsIgnoreCase(name)) {
			return chd_itm_sub3();
		}
		if ($chd_ver_no.equalsIgnoreCase(name)) {
			return chd_ver_no();
		}
		if ($chd_lot_no.equalsIgnoreCase(name)) {
			return chd_lot_no();
		}
		if ($chd_sublot_no.equalsIgnoreCase(name)) {
			return chd_sublot_no();
		}
		if ($chd_loc_cd.equalsIgnoreCase(name)) {
			return chd_loc_cd();
		}
		if ($chd_io_schd_pr_no.equalsIgnoreCase(name)) {
			return chd_io_schd_pr_no();
		}
		if ($chd_sno1.equalsIgnoreCase(name)) {
			return chd_sno1();
		}
		if ($chd_sno2.equalsIgnoreCase(name)) {
			return chd_sno2();
		}
		if ($chd_sno3.equalsIgnoreCase(name)) {
			return chd_sno3();
		}
		if ($chd_sno4.equalsIgnoreCase(name)) {
			return chd_sno4();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		return super.getString(name);
	}

	public MCNumber getNumber(String name) {
		if ($net_rqmt_qty.equalsIgnoreCase(name)) {
			return net_rqmt_qty();
		}
		if ($alt_grp_seq.equalsIgnoreCase(name)) {
			return alt_grp_seq();
		}
		if ($alt_itm_ratio.equalsIgnoreCase(name)) {
			return alt_itm_ratio();
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			return oper_seq();
		}
		if ($chd_schd_alloc_qty.equalsIgnoreCase(name)) {
			return chd_schd_alloc_qty();
		}
		if ($chd_avl_qty.equalsIgnoreCase(name)) {
			return chd_avl_qty();
		}
		return super.getNumber(name);
	}

	public MCDate getDate(String name) {
		if ($due_dt.equalsIgnoreCase(name)) {
			return due_dt();
		}
		if ($chd_gi_schd_dt.equalsIgnoreCase(name)) {
			return chd_gi_schd_dt();
		}
		if ($chd_alloc_avl_dt.equalsIgnoreCase(name)) {
			return chd_alloc_avl_dt();
		}
		if ($chd_lmt_dt.equalsIgnoreCase(name)) {
			return chd_lmt_dt();
		}
		return super.getDate(name);
	}

	public String getStringNE(String name) {
		if ($rqmt_no.equalsIgnoreCase(name)) {
			return rqmt_no();
		}
		if ($mrp_rqmt_typ.equalsIgnoreCase(name)) {
			return mrp_rqmt_typ();
		}
		if ($itm_ord_no.equalsIgnoreCase(name)) {
			return itm_ord_no();
		}
		if ($oper_ord_no.equalsIgnoreCase(name)) {
			return oper_ord_no();
		}
		if ($io_schd_typ.equalsIgnoreCase(name)) {
			return io_schd_typ();
		}
		if ($io_schd_sts_typ.equalsIgnoreCase(name)) {
			return io_schd_sts_typ();
		}
		if ($io_schd_no.equalsIgnoreCase(name)) {
			return io_schd_no();
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
		if ($ver_no.equalsIgnoreCase(name)) {
			return ver_no();
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			return loc_cd();
		}
		if ($alt_grp_cd.equalsIgnoreCase(name)) {
			return alt_grp_cd();
		}
		if ($alt_itm_typ.equalsIgnoreCase(name)) {
			return alt_itm_typ();
		}
		if ($oper_ptn.equalsIgnoreCase(name)) {
			return oper_ptn();
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			return oper_cd();
		}
		if ($chd_itm_cd.equalsIgnoreCase(name)) {
			return chd_itm_cd();
		}
		if ($chd_itm_sub1.equalsIgnoreCase(name)) {
			return chd_itm_sub1();
		}
		if ($chd_itm_sub2.equalsIgnoreCase(name)) {
			return chd_itm_sub2();
		}
		if ($chd_itm_sub3.equalsIgnoreCase(name)) {
			return chd_itm_sub3();
		}
		if ($chd_ver_no.equalsIgnoreCase(name)) {
			return chd_ver_no();
		}
		if ($chd_lot_no.equalsIgnoreCase(name)) {
			return chd_lot_no();
		}
		if ($chd_sublot_no.equalsIgnoreCase(name)) {
			return chd_sublot_no();
		}
		if ($chd_loc_cd.equalsIgnoreCase(name)) {
			return chd_loc_cd();
		}
		if ($chd_io_schd_pr_no.equalsIgnoreCase(name)) {
			return chd_io_schd_pr_no();
		}
		if ($chd_sno1.equalsIgnoreCase(name)) {
			return chd_sno1();
		}
		if ($chd_sno2.equalsIgnoreCase(name)) {
			return chd_sno2();
		}
		if ($chd_sno3.equalsIgnoreCase(name)) {
			return chd_sno3();
		}
		if ($chd_sno4.equalsIgnoreCase(name)) {
			return chd_sno4();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		return super.getStringNE(name);
	}

	public MCNumber getNumberNE(String name) {
		if ($net_rqmt_qty.equalsIgnoreCase(name)) {
			return net_rqmt_qty();
		}
		if ($alt_grp_seq.equalsIgnoreCase(name)) {
			return alt_grp_seq();
		}
		if ($alt_itm_ratio.equalsIgnoreCase(name)) {
			return alt_itm_ratio();
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			return oper_seq();
		}
		if ($chd_schd_alloc_qty.equalsIgnoreCase(name)) {
			return chd_schd_alloc_qty();
		}
		if ($chd_avl_qty.equalsIgnoreCase(name)) {
			return chd_avl_qty();
		}
		return super.getNumberNE(name);
	}

	public MCDate getDateNE(String name) {
		if ($due_dt.equalsIgnoreCase(name)) {
			return due_dt();
		}
		if ($chd_gi_schd_dt.equalsIgnoreCase(name)) {
			return chd_gi_schd_dt();
		}
		if ($chd_alloc_avl_dt.equalsIgnoreCase(name)) {
			return chd_alloc_avl_dt();
		}
		if ($chd_lmt_dt.equalsIgnoreCase(name)) {
			return chd_lmt_dt();
		}
		return super.getDateNE(name);
	}

	public void setString(String name, String value) {
		if ($rqmt_no.equalsIgnoreCase(name)) {
			rqmt_no(value);
			return;
		}
		if ($mrp_rqmt_typ.equalsIgnoreCase(name)) {
			mrp_rqmt_typ(value);
			return;
		}
		if ($itm_ord_no.equalsIgnoreCase(name)) {
			itm_ord_no(value);
			return;
		}
		if ($oper_ord_no.equalsIgnoreCase(name)) {
			oper_ord_no(value);
			return;
		}
		if ($io_schd_typ.equalsIgnoreCase(name)) {
			io_schd_typ(value);
			return;
		}
		if ($io_schd_sts_typ.equalsIgnoreCase(name)) {
			io_schd_sts_typ(value);
			return;
		}
		if ($io_schd_no.equalsIgnoreCase(name)) {
			io_schd_no(value);
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
		if ($ver_no.equalsIgnoreCase(name)) {
			ver_no(value);
			return;
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			loc_cd(value);
			return;
		}
		if ($alt_grp_cd.equalsIgnoreCase(name)) {
			alt_grp_cd(value);
			return;
		}
		if ($alt_itm_typ.equalsIgnoreCase(name)) {
			alt_itm_typ(value);
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
		if ($chd_itm_cd.equalsIgnoreCase(name)) {
			chd_itm_cd(value);
			return;
		}
		if ($chd_itm_sub1.equalsIgnoreCase(name)) {
			chd_itm_sub1(value);
			return;
		}
		if ($chd_itm_sub2.equalsIgnoreCase(name)) {
			chd_itm_sub2(value);
			return;
		}
		if ($chd_itm_sub3.equalsIgnoreCase(name)) {
			chd_itm_sub3(value);
			return;
		}
		if ($chd_ver_no.equalsIgnoreCase(name)) {
			chd_ver_no(value);
			return;
		}
		if ($chd_lot_no.equalsIgnoreCase(name)) {
			chd_lot_no(value);
			return;
		}
		if ($chd_sublot_no.equalsIgnoreCase(name)) {
			chd_sublot_no(value);
			return;
		}
		if ($chd_loc_cd.equalsIgnoreCase(name)) {
			chd_loc_cd(value);
			return;
		}
		if ($chd_io_schd_pr_no.equalsIgnoreCase(name)) {
			chd_io_schd_pr_no(value);
			return;
		}
		if ($chd_sno1.equalsIgnoreCase(name)) {
			chd_sno1(value);
			return;
		}
		if ($chd_sno2.equalsIgnoreCase(name)) {
			chd_sno2(value);
			return;
		}
		if ($chd_sno3.equalsIgnoreCase(name)) {
			chd_sno3(value);
			return;
		}
		if ($chd_sno4.equalsIgnoreCase(name)) {
			chd_sno4(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		super.setString(name, value);
	}

	public void setNumber(String name, MCNumber value) {
		if ($net_rqmt_qty.equalsIgnoreCase(name)) {
			net_rqmt_qty(value);
			return;
		}
		if ($alt_grp_seq.equalsIgnoreCase(name)) {
			alt_grp_seq(value);
			return;
		}
		if ($alt_itm_ratio.equalsIgnoreCase(name)) {
			alt_itm_ratio(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($chd_schd_alloc_qty.equalsIgnoreCase(name)) {
			chd_schd_alloc_qty(value);
			return;
		}
		if ($chd_avl_qty.equalsIgnoreCase(name)) {
			chd_avl_qty(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, int value) {
		if ($net_rqmt_qty.equalsIgnoreCase(name)) {
			net_rqmt_qty(value);
			return;
		}
		if ($alt_grp_seq.equalsIgnoreCase(name)) {
			alt_grp_seq(value);
			return;
		}
		if ($alt_itm_ratio.equalsIgnoreCase(name)) {
			alt_itm_ratio(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($chd_schd_alloc_qty.equalsIgnoreCase(name)) {
			chd_schd_alloc_qty(value);
			return;
		}
		if ($chd_avl_qty.equalsIgnoreCase(name)) {
			chd_avl_qty(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, long value) {
		if ($net_rqmt_qty.equalsIgnoreCase(name)) {
			net_rqmt_qty(value);
			return;
		}
		if ($alt_grp_seq.equalsIgnoreCase(name)) {
			alt_grp_seq(value);
			return;
		}
		if ($alt_itm_ratio.equalsIgnoreCase(name)) {
			alt_itm_ratio(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($chd_schd_alloc_qty.equalsIgnoreCase(name)) {
			chd_schd_alloc_qty(value);
			return;
		}
		if ($chd_avl_qty.equalsIgnoreCase(name)) {
			chd_avl_qty(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, float value) {
		if ($net_rqmt_qty.equalsIgnoreCase(name)) {
			net_rqmt_qty(value);
			return;
		}
		if ($alt_grp_seq.equalsIgnoreCase(name)) {
			alt_grp_seq(value);
			return;
		}
		if ($alt_itm_ratio.equalsIgnoreCase(name)) {
			alt_itm_ratio(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($chd_schd_alloc_qty.equalsIgnoreCase(name)) {
			chd_schd_alloc_qty(value);
			return;
		}
		if ($chd_avl_qty.equalsIgnoreCase(name)) {
			chd_avl_qty(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, double value) {
		if ($net_rqmt_qty.equalsIgnoreCase(name)) {
			net_rqmt_qty(value);
			return;
		}
		if ($alt_grp_seq.equalsIgnoreCase(name)) {
			alt_grp_seq(value);
			return;
		}
		if ($alt_itm_ratio.equalsIgnoreCase(name)) {
			alt_itm_ratio(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($chd_schd_alloc_qty.equalsIgnoreCase(name)) {
			chd_schd_alloc_qty(value);
			return;
		}
		if ($chd_avl_qty.equalsIgnoreCase(name)) {
			chd_avl_qty(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setDate(String name, MCDate value) {
		if ($due_dt.equalsIgnoreCase(name)) {
			due_dt(value);
			return;
		}
		if ($chd_gi_schd_dt.equalsIgnoreCase(name)) {
			chd_gi_schd_dt(value);
			return;
		}
		if ($chd_alloc_avl_dt.equalsIgnoreCase(name)) {
			chd_alloc_avl_dt(value);
			return;
		}
		if ($chd_lmt_dt.equalsIgnoreCase(name)) {
			chd_lmt_dt(value);
			return;
		}
		super.setDate(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($rqmt_no.equalsIgnoreCase(name)) {
			rqmt_no(value);
			return;
		}
		if ($mrp_rqmt_typ.equalsIgnoreCase(name)) {
			mrp_rqmt_typ(value);
			return;
		}
		if ($itm_ord_no.equalsIgnoreCase(name)) {
			itm_ord_no(value);
			return;
		}
		if ($oper_ord_no.equalsIgnoreCase(name)) {
			oper_ord_no(value);
			return;
		}
		if ($io_schd_typ.equalsIgnoreCase(name)) {
			io_schd_typ(value);
			return;
		}
		if ($io_schd_sts_typ.equalsIgnoreCase(name)) {
			io_schd_sts_typ(value);
			return;
		}
		if ($io_schd_no.equalsIgnoreCase(name)) {
			io_schd_no(value);
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
		if ($ver_no.equalsIgnoreCase(name)) {
			ver_no(value);
			return;
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			loc_cd(value);
			return;
		}
		if ($alt_grp_cd.equalsIgnoreCase(name)) {
			alt_grp_cd(value);
			return;
		}
		if ($alt_itm_typ.equalsIgnoreCase(name)) {
			alt_itm_typ(value);
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
		if ($chd_itm_cd.equalsIgnoreCase(name)) {
			chd_itm_cd(value);
			return;
		}
		if ($chd_itm_sub1.equalsIgnoreCase(name)) {
			chd_itm_sub1(value);
			return;
		}
		if ($chd_itm_sub2.equalsIgnoreCase(name)) {
			chd_itm_sub2(value);
			return;
		}
		if ($chd_itm_sub3.equalsIgnoreCase(name)) {
			chd_itm_sub3(value);
			return;
		}
		if ($chd_ver_no.equalsIgnoreCase(name)) {
			chd_ver_no(value);
			return;
		}
		if ($chd_lot_no.equalsIgnoreCase(name)) {
			chd_lot_no(value);
			return;
		}
		if ($chd_sublot_no.equalsIgnoreCase(name)) {
			chd_sublot_no(value);
			return;
		}
		if ($chd_loc_cd.equalsIgnoreCase(name)) {
			chd_loc_cd(value);
			return;
		}
		if ($chd_io_schd_pr_no.equalsIgnoreCase(name)) {
			chd_io_schd_pr_no(value);
			return;
		}
		if ($chd_sno1.equalsIgnoreCase(name)) {
			chd_sno1(value);
			return;
		}
		if ($chd_sno2.equalsIgnoreCase(name)) {
			chd_sno2(value);
			return;
		}
		if ($chd_sno3.equalsIgnoreCase(name)) {
			chd_sno3(value);
			return;
		}
		if ($chd_sno4.equalsIgnoreCase(name)) {
			chd_sno4(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		super.setStringNE(name, value);
	}

	public void setNumberNE(String name, MCNumber value) {
		if ($net_rqmt_qty.equalsIgnoreCase(name)) {
			net_rqmt_qty(value);
			return;
		}
		if ($alt_grp_seq.equalsIgnoreCase(name)) {
			alt_grp_seq(value);
			return;
		}
		if ($alt_itm_ratio.equalsIgnoreCase(name)) {
			alt_itm_ratio(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($chd_schd_alloc_qty.equalsIgnoreCase(name)) {
			chd_schd_alloc_qty(value);
			return;
		}
		if ($chd_avl_qty.equalsIgnoreCase(name)) {
			chd_avl_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, int value) {
		if ($net_rqmt_qty.equalsIgnoreCase(name)) {
			net_rqmt_qty(value);
			return;
		}
		if ($alt_grp_seq.equalsIgnoreCase(name)) {
			alt_grp_seq(value);
			return;
		}
		if ($alt_itm_ratio.equalsIgnoreCase(name)) {
			alt_itm_ratio(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($chd_schd_alloc_qty.equalsIgnoreCase(name)) {
			chd_schd_alloc_qty(value);
			return;
		}
		if ($chd_avl_qty.equalsIgnoreCase(name)) {
			chd_avl_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, long value) {
		if ($net_rqmt_qty.equalsIgnoreCase(name)) {
			net_rqmt_qty(value);
			return;
		}
		if ($alt_grp_seq.equalsIgnoreCase(name)) {
			alt_grp_seq(value);
			return;
		}
		if ($alt_itm_ratio.equalsIgnoreCase(name)) {
			alt_itm_ratio(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($chd_schd_alloc_qty.equalsIgnoreCase(name)) {
			chd_schd_alloc_qty(value);
			return;
		}
		if ($chd_avl_qty.equalsIgnoreCase(name)) {
			chd_avl_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, float value) {
		if ($net_rqmt_qty.equalsIgnoreCase(name)) {
			net_rqmt_qty(value);
			return;
		}
		if ($alt_grp_seq.equalsIgnoreCase(name)) {
			alt_grp_seq(value);
			return;
		}
		if ($alt_itm_ratio.equalsIgnoreCase(name)) {
			alt_itm_ratio(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($chd_schd_alloc_qty.equalsIgnoreCase(name)) {
			chd_schd_alloc_qty(value);
			return;
		}
		if ($chd_avl_qty.equalsIgnoreCase(name)) {
			chd_avl_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, double value) {
		if ($net_rqmt_qty.equalsIgnoreCase(name)) {
			net_rqmt_qty(value);
			return;
		}
		if ($alt_grp_seq.equalsIgnoreCase(name)) {
			alt_grp_seq(value);
			return;
		}
		if ($alt_itm_ratio.equalsIgnoreCase(name)) {
			alt_itm_ratio(value);
			return;
		}
		if ($oper_seq.equalsIgnoreCase(name)) {
			oper_seq(value);
			return;
		}
		if ($chd_schd_alloc_qty.equalsIgnoreCase(name)) {
			chd_schd_alloc_qty(value);
			return;
		}
		if ($chd_avl_qty.equalsIgnoreCase(name)) {
			chd_avl_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setDateNE(String name, MCDate value) {
		if ($due_dt.equalsIgnoreCase(name)) {
			due_dt(value);
			return;
		}
		if ($chd_gi_schd_dt.equalsIgnoreCase(name)) {
			chd_gi_schd_dt(value);
			return;
		}
		if ($chd_alloc_avl_dt.equalsIgnoreCase(name)) {
			chd_alloc_avl_dt(value);
			return;
		}
		if ($chd_lmt_dt.equalsIgnoreCase(name)) {
			chd_lmt_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}

}
