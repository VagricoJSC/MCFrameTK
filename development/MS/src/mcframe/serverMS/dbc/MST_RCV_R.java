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
 * "入金 // Payment received"DBコンテナRowクラスです。<p>
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
 *  	<td>rcv_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>入金ＮＯ</td>
 *  	<td>Payment received No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>slo_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>受注ＮＯ</td>
 *  	<td>Sales order No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>dat_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>データ区分</td>
 *  	<td>Data type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>rcst_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>入金先ＣＤ</td>
 *  	<td>Payer cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>bcst_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>請求先ＣＤ</td>
 *  	<td>Billing customer cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>bill_dpt_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>請求部門ＣＤ</td>
 *  	<td>Billing dept. cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>acst_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>売掛先ＣＤ</td>
 *  	<td>AR customer cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>asppl_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>買掛先ＣＤ</td>
 *  	<td>AP supplier cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>bsppl_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>支払予定管理先ＣＤ</td>
 *  	<td>Scheduled payee cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>rcv_dpt_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>入金部門ＣＤ</td>
 *  	<td>Payment receiving dept. cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>wg_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>ワーキンググループＣＤ</td>
 *  	<td>WG cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>rcv_usr_cd</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>入金担当者ＣＤ</td>
 *  	<td>Payment received PIC cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>rcv_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>入金日</td>
 *  	<td>Payment received date</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ac_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>計上日</td>
 *  	<td>Recording date</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>rcv_mtd_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>入金方法ＣＤ</td>
 *  	<td>Payment received method cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>rcv_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>入金区分</td>
 *  	<td>Payment received type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>bank_ac_cd</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>口座ＣＤ</td>
 *  	<td>Bank account cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>xfr_psn</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>振込人名</td>
 *  	<td>Payment person name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>note_mng_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>手形管理ＮＯ</td>
 *  	<td>Note management No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>trd_cur_cd</td>
 *  	<td>C</td>
 *  	<td>3</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>取引通貨ＣＤ</td>
 *  	<td>Transaction currency cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>base_cur_cd</td>
 *  	<td>C</td>
 *  	<td>3</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>基準通貨ＣＤ</td>
 *  	<td>Base currency cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>xrate_cd</td>
 *  	<td>C</td>
 *  	<td>2</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>為替レートＣＤ</td>
 *  	<td>Exchange rate cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>xrate</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>為替レート</td>
 *  	<td>Exchange rate</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>rcv_rmrks</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>入金備考</td>
 *  	<td>Payment received remarks</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>src_rcv_act_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>発生元入金実績ＮＯ</td>
 *  	<td>Source incoming payment result received No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>src_rcv_act_seq</td>
 *  	<td>N</td>
 *  	<td>4,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>発生元入金実績連番</td>
 *  	<td>Source incoming payment result sequence number</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>src_rcv_act_d_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>発生元入金実績明細ＮＯ</td>
 *  	<td>Source incoming payment result details No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>src_rcv_act_d_seq</td>
 *  	<td>N</td>
 *  	<td>4,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>発生元入金実績明細連番</td>
 *  	<td>Source incoming payment result details sequence number</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>pay_act_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>支払実績ＮＯ</td>
 *  	<td>Payment result No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>rcv_amt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>入金額</td>
 *  	<td>Payment received amount</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>rcv_proc_amt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>入金処理額</td>
 *  	<td>Processed payment received amount</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>not_proc_bal</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>未処理残高</td>
 *  	<td>Unreconciled balance</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>com_paid</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>振込手数料</td>
 *  	<td>Transfer fee</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>bill_setoff_amt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>請求済相殺額</td>
 *  	<td>Billing offset amount</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>auto_appl_basis_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>自動消込基準日</td>
 *  	<td>Auto-reconciliation base date</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>rcv_auto_appl_tgt_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>入金自動消込対象ＦＬＧ</td>
 *  	<td>For auto-reconciliation flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>auto_appl_sts_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>自動消込状況区分</td>
 *  	<td>Auto-reconciliation status type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>fb_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>ＦＢＦＬＧ</td>
 *  	<td>FB flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ext_sys_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>外部システムＣＤ</td>
 *  	<td>External system cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ext_rcv_no</td>
 *  	<td>C</td>
 *  	<td>300</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>外部入金ＮＯ</td>
 *  	<td>External payment received No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>seq_no</td>
 *  	<td>N</td>
 *  	<td>9,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>枝番</td>
 *  	<td>Branch number</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>prnt_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>発行済ＦＬＧ</td>
 *  	<td>Issued flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>div_src_rcv_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>分割元入金ＮＯ</td>
 *  	<td>Payment received split source No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>div_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>分割済ＦＬＧ</td>
 *  	<td>Split flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sub_char1</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備１</td>
 *  	<td>Spare 1</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sub_char2</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備２</td>
 *  	<td>Spare 2</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sub_char3</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備３</td>
 *  	<td>Spare 3</td>
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
 *  <tr >
 *  	<td>C</td>
 *  	<td>ar_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>債権区分</td>
 *  	<td>AR type</td>
 *  </tr>
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
public class MST_RCV_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.CO_VIEW;

	public static final String TABLE_NAME = "MST_RCV";

	public static final boolean EX_CTRL = true;
	
	public static final boolean LCL_TABLE = false;
	
	/**
	 * 入金ＮＯ. Payment received No..<p>
	 *
	 */
	public static final String $rcv_no = "rcv_no";
	private static final MCPermColumnInfo _rcv_no = createColumnInfo("rcv_no");
	public final MCStringPermColumn rcv_no = createStringColumn(_rcv_no);
	
	/**
	 * 受注ＮＯ. Sales order No..<p>
	 *
	 */
	public static final String $slo_no = "slo_no";
	private static final MCPermColumnInfo _slo_no = createColumnInfo("slo_no");
	public final MCStringPermColumn slo_no = createStringColumn(_slo_no);
	
	/**
	 * データ区分. Data type.<p>
	 *
	 */
	public static final String $dat_typ = "dat_typ";
	private static final MCPermColumnInfo _dat_typ = createColumnInfo("dat_typ");
	public final MCStringPermColumn dat_typ = createStringColumn(_dat_typ);
	
	/**
	 * 入金先ＣＤ. Payer cd..<p>
	 *
	 */
	public static final String $rcst_cd = "rcst_cd";
	private static final MCPermColumnInfo _rcst_cd = createColumnInfo("rcst_cd");
	public final MCStringPermColumn rcst_cd = createStringColumn(_rcst_cd);
	
	/**
	 * 請求先ＣＤ. Billing customer cd..<p>
	 *
	 */
	public static final String $bcst_cd = "bcst_cd";
	private static final MCPermColumnInfo _bcst_cd = createColumnInfo("bcst_cd");
	public final MCStringPermColumn bcst_cd = createStringColumn(_bcst_cd);
	
	/**
	 * 請求部門ＣＤ. Billing dept. cd..<p>
	 *
	 */
	public static final String $bill_dpt_cd = "bill_dpt_cd";
	private static final MCPermColumnInfo _bill_dpt_cd = createColumnInfo("bill_dpt_cd");
	public final MCStringPermColumn bill_dpt_cd = createStringColumn(_bill_dpt_cd);
	
	/**
	 * 売掛先ＣＤ. AR customer cd..<p>
	 *
	 */
	public static final String $acst_cd = "acst_cd";
	private static final MCPermColumnInfo _acst_cd = createColumnInfo("acst_cd");
	public final MCStringPermColumn acst_cd = createStringColumn(_acst_cd);
	
	/**
	 * 買掛先ＣＤ. AP supplier cd..<p>
	 *
	 */
	public static final String $asppl_cd = "asppl_cd";
	private static final MCPermColumnInfo _asppl_cd = createColumnInfo("asppl_cd");
	public final MCStringPermColumn asppl_cd = createStringColumn(_asppl_cd);
	
	/**
	 * 支払予定管理先ＣＤ. Scheduled payee cd..<p>
	 *
	 */
	public static final String $bsppl_cd = "bsppl_cd";
	private static final MCPermColumnInfo _bsppl_cd = createColumnInfo("bsppl_cd");
	public final MCStringPermColumn bsppl_cd = createStringColumn(_bsppl_cd);
	
	/**
	 * 入金部門ＣＤ. Payment receiving dept. cd..<p>
	 *
	 */
	public static final String $rcv_dpt_cd = "rcv_dpt_cd";
	private static final MCPermColumnInfo _rcv_dpt_cd = createColumnInfo("rcv_dpt_cd");
	public final MCStringPermColumn rcv_dpt_cd = createStringColumn(_rcv_dpt_cd);
	
	/**
	 * ワーキンググループＣＤ. WG cd..<p>
	 *
	 */
	public static final String $wg_cd = "wg_cd";
	private static final MCPermColumnInfo _wg_cd = createColumnInfo("wg_cd");
	public final MCStringPermColumn wg_cd = createStringColumn(_wg_cd);
	
	/**
	 * 入金担当者ＣＤ. Payment received PIC cd..<p>
	 *
	 */
	public static final String $rcv_usr_cd = "rcv_usr_cd";
	private static final MCPermColumnInfo _rcv_usr_cd = createColumnInfo("rcv_usr_cd");
	public final MCStringPermColumn rcv_usr_cd = createStringColumn(_rcv_usr_cd);
	
	/**
	 * 入金日. Payment received date.<p>
	 *
	 */
	public static final String $rcv_dt = "rcv_dt";
	private static final MCPermColumnInfo _rcv_dt = createColumnInfo("rcv_dt");
	public final MCDatePermColumn rcv_dt = createDateColumn(_rcv_dt);
	
	/**
	 * 計上日. Recording date.<p>
	 *
	 */
	public static final String $ac_dt = "ac_dt";
	private static final MCPermColumnInfo _ac_dt = createColumnInfo("ac_dt");
	public final MCDatePermColumn ac_dt = createDateColumn(_ac_dt);
	
	/**
	 * 入金方法ＣＤ. Payment received method cd..<p>
	 *
	 */
	public static final String $rcv_mtd_cd = "rcv_mtd_cd";
	private static final MCPermColumnInfo _rcv_mtd_cd = createColumnInfo("rcv_mtd_cd");
	public final MCStringPermColumn rcv_mtd_cd = createStringColumn(_rcv_mtd_cd);
	
	/**
	 * 入金区分. Payment received type.<p>
	 *
	 */
	public static final String $rcv_typ = "rcv_typ";
	private static final MCPermColumnInfo _rcv_typ = createColumnInfo("rcv_typ");
	public final MCStringPermColumn rcv_typ = createStringColumn(_rcv_typ);
	
	/**
	 * 口座ＣＤ. Bank account cd..<p>
	 *
	 */
	public static final String $bank_ac_cd = "bank_ac_cd";
	private static final MCPermColumnInfo _bank_ac_cd = createColumnInfo("bank_ac_cd");
	public final MCStringPermColumn bank_ac_cd = createStringColumn(_bank_ac_cd);
	
	/**
	 * 振込人名. Payment person name.<p>
	 *
	 */
	public static final String $xfr_psn = "xfr_psn";
	private static final MCPermColumnInfo _xfr_psn = createColumnInfo("xfr_psn");
	public final MCStringPermColumn xfr_psn = createStringColumn(_xfr_psn);
	
	/**
	 * 手形管理ＮＯ. Note management No..<p>
	 *
	 */
	public static final String $note_mng_no = "note_mng_no";
	private static final MCPermColumnInfo _note_mng_no = createColumnInfo("note_mng_no");
	public final MCStringPermColumn note_mng_no = createStringColumn(_note_mng_no);
	
	/**
	 * 取引通貨ＣＤ. Transaction currency cd..<p>
	 *
	 */
	public static final String $trd_cur_cd = "trd_cur_cd";
	private static final MCPermColumnInfo _trd_cur_cd = createColumnInfo("trd_cur_cd");
	public final MCStringPermColumn trd_cur_cd = createStringColumn(_trd_cur_cd);
	
	/**
	 * 基準通貨ＣＤ. Base currency cd..<p>
	 *
	 */
	public static final String $base_cur_cd = "base_cur_cd";
	private static final MCPermColumnInfo _base_cur_cd = createColumnInfo("base_cur_cd");
	public final MCStringPermColumn base_cur_cd = createStringColumn(_base_cur_cd);
	
	/**
	 * 為替レートＣＤ. Exchange rate cd..<p>
	 *
	 */
	public static final String $xrate_cd = "xrate_cd";
	private static final MCPermColumnInfo _xrate_cd = createColumnInfo("xrate_cd");
	public final MCStringPermColumn xrate_cd = createStringColumn(_xrate_cd);
	
	/**
	 * 為替レート. Exchange rate.<p>
	 *
	 */
	public static final String $xrate = "xrate";
	private static final MCPermColumnInfo _xrate = createColumnInfo("xrate");
	public final MCNumberPermColumn xrate = createNumberColumn(_xrate);
	
	/**
	 * 入金備考. Payment received remarks.<p>
	 *
	 */
	public static final String $rcv_rmrks = "rcv_rmrks";
	private static final MCPermColumnInfo _rcv_rmrks = createColumnInfo("rcv_rmrks");
	public final MCStringPermColumn rcv_rmrks = createStringColumn(_rcv_rmrks);
	
	/**
	 * 発生元入金実績ＮＯ. Source incoming payment result received No..<p>
	 *
	 */
	public static final String $src_rcv_act_no = "src_rcv_act_no";
	private static final MCPermColumnInfo _src_rcv_act_no = createColumnInfo("src_rcv_act_no");
	public final MCStringPermColumn src_rcv_act_no = createStringColumn(_src_rcv_act_no);
	
	/**
	 * 発生元入金実績連番. Source incoming payment result sequence number.<p>
	 *
	 */
	public static final String $src_rcv_act_seq = "src_rcv_act_seq";
	private static final MCPermColumnInfo _src_rcv_act_seq = createColumnInfo("src_rcv_act_seq");
	public final MCNumberPermColumn src_rcv_act_seq = createNumberColumn(_src_rcv_act_seq);
	
	/**
	 * 発生元入金実績明細ＮＯ. Source incoming payment result details No..<p>
	 *
	 */
	public static final String $src_rcv_act_d_no = "src_rcv_act_d_no";
	private static final MCPermColumnInfo _src_rcv_act_d_no = createColumnInfo("src_rcv_act_d_no");
	public final MCStringPermColumn src_rcv_act_d_no = createStringColumn(_src_rcv_act_d_no);
	
	/**
	 * 発生元入金実績明細連番. Source incoming payment result details sequence number.<p>
	 *
	 */
	public static final String $src_rcv_act_d_seq = "src_rcv_act_d_seq";
	private static final MCPermColumnInfo _src_rcv_act_d_seq = createColumnInfo("src_rcv_act_d_seq");
	public final MCNumberPermColumn src_rcv_act_d_seq = createNumberColumn(_src_rcv_act_d_seq);
	
	/**
	 * 支払実績ＮＯ. Payment result No..<p>
	 *
	 */
	public static final String $pay_act_no = "pay_act_no";
	private static final MCPermColumnInfo _pay_act_no = createColumnInfo("pay_act_no");
	public final MCStringPermColumn pay_act_no = createStringColumn(_pay_act_no);
	
	/**
	 * 入金額. Payment received amount.<p>
	 *
	 */
	public static final String $rcv_amt = "rcv_amt";
	private static final MCPermColumnInfo _rcv_amt = createColumnInfo("rcv_amt");
	public final MCNumberPermColumn rcv_amt = createNumberColumn(_rcv_amt);
	
	/**
	 * 入金処理額. Processed payment received amount.<p>
	 *
	 */
	public static final String $rcv_proc_amt = "rcv_proc_amt";
	private static final MCPermColumnInfo _rcv_proc_amt = createColumnInfo("rcv_proc_amt");
	public final MCNumberPermColumn rcv_proc_amt = createNumberColumn(_rcv_proc_amt);
	
	/**
	 * 未処理残高. Unreconciled balance.<p>
	 *
	 */
	public static final String $not_proc_bal = "not_proc_bal";
	private static final MCPermColumnInfo _not_proc_bal = createColumnInfo("not_proc_bal");
	public final MCNumberPermColumn not_proc_bal = createNumberColumn(_not_proc_bal);
	
	/**
	 * 振込手数料. Transfer fee.<p>
	 *
	 */
	public static final String $com_paid = "com_paid";
	private static final MCPermColumnInfo _com_paid = createColumnInfo("com_paid");
	public final MCNumberPermColumn com_paid = createNumberColumn(_com_paid);
	
	/**
	 * 請求済相殺額. Billing offset amount.<p>
	 *
	 */
	public static final String $bill_setoff_amt = "bill_setoff_amt";
	private static final MCPermColumnInfo _bill_setoff_amt = createColumnInfo("bill_setoff_amt");
	public final MCNumberPermColumn bill_setoff_amt = createNumberColumn(_bill_setoff_amt);
	
	/**
	 * 自動消込基準日. Auto-reconciliation base date.<p>
	 *
	 */
	public static final String $auto_appl_basis_dt = "auto_appl_basis_dt";
	private static final MCPermColumnInfo _auto_appl_basis_dt = createColumnInfo("auto_appl_basis_dt");
	public final MCDatePermColumn auto_appl_basis_dt = createDateColumn(_auto_appl_basis_dt);
	
	/**
	 * 入金自動消込対象ＦＬＧ. For auto-reconciliation flg..<p>
	 *
	 */
	public static final String $rcv_auto_appl_tgt_flg = "rcv_auto_appl_tgt_flg";
	private static final MCPermColumnInfo _rcv_auto_appl_tgt_flg = createColumnInfo("rcv_auto_appl_tgt_flg");
	public final MCBooleanPermColumn rcv_auto_appl_tgt_flg = createBooleanColumn(_rcv_auto_appl_tgt_flg);
	
	/**
	 * 自動消込状況区分. Auto-reconciliation status type.<p>
	 *
	 */
	public static final String $auto_appl_sts_typ = "auto_appl_sts_typ";
	private static final MCPermColumnInfo _auto_appl_sts_typ = createColumnInfo("auto_appl_sts_typ");
	public final MCStringPermColumn auto_appl_sts_typ = createStringColumn(_auto_appl_sts_typ);
	
	/**
	 * ＦＢＦＬＧ. FB flg..<p>
	 *
	 */
	public static final String $fb_flg = "fb_flg";
	private static final MCPermColumnInfo _fb_flg = createColumnInfo("fb_flg");
	public final MCBooleanPermColumn fb_flg = createBooleanColumn(_fb_flg);
	
	/**
	 * 外部システムＣＤ. External system cd..<p>
	 *
	 */
	public static final String $ext_sys_cd = "ext_sys_cd";
	private static final MCPermColumnInfo _ext_sys_cd = createColumnInfo("ext_sys_cd");
	public final MCStringPermColumn ext_sys_cd = createStringColumn(_ext_sys_cd);
	
	/**
	 * 外部入金ＮＯ. External payment received No..<p>
	 *
	 */
	public static final String $ext_rcv_no = "ext_rcv_no";
	private static final MCPermColumnInfo _ext_rcv_no = createColumnInfo("ext_rcv_no");
	public final MCStringPermColumn ext_rcv_no = createStringColumn(_ext_rcv_no);
	
	/**
	 * 枝番. Branch number.<p>
	 *
	 */
	public static final String $seq_no = "seq_no";
	private static final MCPermColumnInfo _seq_no = createColumnInfo("seq_no");
	public final MCNumberPermColumn seq_no = createNumberColumn(_seq_no);
	
	/**
	 * 発行済ＦＬＧ. Issued flg..<p>
	 *
	 */
	public static final String $prnt_flg = "prnt_flg";
	private static final MCPermColumnInfo _prnt_flg = createColumnInfo("prnt_flg");
	public final MCBooleanPermColumn prnt_flg = createBooleanColumn(_prnt_flg);
	
	/**
	 * 分割元入金ＮＯ. Payment received split source No..<p>
	 *
	 */
	public static final String $div_src_rcv_no = "div_src_rcv_no";
	private static final MCPermColumnInfo _div_src_rcv_no = createColumnInfo("div_src_rcv_no");
	public final MCStringPermColumn div_src_rcv_no = createStringColumn(_div_src_rcv_no);
	
	/**
	 * 分割済ＦＬＧ. Split flg..<p>
	 *
	 */
	public static final String $div_flg = "div_flg";
	private static final MCPermColumnInfo _div_flg = createColumnInfo("div_flg");
	public final MCBooleanPermColumn div_flg = createBooleanColumn(_div_flg);
	
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
	
	/**
	 * 債権区分. AR type.<p>
	 *
	 */
	public static final String $ar_typ = "ar_typ";
	private static final MCPermColumnInfo _ar_typ = createColumnInfo("ar_typ");
	public final MCStringPermColumn ar_typ = createStringColumn(_ar_typ);
	
	public static final MCMeta rcv_no_META = createCommonMeta($rcv_no, mcframe.commonMA.meta.MA_META.RCV_NO);
	public static final MCMeta slo_no_META = createCommonMeta($slo_no, mcframe.commonMA.meta.MA_META.SLO_NO);
	public static final MCMeta dat_typ_META = createCommonMeta($dat_typ, mcframe.commonMS.meta.MS_META.RCV_DAT_TYP);
	public static final MCMeta rcst_cd_META = createCommonMeta($rcst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta bcst_cd_META = createCommonMeta($bcst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta bill_dpt_cd_META = createCommonMeta($bill_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta acst_cd_META = createCommonMeta($acst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta asppl_cd_META = createCommonMeta($asppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta bsppl_cd_META = createCommonMeta($bsppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta rcv_dpt_cd_META = createCommonMeta($rcv_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta rcv_usr_cd_META = createCommonMeta($rcv_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta rcv_dt_META = createCommonMeta($rcv_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta ac_dt_META = createCommonMeta($ac_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta rcv_mtd_cd_META = createCommonMeta($rcv_mtd_cd, mcframe.commonMA.meta.MA_META.STTL_CD);
	public static final MCMeta rcv_typ_META = createCommonMeta($rcv_typ, mcframe.commonMA.meta.MA_META.AR_STTL_TYP);
	public static final MCMeta bank_ac_cd_META = createCommonMeta($bank_ac_cd, mcframe.commonMA.meta.MA_META.BANK_AC_CD);
	public static final MCMeta xfr_psn_META = createCommonMeta($xfr_psn, mcframe.commonMA.meta.MA_META.XFR_PSN);
	public static final MCMeta note_mng_no_META = createCommonMeta($note_mng_no, mcframe.commonMA.meta.MA_META.NOTE_MNG_NO);
	public static final MCMeta trd_cur_cd_META = createCommonMeta($trd_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta base_cur_cd_META = createCommonMeta($base_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta xrate_cd_META = createCommonMeta($xrate_cd, mcframe.commonMA.meta.MA_META.XRATE_CD);
	public static final MCMeta xrate_META = createCommonMeta($xrate, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta rcv_rmrks_META = createCommonMeta($rcv_rmrks, mcframe.commonMS.meta.MS_META.RCV_RMRKS);
	public static final MCMeta src_rcv_act_no_META = createCommonMeta($src_rcv_act_no, mcframe.commonMA.meta.MA_META.RCV_ACT_NO);
	public static final MCMeta src_rcv_act_seq_META = createCommonMeta($src_rcv_act_seq, mcframe.commonMA.meta.MA_META.SLIP_SEQ);
	public static final MCMeta src_rcv_act_d_no_META = createCommonMeta($src_rcv_act_d_no, mcframe.commonMA.meta.MA_META.RCV_ACT_D_NO);
	public static final MCMeta src_rcv_act_d_seq_META = createCommonMeta($src_rcv_act_d_seq, mcframe.commonMA.meta.MA_META.SLIP_SEQ);
	public static final MCMeta pay_act_no_META = createCommonMeta($pay_act_no, mcframe.commonMA.meta.MA_META.PAY_ACT_NO);
	public static final MCMeta rcv_amt_META = createCommonMeta($rcv_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta rcv_proc_amt_META = createCommonMeta($rcv_proc_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta not_proc_bal_META = createCommonMeta($not_proc_bal, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta com_paid_META = createCommonMeta($com_paid, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta bill_setoff_amt_META = createCommonMeta($bill_setoff_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta auto_appl_basis_dt_META = createCommonMeta($auto_appl_basis_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta rcv_auto_appl_tgt_flg_META = createCommonMeta($rcv_auto_appl_tgt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta auto_appl_sts_typ_META = createCommonMeta($auto_appl_sts_typ, mcframe.commonMS.meta.MS_META.AUTO_APPL_STS_TYP);
	public static final MCMeta fb_flg_META = createCommonMeta($fb_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ext_sys_cd_META = createCommonMeta($ext_sys_cd, mcframe.commonMA.meta.MA_META.EXT_SYS_CD);
	public static final MCMeta ext_rcv_no_META = createCommonMeta($ext_rcv_no, mcframe.commonMA.meta.MA_META.EXT_RCV_NO);
	public static final MCMeta seq_no_META = createCommonMeta($seq_no, mcframe.commonMA.meta.MA_META.INT);
	public static final MCMeta prnt_flg_META = createCommonMeta($prnt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta div_src_rcv_no_META = createCommonMeta($div_src_rcv_no, mcframe.commonMA.meta.MA_META.RCV_NO);
	public static final MCMeta div_flg_META = createCommonMeta($div_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.RCV_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.RCV_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.RCV_SUB_CHAR3);
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
	public static final MCMeta ar_typ_META = createCommonMeta($ar_typ, mcframe.commonMA.meta.MA_META.AR_TYP);

	protected static final List<MCForeignInfo> FOREIGN_INFO_LIST = new ArrayList<>();
	static {
	}
	
	protected static final ConstMetaList<MST_RCV_R> constMetas = new ConstMetaList<MST_RCV_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			rcv_no_META,
			slo_no_META,
			dat_typ_META,
			rcst_cd_META,
			bcst_cd_META,
			bill_dpt_cd_META,
			acst_cd_META,
			asppl_cd_META,
			bsppl_cd_META,
			rcv_dpt_cd_META,
			wg_cd_META,
			rcv_usr_cd_META,
			rcv_dt_META,
			ac_dt_META,
			rcv_mtd_cd_META,
			rcv_typ_META,
			bank_ac_cd_META,
			xfr_psn_META,
			note_mng_no_META,
			trd_cur_cd_META,
			base_cur_cd_META,
			xrate_cd_META,
			xrate_META,
			rcv_rmrks_META,
			src_rcv_act_no_META,
			src_rcv_act_seq_META,
			src_rcv_act_d_no_META,
			src_rcv_act_d_seq_META,
			pay_act_no_META,
			rcv_amt_META,
			rcv_proc_amt_META,
			not_proc_bal_META,
			com_paid_META,
			bill_setoff_amt_META,
			auto_appl_basis_dt_META,
			rcv_auto_appl_tgt_flg_META,
			auto_appl_sts_typ_META,
			fb_flg_META,
			ext_sys_cd_META,
			ext_rcv_no_META,
			seq_no_META,
			prnt_flg_META,
			div_src_rcv_no_META,
			div_flg_META,
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
			upd_srv_req_no_META,
			ar_typ_META
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
	protected MST_RCV_R(ConstMetaList<? extends MST_RCV_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MST_RCV_R(ConstMetaList<? extends MST_RCV_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MST_RCV_R.$rcv_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_R.$rcv_no,
				"rcv_no",
				rcv_no,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_R.$slo_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_R.$slo_no,
				"slo_no",
				slo_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_R.$dat_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_R.$dat_typ,
				"dat_typ",
				dat_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_R.$rcst_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_R.$rcst_cd,
				"rcst_cd",
				rcst_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_R.$bcst_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_R.$bcst_cd,
				"bcst_cd",
				bcst_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_R.$bill_dpt_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_R.$bill_dpt_cd,
				"bill_dpt_cd",
				bill_dpt_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_R.$acst_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_R.$acst_cd,
				"acst_cd",
				acst_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_R.$asppl_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_R.$asppl_cd,
				"asppl_cd",
				asppl_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_R.$bsppl_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_R.$bsppl_cd,
				"bsppl_cd",
				bsppl_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_R.$rcv_dpt_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_R.$rcv_dpt_cd,
				"rcv_dpt_cd",
				rcv_dpt_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_R.$wg_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_R.$wg_cd,
				"wg_cd",
				wg_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_R.$rcv_usr_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_R.$rcv_usr_cd,
				"rcv_usr_cd",
				rcv_usr_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_R.$rcv_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_RCV_R.$rcv_dt,
				"rcv_dt",
				rcv_dt,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_R.$ac_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_RCV_R.$ac_dt,
				"ac_dt",
				ac_dt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_R.$rcv_mtd_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_R.$rcv_mtd_cd,
				"rcv_mtd_cd",
				rcv_mtd_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_R.$rcv_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_R.$rcv_typ,
				"rcv_typ",
				rcv_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_R.$bank_ac_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_R.$bank_ac_cd,
				"bank_ac_cd",
				bank_ac_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_R.$xfr_psn,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_R.$xfr_psn,
				"xfr_psn",
				xfr_psn,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_R.$note_mng_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_R.$note_mng_no,
				"note_mng_no",
				note_mng_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_R.$trd_cur_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_R.$trd_cur_cd,
				"trd_cur_cd",
				trd_cur_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_R.$base_cur_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_R.$base_cur_cd,
				"base_cur_cd",
				base_cur_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_R.$xrate_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_R.$xrate_cd,
				"xrate_cd",
				xrate_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_R.$xrate,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_RCV_R.$xrate,
				"xrate",
				xrate,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_R.$rcv_rmrks,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_R.$rcv_rmrks,
				"rcv_rmrks",
				rcv_rmrks,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_R.$src_rcv_act_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_R.$src_rcv_act_no,
				"src_rcv_act_no",
				src_rcv_act_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_R.$src_rcv_act_seq,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_RCV_R.$src_rcv_act_seq,
				"src_rcv_act_seq",
				src_rcv_act_seq,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_R.$src_rcv_act_d_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_R.$src_rcv_act_d_no,
				"src_rcv_act_d_no",
				src_rcv_act_d_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_R.$src_rcv_act_d_seq,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_RCV_R.$src_rcv_act_d_seq,
				"src_rcv_act_d_seq",
				src_rcv_act_d_seq,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_R.$pay_act_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_R.$pay_act_no,
				"pay_act_no",
				pay_act_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_R.$rcv_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_RCV_R.$rcv_amt,
				"rcv_amt",
				rcv_amt,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_R.$rcv_proc_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_RCV_R.$rcv_proc_amt,
				"rcv_proc_amt",
				rcv_proc_amt,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_R.$not_proc_bal,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_RCV_R.$not_proc_bal,
				"not_proc_bal",
				not_proc_bal,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_R.$com_paid,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_RCV_R.$com_paid,
				"com_paid",
				com_paid,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_R.$bill_setoff_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_RCV_R.$bill_setoff_amt,
				"bill_setoff_amt",
				bill_setoff_amt,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_R.$auto_appl_basis_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_RCV_R.$auto_appl_basis_dt,
				"auto_appl_basis_dt",
				auto_appl_basis_dt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_R.$rcv_auto_appl_tgt_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_RCV_R.$rcv_auto_appl_tgt_flg,
				"rcv_auto_appl_tgt_flg",
				rcv_auto_appl_tgt_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_R.$auto_appl_sts_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_R.$auto_appl_sts_typ,
				"auto_appl_sts_typ",
				auto_appl_sts_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_R.$fb_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_RCV_R.$fb_flg,
				"fb_flg",
				fb_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_R.$ext_sys_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_R.$ext_sys_cd,
				"ext_sys_cd",
				ext_sys_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_R.$ext_rcv_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_R.$ext_rcv_no,
				"ext_rcv_no",
				ext_rcv_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_R.$seq_no,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_RCV_R.$seq_no,
				"seq_no",
				seq_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_R.$prnt_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_RCV_R.$prnt_flg,
				"prnt_flg",
				prnt_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_R.$div_src_rcv_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_R.$div_src_rcv_no,
				"div_src_rcv_no",
				div_src_rcv_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_R.$div_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_RCV_R.$div_flg,
				"div_flg",
				div_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_R.$sub_char1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_R.$sub_char1,
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
			MST_RCV_R.$sub_char2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_R.$sub_char2,
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
			MST_RCV_R.$sub_char3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_R.$sub_char3,
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
			MST_RCV_R.$ins_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_R.$ins_usr_id,
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
			MST_RCV_R.$ins_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_R.$ins_usr_nm,
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
			MST_RCV_R.$ins_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MST_RCV_R.$ins_ts,
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
			MST_RCV_R.$ins_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_R.$ins_func_id,
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
			MST_RCV_R.$upd_cntr,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_RCV_R.$upd_cntr,
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
			MST_RCV_R.$upd_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_R.$upd_usr_id,
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
			MST_RCV_R.$upd_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_R.$upd_usr_nm,
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
			MST_RCV_R.$upd_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MST_RCV_R.$upd_ts,
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
			MST_RCV_R.$upd_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_R.$upd_func_id,
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
			MST_RCV_R.$upd_srv_req_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_R.$upd_srv_req_no,
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
			MST_RCV_R.$ar_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_R.$ar_typ,
				"ar_typ",
				ar_typ,
				false,
				true,
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
	public static MST_RCV_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MST_RCV_R create(String alias) {
		MST_RCV_R row = new MST_RCV_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MST_RCV_R createByName(T proto) {
		MST_RCV_R row = MST_RCV_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MST_RCV_R clone() {
		return (MST_RCV_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MST_RCV_R createInstance() {
		return (MST_RCV_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MST_RCV_R getValues(String... names) {
		return (MST_RCV_R) super.getValues(names);
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
	 public MSW_RCV_KEY_R getPkWorkDbc(String alias) {
	 	return MSW_RCV_KEY_R.create(alias);
	 }

	/*
	 * MCDBContainerのオーバーライドメソッドです。
	 */
	 public MSW_RCV_KEY_R getPkWorkDbc() {
	 	return getPkWorkDbc(MSW_RCV_KEY_R.TABLE_NAME);
	 }

	/**
	 * 入金ＮＯ. Payment received No..<p>
	 *
	 */
	public String rcv_no() {
		return getConstString(offset + 0, $rcv_no);
	}

	/**
	 * 入金ＮＯ. Payment received No..<p>
	 *
	 */
	public void rcv_no(String value) {
		setConstString(offset + 0, $rcv_no, value);
	}

	/**
	 * 受注ＮＯ. Sales order No..<p>
	 *
	 */
	public String slo_no() {
		return getConstString(offset + 1, $slo_no);
	}

	/**
	 * 受注ＮＯ. Sales order No..<p>
	 *
	 */
	public void slo_no(String value) {
		setConstString(offset + 1, $slo_no, value);
	}

	/**
	 * データ区分. Data type.<p>
	 *
	 */
	public String dat_typ() {
		return getConstString(offset + 2, $dat_typ);
	}

	/**
	 * データ区分. Data type.<p>
	 *
	 */
	public void dat_typ(String value) {
		setConstString(offset + 2, $dat_typ, value);
	}

	/**
	 * 入金先ＣＤ. Payer cd..<p>
	 *
	 */
	public String rcst_cd() {
		return getConstString(offset + 3, $rcst_cd);
	}

	/**
	 * 入金先ＣＤ. Payer cd..<p>
	 *
	 */
	public void rcst_cd(String value) {
		setConstString(offset + 3, $rcst_cd, value);
	}

	/**
	 * 請求先ＣＤ. Billing customer cd..<p>
	 *
	 */
	public String bcst_cd() {
		return getConstString(offset + 4, $bcst_cd);
	}

	/**
	 * 請求先ＣＤ. Billing customer cd..<p>
	 *
	 */
	public void bcst_cd(String value) {
		setConstString(offset + 4, $bcst_cd, value);
	}

	/**
	 * 請求部門ＣＤ. Billing dept. cd..<p>
	 *
	 */
	public String bill_dpt_cd() {
		return getConstString(offset + 5, $bill_dpt_cd);
	}

	/**
	 * 請求部門ＣＤ. Billing dept. cd..<p>
	 *
	 */
	public void bill_dpt_cd(String value) {
		setConstString(offset + 5, $bill_dpt_cd, value);
	}

	/**
	 * 売掛先ＣＤ. AR customer cd..<p>
	 *
	 */
	public String acst_cd() {
		return getConstString(offset + 6, $acst_cd);
	}

	/**
	 * 売掛先ＣＤ. AR customer cd..<p>
	 *
	 */
	public void acst_cd(String value) {
		setConstString(offset + 6, $acst_cd, value);
	}

	/**
	 * 買掛先ＣＤ. AP supplier cd..<p>
	 *
	 */
	public String asppl_cd() {
		return getConstString(offset + 7, $asppl_cd);
	}

	/**
	 * 買掛先ＣＤ. AP supplier cd..<p>
	 *
	 */
	public void asppl_cd(String value) {
		setConstString(offset + 7, $asppl_cd, value);
	}

	/**
	 * 支払予定管理先ＣＤ. Scheduled payee cd..<p>
	 *
	 */
	public String bsppl_cd() {
		return getConstString(offset + 8, $bsppl_cd);
	}

	/**
	 * 支払予定管理先ＣＤ. Scheduled payee cd..<p>
	 *
	 */
	public void bsppl_cd(String value) {
		setConstString(offset + 8, $bsppl_cd, value);
	}

	/**
	 * 入金部門ＣＤ. Payment receiving dept. cd..<p>
	 *
	 */
	public String rcv_dpt_cd() {
		return getConstString(offset + 9, $rcv_dpt_cd);
	}

	/**
	 * 入金部門ＣＤ. Payment receiving dept. cd..<p>
	 *
	 */
	public void rcv_dpt_cd(String value) {
		setConstString(offset + 9, $rcv_dpt_cd, value);
	}

	/**
	 * ワーキンググループＣＤ. WG cd..<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 10, $wg_cd);
	}

	/**
	 * ワーキンググループＣＤ. WG cd..<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 10, $wg_cd, value);
	}

	/**
	 * 入金担当者ＣＤ. Payment received PIC cd..<p>
	 *
	 */
	public String rcv_usr_cd() {
		return getConstString(offset + 11, $rcv_usr_cd);
	}

	/**
	 * 入金担当者ＣＤ. Payment received PIC cd..<p>
	 *
	 */
	public void rcv_usr_cd(String value) {
		setConstString(offset + 11, $rcv_usr_cd, value);
	}

	/**
	 * 入金日. Payment received date.<p>
	 *
	 */
	public MCDate rcv_dt() {
		return getConstDate(offset + 12, $rcv_dt);
	}

	/**
	 * 入金日. Payment received date.<p>
	 *
	 */
	public void rcv_dt(MCDate value) {
		setConstDate(offset + 12, $rcv_dt, value);
	}

	/**
	 * 計上日. Recording date.<p>
	 *
	 */
	public MCDate ac_dt() {
		return getConstDate(offset + 13, $ac_dt);
	}

	/**
	 * 計上日. Recording date.<p>
	 *
	 */
	public void ac_dt(MCDate value) {
		setConstDate(offset + 13, $ac_dt, value);
	}

	/**
	 * 入金方法ＣＤ. Payment received method cd..<p>
	 *
	 */
	public String rcv_mtd_cd() {
		return getConstString(offset + 14, $rcv_mtd_cd);
	}

	/**
	 * 入金方法ＣＤ. Payment received method cd..<p>
	 *
	 */
	public void rcv_mtd_cd(String value) {
		setConstString(offset + 14, $rcv_mtd_cd, value);
	}

	/**
	 * 入金区分. Payment received type.<p>
	 *
	 */
	public String rcv_typ() {
		return getConstString(offset + 15, $rcv_typ);
	}

	/**
	 * 入金区分. Payment received type.<p>
	 *
	 */
	public void rcv_typ(String value) {
		setConstString(offset + 15, $rcv_typ, value);
	}

	/**
	 * 口座ＣＤ. Bank account cd..<p>
	 *
	 */
	public String bank_ac_cd() {
		return getConstString(offset + 16, $bank_ac_cd);
	}

	/**
	 * 口座ＣＤ. Bank account cd..<p>
	 *
	 */
	public void bank_ac_cd(String value) {
		setConstString(offset + 16, $bank_ac_cd, value);
	}

	/**
	 * 振込人名. Payment person name.<p>
	 *
	 */
	public String xfr_psn() {
		return getConstString(offset + 17, $xfr_psn);
	}

	/**
	 * 振込人名. Payment person name.<p>
	 *
	 */
	public void xfr_psn(String value) {
		setConstString(offset + 17, $xfr_psn, value);
	}

	/**
	 * 手形管理ＮＯ. Note management No..<p>
	 *
	 */
	public String note_mng_no() {
		return getConstString(offset + 18, $note_mng_no);
	}

	/**
	 * 手形管理ＮＯ. Note management No..<p>
	 *
	 */
	public void note_mng_no(String value) {
		setConstString(offset + 18, $note_mng_no, value);
	}

	/**
	 * 取引通貨ＣＤ. Transaction currency cd..<p>
	 *
	 */
	public String trd_cur_cd() {
		return getConstString(offset + 19, $trd_cur_cd);
	}

	/**
	 * 取引通貨ＣＤ. Transaction currency cd..<p>
	 *
	 */
	public void trd_cur_cd(String value) {
		setConstString(offset + 19, $trd_cur_cd, value);
	}

	/**
	 * 基準通貨ＣＤ. Base currency cd..<p>
	 *
	 */
	public String base_cur_cd() {
		return getConstString(offset + 20, $base_cur_cd);
	}

	/**
	 * 基準通貨ＣＤ. Base currency cd..<p>
	 *
	 */
	public void base_cur_cd(String value) {
		setConstString(offset + 20, $base_cur_cd, value);
	}

	/**
	 * 為替レートＣＤ. Exchange rate cd..<p>
	 *
	 */
	public String xrate_cd() {
		return getConstString(offset + 21, $xrate_cd);
	}

	/**
	 * 為替レートＣＤ. Exchange rate cd..<p>
	 *
	 */
	public void xrate_cd(String value) {
		setConstString(offset + 21, $xrate_cd, value);
	}

	/**
	 * 為替レート. Exchange rate.<p>
	 *
	 */
	public MCNumber xrate() {
		return getConstNumber(offset + 22, $xrate);
	}

	/**
	 * 為替レート. Exchange rate.<p>
	 *
	 */
	public void xrate(MCNumber value) {
		setConstNumber(offset + 22, $xrate, value);
	}
	
	/**
	 * 為替レート. Exchange rate.<p>
	 *
	 */
	public void xrate(int value) {
		setConstNumber(offset + 22, $xrate, value);
	}
	
	/**
	 * 為替レート. Exchange rate.<p>
	 *
	 */
	public void xrate(long value) {
		setConstNumber(offset + 22, $xrate, value);
	}
	
	/**
	 * 為替レート. Exchange rate.<p>
	 *
	 */
	public void xrate(float value) {
		setConstNumber(offset + 22, $xrate, value);
	}
	
	/**
	 * 為替レート. Exchange rate.<p>
	 *
	 */
	public void xrate(double value) {
		setConstNumber(offset + 22, $xrate, value);
	}
	
	/**
	 * 入金備考. Payment received remarks.<p>
	 *
	 */
	public String rcv_rmrks() {
		return getConstString(offset + 23, $rcv_rmrks);
	}

	/**
	 * 入金備考. Payment received remarks.<p>
	 *
	 */
	public void rcv_rmrks(String value) {
		setConstString(offset + 23, $rcv_rmrks, value);
	}

	/**
	 * 発生元入金実績ＮＯ. Source incoming payment result received No..<p>
	 *
	 */
	public String src_rcv_act_no() {
		return getConstString(offset + 24, $src_rcv_act_no);
	}

	/**
	 * 発生元入金実績ＮＯ. Source incoming payment result received No..<p>
	 *
	 */
	public void src_rcv_act_no(String value) {
		setConstString(offset + 24, $src_rcv_act_no, value);
	}

	/**
	 * 発生元入金実績連番. Source incoming payment result sequence number.<p>
	 *
	 */
	public MCNumber src_rcv_act_seq() {
		return getConstNumber(offset + 25, $src_rcv_act_seq);
	}

	/**
	 * 発生元入金実績連番. Source incoming payment result sequence number.<p>
	 *
	 */
	public void src_rcv_act_seq(MCNumber value) {
		setConstNumber(offset + 25, $src_rcv_act_seq, value);
	}
	
	/**
	 * 発生元入金実績連番. Source incoming payment result sequence number.<p>
	 *
	 */
	public void src_rcv_act_seq(int value) {
		setConstNumber(offset + 25, $src_rcv_act_seq, value);
	}
	
	/**
	 * 発生元入金実績連番. Source incoming payment result sequence number.<p>
	 *
	 */
	public void src_rcv_act_seq(long value) {
		setConstNumber(offset + 25, $src_rcv_act_seq, value);
	}
	
	/**
	 * 発生元入金実績連番. Source incoming payment result sequence number.<p>
	 *
	 */
	public void src_rcv_act_seq(float value) {
		setConstNumber(offset + 25, $src_rcv_act_seq, value);
	}
	
	/**
	 * 発生元入金実績連番. Source incoming payment result sequence number.<p>
	 *
	 */
	public void src_rcv_act_seq(double value) {
		setConstNumber(offset + 25, $src_rcv_act_seq, value);
	}
	
	/**
	 * 発生元入金実績明細ＮＯ. Source incoming payment result details No..<p>
	 *
	 */
	public String src_rcv_act_d_no() {
		return getConstString(offset + 26, $src_rcv_act_d_no);
	}

	/**
	 * 発生元入金実績明細ＮＯ. Source incoming payment result details No..<p>
	 *
	 */
	public void src_rcv_act_d_no(String value) {
		setConstString(offset + 26, $src_rcv_act_d_no, value);
	}

	/**
	 * 発生元入金実績明細連番. Source incoming payment result details sequence number.<p>
	 *
	 */
	public MCNumber src_rcv_act_d_seq() {
		return getConstNumber(offset + 27, $src_rcv_act_d_seq);
	}

	/**
	 * 発生元入金実績明細連番. Source incoming payment result details sequence number.<p>
	 *
	 */
	public void src_rcv_act_d_seq(MCNumber value) {
		setConstNumber(offset + 27, $src_rcv_act_d_seq, value);
	}
	
	/**
	 * 発生元入金実績明細連番. Source incoming payment result details sequence number.<p>
	 *
	 */
	public void src_rcv_act_d_seq(int value) {
		setConstNumber(offset + 27, $src_rcv_act_d_seq, value);
	}
	
	/**
	 * 発生元入金実績明細連番. Source incoming payment result details sequence number.<p>
	 *
	 */
	public void src_rcv_act_d_seq(long value) {
		setConstNumber(offset + 27, $src_rcv_act_d_seq, value);
	}
	
	/**
	 * 発生元入金実績明細連番. Source incoming payment result details sequence number.<p>
	 *
	 */
	public void src_rcv_act_d_seq(float value) {
		setConstNumber(offset + 27, $src_rcv_act_d_seq, value);
	}
	
	/**
	 * 発生元入金実績明細連番. Source incoming payment result details sequence number.<p>
	 *
	 */
	public void src_rcv_act_d_seq(double value) {
		setConstNumber(offset + 27, $src_rcv_act_d_seq, value);
	}
	
	/**
	 * 支払実績ＮＯ. Payment result No..<p>
	 *
	 */
	public String pay_act_no() {
		return getConstString(offset + 28, $pay_act_no);
	}

	/**
	 * 支払実績ＮＯ. Payment result No..<p>
	 *
	 */
	public void pay_act_no(String value) {
		setConstString(offset + 28, $pay_act_no, value);
	}

	/**
	 * 入金額. Payment received amount.<p>
	 *
	 */
	public MCNumber rcv_amt() {
		return getConstNumber(offset + 29, $rcv_amt);
	}

	/**
	 * 入金額. Payment received amount.<p>
	 *
	 */
	public void rcv_amt(MCNumber value) {
		setConstNumber(offset + 29, $rcv_amt, value);
	}
	
	/**
	 * 入金額. Payment received amount.<p>
	 *
	 */
	public void rcv_amt(int value) {
		setConstNumber(offset + 29, $rcv_amt, value);
	}
	
	/**
	 * 入金額. Payment received amount.<p>
	 *
	 */
	public void rcv_amt(long value) {
		setConstNumber(offset + 29, $rcv_amt, value);
	}
	
	/**
	 * 入金額. Payment received amount.<p>
	 *
	 */
	public void rcv_amt(float value) {
		setConstNumber(offset + 29, $rcv_amt, value);
	}
	
	/**
	 * 入金額. Payment received amount.<p>
	 *
	 */
	public void rcv_amt(double value) {
		setConstNumber(offset + 29, $rcv_amt, value);
	}
	
	/**
	 * 入金処理額. Processed payment received amount.<p>
	 *
	 */
	public MCNumber rcv_proc_amt() {
		return getConstNumber(offset + 30, $rcv_proc_amt);
	}

	/**
	 * 入金処理額. Processed payment received amount.<p>
	 *
	 */
	public void rcv_proc_amt(MCNumber value) {
		setConstNumber(offset + 30, $rcv_proc_amt, value);
	}
	
	/**
	 * 入金処理額. Processed payment received amount.<p>
	 *
	 */
	public void rcv_proc_amt(int value) {
		setConstNumber(offset + 30, $rcv_proc_amt, value);
	}
	
	/**
	 * 入金処理額. Processed payment received amount.<p>
	 *
	 */
	public void rcv_proc_amt(long value) {
		setConstNumber(offset + 30, $rcv_proc_amt, value);
	}
	
	/**
	 * 入金処理額. Processed payment received amount.<p>
	 *
	 */
	public void rcv_proc_amt(float value) {
		setConstNumber(offset + 30, $rcv_proc_amt, value);
	}
	
	/**
	 * 入金処理額. Processed payment received amount.<p>
	 *
	 */
	public void rcv_proc_amt(double value) {
		setConstNumber(offset + 30, $rcv_proc_amt, value);
	}
	
	/**
	 * 未処理残高. Unreconciled balance.<p>
	 *
	 */
	public MCNumber not_proc_bal() {
		return getConstNumber(offset + 31, $not_proc_bal);
	}

	/**
	 * 未処理残高. Unreconciled balance.<p>
	 *
	 */
	public void not_proc_bal(MCNumber value) {
		setConstNumber(offset + 31, $not_proc_bal, value);
	}
	
	/**
	 * 未処理残高. Unreconciled balance.<p>
	 *
	 */
	public void not_proc_bal(int value) {
		setConstNumber(offset + 31, $not_proc_bal, value);
	}
	
	/**
	 * 未処理残高. Unreconciled balance.<p>
	 *
	 */
	public void not_proc_bal(long value) {
		setConstNumber(offset + 31, $not_proc_bal, value);
	}
	
	/**
	 * 未処理残高. Unreconciled balance.<p>
	 *
	 */
	public void not_proc_bal(float value) {
		setConstNumber(offset + 31, $not_proc_bal, value);
	}
	
	/**
	 * 未処理残高. Unreconciled balance.<p>
	 *
	 */
	public void not_proc_bal(double value) {
		setConstNumber(offset + 31, $not_proc_bal, value);
	}
	
	/**
	 * 振込手数料. Transfer fee.<p>
	 *
	 */
	public MCNumber com_paid() {
		return getConstNumber(offset + 32, $com_paid);
	}

	/**
	 * 振込手数料. Transfer fee.<p>
	 *
	 */
	public void com_paid(MCNumber value) {
		setConstNumber(offset + 32, $com_paid, value);
	}
	
	/**
	 * 振込手数料. Transfer fee.<p>
	 *
	 */
	public void com_paid(int value) {
		setConstNumber(offset + 32, $com_paid, value);
	}
	
	/**
	 * 振込手数料. Transfer fee.<p>
	 *
	 */
	public void com_paid(long value) {
		setConstNumber(offset + 32, $com_paid, value);
	}
	
	/**
	 * 振込手数料. Transfer fee.<p>
	 *
	 */
	public void com_paid(float value) {
		setConstNumber(offset + 32, $com_paid, value);
	}
	
	/**
	 * 振込手数料. Transfer fee.<p>
	 *
	 */
	public void com_paid(double value) {
		setConstNumber(offset + 32, $com_paid, value);
	}
	
	/**
	 * 請求済相殺額. Billing offset amount.<p>
	 *
	 */
	public MCNumber bill_setoff_amt() {
		return getConstNumber(offset + 33, $bill_setoff_amt);
	}

	/**
	 * 請求済相殺額. Billing offset amount.<p>
	 *
	 */
	public void bill_setoff_amt(MCNumber value) {
		setConstNumber(offset + 33, $bill_setoff_amt, value);
	}
	
	/**
	 * 請求済相殺額. Billing offset amount.<p>
	 *
	 */
	public void bill_setoff_amt(int value) {
		setConstNumber(offset + 33, $bill_setoff_amt, value);
	}
	
	/**
	 * 請求済相殺額. Billing offset amount.<p>
	 *
	 */
	public void bill_setoff_amt(long value) {
		setConstNumber(offset + 33, $bill_setoff_amt, value);
	}
	
	/**
	 * 請求済相殺額. Billing offset amount.<p>
	 *
	 */
	public void bill_setoff_amt(float value) {
		setConstNumber(offset + 33, $bill_setoff_amt, value);
	}
	
	/**
	 * 請求済相殺額. Billing offset amount.<p>
	 *
	 */
	public void bill_setoff_amt(double value) {
		setConstNumber(offset + 33, $bill_setoff_amt, value);
	}
	
	/**
	 * 自動消込基準日. Auto-reconciliation base date.<p>
	 *
	 */
	public MCDate auto_appl_basis_dt() {
		return getConstDate(offset + 34, $auto_appl_basis_dt);
	}

	/**
	 * 自動消込基準日. Auto-reconciliation base date.<p>
	 *
	 */
	public void auto_appl_basis_dt(MCDate value) {
		setConstDate(offset + 34, $auto_appl_basis_dt, value);
	}

	/**
	 * 入金自動消込対象ＦＬＧ. For auto-reconciliation flg..<p>
	 *
	 */
	public boolean rcv_auto_appl_tgt_flg() {
		return getConstBoolean(offset + 35, $rcv_auto_appl_tgt_flg);
	}

	/**
	 * 入金自動消込対象ＦＬＧ. For auto-reconciliation flg..<p>
	 *
	 */
	public void rcv_auto_appl_tgt_flg(boolean value) {
		setConstBoolean(offset + 35, $rcv_auto_appl_tgt_flg, value);
	}

	/**
	 * 自動消込状況区分. Auto-reconciliation status type.<p>
	 *
	 */
	public String auto_appl_sts_typ() {
		return getConstString(offset + 36, $auto_appl_sts_typ);
	}

	/**
	 * 自動消込状況区分. Auto-reconciliation status type.<p>
	 *
	 */
	public void auto_appl_sts_typ(String value) {
		setConstString(offset + 36, $auto_appl_sts_typ, value);
	}

	/**
	 * ＦＢＦＬＧ. FB flg..<p>
	 *
	 */
	public boolean fb_flg() {
		return getConstBoolean(offset + 37, $fb_flg);
	}

	/**
	 * ＦＢＦＬＧ. FB flg..<p>
	 *
	 */
	public void fb_flg(boolean value) {
		setConstBoolean(offset + 37, $fb_flg, value);
	}

	/**
	 * 外部システムＣＤ. External system cd..<p>
	 *
	 */
	public String ext_sys_cd() {
		return getConstString(offset + 38, $ext_sys_cd);
	}

	/**
	 * 外部システムＣＤ. External system cd..<p>
	 *
	 */
	public void ext_sys_cd(String value) {
		setConstString(offset + 38, $ext_sys_cd, value);
	}

	/**
	 * 外部入金ＮＯ. External payment received No..<p>
	 *
	 */
	public String ext_rcv_no() {
		return getConstString(offset + 39, $ext_rcv_no);
	}

	/**
	 * 外部入金ＮＯ. External payment received No..<p>
	 *
	 */
	public void ext_rcv_no(String value) {
		setConstString(offset + 39, $ext_rcv_no, value);
	}

	/**
	 * 枝番. Branch number.<p>
	 *
	 */
	public MCNumber seq_no() {
		return getConstNumber(offset + 40, $seq_no);
	}

	/**
	 * 枝番. Branch number.<p>
	 *
	 */
	public void seq_no(MCNumber value) {
		setConstNumber(offset + 40, $seq_no, value);
	}
	
	/**
	 * 枝番. Branch number.<p>
	 *
	 */
	public void seq_no(int value) {
		setConstNumber(offset + 40, $seq_no, value);
	}
	
	/**
	 * 枝番. Branch number.<p>
	 *
	 */
	public void seq_no(long value) {
		setConstNumber(offset + 40, $seq_no, value);
	}
	
	/**
	 * 枝番. Branch number.<p>
	 *
	 */
	public void seq_no(float value) {
		setConstNumber(offset + 40, $seq_no, value);
	}
	
	/**
	 * 枝番. Branch number.<p>
	 *
	 */
	public void seq_no(double value) {
		setConstNumber(offset + 40, $seq_no, value);
	}
	
	/**
	 * 発行済ＦＬＧ. Issued flg..<p>
	 *
	 */
	public boolean prnt_flg() {
		return getConstBoolean(offset + 41, $prnt_flg);
	}

	/**
	 * 発行済ＦＬＧ. Issued flg..<p>
	 *
	 */
	public void prnt_flg(boolean value) {
		setConstBoolean(offset + 41, $prnt_flg, value);
	}

	/**
	 * 分割元入金ＮＯ. Payment received split source No..<p>
	 *
	 */
	public String div_src_rcv_no() {
		return getConstString(offset + 42, $div_src_rcv_no);
	}

	/**
	 * 分割元入金ＮＯ. Payment received split source No..<p>
	 *
	 */
	public void div_src_rcv_no(String value) {
		setConstString(offset + 42, $div_src_rcv_no, value);
	}

	/**
	 * 分割済ＦＬＧ. Split flg..<p>
	 *
	 */
	public boolean div_flg() {
		return getConstBoolean(offset + 43, $div_flg);
	}

	/**
	 * 分割済ＦＬＧ. Split flg..<p>
	 *
	 */
	public void div_flg(boolean value) {
		setConstBoolean(offset + 43, $div_flg, value);
	}

	/**
	 * 予備１. Spare 1.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 44, $sub_char1);
	}

	/**
	 * 予備１. Spare 1.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 44, $sub_char1, value);
	}

	/**
	 * 予備２. Spare 2.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 45, $sub_char2);
	}

	/**
	 * 予備２. Spare 2.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 45, $sub_char2, value);
	}

	/**
	 * 予備３. Spare 3.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 46, $sub_char3);
	}

	/**
	 * 予備３. Spare 3.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 46, $sub_char3, value);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 47, $ins_usr_id);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 47, $ins_usr_id, value);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 48, $ins_usr_nm);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 48, $ins_usr_nm, value);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 49, $ins_ts);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 49, $ins_ts, value);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 50, $ins_func_id);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 50, $ins_func_id, value);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 51, $upd_cntr);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 51, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 51, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 51, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 51, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 51, $upd_cntr, value);
	}
	
	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 52, $upd_usr_id);
	}

	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 52, $upd_usr_id, value);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 53, $upd_usr_nm);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 53, $upd_usr_nm, value);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 54, $upd_ts);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 54, $upd_ts, value);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 55, $upd_func_id);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 55, $upd_func_id, value);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 56, $upd_srv_req_no);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 56, $upd_srv_req_no, value);
	}

	/**
	 * 債権区分. AR type.<p>
	 *
	 */
	public String ar_typ() {
		return getConstString(offset + 57, $ar_typ);
	}

	/**
	 * 債権区分. AR type.<p>
	 *
	 */
	public void ar_typ(String value) {
		setConstString(offset + 57, $ar_typ, value);
	}

	public String getString(String name) {
		if ($rcv_no.equalsIgnoreCase(name)) {
			return rcv_no();
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			return slo_no();
		}
		if ($dat_typ.equalsIgnoreCase(name)) {
			return dat_typ();
		}
		if ($rcst_cd.equalsIgnoreCase(name)) {
			return rcst_cd();
		}
		if ($bcst_cd.equalsIgnoreCase(name)) {
			return bcst_cd();
		}
		if ($bill_dpt_cd.equalsIgnoreCase(name)) {
			return bill_dpt_cd();
		}
		if ($acst_cd.equalsIgnoreCase(name)) {
			return acst_cd();
		}
		if ($asppl_cd.equalsIgnoreCase(name)) {
			return asppl_cd();
		}
		if ($bsppl_cd.equalsIgnoreCase(name)) {
			return bsppl_cd();
		}
		if ($rcv_dpt_cd.equalsIgnoreCase(name)) {
			return rcv_dpt_cd();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($rcv_usr_cd.equalsIgnoreCase(name)) {
			return rcv_usr_cd();
		}
		if ($rcv_mtd_cd.equalsIgnoreCase(name)) {
			return rcv_mtd_cd();
		}
		if ($rcv_typ.equalsIgnoreCase(name)) {
			return rcv_typ();
		}
		if ($bank_ac_cd.equalsIgnoreCase(name)) {
			return bank_ac_cd();
		}
		if ($xfr_psn.equalsIgnoreCase(name)) {
			return xfr_psn();
		}
		if ($note_mng_no.equalsIgnoreCase(name)) {
			return note_mng_no();
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($base_cur_cd.equalsIgnoreCase(name)) {
			return base_cur_cd();
		}
		if ($xrate_cd.equalsIgnoreCase(name)) {
			return xrate_cd();
		}
		if ($rcv_rmrks.equalsIgnoreCase(name)) {
			return rcv_rmrks();
		}
		if ($src_rcv_act_no.equalsIgnoreCase(name)) {
			return src_rcv_act_no();
		}
		if ($src_rcv_act_d_no.equalsIgnoreCase(name)) {
			return src_rcv_act_d_no();
		}
		if ($pay_act_no.equalsIgnoreCase(name)) {
			return pay_act_no();
		}
		if ($auto_appl_sts_typ.equalsIgnoreCase(name)) {
			return auto_appl_sts_typ();
		}
		if ($ext_sys_cd.equalsIgnoreCase(name)) {
			return ext_sys_cd();
		}
		if ($ext_rcv_no.equalsIgnoreCase(name)) {
			return ext_rcv_no();
		}
		if ($div_src_rcv_no.equalsIgnoreCase(name)) {
			return div_src_rcv_no();
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
		if ($ar_typ.equalsIgnoreCase(name)) {
			return ar_typ();
		}
		return super.getString(name);
	}

	public MCNumber getNumber(String name) {
		if ($xrate.equalsIgnoreCase(name)) {
			return xrate();
		}
		if ($src_rcv_act_seq.equalsIgnoreCase(name)) {
			return src_rcv_act_seq();
		}
		if ($src_rcv_act_d_seq.equalsIgnoreCase(name)) {
			return src_rcv_act_d_seq();
		}
		if ($rcv_amt.equalsIgnoreCase(name)) {
			return rcv_amt();
		}
		if ($rcv_proc_amt.equalsIgnoreCase(name)) {
			return rcv_proc_amt();
		}
		if ($not_proc_bal.equalsIgnoreCase(name)) {
			return not_proc_bal();
		}
		if ($com_paid.equalsIgnoreCase(name)) {
			return com_paid();
		}
		if ($bill_setoff_amt.equalsIgnoreCase(name)) {
			return bill_setoff_amt();
		}
		if ($seq_no.equalsIgnoreCase(name)) {
			return seq_no();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumber(name);
	}

	public MCDate getDate(String name) {
		if ($rcv_dt.equalsIgnoreCase(name)) {
			return rcv_dt();
		}
		if ($ac_dt.equalsIgnoreCase(name)) {
			return ac_dt();
		}
		if ($auto_appl_basis_dt.equalsIgnoreCase(name)) {
			return auto_appl_basis_dt();
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
		if ($rcv_auto_appl_tgt_flg.equalsIgnoreCase(name)) {
			return rcv_auto_appl_tgt_flg();
		}
		if ($fb_flg.equalsIgnoreCase(name)) {
			return fb_flg();
		}
		if ($prnt_flg.equalsIgnoreCase(name)) {
			return prnt_flg();
		}
		if ($div_flg.equalsIgnoreCase(name)) {
			return div_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($rcv_no.equalsIgnoreCase(name)) {
			return rcv_no();
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			return slo_no();
		}
		if ($dat_typ.equalsIgnoreCase(name)) {
			return dat_typ();
		}
		if ($rcst_cd.equalsIgnoreCase(name)) {
			return rcst_cd();
		}
		if ($bcst_cd.equalsIgnoreCase(name)) {
			return bcst_cd();
		}
		if ($bill_dpt_cd.equalsIgnoreCase(name)) {
			return bill_dpt_cd();
		}
		if ($acst_cd.equalsIgnoreCase(name)) {
			return acst_cd();
		}
		if ($asppl_cd.equalsIgnoreCase(name)) {
			return asppl_cd();
		}
		if ($bsppl_cd.equalsIgnoreCase(name)) {
			return bsppl_cd();
		}
		if ($rcv_dpt_cd.equalsIgnoreCase(name)) {
			return rcv_dpt_cd();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($rcv_usr_cd.equalsIgnoreCase(name)) {
			return rcv_usr_cd();
		}
		if ($rcv_mtd_cd.equalsIgnoreCase(name)) {
			return rcv_mtd_cd();
		}
		if ($rcv_typ.equalsIgnoreCase(name)) {
			return rcv_typ();
		}
		if ($bank_ac_cd.equalsIgnoreCase(name)) {
			return bank_ac_cd();
		}
		if ($xfr_psn.equalsIgnoreCase(name)) {
			return xfr_psn();
		}
		if ($note_mng_no.equalsIgnoreCase(name)) {
			return note_mng_no();
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($base_cur_cd.equalsIgnoreCase(name)) {
			return base_cur_cd();
		}
		if ($xrate_cd.equalsIgnoreCase(name)) {
			return xrate_cd();
		}
		if ($rcv_rmrks.equalsIgnoreCase(name)) {
			return rcv_rmrks();
		}
		if ($src_rcv_act_no.equalsIgnoreCase(name)) {
			return src_rcv_act_no();
		}
		if ($src_rcv_act_d_no.equalsIgnoreCase(name)) {
			return src_rcv_act_d_no();
		}
		if ($pay_act_no.equalsIgnoreCase(name)) {
			return pay_act_no();
		}
		if ($auto_appl_sts_typ.equalsIgnoreCase(name)) {
			return auto_appl_sts_typ();
		}
		if ($ext_sys_cd.equalsIgnoreCase(name)) {
			return ext_sys_cd();
		}
		if ($ext_rcv_no.equalsIgnoreCase(name)) {
			return ext_rcv_no();
		}
		if ($div_src_rcv_no.equalsIgnoreCase(name)) {
			return div_src_rcv_no();
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
		if ($ar_typ.equalsIgnoreCase(name)) {
			return ar_typ();
		}
		return super.getStringNE(name);
	}

	public MCNumber getNumberNE(String name) {
		if ($xrate.equalsIgnoreCase(name)) {
			return xrate();
		}
		if ($src_rcv_act_seq.equalsIgnoreCase(name)) {
			return src_rcv_act_seq();
		}
		if ($src_rcv_act_d_seq.equalsIgnoreCase(name)) {
			return src_rcv_act_d_seq();
		}
		if ($rcv_amt.equalsIgnoreCase(name)) {
			return rcv_amt();
		}
		if ($rcv_proc_amt.equalsIgnoreCase(name)) {
			return rcv_proc_amt();
		}
		if ($not_proc_bal.equalsIgnoreCase(name)) {
			return not_proc_bal();
		}
		if ($com_paid.equalsIgnoreCase(name)) {
			return com_paid();
		}
		if ($bill_setoff_amt.equalsIgnoreCase(name)) {
			return bill_setoff_amt();
		}
		if ($seq_no.equalsIgnoreCase(name)) {
			return seq_no();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumberNE(name);
	}

	public MCDate getDateNE(String name) {
		if ($rcv_dt.equalsIgnoreCase(name)) {
			return rcv_dt();
		}
		if ($ac_dt.equalsIgnoreCase(name)) {
			return ac_dt();
		}
		if ($auto_appl_basis_dt.equalsIgnoreCase(name)) {
			return auto_appl_basis_dt();
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
		if ($rcv_auto_appl_tgt_flg.equalsIgnoreCase(name)) {
			return rcv_auto_appl_tgt_flg();
		}
		if ($fb_flg.equalsIgnoreCase(name)) {
			return fb_flg();
		}
		if ($prnt_flg.equalsIgnoreCase(name)) {
			return prnt_flg();
		}
		if ($div_flg.equalsIgnoreCase(name)) {
			return div_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($rcv_no.equalsIgnoreCase(name)) {
			rcv_no(value);
			return;
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			slo_no(value);
			return;
		}
		if ($dat_typ.equalsIgnoreCase(name)) {
			dat_typ(value);
			return;
		}
		if ($rcst_cd.equalsIgnoreCase(name)) {
			rcst_cd(value);
			return;
		}
		if ($bcst_cd.equalsIgnoreCase(name)) {
			bcst_cd(value);
			return;
		}
		if ($bill_dpt_cd.equalsIgnoreCase(name)) {
			bill_dpt_cd(value);
			return;
		}
		if ($acst_cd.equalsIgnoreCase(name)) {
			acst_cd(value);
			return;
		}
		if ($asppl_cd.equalsIgnoreCase(name)) {
			asppl_cd(value);
			return;
		}
		if ($bsppl_cd.equalsIgnoreCase(name)) {
			bsppl_cd(value);
			return;
		}
		if ($rcv_dpt_cd.equalsIgnoreCase(name)) {
			rcv_dpt_cd(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($rcv_usr_cd.equalsIgnoreCase(name)) {
			rcv_usr_cd(value);
			return;
		}
		if ($rcv_mtd_cd.equalsIgnoreCase(name)) {
			rcv_mtd_cd(value);
			return;
		}
		if ($rcv_typ.equalsIgnoreCase(name)) {
			rcv_typ(value);
			return;
		}
		if ($bank_ac_cd.equalsIgnoreCase(name)) {
			bank_ac_cd(value);
			return;
		}
		if ($xfr_psn.equalsIgnoreCase(name)) {
			xfr_psn(value);
			return;
		}
		if ($note_mng_no.equalsIgnoreCase(name)) {
			note_mng_no(value);
			return;
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			trd_cur_cd(value);
			return;
		}
		if ($base_cur_cd.equalsIgnoreCase(name)) {
			base_cur_cd(value);
			return;
		}
		if ($xrate_cd.equalsIgnoreCase(name)) {
			xrate_cd(value);
			return;
		}
		if ($rcv_rmrks.equalsIgnoreCase(name)) {
			rcv_rmrks(value);
			return;
		}
		if ($src_rcv_act_no.equalsIgnoreCase(name)) {
			src_rcv_act_no(value);
			return;
		}
		if ($src_rcv_act_d_no.equalsIgnoreCase(name)) {
			src_rcv_act_d_no(value);
			return;
		}
		if ($pay_act_no.equalsIgnoreCase(name)) {
			pay_act_no(value);
			return;
		}
		if ($auto_appl_sts_typ.equalsIgnoreCase(name)) {
			auto_appl_sts_typ(value);
			return;
		}
		if ($ext_sys_cd.equalsIgnoreCase(name)) {
			ext_sys_cd(value);
			return;
		}
		if ($ext_rcv_no.equalsIgnoreCase(name)) {
			ext_rcv_no(value);
			return;
		}
		if ($div_src_rcv_no.equalsIgnoreCase(name)) {
			div_src_rcv_no(value);
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
		if ($ar_typ.equalsIgnoreCase(name)) {
			ar_typ(value);
			return;
		}
		super.setString(name, value);
	}

	public void setNumber(String name, MCNumber value) {
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($src_rcv_act_seq.equalsIgnoreCase(name)) {
			src_rcv_act_seq(value);
			return;
		}
		if ($src_rcv_act_d_seq.equalsIgnoreCase(name)) {
			src_rcv_act_d_seq(value);
			return;
		}
		if ($rcv_amt.equalsIgnoreCase(name)) {
			rcv_amt(value);
			return;
		}
		if ($rcv_proc_amt.equalsIgnoreCase(name)) {
			rcv_proc_amt(value);
			return;
		}
		if ($not_proc_bal.equalsIgnoreCase(name)) {
			not_proc_bal(value);
			return;
		}
		if ($com_paid.equalsIgnoreCase(name)) {
			com_paid(value);
			return;
		}
		if ($bill_setoff_amt.equalsIgnoreCase(name)) {
			bill_setoff_amt(value);
			return;
		}
		if ($seq_no.equalsIgnoreCase(name)) {
			seq_no(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, int value) {
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($src_rcv_act_seq.equalsIgnoreCase(name)) {
			src_rcv_act_seq(value);
			return;
		}
		if ($src_rcv_act_d_seq.equalsIgnoreCase(name)) {
			src_rcv_act_d_seq(value);
			return;
		}
		if ($rcv_amt.equalsIgnoreCase(name)) {
			rcv_amt(value);
			return;
		}
		if ($rcv_proc_amt.equalsIgnoreCase(name)) {
			rcv_proc_amt(value);
			return;
		}
		if ($not_proc_bal.equalsIgnoreCase(name)) {
			not_proc_bal(value);
			return;
		}
		if ($com_paid.equalsIgnoreCase(name)) {
			com_paid(value);
			return;
		}
		if ($bill_setoff_amt.equalsIgnoreCase(name)) {
			bill_setoff_amt(value);
			return;
		}
		if ($seq_no.equalsIgnoreCase(name)) {
			seq_no(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, long value) {
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($src_rcv_act_seq.equalsIgnoreCase(name)) {
			src_rcv_act_seq(value);
			return;
		}
		if ($src_rcv_act_d_seq.equalsIgnoreCase(name)) {
			src_rcv_act_d_seq(value);
			return;
		}
		if ($rcv_amt.equalsIgnoreCase(name)) {
			rcv_amt(value);
			return;
		}
		if ($rcv_proc_amt.equalsIgnoreCase(name)) {
			rcv_proc_amt(value);
			return;
		}
		if ($not_proc_bal.equalsIgnoreCase(name)) {
			not_proc_bal(value);
			return;
		}
		if ($com_paid.equalsIgnoreCase(name)) {
			com_paid(value);
			return;
		}
		if ($bill_setoff_amt.equalsIgnoreCase(name)) {
			bill_setoff_amt(value);
			return;
		}
		if ($seq_no.equalsIgnoreCase(name)) {
			seq_no(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, float value) {
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($src_rcv_act_seq.equalsIgnoreCase(name)) {
			src_rcv_act_seq(value);
			return;
		}
		if ($src_rcv_act_d_seq.equalsIgnoreCase(name)) {
			src_rcv_act_d_seq(value);
			return;
		}
		if ($rcv_amt.equalsIgnoreCase(name)) {
			rcv_amt(value);
			return;
		}
		if ($rcv_proc_amt.equalsIgnoreCase(name)) {
			rcv_proc_amt(value);
			return;
		}
		if ($not_proc_bal.equalsIgnoreCase(name)) {
			not_proc_bal(value);
			return;
		}
		if ($com_paid.equalsIgnoreCase(name)) {
			com_paid(value);
			return;
		}
		if ($bill_setoff_amt.equalsIgnoreCase(name)) {
			bill_setoff_amt(value);
			return;
		}
		if ($seq_no.equalsIgnoreCase(name)) {
			seq_no(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, double value) {
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($src_rcv_act_seq.equalsIgnoreCase(name)) {
			src_rcv_act_seq(value);
			return;
		}
		if ($src_rcv_act_d_seq.equalsIgnoreCase(name)) {
			src_rcv_act_d_seq(value);
			return;
		}
		if ($rcv_amt.equalsIgnoreCase(name)) {
			rcv_amt(value);
			return;
		}
		if ($rcv_proc_amt.equalsIgnoreCase(name)) {
			rcv_proc_amt(value);
			return;
		}
		if ($not_proc_bal.equalsIgnoreCase(name)) {
			not_proc_bal(value);
			return;
		}
		if ($com_paid.equalsIgnoreCase(name)) {
			com_paid(value);
			return;
		}
		if ($bill_setoff_amt.equalsIgnoreCase(name)) {
			bill_setoff_amt(value);
			return;
		}
		if ($seq_no.equalsIgnoreCase(name)) {
			seq_no(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setDate(String name, MCDate value) {
		if ($rcv_dt.equalsIgnoreCase(name)) {
			rcv_dt(value);
			return;
		}
		if ($ac_dt.equalsIgnoreCase(name)) {
			ac_dt(value);
			return;
		}
		if ($auto_appl_basis_dt.equalsIgnoreCase(name)) {
			auto_appl_basis_dt(value);
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
		if ($rcv_auto_appl_tgt_flg.equalsIgnoreCase(name)) {
			rcv_auto_appl_tgt_flg(value);
			return;
		}
		if ($fb_flg.equalsIgnoreCase(name)) {
			fb_flg(value);
			return;
		}
		if ($prnt_flg.equalsIgnoreCase(name)) {
			prnt_flg(value);
			return;
		}
		if ($div_flg.equalsIgnoreCase(name)) {
			div_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($rcv_no.equalsIgnoreCase(name)) {
			rcv_no(value);
			return;
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			slo_no(value);
			return;
		}
		if ($dat_typ.equalsIgnoreCase(name)) {
			dat_typ(value);
			return;
		}
		if ($rcst_cd.equalsIgnoreCase(name)) {
			rcst_cd(value);
			return;
		}
		if ($bcst_cd.equalsIgnoreCase(name)) {
			bcst_cd(value);
			return;
		}
		if ($bill_dpt_cd.equalsIgnoreCase(name)) {
			bill_dpt_cd(value);
			return;
		}
		if ($acst_cd.equalsIgnoreCase(name)) {
			acst_cd(value);
			return;
		}
		if ($asppl_cd.equalsIgnoreCase(name)) {
			asppl_cd(value);
			return;
		}
		if ($bsppl_cd.equalsIgnoreCase(name)) {
			bsppl_cd(value);
			return;
		}
		if ($rcv_dpt_cd.equalsIgnoreCase(name)) {
			rcv_dpt_cd(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($rcv_usr_cd.equalsIgnoreCase(name)) {
			rcv_usr_cd(value);
			return;
		}
		if ($rcv_mtd_cd.equalsIgnoreCase(name)) {
			rcv_mtd_cd(value);
			return;
		}
		if ($rcv_typ.equalsIgnoreCase(name)) {
			rcv_typ(value);
			return;
		}
		if ($bank_ac_cd.equalsIgnoreCase(name)) {
			bank_ac_cd(value);
			return;
		}
		if ($xfr_psn.equalsIgnoreCase(name)) {
			xfr_psn(value);
			return;
		}
		if ($note_mng_no.equalsIgnoreCase(name)) {
			note_mng_no(value);
			return;
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			trd_cur_cd(value);
			return;
		}
		if ($base_cur_cd.equalsIgnoreCase(name)) {
			base_cur_cd(value);
			return;
		}
		if ($xrate_cd.equalsIgnoreCase(name)) {
			xrate_cd(value);
			return;
		}
		if ($rcv_rmrks.equalsIgnoreCase(name)) {
			rcv_rmrks(value);
			return;
		}
		if ($src_rcv_act_no.equalsIgnoreCase(name)) {
			src_rcv_act_no(value);
			return;
		}
		if ($src_rcv_act_d_no.equalsIgnoreCase(name)) {
			src_rcv_act_d_no(value);
			return;
		}
		if ($pay_act_no.equalsIgnoreCase(name)) {
			pay_act_no(value);
			return;
		}
		if ($auto_appl_sts_typ.equalsIgnoreCase(name)) {
			auto_appl_sts_typ(value);
			return;
		}
		if ($ext_sys_cd.equalsIgnoreCase(name)) {
			ext_sys_cd(value);
			return;
		}
		if ($ext_rcv_no.equalsIgnoreCase(name)) {
			ext_rcv_no(value);
			return;
		}
		if ($div_src_rcv_no.equalsIgnoreCase(name)) {
			div_src_rcv_no(value);
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
		if ($ar_typ.equalsIgnoreCase(name)) {
			ar_typ(value);
			return;
		}
		super.setStringNE(name, value);
	}

	public void setNumberNE(String name, MCNumber value) {
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($src_rcv_act_seq.equalsIgnoreCase(name)) {
			src_rcv_act_seq(value);
			return;
		}
		if ($src_rcv_act_d_seq.equalsIgnoreCase(name)) {
			src_rcv_act_d_seq(value);
			return;
		}
		if ($rcv_amt.equalsIgnoreCase(name)) {
			rcv_amt(value);
			return;
		}
		if ($rcv_proc_amt.equalsIgnoreCase(name)) {
			rcv_proc_amt(value);
			return;
		}
		if ($not_proc_bal.equalsIgnoreCase(name)) {
			not_proc_bal(value);
			return;
		}
		if ($com_paid.equalsIgnoreCase(name)) {
			com_paid(value);
			return;
		}
		if ($bill_setoff_amt.equalsIgnoreCase(name)) {
			bill_setoff_amt(value);
			return;
		}
		if ($seq_no.equalsIgnoreCase(name)) {
			seq_no(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, int value) {
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($src_rcv_act_seq.equalsIgnoreCase(name)) {
			src_rcv_act_seq(value);
			return;
		}
		if ($src_rcv_act_d_seq.equalsIgnoreCase(name)) {
			src_rcv_act_d_seq(value);
			return;
		}
		if ($rcv_amt.equalsIgnoreCase(name)) {
			rcv_amt(value);
			return;
		}
		if ($rcv_proc_amt.equalsIgnoreCase(name)) {
			rcv_proc_amt(value);
			return;
		}
		if ($not_proc_bal.equalsIgnoreCase(name)) {
			not_proc_bal(value);
			return;
		}
		if ($com_paid.equalsIgnoreCase(name)) {
			com_paid(value);
			return;
		}
		if ($bill_setoff_amt.equalsIgnoreCase(name)) {
			bill_setoff_amt(value);
			return;
		}
		if ($seq_no.equalsIgnoreCase(name)) {
			seq_no(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, long value) {
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($src_rcv_act_seq.equalsIgnoreCase(name)) {
			src_rcv_act_seq(value);
			return;
		}
		if ($src_rcv_act_d_seq.equalsIgnoreCase(name)) {
			src_rcv_act_d_seq(value);
			return;
		}
		if ($rcv_amt.equalsIgnoreCase(name)) {
			rcv_amt(value);
			return;
		}
		if ($rcv_proc_amt.equalsIgnoreCase(name)) {
			rcv_proc_amt(value);
			return;
		}
		if ($not_proc_bal.equalsIgnoreCase(name)) {
			not_proc_bal(value);
			return;
		}
		if ($com_paid.equalsIgnoreCase(name)) {
			com_paid(value);
			return;
		}
		if ($bill_setoff_amt.equalsIgnoreCase(name)) {
			bill_setoff_amt(value);
			return;
		}
		if ($seq_no.equalsIgnoreCase(name)) {
			seq_no(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, float value) {
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($src_rcv_act_seq.equalsIgnoreCase(name)) {
			src_rcv_act_seq(value);
			return;
		}
		if ($src_rcv_act_d_seq.equalsIgnoreCase(name)) {
			src_rcv_act_d_seq(value);
			return;
		}
		if ($rcv_amt.equalsIgnoreCase(name)) {
			rcv_amt(value);
			return;
		}
		if ($rcv_proc_amt.equalsIgnoreCase(name)) {
			rcv_proc_amt(value);
			return;
		}
		if ($not_proc_bal.equalsIgnoreCase(name)) {
			not_proc_bal(value);
			return;
		}
		if ($com_paid.equalsIgnoreCase(name)) {
			com_paid(value);
			return;
		}
		if ($bill_setoff_amt.equalsIgnoreCase(name)) {
			bill_setoff_amt(value);
			return;
		}
		if ($seq_no.equalsIgnoreCase(name)) {
			seq_no(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, double value) {
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($src_rcv_act_seq.equalsIgnoreCase(name)) {
			src_rcv_act_seq(value);
			return;
		}
		if ($src_rcv_act_d_seq.equalsIgnoreCase(name)) {
			src_rcv_act_d_seq(value);
			return;
		}
		if ($rcv_amt.equalsIgnoreCase(name)) {
			rcv_amt(value);
			return;
		}
		if ($rcv_proc_amt.equalsIgnoreCase(name)) {
			rcv_proc_amt(value);
			return;
		}
		if ($not_proc_bal.equalsIgnoreCase(name)) {
			not_proc_bal(value);
			return;
		}
		if ($com_paid.equalsIgnoreCase(name)) {
			com_paid(value);
			return;
		}
		if ($bill_setoff_amt.equalsIgnoreCase(name)) {
			bill_setoff_amt(value);
			return;
		}
		if ($seq_no.equalsIgnoreCase(name)) {
			seq_no(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setDateNE(String name, MCDate value) {
		if ($rcv_dt.equalsIgnoreCase(name)) {
			rcv_dt(value);
			return;
		}
		if ($ac_dt.equalsIgnoreCase(name)) {
			ac_dt(value);
			return;
		}
		if ($auto_appl_basis_dt.equalsIgnoreCase(name)) {
			auto_appl_basis_dt(value);
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
		if ($rcv_auto_appl_tgt_flg.equalsIgnoreCase(name)) {
			rcv_auto_appl_tgt_flg(value);
			return;
		}
		if ($fb_flg.equalsIgnoreCase(name)) {
			fb_flg(value);
			return;
		}
		if ($prnt_flg.equalsIgnoreCase(name)) {
			prnt_flg(value);
			return;
		}
		if ($div_flg.equalsIgnoreCase(name)) {
			div_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

}
