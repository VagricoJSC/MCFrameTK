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
 * "原価部門マスタ // Cost dept. master"DBコンテナRowクラスです。<p>
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
 *  	<td>dpt_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>部門ＣＤ</td>
 *  	<td>Dept. cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>term</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>期</td>
 *  	<td>Term</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>dpt_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>部門名</td>
 *  	<td>Dept. name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>base_dpt_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>部門名（ベース）</td>
 *  	<td>Dept. name(Base)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>dpt_lvl_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>部門階層ＣＤ</td>
 *  	<td>Dept. hierarchy cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>dpt_alc_grp</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>部門配賦グループ</td>
 *  	<td>Dept. allocation group</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>dpt_config_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>部門構成区分</td>
 *  	<td>Dept. structure type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>lg_grp_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>物流グループＣＤ</td>
 *  	<td>Distribution group cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>loc_grp_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>製造場所グループＣＤ</td>
 *  	<td>Mfg. location group cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>wg_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ワーキンググループＣＤ</td>
 *  	<td>WG cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>site_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>工場・物流倉庫ＣＤ</td>
 *  	<td>Factory/Distribution warehouse cd.</td>
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
 *  	<td>dpt_lvl_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td>DPT_LVL1.DPT_LVL_NM</td>
 *  	<td>部門階層名</td>
 *  	<td>Dept. hierarchy name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>lg_grp_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td>LG_GRP1.LG_GRP_NM</td>
 *  	<td>物流グループ名</td>
 *  	<td>Distribution group name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>loc_grp_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td>LOC_GRP1.LOC_GRP_NM</td>
 *  	<td>製造場所グループ名</td>
 *  	<td>Mfg. location group name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>wg_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td>WG1.WG_NM</td>
 *  	<td>ワーキンググループ名</td>
 *  	<td>WG name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>site_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td>SITE1.SITE_NM</td>
 *  	<td>工場・物流倉庫名</td>
 *  	<td>Factory/Distribution warehouse name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>dpt_nm_lcl</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td>LCL.DPT_NM</td>
 *  	<td>部門名(ローカライズ）</td>
 *  	<td>Dept. name (Localize)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>term_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td>TERM1.TERM_NM</td>
 *  	<td>期名称</td>
 *  	<td>Term name</td>
 *  </tr>
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
public class MAM_COST_DPT_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.CO_VIEW;

	public static final String TABLE_NAME = "MAM_COST_DPT";

	public static final boolean EX_CTRL = true;
	
	public static final boolean LCL_TABLE = false;
	
	/**
	 * 部門ＣＤ. Dept. cd..<p>
	 *
	 */
	public static final String $dpt_cd = "dpt_cd";
	private static final MCPermColumnInfo _dpt_cd = createColumnInfo("dpt_cd");
	public final MCStringPermColumn dpt_cd = createStringColumn(_dpt_cd);
	
	/**
	 * 期. Term.<p>
	 *
	 */
	public static final String $term = "term";
	private static final MCPermColumnInfo _term = createColumnInfo("term");
	public final MCDatePermColumn term = createDateColumn(_term);
	
	/**
	 * 部門名. Dept. name.<p>
	 *
	 */
	public static final String $dpt_nm = "dpt_nm";
	private static final MCPermColumnInfo _dpt_nm = createColumnInfo("dpt_nm");
	public final MCStringPermColumn dpt_nm = createStringColumn(_dpt_nm);
	
	/**
	 * 部門名（ベース）. Dept. name(Base).<p>
	 *
	 */
	public static final String $base_dpt_nm = "base_dpt_nm";
	private static final MCPermColumnInfo _base_dpt_nm = createColumnInfo("base_dpt_nm");
	public final MCStringPermColumn base_dpt_nm = createStringColumn(_base_dpt_nm);
	
	/**
	 * 部門階層ＣＤ. Dept. hierarchy cd..<p>
	 *
	 */
	public static final String $dpt_lvl_cd = "dpt_lvl_cd";
	private static final MCPermColumnInfo _dpt_lvl_cd = createColumnInfo("dpt_lvl_cd");
	public final MCStringPermColumn dpt_lvl_cd = createStringColumn(_dpt_lvl_cd);
	
	/**
	 * 部門配賦グループ. Dept. allocation group.<p>
	 *
	 */
	public static final String $dpt_alc_grp = "dpt_alc_grp";
	private static final MCPermColumnInfo _dpt_alc_grp = createColumnInfo("dpt_alc_grp");
	public final MCStringPermColumn dpt_alc_grp = createStringColumn(_dpt_alc_grp);
	
	/**
	 * 部門構成区分. Dept. structure type.<p>
	 *
	 */
	public static final String $dpt_config_typ = "dpt_config_typ";
	private static final MCPermColumnInfo _dpt_config_typ = createColumnInfo("dpt_config_typ");
	public final MCStringPermColumn dpt_config_typ = createStringColumn(_dpt_config_typ);
	
	/**
	 * 物流グループＣＤ. Distribution group cd..<p>
	 *
	 */
	public static final String $lg_grp_cd = "lg_grp_cd";
	private static final MCPermColumnInfo _lg_grp_cd = createColumnInfo("lg_grp_cd");
	public final MCStringPermColumn lg_grp_cd = createStringColumn(_lg_grp_cd);
	
	/**
	 * 製造場所グループＣＤ. Mfg. location group cd..<p>
	 *
	 */
	public static final String $loc_grp_cd = "loc_grp_cd";
	private static final MCPermColumnInfo _loc_grp_cd = createColumnInfo("loc_grp_cd");
	public final MCStringPermColumn loc_grp_cd = createStringColumn(_loc_grp_cd);
	
	/**
	 * ワーキンググループＣＤ. WG cd..<p>
	 *
	 */
	public static final String $wg_cd = "wg_cd";
	private static final MCPermColumnInfo _wg_cd = createColumnInfo("wg_cd");
	public final MCStringPermColumn wg_cd = createStringColumn(_wg_cd);
	
	/**
	 * 工場・物流倉庫ＣＤ. Factory/Distribution warehouse cd..<p>
	 *
	 */
	public static final String $site_cd = "site_cd";
	private static final MCPermColumnInfo _site_cd = createColumnInfo("site_cd");
	public final MCStringPermColumn site_cd = createStringColumn(_site_cd);
	
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
	 * 部門階層名. Dept. hierarchy name.<p>
	 *
	 */
	public static final String $dpt_lvl_nm = "dpt_lvl_nm";
	
	/**
	 * 物流グループ名. Distribution group name.<p>
	 *
	 */
	public static final String $lg_grp_nm = "lg_grp_nm";
	
	/**
	 * 製造場所グループ名. Mfg. location group name.<p>
	 *
	 */
	public static final String $loc_grp_nm = "loc_grp_nm";
	
	/**
	 * ワーキンググループ名. WG name.<p>
	 *
	 */
	public static final String $wg_nm = "wg_nm";
	
	/**
	 * 工場・物流倉庫名. Factory/Distribution warehouse name.<p>
	 *
	 */
	public static final String $site_nm = "site_nm";
	
	/**
	 * 部門名(ローカライズ）. Dept. name (Localize).<p>
	 *
	 */
	public static final String $dpt_nm_lcl = "dpt_nm_lcl";
	
	/**
	 * 期名称. Term name.<p>
	 *
	 */
	public static final String $term_nm = "term_nm";
	
	public static final MCMeta dpt_cd_META = createCommonMeta($dpt_cd, mcframe.commonMA.meta.MA_META.COST_DPT_CD);
	public static final MCMeta term_META = createCommonMeta($term, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta dpt_nm_META = createCommonMeta($dpt_nm, mcframe.commonMA.meta.MA_META.COST_DPT_NM);
	public static final MCMeta base_dpt_nm_META = createCommonMeta($base_dpt_nm, mcframe.commonMA.meta.MA_META.COST_DPT_NM);
	public static final MCMeta dpt_lvl_cd_META = createCommonMeta($dpt_lvl_cd, mcframe.commonMA.meta.MA_META.DPT_LVL_CD);
	public static final MCMeta dpt_alc_grp_META = createCommonMeta($dpt_alc_grp, mcframe.commonMA.meta.MA_META.DPT_ALC_GRP);
	public static final MCMeta dpt_config_typ_META = createCommonMeta($dpt_config_typ, mcframe.commonMA.meta.MA_META.DPT_CONFIG_TYP);
	public static final MCMeta lg_grp_cd_META = createCommonMeta($lg_grp_cd, mcframe.commonMA.meta.MA_META.LG_GRP_CD);
	public static final MCMeta loc_grp_cd_META = createCommonMeta($loc_grp_cd, mcframe.commonMA.meta.MA_META.LOC_GRP_CD);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta site_cd_META = createCommonMeta($site_cd, mcframe.commonMA.meta.MA_META.SITE_CD);
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
	public static final MCMeta dpt_lvl_nm_META = createCommonMeta($dpt_lvl_nm, mcframe.commonMA.meta.MA_META.DPT_LVL_NM);
	public static final MCMeta lg_grp_nm_META = createCommonMeta($lg_grp_nm, mcframe.commonMA.meta.MA_META.LG_GRP_NM);
	public static final MCMeta loc_grp_nm_META = createCommonMeta($loc_grp_nm, mcframe.commonMA.meta.MA_META.LOC_GRP_NM);
	public static final MCMeta wg_nm_META = createCommonMeta($wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta site_nm_META = createCommonMeta($site_nm, mcframe.commonMA.meta.MA_META.SITE_NM);
	public static final MCMeta dpt_nm_lcl_META = createCommonMeta($dpt_nm_lcl, mcframe.commonMA.meta.MA_META.COST_DPT_NM);
	public static final MCMeta term_nm_META = createCommonMeta($term_nm, mcframe.commonMA.meta.MA_META.TERM_NM);

	protected static final List<MCForeignInfo> FOREIGN_INFO_LIST = new ArrayList<>();
	public static final String $DPT_LVL1 = "DPT_LVL1";
	public static final String $LG_GRP1 = "LG_GRP1";
	public static final String $LOC_GRP1 = "LOC_GRP1";
	public static final String $WG1 = "WG1";
	public static final String $SITE1 = "SITE1";
	public static final String $TERM1 = "TERM1";
	public static final String $LCL = "LCL";
	static {
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_DPT_LVL",
				$DPT_LVL1,
				new String[][]{
						{"dpt_lvl_cd", "dpt_lvl_cd"}
				},
				() -> {
					return mcframe.serverMA.dbc.MAM_DPT_LVL_R.create("DPT_LVL1");
				},
				(alias) -> {
					MAM_COST_DPT_R own = MAM_COST_DPT_R.create(alias);
					mcframe.serverMA.dbc.MAM_DPT_LVL_R ref = mcframe.serverMA.dbc.MAM_DPT_LVL_R.create("DPT_LVL1");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.dpt_lvl_cd.eq(ref.dpt_lvl_cd));
					return cond;
				}
			)
		);
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_LG_GRP",
				$LG_GRP1,
				new String[][]{
						{"lg_grp_cd", "lg_grp_cd"}
				},
				() -> {
					return mcframe.serverMA.dbc.MAM_LG_GRP_R.create("LG_GRP1");
				},
				(alias) -> {
					MAM_COST_DPT_R own = MAM_COST_DPT_R.create(alias);
					mcframe.serverMA.dbc.MAM_LG_GRP_R ref = mcframe.serverMA.dbc.MAM_LG_GRP_R.create("LG_GRP1");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.lg_grp_cd.eq(ref.lg_grp_cd));
					return cond;
				}
			)
		);
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_LOC_GRP",
				$LOC_GRP1,
				new String[][]{
						{"loc_grp_cd", "loc_grp_cd"}
				},
				() -> {
					return mcframe.serverMA.dbc.MAM_LOC_GRP_R.create("LOC_GRP1");
				},
				(alias) -> {
					MAM_COST_DPT_R own = MAM_COST_DPT_R.create(alias);
					mcframe.serverMA.dbc.MAM_LOC_GRP_R ref = mcframe.serverMA.dbc.MAM_LOC_GRP_R.create("LOC_GRP1");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.loc_grp_cd.eq(ref.loc_grp_cd));
					return cond;
				}
			)
		);
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_WG",
				$WG1,
				new String[][]{
						{"wg_cd", "wg_cd"}
				},
				() -> {
					return mcframe.serverMA.dbc.MAM_WG_R.create("WG1");
				},
				(alias) -> {
					MAM_COST_DPT_R own = MAM_COST_DPT_R.create(alias);
					mcframe.serverMA.dbc.MAM_WG_R ref = mcframe.serverMA.dbc.MAM_WG_R.create("WG1");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.wg_cd.eq(ref.wg_cd));
					return cond;
				}
			)
		);
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_SITE",
				$SITE1,
				new String[][]{
						{"site_cd", "site_cd"}
				},
				() -> {
					return mcframe.serverMA.dbc.MAM_SITE_R.create("SITE1");
				},
				(alias) -> {
					MAM_COST_DPT_R own = MAM_COST_DPT_R.create(alias);
					mcframe.serverMA.dbc.MAM_SITE_R ref = mcframe.serverMA.dbc.MAM_SITE_R.create("SITE1");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.site_cd.eq(ref.site_cd));
					return cond;
				}
			)
		);
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_TERM",
				$TERM1,
				new String[][]{
						{"term", "term"}
				},
				() -> {
					return mcframe.serverMA.dbc.MAM_TERM_R.create("TERM1");
				},
				(alias) -> {
					MAM_COST_DPT_R own = MAM_COST_DPT_R.create(alias);
					mcframe.serverMA.dbc.MAM_TERM_R ref = mcframe.serverMA.dbc.MAM_TERM_R.create("TERM1");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.term.eq(ref.term));
					return cond;
				}
			)
		);
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_COST_DPT",
				$LCL,
				new String[][]{
						{"dpt_cd", "dpt_cd"},
						{"term", "term"}
				},
				() -> {
					return mcframe.serverMA.dbc.MAM_COST_DPT_R.create("LCL");
				},
				(alias) -> {
					MAM_COST_DPT_R own = MAM_COST_DPT_R.create(alias);
					mcframe.serverMA.dbc.MAM_COST_DPT_R ref = mcframe.serverMA.dbc.MAM_COST_DPT_R.create("LCL");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.dpt_cd.eq(ref.dpt_cd));
					cond = cond.and(own.term.eq(ref.term));
					return cond;
				}
			)
		);
	}
	
	protected static final ConstMetaList<MAM_COST_DPT_R> constMetas = new ConstMetaList<MAM_COST_DPT_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			dpt_cd_META,
			term_META,
			dpt_nm_META,
			base_dpt_nm_META,
			dpt_lvl_cd_META,
			dpt_alc_grp_META,
			dpt_config_typ_META,
			lg_grp_cd_META,
			loc_grp_cd_META,
			wg_cd_META,
			site_cd_META,
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
			dpt_lvl_nm_META,
			lg_grp_nm_META,
			loc_grp_nm_META,
			wg_nm_META,
			site_nm_META,
			dpt_nm_lcl_META,
			term_nm_META
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
	protected MAM_COST_DPT_R(ConstMetaList<? extends MAM_COST_DPT_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MAM_COST_DPT_R(ConstMetaList<? extends MAM_COST_DPT_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MAM_COST_DPT_R.$dpt_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_COST_DPT_R.$dpt_cd,
				"dpt_cd",
				dpt_cd,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_COST_DPT_R.$term,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MAM_COST_DPT_R.$term,
				"term",
				term,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_COST_DPT_R.$dpt_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_COST_DPT_R.$dpt_nm,
				"dpt_nm",
				dpt_nm,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_COST_DPT_R.$base_dpt_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_COST_DPT_R.$base_dpt_nm,
				"base_dpt_nm",
				base_dpt_nm,
				false,
				false,
				true,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_COST_DPT_R.$dpt_lvl_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_COST_DPT_R.$dpt_lvl_cd,
				"dpt_lvl_cd",
				dpt_lvl_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_COST_DPT_R.$dpt_alc_grp,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_COST_DPT_R.$dpt_alc_grp,
				"dpt_alc_grp",
				dpt_alc_grp,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_COST_DPT_R.$dpt_config_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_COST_DPT_R.$dpt_config_typ,
				"dpt_config_typ",
				dpt_config_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_COST_DPT_R.$lg_grp_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_COST_DPT_R.$lg_grp_cd,
				"lg_grp_cd",
				lg_grp_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_COST_DPT_R.$loc_grp_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_COST_DPT_R.$loc_grp_cd,
				"loc_grp_cd",
				loc_grp_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_COST_DPT_R.$wg_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_COST_DPT_R.$wg_cd,
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
			MAM_COST_DPT_R.$site_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_COST_DPT_R.$site_cd,
				"site_cd",
				site_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_COST_DPT_R.$memo1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_COST_DPT_R.$memo1,
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
			MAM_COST_DPT_R.$memo2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_COST_DPT_R.$memo2,
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
			MAM_COST_DPT_R.$memo3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_COST_DPT_R.$memo3,
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
			MAM_COST_DPT_R.$del_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_COST_DPT_R.$del_flg,
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
			MAM_COST_DPT_R.$del_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_COST_DPT_R.$del_usr_id,
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
			MAM_COST_DPT_R.$del_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_COST_DPT_R.$del_usr_nm,
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
			MAM_COST_DPT_R.$del_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MAM_COST_DPT_R.$del_ts,
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
			MAM_COST_DPT_R.$ins_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_COST_DPT_R.$ins_usr_id,
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
			MAM_COST_DPT_R.$ins_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_COST_DPT_R.$ins_usr_nm,
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
			MAM_COST_DPT_R.$ins_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MAM_COST_DPT_R.$ins_ts,
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
			MAM_COST_DPT_R.$ins_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_COST_DPT_R.$ins_func_id,
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
			MAM_COST_DPT_R.$upd_cntr,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_COST_DPT_R.$upd_cntr,
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
			MAM_COST_DPT_R.$upd_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_COST_DPT_R.$upd_usr_id,
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
			MAM_COST_DPT_R.$upd_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_COST_DPT_R.$upd_usr_nm,
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
			MAM_COST_DPT_R.$upd_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MAM_COST_DPT_R.$upd_ts,
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
			MAM_COST_DPT_R.$upd_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_COST_DPT_R.$upd_func_id,
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
			MAM_COST_DPT_R.$upd_srv_req_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_COST_DPT_R.$upd_srv_req_no,
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
			MAM_COST_DPT_R.$dpt_lvl_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_COST_DPT_R.$dpt_lvl_nm,
				"dpt_lvl_nm",
				null,
				false,
				true,
				false,
				false,
				true,
				"DPT_LVL1.DPT_LVL_NM"
			)
		);
		COLUMN_MAP.put(
			MAM_COST_DPT_R.$lg_grp_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_COST_DPT_R.$lg_grp_nm,
				"lg_grp_nm",
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
			MAM_COST_DPT_R.$loc_grp_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_COST_DPT_R.$loc_grp_nm,
				"loc_grp_nm",
				null,
				false,
				true,
				false,
				false,
				true,
				"LOC_GRP1.LOC_GRP_NM"
			)
		);
		COLUMN_MAP.put(
			MAM_COST_DPT_R.$wg_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_COST_DPT_R.$wg_nm,
				"wg_nm",
				null,
				false,
				true,
				false,
				false,
				true,
				"WG1.WG_NM"
			)
		);
		COLUMN_MAP.put(
			MAM_COST_DPT_R.$site_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_COST_DPT_R.$site_nm,
				"site_nm",
				null,
				false,
				true,
				false,
				false,
				true,
				"SITE1.SITE_NM"
			)
		);
		COLUMN_MAP.put(
			MAM_COST_DPT_R.$dpt_nm_lcl,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_COST_DPT_R.$dpt_nm_lcl,
				"dpt_nm_lcl",
				null,
				false,
				true,
				false,
				false,
				true,
				"LCL.DPT_NM"
			)
		);
		COLUMN_MAP.put(
			MAM_COST_DPT_R.$term_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_COST_DPT_R.$term_nm,
				"term_nm",
				null,
				false,
				true,
				false,
				false,
				true,
				"TERM1.TERM_NM"
			)
		);
		return COLUMN_MAP;
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MAM_COST_DPT_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MAM_COST_DPT_R create(String alias) {
		MAM_COST_DPT_R row = new MAM_COST_DPT_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MAM_COST_DPT_R createByName(T proto) {
		MAM_COST_DPT_R row = MAM_COST_DPT_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAM_COST_DPT_R clone() {
		return (MAM_COST_DPT_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAM_COST_DPT_R createInstance() {
		return (MAM_COST_DPT_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAM_COST_DPT_R getValues(String... names) {
		return (MAM_COST_DPT_R) super.getValues(names);
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
	 public MAW_COST_DPT_KEY_R getPkWorkDbc(String alias) {
	 	return MAW_COST_DPT_KEY_R.create(alias);
	 }

	/*
	 * MCDBContainerのオーバーライドメソッドです。
	 */
	 public MAW_COST_DPT_KEY_R getPkWorkDbc() {
	 	return getPkWorkDbc(MAW_COST_DPT_KEY_R.TABLE_NAME);
	 }

	/**
	 * 部門ＣＤ. Dept. cd..<p>
	 *
	 */
	public String dpt_cd() {
		return getConstString(offset + 0, $dpt_cd);
	}

	/**
	 * 部門ＣＤ. Dept. cd..<p>
	 *
	 */
	public void dpt_cd(String value) {
		setConstString(offset + 0, $dpt_cd, value);
	}

	/**
	 * 期. Term.<p>
	 *
	 */
	public MCDate term() {
		return getConstDate(offset + 1, $term);
	}

	/**
	 * 期. Term.<p>
	 *
	 */
	public void term(MCDate value) {
		setConstDate(offset + 1, $term, value);
	}

	/**
	 * 部門名. Dept. name.<p>
	 *
	 */
	public String dpt_nm() {
		return getConstString(offset + 2, $dpt_nm);
	}

	/**
	 * 部門名. Dept. name.<p>
	 *
	 */
	public void dpt_nm(String value) {
		setConstString(offset + 2, $dpt_nm, value);
	}

	/**
	 * 部門名（ベース）. Dept. name(Base).<p>
	 *
	 */
	public String base_dpt_nm() {
		return getConstString(offset + 3, $base_dpt_nm);
	}

	/**
	 * 部門名（ベース）. Dept. name(Base).<p>
	 *
	 */
	public void base_dpt_nm(String value) {
		setConstString(offset + 3, $base_dpt_nm, value);
	}

	/**
	 * 部門階層ＣＤ. Dept. hierarchy cd..<p>
	 *
	 */
	public String dpt_lvl_cd() {
		return getConstString(offset + 4, $dpt_lvl_cd);
	}

	/**
	 * 部門階層ＣＤ. Dept. hierarchy cd..<p>
	 *
	 */
	public void dpt_lvl_cd(String value) {
		setConstString(offset + 4, $dpt_lvl_cd, value);
	}

	/**
	 * 部門配賦グループ. Dept. allocation group.<p>
	 *
	 */
	public String dpt_alc_grp() {
		return getConstString(offset + 5, $dpt_alc_grp);
	}

	/**
	 * 部門配賦グループ. Dept. allocation group.<p>
	 *
	 */
	public void dpt_alc_grp(String value) {
		setConstString(offset + 5, $dpt_alc_grp, value);
	}

	/**
	 * 部門構成区分. Dept. structure type.<p>
	 *
	 */
	public String dpt_config_typ() {
		return getConstString(offset + 6, $dpt_config_typ);
	}

	/**
	 * 部門構成区分. Dept. structure type.<p>
	 *
	 */
	public void dpt_config_typ(String value) {
		setConstString(offset + 6, $dpt_config_typ, value);
	}

	/**
	 * 物流グループＣＤ. Distribution group cd..<p>
	 *
	 */
	public String lg_grp_cd() {
		return getConstString(offset + 7, $lg_grp_cd);
	}

	/**
	 * 物流グループＣＤ. Distribution group cd..<p>
	 *
	 */
	public void lg_grp_cd(String value) {
		setConstString(offset + 7, $lg_grp_cd, value);
	}

	/**
	 * 製造場所グループＣＤ. Mfg. location group cd..<p>
	 *
	 */
	public String loc_grp_cd() {
		return getConstString(offset + 8, $loc_grp_cd);
	}

	/**
	 * 製造場所グループＣＤ. Mfg. location group cd..<p>
	 *
	 */
	public void loc_grp_cd(String value) {
		setConstString(offset + 8, $loc_grp_cd, value);
	}

	/**
	 * ワーキンググループＣＤ. WG cd..<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 9, $wg_cd);
	}

	/**
	 * ワーキンググループＣＤ. WG cd..<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 9, $wg_cd, value);
	}

	/**
	 * 工場・物流倉庫ＣＤ. Factory/Distribution warehouse cd..<p>
	 *
	 */
	public String site_cd() {
		return getConstString(offset + 10, $site_cd);
	}

	/**
	 * 工場・物流倉庫ＣＤ. Factory/Distribution warehouse cd..<p>
	 *
	 */
	public void site_cd(String value) {
		setConstString(offset + 10, $site_cd, value);
	}

	/**
	 * メモ１. Memo 1.<p>
	 *
	 */
	public String memo1() {
		return getConstString(offset + 11, $memo1);
	}

	/**
	 * メモ１. Memo 1.<p>
	 *
	 */
	public void memo1(String value) {
		setConstString(offset + 11, $memo1, value);
	}

	/**
	 * メモ２. Memo 2.<p>
	 *
	 */
	public String memo2() {
		return getConstString(offset + 12, $memo2);
	}

	/**
	 * メモ２. Memo 2.<p>
	 *
	 */
	public void memo2(String value) {
		setConstString(offset + 12, $memo2, value);
	}

	/**
	 * メモ３. Memo 3.<p>
	 *
	 */
	public String memo3() {
		return getConstString(offset + 13, $memo3);
	}

	/**
	 * メモ３. Memo 3.<p>
	 *
	 */
	public void memo3(String value) {
		setConstString(offset + 13, $memo3, value);
	}

	/**
	 * 論理削除ＦＬＧ. Logical delete flg..<p>
	 *
	 */
	public boolean del_flg() {
		return getConstBoolean(offset + 14, $del_flg);
	}

	/**
	 * 論理削除ＦＬＧ. Logical delete flg..<p>
	 *
	 */
	public void del_flg(boolean value) {
		setConstBoolean(offset + 14, $del_flg, value);
	}

	/**
	 * 論理削除ユーザＩＤ. Logical delete user ID.<p>
	 *
	 */
	public String del_usr_id() {
		return getConstString(offset + 15, $del_usr_id);
	}

	/**
	 * 論理削除ユーザＩＤ. Logical delete user ID.<p>
	 *
	 */
	public void del_usr_id(String value) {
		setConstString(offset + 15, $del_usr_id, value);
	}

	/**
	 * 論理削除ユーザ名. Logical delete user name.<p>
	 *
	 */
	public String del_usr_nm() {
		return getConstString(offset + 16, $del_usr_nm);
	}

	/**
	 * 論理削除ユーザ名. Logical delete user name.<p>
	 *
	 */
	public void del_usr_nm(String value) {
		setConstString(offset + 16, $del_usr_nm, value);
	}

	/**
	 * 論理削除日時. Logical delete date and time.<p>
	 *
	 */
	public MCTimestamp del_ts() {
		return getConstTimestamp(offset + 17, $del_ts);
	}

	/**
	 * 論理削除日時. Logical delete date and time.<p>
	 *
	 */
	public void del_ts(MCTimestamp value) {
		setConstTimestamp(offset + 17, $del_ts, value);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 18, $ins_usr_id);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 18, $ins_usr_id, value);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 19, $ins_usr_nm);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 19, $ins_usr_nm, value);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 20, $ins_ts);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 20, $ins_ts, value);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 21, $ins_func_id);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 21, $ins_func_id, value);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 22, $upd_cntr);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 22, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 22, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 22, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 22, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 22, $upd_cntr, value);
	}
	
	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 23, $upd_usr_id);
	}

	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 23, $upd_usr_id, value);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 24, $upd_usr_nm);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 24, $upd_usr_nm, value);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 25, $upd_ts);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 25, $upd_ts, value);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 26, $upd_func_id);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 26, $upd_func_id, value);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 27, $upd_srv_req_no);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 27, $upd_srv_req_no, value);
	}

	/**
	 * 部門階層名. Dept. hierarchy name.<p>
	 *
	 */
	public String dpt_lvl_nm() {
		return getConstString(offset + 28, $dpt_lvl_nm);
	}

	/**
	 * 部門階層名. Dept. hierarchy name.<p>
	 *
	 */
	public void dpt_lvl_nm(String value) {
		setConstString(offset + 28, $dpt_lvl_nm, value);
	}

	/**
	 * 物流グループ名. Distribution group name.<p>
	 *
	 */
	public String lg_grp_nm() {
		return getConstString(offset + 29, $lg_grp_nm);
	}

	/**
	 * 物流グループ名. Distribution group name.<p>
	 *
	 */
	public void lg_grp_nm(String value) {
		setConstString(offset + 29, $lg_grp_nm, value);
	}

	/**
	 * 製造場所グループ名. Mfg. location group name.<p>
	 *
	 */
	public String loc_grp_nm() {
		return getConstString(offset + 30, $loc_grp_nm);
	}

	/**
	 * 製造場所グループ名. Mfg. location group name.<p>
	 *
	 */
	public void loc_grp_nm(String value) {
		setConstString(offset + 30, $loc_grp_nm, value);
	}

	/**
	 * ワーキンググループ名. WG name.<p>
	 *
	 */
	public String wg_nm() {
		return getConstString(offset + 31, $wg_nm);
	}

	/**
	 * ワーキンググループ名. WG name.<p>
	 *
	 */
	public void wg_nm(String value) {
		setConstString(offset + 31, $wg_nm, value);
	}

	/**
	 * 工場・物流倉庫名. Factory/Distribution warehouse name.<p>
	 *
	 */
	public String site_nm() {
		return getConstString(offset + 32, $site_nm);
	}

	/**
	 * 工場・物流倉庫名. Factory/Distribution warehouse name.<p>
	 *
	 */
	public void site_nm(String value) {
		setConstString(offset + 32, $site_nm, value);
	}

	/**
	 * 部門名(ローカライズ）. Dept. name (Localize).<p>
	 *
	 */
	public String dpt_nm_lcl() {
		return getConstString(offset + 33, $dpt_nm_lcl);
	}

	/**
	 * 部門名(ローカライズ）. Dept. name (Localize).<p>
	 *
	 */
	public void dpt_nm_lcl(String value) {
		setConstString(offset + 33, $dpt_nm_lcl, value);
	}

	/**
	 * 期名称. Term name.<p>
	 *
	 */
	public String term_nm() {
		return getConstString(offset + 34, $term_nm);
	}

	/**
	 * 期名称. Term name.<p>
	 *
	 */
	public void term_nm(String value) {
		setConstString(offset + 34, $term_nm, value);
	}

	public String getString(String name) {
		if ($dpt_cd.equalsIgnoreCase(name)) {
			return dpt_cd();
		}
		if ($dpt_nm.equalsIgnoreCase(name)) {
			return dpt_nm();
		}
		if ($base_dpt_nm.equalsIgnoreCase(name)) {
			return base_dpt_nm();
		}
		if ($dpt_lvl_cd.equalsIgnoreCase(name)) {
			return dpt_lvl_cd();
		}
		if ($dpt_alc_grp.equalsIgnoreCase(name)) {
			return dpt_alc_grp();
		}
		if ($dpt_config_typ.equalsIgnoreCase(name)) {
			return dpt_config_typ();
		}
		if ($lg_grp_cd.equalsIgnoreCase(name)) {
			return lg_grp_cd();
		}
		if ($loc_grp_cd.equalsIgnoreCase(name)) {
			return loc_grp_cd();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			return site_cd();
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
		if ($dpt_lvl_nm.equalsIgnoreCase(name)) {
			return dpt_lvl_nm();
		}
		if ($lg_grp_nm.equalsIgnoreCase(name)) {
			return lg_grp_nm();
		}
		if ($loc_grp_nm.equalsIgnoreCase(name)) {
			return loc_grp_nm();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($site_nm.equalsIgnoreCase(name)) {
			return site_nm();
		}
		if ($dpt_nm_lcl.equalsIgnoreCase(name)) {
			return dpt_nm_lcl();
		}
		if ($term_nm.equalsIgnoreCase(name)) {
			return term_nm();
		}
		return super.getString(name);
	}

	public MCNumber getNumber(String name) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumber(name);
	}

	public MCDate getDate(String name) {
		if ($term.equalsIgnoreCase(name)) {
			return term();
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
		if ($del_flg.equalsIgnoreCase(name)) {
			return del_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($dpt_cd.equalsIgnoreCase(name)) {
			return dpt_cd();
		}
		if ($dpt_nm.equalsIgnoreCase(name)) {
			return dpt_nm();
		}
		if ($base_dpt_nm.equalsIgnoreCase(name)) {
			return base_dpt_nm();
		}
		if ($dpt_lvl_cd.equalsIgnoreCase(name)) {
			return dpt_lvl_cd();
		}
		if ($dpt_alc_grp.equalsIgnoreCase(name)) {
			return dpt_alc_grp();
		}
		if ($dpt_config_typ.equalsIgnoreCase(name)) {
			return dpt_config_typ();
		}
		if ($lg_grp_cd.equalsIgnoreCase(name)) {
			return lg_grp_cd();
		}
		if ($loc_grp_cd.equalsIgnoreCase(name)) {
			return loc_grp_cd();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			return site_cd();
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
		if ($dpt_lvl_nm.equalsIgnoreCase(name)) {
			return dpt_lvl_nm();
		}
		if ($lg_grp_nm.equalsIgnoreCase(name)) {
			return lg_grp_nm();
		}
		if ($loc_grp_nm.equalsIgnoreCase(name)) {
			return loc_grp_nm();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($site_nm.equalsIgnoreCase(name)) {
			return site_nm();
		}
		if ($dpt_nm_lcl.equalsIgnoreCase(name)) {
			return dpt_nm_lcl();
		}
		if ($term_nm.equalsIgnoreCase(name)) {
			return term_nm();
		}
		return super.getStringNE(name);
	}

	public MCNumber getNumberNE(String name) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumberNE(name);
	}

	public MCDate getDateNE(String name) {
		if ($term.equalsIgnoreCase(name)) {
			return term();
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
		if ($del_flg.equalsIgnoreCase(name)) {
			return del_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($dpt_cd.equalsIgnoreCase(name)) {
			dpt_cd(value);
			return;
		}
		if ($dpt_nm.equalsIgnoreCase(name)) {
			dpt_nm(value);
			return;
		}
		if ($base_dpt_nm.equalsIgnoreCase(name)) {
			base_dpt_nm(value);
			return;
		}
		if ($dpt_lvl_cd.equalsIgnoreCase(name)) {
			dpt_lvl_cd(value);
			return;
		}
		if ($dpt_alc_grp.equalsIgnoreCase(name)) {
			dpt_alc_grp(value);
			return;
		}
		if ($dpt_config_typ.equalsIgnoreCase(name)) {
			dpt_config_typ(value);
			return;
		}
		if ($lg_grp_cd.equalsIgnoreCase(name)) {
			lg_grp_cd(value);
			return;
		}
		if ($loc_grp_cd.equalsIgnoreCase(name)) {
			loc_grp_cd(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			site_cd(value);
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
		if ($dpt_lvl_nm.equalsIgnoreCase(name)) {
			dpt_lvl_nm(value);
			return;
		}
		if ($lg_grp_nm.equalsIgnoreCase(name)) {
			lg_grp_nm(value);
			return;
		}
		if ($loc_grp_nm.equalsIgnoreCase(name)) {
			loc_grp_nm(value);
			return;
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			wg_nm(value);
			return;
		}
		if ($site_nm.equalsIgnoreCase(name)) {
			site_nm(value);
			return;
		}
		if ($dpt_nm_lcl.equalsIgnoreCase(name)) {
			dpt_nm_lcl(value);
			return;
		}
		if ($term_nm.equalsIgnoreCase(name)) {
			term_nm(value);
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

	public void setDate(String name, MCDate value) {
		if ($term.equalsIgnoreCase(name)) {
			term(value);
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
		if ($del_flg.equalsIgnoreCase(name)) {
			del_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($dpt_cd.equalsIgnoreCase(name)) {
			dpt_cd(value);
			return;
		}
		if ($dpt_nm.equalsIgnoreCase(name)) {
			dpt_nm(value);
			return;
		}
		if ($base_dpt_nm.equalsIgnoreCase(name)) {
			base_dpt_nm(value);
			return;
		}
		if ($dpt_lvl_cd.equalsIgnoreCase(name)) {
			dpt_lvl_cd(value);
			return;
		}
		if ($dpt_alc_grp.equalsIgnoreCase(name)) {
			dpt_alc_grp(value);
			return;
		}
		if ($dpt_config_typ.equalsIgnoreCase(name)) {
			dpt_config_typ(value);
			return;
		}
		if ($lg_grp_cd.equalsIgnoreCase(name)) {
			lg_grp_cd(value);
			return;
		}
		if ($loc_grp_cd.equalsIgnoreCase(name)) {
			loc_grp_cd(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			site_cd(value);
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
		if ($dpt_lvl_nm.equalsIgnoreCase(name)) {
			dpt_lvl_nm(value);
			return;
		}
		if ($lg_grp_nm.equalsIgnoreCase(name)) {
			lg_grp_nm(value);
			return;
		}
		if ($loc_grp_nm.equalsIgnoreCase(name)) {
			loc_grp_nm(value);
			return;
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			wg_nm(value);
			return;
		}
		if ($site_nm.equalsIgnoreCase(name)) {
			site_nm(value);
			return;
		}
		if ($dpt_nm_lcl.equalsIgnoreCase(name)) {
			dpt_nm_lcl(value);
			return;
		}
		if ($term_nm.equalsIgnoreCase(name)) {
			term_nm(value);
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

	public void setDateNE(String name, MCDate value) {
		if ($term.equalsIgnoreCase(name)) {
			term(value);
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
		if ($del_flg.equalsIgnoreCase(name)) {
			del_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

}
