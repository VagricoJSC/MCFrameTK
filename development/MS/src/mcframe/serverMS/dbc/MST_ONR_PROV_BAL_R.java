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
 * "有償支給残高情報 // Chargeable supply balance info."DBコンテナRowクラスです。<p>
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
 *  	<td>asppl_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>買掛先ＣＤ</td>
 *  	<td>AP supplier cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>ap_dpt_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>債務部門ＣＤ</td>
 *  	<td>AP dept. cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>K</td>
 *  	<td>ac_ym</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>計上年月</td>
 *  	<td>Recording month</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>trd_cur_cd</td>
 *  	<td>C</td>
 *  	<td>3</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>取引通貨ＣＤ</td>
 *  	<td>Transaction currency cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>init_bal</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>月初残高</td>
 *  	<td>Beginning balance</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>onr_prov_amt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>当月有償支給額</td>
 *  	<td>Chargeable supply amount (Current month)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>onr_prov_ret_amt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>当月有償支給戻し額</td>
 *  	<td>Chargeable supply refundable amount (Current month)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>setoff_amt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>当月相殺額</td>
 *  	<td>Offset amount (Current month)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>tax_amt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>当月税額</td>
 *  	<td>Tax amount (Current month)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>end_bal</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>当月残高</td>
 *  	<td>Balance (Current month)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>base_cur_cd</td>
 *  	<td>C</td>
 *  	<td>3</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>基準通貨ＣＤ</td>
 *  	<td>Base currency cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>base_cur_init_bal</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>基準通貨月初残高</td>
 *  	<td>Beginning balance (Base currency)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>base_cur_onr_prov_amt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>基準通貨当月有償支給額</td>
 *  	<td>Current month chargeable supply amount (Base currency)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>base_cur_onr_prov_ret_amt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>基準通貨当月有償支給戻し額</td>
 *  	<td>Current month chargeable supply repayment amount (Base currency)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>base_cur_setoff_amt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>基準通貨当月相殺額</td>
 *  	<td>Current month offset amount (Base currency)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>base_cur_tax_amt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>基準通貨当月税額</td>
 *  	<td>Current month tax amount (Base currency)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>base_cur_end_bal</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>基準通貨当月残高</td>
 *  	<td>Current month balance (Base currency)</td>
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
public class MST_ONR_PROV_BAL_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.CO_VIEW;

	public static final String TABLE_NAME = "MST_ONR_PROV_BAL";

	public static final boolean EX_CTRL = true;
	
	public static final boolean LCL_TABLE = false;
	
	/**
	 * 買掛先ＣＤ. AP supplier cd..<p>
	 *
	 */
	public static final String $asppl_cd = "asppl_cd";
	private static final MCPermColumnInfo _asppl_cd = createColumnInfo("asppl_cd");
	public final MCStringPermColumn asppl_cd = createStringColumn(_asppl_cd);
	
	/**
	 * 債務部門ＣＤ. AP dept. cd..<p>
	 *
	 */
	public static final String $ap_dpt_cd = "ap_dpt_cd";
	private static final MCPermColumnInfo _ap_dpt_cd = createColumnInfo("ap_dpt_cd");
	public final MCStringPermColumn ap_dpt_cd = createStringColumn(_ap_dpt_cd);
	
	/**
	 * 計上年月. Recording month.<p>
	 *
	 */
	public static final String $ac_ym = "ac_ym";
	private static final MCPermColumnInfo _ac_ym = createColumnInfo("ac_ym");
	public final MCDatePermColumn ac_ym = createDateColumn(_ac_ym);
	
	/**
	 * 取引通貨ＣＤ. Transaction currency cd..<p>
	 *
	 */
	public static final String $trd_cur_cd = "trd_cur_cd";
	private static final MCPermColumnInfo _trd_cur_cd = createColumnInfo("trd_cur_cd");
	public final MCStringPermColumn trd_cur_cd = createStringColumn(_trd_cur_cd);
	
	/**
	 * 月初残高. Beginning balance.<p>
	 *
	 */
	public static final String $init_bal = "init_bal";
	private static final MCPermColumnInfo _init_bal = createColumnInfo("init_bal");
	public final MCNumberPermColumn init_bal = createNumberColumn(_init_bal);
	
	/**
	 * 当月有償支給額. Chargeable supply amount (Current month).<p>
	 *
	 */
	public static final String $onr_prov_amt = "onr_prov_amt";
	private static final MCPermColumnInfo _onr_prov_amt = createColumnInfo("onr_prov_amt");
	public final MCNumberPermColumn onr_prov_amt = createNumberColumn(_onr_prov_amt);
	
	/**
	 * 当月有償支給戻し額. Chargeable supply refundable amount (Current month).<p>
	 *
	 */
	public static final String $onr_prov_ret_amt = "onr_prov_ret_amt";
	private static final MCPermColumnInfo _onr_prov_ret_amt = createColumnInfo("onr_prov_ret_amt");
	public final MCNumberPermColumn onr_prov_ret_amt = createNumberColumn(_onr_prov_ret_amt);
	
	/**
	 * 当月相殺額. Offset amount (Current month).<p>
	 *
	 */
	public static final String $setoff_amt = "setoff_amt";
	private static final MCPermColumnInfo _setoff_amt = createColumnInfo("setoff_amt");
	public final MCNumberPermColumn setoff_amt = createNumberColumn(_setoff_amt);
	
	/**
	 * 当月税額. Tax amount (Current month).<p>
	 *
	 */
	public static final String $tax_amt = "tax_amt";
	private static final MCPermColumnInfo _tax_amt = createColumnInfo("tax_amt");
	public final MCNumberPermColumn tax_amt = createNumberColumn(_tax_amt);
	
	/**
	 * 当月残高. Balance (Current month).<p>
	 *
	 */
	public static final String $end_bal = "end_bal";
	private static final MCPermColumnInfo _end_bal = createColumnInfo("end_bal");
	public final MCNumberPermColumn end_bal = createNumberColumn(_end_bal);
	
	/**
	 * 基準通貨ＣＤ. Base currency cd..<p>
	 *
	 */
	public static final String $base_cur_cd = "base_cur_cd";
	private static final MCPermColumnInfo _base_cur_cd = createColumnInfo("base_cur_cd");
	public final MCStringPermColumn base_cur_cd = createStringColumn(_base_cur_cd);
	
	/**
	 * 基準通貨月初残高. Beginning balance (Base currency).<p>
	 *
	 */
	public static final String $base_cur_init_bal = "base_cur_init_bal";
	private static final MCPermColumnInfo _base_cur_init_bal = createColumnInfo("base_cur_init_bal");
	public final MCNumberPermColumn base_cur_init_bal = createNumberColumn(_base_cur_init_bal);
	
	/**
	 * 基準通貨当月有償支給額. Current month chargeable supply amount (Base currency).<p>
	 *
	 */
	public static final String $base_cur_onr_prov_amt = "base_cur_onr_prov_amt";
	private static final MCPermColumnInfo _base_cur_onr_prov_amt = createColumnInfo("base_cur_onr_prov_amt");
	public final MCNumberPermColumn base_cur_onr_prov_amt = createNumberColumn(_base_cur_onr_prov_amt);
	
	/**
	 * 基準通貨当月有償支給戻し額. Current month chargeable supply repayment amount (Base currency).<p>
	 *
	 */
	public static final String $base_cur_onr_prov_ret_amt = "base_cur_onr_prov_ret_amt";
	private static final MCPermColumnInfo _base_cur_onr_prov_ret_amt = createColumnInfo("base_cur_onr_prov_ret_amt");
	public final MCNumberPermColumn base_cur_onr_prov_ret_amt = createNumberColumn(_base_cur_onr_prov_ret_amt);
	
	/**
	 * 基準通貨当月相殺額. Current month offset amount (Base currency).<p>
	 *
	 */
	public static final String $base_cur_setoff_amt = "base_cur_setoff_amt";
	private static final MCPermColumnInfo _base_cur_setoff_amt = createColumnInfo("base_cur_setoff_amt");
	public final MCNumberPermColumn base_cur_setoff_amt = createNumberColumn(_base_cur_setoff_amt);
	
	/**
	 * 基準通貨当月税額. Current month tax amount (Base currency).<p>
	 *
	 */
	public static final String $base_cur_tax_amt = "base_cur_tax_amt";
	private static final MCPermColumnInfo _base_cur_tax_amt = createColumnInfo("base_cur_tax_amt");
	public final MCNumberPermColumn base_cur_tax_amt = createNumberColumn(_base_cur_tax_amt);
	
	/**
	 * 基準通貨当月残高. Current month balance (Base currency).<p>
	 *
	 */
	public static final String $base_cur_end_bal = "base_cur_end_bal";
	private static final MCPermColumnInfo _base_cur_end_bal = createColumnInfo("base_cur_end_bal");
	public final MCNumberPermColumn base_cur_end_bal = createNumberColumn(_base_cur_end_bal);
	
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
	
	public static final MCMeta asppl_cd_META = createCommonMeta($asppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta ap_dpt_cd_META = createCommonMeta($ap_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta ac_ym_META = createCommonMeta($ac_ym, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta trd_cur_cd_META = createCommonMeta($trd_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta init_bal_META = createCommonMeta($init_bal, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta onr_prov_amt_META = createCommonMeta($onr_prov_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta onr_prov_ret_amt_META = createCommonMeta($onr_prov_ret_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta setoff_amt_META = createCommonMeta($setoff_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta tax_amt_META = createCommonMeta($tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta end_bal_META = createCommonMeta($end_bal, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_cd_META = createCommonMeta($base_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta base_cur_init_bal_META = createCommonMeta($base_cur_init_bal, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_onr_prov_amt_META = createCommonMeta($base_cur_onr_prov_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_onr_prov_ret_amt_META = createCommonMeta($base_cur_onr_prov_ret_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_setoff_amt_META = createCommonMeta($base_cur_setoff_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_tax_amt_META = createCommonMeta($base_cur_tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta base_cur_end_bal_META = createCommonMeta($base_cur_end_bal, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.MLY_ONR_PROV_BAL_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.MLY_ONR_PROV_BAL_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.MLY_ONR_PROV_BAL_SUB_CHAR3);
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
	public static final String $CUR1 = "CUR1";
	static {
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_CUR",
				$CUR1,
				new String[][]{
						{"trd_cur_cd", "cur_cd"}
				},
				() -> {
					return mcframe.serverMA.dbc.MAM_CUR_R.create("CUR1");
				},
				(alias) -> {
					MST_ONR_PROV_BAL_R own = MST_ONR_PROV_BAL_R.create(alias);
					mcframe.serverMA.dbc.MAM_CUR_R ref = mcframe.serverMA.dbc.MAM_CUR_R.create("CUR1");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.trd_cur_cd.eq(ref.cur_cd));
					return cond;
				}
			)
		);
	}
	
	protected static final ConstMetaList<MST_ONR_PROV_BAL_R> constMetas = new ConstMetaList<MST_ONR_PROV_BAL_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			asppl_cd_META,
			ap_dpt_cd_META,
			ac_ym_META,
			trd_cur_cd_META,
			init_bal_META,
			onr_prov_amt_META,
			onr_prov_ret_amt_META,
			setoff_amt_META,
			tax_amt_META,
			end_bal_META,
			base_cur_cd_META,
			base_cur_init_bal_META,
			base_cur_onr_prov_amt_META,
			base_cur_onr_prov_ret_amt_META,
			base_cur_setoff_amt_META,
			base_cur_tax_amt_META,
			base_cur_end_bal_META,
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
	protected MST_ONR_PROV_BAL_R(ConstMetaList<? extends MST_ONR_PROV_BAL_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MST_ONR_PROV_BAL_R(ConstMetaList<? extends MST_ONR_PROV_BAL_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MST_ONR_PROV_BAL_R.$asppl_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ONR_PROV_BAL_R.$asppl_cd,
				"asppl_cd",
				asppl_cd,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ONR_PROV_BAL_R.$ap_dpt_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ONR_PROV_BAL_R.$ap_dpt_cd,
				"ap_dpt_cd",
				ap_dpt_cd,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ONR_PROV_BAL_R.$ac_ym,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_ONR_PROV_BAL_R.$ac_ym,
				"ac_ym",
				ac_ym,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ONR_PROV_BAL_R.$trd_cur_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ONR_PROV_BAL_R.$trd_cur_cd,
				"trd_cur_cd",
				trd_cur_cd,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ONR_PROV_BAL_R.$init_bal,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_ONR_PROV_BAL_R.$init_bal,
				"init_bal",
				init_bal,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ONR_PROV_BAL_R.$onr_prov_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_ONR_PROV_BAL_R.$onr_prov_amt,
				"onr_prov_amt",
				onr_prov_amt,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ONR_PROV_BAL_R.$onr_prov_ret_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_ONR_PROV_BAL_R.$onr_prov_ret_amt,
				"onr_prov_ret_amt",
				onr_prov_ret_amt,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ONR_PROV_BAL_R.$setoff_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_ONR_PROV_BAL_R.$setoff_amt,
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
			MST_ONR_PROV_BAL_R.$tax_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_ONR_PROV_BAL_R.$tax_amt,
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
			MST_ONR_PROV_BAL_R.$end_bal,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_ONR_PROV_BAL_R.$end_bal,
				"end_bal",
				end_bal,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ONR_PROV_BAL_R.$base_cur_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ONR_PROV_BAL_R.$base_cur_cd,
				"base_cur_cd",
				base_cur_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ONR_PROV_BAL_R.$base_cur_init_bal,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_ONR_PROV_BAL_R.$base_cur_init_bal,
				"base_cur_init_bal",
				base_cur_init_bal,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ONR_PROV_BAL_R.$base_cur_onr_prov_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_ONR_PROV_BAL_R.$base_cur_onr_prov_amt,
				"base_cur_onr_prov_amt",
				base_cur_onr_prov_amt,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ONR_PROV_BAL_R.$base_cur_onr_prov_ret_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_ONR_PROV_BAL_R.$base_cur_onr_prov_ret_amt,
				"base_cur_onr_prov_ret_amt",
				base_cur_onr_prov_ret_amt,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ONR_PROV_BAL_R.$base_cur_setoff_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_ONR_PROV_BAL_R.$base_cur_setoff_amt,
				"base_cur_setoff_amt",
				base_cur_setoff_amt,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ONR_PROV_BAL_R.$base_cur_tax_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_ONR_PROV_BAL_R.$base_cur_tax_amt,
				"base_cur_tax_amt",
				base_cur_tax_amt,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ONR_PROV_BAL_R.$base_cur_end_bal,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_ONR_PROV_BAL_R.$base_cur_end_bal,
				"base_cur_end_bal",
				base_cur_end_bal,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ONR_PROV_BAL_R.$sub_char1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ONR_PROV_BAL_R.$sub_char1,
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
			MST_ONR_PROV_BAL_R.$sub_char2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ONR_PROV_BAL_R.$sub_char2,
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
			MST_ONR_PROV_BAL_R.$sub_char3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ONR_PROV_BAL_R.$sub_char3,
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
			MST_ONR_PROV_BAL_R.$ins_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ONR_PROV_BAL_R.$ins_usr_id,
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
			MST_ONR_PROV_BAL_R.$ins_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ONR_PROV_BAL_R.$ins_usr_nm,
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
			MST_ONR_PROV_BAL_R.$ins_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MST_ONR_PROV_BAL_R.$ins_ts,
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
			MST_ONR_PROV_BAL_R.$ins_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ONR_PROV_BAL_R.$ins_func_id,
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
			MST_ONR_PROV_BAL_R.$upd_cntr,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_ONR_PROV_BAL_R.$upd_cntr,
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
			MST_ONR_PROV_BAL_R.$upd_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ONR_PROV_BAL_R.$upd_usr_id,
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
			MST_ONR_PROV_BAL_R.$upd_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ONR_PROV_BAL_R.$upd_usr_nm,
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
			MST_ONR_PROV_BAL_R.$upd_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MST_ONR_PROV_BAL_R.$upd_ts,
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
			MST_ONR_PROV_BAL_R.$upd_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ONR_PROV_BAL_R.$upd_func_id,
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
			MST_ONR_PROV_BAL_R.$upd_srv_req_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ONR_PROV_BAL_R.$upd_srv_req_no,
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
	public static MST_ONR_PROV_BAL_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MST_ONR_PROV_BAL_R create(String alias) {
		MST_ONR_PROV_BAL_R row = new MST_ONR_PROV_BAL_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MST_ONR_PROV_BAL_R createByName(T proto) {
		MST_ONR_PROV_BAL_R row = MST_ONR_PROV_BAL_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MST_ONR_PROV_BAL_R clone() {
		return (MST_ONR_PROV_BAL_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MST_ONR_PROV_BAL_R createInstance() {
		return (MST_ONR_PROV_BAL_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MST_ONR_PROV_BAL_R getValues(String... names) {
		return (MST_ONR_PROV_BAL_R) super.getValues(names);
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
	 public MSW_ONR_PROV_BAL_KEY_R getPkWorkDbc(String alias) {
	 	return MSW_ONR_PROV_BAL_KEY_R.create(alias);
	 }

	/*
	 * MCDBContainerのオーバーライドメソッドです。
	 */
	 public MSW_ONR_PROV_BAL_KEY_R getPkWorkDbc() {
	 	return getPkWorkDbc(MSW_ONR_PROV_BAL_KEY_R.TABLE_NAME);
	 }

	/**
	 * 買掛先ＣＤ. AP supplier cd..<p>
	 *
	 */
	public String asppl_cd() {
		return getConstString(offset + 0, $asppl_cd);
	}

	/**
	 * 買掛先ＣＤ. AP supplier cd..<p>
	 *
	 */
	public void asppl_cd(String value) {
		setConstString(offset + 0, $asppl_cd, value);
	}

	/**
	 * 債務部門ＣＤ. AP dept. cd..<p>
	 *
	 */
	public String ap_dpt_cd() {
		return getConstString(offset + 1, $ap_dpt_cd);
	}

	/**
	 * 債務部門ＣＤ. AP dept. cd..<p>
	 *
	 */
	public void ap_dpt_cd(String value) {
		setConstString(offset + 1, $ap_dpt_cd, value);
	}

	/**
	 * 計上年月. Recording month.<p>
	 *
	 */
	public MCDate ac_ym() {
		return getConstDate(offset + 2, $ac_ym);
	}

	/**
	 * 計上年月. Recording month.<p>
	 *
	 */
	public void ac_ym(MCDate value) {
		setConstDate(offset + 2, $ac_ym, value);
	}

	/**
	 * 取引通貨ＣＤ. Transaction currency cd..<p>
	 *
	 */
	public String trd_cur_cd() {
		return getConstString(offset + 3, $trd_cur_cd);
	}

	/**
	 * 取引通貨ＣＤ. Transaction currency cd..<p>
	 *
	 */
	public void trd_cur_cd(String value) {
		setConstString(offset + 3, $trd_cur_cd, value);
	}

	/**
	 * 月初残高. Beginning balance.<p>
	 *
	 */
	public MCNumber init_bal() {
		return getConstNumber(offset + 4, $init_bal);
	}

	/**
	 * 月初残高. Beginning balance.<p>
	 *
	 */
	public void init_bal(MCNumber value) {
		setConstNumber(offset + 4, $init_bal, value);
	}
	
	/**
	 * 月初残高. Beginning balance.<p>
	 *
	 */
	public void init_bal(int value) {
		setConstNumber(offset + 4, $init_bal, value);
	}
	
	/**
	 * 月初残高. Beginning balance.<p>
	 *
	 */
	public void init_bal(long value) {
		setConstNumber(offset + 4, $init_bal, value);
	}
	
	/**
	 * 月初残高. Beginning balance.<p>
	 *
	 */
	public void init_bal(float value) {
		setConstNumber(offset + 4, $init_bal, value);
	}
	
	/**
	 * 月初残高. Beginning balance.<p>
	 *
	 */
	public void init_bal(double value) {
		setConstNumber(offset + 4, $init_bal, value);
	}
	
	/**
	 * 当月有償支給額. Chargeable supply amount (Current month).<p>
	 *
	 */
	public MCNumber onr_prov_amt() {
		return getConstNumber(offset + 5, $onr_prov_amt);
	}

	/**
	 * 当月有償支給額. Chargeable supply amount (Current month).<p>
	 *
	 */
	public void onr_prov_amt(MCNumber value) {
		setConstNumber(offset + 5, $onr_prov_amt, value);
	}
	
	/**
	 * 当月有償支給額. Chargeable supply amount (Current month).<p>
	 *
	 */
	public void onr_prov_amt(int value) {
		setConstNumber(offset + 5, $onr_prov_amt, value);
	}
	
	/**
	 * 当月有償支給額. Chargeable supply amount (Current month).<p>
	 *
	 */
	public void onr_prov_amt(long value) {
		setConstNumber(offset + 5, $onr_prov_amt, value);
	}
	
	/**
	 * 当月有償支給額. Chargeable supply amount (Current month).<p>
	 *
	 */
	public void onr_prov_amt(float value) {
		setConstNumber(offset + 5, $onr_prov_amt, value);
	}
	
	/**
	 * 当月有償支給額. Chargeable supply amount (Current month).<p>
	 *
	 */
	public void onr_prov_amt(double value) {
		setConstNumber(offset + 5, $onr_prov_amt, value);
	}
	
	/**
	 * 当月有償支給戻し額. Chargeable supply refundable amount (Current month).<p>
	 *
	 */
	public MCNumber onr_prov_ret_amt() {
		return getConstNumber(offset + 6, $onr_prov_ret_amt);
	}

	/**
	 * 当月有償支給戻し額. Chargeable supply refundable amount (Current month).<p>
	 *
	 */
	public void onr_prov_ret_amt(MCNumber value) {
		setConstNumber(offset + 6, $onr_prov_ret_amt, value);
	}
	
	/**
	 * 当月有償支給戻し額. Chargeable supply refundable amount (Current month).<p>
	 *
	 */
	public void onr_prov_ret_amt(int value) {
		setConstNumber(offset + 6, $onr_prov_ret_amt, value);
	}
	
	/**
	 * 当月有償支給戻し額. Chargeable supply refundable amount (Current month).<p>
	 *
	 */
	public void onr_prov_ret_amt(long value) {
		setConstNumber(offset + 6, $onr_prov_ret_amt, value);
	}
	
	/**
	 * 当月有償支給戻し額. Chargeable supply refundable amount (Current month).<p>
	 *
	 */
	public void onr_prov_ret_amt(float value) {
		setConstNumber(offset + 6, $onr_prov_ret_amt, value);
	}
	
	/**
	 * 当月有償支給戻し額. Chargeable supply refundable amount (Current month).<p>
	 *
	 */
	public void onr_prov_ret_amt(double value) {
		setConstNumber(offset + 6, $onr_prov_ret_amt, value);
	}
	
	/**
	 * 当月相殺額. Offset amount (Current month).<p>
	 *
	 */
	public MCNumber setoff_amt() {
		return getConstNumber(offset + 7, $setoff_amt);
	}

	/**
	 * 当月相殺額. Offset amount (Current month).<p>
	 *
	 */
	public void setoff_amt(MCNumber value) {
		setConstNumber(offset + 7, $setoff_amt, value);
	}
	
	/**
	 * 当月相殺額. Offset amount (Current month).<p>
	 *
	 */
	public void setoff_amt(int value) {
		setConstNumber(offset + 7, $setoff_amt, value);
	}
	
	/**
	 * 当月相殺額. Offset amount (Current month).<p>
	 *
	 */
	public void setoff_amt(long value) {
		setConstNumber(offset + 7, $setoff_amt, value);
	}
	
	/**
	 * 当月相殺額. Offset amount (Current month).<p>
	 *
	 */
	public void setoff_amt(float value) {
		setConstNumber(offset + 7, $setoff_amt, value);
	}
	
	/**
	 * 当月相殺額. Offset amount (Current month).<p>
	 *
	 */
	public void setoff_amt(double value) {
		setConstNumber(offset + 7, $setoff_amt, value);
	}
	
	/**
	 * 当月税額. Tax amount (Current month).<p>
	 *
	 */
	public MCNumber tax_amt() {
		return getConstNumber(offset + 8, $tax_amt);
	}

	/**
	 * 当月税額. Tax amount (Current month).<p>
	 *
	 */
	public void tax_amt(MCNumber value) {
		setConstNumber(offset + 8, $tax_amt, value);
	}
	
	/**
	 * 当月税額. Tax amount (Current month).<p>
	 *
	 */
	public void tax_amt(int value) {
		setConstNumber(offset + 8, $tax_amt, value);
	}
	
	/**
	 * 当月税額. Tax amount (Current month).<p>
	 *
	 */
	public void tax_amt(long value) {
		setConstNumber(offset + 8, $tax_amt, value);
	}
	
	/**
	 * 当月税額. Tax amount (Current month).<p>
	 *
	 */
	public void tax_amt(float value) {
		setConstNumber(offset + 8, $tax_amt, value);
	}
	
	/**
	 * 当月税額. Tax amount (Current month).<p>
	 *
	 */
	public void tax_amt(double value) {
		setConstNumber(offset + 8, $tax_amt, value);
	}
	
	/**
	 * 当月残高. Balance (Current month).<p>
	 *
	 */
	public MCNumber end_bal() {
		return getConstNumber(offset + 9, $end_bal);
	}

	/**
	 * 当月残高. Balance (Current month).<p>
	 *
	 */
	public void end_bal(MCNumber value) {
		setConstNumber(offset + 9, $end_bal, value);
	}
	
	/**
	 * 当月残高. Balance (Current month).<p>
	 *
	 */
	public void end_bal(int value) {
		setConstNumber(offset + 9, $end_bal, value);
	}
	
	/**
	 * 当月残高. Balance (Current month).<p>
	 *
	 */
	public void end_bal(long value) {
		setConstNumber(offset + 9, $end_bal, value);
	}
	
	/**
	 * 当月残高. Balance (Current month).<p>
	 *
	 */
	public void end_bal(float value) {
		setConstNumber(offset + 9, $end_bal, value);
	}
	
	/**
	 * 当月残高. Balance (Current month).<p>
	 *
	 */
	public void end_bal(double value) {
		setConstNumber(offset + 9, $end_bal, value);
	}
	
	/**
	 * 基準通貨ＣＤ. Base currency cd..<p>
	 *
	 */
	public String base_cur_cd() {
		return getConstString(offset + 10, $base_cur_cd);
	}

	/**
	 * 基準通貨ＣＤ. Base currency cd..<p>
	 *
	 */
	public void base_cur_cd(String value) {
		setConstString(offset + 10, $base_cur_cd, value);
	}

	/**
	 * 基準通貨月初残高. Beginning balance (Base currency).<p>
	 *
	 */
	public MCNumber base_cur_init_bal() {
		return getConstNumber(offset + 11, $base_cur_init_bal);
	}

	/**
	 * 基準通貨月初残高. Beginning balance (Base currency).<p>
	 *
	 */
	public void base_cur_init_bal(MCNumber value) {
		setConstNumber(offset + 11, $base_cur_init_bal, value);
	}
	
	/**
	 * 基準通貨月初残高. Beginning balance (Base currency).<p>
	 *
	 */
	public void base_cur_init_bal(int value) {
		setConstNumber(offset + 11, $base_cur_init_bal, value);
	}
	
	/**
	 * 基準通貨月初残高. Beginning balance (Base currency).<p>
	 *
	 */
	public void base_cur_init_bal(long value) {
		setConstNumber(offset + 11, $base_cur_init_bal, value);
	}
	
	/**
	 * 基準通貨月初残高. Beginning balance (Base currency).<p>
	 *
	 */
	public void base_cur_init_bal(float value) {
		setConstNumber(offset + 11, $base_cur_init_bal, value);
	}
	
	/**
	 * 基準通貨月初残高. Beginning balance (Base currency).<p>
	 *
	 */
	public void base_cur_init_bal(double value) {
		setConstNumber(offset + 11, $base_cur_init_bal, value);
	}
	
	/**
	 * 基準通貨当月有償支給額. Current month chargeable supply amount (Base currency).<p>
	 *
	 */
	public MCNumber base_cur_onr_prov_amt() {
		return getConstNumber(offset + 12, $base_cur_onr_prov_amt);
	}

	/**
	 * 基準通貨当月有償支給額. Current month chargeable supply amount (Base currency).<p>
	 *
	 */
	public void base_cur_onr_prov_amt(MCNumber value) {
		setConstNumber(offset + 12, $base_cur_onr_prov_amt, value);
	}
	
	/**
	 * 基準通貨当月有償支給額. Current month chargeable supply amount (Base currency).<p>
	 *
	 */
	public void base_cur_onr_prov_amt(int value) {
		setConstNumber(offset + 12, $base_cur_onr_prov_amt, value);
	}
	
	/**
	 * 基準通貨当月有償支給額. Current month chargeable supply amount (Base currency).<p>
	 *
	 */
	public void base_cur_onr_prov_amt(long value) {
		setConstNumber(offset + 12, $base_cur_onr_prov_amt, value);
	}
	
	/**
	 * 基準通貨当月有償支給額. Current month chargeable supply amount (Base currency).<p>
	 *
	 */
	public void base_cur_onr_prov_amt(float value) {
		setConstNumber(offset + 12, $base_cur_onr_prov_amt, value);
	}
	
	/**
	 * 基準通貨当月有償支給額. Current month chargeable supply amount (Base currency).<p>
	 *
	 */
	public void base_cur_onr_prov_amt(double value) {
		setConstNumber(offset + 12, $base_cur_onr_prov_amt, value);
	}
	
	/**
	 * 基準通貨当月有償支給戻し額. Current month chargeable supply repayment amount (Base currency).<p>
	 *
	 */
	public MCNumber base_cur_onr_prov_ret_amt() {
		return getConstNumber(offset + 13, $base_cur_onr_prov_ret_amt);
	}

	/**
	 * 基準通貨当月有償支給戻し額. Current month chargeable supply repayment amount (Base currency).<p>
	 *
	 */
	public void base_cur_onr_prov_ret_amt(MCNumber value) {
		setConstNumber(offset + 13, $base_cur_onr_prov_ret_amt, value);
	}
	
	/**
	 * 基準通貨当月有償支給戻し額. Current month chargeable supply repayment amount (Base currency).<p>
	 *
	 */
	public void base_cur_onr_prov_ret_amt(int value) {
		setConstNumber(offset + 13, $base_cur_onr_prov_ret_amt, value);
	}
	
	/**
	 * 基準通貨当月有償支給戻し額. Current month chargeable supply repayment amount (Base currency).<p>
	 *
	 */
	public void base_cur_onr_prov_ret_amt(long value) {
		setConstNumber(offset + 13, $base_cur_onr_prov_ret_amt, value);
	}
	
	/**
	 * 基準通貨当月有償支給戻し額. Current month chargeable supply repayment amount (Base currency).<p>
	 *
	 */
	public void base_cur_onr_prov_ret_amt(float value) {
		setConstNumber(offset + 13, $base_cur_onr_prov_ret_amt, value);
	}
	
	/**
	 * 基準通貨当月有償支給戻し額. Current month chargeable supply repayment amount (Base currency).<p>
	 *
	 */
	public void base_cur_onr_prov_ret_amt(double value) {
		setConstNumber(offset + 13, $base_cur_onr_prov_ret_amt, value);
	}
	
	/**
	 * 基準通貨当月相殺額. Current month offset amount (Base currency).<p>
	 *
	 */
	public MCNumber base_cur_setoff_amt() {
		return getConstNumber(offset + 14, $base_cur_setoff_amt);
	}

	/**
	 * 基準通貨当月相殺額. Current month offset amount (Base currency).<p>
	 *
	 */
	public void base_cur_setoff_amt(MCNumber value) {
		setConstNumber(offset + 14, $base_cur_setoff_amt, value);
	}
	
	/**
	 * 基準通貨当月相殺額. Current month offset amount (Base currency).<p>
	 *
	 */
	public void base_cur_setoff_amt(int value) {
		setConstNumber(offset + 14, $base_cur_setoff_amt, value);
	}
	
	/**
	 * 基準通貨当月相殺額. Current month offset amount (Base currency).<p>
	 *
	 */
	public void base_cur_setoff_amt(long value) {
		setConstNumber(offset + 14, $base_cur_setoff_amt, value);
	}
	
	/**
	 * 基準通貨当月相殺額. Current month offset amount (Base currency).<p>
	 *
	 */
	public void base_cur_setoff_amt(float value) {
		setConstNumber(offset + 14, $base_cur_setoff_amt, value);
	}
	
	/**
	 * 基準通貨当月相殺額. Current month offset amount (Base currency).<p>
	 *
	 */
	public void base_cur_setoff_amt(double value) {
		setConstNumber(offset + 14, $base_cur_setoff_amt, value);
	}
	
	/**
	 * 基準通貨当月税額. Current month tax amount (Base currency).<p>
	 *
	 */
	public MCNumber base_cur_tax_amt() {
		return getConstNumber(offset + 15, $base_cur_tax_amt);
	}

	/**
	 * 基準通貨当月税額. Current month tax amount (Base currency).<p>
	 *
	 */
	public void base_cur_tax_amt(MCNumber value) {
		setConstNumber(offset + 15, $base_cur_tax_amt, value);
	}
	
	/**
	 * 基準通貨当月税額. Current month tax amount (Base currency).<p>
	 *
	 */
	public void base_cur_tax_amt(int value) {
		setConstNumber(offset + 15, $base_cur_tax_amt, value);
	}
	
	/**
	 * 基準通貨当月税額. Current month tax amount (Base currency).<p>
	 *
	 */
	public void base_cur_tax_amt(long value) {
		setConstNumber(offset + 15, $base_cur_tax_amt, value);
	}
	
	/**
	 * 基準通貨当月税額. Current month tax amount (Base currency).<p>
	 *
	 */
	public void base_cur_tax_amt(float value) {
		setConstNumber(offset + 15, $base_cur_tax_amt, value);
	}
	
	/**
	 * 基準通貨当月税額. Current month tax amount (Base currency).<p>
	 *
	 */
	public void base_cur_tax_amt(double value) {
		setConstNumber(offset + 15, $base_cur_tax_amt, value);
	}
	
	/**
	 * 基準通貨当月残高. Current month balance (Base currency).<p>
	 *
	 */
	public MCNumber base_cur_end_bal() {
		return getConstNumber(offset + 16, $base_cur_end_bal);
	}

	/**
	 * 基準通貨当月残高. Current month balance (Base currency).<p>
	 *
	 */
	public void base_cur_end_bal(MCNumber value) {
		setConstNumber(offset + 16, $base_cur_end_bal, value);
	}
	
	/**
	 * 基準通貨当月残高. Current month balance (Base currency).<p>
	 *
	 */
	public void base_cur_end_bal(int value) {
		setConstNumber(offset + 16, $base_cur_end_bal, value);
	}
	
	/**
	 * 基準通貨当月残高. Current month balance (Base currency).<p>
	 *
	 */
	public void base_cur_end_bal(long value) {
		setConstNumber(offset + 16, $base_cur_end_bal, value);
	}
	
	/**
	 * 基準通貨当月残高. Current month balance (Base currency).<p>
	 *
	 */
	public void base_cur_end_bal(float value) {
		setConstNumber(offset + 16, $base_cur_end_bal, value);
	}
	
	/**
	 * 基準通貨当月残高. Current month balance (Base currency).<p>
	 *
	 */
	public void base_cur_end_bal(double value) {
		setConstNumber(offset + 16, $base_cur_end_bal, value);
	}
	
	/**
	 * 予備１. Spare 1.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 17, $sub_char1);
	}

	/**
	 * 予備１. Spare 1.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 17, $sub_char1, value);
	}

	/**
	 * 予備２. Spare 2.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 18, $sub_char2);
	}

	/**
	 * 予備２. Spare 2.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 18, $sub_char2, value);
	}

	/**
	 * 予備３. Spare 3.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 19, $sub_char3);
	}

	/**
	 * 予備３. Spare 3.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 19, $sub_char3, value);
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
		if ($asppl_cd.equalsIgnoreCase(name)) {
			return asppl_cd();
		}
		if ($ap_dpt_cd.equalsIgnoreCase(name)) {
			return ap_dpt_cd();
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($base_cur_cd.equalsIgnoreCase(name)) {
			return base_cur_cd();
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
		if ($init_bal.equalsIgnoreCase(name)) {
			return init_bal();
		}
		if ($onr_prov_amt.equalsIgnoreCase(name)) {
			return onr_prov_amt();
		}
		if ($onr_prov_ret_amt.equalsIgnoreCase(name)) {
			return onr_prov_ret_amt();
		}
		if ($setoff_amt.equalsIgnoreCase(name)) {
			return setoff_amt();
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			return tax_amt();
		}
		if ($end_bal.equalsIgnoreCase(name)) {
			return end_bal();
		}
		if ($base_cur_init_bal.equalsIgnoreCase(name)) {
			return base_cur_init_bal();
		}
		if ($base_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			return base_cur_onr_prov_amt();
		}
		if ($base_cur_onr_prov_ret_amt.equalsIgnoreCase(name)) {
			return base_cur_onr_prov_ret_amt();
		}
		if ($base_cur_setoff_amt.equalsIgnoreCase(name)) {
			return base_cur_setoff_amt();
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			return base_cur_tax_amt();
		}
		if ($base_cur_end_bal.equalsIgnoreCase(name)) {
			return base_cur_end_bal();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumber(name);
	}

	public MCDate getDate(String name) {
		if ($ac_ym.equalsIgnoreCase(name)) {
			return ac_ym();
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
		if ($asppl_cd.equalsIgnoreCase(name)) {
			return asppl_cd();
		}
		if ($ap_dpt_cd.equalsIgnoreCase(name)) {
			return ap_dpt_cd();
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($base_cur_cd.equalsIgnoreCase(name)) {
			return base_cur_cd();
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
		if ($init_bal.equalsIgnoreCase(name)) {
			return init_bal();
		}
		if ($onr_prov_amt.equalsIgnoreCase(name)) {
			return onr_prov_amt();
		}
		if ($onr_prov_ret_amt.equalsIgnoreCase(name)) {
			return onr_prov_ret_amt();
		}
		if ($setoff_amt.equalsIgnoreCase(name)) {
			return setoff_amt();
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			return tax_amt();
		}
		if ($end_bal.equalsIgnoreCase(name)) {
			return end_bal();
		}
		if ($base_cur_init_bal.equalsIgnoreCase(name)) {
			return base_cur_init_bal();
		}
		if ($base_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			return base_cur_onr_prov_amt();
		}
		if ($base_cur_onr_prov_ret_amt.equalsIgnoreCase(name)) {
			return base_cur_onr_prov_ret_amt();
		}
		if ($base_cur_setoff_amt.equalsIgnoreCase(name)) {
			return base_cur_setoff_amt();
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			return base_cur_tax_amt();
		}
		if ($base_cur_end_bal.equalsIgnoreCase(name)) {
			return base_cur_end_bal();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumberNE(name);
	}

	public MCDate getDateNE(String name) {
		if ($ac_ym.equalsIgnoreCase(name)) {
			return ac_ym();
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
		if ($asppl_cd.equalsIgnoreCase(name)) {
			asppl_cd(value);
			return;
		}
		if ($ap_dpt_cd.equalsIgnoreCase(name)) {
			ap_dpt_cd(value);
			return;
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			trd_cur_cd(value);
			return;
		}
		if ($base_cur_cd.equalsIgnoreCase(name)) {
			base_cur_cd(value);
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
		if ($init_bal.equalsIgnoreCase(name)) {
			init_bal(value);
			return;
		}
		if ($onr_prov_amt.equalsIgnoreCase(name)) {
			onr_prov_amt(value);
			return;
		}
		if ($onr_prov_ret_amt.equalsIgnoreCase(name)) {
			onr_prov_ret_amt(value);
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
		if ($end_bal.equalsIgnoreCase(name)) {
			end_bal(value);
			return;
		}
		if ($base_cur_init_bal.equalsIgnoreCase(name)) {
			base_cur_init_bal(value);
			return;
		}
		if ($base_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			base_cur_onr_prov_amt(value);
			return;
		}
		if ($base_cur_onr_prov_ret_amt.equalsIgnoreCase(name)) {
			base_cur_onr_prov_ret_amt(value);
			return;
		}
		if ($base_cur_setoff_amt.equalsIgnoreCase(name)) {
			base_cur_setoff_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($base_cur_end_bal.equalsIgnoreCase(name)) {
			base_cur_end_bal(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, int value) {
		if ($init_bal.equalsIgnoreCase(name)) {
			init_bal(value);
			return;
		}
		if ($onr_prov_amt.equalsIgnoreCase(name)) {
			onr_prov_amt(value);
			return;
		}
		if ($onr_prov_ret_amt.equalsIgnoreCase(name)) {
			onr_prov_ret_amt(value);
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
		if ($end_bal.equalsIgnoreCase(name)) {
			end_bal(value);
			return;
		}
		if ($base_cur_init_bal.equalsIgnoreCase(name)) {
			base_cur_init_bal(value);
			return;
		}
		if ($base_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			base_cur_onr_prov_amt(value);
			return;
		}
		if ($base_cur_onr_prov_ret_amt.equalsIgnoreCase(name)) {
			base_cur_onr_prov_ret_amt(value);
			return;
		}
		if ($base_cur_setoff_amt.equalsIgnoreCase(name)) {
			base_cur_setoff_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($base_cur_end_bal.equalsIgnoreCase(name)) {
			base_cur_end_bal(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, long value) {
		if ($init_bal.equalsIgnoreCase(name)) {
			init_bal(value);
			return;
		}
		if ($onr_prov_amt.equalsIgnoreCase(name)) {
			onr_prov_amt(value);
			return;
		}
		if ($onr_prov_ret_amt.equalsIgnoreCase(name)) {
			onr_prov_ret_amt(value);
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
		if ($end_bal.equalsIgnoreCase(name)) {
			end_bal(value);
			return;
		}
		if ($base_cur_init_bal.equalsIgnoreCase(name)) {
			base_cur_init_bal(value);
			return;
		}
		if ($base_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			base_cur_onr_prov_amt(value);
			return;
		}
		if ($base_cur_onr_prov_ret_amt.equalsIgnoreCase(name)) {
			base_cur_onr_prov_ret_amt(value);
			return;
		}
		if ($base_cur_setoff_amt.equalsIgnoreCase(name)) {
			base_cur_setoff_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($base_cur_end_bal.equalsIgnoreCase(name)) {
			base_cur_end_bal(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, float value) {
		if ($init_bal.equalsIgnoreCase(name)) {
			init_bal(value);
			return;
		}
		if ($onr_prov_amt.equalsIgnoreCase(name)) {
			onr_prov_amt(value);
			return;
		}
		if ($onr_prov_ret_amt.equalsIgnoreCase(name)) {
			onr_prov_ret_amt(value);
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
		if ($end_bal.equalsIgnoreCase(name)) {
			end_bal(value);
			return;
		}
		if ($base_cur_init_bal.equalsIgnoreCase(name)) {
			base_cur_init_bal(value);
			return;
		}
		if ($base_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			base_cur_onr_prov_amt(value);
			return;
		}
		if ($base_cur_onr_prov_ret_amt.equalsIgnoreCase(name)) {
			base_cur_onr_prov_ret_amt(value);
			return;
		}
		if ($base_cur_setoff_amt.equalsIgnoreCase(name)) {
			base_cur_setoff_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($base_cur_end_bal.equalsIgnoreCase(name)) {
			base_cur_end_bal(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, double value) {
		if ($init_bal.equalsIgnoreCase(name)) {
			init_bal(value);
			return;
		}
		if ($onr_prov_amt.equalsIgnoreCase(name)) {
			onr_prov_amt(value);
			return;
		}
		if ($onr_prov_ret_amt.equalsIgnoreCase(name)) {
			onr_prov_ret_amt(value);
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
		if ($end_bal.equalsIgnoreCase(name)) {
			end_bal(value);
			return;
		}
		if ($base_cur_init_bal.equalsIgnoreCase(name)) {
			base_cur_init_bal(value);
			return;
		}
		if ($base_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			base_cur_onr_prov_amt(value);
			return;
		}
		if ($base_cur_onr_prov_ret_amt.equalsIgnoreCase(name)) {
			base_cur_onr_prov_ret_amt(value);
			return;
		}
		if ($base_cur_setoff_amt.equalsIgnoreCase(name)) {
			base_cur_setoff_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($base_cur_end_bal.equalsIgnoreCase(name)) {
			base_cur_end_bal(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setDate(String name, MCDate value) {
		if ($ac_ym.equalsIgnoreCase(name)) {
			ac_ym(value);
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
		if ($asppl_cd.equalsIgnoreCase(name)) {
			asppl_cd(value);
			return;
		}
		if ($ap_dpt_cd.equalsIgnoreCase(name)) {
			ap_dpt_cd(value);
			return;
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			trd_cur_cd(value);
			return;
		}
		if ($base_cur_cd.equalsIgnoreCase(name)) {
			base_cur_cd(value);
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
		if ($init_bal.equalsIgnoreCase(name)) {
			init_bal(value);
			return;
		}
		if ($onr_prov_amt.equalsIgnoreCase(name)) {
			onr_prov_amt(value);
			return;
		}
		if ($onr_prov_ret_amt.equalsIgnoreCase(name)) {
			onr_prov_ret_amt(value);
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
		if ($end_bal.equalsIgnoreCase(name)) {
			end_bal(value);
			return;
		}
		if ($base_cur_init_bal.equalsIgnoreCase(name)) {
			base_cur_init_bal(value);
			return;
		}
		if ($base_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			base_cur_onr_prov_amt(value);
			return;
		}
		if ($base_cur_onr_prov_ret_amt.equalsIgnoreCase(name)) {
			base_cur_onr_prov_ret_amt(value);
			return;
		}
		if ($base_cur_setoff_amt.equalsIgnoreCase(name)) {
			base_cur_setoff_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($base_cur_end_bal.equalsIgnoreCase(name)) {
			base_cur_end_bal(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, int value) {
		if ($init_bal.equalsIgnoreCase(name)) {
			init_bal(value);
			return;
		}
		if ($onr_prov_amt.equalsIgnoreCase(name)) {
			onr_prov_amt(value);
			return;
		}
		if ($onr_prov_ret_amt.equalsIgnoreCase(name)) {
			onr_prov_ret_amt(value);
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
		if ($end_bal.equalsIgnoreCase(name)) {
			end_bal(value);
			return;
		}
		if ($base_cur_init_bal.equalsIgnoreCase(name)) {
			base_cur_init_bal(value);
			return;
		}
		if ($base_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			base_cur_onr_prov_amt(value);
			return;
		}
		if ($base_cur_onr_prov_ret_amt.equalsIgnoreCase(name)) {
			base_cur_onr_prov_ret_amt(value);
			return;
		}
		if ($base_cur_setoff_amt.equalsIgnoreCase(name)) {
			base_cur_setoff_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($base_cur_end_bal.equalsIgnoreCase(name)) {
			base_cur_end_bal(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, long value) {
		if ($init_bal.equalsIgnoreCase(name)) {
			init_bal(value);
			return;
		}
		if ($onr_prov_amt.equalsIgnoreCase(name)) {
			onr_prov_amt(value);
			return;
		}
		if ($onr_prov_ret_amt.equalsIgnoreCase(name)) {
			onr_prov_ret_amt(value);
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
		if ($end_bal.equalsIgnoreCase(name)) {
			end_bal(value);
			return;
		}
		if ($base_cur_init_bal.equalsIgnoreCase(name)) {
			base_cur_init_bal(value);
			return;
		}
		if ($base_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			base_cur_onr_prov_amt(value);
			return;
		}
		if ($base_cur_onr_prov_ret_amt.equalsIgnoreCase(name)) {
			base_cur_onr_prov_ret_amt(value);
			return;
		}
		if ($base_cur_setoff_amt.equalsIgnoreCase(name)) {
			base_cur_setoff_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($base_cur_end_bal.equalsIgnoreCase(name)) {
			base_cur_end_bal(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, float value) {
		if ($init_bal.equalsIgnoreCase(name)) {
			init_bal(value);
			return;
		}
		if ($onr_prov_amt.equalsIgnoreCase(name)) {
			onr_prov_amt(value);
			return;
		}
		if ($onr_prov_ret_amt.equalsIgnoreCase(name)) {
			onr_prov_ret_amt(value);
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
		if ($end_bal.equalsIgnoreCase(name)) {
			end_bal(value);
			return;
		}
		if ($base_cur_init_bal.equalsIgnoreCase(name)) {
			base_cur_init_bal(value);
			return;
		}
		if ($base_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			base_cur_onr_prov_amt(value);
			return;
		}
		if ($base_cur_onr_prov_ret_amt.equalsIgnoreCase(name)) {
			base_cur_onr_prov_ret_amt(value);
			return;
		}
		if ($base_cur_setoff_amt.equalsIgnoreCase(name)) {
			base_cur_setoff_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($base_cur_end_bal.equalsIgnoreCase(name)) {
			base_cur_end_bal(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, double value) {
		if ($init_bal.equalsIgnoreCase(name)) {
			init_bal(value);
			return;
		}
		if ($onr_prov_amt.equalsIgnoreCase(name)) {
			onr_prov_amt(value);
			return;
		}
		if ($onr_prov_ret_amt.equalsIgnoreCase(name)) {
			onr_prov_ret_amt(value);
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
		if ($end_bal.equalsIgnoreCase(name)) {
			end_bal(value);
			return;
		}
		if ($base_cur_init_bal.equalsIgnoreCase(name)) {
			base_cur_init_bal(value);
			return;
		}
		if ($base_cur_onr_prov_amt.equalsIgnoreCase(name)) {
			base_cur_onr_prov_amt(value);
			return;
		}
		if ($base_cur_onr_prov_ret_amt.equalsIgnoreCase(name)) {
			base_cur_onr_prov_ret_amt(value);
			return;
		}
		if ($base_cur_setoff_amt.equalsIgnoreCase(name)) {
			base_cur_setoff_amt(value);
			return;
		}
		if ($base_cur_tax_amt.equalsIgnoreCase(name)) {
			base_cur_tax_amt(value);
			return;
		}
		if ($base_cur_end_bal.equalsIgnoreCase(name)) {
			base_cur_end_bal(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setDateNE(String name, MCDate value) {
		if ($ac_ym.equalsIgnoreCase(name)) {
			ac_ym(value);
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
