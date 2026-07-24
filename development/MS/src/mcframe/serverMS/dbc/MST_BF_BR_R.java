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
 * "バックフラッシュバッチ結果確認 // Check backflush batch results"DBコンテナRowクラスです。<p>
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
 *  	<td>batch_data_no</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>バッチデータＮＯ</td>
 *  	<td>Batch data No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>batch_log_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>ログＮＯ</td>
 *  	<td>Log No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>log_sub_key1</td>
 *  	<td>N</td>
 *  	<td>9,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ログサブキー１</td>
 *  	<td>Log sub key 1</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>log_sub_key2</td>
 *  	<td>N</td>
 *  	<td>9,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ログサブキー２</td>
 *  	<td>Log sub key 2</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>exe_sts_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>ＰＧ実行状況区分</td>
 *  	<td>PG execution status type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>mfg_inst_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>製造指図ＮＯ</td>
 *  	<td>Mfg. order No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>div_seq</td>
 *  	<td>N</td>
 *  	<td>3,0</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>分割連番</td>
 *  	<td>Split sequence number</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>mfg_act_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>製造実績ＮＯ</td>
 *  	<td>Mfg. result No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>oper_act_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>工程実績ＮＯ</td>
 *  	<td>Operation result No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>par_itm_cd</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>親品目ＣＤ</td>
 *  	<td>Parent item cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>par_itm_sub1</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>親枝番１</td>
 *  	<td>Parent branch No. 1</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>par_itm_sub2</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>親枝番２</td>
 *  	<td>Parent branch No. 2</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>par_itm_sub3</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>親枝番３</td>
 *  	<td>Parent branch No. 3</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>mfg_loc_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>製造場所ＣＤ</td>
 *  	<td>Mfg. location cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>oper_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>工程ＣＤ</td>
 *  	<td>Operation cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>st_act_tm</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>着手実績日時</td>
 *  	<td>Actual start date and time</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>end_act_tm</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>終了実績日時</td>
 *  	<td>Actual end date and time</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>bf_tgt_cnt</td>
 *  	<td>N</td>
 *  	<td>9,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＢＦ対象子品目件数</td>
 *  	<td>Number of child items for BF</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>bf_success_cnt</td>
 *  	<td>N</td>
 *  	<td>9,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＢＦ成功子品目件数</td>
 *  	<td>Number of child items in BF success</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>bf_failure_cnt</td>
 *  	<td>N</td>
 *  	<td>9,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＢＦ失敗子品目件数</td>
 *  	<td>Number of child items in BF failure</td>
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
 *  	<td>par_itm_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td>ITM1.ITM_NM</td>
 *  	<td>親品名</td>
 *  	<td>Parent item name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>mfg_loc_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td>LOC1.LOC_NM</td>
 *  	<td>製造場所名</td>
 *  	<td>Mfg. location name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>oper_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td>OPER1.OPER_NM</td>
 *  	<td>工程名</td>
 *  	<td>Operation name</td>
 *  </tr>
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
public class MST_BF_BR_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.CO_VIEW;

	public static final String TABLE_NAME = "MST_BF_BR";

	public static final boolean EX_CTRL = true;
	
	public static final boolean LCL_TABLE = false;
	
	/**
	 * バッチデータＮＯ. Batch data No..<p>
	 *
	 */
	public static final String $batch_data_no = "batch_data_no";
	private static final MCPermColumnInfo _batch_data_no = createColumnInfo("batch_data_no");
	public final MCStringPermColumn batch_data_no = createStringColumn(_batch_data_no);
	
	/**
	 * ログＮＯ. Log No..<p>
	 *
	 */
	public static final String $batch_log_no = "batch_log_no";
	private static final MCPermColumnInfo _batch_log_no = createColumnInfo("batch_log_no");
	public final MCStringPermColumn batch_log_no = createStringColumn(_batch_log_no);
	
	/**
	 * ログサブキー１. Log sub key 1.<p>
	 *
	 */
	public static final String $log_sub_key1 = "log_sub_key1";
	private static final MCPermColumnInfo _log_sub_key1 = createColumnInfo("log_sub_key1");
	public final MCNumberPermColumn log_sub_key1 = createNumberColumn(_log_sub_key1);
	
	/**
	 * ログサブキー２. Log sub key 2.<p>
	 *
	 */
	public static final String $log_sub_key2 = "log_sub_key2";
	private static final MCPermColumnInfo _log_sub_key2 = createColumnInfo("log_sub_key2");
	public final MCNumberPermColumn log_sub_key2 = createNumberColumn(_log_sub_key2);
	
	/**
	 * ＰＧ実行状況区分. PG execution status type.<p>
	 *
	 */
	public static final String $exe_sts_typ = "exe_sts_typ";
	private static final MCPermColumnInfo _exe_sts_typ = createColumnInfo("exe_sts_typ");
	public final MCStringPermColumn exe_sts_typ = createStringColumn(_exe_sts_typ);
	
	/**
	 * 製造指図ＮＯ. Mfg. order No..<p>
	 *
	 */
	public static final String $mfg_inst_no = "mfg_inst_no";
	private static final MCPermColumnInfo _mfg_inst_no = createColumnInfo("mfg_inst_no");
	public final MCStringPermColumn mfg_inst_no = createStringColumn(_mfg_inst_no);
	
	/**
	 * 分割連番. Split sequence number.<p>
	 *
	 */
	public static final String $div_seq = "div_seq";
	private static final MCPermColumnInfo _div_seq = createColumnInfo("div_seq");
	public final MCNumberPermColumn div_seq = createNumberColumn(_div_seq);
	
	/**
	 * 製造実績ＮＯ. Mfg. result No..<p>
	 *
	 */
	public static final String $mfg_act_no = "mfg_act_no";
	private static final MCPermColumnInfo _mfg_act_no = createColumnInfo("mfg_act_no");
	public final MCStringPermColumn mfg_act_no = createStringColumn(_mfg_act_no);
	
	/**
	 * 工程実績ＮＯ. Operation result No..<p>
	 *
	 */
	public static final String $oper_act_no = "oper_act_no";
	private static final MCPermColumnInfo _oper_act_no = createColumnInfo("oper_act_no");
	public final MCStringPermColumn oper_act_no = createStringColumn(_oper_act_no);
	
	/**
	 * 親品目ＣＤ. Parent item cd..<p>
	 *
	 */
	public static final String $par_itm_cd = "par_itm_cd";
	private static final MCPermColumnInfo _par_itm_cd = createColumnInfo("par_itm_cd");
	public final MCStringPermColumn par_itm_cd = createStringColumn(_par_itm_cd);
	
	/**
	 * 親枝番１. Parent branch No. 1.<p>
	 *
	 */
	public static final String $par_itm_sub1 = "par_itm_sub1";
	private static final MCPermColumnInfo _par_itm_sub1 = createColumnInfo("par_itm_sub1");
	public final MCStringPermColumn par_itm_sub1 = createStringColumn(_par_itm_sub1);
	
	/**
	 * 親枝番２. Parent branch No. 2.<p>
	 *
	 */
	public static final String $par_itm_sub2 = "par_itm_sub2";
	private static final MCPermColumnInfo _par_itm_sub2 = createColumnInfo("par_itm_sub2");
	public final MCStringPermColumn par_itm_sub2 = createStringColumn(_par_itm_sub2);
	
	/**
	 * 親枝番３. Parent branch No. 3.<p>
	 *
	 */
	public static final String $par_itm_sub3 = "par_itm_sub3";
	private static final MCPermColumnInfo _par_itm_sub3 = createColumnInfo("par_itm_sub3");
	public final MCStringPermColumn par_itm_sub3 = createStringColumn(_par_itm_sub3);
	
	/**
	 * 製造場所ＣＤ. Mfg. location cd..<p>
	 *
	 */
	public static final String $mfg_loc_cd = "mfg_loc_cd";
	private static final MCPermColumnInfo _mfg_loc_cd = createColumnInfo("mfg_loc_cd");
	public final MCStringPermColumn mfg_loc_cd = createStringColumn(_mfg_loc_cd);
	
	/**
	 * 工程ＣＤ. Operation cd..<p>
	 *
	 */
	public static final String $oper_cd = "oper_cd";
	private static final MCPermColumnInfo _oper_cd = createColumnInfo("oper_cd");
	public final MCStringPermColumn oper_cd = createStringColumn(_oper_cd);
	
	/**
	 * 着手実績日時. Actual start date and time.<p>
	 *
	 */
	public static final String $st_act_tm = "st_act_tm";
	private static final MCPermColumnInfo _st_act_tm = createColumnInfo("st_act_tm");
	public final MCDatePermColumn st_act_tm = createDateColumn(_st_act_tm);
	
	/**
	 * 終了実績日時. Actual end date and time.<p>
	 *
	 */
	public static final String $end_act_tm = "end_act_tm";
	private static final MCPermColumnInfo _end_act_tm = createColumnInfo("end_act_tm");
	public final MCDatePermColumn end_act_tm = createDateColumn(_end_act_tm);
	
	/**
	 * ＢＦ対象子品目件数. Number of child items for BF.<p>
	 *
	 */
	public static final String $bf_tgt_cnt = "bf_tgt_cnt";
	private static final MCPermColumnInfo _bf_tgt_cnt = createColumnInfo("bf_tgt_cnt");
	public final MCNumberPermColumn bf_tgt_cnt = createNumberColumn(_bf_tgt_cnt);
	
	/**
	 * ＢＦ成功子品目件数. Number of child items in BF success.<p>
	 *
	 */
	public static final String $bf_success_cnt = "bf_success_cnt";
	private static final MCPermColumnInfo _bf_success_cnt = createColumnInfo("bf_success_cnt");
	public final MCNumberPermColumn bf_success_cnt = createNumberColumn(_bf_success_cnt);
	
	/**
	 * ＢＦ失敗子品目件数. Number of child items in BF failure.<p>
	 *
	 */
	public static final String $bf_failure_cnt = "bf_failure_cnt";
	private static final MCPermColumnInfo _bf_failure_cnt = createColumnInfo("bf_failure_cnt");
	public final MCNumberPermColumn bf_failure_cnt = createNumberColumn(_bf_failure_cnt);
	
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
	 * 親品名. Parent item name.<p>
	 *
	 */
	public static final String $par_itm_nm = "par_itm_nm";
	
	/**
	 * 製造場所名. Mfg. location name.<p>
	 *
	 */
	public static final String $mfg_loc_nm = "mfg_loc_nm";
	
	/**
	 * 工程名. Operation name.<p>
	 *
	 */
	public static final String $oper_nm = "oper_nm";
	
	public static final MCMeta batch_data_no_META = createCommonMeta($batch_data_no, mcframe.commonMA.meta.MA_META.BATCH_DATA_NO);
	public static final MCMeta batch_log_no_META = createCommonMeta($batch_log_no, mcframe.commonMA.meta.MA_META.BATCH_LOG_NO);
	public static final MCMeta log_sub_key1_META = createCommonMeta($log_sub_key1, mcframe.commonMA.meta.MA_META.BATCH_LOG_SUB_KEY1);
	public static final MCMeta log_sub_key2_META = createCommonMeta($log_sub_key2, mcframe.commonMA.meta.MA_META.BATCH_LOG_SUB_KEY2);
	public static final MCMeta exe_sts_typ_META = createCommonMeta($exe_sts_typ, mcframe.commonMA.meta.MA_META.EXE_STS_TYP);
	public static final MCMeta mfg_inst_no_META = createCommonMeta($mfg_inst_no, mcframe.commonMA.meta.MA_META.MFG_INST_NO);
	public static final MCMeta div_seq_META = createCommonMeta($div_seq, mcframe.commonMS.meta.MS_META.DIV_SEQ);
	public static final MCMeta mfg_act_no_META = createCommonMeta($mfg_act_no, mcframe.commonMA.meta.MA_META.MFG_ACT_NO);
	public static final MCMeta oper_act_no_META = createCommonMeta($oper_act_no, mcframe.commonMA.meta.MA_META.OPER_ACT_NO);
	public static final MCMeta par_itm_cd_META = createCommonMeta($par_itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta par_itm_sub1_META = createCommonMeta($par_itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta par_itm_sub2_META = createCommonMeta($par_itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta par_itm_sub3_META = createCommonMeta($par_itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta mfg_loc_cd_META = createCommonMeta($mfg_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta oper_cd_META = createCommonMeta($oper_cd, mcframe.commonMA.meta.MA_META.OPER_CD);
	public static final MCMeta st_act_tm_META = createCommonMeta($st_act_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta end_act_tm_META = createCommonMeta($end_act_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta bf_tgt_cnt_META = createCommonMeta($bf_tgt_cnt, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta bf_success_cnt_META = createCommonMeta($bf_success_cnt, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta bf_failure_cnt_META = createCommonMeta($bf_failure_cnt, mcframe.commonMA.meta.MA_META.INT);
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
	public static final MCMeta par_itm_nm_META = createCommonMeta($par_itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta mfg_loc_nm_META = createCommonMeta($mfg_loc_nm, mcframe.commonMA.meta.MA_META.LOC_NM);
	public static final MCMeta oper_nm_META = createCommonMeta($oper_nm, mcframe.commonMA.meta.MA_META.OPER_NM);

	protected static final List<MCForeignInfo> FOREIGN_INFO_LIST = new ArrayList<>();
	public static final String $MFG_INST1 = "MFG_INST1";
	public static final String $MFG_ACT1 = "MFG_ACT1";
	public static final String $OPER_ACT1 = "OPER_ACT1";
	public static final String $ITM1 = "ITM1";
	public static final String $LOC1 = "LOC1";
	public static final String $OPER1 = "OPER1";
	static {
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MST_MFG_INST",
				$MFG_INST1,
				new String[][]{
						{"mfg_inst_no", "mfg_inst_no"}
				},
				() -> {
					return mcframe.serverMS.dbc.MST_MFG_INST_R.create("MFG_INST1");
				},
				(alias) -> {
					MST_BF_BR_R own = MST_BF_BR_R.create(alias);
					mcframe.serverMS.dbc.MST_MFG_INST_R ref = mcframe.serverMS.dbc.MST_MFG_INST_R.create("MFG_INST1");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.mfg_inst_no.eq(ref.mfg_inst_no));
					return cond;
				}
			)
		);
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MST_MFG_ACT",
				$MFG_ACT1,
				new String[][]{
						{"mfg_act_no", "mfg_act_no"}
				},
				() -> {
					return mcframe.serverMS.dbc.MST_MFG_ACT_R.create("MFG_ACT1");
				},
				(alias) -> {
					MST_BF_BR_R own = MST_BF_BR_R.create(alias);
					mcframe.serverMS.dbc.MST_MFG_ACT_R ref = mcframe.serverMS.dbc.MST_MFG_ACT_R.create("MFG_ACT1");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.mfg_act_no.eq(ref.mfg_act_no));
					return cond;
				}
			)
		);
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MST_OPER_ACT",
				$OPER_ACT1,
				new String[][]{
						{"oper_act_no", "oper_act_no"}
				},
				() -> {
					return mcframe.serverMS.dbc.MST_OPER_ACT_R.create("OPER_ACT1");
				},
				(alias) -> {
					MST_BF_BR_R own = MST_BF_BR_R.create(alias);
					mcframe.serverMS.dbc.MST_OPER_ACT_R ref = mcframe.serverMS.dbc.MST_OPER_ACT_R.create("OPER_ACT1");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.oper_act_no.eq(ref.oper_act_no));
					return cond;
				}
			)
		);
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_ITM",
				$ITM1,
				new String[][]{
						{"par_itm_cd", "itm_cd"},
						{"par_itm_sub1", "itm_sub1"},
						{"par_itm_sub2", "itm_sub2"},
						{"par_itm_sub3", "itm_sub3"}
				},
				() -> {
					return mcframe.serverMA.dbc.MAM_ITM_R.create("ITM1");
				},
				(alias) -> {
					MST_BF_BR_R own = MST_BF_BR_R.create(alias);
					mcframe.serverMA.dbc.MAM_ITM_R ref = mcframe.serverMA.dbc.MAM_ITM_R.create("ITM1");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.par_itm_cd.eq(ref.itm_cd));
					cond = cond.and(own.par_itm_sub1.eq(ref.itm_sub1));
					cond = cond.and(own.par_itm_sub2.eq(ref.itm_sub2));
					cond = cond.and(own.par_itm_sub3.eq(ref.itm_sub3));
					return cond;
				}
			)
		);
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_LOC",
				$LOC1,
				new String[][]{
						{"mfg_loc_cd", "loc_cd"}
				},
				() -> {
					return mcframe.serverMA.dbc.MAM_LOC_R.create("LOC1");
				},
				(alias) -> {
					MST_BF_BR_R own = MST_BF_BR_R.create(alias);
					mcframe.serverMA.dbc.MAM_LOC_R ref = mcframe.serverMA.dbc.MAM_LOC_R.create("LOC1");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.mfg_loc_cd.eq(ref.loc_cd));
					return cond;
				}
			)
		);
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_OPER",
				$OPER1,
				new String[][]{
						{"oper_cd", "oper_cd"}
				},
				() -> {
					return mcframe.serverMA.dbc.MAM_OPER_R.create("OPER1");
				},
				(alias) -> {
					MST_BF_BR_R own = MST_BF_BR_R.create(alias);
					mcframe.serverMA.dbc.MAM_OPER_R ref = mcframe.serverMA.dbc.MAM_OPER_R.create("OPER1");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.oper_cd.eq(ref.oper_cd));
					return cond;
				}
			)
		);
	}
	
	protected static final ConstMetaList<MST_BF_BR_R> constMetas = new ConstMetaList<MST_BF_BR_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			batch_data_no_META,
			batch_log_no_META,
			log_sub_key1_META,
			log_sub_key2_META,
			exe_sts_typ_META,
			mfg_inst_no_META,
			div_seq_META,
			mfg_act_no_META,
			oper_act_no_META,
			par_itm_cd_META,
			par_itm_sub1_META,
			par_itm_sub2_META,
			par_itm_sub3_META,
			mfg_loc_cd_META,
			oper_cd_META,
			st_act_tm_META,
			end_act_tm_META,
			bf_tgt_cnt_META,
			bf_success_cnt_META,
			bf_failure_cnt_META,
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
			par_itm_nm_META,
			mfg_loc_nm_META,
			oper_nm_META
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
	protected MST_BF_BR_R(ConstMetaList<? extends MST_BF_BR_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MST_BF_BR_R(ConstMetaList<? extends MST_BF_BR_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MST_BF_BR_R.$batch_data_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BF_BR_R.$batch_data_no,
				"batch_data_no",
				batch_data_no,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BF_BR_R.$batch_log_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BF_BR_R.$batch_log_no,
				"batch_log_no",
				batch_log_no,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BF_BR_R.$log_sub_key1,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BF_BR_R.$log_sub_key1,
				"log_sub_key1",
				log_sub_key1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BF_BR_R.$log_sub_key2,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BF_BR_R.$log_sub_key2,
				"log_sub_key2",
				log_sub_key2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BF_BR_R.$exe_sts_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BF_BR_R.$exe_sts_typ,
				"exe_sts_typ",
				exe_sts_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BF_BR_R.$mfg_inst_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BF_BR_R.$mfg_inst_no,
				"mfg_inst_no",
				mfg_inst_no,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BF_BR_R.$div_seq,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BF_BR_R.$div_seq,
				"div_seq",
				div_seq,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BF_BR_R.$mfg_act_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BF_BR_R.$mfg_act_no,
				"mfg_act_no",
				mfg_act_no,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BF_BR_R.$oper_act_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BF_BR_R.$oper_act_no,
				"oper_act_no",
				oper_act_no,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BF_BR_R.$par_itm_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BF_BR_R.$par_itm_cd,
				"par_itm_cd",
				par_itm_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BF_BR_R.$par_itm_sub1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BF_BR_R.$par_itm_sub1,
				"par_itm_sub1",
				par_itm_sub1,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BF_BR_R.$par_itm_sub2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BF_BR_R.$par_itm_sub2,
				"par_itm_sub2",
				par_itm_sub2,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BF_BR_R.$par_itm_sub3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BF_BR_R.$par_itm_sub3,
				"par_itm_sub3",
				par_itm_sub3,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BF_BR_R.$mfg_loc_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BF_BR_R.$mfg_loc_cd,
				"mfg_loc_cd",
				mfg_loc_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BF_BR_R.$oper_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BF_BR_R.$oper_cd,
				"oper_cd",
				oper_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BF_BR_R.$st_act_tm,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_BF_BR_R.$st_act_tm,
				"st_act_tm",
				st_act_tm,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BF_BR_R.$end_act_tm,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_BF_BR_R.$end_act_tm,
				"end_act_tm",
				end_act_tm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BF_BR_R.$bf_tgt_cnt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BF_BR_R.$bf_tgt_cnt,
				"bf_tgt_cnt",
				bf_tgt_cnt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BF_BR_R.$bf_success_cnt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BF_BR_R.$bf_success_cnt,
				"bf_success_cnt",
				bf_success_cnt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BF_BR_R.$bf_failure_cnt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BF_BR_R.$bf_failure_cnt,
				"bf_failure_cnt",
				bf_failure_cnt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BF_BR_R.$ins_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BF_BR_R.$ins_usr_id,
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
			MST_BF_BR_R.$ins_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BF_BR_R.$ins_usr_nm,
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
			MST_BF_BR_R.$ins_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MST_BF_BR_R.$ins_ts,
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
			MST_BF_BR_R.$ins_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BF_BR_R.$ins_func_id,
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
			MST_BF_BR_R.$upd_cntr,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BF_BR_R.$upd_cntr,
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
			MST_BF_BR_R.$upd_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BF_BR_R.$upd_usr_id,
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
			MST_BF_BR_R.$upd_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BF_BR_R.$upd_usr_nm,
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
			MST_BF_BR_R.$upd_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MST_BF_BR_R.$upd_ts,
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
			MST_BF_BR_R.$upd_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BF_BR_R.$upd_func_id,
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
			MST_BF_BR_R.$upd_srv_req_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BF_BR_R.$upd_srv_req_no,
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
			MST_BF_BR_R.$par_itm_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BF_BR_R.$par_itm_nm,
				"par_itm_nm",
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
			MST_BF_BR_R.$mfg_loc_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BF_BR_R.$mfg_loc_nm,
				"mfg_loc_nm",
				null,
				false,
				true,
				false,
				false,
				true,
				"LOC1.LOC_NM"
			)
		);
		COLUMN_MAP.put(
			MST_BF_BR_R.$oper_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BF_BR_R.$oper_nm,
				"oper_nm",
				null,
				false,
				true,
				false,
				false,
				true,
				"OPER1.OPER_NM"
			)
		);
		return COLUMN_MAP;
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MST_BF_BR_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MST_BF_BR_R create(String alias) {
		MST_BF_BR_R row = new MST_BF_BR_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MST_BF_BR_R createByName(T proto) {
		MST_BF_BR_R row = MST_BF_BR_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MST_BF_BR_R clone() {
		return (MST_BF_BR_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MST_BF_BR_R createInstance() {
		return (MST_BF_BR_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MST_BF_BR_R getValues(String... names) {
		return (MST_BF_BR_R) super.getValues(names);
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
	 public MSW_BF_BR_KEY_R getPkWorkDbc(String alias) {
	 	return MSW_BF_BR_KEY_R.create(alias);
	 }

	/*
	 * MCDBContainerのオーバーライドメソッドです。
	 */
	 public MSW_BF_BR_KEY_R getPkWorkDbc() {
	 	return getPkWorkDbc(MSW_BF_BR_KEY_R.TABLE_NAME);
	 }

	/**
	 * バッチデータＮＯ. Batch data No..<p>
	 *
	 */
	public String batch_data_no() {
		return getConstString(offset + 0, $batch_data_no);
	}

	/**
	 * バッチデータＮＯ. Batch data No..<p>
	 *
	 */
	public void batch_data_no(String value) {
		setConstString(offset + 0, $batch_data_no, value);
	}

	/**
	 * ログＮＯ. Log No..<p>
	 *
	 */
	public String batch_log_no() {
		return getConstString(offset + 1, $batch_log_no);
	}

	/**
	 * ログＮＯ. Log No..<p>
	 *
	 */
	public void batch_log_no(String value) {
		setConstString(offset + 1, $batch_log_no, value);
	}

	/**
	 * ログサブキー１. Log sub key 1.<p>
	 *
	 */
	public MCNumber log_sub_key1() {
		return getConstNumber(offset + 2, $log_sub_key1);
	}

	/**
	 * ログサブキー１. Log sub key 1.<p>
	 *
	 */
	public void log_sub_key1(MCNumber value) {
		setConstNumber(offset + 2, $log_sub_key1, value);
	}
	
	/**
	 * ログサブキー１. Log sub key 1.<p>
	 *
	 */
	public void log_sub_key1(int value) {
		setConstNumber(offset + 2, $log_sub_key1, value);
	}
	
	/**
	 * ログサブキー１. Log sub key 1.<p>
	 *
	 */
	public void log_sub_key1(long value) {
		setConstNumber(offset + 2, $log_sub_key1, value);
	}
	
	/**
	 * ログサブキー１. Log sub key 1.<p>
	 *
	 */
	public void log_sub_key1(float value) {
		setConstNumber(offset + 2, $log_sub_key1, value);
	}
	
	/**
	 * ログサブキー１. Log sub key 1.<p>
	 *
	 */
	public void log_sub_key1(double value) {
		setConstNumber(offset + 2, $log_sub_key1, value);
	}
	
	/**
	 * ログサブキー２. Log sub key 2.<p>
	 *
	 */
	public MCNumber log_sub_key2() {
		return getConstNumber(offset + 3, $log_sub_key2);
	}

	/**
	 * ログサブキー２. Log sub key 2.<p>
	 *
	 */
	public void log_sub_key2(MCNumber value) {
		setConstNumber(offset + 3, $log_sub_key2, value);
	}
	
	/**
	 * ログサブキー２. Log sub key 2.<p>
	 *
	 */
	public void log_sub_key2(int value) {
		setConstNumber(offset + 3, $log_sub_key2, value);
	}
	
	/**
	 * ログサブキー２. Log sub key 2.<p>
	 *
	 */
	public void log_sub_key2(long value) {
		setConstNumber(offset + 3, $log_sub_key2, value);
	}
	
	/**
	 * ログサブキー２. Log sub key 2.<p>
	 *
	 */
	public void log_sub_key2(float value) {
		setConstNumber(offset + 3, $log_sub_key2, value);
	}
	
	/**
	 * ログサブキー２. Log sub key 2.<p>
	 *
	 */
	public void log_sub_key2(double value) {
		setConstNumber(offset + 3, $log_sub_key2, value);
	}
	
	/**
	 * ＰＧ実行状況区分. PG execution status type.<p>
	 *
	 */
	public String exe_sts_typ() {
		return getConstString(offset + 4, $exe_sts_typ);
	}

	/**
	 * ＰＧ実行状況区分. PG execution status type.<p>
	 *
	 */
	public void exe_sts_typ(String value) {
		setConstString(offset + 4, $exe_sts_typ, value);
	}

	/**
	 * 製造指図ＮＯ. Mfg. order No..<p>
	 *
	 */
	public String mfg_inst_no() {
		return getConstString(offset + 5, $mfg_inst_no);
	}

	/**
	 * 製造指図ＮＯ. Mfg. order No..<p>
	 *
	 */
	public void mfg_inst_no(String value) {
		setConstString(offset + 5, $mfg_inst_no, value);
	}

	/**
	 * 分割連番. Split sequence number.<p>
	 *
	 */
	public MCNumber div_seq() {
		return getConstNumber(offset + 6, $div_seq);
	}

	/**
	 * 分割連番. Split sequence number.<p>
	 *
	 */
	public void div_seq(MCNumber value) {
		setConstNumber(offset + 6, $div_seq, value);
	}
	
	/**
	 * 分割連番. Split sequence number.<p>
	 *
	 */
	public void div_seq(int value) {
		setConstNumber(offset + 6, $div_seq, value);
	}
	
	/**
	 * 分割連番. Split sequence number.<p>
	 *
	 */
	public void div_seq(long value) {
		setConstNumber(offset + 6, $div_seq, value);
	}
	
	/**
	 * 分割連番. Split sequence number.<p>
	 *
	 */
	public void div_seq(float value) {
		setConstNumber(offset + 6, $div_seq, value);
	}
	
	/**
	 * 分割連番. Split sequence number.<p>
	 *
	 */
	public void div_seq(double value) {
		setConstNumber(offset + 6, $div_seq, value);
	}
	
	/**
	 * 製造実績ＮＯ. Mfg. result No..<p>
	 *
	 */
	public String mfg_act_no() {
		return getConstString(offset + 7, $mfg_act_no);
	}

	/**
	 * 製造実績ＮＯ. Mfg. result No..<p>
	 *
	 */
	public void mfg_act_no(String value) {
		setConstString(offset + 7, $mfg_act_no, value);
	}

	/**
	 * 工程実績ＮＯ. Operation result No..<p>
	 *
	 */
	public String oper_act_no() {
		return getConstString(offset + 8, $oper_act_no);
	}

	/**
	 * 工程実績ＮＯ. Operation result No..<p>
	 *
	 */
	public void oper_act_no(String value) {
		setConstString(offset + 8, $oper_act_no, value);
	}

	/**
	 * 親品目ＣＤ. Parent item cd..<p>
	 *
	 */
	public String par_itm_cd() {
		return getConstString(offset + 9, $par_itm_cd);
	}

	/**
	 * 親品目ＣＤ. Parent item cd..<p>
	 *
	 */
	public void par_itm_cd(String value) {
		setConstString(offset + 9, $par_itm_cd, value);
	}

	/**
	 * 親枝番１. Parent branch No. 1.<p>
	 *
	 */
	public String par_itm_sub1() {
		return getConstString(offset + 10, $par_itm_sub1);
	}

	/**
	 * 親枝番１. Parent branch No. 1.<p>
	 *
	 */
	public void par_itm_sub1(String value) {
		setConstString(offset + 10, $par_itm_sub1, value);
	}

	/**
	 * 親枝番２. Parent branch No. 2.<p>
	 *
	 */
	public String par_itm_sub2() {
		return getConstString(offset + 11, $par_itm_sub2);
	}

	/**
	 * 親枝番２. Parent branch No. 2.<p>
	 *
	 */
	public void par_itm_sub2(String value) {
		setConstString(offset + 11, $par_itm_sub2, value);
	}

	/**
	 * 親枝番３. Parent branch No. 3.<p>
	 *
	 */
	public String par_itm_sub3() {
		return getConstString(offset + 12, $par_itm_sub3);
	}

	/**
	 * 親枝番３. Parent branch No. 3.<p>
	 *
	 */
	public void par_itm_sub3(String value) {
		setConstString(offset + 12, $par_itm_sub3, value);
	}

	/**
	 * 製造場所ＣＤ. Mfg. location cd..<p>
	 *
	 */
	public String mfg_loc_cd() {
		return getConstString(offset + 13, $mfg_loc_cd);
	}

	/**
	 * 製造場所ＣＤ. Mfg. location cd..<p>
	 *
	 */
	public void mfg_loc_cd(String value) {
		setConstString(offset + 13, $mfg_loc_cd, value);
	}

	/**
	 * 工程ＣＤ. Operation cd..<p>
	 *
	 */
	public String oper_cd() {
		return getConstString(offset + 14, $oper_cd);
	}

	/**
	 * 工程ＣＤ. Operation cd..<p>
	 *
	 */
	public void oper_cd(String value) {
		setConstString(offset + 14, $oper_cd, value);
	}

	/**
	 * 着手実績日時. Actual start date and time.<p>
	 *
	 */
	public MCDate st_act_tm() {
		return getConstDate(offset + 15, $st_act_tm);
	}

	/**
	 * 着手実績日時. Actual start date and time.<p>
	 *
	 */
	public void st_act_tm(MCDate value) {
		setConstDate(offset + 15, $st_act_tm, value);
	}

	/**
	 * 終了実績日時. Actual end date and time.<p>
	 *
	 */
	public MCDate end_act_tm() {
		return getConstDate(offset + 16, $end_act_tm);
	}

	/**
	 * 終了実績日時. Actual end date and time.<p>
	 *
	 */
	public void end_act_tm(MCDate value) {
		setConstDate(offset + 16, $end_act_tm, value);
	}

	/**
	 * ＢＦ対象子品目件数. Number of child items for BF.<p>
	 *
	 */
	public MCNumber bf_tgt_cnt() {
		return getConstNumber(offset + 17, $bf_tgt_cnt);
	}

	/**
	 * ＢＦ対象子品目件数. Number of child items for BF.<p>
	 *
	 */
	public void bf_tgt_cnt(MCNumber value) {
		setConstNumber(offset + 17, $bf_tgt_cnt, value);
	}
	
	/**
	 * ＢＦ対象子品目件数. Number of child items for BF.<p>
	 *
	 */
	public void bf_tgt_cnt(int value) {
		setConstNumber(offset + 17, $bf_tgt_cnt, value);
	}
	
	/**
	 * ＢＦ対象子品目件数. Number of child items for BF.<p>
	 *
	 */
	public void bf_tgt_cnt(long value) {
		setConstNumber(offset + 17, $bf_tgt_cnt, value);
	}
	
	/**
	 * ＢＦ対象子品目件数. Number of child items for BF.<p>
	 *
	 */
	public void bf_tgt_cnt(float value) {
		setConstNumber(offset + 17, $bf_tgt_cnt, value);
	}
	
	/**
	 * ＢＦ対象子品目件数. Number of child items for BF.<p>
	 *
	 */
	public void bf_tgt_cnt(double value) {
		setConstNumber(offset + 17, $bf_tgt_cnt, value);
	}
	
	/**
	 * ＢＦ成功子品目件数. Number of child items in BF success.<p>
	 *
	 */
	public MCNumber bf_success_cnt() {
		return getConstNumber(offset + 18, $bf_success_cnt);
	}

	/**
	 * ＢＦ成功子品目件数. Number of child items in BF success.<p>
	 *
	 */
	public void bf_success_cnt(MCNumber value) {
		setConstNumber(offset + 18, $bf_success_cnt, value);
	}
	
	/**
	 * ＢＦ成功子品目件数. Number of child items in BF success.<p>
	 *
	 */
	public void bf_success_cnt(int value) {
		setConstNumber(offset + 18, $bf_success_cnt, value);
	}
	
	/**
	 * ＢＦ成功子品目件数. Number of child items in BF success.<p>
	 *
	 */
	public void bf_success_cnt(long value) {
		setConstNumber(offset + 18, $bf_success_cnt, value);
	}
	
	/**
	 * ＢＦ成功子品目件数. Number of child items in BF success.<p>
	 *
	 */
	public void bf_success_cnt(float value) {
		setConstNumber(offset + 18, $bf_success_cnt, value);
	}
	
	/**
	 * ＢＦ成功子品目件数. Number of child items in BF success.<p>
	 *
	 */
	public void bf_success_cnt(double value) {
		setConstNumber(offset + 18, $bf_success_cnt, value);
	}
	
	/**
	 * ＢＦ失敗子品目件数. Number of child items in BF failure.<p>
	 *
	 */
	public MCNumber bf_failure_cnt() {
		return getConstNumber(offset + 19, $bf_failure_cnt);
	}

	/**
	 * ＢＦ失敗子品目件数. Number of child items in BF failure.<p>
	 *
	 */
	public void bf_failure_cnt(MCNumber value) {
		setConstNumber(offset + 19, $bf_failure_cnt, value);
	}
	
	/**
	 * ＢＦ失敗子品目件数. Number of child items in BF failure.<p>
	 *
	 */
	public void bf_failure_cnt(int value) {
		setConstNumber(offset + 19, $bf_failure_cnt, value);
	}
	
	/**
	 * ＢＦ失敗子品目件数. Number of child items in BF failure.<p>
	 *
	 */
	public void bf_failure_cnt(long value) {
		setConstNumber(offset + 19, $bf_failure_cnt, value);
	}
	
	/**
	 * ＢＦ失敗子品目件数. Number of child items in BF failure.<p>
	 *
	 */
	public void bf_failure_cnt(float value) {
		setConstNumber(offset + 19, $bf_failure_cnt, value);
	}
	
	/**
	 * ＢＦ失敗子品目件数. Number of child items in BF failure.<p>
	 *
	 */
	public void bf_failure_cnt(double value) {
		setConstNumber(offset + 19, $bf_failure_cnt, value);
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

	/**
	 * 親品名. Parent item name.<p>
	 *
	 */
	public String par_itm_nm() {
		return getConstString(offset + 30, $par_itm_nm);
	}

	/**
	 * 親品名. Parent item name.<p>
	 *
	 */
	public void par_itm_nm(String value) {
		setConstString(offset + 30, $par_itm_nm, value);
	}

	/**
	 * 製造場所名. Mfg. location name.<p>
	 *
	 */
	public String mfg_loc_nm() {
		return getConstString(offset + 31, $mfg_loc_nm);
	}

	/**
	 * 製造場所名. Mfg. location name.<p>
	 *
	 */
	public void mfg_loc_nm(String value) {
		setConstString(offset + 31, $mfg_loc_nm, value);
	}

	/**
	 * 工程名. Operation name.<p>
	 *
	 */
	public String oper_nm() {
		return getConstString(offset + 32, $oper_nm);
	}

	/**
	 * 工程名. Operation name.<p>
	 *
	 */
	public void oper_nm(String value) {
		setConstString(offset + 32, $oper_nm, value);
	}

	public String getString(String name) {
		if ($batch_data_no.equalsIgnoreCase(name)) {
			return batch_data_no();
		}
		if ($batch_log_no.equalsIgnoreCase(name)) {
			return batch_log_no();
		}
		if ($exe_sts_typ.equalsIgnoreCase(name)) {
			return exe_sts_typ();
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			return mfg_inst_no();
		}
		if ($mfg_act_no.equalsIgnoreCase(name)) {
			return mfg_act_no();
		}
		if ($oper_act_no.equalsIgnoreCase(name)) {
			return oper_act_no();
		}
		if ($par_itm_cd.equalsIgnoreCase(name)) {
			return par_itm_cd();
		}
		if ($par_itm_sub1.equalsIgnoreCase(name)) {
			return par_itm_sub1();
		}
		if ($par_itm_sub2.equalsIgnoreCase(name)) {
			return par_itm_sub2();
		}
		if ($par_itm_sub3.equalsIgnoreCase(name)) {
			return par_itm_sub3();
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			return mfg_loc_cd();
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			return oper_cd();
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
		if ($par_itm_nm.equalsIgnoreCase(name)) {
			return par_itm_nm();
		}
		if ($mfg_loc_nm.equalsIgnoreCase(name)) {
			return mfg_loc_nm();
		}
		if ($oper_nm.equalsIgnoreCase(name)) {
			return oper_nm();
		}
		return super.getString(name);
	}

	public MCNumber getNumber(String name) {
		if ($log_sub_key1.equalsIgnoreCase(name)) {
			return log_sub_key1();
		}
		if ($log_sub_key2.equalsIgnoreCase(name)) {
			return log_sub_key2();
		}
		if ($div_seq.equalsIgnoreCase(name)) {
			return div_seq();
		}
		if ($bf_tgt_cnt.equalsIgnoreCase(name)) {
			return bf_tgt_cnt();
		}
		if ($bf_success_cnt.equalsIgnoreCase(name)) {
			return bf_success_cnt();
		}
		if ($bf_failure_cnt.equalsIgnoreCase(name)) {
			return bf_failure_cnt();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumber(name);
	}

	public MCDate getDate(String name) {
		if ($st_act_tm.equalsIgnoreCase(name)) {
			return st_act_tm();
		}
		if ($end_act_tm.equalsIgnoreCase(name)) {
			return end_act_tm();
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
		if ($batch_data_no.equalsIgnoreCase(name)) {
			return batch_data_no();
		}
		if ($batch_log_no.equalsIgnoreCase(name)) {
			return batch_log_no();
		}
		if ($exe_sts_typ.equalsIgnoreCase(name)) {
			return exe_sts_typ();
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			return mfg_inst_no();
		}
		if ($mfg_act_no.equalsIgnoreCase(name)) {
			return mfg_act_no();
		}
		if ($oper_act_no.equalsIgnoreCase(name)) {
			return oper_act_no();
		}
		if ($par_itm_cd.equalsIgnoreCase(name)) {
			return par_itm_cd();
		}
		if ($par_itm_sub1.equalsIgnoreCase(name)) {
			return par_itm_sub1();
		}
		if ($par_itm_sub2.equalsIgnoreCase(name)) {
			return par_itm_sub2();
		}
		if ($par_itm_sub3.equalsIgnoreCase(name)) {
			return par_itm_sub3();
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			return mfg_loc_cd();
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			return oper_cd();
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
		if ($par_itm_nm.equalsIgnoreCase(name)) {
			return par_itm_nm();
		}
		if ($mfg_loc_nm.equalsIgnoreCase(name)) {
			return mfg_loc_nm();
		}
		if ($oper_nm.equalsIgnoreCase(name)) {
			return oper_nm();
		}
		return super.getStringNE(name);
	}

	public MCNumber getNumberNE(String name) {
		if ($log_sub_key1.equalsIgnoreCase(name)) {
			return log_sub_key1();
		}
		if ($log_sub_key2.equalsIgnoreCase(name)) {
			return log_sub_key2();
		}
		if ($div_seq.equalsIgnoreCase(name)) {
			return div_seq();
		}
		if ($bf_tgt_cnt.equalsIgnoreCase(name)) {
			return bf_tgt_cnt();
		}
		if ($bf_success_cnt.equalsIgnoreCase(name)) {
			return bf_success_cnt();
		}
		if ($bf_failure_cnt.equalsIgnoreCase(name)) {
			return bf_failure_cnt();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumberNE(name);
	}

	public MCDate getDateNE(String name) {
		if ($st_act_tm.equalsIgnoreCase(name)) {
			return st_act_tm();
		}
		if ($end_act_tm.equalsIgnoreCase(name)) {
			return end_act_tm();
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
		if ($batch_data_no.equalsIgnoreCase(name)) {
			batch_data_no(value);
			return;
		}
		if ($batch_log_no.equalsIgnoreCase(name)) {
			batch_log_no(value);
			return;
		}
		if ($exe_sts_typ.equalsIgnoreCase(name)) {
			exe_sts_typ(value);
			return;
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			mfg_inst_no(value);
			return;
		}
		if ($mfg_act_no.equalsIgnoreCase(name)) {
			mfg_act_no(value);
			return;
		}
		if ($oper_act_no.equalsIgnoreCase(name)) {
			oper_act_no(value);
			return;
		}
		if ($par_itm_cd.equalsIgnoreCase(name)) {
			par_itm_cd(value);
			return;
		}
		if ($par_itm_sub1.equalsIgnoreCase(name)) {
			par_itm_sub1(value);
			return;
		}
		if ($par_itm_sub2.equalsIgnoreCase(name)) {
			par_itm_sub2(value);
			return;
		}
		if ($par_itm_sub3.equalsIgnoreCase(name)) {
			par_itm_sub3(value);
			return;
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			mfg_loc_cd(value);
			return;
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			oper_cd(value);
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
		if ($par_itm_nm.equalsIgnoreCase(name)) {
			par_itm_nm(value);
			return;
		}
		if ($mfg_loc_nm.equalsIgnoreCase(name)) {
			mfg_loc_nm(value);
			return;
		}
		if ($oper_nm.equalsIgnoreCase(name)) {
			oper_nm(value);
			return;
		}
		super.setString(name, value);
	}

	public void setNumber(String name, MCNumber value) {
		if ($log_sub_key1.equalsIgnoreCase(name)) {
			log_sub_key1(value);
			return;
		}
		if ($log_sub_key2.equalsIgnoreCase(name)) {
			log_sub_key2(value);
			return;
		}
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($bf_tgt_cnt.equalsIgnoreCase(name)) {
			bf_tgt_cnt(value);
			return;
		}
		if ($bf_success_cnt.equalsIgnoreCase(name)) {
			bf_success_cnt(value);
			return;
		}
		if ($bf_failure_cnt.equalsIgnoreCase(name)) {
			bf_failure_cnt(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, int value) {
		if ($log_sub_key1.equalsIgnoreCase(name)) {
			log_sub_key1(value);
			return;
		}
		if ($log_sub_key2.equalsIgnoreCase(name)) {
			log_sub_key2(value);
			return;
		}
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($bf_tgt_cnt.equalsIgnoreCase(name)) {
			bf_tgt_cnt(value);
			return;
		}
		if ($bf_success_cnt.equalsIgnoreCase(name)) {
			bf_success_cnt(value);
			return;
		}
		if ($bf_failure_cnt.equalsIgnoreCase(name)) {
			bf_failure_cnt(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, long value) {
		if ($log_sub_key1.equalsIgnoreCase(name)) {
			log_sub_key1(value);
			return;
		}
		if ($log_sub_key2.equalsIgnoreCase(name)) {
			log_sub_key2(value);
			return;
		}
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($bf_tgt_cnt.equalsIgnoreCase(name)) {
			bf_tgt_cnt(value);
			return;
		}
		if ($bf_success_cnt.equalsIgnoreCase(name)) {
			bf_success_cnt(value);
			return;
		}
		if ($bf_failure_cnt.equalsIgnoreCase(name)) {
			bf_failure_cnt(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, float value) {
		if ($log_sub_key1.equalsIgnoreCase(name)) {
			log_sub_key1(value);
			return;
		}
		if ($log_sub_key2.equalsIgnoreCase(name)) {
			log_sub_key2(value);
			return;
		}
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($bf_tgt_cnt.equalsIgnoreCase(name)) {
			bf_tgt_cnt(value);
			return;
		}
		if ($bf_success_cnt.equalsIgnoreCase(name)) {
			bf_success_cnt(value);
			return;
		}
		if ($bf_failure_cnt.equalsIgnoreCase(name)) {
			bf_failure_cnt(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, double value) {
		if ($log_sub_key1.equalsIgnoreCase(name)) {
			log_sub_key1(value);
			return;
		}
		if ($log_sub_key2.equalsIgnoreCase(name)) {
			log_sub_key2(value);
			return;
		}
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($bf_tgt_cnt.equalsIgnoreCase(name)) {
			bf_tgt_cnt(value);
			return;
		}
		if ($bf_success_cnt.equalsIgnoreCase(name)) {
			bf_success_cnt(value);
			return;
		}
		if ($bf_failure_cnt.equalsIgnoreCase(name)) {
			bf_failure_cnt(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setDate(String name, MCDate value) {
		if ($st_act_tm.equalsIgnoreCase(name)) {
			st_act_tm(value);
			return;
		}
		if ($end_act_tm.equalsIgnoreCase(name)) {
			end_act_tm(value);
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
		if ($batch_data_no.equalsIgnoreCase(name)) {
			batch_data_no(value);
			return;
		}
		if ($batch_log_no.equalsIgnoreCase(name)) {
			batch_log_no(value);
			return;
		}
		if ($exe_sts_typ.equalsIgnoreCase(name)) {
			exe_sts_typ(value);
			return;
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			mfg_inst_no(value);
			return;
		}
		if ($mfg_act_no.equalsIgnoreCase(name)) {
			mfg_act_no(value);
			return;
		}
		if ($oper_act_no.equalsIgnoreCase(name)) {
			oper_act_no(value);
			return;
		}
		if ($par_itm_cd.equalsIgnoreCase(name)) {
			par_itm_cd(value);
			return;
		}
		if ($par_itm_sub1.equalsIgnoreCase(name)) {
			par_itm_sub1(value);
			return;
		}
		if ($par_itm_sub2.equalsIgnoreCase(name)) {
			par_itm_sub2(value);
			return;
		}
		if ($par_itm_sub3.equalsIgnoreCase(name)) {
			par_itm_sub3(value);
			return;
		}
		if ($mfg_loc_cd.equalsIgnoreCase(name)) {
			mfg_loc_cd(value);
			return;
		}
		if ($oper_cd.equalsIgnoreCase(name)) {
			oper_cd(value);
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
		if ($par_itm_nm.equalsIgnoreCase(name)) {
			par_itm_nm(value);
			return;
		}
		if ($mfg_loc_nm.equalsIgnoreCase(name)) {
			mfg_loc_nm(value);
			return;
		}
		if ($oper_nm.equalsIgnoreCase(name)) {
			oper_nm(value);
			return;
		}
		super.setStringNE(name, value);
	}

	public void setNumberNE(String name, MCNumber value) {
		if ($log_sub_key1.equalsIgnoreCase(name)) {
			log_sub_key1(value);
			return;
		}
		if ($log_sub_key2.equalsIgnoreCase(name)) {
			log_sub_key2(value);
			return;
		}
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($bf_tgt_cnt.equalsIgnoreCase(name)) {
			bf_tgt_cnt(value);
			return;
		}
		if ($bf_success_cnt.equalsIgnoreCase(name)) {
			bf_success_cnt(value);
			return;
		}
		if ($bf_failure_cnt.equalsIgnoreCase(name)) {
			bf_failure_cnt(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, int value) {
		if ($log_sub_key1.equalsIgnoreCase(name)) {
			log_sub_key1(value);
			return;
		}
		if ($log_sub_key2.equalsIgnoreCase(name)) {
			log_sub_key2(value);
			return;
		}
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($bf_tgt_cnt.equalsIgnoreCase(name)) {
			bf_tgt_cnt(value);
			return;
		}
		if ($bf_success_cnt.equalsIgnoreCase(name)) {
			bf_success_cnt(value);
			return;
		}
		if ($bf_failure_cnt.equalsIgnoreCase(name)) {
			bf_failure_cnt(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, long value) {
		if ($log_sub_key1.equalsIgnoreCase(name)) {
			log_sub_key1(value);
			return;
		}
		if ($log_sub_key2.equalsIgnoreCase(name)) {
			log_sub_key2(value);
			return;
		}
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($bf_tgt_cnt.equalsIgnoreCase(name)) {
			bf_tgt_cnt(value);
			return;
		}
		if ($bf_success_cnt.equalsIgnoreCase(name)) {
			bf_success_cnt(value);
			return;
		}
		if ($bf_failure_cnt.equalsIgnoreCase(name)) {
			bf_failure_cnt(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, float value) {
		if ($log_sub_key1.equalsIgnoreCase(name)) {
			log_sub_key1(value);
			return;
		}
		if ($log_sub_key2.equalsIgnoreCase(name)) {
			log_sub_key2(value);
			return;
		}
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($bf_tgt_cnt.equalsIgnoreCase(name)) {
			bf_tgt_cnt(value);
			return;
		}
		if ($bf_success_cnt.equalsIgnoreCase(name)) {
			bf_success_cnt(value);
			return;
		}
		if ($bf_failure_cnt.equalsIgnoreCase(name)) {
			bf_failure_cnt(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, double value) {
		if ($log_sub_key1.equalsIgnoreCase(name)) {
			log_sub_key1(value);
			return;
		}
		if ($log_sub_key2.equalsIgnoreCase(name)) {
			log_sub_key2(value);
			return;
		}
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($bf_tgt_cnt.equalsIgnoreCase(name)) {
			bf_tgt_cnt(value);
			return;
		}
		if ($bf_success_cnt.equalsIgnoreCase(name)) {
			bf_success_cnt(value);
			return;
		}
		if ($bf_failure_cnt.equalsIgnoreCase(name)) {
			bf_failure_cnt(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setDateNE(String name, MCDate value) {
		if ($st_act_tm.equalsIgnoreCase(name)) {
			st_act_tm(value);
			return;
		}
		if ($end_act_tm.equalsIgnoreCase(name)) {
			end_act_tm(value);
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
