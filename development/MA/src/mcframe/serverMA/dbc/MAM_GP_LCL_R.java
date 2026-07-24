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
 * "汎用マスタ(ロケール別情報) // General purpose master (Info. by locale)"DBコンテナRowクラスです。<p>
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
 *  	<td>gp_grp_cd</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>汎用分類ＣＤ</td>
 *  	<td>General purpose classification cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>key1</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>キー１</td>
 *  	<td>Key 1</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>K</td>
 *  	<td>key2</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>キー２</td>
 *  	<td>Key 2</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>key3</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>キー３</td>
 *  	<td>Key 3</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>K</td>
 *  	<td>key4</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>キー４</td>
 *  	<td>Key 4</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>key5</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>キー５</td>
 *  	<td>Key 5</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>K</td>
 *  	<td>key6</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>キー６</td>
 *  	<td>Key 6</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>key7</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>キー７</td>
 *  	<td>Key 7</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>K</td>
 *  	<td>key8</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>キー８</td>
 *  	<td>Key 8</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>key9</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>キー９</td>
 *  	<td>Key 9</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>K</td>
 *  	<td>key10</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>キー１０</td>
 *  	<td>Key 10</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>char1</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>文字列１</td>
 *  	<td>String 1</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>char2</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>文字列２</td>
 *  	<td>String 2</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>char3</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>文字列３</td>
 *  	<td>String 3</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>char4</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>文字列４</td>
 *  	<td>String 4</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>char5</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>文字列５</td>
 *  	<td>String 5</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>char6</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>文字列６</td>
 *  	<td>String 6</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>char7</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>文字列７</td>
 *  	<td>String 7</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>char8</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>文字列８</td>
 *  	<td>String 8</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>char9</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>文字列９</td>
 *  	<td>String 9</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>char10</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>文字列１０</td>
 *  	<td>String 10</td>
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
 *  	<td>K</td>
 *  	<td>lcl_cd</td>
 *  	<td>C</td>
 *  	<td>7</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>ロケールＣＤ</td>
 *  	<td>Locale cd.</td>
 *  </tr>
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
public class MAM_GP_LCL_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.CO_VIEW;

	public static final String TABLE_NAME = "MAM_GP_LCL";

	public static final boolean EX_CTRL = true;
	
	public static final boolean LCL_TABLE = false;
	
	/**
	 * 汎用分類ＣＤ. General purpose classification cd..<p>
	 *
	 */
	public static final String $gp_grp_cd = "gp_grp_cd";
	private static final MCPermColumnInfo _gp_grp_cd = createColumnInfo("gp_grp_cd");
	public final MCStringPermColumn gp_grp_cd = createStringColumn(_gp_grp_cd);
	
	/**
	 * キー１. Key 1.<p>
	 *
	 */
	public static final String $key1 = "key1";
	private static final MCPermColumnInfo _key1 = createColumnInfo("key1");
	public final MCStringPermColumn key1 = createStringColumn(_key1);
	
	/**
	 * キー２. Key 2.<p>
	 *
	 */
	public static final String $key2 = "key2";
	private static final MCPermColumnInfo _key2 = createColumnInfo("key2");
	public final MCStringPermColumn key2 = createStringColumn(_key2);
	
	/**
	 * キー３. Key 3.<p>
	 *
	 */
	public static final String $key3 = "key3";
	private static final MCPermColumnInfo _key3 = createColumnInfo("key3");
	public final MCStringPermColumn key3 = createStringColumn(_key3);
	
	/**
	 * キー４. Key 4.<p>
	 *
	 */
	public static final String $key4 = "key4";
	private static final MCPermColumnInfo _key4 = createColumnInfo("key4");
	public final MCStringPermColumn key4 = createStringColumn(_key4);
	
	/**
	 * キー５. Key 5.<p>
	 *
	 */
	public static final String $key5 = "key5";
	private static final MCPermColumnInfo _key5 = createColumnInfo("key5");
	public final MCStringPermColumn key5 = createStringColumn(_key5);
	
	/**
	 * キー６. Key 6.<p>
	 *
	 */
	public static final String $key6 = "key6";
	private static final MCPermColumnInfo _key6 = createColumnInfo("key6");
	public final MCStringPermColumn key6 = createStringColumn(_key6);
	
	/**
	 * キー７. Key 7.<p>
	 *
	 */
	public static final String $key7 = "key7";
	private static final MCPermColumnInfo _key7 = createColumnInfo("key7");
	public final MCStringPermColumn key7 = createStringColumn(_key7);
	
	/**
	 * キー８. Key 8.<p>
	 *
	 */
	public static final String $key8 = "key8";
	private static final MCPermColumnInfo _key8 = createColumnInfo("key8");
	public final MCStringPermColumn key8 = createStringColumn(_key8);
	
	/**
	 * キー９. Key 9.<p>
	 *
	 */
	public static final String $key9 = "key9";
	private static final MCPermColumnInfo _key9 = createColumnInfo("key9");
	public final MCStringPermColumn key9 = createStringColumn(_key9);
	
	/**
	 * キー１０. Key 10.<p>
	 *
	 */
	public static final String $key10 = "key10";
	private static final MCPermColumnInfo _key10 = createColumnInfo("key10");
	public final MCStringPermColumn key10 = createStringColumn(_key10);
	
	/**
	 * 文字列１. String 1.<p>
	 *
	 */
	public static final String $char1 = "char1";
	private static final MCPermColumnInfo _char1 = createColumnInfo("char1");
	public final MCStringPermColumn char1 = createStringColumn(_char1);
	
	/**
	 * 文字列２. String 2.<p>
	 *
	 */
	public static final String $char2 = "char2";
	private static final MCPermColumnInfo _char2 = createColumnInfo("char2");
	public final MCStringPermColumn char2 = createStringColumn(_char2);
	
	/**
	 * 文字列３. String 3.<p>
	 *
	 */
	public static final String $char3 = "char3";
	private static final MCPermColumnInfo _char3 = createColumnInfo("char3");
	public final MCStringPermColumn char3 = createStringColumn(_char3);
	
	/**
	 * 文字列４. String 4.<p>
	 *
	 */
	public static final String $char4 = "char4";
	private static final MCPermColumnInfo _char4 = createColumnInfo("char4");
	public final MCStringPermColumn char4 = createStringColumn(_char4);
	
	/**
	 * 文字列５. String 5.<p>
	 *
	 */
	public static final String $char5 = "char5";
	private static final MCPermColumnInfo _char5 = createColumnInfo("char5");
	public final MCStringPermColumn char5 = createStringColumn(_char5);
	
	/**
	 * 文字列６. String 6.<p>
	 *
	 */
	public static final String $char6 = "char6";
	private static final MCPermColumnInfo _char6 = createColumnInfo("char6");
	public final MCStringPermColumn char6 = createStringColumn(_char6);
	
	/**
	 * 文字列７. String 7.<p>
	 *
	 */
	public static final String $char7 = "char7";
	private static final MCPermColumnInfo _char7 = createColumnInfo("char7");
	public final MCStringPermColumn char7 = createStringColumn(_char7);
	
	/**
	 * 文字列８. String 8.<p>
	 *
	 */
	public static final String $char8 = "char8";
	private static final MCPermColumnInfo _char8 = createColumnInfo("char8");
	public final MCStringPermColumn char8 = createStringColumn(_char8);
	
	/**
	 * 文字列９. String 9.<p>
	 *
	 */
	public static final String $char9 = "char9";
	private static final MCPermColumnInfo _char9 = createColumnInfo("char9");
	public final MCStringPermColumn char9 = createStringColumn(_char9);
	
	/**
	 * 文字列１０. String 10.<p>
	 *
	 */
	public static final String $char10 = "char10";
	private static final MCPermColumnInfo _char10 = createColumnInfo("char10");
	public final MCStringPermColumn char10 = createStringColumn(_char10);
	
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
	 * ロケールＣＤ. Locale cd..<p>
	 *
	 */
	public static final String $lcl_cd = "lcl_cd";
	private static final MCPermColumnInfo _lcl_cd = createColumnInfo("lcl_cd");
	public final MCStringPermColumn lcl_cd = createStringColumn(_lcl_cd);
	
	public static final MCMeta gp_grp_cd_META = createCommonMeta($gp_grp_cd, mcframe.commonMA.meta.MA_META.GP_GRP_CD);
	public static final MCMeta key1_META = createCommonMeta($key1, mcframe.commonMA.meta.MA_META.GP_KEY1);
	public static final MCMeta key2_META = createCommonMeta($key2, mcframe.commonMA.meta.MA_META.GP_KEY2);
	public static final MCMeta key3_META = createCommonMeta($key3, mcframe.commonMA.meta.MA_META.GP_KEY3);
	public static final MCMeta key4_META = createCommonMeta($key4, mcframe.commonMA.meta.MA_META.GP_KEY4);
	public static final MCMeta key5_META = createCommonMeta($key5, mcframe.commonMA.meta.MA_META.GP_KEY5);
	public static final MCMeta key6_META = createCommonMeta($key6, mcframe.commonMA.meta.MA_META.GP_KEY6);
	public static final MCMeta key7_META = createCommonMeta($key7, mcframe.commonMA.meta.MA_META.GP_KEY7);
	public static final MCMeta key8_META = createCommonMeta($key8, mcframe.commonMA.meta.MA_META.GP_KEY8);
	public static final MCMeta key9_META = createCommonMeta($key9, mcframe.commonMA.meta.MA_META.GP_KEY9);
	public static final MCMeta key10_META = createCommonMeta($key10, mcframe.commonMA.meta.MA_META.GP_KEY10);
	public static final MCMeta char1_META = createCommonMeta($char1, mcframe.commonMA.meta.MA_META.GP_CHAR1);
	public static final MCMeta char2_META = createCommonMeta($char2, mcframe.commonMA.meta.MA_META.GP_CHAR2);
	public static final MCMeta char3_META = createCommonMeta($char3, mcframe.commonMA.meta.MA_META.GP_CHAR3);
	public static final MCMeta char4_META = createCommonMeta($char4, mcframe.commonMA.meta.MA_META.GP_CHAR4);
	public static final MCMeta char5_META = createCommonMeta($char5, mcframe.commonMA.meta.MA_META.GP_CHAR5);
	public static final MCMeta char6_META = createCommonMeta($char6, mcframe.commonMA.meta.MA_META.GP_CHAR6);
	public static final MCMeta char7_META = createCommonMeta($char7, mcframe.commonMA.meta.MA_META.GP_CHAR7);
	public static final MCMeta char8_META = createCommonMeta($char8, mcframe.commonMA.meta.MA_META.GP_CHAR8);
	public static final MCMeta char9_META = createCommonMeta($char9, mcframe.commonMA.meta.MA_META.GP_CHAR9);
	public static final MCMeta char10_META = createCommonMeta($char10, mcframe.commonMA.meta.MA_META.GP_CHAR10);
	public static final MCMeta memo1_META = createCommonMeta($memo1, mcframe.commonMA.meta.MA_META.MST_MEMO1);
	public static final MCMeta memo2_META = createCommonMeta($memo2, mcframe.commonMA.meta.MA_META.MST_MEMO2);
	public static final MCMeta memo3_META = createCommonMeta($memo3, mcframe.commonMA.meta.MA_META.MST_MEMO3);
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
	public static final MCMeta lcl_cd_META = createCommonMeta($lcl_cd, mcframe.commonMA.meta.MA_META.LCL_CD);

	protected static final List<MCForeignInfo> FOREIGN_INFO_LIST = new ArrayList<>();
	static {
	}
	
	protected static final ConstMetaList<MAM_GP_LCL_R> constMetas = new ConstMetaList<MAM_GP_LCL_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			gp_grp_cd_META,
			key1_META,
			key2_META,
			key3_META,
			key4_META,
			key5_META,
			key6_META,
			key7_META,
			key8_META,
			key9_META,
			key10_META,
			char1_META,
			char2_META,
			char3_META,
			char4_META,
			char5_META,
			char6_META,
			char7_META,
			char8_META,
			char9_META,
			char10_META,
			memo1_META,
			memo2_META,
			memo3_META,
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
			lcl_cd_META
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
	protected MAM_GP_LCL_R(ConstMetaList<? extends MAM_GP_LCL_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MAM_GP_LCL_R(ConstMetaList<? extends MAM_GP_LCL_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MAM_GP_LCL_R.$gp_grp_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_GP_LCL_R.$gp_grp_cd,
				"gp_grp_cd",
				gp_grp_cd,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_GP_LCL_R.$key1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_GP_LCL_R.$key1,
				"key1",
				key1,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_GP_LCL_R.$key2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_GP_LCL_R.$key2,
				"key2",
				key2,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_GP_LCL_R.$key3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_GP_LCL_R.$key3,
				"key3",
				key3,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_GP_LCL_R.$key4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_GP_LCL_R.$key4,
				"key4",
				key4,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_GP_LCL_R.$key5,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_GP_LCL_R.$key5,
				"key5",
				key5,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_GP_LCL_R.$key6,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_GP_LCL_R.$key6,
				"key6",
				key6,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_GP_LCL_R.$key7,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_GP_LCL_R.$key7,
				"key7",
				key7,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_GP_LCL_R.$key8,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_GP_LCL_R.$key8,
				"key8",
				key8,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_GP_LCL_R.$key9,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_GP_LCL_R.$key9,
				"key9",
				key9,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_GP_LCL_R.$key10,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_GP_LCL_R.$key10,
				"key10",
				key10,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_GP_LCL_R.$char1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_GP_LCL_R.$char1,
				"char1",
				char1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_GP_LCL_R.$char2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_GP_LCL_R.$char2,
				"char2",
				char2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_GP_LCL_R.$char3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_GP_LCL_R.$char3,
				"char3",
				char3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_GP_LCL_R.$char4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_GP_LCL_R.$char4,
				"char4",
				char4,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_GP_LCL_R.$char5,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_GP_LCL_R.$char5,
				"char5",
				char5,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_GP_LCL_R.$char6,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_GP_LCL_R.$char6,
				"char6",
				char6,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_GP_LCL_R.$char7,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_GP_LCL_R.$char7,
				"char7",
				char7,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_GP_LCL_R.$char8,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_GP_LCL_R.$char8,
				"char8",
				char8,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_GP_LCL_R.$char9,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_GP_LCL_R.$char9,
				"char9",
				char9,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_GP_LCL_R.$char10,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_GP_LCL_R.$char10,
				"char10",
				char10,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_GP_LCL_R.$memo1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_GP_LCL_R.$memo1,
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
			MAM_GP_LCL_R.$memo2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_GP_LCL_R.$memo2,
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
			MAM_GP_LCL_R.$memo3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_GP_LCL_R.$memo3,
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
			MAM_GP_LCL_R.$ins_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_GP_LCL_R.$ins_usr_id,
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
			MAM_GP_LCL_R.$ins_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_GP_LCL_R.$ins_usr_nm,
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
			MAM_GP_LCL_R.$ins_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MAM_GP_LCL_R.$ins_ts,
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
			MAM_GP_LCL_R.$ins_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_GP_LCL_R.$ins_func_id,
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
			MAM_GP_LCL_R.$upd_cntr,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_GP_LCL_R.$upd_cntr,
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
			MAM_GP_LCL_R.$upd_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_GP_LCL_R.$upd_usr_id,
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
			MAM_GP_LCL_R.$upd_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_GP_LCL_R.$upd_usr_nm,
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
			MAM_GP_LCL_R.$upd_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MAM_GP_LCL_R.$upd_ts,
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
			MAM_GP_LCL_R.$upd_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_GP_LCL_R.$upd_func_id,
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
			MAM_GP_LCL_R.$upd_srv_req_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_GP_LCL_R.$upd_srv_req_no,
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
			MAM_GP_LCL_R.$lcl_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_GP_LCL_R.$lcl_cd,
				"lcl_cd",
				lcl_cd,
				true,
				false,
				false,
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
	public static MAM_GP_LCL_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MAM_GP_LCL_R create(String alias) {
		MAM_GP_LCL_R row = new MAM_GP_LCL_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MAM_GP_LCL_R createByName(T proto) {
		MAM_GP_LCL_R row = MAM_GP_LCL_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAM_GP_LCL_R clone() {
		return (MAM_GP_LCL_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAM_GP_LCL_R createInstance() {
		return (MAM_GP_LCL_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAM_GP_LCL_R getValues(String... names) {
		return (MAM_GP_LCL_R) super.getValues(names);
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
	 * 汎用分類ＣＤ. General purpose classification cd..<p>
	 *
	 */
	public String gp_grp_cd() {
		return getConstString(offset + 0, $gp_grp_cd);
	}

	/**
	 * 汎用分類ＣＤ. General purpose classification cd..<p>
	 *
	 */
	public void gp_grp_cd(String value) {
		setConstString(offset + 0, $gp_grp_cd, value);
	}

	/**
	 * キー１. Key 1.<p>
	 *
	 */
	public String key1() {
		return getConstString(offset + 1, $key1);
	}

	/**
	 * キー１. Key 1.<p>
	 *
	 */
	public void key1(String value) {
		setConstString(offset + 1, $key1, value);
	}

	/**
	 * キー２. Key 2.<p>
	 *
	 */
	public String key2() {
		return getConstString(offset + 2, $key2);
	}

	/**
	 * キー２. Key 2.<p>
	 *
	 */
	public void key2(String value) {
		setConstString(offset + 2, $key2, value);
	}

	/**
	 * キー３. Key 3.<p>
	 *
	 */
	public String key3() {
		return getConstString(offset + 3, $key3);
	}

	/**
	 * キー３. Key 3.<p>
	 *
	 */
	public void key3(String value) {
		setConstString(offset + 3, $key3, value);
	}

	/**
	 * キー４. Key 4.<p>
	 *
	 */
	public String key4() {
		return getConstString(offset + 4, $key4);
	}

	/**
	 * キー４. Key 4.<p>
	 *
	 */
	public void key4(String value) {
		setConstString(offset + 4, $key4, value);
	}

	/**
	 * キー５. Key 5.<p>
	 *
	 */
	public String key5() {
		return getConstString(offset + 5, $key5);
	}

	/**
	 * キー５. Key 5.<p>
	 *
	 */
	public void key5(String value) {
		setConstString(offset + 5, $key5, value);
	}

	/**
	 * キー６. Key 6.<p>
	 *
	 */
	public String key6() {
		return getConstString(offset + 6, $key6);
	}

	/**
	 * キー６. Key 6.<p>
	 *
	 */
	public void key6(String value) {
		setConstString(offset + 6, $key6, value);
	}

	/**
	 * キー７. Key 7.<p>
	 *
	 */
	public String key7() {
		return getConstString(offset + 7, $key7);
	}

	/**
	 * キー７. Key 7.<p>
	 *
	 */
	public void key7(String value) {
		setConstString(offset + 7, $key7, value);
	}

	/**
	 * キー８. Key 8.<p>
	 *
	 */
	public String key8() {
		return getConstString(offset + 8, $key8);
	}

	/**
	 * キー８. Key 8.<p>
	 *
	 */
	public void key8(String value) {
		setConstString(offset + 8, $key8, value);
	}

	/**
	 * キー９. Key 9.<p>
	 *
	 */
	public String key9() {
		return getConstString(offset + 9, $key9);
	}

	/**
	 * キー９. Key 9.<p>
	 *
	 */
	public void key9(String value) {
		setConstString(offset + 9, $key9, value);
	}

	/**
	 * キー１０. Key 10.<p>
	 *
	 */
	public String key10() {
		return getConstString(offset + 10, $key10);
	}

	/**
	 * キー１０. Key 10.<p>
	 *
	 */
	public void key10(String value) {
		setConstString(offset + 10, $key10, value);
	}

	/**
	 * 文字列１. String 1.<p>
	 *
	 */
	public String char1() {
		return getConstString(offset + 11, $char1);
	}

	/**
	 * 文字列１. String 1.<p>
	 *
	 */
	public void char1(String value) {
		setConstString(offset + 11, $char1, value);
	}

	/**
	 * 文字列２. String 2.<p>
	 *
	 */
	public String char2() {
		return getConstString(offset + 12, $char2);
	}

	/**
	 * 文字列２. String 2.<p>
	 *
	 */
	public void char2(String value) {
		setConstString(offset + 12, $char2, value);
	}

	/**
	 * 文字列３. String 3.<p>
	 *
	 */
	public String char3() {
		return getConstString(offset + 13, $char3);
	}

	/**
	 * 文字列３. String 3.<p>
	 *
	 */
	public void char3(String value) {
		setConstString(offset + 13, $char3, value);
	}

	/**
	 * 文字列４. String 4.<p>
	 *
	 */
	public String char4() {
		return getConstString(offset + 14, $char4);
	}

	/**
	 * 文字列４. String 4.<p>
	 *
	 */
	public void char4(String value) {
		setConstString(offset + 14, $char4, value);
	}

	/**
	 * 文字列５. String 5.<p>
	 *
	 */
	public String char5() {
		return getConstString(offset + 15, $char5);
	}

	/**
	 * 文字列５. String 5.<p>
	 *
	 */
	public void char5(String value) {
		setConstString(offset + 15, $char5, value);
	}

	/**
	 * 文字列６. String 6.<p>
	 *
	 */
	public String char6() {
		return getConstString(offset + 16, $char6);
	}

	/**
	 * 文字列６. String 6.<p>
	 *
	 */
	public void char6(String value) {
		setConstString(offset + 16, $char6, value);
	}

	/**
	 * 文字列７. String 7.<p>
	 *
	 */
	public String char7() {
		return getConstString(offset + 17, $char7);
	}

	/**
	 * 文字列７. String 7.<p>
	 *
	 */
	public void char7(String value) {
		setConstString(offset + 17, $char7, value);
	}

	/**
	 * 文字列８. String 8.<p>
	 *
	 */
	public String char8() {
		return getConstString(offset + 18, $char8);
	}

	/**
	 * 文字列８. String 8.<p>
	 *
	 */
	public void char8(String value) {
		setConstString(offset + 18, $char8, value);
	}

	/**
	 * 文字列９. String 9.<p>
	 *
	 */
	public String char9() {
		return getConstString(offset + 19, $char9);
	}

	/**
	 * 文字列９. String 9.<p>
	 *
	 */
	public void char9(String value) {
		setConstString(offset + 19, $char9, value);
	}

	/**
	 * 文字列１０. String 10.<p>
	 *
	 */
	public String char10() {
		return getConstString(offset + 20, $char10);
	}

	/**
	 * 文字列１０. String 10.<p>
	 *
	 */
	public void char10(String value) {
		setConstString(offset + 20, $char10, value);
	}

	/**
	 * メモ１. Memo 1.<p>
	 *
	 */
	public String memo1() {
		return getConstString(offset + 21, $memo1);
	}

	/**
	 * メモ１. Memo 1.<p>
	 *
	 */
	public void memo1(String value) {
		setConstString(offset + 21, $memo1, value);
	}

	/**
	 * メモ２. Memo 2.<p>
	 *
	 */
	public String memo2() {
		return getConstString(offset + 22, $memo2);
	}

	/**
	 * メモ２. Memo 2.<p>
	 *
	 */
	public void memo2(String value) {
		setConstString(offset + 22, $memo2, value);
	}

	/**
	 * メモ３. Memo 3.<p>
	 *
	 */
	public String memo3() {
		return getConstString(offset + 23, $memo3);
	}

	/**
	 * メモ３. Memo 3.<p>
	 *
	 */
	public void memo3(String value) {
		setConstString(offset + 23, $memo3, value);
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
	 * ロケールＣＤ. Locale cd..<p>
	 *
	 */
	public String lcl_cd() {
		return getConstString(offset + 34, $lcl_cd);
	}

	/**
	 * ロケールＣＤ. Locale cd..<p>
	 *
	 */
	public void lcl_cd(String value) {
		setConstString(offset + 34, $lcl_cd, value);
	}

	public String getString(String name) {
		if ($gp_grp_cd.equalsIgnoreCase(name)) {
			return gp_grp_cd();
		}
		if ($key1.equalsIgnoreCase(name)) {
			return key1();
		}
		if ($key2.equalsIgnoreCase(name)) {
			return key2();
		}
		if ($key3.equalsIgnoreCase(name)) {
			return key3();
		}
		if ($key4.equalsIgnoreCase(name)) {
			return key4();
		}
		if ($key5.equalsIgnoreCase(name)) {
			return key5();
		}
		if ($key6.equalsIgnoreCase(name)) {
			return key6();
		}
		if ($key7.equalsIgnoreCase(name)) {
			return key7();
		}
		if ($key8.equalsIgnoreCase(name)) {
			return key8();
		}
		if ($key9.equalsIgnoreCase(name)) {
			return key9();
		}
		if ($key10.equalsIgnoreCase(name)) {
			return key10();
		}
		if ($char1.equalsIgnoreCase(name)) {
			return char1();
		}
		if ($char2.equalsIgnoreCase(name)) {
			return char2();
		}
		if ($char3.equalsIgnoreCase(name)) {
			return char3();
		}
		if ($char4.equalsIgnoreCase(name)) {
			return char4();
		}
		if ($char5.equalsIgnoreCase(name)) {
			return char5();
		}
		if ($char6.equalsIgnoreCase(name)) {
			return char6();
		}
		if ($char7.equalsIgnoreCase(name)) {
			return char7();
		}
		if ($char8.equalsIgnoreCase(name)) {
			return char8();
		}
		if ($char9.equalsIgnoreCase(name)) {
			return char9();
		}
		if ($char10.equalsIgnoreCase(name)) {
			return char10();
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
		if ($lcl_cd.equalsIgnoreCase(name)) {
			return lcl_cd();
		}
		return super.getString(name);
	}

	public MCNumber getNumber(String name) {
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
		if ($gp_grp_cd.equalsIgnoreCase(name)) {
			return gp_grp_cd();
		}
		if ($key1.equalsIgnoreCase(name)) {
			return key1();
		}
		if ($key2.equalsIgnoreCase(name)) {
			return key2();
		}
		if ($key3.equalsIgnoreCase(name)) {
			return key3();
		}
		if ($key4.equalsIgnoreCase(name)) {
			return key4();
		}
		if ($key5.equalsIgnoreCase(name)) {
			return key5();
		}
		if ($key6.equalsIgnoreCase(name)) {
			return key6();
		}
		if ($key7.equalsIgnoreCase(name)) {
			return key7();
		}
		if ($key8.equalsIgnoreCase(name)) {
			return key8();
		}
		if ($key9.equalsIgnoreCase(name)) {
			return key9();
		}
		if ($key10.equalsIgnoreCase(name)) {
			return key10();
		}
		if ($char1.equalsIgnoreCase(name)) {
			return char1();
		}
		if ($char2.equalsIgnoreCase(name)) {
			return char2();
		}
		if ($char3.equalsIgnoreCase(name)) {
			return char3();
		}
		if ($char4.equalsIgnoreCase(name)) {
			return char4();
		}
		if ($char5.equalsIgnoreCase(name)) {
			return char5();
		}
		if ($char6.equalsIgnoreCase(name)) {
			return char6();
		}
		if ($char7.equalsIgnoreCase(name)) {
			return char7();
		}
		if ($char8.equalsIgnoreCase(name)) {
			return char8();
		}
		if ($char9.equalsIgnoreCase(name)) {
			return char9();
		}
		if ($char10.equalsIgnoreCase(name)) {
			return char10();
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
		if ($lcl_cd.equalsIgnoreCase(name)) {
			return lcl_cd();
		}
		return super.getStringNE(name);
	}

	public MCNumber getNumberNE(String name) {
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
		if ($gp_grp_cd.equalsIgnoreCase(name)) {
			gp_grp_cd(value);
			return;
		}
		if ($key1.equalsIgnoreCase(name)) {
			key1(value);
			return;
		}
		if ($key2.equalsIgnoreCase(name)) {
			key2(value);
			return;
		}
		if ($key3.equalsIgnoreCase(name)) {
			key3(value);
			return;
		}
		if ($key4.equalsIgnoreCase(name)) {
			key4(value);
			return;
		}
		if ($key5.equalsIgnoreCase(name)) {
			key5(value);
			return;
		}
		if ($key6.equalsIgnoreCase(name)) {
			key6(value);
			return;
		}
		if ($key7.equalsIgnoreCase(name)) {
			key7(value);
			return;
		}
		if ($key8.equalsIgnoreCase(name)) {
			key8(value);
			return;
		}
		if ($key9.equalsIgnoreCase(name)) {
			key9(value);
			return;
		}
		if ($key10.equalsIgnoreCase(name)) {
			key10(value);
			return;
		}
		if ($char1.equalsIgnoreCase(name)) {
			char1(value);
			return;
		}
		if ($char2.equalsIgnoreCase(name)) {
			char2(value);
			return;
		}
		if ($char3.equalsIgnoreCase(name)) {
			char3(value);
			return;
		}
		if ($char4.equalsIgnoreCase(name)) {
			char4(value);
			return;
		}
		if ($char5.equalsIgnoreCase(name)) {
			char5(value);
			return;
		}
		if ($char6.equalsIgnoreCase(name)) {
			char6(value);
			return;
		}
		if ($char7.equalsIgnoreCase(name)) {
			char7(value);
			return;
		}
		if ($char8.equalsIgnoreCase(name)) {
			char8(value);
			return;
		}
		if ($char9.equalsIgnoreCase(name)) {
			char9(value);
			return;
		}
		if ($char10.equalsIgnoreCase(name)) {
			char10(value);
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
		if ($lcl_cd.equalsIgnoreCase(name)) {
			lcl_cd(value);
			return;
		}
		super.setString(name, value);
	}

	public void setNumber(String name, MCNumber value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, int value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, long value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, float value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, double value) {
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
		if ($gp_grp_cd.equalsIgnoreCase(name)) {
			gp_grp_cd(value);
			return;
		}
		if ($key1.equalsIgnoreCase(name)) {
			key1(value);
			return;
		}
		if ($key2.equalsIgnoreCase(name)) {
			key2(value);
			return;
		}
		if ($key3.equalsIgnoreCase(name)) {
			key3(value);
			return;
		}
		if ($key4.equalsIgnoreCase(name)) {
			key4(value);
			return;
		}
		if ($key5.equalsIgnoreCase(name)) {
			key5(value);
			return;
		}
		if ($key6.equalsIgnoreCase(name)) {
			key6(value);
			return;
		}
		if ($key7.equalsIgnoreCase(name)) {
			key7(value);
			return;
		}
		if ($key8.equalsIgnoreCase(name)) {
			key8(value);
			return;
		}
		if ($key9.equalsIgnoreCase(name)) {
			key9(value);
			return;
		}
		if ($key10.equalsIgnoreCase(name)) {
			key10(value);
			return;
		}
		if ($char1.equalsIgnoreCase(name)) {
			char1(value);
			return;
		}
		if ($char2.equalsIgnoreCase(name)) {
			char2(value);
			return;
		}
		if ($char3.equalsIgnoreCase(name)) {
			char3(value);
			return;
		}
		if ($char4.equalsIgnoreCase(name)) {
			char4(value);
			return;
		}
		if ($char5.equalsIgnoreCase(name)) {
			char5(value);
			return;
		}
		if ($char6.equalsIgnoreCase(name)) {
			char6(value);
			return;
		}
		if ($char7.equalsIgnoreCase(name)) {
			char7(value);
			return;
		}
		if ($char8.equalsIgnoreCase(name)) {
			char8(value);
			return;
		}
		if ($char9.equalsIgnoreCase(name)) {
			char9(value);
			return;
		}
		if ($char10.equalsIgnoreCase(name)) {
			char10(value);
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
		if ($lcl_cd.equalsIgnoreCase(name)) {
			lcl_cd(value);
			return;
		}
		super.setStringNE(name, value);
	}

	public void setNumberNE(String name, MCNumber value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, int value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, long value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, float value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, double value) {
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
