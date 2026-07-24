package mcframe.serverMG.dbc;

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
 * "製造実績ビュー // Mfg. result view"DBコンテナRowクラスです。<p>
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
 *  	<td>mfg_act_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>製造実績ＮＯ</td>
 *  	<td>Mfg. result No.</td>
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
 *  	<td>itm_mfg_inst_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>品目製造指図ＮＯ</td>
 *  	<td>Item mfg. order No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>trd_cd</td>
 *  	<td>C</td>
 *  	<td>4</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引ＣＤ</td>
 *  	<td>Transaction cd.</td>
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
 *  	<td>base_unit_yield_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>基準単位良品数量</td>
 *  	<td>Base unit conforming qty.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>base_unit_dfct_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>基準単位不良数量</td>
 *  	<td>Base unit defective qty.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>base_unit_cd</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>基準単位ＣＤ</td>
 *  	<td>Base unit cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>st_ac_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>着手計上日</td>
 *  	<td>Start recording date</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>end_ac_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>終了計上日</td>
 *  	<td>End recording date</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>itm_yield</td>
 *  	<td>N</td>
 *  	<td>6,3</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目実際収率</td>
 *  	<td>Item actual yield</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>mfg_aprv_sts_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>製造承認状況区分</td>
 *  	<td>Mfg. approval status type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>aprv_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>承認日</td>
 *  	<td>Approval date</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>aprv_dpt_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>承認部門ＣＤ</td>
 *  	<td>Approval dept. cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>aprv_usr_cd</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>承認者ＣＤ</td>
 *  	<td>Approver cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>aprv_tm</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>承認日時</td>
 *  	<td>Approval date and time</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>aprv_rsn</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>承認理由</td>
 *  	<td>Approval reason</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>act_prnt_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>製造記録書発行済ＦＬＧ</td>
 *  	<td>Mfg. record sheet issued flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>act_prnt_tm</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>製造記録書発行日時</td>
 *  	<td>Mfg. record sheet issued date and time</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>seq</td>
 *  	<td>N</td>
 *  	<td>3,0</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>製造記録書連番</td>
 *  	<td>Mfg. record sheet sequence number</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>act_dpt_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>実績部門ＣＤ</td>
 *  	<td>Result dept. cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>act_usr_cd</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>実績責任者ＣＤ</td>
 *  	<td>Result management PIC cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>arr_purc_auto_reg_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>入荷・仕入時自動作成ＦＬＧ</td>
 *  	<td>Auto-create flg. at receipt/purchase</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>intr_rmrks</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>内部備考</td>
 *  	<td>Internal remarks</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>act_rpt_rmrks</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>記録書備考</td>
 *  	<td>Record sheet remarks</td>
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
public class MGVT_MST_MFG_ACT_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.VIEW;

	public static final String TABLE_NAME = "MGVT_MST_MFG_ACT";

	public static final boolean EX_CTRL = false;
	
	public static final boolean LCL_TABLE = false;
	
	/**
	 * 製造実績ＮＯ. Mfg. result No..<p>
	 *
	 */
	public static final String $mfg_act_no = "mfg_act_no";
	private static final MCPermColumnInfo _mfg_act_no = createColumnInfo("mfg_act_no");
	public final MCStringPermColumn mfg_act_no = createStringColumn(_mfg_act_no);
	
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
	 * 品目製造指図ＮＯ. Item mfg. order No..<p>
	 *
	 */
	public static final String $itm_mfg_inst_no = "itm_mfg_inst_no";
	private static final MCPermColumnInfo _itm_mfg_inst_no = createColumnInfo("itm_mfg_inst_no");
	public final MCStringPermColumn itm_mfg_inst_no = createStringColumn(_itm_mfg_inst_no);
	
	/**
	 * 取引ＣＤ. Transaction cd..<p>
	 *
	 */
	public static final String $trd_cd = "trd_cd";
	private static final MCPermColumnInfo _trd_cd = createColumnInfo("trd_cd");
	public final MCStringPermColumn trd_cd = createStringColumn(_trd_cd);
	
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
	 * 基準単位良品数量. Base unit conforming qty..<p>
	 *
	 */
	public static final String $base_unit_yield_qty = "base_unit_yield_qty";
	private static final MCPermColumnInfo _base_unit_yield_qty = createColumnInfo("base_unit_yield_qty");
	public final MCNumberPermColumn base_unit_yield_qty = createNumberColumn(_base_unit_yield_qty);
	
	/**
	 * 基準単位不良数量. Base unit defective qty..<p>
	 *
	 */
	public static final String $base_unit_dfct_qty = "base_unit_dfct_qty";
	private static final MCPermColumnInfo _base_unit_dfct_qty = createColumnInfo("base_unit_dfct_qty");
	public final MCNumberPermColumn base_unit_dfct_qty = createNumberColumn(_base_unit_dfct_qty);
	
	/**
	 * 基準単位ＣＤ. Base unit cd..<p>
	 *
	 */
	public static final String $base_unit_cd = "base_unit_cd";
	private static final MCPermColumnInfo _base_unit_cd = createColumnInfo("base_unit_cd");
	public final MCStringPermColumn base_unit_cd = createStringColumn(_base_unit_cd);
	
	/**
	 * 着手計上日. Start recording date.<p>
	 *
	 */
	public static final String $st_ac_dt = "st_ac_dt";
	private static final MCPermColumnInfo _st_ac_dt = createColumnInfo("st_ac_dt");
	public final MCDatePermColumn st_ac_dt = createDateColumn(_st_ac_dt);
	
	/**
	 * 終了計上日. End recording date.<p>
	 *
	 */
	public static final String $end_ac_dt = "end_ac_dt";
	private static final MCPermColumnInfo _end_ac_dt = createColumnInfo("end_ac_dt");
	public final MCDatePermColumn end_ac_dt = createDateColumn(_end_ac_dt);
	
	/**
	 * 品目実際収率. Item actual yield.<p>
	 *
	 */
	public static final String $itm_yield = "itm_yield";
	private static final MCPermColumnInfo _itm_yield = createColumnInfo("itm_yield");
	public final MCNumberPermColumn itm_yield = createNumberColumn(_itm_yield);
	
	/**
	 * 製造承認状況区分. Mfg. approval status type.<p>
	 *
	 */
	public static final String $mfg_aprv_sts_typ = "mfg_aprv_sts_typ";
	private static final MCPermColumnInfo _mfg_aprv_sts_typ = createColumnInfo("mfg_aprv_sts_typ");
	public final MCStringPermColumn mfg_aprv_sts_typ = createStringColumn(_mfg_aprv_sts_typ);
	
	/**
	 * 承認日. Approval date.<p>
	 *
	 */
	public static final String $aprv_dt = "aprv_dt";
	private static final MCPermColumnInfo _aprv_dt = createColumnInfo("aprv_dt");
	public final MCDatePermColumn aprv_dt = createDateColumn(_aprv_dt);
	
	/**
	 * 承認部門ＣＤ. Approval dept. cd..<p>
	 *
	 */
	public static final String $aprv_dpt_cd = "aprv_dpt_cd";
	private static final MCPermColumnInfo _aprv_dpt_cd = createColumnInfo("aprv_dpt_cd");
	public final MCStringPermColumn aprv_dpt_cd = createStringColumn(_aprv_dpt_cd);
	
	/**
	 * 承認者ＣＤ. Approver cd..<p>
	 *
	 */
	public static final String $aprv_usr_cd = "aprv_usr_cd";
	private static final MCPermColumnInfo _aprv_usr_cd = createColumnInfo("aprv_usr_cd");
	public final MCStringPermColumn aprv_usr_cd = createStringColumn(_aprv_usr_cd);
	
	/**
	 * 承認日時. Approval date and time.<p>
	 *
	 */
	public static final String $aprv_tm = "aprv_tm";
	private static final MCPermColumnInfo _aprv_tm = createColumnInfo("aprv_tm");
	public final MCDatePermColumn aprv_tm = createDateColumn(_aprv_tm);
	
	/**
	 * 承認理由. Approval reason.<p>
	 *
	 */
	public static final String $aprv_rsn = "aprv_rsn";
	private static final MCPermColumnInfo _aprv_rsn = createColumnInfo("aprv_rsn");
	public final MCStringPermColumn aprv_rsn = createStringColumn(_aprv_rsn);
	
	/**
	 * 製造記録書発行済ＦＬＧ. Mfg. record sheet issued flg..<p>
	 *
	 */
	public static final String $act_prnt_flg = "act_prnt_flg";
	private static final MCPermColumnInfo _act_prnt_flg = createColumnInfo("act_prnt_flg");
	public final MCBooleanPermColumn act_prnt_flg = createBooleanColumn(_act_prnt_flg);
	
	/**
	 * 製造記録書発行日時. Mfg. record sheet issued date and time.<p>
	 *
	 */
	public static final String $act_prnt_tm = "act_prnt_tm";
	private static final MCPermColumnInfo _act_prnt_tm = createColumnInfo("act_prnt_tm");
	public final MCDatePermColumn act_prnt_tm = createDateColumn(_act_prnt_tm);
	
	/**
	 * 製造記録書連番. Mfg. record sheet sequence number.<p>
	 *
	 */
	public static final String $seq = "seq";
	private static final MCPermColumnInfo _seq = createColumnInfo("seq");
	public final MCNumberPermColumn seq = createNumberColumn(_seq);
	
	/**
	 * 実績部門ＣＤ. Result dept. cd..<p>
	 *
	 */
	public static final String $act_dpt_cd = "act_dpt_cd";
	private static final MCPermColumnInfo _act_dpt_cd = createColumnInfo("act_dpt_cd");
	public final MCStringPermColumn act_dpt_cd = createStringColumn(_act_dpt_cd);
	
	/**
	 * 実績責任者ＣＤ. Result management PIC cd..<p>
	 *
	 */
	public static final String $act_usr_cd = "act_usr_cd";
	private static final MCPermColumnInfo _act_usr_cd = createColumnInfo("act_usr_cd");
	public final MCStringPermColumn act_usr_cd = createStringColumn(_act_usr_cd);
	
	/**
	 * 入荷・仕入時自動作成ＦＬＧ. Auto-create flg. at receipt/purchase.<p>
	 *
	 */
	public static final String $arr_purc_auto_reg_flg = "arr_purc_auto_reg_flg";
	private static final MCPermColumnInfo _arr_purc_auto_reg_flg = createColumnInfo("arr_purc_auto_reg_flg");
	public final MCBooleanPermColumn arr_purc_auto_reg_flg = createBooleanColumn(_arr_purc_auto_reg_flg);
	
	/**
	 * 内部備考. Internal remarks.<p>
	 *
	 */
	public static final String $intr_rmrks = "intr_rmrks";
	private static final MCPermColumnInfo _intr_rmrks = createColumnInfo("intr_rmrks");
	public final MCStringPermColumn intr_rmrks = createStringColumn(_intr_rmrks);
	
	/**
	 * 記録書備考. Record sheet remarks.<p>
	 *
	 */
	public static final String $act_rpt_rmrks = "act_rpt_rmrks";
	private static final MCPermColumnInfo _act_rpt_rmrks = createColumnInfo("act_rpt_rmrks");
	public final MCStringPermColumn act_rpt_rmrks = createStringColumn(_act_rpt_rmrks);
	
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
	
	public static final MCMeta mfg_act_no_META = createCommonMeta($mfg_act_no, mcframe.commonMA.meta.MA_META.MFG_ACT_NO);
	public static final MCMeta mfg_inst_no_META = createCommonMeta($mfg_inst_no, mcframe.commonMA.meta.MA_META.MFG_INST_NO);
	public static final MCMeta div_seq_META = createNumberMeta($div_seq, 3, 0, false);
	public static final MCMeta itm_mfg_inst_no_META = createCommonMeta($itm_mfg_inst_no, mcframe.commonMA.meta.MA_META.ITM_MFG_INST_NO);
	public static final MCMeta trd_cd_META = createCommonMeta($trd_cd, mcframe.commonMA.meta.MA_META.TRD_CD);
	public static final MCMeta st_act_tm_META = createCommonMeta($st_act_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta end_act_tm_META = createCommonMeta($end_act_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta base_unit_yield_qty_META = createCommonMeta($base_unit_yield_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_dfct_qty_META = createCommonMeta($base_unit_dfct_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_cd_META = createCommonMeta($base_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta st_ac_dt_META = createCommonMeta($st_ac_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta end_ac_dt_META = createCommonMeta($end_ac_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta itm_yield_META = createCommonMeta($itm_yield, mcframe.commonMA.meta.MA_META.YIELD);
	public static final MCMeta mfg_aprv_sts_typ_META = createStringMeta($mfg_aprv_sts_typ, 1);
	public static final MCMeta aprv_dt_META = createCommonMeta($aprv_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta aprv_dpt_cd_META = createCommonMeta($aprv_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta aprv_usr_cd_META = createCommonMeta($aprv_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta aprv_tm_META = createCommonMeta($aprv_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta aprv_rsn_META = createStringMeta($aprv_rsn, 100);
	public static final MCMeta act_prnt_flg_META = createCommonMeta($act_prnt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta act_prnt_tm_META = createCommonMeta($act_prnt_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta seq_META = createCommonMeta($seq, mcframe.commonMA.meta.MA_META.PRNT_SEQ);
	public static final MCMeta act_dpt_cd_META = createCommonMeta($act_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta act_usr_cd_META = createCommonMeta($act_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta arr_purc_auto_reg_flg_META = createCommonMeta($arr_purc_auto_reg_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta intr_rmrks_META = createStringMeta($intr_rmrks, 100);
	public static final MCMeta act_rpt_rmrks_META = createStringMeta($act_rpt_rmrks, 100);
	public static final MCMeta sub_char1_META = createStringMeta($sub_char1, 20);
	public static final MCMeta sub_char2_META = createStringMeta($sub_char2, 20);
	public static final MCMeta sub_char3_META = createStringMeta($sub_char3, 20);
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
	
	protected static final ConstMetaList<MGVT_MST_MFG_ACT_R> constMetas = new ConstMetaList<MGVT_MST_MFG_ACT_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			mfg_act_no_META,
			mfg_inst_no_META,
			div_seq_META,
			itm_mfg_inst_no_META,
			trd_cd_META,
			st_act_tm_META,
			end_act_tm_META,
			base_unit_yield_qty_META,
			base_unit_dfct_qty_META,
			base_unit_cd_META,
			st_ac_dt_META,
			end_ac_dt_META,
			itm_yield_META,
			mfg_aprv_sts_typ_META,
			aprv_dt_META,
			aprv_dpt_cd_META,
			aprv_usr_cd_META,
			aprv_tm_META,
			aprv_rsn_META,
			act_prnt_flg_META,
			act_prnt_tm_META,
			seq_META,
			act_dpt_cd_META,
			act_usr_cd_META,
			arr_purc_auto_reg_flg_META,
			intr_rmrks_META,
			act_rpt_rmrks_META,
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
	protected MGVT_MST_MFG_ACT_R(ConstMetaList<? extends MGVT_MST_MFG_ACT_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MGVT_MST_MFG_ACT_R(ConstMetaList<? extends MGVT_MST_MFG_ACT_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MGVT_MST_MFG_ACT_R.$mfg_act_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_MST_MFG_ACT_R.$mfg_act_no,
				"mfg_act_no",
				mfg_act_no,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_MST_MFG_ACT_R.$mfg_inst_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_MST_MFG_ACT_R.$mfg_inst_no,
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
			MGVT_MST_MFG_ACT_R.$div_seq,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_MST_MFG_ACT_R.$div_seq,
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
			MGVT_MST_MFG_ACT_R.$itm_mfg_inst_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_MST_MFG_ACT_R.$itm_mfg_inst_no,
				"itm_mfg_inst_no",
				itm_mfg_inst_no,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_MST_MFG_ACT_R.$trd_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_MST_MFG_ACT_R.$trd_cd,
				"trd_cd",
				trd_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_MST_MFG_ACT_R.$st_act_tm,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MGVT_MST_MFG_ACT_R.$st_act_tm,
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
			MGVT_MST_MFG_ACT_R.$end_act_tm,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MGVT_MST_MFG_ACT_R.$end_act_tm,
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
			MGVT_MST_MFG_ACT_R.$base_unit_yield_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_MST_MFG_ACT_R.$base_unit_yield_qty,
				"base_unit_yield_qty",
				base_unit_yield_qty,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_MST_MFG_ACT_R.$base_unit_dfct_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_MST_MFG_ACT_R.$base_unit_dfct_qty,
				"base_unit_dfct_qty",
				base_unit_dfct_qty,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_MST_MFG_ACT_R.$base_unit_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_MST_MFG_ACT_R.$base_unit_cd,
				"base_unit_cd",
				base_unit_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_MST_MFG_ACT_R.$st_ac_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MGVT_MST_MFG_ACT_R.$st_ac_dt,
				"st_ac_dt",
				st_ac_dt,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_MST_MFG_ACT_R.$end_ac_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MGVT_MST_MFG_ACT_R.$end_ac_dt,
				"end_ac_dt",
				end_ac_dt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_MST_MFG_ACT_R.$itm_yield,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_MST_MFG_ACT_R.$itm_yield,
				"itm_yield",
				itm_yield,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_MST_MFG_ACT_R.$mfg_aprv_sts_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_MST_MFG_ACT_R.$mfg_aprv_sts_typ,
				"mfg_aprv_sts_typ",
				mfg_aprv_sts_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_MST_MFG_ACT_R.$aprv_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MGVT_MST_MFG_ACT_R.$aprv_dt,
				"aprv_dt",
				aprv_dt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_MST_MFG_ACT_R.$aprv_dpt_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_MST_MFG_ACT_R.$aprv_dpt_cd,
				"aprv_dpt_cd",
				aprv_dpt_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_MST_MFG_ACT_R.$aprv_usr_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_MST_MFG_ACT_R.$aprv_usr_cd,
				"aprv_usr_cd",
				aprv_usr_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_MST_MFG_ACT_R.$aprv_tm,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MGVT_MST_MFG_ACT_R.$aprv_tm,
				"aprv_tm",
				aprv_tm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_MST_MFG_ACT_R.$aprv_rsn,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_MST_MFG_ACT_R.$aprv_rsn,
				"aprv_rsn",
				aprv_rsn,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_MST_MFG_ACT_R.$act_prnt_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MGVT_MST_MFG_ACT_R.$act_prnt_flg,
				"act_prnt_flg",
				act_prnt_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_MST_MFG_ACT_R.$act_prnt_tm,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MGVT_MST_MFG_ACT_R.$act_prnt_tm,
				"act_prnt_tm",
				act_prnt_tm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_MST_MFG_ACT_R.$seq,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_MST_MFG_ACT_R.$seq,
				"seq",
				seq,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_MST_MFG_ACT_R.$act_dpt_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_MST_MFG_ACT_R.$act_dpt_cd,
				"act_dpt_cd",
				act_dpt_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_MST_MFG_ACT_R.$act_usr_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_MST_MFG_ACT_R.$act_usr_cd,
				"act_usr_cd",
				act_usr_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_MST_MFG_ACT_R.$arr_purc_auto_reg_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MGVT_MST_MFG_ACT_R.$arr_purc_auto_reg_flg,
				"arr_purc_auto_reg_flg",
				arr_purc_auto_reg_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_MST_MFG_ACT_R.$intr_rmrks,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_MST_MFG_ACT_R.$intr_rmrks,
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
			MGVT_MST_MFG_ACT_R.$act_rpt_rmrks,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_MST_MFG_ACT_R.$act_rpt_rmrks,
				"act_rpt_rmrks",
				act_rpt_rmrks,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_MST_MFG_ACT_R.$sub_char1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_MST_MFG_ACT_R.$sub_char1,
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
			MGVT_MST_MFG_ACT_R.$sub_char2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_MST_MFG_ACT_R.$sub_char2,
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
			MGVT_MST_MFG_ACT_R.$sub_char3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_MST_MFG_ACT_R.$sub_char3,
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
			MGVT_MST_MFG_ACT_R.$ins_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_MST_MFG_ACT_R.$ins_usr_id,
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
			MGVT_MST_MFG_ACT_R.$ins_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_MST_MFG_ACT_R.$ins_usr_nm,
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
			MGVT_MST_MFG_ACT_R.$ins_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MGVT_MST_MFG_ACT_R.$ins_ts,
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
			MGVT_MST_MFG_ACT_R.$ins_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_MST_MFG_ACT_R.$ins_func_id,
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
			MGVT_MST_MFG_ACT_R.$upd_cntr,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_MST_MFG_ACT_R.$upd_cntr,
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
			MGVT_MST_MFG_ACT_R.$upd_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_MST_MFG_ACT_R.$upd_usr_id,
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
			MGVT_MST_MFG_ACT_R.$upd_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_MST_MFG_ACT_R.$upd_usr_nm,
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
			MGVT_MST_MFG_ACT_R.$upd_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MGVT_MST_MFG_ACT_R.$upd_ts,
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
			MGVT_MST_MFG_ACT_R.$upd_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_MST_MFG_ACT_R.$upd_func_id,
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
			MGVT_MST_MFG_ACT_R.$upd_srv_req_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_MST_MFG_ACT_R.$upd_srv_req_no,
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
	public static MGVT_MST_MFG_ACT_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MGVT_MST_MFG_ACT_R create(String alias) {
		MGVT_MST_MFG_ACT_R row = new MGVT_MST_MFG_ACT_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MGVT_MST_MFG_ACT_R createByName(T proto) {
		MGVT_MST_MFG_ACT_R row = MGVT_MST_MFG_ACT_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MGVT_MST_MFG_ACT_R clone() {
		return (MGVT_MST_MFG_ACT_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MGVT_MST_MFG_ACT_R createInstance() {
		return (MGVT_MST_MFG_ACT_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MGVT_MST_MFG_ACT_R getValues(String... names) {
		return (MGVT_MST_MFG_ACT_R) super.getValues(names);
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
	 * 製造実績ＮＯ. Mfg. result No..<p>
	 *
	 */
	public String mfg_act_no() {
		return getConstString(offset + 0, $mfg_act_no);
	}

	/**
	 * 製造実績ＮＯ. Mfg. result No..<p>
	 *
	 */
	public void mfg_act_no(String value) {
		setConstString(offset + 0, $mfg_act_no, value);
	}

	/**
	 * 製造指図ＮＯ. Mfg. order No..<p>
	 *
	 */
	public String mfg_inst_no() {
		return getConstString(offset + 1, $mfg_inst_no);
	}

	/**
	 * 製造指図ＮＯ. Mfg. order No..<p>
	 *
	 */
	public void mfg_inst_no(String value) {
		setConstString(offset + 1, $mfg_inst_no, value);
	}

	/**
	 * 分割連番. Split sequence number.<p>
	 *
	 */
	public MCNumber div_seq() {
		return getConstNumber(offset + 2, $div_seq);
	}

	/**
	 * 分割連番. Split sequence number.<p>
	 *
	 */
	public void div_seq(MCNumber value) {
		setConstNumber(offset + 2, $div_seq, value);
	}
	
	/**
	 * 分割連番. Split sequence number.<p>
	 *
	 */
	public void div_seq(int value) {
		setConstNumber(offset + 2, $div_seq, value);
	}
	
	/**
	 * 分割連番. Split sequence number.<p>
	 *
	 */
	public void div_seq(long value) {
		setConstNumber(offset + 2, $div_seq, value);
	}
	
	/**
	 * 分割連番. Split sequence number.<p>
	 *
	 */
	public void div_seq(float value) {
		setConstNumber(offset + 2, $div_seq, value);
	}
	
	/**
	 * 分割連番. Split sequence number.<p>
	 *
	 */
	public void div_seq(double value) {
		setConstNumber(offset + 2, $div_seq, value);
	}
	
	/**
	 * 品目製造指図ＮＯ. Item mfg. order No..<p>
	 *
	 */
	public String itm_mfg_inst_no() {
		return getConstString(offset + 3, $itm_mfg_inst_no);
	}

	/**
	 * 品目製造指図ＮＯ. Item mfg. order No..<p>
	 *
	 */
	public void itm_mfg_inst_no(String value) {
		setConstString(offset + 3, $itm_mfg_inst_no, value);
	}

	/**
	 * 取引ＣＤ. Transaction cd..<p>
	 *
	 */
	public String trd_cd() {
		return getConstString(offset + 4, $trd_cd);
	}

	/**
	 * 取引ＣＤ. Transaction cd..<p>
	 *
	 */
	public void trd_cd(String value) {
		setConstString(offset + 4, $trd_cd, value);
	}

	/**
	 * 着手実績日時. Actual start date and time.<p>
	 *
	 */
	public MCDate st_act_tm() {
		return getConstDate(offset + 5, $st_act_tm);
	}

	/**
	 * 着手実績日時. Actual start date and time.<p>
	 *
	 */
	public void st_act_tm(MCDate value) {
		setConstDate(offset + 5, $st_act_tm, value);
	}

	/**
	 * 終了実績日時. Actual end date and time.<p>
	 *
	 */
	public MCDate end_act_tm() {
		return getConstDate(offset + 6, $end_act_tm);
	}

	/**
	 * 終了実績日時. Actual end date and time.<p>
	 *
	 */
	public void end_act_tm(MCDate value) {
		setConstDate(offset + 6, $end_act_tm, value);
	}

	/**
	 * 基準単位良品数量. Base unit conforming qty..<p>
	 *
	 */
	public MCNumber base_unit_yield_qty() {
		return getConstNumber(offset + 7, $base_unit_yield_qty);
	}

	/**
	 * 基準単位良品数量. Base unit conforming qty..<p>
	 *
	 */
	public void base_unit_yield_qty(MCNumber value) {
		setConstNumber(offset + 7, $base_unit_yield_qty, value);
	}
	
	/**
	 * 基準単位良品数量. Base unit conforming qty..<p>
	 *
	 */
	public void base_unit_yield_qty(int value) {
		setConstNumber(offset + 7, $base_unit_yield_qty, value);
	}
	
	/**
	 * 基準単位良品数量. Base unit conforming qty..<p>
	 *
	 */
	public void base_unit_yield_qty(long value) {
		setConstNumber(offset + 7, $base_unit_yield_qty, value);
	}
	
	/**
	 * 基準単位良品数量. Base unit conforming qty..<p>
	 *
	 */
	public void base_unit_yield_qty(float value) {
		setConstNumber(offset + 7, $base_unit_yield_qty, value);
	}
	
	/**
	 * 基準単位良品数量. Base unit conforming qty..<p>
	 *
	 */
	public void base_unit_yield_qty(double value) {
		setConstNumber(offset + 7, $base_unit_yield_qty, value);
	}
	
	/**
	 * 基準単位不良数量. Base unit defective qty..<p>
	 *
	 */
	public MCNumber base_unit_dfct_qty() {
		return getConstNumber(offset + 8, $base_unit_dfct_qty);
	}

	/**
	 * 基準単位不良数量. Base unit defective qty..<p>
	 *
	 */
	public void base_unit_dfct_qty(MCNumber value) {
		setConstNumber(offset + 8, $base_unit_dfct_qty, value);
	}
	
	/**
	 * 基準単位不良数量. Base unit defective qty..<p>
	 *
	 */
	public void base_unit_dfct_qty(int value) {
		setConstNumber(offset + 8, $base_unit_dfct_qty, value);
	}
	
	/**
	 * 基準単位不良数量. Base unit defective qty..<p>
	 *
	 */
	public void base_unit_dfct_qty(long value) {
		setConstNumber(offset + 8, $base_unit_dfct_qty, value);
	}
	
	/**
	 * 基準単位不良数量. Base unit defective qty..<p>
	 *
	 */
	public void base_unit_dfct_qty(float value) {
		setConstNumber(offset + 8, $base_unit_dfct_qty, value);
	}
	
	/**
	 * 基準単位不良数量. Base unit defective qty..<p>
	 *
	 */
	public void base_unit_dfct_qty(double value) {
		setConstNumber(offset + 8, $base_unit_dfct_qty, value);
	}
	
	/**
	 * 基準単位ＣＤ. Base unit cd..<p>
	 *
	 */
	public String base_unit_cd() {
		return getConstString(offset + 9, $base_unit_cd);
	}

	/**
	 * 基準単位ＣＤ. Base unit cd..<p>
	 *
	 */
	public void base_unit_cd(String value) {
		setConstString(offset + 9, $base_unit_cd, value);
	}

	/**
	 * 着手計上日. Start recording date.<p>
	 *
	 */
	public MCDate st_ac_dt() {
		return getConstDate(offset + 10, $st_ac_dt);
	}

	/**
	 * 着手計上日. Start recording date.<p>
	 *
	 */
	public void st_ac_dt(MCDate value) {
		setConstDate(offset + 10, $st_ac_dt, value);
	}

	/**
	 * 終了計上日. End recording date.<p>
	 *
	 */
	public MCDate end_ac_dt() {
		return getConstDate(offset + 11, $end_ac_dt);
	}

	/**
	 * 終了計上日. End recording date.<p>
	 *
	 */
	public void end_ac_dt(MCDate value) {
		setConstDate(offset + 11, $end_ac_dt, value);
	}

	/**
	 * 品目実際収率. Item actual yield.<p>
	 *
	 */
	public MCNumber itm_yield() {
		return getConstNumber(offset + 12, $itm_yield);
	}

	/**
	 * 品目実際収率. Item actual yield.<p>
	 *
	 */
	public void itm_yield(MCNumber value) {
		setConstNumber(offset + 12, $itm_yield, value);
	}
	
	/**
	 * 品目実際収率. Item actual yield.<p>
	 *
	 */
	public void itm_yield(int value) {
		setConstNumber(offset + 12, $itm_yield, value);
	}
	
	/**
	 * 品目実際収率. Item actual yield.<p>
	 *
	 */
	public void itm_yield(long value) {
		setConstNumber(offset + 12, $itm_yield, value);
	}
	
	/**
	 * 品目実際収率. Item actual yield.<p>
	 *
	 */
	public void itm_yield(float value) {
		setConstNumber(offset + 12, $itm_yield, value);
	}
	
	/**
	 * 品目実際収率. Item actual yield.<p>
	 *
	 */
	public void itm_yield(double value) {
		setConstNumber(offset + 12, $itm_yield, value);
	}
	
	/**
	 * 製造承認状況区分. Mfg. approval status type.<p>
	 *
	 */
	public String mfg_aprv_sts_typ() {
		return getConstString(offset + 13, $mfg_aprv_sts_typ);
	}

	/**
	 * 製造承認状況区分. Mfg. approval status type.<p>
	 *
	 */
	public void mfg_aprv_sts_typ(String value) {
		setConstString(offset + 13, $mfg_aprv_sts_typ, value);
	}

	/**
	 * 承認日. Approval date.<p>
	 *
	 */
	public MCDate aprv_dt() {
		return getConstDate(offset + 14, $aprv_dt);
	}

	/**
	 * 承認日. Approval date.<p>
	 *
	 */
	public void aprv_dt(MCDate value) {
		setConstDate(offset + 14, $aprv_dt, value);
	}

	/**
	 * 承認部門ＣＤ. Approval dept. cd..<p>
	 *
	 */
	public String aprv_dpt_cd() {
		return getConstString(offset + 15, $aprv_dpt_cd);
	}

	/**
	 * 承認部門ＣＤ. Approval dept. cd..<p>
	 *
	 */
	public void aprv_dpt_cd(String value) {
		setConstString(offset + 15, $aprv_dpt_cd, value);
	}

	/**
	 * 承認者ＣＤ. Approver cd..<p>
	 *
	 */
	public String aprv_usr_cd() {
		return getConstString(offset + 16, $aprv_usr_cd);
	}

	/**
	 * 承認者ＣＤ. Approver cd..<p>
	 *
	 */
	public void aprv_usr_cd(String value) {
		setConstString(offset + 16, $aprv_usr_cd, value);
	}

	/**
	 * 承認日時. Approval date and time.<p>
	 *
	 */
	public MCDate aprv_tm() {
		return getConstDate(offset + 17, $aprv_tm);
	}

	/**
	 * 承認日時. Approval date and time.<p>
	 *
	 */
	public void aprv_tm(MCDate value) {
		setConstDate(offset + 17, $aprv_tm, value);
	}

	/**
	 * 承認理由. Approval reason.<p>
	 *
	 */
	public String aprv_rsn() {
		return getConstString(offset + 18, $aprv_rsn);
	}

	/**
	 * 承認理由. Approval reason.<p>
	 *
	 */
	public void aprv_rsn(String value) {
		setConstString(offset + 18, $aprv_rsn, value);
	}

	/**
	 * 製造記録書発行済ＦＬＧ. Mfg. record sheet issued flg..<p>
	 *
	 */
	public boolean act_prnt_flg() {
		return getConstBoolean(offset + 19, $act_prnt_flg);
	}

	/**
	 * 製造記録書発行済ＦＬＧ. Mfg. record sheet issued flg..<p>
	 *
	 */
	public void act_prnt_flg(boolean value) {
		setConstBoolean(offset + 19, $act_prnt_flg, value);
	}

	/**
	 * 製造記録書発行日時. Mfg. record sheet issued date and time.<p>
	 *
	 */
	public MCDate act_prnt_tm() {
		return getConstDate(offset + 20, $act_prnt_tm);
	}

	/**
	 * 製造記録書発行日時. Mfg. record sheet issued date and time.<p>
	 *
	 */
	public void act_prnt_tm(MCDate value) {
		setConstDate(offset + 20, $act_prnt_tm, value);
	}

	/**
	 * 製造記録書連番. Mfg. record sheet sequence number.<p>
	 *
	 */
	public MCNumber seq() {
		return getConstNumber(offset + 21, $seq);
	}

	/**
	 * 製造記録書連番. Mfg. record sheet sequence number.<p>
	 *
	 */
	public void seq(MCNumber value) {
		setConstNumber(offset + 21, $seq, value);
	}
	
	/**
	 * 製造記録書連番. Mfg. record sheet sequence number.<p>
	 *
	 */
	public void seq(int value) {
		setConstNumber(offset + 21, $seq, value);
	}
	
	/**
	 * 製造記録書連番. Mfg. record sheet sequence number.<p>
	 *
	 */
	public void seq(long value) {
		setConstNumber(offset + 21, $seq, value);
	}
	
	/**
	 * 製造記録書連番. Mfg. record sheet sequence number.<p>
	 *
	 */
	public void seq(float value) {
		setConstNumber(offset + 21, $seq, value);
	}
	
	/**
	 * 製造記録書連番. Mfg. record sheet sequence number.<p>
	 *
	 */
	public void seq(double value) {
		setConstNumber(offset + 21, $seq, value);
	}
	
	/**
	 * 実績部門ＣＤ. Result dept. cd..<p>
	 *
	 */
	public String act_dpt_cd() {
		return getConstString(offset + 22, $act_dpt_cd);
	}

	/**
	 * 実績部門ＣＤ. Result dept. cd..<p>
	 *
	 */
	public void act_dpt_cd(String value) {
		setConstString(offset + 22, $act_dpt_cd, value);
	}

	/**
	 * 実績責任者ＣＤ. Result management PIC cd..<p>
	 *
	 */
	public String act_usr_cd() {
		return getConstString(offset + 23, $act_usr_cd);
	}

	/**
	 * 実績責任者ＣＤ. Result management PIC cd..<p>
	 *
	 */
	public void act_usr_cd(String value) {
		setConstString(offset + 23, $act_usr_cd, value);
	}

	/**
	 * 入荷・仕入時自動作成ＦＬＧ. Auto-create flg. at receipt/purchase.<p>
	 *
	 */
	public boolean arr_purc_auto_reg_flg() {
		return getConstBoolean(offset + 24, $arr_purc_auto_reg_flg);
	}

	/**
	 * 入荷・仕入時自動作成ＦＬＧ. Auto-create flg. at receipt/purchase.<p>
	 *
	 */
	public void arr_purc_auto_reg_flg(boolean value) {
		setConstBoolean(offset + 24, $arr_purc_auto_reg_flg, value);
	}

	/**
	 * 内部備考. Internal remarks.<p>
	 *
	 */
	public String intr_rmrks() {
		return getConstString(offset + 25, $intr_rmrks);
	}

	/**
	 * 内部備考. Internal remarks.<p>
	 *
	 */
	public void intr_rmrks(String value) {
		setConstString(offset + 25, $intr_rmrks, value);
	}

	/**
	 * 記録書備考. Record sheet remarks.<p>
	 *
	 */
	public String act_rpt_rmrks() {
		return getConstString(offset + 26, $act_rpt_rmrks);
	}

	/**
	 * 記録書備考. Record sheet remarks.<p>
	 *
	 */
	public void act_rpt_rmrks(String value) {
		setConstString(offset + 26, $act_rpt_rmrks, value);
	}

	/**
	 * 予備１. Spare 1.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 27, $sub_char1);
	}

	/**
	 * 予備１. Spare 1.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 27, $sub_char1, value);
	}

	/**
	 * 予備２. Spare 2.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 28, $sub_char2);
	}

	/**
	 * 予備２. Spare 2.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 28, $sub_char2, value);
	}

	/**
	 * 予備３. Spare 3.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 29, $sub_char3);
	}

	/**
	 * 予備３. Spare 3.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 29, $sub_char3, value);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 30, $ins_usr_id);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 30, $ins_usr_id, value);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 31, $ins_usr_nm);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 31, $ins_usr_nm, value);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 32, $ins_ts);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 32, $ins_ts, value);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 33, $ins_func_id);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 33, $ins_func_id, value);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 34, $upd_cntr);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 34, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 34, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 34, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 34, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 34, $upd_cntr, value);
	}
	
	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 35, $upd_usr_id);
	}

	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 35, $upd_usr_id, value);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 36, $upd_usr_nm);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 36, $upd_usr_nm, value);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 37, $upd_ts);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 37, $upd_ts, value);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 38, $upd_func_id);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 38, $upd_func_id, value);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 39, $upd_srv_req_no);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 39, $upd_srv_req_no, value);
	}

	public String getString(String name) {
		if ($mfg_act_no.equalsIgnoreCase(name)) {
			return mfg_act_no();
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			return mfg_inst_no();
		}
		if ($itm_mfg_inst_no.equalsIgnoreCase(name)) {
			return itm_mfg_inst_no();
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			return trd_cd();
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($mfg_aprv_sts_typ.equalsIgnoreCase(name)) {
			return mfg_aprv_sts_typ();
		}
		if ($aprv_dpt_cd.equalsIgnoreCase(name)) {
			return aprv_dpt_cd();
		}
		if ($aprv_usr_cd.equalsIgnoreCase(name)) {
			return aprv_usr_cd();
		}
		if ($aprv_rsn.equalsIgnoreCase(name)) {
			return aprv_rsn();
		}
		if ($act_dpt_cd.equalsIgnoreCase(name)) {
			return act_dpt_cd();
		}
		if ($act_usr_cd.equalsIgnoreCase(name)) {
			return act_usr_cd();
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			return intr_rmrks();
		}
		if ($act_rpt_rmrks.equalsIgnoreCase(name)) {
			return act_rpt_rmrks();
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
		if ($div_seq.equalsIgnoreCase(name)) {
			return div_seq();
		}
		if ($base_unit_yield_qty.equalsIgnoreCase(name)) {
			return base_unit_yield_qty();
		}
		if ($base_unit_dfct_qty.equalsIgnoreCase(name)) {
			return base_unit_dfct_qty();
		}
		if ($itm_yield.equalsIgnoreCase(name)) {
			return itm_yield();
		}
		if ($seq.equalsIgnoreCase(name)) {
			return seq();
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
		if ($st_ac_dt.equalsIgnoreCase(name)) {
			return st_ac_dt();
		}
		if ($end_ac_dt.equalsIgnoreCase(name)) {
			return end_ac_dt();
		}
		if ($aprv_dt.equalsIgnoreCase(name)) {
			return aprv_dt();
		}
		if ($aprv_tm.equalsIgnoreCase(name)) {
			return aprv_tm();
		}
		if ($act_prnt_tm.equalsIgnoreCase(name)) {
			return act_prnt_tm();
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
		if ($act_prnt_flg.equalsIgnoreCase(name)) {
			return act_prnt_flg();
		}
		if ($arr_purc_auto_reg_flg.equalsIgnoreCase(name)) {
			return arr_purc_auto_reg_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($mfg_act_no.equalsIgnoreCase(name)) {
			return mfg_act_no();
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			return mfg_inst_no();
		}
		if ($itm_mfg_inst_no.equalsIgnoreCase(name)) {
			return itm_mfg_inst_no();
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			return trd_cd();
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($mfg_aprv_sts_typ.equalsIgnoreCase(name)) {
			return mfg_aprv_sts_typ();
		}
		if ($aprv_dpt_cd.equalsIgnoreCase(name)) {
			return aprv_dpt_cd();
		}
		if ($aprv_usr_cd.equalsIgnoreCase(name)) {
			return aprv_usr_cd();
		}
		if ($aprv_rsn.equalsIgnoreCase(name)) {
			return aprv_rsn();
		}
		if ($act_dpt_cd.equalsIgnoreCase(name)) {
			return act_dpt_cd();
		}
		if ($act_usr_cd.equalsIgnoreCase(name)) {
			return act_usr_cd();
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			return intr_rmrks();
		}
		if ($act_rpt_rmrks.equalsIgnoreCase(name)) {
			return act_rpt_rmrks();
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
		if ($div_seq.equalsIgnoreCase(name)) {
			return div_seq();
		}
		if ($base_unit_yield_qty.equalsIgnoreCase(name)) {
			return base_unit_yield_qty();
		}
		if ($base_unit_dfct_qty.equalsIgnoreCase(name)) {
			return base_unit_dfct_qty();
		}
		if ($itm_yield.equalsIgnoreCase(name)) {
			return itm_yield();
		}
		if ($seq.equalsIgnoreCase(name)) {
			return seq();
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
		if ($st_ac_dt.equalsIgnoreCase(name)) {
			return st_ac_dt();
		}
		if ($end_ac_dt.equalsIgnoreCase(name)) {
			return end_ac_dt();
		}
		if ($aprv_dt.equalsIgnoreCase(name)) {
			return aprv_dt();
		}
		if ($aprv_tm.equalsIgnoreCase(name)) {
			return aprv_tm();
		}
		if ($act_prnt_tm.equalsIgnoreCase(name)) {
			return act_prnt_tm();
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
		if ($act_prnt_flg.equalsIgnoreCase(name)) {
			return act_prnt_flg();
		}
		if ($arr_purc_auto_reg_flg.equalsIgnoreCase(name)) {
			return arr_purc_auto_reg_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($mfg_act_no.equalsIgnoreCase(name)) {
			mfg_act_no(value);
			return;
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			mfg_inst_no(value);
			return;
		}
		if ($itm_mfg_inst_no.equalsIgnoreCase(name)) {
			itm_mfg_inst_no(value);
			return;
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			trd_cd(value);
			return;
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			base_unit_cd(value);
			return;
		}
		if ($mfg_aprv_sts_typ.equalsIgnoreCase(name)) {
			mfg_aprv_sts_typ(value);
			return;
		}
		if ($aprv_dpt_cd.equalsIgnoreCase(name)) {
			aprv_dpt_cd(value);
			return;
		}
		if ($aprv_usr_cd.equalsIgnoreCase(name)) {
			aprv_usr_cd(value);
			return;
		}
		if ($aprv_rsn.equalsIgnoreCase(name)) {
			aprv_rsn(value);
			return;
		}
		if ($act_dpt_cd.equalsIgnoreCase(name)) {
			act_dpt_cd(value);
			return;
		}
		if ($act_usr_cd.equalsIgnoreCase(name)) {
			act_usr_cd(value);
			return;
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			intr_rmrks(value);
			return;
		}
		if ($act_rpt_rmrks.equalsIgnoreCase(name)) {
			act_rpt_rmrks(value);
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
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($base_unit_yield_qty.equalsIgnoreCase(name)) {
			base_unit_yield_qty(value);
			return;
		}
		if ($base_unit_dfct_qty.equalsIgnoreCase(name)) {
			base_unit_dfct_qty(value);
			return;
		}
		if ($itm_yield.equalsIgnoreCase(name)) {
			itm_yield(value);
			return;
		}
		if ($seq.equalsIgnoreCase(name)) {
			seq(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, int value) {
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($base_unit_yield_qty.equalsIgnoreCase(name)) {
			base_unit_yield_qty(value);
			return;
		}
		if ($base_unit_dfct_qty.equalsIgnoreCase(name)) {
			base_unit_dfct_qty(value);
			return;
		}
		if ($itm_yield.equalsIgnoreCase(name)) {
			itm_yield(value);
			return;
		}
		if ($seq.equalsIgnoreCase(name)) {
			seq(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, long value) {
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($base_unit_yield_qty.equalsIgnoreCase(name)) {
			base_unit_yield_qty(value);
			return;
		}
		if ($base_unit_dfct_qty.equalsIgnoreCase(name)) {
			base_unit_dfct_qty(value);
			return;
		}
		if ($itm_yield.equalsIgnoreCase(name)) {
			itm_yield(value);
			return;
		}
		if ($seq.equalsIgnoreCase(name)) {
			seq(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, float value) {
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($base_unit_yield_qty.equalsIgnoreCase(name)) {
			base_unit_yield_qty(value);
			return;
		}
		if ($base_unit_dfct_qty.equalsIgnoreCase(name)) {
			base_unit_dfct_qty(value);
			return;
		}
		if ($itm_yield.equalsIgnoreCase(name)) {
			itm_yield(value);
			return;
		}
		if ($seq.equalsIgnoreCase(name)) {
			seq(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, double value) {
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($base_unit_yield_qty.equalsIgnoreCase(name)) {
			base_unit_yield_qty(value);
			return;
		}
		if ($base_unit_dfct_qty.equalsIgnoreCase(name)) {
			base_unit_dfct_qty(value);
			return;
		}
		if ($itm_yield.equalsIgnoreCase(name)) {
			itm_yield(value);
			return;
		}
		if ($seq.equalsIgnoreCase(name)) {
			seq(value);
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
		if ($st_ac_dt.equalsIgnoreCase(name)) {
			st_ac_dt(value);
			return;
		}
		if ($end_ac_dt.equalsIgnoreCase(name)) {
			end_ac_dt(value);
			return;
		}
		if ($aprv_dt.equalsIgnoreCase(name)) {
			aprv_dt(value);
			return;
		}
		if ($aprv_tm.equalsIgnoreCase(name)) {
			aprv_tm(value);
			return;
		}
		if ($act_prnt_tm.equalsIgnoreCase(name)) {
			act_prnt_tm(value);
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
		if ($act_prnt_flg.equalsIgnoreCase(name)) {
			act_prnt_flg(value);
			return;
		}
		if ($arr_purc_auto_reg_flg.equalsIgnoreCase(name)) {
			arr_purc_auto_reg_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($mfg_act_no.equalsIgnoreCase(name)) {
			mfg_act_no(value);
			return;
		}
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			mfg_inst_no(value);
			return;
		}
		if ($itm_mfg_inst_no.equalsIgnoreCase(name)) {
			itm_mfg_inst_no(value);
			return;
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			trd_cd(value);
			return;
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			base_unit_cd(value);
			return;
		}
		if ($mfg_aprv_sts_typ.equalsIgnoreCase(name)) {
			mfg_aprv_sts_typ(value);
			return;
		}
		if ($aprv_dpt_cd.equalsIgnoreCase(name)) {
			aprv_dpt_cd(value);
			return;
		}
		if ($aprv_usr_cd.equalsIgnoreCase(name)) {
			aprv_usr_cd(value);
			return;
		}
		if ($aprv_rsn.equalsIgnoreCase(name)) {
			aprv_rsn(value);
			return;
		}
		if ($act_dpt_cd.equalsIgnoreCase(name)) {
			act_dpt_cd(value);
			return;
		}
		if ($act_usr_cd.equalsIgnoreCase(name)) {
			act_usr_cd(value);
			return;
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			intr_rmrks(value);
			return;
		}
		if ($act_rpt_rmrks.equalsIgnoreCase(name)) {
			act_rpt_rmrks(value);
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
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($base_unit_yield_qty.equalsIgnoreCase(name)) {
			base_unit_yield_qty(value);
			return;
		}
		if ($base_unit_dfct_qty.equalsIgnoreCase(name)) {
			base_unit_dfct_qty(value);
			return;
		}
		if ($itm_yield.equalsIgnoreCase(name)) {
			itm_yield(value);
			return;
		}
		if ($seq.equalsIgnoreCase(name)) {
			seq(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, int value) {
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($base_unit_yield_qty.equalsIgnoreCase(name)) {
			base_unit_yield_qty(value);
			return;
		}
		if ($base_unit_dfct_qty.equalsIgnoreCase(name)) {
			base_unit_dfct_qty(value);
			return;
		}
		if ($itm_yield.equalsIgnoreCase(name)) {
			itm_yield(value);
			return;
		}
		if ($seq.equalsIgnoreCase(name)) {
			seq(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, long value) {
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($base_unit_yield_qty.equalsIgnoreCase(name)) {
			base_unit_yield_qty(value);
			return;
		}
		if ($base_unit_dfct_qty.equalsIgnoreCase(name)) {
			base_unit_dfct_qty(value);
			return;
		}
		if ($itm_yield.equalsIgnoreCase(name)) {
			itm_yield(value);
			return;
		}
		if ($seq.equalsIgnoreCase(name)) {
			seq(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, float value) {
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($base_unit_yield_qty.equalsIgnoreCase(name)) {
			base_unit_yield_qty(value);
			return;
		}
		if ($base_unit_dfct_qty.equalsIgnoreCase(name)) {
			base_unit_dfct_qty(value);
			return;
		}
		if ($itm_yield.equalsIgnoreCase(name)) {
			itm_yield(value);
			return;
		}
		if ($seq.equalsIgnoreCase(name)) {
			seq(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, double value) {
		if ($div_seq.equalsIgnoreCase(name)) {
			div_seq(value);
			return;
		}
		if ($base_unit_yield_qty.equalsIgnoreCase(name)) {
			base_unit_yield_qty(value);
			return;
		}
		if ($base_unit_dfct_qty.equalsIgnoreCase(name)) {
			base_unit_dfct_qty(value);
			return;
		}
		if ($itm_yield.equalsIgnoreCase(name)) {
			itm_yield(value);
			return;
		}
		if ($seq.equalsIgnoreCase(name)) {
			seq(value);
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
		if ($st_ac_dt.equalsIgnoreCase(name)) {
			st_ac_dt(value);
			return;
		}
		if ($end_ac_dt.equalsIgnoreCase(name)) {
			end_ac_dt(value);
			return;
		}
		if ($aprv_dt.equalsIgnoreCase(name)) {
			aprv_dt(value);
			return;
		}
		if ($aprv_tm.equalsIgnoreCase(name)) {
			aprv_tm(value);
			return;
		}
		if ($act_prnt_tm.equalsIgnoreCase(name)) {
			act_prnt_tm(value);
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
		if ($act_prnt_flg.equalsIgnoreCase(name)) {
			act_prnt_flg(value);
			return;
		}
		if ($arr_purc_auto_reg_flg.equalsIgnoreCase(name)) {
			arr_purc_auto_reg_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

}
