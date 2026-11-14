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
import mcframe.commonCore.meta.MCMeta;
import mcframe.commonCore.lang.MCDataType;
import mcframe.commonCore.lang.MCTimestamp;
import mcframe.serverCore.queryapi.MCDBContainer;
import mcframe.serverCore.queryapi.MCDBContainer.MCTableType;
import mcframe.serverCore.queryapi.IFMCSQL.MCPermColumn;
import mcframe.serverCore.queryapi.IFMCSQL.MCPermColumnInfo;
import mcframe.serverCore.queryapi.MCForeignInfo;

/**
 * "照合展開マスタ // Collation Expansion Master"DBコンテナRowクラスです。<p>
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
 *  	<td>match_key</td>
 *  	<td>C</td>
 *  	<td>30</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>照合キー</td>
 *  	<td></td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>sub</td>
 *  	<td>N</td>
 *  	<td>3</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>枝番</td>
 *  	<td></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>K</td>
 *  	<td>typ</td>
 *  	<td>N</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>区分</td>
 *  	<td></td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>itm_cd</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>品目ＣＤ</td>
 *  	<td></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>itm_sub1</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>枝番１</td>
 *  	<td></td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>itm_sub2</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>枝番２</td>
 *  	<td></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>itm_sub3</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>枝番３</td>
 *  	<td></td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>itm_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品名</td>
 *  	<td></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>itm_alt_nm1</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>別名１</td>
 *  	<td></td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>match_d_key</td>
 *  	<td>C</td>
 *  	<td>3</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>照合明細キー</td>
 *  	<td></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>itm_qty</td>
 *  	<td>N</td>
 *  	<td>6</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目数量</td>
 *  	<td></td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>work_proc_no</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>工事要領書番号</td>
 *  	<td></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>fill_color</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>塗色</td>
 *  	<td></td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>nm_plate</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>銘版</td>
 *  	<td></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>rmrks1</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>コメント１</td>
 *  	<td></td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>rmrks2</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>コメント２</td>
 *  	<td></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>rmrks3</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>コメント３</td>
 *  	<td></td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>rmrks4</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>コメント４</td>
 *  	<td></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>rmrks5</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>コメント５</td>
 *  	<td></td>
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
public class MAM_COLLAT_EXP_ALL_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.TABLE;

	public static final String TABLE_NAME = "MAM_COLLAT_EXP_ALL";

	public static final boolean EX_CTRL = true;
	
	public static final boolean LCL_TABLE = false;
	
	/**
	 * 照合キー. .<p>
	 *
	 */
	public static final String $match_key = "match_key";
	private static final MCPermColumnInfo _match_key = createColumnInfo("match_key");
	public final MCStringPermColumn match_key = createStringColumn(_match_key);
	
	/**
	 * 枝番. .<p>
	 *
	 */
	public static final String $sub = "sub";
	private static final MCPermColumnInfo _sub = createColumnInfo("sub");
	public final MCNumberPermColumn sub = createNumberColumn(_sub);
	
	/**
	 * 区分. .<p>
	 *
	 */
	public static final String $typ = "typ";
	private static final MCPermColumnInfo _typ = createColumnInfo("typ");
	public final MCNumberPermColumn typ = createNumberColumn(_typ);
	
	/**
	 * 品目ＣＤ. .<p>
	 *
	 */
	public static final String $itm_cd = "itm_cd";
	private static final MCPermColumnInfo _itm_cd = createColumnInfo("itm_cd");
	public final MCStringPermColumn itm_cd = createStringColumn(_itm_cd);
	
	/**
	 * 枝番１. .<p>
	 *
	 */
	public static final String $itm_sub1 = "itm_sub1";
	private static final MCPermColumnInfo _itm_sub1 = createColumnInfo("itm_sub1");
	public final MCStringPermColumn itm_sub1 = createStringColumn(_itm_sub1);
	
	/**
	 * 枝番２. .<p>
	 *
	 */
	public static final String $itm_sub2 = "itm_sub2";
	private static final MCPermColumnInfo _itm_sub2 = createColumnInfo("itm_sub2");
	public final MCStringPermColumn itm_sub2 = createStringColumn(_itm_sub2);
	
	/**
	 * 枝番３. .<p>
	 *
	 */
	public static final String $itm_sub3 = "itm_sub3";
	private static final MCPermColumnInfo _itm_sub3 = createColumnInfo("itm_sub3");
	public final MCStringPermColumn itm_sub3 = createStringColumn(_itm_sub3);
	
	/**
	 * 品名. .<p>
	 *
	 */
	public static final String $itm_nm = "itm_nm";
	private static final MCPermColumnInfo _itm_nm = createColumnInfo("itm_nm");
	public final MCStringPermColumn itm_nm = createStringColumn(_itm_nm);
	
	/**
	 * 別名１. .<p>
	 *
	 */
	public static final String $itm_alt_nm1 = "itm_alt_nm1";
	private static final MCPermColumnInfo _itm_alt_nm1 = createColumnInfo("itm_alt_nm1");
	public final MCStringPermColumn itm_alt_nm1 = createStringColumn(_itm_alt_nm1);
	
	/**
	 * 照合明細キー. .<p>
	 *
	 */
	public static final String $match_d_key = "match_d_key";
	private static final MCPermColumnInfo _match_d_key = createColumnInfo("match_d_key");
	public final MCStringPermColumn match_d_key = createStringColumn(_match_d_key);
	
	/**
	 * 品目数量. .<p>
	 *
	 */
	public static final String $itm_qty = "itm_qty";
	private static final MCPermColumnInfo _itm_qty = createColumnInfo("itm_qty");
	public final MCNumberPermColumn itm_qty = createNumberColumn(_itm_qty);
	
	/**
	 * 工事要領書番号. .<p>
	 *
	 */
	public static final String $work_proc_no = "work_proc_no";
	private static final MCPermColumnInfo _work_proc_no = createColumnInfo("work_proc_no");
	public final MCStringPermColumn work_proc_no = createStringColumn(_work_proc_no);
	
	/**
	 * 塗色. .<p>
	 *
	 */
	public static final String $fill_color = "fill_color";
	private static final MCPermColumnInfo _fill_color = createColumnInfo("fill_color");
	public final MCStringPermColumn fill_color = createStringColumn(_fill_color);
	
	/**
	 * 銘版. .<p>
	 *
	 */
	public static final String $nm_plate = "nm_plate";
	private static final MCPermColumnInfo _nm_plate = createColumnInfo("nm_plate");
	public final MCStringPermColumn nm_plate = createStringColumn(_nm_plate);
	
	/**
	 * コメント１. .<p>
	 *
	 */
	public static final String $rmrks1 = "rmrks1";
	private static final MCPermColumnInfo _rmrks1 = createColumnInfo("rmrks1");
	public final MCStringPermColumn rmrks1 = createStringColumn(_rmrks1);
	
	/**
	 * コメント２. .<p>
	 *
	 */
	public static final String $rmrks2 = "rmrks2";
	private static final MCPermColumnInfo _rmrks2 = createColumnInfo("rmrks2");
	public final MCStringPermColumn rmrks2 = createStringColumn(_rmrks2);
	
	/**
	 * コメント３. .<p>
	 *
	 */
	public static final String $rmrks3 = "rmrks3";
	private static final MCPermColumnInfo _rmrks3 = createColumnInfo("rmrks3");
	public final MCStringPermColumn rmrks3 = createStringColumn(_rmrks3);
	
	/**
	 * コメント４. .<p>
	 *
	 */
	public static final String $rmrks4 = "rmrks4";
	private static final MCPermColumnInfo _rmrks4 = createColumnInfo("rmrks4");
	public final MCStringPermColumn rmrks4 = createStringColumn(_rmrks4);
	
	/**
	 * コメント５. .<p>
	 *
	 */
	public static final String $rmrks5 = "rmrks5";
	private static final MCPermColumnInfo _rmrks5 = createColumnInfo("rmrks5");
	public final MCStringPermColumn rmrks5 = createStringColumn(_rmrks5);
	
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
	
	public static final MCMeta match_key_META = createCommonMeta($match_key, mcframe.commonMA.meta.MA_META.MATCH_KEY);
	public static final MCMeta sub_META = createCommonMeta($sub, mcframe.commonMA.meta.MA_META.SUB);
	public static final MCMeta typ_META = createCommonMeta($typ, mcframe.commonMA.meta.MA_META.TYP);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta itm_nm_META = createCommonMeta($itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta itm_alt_nm1_META = createCommonMeta($itm_alt_nm1, mcframe.commonMA.meta.MA_META.ITM_ALT_NM1);
	public static final MCMeta match_d_key_META = createCommonMeta($match_d_key, mcframe.commonMA.meta.MA_META.MATCH_DTL_KEY);
	public static final MCMeta itm_qty_META = createCommonMeta($itm_qty, mcframe.commonMA.meta.MA_META.ITM_QTY);
	public static final MCMeta work_proc_no_META = createCommonMeta($work_proc_no, mcframe.commonMA.meta.MA_META.WORK_PROC_NO);
	public static final MCMeta fill_color_META = createCommonMeta($fill_color, mcframe.commonMA.meta.MA_META.FILL_COLOR);
	public static final MCMeta nm_plate_META = createCommonMeta($nm_plate, mcframe.commonMA.meta.MA_META.NM_PLATE);
	public static final MCMeta rmrks1_META = createCommonMeta($rmrks1, mcframe.commonMA.meta.MA_META.RMRKS1);
	public static final MCMeta rmrks2_META = createCommonMeta($rmrks2, mcframe.commonMA.meta.MA_META.RMRKS2);
	public static final MCMeta rmrks3_META = createCommonMeta($rmrks3, mcframe.commonMA.meta.MA_META.RMRKS3);
	public static final MCMeta rmrks4_META = createCommonMeta($rmrks4, mcframe.commonMA.meta.MA_META.RMRKS4);
	public static final MCMeta rmrks5_META = createCommonMeta($rmrks5, mcframe.commonMA.meta.MA_META.RMRKS5);
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
	
	protected static final ConstMetaList<MAM_COLLAT_EXP_ALL_R> constMetas = new ConstMetaList<MAM_COLLAT_EXP_ALL_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			match_key_META,
			sub_META,
			typ_META,
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			itm_nm_META,
			itm_alt_nm1_META,
			match_d_key_META,
			itm_qty_META,
			work_proc_no_META,
			fill_color_META,
			nm_plate_META,
			rmrks1_META,
			rmrks2_META,
			rmrks3_META,
			rmrks4_META,
			rmrks5_META,
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
	protected MAM_COLLAT_EXP_ALL_R(ConstMetaList<? extends MAM_COLLAT_EXP_ALL_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MAM_COLLAT_EXP_ALL_R(ConstMetaList<? extends MAM_COLLAT_EXP_ALL_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MAM_COLLAT_EXP_ALL_R.$match_key,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_COLLAT_EXP_ALL_R.$match_key,
				"match_key",
				match_key,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_COLLAT_EXP_ALL_R.$sub,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_COLLAT_EXP_ALL_R.$sub,
				"sub",
				sub,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_COLLAT_EXP_ALL_R.$typ,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_COLLAT_EXP_ALL_R.$typ,
				"typ",
				typ,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_COLLAT_EXP_ALL_R.$itm_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_COLLAT_EXP_ALL_R.$itm_cd,
				"itm_cd",
				itm_cd,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_COLLAT_EXP_ALL_R.$itm_sub1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_COLLAT_EXP_ALL_R.$itm_sub1,
				"itm_sub1",
				itm_sub1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_COLLAT_EXP_ALL_R.$itm_sub2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_COLLAT_EXP_ALL_R.$itm_sub2,
				"itm_sub2",
				itm_sub2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_COLLAT_EXP_ALL_R.$itm_sub3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_COLLAT_EXP_ALL_R.$itm_sub3,
				"itm_sub3",
				itm_sub3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_COLLAT_EXP_ALL_R.$itm_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_COLLAT_EXP_ALL_R.$itm_nm,
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
			MAM_COLLAT_EXP_ALL_R.$itm_alt_nm1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_COLLAT_EXP_ALL_R.$itm_alt_nm1,
				"itm_alt_nm1",
				itm_alt_nm1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_COLLAT_EXP_ALL_R.$match_d_key,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_COLLAT_EXP_ALL_R.$match_d_key,
				"match_d_key",
				match_d_key,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_COLLAT_EXP_ALL_R.$itm_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_COLLAT_EXP_ALL_R.$itm_qty,
				"itm_qty",
				itm_qty,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_COLLAT_EXP_ALL_R.$work_proc_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_COLLAT_EXP_ALL_R.$work_proc_no,
				"work_proc_no",
				work_proc_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_COLLAT_EXP_ALL_R.$fill_color,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_COLLAT_EXP_ALL_R.$fill_color,
				"fill_color",
				fill_color,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_COLLAT_EXP_ALL_R.$nm_plate,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_COLLAT_EXP_ALL_R.$nm_plate,
				"nm_plate",
				nm_plate,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_COLLAT_EXP_ALL_R.$rmrks1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_COLLAT_EXP_ALL_R.$rmrks1,
				"rmrks1",
				rmrks1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_COLLAT_EXP_ALL_R.$rmrks2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_COLLAT_EXP_ALL_R.$rmrks2,
				"rmrks2",
				rmrks2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_COLLAT_EXP_ALL_R.$rmrks3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_COLLAT_EXP_ALL_R.$rmrks3,
				"rmrks3",
				rmrks3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_COLLAT_EXP_ALL_R.$rmrks4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_COLLAT_EXP_ALL_R.$rmrks4,
				"rmrks4",
				rmrks4,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_COLLAT_EXP_ALL_R.$rmrks5,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_COLLAT_EXP_ALL_R.$rmrks5,
				"rmrks5",
				rmrks5,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_COLLAT_EXP_ALL_R.$ins_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_COLLAT_EXP_ALL_R.$ins_usr_id,
				"ins_usr_id",
				ins_usr_id,
				false,
				true,
				true,
				true,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_COLLAT_EXP_ALL_R.$ins_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_COLLAT_EXP_ALL_R.$ins_usr_nm,
				"ins_usr_nm",
				ins_usr_nm,
				false,
				true,
				true,
				true,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_COLLAT_EXP_ALL_R.$ins_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MAM_COLLAT_EXP_ALL_R.$ins_ts,
				"ins_ts",
				ins_ts,
				false,
				true,
				true,
				true,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_COLLAT_EXP_ALL_R.$ins_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_COLLAT_EXP_ALL_R.$ins_func_id,
				"ins_func_id",
				ins_func_id,
				false,
				true,
				true,
				true,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_COLLAT_EXP_ALL_R.$upd_cntr,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_COLLAT_EXP_ALL_R.$upd_cntr,
				"upd_cntr",
				upd_cntr,
				false,
				true,
				true,
				true,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_COLLAT_EXP_ALL_R.$upd_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_COLLAT_EXP_ALL_R.$upd_usr_id,
				"upd_usr_id",
				upd_usr_id,
				false,
				true,
				true,
				true,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_COLLAT_EXP_ALL_R.$upd_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_COLLAT_EXP_ALL_R.$upd_usr_nm,
				"upd_usr_nm",
				upd_usr_nm,
				false,
				true,
				true,
				true,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_COLLAT_EXP_ALL_R.$upd_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MAM_COLLAT_EXP_ALL_R.$upd_ts,
				"upd_ts",
				upd_ts,
				false,
				true,
				true,
				true,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_COLLAT_EXP_ALL_R.$upd_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_COLLAT_EXP_ALL_R.$upd_func_id,
				"upd_func_id",
				upd_func_id,
				false,
				true,
				true,
				true,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_COLLAT_EXP_ALL_R.$upd_srv_req_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_COLLAT_EXP_ALL_R.$upd_srv_req_no,
				"upd_srv_req_no",
				upd_srv_req_no,
				false,
				true,
				true,
				true,
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
	public static MAM_COLLAT_EXP_ALL_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MAM_COLLAT_EXP_ALL_R create(String alias) {
		MAM_COLLAT_EXP_ALL_R row = new MAM_COLLAT_EXP_ALL_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MAM_COLLAT_EXP_ALL_R createByName(T proto) {
		MAM_COLLAT_EXP_ALL_R row = MAM_COLLAT_EXP_ALL_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAM_COLLAT_EXP_ALL_R clone() {
		return (MAM_COLLAT_EXP_ALL_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAM_COLLAT_EXP_ALL_R createInstance() {
		return (MAM_COLLAT_EXP_ALL_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAM_COLLAT_EXP_ALL_R getValues(String... names) {
		return (MAM_COLLAT_EXP_ALL_R) super.getValues(names);
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
	 public MAW_COLLAT_EXP_KEY_R getPkWorkDbc(String alias) {
	 	return MAW_COLLAT_EXP_KEY_R.create(alias);
	 }

	/*
	 * MCDBContainerのオーバーライドメソッドです。
	 */
	 public MAW_COLLAT_EXP_KEY_R getPkWorkDbc() {
	 	return getPkWorkDbc(MAW_COLLAT_EXP_KEY_R.TABLE_NAME);
	 }

	/**
	 * 照合キー. .<p>
	 *
	 */
	public String match_key() {
		return getConstString(offset + 0, $match_key);
	}

	/**
	 * 照合キー. .<p>
	 *
	 */
	public void match_key(String value) {
		setConstString(offset + 0, $match_key, value);
	}

	/**
	 * 枝番. .<p>
	 *
	 */
	public MCNumber sub() {
		return getConstNumber(offset + 1, $sub);
	}

	/**
	 * 枝番. .<p>
	 *
	 */
	public void sub(MCNumber value) {
		setConstNumber(offset + 1, $sub, value);
	}
	
	/**
	 * 枝番. .<p>
	 *
	 */
	public void sub(int value) {
		setConstNumber(offset + 1, $sub, value);
	}
	
	/**
	 * 枝番. .<p>
	 *
	 */
	public void sub(long value) {
		setConstNumber(offset + 1, $sub, value);
	}
	
	/**
	 * 枝番. .<p>
	 *
	 */
	public void sub(float value) {
		setConstNumber(offset + 1, $sub, value);
	}
	
	/**
	 * 枝番. .<p>
	 *
	 */
	public void sub(double value) {
		setConstNumber(offset + 1, $sub, value);
	}
	
	/**
	 * 区分. .<p>
	 *
	 */
	public MCNumber typ() {
		return getConstNumber(offset + 2, $typ);
	}

	/**
	 * 区分. .<p>
	 *
	 */
	public void typ(MCNumber value) {
		setConstNumber(offset + 2, $typ, value);
	}
	
	/**
	 * 区分. .<p>
	 *
	 */
	public void typ(int value) {
		setConstNumber(offset + 2, $typ, value);
	}
	
	/**
	 * 区分. .<p>
	 *
	 */
	public void typ(long value) {
		setConstNumber(offset + 2, $typ, value);
	}
	
	/**
	 * 区分. .<p>
	 *
	 */
	public void typ(float value) {
		setConstNumber(offset + 2, $typ, value);
	}
	
	/**
	 * 区分. .<p>
	 *
	 */
	public void typ(double value) {
		setConstNumber(offset + 2, $typ, value);
	}
	
	/**
	 * 品目ＣＤ. .<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 3, $itm_cd);
	}

	/**
	 * 品目ＣＤ. .<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 3, $itm_cd, value);
	}

	/**
	 * 枝番１. .<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 4, $itm_sub1);
	}

	/**
	 * 枝番１. .<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 4, $itm_sub1, value);
	}

	/**
	 * 枝番２. .<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 5, $itm_sub2);
	}

	/**
	 * 枝番２. .<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 5, $itm_sub2, value);
	}

	/**
	 * 枝番３. .<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 6, $itm_sub3);
	}

	/**
	 * 枝番３. .<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 6, $itm_sub3, value);
	}

	/**
	 * 品名. .<p>
	 *
	 */
	public String itm_nm() {
		return getConstString(offset + 7, $itm_nm);
	}

	/**
	 * 品名. .<p>
	 *
	 */
	public void itm_nm(String value) {
		setConstString(offset + 7, $itm_nm, value);
	}

	/**
	 * 別名１. .<p>
	 *
	 */
	public String itm_alt_nm1() {
		return getConstString(offset + 8, $itm_alt_nm1);
	}

	/**
	 * 別名１. .<p>
	 *
	 */
	public void itm_alt_nm1(String value) {
		setConstString(offset + 8, $itm_alt_nm1, value);
	}

	/**
	 * 照合明細キー. .<p>
	 *
	 */
	public String match_d_key() {
		return getConstString(offset + 9, $match_d_key);
	}

	/**
	 * 照合明細キー. .<p>
	 *
	 */
	public void match_d_key(String value) {
		setConstString(offset + 9, $match_d_key, value);
	}

	/**
	 * 品目数量. .<p>
	 *
	 */
	public MCNumber itm_qty() {
		return getConstNumber(offset + 10, $itm_qty);
	}

	/**
	 * 品目数量. .<p>
	 *
	 */
	public void itm_qty(MCNumber value) {
		setConstNumber(offset + 10, $itm_qty, value);
	}
	
	/**
	 * 品目数量. .<p>
	 *
	 */
	public void itm_qty(int value) {
		setConstNumber(offset + 10, $itm_qty, value);
	}
	
	/**
	 * 品目数量. .<p>
	 *
	 */
	public void itm_qty(long value) {
		setConstNumber(offset + 10, $itm_qty, value);
	}
	
	/**
	 * 品目数量. .<p>
	 *
	 */
	public void itm_qty(float value) {
		setConstNumber(offset + 10, $itm_qty, value);
	}
	
	/**
	 * 品目数量. .<p>
	 *
	 */
	public void itm_qty(double value) {
		setConstNumber(offset + 10, $itm_qty, value);
	}
	
	/**
	 * 工事要領書番号. .<p>
	 *
	 */
	public String work_proc_no() {
		return getConstString(offset + 11, $work_proc_no);
	}

	/**
	 * 工事要領書番号. .<p>
	 *
	 */
	public void work_proc_no(String value) {
		setConstString(offset + 11, $work_proc_no, value);
	}

	/**
	 * 塗色. .<p>
	 *
	 */
	public String fill_color() {
		return getConstString(offset + 12, $fill_color);
	}

	/**
	 * 塗色. .<p>
	 *
	 */
	public void fill_color(String value) {
		setConstString(offset + 12, $fill_color, value);
	}

	/**
	 * 銘版. .<p>
	 *
	 */
	public String nm_plate() {
		return getConstString(offset + 13, $nm_plate);
	}

	/**
	 * 銘版. .<p>
	 *
	 */
	public void nm_plate(String value) {
		setConstString(offset + 13, $nm_plate, value);
	}

	/**
	 * コメント１. .<p>
	 *
	 */
	public String rmrks1() {
		return getConstString(offset + 14, $rmrks1);
	}

	/**
	 * コメント１. .<p>
	 *
	 */
	public void rmrks1(String value) {
		setConstString(offset + 14, $rmrks1, value);
	}

	/**
	 * コメント２. .<p>
	 *
	 */
	public String rmrks2() {
		return getConstString(offset + 15, $rmrks2);
	}

	/**
	 * コメント２. .<p>
	 *
	 */
	public void rmrks2(String value) {
		setConstString(offset + 15, $rmrks2, value);
	}

	/**
	 * コメント３. .<p>
	 *
	 */
	public String rmrks3() {
		return getConstString(offset + 16, $rmrks3);
	}

	/**
	 * コメント３. .<p>
	 *
	 */
	public void rmrks3(String value) {
		setConstString(offset + 16, $rmrks3, value);
	}

	/**
	 * コメント４. .<p>
	 *
	 */
	public String rmrks4() {
		return getConstString(offset + 17, $rmrks4);
	}

	/**
	 * コメント４. .<p>
	 *
	 */
	public void rmrks4(String value) {
		setConstString(offset + 17, $rmrks4, value);
	}

	/**
	 * コメント５. .<p>
	 *
	 */
	public String rmrks5() {
		return getConstString(offset + 18, $rmrks5);
	}

	/**
	 * コメント５. .<p>
	 *
	 */
	public void rmrks5(String value) {
		setConstString(offset + 18, $rmrks5, value);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 19, $ins_usr_id);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 19, $ins_usr_id, value);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 20, $ins_usr_nm);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 20, $ins_usr_nm, value);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 21, $ins_ts);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 21, $ins_ts, value);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 22, $ins_func_id);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 22, $ins_func_id, value);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 23, $upd_cntr);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 23, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 23, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 23, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 23, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 23, $upd_cntr, value);
	}
	
	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 24, $upd_usr_id);
	}

	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 24, $upd_usr_id, value);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 25, $upd_usr_nm);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 25, $upd_usr_nm, value);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 26, $upd_ts);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 26, $upd_ts, value);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 27, $upd_func_id);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 27, $upd_func_id, value);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 28, $upd_srv_req_no);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 28, $upd_srv_req_no, value);
	}

	public String getString(String name) {
		if ($match_key.equalsIgnoreCase(name)) {
			return match_key();
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
		if ($itm_nm.equalsIgnoreCase(name)) {
			return itm_nm();
		}
		if ($itm_alt_nm1.equalsIgnoreCase(name)) {
			return itm_alt_nm1();
		}
		if ($match_d_key.equalsIgnoreCase(name)) {
			return match_d_key();
		}
		if ($work_proc_no.equalsIgnoreCase(name)) {
			return work_proc_no();
		}
		if ($fill_color.equalsIgnoreCase(name)) {
			return fill_color();
		}
		if ($nm_plate.equalsIgnoreCase(name)) {
			return nm_plate();
		}
		if ($rmrks1.equalsIgnoreCase(name)) {
			return rmrks1();
		}
		if ($rmrks2.equalsIgnoreCase(name)) {
			return rmrks2();
		}
		if ($rmrks3.equalsIgnoreCase(name)) {
			return rmrks3();
		}
		if ($rmrks4.equalsIgnoreCase(name)) {
			return rmrks4();
		}
		if ($rmrks5.equalsIgnoreCase(name)) {
			return rmrks5();
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
		if ($sub.equalsIgnoreCase(name)) {
			return sub();
		}
		if ($typ.equalsIgnoreCase(name)) {
			return typ();
		}
		if ($itm_qty.equalsIgnoreCase(name)) {
			return itm_qty();
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
		if ($match_key.equalsIgnoreCase(name)) {
			return match_key();
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
		if ($itm_nm.equalsIgnoreCase(name)) {
			return itm_nm();
		}
		if ($itm_alt_nm1.equalsIgnoreCase(name)) {
			return itm_alt_nm1();
		}
		if ($match_d_key.equalsIgnoreCase(name)) {
			return match_d_key();
		}
		if ($work_proc_no.equalsIgnoreCase(name)) {
			return work_proc_no();
		}
		if ($fill_color.equalsIgnoreCase(name)) {
			return fill_color();
		}
		if ($nm_plate.equalsIgnoreCase(name)) {
			return nm_plate();
		}
		if ($rmrks1.equalsIgnoreCase(name)) {
			return rmrks1();
		}
		if ($rmrks2.equalsIgnoreCase(name)) {
			return rmrks2();
		}
		if ($rmrks3.equalsIgnoreCase(name)) {
			return rmrks3();
		}
		if ($rmrks4.equalsIgnoreCase(name)) {
			return rmrks4();
		}
		if ($rmrks5.equalsIgnoreCase(name)) {
			return rmrks5();
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
		if ($sub.equalsIgnoreCase(name)) {
			return sub();
		}
		if ($typ.equalsIgnoreCase(name)) {
			return typ();
		}
		if ($itm_qty.equalsIgnoreCase(name)) {
			return itm_qty();
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
		if ($match_key.equalsIgnoreCase(name)) {
			match_key(value);
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
		if ($itm_nm.equalsIgnoreCase(name)) {
			itm_nm(value);
			return;
		}
		if ($itm_alt_nm1.equalsIgnoreCase(name)) {
			itm_alt_nm1(value);
			return;
		}
		if ($match_d_key.equalsIgnoreCase(name)) {
			match_d_key(value);
			return;
		}
		if ($work_proc_no.equalsIgnoreCase(name)) {
			work_proc_no(value);
			return;
		}
		if ($fill_color.equalsIgnoreCase(name)) {
			fill_color(value);
			return;
		}
		if ($nm_plate.equalsIgnoreCase(name)) {
			nm_plate(value);
			return;
		}
		if ($rmrks1.equalsIgnoreCase(name)) {
			rmrks1(value);
			return;
		}
		if ($rmrks2.equalsIgnoreCase(name)) {
			rmrks2(value);
			return;
		}
		if ($rmrks3.equalsIgnoreCase(name)) {
			rmrks3(value);
			return;
		}
		if ($rmrks4.equalsIgnoreCase(name)) {
			rmrks4(value);
			return;
		}
		if ($rmrks5.equalsIgnoreCase(name)) {
			rmrks5(value);
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
		if ($sub.equalsIgnoreCase(name)) {
			sub(value);
			return;
		}
		if ($typ.equalsIgnoreCase(name)) {
			typ(value);
			return;
		}
		if ($itm_qty.equalsIgnoreCase(name)) {
			itm_qty(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, int value) {
		if ($sub.equalsIgnoreCase(name)) {
			sub(value);
			return;
		}
		if ($typ.equalsIgnoreCase(name)) {
			typ(value);
			return;
		}
		if ($itm_qty.equalsIgnoreCase(name)) {
			itm_qty(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, long value) {
		if ($sub.equalsIgnoreCase(name)) {
			sub(value);
			return;
		}
		if ($typ.equalsIgnoreCase(name)) {
			typ(value);
			return;
		}
		if ($itm_qty.equalsIgnoreCase(name)) {
			itm_qty(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, float value) {
		if ($sub.equalsIgnoreCase(name)) {
			sub(value);
			return;
		}
		if ($typ.equalsIgnoreCase(name)) {
			typ(value);
			return;
		}
		if ($itm_qty.equalsIgnoreCase(name)) {
			itm_qty(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, double value) {
		if ($sub.equalsIgnoreCase(name)) {
			sub(value);
			return;
		}
		if ($typ.equalsIgnoreCase(name)) {
			typ(value);
			return;
		}
		if ($itm_qty.equalsIgnoreCase(name)) {
			itm_qty(value);
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
		if ($match_key.equalsIgnoreCase(name)) {
			match_key(value);
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
		if ($itm_nm.equalsIgnoreCase(name)) {
			itm_nm(value);
			return;
		}
		if ($itm_alt_nm1.equalsIgnoreCase(name)) {
			itm_alt_nm1(value);
			return;
		}
		if ($match_d_key.equalsIgnoreCase(name)) {
			match_d_key(value);
			return;
		}
		if ($work_proc_no.equalsIgnoreCase(name)) {
			work_proc_no(value);
			return;
		}
		if ($fill_color.equalsIgnoreCase(name)) {
			fill_color(value);
			return;
		}
		if ($nm_plate.equalsIgnoreCase(name)) {
			nm_plate(value);
			return;
		}
		if ($rmrks1.equalsIgnoreCase(name)) {
			rmrks1(value);
			return;
		}
		if ($rmrks2.equalsIgnoreCase(name)) {
			rmrks2(value);
			return;
		}
		if ($rmrks3.equalsIgnoreCase(name)) {
			rmrks3(value);
			return;
		}
		if ($rmrks4.equalsIgnoreCase(name)) {
			rmrks4(value);
			return;
		}
		if ($rmrks5.equalsIgnoreCase(name)) {
			rmrks5(value);
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
		if ($sub.equalsIgnoreCase(name)) {
			sub(value);
			return;
		}
		if ($typ.equalsIgnoreCase(name)) {
			typ(value);
			return;
		}
		if ($itm_qty.equalsIgnoreCase(name)) {
			itm_qty(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, int value) {
		if ($sub.equalsIgnoreCase(name)) {
			sub(value);
			return;
		}
		if ($typ.equalsIgnoreCase(name)) {
			typ(value);
			return;
		}
		if ($itm_qty.equalsIgnoreCase(name)) {
			itm_qty(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, long value) {
		if ($sub.equalsIgnoreCase(name)) {
			sub(value);
			return;
		}
		if ($typ.equalsIgnoreCase(name)) {
			typ(value);
			return;
		}
		if ($itm_qty.equalsIgnoreCase(name)) {
			itm_qty(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, float value) {
		if ($sub.equalsIgnoreCase(name)) {
			sub(value);
			return;
		}
		if ($typ.equalsIgnoreCase(name)) {
			typ(value);
			return;
		}
		if ($itm_qty.equalsIgnoreCase(name)) {
			itm_qty(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, double value) {
		if ($sub.equalsIgnoreCase(name)) {
			sub(value);
			return;
		}
		if ($typ.equalsIgnoreCase(name)) {
			typ(value);
			return;
		}
		if ($itm_qty.equalsIgnoreCase(name)) {
			itm_qty(value);
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
