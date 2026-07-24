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
 * "製造指図ビュー // Mfg. order view"DBコンテナRowクラスです。<p>
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
 *  	<td>mfg_inst_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>製造指図ＮＯ</td>
 *  	<td>Mfg. order No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>mfg_inst_rev</td>
 *  	<td>N</td>
 *  	<td>4,0</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>製造指図改訂番号</td>
 *  	<td>Mfg. order rev. number</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>itm_mfg_inst_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>品目製造指図ＮＯ</td>
 *  	<td>Item mfg. order No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>po_d_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>発注明細ＮＯ</td>
 *  	<td>PO details No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>base_unit_yield_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>基準単位出来高予定数量</td>
 *  	<td>Base unit output scheduled qty.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>base_unit_inst_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>基準単位製造指図数量</td>
 *  	<td>Base unit mfg. order qty.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>base_unit_cd</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>基準単位ＣＤ</td>
 *  	<td>Base unit cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>st_schd_tm</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>着手予定日時</td>
 *  	<td>Scheduled start date and time</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>end_schd_tm</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>終了予定日時</td>
 *  	<td>Scheduled end date and time</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>rqst_dlv_rqst_tm</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>納入希望日時</td>
 *  	<td>Desired delivery date and time</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>inst_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>指図日</td>
 *  	<td>Order date</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>inst_prnt_tm</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>指図書発行日時</td>
 *  	<td>Order sheet issued date and time</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>inst_prnt_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>指図書発行済ＦＬＧ</td>
 *  	<td>Order sheet issued flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>aprv_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>承認対象ＦＬＧ</td>
 *  	<td>For approval flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>mfg_aprv_sts_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>製造承認状況区分</td>
 *  	<td>Mfg. approval status type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>aprv_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>承認日</td>
 *  	<td>Approval date</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>aprv_dpt_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>承認部門ＣＤ</td>
 *  	<td>Approval dept. cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>aprv_usr_cd</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>承認者ＣＤ</td>
 *  	<td>Approver cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>aprv_tm</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>承認日時</td>
 *  	<td>Approval date and time</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>aprv_rsn</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>承認理由</td>
 *  	<td>Approval reason</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>mfg_aprv_role_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>製造承認役割ＣＤ</td>
 *  	<td>Mfg. approval role cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>disp_pd</td>
 *  	<td>C</td>
 *  	<td>60</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>印字用表示期限</td>
 *  	<td>Display expiration for print</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>inst_dpt_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>指図部門ＣＤ</td>
 *  	<td>Order dept. cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>inst_usr_cd</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>指図担当者ＣＤ</td>
 *  	<td>Order PIC cd.</td>
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
 *  	<td>abort_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>打切ＦＬＧ</td>
 *  	<td>Cancel remaining flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>schd_chg_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>計画変更ＦＬＧ</td>
 *  	<td>Plan changed flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>po_locked_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>発注訂正・取消不可ＦＬＧ</td>
 *  	<td>Do not allow PO correction/cancel flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>po_auto_reg_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>発注時自動作成ＦＬＧ</td>
 *  	<td>Auto-creation at PO flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>mfg_inst_unit_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>製造指図単位区分</td>
 *  	<td>Mfg. order unit type</td>
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
 *  	<td>inst_rpt_rmrks</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>指図書備考</td>
 *  	<td>Order sheet remarks</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>inst_po_cnt_rmrks</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>指図・発注連絡備考</td>
 *  	<td>Order/PO contact remarks</td>
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
public class MGVT_MST_MFG_INST_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.VIEW;

	public static final String TABLE_NAME = "MGVT_MST_MFG_INST";

	public static final boolean EX_CTRL = false;
	
	public static final boolean LCL_TABLE = false;
	
	/**
	 * 製造指図ＮＯ. Mfg. order No..<p>
	 *
	 */
	public static final String $mfg_inst_no = "mfg_inst_no";
	private static final MCPermColumnInfo _mfg_inst_no = createColumnInfo("mfg_inst_no");
	public final MCStringPermColumn mfg_inst_no = createStringColumn(_mfg_inst_no);
	
	/**
	 * 製造指図改訂番号. Mfg. order rev. number.<p>
	 *
	 */
	public static final String $mfg_inst_rev = "mfg_inst_rev";
	private static final MCPermColumnInfo _mfg_inst_rev = createColumnInfo("mfg_inst_rev");
	public final MCNumberPermColumn mfg_inst_rev = createNumberColumn(_mfg_inst_rev);
	
	/**
	 * 品目製造指図ＮＯ. Item mfg. order No..<p>
	 *
	 */
	public static final String $itm_mfg_inst_no = "itm_mfg_inst_no";
	private static final MCPermColumnInfo _itm_mfg_inst_no = createColumnInfo("itm_mfg_inst_no");
	public final MCStringPermColumn itm_mfg_inst_no = createStringColumn(_itm_mfg_inst_no);
	
	/**
	 * 発注明細ＮＯ. PO details No..<p>
	 *
	 */
	public static final String $po_d_no = "po_d_no";
	private static final MCPermColumnInfo _po_d_no = createColumnInfo("po_d_no");
	public final MCStringPermColumn po_d_no = createStringColumn(_po_d_no);
	
	/**
	 * 基準単位出来高予定数量. Base unit output scheduled qty..<p>
	 *
	 */
	public static final String $base_unit_yield_qty = "base_unit_yield_qty";
	private static final MCPermColumnInfo _base_unit_yield_qty = createColumnInfo("base_unit_yield_qty");
	public final MCNumberPermColumn base_unit_yield_qty = createNumberColumn(_base_unit_yield_qty);
	
	/**
	 * 基準単位製造指図数量. Base unit mfg. order qty..<p>
	 *
	 */
	public static final String $base_unit_inst_qty = "base_unit_inst_qty";
	private static final MCPermColumnInfo _base_unit_inst_qty = createColumnInfo("base_unit_inst_qty");
	public final MCNumberPermColumn base_unit_inst_qty = createNumberColumn(_base_unit_inst_qty);
	
	/**
	 * 基準単位ＣＤ. Base unit cd..<p>
	 *
	 */
	public static final String $base_unit_cd = "base_unit_cd";
	private static final MCPermColumnInfo _base_unit_cd = createColumnInfo("base_unit_cd");
	public final MCStringPermColumn base_unit_cd = createStringColumn(_base_unit_cd);
	
	/**
	 * 着手予定日時. Scheduled start date and time.<p>
	 *
	 */
	public static final String $st_schd_tm = "st_schd_tm";
	private static final MCPermColumnInfo _st_schd_tm = createColumnInfo("st_schd_tm");
	public final MCDatePermColumn st_schd_tm = createDateColumn(_st_schd_tm);
	
	/**
	 * 終了予定日時. Scheduled end date and time.<p>
	 *
	 */
	public static final String $end_schd_tm = "end_schd_tm";
	private static final MCPermColumnInfo _end_schd_tm = createColumnInfo("end_schd_tm");
	public final MCDatePermColumn end_schd_tm = createDateColumn(_end_schd_tm);
	
	/**
	 * 納入希望日時. Desired delivery date and time.<p>
	 *
	 */
	public static final String $rqst_dlv_rqst_tm = "rqst_dlv_rqst_tm";
	private static final MCPermColumnInfo _rqst_dlv_rqst_tm = createColumnInfo("rqst_dlv_rqst_tm");
	public final MCDatePermColumn rqst_dlv_rqst_tm = createDateColumn(_rqst_dlv_rqst_tm);
	
	/**
	 * 指図日. Order date.<p>
	 *
	 */
	public static final String $inst_dt = "inst_dt";
	private static final MCPermColumnInfo _inst_dt = createColumnInfo("inst_dt");
	public final MCDatePermColumn inst_dt = createDateColumn(_inst_dt);
	
	/**
	 * 指図書発行日時. Order sheet issued date and time.<p>
	 *
	 */
	public static final String $inst_prnt_tm = "inst_prnt_tm";
	private static final MCPermColumnInfo _inst_prnt_tm = createColumnInfo("inst_prnt_tm");
	public final MCDatePermColumn inst_prnt_tm = createDateColumn(_inst_prnt_tm);
	
	/**
	 * 指図書発行済ＦＬＧ. Order sheet issued flg..<p>
	 *
	 */
	public static final String $inst_prnt_flg = "inst_prnt_flg";
	private static final MCPermColumnInfo _inst_prnt_flg = createColumnInfo("inst_prnt_flg");
	public final MCBooleanPermColumn inst_prnt_flg = createBooleanColumn(_inst_prnt_flg);
	
	/**
	 * 承認対象ＦＬＧ. For approval flg..<p>
	 *
	 */
	public static final String $aprv_flg = "aprv_flg";
	private static final MCPermColumnInfo _aprv_flg = createColumnInfo("aprv_flg");
	public final MCBooleanPermColumn aprv_flg = createBooleanColumn(_aprv_flg);
	
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
	 * 製造承認役割ＣＤ. Mfg. approval role cd..<p>
	 *
	 */
	public static final String $mfg_aprv_role_cd = "mfg_aprv_role_cd";
	private static final MCPermColumnInfo _mfg_aprv_role_cd = createColumnInfo("mfg_aprv_role_cd");
	public final MCStringPermColumn mfg_aprv_role_cd = createStringColumn(_mfg_aprv_role_cd);
	
	/**
	 * 印字用表示期限. Display expiration for print.<p>
	 *
	 */
	public static final String $disp_pd = "disp_pd";
	private static final MCPermColumnInfo _disp_pd = createColumnInfo("disp_pd");
	public final MCStringPermColumn disp_pd = createStringColumn(_disp_pd);
	
	/**
	 * 指図部門ＣＤ. Order dept. cd..<p>
	 *
	 */
	public static final String $inst_dpt_cd = "inst_dpt_cd";
	private static final MCPermColumnInfo _inst_dpt_cd = createColumnInfo("inst_dpt_cd");
	public final MCStringPermColumn inst_dpt_cd = createStringColumn(_inst_dpt_cd);
	
	/**
	 * 指図担当者ＣＤ. Order PIC cd..<p>
	 *
	 */
	public static final String $inst_usr_cd = "inst_usr_cd";
	private static final MCPermColumnInfo _inst_usr_cd = createColumnInfo("inst_usr_cd");
	public final MCStringPermColumn inst_usr_cd = createStringColumn(_inst_usr_cd);
	
	/**
	 * 取消ＦＬＧ. Cancel flg..<p>
	 *
	 */
	public static final String $can_flg = "can_flg";
	private static final MCPermColumnInfo _can_flg = createColumnInfo("can_flg");
	public final MCBooleanPermColumn can_flg = createBooleanColumn(_can_flg);
	
	/**
	 * 打切ＦＬＧ. Cancel remaining flg..<p>
	 *
	 */
	public static final String $abort_flg = "abort_flg";
	private static final MCPermColumnInfo _abort_flg = createColumnInfo("abort_flg");
	public final MCBooleanPermColumn abort_flg = createBooleanColumn(_abort_flg);
	
	/**
	 * 計画変更ＦＬＧ. Plan changed flg..<p>
	 *
	 */
	public static final String $schd_chg_flg = "schd_chg_flg";
	private static final MCPermColumnInfo _schd_chg_flg = createColumnInfo("schd_chg_flg");
	public final MCBooleanPermColumn schd_chg_flg = createBooleanColumn(_schd_chg_flg);
	
	/**
	 * 発注訂正・取消不可ＦＬＧ. Do not allow PO correction/cancel flg..<p>
	 *
	 */
	public static final String $po_locked_flg = "po_locked_flg";
	private static final MCPermColumnInfo _po_locked_flg = createColumnInfo("po_locked_flg");
	public final MCBooleanPermColumn po_locked_flg = createBooleanColumn(_po_locked_flg);
	
	/**
	 * 発注時自動作成ＦＬＧ. Auto-creation at PO flg..<p>
	 *
	 */
	public static final String $po_auto_reg_flg = "po_auto_reg_flg";
	private static final MCPermColumnInfo _po_auto_reg_flg = createColumnInfo("po_auto_reg_flg");
	public final MCBooleanPermColumn po_auto_reg_flg = createBooleanColumn(_po_auto_reg_flg);
	
	/**
	 * 製造指図単位区分. Mfg. order unit type.<p>
	 *
	 */
	public static final String $mfg_inst_unit_typ = "mfg_inst_unit_typ";
	private static final MCPermColumnInfo _mfg_inst_unit_typ = createColumnInfo("mfg_inst_unit_typ");
	public final MCStringPermColumn mfg_inst_unit_typ = createStringColumn(_mfg_inst_unit_typ);
	
	/**
	 * 内部備考. Internal remarks.<p>
	 *
	 */
	public static final String $intr_rmrks = "intr_rmrks";
	private static final MCPermColumnInfo _intr_rmrks = createColumnInfo("intr_rmrks");
	public final MCStringPermColumn intr_rmrks = createStringColumn(_intr_rmrks);
	
	/**
	 * 指図書備考. Order sheet remarks.<p>
	 *
	 */
	public static final String $inst_rpt_rmrks = "inst_rpt_rmrks";
	private static final MCPermColumnInfo _inst_rpt_rmrks = createColumnInfo("inst_rpt_rmrks");
	public final MCStringPermColumn inst_rpt_rmrks = createStringColumn(_inst_rpt_rmrks);
	
	/**
	 * 指図・発注連絡備考. Order/PO contact remarks.<p>
	 *
	 */
	public static final String $inst_po_cnt_rmrks = "inst_po_cnt_rmrks";
	private static final MCPermColumnInfo _inst_po_cnt_rmrks = createColumnInfo("inst_po_cnt_rmrks");
	public final MCStringPermColumn inst_po_cnt_rmrks = createStringColumn(_inst_po_cnt_rmrks);
	
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
	
	public static final MCMeta mfg_inst_no_META = createCommonMeta($mfg_inst_no, mcframe.commonMA.meta.MA_META.MFG_INST_NO);
	public static final MCMeta mfg_inst_rev_META = createCommonMeta($mfg_inst_rev, mcframe.commonMA.meta.MA_META.SLIP_REV);
	public static final MCMeta itm_mfg_inst_no_META = createCommonMeta($itm_mfg_inst_no, mcframe.commonMA.meta.MA_META.ITM_MFG_INST_NO);
	public static final MCMeta po_d_no_META = createCommonMeta($po_d_no, mcframe.commonMA.meta.MA_META.PO_D_NO);
	public static final MCMeta base_unit_yield_qty_META = createCommonMeta($base_unit_yield_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_inst_qty_META = createCommonMeta($base_unit_inst_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_cd_META = createCommonMeta($base_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta st_schd_tm_META = createCommonMeta($st_schd_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta end_schd_tm_META = createCommonMeta($end_schd_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta rqst_dlv_rqst_tm_META = createCommonMeta($rqst_dlv_rqst_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta inst_dt_META = createCommonMeta($inst_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta inst_prnt_tm_META = createCommonMeta($inst_prnt_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta inst_prnt_flg_META = createCommonMeta($inst_prnt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta aprv_flg_META = createCommonMeta($aprv_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta mfg_aprv_sts_typ_META = createStringMeta($mfg_aprv_sts_typ, 1);
	public static final MCMeta aprv_dt_META = createCommonMeta($aprv_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta aprv_dpt_cd_META = createCommonMeta($aprv_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta aprv_usr_cd_META = createCommonMeta($aprv_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta aprv_tm_META = createCommonMeta($aprv_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta aprv_rsn_META = createStringMeta($aprv_rsn, 100);
	public static final MCMeta mfg_aprv_role_cd_META = createCommonMeta($mfg_aprv_role_cd, mcframe.commonMA.meta.MA_META.APRV_ROLE_CD);
	public static final MCMeta disp_pd_META = createStringMeta($disp_pd, 60);
	public static final MCMeta inst_dpt_cd_META = createCommonMeta($inst_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta inst_usr_cd_META = createCommonMeta($inst_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta can_flg_META = createCommonMeta($can_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta abort_flg_META = createCommonMeta($abort_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta schd_chg_flg_META = createCommonMeta($schd_chg_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta po_locked_flg_META = createCommonMeta($po_locked_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta po_auto_reg_flg_META = createCommonMeta($po_auto_reg_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta mfg_inst_unit_typ_META = createCommonMeta($mfg_inst_unit_typ, mcframe.commonMA.meta.MA_META.MFG_INST_UNIT_TYP);
	public static final MCMeta intr_rmrks_META = createStringMeta($intr_rmrks, 100);
	public static final MCMeta inst_rpt_rmrks_META = createStringMeta($inst_rpt_rmrks, 100);
	public static final MCMeta inst_po_cnt_rmrks_META = createStringMeta($inst_po_cnt_rmrks, 100);
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
	
	protected static final ConstMetaList<MGVT_MST_MFG_INST_R> constMetas = new ConstMetaList<MGVT_MST_MFG_INST_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			mfg_inst_no_META,
			mfg_inst_rev_META,
			itm_mfg_inst_no_META,
			po_d_no_META,
			base_unit_yield_qty_META,
			base_unit_inst_qty_META,
			base_unit_cd_META,
			st_schd_tm_META,
			end_schd_tm_META,
			rqst_dlv_rqst_tm_META,
			inst_dt_META,
			inst_prnt_tm_META,
			inst_prnt_flg_META,
			aprv_flg_META,
			mfg_aprv_sts_typ_META,
			aprv_dt_META,
			aprv_dpt_cd_META,
			aprv_usr_cd_META,
			aprv_tm_META,
			aprv_rsn_META,
			mfg_aprv_role_cd_META,
			disp_pd_META,
			inst_dpt_cd_META,
			inst_usr_cd_META,
			can_flg_META,
			abort_flg_META,
			schd_chg_flg_META,
			po_locked_flg_META,
			po_auto_reg_flg_META,
			mfg_inst_unit_typ_META,
			intr_rmrks_META,
			inst_rpt_rmrks_META,
			inst_po_cnt_rmrks_META,
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
	protected MGVT_MST_MFG_INST_R(ConstMetaList<? extends MGVT_MST_MFG_INST_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MGVT_MST_MFG_INST_R(ConstMetaList<? extends MGVT_MST_MFG_INST_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MGVT_MST_MFG_INST_R.$mfg_inst_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_MST_MFG_INST_R.$mfg_inst_no,
				"mfg_inst_no",
				mfg_inst_no,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_MST_MFG_INST_R.$mfg_inst_rev,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_MST_MFG_INST_R.$mfg_inst_rev,
				"mfg_inst_rev",
				mfg_inst_rev,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_MST_MFG_INST_R.$itm_mfg_inst_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_MST_MFG_INST_R.$itm_mfg_inst_no,
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
			MGVT_MST_MFG_INST_R.$po_d_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_MST_MFG_INST_R.$po_d_no,
				"po_d_no",
				po_d_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_MST_MFG_INST_R.$base_unit_yield_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_MST_MFG_INST_R.$base_unit_yield_qty,
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
			MGVT_MST_MFG_INST_R.$base_unit_inst_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_MST_MFG_INST_R.$base_unit_inst_qty,
				"base_unit_inst_qty",
				base_unit_inst_qty,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_MST_MFG_INST_R.$base_unit_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_MST_MFG_INST_R.$base_unit_cd,
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
			MGVT_MST_MFG_INST_R.$st_schd_tm,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MGVT_MST_MFG_INST_R.$st_schd_tm,
				"st_schd_tm",
				st_schd_tm,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_MST_MFG_INST_R.$end_schd_tm,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MGVT_MST_MFG_INST_R.$end_schd_tm,
				"end_schd_tm",
				end_schd_tm,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_MST_MFG_INST_R.$rqst_dlv_rqst_tm,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MGVT_MST_MFG_INST_R.$rqst_dlv_rqst_tm,
				"rqst_dlv_rqst_tm",
				rqst_dlv_rqst_tm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_MST_MFG_INST_R.$inst_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MGVT_MST_MFG_INST_R.$inst_dt,
				"inst_dt",
				inst_dt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_MST_MFG_INST_R.$inst_prnt_tm,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MGVT_MST_MFG_INST_R.$inst_prnt_tm,
				"inst_prnt_tm",
				inst_prnt_tm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_MST_MFG_INST_R.$inst_prnt_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MGVT_MST_MFG_INST_R.$inst_prnt_flg,
				"inst_prnt_flg",
				inst_prnt_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_MST_MFG_INST_R.$aprv_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MGVT_MST_MFG_INST_R.$aprv_flg,
				"aprv_flg",
				aprv_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_MST_MFG_INST_R.$mfg_aprv_sts_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_MST_MFG_INST_R.$mfg_aprv_sts_typ,
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
			MGVT_MST_MFG_INST_R.$aprv_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MGVT_MST_MFG_INST_R.$aprv_dt,
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
			MGVT_MST_MFG_INST_R.$aprv_dpt_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_MST_MFG_INST_R.$aprv_dpt_cd,
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
			MGVT_MST_MFG_INST_R.$aprv_usr_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_MST_MFG_INST_R.$aprv_usr_cd,
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
			MGVT_MST_MFG_INST_R.$aprv_tm,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MGVT_MST_MFG_INST_R.$aprv_tm,
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
			MGVT_MST_MFG_INST_R.$aprv_rsn,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_MST_MFG_INST_R.$aprv_rsn,
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
			MGVT_MST_MFG_INST_R.$mfg_aprv_role_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_MST_MFG_INST_R.$mfg_aprv_role_cd,
				"mfg_aprv_role_cd",
				mfg_aprv_role_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_MST_MFG_INST_R.$disp_pd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_MST_MFG_INST_R.$disp_pd,
				"disp_pd",
				disp_pd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_MST_MFG_INST_R.$inst_dpt_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_MST_MFG_INST_R.$inst_dpt_cd,
				"inst_dpt_cd",
				inst_dpt_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_MST_MFG_INST_R.$inst_usr_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_MST_MFG_INST_R.$inst_usr_cd,
				"inst_usr_cd",
				inst_usr_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_MST_MFG_INST_R.$can_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MGVT_MST_MFG_INST_R.$can_flg,
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
			MGVT_MST_MFG_INST_R.$abort_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MGVT_MST_MFG_INST_R.$abort_flg,
				"abort_flg",
				abort_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_MST_MFG_INST_R.$schd_chg_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MGVT_MST_MFG_INST_R.$schd_chg_flg,
				"schd_chg_flg",
				schd_chg_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_MST_MFG_INST_R.$po_locked_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MGVT_MST_MFG_INST_R.$po_locked_flg,
				"po_locked_flg",
				po_locked_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_MST_MFG_INST_R.$po_auto_reg_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MGVT_MST_MFG_INST_R.$po_auto_reg_flg,
				"po_auto_reg_flg",
				po_auto_reg_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_MST_MFG_INST_R.$mfg_inst_unit_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_MST_MFG_INST_R.$mfg_inst_unit_typ,
				"mfg_inst_unit_typ",
				mfg_inst_unit_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_MST_MFG_INST_R.$intr_rmrks,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_MST_MFG_INST_R.$intr_rmrks,
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
			MGVT_MST_MFG_INST_R.$inst_rpt_rmrks,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_MST_MFG_INST_R.$inst_rpt_rmrks,
				"inst_rpt_rmrks",
				inst_rpt_rmrks,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_MST_MFG_INST_R.$inst_po_cnt_rmrks,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_MST_MFG_INST_R.$inst_po_cnt_rmrks,
				"inst_po_cnt_rmrks",
				inst_po_cnt_rmrks,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MGVT_MST_MFG_INST_R.$sub_char1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_MST_MFG_INST_R.$sub_char1,
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
			MGVT_MST_MFG_INST_R.$sub_char2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_MST_MFG_INST_R.$sub_char2,
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
			MGVT_MST_MFG_INST_R.$sub_char3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_MST_MFG_INST_R.$sub_char3,
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
			MGVT_MST_MFG_INST_R.$ins_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_MST_MFG_INST_R.$ins_usr_id,
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
			MGVT_MST_MFG_INST_R.$ins_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_MST_MFG_INST_R.$ins_usr_nm,
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
			MGVT_MST_MFG_INST_R.$ins_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MGVT_MST_MFG_INST_R.$ins_ts,
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
			MGVT_MST_MFG_INST_R.$ins_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_MST_MFG_INST_R.$ins_func_id,
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
			MGVT_MST_MFG_INST_R.$upd_cntr,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MGVT_MST_MFG_INST_R.$upd_cntr,
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
			MGVT_MST_MFG_INST_R.$upd_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_MST_MFG_INST_R.$upd_usr_id,
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
			MGVT_MST_MFG_INST_R.$upd_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_MST_MFG_INST_R.$upd_usr_nm,
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
			MGVT_MST_MFG_INST_R.$upd_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MGVT_MST_MFG_INST_R.$upd_ts,
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
			MGVT_MST_MFG_INST_R.$upd_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_MST_MFG_INST_R.$upd_func_id,
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
			MGVT_MST_MFG_INST_R.$upd_srv_req_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MGVT_MST_MFG_INST_R.$upd_srv_req_no,
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
	public static MGVT_MST_MFG_INST_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MGVT_MST_MFG_INST_R create(String alias) {
		MGVT_MST_MFG_INST_R row = new MGVT_MST_MFG_INST_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MGVT_MST_MFG_INST_R createByName(T proto) {
		MGVT_MST_MFG_INST_R row = MGVT_MST_MFG_INST_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MGVT_MST_MFG_INST_R clone() {
		return (MGVT_MST_MFG_INST_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MGVT_MST_MFG_INST_R createInstance() {
		return (MGVT_MST_MFG_INST_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MGVT_MST_MFG_INST_R getValues(String... names) {
		return (MGVT_MST_MFG_INST_R) super.getValues(names);
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
	 * 製造指図ＮＯ. Mfg. order No..<p>
	 *
	 */
	public String mfg_inst_no() {
		return getConstString(offset + 0, $mfg_inst_no);
	}

	/**
	 * 製造指図ＮＯ. Mfg. order No..<p>
	 *
	 */
	public void mfg_inst_no(String value) {
		setConstString(offset + 0, $mfg_inst_no, value);
	}

	/**
	 * 製造指図改訂番号. Mfg. order rev. number.<p>
	 *
	 */
	public MCNumber mfg_inst_rev() {
		return getConstNumber(offset + 1, $mfg_inst_rev);
	}

	/**
	 * 製造指図改訂番号. Mfg. order rev. number.<p>
	 *
	 */
	public void mfg_inst_rev(MCNumber value) {
		setConstNumber(offset + 1, $mfg_inst_rev, value);
	}
	
	/**
	 * 製造指図改訂番号. Mfg. order rev. number.<p>
	 *
	 */
	public void mfg_inst_rev(int value) {
		setConstNumber(offset + 1, $mfg_inst_rev, value);
	}
	
	/**
	 * 製造指図改訂番号. Mfg. order rev. number.<p>
	 *
	 */
	public void mfg_inst_rev(long value) {
		setConstNumber(offset + 1, $mfg_inst_rev, value);
	}
	
	/**
	 * 製造指図改訂番号. Mfg. order rev. number.<p>
	 *
	 */
	public void mfg_inst_rev(float value) {
		setConstNumber(offset + 1, $mfg_inst_rev, value);
	}
	
	/**
	 * 製造指図改訂番号. Mfg. order rev. number.<p>
	 *
	 */
	public void mfg_inst_rev(double value) {
		setConstNumber(offset + 1, $mfg_inst_rev, value);
	}
	
	/**
	 * 品目製造指図ＮＯ. Item mfg. order No..<p>
	 *
	 */
	public String itm_mfg_inst_no() {
		return getConstString(offset + 2, $itm_mfg_inst_no);
	}

	/**
	 * 品目製造指図ＮＯ. Item mfg. order No..<p>
	 *
	 */
	public void itm_mfg_inst_no(String value) {
		setConstString(offset + 2, $itm_mfg_inst_no, value);
	}

	/**
	 * 発注明細ＮＯ. PO details No..<p>
	 *
	 */
	public String po_d_no() {
		return getConstString(offset + 3, $po_d_no);
	}

	/**
	 * 発注明細ＮＯ. PO details No..<p>
	 *
	 */
	public void po_d_no(String value) {
		setConstString(offset + 3, $po_d_no, value);
	}

	/**
	 * 基準単位出来高予定数量. Base unit output scheduled qty..<p>
	 *
	 */
	public MCNumber base_unit_yield_qty() {
		return getConstNumber(offset + 4, $base_unit_yield_qty);
	}

	/**
	 * 基準単位出来高予定数量. Base unit output scheduled qty..<p>
	 *
	 */
	public void base_unit_yield_qty(MCNumber value) {
		setConstNumber(offset + 4, $base_unit_yield_qty, value);
	}
	
	/**
	 * 基準単位出来高予定数量. Base unit output scheduled qty..<p>
	 *
	 */
	public void base_unit_yield_qty(int value) {
		setConstNumber(offset + 4, $base_unit_yield_qty, value);
	}
	
	/**
	 * 基準単位出来高予定数量. Base unit output scheduled qty..<p>
	 *
	 */
	public void base_unit_yield_qty(long value) {
		setConstNumber(offset + 4, $base_unit_yield_qty, value);
	}
	
	/**
	 * 基準単位出来高予定数量. Base unit output scheduled qty..<p>
	 *
	 */
	public void base_unit_yield_qty(float value) {
		setConstNumber(offset + 4, $base_unit_yield_qty, value);
	}
	
	/**
	 * 基準単位出来高予定数量. Base unit output scheduled qty..<p>
	 *
	 */
	public void base_unit_yield_qty(double value) {
		setConstNumber(offset + 4, $base_unit_yield_qty, value);
	}
	
	/**
	 * 基準単位製造指図数量. Base unit mfg. order qty..<p>
	 *
	 */
	public MCNumber base_unit_inst_qty() {
		return getConstNumber(offset + 5, $base_unit_inst_qty);
	}

	/**
	 * 基準単位製造指図数量. Base unit mfg. order qty..<p>
	 *
	 */
	public void base_unit_inst_qty(MCNumber value) {
		setConstNumber(offset + 5, $base_unit_inst_qty, value);
	}
	
	/**
	 * 基準単位製造指図数量. Base unit mfg. order qty..<p>
	 *
	 */
	public void base_unit_inst_qty(int value) {
		setConstNumber(offset + 5, $base_unit_inst_qty, value);
	}
	
	/**
	 * 基準単位製造指図数量. Base unit mfg. order qty..<p>
	 *
	 */
	public void base_unit_inst_qty(long value) {
		setConstNumber(offset + 5, $base_unit_inst_qty, value);
	}
	
	/**
	 * 基準単位製造指図数量. Base unit mfg. order qty..<p>
	 *
	 */
	public void base_unit_inst_qty(float value) {
		setConstNumber(offset + 5, $base_unit_inst_qty, value);
	}
	
	/**
	 * 基準単位製造指図数量. Base unit mfg. order qty..<p>
	 *
	 */
	public void base_unit_inst_qty(double value) {
		setConstNumber(offset + 5, $base_unit_inst_qty, value);
	}
	
	/**
	 * 基準単位ＣＤ. Base unit cd..<p>
	 *
	 */
	public String base_unit_cd() {
		return getConstString(offset + 6, $base_unit_cd);
	}

	/**
	 * 基準単位ＣＤ. Base unit cd..<p>
	 *
	 */
	public void base_unit_cd(String value) {
		setConstString(offset + 6, $base_unit_cd, value);
	}

	/**
	 * 着手予定日時. Scheduled start date and time.<p>
	 *
	 */
	public MCDate st_schd_tm() {
		return getConstDate(offset + 7, $st_schd_tm);
	}

	/**
	 * 着手予定日時. Scheduled start date and time.<p>
	 *
	 */
	public void st_schd_tm(MCDate value) {
		setConstDate(offset + 7, $st_schd_tm, value);
	}

	/**
	 * 終了予定日時. Scheduled end date and time.<p>
	 *
	 */
	public MCDate end_schd_tm() {
		return getConstDate(offset + 8, $end_schd_tm);
	}

	/**
	 * 終了予定日時. Scheduled end date and time.<p>
	 *
	 */
	public void end_schd_tm(MCDate value) {
		setConstDate(offset + 8, $end_schd_tm, value);
	}

	/**
	 * 納入希望日時. Desired delivery date and time.<p>
	 *
	 */
	public MCDate rqst_dlv_rqst_tm() {
		return getConstDate(offset + 9, $rqst_dlv_rqst_tm);
	}

	/**
	 * 納入希望日時. Desired delivery date and time.<p>
	 *
	 */
	public void rqst_dlv_rqst_tm(MCDate value) {
		setConstDate(offset + 9, $rqst_dlv_rqst_tm, value);
	}

	/**
	 * 指図日. Order date.<p>
	 *
	 */
	public MCDate inst_dt() {
		return getConstDate(offset + 10, $inst_dt);
	}

	/**
	 * 指図日. Order date.<p>
	 *
	 */
	public void inst_dt(MCDate value) {
		setConstDate(offset + 10, $inst_dt, value);
	}

	/**
	 * 指図書発行日時. Order sheet issued date and time.<p>
	 *
	 */
	public MCDate inst_prnt_tm() {
		return getConstDate(offset + 11, $inst_prnt_tm);
	}

	/**
	 * 指図書発行日時. Order sheet issued date and time.<p>
	 *
	 */
	public void inst_prnt_tm(MCDate value) {
		setConstDate(offset + 11, $inst_prnt_tm, value);
	}

	/**
	 * 指図書発行済ＦＬＧ. Order sheet issued flg..<p>
	 *
	 */
	public boolean inst_prnt_flg() {
		return getConstBoolean(offset + 12, $inst_prnt_flg);
	}

	/**
	 * 指図書発行済ＦＬＧ. Order sheet issued flg..<p>
	 *
	 */
	public void inst_prnt_flg(boolean value) {
		setConstBoolean(offset + 12, $inst_prnt_flg, value);
	}

	/**
	 * 承認対象ＦＬＧ. For approval flg..<p>
	 *
	 */
	public boolean aprv_flg() {
		return getConstBoolean(offset + 13, $aprv_flg);
	}

	/**
	 * 承認対象ＦＬＧ. For approval flg..<p>
	 *
	 */
	public void aprv_flg(boolean value) {
		setConstBoolean(offset + 13, $aprv_flg, value);
	}

	/**
	 * 製造承認状況区分. Mfg. approval status type.<p>
	 *
	 */
	public String mfg_aprv_sts_typ() {
		return getConstString(offset + 14, $mfg_aprv_sts_typ);
	}

	/**
	 * 製造承認状況区分. Mfg. approval status type.<p>
	 *
	 */
	public void mfg_aprv_sts_typ(String value) {
		setConstString(offset + 14, $mfg_aprv_sts_typ, value);
	}

	/**
	 * 承認日. Approval date.<p>
	 *
	 */
	public MCDate aprv_dt() {
		return getConstDate(offset + 15, $aprv_dt);
	}

	/**
	 * 承認日. Approval date.<p>
	 *
	 */
	public void aprv_dt(MCDate value) {
		setConstDate(offset + 15, $aprv_dt, value);
	}

	/**
	 * 承認部門ＣＤ. Approval dept. cd..<p>
	 *
	 */
	public String aprv_dpt_cd() {
		return getConstString(offset + 16, $aprv_dpt_cd);
	}

	/**
	 * 承認部門ＣＤ. Approval dept. cd..<p>
	 *
	 */
	public void aprv_dpt_cd(String value) {
		setConstString(offset + 16, $aprv_dpt_cd, value);
	}

	/**
	 * 承認者ＣＤ. Approver cd..<p>
	 *
	 */
	public String aprv_usr_cd() {
		return getConstString(offset + 17, $aprv_usr_cd);
	}

	/**
	 * 承認者ＣＤ. Approver cd..<p>
	 *
	 */
	public void aprv_usr_cd(String value) {
		setConstString(offset + 17, $aprv_usr_cd, value);
	}

	/**
	 * 承認日時. Approval date and time.<p>
	 *
	 */
	public MCDate aprv_tm() {
		return getConstDate(offset + 18, $aprv_tm);
	}

	/**
	 * 承認日時. Approval date and time.<p>
	 *
	 */
	public void aprv_tm(MCDate value) {
		setConstDate(offset + 18, $aprv_tm, value);
	}

	/**
	 * 承認理由. Approval reason.<p>
	 *
	 */
	public String aprv_rsn() {
		return getConstString(offset + 19, $aprv_rsn);
	}

	/**
	 * 承認理由. Approval reason.<p>
	 *
	 */
	public void aprv_rsn(String value) {
		setConstString(offset + 19, $aprv_rsn, value);
	}

	/**
	 * 製造承認役割ＣＤ. Mfg. approval role cd..<p>
	 *
	 */
	public String mfg_aprv_role_cd() {
		return getConstString(offset + 20, $mfg_aprv_role_cd);
	}

	/**
	 * 製造承認役割ＣＤ. Mfg. approval role cd..<p>
	 *
	 */
	public void mfg_aprv_role_cd(String value) {
		setConstString(offset + 20, $mfg_aprv_role_cd, value);
	}

	/**
	 * 印字用表示期限. Display expiration for print.<p>
	 *
	 */
	public String disp_pd() {
		return getConstString(offset + 21, $disp_pd);
	}

	/**
	 * 印字用表示期限. Display expiration for print.<p>
	 *
	 */
	public void disp_pd(String value) {
		setConstString(offset + 21, $disp_pd, value);
	}

	/**
	 * 指図部門ＣＤ. Order dept. cd..<p>
	 *
	 */
	public String inst_dpt_cd() {
		return getConstString(offset + 22, $inst_dpt_cd);
	}

	/**
	 * 指図部門ＣＤ. Order dept. cd..<p>
	 *
	 */
	public void inst_dpt_cd(String value) {
		setConstString(offset + 22, $inst_dpt_cd, value);
	}

	/**
	 * 指図担当者ＣＤ. Order PIC cd..<p>
	 *
	 */
	public String inst_usr_cd() {
		return getConstString(offset + 23, $inst_usr_cd);
	}

	/**
	 * 指図担当者ＣＤ. Order PIC cd..<p>
	 *
	 */
	public void inst_usr_cd(String value) {
		setConstString(offset + 23, $inst_usr_cd, value);
	}

	/**
	 * 取消ＦＬＧ. Cancel flg..<p>
	 *
	 */
	public boolean can_flg() {
		return getConstBoolean(offset + 24, $can_flg);
	}

	/**
	 * 取消ＦＬＧ. Cancel flg..<p>
	 *
	 */
	public void can_flg(boolean value) {
		setConstBoolean(offset + 24, $can_flg, value);
	}

	/**
	 * 打切ＦＬＧ. Cancel remaining flg..<p>
	 *
	 */
	public boolean abort_flg() {
		return getConstBoolean(offset + 25, $abort_flg);
	}

	/**
	 * 打切ＦＬＧ. Cancel remaining flg..<p>
	 *
	 */
	public void abort_flg(boolean value) {
		setConstBoolean(offset + 25, $abort_flg, value);
	}

	/**
	 * 計画変更ＦＬＧ. Plan changed flg..<p>
	 *
	 */
	public boolean schd_chg_flg() {
		return getConstBoolean(offset + 26, $schd_chg_flg);
	}

	/**
	 * 計画変更ＦＬＧ. Plan changed flg..<p>
	 *
	 */
	public void schd_chg_flg(boolean value) {
		setConstBoolean(offset + 26, $schd_chg_flg, value);
	}

	/**
	 * 発注訂正・取消不可ＦＬＧ. Do not allow PO correction/cancel flg..<p>
	 *
	 */
	public boolean po_locked_flg() {
		return getConstBoolean(offset + 27, $po_locked_flg);
	}

	/**
	 * 発注訂正・取消不可ＦＬＧ. Do not allow PO correction/cancel flg..<p>
	 *
	 */
	public void po_locked_flg(boolean value) {
		setConstBoolean(offset + 27, $po_locked_flg, value);
	}

	/**
	 * 発注時自動作成ＦＬＧ. Auto-creation at PO flg..<p>
	 *
	 */
	public boolean po_auto_reg_flg() {
		return getConstBoolean(offset + 28, $po_auto_reg_flg);
	}

	/**
	 * 発注時自動作成ＦＬＧ. Auto-creation at PO flg..<p>
	 *
	 */
	public void po_auto_reg_flg(boolean value) {
		setConstBoolean(offset + 28, $po_auto_reg_flg, value);
	}

	/**
	 * 製造指図単位区分. Mfg. order unit type.<p>
	 *
	 */
	public String mfg_inst_unit_typ() {
		return getConstString(offset + 29, $mfg_inst_unit_typ);
	}

	/**
	 * 製造指図単位区分. Mfg. order unit type.<p>
	 *
	 */
	public void mfg_inst_unit_typ(String value) {
		setConstString(offset + 29, $mfg_inst_unit_typ, value);
	}

	/**
	 * 内部備考. Internal remarks.<p>
	 *
	 */
	public String intr_rmrks() {
		return getConstString(offset + 30, $intr_rmrks);
	}

	/**
	 * 内部備考. Internal remarks.<p>
	 *
	 */
	public void intr_rmrks(String value) {
		setConstString(offset + 30, $intr_rmrks, value);
	}

	/**
	 * 指図書備考. Order sheet remarks.<p>
	 *
	 */
	public String inst_rpt_rmrks() {
		return getConstString(offset + 31, $inst_rpt_rmrks);
	}

	/**
	 * 指図書備考. Order sheet remarks.<p>
	 *
	 */
	public void inst_rpt_rmrks(String value) {
		setConstString(offset + 31, $inst_rpt_rmrks, value);
	}

	/**
	 * 指図・発注連絡備考. Order/PO contact remarks.<p>
	 *
	 */
	public String inst_po_cnt_rmrks() {
		return getConstString(offset + 32, $inst_po_cnt_rmrks);
	}

	/**
	 * 指図・発注連絡備考. Order/PO contact remarks.<p>
	 *
	 */
	public void inst_po_cnt_rmrks(String value) {
		setConstString(offset + 32, $inst_po_cnt_rmrks, value);
	}

	/**
	 * 予備１. Spare 1.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 33, $sub_char1);
	}

	/**
	 * 予備１. Spare 1.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 33, $sub_char1, value);
	}

	/**
	 * 予備２. Spare 2.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 34, $sub_char2);
	}

	/**
	 * 予備２. Spare 2.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 34, $sub_char2, value);
	}

	/**
	 * 予備３. Spare 3.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 35, $sub_char3);
	}

	/**
	 * 予備３. Spare 3.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 35, $sub_char3, value);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 36, $ins_usr_id);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 36, $ins_usr_id, value);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 37, $ins_usr_nm);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 37, $ins_usr_nm, value);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 38, $ins_ts);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 38, $ins_ts, value);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 39, $ins_func_id);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 39, $ins_func_id, value);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 40, $upd_cntr);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 40, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 40, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 40, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 40, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 40, $upd_cntr, value);
	}
	
	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 41, $upd_usr_id);
	}

	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 41, $upd_usr_id, value);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 42, $upd_usr_nm);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 42, $upd_usr_nm, value);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 43, $upd_ts);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 43, $upd_ts, value);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 44, $upd_func_id);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 44, $upd_func_id, value);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 45, $upd_srv_req_no);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 45, $upd_srv_req_no, value);
	}

	public String getString(String name) {
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			return mfg_inst_no();
		}
		if ($itm_mfg_inst_no.equalsIgnoreCase(name)) {
			return itm_mfg_inst_no();
		}
		if ($po_d_no.equalsIgnoreCase(name)) {
			return po_d_no();
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
		if ($mfg_aprv_role_cd.equalsIgnoreCase(name)) {
			return mfg_aprv_role_cd();
		}
		if ($disp_pd.equalsIgnoreCase(name)) {
			return disp_pd();
		}
		if ($inst_dpt_cd.equalsIgnoreCase(name)) {
			return inst_dpt_cd();
		}
		if ($inst_usr_cd.equalsIgnoreCase(name)) {
			return inst_usr_cd();
		}
		if ($mfg_inst_unit_typ.equalsIgnoreCase(name)) {
			return mfg_inst_unit_typ();
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			return intr_rmrks();
		}
		if ($inst_rpt_rmrks.equalsIgnoreCase(name)) {
			return inst_rpt_rmrks();
		}
		if ($inst_po_cnt_rmrks.equalsIgnoreCase(name)) {
			return inst_po_cnt_rmrks();
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
		if ($mfg_inst_rev.equalsIgnoreCase(name)) {
			return mfg_inst_rev();
		}
		if ($base_unit_yield_qty.equalsIgnoreCase(name)) {
			return base_unit_yield_qty();
		}
		if ($base_unit_inst_qty.equalsIgnoreCase(name)) {
			return base_unit_inst_qty();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumber(name);
	}

	public MCDate getDate(String name) {
		if ($st_schd_tm.equalsIgnoreCase(name)) {
			return st_schd_tm();
		}
		if ($end_schd_tm.equalsIgnoreCase(name)) {
			return end_schd_tm();
		}
		if ($rqst_dlv_rqst_tm.equalsIgnoreCase(name)) {
			return rqst_dlv_rqst_tm();
		}
		if ($inst_dt.equalsIgnoreCase(name)) {
			return inst_dt();
		}
		if ($inst_prnt_tm.equalsIgnoreCase(name)) {
			return inst_prnt_tm();
		}
		if ($aprv_dt.equalsIgnoreCase(name)) {
			return aprv_dt();
		}
		if ($aprv_tm.equalsIgnoreCase(name)) {
			return aprv_tm();
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
		if ($inst_prnt_flg.equalsIgnoreCase(name)) {
			return inst_prnt_flg();
		}
		if ($aprv_flg.equalsIgnoreCase(name)) {
			return aprv_flg();
		}
		if ($can_flg.equalsIgnoreCase(name)) {
			return can_flg();
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			return abort_flg();
		}
		if ($schd_chg_flg.equalsIgnoreCase(name)) {
			return schd_chg_flg();
		}
		if ($po_locked_flg.equalsIgnoreCase(name)) {
			return po_locked_flg();
		}
		if ($po_auto_reg_flg.equalsIgnoreCase(name)) {
			return po_auto_reg_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			return mfg_inst_no();
		}
		if ($itm_mfg_inst_no.equalsIgnoreCase(name)) {
			return itm_mfg_inst_no();
		}
		if ($po_d_no.equalsIgnoreCase(name)) {
			return po_d_no();
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
		if ($mfg_aprv_role_cd.equalsIgnoreCase(name)) {
			return mfg_aprv_role_cd();
		}
		if ($disp_pd.equalsIgnoreCase(name)) {
			return disp_pd();
		}
		if ($inst_dpt_cd.equalsIgnoreCase(name)) {
			return inst_dpt_cd();
		}
		if ($inst_usr_cd.equalsIgnoreCase(name)) {
			return inst_usr_cd();
		}
		if ($mfg_inst_unit_typ.equalsIgnoreCase(name)) {
			return mfg_inst_unit_typ();
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			return intr_rmrks();
		}
		if ($inst_rpt_rmrks.equalsIgnoreCase(name)) {
			return inst_rpt_rmrks();
		}
		if ($inst_po_cnt_rmrks.equalsIgnoreCase(name)) {
			return inst_po_cnt_rmrks();
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
		if ($mfg_inst_rev.equalsIgnoreCase(name)) {
			return mfg_inst_rev();
		}
		if ($base_unit_yield_qty.equalsIgnoreCase(name)) {
			return base_unit_yield_qty();
		}
		if ($base_unit_inst_qty.equalsIgnoreCase(name)) {
			return base_unit_inst_qty();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumberNE(name);
	}

	public MCDate getDateNE(String name) {
		if ($st_schd_tm.equalsIgnoreCase(name)) {
			return st_schd_tm();
		}
		if ($end_schd_tm.equalsIgnoreCase(name)) {
			return end_schd_tm();
		}
		if ($rqst_dlv_rqst_tm.equalsIgnoreCase(name)) {
			return rqst_dlv_rqst_tm();
		}
		if ($inst_dt.equalsIgnoreCase(name)) {
			return inst_dt();
		}
		if ($inst_prnt_tm.equalsIgnoreCase(name)) {
			return inst_prnt_tm();
		}
		if ($aprv_dt.equalsIgnoreCase(name)) {
			return aprv_dt();
		}
		if ($aprv_tm.equalsIgnoreCase(name)) {
			return aprv_tm();
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
		if ($inst_prnt_flg.equalsIgnoreCase(name)) {
			return inst_prnt_flg();
		}
		if ($aprv_flg.equalsIgnoreCase(name)) {
			return aprv_flg();
		}
		if ($can_flg.equalsIgnoreCase(name)) {
			return can_flg();
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			return abort_flg();
		}
		if ($schd_chg_flg.equalsIgnoreCase(name)) {
			return schd_chg_flg();
		}
		if ($po_locked_flg.equalsIgnoreCase(name)) {
			return po_locked_flg();
		}
		if ($po_auto_reg_flg.equalsIgnoreCase(name)) {
			return po_auto_reg_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			mfg_inst_no(value);
			return;
		}
		if ($itm_mfg_inst_no.equalsIgnoreCase(name)) {
			itm_mfg_inst_no(value);
			return;
		}
		if ($po_d_no.equalsIgnoreCase(name)) {
			po_d_no(value);
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
		if ($mfg_aprv_role_cd.equalsIgnoreCase(name)) {
			mfg_aprv_role_cd(value);
			return;
		}
		if ($disp_pd.equalsIgnoreCase(name)) {
			disp_pd(value);
			return;
		}
		if ($inst_dpt_cd.equalsIgnoreCase(name)) {
			inst_dpt_cd(value);
			return;
		}
		if ($inst_usr_cd.equalsIgnoreCase(name)) {
			inst_usr_cd(value);
			return;
		}
		if ($mfg_inst_unit_typ.equalsIgnoreCase(name)) {
			mfg_inst_unit_typ(value);
			return;
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			intr_rmrks(value);
			return;
		}
		if ($inst_rpt_rmrks.equalsIgnoreCase(name)) {
			inst_rpt_rmrks(value);
			return;
		}
		if ($inst_po_cnt_rmrks.equalsIgnoreCase(name)) {
			inst_po_cnt_rmrks(value);
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
		if ($mfg_inst_rev.equalsIgnoreCase(name)) {
			mfg_inst_rev(value);
			return;
		}
		if ($base_unit_yield_qty.equalsIgnoreCase(name)) {
			base_unit_yield_qty(value);
			return;
		}
		if ($base_unit_inst_qty.equalsIgnoreCase(name)) {
			base_unit_inst_qty(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, int value) {
		if ($mfg_inst_rev.equalsIgnoreCase(name)) {
			mfg_inst_rev(value);
			return;
		}
		if ($base_unit_yield_qty.equalsIgnoreCase(name)) {
			base_unit_yield_qty(value);
			return;
		}
		if ($base_unit_inst_qty.equalsIgnoreCase(name)) {
			base_unit_inst_qty(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, long value) {
		if ($mfg_inst_rev.equalsIgnoreCase(name)) {
			mfg_inst_rev(value);
			return;
		}
		if ($base_unit_yield_qty.equalsIgnoreCase(name)) {
			base_unit_yield_qty(value);
			return;
		}
		if ($base_unit_inst_qty.equalsIgnoreCase(name)) {
			base_unit_inst_qty(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, float value) {
		if ($mfg_inst_rev.equalsIgnoreCase(name)) {
			mfg_inst_rev(value);
			return;
		}
		if ($base_unit_yield_qty.equalsIgnoreCase(name)) {
			base_unit_yield_qty(value);
			return;
		}
		if ($base_unit_inst_qty.equalsIgnoreCase(name)) {
			base_unit_inst_qty(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, double value) {
		if ($mfg_inst_rev.equalsIgnoreCase(name)) {
			mfg_inst_rev(value);
			return;
		}
		if ($base_unit_yield_qty.equalsIgnoreCase(name)) {
			base_unit_yield_qty(value);
			return;
		}
		if ($base_unit_inst_qty.equalsIgnoreCase(name)) {
			base_unit_inst_qty(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setDate(String name, MCDate value) {
		if ($st_schd_tm.equalsIgnoreCase(name)) {
			st_schd_tm(value);
			return;
		}
		if ($end_schd_tm.equalsIgnoreCase(name)) {
			end_schd_tm(value);
			return;
		}
		if ($rqst_dlv_rqst_tm.equalsIgnoreCase(name)) {
			rqst_dlv_rqst_tm(value);
			return;
		}
		if ($inst_dt.equalsIgnoreCase(name)) {
			inst_dt(value);
			return;
		}
		if ($inst_prnt_tm.equalsIgnoreCase(name)) {
			inst_prnt_tm(value);
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
		if ($inst_prnt_flg.equalsIgnoreCase(name)) {
			inst_prnt_flg(value);
			return;
		}
		if ($aprv_flg.equalsIgnoreCase(name)) {
			aprv_flg(value);
			return;
		}
		if ($can_flg.equalsIgnoreCase(name)) {
			can_flg(value);
			return;
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			abort_flg(value);
			return;
		}
		if ($schd_chg_flg.equalsIgnoreCase(name)) {
			schd_chg_flg(value);
			return;
		}
		if ($po_locked_flg.equalsIgnoreCase(name)) {
			po_locked_flg(value);
			return;
		}
		if ($po_auto_reg_flg.equalsIgnoreCase(name)) {
			po_auto_reg_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($mfg_inst_no.equalsIgnoreCase(name)) {
			mfg_inst_no(value);
			return;
		}
		if ($itm_mfg_inst_no.equalsIgnoreCase(name)) {
			itm_mfg_inst_no(value);
			return;
		}
		if ($po_d_no.equalsIgnoreCase(name)) {
			po_d_no(value);
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
		if ($mfg_aprv_role_cd.equalsIgnoreCase(name)) {
			mfg_aprv_role_cd(value);
			return;
		}
		if ($disp_pd.equalsIgnoreCase(name)) {
			disp_pd(value);
			return;
		}
		if ($inst_dpt_cd.equalsIgnoreCase(name)) {
			inst_dpt_cd(value);
			return;
		}
		if ($inst_usr_cd.equalsIgnoreCase(name)) {
			inst_usr_cd(value);
			return;
		}
		if ($mfg_inst_unit_typ.equalsIgnoreCase(name)) {
			mfg_inst_unit_typ(value);
			return;
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			intr_rmrks(value);
			return;
		}
		if ($inst_rpt_rmrks.equalsIgnoreCase(name)) {
			inst_rpt_rmrks(value);
			return;
		}
		if ($inst_po_cnt_rmrks.equalsIgnoreCase(name)) {
			inst_po_cnt_rmrks(value);
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
		if ($mfg_inst_rev.equalsIgnoreCase(name)) {
			mfg_inst_rev(value);
			return;
		}
		if ($base_unit_yield_qty.equalsIgnoreCase(name)) {
			base_unit_yield_qty(value);
			return;
		}
		if ($base_unit_inst_qty.equalsIgnoreCase(name)) {
			base_unit_inst_qty(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, int value) {
		if ($mfg_inst_rev.equalsIgnoreCase(name)) {
			mfg_inst_rev(value);
			return;
		}
		if ($base_unit_yield_qty.equalsIgnoreCase(name)) {
			base_unit_yield_qty(value);
			return;
		}
		if ($base_unit_inst_qty.equalsIgnoreCase(name)) {
			base_unit_inst_qty(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, long value) {
		if ($mfg_inst_rev.equalsIgnoreCase(name)) {
			mfg_inst_rev(value);
			return;
		}
		if ($base_unit_yield_qty.equalsIgnoreCase(name)) {
			base_unit_yield_qty(value);
			return;
		}
		if ($base_unit_inst_qty.equalsIgnoreCase(name)) {
			base_unit_inst_qty(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, float value) {
		if ($mfg_inst_rev.equalsIgnoreCase(name)) {
			mfg_inst_rev(value);
			return;
		}
		if ($base_unit_yield_qty.equalsIgnoreCase(name)) {
			base_unit_yield_qty(value);
			return;
		}
		if ($base_unit_inst_qty.equalsIgnoreCase(name)) {
			base_unit_inst_qty(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, double value) {
		if ($mfg_inst_rev.equalsIgnoreCase(name)) {
			mfg_inst_rev(value);
			return;
		}
		if ($base_unit_yield_qty.equalsIgnoreCase(name)) {
			base_unit_yield_qty(value);
			return;
		}
		if ($base_unit_inst_qty.equalsIgnoreCase(name)) {
			base_unit_inst_qty(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setDateNE(String name, MCDate value) {
		if ($st_schd_tm.equalsIgnoreCase(name)) {
			st_schd_tm(value);
			return;
		}
		if ($end_schd_tm.equalsIgnoreCase(name)) {
			end_schd_tm(value);
			return;
		}
		if ($rqst_dlv_rqst_tm.equalsIgnoreCase(name)) {
			rqst_dlv_rqst_tm(value);
			return;
		}
		if ($inst_dt.equalsIgnoreCase(name)) {
			inst_dt(value);
			return;
		}
		if ($inst_prnt_tm.equalsIgnoreCase(name)) {
			inst_prnt_tm(value);
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
		if ($inst_prnt_flg.equalsIgnoreCase(name)) {
			inst_prnt_flg(value);
			return;
		}
		if ($aprv_flg.equalsIgnoreCase(name)) {
			aprv_flg(value);
			return;
		}
		if ($can_flg.equalsIgnoreCase(name)) {
			can_flg(value);
			return;
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			abort_flg(value);
			return;
		}
		if ($schd_chg_flg.equalsIgnoreCase(name)) {
			schd_chg_flg(value);
			return;
		}
		if ($po_locked_flg.equalsIgnoreCase(name)) {
			po_locked_flg(value);
			return;
		}
		if ($po_auto_reg_flg.equalsIgnoreCase(name)) {
			po_auto_reg_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

}
