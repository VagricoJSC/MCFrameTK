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
 * "支払予定制御マスタ（マスタ画面用） // Payment schedule control master"DBコンテナRowクラスです。<p>
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
 *  	<td>bsppl_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>支払予定管理先ＣＤ</td>
 *  	<td>Scheduled payee cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>cur_cd</td>
 *  	<td>C</td>
 *  	<td>3</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>通貨ＣＤ</td>
 *  	<td>Currency cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>K</td>
 *  	<td>min_amt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>下限金額</td>
 *  	<td>Min. amount</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>sttl_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>決済方法ＣＤ</td>
 *  	<td>Settlement method cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>K</td>
 *  	<td>wg_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>ワーキンググループＣＤ</td>
 *  	<td>WG cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>rate</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>比率</td>
 *  	<td>Ratio</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>crryovr_mons_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>サイト区分</td>
 *  	<td>Site type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>pay_day1</td>
 *  	<td>N</td>
 *  	<td>2,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>支払予定日１</td>
 *  	<td>Scheduled payment date 1</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>pay_day2</td>
 *  	<td>N</td>
 *  	<td>2,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>支払予定日２</td>
 *  	<td>Scheduled payment date 2</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>pay_day3</td>
 *  	<td>N</td>
 *  	<td>2,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>支払予定日３</td>
 *  	<td>Scheduled payment date 3</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>pay_day4</td>
 *  	<td>N</td>
 *  	<td>2,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>支払予定日４</td>
 *  	<td>Scheduled payment date 4</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>pay_day5</td>
 *  	<td>N</td>
 *  	<td>2,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>支払予定日５</td>
 *  	<td>Scheduled payment date 5</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>pay_crryovr_mons1</td>
 *  	<td>N</td>
 *  	<td>3,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>支払サイト１</td>
 *  	<td>Account payable turnover period 1</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>pay_crryovr_mons2</td>
 *  	<td>N</td>
 *  	<td>3,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>支払サイト２</td>
 *  	<td>Account payable turnover period 2</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>pay_crryovr_mons3</td>
 *  	<td>N</td>
 *  	<td>3,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>支払サイト３</td>
 *  	<td>Account payable turnover period 3</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>pay_crryovr_mons4</td>
 *  	<td>N</td>
 *  	<td>3,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>支払サイト４</td>
 *  	<td>Account payable turnover period 4</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>pay_crryovr_mons5</td>
 *  	<td>N</td>
 *  	<td>3,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>支払サイト５</td>
 *  	<td>Account payable turnover period 5</td>
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
 *  	<td>bsppl_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td>BP1.BP_NM</td>
 *  	<td>支払予定管理先名</td>
 *  	<td>Scheduled payee name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>cur_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td>CUR1.CUR_NM</td>
 *  	<td>通貨名</td>
 *  	<td>Currency name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sttl_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td>STTL1.STTL_NM</td>
 *  	<td>決済方法名</td>
 *  	<td>Settlement method name</td>
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
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
public class MAM_PAY_SCHD_CTL__R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.VIEW;

	public static final String TABLE_NAME = "MAM_PAY_SCHD_CTL_";

	public static final boolean EX_CTRL = true;
	
	public static final boolean LCL_TABLE = false;
	
	/**
	 * 支払予定管理先ＣＤ. Scheduled payee cd..<p>
	 *
	 */
	public static final String $bsppl_cd = "bsppl_cd";
	private static final MCPermColumnInfo _bsppl_cd = createColumnInfo("bsppl_cd");
	public final MCStringPermColumn bsppl_cd = createStringColumn(_bsppl_cd);
	
	/**
	 * 通貨ＣＤ. Currency cd..<p>
	 *
	 */
	public static final String $cur_cd = "cur_cd";
	private static final MCPermColumnInfo _cur_cd = createColumnInfo("cur_cd");
	public final MCStringPermColumn cur_cd = createStringColumn(_cur_cd);
	
	/**
	 * 下限金額. Min. amount.<p>
	 *
	 */
	public static final String $min_amt = "min_amt";
	private static final MCPermColumnInfo _min_amt = createColumnInfo("min_amt");
	public final MCNumberPermColumn min_amt = createNumberColumn(_min_amt);
	
	/**
	 * 決済方法ＣＤ. Settlement method cd..<p>
	 *
	 */
	public static final String $sttl_cd = "sttl_cd";
	private static final MCPermColumnInfo _sttl_cd = createColumnInfo("sttl_cd");
	public final MCStringPermColumn sttl_cd = createStringColumn(_sttl_cd);
	
	/**
	 * ワーキンググループＣＤ. WG cd..<p>
	 *
	 */
	public static final String $wg_cd = "wg_cd";
	private static final MCPermColumnInfo _wg_cd = createColumnInfo("wg_cd");
	public final MCStringPermColumn wg_cd = createStringColumn(_wg_cd);
	
	/**
	 * 比率. Ratio.<p>
	 *
	 */
	public static final String $rate = "rate";
	private static final MCPermColumnInfo _rate = createColumnInfo("rate");
	public final MCNumberPermColumn rate = createNumberColumn(_rate);
	
	/**
	 * サイト区分. Site type.<p>
	 *
	 */
	public static final String $crryovr_mons_typ = "crryovr_mons_typ";
	private static final MCPermColumnInfo _crryovr_mons_typ = createColumnInfo("crryovr_mons_typ");
	public final MCStringPermColumn crryovr_mons_typ = createStringColumn(_crryovr_mons_typ);
	
	/**
	 * 支払予定日１. Scheduled payment date 1.<p>
	 *
	 */
	public static final String $pay_day1 = "pay_day1";
	private static final MCPermColumnInfo _pay_day1 = createColumnInfo("pay_day1");
	public final MCNumberPermColumn pay_day1 = createNumberColumn(_pay_day1);
	
	/**
	 * 支払予定日２. Scheduled payment date 2.<p>
	 *
	 */
	public static final String $pay_day2 = "pay_day2";
	private static final MCPermColumnInfo _pay_day2 = createColumnInfo("pay_day2");
	public final MCNumberPermColumn pay_day2 = createNumberColumn(_pay_day2);
	
	/**
	 * 支払予定日３. Scheduled payment date 3.<p>
	 *
	 */
	public static final String $pay_day3 = "pay_day3";
	private static final MCPermColumnInfo _pay_day3 = createColumnInfo("pay_day3");
	public final MCNumberPermColumn pay_day3 = createNumberColumn(_pay_day3);
	
	/**
	 * 支払予定日４. Scheduled payment date 4.<p>
	 *
	 */
	public static final String $pay_day4 = "pay_day4";
	private static final MCPermColumnInfo _pay_day4 = createColumnInfo("pay_day4");
	public final MCNumberPermColumn pay_day4 = createNumberColumn(_pay_day4);
	
	/**
	 * 支払予定日５. Scheduled payment date 5.<p>
	 *
	 */
	public static final String $pay_day5 = "pay_day5";
	private static final MCPermColumnInfo _pay_day5 = createColumnInfo("pay_day5");
	public final MCNumberPermColumn pay_day5 = createNumberColumn(_pay_day5);
	
	/**
	 * 支払サイト１. Account payable turnover period 1.<p>
	 *
	 */
	public static final String $pay_crryovr_mons1 = "pay_crryovr_mons1";
	private static final MCPermColumnInfo _pay_crryovr_mons1 = createColumnInfo("pay_crryovr_mons1");
	public final MCNumberPermColumn pay_crryovr_mons1 = createNumberColumn(_pay_crryovr_mons1);
	
	/**
	 * 支払サイト２. Account payable turnover period 2.<p>
	 *
	 */
	public static final String $pay_crryovr_mons2 = "pay_crryovr_mons2";
	private static final MCPermColumnInfo _pay_crryovr_mons2 = createColumnInfo("pay_crryovr_mons2");
	public final MCNumberPermColumn pay_crryovr_mons2 = createNumberColumn(_pay_crryovr_mons2);
	
	/**
	 * 支払サイト３. Account payable turnover period 3.<p>
	 *
	 */
	public static final String $pay_crryovr_mons3 = "pay_crryovr_mons3";
	private static final MCPermColumnInfo _pay_crryovr_mons3 = createColumnInfo("pay_crryovr_mons3");
	public final MCNumberPermColumn pay_crryovr_mons3 = createNumberColumn(_pay_crryovr_mons3);
	
	/**
	 * 支払サイト４. Account payable turnover period 4.<p>
	 *
	 */
	public static final String $pay_crryovr_mons4 = "pay_crryovr_mons4";
	private static final MCPermColumnInfo _pay_crryovr_mons4 = createColumnInfo("pay_crryovr_mons4");
	public final MCNumberPermColumn pay_crryovr_mons4 = createNumberColumn(_pay_crryovr_mons4);
	
	/**
	 * 支払サイト５. Account payable turnover period 5.<p>
	 *
	 */
	public static final String $pay_crryovr_mons5 = "pay_crryovr_mons5";
	private static final MCPermColumnInfo _pay_crryovr_mons5 = createColumnInfo("pay_crryovr_mons5");
	public final MCNumberPermColumn pay_crryovr_mons5 = createNumberColumn(_pay_crryovr_mons5);
	
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
	 * 支払予定管理先名. Scheduled payee name.<p>
	 *
	 */
	public static final String $bsppl_nm = "bsppl_nm";
	
	/**
	 * 通貨名. Currency name.<p>
	 *
	 */
	public static final String $cur_nm = "cur_nm";
	
	/**
	 * 決済方法名. Settlement method name.<p>
	 *
	 */
	public static final String $sttl_nm = "sttl_nm";
	
	/**
	 * ワーキンググループ名. WG name.<p>
	 *
	 */
	public static final String $wg_nm = "wg_nm";
	
	public static final MCMeta bsppl_cd_META = createCommonMeta($bsppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta cur_cd_META = createCommonMeta($cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta min_amt_META = createCommonMeta($min_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta sttl_cd_META = createCommonMeta($sttl_cd, mcframe.commonMA.meta.MA_META.STTL_CD);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta rate_META = createCommonMeta($rate, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta crryovr_mons_typ_META = createCommonMeta($crryovr_mons_typ, mcframe.commonMA.meta.MA_META.CRRYOVR_MONS_TYP);
	public static final MCMeta pay_day1_META = createCommonMeta($pay_day1, mcframe.commonMA.meta.MA_META.PAY_DAY);
	public static final MCMeta pay_day2_META = createCommonMeta($pay_day2, mcframe.commonMA.meta.MA_META.PAY_DAY);
	public static final MCMeta pay_day3_META = createCommonMeta($pay_day3, mcframe.commonMA.meta.MA_META.PAY_DAY);
	public static final MCMeta pay_day4_META = createCommonMeta($pay_day4, mcframe.commonMA.meta.MA_META.PAY_DAY);
	public static final MCMeta pay_day5_META = createCommonMeta($pay_day5, mcframe.commonMA.meta.MA_META.PAY_DAY);
	public static final MCMeta pay_crryovr_mons1_META = createCommonMeta($pay_crryovr_mons1, mcframe.commonMA.meta.MA_META.CRRYOVR_MONS);
	public static final MCMeta pay_crryovr_mons2_META = createCommonMeta($pay_crryovr_mons2, mcframe.commonMA.meta.MA_META.CRRYOVR_MONS);
	public static final MCMeta pay_crryovr_mons3_META = createCommonMeta($pay_crryovr_mons3, mcframe.commonMA.meta.MA_META.CRRYOVR_MONS);
	public static final MCMeta pay_crryovr_mons4_META = createCommonMeta($pay_crryovr_mons4, mcframe.commonMA.meta.MA_META.CRRYOVR_MONS);
	public static final MCMeta pay_crryovr_mons5_META = createCommonMeta($pay_crryovr_mons5, mcframe.commonMA.meta.MA_META.CRRYOVR_MONS);
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
	public static final MCMeta bsppl_nm_META = createCommonMeta($bsppl_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta cur_nm_META = createCommonMeta($cur_nm, mcframe.commonMA.meta.MA_META.CUR_NM);
	public static final MCMeta sttl_nm_META = createCommonMeta($sttl_nm, mcframe.commonMA.meta.MA_META.STTL_NM);
	public static final MCMeta wg_nm_META = createCommonMeta($wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);

	protected static final List<MCForeignInfo> FOREIGN_INFO_LIST = new ArrayList<>();
	public static final String $BP1 = "BP1";
	public static final String $CUR1 = "CUR1";
	public static final String $STTL1 = "STTL1";
	public static final String $WG1 = "WG1";
	static {
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_BP",
				$BP1,
				new String[][]{
						{"bsppl_cd", "bp_cd"}
				},
				() -> {
					return mcframe.serverMA.dbc.MAM_BP_R.create("BP1");
				},
				(alias) -> {
					MAM_PAY_SCHD_CTL__R own = MAM_PAY_SCHD_CTL__R.create(alias);
					mcframe.serverMA.dbc.MAM_BP_R ref = mcframe.serverMA.dbc.MAM_BP_R.create("BP1");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.bsppl_cd.eq(ref.bp_cd));
					return cond;
				}
			)
		);
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_CUR",
				$CUR1,
				new String[][]{
						{"cur_cd", "cur_cd"}
				},
				() -> {
					return mcframe.serverMA.dbc.MAM_CUR_R.create("CUR1");
				},
				(alias) -> {
					MAM_PAY_SCHD_CTL__R own = MAM_PAY_SCHD_CTL__R.create(alias);
					mcframe.serverMA.dbc.MAM_CUR_R ref = mcframe.serverMA.dbc.MAM_CUR_R.create("CUR1");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.cur_cd.eq(ref.cur_cd));
					return cond;
				}
			)
		);
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_STTL",
				$STTL1,
				new String[][]{
						{"sttl_cd", "sttl_cd"}
				},
				() -> {
					return mcframe.serverMA.dbc.MAM_STTL_R.create("STTL1");
				},
				(alias) -> {
					MAM_PAY_SCHD_CTL__R own = MAM_PAY_SCHD_CTL__R.create(alias);
					mcframe.serverMA.dbc.MAM_STTL_R ref = mcframe.serverMA.dbc.MAM_STTL_R.create("STTL1");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.sttl_cd.eq(ref.sttl_cd));
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
					MAM_PAY_SCHD_CTL__R own = MAM_PAY_SCHD_CTL__R.create(alias);
					mcframe.serverMA.dbc.MAM_WG_R ref = mcframe.serverMA.dbc.MAM_WG_R.create("WG1");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.wg_cd.eq(ref.wg_cd));
					return cond;
				}
			)
		);
	}
	
	protected static final ConstMetaList<MAM_PAY_SCHD_CTL__R> constMetas = new ConstMetaList<MAM_PAY_SCHD_CTL__R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			bsppl_cd_META,
			cur_cd_META,
			min_amt_META,
			sttl_cd_META,
			wg_cd_META,
			rate_META,
			crryovr_mons_typ_META,
			pay_day1_META,
			pay_day2_META,
			pay_day3_META,
			pay_day4_META,
			pay_day5_META,
			pay_crryovr_mons1_META,
			pay_crryovr_mons2_META,
			pay_crryovr_mons3_META,
			pay_crryovr_mons4_META,
			pay_crryovr_mons5_META,
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
			bsppl_nm_META,
			cur_nm_META,
			sttl_nm_META,
			wg_nm_META
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
	protected MAM_PAY_SCHD_CTL__R(ConstMetaList<? extends MAM_PAY_SCHD_CTL__R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MAM_PAY_SCHD_CTL__R(ConstMetaList<? extends MAM_PAY_SCHD_CTL__R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MAM_PAY_SCHD_CTL__R.$bsppl_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_PAY_SCHD_CTL__R.$bsppl_cd,
				"bsppl_cd",
				bsppl_cd,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_PAY_SCHD_CTL__R.$cur_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_PAY_SCHD_CTL__R.$cur_cd,
				"cur_cd",
				cur_cd,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_PAY_SCHD_CTL__R.$min_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_PAY_SCHD_CTL__R.$min_amt,
				"min_amt",
				min_amt,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_PAY_SCHD_CTL__R.$sttl_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_PAY_SCHD_CTL__R.$sttl_cd,
				"sttl_cd",
				sttl_cd,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_PAY_SCHD_CTL__R.$wg_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_PAY_SCHD_CTL__R.$wg_cd,
				"wg_cd",
				wg_cd,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_PAY_SCHD_CTL__R.$rate,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_PAY_SCHD_CTL__R.$rate,
				"rate",
				rate,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_PAY_SCHD_CTL__R.$crryovr_mons_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_PAY_SCHD_CTL__R.$crryovr_mons_typ,
				"crryovr_mons_typ",
				crryovr_mons_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_PAY_SCHD_CTL__R.$pay_day1,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_PAY_SCHD_CTL__R.$pay_day1,
				"pay_day1",
				pay_day1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_PAY_SCHD_CTL__R.$pay_day2,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_PAY_SCHD_CTL__R.$pay_day2,
				"pay_day2",
				pay_day2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_PAY_SCHD_CTL__R.$pay_day3,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_PAY_SCHD_CTL__R.$pay_day3,
				"pay_day3",
				pay_day3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_PAY_SCHD_CTL__R.$pay_day4,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_PAY_SCHD_CTL__R.$pay_day4,
				"pay_day4",
				pay_day4,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_PAY_SCHD_CTL__R.$pay_day5,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_PAY_SCHD_CTL__R.$pay_day5,
				"pay_day5",
				pay_day5,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_PAY_SCHD_CTL__R.$pay_crryovr_mons1,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_PAY_SCHD_CTL__R.$pay_crryovr_mons1,
				"pay_crryovr_mons1",
				pay_crryovr_mons1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_PAY_SCHD_CTL__R.$pay_crryovr_mons2,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_PAY_SCHD_CTL__R.$pay_crryovr_mons2,
				"pay_crryovr_mons2",
				pay_crryovr_mons2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_PAY_SCHD_CTL__R.$pay_crryovr_mons3,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_PAY_SCHD_CTL__R.$pay_crryovr_mons3,
				"pay_crryovr_mons3",
				pay_crryovr_mons3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_PAY_SCHD_CTL__R.$pay_crryovr_mons4,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_PAY_SCHD_CTL__R.$pay_crryovr_mons4,
				"pay_crryovr_mons4",
				pay_crryovr_mons4,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_PAY_SCHD_CTL__R.$pay_crryovr_mons5,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_PAY_SCHD_CTL__R.$pay_crryovr_mons5,
				"pay_crryovr_mons5",
				pay_crryovr_mons5,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_PAY_SCHD_CTL__R.$memo1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_PAY_SCHD_CTL__R.$memo1,
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
			MAM_PAY_SCHD_CTL__R.$memo2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_PAY_SCHD_CTL__R.$memo2,
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
			MAM_PAY_SCHD_CTL__R.$memo3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_PAY_SCHD_CTL__R.$memo3,
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
			MAM_PAY_SCHD_CTL__R.$del_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_PAY_SCHD_CTL__R.$del_flg,
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
			MAM_PAY_SCHD_CTL__R.$del_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_PAY_SCHD_CTL__R.$del_usr_id,
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
			MAM_PAY_SCHD_CTL__R.$del_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_PAY_SCHD_CTL__R.$del_usr_nm,
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
			MAM_PAY_SCHD_CTL__R.$del_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MAM_PAY_SCHD_CTL__R.$del_ts,
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
			MAM_PAY_SCHD_CTL__R.$ins_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_PAY_SCHD_CTL__R.$ins_usr_id,
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
			MAM_PAY_SCHD_CTL__R.$ins_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_PAY_SCHD_CTL__R.$ins_usr_nm,
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
			MAM_PAY_SCHD_CTL__R.$ins_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MAM_PAY_SCHD_CTL__R.$ins_ts,
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
			MAM_PAY_SCHD_CTL__R.$ins_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_PAY_SCHD_CTL__R.$ins_func_id,
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
			MAM_PAY_SCHD_CTL__R.$upd_cntr,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_PAY_SCHD_CTL__R.$upd_cntr,
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
			MAM_PAY_SCHD_CTL__R.$upd_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_PAY_SCHD_CTL__R.$upd_usr_id,
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
			MAM_PAY_SCHD_CTL__R.$upd_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_PAY_SCHD_CTL__R.$upd_usr_nm,
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
			MAM_PAY_SCHD_CTL__R.$upd_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MAM_PAY_SCHD_CTL__R.$upd_ts,
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
			MAM_PAY_SCHD_CTL__R.$upd_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_PAY_SCHD_CTL__R.$upd_func_id,
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
			MAM_PAY_SCHD_CTL__R.$upd_srv_req_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_PAY_SCHD_CTL__R.$upd_srv_req_no,
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
			MAM_PAY_SCHD_CTL__R.$bsppl_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_PAY_SCHD_CTL__R.$bsppl_nm,
				"bsppl_nm",
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
			MAM_PAY_SCHD_CTL__R.$cur_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_PAY_SCHD_CTL__R.$cur_nm,
				"cur_nm",
				null,
				false,
				true,
				false,
				false,
				true,
				"CUR1.CUR_NM"
			)
		);
		COLUMN_MAP.put(
			MAM_PAY_SCHD_CTL__R.$sttl_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_PAY_SCHD_CTL__R.$sttl_nm,
				"sttl_nm",
				null,
				false,
				true,
				false,
				false,
				true,
				"STTL1.STTL_NM"
			)
		);
		COLUMN_MAP.put(
			MAM_PAY_SCHD_CTL__R.$wg_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_PAY_SCHD_CTL__R.$wg_nm,
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
		return COLUMN_MAP;
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MAM_PAY_SCHD_CTL__R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MAM_PAY_SCHD_CTL__R create(String alias) {
		MAM_PAY_SCHD_CTL__R row = new MAM_PAY_SCHD_CTL__R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MAM_PAY_SCHD_CTL__R createByName(T proto) {
		MAM_PAY_SCHD_CTL__R row = MAM_PAY_SCHD_CTL__R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAM_PAY_SCHD_CTL__R clone() {
		return (MAM_PAY_SCHD_CTL__R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAM_PAY_SCHD_CTL__R createInstance() {
		return (MAM_PAY_SCHD_CTL__R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAM_PAY_SCHD_CTL__R getValues(String... names) {
		return (MAM_PAY_SCHD_CTL__R) super.getValues(names);
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
	 * 支払予定管理先ＣＤ. Scheduled payee cd..<p>
	 *
	 */
	public String bsppl_cd() {
		return getConstString(offset + 0, $bsppl_cd);
	}

	/**
	 * 支払予定管理先ＣＤ. Scheduled payee cd..<p>
	 *
	 */
	public void bsppl_cd(String value) {
		setConstString(offset + 0, $bsppl_cd, value);
	}

	/**
	 * 通貨ＣＤ. Currency cd..<p>
	 *
	 */
	public String cur_cd() {
		return getConstString(offset + 1, $cur_cd);
	}

	/**
	 * 通貨ＣＤ. Currency cd..<p>
	 *
	 */
	public void cur_cd(String value) {
		setConstString(offset + 1, $cur_cd, value);
	}

	/**
	 * 下限金額. Min. amount.<p>
	 *
	 */
	public MCNumber min_amt() {
		return getConstNumber(offset + 2, $min_amt);
	}

	/**
	 * 下限金額. Min. amount.<p>
	 *
	 */
	public void min_amt(MCNumber value) {
		setConstNumber(offset + 2, $min_amt, value);
	}
	
	/**
	 * 下限金額. Min. amount.<p>
	 *
	 */
	public void min_amt(int value) {
		setConstNumber(offset + 2, $min_amt, value);
	}
	
	/**
	 * 下限金額. Min. amount.<p>
	 *
	 */
	public void min_amt(long value) {
		setConstNumber(offset + 2, $min_amt, value);
	}
	
	/**
	 * 下限金額. Min. amount.<p>
	 *
	 */
	public void min_amt(float value) {
		setConstNumber(offset + 2, $min_amt, value);
	}
	
	/**
	 * 下限金額. Min. amount.<p>
	 *
	 */
	public void min_amt(double value) {
		setConstNumber(offset + 2, $min_amt, value);
	}
	
	/**
	 * 決済方法ＣＤ. Settlement method cd..<p>
	 *
	 */
	public String sttl_cd() {
		return getConstString(offset + 3, $sttl_cd);
	}

	/**
	 * 決済方法ＣＤ. Settlement method cd..<p>
	 *
	 */
	public void sttl_cd(String value) {
		setConstString(offset + 3, $sttl_cd, value);
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
	 * 比率. Ratio.<p>
	 *
	 */
	public MCNumber rate() {
		return getConstNumber(offset + 5, $rate);
	}

	/**
	 * 比率. Ratio.<p>
	 *
	 */
	public void rate(MCNumber value) {
		setConstNumber(offset + 5, $rate, value);
	}
	
	/**
	 * 比率. Ratio.<p>
	 *
	 */
	public void rate(int value) {
		setConstNumber(offset + 5, $rate, value);
	}
	
	/**
	 * 比率. Ratio.<p>
	 *
	 */
	public void rate(long value) {
		setConstNumber(offset + 5, $rate, value);
	}
	
	/**
	 * 比率. Ratio.<p>
	 *
	 */
	public void rate(float value) {
		setConstNumber(offset + 5, $rate, value);
	}
	
	/**
	 * 比率. Ratio.<p>
	 *
	 */
	public void rate(double value) {
		setConstNumber(offset + 5, $rate, value);
	}
	
	/**
	 * サイト区分. Site type.<p>
	 *
	 */
	public String crryovr_mons_typ() {
		return getConstString(offset + 6, $crryovr_mons_typ);
	}

	/**
	 * サイト区分. Site type.<p>
	 *
	 */
	public void crryovr_mons_typ(String value) {
		setConstString(offset + 6, $crryovr_mons_typ, value);
	}

	/**
	 * 支払予定日１. Scheduled payment date 1.<p>
	 *
	 */
	public MCNumber pay_day1() {
		return getConstNumber(offset + 7, $pay_day1);
	}

	/**
	 * 支払予定日１. Scheduled payment date 1.<p>
	 *
	 */
	public void pay_day1(MCNumber value) {
		setConstNumber(offset + 7, $pay_day1, value);
	}
	
	/**
	 * 支払予定日１. Scheduled payment date 1.<p>
	 *
	 */
	public void pay_day1(int value) {
		setConstNumber(offset + 7, $pay_day1, value);
	}
	
	/**
	 * 支払予定日１. Scheduled payment date 1.<p>
	 *
	 */
	public void pay_day1(long value) {
		setConstNumber(offset + 7, $pay_day1, value);
	}
	
	/**
	 * 支払予定日１. Scheduled payment date 1.<p>
	 *
	 */
	public void pay_day1(float value) {
		setConstNumber(offset + 7, $pay_day1, value);
	}
	
	/**
	 * 支払予定日１. Scheduled payment date 1.<p>
	 *
	 */
	public void pay_day1(double value) {
		setConstNumber(offset + 7, $pay_day1, value);
	}
	
	/**
	 * 支払予定日２. Scheduled payment date 2.<p>
	 *
	 */
	public MCNumber pay_day2() {
		return getConstNumber(offset + 8, $pay_day2);
	}

	/**
	 * 支払予定日２. Scheduled payment date 2.<p>
	 *
	 */
	public void pay_day2(MCNumber value) {
		setConstNumber(offset + 8, $pay_day2, value);
	}
	
	/**
	 * 支払予定日２. Scheduled payment date 2.<p>
	 *
	 */
	public void pay_day2(int value) {
		setConstNumber(offset + 8, $pay_day2, value);
	}
	
	/**
	 * 支払予定日２. Scheduled payment date 2.<p>
	 *
	 */
	public void pay_day2(long value) {
		setConstNumber(offset + 8, $pay_day2, value);
	}
	
	/**
	 * 支払予定日２. Scheduled payment date 2.<p>
	 *
	 */
	public void pay_day2(float value) {
		setConstNumber(offset + 8, $pay_day2, value);
	}
	
	/**
	 * 支払予定日２. Scheduled payment date 2.<p>
	 *
	 */
	public void pay_day2(double value) {
		setConstNumber(offset + 8, $pay_day2, value);
	}
	
	/**
	 * 支払予定日３. Scheduled payment date 3.<p>
	 *
	 */
	public MCNumber pay_day3() {
		return getConstNumber(offset + 9, $pay_day3);
	}

	/**
	 * 支払予定日３. Scheduled payment date 3.<p>
	 *
	 */
	public void pay_day3(MCNumber value) {
		setConstNumber(offset + 9, $pay_day3, value);
	}
	
	/**
	 * 支払予定日３. Scheduled payment date 3.<p>
	 *
	 */
	public void pay_day3(int value) {
		setConstNumber(offset + 9, $pay_day3, value);
	}
	
	/**
	 * 支払予定日３. Scheduled payment date 3.<p>
	 *
	 */
	public void pay_day3(long value) {
		setConstNumber(offset + 9, $pay_day3, value);
	}
	
	/**
	 * 支払予定日３. Scheduled payment date 3.<p>
	 *
	 */
	public void pay_day3(float value) {
		setConstNumber(offset + 9, $pay_day3, value);
	}
	
	/**
	 * 支払予定日３. Scheduled payment date 3.<p>
	 *
	 */
	public void pay_day3(double value) {
		setConstNumber(offset + 9, $pay_day3, value);
	}
	
	/**
	 * 支払予定日４. Scheduled payment date 4.<p>
	 *
	 */
	public MCNumber pay_day4() {
		return getConstNumber(offset + 10, $pay_day4);
	}

	/**
	 * 支払予定日４. Scheduled payment date 4.<p>
	 *
	 */
	public void pay_day4(MCNumber value) {
		setConstNumber(offset + 10, $pay_day4, value);
	}
	
	/**
	 * 支払予定日４. Scheduled payment date 4.<p>
	 *
	 */
	public void pay_day4(int value) {
		setConstNumber(offset + 10, $pay_day4, value);
	}
	
	/**
	 * 支払予定日４. Scheduled payment date 4.<p>
	 *
	 */
	public void pay_day4(long value) {
		setConstNumber(offset + 10, $pay_day4, value);
	}
	
	/**
	 * 支払予定日４. Scheduled payment date 4.<p>
	 *
	 */
	public void pay_day4(float value) {
		setConstNumber(offset + 10, $pay_day4, value);
	}
	
	/**
	 * 支払予定日４. Scheduled payment date 4.<p>
	 *
	 */
	public void pay_day4(double value) {
		setConstNumber(offset + 10, $pay_day4, value);
	}
	
	/**
	 * 支払予定日５. Scheduled payment date 5.<p>
	 *
	 */
	public MCNumber pay_day5() {
		return getConstNumber(offset + 11, $pay_day5);
	}

	/**
	 * 支払予定日５. Scheduled payment date 5.<p>
	 *
	 */
	public void pay_day5(MCNumber value) {
		setConstNumber(offset + 11, $pay_day5, value);
	}
	
	/**
	 * 支払予定日５. Scheduled payment date 5.<p>
	 *
	 */
	public void pay_day5(int value) {
		setConstNumber(offset + 11, $pay_day5, value);
	}
	
	/**
	 * 支払予定日５. Scheduled payment date 5.<p>
	 *
	 */
	public void pay_day5(long value) {
		setConstNumber(offset + 11, $pay_day5, value);
	}
	
	/**
	 * 支払予定日５. Scheduled payment date 5.<p>
	 *
	 */
	public void pay_day5(float value) {
		setConstNumber(offset + 11, $pay_day5, value);
	}
	
	/**
	 * 支払予定日５. Scheduled payment date 5.<p>
	 *
	 */
	public void pay_day5(double value) {
		setConstNumber(offset + 11, $pay_day5, value);
	}
	
	/**
	 * 支払サイト１. Account payable turnover period 1.<p>
	 *
	 */
	public MCNumber pay_crryovr_mons1() {
		return getConstNumber(offset + 12, $pay_crryovr_mons1);
	}

	/**
	 * 支払サイト１. Account payable turnover period 1.<p>
	 *
	 */
	public void pay_crryovr_mons1(MCNumber value) {
		setConstNumber(offset + 12, $pay_crryovr_mons1, value);
	}
	
	/**
	 * 支払サイト１. Account payable turnover period 1.<p>
	 *
	 */
	public void pay_crryovr_mons1(int value) {
		setConstNumber(offset + 12, $pay_crryovr_mons1, value);
	}
	
	/**
	 * 支払サイト１. Account payable turnover period 1.<p>
	 *
	 */
	public void pay_crryovr_mons1(long value) {
		setConstNumber(offset + 12, $pay_crryovr_mons1, value);
	}
	
	/**
	 * 支払サイト１. Account payable turnover period 1.<p>
	 *
	 */
	public void pay_crryovr_mons1(float value) {
		setConstNumber(offset + 12, $pay_crryovr_mons1, value);
	}
	
	/**
	 * 支払サイト１. Account payable turnover period 1.<p>
	 *
	 */
	public void pay_crryovr_mons1(double value) {
		setConstNumber(offset + 12, $pay_crryovr_mons1, value);
	}
	
	/**
	 * 支払サイト２. Account payable turnover period 2.<p>
	 *
	 */
	public MCNumber pay_crryovr_mons2() {
		return getConstNumber(offset + 13, $pay_crryovr_mons2);
	}

	/**
	 * 支払サイト２. Account payable turnover period 2.<p>
	 *
	 */
	public void pay_crryovr_mons2(MCNumber value) {
		setConstNumber(offset + 13, $pay_crryovr_mons2, value);
	}
	
	/**
	 * 支払サイト２. Account payable turnover period 2.<p>
	 *
	 */
	public void pay_crryovr_mons2(int value) {
		setConstNumber(offset + 13, $pay_crryovr_mons2, value);
	}
	
	/**
	 * 支払サイト２. Account payable turnover period 2.<p>
	 *
	 */
	public void pay_crryovr_mons2(long value) {
		setConstNumber(offset + 13, $pay_crryovr_mons2, value);
	}
	
	/**
	 * 支払サイト２. Account payable turnover period 2.<p>
	 *
	 */
	public void pay_crryovr_mons2(float value) {
		setConstNumber(offset + 13, $pay_crryovr_mons2, value);
	}
	
	/**
	 * 支払サイト２. Account payable turnover period 2.<p>
	 *
	 */
	public void pay_crryovr_mons2(double value) {
		setConstNumber(offset + 13, $pay_crryovr_mons2, value);
	}
	
	/**
	 * 支払サイト３. Account payable turnover period 3.<p>
	 *
	 */
	public MCNumber pay_crryovr_mons3() {
		return getConstNumber(offset + 14, $pay_crryovr_mons3);
	}

	/**
	 * 支払サイト３. Account payable turnover period 3.<p>
	 *
	 */
	public void pay_crryovr_mons3(MCNumber value) {
		setConstNumber(offset + 14, $pay_crryovr_mons3, value);
	}
	
	/**
	 * 支払サイト３. Account payable turnover period 3.<p>
	 *
	 */
	public void pay_crryovr_mons3(int value) {
		setConstNumber(offset + 14, $pay_crryovr_mons3, value);
	}
	
	/**
	 * 支払サイト３. Account payable turnover period 3.<p>
	 *
	 */
	public void pay_crryovr_mons3(long value) {
		setConstNumber(offset + 14, $pay_crryovr_mons3, value);
	}
	
	/**
	 * 支払サイト３. Account payable turnover period 3.<p>
	 *
	 */
	public void pay_crryovr_mons3(float value) {
		setConstNumber(offset + 14, $pay_crryovr_mons3, value);
	}
	
	/**
	 * 支払サイト３. Account payable turnover period 3.<p>
	 *
	 */
	public void pay_crryovr_mons3(double value) {
		setConstNumber(offset + 14, $pay_crryovr_mons3, value);
	}
	
	/**
	 * 支払サイト４. Account payable turnover period 4.<p>
	 *
	 */
	public MCNumber pay_crryovr_mons4() {
		return getConstNumber(offset + 15, $pay_crryovr_mons4);
	}

	/**
	 * 支払サイト４. Account payable turnover period 4.<p>
	 *
	 */
	public void pay_crryovr_mons4(MCNumber value) {
		setConstNumber(offset + 15, $pay_crryovr_mons4, value);
	}
	
	/**
	 * 支払サイト４. Account payable turnover period 4.<p>
	 *
	 */
	public void pay_crryovr_mons4(int value) {
		setConstNumber(offset + 15, $pay_crryovr_mons4, value);
	}
	
	/**
	 * 支払サイト４. Account payable turnover period 4.<p>
	 *
	 */
	public void pay_crryovr_mons4(long value) {
		setConstNumber(offset + 15, $pay_crryovr_mons4, value);
	}
	
	/**
	 * 支払サイト４. Account payable turnover period 4.<p>
	 *
	 */
	public void pay_crryovr_mons4(float value) {
		setConstNumber(offset + 15, $pay_crryovr_mons4, value);
	}
	
	/**
	 * 支払サイト４. Account payable turnover period 4.<p>
	 *
	 */
	public void pay_crryovr_mons4(double value) {
		setConstNumber(offset + 15, $pay_crryovr_mons4, value);
	}
	
	/**
	 * 支払サイト５. Account payable turnover period 5.<p>
	 *
	 */
	public MCNumber pay_crryovr_mons5() {
		return getConstNumber(offset + 16, $pay_crryovr_mons5);
	}

	/**
	 * 支払サイト５. Account payable turnover period 5.<p>
	 *
	 */
	public void pay_crryovr_mons5(MCNumber value) {
		setConstNumber(offset + 16, $pay_crryovr_mons5, value);
	}
	
	/**
	 * 支払サイト５. Account payable turnover period 5.<p>
	 *
	 */
	public void pay_crryovr_mons5(int value) {
		setConstNumber(offset + 16, $pay_crryovr_mons5, value);
	}
	
	/**
	 * 支払サイト５. Account payable turnover period 5.<p>
	 *
	 */
	public void pay_crryovr_mons5(long value) {
		setConstNumber(offset + 16, $pay_crryovr_mons5, value);
	}
	
	/**
	 * 支払サイト５. Account payable turnover period 5.<p>
	 *
	 */
	public void pay_crryovr_mons5(float value) {
		setConstNumber(offset + 16, $pay_crryovr_mons5, value);
	}
	
	/**
	 * 支払サイト５. Account payable turnover period 5.<p>
	 *
	 */
	public void pay_crryovr_mons5(double value) {
		setConstNumber(offset + 16, $pay_crryovr_mons5, value);
	}
	
	/**
	 * メモ１. Memo 1.<p>
	 *
	 */
	public String memo1() {
		return getConstString(offset + 17, $memo1);
	}

	/**
	 * メモ１. Memo 1.<p>
	 *
	 */
	public void memo1(String value) {
		setConstString(offset + 17, $memo1, value);
	}

	/**
	 * メモ２. Memo 2.<p>
	 *
	 */
	public String memo2() {
		return getConstString(offset + 18, $memo2);
	}

	/**
	 * メモ２. Memo 2.<p>
	 *
	 */
	public void memo2(String value) {
		setConstString(offset + 18, $memo2, value);
	}

	/**
	 * メモ３. Memo 3.<p>
	 *
	 */
	public String memo3() {
		return getConstString(offset + 19, $memo3);
	}

	/**
	 * メモ３. Memo 3.<p>
	 *
	 */
	public void memo3(String value) {
		setConstString(offset + 19, $memo3, value);
	}

	/**
	 * 論理削除ＦＬＧ. Logical delete flg..<p>
	 *
	 */
	public boolean del_flg() {
		return getConstBoolean(offset + 20, $del_flg);
	}

	/**
	 * 論理削除ＦＬＧ. Logical delete flg..<p>
	 *
	 */
	public void del_flg(boolean value) {
		setConstBoolean(offset + 20, $del_flg, value);
	}

	/**
	 * 論理削除ユーザＩＤ. Logical delete user ID.<p>
	 *
	 */
	public String del_usr_id() {
		return getConstString(offset + 21, $del_usr_id);
	}

	/**
	 * 論理削除ユーザＩＤ. Logical delete user ID.<p>
	 *
	 */
	public void del_usr_id(String value) {
		setConstString(offset + 21, $del_usr_id, value);
	}

	/**
	 * 論理削除ユーザ名. Logical delete user name.<p>
	 *
	 */
	public String del_usr_nm() {
		return getConstString(offset + 22, $del_usr_nm);
	}

	/**
	 * 論理削除ユーザ名. Logical delete user name.<p>
	 *
	 */
	public void del_usr_nm(String value) {
		setConstString(offset + 22, $del_usr_nm, value);
	}

	/**
	 * 論理削除日時. Logical delete date and time.<p>
	 *
	 */
	public MCTimestamp del_ts() {
		return getConstTimestamp(offset + 23, $del_ts);
	}

	/**
	 * 論理削除日時. Logical delete date and time.<p>
	 *
	 */
	public void del_ts(MCTimestamp value) {
		setConstTimestamp(offset + 23, $del_ts, value);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 24, $ins_usr_id);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 24, $ins_usr_id, value);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 25, $ins_usr_nm);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 25, $ins_usr_nm, value);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 26, $ins_ts);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 26, $ins_ts, value);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 27, $ins_func_id);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 27, $ins_func_id, value);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 28, $upd_cntr);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 28, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 28, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 28, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 28, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 28, $upd_cntr, value);
	}
	
	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 29, $upd_usr_id);
	}

	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 29, $upd_usr_id, value);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 30, $upd_usr_nm);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 30, $upd_usr_nm, value);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 31, $upd_ts);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 31, $upd_ts, value);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 32, $upd_func_id);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 32, $upd_func_id, value);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 33, $upd_srv_req_no);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 33, $upd_srv_req_no, value);
	}

	/**
	 * 支払予定管理先名. Scheduled payee name.<p>
	 *
	 */
	public String bsppl_nm() {
		return getConstString(offset + 34, $bsppl_nm);
	}

	/**
	 * 支払予定管理先名. Scheduled payee name.<p>
	 *
	 */
	public void bsppl_nm(String value) {
		setConstString(offset + 34, $bsppl_nm, value);
	}

	/**
	 * 通貨名. Currency name.<p>
	 *
	 */
	public String cur_nm() {
		return getConstString(offset + 35, $cur_nm);
	}

	/**
	 * 通貨名. Currency name.<p>
	 *
	 */
	public void cur_nm(String value) {
		setConstString(offset + 35, $cur_nm, value);
	}

	/**
	 * 決済方法名. Settlement method name.<p>
	 *
	 */
	public String sttl_nm() {
		return getConstString(offset + 36, $sttl_nm);
	}

	/**
	 * 決済方法名. Settlement method name.<p>
	 *
	 */
	public void sttl_nm(String value) {
		setConstString(offset + 36, $sttl_nm, value);
	}

	/**
	 * ワーキンググループ名. WG name.<p>
	 *
	 */
	public String wg_nm() {
		return getConstString(offset + 37, $wg_nm);
	}

	/**
	 * ワーキンググループ名. WG name.<p>
	 *
	 */
	public void wg_nm(String value) {
		setConstString(offset + 37, $wg_nm, value);
	}

	public String getString(String name) {
		if ($bsppl_cd.equalsIgnoreCase(name)) {
			return bsppl_cd();
		}
		if ($cur_cd.equalsIgnoreCase(name)) {
			return cur_cd();
		}
		if ($sttl_cd.equalsIgnoreCase(name)) {
			return sttl_cd();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($crryovr_mons_typ.equalsIgnoreCase(name)) {
			return crryovr_mons_typ();
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
		if ($bsppl_nm.equalsIgnoreCase(name)) {
			return bsppl_nm();
		}
		if ($cur_nm.equalsIgnoreCase(name)) {
			return cur_nm();
		}
		if ($sttl_nm.equalsIgnoreCase(name)) {
			return sttl_nm();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		return super.getString(name);
	}

	public MCNumber getNumber(String name) {
		if ($min_amt.equalsIgnoreCase(name)) {
			return min_amt();
		}
		if ($rate.equalsIgnoreCase(name)) {
			return rate();
		}
		if ($pay_day1.equalsIgnoreCase(name)) {
			return pay_day1();
		}
		if ($pay_day2.equalsIgnoreCase(name)) {
			return pay_day2();
		}
		if ($pay_day3.equalsIgnoreCase(name)) {
			return pay_day3();
		}
		if ($pay_day4.equalsIgnoreCase(name)) {
			return pay_day4();
		}
		if ($pay_day5.equalsIgnoreCase(name)) {
			return pay_day5();
		}
		if ($pay_crryovr_mons1.equalsIgnoreCase(name)) {
			return pay_crryovr_mons1();
		}
		if ($pay_crryovr_mons2.equalsIgnoreCase(name)) {
			return pay_crryovr_mons2();
		}
		if ($pay_crryovr_mons3.equalsIgnoreCase(name)) {
			return pay_crryovr_mons3();
		}
		if ($pay_crryovr_mons4.equalsIgnoreCase(name)) {
			return pay_crryovr_mons4();
		}
		if ($pay_crryovr_mons5.equalsIgnoreCase(name)) {
			return pay_crryovr_mons5();
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
		if ($bsppl_cd.equalsIgnoreCase(name)) {
			return bsppl_cd();
		}
		if ($cur_cd.equalsIgnoreCase(name)) {
			return cur_cd();
		}
		if ($sttl_cd.equalsIgnoreCase(name)) {
			return sttl_cd();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($crryovr_mons_typ.equalsIgnoreCase(name)) {
			return crryovr_mons_typ();
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
		if ($bsppl_nm.equalsIgnoreCase(name)) {
			return bsppl_nm();
		}
		if ($cur_nm.equalsIgnoreCase(name)) {
			return cur_nm();
		}
		if ($sttl_nm.equalsIgnoreCase(name)) {
			return sttl_nm();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		return super.getStringNE(name);
	}

	public MCNumber getNumberNE(String name) {
		if ($min_amt.equalsIgnoreCase(name)) {
			return min_amt();
		}
		if ($rate.equalsIgnoreCase(name)) {
			return rate();
		}
		if ($pay_day1.equalsIgnoreCase(name)) {
			return pay_day1();
		}
		if ($pay_day2.equalsIgnoreCase(name)) {
			return pay_day2();
		}
		if ($pay_day3.equalsIgnoreCase(name)) {
			return pay_day3();
		}
		if ($pay_day4.equalsIgnoreCase(name)) {
			return pay_day4();
		}
		if ($pay_day5.equalsIgnoreCase(name)) {
			return pay_day5();
		}
		if ($pay_crryovr_mons1.equalsIgnoreCase(name)) {
			return pay_crryovr_mons1();
		}
		if ($pay_crryovr_mons2.equalsIgnoreCase(name)) {
			return pay_crryovr_mons2();
		}
		if ($pay_crryovr_mons3.equalsIgnoreCase(name)) {
			return pay_crryovr_mons3();
		}
		if ($pay_crryovr_mons4.equalsIgnoreCase(name)) {
			return pay_crryovr_mons4();
		}
		if ($pay_crryovr_mons5.equalsIgnoreCase(name)) {
			return pay_crryovr_mons5();
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
		if ($bsppl_cd.equalsIgnoreCase(name)) {
			bsppl_cd(value);
			return;
		}
		if ($cur_cd.equalsIgnoreCase(name)) {
			cur_cd(value);
			return;
		}
		if ($sttl_cd.equalsIgnoreCase(name)) {
			sttl_cd(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($crryovr_mons_typ.equalsIgnoreCase(name)) {
			crryovr_mons_typ(value);
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
		if ($bsppl_nm.equalsIgnoreCase(name)) {
			bsppl_nm(value);
			return;
		}
		if ($cur_nm.equalsIgnoreCase(name)) {
			cur_nm(value);
			return;
		}
		if ($sttl_nm.equalsIgnoreCase(name)) {
			sttl_nm(value);
			return;
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			wg_nm(value);
			return;
		}
		super.setString(name, value);
	}

	public void setNumber(String name, MCNumber value) {
		if ($min_amt.equalsIgnoreCase(name)) {
			min_amt(value);
			return;
		}
		if ($rate.equalsIgnoreCase(name)) {
			rate(value);
			return;
		}
		if ($pay_day1.equalsIgnoreCase(name)) {
			pay_day1(value);
			return;
		}
		if ($pay_day2.equalsIgnoreCase(name)) {
			pay_day2(value);
			return;
		}
		if ($pay_day3.equalsIgnoreCase(name)) {
			pay_day3(value);
			return;
		}
		if ($pay_day4.equalsIgnoreCase(name)) {
			pay_day4(value);
			return;
		}
		if ($pay_day5.equalsIgnoreCase(name)) {
			pay_day5(value);
			return;
		}
		if ($pay_crryovr_mons1.equalsIgnoreCase(name)) {
			pay_crryovr_mons1(value);
			return;
		}
		if ($pay_crryovr_mons2.equalsIgnoreCase(name)) {
			pay_crryovr_mons2(value);
			return;
		}
		if ($pay_crryovr_mons3.equalsIgnoreCase(name)) {
			pay_crryovr_mons3(value);
			return;
		}
		if ($pay_crryovr_mons4.equalsIgnoreCase(name)) {
			pay_crryovr_mons4(value);
			return;
		}
		if ($pay_crryovr_mons5.equalsIgnoreCase(name)) {
			pay_crryovr_mons5(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, int value) {
		if ($min_amt.equalsIgnoreCase(name)) {
			min_amt(value);
			return;
		}
		if ($rate.equalsIgnoreCase(name)) {
			rate(value);
			return;
		}
		if ($pay_day1.equalsIgnoreCase(name)) {
			pay_day1(value);
			return;
		}
		if ($pay_day2.equalsIgnoreCase(name)) {
			pay_day2(value);
			return;
		}
		if ($pay_day3.equalsIgnoreCase(name)) {
			pay_day3(value);
			return;
		}
		if ($pay_day4.equalsIgnoreCase(name)) {
			pay_day4(value);
			return;
		}
		if ($pay_day5.equalsIgnoreCase(name)) {
			pay_day5(value);
			return;
		}
		if ($pay_crryovr_mons1.equalsIgnoreCase(name)) {
			pay_crryovr_mons1(value);
			return;
		}
		if ($pay_crryovr_mons2.equalsIgnoreCase(name)) {
			pay_crryovr_mons2(value);
			return;
		}
		if ($pay_crryovr_mons3.equalsIgnoreCase(name)) {
			pay_crryovr_mons3(value);
			return;
		}
		if ($pay_crryovr_mons4.equalsIgnoreCase(name)) {
			pay_crryovr_mons4(value);
			return;
		}
		if ($pay_crryovr_mons5.equalsIgnoreCase(name)) {
			pay_crryovr_mons5(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, long value) {
		if ($min_amt.equalsIgnoreCase(name)) {
			min_amt(value);
			return;
		}
		if ($rate.equalsIgnoreCase(name)) {
			rate(value);
			return;
		}
		if ($pay_day1.equalsIgnoreCase(name)) {
			pay_day1(value);
			return;
		}
		if ($pay_day2.equalsIgnoreCase(name)) {
			pay_day2(value);
			return;
		}
		if ($pay_day3.equalsIgnoreCase(name)) {
			pay_day3(value);
			return;
		}
		if ($pay_day4.equalsIgnoreCase(name)) {
			pay_day4(value);
			return;
		}
		if ($pay_day5.equalsIgnoreCase(name)) {
			pay_day5(value);
			return;
		}
		if ($pay_crryovr_mons1.equalsIgnoreCase(name)) {
			pay_crryovr_mons1(value);
			return;
		}
		if ($pay_crryovr_mons2.equalsIgnoreCase(name)) {
			pay_crryovr_mons2(value);
			return;
		}
		if ($pay_crryovr_mons3.equalsIgnoreCase(name)) {
			pay_crryovr_mons3(value);
			return;
		}
		if ($pay_crryovr_mons4.equalsIgnoreCase(name)) {
			pay_crryovr_mons4(value);
			return;
		}
		if ($pay_crryovr_mons5.equalsIgnoreCase(name)) {
			pay_crryovr_mons5(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, float value) {
		if ($min_amt.equalsIgnoreCase(name)) {
			min_amt(value);
			return;
		}
		if ($rate.equalsIgnoreCase(name)) {
			rate(value);
			return;
		}
		if ($pay_day1.equalsIgnoreCase(name)) {
			pay_day1(value);
			return;
		}
		if ($pay_day2.equalsIgnoreCase(name)) {
			pay_day2(value);
			return;
		}
		if ($pay_day3.equalsIgnoreCase(name)) {
			pay_day3(value);
			return;
		}
		if ($pay_day4.equalsIgnoreCase(name)) {
			pay_day4(value);
			return;
		}
		if ($pay_day5.equalsIgnoreCase(name)) {
			pay_day5(value);
			return;
		}
		if ($pay_crryovr_mons1.equalsIgnoreCase(name)) {
			pay_crryovr_mons1(value);
			return;
		}
		if ($pay_crryovr_mons2.equalsIgnoreCase(name)) {
			pay_crryovr_mons2(value);
			return;
		}
		if ($pay_crryovr_mons3.equalsIgnoreCase(name)) {
			pay_crryovr_mons3(value);
			return;
		}
		if ($pay_crryovr_mons4.equalsIgnoreCase(name)) {
			pay_crryovr_mons4(value);
			return;
		}
		if ($pay_crryovr_mons5.equalsIgnoreCase(name)) {
			pay_crryovr_mons5(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, double value) {
		if ($min_amt.equalsIgnoreCase(name)) {
			min_amt(value);
			return;
		}
		if ($rate.equalsIgnoreCase(name)) {
			rate(value);
			return;
		}
		if ($pay_day1.equalsIgnoreCase(name)) {
			pay_day1(value);
			return;
		}
		if ($pay_day2.equalsIgnoreCase(name)) {
			pay_day2(value);
			return;
		}
		if ($pay_day3.equalsIgnoreCase(name)) {
			pay_day3(value);
			return;
		}
		if ($pay_day4.equalsIgnoreCase(name)) {
			pay_day4(value);
			return;
		}
		if ($pay_day5.equalsIgnoreCase(name)) {
			pay_day5(value);
			return;
		}
		if ($pay_crryovr_mons1.equalsIgnoreCase(name)) {
			pay_crryovr_mons1(value);
			return;
		}
		if ($pay_crryovr_mons2.equalsIgnoreCase(name)) {
			pay_crryovr_mons2(value);
			return;
		}
		if ($pay_crryovr_mons3.equalsIgnoreCase(name)) {
			pay_crryovr_mons3(value);
			return;
		}
		if ($pay_crryovr_mons4.equalsIgnoreCase(name)) {
			pay_crryovr_mons4(value);
			return;
		}
		if ($pay_crryovr_mons5.equalsIgnoreCase(name)) {
			pay_crryovr_mons5(value);
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
		if ($bsppl_cd.equalsIgnoreCase(name)) {
			bsppl_cd(value);
			return;
		}
		if ($cur_cd.equalsIgnoreCase(name)) {
			cur_cd(value);
			return;
		}
		if ($sttl_cd.equalsIgnoreCase(name)) {
			sttl_cd(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($crryovr_mons_typ.equalsIgnoreCase(name)) {
			crryovr_mons_typ(value);
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
		if ($bsppl_nm.equalsIgnoreCase(name)) {
			bsppl_nm(value);
			return;
		}
		if ($cur_nm.equalsIgnoreCase(name)) {
			cur_nm(value);
			return;
		}
		if ($sttl_nm.equalsIgnoreCase(name)) {
			sttl_nm(value);
			return;
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			wg_nm(value);
			return;
		}
		super.setStringNE(name, value);
	}

	public void setNumberNE(String name, MCNumber value) {
		if ($min_amt.equalsIgnoreCase(name)) {
			min_amt(value);
			return;
		}
		if ($rate.equalsIgnoreCase(name)) {
			rate(value);
			return;
		}
		if ($pay_day1.equalsIgnoreCase(name)) {
			pay_day1(value);
			return;
		}
		if ($pay_day2.equalsIgnoreCase(name)) {
			pay_day2(value);
			return;
		}
		if ($pay_day3.equalsIgnoreCase(name)) {
			pay_day3(value);
			return;
		}
		if ($pay_day4.equalsIgnoreCase(name)) {
			pay_day4(value);
			return;
		}
		if ($pay_day5.equalsIgnoreCase(name)) {
			pay_day5(value);
			return;
		}
		if ($pay_crryovr_mons1.equalsIgnoreCase(name)) {
			pay_crryovr_mons1(value);
			return;
		}
		if ($pay_crryovr_mons2.equalsIgnoreCase(name)) {
			pay_crryovr_mons2(value);
			return;
		}
		if ($pay_crryovr_mons3.equalsIgnoreCase(name)) {
			pay_crryovr_mons3(value);
			return;
		}
		if ($pay_crryovr_mons4.equalsIgnoreCase(name)) {
			pay_crryovr_mons4(value);
			return;
		}
		if ($pay_crryovr_mons5.equalsIgnoreCase(name)) {
			pay_crryovr_mons5(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, int value) {
		if ($min_amt.equalsIgnoreCase(name)) {
			min_amt(value);
			return;
		}
		if ($rate.equalsIgnoreCase(name)) {
			rate(value);
			return;
		}
		if ($pay_day1.equalsIgnoreCase(name)) {
			pay_day1(value);
			return;
		}
		if ($pay_day2.equalsIgnoreCase(name)) {
			pay_day2(value);
			return;
		}
		if ($pay_day3.equalsIgnoreCase(name)) {
			pay_day3(value);
			return;
		}
		if ($pay_day4.equalsIgnoreCase(name)) {
			pay_day4(value);
			return;
		}
		if ($pay_day5.equalsIgnoreCase(name)) {
			pay_day5(value);
			return;
		}
		if ($pay_crryovr_mons1.equalsIgnoreCase(name)) {
			pay_crryovr_mons1(value);
			return;
		}
		if ($pay_crryovr_mons2.equalsIgnoreCase(name)) {
			pay_crryovr_mons2(value);
			return;
		}
		if ($pay_crryovr_mons3.equalsIgnoreCase(name)) {
			pay_crryovr_mons3(value);
			return;
		}
		if ($pay_crryovr_mons4.equalsIgnoreCase(name)) {
			pay_crryovr_mons4(value);
			return;
		}
		if ($pay_crryovr_mons5.equalsIgnoreCase(name)) {
			pay_crryovr_mons5(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, long value) {
		if ($min_amt.equalsIgnoreCase(name)) {
			min_amt(value);
			return;
		}
		if ($rate.equalsIgnoreCase(name)) {
			rate(value);
			return;
		}
		if ($pay_day1.equalsIgnoreCase(name)) {
			pay_day1(value);
			return;
		}
		if ($pay_day2.equalsIgnoreCase(name)) {
			pay_day2(value);
			return;
		}
		if ($pay_day3.equalsIgnoreCase(name)) {
			pay_day3(value);
			return;
		}
		if ($pay_day4.equalsIgnoreCase(name)) {
			pay_day4(value);
			return;
		}
		if ($pay_day5.equalsIgnoreCase(name)) {
			pay_day5(value);
			return;
		}
		if ($pay_crryovr_mons1.equalsIgnoreCase(name)) {
			pay_crryovr_mons1(value);
			return;
		}
		if ($pay_crryovr_mons2.equalsIgnoreCase(name)) {
			pay_crryovr_mons2(value);
			return;
		}
		if ($pay_crryovr_mons3.equalsIgnoreCase(name)) {
			pay_crryovr_mons3(value);
			return;
		}
		if ($pay_crryovr_mons4.equalsIgnoreCase(name)) {
			pay_crryovr_mons4(value);
			return;
		}
		if ($pay_crryovr_mons5.equalsIgnoreCase(name)) {
			pay_crryovr_mons5(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, float value) {
		if ($min_amt.equalsIgnoreCase(name)) {
			min_amt(value);
			return;
		}
		if ($rate.equalsIgnoreCase(name)) {
			rate(value);
			return;
		}
		if ($pay_day1.equalsIgnoreCase(name)) {
			pay_day1(value);
			return;
		}
		if ($pay_day2.equalsIgnoreCase(name)) {
			pay_day2(value);
			return;
		}
		if ($pay_day3.equalsIgnoreCase(name)) {
			pay_day3(value);
			return;
		}
		if ($pay_day4.equalsIgnoreCase(name)) {
			pay_day4(value);
			return;
		}
		if ($pay_day5.equalsIgnoreCase(name)) {
			pay_day5(value);
			return;
		}
		if ($pay_crryovr_mons1.equalsIgnoreCase(name)) {
			pay_crryovr_mons1(value);
			return;
		}
		if ($pay_crryovr_mons2.equalsIgnoreCase(name)) {
			pay_crryovr_mons2(value);
			return;
		}
		if ($pay_crryovr_mons3.equalsIgnoreCase(name)) {
			pay_crryovr_mons3(value);
			return;
		}
		if ($pay_crryovr_mons4.equalsIgnoreCase(name)) {
			pay_crryovr_mons4(value);
			return;
		}
		if ($pay_crryovr_mons5.equalsIgnoreCase(name)) {
			pay_crryovr_mons5(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, double value) {
		if ($min_amt.equalsIgnoreCase(name)) {
			min_amt(value);
			return;
		}
		if ($rate.equalsIgnoreCase(name)) {
			rate(value);
			return;
		}
		if ($pay_day1.equalsIgnoreCase(name)) {
			pay_day1(value);
			return;
		}
		if ($pay_day2.equalsIgnoreCase(name)) {
			pay_day2(value);
			return;
		}
		if ($pay_day3.equalsIgnoreCase(name)) {
			pay_day3(value);
			return;
		}
		if ($pay_day4.equalsIgnoreCase(name)) {
			pay_day4(value);
			return;
		}
		if ($pay_day5.equalsIgnoreCase(name)) {
			pay_day5(value);
			return;
		}
		if ($pay_crryovr_mons1.equalsIgnoreCase(name)) {
			pay_crryovr_mons1(value);
			return;
		}
		if ($pay_crryovr_mons2.equalsIgnoreCase(name)) {
			pay_crryovr_mons2(value);
			return;
		}
		if ($pay_crryovr_mons3.equalsIgnoreCase(name)) {
			pay_crryovr_mons3(value);
			return;
		}
		if ($pay_crryovr_mons4.equalsIgnoreCase(name)) {
			pay_crryovr_mons4(value);
			return;
		}
		if ($pay_crryovr_mons5.equalsIgnoreCase(name)) {
			pay_crryovr_mons5(value);
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
