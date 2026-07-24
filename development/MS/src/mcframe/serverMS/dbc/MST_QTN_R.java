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
 * "見積ヘッダ // Quotation header"DBコンテナRowクラスです。<p>
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
 *  	<td>qtn_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>見積ＮＯ</td>
 *  	<td>Quotation No.</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>qtn_rev</td>
 *  	<td>N</td>
 *  	<td>4,0</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>見積改訂番号</td>
 *  	<td>Quotation rev. number</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>qtn_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>見積区分</td>
 *  	<td>Quotation type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>failure_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>失注ＦＬＧ</td>
 *  	<td>Failed order flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>trd_cd</td>
 *  	<td>C</td>
 *  	<td>4</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>取引ＣＤ</td>
 *  	<td>Transaction cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>trd_ptn_typ</td>
 *  	<td>C</td>
 *  	<td>4</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>取引パタン区分</td>
 *  	<td>Transaction pattern type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>qtn_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>見積日</td>
 *  	<td>Quotation date</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>valid_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>有効期限</td>
 *  	<td>Expiration date</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>cst_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>得意先ＣＤ</td>
 *  	<td>Customer cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>cst_sundry_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>得意先諸口ＦＬＧ</td>
 *  	<td>Miscellaneous customer flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>cst_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>得意先名</td>
 *  	<td>Customer name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>cst_cntct_dpt</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>得意先部署</td>
 *  	<td>Customer dept.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>cst_cntct_psn</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>得意先担当者</td>
 *  	<td>Customer PIC</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>cst_zip_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>得意先郵便番号</td>
 *  	<td>Customer zip code</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>cst_addr1</td>
 *  	<td>C</td>
 *  	<td>250</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>得意先住所１</td>
 *  	<td>Customer address 1</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>cst_addr2</td>
 *  	<td>C</td>
 *  	<td>250</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>得意先住所２</td>
 *  	<td>Customer address 2</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>cst_addr3</td>
 *  	<td>C</td>
 *  	<td>250</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>得意先住所３</td>
 *  	<td>Customer address 3</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>cst_addr4</td>
 *  	<td>C</td>
 *  	<td>250</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>得意先住所４</td>
 *  	<td>Customer address 4</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>cst_tel</td>
 *  	<td>C</td>
 *  	<td>30</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>得意先ＴＥＬ</td>
 *  	<td>Customer TEL</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>cst_fax</td>
 *  	<td>C</td>
 *  	<td>30</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>得意先ＦＡＸ</td>
 *  	<td>Customer FAX</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>tterm_cd1</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引条件ＣＤ１</td>
 *  	<td>Transaction terms cd. 1</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>tterm_rmrks1</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引条件備考１</td>
 *  	<td>Transaction terms remarks 1</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>tterm_cd2</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引条件ＣＤ２</td>
 *  	<td>Transaction terms cd. 2</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>tterm_rmrks2</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引条件備考２</td>
 *  	<td>Transaction terms remarks 2</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>tterm_cd3</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引条件ＣＤ３</td>
 *  	<td>Transaction terms cd. 3</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>tterm_rmrks3</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引条件備考３</td>
 *  	<td>Transaction terms remarks 3</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>trnspt_cd</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>輸送方法ＣＤ</td>
 *  	<td>Transportation method cd.</td>
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
 *  	<td>xrate_inpt_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>為替レート指定ＦＬＧ</td>
 *  	<td>Set exchange rate flg.</td>
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
 *  	<td>sls_usr_cd</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>売上担当者</td>
 *  	<td>Sales PIC</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sls_dpt_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>売上部門ＣＤ</td>
 *  	<td>Sales dept. cd.</td>
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
 *  	<td>qtn_rmrks</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>見積備考</td>
 *  	<td>Quotation remarks</td>
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
 *  	<td>qtn_term_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>見積条件</td>
 *  	<td>Quotation terms</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>qtn_rslt_rsn_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>見積結果理由ＣＤ</td>
 *  	<td>Quotation result reason cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>qtn_rslt_rsn_rmrks</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>見積結果理由備考</td>
 *  	<td>Quotation result reason remarks</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>wrk_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>案件ＮＯ</td>
 *  	<td>Sales project No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>cst_qtn_rqst_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>得意先見積依頼ＮＯ</td>
 *  	<td>Customer quotation request No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>rcpt_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>受付日</td>
 *  	<td>Receiving date</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>rcpt_usr_cd</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>受付担当者ＣＤ</td>
 *  	<td>Receiving PIC cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>aprv_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>承認対象ＦＬＧ</td>
 *  	<td>For approval flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>aprv_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>承認ＮＯ</td>
 *  	<td>Approval No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>aprv_sts_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>承認状況区分</td>
 *  	<td>Approval status type</td>
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
 *  	<td>qtn_prnt_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>見積書発行済ＦＬＧ</td>
 *  	<td>Quotation issued flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>qtn_prnt_seq</td>
 *  	<td>N</td>
 *  	<td>3,0</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>見積書連番</td>
 *  	<td>Quotation sequence number</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>qtn_prnt_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>見積書発行日</td>
 *  	<td>Quotation issue date</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>can_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>取消ＦＬＧ</td>
 *  	<td>Cancel flg.</td>
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
public class MST_QTN_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.CO_VIEW;

	public static final String TABLE_NAME = "MST_QTN";

	public static final boolean EX_CTRL = true;
	
	public static final boolean LCL_TABLE = false;
	
	/**
	 * 見積ＮＯ. Quotation No..<p>
	 *
	 */
	public static final String $qtn_no = "qtn_no";
	private static final MCPermColumnInfo _qtn_no = createColumnInfo("qtn_no");
	public final MCStringPermColumn qtn_no = createStringColumn(_qtn_no);
	
	/**
	 * 見積改訂番号. Quotation rev. number.<p>
	 *
	 */
	public static final String $qtn_rev = "qtn_rev";
	private static final MCPermColumnInfo _qtn_rev = createColumnInfo("qtn_rev");
	public final MCNumberPermColumn qtn_rev = createNumberColumn(_qtn_rev);
	
	/**
	 * 見積区分. Quotation type.<p>
	 *
	 */
	public static final String $qtn_typ = "qtn_typ";
	private static final MCPermColumnInfo _qtn_typ = createColumnInfo("qtn_typ");
	public final MCStringPermColumn qtn_typ = createStringColumn(_qtn_typ);
	
	/**
	 * 失注ＦＬＧ. Failed order flg..<p>
	 *
	 */
	public static final String $failure_flg = "failure_flg";
	private static final MCPermColumnInfo _failure_flg = createColumnInfo("failure_flg");
	public final MCBooleanPermColumn failure_flg = createBooleanColumn(_failure_flg);
	
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
	 * 見積日. Quotation date.<p>
	 *
	 */
	public static final String $qtn_dt = "qtn_dt";
	private static final MCPermColumnInfo _qtn_dt = createColumnInfo("qtn_dt");
	public final MCDatePermColumn qtn_dt = createDateColumn(_qtn_dt);
	
	/**
	 * 有効期限. Expiration date.<p>
	 *
	 */
	public static final String $valid_dt = "valid_dt";
	private static final MCPermColumnInfo _valid_dt = createColumnInfo("valid_dt");
	public final MCDatePermColumn valid_dt = createDateColumn(_valid_dt);
	
	/**
	 * 得意先ＣＤ. Customer cd..<p>
	 *
	 */
	public static final String $cst_cd = "cst_cd";
	private static final MCPermColumnInfo _cst_cd = createColumnInfo("cst_cd");
	public final MCStringPermColumn cst_cd = createStringColumn(_cst_cd);
	
	/**
	 * 得意先諸口ＦＬＧ. Miscellaneous customer flg..<p>
	 *
	 */
	public static final String $cst_sundry_flg = "cst_sundry_flg";
	private static final MCPermColumnInfo _cst_sundry_flg = createColumnInfo("cst_sundry_flg");
	public final MCBooleanPermColumn cst_sundry_flg = createBooleanColumn(_cst_sundry_flg);
	
	/**
	 * 得意先名. Customer name.<p>
	 *
	 */
	public static final String $cst_nm = "cst_nm";
	private static final MCPermColumnInfo _cst_nm = createColumnInfo("cst_nm");
	public final MCStringPermColumn cst_nm = createStringColumn(_cst_nm);
	
	/**
	 * 得意先部署. Customer dept..<p>
	 *
	 */
	public static final String $cst_cntct_dpt = "cst_cntct_dpt";
	private static final MCPermColumnInfo _cst_cntct_dpt = createColumnInfo("cst_cntct_dpt");
	public final MCStringPermColumn cst_cntct_dpt = createStringColumn(_cst_cntct_dpt);
	
	/**
	 * 得意先担当者. Customer PIC.<p>
	 *
	 */
	public static final String $cst_cntct_psn = "cst_cntct_psn";
	private static final MCPermColumnInfo _cst_cntct_psn = createColumnInfo("cst_cntct_psn");
	public final MCStringPermColumn cst_cntct_psn = createStringColumn(_cst_cntct_psn);
	
	/**
	 * 得意先郵便番号. Customer zip code.<p>
	 *
	 */
	public static final String $cst_zip_cd = "cst_zip_cd";
	private static final MCPermColumnInfo _cst_zip_cd = createColumnInfo("cst_zip_cd");
	public final MCStringPermColumn cst_zip_cd = createStringColumn(_cst_zip_cd);
	
	/**
	 * 得意先住所１. Customer address 1.<p>
	 *
	 */
	public static final String $cst_addr1 = "cst_addr1";
	private static final MCPermColumnInfo _cst_addr1 = createColumnInfo("cst_addr1");
	public final MCStringPermColumn cst_addr1 = createStringColumn(_cst_addr1);
	
	/**
	 * 得意先住所２. Customer address 2.<p>
	 *
	 */
	public static final String $cst_addr2 = "cst_addr2";
	private static final MCPermColumnInfo _cst_addr2 = createColumnInfo("cst_addr2");
	public final MCStringPermColumn cst_addr2 = createStringColumn(_cst_addr2);
	
	/**
	 * 得意先住所３. Customer address 3.<p>
	 *
	 */
	public static final String $cst_addr3 = "cst_addr3";
	private static final MCPermColumnInfo _cst_addr3 = createColumnInfo("cst_addr3");
	public final MCStringPermColumn cst_addr3 = createStringColumn(_cst_addr3);
	
	/**
	 * 得意先住所４. Customer address 4.<p>
	 *
	 */
	public static final String $cst_addr4 = "cst_addr4";
	private static final MCPermColumnInfo _cst_addr4 = createColumnInfo("cst_addr4");
	public final MCStringPermColumn cst_addr4 = createStringColumn(_cst_addr4);
	
	/**
	 * 得意先ＴＥＬ. Customer TEL.<p>
	 *
	 */
	public static final String $cst_tel = "cst_tel";
	private static final MCPermColumnInfo _cst_tel = createColumnInfo("cst_tel");
	public final MCStringPermColumn cst_tel = createStringColumn(_cst_tel);
	
	/**
	 * 得意先ＦＡＸ. Customer FAX.<p>
	 *
	 */
	public static final String $cst_fax = "cst_fax";
	private static final MCPermColumnInfo _cst_fax = createColumnInfo("cst_fax");
	public final MCStringPermColumn cst_fax = createStringColumn(_cst_fax);
	
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
	 * 輸送方法ＣＤ. Transportation method cd..<p>
	 *
	 */
	public static final String $trnspt_cd = "trnspt_cd";
	private static final MCPermColumnInfo _trnspt_cd = createColumnInfo("trnspt_cd");
	public final MCStringPermColumn trnspt_cd = createStringColumn(_trnspt_cd);
	
	/**
	 * 取引通貨ＣＤ. Transaction currency cd..<p>
	 *
	 */
	public static final String $trd_cur_cd = "trd_cur_cd";
	private static final MCPermColumnInfo _trd_cur_cd = createColumnInfo("trd_cur_cd");
	public final MCStringPermColumn trd_cur_cd = createStringColumn(_trd_cur_cd);
	
	/**
	 * 為替レート指定ＦＬＧ. Set exchange rate flg..<p>
	 *
	 */
	public static final String $xrate_inpt_flg = "xrate_inpt_flg";
	private static final MCPermColumnInfo _xrate_inpt_flg = createColumnInfo("xrate_inpt_flg");
	public final MCBooleanPermColumn xrate_inpt_flg = createBooleanColumn(_xrate_inpt_flg);
	
	/**
	 * 為替レート. Exchange rate.<p>
	 *
	 */
	public static final String $xrate = "xrate";
	private static final MCPermColumnInfo _xrate = createColumnInfo("xrate");
	public final MCNumberPermColumn xrate = createNumberColumn(_xrate);
	
	/**
	 * 売上担当者. Sales PIC.<p>
	 *
	 */
	public static final String $sls_usr_cd = "sls_usr_cd";
	private static final MCPermColumnInfo _sls_usr_cd = createColumnInfo("sls_usr_cd");
	public final MCStringPermColumn sls_usr_cd = createStringColumn(_sls_usr_cd);
	
	/**
	 * 売上部門ＣＤ. Sales dept. cd..<p>
	 *
	 */
	public static final String $sls_dpt_cd = "sls_dpt_cd";
	private static final MCPermColumnInfo _sls_dpt_cd = createColumnInfo("sls_dpt_cd");
	public final MCStringPermColumn sls_dpt_cd = createStringColumn(_sls_dpt_cd);
	
	/**
	 * ワーキンググループＣＤ. WG cd..<p>
	 *
	 */
	public static final String $wg_cd = "wg_cd";
	private static final MCPermColumnInfo _wg_cd = createColumnInfo("wg_cd");
	public final MCStringPermColumn wg_cd = createStringColumn(_wg_cd);
	
	/**
	 * 見積備考. Quotation remarks.<p>
	 *
	 */
	public static final String $qtn_rmrks = "qtn_rmrks";
	private static final MCPermColumnInfo _qtn_rmrks = createColumnInfo("qtn_rmrks");
	public final MCStringPermColumn qtn_rmrks = createStringColumn(_qtn_rmrks);
	
	/**
	 * 内部備考. Internal remarks.<p>
	 *
	 */
	public static final String $intr_rmrks = "intr_rmrks";
	private static final MCPermColumnInfo _intr_rmrks = createColumnInfo("intr_rmrks");
	public final MCStringPermColumn intr_rmrks = createStringColumn(_intr_rmrks);
	
	/**
	 * 見積条件. Quotation terms.<p>
	 *
	 */
	public static final String $qtn_term_cd = "qtn_term_cd";
	private static final MCPermColumnInfo _qtn_term_cd = createColumnInfo("qtn_term_cd");
	public final MCStringPermColumn qtn_term_cd = createStringColumn(_qtn_term_cd);
	
	/**
	 * 見積結果理由ＣＤ. Quotation result reason cd..<p>
	 *
	 */
	public static final String $qtn_rslt_rsn_cd = "qtn_rslt_rsn_cd";
	private static final MCPermColumnInfo _qtn_rslt_rsn_cd = createColumnInfo("qtn_rslt_rsn_cd");
	public final MCStringPermColumn qtn_rslt_rsn_cd = createStringColumn(_qtn_rslt_rsn_cd);
	
	/**
	 * 見積結果理由備考. Quotation result reason remarks.<p>
	 *
	 */
	public static final String $qtn_rslt_rsn_rmrks = "qtn_rslt_rsn_rmrks";
	private static final MCPermColumnInfo _qtn_rslt_rsn_rmrks = createColumnInfo("qtn_rslt_rsn_rmrks");
	public final MCStringPermColumn qtn_rslt_rsn_rmrks = createStringColumn(_qtn_rslt_rsn_rmrks);
	
	/**
	 * 案件ＮＯ. Sales project No..<p>
	 *
	 */
	public static final String $wrk_no = "wrk_no";
	private static final MCPermColumnInfo _wrk_no = createColumnInfo("wrk_no");
	public final MCStringPermColumn wrk_no = createStringColumn(_wrk_no);
	
	/**
	 * 得意先見積依頼ＮＯ. Customer quotation request No..<p>
	 *
	 */
	public static final String $cst_qtn_rqst_no = "cst_qtn_rqst_no";
	private static final MCPermColumnInfo _cst_qtn_rqst_no = createColumnInfo("cst_qtn_rqst_no");
	public final MCStringPermColumn cst_qtn_rqst_no = createStringColumn(_cst_qtn_rqst_no);
	
	/**
	 * 受付日. Receiving date.<p>
	 *
	 */
	public static final String $rcpt_dt = "rcpt_dt";
	private static final MCPermColumnInfo _rcpt_dt = createColumnInfo("rcpt_dt");
	public final MCDatePermColumn rcpt_dt = createDateColumn(_rcpt_dt);
	
	/**
	 * 受付担当者ＣＤ. Receiving PIC cd..<p>
	 *
	 */
	public static final String $rcpt_usr_cd = "rcpt_usr_cd";
	private static final MCPermColumnInfo _rcpt_usr_cd = createColumnInfo("rcpt_usr_cd");
	public final MCStringPermColumn rcpt_usr_cd = createStringColumn(_rcpt_usr_cd);
	
	/**
	 * 承認対象ＦＬＧ. For approval flg..<p>
	 *
	 */
	public static final String $aprv_flg = "aprv_flg";
	private static final MCPermColumnInfo _aprv_flg = createColumnInfo("aprv_flg");
	public final MCBooleanPermColumn aprv_flg = createBooleanColumn(_aprv_flg);
	
	/**
	 * 承認ＮＯ. Approval No..<p>
	 *
	 */
	public static final String $aprv_no = "aprv_no";
	private static final MCPermColumnInfo _aprv_no = createColumnInfo("aprv_no");
	public final MCStringPermColumn aprv_no = createStringColumn(_aprv_no);
	
	/**
	 * 承認状況区分. Approval status type.<p>
	 *
	 */
	public static final String $aprv_sts_typ = "aprv_sts_typ";
	private static final MCPermColumnInfo _aprv_sts_typ = createColumnInfo("aprv_sts_typ");
	public final MCStringPermColumn aprv_sts_typ = createStringColumn(_aprv_sts_typ);
	
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
	 * 見積書発行済ＦＬＧ. Quotation issued flg..<p>
	 *
	 */
	public static final String $qtn_prnt_flg = "qtn_prnt_flg";
	private static final MCPermColumnInfo _qtn_prnt_flg = createColumnInfo("qtn_prnt_flg");
	public final MCBooleanPermColumn qtn_prnt_flg = createBooleanColumn(_qtn_prnt_flg);
	
	/**
	 * 見積書連番. Quotation sequence number.<p>
	 *
	 */
	public static final String $qtn_prnt_seq = "qtn_prnt_seq";
	private static final MCPermColumnInfo _qtn_prnt_seq = createColumnInfo("qtn_prnt_seq");
	public final MCNumberPermColumn qtn_prnt_seq = createNumberColumn(_qtn_prnt_seq);
	
	/**
	 * 見積書発行日. Quotation issue date.<p>
	 *
	 */
	public static final String $qtn_prnt_dt = "qtn_prnt_dt";
	private static final MCPermColumnInfo _qtn_prnt_dt = createColumnInfo("qtn_prnt_dt");
	public final MCDatePermColumn qtn_prnt_dt = createDateColumn(_qtn_prnt_dt);
	
	/**
	 * 取消ＦＬＧ. Cancel flg..<p>
	 *
	 */
	public static final String $can_flg = "can_flg";
	private static final MCPermColumnInfo _can_flg = createColumnInfo("can_flg");
	public final MCBooleanPermColumn can_flg = createBooleanColumn(_can_flg);
	
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
	
	public static final MCMeta qtn_no_META = createCommonMeta($qtn_no, mcframe.commonMA.meta.MA_META.QTN_NO);
	public static final MCMeta qtn_rev_META = createCommonMeta($qtn_rev, mcframe.commonMA.meta.MA_META.SLIP_REV);
	public static final MCMeta qtn_typ_META = createCommonMeta($qtn_typ, mcframe.commonMS.meta.MS_META.QTN_TYP);
	public static final MCMeta failure_flg_META = createCommonMeta($failure_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta trd_cd_META = createCommonMeta($trd_cd, mcframe.commonMA.meta.MA_META.TRD_CD);
	public static final MCMeta trd_ptn_typ_META = createCommonMeta($trd_ptn_typ, mcframe.commonMA.meta.MA_META.TRD_PTN_TYP);
	public static final MCMeta qtn_dt_META = createCommonMeta($qtn_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta valid_dt_META = createCommonMeta($valid_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta cst_cd_META = createCommonMeta($cst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta cst_sundry_flg_META = createCommonMeta($cst_sundry_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cst_nm_META = createCommonMeta($cst_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta cst_cntct_dpt_META = createCommonMeta($cst_cntct_dpt, mcframe.commonMA.meta.MA_META.BP_CNTCT_DPT);
	public static final MCMeta cst_cntct_psn_META = createCommonMeta($cst_cntct_psn, mcframe.commonMA.meta.MA_META.BP_CNTCT_PSN);
	public static final MCMeta cst_zip_cd_META = createCommonMeta($cst_zip_cd, mcframe.commonMA.meta.MA_META.ZIP_CD);
	public static final MCMeta cst_addr1_META = createCommonMeta($cst_addr1, mcframe.commonMA.meta.MA_META.ADDR1);
	public static final MCMeta cst_addr2_META = createCommonMeta($cst_addr2, mcframe.commonMA.meta.MA_META.ADDR2);
	public static final MCMeta cst_addr3_META = createCommonMeta($cst_addr3, mcframe.commonMA.meta.MA_META.ADDR3);
	public static final MCMeta cst_addr4_META = createCommonMeta($cst_addr4, mcframe.commonMA.meta.MA_META.ADDR4);
	public static final MCMeta cst_tel_META = createCommonMeta($cst_tel, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta cst_fax_META = createCommonMeta($cst_fax, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta tterm_cd1_META = createCommonMeta($tterm_cd1, mcframe.commonMA.meta.MA_META.TTERM_CD);
	public static final MCMeta tterm_rmrks1_META = createCommonMeta($tterm_rmrks1, mcframe.commonMS.meta.MS_META.TTERM_RMRKS1);
	public static final MCMeta tterm_cd2_META = createCommonMeta($tterm_cd2, mcframe.commonMA.meta.MA_META.TTERM_CD);
	public static final MCMeta tterm_rmrks2_META = createCommonMeta($tterm_rmrks2, mcframe.commonMS.meta.MS_META.TTERM_RMRKS2);
	public static final MCMeta tterm_cd3_META = createCommonMeta($tterm_cd3, mcframe.commonMA.meta.MA_META.TTERM_CD);
	public static final MCMeta tterm_rmrks3_META = createCommonMeta($tterm_rmrks3, mcframe.commonMS.meta.MS_META.TTERM_RMRKS3);
	public static final MCMeta trnspt_cd_META = createCommonMeta($trnspt_cd, mcframe.commonMA.meta.MA_META.TRNSPT_CD);
	public static final MCMeta trd_cur_cd_META = createCommonMeta($trd_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta xrate_inpt_flg_META = createCommonMeta($xrate_inpt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta xrate_META = createCommonMeta($xrate, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta sls_usr_cd_META = createCommonMeta($sls_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta sls_dpt_cd_META = createCommonMeta($sls_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta qtn_rmrks_META = createCommonMeta($qtn_rmrks, mcframe.commonMS.meta.MS_META.QTN_RMRKS);
	public static final MCMeta intr_rmrks_META = createCommonMeta($intr_rmrks, mcframe.commonMS.meta.MS_META.QTN_INTR_RMRKS);
	public static final MCMeta qtn_term_cd_META = createCommonMeta($qtn_term_cd, mcframe.commonMS.meta.MS_META.SLO_RSN_CD);
	public static final MCMeta qtn_rslt_rsn_cd_META = createCommonMeta($qtn_rslt_rsn_cd, mcframe.commonMS.meta.MS_META.SLO_RSN_CD);
	public static final MCMeta qtn_rslt_rsn_rmrks_META = createCommonMeta($qtn_rslt_rsn_rmrks, mcframe.commonMS.meta.MS_META.QTN_RSLT_RSN_RMRKS);
	public static final MCMeta wrk_no_META = createCommonMeta($wrk_no, mcframe.commonMA.meta.MA_META.WRK_NO);
	public static final MCMeta cst_qtn_rqst_no_META = createCommonMeta($cst_qtn_rqst_no, mcframe.commonMA.meta.MA_META.CST_QTN_RQST_NO);
	public static final MCMeta rcpt_dt_META = createCommonMeta($rcpt_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta rcpt_usr_cd_META = createCommonMeta($rcpt_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta aprv_flg_META = createCommonMeta($aprv_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta aprv_no_META = createCommonMeta($aprv_no, mcframe.commonMA.meta.MA_META.APRV_NO);
	public static final MCMeta aprv_sts_typ_META = createCommonMeta($aprv_sts_typ, mcframe.commonMA.meta.MA_META.APRV_STS_TYP);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.QTN_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.QTN_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.QTN_SUB_CHAR3);
	public static final MCMeta qtn_prnt_flg_META = createCommonMeta($qtn_prnt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta qtn_prnt_seq_META = createCommonMeta($qtn_prnt_seq, mcframe.commonMA.meta.MA_META.PRNT_SEQ);
	public static final MCMeta qtn_prnt_dt_META = createCommonMeta($qtn_prnt_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta can_flg_META = createCommonMeta($can_flg, mcframe.commonMA.meta.MA_META.FLG);
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
	
	protected static final ConstMetaList<MST_QTN_R> constMetas = new ConstMetaList<MST_QTN_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			qtn_no_META,
			qtn_rev_META,
			qtn_typ_META,
			failure_flg_META,
			trd_cd_META,
			trd_ptn_typ_META,
			qtn_dt_META,
			valid_dt_META,
			cst_cd_META,
			cst_sundry_flg_META,
			cst_nm_META,
			cst_cntct_dpt_META,
			cst_cntct_psn_META,
			cst_zip_cd_META,
			cst_addr1_META,
			cst_addr2_META,
			cst_addr3_META,
			cst_addr4_META,
			cst_tel_META,
			cst_fax_META,
			tterm_cd1_META,
			tterm_rmrks1_META,
			tterm_cd2_META,
			tterm_rmrks2_META,
			tterm_cd3_META,
			tterm_rmrks3_META,
			trnspt_cd_META,
			trd_cur_cd_META,
			xrate_inpt_flg_META,
			xrate_META,
			sls_usr_cd_META,
			sls_dpt_cd_META,
			wg_cd_META,
			qtn_rmrks_META,
			intr_rmrks_META,
			qtn_term_cd_META,
			qtn_rslt_rsn_cd_META,
			qtn_rslt_rsn_rmrks_META,
			wrk_no_META,
			cst_qtn_rqst_no_META,
			rcpt_dt_META,
			rcpt_usr_cd_META,
			aprv_flg_META,
			aprv_no_META,
			aprv_sts_typ_META,
			sub_char1_META,
			sub_char2_META,
			sub_char3_META,
			qtn_prnt_flg_META,
			qtn_prnt_seq_META,
			qtn_prnt_dt_META,
			can_flg_META,
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
	protected MST_QTN_R(ConstMetaList<? extends MST_QTN_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MST_QTN_R(ConstMetaList<? extends MST_QTN_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MST_QTN_R.$qtn_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_QTN_R.$qtn_no,
				"qtn_no",
				qtn_no,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_QTN_R.$qtn_rev,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_QTN_R.$qtn_rev,
				"qtn_rev",
				qtn_rev,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_QTN_R.$qtn_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_QTN_R.$qtn_typ,
				"qtn_typ",
				qtn_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_QTN_R.$failure_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_QTN_R.$failure_flg,
				"failure_flg",
				failure_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_QTN_R.$trd_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_QTN_R.$trd_cd,
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
			MST_QTN_R.$trd_ptn_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_QTN_R.$trd_ptn_typ,
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
			MST_QTN_R.$qtn_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_QTN_R.$qtn_dt,
				"qtn_dt",
				qtn_dt,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_QTN_R.$valid_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_QTN_R.$valid_dt,
				"valid_dt",
				valid_dt,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_QTN_R.$cst_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_QTN_R.$cst_cd,
				"cst_cd",
				cst_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_QTN_R.$cst_sundry_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_QTN_R.$cst_sundry_flg,
				"cst_sundry_flg",
				cst_sundry_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_QTN_R.$cst_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_QTN_R.$cst_nm,
				"cst_nm",
				cst_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_QTN_R.$cst_cntct_dpt,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_QTN_R.$cst_cntct_dpt,
				"cst_cntct_dpt",
				cst_cntct_dpt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_QTN_R.$cst_cntct_psn,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_QTN_R.$cst_cntct_psn,
				"cst_cntct_psn",
				cst_cntct_psn,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_QTN_R.$cst_zip_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_QTN_R.$cst_zip_cd,
				"cst_zip_cd",
				cst_zip_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_QTN_R.$cst_addr1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_QTN_R.$cst_addr1,
				"cst_addr1",
				cst_addr1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_QTN_R.$cst_addr2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_QTN_R.$cst_addr2,
				"cst_addr2",
				cst_addr2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_QTN_R.$cst_addr3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_QTN_R.$cst_addr3,
				"cst_addr3",
				cst_addr3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_QTN_R.$cst_addr4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_QTN_R.$cst_addr4,
				"cst_addr4",
				cst_addr4,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_QTN_R.$cst_tel,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_QTN_R.$cst_tel,
				"cst_tel",
				cst_tel,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_QTN_R.$cst_fax,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_QTN_R.$cst_fax,
				"cst_fax",
				cst_fax,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_QTN_R.$tterm_cd1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_QTN_R.$tterm_cd1,
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
			MST_QTN_R.$tterm_rmrks1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_QTN_R.$tterm_rmrks1,
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
			MST_QTN_R.$tterm_cd2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_QTN_R.$tterm_cd2,
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
			MST_QTN_R.$tterm_rmrks2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_QTN_R.$tterm_rmrks2,
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
			MST_QTN_R.$tterm_cd3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_QTN_R.$tterm_cd3,
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
			MST_QTN_R.$tterm_rmrks3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_QTN_R.$tterm_rmrks3,
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
			MST_QTN_R.$trnspt_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_QTN_R.$trnspt_cd,
				"trnspt_cd",
				trnspt_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_QTN_R.$trd_cur_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_QTN_R.$trd_cur_cd,
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
			MST_QTN_R.$xrate_inpt_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_QTN_R.$xrate_inpt_flg,
				"xrate_inpt_flg",
				xrate_inpt_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_QTN_R.$xrate,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_QTN_R.$xrate,
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
			MST_QTN_R.$sls_usr_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_QTN_R.$sls_usr_cd,
				"sls_usr_cd",
				sls_usr_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_QTN_R.$sls_dpt_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_QTN_R.$sls_dpt_cd,
				"sls_dpt_cd",
				sls_dpt_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_QTN_R.$wg_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_QTN_R.$wg_cd,
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
			MST_QTN_R.$qtn_rmrks,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_QTN_R.$qtn_rmrks,
				"qtn_rmrks",
				qtn_rmrks,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_QTN_R.$intr_rmrks,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_QTN_R.$intr_rmrks,
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
			MST_QTN_R.$qtn_term_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_QTN_R.$qtn_term_cd,
				"qtn_term_cd",
				qtn_term_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_QTN_R.$qtn_rslt_rsn_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_QTN_R.$qtn_rslt_rsn_cd,
				"qtn_rslt_rsn_cd",
				qtn_rslt_rsn_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_QTN_R.$qtn_rslt_rsn_rmrks,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_QTN_R.$qtn_rslt_rsn_rmrks,
				"qtn_rslt_rsn_rmrks",
				qtn_rslt_rsn_rmrks,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_QTN_R.$wrk_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_QTN_R.$wrk_no,
				"wrk_no",
				wrk_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_QTN_R.$cst_qtn_rqst_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_QTN_R.$cst_qtn_rqst_no,
				"cst_qtn_rqst_no",
				cst_qtn_rqst_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_QTN_R.$rcpt_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_QTN_R.$rcpt_dt,
				"rcpt_dt",
				rcpt_dt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_QTN_R.$rcpt_usr_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_QTN_R.$rcpt_usr_cd,
				"rcpt_usr_cd",
				rcpt_usr_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_QTN_R.$aprv_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_QTN_R.$aprv_flg,
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
			MST_QTN_R.$aprv_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_QTN_R.$aprv_no,
				"aprv_no",
				aprv_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_QTN_R.$aprv_sts_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_QTN_R.$aprv_sts_typ,
				"aprv_sts_typ",
				aprv_sts_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_QTN_R.$sub_char1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_QTN_R.$sub_char1,
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
			MST_QTN_R.$sub_char2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_QTN_R.$sub_char2,
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
			MST_QTN_R.$sub_char3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_QTN_R.$sub_char3,
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
			MST_QTN_R.$qtn_prnt_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_QTN_R.$qtn_prnt_flg,
				"qtn_prnt_flg",
				qtn_prnt_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_QTN_R.$qtn_prnt_seq,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_QTN_R.$qtn_prnt_seq,
				"qtn_prnt_seq",
				qtn_prnt_seq,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_QTN_R.$qtn_prnt_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_QTN_R.$qtn_prnt_dt,
				"qtn_prnt_dt",
				qtn_prnt_dt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_QTN_R.$can_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_QTN_R.$can_flg,
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
			MST_QTN_R.$ins_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_QTN_R.$ins_usr_id,
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
			MST_QTN_R.$ins_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_QTN_R.$ins_usr_nm,
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
			MST_QTN_R.$ins_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MST_QTN_R.$ins_ts,
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
			MST_QTN_R.$ins_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_QTN_R.$ins_func_id,
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
			MST_QTN_R.$upd_cntr,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_QTN_R.$upd_cntr,
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
			MST_QTN_R.$upd_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_QTN_R.$upd_usr_id,
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
			MST_QTN_R.$upd_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_QTN_R.$upd_usr_nm,
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
			MST_QTN_R.$upd_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MST_QTN_R.$upd_ts,
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
			MST_QTN_R.$upd_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_QTN_R.$upd_func_id,
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
			MST_QTN_R.$upd_srv_req_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_QTN_R.$upd_srv_req_no,
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
	public static MST_QTN_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MST_QTN_R create(String alias) {
		MST_QTN_R row = new MST_QTN_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MST_QTN_R createByName(T proto) {
		MST_QTN_R row = MST_QTN_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MST_QTN_R clone() {
		return (MST_QTN_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MST_QTN_R createInstance() {
		return (MST_QTN_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MST_QTN_R getValues(String... names) {
		return (MST_QTN_R) super.getValues(names);
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
	 public MSW_QTN_KEY_R getPkWorkDbc(String alias) {
	 	return MSW_QTN_KEY_R.create(alias);
	 }

	/*
	 * MCDBContainerのオーバーライドメソッドです。
	 */
	 public MSW_QTN_KEY_R getPkWorkDbc() {
	 	return getPkWorkDbc(MSW_QTN_KEY_R.TABLE_NAME);
	 }

	/**
	 * 見積ＮＯ. Quotation No..<p>
	 *
	 */
	public String qtn_no() {
		return getConstString(offset + 0, $qtn_no);
	}

	/**
	 * 見積ＮＯ. Quotation No..<p>
	 *
	 */
	public void qtn_no(String value) {
		setConstString(offset + 0, $qtn_no, value);
	}

	/**
	 * 見積改訂番号. Quotation rev. number.<p>
	 *
	 */
	public MCNumber qtn_rev() {
		return getConstNumber(offset + 1, $qtn_rev);
	}

	/**
	 * 見積改訂番号. Quotation rev. number.<p>
	 *
	 */
	public void qtn_rev(MCNumber value) {
		setConstNumber(offset + 1, $qtn_rev, value);
	}
	
	/**
	 * 見積改訂番号. Quotation rev. number.<p>
	 *
	 */
	public void qtn_rev(int value) {
		setConstNumber(offset + 1, $qtn_rev, value);
	}
	
	/**
	 * 見積改訂番号. Quotation rev. number.<p>
	 *
	 */
	public void qtn_rev(long value) {
		setConstNumber(offset + 1, $qtn_rev, value);
	}
	
	/**
	 * 見積改訂番号. Quotation rev. number.<p>
	 *
	 */
	public void qtn_rev(float value) {
		setConstNumber(offset + 1, $qtn_rev, value);
	}
	
	/**
	 * 見積改訂番号. Quotation rev. number.<p>
	 *
	 */
	public void qtn_rev(double value) {
		setConstNumber(offset + 1, $qtn_rev, value);
	}
	
	/**
	 * 見積区分. Quotation type.<p>
	 *
	 */
	public String qtn_typ() {
		return getConstString(offset + 2, $qtn_typ);
	}

	/**
	 * 見積区分. Quotation type.<p>
	 *
	 */
	public void qtn_typ(String value) {
		setConstString(offset + 2, $qtn_typ, value);
	}

	/**
	 * 失注ＦＬＧ. Failed order flg..<p>
	 *
	 */
	public boolean failure_flg() {
		return getConstBoolean(offset + 3, $failure_flg);
	}

	/**
	 * 失注ＦＬＧ. Failed order flg..<p>
	 *
	 */
	public void failure_flg(boolean value) {
		setConstBoolean(offset + 3, $failure_flg, value);
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
	 * 取引パタン区分. Transaction pattern type.<p>
	 *
	 */
	public String trd_ptn_typ() {
		return getConstString(offset + 5, $trd_ptn_typ);
	}

	/**
	 * 取引パタン区分. Transaction pattern type.<p>
	 *
	 */
	public void trd_ptn_typ(String value) {
		setConstString(offset + 5, $trd_ptn_typ, value);
	}

	/**
	 * 見積日. Quotation date.<p>
	 *
	 */
	public MCDate qtn_dt() {
		return getConstDate(offset + 6, $qtn_dt);
	}

	/**
	 * 見積日. Quotation date.<p>
	 *
	 */
	public void qtn_dt(MCDate value) {
		setConstDate(offset + 6, $qtn_dt, value);
	}

	/**
	 * 有効期限. Expiration date.<p>
	 *
	 */
	public MCDate valid_dt() {
		return getConstDate(offset + 7, $valid_dt);
	}

	/**
	 * 有効期限. Expiration date.<p>
	 *
	 */
	public void valid_dt(MCDate value) {
		setConstDate(offset + 7, $valid_dt, value);
	}

	/**
	 * 得意先ＣＤ. Customer cd..<p>
	 *
	 */
	public String cst_cd() {
		return getConstString(offset + 8, $cst_cd);
	}

	/**
	 * 得意先ＣＤ. Customer cd..<p>
	 *
	 */
	public void cst_cd(String value) {
		setConstString(offset + 8, $cst_cd, value);
	}

	/**
	 * 得意先諸口ＦＬＧ. Miscellaneous customer flg..<p>
	 *
	 */
	public boolean cst_sundry_flg() {
		return getConstBoolean(offset + 9, $cst_sundry_flg);
	}

	/**
	 * 得意先諸口ＦＬＧ. Miscellaneous customer flg..<p>
	 *
	 */
	public void cst_sundry_flg(boolean value) {
		setConstBoolean(offset + 9, $cst_sundry_flg, value);
	}

	/**
	 * 得意先名. Customer name.<p>
	 *
	 */
	public String cst_nm() {
		return getConstString(offset + 10, $cst_nm);
	}

	/**
	 * 得意先名. Customer name.<p>
	 *
	 */
	public void cst_nm(String value) {
		setConstString(offset + 10, $cst_nm, value);
	}

	/**
	 * 得意先部署. Customer dept..<p>
	 *
	 */
	public String cst_cntct_dpt() {
		return getConstString(offset + 11, $cst_cntct_dpt);
	}

	/**
	 * 得意先部署. Customer dept..<p>
	 *
	 */
	public void cst_cntct_dpt(String value) {
		setConstString(offset + 11, $cst_cntct_dpt, value);
	}

	/**
	 * 得意先担当者. Customer PIC.<p>
	 *
	 */
	public String cst_cntct_psn() {
		return getConstString(offset + 12, $cst_cntct_psn);
	}

	/**
	 * 得意先担当者. Customer PIC.<p>
	 *
	 */
	public void cst_cntct_psn(String value) {
		setConstString(offset + 12, $cst_cntct_psn, value);
	}

	/**
	 * 得意先郵便番号. Customer zip code.<p>
	 *
	 */
	public String cst_zip_cd() {
		return getConstString(offset + 13, $cst_zip_cd);
	}

	/**
	 * 得意先郵便番号. Customer zip code.<p>
	 *
	 */
	public void cst_zip_cd(String value) {
		setConstString(offset + 13, $cst_zip_cd, value);
	}

	/**
	 * 得意先住所１. Customer address 1.<p>
	 *
	 */
	public String cst_addr1() {
		return getConstString(offset + 14, $cst_addr1);
	}

	/**
	 * 得意先住所１. Customer address 1.<p>
	 *
	 */
	public void cst_addr1(String value) {
		setConstString(offset + 14, $cst_addr1, value);
	}

	/**
	 * 得意先住所２. Customer address 2.<p>
	 *
	 */
	public String cst_addr2() {
		return getConstString(offset + 15, $cst_addr2);
	}

	/**
	 * 得意先住所２. Customer address 2.<p>
	 *
	 */
	public void cst_addr2(String value) {
		setConstString(offset + 15, $cst_addr2, value);
	}

	/**
	 * 得意先住所３. Customer address 3.<p>
	 *
	 */
	public String cst_addr3() {
		return getConstString(offset + 16, $cst_addr3);
	}

	/**
	 * 得意先住所３. Customer address 3.<p>
	 *
	 */
	public void cst_addr3(String value) {
		setConstString(offset + 16, $cst_addr3, value);
	}

	/**
	 * 得意先住所４. Customer address 4.<p>
	 *
	 */
	public String cst_addr4() {
		return getConstString(offset + 17, $cst_addr4);
	}

	/**
	 * 得意先住所４. Customer address 4.<p>
	 *
	 */
	public void cst_addr4(String value) {
		setConstString(offset + 17, $cst_addr4, value);
	}

	/**
	 * 得意先ＴＥＬ. Customer TEL.<p>
	 *
	 */
	public String cst_tel() {
		return getConstString(offset + 18, $cst_tel);
	}

	/**
	 * 得意先ＴＥＬ. Customer TEL.<p>
	 *
	 */
	public void cst_tel(String value) {
		setConstString(offset + 18, $cst_tel, value);
	}

	/**
	 * 得意先ＦＡＸ. Customer FAX.<p>
	 *
	 */
	public String cst_fax() {
		return getConstString(offset + 19, $cst_fax);
	}

	/**
	 * 得意先ＦＡＸ. Customer FAX.<p>
	 *
	 */
	public void cst_fax(String value) {
		setConstString(offset + 19, $cst_fax, value);
	}

	/**
	 * 取引条件ＣＤ１. Transaction terms cd. 1.<p>
	 *
	 */
	public String tterm_cd1() {
		return getConstString(offset + 20, $tterm_cd1);
	}

	/**
	 * 取引条件ＣＤ１. Transaction terms cd. 1.<p>
	 *
	 */
	public void tterm_cd1(String value) {
		setConstString(offset + 20, $tterm_cd1, value);
	}

	/**
	 * 取引条件備考１. Transaction terms remarks 1.<p>
	 *
	 */
	public String tterm_rmrks1() {
		return getConstString(offset + 21, $tterm_rmrks1);
	}

	/**
	 * 取引条件備考１. Transaction terms remarks 1.<p>
	 *
	 */
	public void tterm_rmrks1(String value) {
		setConstString(offset + 21, $tterm_rmrks1, value);
	}

	/**
	 * 取引条件ＣＤ２. Transaction terms cd. 2.<p>
	 *
	 */
	public String tterm_cd2() {
		return getConstString(offset + 22, $tterm_cd2);
	}

	/**
	 * 取引条件ＣＤ２. Transaction terms cd. 2.<p>
	 *
	 */
	public void tterm_cd2(String value) {
		setConstString(offset + 22, $tterm_cd2, value);
	}

	/**
	 * 取引条件備考２. Transaction terms remarks 2.<p>
	 *
	 */
	public String tterm_rmrks2() {
		return getConstString(offset + 23, $tterm_rmrks2);
	}

	/**
	 * 取引条件備考２. Transaction terms remarks 2.<p>
	 *
	 */
	public void tterm_rmrks2(String value) {
		setConstString(offset + 23, $tterm_rmrks2, value);
	}

	/**
	 * 取引条件ＣＤ３. Transaction terms cd. 3.<p>
	 *
	 */
	public String tterm_cd3() {
		return getConstString(offset + 24, $tterm_cd3);
	}

	/**
	 * 取引条件ＣＤ３. Transaction terms cd. 3.<p>
	 *
	 */
	public void tterm_cd3(String value) {
		setConstString(offset + 24, $tterm_cd3, value);
	}

	/**
	 * 取引条件備考３. Transaction terms remarks 3.<p>
	 *
	 */
	public String tterm_rmrks3() {
		return getConstString(offset + 25, $tterm_rmrks3);
	}

	/**
	 * 取引条件備考３. Transaction terms remarks 3.<p>
	 *
	 */
	public void tterm_rmrks3(String value) {
		setConstString(offset + 25, $tterm_rmrks3, value);
	}

	/**
	 * 輸送方法ＣＤ. Transportation method cd..<p>
	 *
	 */
	public String trnspt_cd() {
		return getConstString(offset + 26, $trnspt_cd);
	}

	/**
	 * 輸送方法ＣＤ. Transportation method cd..<p>
	 *
	 */
	public void trnspt_cd(String value) {
		setConstString(offset + 26, $trnspt_cd, value);
	}

	/**
	 * 取引通貨ＣＤ. Transaction currency cd..<p>
	 *
	 */
	public String trd_cur_cd() {
		return getConstString(offset + 27, $trd_cur_cd);
	}

	/**
	 * 取引通貨ＣＤ. Transaction currency cd..<p>
	 *
	 */
	public void trd_cur_cd(String value) {
		setConstString(offset + 27, $trd_cur_cd, value);
	}

	/**
	 * 為替レート指定ＦＬＧ. Set exchange rate flg..<p>
	 *
	 */
	public boolean xrate_inpt_flg() {
		return getConstBoolean(offset + 28, $xrate_inpt_flg);
	}

	/**
	 * 為替レート指定ＦＬＧ. Set exchange rate flg..<p>
	 *
	 */
	public void xrate_inpt_flg(boolean value) {
		setConstBoolean(offset + 28, $xrate_inpt_flg, value);
	}

	/**
	 * 為替レート. Exchange rate.<p>
	 *
	 */
	public MCNumber xrate() {
		return getConstNumber(offset + 29, $xrate);
	}

	/**
	 * 為替レート. Exchange rate.<p>
	 *
	 */
	public void xrate(MCNumber value) {
		setConstNumber(offset + 29, $xrate, value);
	}
	
	/**
	 * 為替レート. Exchange rate.<p>
	 *
	 */
	public void xrate(int value) {
		setConstNumber(offset + 29, $xrate, value);
	}
	
	/**
	 * 為替レート. Exchange rate.<p>
	 *
	 */
	public void xrate(long value) {
		setConstNumber(offset + 29, $xrate, value);
	}
	
	/**
	 * 為替レート. Exchange rate.<p>
	 *
	 */
	public void xrate(float value) {
		setConstNumber(offset + 29, $xrate, value);
	}
	
	/**
	 * 為替レート. Exchange rate.<p>
	 *
	 */
	public void xrate(double value) {
		setConstNumber(offset + 29, $xrate, value);
	}
	
	/**
	 * 売上担当者. Sales PIC.<p>
	 *
	 */
	public String sls_usr_cd() {
		return getConstString(offset + 30, $sls_usr_cd);
	}

	/**
	 * 売上担当者. Sales PIC.<p>
	 *
	 */
	public void sls_usr_cd(String value) {
		setConstString(offset + 30, $sls_usr_cd, value);
	}

	/**
	 * 売上部門ＣＤ. Sales dept. cd..<p>
	 *
	 */
	public String sls_dpt_cd() {
		return getConstString(offset + 31, $sls_dpt_cd);
	}

	/**
	 * 売上部門ＣＤ. Sales dept. cd..<p>
	 *
	 */
	public void sls_dpt_cd(String value) {
		setConstString(offset + 31, $sls_dpt_cd, value);
	}

	/**
	 * ワーキンググループＣＤ. WG cd..<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 32, $wg_cd);
	}

	/**
	 * ワーキンググループＣＤ. WG cd..<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 32, $wg_cd, value);
	}

	/**
	 * 見積備考. Quotation remarks.<p>
	 *
	 */
	public String qtn_rmrks() {
		return getConstString(offset + 33, $qtn_rmrks);
	}

	/**
	 * 見積備考. Quotation remarks.<p>
	 *
	 */
	public void qtn_rmrks(String value) {
		setConstString(offset + 33, $qtn_rmrks, value);
	}

	/**
	 * 内部備考. Internal remarks.<p>
	 *
	 */
	public String intr_rmrks() {
		return getConstString(offset + 34, $intr_rmrks);
	}

	/**
	 * 内部備考. Internal remarks.<p>
	 *
	 */
	public void intr_rmrks(String value) {
		setConstString(offset + 34, $intr_rmrks, value);
	}

	/**
	 * 見積条件. Quotation terms.<p>
	 *
	 */
	public String qtn_term_cd() {
		return getConstString(offset + 35, $qtn_term_cd);
	}

	/**
	 * 見積条件. Quotation terms.<p>
	 *
	 */
	public void qtn_term_cd(String value) {
		setConstString(offset + 35, $qtn_term_cd, value);
	}

	/**
	 * 見積結果理由ＣＤ. Quotation result reason cd..<p>
	 *
	 */
	public String qtn_rslt_rsn_cd() {
		return getConstString(offset + 36, $qtn_rslt_rsn_cd);
	}

	/**
	 * 見積結果理由ＣＤ. Quotation result reason cd..<p>
	 *
	 */
	public void qtn_rslt_rsn_cd(String value) {
		setConstString(offset + 36, $qtn_rslt_rsn_cd, value);
	}

	/**
	 * 見積結果理由備考. Quotation result reason remarks.<p>
	 *
	 */
	public String qtn_rslt_rsn_rmrks() {
		return getConstString(offset + 37, $qtn_rslt_rsn_rmrks);
	}

	/**
	 * 見積結果理由備考. Quotation result reason remarks.<p>
	 *
	 */
	public void qtn_rslt_rsn_rmrks(String value) {
		setConstString(offset + 37, $qtn_rslt_rsn_rmrks, value);
	}

	/**
	 * 案件ＮＯ. Sales project No..<p>
	 *
	 */
	public String wrk_no() {
		return getConstString(offset + 38, $wrk_no);
	}

	/**
	 * 案件ＮＯ. Sales project No..<p>
	 *
	 */
	public void wrk_no(String value) {
		setConstString(offset + 38, $wrk_no, value);
	}

	/**
	 * 得意先見積依頼ＮＯ. Customer quotation request No..<p>
	 *
	 */
	public String cst_qtn_rqst_no() {
		return getConstString(offset + 39, $cst_qtn_rqst_no);
	}

	/**
	 * 得意先見積依頼ＮＯ. Customer quotation request No..<p>
	 *
	 */
	public void cst_qtn_rqst_no(String value) {
		setConstString(offset + 39, $cst_qtn_rqst_no, value);
	}

	/**
	 * 受付日. Receiving date.<p>
	 *
	 */
	public MCDate rcpt_dt() {
		return getConstDate(offset + 40, $rcpt_dt);
	}

	/**
	 * 受付日. Receiving date.<p>
	 *
	 */
	public void rcpt_dt(MCDate value) {
		setConstDate(offset + 40, $rcpt_dt, value);
	}

	/**
	 * 受付担当者ＣＤ. Receiving PIC cd..<p>
	 *
	 */
	public String rcpt_usr_cd() {
		return getConstString(offset + 41, $rcpt_usr_cd);
	}

	/**
	 * 受付担当者ＣＤ. Receiving PIC cd..<p>
	 *
	 */
	public void rcpt_usr_cd(String value) {
		setConstString(offset + 41, $rcpt_usr_cd, value);
	}

	/**
	 * 承認対象ＦＬＧ. For approval flg..<p>
	 *
	 */
	public boolean aprv_flg() {
		return getConstBoolean(offset + 42, $aprv_flg);
	}

	/**
	 * 承認対象ＦＬＧ. For approval flg..<p>
	 *
	 */
	public void aprv_flg(boolean value) {
		setConstBoolean(offset + 42, $aprv_flg, value);
	}

	/**
	 * 承認ＮＯ. Approval No..<p>
	 *
	 */
	public String aprv_no() {
		return getConstString(offset + 43, $aprv_no);
	}

	/**
	 * 承認ＮＯ. Approval No..<p>
	 *
	 */
	public void aprv_no(String value) {
		setConstString(offset + 43, $aprv_no, value);
	}

	/**
	 * 承認状況区分. Approval status type.<p>
	 *
	 */
	public String aprv_sts_typ() {
		return getConstString(offset + 44, $aprv_sts_typ);
	}

	/**
	 * 承認状況区分. Approval status type.<p>
	 *
	 */
	public void aprv_sts_typ(String value) {
		setConstString(offset + 44, $aprv_sts_typ, value);
	}

	/**
	 * 予備１. Spare 1.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 45, $sub_char1);
	}

	/**
	 * 予備１. Spare 1.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 45, $sub_char1, value);
	}

	/**
	 * 予備２. Spare 2.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 46, $sub_char2);
	}

	/**
	 * 予備２. Spare 2.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 46, $sub_char2, value);
	}

	/**
	 * 予備３. Spare 3.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 47, $sub_char3);
	}

	/**
	 * 予備３. Spare 3.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 47, $sub_char3, value);
	}

	/**
	 * 見積書発行済ＦＬＧ. Quotation issued flg..<p>
	 *
	 */
	public boolean qtn_prnt_flg() {
		return getConstBoolean(offset + 48, $qtn_prnt_flg);
	}

	/**
	 * 見積書発行済ＦＬＧ. Quotation issued flg..<p>
	 *
	 */
	public void qtn_prnt_flg(boolean value) {
		setConstBoolean(offset + 48, $qtn_prnt_flg, value);
	}

	/**
	 * 見積書連番. Quotation sequence number.<p>
	 *
	 */
	public MCNumber qtn_prnt_seq() {
		return getConstNumber(offset + 49, $qtn_prnt_seq);
	}

	/**
	 * 見積書連番. Quotation sequence number.<p>
	 *
	 */
	public void qtn_prnt_seq(MCNumber value) {
		setConstNumber(offset + 49, $qtn_prnt_seq, value);
	}
	
	/**
	 * 見積書連番. Quotation sequence number.<p>
	 *
	 */
	public void qtn_prnt_seq(int value) {
		setConstNumber(offset + 49, $qtn_prnt_seq, value);
	}
	
	/**
	 * 見積書連番. Quotation sequence number.<p>
	 *
	 */
	public void qtn_prnt_seq(long value) {
		setConstNumber(offset + 49, $qtn_prnt_seq, value);
	}
	
	/**
	 * 見積書連番. Quotation sequence number.<p>
	 *
	 */
	public void qtn_prnt_seq(float value) {
		setConstNumber(offset + 49, $qtn_prnt_seq, value);
	}
	
	/**
	 * 見積書連番. Quotation sequence number.<p>
	 *
	 */
	public void qtn_prnt_seq(double value) {
		setConstNumber(offset + 49, $qtn_prnt_seq, value);
	}
	
	/**
	 * 見積書発行日. Quotation issue date.<p>
	 *
	 */
	public MCDate qtn_prnt_dt() {
		return getConstDate(offset + 50, $qtn_prnt_dt);
	}

	/**
	 * 見積書発行日. Quotation issue date.<p>
	 *
	 */
	public void qtn_prnt_dt(MCDate value) {
		setConstDate(offset + 50, $qtn_prnt_dt, value);
	}

	/**
	 * 取消ＦＬＧ. Cancel flg..<p>
	 *
	 */
	public boolean can_flg() {
		return getConstBoolean(offset + 51, $can_flg);
	}

	/**
	 * 取消ＦＬＧ. Cancel flg..<p>
	 *
	 */
	public void can_flg(boolean value) {
		setConstBoolean(offset + 51, $can_flg, value);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 52, $ins_usr_id);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 52, $ins_usr_id, value);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 53, $ins_usr_nm);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 53, $ins_usr_nm, value);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 54, $ins_ts);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 54, $ins_ts, value);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 55, $ins_func_id);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 55, $ins_func_id, value);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 56, $upd_cntr);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 56, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 56, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 56, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 56, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 56, $upd_cntr, value);
	}
	
	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 57, $upd_usr_id);
	}

	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 57, $upd_usr_id, value);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 58, $upd_usr_nm);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 58, $upd_usr_nm, value);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 59, $upd_ts);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 59, $upd_ts, value);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 60, $upd_func_id);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 60, $upd_func_id, value);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 61, $upd_srv_req_no);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 61, $upd_srv_req_no, value);
	}

	public String getString(String name) {
		if ($qtn_no.equalsIgnoreCase(name)) {
			return qtn_no();
		}
		if ($qtn_typ.equalsIgnoreCase(name)) {
			return qtn_typ();
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			return trd_cd();
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			return trd_ptn_typ();
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			return cst_cd();
		}
		if ($cst_nm.equalsIgnoreCase(name)) {
			return cst_nm();
		}
		if ($cst_cntct_dpt.equalsIgnoreCase(name)) {
			return cst_cntct_dpt();
		}
		if ($cst_cntct_psn.equalsIgnoreCase(name)) {
			return cst_cntct_psn();
		}
		if ($cst_zip_cd.equalsIgnoreCase(name)) {
			return cst_zip_cd();
		}
		if ($cst_addr1.equalsIgnoreCase(name)) {
			return cst_addr1();
		}
		if ($cst_addr2.equalsIgnoreCase(name)) {
			return cst_addr2();
		}
		if ($cst_addr3.equalsIgnoreCase(name)) {
			return cst_addr3();
		}
		if ($cst_addr4.equalsIgnoreCase(name)) {
			return cst_addr4();
		}
		if ($cst_tel.equalsIgnoreCase(name)) {
			return cst_tel();
		}
		if ($cst_fax.equalsIgnoreCase(name)) {
			return cst_fax();
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
		if ($trnspt_cd.equalsIgnoreCase(name)) {
			return trnspt_cd();
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($sls_usr_cd.equalsIgnoreCase(name)) {
			return sls_usr_cd();
		}
		if ($sls_dpt_cd.equalsIgnoreCase(name)) {
			return sls_dpt_cd();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($qtn_rmrks.equalsIgnoreCase(name)) {
			return qtn_rmrks();
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			return intr_rmrks();
		}
		if ($qtn_term_cd.equalsIgnoreCase(name)) {
			return qtn_term_cd();
		}
		if ($qtn_rslt_rsn_cd.equalsIgnoreCase(name)) {
			return qtn_rslt_rsn_cd();
		}
		if ($qtn_rslt_rsn_rmrks.equalsIgnoreCase(name)) {
			return qtn_rslt_rsn_rmrks();
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			return wrk_no();
		}
		if ($cst_qtn_rqst_no.equalsIgnoreCase(name)) {
			return cst_qtn_rqst_no();
		}
		if ($rcpt_usr_cd.equalsIgnoreCase(name)) {
			return rcpt_usr_cd();
		}
		if ($aprv_no.equalsIgnoreCase(name)) {
			return aprv_no();
		}
		if ($aprv_sts_typ.equalsIgnoreCase(name)) {
			return aprv_sts_typ();
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
		if ($qtn_rev.equalsIgnoreCase(name)) {
			return qtn_rev();
		}
		if ($xrate.equalsIgnoreCase(name)) {
			return xrate();
		}
		if ($qtn_prnt_seq.equalsIgnoreCase(name)) {
			return qtn_prnt_seq();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumber(name);
	}

	public MCDate getDate(String name) {
		if ($qtn_dt.equalsIgnoreCase(name)) {
			return qtn_dt();
		}
		if ($valid_dt.equalsIgnoreCase(name)) {
			return valid_dt();
		}
		if ($rcpt_dt.equalsIgnoreCase(name)) {
			return rcpt_dt();
		}
		if ($qtn_prnt_dt.equalsIgnoreCase(name)) {
			return qtn_prnt_dt();
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
		if ($failure_flg.equalsIgnoreCase(name)) {
			return failure_flg();
		}
		if ($cst_sundry_flg.equalsIgnoreCase(name)) {
			return cst_sundry_flg();
		}
		if ($xrate_inpt_flg.equalsIgnoreCase(name)) {
			return xrate_inpt_flg();
		}
		if ($aprv_flg.equalsIgnoreCase(name)) {
			return aprv_flg();
		}
		if ($qtn_prnt_flg.equalsIgnoreCase(name)) {
			return qtn_prnt_flg();
		}
		if ($can_flg.equalsIgnoreCase(name)) {
			return can_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($qtn_no.equalsIgnoreCase(name)) {
			return qtn_no();
		}
		if ($qtn_typ.equalsIgnoreCase(name)) {
			return qtn_typ();
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			return trd_cd();
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			return trd_ptn_typ();
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			return cst_cd();
		}
		if ($cst_nm.equalsIgnoreCase(name)) {
			return cst_nm();
		}
		if ($cst_cntct_dpt.equalsIgnoreCase(name)) {
			return cst_cntct_dpt();
		}
		if ($cst_cntct_psn.equalsIgnoreCase(name)) {
			return cst_cntct_psn();
		}
		if ($cst_zip_cd.equalsIgnoreCase(name)) {
			return cst_zip_cd();
		}
		if ($cst_addr1.equalsIgnoreCase(name)) {
			return cst_addr1();
		}
		if ($cst_addr2.equalsIgnoreCase(name)) {
			return cst_addr2();
		}
		if ($cst_addr3.equalsIgnoreCase(name)) {
			return cst_addr3();
		}
		if ($cst_addr4.equalsIgnoreCase(name)) {
			return cst_addr4();
		}
		if ($cst_tel.equalsIgnoreCase(name)) {
			return cst_tel();
		}
		if ($cst_fax.equalsIgnoreCase(name)) {
			return cst_fax();
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
		if ($trnspt_cd.equalsIgnoreCase(name)) {
			return trnspt_cd();
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($sls_usr_cd.equalsIgnoreCase(name)) {
			return sls_usr_cd();
		}
		if ($sls_dpt_cd.equalsIgnoreCase(name)) {
			return sls_dpt_cd();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($qtn_rmrks.equalsIgnoreCase(name)) {
			return qtn_rmrks();
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			return intr_rmrks();
		}
		if ($qtn_term_cd.equalsIgnoreCase(name)) {
			return qtn_term_cd();
		}
		if ($qtn_rslt_rsn_cd.equalsIgnoreCase(name)) {
			return qtn_rslt_rsn_cd();
		}
		if ($qtn_rslt_rsn_rmrks.equalsIgnoreCase(name)) {
			return qtn_rslt_rsn_rmrks();
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			return wrk_no();
		}
		if ($cst_qtn_rqst_no.equalsIgnoreCase(name)) {
			return cst_qtn_rqst_no();
		}
		if ($rcpt_usr_cd.equalsIgnoreCase(name)) {
			return rcpt_usr_cd();
		}
		if ($aprv_no.equalsIgnoreCase(name)) {
			return aprv_no();
		}
		if ($aprv_sts_typ.equalsIgnoreCase(name)) {
			return aprv_sts_typ();
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
		if ($qtn_rev.equalsIgnoreCase(name)) {
			return qtn_rev();
		}
		if ($xrate.equalsIgnoreCase(name)) {
			return xrate();
		}
		if ($qtn_prnt_seq.equalsIgnoreCase(name)) {
			return qtn_prnt_seq();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumberNE(name);
	}

	public MCDate getDateNE(String name) {
		if ($qtn_dt.equalsIgnoreCase(name)) {
			return qtn_dt();
		}
		if ($valid_dt.equalsIgnoreCase(name)) {
			return valid_dt();
		}
		if ($rcpt_dt.equalsIgnoreCase(name)) {
			return rcpt_dt();
		}
		if ($qtn_prnt_dt.equalsIgnoreCase(name)) {
			return qtn_prnt_dt();
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
		if ($failure_flg.equalsIgnoreCase(name)) {
			return failure_flg();
		}
		if ($cst_sundry_flg.equalsIgnoreCase(name)) {
			return cst_sundry_flg();
		}
		if ($xrate_inpt_flg.equalsIgnoreCase(name)) {
			return xrate_inpt_flg();
		}
		if ($aprv_flg.equalsIgnoreCase(name)) {
			return aprv_flg();
		}
		if ($qtn_prnt_flg.equalsIgnoreCase(name)) {
			return qtn_prnt_flg();
		}
		if ($can_flg.equalsIgnoreCase(name)) {
			return can_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($qtn_no.equalsIgnoreCase(name)) {
			qtn_no(value);
			return;
		}
		if ($qtn_typ.equalsIgnoreCase(name)) {
			qtn_typ(value);
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
		if ($cst_cd.equalsIgnoreCase(name)) {
			cst_cd(value);
			return;
		}
		if ($cst_nm.equalsIgnoreCase(name)) {
			cst_nm(value);
			return;
		}
		if ($cst_cntct_dpt.equalsIgnoreCase(name)) {
			cst_cntct_dpt(value);
			return;
		}
		if ($cst_cntct_psn.equalsIgnoreCase(name)) {
			cst_cntct_psn(value);
			return;
		}
		if ($cst_zip_cd.equalsIgnoreCase(name)) {
			cst_zip_cd(value);
			return;
		}
		if ($cst_addr1.equalsIgnoreCase(name)) {
			cst_addr1(value);
			return;
		}
		if ($cst_addr2.equalsIgnoreCase(name)) {
			cst_addr2(value);
			return;
		}
		if ($cst_addr3.equalsIgnoreCase(name)) {
			cst_addr3(value);
			return;
		}
		if ($cst_addr4.equalsIgnoreCase(name)) {
			cst_addr4(value);
			return;
		}
		if ($cst_tel.equalsIgnoreCase(name)) {
			cst_tel(value);
			return;
		}
		if ($cst_fax.equalsIgnoreCase(name)) {
			cst_fax(value);
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
		if ($trnspt_cd.equalsIgnoreCase(name)) {
			trnspt_cd(value);
			return;
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			trd_cur_cd(value);
			return;
		}
		if ($sls_usr_cd.equalsIgnoreCase(name)) {
			sls_usr_cd(value);
			return;
		}
		if ($sls_dpt_cd.equalsIgnoreCase(name)) {
			sls_dpt_cd(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($qtn_rmrks.equalsIgnoreCase(name)) {
			qtn_rmrks(value);
			return;
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			intr_rmrks(value);
			return;
		}
		if ($qtn_term_cd.equalsIgnoreCase(name)) {
			qtn_term_cd(value);
			return;
		}
		if ($qtn_rslt_rsn_cd.equalsIgnoreCase(name)) {
			qtn_rslt_rsn_cd(value);
			return;
		}
		if ($qtn_rslt_rsn_rmrks.equalsIgnoreCase(name)) {
			qtn_rslt_rsn_rmrks(value);
			return;
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			wrk_no(value);
			return;
		}
		if ($cst_qtn_rqst_no.equalsIgnoreCase(name)) {
			cst_qtn_rqst_no(value);
			return;
		}
		if ($rcpt_usr_cd.equalsIgnoreCase(name)) {
			rcpt_usr_cd(value);
			return;
		}
		if ($aprv_no.equalsIgnoreCase(name)) {
			aprv_no(value);
			return;
		}
		if ($aprv_sts_typ.equalsIgnoreCase(name)) {
			aprv_sts_typ(value);
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
		if ($qtn_rev.equalsIgnoreCase(name)) {
			qtn_rev(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($qtn_prnt_seq.equalsIgnoreCase(name)) {
			qtn_prnt_seq(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, int value) {
		if ($qtn_rev.equalsIgnoreCase(name)) {
			qtn_rev(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($qtn_prnt_seq.equalsIgnoreCase(name)) {
			qtn_prnt_seq(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, long value) {
		if ($qtn_rev.equalsIgnoreCase(name)) {
			qtn_rev(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($qtn_prnt_seq.equalsIgnoreCase(name)) {
			qtn_prnt_seq(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, float value) {
		if ($qtn_rev.equalsIgnoreCase(name)) {
			qtn_rev(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($qtn_prnt_seq.equalsIgnoreCase(name)) {
			qtn_prnt_seq(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, double value) {
		if ($qtn_rev.equalsIgnoreCase(name)) {
			qtn_rev(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($qtn_prnt_seq.equalsIgnoreCase(name)) {
			qtn_prnt_seq(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setDate(String name, MCDate value) {
		if ($qtn_dt.equalsIgnoreCase(name)) {
			qtn_dt(value);
			return;
		}
		if ($valid_dt.equalsIgnoreCase(name)) {
			valid_dt(value);
			return;
		}
		if ($rcpt_dt.equalsIgnoreCase(name)) {
			rcpt_dt(value);
			return;
		}
		if ($qtn_prnt_dt.equalsIgnoreCase(name)) {
			qtn_prnt_dt(value);
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
		if ($failure_flg.equalsIgnoreCase(name)) {
			failure_flg(value);
			return;
		}
		if ($cst_sundry_flg.equalsIgnoreCase(name)) {
			cst_sundry_flg(value);
			return;
		}
		if ($xrate_inpt_flg.equalsIgnoreCase(name)) {
			xrate_inpt_flg(value);
			return;
		}
		if ($aprv_flg.equalsIgnoreCase(name)) {
			aprv_flg(value);
			return;
		}
		if ($qtn_prnt_flg.equalsIgnoreCase(name)) {
			qtn_prnt_flg(value);
			return;
		}
		if ($can_flg.equalsIgnoreCase(name)) {
			can_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($qtn_no.equalsIgnoreCase(name)) {
			qtn_no(value);
			return;
		}
		if ($qtn_typ.equalsIgnoreCase(name)) {
			qtn_typ(value);
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
		if ($cst_cd.equalsIgnoreCase(name)) {
			cst_cd(value);
			return;
		}
		if ($cst_nm.equalsIgnoreCase(name)) {
			cst_nm(value);
			return;
		}
		if ($cst_cntct_dpt.equalsIgnoreCase(name)) {
			cst_cntct_dpt(value);
			return;
		}
		if ($cst_cntct_psn.equalsIgnoreCase(name)) {
			cst_cntct_psn(value);
			return;
		}
		if ($cst_zip_cd.equalsIgnoreCase(name)) {
			cst_zip_cd(value);
			return;
		}
		if ($cst_addr1.equalsIgnoreCase(name)) {
			cst_addr1(value);
			return;
		}
		if ($cst_addr2.equalsIgnoreCase(name)) {
			cst_addr2(value);
			return;
		}
		if ($cst_addr3.equalsIgnoreCase(name)) {
			cst_addr3(value);
			return;
		}
		if ($cst_addr4.equalsIgnoreCase(name)) {
			cst_addr4(value);
			return;
		}
		if ($cst_tel.equalsIgnoreCase(name)) {
			cst_tel(value);
			return;
		}
		if ($cst_fax.equalsIgnoreCase(name)) {
			cst_fax(value);
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
		if ($trnspt_cd.equalsIgnoreCase(name)) {
			trnspt_cd(value);
			return;
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			trd_cur_cd(value);
			return;
		}
		if ($sls_usr_cd.equalsIgnoreCase(name)) {
			sls_usr_cd(value);
			return;
		}
		if ($sls_dpt_cd.equalsIgnoreCase(name)) {
			sls_dpt_cd(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($qtn_rmrks.equalsIgnoreCase(name)) {
			qtn_rmrks(value);
			return;
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			intr_rmrks(value);
			return;
		}
		if ($qtn_term_cd.equalsIgnoreCase(name)) {
			qtn_term_cd(value);
			return;
		}
		if ($qtn_rslt_rsn_cd.equalsIgnoreCase(name)) {
			qtn_rslt_rsn_cd(value);
			return;
		}
		if ($qtn_rslt_rsn_rmrks.equalsIgnoreCase(name)) {
			qtn_rslt_rsn_rmrks(value);
			return;
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			wrk_no(value);
			return;
		}
		if ($cst_qtn_rqst_no.equalsIgnoreCase(name)) {
			cst_qtn_rqst_no(value);
			return;
		}
		if ($rcpt_usr_cd.equalsIgnoreCase(name)) {
			rcpt_usr_cd(value);
			return;
		}
		if ($aprv_no.equalsIgnoreCase(name)) {
			aprv_no(value);
			return;
		}
		if ($aprv_sts_typ.equalsIgnoreCase(name)) {
			aprv_sts_typ(value);
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
		if ($qtn_rev.equalsIgnoreCase(name)) {
			qtn_rev(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($qtn_prnt_seq.equalsIgnoreCase(name)) {
			qtn_prnt_seq(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, int value) {
		if ($qtn_rev.equalsIgnoreCase(name)) {
			qtn_rev(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($qtn_prnt_seq.equalsIgnoreCase(name)) {
			qtn_prnt_seq(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, long value) {
		if ($qtn_rev.equalsIgnoreCase(name)) {
			qtn_rev(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($qtn_prnt_seq.equalsIgnoreCase(name)) {
			qtn_prnt_seq(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, float value) {
		if ($qtn_rev.equalsIgnoreCase(name)) {
			qtn_rev(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($qtn_prnt_seq.equalsIgnoreCase(name)) {
			qtn_prnt_seq(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, double value) {
		if ($qtn_rev.equalsIgnoreCase(name)) {
			qtn_rev(value);
			return;
		}
		if ($xrate.equalsIgnoreCase(name)) {
			xrate(value);
			return;
		}
		if ($qtn_prnt_seq.equalsIgnoreCase(name)) {
			qtn_prnt_seq(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setDateNE(String name, MCDate value) {
		if ($qtn_dt.equalsIgnoreCase(name)) {
			qtn_dt(value);
			return;
		}
		if ($valid_dt.equalsIgnoreCase(name)) {
			valid_dt(value);
			return;
		}
		if ($rcpt_dt.equalsIgnoreCase(name)) {
			rcpt_dt(value);
			return;
		}
		if ($qtn_prnt_dt.equalsIgnoreCase(name)) {
			qtn_prnt_dt(value);
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
		if ($failure_flg.equalsIgnoreCase(name)) {
			failure_flg(value);
			return;
		}
		if ($cst_sundry_flg.equalsIgnoreCase(name)) {
			cst_sundry_flg(value);
			return;
		}
		if ($xrate_inpt_flg.equalsIgnoreCase(name)) {
			xrate_inpt_flg(value);
			return;
		}
		if ($aprv_flg.equalsIgnoreCase(name)) {
			aprv_flg(value);
			return;
		}
		if ($qtn_prnt_flg.equalsIgnoreCase(name)) {
			qtn_prnt_flg(value);
			return;
		}
		if ($can_flg.equalsIgnoreCase(name)) {
			can_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

}
