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
 * "納入指示ヘッダ // Delivery order header"DBコンテナRowクラスです。<p>
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
 *  	<td>dlv_inst_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>納入指示ＮＯ</td>
 *  	<td>Delivery order No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>dlv_inst_rev</td>
 *  	<td>N</td>
 *  	<td>4,0</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>納入指示改訂番号</td>
 *  	<td>Delivery order rev. number</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>dlv_inst_seq</td>
 *  	<td>N</td>
 *  	<td>4,0</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>納入指示連番</td>
 *  	<td>Delivery order sequence number</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>dlv_inst_grp_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>納入指示ＧＮＯ</td>
 *  	<td>Delivery order G No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>po_d_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>発注明細ＮＯ</td>
 *  	<td>PO details No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>dlv_inst_print_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>納入指示書発行日時</td>
 *  	<td>Delivery order issue date and time</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>dlv_inst_print_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>納入指示書発行済ＦＬＧ</td>
 *  	<td>Delivery order issued flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>last_dlv_inst_rev</td>
 *  	<td>N</td>
 *  	<td>4,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>最新納入指示改訂番号</td>
 *  	<td>Latest delivery order rev. number</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>dlv_inst_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>納入指示日</td>
 *  	<td>Delivery order date</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>edi_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>ＥＤＩＦＬＧ</td>
 *  	<td>EDI flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>can_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>取消ＦＬＧ</td>
 *  	<td>Cancel flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>dlv_inst_print_rmrks</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>納入指示書備考</td>
 *  	<td>Delivery order remarks</td>
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
public class MST_DLV_INST_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.CO_VIEW;

	public static final String TABLE_NAME = "MST_DLV_INST";

	public static final boolean EX_CTRL = true;
	
	public static final boolean LCL_TABLE = false;
	
	/**
	 * 納入指示ＮＯ. Delivery order No..<p>
	 *
	 */
	public static final String $dlv_inst_no = "dlv_inst_no";
	private static final MCPermColumnInfo _dlv_inst_no = createColumnInfo("dlv_inst_no");
	public final MCStringPermColumn dlv_inst_no = createStringColumn(_dlv_inst_no);
	
	/**
	 * 納入指示改訂番号. Delivery order rev. number.<p>
	 *
	 */
	public static final String $dlv_inst_rev = "dlv_inst_rev";
	private static final MCPermColumnInfo _dlv_inst_rev = createColumnInfo("dlv_inst_rev");
	public final MCNumberPermColumn dlv_inst_rev = createNumberColumn(_dlv_inst_rev);
	
	/**
	 * 納入指示連番. Delivery order sequence number.<p>
	 *
	 */
	public static final String $dlv_inst_seq = "dlv_inst_seq";
	private static final MCPermColumnInfo _dlv_inst_seq = createColumnInfo("dlv_inst_seq");
	public final MCNumberPermColumn dlv_inst_seq = createNumberColumn(_dlv_inst_seq);
	
	/**
	 * 納入指示ＧＮＯ. Delivery order G No..<p>
	 *
	 */
	public static final String $dlv_inst_grp_no = "dlv_inst_grp_no";
	private static final MCPermColumnInfo _dlv_inst_grp_no = createColumnInfo("dlv_inst_grp_no");
	public final MCStringPermColumn dlv_inst_grp_no = createStringColumn(_dlv_inst_grp_no);
	
	/**
	 * 発注明細ＮＯ. PO details No..<p>
	 *
	 */
	public static final String $po_d_no = "po_d_no";
	private static final MCPermColumnInfo _po_d_no = createColumnInfo("po_d_no");
	public final MCStringPermColumn po_d_no = createStringColumn(_po_d_no);
	
	/**
	 * 納入指示書発行日時. Delivery order issue date and time.<p>
	 *
	 */
	public static final String $dlv_inst_print_dt = "dlv_inst_print_dt";
	private static final MCPermColumnInfo _dlv_inst_print_dt = createColumnInfo("dlv_inst_print_dt");
	public final MCDatePermColumn dlv_inst_print_dt = createDateColumn(_dlv_inst_print_dt);
	
	/**
	 * 納入指示書発行済ＦＬＧ. Delivery order issued flg..<p>
	 *
	 */
	public static final String $dlv_inst_print_flg = "dlv_inst_print_flg";
	private static final MCPermColumnInfo _dlv_inst_print_flg = createColumnInfo("dlv_inst_print_flg");
	public final MCBooleanPermColumn dlv_inst_print_flg = createBooleanColumn(_dlv_inst_print_flg);
	
	/**
	 * 最新納入指示改訂番号. Latest delivery order rev. number.<p>
	 *
	 */
	public static final String $last_dlv_inst_rev = "last_dlv_inst_rev";
	private static final MCPermColumnInfo _last_dlv_inst_rev = createColumnInfo("last_dlv_inst_rev");
	public final MCNumberPermColumn last_dlv_inst_rev = createNumberColumn(_last_dlv_inst_rev);
	
	/**
	 * 納入指示日. Delivery order date.<p>
	 *
	 */
	public static final String $dlv_inst_dt = "dlv_inst_dt";
	private static final MCPermColumnInfo _dlv_inst_dt = createColumnInfo("dlv_inst_dt");
	public final MCDatePermColumn dlv_inst_dt = createDateColumn(_dlv_inst_dt);
	
	/**
	 * ＥＤＩＦＬＧ. EDI flg..<p>
	 *
	 */
	public static final String $edi_flg = "edi_flg";
	private static final MCPermColumnInfo _edi_flg = createColumnInfo("edi_flg");
	public final MCBooleanPermColumn edi_flg = createBooleanColumn(_edi_flg);
	
	/**
	 * 取消ＦＬＧ. Cancel flg..<p>
	 *
	 */
	public static final String $can_flg = "can_flg";
	private static final MCPermColumnInfo _can_flg = createColumnInfo("can_flg");
	public final MCBooleanPermColumn can_flg = createBooleanColumn(_can_flg);
	
	/**
	 * 納入指示書備考. Delivery order remarks.<p>
	 *
	 */
	public static final String $dlv_inst_print_rmrks = "dlv_inst_print_rmrks";
	private static final MCPermColumnInfo _dlv_inst_print_rmrks = createColumnInfo("dlv_inst_print_rmrks");
	public final MCStringPermColumn dlv_inst_print_rmrks = createStringColumn(_dlv_inst_print_rmrks);
	
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
	
	public static final MCMeta dlv_inst_no_META = createCommonMeta($dlv_inst_no, mcframe.commonMA.meta.MA_META.DLV_INST_NO);
	public static final MCMeta dlv_inst_rev_META = createCommonMeta($dlv_inst_rev, mcframe.commonMA.meta.MA_META.SLIP_REV);
	public static final MCMeta dlv_inst_seq_META = createCommonMeta($dlv_inst_seq, mcframe.commonMA.meta.MA_META.SLIP_SEQ);
	public static final MCMeta dlv_inst_grp_no_META = createCommonMeta($dlv_inst_grp_no, mcframe.commonMS.meta.MS_META.DLV_INST_GRP_NO);
	public static final MCMeta po_d_no_META = createCommonMeta($po_d_no, mcframe.commonMA.meta.MA_META.PO_D_NO);
	public static final MCMeta dlv_inst_print_dt_META = createCommonMeta($dlv_inst_print_dt, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta dlv_inst_print_flg_META = createCommonMeta($dlv_inst_print_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta last_dlv_inst_rev_META = createCommonMeta($last_dlv_inst_rev, mcframe.commonMA.meta.MA_META.SLIP_REV);
	public static final MCMeta dlv_inst_dt_META = createCommonMeta($dlv_inst_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta edi_flg_META = createCommonMeta($edi_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta can_flg_META = createCommonMeta($can_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dlv_inst_print_rmrks_META = createCommonMeta($dlv_inst_print_rmrks, mcframe.commonMS.meta.MS_META.DLV_INST_PRINT_RMRKS);
	public static final MCMeta intr_rmrks_META = createCommonMeta($intr_rmrks, mcframe.commonMS.meta.MS_META.DLV_INST_INTR_RMRKS);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.DLV_INST_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.DLV_INST_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.DLV_INST_SUB_CHAR3);
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
	
	protected static final ConstMetaList<MST_DLV_INST_R> constMetas = new ConstMetaList<MST_DLV_INST_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			dlv_inst_no_META,
			dlv_inst_rev_META,
			dlv_inst_seq_META,
			dlv_inst_grp_no_META,
			po_d_no_META,
			dlv_inst_print_dt_META,
			dlv_inst_print_flg_META,
			last_dlv_inst_rev_META,
			dlv_inst_dt_META,
			edi_flg_META,
			can_flg_META,
			dlv_inst_print_rmrks_META,
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
	protected MST_DLV_INST_R(ConstMetaList<? extends MST_DLV_INST_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MST_DLV_INST_R(ConstMetaList<? extends MST_DLV_INST_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MST_DLV_INST_R.$dlv_inst_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_DLV_INST_R.$dlv_inst_no,
				"dlv_inst_no",
				dlv_inst_no,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_DLV_INST_R.$dlv_inst_rev,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_DLV_INST_R.$dlv_inst_rev,
				"dlv_inst_rev",
				dlv_inst_rev,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_DLV_INST_R.$dlv_inst_seq,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_DLV_INST_R.$dlv_inst_seq,
				"dlv_inst_seq",
				dlv_inst_seq,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_DLV_INST_R.$dlv_inst_grp_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_DLV_INST_R.$dlv_inst_grp_no,
				"dlv_inst_grp_no",
				dlv_inst_grp_no,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_DLV_INST_R.$po_d_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_DLV_INST_R.$po_d_no,
				"po_d_no",
				po_d_no,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_DLV_INST_R.$dlv_inst_print_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_DLV_INST_R.$dlv_inst_print_dt,
				"dlv_inst_print_dt",
				dlv_inst_print_dt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_DLV_INST_R.$dlv_inst_print_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_DLV_INST_R.$dlv_inst_print_flg,
				"dlv_inst_print_flg",
				dlv_inst_print_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_DLV_INST_R.$last_dlv_inst_rev,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_DLV_INST_R.$last_dlv_inst_rev,
				"last_dlv_inst_rev",
				last_dlv_inst_rev,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_DLV_INST_R.$dlv_inst_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_DLV_INST_R.$dlv_inst_dt,
				"dlv_inst_dt",
				dlv_inst_dt,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_DLV_INST_R.$edi_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_DLV_INST_R.$edi_flg,
				"edi_flg",
				edi_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_DLV_INST_R.$can_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_DLV_INST_R.$can_flg,
				"can_flg",
				can_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_DLV_INST_R.$dlv_inst_print_rmrks,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_DLV_INST_R.$dlv_inst_print_rmrks,
				"dlv_inst_print_rmrks",
				dlv_inst_print_rmrks,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_DLV_INST_R.$intr_rmrks,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_DLV_INST_R.$intr_rmrks,
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
			MST_DLV_INST_R.$sub_char1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_DLV_INST_R.$sub_char1,
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
			MST_DLV_INST_R.$sub_char2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_DLV_INST_R.$sub_char2,
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
			MST_DLV_INST_R.$sub_char3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_DLV_INST_R.$sub_char3,
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
			MST_DLV_INST_R.$ins_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_DLV_INST_R.$ins_usr_id,
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
			MST_DLV_INST_R.$ins_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_DLV_INST_R.$ins_usr_nm,
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
			MST_DLV_INST_R.$ins_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MST_DLV_INST_R.$ins_ts,
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
			MST_DLV_INST_R.$ins_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_DLV_INST_R.$ins_func_id,
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
			MST_DLV_INST_R.$upd_cntr,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_DLV_INST_R.$upd_cntr,
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
			MST_DLV_INST_R.$upd_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_DLV_INST_R.$upd_usr_id,
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
			MST_DLV_INST_R.$upd_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_DLV_INST_R.$upd_usr_nm,
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
			MST_DLV_INST_R.$upd_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MST_DLV_INST_R.$upd_ts,
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
			MST_DLV_INST_R.$upd_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_DLV_INST_R.$upd_func_id,
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
			MST_DLV_INST_R.$upd_srv_req_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_DLV_INST_R.$upd_srv_req_no,
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
	public static MST_DLV_INST_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MST_DLV_INST_R create(String alias) {
		MST_DLV_INST_R row = new MST_DLV_INST_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MST_DLV_INST_R createByName(T proto) {
		MST_DLV_INST_R row = MST_DLV_INST_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MST_DLV_INST_R clone() {
		return (MST_DLV_INST_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MST_DLV_INST_R createInstance() {
		return (MST_DLV_INST_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MST_DLV_INST_R getValues(String... names) {
		return (MST_DLV_INST_R) super.getValues(names);
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
	 public MSW_DLV_INST_KEY_R getPkWorkDbc(String alias) {
	 	return MSW_DLV_INST_KEY_R.create(alias);
	 }

	/*
	 * MCDBContainerのオーバーライドメソッドです。
	 */
	 public MSW_DLV_INST_KEY_R getPkWorkDbc() {
	 	return getPkWorkDbc(MSW_DLV_INST_KEY_R.TABLE_NAME);
	 }

	/**
	 * 納入指示ＮＯ. Delivery order No..<p>
	 *
	 */
	public String dlv_inst_no() {
		return getConstString(offset + 0, $dlv_inst_no);
	}

	/**
	 * 納入指示ＮＯ. Delivery order No..<p>
	 *
	 */
	public void dlv_inst_no(String value) {
		setConstString(offset + 0, $dlv_inst_no, value);
	}

	/**
	 * 納入指示改訂番号. Delivery order rev. number.<p>
	 *
	 */
	public MCNumber dlv_inst_rev() {
		return getConstNumber(offset + 1, $dlv_inst_rev);
	}

	/**
	 * 納入指示改訂番号. Delivery order rev. number.<p>
	 *
	 */
	public void dlv_inst_rev(MCNumber value) {
		setConstNumber(offset + 1, $dlv_inst_rev, value);
	}
	
	/**
	 * 納入指示改訂番号. Delivery order rev. number.<p>
	 *
	 */
	public void dlv_inst_rev(int value) {
		setConstNumber(offset + 1, $dlv_inst_rev, value);
	}
	
	/**
	 * 納入指示改訂番号. Delivery order rev. number.<p>
	 *
	 */
	public void dlv_inst_rev(long value) {
		setConstNumber(offset + 1, $dlv_inst_rev, value);
	}
	
	/**
	 * 納入指示改訂番号. Delivery order rev. number.<p>
	 *
	 */
	public void dlv_inst_rev(float value) {
		setConstNumber(offset + 1, $dlv_inst_rev, value);
	}
	
	/**
	 * 納入指示改訂番号. Delivery order rev. number.<p>
	 *
	 */
	public void dlv_inst_rev(double value) {
		setConstNumber(offset + 1, $dlv_inst_rev, value);
	}
	
	/**
	 * 納入指示連番. Delivery order sequence number.<p>
	 *
	 */
	public MCNumber dlv_inst_seq() {
		return getConstNumber(offset + 2, $dlv_inst_seq);
	}

	/**
	 * 納入指示連番. Delivery order sequence number.<p>
	 *
	 */
	public void dlv_inst_seq(MCNumber value) {
		setConstNumber(offset + 2, $dlv_inst_seq, value);
	}
	
	/**
	 * 納入指示連番. Delivery order sequence number.<p>
	 *
	 */
	public void dlv_inst_seq(int value) {
		setConstNumber(offset + 2, $dlv_inst_seq, value);
	}
	
	/**
	 * 納入指示連番. Delivery order sequence number.<p>
	 *
	 */
	public void dlv_inst_seq(long value) {
		setConstNumber(offset + 2, $dlv_inst_seq, value);
	}
	
	/**
	 * 納入指示連番. Delivery order sequence number.<p>
	 *
	 */
	public void dlv_inst_seq(float value) {
		setConstNumber(offset + 2, $dlv_inst_seq, value);
	}
	
	/**
	 * 納入指示連番. Delivery order sequence number.<p>
	 *
	 */
	public void dlv_inst_seq(double value) {
		setConstNumber(offset + 2, $dlv_inst_seq, value);
	}
	
	/**
	 * 納入指示ＧＮＯ. Delivery order G No..<p>
	 *
	 */
	public String dlv_inst_grp_no() {
		return getConstString(offset + 3, $dlv_inst_grp_no);
	}

	/**
	 * 納入指示ＧＮＯ. Delivery order G No..<p>
	 *
	 */
	public void dlv_inst_grp_no(String value) {
		setConstString(offset + 3, $dlv_inst_grp_no, value);
	}

	/**
	 * 発注明細ＮＯ. PO details No..<p>
	 *
	 */
	public String po_d_no() {
		return getConstString(offset + 4, $po_d_no);
	}

	/**
	 * 発注明細ＮＯ. PO details No..<p>
	 *
	 */
	public void po_d_no(String value) {
		setConstString(offset + 4, $po_d_no, value);
	}

	/**
	 * 納入指示書発行日時. Delivery order issue date and time.<p>
	 *
	 */
	public MCDate dlv_inst_print_dt() {
		return getConstDate(offset + 5, $dlv_inst_print_dt);
	}

	/**
	 * 納入指示書発行日時. Delivery order issue date and time.<p>
	 *
	 */
	public void dlv_inst_print_dt(MCDate value) {
		setConstDate(offset + 5, $dlv_inst_print_dt, value);
	}

	/**
	 * 納入指示書発行済ＦＬＧ. Delivery order issued flg..<p>
	 *
	 */
	public boolean dlv_inst_print_flg() {
		return getConstBoolean(offset + 6, $dlv_inst_print_flg);
	}

	/**
	 * 納入指示書発行済ＦＬＧ. Delivery order issued flg..<p>
	 *
	 */
	public void dlv_inst_print_flg(boolean value) {
		setConstBoolean(offset + 6, $dlv_inst_print_flg, value);
	}

	/**
	 * 最新納入指示改訂番号. Latest delivery order rev. number.<p>
	 *
	 */
	public MCNumber last_dlv_inst_rev() {
		return getConstNumber(offset + 7, $last_dlv_inst_rev);
	}

	/**
	 * 最新納入指示改訂番号. Latest delivery order rev. number.<p>
	 *
	 */
	public void last_dlv_inst_rev(MCNumber value) {
		setConstNumber(offset + 7, $last_dlv_inst_rev, value);
	}
	
	/**
	 * 最新納入指示改訂番号. Latest delivery order rev. number.<p>
	 *
	 */
	public void last_dlv_inst_rev(int value) {
		setConstNumber(offset + 7, $last_dlv_inst_rev, value);
	}
	
	/**
	 * 最新納入指示改訂番号. Latest delivery order rev. number.<p>
	 *
	 */
	public void last_dlv_inst_rev(long value) {
		setConstNumber(offset + 7, $last_dlv_inst_rev, value);
	}
	
	/**
	 * 最新納入指示改訂番号. Latest delivery order rev. number.<p>
	 *
	 */
	public void last_dlv_inst_rev(float value) {
		setConstNumber(offset + 7, $last_dlv_inst_rev, value);
	}
	
	/**
	 * 最新納入指示改訂番号. Latest delivery order rev. number.<p>
	 *
	 */
	public void last_dlv_inst_rev(double value) {
		setConstNumber(offset + 7, $last_dlv_inst_rev, value);
	}
	
	/**
	 * 納入指示日. Delivery order date.<p>
	 *
	 */
	public MCDate dlv_inst_dt() {
		return getConstDate(offset + 8, $dlv_inst_dt);
	}

	/**
	 * 納入指示日. Delivery order date.<p>
	 *
	 */
	public void dlv_inst_dt(MCDate value) {
		setConstDate(offset + 8, $dlv_inst_dt, value);
	}

	/**
	 * ＥＤＩＦＬＧ. EDI flg..<p>
	 *
	 */
	public boolean edi_flg() {
		return getConstBoolean(offset + 9, $edi_flg);
	}

	/**
	 * ＥＤＩＦＬＧ. EDI flg..<p>
	 *
	 */
	public void edi_flg(boolean value) {
		setConstBoolean(offset + 9, $edi_flg, value);
	}

	/**
	 * 取消ＦＬＧ. Cancel flg..<p>
	 *
	 */
	public boolean can_flg() {
		return getConstBoolean(offset + 10, $can_flg);
	}

	/**
	 * 取消ＦＬＧ. Cancel flg..<p>
	 *
	 */
	public void can_flg(boolean value) {
		setConstBoolean(offset + 10, $can_flg, value);
	}

	/**
	 * 納入指示書備考. Delivery order remarks.<p>
	 *
	 */
	public String dlv_inst_print_rmrks() {
		return getConstString(offset + 11, $dlv_inst_print_rmrks);
	}

	/**
	 * 納入指示書備考. Delivery order remarks.<p>
	 *
	 */
	public void dlv_inst_print_rmrks(String value) {
		setConstString(offset + 11, $dlv_inst_print_rmrks, value);
	}

	/**
	 * 内部備考. Internal remarks.<p>
	 *
	 */
	public String intr_rmrks() {
		return getConstString(offset + 12, $intr_rmrks);
	}

	/**
	 * 内部備考. Internal remarks.<p>
	 *
	 */
	public void intr_rmrks(String value) {
		setConstString(offset + 12, $intr_rmrks, value);
	}

	/**
	 * 予備１. Spare 1.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 13, $sub_char1);
	}

	/**
	 * 予備１. Spare 1.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 13, $sub_char1, value);
	}

	/**
	 * 予備２. Spare 2.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 14, $sub_char2);
	}

	/**
	 * 予備２. Spare 2.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 14, $sub_char2, value);
	}

	/**
	 * 予備３. Spare 3.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 15, $sub_char3);
	}

	/**
	 * 予備３. Spare 3.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 15, $sub_char3, value);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 16, $ins_usr_id);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 16, $ins_usr_id, value);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 17, $ins_usr_nm);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 17, $ins_usr_nm, value);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 18, $ins_ts);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 18, $ins_ts, value);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 19, $ins_func_id);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 19, $ins_func_id, value);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 20, $upd_cntr);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 20, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 20, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 20, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 20, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 20, $upd_cntr, value);
	}
	
	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 21, $upd_usr_id);
	}

	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 21, $upd_usr_id, value);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 22, $upd_usr_nm);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 22, $upd_usr_nm, value);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 23, $upd_ts);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 23, $upd_ts, value);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 24, $upd_func_id);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 24, $upd_func_id, value);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 25, $upd_srv_req_no);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 25, $upd_srv_req_no, value);
	}

	public String getString(String name) {
		if ($dlv_inst_no.equalsIgnoreCase(name)) {
			return dlv_inst_no();
		}
		if ($dlv_inst_grp_no.equalsIgnoreCase(name)) {
			return dlv_inst_grp_no();
		}
		if ($po_d_no.equalsIgnoreCase(name)) {
			return po_d_no();
		}
		if ($dlv_inst_print_rmrks.equalsIgnoreCase(name)) {
			return dlv_inst_print_rmrks();
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
		if ($dlv_inst_rev.equalsIgnoreCase(name)) {
			return dlv_inst_rev();
		}
		if ($dlv_inst_seq.equalsIgnoreCase(name)) {
			return dlv_inst_seq();
		}
		if ($last_dlv_inst_rev.equalsIgnoreCase(name)) {
			return last_dlv_inst_rev();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumber(name);
	}

	public MCDate getDate(String name) {
		if ($dlv_inst_print_dt.equalsIgnoreCase(name)) {
			return dlv_inst_print_dt();
		}
		if ($dlv_inst_dt.equalsIgnoreCase(name)) {
			return dlv_inst_dt();
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
		if ($dlv_inst_print_flg.equalsIgnoreCase(name)) {
			return dlv_inst_print_flg();
		}
		if ($edi_flg.equalsIgnoreCase(name)) {
			return edi_flg();
		}
		if ($can_flg.equalsIgnoreCase(name)) {
			return can_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($dlv_inst_no.equalsIgnoreCase(name)) {
			return dlv_inst_no();
		}
		if ($dlv_inst_grp_no.equalsIgnoreCase(name)) {
			return dlv_inst_grp_no();
		}
		if ($po_d_no.equalsIgnoreCase(name)) {
			return po_d_no();
		}
		if ($dlv_inst_print_rmrks.equalsIgnoreCase(name)) {
			return dlv_inst_print_rmrks();
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
		if ($dlv_inst_rev.equalsIgnoreCase(name)) {
			return dlv_inst_rev();
		}
		if ($dlv_inst_seq.equalsIgnoreCase(name)) {
			return dlv_inst_seq();
		}
		if ($last_dlv_inst_rev.equalsIgnoreCase(name)) {
			return last_dlv_inst_rev();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumberNE(name);
	}

	public MCDate getDateNE(String name) {
		if ($dlv_inst_print_dt.equalsIgnoreCase(name)) {
			return dlv_inst_print_dt();
		}
		if ($dlv_inst_dt.equalsIgnoreCase(name)) {
			return dlv_inst_dt();
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
		if ($dlv_inst_print_flg.equalsIgnoreCase(name)) {
			return dlv_inst_print_flg();
		}
		if ($edi_flg.equalsIgnoreCase(name)) {
			return edi_flg();
		}
		if ($can_flg.equalsIgnoreCase(name)) {
			return can_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($dlv_inst_no.equalsIgnoreCase(name)) {
			dlv_inst_no(value);
			return;
		}
		if ($dlv_inst_grp_no.equalsIgnoreCase(name)) {
			dlv_inst_grp_no(value);
			return;
		}
		if ($po_d_no.equalsIgnoreCase(name)) {
			po_d_no(value);
			return;
		}
		if ($dlv_inst_print_rmrks.equalsIgnoreCase(name)) {
			dlv_inst_print_rmrks(value);
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
		if ($dlv_inst_rev.equalsIgnoreCase(name)) {
			dlv_inst_rev(value);
			return;
		}
		if ($dlv_inst_seq.equalsIgnoreCase(name)) {
			dlv_inst_seq(value);
			return;
		}
		if ($last_dlv_inst_rev.equalsIgnoreCase(name)) {
			last_dlv_inst_rev(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, int value) {
		if ($dlv_inst_rev.equalsIgnoreCase(name)) {
			dlv_inst_rev(value);
			return;
		}
		if ($dlv_inst_seq.equalsIgnoreCase(name)) {
			dlv_inst_seq(value);
			return;
		}
		if ($last_dlv_inst_rev.equalsIgnoreCase(name)) {
			last_dlv_inst_rev(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, long value) {
		if ($dlv_inst_rev.equalsIgnoreCase(name)) {
			dlv_inst_rev(value);
			return;
		}
		if ($dlv_inst_seq.equalsIgnoreCase(name)) {
			dlv_inst_seq(value);
			return;
		}
		if ($last_dlv_inst_rev.equalsIgnoreCase(name)) {
			last_dlv_inst_rev(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, float value) {
		if ($dlv_inst_rev.equalsIgnoreCase(name)) {
			dlv_inst_rev(value);
			return;
		}
		if ($dlv_inst_seq.equalsIgnoreCase(name)) {
			dlv_inst_seq(value);
			return;
		}
		if ($last_dlv_inst_rev.equalsIgnoreCase(name)) {
			last_dlv_inst_rev(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, double value) {
		if ($dlv_inst_rev.equalsIgnoreCase(name)) {
			dlv_inst_rev(value);
			return;
		}
		if ($dlv_inst_seq.equalsIgnoreCase(name)) {
			dlv_inst_seq(value);
			return;
		}
		if ($last_dlv_inst_rev.equalsIgnoreCase(name)) {
			last_dlv_inst_rev(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setDate(String name, MCDate value) {
		if ($dlv_inst_print_dt.equalsIgnoreCase(name)) {
			dlv_inst_print_dt(value);
			return;
		}
		if ($dlv_inst_dt.equalsIgnoreCase(name)) {
			dlv_inst_dt(value);
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
		if ($dlv_inst_print_flg.equalsIgnoreCase(name)) {
			dlv_inst_print_flg(value);
			return;
		}
		if ($edi_flg.equalsIgnoreCase(name)) {
			edi_flg(value);
			return;
		}
		if ($can_flg.equalsIgnoreCase(name)) {
			can_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($dlv_inst_no.equalsIgnoreCase(name)) {
			dlv_inst_no(value);
			return;
		}
		if ($dlv_inst_grp_no.equalsIgnoreCase(name)) {
			dlv_inst_grp_no(value);
			return;
		}
		if ($po_d_no.equalsIgnoreCase(name)) {
			po_d_no(value);
			return;
		}
		if ($dlv_inst_print_rmrks.equalsIgnoreCase(name)) {
			dlv_inst_print_rmrks(value);
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
		if ($dlv_inst_rev.equalsIgnoreCase(name)) {
			dlv_inst_rev(value);
			return;
		}
		if ($dlv_inst_seq.equalsIgnoreCase(name)) {
			dlv_inst_seq(value);
			return;
		}
		if ($last_dlv_inst_rev.equalsIgnoreCase(name)) {
			last_dlv_inst_rev(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, int value) {
		if ($dlv_inst_rev.equalsIgnoreCase(name)) {
			dlv_inst_rev(value);
			return;
		}
		if ($dlv_inst_seq.equalsIgnoreCase(name)) {
			dlv_inst_seq(value);
			return;
		}
		if ($last_dlv_inst_rev.equalsIgnoreCase(name)) {
			last_dlv_inst_rev(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, long value) {
		if ($dlv_inst_rev.equalsIgnoreCase(name)) {
			dlv_inst_rev(value);
			return;
		}
		if ($dlv_inst_seq.equalsIgnoreCase(name)) {
			dlv_inst_seq(value);
			return;
		}
		if ($last_dlv_inst_rev.equalsIgnoreCase(name)) {
			last_dlv_inst_rev(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, float value) {
		if ($dlv_inst_rev.equalsIgnoreCase(name)) {
			dlv_inst_rev(value);
			return;
		}
		if ($dlv_inst_seq.equalsIgnoreCase(name)) {
			dlv_inst_seq(value);
			return;
		}
		if ($last_dlv_inst_rev.equalsIgnoreCase(name)) {
			last_dlv_inst_rev(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, double value) {
		if ($dlv_inst_rev.equalsIgnoreCase(name)) {
			dlv_inst_rev(value);
			return;
		}
		if ($dlv_inst_seq.equalsIgnoreCase(name)) {
			dlv_inst_seq(value);
			return;
		}
		if ($last_dlv_inst_rev.equalsIgnoreCase(name)) {
			last_dlv_inst_rev(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setDateNE(String name, MCDate value) {
		if ($dlv_inst_print_dt.equalsIgnoreCase(name)) {
			dlv_inst_print_dt(value);
			return;
		}
		if ($dlv_inst_dt.equalsIgnoreCase(name)) {
			dlv_inst_dt(value);
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
		if ($dlv_inst_print_flg.equalsIgnoreCase(name)) {
			dlv_inst_print_flg(value);
			return;
		}
		if ($edi_flg.equalsIgnoreCase(name)) {
			edi_flg(value);
			return;
		}
		if ($can_flg.equalsIgnoreCase(name)) {
			can_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

}
