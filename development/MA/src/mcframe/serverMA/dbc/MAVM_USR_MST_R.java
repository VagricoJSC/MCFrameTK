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
import mcframe.commonCore.lang.MCBinary;
import mcframe.commonCore.lang.MCNumber;
import mcframe.serverCore.queryapi.IFMCSQL.MCStringPermColumn;
import mcframe.serverCore.queryapi.IFMCSQL.MCNumberPermColumn;
import mcframe.serverCore.queryapi.IFMCSQL.MCTimestampPermColumn;
import mcframe.serverCore.queryapi.IFMCSQL.MCBooleanPermColumn;
import mcframe.serverCore.queryapi.IFMCSQL.MCBinaryPermColumn;
import mcframe.commonCore.meta.MCMeta;
import mcframe.commonCore.lang.MCDataType;
import mcframe.commonCore.lang.MCTimestamp;
import mcframe.serverCore.queryapi.MCDBContainer;
import mcframe.serverCore.queryapi.MCDBContainer.MCTableType;
import mcframe.serverCore.queryapi.IFMCSQL.MCPermColumn;
import mcframe.serverCore.queryapi.IFMCSQL.MCPermColumnInfo;
import mcframe.serverCore.queryapi.MCForeignInfo;

/**
 * "担当者マスタビュー // PIC master view"DBコンテナRowクラスです。<p>
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
 *  	<td>C</td>
 *  	<td>usr_cd</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>担当者ＣＤ</td>
 *  	<td>PIC cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>usr_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>担当者名</td>
 *  	<td>PIC name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>usr_alt_nm1</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>担当者別名１</td>
 *  	<td>PIC alias name 1</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>usr_alt_nm2</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>担当者別名２</td>
 *  	<td>PIC alias name 2</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>usr_alt_nm3</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>担当者別名３</td>
 *  	<td>PIC alias name 3</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>usr_alt_nm4</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>担当者別名４</td>
 *  	<td>PIC alias name 4</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>full_da_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>フルデータアクセスＦＬＧ</td>
 *  	<td>Full data access</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>email1</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>Ｅ－ｍａｉｌ１</td>
 *  	<td>E-mail 1</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>email2</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>Ｅ－ｍａｉｌ２</td>
 *  	<td>E-mail 2</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>email3</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>Ｅ－ｍａｉｌ３</td>
 *  	<td>E-mail 3</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>tel1</td>
 *  	<td>C</td>
 *  	<td>30</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＴＥＬ１</td>
 *  	<td>TEL 1</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>tel2</td>
 *  	<td>C</td>
 *  	<td>30</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＴＥＬ２</td>
 *  	<td>TEL 2</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>tel3</td>
 *  	<td>C</td>
 *  	<td>30</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＴＥＬ３</td>
 *  	<td>TEL 3</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>th_image</td>
 *  	<td>B</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>サムネイル画像</td>
 *  	<td>Thumbnail image</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>usr_com_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>社員区分</td>
 *  	<td>Employee type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>usr_com</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>所属会社</td>
 *  	<td>Affiliation company</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>wk_cost_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>工数管理ＣＤ</td>
 *  	<td>Work element cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>usr_info1</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>担当者情報１</td>
 *  	<td>PIC info. 1</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>usr_info2</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>担当者情報２</td>
 *  	<td>PIC info. 2</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>usr_info3</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>担当者情報３</td>
 *  	<td>PIC info. 3</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>usr_info4</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>担当者情報４</td>
 *  	<td>PIC info. 4</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>usr_info5</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>担当者情報５</td>
 *  	<td>PIC info. 5</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>usr_info6</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>担当者情報６</td>
 *  	<td>PIC info. 6</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>usr_info7</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>担当者情報７</td>
 *  	<td>PIC info. 7</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>usr_info8</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>担当者情報８</td>
 *  	<td>PIC info. 8</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>usr_info9</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>担当者情報９</td>
 *  	<td>PIC info. 9</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>usr_info10</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>担当者情報１０</td>
 *  	<td>PIC info. 10</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>usr_info11</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>担当者情報１１</td>
 *  	<td>PIC info. 11</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>usr_info12</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>担当者情報１２</td>
 *  	<td>PIC info. 12</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>usr_info13</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>担当者情報１３</td>
 *  	<td>PIC info. 13</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>usr_info14</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>担当者情報１４</td>
 *  	<td>PIC info. 14</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>usr_info15</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>担当者情報１５</td>
 *  	<td>PIC info. 15</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>usr_info16</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>担当者情報１６</td>
 *  	<td>PIC info. 16</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>usr_info17</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>担当者情報１７</td>
 *  	<td>PIC info. 17</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>usr_info18</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>担当者情報１８</td>
 *  	<td>PIC info. 18</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>usr_info19</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>担当者情報１９</td>
 *  	<td>PIC info. 19</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>usr_info20</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>担当者情報２０</td>
 *  	<td>PIC info. 20</td>
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
 *  	<td>co_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>会社ＣＤ</td>
 *  	<td>Company cd.</td>
 *  </tr>
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
public class MAVM_USR_MST_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.VIEW;

	public static final String TABLE_NAME = "MAVM_USR_MST";

	public static final boolean EX_CTRL = false;
	
	public static final boolean LCL_TABLE = false;
	
	/**
	 * 担当者ＣＤ. PIC cd..<p>
	 *
	 */
	public static final String $usr_cd = "usr_cd";
	private static final MCPermColumnInfo _usr_cd = createColumnInfo("usr_cd");
	public final MCStringPermColumn usr_cd = createStringColumn(_usr_cd);
	
	/**
	 * 担当者名. PIC name.<p>
	 *
	 */
	public static final String $usr_nm = "usr_nm";
	private static final MCPermColumnInfo _usr_nm = createColumnInfo("usr_nm");
	public final MCStringPermColumn usr_nm = createStringColumn(_usr_nm);
	
	/**
	 * 担当者別名１. PIC alias name 1.<p>
	 *
	 */
	public static final String $usr_alt_nm1 = "usr_alt_nm1";
	private static final MCPermColumnInfo _usr_alt_nm1 = createColumnInfo("usr_alt_nm1");
	public final MCStringPermColumn usr_alt_nm1 = createStringColumn(_usr_alt_nm1);
	
	/**
	 * 担当者別名２. PIC alias name 2.<p>
	 *
	 */
	public static final String $usr_alt_nm2 = "usr_alt_nm2";
	private static final MCPermColumnInfo _usr_alt_nm2 = createColumnInfo("usr_alt_nm2");
	public final MCStringPermColumn usr_alt_nm2 = createStringColumn(_usr_alt_nm2);
	
	/**
	 * 担当者別名３. PIC alias name 3.<p>
	 *
	 */
	public static final String $usr_alt_nm3 = "usr_alt_nm3";
	private static final MCPermColumnInfo _usr_alt_nm3 = createColumnInfo("usr_alt_nm3");
	public final MCStringPermColumn usr_alt_nm3 = createStringColumn(_usr_alt_nm3);
	
	/**
	 * 担当者別名４. PIC alias name 4.<p>
	 *
	 */
	public static final String $usr_alt_nm4 = "usr_alt_nm4";
	private static final MCPermColumnInfo _usr_alt_nm4 = createColumnInfo("usr_alt_nm4");
	public final MCStringPermColumn usr_alt_nm4 = createStringColumn(_usr_alt_nm4);
	
	/**
	 * フルデータアクセスＦＬＧ. Full data access.<p>
	 *
	 */
	public static final String $full_da_flg = "full_da_flg";
	private static final MCPermColumnInfo _full_da_flg = createColumnInfo("full_da_flg");
	public final MCBooleanPermColumn full_da_flg = createBooleanColumn(_full_da_flg);
	
	/**
	 * Ｅ－ｍａｉｌ１. E-mail 1.<p>
	 *
	 */
	public static final String $email1 = "email1";
	private static final MCPermColumnInfo _email1 = createColumnInfo("email1");
	public final MCStringPermColumn email1 = createStringColumn(_email1);
	
	/**
	 * Ｅ－ｍａｉｌ２. E-mail 2.<p>
	 *
	 */
	public static final String $email2 = "email2";
	private static final MCPermColumnInfo _email2 = createColumnInfo("email2");
	public final MCStringPermColumn email2 = createStringColumn(_email2);
	
	/**
	 * Ｅ－ｍａｉｌ３. E-mail 3.<p>
	 *
	 */
	public static final String $email3 = "email3";
	private static final MCPermColumnInfo _email3 = createColumnInfo("email3");
	public final MCStringPermColumn email3 = createStringColumn(_email3);
	
	/**
	 * ＴＥＬ１. TEL 1.<p>
	 *
	 */
	public static final String $tel1 = "tel1";
	private static final MCPermColumnInfo _tel1 = createColumnInfo("tel1");
	public final MCStringPermColumn tel1 = createStringColumn(_tel1);
	
	/**
	 * ＴＥＬ２. TEL 2.<p>
	 *
	 */
	public static final String $tel2 = "tel2";
	private static final MCPermColumnInfo _tel2 = createColumnInfo("tel2");
	public final MCStringPermColumn tel2 = createStringColumn(_tel2);
	
	/**
	 * ＴＥＬ３. TEL 3.<p>
	 *
	 */
	public static final String $tel3 = "tel3";
	private static final MCPermColumnInfo _tel3 = createColumnInfo("tel3");
	public final MCStringPermColumn tel3 = createStringColumn(_tel3);
	
	/**
	 * サムネイル画像. Thumbnail image.<p>
	 *
	 */
	public static final String $th_image = "th_image";
	private static final MCPermColumnInfo _th_image = createColumnInfo("th_image");
	public final MCBinaryPermColumn th_image = createBinaryColumn(_th_image);
	
	/**
	 * 社員区分. Employee type.<p>
	 *
	 */
	public static final String $usr_com_typ = "usr_com_typ";
	private static final MCPermColumnInfo _usr_com_typ = createColumnInfo("usr_com_typ");
	public final MCStringPermColumn usr_com_typ = createStringColumn(_usr_com_typ);
	
	/**
	 * 所属会社. Affiliation company.<p>
	 *
	 */
	public static final String $usr_com = "usr_com";
	private static final MCPermColumnInfo _usr_com = createColumnInfo("usr_com");
	public final MCStringPermColumn usr_com = createStringColumn(_usr_com);
	
	/**
	 * 工数管理ＣＤ. Work element cd..<p>
	 *
	 */
	public static final String $wk_cost_cd = "wk_cost_cd";
	private static final MCPermColumnInfo _wk_cost_cd = createColumnInfo("wk_cost_cd");
	public final MCStringPermColumn wk_cost_cd = createStringColumn(_wk_cost_cd);
	
	/**
	 * 担当者情報１. PIC info. 1.<p>
	 *
	 */
	public static final String $usr_info1 = "usr_info1";
	private static final MCPermColumnInfo _usr_info1 = createColumnInfo("usr_info1");
	public final MCStringPermColumn usr_info1 = createStringColumn(_usr_info1);
	
	/**
	 * 担当者情報２. PIC info. 2.<p>
	 *
	 */
	public static final String $usr_info2 = "usr_info2";
	private static final MCPermColumnInfo _usr_info2 = createColumnInfo("usr_info2");
	public final MCStringPermColumn usr_info2 = createStringColumn(_usr_info2);
	
	/**
	 * 担当者情報３. PIC info. 3.<p>
	 *
	 */
	public static final String $usr_info3 = "usr_info3";
	private static final MCPermColumnInfo _usr_info3 = createColumnInfo("usr_info3");
	public final MCStringPermColumn usr_info3 = createStringColumn(_usr_info3);
	
	/**
	 * 担当者情報４. PIC info. 4.<p>
	 *
	 */
	public static final String $usr_info4 = "usr_info4";
	private static final MCPermColumnInfo _usr_info4 = createColumnInfo("usr_info4");
	public final MCStringPermColumn usr_info4 = createStringColumn(_usr_info4);
	
	/**
	 * 担当者情報５. PIC info. 5.<p>
	 *
	 */
	public static final String $usr_info5 = "usr_info5";
	private static final MCPermColumnInfo _usr_info5 = createColumnInfo("usr_info5");
	public final MCStringPermColumn usr_info5 = createStringColumn(_usr_info5);
	
	/**
	 * 担当者情報６. PIC info. 6.<p>
	 *
	 */
	public static final String $usr_info6 = "usr_info6";
	private static final MCPermColumnInfo _usr_info6 = createColumnInfo("usr_info6");
	public final MCStringPermColumn usr_info6 = createStringColumn(_usr_info6);
	
	/**
	 * 担当者情報７. PIC info. 7.<p>
	 *
	 */
	public static final String $usr_info7 = "usr_info7";
	private static final MCPermColumnInfo _usr_info7 = createColumnInfo("usr_info7");
	public final MCStringPermColumn usr_info7 = createStringColumn(_usr_info7);
	
	/**
	 * 担当者情報８. PIC info. 8.<p>
	 *
	 */
	public static final String $usr_info8 = "usr_info8";
	private static final MCPermColumnInfo _usr_info8 = createColumnInfo("usr_info8");
	public final MCStringPermColumn usr_info8 = createStringColumn(_usr_info8);
	
	/**
	 * 担当者情報９. PIC info. 9.<p>
	 *
	 */
	public static final String $usr_info9 = "usr_info9";
	private static final MCPermColumnInfo _usr_info9 = createColumnInfo("usr_info9");
	public final MCStringPermColumn usr_info9 = createStringColumn(_usr_info9);
	
	/**
	 * 担当者情報１０. PIC info. 10.<p>
	 *
	 */
	public static final String $usr_info10 = "usr_info10";
	private static final MCPermColumnInfo _usr_info10 = createColumnInfo("usr_info10");
	public final MCStringPermColumn usr_info10 = createStringColumn(_usr_info10);
	
	/**
	 * 担当者情報１１. PIC info. 11.<p>
	 *
	 */
	public static final String $usr_info11 = "usr_info11";
	private static final MCPermColumnInfo _usr_info11 = createColumnInfo("usr_info11");
	public final MCStringPermColumn usr_info11 = createStringColumn(_usr_info11);
	
	/**
	 * 担当者情報１２. PIC info. 12.<p>
	 *
	 */
	public static final String $usr_info12 = "usr_info12";
	private static final MCPermColumnInfo _usr_info12 = createColumnInfo("usr_info12");
	public final MCStringPermColumn usr_info12 = createStringColumn(_usr_info12);
	
	/**
	 * 担当者情報１３. PIC info. 13.<p>
	 *
	 */
	public static final String $usr_info13 = "usr_info13";
	private static final MCPermColumnInfo _usr_info13 = createColumnInfo("usr_info13");
	public final MCStringPermColumn usr_info13 = createStringColumn(_usr_info13);
	
	/**
	 * 担当者情報１４. PIC info. 14.<p>
	 *
	 */
	public static final String $usr_info14 = "usr_info14";
	private static final MCPermColumnInfo _usr_info14 = createColumnInfo("usr_info14");
	public final MCStringPermColumn usr_info14 = createStringColumn(_usr_info14);
	
	/**
	 * 担当者情報１５. PIC info. 15.<p>
	 *
	 */
	public static final String $usr_info15 = "usr_info15";
	private static final MCPermColumnInfo _usr_info15 = createColumnInfo("usr_info15");
	public final MCStringPermColumn usr_info15 = createStringColumn(_usr_info15);
	
	/**
	 * 担当者情報１６. PIC info. 16.<p>
	 *
	 */
	public static final String $usr_info16 = "usr_info16";
	private static final MCPermColumnInfo _usr_info16 = createColumnInfo("usr_info16");
	public final MCStringPermColumn usr_info16 = createStringColumn(_usr_info16);
	
	/**
	 * 担当者情報１７. PIC info. 17.<p>
	 *
	 */
	public static final String $usr_info17 = "usr_info17";
	private static final MCPermColumnInfo _usr_info17 = createColumnInfo("usr_info17");
	public final MCStringPermColumn usr_info17 = createStringColumn(_usr_info17);
	
	/**
	 * 担当者情報１８. PIC info. 18.<p>
	 *
	 */
	public static final String $usr_info18 = "usr_info18";
	private static final MCPermColumnInfo _usr_info18 = createColumnInfo("usr_info18");
	public final MCStringPermColumn usr_info18 = createStringColumn(_usr_info18);
	
	/**
	 * 担当者情報１９. PIC info. 19.<p>
	 *
	 */
	public static final String $usr_info19 = "usr_info19";
	private static final MCPermColumnInfo _usr_info19 = createColumnInfo("usr_info19");
	public final MCStringPermColumn usr_info19 = createStringColumn(_usr_info19);
	
	/**
	 * 担当者情報２０. PIC info. 20.<p>
	 *
	 */
	public static final String $usr_info20 = "usr_info20";
	private static final MCPermColumnInfo _usr_info20 = createColumnInfo("usr_info20");
	public final MCStringPermColumn usr_info20 = createStringColumn(_usr_info20);
	
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
	 * 会社ＣＤ. Company cd..<p>
	 *
	 */
	public static final String $co_cd = "co_cd";
	private static final MCPermColumnInfo _co_cd = createColumnInfo("co_cd");
	public final MCStringPermColumn co_cd = createStringColumn(_co_cd);
	
	public static final MCMeta usr_cd_META = createCommonMeta($usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta usr_nm_META = createCommonMeta($usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta usr_alt_nm1_META = createCommonMeta($usr_alt_nm1, mcframe.commonMA.meta.MA_META.USR_LNM1);
	public static final MCMeta usr_alt_nm2_META = createCommonMeta($usr_alt_nm2, mcframe.commonMA.meta.MA_META.USR_LNM2);
	public static final MCMeta usr_alt_nm3_META = createCommonMeta($usr_alt_nm3, mcframe.commonMA.meta.MA_META.USR_LNM3);
	public static final MCMeta usr_alt_nm4_META = createCommonMeta($usr_alt_nm4, mcframe.commonMA.meta.MA_META.USR_LNM4);
	public static final MCMeta full_da_flg_META = createCommonMeta($full_da_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta email1_META = createCommonMeta($email1, mcframe.commonMA.meta.MA_META.EMAIL);
	public static final MCMeta email2_META = createCommonMeta($email2, mcframe.commonMA.meta.MA_META.EMAIL);
	public static final MCMeta email3_META = createCommonMeta($email3, mcframe.commonMA.meta.MA_META.EMAIL);
	public static final MCMeta tel1_META = createCommonMeta($tel1, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta tel2_META = createCommonMeta($tel2, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta tel3_META = createCommonMeta($tel3, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta th_image_META = createCommonMeta($th_image, mcframe.commonMA.meta.MA_META.BIN);
	public static final MCMeta usr_com_typ_META = createCommonMeta($usr_com_typ, mcframe.commonMA.meta.MA_META.USR_COM_TYP);
	public static final MCMeta usr_com_META = createCommonMeta($usr_com, mcframe.commonMA.meta.MA_META.USR_COM);
	public static final MCMeta wk_cost_cd_META = createCommonMeta($wk_cost_cd, mcframe.commonMA.meta.MA_META.WK_COST_CD);
	public static final MCMeta usr_info1_META = createCommonMeta($usr_info1, mcframe.commonMA.meta.MA_META.USR_INFO1);
	public static final MCMeta usr_info2_META = createCommonMeta($usr_info2, mcframe.commonMA.meta.MA_META.USR_INFO2);
	public static final MCMeta usr_info3_META = createCommonMeta($usr_info3, mcframe.commonMA.meta.MA_META.USR_INFO3);
	public static final MCMeta usr_info4_META = createCommonMeta($usr_info4, mcframe.commonMA.meta.MA_META.USR_INFO4);
	public static final MCMeta usr_info5_META = createCommonMeta($usr_info5, mcframe.commonMA.meta.MA_META.USR_INFO5);
	public static final MCMeta usr_info6_META = createCommonMeta($usr_info6, mcframe.commonMA.meta.MA_META.USR_INFO6);
	public static final MCMeta usr_info7_META = createCommonMeta($usr_info7, mcframe.commonMA.meta.MA_META.USR_INFO7);
	public static final MCMeta usr_info8_META = createCommonMeta($usr_info8, mcframe.commonMA.meta.MA_META.USR_INFO8);
	public static final MCMeta usr_info9_META = createCommonMeta($usr_info9, mcframe.commonMA.meta.MA_META.USR_INFO9);
	public static final MCMeta usr_info10_META = createCommonMeta($usr_info10, mcframe.commonMA.meta.MA_META.USR_INFO10);
	public static final MCMeta usr_info11_META = createCommonMeta($usr_info11, mcframe.commonMA.meta.MA_META.USR_INFO11);
	public static final MCMeta usr_info12_META = createCommonMeta($usr_info12, mcframe.commonMA.meta.MA_META.USR_INFO12);
	public static final MCMeta usr_info13_META = createCommonMeta($usr_info13, mcframe.commonMA.meta.MA_META.USR_INFO13);
	public static final MCMeta usr_info14_META = createCommonMeta($usr_info14, mcframe.commonMA.meta.MA_META.USR_INFO14);
	public static final MCMeta usr_info15_META = createCommonMeta($usr_info15, mcframe.commonMA.meta.MA_META.USR_INFO15);
	public static final MCMeta usr_info16_META = createCommonMeta($usr_info16, mcframe.commonMA.meta.MA_META.USR_INFO16);
	public static final MCMeta usr_info17_META = createCommonMeta($usr_info17, mcframe.commonMA.meta.MA_META.USR_INFO17);
	public static final MCMeta usr_info18_META = createCommonMeta($usr_info18, mcframe.commonMA.meta.MA_META.USR_INFO18);
	public static final MCMeta usr_info19_META = createCommonMeta($usr_info19, mcframe.commonMA.meta.MA_META.USR_INFO19);
	public static final MCMeta usr_info20_META = createCommonMeta($usr_info20, mcframe.commonMA.meta.MA_META.USR_INFO20);
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
	public static final MCMeta co_cd_META = createCommonMeta($co_cd, mcframe.commonMA.meta.MA_META.CO_CD);

	protected static final List<MCForeignInfo> FOREIGN_INFO_LIST = new ArrayList<>();
	public static final String $CO_ALL1 = "CO_ALL1";
	public static final String $WK_COST_CMN1 = "WK_COST_CMN1";
	static {
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_CO_ALL",
				$CO_ALL1,
				new String[][]{
						{"co_cd", "co_cd"}
				},
				() -> {
					return null;
				},
				(alias) -> {
					return null;
				}
			)
		);
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_WK_COST_CMN",
				$WK_COST_CMN1,
				new String[][]{
						{"wk_cost_cd", "wk_cost_cd"}
				},
				() -> {
					return null;
				},
				(alias) -> {
					return null;
				}
			)
		);
	}
	
	protected static final ConstMetaList<MAVM_USR_MST_R> constMetas = new ConstMetaList<MAVM_USR_MST_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			usr_cd_META,
			usr_nm_META,
			usr_alt_nm1_META,
			usr_alt_nm2_META,
			usr_alt_nm3_META,
			usr_alt_nm4_META,
			full_da_flg_META,
			email1_META,
			email2_META,
			email3_META,
			tel1_META,
			tel2_META,
			tel3_META,
			th_image_META,
			usr_com_typ_META,
			usr_com_META,
			wk_cost_cd_META,
			usr_info1_META,
			usr_info2_META,
			usr_info3_META,
			usr_info4_META,
			usr_info5_META,
			usr_info6_META,
			usr_info7_META,
			usr_info8_META,
			usr_info9_META,
			usr_info10_META,
			usr_info11_META,
			usr_info12_META,
			usr_info13_META,
			usr_info14_META,
			usr_info15_META,
			usr_info16_META,
			usr_info17_META,
			usr_info18_META,
			usr_info19_META,
			usr_info20_META,
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
			co_cd_META
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
	protected MAVM_USR_MST_R(ConstMetaList<? extends MAVM_USR_MST_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MAVM_USR_MST_R(ConstMetaList<? extends MAVM_USR_MST_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MAVM_USR_MST_R.$usr_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_USR_MST_R.$usr_cd,
				"usr_cd",
				usr_cd,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_USR_MST_R.$usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_USR_MST_R.$usr_nm,
				"usr_nm",
				usr_nm,
				false,
				false,
				false,
				true,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_USR_MST_R.$usr_alt_nm1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_USR_MST_R.$usr_alt_nm1,
				"usr_alt_nm1",
				usr_alt_nm1,
				false,
				true,
				false,
				true,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_USR_MST_R.$usr_alt_nm2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_USR_MST_R.$usr_alt_nm2,
				"usr_alt_nm2",
				usr_alt_nm2,
				false,
				true,
				false,
				true,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_USR_MST_R.$usr_alt_nm3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_USR_MST_R.$usr_alt_nm3,
				"usr_alt_nm3",
				usr_alt_nm3,
				false,
				true,
				false,
				true,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_USR_MST_R.$usr_alt_nm4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_USR_MST_R.$usr_alt_nm4,
				"usr_alt_nm4",
				usr_alt_nm4,
				false,
				true,
				false,
				true,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_USR_MST_R.$full_da_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAVM_USR_MST_R.$full_da_flg,
				"full_da_flg",
				full_da_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_USR_MST_R.$email1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_USR_MST_R.$email1,
				"email1",
				email1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_USR_MST_R.$email2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_USR_MST_R.$email2,
				"email2",
				email2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_USR_MST_R.$email3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_USR_MST_R.$email3,
				"email3",
				email3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_USR_MST_R.$tel1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_USR_MST_R.$tel1,
				"tel1",
				tel1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_USR_MST_R.$tel2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_USR_MST_R.$tel2,
				"tel2",
				tel2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_USR_MST_R.$tel3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_USR_MST_R.$tel3,
				"tel3",
				tel3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_USR_MST_R.$th_image,
			new MCDBContainerColulmnInfo<MCBinaryPermColumn>(
				MCDataType.BINARY,
				MAVM_USR_MST_R.$th_image,
				"th_image",
				th_image,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_USR_MST_R.$usr_com_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_USR_MST_R.$usr_com_typ,
				"usr_com_typ",
				usr_com_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_USR_MST_R.$usr_com,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_USR_MST_R.$usr_com,
				"usr_com",
				usr_com,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_USR_MST_R.$wk_cost_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_USR_MST_R.$wk_cost_cd,
				"wk_cost_cd",
				wk_cost_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_USR_MST_R.$usr_info1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_USR_MST_R.$usr_info1,
				"usr_info1",
				usr_info1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_USR_MST_R.$usr_info2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_USR_MST_R.$usr_info2,
				"usr_info2",
				usr_info2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_USR_MST_R.$usr_info3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_USR_MST_R.$usr_info3,
				"usr_info3",
				usr_info3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_USR_MST_R.$usr_info4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_USR_MST_R.$usr_info4,
				"usr_info4",
				usr_info4,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_USR_MST_R.$usr_info5,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_USR_MST_R.$usr_info5,
				"usr_info5",
				usr_info5,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_USR_MST_R.$usr_info6,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_USR_MST_R.$usr_info6,
				"usr_info6",
				usr_info6,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_USR_MST_R.$usr_info7,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_USR_MST_R.$usr_info7,
				"usr_info7",
				usr_info7,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_USR_MST_R.$usr_info8,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_USR_MST_R.$usr_info8,
				"usr_info8",
				usr_info8,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_USR_MST_R.$usr_info9,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_USR_MST_R.$usr_info9,
				"usr_info9",
				usr_info9,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_USR_MST_R.$usr_info10,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_USR_MST_R.$usr_info10,
				"usr_info10",
				usr_info10,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_USR_MST_R.$usr_info11,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_USR_MST_R.$usr_info11,
				"usr_info11",
				usr_info11,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_USR_MST_R.$usr_info12,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_USR_MST_R.$usr_info12,
				"usr_info12",
				usr_info12,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_USR_MST_R.$usr_info13,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_USR_MST_R.$usr_info13,
				"usr_info13",
				usr_info13,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_USR_MST_R.$usr_info14,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_USR_MST_R.$usr_info14,
				"usr_info14",
				usr_info14,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_USR_MST_R.$usr_info15,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_USR_MST_R.$usr_info15,
				"usr_info15",
				usr_info15,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_USR_MST_R.$usr_info16,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_USR_MST_R.$usr_info16,
				"usr_info16",
				usr_info16,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_USR_MST_R.$usr_info17,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_USR_MST_R.$usr_info17,
				"usr_info17",
				usr_info17,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_USR_MST_R.$usr_info18,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_USR_MST_R.$usr_info18,
				"usr_info18",
				usr_info18,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_USR_MST_R.$usr_info19,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_USR_MST_R.$usr_info19,
				"usr_info19",
				usr_info19,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_USR_MST_R.$usr_info20,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_USR_MST_R.$usr_info20,
				"usr_info20",
				usr_info20,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_USR_MST_R.$memo1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_USR_MST_R.$memo1,
				"memo1",
				memo1,
				false,
				true,
				false,
				true,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_USR_MST_R.$memo2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_USR_MST_R.$memo2,
				"memo2",
				memo2,
				false,
				true,
				false,
				true,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_USR_MST_R.$memo3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_USR_MST_R.$memo3,
				"memo3",
				memo3,
				false,
				true,
				false,
				true,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAVM_USR_MST_R.$del_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAVM_USR_MST_R.$del_flg,
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
			MAVM_USR_MST_R.$del_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_USR_MST_R.$del_usr_id,
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
			MAVM_USR_MST_R.$del_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_USR_MST_R.$del_usr_nm,
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
			MAVM_USR_MST_R.$del_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MAVM_USR_MST_R.$del_ts,
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
			MAVM_USR_MST_R.$ins_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_USR_MST_R.$ins_usr_id,
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
			MAVM_USR_MST_R.$ins_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_USR_MST_R.$ins_usr_nm,
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
			MAVM_USR_MST_R.$ins_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MAVM_USR_MST_R.$ins_ts,
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
			MAVM_USR_MST_R.$ins_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_USR_MST_R.$ins_func_id,
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
			MAVM_USR_MST_R.$upd_cntr,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAVM_USR_MST_R.$upd_cntr,
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
			MAVM_USR_MST_R.$upd_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_USR_MST_R.$upd_usr_id,
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
			MAVM_USR_MST_R.$upd_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_USR_MST_R.$upd_usr_nm,
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
			MAVM_USR_MST_R.$upd_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MAVM_USR_MST_R.$upd_ts,
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
			MAVM_USR_MST_R.$upd_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_USR_MST_R.$upd_func_id,
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
			MAVM_USR_MST_R.$upd_srv_req_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_USR_MST_R.$upd_srv_req_no,
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
		COLUMN_MAP.put(
			MAVM_USR_MST_R.$co_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAVM_USR_MST_R.$co_cd,
				"co_cd",
				co_cd,
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
	public static MAVM_USR_MST_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MAVM_USR_MST_R create(String alias) {
		MAVM_USR_MST_R row = new MAVM_USR_MST_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MAVM_USR_MST_R createByName(T proto) {
		MAVM_USR_MST_R row = MAVM_USR_MST_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAVM_USR_MST_R clone() {
		return (MAVM_USR_MST_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAVM_USR_MST_R createInstance() {
		return (MAVM_USR_MST_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAVM_USR_MST_R getValues(String... names) {
		return (MAVM_USR_MST_R) super.getValues(names);
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
	 * 担当者ＣＤ. PIC cd..<p>
	 *
	 */
	public String usr_cd() {
		return getConstString(offset + 0, $usr_cd);
	}

	/**
	 * 担当者ＣＤ. PIC cd..<p>
	 *
	 */
	public void usr_cd(String value) {
		setConstString(offset + 0, $usr_cd, value);
	}

	/**
	 * 担当者名. PIC name.<p>
	 *
	 */
	public String usr_nm() {
		return getConstString(offset + 1, $usr_nm);
	}

	/**
	 * 担当者名. PIC name.<p>
	 *
	 */
	public void usr_nm(String value) {
		setConstString(offset + 1, $usr_nm, value);
	}

	/**
	 * 担当者別名１. PIC alias name 1.<p>
	 *
	 */
	public String usr_alt_nm1() {
		return getConstString(offset + 2, $usr_alt_nm1);
	}

	/**
	 * 担当者別名１. PIC alias name 1.<p>
	 *
	 */
	public void usr_alt_nm1(String value) {
		setConstString(offset + 2, $usr_alt_nm1, value);
	}

	/**
	 * 担当者別名２. PIC alias name 2.<p>
	 *
	 */
	public String usr_alt_nm2() {
		return getConstString(offset + 3, $usr_alt_nm2);
	}

	/**
	 * 担当者別名２. PIC alias name 2.<p>
	 *
	 */
	public void usr_alt_nm2(String value) {
		setConstString(offset + 3, $usr_alt_nm2, value);
	}

	/**
	 * 担当者別名３. PIC alias name 3.<p>
	 *
	 */
	public String usr_alt_nm3() {
		return getConstString(offset + 4, $usr_alt_nm3);
	}

	/**
	 * 担当者別名３. PIC alias name 3.<p>
	 *
	 */
	public void usr_alt_nm3(String value) {
		setConstString(offset + 4, $usr_alt_nm3, value);
	}

	/**
	 * 担当者別名４. PIC alias name 4.<p>
	 *
	 */
	public String usr_alt_nm4() {
		return getConstString(offset + 5, $usr_alt_nm4);
	}

	/**
	 * 担当者別名４. PIC alias name 4.<p>
	 *
	 */
	public void usr_alt_nm4(String value) {
		setConstString(offset + 5, $usr_alt_nm4, value);
	}

	/**
	 * フルデータアクセスＦＬＧ. Full data access.<p>
	 *
	 */
	public boolean full_da_flg() {
		return getConstBoolean(offset + 6, $full_da_flg);
	}

	/**
	 * フルデータアクセスＦＬＧ. Full data access.<p>
	 *
	 */
	public void full_da_flg(boolean value) {
		setConstBoolean(offset + 6, $full_da_flg, value);
	}

	/**
	 * Ｅ－ｍａｉｌ１. E-mail 1.<p>
	 *
	 */
	public String email1() {
		return getConstString(offset + 7, $email1);
	}

	/**
	 * Ｅ－ｍａｉｌ１. E-mail 1.<p>
	 *
	 */
	public void email1(String value) {
		setConstString(offset + 7, $email1, value);
	}

	/**
	 * Ｅ－ｍａｉｌ２. E-mail 2.<p>
	 *
	 */
	public String email2() {
		return getConstString(offset + 8, $email2);
	}

	/**
	 * Ｅ－ｍａｉｌ２. E-mail 2.<p>
	 *
	 */
	public void email2(String value) {
		setConstString(offset + 8, $email2, value);
	}

	/**
	 * Ｅ－ｍａｉｌ３. E-mail 3.<p>
	 *
	 */
	public String email3() {
		return getConstString(offset + 9, $email3);
	}

	/**
	 * Ｅ－ｍａｉｌ３. E-mail 3.<p>
	 *
	 */
	public void email3(String value) {
		setConstString(offset + 9, $email3, value);
	}

	/**
	 * ＴＥＬ１. TEL 1.<p>
	 *
	 */
	public String tel1() {
		return getConstString(offset + 10, $tel1);
	}

	/**
	 * ＴＥＬ１. TEL 1.<p>
	 *
	 */
	public void tel1(String value) {
		setConstString(offset + 10, $tel1, value);
	}

	/**
	 * ＴＥＬ２. TEL 2.<p>
	 *
	 */
	public String tel2() {
		return getConstString(offset + 11, $tel2);
	}

	/**
	 * ＴＥＬ２. TEL 2.<p>
	 *
	 */
	public void tel2(String value) {
		setConstString(offset + 11, $tel2, value);
	}

	/**
	 * ＴＥＬ３. TEL 3.<p>
	 *
	 */
	public String tel3() {
		return getConstString(offset + 12, $tel3);
	}

	/**
	 * ＴＥＬ３. TEL 3.<p>
	 *
	 */
	public void tel3(String value) {
		setConstString(offset + 12, $tel3, value);
	}

	/**
	 * サムネイル画像. Thumbnail image.<p>
	 *
	 */
	public MCBinary th_image() {
		return getConstBinary(offset + 13, $th_image);
	}

	/**
	 * サムネイル画像. Thumbnail image.<p>
	 *
	 */
	public void th_image(MCBinary value) {
		setConstBinary(offset + 13, $th_image, value);
	}

	/**
	 * 社員区分. Employee type.<p>
	 *
	 */
	public String usr_com_typ() {
		return getConstString(offset + 14, $usr_com_typ);
	}

	/**
	 * 社員区分. Employee type.<p>
	 *
	 */
	public void usr_com_typ(String value) {
		setConstString(offset + 14, $usr_com_typ, value);
	}

	/**
	 * 所属会社. Affiliation company.<p>
	 *
	 */
	public String usr_com() {
		return getConstString(offset + 15, $usr_com);
	}

	/**
	 * 所属会社. Affiliation company.<p>
	 *
	 */
	public void usr_com(String value) {
		setConstString(offset + 15, $usr_com, value);
	}

	/**
	 * 工数管理ＣＤ. Work element cd..<p>
	 *
	 */
	public String wk_cost_cd() {
		return getConstString(offset + 16, $wk_cost_cd);
	}

	/**
	 * 工数管理ＣＤ. Work element cd..<p>
	 *
	 */
	public void wk_cost_cd(String value) {
		setConstString(offset + 16, $wk_cost_cd, value);
	}

	/**
	 * 担当者情報１. PIC info. 1.<p>
	 *
	 */
	public String usr_info1() {
		return getConstString(offset + 17, $usr_info1);
	}

	/**
	 * 担当者情報１. PIC info. 1.<p>
	 *
	 */
	public void usr_info1(String value) {
		setConstString(offset + 17, $usr_info1, value);
	}

	/**
	 * 担当者情報２. PIC info. 2.<p>
	 *
	 */
	public String usr_info2() {
		return getConstString(offset + 18, $usr_info2);
	}

	/**
	 * 担当者情報２. PIC info. 2.<p>
	 *
	 */
	public void usr_info2(String value) {
		setConstString(offset + 18, $usr_info2, value);
	}

	/**
	 * 担当者情報３. PIC info. 3.<p>
	 *
	 */
	public String usr_info3() {
		return getConstString(offset + 19, $usr_info3);
	}

	/**
	 * 担当者情報３. PIC info. 3.<p>
	 *
	 */
	public void usr_info3(String value) {
		setConstString(offset + 19, $usr_info3, value);
	}

	/**
	 * 担当者情報４. PIC info. 4.<p>
	 *
	 */
	public String usr_info4() {
		return getConstString(offset + 20, $usr_info4);
	}

	/**
	 * 担当者情報４. PIC info. 4.<p>
	 *
	 */
	public void usr_info4(String value) {
		setConstString(offset + 20, $usr_info4, value);
	}

	/**
	 * 担当者情報５. PIC info. 5.<p>
	 *
	 */
	public String usr_info5() {
		return getConstString(offset + 21, $usr_info5);
	}

	/**
	 * 担当者情報５. PIC info. 5.<p>
	 *
	 */
	public void usr_info5(String value) {
		setConstString(offset + 21, $usr_info5, value);
	}

	/**
	 * 担当者情報６. PIC info. 6.<p>
	 *
	 */
	public String usr_info6() {
		return getConstString(offset + 22, $usr_info6);
	}

	/**
	 * 担当者情報６. PIC info. 6.<p>
	 *
	 */
	public void usr_info6(String value) {
		setConstString(offset + 22, $usr_info6, value);
	}

	/**
	 * 担当者情報７. PIC info. 7.<p>
	 *
	 */
	public String usr_info7() {
		return getConstString(offset + 23, $usr_info7);
	}

	/**
	 * 担当者情報７. PIC info. 7.<p>
	 *
	 */
	public void usr_info7(String value) {
		setConstString(offset + 23, $usr_info7, value);
	}

	/**
	 * 担当者情報８. PIC info. 8.<p>
	 *
	 */
	public String usr_info8() {
		return getConstString(offset + 24, $usr_info8);
	}

	/**
	 * 担当者情報８. PIC info. 8.<p>
	 *
	 */
	public void usr_info8(String value) {
		setConstString(offset + 24, $usr_info8, value);
	}

	/**
	 * 担当者情報９. PIC info. 9.<p>
	 *
	 */
	public String usr_info9() {
		return getConstString(offset + 25, $usr_info9);
	}

	/**
	 * 担当者情報９. PIC info. 9.<p>
	 *
	 */
	public void usr_info9(String value) {
		setConstString(offset + 25, $usr_info9, value);
	}

	/**
	 * 担当者情報１０. PIC info. 10.<p>
	 *
	 */
	public String usr_info10() {
		return getConstString(offset + 26, $usr_info10);
	}

	/**
	 * 担当者情報１０. PIC info. 10.<p>
	 *
	 */
	public void usr_info10(String value) {
		setConstString(offset + 26, $usr_info10, value);
	}

	/**
	 * 担当者情報１１. PIC info. 11.<p>
	 *
	 */
	public String usr_info11() {
		return getConstString(offset + 27, $usr_info11);
	}

	/**
	 * 担当者情報１１. PIC info. 11.<p>
	 *
	 */
	public void usr_info11(String value) {
		setConstString(offset + 27, $usr_info11, value);
	}

	/**
	 * 担当者情報１２. PIC info. 12.<p>
	 *
	 */
	public String usr_info12() {
		return getConstString(offset + 28, $usr_info12);
	}

	/**
	 * 担当者情報１２. PIC info. 12.<p>
	 *
	 */
	public void usr_info12(String value) {
		setConstString(offset + 28, $usr_info12, value);
	}

	/**
	 * 担当者情報１３. PIC info. 13.<p>
	 *
	 */
	public String usr_info13() {
		return getConstString(offset + 29, $usr_info13);
	}

	/**
	 * 担当者情報１３. PIC info. 13.<p>
	 *
	 */
	public void usr_info13(String value) {
		setConstString(offset + 29, $usr_info13, value);
	}

	/**
	 * 担当者情報１４. PIC info. 14.<p>
	 *
	 */
	public String usr_info14() {
		return getConstString(offset + 30, $usr_info14);
	}

	/**
	 * 担当者情報１４. PIC info. 14.<p>
	 *
	 */
	public void usr_info14(String value) {
		setConstString(offset + 30, $usr_info14, value);
	}

	/**
	 * 担当者情報１５. PIC info. 15.<p>
	 *
	 */
	public String usr_info15() {
		return getConstString(offset + 31, $usr_info15);
	}

	/**
	 * 担当者情報１５. PIC info. 15.<p>
	 *
	 */
	public void usr_info15(String value) {
		setConstString(offset + 31, $usr_info15, value);
	}

	/**
	 * 担当者情報１６. PIC info. 16.<p>
	 *
	 */
	public String usr_info16() {
		return getConstString(offset + 32, $usr_info16);
	}

	/**
	 * 担当者情報１６. PIC info. 16.<p>
	 *
	 */
	public void usr_info16(String value) {
		setConstString(offset + 32, $usr_info16, value);
	}

	/**
	 * 担当者情報１７. PIC info. 17.<p>
	 *
	 */
	public String usr_info17() {
		return getConstString(offset + 33, $usr_info17);
	}

	/**
	 * 担当者情報１７. PIC info. 17.<p>
	 *
	 */
	public void usr_info17(String value) {
		setConstString(offset + 33, $usr_info17, value);
	}

	/**
	 * 担当者情報１８. PIC info. 18.<p>
	 *
	 */
	public String usr_info18() {
		return getConstString(offset + 34, $usr_info18);
	}

	/**
	 * 担当者情報１８. PIC info. 18.<p>
	 *
	 */
	public void usr_info18(String value) {
		setConstString(offset + 34, $usr_info18, value);
	}

	/**
	 * 担当者情報１９. PIC info. 19.<p>
	 *
	 */
	public String usr_info19() {
		return getConstString(offset + 35, $usr_info19);
	}

	/**
	 * 担当者情報１９. PIC info. 19.<p>
	 *
	 */
	public void usr_info19(String value) {
		setConstString(offset + 35, $usr_info19, value);
	}

	/**
	 * 担当者情報２０. PIC info. 20.<p>
	 *
	 */
	public String usr_info20() {
		return getConstString(offset + 36, $usr_info20);
	}

	/**
	 * 担当者情報２０. PIC info. 20.<p>
	 *
	 */
	public void usr_info20(String value) {
		setConstString(offset + 36, $usr_info20, value);
	}

	/**
	 * メモ１. Memo 1.<p>
	 *
	 */
	public String memo1() {
		return getConstString(offset + 37, $memo1);
	}

	/**
	 * メモ１. Memo 1.<p>
	 *
	 */
	public void memo1(String value) {
		setConstString(offset + 37, $memo1, value);
	}

	/**
	 * メモ２. Memo 2.<p>
	 *
	 */
	public String memo2() {
		return getConstString(offset + 38, $memo2);
	}

	/**
	 * メモ２. Memo 2.<p>
	 *
	 */
	public void memo2(String value) {
		setConstString(offset + 38, $memo2, value);
	}

	/**
	 * メモ３. Memo 3.<p>
	 *
	 */
	public String memo3() {
		return getConstString(offset + 39, $memo3);
	}

	/**
	 * メモ３. Memo 3.<p>
	 *
	 */
	public void memo3(String value) {
		setConstString(offset + 39, $memo3, value);
	}

	/**
	 * 論理削除ＦＬＧ. Logical delete flg..<p>
	 *
	 */
	public boolean del_flg() {
		return getConstBoolean(offset + 40, $del_flg);
	}

	/**
	 * 論理削除ＦＬＧ. Logical delete flg..<p>
	 *
	 */
	public void del_flg(boolean value) {
		setConstBoolean(offset + 40, $del_flg, value);
	}

	/**
	 * 論理削除ユーザＩＤ. Logical delete user ID.<p>
	 *
	 */
	public String del_usr_id() {
		return getConstString(offset + 41, $del_usr_id);
	}

	/**
	 * 論理削除ユーザＩＤ. Logical delete user ID.<p>
	 *
	 */
	public void del_usr_id(String value) {
		setConstString(offset + 41, $del_usr_id, value);
	}

	/**
	 * 論理削除ユーザ名. Logical delete user name.<p>
	 *
	 */
	public String del_usr_nm() {
		return getConstString(offset + 42, $del_usr_nm);
	}

	/**
	 * 論理削除ユーザ名. Logical delete user name.<p>
	 *
	 */
	public void del_usr_nm(String value) {
		setConstString(offset + 42, $del_usr_nm, value);
	}

	/**
	 * 論理削除日時. Logical delete date and time.<p>
	 *
	 */
	public MCTimestamp del_ts() {
		return getConstTimestamp(offset + 43, $del_ts);
	}

	/**
	 * 論理削除日時. Logical delete date and time.<p>
	 *
	 */
	public void del_ts(MCTimestamp value) {
		setConstTimestamp(offset + 43, $del_ts, value);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 44, $ins_usr_id);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 44, $ins_usr_id, value);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 45, $ins_usr_nm);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 45, $ins_usr_nm, value);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 46, $ins_ts);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 46, $ins_ts, value);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 47, $ins_func_id);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 47, $ins_func_id, value);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 48, $upd_cntr);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 48, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 48, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 48, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 48, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 48, $upd_cntr, value);
	}
	
	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 49, $upd_usr_id);
	}

	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 49, $upd_usr_id, value);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 50, $upd_usr_nm);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 50, $upd_usr_nm, value);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 51, $upd_ts);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 51, $upd_ts, value);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 52, $upd_func_id);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 52, $upd_func_id, value);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 53, $upd_srv_req_no);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 53, $upd_srv_req_no, value);
	}

	/**
	 * 会社ＣＤ. Company cd..<p>
	 *
	 */
	public String co_cd() {
		return getConstString(offset + 54, $co_cd);
	}

	/**
	 * 会社ＣＤ. Company cd..<p>
	 *
	 */
	public void co_cd(String value) {
		setConstString(offset + 54, $co_cd, value);
	}

	public String getString(String name) {
		if ($usr_cd.equalsIgnoreCase(name)) {
			return usr_cd();
		}
		if ($usr_nm.equalsIgnoreCase(name)) {
			return usr_nm();
		}
		if ($usr_alt_nm1.equalsIgnoreCase(name)) {
			return usr_alt_nm1();
		}
		if ($usr_alt_nm2.equalsIgnoreCase(name)) {
			return usr_alt_nm2();
		}
		if ($usr_alt_nm3.equalsIgnoreCase(name)) {
			return usr_alt_nm3();
		}
		if ($usr_alt_nm4.equalsIgnoreCase(name)) {
			return usr_alt_nm4();
		}
		if ($email1.equalsIgnoreCase(name)) {
			return email1();
		}
		if ($email2.equalsIgnoreCase(name)) {
			return email2();
		}
		if ($email3.equalsIgnoreCase(name)) {
			return email3();
		}
		if ($tel1.equalsIgnoreCase(name)) {
			return tel1();
		}
		if ($tel2.equalsIgnoreCase(name)) {
			return tel2();
		}
		if ($tel3.equalsIgnoreCase(name)) {
			return tel3();
		}
		if ($usr_com_typ.equalsIgnoreCase(name)) {
			return usr_com_typ();
		}
		if ($usr_com.equalsIgnoreCase(name)) {
			return usr_com();
		}
		if ($wk_cost_cd.equalsIgnoreCase(name)) {
			return wk_cost_cd();
		}
		if ($usr_info1.equalsIgnoreCase(name)) {
			return usr_info1();
		}
		if ($usr_info2.equalsIgnoreCase(name)) {
			return usr_info2();
		}
		if ($usr_info3.equalsIgnoreCase(name)) {
			return usr_info3();
		}
		if ($usr_info4.equalsIgnoreCase(name)) {
			return usr_info4();
		}
		if ($usr_info5.equalsIgnoreCase(name)) {
			return usr_info5();
		}
		if ($usr_info6.equalsIgnoreCase(name)) {
			return usr_info6();
		}
		if ($usr_info7.equalsIgnoreCase(name)) {
			return usr_info7();
		}
		if ($usr_info8.equalsIgnoreCase(name)) {
			return usr_info8();
		}
		if ($usr_info9.equalsIgnoreCase(name)) {
			return usr_info9();
		}
		if ($usr_info10.equalsIgnoreCase(name)) {
			return usr_info10();
		}
		if ($usr_info11.equalsIgnoreCase(name)) {
			return usr_info11();
		}
		if ($usr_info12.equalsIgnoreCase(name)) {
			return usr_info12();
		}
		if ($usr_info13.equalsIgnoreCase(name)) {
			return usr_info13();
		}
		if ($usr_info14.equalsIgnoreCase(name)) {
			return usr_info14();
		}
		if ($usr_info15.equalsIgnoreCase(name)) {
			return usr_info15();
		}
		if ($usr_info16.equalsIgnoreCase(name)) {
			return usr_info16();
		}
		if ($usr_info17.equalsIgnoreCase(name)) {
			return usr_info17();
		}
		if ($usr_info18.equalsIgnoreCase(name)) {
			return usr_info18();
		}
		if ($usr_info19.equalsIgnoreCase(name)) {
			return usr_info19();
		}
		if ($usr_info20.equalsIgnoreCase(name)) {
			return usr_info20();
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
		if ($co_cd.equalsIgnoreCase(name)) {
			return co_cd();
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
		if ($full_da_flg.equalsIgnoreCase(name)) {
			return full_da_flg();
		}
		if ($del_flg.equalsIgnoreCase(name)) {
			return del_flg();
		}
		return super.getBoolean(name);
	}

	public MCBinary getBinary(String name) {
		if ($th_image.equalsIgnoreCase(name)) {
			return th_image();
		}
		return super.getBinary(name);
	}

	public String getStringNE(String name) {
		if ($usr_cd.equalsIgnoreCase(name)) {
			return usr_cd();
		}
		if ($usr_nm.equalsIgnoreCase(name)) {
			return usr_nm();
		}
		if ($usr_alt_nm1.equalsIgnoreCase(name)) {
			return usr_alt_nm1();
		}
		if ($usr_alt_nm2.equalsIgnoreCase(name)) {
			return usr_alt_nm2();
		}
		if ($usr_alt_nm3.equalsIgnoreCase(name)) {
			return usr_alt_nm3();
		}
		if ($usr_alt_nm4.equalsIgnoreCase(name)) {
			return usr_alt_nm4();
		}
		if ($email1.equalsIgnoreCase(name)) {
			return email1();
		}
		if ($email2.equalsIgnoreCase(name)) {
			return email2();
		}
		if ($email3.equalsIgnoreCase(name)) {
			return email3();
		}
		if ($tel1.equalsIgnoreCase(name)) {
			return tel1();
		}
		if ($tel2.equalsIgnoreCase(name)) {
			return tel2();
		}
		if ($tel3.equalsIgnoreCase(name)) {
			return tel3();
		}
		if ($usr_com_typ.equalsIgnoreCase(name)) {
			return usr_com_typ();
		}
		if ($usr_com.equalsIgnoreCase(name)) {
			return usr_com();
		}
		if ($wk_cost_cd.equalsIgnoreCase(name)) {
			return wk_cost_cd();
		}
		if ($usr_info1.equalsIgnoreCase(name)) {
			return usr_info1();
		}
		if ($usr_info2.equalsIgnoreCase(name)) {
			return usr_info2();
		}
		if ($usr_info3.equalsIgnoreCase(name)) {
			return usr_info3();
		}
		if ($usr_info4.equalsIgnoreCase(name)) {
			return usr_info4();
		}
		if ($usr_info5.equalsIgnoreCase(name)) {
			return usr_info5();
		}
		if ($usr_info6.equalsIgnoreCase(name)) {
			return usr_info6();
		}
		if ($usr_info7.equalsIgnoreCase(name)) {
			return usr_info7();
		}
		if ($usr_info8.equalsIgnoreCase(name)) {
			return usr_info8();
		}
		if ($usr_info9.equalsIgnoreCase(name)) {
			return usr_info9();
		}
		if ($usr_info10.equalsIgnoreCase(name)) {
			return usr_info10();
		}
		if ($usr_info11.equalsIgnoreCase(name)) {
			return usr_info11();
		}
		if ($usr_info12.equalsIgnoreCase(name)) {
			return usr_info12();
		}
		if ($usr_info13.equalsIgnoreCase(name)) {
			return usr_info13();
		}
		if ($usr_info14.equalsIgnoreCase(name)) {
			return usr_info14();
		}
		if ($usr_info15.equalsIgnoreCase(name)) {
			return usr_info15();
		}
		if ($usr_info16.equalsIgnoreCase(name)) {
			return usr_info16();
		}
		if ($usr_info17.equalsIgnoreCase(name)) {
			return usr_info17();
		}
		if ($usr_info18.equalsIgnoreCase(name)) {
			return usr_info18();
		}
		if ($usr_info19.equalsIgnoreCase(name)) {
			return usr_info19();
		}
		if ($usr_info20.equalsIgnoreCase(name)) {
			return usr_info20();
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
		if ($co_cd.equalsIgnoreCase(name)) {
			return co_cd();
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
		if ($full_da_flg.equalsIgnoreCase(name)) {
			return full_da_flg();
		}
		if ($del_flg.equalsIgnoreCase(name)) {
			return del_flg();
		}
		return super.getBooleanNE(name);
	}

	public MCBinary getBinaryNE(String name) {
		if ($th_image.equalsIgnoreCase(name)) {
			return th_image();
		}
		return super.getBinaryNE(name);
	}

	public void setString(String name, String value) {
		if ($usr_cd.equalsIgnoreCase(name)) {
			usr_cd(value);
			return;
		}
		if ($usr_nm.equalsIgnoreCase(name)) {
			usr_nm(value);
			return;
		}
		if ($usr_alt_nm1.equalsIgnoreCase(name)) {
			usr_alt_nm1(value);
			return;
		}
		if ($usr_alt_nm2.equalsIgnoreCase(name)) {
			usr_alt_nm2(value);
			return;
		}
		if ($usr_alt_nm3.equalsIgnoreCase(name)) {
			usr_alt_nm3(value);
			return;
		}
		if ($usr_alt_nm4.equalsIgnoreCase(name)) {
			usr_alt_nm4(value);
			return;
		}
		if ($email1.equalsIgnoreCase(name)) {
			email1(value);
			return;
		}
		if ($email2.equalsIgnoreCase(name)) {
			email2(value);
			return;
		}
		if ($email3.equalsIgnoreCase(name)) {
			email3(value);
			return;
		}
		if ($tel1.equalsIgnoreCase(name)) {
			tel1(value);
			return;
		}
		if ($tel2.equalsIgnoreCase(name)) {
			tel2(value);
			return;
		}
		if ($tel3.equalsIgnoreCase(name)) {
			tel3(value);
			return;
		}
		if ($usr_com_typ.equalsIgnoreCase(name)) {
			usr_com_typ(value);
			return;
		}
		if ($usr_com.equalsIgnoreCase(name)) {
			usr_com(value);
			return;
		}
		if ($wk_cost_cd.equalsIgnoreCase(name)) {
			wk_cost_cd(value);
			return;
		}
		if ($usr_info1.equalsIgnoreCase(name)) {
			usr_info1(value);
			return;
		}
		if ($usr_info2.equalsIgnoreCase(name)) {
			usr_info2(value);
			return;
		}
		if ($usr_info3.equalsIgnoreCase(name)) {
			usr_info3(value);
			return;
		}
		if ($usr_info4.equalsIgnoreCase(name)) {
			usr_info4(value);
			return;
		}
		if ($usr_info5.equalsIgnoreCase(name)) {
			usr_info5(value);
			return;
		}
		if ($usr_info6.equalsIgnoreCase(name)) {
			usr_info6(value);
			return;
		}
		if ($usr_info7.equalsIgnoreCase(name)) {
			usr_info7(value);
			return;
		}
		if ($usr_info8.equalsIgnoreCase(name)) {
			usr_info8(value);
			return;
		}
		if ($usr_info9.equalsIgnoreCase(name)) {
			usr_info9(value);
			return;
		}
		if ($usr_info10.equalsIgnoreCase(name)) {
			usr_info10(value);
			return;
		}
		if ($usr_info11.equalsIgnoreCase(name)) {
			usr_info11(value);
			return;
		}
		if ($usr_info12.equalsIgnoreCase(name)) {
			usr_info12(value);
			return;
		}
		if ($usr_info13.equalsIgnoreCase(name)) {
			usr_info13(value);
			return;
		}
		if ($usr_info14.equalsIgnoreCase(name)) {
			usr_info14(value);
			return;
		}
		if ($usr_info15.equalsIgnoreCase(name)) {
			usr_info15(value);
			return;
		}
		if ($usr_info16.equalsIgnoreCase(name)) {
			usr_info16(value);
			return;
		}
		if ($usr_info17.equalsIgnoreCase(name)) {
			usr_info17(value);
			return;
		}
		if ($usr_info18.equalsIgnoreCase(name)) {
			usr_info18(value);
			return;
		}
		if ($usr_info19.equalsIgnoreCase(name)) {
			usr_info19(value);
			return;
		}
		if ($usr_info20.equalsIgnoreCase(name)) {
			usr_info20(value);
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
		if ($co_cd.equalsIgnoreCase(name)) {
			co_cd(value);
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
		if ($full_da_flg.equalsIgnoreCase(name)) {
			full_da_flg(value);
			return;
		}
		if ($del_flg.equalsIgnoreCase(name)) {
			del_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setBinary(String name, MCBinary value) {
		if ($th_image.equalsIgnoreCase(name)) {
			th_image(value);
			return;
		}
		super.setBinary(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($usr_cd.equalsIgnoreCase(name)) {
			usr_cd(value);
			return;
		}
		if ($usr_nm.equalsIgnoreCase(name)) {
			usr_nm(value);
			return;
		}
		if ($usr_alt_nm1.equalsIgnoreCase(name)) {
			usr_alt_nm1(value);
			return;
		}
		if ($usr_alt_nm2.equalsIgnoreCase(name)) {
			usr_alt_nm2(value);
			return;
		}
		if ($usr_alt_nm3.equalsIgnoreCase(name)) {
			usr_alt_nm3(value);
			return;
		}
		if ($usr_alt_nm4.equalsIgnoreCase(name)) {
			usr_alt_nm4(value);
			return;
		}
		if ($email1.equalsIgnoreCase(name)) {
			email1(value);
			return;
		}
		if ($email2.equalsIgnoreCase(name)) {
			email2(value);
			return;
		}
		if ($email3.equalsIgnoreCase(name)) {
			email3(value);
			return;
		}
		if ($tel1.equalsIgnoreCase(name)) {
			tel1(value);
			return;
		}
		if ($tel2.equalsIgnoreCase(name)) {
			tel2(value);
			return;
		}
		if ($tel3.equalsIgnoreCase(name)) {
			tel3(value);
			return;
		}
		if ($usr_com_typ.equalsIgnoreCase(name)) {
			usr_com_typ(value);
			return;
		}
		if ($usr_com.equalsIgnoreCase(name)) {
			usr_com(value);
			return;
		}
		if ($wk_cost_cd.equalsIgnoreCase(name)) {
			wk_cost_cd(value);
			return;
		}
		if ($usr_info1.equalsIgnoreCase(name)) {
			usr_info1(value);
			return;
		}
		if ($usr_info2.equalsIgnoreCase(name)) {
			usr_info2(value);
			return;
		}
		if ($usr_info3.equalsIgnoreCase(name)) {
			usr_info3(value);
			return;
		}
		if ($usr_info4.equalsIgnoreCase(name)) {
			usr_info4(value);
			return;
		}
		if ($usr_info5.equalsIgnoreCase(name)) {
			usr_info5(value);
			return;
		}
		if ($usr_info6.equalsIgnoreCase(name)) {
			usr_info6(value);
			return;
		}
		if ($usr_info7.equalsIgnoreCase(name)) {
			usr_info7(value);
			return;
		}
		if ($usr_info8.equalsIgnoreCase(name)) {
			usr_info8(value);
			return;
		}
		if ($usr_info9.equalsIgnoreCase(name)) {
			usr_info9(value);
			return;
		}
		if ($usr_info10.equalsIgnoreCase(name)) {
			usr_info10(value);
			return;
		}
		if ($usr_info11.equalsIgnoreCase(name)) {
			usr_info11(value);
			return;
		}
		if ($usr_info12.equalsIgnoreCase(name)) {
			usr_info12(value);
			return;
		}
		if ($usr_info13.equalsIgnoreCase(name)) {
			usr_info13(value);
			return;
		}
		if ($usr_info14.equalsIgnoreCase(name)) {
			usr_info14(value);
			return;
		}
		if ($usr_info15.equalsIgnoreCase(name)) {
			usr_info15(value);
			return;
		}
		if ($usr_info16.equalsIgnoreCase(name)) {
			usr_info16(value);
			return;
		}
		if ($usr_info17.equalsIgnoreCase(name)) {
			usr_info17(value);
			return;
		}
		if ($usr_info18.equalsIgnoreCase(name)) {
			usr_info18(value);
			return;
		}
		if ($usr_info19.equalsIgnoreCase(name)) {
			usr_info19(value);
			return;
		}
		if ($usr_info20.equalsIgnoreCase(name)) {
			usr_info20(value);
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
		if ($co_cd.equalsIgnoreCase(name)) {
			co_cd(value);
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
		if ($full_da_flg.equalsIgnoreCase(name)) {
			full_da_flg(value);
			return;
		}
		if ($del_flg.equalsIgnoreCase(name)) {
			del_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

	public void setBinaryNE(String name, MCBinary value) {
		if ($th_image.equalsIgnoreCase(name)) {
			th_image(value);
			return;
		}
		super.setBinaryNE(name, value);
	}

}
