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
 * "帳票ファイル名称マスタ // Report file name master"DBコンテナRowクラスです。<p>
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
 *  	<td>biz_typ</td>
 *  	<td>C</td>
 *  	<td>2</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>業務区分</td>
 *  	<td>Business type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>rpt_nm_elm_typ1</td>
 *  	<td>C</td>
 *  	<td>3</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ファイル名称要素区分１</td>
 *  	<td>File name element type 1</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>rpt_nm_elm_typ2</td>
 *  	<td>C</td>
 *  	<td>3</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ファイル名称要素区分２</td>
 *  	<td>File name element type 2</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>rpt_nm_elm_typ3</td>
 *  	<td>C</td>
 *  	<td>3</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ファイル名称要素区分３</td>
 *  	<td>File name element type 3</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>rpt_nm_elm_typ4</td>
 *  	<td>C</td>
 *  	<td>3</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ファイル名称要素区分４</td>
 *  	<td>File name element type 4</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>rpt_nm_elm_typ5</td>
 *  	<td>C</td>
 *  	<td>3</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ファイル名称要素区分５</td>
 *  	<td>File name element type 5</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>rpt_nm_elm_typ6</td>
 *  	<td>C</td>
 *  	<td>3</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ファイル名称要素区分６</td>
 *  	<td>File name element type 6</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>rpt_nm_elm_typ7</td>
 *  	<td>C</td>
 *  	<td>3</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ファイル名称要素区分７</td>
 *  	<td>File name element type 7</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>rpt_nm_elm_typ8</td>
 *  	<td>C</td>
 *  	<td>3</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ファイル名称要素区分８</td>
 *  	<td>File name element type 8</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>rpt_nm_elm_typ9</td>
 *  	<td>C</td>
 *  	<td>3</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ファイル名称要素区分９</td>
 *  	<td>File name element type 9</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>rpt_nm_elm_typ10</td>
 *  	<td>C</td>
 *  	<td>3</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ファイル名称要素区分１０</td>
 *  	<td>File name element type 10</td>
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
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
public class MAM_REPORT_FILE_NM_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.CO_VIEW;

	public static final String TABLE_NAME = "MAM_REPORT_FILE_NM";

	public static final boolean EX_CTRL = true;
	
	public static final boolean LCL_TABLE = false;
	
	/**
	 * 業務区分. Business type.<p>
	 *
	 */
	public static final String $biz_typ = "biz_typ";
	private static final MCPermColumnInfo _biz_typ = createColumnInfo("biz_typ");
	public final MCStringPermColumn biz_typ = createStringColumn(_biz_typ);
	
	/**
	 * ファイル名称要素区分１. File name element type 1.<p>
	 *
	 */
	public static final String $rpt_nm_elm_typ1 = "rpt_nm_elm_typ1";
	private static final MCPermColumnInfo _rpt_nm_elm_typ1 = createColumnInfo("rpt_nm_elm_typ1");
	public final MCStringPermColumn rpt_nm_elm_typ1 = createStringColumn(_rpt_nm_elm_typ1);
	
	/**
	 * ファイル名称要素区分２. File name element type 2.<p>
	 *
	 */
	public static final String $rpt_nm_elm_typ2 = "rpt_nm_elm_typ2";
	private static final MCPermColumnInfo _rpt_nm_elm_typ2 = createColumnInfo("rpt_nm_elm_typ2");
	public final MCStringPermColumn rpt_nm_elm_typ2 = createStringColumn(_rpt_nm_elm_typ2);
	
	/**
	 * ファイル名称要素区分３. File name element type 3.<p>
	 *
	 */
	public static final String $rpt_nm_elm_typ3 = "rpt_nm_elm_typ3";
	private static final MCPermColumnInfo _rpt_nm_elm_typ3 = createColumnInfo("rpt_nm_elm_typ3");
	public final MCStringPermColumn rpt_nm_elm_typ3 = createStringColumn(_rpt_nm_elm_typ3);
	
	/**
	 * ファイル名称要素区分４. File name element type 4.<p>
	 *
	 */
	public static final String $rpt_nm_elm_typ4 = "rpt_nm_elm_typ4";
	private static final MCPermColumnInfo _rpt_nm_elm_typ4 = createColumnInfo("rpt_nm_elm_typ4");
	public final MCStringPermColumn rpt_nm_elm_typ4 = createStringColumn(_rpt_nm_elm_typ4);
	
	/**
	 * ファイル名称要素区分５. File name element type 5.<p>
	 *
	 */
	public static final String $rpt_nm_elm_typ5 = "rpt_nm_elm_typ5";
	private static final MCPermColumnInfo _rpt_nm_elm_typ5 = createColumnInfo("rpt_nm_elm_typ5");
	public final MCStringPermColumn rpt_nm_elm_typ5 = createStringColumn(_rpt_nm_elm_typ5);
	
	/**
	 * ファイル名称要素区分６. File name element type 6.<p>
	 *
	 */
	public static final String $rpt_nm_elm_typ6 = "rpt_nm_elm_typ6";
	private static final MCPermColumnInfo _rpt_nm_elm_typ6 = createColumnInfo("rpt_nm_elm_typ6");
	public final MCStringPermColumn rpt_nm_elm_typ6 = createStringColumn(_rpt_nm_elm_typ6);
	
	/**
	 * ファイル名称要素区分７. File name element type 7.<p>
	 *
	 */
	public static final String $rpt_nm_elm_typ7 = "rpt_nm_elm_typ7";
	private static final MCPermColumnInfo _rpt_nm_elm_typ7 = createColumnInfo("rpt_nm_elm_typ7");
	public final MCStringPermColumn rpt_nm_elm_typ7 = createStringColumn(_rpt_nm_elm_typ7);
	
	/**
	 * ファイル名称要素区分８. File name element type 8.<p>
	 *
	 */
	public static final String $rpt_nm_elm_typ8 = "rpt_nm_elm_typ8";
	private static final MCPermColumnInfo _rpt_nm_elm_typ8 = createColumnInfo("rpt_nm_elm_typ8");
	public final MCStringPermColumn rpt_nm_elm_typ8 = createStringColumn(_rpt_nm_elm_typ8);
	
	/**
	 * ファイル名称要素区分９. File name element type 9.<p>
	 *
	 */
	public static final String $rpt_nm_elm_typ9 = "rpt_nm_elm_typ9";
	private static final MCPermColumnInfo _rpt_nm_elm_typ9 = createColumnInfo("rpt_nm_elm_typ9");
	public final MCStringPermColumn rpt_nm_elm_typ9 = createStringColumn(_rpt_nm_elm_typ9);
	
	/**
	 * ファイル名称要素区分１０. File name element type 10.<p>
	 *
	 */
	public static final String $rpt_nm_elm_typ10 = "rpt_nm_elm_typ10";
	private static final MCPermColumnInfo _rpt_nm_elm_typ10 = createColumnInfo("rpt_nm_elm_typ10");
	public final MCStringPermColumn rpt_nm_elm_typ10 = createStringColumn(_rpt_nm_elm_typ10);
	
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
	
	public static final MCMeta biz_typ_META = createCommonMeta($biz_typ, mcframe.commonMA.meta.MA_META.BIZ_TYP);
	public static final MCMeta rpt_nm_elm_typ1_META = createCommonMeta($rpt_nm_elm_typ1, mcframe.commonMA.meta.MA_META.RPT_NM_ELM_TYP);
	public static final MCMeta rpt_nm_elm_typ2_META = createCommonMeta($rpt_nm_elm_typ2, mcframe.commonMA.meta.MA_META.RPT_NM_ELM_TYP);
	public static final MCMeta rpt_nm_elm_typ3_META = createCommonMeta($rpt_nm_elm_typ3, mcframe.commonMA.meta.MA_META.RPT_NM_ELM_TYP);
	public static final MCMeta rpt_nm_elm_typ4_META = createCommonMeta($rpt_nm_elm_typ4, mcframe.commonMA.meta.MA_META.RPT_NM_ELM_TYP);
	public static final MCMeta rpt_nm_elm_typ5_META = createCommonMeta($rpt_nm_elm_typ5, mcframe.commonMA.meta.MA_META.RPT_NM_ELM_TYP);
	public static final MCMeta rpt_nm_elm_typ6_META = createCommonMeta($rpt_nm_elm_typ6, mcframe.commonMA.meta.MA_META.RPT_NM_ELM_TYP);
	public static final MCMeta rpt_nm_elm_typ7_META = createCommonMeta($rpt_nm_elm_typ7, mcframe.commonMA.meta.MA_META.RPT_NM_ELM_TYP);
	public static final MCMeta rpt_nm_elm_typ8_META = createCommonMeta($rpt_nm_elm_typ8, mcframe.commonMA.meta.MA_META.RPT_NM_ELM_TYP);
	public static final MCMeta rpt_nm_elm_typ9_META = createCommonMeta($rpt_nm_elm_typ9, mcframe.commonMA.meta.MA_META.RPT_NM_ELM_TYP);
	public static final MCMeta rpt_nm_elm_typ10_META = createCommonMeta($rpt_nm_elm_typ10, mcframe.commonMA.meta.MA_META.RPT_NM_ELM_TYP);
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

	protected static final List<MCForeignInfo> FOREIGN_INFO_LIST = new ArrayList<>();
	static {
	}
	
	protected static final ConstMetaList<MAM_REPORT_FILE_NM_R> constMetas = new ConstMetaList<MAM_REPORT_FILE_NM_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			biz_typ_META,
			rpt_nm_elm_typ1_META,
			rpt_nm_elm_typ2_META,
			rpt_nm_elm_typ3_META,
			rpt_nm_elm_typ4_META,
			rpt_nm_elm_typ5_META,
			rpt_nm_elm_typ6_META,
			rpt_nm_elm_typ7_META,
			rpt_nm_elm_typ8_META,
			rpt_nm_elm_typ9_META,
			rpt_nm_elm_typ10_META,
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
	protected MAM_REPORT_FILE_NM_R(ConstMetaList<? extends MAM_REPORT_FILE_NM_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MAM_REPORT_FILE_NM_R(ConstMetaList<? extends MAM_REPORT_FILE_NM_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MAM_REPORT_FILE_NM_R.$biz_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_REPORT_FILE_NM_R.$biz_typ,
				"biz_typ",
				biz_typ,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_REPORT_FILE_NM_R.$rpt_nm_elm_typ1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_REPORT_FILE_NM_R.$rpt_nm_elm_typ1,
				"rpt_nm_elm_typ1",
				rpt_nm_elm_typ1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_REPORT_FILE_NM_R.$rpt_nm_elm_typ2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_REPORT_FILE_NM_R.$rpt_nm_elm_typ2,
				"rpt_nm_elm_typ2",
				rpt_nm_elm_typ2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_REPORT_FILE_NM_R.$rpt_nm_elm_typ3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_REPORT_FILE_NM_R.$rpt_nm_elm_typ3,
				"rpt_nm_elm_typ3",
				rpt_nm_elm_typ3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_REPORT_FILE_NM_R.$rpt_nm_elm_typ4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_REPORT_FILE_NM_R.$rpt_nm_elm_typ4,
				"rpt_nm_elm_typ4",
				rpt_nm_elm_typ4,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_REPORT_FILE_NM_R.$rpt_nm_elm_typ5,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_REPORT_FILE_NM_R.$rpt_nm_elm_typ5,
				"rpt_nm_elm_typ5",
				rpt_nm_elm_typ5,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_REPORT_FILE_NM_R.$rpt_nm_elm_typ6,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_REPORT_FILE_NM_R.$rpt_nm_elm_typ6,
				"rpt_nm_elm_typ6",
				rpt_nm_elm_typ6,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_REPORT_FILE_NM_R.$rpt_nm_elm_typ7,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_REPORT_FILE_NM_R.$rpt_nm_elm_typ7,
				"rpt_nm_elm_typ7",
				rpt_nm_elm_typ7,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_REPORT_FILE_NM_R.$rpt_nm_elm_typ8,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_REPORT_FILE_NM_R.$rpt_nm_elm_typ8,
				"rpt_nm_elm_typ8",
				rpt_nm_elm_typ8,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_REPORT_FILE_NM_R.$rpt_nm_elm_typ9,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_REPORT_FILE_NM_R.$rpt_nm_elm_typ9,
				"rpt_nm_elm_typ9",
				rpt_nm_elm_typ9,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_REPORT_FILE_NM_R.$rpt_nm_elm_typ10,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_REPORT_FILE_NM_R.$rpt_nm_elm_typ10,
				"rpt_nm_elm_typ10",
				rpt_nm_elm_typ10,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_REPORT_FILE_NM_R.$memo1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_REPORT_FILE_NM_R.$memo1,
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
			MAM_REPORT_FILE_NM_R.$memo2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_REPORT_FILE_NM_R.$memo2,
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
			MAM_REPORT_FILE_NM_R.$memo3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_REPORT_FILE_NM_R.$memo3,
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
			MAM_REPORT_FILE_NM_R.$del_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_REPORT_FILE_NM_R.$del_flg,
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
			MAM_REPORT_FILE_NM_R.$del_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_REPORT_FILE_NM_R.$del_usr_id,
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
			MAM_REPORT_FILE_NM_R.$del_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_REPORT_FILE_NM_R.$del_usr_nm,
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
			MAM_REPORT_FILE_NM_R.$del_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MAM_REPORT_FILE_NM_R.$del_ts,
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
			MAM_REPORT_FILE_NM_R.$ins_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_REPORT_FILE_NM_R.$ins_usr_id,
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
			MAM_REPORT_FILE_NM_R.$ins_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_REPORT_FILE_NM_R.$ins_usr_nm,
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
			MAM_REPORT_FILE_NM_R.$ins_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MAM_REPORT_FILE_NM_R.$ins_ts,
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
			MAM_REPORT_FILE_NM_R.$ins_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_REPORT_FILE_NM_R.$ins_func_id,
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
			MAM_REPORT_FILE_NM_R.$upd_cntr,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_REPORT_FILE_NM_R.$upd_cntr,
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
			MAM_REPORT_FILE_NM_R.$upd_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_REPORT_FILE_NM_R.$upd_usr_id,
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
			MAM_REPORT_FILE_NM_R.$upd_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_REPORT_FILE_NM_R.$upd_usr_nm,
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
			MAM_REPORT_FILE_NM_R.$upd_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MAM_REPORT_FILE_NM_R.$upd_ts,
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
			MAM_REPORT_FILE_NM_R.$upd_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_REPORT_FILE_NM_R.$upd_func_id,
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
			MAM_REPORT_FILE_NM_R.$upd_srv_req_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_REPORT_FILE_NM_R.$upd_srv_req_no,
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
	public static MAM_REPORT_FILE_NM_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MAM_REPORT_FILE_NM_R create(String alias) {
		MAM_REPORT_FILE_NM_R row = new MAM_REPORT_FILE_NM_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MAM_REPORT_FILE_NM_R createByName(T proto) {
		MAM_REPORT_FILE_NM_R row = MAM_REPORT_FILE_NM_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAM_REPORT_FILE_NM_R clone() {
		return (MAM_REPORT_FILE_NM_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAM_REPORT_FILE_NM_R createInstance() {
		return (MAM_REPORT_FILE_NM_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAM_REPORT_FILE_NM_R getValues(String... names) {
		return (MAM_REPORT_FILE_NM_R) super.getValues(names);
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
	 public MAW_REPORT_FILE_NM_KEY_R getPkWorkDbc(String alias) {
	 	return MAW_REPORT_FILE_NM_KEY_R.create(alias);
	 }

	/*
	 * MCDBContainerのオーバーライドメソッドです。
	 */
	 public MAW_REPORT_FILE_NM_KEY_R getPkWorkDbc() {
	 	return getPkWorkDbc(MAW_REPORT_FILE_NM_KEY_R.TABLE_NAME);
	 }

	/**
	 * 業務区分. Business type.<p>
	 *
	 */
	public String biz_typ() {
		return getConstString(offset + 0, $biz_typ);
	}

	/**
	 * 業務区分. Business type.<p>
	 *
	 */
	public void biz_typ(String value) {
		setConstString(offset + 0, $biz_typ, value);
	}

	/**
	 * ファイル名称要素区分１. File name element type 1.<p>
	 *
	 */
	public String rpt_nm_elm_typ1() {
		return getConstString(offset + 1, $rpt_nm_elm_typ1);
	}

	/**
	 * ファイル名称要素区分１. File name element type 1.<p>
	 *
	 */
	public void rpt_nm_elm_typ1(String value) {
		setConstString(offset + 1, $rpt_nm_elm_typ1, value);
	}

	/**
	 * ファイル名称要素区分２. File name element type 2.<p>
	 *
	 */
	public String rpt_nm_elm_typ2() {
		return getConstString(offset + 2, $rpt_nm_elm_typ2);
	}

	/**
	 * ファイル名称要素区分２. File name element type 2.<p>
	 *
	 */
	public void rpt_nm_elm_typ2(String value) {
		setConstString(offset + 2, $rpt_nm_elm_typ2, value);
	}

	/**
	 * ファイル名称要素区分３. File name element type 3.<p>
	 *
	 */
	public String rpt_nm_elm_typ3() {
		return getConstString(offset + 3, $rpt_nm_elm_typ3);
	}

	/**
	 * ファイル名称要素区分３. File name element type 3.<p>
	 *
	 */
	public void rpt_nm_elm_typ3(String value) {
		setConstString(offset + 3, $rpt_nm_elm_typ3, value);
	}

	/**
	 * ファイル名称要素区分４. File name element type 4.<p>
	 *
	 */
	public String rpt_nm_elm_typ4() {
		return getConstString(offset + 4, $rpt_nm_elm_typ4);
	}

	/**
	 * ファイル名称要素区分４. File name element type 4.<p>
	 *
	 */
	public void rpt_nm_elm_typ4(String value) {
		setConstString(offset + 4, $rpt_nm_elm_typ4, value);
	}

	/**
	 * ファイル名称要素区分５. File name element type 5.<p>
	 *
	 */
	public String rpt_nm_elm_typ5() {
		return getConstString(offset + 5, $rpt_nm_elm_typ5);
	}

	/**
	 * ファイル名称要素区分５. File name element type 5.<p>
	 *
	 */
	public void rpt_nm_elm_typ5(String value) {
		setConstString(offset + 5, $rpt_nm_elm_typ5, value);
	}

	/**
	 * ファイル名称要素区分６. File name element type 6.<p>
	 *
	 */
	public String rpt_nm_elm_typ6() {
		return getConstString(offset + 6, $rpt_nm_elm_typ6);
	}

	/**
	 * ファイル名称要素区分６. File name element type 6.<p>
	 *
	 */
	public void rpt_nm_elm_typ6(String value) {
		setConstString(offset + 6, $rpt_nm_elm_typ6, value);
	}

	/**
	 * ファイル名称要素区分７. File name element type 7.<p>
	 *
	 */
	public String rpt_nm_elm_typ7() {
		return getConstString(offset + 7, $rpt_nm_elm_typ7);
	}

	/**
	 * ファイル名称要素区分７. File name element type 7.<p>
	 *
	 */
	public void rpt_nm_elm_typ7(String value) {
		setConstString(offset + 7, $rpt_nm_elm_typ7, value);
	}

	/**
	 * ファイル名称要素区分８. File name element type 8.<p>
	 *
	 */
	public String rpt_nm_elm_typ8() {
		return getConstString(offset + 8, $rpt_nm_elm_typ8);
	}

	/**
	 * ファイル名称要素区分８. File name element type 8.<p>
	 *
	 */
	public void rpt_nm_elm_typ8(String value) {
		setConstString(offset + 8, $rpt_nm_elm_typ8, value);
	}

	/**
	 * ファイル名称要素区分９. File name element type 9.<p>
	 *
	 */
	public String rpt_nm_elm_typ9() {
		return getConstString(offset + 9, $rpt_nm_elm_typ9);
	}

	/**
	 * ファイル名称要素区分９. File name element type 9.<p>
	 *
	 */
	public void rpt_nm_elm_typ9(String value) {
		setConstString(offset + 9, $rpt_nm_elm_typ9, value);
	}

	/**
	 * ファイル名称要素区分１０. File name element type 10.<p>
	 *
	 */
	public String rpt_nm_elm_typ10() {
		return getConstString(offset + 10, $rpt_nm_elm_typ10);
	}

	/**
	 * ファイル名称要素区分１０. File name element type 10.<p>
	 *
	 */
	public void rpt_nm_elm_typ10(String value) {
		setConstString(offset + 10, $rpt_nm_elm_typ10, value);
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

	public String getString(String name) {
		if ($biz_typ.equalsIgnoreCase(name)) {
			return biz_typ();
		}
		if ($rpt_nm_elm_typ1.equalsIgnoreCase(name)) {
			return rpt_nm_elm_typ1();
		}
		if ($rpt_nm_elm_typ2.equalsIgnoreCase(name)) {
			return rpt_nm_elm_typ2();
		}
		if ($rpt_nm_elm_typ3.equalsIgnoreCase(name)) {
			return rpt_nm_elm_typ3();
		}
		if ($rpt_nm_elm_typ4.equalsIgnoreCase(name)) {
			return rpt_nm_elm_typ4();
		}
		if ($rpt_nm_elm_typ5.equalsIgnoreCase(name)) {
			return rpt_nm_elm_typ5();
		}
		if ($rpt_nm_elm_typ6.equalsIgnoreCase(name)) {
			return rpt_nm_elm_typ6();
		}
		if ($rpt_nm_elm_typ7.equalsIgnoreCase(name)) {
			return rpt_nm_elm_typ7();
		}
		if ($rpt_nm_elm_typ8.equalsIgnoreCase(name)) {
			return rpt_nm_elm_typ8();
		}
		if ($rpt_nm_elm_typ9.equalsIgnoreCase(name)) {
			return rpt_nm_elm_typ9();
		}
		if ($rpt_nm_elm_typ10.equalsIgnoreCase(name)) {
			return rpt_nm_elm_typ10();
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
		if ($del_flg.equalsIgnoreCase(name)) {
			return del_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($biz_typ.equalsIgnoreCase(name)) {
			return biz_typ();
		}
		if ($rpt_nm_elm_typ1.equalsIgnoreCase(name)) {
			return rpt_nm_elm_typ1();
		}
		if ($rpt_nm_elm_typ2.equalsIgnoreCase(name)) {
			return rpt_nm_elm_typ2();
		}
		if ($rpt_nm_elm_typ3.equalsIgnoreCase(name)) {
			return rpt_nm_elm_typ3();
		}
		if ($rpt_nm_elm_typ4.equalsIgnoreCase(name)) {
			return rpt_nm_elm_typ4();
		}
		if ($rpt_nm_elm_typ5.equalsIgnoreCase(name)) {
			return rpt_nm_elm_typ5();
		}
		if ($rpt_nm_elm_typ6.equalsIgnoreCase(name)) {
			return rpt_nm_elm_typ6();
		}
		if ($rpt_nm_elm_typ7.equalsIgnoreCase(name)) {
			return rpt_nm_elm_typ7();
		}
		if ($rpt_nm_elm_typ8.equalsIgnoreCase(name)) {
			return rpt_nm_elm_typ8();
		}
		if ($rpt_nm_elm_typ9.equalsIgnoreCase(name)) {
			return rpt_nm_elm_typ9();
		}
		if ($rpt_nm_elm_typ10.equalsIgnoreCase(name)) {
			return rpt_nm_elm_typ10();
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
		if ($del_flg.equalsIgnoreCase(name)) {
			return del_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($biz_typ.equalsIgnoreCase(name)) {
			biz_typ(value);
			return;
		}
		if ($rpt_nm_elm_typ1.equalsIgnoreCase(name)) {
			rpt_nm_elm_typ1(value);
			return;
		}
		if ($rpt_nm_elm_typ2.equalsIgnoreCase(name)) {
			rpt_nm_elm_typ2(value);
			return;
		}
		if ($rpt_nm_elm_typ3.equalsIgnoreCase(name)) {
			rpt_nm_elm_typ3(value);
			return;
		}
		if ($rpt_nm_elm_typ4.equalsIgnoreCase(name)) {
			rpt_nm_elm_typ4(value);
			return;
		}
		if ($rpt_nm_elm_typ5.equalsIgnoreCase(name)) {
			rpt_nm_elm_typ5(value);
			return;
		}
		if ($rpt_nm_elm_typ6.equalsIgnoreCase(name)) {
			rpt_nm_elm_typ6(value);
			return;
		}
		if ($rpt_nm_elm_typ7.equalsIgnoreCase(name)) {
			rpt_nm_elm_typ7(value);
			return;
		}
		if ($rpt_nm_elm_typ8.equalsIgnoreCase(name)) {
			rpt_nm_elm_typ8(value);
			return;
		}
		if ($rpt_nm_elm_typ9.equalsIgnoreCase(name)) {
			rpt_nm_elm_typ9(value);
			return;
		}
		if ($rpt_nm_elm_typ10.equalsIgnoreCase(name)) {
			rpt_nm_elm_typ10(value);
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
		if ($del_flg.equalsIgnoreCase(name)) {
			del_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($biz_typ.equalsIgnoreCase(name)) {
			biz_typ(value);
			return;
		}
		if ($rpt_nm_elm_typ1.equalsIgnoreCase(name)) {
			rpt_nm_elm_typ1(value);
			return;
		}
		if ($rpt_nm_elm_typ2.equalsIgnoreCase(name)) {
			rpt_nm_elm_typ2(value);
			return;
		}
		if ($rpt_nm_elm_typ3.equalsIgnoreCase(name)) {
			rpt_nm_elm_typ3(value);
			return;
		}
		if ($rpt_nm_elm_typ4.equalsIgnoreCase(name)) {
			rpt_nm_elm_typ4(value);
			return;
		}
		if ($rpt_nm_elm_typ5.equalsIgnoreCase(name)) {
			rpt_nm_elm_typ5(value);
			return;
		}
		if ($rpt_nm_elm_typ6.equalsIgnoreCase(name)) {
			rpt_nm_elm_typ6(value);
			return;
		}
		if ($rpt_nm_elm_typ7.equalsIgnoreCase(name)) {
			rpt_nm_elm_typ7(value);
			return;
		}
		if ($rpt_nm_elm_typ8.equalsIgnoreCase(name)) {
			rpt_nm_elm_typ8(value);
			return;
		}
		if ($rpt_nm_elm_typ9.equalsIgnoreCase(name)) {
			rpt_nm_elm_typ9(value);
			return;
		}
		if ($rpt_nm_elm_typ10.equalsIgnoreCase(name)) {
			rpt_nm_elm_typ10(value);
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
		if ($del_flg.equalsIgnoreCase(name)) {
			del_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

}
