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
 * "品揃マスタ // Assortment master"DBコンテナRowクラスです。<p>
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
 *  	<td>set_grp_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>品揃グループＣＤ</td>
 *  	<td>Assortment group cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>main_itm_cd</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>代表品目ＣＤ</td>
 *  	<td>Representative item cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>K</td>
 *  	<td>main_itm_sub1</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>代表枝番１</td>
 *  	<td>Representative branch No. 1</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>main_itm_sub2</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>代表枝番２</td>
 *  	<td>Representative branch No. 2</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>K</td>
 *  	<td>main_itm_sub3</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>代表枝番３</td>
 *  	<td>Representative branch No. 3</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>main_itm_unit_cd</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>代表品目単位ＣＤ</td>
 *  	<td>Representative item unit cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>K</td>
 *  	<td>set_itm_cd</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>品揃品目ＣＤ</td>
 *  	<td>Assortment item cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>set_itm_sub1</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>品揃枝番１</td>
 *  	<td>Assortment branch No. 1</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>K</td>
 *  	<td>set_itm_sub2</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>品揃枝番２</td>
 *  	<td>Assortment branch No. 2</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>set_itm_sub3</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>品揃枝番３</td>
 *  	<td>Assortment branch No. 3</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>set_itm_unit_cd</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>品揃品目単位ＣＤ</td>
 *  	<td>Assortment item unit cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>main_itm_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>代表品目数量</td>
 *  	<td>Representative item qty.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>set_itm_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>品揃品目数量</td>
 *  	<td>Assortment item qty.</td>
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
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>main_itm_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td>ITM1.ITM_NM</td>
 *  	<td>代表品名</td>
 *  	<td>Representative item name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>main_itm_unit_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td>UNIT1.UNIT_NM</td>
 *  	<td>代表品目単位名</td>
 *  	<td>Representative item unit name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>set_itm_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td>ITM2.ITM_NM</td>
 *  	<td>品揃品名</td>
 *  	<td>Assortment item name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>set_itm_unit_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td>UNIT2.UNIT_NM</td>
 *  	<td>品揃品目単位名</td>
 *  	<td>Assortment item unit name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>set_grp_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td>SET_GRP1.SET_GRP_NM</td>
 *  	<td>品揃グループ名(ローカライズ）</td>
 *  	<td>Assortment group name (Localize)</td>
 *  </tr>
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
public class MAM_SET_ITM_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.CO_VIEW;

	public static final String TABLE_NAME = "MAM_SET_ITM";

	public static final boolean EX_CTRL = true;
	
	public static final boolean LCL_TABLE = false;
	
	/**
	 * 品揃グループＣＤ. Assortment group cd..<p>
	 *
	 */
	public static final String $set_grp_cd = "set_grp_cd";
	private static final MCPermColumnInfo _set_grp_cd = createColumnInfo("set_grp_cd");
	public final MCStringPermColumn set_grp_cd = createStringColumn(_set_grp_cd);
	
	/**
	 * 代表品目ＣＤ. Representative item cd..<p>
	 *
	 */
	public static final String $main_itm_cd = "main_itm_cd";
	private static final MCPermColumnInfo _main_itm_cd = createColumnInfo("main_itm_cd");
	public final MCStringPermColumn main_itm_cd = createStringColumn(_main_itm_cd);
	
	/**
	 * 代表枝番１. Representative branch No. 1.<p>
	 *
	 */
	public static final String $main_itm_sub1 = "main_itm_sub1";
	private static final MCPermColumnInfo _main_itm_sub1 = createColumnInfo("main_itm_sub1");
	public final MCStringPermColumn main_itm_sub1 = createStringColumn(_main_itm_sub1);
	
	/**
	 * 代表枝番２. Representative branch No. 2.<p>
	 *
	 */
	public static final String $main_itm_sub2 = "main_itm_sub2";
	private static final MCPermColumnInfo _main_itm_sub2 = createColumnInfo("main_itm_sub2");
	public final MCStringPermColumn main_itm_sub2 = createStringColumn(_main_itm_sub2);
	
	/**
	 * 代表枝番３. Representative branch No. 3.<p>
	 *
	 */
	public static final String $main_itm_sub3 = "main_itm_sub3";
	private static final MCPermColumnInfo _main_itm_sub3 = createColumnInfo("main_itm_sub3");
	public final MCStringPermColumn main_itm_sub3 = createStringColumn(_main_itm_sub3);
	
	/**
	 * 代表品目単位ＣＤ. Representative item unit cd..<p>
	 *
	 */
	public static final String $main_itm_unit_cd = "main_itm_unit_cd";
	private static final MCPermColumnInfo _main_itm_unit_cd = createColumnInfo("main_itm_unit_cd");
	public final MCStringPermColumn main_itm_unit_cd = createStringColumn(_main_itm_unit_cd);
	
	/**
	 * 品揃品目ＣＤ. Assortment item cd..<p>
	 *
	 */
	public static final String $set_itm_cd = "set_itm_cd";
	private static final MCPermColumnInfo _set_itm_cd = createColumnInfo("set_itm_cd");
	public final MCStringPermColumn set_itm_cd = createStringColumn(_set_itm_cd);
	
	/**
	 * 品揃枝番１. Assortment branch No. 1.<p>
	 *
	 */
	public static final String $set_itm_sub1 = "set_itm_sub1";
	private static final MCPermColumnInfo _set_itm_sub1 = createColumnInfo("set_itm_sub1");
	public final MCStringPermColumn set_itm_sub1 = createStringColumn(_set_itm_sub1);
	
	/**
	 * 品揃枝番２. Assortment branch No. 2.<p>
	 *
	 */
	public static final String $set_itm_sub2 = "set_itm_sub2";
	private static final MCPermColumnInfo _set_itm_sub2 = createColumnInfo("set_itm_sub2");
	public final MCStringPermColumn set_itm_sub2 = createStringColumn(_set_itm_sub2);
	
	/**
	 * 品揃枝番３. Assortment branch No. 3.<p>
	 *
	 */
	public static final String $set_itm_sub3 = "set_itm_sub3";
	private static final MCPermColumnInfo _set_itm_sub3 = createColumnInfo("set_itm_sub3");
	public final MCStringPermColumn set_itm_sub3 = createStringColumn(_set_itm_sub3);
	
	/**
	 * 品揃品目単位ＣＤ. Assortment item unit cd..<p>
	 *
	 */
	public static final String $set_itm_unit_cd = "set_itm_unit_cd";
	private static final MCPermColumnInfo _set_itm_unit_cd = createColumnInfo("set_itm_unit_cd");
	public final MCStringPermColumn set_itm_unit_cd = createStringColumn(_set_itm_unit_cd);
	
	/**
	 * 代表品目数量. Representative item qty..<p>
	 *
	 */
	public static final String $main_itm_qty = "main_itm_qty";
	private static final MCPermColumnInfo _main_itm_qty = createColumnInfo("main_itm_qty");
	public final MCNumberPermColumn main_itm_qty = createNumberColumn(_main_itm_qty);
	
	/**
	 * 品揃品目数量. Assortment item qty..<p>
	 *
	 */
	public static final String $set_itm_qty = "set_itm_qty";
	private static final MCPermColumnInfo _set_itm_qty = createColumnInfo("set_itm_qty");
	public final MCNumberPermColumn set_itm_qty = createNumberColumn(_set_itm_qty);
	
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
	 * 代表品名. Representative item name.<p>
	 *
	 */
	public static final String $main_itm_nm = "main_itm_nm";
	
	/**
	 * 代表品目単位名. Representative item unit name.<p>
	 *
	 */
	public static final String $main_itm_unit_nm = "main_itm_unit_nm";
	
	/**
	 * 品揃品名. Assortment item name.<p>
	 *
	 */
	public static final String $set_itm_nm = "set_itm_nm";
	
	/**
	 * 品揃品目単位名. Assortment item unit name.<p>
	 *
	 */
	public static final String $set_itm_unit_nm = "set_itm_unit_nm";
	
	/**
	 * 品揃グループ名(ローカライズ）. Assortment group name (Localize).<p>
	 *
	 */
	public static final String $set_grp_nm = "set_grp_nm";
	
	public static final MCMeta set_grp_cd_META = createCommonMeta($set_grp_cd, mcframe.commonMA.meta.MA_META.SET_GRP_CD);
	public static final MCMeta main_itm_cd_META = createCommonMeta($main_itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta main_itm_sub1_META = createCommonMeta($main_itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta main_itm_sub2_META = createCommonMeta($main_itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta main_itm_sub3_META = createCommonMeta($main_itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta main_itm_unit_cd_META = createCommonMeta($main_itm_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta set_itm_cd_META = createCommonMeta($set_itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta set_itm_sub1_META = createCommonMeta($set_itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta set_itm_sub2_META = createCommonMeta($set_itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta set_itm_sub3_META = createCommonMeta($set_itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta set_itm_unit_cd_META = createCommonMeta($set_itm_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta main_itm_qty_META = createCommonMeta($main_itm_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta set_itm_qty_META = createCommonMeta($set_itm_qty, mcframe.commonMA.meta.MA_META.QTY);
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
	public static final MCMeta main_itm_nm_META = createCommonMeta($main_itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta main_itm_unit_nm_META = createCommonMeta($main_itm_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta set_itm_nm_META = createCommonMeta($set_itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta set_itm_unit_nm_META = createCommonMeta($set_itm_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta set_grp_nm_META = createCommonMeta($set_grp_nm, mcframe.commonMA.meta.MA_META.SET_GRP_NM);

	protected static final List<MCForeignInfo> FOREIGN_INFO_LIST = new ArrayList<>();
	public static final String $SET_GRP1 = "SET_GRP1";
	public static final String $UNIT1 = "UNIT1";
	public static final String $UNIT2 = "UNIT2";
	public static final String $ITM1 = "ITM1";
	public static final String $ITM2 = "ITM2";
	static {
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_SET_GRP",
				$SET_GRP1,
				new String[][]{
						{"set_grp_cd", "set_grp_cd"}
				},
				() -> {
					return mcframe.serverMA.dbc.MAM_SET_GRP_R.create("SET_GRP1");
				},
				(alias) -> {
					MAM_SET_ITM_R own = MAM_SET_ITM_R.create(alias);
					mcframe.serverMA.dbc.MAM_SET_GRP_R ref = mcframe.serverMA.dbc.MAM_SET_GRP_R.create("SET_GRP1");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.set_grp_cd.eq(ref.set_grp_cd));
					return cond;
				}
			)
		);
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_UNIT",
				$UNIT1,
				new String[][]{
						{"main_itm_unit_cd", "unit_cd"}
				},
				() -> {
					return mcframe.serverMA.dbc.MAM_UNIT_R.create("UNIT1");
				},
				(alias) -> {
					MAM_SET_ITM_R own = MAM_SET_ITM_R.create(alias);
					mcframe.serverMA.dbc.MAM_UNIT_R ref = mcframe.serverMA.dbc.MAM_UNIT_R.create("UNIT1");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.main_itm_unit_cd.eq(ref.unit_cd));
					return cond;
				}
			)
		);
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_UNIT",
				$UNIT2,
				new String[][]{
						{"set_itm_unit_cd", "unit_cd"}
				},
				() -> {
					return mcframe.serverMA.dbc.MAM_UNIT_R.create("UNIT2");
				},
				(alias) -> {
					MAM_SET_ITM_R own = MAM_SET_ITM_R.create(alias);
					mcframe.serverMA.dbc.MAM_UNIT_R ref = mcframe.serverMA.dbc.MAM_UNIT_R.create("UNIT2");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.set_itm_unit_cd.eq(ref.unit_cd));
					return cond;
				}
			)
		);
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_ITM_",
				$ITM1,
				new String[][]{
						{"main_itm_cd", "itm_cd"},
						{"main_itm_sub1", "itm_sub1"},
						{"main_itm_sub2", "itm_sub2"},
						{"main_itm_sub3", "itm_sub3"}
				},
				() -> {
					return mcframe.serverMA.dbc.MAM_ITM__R.create("ITM1");
				},
				(alias) -> {
					MAM_SET_ITM_R own = MAM_SET_ITM_R.create(alias);
					mcframe.serverMA.dbc.MAM_ITM__R ref = mcframe.serverMA.dbc.MAM_ITM__R.create("ITM1");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.main_itm_cd.eq(ref.itm_cd));
					cond = cond.and(own.main_itm_sub1.eq(ref.itm_sub1));
					cond = cond.and(own.main_itm_sub2.eq(ref.itm_sub2));
					cond = cond.and(own.main_itm_sub3.eq(ref.itm_sub3));
					return cond;
				}
			)
		);
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_ITM_",
				$ITM2,
				new String[][]{
						{"set_itm_cd", "itm_cd"},
						{"set_itm_sub1", "itm_sub1"},
						{"set_itm_sub2", "itm_sub2"},
						{"set_itm_sub3", "itm_sub3"}
				},
				() -> {
					return mcframe.serverMA.dbc.MAM_ITM__R.create("ITM2");
				},
				(alias) -> {
					MAM_SET_ITM_R own = MAM_SET_ITM_R.create(alias);
					mcframe.serverMA.dbc.MAM_ITM__R ref = mcframe.serverMA.dbc.MAM_ITM__R.create("ITM2");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.set_itm_cd.eq(ref.itm_cd));
					cond = cond.and(own.set_itm_sub1.eq(ref.itm_sub1));
					cond = cond.and(own.set_itm_sub2.eq(ref.itm_sub2));
					cond = cond.and(own.set_itm_sub3.eq(ref.itm_sub3));
					return cond;
				}
			)
		);
	}
	
	protected static final ConstMetaList<MAM_SET_ITM_R> constMetas = new ConstMetaList<MAM_SET_ITM_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			set_grp_cd_META,
			main_itm_cd_META,
			main_itm_sub1_META,
			main_itm_sub2_META,
			main_itm_sub3_META,
			main_itm_unit_cd_META,
			set_itm_cd_META,
			set_itm_sub1_META,
			set_itm_sub2_META,
			set_itm_sub3_META,
			set_itm_unit_cd_META,
			main_itm_qty_META,
			set_itm_qty_META,
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
			main_itm_nm_META,
			main_itm_unit_nm_META,
			set_itm_nm_META,
			set_itm_unit_nm_META,
			set_grp_nm_META
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
	protected MAM_SET_ITM_R(ConstMetaList<? extends MAM_SET_ITM_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MAM_SET_ITM_R(ConstMetaList<? extends MAM_SET_ITM_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MAM_SET_ITM_R.$set_grp_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_SET_ITM_R.$set_grp_cd,
				"set_grp_cd",
				set_grp_cd,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_SET_ITM_R.$main_itm_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_SET_ITM_R.$main_itm_cd,
				"main_itm_cd",
				main_itm_cd,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_SET_ITM_R.$main_itm_sub1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_SET_ITM_R.$main_itm_sub1,
				"main_itm_sub1",
				main_itm_sub1,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_SET_ITM_R.$main_itm_sub2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_SET_ITM_R.$main_itm_sub2,
				"main_itm_sub2",
				main_itm_sub2,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_SET_ITM_R.$main_itm_sub3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_SET_ITM_R.$main_itm_sub3,
				"main_itm_sub3",
				main_itm_sub3,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_SET_ITM_R.$main_itm_unit_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_SET_ITM_R.$main_itm_unit_cd,
				"main_itm_unit_cd",
				main_itm_unit_cd,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_SET_ITM_R.$set_itm_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_SET_ITM_R.$set_itm_cd,
				"set_itm_cd",
				set_itm_cd,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_SET_ITM_R.$set_itm_sub1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_SET_ITM_R.$set_itm_sub1,
				"set_itm_sub1",
				set_itm_sub1,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_SET_ITM_R.$set_itm_sub2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_SET_ITM_R.$set_itm_sub2,
				"set_itm_sub2",
				set_itm_sub2,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_SET_ITM_R.$set_itm_sub3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_SET_ITM_R.$set_itm_sub3,
				"set_itm_sub3",
				set_itm_sub3,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_SET_ITM_R.$set_itm_unit_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_SET_ITM_R.$set_itm_unit_cd,
				"set_itm_unit_cd",
				set_itm_unit_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_SET_ITM_R.$main_itm_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_SET_ITM_R.$main_itm_qty,
				"main_itm_qty",
				main_itm_qty,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_SET_ITM_R.$set_itm_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_SET_ITM_R.$set_itm_qty,
				"set_itm_qty",
				set_itm_qty,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_SET_ITM_R.$memo1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_SET_ITM_R.$memo1,
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
			MAM_SET_ITM_R.$memo2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_SET_ITM_R.$memo2,
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
			MAM_SET_ITM_R.$memo3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_SET_ITM_R.$memo3,
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
			MAM_SET_ITM_R.$del_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_SET_ITM_R.$del_flg,
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
			MAM_SET_ITM_R.$del_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_SET_ITM_R.$del_usr_id,
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
			MAM_SET_ITM_R.$del_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_SET_ITM_R.$del_usr_nm,
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
			MAM_SET_ITM_R.$del_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MAM_SET_ITM_R.$del_ts,
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
			MAM_SET_ITM_R.$ins_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_SET_ITM_R.$ins_usr_id,
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
			MAM_SET_ITM_R.$ins_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_SET_ITM_R.$ins_usr_nm,
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
			MAM_SET_ITM_R.$ins_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MAM_SET_ITM_R.$ins_ts,
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
			MAM_SET_ITM_R.$ins_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_SET_ITM_R.$ins_func_id,
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
			MAM_SET_ITM_R.$upd_cntr,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_SET_ITM_R.$upd_cntr,
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
			MAM_SET_ITM_R.$upd_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_SET_ITM_R.$upd_usr_id,
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
			MAM_SET_ITM_R.$upd_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_SET_ITM_R.$upd_usr_nm,
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
			MAM_SET_ITM_R.$upd_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MAM_SET_ITM_R.$upd_ts,
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
			MAM_SET_ITM_R.$upd_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_SET_ITM_R.$upd_func_id,
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
			MAM_SET_ITM_R.$upd_srv_req_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_SET_ITM_R.$upd_srv_req_no,
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
			MAM_SET_ITM_R.$main_itm_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_SET_ITM_R.$main_itm_nm,
				"main_itm_nm",
				null,
				false,
				true,
				false,
				false,
				true,
				"ITM1.ITM_NM"
			)
		);
		COLUMN_MAP.put(
			MAM_SET_ITM_R.$main_itm_unit_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_SET_ITM_R.$main_itm_unit_nm,
				"main_itm_unit_nm",
				null,
				false,
				true,
				false,
				false,
				true,
				"UNIT1.UNIT_NM"
			)
		);
		COLUMN_MAP.put(
			MAM_SET_ITM_R.$set_itm_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_SET_ITM_R.$set_itm_nm,
				"set_itm_nm",
				null,
				false,
				true,
				false,
				false,
				true,
				"ITM2.ITM_NM"
			)
		);
		COLUMN_MAP.put(
			MAM_SET_ITM_R.$set_itm_unit_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_SET_ITM_R.$set_itm_unit_nm,
				"set_itm_unit_nm",
				null,
				false,
				true,
				false,
				false,
				true,
				"UNIT2.UNIT_NM"
			)
		);
		COLUMN_MAP.put(
			MAM_SET_ITM_R.$set_grp_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_SET_ITM_R.$set_grp_nm,
				"set_grp_nm",
				null,
				false,
				true,
				false,
				false,
				true,
				"SET_GRP1.SET_GRP_NM"
			)
		);
		return COLUMN_MAP;
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MAM_SET_ITM_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MAM_SET_ITM_R create(String alias) {
		MAM_SET_ITM_R row = new MAM_SET_ITM_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MAM_SET_ITM_R createByName(T proto) {
		MAM_SET_ITM_R row = MAM_SET_ITM_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAM_SET_ITM_R clone() {
		return (MAM_SET_ITM_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAM_SET_ITM_R createInstance() {
		return (MAM_SET_ITM_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAM_SET_ITM_R getValues(String... names) {
		return (MAM_SET_ITM_R) super.getValues(names);
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
	 public MAW_SET_ITM_KEY_R getPkWorkDbc(String alias) {
	 	return MAW_SET_ITM_KEY_R.create(alias);
	 }

	/*
	 * MCDBContainerのオーバーライドメソッドです。
	 */
	 public MAW_SET_ITM_KEY_R getPkWorkDbc() {
	 	return getPkWorkDbc(MAW_SET_ITM_KEY_R.TABLE_NAME);
	 }

	/**
	 * 品揃グループＣＤ. Assortment group cd..<p>
	 *
	 */
	public String set_grp_cd() {
		return getConstString(offset + 0, $set_grp_cd);
	}

	/**
	 * 品揃グループＣＤ. Assortment group cd..<p>
	 *
	 */
	public void set_grp_cd(String value) {
		setConstString(offset + 0, $set_grp_cd, value);
	}

	/**
	 * 代表品目ＣＤ. Representative item cd..<p>
	 *
	 */
	public String main_itm_cd() {
		return getConstString(offset + 1, $main_itm_cd);
	}

	/**
	 * 代表品目ＣＤ. Representative item cd..<p>
	 *
	 */
	public void main_itm_cd(String value) {
		setConstString(offset + 1, $main_itm_cd, value);
	}

	/**
	 * 代表枝番１. Representative branch No. 1.<p>
	 *
	 */
	public String main_itm_sub1() {
		return getConstString(offset + 2, $main_itm_sub1);
	}

	/**
	 * 代表枝番１. Representative branch No. 1.<p>
	 *
	 */
	public void main_itm_sub1(String value) {
		setConstString(offset + 2, $main_itm_sub1, value);
	}

	/**
	 * 代表枝番２. Representative branch No. 2.<p>
	 *
	 */
	public String main_itm_sub2() {
		return getConstString(offset + 3, $main_itm_sub2);
	}

	/**
	 * 代表枝番２. Representative branch No. 2.<p>
	 *
	 */
	public void main_itm_sub2(String value) {
		setConstString(offset + 3, $main_itm_sub2, value);
	}

	/**
	 * 代表枝番３. Representative branch No. 3.<p>
	 *
	 */
	public String main_itm_sub3() {
		return getConstString(offset + 4, $main_itm_sub3);
	}

	/**
	 * 代表枝番３. Representative branch No. 3.<p>
	 *
	 */
	public void main_itm_sub3(String value) {
		setConstString(offset + 4, $main_itm_sub3, value);
	}

	/**
	 * 代表品目単位ＣＤ. Representative item unit cd..<p>
	 *
	 */
	public String main_itm_unit_cd() {
		return getConstString(offset + 5, $main_itm_unit_cd);
	}

	/**
	 * 代表品目単位ＣＤ. Representative item unit cd..<p>
	 *
	 */
	public void main_itm_unit_cd(String value) {
		setConstString(offset + 5, $main_itm_unit_cd, value);
	}

	/**
	 * 品揃品目ＣＤ. Assortment item cd..<p>
	 *
	 */
	public String set_itm_cd() {
		return getConstString(offset + 6, $set_itm_cd);
	}

	/**
	 * 品揃品目ＣＤ. Assortment item cd..<p>
	 *
	 */
	public void set_itm_cd(String value) {
		setConstString(offset + 6, $set_itm_cd, value);
	}

	/**
	 * 品揃枝番１. Assortment branch No. 1.<p>
	 *
	 */
	public String set_itm_sub1() {
		return getConstString(offset + 7, $set_itm_sub1);
	}

	/**
	 * 品揃枝番１. Assortment branch No. 1.<p>
	 *
	 */
	public void set_itm_sub1(String value) {
		setConstString(offset + 7, $set_itm_sub1, value);
	}

	/**
	 * 品揃枝番２. Assortment branch No. 2.<p>
	 *
	 */
	public String set_itm_sub2() {
		return getConstString(offset + 8, $set_itm_sub2);
	}

	/**
	 * 品揃枝番２. Assortment branch No. 2.<p>
	 *
	 */
	public void set_itm_sub2(String value) {
		setConstString(offset + 8, $set_itm_sub2, value);
	}

	/**
	 * 品揃枝番３. Assortment branch No. 3.<p>
	 *
	 */
	public String set_itm_sub3() {
		return getConstString(offset + 9, $set_itm_sub3);
	}

	/**
	 * 品揃枝番３. Assortment branch No. 3.<p>
	 *
	 */
	public void set_itm_sub3(String value) {
		setConstString(offset + 9, $set_itm_sub3, value);
	}

	/**
	 * 品揃品目単位ＣＤ. Assortment item unit cd..<p>
	 *
	 */
	public String set_itm_unit_cd() {
		return getConstString(offset + 10, $set_itm_unit_cd);
	}

	/**
	 * 品揃品目単位ＣＤ. Assortment item unit cd..<p>
	 *
	 */
	public void set_itm_unit_cd(String value) {
		setConstString(offset + 10, $set_itm_unit_cd, value);
	}

	/**
	 * 代表品目数量. Representative item qty..<p>
	 *
	 */
	public MCNumber main_itm_qty() {
		return getConstNumber(offset + 11, $main_itm_qty);
	}

	/**
	 * 代表品目数量. Representative item qty..<p>
	 *
	 */
	public void main_itm_qty(MCNumber value) {
		setConstNumber(offset + 11, $main_itm_qty, value);
	}
	
	/**
	 * 代表品目数量. Representative item qty..<p>
	 *
	 */
	public void main_itm_qty(int value) {
		setConstNumber(offset + 11, $main_itm_qty, value);
	}
	
	/**
	 * 代表品目数量. Representative item qty..<p>
	 *
	 */
	public void main_itm_qty(long value) {
		setConstNumber(offset + 11, $main_itm_qty, value);
	}
	
	/**
	 * 代表品目数量. Representative item qty..<p>
	 *
	 */
	public void main_itm_qty(float value) {
		setConstNumber(offset + 11, $main_itm_qty, value);
	}
	
	/**
	 * 代表品目数量. Representative item qty..<p>
	 *
	 */
	public void main_itm_qty(double value) {
		setConstNumber(offset + 11, $main_itm_qty, value);
	}
	
	/**
	 * 品揃品目数量. Assortment item qty..<p>
	 *
	 */
	public MCNumber set_itm_qty() {
		return getConstNumber(offset + 12, $set_itm_qty);
	}

	/**
	 * 品揃品目数量. Assortment item qty..<p>
	 *
	 */
	public void set_itm_qty(MCNumber value) {
		setConstNumber(offset + 12, $set_itm_qty, value);
	}
	
	/**
	 * 品揃品目数量. Assortment item qty..<p>
	 *
	 */
	public void set_itm_qty(int value) {
		setConstNumber(offset + 12, $set_itm_qty, value);
	}
	
	/**
	 * 品揃品目数量. Assortment item qty..<p>
	 *
	 */
	public void set_itm_qty(long value) {
		setConstNumber(offset + 12, $set_itm_qty, value);
	}
	
	/**
	 * 品揃品目数量. Assortment item qty..<p>
	 *
	 */
	public void set_itm_qty(float value) {
		setConstNumber(offset + 12, $set_itm_qty, value);
	}
	
	/**
	 * 品揃品目数量. Assortment item qty..<p>
	 *
	 */
	public void set_itm_qty(double value) {
		setConstNumber(offset + 12, $set_itm_qty, value);
	}
	
	/**
	 * メモ１. Memo 1.<p>
	 *
	 */
	public String memo1() {
		return getConstString(offset + 13, $memo1);
	}

	/**
	 * メモ１. Memo 1.<p>
	 *
	 */
	public void memo1(String value) {
		setConstString(offset + 13, $memo1, value);
	}

	/**
	 * メモ２. Memo 2.<p>
	 *
	 */
	public String memo2() {
		return getConstString(offset + 14, $memo2);
	}

	/**
	 * メモ２. Memo 2.<p>
	 *
	 */
	public void memo2(String value) {
		setConstString(offset + 14, $memo2, value);
	}

	/**
	 * メモ３. Memo 3.<p>
	 *
	 */
	public String memo3() {
		return getConstString(offset + 15, $memo3);
	}

	/**
	 * メモ３. Memo 3.<p>
	 *
	 */
	public void memo3(String value) {
		setConstString(offset + 15, $memo3, value);
	}

	/**
	 * 論理削除ＦＬＧ. Logical delete flg..<p>
	 *
	 */
	public boolean del_flg() {
		return getConstBoolean(offset + 16, $del_flg);
	}

	/**
	 * 論理削除ＦＬＧ. Logical delete flg..<p>
	 *
	 */
	public void del_flg(boolean value) {
		setConstBoolean(offset + 16, $del_flg, value);
	}

	/**
	 * 論理削除ユーザＩＤ. Logical delete user ID.<p>
	 *
	 */
	public String del_usr_id() {
		return getConstString(offset + 17, $del_usr_id);
	}

	/**
	 * 論理削除ユーザＩＤ. Logical delete user ID.<p>
	 *
	 */
	public void del_usr_id(String value) {
		setConstString(offset + 17, $del_usr_id, value);
	}

	/**
	 * 論理削除ユーザ名. Logical delete user name.<p>
	 *
	 */
	public String del_usr_nm() {
		return getConstString(offset + 18, $del_usr_nm);
	}

	/**
	 * 論理削除ユーザ名. Logical delete user name.<p>
	 *
	 */
	public void del_usr_nm(String value) {
		setConstString(offset + 18, $del_usr_nm, value);
	}

	/**
	 * 論理削除日時. Logical delete date and time.<p>
	 *
	 */
	public MCTimestamp del_ts() {
		return getConstTimestamp(offset + 19, $del_ts);
	}

	/**
	 * 論理削除日時. Logical delete date and time.<p>
	 *
	 */
	public void del_ts(MCTimestamp value) {
		setConstTimestamp(offset + 19, $del_ts, value);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 20, $ins_usr_id);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 20, $ins_usr_id, value);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 21, $ins_usr_nm);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 21, $ins_usr_nm, value);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 22, $ins_ts);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 22, $ins_ts, value);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 23, $ins_func_id);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 23, $ins_func_id, value);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 24, $upd_cntr);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 24, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 24, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 24, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 24, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 24, $upd_cntr, value);
	}
	
	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 25, $upd_usr_id);
	}

	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 25, $upd_usr_id, value);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 26, $upd_usr_nm);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 26, $upd_usr_nm, value);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 27, $upd_ts);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 27, $upd_ts, value);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 28, $upd_func_id);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 28, $upd_func_id, value);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 29, $upd_srv_req_no);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 29, $upd_srv_req_no, value);
	}

	/**
	 * 代表品名. Representative item name.<p>
	 *
	 */
	public String main_itm_nm() {
		return getConstString(offset + 30, $main_itm_nm);
	}

	/**
	 * 代表品名. Representative item name.<p>
	 *
	 */
	public void main_itm_nm(String value) {
		setConstString(offset + 30, $main_itm_nm, value);
	}

	/**
	 * 代表品目単位名. Representative item unit name.<p>
	 *
	 */
	public String main_itm_unit_nm() {
		return getConstString(offset + 31, $main_itm_unit_nm);
	}

	/**
	 * 代表品目単位名. Representative item unit name.<p>
	 *
	 */
	public void main_itm_unit_nm(String value) {
		setConstString(offset + 31, $main_itm_unit_nm, value);
	}

	/**
	 * 品揃品名. Assortment item name.<p>
	 *
	 */
	public String set_itm_nm() {
		return getConstString(offset + 32, $set_itm_nm);
	}

	/**
	 * 品揃品名. Assortment item name.<p>
	 *
	 */
	public void set_itm_nm(String value) {
		setConstString(offset + 32, $set_itm_nm, value);
	}

	/**
	 * 品揃品目単位名. Assortment item unit name.<p>
	 *
	 */
	public String set_itm_unit_nm() {
		return getConstString(offset + 33, $set_itm_unit_nm);
	}

	/**
	 * 品揃品目単位名. Assortment item unit name.<p>
	 *
	 */
	public void set_itm_unit_nm(String value) {
		setConstString(offset + 33, $set_itm_unit_nm, value);
	}

	/**
	 * 品揃グループ名(ローカライズ）. Assortment group name (Localize).<p>
	 *
	 */
	public String set_grp_nm() {
		return getConstString(offset + 34, $set_grp_nm);
	}

	/**
	 * 品揃グループ名(ローカライズ）. Assortment group name (Localize).<p>
	 *
	 */
	public void set_grp_nm(String value) {
		setConstString(offset + 34, $set_grp_nm, value);
	}

	public String getString(String name) {
		if ($set_grp_cd.equalsIgnoreCase(name)) {
			return set_grp_cd();
		}
		if ($main_itm_cd.equalsIgnoreCase(name)) {
			return main_itm_cd();
		}
		if ($main_itm_sub1.equalsIgnoreCase(name)) {
			return main_itm_sub1();
		}
		if ($main_itm_sub2.equalsIgnoreCase(name)) {
			return main_itm_sub2();
		}
		if ($main_itm_sub3.equalsIgnoreCase(name)) {
			return main_itm_sub3();
		}
		if ($main_itm_unit_cd.equalsIgnoreCase(name)) {
			return main_itm_unit_cd();
		}
		if ($set_itm_cd.equalsIgnoreCase(name)) {
			return set_itm_cd();
		}
		if ($set_itm_sub1.equalsIgnoreCase(name)) {
			return set_itm_sub1();
		}
		if ($set_itm_sub2.equalsIgnoreCase(name)) {
			return set_itm_sub2();
		}
		if ($set_itm_sub3.equalsIgnoreCase(name)) {
			return set_itm_sub3();
		}
		if ($set_itm_unit_cd.equalsIgnoreCase(name)) {
			return set_itm_unit_cd();
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
		if ($main_itm_nm.equalsIgnoreCase(name)) {
			return main_itm_nm();
		}
		if ($main_itm_unit_nm.equalsIgnoreCase(name)) {
			return main_itm_unit_nm();
		}
		if ($set_itm_nm.equalsIgnoreCase(name)) {
			return set_itm_nm();
		}
		if ($set_itm_unit_nm.equalsIgnoreCase(name)) {
			return set_itm_unit_nm();
		}
		if ($set_grp_nm.equalsIgnoreCase(name)) {
			return set_grp_nm();
		}
		return super.getString(name);
	}

	public MCNumber getNumber(String name) {
		if ($main_itm_qty.equalsIgnoreCase(name)) {
			return main_itm_qty();
		}
		if ($set_itm_qty.equalsIgnoreCase(name)) {
			return set_itm_qty();
		}
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
		if ($set_grp_cd.equalsIgnoreCase(name)) {
			return set_grp_cd();
		}
		if ($main_itm_cd.equalsIgnoreCase(name)) {
			return main_itm_cd();
		}
		if ($main_itm_sub1.equalsIgnoreCase(name)) {
			return main_itm_sub1();
		}
		if ($main_itm_sub2.equalsIgnoreCase(name)) {
			return main_itm_sub2();
		}
		if ($main_itm_sub3.equalsIgnoreCase(name)) {
			return main_itm_sub3();
		}
		if ($main_itm_unit_cd.equalsIgnoreCase(name)) {
			return main_itm_unit_cd();
		}
		if ($set_itm_cd.equalsIgnoreCase(name)) {
			return set_itm_cd();
		}
		if ($set_itm_sub1.equalsIgnoreCase(name)) {
			return set_itm_sub1();
		}
		if ($set_itm_sub2.equalsIgnoreCase(name)) {
			return set_itm_sub2();
		}
		if ($set_itm_sub3.equalsIgnoreCase(name)) {
			return set_itm_sub3();
		}
		if ($set_itm_unit_cd.equalsIgnoreCase(name)) {
			return set_itm_unit_cd();
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
		if ($main_itm_nm.equalsIgnoreCase(name)) {
			return main_itm_nm();
		}
		if ($main_itm_unit_nm.equalsIgnoreCase(name)) {
			return main_itm_unit_nm();
		}
		if ($set_itm_nm.equalsIgnoreCase(name)) {
			return set_itm_nm();
		}
		if ($set_itm_unit_nm.equalsIgnoreCase(name)) {
			return set_itm_unit_nm();
		}
		if ($set_grp_nm.equalsIgnoreCase(name)) {
			return set_grp_nm();
		}
		return super.getStringNE(name);
	}

	public MCNumber getNumberNE(String name) {
		if ($main_itm_qty.equalsIgnoreCase(name)) {
			return main_itm_qty();
		}
		if ($set_itm_qty.equalsIgnoreCase(name)) {
			return set_itm_qty();
		}
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
		if ($set_grp_cd.equalsIgnoreCase(name)) {
			set_grp_cd(value);
			return;
		}
		if ($main_itm_cd.equalsIgnoreCase(name)) {
			main_itm_cd(value);
			return;
		}
		if ($main_itm_sub1.equalsIgnoreCase(name)) {
			main_itm_sub1(value);
			return;
		}
		if ($main_itm_sub2.equalsIgnoreCase(name)) {
			main_itm_sub2(value);
			return;
		}
		if ($main_itm_sub3.equalsIgnoreCase(name)) {
			main_itm_sub3(value);
			return;
		}
		if ($main_itm_unit_cd.equalsIgnoreCase(name)) {
			main_itm_unit_cd(value);
			return;
		}
		if ($set_itm_cd.equalsIgnoreCase(name)) {
			set_itm_cd(value);
			return;
		}
		if ($set_itm_sub1.equalsIgnoreCase(name)) {
			set_itm_sub1(value);
			return;
		}
		if ($set_itm_sub2.equalsIgnoreCase(name)) {
			set_itm_sub2(value);
			return;
		}
		if ($set_itm_sub3.equalsIgnoreCase(name)) {
			set_itm_sub3(value);
			return;
		}
		if ($set_itm_unit_cd.equalsIgnoreCase(name)) {
			set_itm_unit_cd(value);
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
		if ($main_itm_nm.equalsIgnoreCase(name)) {
			main_itm_nm(value);
			return;
		}
		if ($main_itm_unit_nm.equalsIgnoreCase(name)) {
			main_itm_unit_nm(value);
			return;
		}
		if ($set_itm_nm.equalsIgnoreCase(name)) {
			set_itm_nm(value);
			return;
		}
		if ($set_itm_unit_nm.equalsIgnoreCase(name)) {
			set_itm_unit_nm(value);
			return;
		}
		if ($set_grp_nm.equalsIgnoreCase(name)) {
			set_grp_nm(value);
			return;
		}
		super.setString(name, value);
	}

	public void setNumber(String name, MCNumber value) {
		if ($main_itm_qty.equalsIgnoreCase(name)) {
			main_itm_qty(value);
			return;
		}
		if ($set_itm_qty.equalsIgnoreCase(name)) {
			set_itm_qty(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, int value) {
		if ($main_itm_qty.equalsIgnoreCase(name)) {
			main_itm_qty(value);
			return;
		}
		if ($set_itm_qty.equalsIgnoreCase(name)) {
			set_itm_qty(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, long value) {
		if ($main_itm_qty.equalsIgnoreCase(name)) {
			main_itm_qty(value);
			return;
		}
		if ($set_itm_qty.equalsIgnoreCase(name)) {
			set_itm_qty(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, float value) {
		if ($main_itm_qty.equalsIgnoreCase(name)) {
			main_itm_qty(value);
			return;
		}
		if ($set_itm_qty.equalsIgnoreCase(name)) {
			set_itm_qty(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, double value) {
		if ($main_itm_qty.equalsIgnoreCase(name)) {
			main_itm_qty(value);
			return;
		}
		if ($set_itm_qty.equalsIgnoreCase(name)) {
			set_itm_qty(value);
			return;
		}
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
		if ($set_grp_cd.equalsIgnoreCase(name)) {
			set_grp_cd(value);
			return;
		}
		if ($main_itm_cd.equalsIgnoreCase(name)) {
			main_itm_cd(value);
			return;
		}
		if ($main_itm_sub1.equalsIgnoreCase(name)) {
			main_itm_sub1(value);
			return;
		}
		if ($main_itm_sub2.equalsIgnoreCase(name)) {
			main_itm_sub2(value);
			return;
		}
		if ($main_itm_sub3.equalsIgnoreCase(name)) {
			main_itm_sub3(value);
			return;
		}
		if ($main_itm_unit_cd.equalsIgnoreCase(name)) {
			main_itm_unit_cd(value);
			return;
		}
		if ($set_itm_cd.equalsIgnoreCase(name)) {
			set_itm_cd(value);
			return;
		}
		if ($set_itm_sub1.equalsIgnoreCase(name)) {
			set_itm_sub1(value);
			return;
		}
		if ($set_itm_sub2.equalsIgnoreCase(name)) {
			set_itm_sub2(value);
			return;
		}
		if ($set_itm_sub3.equalsIgnoreCase(name)) {
			set_itm_sub3(value);
			return;
		}
		if ($set_itm_unit_cd.equalsIgnoreCase(name)) {
			set_itm_unit_cd(value);
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
		if ($main_itm_nm.equalsIgnoreCase(name)) {
			main_itm_nm(value);
			return;
		}
		if ($main_itm_unit_nm.equalsIgnoreCase(name)) {
			main_itm_unit_nm(value);
			return;
		}
		if ($set_itm_nm.equalsIgnoreCase(name)) {
			set_itm_nm(value);
			return;
		}
		if ($set_itm_unit_nm.equalsIgnoreCase(name)) {
			set_itm_unit_nm(value);
			return;
		}
		if ($set_grp_nm.equalsIgnoreCase(name)) {
			set_grp_nm(value);
			return;
		}
		super.setStringNE(name, value);
	}

	public void setNumberNE(String name, MCNumber value) {
		if ($main_itm_qty.equalsIgnoreCase(name)) {
			main_itm_qty(value);
			return;
		}
		if ($set_itm_qty.equalsIgnoreCase(name)) {
			set_itm_qty(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, int value) {
		if ($main_itm_qty.equalsIgnoreCase(name)) {
			main_itm_qty(value);
			return;
		}
		if ($set_itm_qty.equalsIgnoreCase(name)) {
			set_itm_qty(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, long value) {
		if ($main_itm_qty.equalsIgnoreCase(name)) {
			main_itm_qty(value);
			return;
		}
		if ($set_itm_qty.equalsIgnoreCase(name)) {
			set_itm_qty(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, float value) {
		if ($main_itm_qty.equalsIgnoreCase(name)) {
			main_itm_qty(value);
			return;
		}
		if ($set_itm_qty.equalsIgnoreCase(name)) {
			set_itm_qty(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, double value) {
		if ($main_itm_qty.equalsIgnoreCase(name)) {
			main_itm_qty(value);
			return;
		}
		if ($set_itm_qty.equalsIgnoreCase(name)) {
			set_itm_qty(value);
			return;
		}
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
