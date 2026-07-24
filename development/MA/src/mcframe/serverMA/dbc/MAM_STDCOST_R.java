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
 * "標準単価マスタ // Standard unit cost master"DBコンテナRowクラスです。<p>
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
 *  	<td>itm_cd</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>品目ＣＤ</td>
 *  	<td>Item cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>itm_sub1</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>枝番１</td>
 *  	<td>Branch No. 1</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>K</td>
 *  	<td>itm_sub2</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>枝番２</td>
 *  	<td>Branch No. 2</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>itm_sub3</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>枝番３</td>
 *  	<td>Branch No. 3</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>K</td>
 *  	<td>term</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>期</td>
 *  	<td>Term</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>wg_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>ワーキンググループＣＤ</td>
 *  	<td>WG cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>std_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>基準数量</td>
 *  	<td>Base qty.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>std_upri</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>標準単価</td>
 *  	<td>Standard unit cost</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sub_upri1</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備単価１</td>
 *  	<td>Spare unit price 1</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sub_upri2</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備単価２</td>
 *  	<td>Spare unit price 2</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sub_upri3</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備単価３</td>
 *  	<td>Spare unit price 3</td>
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
 *  	<td>itm_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td>ITM1.ITM_NM</td>
 *  	<td>品名</td>
 *  	<td>Item name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>wg_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td>WG1.WG_NM</td>
 *  	<td>ＷＧ名</td>
 *  	<td>WG name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>term_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td>TERM1.TERM_NM</td>
 *  	<td>期名称</td>
 *  	<td>Term name</td>
 *  </tr>
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
public class MAM_STDCOST_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.CO_VIEW;

	public static final String TABLE_NAME = "MAM_STDCOST";

	public static final boolean EX_CTRL = true;
	
	public static final boolean LCL_TABLE = false;
	
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
	 * 期. Term.<p>
	 *
	 */
	public static final String $term = "term";
	private static final MCPermColumnInfo _term = createColumnInfo("term");
	public final MCDatePermColumn term = createDateColumn(_term);
	
	/**
	 * ワーキンググループＣＤ. WG cd..<p>
	 *
	 */
	public static final String $wg_cd = "wg_cd";
	private static final MCPermColumnInfo _wg_cd = createColumnInfo("wg_cd");
	public final MCStringPermColumn wg_cd = createStringColumn(_wg_cd);
	
	/**
	 * 基準数量. Base qty..<p>
	 *
	 */
	public static final String $std_qty = "std_qty";
	private static final MCPermColumnInfo _std_qty = createColumnInfo("std_qty");
	public final MCNumberPermColumn std_qty = createNumberColumn(_std_qty);
	
	/**
	 * 標準単価. Standard unit cost.<p>
	 *
	 */
	public static final String $std_upri = "std_upri";
	private static final MCPermColumnInfo _std_upri = createColumnInfo("std_upri");
	public final MCNumberPermColumn std_upri = createNumberColumn(_std_upri);
	
	/**
	 * 予備単価１. Spare unit price 1.<p>
	 *
	 */
	public static final String $sub_upri1 = "sub_upri1";
	private static final MCPermColumnInfo _sub_upri1 = createColumnInfo("sub_upri1");
	public final MCNumberPermColumn sub_upri1 = createNumberColumn(_sub_upri1);
	
	/**
	 * 予備単価２. Spare unit price 2.<p>
	 *
	 */
	public static final String $sub_upri2 = "sub_upri2";
	private static final MCPermColumnInfo _sub_upri2 = createColumnInfo("sub_upri2");
	public final MCNumberPermColumn sub_upri2 = createNumberColumn(_sub_upri2);
	
	/**
	 * 予備単価３. Spare unit price 3.<p>
	 *
	 */
	public static final String $sub_upri3 = "sub_upri3";
	private static final MCPermColumnInfo _sub_upri3 = createColumnInfo("sub_upri3");
	public final MCNumberPermColumn sub_upri3 = createNumberColumn(_sub_upri3);
	
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
	 * 品名. Item name.<p>
	 *
	 */
	public static final String $itm_nm = "itm_nm";
	
	/**
	 * ＷＧ名. WG name.<p>
	 *
	 */
	public static final String $wg_nm = "wg_nm";
	
	/**
	 * 期名称. Term name.<p>
	 *
	 */
	public static final String $term_nm = "term_nm";
	
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta term_META = createCommonMeta($term, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta std_qty_META = createCommonMeta($std_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta std_upri_META = createCommonMeta($std_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta sub_upri1_META = createCommonMeta($sub_upri1, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta sub_upri2_META = createCommonMeta($sub_upri2, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta sub_upri3_META = createCommonMeta($sub_upri3, mcframe.commonMA.meta.MA_META.MONEY);
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
	public static final MCMeta itm_nm_META = createCommonMeta($itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta wg_nm_META = createCommonMeta($wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta term_nm_META = createCommonMeta($term_nm, mcframe.commonMA.meta.MA_META.TERM_NM);

	protected static final List<MCForeignInfo> FOREIGN_INFO_LIST = new ArrayList<>();
	public static final String $WG1 = "WG1";
	public static final String $TERM1 = "TERM1";
	public static final String $ITM1 = "ITM1";
	static {
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
					MAM_STDCOST_R own = MAM_STDCOST_R.create(alias);
					mcframe.serverMA.dbc.MAM_WG_R ref = mcframe.serverMA.dbc.MAM_WG_R.create("WG1");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.wg_cd.eq(ref.wg_cd));
					return cond;
				}
			)
		);
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_TERM",
				$TERM1,
				new String[][]{
						{"term", "term"}
				},
				() -> {
					return mcframe.serverMA.dbc.MAM_TERM_R.create("TERM1");
				},
				(alias) -> {
					MAM_STDCOST_R own = MAM_STDCOST_R.create(alias);
					mcframe.serverMA.dbc.MAM_TERM_R ref = mcframe.serverMA.dbc.MAM_TERM_R.create("TERM1");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.term.eq(ref.term));
					return cond;
				}
			)
		);
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_ITM_",
				$ITM1,
				new String[][]{
						{"itm_cd", "itm_cd"},
						{"itm_sub1", "itm_sub1"},
						{"itm_sub2", "itm_sub2"},
						{"itm_sub3", "itm_sub3"}
				},
				() -> {
					return mcframe.serverMA.dbc.MAM_ITM__R.create("ITM1");
				},
				(alias) -> {
					MAM_STDCOST_R own = MAM_STDCOST_R.create(alias);
					mcframe.serverMA.dbc.MAM_ITM__R ref = mcframe.serverMA.dbc.MAM_ITM__R.create("ITM1");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.itm_cd.eq(ref.itm_cd));
					cond = cond.and(own.itm_sub1.eq(ref.itm_sub1));
					cond = cond.and(own.itm_sub2.eq(ref.itm_sub2));
					cond = cond.and(own.itm_sub3.eq(ref.itm_sub3));
					return cond;
				}
			)
		);
	}
	
	protected static final ConstMetaList<MAM_STDCOST_R> constMetas = new ConstMetaList<MAM_STDCOST_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			term_META,
			wg_cd_META,
			std_qty_META,
			std_upri_META,
			sub_upri1_META,
			sub_upri2_META,
			sub_upri3_META,
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
			itm_nm_META,
			wg_nm_META,
			term_nm_META
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
	protected MAM_STDCOST_R(ConstMetaList<? extends MAM_STDCOST_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MAM_STDCOST_R(ConstMetaList<? extends MAM_STDCOST_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MAM_STDCOST_R.$itm_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_STDCOST_R.$itm_cd,
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
			MAM_STDCOST_R.$itm_sub1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_STDCOST_R.$itm_sub1,
				"itm_sub1",
				itm_sub1,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_STDCOST_R.$itm_sub2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_STDCOST_R.$itm_sub2,
				"itm_sub2",
				itm_sub2,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_STDCOST_R.$itm_sub3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_STDCOST_R.$itm_sub3,
				"itm_sub3",
				itm_sub3,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_STDCOST_R.$term,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MAM_STDCOST_R.$term,
				"term",
				term,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_STDCOST_R.$wg_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_STDCOST_R.$wg_cd,
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
			MAM_STDCOST_R.$std_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_STDCOST_R.$std_qty,
				"std_qty",
				std_qty,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_STDCOST_R.$std_upri,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_STDCOST_R.$std_upri,
				"std_upri",
				std_upri,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_STDCOST_R.$sub_upri1,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_STDCOST_R.$sub_upri1,
				"sub_upri1",
				sub_upri1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_STDCOST_R.$sub_upri2,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_STDCOST_R.$sub_upri2,
				"sub_upri2",
				sub_upri2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_STDCOST_R.$sub_upri3,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_STDCOST_R.$sub_upri3,
				"sub_upri3",
				sub_upri3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_STDCOST_R.$memo1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_STDCOST_R.$memo1,
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
			MAM_STDCOST_R.$memo2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_STDCOST_R.$memo2,
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
			MAM_STDCOST_R.$memo3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_STDCOST_R.$memo3,
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
			MAM_STDCOST_R.$del_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_STDCOST_R.$del_flg,
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
			MAM_STDCOST_R.$del_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_STDCOST_R.$del_usr_id,
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
			MAM_STDCOST_R.$del_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_STDCOST_R.$del_usr_nm,
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
			MAM_STDCOST_R.$del_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MAM_STDCOST_R.$del_ts,
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
			MAM_STDCOST_R.$ins_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_STDCOST_R.$ins_usr_id,
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
			MAM_STDCOST_R.$ins_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_STDCOST_R.$ins_usr_nm,
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
			MAM_STDCOST_R.$ins_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MAM_STDCOST_R.$ins_ts,
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
			MAM_STDCOST_R.$ins_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_STDCOST_R.$ins_func_id,
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
			MAM_STDCOST_R.$upd_cntr,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_STDCOST_R.$upd_cntr,
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
			MAM_STDCOST_R.$upd_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_STDCOST_R.$upd_usr_id,
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
			MAM_STDCOST_R.$upd_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_STDCOST_R.$upd_usr_nm,
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
			MAM_STDCOST_R.$upd_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MAM_STDCOST_R.$upd_ts,
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
			MAM_STDCOST_R.$upd_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_STDCOST_R.$upd_func_id,
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
			MAM_STDCOST_R.$upd_srv_req_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_STDCOST_R.$upd_srv_req_no,
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
			MAM_STDCOST_R.$itm_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_STDCOST_R.$itm_nm,
				"itm_nm",
				null,
				false,
				true,
				false,
				false,
				true,
				"ITM1.ITM_NM"
			)
		);
		COLUMN_MAP.put(
			MAM_STDCOST_R.$wg_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_STDCOST_R.$wg_nm,
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
		COLUMN_MAP.put(
			MAM_STDCOST_R.$term_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_STDCOST_R.$term_nm,
				"term_nm",
				null,
				false,
				true,
				false,
				false,
				true,
				"TERM1.TERM_NM"
			)
		);
		return COLUMN_MAP;
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MAM_STDCOST_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MAM_STDCOST_R create(String alias) {
		MAM_STDCOST_R row = new MAM_STDCOST_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MAM_STDCOST_R createByName(T proto) {
		MAM_STDCOST_R row = MAM_STDCOST_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAM_STDCOST_R clone() {
		return (MAM_STDCOST_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAM_STDCOST_R createInstance() {
		return (MAM_STDCOST_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAM_STDCOST_R getValues(String... names) {
		return (MAM_STDCOST_R) super.getValues(names);
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
	 public MAW_STDCOST_KEY_R getPkWorkDbc(String alias) {
	 	return MAW_STDCOST_KEY_R.create(alias);
	 }

	/*
	 * MCDBContainerのオーバーライドメソッドです。
	 */
	 public MAW_STDCOST_KEY_R getPkWorkDbc() {
	 	return getPkWorkDbc(MAW_STDCOST_KEY_R.TABLE_NAME);
	 }

	/**
	 * 品目ＣＤ. Item cd..<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 0, $itm_cd);
	}

	/**
	 * 品目ＣＤ. Item cd..<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 0, $itm_cd, value);
	}

	/**
	 * 枝番１. Branch No. 1.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 1, $itm_sub1);
	}

	/**
	 * 枝番１. Branch No. 1.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 1, $itm_sub1, value);
	}

	/**
	 * 枝番２. Branch No. 2.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 2, $itm_sub2);
	}

	/**
	 * 枝番２. Branch No. 2.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 2, $itm_sub2, value);
	}

	/**
	 * 枝番３. Branch No. 3.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 3, $itm_sub3);
	}

	/**
	 * 枝番３. Branch No. 3.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 3, $itm_sub3, value);
	}

	/**
	 * 期. Term.<p>
	 *
	 */
	public MCDate term() {
		return getConstDate(offset + 4, $term);
	}

	/**
	 * 期. Term.<p>
	 *
	 */
	public void term(MCDate value) {
		setConstDate(offset + 4, $term, value);
	}

	/**
	 * ワーキンググループＣＤ. WG cd..<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 5, $wg_cd);
	}

	/**
	 * ワーキンググループＣＤ. WG cd..<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 5, $wg_cd, value);
	}

	/**
	 * 基準数量. Base qty..<p>
	 *
	 */
	public MCNumber std_qty() {
		return getConstNumber(offset + 6, $std_qty);
	}

	/**
	 * 基準数量. Base qty..<p>
	 *
	 */
	public void std_qty(MCNumber value) {
		setConstNumber(offset + 6, $std_qty, value);
	}
	
	/**
	 * 基準数量. Base qty..<p>
	 *
	 */
	public void std_qty(int value) {
		setConstNumber(offset + 6, $std_qty, value);
	}
	
	/**
	 * 基準数量. Base qty..<p>
	 *
	 */
	public void std_qty(long value) {
		setConstNumber(offset + 6, $std_qty, value);
	}
	
	/**
	 * 基準数量. Base qty..<p>
	 *
	 */
	public void std_qty(float value) {
		setConstNumber(offset + 6, $std_qty, value);
	}
	
	/**
	 * 基準数量. Base qty..<p>
	 *
	 */
	public void std_qty(double value) {
		setConstNumber(offset + 6, $std_qty, value);
	}
	
	/**
	 * 標準単価. Standard unit cost.<p>
	 *
	 */
	public MCNumber std_upri() {
		return getConstNumber(offset + 7, $std_upri);
	}

	/**
	 * 標準単価. Standard unit cost.<p>
	 *
	 */
	public void std_upri(MCNumber value) {
		setConstNumber(offset + 7, $std_upri, value);
	}
	
	/**
	 * 標準単価. Standard unit cost.<p>
	 *
	 */
	public void std_upri(int value) {
		setConstNumber(offset + 7, $std_upri, value);
	}
	
	/**
	 * 標準単価. Standard unit cost.<p>
	 *
	 */
	public void std_upri(long value) {
		setConstNumber(offset + 7, $std_upri, value);
	}
	
	/**
	 * 標準単価. Standard unit cost.<p>
	 *
	 */
	public void std_upri(float value) {
		setConstNumber(offset + 7, $std_upri, value);
	}
	
	/**
	 * 標準単価. Standard unit cost.<p>
	 *
	 */
	public void std_upri(double value) {
		setConstNumber(offset + 7, $std_upri, value);
	}
	
	/**
	 * 予備単価１. Spare unit price 1.<p>
	 *
	 */
	public MCNumber sub_upri1() {
		return getConstNumber(offset + 8, $sub_upri1);
	}

	/**
	 * 予備単価１. Spare unit price 1.<p>
	 *
	 */
	public void sub_upri1(MCNumber value) {
		setConstNumber(offset + 8, $sub_upri1, value);
	}
	
	/**
	 * 予備単価１. Spare unit price 1.<p>
	 *
	 */
	public void sub_upri1(int value) {
		setConstNumber(offset + 8, $sub_upri1, value);
	}
	
	/**
	 * 予備単価１. Spare unit price 1.<p>
	 *
	 */
	public void sub_upri1(long value) {
		setConstNumber(offset + 8, $sub_upri1, value);
	}
	
	/**
	 * 予備単価１. Spare unit price 1.<p>
	 *
	 */
	public void sub_upri1(float value) {
		setConstNumber(offset + 8, $sub_upri1, value);
	}
	
	/**
	 * 予備単価１. Spare unit price 1.<p>
	 *
	 */
	public void sub_upri1(double value) {
		setConstNumber(offset + 8, $sub_upri1, value);
	}
	
	/**
	 * 予備単価２. Spare unit price 2.<p>
	 *
	 */
	public MCNumber sub_upri2() {
		return getConstNumber(offset + 9, $sub_upri2);
	}

	/**
	 * 予備単価２. Spare unit price 2.<p>
	 *
	 */
	public void sub_upri2(MCNumber value) {
		setConstNumber(offset + 9, $sub_upri2, value);
	}
	
	/**
	 * 予備単価２. Spare unit price 2.<p>
	 *
	 */
	public void sub_upri2(int value) {
		setConstNumber(offset + 9, $sub_upri2, value);
	}
	
	/**
	 * 予備単価２. Spare unit price 2.<p>
	 *
	 */
	public void sub_upri2(long value) {
		setConstNumber(offset + 9, $sub_upri2, value);
	}
	
	/**
	 * 予備単価２. Spare unit price 2.<p>
	 *
	 */
	public void sub_upri2(float value) {
		setConstNumber(offset + 9, $sub_upri2, value);
	}
	
	/**
	 * 予備単価２. Spare unit price 2.<p>
	 *
	 */
	public void sub_upri2(double value) {
		setConstNumber(offset + 9, $sub_upri2, value);
	}
	
	/**
	 * 予備単価３. Spare unit price 3.<p>
	 *
	 */
	public MCNumber sub_upri3() {
		return getConstNumber(offset + 10, $sub_upri3);
	}

	/**
	 * 予備単価３. Spare unit price 3.<p>
	 *
	 */
	public void sub_upri3(MCNumber value) {
		setConstNumber(offset + 10, $sub_upri3, value);
	}
	
	/**
	 * 予備単価３. Spare unit price 3.<p>
	 *
	 */
	public void sub_upri3(int value) {
		setConstNumber(offset + 10, $sub_upri3, value);
	}
	
	/**
	 * 予備単価３. Spare unit price 3.<p>
	 *
	 */
	public void sub_upri3(long value) {
		setConstNumber(offset + 10, $sub_upri3, value);
	}
	
	/**
	 * 予備単価３. Spare unit price 3.<p>
	 *
	 */
	public void sub_upri3(float value) {
		setConstNumber(offset + 10, $sub_upri3, value);
	}
	
	/**
	 * 予備単価３. Spare unit price 3.<p>
	 *
	 */
	public void sub_upri3(double value) {
		setConstNumber(offset + 10, $sub_upri3, value);
	}
	
	/**
	 * メモ１. Memo 1.<p>
	 *
	 */
	public String memo1() {
		return getConstString(offset + 11, $memo1);
	}

	/**
	 * メモ１. Memo 1.<p>
	 *
	 */
	public void memo1(String value) {
		setConstString(offset + 11, $memo1, value);
	}

	/**
	 * メモ２. Memo 2.<p>
	 *
	 */
	public String memo2() {
		return getConstString(offset + 12, $memo2);
	}

	/**
	 * メモ２. Memo 2.<p>
	 *
	 */
	public void memo2(String value) {
		setConstString(offset + 12, $memo2, value);
	}

	/**
	 * メモ３. Memo 3.<p>
	 *
	 */
	public String memo3() {
		return getConstString(offset + 13, $memo3);
	}

	/**
	 * メモ３. Memo 3.<p>
	 *
	 */
	public void memo3(String value) {
		setConstString(offset + 13, $memo3, value);
	}

	/**
	 * 論理削除ＦＬＧ. Logical delete flg..<p>
	 *
	 */
	public boolean del_flg() {
		return getConstBoolean(offset + 14, $del_flg);
	}

	/**
	 * 論理削除ＦＬＧ. Logical delete flg..<p>
	 *
	 */
	public void del_flg(boolean value) {
		setConstBoolean(offset + 14, $del_flg, value);
	}

	/**
	 * 論理削除ユーザＩＤ. Logical delete user ID.<p>
	 *
	 */
	public String del_usr_id() {
		return getConstString(offset + 15, $del_usr_id);
	}

	/**
	 * 論理削除ユーザＩＤ. Logical delete user ID.<p>
	 *
	 */
	public void del_usr_id(String value) {
		setConstString(offset + 15, $del_usr_id, value);
	}

	/**
	 * 論理削除ユーザ名. Logical delete user name.<p>
	 *
	 */
	public String del_usr_nm() {
		return getConstString(offset + 16, $del_usr_nm);
	}

	/**
	 * 論理削除ユーザ名. Logical delete user name.<p>
	 *
	 */
	public void del_usr_nm(String value) {
		setConstString(offset + 16, $del_usr_nm, value);
	}

	/**
	 * 論理削除日時. Logical delete date and time.<p>
	 *
	 */
	public MCTimestamp del_ts() {
		return getConstTimestamp(offset + 17, $del_ts);
	}

	/**
	 * 論理削除日時. Logical delete date and time.<p>
	 *
	 */
	public void del_ts(MCTimestamp value) {
		setConstTimestamp(offset + 17, $del_ts, value);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 18, $ins_usr_id);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 18, $ins_usr_id, value);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 19, $ins_usr_nm);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 19, $ins_usr_nm, value);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 20, $ins_ts);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 20, $ins_ts, value);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 21, $ins_func_id);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 21, $ins_func_id, value);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 22, $upd_cntr);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 22, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 22, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 22, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 22, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 22, $upd_cntr, value);
	}
	
	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 23, $upd_usr_id);
	}

	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 23, $upd_usr_id, value);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 24, $upd_usr_nm);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 24, $upd_usr_nm, value);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 25, $upd_ts);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 25, $upd_ts, value);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 26, $upd_func_id);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 26, $upd_func_id, value);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 27, $upd_srv_req_no);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 27, $upd_srv_req_no, value);
	}

	/**
	 * 品名. Item name.<p>
	 *
	 */
	public String itm_nm() {
		return getConstString(offset + 28, $itm_nm);
	}

	/**
	 * 品名. Item name.<p>
	 *
	 */
	public void itm_nm(String value) {
		setConstString(offset + 28, $itm_nm, value);
	}

	/**
	 * ＷＧ名. WG name.<p>
	 *
	 */
	public String wg_nm() {
		return getConstString(offset + 29, $wg_nm);
	}

	/**
	 * ＷＧ名. WG name.<p>
	 *
	 */
	public void wg_nm(String value) {
		setConstString(offset + 29, $wg_nm, value);
	}

	/**
	 * 期名称. Term name.<p>
	 *
	 */
	public String term_nm() {
		return getConstString(offset + 30, $term_nm);
	}

	/**
	 * 期名称. Term name.<p>
	 *
	 */
	public void term_nm(String value) {
		setConstString(offset + 30, $term_nm, value);
	}

	public String getString(String name) {
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
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
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
		if ($itm_nm.equalsIgnoreCase(name)) {
			return itm_nm();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($term_nm.equalsIgnoreCase(name)) {
			return term_nm();
		}
		return super.getString(name);
	}

	public MCNumber getNumber(String name) {
		if ($std_qty.equalsIgnoreCase(name)) {
			return std_qty();
		}
		if ($std_upri.equalsIgnoreCase(name)) {
			return std_upri();
		}
		if ($sub_upri1.equalsIgnoreCase(name)) {
			return sub_upri1();
		}
		if ($sub_upri2.equalsIgnoreCase(name)) {
			return sub_upri2();
		}
		if ($sub_upri3.equalsIgnoreCase(name)) {
			return sub_upri3();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumber(name);
	}

	public MCDate getDate(String name) {
		if ($term.equalsIgnoreCase(name)) {
			return term();
		}
		return super.getDate(name);
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
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
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
		if ($itm_nm.equalsIgnoreCase(name)) {
			return itm_nm();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($term_nm.equalsIgnoreCase(name)) {
			return term_nm();
		}
		return super.getStringNE(name);
	}

	public MCNumber getNumberNE(String name) {
		if ($std_qty.equalsIgnoreCase(name)) {
			return std_qty();
		}
		if ($std_upri.equalsIgnoreCase(name)) {
			return std_upri();
		}
		if ($sub_upri1.equalsIgnoreCase(name)) {
			return sub_upri1();
		}
		if ($sub_upri2.equalsIgnoreCase(name)) {
			return sub_upri2();
		}
		if ($sub_upri3.equalsIgnoreCase(name)) {
			return sub_upri3();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumberNE(name);
	}

	public MCDate getDateNE(String name) {
		if ($term.equalsIgnoreCase(name)) {
			return term();
		}
		return super.getDateNE(name);
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
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
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
		if ($itm_nm.equalsIgnoreCase(name)) {
			itm_nm(value);
			return;
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			wg_nm(value);
			return;
		}
		if ($term_nm.equalsIgnoreCase(name)) {
			term_nm(value);
			return;
		}
		super.setString(name, value);
	}

	public void setNumber(String name, MCNumber value) {
		if ($std_qty.equalsIgnoreCase(name)) {
			std_qty(value);
			return;
		}
		if ($std_upri.equalsIgnoreCase(name)) {
			std_upri(value);
			return;
		}
		if ($sub_upri1.equalsIgnoreCase(name)) {
			sub_upri1(value);
			return;
		}
		if ($sub_upri2.equalsIgnoreCase(name)) {
			sub_upri2(value);
			return;
		}
		if ($sub_upri3.equalsIgnoreCase(name)) {
			sub_upri3(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, int value) {
		if ($std_qty.equalsIgnoreCase(name)) {
			std_qty(value);
			return;
		}
		if ($std_upri.equalsIgnoreCase(name)) {
			std_upri(value);
			return;
		}
		if ($sub_upri1.equalsIgnoreCase(name)) {
			sub_upri1(value);
			return;
		}
		if ($sub_upri2.equalsIgnoreCase(name)) {
			sub_upri2(value);
			return;
		}
		if ($sub_upri3.equalsIgnoreCase(name)) {
			sub_upri3(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, long value) {
		if ($std_qty.equalsIgnoreCase(name)) {
			std_qty(value);
			return;
		}
		if ($std_upri.equalsIgnoreCase(name)) {
			std_upri(value);
			return;
		}
		if ($sub_upri1.equalsIgnoreCase(name)) {
			sub_upri1(value);
			return;
		}
		if ($sub_upri2.equalsIgnoreCase(name)) {
			sub_upri2(value);
			return;
		}
		if ($sub_upri3.equalsIgnoreCase(name)) {
			sub_upri3(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, float value) {
		if ($std_qty.equalsIgnoreCase(name)) {
			std_qty(value);
			return;
		}
		if ($std_upri.equalsIgnoreCase(name)) {
			std_upri(value);
			return;
		}
		if ($sub_upri1.equalsIgnoreCase(name)) {
			sub_upri1(value);
			return;
		}
		if ($sub_upri2.equalsIgnoreCase(name)) {
			sub_upri2(value);
			return;
		}
		if ($sub_upri3.equalsIgnoreCase(name)) {
			sub_upri3(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, double value) {
		if ($std_qty.equalsIgnoreCase(name)) {
			std_qty(value);
			return;
		}
		if ($std_upri.equalsIgnoreCase(name)) {
			std_upri(value);
			return;
		}
		if ($sub_upri1.equalsIgnoreCase(name)) {
			sub_upri1(value);
			return;
		}
		if ($sub_upri2.equalsIgnoreCase(name)) {
			sub_upri2(value);
			return;
		}
		if ($sub_upri3.equalsIgnoreCase(name)) {
			sub_upri3(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setDate(String name, MCDate value) {
		if ($term.equalsIgnoreCase(name)) {
			term(value);
			return;
		}
		super.setDate(name, value);
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
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
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
		if ($itm_nm.equalsIgnoreCase(name)) {
			itm_nm(value);
			return;
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			wg_nm(value);
			return;
		}
		if ($term_nm.equalsIgnoreCase(name)) {
			term_nm(value);
			return;
		}
		super.setStringNE(name, value);
	}

	public void setNumberNE(String name, MCNumber value) {
		if ($std_qty.equalsIgnoreCase(name)) {
			std_qty(value);
			return;
		}
		if ($std_upri.equalsIgnoreCase(name)) {
			std_upri(value);
			return;
		}
		if ($sub_upri1.equalsIgnoreCase(name)) {
			sub_upri1(value);
			return;
		}
		if ($sub_upri2.equalsIgnoreCase(name)) {
			sub_upri2(value);
			return;
		}
		if ($sub_upri3.equalsIgnoreCase(name)) {
			sub_upri3(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, int value) {
		if ($std_qty.equalsIgnoreCase(name)) {
			std_qty(value);
			return;
		}
		if ($std_upri.equalsIgnoreCase(name)) {
			std_upri(value);
			return;
		}
		if ($sub_upri1.equalsIgnoreCase(name)) {
			sub_upri1(value);
			return;
		}
		if ($sub_upri2.equalsIgnoreCase(name)) {
			sub_upri2(value);
			return;
		}
		if ($sub_upri3.equalsIgnoreCase(name)) {
			sub_upri3(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, long value) {
		if ($std_qty.equalsIgnoreCase(name)) {
			std_qty(value);
			return;
		}
		if ($std_upri.equalsIgnoreCase(name)) {
			std_upri(value);
			return;
		}
		if ($sub_upri1.equalsIgnoreCase(name)) {
			sub_upri1(value);
			return;
		}
		if ($sub_upri2.equalsIgnoreCase(name)) {
			sub_upri2(value);
			return;
		}
		if ($sub_upri3.equalsIgnoreCase(name)) {
			sub_upri3(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, float value) {
		if ($std_qty.equalsIgnoreCase(name)) {
			std_qty(value);
			return;
		}
		if ($std_upri.equalsIgnoreCase(name)) {
			std_upri(value);
			return;
		}
		if ($sub_upri1.equalsIgnoreCase(name)) {
			sub_upri1(value);
			return;
		}
		if ($sub_upri2.equalsIgnoreCase(name)) {
			sub_upri2(value);
			return;
		}
		if ($sub_upri3.equalsIgnoreCase(name)) {
			sub_upri3(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, double value) {
		if ($std_qty.equalsIgnoreCase(name)) {
			std_qty(value);
			return;
		}
		if ($std_upri.equalsIgnoreCase(name)) {
			std_upri(value);
			return;
		}
		if ($sub_upri1.equalsIgnoreCase(name)) {
			sub_upri1(value);
			return;
		}
		if ($sub_upri2.equalsIgnoreCase(name)) {
			sub_upri2(value);
			return;
		}
		if ($sub_upri3.equalsIgnoreCase(name)) {
			sub_upri3(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setDateNE(String name, MCDate value) {
		if ($term.equalsIgnoreCase(name)) {
			term(value);
			return;
		}
		super.setDateNE(name, value);
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
