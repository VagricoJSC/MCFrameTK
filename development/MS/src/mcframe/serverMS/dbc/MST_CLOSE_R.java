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
 * "締処理情報 // Closing info."DBコンテナRowクラスです。<p>
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
 *  	<td>ym</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>年月度</td>
 *  	<td>Fiscal month</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sls_cl_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>売上締ＦＬＧ</td>
 *  	<td>Sales closing flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>rcv_cl_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>入金締ＦＬＧ</td>
 *  	<td>Payment received closing flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>purc_cl_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>仕入締ＦＬＧ</td>
 *  	<td>Purchase closing flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>pay_cl_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>支払締ＦＬＧ</td>
 *  	<td>Payment closing flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>stk_cl_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>在庫締ＦＬＧ</td>
 *  	<td>Inventory closing flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sls_cl_tm</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>売上締実行日時</td>
 *  	<td>Sales closing execution date and time</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>rcv_cl_tm</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>入金締実行日時</td>
 *  	<td>Payment received closing execution date and time</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>purc_cl_tm</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>仕入締実行日時</td>
 *  	<td>Purchase closing execution date and time</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>pay_cl_tm</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>支払締実行日時</td>
 *  	<td>Payment closing execution date and time</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>stk_cl_tm</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>在庫締実行日時</td>
 *  	<td>Inventory closing execution date and time</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ar_pre_cl_tm</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>売掛最終仮締実行日時</td>
 *  	<td>AR final temporary closing execution date and time</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ap_pre_cl_tm</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>買掛最終仮締実行日時</td>
 *  	<td>AP final temporary closing execution date and time</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sls_cl_usr_cd</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>売上締担当者ＣＤ</td>
 *  	<td>Sales closing PIC cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>rcv_cl_usr_cd</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>入金締担当者ＣＤ</td>
 *  	<td>Payment received closing PIC cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>purc_cl_usr_cd</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>仕入締担当者ＣＤ</td>
 *  	<td>Purchase closing PIC cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>pay_cl_usr_cd</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>支払締担当者ＣＤ</td>
 *  	<td>Payment closing PIC cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>stk_cl_usr_cd</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>在庫締担当者ＣＤ</td>
 *  	<td>Inventory closing PIC cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ar_pre_cl_usr_cd</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>売掛仮締担当者ＣＤ</td>
 *  	<td>AR temporary closing PIC cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ap_pre_cl_usr_cd</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>買掛仮締担当者ＣＤ</td>
 *  	<td>AP temporary closing PIC cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ar_pre_cl_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>売掛仮締ＦＬＧ</td>
 *  	<td>AR temporary closing flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ap_pre_cl_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>買掛仮締ＦＬＧ</td>
 *  	<td>AP temporary closing flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>all_acst_pre_cl_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>全売掛先仮締ＦＬＧ</td>
 *  	<td>All AR customer temporary closing flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>all_asppl_pre_cl_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>全買掛先仮締ＦＬＧ</td>
 *  	<td>All AP supplier temporary closing flg.</td>
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
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
public class MST_CLOSE_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.CO_VIEW;

	public static final String TABLE_NAME = "MST_CLOSE";

	public static final boolean EX_CTRL = true;
	
	public static final boolean LCL_TABLE = false;
	
	/**
	 * 年月度. Fiscal month.<p>
	 *
	 */
	public static final String $ym = "ym";
	private static final MCPermColumnInfo _ym = createColumnInfo("ym");
	public final MCDatePermColumn ym = createDateColumn(_ym);
	
	/**
	 * 売上締ＦＬＧ. Sales closing flg..<p>
	 *
	 */
	public static final String $sls_cl_flg = "sls_cl_flg";
	private static final MCPermColumnInfo _sls_cl_flg = createColumnInfo("sls_cl_flg");
	public final MCBooleanPermColumn sls_cl_flg = createBooleanColumn(_sls_cl_flg);
	
	/**
	 * 入金締ＦＬＧ. Payment received closing flg..<p>
	 *
	 */
	public static final String $rcv_cl_flg = "rcv_cl_flg";
	private static final MCPermColumnInfo _rcv_cl_flg = createColumnInfo("rcv_cl_flg");
	public final MCBooleanPermColumn rcv_cl_flg = createBooleanColumn(_rcv_cl_flg);
	
	/**
	 * 仕入締ＦＬＧ. Purchase closing flg..<p>
	 *
	 */
	public static final String $purc_cl_flg = "purc_cl_flg";
	private static final MCPermColumnInfo _purc_cl_flg = createColumnInfo("purc_cl_flg");
	public final MCBooleanPermColumn purc_cl_flg = createBooleanColumn(_purc_cl_flg);
	
	/**
	 * 支払締ＦＬＧ. Payment closing flg..<p>
	 *
	 */
	public static final String $pay_cl_flg = "pay_cl_flg";
	private static final MCPermColumnInfo _pay_cl_flg = createColumnInfo("pay_cl_flg");
	public final MCBooleanPermColumn pay_cl_flg = createBooleanColumn(_pay_cl_flg);
	
	/**
	 * 在庫締ＦＬＧ. Inventory closing flg..<p>
	 *
	 */
	public static final String $stk_cl_flg = "stk_cl_flg";
	private static final MCPermColumnInfo _stk_cl_flg = createColumnInfo("stk_cl_flg");
	public final MCBooleanPermColumn stk_cl_flg = createBooleanColumn(_stk_cl_flg);
	
	/**
	 * 売上締実行日時. Sales closing execution date and time.<p>
	 *
	 */
	public static final String $sls_cl_tm = "sls_cl_tm";
	private static final MCPermColumnInfo _sls_cl_tm = createColumnInfo("sls_cl_tm");
	public final MCDatePermColumn sls_cl_tm = createDateColumn(_sls_cl_tm);
	
	/**
	 * 入金締実行日時. Payment received closing execution date and time.<p>
	 *
	 */
	public static final String $rcv_cl_tm = "rcv_cl_tm";
	private static final MCPermColumnInfo _rcv_cl_tm = createColumnInfo("rcv_cl_tm");
	public final MCDatePermColumn rcv_cl_tm = createDateColumn(_rcv_cl_tm);
	
	/**
	 * 仕入締実行日時. Purchase closing execution date and time.<p>
	 *
	 */
	public static final String $purc_cl_tm = "purc_cl_tm";
	private static final MCPermColumnInfo _purc_cl_tm = createColumnInfo("purc_cl_tm");
	public final MCDatePermColumn purc_cl_tm = createDateColumn(_purc_cl_tm);
	
	/**
	 * 支払締実行日時. Payment closing execution date and time.<p>
	 *
	 */
	public static final String $pay_cl_tm = "pay_cl_tm";
	private static final MCPermColumnInfo _pay_cl_tm = createColumnInfo("pay_cl_tm");
	public final MCDatePermColumn pay_cl_tm = createDateColumn(_pay_cl_tm);
	
	/**
	 * 在庫締実行日時. Inventory closing execution date and time.<p>
	 *
	 */
	public static final String $stk_cl_tm = "stk_cl_tm";
	private static final MCPermColumnInfo _stk_cl_tm = createColumnInfo("stk_cl_tm");
	public final MCDatePermColumn stk_cl_tm = createDateColumn(_stk_cl_tm);
	
	/**
	 * 売掛最終仮締実行日時. AR final temporary closing execution date and time.<p>
	 *
	 */
	public static final String $ar_pre_cl_tm = "ar_pre_cl_tm";
	private static final MCPermColumnInfo _ar_pre_cl_tm = createColumnInfo("ar_pre_cl_tm");
	public final MCDatePermColumn ar_pre_cl_tm = createDateColumn(_ar_pre_cl_tm);
	
	/**
	 * 買掛最終仮締実行日時. AP final temporary closing execution date and time.<p>
	 *
	 */
	public static final String $ap_pre_cl_tm = "ap_pre_cl_tm";
	private static final MCPermColumnInfo _ap_pre_cl_tm = createColumnInfo("ap_pre_cl_tm");
	public final MCDatePermColumn ap_pre_cl_tm = createDateColumn(_ap_pre_cl_tm);
	
	/**
	 * 売上締担当者ＣＤ. Sales closing PIC cd..<p>
	 *
	 */
	public static final String $sls_cl_usr_cd = "sls_cl_usr_cd";
	private static final MCPermColumnInfo _sls_cl_usr_cd = createColumnInfo("sls_cl_usr_cd");
	public final MCStringPermColumn sls_cl_usr_cd = createStringColumn(_sls_cl_usr_cd);
	
	/**
	 * 入金締担当者ＣＤ. Payment received closing PIC cd..<p>
	 *
	 */
	public static final String $rcv_cl_usr_cd = "rcv_cl_usr_cd";
	private static final MCPermColumnInfo _rcv_cl_usr_cd = createColumnInfo("rcv_cl_usr_cd");
	public final MCStringPermColumn rcv_cl_usr_cd = createStringColumn(_rcv_cl_usr_cd);
	
	/**
	 * 仕入締担当者ＣＤ. Purchase closing PIC cd..<p>
	 *
	 */
	public static final String $purc_cl_usr_cd = "purc_cl_usr_cd";
	private static final MCPermColumnInfo _purc_cl_usr_cd = createColumnInfo("purc_cl_usr_cd");
	public final MCStringPermColumn purc_cl_usr_cd = createStringColumn(_purc_cl_usr_cd);
	
	/**
	 * 支払締担当者ＣＤ. Payment closing PIC cd..<p>
	 *
	 */
	public static final String $pay_cl_usr_cd = "pay_cl_usr_cd";
	private static final MCPermColumnInfo _pay_cl_usr_cd = createColumnInfo("pay_cl_usr_cd");
	public final MCStringPermColumn pay_cl_usr_cd = createStringColumn(_pay_cl_usr_cd);
	
	/**
	 * 在庫締担当者ＣＤ. Inventory closing PIC cd..<p>
	 *
	 */
	public static final String $stk_cl_usr_cd = "stk_cl_usr_cd";
	private static final MCPermColumnInfo _stk_cl_usr_cd = createColumnInfo("stk_cl_usr_cd");
	public final MCStringPermColumn stk_cl_usr_cd = createStringColumn(_stk_cl_usr_cd);
	
	/**
	 * 売掛仮締担当者ＣＤ. AR temporary closing PIC cd..<p>
	 *
	 */
	public static final String $ar_pre_cl_usr_cd = "ar_pre_cl_usr_cd";
	private static final MCPermColumnInfo _ar_pre_cl_usr_cd = createColumnInfo("ar_pre_cl_usr_cd");
	public final MCStringPermColumn ar_pre_cl_usr_cd = createStringColumn(_ar_pre_cl_usr_cd);
	
	/**
	 * 買掛仮締担当者ＣＤ. AP temporary closing PIC cd..<p>
	 *
	 */
	public static final String $ap_pre_cl_usr_cd = "ap_pre_cl_usr_cd";
	private static final MCPermColumnInfo _ap_pre_cl_usr_cd = createColumnInfo("ap_pre_cl_usr_cd");
	public final MCStringPermColumn ap_pre_cl_usr_cd = createStringColumn(_ap_pre_cl_usr_cd);
	
	/**
	 * 売掛仮締ＦＬＧ. AR temporary closing flg..<p>
	 *
	 */
	public static final String $ar_pre_cl_flg = "ar_pre_cl_flg";
	private static final MCPermColumnInfo _ar_pre_cl_flg = createColumnInfo("ar_pre_cl_flg");
	public final MCBooleanPermColumn ar_pre_cl_flg = createBooleanColumn(_ar_pre_cl_flg);
	
	/**
	 * 買掛仮締ＦＬＧ. AP temporary closing flg..<p>
	 *
	 */
	public static final String $ap_pre_cl_flg = "ap_pre_cl_flg";
	private static final MCPermColumnInfo _ap_pre_cl_flg = createColumnInfo("ap_pre_cl_flg");
	public final MCBooleanPermColumn ap_pre_cl_flg = createBooleanColumn(_ap_pre_cl_flg);
	
	/**
	 * 全売掛先仮締ＦＬＧ. All AR customer temporary closing flg..<p>
	 *
	 */
	public static final String $all_acst_pre_cl_flg = "all_acst_pre_cl_flg";
	private static final MCPermColumnInfo _all_acst_pre_cl_flg = createColumnInfo("all_acst_pre_cl_flg");
	public final MCBooleanPermColumn all_acst_pre_cl_flg = createBooleanColumn(_all_acst_pre_cl_flg);
	
	/**
	 * 全買掛先仮締ＦＬＧ. All AP supplier temporary closing flg..<p>
	 *
	 */
	public static final String $all_asppl_pre_cl_flg = "all_asppl_pre_cl_flg";
	private static final MCPermColumnInfo _all_asppl_pre_cl_flg = createColumnInfo("all_asppl_pre_cl_flg");
	public final MCBooleanPermColumn all_asppl_pre_cl_flg = createBooleanColumn(_all_asppl_pre_cl_flg);
	
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
	
	public static final MCMeta ym_META = createCommonMeta($ym, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta sls_cl_flg_META = createCommonMeta($sls_cl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rcv_cl_flg_META = createCommonMeta($rcv_cl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta purc_cl_flg_META = createCommonMeta($purc_cl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta pay_cl_flg_META = createCommonMeta($pay_cl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta stk_cl_flg_META = createCommonMeta($stk_cl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sls_cl_tm_META = createCommonMeta($sls_cl_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta rcv_cl_tm_META = createCommonMeta($rcv_cl_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta purc_cl_tm_META = createCommonMeta($purc_cl_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta pay_cl_tm_META = createCommonMeta($pay_cl_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta stk_cl_tm_META = createCommonMeta($stk_cl_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta ar_pre_cl_tm_META = createCommonMeta($ar_pre_cl_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta ap_pre_cl_tm_META = createCommonMeta($ap_pre_cl_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta sls_cl_usr_cd_META = createCommonMeta($sls_cl_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta rcv_cl_usr_cd_META = createCommonMeta($rcv_cl_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta purc_cl_usr_cd_META = createCommonMeta($purc_cl_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta pay_cl_usr_cd_META = createCommonMeta($pay_cl_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta stk_cl_usr_cd_META = createCommonMeta($stk_cl_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta ar_pre_cl_usr_cd_META = createCommonMeta($ar_pre_cl_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta ap_pre_cl_usr_cd_META = createCommonMeta($ap_pre_cl_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta ar_pre_cl_flg_META = createCommonMeta($ar_pre_cl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ap_pre_cl_flg_META = createCommonMeta($ap_pre_cl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta all_acst_pre_cl_flg_META = createCommonMeta($all_acst_pre_cl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta all_asppl_pre_cl_flg_META = createCommonMeta($all_asppl_pre_cl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.CLOSE_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.CLOSE_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.CLOSE_SUB_CHAR3);
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
	
	protected static final ConstMetaList<MST_CLOSE_R> constMetas = new ConstMetaList<MST_CLOSE_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			ym_META,
			sls_cl_flg_META,
			rcv_cl_flg_META,
			purc_cl_flg_META,
			pay_cl_flg_META,
			stk_cl_flg_META,
			sls_cl_tm_META,
			rcv_cl_tm_META,
			purc_cl_tm_META,
			pay_cl_tm_META,
			stk_cl_tm_META,
			ar_pre_cl_tm_META,
			ap_pre_cl_tm_META,
			sls_cl_usr_cd_META,
			rcv_cl_usr_cd_META,
			purc_cl_usr_cd_META,
			pay_cl_usr_cd_META,
			stk_cl_usr_cd_META,
			ar_pre_cl_usr_cd_META,
			ap_pre_cl_usr_cd_META,
			ar_pre_cl_flg_META,
			ap_pre_cl_flg_META,
			all_acst_pre_cl_flg_META,
			all_asppl_pre_cl_flg_META,
			sub_char1_META,
			sub_char2_META,
			sub_char3_META,
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
	protected MST_CLOSE_R(ConstMetaList<? extends MST_CLOSE_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MST_CLOSE_R(ConstMetaList<? extends MST_CLOSE_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MST_CLOSE_R.$ym,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_CLOSE_R.$ym,
				"ym",
				ym,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_CLOSE_R.$sls_cl_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_CLOSE_R.$sls_cl_flg,
				"sls_cl_flg",
				sls_cl_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_CLOSE_R.$rcv_cl_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_CLOSE_R.$rcv_cl_flg,
				"rcv_cl_flg",
				rcv_cl_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_CLOSE_R.$purc_cl_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_CLOSE_R.$purc_cl_flg,
				"purc_cl_flg",
				purc_cl_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_CLOSE_R.$pay_cl_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_CLOSE_R.$pay_cl_flg,
				"pay_cl_flg",
				pay_cl_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_CLOSE_R.$stk_cl_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_CLOSE_R.$stk_cl_flg,
				"stk_cl_flg",
				stk_cl_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_CLOSE_R.$sls_cl_tm,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_CLOSE_R.$sls_cl_tm,
				"sls_cl_tm",
				sls_cl_tm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_CLOSE_R.$rcv_cl_tm,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_CLOSE_R.$rcv_cl_tm,
				"rcv_cl_tm",
				rcv_cl_tm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_CLOSE_R.$purc_cl_tm,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_CLOSE_R.$purc_cl_tm,
				"purc_cl_tm",
				purc_cl_tm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_CLOSE_R.$pay_cl_tm,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_CLOSE_R.$pay_cl_tm,
				"pay_cl_tm",
				pay_cl_tm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_CLOSE_R.$stk_cl_tm,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_CLOSE_R.$stk_cl_tm,
				"stk_cl_tm",
				stk_cl_tm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_CLOSE_R.$ar_pre_cl_tm,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_CLOSE_R.$ar_pre_cl_tm,
				"ar_pre_cl_tm",
				ar_pre_cl_tm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_CLOSE_R.$ap_pre_cl_tm,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_CLOSE_R.$ap_pre_cl_tm,
				"ap_pre_cl_tm",
				ap_pre_cl_tm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_CLOSE_R.$sls_cl_usr_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_CLOSE_R.$sls_cl_usr_cd,
				"sls_cl_usr_cd",
				sls_cl_usr_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_CLOSE_R.$rcv_cl_usr_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_CLOSE_R.$rcv_cl_usr_cd,
				"rcv_cl_usr_cd",
				rcv_cl_usr_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_CLOSE_R.$purc_cl_usr_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_CLOSE_R.$purc_cl_usr_cd,
				"purc_cl_usr_cd",
				purc_cl_usr_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_CLOSE_R.$pay_cl_usr_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_CLOSE_R.$pay_cl_usr_cd,
				"pay_cl_usr_cd",
				pay_cl_usr_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_CLOSE_R.$stk_cl_usr_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_CLOSE_R.$stk_cl_usr_cd,
				"stk_cl_usr_cd",
				stk_cl_usr_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_CLOSE_R.$ar_pre_cl_usr_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_CLOSE_R.$ar_pre_cl_usr_cd,
				"ar_pre_cl_usr_cd",
				ar_pre_cl_usr_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_CLOSE_R.$ap_pre_cl_usr_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_CLOSE_R.$ap_pre_cl_usr_cd,
				"ap_pre_cl_usr_cd",
				ap_pre_cl_usr_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_CLOSE_R.$ar_pre_cl_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_CLOSE_R.$ar_pre_cl_flg,
				"ar_pre_cl_flg",
				ar_pre_cl_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_CLOSE_R.$ap_pre_cl_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_CLOSE_R.$ap_pre_cl_flg,
				"ap_pre_cl_flg",
				ap_pre_cl_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_CLOSE_R.$all_acst_pre_cl_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_CLOSE_R.$all_acst_pre_cl_flg,
				"all_acst_pre_cl_flg",
				all_acst_pre_cl_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_CLOSE_R.$all_asppl_pre_cl_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_CLOSE_R.$all_asppl_pre_cl_flg,
				"all_asppl_pre_cl_flg",
				all_asppl_pre_cl_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_CLOSE_R.$sub_char1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_CLOSE_R.$sub_char1,
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
			MST_CLOSE_R.$sub_char2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_CLOSE_R.$sub_char2,
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
			MST_CLOSE_R.$sub_char3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_CLOSE_R.$sub_char3,
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
			MST_CLOSE_R.$ins_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_CLOSE_R.$ins_usr_id,
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
			MST_CLOSE_R.$ins_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_CLOSE_R.$ins_usr_nm,
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
			MST_CLOSE_R.$ins_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MST_CLOSE_R.$ins_ts,
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
			MST_CLOSE_R.$ins_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_CLOSE_R.$ins_func_id,
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
			MST_CLOSE_R.$upd_cntr,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_CLOSE_R.$upd_cntr,
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
			MST_CLOSE_R.$upd_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_CLOSE_R.$upd_usr_id,
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
			MST_CLOSE_R.$upd_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_CLOSE_R.$upd_usr_nm,
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
			MST_CLOSE_R.$upd_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MST_CLOSE_R.$upd_ts,
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
			MST_CLOSE_R.$upd_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_CLOSE_R.$upd_func_id,
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
			MST_CLOSE_R.$upd_srv_req_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_CLOSE_R.$upd_srv_req_no,
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
	public static MST_CLOSE_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MST_CLOSE_R create(String alias) {
		MST_CLOSE_R row = new MST_CLOSE_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MST_CLOSE_R createByName(T proto) {
		MST_CLOSE_R row = MST_CLOSE_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MST_CLOSE_R clone() {
		return (MST_CLOSE_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MST_CLOSE_R createInstance() {
		return (MST_CLOSE_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MST_CLOSE_R getValues(String... names) {
		return (MST_CLOSE_R) super.getValues(names);
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
	 public MSW_CLOSE_KEY_R getPkWorkDbc(String alias) {
	 	return MSW_CLOSE_KEY_R.create(alias);
	 }

	/*
	 * MCDBContainerのオーバーライドメソッドです。
	 */
	 public MSW_CLOSE_KEY_R getPkWorkDbc() {
	 	return getPkWorkDbc(MSW_CLOSE_KEY_R.TABLE_NAME);
	 }

	/**
	 * 年月度. Fiscal month.<p>
	 *
	 */
	public MCDate ym() {
		return getConstDate(offset + 0, $ym);
	}

	/**
	 * 年月度. Fiscal month.<p>
	 *
	 */
	public void ym(MCDate value) {
		setConstDate(offset + 0, $ym, value);
	}

	/**
	 * 売上締ＦＬＧ. Sales closing flg..<p>
	 *
	 */
	public boolean sls_cl_flg() {
		return getConstBoolean(offset + 1, $sls_cl_flg);
	}

	/**
	 * 売上締ＦＬＧ. Sales closing flg..<p>
	 *
	 */
	public void sls_cl_flg(boolean value) {
		setConstBoolean(offset + 1, $sls_cl_flg, value);
	}

	/**
	 * 入金締ＦＬＧ. Payment received closing flg..<p>
	 *
	 */
	public boolean rcv_cl_flg() {
		return getConstBoolean(offset + 2, $rcv_cl_flg);
	}

	/**
	 * 入金締ＦＬＧ. Payment received closing flg..<p>
	 *
	 */
	public void rcv_cl_flg(boolean value) {
		setConstBoolean(offset + 2, $rcv_cl_flg, value);
	}

	/**
	 * 仕入締ＦＬＧ. Purchase closing flg..<p>
	 *
	 */
	public boolean purc_cl_flg() {
		return getConstBoolean(offset + 3, $purc_cl_flg);
	}

	/**
	 * 仕入締ＦＬＧ. Purchase closing flg..<p>
	 *
	 */
	public void purc_cl_flg(boolean value) {
		setConstBoolean(offset + 3, $purc_cl_flg, value);
	}

	/**
	 * 支払締ＦＬＧ. Payment closing flg..<p>
	 *
	 */
	public boolean pay_cl_flg() {
		return getConstBoolean(offset + 4, $pay_cl_flg);
	}

	/**
	 * 支払締ＦＬＧ. Payment closing flg..<p>
	 *
	 */
	public void pay_cl_flg(boolean value) {
		setConstBoolean(offset + 4, $pay_cl_flg, value);
	}

	/**
	 * 在庫締ＦＬＧ. Inventory closing flg..<p>
	 *
	 */
	public boolean stk_cl_flg() {
		return getConstBoolean(offset + 5, $stk_cl_flg);
	}

	/**
	 * 在庫締ＦＬＧ. Inventory closing flg..<p>
	 *
	 */
	public void stk_cl_flg(boolean value) {
		setConstBoolean(offset + 5, $stk_cl_flg, value);
	}

	/**
	 * 売上締実行日時. Sales closing execution date and time.<p>
	 *
	 */
	public MCDate sls_cl_tm() {
		return getConstDate(offset + 6, $sls_cl_tm);
	}

	/**
	 * 売上締実行日時. Sales closing execution date and time.<p>
	 *
	 */
	public void sls_cl_tm(MCDate value) {
		setConstDate(offset + 6, $sls_cl_tm, value);
	}

	/**
	 * 入金締実行日時. Payment received closing execution date and time.<p>
	 *
	 */
	public MCDate rcv_cl_tm() {
		return getConstDate(offset + 7, $rcv_cl_tm);
	}

	/**
	 * 入金締実行日時. Payment received closing execution date and time.<p>
	 *
	 */
	public void rcv_cl_tm(MCDate value) {
		setConstDate(offset + 7, $rcv_cl_tm, value);
	}

	/**
	 * 仕入締実行日時. Purchase closing execution date and time.<p>
	 *
	 */
	public MCDate purc_cl_tm() {
		return getConstDate(offset + 8, $purc_cl_tm);
	}

	/**
	 * 仕入締実行日時. Purchase closing execution date and time.<p>
	 *
	 */
	public void purc_cl_tm(MCDate value) {
		setConstDate(offset + 8, $purc_cl_tm, value);
	}

	/**
	 * 支払締実行日時. Payment closing execution date and time.<p>
	 *
	 */
	public MCDate pay_cl_tm() {
		return getConstDate(offset + 9, $pay_cl_tm);
	}

	/**
	 * 支払締実行日時. Payment closing execution date and time.<p>
	 *
	 */
	public void pay_cl_tm(MCDate value) {
		setConstDate(offset + 9, $pay_cl_tm, value);
	}

	/**
	 * 在庫締実行日時. Inventory closing execution date and time.<p>
	 *
	 */
	public MCDate stk_cl_tm() {
		return getConstDate(offset + 10, $stk_cl_tm);
	}

	/**
	 * 在庫締実行日時. Inventory closing execution date and time.<p>
	 *
	 */
	public void stk_cl_tm(MCDate value) {
		setConstDate(offset + 10, $stk_cl_tm, value);
	}

	/**
	 * 売掛最終仮締実行日時. AR final temporary closing execution date and time.<p>
	 *
	 */
	public MCDate ar_pre_cl_tm() {
		return getConstDate(offset + 11, $ar_pre_cl_tm);
	}

	/**
	 * 売掛最終仮締実行日時. AR final temporary closing execution date and time.<p>
	 *
	 */
	public void ar_pre_cl_tm(MCDate value) {
		setConstDate(offset + 11, $ar_pre_cl_tm, value);
	}

	/**
	 * 買掛最終仮締実行日時. AP final temporary closing execution date and time.<p>
	 *
	 */
	public MCDate ap_pre_cl_tm() {
		return getConstDate(offset + 12, $ap_pre_cl_tm);
	}

	/**
	 * 買掛最終仮締実行日時. AP final temporary closing execution date and time.<p>
	 *
	 */
	public void ap_pre_cl_tm(MCDate value) {
		setConstDate(offset + 12, $ap_pre_cl_tm, value);
	}

	/**
	 * 売上締担当者ＣＤ. Sales closing PIC cd..<p>
	 *
	 */
	public String sls_cl_usr_cd() {
		return getConstString(offset + 13, $sls_cl_usr_cd);
	}

	/**
	 * 売上締担当者ＣＤ. Sales closing PIC cd..<p>
	 *
	 */
	public void sls_cl_usr_cd(String value) {
		setConstString(offset + 13, $sls_cl_usr_cd, value);
	}

	/**
	 * 入金締担当者ＣＤ. Payment received closing PIC cd..<p>
	 *
	 */
	public String rcv_cl_usr_cd() {
		return getConstString(offset + 14, $rcv_cl_usr_cd);
	}

	/**
	 * 入金締担当者ＣＤ. Payment received closing PIC cd..<p>
	 *
	 */
	public void rcv_cl_usr_cd(String value) {
		setConstString(offset + 14, $rcv_cl_usr_cd, value);
	}

	/**
	 * 仕入締担当者ＣＤ. Purchase closing PIC cd..<p>
	 *
	 */
	public String purc_cl_usr_cd() {
		return getConstString(offset + 15, $purc_cl_usr_cd);
	}

	/**
	 * 仕入締担当者ＣＤ. Purchase closing PIC cd..<p>
	 *
	 */
	public void purc_cl_usr_cd(String value) {
		setConstString(offset + 15, $purc_cl_usr_cd, value);
	}

	/**
	 * 支払締担当者ＣＤ. Payment closing PIC cd..<p>
	 *
	 */
	public String pay_cl_usr_cd() {
		return getConstString(offset + 16, $pay_cl_usr_cd);
	}

	/**
	 * 支払締担当者ＣＤ. Payment closing PIC cd..<p>
	 *
	 */
	public void pay_cl_usr_cd(String value) {
		setConstString(offset + 16, $pay_cl_usr_cd, value);
	}

	/**
	 * 在庫締担当者ＣＤ. Inventory closing PIC cd..<p>
	 *
	 */
	public String stk_cl_usr_cd() {
		return getConstString(offset + 17, $stk_cl_usr_cd);
	}

	/**
	 * 在庫締担当者ＣＤ. Inventory closing PIC cd..<p>
	 *
	 */
	public void stk_cl_usr_cd(String value) {
		setConstString(offset + 17, $stk_cl_usr_cd, value);
	}

	/**
	 * 売掛仮締担当者ＣＤ. AR temporary closing PIC cd..<p>
	 *
	 */
	public String ar_pre_cl_usr_cd() {
		return getConstString(offset + 18, $ar_pre_cl_usr_cd);
	}

	/**
	 * 売掛仮締担当者ＣＤ. AR temporary closing PIC cd..<p>
	 *
	 */
	public void ar_pre_cl_usr_cd(String value) {
		setConstString(offset + 18, $ar_pre_cl_usr_cd, value);
	}

	/**
	 * 買掛仮締担当者ＣＤ. AP temporary closing PIC cd..<p>
	 *
	 */
	public String ap_pre_cl_usr_cd() {
		return getConstString(offset + 19, $ap_pre_cl_usr_cd);
	}

	/**
	 * 買掛仮締担当者ＣＤ. AP temporary closing PIC cd..<p>
	 *
	 */
	public void ap_pre_cl_usr_cd(String value) {
		setConstString(offset + 19, $ap_pre_cl_usr_cd, value);
	}

	/**
	 * 売掛仮締ＦＬＧ. AR temporary closing flg..<p>
	 *
	 */
	public boolean ar_pre_cl_flg() {
		return getConstBoolean(offset + 20, $ar_pre_cl_flg);
	}

	/**
	 * 売掛仮締ＦＬＧ. AR temporary closing flg..<p>
	 *
	 */
	public void ar_pre_cl_flg(boolean value) {
		setConstBoolean(offset + 20, $ar_pre_cl_flg, value);
	}

	/**
	 * 買掛仮締ＦＬＧ. AP temporary closing flg..<p>
	 *
	 */
	public boolean ap_pre_cl_flg() {
		return getConstBoolean(offset + 21, $ap_pre_cl_flg);
	}

	/**
	 * 買掛仮締ＦＬＧ. AP temporary closing flg..<p>
	 *
	 */
	public void ap_pre_cl_flg(boolean value) {
		setConstBoolean(offset + 21, $ap_pre_cl_flg, value);
	}

	/**
	 * 全売掛先仮締ＦＬＧ. All AR customer temporary closing flg..<p>
	 *
	 */
	public boolean all_acst_pre_cl_flg() {
		return getConstBoolean(offset + 22, $all_acst_pre_cl_flg);
	}

	/**
	 * 全売掛先仮締ＦＬＧ. All AR customer temporary closing flg..<p>
	 *
	 */
	public void all_acst_pre_cl_flg(boolean value) {
		setConstBoolean(offset + 22, $all_acst_pre_cl_flg, value);
	}

	/**
	 * 全買掛先仮締ＦＬＧ. All AP supplier temporary closing flg..<p>
	 *
	 */
	public boolean all_asppl_pre_cl_flg() {
		return getConstBoolean(offset + 23, $all_asppl_pre_cl_flg);
	}

	/**
	 * 全買掛先仮締ＦＬＧ. All AP supplier temporary closing flg..<p>
	 *
	 */
	public void all_asppl_pre_cl_flg(boolean value) {
		setConstBoolean(offset + 23, $all_asppl_pre_cl_flg, value);
	}

	/**
	 * 予備１. Spare 1.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 24, $sub_char1);
	}

	/**
	 * 予備１. Spare 1.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 24, $sub_char1, value);
	}

	/**
	 * 予備２. Spare 2.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 25, $sub_char2);
	}

	/**
	 * 予備２. Spare 2.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 25, $sub_char2, value);
	}

	/**
	 * 予備３. Spare 3.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 26, $sub_char3);
	}

	/**
	 * 予備３. Spare 3.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 26, $sub_char3, value);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 27, $ins_usr_id);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 27, $ins_usr_id, value);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 28, $ins_usr_nm);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 28, $ins_usr_nm, value);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 29, $ins_ts);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 29, $ins_ts, value);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 30, $ins_func_id);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 30, $ins_func_id, value);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 31, $upd_cntr);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 31, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 31, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 31, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 31, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 31, $upd_cntr, value);
	}
	
	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 32, $upd_usr_id);
	}

	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 32, $upd_usr_id, value);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 33, $upd_usr_nm);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 33, $upd_usr_nm, value);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 34, $upd_ts);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 34, $upd_ts, value);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 35, $upd_func_id);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 35, $upd_func_id, value);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 36, $upd_srv_req_no);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 36, $upd_srv_req_no, value);
	}

	public String getString(String name) {
		if ($sls_cl_usr_cd.equalsIgnoreCase(name)) {
			return sls_cl_usr_cd();
		}
		if ($rcv_cl_usr_cd.equalsIgnoreCase(name)) {
			return rcv_cl_usr_cd();
		}
		if ($purc_cl_usr_cd.equalsIgnoreCase(name)) {
			return purc_cl_usr_cd();
		}
		if ($pay_cl_usr_cd.equalsIgnoreCase(name)) {
			return pay_cl_usr_cd();
		}
		if ($stk_cl_usr_cd.equalsIgnoreCase(name)) {
			return stk_cl_usr_cd();
		}
		if ($ar_pre_cl_usr_cd.equalsIgnoreCase(name)) {
			return ar_pre_cl_usr_cd();
		}
		if ($ap_pre_cl_usr_cd.equalsIgnoreCase(name)) {
			return ap_pre_cl_usr_cd();
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

	public MCDate getDate(String name) {
		if ($ym.equalsIgnoreCase(name)) {
			return ym();
		}
		if ($sls_cl_tm.equalsIgnoreCase(name)) {
			return sls_cl_tm();
		}
		if ($rcv_cl_tm.equalsIgnoreCase(name)) {
			return rcv_cl_tm();
		}
		if ($purc_cl_tm.equalsIgnoreCase(name)) {
			return purc_cl_tm();
		}
		if ($pay_cl_tm.equalsIgnoreCase(name)) {
			return pay_cl_tm();
		}
		if ($stk_cl_tm.equalsIgnoreCase(name)) {
			return stk_cl_tm();
		}
		if ($ar_pre_cl_tm.equalsIgnoreCase(name)) {
			return ar_pre_cl_tm();
		}
		if ($ap_pre_cl_tm.equalsIgnoreCase(name)) {
			return ap_pre_cl_tm();
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
		if ($sls_cl_flg.equalsIgnoreCase(name)) {
			return sls_cl_flg();
		}
		if ($rcv_cl_flg.equalsIgnoreCase(name)) {
			return rcv_cl_flg();
		}
		if ($purc_cl_flg.equalsIgnoreCase(name)) {
			return purc_cl_flg();
		}
		if ($pay_cl_flg.equalsIgnoreCase(name)) {
			return pay_cl_flg();
		}
		if ($stk_cl_flg.equalsIgnoreCase(name)) {
			return stk_cl_flg();
		}
		if ($ar_pre_cl_flg.equalsIgnoreCase(name)) {
			return ar_pre_cl_flg();
		}
		if ($ap_pre_cl_flg.equalsIgnoreCase(name)) {
			return ap_pre_cl_flg();
		}
		if ($all_acst_pre_cl_flg.equalsIgnoreCase(name)) {
			return all_acst_pre_cl_flg();
		}
		if ($all_asppl_pre_cl_flg.equalsIgnoreCase(name)) {
			return all_asppl_pre_cl_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($sls_cl_usr_cd.equalsIgnoreCase(name)) {
			return sls_cl_usr_cd();
		}
		if ($rcv_cl_usr_cd.equalsIgnoreCase(name)) {
			return rcv_cl_usr_cd();
		}
		if ($purc_cl_usr_cd.equalsIgnoreCase(name)) {
			return purc_cl_usr_cd();
		}
		if ($pay_cl_usr_cd.equalsIgnoreCase(name)) {
			return pay_cl_usr_cd();
		}
		if ($stk_cl_usr_cd.equalsIgnoreCase(name)) {
			return stk_cl_usr_cd();
		}
		if ($ar_pre_cl_usr_cd.equalsIgnoreCase(name)) {
			return ar_pre_cl_usr_cd();
		}
		if ($ap_pre_cl_usr_cd.equalsIgnoreCase(name)) {
			return ap_pre_cl_usr_cd();
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

	public MCDate getDateNE(String name) {
		if ($ym.equalsIgnoreCase(name)) {
			return ym();
		}
		if ($sls_cl_tm.equalsIgnoreCase(name)) {
			return sls_cl_tm();
		}
		if ($rcv_cl_tm.equalsIgnoreCase(name)) {
			return rcv_cl_tm();
		}
		if ($purc_cl_tm.equalsIgnoreCase(name)) {
			return purc_cl_tm();
		}
		if ($pay_cl_tm.equalsIgnoreCase(name)) {
			return pay_cl_tm();
		}
		if ($stk_cl_tm.equalsIgnoreCase(name)) {
			return stk_cl_tm();
		}
		if ($ar_pre_cl_tm.equalsIgnoreCase(name)) {
			return ar_pre_cl_tm();
		}
		if ($ap_pre_cl_tm.equalsIgnoreCase(name)) {
			return ap_pre_cl_tm();
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
		if ($sls_cl_flg.equalsIgnoreCase(name)) {
			return sls_cl_flg();
		}
		if ($rcv_cl_flg.equalsIgnoreCase(name)) {
			return rcv_cl_flg();
		}
		if ($purc_cl_flg.equalsIgnoreCase(name)) {
			return purc_cl_flg();
		}
		if ($pay_cl_flg.equalsIgnoreCase(name)) {
			return pay_cl_flg();
		}
		if ($stk_cl_flg.equalsIgnoreCase(name)) {
			return stk_cl_flg();
		}
		if ($ar_pre_cl_flg.equalsIgnoreCase(name)) {
			return ar_pre_cl_flg();
		}
		if ($ap_pre_cl_flg.equalsIgnoreCase(name)) {
			return ap_pre_cl_flg();
		}
		if ($all_acst_pre_cl_flg.equalsIgnoreCase(name)) {
			return all_acst_pre_cl_flg();
		}
		if ($all_asppl_pre_cl_flg.equalsIgnoreCase(name)) {
			return all_asppl_pre_cl_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($sls_cl_usr_cd.equalsIgnoreCase(name)) {
			sls_cl_usr_cd(value);
			return;
		}
		if ($rcv_cl_usr_cd.equalsIgnoreCase(name)) {
			rcv_cl_usr_cd(value);
			return;
		}
		if ($purc_cl_usr_cd.equalsIgnoreCase(name)) {
			purc_cl_usr_cd(value);
			return;
		}
		if ($pay_cl_usr_cd.equalsIgnoreCase(name)) {
			pay_cl_usr_cd(value);
			return;
		}
		if ($stk_cl_usr_cd.equalsIgnoreCase(name)) {
			stk_cl_usr_cd(value);
			return;
		}
		if ($ar_pre_cl_usr_cd.equalsIgnoreCase(name)) {
			ar_pre_cl_usr_cd(value);
			return;
		}
		if ($ap_pre_cl_usr_cd.equalsIgnoreCase(name)) {
			ap_pre_cl_usr_cd(value);
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

	public void setDate(String name, MCDate value) {
		if ($ym.equalsIgnoreCase(name)) {
			ym(value);
			return;
		}
		if ($sls_cl_tm.equalsIgnoreCase(name)) {
			sls_cl_tm(value);
			return;
		}
		if ($rcv_cl_tm.equalsIgnoreCase(name)) {
			rcv_cl_tm(value);
			return;
		}
		if ($purc_cl_tm.equalsIgnoreCase(name)) {
			purc_cl_tm(value);
			return;
		}
		if ($pay_cl_tm.equalsIgnoreCase(name)) {
			pay_cl_tm(value);
			return;
		}
		if ($stk_cl_tm.equalsIgnoreCase(name)) {
			stk_cl_tm(value);
			return;
		}
		if ($ar_pre_cl_tm.equalsIgnoreCase(name)) {
			ar_pre_cl_tm(value);
			return;
		}
		if ($ap_pre_cl_tm.equalsIgnoreCase(name)) {
			ap_pre_cl_tm(value);
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
		if ($sls_cl_flg.equalsIgnoreCase(name)) {
			sls_cl_flg(value);
			return;
		}
		if ($rcv_cl_flg.equalsIgnoreCase(name)) {
			rcv_cl_flg(value);
			return;
		}
		if ($purc_cl_flg.equalsIgnoreCase(name)) {
			purc_cl_flg(value);
			return;
		}
		if ($pay_cl_flg.equalsIgnoreCase(name)) {
			pay_cl_flg(value);
			return;
		}
		if ($stk_cl_flg.equalsIgnoreCase(name)) {
			stk_cl_flg(value);
			return;
		}
		if ($ar_pre_cl_flg.equalsIgnoreCase(name)) {
			ar_pre_cl_flg(value);
			return;
		}
		if ($ap_pre_cl_flg.equalsIgnoreCase(name)) {
			ap_pre_cl_flg(value);
			return;
		}
		if ($all_acst_pre_cl_flg.equalsIgnoreCase(name)) {
			all_acst_pre_cl_flg(value);
			return;
		}
		if ($all_asppl_pre_cl_flg.equalsIgnoreCase(name)) {
			all_asppl_pre_cl_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($sls_cl_usr_cd.equalsIgnoreCase(name)) {
			sls_cl_usr_cd(value);
			return;
		}
		if ($rcv_cl_usr_cd.equalsIgnoreCase(name)) {
			rcv_cl_usr_cd(value);
			return;
		}
		if ($purc_cl_usr_cd.equalsIgnoreCase(name)) {
			purc_cl_usr_cd(value);
			return;
		}
		if ($pay_cl_usr_cd.equalsIgnoreCase(name)) {
			pay_cl_usr_cd(value);
			return;
		}
		if ($stk_cl_usr_cd.equalsIgnoreCase(name)) {
			stk_cl_usr_cd(value);
			return;
		}
		if ($ar_pre_cl_usr_cd.equalsIgnoreCase(name)) {
			ar_pre_cl_usr_cd(value);
			return;
		}
		if ($ap_pre_cl_usr_cd.equalsIgnoreCase(name)) {
			ap_pre_cl_usr_cd(value);
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

	public void setDateNE(String name, MCDate value) {
		if ($ym.equalsIgnoreCase(name)) {
			ym(value);
			return;
		}
		if ($sls_cl_tm.equalsIgnoreCase(name)) {
			sls_cl_tm(value);
			return;
		}
		if ($rcv_cl_tm.equalsIgnoreCase(name)) {
			rcv_cl_tm(value);
			return;
		}
		if ($purc_cl_tm.equalsIgnoreCase(name)) {
			purc_cl_tm(value);
			return;
		}
		if ($pay_cl_tm.equalsIgnoreCase(name)) {
			pay_cl_tm(value);
			return;
		}
		if ($stk_cl_tm.equalsIgnoreCase(name)) {
			stk_cl_tm(value);
			return;
		}
		if ($ar_pre_cl_tm.equalsIgnoreCase(name)) {
			ar_pre_cl_tm(value);
			return;
		}
		if ($ap_pre_cl_tm.equalsIgnoreCase(name)) {
			ap_pre_cl_tm(value);
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
		if ($sls_cl_flg.equalsIgnoreCase(name)) {
			sls_cl_flg(value);
			return;
		}
		if ($rcv_cl_flg.equalsIgnoreCase(name)) {
			rcv_cl_flg(value);
			return;
		}
		if ($purc_cl_flg.equalsIgnoreCase(name)) {
			purc_cl_flg(value);
			return;
		}
		if ($pay_cl_flg.equalsIgnoreCase(name)) {
			pay_cl_flg(value);
			return;
		}
		if ($stk_cl_flg.equalsIgnoreCase(name)) {
			stk_cl_flg(value);
			return;
		}
		if ($ar_pre_cl_flg.equalsIgnoreCase(name)) {
			ar_pre_cl_flg(value);
			return;
		}
		if ($ap_pre_cl_flg.equalsIgnoreCase(name)) {
			ap_pre_cl_flg(value);
			return;
		}
		if ($all_acst_pre_cl_flg.equalsIgnoreCase(name)) {
			all_acst_pre_cl_flg(value);
			return;
		}
		if ($all_asppl_pre_cl_flg.equalsIgnoreCase(name)) {
			all_asppl_pre_cl_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

}
