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
 * "仕入実績ヘッダ // Purchase result header"DBコンテナRowクラスです。<p>
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
 *  	<td>purc_act_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>仕入実績ＮＯ</td>
 *  	<td>Purchase result No.</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>purc_act_seq</td>
 *  	<td>N</td>
 *  	<td>4,0</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>仕入実績連番</td>
 *  	<td>Purchase result sequence number</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>purc_act_rev</td>
 *  	<td>N</td>
 *  	<td>4,0</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>仕入実績改訂番号</td>
 *  	<td>Purchase result rev. number</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>trd_cd</td>
 *  	<td>C</td>
 *  	<td>4</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>取引ＣＤ</td>
 *  	<td>Transaction cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>trd_ptn_typ</td>
 *  	<td>C</td>
 *  	<td>4</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>取引パタン区分</td>
 *  	<td>Transaction pattern type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>slip_sts_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>伝票状況区分</td>
 *  	<td>Slip status type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>po_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>発注ＮＯ</td>
 *  	<td>PO No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>purc_dpt_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>購買部門ＣＤ</td>
 *  	<td>Purchasing dept. cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>wg_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>ＷＧ ＣＤ</td>
 *  	<td>WG cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>purc_usr_cd</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>購買担当者ＣＤ</td>
 *  	<td>Purchasing PIC cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sppl_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>発注先ＣＤ</td>
 *  	<td>Supplier cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>asppl_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>N</td>
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
 *  	<td>psppl_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>支払先ＣＤ</td>
 *  	<td>Payee cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>cred_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>与信管理先ＣＤ</td>
 *  	<td>Credit managed BP cd.</td>
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
 *  	<td>ptax_cur_cd</td>
 *  	<td>C</td>
 *  	<td>3</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>納税通貨ＣＤ</td>
 *  	<td>Taxpaying currency cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>base_cur_cd</td>
 *  	<td>C</td>
 *  	<td>3</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>基準通貨ＣＤ</td>
 *  	<td>Base currency cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>xrate_cd</td>
 *  	<td>C</td>
 *  	<td>2</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>為替レートＣＤ</td>
 *  	<td>Exchange rate cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>xrate</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>為替レート</td>
 *  	<td>Exchange rate</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ptax_xrate</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>納税為替レート</td>
 *  	<td>Taxpaying exchange rate</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>purc_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>仕入日</td>
 *  	<td>Purchase date</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ac_ym</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>計上年月</td>
 *  	<td>Recording month</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ac_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>計上日</td>
 *  	<td>Recording date</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>pay_basis_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>支払起算日</td>
 *  	<td>Payment base date</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>pay_schd_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>支払予定日</td>
 *  	<td>Scheduled payment date</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ptax_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>納税日</td>
 *  	<td>Taxpaying date</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>rcpt_iv_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>受領インボイスＮＯ</td>
 *  	<td>Purchase invoice No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>rcpt_iv_mng_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>受領インボイス管理ＮＯ</td>
 *  	<td>Purchase invoice management No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>rcpt_iv_rev</td>
 *  	<td>N</td>
 *  	<td>4,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>受領インボイス改訂番号</td>
 *  	<td>Purchase invoice rev. number</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ref_rcpt_iv_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>対応受領インボイスＮＯ</td>
 *  	<td>Corresponding purchase I/V No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>purc_ret_act_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>仕入返品実績ＮＯ</td>
 *  	<td>Purchase return result No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>purc_ret_act_rev</td>
 *  	<td>N</td>
 *  	<td>4,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>仕入返品実績改訂番号</td>
 *  	<td>Purchase return result rev. number</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>tterm_cd1</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引条件ＣＤ１</td>
 *  	<td>Transaction terms cd. 1</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>tterm_rmrks1</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引条件備考１</td>
 *  	<td>Transaction terms remarks 1</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>tterm_cd2</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引条件ＣＤ２</td>
 *  	<td>Transaction terms cd. 2</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>tterm_rmrks2</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引条件備考２</td>
 *  	<td>Transaction terms remarks 2</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>tterm_cd3</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引条件ＣＤ３</td>
 *  	<td>Transaction terms cd. 3</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>tterm_rmrks3</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引条件備考３</td>
 *  	<td>Transaction terms remarks 3</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>trd_rmrks</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引備考</td>
 *  	<td>Transaction remarks</td>
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
 *  	<td>adjst_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>調整対象日</td>
 *  	<td>Adjustment required date</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>purc_adjst_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>仕入調整区分</td>
 *  	<td>Purchase adjustment type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>adjst_mtd_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>調整方法区分</td>
 *  	<td>Adjustment method type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>purc_adjst_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>仕入調整ＦＬＧ</td>
 *  	<td>Purchase adjustment flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>temp_ap_use_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>暫定買掛使用ＦＬＧ</td>
 *  	<td>Temporary AP use flg.</td>
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
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
public class MST_PURC_ACT_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.CO_VIEW;

	public static final String TABLE_NAME = "MST_PURC_ACT";

	public static final boolean EX_CTRL = true;
	
	public static final boolean LCL_TABLE = false;
	
	/**
	 * 仕入実績ＮＯ. Purchase result No..<p>
	 *
	 */
	public static final String $purc_act_no = "purc_act_no";
	private static final MCPermColumnInfo _purc_act_no = createColumnInfo("purc_act_no");
	public final MCStringPermColumn purc_act_no = createStringColumn(_purc_act_no);
	
	/**
	 * 仕入実績連番. Purchase result sequence number.<p>
	 *
	 */
	public static final String $purc_act_seq = "purc_act_seq";
	private static final MCPermColumnInfo _purc_act_seq = createColumnInfo("purc_act_seq");
	public final MCNumberPermColumn purc_act_seq = createNumberColumn(_purc_act_seq);
	
	/**
	 * 仕入実績改訂番号. Purchase result rev. number.<p>
	 *
	 */
	public static final String $purc_act_rev = "purc_act_rev";
	private static final MCPermColumnInfo _purc_act_rev = createColumnInfo("purc_act_rev");
	public final MCNumberPermColumn purc_act_rev = createNumberColumn(_purc_act_rev);
	
	/**
	 * 取引ＣＤ. Transaction cd..<p>
	 *
	 */
	public static final String $trd_cd = "trd_cd";
	private static final MCPermColumnInfo _trd_cd = createColumnInfo("trd_cd");
	public final MCStringPermColumn trd_cd = createStringColumn(_trd_cd);
	
	/**
	 * 取引パタン区分. Transaction pattern type.<p>
	 *
	 */
	public static final String $trd_ptn_typ = "trd_ptn_typ";
	private static final MCPermColumnInfo _trd_ptn_typ = createColumnInfo("trd_ptn_typ");
	public final MCStringPermColumn trd_ptn_typ = createStringColumn(_trd_ptn_typ);
	
	/**
	 * 伝票状況区分. Slip status type.<p>
	 *
	 */
	public static final String $slip_sts_typ = "slip_sts_typ";
	private static final MCPermColumnInfo _slip_sts_typ = createColumnInfo("slip_sts_typ");
	public final MCStringPermColumn slip_sts_typ = createStringColumn(_slip_sts_typ);
	
	/**
	 * 発注ＮＯ. PO No..<p>
	 *
	 */
	public static final String $po_no = "po_no";
	private static final MCPermColumnInfo _po_no = createColumnInfo("po_no");
	public final MCStringPermColumn po_no = createStringColumn(_po_no);
	
	/**
	 * 購買部門ＣＤ. Purchasing dept. cd..<p>
	 *
	 */
	public static final String $purc_dpt_cd = "purc_dpt_cd";
	private static final MCPermColumnInfo _purc_dpt_cd = createColumnInfo("purc_dpt_cd");
	public final MCStringPermColumn purc_dpt_cd = createStringColumn(_purc_dpt_cd);
	
	/**
	 * ＷＧ ＣＤ. WG cd..<p>
	 *
	 */
	public static final String $wg_cd = "wg_cd";
	private static final MCPermColumnInfo _wg_cd = createColumnInfo("wg_cd");
	public final MCStringPermColumn wg_cd = createStringColumn(_wg_cd);
	
	/**
	 * 購買担当者ＣＤ. Purchasing PIC cd..<p>
	 *
	 */
	public static final String $purc_usr_cd = "purc_usr_cd";
	private static final MCPermColumnInfo _purc_usr_cd = createColumnInfo("purc_usr_cd");
	public final MCStringPermColumn purc_usr_cd = createStringColumn(_purc_usr_cd);
	
	/**
	 * 発注先ＣＤ. Supplier cd..<p>
	 *
	 */
	public static final String $sppl_cd = "sppl_cd";
	private static final MCPermColumnInfo _sppl_cd = createColumnInfo("sppl_cd");
	public final MCStringPermColumn sppl_cd = createStringColumn(_sppl_cd);
	
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
	 * 支払先ＣＤ. Payee cd..<p>
	 *
	 */
	public static final String $psppl_cd = "psppl_cd";
	private static final MCPermColumnInfo _psppl_cd = createColumnInfo("psppl_cd");
	public final MCStringPermColumn psppl_cd = createStringColumn(_psppl_cd);
	
	/**
	 * 与信管理先ＣＤ. Credit managed BP cd..<p>
	 *
	 */
	public static final String $cred_cd = "cred_cd";
	private static final MCPermColumnInfo _cred_cd = createColumnInfo("cred_cd");
	public final MCStringPermColumn cred_cd = createStringColumn(_cred_cd);
	
	/**
	 * 取引通貨ＣＤ. Transaction currency cd..<p>
	 *
	 */
	public static final String $trd_cur_cd = "trd_cur_cd";
	private static final MCPermColumnInfo _trd_cur_cd = createColumnInfo("trd_cur_cd");
	public final MCStringPermColumn trd_cur_cd = createStringColumn(_trd_cur_cd);
	
	/**
	 * 納税通貨ＣＤ. Taxpaying currency cd..<p>
	 *
	 */
	public static final String $ptax_cur_cd = "ptax_cur_cd";
	private static final MCPermColumnInfo _ptax_cur_cd = createColumnInfo("ptax_cur_cd");
	public final MCStringPermColumn ptax_cur_cd = createStringColumn(_ptax_cur_cd);
	
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
	 * 納税為替レート. Taxpaying exchange rate.<p>
	 *
	 */
	public static final String $ptax_xrate = "ptax_xrate";
	private static final MCPermColumnInfo _ptax_xrate = createColumnInfo("ptax_xrate");
	public final MCNumberPermColumn ptax_xrate = createNumberColumn(_ptax_xrate);
	
	/**
	 * 仕入日. Purchase date.<p>
	 *
	 */
	public static final String $purc_dt = "purc_dt";
	private static final MCPermColumnInfo _purc_dt = createColumnInfo("purc_dt");
	public final MCDatePermColumn purc_dt = createDateColumn(_purc_dt);
	
	/**
	 * 計上年月. Recording month.<p>
	 *
	 */
	public static final String $ac_ym = "ac_ym";
	private static final MCPermColumnInfo _ac_ym = createColumnInfo("ac_ym");
	public final MCDatePermColumn ac_ym = createDateColumn(_ac_ym);
	
	/**
	 * 計上日. Recording date.<p>
	 *
	 */
	public static final String $ac_dt = "ac_dt";
	private static final MCPermColumnInfo _ac_dt = createColumnInfo("ac_dt");
	public final MCDatePermColumn ac_dt = createDateColumn(_ac_dt);
	
	/**
	 * 支払起算日. Payment base date.<p>
	 *
	 */
	public static final String $pay_basis_dt = "pay_basis_dt";
	private static final MCPermColumnInfo _pay_basis_dt = createColumnInfo("pay_basis_dt");
	public final MCDatePermColumn pay_basis_dt = createDateColumn(_pay_basis_dt);
	
	/**
	 * 支払予定日. Scheduled payment date.<p>
	 *
	 */
	public static final String $pay_schd_dt = "pay_schd_dt";
	private static final MCPermColumnInfo _pay_schd_dt = createColumnInfo("pay_schd_dt");
	public final MCDatePermColumn pay_schd_dt = createDateColumn(_pay_schd_dt);
	
	/**
	 * 納税日. Taxpaying date.<p>
	 *
	 */
	public static final String $ptax_dt = "ptax_dt";
	private static final MCPermColumnInfo _ptax_dt = createColumnInfo("ptax_dt");
	public final MCDatePermColumn ptax_dt = createDateColumn(_ptax_dt);
	
	/**
	 * 受領インボイスＮＯ. Purchase invoice No..<p>
	 *
	 */
	public static final String $rcpt_iv_no = "rcpt_iv_no";
	private static final MCPermColumnInfo _rcpt_iv_no = createColumnInfo("rcpt_iv_no");
	public final MCStringPermColumn rcpt_iv_no = createStringColumn(_rcpt_iv_no);
	
	/**
	 * 受領インボイス管理ＮＯ. Purchase invoice management No..<p>
	 *
	 */
	public static final String $rcpt_iv_mng_no = "rcpt_iv_mng_no";
	private static final MCPermColumnInfo _rcpt_iv_mng_no = createColumnInfo("rcpt_iv_mng_no");
	public final MCStringPermColumn rcpt_iv_mng_no = createStringColumn(_rcpt_iv_mng_no);
	
	/**
	 * 受領インボイス改訂番号. Purchase invoice rev. number.<p>
	 *
	 */
	public static final String $rcpt_iv_rev = "rcpt_iv_rev";
	private static final MCPermColumnInfo _rcpt_iv_rev = createColumnInfo("rcpt_iv_rev");
	public final MCNumberPermColumn rcpt_iv_rev = createNumberColumn(_rcpt_iv_rev);
	
	/**
	 * 対応受領インボイスＮＯ. Corresponding purchase I/V No..<p>
	 *
	 */
	public static final String $ref_rcpt_iv_no = "ref_rcpt_iv_no";
	private static final MCPermColumnInfo _ref_rcpt_iv_no = createColumnInfo("ref_rcpt_iv_no");
	public final MCStringPermColumn ref_rcpt_iv_no = createStringColumn(_ref_rcpt_iv_no);
	
	/**
	 * 仕入返品実績ＮＯ. Purchase return result No..<p>
	 *
	 */
	public static final String $purc_ret_act_no = "purc_ret_act_no";
	private static final MCPermColumnInfo _purc_ret_act_no = createColumnInfo("purc_ret_act_no");
	public final MCStringPermColumn purc_ret_act_no = createStringColumn(_purc_ret_act_no);
	
	/**
	 * 仕入返品実績改訂番号. Purchase return result rev. number.<p>
	 *
	 */
	public static final String $purc_ret_act_rev = "purc_ret_act_rev";
	private static final MCPermColumnInfo _purc_ret_act_rev = createColumnInfo("purc_ret_act_rev");
	public final MCNumberPermColumn purc_ret_act_rev = createNumberColumn(_purc_ret_act_rev);
	
	/**
	 * 取引条件ＣＤ１. Transaction terms cd. 1.<p>
	 *
	 */
	public static final String $tterm_cd1 = "tterm_cd1";
	private static final MCPermColumnInfo _tterm_cd1 = createColumnInfo("tterm_cd1");
	public final MCStringPermColumn tterm_cd1 = createStringColumn(_tterm_cd1);
	
	/**
	 * 取引条件備考１. Transaction terms remarks 1.<p>
	 *
	 */
	public static final String $tterm_rmrks1 = "tterm_rmrks1";
	private static final MCPermColumnInfo _tterm_rmrks1 = createColumnInfo("tterm_rmrks1");
	public final MCStringPermColumn tterm_rmrks1 = createStringColumn(_tterm_rmrks1);
	
	/**
	 * 取引条件ＣＤ２. Transaction terms cd. 2.<p>
	 *
	 */
	public static final String $tterm_cd2 = "tterm_cd2";
	private static final MCPermColumnInfo _tterm_cd2 = createColumnInfo("tterm_cd2");
	public final MCStringPermColumn tterm_cd2 = createStringColumn(_tterm_cd2);
	
	/**
	 * 取引条件備考２. Transaction terms remarks 2.<p>
	 *
	 */
	public static final String $tterm_rmrks2 = "tterm_rmrks2";
	private static final MCPermColumnInfo _tterm_rmrks2 = createColumnInfo("tterm_rmrks2");
	public final MCStringPermColumn tterm_rmrks2 = createStringColumn(_tterm_rmrks2);
	
	/**
	 * 取引条件ＣＤ３. Transaction terms cd. 3.<p>
	 *
	 */
	public static final String $tterm_cd3 = "tterm_cd3";
	private static final MCPermColumnInfo _tterm_cd3 = createColumnInfo("tterm_cd3");
	public final MCStringPermColumn tterm_cd3 = createStringColumn(_tterm_cd3);
	
	/**
	 * 取引条件備考３. Transaction terms remarks 3.<p>
	 *
	 */
	public static final String $tterm_rmrks3 = "tterm_rmrks3";
	private static final MCPermColumnInfo _tterm_rmrks3 = createColumnInfo("tterm_rmrks3");
	public final MCStringPermColumn tterm_rmrks3 = createStringColumn(_tterm_rmrks3);
	
	/**
	 * 取引備考. Transaction remarks.<p>
	 *
	 */
	public static final String $trd_rmrks = "trd_rmrks";
	private static final MCPermColumnInfo _trd_rmrks = createColumnInfo("trd_rmrks");
	public final MCStringPermColumn trd_rmrks = createStringColumn(_trd_rmrks);
	
	/**
	 * 内部備考. Internal remarks.<p>
	 *
	 */
	public static final String $intr_rmrks = "intr_rmrks";
	private static final MCPermColumnInfo _intr_rmrks = createColumnInfo("intr_rmrks");
	public final MCStringPermColumn intr_rmrks = createStringColumn(_intr_rmrks);
	
	/**
	 * 調整対象日. Adjustment required date.<p>
	 *
	 */
	public static final String $adjst_dt = "adjst_dt";
	private static final MCPermColumnInfo _adjst_dt = createColumnInfo("adjst_dt");
	public final MCDatePermColumn adjst_dt = createDateColumn(_adjst_dt);
	
	/**
	 * 仕入調整区分. Purchase adjustment type.<p>
	 *
	 */
	public static final String $purc_adjst_typ = "purc_adjst_typ";
	private static final MCPermColumnInfo _purc_adjst_typ = createColumnInfo("purc_adjst_typ");
	public final MCStringPermColumn purc_adjst_typ = createStringColumn(_purc_adjst_typ);
	
	/**
	 * 調整方法区分. Adjustment method type.<p>
	 *
	 */
	public static final String $adjst_mtd_typ = "adjst_mtd_typ";
	private static final MCPermColumnInfo _adjst_mtd_typ = createColumnInfo("adjst_mtd_typ");
	public final MCStringPermColumn adjst_mtd_typ = createStringColumn(_adjst_mtd_typ);
	
	/**
	 * 仕入調整ＦＬＧ. Purchase adjustment flg..<p>
	 *
	 */
	public static final String $purc_adjst_flg = "purc_adjst_flg";
	private static final MCPermColumnInfo _purc_adjst_flg = createColumnInfo("purc_adjst_flg");
	public final MCBooleanPermColumn purc_adjst_flg = createBooleanColumn(_purc_adjst_flg);
	
	/**
	 * 暫定買掛使用ＦＬＧ. Temporary AP use flg..<p>
	 *
	 */
	public static final String $temp_ap_use_flg = "temp_ap_use_flg";
	private static final MCPermColumnInfo _temp_ap_use_flg = createColumnInfo("temp_ap_use_flg");
	public final MCBooleanPermColumn temp_ap_use_flg = createBooleanColumn(_temp_ap_use_flg);
	
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
	
	public static final MCMeta purc_act_no_META = createCommonMeta($purc_act_no, mcframe.commonMA.meta.MA_META.PURC_ACT_NO);
	public static final MCMeta purc_act_seq_META = createCommonMeta($purc_act_seq, mcframe.commonMA.meta.MA_META.SLIP_SEQ);
	public static final MCMeta purc_act_rev_META = createCommonMeta($purc_act_rev, mcframe.commonMA.meta.MA_META.SLIP_REV);
	public static final MCMeta trd_cd_META = createCommonMeta($trd_cd, mcframe.commonMA.meta.MA_META.TRD_CD);
	public static final MCMeta trd_ptn_typ_META = createCommonMeta($trd_ptn_typ, mcframe.commonMA.meta.MA_META.TRD_PTN_TYP);
	public static final MCMeta slip_sts_typ_META = createCommonMeta($slip_sts_typ, mcframe.commonMA.meta.MA_META.SLIP_STS_TYP);
	public static final MCMeta po_no_META = createCommonMeta($po_no, mcframe.commonMA.meta.MA_META.PO_NO);
	public static final MCMeta purc_dpt_cd_META = createCommonMeta($purc_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta purc_usr_cd_META = createCommonMeta($purc_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta sppl_cd_META = createCommonMeta($sppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta asppl_cd_META = createCommonMeta($asppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta bsppl_cd_META = createCommonMeta($bsppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta psppl_cd_META = createCommonMeta($psppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta cred_cd_META = createCommonMeta($cred_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta trd_cur_cd_META = createCommonMeta($trd_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta ptax_cur_cd_META = createCommonMeta($ptax_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta base_cur_cd_META = createCommonMeta($base_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta xrate_cd_META = createCommonMeta($xrate_cd, mcframe.commonMA.meta.MA_META.XRATE_CD);
	public static final MCMeta xrate_META = createCommonMeta($xrate, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta ptax_xrate_META = createCommonMeta($ptax_xrate, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta purc_dt_META = createCommonMeta($purc_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta ac_ym_META = createCommonMeta($ac_ym, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta ac_dt_META = createCommonMeta($ac_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta pay_basis_dt_META = createCommonMeta($pay_basis_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta pay_schd_dt_META = createCommonMeta($pay_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta ptax_dt_META = createCommonMeta($ptax_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta rcpt_iv_no_META = createCommonMeta($rcpt_iv_no, mcframe.commonMA.meta.MA_META.IV_NO);
	public static final MCMeta rcpt_iv_mng_no_META = createCommonMeta($rcpt_iv_mng_no, mcframe.commonMA.meta.MA_META.RCPT_IV_MNG_NO);
	public static final MCMeta rcpt_iv_rev_META = createCommonMeta($rcpt_iv_rev, mcframe.commonMA.meta.MA_META.SLIP_REV);
	public static final MCMeta ref_rcpt_iv_no_META = createCommonMeta($ref_rcpt_iv_no, mcframe.commonMA.meta.MA_META.IV_NO);
	public static final MCMeta purc_ret_act_no_META = createCommonMeta($purc_ret_act_no, mcframe.commonMA.meta.MA_META.PURC_RET_ACT_NO);
	public static final MCMeta purc_ret_act_rev_META = createCommonMeta($purc_ret_act_rev, mcframe.commonMA.meta.MA_META.SLIP_REV);
	public static final MCMeta tterm_cd1_META = createCommonMeta($tterm_cd1, mcframe.commonMA.meta.MA_META.TTERM_CD);
	public static final MCMeta tterm_rmrks1_META = createCommonMeta($tterm_rmrks1, mcframe.commonMS.meta.MS_META.TTERM_RMRKS1);
	public static final MCMeta tterm_cd2_META = createCommonMeta($tterm_cd2, mcframe.commonMA.meta.MA_META.TTERM_CD);
	public static final MCMeta tterm_rmrks2_META = createCommonMeta($tterm_rmrks2, mcframe.commonMS.meta.MS_META.TTERM_RMRKS2);
	public static final MCMeta tterm_cd3_META = createCommonMeta($tterm_cd3, mcframe.commonMA.meta.MA_META.TTERM_CD);
	public static final MCMeta tterm_rmrks3_META = createCommonMeta($tterm_rmrks3, mcframe.commonMS.meta.MS_META.TTERM_RMRKS3);
	public static final MCMeta trd_rmrks_META = createCommonMeta($trd_rmrks, mcframe.commonMA.meta.MA_META.TRD_RMRKS);
	public static final MCMeta intr_rmrks_META = createCommonMeta($intr_rmrks, mcframe.commonMS.meta.MS_META.PURC_ACT_INTR_RMRKS);
	public static final MCMeta adjst_dt_META = createCommonMeta($adjst_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta purc_adjst_typ_META = createCommonMeta($purc_adjst_typ, mcframe.commonMS.meta.MS_META.PURC_ADJST_TYP);
	public static final MCMeta adjst_mtd_typ_META = createCommonMeta($adjst_mtd_typ, mcframe.commonMS.meta.MS_META.ADJST_MTD_TYP);
	public static final MCMeta purc_adjst_flg_META = createCommonMeta($purc_adjst_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta temp_ap_use_flg_META = createCommonMeta($temp_ap_use_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.PURC_ACT_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.PURC_ACT_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.PURC_ACT_SUB_CHAR3);
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
	
	protected static final ConstMetaList<MST_PURC_ACT_R> constMetas = new ConstMetaList<MST_PURC_ACT_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			purc_act_no_META,
			purc_act_seq_META,
			purc_act_rev_META,
			trd_cd_META,
			trd_ptn_typ_META,
			slip_sts_typ_META,
			po_no_META,
			purc_dpt_cd_META,
			wg_cd_META,
			purc_usr_cd_META,
			sppl_cd_META,
			asppl_cd_META,
			bsppl_cd_META,
			psppl_cd_META,
			cred_cd_META,
			trd_cur_cd_META,
			ptax_cur_cd_META,
			base_cur_cd_META,
			xrate_cd_META,
			xrate_META,
			ptax_xrate_META,
			purc_dt_META,
			ac_ym_META,
			ac_dt_META,
			pay_basis_dt_META,
			pay_schd_dt_META,
			ptax_dt_META,
			rcpt_iv_no_META,
			rcpt_iv_mng_no_META,
			rcpt_iv_rev_META,
			ref_rcpt_iv_no_META,
			purc_ret_act_no_META,
			purc_ret_act_rev_META,
			tterm_cd1_META,
			tterm_rmrks1_META,
			tterm_cd2_META,
			tterm_rmrks2_META,
			tterm_cd3_META,
			tterm_rmrks3_META,
			trd_rmrks_META,
			intr_rmrks_META,
			adjst_dt_META,
			purc_adjst_typ_META,
			adjst_mtd_typ_META,
			purc_adjst_flg_META,
			temp_ap_use_flg_META,
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
	protected MST_PURC_ACT_R(ConstMetaList<? extends MST_PURC_ACT_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MST_PURC_ACT_R(ConstMetaList<? extends MST_PURC_ACT_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MST_PURC_ACT_R.$purc_act_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PURC_ACT_R.$purc_act_no,
				"purc_act_no",
				purc_act_no,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PURC_ACT_R.$purc_act_seq,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_PURC_ACT_R.$purc_act_seq,
				"purc_act_seq",
				purc_act_seq,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PURC_ACT_R.$purc_act_rev,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_PURC_ACT_R.$purc_act_rev,
				"purc_act_rev",
				purc_act_rev,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PURC_ACT_R.$trd_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PURC_ACT_R.$trd_cd,
				"trd_cd",
				trd_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PURC_ACT_R.$trd_ptn_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PURC_ACT_R.$trd_ptn_typ,
				"trd_ptn_typ",
				trd_ptn_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PURC_ACT_R.$slip_sts_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PURC_ACT_R.$slip_sts_typ,
				"slip_sts_typ",
				slip_sts_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PURC_ACT_R.$po_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PURC_ACT_R.$po_no,
				"po_no",
				po_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PURC_ACT_R.$purc_dpt_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PURC_ACT_R.$purc_dpt_cd,
				"purc_dpt_cd",
				purc_dpt_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PURC_ACT_R.$wg_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PURC_ACT_R.$wg_cd,
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
			MST_PURC_ACT_R.$purc_usr_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PURC_ACT_R.$purc_usr_cd,
				"purc_usr_cd",
				purc_usr_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PURC_ACT_R.$sppl_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PURC_ACT_R.$sppl_cd,
				"sppl_cd",
				sppl_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PURC_ACT_R.$asppl_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PURC_ACT_R.$asppl_cd,
				"asppl_cd",
				asppl_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PURC_ACT_R.$bsppl_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PURC_ACT_R.$bsppl_cd,
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
			MST_PURC_ACT_R.$psppl_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PURC_ACT_R.$psppl_cd,
				"psppl_cd",
				psppl_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PURC_ACT_R.$cred_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PURC_ACT_R.$cred_cd,
				"cred_cd",
				cred_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PURC_ACT_R.$trd_cur_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PURC_ACT_R.$trd_cur_cd,
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
			MST_PURC_ACT_R.$ptax_cur_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PURC_ACT_R.$ptax_cur_cd,
				"ptax_cur_cd",
				ptax_cur_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PURC_ACT_R.$base_cur_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PURC_ACT_R.$base_cur_cd,
				"base_cur_cd",
				base_cur_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PURC_ACT_R.$xrate_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PURC_ACT_R.$xrate_cd,
				"xrate_cd",
				xrate_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PURC_ACT_R.$xrate,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_PURC_ACT_R.$xrate,
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
			MST_PURC_ACT_R.$ptax_xrate,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_PURC_ACT_R.$ptax_xrate,
				"ptax_xrate",
				ptax_xrate,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PURC_ACT_R.$purc_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_PURC_ACT_R.$purc_dt,
				"purc_dt",
				purc_dt,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PURC_ACT_R.$ac_ym,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_PURC_ACT_R.$ac_ym,
				"ac_ym",
				ac_ym,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PURC_ACT_R.$ac_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_PURC_ACT_R.$ac_dt,
				"ac_dt",
				ac_dt,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PURC_ACT_R.$pay_basis_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_PURC_ACT_R.$pay_basis_dt,
				"pay_basis_dt",
				pay_basis_dt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PURC_ACT_R.$pay_schd_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_PURC_ACT_R.$pay_schd_dt,
				"pay_schd_dt",
				pay_schd_dt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PURC_ACT_R.$ptax_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_PURC_ACT_R.$ptax_dt,
				"ptax_dt",
				ptax_dt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PURC_ACT_R.$rcpt_iv_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PURC_ACT_R.$rcpt_iv_no,
				"rcpt_iv_no",
				rcpt_iv_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PURC_ACT_R.$rcpt_iv_mng_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PURC_ACT_R.$rcpt_iv_mng_no,
				"rcpt_iv_mng_no",
				rcpt_iv_mng_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PURC_ACT_R.$rcpt_iv_rev,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_PURC_ACT_R.$rcpt_iv_rev,
				"rcpt_iv_rev",
				rcpt_iv_rev,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PURC_ACT_R.$ref_rcpt_iv_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PURC_ACT_R.$ref_rcpt_iv_no,
				"ref_rcpt_iv_no",
				ref_rcpt_iv_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PURC_ACT_R.$purc_ret_act_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PURC_ACT_R.$purc_ret_act_no,
				"purc_ret_act_no",
				purc_ret_act_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PURC_ACT_R.$purc_ret_act_rev,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_PURC_ACT_R.$purc_ret_act_rev,
				"purc_ret_act_rev",
				purc_ret_act_rev,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PURC_ACT_R.$tterm_cd1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PURC_ACT_R.$tterm_cd1,
				"tterm_cd1",
				tterm_cd1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PURC_ACT_R.$tterm_rmrks1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PURC_ACT_R.$tterm_rmrks1,
				"tterm_rmrks1",
				tterm_rmrks1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PURC_ACT_R.$tterm_cd2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PURC_ACT_R.$tterm_cd2,
				"tterm_cd2",
				tterm_cd2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PURC_ACT_R.$tterm_rmrks2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PURC_ACT_R.$tterm_rmrks2,
				"tterm_rmrks2",
				tterm_rmrks2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PURC_ACT_R.$tterm_cd3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PURC_ACT_R.$tterm_cd3,
				"tterm_cd3",
				tterm_cd3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PURC_ACT_R.$tterm_rmrks3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PURC_ACT_R.$tterm_rmrks3,
				"tterm_rmrks3",
				tterm_rmrks3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PURC_ACT_R.$trd_rmrks,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PURC_ACT_R.$trd_rmrks,
				"trd_rmrks",
				trd_rmrks,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PURC_ACT_R.$intr_rmrks,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PURC_ACT_R.$intr_rmrks,
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
			MST_PURC_ACT_R.$adjst_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_PURC_ACT_R.$adjst_dt,
				"adjst_dt",
				adjst_dt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PURC_ACT_R.$purc_adjst_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PURC_ACT_R.$purc_adjst_typ,
				"purc_adjst_typ",
				purc_adjst_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PURC_ACT_R.$adjst_mtd_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PURC_ACT_R.$adjst_mtd_typ,
				"adjst_mtd_typ",
				adjst_mtd_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PURC_ACT_R.$purc_adjst_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_PURC_ACT_R.$purc_adjst_flg,
				"purc_adjst_flg",
				purc_adjst_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PURC_ACT_R.$temp_ap_use_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_PURC_ACT_R.$temp_ap_use_flg,
				"temp_ap_use_flg",
				temp_ap_use_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PURC_ACT_R.$sub_char1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PURC_ACT_R.$sub_char1,
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
			MST_PURC_ACT_R.$sub_char2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PURC_ACT_R.$sub_char2,
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
			MST_PURC_ACT_R.$sub_char3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PURC_ACT_R.$sub_char3,
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
			MST_PURC_ACT_R.$ins_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PURC_ACT_R.$ins_usr_id,
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
			MST_PURC_ACT_R.$ins_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PURC_ACT_R.$ins_usr_nm,
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
			MST_PURC_ACT_R.$ins_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MST_PURC_ACT_R.$ins_ts,
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
			MST_PURC_ACT_R.$ins_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PURC_ACT_R.$ins_func_id,
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
			MST_PURC_ACT_R.$upd_cntr,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_PURC_ACT_R.$upd_cntr,
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
			MST_PURC_ACT_R.$upd_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PURC_ACT_R.$upd_usr_id,
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
			MST_PURC_ACT_R.$upd_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PURC_ACT_R.$upd_usr_nm,
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
			MST_PURC_ACT_R.$upd_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MST_PURC_ACT_R.$upd_ts,
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
			MST_PURC_ACT_R.$upd_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PURC_ACT_R.$upd_func_id,
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
			MST_PURC_ACT_R.$upd_srv_req_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PURC_ACT_R.$upd_srv_req_no,
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
	public static MST_PURC_ACT_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MST_PURC_ACT_R create(String alias) {
		MST_PURC_ACT_R row = new MST_PURC_ACT_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MST_PURC_ACT_R createByName(T proto) {
		MST_PURC_ACT_R row = MST_PURC_ACT_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MST_PURC_ACT_R clone() {
		return (MST_PURC_ACT_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MST_PURC_ACT_R createInstance() {
		return (MST_PURC_ACT_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MST_PURC_ACT_R getValues(String... names) {
		return (MST_PURC_ACT_R) super.getValues(names);
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
	 public MSW_PURC_ACT_KEY_R getPkWorkDbc(String alias) {
	 	return MSW_PURC_ACT_KEY_R.create(alias);
	 }

	/*
	 * MCDBContainerのオーバーライドメソッドです。
	 */
	 public MSW_PURC_ACT_KEY_R getPkWorkDbc() {
	 	return getPkWorkDbc(MSW_PURC_ACT_KEY_R.TABLE_NAME);
	 }

	/**
	 * 仕入実績ＮＯ. Purchase result No..<p>
	 *
	 */
	public String purc_act_no() {
		return getConstString(offset + 0, $purc_act_no);
	}

	/**
	 * 仕入実績ＮＯ. Purchase result No..<p>
	 *
	 */
	public void purc_act_no(String value) {
		setConstString(offset + 0, $purc_act_no, value);
	}

	/**
	 * 仕入実績連番. Purchase result sequence number.<p>
	 *
	 */
	public MCNumber purc_act_seq() {
		return getConstNumber(offset + 1, $purc_act_seq);
	}

	/**
	 * 仕入実績連番. Purchase result sequence number.<p>
	 *
	 */
	public void purc_act_seq(MCNumber value) {
		setConstNumber(offset + 1, $purc_act_seq, value);
	}
	
	/**
	 * 仕入実績連番. Purchase result sequence number.<p>
	 *
	 */
	public void purc_act_seq(int value) {
		setConstNumber(offset + 1, $purc_act_seq, value);
	}
	
	/**
	 * 仕入実績連番. Purchase result sequence number.<p>
	 *
	 */
	public void purc_act_seq(long value) {
		setConstNumber(offset + 1, $purc_act_seq, value);
	}
	
	/**
	 * 仕入実績連番. Purchase result sequence number.<p>
	 *
	 */
	public void purc_act_seq(float value) {
		setConstNumber(offset + 1, $purc_act_seq, value);
	}
	
	/**
	 * 仕入実績連番. Purchase result sequence number.<p>
	 *
	 */
	public void purc_act_seq(double value) {
		setConstNumber(offset + 1, $purc_act_seq, value);
	}
	
	/**
	 * 仕入実績改訂番号. Purchase result rev. number.<p>
	 *
	 */
	public MCNumber purc_act_rev() {
		return getConstNumber(offset + 2, $purc_act_rev);
	}

	/**
	 * 仕入実績改訂番号. Purchase result rev. number.<p>
	 *
	 */
	public void purc_act_rev(MCNumber value) {
		setConstNumber(offset + 2, $purc_act_rev, value);
	}
	
	/**
	 * 仕入実績改訂番号. Purchase result rev. number.<p>
	 *
	 */
	public void purc_act_rev(int value) {
		setConstNumber(offset + 2, $purc_act_rev, value);
	}
	
	/**
	 * 仕入実績改訂番号. Purchase result rev. number.<p>
	 *
	 */
	public void purc_act_rev(long value) {
		setConstNumber(offset + 2, $purc_act_rev, value);
	}
	
	/**
	 * 仕入実績改訂番号. Purchase result rev. number.<p>
	 *
	 */
	public void purc_act_rev(float value) {
		setConstNumber(offset + 2, $purc_act_rev, value);
	}
	
	/**
	 * 仕入実績改訂番号. Purchase result rev. number.<p>
	 *
	 */
	public void purc_act_rev(double value) {
		setConstNumber(offset + 2, $purc_act_rev, value);
	}
	
	/**
	 * 取引ＣＤ. Transaction cd..<p>
	 *
	 */
	public String trd_cd() {
		return getConstString(offset + 3, $trd_cd);
	}

	/**
	 * 取引ＣＤ. Transaction cd..<p>
	 *
	 */
	public void trd_cd(String value) {
		setConstString(offset + 3, $trd_cd, value);
	}

	/**
	 * 取引パタン区分. Transaction pattern type.<p>
	 *
	 */
	public String trd_ptn_typ() {
		return getConstString(offset + 4, $trd_ptn_typ);
	}

	/**
	 * 取引パタン区分. Transaction pattern type.<p>
	 *
	 */
	public void trd_ptn_typ(String value) {
		setConstString(offset + 4, $trd_ptn_typ, value);
	}

	/**
	 * 伝票状況区分. Slip status type.<p>
	 *
	 */
	public String slip_sts_typ() {
		return getConstString(offset + 5, $slip_sts_typ);
	}

	/**
	 * 伝票状況区分. Slip status type.<p>
	 *
	 */
	public void slip_sts_typ(String value) {
		setConstString(offset + 5, $slip_sts_typ, value);
	}

	/**
	 * 発注ＮＯ. PO No..<p>
	 *
	 */
	public String po_no() {
		return getConstString(offset + 6, $po_no);
	}

	/**
	 * 発注ＮＯ. PO No..<p>
	 *
	 */
	public void po_no(String value) {
		setConstString(offset + 6, $po_no, value);
	}

	/**
	 * 購買部門ＣＤ. Purchasing dept. cd..<p>
	 *
	 */
	public String purc_dpt_cd() {
		return getConstString(offset + 7, $purc_dpt_cd);
	}

	/**
	 * 購買部門ＣＤ. Purchasing dept. cd..<p>
	 *
	 */
	public void purc_dpt_cd(String value) {
		setConstString(offset + 7, $purc_dpt_cd, value);
	}

	/**
	 * ＷＧ ＣＤ. WG cd..<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 8, $wg_cd);
	}

	/**
	 * ＷＧ ＣＤ. WG cd..<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 8, $wg_cd, value);
	}

	/**
	 * 購買担当者ＣＤ. Purchasing PIC cd..<p>
	 *
	 */
	public String purc_usr_cd() {
		return getConstString(offset + 9, $purc_usr_cd);
	}

	/**
	 * 購買担当者ＣＤ. Purchasing PIC cd..<p>
	 *
	 */
	public void purc_usr_cd(String value) {
		setConstString(offset + 9, $purc_usr_cd, value);
	}

	/**
	 * 発注先ＣＤ. Supplier cd..<p>
	 *
	 */
	public String sppl_cd() {
		return getConstString(offset + 10, $sppl_cd);
	}

	/**
	 * 発注先ＣＤ. Supplier cd..<p>
	 *
	 */
	public void sppl_cd(String value) {
		setConstString(offset + 10, $sppl_cd, value);
	}

	/**
	 * 買掛先ＣＤ. AP supplier cd..<p>
	 *
	 */
	public String asppl_cd() {
		return getConstString(offset + 11, $asppl_cd);
	}

	/**
	 * 買掛先ＣＤ. AP supplier cd..<p>
	 *
	 */
	public void asppl_cd(String value) {
		setConstString(offset + 11, $asppl_cd, value);
	}

	/**
	 * 支払予定管理先ＣＤ. Scheduled payee cd..<p>
	 *
	 */
	public String bsppl_cd() {
		return getConstString(offset + 12, $bsppl_cd);
	}

	/**
	 * 支払予定管理先ＣＤ. Scheduled payee cd..<p>
	 *
	 */
	public void bsppl_cd(String value) {
		setConstString(offset + 12, $bsppl_cd, value);
	}

	/**
	 * 支払先ＣＤ. Payee cd..<p>
	 *
	 */
	public String psppl_cd() {
		return getConstString(offset + 13, $psppl_cd);
	}

	/**
	 * 支払先ＣＤ. Payee cd..<p>
	 *
	 */
	public void psppl_cd(String value) {
		setConstString(offset + 13, $psppl_cd, value);
	}

	/**
	 * 与信管理先ＣＤ. Credit managed BP cd..<p>
	 *
	 */
	public String cred_cd() {
		return getConstString(offset + 14, $cred_cd);
	}

	/**
	 * 与信管理先ＣＤ. Credit managed BP cd..<p>
	 *
	 */
	public void cred_cd(String value) {
		setConstString(offset + 14, $cred_cd, value);
	}

	/**
	 * 取引通貨ＣＤ. Transaction currency cd..<p>
	 *
	 */
	public String trd_cur_cd() {
		return getConstString(offset + 15, $trd_cur_cd);
	}

	/**
	 * 取引通貨ＣＤ. Transaction currency cd..<p>
	 *
	 */
	public void trd_cur_cd(String value) {
		setConstString(offset + 15, $trd_cur_cd, value);
	}

	/**
	 * 納税通貨ＣＤ. Taxpaying currency cd..<p>
	 *
	 */
	public String ptax_cur_cd() {
		return getConstString(offset + 16, $ptax_cur_cd);
	}

	/**
	 * 納税通貨ＣＤ. Taxpaying currency cd..<p>
	 *
	 */
	public void ptax_cur_cd(String value) {
		setConstString(offset + 16, $ptax_cur_cd, value);
	}

	/**
	 * 基準通貨ＣＤ. Base currency cd..<p>
	 *
	 */
	public String base_cur_cd() {
		return getConstString(offset + 17, $base_cur_cd);
	}

	/**
	 * 基準通貨ＣＤ. Base currency cd..<p>
	 *
	 */
	public void base_cur_cd(String value) {
		setConstString(offset + 17, $base_cur_cd, value);
	}

	/**
	 * 為替レートＣＤ. Exchange rate cd..<p>
	 *
	 */
	public String xrate_cd() {
		return getConstString(offset + 18, $xrate_cd);
	}

	/**
	 * 為替レートＣＤ. Exchange rate cd..<p>
	 *
	 */
	public void xrate_cd(String value) {
		setConstString(offset + 18, $xrate_cd, value);
	}

	/**
	 * 為替レート. Exchange rate.<p>
	 *
	 */
	public MCNumber xrate() {
		return getConstNumber(offset + 19, $xrate);
	}

	/**
	 * 為替レート. Exchange rate.<p>
	 *
	 */
	public void xrate(MCNumber value) {
		setConstNumber(offset + 19, $xrate, value);
	}
	
	/**
	 * 為替レート. Exchange rate.<p>
	 *
	 */
	public void xrate(int value) {
		setConstNumber(offset + 19, $xrate, value);
	}
	
	/**
	 * 為替レート. Exchange rate.<p>
	 *
	 */
	public void xrate(long value) {
		setConstNumber(offset + 19, $xrate, value);
	}
	
	/**
	 * 為替レート. Exchange rate.<p>
	 *
	 */
	public void xrate(float value) {
		setConstNumber(offset + 19, $xrate, value);
	}
	
	/**
	 * 為替レート. Exchange rate.<p>
	 *
	 */
	public void xrate(double value) {
		setConstNumber(offset + 19, $xrate, value);
	}
	
	/**
	 * 納税為替レート. Taxpaying exchange rate.<p>
	 *
	 */
	public MCNumber ptax_xrate() {
		return getConstNumber(offset + 20, $ptax_xrate);
	}

	/**
	 * 納税為替レート. Taxpaying exchange rate.<p>
	 *
	 */
	public void ptax_xrate(MCNumber value) {
		setConstNumber(offset + 20, $ptax_xrate, value);
	}
	
	/**
	 * 納税為替レート. Taxpaying exchange rate.<p>
	 *
	 */
	public void ptax_xrate(int value) {
		setConstNumber(offset + 20, $ptax_xrate, value);
	}
	
	/**
	 * 納税為替レート. Taxpaying exchange rate.<p>
	 *
	 */
	public void ptax_xrate(long value) {
		setConstNumber(offset + 20, $ptax_xrate, value);
	}
	
	/**
	 * 納税為替レート. Taxpaying exchange rate.<p>
	 *
	 */
	public void ptax_xrate(float value) {
		setConstNumber(offset + 20, $ptax_xrate, value);
	}
	
	/**
	 * 納税為替レート. Taxpaying exchange rate.<p>
	 *
	 */
	public void ptax_xrate(double value) {
		setConstNumber(offset + 20, $ptax_xrate, value);
	}
	
	/**
	 * 仕入日. Purchase date.<p>
	 *
	 */
	public MCDate purc_dt() {
		return getConstDate(offset + 21, $purc_dt);
	}

	/**
	 * 仕入日. Purchase date.<p>
	 *
	 */
	public void purc_dt(MCDate value) {
		setConstDate(offset + 21, $purc_dt, value);
	}

	/**
	 * 計上年月. Recording month.<p>
	 *
	 */
	public MCDate ac_ym() {
		return getConstDate(offset + 22, $ac_ym);
	}

	/**
	 * 計上年月. Recording month.<p>
	 *
	 */
	public void ac_ym(MCDate value) {
		setConstDate(offset + 22, $ac_ym, value);
	}

	/**
	 * 計上日. Recording date.<p>
	 *
	 */
	public MCDate ac_dt() {
		return getConstDate(offset + 23, $ac_dt);
	}

	/**
	 * 計上日. Recording date.<p>
	 *
	 */
	public void ac_dt(MCDate value) {
		setConstDate(offset + 23, $ac_dt, value);
	}

	/**
	 * 支払起算日. Payment base date.<p>
	 *
	 */
	public MCDate pay_basis_dt() {
		return getConstDate(offset + 24, $pay_basis_dt);
	}

	/**
	 * 支払起算日. Payment base date.<p>
	 *
	 */
	public void pay_basis_dt(MCDate value) {
		setConstDate(offset + 24, $pay_basis_dt, value);
	}

	/**
	 * 支払予定日. Scheduled payment date.<p>
	 *
	 */
	public MCDate pay_schd_dt() {
		return getConstDate(offset + 25, $pay_schd_dt);
	}

	/**
	 * 支払予定日. Scheduled payment date.<p>
	 *
	 */
	public void pay_schd_dt(MCDate value) {
		setConstDate(offset + 25, $pay_schd_dt, value);
	}

	/**
	 * 納税日. Taxpaying date.<p>
	 *
	 */
	public MCDate ptax_dt() {
		return getConstDate(offset + 26, $ptax_dt);
	}

	/**
	 * 納税日. Taxpaying date.<p>
	 *
	 */
	public void ptax_dt(MCDate value) {
		setConstDate(offset + 26, $ptax_dt, value);
	}

	/**
	 * 受領インボイスＮＯ. Purchase invoice No..<p>
	 *
	 */
	public String rcpt_iv_no() {
		return getConstString(offset + 27, $rcpt_iv_no);
	}

	/**
	 * 受領インボイスＮＯ. Purchase invoice No..<p>
	 *
	 */
	public void rcpt_iv_no(String value) {
		setConstString(offset + 27, $rcpt_iv_no, value);
	}

	/**
	 * 受領インボイス管理ＮＯ. Purchase invoice management No..<p>
	 *
	 */
	public String rcpt_iv_mng_no() {
		return getConstString(offset + 28, $rcpt_iv_mng_no);
	}

	/**
	 * 受領インボイス管理ＮＯ. Purchase invoice management No..<p>
	 *
	 */
	public void rcpt_iv_mng_no(String value) {
		setConstString(offset + 28, $rcpt_iv_mng_no, value);
	}

	/**
	 * 受領インボイス改訂番号. Purchase invoice rev. number.<p>
	 *
	 */
	public MCNumber rcpt_iv_rev() {
		return getConstNumber(offset + 29, $rcpt_iv_rev);
	}

	/**
	 * 受領インボイス改訂番号. Purchase invoice rev. number.<p>
	 *
	 */
	public void rcpt_iv_rev(MCNumber value) {
		setConstNumber(offset + 29, $rcpt_iv_rev, value);
	}
	
	/**
	 * 受領インボイス改訂番号. Purchase invoice rev. number.<p>
	 *
	 */
	public void rcpt_iv_rev(int value) {
		setConstNumber(offset + 29, $rcpt_iv_rev, value);
	}
	
	/**
	 * 受領インボイス改訂番号. Purchase invoice rev. number.<p>
	 *
	 */
	public void rcpt_iv_rev(long value) {
		setConstNumber(offset + 29, $rcpt_iv_rev, value);
	}
	
	/**
	 * 受領インボイス改訂番号. Purchase invoice rev. number.<p>
	 *
	 */
	public void rcpt_iv_rev(float value) {
		setConstNumber(offset + 29, $rcpt_iv_rev, value);
	}
	
	/**
	 * 受領インボイス改訂番号. Purchase invoice rev. number.<p>
	 *
	 */
	public void rcpt_iv_rev(double value) {
		setConstNumber(offset + 29, $rcpt_iv_rev, value);
	}
	
	/**
	 * 対応受領インボイスＮＯ. Corresponding purchase I/V No..<p>
	 *
	 */
	public String ref_rcpt_iv_no() {
		return getConstString(offset + 30, $ref_rcpt_iv_no);
	}

	/**
	 * 対応受領インボイスＮＯ. Corresponding purchase I/V No..<p>
	 *
	 */
	public void ref_rcpt_iv_no(String value) {
		setConstString(offset + 30, $ref_rcpt_iv_no, value);
	}

	/**
	 * 仕入返品実績ＮＯ. Purchase return result No..<p>
	 *
	 */
	public String purc_ret_act_no() {
		return getConstString(offset + 31, $purc_ret_act_no);
	}

	/**
	 * 仕入返品実績ＮＯ. Purchase return result No..<p>
	 *
	 */
	public void purc_ret_act_no(String value) {
		setConstString(offset + 31, $purc_ret_act_no, value);
	}

	/**
	 * 仕入返品実績改訂番号. Purchase return result rev. number.<p>
	 *
	 */
	public MCNumber purc_ret_act_rev() {
		return getConstNumber(offset + 32, $purc_ret_act_rev);
	}

	/**
	 * 仕入返品実績改訂番号. Purchase return result rev. number.<p>
	 *
	 */
	public void purc_ret_act_rev(MCNumber value) {
		setConstNumber(offset + 32, $purc_ret_act_rev, value);
	}
	
	/**
	 * 仕入返品実績改訂番号. Purchase return result rev. number.<p>
	 *
	 */
	public void purc_ret_act_rev(int value) {
		setConstNumber(offset + 32, $purc_ret_act_rev, value);
	}
	
	/**
	 * 仕入返品実績改訂番号. Purchase return result rev. number.<p>
	 *
	 */
	public void purc_ret_act_rev(long value) {
		setConstNumber(offset + 32, $purc_ret_act_rev, value);
	}
	
	/**
	 * 仕入返品実績改訂番号. Purchase return result rev. number.<p>
	 *
	 */
	public void purc_ret_act_rev(float value) {
		setConstNumber(offset + 32, $purc_ret_act_rev, value);
	}
	
	/**
	 * 仕入返品実績改訂番号. Purchase return result rev. number.<p>
	 *
	 */
	public void purc_ret_act_rev(double value) {
		setConstNumber(offset + 32, $purc_ret_act_rev, value);
	}
	
	/**
	 * 取引条件ＣＤ１. Transaction terms cd. 1.<p>
	 *
	 */
	public String tterm_cd1() {
		return getConstString(offset + 33, $tterm_cd1);
	}

	/**
	 * 取引条件ＣＤ１. Transaction terms cd. 1.<p>
	 *
	 */
	public void tterm_cd1(String value) {
		setConstString(offset + 33, $tterm_cd1, value);
	}

	/**
	 * 取引条件備考１. Transaction terms remarks 1.<p>
	 *
	 */
	public String tterm_rmrks1() {
		return getConstString(offset + 34, $tterm_rmrks1);
	}

	/**
	 * 取引条件備考１. Transaction terms remarks 1.<p>
	 *
	 */
	public void tterm_rmrks1(String value) {
		setConstString(offset + 34, $tterm_rmrks1, value);
	}

	/**
	 * 取引条件ＣＤ２. Transaction terms cd. 2.<p>
	 *
	 */
	public String tterm_cd2() {
		return getConstString(offset + 35, $tterm_cd2);
	}

	/**
	 * 取引条件ＣＤ２. Transaction terms cd. 2.<p>
	 *
	 */
	public void tterm_cd2(String value) {
		setConstString(offset + 35, $tterm_cd2, value);
	}

	/**
	 * 取引条件備考２. Transaction terms remarks 2.<p>
	 *
	 */
	public String tterm_rmrks2() {
		return getConstString(offset + 36, $tterm_rmrks2);
	}

	/**
	 * 取引条件備考２. Transaction terms remarks 2.<p>
	 *
	 */
	public void tterm_rmrks2(String value) {
		setConstString(offset + 36, $tterm_rmrks2, value);
	}

	/**
	 * 取引条件ＣＤ３. Transaction terms cd. 3.<p>
	 *
	 */
	public String tterm_cd3() {
		return getConstString(offset + 37, $tterm_cd3);
	}

	/**
	 * 取引条件ＣＤ３. Transaction terms cd. 3.<p>
	 *
	 */
	public void tterm_cd3(String value) {
		setConstString(offset + 37, $tterm_cd3, value);
	}

	/**
	 * 取引条件備考３. Transaction terms remarks 3.<p>
	 *
	 */
	public String tterm_rmrks3() {
		return getConstString(offset + 38, $tterm_rmrks3);
	}

	/**
	 * 取引条件備考３. Transaction terms remarks 3.<p>
	 *
	 */
	public void tterm_rmrks3(String value) {
		setConstString(offset + 38, $tterm_rmrks3, value);
	}

	/**
	 * 取引備考. Transaction remarks.<p>
	 *
	 */
	public String trd_rmrks() {
		return getConstString(offset + 39, $trd_rmrks);
	}

	/**
	 * 取引備考. Transaction remarks.<p>
	 *
	 */
	public void trd_rmrks(String value) {
		setConstString(offset + 39, $trd_rmrks, value);
	}

	/**
	 * 内部備考. Internal remarks.<p>
	 *
	 */
	public String intr_rmrks() {
		return getConstString(offset + 40, $intr_rmrks);
	}

	/**
	 * 内部備考. Internal remarks.<p>
	 *
	 */
	public void intr_rmrks(String value) {
		setConstString(offset + 40, $intr_rmrks, value);
	}

	/**
	 * 調整対象日. Adjustment required date.<p>
	 *
	 */
	public MCDate adjst_dt() {
		return getConstDate(offset + 41, $adjst_dt);
	}

	/**
	 * 調整対象日. Adjustment required date.<p>
	 *
	 */
	public void adjst_dt(MCDate value) {
		setConstDate(offset + 41, $adjst_dt, value);
	}

	/**
	 * 仕入調整区分. Purchase adjustment type.<p>
	 *
	 */
	public String purc_adjst_typ() {
		return getConstString(offset + 42, $purc_adjst_typ);
	}

	/**
	 * 仕入調整区分. Purchase adjustment type.<p>
	 *
	 */
	public void purc_adjst_typ(String value) {
		setConstString(offset + 42, $purc_adjst_typ, value);
	}

	/**
	 * 調整方法区分. Adjustment method type.<p>
	 *
	 */
	public String adjst_mtd_typ() {
		return getConstString(offset + 43, $adjst_mtd_typ);
	}

	/**
	 * 調整方法区分. Adjustment method type.<p>
	 *
	 */
	public void adjst_mtd_typ(String value) {
		setConstString(offset + 43, $adjst_mtd_typ, value);
	}

	/**
	 * 仕入調整ＦＬＧ. Purchase adjustment flg..<p>
	 *
	 */
	public boolean purc_adjst_flg() {
		return getConstBoolean(offset + 44, $purc_adjst_flg);
	}

	/**
	 * 仕入調整ＦＬＧ. Purchase adjustment flg..<p>
	 *
	 */
	public void purc_adjst_flg(boolean value) {
		setConstBoolean(offset + 44, $purc_adjst_flg, value);
	}

	/**
	 * 暫定買掛使用ＦＬＧ. Temporary AP use flg..<p>
	 *
	 */
	public boolean temp_ap_use_flg() {
		return getConstBoolean(offset + 45, $temp_ap_use_flg);
	}

	/**
	 * 暫定買掛使用ＦＬＧ. Temporary AP use flg..<p>
	 *
	 */
	public void temp_ap_use_flg(boolean value) {
		setConstBoolean(offset + 45, $temp_ap_use_flg, value);
	}

	/**
	 * 予備１. Spare 1.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 46, $sub_char1);
	}

	/**
	 * 予備１. Spare 1.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 46, $sub_char1, value);
	}

	/**
	 * 予備２. Spare 2.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 47, $sub_char2);
	}

	/**
	 * 予備２. Spare 2.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 47, $sub_char2, value);
	}

	/**
	 * 予備３. Spare 3.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 48, $sub_char3);
	}

	/**
	 * 予備３. Spare 3.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 48, $sub_char3, value);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 49, $ins_usr_id);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 49, $ins_usr_id, value);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 50, $ins_usr_nm);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 50, $ins_usr_nm, value);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 51, $ins_ts);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 51, $ins_ts, value);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 52, $ins_func_id);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 52, $ins_func_id, value);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 53, $upd_cntr);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 53, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 53, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 53, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 53, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 53, $upd_cntr, value);
	}
	
	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 54, $upd_usr_id);
	}

	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 54, $upd_usr_id, value);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 55, $upd_usr_nm);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 55, $upd_usr_nm, value);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 56, $upd_ts);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 56, $upd_ts, value);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 57, $upd_func_id);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 57, $upd_func_id, value);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 58, $upd_srv_req_no);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 58, $upd_srv_req_no, value);
	}

	public String getString(String name) {
		if ($purc_act_no.equalsIgnoreCase(name)) {
			return purc_act_no();
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			return trd_cd();
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			return trd_ptn_typ();
		}
		if ($slip_sts_typ.equalsIgnoreCase(name)) {
			return slip_sts_typ();
		}
		if ($po_no.equalsIgnoreCase(name)) {
			return po_no();
		}
		if ($purc_dpt_cd.equalsIgnoreCase(name)) {
			return purc_dpt_cd();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($purc_usr_cd.equalsIgnoreCase(name)) {
			return purc_usr_cd();
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			return sppl_cd();
		}
		if ($asppl_cd.equalsIgnoreCase(name)) {
			return asppl_cd();
		}
		if ($bsppl_cd.equalsIgnoreCase(name)) {
			return bsppl_cd();
		}
		if ($psppl_cd.equalsIgnoreCase(name)) {
			return psppl_cd();
		}
		if ($cred_cd.equalsIgnoreCase(name)) {
			return cred_cd();
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($ptax_cur_cd.equalsIgnoreCase(name)) {
			return ptax_cur_cd();
		}
		if ($base_cur_cd.equalsIgnoreCase(name)) {
			return base_cur_cd();
		}
		if ($xrate_cd.equalsIgnoreCase(name)) {
			return xrate_cd();
		}
		if ($rcpt_iv_no.equalsIgnoreCase(name)) {
			return rcpt_iv_no();
		}
		if ($rcpt_iv_mng_no.equalsIgnoreCase(name)) {
			return rcpt_iv_mng_no();
		}
		if ($ref_rcpt_iv_no.equalsIgnoreCase(name)) {
			return ref_rcpt_iv_no();
		}
		if ($purc_ret_act_no.equalsIgnoreCase(name)) {
			return purc_ret_act_no();
		}
		if ($tterm_cd1.equalsIgnoreCase(name)) {
			return tterm_cd1();
		}
		if ($tterm_rmrks1.equalsIgnoreCase(name)) {
			return tterm_rmrks1();
		}
		if ($tterm_cd2.equalsIgnoreCase(name)) {
			return tterm_cd2();
		}
		if ($tterm_rmrks2.equalsIgnoreCase(name)) {
			return tterm_rmrks2();
		}
		if ($tterm_cd3.equalsIgnoreCase(name)) {
			return tterm_cd3();
		}
		if ($tterm_rmrks3.equalsIgnoreCase(name)) {
			return tterm_rmrks3();
		}
		if ($trd_rmrks.equalsIgnoreCase(name)) {
			return trd_rmrks();
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			return intr_rmrks();
		}
		if ($purc_adjst_typ.equalsIgnoreCase(name)) {
			return purc_adjst_typ();
		}
		if ($adjst_mtd_typ.equalsIgnoreCase(name)) {
			return adjst_mtd_typ();
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
		if ($purc_act_seq.equalsIgnoreCase(name)) {
			return purc_act_seq();
		}
		if ($purc_act_rev.equalsIgnoreCase(name)) {
			return purc_act_rev();
		}
		if ($xrate.equalsIgnoreCase(name)) {
			return xrate();
		}
		if ($ptax_xrate.equalsIgnoreCase(name)) {
			return ptax_xrate();
		}
		if ($rcpt_iv_rev.equalsIgnoreCase(name)) {
			return rcpt_iv_rev();
		}
		if ($purc_ret_act_rev.equalsIgnoreCase(name)) {
			return purc_ret_act_rev();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumber(name);
	}

	public MCDate getDate(String name) {
		if ($purc_dt.equalsIgnoreCase(name)) {
			return purc_dt();
		}
		if ($ac_ym.equalsIgnoreCase(name)) {
			return ac_ym();
		}
		if ($ac_dt.equalsIgnoreCase(name)) {
			return ac_dt();
		}
		if ($pay_basis_dt.equalsIgnoreCase(name)) {
			return pay_basis_dt();
		}
		if ($pay_schd_dt.equalsIgnoreCase(name)) {
			return pay_schd_dt();
		}
		if ($ptax_dt.equalsIgnoreCase(name)) {
			return ptax_dt();
		}
		if ($adjst_dt.equalsIgnoreCase(name)) {
			return adjst_dt();
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
		if ($purc_adjst_flg.equalsIgnoreCase(name)) {
			return purc_adjst_flg();
		}
		if ($temp_ap_use_flg.equalsIgnoreCase(name)) {
			return temp_ap_use_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($purc_act_no.equalsIgnoreCase(name)) {
			return purc_act_no();
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			return trd_cd();
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			return trd_ptn_typ();
		}
		if ($slip_sts_typ.equalsIgnoreCase(name)) {
			return slip_sts_typ();
		}
		if ($po_no.equalsIgnoreCase(name)) {
			return po_no();
		}
		if ($purc_dpt_cd.equalsIgnoreCase(name)) {
			return purc_dpt_cd();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($purc_usr_cd.equalsIgnoreCase(name)) {
			return purc_usr_cd();
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			return sppl_cd();
		}
		if ($asppl_cd.equalsIgnoreCase(name)) {
			return asppl_cd();
		}
		if ($bsppl_cd.equalsIgnoreCase(name)) {
			return bsppl_cd();
		}
		if ($psppl_cd.equalsIgnoreCase(name)) {
			return psppl_cd();
		}
		if ($cred_cd.equalsIgnoreCase(name)) {
			return cred_cd();
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($ptax_cur_cd.equalsIgnoreCase(name)) {
			return ptax_cur_cd();
		}
		if ($base_cur_cd.equalsIgnoreCase(name)) {
			return base_cur_cd();
		}
		if ($xrate_cd.equalsIgnoreCase(name)) {
			return xrate_cd();
		}
		if ($rcpt_iv_no.equalsIgnoreCase(name)) {
			return rcpt_iv_no();
		}
		if ($rcpt_iv_mng_no.equalsIgnoreCase(name)) {
			return rcpt_iv_mng_no();
		}
		if ($ref_rcpt_iv_no.equalsIgnoreCase(name)) {
			return ref_rcpt_iv_no();
		}
		if ($purc_ret_act_no.equalsIgnoreCase(name)) {
			return purc_ret_act_no();
		}
		if ($tterm_cd1.equalsIgnoreCase(name)) {
			return tterm_cd1();
		}
		if ($tterm_rmrks1.equalsIgnoreCase(name)) {
			return tterm_rmrks1();
		}
		if ($tterm_cd2.equalsIgnoreCase(name)) {
			return tterm_cd2();
		}
		if ($tterm_rmrks2.equalsIgnoreCase(name)) {
			return tterm_rmrks2();
		}
		if ($tterm_cd3.equalsIgnoreCase(name)) {
			return tterm_cd3();
		}
		if ($tterm_rmrks3.equalsIgnoreCase(name)) {
			return tterm_rmrks3();
		}
		if ($trd_rmrks.equalsIgnoreCase(name)) {
			return trd_rmrks();
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			return intr_rmrks();
		}
		if ($purc_adjst_typ.equalsIgnoreCase(name)) {
			return purc_adjst_typ();
		}
		if ($adjst_mtd_typ.equalsIgnoreCase(name)) {
			return adjst_mtd_typ();
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
		if ($purc_act_seq.equalsIgnoreCase(name)) {
			return purc_act_seq();
		}
		if ($purc_act_rev.equalsIgnoreCase(name)) {
			return purc_act_rev();
		}
		if ($xrate.equalsIgnoreCase(name)) {
			return xrate();
		}
		if ($ptax_xrate.equalsIgnoreCase(name)) {
			return ptax_xrate();
		}
		if ($rcpt_iv_rev.equalsIgnoreCase(name)) {
			return rcpt_iv_rev();
		}
		if ($purc_ret_act_rev.equalsIgnoreCase(name)) {
			return purc_ret_act_rev();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumberNE(name);
	}

	public MCDate getDateNE(String name) {
		if ($purc_dt.equalsIgnoreCase(name)) {
			return purc_dt();
		}
		if ($ac_ym.equalsIgnoreCase(name)) {
			return ac_ym();
		}
		if ($ac_dt.equalsIgnoreCase(name)) {
			return ac_dt();
		}
		if ($pay_basis_dt.equalsIgnoreCase(name)) {
			return pay_basis_dt();
		}
		if ($pay_schd_dt.equalsIgnoreCase(name)) {
			return pay_schd_dt();
		}
		if ($ptax_dt.equalsIgnoreCase(name)) {
			return ptax_dt();
		}
		if ($adjst_dt.equalsIgnoreCase(name)) {
			return adjst_dt();
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
		if ($purc_adjst_flg.equalsIgnoreCase(name)) {
			return purc_adjst_flg();
		}
		if ($temp_ap_use_flg.equalsIgnoreCase(name)) {
			return temp_ap_use_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($purc_act_no.equalsIgnoreCase(name)) {
			purc_act_no(value);
			return;
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			trd_cd(value);
			return;
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			trd_ptn_typ(value);
			return;
		}
		if ($slip_sts_typ.equalsIgnoreCase(name)) {
			slip_sts_typ(value);
			return;
		}
		if ($po_no.equalsIgnoreCase(name)) {
			po_no(value);
			return;
		}
		if ($purc_dpt_cd.equalsIgnoreCase(name)) {
			purc_dpt_cd(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($purc_usr_cd.equalsIgnoreCase(name)) {
			purc_usr_cd(value);
			return;
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			sppl_cd(value);
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
		if ($psppl_cd.equalsIgnoreCase(name)) {
			psppl_cd(value);
			return;
		}
		if ($cred_cd.equalsIgnoreCase(name)) {
			cred_cd(value);
			return;
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			trd_cur_cd(value);
			return;
		}
		if ($ptax_cur_cd.equalsIgnoreCase(name)) {
			ptax_cur_cd(value);
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
		if ($rcpt_iv_no.equalsIgnoreCase(name)) {
			rcpt_iv_no(value);
			return;
		}
		if ($rcpt_iv_mng_no.equalsIgnoreCase(name)) {
			rcpt_iv_mng_no(value);
			return;
		}
		if ($ref_rcpt_iv_no.equalsIgnoreCase(name)) {
			ref_rcpt_iv_no(value);
			return;
		}
		if ($purc_ret_act_no.equalsIgnoreCase(name)) {
			purc_ret_act_no(value);
			return;
		}
		if ($tterm_cd1.equalsIgnoreCase(name)) {
			tterm_cd1(value);
			return;
		}
		if ($tterm_rmrks1.equalsIgnoreCase(name)) {
			tterm_rmrks1(value);
			return;
		}
		if ($tterm_cd2.equalsIgnoreCase(name)) {
			tterm_cd2(value);
			return;
		}
		if ($tterm_rmrks2.equalsIgnoreCase(name)) {
			tterm_rmrks2(value);
			return;
		}
		if ($tterm_cd3.equalsIgnoreCase(name)) {
			tterm_cd3(value);
			return;
		}
		if ($tterm_rmrks3.equalsIgnoreCase(name)) {
			tterm_rmrks3(value);
			return;
		}
		if ($trd_rmrks.equalsIgnoreCase(name)) {
			trd_rmrks(value);
			return;
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			intr_rmrks(value);
			return;
		}
		if ($purc_adjst_typ.equalsIgnoreCase(name)) {
			purc_adjst_typ(value);
			return;
		}
		if ($adjst_mtd_typ.equalsIgnoreCase(name)) {
			adjst_mtd_typ(value);
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
		if ($purc_act_seq.equalsIgnoreCase(name)) {
			purc_act_seq(value);
			return;
		}
		if ($purc_act_rev.equalsIgnoreCase(name)) {
			purc_act_rev(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($ptax_xrate.equalsIgnoreCase(name)) {
			ptax_xrate(value);
			return;
		}
		if ($rcpt_iv_rev.equalsIgnoreCase(name)) {
			rcpt_iv_rev(value);
			return;
		}
		if ($purc_ret_act_rev.equalsIgnoreCase(name)) {
			purc_ret_act_rev(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, int value) {
		if ($purc_act_seq.equalsIgnoreCase(name)) {
			purc_act_seq(value);
			return;
		}
		if ($purc_act_rev.equalsIgnoreCase(name)) {
			purc_act_rev(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($ptax_xrate.equalsIgnoreCase(name)) {
			ptax_xrate(value);
			return;
		}
		if ($rcpt_iv_rev.equalsIgnoreCase(name)) {
			rcpt_iv_rev(value);
			return;
		}
		if ($purc_ret_act_rev.equalsIgnoreCase(name)) {
			purc_ret_act_rev(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, long value) {
		if ($purc_act_seq.equalsIgnoreCase(name)) {
			purc_act_seq(value);
			return;
		}
		if ($purc_act_rev.equalsIgnoreCase(name)) {
			purc_act_rev(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($ptax_xrate.equalsIgnoreCase(name)) {
			ptax_xrate(value);
			return;
		}
		if ($rcpt_iv_rev.equalsIgnoreCase(name)) {
			rcpt_iv_rev(value);
			return;
		}
		if ($purc_ret_act_rev.equalsIgnoreCase(name)) {
			purc_ret_act_rev(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, float value) {
		if ($purc_act_seq.equalsIgnoreCase(name)) {
			purc_act_seq(value);
			return;
		}
		if ($purc_act_rev.equalsIgnoreCase(name)) {
			purc_act_rev(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($ptax_xrate.equalsIgnoreCase(name)) {
			ptax_xrate(value);
			return;
		}
		if ($rcpt_iv_rev.equalsIgnoreCase(name)) {
			rcpt_iv_rev(value);
			return;
		}
		if ($purc_ret_act_rev.equalsIgnoreCase(name)) {
			purc_ret_act_rev(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, double value) {
		if ($purc_act_seq.equalsIgnoreCase(name)) {
			purc_act_seq(value);
			return;
		}
		if ($purc_act_rev.equalsIgnoreCase(name)) {
			purc_act_rev(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($ptax_xrate.equalsIgnoreCase(name)) {
			ptax_xrate(value);
			return;
		}
		if ($rcpt_iv_rev.equalsIgnoreCase(name)) {
			rcpt_iv_rev(value);
			return;
		}
		if ($purc_ret_act_rev.equalsIgnoreCase(name)) {
			purc_ret_act_rev(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setDate(String name, MCDate value) {
		if ($purc_dt.equalsIgnoreCase(name)) {
			purc_dt(value);
			return;
		}
		if ($ac_ym.equalsIgnoreCase(name)) {
			ac_ym(value);
			return;
		}
		if ($ac_dt.equalsIgnoreCase(name)) {
			ac_dt(value);
			return;
		}
		if ($pay_basis_dt.equalsIgnoreCase(name)) {
			pay_basis_dt(value);
			return;
		}
		if ($pay_schd_dt.equalsIgnoreCase(name)) {
			pay_schd_dt(value);
			return;
		}
		if ($ptax_dt.equalsIgnoreCase(name)) {
			ptax_dt(value);
			return;
		}
		if ($adjst_dt.equalsIgnoreCase(name)) {
			adjst_dt(value);
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
		if ($purc_adjst_flg.equalsIgnoreCase(name)) {
			purc_adjst_flg(value);
			return;
		}
		if ($temp_ap_use_flg.equalsIgnoreCase(name)) {
			temp_ap_use_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($purc_act_no.equalsIgnoreCase(name)) {
			purc_act_no(value);
			return;
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			trd_cd(value);
			return;
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			trd_ptn_typ(value);
			return;
		}
		if ($slip_sts_typ.equalsIgnoreCase(name)) {
			slip_sts_typ(value);
			return;
		}
		if ($po_no.equalsIgnoreCase(name)) {
			po_no(value);
			return;
		}
		if ($purc_dpt_cd.equalsIgnoreCase(name)) {
			purc_dpt_cd(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($purc_usr_cd.equalsIgnoreCase(name)) {
			purc_usr_cd(value);
			return;
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			sppl_cd(value);
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
		if ($psppl_cd.equalsIgnoreCase(name)) {
			psppl_cd(value);
			return;
		}
		if ($cred_cd.equalsIgnoreCase(name)) {
			cred_cd(value);
			return;
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			trd_cur_cd(value);
			return;
		}
		if ($ptax_cur_cd.equalsIgnoreCase(name)) {
			ptax_cur_cd(value);
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
		if ($rcpt_iv_no.equalsIgnoreCase(name)) {
			rcpt_iv_no(value);
			return;
		}
		if ($rcpt_iv_mng_no.equalsIgnoreCase(name)) {
			rcpt_iv_mng_no(value);
			return;
		}
		if ($ref_rcpt_iv_no.equalsIgnoreCase(name)) {
			ref_rcpt_iv_no(value);
			return;
		}
		if ($purc_ret_act_no.equalsIgnoreCase(name)) {
			purc_ret_act_no(value);
			return;
		}
		if ($tterm_cd1.equalsIgnoreCase(name)) {
			tterm_cd1(value);
			return;
		}
		if ($tterm_rmrks1.equalsIgnoreCase(name)) {
			tterm_rmrks1(value);
			return;
		}
		if ($tterm_cd2.equalsIgnoreCase(name)) {
			tterm_cd2(value);
			return;
		}
		if ($tterm_rmrks2.equalsIgnoreCase(name)) {
			tterm_rmrks2(value);
			return;
		}
		if ($tterm_cd3.equalsIgnoreCase(name)) {
			tterm_cd3(value);
			return;
		}
		if ($tterm_rmrks3.equalsIgnoreCase(name)) {
			tterm_rmrks3(value);
			return;
		}
		if ($trd_rmrks.equalsIgnoreCase(name)) {
			trd_rmrks(value);
			return;
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			intr_rmrks(value);
			return;
		}
		if ($purc_adjst_typ.equalsIgnoreCase(name)) {
			purc_adjst_typ(value);
			return;
		}
		if ($adjst_mtd_typ.equalsIgnoreCase(name)) {
			adjst_mtd_typ(value);
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
		if ($purc_act_seq.equalsIgnoreCase(name)) {
			purc_act_seq(value);
			return;
		}
		if ($purc_act_rev.equalsIgnoreCase(name)) {
			purc_act_rev(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($ptax_xrate.equalsIgnoreCase(name)) {
			ptax_xrate(value);
			return;
		}
		if ($rcpt_iv_rev.equalsIgnoreCase(name)) {
			rcpt_iv_rev(value);
			return;
		}
		if ($purc_ret_act_rev.equalsIgnoreCase(name)) {
			purc_ret_act_rev(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, int value) {
		if ($purc_act_seq.equalsIgnoreCase(name)) {
			purc_act_seq(value);
			return;
		}
		if ($purc_act_rev.equalsIgnoreCase(name)) {
			purc_act_rev(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($ptax_xrate.equalsIgnoreCase(name)) {
			ptax_xrate(value);
			return;
		}
		if ($rcpt_iv_rev.equalsIgnoreCase(name)) {
			rcpt_iv_rev(value);
			return;
		}
		if ($purc_ret_act_rev.equalsIgnoreCase(name)) {
			purc_ret_act_rev(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, long value) {
		if ($purc_act_seq.equalsIgnoreCase(name)) {
			purc_act_seq(value);
			return;
		}
		if ($purc_act_rev.equalsIgnoreCase(name)) {
			purc_act_rev(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($ptax_xrate.equalsIgnoreCase(name)) {
			ptax_xrate(value);
			return;
		}
		if ($rcpt_iv_rev.equalsIgnoreCase(name)) {
			rcpt_iv_rev(value);
			return;
		}
		if ($purc_ret_act_rev.equalsIgnoreCase(name)) {
			purc_ret_act_rev(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, float value) {
		if ($purc_act_seq.equalsIgnoreCase(name)) {
			purc_act_seq(value);
			return;
		}
		if ($purc_act_rev.equalsIgnoreCase(name)) {
			purc_act_rev(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($ptax_xrate.equalsIgnoreCase(name)) {
			ptax_xrate(value);
			return;
		}
		if ($rcpt_iv_rev.equalsIgnoreCase(name)) {
			rcpt_iv_rev(value);
			return;
		}
		if ($purc_ret_act_rev.equalsIgnoreCase(name)) {
			purc_ret_act_rev(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, double value) {
		if ($purc_act_seq.equalsIgnoreCase(name)) {
			purc_act_seq(value);
			return;
		}
		if ($purc_act_rev.equalsIgnoreCase(name)) {
			purc_act_rev(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($ptax_xrate.equalsIgnoreCase(name)) {
			ptax_xrate(value);
			return;
		}
		if ($rcpt_iv_rev.equalsIgnoreCase(name)) {
			rcpt_iv_rev(value);
			return;
		}
		if ($purc_ret_act_rev.equalsIgnoreCase(name)) {
			purc_ret_act_rev(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setDateNE(String name, MCDate value) {
		if ($purc_dt.equalsIgnoreCase(name)) {
			purc_dt(value);
			return;
		}
		if ($ac_ym.equalsIgnoreCase(name)) {
			ac_ym(value);
			return;
		}
		if ($ac_dt.equalsIgnoreCase(name)) {
			ac_dt(value);
			return;
		}
		if ($pay_basis_dt.equalsIgnoreCase(name)) {
			pay_basis_dt(value);
			return;
		}
		if ($pay_schd_dt.equalsIgnoreCase(name)) {
			pay_schd_dt(value);
			return;
		}
		if ($ptax_dt.equalsIgnoreCase(name)) {
			ptax_dt(value);
			return;
		}
		if ($adjst_dt.equalsIgnoreCase(name)) {
			adjst_dt(value);
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
		if ($purc_adjst_flg.equalsIgnoreCase(name)) {
			purc_adjst_flg(value);
			return;
		}
		if ($temp_ap_use_flg.equalsIgnoreCase(name)) {
			temp_ap_use_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

}
