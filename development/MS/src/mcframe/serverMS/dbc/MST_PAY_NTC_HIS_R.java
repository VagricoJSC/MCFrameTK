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
 * "支払通知書ヘッダ履歴 // Payment notice header history"DBコンテナRowクラスです。<p>
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
 *  	<td>pay_ntc_his_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>支払通知書履歴ＮＯ</td>
 *  	<td>Payment notice history No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>pay_chk_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>支払照合ＮＯ</td>
 *  	<td>Payment collation No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>pay_ntc_rev</td>
 *  	<td>N</td>
 *  	<td>4,0</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>支払通知書改訂番号</td>
 *  	<td>Payment notice rev. number</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>latest_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>最新ＦＬＧ</td>
 *  	<td>Latest flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>can_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>取消ＦＬＧ</td>
 *  	<td>Cancel flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>bsppl_cl_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>支払予定管理先締年月日</td>
 *  	<td>Scheduled payee closing year, month, and date</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>reg_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>登録日</td>
 *  	<td>Entry date</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>pay_spot_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>都度支払ＦＬＧ</td>
 *  	<td>Payment per transaction flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>rcpt_iv_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>受領インボイスＮＯ</td>
 *  	<td>Purchase invoice No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>wrk_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>案件ＮＯ</td>
 *  	<td>Sales project No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>bsppl_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>支払予定管理先ＣＤ</td>
 *  	<td>Scheduled payee cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>bsppl_dpt_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>支払予定管理先担当部門ＣＤ</td>
 *  	<td>Cd. of dept. in charge of scheduled payee</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>pay_xrate</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>支払照合為替レート</td>
 *  	<td>Payment collation exchange rate</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>trd_cur_cd</td>
 *  	<td>C</td>
 *  	<td>3</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引通貨ＣＤ</td>
 *  	<td>Transaction currency cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>last_pay_schd_amt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>前回支払予定額</td>
 *  	<td>Last payment schedule amount</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>pay_amt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>今回支払額</td>
 *  	<td>Current payment amount</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sw_amt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>今回振替額</td>
 *  	<td>Current transfer amount</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>bfw_amt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>今回繰越額</td>
 *  	<td>Current carry-over amount</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>purc_amt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>今回仕入額</td>
 *  	<td>Current purchase amount</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>purc_dscnt_amt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>今回値引額</td>
 *  	<td>Current discount amount</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>purc_ret_amt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>今回返品額</td>
 *  	<td>Current return amount</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>setoff_amt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>今回相殺額</td>
 *  	<td>Current offset amount</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>tax_amt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>今回税額</td>
 *  	<td>Current tax amount</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sw_to_amt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>今回振替額（振替先）</td>
 *  	<td>Current transfer amount (Transfer destination)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>schd_pay_amt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>今回支払予定額</td>
 *  	<td>Current scheduled payment amount</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>adv_pay_bal</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>前渡金残高</td>
 *  	<td>Advance payment balance</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>adv_pay_amt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>前渡金支払額</td>
 *  	<td>Advance payment amount</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>adv_pay_setoff_amt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>前渡金相殺額</td>
 *  	<td>Advance payment offset amount</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>adv_pay_setoff_tax_amt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>前渡金相殺税額</td>
 *  	<td>Advance payment offset tax amount</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sub_char1</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備１</td>
 *  	<td>Spare 1</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sub_char2</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備２</td>
 *  	<td>Spare 2</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sub_char3</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備３</td>
 *  	<td>Spare 3</td>
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
public class MST_PAY_NTC_HIS_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.CO_VIEW;

	public static final String TABLE_NAME = "MST_PAY_NTC_HIS";

	public static final boolean EX_CTRL = true;
	
	public static final boolean LCL_TABLE = false;
	
	/**
	 * 支払通知書履歴ＮＯ. Payment notice history No..<p>
	 *
	 */
	public static final String $pay_ntc_his_no = "pay_ntc_his_no";
	private static final MCPermColumnInfo _pay_ntc_his_no = createColumnInfo("pay_ntc_his_no");
	public final MCStringPermColumn pay_ntc_his_no = createStringColumn(_pay_ntc_his_no);
	
	/**
	 * 支払照合ＮＯ. Payment collation No..<p>
	 *
	 */
	public static final String $pay_chk_no = "pay_chk_no";
	private static final MCPermColumnInfo _pay_chk_no = createColumnInfo("pay_chk_no");
	public final MCStringPermColumn pay_chk_no = createStringColumn(_pay_chk_no);
	
	/**
	 * 支払通知書改訂番号. Payment notice rev. number.<p>
	 *
	 */
	public static final String $pay_ntc_rev = "pay_ntc_rev";
	private static final MCPermColumnInfo _pay_ntc_rev = createColumnInfo("pay_ntc_rev");
	public final MCNumberPermColumn pay_ntc_rev = createNumberColumn(_pay_ntc_rev);
	
	/**
	 * 最新ＦＬＧ. Latest flg..<p>
	 *
	 */
	public static final String $latest_flg = "latest_flg";
	private static final MCPermColumnInfo _latest_flg = createColumnInfo("latest_flg");
	public final MCBooleanPermColumn latest_flg = createBooleanColumn(_latest_flg);
	
	/**
	 * 取消ＦＬＧ. Cancel flg..<p>
	 *
	 */
	public static final String $can_flg = "can_flg";
	private static final MCPermColumnInfo _can_flg = createColumnInfo("can_flg");
	public final MCBooleanPermColumn can_flg = createBooleanColumn(_can_flg);
	
	/**
	 * 支払予定管理先締年月日. Scheduled payee closing year, month, and date.<p>
	 *
	 */
	public static final String $bsppl_cl_dt = "bsppl_cl_dt";
	private static final MCPermColumnInfo _bsppl_cl_dt = createColumnInfo("bsppl_cl_dt");
	public final MCDatePermColumn bsppl_cl_dt = createDateColumn(_bsppl_cl_dt);
	
	/**
	 * 登録日. Entry date.<p>
	 *
	 */
	public static final String $reg_dt = "reg_dt";
	private static final MCPermColumnInfo _reg_dt = createColumnInfo("reg_dt");
	public final MCDatePermColumn reg_dt = createDateColumn(_reg_dt);
	
	/**
	 * 都度支払ＦＬＧ. Payment per transaction flg..<p>
	 *
	 */
	public static final String $pay_spot_flg = "pay_spot_flg";
	private static final MCPermColumnInfo _pay_spot_flg = createColumnInfo("pay_spot_flg");
	public final MCBooleanPermColumn pay_spot_flg = createBooleanColumn(_pay_spot_flg);
	
	/**
	 * 受領インボイスＮＯ. Purchase invoice No..<p>
	 *
	 */
	public static final String $rcpt_iv_no = "rcpt_iv_no";
	private static final MCPermColumnInfo _rcpt_iv_no = createColumnInfo("rcpt_iv_no");
	public final MCStringPermColumn rcpt_iv_no = createStringColumn(_rcpt_iv_no);
	
	/**
	 * 案件ＮＯ. Sales project No..<p>
	 *
	 */
	public static final String $wrk_no = "wrk_no";
	private static final MCPermColumnInfo _wrk_no = createColumnInfo("wrk_no");
	public final MCStringPermColumn wrk_no = createStringColumn(_wrk_no);
	
	/**
	 * 支払予定管理先ＣＤ. Scheduled payee cd..<p>
	 *
	 */
	public static final String $bsppl_cd = "bsppl_cd";
	private static final MCPermColumnInfo _bsppl_cd = createColumnInfo("bsppl_cd");
	public final MCStringPermColumn bsppl_cd = createStringColumn(_bsppl_cd);
	
	/**
	 * 支払予定管理先担当部門ＣＤ. Cd. of dept. in charge of scheduled payee.<p>
	 *
	 */
	public static final String $bsppl_dpt_cd = "bsppl_dpt_cd";
	private static final MCPermColumnInfo _bsppl_dpt_cd = createColumnInfo("bsppl_dpt_cd");
	public final MCStringPermColumn bsppl_dpt_cd = createStringColumn(_bsppl_dpt_cd);
	
	/**
	 * 支払照合為替レート. Payment collation exchange rate.<p>
	 *
	 */
	public static final String $pay_xrate = "pay_xrate";
	private static final MCPermColumnInfo _pay_xrate = createColumnInfo("pay_xrate");
	public final MCNumberPermColumn pay_xrate = createNumberColumn(_pay_xrate);
	
	/**
	 * 取引通貨ＣＤ. Transaction currency cd..<p>
	 *
	 */
	public static final String $trd_cur_cd = "trd_cur_cd";
	private static final MCPermColumnInfo _trd_cur_cd = createColumnInfo("trd_cur_cd");
	public final MCStringPermColumn trd_cur_cd = createStringColumn(_trd_cur_cd);
	
	/**
	 * 前回支払予定額. Last payment schedule amount.<p>
	 *
	 */
	public static final String $last_pay_schd_amt = "last_pay_schd_amt";
	private static final MCPermColumnInfo _last_pay_schd_amt = createColumnInfo("last_pay_schd_amt");
	public final MCNumberPermColumn last_pay_schd_amt = createNumberColumn(_last_pay_schd_amt);
	
	/**
	 * 今回支払額. Current payment amount.<p>
	 *
	 */
	public static final String $pay_amt = "pay_amt";
	private static final MCPermColumnInfo _pay_amt = createColumnInfo("pay_amt");
	public final MCNumberPermColumn pay_amt = createNumberColumn(_pay_amt);
	
	/**
	 * 今回振替額. Current transfer amount.<p>
	 *
	 */
	public static final String $sw_amt = "sw_amt";
	private static final MCPermColumnInfo _sw_amt = createColumnInfo("sw_amt");
	public final MCNumberPermColumn sw_amt = createNumberColumn(_sw_amt);
	
	/**
	 * 今回繰越額. Current carry-over amount.<p>
	 *
	 */
	public static final String $bfw_amt = "bfw_amt";
	private static final MCPermColumnInfo _bfw_amt = createColumnInfo("bfw_amt");
	public final MCNumberPermColumn bfw_amt = createNumberColumn(_bfw_amt);
	
	/**
	 * 今回仕入額. Current purchase amount.<p>
	 *
	 */
	public static final String $purc_amt = "purc_amt";
	private static final MCPermColumnInfo _purc_amt = createColumnInfo("purc_amt");
	public final MCNumberPermColumn purc_amt = createNumberColumn(_purc_amt);
	
	/**
	 * 今回値引額. Current discount amount.<p>
	 *
	 */
	public static final String $purc_dscnt_amt = "purc_dscnt_amt";
	private static final MCPermColumnInfo _purc_dscnt_amt = createColumnInfo("purc_dscnt_amt");
	public final MCNumberPermColumn purc_dscnt_amt = createNumberColumn(_purc_dscnt_amt);
	
	/**
	 * 今回返品額. Current return amount.<p>
	 *
	 */
	public static final String $purc_ret_amt = "purc_ret_amt";
	private static final MCPermColumnInfo _purc_ret_amt = createColumnInfo("purc_ret_amt");
	public final MCNumberPermColumn purc_ret_amt = createNumberColumn(_purc_ret_amt);
	
	/**
	 * 今回相殺額. Current offset amount.<p>
	 *
	 */
	public static final String $setoff_amt = "setoff_amt";
	private static final MCPermColumnInfo _setoff_amt = createColumnInfo("setoff_amt");
	public final MCNumberPermColumn setoff_amt = createNumberColumn(_setoff_amt);
	
	/**
	 * 今回税額. Current tax amount.<p>
	 *
	 */
	public static final String $tax_amt = "tax_amt";
	private static final MCPermColumnInfo _tax_amt = createColumnInfo("tax_amt");
	public final MCNumberPermColumn tax_amt = createNumberColumn(_tax_amt);
	
	/**
	 * 今回振替額（振替先）. Current transfer amount (Transfer destination).<p>
	 *
	 */
	public static final String $sw_to_amt = "sw_to_amt";
	private static final MCPermColumnInfo _sw_to_amt = createColumnInfo("sw_to_amt");
	public final MCNumberPermColumn sw_to_amt = createNumberColumn(_sw_to_amt);
	
	/**
	 * 今回支払予定額. Current scheduled payment amount.<p>
	 *
	 */
	public static final String $schd_pay_amt = "schd_pay_amt";
	private static final MCPermColumnInfo _schd_pay_amt = createColumnInfo("schd_pay_amt");
	public final MCNumberPermColumn schd_pay_amt = createNumberColumn(_schd_pay_amt);
	
	/**
	 * 前渡金残高. Advance payment balance.<p>
	 *
	 */
	public static final String $adv_pay_bal = "adv_pay_bal";
	private static final MCPermColumnInfo _adv_pay_bal = createColumnInfo("adv_pay_bal");
	public final MCNumberPermColumn adv_pay_bal = createNumberColumn(_adv_pay_bal);
	
	/**
	 * 前渡金支払額. Advance payment amount.<p>
	 *
	 */
	public static final String $adv_pay_amt = "adv_pay_amt";
	private static final MCPermColumnInfo _adv_pay_amt = createColumnInfo("adv_pay_amt");
	public final MCNumberPermColumn adv_pay_amt = createNumberColumn(_adv_pay_amt);
	
	/**
	 * 前渡金相殺額. Advance payment offset amount.<p>
	 *
	 */
	public static final String $adv_pay_setoff_amt = "adv_pay_setoff_amt";
	private static final MCPermColumnInfo _adv_pay_setoff_amt = createColumnInfo("adv_pay_setoff_amt");
	public final MCNumberPermColumn adv_pay_setoff_amt = createNumberColumn(_adv_pay_setoff_amt);
	
	/**
	 * 前渡金相殺税額. Advance payment offset tax amount.<p>
	 *
	 */
	public static final String $adv_pay_setoff_tax_amt = "adv_pay_setoff_tax_amt";
	private static final MCPermColumnInfo _adv_pay_setoff_tax_amt = createColumnInfo("adv_pay_setoff_tax_amt");
	public final MCNumberPermColumn adv_pay_setoff_tax_amt = createNumberColumn(_adv_pay_setoff_tax_amt);
	
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
	
	public static final MCMeta pay_ntc_his_no_META = createCommonMeta($pay_ntc_his_no, mcframe.commonMA.meta.MA_META.PAY_NTC_HIS_NO);
	public static final MCMeta pay_chk_no_META = createCommonMeta($pay_chk_no, mcframe.commonMA.meta.MA_META.PAY_CHK_NO);
	public static final MCMeta pay_ntc_rev_META = createCommonMeta($pay_ntc_rev, mcframe.commonMA.meta.MA_META.SLIP_REV);
	public static final MCMeta latest_flg_META = createCommonMeta($latest_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta can_flg_META = createCommonMeta($can_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bsppl_cl_dt_META = createCommonMeta($bsppl_cl_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta reg_dt_META = createCommonMeta($reg_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta pay_spot_flg_META = createCommonMeta($pay_spot_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rcpt_iv_no_META = createCommonMeta($rcpt_iv_no, mcframe.commonMA.meta.MA_META.IV_NO);
	public static final MCMeta wrk_no_META = createCommonMeta($wrk_no, mcframe.commonMA.meta.MA_META.WRK_NO);
	public static final MCMeta bsppl_cd_META = createCommonMeta($bsppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta bsppl_dpt_cd_META = createCommonMeta($bsppl_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta pay_xrate_META = createCommonMeta($pay_xrate, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta trd_cur_cd_META = createCommonMeta($trd_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta last_pay_schd_amt_META = createCommonMeta($last_pay_schd_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta pay_amt_META = createCommonMeta($pay_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta sw_amt_META = createCommonMeta($sw_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta bfw_amt_META = createCommonMeta($bfw_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta purc_amt_META = createCommonMeta($purc_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta purc_dscnt_amt_META = createCommonMeta($purc_dscnt_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta purc_ret_amt_META = createCommonMeta($purc_ret_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta setoff_amt_META = createCommonMeta($setoff_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta tax_amt_META = createCommonMeta($tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta sw_to_amt_META = createCommonMeta($sw_to_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta schd_pay_amt_META = createCommonMeta($schd_pay_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta adv_pay_bal_META = createCommonMeta($adv_pay_bal, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta adv_pay_amt_META = createCommonMeta($adv_pay_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta adv_pay_setoff_amt_META = createCommonMeta($adv_pay_setoff_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta adv_pay_setoff_tax_amt_META = createCommonMeta($adv_pay_setoff_tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.PAY_CHK_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.PAY_CHK_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.PAY_CHK_SUB_CHAR3);
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
	
	protected static final ConstMetaList<MST_PAY_NTC_HIS_R> constMetas = new ConstMetaList<MST_PAY_NTC_HIS_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			pay_ntc_his_no_META,
			pay_chk_no_META,
			pay_ntc_rev_META,
			latest_flg_META,
			can_flg_META,
			bsppl_cl_dt_META,
			reg_dt_META,
			pay_spot_flg_META,
			rcpt_iv_no_META,
			wrk_no_META,
			bsppl_cd_META,
			bsppl_dpt_cd_META,
			pay_xrate_META,
			trd_cur_cd_META,
			last_pay_schd_amt_META,
			pay_amt_META,
			sw_amt_META,
			bfw_amt_META,
			purc_amt_META,
			purc_dscnt_amt_META,
			purc_ret_amt_META,
			setoff_amt_META,
			tax_amt_META,
			sw_to_amt_META,
			schd_pay_amt_META,
			adv_pay_bal_META,
			adv_pay_amt_META,
			adv_pay_setoff_amt_META,
			adv_pay_setoff_tax_amt_META,
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
	protected MST_PAY_NTC_HIS_R(ConstMetaList<? extends MST_PAY_NTC_HIS_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MST_PAY_NTC_HIS_R(ConstMetaList<? extends MST_PAY_NTC_HIS_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MST_PAY_NTC_HIS_R.$pay_ntc_his_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PAY_NTC_HIS_R.$pay_ntc_his_no,
				"pay_ntc_his_no",
				pay_ntc_his_no,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PAY_NTC_HIS_R.$pay_chk_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PAY_NTC_HIS_R.$pay_chk_no,
				"pay_chk_no",
				pay_chk_no,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PAY_NTC_HIS_R.$pay_ntc_rev,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_PAY_NTC_HIS_R.$pay_ntc_rev,
				"pay_ntc_rev",
				pay_ntc_rev,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PAY_NTC_HIS_R.$latest_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_PAY_NTC_HIS_R.$latest_flg,
				"latest_flg",
				latest_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PAY_NTC_HIS_R.$can_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_PAY_NTC_HIS_R.$can_flg,
				"can_flg",
				can_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PAY_NTC_HIS_R.$bsppl_cl_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_PAY_NTC_HIS_R.$bsppl_cl_dt,
				"bsppl_cl_dt",
				bsppl_cl_dt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PAY_NTC_HIS_R.$reg_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_PAY_NTC_HIS_R.$reg_dt,
				"reg_dt",
				reg_dt,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PAY_NTC_HIS_R.$pay_spot_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_PAY_NTC_HIS_R.$pay_spot_flg,
				"pay_spot_flg",
				pay_spot_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PAY_NTC_HIS_R.$rcpt_iv_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PAY_NTC_HIS_R.$rcpt_iv_no,
				"rcpt_iv_no",
				rcpt_iv_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PAY_NTC_HIS_R.$wrk_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PAY_NTC_HIS_R.$wrk_no,
				"wrk_no",
				wrk_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PAY_NTC_HIS_R.$bsppl_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PAY_NTC_HIS_R.$bsppl_cd,
				"bsppl_cd",
				bsppl_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PAY_NTC_HIS_R.$bsppl_dpt_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PAY_NTC_HIS_R.$bsppl_dpt_cd,
				"bsppl_dpt_cd",
				bsppl_dpt_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PAY_NTC_HIS_R.$pay_xrate,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_PAY_NTC_HIS_R.$pay_xrate,
				"pay_xrate",
				pay_xrate,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PAY_NTC_HIS_R.$trd_cur_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PAY_NTC_HIS_R.$trd_cur_cd,
				"trd_cur_cd",
				trd_cur_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PAY_NTC_HIS_R.$last_pay_schd_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_PAY_NTC_HIS_R.$last_pay_schd_amt,
				"last_pay_schd_amt",
				last_pay_schd_amt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PAY_NTC_HIS_R.$pay_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_PAY_NTC_HIS_R.$pay_amt,
				"pay_amt",
				pay_amt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PAY_NTC_HIS_R.$sw_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_PAY_NTC_HIS_R.$sw_amt,
				"sw_amt",
				sw_amt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PAY_NTC_HIS_R.$bfw_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_PAY_NTC_HIS_R.$bfw_amt,
				"bfw_amt",
				bfw_amt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PAY_NTC_HIS_R.$purc_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_PAY_NTC_HIS_R.$purc_amt,
				"purc_amt",
				purc_amt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PAY_NTC_HIS_R.$purc_dscnt_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_PAY_NTC_HIS_R.$purc_dscnt_amt,
				"purc_dscnt_amt",
				purc_dscnt_amt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PAY_NTC_HIS_R.$purc_ret_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_PAY_NTC_HIS_R.$purc_ret_amt,
				"purc_ret_amt",
				purc_ret_amt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PAY_NTC_HIS_R.$setoff_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_PAY_NTC_HIS_R.$setoff_amt,
				"setoff_amt",
				setoff_amt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PAY_NTC_HIS_R.$tax_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_PAY_NTC_HIS_R.$tax_amt,
				"tax_amt",
				tax_amt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PAY_NTC_HIS_R.$sw_to_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_PAY_NTC_HIS_R.$sw_to_amt,
				"sw_to_amt",
				sw_to_amt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PAY_NTC_HIS_R.$schd_pay_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_PAY_NTC_HIS_R.$schd_pay_amt,
				"schd_pay_amt",
				schd_pay_amt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PAY_NTC_HIS_R.$adv_pay_bal,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_PAY_NTC_HIS_R.$adv_pay_bal,
				"adv_pay_bal",
				adv_pay_bal,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PAY_NTC_HIS_R.$adv_pay_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_PAY_NTC_HIS_R.$adv_pay_amt,
				"adv_pay_amt",
				adv_pay_amt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PAY_NTC_HIS_R.$adv_pay_setoff_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_PAY_NTC_HIS_R.$adv_pay_setoff_amt,
				"adv_pay_setoff_amt",
				adv_pay_setoff_amt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PAY_NTC_HIS_R.$adv_pay_setoff_tax_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_PAY_NTC_HIS_R.$adv_pay_setoff_tax_amt,
				"adv_pay_setoff_tax_amt",
				adv_pay_setoff_tax_amt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PAY_NTC_HIS_R.$sub_char1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PAY_NTC_HIS_R.$sub_char1,
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
			MST_PAY_NTC_HIS_R.$sub_char2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PAY_NTC_HIS_R.$sub_char2,
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
			MST_PAY_NTC_HIS_R.$sub_char3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PAY_NTC_HIS_R.$sub_char3,
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
			MST_PAY_NTC_HIS_R.$ins_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PAY_NTC_HIS_R.$ins_usr_id,
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
			MST_PAY_NTC_HIS_R.$ins_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PAY_NTC_HIS_R.$ins_usr_nm,
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
			MST_PAY_NTC_HIS_R.$ins_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MST_PAY_NTC_HIS_R.$ins_ts,
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
			MST_PAY_NTC_HIS_R.$ins_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PAY_NTC_HIS_R.$ins_func_id,
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
			MST_PAY_NTC_HIS_R.$upd_cntr,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_PAY_NTC_HIS_R.$upd_cntr,
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
			MST_PAY_NTC_HIS_R.$upd_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PAY_NTC_HIS_R.$upd_usr_id,
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
			MST_PAY_NTC_HIS_R.$upd_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PAY_NTC_HIS_R.$upd_usr_nm,
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
			MST_PAY_NTC_HIS_R.$upd_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MST_PAY_NTC_HIS_R.$upd_ts,
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
			MST_PAY_NTC_HIS_R.$upd_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PAY_NTC_HIS_R.$upd_func_id,
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
			MST_PAY_NTC_HIS_R.$upd_srv_req_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PAY_NTC_HIS_R.$upd_srv_req_no,
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
	public static MST_PAY_NTC_HIS_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MST_PAY_NTC_HIS_R create(String alias) {
		MST_PAY_NTC_HIS_R row = new MST_PAY_NTC_HIS_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MST_PAY_NTC_HIS_R createByName(T proto) {
		MST_PAY_NTC_HIS_R row = MST_PAY_NTC_HIS_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MST_PAY_NTC_HIS_R clone() {
		return (MST_PAY_NTC_HIS_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MST_PAY_NTC_HIS_R createInstance() {
		return (MST_PAY_NTC_HIS_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MST_PAY_NTC_HIS_R getValues(String... names) {
		return (MST_PAY_NTC_HIS_R) super.getValues(names);
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
	 public MSW_PAY_NTC_HIS_KEY_R getPkWorkDbc(String alias) {
	 	return MSW_PAY_NTC_HIS_KEY_R.create(alias);
	 }

	/*
	 * MCDBContainerのオーバーライドメソッドです。
	 */
	 public MSW_PAY_NTC_HIS_KEY_R getPkWorkDbc() {
	 	return getPkWorkDbc(MSW_PAY_NTC_HIS_KEY_R.TABLE_NAME);
	 }

	/**
	 * 支払通知書履歴ＮＯ. Payment notice history No..<p>
	 *
	 */
	public String pay_ntc_his_no() {
		return getConstString(offset + 0, $pay_ntc_his_no);
	}

	/**
	 * 支払通知書履歴ＮＯ. Payment notice history No..<p>
	 *
	 */
	public void pay_ntc_his_no(String value) {
		setConstString(offset + 0, $pay_ntc_his_no, value);
	}

	/**
	 * 支払照合ＮＯ. Payment collation No..<p>
	 *
	 */
	public String pay_chk_no() {
		return getConstString(offset + 1, $pay_chk_no);
	}

	/**
	 * 支払照合ＮＯ. Payment collation No..<p>
	 *
	 */
	public void pay_chk_no(String value) {
		setConstString(offset + 1, $pay_chk_no, value);
	}

	/**
	 * 支払通知書改訂番号. Payment notice rev. number.<p>
	 *
	 */
	public MCNumber pay_ntc_rev() {
		return getConstNumber(offset + 2, $pay_ntc_rev);
	}

	/**
	 * 支払通知書改訂番号. Payment notice rev. number.<p>
	 *
	 */
	public void pay_ntc_rev(MCNumber value) {
		setConstNumber(offset + 2, $pay_ntc_rev, value);
	}
	
	/**
	 * 支払通知書改訂番号. Payment notice rev. number.<p>
	 *
	 */
	public void pay_ntc_rev(int value) {
		setConstNumber(offset + 2, $pay_ntc_rev, value);
	}
	
	/**
	 * 支払通知書改訂番号. Payment notice rev. number.<p>
	 *
	 */
	public void pay_ntc_rev(long value) {
		setConstNumber(offset + 2, $pay_ntc_rev, value);
	}
	
	/**
	 * 支払通知書改訂番号. Payment notice rev. number.<p>
	 *
	 */
	public void pay_ntc_rev(float value) {
		setConstNumber(offset + 2, $pay_ntc_rev, value);
	}
	
	/**
	 * 支払通知書改訂番号. Payment notice rev. number.<p>
	 *
	 */
	public void pay_ntc_rev(double value) {
		setConstNumber(offset + 2, $pay_ntc_rev, value);
	}
	
	/**
	 * 最新ＦＬＧ. Latest flg..<p>
	 *
	 */
	public boolean latest_flg() {
		return getConstBoolean(offset + 3, $latest_flg);
	}

	/**
	 * 最新ＦＬＧ. Latest flg..<p>
	 *
	 */
	public void latest_flg(boolean value) {
		setConstBoolean(offset + 3, $latest_flg, value);
	}

	/**
	 * 取消ＦＬＧ. Cancel flg..<p>
	 *
	 */
	public boolean can_flg() {
		return getConstBoolean(offset + 4, $can_flg);
	}

	/**
	 * 取消ＦＬＧ. Cancel flg..<p>
	 *
	 */
	public void can_flg(boolean value) {
		setConstBoolean(offset + 4, $can_flg, value);
	}

	/**
	 * 支払予定管理先締年月日. Scheduled payee closing year, month, and date.<p>
	 *
	 */
	public MCDate bsppl_cl_dt() {
		return getConstDate(offset + 5, $bsppl_cl_dt);
	}

	/**
	 * 支払予定管理先締年月日. Scheduled payee closing year, month, and date.<p>
	 *
	 */
	public void bsppl_cl_dt(MCDate value) {
		setConstDate(offset + 5, $bsppl_cl_dt, value);
	}

	/**
	 * 登録日. Entry date.<p>
	 *
	 */
	public MCDate reg_dt() {
		return getConstDate(offset + 6, $reg_dt);
	}

	/**
	 * 登録日. Entry date.<p>
	 *
	 */
	public void reg_dt(MCDate value) {
		setConstDate(offset + 6, $reg_dt, value);
	}

	/**
	 * 都度支払ＦＬＧ. Payment per transaction flg..<p>
	 *
	 */
	public boolean pay_spot_flg() {
		return getConstBoolean(offset + 7, $pay_spot_flg);
	}

	/**
	 * 都度支払ＦＬＧ. Payment per transaction flg..<p>
	 *
	 */
	public void pay_spot_flg(boolean value) {
		setConstBoolean(offset + 7, $pay_spot_flg, value);
	}

	/**
	 * 受領インボイスＮＯ. Purchase invoice No..<p>
	 *
	 */
	public String rcpt_iv_no() {
		return getConstString(offset + 8, $rcpt_iv_no);
	}

	/**
	 * 受領インボイスＮＯ. Purchase invoice No..<p>
	 *
	 */
	public void rcpt_iv_no(String value) {
		setConstString(offset + 8, $rcpt_iv_no, value);
	}

	/**
	 * 案件ＮＯ. Sales project No..<p>
	 *
	 */
	public String wrk_no() {
		return getConstString(offset + 9, $wrk_no);
	}

	/**
	 * 案件ＮＯ. Sales project No..<p>
	 *
	 */
	public void wrk_no(String value) {
		setConstString(offset + 9, $wrk_no, value);
	}

	/**
	 * 支払予定管理先ＣＤ. Scheduled payee cd..<p>
	 *
	 */
	public String bsppl_cd() {
		return getConstString(offset + 10, $bsppl_cd);
	}

	/**
	 * 支払予定管理先ＣＤ. Scheduled payee cd..<p>
	 *
	 */
	public void bsppl_cd(String value) {
		setConstString(offset + 10, $bsppl_cd, value);
	}

	/**
	 * 支払予定管理先担当部門ＣＤ. Cd. of dept. in charge of scheduled payee.<p>
	 *
	 */
	public String bsppl_dpt_cd() {
		return getConstString(offset + 11, $bsppl_dpt_cd);
	}

	/**
	 * 支払予定管理先担当部門ＣＤ. Cd. of dept. in charge of scheduled payee.<p>
	 *
	 */
	public void bsppl_dpt_cd(String value) {
		setConstString(offset + 11, $bsppl_dpt_cd, value);
	}

	/**
	 * 支払照合為替レート. Payment collation exchange rate.<p>
	 *
	 */
	public MCNumber pay_xrate() {
		return getConstNumber(offset + 12, $pay_xrate);
	}

	/**
	 * 支払照合為替レート. Payment collation exchange rate.<p>
	 *
	 */
	public void pay_xrate(MCNumber value) {
		setConstNumber(offset + 12, $pay_xrate, value);
	}
	
	/**
	 * 支払照合為替レート. Payment collation exchange rate.<p>
	 *
	 */
	public void pay_xrate(int value) {
		setConstNumber(offset + 12, $pay_xrate, value);
	}
	
	/**
	 * 支払照合為替レート. Payment collation exchange rate.<p>
	 *
	 */
	public void pay_xrate(long value) {
		setConstNumber(offset + 12, $pay_xrate, value);
	}
	
	/**
	 * 支払照合為替レート. Payment collation exchange rate.<p>
	 *
	 */
	public void pay_xrate(float value) {
		setConstNumber(offset + 12, $pay_xrate, value);
	}
	
	/**
	 * 支払照合為替レート. Payment collation exchange rate.<p>
	 *
	 */
	public void pay_xrate(double value) {
		setConstNumber(offset + 12, $pay_xrate, value);
	}
	
	/**
	 * 取引通貨ＣＤ. Transaction currency cd..<p>
	 *
	 */
	public String trd_cur_cd() {
		return getConstString(offset + 13, $trd_cur_cd);
	}

	/**
	 * 取引通貨ＣＤ. Transaction currency cd..<p>
	 *
	 */
	public void trd_cur_cd(String value) {
		setConstString(offset + 13, $trd_cur_cd, value);
	}

	/**
	 * 前回支払予定額. Last payment schedule amount.<p>
	 *
	 */
	public MCNumber last_pay_schd_amt() {
		return getConstNumber(offset + 14, $last_pay_schd_amt);
	}

	/**
	 * 前回支払予定額. Last payment schedule amount.<p>
	 *
	 */
	public void last_pay_schd_amt(MCNumber value) {
		setConstNumber(offset + 14, $last_pay_schd_amt, value);
	}
	
	/**
	 * 前回支払予定額. Last payment schedule amount.<p>
	 *
	 */
	public void last_pay_schd_amt(int value) {
		setConstNumber(offset + 14, $last_pay_schd_amt, value);
	}
	
	/**
	 * 前回支払予定額. Last payment schedule amount.<p>
	 *
	 */
	public void last_pay_schd_amt(long value) {
		setConstNumber(offset + 14, $last_pay_schd_amt, value);
	}
	
	/**
	 * 前回支払予定額. Last payment schedule amount.<p>
	 *
	 */
	public void last_pay_schd_amt(float value) {
		setConstNumber(offset + 14, $last_pay_schd_amt, value);
	}
	
	/**
	 * 前回支払予定額. Last payment schedule amount.<p>
	 *
	 */
	public void last_pay_schd_amt(double value) {
		setConstNumber(offset + 14, $last_pay_schd_amt, value);
	}
	
	/**
	 * 今回支払額. Current payment amount.<p>
	 *
	 */
	public MCNumber pay_amt() {
		return getConstNumber(offset + 15, $pay_amt);
	}

	/**
	 * 今回支払額. Current payment amount.<p>
	 *
	 */
	public void pay_amt(MCNumber value) {
		setConstNumber(offset + 15, $pay_amt, value);
	}
	
	/**
	 * 今回支払額. Current payment amount.<p>
	 *
	 */
	public void pay_amt(int value) {
		setConstNumber(offset + 15, $pay_amt, value);
	}
	
	/**
	 * 今回支払額. Current payment amount.<p>
	 *
	 */
	public void pay_amt(long value) {
		setConstNumber(offset + 15, $pay_amt, value);
	}
	
	/**
	 * 今回支払額. Current payment amount.<p>
	 *
	 */
	public void pay_amt(float value) {
		setConstNumber(offset + 15, $pay_amt, value);
	}
	
	/**
	 * 今回支払額. Current payment amount.<p>
	 *
	 */
	public void pay_amt(double value) {
		setConstNumber(offset + 15, $pay_amt, value);
	}
	
	/**
	 * 今回振替額. Current transfer amount.<p>
	 *
	 */
	public MCNumber sw_amt() {
		return getConstNumber(offset + 16, $sw_amt);
	}

	/**
	 * 今回振替額. Current transfer amount.<p>
	 *
	 */
	public void sw_amt(MCNumber value) {
		setConstNumber(offset + 16, $sw_amt, value);
	}
	
	/**
	 * 今回振替額. Current transfer amount.<p>
	 *
	 */
	public void sw_amt(int value) {
		setConstNumber(offset + 16, $sw_amt, value);
	}
	
	/**
	 * 今回振替額. Current transfer amount.<p>
	 *
	 */
	public void sw_amt(long value) {
		setConstNumber(offset + 16, $sw_amt, value);
	}
	
	/**
	 * 今回振替額. Current transfer amount.<p>
	 *
	 */
	public void sw_amt(float value) {
		setConstNumber(offset + 16, $sw_amt, value);
	}
	
	/**
	 * 今回振替額. Current transfer amount.<p>
	 *
	 */
	public void sw_amt(double value) {
		setConstNumber(offset + 16, $sw_amt, value);
	}
	
	/**
	 * 今回繰越額. Current carry-over amount.<p>
	 *
	 */
	public MCNumber bfw_amt() {
		return getConstNumber(offset + 17, $bfw_amt);
	}

	/**
	 * 今回繰越額. Current carry-over amount.<p>
	 *
	 */
	public void bfw_amt(MCNumber value) {
		setConstNumber(offset + 17, $bfw_amt, value);
	}
	
	/**
	 * 今回繰越額. Current carry-over amount.<p>
	 *
	 */
	public void bfw_amt(int value) {
		setConstNumber(offset + 17, $bfw_amt, value);
	}
	
	/**
	 * 今回繰越額. Current carry-over amount.<p>
	 *
	 */
	public void bfw_amt(long value) {
		setConstNumber(offset + 17, $bfw_amt, value);
	}
	
	/**
	 * 今回繰越額. Current carry-over amount.<p>
	 *
	 */
	public void bfw_amt(float value) {
		setConstNumber(offset + 17, $bfw_amt, value);
	}
	
	/**
	 * 今回繰越額. Current carry-over amount.<p>
	 *
	 */
	public void bfw_amt(double value) {
		setConstNumber(offset + 17, $bfw_amt, value);
	}
	
	/**
	 * 今回仕入額. Current purchase amount.<p>
	 *
	 */
	public MCNumber purc_amt() {
		return getConstNumber(offset + 18, $purc_amt);
	}

	/**
	 * 今回仕入額. Current purchase amount.<p>
	 *
	 */
	public void purc_amt(MCNumber value) {
		setConstNumber(offset + 18, $purc_amt, value);
	}
	
	/**
	 * 今回仕入額. Current purchase amount.<p>
	 *
	 */
	public void purc_amt(int value) {
		setConstNumber(offset + 18, $purc_amt, value);
	}
	
	/**
	 * 今回仕入額. Current purchase amount.<p>
	 *
	 */
	public void purc_amt(long value) {
		setConstNumber(offset + 18, $purc_amt, value);
	}
	
	/**
	 * 今回仕入額. Current purchase amount.<p>
	 *
	 */
	public void purc_amt(float value) {
		setConstNumber(offset + 18, $purc_amt, value);
	}
	
	/**
	 * 今回仕入額. Current purchase amount.<p>
	 *
	 */
	public void purc_amt(double value) {
		setConstNumber(offset + 18, $purc_amt, value);
	}
	
	/**
	 * 今回値引額. Current discount amount.<p>
	 *
	 */
	public MCNumber purc_dscnt_amt() {
		return getConstNumber(offset + 19, $purc_dscnt_amt);
	}

	/**
	 * 今回値引額. Current discount amount.<p>
	 *
	 */
	public void purc_dscnt_amt(MCNumber value) {
		setConstNumber(offset + 19, $purc_dscnt_amt, value);
	}
	
	/**
	 * 今回値引額. Current discount amount.<p>
	 *
	 */
	public void purc_dscnt_amt(int value) {
		setConstNumber(offset + 19, $purc_dscnt_amt, value);
	}
	
	/**
	 * 今回値引額. Current discount amount.<p>
	 *
	 */
	public void purc_dscnt_amt(long value) {
		setConstNumber(offset + 19, $purc_dscnt_amt, value);
	}
	
	/**
	 * 今回値引額. Current discount amount.<p>
	 *
	 */
	public void purc_dscnt_amt(float value) {
		setConstNumber(offset + 19, $purc_dscnt_amt, value);
	}
	
	/**
	 * 今回値引額. Current discount amount.<p>
	 *
	 */
	public void purc_dscnt_amt(double value) {
		setConstNumber(offset + 19, $purc_dscnt_amt, value);
	}
	
	/**
	 * 今回返品額. Current return amount.<p>
	 *
	 */
	public MCNumber purc_ret_amt() {
		return getConstNumber(offset + 20, $purc_ret_amt);
	}

	/**
	 * 今回返品額. Current return amount.<p>
	 *
	 */
	public void purc_ret_amt(MCNumber value) {
		setConstNumber(offset + 20, $purc_ret_amt, value);
	}
	
	/**
	 * 今回返品額. Current return amount.<p>
	 *
	 */
	public void purc_ret_amt(int value) {
		setConstNumber(offset + 20, $purc_ret_amt, value);
	}
	
	/**
	 * 今回返品額. Current return amount.<p>
	 *
	 */
	public void purc_ret_amt(long value) {
		setConstNumber(offset + 20, $purc_ret_amt, value);
	}
	
	/**
	 * 今回返品額. Current return amount.<p>
	 *
	 */
	public void purc_ret_amt(float value) {
		setConstNumber(offset + 20, $purc_ret_amt, value);
	}
	
	/**
	 * 今回返品額. Current return amount.<p>
	 *
	 */
	public void purc_ret_amt(double value) {
		setConstNumber(offset + 20, $purc_ret_amt, value);
	}
	
	/**
	 * 今回相殺額. Current offset amount.<p>
	 *
	 */
	public MCNumber setoff_amt() {
		return getConstNumber(offset + 21, $setoff_amt);
	}

	/**
	 * 今回相殺額. Current offset amount.<p>
	 *
	 */
	public void setoff_amt(MCNumber value) {
		setConstNumber(offset + 21, $setoff_amt, value);
	}
	
	/**
	 * 今回相殺額. Current offset amount.<p>
	 *
	 */
	public void setoff_amt(int value) {
		setConstNumber(offset + 21, $setoff_amt, value);
	}
	
	/**
	 * 今回相殺額. Current offset amount.<p>
	 *
	 */
	public void setoff_amt(long value) {
		setConstNumber(offset + 21, $setoff_amt, value);
	}
	
	/**
	 * 今回相殺額. Current offset amount.<p>
	 *
	 */
	public void setoff_amt(float value) {
		setConstNumber(offset + 21, $setoff_amt, value);
	}
	
	/**
	 * 今回相殺額. Current offset amount.<p>
	 *
	 */
	public void setoff_amt(double value) {
		setConstNumber(offset + 21, $setoff_amt, value);
	}
	
	/**
	 * 今回税額. Current tax amount.<p>
	 *
	 */
	public MCNumber tax_amt() {
		return getConstNumber(offset + 22, $tax_amt);
	}

	/**
	 * 今回税額. Current tax amount.<p>
	 *
	 */
	public void tax_amt(MCNumber value) {
		setConstNumber(offset + 22, $tax_amt, value);
	}
	
	/**
	 * 今回税額. Current tax amount.<p>
	 *
	 */
	public void tax_amt(int value) {
		setConstNumber(offset + 22, $tax_amt, value);
	}
	
	/**
	 * 今回税額. Current tax amount.<p>
	 *
	 */
	public void tax_amt(long value) {
		setConstNumber(offset + 22, $tax_amt, value);
	}
	
	/**
	 * 今回税額. Current tax amount.<p>
	 *
	 */
	public void tax_amt(float value) {
		setConstNumber(offset + 22, $tax_amt, value);
	}
	
	/**
	 * 今回税額. Current tax amount.<p>
	 *
	 */
	public void tax_amt(double value) {
		setConstNumber(offset + 22, $tax_amt, value);
	}
	
	/**
	 * 今回振替額（振替先）. Current transfer amount (Transfer destination).<p>
	 *
	 */
	public MCNumber sw_to_amt() {
		return getConstNumber(offset + 23, $sw_to_amt);
	}

	/**
	 * 今回振替額（振替先）. Current transfer amount (Transfer destination).<p>
	 *
	 */
	public void sw_to_amt(MCNumber value) {
		setConstNumber(offset + 23, $sw_to_amt, value);
	}
	
	/**
	 * 今回振替額（振替先）. Current transfer amount (Transfer destination).<p>
	 *
	 */
	public void sw_to_amt(int value) {
		setConstNumber(offset + 23, $sw_to_amt, value);
	}
	
	/**
	 * 今回振替額（振替先）. Current transfer amount (Transfer destination).<p>
	 *
	 */
	public void sw_to_amt(long value) {
		setConstNumber(offset + 23, $sw_to_amt, value);
	}
	
	/**
	 * 今回振替額（振替先）. Current transfer amount (Transfer destination).<p>
	 *
	 */
	public void sw_to_amt(float value) {
		setConstNumber(offset + 23, $sw_to_amt, value);
	}
	
	/**
	 * 今回振替額（振替先）. Current transfer amount (Transfer destination).<p>
	 *
	 */
	public void sw_to_amt(double value) {
		setConstNumber(offset + 23, $sw_to_amt, value);
	}
	
	/**
	 * 今回支払予定額. Current scheduled payment amount.<p>
	 *
	 */
	public MCNumber schd_pay_amt() {
		return getConstNumber(offset + 24, $schd_pay_amt);
	}

	/**
	 * 今回支払予定額. Current scheduled payment amount.<p>
	 *
	 */
	public void schd_pay_amt(MCNumber value) {
		setConstNumber(offset + 24, $schd_pay_amt, value);
	}
	
	/**
	 * 今回支払予定額. Current scheduled payment amount.<p>
	 *
	 */
	public void schd_pay_amt(int value) {
		setConstNumber(offset + 24, $schd_pay_amt, value);
	}
	
	/**
	 * 今回支払予定額. Current scheduled payment amount.<p>
	 *
	 */
	public void schd_pay_amt(long value) {
		setConstNumber(offset + 24, $schd_pay_amt, value);
	}
	
	/**
	 * 今回支払予定額. Current scheduled payment amount.<p>
	 *
	 */
	public void schd_pay_amt(float value) {
		setConstNumber(offset + 24, $schd_pay_amt, value);
	}
	
	/**
	 * 今回支払予定額. Current scheduled payment amount.<p>
	 *
	 */
	public void schd_pay_amt(double value) {
		setConstNumber(offset + 24, $schd_pay_amt, value);
	}
	
	/**
	 * 前渡金残高. Advance payment balance.<p>
	 *
	 */
	public MCNumber adv_pay_bal() {
		return getConstNumber(offset + 25, $adv_pay_bal);
	}

	/**
	 * 前渡金残高. Advance payment balance.<p>
	 *
	 */
	public void adv_pay_bal(MCNumber value) {
		setConstNumber(offset + 25, $adv_pay_bal, value);
	}
	
	/**
	 * 前渡金残高. Advance payment balance.<p>
	 *
	 */
	public void adv_pay_bal(int value) {
		setConstNumber(offset + 25, $adv_pay_bal, value);
	}
	
	/**
	 * 前渡金残高. Advance payment balance.<p>
	 *
	 */
	public void adv_pay_bal(long value) {
		setConstNumber(offset + 25, $adv_pay_bal, value);
	}
	
	/**
	 * 前渡金残高. Advance payment balance.<p>
	 *
	 */
	public void adv_pay_bal(float value) {
		setConstNumber(offset + 25, $adv_pay_bal, value);
	}
	
	/**
	 * 前渡金残高. Advance payment balance.<p>
	 *
	 */
	public void adv_pay_bal(double value) {
		setConstNumber(offset + 25, $adv_pay_bal, value);
	}
	
	/**
	 * 前渡金支払額. Advance payment amount.<p>
	 *
	 */
	public MCNumber adv_pay_amt() {
		return getConstNumber(offset + 26, $adv_pay_amt);
	}

	/**
	 * 前渡金支払額. Advance payment amount.<p>
	 *
	 */
	public void adv_pay_amt(MCNumber value) {
		setConstNumber(offset + 26, $adv_pay_amt, value);
	}
	
	/**
	 * 前渡金支払額. Advance payment amount.<p>
	 *
	 */
	public void adv_pay_amt(int value) {
		setConstNumber(offset + 26, $adv_pay_amt, value);
	}
	
	/**
	 * 前渡金支払額. Advance payment amount.<p>
	 *
	 */
	public void adv_pay_amt(long value) {
		setConstNumber(offset + 26, $adv_pay_amt, value);
	}
	
	/**
	 * 前渡金支払額. Advance payment amount.<p>
	 *
	 */
	public void adv_pay_amt(float value) {
		setConstNumber(offset + 26, $adv_pay_amt, value);
	}
	
	/**
	 * 前渡金支払額. Advance payment amount.<p>
	 *
	 */
	public void adv_pay_amt(double value) {
		setConstNumber(offset + 26, $adv_pay_amt, value);
	}
	
	/**
	 * 前渡金相殺額. Advance payment offset amount.<p>
	 *
	 */
	public MCNumber adv_pay_setoff_amt() {
		return getConstNumber(offset + 27, $adv_pay_setoff_amt);
	}

	/**
	 * 前渡金相殺額. Advance payment offset amount.<p>
	 *
	 */
	public void adv_pay_setoff_amt(MCNumber value) {
		setConstNumber(offset + 27, $adv_pay_setoff_amt, value);
	}
	
	/**
	 * 前渡金相殺額. Advance payment offset amount.<p>
	 *
	 */
	public void adv_pay_setoff_amt(int value) {
		setConstNumber(offset + 27, $adv_pay_setoff_amt, value);
	}
	
	/**
	 * 前渡金相殺額. Advance payment offset amount.<p>
	 *
	 */
	public void adv_pay_setoff_amt(long value) {
		setConstNumber(offset + 27, $adv_pay_setoff_amt, value);
	}
	
	/**
	 * 前渡金相殺額. Advance payment offset amount.<p>
	 *
	 */
	public void adv_pay_setoff_amt(float value) {
		setConstNumber(offset + 27, $adv_pay_setoff_amt, value);
	}
	
	/**
	 * 前渡金相殺額. Advance payment offset amount.<p>
	 *
	 */
	public void adv_pay_setoff_amt(double value) {
		setConstNumber(offset + 27, $adv_pay_setoff_amt, value);
	}
	
	/**
	 * 前渡金相殺税額. Advance payment offset tax amount.<p>
	 *
	 */
	public MCNumber adv_pay_setoff_tax_amt() {
		return getConstNumber(offset + 28, $adv_pay_setoff_tax_amt);
	}

	/**
	 * 前渡金相殺税額. Advance payment offset tax amount.<p>
	 *
	 */
	public void adv_pay_setoff_tax_amt(MCNumber value) {
		setConstNumber(offset + 28, $adv_pay_setoff_tax_amt, value);
	}
	
	/**
	 * 前渡金相殺税額. Advance payment offset tax amount.<p>
	 *
	 */
	public void adv_pay_setoff_tax_amt(int value) {
		setConstNumber(offset + 28, $adv_pay_setoff_tax_amt, value);
	}
	
	/**
	 * 前渡金相殺税額. Advance payment offset tax amount.<p>
	 *
	 */
	public void adv_pay_setoff_tax_amt(long value) {
		setConstNumber(offset + 28, $adv_pay_setoff_tax_amt, value);
	}
	
	/**
	 * 前渡金相殺税額. Advance payment offset tax amount.<p>
	 *
	 */
	public void adv_pay_setoff_tax_amt(float value) {
		setConstNumber(offset + 28, $adv_pay_setoff_tax_amt, value);
	}
	
	/**
	 * 前渡金相殺税額. Advance payment offset tax amount.<p>
	 *
	 */
	public void adv_pay_setoff_tax_amt(double value) {
		setConstNumber(offset + 28, $adv_pay_setoff_tax_amt, value);
	}
	
	/**
	 * 予備１. Spare 1.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 29, $sub_char1);
	}

	/**
	 * 予備１. Spare 1.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 29, $sub_char1, value);
	}

	/**
	 * 予備２. Spare 2.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 30, $sub_char2);
	}

	/**
	 * 予備２. Spare 2.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 30, $sub_char2, value);
	}

	/**
	 * 予備３. Spare 3.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 31, $sub_char3);
	}

	/**
	 * 予備３. Spare 3.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 31, $sub_char3, value);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 32, $ins_usr_id);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 32, $ins_usr_id, value);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 33, $ins_usr_nm);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 33, $ins_usr_nm, value);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 34, $ins_ts);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 34, $ins_ts, value);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 35, $ins_func_id);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 35, $ins_func_id, value);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 36, $upd_cntr);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 36, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 36, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 36, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 36, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 36, $upd_cntr, value);
	}
	
	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 37, $upd_usr_id);
	}

	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 37, $upd_usr_id, value);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 38, $upd_usr_nm);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 38, $upd_usr_nm, value);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 39, $upd_ts);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 39, $upd_ts, value);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 40, $upd_func_id);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 40, $upd_func_id, value);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 41, $upd_srv_req_no);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 41, $upd_srv_req_no, value);
	}

	public String getString(String name) {
		if ($pay_ntc_his_no.equalsIgnoreCase(name)) {
			return pay_ntc_his_no();
		}
		if ($pay_chk_no.equalsIgnoreCase(name)) {
			return pay_chk_no();
		}
		if ($rcpt_iv_no.equalsIgnoreCase(name)) {
			return rcpt_iv_no();
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			return wrk_no();
		}
		if ($bsppl_cd.equalsIgnoreCase(name)) {
			return bsppl_cd();
		}
		if ($bsppl_dpt_cd.equalsIgnoreCase(name)) {
			return bsppl_dpt_cd();
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
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
		if ($pay_ntc_rev.equalsIgnoreCase(name)) {
			return pay_ntc_rev();
		}
		if ($pay_xrate.equalsIgnoreCase(name)) {
			return pay_xrate();
		}
		if ($last_pay_schd_amt.equalsIgnoreCase(name)) {
			return last_pay_schd_amt();
		}
		if ($pay_amt.equalsIgnoreCase(name)) {
			return pay_amt();
		}
		if ($sw_amt.equalsIgnoreCase(name)) {
			return sw_amt();
		}
		if ($bfw_amt.equalsIgnoreCase(name)) {
			return bfw_amt();
		}
		if ($purc_amt.equalsIgnoreCase(name)) {
			return purc_amt();
		}
		if ($purc_dscnt_amt.equalsIgnoreCase(name)) {
			return purc_dscnt_amt();
		}
		if ($purc_ret_amt.equalsIgnoreCase(name)) {
			return purc_ret_amt();
		}
		if ($setoff_amt.equalsIgnoreCase(name)) {
			return setoff_amt();
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			return tax_amt();
		}
		if ($sw_to_amt.equalsIgnoreCase(name)) {
			return sw_to_amt();
		}
		if ($schd_pay_amt.equalsIgnoreCase(name)) {
			return schd_pay_amt();
		}
		if ($adv_pay_bal.equalsIgnoreCase(name)) {
			return adv_pay_bal();
		}
		if ($adv_pay_amt.equalsIgnoreCase(name)) {
			return adv_pay_amt();
		}
		if ($adv_pay_setoff_amt.equalsIgnoreCase(name)) {
			return adv_pay_setoff_amt();
		}
		if ($adv_pay_setoff_tax_amt.equalsIgnoreCase(name)) {
			return adv_pay_setoff_tax_amt();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumber(name);
	}

	public MCDate getDate(String name) {
		if ($bsppl_cl_dt.equalsIgnoreCase(name)) {
			return bsppl_cl_dt();
		}
		if ($reg_dt.equalsIgnoreCase(name)) {
			return reg_dt();
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
		if ($latest_flg.equalsIgnoreCase(name)) {
			return latest_flg();
		}
		if ($can_flg.equalsIgnoreCase(name)) {
			return can_flg();
		}
		if ($pay_spot_flg.equalsIgnoreCase(name)) {
			return pay_spot_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($pay_ntc_his_no.equalsIgnoreCase(name)) {
			return pay_ntc_his_no();
		}
		if ($pay_chk_no.equalsIgnoreCase(name)) {
			return pay_chk_no();
		}
		if ($rcpt_iv_no.equalsIgnoreCase(name)) {
			return rcpt_iv_no();
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			return wrk_no();
		}
		if ($bsppl_cd.equalsIgnoreCase(name)) {
			return bsppl_cd();
		}
		if ($bsppl_dpt_cd.equalsIgnoreCase(name)) {
			return bsppl_dpt_cd();
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
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
		if ($pay_ntc_rev.equalsIgnoreCase(name)) {
			return pay_ntc_rev();
		}
		if ($pay_xrate.equalsIgnoreCase(name)) {
			return pay_xrate();
		}
		if ($last_pay_schd_amt.equalsIgnoreCase(name)) {
			return last_pay_schd_amt();
		}
		if ($pay_amt.equalsIgnoreCase(name)) {
			return pay_amt();
		}
		if ($sw_amt.equalsIgnoreCase(name)) {
			return sw_amt();
		}
		if ($bfw_amt.equalsIgnoreCase(name)) {
			return bfw_amt();
		}
		if ($purc_amt.equalsIgnoreCase(name)) {
			return purc_amt();
		}
		if ($purc_dscnt_amt.equalsIgnoreCase(name)) {
			return purc_dscnt_amt();
		}
		if ($purc_ret_amt.equalsIgnoreCase(name)) {
			return purc_ret_amt();
		}
		if ($setoff_amt.equalsIgnoreCase(name)) {
			return setoff_amt();
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			return tax_amt();
		}
		if ($sw_to_amt.equalsIgnoreCase(name)) {
			return sw_to_amt();
		}
		if ($schd_pay_amt.equalsIgnoreCase(name)) {
			return schd_pay_amt();
		}
		if ($adv_pay_bal.equalsIgnoreCase(name)) {
			return adv_pay_bal();
		}
		if ($adv_pay_amt.equalsIgnoreCase(name)) {
			return adv_pay_amt();
		}
		if ($adv_pay_setoff_amt.equalsIgnoreCase(name)) {
			return adv_pay_setoff_amt();
		}
		if ($adv_pay_setoff_tax_amt.equalsIgnoreCase(name)) {
			return adv_pay_setoff_tax_amt();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumberNE(name);
	}

	public MCDate getDateNE(String name) {
		if ($bsppl_cl_dt.equalsIgnoreCase(name)) {
			return bsppl_cl_dt();
		}
		if ($reg_dt.equalsIgnoreCase(name)) {
			return reg_dt();
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
		if ($latest_flg.equalsIgnoreCase(name)) {
			return latest_flg();
		}
		if ($can_flg.equalsIgnoreCase(name)) {
			return can_flg();
		}
		if ($pay_spot_flg.equalsIgnoreCase(name)) {
			return pay_spot_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($pay_ntc_his_no.equalsIgnoreCase(name)) {
			pay_ntc_his_no(value);
			return;
		}
		if ($pay_chk_no.equalsIgnoreCase(name)) {
			pay_chk_no(value);
			return;
		}
		if ($rcpt_iv_no.equalsIgnoreCase(name)) {
			rcpt_iv_no(value);
			return;
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			wrk_no(value);
			return;
		}
		if ($bsppl_cd.equalsIgnoreCase(name)) {
			bsppl_cd(value);
			return;
		}
		if ($bsppl_dpt_cd.equalsIgnoreCase(name)) {
			bsppl_dpt_cd(value);
			return;
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			trd_cur_cd(value);
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
		if ($pay_ntc_rev.equalsIgnoreCase(name)) {
			pay_ntc_rev(value);
			return;
		}
		if ($pay_xrate.equalsIgnoreCase(name)) {
			pay_xrate(value);
			return;
		}
		if ($last_pay_schd_amt.equalsIgnoreCase(name)) {
			last_pay_schd_amt(value);
			return;
		}
		if ($pay_amt.equalsIgnoreCase(name)) {
			pay_amt(value);
			return;
		}
		if ($sw_amt.equalsIgnoreCase(name)) {
			sw_amt(value);
			return;
		}
		if ($bfw_amt.equalsIgnoreCase(name)) {
			bfw_amt(value);
			return;
		}
		if ($purc_amt.equalsIgnoreCase(name)) {
			purc_amt(value);
			return;
		}
		if ($purc_dscnt_amt.equalsIgnoreCase(name)) {
			purc_dscnt_amt(value);
			return;
		}
		if ($purc_ret_amt.equalsIgnoreCase(name)) {
			purc_ret_amt(value);
			return;
		}
		if ($setoff_amt.equalsIgnoreCase(name)) {
			setoff_amt(value);
			return;
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			tax_amt(value);
			return;
		}
		if ($sw_to_amt.equalsIgnoreCase(name)) {
			sw_to_amt(value);
			return;
		}
		if ($schd_pay_amt.equalsIgnoreCase(name)) {
			schd_pay_amt(value);
			return;
		}
		if ($adv_pay_bal.equalsIgnoreCase(name)) {
			adv_pay_bal(value);
			return;
		}
		if ($adv_pay_amt.equalsIgnoreCase(name)) {
			adv_pay_amt(value);
			return;
		}
		if ($adv_pay_setoff_amt.equalsIgnoreCase(name)) {
			adv_pay_setoff_amt(value);
			return;
		}
		if ($adv_pay_setoff_tax_amt.equalsIgnoreCase(name)) {
			adv_pay_setoff_tax_amt(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, int value) {
		if ($pay_ntc_rev.equalsIgnoreCase(name)) {
			pay_ntc_rev(value);
			return;
		}
		if ($pay_xrate.equalsIgnoreCase(name)) {
			pay_xrate(value);
			return;
		}
		if ($last_pay_schd_amt.equalsIgnoreCase(name)) {
			last_pay_schd_amt(value);
			return;
		}
		if ($pay_amt.equalsIgnoreCase(name)) {
			pay_amt(value);
			return;
		}
		if ($sw_amt.equalsIgnoreCase(name)) {
			sw_amt(value);
			return;
		}
		if ($bfw_amt.equalsIgnoreCase(name)) {
			bfw_amt(value);
			return;
		}
		if ($purc_amt.equalsIgnoreCase(name)) {
			purc_amt(value);
			return;
		}
		if ($purc_dscnt_amt.equalsIgnoreCase(name)) {
			purc_dscnt_amt(value);
			return;
		}
		if ($purc_ret_amt.equalsIgnoreCase(name)) {
			purc_ret_amt(value);
			return;
		}
		if ($setoff_amt.equalsIgnoreCase(name)) {
			setoff_amt(value);
			return;
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			tax_amt(value);
			return;
		}
		if ($sw_to_amt.equalsIgnoreCase(name)) {
			sw_to_amt(value);
			return;
		}
		if ($schd_pay_amt.equalsIgnoreCase(name)) {
			schd_pay_amt(value);
			return;
		}
		if ($adv_pay_bal.equalsIgnoreCase(name)) {
			adv_pay_bal(value);
			return;
		}
		if ($adv_pay_amt.equalsIgnoreCase(name)) {
			adv_pay_amt(value);
			return;
		}
		if ($adv_pay_setoff_amt.equalsIgnoreCase(name)) {
			adv_pay_setoff_amt(value);
			return;
		}
		if ($adv_pay_setoff_tax_amt.equalsIgnoreCase(name)) {
			adv_pay_setoff_tax_amt(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, long value) {
		if ($pay_ntc_rev.equalsIgnoreCase(name)) {
			pay_ntc_rev(value);
			return;
		}
		if ($pay_xrate.equalsIgnoreCase(name)) {
			pay_xrate(value);
			return;
		}
		if ($last_pay_schd_amt.equalsIgnoreCase(name)) {
			last_pay_schd_amt(value);
			return;
		}
		if ($pay_amt.equalsIgnoreCase(name)) {
			pay_amt(value);
			return;
		}
		if ($sw_amt.equalsIgnoreCase(name)) {
			sw_amt(value);
			return;
		}
		if ($bfw_amt.equalsIgnoreCase(name)) {
			bfw_amt(value);
			return;
		}
		if ($purc_amt.equalsIgnoreCase(name)) {
			purc_amt(value);
			return;
		}
		if ($purc_dscnt_amt.equalsIgnoreCase(name)) {
			purc_dscnt_amt(value);
			return;
		}
		if ($purc_ret_amt.equalsIgnoreCase(name)) {
			purc_ret_amt(value);
			return;
		}
		if ($setoff_amt.equalsIgnoreCase(name)) {
			setoff_amt(value);
			return;
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			tax_amt(value);
			return;
		}
		if ($sw_to_amt.equalsIgnoreCase(name)) {
			sw_to_amt(value);
			return;
		}
		if ($schd_pay_amt.equalsIgnoreCase(name)) {
			schd_pay_amt(value);
			return;
		}
		if ($adv_pay_bal.equalsIgnoreCase(name)) {
			adv_pay_bal(value);
			return;
		}
		if ($adv_pay_amt.equalsIgnoreCase(name)) {
			adv_pay_amt(value);
			return;
		}
		if ($adv_pay_setoff_amt.equalsIgnoreCase(name)) {
			adv_pay_setoff_amt(value);
			return;
		}
		if ($adv_pay_setoff_tax_amt.equalsIgnoreCase(name)) {
			adv_pay_setoff_tax_amt(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, float value) {
		if ($pay_ntc_rev.equalsIgnoreCase(name)) {
			pay_ntc_rev(value);
			return;
		}
		if ($pay_xrate.equalsIgnoreCase(name)) {
			pay_xrate(value);
			return;
		}
		if ($last_pay_schd_amt.equalsIgnoreCase(name)) {
			last_pay_schd_amt(value);
			return;
		}
		if ($pay_amt.equalsIgnoreCase(name)) {
			pay_amt(value);
			return;
		}
		if ($sw_amt.equalsIgnoreCase(name)) {
			sw_amt(value);
			return;
		}
		if ($bfw_amt.equalsIgnoreCase(name)) {
			bfw_amt(value);
			return;
		}
		if ($purc_amt.equalsIgnoreCase(name)) {
			purc_amt(value);
			return;
		}
		if ($purc_dscnt_amt.equalsIgnoreCase(name)) {
			purc_dscnt_amt(value);
			return;
		}
		if ($purc_ret_amt.equalsIgnoreCase(name)) {
			purc_ret_amt(value);
			return;
		}
		if ($setoff_amt.equalsIgnoreCase(name)) {
			setoff_amt(value);
			return;
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			tax_amt(value);
			return;
		}
		if ($sw_to_amt.equalsIgnoreCase(name)) {
			sw_to_amt(value);
			return;
		}
		if ($schd_pay_amt.equalsIgnoreCase(name)) {
			schd_pay_amt(value);
			return;
		}
		if ($adv_pay_bal.equalsIgnoreCase(name)) {
			adv_pay_bal(value);
			return;
		}
		if ($adv_pay_amt.equalsIgnoreCase(name)) {
			adv_pay_amt(value);
			return;
		}
		if ($adv_pay_setoff_amt.equalsIgnoreCase(name)) {
			adv_pay_setoff_amt(value);
			return;
		}
		if ($adv_pay_setoff_tax_amt.equalsIgnoreCase(name)) {
			adv_pay_setoff_tax_amt(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, double value) {
		if ($pay_ntc_rev.equalsIgnoreCase(name)) {
			pay_ntc_rev(value);
			return;
		}
		if ($pay_xrate.equalsIgnoreCase(name)) {
			pay_xrate(value);
			return;
		}
		if ($last_pay_schd_amt.equalsIgnoreCase(name)) {
			last_pay_schd_amt(value);
			return;
		}
		if ($pay_amt.equalsIgnoreCase(name)) {
			pay_amt(value);
			return;
		}
		if ($sw_amt.equalsIgnoreCase(name)) {
			sw_amt(value);
			return;
		}
		if ($bfw_amt.equalsIgnoreCase(name)) {
			bfw_amt(value);
			return;
		}
		if ($purc_amt.equalsIgnoreCase(name)) {
			purc_amt(value);
			return;
		}
		if ($purc_dscnt_amt.equalsIgnoreCase(name)) {
			purc_dscnt_amt(value);
			return;
		}
		if ($purc_ret_amt.equalsIgnoreCase(name)) {
			purc_ret_amt(value);
			return;
		}
		if ($setoff_amt.equalsIgnoreCase(name)) {
			setoff_amt(value);
			return;
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			tax_amt(value);
			return;
		}
		if ($sw_to_amt.equalsIgnoreCase(name)) {
			sw_to_amt(value);
			return;
		}
		if ($schd_pay_amt.equalsIgnoreCase(name)) {
			schd_pay_amt(value);
			return;
		}
		if ($adv_pay_bal.equalsIgnoreCase(name)) {
			adv_pay_bal(value);
			return;
		}
		if ($adv_pay_amt.equalsIgnoreCase(name)) {
			adv_pay_amt(value);
			return;
		}
		if ($adv_pay_setoff_amt.equalsIgnoreCase(name)) {
			adv_pay_setoff_amt(value);
			return;
		}
		if ($adv_pay_setoff_tax_amt.equalsIgnoreCase(name)) {
			adv_pay_setoff_tax_amt(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setDate(String name, MCDate value) {
		if ($bsppl_cl_dt.equalsIgnoreCase(name)) {
			bsppl_cl_dt(value);
			return;
		}
		if ($reg_dt.equalsIgnoreCase(name)) {
			reg_dt(value);
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
		if ($latest_flg.equalsIgnoreCase(name)) {
			latest_flg(value);
			return;
		}
		if ($can_flg.equalsIgnoreCase(name)) {
			can_flg(value);
			return;
		}
		if ($pay_spot_flg.equalsIgnoreCase(name)) {
			pay_spot_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($pay_ntc_his_no.equalsIgnoreCase(name)) {
			pay_ntc_his_no(value);
			return;
		}
		if ($pay_chk_no.equalsIgnoreCase(name)) {
			pay_chk_no(value);
			return;
		}
		if ($rcpt_iv_no.equalsIgnoreCase(name)) {
			rcpt_iv_no(value);
			return;
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			wrk_no(value);
			return;
		}
		if ($bsppl_cd.equalsIgnoreCase(name)) {
			bsppl_cd(value);
			return;
		}
		if ($bsppl_dpt_cd.equalsIgnoreCase(name)) {
			bsppl_dpt_cd(value);
			return;
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			trd_cur_cd(value);
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
		if ($pay_ntc_rev.equalsIgnoreCase(name)) {
			pay_ntc_rev(value);
			return;
		}
		if ($pay_xrate.equalsIgnoreCase(name)) {
			pay_xrate(value);
			return;
		}
		if ($last_pay_schd_amt.equalsIgnoreCase(name)) {
			last_pay_schd_amt(value);
			return;
		}
		if ($pay_amt.equalsIgnoreCase(name)) {
			pay_amt(value);
			return;
		}
		if ($sw_amt.equalsIgnoreCase(name)) {
			sw_amt(value);
			return;
		}
		if ($bfw_amt.equalsIgnoreCase(name)) {
			bfw_amt(value);
			return;
		}
		if ($purc_amt.equalsIgnoreCase(name)) {
			purc_amt(value);
			return;
		}
		if ($purc_dscnt_amt.equalsIgnoreCase(name)) {
			purc_dscnt_amt(value);
			return;
		}
		if ($purc_ret_amt.equalsIgnoreCase(name)) {
			purc_ret_amt(value);
			return;
		}
		if ($setoff_amt.equalsIgnoreCase(name)) {
			setoff_amt(value);
			return;
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			tax_amt(value);
			return;
		}
		if ($sw_to_amt.equalsIgnoreCase(name)) {
			sw_to_amt(value);
			return;
		}
		if ($schd_pay_amt.equalsIgnoreCase(name)) {
			schd_pay_amt(value);
			return;
		}
		if ($adv_pay_bal.equalsIgnoreCase(name)) {
			adv_pay_bal(value);
			return;
		}
		if ($adv_pay_amt.equalsIgnoreCase(name)) {
			adv_pay_amt(value);
			return;
		}
		if ($adv_pay_setoff_amt.equalsIgnoreCase(name)) {
			adv_pay_setoff_amt(value);
			return;
		}
		if ($adv_pay_setoff_tax_amt.equalsIgnoreCase(name)) {
			adv_pay_setoff_tax_amt(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, int value) {
		if ($pay_ntc_rev.equalsIgnoreCase(name)) {
			pay_ntc_rev(value);
			return;
		}
		if ($pay_xrate.equalsIgnoreCase(name)) {
			pay_xrate(value);
			return;
		}
		if ($last_pay_schd_amt.equalsIgnoreCase(name)) {
			last_pay_schd_amt(value);
			return;
		}
		if ($pay_amt.equalsIgnoreCase(name)) {
			pay_amt(value);
			return;
		}
		if ($sw_amt.equalsIgnoreCase(name)) {
			sw_amt(value);
			return;
		}
		if ($bfw_amt.equalsIgnoreCase(name)) {
			bfw_amt(value);
			return;
		}
		if ($purc_amt.equalsIgnoreCase(name)) {
			purc_amt(value);
			return;
		}
		if ($purc_dscnt_amt.equalsIgnoreCase(name)) {
			purc_dscnt_amt(value);
			return;
		}
		if ($purc_ret_amt.equalsIgnoreCase(name)) {
			purc_ret_amt(value);
			return;
		}
		if ($setoff_amt.equalsIgnoreCase(name)) {
			setoff_amt(value);
			return;
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			tax_amt(value);
			return;
		}
		if ($sw_to_amt.equalsIgnoreCase(name)) {
			sw_to_amt(value);
			return;
		}
		if ($schd_pay_amt.equalsIgnoreCase(name)) {
			schd_pay_amt(value);
			return;
		}
		if ($adv_pay_bal.equalsIgnoreCase(name)) {
			adv_pay_bal(value);
			return;
		}
		if ($adv_pay_amt.equalsIgnoreCase(name)) {
			adv_pay_amt(value);
			return;
		}
		if ($adv_pay_setoff_amt.equalsIgnoreCase(name)) {
			adv_pay_setoff_amt(value);
			return;
		}
		if ($adv_pay_setoff_tax_amt.equalsIgnoreCase(name)) {
			adv_pay_setoff_tax_amt(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, long value) {
		if ($pay_ntc_rev.equalsIgnoreCase(name)) {
			pay_ntc_rev(value);
			return;
		}
		if ($pay_xrate.equalsIgnoreCase(name)) {
			pay_xrate(value);
			return;
		}
		if ($last_pay_schd_amt.equalsIgnoreCase(name)) {
			last_pay_schd_amt(value);
			return;
		}
		if ($pay_amt.equalsIgnoreCase(name)) {
			pay_amt(value);
			return;
		}
		if ($sw_amt.equalsIgnoreCase(name)) {
			sw_amt(value);
			return;
		}
		if ($bfw_amt.equalsIgnoreCase(name)) {
			bfw_amt(value);
			return;
		}
		if ($purc_amt.equalsIgnoreCase(name)) {
			purc_amt(value);
			return;
		}
		if ($purc_dscnt_amt.equalsIgnoreCase(name)) {
			purc_dscnt_amt(value);
			return;
		}
		if ($purc_ret_amt.equalsIgnoreCase(name)) {
			purc_ret_amt(value);
			return;
		}
		if ($setoff_amt.equalsIgnoreCase(name)) {
			setoff_amt(value);
			return;
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			tax_amt(value);
			return;
		}
		if ($sw_to_amt.equalsIgnoreCase(name)) {
			sw_to_amt(value);
			return;
		}
		if ($schd_pay_amt.equalsIgnoreCase(name)) {
			schd_pay_amt(value);
			return;
		}
		if ($adv_pay_bal.equalsIgnoreCase(name)) {
			adv_pay_bal(value);
			return;
		}
		if ($adv_pay_amt.equalsIgnoreCase(name)) {
			adv_pay_amt(value);
			return;
		}
		if ($adv_pay_setoff_amt.equalsIgnoreCase(name)) {
			adv_pay_setoff_amt(value);
			return;
		}
		if ($adv_pay_setoff_tax_amt.equalsIgnoreCase(name)) {
			adv_pay_setoff_tax_amt(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, float value) {
		if ($pay_ntc_rev.equalsIgnoreCase(name)) {
			pay_ntc_rev(value);
			return;
		}
		if ($pay_xrate.equalsIgnoreCase(name)) {
			pay_xrate(value);
			return;
		}
		if ($last_pay_schd_amt.equalsIgnoreCase(name)) {
			last_pay_schd_amt(value);
			return;
		}
		if ($pay_amt.equalsIgnoreCase(name)) {
			pay_amt(value);
			return;
		}
		if ($sw_amt.equalsIgnoreCase(name)) {
			sw_amt(value);
			return;
		}
		if ($bfw_amt.equalsIgnoreCase(name)) {
			bfw_amt(value);
			return;
		}
		if ($purc_amt.equalsIgnoreCase(name)) {
			purc_amt(value);
			return;
		}
		if ($purc_dscnt_amt.equalsIgnoreCase(name)) {
			purc_dscnt_amt(value);
			return;
		}
		if ($purc_ret_amt.equalsIgnoreCase(name)) {
			purc_ret_amt(value);
			return;
		}
		if ($setoff_amt.equalsIgnoreCase(name)) {
			setoff_amt(value);
			return;
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			tax_amt(value);
			return;
		}
		if ($sw_to_amt.equalsIgnoreCase(name)) {
			sw_to_amt(value);
			return;
		}
		if ($schd_pay_amt.equalsIgnoreCase(name)) {
			schd_pay_amt(value);
			return;
		}
		if ($adv_pay_bal.equalsIgnoreCase(name)) {
			adv_pay_bal(value);
			return;
		}
		if ($adv_pay_amt.equalsIgnoreCase(name)) {
			adv_pay_amt(value);
			return;
		}
		if ($adv_pay_setoff_amt.equalsIgnoreCase(name)) {
			adv_pay_setoff_amt(value);
			return;
		}
		if ($adv_pay_setoff_tax_amt.equalsIgnoreCase(name)) {
			adv_pay_setoff_tax_amt(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, double value) {
		if ($pay_ntc_rev.equalsIgnoreCase(name)) {
			pay_ntc_rev(value);
			return;
		}
		if ($pay_xrate.equalsIgnoreCase(name)) {
			pay_xrate(value);
			return;
		}
		if ($last_pay_schd_amt.equalsIgnoreCase(name)) {
			last_pay_schd_amt(value);
			return;
		}
		if ($pay_amt.equalsIgnoreCase(name)) {
			pay_amt(value);
			return;
		}
		if ($sw_amt.equalsIgnoreCase(name)) {
			sw_amt(value);
			return;
		}
		if ($bfw_amt.equalsIgnoreCase(name)) {
			bfw_amt(value);
			return;
		}
		if ($purc_amt.equalsIgnoreCase(name)) {
			purc_amt(value);
			return;
		}
		if ($purc_dscnt_amt.equalsIgnoreCase(name)) {
			purc_dscnt_amt(value);
			return;
		}
		if ($purc_ret_amt.equalsIgnoreCase(name)) {
			purc_ret_amt(value);
			return;
		}
		if ($setoff_amt.equalsIgnoreCase(name)) {
			setoff_amt(value);
			return;
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			tax_amt(value);
			return;
		}
		if ($sw_to_amt.equalsIgnoreCase(name)) {
			sw_to_amt(value);
			return;
		}
		if ($schd_pay_amt.equalsIgnoreCase(name)) {
			schd_pay_amt(value);
			return;
		}
		if ($adv_pay_bal.equalsIgnoreCase(name)) {
			adv_pay_bal(value);
			return;
		}
		if ($adv_pay_amt.equalsIgnoreCase(name)) {
			adv_pay_amt(value);
			return;
		}
		if ($adv_pay_setoff_amt.equalsIgnoreCase(name)) {
			adv_pay_setoff_amt(value);
			return;
		}
		if ($adv_pay_setoff_tax_amt.equalsIgnoreCase(name)) {
			adv_pay_setoff_tax_amt(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setDateNE(String name, MCDate value) {
		if ($bsppl_cl_dt.equalsIgnoreCase(name)) {
			bsppl_cl_dt(value);
			return;
		}
		if ($reg_dt.equalsIgnoreCase(name)) {
			reg_dt(value);
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
		if ($latest_flg.equalsIgnoreCase(name)) {
			latest_flg(value);
			return;
		}
		if ($can_flg.equalsIgnoreCase(name)) {
			can_flg(value);
			return;
		}
		if ($pay_spot_flg.equalsIgnoreCase(name)) {
			pay_spot_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

}
