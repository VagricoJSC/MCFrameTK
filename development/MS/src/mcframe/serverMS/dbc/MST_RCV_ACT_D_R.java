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
 * "入金実績明細 // Payment received result details"DBコンテナRowクラスです。<p>
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
 *  	<td>rcv_act_d_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>入金実績明細ＮＯ</td>
 *  	<td>Payment received result details No.</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>rcv_act_d_seq</td>
 *  	<td>N</td>
 *  	<td>4,0</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>入金実績明細連番</td>
 *  	<td>Payment received result details sequence number</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>rcv_act_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>入金実績ＮＯ</td>
 *  	<td>Payment received result No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>rcv_act_seq</td>
 *  	<td>N</td>
 *  	<td>4,0</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>入金実績連番</td>
 *  	<td>Payment received result sequence number</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>disp_seq</td>
 *  	<td>N</td>
 *  	<td>5,0</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>表示順</td>
 *  	<td>Display order</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>bill_mng_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>請求管理ＮＯ</td>
 *  	<td>Billing management No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>bcst_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>請求先ＣＤ</td>
 *  	<td>Billing customer cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>bill_dpt_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>請求部門ＣＤ</td>
 *  	<td>Billing dept. cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>acst_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>売掛先ＣＤ</td>
 *  	<td>AR customer cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ar_dpt_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>債権部門ＣＤ</td>
 *  	<td>AR dept. cd.</td>
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
 *  	<td>iv_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>インボイスＮＯ</td>
 *  	<td>Invoice No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>wrk_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>案件ＮＯ</td>
 *  	<td>Sales project No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ar_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>債権区分</td>
 *  	<td>AR type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ar_sttl_cd1</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>債権決済方法ＣＤ１</td>
 *  	<td>AR settlement method cd. 1</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ar_sttl_typ1</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>債権決済区分１</td>
 *  	<td>AR settlement type 1</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>trd_cur_amt1</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>取引通貨金額１</td>
 *  	<td>Amount 1 (Transaction currency)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>trd_cur_tax_amt1</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>取引通貨内税額１</td>
 *  	<td>Tax inclusive amount 1 (Transaction currency)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>trd_cur_amt2</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>取引通貨金額２</td>
 *  	<td>Amount 2 (Transaction currency)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>trd_cur_tax_amt2</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>取引通貨内税額２</td>
 *  	<td>Tax inclusive amount 2 (Transaction currency)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>trd_cur_amt3</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>取引通貨金額３</td>
 *  	<td>Amount 3 (Transaction currency)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>trd_cur_tax_amt3</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>取引通貨内税額３</td>
 *  	<td>Tax inclusive amount 3 (Transaction currency)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>base_cur_amt1</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>基準通貨金額１</td>
 *  	<td>Amount 1 (Base currency)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>base_cur_tax_amt1</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>基準通貨内税額１</td>
 *  	<td>Tax inclusive amount 1 (Base currency)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>base_cur_amt2</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>基準通貨金額２</td>
 *  	<td>Amount 2 (Base currency)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>base_cur_tax_amt2</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>基準通貨内税額２</td>
 *  	<td>Tax inclusive amount 2 (Base currency)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>base_cur_amt3</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>基準通貨金額３</td>
 *  	<td>Amount 3 (Base currency)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>base_cur_tax_amt3</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>基準通貨内税額３</td>
 *  	<td>Tax inclusive amount 3 (Base currency)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>trd_xrate</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引時為替レート</td>
 *  	<td>Exchange rate at trading</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>gen_rcv_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>発生入金ＮＯ</td>
 *  	<td>Source incoming payment result No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>bill_d_rmrks</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>請求書明細備考</td>
 *  	<td>Invoice details remarks</td>
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
 *  	<td>appl_cmpl_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>消込完了ＦＬＧ</td>
 *  	<td>Reconciled flg.</td>
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
public class MST_RCV_ACT_D_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.CO_VIEW;

	public static final String TABLE_NAME = "MST_RCV_ACT_D";

	public static final boolean EX_CTRL = true;
	
	public static final boolean LCL_TABLE = false;
	
	/**
	 * 入金実績明細ＮＯ. Payment received result details No..<p>
	 *
	 */
	public static final String $rcv_act_d_no = "rcv_act_d_no";
	private static final MCPermColumnInfo _rcv_act_d_no = createColumnInfo("rcv_act_d_no");
	public final MCStringPermColumn rcv_act_d_no = createStringColumn(_rcv_act_d_no);
	
	/**
	 * 入金実績明細連番. Payment received result details sequence number.<p>
	 *
	 */
	public static final String $rcv_act_d_seq = "rcv_act_d_seq";
	private static final MCPermColumnInfo _rcv_act_d_seq = createColumnInfo("rcv_act_d_seq");
	public final MCNumberPermColumn rcv_act_d_seq = createNumberColumn(_rcv_act_d_seq);
	
	/**
	 * 入金実績ＮＯ. Payment received result No..<p>
	 *
	 */
	public static final String $rcv_act_no = "rcv_act_no";
	private static final MCPermColumnInfo _rcv_act_no = createColumnInfo("rcv_act_no");
	public final MCStringPermColumn rcv_act_no = createStringColumn(_rcv_act_no);
	
	/**
	 * 入金実績連番. Payment received result sequence number.<p>
	 *
	 */
	public static final String $rcv_act_seq = "rcv_act_seq";
	private static final MCPermColumnInfo _rcv_act_seq = createColumnInfo("rcv_act_seq");
	public final MCNumberPermColumn rcv_act_seq = createNumberColumn(_rcv_act_seq);
	
	/**
	 * 表示順. Display order.<p>
	 *
	 */
	public static final String $disp_seq = "disp_seq";
	private static final MCPermColumnInfo _disp_seq = createColumnInfo("disp_seq");
	public final MCNumberPermColumn disp_seq = createNumberColumn(_disp_seq);
	
	/**
	 * 請求管理ＮＯ. Billing management No..<p>
	 *
	 */
	public static final String $bill_mng_no = "bill_mng_no";
	private static final MCPermColumnInfo _bill_mng_no = createColumnInfo("bill_mng_no");
	public final MCStringPermColumn bill_mng_no = createStringColumn(_bill_mng_no);
	
	/**
	 * 請求先ＣＤ. Billing customer cd..<p>
	 *
	 */
	public static final String $bcst_cd = "bcst_cd";
	private static final MCPermColumnInfo _bcst_cd = createColumnInfo("bcst_cd");
	public final MCStringPermColumn bcst_cd = createStringColumn(_bcst_cd);
	
	/**
	 * 請求部門ＣＤ. Billing dept. cd..<p>
	 *
	 */
	public static final String $bill_dpt_cd = "bill_dpt_cd";
	private static final MCPermColumnInfo _bill_dpt_cd = createColumnInfo("bill_dpt_cd");
	public final MCStringPermColumn bill_dpt_cd = createStringColumn(_bill_dpt_cd);
	
	/**
	 * 売掛先ＣＤ. AR customer cd..<p>
	 *
	 */
	public static final String $acst_cd = "acst_cd";
	private static final MCPermColumnInfo _acst_cd = createColumnInfo("acst_cd");
	public final MCStringPermColumn acst_cd = createStringColumn(_acst_cd);
	
	/**
	 * 債権部門ＣＤ. AR dept. cd..<p>
	 *
	 */
	public static final String $ar_dpt_cd = "ar_dpt_cd";
	private static final MCPermColumnInfo _ar_dpt_cd = createColumnInfo("ar_dpt_cd");
	public final MCStringPermColumn ar_dpt_cd = createStringColumn(_ar_dpt_cd);
	
	/**
	 * ワーキンググループＣＤ. WG cd..<p>
	 *
	 */
	public static final String $wg_cd = "wg_cd";
	private static final MCPermColumnInfo _wg_cd = createColumnInfo("wg_cd");
	public final MCStringPermColumn wg_cd = createStringColumn(_wg_cd);
	
	/**
	 * インボイスＮＯ. Invoice No..<p>
	 *
	 */
	public static final String $iv_no = "iv_no";
	private static final MCPermColumnInfo _iv_no = createColumnInfo("iv_no");
	public final MCStringPermColumn iv_no = createStringColumn(_iv_no);
	
	/**
	 * 案件ＮＯ. Sales project No..<p>
	 *
	 */
	public static final String $wrk_no = "wrk_no";
	private static final MCPermColumnInfo _wrk_no = createColumnInfo("wrk_no");
	public final MCStringPermColumn wrk_no = createStringColumn(_wrk_no);
	
	/**
	 * 債権区分. AR type.<p>
	 *
	 */
	public static final String $ar_typ = "ar_typ";
	private static final MCPermColumnInfo _ar_typ = createColumnInfo("ar_typ");
	public final MCStringPermColumn ar_typ = createStringColumn(_ar_typ);
	
	/**
	 * 債権決済方法ＣＤ１. AR settlement method cd. 1.<p>
	 *
	 */
	public static final String $ar_sttl_cd1 = "ar_sttl_cd1";
	private static final MCPermColumnInfo _ar_sttl_cd1 = createColumnInfo("ar_sttl_cd1");
	public final MCStringPermColumn ar_sttl_cd1 = createStringColumn(_ar_sttl_cd1);
	
	/**
	 * 債権決済区分１. AR settlement type 1.<p>
	 *
	 */
	public static final String $ar_sttl_typ1 = "ar_sttl_typ1";
	private static final MCPermColumnInfo _ar_sttl_typ1 = createColumnInfo("ar_sttl_typ1");
	public final MCStringPermColumn ar_sttl_typ1 = createStringColumn(_ar_sttl_typ1);
	
	/**
	 * 取引通貨金額１. Amount 1 (Transaction currency).<p>
	 *
	 */
	public static final String $trd_cur_amt1 = "trd_cur_amt1";
	private static final MCPermColumnInfo _trd_cur_amt1 = createColumnInfo("trd_cur_amt1");
	public final MCNumberPermColumn trd_cur_amt1 = createNumberColumn(_trd_cur_amt1);
	
	/**
	 * 取引通貨内税額１. Tax inclusive amount 1 (Transaction currency).<p>
	 *
	 */
	public static final String $trd_cur_tax_amt1 = "trd_cur_tax_amt1";
	private static final MCPermColumnInfo _trd_cur_tax_amt1 = createColumnInfo("trd_cur_tax_amt1");
	public final MCNumberPermColumn trd_cur_tax_amt1 = createNumberColumn(_trd_cur_tax_amt1);
	
	/**
	 * 取引通貨金額２. Amount 2 (Transaction currency).<p>
	 *
	 */
	public static final String $trd_cur_amt2 = "trd_cur_amt2";
	private static final MCPermColumnInfo _trd_cur_amt2 = createColumnInfo("trd_cur_amt2");
	public final MCNumberPermColumn trd_cur_amt2 = createNumberColumn(_trd_cur_amt2);
	
	/**
	 * 取引通貨内税額２. Tax inclusive amount 2 (Transaction currency).<p>
	 *
	 */
	public static final String $trd_cur_tax_amt2 = "trd_cur_tax_amt2";
	private static final MCPermColumnInfo _trd_cur_tax_amt2 = createColumnInfo("trd_cur_tax_amt2");
	public final MCNumberPermColumn trd_cur_tax_amt2 = createNumberColumn(_trd_cur_tax_amt2);
	
	/**
	 * 取引通貨金額３. Amount 3 (Transaction currency).<p>
	 *
	 */
	public static final String $trd_cur_amt3 = "trd_cur_amt3";
	private static final MCPermColumnInfo _trd_cur_amt3 = createColumnInfo("trd_cur_amt3");
	public final MCNumberPermColumn trd_cur_amt3 = createNumberColumn(_trd_cur_amt3);
	
	/**
	 * 取引通貨内税額３. Tax inclusive amount 3 (Transaction currency).<p>
	 *
	 */
	public static final String $trd_cur_tax_amt3 = "trd_cur_tax_amt3";
	private static final MCPermColumnInfo _trd_cur_tax_amt3 = createColumnInfo("trd_cur_tax_amt3");
	public final MCNumberPermColumn trd_cur_tax_amt3 = createNumberColumn(_trd_cur_tax_amt3);
	
	/**
	 * 基準通貨金額１. Amount 1 (Base currency).<p>
	 *
	 */
	public static final String $base_cur_amt1 = "base_cur_amt1";
	private static final MCPermColumnInfo _base_cur_amt1 = createColumnInfo("base_cur_amt1");
	public final MCNumberPermColumn base_cur_amt1 = createNumberColumn(_base_cur_amt1);
	
	/**
	 * 基準通貨内税額１. Tax inclusive amount 1 (Base currency).<p>
	 *
	 */
	public static final String $base_cur_tax_amt1 = "base_cur_tax_amt1";
	private static final MCPermColumnInfo _base_cur_tax_amt1 = createColumnInfo("base_cur_tax_amt1");
	public final MCNumberPermColumn base_cur_tax_amt1 = createNumberColumn(_base_cur_tax_amt1);
	
	/**
	 * 基準通貨金額２. Amount 2 (Base currency).<p>
	 *
	 */
	public static final String $base_cur_amt2 = "base_cur_amt2";
	private static final MCPermColumnInfo _base_cur_amt2 = createColumnInfo("base_cur_amt2");
	public final MCNumberPermColumn base_cur_amt2 = createNumberColumn(_base_cur_amt2);
	
	/**
	 * 基準通貨内税額２. Tax inclusive amount 2 (Base currency).<p>
	 *
	 */
	public static final String $base_cur_tax_amt2 = "base_cur_tax_amt2";
	private static final MCPermColumnInfo _base_cur_tax_amt2 = createColumnInfo("base_cur_tax_amt2");
	public final MCNumberPermColumn base_cur_tax_amt2 = createNumberColumn(_base_cur_tax_amt2);
	
	/**
	 * 基準通貨金額３. Amount 3 (Base currency).<p>
	 *
	 */
	public static final String $base_cur_amt3 = "base_cur_amt3";
	private static final MCPermColumnInfo _base_cur_amt3 = createColumnInfo("base_cur_amt3");
	public final MCNumberPermColumn base_cur_amt3 = createNumberColumn(_base_cur_amt3);
	
	/**
	 * 基準通貨内税額３. Tax inclusive amount 3 (Base currency).<p>
	 *
	 */
	public static final String $base_cur_tax_amt3 = "base_cur_tax_amt3";
	private static final MCPermColumnInfo _base_cur_tax_amt3 = createColumnInfo("base_cur_tax_amt3");
	public final MCNumberPermColumn base_cur_tax_amt3 = createNumberColumn(_base_cur_tax_amt3);
	
	/**
	 * 取引時為替レート. Exchange rate at trading.<p>
	 *
	 */
	public static final String $trd_xrate = "trd_xrate";
	private static final MCPermColumnInfo _trd_xrate = createColumnInfo("trd_xrate");
	public final MCNumberPermColumn trd_xrate = createNumberColumn(_trd_xrate);
	
	/**
	 * 発生入金ＮＯ. Source incoming payment result No..<p>
	 *
	 */
	public static final String $gen_rcv_no = "gen_rcv_no";
	private static final MCPermColumnInfo _gen_rcv_no = createColumnInfo("gen_rcv_no");
	public final MCStringPermColumn gen_rcv_no = createStringColumn(_gen_rcv_no);
	
	/**
	 * 請求書明細備考. Invoice details remarks.<p>
	 *
	 */
	public static final String $bill_d_rmrks = "bill_d_rmrks";
	private static final MCPermColumnInfo _bill_d_rmrks = createColumnInfo("bill_d_rmrks");
	public final MCStringPermColumn bill_d_rmrks = createStringColumn(_bill_d_rmrks);
	
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
	 * 消込完了ＦＬＧ. Reconciled flg..<p>
	 *
	 */
	public static final String $appl_cmpl_flg = "appl_cmpl_flg";
	private static final MCPermColumnInfo _appl_cmpl_flg = createColumnInfo("appl_cmpl_flg");
	public final MCBooleanPermColumn appl_cmpl_flg = createBooleanColumn(_appl_cmpl_flg);
	
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
	
	public static final MCMeta rcv_act_d_no_META = createCommonMeta($rcv_act_d_no, mcframe.commonMA.meta.MA_META.RCV_ACT_D_NO);
	public static final MCMeta rcv_act_d_seq_META = createCommonMeta($rcv_act_d_seq, mcframe.commonMA.meta.MA_META.SLIP_SEQ);
	public static final MCMeta rcv_act_no_META = createCommonMeta($rcv_act_no, mcframe.commonMA.meta.MA_META.RCV_ACT_NO);
	public static final MCMeta rcv_act_seq_META = createCommonMeta($rcv_act_seq, mcframe.commonMA.meta.MA_META.SLIP_SEQ);
	public static final MCMeta disp_seq_META = createCommonMeta($disp_seq, mcframe.commonMA.meta.MA_META.DISP_SEQ);
	public static final MCMeta bill_mng_no_META = createCommonMeta($bill_mng_no, mcframe.commonMA.meta.MA_META.BILL_MNG_NO);
	public static final MCMeta bcst_cd_META = createCommonMeta($bcst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta bill_dpt_cd_META = createCommonMeta($bill_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta acst_cd_META = createCommonMeta($acst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta ar_dpt_cd_META = createCommonMeta($ar_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta iv_no_META = createCommonMeta($iv_no, mcframe.commonMA.meta.MA_META.IV_NO);
	public static final MCMeta wrk_no_META = createCommonMeta($wrk_no, mcframe.commonMA.meta.MA_META.WRK_NO);
	public static final MCMeta ar_typ_META = createCommonMeta($ar_typ, mcframe.commonMA.meta.MA_META.AR_TYP);
	public static final MCMeta ar_sttl_cd1_META = createCommonMeta($ar_sttl_cd1, mcframe.commonMA.meta.MA_META.STTL_CD);
	public static final MCMeta ar_sttl_typ1_META = createCommonMeta($ar_sttl_typ1, mcframe.commonMA.meta.MA_META.AR_STTL_TYP);
	public static final MCMeta trd_cur_amt1_META = createCommonMeta($trd_cur_amt1, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta trd_cur_tax_amt1_META = createCommonMeta($trd_cur_tax_amt1, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta trd_cur_amt2_META = createCommonMeta($trd_cur_amt2, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta trd_cur_tax_amt2_META = createCommonMeta($trd_cur_tax_amt2, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta trd_cur_amt3_META = createCommonMeta($trd_cur_amt3, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta trd_cur_tax_amt3_META = createCommonMeta($trd_cur_tax_amt3, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_amt1_META = createCommonMeta($base_cur_amt1, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_tax_amt1_META = createCommonMeta($base_cur_tax_amt1, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_amt2_META = createCommonMeta($base_cur_amt2, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_tax_amt2_META = createCommonMeta($base_cur_tax_amt2, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_amt3_META = createCommonMeta($base_cur_amt3, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_tax_amt3_META = createCommonMeta($base_cur_tax_amt3, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta trd_xrate_META = createCommonMeta($trd_xrate, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta gen_rcv_no_META = createCommonMeta($gen_rcv_no, mcframe.commonMA.meta.MA_META.RCV_NO);
	public static final MCMeta bill_d_rmrks_META = createCommonMeta($bill_d_rmrks, mcframe.commonMS.meta.MS_META.BILL_D_RMRKS);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.RCV_ACT_D_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.RCV_ACT_D_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.RCV_ACT_D_SUB_CHAR3);
	public static final MCMeta appl_cmpl_flg_META = createCommonMeta($appl_cmpl_flg, mcframe.commonMA.meta.MA_META.FLG);
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
	
	protected static final ConstMetaList<MST_RCV_ACT_D_R> constMetas = new ConstMetaList<MST_RCV_ACT_D_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			rcv_act_d_no_META,
			rcv_act_d_seq_META,
			rcv_act_no_META,
			rcv_act_seq_META,
			disp_seq_META,
			bill_mng_no_META,
			bcst_cd_META,
			bill_dpt_cd_META,
			acst_cd_META,
			ar_dpt_cd_META,
			wg_cd_META,
			iv_no_META,
			wrk_no_META,
			ar_typ_META,
			ar_sttl_cd1_META,
			ar_sttl_typ1_META,
			trd_cur_amt1_META,
			trd_cur_tax_amt1_META,
			trd_cur_amt2_META,
			trd_cur_tax_amt2_META,
			trd_cur_amt3_META,
			trd_cur_tax_amt3_META,
			base_cur_amt1_META,
			base_cur_tax_amt1_META,
			base_cur_amt2_META,
			base_cur_tax_amt2_META,
			base_cur_amt3_META,
			base_cur_tax_amt3_META,
			trd_xrate_META,
			gen_rcv_no_META,
			bill_d_rmrks_META,
			sub_char1_META,
			sub_char2_META,
			sub_char3_META,
			appl_cmpl_flg_META,
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
	protected MST_RCV_ACT_D_R(ConstMetaList<? extends MST_RCV_ACT_D_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MST_RCV_ACT_D_R(ConstMetaList<? extends MST_RCV_ACT_D_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MST_RCV_ACT_D_R.$rcv_act_d_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_ACT_D_R.$rcv_act_d_no,
				"rcv_act_d_no",
				rcv_act_d_no,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_ACT_D_R.$rcv_act_d_seq,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_RCV_ACT_D_R.$rcv_act_d_seq,
				"rcv_act_d_seq",
				rcv_act_d_seq,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_ACT_D_R.$rcv_act_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_ACT_D_R.$rcv_act_no,
				"rcv_act_no",
				rcv_act_no,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_ACT_D_R.$rcv_act_seq,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_RCV_ACT_D_R.$rcv_act_seq,
				"rcv_act_seq",
				rcv_act_seq,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_ACT_D_R.$disp_seq,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_RCV_ACT_D_R.$disp_seq,
				"disp_seq",
				disp_seq,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_ACT_D_R.$bill_mng_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_ACT_D_R.$bill_mng_no,
				"bill_mng_no",
				bill_mng_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_ACT_D_R.$bcst_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_ACT_D_R.$bcst_cd,
				"bcst_cd",
				bcst_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_ACT_D_R.$bill_dpt_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_ACT_D_R.$bill_dpt_cd,
				"bill_dpt_cd",
				bill_dpt_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_ACT_D_R.$acst_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_ACT_D_R.$acst_cd,
				"acst_cd",
				acst_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_ACT_D_R.$ar_dpt_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_ACT_D_R.$ar_dpt_cd,
				"ar_dpt_cd",
				ar_dpt_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_ACT_D_R.$wg_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_ACT_D_R.$wg_cd,
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
			MST_RCV_ACT_D_R.$iv_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_ACT_D_R.$iv_no,
				"iv_no",
				iv_no,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_ACT_D_R.$wrk_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_ACT_D_R.$wrk_no,
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
			MST_RCV_ACT_D_R.$ar_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_ACT_D_R.$ar_typ,
				"ar_typ",
				ar_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_ACT_D_R.$ar_sttl_cd1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_ACT_D_R.$ar_sttl_cd1,
				"ar_sttl_cd1",
				ar_sttl_cd1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_ACT_D_R.$ar_sttl_typ1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_ACT_D_R.$ar_sttl_typ1,
				"ar_sttl_typ1",
				ar_sttl_typ1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_ACT_D_R.$trd_cur_amt1,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_RCV_ACT_D_R.$trd_cur_amt1,
				"trd_cur_amt1",
				trd_cur_amt1,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_ACT_D_R.$trd_cur_tax_amt1,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_RCV_ACT_D_R.$trd_cur_tax_amt1,
				"trd_cur_tax_amt1",
				trd_cur_tax_amt1,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_ACT_D_R.$trd_cur_amt2,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_RCV_ACT_D_R.$trd_cur_amt2,
				"trd_cur_amt2",
				trd_cur_amt2,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_ACT_D_R.$trd_cur_tax_amt2,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_RCV_ACT_D_R.$trd_cur_tax_amt2,
				"trd_cur_tax_amt2",
				trd_cur_tax_amt2,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_ACT_D_R.$trd_cur_amt3,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_RCV_ACT_D_R.$trd_cur_amt3,
				"trd_cur_amt3",
				trd_cur_amt3,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_ACT_D_R.$trd_cur_tax_amt3,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_RCV_ACT_D_R.$trd_cur_tax_amt3,
				"trd_cur_tax_amt3",
				trd_cur_tax_amt3,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_ACT_D_R.$base_cur_amt1,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_RCV_ACT_D_R.$base_cur_amt1,
				"base_cur_amt1",
				base_cur_amt1,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_ACT_D_R.$base_cur_tax_amt1,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_RCV_ACT_D_R.$base_cur_tax_amt1,
				"base_cur_tax_amt1",
				base_cur_tax_amt1,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_ACT_D_R.$base_cur_amt2,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_RCV_ACT_D_R.$base_cur_amt2,
				"base_cur_amt2",
				base_cur_amt2,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_ACT_D_R.$base_cur_tax_amt2,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_RCV_ACT_D_R.$base_cur_tax_amt2,
				"base_cur_tax_amt2",
				base_cur_tax_amt2,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_ACT_D_R.$base_cur_amt3,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_RCV_ACT_D_R.$base_cur_amt3,
				"base_cur_amt3",
				base_cur_amt3,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_ACT_D_R.$base_cur_tax_amt3,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_RCV_ACT_D_R.$base_cur_tax_amt3,
				"base_cur_tax_amt3",
				base_cur_tax_amt3,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_ACT_D_R.$trd_xrate,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_RCV_ACT_D_R.$trd_xrate,
				"trd_xrate",
				trd_xrate,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_ACT_D_R.$gen_rcv_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_ACT_D_R.$gen_rcv_no,
				"gen_rcv_no",
				gen_rcv_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_ACT_D_R.$bill_d_rmrks,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_ACT_D_R.$bill_d_rmrks,
				"bill_d_rmrks",
				bill_d_rmrks,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_ACT_D_R.$sub_char1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_ACT_D_R.$sub_char1,
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
			MST_RCV_ACT_D_R.$sub_char2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_ACT_D_R.$sub_char2,
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
			MST_RCV_ACT_D_R.$sub_char3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_ACT_D_R.$sub_char3,
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
			MST_RCV_ACT_D_R.$appl_cmpl_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_RCV_ACT_D_R.$appl_cmpl_flg,
				"appl_cmpl_flg",
				appl_cmpl_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_ACT_D_R.$ins_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_ACT_D_R.$ins_usr_id,
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
			MST_RCV_ACT_D_R.$ins_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_ACT_D_R.$ins_usr_nm,
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
			MST_RCV_ACT_D_R.$ins_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MST_RCV_ACT_D_R.$ins_ts,
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
			MST_RCV_ACT_D_R.$ins_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_ACT_D_R.$ins_func_id,
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
			MST_RCV_ACT_D_R.$upd_cntr,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_RCV_ACT_D_R.$upd_cntr,
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
			MST_RCV_ACT_D_R.$upd_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_ACT_D_R.$upd_usr_id,
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
			MST_RCV_ACT_D_R.$upd_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_ACT_D_R.$upd_usr_nm,
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
			MST_RCV_ACT_D_R.$upd_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MST_RCV_ACT_D_R.$upd_ts,
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
			MST_RCV_ACT_D_R.$upd_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_ACT_D_R.$upd_func_id,
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
			MST_RCV_ACT_D_R.$upd_srv_req_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_ACT_D_R.$upd_srv_req_no,
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
	public static MST_RCV_ACT_D_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MST_RCV_ACT_D_R create(String alias) {
		MST_RCV_ACT_D_R row = new MST_RCV_ACT_D_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MST_RCV_ACT_D_R createByName(T proto) {
		MST_RCV_ACT_D_R row = MST_RCV_ACT_D_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MST_RCV_ACT_D_R clone() {
		return (MST_RCV_ACT_D_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MST_RCV_ACT_D_R createInstance() {
		return (MST_RCV_ACT_D_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MST_RCV_ACT_D_R getValues(String... names) {
		return (MST_RCV_ACT_D_R) super.getValues(names);
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
	 public MSW_RCV_ACT_D_KEY_R getPkWorkDbc(String alias) {
	 	return MSW_RCV_ACT_D_KEY_R.create(alias);
	 }

	/*
	 * MCDBContainerのオーバーライドメソッドです。
	 */
	 public MSW_RCV_ACT_D_KEY_R getPkWorkDbc() {
	 	return getPkWorkDbc(MSW_RCV_ACT_D_KEY_R.TABLE_NAME);
	 }

	/**
	 * 入金実績明細ＮＯ. Payment received result details No..<p>
	 *
	 */
	public String rcv_act_d_no() {
		return getConstString(offset + 0, $rcv_act_d_no);
	}

	/**
	 * 入金実績明細ＮＯ. Payment received result details No..<p>
	 *
	 */
	public void rcv_act_d_no(String value) {
		setConstString(offset + 0, $rcv_act_d_no, value);
	}

	/**
	 * 入金実績明細連番. Payment received result details sequence number.<p>
	 *
	 */
	public MCNumber rcv_act_d_seq() {
		return getConstNumber(offset + 1, $rcv_act_d_seq);
	}

	/**
	 * 入金実績明細連番. Payment received result details sequence number.<p>
	 *
	 */
	public void rcv_act_d_seq(MCNumber value) {
		setConstNumber(offset + 1, $rcv_act_d_seq, value);
	}
	
	/**
	 * 入金実績明細連番. Payment received result details sequence number.<p>
	 *
	 */
	public void rcv_act_d_seq(int value) {
		setConstNumber(offset + 1, $rcv_act_d_seq, value);
	}
	
	/**
	 * 入金実績明細連番. Payment received result details sequence number.<p>
	 *
	 */
	public void rcv_act_d_seq(long value) {
		setConstNumber(offset + 1, $rcv_act_d_seq, value);
	}
	
	/**
	 * 入金実績明細連番. Payment received result details sequence number.<p>
	 *
	 */
	public void rcv_act_d_seq(float value) {
		setConstNumber(offset + 1, $rcv_act_d_seq, value);
	}
	
	/**
	 * 入金実績明細連番. Payment received result details sequence number.<p>
	 *
	 */
	public void rcv_act_d_seq(double value) {
		setConstNumber(offset + 1, $rcv_act_d_seq, value);
	}
	
	/**
	 * 入金実績ＮＯ. Payment received result No..<p>
	 *
	 */
	public String rcv_act_no() {
		return getConstString(offset + 2, $rcv_act_no);
	}

	/**
	 * 入金実績ＮＯ. Payment received result No..<p>
	 *
	 */
	public void rcv_act_no(String value) {
		setConstString(offset + 2, $rcv_act_no, value);
	}

	/**
	 * 入金実績連番. Payment received result sequence number.<p>
	 *
	 */
	public MCNumber rcv_act_seq() {
		return getConstNumber(offset + 3, $rcv_act_seq);
	}

	/**
	 * 入金実績連番. Payment received result sequence number.<p>
	 *
	 */
	public void rcv_act_seq(MCNumber value) {
		setConstNumber(offset + 3, $rcv_act_seq, value);
	}
	
	/**
	 * 入金実績連番. Payment received result sequence number.<p>
	 *
	 */
	public void rcv_act_seq(int value) {
		setConstNumber(offset + 3, $rcv_act_seq, value);
	}
	
	/**
	 * 入金実績連番. Payment received result sequence number.<p>
	 *
	 */
	public void rcv_act_seq(long value) {
		setConstNumber(offset + 3, $rcv_act_seq, value);
	}
	
	/**
	 * 入金実績連番. Payment received result sequence number.<p>
	 *
	 */
	public void rcv_act_seq(float value) {
		setConstNumber(offset + 3, $rcv_act_seq, value);
	}
	
	/**
	 * 入金実績連番. Payment received result sequence number.<p>
	 *
	 */
	public void rcv_act_seq(double value) {
		setConstNumber(offset + 3, $rcv_act_seq, value);
	}
	
	/**
	 * 表示順. Display order.<p>
	 *
	 */
	public MCNumber disp_seq() {
		return getConstNumber(offset + 4, $disp_seq);
	}

	/**
	 * 表示順. Display order.<p>
	 *
	 */
	public void disp_seq(MCNumber value) {
		setConstNumber(offset + 4, $disp_seq, value);
	}
	
	/**
	 * 表示順. Display order.<p>
	 *
	 */
	public void disp_seq(int value) {
		setConstNumber(offset + 4, $disp_seq, value);
	}
	
	/**
	 * 表示順. Display order.<p>
	 *
	 */
	public void disp_seq(long value) {
		setConstNumber(offset + 4, $disp_seq, value);
	}
	
	/**
	 * 表示順. Display order.<p>
	 *
	 */
	public void disp_seq(float value) {
		setConstNumber(offset + 4, $disp_seq, value);
	}
	
	/**
	 * 表示順. Display order.<p>
	 *
	 */
	public void disp_seq(double value) {
		setConstNumber(offset + 4, $disp_seq, value);
	}
	
	/**
	 * 請求管理ＮＯ. Billing management No..<p>
	 *
	 */
	public String bill_mng_no() {
		return getConstString(offset + 5, $bill_mng_no);
	}

	/**
	 * 請求管理ＮＯ. Billing management No..<p>
	 *
	 */
	public void bill_mng_no(String value) {
		setConstString(offset + 5, $bill_mng_no, value);
	}

	/**
	 * 請求先ＣＤ. Billing customer cd..<p>
	 *
	 */
	public String bcst_cd() {
		return getConstString(offset + 6, $bcst_cd);
	}

	/**
	 * 請求先ＣＤ. Billing customer cd..<p>
	 *
	 */
	public void bcst_cd(String value) {
		setConstString(offset + 6, $bcst_cd, value);
	}

	/**
	 * 請求部門ＣＤ. Billing dept. cd..<p>
	 *
	 */
	public String bill_dpt_cd() {
		return getConstString(offset + 7, $bill_dpt_cd);
	}

	/**
	 * 請求部門ＣＤ. Billing dept. cd..<p>
	 *
	 */
	public void bill_dpt_cd(String value) {
		setConstString(offset + 7, $bill_dpt_cd, value);
	}

	/**
	 * 売掛先ＣＤ. AR customer cd..<p>
	 *
	 */
	public String acst_cd() {
		return getConstString(offset + 8, $acst_cd);
	}

	/**
	 * 売掛先ＣＤ. AR customer cd..<p>
	 *
	 */
	public void acst_cd(String value) {
		setConstString(offset + 8, $acst_cd, value);
	}

	/**
	 * 債権部門ＣＤ. AR dept. cd..<p>
	 *
	 */
	public String ar_dpt_cd() {
		return getConstString(offset + 9, $ar_dpt_cd);
	}

	/**
	 * 債権部門ＣＤ. AR dept. cd..<p>
	 *
	 */
	public void ar_dpt_cd(String value) {
		setConstString(offset + 9, $ar_dpt_cd, value);
	}

	/**
	 * ワーキンググループＣＤ. WG cd..<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 10, $wg_cd);
	}

	/**
	 * ワーキンググループＣＤ. WG cd..<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 10, $wg_cd, value);
	}

	/**
	 * インボイスＮＯ. Invoice No..<p>
	 *
	 */
	public String iv_no() {
		return getConstString(offset + 11, $iv_no);
	}

	/**
	 * インボイスＮＯ. Invoice No..<p>
	 *
	 */
	public void iv_no(String value) {
		setConstString(offset + 11, $iv_no, value);
	}

	/**
	 * 案件ＮＯ. Sales project No..<p>
	 *
	 */
	public String wrk_no() {
		return getConstString(offset + 12, $wrk_no);
	}

	/**
	 * 案件ＮＯ. Sales project No..<p>
	 *
	 */
	public void wrk_no(String value) {
		setConstString(offset + 12, $wrk_no, value);
	}

	/**
	 * 債権区分. AR type.<p>
	 *
	 */
	public String ar_typ() {
		return getConstString(offset + 13, $ar_typ);
	}

	/**
	 * 債権区分. AR type.<p>
	 *
	 */
	public void ar_typ(String value) {
		setConstString(offset + 13, $ar_typ, value);
	}

	/**
	 * 債権決済方法ＣＤ１. AR settlement method cd. 1.<p>
	 *
	 */
	public String ar_sttl_cd1() {
		return getConstString(offset + 14, $ar_sttl_cd1);
	}

	/**
	 * 債権決済方法ＣＤ１. AR settlement method cd. 1.<p>
	 *
	 */
	public void ar_sttl_cd1(String value) {
		setConstString(offset + 14, $ar_sttl_cd1, value);
	}

	/**
	 * 債権決済区分１. AR settlement type 1.<p>
	 *
	 */
	public String ar_sttl_typ1() {
		return getConstString(offset + 15, $ar_sttl_typ1);
	}

	/**
	 * 債権決済区分１. AR settlement type 1.<p>
	 *
	 */
	public void ar_sttl_typ1(String value) {
		setConstString(offset + 15, $ar_sttl_typ1, value);
	}

	/**
	 * 取引通貨金額１. Amount 1 (Transaction currency).<p>
	 *
	 */
	public MCNumber trd_cur_amt1() {
		return getConstNumber(offset + 16, $trd_cur_amt1);
	}

	/**
	 * 取引通貨金額１. Amount 1 (Transaction currency).<p>
	 *
	 */
	public void trd_cur_amt1(MCNumber value) {
		setConstNumber(offset + 16, $trd_cur_amt1, value);
	}
	
	/**
	 * 取引通貨金額１. Amount 1 (Transaction currency).<p>
	 *
	 */
	public void trd_cur_amt1(int value) {
		setConstNumber(offset + 16, $trd_cur_amt1, value);
	}
	
	/**
	 * 取引通貨金額１. Amount 1 (Transaction currency).<p>
	 *
	 */
	public void trd_cur_amt1(long value) {
		setConstNumber(offset + 16, $trd_cur_amt1, value);
	}
	
	/**
	 * 取引通貨金額１. Amount 1 (Transaction currency).<p>
	 *
	 */
	public void trd_cur_amt1(float value) {
		setConstNumber(offset + 16, $trd_cur_amt1, value);
	}
	
	/**
	 * 取引通貨金額１. Amount 1 (Transaction currency).<p>
	 *
	 */
	public void trd_cur_amt1(double value) {
		setConstNumber(offset + 16, $trd_cur_amt1, value);
	}
	
	/**
	 * 取引通貨内税額１. Tax inclusive amount 1 (Transaction currency).<p>
	 *
	 */
	public MCNumber trd_cur_tax_amt1() {
		return getConstNumber(offset + 17, $trd_cur_tax_amt1);
	}

	/**
	 * 取引通貨内税額１. Tax inclusive amount 1 (Transaction currency).<p>
	 *
	 */
	public void trd_cur_tax_amt1(MCNumber value) {
		setConstNumber(offset + 17, $trd_cur_tax_amt1, value);
	}
	
	/**
	 * 取引通貨内税額１. Tax inclusive amount 1 (Transaction currency).<p>
	 *
	 */
	public void trd_cur_tax_amt1(int value) {
		setConstNumber(offset + 17, $trd_cur_tax_amt1, value);
	}
	
	/**
	 * 取引通貨内税額１. Tax inclusive amount 1 (Transaction currency).<p>
	 *
	 */
	public void trd_cur_tax_amt1(long value) {
		setConstNumber(offset + 17, $trd_cur_tax_amt1, value);
	}
	
	/**
	 * 取引通貨内税額１. Tax inclusive amount 1 (Transaction currency).<p>
	 *
	 */
	public void trd_cur_tax_amt1(float value) {
		setConstNumber(offset + 17, $trd_cur_tax_amt1, value);
	}
	
	/**
	 * 取引通貨内税額１. Tax inclusive amount 1 (Transaction currency).<p>
	 *
	 */
	public void trd_cur_tax_amt1(double value) {
		setConstNumber(offset + 17, $trd_cur_tax_amt1, value);
	}
	
	/**
	 * 取引通貨金額２. Amount 2 (Transaction currency).<p>
	 *
	 */
	public MCNumber trd_cur_amt2() {
		return getConstNumber(offset + 18, $trd_cur_amt2);
	}

	/**
	 * 取引通貨金額２. Amount 2 (Transaction currency).<p>
	 *
	 */
	public void trd_cur_amt2(MCNumber value) {
		setConstNumber(offset + 18, $trd_cur_amt2, value);
	}
	
	/**
	 * 取引通貨金額２. Amount 2 (Transaction currency).<p>
	 *
	 */
	public void trd_cur_amt2(int value) {
		setConstNumber(offset + 18, $trd_cur_amt2, value);
	}
	
	/**
	 * 取引通貨金額２. Amount 2 (Transaction currency).<p>
	 *
	 */
	public void trd_cur_amt2(long value) {
		setConstNumber(offset + 18, $trd_cur_amt2, value);
	}
	
	/**
	 * 取引通貨金額２. Amount 2 (Transaction currency).<p>
	 *
	 */
	public void trd_cur_amt2(float value) {
		setConstNumber(offset + 18, $trd_cur_amt2, value);
	}
	
	/**
	 * 取引通貨金額２. Amount 2 (Transaction currency).<p>
	 *
	 */
	public void trd_cur_amt2(double value) {
		setConstNumber(offset + 18, $trd_cur_amt2, value);
	}
	
	/**
	 * 取引通貨内税額２. Tax inclusive amount 2 (Transaction currency).<p>
	 *
	 */
	public MCNumber trd_cur_tax_amt2() {
		return getConstNumber(offset + 19, $trd_cur_tax_amt2);
	}

	/**
	 * 取引通貨内税額２. Tax inclusive amount 2 (Transaction currency).<p>
	 *
	 */
	public void trd_cur_tax_amt2(MCNumber value) {
		setConstNumber(offset + 19, $trd_cur_tax_amt2, value);
	}
	
	/**
	 * 取引通貨内税額２. Tax inclusive amount 2 (Transaction currency).<p>
	 *
	 */
	public void trd_cur_tax_amt2(int value) {
		setConstNumber(offset + 19, $trd_cur_tax_amt2, value);
	}
	
	/**
	 * 取引通貨内税額２. Tax inclusive amount 2 (Transaction currency).<p>
	 *
	 */
	public void trd_cur_tax_amt2(long value) {
		setConstNumber(offset + 19, $trd_cur_tax_amt2, value);
	}
	
	/**
	 * 取引通貨内税額２. Tax inclusive amount 2 (Transaction currency).<p>
	 *
	 */
	public void trd_cur_tax_amt2(float value) {
		setConstNumber(offset + 19, $trd_cur_tax_amt2, value);
	}
	
	/**
	 * 取引通貨内税額２. Tax inclusive amount 2 (Transaction currency).<p>
	 *
	 */
	public void trd_cur_tax_amt2(double value) {
		setConstNumber(offset + 19, $trd_cur_tax_amt2, value);
	}
	
	/**
	 * 取引通貨金額３. Amount 3 (Transaction currency).<p>
	 *
	 */
	public MCNumber trd_cur_amt3() {
		return getConstNumber(offset + 20, $trd_cur_amt3);
	}

	/**
	 * 取引通貨金額３. Amount 3 (Transaction currency).<p>
	 *
	 */
	public void trd_cur_amt3(MCNumber value) {
		setConstNumber(offset + 20, $trd_cur_amt3, value);
	}
	
	/**
	 * 取引通貨金額３. Amount 3 (Transaction currency).<p>
	 *
	 */
	public void trd_cur_amt3(int value) {
		setConstNumber(offset + 20, $trd_cur_amt3, value);
	}
	
	/**
	 * 取引通貨金額３. Amount 3 (Transaction currency).<p>
	 *
	 */
	public void trd_cur_amt3(long value) {
		setConstNumber(offset + 20, $trd_cur_amt3, value);
	}
	
	/**
	 * 取引通貨金額３. Amount 3 (Transaction currency).<p>
	 *
	 */
	public void trd_cur_amt3(float value) {
		setConstNumber(offset + 20, $trd_cur_amt3, value);
	}
	
	/**
	 * 取引通貨金額３. Amount 3 (Transaction currency).<p>
	 *
	 */
	public void trd_cur_amt3(double value) {
		setConstNumber(offset + 20, $trd_cur_amt3, value);
	}
	
	/**
	 * 取引通貨内税額３. Tax inclusive amount 3 (Transaction currency).<p>
	 *
	 */
	public MCNumber trd_cur_tax_amt3() {
		return getConstNumber(offset + 21, $trd_cur_tax_amt3);
	}

	/**
	 * 取引通貨内税額３. Tax inclusive amount 3 (Transaction currency).<p>
	 *
	 */
	public void trd_cur_tax_amt3(MCNumber value) {
		setConstNumber(offset + 21, $trd_cur_tax_amt3, value);
	}
	
	/**
	 * 取引通貨内税額３. Tax inclusive amount 3 (Transaction currency).<p>
	 *
	 */
	public void trd_cur_tax_amt3(int value) {
		setConstNumber(offset + 21, $trd_cur_tax_amt3, value);
	}
	
	/**
	 * 取引通貨内税額３. Tax inclusive amount 3 (Transaction currency).<p>
	 *
	 */
	public void trd_cur_tax_amt3(long value) {
		setConstNumber(offset + 21, $trd_cur_tax_amt3, value);
	}
	
	/**
	 * 取引通貨内税額３. Tax inclusive amount 3 (Transaction currency).<p>
	 *
	 */
	public void trd_cur_tax_amt3(float value) {
		setConstNumber(offset + 21, $trd_cur_tax_amt3, value);
	}
	
	/**
	 * 取引通貨内税額３. Tax inclusive amount 3 (Transaction currency).<p>
	 *
	 */
	public void trd_cur_tax_amt3(double value) {
		setConstNumber(offset + 21, $trd_cur_tax_amt3, value);
	}
	
	/**
	 * 基準通貨金額１. Amount 1 (Base currency).<p>
	 *
	 */
	public MCNumber base_cur_amt1() {
		return getConstNumber(offset + 22, $base_cur_amt1);
	}

	/**
	 * 基準通貨金額１. Amount 1 (Base currency).<p>
	 *
	 */
	public void base_cur_amt1(MCNumber value) {
		setConstNumber(offset + 22, $base_cur_amt1, value);
	}
	
	/**
	 * 基準通貨金額１. Amount 1 (Base currency).<p>
	 *
	 */
	public void base_cur_amt1(int value) {
		setConstNumber(offset + 22, $base_cur_amt1, value);
	}
	
	/**
	 * 基準通貨金額１. Amount 1 (Base currency).<p>
	 *
	 */
	public void base_cur_amt1(long value) {
		setConstNumber(offset + 22, $base_cur_amt1, value);
	}
	
	/**
	 * 基準通貨金額１. Amount 1 (Base currency).<p>
	 *
	 */
	public void base_cur_amt1(float value) {
		setConstNumber(offset + 22, $base_cur_amt1, value);
	}
	
	/**
	 * 基準通貨金額１. Amount 1 (Base currency).<p>
	 *
	 */
	public void base_cur_amt1(double value) {
		setConstNumber(offset + 22, $base_cur_amt1, value);
	}
	
	/**
	 * 基準通貨内税額１. Tax inclusive amount 1 (Base currency).<p>
	 *
	 */
	public MCNumber base_cur_tax_amt1() {
		return getConstNumber(offset + 23, $base_cur_tax_amt1);
	}

	/**
	 * 基準通貨内税額１. Tax inclusive amount 1 (Base currency).<p>
	 *
	 */
	public void base_cur_tax_amt1(MCNumber value) {
		setConstNumber(offset + 23, $base_cur_tax_amt1, value);
	}
	
	/**
	 * 基準通貨内税額１. Tax inclusive amount 1 (Base currency).<p>
	 *
	 */
	public void base_cur_tax_amt1(int value) {
		setConstNumber(offset + 23, $base_cur_tax_amt1, value);
	}
	
	/**
	 * 基準通貨内税額１. Tax inclusive amount 1 (Base currency).<p>
	 *
	 */
	public void base_cur_tax_amt1(long value) {
		setConstNumber(offset + 23, $base_cur_tax_amt1, value);
	}
	
	/**
	 * 基準通貨内税額１. Tax inclusive amount 1 (Base currency).<p>
	 *
	 */
	public void base_cur_tax_amt1(float value) {
		setConstNumber(offset + 23, $base_cur_tax_amt1, value);
	}
	
	/**
	 * 基準通貨内税額１. Tax inclusive amount 1 (Base currency).<p>
	 *
	 */
	public void base_cur_tax_amt1(double value) {
		setConstNumber(offset + 23, $base_cur_tax_amt1, value);
	}
	
	/**
	 * 基準通貨金額２. Amount 2 (Base currency).<p>
	 *
	 */
	public MCNumber base_cur_amt2() {
		return getConstNumber(offset + 24, $base_cur_amt2);
	}

	/**
	 * 基準通貨金額２. Amount 2 (Base currency).<p>
	 *
	 */
	public void base_cur_amt2(MCNumber value) {
		setConstNumber(offset + 24, $base_cur_amt2, value);
	}
	
	/**
	 * 基準通貨金額２. Amount 2 (Base currency).<p>
	 *
	 */
	public void base_cur_amt2(int value) {
		setConstNumber(offset + 24, $base_cur_amt2, value);
	}
	
	/**
	 * 基準通貨金額２. Amount 2 (Base currency).<p>
	 *
	 */
	public void base_cur_amt2(long value) {
		setConstNumber(offset + 24, $base_cur_amt2, value);
	}
	
	/**
	 * 基準通貨金額２. Amount 2 (Base currency).<p>
	 *
	 */
	public void base_cur_amt2(float value) {
		setConstNumber(offset + 24, $base_cur_amt2, value);
	}
	
	/**
	 * 基準通貨金額２. Amount 2 (Base currency).<p>
	 *
	 */
	public void base_cur_amt2(double value) {
		setConstNumber(offset + 24, $base_cur_amt2, value);
	}
	
	/**
	 * 基準通貨内税額２. Tax inclusive amount 2 (Base currency).<p>
	 *
	 */
	public MCNumber base_cur_tax_amt2() {
		return getConstNumber(offset + 25, $base_cur_tax_amt2);
	}

	/**
	 * 基準通貨内税額２. Tax inclusive amount 2 (Base currency).<p>
	 *
	 */
	public void base_cur_tax_amt2(MCNumber value) {
		setConstNumber(offset + 25, $base_cur_tax_amt2, value);
	}
	
	/**
	 * 基準通貨内税額２. Tax inclusive amount 2 (Base currency).<p>
	 *
	 */
	public void base_cur_tax_amt2(int value) {
		setConstNumber(offset + 25, $base_cur_tax_amt2, value);
	}
	
	/**
	 * 基準通貨内税額２. Tax inclusive amount 2 (Base currency).<p>
	 *
	 */
	public void base_cur_tax_amt2(long value) {
		setConstNumber(offset + 25, $base_cur_tax_amt2, value);
	}
	
	/**
	 * 基準通貨内税額２. Tax inclusive amount 2 (Base currency).<p>
	 *
	 */
	public void base_cur_tax_amt2(float value) {
		setConstNumber(offset + 25, $base_cur_tax_amt2, value);
	}
	
	/**
	 * 基準通貨内税額２. Tax inclusive amount 2 (Base currency).<p>
	 *
	 */
	public void base_cur_tax_amt2(double value) {
		setConstNumber(offset + 25, $base_cur_tax_amt2, value);
	}
	
	/**
	 * 基準通貨金額３. Amount 3 (Base currency).<p>
	 *
	 */
	public MCNumber base_cur_amt3() {
		return getConstNumber(offset + 26, $base_cur_amt3);
	}

	/**
	 * 基準通貨金額３. Amount 3 (Base currency).<p>
	 *
	 */
	public void base_cur_amt3(MCNumber value) {
		setConstNumber(offset + 26, $base_cur_amt3, value);
	}
	
	/**
	 * 基準通貨金額３. Amount 3 (Base currency).<p>
	 *
	 */
	public void base_cur_amt3(int value) {
		setConstNumber(offset + 26, $base_cur_amt3, value);
	}
	
	/**
	 * 基準通貨金額３. Amount 3 (Base currency).<p>
	 *
	 */
	public void base_cur_amt3(long value) {
		setConstNumber(offset + 26, $base_cur_amt3, value);
	}
	
	/**
	 * 基準通貨金額３. Amount 3 (Base currency).<p>
	 *
	 */
	public void base_cur_amt3(float value) {
		setConstNumber(offset + 26, $base_cur_amt3, value);
	}
	
	/**
	 * 基準通貨金額３. Amount 3 (Base currency).<p>
	 *
	 */
	public void base_cur_amt3(double value) {
		setConstNumber(offset + 26, $base_cur_amt3, value);
	}
	
	/**
	 * 基準通貨内税額３. Tax inclusive amount 3 (Base currency).<p>
	 *
	 */
	public MCNumber base_cur_tax_amt3() {
		return getConstNumber(offset + 27, $base_cur_tax_amt3);
	}

	/**
	 * 基準通貨内税額３. Tax inclusive amount 3 (Base currency).<p>
	 *
	 */
	public void base_cur_tax_amt3(MCNumber value) {
		setConstNumber(offset + 27, $base_cur_tax_amt3, value);
	}
	
	/**
	 * 基準通貨内税額３. Tax inclusive amount 3 (Base currency).<p>
	 *
	 */
	public void base_cur_tax_amt3(int value) {
		setConstNumber(offset + 27, $base_cur_tax_amt3, value);
	}
	
	/**
	 * 基準通貨内税額３. Tax inclusive amount 3 (Base currency).<p>
	 *
	 */
	public void base_cur_tax_amt3(long value) {
		setConstNumber(offset + 27, $base_cur_tax_amt3, value);
	}
	
	/**
	 * 基準通貨内税額３. Tax inclusive amount 3 (Base currency).<p>
	 *
	 */
	public void base_cur_tax_amt3(float value) {
		setConstNumber(offset + 27, $base_cur_tax_amt3, value);
	}
	
	/**
	 * 基準通貨内税額３. Tax inclusive amount 3 (Base currency).<p>
	 *
	 */
	public void base_cur_tax_amt3(double value) {
		setConstNumber(offset + 27, $base_cur_tax_amt3, value);
	}
	
	/**
	 * 取引時為替レート. Exchange rate at trading.<p>
	 *
	 */
	public MCNumber trd_xrate() {
		return getConstNumber(offset + 28, $trd_xrate);
	}

	/**
	 * 取引時為替レート. Exchange rate at trading.<p>
	 *
	 */
	public void trd_xrate(MCNumber value) {
		setConstNumber(offset + 28, $trd_xrate, value);
	}
	
	/**
	 * 取引時為替レート. Exchange rate at trading.<p>
	 *
	 */
	public void trd_xrate(int value) {
		setConstNumber(offset + 28, $trd_xrate, value);
	}
	
	/**
	 * 取引時為替レート. Exchange rate at trading.<p>
	 *
	 */
	public void trd_xrate(long value) {
		setConstNumber(offset + 28, $trd_xrate, value);
	}
	
	/**
	 * 取引時為替レート. Exchange rate at trading.<p>
	 *
	 */
	public void trd_xrate(float value) {
		setConstNumber(offset + 28, $trd_xrate, value);
	}
	
	/**
	 * 取引時為替レート. Exchange rate at trading.<p>
	 *
	 */
	public void trd_xrate(double value) {
		setConstNumber(offset + 28, $trd_xrate, value);
	}
	
	/**
	 * 発生入金ＮＯ. Source incoming payment result No..<p>
	 *
	 */
	public String gen_rcv_no() {
		return getConstString(offset + 29, $gen_rcv_no);
	}

	/**
	 * 発生入金ＮＯ. Source incoming payment result No..<p>
	 *
	 */
	public void gen_rcv_no(String value) {
		setConstString(offset + 29, $gen_rcv_no, value);
	}

	/**
	 * 請求書明細備考. Invoice details remarks.<p>
	 *
	 */
	public String bill_d_rmrks() {
		return getConstString(offset + 30, $bill_d_rmrks);
	}

	/**
	 * 請求書明細備考. Invoice details remarks.<p>
	 *
	 */
	public void bill_d_rmrks(String value) {
		setConstString(offset + 30, $bill_d_rmrks, value);
	}

	/**
	 * 予備１. Spare 1.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 31, $sub_char1);
	}

	/**
	 * 予備１. Spare 1.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 31, $sub_char1, value);
	}

	/**
	 * 予備２. Spare 2.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 32, $sub_char2);
	}

	/**
	 * 予備２. Spare 2.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 32, $sub_char2, value);
	}

	/**
	 * 予備３. Spare 3.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 33, $sub_char3);
	}

	/**
	 * 予備３. Spare 3.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 33, $sub_char3, value);
	}

	/**
	 * 消込完了ＦＬＧ. Reconciled flg..<p>
	 *
	 */
	public boolean appl_cmpl_flg() {
		return getConstBoolean(offset + 34, $appl_cmpl_flg);
	}

	/**
	 * 消込完了ＦＬＧ. Reconciled flg..<p>
	 *
	 */
	public void appl_cmpl_flg(boolean value) {
		setConstBoolean(offset + 34, $appl_cmpl_flg, value);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 35, $ins_usr_id);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 35, $ins_usr_id, value);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 36, $ins_usr_nm);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 36, $ins_usr_nm, value);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 37, $ins_ts);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 37, $ins_ts, value);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 38, $ins_func_id);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 38, $ins_func_id, value);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 39, $upd_cntr);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 39, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 39, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 39, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 39, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 39, $upd_cntr, value);
	}
	
	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 40, $upd_usr_id);
	}

	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 40, $upd_usr_id, value);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 41, $upd_usr_nm);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 41, $upd_usr_nm, value);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 42, $upd_ts);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 42, $upd_ts, value);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 43, $upd_func_id);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 43, $upd_func_id, value);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 44, $upd_srv_req_no);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 44, $upd_srv_req_no, value);
	}

	public String getString(String name) {
		if ($rcv_act_d_no.equalsIgnoreCase(name)) {
			return rcv_act_d_no();
		}
		if ($rcv_act_no.equalsIgnoreCase(name)) {
			return rcv_act_no();
		}
		if ($bill_mng_no.equalsIgnoreCase(name)) {
			return bill_mng_no();
		}
		if ($bcst_cd.equalsIgnoreCase(name)) {
			return bcst_cd();
		}
		if ($bill_dpt_cd.equalsIgnoreCase(name)) {
			return bill_dpt_cd();
		}
		if ($acst_cd.equalsIgnoreCase(name)) {
			return acst_cd();
		}
		if ($ar_dpt_cd.equalsIgnoreCase(name)) {
			return ar_dpt_cd();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			return iv_no();
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			return wrk_no();
		}
		if ($ar_typ.equalsIgnoreCase(name)) {
			return ar_typ();
		}
		if ($ar_sttl_cd1.equalsIgnoreCase(name)) {
			return ar_sttl_cd1();
		}
		if ($ar_sttl_typ1.equalsIgnoreCase(name)) {
			return ar_sttl_typ1();
		}
		if ($gen_rcv_no.equalsIgnoreCase(name)) {
			return gen_rcv_no();
		}
		if ($bill_d_rmrks.equalsIgnoreCase(name)) {
			return bill_d_rmrks();
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
		if ($rcv_act_d_seq.equalsIgnoreCase(name)) {
			return rcv_act_d_seq();
		}
		if ($rcv_act_seq.equalsIgnoreCase(name)) {
			return rcv_act_seq();
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			return disp_seq();
		}
		if ($trd_cur_amt1.equalsIgnoreCase(name)) {
			return trd_cur_amt1();
		}
		if ($trd_cur_tax_amt1.equalsIgnoreCase(name)) {
			return trd_cur_tax_amt1();
		}
		if ($trd_cur_amt2.equalsIgnoreCase(name)) {
			return trd_cur_amt2();
		}
		if ($trd_cur_tax_amt2.equalsIgnoreCase(name)) {
			return trd_cur_tax_amt2();
		}
		if ($trd_cur_amt3.equalsIgnoreCase(name)) {
			return trd_cur_amt3();
		}
		if ($trd_cur_tax_amt3.equalsIgnoreCase(name)) {
			return trd_cur_tax_amt3();
		}
		if ($base_cur_amt1.equalsIgnoreCase(name)) {
			return base_cur_amt1();
		}
		if ($base_cur_tax_amt1.equalsIgnoreCase(name)) {
			return base_cur_tax_amt1();
		}
		if ($base_cur_amt2.equalsIgnoreCase(name)) {
			return base_cur_amt2();
		}
		if ($base_cur_tax_amt2.equalsIgnoreCase(name)) {
			return base_cur_tax_amt2();
		}
		if ($base_cur_amt3.equalsIgnoreCase(name)) {
			return base_cur_amt3();
		}
		if ($base_cur_tax_amt3.equalsIgnoreCase(name)) {
			return base_cur_tax_amt3();
		}
		if ($trd_xrate.equalsIgnoreCase(name)) {
			return trd_xrate();
		}
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

	public boolean getBoolean(String name) {
		if ($appl_cmpl_flg.equalsIgnoreCase(name)) {
			return appl_cmpl_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($rcv_act_d_no.equalsIgnoreCase(name)) {
			return rcv_act_d_no();
		}
		if ($rcv_act_no.equalsIgnoreCase(name)) {
			return rcv_act_no();
		}
		if ($bill_mng_no.equalsIgnoreCase(name)) {
			return bill_mng_no();
		}
		if ($bcst_cd.equalsIgnoreCase(name)) {
			return bcst_cd();
		}
		if ($bill_dpt_cd.equalsIgnoreCase(name)) {
			return bill_dpt_cd();
		}
		if ($acst_cd.equalsIgnoreCase(name)) {
			return acst_cd();
		}
		if ($ar_dpt_cd.equalsIgnoreCase(name)) {
			return ar_dpt_cd();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			return iv_no();
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			return wrk_no();
		}
		if ($ar_typ.equalsIgnoreCase(name)) {
			return ar_typ();
		}
		if ($ar_sttl_cd1.equalsIgnoreCase(name)) {
			return ar_sttl_cd1();
		}
		if ($ar_sttl_typ1.equalsIgnoreCase(name)) {
			return ar_sttl_typ1();
		}
		if ($gen_rcv_no.equalsIgnoreCase(name)) {
			return gen_rcv_no();
		}
		if ($bill_d_rmrks.equalsIgnoreCase(name)) {
			return bill_d_rmrks();
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
		if ($rcv_act_d_seq.equalsIgnoreCase(name)) {
			return rcv_act_d_seq();
		}
		if ($rcv_act_seq.equalsIgnoreCase(name)) {
			return rcv_act_seq();
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			return disp_seq();
		}
		if ($trd_cur_amt1.equalsIgnoreCase(name)) {
			return trd_cur_amt1();
		}
		if ($trd_cur_tax_amt1.equalsIgnoreCase(name)) {
			return trd_cur_tax_amt1();
		}
		if ($trd_cur_amt2.equalsIgnoreCase(name)) {
			return trd_cur_amt2();
		}
		if ($trd_cur_tax_amt2.equalsIgnoreCase(name)) {
			return trd_cur_tax_amt2();
		}
		if ($trd_cur_amt3.equalsIgnoreCase(name)) {
			return trd_cur_amt3();
		}
		if ($trd_cur_tax_amt3.equalsIgnoreCase(name)) {
			return trd_cur_tax_amt3();
		}
		if ($base_cur_amt1.equalsIgnoreCase(name)) {
			return base_cur_amt1();
		}
		if ($base_cur_tax_amt1.equalsIgnoreCase(name)) {
			return base_cur_tax_amt1();
		}
		if ($base_cur_amt2.equalsIgnoreCase(name)) {
			return base_cur_amt2();
		}
		if ($base_cur_tax_amt2.equalsIgnoreCase(name)) {
			return base_cur_tax_amt2();
		}
		if ($base_cur_amt3.equalsIgnoreCase(name)) {
			return base_cur_amt3();
		}
		if ($base_cur_tax_amt3.equalsIgnoreCase(name)) {
			return base_cur_tax_amt3();
		}
		if ($trd_xrate.equalsIgnoreCase(name)) {
			return trd_xrate();
		}
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

	public boolean getBooleanNE(String name) {
		if ($appl_cmpl_flg.equalsIgnoreCase(name)) {
			return appl_cmpl_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($rcv_act_d_no.equalsIgnoreCase(name)) {
			rcv_act_d_no(value);
			return;
		}
		if ($rcv_act_no.equalsIgnoreCase(name)) {
			rcv_act_no(value);
			return;
		}
		if ($bill_mng_no.equalsIgnoreCase(name)) {
			bill_mng_no(value);
			return;
		}
		if ($bcst_cd.equalsIgnoreCase(name)) {
			bcst_cd(value);
			return;
		}
		if ($bill_dpt_cd.equalsIgnoreCase(name)) {
			bill_dpt_cd(value);
			return;
		}
		if ($acst_cd.equalsIgnoreCase(name)) {
			acst_cd(value);
			return;
		}
		if ($ar_dpt_cd.equalsIgnoreCase(name)) {
			ar_dpt_cd(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			iv_no(value);
			return;
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			wrk_no(value);
			return;
		}
		if ($ar_typ.equalsIgnoreCase(name)) {
			ar_typ(value);
			return;
		}
		if ($ar_sttl_cd1.equalsIgnoreCase(name)) {
			ar_sttl_cd1(value);
			return;
		}
		if ($ar_sttl_typ1.equalsIgnoreCase(name)) {
			ar_sttl_typ1(value);
			return;
		}
		if ($gen_rcv_no.equalsIgnoreCase(name)) {
			gen_rcv_no(value);
			return;
		}
		if ($bill_d_rmrks.equalsIgnoreCase(name)) {
			bill_d_rmrks(value);
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
		if ($rcv_act_d_seq.equalsIgnoreCase(name)) {
			rcv_act_d_seq(value);
			return;
		}
		if ($rcv_act_seq.equalsIgnoreCase(name)) {
			rcv_act_seq(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($trd_cur_amt1.equalsIgnoreCase(name)) {
			trd_cur_amt1(value);
			return;
		}
		if ($trd_cur_tax_amt1.equalsIgnoreCase(name)) {
			trd_cur_tax_amt1(value);
			return;
		}
		if ($trd_cur_amt2.equalsIgnoreCase(name)) {
			trd_cur_amt2(value);
			return;
		}
		if ($trd_cur_tax_amt2.equalsIgnoreCase(name)) {
			trd_cur_tax_amt2(value);
			return;
		}
		if ($trd_cur_amt3.equalsIgnoreCase(name)) {
			trd_cur_amt3(value);
			return;
		}
		if ($trd_cur_tax_amt3.equalsIgnoreCase(name)) {
			trd_cur_tax_amt3(value);
			return;
		}
		if ($base_cur_amt1.equalsIgnoreCase(name)) {
			base_cur_amt1(value);
			return;
		}
		if ($base_cur_tax_amt1.equalsIgnoreCase(name)) {
			base_cur_tax_amt1(value);
			return;
		}
		if ($base_cur_amt2.equalsIgnoreCase(name)) {
			base_cur_amt2(value);
			return;
		}
		if ($base_cur_tax_amt2.equalsIgnoreCase(name)) {
			base_cur_tax_amt2(value);
			return;
		}
		if ($base_cur_amt3.equalsIgnoreCase(name)) {
			base_cur_amt3(value);
			return;
		}
		if ($base_cur_tax_amt3.equalsIgnoreCase(name)) {
			base_cur_tax_amt3(value);
			return;
		}
		if ($trd_xrate.equalsIgnoreCase(name)) {
			trd_xrate(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, int value) {
		if ($rcv_act_d_seq.equalsIgnoreCase(name)) {
			rcv_act_d_seq(value);
			return;
		}
		if ($rcv_act_seq.equalsIgnoreCase(name)) {
			rcv_act_seq(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($trd_cur_amt1.equalsIgnoreCase(name)) {
			trd_cur_amt1(value);
			return;
		}
		if ($trd_cur_tax_amt1.equalsIgnoreCase(name)) {
			trd_cur_tax_amt1(value);
			return;
		}
		if ($trd_cur_amt2.equalsIgnoreCase(name)) {
			trd_cur_amt2(value);
			return;
		}
		if ($trd_cur_tax_amt2.equalsIgnoreCase(name)) {
			trd_cur_tax_amt2(value);
			return;
		}
		if ($trd_cur_amt3.equalsIgnoreCase(name)) {
			trd_cur_amt3(value);
			return;
		}
		if ($trd_cur_tax_amt3.equalsIgnoreCase(name)) {
			trd_cur_tax_amt3(value);
			return;
		}
		if ($base_cur_amt1.equalsIgnoreCase(name)) {
			base_cur_amt1(value);
			return;
		}
		if ($base_cur_tax_amt1.equalsIgnoreCase(name)) {
			base_cur_tax_amt1(value);
			return;
		}
		if ($base_cur_amt2.equalsIgnoreCase(name)) {
			base_cur_amt2(value);
			return;
		}
		if ($base_cur_tax_amt2.equalsIgnoreCase(name)) {
			base_cur_tax_amt2(value);
			return;
		}
		if ($base_cur_amt3.equalsIgnoreCase(name)) {
			base_cur_amt3(value);
			return;
		}
		if ($base_cur_tax_amt3.equalsIgnoreCase(name)) {
			base_cur_tax_amt3(value);
			return;
		}
		if ($trd_xrate.equalsIgnoreCase(name)) {
			trd_xrate(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, long value) {
		if ($rcv_act_d_seq.equalsIgnoreCase(name)) {
			rcv_act_d_seq(value);
			return;
		}
		if ($rcv_act_seq.equalsIgnoreCase(name)) {
			rcv_act_seq(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($trd_cur_amt1.equalsIgnoreCase(name)) {
			trd_cur_amt1(value);
			return;
		}
		if ($trd_cur_tax_amt1.equalsIgnoreCase(name)) {
			trd_cur_tax_amt1(value);
			return;
		}
		if ($trd_cur_amt2.equalsIgnoreCase(name)) {
			trd_cur_amt2(value);
			return;
		}
		if ($trd_cur_tax_amt2.equalsIgnoreCase(name)) {
			trd_cur_tax_amt2(value);
			return;
		}
		if ($trd_cur_amt3.equalsIgnoreCase(name)) {
			trd_cur_amt3(value);
			return;
		}
		if ($trd_cur_tax_amt3.equalsIgnoreCase(name)) {
			trd_cur_tax_amt3(value);
			return;
		}
		if ($base_cur_amt1.equalsIgnoreCase(name)) {
			base_cur_amt1(value);
			return;
		}
		if ($base_cur_tax_amt1.equalsIgnoreCase(name)) {
			base_cur_tax_amt1(value);
			return;
		}
		if ($base_cur_amt2.equalsIgnoreCase(name)) {
			base_cur_amt2(value);
			return;
		}
		if ($base_cur_tax_amt2.equalsIgnoreCase(name)) {
			base_cur_tax_amt2(value);
			return;
		}
		if ($base_cur_amt3.equalsIgnoreCase(name)) {
			base_cur_amt3(value);
			return;
		}
		if ($base_cur_tax_amt3.equalsIgnoreCase(name)) {
			base_cur_tax_amt3(value);
			return;
		}
		if ($trd_xrate.equalsIgnoreCase(name)) {
			trd_xrate(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, float value) {
		if ($rcv_act_d_seq.equalsIgnoreCase(name)) {
			rcv_act_d_seq(value);
			return;
		}
		if ($rcv_act_seq.equalsIgnoreCase(name)) {
			rcv_act_seq(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($trd_cur_amt1.equalsIgnoreCase(name)) {
			trd_cur_amt1(value);
			return;
		}
		if ($trd_cur_tax_amt1.equalsIgnoreCase(name)) {
			trd_cur_tax_amt1(value);
			return;
		}
		if ($trd_cur_amt2.equalsIgnoreCase(name)) {
			trd_cur_amt2(value);
			return;
		}
		if ($trd_cur_tax_amt2.equalsIgnoreCase(name)) {
			trd_cur_tax_amt2(value);
			return;
		}
		if ($trd_cur_amt3.equalsIgnoreCase(name)) {
			trd_cur_amt3(value);
			return;
		}
		if ($trd_cur_tax_amt3.equalsIgnoreCase(name)) {
			trd_cur_tax_amt3(value);
			return;
		}
		if ($base_cur_amt1.equalsIgnoreCase(name)) {
			base_cur_amt1(value);
			return;
		}
		if ($base_cur_tax_amt1.equalsIgnoreCase(name)) {
			base_cur_tax_amt1(value);
			return;
		}
		if ($base_cur_amt2.equalsIgnoreCase(name)) {
			base_cur_amt2(value);
			return;
		}
		if ($base_cur_tax_amt2.equalsIgnoreCase(name)) {
			base_cur_tax_amt2(value);
			return;
		}
		if ($base_cur_amt3.equalsIgnoreCase(name)) {
			base_cur_amt3(value);
			return;
		}
		if ($base_cur_tax_amt3.equalsIgnoreCase(name)) {
			base_cur_tax_amt3(value);
			return;
		}
		if ($trd_xrate.equalsIgnoreCase(name)) {
			trd_xrate(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, double value) {
		if ($rcv_act_d_seq.equalsIgnoreCase(name)) {
			rcv_act_d_seq(value);
			return;
		}
		if ($rcv_act_seq.equalsIgnoreCase(name)) {
			rcv_act_seq(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($trd_cur_amt1.equalsIgnoreCase(name)) {
			trd_cur_amt1(value);
			return;
		}
		if ($trd_cur_tax_amt1.equalsIgnoreCase(name)) {
			trd_cur_tax_amt1(value);
			return;
		}
		if ($trd_cur_amt2.equalsIgnoreCase(name)) {
			trd_cur_amt2(value);
			return;
		}
		if ($trd_cur_tax_amt2.equalsIgnoreCase(name)) {
			trd_cur_tax_amt2(value);
			return;
		}
		if ($trd_cur_amt3.equalsIgnoreCase(name)) {
			trd_cur_amt3(value);
			return;
		}
		if ($trd_cur_tax_amt3.equalsIgnoreCase(name)) {
			trd_cur_tax_amt3(value);
			return;
		}
		if ($base_cur_amt1.equalsIgnoreCase(name)) {
			base_cur_amt1(value);
			return;
		}
		if ($base_cur_tax_amt1.equalsIgnoreCase(name)) {
			base_cur_tax_amt1(value);
			return;
		}
		if ($base_cur_amt2.equalsIgnoreCase(name)) {
			base_cur_amt2(value);
			return;
		}
		if ($base_cur_tax_amt2.equalsIgnoreCase(name)) {
			base_cur_tax_amt2(value);
			return;
		}
		if ($base_cur_amt3.equalsIgnoreCase(name)) {
			base_cur_amt3(value);
			return;
		}
		if ($base_cur_tax_amt3.equalsIgnoreCase(name)) {
			base_cur_tax_amt3(value);
			return;
		}
		if ($trd_xrate.equalsIgnoreCase(name)) {
			trd_xrate(value);
			return;
		}
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

	public void setBoolean(String name, boolean value) {
		if ($appl_cmpl_flg.equalsIgnoreCase(name)) {
			appl_cmpl_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($rcv_act_d_no.equalsIgnoreCase(name)) {
			rcv_act_d_no(value);
			return;
		}
		if ($rcv_act_no.equalsIgnoreCase(name)) {
			rcv_act_no(value);
			return;
		}
		if ($bill_mng_no.equalsIgnoreCase(name)) {
			bill_mng_no(value);
			return;
		}
		if ($bcst_cd.equalsIgnoreCase(name)) {
			bcst_cd(value);
			return;
		}
		if ($bill_dpt_cd.equalsIgnoreCase(name)) {
			bill_dpt_cd(value);
			return;
		}
		if ($acst_cd.equalsIgnoreCase(name)) {
			acst_cd(value);
			return;
		}
		if ($ar_dpt_cd.equalsIgnoreCase(name)) {
			ar_dpt_cd(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			iv_no(value);
			return;
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			wrk_no(value);
			return;
		}
		if ($ar_typ.equalsIgnoreCase(name)) {
			ar_typ(value);
			return;
		}
		if ($ar_sttl_cd1.equalsIgnoreCase(name)) {
			ar_sttl_cd1(value);
			return;
		}
		if ($ar_sttl_typ1.equalsIgnoreCase(name)) {
			ar_sttl_typ1(value);
			return;
		}
		if ($gen_rcv_no.equalsIgnoreCase(name)) {
			gen_rcv_no(value);
			return;
		}
		if ($bill_d_rmrks.equalsIgnoreCase(name)) {
			bill_d_rmrks(value);
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
		if ($rcv_act_d_seq.equalsIgnoreCase(name)) {
			rcv_act_d_seq(value);
			return;
		}
		if ($rcv_act_seq.equalsIgnoreCase(name)) {
			rcv_act_seq(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($trd_cur_amt1.equalsIgnoreCase(name)) {
			trd_cur_amt1(value);
			return;
		}
		if ($trd_cur_tax_amt1.equalsIgnoreCase(name)) {
			trd_cur_tax_amt1(value);
			return;
		}
		if ($trd_cur_amt2.equalsIgnoreCase(name)) {
			trd_cur_amt2(value);
			return;
		}
		if ($trd_cur_tax_amt2.equalsIgnoreCase(name)) {
			trd_cur_tax_amt2(value);
			return;
		}
		if ($trd_cur_amt3.equalsIgnoreCase(name)) {
			trd_cur_amt3(value);
			return;
		}
		if ($trd_cur_tax_amt3.equalsIgnoreCase(name)) {
			trd_cur_tax_amt3(value);
			return;
		}
		if ($base_cur_amt1.equalsIgnoreCase(name)) {
			base_cur_amt1(value);
			return;
		}
		if ($base_cur_tax_amt1.equalsIgnoreCase(name)) {
			base_cur_tax_amt1(value);
			return;
		}
		if ($base_cur_amt2.equalsIgnoreCase(name)) {
			base_cur_amt2(value);
			return;
		}
		if ($base_cur_tax_amt2.equalsIgnoreCase(name)) {
			base_cur_tax_amt2(value);
			return;
		}
		if ($base_cur_amt3.equalsIgnoreCase(name)) {
			base_cur_amt3(value);
			return;
		}
		if ($base_cur_tax_amt3.equalsIgnoreCase(name)) {
			base_cur_tax_amt3(value);
			return;
		}
		if ($trd_xrate.equalsIgnoreCase(name)) {
			trd_xrate(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, int value) {
		if ($rcv_act_d_seq.equalsIgnoreCase(name)) {
			rcv_act_d_seq(value);
			return;
		}
		if ($rcv_act_seq.equalsIgnoreCase(name)) {
			rcv_act_seq(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($trd_cur_amt1.equalsIgnoreCase(name)) {
			trd_cur_amt1(value);
			return;
		}
		if ($trd_cur_tax_amt1.equalsIgnoreCase(name)) {
			trd_cur_tax_amt1(value);
			return;
		}
		if ($trd_cur_amt2.equalsIgnoreCase(name)) {
			trd_cur_amt2(value);
			return;
		}
		if ($trd_cur_tax_amt2.equalsIgnoreCase(name)) {
			trd_cur_tax_amt2(value);
			return;
		}
		if ($trd_cur_amt3.equalsIgnoreCase(name)) {
			trd_cur_amt3(value);
			return;
		}
		if ($trd_cur_tax_amt3.equalsIgnoreCase(name)) {
			trd_cur_tax_amt3(value);
			return;
		}
		if ($base_cur_amt1.equalsIgnoreCase(name)) {
			base_cur_amt1(value);
			return;
		}
		if ($base_cur_tax_amt1.equalsIgnoreCase(name)) {
			base_cur_tax_amt1(value);
			return;
		}
		if ($base_cur_amt2.equalsIgnoreCase(name)) {
			base_cur_amt2(value);
			return;
		}
		if ($base_cur_tax_amt2.equalsIgnoreCase(name)) {
			base_cur_tax_amt2(value);
			return;
		}
		if ($base_cur_amt3.equalsIgnoreCase(name)) {
			base_cur_amt3(value);
			return;
		}
		if ($base_cur_tax_amt3.equalsIgnoreCase(name)) {
			base_cur_tax_amt3(value);
			return;
		}
		if ($trd_xrate.equalsIgnoreCase(name)) {
			trd_xrate(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, long value) {
		if ($rcv_act_d_seq.equalsIgnoreCase(name)) {
			rcv_act_d_seq(value);
			return;
		}
		if ($rcv_act_seq.equalsIgnoreCase(name)) {
			rcv_act_seq(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($trd_cur_amt1.equalsIgnoreCase(name)) {
			trd_cur_amt1(value);
			return;
		}
		if ($trd_cur_tax_amt1.equalsIgnoreCase(name)) {
			trd_cur_tax_amt1(value);
			return;
		}
		if ($trd_cur_amt2.equalsIgnoreCase(name)) {
			trd_cur_amt2(value);
			return;
		}
		if ($trd_cur_tax_amt2.equalsIgnoreCase(name)) {
			trd_cur_tax_amt2(value);
			return;
		}
		if ($trd_cur_amt3.equalsIgnoreCase(name)) {
			trd_cur_amt3(value);
			return;
		}
		if ($trd_cur_tax_amt3.equalsIgnoreCase(name)) {
			trd_cur_tax_amt3(value);
			return;
		}
		if ($base_cur_amt1.equalsIgnoreCase(name)) {
			base_cur_amt1(value);
			return;
		}
		if ($base_cur_tax_amt1.equalsIgnoreCase(name)) {
			base_cur_tax_amt1(value);
			return;
		}
		if ($base_cur_amt2.equalsIgnoreCase(name)) {
			base_cur_amt2(value);
			return;
		}
		if ($base_cur_tax_amt2.equalsIgnoreCase(name)) {
			base_cur_tax_amt2(value);
			return;
		}
		if ($base_cur_amt3.equalsIgnoreCase(name)) {
			base_cur_amt3(value);
			return;
		}
		if ($base_cur_tax_amt3.equalsIgnoreCase(name)) {
			base_cur_tax_amt3(value);
			return;
		}
		if ($trd_xrate.equalsIgnoreCase(name)) {
			trd_xrate(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, float value) {
		if ($rcv_act_d_seq.equalsIgnoreCase(name)) {
			rcv_act_d_seq(value);
			return;
		}
		if ($rcv_act_seq.equalsIgnoreCase(name)) {
			rcv_act_seq(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($trd_cur_amt1.equalsIgnoreCase(name)) {
			trd_cur_amt1(value);
			return;
		}
		if ($trd_cur_tax_amt1.equalsIgnoreCase(name)) {
			trd_cur_tax_amt1(value);
			return;
		}
		if ($trd_cur_amt2.equalsIgnoreCase(name)) {
			trd_cur_amt2(value);
			return;
		}
		if ($trd_cur_tax_amt2.equalsIgnoreCase(name)) {
			trd_cur_tax_amt2(value);
			return;
		}
		if ($trd_cur_amt3.equalsIgnoreCase(name)) {
			trd_cur_amt3(value);
			return;
		}
		if ($trd_cur_tax_amt3.equalsIgnoreCase(name)) {
			trd_cur_tax_amt3(value);
			return;
		}
		if ($base_cur_amt1.equalsIgnoreCase(name)) {
			base_cur_amt1(value);
			return;
		}
		if ($base_cur_tax_amt1.equalsIgnoreCase(name)) {
			base_cur_tax_amt1(value);
			return;
		}
		if ($base_cur_amt2.equalsIgnoreCase(name)) {
			base_cur_amt2(value);
			return;
		}
		if ($base_cur_tax_amt2.equalsIgnoreCase(name)) {
			base_cur_tax_amt2(value);
			return;
		}
		if ($base_cur_amt3.equalsIgnoreCase(name)) {
			base_cur_amt3(value);
			return;
		}
		if ($base_cur_tax_amt3.equalsIgnoreCase(name)) {
			base_cur_tax_amt3(value);
			return;
		}
		if ($trd_xrate.equalsIgnoreCase(name)) {
			trd_xrate(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, double value) {
		if ($rcv_act_d_seq.equalsIgnoreCase(name)) {
			rcv_act_d_seq(value);
			return;
		}
		if ($rcv_act_seq.equalsIgnoreCase(name)) {
			rcv_act_seq(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($trd_cur_amt1.equalsIgnoreCase(name)) {
			trd_cur_amt1(value);
			return;
		}
		if ($trd_cur_tax_amt1.equalsIgnoreCase(name)) {
			trd_cur_tax_amt1(value);
			return;
		}
		if ($trd_cur_amt2.equalsIgnoreCase(name)) {
			trd_cur_amt2(value);
			return;
		}
		if ($trd_cur_tax_amt2.equalsIgnoreCase(name)) {
			trd_cur_tax_amt2(value);
			return;
		}
		if ($trd_cur_amt3.equalsIgnoreCase(name)) {
			trd_cur_amt3(value);
			return;
		}
		if ($trd_cur_tax_amt3.equalsIgnoreCase(name)) {
			trd_cur_tax_amt3(value);
			return;
		}
		if ($base_cur_amt1.equalsIgnoreCase(name)) {
			base_cur_amt1(value);
			return;
		}
		if ($base_cur_tax_amt1.equalsIgnoreCase(name)) {
			base_cur_tax_amt1(value);
			return;
		}
		if ($base_cur_amt2.equalsIgnoreCase(name)) {
			base_cur_amt2(value);
			return;
		}
		if ($base_cur_tax_amt2.equalsIgnoreCase(name)) {
			base_cur_tax_amt2(value);
			return;
		}
		if ($base_cur_amt3.equalsIgnoreCase(name)) {
			base_cur_amt3(value);
			return;
		}
		if ($base_cur_tax_amt3.equalsIgnoreCase(name)) {
			base_cur_tax_amt3(value);
			return;
		}
		if ($trd_xrate.equalsIgnoreCase(name)) {
			trd_xrate(value);
			return;
		}
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

	public void setBooleanNE(String name, boolean value) {
		if ($appl_cmpl_flg.equalsIgnoreCase(name)) {
			appl_cmpl_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

}
