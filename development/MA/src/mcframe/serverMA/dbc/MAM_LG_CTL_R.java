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
 * "物流制御マスタ // Distribution control master"DBコンテナRowクラスです。<p>
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
 *  	<td>fr_lg_grp_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>出荷元物流グループＣＤ</td>
 *  	<td>Shipping point distribution group cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>to_lg_grp_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>出荷先物流グループＣＤ</td>
 *  	<td>Receiving point distribution group cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>K</td>
 *  	<td>ship_term_cd</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>出荷条件ＣＤ</td>
 *  	<td>Shipping conditions cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>xfr_lt</td>
 *  	<td>N</td>
 *  	<td>9,0</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>移動ＬＴ</td>
 *  	<td>Movement LT</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>fin_cl_time</td>
 *  	<td>C</td>
 *  	<td>4</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>出荷締時刻</td>
 *  	<td>Shipping closing time</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>alloc_days</td>
 *  	<td>N</td>
 *  	<td>3,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>引当可能日数</td>
 *  	<td>Allocatable days</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>iv_trd_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>インボイス取引ＦＬＧ</td>
 *  	<td>Shipping invoice biz flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>def_tdlv_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>標準配送先ＣＤ</td>
 *  	<td>Standard receiving point cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ship_wk_grp_cd</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>出荷作業グループＣＤ</td>
 *  	<td>Shipping operation group cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>non_dmnd_lt_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>需要情報ＬＴ無しＦＬＧ</td>
 *  	<td>Without demand LT flg.</td>
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
 *  	<td>early_ship_dt_add_days</td>
 *  	<td>N</td>
 *  	<td>3,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>最早出荷日加算日数</td>
 *  	<td>Number of days added to earliest shipping date</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>fr_lg_grp_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td>LG_GRP1.LG_GRP_NM</td>
 *  	<td>出荷元物流グループ名</td>
 *  	<td>Shipping point distribution group name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>to_lg_grp_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td>LG_GRP2.LG_GRP_NM</td>
 *  	<td>出荷先物流グループ名</td>
 *  	<td>Receiving point distribution group name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ship_term_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td>SHIP_TERM1.SHIP_TERM_NM</td>
 *  	<td>出荷条件名</td>
 *  	<td>Shipping conditions name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>def_tdlv_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td>BP1.BP_NM</td>
 *  	<td>標準配送先名</td>
 *  	<td>Standard receiving point name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ship_wk_grp_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td>SHIP_WK_GRP1.SHIP_WK_GRP_NM</td>
 *  	<td>出荷作業グループ名</td>
 *  	<td>Shipping operation group name</td>
 *  </tr>
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
public class MAM_LG_CTL_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.CO_VIEW;

	public static final String TABLE_NAME = "MAM_LG_CTL";

	public static final boolean EX_CTRL = true;
	
	public static final boolean LCL_TABLE = false;
	
	/**
	 * 出荷元物流グループＣＤ. Shipping point distribution group cd..<p>
	 *
	 */
	public static final String $fr_lg_grp_cd = "fr_lg_grp_cd";
	private static final MCPermColumnInfo _fr_lg_grp_cd = createColumnInfo("fr_lg_grp_cd");
	public final MCStringPermColumn fr_lg_grp_cd = createStringColumn(_fr_lg_grp_cd);
	
	/**
	 * 出荷先物流グループＣＤ. Receiving point distribution group cd..<p>
	 *
	 */
	public static final String $to_lg_grp_cd = "to_lg_grp_cd";
	private static final MCPermColumnInfo _to_lg_grp_cd = createColumnInfo("to_lg_grp_cd");
	public final MCStringPermColumn to_lg_grp_cd = createStringColumn(_to_lg_grp_cd);
	
	/**
	 * 出荷条件ＣＤ. Shipping conditions cd..<p>
	 *
	 */
	public static final String $ship_term_cd = "ship_term_cd";
	private static final MCPermColumnInfo _ship_term_cd = createColumnInfo("ship_term_cd");
	public final MCStringPermColumn ship_term_cd = createStringColumn(_ship_term_cd);
	
	/**
	 * 移動ＬＴ. Movement LT.<p>
	 *
	 */
	public static final String $xfr_lt = "xfr_lt";
	private static final MCPermColumnInfo _xfr_lt = createColumnInfo("xfr_lt");
	public final MCNumberPermColumn xfr_lt = createNumberColumn(_xfr_lt);
	
	/**
	 * 出荷締時刻. Shipping closing time.<p>
	 *
	 */
	public static final String $fin_cl_time = "fin_cl_time";
	private static final MCPermColumnInfo _fin_cl_time = createColumnInfo("fin_cl_time");
	public final MCStringPermColumn fin_cl_time = createStringColumn(_fin_cl_time);
	
	/**
	 * 引当可能日数. Allocatable days.<p>
	 *
	 */
	public static final String $alloc_days = "alloc_days";
	private static final MCPermColumnInfo _alloc_days = createColumnInfo("alloc_days");
	public final MCNumberPermColumn alloc_days = createNumberColumn(_alloc_days);
	
	/**
	 * インボイス取引ＦＬＧ. Shipping invoice biz flg..<p>
	 *
	 */
	public static final String $iv_trd_flg = "iv_trd_flg";
	private static final MCPermColumnInfo _iv_trd_flg = createColumnInfo("iv_trd_flg");
	public final MCBooleanPermColumn iv_trd_flg = createBooleanColumn(_iv_trd_flg);
	
	/**
	 * 標準配送先ＣＤ. Standard receiving point cd..<p>
	 *
	 */
	public static final String $def_tdlv_cd = "def_tdlv_cd";
	private static final MCPermColumnInfo _def_tdlv_cd = createColumnInfo("def_tdlv_cd");
	public final MCStringPermColumn def_tdlv_cd = createStringColumn(_def_tdlv_cd);
	
	/**
	 * 出荷作業グループＣＤ. Shipping operation group cd..<p>
	 *
	 */
	public static final String $ship_wk_grp_cd = "ship_wk_grp_cd";
	private static final MCPermColumnInfo _ship_wk_grp_cd = createColumnInfo("ship_wk_grp_cd");
	public final MCStringPermColumn ship_wk_grp_cd = createStringColumn(_ship_wk_grp_cd);
	
	/**
	 * 需要情報ＬＴ無しＦＬＧ. Without demand LT flg..<p>
	 *
	 */
	public static final String $non_dmnd_lt_flg = "non_dmnd_lt_flg";
	private static final MCPermColumnInfo _non_dmnd_lt_flg = createColumnInfo("non_dmnd_lt_flg");
	public final MCBooleanPermColumn non_dmnd_lt_flg = createBooleanColumn(_non_dmnd_lt_flg);
	
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
	 * 最早出荷日加算日数. Number of days added to earliest shipping date.<p>
	 *
	 */
	public static final String $early_ship_dt_add_days = "early_ship_dt_add_days";
	private static final MCPermColumnInfo _early_ship_dt_add_days = createColumnInfo("early_ship_dt_add_days");
	public final MCNumberPermColumn early_ship_dt_add_days = createNumberColumn(_early_ship_dt_add_days);
	
	/**
	 * 出荷元物流グループ名. Shipping point distribution group name.<p>
	 *
	 */
	public static final String $fr_lg_grp_nm = "fr_lg_grp_nm";
	
	/**
	 * 出荷先物流グループ名. Receiving point distribution group name.<p>
	 *
	 */
	public static final String $to_lg_grp_nm = "to_lg_grp_nm";
	
	/**
	 * 出荷条件名. Shipping conditions name.<p>
	 *
	 */
	public static final String $ship_term_nm = "ship_term_nm";
	
	/**
	 * 標準配送先名. Standard receiving point name.<p>
	 *
	 */
	public static final String $def_tdlv_nm = "def_tdlv_nm";
	
	/**
	 * 出荷作業グループ名. Shipping operation group name.<p>
	 *
	 */
	public static final String $ship_wk_grp_nm = "ship_wk_grp_nm";
	
	public static final MCMeta fr_lg_grp_cd_META = createCommonMeta($fr_lg_grp_cd, mcframe.commonMA.meta.MA_META.LG_GRP_CD);
	public static final MCMeta to_lg_grp_cd_META = createCommonMeta($to_lg_grp_cd, mcframe.commonMA.meta.MA_META.LG_GRP_CD);
	public static final MCMeta ship_term_cd_META = createCommonMeta($ship_term_cd, mcframe.commonMA.meta.MA_META.SHIP_TERM_CD);
	public static final MCMeta xfr_lt_META = createCommonMeta($xfr_lt, mcframe.commonMA.meta.MA_META.LT);
	public static final MCMeta fin_cl_time_META = createCommonMeta($fin_cl_time, mcframe.commonMA.meta.MA_META.CHAR_HM);
	public static final MCMeta alloc_days_META = createCommonMeta($alloc_days, mcframe.commonMA.meta.MA_META.DAYS);
	public static final MCMeta iv_trd_flg_META = createCommonMeta($iv_trd_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta def_tdlv_cd_META = createCommonMeta($def_tdlv_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta ship_wk_grp_cd_META = createCommonMeta($ship_wk_grp_cd, mcframe.commonMA.meta.MA_META.SHIP_WK_GRP_CD);
	public static final MCMeta non_dmnd_lt_flg_META = createCommonMeta($non_dmnd_lt_flg, mcframe.commonMA.meta.MA_META.FLG);
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
	public static final MCMeta early_ship_dt_add_days_META = createCommonMeta($early_ship_dt_add_days, mcframe.commonMA.meta.MA_META.DAYS);
	public static final MCMeta fr_lg_grp_nm_META = createCommonMeta($fr_lg_grp_nm, mcframe.commonMA.meta.MA_META.LG_GRP_NM);
	public static final MCMeta to_lg_grp_nm_META = createCommonMeta($to_lg_grp_nm, mcframe.commonMA.meta.MA_META.LG_GRP_NM);
	public static final MCMeta ship_term_nm_META = createCommonMeta($ship_term_nm, mcframe.commonMA.meta.MA_META.SHIP_TERM_NM);
	public static final MCMeta def_tdlv_nm_META = createCommonMeta($def_tdlv_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta ship_wk_grp_nm_META = createCommonMeta($ship_wk_grp_nm, mcframe.commonMA.meta.MA_META.SHIP_WK_GRP_NM);

	protected static final List<MCForeignInfo> FOREIGN_INFO_LIST = new ArrayList<>();
	public static final String $LG_GRP1 = "LG_GRP1";
	public static final String $LG_GRP2 = "LG_GRP2";
	public static final String $SHIP_TERM1 = "SHIP_TERM1";
	public static final String $SHIP_WK_GRP1 = "SHIP_WK_GRP1";
	public static final String $BP1 = "BP1";
	static {
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_LG_GRP",
				$LG_GRP1,
				new String[][]{
						{"fr_lg_grp_cd", "lg_grp_cd"}
				},
				() -> {
					return mcframe.serverMA.dbc.MAM_LG_GRP_R.create("LG_GRP1");
				},
				(alias) -> {
					MAM_LG_CTL_R own = MAM_LG_CTL_R.create(alias);
					mcframe.serverMA.dbc.MAM_LG_GRP_R ref = mcframe.serverMA.dbc.MAM_LG_GRP_R.create("LG_GRP1");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.fr_lg_grp_cd.eq(ref.lg_grp_cd));
					return cond;
				}
			)
		);
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_LG_GRP",
				$LG_GRP2,
				new String[][]{
						{"to_lg_grp_cd", "lg_grp_cd"}
				},
				() -> {
					return mcframe.serverMA.dbc.MAM_LG_GRP_R.create("LG_GRP2");
				},
				(alias) -> {
					MAM_LG_CTL_R own = MAM_LG_CTL_R.create(alias);
					mcframe.serverMA.dbc.MAM_LG_GRP_R ref = mcframe.serverMA.dbc.MAM_LG_GRP_R.create("LG_GRP2");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.to_lg_grp_cd.eq(ref.lg_grp_cd));
					return cond;
				}
			)
		);
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_SHIP_TERM",
				$SHIP_TERM1,
				new String[][]{
						{"ship_term_cd", "ship_term_cd"}
				},
				() -> {
					return mcframe.serverMA.dbc.MAM_SHIP_TERM_R.create("SHIP_TERM1");
				},
				(alias) -> {
					MAM_LG_CTL_R own = MAM_LG_CTL_R.create(alias);
					mcframe.serverMA.dbc.MAM_SHIP_TERM_R ref = mcframe.serverMA.dbc.MAM_SHIP_TERM_R.create("SHIP_TERM1");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.ship_term_cd.eq(ref.ship_term_cd));
					return cond;
				}
			)
		);
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_SHIP_WK_GRP",
				$SHIP_WK_GRP1,
				new String[][]{
						{"ship_wk_grp_cd", "ship_wk_grp_cd"}
				},
				() -> {
					return mcframe.serverMA.dbc.MAM_SHIP_WK_GRP_R.create("SHIP_WK_GRP1");
				},
				(alias) -> {
					MAM_LG_CTL_R own = MAM_LG_CTL_R.create(alias);
					mcframe.serverMA.dbc.MAM_SHIP_WK_GRP_R ref = mcframe.serverMA.dbc.MAM_SHIP_WK_GRP_R.create("SHIP_WK_GRP1");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.ship_wk_grp_cd.eq(ref.ship_wk_grp_cd));
					return cond;
				}
			)
		);
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_BP",
				$BP1,
				new String[][]{
						{"def_tdlv_cd", "bp_cd"}
				},
				() -> {
					return mcframe.serverMA.dbc.MAM_BP_R.create("BP1");
				},
				(alias) -> {
					MAM_LG_CTL_R own = MAM_LG_CTL_R.create(alias);
					mcframe.serverMA.dbc.MAM_BP_R ref = mcframe.serverMA.dbc.MAM_BP_R.create("BP1");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.def_tdlv_cd.eq(ref.bp_cd));
					return cond;
				}
			)
		);
	}
	
	protected static final ConstMetaList<MAM_LG_CTL_R> constMetas = new ConstMetaList<MAM_LG_CTL_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			fr_lg_grp_cd_META,
			to_lg_grp_cd_META,
			ship_term_cd_META,
			xfr_lt_META,
			fin_cl_time_META,
			alloc_days_META,
			iv_trd_flg_META,
			def_tdlv_cd_META,
			ship_wk_grp_cd_META,
			non_dmnd_lt_flg_META,
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
			early_ship_dt_add_days_META,
			fr_lg_grp_nm_META,
			to_lg_grp_nm_META,
			ship_term_nm_META,
			def_tdlv_nm_META,
			ship_wk_grp_nm_META
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
	protected MAM_LG_CTL_R(ConstMetaList<? extends MAM_LG_CTL_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MAM_LG_CTL_R(ConstMetaList<? extends MAM_LG_CTL_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MAM_LG_CTL_R.$fr_lg_grp_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_LG_CTL_R.$fr_lg_grp_cd,
				"fr_lg_grp_cd",
				fr_lg_grp_cd,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_LG_CTL_R.$to_lg_grp_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_LG_CTL_R.$to_lg_grp_cd,
				"to_lg_grp_cd",
				to_lg_grp_cd,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_LG_CTL_R.$ship_term_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_LG_CTL_R.$ship_term_cd,
				"ship_term_cd",
				ship_term_cd,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_LG_CTL_R.$xfr_lt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_LG_CTL_R.$xfr_lt,
				"xfr_lt",
				xfr_lt,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_LG_CTL_R.$fin_cl_time,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_LG_CTL_R.$fin_cl_time,
				"fin_cl_time",
				fin_cl_time,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_LG_CTL_R.$alloc_days,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_LG_CTL_R.$alloc_days,
				"alloc_days",
				alloc_days,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_LG_CTL_R.$iv_trd_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_LG_CTL_R.$iv_trd_flg,
				"iv_trd_flg",
				iv_trd_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_LG_CTL_R.$def_tdlv_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_LG_CTL_R.$def_tdlv_cd,
				"def_tdlv_cd",
				def_tdlv_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_LG_CTL_R.$ship_wk_grp_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_LG_CTL_R.$ship_wk_grp_cd,
				"ship_wk_grp_cd",
				ship_wk_grp_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_LG_CTL_R.$non_dmnd_lt_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_LG_CTL_R.$non_dmnd_lt_flg,
				"non_dmnd_lt_flg",
				non_dmnd_lt_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_LG_CTL_R.$memo1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_LG_CTL_R.$memo1,
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
			MAM_LG_CTL_R.$memo2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_LG_CTL_R.$memo2,
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
			MAM_LG_CTL_R.$memo3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_LG_CTL_R.$memo3,
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
			MAM_LG_CTL_R.$del_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_LG_CTL_R.$del_flg,
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
			MAM_LG_CTL_R.$del_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_LG_CTL_R.$del_usr_id,
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
			MAM_LG_CTL_R.$del_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_LG_CTL_R.$del_usr_nm,
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
			MAM_LG_CTL_R.$del_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MAM_LG_CTL_R.$del_ts,
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
			MAM_LG_CTL_R.$ins_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_LG_CTL_R.$ins_usr_id,
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
			MAM_LG_CTL_R.$ins_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_LG_CTL_R.$ins_usr_nm,
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
			MAM_LG_CTL_R.$ins_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MAM_LG_CTL_R.$ins_ts,
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
			MAM_LG_CTL_R.$ins_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_LG_CTL_R.$ins_func_id,
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
			MAM_LG_CTL_R.$upd_cntr,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_LG_CTL_R.$upd_cntr,
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
			MAM_LG_CTL_R.$upd_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_LG_CTL_R.$upd_usr_id,
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
			MAM_LG_CTL_R.$upd_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_LG_CTL_R.$upd_usr_nm,
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
			MAM_LG_CTL_R.$upd_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MAM_LG_CTL_R.$upd_ts,
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
			MAM_LG_CTL_R.$upd_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_LG_CTL_R.$upd_func_id,
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
			MAM_LG_CTL_R.$upd_srv_req_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_LG_CTL_R.$upd_srv_req_no,
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
			MAM_LG_CTL_R.$early_ship_dt_add_days,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_LG_CTL_R.$early_ship_dt_add_days,
				"early_ship_dt_add_days",
				early_ship_dt_add_days,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_LG_CTL_R.$fr_lg_grp_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_LG_CTL_R.$fr_lg_grp_nm,
				"fr_lg_grp_nm",
				null,
				false,
				true,
				false,
				false,
				true,
				"LG_GRP1.LG_GRP_NM"
			)
		);
		COLUMN_MAP.put(
			MAM_LG_CTL_R.$to_lg_grp_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_LG_CTL_R.$to_lg_grp_nm,
				"to_lg_grp_nm",
				null,
				false,
				true,
				false,
				false,
				true,
				"LG_GRP2.LG_GRP_NM"
			)
		);
		COLUMN_MAP.put(
			MAM_LG_CTL_R.$ship_term_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_LG_CTL_R.$ship_term_nm,
				"ship_term_nm",
				null,
				false,
				true,
				false,
				false,
				true,
				"SHIP_TERM1.SHIP_TERM_NM"
			)
		);
		COLUMN_MAP.put(
			MAM_LG_CTL_R.$def_tdlv_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_LG_CTL_R.$def_tdlv_nm,
				"def_tdlv_nm",
				null,
				false,
				true,
				false,
				false,
				true,
				"BP1.BP_NM"
			)
		);
		COLUMN_MAP.put(
			MAM_LG_CTL_R.$ship_wk_grp_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_LG_CTL_R.$ship_wk_grp_nm,
				"ship_wk_grp_nm",
				null,
				false,
				true,
				false,
				false,
				true,
				"SHIP_WK_GRP1.SHIP_WK_GRP_NM"
			)
		);
		return COLUMN_MAP;
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MAM_LG_CTL_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MAM_LG_CTL_R create(String alias) {
		MAM_LG_CTL_R row = new MAM_LG_CTL_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MAM_LG_CTL_R createByName(T proto) {
		MAM_LG_CTL_R row = MAM_LG_CTL_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAM_LG_CTL_R clone() {
		return (MAM_LG_CTL_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAM_LG_CTL_R createInstance() {
		return (MAM_LG_CTL_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAM_LG_CTL_R getValues(String... names) {
		return (MAM_LG_CTL_R) super.getValues(names);
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
	 public MAW_LG_CTL_KEY_R getPkWorkDbc(String alias) {
	 	return MAW_LG_CTL_KEY_R.create(alias);
	 }

	/*
	 * MCDBContainerのオーバーライドメソッドです。
	 */
	 public MAW_LG_CTL_KEY_R getPkWorkDbc() {
	 	return getPkWorkDbc(MAW_LG_CTL_KEY_R.TABLE_NAME);
	 }

	/**
	 * 出荷元物流グループＣＤ. Shipping point distribution group cd..<p>
	 *
	 */
	public String fr_lg_grp_cd() {
		return getConstString(offset + 0, $fr_lg_grp_cd);
	}

	/**
	 * 出荷元物流グループＣＤ. Shipping point distribution group cd..<p>
	 *
	 */
	public void fr_lg_grp_cd(String value) {
		setConstString(offset + 0, $fr_lg_grp_cd, value);
	}

	/**
	 * 出荷先物流グループＣＤ. Receiving point distribution group cd..<p>
	 *
	 */
	public String to_lg_grp_cd() {
		return getConstString(offset + 1, $to_lg_grp_cd);
	}

	/**
	 * 出荷先物流グループＣＤ. Receiving point distribution group cd..<p>
	 *
	 */
	public void to_lg_grp_cd(String value) {
		setConstString(offset + 1, $to_lg_grp_cd, value);
	}

	/**
	 * 出荷条件ＣＤ. Shipping conditions cd..<p>
	 *
	 */
	public String ship_term_cd() {
		return getConstString(offset + 2, $ship_term_cd);
	}

	/**
	 * 出荷条件ＣＤ. Shipping conditions cd..<p>
	 *
	 */
	public void ship_term_cd(String value) {
		setConstString(offset + 2, $ship_term_cd, value);
	}

	/**
	 * 移動ＬＴ. Movement LT.<p>
	 *
	 */
	public MCNumber xfr_lt() {
		return getConstNumber(offset + 3, $xfr_lt);
	}

	/**
	 * 移動ＬＴ. Movement LT.<p>
	 *
	 */
	public void xfr_lt(MCNumber value) {
		setConstNumber(offset + 3, $xfr_lt, value);
	}
	
	/**
	 * 移動ＬＴ. Movement LT.<p>
	 *
	 */
	public void xfr_lt(int value) {
		setConstNumber(offset + 3, $xfr_lt, value);
	}
	
	/**
	 * 移動ＬＴ. Movement LT.<p>
	 *
	 */
	public void xfr_lt(long value) {
		setConstNumber(offset + 3, $xfr_lt, value);
	}
	
	/**
	 * 移動ＬＴ. Movement LT.<p>
	 *
	 */
	public void xfr_lt(float value) {
		setConstNumber(offset + 3, $xfr_lt, value);
	}
	
	/**
	 * 移動ＬＴ. Movement LT.<p>
	 *
	 */
	public void xfr_lt(double value) {
		setConstNumber(offset + 3, $xfr_lt, value);
	}
	
	/**
	 * 出荷締時刻. Shipping closing time.<p>
	 *
	 */
	public String fin_cl_time() {
		return getConstString(offset + 4, $fin_cl_time);
	}

	/**
	 * 出荷締時刻. Shipping closing time.<p>
	 *
	 */
	public void fin_cl_time(String value) {
		setConstString(offset + 4, $fin_cl_time, value);
	}

	/**
	 * 引当可能日数. Allocatable days.<p>
	 *
	 */
	public MCNumber alloc_days() {
		return getConstNumber(offset + 5, $alloc_days);
	}

	/**
	 * 引当可能日数. Allocatable days.<p>
	 *
	 */
	public void alloc_days(MCNumber value) {
		setConstNumber(offset + 5, $alloc_days, value);
	}
	
	/**
	 * 引当可能日数. Allocatable days.<p>
	 *
	 */
	public void alloc_days(int value) {
		setConstNumber(offset + 5, $alloc_days, value);
	}
	
	/**
	 * 引当可能日数. Allocatable days.<p>
	 *
	 */
	public void alloc_days(long value) {
		setConstNumber(offset + 5, $alloc_days, value);
	}
	
	/**
	 * 引当可能日数. Allocatable days.<p>
	 *
	 */
	public void alloc_days(float value) {
		setConstNumber(offset + 5, $alloc_days, value);
	}
	
	/**
	 * 引当可能日数. Allocatable days.<p>
	 *
	 */
	public void alloc_days(double value) {
		setConstNumber(offset + 5, $alloc_days, value);
	}
	
	/**
	 * インボイス取引ＦＬＧ. Shipping invoice biz flg..<p>
	 *
	 */
	public boolean iv_trd_flg() {
		return getConstBoolean(offset + 6, $iv_trd_flg);
	}

	/**
	 * インボイス取引ＦＬＧ. Shipping invoice biz flg..<p>
	 *
	 */
	public void iv_trd_flg(boolean value) {
		setConstBoolean(offset + 6, $iv_trd_flg, value);
	}

	/**
	 * 標準配送先ＣＤ. Standard receiving point cd..<p>
	 *
	 */
	public String def_tdlv_cd() {
		return getConstString(offset + 7, $def_tdlv_cd);
	}

	/**
	 * 標準配送先ＣＤ. Standard receiving point cd..<p>
	 *
	 */
	public void def_tdlv_cd(String value) {
		setConstString(offset + 7, $def_tdlv_cd, value);
	}

	/**
	 * 出荷作業グループＣＤ. Shipping operation group cd..<p>
	 *
	 */
	public String ship_wk_grp_cd() {
		return getConstString(offset + 8, $ship_wk_grp_cd);
	}

	/**
	 * 出荷作業グループＣＤ. Shipping operation group cd..<p>
	 *
	 */
	public void ship_wk_grp_cd(String value) {
		setConstString(offset + 8, $ship_wk_grp_cd, value);
	}

	/**
	 * 需要情報ＬＴ無しＦＬＧ. Without demand LT flg..<p>
	 *
	 */
	public boolean non_dmnd_lt_flg() {
		return getConstBoolean(offset + 9, $non_dmnd_lt_flg);
	}

	/**
	 * 需要情報ＬＴ無しＦＬＧ. Without demand LT flg..<p>
	 *
	 */
	public void non_dmnd_lt_flg(boolean value) {
		setConstBoolean(offset + 9, $non_dmnd_lt_flg, value);
	}

	/**
	 * メモ１. Memo 1.<p>
	 *
	 */
	public String memo1() {
		return getConstString(offset + 10, $memo1);
	}

	/**
	 * メモ１. Memo 1.<p>
	 *
	 */
	public void memo1(String value) {
		setConstString(offset + 10, $memo1, value);
	}

	/**
	 * メモ２. Memo 2.<p>
	 *
	 */
	public String memo2() {
		return getConstString(offset + 11, $memo2);
	}

	/**
	 * メモ２. Memo 2.<p>
	 *
	 */
	public void memo2(String value) {
		setConstString(offset + 11, $memo2, value);
	}

	/**
	 * メモ３. Memo 3.<p>
	 *
	 */
	public String memo3() {
		return getConstString(offset + 12, $memo3);
	}

	/**
	 * メモ３. Memo 3.<p>
	 *
	 */
	public void memo3(String value) {
		setConstString(offset + 12, $memo3, value);
	}

	/**
	 * 論理削除ＦＬＧ. Logical delete flg..<p>
	 *
	 */
	public boolean del_flg() {
		return getConstBoolean(offset + 13, $del_flg);
	}

	/**
	 * 論理削除ＦＬＧ. Logical delete flg..<p>
	 *
	 */
	public void del_flg(boolean value) {
		setConstBoolean(offset + 13, $del_flg, value);
	}

	/**
	 * 論理削除ユーザＩＤ. Logical delete user ID.<p>
	 *
	 */
	public String del_usr_id() {
		return getConstString(offset + 14, $del_usr_id);
	}

	/**
	 * 論理削除ユーザＩＤ. Logical delete user ID.<p>
	 *
	 */
	public void del_usr_id(String value) {
		setConstString(offset + 14, $del_usr_id, value);
	}

	/**
	 * 論理削除ユーザ名. Logical delete user name.<p>
	 *
	 */
	public String del_usr_nm() {
		return getConstString(offset + 15, $del_usr_nm);
	}

	/**
	 * 論理削除ユーザ名. Logical delete user name.<p>
	 *
	 */
	public void del_usr_nm(String value) {
		setConstString(offset + 15, $del_usr_nm, value);
	}

	/**
	 * 論理削除日時. Logical delete date and time.<p>
	 *
	 */
	public MCTimestamp del_ts() {
		return getConstTimestamp(offset + 16, $del_ts);
	}

	/**
	 * 論理削除日時. Logical delete date and time.<p>
	 *
	 */
	public void del_ts(MCTimestamp value) {
		setConstTimestamp(offset + 16, $del_ts, value);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 17, $ins_usr_id);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 17, $ins_usr_id, value);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 18, $ins_usr_nm);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 18, $ins_usr_nm, value);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 19, $ins_ts);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 19, $ins_ts, value);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 20, $ins_func_id);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 20, $ins_func_id, value);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 21, $upd_cntr);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 21, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 21, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 21, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 21, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 21, $upd_cntr, value);
	}
	
	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 22, $upd_usr_id);
	}

	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 22, $upd_usr_id, value);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 23, $upd_usr_nm);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 23, $upd_usr_nm, value);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 24, $upd_ts);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 24, $upd_ts, value);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 25, $upd_func_id);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 25, $upd_func_id, value);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 26, $upd_srv_req_no);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 26, $upd_srv_req_no, value);
	}

	/**
	 * 最早出荷日加算日数. Number of days added to earliest shipping date.<p>
	 *
	 */
	public MCNumber early_ship_dt_add_days() {
		return getConstNumber(offset + 27, $early_ship_dt_add_days);
	}

	/**
	 * 最早出荷日加算日数. Number of days added to earliest shipping date.<p>
	 *
	 */
	public void early_ship_dt_add_days(MCNumber value) {
		setConstNumber(offset + 27, $early_ship_dt_add_days, value);
	}
	
	/**
	 * 最早出荷日加算日数. Number of days added to earliest shipping date.<p>
	 *
	 */
	public void early_ship_dt_add_days(int value) {
		setConstNumber(offset + 27, $early_ship_dt_add_days, value);
	}
	
	/**
	 * 最早出荷日加算日数. Number of days added to earliest shipping date.<p>
	 *
	 */
	public void early_ship_dt_add_days(long value) {
		setConstNumber(offset + 27, $early_ship_dt_add_days, value);
	}
	
	/**
	 * 最早出荷日加算日数. Number of days added to earliest shipping date.<p>
	 *
	 */
	public void early_ship_dt_add_days(float value) {
		setConstNumber(offset + 27, $early_ship_dt_add_days, value);
	}
	
	/**
	 * 最早出荷日加算日数. Number of days added to earliest shipping date.<p>
	 *
	 */
	public void early_ship_dt_add_days(double value) {
		setConstNumber(offset + 27, $early_ship_dt_add_days, value);
	}
	
	/**
	 * 出荷元物流グループ名. Shipping point distribution group name.<p>
	 *
	 */
	public String fr_lg_grp_nm() {
		return getConstString(offset + 28, $fr_lg_grp_nm);
	}

	/**
	 * 出荷元物流グループ名. Shipping point distribution group name.<p>
	 *
	 */
	public void fr_lg_grp_nm(String value) {
		setConstString(offset + 28, $fr_lg_grp_nm, value);
	}

	/**
	 * 出荷先物流グループ名. Receiving point distribution group name.<p>
	 *
	 */
	public String to_lg_grp_nm() {
		return getConstString(offset + 29, $to_lg_grp_nm);
	}

	/**
	 * 出荷先物流グループ名. Receiving point distribution group name.<p>
	 *
	 */
	public void to_lg_grp_nm(String value) {
		setConstString(offset + 29, $to_lg_grp_nm, value);
	}

	/**
	 * 出荷条件名. Shipping conditions name.<p>
	 *
	 */
	public String ship_term_nm() {
		return getConstString(offset + 30, $ship_term_nm);
	}

	/**
	 * 出荷条件名. Shipping conditions name.<p>
	 *
	 */
	public void ship_term_nm(String value) {
		setConstString(offset + 30, $ship_term_nm, value);
	}

	/**
	 * 標準配送先名. Standard receiving point name.<p>
	 *
	 */
	public String def_tdlv_nm() {
		return getConstString(offset + 31, $def_tdlv_nm);
	}

	/**
	 * 標準配送先名. Standard receiving point name.<p>
	 *
	 */
	public void def_tdlv_nm(String value) {
		setConstString(offset + 31, $def_tdlv_nm, value);
	}

	/**
	 * 出荷作業グループ名. Shipping operation group name.<p>
	 *
	 */
	public String ship_wk_grp_nm() {
		return getConstString(offset + 32, $ship_wk_grp_nm);
	}

	/**
	 * 出荷作業グループ名. Shipping operation group name.<p>
	 *
	 */
	public void ship_wk_grp_nm(String value) {
		setConstString(offset + 32, $ship_wk_grp_nm, value);
	}

	public String getString(String name) {
		if ($fr_lg_grp_cd.equalsIgnoreCase(name)) {
			return fr_lg_grp_cd();
		}
		if ($to_lg_grp_cd.equalsIgnoreCase(name)) {
			return to_lg_grp_cd();
		}
		if ($ship_term_cd.equalsIgnoreCase(name)) {
			return ship_term_cd();
		}
		if ($fin_cl_time.equalsIgnoreCase(name)) {
			return fin_cl_time();
		}
		if ($def_tdlv_cd.equalsIgnoreCase(name)) {
			return def_tdlv_cd();
		}
		if ($ship_wk_grp_cd.equalsIgnoreCase(name)) {
			return ship_wk_grp_cd();
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
		if ($fr_lg_grp_nm.equalsIgnoreCase(name)) {
			return fr_lg_grp_nm();
		}
		if ($to_lg_grp_nm.equalsIgnoreCase(name)) {
			return to_lg_grp_nm();
		}
		if ($ship_term_nm.equalsIgnoreCase(name)) {
			return ship_term_nm();
		}
		if ($def_tdlv_nm.equalsIgnoreCase(name)) {
			return def_tdlv_nm();
		}
		if ($ship_wk_grp_nm.equalsIgnoreCase(name)) {
			return ship_wk_grp_nm();
		}
		return super.getString(name);
	}

	public MCNumber getNumber(String name) {
		if ($xfr_lt.equalsIgnoreCase(name)) {
			return xfr_lt();
		}
		if ($alloc_days.equalsIgnoreCase(name)) {
			return alloc_days();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		if ($early_ship_dt_add_days.equalsIgnoreCase(name)) {
			return early_ship_dt_add_days();
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
		if ($iv_trd_flg.equalsIgnoreCase(name)) {
			return iv_trd_flg();
		}
		if ($non_dmnd_lt_flg.equalsIgnoreCase(name)) {
			return non_dmnd_lt_flg();
		}
		if ($del_flg.equalsIgnoreCase(name)) {
			return del_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($fr_lg_grp_cd.equalsIgnoreCase(name)) {
			return fr_lg_grp_cd();
		}
		if ($to_lg_grp_cd.equalsIgnoreCase(name)) {
			return to_lg_grp_cd();
		}
		if ($ship_term_cd.equalsIgnoreCase(name)) {
			return ship_term_cd();
		}
		if ($fin_cl_time.equalsIgnoreCase(name)) {
			return fin_cl_time();
		}
		if ($def_tdlv_cd.equalsIgnoreCase(name)) {
			return def_tdlv_cd();
		}
		if ($ship_wk_grp_cd.equalsIgnoreCase(name)) {
			return ship_wk_grp_cd();
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
		if ($fr_lg_grp_nm.equalsIgnoreCase(name)) {
			return fr_lg_grp_nm();
		}
		if ($to_lg_grp_nm.equalsIgnoreCase(name)) {
			return to_lg_grp_nm();
		}
		if ($ship_term_nm.equalsIgnoreCase(name)) {
			return ship_term_nm();
		}
		if ($def_tdlv_nm.equalsIgnoreCase(name)) {
			return def_tdlv_nm();
		}
		if ($ship_wk_grp_nm.equalsIgnoreCase(name)) {
			return ship_wk_grp_nm();
		}
		return super.getStringNE(name);
	}

	public MCNumber getNumberNE(String name) {
		if ($xfr_lt.equalsIgnoreCase(name)) {
			return xfr_lt();
		}
		if ($alloc_days.equalsIgnoreCase(name)) {
			return alloc_days();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		if ($early_ship_dt_add_days.equalsIgnoreCase(name)) {
			return early_ship_dt_add_days();
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
		if ($iv_trd_flg.equalsIgnoreCase(name)) {
			return iv_trd_flg();
		}
		if ($non_dmnd_lt_flg.equalsIgnoreCase(name)) {
			return non_dmnd_lt_flg();
		}
		if ($del_flg.equalsIgnoreCase(name)) {
			return del_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($fr_lg_grp_cd.equalsIgnoreCase(name)) {
			fr_lg_grp_cd(value);
			return;
		}
		if ($to_lg_grp_cd.equalsIgnoreCase(name)) {
			to_lg_grp_cd(value);
			return;
		}
		if ($ship_term_cd.equalsIgnoreCase(name)) {
			ship_term_cd(value);
			return;
		}
		if ($fin_cl_time.equalsIgnoreCase(name)) {
			fin_cl_time(value);
			return;
		}
		if ($def_tdlv_cd.equalsIgnoreCase(name)) {
			def_tdlv_cd(value);
			return;
		}
		if ($ship_wk_grp_cd.equalsIgnoreCase(name)) {
			ship_wk_grp_cd(value);
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
		if ($fr_lg_grp_nm.equalsIgnoreCase(name)) {
			fr_lg_grp_nm(value);
			return;
		}
		if ($to_lg_grp_nm.equalsIgnoreCase(name)) {
			to_lg_grp_nm(value);
			return;
		}
		if ($ship_term_nm.equalsIgnoreCase(name)) {
			ship_term_nm(value);
			return;
		}
		if ($def_tdlv_nm.equalsIgnoreCase(name)) {
			def_tdlv_nm(value);
			return;
		}
		if ($ship_wk_grp_nm.equalsIgnoreCase(name)) {
			ship_wk_grp_nm(value);
			return;
		}
		super.setString(name, value);
	}

	public void setNumber(String name, MCNumber value) {
		if ($xfr_lt.equalsIgnoreCase(name)) {
			xfr_lt(value);
			return;
		}
		if ($alloc_days.equalsIgnoreCase(name)) {
			alloc_days(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		if ($early_ship_dt_add_days.equalsIgnoreCase(name)) {
			early_ship_dt_add_days(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, int value) {
		if ($xfr_lt.equalsIgnoreCase(name)) {
			xfr_lt(value);
			return;
		}
		if ($alloc_days.equalsIgnoreCase(name)) {
			alloc_days(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		if ($early_ship_dt_add_days.equalsIgnoreCase(name)) {
			early_ship_dt_add_days(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, long value) {
		if ($xfr_lt.equalsIgnoreCase(name)) {
			xfr_lt(value);
			return;
		}
		if ($alloc_days.equalsIgnoreCase(name)) {
			alloc_days(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		if ($early_ship_dt_add_days.equalsIgnoreCase(name)) {
			early_ship_dt_add_days(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, float value) {
		if ($xfr_lt.equalsIgnoreCase(name)) {
			xfr_lt(value);
			return;
		}
		if ($alloc_days.equalsIgnoreCase(name)) {
			alloc_days(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		if ($early_ship_dt_add_days.equalsIgnoreCase(name)) {
			early_ship_dt_add_days(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, double value) {
		if ($xfr_lt.equalsIgnoreCase(name)) {
			xfr_lt(value);
			return;
		}
		if ($alloc_days.equalsIgnoreCase(name)) {
			alloc_days(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		if ($early_ship_dt_add_days.equalsIgnoreCase(name)) {
			early_ship_dt_add_days(value);
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
		if ($iv_trd_flg.equalsIgnoreCase(name)) {
			iv_trd_flg(value);
			return;
		}
		if ($non_dmnd_lt_flg.equalsIgnoreCase(name)) {
			non_dmnd_lt_flg(value);
			return;
		}
		if ($del_flg.equalsIgnoreCase(name)) {
			del_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($fr_lg_grp_cd.equalsIgnoreCase(name)) {
			fr_lg_grp_cd(value);
			return;
		}
		if ($to_lg_grp_cd.equalsIgnoreCase(name)) {
			to_lg_grp_cd(value);
			return;
		}
		if ($ship_term_cd.equalsIgnoreCase(name)) {
			ship_term_cd(value);
			return;
		}
		if ($fin_cl_time.equalsIgnoreCase(name)) {
			fin_cl_time(value);
			return;
		}
		if ($def_tdlv_cd.equalsIgnoreCase(name)) {
			def_tdlv_cd(value);
			return;
		}
		if ($ship_wk_grp_cd.equalsIgnoreCase(name)) {
			ship_wk_grp_cd(value);
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
		if ($fr_lg_grp_nm.equalsIgnoreCase(name)) {
			fr_lg_grp_nm(value);
			return;
		}
		if ($to_lg_grp_nm.equalsIgnoreCase(name)) {
			to_lg_grp_nm(value);
			return;
		}
		if ($ship_term_nm.equalsIgnoreCase(name)) {
			ship_term_nm(value);
			return;
		}
		if ($def_tdlv_nm.equalsIgnoreCase(name)) {
			def_tdlv_nm(value);
			return;
		}
		if ($ship_wk_grp_nm.equalsIgnoreCase(name)) {
			ship_wk_grp_nm(value);
			return;
		}
		super.setStringNE(name, value);
	}

	public void setNumberNE(String name, MCNumber value) {
		if ($xfr_lt.equalsIgnoreCase(name)) {
			xfr_lt(value);
			return;
		}
		if ($alloc_days.equalsIgnoreCase(name)) {
			alloc_days(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		if ($early_ship_dt_add_days.equalsIgnoreCase(name)) {
			early_ship_dt_add_days(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, int value) {
		if ($xfr_lt.equalsIgnoreCase(name)) {
			xfr_lt(value);
			return;
		}
		if ($alloc_days.equalsIgnoreCase(name)) {
			alloc_days(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		if ($early_ship_dt_add_days.equalsIgnoreCase(name)) {
			early_ship_dt_add_days(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, long value) {
		if ($xfr_lt.equalsIgnoreCase(name)) {
			xfr_lt(value);
			return;
		}
		if ($alloc_days.equalsIgnoreCase(name)) {
			alloc_days(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		if ($early_ship_dt_add_days.equalsIgnoreCase(name)) {
			early_ship_dt_add_days(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, float value) {
		if ($xfr_lt.equalsIgnoreCase(name)) {
			xfr_lt(value);
			return;
		}
		if ($alloc_days.equalsIgnoreCase(name)) {
			alloc_days(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		if ($early_ship_dt_add_days.equalsIgnoreCase(name)) {
			early_ship_dt_add_days(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, double value) {
		if ($xfr_lt.equalsIgnoreCase(name)) {
			xfr_lt(value);
			return;
		}
		if ($alloc_days.equalsIgnoreCase(name)) {
			alloc_days(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		if ($early_ship_dt_add_days.equalsIgnoreCase(name)) {
			early_ship_dt_add_days(value);
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
		if ($iv_trd_flg.equalsIgnoreCase(name)) {
			iv_trd_flg(value);
			return;
		}
		if ($non_dmnd_lt_flg.equalsIgnoreCase(name)) {
			non_dmnd_lt_flg(value);
			return;
		}
		if ($del_flg.equalsIgnoreCase(name)) {
			del_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

}
