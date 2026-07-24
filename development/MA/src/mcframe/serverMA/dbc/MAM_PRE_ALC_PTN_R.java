package mcframe.serverMA.dbc;

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
 * "一次配賦パタンマスタ // Departmental alloc. pattern master"DBコンテナRowクラスです。<p>
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
 *  	<td>pre_alc_ptn_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>一次配賦パタンＣＤ</td>
 *  	<td>Departmental alloc. pattern cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>pre_alc_ptn_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>一次配賦パタン名</td>
 *  	<td>Departmental alloc. pattern name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>base_pre_alc_ptn_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>一次配賦パタン名（ベース）</td>
 *  	<td>Departmental alloc. pattern name(Base)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>dpt_alc_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>部門配賦区分</td>
 *  	<td>Dept. allocation type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>loc_alc_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>場所配賦区分</td>
 *  	<td>Location allocation type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>oper_alc_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>工程配賦区分</td>
 *  	<td>Operation allocation type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>bp_alc_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引先配賦区分</td>
 *  	<td>BP allocation type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ctg_alc_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品群配賦区分</td>
 *  	<td>Item category allocation type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>itm_alc_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目配賦区分</td>
 *  	<td>Item allocation type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>lot_alc_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ロットＮＯ配賦区分</td>
 *  	<td>Lot No. allocation type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sublot_alc_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>サブロットＮＯ配賦区分</td>
 *  	<td>Sublot No. allocation type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sno1_alc_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>手配ＮＯ１配賦区分</td>
 *  	<td>SEIBAN No. 1 allocation type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sno2_alc_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>手配ＮＯ２配賦区分</td>
 *  	<td>SEIBAN No. 2 allocation type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sno3_alc_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>手配ＮＯ３配賦区分</td>
 *  	<td>SEIBAN No. 3 allocation type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sno4_alc_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>手配ＮＯ４配賦区分</td>
 *  	<td>SEIBAN No. 4 allocation type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>inst_alc_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>指図配賦区分</td>
 *  	<td>Order allocation type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>iv_alc_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>インボイス配賦区分</td>
 *  	<td>Invoice allocation type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>po_alc_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>発注配賦区分</td>
 *  	<td>PO allocation type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>slo_alc_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>受注配賦区分</td>
 *  	<td>Sales order allocation type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>alc_ac_alc_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>配賦科目配賦区分</td>
 *  	<td>Allocation account allocation type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>wg_alc_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ワーキンググループ配賦区分</td>
 *  	<td>WG allocation type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>memo1</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>メモ１</td>
 *  	<td>Memo 1</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>memo2</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>メモ２</td>
 *  	<td>Memo 2</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>memo3</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>メモ３</td>
 *  	<td>Memo 3</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>del_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>論理削除ＦＬＧ</td>
 *  	<td>Logical delete flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>del_usr_id</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>論理削除ユーザＩＤ</td>
 *  	<td>Logical delete user ID</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>del_usr_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>論理削除ユーザ名</td>
 *  	<td>Logical delete user name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>del_ts</td>
 *  	<td>TS</td>
 *  	<td>0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>論理削除日時</td>
 *  	<td>Logical delete date and time</td>
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
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
public class MAM_PRE_ALC_PTN_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.CO_VIEW;

	public static final String TABLE_NAME = "MAM_PRE_ALC_PTN";

	public static final boolean EX_CTRL = true;
	
	public static final boolean LCL_TABLE = false;
	
	/**
	 * 一次配賦パタンＣＤ. Departmental alloc. pattern cd..<p>
	 *
	 */
	public static final String $pre_alc_ptn_cd = "pre_alc_ptn_cd";
	private static final MCPermColumnInfo _pre_alc_ptn_cd = createColumnInfo("pre_alc_ptn_cd");
	public final MCStringPermColumn pre_alc_ptn_cd = createStringColumn(_pre_alc_ptn_cd);
	
	/**
	 * 一次配賦パタン名. Departmental alloc. pattern name.<p>
	 *
	 */
	public static final String $pre_alc_ptn_nm = "pre_alc_ptn_nm";
	private static final MCPermColumnInfo _pre_alc_ptn_nm = createColumnInfo("pre_alc_ptn_nm");
	public final MCStringPermColumn pre_alc_ptn_nm = createStringColumn(_pre_alc_ptn_nm);
	
	/**
	 * 一次配賦パタン名（ベース）. Departmental alloc. pattern name(Base).<p>
	 *
	 */
	public static final String $base_pre_alc_ptn_nm = "base_pre_alc_ptn_nm";
	private static final MCPermColumnInfo _base_pre_alc_ptn_nm = createColumnInfo("base_pre_alc_ptn_nm");
	public final MCStringPermColumn base_pre_alc_ptn_nm = createStringColumn(_base_pre_alc_ptn_nm);
	
	/**
	 * 部門配賦区分. Dept. allocation type.<p>
	 *
	 */
	public static final String $dpt_alc_typ = "dpt_alc_typ";
	private static final MCPermColumnInfo _dpt_alc_typ = createColumnInfo("dpt_alc_typ");
	public final MCStringPermColumn dpt_alc_typ = createStringColumn(_dpt_alc_typ);
	
	/**
	 * 場所配賦区分. Location allocation type.<p>
	 *
	 */
	public static final String $loc_alc_typ = "loc_alc_typ";
	private static final MCPermColumnInfo _loc_alc_typ = createColumnInfo("loc_alc_typ");
	public final MCStringPermColumn loc_alc_typ = createStringColumn(_loc_alc_typ);
	
	/**
	 * 工程配賦区分. Operation allocation type.<p>
	 *
	 */
	public static final String $oper_alc_typ = "oper_alc_typ";
	private static final MCPermColumnInfo _oper_alc_typ = createColumnInfo("oper_alc_typ");
	public final MCStringPermColumn oper_alc_typ = createStringColumn(_oper_alc_typ);
	
	/**
	 * 取引先配賦区分. BP allocation type.<p>
	 *
	 */
	public static final String $bp_alc_typ = "bp_alc_typ";
	private static final MCPermColumnInfo _bp_alc_typ = createColumnInfo("bp_alc_typ");
	public final MCStringPermColumn bp_alc_typ = createStringColumn(_bp_alc_typ);
	
	/**
	 * 品群配賦区分. Item category allocation type.<p>
	 *
	 */
	public static final String $ctg_alc_typ = "ctg_alc_typ";
	private static final MCPermColumnInfo _ctg_alc_typ = createColumnInfo("ctg_alc_typ");
	public final MCStringPermColumn ctg_alc_typ = createStringColumn(_ctg_alc_typ);
	
	/**
	 * 品目配賦区分. Item allocation type.<p>
	 *
	 */
	public static final String $itm_alc_typ = "itm_alc_typ";
	private static final MCPermColumnInfo _itm_alc_typ = createColumnInfo("itm_alc_typ");
	public final MCStringPermColumn itm_alc_typ = createStringColumn(_itm_alc_typ);
	
	/**
	 * ロットＮＯ配賦区分. Lot No. allocation type.<p>
	 *
	 */
	public static final String $lot_alc_typ = "lot_alc_typ";
	private static final MCPermColumnInfo _lot_alc_typ = createColumnInfo("lot_alc_typ");
	public final MCStringPermColumn lot_alc_typ = createStringColumn(_lot_alc_typ);
	
	/**
	 * サブロットＮＯ配賦区分. Sublot No. allocation type.<p>
	 *
	 */
	public static final String $sublot_alc_typ = "sublot_alc_typ";
	private static final MCPermColumnInfo _sublot_alc_typ = createColumnInfo("sublot_alc_typ");
	public final MCStringPermColumn sublot_alc_typ = createStringColumn(_sublot_alc_typ);
	
	/**
	 * 手配ＮＯ１配賦区分. SEIBAN No. 1 allocation type.<p>
	 *
	 */
	public static final String $sno1_alc_typ = "sno1_alc_typ";
	private static final MCPermColumnInfo _sno1_alc_typ = createColumnInfo("sno1_alc_typ");
	public final MCStringPermColumn sno1_alc_typ = createStringColumn(_sno1_alc_typ);
	
	/**
	 * 手配ＮＯ２配賦区分. SEIBAN No. 2 allocation type.<p>
	 *
	 */
	public static final String $sno2_alc_typ = "sno2_alc_typ";
	private static final MCPermColumnInfo _sno2_alc_typ = createColumnInfo("sno2_alc_typ");
	public final MCStringPermColumn sno2_alc_typ = createStringColumn(_sno2_alc_typ);
	
	/**
	 * 手配ＮＯ３配賦区分. SEIBAN No. 3 allocation type.<p>
	 *
	 */
	public static final String $sno3_alc_typ = "sno3_alc_typ";
	private static final MCPermColumnInfo _sno3_alc_typ = createColumnInfo("sno3_alc_typ");
	public final MCStringPermColumn sno3_alc_typ = createStringColumn(_sno3_alc_typ);
	
	/**
	 * 手配ＮＯ４配賦区分. SEIBAN No. 4 allocation type.<p>
	 *
	 */
	public static final String $sno4_alc_typ = "sno4_alc_typ";
	private static final MCPermColumnInfo _sno4_alc_typ = createColumnInfo("sno4_alc_typ");
	public final MCStringPermColumn sno4_alc_typ = createStringColumn(_sno4_alc_typ);
	
	/**
	 * 指図配賦区分. Order allocation type.<p>
	 *
	 */
	public static final String $inst_alc_typ = "inst_alc_typ";
	private static final MCPermColumnInfo _inst_alc_typ = createColumnInfo("inst_alc_typ");
	public final MCStringPermColumn inst_alc_typ = createStringColumn(_inst_alc_typ);
	
	/**
	 * インボイス配賦区分. Invoice allocation type.<p>
	 *
	 */
	public static final String $iv_alc_typ = "iv_alc_typ";
	private static final MCPermColumnInfo _iv_alc_typ = createColumnInfo("iv_alc_typ");
	public final MCStringPermColumn iv_alc_typ = createStringColumn(_iv_alc_typ);
	
	/**
	 * 発注配賦区分. PO allocation type.<p>
	 *
	 */
	public static final String $po_alc_typ = "po_alc_typ";
	private static final MCPermColumnInfo _po_alc_typ = createColumnInfo("po_alc_typ");
	public final MCStringPermColumn po_alc_typ = createStringColumn(_po_alc_typ);
	
	/**
	 * 受注配賦区分. Sales order allocation type.<p>
	 *
	 */
	public static final String $slo_alc_typ = "slo_alc_typ";
	private static final MCPermColumnInfo _slo_alc_typ = createColumnInfo("slo_alc_typ");
	public final MCStringPermColumn slo_alc_typ = createStringColumn(_slo_alc_typ);
	
	/**
	 * 配賦科目配賦区分. Allocation account allocation type.<p>
	 *
	 */
	public static final String $alc_ac_alc_typ = "alc_ac_alc_typ";
	private static final MCPermColumnInfo _alc_ac_alc_typ = createColumnInfo("alc_ac_alc_typ");
	public final MCStringPermColumn alc_ac_alc_typ = createStringColumn(_alc_ac_alc_typ);
	
	/**
	 * ワーキンググループ配賦区分. WG allocation type.<p>
	 *
	 */
	public static final String $wg_alc_typ = "wg_alc_typ";
	private static final MCPermColumnInfo _wg_alc_typ = createColumnInfo("wg_alc_typ");
	public final MCStringPermColumn wg_alc_typ = createStringColumn(_wg_alc_typ);
	
	/**
	 * メモ１. Memo 1.<p>
	 *
	 */
	public static final String $memo1 = "memo1";
	private static final MCPermColumnInfo _memo1 = createColumnInfo("memo1");
	public final MCStringPermColumn memo1 = createStringColumn(_memo1);
	
	/**
	 * メモ２. Memo 2.<p>
	 *
	 */
	public static final String $memo2 = "memo2";
	private static final MCPermColumnInfo _memo2 = createColumnInfo("memo2");
	public final MCStringPermColumn memo2 = createStringColumn(_memo2);
	
	/**
	 * メモ３. Memo 3.<p>
	 *
	 */
	public static final String $memo3 = "memo3";
	private static final MCPermColumnInfo _memo3 = createColumnInfo("memo3");
	public final MCStringPermColumn memo3 = createStringColumn(_memo3);
	
	/**
	 * 論理削除ＦＬＧ. Logical delete flg..<p>
	 *
	 */
	public static final String $del_flg = "del_flg";
	private static final MCPermColumnInfo _del_flg = createColumnInfo("del_flg");
	public final MCBooleanPermColumn del_flg = createBooleanColumn(_del_flg);
	
	/**
	 * 論理削除ユーザＩＤ. Logical delete user ID.<p>
	 *
	 */
	public static final String $del_usr_id = "del_usr_id";
	private static final MCPermColumnInfo _del_usr_id = createColumnInfo("del_usr_id");
	public final MCStringPermColumn del_usr_id = createStringColumn(_del_usr_id);
	
	/**
	 * 論理削除ユーザ名. Logical delete user name.<p>
	 *
	 */
	public static final String $del_usr_nm = "del_usr_nm";
	private static final MCPermColumnInfo _del_usr_nm = createColumnInfo("del_usr_nm");
	public final MCStringPermColumn del_usr_nm = createStringColumn(_del_usr_nm);
	
	/**
	 * 論理削除日時. Logical delete date and time.<p>
	 *
	 */
	public static final String $del_ts = "del_ts";
	private static final MCPermColumnInfo _del_ts = createColumnInfo("del_ts");
	public final MCTimestampPermColumn del_ts = createTimestampColumn(_del_ts);
	
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
	
	public static final MCMeta pre_alc_ptn_cd_META = createCommonMeta($pre_alc_ptn_cd, mcframe.commonMA.meta.MA_META.PRE_ALC_PTN_CD);
	public static final MCMeta pre_alc_ptn_nm_META = createCommonMeta($pre_alc_ptn_nm, mcframe.commonMA.meta.MA_META.PRE_ALC_PTN_NM);
	public static final MCMeta base_pre_alc_ptn_nm_META = createCommonMeta($base_pre_alc_ptn_nm, mcframe.commonMA.meta.MA_META.PRE_ALC_PTN_NM);
	public static final MCMeta dpt_alc_typ_META = createCommonMeta($dpt_alc_typ, mcframe.commonMA.meta.MA_META.PRE_ALC_TYP);
	public static final MCMeta loc_alc_typ_META = createCommonMeta($loc_alc_typ, mcframe.commonMA.meta.MA_META.PRE_ALC_TYP);
	public static final MCMeta oper_alc_typ_META = createCommonMeta($oper_alc_typ, mcframe.commonMA.meta.MA_META.PRE_ALC_TYP);
	public static final MCMeta bp_alc_typ_META = createCommonMeta($bp_alc_typ, mcframe.commonMA.meta.MA_META.PRE_ALC_TYP);
	public static final MCMeta ctg_alc_typ_META = createCommonMeta($ctg_alc_typ, mcframe.commonMA.meta.MA_META.PRE_ALC_TYP);
	public static final MCMeta itm_alc_typ_META = createCommonMeta($itm_alc_typ, mcframe.commonMA.meta.MA_META.PRE_ALC_TYP);
	public static final MCMeta lot_alc_typ_META = createCommonMeta($lot_alc_typ, mcframe.commonMA.meta.MA_META.PRE_ALC_TYP);
	public static final MCMeta sublot_alc_typ_META = createCommonMeta($sublot_alc_typ, mcframe.commonMA.meta.MA_META.PRE_ALC_TYP);
	public static final MCMeta sno1_alc_typ_META = createCommonMeta($sno1_alc_typ, mcframe.commonMA.meta.MA_META.PRE_ALC_TYP);
	public static final MCMeta sno2_alc_typ_META = createCommonMeta($sno2_alc_typ, mcframe.commonMA.meta.MA_META.PRE_ALC_TYP);
	public static final MCMeta sno3_alc_typ_META = createCommonMeta($sno3_alc_typ, mcframe.commonMA.meta.MA_META.PRE_ALC_TYP);
	public static final MCMeta sno4_alc_typ_META = createCommonMeta($sno4_alc_typ, mcframe.commonMA.meta.MA_META.PRE_ALC_TYP);
	public static final MCMeta inst_alc_typ_META = createCommonMeta($inst_alc_typ, mcframe.commonMA.meta.MA_META.PRE_ALC_TYP);
	public static final MCMeta iv_alc_typ_META = createCommonMeta($iv_alc_typ, mcframe.commonMA.meta.MA_META.PRE_ALC_TYP);
	public static final MCMeta po_alc_typ_META = createCommonMeta($po_alc_typ, mcframe.commonMA.meta.MA_META.PRE_ALC_TYP);
	public static final MCMeta slo_alc_typ_META = createCommonMeta($slo_alc_typ, mcframe.commonMA.meta.MA_META.PRE_ALC_TYP);
	public static final MCMeta alc_ac_alc_typ_META = createCommonMeta($alc_ac_alc_typ, mcframe.commonMA.meta.MA_META.PRE_ALC_TYP);
	public static final MCMeta wg_alc_typ_META = createCommonMeta($wg_alc_typ, mcframe.commonMA.meta.MA_META.PRE_ALC_TYP);
	public static final MCMeta memo1_META = createCommonMeta($memo1, mcframe.commonMA.meta.MA_META.MST_MEMO1);
	public static final MCMeta memo2_META = createCommonMeta($memo2, mcframe.commonMA.meta.MA_META.MST_MEMO2);
	public static final MCMeta memo3_META = createCommonMeta($memo3, mcframe.commonMA.meta.MA_META.MST_MEMO3);
	public static final MCMeta del_flg_META = createCommonMeta($del_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta del_usr_id_META = createCommonMeta($del_usr_id, mcframe.commonMA.meta.MA_META.FCM_USR_ID);
	public static final MCMeta del_usr_nm_META = createCommonMeta($del_usr_nm, mcframe.commonMA.meta.MA_META.FCM_USR_NM);
	public static final MCMeta del_ts_META = createCommonMeta($del_ts, mcframe.commonMA.meta.MA_META.SYS_TS);
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

	protected static final List<MCForeignInfo> FOREIGN_INFO_LIST = new ArrayList<>();
	static {
	}
	
	protected static final ConstMetaList<MAM_PRE_ALC_PTN_R> constMetas = new ConstMetaList<MAM_PRE_ALC_PTN_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			pre_alc_ptn_cd_META,
			pre_alc_ptn_nm_META,
			base_pre_alc_ptn_nm_META,
			dpt_alc_typ_META,
			loc_alc_typ_META,
			oper_alc_typ_META,
			bp_alc_typ_META,
			ctg_alc_typ_META,
			itm_alc_typ_META,
			lot_alc_typ_META,
			sublot_alc_typ_META,
			sno1_alc_typ_META,
			sno2_alc_typ_META,
			sno3_alc_typ_META,
			sno4_alc_typ_META,
			inst_alc_typ_META,
			iv_alc_typ_META,
			po_alc_typ_META,
			slo_alc_typ_META,
			alc_ac_alc_typ_META,
			wg_alc_typ_META,
			memo1_META,
			memo2_META,
			memo3_META,
			del_flg_META,
			del_usr_id_META,
			del_usr_nm_META,
			del_ts_META,
			ins_usr_id_META,
			ins_usr_nm_META,
			ins_ts_META,
			ins_func_id_META,
			upd_cntr_META,
			upd_usr_id_META,
			upd_usr_nm_META,
			upd_ts_META,
			upd_func_id_META,
			upd_srv_req_no_META
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
	protected MAM_PRE_ALC_PTN_R(ConstMetaList<? extends MAM_PRE_ALC_PTN_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MAM_PRE_ALC_PTN_R(ConstMetaList<? extends MAM_PRE_ALC_PTN_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MAM_PRE_ALC_PTN_R.$pre_alc_ptn_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_PRE_ALC_PTN_R.$pre_alc_ptn_cd,
				"pre_alc_ptn_cd",
				pre_alc_ptn_cd,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_PRE_ALC_PTN_R.$pre_alc_ptn_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_PRE_ALC_PTN_R.$pre_alc_ptn_nm,
				"pre_alc_ptn_nm",
				pre_alc_ptn_nm,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_PRE_ALC_PTN_R.$base_pre_alc_ptn_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_PRE_ALC_PTN_R.$base_pre_alc_ptn_nm,
				"base_pre_alc_ptn_nm",
				base_pre_alc_ptn_nm,
				false,
				false,
				true,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_PRE_ALC_PTN_R.$dpt_alc_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_PRE_ALC_PTN_R.$dpt_alc_typ,
				"dpt_alc_typ",
				dpt_alc_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_PRE_ALC_PTN_R.$loc_alc_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_PRE_ALC_PTN_R.$loc_alc_typ,
				"loc_alc_typ",
				loc_alc_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_PRE_ALC_PTN_R.$oper_alc_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_PRE_ALC_PTN_R.$oper_alc_typ,
				"oper_alc_typ",
				oper_alc_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_PRE_ALC_PTN_R.$bp_alc_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_PRE_ALC_PTN_R.$bp_alc_typ,
				"bp_alc_typ",
				bp_alc_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_PRE_ALC_PTN_R.$ctg_alc_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_PRE_ALC_PTN_R.$ctg_alc_typ,
				"ctg_alc_typ",
				ctg_alc_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_PRE_ALC_PTN_R.$itm_alc_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_PRE_ALC_PTN_R.$itm_alc_typ,
				"itm_alc_typ",
				itm_alc_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_PRE_ALC_PTN_R.$lot_alc_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_PRE_ALC_PTN_R.$lot_alc_typ,
				"lot_alc_typ",
				lot_alc_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_PRE_ALC_PTN_R.$sublot_alc_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_PRE_ALC_PTN_R.$sublot_alc_typ,
				"sublot_alc_typ",
				sublot_alc_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_PRE_ALC_PTN_R.$sno1_alc_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_PRE_ALC_PTN_R.$sno1_alc_typ,
				"sno1_alc_typ",
				sno1_alc_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_PRE_ALC_PTN_R.$sno2_alc_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_PRE_ALC_PTN_R.$sno2_alc_typ,
				"sno2_alc_typ",
				sno2_alc_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_PRE_ALC_PTN_R.$sno3_alc_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_PRE_ALC_PTN_R.$sno3_alc_typ,
				"sno3_alc_typ",
				sno3_alc_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_PRE_ALC_PTN_R.$sno4_alc_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_PRE_ALC_PTN_R.$sno4_alc_typ,
				"sno4_alc_typ",
				sno4_alc_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_PRE_ALC_PTN_R.$inst_alc_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_PRE_ALC_PTN_R.$inst_alc_typ,
				"inst_alc_typ",
				inst_alc_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_PRE_ALC_PTN_R.$iv_alc_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_PRE_ALC_PTN_R.$iv_alc_typ,
				"iv_alc_typ",
				iv_alc_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_PRE_ALC_PTN_R.$po_alc_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_PRE_ALC_PTN_R.$po_alc_typ,
				"po_alc_typ",
				po_alc_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_PRE_ALC_PTN_R.$slo_alc_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_PRE_ALC_PTN_R.$slo_alc_typ,
				"slo_alc_typ",
				slo_alc_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_PRE_ALC_PTN_R.$alc_ac_alc_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_PRE_ALC_PTN_R.$alc_ac_alc_typ,
				"alc_ac_alc_typ",
				alc_ac_alc_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_PRE_ALC_PTN_R.$wg_alc_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_PRE_ALC_PTN_R.$wg_alc_typ,
				"wg_alc_typ",
				wg_alc_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_PRE_ALC_PTN_R.$memo1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_PRE_ALC_PTN_R.$memo1,
				"memo1",
				memo1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_PRE_ALC_PTN_R.$memo2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_PRE_ALC_PTN_R.$memo2,
				"memo2",
				memo2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_PRE_ALC_PTN_R.$memo3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_PRE_ALC_PTN_R.$memo3,
				"memo3",
				memo3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_PRE_ALC_PTN_R.$del_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_PRE_ALC_PTN_R.$del_flg,
				"del_flg",
				del_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_PRE_ALC_PTN_R.$del_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_PRE_ALC_PTN_R.$del_usr_id,
				"del_usr_id",
				del_usr_id,
				false,
				true,
				true,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_PRE_ALC_PTN_R.$del_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_PRE_ALC_PTN_R.$del_usr_nm,
				"del_usr_nm",
				del_usr_nm,
				false,
				true,
				true,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_PRE_ALC_PTN_R.$del_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MAM_PRE_ALC_PTN_R.$del_ts,
				"del_ts",
				del_ts,
				false,
				true,
				true,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_PRE_ALC_PTN_R.$ins_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_PRE_ALC_PTN_R.$ins_usr_id,
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
			MAM_PRE_ALC_PTN_R.$ins_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_PRE_ALC_PTN_R.$ins_usr_nm,
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
			MAM_PRE_ALC_PTN_R.$ins_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MAM_PRE_ALC_PTN_R.$ins_ts,
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
			MAM_PRE_ALC_PTN_R.$ins_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_PRE_ALC_PTN_R.$ins_func_id,
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
			MAM_PRE_ALC_PTN_R.$upd_cntr,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_PRE_ALC_PTN_R.$upd_cntr,
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
			MAM_PRE_ALC_PTN_R.$upd_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_PRE_ALC_PTN_R.$upd_usr_id,
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
			MAM_PRE_ALC_PTN_R.$upd_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_PRE_ALC_PTN_R.$upd_usr_nm,
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
			MAM_PRE_ALC_PTN_R.$upd_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MAM_PRE_ALC_PTN_R.$upd_ts,
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
			MAM_PRE_ALC_PTN_R.$upd_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_PRE_ALC_PTN_R.$upd_func_id,
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
			MAM_PRE_ALC_PTN_R.$upd_srv_req_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_PRE_ALC_PTN_R.$upd_srv_req_no,
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
		return COLUMN_MAP;
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MAM_PRE_ALC_PTN_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MAM_PRE_ALC_PTN_R create(String alias) {
		MAM_PRE_ALC_PTN_R row = new MAM_PRE_ALC_PTN_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MAM_PRE_ALC_PTN_R createByName(T proto) {
		MAM_PRE_ALC_PTN_R row = MAM_PRE_ALC_PTN_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAM_PRE_ALC_PTN_R clone() {
		return (MAM_PRE_ALC_PTN_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAM_PRE_ALC_PTN_R createInstance() {
		return (MAM_PRE_ALC_PTN_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAM_PRE_ALC_PTN_R getValues(String... names) {
		return (MAM_PRE_ALC_PTN_R) super.getValues(names);
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
		return true;
	}

	/*
	 * MCDBContainerのオーバーライドメソッドです。
	 */
	 public MAW_PRE_ALC_PTN_KEY_R getPkWorkDbc(String alias) {
	 	return MAW_PRE_ALC_PTN_KEY_R.create(alias);
	 }

	/*
	 * MCDBContainerのオーバーライドメソッドです。
	 */
	 public MAW_PRE_ALC_PTN_KEY_R getPkWorkDbc() {
	 	return getPkWorkDbc(MAW_PRE_ALC_PTN_KEY_R.TABLE_NAME);
	 }

	/**
	 * 一次配賦パタンＣＤ. Departmental alloc. pattern cd..<p>
	 *
	 */
	public String pre_alc_ptn_cd() {
		return getConstString(offset + 0, $pre_alc_ptn_cd);
	}

	/**
	 * 一次配賦パタンＣＤ. Departmental alloc. pattern cd..<p>
	 *
	 */
	public void pre_alc_ptn_cd(String value) {
		setConstString(offset + 0, $pre_alc_ptn_cd, value);
	}

	/**
	 * 一次配賦パタン名. Departmental alloc. pattern name.<p>
	 *
	 */
	public String pre_alc_ptn_nm() {
		return getConstString(offset + 1, $pre_alc_ptn_nm);
	}

	/**
	 * 一次配賦パタン名. Departmental alloc. pattern name.<p>
	 *
	 */
	public void pre_alc_ptn_nm(String value) {
		setConstString(offset + 1, $pre_alc_ptn_nm, value);
	}

	/**
	 * 一次配賦パタン名（ベース）. Departmental alloc. pattern name(Base).<p>
	 *
	 */
	public String base_pre_alc_ptn_nm() {
		return getConstString(offset + 2, $base_pre_alc_ptn_nm);
	}

	/**
	 * 一次配賦パタン名（ベース）. Departmental alloc. pattern name(Base).<p>
	 *
	 */
	public void base_pre_alc_ptn_nm(String value) {
		setConstString(offset + 2, $base_pre_alc_ptn_nm, value);
	}

	/**
	 * 部門配賦区分. Dept. allocation type.<p>
	 *
	 */
	public String dpt_alc_typ() {
		return getConstString(offset + 3, $dpt_alc_typ);
	}

	/**
	 * 部門配賦区分. Dept. allocation type.<p>
	 *
	 */
	public void dpt_alc_typ(String value) {
		setConstString(offset + 3, $dpt_alc_typ, value);
	}

	/**
	 * 場所配賦区分. Location allocation type.<p>
	 *
	 */
	public String loc_alc_typ() {
		return getConstString(offset + 4, $loc_alc_typ);
	}

	/**
	 * 場所配賦区分. Location allocation type.<p>
	 *
	 */
	public void loc_alc_typ(String value) {
		setConstString(offset + 4, $loc_alc_typ, value);
	}

	/**
	 * 工程配賦区分. Operation allocation type.<p>
	 *
	 */
	public String oper_alc_typ() {
		return getConstString(offset + 5, $oper_alc_typ);
	}

	/**
	 * 工程配賦区分. Operation allocation type.<p>
	 *
	 */
	public void oper_alc_typ(String value) {
		setConstString(offset + 5, $oper_alc_typ, value);
	}

	/**
	 * 取引先配賦区分. BP allocation type.<p>
	 *
	 */
	public String bp_alc_typ() {
		return getConstString(offset + 6, $bp_alc_typ);
	}

	/**
	 * 取引先配賦区分. BP allocation type.<p>
	 *
	 */
	public void bp_alc_typ(String value) {
		setConstString(offset + 6, $bp_alc_typ, value);
	}

	/**
	 * 品群配賦区分. Item category allocation type.<p>
	 *
	 */
	public String ctg_alc_typ() {
		return getConstString(offset + 7, $ctg_alc_typ);
	}

	/**
	 * 品群配賦区分. Item category allocation type.<p>
	 *
	 */
	public void ctg_alc_typ(String value) {
		setConstString(offset + 7, $ctg_alc_typ, value);
	}

	/**
	 * 品目配賦区分. Item allocation type.<p>
	 *
	 */
	public String itm_alc_typ() {
		return getConstString(offset + 8, $itm_alc_typ);
	}

	/**
	 * 品目配賦区分. Item allocation type.<p>
	 *
	 */
	public void itm_alc_typ(String value) {
		setConstString(offset + 8, $itm_alc_typ, value);
	}

	/**
	 * ロットＮＯ配賦区分. Lot No. allocation type.<p>
	 *
	 */
	public String lot_alc_typ() {
		return getConstString(offset + 9, $lot_alc_typ);
	}

	/**
	 * ロットＮＯ配賦区分. Lot No. allocation type.<p>
	 *
	 */
	public void lot_alc_typ(String value) {
		setConstString(offset + 9, $lot_alc_typ, value);
	}

	/**
	 * サブロットＮＯ配賦区分. Sublot No. allocation type.<p>
	 *
	 */
	public String sublot_alc_typ() {
		return getConstString(offset + 10, $sublot_alc_typ);
	}

	/**
	 * サブロットＮＯ配賦区分. Sublot No. allocation type.<p>
	 *
	 */
	public void sublot_alc_typ(String value) {
		setConstString(offset + 10, $sublot_alc_typ, value);
	}

	/**
	 * 手配ＮＯ１配賦区分. SEIBAN No. 1 allocation type.<p>
	 *
	 */
	public String sno1_alc_typ() {
		return getConstString(offset + 11, $sno1_alc_typ);
	}

	/**
	 * 手配ＮＯ１配賦区分. SEIBAN No. 1 allocation type.<p>
	 *
	 */
	public void sno1_alc_typ(String value) {
		setConstString(offset + 11, $sno1_alc_typ, value);
	}

	/**
	 * 手配ＮＯ２配賦区分. SEIBAN No. 2 allocation type.<p>
	 *
	 */
	public String sno2_alc_typ() {
		return getConstString(offset + 12, $sno2_alc_typ);
	}

	/**
	 * 手配ＮＯ２配賦区分. SEIBAN No. 2 allocation type.<p>
	 *
	 */
	public void sno2_alc_typ(String value) {
		setConstString(offset + 12, $sno2_alc_typ, value);
	}

	/**
	 * 手配ＮＯ３配賦区分. SEIBAN No. 3 allocation type.<p>
	 *
	 */
	public String sno3_alc_typ() {
		return getConstString(offset + 13, $sno3_alc_typ);
	}

	/**
	 * 手配ＮＯ３配賦区分. SEIBAN No. 3 allocation type.<p>
	 *
	 */
	public void sno3_alc_typ(String value) {
		setConstString(offset + 13, $sno3_alc_typ, value);
	}

	/**
	 * 手配ＮＯ４配賦区分. SEIBAN No. 4 allocation type.<p>
	 *
	 */
	public String sno4_alc_typ() {
		return getConstString(offset + 14, $sno4_alc_typ);
	}

	/**
	 * 手配ＮＯ４配賦区分. SEIBAN No. 4 allocation type.<p>
	 *
	 */
	public void sno4_alc_typ(String value) {
		setConstString(offset + 14, $sno4_alc_typ, value);
	}

	/**
	 * 指図配賦区分. Order allocation type.<p>
	 *
	 */
	public String inst_alc_typ() {
		return getConstString(offset + 15, $inst_alc_typ);
	}

	/**
	 * 指図配賦区分. Order allocation type.<p>
	 *
	 */
	public void inst_alc_typ(String value) {
		setConstString(offset + 15, $inst_alc_typ, value);
	}

	/**
	 * インボイス配賦区分. Invoice allocation type.<p>
	 *
	 */
	public String iv_alc_typ() {
		return getConstString(offset + 16, $iv_alc_typ);
	}

	/**
	 * インボイス配賦区分. Invoice allocation type.<p>
	 *
	 */
	public void iv_alc_typ(String value) {
		setConstString(offset + 16, $iv_alc_typ, value);
	}

	/**
	 * 発注配賦区分. PO allocation type.<p>
	 *
	 */
	public String po_alc_typ() {
		return getConstString(offset + 17, $po_alc_typ);
	}

	/**
	 * 発注配賦区分. PO allocation type.<p>
	 *
	 */
	public void po_alc_typ(String value) {
		setConstString(offset + 17, $po_alc_typ, value);
	}

	/**
	 * 受注配賦区分. Sales order allocation type.<p>
	 *
	 */
	public String slo_alc_typ() {
		return getConstString(offset + 18, $slo_alc_typ);
	}

	/**
	 * 受注配賦区分. Sales order allocation type.<p>
	 *
	 */
	public void slo_alc_typ(String value) {
		setConstString(offset + 18, $slo_alc_typ, value);
	}

	/**
	 * 配賦科目配賦区分. Allocation account allocation type.<p>
	 *
	 */
	public String alc_ac_alc_typ() {
		return getConstString(offset + 19, $alc_ac_alc_typ);
	}

	/**
	 * 配賦科目配賦区分. Allocation account allocation type.<p>
	 *
	 */
	public void alc_ac_alc_typ(String value) {
		setConstString(offset + 19, $alc_ac_alc_typ, value);
	}

	/**
	 * ワーキンググループ配賦区分. WG allocation type.<p>
	 *
	 */
	public String wg_alc_typ() {
		return getConstString(offset + 20, $wg_alc_typ);
	}

	/**
	 * ワーキンググループ配賦区分. WG allocation type.<p>
	 *
	 */
	public void wg_alc_typ(String value) {
		setConstString(offset + 20, $wg_alc_typ, value);
	}

	/**
	 * メモ１. Memo 1.<p>
	 *
	 */
	public String memo1() {
		return getConstString(offset + 21, $memo1);
	}

	/**
	 * メモ１. Memo 1.<p>
	 *
	 */
	public void memo1(String value) {
		setConstString(offset + 21, $memo1, value);
	}

	/**
	 * メモ２. Memo 2.<p>
	 *
	 */
	public String memo2() {
		return getConstString(offset + 22, $memo2);
	}

	/**
	 * メモ２. Memo 2.<p>
	 *
	 */
	public void memo2(String value) {
		setConstString(offset + 22, $memo2, value);
	}

	/**
	 * メモ３. Memo 3.<p>
	 *
	 */
	public String memo3() {
		return getConstString(offset + 23, $memo3);
	}

	/**
	 * メモ３. Memo 3.<p>
	 *
	 */
	public void memo3(String value) {
		setConstString(offset + 23, $memo3, value);
	}

	/**
	 * 論理削除ＦＬＧ. Logical delete flg..<p>
	 *
	 */
	public boolean del_flg() {
		return getConstBoolean(offset + 24, $del_flg);
	}

	/**
	 * 論理削除ＦＬＧ. Logical delete flg..<p>
	 *
	 */
	public void del_flg(boolean value) {
		setConstBoolean(offset + 24, $del_flg, value);
	}

	/**
	 * 論理削除ユーザＩＤ. Logical delete user ID.<p>
	 *
	 */
	public String del_usr_id() {
		return getConstString(offset + 25, $del_usr_id);
	}

	/**
	 * 論理削除ユーザＩＤ. Logical delete user ID.<p>
	 *
	 */
	public void del_usr_id(String value) {
		setConstString(offset + 25, $del_usr_id, value);
	}

	/**
	 * 論理削除ユーザ名. Logical delete user name.<p>
	 *
	 */
	public String del_usr_nm() {
		return getConstString(offset + 26, $del_usr_nm);
	}

	/**
	 * 論理削除ユーザ名. Logical delete user name.<p>
	 *
	 */
	public void del_usr_nm(String value) {
		setConstString(offset + 26, $del_usr_nm, value);
	}

	/**
	 * 論理削除日時. Logical delete date and time.<p>
	 *
	 */
	public MCTimestamp del_ts() {
		return getConstTimestamp(offset + 27, $del_ts);
	}

	/**
	 * 論理削除日時. Logical delete date and time.<p>
	 *
	 */
	public void del_ts(MCTimestamp value) {
		setConstTimestamp(offset + 27, $del_ts, value);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 28, $ins_usr_id);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 28, $ins_usr_id, value);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 29, $ins_usr_nm);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 29, $ins_usr_nm, value);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 30, $ins_ts);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 30, $ins_ts, value);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 31, $ins_func_id);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 31, $ins_func_id, value);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 32, $upd_cntr);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 32, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 32, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 32, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 32, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 32, $upd_cntr, value);
	}
	
	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 33, $upd_usr_id);
	}

	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 33, $upd_usr_id, value);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 34, $upd_usr_nm);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 34, $upd_usr_nm, value);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 35, $upd_ts);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 35, $upd_ts, value);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 36, $upd_func_id);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 36, $upd_func_id, value);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 37, $upd_srv_req_no);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 37, $upd_srv_req_no, value);
	}

	public String getString(String name) {
		if ($pre_alc_ptn_cd.equalsIgnoreCase(name)) {
			return pre_alc_ptn_cd();
		}
		if ($pre_alc_ptn_nm.equalsIgnoreCase(name)) {
			return pre_alc_ptn_nm();
		}
		if ($base_pre_alc_ptn_nm.equalsIgnoreCase(name)) {
			return base_pre_alc_ptn_nm();
		}
		if ($dpt_alc_typ.equalsIgnoreCase(name)) {
			return dpt_alc_typ();
		}
		if ($loc_alc_typ.equalsIgnoreCase(name)) {
			return loc_alc_typ();
		}
		if ($oper_alc_typ.equalsIgnoreCase(name)) {
			return oper_alc_typ();
		}
		if ($bp_alc_typ.equalsIgnoreCase(name)) {
			return bp_alc_typ();
		}
		if ($ctg_alc_typ.equalsIgnoreCase(name)) {
			return ctg_alc_typ();
		}
		if ($itm_alc_typ.equalsIgnoreCase(name)) {
			return itm_alc_typ();
		}
		if ($lot_alc_typ.equalsIgnoreCase(name)) {
			return lot_alc_typ();
		}
		if ($sublot_alc_typ.equalsIgnoreCase(name)) {
			return sublot_alc_typ();
		}
		if ($sno1_alc_typ.equalsIgnoreCase(name)) {
			return sno1_alc_typ();
		}
		if ($sno2_alc_typ.equalsIgnoreCase(name)) {
			return sno2_alc_typ();
		}
		if ($sno3_alc_typ.equalsIgnoreCase(name)) {
			return sno3_alc_typ();
		}
		if ($sno4_alc_typ.equalsIgnoreCase(name)) {
			return sno4_alc_typ();
		}
		if ($inst_alc_typ.equalsIgnoreCase(name)) {
			return inst_alc_typ();
		}
		if ($iv_alc_typ.equalsIgnoreCase(name)) {
			return iv_alc_typ();
		}
		if ($po_alc_typ.equalsIgnoreCase(name)) {
			return po_alc_typ();
		}
		if ($slo_alc_typ.equalsIgnoreCase(name)) {
			return slo_alc_typ();
		}
		if ($alc_ac_alc_typ.equalsIgnoreCase(name)) {
			return alc_ac_alc_typ();
		}
		if ($wg_alc_typ.equalsIgnoreCase(name)) {
			return wg_alc_typ();
		}
		if ($memo1.equalsIgnoreCase(name)) {
			return memo1();
		}
		if ($memo2.equalsIgnoreCase(name)) {
			return memo2();
		}
		if ($memo3.equalsIgnoreCase(name)) {
			return memo3();
		}
		if ($del_usr_id.equalsIgnoreCase(name)) {
			return del_usr_id();
		}
		if ($del_usr_nm.equalsIgnoreCase(name)) {
			return del_usr_nm();
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
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumber(name);
	}

	public MCTimestamp getTimestamp(String name) {
		if ($del_ts.equalsIgnoreCase(name)) {
			return del_ts();
		}
		if ($ins_ts.equalsIgnoreCase(name)) {
			return ins_ts();
		}
		if ($upd_ts.equalsIgnoreCase(name)) {
			return upd_ts();
		}
		return super.getTimestamp(name);
	}

	public boolean getBoolean(String name) {
		if ($del_flg.equalsIgnoreCase(name)) {
			return del_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($pre_alc_ptn_cd.equalsIgnoreCase(name)) {
			return pre_alc_ptn_cd();
		}
		if ($pre_alc_ptn_nm.equalsIgnoreCase(name)) {
			return pre_alc_ptn_nm();
		}
		if ($base_pre_alc_ptn_nm.equalsIgnoreCase(name)) {
			return base_pre_alc_ptn_nm();
		}
		if ($dpt_alc_typ.equalsIgnoreCase(name)) {
			return dpt_alc_typ();
		}
		if ($loc_alc_typ.equalsIgnoreCase(name)) {
			return loc_alc_typ();
		}
		if ($oper_alc_typ.equalsIgnoreCase(name)) {
			return oper_alc_typ();
		}
		if ($bp_alc_typ.equalsIgnoreCase(name)) {
			return bp_alc_typ();
		}
		if ($ctg_alc_typ.equalsIgnoreCase(name)) {
			return ctg_alc_typ();
		}
		if ($itm_alc_typ.equalsIgnoreCase(name)) {
			return itm_alc_typ();
		}
		if ($lot_alc_typ.equalsIgnoreCase(name)) {
			return lot_alc_typ();
		}
		if ($sublot_alc_typ.equalsIgnoreCase(name)) {
			return sublot_alc_typ();
		}
		if ($sno1_alc_typ.equalsIgnoreCase(name)) {
			return sno1_alc_typ();
		}
		if ($sno2_alc_typ.equalsIgnoreCase(name)) {
			return sno2_alc_typ();
		}
		if ($sno3_alc_typ.equalsIgnoreCase(name)) {
			return sno3_alc_typ();
		}
		if ($sno4_alc_typ.equalsIgnoreCase(name)) {
			return sno4_alc_typ();
		}
		if ($inst_alc_typ.equalsIgnoreCase(name)) {
			return inst_alc_typ();
		}
		if ($iv_alc_typ.equalsIgnoreCase(name)) {
			return iv_alc_typ();
		}
		if ($po_alc_typ.equalsIgnoreCase(name)) {
			return po_alc_typ();
		}
		if ($slo_alc_typ.equalsIgnoreCase(name)) {
			return slo_alc_typ();
		}
		if ($alc_ac_alc_typ.equalsIgnoreCase(name)) {
			return alc_ac_alc_typ();
		}
		if ($wg_alc_typ.equalsIgnoreCase(name)) {
			return wg_alc_typ();
		}
		if ($memo1.equalsIgnoreCase(name)) {
			return memo1();
		}
		if ($memo2.equalsIgnoreCase(name)) {
			return memo2();
		}
		if ($memo3.equalsIgnoreCase(name)) {
			return memo3();
		}
		if ($del_usr_id.equalsIgnoreCase(name)) {
			return del_usr_id();
		}
		if ($del_usr_nm.equalsIgnoreCase(name)) {
			return del_usr_nm();
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
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumberNE(name);
	}

	public MCTimestamp getTimestampNE(String name) {
		if ($del_ts.equalsIgnoreCase(name)) {
			return del_ts();
		}
		if ($ins_ts.equalsIgnoreCase(name)) {
			return ins_ts();
		}
		if ($upd_ts.equalsIgnoreCase(name)) {
			return upd_ts();
		}
		return super.getTimestampNE(name);
	}

	public boolean getBooleanNE(String name) {
		if ($del_flg.equalsIgnoreCase(name)) {
			return del_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($pre_alc_ptn_cd.equalsIgnoreCase(name)) {
			pre_alc_ptn_cd(value);
			return;
		}
		if ($pre_alc_ptn_nm.equalsIgnoreCase(name)) {
			pre_alc_ptn_nm(value);
			return;
		}
		if ($base_pre_alc_ptn_nm.equalsIgnoreCase(name)) {
			base_pre_alc_ptn_nm(value);
			return;
		}
		if ($dpt_alc_typ.equalsIgnoreCase(name)) {
			dpt_alc_typ(value);
			return;
		}
		if ($loc_alc_typ.equalsIgnoreCase(name)) {
			loc_alc_typ(value);
			return;
		}
		if ($oper_alc_typ.equalsIgnoreCase(name)) {
			oper_alc_typ(value);
			return;
		}
		if ($bp_alc_typ.equalsIgnoreCase(name)) {
			bp_alc_typ(value);
			return;
		}
		if ($ctg_alc_typ.equalsIgnoreCase(name)) {
			ctg_alc_typ(value);
			return;
		}
		if ($itm_alc_typ.equalsIgnoreCase(name)) {
			itm_alc_typ(value);
			return;
		}
		if ($lot_alc_typ.equalsIgnoreCase(name)) {
			lot_alc_typ(value);
			return;
		}
		if ($sublot_alc_typ.equalsIgnoreCase(name)) {
			sublot_alc_typ(value);
			return;
		}
		if ($sno1_alc_typ.equalsIgnoreCase(name)) {
			sno1_alc_typ(value);
			return;
		}
		if ($sno2_alc_typ.equalsIgnoreCase(name)) {
			sno2_alc_typ(value);
			return;
		}
		if ($sno3_alc_typ.equalsIgnoreCase(name)) {
			sno3_alc_typ(value);
			return;
		}
		if ($sno4_alc_typ.equalsIgnoreCase(name)) {
			sno4_alc_typ(value);
			return;
		}
		if ($inst_alc_typ.equalsIgnoreCase(name)) {
			inst_alc_typ(value);
			return;
		}
		if ($iv_alc_typ.equalsIgnoreCase(name)) {
			iv_alc_typ(value);
			return;
		}
		if ($po_alc_typ.equalsIgnoreCase(name)) {
			po_alc_typ(value);
			return;
		}
		if ($slo_alc_typ.equalsIgnoreCase(name)) {
			slo_alc_typ(value);
			return;
		}
		if ($alc_ac_alc_typ.equalsIgnoreCase(name)) {
			alc_ac_alc_typ(value);
			return;
		}
		if ($wg_alc_typ.equalsIgnoreCase(name)) {
			wg_alc_typ(value);
			return;
		}
		if ($memo1.equalsIgnoreCase(name)) {
			memo1(value);
			return;
		}
		if ($memo2.equalsIgnoreCase(name)) {
			memo2(value);
			return;
		}
		if ($memo3.equalsIgnoreCase(name)) {
			memo3(value);
			return;
		}
		if ($del_usr_id.equalsIgnoreCase(name)) {
			del_usr_id(value);
			return;
		}
		if ($del_usr_nm.equalsIgnoreCase(name)) {
			del_usr_nm(value);
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
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, int value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, long value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, float value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, double value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setTimestamp(String name, MCTimestamp value) {
		if ($del_ts.equalsIgnoreCase(name)) {
			del_ts(value);
			return;
		}
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
		if ($del_flg.equalsIgnoreCase(name)) {
			del_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($pre_alc_ptn_cd.equalsIgnoreCase(name)) {
			pre_alc_ptn_cd(value);
			return;
		}
		if ($pre_alc_ptn_nm.equalsIgnoreCase(name)) {
			pre_alc_ptn_nm(value);
			return;
		}
		if ($base_pre_alc_ptn_nm.equalsIgnoreCase(name)) {
			base_pre_alc_ptn_nm(value);
			return;
		}
		if ($dpt_alc_typ.equalsIgnoreCase(name)) {
			dpt_alc_typ(value);
			return;
		}
		if ($loc_alc_typ.equalsIgnoreCase(name)) {
			loc_alc_typ(value);
			return;
		}
		if ($oper_alc_typ.equalsIgnoreCase(name)) {
			oper_alc_typ(value);
			return;
		}
		if ($bp_alc_typ.equalsIgnoreCase(name)) {
			bp_alc_typ(value);
			return;
		}
		if ($ctg_alc_typ.equalsIgnoreCase(name)) {
			ctg_alc_typ(value);
			return;
		}
		if ($itm_alc_typ.equalsIgnoreCase(name)) {
			itm_alc_typ(value);
			return;
		}
		if ($lot_alc_typ.equalsIgnoreCase(name)) {
			lot_alc_typ(value);
			return;
		}
		if ($sublot_alc_typ.equalsIgnoreCase(name)) {
			sublot_alc_typ(value);
			return;
		}
		if ($sno1_alc_typ.equalsIgnoreCase(name)) {
			sno1_alc_typ(value);
			return;
		}
		if ($sno2_alc_typ.equalsIgnoreCase(name)) {
			sno2_alc_typ(value);
			return;
		}
		if ($sno3_alc_typ.equalsIgnoreCase(name)) {
			sno3_alc_typ(value);
			return;
		}
		if ($sno4_alc_typ.equalsIgnoreCase(name)) {
			sno4_alc_typ(value);
			return;
		}
		if ($inst_alc_typ.equalsIgnoreCase(name)) {
			inst_alc_typ(value);
			return;
		}
		if ($iv_alc_typ.equalsIgnoreCase(name)) {
			iv_alc_typ(value);
			return;
		}
		if ($po_alc_typ.equalsIgnoreCase(name)) {
			po_alc_typ(value);
			return;
		}
		if ($slo_alc_typ.equalsIgnoreCase(name)) {
			slo_alc_typ(value);
			return;
		}
		if ($alc_ac_alc_typ.equalsIgnoreCase(name)) {
			alc_ac_alc_typ(value);
			return;
		}
		if ($wg_alc_typ.equalsIgnoreCase(name)) {
			wg_alc_typ(value);
			return;
		}
		if ($memo1.equalsIgnoreCase(name)) {
			memo1(value);
			return;
		}
		if ($memo2.equalsIgnoreCase(name)) {
			memo2(value);
			return;
		}
		if ($memo3.equalsIgnoreCase(name)) {
			memo3(value);
			return;
		}
		if ($del_usr_id.equalsIgnoreCase(name)) {
			del_usr_id(value);
			return;
		}
		if ($del_usr_nm.equalsIgnoreCase(name)) {
			del_usr_nm(value);
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
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, int value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, long value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, float value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, double value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setTimestampNE(String name, MCTimestamp value) {
		if ($del_ts.equalsIgnoreCase(name)) {
			del_ts(value);
			return;
		}
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
		if ($del_flg.equalsIgnoreCase(name)) {
			del_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

}
