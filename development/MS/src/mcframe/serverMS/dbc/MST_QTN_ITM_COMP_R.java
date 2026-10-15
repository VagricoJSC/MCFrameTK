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
 * "見積品目構成 // Quotation item configuration"DBコンテナRowクラスです。<p>
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
 *  	<td>qtn_itm_comp_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>見積品目構成ＮＯ</td>
 *  	<td>Quotation item configuration No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>qtn_d_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>見積明細ＮＯ</td>
 *  	<td>Quotation details No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>qtn_itm_comp_lno</td>
 *  	<td>C</td>
 *  	<td>3</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>見積品目構成行ＮＯ</td>
 *  	<td>Quotation item configuration row No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sls_itm_comp_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>販売品目構成ＮＯ</td>
 *  	<td>Sales item configuration No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>itm_cd</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>品目ＣＤ</td>
 *  	<td>Item cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>itm_sub1</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>枝番１</td>
 *  	<td>Branch No. 1</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>itm_sub2</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>枝番２</td>
 *  	<td>Branch No. 2</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>itm_sub3</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>枝番３</td>
 *  	<td>Branch No. 3</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sno1</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>手配ＮＯ１</td>
 *  	<td>SEIBAN No. 1</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sno2</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>手配ＮＯ２</td>
 *  	<td>SEIBAN No. 2</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sno3</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>手配ＮＯ３</td>
 *  	<td>SEIBAN No. 3</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sno4</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>手配ＮＯ４</td>
 *  	<td>SEIBAN No. 4</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>itm_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品名</td>
 *  	<td>Item name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sundry_itm_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>諸口品ＦＬＧ</td>
 *  	<td>Miscellaneous item flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>core_itm_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>主品目ＦＬＧ</td>
 *  	<td>Main item flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>mst_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>マスタ参照ＦＬＧ</td>
 *  	<td>Master reference flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>std_comp_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>標準構成ＦＬＧ</td>
 *  	<td>Standard structure flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>trd_unit_cd</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>取引単位ＣＤ</td>
 *  	<td>Transaction unit cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>trd_unit_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>取引単位数量</td>
 *  	<td>Transaction unit qty.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>base_unit_cd</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>基準単位ＣＤ</td>
 *  	<td>Base unit cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>base_unit_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>基準単位数量</td>
 *  	<td>Base unit qty.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>trd_cur_std_sls_upri</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>取引通貨標準販売単価</td>
 *  	<td>Standard sales unit price (Transaction currency)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>trd_cur_std_sls_amt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>取引通貨標準販売金額</td>
 *  	<td>Standard sales amount (Transaction currency)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>upri_rate</td>
 *  	<td>N</td>
 *  	<td>5,2</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>仕切率</td>
 *  	<td>Discount rate</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>trd_cur_upri</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>取引通貨仕切単価</td>
 *  	<td>Discount unit price (Transaction currency)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>trd_cur_amt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>取引通貨仕切金額</td>
 *  	<td>Discount unit amount (Transaction currency)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>cost_upri</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>原価単価</td>
 *  	<td>Unit cost</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>cost_amt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>原価金額</td>
 *  	<td>Total cost</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>rmrks</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>見積構成備考</td>
 *  	<td>Quotation terms remarks</td>
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
public class MST_QTN_ITM_COMP_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.CO_VIEW;

	public static final String TABLE_NAME = "MST_QTN_ITM_COMP";

	public static final boolean EX_CTRL = false;
	
	public static final boolean LCL_TABLE = false;
	
	/**
	 * 見積品目構成ＮＯ. Quotation item configuration No..<p>
	 *
	 */
	public static final String $qtn_itm_comp_no = "qtn_itm_comp_no";
	private static final MCPermColumnInfo _qtn_itm_comp_no = createColumnInfo("qtn_itm_comp_no");
	public final MCStringPermColumn qtn_itm_comp_no = createStringColumn(_qtn_itm_comp_no);
	
	/**
	 * 見積明細ＮＯ. Quotation details No..<p>
	 *
	 */
	public static final String $qtn_d_no = "qtn_d_no";
	private static final MCPermColumnInfo _qtn_d_no = createColumnInfo("qtn_d_no");
	public final MCStringPermColumn qtn_d_no = createStringColumn(_qtn_d_no);
	
	/**
	 * 見積品目構成行ＮＯ. Quotation item configuration row No..<p>
	 *
	 */
	public static final String $qtn_itm_comp_lno = "qtn_itm_comp_lno";
	private static final MCPermColumnInfo _qtn_itm_comp_lno = createColumnInfo("qtn_itm_comp_lno");
	public final MCStringPermColumn qtn_itm_comp_lno = createStringColumn(_qtn_itm_comp_lno);
	
	/**
	 * 販売品目構成ＮＯ. Sales item configuration No..<p>
	 *
	 */
	public static final String $sls_itm_comp_no = "sls_itm_comp_no";
	private static final MCPermColumnInfo _sls_itm_comp_no = createColumnInfo("sls_itm_comp_no");
	public final MCStringPermColumn sls_itm_comp_no = createStringColumn(_sls_itm_comp_no);
	
	/**
	 * 品目ＣＤ. Item cd..<p>
	 *
	 */
	public static final String $itm_cd = "itm_cd";
	private static final MCPermColumnInfo _itm_cd = createColumnInfo("itm_cd");
	public final MCStringPermColumn itm_cd = createStringColumn(_itm_cd);
	
	/**
	 * 枝番１. Branch No. 1.<p>
	 *
	 */
	public static final String $itm_sub1 = "itm_sub1";
	private static final MCPermColumnInfo _itm_sub1 = createColumnInfo("itm_sub1");
	public final MCStringPermColumn itm_sub1 = createStringColumn(_itm_sub1);
	
	/**
	 * 枝番２. Branch No. 2.<p>
	 *
	 */
	public static final String $itm_sub2 = "itm_sub2";
	private static final MCPermColumnInfo _itm_sub2 = createColumnInfo("itm_sub2");
	public final MCStringPermColumn itm_sub2 = createStringColumn(_itm_sub2);
	
	/**
	 * 枝番３. Branch No. 3.<p>
	 *
	 */
	public static final String $itm_sub3 = "itm_sub3";
	private static final MCPermColumnInfo _itm_sub3 = createColumnInfo("itm_sub3");
	public final MCStringPermColumn itm_sub3 = createStringColumn(_itm_sub3);
	
	/**
	 * 手配ＮＯ１. SEIBAN No. 1.<p>
	 *
	 */
	public static final String $sno1 = "sno1";
	private static final MCPermColumnInfo _sno1 = createColumnInfo("sno1");
	public final MCStringPermColumn sno1 = createStringColumn(_sno1);
	
	/**
	 * 手配ＮＯ２. SEIBAN No. 2.<p>
	 *
	 */
	public static final String $sno2 = "sno2";
	private static final MCPermColumnInfo _sno2 = createColumnInfo("sno2");
	public final MCStringPermColumn sno2 = createStringColumn(_sno2);
	
	/**
	 * 手配ＮＯ３. SEIBAN No. 3.<p>
	 *
	 */
	public static final String $sno3 = "sno3";
	private static final MCPermColumnInfo _sno3 = createColumnInfo("sno3");
	public final MCStringPermColumn sno3 = createStringColumn(_sno3);
	
	/**
	 * 手配ＮＯ４. SEIBAN No. 4.<p>
	 *
	 */
	public static final String $sno4 = "sno4";
	private static final MCPermColumnInfo _sno4 = createColumnInfo("sno4");
	public final MCStringPermColumn sno4 = createStringColumn(_sno4);
	
	/**
	 * 品名. Item name.<p>
	 *
	 */
	public static final String $itm_nm = "itm_nm";
	private static final MCPermColumnInfo _itm_nm = createColumnInfo("itm_nm");
	public final MCStringPermColumn itm_nm = createStringColumn(_itm_nm);
	
	/**
	 * 諸口品ＦＬＧ. Miscellaneous item flg..<p>
	 *
	 */
	public static final String $sundry_itm_flg = "sundry_itm_flg";
	private static final MCPermColumnInfo _sundry_itm_flg = createColumnInfo("sundry_itm_flg");
	public final MCBooleanPermColumn sundry_itm_flg = createBooleanColumn(_sundry_itm_flg);
	
	/**
	 * 主品目ＦＬＧ. Main item flg..<p>
	 *
	 */
	public static final String $core_itm_flg = "core_itm_flg";
	private static final MCPermColumnInfo _core_itm_flg = createColumnInfo("core_itm_flg");
	public final MCBooleanPermColumn core_itm_flg = createBooleanColumn(_core_itm_flg);
	
	/**
	 * マスタ参照ＦＬＧ. Master reference flg..<p>
	 *
	 */
	public static final String $mst_flg = "mst_flg";
	private static final MCPermColumnInfo _mst_flg = createColumnInfo("mst_flg");
	public final MCBooleanPermColumn mst_flg = createBooleanColumn(_mst_flg);
	
	/**
	 * 標準構成ＦＬＧ. Standard structure flg..<p>
	 *
	 */
	public static final String $std_comp_flg = "std_comp_flg";
	private static final MCPermColumnInfo _std_comp_flg = createColumnInfo("std_comp_flg");
	public final MCBooleanPermColumn std_comp_flg = createBooleanColumn(_std_comp_flg);
	
	/**
	 * 取引単位ＣＤ. Transaction unit cd..<p>
	 *
	 */
	public static final String $trd_unit_cd = "trd_unit_cd";
	private static final MCPermColumnInfo _trd_unit_cd = createColumnInfo("trd_unit_cd");
	public final MCStringPermColumn trd_unit_cd = createStringColumn(_trd_unit_cd);
	
	/**
	 * 取引単位数量. Transaction unit qty..<p>
	 *
	 */
	public static final String $trd_unit_qty = "trd_unit_qty";
	private static final MCPermColumnInfo _trd_unit_qty = createColumnInfo("trd_unit_qty");
	public final MCNumberPermColumn trd_unit_qty = createNumberColumn(_trd_unit_qty);
	
	/**
	 * 基準単位ＣＤ. Base unit cd..<p>
	 *
	 */
	public static final String $base_unit_cd = "base_unit_cd";
	private static final MCPermColumnInfo _base_unit_cd = createColumnInfo("base_unit_cd");
	public final MCStringPermColumn base_unit_cd = createStringColumn(_base_unit_cd);
	
	/**
	 * 基準単位数量. Base unit qty..<p>
	 *
	 */
	public static final String $base_unit_qty = "base_unit_qty";
	private static final MCPermColumnInfo _base_unit_qty = createColumnInfo("base_unit_qty");
	public final MCNumberPermColumn base_unit_qty = createNumberColumn(_base_unit_qty);
	
	/**
	 * 取引通貨標準販売単価. Standard sales unit price (Transaction currency).<p>
	 *
	 */
	public static final String $trd_cur_std_sls_upri = "trd_cur_std_sls_upri";
	private static final MCPermColumnInfo _trd_cur_std_sls_upri = createColumnInfo("trd_cur_std_sls_upri");
	public final MCNumberPermColumn trd_cur_std_sls_upri = createNumberColumn(_trd_cur_std_sls_upri);
	
	/**
	 * 取引通貨標準販売金額. Standard sales amount (Transaction currency).<p>
	 *
	 */
	public static final String $trd_cur_std_sls_amt = "trd_cur_std_sls_amt";
	private static final MCPermColumnInfo _trd_cur_std_sls_amt = createColumnInfo("trd_cur_std_sls_amt");
	public final MCNumberPermColumn trd_cur_std_sls_amt = createNumberColumn(_trd_cur_std_sls_amt);
	
	/**
	 * 仕切率. Discount rate.<p>
	 *
	 */
	public static final String $upri_rate = "upri_rate";
	private static final MCPermColumnInfo _upri_rate = createColumnInfo("upri_rate");
	public final MCNumberPermColumn upri_rate = createNumberColumn(_upri_rate);
	
	/**
	 * 取引通貨仕切単価. Discount unit price (Transaction currency).<p>
	 *
	 */
	public static final String $trd_cur_upri = "trd_cur_upri";
	private static final MCPermColumnInfo _trd_cur_upri = createColumnInfo("trd_cur_upri");
	public final MCNumberPermColumn trd_cur_upri = createNumberColumn(_trd_cur_upri);
	
	/**
	 * 取引通貨仕切金額. Discount unit amount (Transaction currency).<p>
	 *
	 */
	public static final String $trd_cur_amt = "trd_cur_amt";
	private static final MCPermColumnInfo _trd_cur_amt = createColumnInfo("trd_cur_amt");
	public final MCNumberPermColumn trd_cur_amt = createNumberColumn(_trd_cur_amt);
	
	/**
	 * 原価単価. Unit cost.<p>
	 *
	 */
	public static final String $cost_upri = "cost_upri";
	private static final MCPermColumnInfo _cost_upri = createColumnInfo("cost_upri");
	public final MCNumberPermColumn cost_upri = createNumberColumn(_cost_upri);
	
	/**
	 * 原価金額. Total cost.<p>
	 *
	 */
	public static final String $cost_amt = "cost_amt";
	private static final MCPermColumnInfo _cost_amt = createColumnInfo("cost_amt");
	public final MCNumberPermColumn cost_amt = createNumberColumn(_cost_amt);
	
	/**
	 * 見積構成備考. Quotation terms remarks.<p>
	 *
	 */
	public static final String $rmrks = "rmrks";
	private static final MCPermColumnInfo _rmrks = createColumnInfo("rmrks");
	public final MCStringPermColumn rmrks = createStringColumn(_rmrks);
	
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
	
	public static final MCMeta qtn_itm_comp_no_META = createCommonMeta($qtn_itm_comp_no, mcframe.commonMA.meta.MA_META.QTN_ITM_COMP_NO);
	public static final MCMeta qtn_d_no_META = createCommonMeta($qtn_d_no, mcframe.commonMA.meta.MA_META.QTN_D_NO);
	public static final MCMeta qtn_itm_comp_lno_META = createCommonMeta($qtn_itm_comp_lno, mcframe.commonMS.meta.MS_META.ITM_COMP_LNO);
	public static final MCMeta sls_itm_comp_no_META = createCommonMeta($sls_itm_comp_no, mcframe.commonMA.meta.MA_META.SLS_ITM_COMP_NO);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta sno1_META = createCommonMeta($sno1, mcframe.commonMA.meta.MA_META.SNO1);
	public static final MCMeta sno2_META = createCommonMeta($sno2, mcframe.commonMA.meta.MA_META.SNO2);
	public static final MCMeta sno3_META = createCommonMeta($sno3, mcframe.commonMA.meta.MA_META.SNO3);
	public static final MCMeta sno4_META = createCommonMeta($sno4, mcframe.commonMA.meta.MA_META.SNO4);
	public static final MCMeta itm_nm_META = createCommonMeta($itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta sundry_itm_flg_META = createCommonMeta($sundry_itm_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta core_itm_flg_META = createCommonMeta($core_itm_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta mst_flg_META = createCommonMeta($mst_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta std_comp_flg_META = createCommonMeta($std_comp_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta trd_unit_cd_META = createCommonMeta($trd_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta trd_unit_qty_META = createCommonMeta($trd_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_cd_META = createCommonMeta($base_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta base_unit_qty_META = createCommonMeta($base_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta trd_cur_std_sls_upri_META = createCommonMeta($trd_cur_std_sls_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta trd_cur_std_sls_amt_META = createCommonMeta($trd_cur_std_sls_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta upri_rate_META = createCommonMeta($upri_rate, mcframe.commonMA.meta.MA_META.PER);
	public static final MCMeta trd_cur_upri_META = createCommonMeta($trd_cur_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta trd_cur_amt_META = createCommonMeta($trd_cur_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta cost_upri_META = createCommonMeta($cost_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta cost_amt_META = createCommonMeta($cost_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta rmrks_META = createCommonMeta($rmrks, mcframe.commonMS.meta.MS_META.QTN_ITM_COMP_RMRKS);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.QTN_ITM_COMP_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.QTN_ITM_COMP_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.QTN_ITM_COMP_SUB_CHAR3);
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
	
	protected static final ConstMetaList<MST_QTN_ITM_COMP_R> constMetas = new ConstMetaList<MST_QTN_ITM_COMP_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			qtn_itm_comp_no_META,
			qtn_d_no_META,
			qtn_itm_comp_lno_META,
			sls_itm_comp_no_META,
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			sno1_META,
			sno2_META,
			sno3_META,
			sno4_META,
			itm_nm_META,
			sundry_itm_flg_META,
			core_itm_flg_META,
			mst_flg_META,
			std_comp_flg_META,
			trd_unit_cd_META,
			trd_unit_qty_META,
			base_unit_cd_META,
			base_unit_qty_META,
			trd_cur_std_sls_upri_META,
			trd_cur_std_sls_amt_META,
			upri_rate_META,
			trd_cur_upri_META,
			trd_cur_amt_META,
			cost_upri_META,
			cost_amt_META,
			rmrks_META,
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
	protected MST_QTN_ITM_COMP_R(ConstMetaList<? extends MST_QTN_ITM_COMP_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MST_QTN_ITM_COMP_R(ConstMetaList<? extends MST_QTN_ITM_COMP_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MST_QTN_ITM_COMP_R.$qtn_itm_comp_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_QTN_ITM_COMP_R.$qtn_itm_comp_no,
				"qtn_itm_comp_no",
				qtn_itm_comp_no,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_QTN_ITM_COMP_R.$qtn_d_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_QTN_ITM_COMP_R.$qtn_d_no,
				"qtn_d_no",
				qtn_d_no,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_QTN_ITM_COMP_R.$qtn_itm_comp_lno,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_QTN_ITM_COMP_R.$qtn_itm_comp_lno,
				"qtn_itm_comp_lno",
				qtn_itm_comp_lno,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_QTN_ITM_COMP_R.$sls_itm_comp_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_QTN_ITM_COMP_R.$sls_itm_comp_no,
				"sls_itm_comp_no",
				sls_itm_comp_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_QTN_ITM_COMP_R.$itm_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_QTN_ITM_COMP_R.$itm_cd,
				"itm_cd",
				itm_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_QTN_ITM_COMP_R.$itm_sub1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_QTN_ITM_COMP_R.$itm_sub1,
				"itm_sub1",
				itm_sub1,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_QTN_ITM_COMP_R.$itm_sub2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_QTN_ITM_COMP_R.$itm_sub2,
				"itm_sub2",
				itm_sub2,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_QTN_ITM_COMP_R.$itm_sub3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_QTN_ITM_COMP_R.$itm_sub3,
				"itm_sub3",
				itm_sub3,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_QTN_ITM_COMP_R.$sno1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_QTN_ITM_COMP_R.$sno1,
				"sno1",
				sno1,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_QTN_ITM_COMP_R.$sno2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_QTN_ITM_COMP_R.$sno2,
				"sno2",
				sno2,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_QTN_ITM_COMP_R.$sno3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_QTN_ITM_COMP_R.$sno3,
				"sno3",
				sno3,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_QTN_ITM_COMP_R.$sno4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_QTN_ITM_COMP_R.$sno4,
				"sno4",
				sno4,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_QTN_ITM_COMP_R.$itm_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_QTN_ITM_COMP_R.$itm_nm,
				"itm_nm",
				itm_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_QTN_ITM_COMP_R.$sundry_itm_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_QTN_ITM_COMP_R.$sundry_itm_flg,
				"sundry_itm_flg",
				sundry_itm_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_QTN_ITM_COMP_R.$core_itm_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_QTN_ITM_COMP_R.$core_itm_flg,
				"core_itm_flg",
				core_itm_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_QTN_ITM_COMP_R.$mst_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_QTN_ITM_COMP_R.$mst_flg,
				"mst_flg",
				mst_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_QTN_ITM_COMP_R.$std_comp_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_QTN_ITM_COMP_R.$std_comp_flg,
				"std_comp_flg",
				std_comp_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_QTN_ITM_COMP_R.$trd_unit_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_QTN_ITM_COMP_R.$trd_unit_cd,
				"trd_unit_cd",
				trd_unit_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_QTN_ITM_COMP_R.$trd_unit_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_QTN_ITM_COMP_R.$trd_unit_qty,
				"trd_unit_qty",
				trd_unit_qty,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_QTN_ITM_COMP_R.$base_unit_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_QTN_ITM_COMP_R.$base_unit_cd,
				"base_unit_cd",
				base_unit_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_QTN_ITM_COMP_R.$base_unit_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_QTN_ITM_COMP_R.$base_unit_qty,
				"base_unit_qty",
				base_unit_qty,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_QTN_ITM_COMP_R.$trd_cur_std_sls_upri,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_QTN_ITM_COMP_R.$trd_cur_std_sls_upri,
				"trd_cur_std_sls_upri",
				trd_cur_std_sls_upri,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_QTN_ITM_COMP_R.$trd_cur_std_sls_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_QTN_ITM_COMP_R.$trd_cur_std_sls_amt,
				"trd_cur_std_sls_amt",
				trd_cur_std_sls_amt,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_QTN_ITM_COMP_R.$upri_rate,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_QTN_ITM_COMP_R.$upri_rate,
				"upri_rate",
				upri_rate,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_QTN_ITM_COMP_R.$trd_cur_upri,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_QTN_ITM_COMP_R.$trd_cur_upri,
				"trd_cur_upri",
				trd_cur_upri,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_QTN_ITM_COMP_R.$trd_cur_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_QTN_ITM_COMP_R.$trd_cur_amt,
				"trd_cur_amt",
				trd_cur_amt,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_QTN_ITM_COMP_R.$cost_upri,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_QTN_ITM_COMP_R.$cost_upri,
				"cost_upri",
				cost_upri,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_QTN_ITM_COMP_R.$cost_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_QTN_ITM_COMP_R.$cost_amt,
				"cost_amt",
				cost_amt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_QTN_ITM_COMP_R.$rmrks,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_QTN_ITM_COMP_R.$rmrks,
				"rmrks",
				rmrks,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_QTN_ITM_COMP_R.$sub_char1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_QTN_ITM_COMP_R.$sub_char1,
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
			MST_QTN_ITM_COMP_R.$sub_char2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_QTN_ITM_COMP_R.$sub_char2,
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
			MST_QTN_ITM_COMP_R.$sub_char3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_QTN_ITM_COMP_R.$sub_char3,
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
			MST_QTN_ITM_COMP_R.$ins_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_QTN_ITM_COMP_R.$ins_usr_id,
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
			MST_QTN_ITM_COMP_R.$ins_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_QTN_ITM_COMP_R.$ins_usr_nm,
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
			MST_QTN_ITM_COMP_R.$ins_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MST_QTN_ITM_COMP_R.$ins_ts,
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
			MST_QTN_ITM_COMP_R.$ins_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_QTN_ITM_COMP_R.$ins_func_id,
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
			MST_QTN_ITM_COMP_R.$upd_cntr,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_QTN_ITM_COMP_R.$upd_cntr,
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
			MST_QTN_ITM_COMP_R.$upd_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_QTN_ITM_COMP_R.$upd_usr_id,
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
			MST_QTN_ITM_COMP_R.$upd_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_QTN_ITM_COMP_R.$upd_usr_nm,
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
			MST_QTN_ITM_COMP_R.$upd_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MST_QTN_ITM_COMP_R.$upd_ts,
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
			MST_QTN_ITM_COMP_R.$upd_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_QTN_ITM_COMP_R.$upd_func_id,
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
			MST_QTN_ITM_COMP_R.$upd_srv_req_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_QTN_ITM_COMP_R.$upd_srv_req_no,
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
	public static MST_QTN_ITM_COMP_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MST_QTN_ITM_COMP_R create(String alias) {
		MST_QTN_ITM_COMP_R row = new MST_QTN_ITM_COMP_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MST_QTN_ITM_COMP_R createByName(T proto) {
		MST_QTN_ITM_COMP_R row = MST_QTN_ITM_COMP_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MST_QTN_ITM_COMP_R clone() {
		return (MST_QTN_ITM_COMP_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MST_QTN_ITM_COMP_R createInstance() {
		return (MST_QTN_ITM_COMP_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MST_QTN_ITM_COMP_R getValues(String... names) {
		return (MST_QTN_ITM_COMP_R) super.getValues(names);
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
	 public MSW_QTN_ITM_COMP_KEY_R getPkWorkDbc(String alias) {
	 	return MSW_QTN_ITM_COMP_KEY_R.create(alias);
	 }

	/*
	 * MCDBContainerのオーバーライドメソッドです。
	 */
	 public MSW_QTN_ITM_COMP_KEY_R getPkWorkDbc() {
	 	return getPkWorkDbc(MSW_QTN_ITM_COMP_KEY_R.TABLE_NAME);
	 }

	/**
	 * 見積品目構成ＮＯ. Quotation item configuration No..<p>
	 *
	 */
	public String qtn_itm_comp_no() {
		return getConstString(offset + 0, $qtn_itm_comp_no);
	}

	/**
	 * 見積品目構成ＮＯ. Quotation item configuration No..<p>
	 *
	 */
	public void qtn_itm_comp_no(String value) {
		setConstString(offset + 0, $qtn_itm_comp_no, value);
	}

	/**
	 * 見積明細ＮＯ. Quotation details No..<p>
	 *
	 */
	public String qtn_d_no() {
		return getConstString(offset + 1, $qtn_d_no);
	}

	/**
	 * 見積明細ＮＯ. Quotation details No..<p>
	 *
	 */
	public void qtn_d_no(String value) {
		setConstString(offset + 1, $qtn_d_no, value);
	}

	/**
	 * 見積品目構成行ＮＯ. Quotation item configuration row No..<p>
	 *
	 */
	public String qtn_itm_comp_lno() {
		return getConstString(offset + 2, $qtn_itm_comp_lno);
	}

	/**
	 * 見積品目構成行ＮＯ. Quotation item configuration row No..<p>
	 *
	 */
	public void qtn_itm_comp_lno(String value) {
		setConstString(offset + 2, $qtn_itm_comp_lno, value);
	}

	/**
	 * 販売品目構成ＮＯ. Sales item configuration No..<p>
	 *
	 */
	public String sls_itm_comp_no() {
		return getConstString(offset + 3, $sls_itm_comp_no);
	}

	/**
	 * 販売品目構成ＮＯ. Sales item configuration No..<p>
	 *
	 */
	public void sls_itm_comp_no(String value) {
		setConstString(offset + 3, $sls_itm_comp_no, value);
	}

	/**
	 * 品目ＣＤ. Item cd..<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 4, $itm_cd);
	}

	/**
	 * 品目ＣＤ. Item cd..<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 4, $itm_cd, value);
	}

	/**
	 * 枝番１. Branch No. 1.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 5, $itm_sub1);
	}

	/**
	 * 枝番１. Branch No. 1.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 5, $itm_sub1, value);
	}

	/**
	 * 枝番２. Branch No. 2.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 6, $itm_sub2);
	}

	/**
	 * 枝番２. Branch No. 2.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 6, $itm_sub2, value);
	}

	/**
	 * 枝番３. Branch No. 3.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 7, $itm_sub3);
	}

	/**
	 * 枝番３. Branch No. 3.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 7, $itm_sub3, value);
	}

	/**
	 * 手配ＮＯ１. SEIBAN No. 1.<p>
	 *
	 */
	public String sno1() {
		return getConstString(offset + 8, $sno1);
	}

	/**
	 * 手配ＮＯ１. SEIBAN No. 1.<p>
	 *
	 */
	public void sno1(String value) {
		setConstString(offset + 8, $sno1, value);
	}

	/**
	 * 手配ＮＯ２. SEIBAN No. 2.<p>
	 *
	 */
	public String sno2() {
		return getConstString(offset + 9, $sno2);
	}

	/**
	 * 手配ＮＯ２. SEIBAN No. 2.<p>
	 *
	 */
	public void sno2(String value) {
		setConstString(offset + 9, $sno2, value);
	}

	/**
	 * 手配ＮＯ３. SEIBAN No. 3.<p>
	 *
	 */
	public String sno3() {
		return getConstString(offset + 10, $sno3);
	}

	/**
	 * 手配ＮＯ３. SEIBAN No. 3.<p>
	 *
	 */
	public void sno3(String value) {
		setConstString(offset + 10, $sno3, value);
	}

	/**
	 * 手配ＮＯ４. SEIBAN No. 4.<p>
	 *
	 */
	public String sno4() {
		return getConstString(offset + 11, $sno4);
	}

	/**
	 * 手配ＮＯ４. SEIBAN No. 4.<p>
	 *
	 */
	public void sno4(String value) {
		setConstString(offset + 11, $sno4, value);
	}

	/**
	 * 品名. Item name.<p>
	 *
	 */
	public String itm_nm() {
		return getConstString(offset + 12, $itm_nm);
	}

	/**
	 * 品名. Item name.<p>
	 *
	 */
	public void itm_nm(String value) {
		setConstString(offset + 12, $itm_nm, value);
	}

	/**
	 * 諸口品ＦＬＧ. Miscellaneous item flg..<p>
	 *
	 */
	public boolean sundry_itm_flg() {
		return getConstBoolean(offset + 13, $sundry_itm_flg);
	}

	/**
	 * 諸口品ＦＬＧ. Miscellaneous item flg..<p>
	 *
	 */
	public void sundry_itm_flg(boolean value) {
		setConstBoolean(offset + 13, $sundry_itm_flg, value);
	}

	/**
	 * 主品目ＦＬＧ. Main item flg..<p>
	 *
	 */
	public boolean core_itm_flg() {
		return getConstBoolean(offset + 14, $core_itm_flg);
	}

	/**
	 * 主品目ＦＬＧ. Main item flg..<p>
	 *
	 */
	public void core_itm_flg(boolean value) {
		setConstBoolean(offset + 14, $core_itm_flg, value);
	}

	/**
	 * マスタ参照ＦＬＧ. Master reference flg..<p>
	 *
	 */
	public boolean mst_flg() {
		return getConstBoolean(offset + 15, $mst_flg);
	}

	/**
	 * マスタ参照ＦＬＧ. Master reference flg..<p>
	 *
	 */
	public void mst_flg(boolean value) {
		setConstBoolean(offset + 15, $mst_flg, value);
	}

	/**
	 * 標準構成ＦＬＧ. Standard structure flg..<p>
	 *
	 */
	public boolean std_comp_flg() {
		return getConstBoolean(offset + 16, $std_comp_flg);
	}

	/**
	 * 標準構成ＦＬＧ. Standard structure flg..<p>
	 *
	 */
	public void std_comp_flg(boolean value) {
		setConstBoolean(offset + 16, $std_comp_flg, value);
	}

	/**
	 * 取引単位ＣＤ. Transaction unit cd..<p>
	 *
	 */
	public String trd_unit_cd() {
		return getConstString(offset + 17, $trd_unit_cd);
	}

	/**
	 * 取引単位ＣＤ. Transaction unit cd..<p>
	 *
	 */
	public void trd_unit_cd(String value) {
		setConstString(offset + 17, $trd_unit_cd, value);
	}

	/**
	 * 取引単位数量. Transaction unit qty..<p>
	 *
	 */
	public MCNumber trd_unit_qty() {
		return getConstNumber(offset + 18, $trd_unit_qty);
	}

	/**
	 * 取引単位数量. Transaction unit qty..<p>
	 *
	 */
	public void trd_unit_qty(MCNumber value) {
		setConstNumber(offset + 18, $trd_unit_qty, value);
	}
	
	/**
	 * 取引単位数量. Transaction unit qty..<p>
	 *
	 */
	public void trd_unit_qty(int value) {
		setConstNumber(offset + 18, $trd_unit_qty, value);
	}
	
	/**
	 * 取引単位数量. Transaction unit qty..<p>
	 *
	 */
	public void trd_unit_qty(long value) {
		setConstNumber(offset + 18, $trd_unit_qty, value);
	}
	
	/**
	 * 取引単位数量. Transaction unit qty..<p>
	 *
	 */
	public void trd_unit_qty(float value) {
		setConstNumber(offset + 18, $trd_unit_qty, value);
	}
	
	/**
	 * 取引単位数量. Transaction unit qty..<p>
	 *
	 */
	public void trd_unit_qty(double value) {
		setConstNumber(offset + 18, $trd_unit_qty, value);
	}
	
	/**
	 * 基準単位ＣＤ. Base unit cd..<p>
	 *
	 */
	public String base_unit_cd() {
		return getConstString(offset + 19, $base_unit_cd);
	}

	/**
	 * 基準単位ＣＤ. Base unit cd..<p>
	 *
	 */
	public void base_unit_cd(String value) {
		setConstString(offset + 19, $base_unit_cd, value);
	}

	/**
	 * 基準単位数量. Base unit qty..<p>
	 *
	 */
	public MCNumber base_unit_qty() {
		return getConstNumber(offset + 20, $base_unit_qty);
	}

	/**
	 * 基準単位数量. Base unit qty..<p>
	 *
	 */
	public void base_unit_qty(MCNumber value) {
		setConstNumber(offset + 20, $base_unit_qty, value);
	}
	
	/**
	 * 基準単位数量. Base unit qty..<p>
	 *
	 */
	public void base_unit_qty(int value) {
		setConstNumber(offset + 20, $base_unit_qty, value);
	}
	
	/**
	 * 基準単位数量. Base unit qty..<p>
	 *
	 */
	public void base_unit_qty(long value) {
		setConstNumber(offset + 20, $base_unit_qty, value);
	}
	
	/**
	 * 基準単位数量. Base unit qty..<p>
	 *
	 */
	public void base_unit_qty(float value) {
		setConstNumber(offset + 20, $base_unit_qty, value);
	}
	
	/**
	 * 基準単位数量. Base unit qty..<p>
	 *
	 */
	public void base_unit_qty(double value) {
		setConstNumber(offset + 20, $base_unit_qty, value);
	}
	
	/**
	 * 取引通貨標準販売単価. Standard sales unit price (Transaction currency).<p>
	 *
	 */
	public MCNumber trd_cur_std_sls_upri() {
		return getConstNumber(offset + 21, $trd_cur_std_sls_upri);
	}

	/**
	 * 取引通貨標準販売単価. Standard sales unit price (Transaction currency).<p>
	 *
	 */
	public void trd_cur_std_sls_upri(MCNumber value) {
		setConstNumber(offset + 21, $trd_cur_std_sls_upri, value);
	}
	
	/**
	 * 取引通貨標準販売単価. Standard sales unit price (Transaction currency).<p>
	 *
	 */
	public void trd_cur_std_sls_upri(int value) {
		setConstNumber(offset + 21, $trd_cur_std_sls_upri, value);
	}
	
	/**
	 * 取引通貨標準販売単価. Standard sales unit price (Transaction currency).<p>
	 *
	 */
	public void trd_cur_std_sls_upri(long value) {
		setConstNumber(offset + 21, $trd_cur_std_sls_upri, value);
	}
	
	/**
	 * 取引通貨標準販売単価. Standard sales unit price (Transaction currency).<p>
	 *
	 */
	public void trd_cur_std_sls_upri(float value) {
		setConstNumber(offset + 21, $trd_cur_std_sls_upri, value);
	}
	
	/**
	 * 取引通貨標準販売単価. Standard sales unit price (Transaction currency).<p>
	 *
	 */
	public void trd_cur_std_sls_upri(double value) {
		setConstNumber(offset + 21, $trd_cur_std_sls_upri, value);
	}
	
	/**
	 * 取引通貨標準販売金額. Standard sales amount (Transaction currency).<p>
	 *
	 */
	public MCNumber trd_cur_std_sls_amt() {
		return getConstNumber(offset + 22, $trd_cur_std_sls_amt);
	}

	/**
	 * 取引通貨標準販売金額. Standard sales amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_std_sls_amt(MCNumber value) {
		setConstNumber(offset + 22, $trd_cur_std_sls_amt, value);
	}
	
	/**
	 * 取引通貨標準販売金額. Standard sales amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_std_sls_amt(int value) {
		setConstNumber(offset + 22, $trd_cur_std_sls_amt, value);
	}
	
	/**
	 * 取引通貨標準販売金額. Standard sales amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_std_sls_amt(long value) {
		setConstNumber(offset + 22, $trd_cur_std_sls_amt, value);
	}
	
	/**
	 * 取引通貨標準販売金額. Standard sales amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_std_sls_amt(float value) {
		setConstNumber(offset + 22, $trd_cur_std_sls_amt, value);
	}
	
	/**
	 * 取引通貨標準販売金額. Standard sales amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_std_sls_amt(double value) {
		setConstNumber(offset + 22, $trd_cur_std_sls_amt, value);
	}
	
	/**
	 * 仕切率. Discount rate.<p>
	 *
	 */
	public MCNumber upri_rate() {
		return getConstNumber(offset + 23, $upri_rate);
	}

	/**
	 * 仕切率. Discount rate.<p>
	 *
	 */
	public void upri_rate(MCNumber value) {
		setConstNumber(offset + 23, $upri_rate, value);
	}
	
	/**
	 * 仕切率. Discount rate.<p>
	 *
	 */
	public void upri_rate(int value) {
		setConstNumber(offset + 23, $upri_rate, value);
	}
	
	/**
	 * 仕切率. Discount rate.<p>
	 *
	 */
	public void upri_rate(long value) {
		setConstNumber(offset + 23, $upri_rate, value);
	}
	
	/**
	 * 仕切率. Discount rate.<p>
	 *
	 */
	public void upri_rate(float value) {
		setConstNumber(offset + 23, $upri_rate, value);
	}
	
	/**
	 * 仕切率. Discount rate.<p>
	 *
	 */
	public void upri_rate(double value) {
		setConstNumber(offset + 23, $upri_rate, value);
	}
	
	/**
	 * 取引通貨仕切単価. Discount unit price (Transaction currency).<p>
	 *
	 */
	public MCNumber trd_cur_upri() {
		return getConstNumber(offset + 24, $trd_cur_upri);
	}

	/**
	 * 取引通貨仕切単価. Discount unit price (Transaction currency).<p>
	 *
	 */
	public void trd_cur_upri(MCNumber value) {
		setConstNumber(offset + 24, $trd_cur_upri, value);
	}
	
	/**
	 * 取引通貨仕切単価. Discount unit price (Transaction currency).<p>
	 *
	 */
	public void trd_cur_upri(int value) {
		setConstNumber(offset + 24, $trd_cur_upri, value);
	}
	
	/**
	 * 取引通貨仕切単価. Discount unit price (Transaction currency).<p>
	 *
	 */
	public void trd_cur_upri(long value) {
		setConstNumber(offset + 24, $trd_cur_upri, value);
	}
	
	/**
	 * 取引通貨仕切単価. Discount unit price (Transaction currency).<p>
	 *
	 */
	public void trd_cur_upri(float value) {
		setConstNumber(offset + 24, $trd_cur_upri, value);
	}
	
	/**
	 * 取引通貨仕切単価. Discount unit price (Transaction currency).<p>
	 *
	 */
	public void trd_cur_upri(double value) {
		setConstNumber(offset + 24, $trd_cur_upri, value);
	}
	
	/**
	 * 取引通貨仕切金額. Discount unit amount (Transaction currency).<p>
	 *
	 */
	public MCNumber trd_cur_amt() {
		return getConstNumber(offset + 25, $trd_cur_amt);
	}

	/**
	 * 取引通貨仕切金額. Discount unit amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_amt(MCNumber value) {
		setConstNumber(offset + 25, $trd_cur_amt, value);
	}
	
	/**
	 * 取引通貨仕切金額. Discount unit amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_amt(int value) {
		setConstNumber(offset + 25, $trd_cur_amt, value);
	}
	
	/**
	 * 取引通貨仕切金額. Discount unit amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_amt(long value) {
		setConstNumber(offset + 25, $trd_cur_amt, value);
	}
	
	/**
	 * 取引通貨仕切金額. Discount unit amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_amt(float value) {
		setConstNumber(offset + 25, $trd_cur_amt, value);
	}
	
	/**
	 * 取引通貨仕切金額. Discount unit amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_amt(double value) {
		setConstNumber(offset + 25, $trd_cur_amt, value);
	}
	
	/**
	 * 原価単価. Unit cost.<p>
	 *
	 */
	public MCNumber cost_upri() {
		return getConstNumber(offset + 26, $cost_upri);
	}

	/**
	 * 原価単価. Unit cost.<p>
	 *
	 */
	public void cost_upri(MCNumber value) {
		setConstNumber(offset + 26, $cost_upri, value);
	}
	
	/**
	 * 原価単価. Unit cost.<p>
	 *
	 */
	public void cost_upri(int value) {
		setConstNumber(offset + 26, $cost_upri, value);
	}
	
	/**
	 * 原価単価. Unit cost.<p>
	 *
	 */
	public void cost_upri(long value) {
		setConstNumber(offset + 26, $cost_upri, value);
	}
	
	/**
	 * 原価単価. Unit cost.<p>
	 *
	 */
	public void cost_upri(float value) {
		setConstNumber(offset + 26, $cost_upri, value);
	}
	
	/**
	 * 原価単価. Unit cost.<p>
	 *
	 */
	public void cost_upri(double value) {
		setConstNumber(offset + 26, $cost_upri, value);
	}
	
	/**
	 * 原価金額. Total cost.<p>
	 *
	 */
	public MCNumber cost_amt() {
		return getConstNumber(offset + 27, $cost_amt);
	}

	/**
	 * 原価金額. Total cost.<p>
	 *
	 */
	public void cost_amt(MCNumber value) {
		setConstNumber(offset + 27, $cost_amt, value);
	}
	
	/**
	 * 原価金額. Total cost.<p>
	 *
	 */
	public void cost_amt(int value) {
		setConstNumber(offset + 27, $cost_amt, value);
	}
	
	/**
	 * 原価金額. Total cost.<p>
	 *
	 */
	public void cost_amt(long value) {
		setConstNumber(offset + 27, $cost_amt, value);
	}
	
	/**
	 * 原価金額. Total cost.<p>
	 *
	 */
	public void cost_amt(float value) {
		setConstNumber(offset + 27, $cost_amt, value);
	}
	
	/**
	 * 原価金額. Total cost.<p>
	 *
	 */
	public void cost_amt(double value) {
		setConstNumber(offset + 27, $cost_amt, value);
	}
	
	/**
	 * 見積構成備考. Quotation terms remarks.<p>
	 *
	 */
	public String rmrks() {
		return getConstString(offset + 28, $rmrks);
	}

	/**
	 * 見積構成備考. Quotation terms remarks.<p>
	 *
	 */
	public void rmrks(String value) {
		setConstString(offset + 28, $rmrks, value);
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
		if ($qtn_itm_comp_no.equalsIgnoreCase(name)) {
			return qtn_itm_comp_no();
		}
		if ($qtn_d_no.equalsIgnoreCase(name)) {
			return qtn_d_no();
		}
		if ($qtn_itm_comp_lno.equalsIgnoreCase(name)) {
			return qtn_itm_comp_lno();
		}
		if ($sls_itm_comp_no.equalsIgnoreCase(name)) {
			return sls_itm_comp_no();
		}
		if ($itm_cd.equalsIgnoreCase(name)) {
			return itm_cd();
		}
		if ($itm_sub1.equalsIgnoreCase(name)) {
			return itm_sub1();
		}
		if ($itm_sub2.equalsIgnoreCase(name)) {
			return itm_sub2();
		}
		if ($itm_sub3.equalsIgnoreCase(name)) {
			return itm_sub3();
		}
		if ($sno1.equalsIgnoreCase(name)) {
			return sno1();
		}
		if ($sno2.equalsIgnoreCase(name)) {
			return sno2();
		}
		if ($sno3.equalsIgnoreCase(name)) {
			return sno3();
		}
		if ($sno4.equalsIgnoreCase(name)) {
			return sno4();
		}
		if ($itm_nm.equalsIgnoreCase(name)) {
			return itm_nm();
		}
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			return trd_unit_cd();
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($rmrks.equalsIgnoreCase(name)) {
			return rmrks();
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
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			return trd_unit_qty();
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			return base_unit_qty();
		}
		if ($trd_cur_std_sls_upri.equalsIgnoreCase(name)) {
			return trd_cur_std_sls_upri();
		}
		if ($trd_cur_std_sls_amt.equalsIgnoreCase(name)) {
			return trd_cur_std_sls_amt();
		}
		if ($upri_rate.equalsIgnoreCase(name)) {
			return upri_rate();
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			return trd_cur_upri();
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			return trd_cur_amt();
		}
		if ($cost_upri.equalsIgnoreCase(name)) {
			return cost_upri();
		}
		if ($cost_amt.equalsIgnoreCase(name)) {
			return cost_amt();
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
		if ($sundry_itm_flg.equalsIgnoreCase(name)) {
			return sundry_itm_flg();
		}
		if ($core_itm_flg.equalsIgnoreCase(name)) {
			return core_itm_flg();
		}
		if ($mst_flg.equalsIgnoreCase(name)) {
			return mst_flg();
		}
		if ($std_comp_flg.equalsIgnoreCase(name)) {
			return std_comp_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($qtn_itm_comp_no.equalsIgnoreCase(name)) {
			return qtn_itm_comp_no();
		}
		if ($qtn_d_no.equalsIgnoreCase(name)) {
			return qtn_d_no();
		}
		if ($qtn_itm_comp_lno.equalsIgnoreCase(name)) {
			return qtn_itm_comp_lno();
		}
		if ($sls_itm_comp_no.equalsIgnoreCase(name)) {
			return sls_itm_comp_no();
		}
		if ($itm_cd.equalsIgnoreCase(name)) {
			return itm_cd();
		}
		if ($itm_sub1.equalsIgnoreCase(name)) {
			return itm_sub1();
		}
		if ($itm_sub2.equalsIgnoreCase(name)) {
			return itm_sub2();
		}
		if ($itm_sub3.equalsIgnoreCase(name)) {
			return itm_sub3();
		}
		if ($sno1.equalsIgnoreCase(name)) {
			return sno1();
		}
		if ($sno2.equalsIgnoreCase(name)) {
			return sno2();
		}
		if ($sno3.equalsIgnoreCase(name)) {
			return sno3();
		}
		if ($sno4.equalsIgnoreCase(name)) {
			return sno4();
		}
		if ($itm_nm.equalsIgnoreCase(name)) {
			return itm_nm();
		}
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			return trd_unit_cd();
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($rmrks.equalsIgnoreCase(name)) {
			return rmrks();
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
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			return trd_unit_qty();
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			return base_unit_qty();
		}
		if ($trd_cur_std_sls_upri.equalsIgnoreCase(name)) {
			return trd_cur_std_sls_upri();
		}
		if ($trd_cur_std_sls_amt.equalsIgnoreCase(name)) {
			return trd_cur_std_sls_amt();
		}
		if ($upri_rate.equalsIgnoreCase(name)) {
			return upri_rate();
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			return trd_cur_upri();
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			return trd_cur_amt();
		}
		if ($cost_upri.equalsIgnoreCase(name)) {
			return cost_upri();
		}
		if ($cost_amt.equalsIgnoreCase(name)) {
			return cost_amt();
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
		if ($sundry_itm_flg.equalsIgnoreCase(name)) {
			return sundry_itm_flg();
		}
		if ($core_itm_flg.equalsIgnoreCase(name)) {
			return core_itm_flg();
		}
		if ($mst_flg.equalsIgnoreCase(name)) {
			return mst_flg();
		}
		if ($std_comp_flg.equalsIgnoreCase(name)) {
			return std_comp_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($qtn_itm_comp_no.equalsIgnoreCase(name)) {
			qtn_itm_comp_no(value);
			return;
		}
		if ($qtn_d_no.equalsIgnoreCase(name)) {
			qtn_d_no(value);
			return;
		}
		if ($qtn_itm_comp_lno.equalsIgnoreCase(name)) {
			qtn_itm_comp_lno(value);
			return;
		}
		if ($sls_itm_comp_no.equalsIgnoreCase(name)) {
			sls_itm_comp_no(value);
			return;
		}
		if ($itm_cd.equalsIgnoreCase(name)) {
			itm_cd(value);
			return;
		}
		if ($itm_sub1.equalsIgnoreCase(name)) {
			itm_sub1(value);
			return;
		}
		if ($itm_sub2.equalsIgnoreCase(name)) {
			itm_sub2(value);
			return;
		}
		if ($itm_sub3.equalsIgnoreCase(name)) {
			itm_sub3(value);
			return;
		}
		if ($sno1.equalsIgnoreCase(name)) {
			sno1(value);
			return;
		}
		if ($sno2.equalsIgnoreCase(name)) {
			sno2(value);
			return;
		}
		if ($sno3.equalsIgnoreCase(name)) {
			sno3(value);
			return;
		}
		if ($sno4.equalsIgnoreCase(name)) {
			sno4(value);
			return;
		}
		if ($itm_nm.equalsIgnoreCase(name)) {
			itm_nm(value);
			return;
		}
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			trd_unit_cd(value);
			return;
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			base_unit_cd(value);
			return;
		}
		if ($rmrks.equalsIgnoreCase(name)) {
			rmrks(value);
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
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($trd_cur_std_sls_upri.equalsIgnoreCase(name)) {
			trd_cur_std_sls_upri(value);
			return;
		}
		if ($trd_cur_std_sls_amt.equalsIgnoreCase(name)) {
			trd_cur_std_sls_amt(value);
			return;
		}
		if ($upri_rate.equalsIgnoreCase(name)) {
			upri_rate(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($cost_upri.equalsIgnoreCase(name)) {
			cost_upri(value);
			return;
		}
		if ($cost_amt.equalsIgnoreCase(name)) {
			cost_amt(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, int value) {
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($trd_cur_std_sls_upri.equalsIgnoreCase(name)) {
			trd_cur_std_sls_upri(value);
			return;
		}
		if ($trd_cur_std_sls_amt.equalsIgnoreCase(name)) {
			trd_cur_std_sls_amt(value);
			return;
		}
		if ($upri_rate.equalsIgnoreCase(name)) {
			upri_rate(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($cost_upri.equalsIgnoreCase(name)) {
			cost_upri(value);
			return;
		}
		if ($cost_amt.equalsIgnoreCase(name)) {
			cost_amt(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, long value) {
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($trd_cur_std_sls_upri.equalsIgnoreCase(name)) {
			trd_cur_std_sls_upri(value);
			return;
		}
		if ($trd_cur_std_sls_amt.equalsIgnoreCase(name)) {
			trd_cur_std_sls_amt(value);
			return;
		}
		if ($upri_rate.equalsIgnoreCase(name)) {
			upri_rate(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($cost_upri.equalsIgnoreCase(name)) {
			cost_upri(value);
			return;
		}
		if ($cost_amt.equalsIgnoreCase(name)) {
			cost_amt(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, float value) {
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($trd_cur_std_sls_upri.equalsIgnoreCase(name)) {
			trd_cur_std_sls_upri(value);
			return;
		}
		if ($trd_cur_std_sls_amt.equalsIgnoreCase(name)) {
			trd_cur_std_sls_amt(value);
			return;
		}
		if ($upri_rate.equalsIgnoreCase(name)) {
			upri_rate(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($cost_upri.equalsIgnoreCase(name)) {
			cost_upri(value);
			return;
		}
		if ($cost_amt.equalsIgnoreCase(name)) {
			cost_amt(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, double value) {
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($trd_cur_std_sls_upri.equalsIgnoreCase(name)) {
			trd_cur_std_sls_upri(value);
			return;
		}
		if ($trd_cur_std_sls_amt.equalsIgnoreCase(name)) {
			trd_cur_std_sls_amt(value);
			return;
		}
		if ($upri_rate.equalsIgnoreCase(name)) {
			upri_rate(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($cost_upri.equalsIgnoreCase(name)) {
			cost_upri(value);
			return;
		}
		if ($cost_amt.equalsIgnoreCase(name)) {
			cost_amt(value);
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
		if ($sundry_itm_flg.equalsIgnoreCase(name)) {
			sundry_itm_flg(value);
			return;
		}
		if ($core_itm_flg.equalsIgnoreCase(name)) {
			core_itm_flg(value);
			return;
		}
		if ($mst_flg.equalsIgnoreCase(name)) {
			mst_flg(value);
			return;
		}
		if ($std_comp_flg.equalsIgnoreCase(name)) {
			std_comp_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($qtn_itm_comp_no.equalsIgnoreCase(name)) {
			qtn_itm_comp_no(value);
			return;
		}
		if ($qtn_d_no.equalsIgnoreCase(name)) {
			qtn_d_no(value);
			return;
		}
		if ($qtn_itm_comp_lno.equalsIgnoreCase(name)) {
			qtn_itm_comp_lno(value);
			return;
		}
		if ($sls_itm_comp_no.equalsIgnoreCase(name)) {
			sls_itm_comp_no(value);
			return;
		}
		if ($itm_cd.equalsIgnoreCase(name)) {
			itm_cd(value);
			return;
		}
		if ($itm_sub1.equalsIgnoreCase(name)) {
			itm_sub1(value);
			return;
		}
		if ($itm_sub2.equalsIgnoreCase(name)) {
			itm_sub2(value);
			return;
		}
		if ($itm_sub3.equalsIgnoreCase(name)) {
			itm_sub3(value);
			return;
		}
		if ($sno1.equalsIgnoreCase(name)) {
			sno1(value);
			return;
		}
		if ($sno2.equalsIgnoreCase(name)) {
			sno2(value);
			return;
		}
		if ($sno3.equalsIgnoreCase(name)) {
			sno3(value);
			return;
		}
		if ($sno4.equalsIgnoreCase(name)) {
			sno4(value);
			return;
		}
		if ($itm_nm.equalsIgnoreCase(name)) {
			itm_nm(value);
			return;
		}
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			trd_unit_cd(value);
			return;
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			base_unit_cd(value);
			return;
		}
		if ($rmrks.equalsIgnoreCase(name)) {
			rmrks(value);
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
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($trd_cur_std_sls_upri.equalsIgnoreCase(name)) {
			trd_cur_std_sls_upri(value);
			return;
		}
		if ($trd_cur_std_sls_amt.equalsIgnoreCase(name)) {
			trd_cur_std_sls_amt(value);
			return;
		}
		if ($upri_rate.equalsIgnoreCase(name)) {
			upri_rate(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($cost_upri.equalsIgnoreCase(name)) {
			cost_upri(value);
			return;
		}
		if ($cost_amt.equalsIgnoreCase(name)) {
			cost_amt(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, int value) {
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($trd_cur_std_sls_upri.equalsIgnoreCase(name)) {
			trd_cur_std_sls_upri(value);
			return;
		}
		if ($trd_cur_std_sls_amt.equalsIgnoreCase(name)) {
			trd_cur_std_sls_amt(value);
			return;
		}
		if ($upri_rate.equalsIgnoreCase(name)) {
			upri_rate(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($cost_upri.equalsIgnoreCase(name)) {
			cost_upri(value);
			return;
		}
		if ($cost_amt.equalsIgnoreCase(name)) {
			cost_amt(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, long value) {
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($trd_cur_std_sls_upri.equalsIgnoreCase(name)) {
			trd_cur_std_sls_upri(value);
			return;
		}
		if ($trd_cur_std_sls_amt.equalsIgnoreCase(name)) {
			trd_cur_std_sls_amt(value);
			return;
		}
		if ($upri_rate.equalsIgnoreCase(name)) {
			upri_rate(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($cost_upri.equalsIgnoreCase(name)) {
			cost_upri(value);
			return;
		}
		if ($cost_amt.equalsIgnoreCase(name)) {
			cost_amt(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, float value) {
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($trd_cur_std_sls_upri.equalsIgnoreCase(name)) {
			trd_cur_std_sls_upri(value);
			return;
		}
		if ($trd_cur_std_sls_amt.equalsIgnoreCase(name)) {
			trd_cur_std_sls_amt(value);
			return;
		}
		if ($upri_rate.equalsIgnoreCase(name)) {
			upri_rate(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($cost_upri.equalsIgnoreCase(name)) {
			cost_upri(value);
			return;
		}
		if ($cost_amt.equalsIgnoreCase(name)) {
			cost_amt(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, double value) {
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($trd_cur_std_sls_upri.equalsIgnoreCase(name)) {
			trd_cur_std_sls_upri(value);
			return;
		}
		if ($trd_cur_std_sls_amt.equalsIgnoreCase(name)) {
			trd_cur_std_sls_amt(value);
			return;
		}
		if ($upri_rate.equalsIgnoreCase(name)) {
			upri_rate(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($cost_upri.equalsIgnoreCase(name)) {
			cost_upri(value);
			return;
		}
		if ($cost_amt.equalsIgnoreCase(name)) {
			cost_amt(value);
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
		if ($sundry_itm_flg.equalsIgnoreCase(name)) {
			sundry_itm_flg(value);
			return;
		}
		if ($core_itm_flg.equalsIgnoreCase(name)) {
			core_itm_flg(value);
			return;
		}
		if ($mst_flg.equalsIgnoreCase(name)) {
			mst_flg(value);
			return;
		}
		if ($std_comp_flg.equalsIgnoreCase(name)) {
			std_comp_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

}
