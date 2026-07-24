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
 * "見積受注理由 // Quotation sales order reason"DBコンテナRowクラスです。<p>
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
 *  	<td>slo_rsn_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>見積受注理由ＣＤ</td>
 *  	<td>Quotation sales order reason cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>slo_rsn_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>見積受注理由名</td>
 *  	<td>Quotation sales order reason name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>qtn_term_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>見積条件ＦＬＧ</td>
 *  	<td>Quotation terms flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>qtn_term_sort_seq</td>
 *  	<td>N</td>
 *  	<td>9,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>見積条件ソート順</td>
 *  	<td>Quotation terms sort order</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>qtn_rslt_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>見積結果ＦＬＧ</td>
 *  	<td>Quotation result flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>qtn_rslt_sort_seq</td>
 *  	<td>N</td>
 *  	<td>9,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>見積結果ソート順</td>
 *  	<td>Quotation result sort order</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>slo_can_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>受注取消ＦＬＧ</td>
 *  	<td>Sales order cancel flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>slo_can_sort_seq</td>
 *  	<td>N</td>
 *  	<td>9,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>受注取消ソート順</td>
 *  	<td>Sales order cancel sort order</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>memo1</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>メモ１</td>
 *  	<td>Memo 1</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>memo2</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>メモ２</td>
 *  	<td>Memo 2</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>memo3</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>メモ３</td>
 *  	<td>Memo 3</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>del_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>論理削除ＦＬＧ</td>
 *  	<td>Logical delete flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>del_usr_id</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>論理削除ユーザＩＤ</td>
 *  	<td>Logical delete user ID</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>del_usr_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>論理削除ユーザ名</td>
 *  	<td>Logical delete user name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>del_ts</td>
 *  	<td>TS</td>
 *  	<td>0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>論理削除日時</td>
 *  	<td>Logical delete date and time</td>
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
public class MST_SLO_RSN_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.CO_VIEW;

	public static final String TABLE_NAME = "MST_SLO_RSN";

	public static final boolean EX_CTRL = true;
	
	public static final boolean LCL_TABLE = false;
	
	/**
	 * 見積受注理由ＣＤ. Quotation sales order reason cd..<p>
	 *
	 */
	public static final String $slo_rsn_cd = "slo_rsn_cd";
	private static final MCPermColumnInfo _slo_rsn_cd = createColumnInfo("slo_rsn_cd");
	public final MCStringPermColumn slo_rsn_cd = createStringColumn(_slo_rsn_cd);
	
	/**
	 * 見積受注理由名. Quotation sales order reason name.<p>
	 *
	 */
	public static final String $slo_rsn_nm = "slo_rsn_nm";
	private static final MCPermColumnInfo _slo_rsn_nm = createColumnInfo("slo_rsn_nm");
	public final MCStringPermColumn slo_rsn_nm = createStringColumn(_slo_rsn_nm);
	
	/**
	 * 見積条件ＦＬＧ. Quotation terms flg..<p>
	 *
	 */
	public static final String $qtn_term_flg = "qtn_term_flg";
	private static final MCPermColumnInfo _qtn_term_flg = createColumnInfo("qtn_term_flg");
	public final MCBooleanPermColumn qtn_term_flg = createBooleanColumn(_qtn_term_flg);
	
	/**
	 * 見積条件ソート順. Quotation terms sort order.<p>
	 *
	 */
	public static final String $qtn_term_sort_seq = "qtn_term_sort_seq";
	private static final MCPermColumnInfo _qtn_term_sort_seq = createColumnInfo("qtn_term_sort_seq");
	public final MCNumberPermColumn qtn_term_sort_seq = createNumberColumn(_qtn_term_sort_seq);
	
	/**
	 * 見積結果ＦＬＧ. Quotation result flg..<p>
	 *
	 */
	public static final String $qtn_rslt_flg = "qtn_rslt_flg";
	private static final MCPermColumnInfo _qtn_rslt_flg = createColumnInfo("qtn_rslt_flg");
	public final MCBooleanPermColumn qtn_rslt_flg = createBooleanColumn(_qtn_rslt_flg);
	
	/**
	 * 見積結果ソート順. Quotation result sort order.<p>
	 *
	 */
	public static final String $qtn_rslt_sort_seq = "qtn_rslt_sort_seq";
	private static final MCPermColumnInfo _qtn_rslt_sort_seq = createColumnInfo("qtn_rslt_sort_seq");
	public final MCNumberPermColumn qtn_rslt_sort_seq = createNumberColumn(_qtn_rslt_sort_seq);
	
	/**
	 * 受注取消ＦＬＧ. Sales order cancel flg..<p>
	 *
	 */
	public static final String $slo_can_flg = "slo_can_flg";
	private static final MCPermColumnInfo _slo_can_flg = createColumnInfo("slo_can_flg");
	public final MCBooleanPermColumn slo_can_flg = createBooleanColumn(_slo_can_flg);
	
	/**
	 * 受注取消ソート順. Sales order cancel sort order.<p>
	 *
	 */
	public static final String $slo_can_sort_seq = "slo_can_sort_seq";
	private static final MCPermColumnInfo _slo_can_sort_seq = createColumnInfo("slo_can_sort_seq");
	public final MCNumberPermColumn slo_can_sort_seq = createNumberColumn(_slo_can_sort_seq);
	
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
	
	public static final MCMeta slo_rsn_cd_META = createCommonMeta($slo_rsn_cd, mcframe.commonMS.meta.MS_META.SLO_RSN_CD);
	public static final MCMeta slo_rsn_nm_META = createCommonMeta($slo_rsn_nm, mcframe.commonMS.meta.MS_META.SLO_RSN_NM);
	public static final MCMeta qtn_term_flg_META = createCommonMeta($qtn_term_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta qtn_term_sort_seq_META = createCommonMeta($qtn_term_sort_seq, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta qtn_rslt_flg_META = createCommonMeta($qtn_rslt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta qtn_rslt_sort_seq_META = createCommonMeta($qtn_rslt_sort_seq, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta slo_can_flg_META = createCommonMeta($slo_can_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta slo_can_sort_seq_META = createCommonMeta($slo_can_sort_seq, mcframe.commonMA.meta.MA_META.INT);
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
	
	protected static final ConstMetaList<MST_SLO_RSN_R> constMetas = new ConstMetaList<MST_SLO_RSN_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			slo_rsn_cd_META,
			slo_rsn_nm_META,
			qtn_term_flg_META,
			qtn_term_sort_seq_META,
			qtn_rslt_flg_META,
			qtn_rslt_sort_seq_META,
			slo_can_flg_META,
			slo_can_sort_seq_META,
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
	protected MST_SLO_RSN_R(ConstMetaList<? extends MST_SLO_RSN_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MST_SLO_RSN_R(ConstMetaList<? extends MST_SLO_RSN_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MST_SLO_RSN_R.$slo_rsn_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_RSN_R.$slo_rsn_cd,
				"slo_rsn_cd",
				slo_rsn_cd,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_RSN_R.$slo_rsn_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_RSN_R.$slo_rsn_nm,
				"slo_rsn_nm",
				slo_rsn_nm,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_RSN_R.$qtn_term_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_SLO_RSN_R.$qtn_term_flg,
				"qtn_term_flg",
				qtn_term_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_RSN_R.$qtn_term_sort_seq,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_SLO_RSN_R.$qtn_term_sort_seq,
				"qtn_term_sort_seq",
				qtn_term_sort_seq,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_RSN_R.$qtn_rslt_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_SLO_RSN_R.$qtn_rslt_flg,
				"qtn_rslt_flg",
				qtn_rslt_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_RSN_R.$qtn_rslt_sort_seq,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_SLO_RSN_R.$qtn_rslt_sort_seq,
				"qtn_rslt_sort_seq",
				qtn_rslt_sort_seq,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_RSN_R.$slo_can_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_SLO_RSN_R.$slo_can_flg,
				"slo_can_flg",
				slo_can_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_RSN_R.$slo_can_sort_seq,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_SLO_RSN_R.$slo_can_sort_seq,
				"slo_can_sort_seq",
				slo_can_sort_seq,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_RSN_R.$memo1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_RSN_R.$memo1,
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
			MST_SLO_RSN_R.$memo2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_RSN_R.$memo2,
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
			MST_SLO_RSN_R.$memo3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_RSN_R.$memo3,
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
			MST_SLO_RSN_R.$del_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_SLO_RSN_R.$del_flg,
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
			MST_SLO_RSN_R.$del_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_RSN_R.$del_usr_id,
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
			MST_SLO_RSN_R.$del_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_RSN_R.$del_usr_nm,
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
			MST_SLO_RSN_R.$del_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MST_SLO_RSN_R.$del_ts,
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
			MST_SLO_RSN_R.$ins_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_RSN_R.$ins_usr_id,
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
			MST_SLO_RSN_R.$ins_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_RSN_R.$ins_usr_nm,
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
			MST_SLO_RSN_R.$ins_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MST_SLO_RSN_R.$ins_ts,
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
			MST_SLO_RSN_R.$ins_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_RSN_R.$ins_func_id,
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
			MST_SLO_RSN_R.$upd_cntr,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_SLO_RSN_R.$upd_cntr,
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
			MST_SLO_RSN_R.$upd_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_RSN_R.$upd_usr_id,
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
			MST_SLO_RSN_R.$upd_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_RSN_R.$upd_usr_nm,
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
			MST_SLO_RSN_R.$upd_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MST_SLO_RSN_R.$upd_ts,
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
			MST_SLO_RSN_R.$upd_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_RSN_R.$upd_func_id,
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
			MST_SLO_RSN_R.$upd_srv_req_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_RSN_R.$upd_srv_req_no,
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
	public static MST_SLO_RSN_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MST_SLO_RSN_R create(String alias) {
		MST_SLO_RSN_R row = new MST_SLO_RSN_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MST_SLO_RSN_R createByName(T proto) {
		MST_SLO_RSN_R row = MST_SLO_RSN_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MST_SLO_RSN_R clone() {
		return (MST_SLO_RSN_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MST_SLO_RSN_R createInstance() {
		return (MST_SLO_RSN_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MST_SLO_RSN_R getValues(String... names) {
		return (MST_SLO_RSN_R) super.getValues(names);
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
	 public MSW_SLO_RSN_KEY_R getPkWorkDbc(String alias) {
	 	return MSW_SLO_RSN_KEY_R.create(alias);
	 }

	/*
	 * MCDBContainerのオーバーライドメソッドです。
	 */
	 public MSW_SLO_RSN_KEY_R getPkWorkDbc() {
	 	return getPkWorkDbc(MSW_SLO_RSN_KEY_R.TABLE_NAME);
	 }

	/**
	 * 見積受注理由ＣＤ. Quotation sales order reason cd..<p>
	 *
	 */
	public String slo_rsn_cd() {
		return getConstString(offset + 0, $slo_rsn_cd);
	}

	/**
	 * 見積受注理由ＣＤ. Quotation sales order reason cd..<p>
	 *
	 */
	public void slo_rsn_cd(String value) {
		setConstString(offset + 0, $slo_rsn_cd, value);
	}

	/**
	 * 見積受注理由名. Quotation sales order reason name.<p>
	 *
	 */
	public String slo_rsn_nm() {
		return getConstString(offset + 1, $slo_rsn_nm);
	}

	/**
	 * 見積受注理由名. Quotation sales order reason name.<p>
	 *
	 */
	public void slo_rsn_nm(String value) {
		setConstString(offset + 1, $slo_rsn_nm, value);
	}

	/**
	 * 見積条件ＦＬＧ. Quotation terms flg..<p>
	 *
	 */
	public boolean qtn_term_flg() {
		return getConstBoolean(offset + 2, $qtn_term_flg);
	}

	/**
	 * 見積条件ＦＬＧ. Quotation terms flg..<p>
	 *
	 */
	public void qtn_term_flg(boolean value) {
		setConstBoolean(offset + 2, $qtn_term_flg, value);
	}

	/**
	 * 見積条件ソート順. Quotation terms sort order.<p>
	 *
	 */
	public MCNumber qtn_term_sort_seq() {
		return getConstNumber(offset + 3, $qtn_term_sort_seq);
	}

	/**
	 * 見積条件ソート順. Quotation terms sort order.<p>
	 *
	 */
	public void qtn_term_sort_seq(MCNumber value) {
		setConstNumber(offset + 3, $qtn_term_sort_seq, value);
	}
	
	/**
	 * 見積条件ソート順. Quotation terms sort order.<p>
	 *
	 */
	public void qtn_term_sort_seq(int value) {
		setConstNumber(offset + 3, $qtn_term_sort_seq, value);
	}
	
	/**
	 * 見積条件ソート順. Quotation terms sort order.<p>
	 *
	 */
	public void qtn_term_sort_seq(long value) {
		setConstNumber(offset + 3, $qtn_term_sort_seq, value);
	}
	
	/**
	 * 見積条件ソート順. Quotation terms sort order.<p>
	 *
	 */
	public void qtn_term_sort_seq(float value) {
		setConstNumber(offset + 3, $qtn_term_sort_seq, value);
	}
	
	/**
	 * 見積条件ソート順. Quotation terms sort order.<p>
	 *
	 */
	public void qtn_term_sort_seq(double value) {
		setConstNumber(offset + 3, $qtn_term_sort_seq, value);
	}
	
	/**
	 * 見積結果ＦＬＧ. Quotation result flg..<p>
	 *
	 */
	public boolean qtn_rslt_flg() {
		return getConstBoolean(offset + 4, $qtn_rslt_flg);
	}

	/**
	 * 見積結果ＦＬＧ. Quotation result flg..<p>
	 *
	 */
	public void qtn_rslt_flg(boolean value) {
		setConstBoolean(offset + 4, $qtn_rslt_flg, value);
	}

	/**
	 * 見積結果ソート順. Quotation result sort order.<p>
	 *
	 */
	public MCNumber qtn_rslt_sort_seq() {
		return getConstNumber(offset + 5, $qtn_rslt_sort_seq);
	}

	/**
	 * 見積結果ソート順. Quotation result sort order.<p>
	 *
	 */
	public void qtn_rslt_sort_seq(MCNumber value) {
		setConstNumber(offset + 5, $qtn_rslt_sort_seq, value);
	}
	
	/**
	 * 見積結果ソート順. Quotation result sort order.<p>
	 *
	 */
	public void qtn_rslt_sort_seq(int value) {
		setConstNumber(offset + 5, $qtn_rslt_sort_seq, value);
	}
	
	/**
	 * 見積結果ソート順. Quotation result sort order.<p>
	 *
	 */
	public void qtn_rslt_sort_seq(long value) {
		setConstNumber(offset + 5, $qtn_rslt_sort_seq, value);
	}
	
	/**
	 * 見積結果ソート順. Quotation result sort order.<p>
	 *
	 */
	public void qtn_rslt_sort_seq(float value) {
		setConstNumber(offset + 5, $qtn_rslt_sort_seq, value);
	}
	
	/**
	 * 見積結果ソート順. Quotation result sort order.<p>
	 *
	 */
	public void qtn_rslt_sort_seq(double value) {
		setConstNumber(offset + 5, $qtn_rslt_sort_seq, value);
	}
	
	/**
	 * 受注取消ＦＬＧ. Sales order cancel flg..<p>
	 *
	 */
	public boolean slo_can_flg() {
		return getConstBoolean(offset + 6, $slo_can_flg);
	}

	/**
	 * 受注取消ＦＬＧ. Sales order cancel flg..<p>
	 *
	 */
	public void slo_can_flg(boolean value) {
		setConstBoolean(offset + 6, $slo_can_flg, value);
	}

	/**
	 * 受注取消ソート順. Sales order cancel sort order.<p>
	 *
	 */
	public MCNumber slo_can_sort_seq() {
		return getConstNumber(offset + 7, $slo_can_sort_seq);
	}

	/**
	 * 受注取消ソート順. Sales order cancel sort order.<p>
	 *
	 */
	public void slo_can_sort_seq(MCNumber value) {
		setConstNumber(offset + 7, $slo_can_sort_seq, value);
	}
	
	/**
	 * 受注取消ソート順. Sales order cancel sort order.<p>
	 *
	 */
	public void slo_can_sort_seq(int value) {
		setConstNumber(offset + 7, $slo_can_sort_seq, value);
	}
	
	/**
	 * 受注取消ソート順. Sales order cancel sort order.<p>
	 *
	 */
	public void slo_can_sort_seq(long value) {
		setConstNumber(offset + 7, $slo_can_sort_seq, value);
	}
	
	/**
	 * 受注取消ソート順. Sales order cancel sort order.<p>
	 *
	 */
	public void slo_can_sort_seq(float value) {
		setConstNumber(offset + 7, $slo_can_sort_seq, value);
	}
	
	/**
	 * 受注取消ソート順. Sales order cancel sort order.<p>
	 *
	 */
	public void slo_can_sort_seq(double value) {
		setConstNumber(offset + 7, $slo_can_sort_seq, value);
	}
	
	/**
	 * メモ１. Memo 1.<p>
	 *
	 */
	public String memo1() {
		return getConstString(offset + 8, $memo1);
	}

	/**
	 * メモ１. Memo 1.<p>
	 *
	 */
	public void memo1(String value) {
		setConstString(offset + 8, $memo1, value);
	}

	/**
	 * メモ２. Memo 2.<p>
	 *
	 */
	public String memo2() {
		return getConstString(offset + 9, $memo2);
	}

	/**
	 * メモ２. Memo 2.<p>
	 *
	 */
	public void memo2(String value) {
		setConstString(offset + 9, $memo2, value);
	}

	/**
	 * メモ３. Memo 3.<p>
	 *
	 */
	public String memo3() {
		return getConstString(offset + 10, $memo3);
	}

	/**
	 * メモ３. Memo 3.<p>
	 *
	 */
	public void memo3(String value) {
		setConstString(offset + 10, $memo3, value);
	}

	/**
	 * 論理削除ＦＬＧ. Logical delete flg..<p>
	 *
	 */
	public boolean del_flg() {
		return getConstBoolean(offset + 11, $del_flg);
	}

	/**
	 * 論理削除ＦＬＧ. Logical delete flg..<p>
	 *
	 */
	public void del_flg(boolean value) {
		setConstBoolean(offset + 11, $del_flg, value);
	}

	/**
	 * 論理削除ユーザＩＤ. Logical delete user ID.<p>
	 *
	 */
	public String del_usr_id() {
		return getConstString(offset + 12, $del_usr_id);
	}

	/**
	 * 論理削除ユーザＩＤ. Logical delete user ID.<p>
	 *
	 */
	public void del_usr_id(String value) {
		setConstString(offset + 12, $del_usr_id, value);
	}

	/**
	 * 論理削除ユーザ名. Logical delete user name.<p>
	 *
	 */
	public String del_usr_nm() {
		return getConstString(offset + 13, $del_usr_nm);
	}

	/**
	 * 論理削除ユーザ名. Logical delete user name.<p>
	 *
	 */
	public void del_usr_nm(String value) {
		setConstString(offset + 13, $del_usr_nm, value);
	}

	/**
	 * 論理削除日時. Logical delete date and time.<p>
	 *
	 */
	public MCTimestamp del_ts() {
		return getConstTimestamp(offset + 14, $del_ts);
	}

	/**
	 * 論理削除日時. Logical delete date and time.<p>
	 *
	 */
	public void del_ts(MCTimestamp value) {
		setConstTimestamp(offset + 14, $del_ts, value);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 15, $ins_usr_id);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 15, $ins_usr_id, value);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 16, $ins_usr_nm);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 16, $ins_usr_nm, value);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 17, $ins_ts);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 17, $ins_ts, value);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 18, $ins_func_id);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 18, $ins_func_id, value);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 19, $upd_cntr);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 19, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 19, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 19, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 19, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 19, $upd_cntr, value);
	}
	
	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 20, $upd_usr_id);
	}

	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 20, $upd_usr_id, value);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 21, $upd_usr_nm);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 21, $upd_usr_nm, value);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 22, $upd_ts);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 22, $upd_ts, value);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 23, $upd_func_id);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 23, $upd_func_id, value);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 24, $upd_srv_req_no);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 24, $upd_srv_req_no, value);
	}

	public String getString(String name) {
		if ($slo_rsn_cd.equalsIgnoreCase(name)) {
			return slo_rsn_cd();
		}
		if ($slo_rsn_nm.equalsIgnoreCase(name)) {
			return slo_rsn_nm();
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
		if ($qtn_term_sort_seq.equalsIgnoreCase(name)) {
			return qtn_term_sort_seq();
		}
		if ($qtn_rslt_sort_seq.equalsIgnoreCase(name)) {
			return qtn_rslt_sort_seq();
		}
		if ($slo_can_sort_seq.equalsIgnoreCase(name)) {
			return slo_can_sort_seq();
		}
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
		if ($qtn_term_flg.equalsIgnoreCase(name)) {
			return qtn_term_flg();
		}
		if ($qtn_rslt_flg.equalsIgnoreCase(name)) {
			return qtn_rslt_flg();
		}
		if ($slo_can_flg.equalsIgnoreCase(name)) {
			return slo_can_flg();
		}
		if ($del_flg.equalsIgnoreCase(name)) {
			return del_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($slo_rsn_cd.equalsIgnoreCase(name)) {
			return slo_rsn_cd();
		}
		if ($slo_rsn_nm.equalsIgnoreCase(name)) {
			return slo_rsn_nm();
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
		if ($qtn_term_sort_seq.equalsIgnoreCase(name)) {
			return qtn_term_sort_seq();
		}
		if ($qtn_rslt_sort_seq.equalsIgnoreCase(name)) {
			return qtn_rslt_sort_seq();
		}
		if ($slo_can_sort_seq.equalsIgnoreCase(name)) {
			return slo_can_sort_seq();
		}
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
		if ($qtn_term_flg.equalsIgnoreCase(name)) {
			return qtn_term_flg();
		}
		if ($qtn_rslt_flg.equalsIgnoreCase(name)) {
			return qtn_rslt_flg();
		}
		if ($slo_can_flg.equalsIgnoreCase(name)) {
			return slo_can_flg();
		}
		if ($del_flg.equalsIgnoreCase(name)) {
			return del_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($slo_rsn_cd.equalsIgnoreCase(name)) {
			slo_rsn_cd(value);
			return;
		}
		if ($slo_rsn_nm.equalsIgnoreCase(name)) {
			slo_rsn_nm(value);
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
		if ($qtn_term_sort_seq.equalsIgnoreCase(name)) {
			qtn_term_sort_seq(value);
			return;
		}
		if ($qtn_rslt_sort_seq.equalsIgnoreCase(name)) {
			qtn_rslt_sort_seq(value);
			return;
		}
		if ($slo_can_sort_seq.equalsIgnoreCase(name)) {
			slo_can_sort_seq(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, int value) {
		if ($qtn_term_sort_seq.equalsIgnoreCase(name)) {
			qtn_term_sort_seq(value);
			return;
		}
		if ($qtn_rslt_sort_seq.equalsIgnoreCase(name)) {
			qtn_rslt_sort_seq(value);
			return;
		}
		if ($slo_can_sort_seq.equalsIgnoreCase(name)) {
			slo_can_sort_seq(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, long value) {
		if ($qtn_term_sort_seq.equalsIgnoreCase(name)) {
			qtn_term_sort_seq(value);
			return;
		}
		if ($qtn_rslt_sort_seq.equalsIgnoreCase(name)) {
			qtn_rslt_sort_seq(value);
			return;
		}
		if ($slo_can_sort_seq.equalsIgnoreCase(name)) {
			slo_can_sort_seq(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, float value) {
		if ($qtn_term_sort_seq.equalsIgnoreCase(name)) {
			qtn_term_sort_seq(value);
			return;
		}
		if ($qtn_rslt_sort_seq.equalsIgnoreCase(name)) {
			qtn_rslt_sort_seq(value);
			return;
		}
		if ($slo_can_sort_seq.equalsIgnoreCase(name)) {
			slo_can_sort_seq(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, double value) {
		if ($qtn_term_sort_seq.equalsIgnoreCase(name)) {
			qtn_term_sort_seq(value);
			return;
		}
		if ($qtn_rslt_sort_seq.equalsIgnoreCase(name)) {
			qtn_rslt_sort_seq(value);
			return;
		}
		if ($slo_can_sort_seq.equalsIgnoreCase(name)) {
			slo_can_sort_seq(value);
			return;
		}
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
		if ($qtn_term_flg.equalsIgnoreCase(name)) {
			qtn_term_flg(value);
			return;
		}
		if ($qtn_rslt_flg.equalsIgnoreCase(name)) {
			qtn_rslt_flg(value);
			return;
		}
		if ($slo_can_flg.equalsIgnoreCase(name)) {
			slo_can_flg(value);
			return;
		}
		if ($del_flg.equalsIgnoreCase(name)) {
			del_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($slo_rsn_cd.equalsIgnoreCase(name)) {
			slo_rsn_cd(value);
			return;
		}
		if ($slo_rsn_nm.equalsIgnoreCase(name)) {
			slo_rsn_nm(value);
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
		if ($qtn_term_sort_seq.equalsIgnoreCase(name)) {
			qtn_term_sort_seq(value);
			return;
		}
		if ($qtn_rslt_sort_seq.equalsIgnoreCase(name)) {
			qtn_rslt_sort_seq(value);
			return;
		}
		if ($slo_can_sort_seq.equalsIgnoreCase(name)) {
			slo_can_sort_seq(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, int value) {
		if ($qtn_term_sort_seq.equalsIgnoreCase(name)) {
			qtn_term_sort_seq(value);
			return;
		}
		if ($qtn_rslt_sort_seq.equalsIgnoreCase(name)) {
			qtn_rslt_sort_seq(value);
			return;
		}
		if ($slo_can_sort_seq.equalsIgnoreCase(name)) {
			slo_can_sort_seq(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, long value) {
		if ($qtn_term_sort_seq.equalsIgnoreCase(name)) {
			qtn_term_sort_seq(value);
			return;
		}
		if ($qtn_rslt_sort_seq.equalsIgnoreCase(name)) {
			qtn_rslt_sort_seq(value);
			return;
		}
		if ($slo_can_sort_seq.equalsIgnoreCase(name)) {
			slo_can_sort_seq(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, float value) {
		if ($qtn_term_sort_seq.equalsIgnoreCase(name)) {
			qtn_term_sort_seq(value);
			return;
		}
		if ($qtn_rslt_sort_seq.equalsIgnoreCase(name)) {
			qtn_rslt_sort_seq(value);
			return;
		}
		if ($slo_can_sort_seq.equalsIgnoreCase(name)) {
			slo_can_sort_seq(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, double value) {
		if ($qtn_term_sort_seq.equalsIgnoreCase(name)) {
			qtn_term_sort_seq(value);
			return;
		}
		if ($qtn_rslt_sort_seq.equalsIgnoreCase(name)) {
			qtn_rslt_sort_seq(value);
			return;
		}
		if ($slo_can_sort_seq.equalsIgnoreCase(name)) {
			slo_can_sort_seq(value);
			return;
		}
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
		if ($qtn_term_flg.equalsIgnoreCase(name)) {
			qtn_term_flg(value);
			return;
		}
		if ($qtn_rslt_flg.equalsIgnoreCase(name)) {
			qtn_rslt_flg(value);
			return;
		}
		if ($slo_can_flg.equalsIgnoreCase(name)) {
			slo_can_flg(value);
			return;
		}
		if ($del_flg.equalsIgnoreCase(name)) {
			del_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

}
