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
 * "入金受信ＩＦ // Payment received import IF"DBコンテナRowクラスです。<p>
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
 *  	<td>data_lno</td>
 *  	<td>N</td>
 *  	<td>15,0</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>データ行ＮＯ</td>
 *  	<td>Data row No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>data_no</td>
 *  	<td>N</td>
 *  	<td>15,0</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>データＮＯ</td>
 *  	<td>Data No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>data_crud_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>データ更新区分</td>
 *  	<td>Data update type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>exe_sts_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>ＰＧ実行状況区分</td>
 *  	<td>PG execution status type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ext_sys_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>外部システムＣＤ</td>
 *  	<td>External system cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ext_data_no</td>
 *  	<td>N</td>
 *  	<td>15,0</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>外部システムデータＮＯ</td>
 *  	<td>External system data No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ext_data_lno</td>
 *  	<td>N</td>
 *  	<td>15,0</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>外部システムデータ行ＮＯ</td>
 *  	<td>External system data row No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>data_make_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>送信元レコード作成日時</td>
 *  	<td>Creation date and time of source record</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>imp_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>取込対象ＦＬＧ</td>
 *  	<td>To import flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>recv_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>受信日</td>
 *  	<td>Receiving date</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ext_rcv_no</td>
 *  	<td>C</td>
 *  	<td>300</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>外部入金ＮＯ</td>
 *  	<td>External payment received No.</td>
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
 *  	<td>if_rcst_cd</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ入金先ＣＤ</td>
 *  	<td>IF payer cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>if_rcst_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ入金先名</td>
 *  	<td>IF payer name</td>
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
 *  	<td>if_bcst_cd</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ請求先ＣＤ</td>
 *  	<td>IF billing customer cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>if_bcst_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ請求先名</td>
 *  	<td>IF billing customer name</td>
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
 *  	<td>if_bill_dpt_cd</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ請求部門ＣＤ</td>
 *  	<td>IF billing dept. cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>if_bill_dpt_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ請求部門名</td>
 *  	<td>IF billing dept. name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>rcv_dpt_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>入金部門ＣＤ</td>
 *  	<td>Payment receiving dept. cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>if_rcv_dpt_cd</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ入金部門ＣＤ</td>
 *  	<td>IF payment receiving dept. cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>if_rcv_dpt_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ入金部門名</td>
 *  	<td>IF payment receiving dept. name</td>
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
 *  	<td>if_rcv_usr_cd</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ入金担当者ＣＤ</td>
 *  	<td>IF payment received PIC cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>if_rcv_usr_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ入金担当者名</td>
 *  	<td>IF payment received PIC name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>rcv_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>入金日</td>
 *  	<td>Payment received date</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ar_sttl_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>債権決済区分</td>
 *  	<td>AR settlement type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>bank_cd</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>銀行ＣＤ</td>
 *  	<td>Bank cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>if_bank_cd</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ銀行ＣＤ</td>
 *  	<td>IF bank cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>if_bank_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ銀行名</td>
 *  	<td>IF bank name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>rcv_mtd_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>入金方法ＣＤ</td>
 *  	<td>Payment received method cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>if_rcv_mtd_cd</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ入金方法ＣＤ</td>
 *  	<td>IF payment received method cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>if_rcv_mtd_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ入金方法名</td>
 *  	<td>IF payment received method name</td>
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
 *  	<td>if_bank_ac_cd</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ口座ＣＤ</td>
 *  	<td>IF bank account cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>if_bank_ac_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ口座名</td>
 *  	<td>IF bank account name</td>
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
 *  	<td>trd_cur_cd</td>
 *  	<td>C</td>
 *  	<td>3</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引通貨ＣＤ</td>
 *  	<td>Transaction currency cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>if_trd_cur_cd</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ取引通貨ＣＤ</td>
 *  	<td>IF transaction currency cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>if_trd_cur_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ取引通貨名</td>
 *  	<td>IF transaction currency name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>xrate</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>為替レート</td>
 *  	<td>Exchange rate</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>rcv_amt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>入金額</td>
 *  	<td>Payment received amount</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>com_paid</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>振込手数料</td>
 *  	<td>Transfer fee</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>rcv_rmrks</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>入金備考</td>
 *  	<td>Payment received remarks</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>note_no</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>手形番号</td>
 *  	<td>Note number</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>note_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>手形区分</td>
 *  	<td>Note type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>draw_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>振出日</td>
 *  	<td>Drawing date</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>due_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>支払期日</td>
 *  	<td>Payment due date</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>drawer_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>振出人名</td>
 *  	<td>Drawer name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>endrsr</td>
 *  	<td>C</td>
 *  	<td>30</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>裏書人</td>
 *  	<td>Endorser</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>accptr</td>
 *  	<td>C</td>
 *  	<td>30</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>引受人</td>
 *  	<td>Accepted by</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>note_rsn_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>手形理由ＣＤ</td>
 *  	<td>Note reason cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>if_note_rsn_cd</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ手形理由ＣＤ</td>
 *  	<td>IF note reason cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>if_note_rsn_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ手形理由名</td>
 *  	<td>IF note reason name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>draw_bank_cd</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>振出銀行</td>
 *  	<td>Drawing bank</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>if_draw_bank_cd</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ振出銀行ＣＤ</td>
 *  	<td>IF drawing bank cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>if_draw_bank_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ振出銀行名</td>
 *  	<td>IF drawing bank name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>draw_branch_cd</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>振出支店</td>
 *  	<td>Drawing branch</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>if_draw_branch_cd</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ振出支店ＣＤ</td>
 *  	<td>IF drawing branch cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>if_draw_branch_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ振出支店名</td>
 *  	<td>IF drawing branch name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>if_co_cd</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ会社ＣＤ</td>
 *  	<td>IF company cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>if_co_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ会社名</td>
 *  	<td>IF company name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sub_char1</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＣＨＡＲ項目１</td>
 *  	<td>Spare CHAR column 1</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sub_char2</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＣＨＡＲ項目２</td>
 *  	<td>Spare CHAR column 2</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sub_char3</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＣＨＡＲ項目３</td>
 *  	<td>Spare CHAR column 3</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sub_char4</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＣＨＡＲ項目４</td>
 *  	<td>Spare CHAR column 4</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sub_char5</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＣＨＡＲ項目５</td>
 *  	<td>Spare CHAR column 5</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sub_char6</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＣＨＡＲ項目６</td>
 *  	<td>Spare CHAR column 6</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sub_char7</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＣＨＡＲ項目７</td>
 *  	<td>Spare CHAR column 7</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sub_char8</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＣＨＡＲ項目８</td>
 *  	<td>Spare CHAR column 8</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sub_char9</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＣＨＡＲ項目９</td>
 *  	<td>Spare CHAR column 9</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sub_char10</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＣＨＡＲ項目１０</td>
 *  	<td>Spare CHAR column 10</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sub_char11</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＣＨＡＲ項目１１</td>
 *  	<td>Spare CHAR column 11</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sub_char12</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＣＨＡＲ項目１２</td>
 *  	<td>Spare CHAR column 12</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sub_char13</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＣＨＡＲ項目１３</td>
 *  	<td>Spare CHAR column 13</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sub_char14</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＣＨＡＲ項目１４</td>
 *  	<td>Spare CHAR column 14</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sub_char15</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＣＨＡＲ項目１５</td>
 *  	<td>Spare CHAR column 15</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sub_char16</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＣＨＡＲ項目１６</td>
 *  	<td>Spare CHAR column 16</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sub_char17</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＣＨＡＲ項目１７</td>
 *  	<td>Spare CHAR column 17</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sub_char18</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＣＨＡＲ項目１８</td>
 *  	<td>Spare CHAR column 18</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sub_char19</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＣＨＡＲ項目１９</td>
 *  	<td>Spare CHAR column 19</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sub_char20</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＣＨＡＲ項目２０</td>
 *  	<td>Spare CHAR column 20</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sub_char21</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＣＨＡＲ項目２１</td>
 *  	<td>Spare CHAR column 21</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sub_char22</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＣＨＡＲ項目２２</td>
 *  	<td>Spare CHAR column 22</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sub_char23</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＣＨＡＲ項目２３</td>
 *  	<td>Spare CHAR column 23</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sub_char24</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＣＨＡＲ項目２４</td>
 *  	<td>Spare CHAR column 24</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sub_char25</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＣＨＡＲ項目２５</td>
 *  	<td>Spare CHAR column 25</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sub_char26</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＣＨＡＲ項目２６</td>
 *  	<td>Spare CHAR column 26</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sub_char27</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＣＨＡＲ項目２７</td>
 *  	<td>Spare CHAR column 27</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sub_char28</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＣＨＡＲ項目２８</td>
 *  	<td>Spare CHAR column 28</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sub_char29</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＣＨＡＲ項目２９</td>
 *  	<td>Spare CHAR column 29</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sub_char30</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＣＨＡＲ項目３０</td>
 *  	<td>Spare CHAR column 30</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sub_num1</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＮＵＭ項目１</td>
 *  	<td>Spare NUM column 1</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sub_num2</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＮＵＭ項目２</td>
 *  	<td>Spare NUM column 2</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sub_num3</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＮＵＭ項目３</td>
 *  	<td>Spare NUM column 3</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sub_num4</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＮＵＭ項目４</td>
 *  	<td>Spare NUM column 4</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sub_num5</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＮＵＭ項目５</td>
 *  	<td>Spare NUM column 5</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sub_dt1</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＤＡＴＥ項目１</td>
 *  	<td>Spare DATE column 1</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sub_dt2</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＤＡＴＥ項目２</td>
 *  	<td>Spare DATE column 2</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sub_dt3</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＤＡＴＥ項目３</td>
 *  	<td>Spare DATE column 3</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sub_dt4</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＤＡＴＥ項目４</td>
 *  	<td>Spare DATE column 4</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sub_dt5</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＤＡＴＥ項目５</td>
 *  	<td>Spare DATE column 5</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>batch_log_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
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
 *  	<td>sdrv_sts_typ</td>
 *  	<td>C</td>
 *  	<td>2</td>
 *  	<td>Y</td>
 *  	<td>SDRV.SDRV_STS_TYP</td>
 *  	<td>送受信状況区分</td>
 *  	<td>Exporting and importing status type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>rcst_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>入金先名</td>
 *  	<td>Payer name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>bcst_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>請求先名</td>
 *  	<td>Billing customer name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>bill_dpt_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>請求部門名</td>
 *  	<td>Billing dept. name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>rcv_dpt_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>入金部門名</td>
 *  	<td>Payment receiving dept. name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>rcv_usr_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>入金担当者名</td>
 *  	<td>Payment received PIC name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>bank_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>銀行名</td>
 *  	<td>Bank name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>rcv_mtd_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>入金方法名</td>
 *  	<td>Payment received method name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>bank_ac_nm</td>
 *  	<td>C</td>
 *  	<td>60</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>口座名</td>
 *  	<td>Bank account name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>trd_cur_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引通貨名</td>
 *  	<td>Transaction currency name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>note_rsn_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>手形理由名</td>
 *  	<td>Note reason name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>draw_bank_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>振出銀行名</td>
 *  	<td>Drawing bank name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>draw_branch_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>振出支店名</td>
 *  	<td>Drawing branch name</td>
 *  </tr>
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
public class MST_RCV_RECV_IF_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.CO_VIEW;

	public static final String TABLE_NAME = "MST_RCV_RECV_IF";

	public static final boolean EX_CTRL = true;
	
	public static final boolean LCL_TABLE = false;
	
	/**
	 * データ行ＮＯ. Data row No..<p>
	 *
	 */
	public static final String $data_lno = "data_lno";
	private static final MCPermColumnInfo _data_lno = createColumnInfo("data_lno");
	public final MCNumberPermColumn data_lno = createNumberColumn(_data_lno);
	
	/**
	 * データＮＯ. Data No..<p>
	 *
	 */
	public static final String $data_no = "data_no";
	private static final MCPermColumnInfo _data_no = createColumnInfo("data_no");
	public final MCNumberPermColumn data_no = createNumberColumn(_data_no);
	
	/**
	 * データ更新区分. Data update type.<p>
	 *
	 */
	public static final String $data_crud_typ = "data_crud_typ";
	private static final MCPermColumnInfo _data_crud_typ = createColumnInfo("data_crud_typ");
	public final MCStringPermColumn data_crud_typ = createStringColumn(_data_crud_typ);
	
	/**
	 * ＰＧ実行状況区分. PG execution status type.<p>
	 *
	 */
	public static final String $exe_sts_typ = "exe_sts_typ";
	private static final MCPermColumnInfo _exe_sts_typ = createColumnInfo("exe_sts_typ");
	public final MCStringPermColumn exe_sts_typ = createStringColumn(_exe_sts_typ);
	
	/**
	 * 外部システムＣＤ. External system cd..<p>
	 *
	 */
	public static final String $ext_sys_cd = "ext_sys_cd";
	private static final MCPermColumnInfo _ext_sys_cd = createColumnInfo("ext_sys_cd");
	public final MCStringPermColumn ext_sys_cd = createStringColumn(_ext_sys_cd);
	
	/**
	 * 外部システムデータＮＯ. External system data No..<p>
	 *
	 */
	public static final String $ext_data_no = "ext_data_no";
	private static final MCPermColumnInfo _ext_data_no = createColumnInfo("ext_data_no");
	public final MCNumberPermColumn ext_data_no = createNumberColumn(_ext_data_no);
	
	/**
	 * 外部システムデータ行ＮＯ. External system data row No..<p>
	 *
	 */
	public static final String $ext_data_lno = "ext_data_lno";
	private static final MCPermColumnInfo _ext_data_lno = createColumnInfo("ext_data_lno");
	public final MCNumberPermColumn ext_data_lno = createNumberColumn(_ext_data_lno);
	
	/**
	 * 送信元レコード作成日時. Creation date and time of source record.<p>
	 *
	 */
	public static final String $data_make_dt = "data_make_dt";
	private static final MCPermColumnInfo _data_make_dt = createColumnInfo("data_make_dt");
	public final MCDatePermColumn data_make_dt = createDateColumn(_data_make_dt);
	
	/**
	 * 取込対象ＦＬＧ. To import flg..<p>
	 *
	 */
	public static final String $imp_flg = "imp_flg";
	private static final MCPermColumnInfo _imp_flg = createColumnInfo("imp_flg");
	public final MCBooleanPermColumn imp_flg = createBooleanColumn(_imp_flg);
	
	/**
	 * 受信日. Receiving date.<p>
	 *
	 */
	public static final String $recv_dt = "recv_dt";
	private static final MCPermColumnInfo _recv_dt = createColumnInfo("recv_dt");
	public final MCDatePermColumn recv_dt = createDateColumn(_recv_dt);
	
	/**
	 * 外部入金ＮＯ. External payment received No..<p>
	 *
	 */
	public static final String $ext_rcv_no = "ext_rcv_no";
	private static final MCPermColumnInfo _ext_rcv_no = createColumnInfo("ext_rcv_no");
	public final MCStringPermColumn ext_rcv_no = createStringColumn(_ext_rcv_no);
	
	/**
	 * 入金先ＣＤ. Payer cd..<p>
	 *
	 */
	public static final String $rcst_cd = "rcst_cd";
	private static final MCPermColumnInfo _rcst_cd = createColumnInfo("rcst_cd");
	public final MCStringPermColumn rcst_cd = createStringColumn(_rcst_cd);
	
	/**
	 * ＩＦ入金先ＣＤ. IF payer cd..<p>
	 *
	 */
	public static final String $if_rcst_cd = "if_rcst_cd";
	private static final MCPermColumnInfo _if_rcst_cd = createColumnInfo("if_rcst_cd");
	public final MCStringPermColumn if_rcst_cd = createStringColumn(_if_rcst_cd);
	
	/**
	 * ＩＦ入金先名. IF payer name.<p>
	 *
	 */
	public static final String $if_rcst_nm = "if_rcst_nm";
	private static final MCPermColumnInfo _if_rcst_nm = createColumnInfo("if_rcst_nm");
	public final MCStringPermColumn if_rcst_nm = createStringColumn(_if_rcst_nm);
	
	/**
	 * 請求先ＣＤ. Billing customer cd..<p>
	 *
	 */
	public static final String $bcst_cd = "bcst_cd";
	private static final MCPermColumnInfo _bcst_cd = createColumnInfo("bcst_cd");
	public final MCStringPermColumn bcst_cd = createStringColumn(_bcst_cd);
	
	/**
	 * ＩＦ請求先ＣＤ. IF billing customer cd..<p>
	 *
	 */
	public static final String $if_bcst_cd = "if_bcst_cd";
	private static final MCPermColumnInfo _if_bcst_cd = createColumnInfo("if_bcst_cd");
	public final MCStringPermColumn if_bcst_cd = createStringColumn(_if_bcst_cd);
	
	/**
	 * ＩＦ請求先名. IF billing customer name.<p>
	 *
	 */
	public static final String $if_bcst_nm = "if_bcst_nm";
	private static final MCPermColumnInfo _if_bcst_nm = createColumnInfo("if_bcst_nm");
	public final MCStringPermColumn if_bcst_nm = createStringColumn(_if_bcst_nm);
	
	/**
	 * 請求部門ＣＤ. Billing dept. cd..<p>
	 *
	 */
	public static final String $bill_dpt_cd = "bill_dpt_cd";
	private static final MCPermColumnInfo _bill_dpt_cd = createColumnInfo("bill_dpt_cd");
	public final MCStringPermColumn bill_dpt_cd = createStringColumn(_bill_dpt_cd);
	
	/**
	 * ＩＦ請求部門ＣＤ. IF billing dept. cd..<p>
	 *
	 */
	public static final String $if_bill_dpt_cd = "if_bill_dpt_cd";
	private static final MCPermColumnInfo _if_bill_dpt_cd = createColumnInfo("if_bill_dpt_cd");
	public final MCStringPermColumn if_bill_dpt_cd = createStringColumn(_if_bill_dpt_cd);
	
	/**
	 * ＩＦ請求部門名. IF billing dept. name.<p>
	 *
	 */
	public static final String $if_bill_dpt_nm = "if_bill_dpt_nm";
	private static final MCPermColumnInfo _if_bill_dpt_nm = createColumnInfo("if_bill_dpt_nm");
	public final MCStringPermColumn if_bill_dpt_nm = createStringColumn(_if_bill_dpt_nm);
	
	/**
	 * 入金部門ＣＤ. Payment receiving dept. cd..<p>
	 *
	 */
	public static final String $rcv_dpt_cd = "rcv_dpt_cd";
	private static final MCPermColumnInfo _rcv_dpt_cd = createColumnInfo("rcv_dpt_cd");
	public final MCStringPermColumn rcv_dpt_cd = createStringColumn(_rcv_dpt_cd);
	
	/**
	 * ＩＦ入金部門ＣＤ. IF payment receiving dept. cd..<p>
	 *
	 */
	public static final String $if_rcv_dpt_cd = "if_rcv_dpt_cd";
	private static final MCPermColumnInfo _if_rcv_dpt_cd = createColumnInfo("if_rcv_dpt_cd");
	public final MCStringPermColumn if_rcv_dpt_cd = createStringColumn(_if_rcv_dpt_cd);
	
	/**
	 * ＩＦ入金部門名. IF payment receiving dept. name.<p>
	 *
	 */
	public static final String $if_rcv_dpt_nm = "if_rcv_dpt_nm";
	private static final MCPermColumnInfo _if_rcv_dpt_nm = createColumnInfo("if_rcv_dpt_nm");
	public final MCStringPermColumn if_rcv_dpt_nm = createStringColumn(_if_rcv_dpt_nm);
	
	/**
	 * 入金担当者ＣＤ. Payment received PIC cd..<p>
	 *
	 */
	public static final String $rcv_usr_cd = "rcv_usr_cd";
	private static final MCPermColumnInfo _rcv_usr_cd = createColumnInfo("rcv_usr_cd");
	public final MCStringPermColumn rcv_usr_cd = createStringColumn(_rcv_usr_cd);
	
	/**
	 * ＩＦ入金担当者ＣＤ. IF payment received PIC cd..<p>
	 *
	 */
	public static final String $if_rcv_usr_cd = "if_rcv_usr_cd";
	private static final MCPermColumnInfo _if_rcv_usr_cd = createColumnInfo("if_rcv_usr_cd");
	public final MCStringPermColumn if_rcv_usr_cd = createStringColumn(_if_rcv_usr_cd);
	
	/**
	 * ＩＦ入金担当者名. IF payment received PIC name.<p>
	 *
	 */
	public static final String $if_rcv_usr_nm = "if_rcv_usr_nm";
	private static final MCPermColumnInfo _if_rcv_usr_nm = createColumnInfo("if_rcv_usr_nm");
	public final MCStringPermColumn if_rcv_usr_nm = createStringColumn(_if_rcv_usr_nm);
	
	/**
	 * 入金日. Payment received date.<p>
	 *
	 */
	public static final String $rcv_dt = "rcv_dt";
	private static final MCPermColumnInfo _rcv_dt = createColumnInfo("rcv_dt");
	public final MCDatePermColumn rcv_dt = createDateColumn(_rcv_dt);
	
	/**
	 * 債権決済区分. AR settlement type.<p>
	 *
	 */
	public static final String $ar_sttl_typ = "ar_sttl_typ";
	private static final MCPermColumnInfo _ar_sttl_typ = createColumnInfo("ar_sttl_typ");
	public final MCStringPermColumn ar_sttl_typ = createStringColumn(_ar_sttl_typ);
	
	/**
	 * 銀行ＣＤ. Bank cd..<p>
	 *
	 */
	public static final String $bank_cd = "bank_cd";
	private static final MCPermColumnInfo _bank_cd = createColumnInfo("bank_cd");
	public final MCStringPermColumn bank_cd = createStringColumn(_bank_cd);
	
	/**
	 * ＩＦ銀行ＣＤ. IF bank cd..<p>
	 *
	 */
	public static final String $if_bank_cd = "if_bank_cd";
	private static final MCPermColumnInfo _if_bank_cd = createColumnInfo("if_bank_cd");
	public final MCStringPermColumn if_bank_cd = createStringColumn(_if_bank_cd);
	
	/**
	 * ＩＦ銀行名. IF bank name.<p>
	 *
	 */
	public static final String $if_bank_nm = "if_bank_nm";
	private static final MCPermColumnInfo _if_bank_nm = createColumnInfo("if_bank_nm");
	public final MCStringPermColumn if_bank_nm = createStringColumn(_if_bank_nm);
	
	/**
	 * 入金方法ＣＤ. Payment received method cd..<p>
	 *
	 */
	public static final String $rcv_mtd_cd = "rcv_mtd_cd";
	private static final MCPermColumnInfo _rcv_mtd_cd = createColumnInfo("rcv_mtd_cd");
	public final MCStringPermColumn rcv_mtd_cd = createStringColumn(_rcv_mtd_cd);
	
	/**
	 * ＩＦ入金方法ＣＤ. IF payment received method cd..<p>
	 *
	 */
	public static final String $if_rcv_mtd_cd = "if_rcv_mtd_cd";
	private static final MCPermColumnInfo _if_rcv_mtd_cd = createColumnInfo("if_rcv_mtd_cd");
	public final MCStringPermColumn if_rcv_mtd_cd = createStringColumn(_if_rcv_mtd_cd);
	
	/**
	 * ＩＦ入金方法名. IF payment received method name.<p>
	 *
	 */
	public static final String $if_rcv_mtd_nm = "if_rcv_mtd_nm";
	private static final MCPermColumnInfo _if_rcv_mtd_nm = createColumnInfo("if_rcv_mtd_nm");
	public final MCStringPermColumn if_rcv_mtd_nm = createStringColumn(_if_rcv_mtd_nm);
	
	/**
	 * 口座ＣＤ. Bank account cd..<p>
	 *
	 */
	public static final String $bank_ac_cd = "bank_ac_cd";
	private static final MCPermColumnInfo _bank_ac_cd = createColumnInfo("bank_ac_cd");
	public final MCStringPermColumn bank_ac_cd = createStringColumn(_bank_ac_cd);
	
	/**
	 * ＩＦ口座ＣＤ. IF bank account cd..<p>
	 *
	 */
	public static final String $if_bank_ac_cd = "if_bank_ac_cd";
	private static final MCPermColumnInfo _if_bank_ac_cd = createColumnInfo("if_bank_ac_cd");
	public final MCStringPermColumn if_bank_ac_cd = createStringColumn(_if_bank_ac_cd);
	
	/**
	 * ＩＦ口座名. IF bank account name.<p>
	 *
	 */
	public static final String $if_bank_ac_nm = "if_bank_ac_nm";
	private static final MCPermColumnInfo _if_bank_ac_nm = createColumnInfo("if_bank_ac_nm");
	public final MCStringPermColumn if_bank_ac_nm = createStringColumn(_if_bank_ac_nm);
	
	/**
	 * 振込人名. Payment person name.<p>
	 *
	 */
	public static final String $xfr_psn = "xfr_psn";
	private static final MCPermColumnInfo _xfr_psn = createColumnInfo("xfr_psn");
	public final MCStringPermColumn xfr_psn = createStringColumn(_xfr_psn);
	
	/**
	 * 取引通貨ＣＤ. Transaction currency cd..<p>
	 *
	 */
	public static final String $trd_cur_cd = "trd_cur_cd";
	private static final MCPermColumnInfo _trd_cur_cd = createColumnInfo("trd_cur_cd");
	public final MCStringPermColumn trd_cur_cd = createStringColumn(_trd_cur_cd);
	
	/**
	 * ＩＦ取引通貨ＣＤ. IF transaction currency cd..<p>
	 *
	 */
	public static final String $if_trd_cur_cd = "if_trd_cur_cd";
	private static final MCPermColumnInfo _if_trd_cur_cd = createColumnInfo("if_trd_cur_cd");
	public final MCStringPermColumn if_trd_cur_cd = createStringColumn(_if_trd_cur_cd);
	
	/**
	 * ＩＦ取引通貨名. IF transaction currency name.<p>
	 *
	 */
	public static final String $if_trd_cur_nm = "if_trd_cur_nm";
	private static final MCPermColumnInfo _if_trd_cur_nm = createColumnInfo("if_trd_cur_nm");
	public final MCStringPermColumn if_trd_cur_nm = createStringColumn(_if_trd_cur_nm);
	
	/**
	 * 為替レート. Exchange rate.<p>
	 *
	 */
	public static final String $xrate = "xrate";
	private static final MCPermColumnInfo _xrate = createColumnInfo("xrate");
	public final MCNumberPermColumn xrate = createNumberColumn(_xrate);
	
	/**
	 * 入金額. Payment received amount.<p>
	 *
	 */
	public static final String $rcv_amt = "rcv_amt";
	private static final MCPermColumnInfo _rcv_amt = createColumnInfo("rcv_amt");
	public final MCNumberPermColumn rcv_amt = createNumberColumn(_rcv_amt);
	
	/**
	 * 振込手数料. Transfer fee.<p>
	 *
	 */
	public static final String $com_paid = "com_paid";
	private static final MCPermColumnInfo _com_paid = createColumnInfo("com_paid");
	public final MCNumberPermColumn com_paid = createNumberColumn(_com_paid);
	
	/**
	 * 入金備考. Payment received remarks.<p>
	 *
	 */
	public static final String $rcv_rmrks = "rcv_rmrks";
	private static final MCPermColumnInfo _rcv_rmrks = createColumnInfo("rcv_rmrks");
	public final MCStringPermColumn rcv_rmrks = createStringColumn(_rcv_rmrks);
	
	/**
	 * 手形番号. Note number.<p>
	 *
	 */
	public static final String $note_no = "note_no";
	private static final MCPermColumnInfo _note_no = createColumnInfo("note_no");
	public final MCStringPermColumn note_no = createStringColumn(_note_no);
	
	/**
	 * 手形区分. Note type.<p>
	 *
	 */
	public static final String $note_typ = "note_typ";
	private static final MCPermColumnInfo _note_typ = createColumnInfo("note_typ");
	public final MCStringPermColumn note_typ = createStringColumn(_note_typ);
	
	/**
	 * 振出日. Drawing date.<p>
	 *
	 */
	public static final String $draw_dt = "draw_dt";
	private static final MCPermColumnInfo _draw_dt = createColumnInfo("draw_dt");
	public final MCDatePermColumn draw_dt = createDateColumn(_draw_dt);
	
	/**
	 * 支払期日. Payment due date.<p>
	 *
	 */
	public static final String $due_dt = "due_dt";
	private static final MCPermColumnInfo _due_dt = createColumnInfo("due_dt");
	public final MCDatePermColumn due_dt = createDateColumn(_due_dt);
	
	/**
	 * 振出人名. Drawer name.<p>
	 *
	 */
	public static final String $drawer_nm = "drawer_nm";
	private static final MCPermColumnInfo _drawer_nm = createColumnInfo("drawer_nm");
	public final MCStringPermColumn drawer_nm = createStringColumn(_drawer_nm);
	
	/**
	 * 裏書人. Endorser.<p>
	 *
	 */
	public static final String $endrsr = "endrsr";
	private static final MCPermColumnInfo _endrsr = createColumnInfo("endrsr");
	public final MCStringPermColumn endrsr = createStringColumn(_endrsr);
	
	/**
	 * 引受人. Accepted by.<p>
	 *
	 */
	public static final String $accptr = "accptr";
	private static final MCPermColumnInfo _accptr = createColumnInfo("accptr");
	public final MCStringPermColumn accptr = createStringColumn(_accptr);
	
	/**
	 * 手形理由ＣＤ. Note reason cd..<p>
	 *
	 */
	public static final String $note_rsn_cd = "note_rsn_cd";
	private static final MCPermColumnInfo _note_rsn_cd = createColumnInfo("note_rsn_cd");
	public final MCStringPermColumn note_rsn_cd = createStringColumn(_note_rsn_cd);
	
	/**
	 * ＩＦ手形理由ＣＤ. IF note reason cd..<p>
	 *
	 */
	public static final String $if_note_rsn_cd = "if_note_rsn_cd";
	private static final MCPermColumnInfo _if_note_rsn_cd = createColumnInfo("if_note_rsn_cd");
	public final MCStringPermColumn if_note_rsn_cd = createStringColumn(_if_note_rsn_cd);
	
	/**
	 * ＩＦ手形理由名. IF note reason name.<p>
	 *
	 */
	public static final String $if_note_rsn_nm = "if_note_rsn_nm";
	private static final MCPermColumnInfo _if_note_rsn_nm = createColumnInfo("if_note_rsn_nm");
	public final MCStringPermColumn if_note_rsn_nm = createStringColumn(_if_note_rsn_nm);
	
	/**
	 * 振出銀行. Drawing bank.<p>
	 *
	 */
	public static final String $draw_bank_cd = "draw_bank_cd";
	private static final MCPermColumnInfo _draw_bank_cd = createColumnInfo("draw_bank_cd");
	public final MCStringPermColumn draw_bank_cd = createStringColumn(_draw_bank_cd);
	
	/**
	 * ＩＦ振出銀行ＣＤ. IF drawing bank cd..<p>
	 *
	 */
	public static final String $if_draw_bank_cd = "if_draw_bank_cd";
	private static final MCPermColumnInfo _if_draw_bank_cd = createColumnInfo("if_draw_bank_cd");
	public final MCStringPermColumn if_draw_bank_cd = createStringColumn(_if_draw_bank_cd);
	
	/**
	 * ＩＦ振出銀行名. IF drawing bank name.<p>
	 *
	 */
	public static final String $if_draw_bank_nm = "if_draw_bank_nm";
	private static final MCPermColumnInfo _if_draw_bank_nm = createColumnInfo("if_draw_bank_nm");
	public final MCStringPermColumn if_draw_bank_nm = createStringColumn(_if_draw_bank_nm);
	
	/**
	 * 振出支店. Drawing branch.<p>
	 *
	 */
	public static final String $draw_branch_cd = "draw_branch_cd";
	private static final MCPermColumnInfo _draw_branch_cd = createColumnInfo("draw_branch_cd");
	public final MCStringPermColumn draw_branch_cd = createStringColumn(_draw_branch_cd);
	
	/**
	 * ＩＦ振出支店ＣＤ. IF drawing branch cd..<p>
	 *
	 */
	public static final String $if_draw_branch_cd = "if_draw_branch_cd";
	private static final MCPermColumnInfo _if_draw_branch_cd = createColumnInfo("if_draw_branch_cd");
	public final MCStringPermColumn if_draw_branch_cd = createStringColumn(_if_draw_branch_cd);
	
	/**
	 * ＩＦ振出支店名. IF drawing branch name.<p>
	 *
	 */
	public static final String $if_draw_branch_nm = "if_draw_branch_nm";
	private static final MCPermColumnInfo _if_draw_branch_nm = createColumnInfo("if_draw_branch_nm");
	public final MCStringPermColumn if_draw_branch_nm = createStringColumn(_if_draw_branch_nm);
	
	/**
	 * ＩＦ会社ＣＤ. IF company cd..<p>
	 *
	 */
	public static final String $if_co_cd = "if_co_cd";
	private static final MCPermColumnInfo _if_co_cd = createColumnInfo("if_co_cd");
	public final MCStringPermColumn if_co_cd = createStringColumn(_if_co_cd);
	
	/**
	 * ＩＦ会社名. IF company name.<p>
	 *
	 */
	public static final String $if_co_nm = "if_co_nm";
	private static final MCPermColumnInfo _if_co_nm = createColumnInfo("if_co_nm");
	public final MCStringPermColumn if_co_nm = createStringColumn(_if_co_nm);
	
	/**
	 * 予備ＣＨＡＲ項目１. Spare CHAR column 1.<p>
	 *
	 */
	public static final String $sub_char1 = "sub_char1";
	private static final MCPermColumnInfo _sub_char1 = createColumnInfo("sub_char1");
	public final MCStringPermColumn sub_char1 = createStringColumn(_sub_char1);
	
	/**
	 * 予備ＣＨＡＲ項目２. Spare CHAR column 2.<p>
	 *
	 */
	public static final String $sub_char2 = "sub_char2";
	private static final MCPermColumnInfo _sub_char2 = createColumnInfo("sub_char2");
	public final MCStringPermColumn sub_char2 = createStringColumn(_sub_char2);
	
	/**
	 * 予備ＣＨＡＲ項目３. Spare CHAR column 3.<p>
	 *
	 */
	public static final String $sub_char3 = "sub_char3";
	private static final MCPermColumnInfo _sub_char3 = createColumnInfo("sub_char3");
	public final MCStringPermColumn sub_char3 = createStringColumn(_sub_char3);
	
	/**
	 * 予備ＣＨＡＲ項目４. Spare CHAR column 4.<p>
	 *
	 */
	public static final String $sub_char4 = "sub_char4";
	private static final MCPermColumnInfo _sub_char4 = createColumnInfo("sub_char4");
	public final MCStringPermColumn sub_char4 = createStringColumn(_sub_char4);
	
	/**
	 * 予備ＣＨＡＲ項目５. Spare CHAR column 5.<p>
	 *
	 */
	public static final String $sub_char5 = "sub_char5";
	private static final MCPermColumnInfo _sub_char5 = createColumnInfo("sub_char5");
	public final MCStringPermColumn sub_char5 = createStringColumn(_sub_char5);
	
	/**
	 * 予備ＣＨＡＲ項目６. Spare CHAR column 6.<p>
	 *
	 */
	public static final String $sub_char6 = "sub_char6";
	private static final MCPermColumnInfo _sub_char6 = createColumnInfo("sub_char6");
	public final MCStringPermColumn sub_char6 = createStringColumn(_sub_char6);
	
	/**
	 * 予備ＣＨＡＲ項目７. Spare CHAR column 7.<p>
	 *
	 */
	public static final String $sub_char7 = "sub_char7";
	private static final MCPermColumnInfo _sub_char7 = createColumnInfo("sub_char7");
	public final MCStringPermColumn sub_char7 = createStringColumn(_sub_char7);
	
	/**
	 * 予備ＣＨＡＲ項目８. Spare CHAR column 8.<p>
	 *
	 */
	public static final String $sub_char8 = "sub_char8";
	private static final MCPermColumnInfo _sub_char8 = createColumnInfo("sub_char8");
	public final MCStringPermColumn sub_char8 = createStringColumn(_sub_char8);
	
	/**
	 * 予備ＣＨＡＲ項目９. Spare CHAR column 9.<p>
	 *
	 */
	public static final String $sub_char9 = "sub_char9";
	private static final MCPermColumnInfo _sub_char9 = createColumnInfo("sub_char9");
	public final MCStringPermColumn sub_char9 = createStringColumn(_sub_char9);
	
	/**
	 * 予備ＣＨＡＲ項目１０. Spare CHAR column 10.<p>
	 *
	 */
	public static final String $sub_char10 = "sub_char10";
	private static final MCPermColumnInfo _sub_char10 = createColumnInfo("sub_char10");
	public final MCStringPermColumn sub_char10 = createStringColumn(_sub_char10);
	
	/**
	 * 予備ＣＨＡＲ項目１１. Spare CHAR column 11.<p>
	 *
	 */
	public static final String $sub_char11 = "sub_char11";
	private static final MCPermColumnInfo _sub_char11 = createColumnInfo("sub_char11");
	public final MCStringPermColumn sub_char11 = createStringColumn(_sub_char11);
	
	/**
	 * 予備ＣＨＡＲ項目１２. Spare CHAR column 12.<p>
	 *
	 */
	public static final String $sub_char12 = "sub_char12";
	private static final MCPermColumnInfo _sub_char12 = createColumnInfo("sub_char12");
	public final MCStringPermColumn sub_char12 = createStringColumn(_sub_char12);
	
	/**
	 * 予備ＣＨＡＲ項目１３. Spare CHAR column 13.<p>
	 *
	 */
	public static final String $sub_char13 = "sub_char13";
	private static final MCPermColumnInfo _sub_char13 = createColumnInfo("sub_char13");
	public final MCStringPermColumn sub_char13 = createStringColumn(_sub_char13);
	
	/**
	 * 予備ＣＨＡＲ項目１４. Spare CHAR column 14.<p>
	 *
	 */
	public static final String $sub_char14 = "sub_char14";
	private static final MCPermColumnInfo _sub_char14 = createColumnInfo("sub_char14");
	public final MCStringPermColumn sub_char14 = createStringColumn(_sub_char14);
	
	/**
	 * 予備ＣＨＡＲ項目１５. Spare CHAR column 15.<p>
	 *
	 */
	public static final String $sub_char15 = "sub_char15";
	private static final MCPermColumnInfo _sub_char15 = createColumnInfo("sub_char15");
	public final MCStringPermColumn sub_char15 = createStringColumn(_sub_char15);
	
	/**
	 * 予備ＣＨＡＲ項目１６. Spare CHAR column 16.<p>
	 *
	 */
	public static final String $sub_char16 = "sub_char16";
	private static final MCPermColumnInfo _sub_char16 = createColumnInfo("sub_char16");
	public final MCStringPermColumn sub_char16 = createStringColumn(_sub_char16);
	
	/**
	 * 予備ＣＨＡＲ項目１７. Spare CHAR column 17.<p>
	 *
	 */
	public static final String $sub_char17 = "sub_char17";
	private static final MCPermColumnInfo _sub_char17 = createColumnInfo("sub_char17");
	public final MCStringPermColumn sub_char17 = createStringColumn(_sub_char17);
	
	/**
	 * 予備ＣＨＡＲ項目１８. Spare CHAR column 18.<p>
	 *
	 */
	public static final String $sub_char18 = "sub_char18";
	private static final MCPermColumnInfo _sub_char18 = createColumnInfo("sub_char18");
	public final MCStringPermColumn sub_char18 = createStringColumn(_sub_char18);
	
	/**
	 * 予備ＣＨＡＲ項目１９. Spare CHAR column 19.<p>
	 *
	 */
	public static final String $sub_char19 = "sub_char19";
	private static final MCPermColumnInfo _sub_char19 = createColumnInfo("sub_char19");
	public final MCStringPermColumn sub_char19 = createStringColumn(_sub_char19);
	
	/**
	 * 予備ＣＨＡＲ項目２０. Spare CHAR column 20.<p>
	 *
	 */
	public static final String $sub_char20 = "sub_char20";
	private static final MCPermColumnInfo _sub_char20 = createColumnInfo("sub_char20");
	public final MCStringPermColumn sub_char20 = createStringColumn(_sub_char20);
	
	/**
	 * 予備ＣＨＡＲ項目２１. Spare CHAR column 21.<p>
	 *
	 */
	public static final String $sub_char21 = "sub_char21";
	private static final MCPermColumnInfo _sub_char21 = createColumnInfo("sub_char21");
	public final MCStringPermColumn sub_char21 = createStringColumn(_sub_char21);
	
	/**
	 * 予備ＣＨＡＲ項目２２. Spare CHAR column 22.<p>
	 *
	 */
	public static final String $sub_char22 = "sub_char22";
	private static final MCPermColumnInfo _sub_char22 = createColumnInfo("sub_char22");
	public final MCStringPermColumn sub_char22 = createStringColumn(_sub_char22);
	
	/**
	 * 予備ＣＨＡＲ項目２３. Spare CHAR column 23.<p>
	 *
	 */
	public static final String $sub_char23 = "sub_char23";
	private static final MCPermColumnInfo _sub_char23 = createColumnInfo("sub_char23");
	public final MCStringPermColumn sub_char23 = createStringColumn(_sub_char23);
	
	/**
	 * 予備ＣＨＡＲ項目２４. Spare CHAR column 24.<p>
	 *
	 */
	public static final String $sub_char24 = "sub_char24";
	private static final MCPermColumnInfo _sub_char24 = createColumnInfo("sub_char24");
	public final MCStringPermColumn sub_char24 = createStringColumn(_sub_char24);
	
	/**
	 * 予備ＣＨＡＲ項目２５. Spare CHAR column 25.<p>
	 *
	 */
	public static final String $sub_char25 = "sub_char25";
	private static final MCPermColumnInfo _sub_char25 = createColumnInfo("sub_char25");
	public final MCStringPermColumn sub_char25 = createStringColumn(_sub_char25);
	
	/**
	 * 予備ＣＨＡＲ項目２６. Spare CHAR column 26.<p>
	 *
	 */
	public static final String $sub_char26 = "sub_char26";
	private static final MCPermColumnInfo _sub_char26 = createColumnInfo("sub_char26");
	public final MCStringPermColumn sub_char26 = createStringColumn(_sub_char26);
	
	/**
	 * 予備ＣＨＡＲ項目２７. Spare CHAR column 27.<p>
	 *
	 */
	public static final String $sub_char27 = "sub_char27";
	private static final MCPermColumnInfo _sub_char27 = createColumnInfo("sub_char27");
	public final MCStringPermColumn sub_char27 = createStringColumn(_sub_char27);
	
	/**
	 * 予備ＣＨＡＲ項目２８. Spare CHAR column 28.<p>
	 *
	 */
	public static final String $sub_char28 = "sub_char28";
	private static final MCPermColumnInfo _sub_char28 = createColumnInfo("sub_char28");
	public final MCStringPermColumn sub_char28 = createStringColumn(_sub_char28);
	
	/**
	 * 予備ＣＨＡＲ項目２９. Spare CHAR column 29.<p>
	 *
	 */
	public static final String $sub_char29 = "sub_char29";
	private static final MCPermColumnInfo _sub_char29 = createColumnInfo("sub_char29");
	public final MCStringPermColumn sub_char29 = createStringColumn(_sub_char29);
	
	/**
	 * 予備ＣＨＡＲ項目３０. Spare CHAR column 30.<p>
	 *
	 */
	public static final String $sub_char30 = "sub_char30";
	private static final MCPermColumnInfo _sub_char30 = createColumnInfo("sub_char30");
	public final MCStringPermColumn sub_char30 = createStringColumn(_sub_char30);
	
	/**
	 * 予備ＮＵＭ項目１. Spare NUM column 1.<p>
	 *
	 */
	public static final String $sub_num1 = "sub_num1";
	private static final MCPermColumnInfo _sub_num1 = createColumnInfo("sub_num1");
	public final MCNumberPermColumn sub_num1 = createNumberColumn(_sub_num1);
	
	/**
	 * 予備ＮＵＭ項目２. Spare NUM column 2.<p>
	 *
	 */
	public static final String $sub_num2 = "sub_num2";
	private static final MCPermColumnInfo _sub_num2 = createColumnInfo("sub_num2");
	public final MCNumberPermColumn sub_num2 = createNumberColumn(_sub_num2);
	
	/**
	 * 予備ＮＵＭ項目３. Spare NUM column 3.<p>
	 *
	 */
	public static final String $sub_num3 = "sub_num3";
	private static final MCPermColumnInfo _sub_num3 = createColumnInfo("sub_num3");
	public final MCNumberPermColumn sub_num3 = createNumberColumn(_sub_num3);
	
	/**
	 * 予備ＮＵＭ項目４. Spare NUM column 4.<p>
	 *
	 */
	public static final String $sub_num4 = "sub_num4";
	private static final MCPermColumnInfo _sub_num4 = createColumnInfo("sub_num4");
	public final MCNumberPermColumn sub_num4 = createNumberColumn(_sub_num4);
	
	/**
	 * 予備ＮＵＭ項目５. Spare NUM column 5.<p>
	 *
	 */
	public static final String $sub_num5 = "sub_num5";
	private static final MCPermColumnInfo _sub_num5 = createColumnInfo("sub_num5");
	public final MCNumberPermColumn sub_num5 = createNumberColumn(_sub_num5);
	
	/**
	 * 予備ＤＡＴＥ項目１. Spare DATE column 1.<p>
	 *
	 */
	public static final String $sub_dt1 = "sub_dt1";
	private static final MCPermColumnInfo _sub_dt1 = createColumnInfo("sub_dt1");
	public final MCDatePermColumn sub_dt1 = createDateColumn(_sub_dt1);
	
	/**
	 * 予備ＤＡＴＥ項目２. Spare DATE column 2.<p>
	 *
	 */
	public static final String $sub_dt2 = "sub_dt2";
	private static final MCPermColumnInfo _sub_dt2 = createColumnInfo("sub_dt2");
	public final MCDatePermColumn sub_dt2 = createDateColumn(_sub_dt2);
	
	/**
	 * 予備ＤＡＴＥ項目３. Spare DATE column 3.<p>
	 *
	 */
	public static final String $sub_dt3 = "sub_dt3";
	private static final MCPermColumnInfo _sub_dt3 = createColumnInfo("sub_dt3");
	public final MCDatePermColumn sub_dt3 = createDateColumn(_sub_dt3);
	
	/**
	 * 予備ＤＡＴＥ項目４. Spare DATE column 4.<p>
	 *
	 */
	public static final String $sub_dt4 = "sub_dt4";
	private static final MCPermColumnInfo _sub_dt4 = createColumnInfo("sub_dt4");
	public final MCDatePermColumn sub_dt4 = createDateColumn(_sub_dt4);
	
	/**
	 * 予備ＤＡＴＥ項目５. Spare DATE column 5.<p>
	 *
	 */
	public static final String $sub_dt5 = "sub_dt5";
	private static final MCPermColumnInfo _sub_dt5 = createColumnInfo("sub_dt5");
	public final MCDatePermColumn sub_dt5 = createDateColumn(_sub_dt5);
	
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
	 * 送受信状況区分. Exporting and importing status type.<p>
	 *
	 */
	public static final String $sdrv_sts_typ = "sdrv_sts_typ";
	
	/**
	 * 入金先名. Payer name.<p>
	 *
	 */
	public static final String $rcst_nm = "rcst_nm";
	
	/**
	 * 請求先名. Billing customer name.<p>
	 *
	 */
	public static final String $bcst_nm = "bcst_nm";
	
	/**
	 * 請求部門名. Billing dept. name.<p>
	 *
	 */
	public static final String $bill_dpt_nm = "bill_dpt_nm";
	
	/**
	 * 入金部門名. Payment receiving dept. name.<p>
	 *
	 */
	public static final String $rcv_dpt_nm = "rcv_dpt_nm";
	
	/**
	 * 入金担当者名. Payment received PIC name.<p>
	 *
	 */
	public static final String $rcv_usr_nm = "rcv_usr_nm";
	
	/**
	 * 銀行名. Bank name.<p>
	 *
	 */
	public static final String $bank_nm = "bank_nm";
	
	/**
	 * 入金方法名. Payment received method name.<p>
	 *
	 */
	public static final String $rcv_mtd_nm = "rcv_mtd_nm";
	
	/**
	 * 口座名. Bank account name.<p>
	 *
	 */
	public static final String $bank_ac_nm = "bank_ac_nm";
	
	/**
	 * 取引通貨名. Transaction currency name.<p>
	 *
	 */
	public static final String $trd_cur_nm = "trd_cur_nm";
	
	/**
	 * 手形理由名. Note reason name.<p>
	 *
	 */
	public static final String $note_rsn_nm = "note_rsn_nm";
	
	/**
	 * 振出銀行名. Drawing bank name.<p>
	 *
	 */
	public static final String $draw_bank_nm = "draw_bank_nm";
	
	/**
	 * 振出支店名. Drawing branch name.<p>
	 *
	 */
	public static final String $draw_branch_nm = "draw_branch_nm";
	
	public static final MCMeta data_lno_META = createCommonMeta($data_lno, mcframe.commonMA.meta.MA_META.IF_DATA_LNO);
	public static final MCMeta data_no_META = createCommonMeta($data_no, mcframe.commonMA.meta.MA_META.IF_DATA_NO);
	public static final MCMeta data_crud_typ_META = createCommonMeta($data_crud_typ, mcframe.commonMA.meta.MA_META.DATA_CRUD_TYP);
	public static final MCMeta exe_sts_typ_META = createCommonMeta($exe_sts_typ, mcframe.commonMA.meta.MA_META.EXE_STS_TYP);
	public static final MCMeta ext_sys_cd_META = createCommonMeta($ext_sys_cd, mcframe.commonMA.meta.MA_META.EXT_SYS_CD);
	public static final MCMeta ext_data_no_META = createCommonMeta($ext_data_no, mcframe.commonMA.meta.MA_META.IF_EXT_DATA_NO);
	public static final MCMeta ext_data_lno_META = createCommonMeta($ext_data_lno, mcframe.commonMA.meta.MA_META.IF_EXT_DATA_LNO);
	public static final MCMeta data_make_dt_META = createCommonMeta($data_make_dt, mcframe.commonMA.meta.MA_META.YMDHMS);
	public static final MCMeta imp_flg_META = createCommonMeta($imp_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta recv_dt_META = createCommonMeta($recv_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta ext_rcv_no_META = createCommonMeta($ext_rcv_no, mcframe.commonMA.meta.MA_META.EXT_RCV_NO);
	public static final MCMeta rcst_cd_META = createCommonMeta($rcst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta if_rcst_cd_META = createCommonMeta($if_rcst_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta if_rcst_nm_META = createCommonMeta($if_rcst_nm, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_NM);
	public static final MCMeta bcst_cd_META = createCommonMeta($bcst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta if_bcst_cd_META = createCommonMeta($if_bcst_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta if_bcst_nm_META = createCommonMeta($if_bcst_nm, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_NM);
	public static final MCMeta bill_dpt_cd_META = createCommonMeta($bill_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta if_bill_dpt_cd_META = createCommonMeta($if_bill_dpt_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta if_bill_dpt_nm_META = createCommonMeta($if_bill_dpt_nm, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_NM);
	public static final MCMeta rcv_dpt_cd_META = createCommonMeta($rcv_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta if_rcv_dpt_cd_META = createCommonMeta($if_rcv_dpt_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta if_rcv_dpt_nm_META = createCommonMeta($if_rcv_dpt_nm, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_NM);
	public static final MCMeta rcv_usr_cd_META = createCommonMeta($rcv_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta if_rcv_usr_cd_META = createCommonMeta($if_rcv_usr_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta if_rcv_usr_nm_META = createCommonMeta($if_rcv_usr_nm, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_NM);
	public static final MCMeta rcv_dt_META = createCommonMeta($rcv_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta ar_sttl_typ_META = createCommonMeta($ar_sttl_typ, mcframe.commonMA.meta.MA_META.AR_STTL_TYP);
	public static final MCMeta bank_cd_META = createCommonMeta($bank_cd, mcframe.commonMA.meta.MA_META.BANK_CD);
	public static final MCMeta if_bank_cd_META = createCommonMeta($if_bank_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta if_bank_nm_META = createCommonMeta($if_bank_nm, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_NM);
	public static final MCMeta rcv_mtd_cd_META = createCommonMeta($rcv_mtd_cd, mcframe.commonMA.meta.MA_META.STTL_CD);
	public static final MCMeta if_rcv_mtd_cd_META = createCommonMeta($if_rcv_mtd_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta if_rcv_mtd_nm_META = createCommonMeta($if_rcv_mtd_nm, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_NM);
	public static final MCMeta bank_ac_cd_META = createCommonMeta($bank_ac_cd, mcframe.commonMA.meta.MA_META.BANK_AC_CD);
	public static final MCMeta if_bank_ac_cd_META = createCommonMeta($if_bank_ac_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta if_bank_ac_nm_META = createCommonMeta($if_bank_ac_nm, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_NM);
	public static final MCMeta xfr_psn_META = createCommonMeta($xfr_psn, mcframe.commonMA.meta.MA_META.XFR_PSN);
	public static final MCMeta trd_cur_cd_META = createCommonMeta($trd_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta if_trd_cur_cd_META = createCommonMeta($if_trd_cur_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta if_trd_cur_nm_META = createCommonMeta($if_trd_cur_nm, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_NM);
	public static final MCMeta xrate_META = createCommonMeta($xrate, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta rcv_amt_META = createCommonMeta($rcv_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta com_paid_META = createCommonMeta($com_paid, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta rcv_rmrks_META = createCommonMeta($rcv_rmrks, mcframe.commonMS.meta.MS_META.RCV_RMRKS);
	public static final MCMeta note_no_META = createCommonMeta($note_no, mcframe.commonMA.meta.MA_META.NOTE_NO);
	public static final MCMeta note_typ_META = createCommonMeta($note_typ, mcframe.commonMA.meta.MA_META.NOTE_TYP);
	public static final MCMeta draw_dt_META = createCommonMeta($draw_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta due_dt_META = createCommonMeta($due_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta drawer_nm_META = createCommonMeta($drawer_nm, mcframe.commonMA.meta.MA_META.DRAWER_NM);
	public static final MCMeta endrsr_META = createCommonMeta($endrsr, mcframe.commonMA.meta.MA_META.NOTE_ENDRSR);
	public static final MCMeta accptr_META = createCommonMeta($accptr, mcframe.commonMA.meta.MA_META.NOTE_ACCPTR);
	public static final MCMeta note_rsn_cd_META = createCommonMeta($note_rsn_cd, mcframe.commonMA.meta.MA_META.NOTE_RSN_CD);
	public static final MCMeta if_note_rsn_cd_META = createCommonMeta($if_note_rsn_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta if_note_rsn_nm_META = createCommonMeta($if_note_rsn_nm, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_NM);
	public static final MCMeta draw_bank_cd_META = createCommonMeta($draw_bank_cd, mcframe.commonMA.meta.MA_META.BANK_CD);
	public static final MCMeta if_draw_bank_cd_META = createCommonMeta($if_draw_bank_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta if_draw_bank_nm_META = createCommonMeta($if_draw_bank_nm, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_NM);
	public static final MCMeta draw_branch_cd_META = createCommonMeta($draw_branch_cd, mcframe.commonMA.meta.MA_META.BANK_BRANCH_CD);
	public static final MCMeta if_draw_branch_cd_META = createCommonMeta($if_draw_branch_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta if_draw_branch_nm_META = createCommonMeta($if_draw_branch_nm, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_NM);
	public static final MCMeta if_co_cd_META = createCommonMeta($if_co_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta if_co_nm_META = createCommonMeta($if_co_nm, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_NM);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR3);
	public static final MCMeta sub_char4_META = createCommonMeta($sub_char4, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR4);
	public static final MCMeta sub_char5_META = createCommonMeta($sub_char5, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR5);
	public static final MCMeta sub_char6_META = createCommonMeta($sub_char6, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR6);
	public static final MCMeta sub_char7_META = createCommonMeta($sub_char7, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR7);
	public static final MCMeta sub_char8_META = createCommonMeta($sub_char8, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR8);
	public static final MCMeta sub_char9_META = createCommonMeta($sub_char9, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR9);
	public static final MCMeta sub_char10_META = createCommonMeta($sub_char10, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR10);
	public static final MCMeta sub_char11_META = createCommonMeta($sub_char11, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR11);
	public static final MCMeta sub_char12_META = createCommonMeta($sub_char12, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR12);
	public static final MCMeta sub_char13_META = createCommonMeta($sub_char13, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR13);
	public static final MCMeta sub_char14_META = createCommonMeta($sub_char14, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR14);
	public static final MCMeta sub_char15_META = createCommonMeta($sub_char15, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR15);
	public static final MCMeta sub_char16_META = createCommonMeta($sub_char16, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR16);
	public static final MCMeta sub_char17_META = createCommonMeta($sub_char17, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR17);
	public static final MCMeta sub_char18_META = createCommonMeta($sub_char18, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR18);
	public static final MCMeta sub_char19_META = createCommonMeta($sub_char19, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR19);
	public static final MCMeta sub_char20_META = createCommonMeta($sub_char20, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR20);
	public static final MCMeta sub_char21_META = createCommonMeta($sub_char21, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR21);
	public static final MCMeta sub_char22_META = createCommonMeta($sub_char22, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR22);
	public static final MCMeta sub_char23_META = createCommonMeta($sub_char23, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR23);
	public static final MCMeta sub_char24_META = createCommonMeta($sub_char24, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR24);
	public static final MCMeta sub_char25_META = createCommonMeta($sub_char25, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR25);
	public static final MCMeta sub_char26_META = createCommonMeta($sub_char26, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR26);
	public static final MCMeta sub_char27_META = createCommonMeta($sub_char27, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR27);
	public static final MCMeta sub_char28_META = createCommonMeta($sub_char28, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR28);
	public static final MCMeta sub_char29_META = createCommonMeta($sub_char29, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR29);
	public static final MCMeta sub_char30_META = createCommonMeta($sub_char30, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR30);
	public static final MCMeta sub_num1_META = createCommonMeta($sub_num1, mcframe.commonMA.meta.MA_META.IF_SUB_NUM1);
	public static final MCMeta sub_num2_META = createCommonMeta($sub_num2, mcframe.commonMA.meta.MA_META.IF_SUB_NUM2);
	public static final MCMeta sub_num3_META = createCommonMeta($sub_num3, mcframe.commonMA.meta.MA_META.IF_SUB_NUM3);
	public static final MCMeta sub_num4_META = createCommonMeta($sub_num4, mcframe.commonMA.meta.MA_META.IF_SUB_NUM4);
	public static final MCMeta sub_num5_META = createCommonMeta($sub_num5, mcframe.commonMA.meta.MA_META.IF_SUB_NUM5);
	public static final MCMeta sub_dt1_META = createCommonMeta($sub_dt1, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta sub_dt2_META = createCommonMeta($sub_dt2, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta sub_dt3_META = createCommonMeta($sub_dt3, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta sub_dt4_META = createCommonMeta($sub_dt4, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta sub_dt5_META = createCommonMeta($sub_dt5, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta batch_log_no_META = createCommonMeta($batch_log_no, mcframe.commonMA.meta.MA_META.BATCH_LOG_NO);
	public static final MCMeta log_sub_key1_META = createCommonMeta($log_sub_key1, mcframe.commonMA.meta.MA_META.BATCH_LOG_SUB_KEY1);
	public static final MCMeta log_sub_key2_META = createCommonMeta($log_sub_key2, mcframe.commonMA.meta.MA_META.BATCH_LOG_SUB_KEY2);
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
	public static final MCMeta sdrv_sts_typ_META = createCommonMeta($sdrv_sts_typ, mcframe.commonMA.meta.MA_META.SDRV_STS_TYP);
	public static final MCMeta rcst_nm_META = createCommonMeta($rcst_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta bcst_nm_META = createCommonMeta($bcst_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta bill_dpt_nm_META = createCommonMeta($bill_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta rcv_dpt_nm_META = createCommonMeta($rcv_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta rcv_usr_nm_META = createCommonMeta($rcv_usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta bank_nm_META = createCommonMeta($bank_nm, mcframe.commonMA.meta.MA_META.BANK_NM);
	public static final MCMeta rcv_mtd_nm_META = createCommonMeta($rcv_mtd_nm, mcframe.commonMA.meta.MA_META.STTL_NM);
	public static final MCMeta bank_ac_nm_META = createCommonMeta($bank_ac_nm, mcframe.commonMA.meta.MA_META.BANK_AC_NM);
	public static final MCMeta trd_cur_nm_META = createCommonMeta($trd_cur_nm, mcframe.commonMA.meta.MA_META.CUR_NM);
	public static final MCMeta note_rsn_nm_META = createCommonMeta($note_rsn_nm, mcframe.commonMA.meta.MA_META.NOTE_RSN_NM);
	public static final MCMeta draw_bank_nm_META = createCommonMeta($draw_bank_nm, mcframe.commonMA.meta.MA_META.BANK_NM);
	public static final MCMeta draw_branch_nm_META = createCommonMeta($draw_branch_nm, mcframe.commonMA.meta.MA_META.BANK_BRANCH_NM);

	protected static final List<MCForeignInfo> FOREIGN_INFO_LIST = new ArrayList<>();
	public static final String $SDRV = "SDRV";
	static {
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"PFT_SDRV_IF",
				$SDRV,
				new String[][]{
						{"data_no", "data_no"}
				},
				() -> {
					return mcframe.serverPF.dbc.PFT_SDRV_IF_R.create("SDRV");
				},
				(alias) -> {
					MST_RCV_RECV_IF_R own = MST_RCV_RECV_IF_R.create(alias);
					mcframe.serverPF.dbc.PFT_SDRV_IF_R ref = mcframe.serverPF.dbc.PFT_SDRV_IF_R.create("SDRV");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.data_no.eq(ref.data_no));
					return cond;
				}
			)
		);
	}
	
	protected static final ConstMetaList<MST_RCV_RECV_IF_R> constMetas = new ConstMetaList<MST_RCV_RECV_IF_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			data_lno_META,
			data_no_META,
			data_crud_typ_META,
			exe_sts_typ_META,
			ext_sys_cd_META,
			ext_data_no_META,
			ext_data_lno_META,
			data_make_dt_META,
			imp_flg_META,
			recv_dt_META,
			ext_rcv_no_META,
			rcst_cd_META,
			if_rcst_cd_META,
			if_rcst_nm_META,
			bcst_cd_META,
			if_bcst_cd_META,
			if_bcst_nm_META,
			bill_dpt_cd_META,
			if_bill_dpt_cd_META,
			if_bill_dpt_nm_META,
			rcv_dpt_cd_META,
			if_rcv_dpt_cd_META,
			if_rcv_dpt_nm_META,
			rcv_usr_cd_META,
			if_rcv_usr_cd_META,
			if_rcv_usr_nm_META,
			rcv_dt_META,
			ar_sttl_typ_META,
			bank_cd_META,
			if_bank_cd_META,
			if_bank_nm_META,
			rcv_mtd_cd_META,
			if_rcv_mtd_cd_META,
			if_rcv_mtd_nm_META,
			bank_ac_cd_META,
			if_bank_ac_cd_META,
			if_bank_ac_nm_META,
			xfr_psn_META,
			trd_cur_cd_META,
			if_trd_cur_cd_META,
			if_trd_cur_nm_META,
			xrate_META,
			rcv_amt_META,
			com_paid_META,
			rcv_rmrks_META,
			note_no_META,
			note_typ_META,
			draw_dt_META,
			due_dt_META,
			drawer_nm_META,
			endrsr_META,
			accptr_META,
			note_rsn_cd_META,
			if_note_rsn_cd_META,
			if_note_rsn_nm_META,
			draw_bank_cd_META,
			if_draw_bank_cd_META,
			if_draw_bank_nm_META,
			draw_branch_cd_META,
			if_draw_branch_cd_META,
			if_draw_branch_nm_META,
			if_co_cd_META,
			if_co_nm_META,
			sub_char1_META,
			sub_char2_META,
			sub_char3_META,
			sub_char4_META,
			sub_char5_META,
			sub_char6_META,
			sub_char7_META,
			sub_char8_META,
			sub_char9_META,
			sub_char10_META,
			sub_char11_META,
			sub_char12_META,
			sub_char13_META,
			sub_char14_META,
			sub_char15_META,
			sub_char16_META,
			sub_char17_META,
			sub_char18_META,
			sub_char19_META,
			sub_char20_META,
			sub_char21_META,
			sub_char22_META,
			sub_char23_META,
			sub_char24_META,
			sub_char25_META,
			sub_char26_META,
			sub_char27_META,
			sub_char28_META,
			sub_char29_META,
			sub_char30_META,
			sub_num1_META,
			sub_num2_META,
			sub_num3_META,
			sub_num4_META,
			sub_num5_META,
			sub_dt1_META,
			sub_dt2_META,
			sub_dt3_META,
			sub_dt4_META,
			sub_dt5_META,
			batch_log_no_META,
			log_sub_key1_META,
			log_sub_key2_META,
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
			sdrv_sts_typ_META,
			rcst_nm_META,
			bcst_nm_META,
			bill_dpt_nm_META,
			rcv_dpt_nm_META,
			rcv_usr_nm_META,
			bank_nm_META,
			rcv_mtd_nm_META,
			bank_ac_nm_META,
			trd_cur_nm_META,
			note_rsn_nm_META,
			draw_bank_nm_META,
			draw_branch_nm_META
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
	protected MST_RCV_RECV_IF_R(ConstMetaList<? extends MST_RCV_RECV_IF_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MST_RCV_RECV_IF_R(ConstMetaList<? extends MST_RCV_RECV_IF_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MST_RCV_RECV_IF_R.$data_lno,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_RCV_RECV_IF_R.$data_lno,
				"data_lno",
				data_lno,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_RECV_IF_R.$data_no,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_RCV_RECV_IF_R.$data_no,
				"data_no",
				data_no,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_RECV_IF_R.$data_crud_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_RECV_IF_R.$data_crud_typ,
				"data_crud_typ",
				data_crud_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_RECV_IF_R.$exe_sts_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_RECV_IF_R.$exe_sts_typ,
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
			MST_RCV_RECV_IF_R.$ext_sys_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_RECV_IF_R.$ext_sys_cd,
				"ext_sys_cd",
				ext_sys_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_RECV_IF_R.$ext_data_no,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_RCV_RECV_IF_R.$ext_data_no,
				"ext_data_no",
				ext_data_no,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_RECV_IF_R.$ext_data_lno,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_RCV_RECV_IF_R.$ext_data_lno,
				"ext_data_lno",
				ext_data_lno,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_RECV_IF_R.$data_make_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_RCV_RECV_IF_R.$data_make_dt,
				"data_make_dt",
				data_make_dt,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_RECV_IF_R.$imp_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_RCV_RECV_IF_R.$imp_flg,
				"imp_flg",
				imp_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_RECV_IF_R.$recv_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_RCV_RECV_IF_R.$recv_dt,
				"recv_dt",
				recv_dt,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_RECV_IF_R.$ext_rcv_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_RECV_IF_R.$ext_rcv_no,
				"ext_rcv_no",
				ext_rcv_no,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_RECV_IF_R.$rcst_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_RECV_IF_R.$rcst_cd,
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
			MST_RCV_RECV_IF_R.$if_rcst_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_RECV_IF_R.$if_rcst_cd,
				"if_rcst_cd",
				if_rcst_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_RECV_IF_R.$if_rcst_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_RECV_IF_R.$if_rcst_nm,
				"if_rcst_nm",
				if_rcst_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_RECV_IF_R.$bcst_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_RECV_IF_R.$bcst_cd,
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
			MST_RCV_RECV_IF_R.$if_bcst_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_RECV_IF_R.$if_bcst_cd,
				"if_bcst_cd",
				if_bcst_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_RECV_IF_R.$if_bcst_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_RECV_IF_R.$if_bcst_nm,
				"if_bcst_nm",
				if_bcst_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_RECV_IF_R.$bill_dpt_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_RECV_IF_R.$bill_dpt_cd,
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
			MST_RCV_RECV_IF_R.$if_bill_dpt_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_RECV_IF_R.$if_bill_dpt_cd,
				"if_bill_dpt_cd",
				if_bill_dpt_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_RECV_IF_R.$if_bill_dpt_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_RECV_IF_R.$if_bill_dpt_nm,
				"if_bill_dpt_nm",
				if_bill_dpt_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_RECV_IF_R.$rcv_dpt_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_RECV_IF_R.$rcv_dpt_cd,
				"rcv_dpt_cd",
				rcv_dpt_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_RECV_IF_R.$if_rcv_dpt_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_RECV_IF_R.$if_rcv_dpt_cd,
				"if_rcv_dpt_cd",
				if_rcv_dpt_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_RECV_IF_R.$if_rcv_dpt_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_RECV_IF_R.$if_rcv_dpt_nm,
				"if_rcv_dpt_nm",
				if_rcv_dpt_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_RECV_IF_R.$rcv_usr_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_RECV_IF_R.$rcv_usr_cd,
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
			MST_RCV_RECV_IF_R.$if_rcv_usr_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_RECV_IF_R.$if_rcv_usr_cd,
				"if_rcv_usr_cd",
				if_rcv_usr_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_RECV_IF_R.$if_rcv_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_RECV_IF_R.$if_rcv_usr_nm,
				"if_rcv_usr_nm",
				if_rcv_usr_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_RECV_IF_R.$rcv_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_RCV_RECV_IF_R.$rcv_dt,
				"rcv_dt",
				rcv_dt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_RECV_IF_R.$ar_sttl_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_RECV_IF_R.$ar_sttl_typ,
				"ar_sttl_typ",
				ar_sttl_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_RECV_IF_R.$bank_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_RECV_IF_R.$bank_cd,
				"bank_cd",
				bank_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_RECV_IF_R.$if_bank_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_RECV_IF_R.$if_bank_cd,
				"if_bank_cd",
				if_bank_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_RECV_IF_R.$if_bank_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_RECV_IF_R.$if_bank_nm,
				"if_bank_nm",
				if_bank_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_RECV_IF_R.$rcv_mtd_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_RECV_IF_R.$rcv_mtd_cd,
				"rcv_mtd_cd",
				rcv_mtd_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_RECV_IF_R.$if_rcv_mtd_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_RECV_IF_R.$if_rcv_mtd_cd,
				"if_rcv_mtd_cd",
				if_rcv_mtd_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_RECV_IF_R.$if_rcv_mtd_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_RECV_IF_R.$if_rcv_mtd_nm,
				"if_rcv_mtd_nm",
				if_rcv_mtd_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_RECV_IF_R.$bank_ac_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_RECV_IF_R.$bank_ac_cd,
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
			MST_RCV_RECV_IF_R.$if_bank_ac_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_RECV_IF_R.$if_bank_ac_cd,
				"if_bank_ac_cd",
				if_bank_ac_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_RECV_IF_R.$if_bank_ac_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_RECV_IF_R.$if_bank_ac_nm,
				"if_bank_ac_nm",
				if_bank_ac_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_RECV_IF_R.$xfr_psn,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_RECV_IF_R.$xfr_psn,
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
			MST_RCV_RECV_IF_R.$trd_cur_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_RECV_IF_R.$trd_cur_cd,
				"trd_cur_cd",
				trd_cur_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_RECV_IF_R.$if_trd_cur_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_RECV_IF_R.$if_trd_cur_cd,
				"if_trd_cur_cd",
				if_trd_cur_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_RECV_IF_R.$if_trd_cur_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_RECV_IF_R.$if_trd_cur_nm,
				"if_trd_cur_nm",
				if_trd_cur_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_RECV_IF_R.$xrate,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_RCV_RECV_IF_R.$xrate,
				"xrate",
				xrate,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_RECV_IF_R.$rcv_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_RCV_RECV_IF_R.$rcv_amt,
				"rcv_amt",
				rcv_amt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_RECV_IF_R.$com_paid,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_RCV_RECV_IF_R.$com_paid,
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
			MST_RCV_RECV_IF_R.$rcv_rmrks,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_RECV_IF_R.$rcv_rmrks,
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
			MST_RCV_RECV_IF_R.$note_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_RECV_IF_R.$note_no,
				"note_no",
				note_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_RECV_IF_R.$note_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_RECV_IF_R.$note_typ,
				"note_typ",
				note_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_RECV_IF_R.$draw_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_RCV_RECV_IF_R.$draw_dt,
				"draw_dt",
				draw_dt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_RECV_IF_R.$due_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_RCV_RECV_IF_R.$due_dt,
				"due_dt",
				due_dt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_RECV_IF_R.$drawer_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_RECV_IF_R.$drawer_nm,
				"drawer_nm",
				drawer_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_RECV_IF_R.$endrsr,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_RECV_IF_R.$endrsr,
				"endrsr",
				endrsr,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_RECV_IF_R.$accptr,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_RECV_IF_R.$accptr,
				"accptr",
				accptr,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_RECV_IF_R.$note_rsn_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_RECV_IF_R.$note_rsn_cd,
				"note_rsn_cd",
				note_rsn_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_RECV_IF_R.$if_note_rsn_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_RECV_IF_R.$if_note_rsn_cd,
				"if_note_rsn_cd",
				if_note_rsn_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_RECV_IF_R.$if_note_rsn_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_RECV_IF_R.$if_note_rsn_nm,
				"if_note_rsn_nm",
				if_note_rsn_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_RECV_IF_R.$draw_bank_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_RECV_IF_R.$draw_bank_cd,
				"draw_bank_cd",
				draw_bank_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_RECV_IF_R.$if_draw_bank_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_RECV_IF_R.$if_draw_bank_cd,
				"if_draw_bank_cd",
				if_draw_bank_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_RECV_IF_R.$if_draw_bank_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_RECV_IF_R.$if_draw_bank_nm,
				"if_draw_bank_nm",
				if_draw_bank_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_RECV_IF_R.$draw_branch_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_RECV_IF_R.$draw_branch_cd,
				"draw_branch_cd",
				draw_branch_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_RECV_IF_R.$if_draw_branch_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_RECV_IF_R.$if_draw_branch_cd,
				"if_draw_branch_cd",
				if_draw_branch_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_RECV_IF_R.$if_draw_branch_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_RECV_IF_R.$if_draw_branch_nm,
				"if_draw_branch_nm",
				if_draw_branch_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_RECV_IF_R.$if_co_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_RECV_IF_R.$if_co_cd,
				"if_co_cd",
				if_co_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_RECV_IF_R.$if_co_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_RECV_IF_R.$if_co_nm,
				"if_co_nm",
				if_co_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_RECV_IF_R.$sub_char1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_RECV_IF_R.$sub_char1,
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
			MST_RCV_RECV_IF_R.$sub_char2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_RECV_IF_R.$sub_char2,
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
			MST_RCV_RECV_IF_R.$sub_char3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_RECV_IF_R.$sub_char3,
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
			MST_RCV_RECV_IF_R.$sub_char4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_RECV_IF_R.$sub_char4,
				"sub_char4",
				sub_char4,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_RECV_IF_R.$sub_char5,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_RECV_IF_R.$sub_char5,
				"sub_char5",
				sub_char5,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_RECV_IF_R.$sub_char6,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_RECV_IF_R.$sub_char6,
				"sub_char6",
				sub_char6,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_RECV_IF_R.$sub_char7,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_RECV_IF_R.$sub_char7,
				"sub_char7",
				sub_char7,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_RECV_IF_R.$sub_char8,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_RECV_IF_R.$sub_char8,
				"sub_char8",
				sub_char8,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_RECV_IF_R.$sub_char9,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_RECV_IF_R.$sub_char9,
				"sub_char9",
				sub_char9,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_RECV_IF_R.$sub_char10,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_RECV_IF_R.$sub_char10,
				"sub_char10",
				sub_char10,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_RECV_IF_R.$sub_char11,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_RECV_IF_R.$sub_char11,
				"sub_char11",
				sub_char11,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_RECV_IF_R.$sub_char12,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_RECV_IF_R.$sub_char12,
				"sub_char12",
				sub_char12,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_RECV_IF_R.$sub_char13,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_RECV_IF_R.$sub_char13,
				"sub_char13",
				sub_char13,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_RECV_IF_R.$sub_char14,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_RECV_IF_R.$sub_char14,
				"sub_char14",
				sub_char14,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_RECV_IF_R.$sub_char15,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_RECV_IF_R.$sub_char15,
				"sub_char15",
				sub_char15,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_RECV_IF_R.$sub_char16,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_RECV_IF_R.$sub_char16,
				"sub_char16",
				sub_char16,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_RECV_IF_R.$sub_char17,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_RECV_IF_R.$sub_char17,
				"sub_char17",
				sub_char17,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_RECV_IF_R.$sub_char18,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_RECV_IF_R.$sub_char18,
				"sub_char18",
				sub_char18,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_RECV_IF_R.$sub_char19,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_RECV_IF_R.$sub_char19,
				"sub_char19",
				sub_char19,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_RECV_IF_R.$sub_char20,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_RECV_IF_R.$sub_char20,
				"sub_char20",
				sub_char20,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_RECV_IF_R.$sub_char21,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_RECV_IF_R.$sub_char21,
				"sub_char21",
				sub_char21,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_RECV_IF_R.$sub_char22,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_RECV_IF_R.$sub_char22,
				"sub_char22",
				sub_char22,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_RECV_IF_R.$sub_char23,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_RECV_IF_R.$sub_char23,
				"sub_char23",
				sub_char23,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_RECV_IF_R.$sub_char24,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_RECV_IF_R.$sub_char24,
				"sub_char24",
				sub_char24,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_RECV_IF_R.$sub_char25,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_RECV_IF_R.$sub_char25,
				"sub_char25",
				sub_char25,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_RECV_IF_R.$sub_char26,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_RECV_IF_R.$sub_char26,
				"sub_char26",
				sub_char26,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_RECV_IF_R.$sub_char27,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_RECV_IF_R.$sub_char27,
				"sub_char27",
				sub_char27,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_RECV_IF_R.$sub_char28,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_RECV_IF_R.$sub_char28,
				"sub_char28",
				sub_char28,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_RECV_IF_R.$sub_char29,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_RECV_IF_R.$sub_char29,
				"sub_char29",
				sub_char29,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_RECV_IF_R.$sub_char30,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_RECV_IF_R.$sub_char30,
				"sub_char30",
				sub_char30,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_RECV_IF_R.$sub_num1,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_RCV_RECV_IF_R.$sub_num1,
				"sub_num1",
				sub_num1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_RECV_IF_R.$sub_num2,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_RCV_RECV_IF_R.$sub_num2,
				"sub_num2",
				sub_num2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_RECV_IF_R.$sub_num3,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_RCV_RECV_IF_R.$sub_num3,
				"sub_num3",
				sub_num3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_RECV_IF_R.$sub_num4,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_RCV_RECV_IF_R.$sub_num4,
				"sub_num4",
				sub_num4,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_RECV_IF_R.$sub_num5,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_RCV_RECV_IF_R.$sub_num5,
				"sub_num5",
				sub_num5,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_RECV_IF_R.$sub_dt1,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_RCV_RECV_IF_R.$sub_dt1,
				"sub_dt1",
				sub_dt1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_RECV_IF_R.$sub_dt2,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_RCV_RECV_IF_R.$sub_dt2,
				"sub_dt2",
				sub_dt2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_RECV_IF_R.$sub_dt3,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_RCV_RECV_IF_R.$sub_dt3,
				"sub_dt3",
				sub_dt3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_RECV_IF_R.$sub_dt4,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_RCV_RECV_IF_R.$sub_dt4,
				"sub_dt4",
				sub_dt4,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_RECV_IF_R.$sub_dt5,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_RCV_RECV_IF_R.$sub_dt5,
				"sub_dt5",
				sub_dt5,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_RECV_IF_R.$batch_log_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_RECV_IF_R.$batch_log_no,
				"batch_log_no",
				batch_log_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_RECV_IF_R.$log_sub_key1,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_RCV_RECV_IF_R.$log_sub_key1,
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
			MST_RCV_RECV_IF_R.$log_sub_key2,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_RCV_RECV_IF_R.$log_sub_key2,
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
			MST_RCV_RECV_IF_R.$ins_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_RECV_IF_R.$ins_usr_id,
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
			MST_RCV_RECV_IF_R.$ins_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_RECV_IF_R.$ins_usr_nm,
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
			MST_RCV_RECV_IF_R.$ins_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MST_RCV_RECV_IF_R.$ins_ts,
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
			MST_RCV_RECV_IF_R.$ins_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_RECV_IF_R.$ins_func_id,
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
			MST_RCV_RECV_IF_R.$upd_cntr,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_RCV_RECV_IF_R.$upd_cntr,
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
			MST_RCV_RECV_IF_R.$upd_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_RECV_IF_R.$upd_usr_id,
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
			MST_RCV_RECV_IF_R.$upd_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_RECV_IF_R.$upd_usr_nm,
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
			MST_RCV_RECV_IF_R.$upd_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MST_RCV_RECV_IF_R.$upd_ts,
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
			MST_RCV_RECV_IF_R.$upd_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_RECV_IF_R.$upd_func_id,
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
			MST_RCV_RECV_IF_R.$upd_srv_req_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_RECV_IF_R.$upd_srv_req_no,
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
			MST_RCV_RECV_IF_R.$sdrv_sts_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_RECV_IF_R.$sdrv_sts_typ,
				"sdrv_sts_typ",
				null,
				false,
				true,
				false,
				false,
				true,
				"SDRV.SDRV_STS_TYP"
			)
		);
		COLUMN_MAP.put(
			MST_RCV_RECV_IF_R.$rcst_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_RECV_IF_R.$rcst_nm,
				"rcst_nm",
				null,
				false,
				true,
				false,
				false,
				true,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_RECV_IF_R.$bcst_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_RECV_IF_R.$bcst_nm,
				"bcst_nm",
				null,
				false,
				true,
				false,
				false,
				true,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_RECV_IF_R.$bill_dpt_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_RECV_IF_R.$bill_dpt_nm,
				"bill_dpt_nm",
				null,
				false,
				true,
				false,
				false,
				true,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_RECV_IF_R.$rcv_dpt_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_RECV_IF_R.$rcv_dpt_nm,
				"rcv_dpt_nm",
				null,
				false,
				true,
				false,
				false,
				true,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_RECV_IF_R.$rcv_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_RECV_IF_R.$rcv_usr_nm,
				"rcv_usr_nm",
				null,
				false,
				true,
				false,
				false,
				true,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_RECV_IF_R.$bank_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_RECV_IF_R.$bank_nm,
				"bank_nm",
				null,
				false,
				true,
				false,
				false,
				true,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_RECV_IF_R.$rcv_mtd_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_RECV_IF_R.$rcv_mtd_nm,
				"rcv_mtd_nm",
				null,
				false,
				true,
				false,
				false,
				true,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_RECV_IF_R.$bank_ac_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_RECV_IF_R.$bank_ac_nm,
				"bank_ac_nm",
				null,
				false,
				true,
				false,
				false,
				true,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_RECV_IF_R.$trd_cur_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_RECV_IF_R.$trd_cur_nm,
				"trd_cur_nm",
				null,
				false,
				true,
				false,
				false,
				true,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_RECV_IF_R.$note_rsn_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_RECV_IF_R.$note_rsn_nm,
				"note_rsn_nm",
				null,
				false,
				true,
				false,
				false,
				true,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_RECV_IF_R.$draw_bank_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_RECV_IF_R.$draw_bank_nm,
				"draw_bank_nm",
				null,
				false,
				true,
				false,
				false,
				true,
				""
			)
		);
		COLUMN_MAP.put(
			MST_RCV_RECV_IF_R.$draw_branch_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_RCV_RECV_IF_R.$draw_branch_nm,
				"draw_branch_nm",
				null,
				false,
				true,
				false,
				false,
				true,
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
	public static MST_RCV_RECV_IF_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MST_RCV_RECV_IF_R create(String alias) {
		MST_RCV_RECV_IF_R row = new MST_RCV_RECV_IF_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MST_RCV_RECV_IF_R createByName(T proto) {
		MST_RCV_RECV_IF_R row = MST_RCV_RECV_IF_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MST_RCV_RECV_IF_R clone() {
		return (MST_RCV_RECV_IF_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MST_RCV_RECV_IF_R createInstance() {
		return (MST_RCV_RECV_IF_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MST_RCV_RECV_IF_R getValues(String... names) {
		return (MST_RCV_RECV_IF_R) super.getValues(names);
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
	 public MSW_RCV_RECV_IF_KEY_R getPkWorkDbc(String alias) {
	 	return MSW_RCV_RECV_IF_KEY_R.create(alias);
	 }

	/*
	 * MCDBContainerのオーバーライドメソッドです。
	 */
	 public MSW_RCV_RECV_IF_KEY_R getPkWorkDbc() {
	 	return getPkWorkDbc(MSW_RCV_RECV_IF_KEY_R.TABLE_NAME);
	 }

	/**
	 * データ行ＮＯ. Data row No..<p>
	 *
	 */
	public MCNumber data_lno() {
		return getConstNumber(offset + 0, $data_lno);
	}

	/**
	 * データ行ＮＯ. Data row No..<p>
	 *
	 */
	public void data_lno(MCNumber value) {
		setConstNumber(offset + 0, $data_lno, value);
	}
	
	/**
	 * データ行ＮＯ. Data row No..<p>
	 *
	 */
	public void data_lno(int value) {
		setConstNumber(offset + 0, $data_lno, value);
	}
	
	/**
	 * データ行ＮＯ. Data row No..<p>
	 *
	 */
	public void data_lno(long value) {
		setConstNumber(offset + 0, $data_lno, value);
	}
	
	/**
	 * データ行ＮＯ. Data row No..<p>
	 *
	 */
	public void data_lno(float value) {
		setConstNumber(offset + 0, $data_lno, value);
	}
	
	/**
	 * データ行ＮＯ. Data row No..<p>
	 *
	 */
	public void data_lno(double value) {
		setConstNumber(offset + 0, $data_lno, value);
	}
	
	/**
	 * データＮＯ. Data No..<p>
	 *
	 */
	public MCNumber data_no() {
		return getConstNumber(offset + 1, $data_no);
	}

	/**
	 * データＮＯ. Data No..<p>
	 *
	 */
	public void data_no(MCNumber value) {
		setConstNumber(offset + 1, $data_no, value);
	}
	
	/**
	 * データＮＯ. Data No..<p>
	 *
	 */
	public void data_no(int value) {
		setConstNumber(offset + 1, $data_no, value);
	}
	
	/**
	 * データＮＯ. Data No..<p>
	 *
	 */
	public void data_no(long value) {
		setConstNumber(offset + 1, $data_no, value);
	}
	
	/**
	 * データＮＯ. Data No..<p>
	 *
	 */
	public void data_no(float value) {
		setConstNumber(offset + 1, $data_no, value);
	}
	
	/**
	 * データＮＯ. Data No..<p>
	 *
	 */
	public void data_no(double value) {
		setConstNumber(offset + 1, $data_no, value);
	}
	
	/**
	 * データ更新区分. Data update type.<p>
	 *
	 */
	public String data_crud_typ() {
		return getConstString(offset + 2, $data_crud_typ);
	}

	/**
	 * データ更新区分. Data update type.<p>
	 *
	 */
	public void data_crud_typ(String value) {
		setConstString(offset + 2, $data_crud_typ, value);
	}

	/**
	 * ＰＧ実行状況区分. PG execution status type.<p>
	 *
	 */
	public String exe_sts_typ() {
		return getConstString(offset + 3, $exe_sts_typ);
	}

	/**
	 * ＰＧ実行状況区分. PG execution status type.<p>
	 *
	 */
	public void exe_sts_typ(String value) {
		setConstString(offset + 3, $exe_sts_typ, value);
	}

	/**
	 * 外部システムＣＤ. External system cd..<p>
	 *
	 */
	public String ext_sys_cd() {
		return getConstString(offset + 4, $ext_sys_cd);
	}

	/**
	 * 外部システムＣＤ. External system cd..<p>
	 *
	 */
	public void ext_sys_cd(String value) {
		setConstString(offset + 4, $ext_sys_cd, value);
	}

	/**
	 * 外部システムデータＮＯ. External system data No..<p>
	 *
	 */
	public MCNumber ext_data_no() {
		return getConstNumber(offset + 5, $ext_data_no);
	}

	/**
	 * 外部システムデータＮＯ. External system data No..<p>
	 *
	 */
	public void ext_data_no(MCNumber value) {
		setConstNumber(offset + 5, $ext_data_no, value);
	}
	
	/**
	 * 外部システムデータＮＯ. External system data No..<p>
	 *
	 */
	public void ext_data_no(int value) {
		setConstNumber(offset + 5, $ext_data_no, value);
	}
	
	/**
	 * 外部システムデータＮＯ. External system data No..<p>
	 *
	 */
	public void ext_data_no(long value) {
		setConstNumber(offset + 5, $ext_data_no, value);
	}
	
	/**
	 * 外部システムデータＮＯ. External system data No..<p>
	 *
	 */
	public void ext_data_no(float value) {
		setConstNumber(offset + 5, $ext_data_no, value);
	}
	
	/**
	 * 外部システムデータＮＯ. External system data No..<p>
	 *
	 */
	public void ext_data_no(double value) {
		setConstNumber(offset + 5, $ext_data_no, value);
	}
	
	/**
	 * 外部システムデータ行ＮＯ. External system data row No..<p>
	 *
	 */
	public MCNumber ext_data_lno() {
		return getConstNumber(offset + 6, $ext_data_lno);
	}

	/**
	 * 外部システムデータ行ＮＯ. External system data row No..<p>
	 *
	 */
	public void ext_data_lno(MCNumber value) {
		setConstNumber(offset + 6, $ext_data_lno, value);
	}
	
	/**
	 * 外部システムデータ行ＮＯ. External system data row No..<p>
	 *
	 */
	public void ext_data_lno(int value) {
		setConstNumber(offset + 6, $ext_data_lno, value);
	}
	
	/**
	 * 外部システムデータ行ＮＯ. External system data row No..<p>
	 *
	 */
	public void ext_data_lno(long value) {
		setConstNumber(offset + 6, $ext_data_lno, value);
	}
	
	/**
	 * 外部システムデータ行ＮＯ. External system data row No..<p>
	 *
	 */
	public void ext_data_lno(float value) {
		setConstNumber(offset + 6, $ext_data_lno, value);
	}
	
	/**
	 * 外部システムデータ行ＮＯ. External system data row No..<p>
	 *
	 */
	public void ext_data_lno(double value) {
		setConstNumber(offset + 6, $ext_data_lno, value);
	}
	
	/**
	 * 送信元レコード作成日時. Creation date and time of source record.<p>
	 *
	 */
	public MCDate data_make_dt() {
		return getConstDate(offset + 7, $data_make_dt);
	}

	/**
	 * 送信元レコード作成日時. Creation date and time of source record.<p>
	 *
	 */
	public void data_make_dt(MCDate value) {
		setConstDate(offset + 7, $data_make_dt, value);
	}

	/**
	 * 取込対象ＦＬＧ. To import flg..<p>
	 *
	 */
	public boolean imp_flg() {
		return getConstBoolean(offset + 8, $imp_flg);
	}

	/**
	 * 取込対象ＦＬＧ. To import flg..<p>
	 *
	 */
	public void imp_flg(boolean value) {
		setConstBoolean(offset + 8, $imp_flg, value);
	}

	/**
	 * 受信日. Receiving date.<p>
	 *
	 */
	public MCDate recv_dt() {
		return getConstDate(offset + 9, $recv_dt);
	}

	/**
	 * 受信日. Receiving date.<p>
	 *
	 */
	public void recv_dt(MCDate value) {
		setConstDate(offset + 9, $recv_dt, value);
	}

	/**
	 * 外部入金ＮＯ. External payment received No..<p>
	 *
	 */
	public String ext_rcv_no() {
		return getConstString(offset + 10, $ext_rcv_no);
	}

	/**
	 * 外部入金ＮＯ. External payment received No..<p>
	 *
	 */
	public void ext_rcv_no(String value) {
		setConstString(offset + 10, $ext_rcv_no, value);
	}

	/**
	 * 入金先ＣＤ. Payer cd..<p>
	 *
	 */
	public String rcst_cd() {
		return getConstString(offset + 11, $rcst_cd);
	}

	/**
	 * 入金先ＣＤ. Payer cd..<p>
	 *
	 */
	public void rcst_cd(String value) {
		setConstString(offset + 11, $rcst_cd, value);
	}

	/**
	 * ＩＦ入金先ＣＤ. IF payer cd..<p>
	 *
	 */
	public String if_rcst_cd() {
		return getConstString(offset + 12, $if_rcst_cd);
	}

	/**
	 * ＩＦ入金先ＣＤ. IF payer cd..<p>
	 *
	 */
	public void if_rcst_cd(String value) {
		setConstString(offset + 12, $if_rcst_cd, value);
	}

	/**
	 * ＩＦ入金先名. IF payer name.<p>
	 *
	 */
	public String if_rcst_nm() {
		return getConstString(offset + 13, $if_rcst_nm);
	}

	/**
	 * ＩＦ入金先名. IF payer name.<p>
	 *
	 */
	public void if_rcst_nm(String value) {
		setConstString(offset + 13, $if_rcst_nm, value);
	}

	/**
	 * 請求先ＣＤ. Billing customer cd..<p>
	 *
	 */
	public String bcst_cd() {
		return getConstString(offset + 14, $bcst_cd);
	}

	/**
	 * 請求先ＣＤ. Billing customer cd..<p>
	 *
	 */
	public void bcst_cd(String value) {
		setConstString(offset + 14, $bcst_cd, value);
	}

	/**
	 * ＩＦ請求先ＣＤ. IF billing customer cd..<p>
	 *
	 */
	public String if_bcst_cd() {
		return getConstString(offset + 15, $if_bcst_cd);
	}

	/**
	 * ＩＦ請求先ＣＤ. IF billing customer cd..<p>
	 *
	 */
	public void if_bcst_cd(String value) {
		setConstString(offset + 15, $if_bcst_cd, value);
	}

	/**
	 * ＩＦ請求先名. IF billing customer name.<p>
	 *
	 */
	public String if_bcst_nm() {
		return getConstString(offset + 16, $if_bcst_nm);
	}

	/**
	 * ＩＦ請求先名. IF billing customer name.<p>
	 *
	 */
	public void if_bcst_nm(String value) {
		setConstString(offset + 16, $if_bcst_nm, value);
	}

	/**
	 * 請求部門ＣＤ. Billing dept. cd..<p>
	 *
	 */
	public String bill_dpt_cd() {
		return getConstString(offset + 17, $bill_dpt_cd);
	}

	/**
	 * 請求部門ＣＤ. Billing dept. cd..<p>
	 *
	 */
	public void bill_dpt_cd(String value) {
		setConstString(offset + 17, $bill_dpt_cd, value);
	}

	/**
	 * ＩＦ請求部門ＣＤ. IF billing dept. cd..<p>
	 *
	 */
	public String if_bill_dpt_cd() {
		return getConstString(offset + 18, $if_bill_dpt_cd);
	}

	/**
	 * ＩＦ請求部門ＣＤ. IF billing dept. cd..<p>
	 *
	 */
	public void if_bill_dpt_cd(String value) {
		setConstString(offset + 18, $if_bill_dpt_cd, value);
	}

	/**
	 * ＩＦ請求部門名. IF billing dept. name.<p>
	 *
	 */
	public String if_bill_dpt_nm() {
		return getConstString(offset + 19, $if_bill_dpt_nm);
	}

	/**
	 * ＩＦ請求部門名. IF billing dept. name.<p>
	 *
	 */
	public void if_bill_dpt_nm(String value) {
		setConstString(offset + 19, $if_bill_dpt_nm, value);
	}

	/**
	 * 入金部門ＣＤ. Payment receiving dept. cd..<p>
	 *
	 */
	public String rcv_dpt_cd() {
		return getConstString(offset + 20, $rcv_dpt_cd);
	}

	/**
	 * 入金部門ＣＤ. Payment receiving dept. cd..<p>
	 *
	 */
	public void rcv_dpt_cd(String value) {
		setConstString(offset + 20, $rcv_dpt_cd, value);
	}

	/**
	 * ＩＦ入金部門ＣＤ. IF payment receiving dept. cd..<p>
	 *
	 */
	public String if_rcv_dpt_cd() {
		return getConstString(offset + 21, $if_rcv_dpt_cd);
	}

	/**
	 * ＩＦ入金部門ＣＤ. IF payment receiving dept. cd..<p>
	 *
	 */
	public void if_rcv_dpt_cd(String value) {
		setConstString(offset + 21, $if_rcv_dpt_cd, value);
	}

	/**
	 * ＩＦ入金部門名. IF payment receiving dept. name.<p>
	 *
	 */
	public String if_rcv_dpt_nm() {
		return getConstString(offset + 22, $if_rcv_dpt_nm);
	}

	/**
	 * ＩＦ入金部門名. IF payment receiving dept. name.<p>
	 *
	 */
	public void if_rcv_dpt_nm(String value) {
		setConstString(offset + 22, $if_rcv_dpt_nm, value);
	}

	/**
	 * 入金担当者ＣＤ. Payment received PIC cd..<p>
	 *
	 */
	public String rcv_usr_cd() {
		return getConstString(offset + 23, $rcv_usr_cd);
	}

	/**
	 * 入金担当者ＣＤ. Payment received PIC cd..<p>
	 *
	 */
	public void rcv_usr_cd(String value) {
		setConstString(offset + 23, $rcv_usr_cd, value);
	}

	/**
	 * ＩＦ入金担当者ＣＤ. IF payment received PIC cd..<p>
	 *
	 */
	public String if_rcv_usr_cd() {
		return getConstString(offset + 24, $if_rcv_usr_cd);
	}

	/**
	 * ＩＦ入金担当者ＣＤ. IF payment received PIC cd..<p>
	 *
	 */
	public void if_rcv_usr_cd(String value) {
		setConstString(offset + 24, $if_rcv_usr_cd, value);
	}

	/**
	 * ＩＦ入金担当者名. IF payment received PIC name.<p>
	 *
	 */
	public String if_rcv_usr_nm() {
		return getConstString(offset + 25, $if_rcv_usr_nm);
	}

	/**
	 * ＩＦ入金担当者名. IF payment received PIC name.<p>
	 *
	 */
	public void if_rcv_usr_nm(String value) {
		setConstString(offset + 25, $if_rcv_usr_nm, value);
	}

	/**
	 * 入金日. Payment received date.<p>
	 *
	 */
	public MCDate rcv_dt() {
		return getConstDate(offset + 26, $rcv_dt);
	}

	/**
	 * 入金日. Payment received date.<p>
	 *
	 */
	public void rcv_dt(MCDate value) {
		setConstDate(offset + 26, $rcv_dt, value);
	}

	/**
	 * 債権決済区分. AR settlement type.<p>
	 *
	 */
	public String ar_sttl_typ() {
		return getConstString(offset + 27, $ar_sttl_typ);
	}

	/**
	 * 債権決済区分. AR settlement type.<p>
	 *
	 */
	public void ar_sttl_typ(String value) {
		setConstString(offset + 27, $ar_sttl_typ, value);
	}

	/**
	 * 銀行ＣＤ. Bank cd..<p>
	 *
	 */
	public String bank_cd() {
		return getConstString(offset + 28, $bank_cd);
	}

	/**
	 * 銀行ＣＤ. Bank cd..<p>
	 *
	 */
	public void bank_cd(String value) {
		setConstString(offset + 28, $bank_cd, value);
	}

	/**
	 * ＩＦ銀行ＣＤ. IF bank cd..<p>
	 *
	 */
	public String if_bank_cd() {
		return getConstString(offset + 29, $if_bank_cd);
	}

	/**
	 * ＩＦ銀行ＣＤ. IF bank cd..<p>
	 *
	 */
	public void if_bank_cd(String value) {
		setConstString(offset + 29, $if_bank_cd, value);
	}

	/**
	 * ＩＦ銀行名. IF bank name.<p>
	 *
	 */
	public String if_bank_nm() {
		return getConstString(offset + 30, $if_bank_nm);
	}

	/**
	 * ＩＦ銀行名. IF bank name.<p>
	 *
	 */
	public void if_bank_nm(String value) {
		setConstString(offset + 30, $if_bank_nm, value);
	}

	/**
	 * 入金方法ＣＤ. Payment received method cd..<p>
	 *
	 */
	public String rcv_mtd_cd() {
		return getConstString(offset + 31, $rcv_mtd_cd);
	}

	/**
	 * 入金方法ＣＤ. Payment received method cd..<p>
	 *
	 */
	public void rcv_mtd_cd(String value) {
		setConstString(offset + 31, $rcv_mtd_cd, value);
	}

	/**
	 * ＩＦ入金方法ＣＤ. IF payment received method cd..<p>
	 *
	 */
	public String if_rcv_mtd_cd() {
		return getConstString(offset + 32, $if_rcv_mtd_cd);
	}

	/**
	 * ＩＦ入金方法ＣＤ. IF payment received method cd..<p>
	 *
	 */
	public void if_rcv_mtd_cd(String value) {
		setConstString(offset + 32, $if_rcv_mtd_cd, value);
	}

	/**
	 * ＩＦ入金方法名. IF payment received method name.<p>
	 *
	 */
	public String if_rcv_mtd_nm() {
		return getConstString(offset + 33, $if_rcv_mtd_nm);
	}

	/**
	 * ＩＦ入金方法名. IF payment received method name.<p>
	 *
	 */
	public void if_rcv_mtd_nm(String value) {
		setConstString(offset + 33, $if_rcv_mtd_nm, value);
	}

	/**
	 * 口座ＣＤ. Bank account cd..<p>
	 *
	 */
	public String bank_ac_cd() {
		return getConstString(offset + 34, $bank_ac_cd);
	}

	/**
	 * 口座ＣＤ. Bank account cd..<p>
	 *
	 */
	public void bank_ac_cd(String value) {
		setConstString(offset + 34, $bank_ac_cd, value);
	}

	/**
	 * ＩＦ口座ＣＤ. IF bank account cd..<p>
	 *
	 */
	public String if_bank_ac_cd() {
		return getConstString(offset + 35, $if_bank_ac_cd);
	}

	/**
	 * ＩＦ口座ＣＤ. IF bank account cd..<p>
	 *
	 */
	public void if_bank_ac_cd(String value) {
		setConstString(offset + 35, $if_bank_ac_cd, value);
	}

	/**
	 * ＩＦ口座名. IF bank account name.<p>
	 *
	 */
	public String if_bank_ac_nm() {
		return getConstString(offset + 36, $if_bank_ac_nm);
	}

	/**
	 * ＩＦ口座名. IF bank account name.<p>
	 *
	 */
	public void if_bank_ac_nm(String value) {
		setConstString(offset + 36, $if_bank_ac_nm, value);
	}

	/**
	 * 振込人名. Payment person name.<p>
	 *
	 */
	public String xfr_psn() {
		return getConstString(offset + 37, $xfr_psn);
	}

	/**
	 * 振込人名. Payment person name.<p>
	 *
	 */
	public void xfr_psn(String value) {
		setConstString(offset + 37, $xfr_psn, value);
	}

	/**
	 * 取引通貨ＣＤ. Transaction currency cd..<p>
	 *
	 */
	public String trd_cur_cd() {
		return getConstString(offset + 38, $trd_cur_cd);
	}

	/**
	 * 取引通貨ＣＤ. Transaction currency cd..<p>
	 *
	 */
	public void trd_cur_cd(String value) {
		setConstString(offset + 38, $trd_cur_cd, value);
	}

	/**
	 * ＩＦ取引通貨ＣＤ. IF transaction currency cd..<p>
	 *
	 */
	public String if_trd_cur_cd() {
		return getConstString(offset + 39, $if_trd_cur_cd);
	}

	/**
	 * ＩＦ取引通貨ＣＤ. IF transaction currency cd..<p>
	 *
	 */
	public void if_trd_cur_cd(String value) {
		setConstString(offset + 39, $if_trd_cur_cd, value);
	}

	/**
	 * ＩＦ取引通貨名. IF transaction currency name.<p>
	 *
	 */
	public String if_trd_cur_nm() {
		return getConstString(offset + 40, $if_trd_cur_nm);
	}

	/**
	 * ＩＦ取引通貨名. IF transaction currency name.<p>
	 *
	 */
	public void if_trd_cur_nm(String value) {
		setConstString(offset + 40, $if_trd_cur_nm, value);
	}

	/**
	 * 為替レート. Exchange rate.<p>
	 *
	 */
	public MCNumber xrate() {
		return getConstNumber(offset + 41, $xrate);
	}

	/**
	 * 為替レート. Exchange rate.<p>
	 *
	 */
	public void xrate(MCNumber value) {
		setConstNumber(offset + 41, $xrate, value);
	}
	
	/**
	 * 為替レート. Exchange rate.<p>
	 *
	 */
	public void xrate(int value) {
		setConstNumber(offset + 41, $xrate, value);
	}
	
	/**
	 * 為替レート. Exchange rate.<p>
	 *
	 */
	public void xrate(long value) {
		setConstNumber(offset + 41, $xrate, value);
	}
	
	/**
	 * 為替レート. Exchange rate.<p>
	 *
	 */
	public void xrate(float value) {
		setConstNumber(offset + 41, $xrate, value);
	}
	
	/**
	 * 為替レート. Exchange rate.<p>
	 *
	 */
	public void xrate(double value) {
		setConstNumber(offset + 41, $xrate, value);
	}
	
	/**
	 * 入金額. Payment received amount.<p>
	 *
	 */
	public MCNumber rcv_amt() {
		return getConstNumber(offset + 42, $rcv_amt);
	}

	/**
	 * 入金額. Payment received amount.<p>
	 *
	 */
	public void rcv_amt(MCNumber value) {
		setConstNumber(offset + 42, $rcv_amt, value);
	}
	
	/**
	 * 入金額. Payment received amount.<p>
	 *
	 */
	public void rcv_amt(int value) {
		setConstNumber(offset + 42, $rcv_amt, value);
	}
	
	/**
	 * 入金額. Payment received amount.<p>
	 *
	 */
	public void rcv_amt(long value) {
		setConstNumber(offset + 42, $rcv_amt, value);
	}
	
	/**
	 * 入金額. Payment received amount.<p>
	 *
	 */
	public void rcv_amt(float value) {
		setConstNumber(offset + 42, $rcv_amt, value);
	}
	
	/**
	 * 入金額. Payment received amount.<p>
	 *
	 */
	public void rcv_amt(double value) {
		setConstNumber(offset + 42, $rcv_amt, value);
	}
	
	/**
	 * 振込手数料. Transfer fee.<p>
	 *
	 */
	public MCNumber com_paid() {
		return getConstNumber(offset + 43, $com_paid);
	}

	/**
	 * 振込手数料. Transfer fee.<p>
	 *
	 */
	public void com_paid(MCNumber value) {
		setConstNumber(offset + 43, $com_paid, value);
	}
	
	/**
	 * 振込手数料. Transfer fee.<p>
	 *
	 */
	public void com_paid(int value) {
		setConstNumber(offset + 43, $com_paid, value);
	}
	
	/**
	 * 振込手数料. Transfer fee.<p>
	 *
	 */
	public void com_paid(long value) {
		setConstNumber(offset + 43, $com_paid, value);
	}
	
	/**
	 * 振込手数料. Transfer fee.<p>
	 *
	 */
	public void com_paid(float value) {
		setConstNumber(offset + 43, $com_paid, value);
	}
	
	/**
	 * 振込手数料. Transfer fee.<p>
	 *
	 */
	public void com_paid(double value) {
		setConstNumber(offset + 43, $com_paid, value);
	}
	
	/**
	 * 入金備考. Payment received remarks.<p>
	 *
	 */
	public String rcv_rmrks() {
		return getConstString(offset + 44, $rcv_rmrks);
	}

	/**
	 * 入金備考. Payment received remarks.<p>
	 *
	 */
	public void rcv_rmrks(String value) {
		setConstString(offset + 44, $rcv_rmrks, value);
	}

	/**
	 * 手形番号. Note number.<p>
	 *
	 */
	public String note_no() {
		return getConstString(offset + 45, $note_no);
	}

	/**
	 * 手形番号. Note number.<p>
	 *
	 */
	public void note_no(String value) {
		setConstString(offset + 45, $note_no, value);
	}

	/**
	 * 手形区分. Note type.<p>
	 *
	 */
	public String note_typ() {
		return getConstString(offset + 46, $note_typ);
	}

	/**
	 * 手形区分. Note type.<p>
	 *
	 */
	public void note_typ(String value) {
		setConstString(offset + 46, $note_typ, value);
	}

	/**
	 * 振出日. Drawing date.<p>
	 *
	 */
	public MCDate draw_dt() {
		return getConstDate(offset + 47, $draw_dt);
	}

	/**
	 * 振出日. Drawing date.<p>
	 *
	 */
	public void draw_dt(MCDate value) {
		setConstDate(offset + 47, $draw_dt, value);
	}

	/**
	 * 支払期日. Payment due date.<p>
	 *
	 */
	public MCDate due_dt() {
		return getConstDate(offset + 48, $due_dt);
	}

	/**
	 * 支払期日. Payment due date.<p>
	 *
	 */
	public void due_dt(MCDate value) {
		setConstDate(offset + 48, $due_dt, value);
	}

	/**
	 * 振出人名. Drawer name.<p>
	 *
	 */
	public String drawer_nm() {
		return getConstString(offset + 49, $drawer_nm);
	}

	/**
	 * 振出人名. Drawer name.<p>
	 *
	 */
	public void drawer_nm(String value) {
		setConstString(offset + 49, $drawer_nm, value);
	}

	/**
	 * 裏書人. Endorser.<p>
	 *
	 */
	public String endrsr() {
		return getConstString(offset + 50, $endrsr);
	}

	/**
	 * 裏書人. Endorser.<p>
	 *
	 */
	public void endrsr(String value) {
		setConstString(offset + 50, $endrsr, value);
	}

	/**
	 * 引受人. Accepted by.<p>
	 *
	 */
	public String accptr() {
		return getConstString(offset + 51, $accptr);
	}

	/**
	 * 引受人. Accepted by.<p>
	 *
	 */
	public void accptr(String value) {
		setConstString(offset + 51, $accptr, value);
	}

	/**
	 * 手形理由ＣＤ. Note reason cd..<p>
	 *
	 */
	public String note_rsn_cd() {
		return getConstString(offset + 52, $note_rsn_cd);
	}

	/**
	 * 手形理由ＣＤ. Note reason cd..<p>
	 *
	 */
	public void note_rsn_cd(String value) {
		setConstString(offset + 52, $note_rsn_cd, value);
	}

	/**
	 * ＩＦ手形理由ＣＤ. IF note reason cd..<p>
	 *
	 */
	public String if_note_rsn_cd() {
		return getConstString(offset + 53, $if_note_rsn_cd);
	}

	/**
	 * ＩＦ手形理由ＣＤ. IF note reason cd..<p>
	 *
	 */
	public void if_note_rsn_cd(String value) {
		setConstString(offset + 53, $if_note_rsn_cd, value);
	}

	/**
	 * ＩＦ手形理由名. IF note reason name.<p>
	 *
	 */
	public String if_note_rsn_nm() {
		return getConstString(offset + 54, $if_note_rsn_nm);
	}

	/**
	 * ＩＦ手形理由名. IF note reason name.<p>
	 *
	 */
	public void if_note_rsn_nm(String value) {
		setConstString(offset + 54, $if_note_rsn_nm, value);
	}

	/**
	 * 振出銀行. Drawing bank.<p>
	 *
	 */
	public String draw_bank_cd() {
		return getConstString(offset + 55, $draw_bank_cd);
	}

	/**
	 * 振出銀行. Drawing bank.<p>
	 *
	 */
	public void draw_bank_cd(String value) {
		setConstString(offset + 55, $draw_bank_cd, value);
	}

	/**
	 * ＩＦ振出銀行ＣＤ. IF drawing bank cd..<p>
	 *
	 */
	public String if_draw_bank_cd() {
		return getConstString(offset + 56, $if_draw_bank_cd);
	}

	/**
	 * ＩＦ振出銀行ＣＤ. IF drawing bank cd..<p>
	 *
	 */
	public void if_draw_bank_cd(String value) {
		setConstString(offset + 56, $if_draw_bank_cd, value);
	}

	/**
	 * ＩＦ振出銀行名. IF drawing bank name.<p>
	 *
	 */
	public String if_draw_bank_nm() {
		return getConstString(offset + 57, $if_draw_bank_nm);
	}

	/**
	 * ＩＦ振出銀行名. IF drawing bank name.<p>
	 *
	 */
	public void if_draw_bank_nm(String value) {
		setConstString(offset + 57, $if_draw_bank_nm, value);
	}

	/**
	 * 振出支店. Drawing branch.<p>
	 *
	 */
	public String draw_branch_cd() {
		return getConstString(offset + 58, $draw_branch_cd);
	}

	/**
	 * 振出支店. Drawing branch.<p>
	 *
	 */
	public void draw_branch_cd(String value) {
		setConstString(offset + 58, $draw_branch_cd, value);
	}

	/**
	 * ＩＦ振出支店ＣＤ. IF drawing branch cd..<p>
	 *
	 */
	public String if_draw_branch_cd() {
		return getConstString(offset + 59, $if_draw_branch_cd);
	}

	/**
	 * ＩＦ振出支店ＣＤ. IF drawing branch cd..<p>
	 *
	 */
	public void if_draw_branch_cd(String value) {
		setConstString(offset + 59, $if_draw_branch_cd, value);
	}

	/**
	 * ＩＦ振出支店名. IF drawing branch name.<p>
	 *
	 */
	public String if_draw_branch_nm() {
		return getConstString(offset + 60, $if_draw_branch_nm);
	}

	/**
	 * ＩＦ振出支店名. IF drawing branch name.<p>
	 *
	 */
	public void if_draw_branch_nm(String value) {
		setConstString(offset + 60, $if_draw_branch_nm, value);
	}

	/**
	 * ＩＦ会社ＣＤ. IF company cd..<p>
	 *
	 */
	public String if_co_cd() {
		return getConstString(offset + 61, $if_co_cd);
	}

	/**
	 * ＩＦ会社ＣＤ. IF company cd..<p>
	 *
	 */
	public void if_co_cd(String value) {
		setConstString(offset + 61, $if_co_cd, value);
	}

	/**
	 * ＩＦ会社名. IF company name.<p>
	 *
	 */
	public String if_co_nm() {
		return getConstString(offset + 62, $if_co_nm);
	}

	/**
	 * ＩＦ会社名. IF company name.<p>
	 *
	 */
	public void if_co_nm(String value) {
		setConstString(offset + 62, $if_co_nm, value);
	}

	/**
	 * 予備ＣＨＡＲ項目１. Spare CHAR column 1.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 63, $sub_char1);
	}

	/**
	 * 予備ＣＨＡＲ項目１. Spare CHAR column 1.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 63, $sub_char1, value);
	}

	/**
	 * 予備ＣＨＡＲ項目２. Spare CHAR column 2.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 64, $sub_char2);
	}

	/**
	 * 予備ＣＨＡＲ項目２. Spare CHAR column 2.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 64, $sub_char2, value);
	}

	/**
	 * 予備ＣＨＡＲ項目３. Spare CHAR column 3.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 65, $sub_char3);
	}

	/**
	 * 予備ＣＨＡＲ項目３. Spare CHAR column 3.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 65, $sub_char3, value);
	}

	/**
	 * 予備ＣＨＡＲ項目４. Spare CHAR column 4.<p>
	 *
	 */
	public String sub_char4() {
		return getConstString(offset + 66, $sub_char4);
	}

	/**
	 * 予備ＣＨＡＲ項目４. Spare CHAR column 4.<p>
	 *
	 */
	public void sub_char4(String value) {
		setConstString(offset + 66, $sub_char4, value);
	}

	/**
	 * 予備ＣＨＡＲ項目５. Spare CHAR column 5.<p>
	 *
	 */
	public String sub_char5() {
		return getConstString(offset + 67, $sub_char5);
	}

	/**
	 * 予備ＣＨＡＲ項目５. Spare CHAR column 5.<p>
	 *
	 */
	public void sub_char5(String value) {
		setConstString(offset + 67, $sub_char5, value);
	}

	/**
	 * 予備ＣＨＡＲ項目６. Spare CHAR column 6.<p>
	 *
	 */
	public String sub_char6() {
		return getConstString(offset + 68, $sub_char6);
	}

	/**
	 * 予備ＣＨＡＲ項目６. Spare CHAR column 6.<p>
	 *
	 */
	public void sub_char6(String value) {
		setConstString(offset + 68, $sub_char6, value);
	}

	/**
	 * 予備ＣＨＡＲ項目７. Spare CHAR column 7.<p>
	 *
	 */
	public String sub_char7() {
		return getConstString(offset + 69, $sub_char7);
	}

	/**
	 * 予備ＣＨＡＲ項目７. Spare CHAR column 7.<p>
	 *
	 */
	public void sub_char7(String value) {
		setConstString(offset + 69, $sub_char7, value);
	}

	/**
	 * 予備ＣＨＡＲ項目８. Spare CHAR column 8.<p>
	 *
	 */
	public String sub_char8() {
		return getConstString(offset + 70, $sub_char8);
	}

	/**
	 * 予備ＣＨＡＲ項目８. Spare CHAR column 8.<p>
	 *
	 */
	public void sub_char8(String value) {
		setConstString(offset + 70, $sub_char8, value);
	}

	/**
	 * 予備ＣＨＡＲ項目９. Spare CHAR column 9.<p>
	 *
	 */
	public String sub_char9() {
		return getConstString(offset + 71, $sub_char9);
	}

	/**
	 * 予備ＣＨＡＲ項目９. Spare CHAR column 9.<p>
	 *
	 */
	public void sub_char9(String value) {
		setConstString(offset + 71, $sub_char9, value);
	}

	/**
	 * 予備ＣＨＡＲ項目１０. Spare CHAR column 10.<p>
	 *
	 */
	public String sub_char10() {
		return getConstString(offset + 72, $sub_char10);
	}

	/**
	 * 予備ＣＨＡＲ項目１０. Spare CHAR column 10.<p>
	 *
	 */
	public void sub_char10(String value) {
		setConstString(offset + 72, $sub_char10, value);
	}

	/**
	 * 予備ＣＨＡＲ項目１１. Spare CHAR column 11.<p>
	 *
	 */
	public String sub_char11() {
		return getConstString(offset + 73, $sub_char11);
	}

	/**
	 * 予備ＣＨＡＲ項目１１. Spare CHAR column 11.<p>
	 *
	 */
	public void sub_char11(String value) {
		setConstString(offset + 73, $sub_char11, value);
	}

	/**
	 * 予備ＣＨＡＲ項目１２. Spare CHAR column 12.<p>
	 *
	 */
	public String sub_char12() {
		return getConstString(offset + 74, $sub_char12);
	}

	/**
	 * 予備ＣＨＡＲ項目１２. Spare CHAR column 12.<p>
	 *
	 */
	public void sub_char12(String value) {
		setConstString(offset + 74, $sub_char12, value);
	}

	/**
	 * 予備ＣＨＡＲ項目１３. Spare CHAR column 13.<p>
	 *
	 */
	public String sub_char13() {
		return getConstString(offset + 75, $sub_char13);
	}

	/**
	 * 予備ＣＨＡＲ項目１３. Spare CHAR column 13.<p>
	 *
	 */
	public void sub_char13(String value) {
		setConstString(offset + 75, $sub_char13, value);
	}

	/**
	 * 予備ＣＨＡＲ項目１４. Spare CHAR column 14.<p>
	 *
	 */
	public String sub_char14() {
		return getConstString(offset + 76, $sub_char14);
	}

	/**
	 * 予備ＣＨＡＲ項目１４. Spare CHAR column 14.<p>
	 *
	 */
	public void sub_char14(String value) {
		setConstString(offset + 76, $sub_char14, value);
	}

	/**
	 * 予備ＣＨＡＲ項目１５. Spare CHAR column 15.<p>
	 *
	 */
	public String sub_char15() {
		return getConstString(offset + 77, $sub_char15);
	}

	/**
	 * 予備ＣＨＡＲ項目１５. Spare CHAR column 15.<p>
	 *
	 */
	public void sub_char15(String value) {
		setConstString(offset + 77, $sub_char15, value);
	}

	/**
	 * 予備ＣＨＡＲ項目１６. Spare CHAR column 16.<p>
	 *
	 */
	public String sub_char16() {
		return getConstString(offset + 78, $sub_char16);
	}

	/**
	 * 予備ＣＨＡＲ項目１６. Spare CHAR column 16.<p>
	 *
	 */
	public void sub_char16(String value) {
		setConstString(offset + 78, $sub_char16, value);
	}

	/**
	 * 予備ＣＨＡＲ項目１７. Spare CHAR column 17.<p>
	 *
	 */
	public String sub_char17() {
		return getConstString(offset + 79, $sub_char17);
	}

	/**
	 * 予備ＣＨＡＲ項目１７. Spare CHAR column 17.<p>
	 *
	 */
	public void sub_char17(String value) {
		setConstString(offset + 79, $sub_char17, value);
	}

	/**
	 * 予備ＣＨＡＲ項目１８. Spare CHAR column 18.<p>
	 *
	 */
	public String sub_char18() {
		return getConstString(offset + 80, $sub_char18);
	}

	/**
	 * 予備ＣＨＡＲ項目１８. Spare CHAR column 18.<p>
	 *
	 */
	public void sub_char18(String value) {
		setConstString(offset + 80, $sub_char18, value);
	}

	/**
	 * 予備ＣＨＡＲ項目１９. Spare CHAR column 19.<p>
	 *
	 */
	public String sub_char19() {
		return getConstString(offset + 81, $sub_char19);
	}

	/**
	 * 予備ＣＨＡＲ項目１９. Spare CHAR column 19.<p>
	 *
	 */
	public void sub_char19(String value) {
		setConstString(offset + 81, $sub_char19, value);
	}

	/**
	 * 予備ＣＨＡＲ項目２０. Spare CHAR column 20.<p>
	 *
	 */
	public String sub_char20() {
		return getConstString(offset + 82, $sub_char20);
	}

	/**
	 * 予備ＣＨＡＲ項目２０. Spare CHAR column 20.<p>
	 *
	 */
	public void sub_char20(String value) {
		setConstString(offset + 82, $sub_char20, value);
	}

	/**
	 * 予備ＣＨＡＲ項目２１. Spare CHAR column 21.<p>
	 *
	 */
	public String sub_char21() {
		return getConstString(offset + 83, $sub_char21);
	}

	/**
	 * 予備ＣＨＡＲ項目２１. Spare CHAR column 21.<p>
	 *
	 */
	public void sub_char21(String value) {
		setConstString(offset + 83, $sub_char21, value);
	}

	/**
	 * 予備ＣＨＡＲ項目２２. Spare CHAR column 22.<p>
	 *
	 */
	public String sub_char22() {
		return getConstString(offset + 84, $sub_char22);
	}

	/**
	 * 予備ＣＨＡＲ項目２２. Spare CHAR column 22.<p>
	 *
	 */
	public void sub_char22(String value) {
		setConstString(offset + 84, $sub_char22, value);
	}

	/**
	 * 予備ＣＨＡＲ項目２３. Spare CHAR column 23.<p>
	 *
	 */
	public String sub_char23() {
		return getConstString(offset + 85, $sub_char23);
	}

	/**
	 * 予備ＣＨＡＲ項目２３. Spare CHAR column 23.<p>
	 *
	 */
	public void sub_char23(String value) {
		setConstString(offset + 85, $sub_char23, value);
	}

	/**
	 * 予備ＣＨＡＲ項目２４. Spare CHAR column 24.<p>
	 *
	 */
	public String sub_char24() {
		return getConstString(offset + 86, $sub_char24);
	}

	/**
	 * 予備ＣＨＡＲ項目２４. Spare CHAR column 24.<p>
	 *
	 */
	public void sub_char24(String value) {
		setConstString(offset + 86, $sub_char24, value);
	}

	/**
	 * 予備ＣＨＡＲ項目２５. Spare CHAR column 25.<p>
	 *
	 */
	public String sub_char25() {
		return getConstString(offset + 87, $sub_char25);
	}

	/**
	 * 予備ＣＨＡＲ項目２５. Spare CHAR column 25.<p>
	 *
	 */
	public void sub_char25(String value) {
		setConstString(offset + 87, $sub_char25, value);
	}

	/**
	 * 予備ＣＨＡＲ項目２６. Spare CHAR column 26.<p>
	 *
	 */
	public String sub_char26() {
		return getConstString(offset + 88, $sub_char26);
	}

	/**
	 * 予備ＣＨＡＲ項目２６. Spare CHAR column 26.<p>
	 *
	 */
	public void sub_char26(String value) {
		setConstString(offset + 88, $sub_char26, value);
	}

	/**
	 * 予備ＣＨＡＲ項目２７. Spare CHAR column 27.<p>
	 *
	 */
	public String sub_char27() {
		return getConstString(offset + 89, $sub_char27);
	}

	/**
	 * 予備ＣＨＡＲ項目２７. Spare CHAR column 27.<p>
	 *
	 */
	public void sub_char27(String value) {
		setConstString(offset + 89, $sub_char27, value);
	}

	/**
	 * 予備ＣＨＡＲ項目２８. Spare CHAR column 28.<p>
	 *
	 */
	public String sub_char28() {
		return getConstString(offset + 90, $sub_char28);
	}

	/**
	 * 予備ＣＨＡＲ項目２８. Spare CHAR column 28.<p>
	 *
	 */
	public void sub_char28(String value) {
		setConstString(offset + 90, $sub_char28, value);
	}

	/**
	 * 予備ＣＨＡＲ項目２９. Spare CHAR column 29.<p>
	 *
	 */
	public String sub_char29() {
		return getConstString(offset + 91, $sub_char29);
	}

	/**
	 * 予備ＣＨＡＲ項目２９. Spare CHAR column 29.<p>
	 *
	 */
	public void sub_char29(String value) {
		setConstString(offset + 91, $sub_char29, value);
	}

	/**
	 * 予備ＣＨＡＲ項目３０. Spare CHAR column 30.<p>
	 *
	 */
	public String sub_char30() {
		return getConstString(offset + 92, $sub_char30);
	}

	/**
	 * 予備ＣＨＡＲ項目３０. Spare CHAR column 30.<p>
	 *
	 */
	public void sub_char30(String value) {
		setConstString(offset + 92, $sub_char30, value);
	}

	/**
	 * 予備ＮＵＭ項目１. Spare NUM column 1.<p>
	 *
	 */
	public MCNumber sub_num1() {
		return getConstNumber(offset + 93, $sub_num1);
	}

	/**
	 * 予備ＮＵＭ項目１. Spare NUM column 1.<p>
	 *
	 */
	public void sub_num1(MCNumber value) {
		setConstNumber(offset + 93, $sub_num1, value);
	}
	
	/**
	 * 予備ＮＵＭ項目１. Spare NUM column 1.<p>
	 *
	 */
	public void sub_num1(int value) {
		setConstNumber(offset + 93, $sub_num1, value);
	}
	
	/**
	 * 予備ＮＵＭ項目１. Spare NUM column 1.<p>
	 *
	 */
	public void sub_num1(long value) {
		setConstNumber(offset + 93, $sub_num1, value);
	}
	
	/**
	 * 予備ＮＵＭ項目１. Spare NUM column 1.<p>
	 *
	 */
	public void sub_num1(float value) {
		setConstNumber(offset + 93, $sub_num1, value);
	}
	
	/**
	 * 予備ＮＵＭ項目１. Spare NUM column 1.<p>
	 *
	 */
	public void sub_num1(double value) {
		setConstNumber(offset + 93, $sub_num1, value);
	}
	
	/**
	 * 予備ＮＵＭ項目２. Spare NUM column 2.<p>
	 *
	 */
	public MCNumber sub_num2() {
		return getConstNumber(offset + 94, $sub_num2);
	}

	/**
	 * 予備ＮＵＭ項目２. Spare NUM column 2.<p>
	 *
	 */
	public void sub_num2(MCNumber value) {
		setConstNumber(offset + 94, $sub_num2, value);
	}
	
	/**
	 * 予備ＮＵＭ項目２. Spare NUM column 2.<p>
	 *
	 */
	public void sub_num2(int value) {
		setConstNumber(offset + 94, $sub_num2, value);
	}
	
	/**
	 * 予備ＮＵＭ項目２. Spare NUM column 2.<p>
	 *
	 */
	public void sub_num2(long value) {
		setConstNumber(offset + 94, $sub_num2, value);
	}
	
	/**
	 * 予備ＮＵＭ項目２. Spare NUM column 2.<p>
	 *
	 */
	public void sub_num2(float value) {
		setConstNumber(offset + 94, $sub_num2, value);
	}
	
	/**
	 * 予備ＮＵＭ項目２. Spare NUM column 2.<p>
	 *
	 */
	public void sub_num2(double value) {
		setConstNumber(offset + 94, $sub_num2, value);
	}
	
	/**
	 * 予備ＮＵＭ項目３. Spare NUM column 3.<p>
	 *
	 */
	public MCNumber sub_num3() {
		return getConstNumber(offset + 95, $sub_num3);
	}

	/**
	 * 予備ＮＵＭ項目３. Spare NUM column 3.<p>
	 *
	 */
	public void sub_num3(MCNumber value) {
		setConstNumber(offset + 95, $sub_num3, value);
	}
	
	/**
	 * 予備ＮＵＭ項目３. Spare NUM column 3.<p>
	 *
	 */
	public void sub_num3(int value) {
		setConstNumber(offset + 95, $sub_num3, value);
	}
	
	/**
	 * 予備ＮＵＭ項目３. Spare NUM column 3.<p>
	 *
	 */
	public void sub_num3(long value) {
		setConstNumber(offset + 95, $sub_num3, value);
	}
	
	/**
	 * 予備ＮＵＭ項目３. Spare NUM column 3.<p>
	 *
	 */
	public void sub_num3(float value) {
		setConstNumber(offset + 95, $sub_num3, value);
	}
	
	/**
	 * 予備ＮＵＭ項目３. Spare NUM column 3.<p>
	 *
	 */
	public void sub_num3(double value) {
		setConstNumber(offset + 95, $sub_num3, value);
	}
	
	/**
	 * 予備ＮＵＭ項目４. Spare NUM column 4.<p>
	 *
	 */
	public MCNumber sub_num4() {
		return getConstNumber(offset + 96, $sub_num4);
	}

	/**
	 * 予備ＮＵＭ項目４. Spare NUM column 4.<p>
	 *
	 */
	public void sub_num4(MCNumber value) {
		setConstNumber(offset + 96, $sub_num4, value);
	}
	
	/**
	 * 予備ＮＵＭ項目４. Spare NUM column 4.<p>
	 *
	 */
	public void sub_num4(int value) {
		setConstNumber(offset + 96, $sub_num4, value);
	}
	
	/**
	 * 予備ＮＵＭ項目４. Spare NUM column 4.<p>
	 *
	 */
	public void sub_num4(long value) {
		setConstNumber(offset + 96, $sub_num4, value);
	}
	
	/**
	 * 予備ＮＵＭ項目４. Spare NUM column 4.<p>
	 *
	 */
	public void sub_num4(float value) {
		setConstNumber(offset + 96, $sub_num4, value);
	}
	
	/**
	 * 予備ＮＵＭ項目４. Spare NUM column 4.<p>
	 *
	 */
	public void sub_num4(double value) {
		setConstNumber(offset + 96, $sub_num4, value);
	}
	
	/**
	 * 予備ＮＵＭ項目５. Spare NUM column 5.<p>
	 *
	 */
	public MCNumber sub_num5() {
		return getConstNumber(offset + 97, $sub_num5);
	}

	/**
	 * 予備ＮＵＭ項目５. Spare NUM column 5.<p>
	 *
	 */
	public void sub_num5(MCNumber value) {
		setConstNumber(offset + 97, $sub_num5, value);
	}
	
	/**
	 * 予備ＮＵＭ項目５. Spare NUM column 5.<p>
	 *
	 */
	public void sub_num5(int value) {
		setConstNumber(offset + 97, $sub_num5, value);
	}
	
	/**
	 * 予備ＮＵＭ項目５. Spare NUM column 5.<p>
	 *
	 */
	public void sub_num5(long value) {
		setConstNumber(offset + 97, $sub_num5, value);
	}
	
	/**
	 * 予備ＮＵＭ項目５. Spare NUM column 5.<p>
	 *
	 */
	public void sub_num5(float value) {
		setConstNumber(offset + 97, $sub_num5, value);
	}
	
	/**
	 * 予備ＮＵＭ項目５. Spare NUM column 5.<p>
	 *
	 */
	public void sub_num5(double value) {
		setConstNumber(offset + 97, $sub_num5, value);
	}
	
	/**
	 * 予備ＤＡＴＥ項目１. Spare DATE column 1.<p>
	 *
	 */
	public MCDate sub_dt1() {
		return getConstDate(offset + 98, $sub_dt1);
	}

	/**
	 * 予備ＤＡＴＥ項目１. Spare DATE column 1.<p>
	 *
	 */
	public void sub_dt1(MCDate value) {
		setConstDate(offset + 98, $sub_dt1, value);
	}

	/**
	 * 予備ＤＡＴＥ項目２. Spare DATE column 2.<p>
	 *
	 */
	public MCDate sub_dt2() {
		return getConstDate(offset + 99, $sub_dt2);
	}

	/**
	 * 予備ＤＡＴＥ項目２. Spare DATE column 2.<p>
	 *
	 */
	public void sub_dt2(MCDate value) {
		setConstDate(offset + 99, $sub_dt2, value);
	}

	/**
	 * 予備ＤＡＴＥ項目３. Spare DATE column 3.<p>
	 *
	 */
	public MCDate sub_dt3() {
		return getConstDate(offset + 100, $sub_dt3);
	}

	/**
	 * 予備ＤＡＴＥ項目３. Spare DATE column 3.<p>
	 *
	 */
	public void sub_dt3(MCDate value) {
		setConstDate(offset + 100, $sub_dt3, value);
	}

	/**
	 * 予備ＤＡＴＥ項目４. Spare DATE column 4.<p>
	 *
	 */
	public MCDate sub_dt4() {
		return getConstDate(offset + 101, $sub_dt4);
	}

	/**
	 * 予備ＤＡＴＥ項目４. Spare DATE column 4.<p>
	 *
	 */
	public void sub_dt4(MCDate value) {
		setConstDate(offset + 101, $sub_dt4, value);
	}

	/**
	 * 予備ＤＡＴＥ項目５. Spare DATE column 5.<p>
	 *
	 */
	public MCDate sub_dt5() {
		return getConstDate(offset + 102, $sub_dt5);
	}

	/**
	 * 予備ＤＡＴＥ項目５. Spare DATE column 5.<p>
	 *
	 */
	public void sub_dt5(MCDate value) {
		setConstDate(offset + 102, $sub_dt5, value);
	}

	/**
	 * ログＮＯ. Log No..<p>
	 *
	 */
	public String batch_log_no() {
		return getConstString(offset + 103, $batch_log_no);
	}

	/**
	 * ログＮＯ. Log No..<p>
	 *
	 */
	public void batch_log_no(String value) {
		setConstString(offset + 103, $batch_log_no, value);
	}

	/**
	 * ログサブキー１. Log sub key 1.<p>
	 *
	 */
	public MCNumber log_sub_key1() {
		return getConstNumber(offset + 104, $log_sub_key1);
	}

	/**
	 * ログサブキー１. Log sub key 1.<p>
	 *
	 */
	public void log_sub_key1(MCNumber value) {
		setConstNumber(offset + 104, $log_sub_key1, value);
	}
	
	/**
	 * ログサブキー１. Log sub key 1.<p>
	 *
	 */
	public void log_sub_key1(int value) {
		setConstNumber(offset + 104, $log_sub_key1, value);
	}
	
	/**
	 * ログサブキー１. Log sub key 1.<p>
	 *
	 */
	public void log_sub_key1(long value) {
		setConstNumber(offset + 104, $log_sub_key1, value);
	}
	
	/**
	 * ログサブキー１. Log sub key 1.<p>
	 *
	 */
	public void log_sub_key1(float value) {
		setConstNumber(offset + 104, $log_sub_key1, value);
	}
	
	/**
	 * ログサブキー１. Log sub key 1.<p>
	 *
	 */
	public void log_sub_key1(double value) {
		setConstNumber(offset + 104, $log_sub_key1, value);
	}
	
	/**
	 * ログサブキー２. Log sub key 2.<p>
	 *
	 */
	public MCNumber log_sub_key2() {
		return getConstNumber(offset + 105, $log_sub_key2);
	}

	/**
	 * ログサブキー２. Log sub key 2.<p>
	 *
	 */
	public void log_sub_key2(MCNumber value) {
		setConstNumber(offset + 105, $log_sub_key2, value);
	}
	
	/**
	 * ログサブキー２. Log sub key 2.<p>
	 *
	 */
	public void log_sub_key2(int value) {
		setConstNumber(offset + 105, $log_sub_key2, value);
	}
	
	/**
	 * ログサブキー２. Log sub key 2.<p>
	 *
	 */
	public void log_sub_key2(long value) {
		setConstNumber(offset + 105, $log_sub_key2, value);
	}
	
	/**
	 * ログサブキー２. Log sub key 2.<p>
	 *
	 */
	public void log_sub_key2(float value) {
		setConstNumber(offset + 105, $log_sub_key2, value);
	}
	
	/**
	 * ログサブキー２. Log sub key 2.<p>
	 *
	 */
	public void log_sub_key2(double value) {
		setConstNumber(offset + 105, $log_sub_key2, value);
	}
	
	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 106, $ins_usr_id);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 106, $ins_usr_id, value);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 107, $ins_usr_nm);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 107, $ins_usr_nm, value);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 108, $ins_ts);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 108, $ins_ts, value);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 109, $ins_func_id);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 109, $ins_func_id, value);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 110, $upd_cntr);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 110, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 110, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 110, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 110, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 110, $upd_cntr, value);
	}
	
	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 111, $upd_usr_id);
	}

	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 111, $upd_usr_id, value);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 112, $upd_usr_nm);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 112, $upd_usr_nm, value);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 113, $upd_ts);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 113, $upd_ts, value);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 114, $upd_func_id);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 114, $upd_func_id, value);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 115, $upd_srv_req_no);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 115, $upd_srv_req_no, value);
	}

	/**
	 * 送受信状況区分. Exporting and importing status type.<p>
	 *
	 */
	public String sdrv_sts_typ() {
		return getConstString(offset + 116, $sdrv_sts_typ);
	}

	/**
	 * 送受信状況区分. Exporting and importing status type.<p>
	 *
	 */
	public void sdrv_sts_typ(String value) {
		setConstString(offset + 116, $sdrv_sts_typ, value);
	}

	/**
	 * 入金先名. Payer name.<p>
	 *
	 */
	public String rcst_nm() {
		return getConstString(offset + 117, $rcst_nm);
	}

	/**
	 * 入金先名. Payer name.<p>
	 *
	 */
	public void rcst_nm(String value) {
		setConstString(offset + 117, $rcst_nm, value);
	}

	/**
	 * 請求先名. Billing customer name.<p>
	 *
	 */
	public String bcst_nm() {
		return getConstString(offset + 118, $bcst_nm);
	}

	/**
	 * 請求先名. Billing customer name.<p>
	 *
	 */
	public void bcst_nm(String value) {
		setConstString(offset + 118, $bcst_nm, value);
	}

	/**
	 * 請求部門名. Billing dept. name.<p>
	 *
	 */
	public String bill_dpt_nm() {
		return getConstString(offset + 119, $bill_dpt_nm);
	}

	/**
	 * 請求部門名. Billing dept. name.<p>
	 *
	 */
	public void bill_dpt_nm(String value) {
		setConstString(offset + 119, $bill_dpt_nm, value);
	}

	/**
	 * 入金部門名. Payment receiving dept. name.<p>
	 *
	 */
	public String rcv_dpt_nm() {
		return getConstString(offset + 120, $rcv_dpt_nm);
	}

	/**
	 * 入金部門名. Payment receiving dept. name.<p>
	 *
	 */
	public void rcv_dpt_nm(String value) {
		setConstString(offset + 120, $rcv_dpt_nm, value);
	}

	/**
	 * 入金担当者名. Payment received PIC name.<p>
	 *
	 */
	public String rcv_usr_nm() {
		return getConstString(offset + 121, $rcv_usr_nm);
	}

	/**
	 * 入金担当者名. Payment received PIC name.<p>
	 *
	 */
	public void rcv_usr_nm(String value) {
		setConstString(offset + 121, $rcv_usr_nm, value);
	}

	/**
	 * 銀行名. Bank name.<p>
	 *
	 */
	public String bank_nm() {
		return getConstString(offset + 122, $bank_nm);
	}

	/**
	 * 銀行名. Bank name.<p>
	 *
	 */
	public void bank_nm(String value) {
		setConstString(offset + 122, $bank_nm, value);
	}

	/**
	 * 入金方法名. Payment received method name.<p>
	 *
	 */
	public String rcv_mtd_nm() {
		return getConstString(offset + 123, $rcv_mtd_nm);
	}

	/**
	 * 入金方法名. Payment received method name.<p>
	 *
	 */
	public void rcv_mtd_nm(String value) {
		setConstString(offset + 123, $rcv_mtd_nm, value);
	}

	/**
	 * 口座名. Bank account name.<p>
	 *
	 */
	public String bank_ac_nm() {
		return getConstString(offset + 124, $bank_ac_nm);
	}

	/**
	 * 口座名. Bank account name.<p>
	 *
	 */
	public void bank_ac_nm(String value) {
		setConstString(offset + 124, $bank_ac_nm, value);
	}

	/**
	 * 取引通貨名. Transaction currency name.<p>
	 *
	 */
	public String trd_cur_nm() {
		return getConstString(offset + 125, $trd_cur_nm);
	}

	/**
	 * 取引通貨名. Transaction currency name.<p>
	 *
	 */
	public void trd_cur_nm(String value) {
		setConstString(offset + 125, $trd_cur_nm, value);
	}

	/**
	 * 手形理由名. Note reason name.<p>
	 *
	 */
	public String note_rsn_nm() {
		return getConstString(offset + 126, $note_rsn_nm);
	}

	/**
	 * 手形理由名. Note reason name.<p>
	 *
	 */
	public void note_rsn_nm(String value) {
		setConstString(offset + 126, $note_rsn_nm, value);
	}

	/**
	 * 振出銀行名. Drawing bank name.<p>
	 *
	 */
	public String draw_bank_nm() {
		return getConstString(offset + 127, $draw_bank_nm);
	}

	/**
	 * 振出銀行名. Drawing bank name.<p>
	 *
	 */
	public void draw_bank_nm(String value) {
		setConstString(offset + 127, $draw_bank_nm, value);
	}

	/**
	 * 振出支店名. Drawing branch name.<p>
	 *
	 */
	public String draw_branch_nm() {
		return getConstString(offset + 128, $draw_branch_nm);
	}

	/**
	 * 振出支店名. Drawing branch name.<p>
	 *
	 */
	public void draw_branch_nm(String value) {
		setConstString(offset + 128, $draw_branch_nm, value);
	}

	public String getString(String name) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($exe_sts_typ.equalsIgnoreCase(name)) {
			return exe_sts_typ();
		}
		if ($ext_sys_cd.equalsIgnoreCase(name)) {
			return ext_sys_cd();
		}
		if ($ext_rcv_no.equalsIgnoreCase(name)) {
			return ext_rcv_no();
		}
		if ($rcst_cd.equalsIgnoreCase(name)) {
			return rcst_cd();
		}
		if ($if_rcst_cd.equalsIgnoreCase(name)) {
			return if_rcst_cd();
		}
		if ($if_rcst_nm.equalsIgnoreCase(name)) {
			return if_rcst_nm();
		}
		if ($bcst_cd.equalsIgnoreCase(name)) {
			return bcst_cd();
		}
		if ($if_bcst_cd.equalsIgnoreCase(name)) {
			return if_bcst_cd();
		}
		if ($if_bcst_nm.equalsIgnoreCase(name)) {
			return if_bcst_nm();
		}
		if ($bill_dpt_cd.equalsIgnoreCase(name)) {
			return bill_dpt_cd();
		}
		if ($if_bill_dpt_cd.equalsIgnoreCase(name)) {
			return if_bill_dpt_cd();
		}
		if ($if_bill_dpt_nm.equalsIgnoreCase(name)) {
			return if_bill_dpt_nm();
		}
		if ($rcv_dpt_cd.equalsIgnoreCase(name)) {
			return rcv_dpt_cd();
		}
		if ($if_rcv_dpt_cd.equalsIgnoreCase(name)) {
			return if_rcv_dpt_cd();
		}
		if ($if_rcv_dpt_nm.equalsIgnoreCase(name)) {
			return if_rcv_dpt_nm();
		}
		if ($rcv_usr_cd.equalsIgnoreCase(name)) {
			return rcv_usr_cd();
		}
		if ($if_rcv_usr_cd.equalsIgnoreCase(name)) {
			return if_rcv_usr_cd();
		}
		if ($if_rcv_usr_nm.equalsIgnoreCase(name)) {
			return if_rcv_usr_nm();
		}
		if ($ar_sttl_typ.equalsIgnoreCase(name)) {
			return ar_sttl_typ();
		}
		if ($bank_cd.equalsIgnoreCase(name)) {
			return bank_cd();
		}
		if ($if_bank_cd.equalsIgnoreCase(name)) {
			return if_bank_cd();
		}
		if ($if_bank_nm.equalsIgnoreCase(name)) {
			return if_bank_nm();
		}
		if ($rcv_mtd_cd.equalsIgnoreCase(name)) {
			return rcv_mtd_cd();
		}
		if ($if_rcv_mtd_cd.equalsIgnoreCase(name)) {
			return if_rcv_mtd_cd();
		}
		if ($if_rcv_mtd_nm.equalsIgnoreCase(name)) {
			return if_rcv_mtd_nm();
		}
		if ($bank_ac_cd.equalsIgnoreCase(name)) {
			return bank_ac_cd();
		}
		if ($if_bank_ac_cd.equalsIgnoreCase(name)) {
			return if_bank_ac_cd();
		}
		if ($if_bank_ac_nm.equalsIgnoreCase(name)) {
			return if_bank_ac_nm();
		}
		if ($xfr_psn.equalsIgnoreCase(name)) {
			return xfr_psn();
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($if_trd_cur_cd.equalsIgnoreCase(name)) {
			return if_trd_cur_cd();
		}
		if ($if_trd_cur_nm.equalsIgnoreCase(name)) {
			return if_trd_cur_nm();
		}
		if ($rcv_rmrks.equalsIgnoreCase(name)) {
			return rcv_rmrks();
		}
		if ($note_no.equalsIgnoreCase(name)) {
			return note_no();
		}
		if ($note_typ.equalsIgnoreCase(name)) {
			return note_typ();
		}
		if ($drawer_nm.equalsIgnoreCase(name)) {
			return drawer_nm();
		}
		if ($endrsr.equalsIgnoreCase(name)) {
			return endrsr();
		}
		if ($accptr.equalsIgnoreCase(name)) {
			return accptr();
		}
		if ($note_rsn_cd.equalsIgnoreCase(name)) {
			return note_rsn_cd();
		}
		if ($if_note_rsn_cd.equalsIgnoreCase(name)) {
			return if_note_rsn_cd();
		}
		if ($if_note_rsn_nm.equalsIgnoreCase(name)) {
			return if_note_rsn_nm();
		}
		if ($draw_bank_cd.equalsIgnoreCase(name)) {
			return draw_bank_cd();
		}
		if ($if_draw_bank_cd.equalsIgnoreCase(name)) {
			return if_draw_bank_cd();
		}
		if ($if_draw_bank_nm.equalsIgnoreCase(name)) {
			return if_draw_bank_nm();
		}
		if ($draw_branch_cd.equalsIgnoreCase(name)) {
			return draw_branch_cd();
		}
		if ($if_draw_branch_cd.equalsIgnoreCase(name)) {
			return if_draw_branch_cd();
		}
		if ($if_draw_branch_nm.equalsIgnoreCase(name)) {
			return if_draw_branch_nm();
		}
		if ($if_co_cd.equalsIgnoreCase(name)) {
			return if_co_cd();
		}
		if ($if_co_nm.equalsIgnoreCase(name)) {
			return if_co_nm();
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
		if ($sub_char4.equalsIgnoreCase(name)) {
			return sub_char4();
		}
		if ($sub_char5.equalsIgnoreCase(name)) {
			return sub_char5();
		}
		if ($sub_char6.equalsIgnoreCase(name)) {
			return sub_char6();
		}
		if ($sub_char7.equalsIgnoreCase(name)) {
			return sub_char7();
		}
		if ($sub_char8.equalsIgnoreCase(name)) {
			return sub_char8();
		}
		if ($sub_char9.equalsIgnoreCase(name)) {
			return sub_char9();
		}
		if ($sub_char10.equalsIgnoreCase(name)) {
			return sub_char10();
		}
		if ($sub_char11.equalsIgnoreCase(name)) {
			return sub_char11();
		}
		if ($sub_char12.equalsIgnoreCase(name)) {
			return sub_char12();
		}
		if ($sub_char13.equalsIgnoreCase(name)) {
			return sub_char13();
		}
		if ($sub_char14.equalsIgnoreCase(name)) {
			return sub_char14();
		}
		if ($sub_char15.equalsIgnoreCase(name)) {
			return sub_char15();
		}
		if ($sub_char16.equalsIgnoreCase(name)) {
			return sub_char16();
		}
		if ($sub_char17.equalsIgnoreCase(name)) {
			return sub_char17();
		}
		if ($sub_char18.equalsIgnoreCase(name)) {
			return sub_char18();
		}
		if ($sub_char19.equalsIgnoreCase(name)) {
			return sub_char19();
		}
		if ($sub_char20.equalsIgnoreCase(name)) {
			return sub_char20();
		}
		if ($sub_char21.equalsIgnoreCase(name)) {
			return sub_char21();
		}
		if ($sub_char22.equalsIgnoreCase(name)) {
			return sub_char22();
		}
		if ($sub_char23.equalsIgnoreCase(name)) {
			return sub_char23();
		}
		if ($sub_char24.equalsIgnoreCase(name)) {
			return sub_char24();
		}
		if ($sub_char25.equalsIgnoreCase(name)) {
			return sub_char25();
		}
		if ($sub_char26.equalsIgnoreCase(name)) {
			return sub_char26();
		}
		if ($sub_char27.equalsIgnoreCase(name)) {
			return sub_char27();
		}
		if ($sub_char28.equalsIgnoreCase(name)) {
			return sub_char28();
		}
		if ($sub_char29.equalsIgnoreCase(name)) {
			return sub_char29();
		}
		if ($sub_char30.equalsIgnoreCase(name)) {
			return sub_char30();
		}
		if ($batch_log_no.equalsIgnoreCase(name)) {
			return batch_log_no();
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
		if ($sdrv_sts_typ.equalsIgnoreCase(name)) {
			return sdrv_sts_typ();
		}
		if ($rcst_nm.equalsIgnoreCase(name)) {
			return rcst_nm();
		}
		if ($bcst_nm.equalsIgnoreCase(name)) {
			return bcst_nm();
		}
		if ($bill_dpt_nm.equalsIgnoreCase(name)) {
			return bill_dpt_nm();
		}
		if ($rcv_dpt_nm.equalsIgnoreCase(name)) {
			return rcv_dpt_nm();
		}
		if ($rcv_usr_nm.equalsIgnoreCase(name)) {
			return rcv_usr_nm();
		}
		if ($bank_nm.equalsIgnoreCase(name)) {
			return bank_nm();
		}
		if ($rcv_mtd_nm.equalsIgnoreCase(name)) {
			return rcv_mtd_nm();
		}
		if ($bank_ac_nm.equalsIgnoreCase(name)) {
			return bank_ac_nm();
		}
		if ($trd_cur_nm.equalsIgnoreCase(name)) {
			return trd_cur_nm();
		}
		if ($note_rsn_nm.equalsIgnoreCase(name)) {
			return note_rsn_nm();
		}
		if ($draw_bank_nm.equalsIgnoreCase(name)) {
			return draw_bank_nm();
		}
		if ($draw_branch_nm.equalsIgnoreCase(name)) {
			return draw_branch_nm();
		}
		return super.getString(name);
	}

	public MCNumber getNumber(String name) {
		if ($data_lno.equalsIgnoreCase(name)) {
			return data_lno();
		}
		if ($data_no.equalsIgnoreCase(name)) {
			return data_no();
		}
		if ($ext_data_no.equalsIgnoreCase(name)) {
			return ext_data_no();
		}
		if ($ext_data_lno.equalsIgnoreCase(name)) {
			return ext_data_lno();
		}
		if ($xrate.equalsIgnoreCase(name)) {
			return xrate();
		}
		if ($rcv_amt.equalsIgnoreCase(name)) {
			return rcv_amt();
		}
		if ($com_paid.equalsIgnoreCase(name)) {
			return com_paid();
		}
		if ($sub_num1.equalsIgnoreCase(name)) {
			return sub_num1();
		}
		if ($sub_num2.equalsIgnoreCase(name)) {
			return sub_num2();
		}
		if ($sub_num3.equalsIgnoreCase(name)) {
			return sub_num3();
		}
		if ($sub_num4.equalsIgnoreCase(name)) {
			return sub_num4();
		}
		if ($sub_num5.equalsIgnoreCase(name)) {
			return sub_num5();
		}
		if ($log_sub_key1.equalsIgnoreCase(name)) {
			return log_sub_key1();
		}
		if ($log_sub_key2.equalsIgnoreCase(name)) {
			return log_sub_key2();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumber(name);
	}

	public MCDate getDate(String name) {
		if ($data_make_dt.equalsIgnoreCase(name)) {
			return data_make_dt();
		}
		if ($recv_dt.equalsIgnoreCase(name)) {
			return recv_dt();
		}
		if ($rcv_dt.equalsIgnoreCase(name)) {
			return rcv_dt();
		}
		if ($draw_dt.equalsIgnoreCase(name)) {
			return draw_dt();
		}
		if ($due_dt.equalsIgnoreCase(name)) {
			return due_dt();
		}
		if ($sub_dt1.equalsIgnoreCase(name)) {
			return sub_dt1();
		}
		if ($sub_dt2.equalsIgnoreCase(name)) {
			return sub_dt2();
		}
		if ($sub_dt3.equalsIgnoreCase(name)) {
			return sub_dt3();
		}
		if ($sub_dt4.equalsIgnoreCase(name)) {
			return sub_dt4();
		}
		if ($sub_dt5.equalsIgnoreCase(name)) {
			return sub_dt5();
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
		if ($imp_flg.equalsIgnoreCase(name)) {
			return imp_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			return data_crud_typ();
		}
		if ($exe_sts_typ.equalsIgnoreCase(name)) {
			return exe_sts_typ();
		}
		if ($ext_sys_cd.equalsIgnoreCase(name)) {
			return ext_sys_cd();
		}
		if ($ext_rcv_no.equalsIgnoreCase(name)) {
			return ext_rcv_no();
		}
		if ($rcst_cd.equalsIgnoreCase(name)) {
			return rcst_cd();
		}
		if ($if_rcst_cd.equalsIgnoreCase(name)) {
			return if_rcst_cd();
		}
		if ($if_rcst_nm.equalsIgnoreCase(name)) {
			return if_rcst_nm();
		}
		if ($bcst_cd.equalsIgnoreCase(name)) {
			return bcst_cd();
		}
		if ($if_bcst_cd.equalsIgnoreCase(name)) {
			return if_bcst_cd();
		}
		if ($if_bcst_nm.equalsIgnoreCase(name)) {
			return if_bcst_nm();
		}
		if ($bill_dpt_cd.equalsIgnoreCase(name)) {
			return bill_dpt_cd();
		}
		if ($if_bill_dpt_cd.equalsIgnoreCase(name)) {
			return if_bill_dpt_cd();
		}
		if ($if_bill_dpt_nm.equalsIgnoreCase(name)) {
			return if_bill_dpt_nm();
		}
		if ($rcv_dpt_cd.equalsIgnoreCase(name)) {
			return rcv_dpt_cd();
		}
		if ($if_rcv_dpt_cd.equalsIgnoreCase(name)) {
			return if_rcv_dpt_cd();
		}
		if ($if_rcv_dpt_nm.equalsIgnoreCase(name)) {
			return if_rcv_dpt_nm();
		}
		if ($rcv_usr_cd.equalsIgnoreCase(name)) {
			return rcv_usr_cd();
		}
		if ($if_rcv_usr_cd.equalsIgnoreCase(name)) {
			return if_rcv_usr_cd();
		}
		if ($if_rcv_usr_nm.equalsIgnoreCase(name)) {
			return if_rcv_usr_nm();
		}
		if ($ar_sttl_typ.equalsIgnoreCase(name)) {
			return ar_sttl_typ();
		}
		if ($bank_cd.equalsIgnoreCase(name)) {
			return bank_cd();
		}
		if ($if_bank_cd.equalsIgnoreCase(name)) {
			return if_bank_cd();
		}
		if ($if_bank_nm.equalsIgnoreCase(name)) {
			return if_bank_nm();
		}
		if ($rcv_mtd_cd.equalsIgnoreCase(name)) {
			return rcv_mtd_cd();
		}
		if ($if_rcv_mtd_cd.equalsIgnoreCase(name)) {
			return if_rcv_mtd_cd();
		}
		if ($if_rcv_mtd_nm.equalsIgnoreCase(name)) {
			return if_rcv_mtd_nm();
		}
		if ($bank_ac_cd.equalsIgnoreCase(name)) {
			return bank_ac_cd();
		}
		if ($if_bank_ac_cd.equalsIgnoreCase(name)) {
			return if_bank_ac_cd();
		}
		if ($if_bank_ac_nm.equalsIgnoreCase(name)) {
			return if_bank_ac_nm();
		}
		if ($xfr_psn.equalsIgnoreCase(name)) {
			return xfr_psn();
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($if_trd_cur_cd.equalsIgnoreCase(name)) {
			return if_trd_cur_cd();
		}
		if ($if_trd_cur_nm.equalsIgnoreCase(name)) {
			return if_trd_cur_nm();
		}
		if ($rcv_rmrks.equalsIgnoreCase(name)) {
			return rcv_rmrks();
		}
		if ($note_no.equalsIgnoreCase(name)) {
			return note_no();
		}
		if ($note_typ.equalsIgnoreCase(name)) {
			return note_typ();
		}
		if ($drawer_nm.equalsIgnoreCase(name)) {
			return drawer_nm();
		}
		if ($endrsr.equalsIgnoreCase(name)) {
			return endrsr();
		}
		if ($accptr.equalsIgnoreCase(name)) {
			return accptr();
		}
		if ($note_rsn_cd.equalsIgnoreCase(name)) {
			return note_rsn_cd();
		}
		if ($if_note_rsn_cd.equalsIgnoreCase(name)) {
			return if_note_rsn_cd();
		}
		if ($if_note_rsn_nm.equalsIgnoreCase(name)) {
			return if_note_rsn_nm();
		}
		if ($draw_bank_cd.equalsIgnoreCase(name)) {
			return draw_bank_cd();
		}
		if ($if_draw_bank_cd.equalsIgnoreCase(name)) {
			return if_draw_bank_cd();
		}
		if ($if_draw_bank_nm.equalsIgnoreCase(name)) {
			return if_draw_bank_nm();
		}
		if ($draw_branch_cd.equalsIgnoreCase(name)) {
			return draw_branch_cd();
		}
		if ($if_draw_branch_cd.equalsIgnoreCase(name)) {
			return if_draw_branch_cd();
		}
		if ($if_draw_branch_nm.equalsIgnoreCase(name)) {
			return if_draw_branch_nm();
		}
		if ($if_co_cd.equalsIgnoreCase(name)) {
			return if_co_cd();
		}
		if ($if_co_nm.equalsIgnoreCase(name)) {
			return if_co_nm();
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
		if ($sub_char4.equalsIgnoreCase(name)) {
			return sub_char4();
		}
		if ($sub_char5.equalsIgnoreCase(name)) {
			return sub_char5();
		}
		if ($sub_char6.equalsIgnoreCase(name)) {
			return sub_char6();
		}
		if ($sub_char7.equalsIgnoreCase(name)) {
			return sub_char7();
		}
		if ($sub_char8.equalsIgnoreCase(name)) {
			return sub_char8();
		}
		if ($sub_char9.equalsIgnoreCase(name)) {
			return sub_char9();
		}
		if ($sub_char10.equalsIgnoreCase(name)) {
			return sub_char10();
		}
		if ($sub_char11.equalsIgnoreCase(name)) {
			return sub_char11();
		}
		if ($sub_char12.equalsIgnoreCase(name)) {
			return sub_char12();
		}
		if ($sub_char13.equalsIgnoreCase(name)) {
			return sub_char13();
		}
		if ($sub_char14.equalsIgnoreCase(name)) {
			return sub_char14();
		}
		if ($sub_char15.equalsIgnoreCase(name)) {
			return sub_char15();
		}
		if ($sub_char16.equalsIgnoreCase(name)) {
			return sub_char16();
		}
		if ($sub_char17.equalsIgnoreCase(name)) {
			return sub_char17();
		}
		if ($sub_char18.equalsIgnoreCase(name)) {
			return sub_char18();
		}
		if ($sub_char19.equalsIgnoreCase(name)) {
			return sub_char19();
		}
		if ($sub_char20.equalsIgnoreCase(name)) {
			return sub_char20();
		}
		if ($sub_char21.equalsIgnoreCase(name)) {
			return sub_char21();
		}
		if ($sub_char22.equalsIgnoreCase(name)) {
			return sub_char22();
		}
		if ($sub_char23.equalsIgnoreCase(name)) {
			return sub_char23();
		}
		if ($sub_char24.equalsIgnoreCase(name)) {
			return sub_char24();
		}
		if ($sub_char25.equalsIgnoreCase(name)) {
			return sub_char25();
		}
		if ($sub_char26.equalsIgnoreCase(name)) {
			return sub_char26();
		}
		if ($sub_char27.equalsIgnoreCase(name)) {
			return sub_char27();
		}
		if ($sub_char28.equalsIgnoreCase(name)) {
			return sub_char28();
		}
		if ($sub_char29.equalsIgnoreCase(name)) {
			return sub_char29();
		}
		if ($sub_char30.equalsIgnoreCase(name)) {
			return sub_char30();
		}
		if ($batch_log_no.equalsIgnoreCase(name)) {
			return batch_log_no();
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
		if ($sdrv_sts_typ.equalsIgnoreCase(name)) {
			return sdrv_sts_typ();
		}
		if ($rcst_nm.equalsIgnoreCase(name)) {
			return rcst_nm();
		}
		if ($bcst_nm.equalsIgnoreCase(name)) {
			return bcst_nm();
		}
		if ($bill_dpt_nm.equalsIgnoreCase(name)) {
			return bill_dpt_nm();
		}
		if ($rcv_dpt_nm.equalsIgnoreCase(name)) {
			return rcv_dpt_nm();
		}
		if ($rcv_usr_nm.equalsIgnoreCase(name)) {
			return rcv_usr_nm();
		}
		if ($bank_nm.equalsIgnoreCase(name)) {
			return bank_nm();
		}
		if ($rcv_mtd_nm.equalsIgnoreCase(name)) {
			return rcv_mtd_nm();
		}
		if ($bank_ac_nm.equalsIgnoreCase(name)) {
			return bank_ac_nm();
		}
		if ($trd_cur_nm.equalsIgnoreCase(name)) {
			return trd_cur_nm();
		}
		if ($note_rsn_nm.equalsIgnoreCase(name)) {
			return note_rsn_nm();
		}
		if ($draw_bank_nm.equalsIgnoreCase(name)) {
			return draw_bank_nm();
		}
		if ($draw_branch_nm.equalsIgnoreCase(name)) {
			return draw_branch_nm();
		}
		return super.getStringNE(name);
	}

	public MCNumber getNumberNE(String name) {
		if ($data_lno.equalsIgnoreCase(name)) {
			return data_lno();
		}
		if ($data_no.equalsIgnoreCase(name)) {
			return data_no();
		}
		if ($ext_data_no.equalsIgnoreCase(name)) {
			return ext_data_no();
		}
		if ($ext_data_lno.equalsIgnoreCase(name)) {
			return ext_data_lno();
		}
		if ($xrate.equalsIgnoreCase(name)) {
			return xrate();
		}
		if ($rcv_amt.equalsIgnoreCase(name)) {
			return rcv_amt();
		}
		if ($com_paid.equalsIgnoreCase(name)) {
			return com_paid();
		}
		if ($sub_num1.equalsIgnoreCase(name)) {
			return sub_num1();
		}
		if ($sub_num2.equalsIgnoreCase(name)) {
			return sub_num2();
		}
		if ($sub_num3.equalsIgnoreCase(name)) {
			return sub_num3();
		}
		if ($sub_num4.equalsIgnoreCase(name)) {
			return sub_num4();
		}
		if ($sub_num5.equalsIgnoreCase(name)) {
			return sub_num5();
		}
		if ($log_sub_key1.equalsIgnoreCase(name)) {
			return log_sub_key1();
		}
		if ($log_sub_key2.equalsIgnoreCase(name)) {
			return log_sub_key2();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumberNE(name);
	}

	public MCDate getDateNE(String name) {
		if ($data_make_dt.equalsIgnoreCase(name)) {
			return data_make_dt();
		}
		if ($recv_dt.equalsIgnoreCase(name)) {
			return recv_dt();
		}
		if ($rcv_dt.equalsIgnoreCase(name)) {
			return rcv_dt();
		}
		if ($draw_dt.equalsIgnoreCase(name)) {
			return draw_dt();
		}
		if ($due_dt.equalsIgnoreCase(name)) {
			return due_dt();
		}
		if ($sub_dt1.equalsIgnoreCase(name)) {
			return sub_dt1();
		}
		if ($sub_dt2.equalsIgnoreCase(name)) {
			return sub_dt2();
		}
		if ($sub_dt3.equalsIgnoreCase(name)) {
			return sub_dt3();
		}
		if ($sub_dt4.equalsIgnoreCase(name)) {
			return sub_dt4();
		}
		if ($sub_dt5.equalsIgnoreCase(name)) {
			return sub_dt5();
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
		if ($imp_flg.equalsIgnoreCase(name)) {
			return imp_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		if ($exe_sts_typ.equalsIgnoreCase(name)) {
			exe_sts_typ(value);
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
		if ($rcst_cd.equalsIgnoreCase(name)) {
			rcst_cd(value);
			return;
		}
		if ($if_rcst_cd.equalsIgnoreCase(name)) {
			if_rcst_cd(value);
			return;
		}
		if ($if_rcst_nm.equalsIgnoreCase(name)) {
			if_rcst_nm(value);
			return;
		}
		if ($bcst_cd.equalsIgnoreCase(name)) {
			bcst_cd(value);
			return;
		}
		if ($if_bcst_cd.equalsIgnoreCase(name)) {
			if_bcst_cd(value);
			return;
		}
		if ($if_bcst_nm.equalsIgnoreCase(name)) {
			if_bcst_nm(value);
			return;
		}
		if ($bill_dpt_cd.equalsIgnoreCase(name)) {
			bill_dpt_cd(value);
			return;
		}
		if ($if_bill_dpt_cd.equalsIgnoreCase(name)) {
			if_bill_dpt_cd(value);
			return;
		}
		if ($if_bill_dpt_nm.equalsIgnoreCase(name)) {
			if_bill_dpt_nm(value);
			return;
		}
		if ($rcv_dpt_cd.equalsIgnoreCase(name)) {
			rcv_dpt_cd(value);
			return;
		}
		if ($if_rcv_dpt_cd.equalsIgnoreCase(name)) {
			if_rcv_dpt_cd(value);
			return;
		}
		if ($if_rcv_dpt_nm.equalsIgnoreCase(name)) {
			if_rcv_dpt_nm(value);
			return;
		}
		if ($rcv_usr_cd.equalsIgnoreCase(name)) {
			rcv_usr_cd(value);
			return;
		}
		if ($if_rcv_usr_cd.equalsIgnoreCase(name)) {
			if_rcv_usr_cd(value);
			return;
		}
		if ($if_rcv_usr_nm.equalsIgnoreCase(name)) {
			if_rcv_usr_nm(value);
			return;
		}
		if ($ar_sttl_typ.equalsIgnoreCase(name)) {
			ar_sttl_typ(value);
			return;
		}
		if ($bank_cd.equalsIgnoreCase(name)) {
			bank_cd(value);
			return;
		}
		if ($if_bank_cd.equalsIgnoreCase(name)) {
			if_bank_cd(value);
			return;
		}
		if ($if_bank_nm.equalsIgnoreCase(name)) {
			if_bank_nm(value);
			return;
		}
		if ($rcv_mtd_cd.equalsIgnoreCase(name)) {
			rcv_mtd_cd(value);
			return;
		}
		if ($if_rcv_mtd_cd.equalsIgnoreCase(name)) {
			if_rcv_mtd_cd(value);
			return;
		}
		if ($if_rcv_mtd_nm.equalsIgnoreCase(name)) {
			if_rcv_mtd_nm(value);
			return;
		}
		if ($bank_ac_cd.equalsIgnoreCase(name)) {
			bank_ac_cd(value);
			return;
		}
		if ($if_bank_ac_cd.equalsIgnoreCase(name)) {
			if_bank_ac_cd(value);
			return;
		}
		if ($if_bank_ac_nm.equalsIgnoreCase(name)) {
			if_bank_ac_nm(value);
			return;
		}
		if ($xfr_psn.equalsIgnoreCase(name)) {
			xfr_psn(value);
			return;
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			trd_cur_cd(value);
			return;
		}
		if ($if_trd_cur_cd.equalsIgnoreCase(name)) {
			if_trd_cur_cd(value);
			return;
		}
		if ($if_trd_cur_nm.equalsIgnoreCase(name)) {
			if_trd_cur_nm(value);
			return;
		}
		if ($rcv_rmrks.equalsIgnoreCase(name)) {
			rcv_rmrks(value);
			return;
		}
		if ($note_no.equalsIgnoreCase(name)) {
			note_no(value);
			return;
		}
		if ($note_typ.equalsIgnoreCase(name)) {
			note_typ(value);
			return;
		}
		if ($drawer_nm.equalsIgnoreCase(name)) {
			drawer_nm(value);
			return;
		}
		if ($endrsr.equalsIgnoreCase(name)) {
			endrsr(value);
			return;
		}
		if ($accptr.equalsIgnoreCase(name)) {
			accptr(value);
			return;
		}
		if ($note_rsn_cd.equalsIgnoreCase(name)) {
			note_rsn_cd(value);
			return;
		}
		if ($if_note_rsn_cd.equalsIgnoreCase(name)) {
			if_note_rsn_cd(value);
			return;
		}
		if ($if_note_rsn_nm.equalsIgnoreCase(name)) {
			if_note_rsn_nm(value);
			return;
		}
		if ($draw_bank_cd.equalsIgnoreCase(name)) {
			draw_bank_cd(value);
			return;
		}
		if ($if_draw_bank_cd.equalsIgnoreCase(name)) {
			if_draw_bank_cd(value);
			return;
		}
		if ($if_draw_bank_nm.equalsIgnoreCase(name)) {
			if_draw_bank_nm(value);
			return;
		}
		if ($draw_branch_cd.equalsIgnoreCase(name)) {
			draw_branch_cd(value);
			return;
		}
		if ($if_draw_branch_cd.equalsIgnoreCase(name)) {
			if_draw_branch_cd(value);
			return;
		}
		if ($if_draw_branch_nm.equalsIgnoreCase(name)) {
			if_draw_branch_nm(value);
			return;
		}
		if ($if_co_cd.equalsIgnoreCase(name)) {
			if_co_cd(value);
			return;
		}
		if ($if_co_nm.equalsIgnoreCase(name)) {
			if_co_nm(value);
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
		if ($sub_char4.equalsIgnoreCase(name)) {
			sub_char4(value);
			return;
		}
		if ($sub_char5.equalsIgnoreCase(name)) {
			sub_char5(value);
			return;
		}
		if ($sub_char6.equalsIgnoreCase(name)) {
			sub_char6(value);
			return;
		}
		if ($sub_char7.equalsIgnoreCase(name)) {
			sub_char7(value);
			return;
		}
		if ($sub_char8.equalsIgnoreCase(name)) {
			sub_char8(value);
			return;
		}
		if ($sub_char9.equalsIgnoreCase(name)) {
			sub_char9(value);
			return;
		}
		if ($sub_char10.equalsIgnoreCase(name)) {
			sub_char10(value);
			return;
		}
		if ($sub_char11.equalsIgnoreCase(name)) {
			sub_char11(value);
			return;
		}
		if ($sub_char12.equalsIgnoreCase(name)) {
			sub_char12(value);
			return;
		}
		if ($sub_char13.equalsIgnoreCase(name)) {
			sub_char13(value);
			return;
		}
		if ($sub_char14.equalsIgnoreCase(name)) {
			sub_char14(value);
			return;
		}
		if ($sub_char15.equalsIgnoreCase(name)) {
			sub_char15(value);
			return;
		}
		if ($sub_char16.equalsIgnoreCase(name)) {
			sub_char16(value);
			return;
		}
		if ($sub_char17.equalsIgnoreCase(name)) {
			sub_char17(value);
			return;
		}
		if ($sub_char18.equalsIgnoreCase(name)) {
			sub_char18(value);
			return;
		}
		if ($sub_char19.equalsIgnoreCase(name)) {
			sub_char19(value);
			return;
		}
		if ($sub_char20.equalsIgnoreCase(name)) {
			sub_char20(value);
			return;
		}
		if ($sub_char21.equalsIgnoreCase(name)) {
			sub_char21(value);
			return;
		}
		if ($sub_char22.equalsIgnoreCase(name)) {
			sub_char22(value);
			return;
		}
		if ($sub_char23.equalsIgnoreCase(name)) {
			sub_char23(value);
			return;
		}
		if ($sub_char24.equalsIgnoreCase(name)) {
			sub_char24(value);
			return;
		}
		if ($sub_char25.equalsIgnoreCase(name)) {
			sub_char25(value);
			return;
		}
		if ($sub_char26.equalsIgnoreCase(name)) {
			sub_char26(value);
			return;
		}
		if ($sub_char27.equalsIgnoreCase(name)) {
			sub_char27(value);
			return;
		}
		if ($sub_char28.equalsIgnoreCase(name)) {
			sub_char28(value);
			return;
		}
		if ($sub_char29.equalsIgnoreCase(name)) {
			sub_char29(value);
			return;
		}
		if ($sub_char30.equalsIgnoreCase(name)) {
			sub_char30(value);
			return;
		}
		if ($batch_log_no.equalsIgnoreCase(name)) {
			batch_log_no(value);
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
		if ($sdrv_sts_typ.equalsIgnoreCase(name)) {
			sdrv_sts_typ(value);
			return;
		}
		if ($rcst_nm.equalsIgnoreCase(name)) {
			rcst_nm(value);
			return;
		}
		if ($bcst_nm.equalsIgnoreCase(name)) {
			bcst_nm(value);
			return;
		}
		if ($bill_dpt_nm.equalsIgnoreCase(name)) {
			bill_dpt_nm(value);
			return;
		}
		if ($rcv_dpt_nm.equalsIgnoreCase(name)) {
			rcv_dpt_nm(value);
			return;
		}
		if ($rcv_usr_nm.equalsIgnoreCase(name)) {
			rcv_usr_nm(value);
			return;
		}
		if ($bank_nm.equalsIgnoreCase(name)) {
			bank_nm(value);
			return;
		}
		if ($rcv_mtd_nm.equalsIgnoreCase(name)) {
			rcv_mtd_nm(value);
			return;
		}
		if ($bank_ac_nm.equalsIgnoreCase(name)) {
			bank_ac_nm(value);
			return;
		}
		if ($trd_cur_nm.equalsIgnoreCase(name)) {
			trd_cur_nm(value);
			return;
		}
		if ($note_rsn_nm.equalsIgnoreCase(name)) {
			note_rsn_nm(value);
			return;
		}
		if ($draw_bank_nm.equalsIgnoreCase(name)) {
			draw_bank_nm(value);
			return;
		}
		if ($draw_branch_nm.equalsIgnoreCase(name)) {
			draw_branch_nm(value);
			return;
		}
		super.setString(name, value);
	}

	public void setNumber(String name, MCNumber value) {
		if ($data_lno.equalsIgnoreCase(name)) {
			data_lno(value);
			return;
		}
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		if ($ext_data_no.equalsIgnoreCase(name)) {
			ext_data_no(value);
			return;
		}
		if ($ext_data_lno.equalsIgnoreCase(name)) {
			ext_data_lno(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($rcv_amt.equalsIgnoreCase(name)) {
			rcv_amt(value);
			return;
		}
		if ($com_paid.equalsIgnoreCase(name)) {
			com_paid(value);
			return;
		}
		if ($sub_num1.equalsIgnoreCase(name)) {
			sub_num1(value);
			return;
		}
		if ($sub_num2.equalsIgnoreCase(name)) {
			sub_num2(value);
			return;
		}
		if ($sub_num3.equalsIgnoreCase(name)) {
			sub_num3(value);
			return;
		}
		if ($sub_num4.equalsIgnoreCase(name)) {
			sub_num4(value);
			return;
		}
		if ($sub_num5.equalsIgnoreCase(name)) {
			sub_num5(value);
			return;
		}
		if ($log_sub_key1.equalsIgnoreCase(name)) {
			log_sub_key1(value);
			return;
		}
		if ($log_sub_key2.equalsIgnoreCase(name)) {
			log_sub_key2(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, int value) {
		if ($data_lno.equalsIgnoreCase(name)) {
			data_lno(value);
			return;
		}
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		if ($ext_data_no.equalsIgnoreCase(name)) {
			ext_data_no(value);
			return;
		}
		if ($ext_data_lno.equalsIgnoreCase(name)) {
			ext_data_lno(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($rcv_amt.equalsIgnoreCase(name)) {
			rcv_amt(value);
			return;
		}
		if ($com_paid.equalsIgnoreCase(name)) {
			com_paid(value);
			return;
		}
		if ($sub_num1.equalsIgnoreCase(name)) {
			sub_num1(value);
			return;
		}
		if ($sub_num2.equalsIgnoreCase(name)) {
			sub_num2(value);
			return;
		}
		if ($sub_num3.equalsIgnoreCase(name)) {
			sub_num3(value);
			return;
		}
		if ($sub_num4.equalsIgnoreCase(name)) {
			sub_num4(value);
			return;
		}
		if ($sub_num5.equalsIgnoreCase(name)) {
			sub_num5(value);
			return;
		}
		if ($log_sub_key1.equalsIgnoreCase(name)) {
			log_sub_key1(value);
			return;
		}
		if ($log_sub_key2.equalsIgnoreCase(name)) {
			log_sub_key2(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, long value) {
		if ($data_lno.equalsIgnoreCase(name)) {
			data_lno(value);
			return;
		}
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		if ($ext_data_no.equalsIgnoreCase(name)) {
			ext_data_no(value);
			return;
		}
		if ($ext_data_lno.equalsIgnoreCase(name)) {
			ext_data_lno(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($rcv_amt.equalsIgnoreCase(name)) {
			rcv_amt(value);
			return;
		}
		if ($com_paid.equalsIgnoreCase(name)) {
			com_paid(value);
			return;
		}
		if ($sub_num1.equalsIgnoreCase(name)) {
			sub_num1(value);
			return;
		}
		if ($sub_num2.equalsIgnoreCase(name)) {
			sub_num2(value);
			return;
		}
		if ($sub_num3.equalsIgnoreCase(name)) {
			sub_num3(value);
			return;
		}
		if ($sub_num4.equalsIgnoreCase(name)) {
			sub_num4(value);
			return;
		}
		if ($sub_num5.equalsIgnoreCase(name)) {
			sub_num5(value);
			return;
		}
		if ($log_sub_key1.equalsIgnoreCase(name)) {
			log_sub_key1(value);
			return;
		}
		if ($log_sub_key2.equalsIgnoreCase(name)) {
			log_sub_key2(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, float value) {
		if ($data_lno.equalsIgnoreCase(name)) {
			data_lno(value);
			return;
		}
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		if ($ext_data_no.equalsIgnoreCase(name)) {
			ext_data_no(value);
			return;
		}
		if ($ext_data_lno.equalsIgnoreCase(name)) {
			ext_data_lno(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($rcv_amt.equalsIgnoreCase(name)) {
			rcv_amt(value);
			return;
		}
		if ($com_paid.equalsIgnoreCase(name)) {
			com_paid(value);
			return;
		}
		if ($sub_num1.equalsIgnoreCase(name)) {
			sub_num1(value);
			return;
		}
		if ($sub_num2.equalsIgnoreCase(name)) {
			sub_num2(value);
			return;
		}
		if ($sub_num3.equalsIgnoreCase(name)) {
			sub_num3(value);
			return;
		}
		if ($sub_num4.equalsIgnoreCase(name)) {
			sub_num4(value);
			return;
		}
		if ($sub_num5.equalsIgnoreCase(name)) {
			sub_num5(value);
			return;
		}
		if ($log_sub_key1.equalsIgnoreCase(name)) {
			log_sub_key1(value);
			return;
		}
		if ($log_sub_key2.equalsIgnoreCase(name)) {
			log_sub_key2(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, double value) {
		if ($data_lno.equalsIgnoreCase(name)) {
			data_lno(value);
			return;
		}
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		if ($ext_data_no.equalsIgnoreCase(name)) {
			ext_data_no(value);
			return;
		}
		if ($ext_data_lno.equalsIgnoreCase(name)) {
			ext_data_lno(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($rcv_amt.equalsIgnoreCase(name)) {
			rcv_amt(value);
			return;
		}
		if ($com_paid.equalsIgnoreCase(name)) {
			com_paid(value);
			return;
		}
		if ($sub_num1.equalsIgnoreCase(name)) {
			sub_num1(value);
			return;
		}
		if ($sub_num2.equalsIgnoreCase(name)) {
			sub_num2(value);
			return;
		}
		if ($sub_num3.equalsIgnoreCase(name)) {
			sub_num3(value);
			return;
		}
		if ($sub_num4.equalsIgnoreCase(name)) {
			sub_num4(value);
			return;
		}
		if ($sub_num5.equalsIgnoreCase(name)) {
			sub_num5(value);
			return;
		}
		if ($log_sub_key1.equalsIgnoreCase(name)) {
			log_sub_key1(value);
			return;
		}
		if ($log_sub_key2.equalsIgnoreCase(name)) {
			log_sub_key2(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setDate(String name, MCDate value) {
		if ($data_make_dt.equalsIgnoreCase(name)) {
			data_make_dt(value);
			return;
		}
		if ($recv_dt.equalsIgnoreCase(name)) {
			recv_dt(value);
			return;
		}
		if ($rcv_dt.equalsIgnoreCase(name)) {
			rcv_dt(value);
			return;
		}
		if ($draw_dt.equalsIgnoreCase(name)) {
			draw_dt(value);
			return;
		}
		if ($due_dt.equalsIgnoreCase(name)) {
			due_dt(value);
			return;
		}
		if ($sub_dt1.equalsIgnoreCase(name)) {
			sub_dt1(value);
			return;
		}
		if ($sub_dt2.equalsIgnoreCase(name)) {
			sub_dt2(value);
			return;
		}
		if ($sub_dt3.equalsIgnoreCase(name)) {
			sub_dt3(value);
			return;
		}
		if ($sub_dt4.equalsIgnoreCase(name)) {
			sub_dt4(value);
			return;
		}
		if ($sub_dt5.equalsIgnoreCase(name)) {
			sub_dt5(value);
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
		if ($imp_flg.equalsIgnoreCase(name)) {
			imp_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($data_crud_typ.equalsIgnoreCase(name)) {
			data_crud_typ(value);
			return;
		}
		if ($exe_sts_typ.equalsIgnoreCase(name)) {
			exe_sts_typ(value);
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
		if ($rcst_cd.equalsIgnoreCase(name)) {
			rcst_cd(value);
			return;
		}
		if ($if_rcst_cd.equalsIgnoreCase(name)) {
			if_rcst_cd(value);
			return;
		}
		if ($if_rcst_nm.equalsIgnoreCase(name)) {
			if_rcst_nm(value);
			return;
		}
		if ($bcst_cd.equalsIgnoreCase(name)) {
			bcst_cd(value);
			return;
		}
		if ($if_bcst_cd.equalsIgnoreCase(name)) {
			if_bcst_cd(value);
			return;
		}
		if ($if_bcst_nm.equalsIgnoreCase(name)) {
			if_bcst_nm(value);
			return;
		}
		if ($bill_dpt_cd.equalsIgnoreCase(name)) {
			bill_dpt_cd(value);
			return;
		}
		if ($if_bill_dpt_cd.equalsIgnoreCase(name)) {
			if_bill_dpt_cd(value);
			return;
		}
		if ($if_bill_dpt_nm.equalsIgnoreCase(name)) {
			if_bill_dpt_nm(value);
			return;
		}
		if ($rcv_dpt_cd.equalsIgnoreCase(name)) {
			rcv_dpt_cd(value);
			return;
		}
		if ($if_rcv_dpt_cd.equalsIgnoreCase(name)) {
			if_rcv_dpt_cd(value);
			return;
		}
		if ($if_rcv_dpt_nm.equalsIgnoreCase(name)) {
			if_rcv_dpt_nm(value);
			return;
		}
		if ($rcv_usr_cd.equalsIgnoreCase(name)) {
			rcv_usr_cd(value);
			return;
		}
		if ($if_rcv_usr_cd.equalsIgnoreCase(name)) {
			if_rcv_usr_cd(value);
			return;
		}
		if ($if_rcv_usr_nm.equalsIgnoreCase(name)) {
			if_rcv_usr_nm(value);
			return;
		}
		if ($ar_sttl_typ.equalsIgnoreCase(name)) {
			ar_sttl_typ(value);
			return;
		}
		if ($bank_cd.equalsIgnoreCase(name)) {
			bank_cd(value);
			return;
		}
		if ($if_bank_cd.equalsIgnoreCase(name)) {
			if_bank_cd(value);
			return;
		}
		if ($if_bank_nm.equalsIgnoreCase(name)) {
			if_bank_nm(value);
			return;
		}
		if ($rcv_mtd_cd.equalsIgnoreCase(name)) {
			rcv_mtd_cd(value);
			return;
		}
		if ($if_rcv_mtd_cd.equalsIgnoreCase(name)) {
			if_rcv_mtd_cd(value);
			return;
		}
		if ($if_rcv_mtd_nm.equalsIgnoreCase(name)) {
			if_rcv_mtd_nm(value);
			return;
		}
		if ($bank_ac_cd.equalsIgnoreCase(name)) {
			bank_ac_cd(value);
			return;
		}
		if ($if_bank_ac_cd.equalsIgnoreCase(name)) {
			if_bank_ac_cd(value);
			return;
		}
		if ($if_bank_ac_nm.equalsIgnoreCase(name)) {
			if_bank_ac_nm(value);
			return;
		}
		if ($xfr_psn.equalsIgnoreCase(name)) {
			xfr_psn(value);
			return;
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			trd_cur_cd(value);
			return;
		}
		if ($if_trd_cur_cd.equalsIgnoreCase(name)) {
			if_trd_cur_cd(value);
			return;
		}
		if ($if_trd_cur_nm.equalsIgnoreCase(name)) {
			if_trd_cur_nm(value);
			return;
		}
		if ($rcv_rmrks.equalsIgnoreCase(name)) {
			rcv_rmrks(value);
			return;
		}
		if ($note_no.equalsIgnoreCase(name)) {
			note_no(value);
			return;
		}
		if ($note_typ.equalsIgnoreCase(name)) {
			note_typ(value);
			return;
		}
		if ($drawer_nm.equalsIgnoreCase(name)) {
			drawer_nm(value);
			return;
		}
		if ($endrsr.equalsIgnoreCase(name)) {
			endrsr(value);
			return;
		}
		if ($accptr.equalsIgnoreCase(name)) {
			accptr(value);
			return;
		}
		if ($note_rsn_cd.equalsIgnoreCase(name)) {
			note_rsn_cd(value);
			return;
		}
		if ($if_note_rsn_cd.equalsIgnoreCase(name)) {
			if_note_rsn_cd(value);
			return;
		}
		if ($if_note_rsn_nm.equalsIgnoreCase(name)) {
			if_note_rsn_nm(value);
			return;
		}
		if ($draw_bank_cd.equalsIgnoreCase(name)) {
			draw_bank_cd(value);
			return;
		}
		if ($if_draw_bank_cd.equalsIgnoreCase(name)) {
			if_draw_bank_cd(value);
			return;
		}
		if ($if_draw_bank_nm.equalsIgnoreCase(name)) {
			if_draw_bank_nm(value);
			return;
		}
		if ($draw_branch_cd.equalsIgnoreCase(name)) {
			draw_branch_cd(value);
			return;
		}
		if ($if_draw_branch_cd.equalsIgnoreCase(name)) {
			if_draw_branch_cd(value);
			return;
		}
		if ($if_draw_branch_nm.equalsIgnoreCase(name)) {
			if_draw_branch_nm(value);
			return;
		}
		if ($if_co_cd.equalsIgnoreCase(name)) {
			if_co_cd(value);
			return;
		}
		if ($if_co_nm.equalsIgnoreCase(name)) {
			if_co_nm(value);
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
		if ($sub_char4.equalsIgnoreCase(name)) {
			sub_char4(value);
			return;
		}
		if ($sub_char5.equalsIgnoreCase(name)) {
			sub_char5(value);
			return;
		}
		if ($sub_char6.equalsIgnoreCase(name)) {
			sub_char6(value);
			return;
		}
		if ($sub_char7.equalsIgnoreCase(name)) {
			sub_char7(value);
			return;
		}
		if ($sub_char8.equalsIgnoreCase(name)) {
			sub_char8(value);
			return;
		}
		if ($sub_char9.equalsIgnoreCase(name)) {
			sub_char9(value);
			return;
		}
		if ($sub_char10.equalsIgnoreCase(name)) {
			sub_char10(value);
			return;
		}
		if ($sub_char11.equalsIgnoreCase(name)) {
			sub_char11(value);
			return;
		}
		if ($sub_char12.equalsIgnoreCase(name)) {
			sub_char12(value);
			return;
		}
		if ($sub_char13.equalsIgnoreCase(name)) {
			sub_char13(value);
			return;
		}
		if ($sub_char14.equalsIgnoreCase(name)) {
			sub_char14(value);
			return;
		}
		if ($sub_char15.equalsIgnoreCase(name)) {
			sub_char15(value);
			return;
		}
		if ($sub_char16.equalsIgnoreCase(name)) {
			sub_char16(value);
			return;
		}
		if ($sub_char17.equalsIgnoreCase(name)) {
			sub_char17(value);
			return;
		}
		if ($sub_char18.equalsIgnoreCase(name)) {
			sub_char18(value);
			return;
		}
		if ($sub_char19.equalsIgnoreCase(name)) {
			sub_char19(value);
			return;
		}
		if ($sub_char20.equalsIgnoreCase(name)) {
			sub_char20(value);
			return;
		}
		if ($sub_char21.equalsIgnoreCase(name)) {
			sub_char21(value);
			return;
		}
		if ($sub_char22.equalsIgnoreCase(name)) {
			sub_char22(value);
			return;
		}
		if ($sub_char23.equalsIgnoreCase(name)) {
			sub_char23(value);
			return;
		}
		if ($sub_char24.equalsIgnoreCase(name)) {
			sub_char24(value);
			return;
		}
		if ($sub_char25.equalsIgnoreCase(name)) {
			sub_char25(value);
			return;
		}
		if ($sub_char26.equalsIgnoreCase(name)) {
			sub_char26(value);
			return;
		}
		if ($sub_char27.equalsIgnoreCase(name)) {
			sub_char27(value);
			return;
		}
		if ($sub_char28.equalsIgnoreCase(name)) {
			sub_char28(value);
			return;
		}
		if ($sub_char29.equalsIgnoreCase(name)) {
			sub_char29(value);
			return;
		}
		if ($sub_char30.equalsIgnoreCase(name)) {
			sub_char30(value);
			return;
		}
		if ($batch_log_no.equalsIgnoreCase(name)) {
			batch_log_no(value);
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
		if ($sdrv_sts_typ.equalsIgnoreCase(name)) {
			sdrv_sts_typ(value);
			return;
		}
		if ($rcst_nm.equalsIgnoreCase(name)) {
			rcst_nm(value);
			return;
		}
		if ($bcst_nm.equalsIgnoreCase(name)) {
			bcst_nm(value);
			return;
		}
		if ($bill_dpt_nm.equalsIgnoreCase(name)) {
			bill_dpt_nm(value);
			return;
		}
		if ($rcv_dpt_nm.equalsIgnoreCase(name)) {
			rcv_dpt_nm(value);
			return;
		}
		if ($rcv_usr_nm.equalsIgnoreCase(name)) {
			rcv_usr_nm(value);
			return;
		}
		if ($bank_nm.equalsIgnoreCase(name)) {
			bank_nm(value);
			return;
		}
		if ($rcv_mtd_nm.equalsIgnoreCase(name)) {
			rcv_mtd_nm(value);
			return;
		}
		if ($bank_ac_nm.equalsIgnoreCase(name)) {
			bank_ac_nm(value);
			return;
		}
		if ($trd_cur_nm.equalsIgnoreCase(name)) {
			trd_cur_nm(value);
			return;
		}
		if ($note_rsn_nm.equalsIgnoreCase(name)) {
			note_rsn_nm(value);
			return;
		}
		if ($draw_bank_nm.equalsIgnoreCase(name)) {
			draw_bank_nm(value);
			return;
		}
		if ($draw_branch_nm.equalsIgnoreCase(name)) {
			draw_branch_nm(value);
			return;
		}
		super.setStringNE(name, value);
	}

	public void setNumberNE(String name, MCNumber value) {
		if ($data_lno.equalsIgnoreCase(name)) {
			data_lno(value);
			return;
		}
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		if ($ext_data_no.equalsIgnoreCase(name)) {
			ext_data_no(value);
			return;
		}
		if ($ext_data_lno.equalsIgnoreCase(name)) {
			ext_data_lno(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($rcv_amt.equalsIgnoreCase(name)) {
			rcv_amt(value);
			return;
		}
		if ($com_paid.equalsIgnoreCase(name)) {
			com_paid(value);
			return;
		}
		if ($sub_num1.equalsIgnoreCase(name)) {
			sub_num1(value);
			return;
		}
		if ($sub_num2.equalsIgnoreCase(name)) {
			sub_num2(value);
			return;
		}
		if ($sub_num3.equalsIgnoreCase(name)) {
			sub_num3(value);
			return;
		}
		if ($sub_num4.equalsIgnoreCase(name)) {
			sub_num4(value);
			return;
		}
		if ($sub_num5.equalsIgnoreCase(name)) {
			sub_num5(value);
			return;
		}
		if ($log_sub_key1.equalsIgnoreCase(name)) {
			log_sub_key1(value);
			return;
		}
		if ($log_sub_key2.equalsIgnoreCase(name)) {
			log_sub_key2(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, int value) {
		if ($data_lno.equalsIgnoreCase(name)) {
			data_lno(value);
			return;
		}
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		if ($ext_data_no.equalsIgnoreCase(name)) {
			ext_data_no(value);
			return;
		}
		if ($ext_data_lno.equalsIgnoreCase(name)) {
			ext_data_lno(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($rcv_amt.equalsIgnoreCase(name)) {
			rcv_amt(value);
			return;
		}
		if ($com_paid.equalsIgnoreCase(name)) {
			com_paid(value);
			return;
		}
		if ($sub_num1.equalsIgnoreCase(name)) {
			sub_num1(value);
			return;
		}
		if ($sub_num2.equalsIgnoreCase(name)) {
			sub_num2(value);
			return;
		}
		if ($sub_num3.equalsIgnoreCase(name)) {
			sub_num3(value);
			return;
		}
		if ($sub_num4.equalsIgnoreCase(name)) {
			sub_num4(value);
			return;
		}
		if ($sub_num5.equalsIgnoreCase(name)) {
			sub_num5(value);
			return;
		}
		if ($log_sub_key1.equalsIgnoreCase(name)) {
			log_sub_key1(value);
			return;
		}
		if ($log_sub_key2.equalsIgnoreCase(name)) {
			log_sub_key2(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, long value) {
		if ($data_lno.equalsIgnoreCase(name)) {
			data_lno(value);
			return;
		}
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		if ($ext_data_no.equalsIgnoreCase(name)) {
			ext_data_no(value);
			return;
		}
		if ($ext_data_lno.equalsIgnoreCase(name)) {
			ext_data_lno(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($rcv_amt.equalsIgnoreCase(name)) {
			rcv_amt(value);
			return;
		}
		if ($com_paid.equalsIgnoreCase(name)) {
			com_paid(value);
			return;
		}
		if ($sub_num1.equalsIgnoreCase(name)) {
			sub_num1(value);
			return;
		}
		if ($sub_num2.equalsIgnoreCase(name)) {
			sub_num2(value);
			return;
		}
		if ($sub_num3.equalsIgnoreCase(name)) {
			sub_num3(value);
			return;
		}
		if ($sub_num4.equalsIgnoreCase(name)) {
			sub_num4(value);
			return;
		}
		if ($sub_num5.equalsIgnoreCase(name)) {
			sub_num5(value);
			return;
		}
		if ($log_sub_key1.equalsIgnoreCase(name)) {
			log_sub_key1(value);
			return;
		}
		if ($log_sub_key2.equalsIgnoreCase(name)) {
			log_sub_key2(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, float value) {
		if ($data_lno.equalsIgnoreCase(name)) {
			data_lno(value);
			return;
		}
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		if ($ext_data_no.equalsIgnoreCase(name)) {
			ext_data_no(value);
			return;
		}
		if ($ext_data_lno.equalsIgnoreCase(name)) {
			ext_data_lno(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($rcv_amt.equalsIgnoreCase(name)) {
			rcv_amt(value);
			return;
		}
		if ($com_paid.equalsIgnoreCase(name)) {
			com_paid(value);
			return;
		}
		if ($sub_num1.equalsIgnoreCase(name)) {
			sub_num1(value);
			return;
		}
		if ($sub_num2.equalsIgnoreCase(name)) {
			sub_num2(value);
			return;
		}
		if ($sub_num3.equalsIgnoreCase(name)) {
			sub_num3(value);
			return;
		}
		if ($sub_num4.equalsIgnoreCase(name)) {
			sub_num4(value);
			return;
		}
		if ($sub_num5.equalsIgnoreCase(name)) {
			sub_num5(value);
			return;
		}
		if ($log_sub_key1.equalsIgnoreCase(name)) {
			log_sub_key1(value);
			return;
		}
		if ($log_sub_key2.equalsIgnoreCase(name)) {
			log_sub_key2(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, double value) {
		if ($data_lno.equalsIgnoreCase(name)) {
			data_lno(value);
			return;
		}
		if ($data_no.equalsIgnoreCase(name)) {
			data_no(value);
			return;
		}
		if ($ext_data_no.equalsIgnoreCase(name)) {
			ext_data_no(value);
			return;
		}
		if ($ext_data_lno.equalsIgnoreCase(name)) {
			ext_data_lno(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($rcv_amt.equalsIgnoreCase(name)) {
			rcv_amt(value);
			return;
		}
		if ($com_paid.equalsIgnoreCase(name)) {
			com_paid(value);
			return;
		}
		if ($sub_num1.equalsIgnoreCase(name)) {
			sub_num1(value);
			return;
		}
		if ($sub_num2.equalsIgnoreCase(name)) {
			sub_num2(value);
			return;
		}
		if ($sub_num3.equalsIgnoreCase(name)) {
			sub_num3(value);
			return;
		}
		if ($sub_num4.equalsIgnoreCase(name)) {
			sub_num4(value);
			return;
		}
		if ($sub_num5.equalsIgnoreCase(name)) {
			sub_num5(value);
			return;
		}
		if ($log_sub_key1.equalsIgnoreCase(name)) {
			log_sub_key1(value);
			return;
		}
		if ($log_sub_key2.equalsIgnoreCase(name)) {
			log_sub_key2(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setDateNE(String name, MCDate value) {
		if ($data_make_dt.equalsIgnoreCase(name)) {
			data_make_dt(value);
			return;
		}
		if ($recv_dt.equalsIgnoreCase(name)) {
			recv_dt(value);
			return;
		}
		if ($rcv_dt.equalsIgnoreCase(name)) {
			rcv_dt(value);
			return;
		}
		if ($draw_dt.equalsIgnoreCase(name)) {
			draw_dt(value);
			return;
		}
		if ($due_dt.equalsIgnoreCase(name)) {
			due_dt(value);
			return;
		}
		if ($sub_dt1.equalsIgnoreCase(name)) {
			sub_dt1(value);
			return;
		}
		if ($sub_dt2.equalsIgnoreCase(name)) {
			sub_dt2(value);
			return;
		}
		if ($sub_dt3.equalsIgnoreCase(name)) {
			sub_dt3(value);
			return;
		}
		if ($sub_dt4.equalsIgnoreCase(name)) {
			sub_dt4(value);
			return;
		}
		if ($sub_dt5.equalsIgnoreCase(name)) {
			sub_dt5(value);
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
		if ($imp_flg.equalsIgnoreCase(name)) {
			imp_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

}
