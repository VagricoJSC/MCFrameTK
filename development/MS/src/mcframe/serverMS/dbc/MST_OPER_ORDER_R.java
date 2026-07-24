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
import mcframe.serverCore.queryapi.IFMCSQL.MCTimestampPermColumn;
import mcframe.serverCore.queryapi.IFMCSQL.MCBooleanPermColumn;
import mcframe.commonCore.meta.MCMeta;
import mcframe.commonCore.lang.MCDataType;
import mcframe.commonCore.lang.MCTimestamp;
import mcframe.serverCore.queryapi.MCDBContainer;
import mcframe.serverCore.queryapi.MCDBContainer.MCTableType;
import mcframe.serverCore.queryapi.IFMCSQL.MCPermColumn;
import mcframe.serverCore.queryapi.IFMCSQL.MCPermColumnInfo;
import mcframe.serverCore.queryapi.MCForeignInfo;

/**
 * "工程オーダ情報 // Operation order info."DBコンテナRowクラスです。<p>
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
 *  	<td>oper_ord_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>工程オーダＮＯ</td>
 *  	<td>Operation order No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>st_schd_tm</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>工程着手予定日時</td>
 *  	<td>Scheduled operation start date and time</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>inst_st_schd_tm</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>工程着手予定日時（指図）</td>
 *  	<td>Scheduled operation start date and time (Order)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>act_st_tm</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>工程着手実績日時</td>
 *  	<td>Actual operation start date and time</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>end_schd_tm</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>工程終了予定日時</td>
 *  	<td>Scheduled operation end date and time</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>inst_end_schd_tm</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>工程終了予定日時（指図）</td>
 *  	<td>Scheduled operation end date and time (Order)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>act_end_tm</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>工程終了実績日時</td>
 *  	<td>Actual operation end date and time</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>oper_lt</td>
 *  	<td>N</td>
 *  	<td>9,0</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>工程ＬＴ</td>
 *  	<td>Operation LT</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>act_oper_lt</td>
 *  	<td>N</td>
 *  	<td>9,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>工程ＬＴ（実績）</td>
 *  	<td>Operation LT (Result)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>oper_offst_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>工程オフセット区分</td>
 *  	<td>Operation offset type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>oper_offst</td>
 *  	<td>N</td>
 *  	<td>9,0</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>工程オフセット</td>
 *  	<td>Operation offset</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>oper_schd_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>工程指図予定数量</td>
 *  	<td>Operation order scheduled qty.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>not_oper_schd_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>工程未指図数量</td>
 *  	<td>Operation unordered qty.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>itm_ord_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>品目オーダＮＯ</td>
 *  	<td>Item order No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>disp_seq</td>
 *  	<td>N</td>
 *  	<td>9,0</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>工順</td>
 *  	<td>Routing</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>oper_ptn</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>工程パタン</td>
 *  	<td>Operation pattern</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>oper_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>工程ＣＤ</td>
 *  	<td>Operation cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>oper_seq</td>
 *  	<td>N</td>
 *  	<td>9,0</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>工程連番</td>
 *  	<td>Operation sequence number</td>
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
 *  	<td>oper_ord_sts_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>工程オーダ状況区分</td>
 *  	<td>Operation order status type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>itm_ord_sts_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>品目オーダ状況区分</td>
 *  	<td>Item order status type</td>
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
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>yield_oper_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>出来高計上工程ＦＬＧ</td>
 *  	<td>Create inventory flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sim_mrp_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>シミュレーションＮＯ</td>
 *  	<td>Simulation No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>oper_rsrc</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>工程資源</td>
 *  	<td>Operation resources</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>intr_rmrks</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>内部備考</td>
 *  	<td>Internal remarks</td>
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
 *  <tr >
 *  	<td>C</td>
 *  	<td>ext_oper_ord_no</td>
 *  	<td>C</td>
 *  	<td>300</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>外部工程オーダＮＯ</td>
 *  	<td>External operation order No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ins_usr_id</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>登録ユーザＩＤ</td>
 *  	<td>Entry user ID</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ins_usr_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>登録ユーザ名</td>
 *  	<td>Entry user name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ins_ts</td>
 *  	<td>TS</td>
 *  	<td>0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>登録日時</td>
 *  	<td>Entry date and time</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ins_func_id</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>登録機能ＩＤ</td>
 *  	<td>Entry function ID</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>upd_cntr</td>
 *  	<td>N</td>
 *  	<td>9,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>更新カウンタ</td>
 *  	<td>Update counter</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>upd_usr_id</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>更新ユーザＩＤ</td>
 *  	<td>Update user ID</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>upd_usr_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>更新ユーザ名</td>
 *  	<td>Update user name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>upd_ts</td>
 *  	<td>TS</td>
 *  	<td>0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>更新日時</td>
 *  	<td>Update date and time</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>upd_func_id</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>更新機能ＩＤ</td>
 *  	<td>Update function ID</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>upd_srv_req_no</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>更新リクエストＮＯ</td>
 *  	<td>Update request No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>scheduler_frozen_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>スケジューラ凍結ＦＬＧ</td>
 *  	<td>Scheduler frozen flg.</td>
 *  </tr>
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
public class MST_OPER_ORDER_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.CO_VIEW;

	public static final String TABLE_NAME = "MST_OPER_ORDER";

	public static final boolean EX_CTRL = true;
	
	public static final boolean LCL_TABLE = false;
	
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
	 * ワーキンググループＣＤ. WG cd..<p>
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
	
	/**
	 * シミュレーションＮＯ. Simulation No..<p>
	 *
	 */
	public static final String $sim_mrp_no = "sim_mrp_no";
	private static final MCPermColumnInfo _sim_mrp_no = createColumnInfo("sim_mrp_no");
	public final MCStringPermColumn sim_mrp_no = createStringColumn(_sim_mrp_no);
	
	/**
	 * 工程資源. Operation resources.<p>
	 *
	 */
	public static final String $oper_rsrc = "oper_rsrc";
	private static final MCPermColumnInfo _oper_rsrc = createColumnInfo("oper_rsrc");
	public final MCStringPermColumn oper_rsrc = createStringColumn(_oper_rsrc);
	
	/**
	 * 内部備考. Internal remarks.<p>
	 *
	 */
	public static final String $intr_rmrks = "intr_rmrks";
	private static final MCPermColumnInfo _intr_rmrks = createColumnInfo("intr_rmrks");
	public final MCStringPermColumn intr_rmrks = createStringColumn(_intr_rmrks);
	
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
	
	/**
	 * 外部工程オーダＮＯ. External operation order No..<p>
	 *
	 */
	public static final String $ext_oper_ord_no = "ext_oper_ord_no";
	private static final MCPermColumnInfo _ext_oper_ord_no = createColumnInfo("ext_oper_ord_no");
	public final MCStringPermColumn ext_oper_ord_no = createStringColumn(_ext_oper_ord_no);
	
	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public static final String $ins_usr_id = "ins_usr_id";
	private static final MCPermColumnInfo _ins_usr_id = createColumnInfo("ins_usr_id");
	public final MCStringPermColumn ins_usr_id = createStringColumn(_ins_usr_id);
	
	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public static final String $ins_usr_nm = "ins_usr_nm";
	private static final MCPermColumnInfo _ins_usr_nm = createColumnInfo("ins_usr_nm");
	public final MCStringPermColumn ins_usr_nm = createStringColumn(_ins_usr_nm);
	
	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public static final String $ins_ts = "ins_ts";
	private static final MCPermColumnInfo _ins_ts = createColumnInfo("ins_ts");
	public final MCTimestampPermColumn ins_ts = createTimestampColumn(_ins_ts);
	
	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public static final String $ins_func_id = "ins_func_id";
	private static final MCPermColumnInfo _ins_func_id = createColumnInfo("ins_func_id");
	public final MCStringPermColumn ins_func_id = createStringColumn(_ins_func_id);
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public static final String $upd_cntr = "upd_cntr";
	private static final MCPermColumnInfo _upd_cntr = createColumnInfo("upd_cntr");
	public final MCNumberPermColumn upd_cntr = createNumberColumn(_upd_cntr);
	
	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public static final String $upd_usr_id = "upd_usr_id";
	private static final MCPermColumnInfo _upd_usr_id = createColumnInfo("upd_usr_id");
	public final MCStringPermColumn upd_usr_id = createStringColumn(_upd_usr_id);
	
	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public static final String $upd_usr_nm = "upd_usr_nm";
	private static final MCPermColumnInfo _upd_usr_nm = createColumnInfo("upd_usr_nm");
	public final MCStringPermColumn upd_usr_nm = createStringColumn(_upd_usr_nm);
	
	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public static final String $upd_ts = "upd_ts";
	private static final MCPermColumnInfo _upd_ts = createColumnInfo("upd_ts");
	public final MCTimestampPermColumn upd_ts = createTimestampColumn(_upd_ts);
	
	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public static final String $upd_func_id = "upd_func_id";
	private static final MCPermColumnInfo _upd_func_id = createColumnInfo("upd_func_id");
	public final MCStringPermColumn upd_func_id = createStringColumn(_upd_func_id);
	
	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public static final String $upd_srv_req_no = "upd_srv_req_no";
	private static final MCPermColumnInfo _upd_srv_req_no = createColumnInfo("upd_srv_req_no");
	public final MCStringPermColumn upd_srv_req_no = createStringColumn(_upd_srv_req_no);
	
	/**
	 * スケジューラ凍結ＦＬＧ. Scheduler frozen flg..<p>
	 *
	 */
	public static final String $scheduler_frozen_flg = "scheduler_frozen_flg";
	private static final MCPermColumnInfo _scheduler_frozen_flg = createColumnInfo("scheduler_frozen_flg");
	public final MCBooleanPermColumn scheduler_frozen_flg = createBooleanColumn(_scheduler_frozen_flg);
	
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
	public static final MCMeta sim_mrp_no_META = createCommonMeta($sim_mrp_no, mcframe.commonMA.meta.MA_META.SIM_MRP_NO);
	public static final MCMeta oper_rsrc_META = createCommonMeta($oper_rsrc, mcframe.commonMA.meta.MA_META.OPER_RSRC);
	public static final MCMeta intr_rmrks_META = createCommonMeta($intr_rmrks, mcframe.commonMS.meta.MS_META.OORDER_INTR_RMRKS);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.OORDER_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.OORDER_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.OORDER_SUB_CHAR3);
	public static final MCMeta ext_oper_ord_no_META = createCommonMeta($ext_oper_ord_no, mcframe.commonMA.meta.MA_META.EXT_OPER_ORD_NO);
	public static final MCMeta ins_usr_id_META = createCommonMeta($ins_usr_id, mcframe.commonMA.meta.MA_META.FCM_USR_ID);
	public static final MCMeta ins_usr_nm_META = createCommonMeta($ins_usr_nm, mcframe.commonMA.meta.MA_META.FCM_USR_NM);
	public static final MCMeta ins_ts_META = createCommonMeta($ins_ts, mcframe.commonMA.meta.MA_META.SYS_TS);
	public static final MCMeta ins_func_id_META = createCommonMeta($ins_func_id, mcframe.commonMA.meta.MA_META.FUNC_ID);
	public static final MCMeta upd_cntr_META = createCommonMeta($upd_cntr, mcframe.commonMA.meta.MA_META.UPD_CNT);
	public static final MCMeta upd_usr_id_META = createCommonMeta($upd_usr_id, mcframe.commonMA.meta.MA_META.FCM_USR_ID);
	public static final MCMeta upd_usr_nm_META = createCommonMeta($upd_usr_nm, mcframe.commonMA.meta.MA_META.FCM_USR_NM);
	public static final MCMeta upd_ts_META = createCommonMeta($upd_ts, mcframe.commonMA.meta.MA_META.SYS_TS);
	public static final MCMeta upd_func_id_META = createCommonMeta($upd_func_id, mcframe.commonMA.meta.MA_META.FUNC_ID);
	public static final MCMeta upd_srv_req_no_META = createCommonMeta($upd_srv_req_no, mcframe.commonMA.meta.MA_META.SRV_REQ_NO);
	public static final MCMeta scheduler_frozen_flg_META = createCommonMeta($scheduler_frozen_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final List<MCForeignInfo> FOREIGN_INFO_LIST = new ArrayList<>();
	public static final String $ITM_ORDER1 = "ITM_ORDER1";
	public static final String $SIM_MRP1 = "SIM_MRP1";
	static {
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MST_ITM_ORDER",
				$ITM_ORDER1,
				new String[][]{
						{"itm_ord_no", "itm_ord_no"}
				},
				() -> {
					return mcframe.serverMS.dbc.MST_ITM_ORDER_R.create("ITM_ORDER1");
				},
				(alias) -> {
					MST_OPER_ORDER_R own = MST_OPER_ORDER_R.create(alias);
					mcframe.serverMS.dbc.MST_ITM_ORDER_R ref = mcframe.serverMS.dbc.MST_ITM_ORDER_R.create("ITM_ORDER1");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.itm_ord_no.eq(ref.itm_ord_no));
					return cond;
				}
			)
		);
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MST_SIM_MRP",
				$SIM_MRP1,
				new String[][]{
						{"sim_mrp_no", "sim_mrp_no"}
				},
				() -> {
					return mcframe.serverMS.dbc.MST_SIM_MRP_R.create("SIM_MRP1");
				},
				(alias) -> {
					MST_OPER_ORDER_R own = MST_OPER_ORDER_R.create(alias);
					mcframe.serverMS.dbc.MST_SIM_MRP_R ref = mcframe.serverMS.dbc.MST_SIM_MRP_R.create("SIM_MRP1");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.sim_mrp_no.eq(ref.sim_mrp_no));
					return cond;
				}
			)
		);
	}
	
	protected static final ConstMetaList<MST_OPER_ORDER_R> constMetas = new ConstMetaList<MST_OPER_ORDER_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
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
			yield_oper_flg_META,
			sim_mrp_no_META,
			oper_rsrc_META,
			intr_rmrks_META,
			sub_char1_META,
			sub_char2_META,
			sub_char3_META,
			ext_oper_ord_no_META,
			ins_usr_id_META,
			ins_usr_nm_META,
			ins_ts_META,
			ins_func_id_META,
			upd_cntr_META,
			upd_usr_id_META,
			upd_usr_nm_META,
			upd_ts_META,
			upd_func_id_META,
			upd_srv_req_no_META,
			scheduler_frozen_flg_META
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
	protected MST_OPER_ORDER_R(ConstMetaList<? extends MST_OPER_ORDER_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MST_OPER_ORDER_R(ConstMetaList<? extends MST_OPER_ORDER_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MST_OPER_ORDER_R.$oper_ord_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_OPER_ORDER_R.$oper_ord_no,
				"oper_ord_no",
				oper_ord_no,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_OPER_ORDER_R.$st_schd_tm,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_OPER_ORDER_R.$st_schd_tm,
				"st_schd_tm",
				st_schd_tm,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_OPER_ORDER_R.$inst_st_schd_tm,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_OPER_ORDER_R.$inst_st_schd_tm,
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
			MST_OPER_ORDER_R.$act_st_tm,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_OPER_ORDER_R.$act_st_tm,
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
			MST_OPER_ORDER_R.$end_schd_tm,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_OPER_ORDER_R.$end_schd_tm,
				"end_schd_tm",
				end_schd_tm,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_OPER_ORDER_R.$inst_end_schd_tm,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_OPER_ORDER_R.$inst_end_schd_tm,
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
			MST_OPER_ORDER_R.$act_end_tm,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_OPER_ORDER_R.$act_end_tm,
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
			MST_OPER_ORDER_R.$oper_lt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_OPER_ORDER_R.$oper_lt,
				"oper_lt",
				oper_lt,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_OPER_ORDER_R.$act_oper_lt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_OPER_ORDER_R.$act_oper_lt,
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
			MST_OPER_ORDER_R.$oper_offst_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_OPER_ORDER_R.$oper_offst_typ,
				"oper_offst_typ",
				oper_offst_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_OPER_ORDER_R.$oper_offst,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_OPER_ORDER_R.$oper_offst,
				"oper_offst",
				oper_offst,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_OPER_ORDER_R.$oper_schd_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_OPER_ORDER_R.$oper_schd_qty,
				"oper_schd_qty",
				oper_schd_qty,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_OPER_ORDER_R.$not_oper_schd_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_OPER_ORDER_R.$not_oper_schd_qty,
				"not_oper_schd_qty",
				not_oper_schd_qty,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_OPER_ORDER_R.$itm_ord_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_OPER_ORDER_R.$itm_ord_no,
				"itm_ord_no",
				itm_ord_no,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_OPER_ORDER_R.$disp_seq,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_OPER_ORDER_R.$disp_seq,
				"disp_seq",
				disp_seq,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_OPER_ORDER_R.$oper_ptn,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_OPER_ORDER_R.$oper_ptn,
				"oper_ptn",
				oper_ptn,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_OPER_ORDER_R.$oper_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_OPER_ORDER_R.$oper_cd,
				"oper_cd",
				oper_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_OPER_ORDER_R.$oper_seq,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_OPER_ORDER_R.$oper_seq,
				"oper_seq",
				oper_seq,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_OPER_ORDER_R.$loc_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_OPER_ORDER_R.$loc_cd,
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
			MST_OPER_ORDER_R.$oper_ord_sts_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_OPER_ORDER_R.$oper_ord_sts_typ,
				"oper_ord_sts_typ",
				oper_ord_sts_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_OPER_ORDER_R.$itm_ord_sts_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_OPER_ORDER_R.$itm_ord_sts_typ,
				"itm_ord_sts_typ",
				itm_ord_sts_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_OPER_ORDER_R.$wg_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_OPER_ORDER_R.$wg_cd,
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
		COLUMN_MAP.put(
			MST_OPER_ORDER_R.$yield_oper_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_OPER_ORDER_R.$yield_oper_flg,
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
		COLUMN_MAP.put(
			MST_OPER_ORDER_R.$sim_mrp_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_OPER_ORDER_R.$sim_mrp_no,
				"sim_mrp_no",
				sim_mrp_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_OPER_ORDER_R.$oper_rsrc,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_OPER_ORDER_R.$oper_rsrc,
				"oper_rsrc",
				oper_rsrc,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_OPER_ORDER_R.$intr_rmrks,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_OPER_ORDER_R.$intr_rmrks,
				"intr_rmrks",
				intr_rmrks,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_OPER_ORDER_R.$sub_char1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_OPER_ORDER_R.$sub_char1,
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
			MST_OPER_ORDER_R.$sub_char2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_OPER_ORDER_R.$sub_char2,
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
			MST_OPER_ORDER_R.$sub_char3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_OPER_ORDER_R.$sub_char3,
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
		COLUMN_MAP.put(
			MST_OPER_ORDER_R.$ext_oper_ord_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_OPER_ORDER_R.$ext_oper_ord_no,
				"ext_oper_ord_no",
				ext_oper_ord_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_OPER_ORDER_R.$ins_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_OPER_ORDER_R.$ins_usr_id,
				"ins_usr_id",
				ins_usr_id,
				false,
				true,
				true,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_OPER_ORDER_R.$ins_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_OPER_ORDER_R.$ins_usr_nm,
				"ins_usr_nm",
				ins_usr_nm,
				false,
				true,
				true,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_OPER_ORDER_R.$ins_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MST_OPER_ORDER_R.$ins_ts,
				"ins_ts",
				ins_ts,
				false,
				true,
				true,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_OPER_ORDER_R.$ins_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_OPER_ORDER_R.$ins_func_id,
				"ins_func_id",
				ins_func_id,
				false,
				true,
				true,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_OPER_ORDER_R.$upd_cntr,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_OPER_ORDER_R.$upd_cntr,
				"upd_cntr",
				upd_cntr,
				false,
				true,
				true,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_OPER_ORDER_R.$upd_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_OPER_ORDER_R.$upd_usr_id,
				"upd_usr_id",
				upd_usr_id,
				false,
				true,
				true,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_OPER_ORDER_R.$upd_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_OPER_ORDER_R.$upd_usr_nm,
				"upd_usr_nm",
				upd_usr_nm,
				false,
				true,
				true,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_OPER_ORDER_R.$upd_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MST_OPER_ORDER_R.$upd_ts,
				"upd_ts",
				upd_ts,
				false,
				true,
				true,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_OPER_ORDER_R.$upd_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_OPER_ORDER_R.$upd_func_id,
				"upd_func_id",
				upd_func_id,
				false,
				true,
				true,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_OPER_ORDER_R.$upd_srv_req_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_OPER_ORDER_R.$upd_srv_req_no,
				"upd_srv_req_no",
				upd_srv_req_no,
				false,
				true,
				true,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_OPER_ORDER_R.$scheduler_frozen_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_OPER_ORDER_R.$scheduler_frozen_flg,
				"scheduler_frozen_flg",
				scheduler_frozen_flg,
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
	public static MST_OPER_ORDER_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MST_OPER_ORDER_R create(String alias) {
		MST_OPER_ORDER_R row = new MST_OPER_ORDER_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MST_OPER_ORDER_R createByName(T proto) {
		MST_OPER_ORDER_R row = MST_OPER_ORDER_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MST_OPER_ORDER_R clone() {
		return (MST_OPER_ORDER_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MST_OPER_ORDER_R createInstance() {
		return (MST_OPER_ORDER_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MST_OPER_ORDER_R getValues(String... names) {
		return (MST_OPER_ORDER_R) super.getValues(names);
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
		return true;
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
	 public MSW_OPER_ORDER_KEY_R getPkWorkDbc(String alias) {
	 	return MSW_OPER_ORDER_KEY_R.create(alias);
	 }

	/*
	 * MCDBContainerのオーバーライドメソッドです。
	 */
	 public MSW_OPER_ORDER_KEY_R getPkWorkDbc() {
	 	return getPkWorkDbc(MSW_OPER_ORDER_KEY_R.TABLE_NAME);
	 }

	/**
	 * 工程オーダＮＯ. Operation order No..<p>
	 *
	 */
	public String oper_ord_no() {
		return getConstString(offset + 0, $oper_ord_no);
	}

	/**
	 * 工程オーダＮＯ. Operation order No..<p>
	 *
	 */
	public void oper_ord_no(String value) {
		setConstString(offset + 0, $oper_ord_no, value);
	}

	/**
	 * 工程着手予定日時. Scheduled operation start date and time.<p>
	 *
	 */
	public MCDate st_schd_tm() {
		return getConstDate(offset + 1, $st_schd_tm);
	}

	/**
	 * 工程着手予定日時. Scheduled operation start date and time.<p>
	 *
	 */
	public void st_schd_tm(MCDate value) {
		setConstDate(offset + 1, $st_schd_tm, value);
	}

	/**
	 * 工程着手予定日時（指図）. Scheduled operation start date and time (Order).<p>
	 *
	 */
	public MCDate inst_st_schd_tm() {
		return getConstDate(offset + 2, $inst_st_schd_tm);
	}

	/**
	 * 工程着手予定日時（指図）. Scheduled operation start date and time (Order).<p>
	 *
	 */
	public void inst_st_schd_tm(MCDate value) {
		setConstDate(offset + 2, $inst_st_schd_tm, value);
	}

	/**
	 * 工程着手実績日時. Actual operation start date and time.<p>
	 *
	 */
	public MCDate act_st_tm() {
		return getConstDate(offset + 3, $act_st_tm);
	}

	/**
	 * 工程着手実績日時. Actual operation start date and time.<p>
	 *
	 */
	public void act_st_tm(MCDate value) {
		setConstDate(offset + 3, $act_st_tm, value);
	}

	/**
	 * 工程終了予定日時. Scheduled operation end date and time.<p>
	 *
	 */
	public MCDate end_schd_tm() {
		return getConstDate(offset + 4, $end_schd_tm);
	}

	/**
	 * 工程終了予定日時. Scheduled operation end date and time.<p>
	 *
	 */
	public void end_schd_tm(MCDate value) {
		setConstDate(offset + 4, $end_schd_tm, value);
	}

	/**
	 * 工程終了予定日時（指図）. Scheduled operation end date and time (Order).<p>
	 *
	 */
	public MCDate inst_end_schd_tm() {
		return getConstDate(offset + 5, $inst_end_schd_tm);
	}

	/**
	 * 工程終了予定日時（指図）. Scheduled operation end date and time (Order).<p>
	 *
	 */
	public void inst_end_schd_tm(MCDate value) {
		setConstDate(offset + 5, $inst_end_schd_tm, value);
	}

	/**
	 * 工程終了実績日時. Actual operation end date and time.<p>
	 *
	 */
	public MCDate act_end_tm() {
		return getConstDate(offset + 6, $act_end_tm);
	}

	/**
	 * 工程終了実績日時. Actual operation end date and time.<p>
	 *
	 */
	public void act_end_tm(MCDate value) {
		setConstDate(offset + 6, $act_end_tm, value);
	}

	/**
	 * 工程ＬＴ. Operation LT.<p>
	 *
	 */
	public MCNumber oper_lt() {
		return getConstNumber(offset + 7, $oper_lt);
	}

	/**
	 * 工程ＬＴ. Operation LT.<p>
	 *
	 */
	public void oper_lt(MCNumber value) {
		setConstNumber(offset + 7, $oper_lt, value);
	}
	
	/**
	 * 工程ＬＴ. Operation LT.<p>
	 *
	 */
	public void oper_lt(int value) {
		setConstNumber(offset + 7, $oper_lt, value);
	}
	
	/**
	 * 工程ＬＴ. Operation LT.<p>
	 *
	 */
	public void oper_lt(long value) {
		setConstNumber(offset + 7, $oper_lt, value);
	}
	
	/**
	 * 工程ＬＴ. Operation LT.<p>
	 *
	 */
	public void oper_lt(float value) {
		setConstNumber(offset + 7, $oper_lt, value);
	}
	
	/**
	 * 工程ＬＴ. Operation LT.<p>
	 *
	 */
	public void oper_lt(double value) {
		setConstNumber(offset + 7, $oper_lt, value);
	}
	
	/**
	 * 工程ＬＴ（実績）. Operation LT (Result).<p>
	 *
	 */
	public MCNumber act_oper_lt() {
		return getConstNumber(offset + 8, $act_oper_lt);
	}

	/**
	 * 工程ＬＴ（実績）. Operation LT (Result).<p>
	 *
	 */
	public void act_oper_lt(MCNumber value) {
		setConstNumber(offset + 8, $act_oper_lt, value);
	}
	
	/**
	 * 工程ＬＴ（実績）. Operation LT (Result).<p>
	 *
	 */
	public void act_oper_lt(int value) {
		setConstNumber(offset + 8, $act_oper_lt, value);
	}
	
	/**
	 * 工程ＬＴ（実績）. Operation LT (Result).<p>
	 *
	 */
	public void act_oper_lt(long value) {
		setConstNumber(offset + 8, $act_oper_lt, value);
	}
	
	/**
	 * 工程ＬＴ（実績）. Operation LT (Result).<p>
	 *
	 */
	public void act_oper_lt(float value) {
		setConstNumber(offset + 8, $act_oper_lt, value);
	}
	
	/**
	 * 工程ＬＴ（実績）. Operation LT (Result).<p>
	 *
	 */
	public void act_oper_lt(double value) {
		setConstNumber(offset + 8, $act_oper_lt, value);
	}
	
	/**
	 * 工程オフセット区分. Operation offset type.<p>
	 *
	 */
	public String oper_offst_typ() {
		return getConstString(offset + 9, $oper_offst_typ);
	}

	/**
	 * 工程オフセット区分. Operation offset type.<p>
	 *
	 */
	public void oper_offst_typ(String value) {
		setConstString(offset + 9, $oper_offst_typ, value);
	}

	/**
	 * 工程オフセット. Operation offset.<p>
	 *
	 */
	public MCNumber oper_offst() {
		return getConstNumber(offset + 10, $oper_offst);
	}

	/**
	 * 工程オフセット. Operation offset.<p>
	 *
	 */
	public void oper_offst(MCNumber value) {
		setConstNumber(offset + 10, $oper_offst, value);
	}
	
	/**
	 * 工程オフセット. Operation offset.<p>
	 *
	 */
	public void oper_offst(int value) {
		setConstNumber(offset + 10, $oper_offst, value);
	}
	
	/**
	 * 工程オフセット. Operation offset.<p>
	 *
	 */
	public void oper_offst(long value) {
		setConstNumber(offset + 10, $oper_offst, value);
	}
	
	/**
	 * 工程オフセット. Operation offset.<p>
	 *
	 */
	public void oper_offst(float value) {
		setConstNumber(offset + 10, $oper_offst, value);
	}
	
	/**
	 * 工程オフセット. Operation offset.<p>
	 *
	 */
	public void oper_offst(double value) {
		setConstNumber(offset + 10, $oper_offst, value);
	}
	
	/**
	 * 工程指図予定数量. Operation order scheduled qty..<p>
	 *
	 */
	public MCNumber oper_schd_qty() {
		return getConstNumber(offset + 11, $oper_schd_qty);
	}

	/**
	 * 工程指図予定数量. Operation order scheduled qty..<p>
	 *
	 */
	public void oper_schd_qty(MCNumber value) {
		setConstNumber(offset + 11, $oper_schd_qty, value);
	}
	
	/**
	 * 工程指図予定数量. Operation order scheduled qty..<p>
	 *
	 */
	public void oper_schd_qty(int value) {
		setConstNumber(offset + 11, $oper_schd_qty, value);
	}
	
	/**
	 * 工程指図予定数量. Operation order scheduled qty..<p>
	 *
	 */
	public void oper_schd_qty(long value) {
		setConstNumber(offset + 11, $oper_schd_qty, value);
	}
	
	/**
	 * 工程指図予定数量. Operation order scheduled qty..<p>
	 *
	 */
	public void oper_schd_qty(float value) {
		setConstNumber(offset + 11, $oper_schd_qty, value);
	}
	
	/**
	 * 工程指図予定数量. Operation order scheduled qty..<p>
	 *
	 */
	public void oper_schd_qty(double value) {
		setConstNumber(offset + 11, $oper_schd_qty, value);
	}
	
	/**
	 * 工程未指図数量. Operation unordered qty..<p>
	 *
	 */
	public MCNumber not_oper_schd_qty() {
		return getConstNumber(offset + 12, $not_oper_schd_qty);
	}

	/**
	 * 工程未指図数量. Operation unordered qty..<p>
	 *
	 */
	public void not_oper_schd_qty(MCNumber value) {
		setConstNumber(offset + 12, $not_oper_schd_qty, value);
	}
	
	/**
	 * 工程未指図数量. Operation unordered qty..<p>
	 *
	 */
	public void not_oper_schd_qty(int value) {
		setConstNumber(offset + 12, $not_oper_schd_qty, value);
	}
	
	/**
	 * 工程未指図数量. Operation unordered qty..<p>
	 *
	 */
	public void not_oper_schd_qty(long value) {
		setConstNumber(offset + 12, $not_oper_schd_qty, value);
	}
	
	/**
	 * 工程未指図数量. Operation unordered qty..<p>
	 *
	 */
	public void not_oper_schd_qty(float value) {
		setConstNumber(offset + 12, $not_oper_schd_qty, value);
	}
	
	/**
	 * 工程未指図数量. Operation unordered qty..<p>
	 *
	 */
	public void not_oper_schd_qty(double value) {
		setConstNumber(offset + 12, $not_oper_schd_qty, value);
	}
	
	/**
	 * 品目オーダＮＯ. Item order No..<p>
	 *
	 */
	public String itm_ord_no() {
		return getConstString(offset + 13, $itm_ord_no);
	}

	/**
	 * 品目オーダＮＯ. Item order No..<p>
	 *
	 */
	public void itm_ord_no(String value) {
		setConstString(offset + 13, $itm_ord_no, value);
	}

	/**
	 * 工順. Routing.<p>
	 *
	 */
	public MCNumber disp_seq() {
		return getConstNumber(offset + 14, $disp_seq);
	}

	/**
	 * 工順. Routing.<p>
	 *
	 */
	public void disp_seq(MCNumber value) {
		setConstNumber(offset + 14, $disp_seq, value);
	}
	
	/**
	 * 工順. Routing.<p>
	 *
	 */
	public void disp_seq(int value) {
		setConstNumber(offset + 14, $disp_seq, value);
	}
	
	/**
	 * 工順. Routing.<p>
	 *
	 */
	public void disp_seq(long value) {
		setConstNumber(offset + 14, $disp_seq, value);
	}
	
	/**
	 * 工順. Routing.<p>
	 *
	 */
	public void disp_seq(float value) {
		setConstNumber(offset + 14, $disp_seq, value);
	}
	
	/**
	 * 工順. Routing.<p>
	 *
	 */
	public void disp_seq(double value) {
		setConstNumber(offset + 14, $disp_seq, value);
	}
	
	/**
	 * 工程パタン. Operation pattern.<p>
	 *
	 */
	public String oper_ptn() {
		return getConstString(offset + 15, $oper_ptn);
	}

	/**
	 * 工程パタン. Operation pattern.<p>
	 *
	 */
	public void oper_ptn(String value) {
		setConstString(offset + 15, $oper_ptn, value);
	}

	/**
	 * 工程ＣＤ. Operation cd..<p>
	 *
	 */
	public String oper_cd() {
		return getConstString(offset + 16, $oper_cd);
	}

	/**
	 * 工程ＣＤ. Operation cd..<p>
	 *
	 */
	public void oper_cd(String value) {
		setConstString(offset + 16, $oper_cd, value);
	}

	/**
	 * 工程連番. Operation sequence number.<p>
	 *
	 */
	public MCNumber oper_seq() {
		return getConstNumber(offset + 17, $oper_seq);
	}

	/**
	 * 工程連番. Operation sequence number.<p>
	 *
	 */
	public void oper_seq(MCNumber value) {
		setConstNumber(offset + 17, $oper_seq, value);
	}
	
	/**
	 * 工程連番. Operation sequence number.<p>
	 *
	 */
	public void oper_seq(int value) {
		setConstNumber(offset + 17, $oper_seq, value);
	}
	
	/**
	 * 工程連番. Operation sequence number.<p>
	 *
	 */
	public void oper_seq(long value) {
		setConstNumber(offset + 17, $oper_seq, value);
	}
	
	/**
	 * 工程連番. Operation sequence number.<p>
	 *
	 */
	public void oper_seq(float value) {
		setConstNumber(offset + 17, $oper_seq, value);
	}
	
	/**
	 * 工程連番. Operation sequence number.<p>
	 *
	 */
	public void oper_seq(double value) {
		setConstNumber(offset + 17, $oper_seq, value);
	}
	
	/**
	 * 場所ＣＤ. Location cd..<p>
	 *
	 */
	public String loc_cd() {
		return getConstString(offset + 18, $loc_cd);
	}

	/**
	 * 場所ＣＤ. Location cd..<p>
	 *
	 */
	public void loc_cd(String value) {
		setConstString(offset + 18, $loc_cd, value);
	}

	/**
	 * 工程オーダ状況区分. Operation order status type.<p>
	 *
	 */
	public String oper_ord_sts_typ() {
		return getConstString(offset + 19, $oper_ord_sts_typ);
	}

	/**
	 * 工程オーダ状況区分. Operation order status type.<p>
	 *
	 */
	public void oper_ord_sts_typ(String value) {
		setConstString(offset + 19, $oper_ord_sts_typ, value);
	}

	/**
	 * 品目オーダ状況区分. Item order status type.<p>
	 *
	 */
	public String itm_ord_sts_typ() {
		return getConstString(offset + 20, $itm_ord_sts_typ);
	}

	/**
	 * 品目オーダ状況区分. Item order status type.<p>
	 *
	 */
	public void itm_ord_sts_typ(String value) {
		setConstString(offset + 20, $itm_ord_sts_typ, value);
	}

	/**
	 * ワーキンググループＣＤ. WG cd..<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 21, $wg_cd);
	}

	/**
	 * ワーキンググループＣＤ. WG cd..<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 21, $wg_cd, value);
	}

	/**
	 * 出来高計上工程ＦＬＧ. Create inventory flg..<p>
	 *
	 */
	public boolean yield_oper_flg() {
		return getConstBoolean(offset + 22, $yield_oper_flg);
	}

	/**
	 * 出来高計上工程ＦＬＧ. Create inventory flg..<p>
	 *
	 */
	public void yield_oper_flg(boolean value) {
		setConstBoolean(offset + 22, $yield_oper_flg, value);
	}

	/**
	 * シミュレーションＮＯ. Simulation No..<p>
	 *
	 */
	public String sim_mrp_no() {
		return getConstString(offset + 23, $sim_mrp_no);
	}

	/**
	 * シミュレーションＮＯ. Simulation No..<p>
	 *
	 */
	public void sim_mrp_no(String value) {
		setConstString(offset + 23, $sim_mrp_no, value);
	}

	/**
	 * 工程資源. Operation resources.<p>
	 *
	 */
	public String oper_rsrc() {
		return getConstString(offset + 24, $oper_rsrc);
	}

	/**
	 * 工程資源. Operation resources.<p>
	 *
	 */
	public void oper_rsrc(String value) {
		setConstString(offset + 24, $oper_rsrc, value);
	}

	/**
	 * 内部備考. Internal remarks.<p>
	 *
	 */
	public String intr_rmrks() {
		return getConstString(offset + 25, $intr_rmrks);
	}

	/**
	 * 内部備考. Internal remarks.<p>
	 *
	 */
	public void intr_rmrks(String value) {
		setConstString(offset + 25, $intr_rmrks, value);
	}

	/**
	 * 予備１. Spare 1.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 26, $sub_char1);
	}

	/**
	 * 予備１. Spare 1.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 26, $sub_char1, value);
	}

	/**
	 * 予備２. Spare 2.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 27, $sub_char2);
	}

	/**
	 * 予備２. Spare 2.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 27, $sub_char2, value);
	}

	/**
	 * 予備３. Spare 3.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 28, $sub_char3);
	}

	/**
	 * 予備３. Spare 3.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 28, $sub_char3, value);
	}

	/**
	 * 外部工程オーダＮＯ. External operation order No..<p>
	 *
	 */
	public String ext_oper_ord_no() {
		return getConstString(offset + 29, $ext_oper_ord_no);
	}

	/**
	 * 外部工程オーダＮＯ. External operation order No..<p>
	 *
	 */
	public void ext_oper_ord_no(String value) {
		setConstString(offset + 29, $ext_oper_ord_no, value);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 30, $ins_usr_id);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 30, $ins_usr_id, value);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 31, $ins_usr_nm);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 31, $ins_usr_nm, value);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 32, $ins_ts);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 32, $ins_ts, value);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 33, $ins_func_id);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 33, $ins_func_id, value);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 34, $upd_cntr);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 34, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 34, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 34, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 34, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 34, $upd_cntr, value);
	}
	
	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 35, $upd_usr_id);
	}

	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 35, $upd_usr_id, value);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 36, $upd_usr_nm);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 36, $upd_usr_nm, value);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 37, $upd_ts);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 37, $upd_ts, value);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 38, $upd_func_id);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 38, $upd_func_id, value);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 39, $upd_srv_req_no);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 39, $upd_srv_req_no, value);
	}

	/**
	 * スケジューラ凍結ＦＬＧ. Scheduler frozen flg..<p>
	 *
	 */
	public boolean scheduler_frozen_flg() {
		return getConstBoolean(offset + 40, $scheduler_frozen_flg);
	}

	/**
	 * スケジューラ凍結ＦＬＧ. Scheduler frozen flg..<p>
	 *
	 */
	public void scheduler_frozen_flg(boolean value) {
		setConstBoolean(offset + 40, $scheduler_frozen_flg, value);
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
		if ($sim_mrp_no.equalsIgnoreCase(name)) {
			return sim_mrp_no();
		}
		if ($oper_rsrc.equalsIgnoreCase(name)) {
			return oper_rsrc();
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			return intr_rmrks();
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
		if ($ext_oper_ord_no.equalsIgnoreCase(name)) {
			return ext_oper_ord_no();
		}
		if ($ins_usr_id.equalsIgnoreCase(name)) {
			return ins_usr_id();
		}
		if ($ins_usr_nm.equalsIgnoreCase(name)) {
			return ins_usr_nm();
		}
		if ($ins_func_id.equalsIgnoreCase(name)) {
			return ins_func_id();
		}
		if ($upd_usr_id.equalsIgnoreCase(name)) {
			return upd_usr_id();
		}
		if ($upd_usr_nm.equalsIgnoreCase(name)) {
			return upd_usr_nm();
		}
		if ($upd_func_id.equalsIgnoreCase(name)) {
			return upd_func_id();
		}
		if ($upd_srv_req_no.equalsIgnoreCase(name)) {
			return upd_srv_req_no();
		}
		return super.getString(name);
	}

	public MCNumber getNumber(String name) {
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
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
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

	public MCTimestamp getTimestamp(String name) {
		if ($ins_ts.equalsIgnoreCase(name)) {
			return ins_ts();
		}
		if ($upd_ts.equalsIgnoreCase(name)) {
			return upd_ts();
		}
		return super.getTimestamp(name);
	}

	public boolean getBoolean(String name) {
		if ($yield_oper_flg.equalsIgnoreCase(name)) {
			return yield_oper_flg();
		}
		if ($scheduler_frozen_flg.equalsIgnoreCase(name)) {
			return scheduler_frozen_flg();
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
		if ($sim_mrp_no.equalsIgnoreCase(name)) {
			return sim_mrp_no();
		}
		if ($oper_rsrc.equalsIgnoreCase(name)) {
			return oper_rsrc();
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			return intr_rmrks();
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
		if ($ext_oper_ord_no.equalsIgnoreCase(name)) {
			return ext_oper_ord_no();
		}
		if ($ins_usr_id.equalsIgnoreCase(name)) {
			return ins_usr_id();
		}
		if ($ins_usr_nm.equalsIgnoreCase(name)) {
			return ins_usr_nm();
		}
		if ($ins_func_id.equalsIgnoreCase(name)) {
			return ins_func_id();
		}
		if ($upd_usr_id.equalsIgnoreCase(name)) {
			return upd_usr_id();
		}
		if ($upd_usr_nm.equalsIgnoreCase(name)) {
			return upd_usr_nm();
		}
		if ($upd_func_id.equalsIgnoreCase(name)) {
			return upd_func_id();
		}
		if ($upd_srv_req_no.equalsIgnoreCase(name)) {
			return upd_srv_req_no();
		}
		return super.getStringNE(name);
	}

	public MCNumber getNumberNE(String name) {
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
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
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

	public MCTimestamp getTimestampNE(String name) {
		if ($ins_ts.equalsIgnoreCase(name)) {
			return ins_ts();
		}
		if ($upd_ts.equalsIgnoreCase(name)) {
			return upd_ts();
		}
		return super.getTimestampNE(name);
	}

	public boolean getBooleanNE(String name) {
		if ($yield_oper_flg.equalsIgnoreCase(name)) {
			return yield_oper_flg();
		}
		if ($scheduler_frozen_flg.equalsIgnoreCase(name)) {
			return scheduler_frozen_flg();
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
		if ($sim_mrp_no.equalsIgnoreCase(name)) {
			sim_mrp_no(value);
			return;
		}
		if ($oper_rsrc.equalsIgnoreCase(name)) {
			oper_rsrc(value);
			return;
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			intr_rmrks(value);
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
		if ($ext_oper_ord_no.equalsIgnoreCase(name)) {
			ext_oper_ord_no(value);
			return;
		}
		if ($ins_usr_id.equalsIgnoreCase(name)) {
			ins_usr_id(value);
			return;
		}
		if ($ins_usr_nm.equalsIgnoreCase(name)) {
			ins_usr_nm(value);
			return;
		}
		if ($ins_func_id.equalsIgnoreCase(name)) {
			ins_func_id(value);
			return;
		}
		if ($upd_usr_id.equalsIgnoreCase(name)) {
			upd_usr_id(value);
			return;
		}
		if ($upd_usr_nm.equalsIgnoreCase(name)) {
			upd_usr_nm(value);
			return;
		}
		if ($upd_func_id.equalsIgnoreCase(name)) {
			upd_func_id(value);
			return;
		}
		if ($upd_srv_req_no.equalsIgnoreCase(name)) {
			upd_srv_req_no(value);
			return;
		}
		super.setString(name, value);
	}

	public void setNumber(String name, MCNumber value) {
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
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, int value) {
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
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, long value) {
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
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, float value) {
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
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, double value) {
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
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
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

	public void setTimestamp(String name, MCTimestamp value) {
		if ($ins_ts.equalsIgnoreCase(name)) {
			ins_ts(value);
			return;
		}
		if ($upd_ts.equalsIgnoreCase(name)) {
			upd_ts(value);
			return;
		}
		super.setTimestamp(name, value);
	}

	public void setBoolean(String name, boolean value) {
		if ($yield_oper_flg.equalsIgnoreCase(name)) {
			yield_oper_flg(value);
			return;
		}
		if ($scheduler_frozen_flg.equalsIgnoreCase(name)) {
			scheduler_frozen_flg(value);
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
		if ($sim_mrp_no.equalsIgnoreCase(name)) {
			sim_mrp_no(value);
			return;
		}
		if ($oper_rsrc.equalsIgnoreCase(name)) {
			oper_rsrc(value);
			return;
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			intr_rmrks(value);
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
		if ($ext_oper_ord_no.equalsIgnoreCase(name)) {
			ext_oper_ord_no(value);
			return;
		}
		if ($ins_usr_id.equalsIgnoreCase(name)) {
			ins_usr_id(value);
			return;
		}
		if ($ins_usr_nm.equalsIgnoreCase(name)) {
			ins_usr_nm(value);
			return;
		}
		if ($ins_func_id.equalsIgnoreCase(name)) {
			ins_func_id(value);
			return;
		}
		if ($upd_usr_id.equalsIgnoreCase(name)) {
			upd_usr_id(value);
			return;
		}
		if ($upd_usr_nm.equalsIgnoreCase(name)) {
			upd_usr_nm(value);
			return;
		}
		if ($upd_func_id.equalsIgnoreCase(name)) {
			upd_func_id(value);
			return;
		}
		if ($upd_srv_req_no.equalsIgnoreCase(name)) {
			upd_srv_req_no(value);
			return;
		}
		super.setStringNE(name, value);
	}

	public void setNumberNE(String name, MCNumber value) {
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
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, int value) {
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
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, long value) {
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
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, float value) {
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
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, double value) {
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
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
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

	public void setTimestampNE(String name, MCTimestamp value) {
		if ($ins_ts.equalsIgnoreCase(name)) {
			ins_ts(value);
			return;
		}
		if ($upd_ts.equalsIgnoreCase(name)) {
			upd_ts(value);
			return;
		}
		super.setTimestampNE(name, value);
	}

	public void setBooleanNE(String name, boolean value) {
		if ($yield_oper_flg.equalsIgnoreCase(name)) {
			yield_oper_flg(value);
			return;
		}
		if ($scheduler_frozen_flg.equalsIgnoreCase(name)) {
			scheduler_frozen_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

}
