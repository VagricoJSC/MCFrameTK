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
import mcframe.commonCore.meta.MCMeta;
import mcframe.commonCore.lang.MCDataType;
import mcframe.commonCore.lang.MCTimestamp;
import mcframe.serverCore.queryapi.MCDBContainer;
import mcframe.serverCore.queryapi.MCDBContainer.MCTableType;
import mcframe.serverCore.queryapi.IFMCSQL.MCPermColumn;
import mcframe.serverCore.queryapi.IFMCSQL.MCPermColumnInfo;
import mcframe.serverCore.queryapi.MCForeignInfo;

/**
 * "取引先マスタ(ロケール別情報) // BP master (Info. by locale)"DBコンテナRowクラスです。<p>
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
 *  	<td>bp_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>取引先ＣＤ</td>
 *  	<td>BP cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>bp_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>取引先名</td>
 *  	<td>BP name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>bp_alt_nm1</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引先別名１</td>
 *  	<td>BP alias name 1</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>bp_alt_nm2</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引先別名２</td>
 *  	<td>BP alias name 2</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>bp_alt_nm3</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引先別名３</td>
 *  	<td>BP alias name 3</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>bp_alt_nm4</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引先別名４</td>
 *  	<td>BP alias name 4</td>
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
 *  	<td>memo4</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>メモ４</td>
 *  	<td>Memo 4</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>memo5</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>メモ５</td>
 *  	<td>Memo 5</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>memo6</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>メモ６</td>
 *  	<td>Memo 6</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>memo7</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>メモ７</td>
 *  	<td>Memo 7</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>memo8</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>メモ８</td>
 *  	<td>Memo 8</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>memo9</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>メモ９</td>
 *  	<td>Memo 9</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>memo10</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>メモ１０</td>
 *  	<td>Memo 10</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>memo11</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>メモ１１</td>
 *  	<td>Memo 11</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>memo12</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>メモ１２</td>
 *  	<td>Memo 12</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>memo13</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>メモ１３</td>
 *  	<td>Memo 13</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>memo14</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>メモ１４</td>
 *  	<td>Memo 14</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>memo15</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>メモ１５</td>
 *  	<td>Memo 15</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>memo16</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>メモ１６</td>
 *  	<td>Memo 16</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>memo17</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>メモ１７</td>
 *  	<td>Memo 17</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>memo18</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>メモ１８</td>
 *  	<td>Memo 18</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>memo19</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>メモ１９</td>
 *  	<td>Memo 19</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>memo20</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>メモ２０</td>
 *  	<td>Memo 20</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>K</td>
 *  	<td>lcl_cd</td>
 *  	<td>C</td>
 *  	<td>7</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>ロケールＣＤ</td>
 *  	<td>Locale cd.</td>
 *  </tr>
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
public class MAM_BP_LCL_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.CO_VIEW;

	public static final String TABLE_NAME = "MAM_BP_LCL";

	public static final boolean EX_CTRL = true;
	
	public static final boolean LCL_TABLE = false;
	
	/**
	 * 取引先ＣＤ. BP cd..<p>
	 *
	 */
	public static final String $bp_cd = "bp_cd";
	private static final MCPermColumnInfo _bp_cd = createColumnInfo("bp_cd");
	public final MCStringPermColumn bp_cd = createStringColumn(_bp_cd);
	
	/**
	 * 取引先名. BP name.<p>
	 *
	 */
	public static final String $bp_nm = "bp_nm";
	private static final MCPermColumnInfo _bp_nm = createColumnInfo("bp_nm");
	public final MCStringPermColumn bp_nm = createStringColumn(_bp_nm);
	
	/**
	 * 取引先別名１. BP alias name 1.<p>
	 *
	 */
	public static final String $bp_alt_nm1 = "bp_alt_nm1";
	private static final MCPermColumnInfo _bp_alt_nm1 = createColumnInfo("bp_alt_nm1");
	public final MCStringPermColumn bp_alt_nm1 = createStringColumn(_bp_alt_nm1);
	
	/**
	 * 取引先別名２. BP alias name 2.<p>
	 *
	 */
	public static final String $bp_alt_nm2 = "bp_alt_nm2";
	private static final MCPermColumnInfo _bp_alt_nm2 = createColumnInfo("bp_alt_nm2");
	public final MCStringPermColumn bp_alt_nm2 = createStringColumn(_bp_alt_nm2);
	
	/**
	 * 取引先別名３. BP alias name 3.<p>
	 *
	 */
	public static final String $bp_alt_nm3 = "bp_alt_nm3";
	private static final MCPermColumnInfo _bp_alt_nm3 = createColumnInfo("bp_alt_nm3");
	public final MCStringPermColumn bp_alt_nm3 = createStringColumn(_bp_alt_nm3);
	
	/**
	 * 取引先別名４. BP alias name 4.<p>
	 *
	 */
	public static final String $bp_alt_nm4 = "bp_alt_nm4";
	private static final MCPermColumnInfo _bp_alt_nm4 = createColumnInfo("bp_alt_nm4");
	public final MCStringPermColumn bp_alt_nm4 = createStringColumn(_bp_alt_nm4);
	
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
	 * メモ４. Memo 4.<p>
	 *
	 */
	public static final String $memo4 = "memo4";
	private static final MCPermColumnInfo _memo4 = createColumnInfo("memo4");
	public final MCStringPermColumn memo4 = createStringColumn(_memo4);
	
	/**
	 * メモ５. Memo 5.<p>
	 *
	 */
	public static final String $memo5 = "memo5";
	private static final MCPermColumnInfo _memo5 = createColumnInfo("memo5");
	public final MCStringPermColumn memo5 = createStringColumn(_memo5);
	
	/**
	 * メモ６. Memo 6.<p>
	 *
	 */
	public static final String $memo6 = "memo6";
	private static final MCPermColumnInfo _memo6 = createColumnInfo("memo6");
	public final MCStringPermColumn memo6 = createStringColumn(_memo6);
	
	/**
	 * メモ７. Memo 7.<p>
	 *
	 */
	public static final String $memo7 = "memo7";
	private static final MCPermColumnInfo _memo7 = createColumnInfo("memo7");
	public final MCStringPermColumn memo7 = createStringColumn(_memo7);
	
	/**
	 * メモ８. Memo 8.<p>
	 *
	 */
	public static final String $memo8 = "memo8";
	private static final MCPermColumnInfo _memo8 = createColumnInfo("memo8");
	public final MCStringPermColumn memo8 = createStringColumn(_memo8);
	
	/**
	 * メモ９. Memo 9.<p>
	 *
	 */
	public static final String $memo9 = "memo9";
	private static final MCPermColumnInfo _memo9 = createColumnInfo("memo9");
	public final MCStringPermColumn memo9 = createStringColumn(_memo9);
	
	/**
	 * メモ１０. Memo 10.<p>
	 *
	 */
	public static final String $memo10 = "memo10";
	private static final MCPermColumnInfo _memo10 = createColumnInfo("memo10");
	public final MCStringPermColumn memo10 = createStringColumn(_memo10);
	
	/**
	 * メモ１１. Memo 11.<p>
	 *
	 */
	public static final String $memo11 = "memo11";
	private static final MCPermColumnInfo _memo11 = createColumnInfo("memo11");
	public final MCStringPermColumn memo11 = createStringColumn(_memo11);
	
	/**
	 * メモ１２. Memo 12.<p>
	 *
	 */
	public static final String $memo12 = "memo12";
	private static final MCPermColumnInfo _memo12 = createColumnInfo("memo12");
	public final MCStringPermColumn memo12 = createStringColumn(_memo12);
	
	/**
	 * メモ１３. Memo 13.<p>
	 *
	 */
	public static final String $memo13 = "memo13";
	private static final MCPermColumnInfo _memo13 = createColumnInfo("memo13");
	public final MCStringPermColumn memo13 = createStringColumn(_memo13);
	
	/**
	 * メモ１４. Memo 14.<p>
	 *
	 */
	public static final String $memo14 = "memo14";
	private static final MCPermColumnInfo _memo14 = createColumnInfo("memo14");
	public final MCStringPermColumn memo14 = createStringColumn(_memo14);
	
	/**
	 * メモ１５. Memo 15.<p>
	 *
	 */
	public static final String $memo15 = "memo15";
	private static final MCPermColumnInfo _memo15 = createColumnInfo("memo15");
	public final MCStringPermColumn memo15 = createStringColumn(_memo15);
	
	/**
	 * メモ１６. Memo 16.<p>
	 *
	 */
	public static final String $memo16 = "memo16";
	private static final MCPermColumnInfo _memo16 = createColumnInfo("memo16");
	public final MCStringPermColumn memo16 = createStringColumn(_memo16);
	
	/**
	 * メモ１７. Memo 17.<p>
	 *
	 */
	public static final String $memo17 = "memo17";
	private static final MCPermColumnInfo _memo17 = createColumnInfo("memo17");
	public final MCStringPermColumn memo17 = createStringColumn(_memo17);
	
	/**
	 * メモ１８. Memo 18.<p>
	 *
	 */
	public static final String $memo18 = "memo18";
	private static final MCPermColumnInfo _memo18 = createColumnInfo("memo18");
	public final MCStringPermColumn memo18 = createStringColumn(_memo18);
	
	/**
	 * メモ１９. Memo 19.<p>
	 *
	 */
	public static final String $memo19 = "memo19";
	private static final MCPermColumnInfo _memo19 = createColumnInfo("memo19");
	public final MCStringPermColumn memo19 = createStringColumn(_memo19);
	
	/**
	 * メモ２０. Memo 20.<p>
	 *
	 */
	public static final String $memo20 = "memo20";
	private static final MCPermColumnInfo _memo20 = createColumnInfo("memo20");
	public final MCStringPermColumn memo20 = createStringColumn(_memo20);
	
	/**
	 * ロケールＣＤ. Locale cd..<p>
	 *
	 */
	public static final String $lcl_cd = "lcl_cd";
	private static final MCPermColumnInfo _lcl_cd = createColumnInfo("lcl_cd");
	public final MCStringPermColumn lcl_cd = createStringColumn(_lcl_cd);
	
	public static final MCMeta bp_cd_META = createCommonMeta($bp_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta bp_nm_META = createCommonMeta($bp_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta bp_alt_nm1_META = createCommonMeta($bp_alt_nm1, mcframe.commonMA.meta.MA_META.BP_ALT_NM1);
	public static final MCMeta bp_alt_nm2_META = createCommonMeta($bp_alt_nm2, mcframe.commonMA.meta.MA_META.BP_ALT_NM2);
	public static final MCMeta bp_alt_nm3_META = createCommonMeta($bp_alt_nm3, mcframe.commonMA.meta.MA_META.BP_ALT_NM3);
	public static final MCMeta bp_alt_nm4_META = createCommonMeta($bp_alt_nm4, mcframe.commonMA.meta.MA_META.BP_ALT_NM4);
	public static final MCMeta memo1_META = createCommonMeta($memo1, mcframe.commonMA.meta.MA_META.MST_MEMO1);
	public static final MCMeta memo2_META = createCommonMeta($memo2, mcframe.commonMA.meta.MA_META.MST_MEMO2);
	public static final MCMeta memo3_META = createCommonMeta($memo3, mcframe.commonMA.meta.MA_META.MST_MEMO3);
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
	public static final MCMeta memo4_META = createCommonMeta($memo4, mcframe.commonMA.meta.MA_META.MST_MEMO4);
	public static final MCMeta memo5_META = createCommonMeta($memo5, mcframe.commonMA.meta.MA_META.MST_MEMO5);
	public static final MCMeta memo6_META = createCommonMeta($memo6, mcframe.commonMA.meta.MA_META.MST_MEMO6);
	public static final MCMeta memo7_META = createCommonMeta($memo7, mcframe.commonMA.meta.MA_META.MST_MEMO7);
	public static final MCMeta memo8_META = createCommonMeta($memo8, mcframe.commonMA.meta.MA_META.MST_MEMO8);
	public static final MCMeta memo9_META = createCommonMeta($memo9, mcframe.commonMA.meta.MA_META.MST_MEMO9);
	public static final MCMeta memo10_META = createCommonMeta($memo10, mcframe.commonMA.meta.MA_META.MST_MEMO10);
	public static final MCMeta memo11_META = createCommonMeta($memo11, mcframe.commonMA.meta.MA_META.MST_MEMO11);
	public static final MCMeta memo12_META = createCommonMeta($memo12, mcframe.commonMA.meta.MA_META.MST_MEMO12);
	public static final MCMeta memo13_META = createCommonMeta($memo13, mcframe.commonMA.meta.MA_META.MST_MEMO13);
	public static final MCMeta memo14_META = createCommonMeta($memo14, mcframe.commonMA.meta.MA_META.MST_MEMO14);
	public static final MCMeta memo15_META = createCommonMeta($memo15, mcframe.commonMA.meta.MA_META.MST_MEMO15);
	public static final MCMeta memo16_META = createCommonMeta($memo16, mcframe.commonMA.meta.MA_META.MST_MEMO16);
	public static final MCMeta memo17_META = createCommonMeta($memo17, mcframe.commonMA.meta.MA_META.MST_MEMO17);
	public static final MCMeta memo18_META = createCommonMeta($memo18, mcframe.commonMA.meta.MA_META.MST_MEMO18);
	public static final MCMeta memo19_META = createCommonMeta($memo19, mcframe.commonMA.meta.MA_META.MST_MEMO19);
	public static final MCMeta memo20_META = createCommonMeta($memo20, mcframe.commonMA.meta.MA_META.MST_MEMO20);
	public static final MCMeta lcl_cd_META = createCommonMeta($lcl_cd, mcframe.commonMA.meta.MA_META.LCL_CD);

	protected static final List<MCForeignInfo> FOREIGN_INFO_LIST = new ArrayList<>();
	static {
	}
	
	protected static final ConstMetaList<MAM_BP_LCL_R> constMetas = new ConstMetaList<MAM_BP_LCL_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			bp_cd_META,
			bp_nm_META,
			bp_alt_nm1_META,
			bp_alt_nm2_META,
			bp_alt_nm3_META,
			bp_alt_nm4_META,
			memo1_META,
			memo2_META,
			memo3_META,
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
			memo4_META,
			memo5_META,
			memo6_META,
			memo7_META,
			memo8_META,
			memo9_META,
			memo10_META,
			memo11_META,
			memo12_META,
			memo13_META,
			memo14_META,
			memo15_META,
			memo16_META,
			memo17_META,
			memo18_META,
			memo19_META,
			memo20_META,
			lcl_cd_META
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
	protected MAM_BP_LCL_R(ConstMetaList<? extends MAM_BP_LCL_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MAM_BP_LCL_R(ConstMetaList<? extends MAM_BP_LCL_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MAM_BP_LCL_R.$bp_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_BP_LCL_R.$bp_cd,
				"bp_cd",
				bp_cd,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_BP_LCL_R.$bp_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_BP_LCL_R.$bp_nm,
				"bp_nm",
				bp_nm,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_BP_LCL_R.$bp_alt_nm1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_BP_LCL_R.$bp_alt_nm1,
				"bp_alt_nm1",
				bp_alt_nm1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_BP_LCL_R.$bp_alt_nm2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_BP_LCL_R.$bp_alt_nm2,
				"bp_alt_nm2",
				bp_alt_nm2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_BP_LCL_R.$bp_alt_nm3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_BP_LCL_R.$bp_alt_nm3,
				"bp_alt_nm3",
				bp_alt_nm3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_BP_LCL_R.$bp_alt_nm4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_BP_LCL_R.$bp_alt_nm4,
				"bp_alt_nm4",
				bp_alt_nm4,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_BP_LCL_R.$memo1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_BP_LCL_R.$memo1,
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
			MAM_BP_LCL_R.$memo2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_BP_LCL_R.$memo2,
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
			MAM_BP_LCL_R.$memo3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_BP_LCL_R.$memo3,
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
			MAM_BP_LCL_R.$ins_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_BP_LCL_R.$ins_usr_id,
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
			MAM_BP_LCL_R.$ins_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_BP_LCL_R.$ins_usr_nm,
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
			MAM_BP_LCL_R.$ins_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MAM_BP_LCL_R.$ins_ts,
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
			MAM_BP_LCL_R.$ins_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_BP_LCL_R.$ins_func_id,
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
			MAM_BP_LCL_R.$upd_cntr,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_BP_LCL_R.$upd_cntr,
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
			MAM_BP_LCL_R.$upd_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_BP_LCL_R.$upd_usr_id,
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
			MAM_BP_LCL_R.$upd_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_BP_LCL_R.$upd_usr_nm,
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
			MAM_BP_LCL_R.$upd_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MAM_BP_LCL_R.$upd_ts,
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
			MAM_BP_LCL_R.$upd_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_BP_LCL_R.$upd_func_id,
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
			MAM_BP_LCL_R.$upd_srv_req_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_BP_LCL_R.$upd_srv_req_no,
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
			MAM_BP_LCL_R.$memo4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_BP_LCL_R.$memo4,
				"memo4",
				memo4,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_BP_LCL_R.$memo5,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_BP_LCL_R.$memo5,
				"memo5",
				memo5,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_BP_LCL_R.$memo6,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_BP_LCL_R.$memo6,
				"memo6",
				memo6,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_BP_LCL_R.$memo7,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_BP_LCL_R.$memo7,
				"memo7",
				memo7,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_BP_LCL_R.$memo8,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_BP_LCL_R.$memo8,
				"memo8",
				memo8,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_BP_LCL_R.$memo9,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_BP_LCL_R.$memo9,
				"memo9",
				memo9,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_BP_LCL_R.$memo10,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_BP_LCL_R.$memo10,
				"memo10",
				memo10,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_BP_LCL_R.$memo11,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_BP_LCL_R.$memo11,
				"memo11",
				memo11,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_BP_LCL_R.$memo12,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_BP_LCL_R.$memo12,
				"memo12",
				memo12,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_BP_LCL_R.$memo13,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_BP_LCL_R.$memo13,
				"memo13",
				memo13,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_BP_LCL_R.$memo14,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_BP_LCL_R.$memo14,
				"memo14",
				memo14,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_BP_LCL_R.$memo15,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_BP_LCL_R.$memo15,
				"memo15",
				memo15,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_BP_LCL_R.$memo16,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_BP_LCL_R.$memo16,
				"memo16",
				memo16,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_BP_LCL_R.$memo17,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_BP_LCL_R.$memo17,
				"memo17",
				memo17,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_BP_LCL_R.$memo18,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_BP_LCL_R.$memo18,
				"memo18",
				memo18,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_BP_LCL_R.$memo19,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_BP_LCL_R.$memo19,
				"memo19",
				memo19,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_BP_LCL_R.$memo20,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_BP_LCL_R.$memo20,
				"memo20",
				memo20,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_BP_LCL_R.$lcl_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_BP_LCL_R.$lcl_cd,
				"lcl_cd",
				lcl_cd,
				true,
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
	public static MAM_BP_LCL_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MAM_BP_LCL_R create(String alias) {
		MAM_BP_LCL_R row = new MAM_BP_LCL_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MAM_BP_LCL_R createByName(T proto) {
		MAM_BP_LCL_R row = MAM_BP_LCL_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAM_BP_LCL_R clone() {
		return (MAM_BP_LCL_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAM_BP_LCL_R createInstance() {
		return (MAM_BP_LCL_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAM_BP_LCL_R getValues(String... names) {
		return (MAM_BP_LCL_R) super.getValues(names);
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
	 * 取引先ＣＤ. BP cd..<p>
	 *
	 */
	public String bp_cd() {
		return getConstString(offset + 0, $bp_cd);
	}

	/**
	 * 取引先ＣＤ. BP cd..<p>
	 *
	 */
	public void bp_cd(String value) {
		setConstString(offset + 0, $bp_cd, value);
	}

	/**
	 * 取引先名. BP name.<p>
	 *
	 */
	public String bp_nm() {
		return getConstString(offset + 1, $bp_nm);
	}

	/**
	 * 取引先名. BP name.<p>
	 *
	 */
	public void bp_nm(String value) {
		setConstString(offset + 1, $bp_nm, value);
	}

	/**
	 * 取引先別名１. BP alias name 1.<p>
	 *
	 */
	public String bp_alt_nm1() {
		return getConstString(offset + 2, $bp_alt_nm1);
	}

	/**
	 * 取引先別名１. BP alias name 1.<p>
	 *
	 */
	public void bp_alt_nm1(String value) {
		setConstString(offset + 2, $bp_alt_nm1, value);
	}

	/**
	 * 取引先別名２. BP alias name 2.<p>
	 *
	 */
	public String bp_alt_nm2() {
		return getConstString(offset + 3, $bp_alt_nm2);
	}

	/**
	 * 取引先別名２. BP alias name 2.<p>
	 *
	 */
	public void bp_alt_nm2(String value) {
		setConstString(offset + 3, $bp_alt_nm2, value);
	}

	/**
	 * 取引先別名３. BP alias name 3.<p>
	 *
	 */
	public String bp_alt_nm3() {
		return getConstString(offset + 4, $bp_alt_nm3);
	}

	/**
	 * 取引先別名３. BP alias name 3.<p>
	 *
	 */
	public void bp_alt_nm3(String value) {
		setConstString(offset + 4, $bp_alt_nm3, value);
	}

	/**
	 * 取引先別名４. BP alias name 4.<p>
	 *
	 */
	public String bp_alt_nm4() {
		return getConstString(offset + 5, $bp_alt_nm4);
	}

	/**
	 * 取引先別名４. BP alias name 4.<p>
	 *
	 */
	public void bp_alt_nm4(String value) {
		setConstString(offset + 5, $bp_alt_nm4, value);
	}

	/**
	 * メモ１. Memo 1.<p>
	 *
	 */
	public String memo1() {
		return getConstString(offset + 6, $memo1);
	}

	/**
	 * メモ１. Memo 1.<p>
	 *
	 */
	public void memo1(String value) {
		setConstString(offset + 6, $memo1, value);
	}

	/**
	 * メモ２. Memo 2.<p>
	 *
	 */
	public String memo2() {
		return getConstString(offset + 7, $memo2);
	}

	/**
	 * メモ２. Memo 2.<p>
	 *
	 */
	public void memo2(String value) {
		setConstString(offset + 7, $memo2, value);
	}

	/**
	 * メモ３. Memo 3.<p>
	 *
	 */
	public String memo3() {
		return getConstString(offset + 8, $memo3);
	}

	/**
	 * メモ３. Memo 3.<p>
	 *
	 */
	public void memo3(String value) {
		setConstString(offset + 8, $memo3, value);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 9, $ins_usr_id);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 9, $ins_usr_id, value);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 10, $ins_usr_nm);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 10, $ins_usr_nm, value);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 11, $ins_ts);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 11, $ins_ts, value);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 12, $ins_func_id);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 12, $ins_func_id, value);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 13, $upd_cntr);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 13, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 13, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 13, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 13, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 13, $upd_cntr, value);
	}
	
	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 14, $upd_usr_id);
	}

	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 14, $upd_usr_id, value);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 15, $upd_usr_nm);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 15, $upd_usr_nm, value);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 16, $upd_ts);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 16, $upd_ts, value);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 17, $upd_func_id);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 17, $upd_func_id, value);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 18, $upd_srv_req_no);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 18, $upd_srv_req_no, value);
	}

	/**
	 * メモ４. Memo 4.<p>
	 *
	 */
	public String memo4() {
		return getConstString(offset + 19, $memo4);
	}

	/**
	 * メモ４. Memo 4.<p>
	 *
	 */
	public void memo4(String value) {
		setConstString(offset + 19, $memo4, value);
	}

	/**
	 * メモ５. Memo 5.<p>
	 *
	 */
	public String memo5() {
		return getConstString(offset + 20, $memo5);
	}

	/**
	 * メモ５. Memo 5.<p>
	 *
	 */
	public void memo5(String value) {
		setConstString(offset + 20, $memo5, value);
	}

	/**
	 * メモ６. Memo 6.<p>
	 *
	 */
	public String memo6() {
		return getConstString(offset + 21, $memo6);
	}

	/**
	 * メモ６. Memo 6.<p>
	 *
	 */
	public void memo6(String value) {
		setConstString(offset + 21, $memo6, value);
	}

	/**
	 * メモ７. Memo 7.<p>
	 *
	 */
	public String memo7() {
		return getConstString(offset + 22, $memo7);
	}

	/**
	 * メモ７. Memo 7.<p>
	 *
	 */
	public void memo7(String value) {
		setConstString(offset + 22, $memo7, value);
	}

	/**
	 * メモ８. Memo 8.<p>
	 *
	 */
	public String memo8() {
		return getConstString(offset + 23, $memo8);
	}

	/**
	 * メモ８. Memo 8.<p>
	 *
	 */
	public void memo8(String value) {
		setConstString(offset + 23, $memo8, value);
	}

	/**
	 * メモ９. Memo 9.<p>
	 *
	 */
	public String memo9() {
		return getConstString(offset + 24, $memo9);
	}

	/**
	 * メモ９. Memo 9.<p>
	 *
	 */
	public void memo9(String value) {
		setConstString(offset + 24, $memo9, value);
	}

	/**
	 * メモ１０. Memo 10.<p>
	 *
	 */
	public String memo10() {
		return getConstString(offset + 25, $memo10);
	}

	/**
	 * メモ１０. Memo 10.<p>
	 *
	 */
	public void memo10(String value) {
		setConstString(offset + 25, $memo10, value);
	}

	/**
	 * メモ１１. Memo 11.<p>
	 *
	 */
	public String memo11() {
		return getConstString(offset + 26, $memo11);
	}

	/**
	 * メモ１１. Memo 11.<p>
	 *
	 */
	public void memo11(String value) {
		setConstString(offset + 26, $memo11, value);
	}

	/**
	 * メモ１２. Memo 12.<p>
	 *
	 */
	public String memo12() {
		return getConstString(offset + 27, $memo12);
	}

	/**
	 * メモ１２. Memo 12.<p>
	 *
	 */
	public void memo12(String value) {
		setConstString(offset + 27, $memo12, value);
	}

	/**
	 * メモ１３. Memo 13.<p>
	 *
	 */
	public String memo13() {
		return getConstString(offset + 28, $memo13);
	}

	/**
	 * メモ１３. Memo 13.<p>
	 *
	 */
	public void memo13(String value) {
		setConstString(offset + 28, $memo13, value);
	}

	/**
	 * メモ１４. Memo 14.<p>
	 *
	 */
	public String memo14() {
		return getConstString(offset + 29, $memo14);
	}

	/**
	 * メモ１４. Memo 14.<p>
	 *
	 */
	public void memo14(String value) {
		setConstString(offset + 29, $memo14, value);
	}

	/**
	 * メモ１５. Memo 15.<p>
	 *
	 */
	public String memo15() {
		return getConstString(offset + 30, $memo15);
	}

	/**
	 * メモ１５. Memo 15.<p>
	 *
	 */
	public void memo15(String value) {
		setConstString(offset + 30, $memo15, value);
	}

	/**
	 * メモ１６. Memo 16.<p>
	 *
	 */
	public String memo16() {
		return getConstString(offset + 31, $memo16);
	}

	/**
	 * メモ１６. Memo 16.<p>
	 *
	 */
	public void memo16(String value) {
		setConstString(offset + 31, $memo16, value);
	}

	/**
	 * メモ１７. Memo 17.<p>
	 *
	 */
	public String memo17() {
		return getConstString(offset + 32, $memo17);
	}

	/**
	 * メモ１７. Memo 17.<p>
	 *
	 */
	public void memo17(String value) {
		setConstString(offset + 32, $memo17, value);
	}

	/**
	 * メモ１８. Memo 18.<p>
	 *
	 */
	public String memo18() {
		return getConstString(offset + 33, $memo18);
	}

	/**
	 * メモ１８. Memo 18.<p>
	 *
	 */
	public void memo18(String value) {
		setConstString(offset + 33, $memo18, value);
	}

	/**
	 * メモ１９. Memo 19.<p>
	 *
	 */
	public String memo19() {
		return getConstString(offset + 34, $memo19);
	}

	/**
	 * メモ１９. Memo 19.<p>
	 *
	 */
	public void memo19(String value) {
		setConstString(offset + 34, $memo19, value);
	}

	/**
	 * メモ２０. Memo 20.<p>
	 *
	 */
	public String memo20() {
		return getConstString(offset + 35, $memo20);
	}

	/**
	 * メモ２０. Memo 20.<p>
	 *
	 */
	public void memo20(String value) {
		setConstString(offset + 35, $memo20, value);
	}

	/**
	 * ロケールＣＤ. Locale cd..<p>
	 *
	 */
	public String lcl_cd() {
		return getConstString(offset + 36, $lcl_cd);
	}

	/**
	 * ロケールＣＤ. Locale cd..<p>
	 *
	 */
	public void lcl_cd(String value) {
		setConstString(offset + 36, $lcl_cd, value);
	}

	public String getString(String name) {
		if ($bp_cd.equalsIgnoreCase(name)) {
			return bp_cd();
		}
		if ($bp_nm.equalsIgnoreCase(name)) {
			return bp_nm();
		}
		if ($bp_alt_nm1.equalsIgnoreCase(name)) {
			return bp_alt_nm1();
		}
		if ($bp_alt_nm2.equalsIgnoreCase(name)) {
			return bp_alt_nm2();
		}
		if ($bp_alt_nm3.equalsIgnoreCase(name)) {
			return bp_alt_nm3();
		}
		if ($bp_alt_nm4.equalsIgnoreCase(name)) {
			return bp_alt_nm4();
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
		if ($memo4.equalsIgnoreCase(name)) {
			return memo4();
		}
		if ($memo5.equalsIgnoreCase(name)) {
			return memo5();
		}
		if ($memo6.equalsIgnoreCase(name)) {
			return memo6();
		}
		if ($memo7.equalsIgnoreCase(name)) {
			return memo7();
		}
		if ($memo8.equalsIgnoreCase(name)) {
			return memo8();
		}
		if ($memo9.equalsIgnoreCase(name)) {
			return memo9();
		}
		if ($memo10.equalsIgnoreCase(name)) {
			return memo10();
		}
		if ($memo11.equalsIgnoreCase(name)) {
			return memo11();
		}
		if ($memo12.equalsIgnoreCase(name)) {
			return memo12();
		}
		if ($memo13.equalsIgnoreCase(name)) {
			return memo13();
		}
		if ($memo14.equalsIgnoreCase(name)) {
			return memo14();
		}
		if ($memo15.equalsIgnoreCase(name)) {
			return memo15();
		}
		if ($memo16.equalsIgnoreCase(name)) {
			return memo16();
		}
		if ($memo17.equalsIgnoreCase(name)) {
			return memo17();
		}
		if ($memo18.equalsIgnoreCase(name)) {
			return memo18();
		}
		if ($memo19.equalsIgnoreCase(name)) {
			return memo19();
		}
		if ($memo20.equalsIgnoreCase(name)) {
			return memo20();
		}
		if ($lcl_cd.equalsIgnoreCase(name)) {
			return lcl_cd();
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
		if ($ins_ts.equalsIgnoreCase(name)) {
			return ins_ts();
		}
		if ($upd_ts.equalsIgnoreCase(name)) {
			return upd_ts();
		}
		return super.getTimestamp(name);
	}

	public String getStringNE(String name) {
		if ($bp_cd.equalsIgnoreCase(name)) {
			return bp_cd();
		}
		if ($bp_nm.equalsIgnoreCase(name)) {
			return bp_nm();
		}
		if ($bp_alt_nm1.equalsIgnoreCase(name)) {
			return bp_alt_nm1();
		}
		if ($bp_alt_nm2.equalsIgnoreCase(name)) {
			return bp_alt_nm2();
		}
		if ($bp_alt_nm3.equalsIgnoreCase(name)) {
			return bp_alt_nm3();
		}
		if ($bp_alt_nm4.equalsIgnoreCase(name)) {
			return bp_alt_nm4();
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
		if ($memo4.equalsIgnoreCase(name)) {
			return memo4();
		}
		if ($memo5.equalsIgnoreCase(name)) {
			return memo5();
		}
		if ($memo6.equalsIgnoreCase(name)) {
			return memo6();
		}
		if ($memo7.equalsIgnoreCase(name)) {
			return memo7();
		}
		if ($memo8.equalsIgnoreCase(name)) {
			return memo8();
		}
		if ($memo9.equalsIgnoreCase(name)) {
			return memo9();
		}
		if ($memo10.equalsIgnoreCase(name)) {
			return memo10();
		}
		if ($memo11.equalsIgnoreCase(name)) {
			return memo11();
		}
		if ($memo12.equalsIgnoreCase(name)) {
			return memo12();
		}
		if ($memo13.equalsIgnoreCase(name)) {
			return memo13();
		}
		if ($memo14.equalsIgnoreCase(name)) {
			return memo14();
		}
		if ($memo15.equalsIgnoreCase(name)) {
			return memo15();
		}
		if ($memo16.equalsIgnoreCase(name)) {
			return memo16();
		}
		if ($memo17.equalsIgnoreCase(name)) {
			return memo17();
		}
		if ($memo18.equalsIgnoreCase(name)) {
			return memo18();
		}
		if ($memo19.equalsIgnoreCase(name)) {
			return memo19();
		}
		if ($memo20.equalsIgnoreCase(name)) {
			return memo20();
		}
		if ($lcl_cd.equalsIgnoreCase(name)) {
			return lcl_cd();
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
		if ($ins_ts.equalsIgnoreCase(name)) {
			return ins_ts();
		}
		if ($upd_ts.equalsIgnoreCase(name)) {
			return upd_ts();
		}
		return super.getTimestampNE(name);
	}

	public void setString(String name, String value) {
		if ($bp_cd.equalsIgnoreCase(name)) {
			bp_cd(value);
			return;
		}
		if ($bp_nm.equalsIgnoreCase(name)) {
			bp_nm(value);
			return;
		}
		if ($bp_alt_nm1.equalsIgnoreCase(name)) {
			bp_alt_nm1(value);
			return;
		}
		if ($bp_alt_nm2.equalsIgnoreCase(name)) {
			bp_alt_nm2(value);
			return;
		}
		if ($bp_alt_nm3.equalsIgnoreCase(name)) {
			bp_alt_nm3(value);
			return;
		}
		if ($bp_alt_nm4.equalsIgnoreCase(name)) {
			bp_alt_nm4(value);
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
		if ($memo4.equalsIgnoreCase(name)) {
			memo4(value);
			return;
		}
		if ($memo5.equalsIgnoreCase(name)) {
			memo5(value);
			return;
		}
		if ($memo6.equalsIgnoreCase(name)) {
			memo6(value);
			return;
		}
		if ($memo7.equalsIgnoreCase(name)) {
			memo7(value);
			return;
		}
		if ($memo8.equalsIgnoreCase(name)) {
			memo8(value);
			return;
		}
		if ($memo9.equalsIgnoreCase(name)) {
			memo9(value);
			return;
		}
		if ($memo10.equalsIgnoreCase(name)) {
			memo10(value);
			return;
		}
		if ($memo11.equalsIgnoreCase(name)) {
			memo11(value);
			return;
		}
		if ($memo12.equalsIgnoreCase(name)) {
			memo12(value);
			return;
		}
		if ($memo13.equalsIgnoreCase(name)) {
			memo13(value);
			return;
		}
		if ($memo14.equalsIgnoreCase(name)) {
			memo14(value);
			return;
		}
		if ($memo15.equalsIgnoreCase(name)) {
			memo15(value);
			return;
		}
		if ($memo16.equalsIgnoreCase(name)) {
			memo16(value);
			return;
		}
		if ($memo17.equalsIgnoreCase(name)) {
			memo17(value);
			return;
		}
		if ($memo18.equalsIgnoreCase(name)) {
			memo18(value);
			return;
		}
		if ($memo19.equalsIgnoreCase(name)) {
			memo19(value);
			return;
		}
		if ($memo20.equalsIgnoreCase(name)) {
			memo20(value);
			return;
		}
		if ($lcl_cd.equalsIgnoreCase(name)) {
			lcl_cd(value);
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

	public void setStringNE(String name, String value) {
		if ($bp_cd.equalsIgnoreCase(name)) {
			bp_cd(value);
			return;
		}
		if ($bp_nm.equalsIgnoreCase(name)) {
			bp_nm(value);
			return;
		}
		if ($bp_alt_nm1.equalsIgnoreCase(name)) {
			bp_alt_nm1(value);
			return;
		}
		if ($bp_alt_nm2.equalsIgnoreCase(name)) {
			bp_alt_nm2(value);
			return;
		}
		if ($bp_alt_nm3.equalsIgnoreCase(name)) {
			bp_alt_nm3(value);
			return;
		}
		if ($bp_alt_nm4.equalsIgnoreCase(name)) {
			bp_alt_nm4(value);
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
		if ($memo4.equalsIgnoreCase(name)) {
			memo4(value);
			return;
		}
		if ($memo5.equalsIgnoreCase(name)) {
			memo5(value);
			return;
		}
		if ($memo6.equalsIgnoreCase(name)) {
			memo6(value);
			return;
		}
		if ($memo7.equalsIgnoreCase(name)) {
			memo7(value);
			return;
		}
		if ($memo8.equalsIgnoreCase(name)) {
			memo8(value);
			return;
		}
		if ($memo9.equalsIgnoreCase(name)) {
			memo9(value);
			return;
		}
		if ($memo10.equalsIgnoreCase(name)) {
			memo10(value);
			return;
		}
		if ($memo11.equalsIgnoreCase(name)) {
			memo11(value);
			return;
		}
		if ($memo12.equalsIgnoreCase(name)) {
			memo12(value);
			return;
		}
		if ($memo13.equalsIgnoreCase(name)) {
			memo13(value);
			return;
		}
		if ($memo14.equalsIgnoreCase(name)) {
			memo14(value);
			return;
		}
		if ($memo15.equalsIgnoreCase(name)) {
			memo15(value);
			return;
		}
		if ($memo16.equalsIgnoreCase(name)) {
			memo16(value);
			return;
		}
		if ($memo17.equalsIgnoreCase(name)) {
			memo17(value);
			return;
		}
		if ($memo18.equalsIgnoreCase(name)) {
			memo18(value);
			return;
		}
		if ($memo19.equalsIgnoreCase(name)) {
			memo19(value);
			return;
		}
		if ($memo20.equalsIgnoreCase(name)) {
			memo20(value);
			return;
		}
		if ($lcl_cd.equalsIgnoreCase(name)) {
			lcl_cd(value);
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

}
