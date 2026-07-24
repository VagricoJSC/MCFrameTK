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
 * "更新可能物流グループマスタ // Updatable distribution group master"DBコンテナRowクラスです。<p>
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
 *  	<td>lg_grp_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>物流グループＣＤ</td>
 *  	<td>Distribution group cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>lg_grp_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>物流グループ名</td>
 *  	<td>Distribution group name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>base_lg_grp_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>物流グループ名（ベース）</td>
 *  	<td>Distribution group name(Base)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>loc_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>場所設定ＦＬＧ</td>
 *  	<td>Location setting flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>wg_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ワーキンググループＣＤ</td>
 *  	<td>WG cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ship_slip_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>出荷伝票発行ＦＬＧ</td>
 *  	<td>Shipping slip issue flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>pick_list_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>ピッキングリスト発行ＦＬＧ</td>
 *  	<td>Picking list issue flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ship_inst_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>出荷指図書発行ＦＬＧ</td>
 *  	<td>Shipping order sheet issue flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ship_slip_act_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>出荷伝票発行（実績）ＦＬＧ</td>
 *  	<td>Shipping slip issue (Result) flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>cal_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>カレンダＣＤ</td>
 *  	<td>Calendar cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>site_co_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>倉庫事業者ＣＤ</td>
 *  	<td>Warehousing business cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>gi_minus_stk_chk_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>出庫時マイナス在庫確認ＦＬＧ</td>
 *  	<td>Check negative inventory at GI flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ship_loc_prio_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>出荷場所優先ＦＬＧ</td>
 *  	<td>Shipping location priority flg.</td>
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
public class MAVM_WR_LG_GRP_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.VIEW;

	public static final String TABLE_NAME = "MAVM_WR_LG_GRP";

	public static final boolean EX_CTRL = false;
	
	public static final boolean LCL_TABLE = false;
	
	/**
	 * 物流グループＣＤ. Distribution group cd..<p>
	 *
	 */
	public static final String $lg_grp_cd = "lg_grp_cd";
	private static final MCPermColumnInfo _lg_grp_cd = createColumnInfo("lg_grp_cd");
	public final MCStringPermColumn lg_grp_cd = createStringColumn(_lg_grp_cd);
	
	/**
	 * 物流グループ名. Distribution group name.<p>
	 *
	 */
	public static final String $lg_grp_nm = "lg_grp_nm";
	private static final MCPermColumnInfo _lg_grp_nm = createColumnInfo("lg_grp_nm");
	public final MCStringPermColumn lg_grp_nm = createStringColumn(_lg_grp_nm);
	
	/**
	 * 物流グループ名（ベース）. Distribution group name(Base).<p>
	 *
	 */
	public static final String $base_lg_grp_nm = "base_lg_grp_nm";
	private static final MCPermColumnInfo _base_lg_grp_nm = createColumnInfo("base_lg_grp_nm");
	public final MCStringPermColumn base_lg_grp_nm = createStringColumn(_base_lg_grp_nm);
	
	/**
	 * 場所設定ＦＬＧ. Location setting flg..<p>
	 *
	 */
	public static final String $loc_flg = "loc_flg";
	private static final MCPermColumnInfo _loc_flg = createColumnInfo("loc_flg");
	public final MCBooleanPermColumn loc_flg = createBooleanColumn(_loc_flg);
	
	/**
	 * ワーキンググループＣＤ. WG cd..<p>
	 *
	 */
	public static final String $wg_cd = "wg_cd";
	private static final MCPermColumnInfo _wg_cd = createColumnInfo("wg_cd");
	public final MCStringPermColumn wg_cd = createStringColumn(_wg_cd);
	
	/**
	 * 出荷伝票発行ＦＬＧ. Shipping slip issue flg..<p>
	 *
	 */
	public static final String $ship_slip_flg = "ship_slip_flg";
	private static final MCPermColumnInfo _ship_slip_flg = createColumnInfo("ship_slip_flg");
	public final MCBooleanPermColumn ship_slip_flg = createBooleanColumn(_ship_slip_flg);
	
	/**
	 * ピッキングリスト発行ＦＬＧ. Picking list issue flg..<p>
	 *
	 */
	public static final String $pick_list_flg = "pick_list_flg";
	private static final MCPermColumnInfo _pick_list_flg = createColumnInfo("pick_list_flg");
	public final MCBooleanPermColumn pick_list_flg = createBooleanColumn(_pick_list_flg);
	
	/**
	 * 出荷指図書発行ＦＬＧ. Shipping order sheet issue flg..<p>
	 *
	 */
	public static final String $ship_inst_flg = "ship_inst_flg";
	private static final MCPermColumnInfo _ship_inst_flg = createColumnInfo("ship_inst_flg");
	public final MCBooleanPermColumn ship_inst_flg = createBooleanColumn(_ship_inst_flg);
	
	/**
	 * 出荷伝票発行（実績）ＦＬＧ. Shipping slip issue (Result) flg..<p>
	 *
	 */
	public static final String $ship_slip_act_flg = "ship_slip_act_flg";
	private static final MCPermColumnInfo _ship_slip_act_flg = createColumnInfo("ship_slip_act_flg");
	public final MCBooleanPermColumn ship_slip_act_flg = createBooleanColumn(_ship_slip_act_flg);
	
	/**
	 * カレンダＣＤ. Calendar cd..<p>
	 *
	 */
	public static final String $cal_cd = "cal_cd";
	private static final MCPermColumnInfo _cal_cd = createColumnInfo("cal_cd");
	public final MCStringPermColumn cal_cd = createStringColumn(_cal_cd);
	
	/**
	 * 倉庫事業者ＣＤ. Warehousing business cd..<p>
	 *
	 */
	public static final String $site_co_cd = "site_co_cd";
	private static final MCPermColumnInfo _site_co_cd = createColumnInfo("site_co_cd");
	public final MCStringPermColumn site_co_cd = createStringColumn(_site_co_cd);
	
	/**
	 * 出庫時マイナス在庫確認ＦＬＧ. Check negative inventory at GI flg..<p>
	 *
	 */
	public static final String $gi_minus_stk_chk_flg = "gi_minus_stk_chk_flg";
	private static final MCPermColumnInfo _gi_minus_stk_chk_flg = createColumnInfo("gi_minus_stk_chk_flg");
	public final MCBooleanPermColumn gi_minus_stk_chk_flg = createBooleanColumn(_gi_minus_stk_chk_flg);
	
	/**
	 * 出荷場所優先ＦＬＧ. Shipping location priority flg..<p>
	 *
	 */
	public static final String $ship_loc_prio_flg = "ship_loc_prio_flg";
	private static final MCPermColumnInfo _ship_loc_prio_flg = createColumnInfo("ship_loc_prio_flg");
	public final MCBooleanPermColumn ship_loc_prio_flg = createBooleanColumn(_ship_loc_prio_flg);
	
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
	
	public static final MCMeta lg_grp_cd_META = createCommonMeta($lg_grp_cd, mcframe.commonMA.meta.MA_META.LG_GRP_CD);
	public static final MCMeta lg_grp_nm_META = createCommonMeta($lg_grp_nm, mcframe.commonMA.meta.MA_META.LG_GRP_NM);
	public static final MCMeta base_lg_grp_nm_META = createCommonMeta($base_lg_grp_nm, mcframe.commonMA.meta.MA_META.LG_GRP_NM);
	public static final MCMeta loc_flg_META = createCommonMeta($loc_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta ship_slip_flg_META = createCommonMeta($ship_slip_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta pick_list_flg_META = createCommonMeta($pick_list_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ship_inst_flg_META = createCommonMeta($ship_inst_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ship_slip_act_flg_META = createCommonMeta($ship_slip_act_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cal_cd_META = createCommonMeta($cal_cd, mcframe.commonMA.meta.MA_META.CAL_CD);
	public static final MCMeta site_co_cd_META = createCommonMeta($site_co_cd, mcframe.commonMA.meta.MA_META.SITE_CO_CD);
	public static final MCMeta gi_minus_stk_chk_flg_META = createCommonMeta($gi_minus_stk_chk_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ship_loc_prio_flg_META = createCommonMeta($ship_loc_prio_flg, mcframe.commonMA.meta.MA_META.FLG);
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
	
	protected static final ConstMetaList<MAVM_WR_LG_GRP_R> constMetas = new ConstMetaList<MAVM_WR_LG_GRP_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			lg_grp_cd_META,
			lg_grp_nm_META,
			base_lg_grp_nm_META,
			loc_flg_META,
			wg_cd_META,
			ship_slip_flg_META,
			pick_list_flg_META,
			ship_inst_flg_META,
			ship_slip_act_flg_META,
			cal_cd_META,
			site_co_cd_META,
			gi_minus_stk_chk_flg_META,
			ship_loc_prio_flg_META,
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
	protected MAVM_WR_LG_GRP_R(ConstMetaList<? extends MAVM_WR_LG_GRP_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MAVM_WR_LG_GRP_R(ConstMetaList<? extends MAVM_WR_LG_GRP_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MAVM_WR_LG_GRP_R.$lg_grp_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_WR_LG_GRP_R.$lg_grp_cd,
				"lg_grp_cd",
				lg_grp_cd,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_WR_LG_GRP_R.$lg_grp_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_WR_LG_GRP_R.$lg_grp_nm,
				"lg_grp_nm",
				lg_grp_nm,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_WR_LG_GRP_R.$base_lg_grp_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_WR_LG_GRP_R.$base_lg_grp_nm,
				"base_lg_grp_nm",
				base_lg_grp_nm,
				false,
				false,
				true,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_WR_LG_GRP_R.$loc_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAVM_WR_LG_GRP_R.$loc_flg,
				"loc_flg",
				loc_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_WR_LG_GRP_R.$wg_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_WR_LG_GRP_R.$wg_cd,
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
			MAVM_WR_LG_GRP_R.$ship_slip_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAVM_WR_LG_GRP_R.$ship_slip_flg,
				"ship_slip_flg",
				ship_slip_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_WR_LG_GRP_R.$pick_list_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAVM_WR_LG_GRP_R.$pick_list_flg,
				"pick_list_flg",
				pick_list_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_WR_LG_GRP_R.$ship_inst_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAVM_WR_LG_GRP_R.$ship_inst_flg,
				"ship_inst_flg",
				ship_inst_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_WR_LG_GRP_R.$ship_slip_act_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAVM_WR_LG_GRP_R.$ship_slip_act_flg,
				"ship_slip_act_flg",
				ship_slip_act_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_WR_LG_GRP_R.$cal_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_WR_LG_GRP_R.$cal_cd,
				"cal_cd",
				cal_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_WR_LG_GRP_R.$site_co_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_WR_LG_GRP_R.$site_co_cd,
				"site_co_cd",
				site_co_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_WR_LG_GRP_R.$gi_minus_stk_chk_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAVM_WR_LG_GRP_R.$gi_minus_stk_chk_flg,
				"gi_minus_stk_chk_flg",
				gi_minus_stk_chk_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_WR_LG_GRP_R.$ship_loc_prio_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAVM_WR_LG_GRP_R.$ship_loc_prio_flg,
				"ship_loc_prio_flg",
				ship_loc_prio_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_WR_LG_GRP_R.$memo1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_WR_LG_GRP_R.$memo1,
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
			MAVM_WR_LG_GRP_R.$memo2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_WR_LG_GRP_R.$memo2,
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
			MAVM_WR_LG_GRP_R.$memo3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_WR_LG_GRP_R.$memo3,
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
			MAVM_WR_LG_GRP_R.$del_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAVM_WR_LG_GRP_R.$del_flg,
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
			MAVM_WR_LG_GRP_R.$del_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_WR_LG_GRP_R.$del_usr_id,
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
			MAVM_WR_LG_GRP_R.$del_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_WR_LG_GRP_R.$del_usr_nm,
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
			MAVM_WR_LG_GRP_R.$del_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MAVM_WR_LG_GRP_R.$del_ts,
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
			MAVM_WR_LG_GRP_R.$ins_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_WR_LG_GRP_R.$ins_usr_id,
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
			MAVM_WR_LG_GRP_R.$ins_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_WR_LG_GRP_R.$ins_usr_nm,
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
			MAVM_WR_LG_GRP_R.$ins_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MAVM_WR_LG_GRP_R.$ins_ts,
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
			MAVM_WR_LG_GRP_R.$ins_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_WR_LG_GRP_R.$ins_func_id,
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
			MAVM_WR_LG_GRP_R.$upd_cntr,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAVM_WR_LG_GRP_R.$upd_cntr,
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
			MAVM_WR_LG_GRP_R.$upd_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_WR_LG_GRP_R.$upd_usr_id,
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
			MAVM_WR_LG_GRP_R.$upd_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_WR_LG_GRP_R.$upd_usr_nm,
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
			MAVM_WR_LG_GRP_R.$upd_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MAVM_WR_LG_GRP_R.$upd_ts,
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
			MAVM_WR_LG_GRP_R.$upd_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_WR_LG_GRP_R.$upd_func_id,
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
			MAVM_WR_LG_GRP_R.$upd_srv_req_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_WR_LG_GRP_R.$upd_srv_req_no,
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
	public static MAVM_WR_LG_GRP_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MAVM_WR_LG_GRP_R create(String alias) {
		MAVM_WR_LG_GRP_R row = new MAVM_WR_LG_GRP_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MAVM_WR_LG_GRP_R createByName(T proto) {
		MAVM_WR_LG_GRP_R row = MAVM_WR_LG_GRP_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAVM_WR_LG_GRP_R clone() {
		return (MAVM_WR_LG_GRP_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAVM_WR_LG_GRP_R createInstance() {
		return (MAVM_WR_LG_GRP_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAVM_WR_LG_GRP_R getValues(String... names) {
		return (MAVM_WR_LG_GRP_R) super.getValues(names);
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
	 * 物流グループＣＤ. Distribution group cd..<p>
	 *
	 */
	public String lg_grp_cd() {
		return getConstString(offset + 0, $lg_grp_cd);
	}

	/**
	 * 物流グループＣＤ. Distribution group cd..<p>
	 *
	 */
	public void lg_grp_cd(String value) {
		setConstString(offset + 0, $lg_grp_cd, value);
	}

	/**
	 * 物流グループ名. Distribution group name.<p>
	 *
	 */
	public String lg_grp_nm() {
		return getConstString(offset + 1, $lg_grp_nm);
	}

	/**
	 * 物流グループ名. Distribution group name.<p>
	 *
	 */
	public void lg_grp_nm(String value) {
		setConstString(offset + 1, $lg_grp_nm, value);
	}

	/**
	 * 物流グループ名（ベース）. Distribution group name(Base).<p>
	 *
	 */
	public String base_lg_grp_nm() {
		return getConstString(offset + 2, $base_lg_grp_nm);
	}

	/**
	 * 物流グループ名（ベース）. Distribution group name(Base).<p>
	 *
	 */
	public void base_lg_grp_nm(String value) {
		setConstString(offset + 2, $base_lg_grp_nm, value);
	}

	/**
	 * 場所設定ＦＬＧ. Location setting flg..<p>
	 *
	 */
	public boolean loc_flg() {
		return getConstBoolean(offset + 3, $loc_flg);
	}

	/**
	 * 場所設定ＦＬＧ. Location setting flg..<p>
	 *
	 */
	public void loc_flg(boolean value) {
		setConstBoolean(offset + 3, $loc_flg, value);
	}

	/**
	 * ワーキンググループＣＤ. WG cd..<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 4, $wg_cd);
	}

	/**
	 * ワーキンググループＣＤ. WG cd..<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 4, $wg_cd, value);
	}

	/**
	 * 出荷伝票発行ＦＬＧ. Shipping slip issue flg..<p>
	 *
	 */
	public boolean ship_slip_flg() {
		return getConstBoolean(offset + 5, $ship_slip_flg);
	}

	/**
	 * 出荷伝票発行ＦＬＧ. Shipping slip issue flg..<p>
	 *
	 */
	public void ship_slip_flg(boolean value) {
		setConstBoolean(offset + 5, $ship_slip_flg, value);
	}

	/**
	 * ピッキングリスト発行ＦＬＧ. Picking list issue flg..<p>
	 *
	 */
	public boolean pick_list_flg() {
		return getConstBoolean(offset + 6, $pick_list_flg);
	}

	/**
	 * ピッキングリスト発行ＦＬＧ. Picking list issue flg..<p>
	 *
	 */
	public void pick_list_flg(boolean value) {
		setConstBoolean(offset + 6, $pick_list_flg, value);
	}

	/**
	 * 出荷指図書発行ＦＬＧ. Shipping order sheet issue flg..<p>
	 *
	 */
	public boolean ship_inst_flg() {
		return getConstBoolean(offset + 7, $ship_inst_flg);
	}

	/**
	 * 出荷指図書発行ＦＬＧ. Shipping order sheet issue flg..<p>
	 *
	 */
	public void ship_inst_flg(boolean value) {
		setConstBoolean(offset + 7, $ship_inst_flg, value);
	}

	/**
	 * 出荷伝票発行（実績）ＦＬＧ. Shipping slip issue (Result) flg..<p>
	 *
	 */
	public boolean ship_slip_act_flg() {
		return getConstBoolean(offset + 8, $ship_slip_act_flg);
	}

	/**
	 * 出荷伝票発行（実績）ＦＬＧ. Shipping slip issue (Result) flg..<p>
	 *
	 */
	public void ship_slip_act_flg(boolean value) {
		setConstBoolean(offset + 8, $ship_slip_act_flg, value);
	}

	/**
	 * カレンダＣＤ. Calendar cd..<p>
	 *
	 */
	public String cal_cd() {
		return getConstString(offset + 9, $cal_cd);
	}

	/**
	 * カレンダＣＤ. Calendar cd..<p>
	 *
	 */
	public void cal_cd(String value) {
		setConstString(offset + 9, $cal_cd, value);
	}

	/**
	 * 倉庫事業者ＣＤ. Warehousing business cd..<p>
	 *
	 */
	public String site_co_cd() {
		return getConstString(offset + 10, $site_co_cd);
	}

	/**
	 * 倉庫事業者ＣＤ. Warehousing business cd..<p>
	 *
	 */
	public void site_co_cd(String value) {
		setConstString(offset + 10, $site_co_cd, value);
	}

	/**
	 * 出庫時マイナス在庫確認ＦＬＧ. Check negative inventory at GI flg..<p>
	 *
	 */
	public boolean gi_minus_stk_chk_flg() {
		return getConstBoolean(offset + 11, $gi_minus_stk_chk_flg);
	}

	/**
	 * 出庫時マイナス在庫確認ＦＬＧ. Check negative inventory at GI flg..<p>
	 *
	 */
	public void gi_minus_stk_chk_flg(boolean value) {
		setConstBoolean(offset + 11, $gi_minus_stk_chk_flg, value);
	}

	/**
	 * 出荷場所優先ＦＬＧ. Shipping location priority flg..<p>
	 *
	 */
	public boolean ship_loc_prio_flg() {
		return getConstBoolean(offset + 12, $ship_loc_prio_flg);
	}

	/**
	 * 出荷場所優先ＦＬＧ. Shipping location priority flg..<p>
	 *
	 */
	public void ship_loc_prio_flg(boolean value) {
		setConstBoolean(offset + 12, $ship_loc_prio_flg, value);
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

	public String getString(String name) {
		if ($lg_grp_cd.equalsIgnoreCase(name)) {
			return lg_grp_cd();
		}
		if ($lg_grp_nm.equalsIgnoreCase(name)) {
			return lg_grp_nm();
		}
		if ($base_lg_grp_nm.equalsIgnoreCase(name)) {
			return base_lg_grp_nm();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($cal_cd.equalsIgnoreCase(name)) {
			return cal_cd();
		}
		if ($site_co_cd.equalsIgnoreCase(name)) {
			return site_co_cd();
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
		if ($loc_flg.equalsIgnoreCase(name)) {
			return loc_flg();
		}
		if ($ship_slip_flg.equalsIgnoreCase(name)) {
			return ship_slip_flg();
		}
		if ($pick_list_flg.equalsIgnoreCase(name)) {
			return pick_list_flg();
		}
		if ($ship_inst_flg.equalsIgnoreCase(name)) {
			return ship_inst_flg();
		}
		if ($ship_slip_act_flg.equalsIgnoreCase(name)) {
			return ship_slip_act_flg();
		}
		if ($gi_minus_stk_chk_flg.equalsIgnoreCase(name)) {
			return gi_minus_stk_chk_flg();
		}
		if ($ship_loc_prio_flg.equalsIgnoreCase(name)) {
			return ship_loc_prio_flg();
		}
		if ($del_flg.equalsIgnoreCase(name)) {
			return del_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($lg_grp_cd.equalsIgnoreCase(name)) {
			return lg_grp_cd();
		}
		if ($lg_grp_nm.equalsIgnoreCase(name)) {
			return lg_grp_nm();
		}
		if ($base_lg_grp_nm.equalsIgnoreCase(name)) {
			return base_lg_grp_nm();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($cal_cd.equalsIgnoreCase(name)) {
			return cal_cd();
		}
		if ($site_co_cd.equalsIgnoreCase(name)) {
			return site_co_cd();
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
		if ($loc_flg.equalsIgnoreCase(name)) {
			return loc_flg();
		}
		if ($ship_slip_flg.equalsIgnoreCase(name)) {
			return ship_slip_flg();
		}
		if ($pick_list_flg.equalsIgnoreCase(name)) {
			return pick_list_flg();
		}
		if ($ship_inst_flg.equalsIgnoreCase(name)) {
			return ship_inst_flg();
		}
		if ($ship_slip_act_flg.equalsIgnoreCase(name)) {
			return ship_slip_act_flg();
		}
		if ($gi_minus_stk_chk_flg.equalsIgnoreCase(name)) {
			return gi_minus_stk_chk_flg();
		}
		if ($ship_loc_prio_flg.equalsIgnoreCase(name)) {
			return ship_loc_prio_flg();
		}
		if ($del_flg.equalsIgnoreCase(name)) {
			return del_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($lg_grp_cd.equalsIgnoreCase(name)) {
			lg_grp_cd(value);
			return;
		}
		if ($lg_grp_nm.equalsIgnoreCase(name)) {
			lg_grp_nm(value);
			return;
		}
		if ($base_lg_grp_nm.equalsIgnoreCase(name)) {
			base_lg_grp_nm(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($cal_cd.equalsIgnoreCase(name)) {
			cal_cd(value);
			return;
		}
		if ($site_co_cd.equalsIgnoreCase(name)) {
			site_co_cd(value);
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
		if ($loc_flg.equalsIgnoreCase(name)) {
			loc_flg(value);
			return;
		}
		if ($ship_slip_flg.equalsIgnoreCase(name)) {
			ship_slip_flg(value);
			return;
		}
		if ($pick_list_flg.equalsIgnoreCase(name)) {
			pick_list_flg(value);
			return;
		}
		if ($ship_inst_flg.equalsIgnoreCase(name)) {
			ship_inst_flg(value);
			return;
		}
		if ($ship_slip_act_flg.equalsIgnoreCase(name)) {
			ship_slip_act_flg(value);
			return;
		}
		if ($gi_minus_stk_chk_flg.equalsIgnoreCase(name)) {
			gi_minus_stk_chk_flg(value);
			return;
		}
		if ($ship_loc_prio_flg.equalsIgnoreCase(name)) {
			ship_loc_prio_flg(value);
			return;
		}
		if ($del_flg.equalsIgnoreCase(name)) {
			del_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($lg_grp_cd.equalsIgnoreCase(name)) {
			lg_grp_cd(value);
			return;
		}
		if ($lg_grp_nm.equalsIgnoreCase(name)) {
			lg_grp_nm(value);
			return;
		}
		if ($base_lg_grp_nm.equalsIgnoreCase(name)) {
			base_lg_grp_nm(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($cal_cd.equalsIgnoreCase(name)) {
			cal_cd(value);
			return;
		}
		if ($site_co_cd.equalsIgnoreCase(name)) {
			site_co_cd(value);
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
		if ($loc_flg.equalsIgnoreCase(name)) {
			loc_flg(value);
			return;
		}
		if ($ship_slip_flg.equalsIgnoreCase(name)) {
			ship_slip_flg(value);
			return;
		}
		if ($pick_list_flg.equalsIgnoreCase(name)) {
			pick_list_flg(value);
			return;
		}
		if ($ship_inst_flg.equalsIgnoreCase(name)) {
			ship_inst_flg(value);
			return;
		}
		if ($ship_slip_act_flg.equalsIgnoreCase(name)) {
			ship_slip_act_flg(value);
			return;
		}
		if ($gi_minus_stk_chk_flg.equalsIgnoreCase(name)) {
			gi_minus_stk_chk_flg(value);
			return;
		}
		if ($ship_loc_prio_flg.equalsIgnoreCase(name)) {
			ship_loc_prio_flg(value);
			return;
		}
		if ($del_flg.equalsIgnoreCase(name)) {
			del_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

}
