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
import mcframe.commonCore.meta.MCMeta;
import mcframe.commonCore.lang.MCDataType;
import mcframe.commonCore.lang.MCTimestamp;
import mcframe.serverCore.queryapi.MCDBContainer;
import mcframe.serverCore.queryapi.MCDBContainer.MCTableType;
import mcframe.serverCore.queryapi.IFMCSQL.MCPermColumn;
import mcframe.serverCore.queryapi.IFMCSQL.MCPermColumnInfo;
import mcframe.serverCore.queryapi.MCForeignInfo;

/**
 * "売掛先別請求 // Billing by AR customer"DBコンテナRowクラスです。<p>
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
 *  	<td>bill_acst_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>売掛別請求ＮＯ</td>
 *  	<td>Billing No. by AR customer</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>bill_mng_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>請求管理ＮＯ</td>
 *  	<td>Billing management No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>acst_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>売掛先ＣＤ</td>
 *  	<td>AR customer cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ar_dpt_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>債権部門ＣＤ</td>
 *  	<td>AR dept. cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
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
 *  	<td>ar_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>債権区分</td>
 *  	<td>AR type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>last_bill_amt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>前回請求額</td>
 *  	<td>Last billing amount</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>xfr_amt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>今回振込入金額</td>
 *  	<td>Current transfer payment received amount</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>note_amt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>今回手形入金額</td>
 *  	<td>Current notes payment received amount</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>cash_amt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>今回現金入金額</td>
 *  	<td>Current cash payment received amount</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>setoff_amt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>今回相殺額</td>
 *  	<td>Current offset amount</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>setoff_tax_amt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>今回相殺税額</td>
 *  	<td>Current offset tax amount</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sw_amt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>今回振替額</td>
 *  	<td>Current transfer amount</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>bfw_amt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>今回繰越額</td>
 *  	<td>Current carry-over amount</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sls_amt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>今回売上額</td>
 *  	<td>Current sales amount</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ret_amt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>今回返品額</td>
 *  	<td>Current return amount</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>dscnt_amt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>今回値引額</td>
 *  	<td>Current discount amount</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sw_to_amt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>今回振替額（振替先）</td>
 *  	<td>Current transfer amount (Transfer destination)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>tax_amt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>今回税額</td>
 *  	<td>Current tax amount</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>bill_amt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>今回請求額</td>
 *  	<td>Current billing amount</td>
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
public class MST_BILL_ACST_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.CO_VIEW;

	public static final String TABLE_NAME = "MST_BILL_ACST";

	public static final boolean EX_CTRL = true;
	
	public static final boolean LCL_TABLE = false;
	
	/**
	 * 売掛別請求ＮＯ. Billing No. by AR customer.<p>
	 *
	 */
	public static final String $bill_acst_no = "bill_acst_no";
	private static final MCPermColumnInfo _bill_acst_no = createColumnInfo("bill_acst_no");
	public final MCStringPermColumn bill_acst_no = createStringColumn(_bill_acst_no);
	
	/**
	 * 請求管理ＮＯ. Billing management No..<p>
	 *
	 */
	public static final String $bill_mng_no = "bill_mng_no";
	private static final MCPermColumnInfo _bill_mng_no = createColumnInfo("bill_mng_no");
	public final MCStringPermColumn bill_mng_no = createStringColumn(_bill_mng_no);
	
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
	 * 債権区分. AR type.<p>
	 *
	 */
	public static final String $ar_typ = "ar_typ";
	private static final MCPermColumnInfo _ar_typ = createColumnInfo("ar_typ");
	public final MCStringPermColumn ar_typ = createStringColumn(_ar_typ);
	
	/**
	 * 前回請求額. Last billing amount.<p>
	 *
	 */
	public static final String $last_bill_amt = "last_bill_amt";
	private static final MCPermColumnInfo _last_bill_amt = createColumnInfo("last_bill_amt");
	public final MCNumberPermColumn last_bill_amt = createNumberColumn(_last_bill_amt);
	
	/**
	 * 今回振込入金額. Current transfer payment received amount.<p>
	 *
	 */
	public static final String $xfr_amt = "xfr_amt";
	private static final MCPermColumnInfo _xfr_amt = createColumnInfo("xfr_amt");
	public final MCNumberPermColumn xfr_amt = createNumberColumn(_xfr_amt);
	
	/**
	 * 今回手形入金額. Current notes payment received amount.<p>
	 *
	 */
	public static final String $note_amt = "note_amt";
	private static final MCPermColumnInfo _note_amt = createColumnInfo("note_amt");
	public final MCNumberPermColumn note_amt = createNumberColumn(_note_amt);
	
	/**
	 * 今回現金入金額. Current cash payment received amount.<p>
	 *
	 */
	public static final String $cash_amt = "cash_amt";
	private static final MCPermColumnInfo _cash_amt = createColumnInfo("cash_amt");
	public final MCNumberPermColumn cash_amt = createNumberColumn(_cash_amt);
	
	/**
	 * 今回相殺額. Current offset amount.<p>
	 *
	 */
	public static final String $setoff_amt = "setoff_amt";
	private static final MCPermColumnInfo _setoff_amt = createColumnInfo("setoff_amt");
	public final MCNumberPermColumn setoff_amt = createNumberColumn(_setoff_amt);
	
	/**
	 * 今回相殺税額. Current offset tax amount.<p>
	 *
	 */
	public static final String $setoff_tax_amt = "setoff_tax_amt";
	private static final MCPermColumnInfo _setoff_tax_amt = createColumnInfo("setoff_tax_amt");
	public final MCNumberPermColumn setoff_tax_amt = createNumberColumn(_setoff_tax_amt);
	
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
	 * 今回売上額. Current sales amount.<p>
	 *
	 */
	public static final String $sls_amt = "sls_amt";
	private static final MCPermColumnInfo _sls_amt = createColumnInfo("sls_amt");
	public final MCNumberPermColumn sls_amt = createNumberColumn(_sls_amt);
	
	/**
	 * 今回返品額. Current return amount.<p>
	 *
	 */
	public static final String $ret_amt = "ret_amt";
	private static final MCPermColumnInfo _ret_amt = createColumnInfo("ret_amt");
	public final MCNumberPermColumn ret_amt = createNumberColumn(_ret_amt);
	
	/**
	 * 今回値引額. Current discount amount.<p>
	 *
	 */
	public static final String $dscnt_amt = "dscnt_amt";
	private static final MCPermColumnInfo _dscnt_amt = createColumnInfo("dscnt_amt");
	public final MCNumberPermColumn dscnt_amt = createNumberColumn(_dscnt_amt);
	
	/**
	 * 今回振替額（振替先）. Current transfer amount (Transfer destination).<p>
	 *
	 */
	public static final String $sw_to_amt = "sw_to_amt";
	private static final MCPermColumnInfo _sw_to_amt = createColumnInfo("sw_to_amt");
	public final MCNumberPermColumn sw_to_amt = createNumberColumn(_sw_to_amt);
	
	/**
	 * 今回税額. Current tax amount.<p>
	 *
	 */
	public static final String $tax_amt = "tax_amt";
	private static final MCPermColumnInfo _tax_amt = createColumnInfo("tax_amt");
	public final MCNumberPermColumn tax_amt = createNumberColumn(_tax_amt);
	
	/**
	 * 今回請求額. Current billing amount.<p>
	 *
	 */
	public static final String $bill_amt = "bill_amt";
	private static final MCPermColumnInfo _bill_amt = createColumnInfo("bill_amt");
	public final MCNumberPermColumn bill_amt = createNumberColumn(_bill_amt);
	
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
	
	public static final MCMeta bill_acst_no_META = createCommonMeta($bill_acst_no, mcframe.commonMA.meta.MA_META.BILL_ACST_NO);
	public static final MCMeta bill_mng_no_META = createCommonMeta($bill_mng_no, mcframe.commonMA.meta.MA_META.BILL_MNG_NO);
	public static final MCMeta acst_cd_META = createCommonMeta($acst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta ar_dpt_cd_META = createCommonMeta($ar_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta ar_typ_META = createCommonMeta($ar_typ, mcframe.commonMA.meta.MA_META.AR_TYP);
	public static final MCMeta last_bill_amt_META = createCommonMeta($last_bill_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta xfr_amt_META = createCommonMeta($xfr_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta note_amt_META = createCommonMeta($note_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta cash_amt_META = createCommonMeta($cash_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta setoff_amt_META = createCommonMeta($setoff_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta setoff_tax_amt_META = createCommonMeta($setoff_tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta sw_amt_META = createCommonMeta($sw_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta bfw_amt_META = createCommonMeta($bfw_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta sls_amt_META = createCommonMeta($sls_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta ret_amt_META = createCommonMeta($ret_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta dscnt_amt_META = createCommonMeta($dscnt_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta sw_to_amt_META = createCommonMeta($sw_to_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta tax_amt_META = createCommonMeta($tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta bill_amt_META = createCommonMeta($bill_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.BILL_ACST_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.BILL_ACST_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.BILL_ACST_SUB_CHAR3);
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
	public static final String $BILL1 = "BILL1";
	static {
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MST_BILL",
				$BILL1,
				new String[][]{
						{"bill_mng_no", "bill_mng_no"}
				},
				() -> {
					return mcframe.serverMS.dbc.MST_BILL_R.create("BILL1");
				},
				(alias) -> {
					MST_BILL_ACST_R own = MST_BILL_ACST_R.create(alias);
					mcframe.serverMS.dbc.MST_BILL_R ref = mcframe.serverMS.dbc.MST_BILL_R.create("BILL1");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.bill_mng_no.eq(ref.bill_mng_no));
					return cond;
				}
			)
		);
	}
	
	protected static final ConstMetaList<MST_BILL_ACST_R> constMetas = new ConstMetaList<MST_BILL_ACST_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			bill_acst_no_META,
			bill_mng_no_META,
			acst_cd_META,
			ar_dpt_cd_META,
			wg_cd_META,
			ar_typ_META,
			last_bill_amt_META,
			xfr_amt_META,
			note_amt_META,
			cash_amt_META,
			setoff_amt_META,
			setoff_tax_amt_META,
			sw_amt_META,
			bfw_amt_META,
			sls_amt_META,
			ret_amt_META,
			dscnt_amt_META,
			sw_to_amt_META,
			tax_amt_META,
			bill_amt_META,
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
	protected MST_BILL_ACST_R(ConstMetaList<? extends MST_BILL_ACST_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MST_BILL_ACST_R(ConstMetaList<? extends MST_BILL_ACST_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MST_BILL_ACST_R.$bill_acst_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_ACST_R.$bill_acst_no,
				"bill_acst_no",
				bill_acst_no,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_ACST_R.$bill_mng_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_ACST_R.$bill_mng_no,
				"bill_mng_no",
				bill_mng_no,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_ACST_R.$acst_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_ACST_R.$acst_cd,
				"acst_cd",
				acst_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_ACST_R.$ar_dpt_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_ACST_R.$ar_dpt_cd,
				"ar_dpt_cd",
				ar_dpt_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_ACST_R.$wg_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_ACST_R.$wg_cd,
				"wg_cd",
				wg_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_ACST_R.$ar_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_ACST_R.$ar_typ,
				"ar_typ",
				ar_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_ACST_R.$last_bill_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BILL_ACST_R.$last_bill_amt,
				"last_bill_amt",
				last_bill_amt,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_ACST_R.$xfr_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BILL_ACST_R.$xfr_amt,
				"xfr_amt",
				xfr_amt,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_ACST_R.$note_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BILL_ACST_R.$note_amt,
				"note_amt",
				note_amt,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_ACST_R.$cash_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BILL_ACST_R.$cash_amt,
				"cash_amt",
				cash_amt,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_ACST_R.$setoff_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BILL_ACST_R.$setoff_amt,
				"setoff_amt",
				setoff_amt,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_ACST_R.$setoff_tax_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BILL_ACST_R.$setoff_tax_amt,
				"setoff_tax_amt",
				setoff_tax_amt,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_ACST_R.$sw_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BILL_ACST_R.$sw_amt,
				"sw_amt",
				sw_amt,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_ACST_R.$bfw_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BILL_ACST_R.$bfw_amt,
				"bfw_amt",
				bfw_amt,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_ACST_R.$sls_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BILL_ACST_R.$sls_amt,
				"sls_amt",
				sls_amt,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_ACST_R.$ret_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BILL_ACST_R.$ret_amt,
				"ret_amt",
				ret_amt,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_ACST_R.$dscnt_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BILL_ACST_R.$dscnt_amt,
				"dscnt_amt",
				dscnt_amt,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_ACST_R.$sw_to_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BILL_ACST_R.$sw_to_amt,
				"sw_to_amt",
				sw_to_amt,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_ACST_R.$tax_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BILL_ACST_R.$tax_amt,
				"tax_amt",
				tax_amt,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_ACST_R.$bill_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BILL_ACST_R.$bill_amt,
				"bill_amt",
				bill_amt,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_ACST_R.$sub_char1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_ACST_R.$sub_char1,
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
			MST_BILL_ACST_R.$sub_char2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_ACST_R.$sub_char2,
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
			MST_BILL_ACST_R.$sub_char3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_ACST_R.$sub_char3,
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
			MST_BILL_ACST_R.$ins_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_ACST_R.$ins_usr_id,
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
			MST_BILL_ACST_R.$ins_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_ACST_R.$ins_usr_nm,
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
			MST_BILL_ACST_R.$ins_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MST_BILL_ACST_R.$ins_ts,
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
			MST_BILL_ACST_R.$ins_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_ACST_R.$ins_func_id,
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
			MST_BILL_ACST_R.$upd_cntr,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BILL_ACST_R.$upd_cntr,
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
			MST_BILL_ACST_R.$upd_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_ACST_R.$upd_usr_id,
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
			MST_BILL_ACST_R.$upd_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_ACST_R.$upd_usr_nm,
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
			MST_BILL_ACST_R.$upd_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MST_BILL_ACST_R.$upd_ts,
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
			MST_BILL_ACST_R.$upd_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_ACST_R.$upd_func_id,
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
			MST_BILL_ACST_R.$upd_srv_req_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_ACST_R.$upd_srv_req_no,
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
	public static MST_BILL_ACST_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MST_BILL_ACST_R create(String alias) {
		MST_BILL_ACST_R row = new MST_BILL_ACST_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MST_BILL_ACST_R createByName(T proto) {
		MST_BILL_ACST_R row = MST_BILL_ACST_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MST_BILL_ACST_R clone() {
		return (MST_BILL_ACST_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MST_BILL_ACST_R createInstance() {
		return (MST_BILL_ACST_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MST_BILL_ACST_R getValues(String... names) {
		return (MST_BILL_ACST_R) super.getValues(names);
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
	 public MSW_BILL_ACST_KEY_R getPkWorkDbc(String alias) {
	 	return MSW_BILL_ACST_KEY_R.create(alias);
	 }

	/*
	 * MCDBContainerのオーバーライドメソッドです。
	 */
	 public MSW_BILL_ACST_KEY_R getPkWorkDbc() {
	 	return getPkWorkDbc(MSW_BILL_ACST_KEY_R.TABLE_NAME);
	 }

	/**
	 * 売掛別請求ＮＯ. Billing No. by AR customer.<p>
	 *
	 */
	public String bill_acst_no() {
		return getConstString(offset + 0, $bill_acst_no);
	}

	/**
	 * 売掛別請求ＮＯ. Billing No. by AR customer.<p>
	 *
	 */
	public void bill_acst_no(String value) {
		setConstString(offset + 0, $bill_acst_no, value);
	}

	/**
	 * 請求管理ＮＯ. Billing management No..<p>
	 *
	 */
	public String bill_mng_no() {
		return getConstString(offset + 1, $bill_mng_no);
	}

	/**
	 * 請求管理ＮＯ. Billing management No..<p>
	 *
	 */
	public void bill_mng_no(String value) {
		setConstString(offset + 1, $bill_mng_no, value);
	}

	/**
	 * 売掛先ＣＤ. AR customer cd..<p>
	 *
	 */
	public String acst_cd() {
		return getConstString(offset + 2, $acst_cd);
	}

	/**
	 * 売掛先ＣＤ. AR customer cd..<p>
	 *
	 */
	public void acst_cd(String value) {
		setConstString(offset + 2, $acst_cd, value);
	}

	/**
	 * 債権部門ＣＤ. AR dept. cd..<p>
	 *
	 */
	public String ar_dpt_cd() {
		return getConstString(offset + 3, $ar_dpt_cd);
	}

	/**
	 * 債権部門ＣＤ. AR dept. cd..<p>
	 *
	 */
	public void ar_dpt_cd(String value) {
		setConstString(offset + 3, $ar_dpt_cd, value);
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
	 * 債権区分. AR type.<p>
	 *
	 */
	public String ar_typ() {
		return getConstString(offset + 5, $ar_typ);
	}

	/**
	 * 債権区分. AR type.<p>
	 *
	 */
	public void ar_typ(String value) {
		setConstString(offset + 5, $ar_typ, value);
	}

	/**
	 * 前回請求額. Last billing amount.<p>
	 *
	 */
	public MCNumber last_bill_amt() {
		return getConstNumber(offset + 6, $last_bill_amt);
	}

	/**
	 * 前回請求額. Last billing amount.<p>
	 *
	 */
	public void last_bill_amt(MCNumber value) {
		setConstNumber(offset + 6, $last_bill_amt, value);
	}
	
	/**
	 * 前回請求額. Last billing amount.<p>
	 *
	 */
	public void last_bill_amt(int value) {
		setConstNumber(offset + 6, $last_bill_amt, value);
	}
	
	/**
	 * 前回請求額. Last billing amount.<p>
	 *
	 */
	public void last_bill_amt(long value) {
		setConstNumber(offset + 6, $last_bill_amt, value);
	}
	
	/**
	 * 前回請求額. Last billing amount.<p>
	 *
	 */
	public void last_bill_amt(float value) {
		setConstNumber(offset + 6, $last_bill_amt, value);
	}
	
	/**
	 * 前回請求額. Last billing amount.<p>
	 *
	 */
	public void last_bill_amt(double value) {
		setConstNumber(offset + 6, $last_bill_amt, value);
	}
	
	/**
	 * 今回振込入金額. Current transfer payment received amount.<p>
	 *
	 */
	public MCNumber xfr_amt() {
		return getConstNumber(offset + 7, $xfr_amt);
	}

	/**
	 * 今回振込入金額. Current transfer payment received amount.<p>
	 *
	 */
	public void xfr_amt(MCNumber value) {
		setConstNumber(offset + 7, $xfr_amt, value);
	}
	
	/**
	 * 今回振込入金額. Current transfer payment received amount.<p>
	 *
	 */
	public void xfr_amt(int value) {
		setConstNumber(offset + 7, $xfr_amt, value);
	}
	
	/**
	 * 今回振込入金額. Current transfer payment received amount.<p>
	 *
	 */
	public void xfr_amt(long value) {
		setConstNumber(offset + 7, $xfr_amt, value);
	}
	
	/**
	 * 今回振込入金額. Current transfer payment received amount.<p>
	 *
	 */
	public void xfr_amt(float value) {
		setConstNumber(offset + 7, $xfr_amt, value);
	}
	
	/**
	 * 今回振込入金額. Current transfer payment received amount.<p>
	 *
	 */
	public void xfr_amt(double value) {
		setConstNumber(offset + 7, $xfr_amt, value);
	}
	
	/**
	 * 今回手形入金額. Current notes payment received amount.<p>
	 *
	 */
	public MCNumber note_amt() {
		return getConstNumber(offset + 8, $note_amt);
	}

	/**
	 * 今回手形入金額. Current notes payment received amount.<p>
	 *
	 */
	public void note_amt(MCNumber value) {
		setConstNumber(offset + 8, $note_amt, value);
	}
	
	/**
	 * 今回手形入金額. Current notes payment received amount.<p>
	 *
	 */
	public void note_amt(int value) {
		setConstNumber(offset + 8, $note_amt, value);
	}
	
	/**
	 * 今回手形入金額. Current notes payment received amount.<p>
	 *
	 */
	public void note_amt(long value) {
		setConstNumber(offset + 8, $note_amt, value);
	}
	
	/**
	 * 今回手形入金額. Current notes payment received amount.<p>
	 *
	 */
	public void note_amt(float value) {
		setConstNumber(offset + 8, $note_amt, value);
	}
	
	/**
	 * 今回手形入金額. Current notes payment received amount.<p>
	 *
	 */
	public void note_amt(double value) {
		setConstNumber(offset + 8, $note_amt, value);
	}
	
	/**
	 * 今回現金入金額. Current cash payment received amount.<p>
	 *
	 */
	public MCNumber cash_amt() {
		return getConstNumber(offset + 9, $cash_amt);
	}

	/**
	 * 今回現金入金額. Current cash payment received amount.<p>
	 *
	 */
	public void cash_amt(MCNumber value) {
		setConstNumber(offset + 9, $cash_amt, value);
	}
	
	/**
	 * 今回現金入金額. Current cash payment received amount.<p>
	 *
	 */
	public void cash_amt(int value) {
		setConstNumber(offset + 9, $cash_amt, value);
	}
	
	/**
	 * 今回現金入金額. Current cash payment received amount.<p>
	 *
	 */
	public void cash_amt(long value) {
		setConstNumber(offset + 9, $cash_amt, value);
	}
	
	/**
	 * 今回現金入金額. Current cash payment received amount.<p>
	 *
	 */
	public void cash_amt(float value) {
		setConstNumber(offset + 9, $cash_amt, value);
	}
	
	/**
	 * 今回現金入金額. Current cash payment received amount.<p>
	 *
	 */
	public void cash_amt(double value) {
		setConstNumber(offset + 9, $cash_amt, value);
	}
	
	/**
	 * 今回相殺額. Current offset amount.<p>
	 *
	 */
	public MCNumber setoff_amt() {
		return getConstNumber(offset + 10, $setoff_amt);
	}

	/**
	 * 今回相殺額. Current offset amount.<p>
	 *
	 */
	public void setoff_amt(MCNumber value) {
		setConstNumber(offset + 10, $setoff_amt, value);
	}
	
	/**
	 * 今回相殺額. Current offset amount.<p>
	 *
	 */
	public void setoff_amt(int value) {
		setConstNumber(offset + 10, $setoff_amt, value);
	}
	
	/**
	 * 今回相殺額. Current offset amount.<p>
	 *
	 */
	public void setoff_amt(long value) {
		setConstNumber(offset + 10, $setoff_amt, value);
	}
	
	/**
	 * 今回相殺額. Current offset amount.<p>
	 *
	 */
	public void setoff_amt(float value) {
		setConstNumber(offset + 10, $setoff_amt, value);
	}
	
	/**
	 * 今回相殺額. Current offset amount.<p>
	 *
	 */
	public void setoff_amt(double value) {
		setConstNumber(offset + 10, $setoff_amt, value);
	}
	
	/**
	 * 今回相殺税額. Current offset tax amount.<p>
	 *
	 */
	public MCNumber setoff_tax_amt() {
		return getConstNumber(offset + 11, $setoff_tax_amt);
	}

	/**
	 * 今回相殺税額. Current offset tax amount.<p>
	 *
	 */
	public void setoff_tax_amt(MCNumber value) {
		setConstNumber(offset + 11, $setoff_tax_amt, value);
	}
	
	/**
	 * 今回相殺税額. Current offset tax amount.<p>
	 *
	 */
	public void setoff_tax_amt(int value) {
		setConstNumber(offset + 11, $setoff_tax_amt, value);
	}
	
	/**
	 * 今回相殺税額. Current offset tax amount.<p>
	 *
	 */
	public void setoff_tax_amt(long value) {
		setConstNumber(offset + 11, $setoff_tax_amt, value);
	}
	
	/**
	 * 今回相殺税額. Current offset tax amount.<p>
	 *
	 */
	public void setoff_tax_amt(float value) {
		setConstNumber(offset + 11, $setoff_tax_amt, value);
	}
	
	/**
	 * 今回相殺税額. Current offset tax amount.<p>
	 *
	 */
	public void setoff_tax_amt(double value) {
		setConstNumber(offset + 11, $setoff_tax_amt, value);
	}
	
	/**
	 * 今回振替額. Current transfer amount.<p>
	 *
	 */
	public MCNumber sw_amt() {
		return getConstNumber(offset + 12, $sw_amt);
	}

	/**
	 * 今回振替額. Current transfer amount.<p>
	 *
	 */
	public void sw_amt(MCNumber value) {
		setConstNumber(offset + 12, $sw_amt, value);
	}
	
	/**
	 * 今回振替額. Current transfer amount.<p>
	 *
	 */
	public void sw_amt(int value) {
		setConstNumber(offset + 12, $sw_amt, value);
	}
	
	/**
	 * 今回振替額. Current transfer amount.<p>
	 *
	 */
	public void sw_amt(long value) {
		setConstNumber(offset + 12, $sw_amt, value);
	}
	
	/**
	 * 今回振替額. Current transfer amount.<p>
	 *
	 */
	public void sw_amt(float value) {
		setConstNumber(offset + 12, $sw_amt, value);
	}
	
	/**
	 * 今回振替額. Current transfer amount.<p>
	 *
	 */
	public void sw_amt(double value) {
		setConstNumber(offset + 12, $sw_amt, value);
	}
	
	/**
	 * 今回繰越額. Current carry-over amount.<p>
	 *
	 */
	public MCNumber bfw_amt() {
		return getConstNumber(offset + 13, $bfw_amt);
	}

	/**
	 * 今回繰越額. Current carry-over amount.<p>
	 *
	 */
	public void bfw_amt(MCNumber value) {
		setConstNumber(offset + 13, $bfw_amt, value);
	}
	
	/**
	 * 今回繰越額. Current carry-over amount.<p>
	 *
	 */
	public void bfw_amt(int value) {
		setConstNumber(offset + 13, $bfw_amt, value);
	}
	
	/**
	 * 今回繰越額. Current carry-over amount.<p>
	 *
	 */
	public void bfw_amt(long value) {
		setConstNumber(offset + 13, $bfw_amt, value);
	}
	
	/**
	 * 今回繰越額. Current carry-over amount.<p>
	 *
	 */
	public void bfw_amt(float value) {
		setConstNumber(offset + 13, $bfw_amt, value);
	}
	
	/**
	 * 今回繰越額. Current carry-over amount.<p>
	 *
	 */
	public void bfw_amt(double value) {
		setConstNumber(offset + 13, $bfw_amt, value);
	}
	
	/**
	 * 今回売上額. Current sales amount.<p>
	 *
	 */
	public MCNumber sls_amt() {
		return getConstNumber(offset + 14, $sls_amt);
	}

	/**
	 * 今回売上額. Current sales amount.<p>
	 *
	 */
	public void sls_amt(MCNumber value) {
		setConstNumber(offset + 14, $sls_amt, value);
	}
	
	/**
	 * 今回売上額. Current sales amount.<p>
	 *
	 */
	public void sls_amt(int value) {
		setConstNumber(offset + 14, $sls_amt, value);
	}
	
	/**
	 * 今回売上額. Current sales amount.<p>
	 *
	 */
	public void sls_amt(long value) {
		setConstNumber(offset + 14, $sls_amt, value);
	}
	
	/**
	 * 今回売上額. Current sales amount.<p>
	 *
	 */
	public void sls_amt(float value) {
		setConstNumber(offset + 14, $sls_amt, value);
	}
	
	/**
	 * 今回売上額. Current sales amount.<p>
	 *
	 */
	public void sls_amt(double value) {
		setConstNumber(offset + 14, $sls_amt, value);
	}
	
	/**
	 * 今回返品額. Current return amount.<p>
	 *
	 */
	public MCNumber ret_amt() {
		return getConstNumber(offset + 15, $ret_amt);
	}

	/**
	 * 今回返品額. Current return amount.<p>
	 *
	 */
	public void ret_amt(MCNumber value) {
		setConstNumber(offset + 15, $ret_amt, value);
	}
	
	/**
	 * 今回返品額. Current return amount.<p>
	 *
	 */
	public void ret_amt(int value) {
		setConstNumber(offset + 15, $ret_amt, value);
	}
	
	/**
	 * 今回返品額. Current return amount.<p>
	 *
	 */
	public void ret_amt(long value) {
		setConstNumber(offset + 15, $ret_amt, value);
	}
	
	/**
	 * 今回返品額. Current return amount.<p>
	 *
	 */
	public void ret_amt(float value) {
		setConstNumber(offset + 15, $ret_amt, value);
	}
	
	/**
	 * 今回返品額. Current return amount.<p>
	 *
	 */
	public void ret_amt(double value) {
		setConstNumber(offset + 15, $ret_amt, value);
	}
	
	/**
	 * 今回値引額. Current discount amount.<p>
	 *
	 */
	public MCNumber dscnt_amt() {
		return getConstNumber(offset + 16, $dscnt_amt);
	}

	/**
	 * 今回値引額. Current discount amount.<p>
	 *
	 */
	public void dscnt_amt(MCNumber value) {
		setConstNumber(offset + 16, $dscnt_amt, value);
	}
	
	/**
	 * 今回値引額. Current discount amount.<p>
	 *
	 */
	public void dscnt_amt(int value) {
		setConstNumber(offset + 16, $dscnt_amt, value);
	}
	
	/**
	 * 今回値引額. Current discount amount.<p>
	 *
	 */
	public void dscnt_amt(long value) {
		setConstNumber(offset + 16, $dscnt_amt, value);
	}
	
	/**
	 * 今回値引額. Current discount amount.<p>
	 *
	 */
	public void dscnt_amt(float value) {
		setConstNumber(offset + 16, $dscnt_amt, value);
	}
	
	/**
	 * 今回値引額. Current discount amount.<p>
	 *
	 */
	public void dscnt_amt(double value) {
		setConstNumber(offset + 16, $dscnt_amt, value);
	}
	
	/**
	 * 今回振替額（振替先）. Current transfer amount (Transfer destination).<p>
	 *
	 */
	public MCNumber sw_to_amt() {
		return getConstNumber(offset + 17, $sw_to_amt);
	}

	/**
	 * 今回振替額（振替先）. Current transfer amount (Transfer destination).<p>
	 *
	 */
	public void sw_to_amt(MCNumber value) {
		setConstNumber(offset + 17, $sw_to_amt, value);
	}
	
	/**
	 * 今回振替額（振替先）. Current transfer amount (Transfer destination).<p>
	 *
	 */
	public void sw_to_amt(int value) {
		setConstNumber(offset + 17, $sw_to_amt, value);
	}
	
	/**
	 * 今回振替額（振替先）. Current transfer amount (Transfer destination).<p>
	 *
	 */
	public void sw_to_amt(long value) {
		setConstNumber(offset + 17, $sw_to_amt, value);
	}
	
	/**
	 * 今回振替額（振替先）. Current transfer amount (Transfer destination).<p>
	 *
	 */
	public void sw_to_amt(float value) {
		setConstNumber(offset + 17, $sw_to_amt, value);
	}
	
	/**
	 * 今回振替額（振替先）. Current transfer amount (Transfer destination).<p>
	 *
	 */
	public void sw_to_amt(double value) {
		setConstNumber(offset + 17, $sw_to_amt, value);
	}
	
	/**
	 * 今回税額. Current tax amount.<p>
	 *
	 */
	public MCNumber tax_amt() {
		return getConstNumber(offset + 18, $tax_amt);
	}

	/**
	 * 今回税額. Current tax amount.<p>
	 *
	 */
	public void tax_amt(MCNumber value) {
		setConstNumber(offset + 18, $tax_amt, value);
	}
	
	/**
	 * 今回税額. Current tax amount.<p>
	 *
	 */
	public void tax_amt(int value) {
		setConstNumber(offset + 18, $tax_amt, value);
	}
	
	/**
	 * 今回税額. Current tax amount.<p>
	 *
	 */
	public void tax_amt(long value) {
		setConstNumber(offset + 18, $tax_amt, value);
	}
	
	/**
	 * 今回税額. Current tax amount.<p>
	 *
	 */
	public void tax_amt(float value) {
		setConstNumber(offset + 18, $tax_amt, value);
	}
	
	/**
	 * 今回税額. Current tax amount.<p>
	 *
	 */
	public void tax_amt(double value) {
		setConstNumber(offset + 18, $tax_amt, value);
	}
	
	/**
	 * 今回請求額. Current billing amount.<p>
	 *
	 */
	public MCNumber bill_amt() {
		return getConstNumber(offset + 19, $bill_amt);
	}

	/**
	 * 今回請求額. Current billing amount.<p>
	 *
	 */
	public void bill_amt(MCNumber value) {
		setConstNumber(offset + 19, $bill_amt, value);
	}
	
	/**
	 * 今回請求額. Current billing amount.<p>
	 *
	 */
	public void bill_amt(int value) {
		setConstNumber(offset + 19, $bill_amt, value);
	}
	
	/**
	 * 今回請求額. Current billing amount.<p>
	 *
	 */
	public void bill_amt(long value) {
		setConstNumber(offset + 19, $bill_amt, value);
	}
	
	/**
	 * 今回請求額. Current billing amount.<p>
	 *
	 */
	public void bill_amt(float value) {
		setConstNumber(offset + 19, $bill_amt, value);
	}
	
	/**
	 * 今回請求額. Current billing amount.<p>
	 *
	 */
	public void bill_amt(double value) {
		setConstNumber(offset + 19, $bill_amt, value);
	}
	
	/**
	 * 予備１. Spare 1.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 20, $sub_char1);
	}

	/**
	 * 予備１. Spare 1.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 20, $sub_char1, value);
	}

	/**
	 * 予備２. Spare 2.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 21, $sub_char2);
	}

	/**
	 * 予備２. Spare 2.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 21, $sub_char2, value);
	}

	/**
	 * 予備３. Spare 3.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 22, $sub_char3);
	}

	/**
	 * 予備３. Spare 3.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 22, $sub_char3, value);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 23, $ins_usr_id);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 23, $ins_usr_id, value);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 24, $ins_usr_nm);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 24, $ins_usr_nm, value);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 25, $ins_ts);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 25, $ins_ts, value);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 26, $ins_func_id);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 26, $ins_func_id, value);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 27, $upd_cntr);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 27, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 27, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 27, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 27, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 27, $upd_cntr, value);
	}
	
	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 28, $upd_usr_id);
	}

	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 28, $upd_usr_id, value);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 29, $upd_usr_nm);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 29, $upd_usr_nm, value);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 30, $upd_ts);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 30, $upd_ts, value);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 31, $upd_func_id);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 31, $upd_func_id, value);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 32, $upd_srv_req_no);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 32, $upd_srv_req_no, value);
	}

	public String getString(String name) {
		if ($bill_acst_no.equalsIgnoreCase(name)) {
			return bill_acst_no();
		}
		if ($bill_mng_no.equalsIgnoreCase(name)) {
			return bill_mng_no();
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
		if ($ar_typ.equalsIgnoreCase(name)) {
			return ar_typ();
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
		if ($last_bill_amt.equalsIgnoreCase(name)) {
			return last_bill_amt();
		}
		if ($xfr_amt.equalsIgnoreCase(name)) {
			return xfr_amt();
		}
		if ($note_amt.equalsIgnoreCase(name)) {
			return note_amt();
		}
		if ($cash_amt.equalsIgnoreCase(name)) {
			return cash_amt();
		}
		if ($setoff_amt.equalsIgnoreCase(name)) {
			return setoff_amt();
		}
		if ($setoff_tax_amt.equalsIgnoreCase(name)) {
			return setoff_tax_amt();
		}
		if ($sw_amt.equalsIgnoreCase(name)) {
			return sw_amt();
		}
		if ($bfw_amt.equalsIgnoreCase(name)) {
			return bfw_amt();
		}
		if ($sls_amt.equalsIgnoreCase(name)) {
			return sls_amt();
		}
		if ($ret_amt.equalsIgnoreCase(name)) {
			return ret_amt();
		}
		if ($dscnt_amt.equalsIgnoreCase(name)) {
			return dscnt_amt();
		}
		if ($sw_to_amt.equalsIgnoreCase(name)) {
			return sw_to_amt();
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			return tax_amt();
		}
		if ($bill_amt.equalsIgnoreCase(name)) {
			return bill_amt();
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

	public String getStringNE(String name) {
		if ($bill_acst_no.equalsIgnoreCase(name)) {
			return bill_acst_no();
		}
		if ($bill_mng_no.equalsIgnoreCase(name)) {
			return bill_mng_no();
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
		if ($ar_typ.equalsIgnoreCase(name)) {
			return ar_typ();
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
		if ($last_bill_amt.equalsIgnoreCase(name)) {
			return last_bill_amt();
		}
		if ($xfr_amt.equalsIgnoreCase(name)) {
			return xfr_amt();
		}
		if ($note_amt.equalsIgnoreCase(name)) {
			return note_amt();
		}
		if ($cash_amt.equalsIgnoreCase(name)) {
			return cash_amt();
		}
		if ($setoff_amt.equalsIgnoreCase(name)) {
			return setoff_amt();
		}
		if ($setoff_tax_amt.equalsIgnoreCase(name)) {
			return setoff_tax_amt();
		}
		if ($sw_amt.equalsIgnoreCase(name)) {
			return sw_amt();
		}
		if ($bfw_amt.equalsIgnoreCase(name)) {
			return bfw_amt();
		}
		if ($sls_amt.equalsIgnoreCase(name)) {
			return sls_amt();
		}
		if ($ret_amt.equalsIgnoreCase(name)) {
			return ret_amt();
		}
		if ($dscnt_amt.equalsIgnoreCase(name)) {
			return dscnt_amt();
		}
		if ($sw_to_amt.equalsIgnoreCase(name)) {
			return sw_to_amt();
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			return tax_amt();
		}
		if ($bill_amt.equalsIgnoreCase(name)) {
			return bill_amt();
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

	public void setString(String name, String value) {
		if ($bill_acst_no.equalsIgnoreCase(name)) {
			bill_acst_no(value);
			return;
		}
		if ($bill_mng_no.equalsIgnoreCase(name)) {
			bill_mng_no(value);
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
		if ($ar_typ.equalsIgnoreCase(name)) {
			ar_typ(value);
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
		if ($last_bill_amt.equalsIgnoreCase(name)) {
			last_bill_amt(value);
			return;
		}
		if ($xfr_amt.equalsIgnoreCase(name)) {
			xfr_amt(value);
			return;
		}
		if ($note_amt.equalsIgnoreCase(name)) {
			note_amt(value);
			return;
		}
		if ($cash_amt.equalsIgnoreCase(name)) {
			cash_amt(value);
			return;
		}
		if ($setoff_amt.equalsIgnoreCase(name)) {
			setoff_amt(value);
			return;
		}
		if ($setoff_tax_amt.equalsIgnoreCase(name)) {
			setoff_tax_amt(value);
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
		if ($sls_amt.equalsIgnoreCase(name)) {
			sls_amt(value);
			return;
		}
		if ($ret_amt.equalsIgnoreCase(name)) {
			ret_amt(value);
			return;
		}
		if ($dscnt_amt.equalsIgnoreCase(name)) {
			dscnt_amt(value);
			return;
		}
		if ($sw_to_amt.equalsIgnoreCase(name)) {
			sw_to_amt(value);
			return;
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			tax_amt(value);
			return;
		}
		if ($bill_amt.equalsIgnoreCase(name)) {
			bill_amt(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, int value) {
		if ($last_bill_amt.equalsIgnoreCase(name)) {
			last_bill_amt(value);
			return;
		}
		if ($xfr_amt.equalsIgnoreCase(name)) {
			xfr_amt(value);
			return;
		}
		if ($note_amt.equalsIgnoreCase(name)) {
			note_amt(value);
			return;
		}
		if ($cash_amt.equalsIgnoreCase(name)) {
			cash_amt(value);
			return;
		}
		if ($setoff_amt.equalsIgnoreCase(name)) {
			setoff_amt(value);
			return;
		}
		if ($setoff_tax_amt.equalsIgnoreCase(name)) {
			setoff_tax_amt(value);
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
		if ($sls_amt.equalsIgnoreCase(name)) {
			sls_amt(value);
			return;
		}
		if ($ret_amt.equalsIgnoreCase(name)) {
			ret_amt(value);
			return;
		}
		if ($dscnt_amt.equalsIgnoreCase(name)) {
			dscnt_amt(value);
			return;
		}
		if ($sw_to_amt.equalsIgnoreCase(name)) {
			sw_to_amt(value);
			return;
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			tax_amt(value);
			return;
		}
		if ($bill_amt.equalsIgnoreCase(name)) {
			bill_amt(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, long value) {
		if ($last_bill_amt.equalsIgnoreCase(name)) {
			last_bill_amt(value);
			return;
		}
		if ($xfr_amt.equalsIgnoreCase(name)) {
			xfr_amt(value);
			return;
		}
		if ($note_amt.equalsIgnoreCase(name)) {
			note_amt(value);
			return;
		}
		if ($cash_amt.equalsIgnoreCase(name)) {
			cash_amt(value);
			return;
		}
		if ($setoff_amt.equalsIgnoreCase(name)) {
			setoff_amt(value);
			return;
		}
		if ($setoff_tax_amt.equalsIgnoreCase(name)) {
			setoff_tax_amt(value);
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
		if ($sls_amt.equalsIgnoreCase(name)) {
			sls_amt(value);
			return;
		}
		if ($ret_amt.equalsIgnoreCase(name)) {
			ret_amt(value);
			return;
		}
		if ($dscnt_amt.equalsIgnoreCase(name)) {
			dscnt_amt(value);
			return;
		}
		if ($sw_to_amt.equalsIgnoreCase(name)) {
			sw_to_amt(value);
			return;
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			tax_amt(value);
			return;
		}
		if ($bill_amt.equalsIgnoreCase(name)) {
			bill_amt(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, float value) {
		if ($last_bill_amt.equalsIgnoreCase(name)) {
			last_bill_amt(value);
			return;
		}
		if ($xfr_amt.equalsIgnoreCase(name)) {
			xfr_amt(value);
			return;
		}
		if ($note_amt.equalsIgnoreCase(name)) {
			note_amt(value);
			return;
		}
		if ($cash_amt.equalsIgnoreCase(name)) {
			cash_amt(value);
			return;
		}
		if ($setoff_amt.equalsIgnoreCase(name)) {
			setoff_amt(value);
			return;
		}
		if ($setoff_tax_amt.equalsIgnoreCase(name)) {
			setoff_tax_amt(value);
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
		if ($sls_amt.equalsIgnoreCase(name)) {
			sls_amt(value);
			return;
		}
		if ($ret_amt.equalsIgnoreCase(name)) {
			ret_amt(value);
			return;
		}
		if ($dscnt_amt.equalsIgnoreCase(name)) {
			dscnt_amt(value);
			return;
		}
		if ($sw_to_amt.equalsIgnoreCase(name)) {
			sw_to_amt(value);
			return;
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			tax_amt(value);
			return;
		}
		if ($bill_amt.equalsIgnoreCase(name)) {
			bill_amt(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, double value) {
		if ($last_bill_amt.equalsIgnoreCase(name)) {
			last_bill_amt(value);
			return;
		}
		if ($xfr_amt.equalsIgnoreCase(name)) {
			xfr_amt(value);
			return;
		}
		if ($note_amt.equalsIgnoreCase(name)) {
			note_amt(value);
			return;
		}
		if ($cash_amt.equalsIgnoreCase(name)) {
			cash_amt(value);
			return;
		}
		if ($setoff_amt.equalsIgnoreCase(name)) {
			setoff_amt(value);
			return;
		}
		if ($setoff_tax_amt.equalsIgnoreCase(name)) {
			setoff_tax_amt(value);
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
		if ($sls_amt.equalsIgnoreCase(name)) {
			sls_amt(value);
			return;
		}
		if ($ret_amt.equalsIgnoreCase(name)) {
			ret_amt(value);
			return;
		}
		if ($dscnt_amt.equalsIgnoreCase(name)) {
			dscnt_amt(value);
			return;
		}
		if ($sw_to_amt.equalsIgnoreCase(name)) {
			sw_to_amt(value);
			return;
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			tax_amt(value);
			return;
		}
		if ($bill_amt.equalsIgnoreCase(name)) {
			bill_amt(value);
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

	public void setStringNE(String name, String value) {
		if ($bill_acst_no.equalsIgnoreCase(name)) {
			bill_acst_no(value);
			return;
		}
		if ($bill_mng_no.equalsIgnoreCase(name)) {
			bill_mng_no(value);
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
		if ($ar_typ.equalsIgnoreCase(name)) {
			ar_typ(value);
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
		if ($last_bill_amt.equalsIgnoreCase(name)) {
			last_bill_amt(value);
			return;
		}
		if ($xfr_amt.equalsIgnoreCase(name)) {
			xfr_amt(value);
			return;
		}
		if ($note_amt.equalsIgnoreCase(name)) {
			note_amt(value);
			return;
		}
		if ($cash_amt.equalsIgnoreCase(name)) {
			cash_amt(value);
			return;
		}
		if ($setoff_amt.equalsIgnoreCase(name)) {
			setoff_amt(value);
			return;
		}
		if ($setoff_tax_amt.equalsIgnoreCase(name)) {
			setoff_tax_amt(value);
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
		if ($sls_amt.equalsIgnoreCase(name)) {
			sls_amt(value);
			return;
		}
		if ($ret_amt.equalsIgnoreCase(name)) {
			ret_amt(value);
			return;
		}
		if ($dscnt_amt.equalsIgnoreCase(name)) {
			dscnt_amt(value);
			return;
		}
		if ($sw_to_amt.equalsIgnoreCase(name)) {
			sw_to_amt(value);
			return;
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			tax_amt(value);
			return;
		}
		if ($bill_amt.equalsIgnoreCase(name)) {
			bill_amt(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, int value) {
		if ($last_bill_amt.equalsIgnoreCase(name)) {
			last_bill_amt(value);
			return;
		}
		if ($xfr_amt.equalsIgnoreCase(name)) {
			xfr_amt(value);
			return;
		}
		if ($note_amt.equalsIgnoreCase(name)) {
			note_amt(value);
			return;
		}
		if ($cash_amt.equalsIgnoreCase(name)) {
			cash_amt(value);
			return;
		}
		if ($setoff_amt.equalsIgnoreCase(name)) {
			setoff_amt(value);
			return;
		}
		if ($setoff_tax_amt.equalsIgnoreCase(name)) {
			setoff_tax_amt(value);
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
		if ($sls_amt.equalsIgnoreCase(name)) {
			sls_amt(value);
			return;
		}
		if ($ret_amt.equalsIgnoreCase(name)) {
			ret_amt(value);
			return;
		}
		if ($dscnt_amt.equalsIgnoreCase(name)) {
			dscnt_amt(value);
			return;
		}
		if ($sw_to_amt.equalsIgnoreCase(name)) {
			sw_to_amt(value);
			return;
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			tax_amt(value);
			return;
		}
		if ($bill_amt.equalsIgnoreCase(name)) {
			bill_amt(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, long value) {
		if ($last_bill_amt.equalsIgnoreCase(name)) {
			last_bill_amt(value);
			return;
		}
		if ($xfr_amt.equalsIgnoreCase(name)) {
			xfr_amt(value);
			return;
		}
		if ($note_amt.equalsIgnoreCase(name)) {
			note_amt(value);
			return;
		}
		if ($cash_amt.equalsIgnoreCase(name)) {
			cash_amt(value);
			return;
		}
		if ($setoff_amt.equalsIgnoreCase(name)) {
			setoff_amt(value);
			return;
		}
		if ($setoff_tax_amt.equalsIgnoreCase(name)) {
			setoff_tax_amt(value);
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
		if ($sls_amt.equalsIgnoreCase(name)) {
			sls_amt(value);
			return;
		}
		if ($ret_amt.equalsIgnoreCase(name)) {
			ret_amt(value);
			return;
		}
		if ($dscnt_amt.equalsIgnoreCase(name)) {
			dscnt_amt(value);
			return;
		}
		if ($sw_to_amt.equalsIgnoreCase(name)) {
			sw_to_amt(value);
			return;
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			tax_amt(value);
			return;
		}
		if ($bill_amt.equalsIgnoreCase(name)) {
			bill_amt(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, float value) {
		if ($last_bill_amt.equalsIgnoreCase(name)) {
			last_bill_amt(value);
			return;
		}
		if ($xfr_amt.equalsIgnoreCase(name)) {
			xfr_amt(value);
			return;
		}
		if ($note_amt.equalsIgnoreCase(name)) {
			note_amt(value);
			return;
		}
		if ($cash_amt.equalsIgnoreCase(name)) {
			cash_amt(value);
			return;
		}
		if ($setoff_amt.equalsIgnoreCase(name)) {
			setoff_amt(value);
			return;
		}
		if ($setoff_tax_amt.equalsIgnoreCase(name)) {
			setoff_tax_amt(value);
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
		if ($sls_amt.equalsIgnoreCase(name)) {
			sls_amt(value);
			return;
		}
		if ($ret_amt.equalsIgnoreCase(name)) {
			ret_amt(value);
			return;
		}
		if ($dscnt_amt.equalsIgnoreCase(name)) {
			dscnt_amt(value);
			return;
		}
		if ($sw_to_amt.equalsIgnoreCase(name)) {
			sw_to_amt(value);
			return;
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			tax_amt(value);
			return;
		}
		if ($bill_amt.equalsIgnoreCase(name)) {
			bill_amt(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, double value) {
		if ($last_bill_amt.equalsIgnoreCase(name)) {
			last_bill_amt(value);
			return;
		}
		if ($xfr_amt.equalsIgnoreCase(name)) {
			xfr_amt(value);
			return;
		}
		if ($note_amt.equalsIgnoreCase(name)) {
			note_amt(value);
			return;
		}
		if ($cash_amt.equalsIgnoreCase(name)) {
			cash_amt(value);
			return;
		}
		if ($setoff_amt.equalsIgnoreCase(name)) {
			setoff_amt(value);
			return;
		}
		if ($setoff_tax_amt.equalsIgnoreCase(name)) {
			setoff_tax_amt(value);
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
		if ($sls_amt.equalsIgnoreCase(name)) {
			sls_amt(value);
			return;
		}
		if ($ret_amt.equalsIgnoreCase(name)) {
			ret_amt(value);
			return;
		}
		if ($dscnt_amt.equalsIgnoreCase(name)) {
			dscnt_amt(value);
			return;
		}
		if ($sw_to_amt.equalsIgnoreCase(name)) {
			sw_to_amt(value);
			return;
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			tax_amt(value);
			return;
		}
		if ($bill_amt.equalsIgnoreCase(name)) {
			bill_amt(value);
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

}
