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
import mcframe.commonCore.meta.MCMeta;
import mcframe.commonCore.lang.MCDataType;
import mcframe.commonCore.lang.MCTimestamp;
import mcframe.serverCore.queryapi.MCDBContainer;
import mcframe.serverCore.queryapi.MCDBContainer.MCTableType;
import mcframe.serverCore.queryapi.IFMCSQL.MCPermColumn;
import mcframe.serverCore.queryapi.IFMCSQL.MCPermColumnInfo;
import mcframe.serverCore.queryapi.MCForeignInfo;

/**
 * "ＺＯＨＯ販売予定ヘッダ // Zoho sales schedule header"DBコンテナRowクラスです。<p>
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
 *  	<td>zoho_sls_schd_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>ＺＯＨＯ販売予定ＮＯ</td>
 *  	<td>Zoho sales schedule No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>deal_cd</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>商談ＣＤ</td>
 *  	<td>Deal cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>deal_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>商談名</td>
 *  	<td>Deal name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>cst_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>得意先ＣＤ</td>
 *  	<td>Customer cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>dlv_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>納品先ＣＤ</td>
 *  	<td>Delivery destination cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>bcst_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>請求先ＣＤ</td>
 *  	<td>Billing customer cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sls_dpt_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>売上部門ＣＤ</td>
 *  	<td>Sales dept. cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sls_usr_cd</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>売上担当者ＣＤ</td>
 *  	<td>Sales PIC cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>prod_itm_cd</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>製品ＣＤ</td>
 *  	<td>Product item cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>prod_itm_sub1</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>製品枝番１</td>
 *  	<td>Product branch No. 1</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>prod_itm_sub2</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>製品枝番２</td>
 *  	<td>Product branch No. 2</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>prod_itm_sub3</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>製品枝番３</td>
 *  	<td>Product branch No. 3</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>mrkt_cd</td>
 *  	<td>C</td>
 *  	<td>2</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>市場ＣＤ</td>
 *  	<td>Market cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>dlv_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>納品先名</td>
 *  	<td>Delivery destination name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>dlv_addr1</td>
 *  	<td>C</td>
 *  	<td>250</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>納品先住所１</td>
 *  	<td>Address 1 (Delivery destination)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>dlv_addr2</td>
 *  	<td>C</td>
 *  	<td>250</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>納品先住所２</td>
 *  	<td>Address 2 (Delivery destination)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>dlv_tel</td>
 *  	<td>C</td>
 *  	<td>30</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>納品先ＴＥＬ</td>
 *  	<td>TEL (Delivery destination)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ord_dlv_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>注文書納期</td>
 *  	<td>Order delivery date</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>post_inst_sls_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>装備後売上日</td>
 *  	<td>Post-installation sales date</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>cur_cd</td>
 *  	<td>C</td>
 *  	<td>3</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>通貨ＣＤ</td>
 *  	<td>Currency cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>amt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>金額</td>
 *  	<td>Amount</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>数量</td>
 *  	<td>Quantity</td>
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
public class MST_ZOHO_SLS_SCHD_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.CO_VIEW;

	public static final String TABLE_NAME = "MST_ZOHO_SLS_SCHD";

	public static final boolean EX_CTRL = true;
	
	public static final boolean LCL_TABLE = false;
	
	/**
	 * ＺＯＨＯ販売予定ＮＯ. Zoho sales schedule No..<p>
	 *
	 */
	public static final String $zoho_sls_schd_no = "zoho_sls_schd_no";
	private static final MCPermColumnInfo _zoho_sls_schd_no = createColumnInfo("zoho_sls_schd_no");
	public final MCStringPermColumn zoho_sls_schd_no = createStringColumn(_zoho_sls_schd_no);
	
	/**
	 * 商談ＣＤ. Deal cd..<p>
	 *
	 */
	public static final String $deal_cd = "deal_cd";
	private static final MCPermColumnInfo _deal_cd = createColumnInfo("deal_cd");
	public final MCStringPermColumn deal_cd = createStringColumn(_deal_cd);
	
	/**
	 * 商談名. Deal name.<p>
	 *
	 */
	public static final String $deal_nm = "deal_nm";
	private static final MCPermColumnInfo _deal_nm = createColumnInfo("deal_nm");
	public final MCStringPermColumn deal_nm = createStringColumn(_deal_nm);
	
	/**
	 * 得意先ＣＤ. Customer cd..<p>
	 *
	 */
	public static final String $cst_cd = "cst_cd";
	private static final MCPermColumnInfo _cst_cd = createColumnInfo("cst_cd");
	public final MCStringPermColumn cst_cd = createStringColumn(_cst_cd);
	
	/**
	 * 納品先ＣＤ. Delivery destination cd..<p>
	 *
	 */
	public static final String $dlv_cd = "dlv_cd";
	private static final MCPermColumnInfo _dlv_cd = createColumnInfo("dlv_cd");
	public final MCStringPermColumn dlv_cd = createStringColumn(_dlv_cd);
	
	/**
	 * 請求先ＣＤ. Billing customer cd..<p>
	 *
	 */
	public static final String $bcst_cd = "bcst_cd";
	private static final MCPermColumnInfo _bcst_cd = createColumnInfo("bcst_cd");
	public final MCStringPermColumn bcst_cd = createStringColumn(_bcst_cd);
	
	/**
	 * 売上部門ＣＤ. Sales dept. cd..<p>
	 *
	 */
	public static final String $sls_dpt_cd = "sls_dpt_cd";
	private static final MCPermColumnInfo _sls_dpt_cd = createColumnInfo("sls_dpt_cd");
	public final MCStringPermColumn sls_dpt_cd = createStringColumn(_sls_dpt_cd);
	
	/**
	 * 売上担当者ＣＤ. Sales PIC cd..<p>
	 *
	 */
	public static final String $sls_usr_cd = "sls_usr_cd";
	private static final MCPermColumnInfo _sls_usr_cd = createColumnInfo("sls_usr_cd");
	public final MCStringPermColumn sls_usr_cd = createStringColumn(_sls_usr_cd);
	
	/**
	 * 製品ＣＤ. Product item cd..<p>
	 *
	 */
	public static final String $prod_itm_cd = "prod_itm_cd";
	private static final MCPermColumnInfo _prod_itm_cd = createColumnInfo("prod_itm_cd");
	public final MCStringPermColumn prod_itm_cd = createStringColumn(_prod_itm_cd);
	
	/**
	 * 製品枝番１. Product branch No. 1.<p>
	 *
	 */
	public static final String $prod_itm_sub1 = "prod_itm_sub1";
	private static final MCPermColumnInfo _prod_itm_sub1 = createColumnInfo("prod_itm_sub1");
	public final MCStringPermColumn prod_itm_sub1 = createStringColumn(_prod_itm_sub1);
	
	/**
	 * 製品枝番２. Product branch No. 2.<p>
	 *
	 */
	public static final String $prod_itm_sub2 = "prod_itm_sub2";
	private static final MCPermColumnInfo _prod_itm_sub2 = createColumnInfo("prod_itm_sub2");
	public final MCStringPermColumn prod_itm_sub2 = createStringColumn(_prod_itm_sub2);
	
	/**
	 * 製品枝番３. Product branch No. 3.<p>
	 *
	 */
	public static final String $prod_itm_sub3 = "prod_itm_sub3";
	private static final MCPermColumnInfo _prod_itm_sub3 = createColumnInfo("prod_itm_sub3");
	public final MCStringPermColumn prod_itm_sub3 = createStringColumn(_prod_itm_sub3);
	
	/**
	 * 市場ＣＤ. Market cd..<p>
	 *
	 */
	public static final String $mrkt_cd = "mrkt_cd";
	private static final MCPermColumnInfo _mrkt_cd = createColumnInfo("mrkt_cd");
	public final MCStringPermColumn mrkt_cd = createStringColumn(_mrkt_cd);
	
	/**
	 * 納品先名. Delivery destination name.<p>
	 *
	 */
	public static final String $dlv_nm = "dlv_nm";
	private static final MCPermColumnInfo _dlv_nm = createColumnInfo("dlv_nm");
	public final MCStringPermColumn dlv_nm = createStringColumn(_dlv_nm);
	
	/**
	 * 納品先住所１. Address 1 (Delivery destination).<p>
	 *
	 */
	public static final String $dlv_addr1 = "dlv_addr1";
	private static final MCPermColumnInfo _dlv_addr1 = createColumnInfo("dlv_addr1");
	public final MCStringPermColumn dlv_addr1 = createStringColumn(_dlv_addr1);
	
	/**
	 * 納品先住所２. Address 2 (Delivery destination).<p>
	 *
	 */
	public static final String $dlv_addr2 = "dlv_addr2";
	private static final MCPermColumnInfo _dlv_addr2 = createColumnInfo("dlv_addr2");
	public final MCStringPermColumn dlv_addr2 = createStringColumn(_dlv_addr2);
	
	/**
	 * 納品先ＴＥＬ. TEL (Delivery destination).<p>
	 *
	 */
	public static final String $dlv_tel = "dlv_tel";
	private static final MCPermColumnInfo _dlv_tel = createColumnInfo("dlv_tel");
	public final MCStringPermColumn dlv_tel = createStringColumn(_dlv_tel);
	
	/**
	 * 注文書納期. Order delivery date.<p>
	 *
	 */
	public static final String $ord_dlv_dt = "ord_dlv_dt";
	private static final MCPermColumnInfo _ord_dlv_dt = createColumnInfo("ord_dlv_dt");
	public final MCDatePermColumn ord_dlv_dt = createDateColumn(_ord_dlv_dt);
	
	/**
	 * 装備後売上日. Post-installation sales date.<p>
	 *
	 */
	public static final String $post_inst_sls_dt = "post_inst_sls_dt";
	private static final MCPermColumnInfo _post_inst_sls_dt = createColumnInfo("post_inst_sls_dt");
	public final MCDatePermColumn post_inst_sls_dt = createDateColumn(_post_inst_sls_dt);
	
	/**
	 * 通貨ＣＤ. Currency cd..<p>
	 *
	 */
	public static final String $cur_cd = "cur_cd";
	private static final MCPermColumnInfo _cur_cd = createColumnInfo("cur_cd");
	public final MCStringPermColumn cur_cd = createStringColumn(_cur_cd);
	
	/**
	 * 金額. Amount.<p>
	 *
	 */
	public static final String $amt = "amt";
	private static final MCPermColumnInfo _amt = createColumnInfo("amt");
	public final MCNumberPermColumn amt = createNumberColumn(_amt);
	
	/**
	 * 数量. Quantity.<p>
	 *
	 */
	public static final String $qty = "qty";
	private static final MCPermColumnInfo _qty = createColumnInfo("qty");
	public final MCNumberPermColumn qty = createNumberColumn(_qty);
	
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
	
	public static final MCMeta zoho_sls_schd_no_META = createCommonMeta($zoho_sls_schd_no, mcframe.commonMA.meta.MA_META.ZOHO_SLS_SCHD_NO);
	public static final MCMeta deal_cd_META = createCommonMeta($deal_cd, mcframe.commonMA.meta.MA_META.DEAL_CD);
	public static final MCMeta deal_nm_META = createCommonMeta($deal_nm, mcframe.commonMA.meta.MA_META.DEAL_NM);
	public static final MCMeta cst_cd_META = createCommonMeta($cst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta dlv_cd_META = createCommonMeta($dlv_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta bcst_cd_META = createCommonMeta($bcst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta sls_dpt_cd_META = createCommonMeta($sls_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta sls_usr_cd_META = createCommonMeta($sls_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta prod_itm_cd_META = createCommonMeta($prod_itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta prod_itm_sub1_META = createCommonMeta($prod_itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta prod_itm_sub2_META = createCommonMeta($prod_itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta prod_itm_sub3_META = createCommonMeta($prod_itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta mrkt_cd_META = createCommonMeta($mrkt_cd, mcframe.commonMA.meta.MA_META.MRKT_CD);
	public static final MCMeta dlv_nm_META = createCommonMeta($dlv_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta dlv_addr1_META = createCommonMeta($dlv_addr1, mcframe.commonMA.meta.MA_META.ADDR1);
	public static final MCMeta dlv_addr2_META = createCommonMeta($dlv_addr2, mcframe.commonMA.meta.MA_META.ADDR2);
	public static final MCMeta dlv_tel_META = createCommonMeta($dlv_tel, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta ord_dlv_dt_META = createCommonMeta($ord_dlv_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta post_inst_sls_dt_META = createCommonMeta($post_inst_sls_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta cur_cd_META = createCommonMeta($cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta amt_META = createCommonMeta($amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta qty_META = createCommonMeta($qty, mcframe.commonMA.meta.MA_META.QTY);
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
	
	protected static final ConstMetaList<MST_ZOHO_SLS_SCHD_R> constMetas = new ConstMetaList<MST_ZOHO_SLS_SCHD_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			zoho_sls_schd_no_META,
			deal_cd_META,
			deal_nm_META,
			cst_cd_META,
			dlv_cd_META,
			bcst_cd_META,
			sls_dpt_cd_META,
			sls_usr_cd_META,
			prod_itm_cd_META,
			prod_itm_sub1_META,
			prod_itm_sub2_META,
			prod_itm_sub3_META,
			mrkt_cd_META,
			dlv_nm_META,
			dlv_addr1_META,
			dlv_addr2_META,
			dlv_tel_META,
			ord_dlv_dt_META,
			post_inst_sls_dt_META,
			cur_cd_META,
			amt_META,
			qty_META,
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
	protected MST_ZOHO_SLS_SCHD_R(ConstMetaList<? extends MST_ZOHO_SLS_SCHD_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MST_ZOHO_SLS_SCHD_R(ConstMetaList<? extends MST_ZOHO_SLS_SCHD_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MST_ZOHO_SLS_SCHD_R.$zoho_sls_schd_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ZOHO_SLS_SCHD_R.$zoho_sls_schd_no,
				"zoho_sls_schd_no",
				zoho_sls_schd_no,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ZOHO_SLS_SCHD_R.$deal_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ZOHO_SLS_SCHD_R.$deal_cd,
				"deal_cd",
				deal_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ZOHO_SLS_SCHD_R.$deal_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ZOHO_SLS_SCHD_R.$deal_nm,
				"deal_nm",
				deal_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ZOHO_SLS_SCHD_R.$cst_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ZOHO_SLS_SCHD_R.$cst_cd,
				"cst_cd",
				cst_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ZOHO_SLS_SCHD_R.$dlv_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ZOHO_SLS_SCHD_R.$dlv_cd,
				"dlv_cd",
				dlv_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ZOHO_SLS_SCHD_R.$bcst_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ZOHO_SLS_SCHD_R.$bcst_cd,
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
			MST_ZOHO_SLS_SCHD_R.$sls_dpt_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ZOHO_SLS_SCHD_R.$sls_dpt_cd,
				"sls_dpt_cd",
				sls_dpt_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ZOHO_SLS_SCHD_R.$sls_usr_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ZOHO_SLS_SCHD_R.$sls_usr_cd,
				"sls_usr_cd",
				sls_usr_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ZOHO_SLS_SCHD_R.$prod_itm_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ZOHO_SLS_SCHD_R.$prod_itm_cd,
				"prod_itm_cd",
				prod_itm_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ZOHO_SLS_SCHD_R.$prod_itm_sub1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ZOHO_SLS_SCHD_R.$prod_itm_sub1,
				"prod_itm_sub1",
				prod_itm_sub1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ZOHO_SLS_SCHD_R.$prod_itm_sub2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ZOHO_SLS_SCHD_R.$prod_itm_sub2,
				"prod_itm_sub2",
				prod_itm_sub2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ZOHO_SLS_SCHD_R.$prod_itm_sub3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ZOHO_SLS_SCHD_R.$prod_itm_sub3,
				"prod_itm_sub3",
				prod_itm_sub3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ZOHO_SLS_SCHD_R.$mrkt_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ZOHO_SLS_SCHD_R.$mrkt_cd,
				"mrkt_cd",
				mrkt_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ZOHO_SLS_SCHD_R.$dlv_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ZOHO_SLS_SCHD_R.$dlv_nm,
				"dlv_nm",
				dlv_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ZOHO_SLS_SCHD_R.$dlv_addr1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ZOHO_SLS_SCHD_R.$dlv_addr1,
				"dlv_addr1",
				dlv_addr1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ZOHO_SLS_SCHD_R.$dlv_addr2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ZOHO_SLS_SCHD_R.$dlv_addr2,
				"dlv_addr2",
				dlv_addr2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ZOHO_SLS_SCHD_R.$dlv_tel,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ZOHO_SLS_SCHD_R.$dlv_tel,
				"dlv_tel",
				dlv_tel,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ZOHO_SLS_SCHD_R.$ord_dlv_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_ZOHO_SLS_SCHD_R.$ord_dlv_dt,
				"ord_dlv_dt",
				ord_dlv_dt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ZOHO_SLS_SCHD_R.$post_inst_sls_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_ZOHO_SLS_SCHD_R.$post_inst_sls_dt,
				"post_inst_sls_dt",
				post_inst_sls_dt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ZOHO_SLS_SCHD_R.$cur_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ZOHO_SLS_SCHD_R.$cur_cd,
				"cur_cd",
				cur_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ZOHO_SLS_SCHD_R.$amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_ZOHO_SLS_SCHD_R.$amt,
				"amt",
				amt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ZOHO_SLS_SCHD_R.$qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_ZOHO_SLS_SCHD_R.$qty,
				"qty",
				qty,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ZOHO_SLS_SCHD_R.$ins_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ZOHO_SLS_SCHD_R.$ins_usr_id,
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
			MST_ZOHO_SLS_SCHD_R.$ins_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ZOHO_SLS_SCHD_R.$ins_usr_nm,
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
			MST_ZOHO_SLS_SCHD_R.$ins_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MST_ZOHO_SLS_SCHD_R.$ins_ts,
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
			MST_ZOHO_SLS_SCHD_R.$ins_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ZOHO_SLS_SCHD_R.$ins_func_id,
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
			MST_ZOHO_SLS_SCHD_R.$upd_cntr,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_ZOHO_SLS_SCHD_R.$upd_cntr,
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
			MST_ZOHO_SLS_SCHD_R.$upd_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ZOHO_SLS_SCHD_R.$upd_usr_id,
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
			MST_ZOHO_SLS_SCHD_R.$upd_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ZOHO_SLS_SCHD_R.$upd_usr_nm,
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
			MST_ZOHO_SLS_SCHD_R.$upd_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MST_ZOHO_SLS_SCHD_R.$upd_ts,
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
			MST_ZOHO_SLS_SCHD_R.$upd_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ZOHO_SLS_SCHD_R.$upd_func_id,
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
			MST_ZOHO_SLS_SCHD_R.$upd_srv_req_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ZOHO_SLS_SCHD_R.$upd_srv_req_no,
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
	public static MST_ZOHO_SLS_SCHD_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MST_ZOHO_SLS_SCHD_R create(String alias) {
		MST_ZOHO_SLS_SCHD_R row = new MST_ZOHO_SLS_SCHD_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MST_ZOHO_SLS_SCHD_R createByName(T proto) {
		MST_ZOHO_SLS_SCHD_R row = MST_ZOHO_SLS_SCHD_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MST_ZOHO_SLS_SCHD_R clone() {
		return (MST_ZOHO_SLS_SCHD_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MST_ZOHO_SLS_SCHD_R createInstance() {
		return (MST_ZOHO_SLS_SCHD_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MST_ZOHO_SLS_SCHD_R getValues(String... names) {
		return (MST_ZOHO_SLS_SCHD_R) super.getValues(names);
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
	 public MSW_ZOHO_SLS_SCHD_KEY_R getPkWorkDbc(String alias) {
	 	return MSW_ZOHO_SLS_SCHD_KEY_R.create(alias);
	 }

	/*
	 * MCDBContainerのオーバーライドメソッドです。
	 */
	 public MSW_ZOHO_SLS_SCHD_KEY_R getPkWorkDbc() {
	 	return getPkWorkDbc(MSW_ZOHO_SLS_SCHD_KEY_R.TABLE_NAME);
	 }

	/**
	 * ＺＯＨＯ販売予定ＮＯ. Zoho sales schedule No..<p>
	 *
	 */
	public String zoho_sls_schd_no() {
		return getConstString(offset + 0, $zoho_sls_schd_no);
	}

	/**
	 * ＺＯＨＯ販売予定ＮＯ. Zoho sales schedule No..<p>
	 *
	 */
	public void zoho_sls_schd_no(String value) {
		setConstString(offset + 0, $zoho_sls_schd_no, value);
	}

	/**
	 * 商談ＣＤ. Deal cd..<p>
	 *
	 */
	public String deal_cd() {
		return getConstString(offset + 1, $deal_cd);
	}

	/**
	 * 商談ＣＤ. Deal cd..<p>
	 *
	 */
	public void deal_cd(String value) {
		setConstString(offset + 1, $deal_cd, value);
	}

	/**
	 * 商談名. Deal name.<p>
	 *
	 */
	public String deal_nm() {
		return getConstString(offset + 2, $deal_nm);
	}

	/**
	 * 商談名. Deal name.<p>
	 *
	 */
	public void deal_nm(String value) {
		setConstString(offset + 2, $deal_nm, value);
	}

	/**
	 * 得意先ＣＤ. Customer cd..<p>
	 *
	 */
	public String cst_cd() {
		return getConstString(offset + 3, $cst_cd);
	}

	/**
	 * 得意先ＣＤ. Customer cd..<p>
	 *
	 */
	public void cst_cd(String value) {
		setConstString(offset + 3, $cst_cd, value);
	}

	/**
	 * 納品先ＣＤ. Delivery destination cd..<p>
	 *
	 */
	public String dlv_cd() {
		return getConstString(offset + 4, $dlv_cd);
	}

	/**
	 * 納品先ＣＤ. Delivery destination cd..<p>
	 *
	 */
	public void dlv_cd(String value) {
		setConstString(offset + 4, $dlv_cd, value);
	}

	/**
	 * 請求先ＣＤ. Billing customer cd..<p>
	 *
	 */
	public String bcst_cd() {
		return getConstString(offset + 5, $bcst_cd);
	}

	/**
	 * 請求先ＣＤ. Billing customer cd..<p>
	 *
	 */
	public void bcst_cd(String value) {
		setConstString(offset + 5, $bcst_cd, value);
	}

	/**
	 * 売上部門ＣＤ. Sales dept. cd..<p>
	 *
	 */
	public String sls_dpt_cd() {
		return getConstString(offset + 6, $sls_dpt_cd);
	}

	/**
	 * 売上部門ＣＤ. Sales dept. cd..<p>
	 *
	 */
	public void sls_dpt_cd(String value) {
		setConstString(offset + 6, $sls_dpt_cd, value);
	}

	/**
	 * 売上担当者ＣＤ. Sales PIC cd..<p>
	 *
	 */
	public String sls_usr_cd() {
		return getConstString(offset + 7, $sls_usr_cd);
	}

	/**
	 * 売上担当者ＣＤ. Sales PIC cd..<p>
	 *
	 */
	public void sls_usr_cd(String value) {
		setConstString(offset + 7, $sls_usr_cd, value);
	}

	/**
	 * 製品ＣＤ. Product item cd..<p>
	 *
	 */
	public String prod_itm_cd() {
		return getConstString(offset + 8, $prod_itm_cd);
	}

	/**
	 * 製品ＣＤ. Product item cd..<p>
	 *
	 */
	public void prod_itm_cd(String value) {
		setConstString(offset + 8, $prod_itm_cd, value);
	}

	/**
	 * 製品枝番１. Product branch No. 1.<p>
	 *
	 */
	public String prod_itm_sub1() {
		return getConstString(offset + 9, $prod_itm_sub1);
	}

	/**
	 * 製品枝番１. Product branch No. 1.<p>
	 *
	 */
	public void prod_itm_sub1(String value) {
		setConstString(offset + 9, $prod_itm_sub1, value);
	}

	/**
	 * 製品枝番２. Product branch No. 2.<p>
	 *
	 */
	public String prod_itm_sub2() {
		return getConstString(offset + 10, $prod_itm_sub2);
	}

	/**
	 * 製品枝番２. Product branch No. 2.<p>
	 *
	 */
	public void prod_itm_sub2(String value) {
		setConstString(offset + 10, $prod_itm_sub2, value);
	}

	/**
	 * 製品枝番３. Product branch No. 3.<p>
	 *
	 */
	public String prod_itm_sub3() {
		return getConstString(offset + 11, $prod_itm_sub3);
	}

	/**
	 * 製品枝番３. Product branch No. 3.<p>
	 *
	 */
	public void prod_itm_sub3(String value) {
		setConstString(offset + 11, $prod_itm_sub3, value);
	}

	/**
	 * 市場ＣＤ. Market cd..<p>
	 *
	 */
	public String mrkt_cd() {
		return getConstString(offset + 12, $mrkt_cd);
	}

	/**
	 * 市場ＣＤ. Market cd..<p>
	 *
	 */
	public void mrkt_cd(String value) {
		setConstString(offset + 12, $mrkt_cd, value);
	}

	/**
	 * 納品先名. Delivery destination name.<p>
	 *
	 */
	public String dlv_nm() {
		return getConstString(offset + 13, $dlv_nm);
	}

	/**
	 * 納品先名. Delivery destination name.<p>
	 *
	 */
	public void dlv_nm(String value) {
		setConstString(offset + 13, $dlv_nm, value);
	}

	/**
	 * 納品先住所１. Address 1 (Delivery destination).<p>
	 *
	 */
	public String dlv_addr1() {
		return getConstString(offset + 14, $dlv_addr1);
	}

	/**
	 * 納品先住所１. Address 1 (Delivery destination).<p>
	 *
	 */
	public void dlv_addr1(String value) {
		setConstString(offset + 14, $dlv_addr1, value);
	}

	/**
	 * 納品先住所２. Address 2 (Delivery destination).<p>
	 *
	 */
	public String dlv_addr2() {
		return getConstString(offset + 15, $dlv_addr2);
	}

	/**
	 * 納品先住所２. Address 2 (Delivery destination).<p>
	 *
	 */
	public void dlv_addr2(String value) {
		setConstString(offset + 15, $dlv_addr2, value);
	}

	/**
	 * 納品先ＴＥＬ. TEL (Delivery destination).<p>
	 *
	 */
	public String dlv_tel() {
		return getConstString(offset + 16, $dlv_tel);
	}

	/**
	 * 納品先ＴＥＬ. TEL (Delivery destination).<p>
	 *
	 */
	public void dlv_tel(String value) {
		setConstString(offset + 16, $dlv_tel, value);
	}

	/**
	 * 注文書納期. Order delivery date.<p>
	 *
	 */
	public MCDate ord_dlv_dt() {
		return getConstDate(offset + 17, $ord_dlv_dt);
	}

	/**
	 * 注文書納期. Order delivery date.<p>
	 *
	 */
	public void ord_dlv_dt(MCDate value) {
		setConstDate(offset + 17, $ord_dlv_dt, value);
	}

	/**
	 * 装備後売上日. Post-installation sales date.<p>
	 *
	 */
	public MCDate post_inst_sls_dt() {
		return getConstDate(offset + 18, $post_inst_sls_dt);
	}

	/**
	 * 装備後売上日. Post-installation sales date.<p>
	 *
	 */
	public void post_inst_sls_dt(MCDate value) {
		setConstDate(offset + 18, $post_inst_sls_dt, value);
	}

	/**
	 * 通貨ＣＤ. Currency cd..<p>
	 *
	 */
	public String cur_cd() {
		return getConstString(offset + 19, $cur_cd);
	}

	/**
	 * 通貨ＣＤ. Currency cd..<p>
	 *
	 */
	public void cur_cd(String value) {
		setConstString(offset + 19, $cur_cd, value);
	}

	/**
	 * 金額. Amount.<p>
	 *
	 */
	public MCNumber amt() {
		return getConstNumber(offset + 20, $amt);
	}

	/**
	 * 金額. Amount.<p>
	 *
	 */
	public void amt(MCNumber value) {
		setConstNumber(offset + 20, $amt, value);
	}
	
	/**
	 * 金額. Amount.<p>
	 *
	 */
	public void amt(int value) {
		setConstNumber(offset + 20, $amt, value);
	}
	
	/**
	 * 金額. Amount.<p>
	 *
	 */
	public void amt(long value) {
		setConstNumber(offset + 20, $amt, value);
	}
	
	/**
	 * 金額. Amount.<p>
	 *
	 */
	public void amt(float value) {
		setConstNumber(offset + 20, $amt, value);
	}
	
	/**
	 * 金額. Amount.<p>
	 *
	 */
	public void amt(double value) {
		setConstNumber(offset + 20, $amt, value);
	}
	
	/**
	 * 数量. Quantity.<p>
	 *
	 */
	public MCNumber qty() {
		return getConstNumber(offset + 21, $qty);
	}

	/**
	 * 数量. Quantity.<p>
	 *
	 */
	public void qty(MCNumber value) {
		setConstNumber(offset + 21, $qty, value);
	}
	
	/**
	 * 数量. Quantity.<p>
	 *
	 */
	public void qty(int value) {
		setConstNumber(offset + 21, $qty, value);
	}
	
	/**
	 * 数量. Quantity.<p>
	 *
	 */
	public void qty(long value) {
		setConstNumber(offset + 21, $qty, value);
	}
	
	/**
	 * 数量. Quantity.<p>
	 *
	 */
	public void qty(float value) {
		setConstNumber(offset + 21, $qty, value);
	}
	
	/**
	 * 数量. Quantity.<p>
	 *
	 */
	public void qty(double value) {
		setConstNumber(offset + 21, $qty, value);
	}
	
	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 22, $ins_usr_id);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 22, $ins_usr_id, value);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 23, $ins_usr_nm);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 23, $ins_usr_nm, value);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 24, $ins_ts);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 24, $ins_ts, value);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 25, $ins_func_id);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 25, $ins_func_id, value);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 26, $upd_cntr);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 26, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 26, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 26, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 26, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 26, $upd_cntr, value);
	}
	
	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 27, $upd_usr_id);
	}

	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 27, $upd_usr_id, value);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 28, $upd_usr_nm);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 28, $upd_usr_nm, value);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 29, $upd_ts);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 29, $upd_ts, value);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 30, $upd_func_id);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 30, $upd_func_id, value);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 31, $upd_srv_req_no);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 31, $upd_srv_req_no, value);
	}

	public String getString(String name) {
		if ($zoho_sls_schd_no.equalsIgnoreCase(name)) {
			return zoho_sls_schd_no();
		}
		if ($deal_cd.equalsIgnoreCase(name)) {
			return deal_cd();
		}
		if ($deal_nm.equalsIgnoreCase(name)) {
			return deal_nm();
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			return cst_cd();
		}
		if ($dlv_cd.equalsIgnoreCase(name)) {
			return dlv_cd();
		}
		if ($bcst_cd.equalsIgnoreCase(name)) {
			return bcst_cd();
		}
		if ($sls_dpt_cd.equalsIgnoreCase(name)) {
			return sls_dpt_cd();
		}
		if ($sls_usr_cd.equalsIgnoreCase(name)) {
			return sls_usr_cd();
		}
		if ($prod_itm_cd.equalsIgnoreCase(name)) {
			return prod_itm_cd();
		}
		if ($prod_itm_sub1.equalsIgnoreCase(name)) {
			return prod_itm_sub1();
		}
		if ($prod_itm_sub2.equalsIgnoreCase(name)) {
			return prod_itm_sub2();
		}
		if ($prod_itm_sub3.equalsIgnoreCase(name)) {
			return prod_itm_sub3();
		}
		if ($mrkt_cd.equalsIgnoreCase(name)) {
			return mrkt_cd();
		}
		if ($dlv_nm.equalsIgnoreCase(name)) {
			return dlv_nm();
		}
		if ($dlv_addr1.equalsIgnoreCase(name)) {
			return dlv_addr1();
		}
		if ($dlv_addr2.equalsIgnoreCase(name)) {
			return dlv_addr2();
		}
		if ($dlv_tel.equalsIgnoreCase(name)) {
			return dlv_tel();
		}
		if ($cur_cd.equalsIgnoreCase(name)) {
			return cur_cd();
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
		if ($amt.equalsIgnoreCase(name)) {
			return amt();
		}
		if ($qty.equalsIgnoreCase(name)) {
			return qty();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumber(name);
	}

	public MCDate getDate(String name) {
		if ($ord_dlv_dt.equalsIgnoreCase(name)) {
			return ord_dlv_dt();
		}
		if ($post_inst_sls_dt.equalsIgnoreCase(name)) {
			return post_inst_sls_dt();
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

	public String getStringNE(String name) {
		if ($zoho_sls_schd_no.equalsIgnoreCase(name)) {
			return zoho_sls_schd_no();
		}
		if ($deal_cd.equalsIgnoreCase(name)) {
			return deal_cd();
		}
		if ($deal_nm.equalsIgnoreCase(name)) {
			return deal_nm();
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			return cst_cd();
		}
		if ($dlv_cd.equalsIgnoreCase(name)) {
			return dlv_cd();
		}
		if ($bcst_cd.equalsIgnoreCase(name)) {
			return bcst_cd();
		}
		if ($sls_dpt_cd.equalsIgnoreCase(name)) {
			return sls_dpt_cd();
		}
		if ($sls_usr_cd.equalsIgnoreCase(name)) {
			return sls_usr_cd();
		}
		if ($prod_itm_cd.equalsIgnoreCase(name)) {
			return prod_itm_cd();
		}
		if ($prod_itm_sub1.equalsIgnoreCase(name)) {
			return prod_itm_sub1();
		}
		if ($prod_itm_sub2.equalsIgnoreCase(name)) {
			return prod_itm_sub2();
		}
		if ($prod_itm_sub3.equalsIgnoreCase(name)) {
			return prod_itm_sub3();
		}
		if ($mrkt_cd.equalsIgnoreCase(name)) {
			return mrkt_cd();
		}
		if ($dlv_nm.equalsIgnoreCase(name)) {
			return dlv_nm();
		}
		if ($dlv_addr1.equalsIgnoreCase(name)) {
			return dlv_addr1();
		}
		if ($dlv_addr2.equalsIgnoreCase(name)) {
			return dlv_addr2();
		}
		if ($dlv_tel.equalsIgnoreCase(name)) {
			return dlv_tel();
		}
		if ($cur_cd.equalsIgnoreCase(name)) {
			return cur_cd();
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
		if ($amt.equalsIgnoreCase(name)) {
			return amt();
		}
		if ($qty.equalsIgnoreCase(name)) {
			return qty();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumberNE(name);
	}

	public MCDate getDateNE(String name) {
		if ($ord_dlv_dt.equalsIgnoreCase(name)) {
			return ord_dlv_dt();
		}
		if ($post_inst_sls_dt.equalsIgnoreCase(name)) {
			return post_inst_sls_dt();
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

	public void setString(String name, String value) {
		if ($zoho_sls_schd_no.equalsIgnoreCase(name)) {
			zoho_sls_schd_no(value);
			return;
		}
		if ($deal_cd.equalsIgnoreCase(name)) {
			deal_cd(value);
			return;
		}
		if ($deal_nm.equalsIgnoreCase(name)) {
			deal_nm(value);
			return;
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			cst_cd(value);
			return;
		}
		if ($dlv_cd.equalsIgnoreCase(name)) {
			dlv_cd(value);
			return;
		}
		if ($bcst_cd.equalsIgnoreCase(name)) {
			bcst_cd(value);
			return;
		}
		if ($sls_dpt_cd.equalsIgnoreCase(name)) {
			sls_dpt_cd(value);
			return;
		}
		if ($sls_usr_cd.equalsIgnoreCase(name)) {
			sls_usr_cd(value);
			return;
		}
		if ($prod_itm_cd.equalsIgnoreCase(name)) {
			prod_itm_cd(value);
			return;
		}
		if ($prod_itm_sub1.equalsIgnoreCase(name)) {
			prod_itm_sub1(value);
			return;
		}
		if ($prod_itm_sub2.equalsIgnoreCase(name)) {
			prod_itm_sub2(value);
			return;
		}
		if ($prod_itm_sub3.equalsIgnoreCase(name)) {
			prod_itm_sub3(value);
			return;
		}
		if ($mrkt_cd.equalsIgnoreCase(name)) {
			mrkt_cd(value);
			return;
		}
		if ($dlv_nm.equalsIgnoreCase(name)) {
			dlv_nm(value);
			return;
		}
		if ($dlv_addr1.equalsIgnoreCase(name)) {
			dlv_addr1(value);
			return;
		}
		if ($dlv_addr2.equalsIgnoreCase(name)) {
			dlv_addr2(value);
			return;
		}
		if ($dlv_tel.equalsIgnoreCase(name)) {
			dlv_tel(value);
			return;
		}
		if ($cur_cd.equalsIgnoreCase(name)) {
			cur_cd(value);
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
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, int value) {
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, long value) {
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, float value) {
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, double value) {
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setDate(String name, MCDate value) {
		if ($ord_dlv_dt.equalsIgnoreCase(name)) {
			ord_dlv_dt(value);
			return;
		}
		if ($post_inst_sls_dt.equalsIgnoreCase(name)) {
			post_inst_sls_dt(value);
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

	public void setStringNE(String name, String value) {
		if ($zoho_sls_schd_no.equalsIgnoreCase(name)) {
			zoho_sls_schd_no(value);
			return;
		}
		if ($deal_cd.equalsIgnoreCase(name)) {
			deal_cd(value);
			return;
		}
		if ($deal_nm.equalsIgnoreCase(name)) {
			deal_nm(value);
			return;
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			cst_cd(value);
			return;
		}
		if ($dlv_cd.equalsIgnoreCase(name)) {
			dlv_cd(value);
			return;
		}
		if ($bcst_cd.equalsIgnoreCase(name)) {
			bcst_cd(value);
			return;
		}
		if ($sls_dpt_cd.equalsIgnoreCase(name)) {
			sls_dpt_cd(value);
			return;
		}
		if ($sls_usr_cd.equalsIgnoreCase(name)) {
			sls_usr_cd(value);
			return;
		}
		if ($prod_itm_cd.equalsIgnoreCase(name)) {
			prod_itm_cd(value);
			return;
		}
		if ($prod_itm_sub1.equalsIgnoreCase(name)) {
			prod_itm_sub1(value);
			return;
		}
		if ($prod_itm_sub2.equalsIgnoreCase(name)) {
			prod_itm_sub2(value);
			return;
		}
		if ($prod_itm_sub3.equalsIgnoreCase(name)) {
			prod_itm_sub3(value);
			return;
		}
		if ($mrkt_cd.equalsIgnoreCase(name)) {
			mrkt_cd(value);
			return;
		}
		if ($dlv_nm.equalsIgnoreCase(name)) {
			dlv_nm(value);
			return;
		}
		if ($dlv_addr1.equalsIgnoreCase(name)) {
			dlv_addr1(value);
			return;
		}
		if ($dlv_addr2.equalsIgnoreCase(name)) {
			dlv_addr2(value);
			return;
		}
		if ($dlv_tel.equalsIgnoreCase(name)) {
			dlv_tel(value);
			return;
		}
		if ($cur_cd.equalsIgnoreCase(name)) {
			cur_cd(value);
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
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, int value) {
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, long value) {
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, float value) {
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, double value) {
		if ($amt.equalsIgnoreCase(name)) {
			amt(value);
			return;
		}
		if ($qty.equalsIgnoreCase(name)) {
			qty(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setDateNE(String name, MCDate value) {
		if ($ord_dlv_dt.equalsIgnoreCase(name)) {
			ord_dlv_dt(value);
			return;
		}
		if ($post_inst_sls_dt.equalsIgnoreCase(name)) {
			post_inst_sls_dt(value);
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

}
