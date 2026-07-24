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
 * "需要情報 // Demand"DBコンテナRowクラスです。<p>
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
 *  	<td>dmnd_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>需要ＮＯ</td>
 *  	<td>Demand No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>dmnd_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>需要日</td>
 *  	<td>Demand date</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>dmnd_st_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>需要期間開始日</td>
 *  	<td>Demand period start date</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>dmnd_end_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>需要期間終了日</td>
 *  	<td>Demand period end date</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>dlv_schd_st_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>納品予定期間開始日</td>
 *  	<td>Delivery schedule period start date</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>dlv_schd_end_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>納品予定期間終了日</td>
 *  	<td>Delivery schedule period end date</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>dmnd_period_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>需要期間区分</td>
 *  	<td>Demand period type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>dly_div_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>日ばらし対象ＦＬＧ</td>
 *  	<td>For disaggregation by day flg.</td>
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
 *  	<td>spln_itm_cd</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>計画品目ＣＤ</td>
 *  	<td>Plan item cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>dmnd_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>需要区分</td>
 *  	<td>Demand type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>dmnd_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>需要数量</td>
 *  	<td>Demand qty.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>input_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>登録数量</td>
 *  	<td>Entry qty.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>rec_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>消込数量</td>
 *  	<td>Matching qty.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>dmnd_dpt_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>需要元部門ＣＤ</td>
 *  	<td>Demand source dept. cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>wrk_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>案件ＮＯ</td>
 *  	<td>Sales project No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>dmnd_usr_cd</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>担当者ＣＤ</td>
 *  	<td>PIC cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>cst_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>得意先ＣＤ</td>
 *  	<td>Customer cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>dlv_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>納品先ＣＤ</td>
 *  	<td>Delivery destination cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>slo_d_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>受注明細ＮＯ</td>
 *  	<td>Sales order details No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>slo_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>受注ＮＯ</td>
 *  	<td>Sales order No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>cst_frcst_d_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>顧客期間内示明細ＮＯ</td>
 *  	<td>Sales forecast details No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>cst_frcst_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>顧客期間内示ＮＯ</td>
 *  	<td>Sales forecast No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ym</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>計画月度</td>
 *  	<td>Plan month</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>spln_vers</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>販売計画バージョン</td>
 *  	<td>Sales plan version</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>cur_cd</td>
 *  	<td>C</td>
 *  	<td>3</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>通貨ＣＤ</td>
 *  	<td>Currency cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sno1</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>手配ＮＯ１</td>
 *  	<td>SEIBAN No. 1</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sno2</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>手配ＮＯ２</td>
 *  	<td>SEIBAN No. 2</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sno3</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>手配ＮＯ３</td>
 *  	<td>SEIBAN No. 3</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sno4</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>手配ＮＯ４</td>
 *  	<td>SEIBAN No. 4</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>dmnd_loc_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>需要場所ＣＤ</td>
 *  	<td>Demand location cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>intr_rmrks</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>内部備考</td>
 *  	<td>Internal remarks</td>
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
public class MST_DMND_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.CO_VIEW;

	public static final String TABLE_NAME = "MST_DMND";

	public static final boolean EX_CTRL = true;
	
	public static final boolean LCL_TABLE = false;
	
	/**
	 * 需要ＮＯ. Demand No..<p>
	 *
	 */
	public static final String $dmnd_no = "dmnd_no";
	private static final MCPermColumnInfo _dmnd_no = createColumnInfo("dmnd_no");
	public final MCStringPermColumn dmnd_no = createStringColumn(_dmnd_no);
	
	/**
	 * 需要日. Demand date.<p>
	 *
	 */
	public static final String $dmnd_dt = "dmnd_dt";
	private static final MCPermColumnInfo _dmnd_dt = createColumnInfo("dmnd_dt");
	public final MCDatePermColumn dmnd_dt = createDateColumn(_dmnd_dt);
	
	/**
	 * 需要期間開始日. Demand period start date.<p>
	 *
	 */
	public static final String $dmnd_st_dt = "dmnd_st_dt";
	private static final MCPermColumnInfo _dmnd_st_dt = createColumnInfo("dmnd_st_dt");
	public final MCDatePermColumn dmnd_st_dt = createDateColumn(_dmnd_st_dt);
	
	/**
	 * 需要期間終了日. Demand period end date.<p>
	 *
	 */
	public static final String $dmnd_end_dt = "dmnd_end_dt";
	private static final MCPermColumnInfo _dmnd_end_dt = createColumnInfo("dmnd_end_dt");
	public final MCDatePermColumn dmnd_end_dt = createDateColumn(_dmnd_end_dt);
	
	/**
	 * 納品予定期間開始日. Delivery schedule period start date.<p>
	 *
	 */
	public static final String $dlv_schd_st_dt = "dlv_schd_st_dt";
	private static final MCPermColumnInfo _dlv_schd_st_dt = createColumnInfo("dlv_schd_st_dt");
	public final MCDatePermColumn dlv_schd_st_dt = createDateColumn(_dlv_schd_st_dt);
	
	/**
	 * 納品予定期間終了日. Delivery schedule period end date.<p>
	 *
	 */
	public static final String $dlv_schd_end_dt = "dlv_schd_end_dt";
	private static final MCPermColumnInfo _dlv_schd_end_dt = createColumnInfo("dlv_schd_end_dt");
	public final MCDatePermColumn dlv_schd_end_dt = createDateColumn(_dlv_schd_end_dt);
	
	/**
	 * 需要期間区分. Demand period type.<p>
	 *
	 */
	public static final String $dmnd_period_typ = "dmnd_period_typ";
	private static final MCPermColumnInfo _dmnd_period_typ = createColumnInfo("dmnd_period_typ");
	public final MCStringPermColumn dmnd_period_typ = createStringColumn(_dmnd_period_typ);
	
	/**
	 * 日ばらし対象ＦＬＧ. For disaggregation by day flg..<p>
	 *
	 */
	public static final String $dly_div_flg = "dly_div_flg";
	private static final MCPermColumnInfo _dly_div_flg = createColumnInfo("dly_div_flg");
	public final MCBooleanPermColumn dly_div_flg = createBooleanColumn(_dly_div_flg);
	
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
	 * 計画品目ＣＤ. Plan item cd..<p>
	 *
	 */
	public static final String $spln_itm_cd = "spln_itm_cd";
	private static final MCPermColumnInfo _spln_itm_cd = createColumnInfo("spln_itm_cd");
	public final MCStringPermColumn spln_itm_cd = createStringColumn(_spln_itm_cd);
	
	/**
	 * 需要区分. Demand type.<p>
	 *
	 */
	public static final String $dmnd_typ = "dmnd_typ";
	private static final MCPermColumnInfo _dmnd_typ = createColumnInfo("dmnd_typ");
	public final MCStringPermColumn dmnd_typ = createStringColumn(_dmnd_typ);
	
	/**
	 * 需要数量. Demand qty..<p>
	 *
	 */
	public static final String $dmnd_qty = "dmnd_qty";
	private static final MCPermColumnInfo _dmnd_qty = createColumnInfo("dmnd_qty");
	public final MCNumberPermColumn dmnd_qty = createNumberColumn(_dmnd_qty);
	
	/**
	 * 登録数量. Entry qty..<p>
	 *
	 */
	public static final String $input_qty = "input_qty";
	private static final MCPermColumnInfo _input_qty = createColumnInfo("input_qty");
	public final MCNumberPermColumn input_qty = createNumberColumn(_input_qty);
	
	/**
	 * 消込数量. Matching qty..<p>
	 *
	 */
	public static final String $rec_qty = "rec_qty";
	private static final MCPermColumnInfo _rec_qty = createColumnInfo("rec_qty");
	public final MCNumberPermColumn rec_qty = createNumberColumn(_rec_qty);
	
	/**
	 * 需要元部門ＣＤ. Demand source dept. cd..<p>
	 *
	 */
	public static final String $dmnd_dpt_cd = "dmnd_dpt_cd";
	private static final MCPermColumnInfo _dmnd_dpt_cd = createColumnInfo("dmnd_dpt_cd");
	public final MCStringPermColumn dmnd_dpt_cd = createStringColumn(_dmnd_dpt_cd);
	
	/**
	 * 案件ＮＯ. Sales project No..<p>
	 *
	 */
	public static final String $wrk_no = "wrk_no";
	private static final MCPermColumnInfo _wrk_no = createColumnInfo("wrk_no");
	public final MCStringPermColumn wrk_no = createStringColumn(_wrk_no);
	
	/**
	 * 担当者ＣＤ. PIC cd..<p>
	 *
	 */
	public static final String $dmnd_usr_cd = "dmnd_usr_cd";
	private static final MCPermColumnInfo _dmnd_usr_cd = createColumnInfo("dmnd_usr_cd");
	public final MCStringPermColumn dmnd_usr_cd = createStringColumn(_dmnd_usr_cd);
	
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
	 * 受注明細ＮＯ. Sales order details No..<p>
	 *
	 */
	public static final String $slo_d_no = "slo_d_no";
	private static final MCPermColumnInfo _slo_d_no = createColumnInfo("slo_d_no");
	public final MCStringPermColumn slo_d_no = createStringColumn(_slo_d_no);
	
	/**
	 * 受注ＮＯ. Sales order No..<p>
	 *
	 */
	public static final String $slo_no = "slo_no";
	private static final MCPermColumnInfo _slo_no = createColumnInfo("slo_no");
	public final MCStringPermColumn slo_no = createStringColumn(_slo_no);
	
	/**
	 * 顧客期間内示明細ＮＯ. Sales forecast details No..<p>
	 *
	 */
	public static final String $cst_frcst_d_no = "cst_frcst_d_no";
	private static final MCPermColumnInfo _cst_frcst_d_no = createColumnInfo("cst_frcst_d_no");
	public final MCStringPermColumn cst_frcst_d_no = createStringColumn(_cst_frcst_d_no);
	
	/**
	 * 顧客期間内示ＮＯ. Sales forecast No..<p>
	 *
	 */
	public static final String $cst_frcst_no = "cst_frcst_no";
	private static final MCPermColumnInfo _cst_frcst_no = createColumnInfo("cst_frcst_no");
	public final MCStringPermColumn cst_frcst_no = createStringColumn(_cst_frcst_no);
	
	/**
	 * 計画月度. Plan month.<p>
	 *
	 */
	public static final String $ym = "ym";
	private static final MCPermColumnInfo _ym = createColumnInfo("ym");
	public final MCDatePermColumn ym = createDateColumn(_ym);
	
	/**
	 * 販売計画バージョン. Sales plan version.<p>
	 *
	 */
	public static final String $spln_vers = "spln_vers";
	private static final MCPermColumnInfo _spln_vers = createColumnInfo("spln_vers");
	public final MCStringPermColumn spln_vers = createStringColumn(_spln_vers);
	
	/**
	 * 通貨ＣＤ. Currency cd..<p>
	 *
	 */
	public static final String $cur_cd = "cur_cd";
	private static final MCPermColumnInfo _cur_cd = createColumnInfo("cur_cd");
	public final MCStringPermColumn cur_cd = createStringColumn(_cur_cd);
	
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
	 * 需要場所ＣＤ. Demand location cd..<p>
	 *
	 */
	public static final String $dmnd_loc_cd = "dmnd_loc_cd";
	private static final MCPermColumnInfo _dmnd_loc_cd = createColumnInfo("dmnd_loc_cd");
	public final MCStringPermColumn dmnd_loc_cd = createStringColumn(_dmnd_loc_cd);
	
	/**
	 * 内部備考. Internal remarks.<p>
	 *
	 */
	public static final String $intr_rmrks = "intr_rmrks";
	private static final MCPermColumnInfo _intr_rmrks = createColumnInfo("intr_rmrks");
	public final MCStringPermColumn intr_rmrks = createStringColumn(_intr_rmrks);
	
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
	
	public static final MCMeta dmnd_no_META = createCommonMeta($dmnd_no, mcframe.commonMA.meta.MA_META.DMND_NO);
	public static final MCMeta dmnd_dt_META = createCommonMeta($dmnd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta dmnd_st_dt_META = createCommonMeta($dmnd_st_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta dmnd_end_dt_META = createCommonMeta($dmnd_end_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta dlv_schd_st_dt_META = createCommonMeta($dlv_schd_st_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta dlv_schd_end_dt_META = createCommonMeta($dlv_schd_end_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta dmnd_period_typ_META = createCommonMeta($dmnd_period_typ, mcframe.commonMA.meta.MA_META.PERIOD_TYP);
	public static final MCMeta dly_div_flg_META = createCommonMeta($dly_div_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta spln_itm_cd_META = createCommonMeta($spln_itm_cd, mcframe.commonMA.meta.MA_META.SPLN_ITM_CD);
	public static final MCMeta dmnd_typ_META = createCommonMeta($dmnd_typ, mcframe.commonMS.meta.MS_META.DMND_TYP);
	public static final MCMeta dmnd_qty_META = createCommonMeta($dmnd_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta input_qty_META = createCommonMeta($input_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta rec_qty_META = createCommonMeta($rec_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta dmnd_dpt_cd_META = createCommonMeta($dmnd_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta wrk_no_META = createCommonMeta($wrk_no, mcframe.commonMA.meta.MA_META.WRK_NO);
	public static final MCMeta dmnd_usr_cd_META = createCommonMeta($dmnd_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta cst_cd_META = createCommonMeta($cst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta dlv_cd_META = createCommonMeta($dlv_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta slo_d_no_META = createCommonMeta($slo_d_no, mcframe.commonMA.meta.MA_META.SLO_D_NO);
	public static final MCMeta slo_no_META = createCommonMeta($slo_no, mcframe.commonMA.meta.MA_META.SLO_NO);
	public static final MCMeta cst_frcst_d_no_META = createCommonMeta($cst_frcst_d_no, mcframe.commonMA.meta.MA_META.CST_FRCST_D_NO);
	public static final MCMeta cst_frcst_no_META = createCommonMeta($cst_frcst_no, mcframe.commonMA.meta.MA_META.CST_FRCST_NO);
	public static final MCMeta ym_META = createCommonMeta($ym, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta spln_vers_META = createCommonMeta($spln_vers, mcframe.commonMS.meta.MS_META.SPLN_VERS);
	public static final MCMeta cur_cd_META = createCommonMeta($cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta sno1_META = createCommonMeta($sno1, mcframe.commonMA.meta.MA_META.SNO1);
	public static final MCMeta sno2_META = createCommonMeta($sno2, mcframe.commonMA.meta.MA_META.SNO2);
	public static final MCMeta sno3_META = createCommonMeta($sno3, mcframe.commonMA.meta.MA_META.SNO3);
	public static final MCMeta sno4_META = createCommonMeta($sno4, mcframe.commonMA.meta.MA_META.SNO4);
	public static final MCMeta dmnd_loc_cd_META = createCommonMeta($dmnd_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta intr_rmrks_META = createCommonMeta($intr_rmrks, mcframe.commonMS.meta.MS_META.DMND_INTR_RMRKS);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.DMND_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.DMND_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.DMND_SUB_CHAR3);
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
	
	protected static final ConstMetaList<MST_DMND_R> constMetas = new ConstMetaList<MST_DMND_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			dmnd_no_META,
			dmnd_dt_META,
			dmnd_st_dt_META,
			dmnd_end_dt_META,
			dlv_schd_st_dt_META,
			dlv_schd_end_dt_META,
			dmnd_period_typ_META,
			dly_div_flg_META,
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			spln_itm_cd_META,
			dmnd_typ_META,
			dmnd_qty_META,
			input_qty_META,
			rec_qty_META,
			dmnd_dpt_cd_META,
			wrk_no_META,
			dmnd_usr_cd_META,
			cst_cd_META,
			dlv_cd_META,
			slo_d_no_META,
			slo_no_META,
			cst_frcst_d_no_META,
			cst_frcst_no_META,
			ym_META,
			spln_vers_META,
			cur_cd_META,
			sno1_META,
			sno2_META,
			sno3_META,
			sno4_META,
			dmnd_loc_cd_META,
			intr_rmrks_META,
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
	protected MST_DMND_R(ConstMetaList<? extends MST_DMND_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MST_DMND_R(ConstMetaList<? extends MST_DMND_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MST_DMND_R.$dmnd_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_DMND_R.$dmnd_no,
				"dmnd_no",
				dmnd_no,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_DMND_R.$dmnd_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_DMND_R.$dmnd_dt,
				"dmnd_dt",
				dmnd_dt,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_DMND_R.$dmnd_st_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_DMND_R.$dmnd_st_dt,
				"dmnd_st_dt",
				dmnd_st_dt,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_DMND_R.$dmnd_end_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_DMND_R.$dmnd_end_dt,
				"dmnd_end_dt",
				dmnd_end_dt,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_DMND_R.$dlv_schd_st_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_DMND_R.$dlv_schd_st_dt,
				"dlv_schd_st_dt",
				dlv_schd_st_dt,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_DMND_R.$dlv_schd_end_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_DMND_R.$dlv_schd_end_dt,
				"dlv_schd_end_dt",
				dlv_schd_end_dt,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_DMND_R.$dmnd_period_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_DMND_R.$dmnd_period_typ,
				"dmnd_period_typ",
				dmnd_period_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_DMND_R.$dly_div_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_DMND_R.$dly_div_flg,
				"dly_div_flg",
				dly_div_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_DMND_R.$itm_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_DMND_R.$itm_cd,
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
			MST_DMND_R.$itm_sub1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_DMND_R.$itm_sub1,
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
			MST_DMND_R.$itm_sub2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_DMND_R.$itm_sub2,
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
			MST_DMND_R.$itm_sub3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_DMND_R.$itm_sub3,
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
			MST_DMND_R.$spln_itm_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_DMND_R.$spln_itm_cd,
				"spln_itm_cd",
				spln_itm_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_DMND_R.$dmnd_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_DMND_R.$dmnd_typ,
				"dmnd_typ",
				dmnd_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_DMND_R.$dmnd_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_DMND_R.$dmnd_qty,
				"dmnd_qty",
				dmnd_qty,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_DMND_R.$input_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_DMND_R.$input_qty,
				"input_qty",
				input_qty,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_DMND_R.$rec_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_DMND_R.$rec_qty,
				"rec_qty",
				rec_qty,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_DMND_R.$dmnd_dpt_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_DMND_R.$dmnd_dpt_cd,
				"dmnd_dpt_cd",
				dmnd_dpt_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_DMND_R.$wrk_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_DMND_R.$wrk_no,
				"wrk_no",
				wrk_no,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_DMND_R.$dmnd_usr_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_DMND_R.$dmnd_usr_cd,
				"dmnd_usr_cd",
				dmnd_usr_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_DMND_R.$cst_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_DMND_R.$cst_cd,
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
			MST_DMND_R.$dlv_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_DMND_R.$dlv_cd,
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
			MST_DMND_R.$slo_d_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_DMND_R.$slo_d_no,
				"slo_d_no",
				slo_d_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_DMND_R.$slo_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_DMND_R.$slo_no,
				"slo_no",
				slo_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_DMND_R.$cst_frcst_d_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_DMND_R.$cst_frcst_d_no,
				"cst_frcst_d_no",
				cst_frcst_d_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_DMND_R.$cst_frcst_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_DMND_R.$cst_frcst_no,
				"cst_frcst_no",
				cst_frcst_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_DMND_R.$ym,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_DMND_R.$ym,
				"ym",
				ym,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_DMND_R.$spln_vers,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_DMND_R.$spln_vers,
				"spln_vers",
				spln_vers,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_DMND_R.$cur_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_DMND_R.$cur_cd,
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
			MST_DMND_R.$sno1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_DMND_R.$sno1,
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
			MST_DMND_R.$sno2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_DMND_R.$sno2,
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
			MST_DMND_R.$sno3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_DMND_R.$sno3,
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
			MST_DMND_R.$sno4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_DMND_R.$sno4,
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
			MST_DMND_R.$dmnd_loc_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_DMND_R.$dmnd_loc_cd,
				"dmnd_loc_cd",
				dmnd_loc_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_DMND_R.$intr_rmrks,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_DMND_R.$intr_rmrks,
				"intr_rmrks",
				intr_rmrks,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_DMND_R.$sub_char1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_DMND_R.$sub_char1,
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
			MST_DMND_R.$sub_char2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_DMND_R.$sub_char2,
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
			MST_DMND_R.$sub_char3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_DMND_R.$sub_char3,
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
			MST_DMND_R.$ins_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_DMND_R.$ins_usr_id,
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
			MST_DMND_R.$ins_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_DMND_R.$ins_usr_nm,
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
			MST_DMND_R.$ins_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MST_DMND_R.$ins_ts,
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
			MST_DMND_R.$ins_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_DMND_R.$ins_func_id,
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
			MST_DMND_R.$upd_cntr,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_DMND_R.$upd_cntr,
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
			MST_DMND_R.$upd_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_DMND_R.$upd_usr_id,
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
			MST_DMND_R.$upd_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_DMND_R.$upd_usr_nm,
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
			MST_DMND_R.$upd_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MST_DMND_R.$upd_ts,
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
			MST_DMND_R.$upd_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_DMND_R.$upd_func_id,
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
			MST_DMND_R.$upd_srv_req_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_DMND_R.$upd_srv_req_no,
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
	public static MST_DMND_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MST_DMND_R create(String alias) {
		MST_DMND_R row = new MST_DMND_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MST_DMND_R createByName(T proto) {
		MST_DMND_R row = MST_DMND_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MST_DMND_R clone() {
		return (MST_DMND_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MST_DMND_R createInstance() {
		return (MST_DMND_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MST_DMND_R getValues(String... names) {
		return (MST_DMND_R) super.getValues(names);
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
	 public MSW_DMND_KEY_R getPkWorkDbc(String alias) {
	 	return MSW_DMND_KEY_R.create(alias);
	 }

	/*
	 * MCDBContainerのオーバーライドメソッドです。
	 */
	 public MSW_DMND_KEY_R getPkWorkDbc() {
	 	return getPkWorkDbc(MSW_DMND_KEY_R.TABLE_NAME);
	 }

	/**
	 * 需要ＮＯ. Demand No..<p>
	 *
	 */
	public String dmnd_no() {
		return getConstString(offset + 0, $dmnd_no);
	}

	/**
	 * 需要ＮＯ. Demand No..<p>
	 *
	 */
	public void dmnd_no(String value) {
		setConstString(offset + 0, $dmnd_no, value);
	}

	/**
	 * 需要日. Demand date.<p>
	 *
	 */
	public MCDate dmnd_dt() {
		return getConstDate(offset + 1, $dmnd_dt);
	}

	/**
	 * 需要日. Demand date.<p>
	 *
	 */
	public void dmnd_dt(MCDate value) {
		setConstDate(offset + 1, $dmnd_dt, value);
	}

	/**
	 * 需要期間開始日. Demand period start date.<p>
	 *
	 */
	public MCDate dmnd_st_dt() {
		return getConstDate(offset + 2, $dmnd_st_dt);
	}

	/**
	 * 需要期間開始日. Demand period start date.<p>
	 *
	 */
	public void dmnd_st_dt(MCDate value) {
		setConstDate(offset + 2, $dmnd_st_dt, value);
	}

	/**
	 * 需要期間終了日. Demand period end date.<p>
	 *
	 */
	public MCDate dmnd_end_dt() {
		return getConstDate(offset + 3, $dmnd_end_dt);
	}

	/**
	 * 需要期間終了日. Demand period end date.<p>
	 *
	 */
	public void dmnd_end_dt(MCDate value) {
		setConstDate(offset + 3, $dmnd_end_dt, value);
	}

	/**
	 * 納品予定期間開始日. Delivery schedule period start date.<p>
	 *
	 */
	public MCDate dlv_schd_st_dt() {
		return getConstDate(offset + 4, $dlv_schd_st_dt);
	}

	/**
	 * 納品予定期間開始日. Delivery schedule period start date.<p>
	 *
	 */
	public void dlv_schd_st_dt(MCDate value) {
		setConstDate(offset + 4, $dlv_schd_st_dt, value);
	}

	/**
	 * 納品予定期間終了日. Delivery schedule period end date.<p>
	 *
	 */
	public MCDate dlv_schd_end_dt() {
		return getConstDate(offset + 5, $dlv_schd_end_dt);
	}

	/**
	 * 納品予定期間終了日. Delivery schedule period end date.<p>
	 *
	 */
	public void dlv_schd_end_dt(MCDate value) {
		setConstDate(offset + 5, $dlv_schd_end_dt, value);
	}

	/**
	 * 需要期間区分. Demand period type.<p>
	 *
	 */
	public String dmnd_period_typ() {
		return getConstString(offset + 6, $dmnd_period_typ);
	}

	/**
	 * 需要期間区分. Demand period type.<p>
	 *
	 */
	public void dmnd_period_typ(String value) {
		setConstString(offset + 6, $dmnd_period_typ, value);
	}

	/**
	 * 日ばらし対象ＦＬＧ. For disaggregation by day flg..<p>
	 *
	 */
	public boolean dly_div_flg() {
		return getConstBoolean(offset + 7, $dly_div_flg);
	}

	/**
	 * 日ばらし対象ＦＬＧ. For disaggregation by day flg..<p>
	 *
	 */
	public void dly_div_flg(boolean value) {
		setConstBoolean(offset + 7, $dly_div_flg, value);
	}

	/**
	 * 品目ＣＤ. Item cd..<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 8, $itm_cd);
	}

	/**
	 * 品目ＣＤ. Item cd..<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 8, $itm_cd, value);
	}

	/**
	 * 枝番１. Branch No. 1.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 9, $itm_sub1);
	}

	/**
	 * 枝番１. Branch No. 1.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 9, $itm_sub1, value);
	}

	/**
	 * 枝番２. Branch No. 2.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 10, $itm_sub2);
	}

	/**
	 * 枝番２. Branch No. 2.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 10, $itm_sub2, value);
	}

	/**
	 * 枝番３. Branch No. 3.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 11, $itm_sub3);
	}

	/**
	 * 枝番３. Branch No. 3.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 11, $itm_sub3, value);
	}

	/**
	 * 計画品目ＣＤ. Plan item cd..<p>
	 *
	 */
	public String spln_itm_cd() {
		return getConstString(offset + 12, $spln_itm_cd);
	}

	/**
	 * 計画品目ＣＤ. Plan item cd..<p>
	 *
	 */
	public void spln_itm_cd(String value) {
		setConstString(offset + 12, $spln_itm_cd, value);
	}

	/**
	 * 需要区分. Demand type.<p>
	 *
	 */
	public String dmnd_typ() {
		return getConstString(offset + 13, $dmnd_typ);
	}

	/**
	 * 需要区分. Demand type.<p>
	 *
	 */
	public void dmnd_typ(String value) {
		setConstString(offset + 13, $dmnd_typ, value);
	}

	/**
	 * 需要数量. Demand qty..<p>
	 *
	 */
	public MCNumber dmnd_qty() {
		return getConstNumber(offset + 14, $dmnd_qty);
	}

	/**
	 * 需要数量. Demand qty..<p>
	 *
	 */
	public void dmnd_qty(MCNumber value) {
		setConstNumber(offset + 14, $dmnd_qty, value);
	}
	
	/**
	 * 需要数量. Demand qty..<p>
	 *
	 */
	public void dmnd_qty(int value) {
		setConstNumber(offset + 14, $dmnd_qty, value);
	}
	
	/**
	 * 需要数量. Demand qty..<p>
	 *
	 */
	public void dmnd_qty(long value) {
		setConstNumber(offset + 14, $dmnd_qty, value);
	}
	
	/**
	 * 需要数量. Demand qty..<p>
	 *
	 */
	public void dmnd_qty(float value) {
		setConstNumber(offset + 14, $dmnd_qty, value);
	}
	
	/**
	 * 需要数量. Demand qty..<p>
	 *
	 */
	public void dmnd_qty(double value) {
		setConstNumber(offset + 14, $dmnd_qty, value);
	}
	
	/**
	 * 登録数量. Entry qty..<p>
	 *
	 */
	public MCNumber input_qty() {
		return getConstNumber(offset + 15, $input_qty);
	}

	/**
	 * 登録数量. Entry qty..<p>
	 *
	 */
	public void input_qty(MCNumber value) {
		setConstNumber(offset + 15, $input_qty, value);
	}
	
	/**
	 * 登録数量. Entry qty..<p>
	 *
	 */
	public void input_qty(int value) {
		setConstNumber(offset + 15, $input_qty, value);
	}
	
	/**
	 * 登録数量. Entry qty..<p>
	 *
	 */
	public void input_qty(long value) {
		setConstNumber(offset + 15, $input_qty, value);
	}
	
	/**
	 * 登録数量. Entry qty..<p>
	 *
	 */
	public void input_qty(float value) {
		setConstNumber(offset + 15, $input_qty, value);
	}
	
	/**
	 * 登録数量. Entry qty..<p>
	 *
	 */
	public void input_qty(double value) {
		setConstNumber(offset + 15, $input_qty, value);
	}
	
	/**
	 * 消込数量. Matching qty..<p>
	 *
	 */
	public MCNumber rec_qty() {
		return getConstNumber(offset + 16, $rec_qty);
	}

	/**
	 * 消込数量. Matching qty..<p>
	 *
	 */
	public void rec_qty(MCNumber value) {
		setConstNumber(offset + 16, $rec_qty, value);
	}
	
	/**
	 * 消込数量. Matching qty..<p>
	 *
	 */
	public void rec_qty(int value) {
		setConstNumber(offset + 16, $rec_qty, value);
	}
	
	/**
	 * 消込数量. Matching qty..<p>
	 *
	 */
	public void rec_qty(long value) {
		setConstNumber(offset + 16, $rec_qty, value);
	}
	
	/**
	 * 消込数量. Matching qty..<p>
	 *
	 */
	public void rec_qty(float value) {
		setConstNumber(offset + 16, $rec_qty, value);
	}
	
	/**
	 * 消込数量. Matching qty..<p>
	 *
	 */
	public void rec_qty(double value) {
		setConstNumber(offset + 16, $rec_qty, value);
	}
	
	/**
	 * 需要元部門ＣＤ. Demand source dept. cd..<p>
	 *
	 */
	public String dmnd_dpt_cd() {
		return getConstString(offset + 17, $dmnd_dpt_cd);
	}

	/**
	 * 需要元部門ＣＤ. Demand source dept. cd..<p>
	 *
	 */
	public void dmnd_dpt_cd(String value) {
		setConstString(offset + 17, $dmnd_dpt_cd, value);
	}

	/**
	 * 案件ＮＯ. Sales project No..<p>
	 *
	 */
	public String wrk_no() {
		return getConstString(offset + 18, $wrk_no);
	}

	/**
	 * 案件ＮＯ. Sales project No..<p>
	 *
	 */
	public void wrk_no(String value) {
		setConstString(offset + 18, $wrk_no, value);
	}

	/**
	 * 担当者ＣＤ. PIC cd..<p>
	 *
	 */
	public String dmnd_usr_cd() {
		return getConstString(offset + 19, $dmnd_usr_cd);
	}

	/**
	 * 担当者ＣＤ. PIC cd..<p>
	 *
	 */
	public void dmnd_usr_cd(String value) {
		setConstString(offset + 19, $dmnd_usr_cd, value);
	}

	/**
	 * 得意先ＣＤ. Customer cd..<p>
	 *
	 */
	public String cst_cd() {
		return getConstString(offset + 20, $cst_cd);
	}

	/**
	 * 得意先ＣＤ. Customer cd..<p>
	 *
	 */
	public void cst_cd(String value) {
		setConstString(offset + 20, $cst_cd, value);
	}

	/**
	 * 納品先ＣＤ. Delivery destination cd..<p>
	 *
	 */
	public String dlv_cd() {
		return getConstString(offset + 21, $dlv_cd);
	}

	/**
	 * 納品先ＣＤ. Delivery destination cd..<p>
	 *
	 */
	public void dlv_cd(String value) {
		setConstString(offset + 21, $dlv_cd, value);
	}

	/**
	 * 受注明細ＮＯ. Sales order details No..<p>
	 *
	 */
	public String slo_d_no() {
		return getConstString(offset + 22, $slo_d_no);
	}

	/**
	 * 受注明細ＮＯ. Sales order details No..<p>
	 *
	 */
	public void slo_d_no(String value) {
		setConstString(offset + 22, $slo_d_no, value);
	}

	/**
	 * 受注ＮＯ. Sales order No..<p>
	 *
	 */
	public String slo_no() {
		return getConstString(offset + 23, $slo_no);
	}

	/**
	 * 受注ＮＯ. Sales order No..<p>
	 *
	 */
	public void slo_no(String value) {
		setConstString(offset + 23, $slo_no, value);
	}

	/**
	 * 顧客期間内示明細ＮＯ. Sales forecast details No..<p>
	 *
	 */
	public String cst_frcst_d_no() {
		return getConstString(offset + 24, $cst_frcst_d_no);
	}

	/**
	 * 顧客期間内示明細ＮＯ. Sales forecast details No..<p>
	 *
	 */
	public void cst_frcst_d_no(String value) {
		setConstString(offset + 24, $cst_frcst_d_no, value);
	}

	/**
	 * 顧客期間内示ＮＯ. Sales forecast No..<p>
	 *
	 */
	public String cst_frcst_no() {
		return getConstString(offset + 25, $cst_frcst_no);
	}

	/**
	 * 顧客期間内示ＮＯ. Sales forecast No..<p>
	 *
	 */
	public void cst_frcst_no(String value) {
		setConstString(offset + 25, $cst_frcst_no, value);
	}

	/**
	 * 計画月度. Plan month.<p>
	 *
	 */
	public MCDate ym() {
		return getConstDate(offset + 26, $ym);
	}

	/**
	 * 計画月度. Plan month.<p>
	 *
	 */
	public void ym(MCDate value) {
		setConstDate(offset + 26, $ym, value);
	}

	/**
	 * 販売計画バージョン. Sales plan version.<p>
	 *
	 */
	public String spln_vers() {
		return getConstString(offset + 27, $spln_vers);
	}

	/**
	 * 販売計画バージョン. Sales plan version.<p>
	 *
	 */
	public void spln_vers(String value) {
		setConstString(offset + 27, $spln_vers, value);
	}

	/**
	 * 通貨ＣＤ. Currency cd..<p>
	 *
	 */
	public String cur_cd() {
		return getConstString(offset + 28, $cur_cd);
	}

	/**
	 * 通貨ＣＤ. Currency cd..<p>
	 *
	 */
	public void cur_cd(String value) {
		setConstString(offset + 28, $cur_cd, value);
	}

	/**
	 * 手配ＮＯ１. SEIBAN No. 1.<p>
	 *
	 */
	public String sno1() {
		return getConstString(offset + 29, $sno1);
	}

	/**
	 * 手配ＮＯ１. SEIBAN No. 1.<p>
	 *
	 */
	public void sno1(String value) {
		setConstString(offset + 29, $sno1, value);
	}

	/**
	 * 手配ＮＯ２. SEIBAN No. 2.<p>
	 *
	 */
	public String sno2() {
		return getConstString(offset + 30, $sno2);
	}

	/**
	 * 手配ＮＯ２. SEIBAN No. 2.<p>
	 *
	 */
	public void sno2(String value) {
		setConstString(offset + 30, $sno2, value);
	}

	/**
	 * 手配ＮＯ３. SEIBAN No. 3.<p>
	 *
	 */
	public String sno3() {
		return getConstString(offset + 31, $sno3);
	}

	/**
	 * 手配ＮＯ３. SEIBAN No. 3.<p>
	 *
	 */
	public void sno3(String value) {
		setConstString(offset + 31, $sno3, value);
	}

	/**
	 * 手配ＮＯ４. SEIBAN No. 4.<p>
	 *
	 */
	public String sno4() {
		return getConstString(offset + 32, $sno4);
	}

	/**
	 * 手配ＮＯ４. SEIBAN No. 4.<p>
	 *
	 */
	public void sno4(String value) {
		setConstString(offset + 32, $sno4, value);
	}

	/**
	 * 需要場所ＣＤ. Demand location cd..<p>
	 *
	 */
	public String dmnd_loc_cd() {
		return getConstString(offset + 33, $dmnd_loc_cd);
	}

	/**
	 * 需要場所ＣＤ. Demand location cd..<p>
	 *
	 */
	public void dmnd_loc_cd(String value) {
		setConstString(offset + 33, $dmnd_loc_cd, value);
	}

	/**
	 * 内部備考. Internal remarks.<p>
	 *
	 */
	public String intr_rmrks() {
		return getConstString(offset + 34, $intr_rmrks);
	}

	/**
	 * 内部備考. Internal remarks.<p>
	 *
	 */
	public void intr_rmrks(String value) {
		setConstString(offset + 34, $intr_rmrks, value);
	}

	/**
	 * 予備１. Spare 1.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 35, $sub_char1);
	}

	/**
	 * 予備１. Spare 1.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 35, $sub_char1, value);
	}

	/**
	 * 予備２. Spare 2.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 36, $sub_char2);
	}

	/**
	 * 予備２. Spare 2.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 36, $sub_char2, value);
	}

	/**
	 * 予備３. Spare 3.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 37, $sub_char3);
	}

	/**
	 * 予備３. Spare 3.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 37, $sub_char3, value);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 38, $ins_usr_id);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 38, $ins_usr_id, value);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 39, $ins_usr_nm);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 39, $ins_usr_nm, value);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 40, $ins_ts);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 40, $ins_ts, value);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 41, $ins_func_id);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 41, $ins_func_id, value);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 42, $upd_cntr);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 42, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 42, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 42, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 42, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 42, $upd_cntr, value);
	}
	
	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 43, $upd_usr_id);
	}

	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 43, $upd_usr_id, value);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 44, $upd_usr_nm);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 44, $upd_usr_nm, value);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 45, $upd_ts);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 45, $upd_ts, value);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 46, $upd_func_id);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 46, $upd_func_id, value);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 47, $upd_srv_req_no);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 47, $upd_srv_req_no, value);
	}

	public String getString(String name) {
		if ($dmnd_no.equalsIgnoreCase(name)) {
			return dmnd_no();
		}
		if ($dmnd_period_typ.equalsIgnoreCase(name)) {
			return dmnd_period_typ();
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
		if ($spln_itm_cd.equalsIgnoreCase(name)) {
			return spln_itm_cd();
		}
		if ($dmnd_typ.equalsIgnoreCase(name)) {
			return dmnd_typ();
		}
		if ($dmnd_dpt_cd.equalsIgnoreCase(name)) {
			return dmnd_dpt_cd();
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			return wrk_no();
		}
		if ($dmnd_usr_cd.equalsIgnoreCase(name)) {
			return dmnd_usr_cd();
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			return cst_cd();
		}
		if ($dlv_cd.equalsIgnoreCase(name)) {
			return dlv_cd();
		}
		if ($slo_d_no.equalsIgnoreCase(name)) {
			return slo_d_no();
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			return slo_no();
		}
		if ($cst_frcst_d_no.equalsIgnoreCase(name)) {
			return cst_frcst_d_no();
		}
		if ($cst_frcst_no.equalsIgnoreCase(name)) {
			return cst_frcst_no();
		}
		if ($spln_vers.equalsIgnoreCase(name)) {
			return spln_vers();
		}
		if ($cur_cd.equalsIgnoreCase(name)) {
			return cur_cd();
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
		if ($dmnd_loc_cd.equalsIgnoreCase(name)) {
			return dmnd_loc_cd();
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			return intr_rmrks();
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
		if ($dmnd_qty.equalsIgnoreCase(name)) {
			return dmnd_qty();
		}
		if ($input_qty.equalsIgnoreCase(name)) {
			return input_qty();
		}
		if ($rec_qty.equalsIgnoreCase(name)) {
			return rec_qty();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumber(name);
	}

	public MCDate getDate(String name) {
		if ($dmnd_dt.equalsIgnoreCase(name)) {
			return dmnd_dt();
		}
		if ($dmnd_st_dt.equalsIgnoreCase(name)) {
			return dmnd_st_dt();
		}
		if ($dmnd_end_dt.equalsIgnoreCase(name)) {
			return dmnd_end_dt();
		}
		if ($dlv_schd_st_dt.equalsIgnoreCase(name)) {
			return dlv_schd_st_dt();
		}
		if ($dlv_schd_end_dt.equalsIgnoreCase(name)) {
			return dlv_schd_end_dt();
		}
		if ($ym.equalsIgnoreCase(name)) {
			return ym();
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
		if ($dly_div_flg.equalsIgnoreCase(name)) {
			return dly_div_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($dmnd_no.equalsIgnoreCase(name)) {
			return dmnd_no();
		}
		if ($dmnd_period_typ.equalsIgnoreCase(name)) {
			return dmnd_period_typ();
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
		if ($spln_itm_cd.equalsIgnoreCase(name)) {
			return spln_itm_cd();
		}
		if ($dmnd_typ.equalsIgnoreCase(name)) {
			return dmnd_typ();
		}
		if ($dmnd_dpt_cd.equalsIgnoreCase(name)) {
			return dmnd_dpt_cd();
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			return wrk_no();
		}
		if ($dmnd_usr_cd.equalsIgnoreCase(name)) {
			return dmnd_usr_cd();
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			return cst_cd();
		}
		if ($dlv_cd.equalsIgnoreCase(name)) {
			return dlv_cd();
		}
		if ($slo_d_no.equalsIgnoreCase(name)) {
			return slo_d_no();
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			return slo_no();
		}
		if ($cst_frcst_d_no.equalsIgnoreCase(name)) {
			return cst_frcst_d_no();
		}
		if ($cst_frcst_no.equalsIgnoreCase(name)) {
			return cst_frcst_no();
		}
		if ($spln_vers.equalsIgnoreCase(name)) {
			return spln_vers();
		}
		if ($cur_cd.equalsIgnoreCase(name)) {
			return cur_cd();
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
		if ($dmnd_loc_cd.equalsIgnoreCase(name)) {
			return dmnd_loc_cd();
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			return intr_rmrks();
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
		if ($dmnd_qty.equalsIgnoreCase(name)) {
			return dmnd_qty();
		}
		if ($input_qty.equalsIgnoreCase(name)) {
			return input_qty();
		}
		if ($rec_qty.equalsIgnoreCase(name)) {
			return rec_qty();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumberNE(name);
	}

	public MCDate getDateNE(String name) {
		if ($dmnd_dt.equalsIgnoreCase(name)) {
			return dmnd_dt();
		}
		if ($dmnd_st_dt.equalsIgnoreCase(name)) {
			return dmnd_st_dt();
		}
		if ($dmnd_end_dt.equalsIgnoreCase(name)) {
			return dmnd_end_dt();
		}
		if ($dlv_schd_st_dt.equalsIgnoreCase(name)) {
			return dlv_schd_st_dt();
		}
		if ($dlv_schd_end_dt.equalsIgnoreCase(name)) {
			return dlv_schd_end_dt();
		}
		if ($ym.equalsIgnoreCase(name)) {
			return ym();
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
		if ($dly_div_flg.equalsIgnoreCase(name)) {
			return dly_div_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($dmnd_no.equalsIgnoreCase(name)) {
			dmnd_no(value);
			return;
		}
		if ($dmnd_period_typ.equalsIgnoreCase(name)) {
			dmnd_period_typ(value);
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
		if ($spln_itm_cd.equalsIgnoreCase(name)) {
			spln_itm_cd(value);
			return;
		}
		if ($dmnd_typ.equalsIgnoreCase(name)) {
			dmnd_typ(value);
			return;
		}
		if ($dmnd_dpt_cd.equalsIgnoreCase(name)) {
			dmnd_dpt_cd(value);
			return;
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			wrk_no(value);
			return;
		}
		if ($dmnd_usr_cd.equalsIgnoreCase(name)) {
			dmnd_usr_cd(value);
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
		if ($slo_d_no.equalsIgnoreCase(name)) {
			slo_d_no(value);
			return;
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			slo_no(value);
			return;
		}
		if ($cst_frcst_d_no.equalsIgnoreCase(name)) {
			cst_frcst_d_no(value);
			return;
		}
		if ($cst_frcst_no.equalsIgnoreCase(name)) {
			cst_frcst_no(value);
			return;
		}
		if ($spln_vers.equalsIgnoreCase(name)) {
			spln_vers(value);
			return;
		}
		if ($cur_cd.equalsIgnoreCase(name)) {
			cur_cd(value);
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
		if ($dmnd_loc_cd.equalsIgnoreCase(name)) {
			dmnd_loc_cd(value);
			return;
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			intr_rmrks(value);
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
		if ($dmnd_qty.equalsIgnoreCase(name)) {
			dmnd_qty(value);
			return;
		}
		if ($input_qty.equalsIgnoreCase(name)) {
			input_qty(value);
			return;
		}
		if ($rec_qty.equalsIgnoreCase(name)) {
			rec_qty(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, int value) {
		if ($dmnd_qty.equalsIgnoreCase(name)) {
			dmnd_qty(value);
			return;
		}
		if ($input_qty.equalsIgnoreCase(name)) {
			input_qty(value);
			return;
		}
		if ($rec_qty.equalsIgnoreCase(name)) {
			rec_qty(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, long value) {
		if ($dmnd_qty.equalsIgnoreCase(name)) {
			dmnd_qty(value);
			return;
		}
		if ($input_qty.equalsIgnoreCase(name)) {
			input_qty(value);
			return;
		}
		if ($rec_qty.equalsIgnoreCase(name)) {
			rec_qty(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, float value) {
		if ($dmnd_qty.equalsIgnoreCase(name)) {
			dmnd_qty(value);
			return;
		}
		if ($input_qty.equalsIgnoreCase(name)) {
			input_qty(value);
			return;
		}
		if ($rec_qty.equalsIgnoreCase(name)) {
			rec_qty(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, double value) {
		if ($dmnd_qty.equalsIgnoreCase(name)) {
			dmnd_qty(value);
			return;
		}
		if ($input_qty.equalsIgnoreCase(name)) {
			input_qty(value);
			return;
		}
		if ($rec_qty.equalsIgnoreCase(name)) {
			rec_qty(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setDate(String name, MCDate value) {
		if ($dmnd_dt.equalsIgnoreCase(name)) {
			dmnd_dt(value);
			return;
		}
		if ($dmnd_st_dt.equalsIgnoreCase(name)) {
			dmnd_st_dt(value);
			return;
		}
		if ($dmnd_end_dt.equalsIgnoreCase(name)) {
			dmnd_end_dt(value);
			return;
		}
		if ($dlv_schd_st_dt.equalsIgnoreCase(name)) {
			dlv_schd_st_dt(value);
			return;
		}
		if ($dlv_schd_end_dt.equalsIgnoreCase(name)) {
			dlv_schd_end_dt(value);
			return;
		}
		if ($ym.equalsIgnoreCase(name)) {
			ym(value);
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
		if ($dly_div_flg.equalsIgnoreCase(name)) {
			dly_div_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($dmnd_no.equalsIgnoreCase(name)) {
			dmnd_no(value);
			return;
		}
		if ($dmnd_period_typ.equalsIgnoreCase(name)) {
			dmnd_period_typ(value);
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
		if ($spln_itm_cd.equalsIgnoreCase(name)) {
			spln_itm_cd(value);
			return;
		}
		if ($dmnd_typ.equalsIgnoreCase(name)) {
			dmnd_typ(value);
			return;
		}
		if ($dmnd_dpt_cd.equalsIgnoreCase(name)) {
			dmnd_dpt_cd(value);
			return;
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			wrk_no(value);
			return;
		}
		if ($dmnd_usr_cd.equalsIgnoreCase(name)) {
			dmnd_usr_cd(value);
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
		if ($slo_d_no.equalsIgnoreCase(name)) {
			slo_d_no(value);
			return;
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			slo_no(value);
			return;
		}
		if ($cst_frcst_d_no.equalsIgnoreCase(name)) {
			cst_frcst_d_no(value);
			return;
		}
		if ($cst_frcst_no.equalsIgnoreCase(name)) {
			cst_frcst_no(value);
			return;
		}
		if ($spln_vers.equalsIgnoreCase(name)) {
			spln_vers(value);
			return;
		}
		if ($cur_cd.equalsIgnoreCase(name)) {
			cur_cd(value);
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
		if ($dmnd_loc_cd.equalsIgnoreCase(name)) {
			dmnd_loc_cd(value);
			return;
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			intr_rmrks(value);
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
		if ($dmnd_qty.equalsIgnoreCase(name)) {
			dmnd_qty(value);
			return;
		}
		if ($input_qty.equalsIgnoreCase(name)) {
			input_qty(value);
			return;
		}
		if ($rec_qty.equalsIgnoreCase(name)) {
			rec_qty(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, int value) {
		if ($dmnd_qty.equalsIgnoreCase(name)) {
			dmnd_qty(value);
			return;
		}
		if ($input_qty.equalsIgnoreCase(name)) {
			input_qty(value);
			return;
		}
		if ($rec_qty.equalsIgnoreCase(name)) {
			rec_qty(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, long value) {
		if ($dmnd_qty.equalsIgnoreCase(name)) {
			dmnd_qty(value);
			return;
		}
		if ($input_qty.equalsIgnoreCase(name)) {
			input_qty(value);
			return;
		}
		if ($rec_qty.equalsIgnoreCase(name)) {
			rec_qty(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, float value) {
		if ($dmnd_qty.equalsIgnoreCase(name)) {
			dmnd_qty(value);
			return;
		}
		if ($input_qty.equalsIgnoreCase(name)) {
			input_qty(value);
			return;
		}
		if ($rec_qty.equalsIgnoreCase(name)) {
			rec_qty(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, double value) {
		if ($dmnd_qty.equalsIgnoreCase(name)) {
			dmnd_qty(value);
			return;
		}
		if ($input_qty.equalsIgnoreCase(name)) {
			input_qty(value);
			return;
		}
		if ($rec_qty.equalsIgnoreCase(name)) {
			rec_qty(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setDateNE(String name, MCDate value) {
		if ($dmnd_dt.equalsIgnoreCase(name)) {
			dmnd_dt(value);
			return;
		}
		if ($dmnd_st_dt.equalsIgnoreCase(name)) {
			dmnd_st_dt(value);
			return;
		}
		if ($dmnd_end_dt.equalsIgnoreCase(name)) {
			dmnd_end_dt(value);
			return;
		}
		if ($dlv_schd_st_dt.equalsIgnoreCase(name)) {
			dlv_schd_st_dt(value);
			return;
		}
		if ($dlv_schd_end_dt.equalsIgnoreCase(name)) {
			dlv_schd_end_dt(value);
			return;
		}
		if ($ym.equalsIgnoreCase(name)) {
			ym(value);
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
		if ($dly_div_flg.equalsIgnoreCase(name)) {
			dly_div_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

}
