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
 * "在庫補充マスタ // Inventory replenishment master"DBコンテナRowクラスです。<p>
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
 *  	<td>itm_cd</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>品目ＣＤ</td>
 *  	<td>Item cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>itm_sub1</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>枝番１</td>
 *  	<td>Branch No. 1</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>K</td>
 *  	<td>itm_sub2</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>枝番２</td>
 *  	<td>Branch No. 2</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>itm_sub3</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>枝番３</td>
 *  	<td>Branch No. 3</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>K</td>
 *  	<td>loc_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>場所ＣＤ</td>
 *  	<td>Location cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>st_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>適用開始日</td>
 *  	<td>Application start date</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>end_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>適用終了日</td>
 *  	<td>Application end date</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>buf_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>安全在庫数量</td>
 *  	<td>Fluctuation inventory qty.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>rord_stk_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>発注点在庫数量</td>
 *  	<td>Reorder point inventory qty.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>gi_schd_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>出庫予定含むＦＬＧ</td>
 *  	<td>GI schedule including flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>rord_rqst_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>発注点依頼数量</td>
 *  	<td>Reorder point request qty.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>lot_sizing_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>ロットサイジングＦＬＧ</td>
 *  	<td>Lot sizing flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>gi_loc_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>発注点出庫場所ＣＤ</td>
 *  	<td>GI location at reorder point cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>gi_str_ln_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>発注点出庫棚・ラインＣＤ</td>
 *  	<td>GI rack/line at reorder point cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>inpt_gi_loc_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>投入品出庫場所ＣＤ</td>
 *  	<td>Input item GI location cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>inpt_gi_str_ln_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>投入品出庫棚・ラインＣＤ</td>
 *  	<td>Input item GI rack/line cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ship_gi_loc_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>出荷品出庫場所ＣＤ</td>
 *  	<td>Shipping item GI location cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ship_gi_str_ln_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>出荷品出庫棚・ラインＣＤ</td>
 *  	<td>Shipping item GI rack/line cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>memo1</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>メモ１</td>
 *  	<td>Memo 1</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>memo2</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>メモ２</td>
 *  	<td>Memo 2</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>memo3</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>メモ３</td>
 *  	<td>Memo 3</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>del_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>論理削除ＦＬＧ</td>
 *  	<td>Logical delete flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>del_usr_id</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>論理削除ユーザＩＤ</td>
 *  	<td>Logical delete user ID</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>del_usr_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>論理削除ユーザ名</td>
 *  	<td>Logical delete user name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>del_ts</td>
 *  	<td>TS</td>
 *  	<td>0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>論理削除日時</td>
 *  	<td>Logical delete date and time</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ins_usr_id</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>登録ユーザＩＤ</td>
 *  	<td>Entry user ID</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ins_usr_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>登録ユーザ名</td>
 *  	<td>Entry user name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ins_ts</td>
 *  	<td>TS</td>
 *  	<td>0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>登録日時</td>
 *  	<td>Entry date and time</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ins_func_id</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>登録機能ＩＤ</td>
 *  	<td>Entry function ID</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>upd_cntr</td>
 *  	<td>N</td>
 *  	<td>9,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>更新カウンタ</td>
 *  	<td>Update counter</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>upd_usr_id</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>更新ユーザＩＤ</td>
 *  	<td>Update user ID</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>upd_usr_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>更新ユーザ名</td>
 *  	<td>Update user name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>upd_ts</td>
 *  	<td>TS</td>
 *  	<td>0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>更新日時</td>
 *  	<td>Update date and time</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>upd_func_id</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>更新機能ＩＤ</td>
 *  	<td>Update function ID</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>upd_srv_req_no</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>更新リクエストＮＯ</td>
 *  	<td>Update request No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>loc_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td>LOC1.LOC_NM</td>
 *  	<td>場所名</td>
 *  	<td>Location name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>gi_loc_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td>LOC2.LOC_NM</td>
 *  	<td>発注点出庫場所名</td>
 *  	<td>GI location at reorder point name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>gi_str_ln_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td>STR_LN1.STR_LN_NM</td>
 *  	<td>発注点出庫棚・ライン名</td>
 *  	<td>GI rack/line at reorder point name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>inpt_gi_loc_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td>LOC3.LOC_NM</td>
 *  	<td>投入品出庫場所名</td>
 *  	<td>Input item GI location name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>inpt_gi_str_ln_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td>STR_LN2.STR_LN_NM</td>
 *  	<td>投入品出庫棚・ライン名</td>
 *  	<td>Input item GI rack/line name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ship_gi_loc_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td>LOC4.LOC_NM</td>
 *  	<td>出荷品出庫場所名</td>
 *  	<td>Shipping item GI location name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ship_gi_str_ln_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td>STR_LN3.STR_LN_NM</td>
 *  	<td>出荷品出庫棚・ライン名</td>
 *  	<td>Shipping item GI rack/line name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>itm_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td>ITM1.ITM_NM</td>
 *  	<td>品名</td>
 *  	<td>Item name</td>
 *  </tr>
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
public class MAM_STK_RPL_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.CO_VIEW;

	public static final String TABLE_NAME = "MAM_STK_RPL";

	public static final boolean EX_CTRL = true;
	
	public static final boolean LCL_TABLE = false;
	
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
	 * 場所ＣＤ. Location cd..<p>
	 *
	 */
	public static final String $loc_cd = "loc_cd";
	private static final MCPermColumnInfo _loc_cd = createColumnInfo("loc_cd");
	public final MCStringPermColumn loc_cd = createStringColumn(_loc_cd);
	
	/**
	 * 適用開始日. Application start date.<p>
	 *
	 */
	public static final String $st_dt = "st_dt";
	private static final MCPermColumnInfo _st_dt = createColumnInfo("st_dt");
	public final MCDatePermColumn st_dt = createDateColumn(_st_dt);
	
	/**
	 * 適用終了日. Application end date.<p>
	 *
	 */
	public static final String $end_dt = "end_dt";
	private static final MCPermColumnInfo _end_dt = createColumnInfo("end_dt");
	public final MCDatePermColumn end_dt = createDateColumn(_end_dt);
	
	/**
	 * 安全在庫数量. Fluctuation inventory qty..<p>
	 *
	 */
	public static final String $buf_qty = "buf_qty";
	private static final MCPermColumnInfo _buf_qty = createColumnInfo("buf_qty");
	public final MCNumberPermColumn buf_qty = createNumberColumn(_buf_qty);
	
	/**
	 * 発注点在庫数量. Reorder point inventory qty..<p>
	 *
	 */
	public static final String $rord_stk_qty = "rord_stk_qty";
	private static final MCPermColumnInfo _rord_stk_qty = createColumnInfo("rord_stk_qty");
	public final MCNumberPermColumn rord_stk_qty = createNumberColumn(_rord_stk_qty);
	
	/**
	 * 出庫予定含むＦＬＧ. GI schedule including flg..<p>
	 *
	 */
	public static final String $gi_schd_flg = "gi_schd_flg";
	private static final MCPermColumnInfo _gi_schd_flg = createColumnInfo("gi_schd_flg");
	public final MCBooleanPermColumn gi_schd_flg = createBooleanColumn(_gi_schd_flg);
	
	/**
	 * 発注点依頼数量. Reorder point request qty..<p>
	 *
	 */
	public static final String $rord_rqst_qty = "rord_rqst_qty";
	private static final MCPermColumnInfo _rord_rqst_qty = createColumnInfo("rord_rqst_qty");
	public final MCNumberPermColumn rord_rqst_qty = createNumberColumn(_rord_rqst_qty);
	
	/**
	 * ロットサイジングＦＬＧ. Lot sizing flg..<p>
	 *
	 */
	public static final String $lot_sizing_flg = "lot_sizing_flg";
	private static final MCPermColumnInfo _lot_sizing_flg = createColumnInfo("lot_sizing_flg");
	public final MCBooleanPermColumn lot_sizing_flg = createBooleanColumn(_lot_sizing_flg);
	
	/**
	 * 発注点出庫場所ＣＤ. GI location at reorder point cd..<p>
	 *
	 */
	public static final String $gi_loc_cd = "gi_loc_cd";
	private static final MCPermColumnInfo _gi_loc_cd = createColumnInfo("gi_loc_cd");
	public final MCStringPermColumn gi_loc_cd = createStringColumn(_gi_loc_cd);
	
	/**
	 * 発注点出庫棚・ラインＣＤ. GI rack/line at reorder point cd..<p>
	 *
	 */
	public static final String $gi_str_ln_cd = "gi_str_ln_cd";
	private static final MCPermColumnInfo _gi_str_ln_cd = createColumnInfo("gi_str_ln_cd");
	public final MCStringPermColumn gi_str_ln_cd = createStringColumn(_gi_str_ln_cd);
	
	/**
	 * 投入品出庫場所ＣＤ. Input item GI location cd..<p>
	 *
	 */
	public static final String $inpt_gi_loc_cd = "inpt_gi_loc_cd";
	private static final MCPermColumnInfo _inpt_gi_loc_cd = createColumnInfo("inpt_gi_loc_cd");
	public final MCStringPermColumn inpt_gi_loc_cd = createStringColumn(_inpt_gi_loc_cd);
	
	/**
	 * 投入品出庫棚・ラインＣＤ. Input item GI rack/line cd..<p>
	 *
	 */
	public static final String $inpt_gi_str_ln_cd = "inpt_gi_str_ln_cd";
	private static final MCPermColumnInfo _inpt_gi_str_ln_cd = createColumnInfo("inpt_gi_str_ln_cd");
	public final MCStringPermColumn inpt_gi_str_ln_cd = createStringColumn(_inpt_gi_str_ln_cd);
	
	/**
	 * 出荷品出庫場所ＣＤ. Shipping item GI location cd..<p>
	 *
	 */
	public static final String $ship_gi_loc_cd = "ship_gi_loc_cd";
	private static final MCPermColumnInfo _ship_gi_loc_cd = createColumnInfo("ship_gi_loc_cd");
	public final MCStringPermColumn ship_gi_loc_cd = createStringColumn(_ship_gi_loc_cd);
	
	/**
	 * 出荷品出庫棚・ラインＣＤ. Shipping item GI rack/line cd..<p>
	 *
	 */
	public static final String $ship_gi_str_ln_cd = "ship_gi_str_ln_cd";
	private static final MCPermColumnInfo _ship_gi_str_ln_cd = createColumnInfo("ship_gi_str_ln_cd");
	public final MCStringPermColumn ship_gi_str_ln_cd = createStringColumn(_ship_gi_str_ln_cd);
	
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
	
	/**
	 * 場所名. Location name.<p>
	 *
	 */
	public static final String $loc_nm = "loc_nm";
	
	/**
	 * 発注点出庫場所名. GI location at reorder point name.<p>
	 *
	 */
	public static final String $gi_loc_nm = "gi_loc_nm";
	
	/**
	 * 発注点出庫棚・ライン名. GI rack/line at reorder point name.<p>
	 *
	 */
	public static final String $gi_str_ln_nm = "gi_str_ln_nm";
	
	/**
	 * 投入品出庫場所名. Input item GI location name.<p>
	 *
	 */
	public static final String $inpt_gi_loc_nm = "inpt_gi_loc_nm";
	
	/**
	 * 投入品出庫棚・ライン名. Input item GI rack/line name.<p>
	 *
	 */
	public static final String $inpt_gi_str_ln_nm = "inpt_gi_str_ln_nm";
	
	/**
	 * 出荷品出庫場所名. Shipping item GI location name.<p>
	 *
	 */
	public static final String $ship_gi_loc_nm = "ship_gi_loc_nm";
	
	/**
	 * 出荷品出庫棚・ライン名. Shipping item GI rack/line name.<p>
	 *
	 */
	public static final String $ship_gi_str_ln_nm = "ship_gi_str_ln_nm";
	
	/**
	 * 品名. Item name.<p>
	 *
	 */
	public static final String $itm_nm = "itm_nm";
	
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta loc_cd_META = createCommonMeta($loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta st_dt_META = createCommonMeta($st_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta end_dt_META = createCommonMeta($end_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta buf_qty_META = createCommonMeta($buf_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta rord_stk_qty_META = createCommonMeta($rord_stk_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta gi_schd_flg_META = createCommonMeta($gi_schd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rord_rqst_qty_META = createCommonMeta($rord_rqst_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta lot_sizing_flg_META = createCommonMeta($lot_sizing_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta gi_loc_cd_META = createCommonMeta($gi_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta gi_str_ln_cd_META = createCommonMeta($gi_str_ln_cd, mcframe.commonMA.meta.MA_META.STR_LN_CD);
	public static final MCMeta inpt_gi_loc_cd_META = createCommonMeta($inpt_gi_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta inpt_gi_str_ln_cd_META = createCommonMeta($inpt_gi_str_ln_cd, mcframe.commonMA.meta.MA_META.STR_LN_CD);
	public static final MCMeta ship_gi_loc_cd_META = createCommonMeta($ship_gi_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta ship_gi_str_ln_cd_META = createCommonMeta($ship_gi_str_ln_cd, mcframe.commonMA.meta.MA_META.STR_LN_CD);
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
	public static final MCMeta loc_nm_META = createCommonMeta($loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta gi_loc_nm_META = createCommonMeta($gi_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta gi_str_ln_nm_META = createCommonMeta($gi_str_ln_nm, mcframe.commonMA.meta.MA_META.STR_LN_NM);
	public static final MCMeta inpt_gi_loc_nm_META = createCommonMeta($inpt_gi_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta inpt_gi_str_ln_nm_META = createCommonMeta($inpt_gi_str_ln_nm, mcframe.commonMA.meta.MA_META.STR_LN_NM);
	public static final MCMeta ship_gi_loc_nm_META = createCommonMeta($ship_gi_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta ship_gi_str_ln_nm_META = createCommonMeta($ship_gi_str_ln_nm, mcframe.commonMA.meta.MA_META.STR_LN_NM);
	public static final MCMeta itm_nm_META = createCommonMeta($itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);

	protected static final List<MCForeignInfo> FOREIGN_INFO_LIST = new ArrayList<>();
	public static final String $LOC1 = "LOC1";
	public static final String $LOC2 = "LOC2";
	public static final String $STR_LN1 = "STR_LN1";
	public static final String $LOC3 = "LOC3";
	public static final String $STR_LN2 = "STR_LN2";
	public static final String $LOC4 = "LOC4";
	public static final String $STR_LN3 = "STR_LN3";
	public static final String $ITM1 = "ITM1";
	static {
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_LOC",
				$LOC1,
				new String[][]{
						{"loc_cd", "loc_cd"}
				},
				() -> {
					return mcframe.serverMA.dbc.MAM_LOC_R.create("LOC1");
				},
				(alias) -> {
					MAM_STK_RPL_R own = MAM_STK_RPL_R.create(alias);
					mcframe.serverMA.dbc.MAM_LOC_R ref = mcframe.serverMA.dbc.MAM_LOC_R.create("LOC1");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.loc_cd.eq(ref.loc_cd));
					return cond;
				}
			)
		);
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_LOC",
				$LOC2,
				new String[][]{
						{"gi_loc_cd", "loc_cd"}
				},
				() -> {
					return mcframe.serverMA.dbc.MAM_LOC_R.create("LOC2");
				},
				(alias) -> {
					MAM_STK_RPL_R own = MAM_STK_RPL_R.create(alias);
					mcframe.serverMA.dbc.MAM_LOC_R ref = mcframe.serverMA.dbc.MAM_LOC_R.create("LOC2");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.gi_loc_cd.eq(ref.loc_cd));
					return cond;
				}
			)
		);
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_STR_LN",
				$STR_LN1,
				new String[][]{
						{"gi_loc_cd", "loc_cd"},
						{"gi_str_ln_cd", "str_ln_cd"}
				},
				() -> {
					return mcframe.serverMA.dbc.MAM_STR_LN_R.create("STR_LN1");
				},
				(alias) -> {
					MAM_STK_RPL_R own = MAM_STK_RPL_R.create(alias);
					mcframe.serverMA.dbc.MAM_STR_LN_R ref = mcframe.serverMA.dbc.MAM_STR_LN_R.create("STR_LN1");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.gi_loc_cd.eq(ref.loc_cd));
					cond = cond.and(own.gi_str_ln_cd.eq(ref.str_ln_cd));
					return cond;
				}
			)
		);
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_LOC",
				$LOC3,
				new String[][]{
						{"inpt_gi_loc_cd", "loc_cd"}
				},
				() -> {
					return mcframe.serverMA.dbc.MAM_LOC_R.create("LOC3");
				},
				(alias) -> {
					MAM_STK_RPL_R own = MAM_STK_RPL_R.create(alias);
					mcframe.serverMA.dbc.MAM_LOC_R ref = mcframe.serverMA.dbc.MAM_LOC_R.create("LOC3");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.inpt_gi_loc_cd.eq(ref.loc_cd));
					return cond;
				}
			)
		);
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_STR_LN",
				$STR_LN2,
				new String[][]{
						{"inpt_gi_loc_cd", "loc_cd"},
						{"inpt_gi_str_ln_cd", "str_ln_cd"}
				},
				() -> {
					return mcframe.serverMA.dbc.MAM_STR_LN_R.create("STR_LN2");
				},
				(alias) -> {
					MAM_STK_RPL_R own = MAM_STK_RPL_R.create(alias);
					mcframe.serverMA.dbc.MAM_STR_LN_R ref = mcframe.serverMA.dbc.MAM_STR_LN_R.create("STR_LN2");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.inpt_gi_loc_cd.eq(ref.loc_cd));
					cond = cond.and(own.inpt_gi_str_ln_cd.eq(ref.str_ln_cd));
					return cond;
				}
			)
		);
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_LOC",
				$LOC4,
				new String[][]{
						{"ship_gi_loc_cd", "loc_cd"}
				},
				() -> {
					return mcframe.serverMA.dbc.MAM_LOC_R.create("LOC4");
				},
				(alias) -> {
					MAM_STK_RPL_R own = MAM_STK_RPL_R.create(alias);
					mcframe.serverMA.dbc.MAM_LOC_R ref = mcframe.serverMA.dbc.MAM_LOC_R.create("LOC4");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.ship_gi_loc_cd.eq(ref.loc_cd));
					return cond;
				}
			)
		);
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_STR_LN",
				$STR_LN3,
				new String[][]{
						{"ship_gi_loc_cd", "loc_cd"},
						{"ship_gi_str_ln_cd", "str_ln_cd"}
				},
				() -> {
					return mcframe.serverMA.dbc.MAM_STR_LN_R.create("STR_LN3");
				},
				(alias) -> {
					MAM_STK_RPL_R own = MAM_STK_RPL_R.create(alias);
					mcframe.serverMA.dbc.MAM_STR_LN_R ref = mcframe.serverMA.dbc.MAM_STR_LN_R.create("STR_LN3");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.ship_gi_loc_cd.eq(ref.loc_cd));
					cond = cond.and(own.ship_gi_str_ln_cd.eq(ref.str_ln_cd));
					return cond;
				}
			)
		);
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_ITM_",
				$ITM1,
				new String[][]{
						{"itm_cd", "itm_cd"},
						{"itm_sub1", "itm_sub1"},
						{"itm_sub2", "itm_sub2"},
						{"itm_sub3", "itm_sub3"}
				},
				() -> {
					return mcframe.serverMA.dbc.MAM_ITM__R.create("ITM1");
				},
				(alias) -> {
					MAM_STK_RPL_R own = MAM_STK_RPL_R.create(alias);
					mcframe.serverMA.dbc.MAM_ITM__R ref = mcframe.serverMA.dbc.MAM_ITM__R.create("ITM1");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.itm_cd.eq(ref.itm_cd));
					cond = cond.and(own.itm_sub1.eq(ref.itm_sub1));
					cond = cond.and(own.itm_sub2.eq(ref.itm_sub2));
					cond = cond.and(own.itm_sub3.eq(ref.itm_sub3));
					return cond;
				}
			)
		);
	}
	
	protected static final ConstMetaList<MAM_STK_RPL_R> constMetas = new ConstMetaList<MAM_STK_RPL_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			loc_cd_META,
			st_dt_META,
			end_dt_META,
			buf_qty_META,
			rord_stk_qty_META,
			gi_schd_flg_META,
			rord_rqst_qty_META,
			lot_sizing_flg_META,
			gi_loc_cd_META,
			gi_str_ln_cd_META,
			inpt_gi_loc_cd_META,
			inpt_gi_str_ln_cd_META,
			ship_gi_loc_cd_META,
			ship_gi_str_ln_cd_META,
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
			upd_srv_req_no_META,
			loc_nm_META,
			gi_loc_nm_META,
			gi_str_ln_nm_META,
			inpt_gi_loc_nm_META,
			inpt_gi_str_ln_nm_META,
			ship_gi_loc_nm_META,
			ship_gi_str_ln_nm_META,
			itm_nm_META
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
	protected MAM_STK_RPL_R(ConstMetaList<? extends MAM_STK_RPL_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MAM_STK_RPL_R(ConstMetaList<? extends MAM_STK_RPL_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MAM_STK_RPL_R.$itm_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_STK_RPL_R.$itm_cd,
				"itm_cd",
				itm_cd,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_STK_RPL_R.$itm_sub1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_STK_RPL_R.$itm_sub1,
				"itm_sub1",
				itm_sub1,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_STK_RPL_R.$itm_sub2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_STK_RPL_R.$itm_sub2,
				"itm_sub2",
				itm_sub2,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_STK_RPL_R.$itm_sub3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_STK_RPL_R.$itm_sub3,
				"itm_sub3",
				itm_sub3,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_STK_RPL_R.$loc_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_STK_RPL_R.$loc_cd,
				"loc_cd",
				loc_cd,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_STK_RPL_R.$st_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MAM_STK_RPL_R.$st_dt,
				"st_dt",
				st_dt,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_STK_RPL_R.$end_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MAM_STK_RPL_R.$end_dt,
				"end_dt",
				end_dt,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_STK_RPL_R.$buf_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_STK_RPL_R.$buf_qty,
				"buf_qty",
				buf_qty,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_STK_RPL_R.$rord_stk_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_STK_RPL_R.$rord_stk_qty,
				"rord_stk_qty",
				rord_stk_qty,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_STK_RPL_R.$gi_schd_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_STK_RPL_R.$gi_schd_flg,
				"gi_schd_flg",
				gi_schd_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_STK_RPL_R.$rord_rqst_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_STK_RPL_R.$rord_rqst_qty,
				"rord_rqst_qty",
				rord_rqst_qty,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_STK_RPL_R.$lot_sizing_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_STK_RPL_R.$lot_sizing_flg,
				"lot_sizing_flg",
				lot_sizing_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_STK_RPL_R.$gi_loc_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_STK_RPL_R.$gi_loc_cd,
				"gi_loc_cd",
				gi_loc_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_STK_RPL_R.$gi_str_ln_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_STK_RPL_R.$gi_str_ln_cd,
				"gi_str_ln_cd",
				gi_str_ln_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_STK_RPL_R.$inpt_gi_loc_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_STK_RPL_R.$inpt_gi_loc_cd,
				"inpt_gi_loc_cd",
				inpt_gi_loc_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_STK_RPL_R.$inpt_gi_str_ln_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_STK_RPL_R.$inpt_gi_str_ln_cd,
				"inpt_gi_str_ln_cd",
				inpt_gi_str_ln_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_STK_RPL_R.$ship_gi_loc_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_STK_RPL_R.$ship_gi_loc_cd,
				"ship_gi_loc_cd",
				ship_gi_loc_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_STK_RPL_R.$ship_gi_str_ln_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_STK_RPL_R.$ship_gi_str_ln_cd,
				"ship_gi_str_ln_cd",
				ship_gi_str_ln_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_STK_RPL_R.$memo1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_STK_RPL_R.$memo1,
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
			MAM_STK_RPL_R.$memo2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_STK_RPL_R.$memo2,
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
			MAM_STK_RPL_R.$memo3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_STK_RPL_R.$memo3,
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
			MAM_STK_RPL_R.$del_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_STK_RPL_R.$del_flg,
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
			MAM_STK_RPL_R.$del_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_STK_RPL_R.$del_usr_id,
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
			MAM_STK_RPL_R.$del_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_STK_RPL_R.$del_usr_nm,
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
			MAM_STK_RPL_R.$del_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MAM_STK_RPL_R.$del_ts,
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
			MAM_STK_RPL_R.$ins_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_STK_RPL_R.$ins_usr_id,
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
			MAM_STK_RPL_R.$ins_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_STK_RPL_R.$ins_usr_nm,
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
			MAM_STK_RPL_R.$ins_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MAM_STK_RPL_R.$ins_ts,
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
			MAM_STK_RPL_R.$ins_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_STK_RPL_R.$ins_func_id,
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
			MAM_STK_RPL_R.$upd_cntr,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_STK_RPL_R.$upd_cntr,
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
			MAM_STK_RPL_R.$upd_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_STK_RPL_R.$upd_usr_id,
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
			MAM_STK_RPL_R.$upd_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_STK_RPL_R.$upd_usr_nm,
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
			MAM_STK_RPL_R.$upd_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MAM_STK_RPL_R.$upd_ts,
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
			MAM_STK_RPL_R.$upd_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_STK_RPL_R.$upd_func_id,
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
			MAM_STK_RPL_R.$upd_srv_req_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_STK_RPL_R.$upd_srv_req_no,
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
			MAM_STK_RPL_R.$loc_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_STK_RPL_R.$loc_nm,
				"loc_nm",
				null,
				false,
				true,
				false,
				false,
				true,
				"LOC1.LOC_NM"
			)
		);
		COLUMN_MAP.put(
			MAM_STK_RPL_R.$gi_loc_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_STK_RPL_R.$gi_loc_nm,
				"gi_loc_nm",
				null,
				false,
				true,
				false,
				false,
				true,
				"LOC2.LOC_NM"
			)
		);
		COLUMN_MAP.put(
			MAM_STK_RPL_R.$gi_str_ln_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_STK_RPL_R.$gi_str_ln_nm,
				"gi_str_ln_nm",
				null,
				false,
				true,
				false,
				false,
				true,
				"STR_LN1.STR_LN_NM"
			)
		);
		COLUMN_MAP.put(
			MAM_STK_RPL_R.$inpt_gi_loc_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_STK_RPL_R.$inpt_gi_loc_nm,
				"inpt_gi_loc_nm",
				null,
				false,
				true,
				false,
				false,
				true,
				"LOC3.LOC_NM"
			)
		);
		COLUMN_MAP.put(
			MAM_STK_RPL_R.$inpt_gi_str_ln_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_STK_RPL_R.$inpt_gi_str_ln_nm,
				"inpt_gi_str_ln_nm",
				null,
				false,
				true,
				false,
				false,
				true,
				"STR_LN2.STR_LN_NM"
			)
		);
		COLUMN_MAP.put(
			MAM_STK_RPL_R.$ship_gi_loc_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_STK_RPL_R.$ship_gi_loc_nm,
				"ship_gi_loc_nm",
				null,
				false,
				true,
				false,
				false,
				true,
				"LOC4.LOC_NM"
			)
		);
		COLUMN_MAP.put(
			MAM_STK_RPL_R.$ship_gi_str_ln_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_STK_RPL_R.$ship_gi_str_ln_nm,
				"ship_gi_str_ln_nm",
				null,
				false,
				true,
				false,
				false,
				true,
				"STR_LN3.STR_LN_NM"
			)
		);
		COLUMN_MAP.put(
			MAM_STK_RPL_R.$itm_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_STK_RPL_R.$itm_nm,
				"itm_nm",
				null,
				false,
				true,
				false,
				false,
				true,
				"ITM1.ITM_NM"
			)
		);
		return COLUMN_MAP;
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MAM_STK_RPL_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MAM_STK_RPL_R create(String alias) {
		MAM_STK_RPL_R row = new MAM_STK_RPL_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MAM_STK_RPL_R createByName(T proto) {
		MAM_STK_RPL_R row = MAM_STK_RPL_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAM_STK_RPL_R clone() {
		return (MAM_STK_RPL_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAM_STK_RPL_R createInstance() {
		return (MAM_STK_RPL_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAM_STK_RPL_R getValues(String... names) {
		return (MAM_STK_RPL_R) super.getValues(names);
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
	 public MAW_STK_RPL_KEY_R getPkWorkDbc(String alias) {
	 	return MAW_STK_RPL_KEY_R.create(alias);
	 }

	/*
	 * MCDBContainerのオーバーライドメソッドです。
	 */
	 public MAW_STK_RPL_KEY_R getPkWorkDbc() {
	 	return getPkWorkDbc(MAW_STK_RPL_KEY_R.TABLE_NAME);
	 }

	/**
	 * 品目ＣＤ. Item cd..<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 0, $itm_cd);
	}

	/**
	 * 品目ＣＤ. Item cd..<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 0, $itm_cd, value);
	}

	/**
	 * 枝番１. Branch No. 1.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 1, $itm_sub1);
	}

	/**
	 * 枝番１. Branch No. 1.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 1, $itm_sub1, value);
	}

	/**
	 * 枝番２. Branch No. 2.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 2, $itm_sub2);
	}

	/**
	 * 枝番２. Branch No. 2.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 2, $itm_sub2, value);
	}

	/**
	 * 枝番３. Branch No. 3.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 3, $itm_sub3);
	}

	/**
	 * 枝番３. Branch No. 3.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 3, $itm_sub3, value);
	}

	/**
	 * 場所ＣＤ. Location cd..<p>
	 *
	 */
	public String loc_cd() {
		return getConstString(offset + 4, $loc_cd);
	}

	/**
	 * 場所ＣＤ. Location cd..<p>
	 *
	 */
	public void loc_cd(String value) {
		setConstString(offset + 4, $loc_cd, value);
	}

	/**
	 * 適用開始日. Application start date.<p>
	 *
	 */
	public MCDate st_dt() {
		return getConstDate(offset + 5, $st_dt);
	}

	/**
	 * 適用開始日. Application start date.<p>
	 *
	 */
	public void st_dt(MCDate value) {
		setConstDate(offset + 5, $st_dt, value);
	}

	/**
	 * 適用終了日. Application end date.<p>
	 *
	 */
	public MCDate end_dt() {
		return getConstDate(offset + 6, $end_dt);
	}

	/**
	 * 適用終了日. Application end date.<p>
	 *
	 */
	public void end_dt(MCDate value) {
		setConstDate(offset + 6, $end_dt, value);
	}

	/**
	 * 安全在庫数量. Fluctuation inventory qty..<p>
	 *
	 */
	public MCNumber buf_qty() {
		return getConstNumber(offset + 7, $buf_qty);
	}

	/**
	 * 安全在庫数量. Fluctuation inventory qty..<p>
	 *
	 */
	public void buf_qty(MCNumber value) {
		setConstNumber(offset + 7, $buf_qty, value);
	}
	
	/**
	 * 安全在庫数量. Fluctuation inventory qty..<p>
	 *
	 */
	public void buf_qty(int value) {
		setConstNumber(offset + 7, $buf_qty, value);
	}
	
	/**
	 * 安全在庫数量. Fluctuation inventory qty..<p>
	 *
	 */
	public void buf_qty(long value) {
		setConstNumber(offset + 7, $buf_qty, value);
	}
	
	/**
	 * 安全在庫数量. Fluctuation inventory qty..<p>
	 *
	 */
	public void buf_qty(float value) {
		setConstNumber(offset + 7, $buf_qty, value);
	}
	
	/**
	 * 安全在庫数量. Fluctuation inventory qty..<p>
	 *
	 */
	public void buf_qty(double value) {
		setConstNumber(offset + 7, $buf_qty, value);
	}
	
	/**
	 * 発注点在庫数量. Reorder point inventory qty..<p>
	 *
	 */
	public MCNumber rord_stk_qty() {
		return getConstNumber(offset + 8, $rord_stk_qty);
	}

	/**
	 * 発注点在庫数量. Reorder point inventory qty..<p>
	 *
	 */
	public void rord_stk_qty(MCNumber value) {
		setConstNumber(offset + 8, $rord_stk_qty, value);
	}
	
	/**
	 * 発注点在庫数量. Reorder point inventory qty..<p>
	 *
	 */
	public void rord_stk_qty(int value) {
		setConstNumber(offset + 8, $rord_stk_qty, value);
	}
	
	/**
	 * 発注点在庫数量. Reorder point inventory qty..<p>
	 *
	 */
	public void rord_stk_qty(long value) {
		setConstNumber(offset + 8, $rord_stk_qty, value);
	}
	
	/**
	 * 発注点在庫数量. Reorder point inventory qty..<p>
	 *
	 */
	public void rord_stk_qty(float value) {
		setConstNumber(offset + 8, $rord_stk_qty, value);
	}
	
	/**
	 * 発注点在庫数量. Reorder point inventory qty..<p>
	 *
	 */
	public void rord_stk_qty(double value) {
		setConstNumber(offset + 8, $rord_stk_qty, value);
	}
	
	/**
	 * 出庫予定含むＦＬＧ. GI schedule including flg..<p>
	 *
	 */
	public boolean gi_schd_flg() {
		return getConstBoolean(offset + 9, $gi_schd_flg);
	}

	/**
	 * 出庫予定含むＦＬＧ. GI schedule including flg..<p>
	 *
	 */
	public void gi_schd_flg(boolean value) {
		setConstBoolean(offset + 9, $gi_schd_flg, value);
	}

	/**
	 * 発注点依頼数量. Reorder point request qty..<p>
	 *
	 */
	public MCNumber rord_rqst_qty() {
		return getConstNumber(offset + 10, $rord_rqst_qty);
	}

	/**
	 * 発注点依頼数量. Reorder point request qty..<p>
	 *
	 */
	public void rord_rqst_qty(MCNumber value) {
		setConstNumber(offset + 10, $rord_rqst_qty, value);
	}
	
	/**
	 * 発注点依頼数量. Reorder point request qty..<p>
	 *
	 */
	public void rord_rqst_qty(int value) {
		setConstNumber(offset + 10, $rord_rqst_qty, value);
	}
	
	/**
	 * 発注点依頼数量. Reorder point request qty..<p>
	 *
	 */
	public void rord_rqst_qty(long value) {
		setConstNumber(offset + 10, $rord_rqst_qty, value);
	}
	
	/**
	 * 発注点依頼数量. Reorder point request qty..<p>
	 *
	 */
	public void rord_rqst_qty(float value) {
		setConstNumber(offset + 10, $rord_rqst_qty, value);
	}
	
	/**
	 * 発注点依頼数量. Reorder point request qty..<p>
	 *
	 */
	public void rord_rqst_qty(double value) {
		setConstNumber(offset + 10, $rord_rqst_qty, value);
	}
	
	/**
	 * ロットサイジングＦＬＧ. Lot sizing flg..<p>
	 *
	 */
	public boolean lot_sizing_flg() {
		return getConstBoolean(offset + 11, $lot_sizing_flg);
	}

	/**
	 * ロットサイジングＦＬＧ. Lot sizing flg..<p>
	 *
	 */
	public void lot_sizing_flg(boolean value) {
		setConstBoolean(offset + 11, $lot_sizing_flg, value);
	}

	/**
	 * 発注点出庫場所ＣＤ. GI location at reorder point cd..<p>
	 *
	 */
	public String gi_loc_cd() {
		return getConstString(offset + 12, $gi_loc_cd);
	}

	/**
	 * 発注点出庫場所ＣＤ. GI location at reorder point cd..<p>
	 *
	 */
	public void gi_loc_cd(String value) {
		setConstString(offset + 12, $gi_loc_cd, value);
	}

	/**
	 * 発注点出庫棚・ラインＣＤ. GI rack/line at reorder point cd..<p>
	 *
	 */
	public String gi_str_ln_cd() {
		return getConstString(offset + 13, $gi_str_ln_cd);
	}

	/**
	 * 発注点出庫棚・ラインＣＤ. GI rack/line at reorder point cd..<p>
	 *
	 */
	public void gi_str_ln_cd(String value) {
		setConstString(offset + 13, $gi_str_ln_cd, value);
	}

	/**
	 * 投入品出庫場所ＣＤ. Input item GI location cd..<p>
	 *
	 */
	public String inpt_gi_loc_cd() {
		return getConstString(offset + 14, $inpt_gi_loc_cd);
	}

	/**
	 * 投入品出庫場所ＣＤ. Input item GI location cd..<p>
	 *
	 */
	public void inpt_gi_loc_cd(String value) {
		setConstString(offset + 14, $inpt_gi_loc_cd, value);
	}

	/**
	 * 投入品出庫棚・ラインＣＤ. Input item GI rack/line cd..<p>
	 *
	 */
	public String inpt_gi_str_ln_cd() {
		return getConstString(offset + 15, $inpt_gi_str_ln_cd);
	}

	/**
	 * 投入品出庫棚・ラインＣＤ. Input item GI rack/line cd..<p>
	 *
	 */
	public void inpt_gi_str_ln_cd(String value) {
		setConstString(offset + 15, $inpt_gi_str_ln_cd, value);
	}

	/**
	 * 出荷品出庫場所ＣＤ. Shipping item GI location cd..<p>
	 *
	 */
	public String ship_gi_loc_cd() {
		return getConstString(offset + 16, $ship_gi_loc_cd);
	}

	/**
	 * 出荷品出庫場所ＣＤ. Shipping item GI location cd..<p>
	 *
	 */
	public void ship_gi_loc_cd(String value) {
		setConstString(offset + 16, $ship_gi_loc_cd, value);
	}

	/**
	 * 出荷品出庫棚・ラインＣＤ. Shipping item GI rack/line cd..<p>
	 *
	 */
	public String ship_gi_str_ln_cd() {
		return getConstString(offset + 17, $ship_gi_str_ln_cd);
	}

	/**
	 * 出荷品出庫棚・ラインＣＤ. Shipping item GI rack/line cd..<p>
	 *
	 */
	public void ship_gi_str_ln_cd(String value) {
		setConstString(offset + 17, $ship_gi_str_ln_cd, value);
	}

	/**
	 * メモ１. Memo 1.<p>
	 *
	 */
	public String memo1() {
		return getConstString(offset + 18, $memo1);
	}

	/**
	 * メモ１. Memo 1.<p>
	 *
	 */
	public void memo1(String value) {
		setConstString(offset + 18, $memo1, value);
	}

	/**
	 * メモ２. Memo 2.<p>
	 *
	 */
	public String memo2() {
		return getConstString(offset + 19, $memo2);
	}

	/**
	 * メモ２. Memo 2.<p>
	 *
	 */
	public void memo2(String value) {
		setConstString(offset + 19, $memo2, value);
	}

	/**
	 * メモ３. Memo 3.<p>
	 *
	 */
	public String memo3() {
		return getConstString(offset + 20, $memo3);
	}

	/**
	 * メモ３. Memo 3.<p>
	 *
	 */
	public void memo3(String value) {
		setConstString(offset + 20, $memo3, value);
	}

	/**
	 * 論理削除ＦＬＧ. Logical delete flg..<p>
	 *
	 */
	public boolean del_flg() {
		return getConstBoolean(offset + 21, $del_flg);
	}

	/**
	 * 論理削除ＦＬＧ. Logical delete flg..<p>
	 *
	 */
	public void del_flg(boolean value) {
		setConstBoolean(offset + 21, $del_flg, value);
	}

	/**
	 * 論理削除ユーザＩＤ. Logical delete user ID.<p>
	 *
	 */
	public String del_usr_id() {
		return getConstString(offset + 22, $del_usr_id);
	}

	/**
	 * 論理削除ユーザＩＤ. Logical delete user ID.<p>
	 *
	 */
	public void del_usr_id(String value) {
		setConstString(offset + 22, $del_usr_id, value);
	}

	/**
	 * 論理削除ユーザ名. Logical delete user name.<p>
	 *
	 */
	public String del_usr_nm() {
		return getConstString(offset + 23, $del_usr_nm);
	}

	/**
	 * 論理削除ユーザ名. Logical delete user name.<p>
	 *
	 */
	public void del_usr_nm(String value) {
		setConstString(offset + 23, $del_usr_nm, value);
	}

	/**
	 * 論理削除日時. Logical delete date and time.<p>
	 *
	 */
	public MCTimestamp del_ts() {
		return getConstTimestamp(offset + 24, $del_ts);
	}

	/**
	 * 論理削除日時. Logical delete date and time.<p>
	 *
	 */
	public void del_ts(MCTimestamp value) {
		setConstTimestamp(offset + 24, $del_ts, value);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 25, $ins_usr_id);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 25, $ins_usr_id, value);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 26, $ins_usr_nm);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 26, $ins_usr_nm, value);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 27, $ins_ts);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 27, $ins_ts, value);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 28, $ins_func_id);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 28, $ins_func_id, value);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 29, $upd_cntr);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 29, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 29, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 29, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 29, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 29, $upd_cntr, value);
	}
	
	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 30, $upd_usr_id);
	}

	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 30, $upd_usr_id, value);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 31, $upd_usr_nm);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 31, $upd_usr_nm, value);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 32, $upd_ts);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 32, $upd_ts, value);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 33, $upd_func_id);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 33, $upd_func_id, value);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 34, $upd_srv_req_no);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 34, $upd_srv_req_no, value);
	}

	/**
	 * 場所名. Location name.<p>
	 *
	 */
	public String loc_nm() {
		return getConstString(offset + 35, $loc_nm);
	}

	/**
	 * 場所名. Location name.<p>
	 *
	 */
	public void loc_nm(String value) {
		setConstString(offset + 35, $loc_nm, value);
	}

	/**
	 * 発注点出庫場所名. GI location at reorder point name.<p>
	 *
	 */
	public String gi_loc_nm() {
		return getConstString(offset + 36, $gi_loc_nm);
	}

	/**
	 * 発注点出庫場所名. GI location at reorder point name.<p>
	 *
	 */
	public void gi_loc_nm(String value) {
		setConstString(offset + 36, $gi_loc_nm, value);
	}

	/**
	 * 発注点出庫棚・ライン名. GI rack/line at reorder point name.<p>
	 *
	 */
	public String gi_str_ln_nm() {
		return getConstString(offset + 37, $gi_str_ln_nm);
	}

	/**
	 * 発注点出庫棚・ライン名. GI rack/line at reorder point name.<p>
	 *
	 */
	public void gi_str_ln_nm(String value) {
		setConstString(offset + 37, $gi_str_ln_nm, value);
	}

	/**
	 * 投入品出庫場所名. Input item GI location name.<p>
	 *
	 */
	public String inpt_gi_loc_nm() {
		return getConstString(offset + 38, $inpt_gi_loc_nm);
	}

	/**
	 * 投入品出庫場所名. Input item GI location name.<p>
	 *
	 */
	public void inpt_gi_loc_nm(String value) {
		setConstString(offset + 38, $inpt_gi_loc_nm, value);
	}

	/**
	 * 投入品出庫棚・ライン名. Input item GI rack/line name.<p>
	 *
	 */
	public String inpt_gi_str_ln_nm() {
		return getConstString(offset + 39, $inpt_gi_str_ln_nm);
	}

	/**
	 * 投入品出庫棚・ライン名. Input item GI rack/line name.<p>
	 *
	 */
	public void inpt_gi_str_ln_nm(String value) {
		setConstString(offset + 39, $inpt_gi_str_ln_nm, value);
	}

	/**
	 * 出荷品出庫場所名. Shipping item GI location name.<p>
	 *
	 */
	public String ship_gi_loc_nm() {
		return getConstString(offset + 40, $ship_gi_loc_nm);
	}

	/**
	 * 出荷品出庫場所名. Shipping item GI location name.<p>
	 *
	 */
	public void ship_gi_loc_nm(String value) {
		setConstString(offset + 40, $ship_gi_loc_nm, value);
	}

	/**
	 * 出荷品出庫棚・ライン名. Shipping item GI rack/line name.<p>
	 *
	 */
	public String ship_gi_str_ln_nm() {
		return getConstString(offset + 41, $ship_gi_str_ln_nm);
	}

	/**
	 * 出荷品出庫棚・ライン名. Shipping item GI rack/line name.<p>
	 *
	 */
	public void ship_gi_str_ln_nm(String value) {
		setConstString(offset + 41, $ship_gi_str_ln_nm, value);
	}

	/**
	 * 品名. Item name.<p>
	 *
	 */
	public String itm_nm() {
		return getConstString(offset + 42, $itm_nm);
	}

	/**
	 * 品名. Item name.<p>
	 *
	 */
	public void itm_nm(String value) {
		setConstString(offset + 42, $itm_nm, value);
	}

	public String getString(String name) {
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
		if ($loc_cd.equalsIgnoreCase(name)) {
			return loc_cd();
		}
		if ($gi_loc_cd.equalsIgnoreCase(name)) {
			return gi_loc_cd();
		}
		if ($gi_str_ln_cd.equalsIgnoreCase(name)) {
			return gi_str_ln_cd();
		}
		if ($inpt_gi_loc_cd.equalsIgnoreCase(name)) {
			return inpt_gi_loc_cd();
		}
		if ($inpt_gi_str_ln_cd.equalsIgnoreCase(name)) {
			return inpt_gi_str_ln_cd();
		}
		if ($ship_gi_loc_cd.equalsIgnoreCase(name)) {
			return ship_gi_loc_cd();
		}
		if ($ship_gi_str_ln_cd.equalsIgnoreCase(name)) {
			return ship_gi_str_ln_cd();
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
		if ($loc_nm.equalsIgnoreCase(name)) {
			return loc_nm();
		}
		if ($gi_loc_nm.equalsIgnoreCase(name)) {
			return gi_loc_nm();
		}
		if ($gi_str_ln_nm.equalsIgnoreCase(name)) {
			return gi_str_ln_nm();
		}
		if ($inpt_gi_loc_nm.equalsIgnoreCase(name)) {
			return inpt_gi_loc_nm();
		}
		if ($inpt_gi_str_ln_nm.equalsIgnoreCase(name)) {
			return inpt_gi_str_ln_nm();
		}
		if ($ship_gi_loc_nm.equalsIgnoreCase(name)) {
			return ship_gi_loc_nm();
		}
		if ($ship_gi_str_ln_nm.equalsIgnoreCase(name)) {
			return ship_gi_str_ln_nm();
		}
		if ($itm_nm.equalsIgnoreCase(name)) {
			return itm_nm();
		}
		return super.getString(name);
	}

	public MCNumber getNumber(String name) {
		if ($buf_qty.equalsIgnoreCase(name)) {
			return buf_qty();
		}
		if ($rord_stk_qty.equalsIgnoreCase(name)) {
			return rord_stk_qty();
		}
		if ($rord_rqst_qty.equalsIgnoreCase(name)) {
			return rord_rqst_qty();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumber(name);
	}

	public MCDate getDate(String name) {
		if ($st_dt.equalsIgnoreCase(name)) {
			return st_dt();
		}
		if ($end_dt.equalsIgnoreCase(name)) {
			return end_dt();
		}
		return super.getDate(name);
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
		if ($gi_schd_flg.equalsIgnoreCase(name)) {
			return gi_schd_flg();
		}
		if ($lot_sizing_flg.equalsIgnoreCase(name)) {
			return lot_sizing_flg();
		}
		if ($del_flg.equalsIgnoreCase(name)) {
			return del_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
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
		if ($loc_cd.equalsIgnoreCase(name)) {
			return loc_cd();
		}
		if ($gi_loc_cd.equalsIgnoreCase(name)) {
			return gi_loc_cd();
		}
		if ($gi_str_ln_cd.equalsIgnoreCase(name)) {
			return gi_str_ln_cd();
		}
		if ($inpt_gi_loc_cd.equalsIgnoreCase(name)) {
			return inpt_gi_loc_cd();
		}
		if ($inpt_gi_str_ln_cd.equalsIgnoreCase(name)) {
			return inpt_gi_str_ln_cd();
		}
		if ($ship_gi_loc_cd.equalsIgnoreCase(name)) {
			return ship_gi_loc_cd();
		}
		if ($ship_gi_str_ln_cd.equalsIgnoreCase(name)) {
			return ship_gi_str_ln_cd();
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
		if ($loc_nm.equalsIgnoreCase(name)) {
			return loc_nm();
		}
		if ($gi_loc_nm.equalsIgnoreCase(name)) {
			return gi_loc_nm();
		}
		if ($gi_str_ln_nm.equalsIgnoreCase(name)) {
			return gi_str_ln_nm();
		}
		if ($inpt_gi_loc_nm.equalsIgnoreCase(name)) {
			return inpt_gi_loc_nm();
		}
		if ($inpt_gi_str_ln_nm.equalsIgnoreCase(name)) {
			return inpt_gi_str_ln_nm();
		}
		if ($ship_gi_loc_nm.equalsIgnoreCase(name)) {
			return ship_gi_loc_nm();
		}
		if ($ship_gi_str_ln_nm.equalsIgnoreCase(name)) {
			return ship_gi_str_ln_nm();
		}
		if ($itm_nm.equalsIgnoreCase(name)) {
			return itm_nm();
		}
		return super.getStringNE(name);
	}

	public MCNumber getNumberNE(String name) {
		if ($buf_qty.equalsIgnoreCase(name)) {
			return buf_qty();
		}
		if ($rord_stk_qty.equalsIgnoreCase(name)) {
			return rord_stk_qty();
		}
		if ($rord_rqst_qty.equalsIgnoreCase(name)) {
			return rord_rqst_qty();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumberNE(name);
	}

	public MCDate getDateNE(String name) {
		if ($st_dt.equalsIgnoreCase(name)) {
			return st_dt();
		}
		if ($end_dt.equalsIgnoreCase(name)) {
			return end_dt();
		}
		return super.getDateNE(name);
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
		if ($gi_schd_flg.equalsIgnoreCase(name)) {
			return gi_schd_flg();
		}
		if ($lot_sizing_flg.equalsIgnoreCase(name)) {
			return lot_sizing_flg();
		}
		if ($del_flg.equalsIgnoreCase(name)) {
			return del_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
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
		if ($loc_cd.equalsIgnoreCase(name)) {
			loc_cd(value);
			return;
		}
		if ($gi_loc_cd.equalsIgnoreCase(name)) {
			gi_loc_cd(value);
			return;
		}
		if ($gi_str_ln_cd.equalsIgnoreCase(name)) {
			gi_str_ln_cd(value);
			return;
		}
		if ($inpt_gi_loc_cd.equalsIgnoreCase(name)) {
			inpt_gi_loc_cd(value);
			return;
		}
		if ($inpt_gi_str_ln_cd.equalsIgnoreCase(name)) {
			inpt_gi_str_ln_cd(value);
			return;
		}
		if ($ship_gi_loc_cd.equalsIgnoreCase(name)) {
			ship_gi_loc_cd(value);
			return;
		}
		if ($ship_gi_str_ln_cd.equalsIgnoreCase(name)) {
			ship_gi_str_ln_cd(value);
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
		if ($loc_nm.equalsIgnoreCase(name)) {
			loc_nm(value);
			return;
		}
		if ($gi_loc_nm.equalsIgnoreCase(name)) {
			gi_loc_nm(value);
			return;
		}
		if ($gi_str_ln_nm.equalsIgnoreCase(name)) {
			gi_str_ln_nm(value);
			return;
		}
		if ($inpt_gi_loc_nm.equalsIgnoreCase(name)) {
			inpt_gi_loc_nm(value);
			return;
		}
		if ($inpt_gi_str_ln_nm.equalsIgnoreCase(name)) {
			inpt_gi_str_ln_nm(value);
			return;
		}
		if ($ship_gi_loc_nm.equalsIgnoreCase(name)) {
			ship_gi_loc_nm(value);
			return;
		}
		if ($ship_gi_str_ln_nm.equalsIgnoreCase(name)) {
			ship_gi_str_ln_nm(value);
			return;
		}
		if ($itm_nm.equalsIgnoreCase(name)) {
			itm_nm(value);
			return;
		}
		super.setString(name, value);
	}

	public void setNumber(String name, MCNumber value) {
		if ($buf_qty.equalsIgnoreCase(name)) {
			buf_qty(value);
			return;
		}
		if ($rord_stk_qty.equalsIgnoreCase(name)) {
			rord_stk_qty(value);
			return;
		}
		if ($rord_rqst_qty.equalsIgnoreCase(name)) {
			rord_rqst_qty(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, int value) {
		if ($buf_qty.equalsIgnoreCase(name)) {
			buf_qty(value);
			return;
		}
		if ($rord_stk_qty.equalsIgnoreCase(name)) {
			rord_stk_qty(value);
			return;
		}
		if ($rord_rqst_qty.equalsIgnoreCase(name)) {
			rord_rqst_qty(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, long value) {
		if ($buf_qty.equalsIgnoreCase(name)) {
			buf_qty(value);
			return;
		}
		if ($rord_stk_qty.equalsIgnoreCase(name)) {
			rord_stk_qty(value);
			return;
		}
		if ($rord_rqst_qty.equalsIgnoreCase(name)) {
			rord_rqst_qty(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, float value) {
		if ($buf_qty.equalsIgnoreCase(name)) {
			buf_qty(value);
			return;
		}
		if ($rord_stk_qty.equalsIgnoreCase(name)) {
			rord_stk_qty(value);
			return;
		}
		if ($rord_rqst_qty.equalsIgnoreCase(name)) {
			rord_rqst_qty(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, double value) {
		if ($buf_qty.equalsIgnoreCase(name)) {
			buf_qty(value);
			return;
		}
		if ($rord_stk_qty.equalsIgnoreCase(name)) {
			rord_stk_qty(value);
			return;
		}
		if ($rord_rqst_qty.equalsIgnoreCase(name)) {
			rord_rqst_qty(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setDate(String name, MCDate value) {
		if ($st_dt.equalsIgnoreCase(name)) {
			st_dt(value);
			return;
		}
		if ($end_dt.equalsIgnoreCase(name)) {
			end_dt(value);
			return;
		}
		super.setDate(name, value);
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
		if ($gi_schd_flg.equalsIgnoreCase(name)) {
			gi_schd_flg(value);
			return;
		}
		if ($lot_sizing_flg.equalsIgnoreCase(name)) {
			lot_sizing_flg(value);
			return;
		}
		if ($del_flg.equalsIgnoreCase(name)) {
			del_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
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
		if ($loc_cd.equalsIgnoreCase(name)) {
			loc_cd(value);
			return;
		}
		if ($gi_loc_cd.equalsIgnoreCase(name)) {
			gi_loc_cd(value);
			return;
		}
		if ($gi_str_ln_cd.equalsIgnoreCase(name)) {
			gi_str_ln_cd(value);
			return;
		}
		if ($inpt_gi_loc_cd.equalsIgnoreCase(name)) {
			inpt_gi_loc_cd(value);
			return;
		}
		if ($inpt_gi_str_ln_cd.equalsIgnoreCase(name)) {
			inpt_gi_str_ln_cd(value);
			return;
		}
		if ($ship_gi_loc_cd.equalsIgnoreCase(name)) {
			ship_gi_loc_cd(value);
			return;
		}
		if ($ship_gi_str_ln_cd.equalsIgnoreCase(name)) {
			ship_gi_str_ln_cd(value);
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
		if ($loc_nm.equalsIgnoreCase(name)) {
			loc_nm(value);
			return;
		}
		if ($gi_loc_nm.equalsIgnoreCase(name)) {
			gi_loc_nm(value);
			return;
		}
		if ($gi_str_ln_nm.equalsIgnoreCase(name)) {
			gi_str_ln_nm(value);
			return;
		}
		if ($inpt_gi_loc_nm.equalsIgnoreCase(name)) {
			inpt_gi_loc_nm(value);
			return;
		}
		if ($inpt_gi_str_ln_nm.equalsIgnoreCase(name)) {
			inpt_gi_str_ln_nm(value);
			return;
		}
		if ($ship_gi_loc_nm.equalsIgnoreCase(name)) {
			ship_gi_loc_nm(value);
			return;
		}
		if ($ship_gi_str_ln_nm.equalsIgnoreCase(name)) {
			ship_gi_str_ln_nm(value);
			return;
		}
		if ($itm_nm.equalsIgnoreCase(name)) {
			itm_nm(value);
			return;
		}
		super.setStringNE(name, value);
	}

	public void setNumberNE(String name, MCNumber value) {
		if ($buf_qty.equalsIgnoreCase(name)) {
			buf_qty(value);
			return;
		}
		if ($rord_stk_qty.equalsIgnoreCase(name)) {
			rord_stk_qty(value);
			return;
		}
		if ($rord_rqst_qty.equalsIgnoreCase(name)) {
			rord_rqst_qty(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, int value) {
		if ($buf_qty.equalsIgnoreCase(name)) {
			buf_qty(value);
			return;
		}
		if ($rord_stk_qty.equalsIgnoreCase(name)) {
			rord_stk_qty(value);
			return;
		}
		if ($rord_rqst_qty.equalsIgnoreCase(name)) {
			rord_rqst_qty(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, long value) {
		if ($buf_qty.equalsIgnoreCase(name)) {
			buf_qty(value);
			return;
		}
		if ($rord_stk_qty.equalsIgnoreCase(name)) {
			rord_stk_qty(value);
			return;
		}
		if ($rord_rqst_qty.equalsIgnoreCase(name)) {
			rord_rqst_qty(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, float value) {
		if ($buf_qty.equalsIgnoreCase(name)) {
			buf_qty(value);
			return;
		}
		if ($rord_stk_qty.equalsIgnoreCase(name)) {
			rord_stk_qty(value);
			return;
		}
		if ($rord_rqst_qty.equalsIgnoreCase(name)) {
			rord_rqst_qty(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, double value) {
		if ($buf_qty.equalsIgnoreCase(name)) {
			buf_qty(value);
			return;
		}
		if ($rord_stk_qty.equalsIgnoreCase(name)) {
			rord_stk_qty(value);
			return;
		}
		if ($rord_rqst_qty.equalsIgnoreCase(name)) {
			rord_rqst_qty(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setDateNE(String name, MCDate value) {
		if ($st_dt.equalsIgnoreCase(name)) {
			st_dt(value);
			return;
		}
		if ($end_dt.equalsIgnoreCase(name)) {
			end_dt(value);
			return;
		}
		super.setDateNE(name, value);
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
		if ($gi_schd_flg.equalsIgnoreCase(name)) {
			gi_schd_flg(value);
			return;
		}
		if ($lot_sizing_flg.equalsIgnoreCase(name)) {
			lot_sizing_flg(value);
			return;
		}
		if ($del_flg.equalsIgnoreCase(name)) {
			del_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

}
