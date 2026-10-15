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
 * "受注ヘッダ // Sales order header"DBコンテナRowクラスです。<p>
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
 *  	<td>slo_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>受注ＮＯ</td>
 *  	<td>Sales order No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>slo_rev</td>
 *  	<td>N</td>
 *  	<td>4,0</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>受注改訂番号</td>
 *  	<td>Sales order rev. number</td>
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
 *  	<td>slo_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>受注日</td>
 *  	<td>Sales order date</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>slo_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>受注区分</td>
 *  	<td>Sales order type</td>
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
 *  	<td>cst_po_no</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>得意先注文ＮＯ</td>
 *  	<td>Customer order No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>cst_po_rev</td>
 *  	<td>N</td>
 *  	<td>4,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>得意先注文改訂番号</td>
 *  	<td>Customer order rev. number</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>trd_cur_cd</td>
 *  	<td>C</td>
 *  	<td>3</td>
 *  	<td>Y</td>
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
 *  	<td>ptax_xrate_inpt_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>納税為替レート指定ＦＬＧ</td>
 *  	<td>Taxpaying exchange rate specification flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ptax_xrate</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>納税為替レート</td>
 *  	<td>Taxpaying exchange rate</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sls_usr_cd</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>売上担当者ＣＤ</td>
 *  	<td>Sales PIC cd.</td>
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
 *  	<td>iv_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>インボイスＮＯ</td>
 *  	<td>Invoice No.</td>
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
 *  	<td>vssl_flght</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>船名／便名</td>
 *  	<td>Ship/flight name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>load_port_cd</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>船積港ＣＤ</td>
 *  	<td>Loading port cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>etd_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>船積予定日</td>
 *  	<td>Estimated date of loading</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>dschrg_port_cd</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>船卸港ＣＤ</td>
 *  	<td>Unloading port cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>eta_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>船卸予定日</td>
 *  	<td>Estimated date of unloading</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>via_port_cd</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>経由地ＣＤ</td>
 *  	<td>Stopover point cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>via_schd_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>経由予定日</td>
 *  	<td>Estimated stopover date</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>assort_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>品揃区分</td>
 *  	<td>Assortment type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sls_basis_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>売上計上区分</td>
 *  	<td>Revenue recording type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ar_dpt_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>債権部門ＣＤ</td>
 *  	<td>AR dept. cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>wrk_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>案件ＮＯ</td>
 *  	<td>Sales project No.</td>
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
 *  	<td>trd_rmrks</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引備考</td>
 *  	<td>Transaction remarks</td>
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
 *  	<td>cst_po_rmrks</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>得意先注文備考</td>
 *  	<td>Customer order remarks</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>qtn_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>見積ＮＯ</td>
 *  	<td>Quotation No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>qtn_rev</td>
 *  	<td>N</td>
 *  	<td>4,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>見積改訂番号</td>
 *  	<td>Quotation rev. number</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>adv_ship_ctrl_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>前受金出荷制御区分</td>
 *  	<td>Advance received control shipping type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>adv_bill_amt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>前受金請求額</td>
 *  	<td>Advance received billing amount</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>adv_rcv_amt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>前受金入金額</td>
 *  	<td>Advance received payment amount</td>
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
 *  	<td>aprv_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>承認ＮＯ</td>
 *  	<td>Approval No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>aprv_sts_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>承認状況区分</td>
 *  	<td>Approval status type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>edi_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>ＥＤＩ ＦＬＧ</td>
 *  	<td>EDI flg.</td>
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
 *  	<td>can_rsn_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取消理由ＣＤ</td>
 *  	<td>Canceling reason cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>can_rmrks</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取消備考</td>
 *  	<td>Cancel remarks</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>cred_upd_amt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>与信更新金額</td>
 *  	<td>Credit update amount</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>edi_sub_char1</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＥＤＩ予備ＣＨＡＲ項目１</td>
 *  	<td>EDI spare CHAR column 1</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>edi_sub_char2</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＥＤＩ予備ＣＨＡＲ項目２</td>
 *  	<td>EDI spare CHAR column 2</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>edi_sub_char3</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＥＤＩ予備ＣＨＡＲ項目３</td>
 *  	<td>EDI spare CHAR column 3</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>edi_sub_char4</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＥＤＩ予備ＣＨＡＲ項目４</td>
 *  	<td>EDI spare CHAR column 4</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>edi_sub_char5</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＥＤＩ予備ＣＨＡＲ項目５</td>
 *  	<td>EDI spare CHAR column 5</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>edi_sub_num1</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＥＤＩ予備ＮＵＭ項目１</td>
 *  	<td>EDI spare NUM column 1</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>edi_sub_dt1</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＥＤＩ予備ＤＡＴＥ項目１</td>
 *  	<td>EDI spare DATE column 1</td>
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
 *  	<td>sls_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>売上日</td>
 *  	<td></td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>slo_aprv_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>受注日</td>
 *  	<td></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>aprv_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>更新日</td>
 *  	<td></td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ship_prnt_no_cst_nm_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>出荷帳票得意先名印字しないＦＬＧ</td>
 *  	<td></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>src_wrk_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>元案件ＮＯ</td>
 *  	<td></td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>zoho_sls_schd_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＺＯＨＯ販売予定ＮＯ</td>
 *  	<td></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>slo_last_sls_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>受注出荷最終売上</td>
 *  	<td></td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>prod_itm_cd</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>製品ＣＤ</td>
 *  	<td></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>prod_itm_sub1</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>製品枝番１</td>
 *  	<td></td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>prod_itm_sub2</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>製品枝番２</td>
 *  	<td></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>prod_itm_sub3</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>製品枝番３</td>
 *  	<td></td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>prod_itm_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>製品名</td>
 *  	<td></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>surv_line_qty</td>
 *  	<td>C</td>
 *  	<td>2</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>測線数</td>
 *  	<td></td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>diameter</td>
 *  	<td>C</td>
 *  	<td>4</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>口径</td>
 *  	<td></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>match_key</td>
 *  	<td>C</td>
 *  	<td>30</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>照合ＫＥＹ</td>
 *  	<td></td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>rcpt_no</td>
 *  	<td>C</td>
 *  	<td>16</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>受付番号</td>
 *  	<td></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>appl_doc_no</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>申請書番号</td>
 *  	<td></td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>dlv_draw_no</td>
 *  	<td>C</td>
 *  	<td>12</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>納入図番号</td>
 *  	<td></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>slo_num_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>注番区分</td>
 *  	<td></td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>slo_num</td>
 *  	<td>C</td>
 *  	<td>16</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>注文番号</td>
 *  	<td></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>hdr_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>数量（ヘッダ）</td>
 *  	<td></td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>hdr_amt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>金額（ヘッダ）</td>
 *  	<td></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>paint_clr</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>塗色</td>
 *  	<td></td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sales_cond</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>売上条件区分</td>
 *  	<td></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ship_sp_instr_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>出荷特別指示区分</td>
 *  	<td></td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>spec_dlv_note_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>指定納品書区分</td>
 *  	<td></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ord_dlv_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>注文書納期</td>
 *  	<td></td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>mrkt_cd</td>
 *  	<td>C</td>
 *  	<td>2</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>市場ＣＤ</td>
 *  	<td></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>cntry_sign</td>
 *  	<td>C</td>
 *  	<td>3</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>国別符号</td>
 *  	<td></td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ves_natl</td>
 *  	<td>C</td>
 *  	<td>3</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>船籍</td>
 *  	<td></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>shipyard_cd</td>
 *  	<td>C</td>
 *  	<td>4</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>造船所</td>
 *  	<td></td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ves_no</td>
 *  	<td>C</td>
 *  	<td>30</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>船番</td>
 *  	<td></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ves_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>船名</td>
 *  	<td></td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>tonnage</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>屯数</td>
 *  	<td></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ves_typ</td>
 *  	<td>C</td>
 *  	<td>30</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>船種</td>
 *  	<td></td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>insp_std</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>検査規格</td>
 *  	<td></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>royalty_trg_amt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ロイヤリティ対象金額</td>
 *  	<td></td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>royalty_psppl</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ロイヤリティ支払先</td>
 *  	<td></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ins_loc_1</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>設置場所1</td>
 *  	<td></td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ins_loc_2</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>設置場所2</td>
 *  	<td></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sfi_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>SFI番号</td>
 *  	<td></td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ps_sal_aft_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>装備後売上日</td>
 *  	<td></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>wit_insp_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>立会検査有無区分</td>
 *  	<td></td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>equip_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>装備要否区分</td>
 *  	<td></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>spec_doc_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>仕様書区分</td>
 *  	<td></td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>model_jp_en_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>型式和英区分</td>
 *  	<td></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>insp_rep_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>検査成績書（検査成績書区分）</td>
 *  	<td></td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>insp_rep_qty</td>
 *  	<td>N</td>
 *  	<td>3</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>検査成績書（検査成績書部数）</td>
 *  	<td></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>cons_draw_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>協議図（協議図区分）</td>
 *  	<td></td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>cons_draw_qty</td>
 *  	<td>N</td>
 *  	<td>3</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>協議図（協議図部数）</td>
 *  	<td></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>const_draw_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>工事図（工事図区分）</td>
 *  	<td></td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>const_draw_qty</td>
 *  	<td>N</td>
 *  	<td>3</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>工事図（工事図部数）</td>
 *  	<td></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>comp_draw_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>完成図（完成図区分）</td>
 *  	<td></td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>comp_draw_qty</td>
 *  	<td>N</td>
 *  	<td>3</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>完成図（完成図部数）</td>
 *  	<td></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>inst_manual_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取扱説明書（取扱説明書区分）</td>
 *  	<td></td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>inst_manual_qty</td>
 *  	<td>N</td>
 *  	<td>3</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取扱説明書（取扱説明書部数）</td>
 *  	<td></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>aprv_draw_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>承認図（承認図区分）</td>
 *  	<td></td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>aprv_draw_qty</td>
 *  	<td>N</td>
 *  	<td>3</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>承認図（承認図部数）</td>
 *  	<td></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>slo_cng_rsn</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>受注変更理由</td>
 *  	<td></td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>frc_rsn_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>無償理由ＣＤ</td>
 *  	<td></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>main_draw_no</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>代表図番</td>
 *  	<td></td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>slo_cmnt_1</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>コメント１</td>
 *  	<td></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>slo_cmnt_2</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>コメント２</td>
 *  	<td></td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>slo_cmnt_3</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>コメント３</td>
 *  	<td></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>slo_cmnt_4</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>コメント４</td>
 *  	<td></td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>slo_cmnt_5</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>コメント５</td>
 *  	<td></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>src_ship_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>元出荷基準ＦＬＧ</td>
 *  	<td></td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>jip_slo_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>受注種別</td>
 *  	<td></td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>jip_cst_cd</td>
 *  	<td>C</td>
 *  	<td>3</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>客先コード</td>
 *  	<td></td>
 *  </tr>
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
public class MST_SLO_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.CO_VIEW;

	public static final String TABLE_NAME = "MST_SLO";

	public static final boolean EX_CTRL = true;
	
	public static final boolean LCL_TABLE = false;
	
	/**
	 * 受注ＮＯ. Sales order No..<p>
	 *
	 */
	public static final String $slo_no = "slo_no";
	private static final MCPermColumnInfo _slo_no = createColumnInfo("slo_no");
	public final MCStringPermColumn slo_no = createStringColumn(_slo_no);
	
	/**
	 * 受注改訂番号. Sales order rev. number.<p>
	 *
	 */
	public static final String $slo_rev = "slo_rev";
	private static final MCPermColumnInfo _slo_rev = createColumnInfo("slo_rev");
	public final MCNumberPermColumn slo_rev = createNumberColumn(_slo_rev);
	
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
	 * 受注日. Sales order date.<p>
	 *
	 */
	public static final String $slo_dt = "slo_dt";
	private static final MCPermColumnInfo _slo_dt = createColumnInfo("slo_dt");
	public final MCDatePermColumn slo_dt = createDateColumn(_slo_dt);
	
	/**
	 * 受注区分. Sales order type.<p>
	 *
	 */
	public static final String $slo_typ = "slo_typ";
	private static final MCPermColumnInfo _slo_typ = createColumnInfo("slo_typ");
	public final MCStringPermColumn slo_typ = createStringColumn(_slo_typ);
	
	/**
	 * 得意先ＣＤ. Customer cd..<p>
	 *
	 */
	public static final String $cst_cd = "cst_cd";
	private static final MCPermColumnInfo _cst_cd = createColumnInfo("cst_cd");
	public final MCStringPermColumn cst_cd = createStringColumn(_cst_cd);
	
	/**
	 * 得意先注文ＮＯ. Customer order No..<p>
	 *
	 */
	public static final String $cst_po_no = "cst_po_no";
	private static final MCPermColumnInfo _cst_po_no = createColumnInfo("cst_po_no");
	public final MCStringPermColumn cst_po_no = createStringColumn(_cst_po_no);
	
	/**
	 * 得意先注文改訂番号. Customer order rev. number.<p>
	 *
	 */
	public static final String $cst_po_rev = "cst_po_rev";
	private static final MCPermColumnInfo _cst_po_rev = createColumnInfo("cst_po_rev");
	public final MCNumberPermColumn cst_po_rev = createNumberColumn(_cst_po_rev);
	
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
	 * 納税為替レート指定ＦＬＧ. Taxpaying exchange rate specification flg..<p>
	 *
	 */
	public static final String $ptax_xrate_inpt_flg = "ptax_xrate_inpt_flg";
	private static final MCPermColumnInfo _ptax_xrate_inpt_flg = createColumnInfo("ptax_xrate_inpt_flg");
	public final MCBooleanPermColumn ptax_xrate_inpt_flg = createBooleanColumn(_ptax_xrate_inpt_flg);
	
	/**
	 * 納税為替レート. Taxpaying exchange rate.<p>
	 *
	 */
	public static final String $ptax_xrate = "ptax_xrate";
	private static final MCPermColumnInfo _ptax_xrate = createColumnInfo("ptax_xrate");
	public final MCNumberPermColumn ptax_xrate = createNumberColumn(_ptax_xrate);
	
	/**
	 * 売上担当者ＣＤ. Sales PIC cd..<p>
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
	 * インボイスＮＯ. Invoice No..<p>
	 *
	 */
	public static final String $iv_no = "iv_no";
	private static final MCPermColumnInfo _iv_no = createColumnInfo("iv_no");
	public final MCStringPermColumn iv_no = createStringColumn(_iv_no);
	
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
	 * 船名／便名. Ship/flight name.<p>
	 *
	 */
	public static final String $vssl_flght = "vssl_flght";
	private static final MCPermColumnInfo _vssl_flght = createColumnInfo("vssl_flght");
	public final MCStringPermColumn vssl_flght = createStringColumn(_vssl_flght);
	
	/**
	 * 船積港ＣＤ. Loading port cd..<p>
	 *
	 */
	public static final String $load_port_cd = "load_port_cd";
	private static final MCPermColumnInfo _load_port_cd = createColumnInfo("load_port_cd");
	public final MCStringPermColumn load_port_cd = createStringColumn(_load_port_cd);
	
	/**
	 * 船積予定日. Estimated date of loading.<p>
	 *
	 */
	public static final String $etd_dt = "etd_dt";
	private static final MCPermColumnInfo _etd_dt = createColumnInfo("etd_dt");
	public final MCDatePermColumn etd_dt = createDateColumn(_etd_dt);
	
	/**
	 * 船卸港ＣＤ. Unloading port cd..<p>
	 *
	 */
	public static final String $dschrg_port_cd = "dschrg_port_cd";
	private static final MCPermColumnInfo _dschrg_port_cd = createColumnInfo("dschrg_port_cd");
	public final MCStringPermColumn dschrg_port_cd = createStringColumn(_dschrg_port_cd);
	
	/**
	 * 船卸予定日. Estimated date of unloading.<p>
	 *
	 */
	public static final String $eta_dt = "eta_dt";
	private static final MCPermColumnInfo _eta_dt = createColumnInfo("eta_dt");
	public final MCDatePermColumn eta_dt = createDateColumn(_eta_dt);
	
	/**
	 * 経由地ＣＤ. Stopover point cd..<p>
	 *
	 */
	public static final String $via_port_cd = "via_port_cd";
	private static final MCPermColumnInfo _via_port_cd = createColumnInfo("via_port_cd");
	public final MCStringPermColumn via_port_cd = createStringColumn(_via_port_cd);
	
	/**
	 * 経由予定日. Estimated stopover date.<p>
	 *
	 */
	public static final String $via_schd_dt = "via_schd_dt";
	private static final MCPermColumnInfo _via_schd_dt = createColumnInfo("via_schd_dt");
	public final MCDatePermColumn via_schd_dt = createDateColumn(_via_schd_dt);
	
	/**
	 * 品揃区分. Assortment type.<p>
	 *
	 */
	public static final String $assort_typ = "assort_typ";
	private static final MCPermColumnInfo _assort_typ = createColumnInfo("assort_typ");
	public final MCStringPermColumn assort_typ = createStringColumn(_assort_typ);
	
	/**
	 * 売上計上区分. Revenue recording type.<p>
	 *
	 */
	public static final String $sls_basis_typ = "sls_basis_typ";
	private static final MCPermColumnInfo _sls_basis_typ = createColumnInfo("sls_basis_typ");
	public final MCStringPermColumn sls_basis_typ = createStringColumn(_sls_basis_typ);
	
	/**
	 * 債権部門ＣＤ. AR dept. cd..<p>
	 *
	 */
	public static final String $ar_dpt_cd = "ar_dpt_cd";
	private static final MCPermColumnInfo _ar_dpt_cd = createColumnInfo("ar_dpt_cd");
	public final MCStringPermColumn ar_dpt_cd = createStringColumn(_ar_dpt_cd);
	
	/**
	 * 案件ＮＯ. Sales project No..<p>
	 *
	 */
	public static final String $wrk_no = "wrk_no";
	private static final MCPermColumnInfo _wrk_no = createColumnInfo("wrk_no");
	public final MCStringPermColumn wrk_no = createStringColumn(_wrk_no);
	
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
	 * 得意先注文備考. Customer order remarks.<p>
	 *
	 */
	public static final String $cst_po_rmrks = "cst_po_rmrks";
	private static final MCPermColumnInfo _cst_po_rmrks = createColumnInfo("cst_po_rmrks");
	public final MCStringPermColumn cst_po_rmrks = createStringColumn(_cst_po_rmrks);
	
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
	 * 前受金出荷制御区分. Advance received control shipping type.<p>
	 *
	 */
	public static final String $adv_ship_ctrl_typ = "adv_ship_ctrl_typ";
	private static final MCPermColumnInfo _adv_ship_ctrl_typ = createColumnInfo("adv_ship_ctrl_typ");
	public final MCStringPermColumn adv_ship_ctrl_typ = createStringColumn(_adv_ship_ctrl_typ);
	
	/**
	 * 前受金請求額. Advance received billing amount.<p>
	 *
	 */
	public static final String $adv_bill_amt = "adv_bill_amt";
	private static final MCPermColumnInfo _adv_bill_amt = createColumnInfo("adv_bill_amt");
	public final MCNumberPermColumn adv_bill_amt = createNumberColumn(_adv_bill_amt);
	
	/**
	 * 前受金入金額. Advance received payment amount.<p>
	 *
	 */
	public static final String $adv_rcv_amt = "adv_rcv_amt";
	private static final MCPermColumnInfo _adv_rcv_amt = createColumnInfo("adv_rcv_amt");
	public final MCNumberPermColumn adv_rcv_amt = createNumberColumn(_adv_rcv_amt);
	
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
	 * ＥＤＩ ＦＬＧ. EDI flg..<p>
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
	 * 取消理由ＣＤ. Canceling reason cd..<p>
	 *
	 */
	public static final String $can_rsn_cd = "can_rsn_cd";
	private static final MCPermColumnInfo _can_rsn_cd = createColumnInfo("can_rsn_cd");
	public final MCStringPermColumn can_rsn_cd = createStringColumn(_can_rsn_cd);
	
	/**
	 * 取消備考. Cancel remarks.<p>
	 *
	 */
	public static final String $can_rmrks = "can_rmrks";
	private static final MCPermColumnInfo _can_rmrks = createColumnInfo("can_rmrks");
	public final MCStringPermColumn can_rmrks = createStringColumn(_can_rmrks);
	
	/**
	 * 与信更新金額. Credit update amount.<p>
	 *
	 */
	public static final String $cred_upd_amt = "cred_upd_amt";
	private static final MCPermColumnInfo _cred_upd_amt = createColumnInfo("cred_upd_amt");
	public final MCNumberPermColumn cred_upd_amt = createNumberColumn(_cred_upd_amt);
	
	/**
	 * ＥＤＩ予備ＣＨＡＲ項目１. EDI spare CHAR column 1.<p>
	 *
	 */
	public static final String $edi_sub_char1 = "edi_sub_char1";
	private static final MCPermColumnInfo _edi_sub_char1 = createColumnInfo("edi_sub_char1");
	public final MCStringPermColumn edi_sub_char1 = createStringColumn(_edi_sub_char1);
	
	/**
	 * ＥＤＩ予備ＣＨＡＲ項目２. EDI spare CHAR column 2.<p>
	 *
	 */
	public static final String $edi_sub_char2 = "edi_sub_char2";
	private static final MCPermColumnInfo _edi_sub_char2 = createColumnInfo("edi_sub_char2");
	public final MCStringPermColumn edi_sub_char2 = createStringColumn(_edi_sub_char2);
	
	/**
	 * ＥＤＩ予備ＣＨＡＲ項目３. EDI spare CHAR column 3.<p>
	 *
	 */
	public static final String $edi_sub_char3 = "edi_sub_char3";
	private static final MCPermColumnInfo _edi_sub_char3 = createColumnInfo("edi_sub_char3");
	public final MCStringPermColumn edi_sub_char3 = createStringColumn(_edi_sub_char3);
	
	/**
	 * ＥＤＩ予備ＣＨＡＲ項目４. EDI spare CHAR column 4.<p>
	 *
	 */
	public static final String $edi_sub_char4 = "edi_sub_char4";
	private static final MCPermColumnInfo _edi_sub_char4 = createColumnInfo("edi_sub_char4");
	public final MCStringPermColumn edi_sub_char4 = createStringColumn(_edi_sub_char4);
	
	/**
	 * ＥＤＩ予備ＣＨＡＲ項目５. EDI spare CHAR column 5.<p>
	 *
	 */
	public static final String $edi_sub_char5 = "edi_sub_char5";
	private static final MCPermColumnInfo _edi_sub_char5 = createColumnInfo("edi_sub_char5");
	public final MCStringPermColumn edi_sub_char5 = createStringColumn(_edi_sub_char5);
	
	/**
	 * ＥＤＩ予備ＮＵＭ項目１. EDI spare NUM column 1.<p>
	 *
	 */
	public static final String $edi_sub_num1 = "edi_sub_num1";
	private static final MCPermColumnInfo _edi_sub_num1 = createColumnInfo("edi_sub_num1");
	public final MCNumberPermColumn edi_sub_num1 = createNumberColumn(_edi_sub_num1);
	
	/**
	 * ＥＤＩ予備ＤＡＴＥ項目１. EDI spare DATE column 1.<p>
	 *
	 */
	public static final String $edi_sub_dt1 = "edi_sub_dt1";
	private static final MCPermColumnInfo _edi_sub_dt1 = createColumnInfo("edi_sub_dt1");
	public final MCDatePermColumn edi_sub_dt1 = createDateColumn(_edi_sub_dt1);
	
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
	 * 売上日. .<p>
	 *
	 */
	public static final String $sls_dt = "sls_dt";
	private static final MCPermColumnInfo _sls_dt = createColumnInfo("sls_dt");
	public final MCDatePermColumn sls_dt = createDateColumn(_sls_dt);
	
	/**
	 * 受注日. .<p>
	 *
	 */
	public static final String $slo_aprv_dt = "slo_aprv_dt";
	private static final MCPermColumnInfo _slo_aprv_dt = createColumnInfo("slo_aprv_dt");
	public final MCDatePermColumn slo_aprv_dt = createDateColumn(_slo_aprv_dt);
	
	/**
	 * 更新日. .<p>
	 *
	 */
	public static final String $aprv_dt = "aprv_dt";
	private static final MCPermColumnInfo _aprv_dt = createColumnInfo("aprv_dt");
	public final MCDatePermColumn aprv_dt = createDateColumn(_aprv_dt);
	
	/**
	 * 出荷帳票得意先名印字しないＦＬＧ. .<p>
	 *
	 */
	public static final String $ship_prnt_no_cst_nm_flg = "ship_prnt_no_cst_nm_flg";
	private static final MCPermColumnInfo _ship_prnt_no_cst_nm_flg = createColumnInfo("ship_prnt_no_cst_nm_flg");
	public final MCBooleanPermColumn ship_prnt_no_cst_nm_flg = createBooleanColumn(_ship_prnt_no_cst_nm_flg);
	
	/**
	 * 元案件ＮＯ. .<p>
	 *
	 */
	public static final String $src_wrk_no = "src_wrk_no";
	private static final MCPermColumnInfo _src_wrk_no = createColumnInfo("src_wrk_no");
	public final MCStringPermColumn src_wrk_no = createStringColumn(_src_wrk_no);
	
	/**
	 * ＺＯＨＯ販売予定ＮＯ. .<p>
	 *
	 */
	public static final String $zoho_sls_schd_no = "zoho_sls_schd_no";
	private static final MCPermColumnInfo _zoho_sls_schd_no = createColumnInfo("zoho_sls_schd_no");
	public final MCStringPermColumn zoho_sls_schd_no = createStringColumn(_zoho_sls_schd_no);
	
	/**
	 * 受注出荷最終売上. .<p>
	 *
	 */
	public static final String $slo_last_sls_flg = "slo_last_sls_flg";
	private static final MCPermColumnInfo _slo_last_sls_flg = createColumnInfo("slo_last_sls_flg");
	public final MCBooleanPermColumn slo_last_sls_flg = createBooleanColumn(_slo_last_sls_flg);
	
	/**
	 * 製品ＣＤ. .<p>
	 *
	 */
	public static final String $prod_itm_cd = "prod_itm_cd";
	private static final MCPermColumnInfo _prod_itm_cd = createColumnInfo("prod_itm_cd");
	public final MCStringPermColumn prod_itm_cd = createStringColumn(_prod_itm_cd);
	
	/**
	 * 製品枝番１. .<p>
	 *
	 */
	public static final String $prod_itm_sub1 = "prod_itm_sub1";
	private static final MCPermColumnInfo _prod_itm_sub1 = createColumnInfo("prod_itm_sub1");
	public final MCStringPermColumn prod_itm_sub1 = createStringColumn(_prod_itm_sub1);
	
	/**
	 * 製品枝番２. .<p>
	 *
	 */
	public static final String $prod_itm_sub2 = "prod_itm_sub2";
	private static final MCPermColumnInfo _prod_itm_sub2 = createColumnInfo("prod_itm_sub2");
	public final MCStringPermColumn prod_itm_sub2 = createStringColumn(_prod_itm_sub2);
	
	/**
	 * 製品枝番３. .<p>
	 *
	 */
	public static final String $prod_itm_sub3 = "prod_itm_sub3";
	private static final MCPermColumnInfo _prod_itm_sub3 = createColumnInfo("prod_itm_sub3");
	public final MCStringPermColumn prod_itm_sub3 = createStringColumn(_prod_itm_sub3);
	
	/**
	 * 製品名. .<p>
	 *
	 */
	public static final String $prod_itm_nm = "prod_itm_nm";
	private static final MCPermColumnInfo _prod_itm_nm = createColumnInfo("prod_itm_nm");
	public final MCStringPermColumn prod_itm_nm = createStringColumn(_prod_itm_nm);
	
	/**
	 * 測線数. .<p>
	 *
	 */
	public static final String $surv_line_qty = "surv_line_qty";
	private static final MCPermColumnInfo _surv_line_qty = createColumnInfo("surv_line_qty");
	public final MCStringPermColumn surv_line_qty = createStringColumn(_surv_line_qty);
	
	/**
	 * 口径. .<p>
	 *
	 */
	public static final String $diameter = "diameter";
	private static final MCPermColumnInfo _diameter = createColumnInfo("diameter");
	public final MCStringPermColumn diameter = createStringColumn(_diameter);
	
	/**
	 * 照合ＫＥＹ. .<p>
	 *
	 */
	public static final String $match_key = "match_key";
	private static final MCPermColumnInfo _match_key = createColumnInfo("match_key");
	public final MCStringPermColumn match_key = createStringColumn(_match_key);
	
	/**
	 * 受付番号. .<p>
	 *
	 */
	public static final String $rcpt_no = "rcpt_no";
	private static final MCPermColumnInfo _rcpt_no = createColumnInfo("rcpt_no");
	public final MCStringPermColumn rcpt_no = createStringColumn(_rcpt_no);
	
	/**
	 * 申請書番号. .<p>
	 *
	 */
	public static final String $appl_doc_no = "appl_doc_no";
	private static final MCPermColumnInfo _appl_doc_no = createColumnInfo("appl_doc_no");
	public final MCStringPermColumn appl_doc_no = createStringColumn(_appl_doc_no);
	
	/**
	 * 納入図番号. .<p>
	 *
	 */
	public static final String $dlv_draw_no = "dlv_draw_no";
	private static final MCPermColumnInfo _dlv_draw_no = createColumnInfo("dlv_draw_no");
	public final MCStringPermColumn dlv_draw_no = createStringColumn(_dlv_draw_no);
	
	/**
	 * 注番区分. .<p>
	 *
	 */
	public static final String $slo_num_typ = "slo_num_typ";
	private static final MCPermColumnInfo _slo_num_typ = createColumnInfo("slo_num_typ");
	public final MCStringPermColumn slo_num_typ = createStringColumn(_slo_num_typ);
	
	/**
	 * 注文番号. .<p>
	 *
	 */
	public static final String $slo_num = "slo_num";
	private static final MCPermColumnInfo _slo_num = createColumnInfo("slo_num");
	public final MCStringPermColumn slo_num = createStringColumn(_slo_num);
	
	/**
	 * 数量（ヘッダ）. .<p>
	 *
	 */
	public static final String $hdr_qty = "hdr_qty";
	private static final MCPermColumnInfo _hdr_qty = createColumnInfo("hdr_qty");
	public final MCNumberPermColumn hdr_qty = createNumberColumn(_hdr_qty);
	
	/**
	 * 金額（ヘッダ）. .<p>
	 *
	 */
	public static final String $hdr_amt = "hdr_amt";
	private static final MCPermColumnInfo _hdr_amt = createColumnInfo("hdr_amt");
	public final MCNumberPermColumn hdr_amt = createNumberColumn(_hdr_amt);
	
	/**
	 * 塗色. .<p>
	 *
	 */
	public static final String $paint_clr = "paint_clr";
	private static final MCPermColumnInfo _paint_clr = createColumnInfo("paint_clr");
	public final MCStringPermColumn paint_clr = createStringColumn(_paint_clr);
	
	/**
	 * 売上条件区分. .<p>
	 *
	 */
	public static final String $sales_cond = "sales_cond";
	private static final MCPermColumnInfo _sales_cond = createColumnInfo("sales_cond");
	public final MCStringPermColumn sales_cond = createStringColumn(_sales_cond);
	
	/**
	 * 出荷特別指示区分. .<p>
	 *
	 */
	public static final String $ship_sp_instr_typ = "ship_sp_instr_typ";
	private static final MCPermColumnInfo _ship_sp_instr_typ = createColumnInfo("ship_sp_instr_typ");
	public final MCStringPermColumn ship_sp_instr_typ = createStringColumn(_ship_sp_instr_typ);
	
	/**
	 * 指定納品書区分. .<p>
	 *
	 */
	public static final String $spec_dlv_note_typ = "spec_dlv_note_typ";
	private static final MCPermColumnInfo _spec_dlv_note_typ = createColumnInfo("spec_dlv_note_typ");
	public final MCStringPermColumn spec_dlv_note_typ = createStringColumn(_spec_dlv_note_typ);
	
	/**
	 * 注文書納期. .<p>
	 *
	 */
	public static final String $ord_dlv_dt = "ord_dlv_dt";
	private static final MCPermColumnInfo _ord_dlv_dt = createColumnInfo("ord_dlv_dt");
	public final MCDatePermColumn ord_dlv_dt = createDateColumn(_ord_dlv_dt);
	
	/**
	 * 市場ＣＤ. .<p>
	 *
	 */
	public static final String $mrkt_cd = "mrkt_cd";
	private static final MCPermColumnInfo _mrkt_cd = createColumnInfo("mrkt_cd");
	public final MCStringPermColumn mrkt_cd = createStringColumn(_mrkt_cd);
	
	/**
	 * 国別符号. .<p>
	 *
	 */
	public static final String $cntry_sign = "cntry_sign";
	private static final MCPermColumnInfo _cntry_sign = createColumnInfo("cntry_sign");
	public final MCStringPermColumn cntry_sign = createStringColumn(_cntry_sign);
	
	/**
	 * 船籍. .<p>
	 *
	 */
	public static final String $ves_natl = "ves_natl";
	private static final MCPermColumnInfo _ves_natl = createColumnInfo("ves_natl");
	public final MCStringPermColumn ves_natl = createStringColumn(_ves_natl);
	
	/**
	 * 造船所. .<p>
	 *
	 */
	public static final String $shipyard_cd = "shipyard_cd";
	private static final MCPermColumnInfo _shipyard_cd = createColumnInfo("shipyard_cd");
	public final MCStringPermColumn shipyard_cd = createStringColumn(_shipyard_cd);
	
	/**
	 * 船番. .<p>
	 *
	 */
	public static final String $ves_no = "ves_no";
	private static final MCPermColumnInfo _ves_no = createColumnInfo("ves_no");
	public final MCStringPermColumn ves_no = createStringColumn(_ves_no);
	
	/**
	 * 船名. .<p>
	 *
	 */
	public static final String $ves_nm = "ves_nm";
	private static final MCPermColumnInfo _ves_nm = createColumnInfo("ves_nm");
	public final MCStringPermColumn ves_nm = createStringColumn(_ves_nm);
	
	/**
	 * 屯数. .<p>
	 *
	 */
	public static final String $tonnage = "tonnage";
	private static final MCPermColumnInfo _tonnage = createColumnInfo("tonnage");
	public final MCStringPermColumn tonnage = createStringColumn(_tonnage);
	
	/**
	 * 船種. .<p>
	 *
	 */
	public static final String $ves_typ = "ves_typ";
	private static final MCPermColumnInfo _ves_typ = createColumnInfo("ves_typ");
	public final MCStringPermColumn ves_typ = createStringColumn(_ves_typ);
	
	/**
	 * 検査規格. .<p>
	 *
	 */
	public static final String $insp_std = "insp_std";
	private static final MCPermColumnInfo _insp_std = createColumnInfo("insp_std");
	public final MCStringPermColumn insp_std = createStringColumn(_insp_std);
	
	/**
	 * ロイヤリティ対象金額. .<p>
	 *
	 */
	public static final String $royalty_trg_amt = "royalty_trg_amt";
	private static final MCPermColumnInfo _royalty_trg_amt = createColumnInfo("royalty_trg_amt");
	public final MCNumberPermColumn royalty_trg_amt = createNumberColumn(_royalty_trg_amt);
	
	/**
	 * ロイヤリティ支払先. .<p>
	 *
	 */
	public static final String $royalty_psppl = "royalty_psppl";
	private static final MCPermColumnInfo _royalty_psppl = createColumnInfo("royalty_psppl");
	public final MCStringPermColumn royalty_psppl = createStringColumn(_royalty_psppl);
	
	/**
	 * 設置場所1. .<p>
	 *
	 */
	public static final String $ins_loc_1 = "ins_loc_1";
	private static final MCPermColumnInfo _ins_loc_1 = createColumnInfo("ins_loc_1");
	public final MCStringPermColumn ins_loc_1 = createStringColumn(_ins_loc_1);
	
	/**
	 * 設置場所2. .<p>
	 *
	 */
	public static final String $ins_loc_2 = "ins_loc_2";
	private static final MCPermColumnInfo _ins_loc_2 = createColumnInfo("ins_loc_2");
	public final MCStringPermColumn ins_loc_2 = createStringColumn(_ins_loc_2);
	
	/**
	 * SFI番号. .<p>
	 *
	 */
	public static final String $sfi_no = "sfi_no";
	private static final MCPermColumnInfo _sfi_no = createColumnInfo("sfi_no");
	public final MCStringPermColumn sfi_no = createStringColumn(_sfi_no);
	
	/**
	 * 装備後売上日. .<p>
	 *
	 */
	public static final String $ps_sal_aft_dt = "ps_sal_aft_dt";
	private static final MCPermColumnInfo _ps_sal_aft_dt = createColumnInfo("ps_sal_aft_dt");
	public final MCDatePermColumn ps_sal_aft_dt = createDateColumn(_ps_sal_aft_dt);
	
	/**
	 * 立会検査有無区分. .<p>
	 *
	 */
	public static final String $wit_insp_typ = "wit_insp_typ";
	private static final MCPermColumnInfo _wit_insp_typ = createColumnInfo("wit_insp_typ");
	public final MCStringPermColumn wit_insp_typ = createStringColumn(_wit_insp_typ);
	
	/**
	 * 装備要否区分. .<p>
	 *
	 */
	public static final String $equip_typ = "equip_typ";
	private static final MCPermColumnInfo _equip_typ = createColumnInfo("equip_typ");
	public final MCStringPermColumn equip_typ = createStringColumn(_equip_typ);
	
	/**
	 * 仕様書区分. .<p>
	 *
	 */
	public static final String $spec_doc_typ = "spec_doc_typ";
	private static final MCPermColumnInfo _spec_doc_typ = createColumnInfo("spec_doc_typ");
	public final MCStringPermColumn spec_doc_typ = createStringColumn(_spec_doc_typ);
	
	/**
	 * 型式和英区分. .<p>
	 *
	 */
	public static final String $model_jp_en_typ = "model_jp_en_typ";
	private static final MCPermColumnInfo _model_jp_en_typ = createColumnInfo("model_jp_en_typ");
	public final MCStringPermColumn model_jp_en_typ = createStringColumn(_model_jp_en_typ);
	
	/**
	 * 検査成績書（検査成績書区分）. .<p>
	 *
	 */
	public static final String $insp_rep_typ = "insp_rep_typ";
	private static final MCPermColumnInfo _insp_rep_typ = createColumnInfo("insp_rep_typ");
	public final MCStringPermColumn insp_rep_typ = createStringColumn(_insp_rep_typ);
	
	/**
	 * 検査成績書（検査成績書部数）. .<p>
	 *
	 */
	public static final String $insp_rep_qty = "insp_rep_qty";
	private static final MCPermColumnInfo _insp_rep_qty = createColumnInfo("insp_rep_qty");
	public final MCNumberPermColumn insp_rep_qty = createNumberColumn(_insp_rep_qty);
	
	/**
	 * 協議図（協議図区分）. .<p>
	 *
	 */
	public static final String $cons_draw_typ = "cons_draw_typ";
	private static final MCPermColumnInfo _cons_draw_typ = createColumnInfo("cons_draw_typ");
	public final MCStringPermColumn cons_draw_typ = createStringColumn(_cons_draw_typ);
	
	/**
	 * 協議図（協議図部数）. .<p>
	 *
	 */
	public static final String $cons_draw_qty = "cons_draw_qty";
	private static final MCPermColumnInfo _cons_draw_qty = createColumnInfo("cons_draw_qty");
	public final MCNumberPermColumn cons_draw_qty = createNumberColumn(_cons_draw_qty);
	
	/**
	 * 工事図（工事図区分）. .<p>
	 *
	 */
	public static final String $const_draw_typ = "const_draw_typ";
	private static final MCPermColumnInfo _const_draw_typ = createColumnInfo("const_draw_typ");
	public final MCStringPermColumn const_draw_typ = createStringColumn(_const_draw_typ);
	
	/**
	 * 工事図（工事図部数）. .<p>
	 *
	 */
	public static final String $const_draw_qty = "const_draw_qty";
	private static final MCPermColumnInfo _const_draw_qty = createColumnInfo("const_draw_qty");
	public final MCNumberPermColumn const_draw_qty = createNumberColumn(_const_draw_qty);
	
	/**
	 * 完成図（完成図区分）. .<p>
	 *
	 */
	public static final String $comp_draw_typ = "comp_draw_typ";
	private static final MCPermColumnInfo _comp_draw_typ = createColumnInfo("comp_draw_typ");
	public final MCStringPermColumn comp_draw_typ = createStringColumn(_comp_draw_typ);
	
	/**
	 * 完成図（完成図部数）. .<p>
	 *
	 */
	public static final String $comp_draw_qty = "comp_draw_qty";
	private static final MCPermColumnInfo _comp_draw_qty = createColumnInfo("comp_draw_qty");
	public final MCNumberPermColumn comp_draw_qty = createNumberColumn(_comp_draw_qty);
	
	/**
	 * 取扱説明書（取扱説明書区分）. .<p>
	 *
	 */
	public static final String $inst_manual_typ = "inst_manual_typ";
	private static final MCPermColumnInfo _inst_manual_typ = createColumnInfo("inst_manual_typ");
	public final MCStringPermColumn inst_manual_typ = createStringColumn(_inst_manual_typ);
	
	/**
	 * 取扱説明書（取扱説明書部数）. .<p>
	 *
	 */
	public static final String $inst_manual_qty = "inst_manual_qty";
	private static final MCPermColumnInfo _inst_manual_qty = createColumnInfo("inst_manual_qty");
	public final MCNumberPermColumn inst_manual_qty = createNumberColumn(_inst_manual_qty);
	
	/**
	 * 承認図（承認図区分）. .<p>
	 *
	 */
	public static final String $aprv_draw_typ = "aprv_draw_typ";
	private static final MCPermColumnInfo _aprv_draw_typ = createColumnInfo("aprv_draw_typ");
	public final MCStringPermColumn aprv_draw_typ = createStringColumn(_aprv_draw_typ);
	
	/**
	 * 承認図（承認図部数）. .<p>
	 *
	 */
	public static final String $aprv_draw_qty = "aprv_draw_qty";
	private static final MCPermColumnInfo _aprv_draw_qty = createColumnInfo("aprv_draw_qty");
	public final MCNumberPermColumn aprv_draw_qty = createNumberColumn(_aprv_draw_qty);
	
	/**
	 * 受注変更理由. .<p>
	 *
	 */
	public static final String $slo_cng_rsn = "slo_cng_rsn";
	private static final MCPermColumnInfo _slo_cng_rsn = createColumnInfo("slo_cng_rsn");
	public final MCStringPermColumn slo_cng_rsn = createStringColumn(_slo_cng_rsn);
	
	/**
	 * 無償理由ＣＤ. .<p>
	 *
	 */
	public static final String $frc_rsn_cd = "frc_rsn_cd";
	private static final MCPermColumnInfo _frc_rsn_cd = createColumnInfo("frc_rsn_cd");
	public final MCStringPermColumn frc_rsn_cd = createStringColumn(_frc_rsn_cd);
	
	/**
	 * 代表図番. .<p>
	 *
	 */
	public static final String $main_draw_no = "main_draw_no";
	private static final MCPermColumnInfo _main_draw_no = createColumnInfo("main_draw_no");
	public final MCStringPermColumn main_draw_no = createStringColumn(_main_draw_no);
	
	/**
	 * コメント１. .<p>
	 *
	 */
	public static final String $slo_cmnt_1 = "slo_cmnt_1";
	private static final MCPermColumnInfo _slo_cmnt_1 = createColumnInfo("slo_cmnt_1");
	public final MCStringPermColumn slo_cmnt_1 = createStringColumn(_slo_cmnt_1);
	
	/**
	 * コメント２. .<p>
	 *
	 */
	public static final String $slo_cmnt_2 = "slo_cmnt_2";
	private static final MCPermColumnInfo _slo_cmnt_2 = createColumnInfo("slo_cmnt_2");
	public final MCStringPermColumn slo_cmnt_2 = createStringColumn(_slo_cmnt_2);
	
	/**
	 * コメント３. .<p>
	 *
	 */
	public static final String $slo_cmnt_3 = "slo_cmnt_3";
	private static final MCPermColumnInfo _slo_cmnt_3 = createColumnInfo("slo_cmnt_3");
	public final MCStringPermColumn slo_cmnt_3 = createStringColumn(_slo_cmnt_3);
	
	/**
	 * コメント４. .<p>
	 *
	 */
	public static final String $slo_cmnt_4 = "slo_cmnt_4";
	private static final MCPermColumnInfo _slo_cmnt_4 = createColumnInfo("slo_cmnt_4");
	public final MCStringPermColumn slo_cmnt_4 = createStringColumn(_slo_cmnt_4);
	
	/**
	 * コメント５. .<p>
	 *
	 */
	public static final String $slo_cmnt_5 = "slo_cmnt_5";
	private static final MCPermColumnInfo _slo_cmnt_5 = createColumnInfo("slo_cmnt_5");
	public final MCStringPermColumn slo_cmnt_5 = createStringColumn(_slo_cmnt_5);
	
	/**
	 * 元出荷基準ＦＬＧ. .<p>
	 *
	 */
	public static final String $src_ship_flg = "src_ship_flg";
	private static final MCPermColumnInfo _src_ship_flg = createColumnInfo("src_ship_flg");
	public final MCBooleanPermColumn src_ship_flg = createBooleanColumn(_src_ship_flg);
	
	/**
	 * 受注種別. .<p>
	 *
	 */
	public static final String $jip_slo_typ = "jip_slo_typ";
	private static final MCPermColumnInfo _jip_slo_typ = createColumnInfo("jip_slo_typ");
	public final MCStringPermColumn jip_slo_typ = createStringColumn(_jip_slo_typ);
	
	/**
	 * 客先コード. .<p>
	 *
	 */
	public static final String $jip_cst_cd = "jip_cst_cd";
	private static final MCPermColumnInfo _jip_cst_cd = createColumnInfo("jip_cst_cd");
	public final MCStringPermColumn jip_cst_cd = createStringColumn(_jip_cst_cd);
	
	public static final MCMeta slo_no_META = createCommonMeta($slo_no, mcframe.commonMA.meta.MA_META.SLO_NO);
	public static final MCMeta slo_rev_META = createCommonMeta($slo_rev, mcframe.commonMA.meta.MA_META.SLIP_REV);
	public static final MCMeta trd_cd_META = createCommonMeta($trd_cd, mcframe.commonMA.meta.MA_META.TRD_CD);
	public static final MCMeta trd_ptn_typ_META = createCommonMeta($trd_ptn_typ, mcframe.commonMA.meta.MA_META.TRD_PTN_TYP);
	public static final MCMeta slo_dt_META = createCommonMeta($slo_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta slo_typ_META = createCommonMeta($slo_typ, mcframe.commonMS.meta.MS_META.SLO_TYP);
	public static final MCMeta cst_cd_META = createCommonMeta($cst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta cst_po_no_META = createCommonMeta($cst_po_no, mcframe.commonMA.meta.MA_META.CST_PO_NO);
	public static final MCMeta cst_po_rev_META = createCommonMeta($cst_po_rev, mcframe.commonMA.meta.MA_META.SLIP_REV);
	public static final MCMeta trd_cur_cd_META = createCommonMeta($trd_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta xrate_inpt_flg_META = createCommonMeta($xrate_inpt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta xrate_META = createCommonMeta($xrate, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta ptax_xrate_inpt_flg_META = createCommonMeta($ptax_xrate_inpt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ptax_xrate_META = createCommonMeta($ptax_xrate, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta sls_usr_cd_META = createCommonMeta($sls_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta sls_dpt_cd_META = createCommonMeta($sls_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta iv_no_META = createCommonMeta($iv_no, mcframe.commonMA.meta.MA_META.IV_NO);
	public static final MCMeta tterm_cd1_META = createCommonMeta($tterm_cd1, mcframe.commonMA.meta.MA_META.TTERM_CD);
	public static final MCMeta tterm_rmrks1_META = createCommonMeta($tterm_rmrks1, mcframe.commonMS.meta.MS_META.TTERM_RMRKS1);
	public static final MCMeta tterm_cd2_META = createCommonMeta($tterm_cd2, mcframe.commonMA.meta.MA_META.TTERM_CD);
	public static final MCMeta tterm_rmrks2_META = createCommonMeta($tterm_rmrks2, mcframe.commonMS.meta.MS_META.TTERM_RMRKS2);
	public static final MCMeta tterm_cd3_META = createCommonMeta($tterm_cd3, mcframe.commonMA.meta.MA_META.TTERM_CD);
	public static final MCMeta tterm_rmrks3_META = createCommonMeta($tterm_rmrks3, mcframe.commonMS.meta.MS_META.TTERM_RMRKS3);
	public static final MCMeta trnspt_cd_META = createCommonMeta($trnspt_cd, mcframe.commonMA.meta.MA_META.TRNSPT_CD);
	public static final MCMeta vssl_flght_META = createCommonMeta($vssl_flght, mcframe.commonMA.meta.MA_META.VSSL_FLGHT);
	public static final MCMeta load_port_cd_META = createCommonMeta($load_port_cd, mcframe.commonMA.meta.MA_META.PORT_CD);
	public static final MCMeta etd_dt_META = createCommonMeta($etd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta dschrg_port_cd_META = createCommonMeta($dschrg_port_cd, mcframe.commonMA.meta.MA_META.PORT_CD);
	public static final MCMeta eta_dt_META = createCommonMeta($eta_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta via_port_cd_META = createCommonMeta($via_port_cd, mcframe.commonMA.meta.MA_META.PORT_CD);
	public static final MCMeta via_schd_dt_META = createCommonMeta($via_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta assort_typ_META = createCommonMeta($assort_typ, mcframe.commonMS.meta.MS_META.SHIP_ASSORT_TYP);
	public static final MCMeta sls_basis_typ_META = createCommonMeta($sls_basis_typ, mcframe.commonMA.meta.MA_META.SLS_BASIS_TYP);
	public static final MCMeta ar_dpt_cd_META = createCommonMeta($ar_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta wrk_no_META = createCommonMeta($wrk_no, mcframe.commonMA.meta.MA_META.WRK_NO);
	public static final MCMeta rcpt_dt_META = createCommonMeta($rcpt_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta rcpt_usr_cd_META = createCommonMeta($rcpt_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta trd_rmrks_META = createCommonMeta($trd_rmrks, mcframe.commonMA.meta.MA_META.TRD_RMRKS);
	public static final MCMeta intr_rmrks_META = createCommonMeta($intr_rmrks, mcframe.commonMS.meta.MS_META.SLO_INTR_RMRKS);
	public static final MCMeta cst_po_rmrks_META = createCommonMeta($cst_po_rmrks, mcframe.commonMS.meta.MS_META.CST_PO_RMRKS);
	public static final MCMeta qtn_no_META = createCommonMeta($qtn_no, mcframe.commonMA.meta.MA_META.QTN_NO);
	public static final MCMeta qtn_rev_META = createCommonMeta($qtn_rev, mcframe.commonMA.meta.MA_META.SLIP_REV);
	public static final MCMeta adv_ship_ctrl_typ_META = createCommonMeta($adv_ship_ctrl_typ, mcframe.commonMS.meta.MS_META.ADV_SHIP_CTRL_TYP);
	public static final MCMeta adv_bill_amt_META = createCommonMeta($adv_bill_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta adv_rcv_amt_META = createCommonMeta($adv_rcv_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.SLO_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.SLO_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.SLO_SUB_CHAR3);
	public static final MCMeta aprv_flg_META = createCommonMeta($aprv_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta aprv_no_META = createCommonMeta($aprv_no, mcframe.commonMA.meta.MA_META.APRV_NO);
	public static final MCMeta aprv_sts_typ_META = createCommonMeta($aprv_sts_typ, mcframe.commonMA.meta.MA_META.APRV_STS_TYP);
	public static final MCMeta edi_flg_META = createCommonMeta($edi_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta can_flg_META = createCommonMeta($can_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta can_rsn_cd_META = createCommonMeta($can_rsn_cd, mcframe.commonMS.meta.MS_META.SLO_RSN_CD);
	public static final MCMeta can_rmrks_META = createCommonMeta($can_rmrks, mcframe.commonMS.meta.MS_META.SLO_CAN_RMRKS);
	public static final MCMeta cred_upd_amt_META = createCommonMeta($cred_upd_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta edi_sub_char1_META = createCommonMeta($edi_sub_char1, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR1);
	public static final MCMeta edi_sub_char2_META = createCommonMeta($edi_sub_char2, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR2);
	public static final MCMeta edi_sub_char3_META = createCommonMeta($edi_sub_char3, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR3);
	public static final MCMeta edi_sub_char4_META = createCommonMeta($edi_sub_char4, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR4);
	public static final MCMeta edi_sub_char5_META = createCommonMeta($edi_sub_char5, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR5);
	public static final MCMeta edi_sub_num1_META = createCommonMeta($edi_sub_num1, mcframe.commonMA.meta.MA_META.IF_SUB_NUM1);
	public static final MCMeta edi_sub_dt1_META = createCommonMeta($edi_sub_dt1, mcframe.commonMA.meta.MA_META.DT);
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
	public static final MCMeta sls_dt_META = createCommonMeta($sls_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta slo_aprv_dt_META = createCommonMeta($slo_aprv_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta aprv_dt_META = createCommonMeta($aprv_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta ship_prnt_no_cst_nm_flg_META = createCommonMeta($ship_prnt_no_cst_nm_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta src_wrk_no_META = createCommonMeta($src_wrk_no, mcframe.commonMA.meta.MA_META.WRK_NO);
	public static final MCMeta zoho_sls_schd_no_META = createCommonMeta($zoho_sls_schd_no, mcframe.commonMA.meta.MA_META.ZOHO_SLS_SCHD_NO);
	public static final MCMeta slo_last_sls_flg_META = createCommonMeta($slo_last_sls_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta prod_itm_cd_META = createCommonMeta($prod_itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta prod_itm_sub1_META = createCommonMeta($prod_itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta prod_itm_sub2_META = createCommonMeta($prod_itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta prod_itm_sub3_META = createCommonMeta($prod_itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta prod_itm_nm_META = createCommonMeta($prod_itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta surv_line_qty_META = createCommonMeta($surv_line_qty, mcframe.commonMA.meta.MA_META.SURV_LINE_QTY);
	public static final MCMeta diameter_META = createCommonMeta($diameter, mcframe.commonMA.meta.MA_META.DIAMETER);
	public static final MCMeta match_key_META = createCommonMeta($match_key, mcframe.commonMA.meta.MA_META.MATCH_KEY);
	public static final MCMeta rcpt_no_META = createCommonMeta($rcpt_no, mcframe.commonMA.meta.MA_META.RCPT_NO);
	public static final MCMeta appl_doc_no_META = createCommonMeta($appl_doc_no, mcframe.commonMA.meta.MA_META.APPL_DOC_NO);
	public static final MCMeta dlv_draw_no_META = createCommonMeta($dlv_draw_no, mcframe.commonMA.meta.MA_META.DLV_DRAW_NO);
	public static final MCMeta slo_num_typ_META = createCommonMeta($slo_num_typ, mcframe.commonMA.meta.MA_META.SLO_NUM_TYP);
	public static final MCMeta slo_num_META = createCommonMeta($slo_num, mcframe.commonMA.meta.MA_META.SLO_NUM);
	public static final MCMeta hdr_qty_META = createCommonMeta($hdr_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta hdr_amt_META = createCommonMeta($hdr_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta paint_clr_META = createCommonMeta($paint_clr, mcframe.commonMA.meta.MA_META.PAINT_CLR);
	public static final MCMeta sales_cond_META = createCommonMeta($sales_cond, mcframe.commonMA.meta.MA_META.SALES_COND);
	public static final MCMeta ship_sp_instr_typ_META = createCommonMeta($ship_sp_instr_typ, mcframe.commonMA.meta.MA_META.SHIP_SP_INSTR_TYP);
	public static final MCMeta spec_dlv_note_typ_META = createCommonMeta($spec_dlv_note_typ, mcframe.commonMA.meta.MA_META.SPEC_DLV_NOTE_TYP);
	public static final MCMeta ord_dlv_dt_META = createCommonMeta($ord_dlv_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta mrkt_cd_META = createCommonMeta($mrkt_cd, mcframe.commonMA.meta.MA_META.MRKT_CD);
	public static final MCMeta cntry_sign_META = createCommonMeta($cntry_sign, mcframe.commonMA.meta.MA_META.CNTRY_SIGN);
	public static final MCMeta ves_natl_META = createCommonMeta($ves_natl, mcframe.commonMA.meta.MA_META.VES_NATL);
	public static final MCMeta shipyard_cd_META = createCommonMeta($shipyard_cd, mcframe.commonMA.meta.MA_META.SHIPYARD_CD);
	public static final MCMeta ves_no_META = createCommonMeta($ves_no, mcframe.commonMA.meta.MA_META.VES_NO);
	public static final MCMeta ves_nm_META = createCommonMeta($ves_nm, mcframe.commonMA.meta.MA_META.VES_NM);
	public static final MCMeta tonnage_META = createCommonMeta($tonnage, mcframe.commonMA.meta.MA_META.TONNAGE);
	public static final MCMeta ves_typ_META = createCommonMeta($ves_typ, mcframe.commonMA.meta.MA_META.VES_TYP);
	public static final MCMeta insp_std_META = createCommonMeta($insp_std, mcframe.commonMA.meta.MA_META.INSP_STD);
	public static final MCMeta royalty_trg_amt_META = createCommonMeta($royalty_trg_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta royalty_psppl_META = createCommonMeta($royalty_psppl, mcframe.commonMA.meta.MA_META.ROYALTY_PSPPL);
	public static final MCMeta ins_loc_1_META = createCommonMeta($ins_loc_1, mcframe.commonMA.meta.MA_META.INS_LOC_CD);
	public static final MCMeta ins_loc_2_META = createCommonMeta($ins_loc_2, mcframe.commonMA.meta.MA_META.INS_LOC_CD);
	public static final MCMeta sfi_no_META = createCommonMeta($sfi_no, mcframe.commonMA.meta.MA_META.SFI_NO);
	public static final MCMeta ps_sal_aft_dt_META = createCommonMeta($ps_sal_aft_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta wit_insp_typ_META = createCommonMeta($wit_insp_typ, mcframe.commonMA.meta.MA_META.WIT_INSP_TYP);
	public static final MCMeta equip_typ_META = createCommonMeta($equip_typ, mcframe.commonMA.meta.MA_META.EQUIP_TYP);
	public static final MCMeta spec_doc_typ_META = createCommonMeta($spec_doc_typ, mcframe.commonMA.meta.MA_META.SPEC_DOC_TYP);
	public static final MCMeta model_jp_en_typ_META = createCommonMeta($model_jp_en_typ, mcframe.commonMA.meta.MA_META.MODEL_JP_EN_TYP);
	public static final MCMeta insp_rep_typ_META = createCommonMeta($insp_rep_typ, mcframe.commonMA.meta.MA_META.INSP_REP_TYP);
	public static final MCMeta insp_rep_qty_META = createCommonMeta($insp_rep_qty, mcframe.commonMA.meta.MA_META.INSP_REP_QTY);
	public static final MCMeta cons_draw_typ_META = createCommonMeta($cons_draw_typ, mcframe.commonMA.meta.MA_META.CONS_DRAW_TYP);
	public static final MCMeta cons_draw_qty_META = createCommonMeta($cons_draw_qty, mcframe.commonMA.meta.MA_META.CONS_DRAW_QTY);
	public static final MCMeta const_draw_typ_META = createCommonMeta($const_draw_typ, mcframe.commonMA.meta.MA_META.CONST_DRAW_TYP);
	public static final MCMeta const_draw_qty_META = createCommonMeta($const_draw_qty, mcframe.commonMA.meta.MA_META.CONST_DRAW_QTY);
	public static final MCMeta comp_draw_typ_META = createCommonMeta($comp_draw_typ, mcframe.commonMA.meta.MA_META.COMP_DRAW_TYP);
	public static final MCMeta comp_draw_qty_META = createCommonMeta($comp_draw_qty, mcframe.commonMA.meta.MA_META.COMP_DRAW_QTY);
	public static final MCMeta inst_manual_typ_META = createCommonMeta($inst_manual_typ, mcframe.commonMA.meta.MA_META.INST_MANUAL_TYP);
	public static final MCMeta inst_manual_qty_META = createCommonMeta($inst_manual_qty, mcframe.commonMA.meta.MA_META.INST_MANUAL_QTY);
	public static final MCMeta aprv_draw_typ_META = createCommonMeta($aprv_draw_typ, mcframe.commonMA.meta.MA_META.APRV_DRAW_TYP);
	public static final MCMeta aprv_draw_qty_META = createCommonMeta($aprv_draw_qty, mcframe.commonMA.meta.MA_META.APRV_DRAW_QTY);
	public static final MCMeta slo_cng_rsn_META = createCommonMeta($slo_cng_rsn, mcframe.commonMA.meta.MA_META.SLO_CNG_RSN);
	public static final MCMeta frc_rsn_cd_META = createCommonMeta($frc_rsn_cd, mcframe.commonMA.meta.MA_META.FRC_RSN_CD);
	public static final MCMeta main_draw_no_META = createCommonMeta($main_draw_no, mcframe.commonMA.meta.MA_META.MAIN_DRAW_NO);
	public static final MCMeta slo_cmnt_1_META = createCommonMeta($slo_cmnt_1, mcframe.commonMA.meta.MA_META.MST_MEMO1);
	public static final MCMeta slo_cmnt_2_META = createCommonMeta($slo_cmnt_2, mcframe.commonMA.meta.MA_META.MST_MEMO2);
	public static final MCMeta slo_cmnt_3_META = createCommonMeta($slo_cmnt_3, mcframe.commonMA.meta.MA_META.MST_MEMO3);
	public static final MCMeta slo_cmnt_4_META = createCommonMeta($slo_cmnt_4, mcframe.commonMA.meta.MA_META.MST_MEMO4);
	public static final MCMeta slo_cmnt_5_META = createCommonMeta($slo_cmnt_5, mcframe.commonMA.meta.MA_META.MST_MEMO5);
	public static final MCMeta src_ship_flg_META = createCommonMeta($src_ship_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta jip_slo_typ_META = createCommonMeta($jip_slo_typ, mcframe.commonMA.meta.MA_META.JIP_SLO_TYP);
	public static final MCMeta jip_cst_cd_META = createCommonMeta($jip_cst_cd, mcframe.commonMA.meta.MA_META.CST_CD);

	protected static final List<MCForeignInfo> FOREIGN_INFO_LIST = new ArrayList<>();
	static {
	}
	
	protected static final ConstMetaList<MST_SLO_R> constMetas = new ConstMetaList<MST_SLO_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			slo_no_META,
			slo_rev_META,
			trd_cd_META,
			trd_ptn_typ_META,
			slo_dt_META,
			slo_typ_META,
			cst_cd_META,
			cst_po_no_META,
			cst_po_rev_META,
			trd_cur_cd_META,
			xrate_inpt_flg_META,
			xrate_META,
			ptax_xrate_inpt_flg_META,
			ptax_xrate_META,
			sls_usr_cd_META,
			sls_dpt_cd_META,
			wg_cd_META,
			iv_no_META,
			tterm_cd1_META,
			tterm_rmrks1_META,
			tterm_cd2_META,
			tterm_rmrks2_META,
			tterm_cd3_META,
			tterm_rmrks3_META,
			trnspt_cd_META,
			vssl_flght_META,
			load_port_cd_META,
			etd_dt_META,
			dschrg_port_cd_META,
			eta_dt_META,
			via_port_cd_META,
			via_schd_dt_META,
			assort_typ_META,
			sls_basis_typ_META,
			ar_dpt_cd_META,
			wrk_no_META,
			rcpt_dt_META,
			rcpt_usr_cd_META,
			trd_rmrks_META,
			intr_rmrks_META,
			cst_po_rmrks_META,
			qtn_no_META,
			qtn_rev_META,
			adv_ship_ctrl_typ_META,
			adv_bill_amt_META,
			adv_rcv_amt_META,
			sub_char1_META,
			sub_char2_META,
			sub_char3_META,
			aprv_flg_META,
			aprv_no_META,
			aprv_sts_typ_META,
			edi_flg_META,
			can_flg_META,
			can_rsn_cd_META,
			can_rmrks_META,
			cred_upd_amt_META,
			edi_sub_char1_META,
			edi_sub_char2_META,
			edi_sub_char3_META,
			edi_sub_char4_META,
			edi_sub_char5_META,
			edi_sub_num1_META,
			edi_sub_dt1_META,
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
			sls_dt_META,
			slo_aprv_dt_META,
			aprv_dt_META,
			ship_prnt_no_cst_nm_flg_META,
			src_wrk_no_META,
			zoho_sls_schd_no_META,
			slo_last_sls_flg_META,
			prod_itm_cd_META,
			prod_itm_sub1_META,
			prod_itm_sub2_META,
			prod_itm_sub3_META,
			prod_itm_nm_META,
			surv_line_qty_META,
			diameter_META,
			match_key_META,
			rcpt_no_META,
			appl_doc_no_META,
			dlv_draw_no_META,
			slo_num_typ_META,
			slo_num_META,
			hdr_qty_META,
			hdr_amt_META,
			paint_clr_META,
			sales_cond_META,
			ship_sp_instr_typ_META,
			spec_dlv_note_typ_META,
			ord_dlv_dt_META,
			mrkt_cd_META,
			cntry_sign_META,
			ves_natl_META,
			shipyard_cd_META,
			ves_no_META,
			ves_nm_META,
			tonnage_META,
			ves_typ_META,
			insp_std_META,
			royalty_trg_amt_META,
			royalty_psppl_META,
			ins_loc_1_META,
			ins_loc_2_META,
			sfi_no_META,
			ps_sal_aft_dt_META,
			wit_insp_typ_META,
			equip_typ_META,
			spec_doc_typ_META,
			model_jp_en_typ_META,
			insp_rep_typ_META,
			insp_rep_qty_META,
			cons_draw_typ_META,
			cons_draw_qty_META,
			const_draw_typ_META,
			const_draw_qty_META,
			comp_draw_typ_META,
			comp_draw_qty_META,
			inst_manual_typ_META,
			inst_manual_qty_META,
			aprv_draw_typ_META,
			aprv_draw_qty_META,
			slo_cng_rsn_META,
			frc_rsn_cd_META,
			main_draw_no_META,
			slo_cmnt_1_META,
			slo_cmnt_2_META,
			slo_cmnt_3_META,
			slo_cmnt_4_META,
			slo_cmnt_5_META,
			src_ship_flg_META,
			jip_slo_typ_META,
			jip_cst_cd_META
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
	protected MST_SLO_R(ConstMetaList<? extends MST_SLO_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MST_SLO_R(ConstMetaList<? extends MST_SLO_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MST_SLO_R.$slo_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_R.$slo_no,
				"slo_no",
				slo_no,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_R.$slo_rev,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_SLO_R.$slo_rev,
				"slo_rev",
				slo_rev,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_R.$trd_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_R.$trd_cd,
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
			MST_SLO_R.$trd_ptn_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_R.$trd_ptn_typ,
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
			MST_SLO_R.$slo_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_SLO_R.$slo_dt,
				"slo_dt",
				slo_dt,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_R.$slo_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_R.$slo_typ,
				"slo_typ",
				slo_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_R.$cst_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_R.$cst_cd,
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
			MST_SLO_R.$cst_po_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_R.$cst_po_no,
				"cst_po_no",
				cst_po_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_R.$cst_po_rev,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_SLO_R.$cst_po_rev,
				"cst_po_rev",
				cst_po_rev,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_R.$trd_cur_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_R.$trd_cur_cd,
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
			MST_SLO_R.$xrate_inpt_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_SLO_R.$xrate_inpt_flg,
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
			MST_SLO_R.$xrate,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_SLO_R.$xrate,
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
			MST_SLO_R.$ptax_xrate_inpt_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_SLO_R.$ptax_xrate_inpt_flg,
				"ptax_xrate_inpt_flg",
				ptax_xrate_inpt_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_R.$ptax_xrate,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_SLO_R.$ptax_xrate,
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
			MST_SLO_R.$sls_usr_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_R.$sls_usr_cd,
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
			MST_SLO_R.$sls_dpt_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_R.$sls_dpt_cd,
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
			MST_SLO_R.$wg_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_R.$wg_cd,
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
			MST_SLO_R.$iv_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_R.$iv_no,
				"iv_no",
				iv_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_R.$tterm_cd1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_R.$tterm_cd1,
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
			MST_SLO_R.$tterm_rmrks1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_R.$tterm_rmrks1,
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
			MST_SLO_R.$tterm_cd2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_R.$tterm_cd2,
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
			MST_SLO_R.$tterm_rmrks2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_R.$tterm_rmrks2,
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
			MST_SLO_R.$tterm_cd3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_R.$tterm_cd3,
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
			MST_SLO_R.$tterm_rmrks3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_R.$tterm_rmrks3,
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
			MST_SLO_R.$trnspt_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_R.$trnspt_cd,
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
			MST_SLO_R.$vssl_flght,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_R.$vssl_flght,
				"vssl_flght",
				vssl_flght,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_R.$load_port_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_R.$load_port_cd,
				"load_port_cd",
				load_port_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_R.$etd_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_SLO_R.$etd_dt,
				"etd_dt",
				etd_dt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_R.$dschrg_port_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_R.$dschrg_port_cd,
				"dschrg_port_cd",
				dschrg_port_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_R.$eta_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_SLO_R.$eta_dt,
				"eta_dt",
				eta_dt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_R.$via_port_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_R.$via_port_cd,
				"via_port_cd",
				via_port_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_R.$via_schd_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_SLO_R.$via_schd_dt,
				"via_schd_dt",
				via_schd_dt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_R.$assort_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_R.$assort_typ,
				"assort_typ",
				assort_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_R.$sls_basis_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_R.$sls_basis_typ,
				"sls_basis_typ",
				sls_basis_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_R.$ar_dpt_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_R.$ar_dpt_cd,
				"ar_dpt_cd",
				ar_dpt_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_R.$wrk_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_R.$wrk_no,
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
			MST_SLO_R.$rcpt_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_SLO_R.$rcpt_dt,
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
			MST_SLO_R.$rcpt_usr_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_R.$rcpt_usr_cd,
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
			MST_SLO_R.$trd_rmrks,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_R.$trd_rmrks,
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
			MST_SLO_R.$intr_rmrks,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_R.$intr_rmrks,
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
			MST_SLO_R.$cst_po_rmrks,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_R.$cst_po_rmrks,
				"cst_po_rmrks",
				cst_po_rmrks,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_R.$qtn_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_R.$qtn_no,
				"qtn_no",
				qtn_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_R.$qtn_rev,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_SLO_R.$qtn_rev,
				"qtn_rev",
				qtn_rev,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_R.$adv_ship_ctrl_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_R.$adv_ship_ctrl_typ,
				"adv_ship_ctrl_typ",
				adv_ship_ctrl_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_R.$adv_bill_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_SLO_R.$adv_bill_amt,
				"adv_bill_amt",
				adv_bill_amt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_R.$adv_rcv_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_SLO_R.$adv_rcv_amt,
				"adv_rcv_amt",
				adv_rcv_amt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_R.$sub_char1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_R.$sub_char1,
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
			MST_SLO_R.$sub_char2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_R.$sub_char2,
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
			MST_SLO_R.$sub_char3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_R.$sub_char3,
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
			MST_SLO_R.$aprv_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_SLO_R.$aprv_flg,
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
			MST_SLO_R.$aprv_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_R.$aprv_no,
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
			MST_SLO_R.$aprv_sts_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_R.$aprv_sts_typ,
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
			MST_SLO_R.$edi_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_SLO_R.$edi_flg,
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
			MST_SLO_R.$can_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_SLO_R.$can_flg,
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
			MST_SLO_R.$can_rsn_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_R.$can_rsn_cd,
				"can_rsn_cd",
				can_rsn_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_R.$can_rmrks,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_R.$can_rmrks,
				"can_rmrks",
				can_rmrks,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_R.$cred_upd_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_SLO_R.$cred_upd_amt,
				"cred_upd_amt",
				cred_upd_amt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_R.$edi_sub_char1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_R.$edi_sub_char1,
				"edi_sub_char1",
				edi_sub_char1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_R.$edi_sub_char2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_R.$edi_sub_char2,
				"edi_sub_char2",
				edi_sub_char2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_R.$edi_sub_char3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_R.$edi_sub_char3,
				"edi_sub_char3",
				edi_sub_char3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_R.$edi_sub_char4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_R.$edi_sub_char4,
				"edi_sub_char4",
				edi_sub_char4,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_R.$edi_sub_char5,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_R.$edi_sub_char5,
				"edi_sub_char5",
				edi_sub_char5,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_R.$edi_sub_num1,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_SLO_R.$edi_sub_num1,
				"edi_sub_num1",
				edi_sub_num1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_R.$edi_sub_dt1,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_SLO_R.$edi_sub_dt1,
				"edi_sub_dt1",
				edi_sub_dt1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_R.$ins_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_R.$ins_usr_id,
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
			MST_SLO_R.$ins_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_R.$ins_usr_nm,
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
			MST_SLO_R.$ins_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MST_SLO_R.$ins_ts,
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
			MST_SLO_R.$ins_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_R.$ins_func_id,
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
			MST_SLO_R.$upd_cntr,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_SLO_R.$upd_cntr,
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
			MST_SLO_R.$upd_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_R.$upd_usr_id,
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
			MST_SLO_R.$upd_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_R.$upd_usr_nm,
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
			MST_SLO_R.$upd_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MST_SLO_R.$upd_ts,
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
			MST_SLO_R.$upd_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_R.$upd_func_id,
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
			MST_SLO_R.$upd_srv_req_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_R.$upd_srv_req_no,
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
			MST_SLO_R.$sls_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_SLO_R.$sls_dt,
				"sls_dt",
				sls_dt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_R.$slo_aprv_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_SLO_R.$slo_aprv_dt,
				"slo_aprv_dt",
				slo_aprv_dt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_R.$aprv_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_SLO_R.$aprv_dt,
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
			MST_SLO_R.$ship_prnt_no_cst_nm_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_SLO_R.$ship_prnt_no_cst_nm_flg,
				"ship_prnt_no_cst_nm_flg",
				ship_prnt_no_cst_nm_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_R.$src_wrk_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_R.$src_wrk_no,
				"src_wrk_no",
				src_wrk_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_R.$zoho_sls_schd_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_R.$zoho_sls_schd_no,
				"zoho_sls_schd_no",
				zoho_sls_schd_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_R.$slo_last_sls_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_SLO_R.$slo_last_sls_flg,
				"slo_last_sls_flg",
				slo_last_sls_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_R.$prod_itm_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_R.$prod_itm_cd,
				"prod_itm_cd",
				prod_itm_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_R.$prod_itm_sub1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_R.$prod_itm_sub1,
				"prod_itm_sub1",
				prod_itm_sub1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_R.$prod_itm_sub2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_R.$prod_itm_sub2,
				"prod_itm_sub2",
				prod_itm_sub2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_R.$prod_itm_sub3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_R.$prod_itm_sub3,
				"prod_itm_sub3",
				prod_itm_sub3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_R.$prod_itm_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_R.$prod_itm_nm,
				"prod_itm_nm",
				prod_itm_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_R.$surv_line_qty,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_R.$surv_line_qty,
				"surv_line_qty",
				surv_line_qty,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_R.$diameter,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_R.$diameter,
				"diameter",
				diameter,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_R.$match_key,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_R.$match_key,
				"match_key",
				match_key,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_R.$rcpt_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_R.$rcpt_no,
				"rcpt_no",
				rcpt_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_R.$appl_doc_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_R.$appl_doc_no,
				"appl_doc_no",
				appl_doc_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_R.$dlv_draw_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_R.$dlv_draw_no,
				"dlv_draw_no",
				dlv_draw_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_R.$slo_num_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_R.$slo_num_typ,
				"slo_num_typ",
				slo_num_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_R.$slo_num,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_R.$slo_num,
				"slo_num",
				slo_num,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_R.$hdr_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_SLO_R.$hdr_qty,
				"hdr_qty",
				hdr_qty,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_R.$hdr_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_SLO_R.$hdr_amt,
				"hdr_amt",
				hdr_amt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_R.$paint_clr,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_R.$paint_clr,
				"paint_clr",
				paint_clr,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_R.$sales_cond,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_R.$sales_cond,
				"sales_cond",
				sales_cond,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_R.$ship_sp_instr_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_R.$ship_sp_instr_typ,
				"ship_sp_instr_typ",
				ship_sp_instr_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_R.$spec_dlv_note_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_R.$spec_dlv_note_typ,
				"spec_dlv_note_typ",
				spec_dlv_note_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_R.$ord_dlv_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_SLO_R.$ord_dlv_dt,
				"ord_dlv_dt",
				ord_dlv_dt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_R.$mrkt_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_R.$mrkt_cd,
				"mrkt_cd",
				mrkt_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_R.$cntry_sign,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_R.$cntry_sign,
				"cntry_sign",
				cntry_sign,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_R.$ves_natl,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_R.$ves_natl,
				"ves_natl",
				ves_natl,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_R.$shipyard_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_R.$shipyard_cd,
				"shipyard_cd",
				shipyard_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_R.$ves_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_R.$ves_no,
				"ves_no",
				ves_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_R.$ves_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_R.$ves_nm,
				"ves_nm",
				ves_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_R.$tonnage,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_R.$tonnage,
				"tonnage",
				tonnage,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_R.$ves_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_R.$ves_typ,
				"ves_typ",
				ves_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_R.$insp_std,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_R.$insp_std,
				"insp_std",
				insp_std,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_R.$royalty_trg_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_SLO_R.$royalty_trg_amt,
				"royalty_trg_amt",
				royalty_trg_amt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_R.$royalty_psppl,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_R.$royalty_psppl,
				"royalty_psppl",
				royalty_psppl,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_R.$ins_loc_1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_R.$ins_loc_1,
				"ins_loc_1",
				ins_loc_1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_R.$ins_loc_2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_R.$ins_loc_2,
				"ins_loc_2",
				ins_loc_2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_R.$sfi_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_R.$sfi_no,
				"sfi_no",
				sfi_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_R.$ps_sal_aft_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_SLO_R.$ps_sal_aft_dt,
				"ps_sal_aft_dt",
				ps_sal_aft_dt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_R.$wit_insp_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_R.$wit_insp_typ,
				"wit_insp_typ",
				wit_insp_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_R.$equip_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_R.$equip_typ,
				"equip_typ",
				equip_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_R.$spec_doc_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_R.$spec_doc_typ,
				"spec_doc_typ",
				spec_doc_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_R.$model_jp_en_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_R.$model_jp_en_typ,
				"model_jp_en_typ",
				model_jp_en_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_R.$insp_rep_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_R.$insp_rep_typ,
				"insp_rep_typ",
				insp_rep_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_R.$insp_rep_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_SLO_R.$insp_rep_qty,
				"insp_rep_qty",
				insp_rep_qty,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_R.$cons_draw_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_R.$cons_draw_typ,
				"cons_draw_typ",
				cons_draw_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_R.$cons_draw_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_SLO_R.$cons_draw_qty,
				"cons_draw_qty",
				cons_draw_qty,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_R.$const_draw_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_R.$const_draw_typ,
				"const_draw_typ",
				const_draw_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_R.$const_draw_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_SLO_R.$const_draw_qty,
				"const_draw_qty",
				const_draw_qty,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_R.$comp_draw_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_R.$comp_draw_typ,
				"comp_draw_typ",
				comp_draw_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_R.$comp_draw_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_SLO_R.$comp_draw_qty,
				"comp_draw_qty",
				comp_draw_qty,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_R.$inst_manual_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_R.$inst_manual_typ,
				"inst_manual_typ",
				inst_manual_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_R.$inst_manual_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_SLO_R.$inst_manual_qty,
				"inst_manual_qty",
				inst_manual_qty,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_R.$aprv_draw_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_R.$aprv_draw_typ,
				"aprv_draw_typ",
				aprv_draw_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_R.$aprv_draw_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_SLO_R.$aprv_draw_qty,
				"aprv_draw_qty",
				aprv_draw_qty,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_R.$slo_cng_rsn,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_R.$slo_cng_rsn,
				"slo_cng_rsn",
				slo_cng_rsn,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_R.$frc_rsn_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_R.$frc_rsn_cd,
				"frc_rsn_cd",
				frc_rsn_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_R.$main_draw_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_R.$main_draw_no,
				"main_draw_no",
				main_draw_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_R.$slo_cmnt_1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_R.$slo_cmnt_1,
				"slo_cmnt_1",
				slo_cmnt_1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_R.$slo_cmnt_2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_R.$slo_cmnt_2,
				"slo_cmnt_2",
				slo_cmnt_2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_R.$slo_cmnt_3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_R.$slo_cmnt_3,
				"slo_cmnt_3",
				slo_cmnt_3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_R.$slo_cmnt_4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_R.$slo_cmnt_4,
				"slo_cmnt_4",
				slo_cmnt_4,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_R.$slo_cmnt_5,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_R.$slo_cmnt_5,
				"slo_cmnt_5",
				slo_cmnt_5,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_R.$src_ship_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_SLO_R.$src_ship_flg,
				"src_ship_flg",
				src_ship_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_R.$jip_slo_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_R.$jip_slo_typ,
				"jip_slo_typ",
				jip_slo_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_R.$jip_cst_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_R.$jip_cst_cd,
				"jip_cst_cd",
				jip_cst_cd,
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
	public static MST_SLO_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MST_SLO_R create(String alias) {
		MST_SLO_R row = new MST_SLO_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MST_SLO_R createByName(T proto) {
		MST_SLO_R row = MST_SLO_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MST_SLO_R clone() {
		return (MST_SLO_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MST_SLO_R createInstance() {
		return (MST_SLO_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MST_SLO_R getValues(String... names) {
		return (MST_SLO_R) super.getValues(names);
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
	 public MSW_SLO_KEY_R getPkWorkDbc(String alias) {
	 	return MSW_SLO_KEY_R.create(alias);
	 }

	/*
	 * MCDBContainerのオーバーライドメソッドです。
	 */
	 public MSW_SLO_KEY_R getPkWorkDbc() {
	 	return getPkWorkDbc(MSW_SLO_KEY_R.TABLE_NAME);
	 }

	/**
	 * 受注ＮＯ. Sales order No..<p>
	 *
	 */
	public String slo_no() {
		return getConstString(offset + 0, $slo_no);
	}

	/**
	 * 受注ＮＯ. Sales order No..<p>
	 *
	 */
	public void slo_no(String value) {
		setConstString(offset + 0, $slo_no, value);
	}

	/**
	 * 受注改訂番号. Sales order rev. number.<p>
	 *
	 */
	public MCNumber slo_rev() {
		return getConstNumber(offset + 1, $slo_rev);
	}

	/**
	 * 受注改訂番号. Sales order rev. number.<p>
	 *
	 */
	public void slo_rev(MCNumber value) {
		setConstNumber(offset + 1, $slo_rev, value);
	}
	
	/**
	 * 受注改訂番号. Sales order rev. number.<p>
	 *
	 */
	public void slo_rev(int value) {
		setConstNumber(offset + 1, $slo_rev, value);
	}
	
	/**
	 * 受注改訂番号. Sales order rev. number.<p>
	 *
	 */
	public void slo_rev(long value) {
		setConstNumber(offset + 1, $slo_rev, value);
	}
	
	/**
	 * 受注改訂番号. Sales order rev. number.<p>
	 *
	 */
	public void slo_rev(float value) {
		setConstNumber(offset + 1, $slo_rev, value);
	}
	
	/**
	 * 受注改訂番号. Sales order rev. number.<p>
	 *
	 */
	public void slo_rev(double value) {
		setConstNumber(offset + 1, $slo_rev, value);
	}
	
	/**
	 * 取引ＣＤ. Transaction cd..<p>
	 *
	 */
	public String trd_cd() {
		return getConstString(offset + 2, $trd_cd);
	}

	/**
	 * 取引ＣＤ. Transaction cd..<p>
	 *
	 */
	public void trd_cd(String value) {
		setConstString(offset + 2, $trd_cd, value);
	}

	/**
	 * 取引パタン区分. Transaction pattern type.<p>
	 *
	 */
	public String trd_ptn_typ() {
		return getConstString(offset + 3, $trd_ptn_typ);
	}

	/**
	 * 取引パタン区分. Transaction pattern type.<p>
	 *
	 */
	public void trd_ptn_typ(String value) {
		setConstString(offset + 3, $trd_ptn_typ, value);
	}

	/**
	 * 受注日. Sales order date.<p>
	 *
	 */
	public MCDate slo_dt() {
		return getConstDate(offset + 4, $slo_dt);
	}

	/**
	 * 受注日. Sales order date.<p>
	 *
	 */
	public void slo_dt(MCDate value) {
		setConstDate(offset + 4, $slo_dt, value);
	}

	/**
	 * 受注区分. Sales order type.<p>
	 *
	 */
	public String slo_typ() {
		return getConstString(offset + 5, $slo_typ);
	}

	/**
	 * 受注区分. Sales order type.<p>
	 *
	 */
	public void slo_typ(String value) {
		setConstString(offset + 5, $slo_typ, value);
	}

	/**
	 * 得意先ＣＤ. Customer cd..<p>
	 *
	 */
	public String cst_cd() {
		return getConstString(offset + 6, $cst_cd);
	}

	/**
	 * 得意先ＣＤ. Customer cd..<p>
	 *
	 */
	public void cst_cd(String value) {
		setConstString(offset + 6, $cst_cd, value);
	}

	/**
	 * 得意先注文ＮＯ. Customer order No..<p>
	 *
	 */
	public String cst_po_no() {
		return getConstString(offset + 7, $cst_po_no);
	}

	/**
	 * 得意先注文ＮＯ. Customer order No..<p>
	 *
	 */
	public void cst_po_no(String value) {
		setConstString(offset + 7, $cst_po_no, value);
	}

	/**
	 * 得意先注文改訂番号. Customer order rev. number.<p>
	 *
	 */
	public MCNumber cst_po_rev() {
		return getConstNumber(offset + 8, $cst_po_rev);
	}

	/**
	 * 得意先注文改訂番号. Customer order rev. number.<p>
	 *
	 */
	public void cst_po_rev(MCNumber value) {
		setConstNumber(offset + 8, $cst_po_rev, value);
	}
	
	/**
	 * 得意先注文改訂番号. Customer order rev. number.<p>
	 *
	 */
	public void cst_po_rev(int value) {
		setConstNumber(offset + 8, $cst_po_rev, value);
	}
	
	/**
	 * 得意先注文改訂番号. Customer order rev. number.<p>
	 *
	 */
	public void cst_po_rev(long value) {
		setConstNumber(offset + 8, $cst_po_rev, value);
	}
	
	/**
	 * 得意先注文改訂番号. Customer order rev. number.<p>
	 *
	 */
	public void cst_po_rev(float value) {
		setConstNumber(offset + 8, $cst_po_rev, value);
	}
	
	/**
	 * 得意先注文改訂番号. Customer order rev. number.<p>
	 *
	 */
	public void cst_po_rev(double value) {
		setConstNumber(offset + 8, $cst_po_rev, value);
	}
	
	/**
	 * 取引通貨ＣＤ. Transaction currency cd..<p>
	 *
	 */
	public String trd_cur_cd() {
		return getConstString(offset + 9, $trd_cur_cd);
	}

	/**
	 * 取引通貨ＣＤ. Transaction currency cd..<p>
	 *
	 */
	public void trd_cur_cd(String value) {
		setConstString(offset + 9, $trd_cur_cd, value);
	}

	/**
	 * 為替レート指定ＦＬＧ. Set exchange rate flg..<p>
	 *
	 */
	public boolean xrate_inpt_flg() {
		return getConstBoolean(offset + 10, $xrate_inpt_flg);
	}

	/**
	 * 為替レート指定ＦＬＧ. Set exchange rate flg..<p>
	 *
	 */
	public void xrate_inpt_flg(boolean value) {
		setConstBoolean(offset + 10, $xrate_inpt_flg, value);
	}

	/**
	 * 為替レート. Exchange rate.<p>
	 *
	 */
	public MCNumber xrate() {
		return getConstNumber(offset + 11, $xrate);
	}

	/**
	 * 為替レート. Exchange rate.<p>
	 *
	 */
	public void xrate(MCNumber value) {
		setConstNumber(offset + 11, $xrate, value);
	}
	
	/**
	 * 為替レート. Exchange rate.<p>
	 *
	 */
	public void xrate(int value) {
		setConstNumber(offset + 11, $xrate, value);
	}
	
	/**
	 * 為替レート. Exchange rate.<p>
	 *
	 */
	public void xrate(long value) {
		setConstNumber(offset + 11, $xrate, value);
	}
	
	/**
	 * 為替レート. Exchange rate.<p>
	 *
	 */
	public void xrate(float value) {
		setConstNumber(offset + 11, $xrate, value);
	}
	
	/**
	 * 為替レート. Exchange rate.<p>
	 *
	 */
	public void xrate(double value) {
		setConstNumber(offset + 11, $xrate, value);
	}
	
	/**
	 * 納税為替レート指定ＦＬＧ. Taxpaying exchange rate specification flg..<p>
	 *
	 */
	public boolean ptax_xrate_inpt_flg() {
		return getConstBoolean(offset + 12, $ptax_xrate_inpt_flg);
	}

	/**
	 * 納税為替レート指定ＦＬＧ. Taxpaying exchange rate specification flg..<p>
	 *
	 */
	public void ptax_xrate_inpt_flg(boolean value) {
		setConstBoolean(offset + 12, $ptax_xrate_inpt_flg, value);
	}

	/**
	 * 納税為替レート. Taxpaying exchange rate.<p>
	 *
	 */
	public MCNumber ptax_xrate() {
		return getConstNumber(offset + 13, $ptax_xrate);
	}

	/**
	 * 納税為替レート. Taxpaying exchange rate.<p>
	 *
	 */
	public void ptax_xrate(MCNumber value) {
		setConstNumber(offset + 13, $ptax_xrate, value);
	}
	
	/**
	 * 納税為替レート. Taxpaying exchange rate.<p>
	 *
	 */
	public void ptax_xrate(int value) {
		setConstNumber(offset + 13, $ptax_xrate, value);
	}
	
	/**
	 * 納税為替レート. Taxpaying exchange rate.<p>
	 *
	 */
	public void ptax_xrate(long value) {
		setConstNumber(offset + 13, $ptax_xrate, value);
	}
	
	/**
	 * 納税為替レート. Taxpaying exchange rate.<p>
	 *
	 */
	public void ptax_xrate(float value) {
		setConstNumber(offset + 13, $ptax_xrate, value);
	}
	
	/**
	 * 納税為替レート. Taxpaying exchange rate.<p>
	 *
	 */
	public void ptax_xrate(double value) {
		setConstNumber(offset + 13, $ptax_xrate, value);
	}
	
	/**
	 * 売上担当者ＣＤ. Sales PIC cd..<p>
	 *
	 */
	public String sls_usr_cd() {
		return getConstString(offset + 14, $sls_usr_cd);
	}

	/**
	 * 売上担当者ＣＤ. Sales PIC cd..<p>
	 *
	 */
	public void sls_usr_cd(String value) {
		setConstString(offset + 14, $sls_usr_cd, value);
	}

	/**
	 * 売上部門ＣＤ. Sales dept. cd..<p>
	 *
	 */
	public String sls_dpt_cd() {
		return getConstString(offset + 15, $sls_dpt_cd);
	}

	/**
	 * 売上部門ＣＤ. Sales dept. cd..<p>
	 *
	 */
	public void sls_dpt_cd(String value) {
		setConstString(offset + 15, $sls_dpt_cd, value);
	}

	/**
	 * ワーキンググループＣＤ. WG cd..<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 16, $wg_cd);
	}

	/**
	 * ワーキンググループＣＤ. WG cd..<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 16, $wg_cd, value);
	}

	/**
	 * インボイスＮＯ. Invoice No..<p>
	 *
	 */
	public String iv_no() {
		return getConstString(offset + 17, $iv_no);
	}

	/**
	 * インボイスＮＯ. Invoice No..<p>
	 *
	 */
	public void iv_no(String value) {
		setConstString(offset + 17, $iv_no, value);
	}

	/**
	 * 取引条件ＣＤ１. Transaction terms cd. 1.<p>
	 *
	 */
	public String tterm_cd1() {
		return getConstString(offset + 18, $tterm_cd1);
	}

	/**
	 * 取引条件ＣＤ１. Transaction terms cd. 1.<p>
	 *
	 */
	public void tterm_cd1(String value) {
		setConstString(offset + 18, $tterm_cd1, value);
	}

	/**
	 * 取引条件備考１. Transaction terms remarks 1.<p>
	 *
	 */
	public String tterm_rmrks1() {
		return getConstString(offset + 19, $tterm_rmrks1);
	}

	/**
	 * 取引条件備考１. Transaction terms remarks 1.<p>
	 *
	 */
	public void tterm_rmrks1(String value) {
		setConstString(offset + 19, $tterm_rmrks1, value);
	}

	/**
	 * 取引条件ＣＤ２. Transaction terms cd. 2.<p>
	 *
	 */
	public String tterm_cd2() {
		return getConstString(offset + 20, $tterm_cd2);
	}

	/**
	 * 取引条件ＣＤ２. Transaction terms cd. 2.<p>
	 *
	 */
	public void tterm_cd2(String value) {
		setConstString(offset + 20, $tterm_cd2, value);
	}

	/**
	 * 取引条件備考２. Transaction terms remarks 2.<p>
	 *
	 */
	public String tterm_rmrks2() {
		return getConstString(offset + 21, $tterm_rmrks2);
	}

	/**
	 * 取引条件備考２. Transaction terms remarks 2.<p>
	 *
	 */
	public void tterm_rmrks2(String value) {
		setConstString(offset + 21, $tterm_rmrks2, value);
	}

	/**
	 * 取引条件ＣＤ３. Transaction terms cd. 3.<p>
	 *
	 */
	public String tterm_cd3() {
		return getConstString(offset + 22, $tterm_cd3);
	}

	/**
	 * 取引条件ＣＤ３. Transaction terms cd. 3.<p>
	 *
	 */
	public void tterm_cd3(String value) {
		setConstString(offset + 22, $tterm_cd3, value);
	}

	/**
	 * 取引条件備考３. Transaction terms remarks 3.<p>
	 *
	 */
	public String tterm_rmrks3() {
		return getConstString(offset + 23, $tterm_rmrks3);
	}

	/**
	 * 取引条件備考３. Transaction terms remarks 3.<p>
	 *
	 */
	public void tterm_rmrks3(String value) {
		setConstString(offset + 23, $tterm_rmrks3, value);
	}

	/**
	 * 輸送方法ＣＤ. Transportation method cd..<p>
	 *
	 */
	public String trnspt_cd() {
		return getConstString(offset + 24, $trnspt_cd);
	}

	/**
	 * 輸送方法ＣＤ. Transportation method cd..<p>
	 *
	 */
	public void trnspt_cd(String value) {
		setConstString(offset + 24, $trnspt_cd, value);
	}

	/**
	 * 船名／便名. Ship/flight name.<p>
	 *
	 */
	public String vssl_flght() {
		return getConstString(offset + 25, $vssl_flght);
	}

	/**
	 * 船名／便名. Ship/flight name.<p>
	 *
	 */
	public void vssl_flght(String value) {
		setConstString(offset + 25, $vssl_flght, value);
	}

	/**
	 * 船積港ＣＤ. Loading port cd..<p>
	 *
	 */
	public String load_port_cd() {
		return getConstString(offset + 26, $load_port_cd);
	}

	/**
	 * 船積港ＣＤ. Loading port cd..<p>
	 *
	 */
	public void load_port_cd(String value) {
		setConstString(offset + 26, $load_port_cd, value);
	}

	/**
	 * 船積予定日. Estimated date of loading.<p>
	 *
	 */
	public MCDate etd_dt() {
		return getConstDate(offset + 27, $etd_dt);
	}

	/**
	 * 船積予定日. Estimated date of loading.<p>
	 *
	 */
	public void etd_dt(MCDate value) {
		setConstDate(offset + 27, $etd_dt, value);
	}

	/**
	 * 船卸港ＣＤ. Unloading port cd..<p>
	 *
	 */
	public String dschrg_port_cd() {
		return getConstString(offset + 28, $dschrg_port_cd);
	}

	/**
	 * 船卸港ＣＤ. Unloading port cd..<p>
	 *
	 */
	public void dschrg_port_cd(String value) {
		setConstString(offset + 28, $dschrg_port_cd, value);
	}

	/**
	 * 船卸予定日. Estimated date of unloading.<p>
	 *
	 */
	public MCDate eta_dt() {
		return getConstDate(offset + 29, $eta_dt);
	}

	/**
	 * 船卸予定日. Estimated date of unloading.<p>
	 *
	 */
	public void eta_dt(MCDate value) {
		setConstDate(offset + 29, $eta_dt, value);
	}

	/**
	 * 経由地ＣＤ. Stopover point cd..<p>
	 *
	 */
	public String via_port_cd() {
		return getConstString(offset + 30, $via_port_cd);
	}

	/**
	 * 経由地ＣＤ. Stopover point cd..<p>
	 *
	 */
	public void via_port_cd(String value) {
		setConstString(offset + 30, $via_port_cd, value);
	}

	/**
	 * 経由予定日. Estimated stopover date.<p>
	 *
	 */
	public MCDate via_schd_dt() {
		return getConstDate(offset + 31, $via_schd_dt);
	}

	/**
	 * 経由予定日. Estimated stopover date.<p>
	 *
	 */
	public void via_schd_dt(MCDate value) {
		setConstDate(offset + 31, $via_schd_dt, value);
	}

	/**
	 * 品揃区分. Assortment type.<p>
	 *
	 */
	public String assort_typ() {
		return getConstString(offset + 32, $assort_typ);
	}

	/**
	 * 品揃区分. Assortment type.<p>
	 *
	 */
	public void assort_typ(String value) {
		setConstString(offset + 32, $assort_typ, value);
	}

	/**
	 * 売上計上区分. Revenue recording type.<p>
	 *
	 */
	public String sls_basis_typ() {
		return getConstString(offset + 33, $sls_basis_typ);
	}

	/**
	 * 売上計上区分. Revenue recording type.<p>
	 *
	 */
	public void sls_basis_typ(String value) {
		setConstString(offset + 33, $sls_basis_typ, value);
	}

	/**
	 * 債権部門ＣＤ. AR dept. cd..<p>
	 *
	 */
	public String ar_dpt_cd() {
		return getConstString(offset + 34, $ar_dpt_cd);
	}

	/**
	 * 債権部門ＣＤ. AR dept. cd..<p>
	 *
	 */
	public void ar_dpt_cd(String value) {
		setConstString(offset + 34, $ar_dpt_cd, value);
	}

	/**
	 * 案件ＮＯ. Sales project No..<p>
	 *
	 */
	public String wrk_no() {
		return getConstString(offset + 35, $wrk_no);
	}

	/**
	 * 案件ＮＯ. Sales project No..<p>
	 *
	 */
	public void wrk_no(String value) {
		setConstString(offset + 35, $wrk_no, value);
	}

	/**
	 * 受付日. Receiving date.<p>
	 *
	 */
	public MCDate rcpt_dt() {
		return getConstDate(offset + 36, $rcpt_dt);
	}

	/**
	 * 受付日. Receiving date.<p>
	 *
	 */
	public void rcpt_dt(MCDate value) {
		setConstDate(offset + 36, $rcpt_dt, value);
	}

	/**
	 * 受付担当者ＣＤ. Receiving PIC cd..<p>
	 *
	 */
	public String rcpt_usr_cd() {
		return getConstString(offset + 37, $rcpt_usr_cd);
	}

	/**
	 * 受付担当者ＣＤ. Receiving PIC cd..<p>
	 *
	 */
	public void rcpt_usr_cd(String value) {
		setConstString(offset + 37, $rcpt_usr_cd, value);
	}

	/**
	 * 取引備考. Transaction remarks.<p>
	 *
	 */
	public String trd_rmrks() {
		return getConstString(offset + 38, $trd_rmrks);
	}

	/**
	 * 取引備考. Transaction remarks.<p>
	 *
	 */
	public void trd_rmrks(String value) {
		setConstString(offset + 38, $trd_rmrks, value);
	}

	/**
	 * 内部備考. Internal remarks.<p>
	 *
	 */
	public String intr_rmrks() {
		return getConstString(offset + 39, $intr_rmrks);
	}

	/**
	 * 内部備考. Internal remarks.<p>
	 *
	 */
	public void intr_rmrks(String value) {
		setConstString(offset + 39, $intr_rmrks, value);
	}

	/**
	 * 得意先注文備考. Customer order remarks.<p>
	 *
	 */
	public String cst_po_rmrks() {
		return getConstString(offset + 40, $cst_po_rmrks);
	}

	/**
	 * 得意先注文備考. Customer order remarks.<p>
	 *
	 */
	public void cst_po_rmrks(String value) {
		setConstString(offset + 40, $cst_po_rmrks, value);
	}

	/**
	 * 見積ＮＯ. Quotation No..<p>
	 *
	 */
	public String qtn_no() {
		return getConstString(offset + 41, $qtn_no);
	}

	/**
	 * 見積ＮＯ. Quotation No..<p>
	 *
	 */
	public void qtn_no(String value) {
		setConstString(offset + 41, $qtn_no, value);
	}

	/**
	 * 見積改訂番号. Quotation rev. number.<p>
	 *
	 */
	public MCNumber qtn_rev() {
		return getConstNumber(offset + 42, $qtn_rev);
	}

	/**
	 * 見積改訂番号. Quotation rev. number.<p>
	 *
	 */
	public void qtn_rev(MCNumber value) {
		setConstNumber(offset + 42, $qtn_rev, value);
	}
	
	/**
	 * 見積改訂番号. Quotation rev. number.<p>
	 *
	 */
	public void qtn_rev(int value) {
		setConstNumber(offset + 42, $qtn_rev, value);
	}
	
	/**
	 * 見積改訂番号. Quotation rev. number.<p>
	 *
	 */
	public void qtn_rev(long value) {
		setConstNumber(offset + 42, $qtn_rev, value);
	}
	
	/**
	 * 見積改訂番号. Quotation rev. number.<p>
	 *
	 */
	public void qtn_rev(float value) {
		setConstNumber(offset + 42, $qtn_rev, value);
	}
	
	/**
	 * 見積改訂番号. Quotation rev. number.<p>
	 *
	 */
	public void qtn_rev(double value) {
		setConstNumber(offset + 42, $qtn_rev, value);
	}
	
	/**
	 * 前受金出荷制御区分. Advance received control shipping type.<p>
	 *
	 */
	public String adv_ship_ctrl_typ() {
		return getConstString(offset + 43, $adv_ship_ctrl_typ);
	}

	/**
	 * 前受金出荷制御区分. Advance received control shipping type.<p>
	 *
	 */
	public void adv_ship_ctrl_typ(String value) {
		setConstString(offset + 43, $adv_ship_ctrl_typ, value);
	}

	/**
	 * 前受金請求額. Advance received billing amount.<p>
	 *
	 */
	public MCNumber adv_bill_amt() {
		return getConstNumber(offset + 44, $adv_bill_amt);
	}

	/**
	 * 前受金請求額. Advance received billing amount.<p>
	 *
	 */
	public void adv_bill_amt(MCNumber value) {
		setConstNumber(offset + 44, $adv_bill_amt, value);
	}
	
	/**
	 * 前受金請求額. Advance received billing amount.<p>
	 *
	 */
	public void adv_bill_amt(int value) {
		setConstNumber(offset + 44, $adv_bill_amt, value);
	}
	
	/**
	 * 前受金請求額. Advance received billing amount.<p>
	 *
	 */
	public void adv_bill_amt(long value) {
		setConstNumber(offset + 44, $adv_bill_amt, value);
	}
	
	/**
	 * 前受金請求額. Advance received billing amount.<p>
	 *
	 */
	public void adv_bill_amt(float value) {
		setConstNumber(offset + 44, $adv_bill_amt, value);
	}
	
	/**
	 * 前受金請求額. Advance received billing amount.<p>
	 *
	 */
	public void adv_bill_amt(double value) {
		setConstNumber(offset + 44, $adv_bill_amt, value);
	}
	
	/**
	 * 前受金入金額. Advance received payment amount.<p>
	 *
	 */
	public MCNumber adv_rcv_amt() {
		return getConstNumber(offset + 45, $adv_rcv_amt);
	}

	/**
	 * 前受金入金額. Advance received payment amount.<p>
	 *
	 */
	public void adv_rcv_amt(MCNumber value) {
		setConstNumber(offset + 45, $adv_rcv_amt, value);
	}
	
	/**
	 * 前受金入金額. Advance received payment amount.<p>
	 *
	 */
	public void adv_rcv_amt(int value) {
		setConstNumber(offset + 45, $adv_rcv_amt, value);
	}
	
	/**
	 * 前受金入金額. Advance received payment amount.<p>
	 *
	 */
	public void adv_rcv_amt(long value) {
		setConstNumber(offset + 45, $adv_rcv_amt, value);
	}
	
	/**
	 * 前受金入金額. Advance received payment amount.<p>
	 *
	 */
	public void adv_rcv_amt(float value) {
		setConstNumber(offset + 45, $adv_rcv_amt, value);
	}
	
	/**
	 * 前受金入金額. Advance received payment amount.<p>
	 *
	 */
	public void adv_rcv_amt(double value) {
		setConstNumber(offset + 45, $adv_rcv_amt, value);
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
	 * 承認対象ＦＬＧ. For approval flg..<p>
	 *
	 */
	public boolean aprv_flg() {
		return getConstBoolean(offset + 49, $aprv_flg);
	}

	/**
	 * 承認対象ＦＬＧ. For approval flg..<p>
	 *
	 */
	public void aprv_flg(boolean value) {
		setConstBoolean(offset + 49, $aprv_flg, value);
	}

	/**
	 * 承認ＮＯ. Approval No..<p>
	 *
	 */
	public String aprv_no() {
		return getConstString(offset + 50, $aprv_no);
	}

	/**
	 * 承認ＮＯ. Approval No..<p>
	 *
	 */
	public void aprv_no(String value) {
		setConstString(offset + 50, $aprv_no, value);
	}

	/**
	 * 承認状況区分. Approval status type.<p>
	 *
	 */
	public String aprv_sts_typ() {
		return getConstString(offset + 51, $aprv_sts_typ);
	}

	/**
	 * 承認状況区分. Approval status type.<p>
	 *
	 */
	public void aprv_sts_typ(String value) {
		setConstString(offset + 51, $aprv_sts_typ, value);
	}

	/**
	 * ＥＤＩ ＦＬＧ. EDI flg..<p>
	 *
	 */
	public boolean edi_flg() {
		return getConstBoolean(offset + 52, $edi_flg);
	}

	/**
	 * ＥＤＩ ＦＬＧ. EDI flg..<p>
	 *
	 */
	public void edi_flg(boolean value) {
		setConstBoolean(offset + 52, $edi_flg, value);
	}

	/**
	 * 取消ＦＬＧ. Cancel flg..<p>
	 *
	 */
	public boolean can_flg() {
		return getConstBoolean(offset + 53, $can_flg);
	}

	/**
	 * 取消ＦＬＧ. Cancel flg..<p>
	 *
	 */
	public void can_flg(boolean value) {
		setConstBoolean(offset + 53, $can_flg, value);
	}

	/**
	 * 取消理由ＣＤ. Canceling reason cd..<p>
	 *
	 */
	public String can_rsn_cd() {
		return getConstString(offset + 54, $can_rsn_cd);
	}

	/**
	 * 取消理由ＣＤ. Canceling reason cd..<p>
	 *
	 */
	public void can_rsn_cd(String value) {
		setConstString(offset + 54, $can_rsn_cd, value);
	}

	/**
	 * 取消備考. Cancel remarks.<p>
	 *
	 */
	public String can_rmrks() {
		return getConstString(offset + 55, $can_rmrks);
	}

	/**
	 * 取消備考. Cancel remarks.<p>
	 *
	 */
	public void can_rmrks(String value) {
		setConstString(offset + 55, $can_rmrks, value);
	}

	/**
	 * 与信更新金額. Credit update amount.<p>
	 *
	 */
	public MCNumber cred_upd_amt() {
		return getConstNumber(offset + 56, $cred_upd_amt);
	}

	/**
	 * 与信更新金額. Credit update amount.<p>
	 *
	 */
	public void cred_upd_amt(MCNumber value) {
		setConstNumber(offset + 56, $cred_upd_amt, value);
	}
	
	/**
	 * 与信更新金額. Credit update amount.<p>
	 *
	 */
	public void cred_upd_amt(int value) {
		setConstNumber(offset + 56, $cred_upd_amt, value);
	}
	
	/**
	 * 与信更新金額. Credit update amount.<p>
	 *
	 */
	public void cred_upd_amt(long value) {
		setConstNumber(offset + 56, $cred_upd_amt, value);
	}
	
	/**
	 * 与信更新金額. Credit update amount.<p>
	 *
	 */
	public void cred_upd_amt(float value) {
		setConstNumber(offset + 56, $cred_upd_amt, value);
	}
	
	/**
	 * 与信更新金額. Credit update amount.<p>
	 *
	 */
	public void cred_upd_amt(double value) {
		setConstNumber(offset + 56, $cred_upd_amt, value);
	}
	
	/**
	 * ＥＤＩ予備ＣＨＡＲ項目１. EDI spare CHAR column 1.<p>
	 *
	 */
	public String edi_sub_char1() {
		return getConstString(offset + 57, $edi_sub_char1);
	}

	/**
	 * ＥＤＩ予備ＣＨＡＲ項目１. EDI spare CHAR column 1.<p>
	 *
	 */
	public void edi_sub_char1(String value) {
		setConstString(offset + 57, $edi_sub_char1, value);
	}

	/**
	 * ＥＤＩ予備ＣＨＡＲ項目２. EDI spare CHAR column 2.<p>
	 *
	 */
	public String edi_sub_char2() {
		return getConstString(offset + 58, $edi_sub_char2);
	}

	/**
	 * ＥＤＩ予備ＣＨＡＲ項目２. EDI spare CHAR column 2.<p>
	 *
	 */
	public void edi_sub_char2(String value) {
		setConstString(offset + 58, $edi_sub_char2, value);
	}

	/**
	 * ＥＤＩ予備ＣＨＡＲ項目３. EDI spare CHAR column 3.<p>
	 *
	 */
	public String edi_sub_char3() {
		return getConstString(offset + 59, $edi_sub_char3);
	}

	/**
	 * ＥＤＩ予備ＣＨＡＲ項目３. EDI spare CHAR column 3.<p>
	 *
	 */
	public void edi_sub_char3(String value) {
		setConstString(offset + 59, $edi_sub_char3, value);
	}

	/**
	 * ＥＤＩ予備ＣＨＡＲ項目４. EDI spare CHAR column 4.<p>
	 *
	 */
	public String edi_sub_char4() {
		return getConstString(offset + 60, $edi_sub_char4);
	}

	/**
	 * ＥＤＩ予備ＣＨＡＲ項目４. EDI spare CHAR column 4.<p>
	 *
	 */
	public void edi_sub_char4(String value) {
		setConstString(offset + 60, $edi_sub_char4, value);
	}

	/**
	 * ＥＤＩ予備ＣＨＡＲ項目５. EDI spare CHAR column 5.<p>
	 *
	 */
	public String edi_sub_char5() {
		return getConstString(offset + 61, $edi_sub_char5);
	}

	/**
	 * ＥＤＩ予備ＣＨＡＲ項目５. EDI spare CHAR column 5.<p>
	 *
	 */
	public void edi_sub_char5(String value) {
		setConstString(offset + 61, $edi_sub_char5, value);
	}

	/**
	 * ＥＤＩ予備ＮＵＭ項目１. EDI spare NUM column 1.<p>
	 *
	 */
	public MCNumber edi_sub_num1() {
		return getConstNumber(offset + 62, $edi_sub_num1);
	}

	/**
	 * ＥＤＩ予備ＮＵＭ項目１. EDI spare NUM column 1.<p>
	 *
	 */
	public void edi_sub_num1(MCNumber value) {
		setConstNumber(offset + 62, $edi_sub_num1, value);
	}
	
	/**
	 * ＥＤＩ予備ＮＵＭ項目１. EDI spare NUM column 1.<p>
	 *
	 */
	public void edi_sub_num1(int value) {
		setConstNumber(offset + 62, $edi_sub_num1, value);
	}
	
	/**
	 * ＥＤＩ予備ＮＵＭ項目１. EDI spare NUM column 1.<p>
	 *
	 */
	public void edi_sub_num1(long value) {
		setConstNumber(offset + 62, $edi_sub_num1, value);
	}
	
	/**
	 * ＥＤＩ予備ＮＵＭ項目１. EDI spare NUM column 1.<p>
	 *
	 */
	public void edi_sub_num1(float value) {
		setConstNumber(offset + 62, $edi_sub_num1, value);
	}
	
	/**
	 * ＥＤＩ予備ＮＵＭ項目１. EDI spare NUM column 1.<p>
	 *
	 */
	public void edi_sub_num1(double value) {
		setConstNumber(offset + 62, $edi_sub_num1, value);
	}
	
	/**
	 * ＥＤＩ予備ＤＡＴＥ項目１. EDI spare DATE column 1.<p>
	 *
	 */
	public MCDate edi_sub_dt1() {
		return getConstDate(offset + 63, $edi_sub_dt1);
	}

	/**
	 * ＥＤＩ予備ＤＡＴＥ項目１. EDI spare DATE column 1.<p>
	 *
	 */
	public void edi_sub_dt1(MCDate value) {
		setConstDate(offset + 63, $edi_sub_dt1, value);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 64, $ins_usr_id);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 64, $ins_usr_id, value);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 65, $ins_usr_nm);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 65, $ins_usr_nm, value);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 66, $ins_ts);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 66, $ins_ts, value);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 67, $ins_func_id);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 67, $ins_func_id, value);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 68, $upd_cntr);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 68, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 68, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 68, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 68, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 68, $upd_cntr, value);
	}
	
	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 69, $upd_usr_id);
	}

	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 69, $upd_usr_id, value);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 70, $upd_usr_nm);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 70, $upd_usr_nm, value);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 71, $upd_ts);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 71, $upd_ts, value);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 72, $upd_func_id);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 72, $upd_func_id, value);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 73, $upd_srv_req_no);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 73, $upd_srv_req_no, value);
	}

	/**
	 * 売上日. .<p>
	 *
	 */
	public MCDate sls_dt() {
		return getConstDate(offset + 74, $sls_dt);
	}

	/**
	 * 売上日. .<p>
	 *
	 */
	public void sls_dt(MCDate value) {
		setConstDate(offset + 74, $sls_dt, value);
	}

	/**
	 * 受注日. .<p>
	 *
	 */
	public MCDate slo_aprv_dt() {
		return getConstDate(offset + 75, $slo_aprv_dt);
	}

	/**
	 * 受注日. .<p>
	 *
	 */
	public void slo_aprv_dt(MCDate value) {
		setConstDate(offset + 75, $slo_aprv_dt, value);
	}

	/**
	 * 更新日. .<p>
	 *
	 */
	public MCDate aprv_dt() {
		return getConstDate(offset + 76, $aprv_dt);
	}

	/**
	 * 更新日. .<p>
	 *
	 */
	public void aprv_dt(MCDate value) {
		setConstDate(offset + 76, $aprv_dt, value);
	}

	/**
	 * 出荷帳票得意先名印字しないＦＬＧ. .<p>
	 *
	 */
	public boolean ship_prnt_no_cst_nm_flg() {
		return getConstBoolean(offset + 77, $ship_prnt_no_cst_nm_flg);
	}

	/**
	 * 出荷帳票得意先名印字しないＦＬＧ. .<p>
	 *
	 */
	public void ship_prnt_no_cst_nm_flg(boolean value) {
		setConstBoolean(offset + 77, $ship_prnt_no_cst_nm_flg, value);
	}

	/**
	 * 元案件ＮＯ. .<p>
	 *
	 */
	public String src_wrk_no() {
		return getConstString(offset + 78, $src_wrk_no);
	}

	/**
	 * 元案件ＮＯ. .<p>
	 *
	 */
	public void src_wrk_no(String value) {
		setConstString(offset + 78, $src_wrk_no, value);
	}

	/**
	 * ＺＯＨＯ販売予定ＮＯ. .<p>
	 *
	 */
	public String zoho_sls_schd_no() {
		return getConstString(offset + 79, $zoho_sls_schd_no);
	}

	/**
	 * ＺＯＨＯ販売予定ＮＯ. .<p>
	 *
	 */
	public void zoho_sls_schd_no(String value) {
		setConstString(offset + 79, $zoho_sls_schd_no, value);
	}

	/**
	 * 受注出荷最終売上. .<p>
	 *
	 */
	public boolean slo_last_sls_flg() {
		return getConstBoolean(offset + 80, $slo_last_sls_flg);
	}

	/**
	 * 受注出荷最終売上. .<p>
	 *
	 */
	public void slo_last_sls_flg(boolean value) {
		setConstBoolean(offset + 80, $slo_last_sls_flg, value);
	}

	/**
	 * 製品ＣＤ. .<p>
	 *
	 */
	public String prod_itm_cd() {
		return getConstString(offset + 81, $prod_itm_cd);
	}

	/**
	 * 製品ＣＤ. .<p>
	 *
	 */
	public void prod_itm_cd(String value) {
		setConstString(offset + 81, $prod_itm_cd, value);
	}

	/**
	 * 製品枝番１. .<p>
	 *
	 */
	public String prod_itm_sub1() {
		return getConstString(offset + 82, $prod_itm_sub1);
	}

	/**
	 * 製品枝番１. .<p>
	 *
	 */
	public void prod_itm_sub1(String value) {
		setConstString(offset + 82, $prod_itm_sub1, value);
	}

	/**
	 * 製品枝番２. .<p>
	 *
	 */
	public String prod_itm_sub2() {
		return getConstString(offset + 83, $prod_itm_sub2);
	}

	/**
	 * 製品枝番２. .<p>
	 *
	 */
	public void prod_itm_sub2(String value) {
		setConstString(offset + 83, $prod_itm_sub2, value);
	}

	/**
	 * 製品枝番３. .<p>
	 *
	 */
	public String prod_itm_sub3() {
		return getConstString(offset + 84, $prod_itm_sub3);
	}

	/**
	 * 製品枝番３. .<p>
	 *
	 */
	public void prod_itm_sub3(String value) {
		setConstString(offset + 84, $prod_itm_sub3, value);
	}

	/**
	 * 製品名. .<p>
	 *
	 */
	public String prod_itm_nm() {
		return getConstString(offset + 85, $prod_itm_nm);
	}

	/**
	 * 製品名. .<p>
	 *
	 */
	public void prod_itm_nm(String value) {
		setConstString(offset + 85, $prod_itm_nm, value);
	}

	/**
	 * 測線数. .<p>
	 *
	 */
	public String surv_line_qty() {
		return getConstString(offset + 86, $surv_line_qty);
	}

	/**
	 * 測線数. .<p>
	 *
	 */
	public void surv_line_qty(String value) {
		setConstString(offset + 86, $surv_line_qty, value);
	}

	/**
	 * 口径. .<p>
	 *
	 */
	public String diameter() {
		return getConstString(offset + 87, $diameter);
	}

	/**
	 * 口径. .<p>
	 *
	 */
	public void diameter(String value) {
		setConstString(offset + 87, $diameter, value);
	}

	/**
	 * 照合ＫＥＹ. .<p>
	 *
	 */
	public String match_key() {
		return getConstString(offset + 88, $match_key);
	}

	/**
	 * 照合ＫＥＹ. .<p>
	 *
	 */
	public void match_key(String value) {
		setConstString(offset + 88, $match_key, value);
	}

	/**
	 * 受付番号. .<p>
	 *
	 */
	public String rcpt_no() {
		return getConstString(offset + 89, $rcpt_no);
	}

	/**
	 * 受付番号. .<p>
	 *
	 */
	public void rcpt_no(String value) {
		setConstString(offset + 89, $rcpt_no, value);
	}

	/**
	 * 申請書番号. .<p>
	 *
	 */
	public String appl_doc_no() {
		return getConstString(offset + 90, $appl_doc_no);
	}

	/**
	 * 申請書番号. .<p>
	 *
	 */
	public void appl_doc_no(String value) {
		setConstString(offset + 90, $appl_doc_no, value);
	}

	/**
	 * 納入図番号. .<p>
	 *
	 */
	public String dlv_draw_no() {
		return getConstString(offset + 91, $dlv_draw_no);
	}

	/**
	 * 納入図番号. .<p>
	 *
	 */
	public void dlv_draw_no(String value) {
		setConstString(offset + 91, $dlv_draw_no, value);
	}

	/**
	 * 注番区分. .<p>
	 *
	 */
	public String slo_num_typ() {
		return getConstString(offset + 92, $slo_num_typ);
	}

	/**
	 * 注番区分. .<p>
	 *
	 */
	public void slo_num_typ(String value) {
		setConstString(offset + 92, $slo_num_typ, value);
	}

	/**
	 * 注文番号. .<p>
	 *
	 */
	public String slo_num() {
		return getConstString(offset + 93, $slo_num);
	}

	/**
	 * 注文番号. .<p>
	 *
	 */
	public void slo_num(String value) {
		setConstString(offset + 93, $slo_num, value);
	}

	/**
	 * 数量（ヘッダ）. .<p>
	 *
	 */
	public MCNumber hdr_qty() {
		return getConstNumber(offset + 94, $hdr_qty);
	}

	/**
	 * 数量（ヘッダ）. .<p>
	 *
	 */
	public void hdr_qty(MCNumber value) {
		setConstNumber(offset + 94, $hdr_qty, value);
	}
	
	/**
	 * 数量（ヘッダ）. .<p>
	 *
	 */
	public void hdr_qty(int value) {
		setConstNumber(offset + 94, $hdr_qty, value);
	}
	
	/**
	 * 数量（ヘッダ）. .<p>
	 *
	 */
	public void hdr_qty(long value) {
		setConstNumber(offset + 94, $hdr_qty, value);
	}
	
	/**
	 * 数量（ヘッダ）. .<p>
	 *
	 */
	public void hdr_qty(float value) {
		setConstNumber(offset + 94, $hdr_qty, value);
	}
	
	/**
	 * 数量（ヘッダ）. .<p>
	 *
	 */
	public void hdr_qty(double value) {
		setConstNumber(offset + 94, $hdr_qty, value);
	}
	
	/**
	 * 金額（ヘッダ）. .<p>
	 *
	 */
	public MCNumber hdr_amt() {
		return getConstNumber(offset + 95, $hdr_amt);
	}

	/**
	 * 金額（ヘッダ）. .<p>
	 *
	 */
	public void hdr_amt(MCNumber value) {
		setConstNumber(offset + 95, $hdr_amt, value);
	}
	
	/**
	 * 金額（ヘッダ）. .<p>
	 *
	 */
	public void hdr_amt(int value) {
		setConstNumber(offset + 95, $hdr_amt, value);
	}
	
	/**
	 * 金額（ヘッダ）. .<p>
	 *
	 */
	public void hdr_amt(long value) {
		setConstNumber(offset + 95, $hdr_amt, value);
	}
	
	/**
	 * 金額（ヘッダ）. .<p>
	 *
	 */
	public void hdr_amt(float value) {
		setConstNumber(offset + 95, $hdr_amt, value);
	}
	
	/**
	 * 金額（ヘッダ）. .<p>
	 *
	 */
	public void hdr_amt(double value) {
		setConstNumber(offset + 95, $hdr_amt, value);
	}
	
	/**
	 * 塗色. .<p>
	 *
	 */
	public String paint_clr() {
		return getConstString(offset + 96, $paint_clr);
	}

	/**
	 * 塗色. .<p>
	 *
	 */
	public void paint_clr(String value) {
		setConstString(offset + 96, $paint_clr, value);
	}

	/**
	 * 売上条件区分. .<p>
	 *
	 */
	public String sales_cond() {
		return getConstString(offset + 97, $sales_cond);
	}

	/**
	 * 売上条件区分. .<p>
	 *
	 */
	public void sales_cond(String value) {
		setConstString(offset + 97, $sales_cond, value);
	}

	/**
	 * 出荷特別指示区分. .<p>
	 *
	 */
	public String ship_sp_instr_typ() {
		return getConstString(offset + 98, $ship_sp_instr_typ);
	}

	/**
	 * 出荷特別指示区分. .<p>
	 *
	 */
	public void ship_sp_instr_typ(String value) {
		setConstString(offset + 98, $ship_sp_instr_typ, value);
	}

	/**
	 * 指定納品書区分. .<p>
	 *
	 */
	public String spec_dlv_note_typ() {
		return getConstString(offset + 99, $spec_dlv_note_typ);
	}

	/**
	 * 指定納品書区分. .<p>
	 *
	 */
	public void spec_dlv_note_typ(String value) {
		setConstString(offset + 99, $spec_dlv_note_typ, value);
	}

	/**
	 * 注文書納期. .<p>
	 *
	 */
	public MCDate ord_dlv_dt() {
		return getConstDate(offset + 100, $ord_dlv_dt);
	}

	/**
	 * 注文書納期. .<p>
	 *
	 */
	public void ord_dlv_dt(MCDate value) {
		setConstDate(offset + 100, $ord_dlv_dt, value);
	}

	/**
	 * 市場ＣＤ. .<p>
	 *
	 */
	public String mrkt_cd() {
		return getConstString(offset + 101, $mrkt_cd);
	}

	/**
	 * 市場ＣＤ. .<p>
	 *
	 */
	public void mrkt_cd(String value) {
		setConstString(offset + 101, $mrkt_cd, value);
	}

	/**
	 * 国別符号. .<p>
	 *
	 */
	public String cntry_sign() {
		return getConstString(offset + 102, $cntry_sign);
	}

	/**
	 * 国別符号. .<p>
	 *
	 */
	public void cntry_sign(String value) {
		setConstString(offset + 102, $cntry_sign, value);
	}

	/**
	 * 船籍. .<p>
	 *
	 */
	public String ves_natl() {
		return getConstString(offset + 103, $ves_natl);
	}

	/**
	 * 船籍. .<p>
	 *
	 */
	public void ves_natl(String value) {
		setConstString(offset + 103, $ves_natl, value);
	}

	/**
	 * 造船所. .<p>
	 *
	 */
	public String shipyard_cd() {
		return getConstString(offset + 104, $shipyard_cd);
	}

	/**
	 * 造船所. .<p>
	 *
	 */
	public void shipyard_cd(String value) {
		setConstString(offset + 104, $shipyard_cd, value);
	}

	/**
	 * 船番. .<p>
	 *
	 */
	public String ves_no() {
		return getConstString(offset + 105, $ves_no);
	}

	/**
	 * 船番. .<p>
	 *
	 */
	public void ves_no(String value) {
		setConstString(offset + 105, $ves_no, value);
	}

	/**
	 * 船名. .<p>
	 *
	 */
	public String ves_nm() {
		return getConstString(offset + 106, $ves_nm);
	}

	/**
	 * 船名. .<p>
	 *
	 */
	public void ves_nm(String value) {
		setConstString(offset + 106, $ves_nm, value);
	}

	/**
	 * 屯数. .<p>
	 *
	 */
	public String tonnage() {
		return getConstString(offset + 107, $tonnage);
	}

	/**
	 * 屯数. .<p>
	 *
	 */
	public void tonnage(String value) {
		setConstString(offset + 107, $tonnage, value);
	}

	/**
	 * 船種. .<p>
	 *
	 */
	public String ves_typ() {
		return getConstString(offset + 108, $ves_typ);
	}

	/**
	 * 船種. .<p>
	 *
	 */
	public void ves_typ(String value) {
		setConstString(offset + 108, $ves_typ, value);
	}

	/**
	 * 検査規格. .<p>
	 *
	 */
	public String insp_std() {
		return getConstString(offset + 109, $insp_std);
	}

	/**
	 * 検査規格. .<p>
	 *
	 */
	public void insp_std(String value) {
		setConstString(offset + 109, $insp_std, value);
	}

	/**
	 * ロイヤリティ対象金額. .<p>
	 *
	 */
	public MCNumber royalty_trg_amt() {
		return getConstNumber(offset + 110, $royalty_trg_amt);
	}

	/**
	 * ロイヤリティ対象金額. .<p>
	 *
	 */
	public void royalty_trg_amt(MCNumber value) {
		setConstNumber(offset + 110, $royalty_trg_amt, value);
	}
	
	/**
	 * ロイヤリティ対象金額. .<p>
	 *
	 */
	public void royalty_trg_amt(int value) {
		setConstNumber(offset + 110, $royalty_trg_amt, value);
	}
	
	/**
	 * ロイヤリティ対象金額. .<p>
	 *
	 */
	public void royalty_trg_amt(long value) {
		setConstNumber(offset + 110, $royalty_trg_amt, value);
	}
	
	/**
	 * ロイヤリティ対象金額. .<p>
	 *
	 */
	public void royalty_trg_amt(float value) {
		setConstNumber(offset + 110, $royalty_trg_amt, value);
	}
	
	/**
	 * ロイヤリティ対象金額. .<p>
	 *
	 */
	public void royalty_trg_amt(double value) {
		setConstNumber(offset + 110, $royalty_trg_amt, value);
	}
	
	/**
	 * ロイヤリティ支払先. .<p>
	 *
	 */
	public String royalty_psppl() {
		return getConstString(offset + 111, $royalty_psppl);
	}

	/**
	 * ロイヤリティ支払先. .<p>
	 *
	 */
	public void royalty_psppl(String value) {
		setConstString(offset + 111, $royalty_psppl, value);
	}

	/**
	 * 設置場所1. .<p>
	 *
	 */
	public String ins_loc_1() {
		return getConstString(offset + 112, $ins_loc_1);
	}

	/**
	 * 設置場所1. .<p>
	 *
	 */
	public void ins_loc_1(String value) {
		setConstString(offset + 112, $ins_loc_1, value);
	}

	/**
	 * 設置場所2. .<p>
	 *
	 */
	public String ins_loc_2() {
		return getConstString(offset + 113, $ins_loc_2);
	}

	/**
	 * 設置場所2. .<p>
	 *
	 */
	public void ins_loc_2(String value) {
		setConstString(offset + 113, $ins_loc_2, value);
	}

	/**
	 * SFI番号. .<p>
	 *
	 */
	public String sfi_no() {
		return getConstString(offset + 114, $sfi_no);
	}

	/**
	 * SFI番号. .<p>
	 *
	 */
	public void sfi_no(String value) {
		setConstString(offset + 114, $sfi_no, value);
	}

	/**
	 * 装備後売上日. .<p>
	 *
	 */
	public MCDate ps_sal_aft_dt() {
		return getConstDate(offset + 115, $ps_sal_aft_dt);
	}

	/**
	 * 装備後売上日. .<p>
	 *
	 */
	public void ps_sal_aft_dt(MCDate value) {
		setConstDate(offset + 115, $ps_sal_aft_dt, value);
	}

	/**
	 * 立会検査有無区分. .<p>
	 *
	 */
	public String wit_insp_typ() {
		return getConstString(offset + 116, $wit_insp_typ);
	}

	/**
	 * 立会検査有無区分. .<p>
	 *
	 */
	public void wit_insp_typ(String value) {
		setConstString(offset + 116, $wit_insp_typ, value);
	}

	/**
	 * 装備要否区分. .<p>
	 *
	 */
	public String equip_typ() {
		return getConstString(offset + 117, $equip_typ);
	}

	/**
	 * 装備要否区分. .<p>
	 *
	 */
	public void equip_typ(String value) {
		setConstString(offset + 117, $equip_typ, value);
	}

	/**
	 * 仕様書区分. .<p>
	 *
	 */
	public String spec_doc_typ() {
		return getConstString(offset + 118, $spec_doc_typ);
	}

	/**
	 * 仕様書区分. .<p>
	 *
	 */
	public void spec_doc_typ(String value) {
		setConstString(offset + 118, $spec_doc_typ, value);
	}

	/**
	 * 型式和英区分. .<p>
	 *
	 */
	public String model_jp_en_typ() {
		return getConstString(offset + 119, $model_jp_en_typ);
	}

	/**
	 * 型式和英区分. .<p>
	 *
	 */
	public void model_jp_en_typ(String value) {
		setConstString(offset + 119, $model_jp_en_typ, value);
	}

	/**
	 * 検査成績書（検査成績書区分）. .<p>
	 *
	 */
	public String insp_rep_typ() {
		return getConstString(offset + 120, $insp_rep_typ);
	}

	/**
	 * 検査成績書（検査成績書区分）. .<p>
	 *
	 */
	public void insp_rep_typ(String value) {
		setConstString(offset + 120, $insp_rep_typ, value);
	}

	/**
	 * 検査成績書（検査成績書部数）. .<p>
	 *
	 */
	public MCNumber insp_rep_qty() {
		return getConstNumber(offset + 121, $insp_rep_qty);
	}

	/**
	 * 検査成績書（検査成績書部数）. .<p>
	 *
	 */
	public void insp_rep_qty(MCNumber value) {
		setConstNumber(offset + 121, $insp_rep_qty, value);
	}
	
	/**
	 * 検査成績書（検査成績書部数）. .<p>
	 *
	 */
	public void insp_rep_qty(int value) {
		setConstNumber(offset + 121, $insp_rep_qty, value);
	}
	
	/**
	 * 検査成績書（検査成績書部数）. .<p>
	 *
	 */
	public void insp_rep_qty(long value) {
		setConstNumber(offset + 121, $insp_rep_qty, value);
	}
	
	/**
	 * 検査成績書（検査成績書部数）. .<p>
	 *
	 */
	public void insp_rep_qty(float value) {
		setConstNumber(offset + 121, $insp_rep_qty, value);
	}
	
	/**
	 * 検査成績書（検査成績書部数）. .<p>
	 *
	 */
	public void insp_rep_qty(double value) {
		setConstNumber(offset + 121, $insp_rep_qty, value);
	}
	
	/**
	 * 協議図（協議図区分）. .<p>
	 *
	 */
	public String cons_draw_typ() {
		return getConstString(offset + 122, $cons_draw_typ);
	}

	/**
	 * 協議図（協議図区分）. .<p>
	 *
	 */
	public void cons_draw_typ(String value) {
		setConstString(offset + 122, $cons_draw_typ, value);
	}

	/**
	 * 協議図（協議図部数）. .<p>
	 *
	 */
	public MCNumber cons_draw_qty() {
		return getConstNumber(offset + 123, $cons_draw_qty);
	}

	/**
	 * 協議図（協議図部数）. .<p>
	 *
	 */
	public void cons_draw_qty(MCNumber value) {
		setConstNumber(offset + 123, $cons_draw_qty, value);
	}
	
	/**
	 * 協議図（協議図部数）. .<p>
	 *
	 */
	public void cons_draw_qty(int value) {
		setConstNumber(offset + 123, $cons_draw_qty, value);
	}
	
	/**
	 * 協議図（協議図部数）. .<p>
	 *
	 */
	public void cons_draw_qty(long value) {
		setConstNumber(offset + 123, $cons_draw_qty, value);
	}
	
	/**
	 * 協議図（協議図部数）. .<p>
	 *
	 */
	public void cons_draw_qty(float value) {
		setConstNumber(offset + 123, $cons_draw_qty, value);
	}
	
	/**
	 * 協議図（協議図部数）. .<p>
	 *
	 */
	public void cons_draw_qty(double value) {
		setConstNumber(offset + 123, $cons_draw_qty, value);
	}
	
	/**
	 * 工事図（工事図区分）. .<p>
	 *
	 */
	public String const_draw_typ() {
		return getConstString(offset + 124, $const_draw_typ);
	}

	/**
	 * 工事図（工事図区分）. .<p>
	 *
	 */
	public void const_draw_typ(String value) {
		setConstString(offset + 124, $const_draw_typ, value);
	}

	/**
	 * 工事図（工事図部数）. .<p>
	 *
	 */
	public MCNumber const_draw_qty() {
		return getConstNumber(offset + 125, $const_draw_qty);
	}

	/**
	 * 工事図（工事図部数）. .<p>
	 *
	 */
	public void const_draw_qty(MCNumber value) {
		setConstNumber(offset + 125, $const_draw_qty, value);
	}
	
	/**
	 * 工事図（工事図部数）. .<p>
	 *
	 */
	public void const_draw_qty(int value) {
		setConstNumber(offset + 125, $const_draw_qty, value);
	}
	
	/**
	 * 工事図（工事図部数）. .<p>
	 *
	 */
	public void const_draw_qty(long value) {
		setConstNumber(offset + 125, $const_draw_qty, value);
	}
	
	/**
	 * 工事図（工事図部数）. .<p>
	 *
	 */
	public void const_draw_qty(float value) {
		setConstNumber(offset + 125, $const_draw_qty, value);
	}
	
	/**
	 * 工事図（工事図部数）. .<p>
	 *
	 */
	public void const_draw_qty(double value) {
		setConstNumber(offset + 125, $const_draw_qty, value);
	}
	
	/**
	 * 完成図（完成図区分）. .<p>
	 *
	 */
	public String comp_draw_typ() {
		return getConstString(offset + 126, $comp_draw_typ);
	}

	/**
	 * 完成図（完成図区分）. .<p>
	 *
	 */
	public void comp_draw_typ(String value) {
		setConstString(offset + 126, $comp_draw_typ, value);
	}

	/**
	 * 完成図（完成図部数）. .<p>
	 *
	 */
	public MCNumber comp_draw_qty() {
		return getConstNumber(offset + 127, $comp_draw_qty);
	}

	/**
	 * 完成図（完成図部数）. .<p>
	 *
	 */
	public void comp_draw_qty(MCNumber value) {
		setConstNumber(offset + 127, $comp_draw_qty, value);
	}
	
	/**
	 * 完成図（完成図部数）. .<p>
	 *
	 */
	public void comp_draw_qty(int value) {
		setConstNumber(offset + 127, $comp_draw_qty, value);
	}
	
	/**
	 * 完成図（完成図部数）. .<p>
	 *
	 */
	public void comp_draw_qty(long value) {
		setConstNumber(offset + 127, $comp_draw_qty, value);
	}
	
	/**
	 * 完成図（完成図部数）. .<p>
	 *
	 */
	public void comp_draw_qty(float value) {
		setConstNumber(offset + 127, $comp_draw_qty, value);
	}
	
	/**
	 * 完成図（完成図部数）. .<p>
	 *
	 */
	public void comp_draw_qty(double value) {
		setConstNumber(offset + 127, $comp_draw_qty, value);
	}
	
	/**
	 * 取扱説明書（取扱説明書区分）. .<p>
	 *
	 */
	public String inst_manual_typ() {
		return getConstString(offset + 128, $inst_manual_typ);
	}

	/**
	 * 取扱説明書（取扱説明書区分）. .<p>
	 *
	 */
	public void inst_manual_typ(String value) {
		setConstString(offset + 128, $inst_manual_typ, value);
	}

	/**
	 * 取扱説明書（取扱説明書部数）. .<p>
	 *
	 */
	public MCNumber inst_manual_qty() {
		return getConstNumber(offset + 129, $inst_manual_qty);
	}

	/**
	 * 取扱説明書（取扱説明書部数）. .<p>
	 *
	 */
	public void inst_manual_qty(MCNumber value) {
		setConstNumber(offset + 129, $inst_manual_qty, value);
	}
	
	/**
	 * 取扱説明書（取扱説明書部数）. .<p>
	 *
	 */
	public void inst_manual_qty(int value) {
		setConstNumber(offset + 129, $inst_manual_qty, value);
	}
	
	/**
	 * 取扱説明書（取扱説明書部数）. .<p>
	 *
	 */
	public void inst_manual_qty(long value) {
		setConstNumber(offset + 129, $inst_manual_qty, value);
	}
	
	/**
	 * 取扱説明書（取扱説明書部数）. .<p>
	 *
	 */
	public void inst_manual_qty(float value) {
		setConstNumber(offset + 129, $inst_manual_qty, value);
	}
	
	/**
	 * 取扱説明書（取扱説明書部数）. .<p>
	 *
	 */
	public void inst_manual_qty(double value) {
		setConstNumber(offset + 129, $inst_manual_qty, value);
	}
	
	/**
	 * 承認図（承認図区分）. .<p>
	 *
	 */
	public String aprv_draw_typ() {
		return getConstString(offset + 130, $aprv_draw_typ);
	}

	/**
	 * 承認図（承認図区分）. .<p>
	 *
	 */
	public void aprv_draw_typ(String value) {
		setConstString(offset + 130, $aprv_draw_typ, value);
	}

	/**
	 * 承認図（承認図部数）. .<p>
	 *
	 */
	public MCNumber aprv_draw_qty() {
		return getConstNumber(offset + 131, $aprv_draw_qty);
	}

	/**
	 * 承認図（承認図部数）. .<p>
	 *
	 */
	public void aprv_draw_qty(MCNumber value) {
		setConstNumber(offset + 131, $aprv_draw_qty, value);
	}
	
	/**
	 * 承認図（承認図部数）. .<p>
	 *
	 */
	public void aprv_draw_qty(int value) {
		setConstNumber(offset + 131, $aprv_draw_qty, value);
	}
	
	/**
	 * 承認図（承認図部数）. .<p>
	 *
	 */
	public void aprv_draw_qty(long value) {
		setConstNumber(offset + 131, $aprv_draw_qty, value);
	}
	
	/**
	 * 承認図（承認図部数）. .<p>
	 *
	 */
	public void aprv_draw_qty(float value) {
		setConstNumber(offset + 131, $aprv_draw_qty, value);
	}
	
	/**
	 * 承認図（承認図部数）. .<p>
	 *
	 */
	public void aprv_draw_qty(double value) {
		setConstNumber(offset + 131, $aprv_draw_qty, value);
	}
	
	/**
	 * 受注変更理由. .<p>
	 *
	 */
	public String slo_cng_rsn() {
		return getConstString(offset + 132, $slo_cng_rsn);
	}

	/**
	 * 受注変更理由. .<p>
	 *
	 */
	public void slo_cng_rsn(String value) {
		setConstString(offset + 132, $slo_cng_rsn, value);
	}

	/**
	 * 無償理由ＣＤ. .<p>
	 *
	 */
	public String frc_rsn_cd() {
		return getConstString(offset + 133, $frc_rsn_cd);
	}

	/**
	 * 無償理由ＣＤ. .<p>
	 *
	 */
	public void frc_rsn_cd(String value) {
		setConstString(offset + 133, $frc_rsn_cd, value);
	}

	/**
	 * 代表図番. .<p>
	 *
	 */
	public String main_draw_no() {
		return getConstString(offset + 134, $main_draw_no);
	}

	/**
	 * 代表図番. .<p>
	 *
	 */
	public void main_draw_no(String value) {
		setConstString(offset + 134, $main_draw_no, value);
	}

	/**
	 * コメント１. .<p>
	 *
	 */
	public String slo_cmnt_1() {
		return getConstString(offset + 135, $slo_cmnt_1);
	}

	/**
	 * コメント１. .<p>
	 *
	 */
	public void slo_cmnt_1(String value) {
		setConstString(offset + 135, $slo_cmnt_1, value);
	}

	/**
	 * コメント２. .<p>
	 *
	 */
	public String slo_cmnt_2() {
		return getConstString(offset + 136, $slo_cmnt_2);
	}

	/**
	 * コメント２. .<p>
	 *
	 */
	public void slo_cmnt_2(String value) {
		setConstString(offset + 136, $slo_cmnt_2, value);
	}

	/**
	 * コメント３. .<p>
	 *
	 */
	public String slo_cmnt_3() {
		return getConstString(offset + 137, $slo_cmnt_3);
	}

	/**
	 * コメント３. .<p>
	 *
	 */
	public void slo_cmnt_3(String value) {
		setConstString(offset + 137, $slo_cmnt_3, value);
	}

	/**
	 * コメント４. .<p>
	 *
	 */
	public String slo_cmnt_4() {
		return getConstString(offset + 138, $slo_cmnt_4);
	}

	/**
	 * コメント４. .<p>
	 *
	 */
	public void slo_cmnt_4(String value) {
		setConstString(offset + 138, $slo_cmnt_4, value);
	}

	/**
	 * コメント５. .<p>
	 *
	 */
	public String slo_cmnt_5() {
		return getConstString(offset + 139, $slo_cmnt_5);
	}

	/**
	 * コメント５. .<p>
	 *
	 */
	public void slo_cmnt_5(String value) {
		setConstString(offset + 139, $slo_cmnt_5, value);
	}

	/**
	 * 元出荷基準ＦＬＧ. .<p>
	 *
	 */
	public boolean src_ship_flg() {
		return getConstBoolean(offset + 140, $src_ship_flg);
	}

	/**
	 * 元出荷基準ＦＬＧ. .<p>
	 *
	 */
	public void src_ship_flg(boolean value) {
		setConstBoolean(offset + 140, $src_ship_flg, value);
	}

	/**
	 * 受注種別. .<p>
	 *
	 */
	public String jip_slo_typ() {
		return getConstString(offset + 141, $jip_slo_typ);
	}

	/**
	 * 受注種別. .<p>
	 *
	 */
	public void jip_slo_typ(String value) {
		setConstString(offset + 141, $jip_slo_typ, value);
	}

	/**
	 * 客先コード. .<p>
	 *
	 */
	public String jip_cst_cd() {
		return getConstString(offset + 142, $jip_cst_cd);
	}

	/**
	 * 客先コード. .<p>
	 *
	 */
	public void jip_cst_cd(String value) {
		setConstString(offset + 142, $jip_cst_cd, value);
	}

	public String getString(String name) {
		if ($slo_no.equalsIgnoreCase(name)) {
			return slo_no();
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			return trd_cd();
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			return trd_ptn_typ();
		}
		if ($slo_typ.equalsIgnoreCase(name)) {
			return slo_typ();
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			return cst_cd();
		}
		if ($cst_po_no.equalsIgnoreCase(name)) {
			return cst_po_no();
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
		if ($iv_no.equalsIgnoreCase(name)) {
			return iv_no();
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
		if ($vssl_flght.equalsIgnoreCase(name)) {
			return vssl_flght();
		}
		if ($load_port_cd.equalsIgnoreCase(name)) {
			return load_port_cd();
		}
		if ($dschrg_port_cd.equalsIgnoreCase(name)) {
			return dschrg_port_cd();
		}
		if ($via_port_cd.equalsIgnoreCase(name)) {
			return via_port_cd();
		}
		if ($assort_typ.equalsIgnoreCase(name)) {
			return assort_typ();
		}
		if ($sls_basis_typ.equalsIgnoreCase(name)) {
			return sls_basis_typ();
		}
		if ($ar_dpt_cd.equalsIgnoreCase(name)) {
			return ar_dpt_cd();
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			return wrk_no();
		}
		if ($rcpt_usr_cd.equalsIgnoreCase(name)) {
			return rcpt_usr_cd();
		}
		if ($trd_rmrks.equalsIgnoreCase(name)) {
			return trd_rmrks();
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			return intr_rmrks();
		}
		if ($cst_po_rmrks.equalsIgnoreCase(name)) {
			return cst_po_rmrks();
		}
		if ($qtn_no.equalsIgnoreCase(name)) {
			return qtn_no();
		}
		if ($adv_ship_ctrl_typ.equalsIgnoreCase(name)) {
			return adv_ship_ctrl_typ();
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
		if ($aprv_no.equalsIgnoreCase(name)) {
			return aprv_no();
		}
		if ($aprv_sts_typ.equalsIgnoreCase(name)) {
			return aprv_sts_typ();
		}
		if ($can_rsn_cd.equalsIgnoreCase(name)) {
			return can_rsn_cd();
		}
		if ($can_rmrks.equalsIgnoreCase(name)) {
			return can_rmrks();
		}
		if ($edi_sub_char1.equalsIgnoreCase(name)) {
			return edi_sub_char1();
		}
		if ($edi_sub_char2.equalsIgnoreCase(name)) {
			return edi_sub_char2();
		}
		if ($edi_sub_char3.equalsIgnoreCase(name)) {
			return edi_sub_char3();
		}
		if ($edi_sub_char4.equalsIgnoreCase(name)) {
			return edi_sub_char4();
		}
		if ($edi_sub_char5.equalsIgnoreCase(name)) {
			return edi_sub_char5();
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
		if ($src_wrk_no.equalsIgnoreCase(name)) {
			return src_wrk_no();
		}
		if ($zoho_sls_schd_no.equalsIgnoreCase(name)) {
			return zoho_sls_schd_no();
		}
		if ($prod_itm_cd.equalsIgnoreCase(name)) {
			return prod_itm_cd();
		}
		if ($prod_itm_sub1.equalsIgnoreCase(name)) {
			return prod_itm_sub1();
		}
		if ($prod_itm_sub2.equalsIgnoreCase(name)) {
			return prod_itm_sub2();
		}
		if ($prod_itm_sub3.equalsIgnoreCase(name)) {
			return prod_itm_sub3();
		}
		if ($prod_itm_nm.equalsIgnoreCase(name)) {
			return prod_itm_nm();
		}
		if ($surv_line_qty.equalsIgnoreCase(name)) {
			return surv_line_qty();
		}
		if ($diameter.equalsIgnoreCase(name)) {
			return diameter();
		}
		if ($match_key.equalsIgnoreCase(name)) {
			return match_key();
		}
		if ($rcpt_no.equalsIgnoreCase(name)) {
			return rcpt_no();
		}
		if ($appl_doc_no.equalsIgnoreCase(name)) {
			return appl_doc_no();
		}
		if ($dlv_draw_no.equalsIgnoreCase(name)) {
			return dlv_draw_no();
		}
		if ($slo_num_typ.equalsIgnoreCase(name)) {
			return slo_num_typ();
		}
		if ($slo_num.equalsIgnoreCase(name)) {
			return slo_num();
		}
		if ($paint_clr.equalsIgnoreCase(name)) {
			return paint_clr();
		}
		if ($sales_cond.equalsIgnoreCase(name)) {
			return sales_cond();
		}
		if ($ship_sp_instr_typ.equalsIgnoreCase(name)) {
			return ship_sp_instr_typ();
		}
		if ($spec_dlv_note_typ.equalsIgnoreCase(name)) {
			return spec_dlv_note_typ();
		}
		if ($mrkt_cd.equalsIgnoreCase(name)) {
			return mrkt_cd();
		}
		if ($cntry_sign.equalsIgnoreCase(name)) {
			return cntry_sign();
		}
		if ($ves_natl.equalsIgnoreCase(name)) {
			return ves_natl();
		}
		if ($shipyard_cd.equalsIgnoreCase(name)) {
			return shipyard_cd();
		}
		if ($ves_no.equalsIgnoreCase(name)) {
			return ves_no();
		}
		if ($ves_nm.equalsIgnoreCase(name)) {
			return ves_nm();
		}
		if ($tonnage.equalsIgnoreCase(name)) {
			return tonnage();
		}
		if ($ves_typ.equalsIgnoreCase(name)) {
			return ves_typ();
		}
		if ($insp_std.equalsIgnoreCase(name)) {
			return insp_std();
		}
		if ($royalty_psppl.equalsIgnoreCase(name)) {
			return royalty_psppl();
		}
		if ($ins_loc_1.equalsIgnoreCase(name)) {
			return ins_loc_1();
		}
		if ($ins_loc_2.equalsIgnoreCase(name)) {
			return ins_loc_2();
		}
		if ($sfi_no.equalsIgnoreCase(name)) {
			return sfi_no();
		}
		if ($wit_insp_typ.equalsIgnoreCase(name)) {
			return wit_insp_typ();
		}
		if ($equip_typ.equalsIgnoreCase(name)) {
			return equip_typ();
		}
		if ($spec_doc_typ.equalsIgnoreCase(name)) {
			return spec_doc_typ();
		}
		if ($model_jp_en_typ.equalsIgnoreCase(name)) {
			return model_jp_en_typ();
		}
		if ($insp_rep_typ.equalsIgnoreCase(name)) {
			return insp_rep_typ();
		}
		if ($cons_draw_typ.equalsIgnoreCase(name)) {
			return cons_draw_typ();
		}
		if ($const_draw_typ.equalsIgnoreCase(name)) {
			return const_draw_typ();
		}
		if ($comp_draw_typ.equalsIgnoreCase(name)) {
			return comp_draw_typ();
		}
		if ($inst_manual_typ.equalsIgnoreCase(name)) {
			return inst_manual_typ();
		}
		if ($aprv_draw_typ.equalsIgnoreCase(name)) {
			return aprv_draw_typ();
		}
		if ($slo_cng_rsn.equalsIgnoreCase(name)) {
			return slo_cng_rsn();
		}
		if ($frc_rsn_cd.equalsIgnoreCase(name)) {
			return frc_rsn_cd();
		}
		if ($main_draw_no.equalsIgnoreCase(name)) {
			return main_draw_no();
		}
		if ($slo_cmnt_1.equalsIgnoreCase(name)) {
			return slo_cmnt_1();
		}
		if ($slo_cmnt_2.equalsIgnoreCase(name)) {
			return slo_cmnt_2();
		}
		if ($slo_cmnt_3.equalsIgnoreCase(name)) {
			return slo_cmnt_3();
		}
		if ($slo_cmnt_4.equalsIgnoreCase(name)) {
			return slo_cmnt_4();
		}
		if ($slo_cmnt_5.equalsIgnoreCase(name)) {
			return slo_cmnt_5();
		}
		if ($jip_slo_typ.equalsIgnoreCase(name)) {
			return jip_slo_typ();
		}
		if ($jip_cst_cd.equalsIgnoreCase(name)) {
			return jip_cst_cd();
		}
		return super.getString(name);
	}

	public MCNumber getNumber(String name) {
		if ($slo_rev.equalsIgnoreCase(name)) {
			return slo_rev();
		}
		if ($cst_po_rev.equalsIgnoreCase(name)) {
			return cst_po_rev();
		}
		if ($xrate.equalsIgnoreCase(name)) {
			return xrate();
		}
		if ($ptax_xrate.equalsIgnoreCase(name)) {
			return ptax_xrate();
		}
		if ($qtn_rev.equalsIgnoreCase(name)) {
			return qtn_rev();
		}
		if ($adv_bill_amt.equalsIgnoreCase(name)) {
			return adv_bill_amt();
		}
		if ($adv_rcv_amt.equalsIgnoreCase(name)) {
			return adv_rcv_amt();
		}
		if ($cred_upd_amt.equalsIgnoreCase(name)) {
			return cred_upd_amt();
		}
		if ($edi_sub_num1.equalsIgnoreCase(name)) {
			return edi_sub_num1();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		if ($hdr_qty.equalsIgnoreCase(name)) {
			return hdr_qty();
		}
		if ($hdr_amt.equalsIgnoreCase(name)) {
			return hdr_amt();
		}
		if ($royalty_trg_amt.equalsIgnoreCase(name)) {
			return royalty_trg_amt();
		}
		if ($insp_rep_qty.equalsIgnoreCase(name)) {
			return insp_rep_qty();
		}
		if ($cons_draw_qty.equalsIgnoreCase(name)) {
			return cons_draw_qty();
		}
		if ($const_draw_qty.equalsIgnoreCase(name)) {
			return const_draw_qty();
		}
		if ($comp_draw_qty.equalsIgnoreCase(name)) {
			return comp_draw_qty();
		}
		if ($inst_manual_qty.equalsIgnoreCase(name)) {
			return inst_manual_qty();
		}
		if ($aprv_draw_qty.equalsIgnoreCase(name)) {
			return aprv_draw_qty();
		}
		return super.getNumber(name);
	}

	public MCDate getDate(String name) {
		if ($slo_dt.equalsIgnoreCase(name)) {
			return slo_dt();
		}
		if ($etd_dt.equalsIgnoreCase(name)) {
			return etd_dt();
		}
		if ($eta_dt.equalsIgnoreCase(name)) {
			return eta_dt();
		}
		if ($via_schd_dt.equalsIgnoreCase(name)) {
			return via_schd_dt();
		}
		if ($rcpt_dt.equalsIgnoreCase(name)) {
			return rcpt_dt();
		}
		if ($edi_sub_dt1.equalsIgnoreCase(name)) {
			return edi_sub_dt1();
		}
		if ($sls_dt.equalsIgnoreCase(name)) {
			return sls_dt();
		}
		if ($slo_aprv_dt.equalsIgnoreCase(name)) {
			return slo_aprv_dt();
		}
		if ($aprv_dt.equalsIgnoreCase(name)) {
			return aprv_dt();
		}
		if ($ord_dlv_dt.equalsIgnoreCase(name)) {
			return ord_dlv_dt();
		}
		if ($ps_sal_aft_dt.equalsIgnoreCase(name)) {
			return ps_sal_aft_dt();
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
		if ($xrate_inpt_flg.equalsIgnoreCase(name)) {
			return xrate_inpt_flg();
		}
		if ($ptax_xrate_inpt_flg.equalsIgnoreCase(name)) {
			return ptax_xrate_inpt_flg();
		}
		if ($aprv_flg.equalsIgnoreCase(name)) {
			return aprv_flg();
		}
		if ($edi_flg.equalsIgnoreCase(name)) {
			return edi_flg();
		}
		if ($can_flg.equalsIgnoreCase(name)) {
			return can_flg();
		}
		if ($ship_prnt_no_cst_nm_flg.equalsIgnoreCase(name)) {
			return ship_prnt_no_cst_nm_flg();
		}
		if ($slo_last_sls_flg.equalsIgnoreCase(name)) {
			return slo_last_sls_flg();
		}
		if ($src_ship_flg.equalsIgnoreCase(name)) {
			return src_ship_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($slo_no.equalsIgnoreCase(name)) {
			return slo_no();
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			return trd_cd();
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			return trd_ptn_typ();
		}
		if ($slo_typ.equalsIgnoreCase(name)) {
			return slo_typ();
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			return cst_cd();
		}
		if ($cst_po_no.equalsIgnoreCase(name)) {
			return cst_po_no();
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
		if ($iv_no.equalsIgnoreCase(name)) {
			return iv_no();
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
		if ($vssl_flght.equalsIgnoreCase(name)) {
			return vssl_flght();
		}
		if ($load_port_cd.equalsIgnoreCase(name)) {
			return load_port_cd();
		}
		if ($dschrg_port_cd.equalsIgnoreCase(name)) {
			return dschrg_port_cd();
		}
		if ($via_port_cd.equalsIgnoreCase(name)) {
			return via_port_cd();
		}
		if ($assort_typ.equalsIgnoreCase(name)) {
			return assort_typ();
		}
		if ($sls_basis_typ.equalsIgnoreCase(name)) {
			return sls_basis_typ();
		}
		if ($ar_dpt_cd.equalsIgnoreCase(name)) {
			return ar_dpt_cd();
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			return wrk_no();
		}
		if ($rcpt_usr_cd.equalsIgnoreCase(name)) {
			return rcpt_usr_cd();
		}
		if ($trd_rmrks.equalsIgnoreCase(name)) {
			return trd_rmrks();
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			return intr_rmrks();
		}
		if ($cst_po_rmrks.equalsIgnoreCase(name)) {
			return cst_po_rmrks();
		}
		if ($qtn_no.equalsIgnoreCase(name)) {
			return qtn_no();
		}
		if ($adv_ship_ctrl_typ.equalsIgnoreCase(name)) {
			return adv_ship_ctrl_typ();
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
		if ($aprv_no.equalsIgnoreCase(name)) {
			return aprv_no();
		}
		if ($aprv_sts_typ.equalsIgnoreCase(name)) {
			return aprv_sts_typ();
		}
		if ($can_rsn_cd.equalsIgnoreCase(name)) {
			return can_rsn_cd();
		}
		if ($can_rmrks.equalsIgnoreCase(name)) {
			return can_rmrks();
		}
		if ($edi_sub_char1.equalsIgnoreCase(name)) {
			return edi_sub_char1();
		}
		if ($edi_sub_char2.equalsIgnoreCase(name)) {
			return edi_sub_char2();
		}
		if ($edi_sub_char3.equalsIgnoreCase(name)) {
			return edi_sub_char3();
		}
		if ($edi_sub_char4.equalsIgnoreCase(name)) {
			return edi_sub_char4();
		}
		if ($edi_sub_char5.equalsIgnoreCase(name)) {
			return edi_sub_char5();
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
		if ($src_wrk_no.equalsIgnoreCase(name)) {
			return src_wrk_no();
		}
		if ($zoho_sls_schd_no.equalsIgnoreCase(name)) {
			return zoho_sls_schd_no();
		}
		if ($prod_itm_cd.equalsIgnoreCase(name)) {
			return prod_itm_cd();
		}
		if ($prod_itm_sub1.equalsIgnoreCase(name)) {
			return prod_itm_sub1();
		}
		if ($prod_itm_sub2.equalsIgnoreCase(name)) {
			return prod_itm_sub2();
		}
		if ($prod_itm_sub3.equalsIgnoreCase(name)) {
			return prod_itm_sub3();
		}
		if ($prod_itm_nm.equalsIgnoreCase(name)) {
			return prod_itm_nm();
		}
		if ($surv_line_qty.equalsIgnoreCase(name)) {
			return surv_line_qty();
		}
		if ($diameter.equalsIgnoreCase(name)) {
			return diameter();
		}
		if ($match_key.equalsIgnoreCase(name)) {
			return match_key();
		}
		if ($rcpt_no.equalsIgnoreCase(name)) {
			return rcpt_no();
		}
		if ($appl_doc_no.equalsIgnoreCase(name)) {
			return appl_doc_no();
		}
		if ($dlv_draw_no.equalsIgnoreCase(name)) {
			return dlv_draw_no();
		}
		if ($slo_num_typ.equalsIgnoreCase(name)) {
			return slo_num_typ();
		}
		if ($slo_num.equalsIgnoreCase(name)) {
			return slo_num();
		}
		if ($paint_clr.equalsIgnoreCase(name)) {
			return paint_clr();
		}
		if ($sales_cond.equalsIgnoreCase(name)) {
			return sales_cond();
		}
		if ($ship_sp_instr_typ.equalsIgnoreCase(name)) {
			return ship_sp_instr_typ();
		}
		if ($spec_dlv_note_typ.equalsIgnoreCase(name)) {
			return spec_dlv_note_typ();
		}
		if ($mrkt_cd.equalsIgnoreCase(name)) {
			return mrkt_cd();
		}
		if ($cntry_sign.equalsIgnoreCase(name)) {
			return cntry_sign();
		}
		if ($ves_natl.equalsIgnoreCase(name)) {
			return ves_natl();
		}
		if ($shipyard_cd.equalsIgnoreCase(name)) {
			return shipyard_cd();
		}
		if ($ves_no.equalsIgnoreCase(name)) {
			return ves_no();
		}
		if ($ves_nm.equalsIgnoreCase(name)) {
			return ves_nm();
		}
		if ($tonnage.equalsIgnoreCase(name)) {
			return tonnage();
		}
		if ($ves_typ.equalsIgnoreCase(name)) {
			return ves_typ();
		}
		if ($insp_std.equalsIgnoreCase(name)) {
			return insp_std();
		}
		if ($royalty_psppl.equalsIgnoreCase(name)) {
			return royalty_psppl();
		}
		if ($ins_loc_1.equalsIgnoreCase(name)) {
			return ins_loc_1();
		}
		if ($ins_loc_2.equalsIgnoreCase(name)) {
			return ins_loc_2();
		}
		if ($sfi_no.equalsIgnoreCase(name)) {
			return sfi_no();
		}
		if ($wit_insp_typ.equalsIgnoreCase(name)) {
			return wit_insp_typ();
		}
		if ($equip_typ.equalsIgnoreCase(name)) {
			return equip_typ();
		}
		if ($spec_doc_typ.equalsIgnoreCase(name)) {
			return spec_doc_typ();
		}
		if ($model_jp_en_typ.equalsIgnoreCase(name)) {
			return model_jp_en_typ();
		}
		if ($insp_rep_typ.equalsIgnoreCase(name)) {
			return insp_rep_typ();
		}
		if ($cons_draw_typ.equalsIgnoreCase(name)) {
			return cons_draw_typ();
		}
		if ($const_draw_typ.equalsIgnoreCase(name)) {
			return const_draw_typ();
		}
		if ($comp_draw_typ.equalsIgnoreCase(name)) {
			return comp_draw_typ();
		}
		if ($inst_manual_typ.equalsIgnoreCase(name)) {
			return inst_manual_typ();
		}
		if ($aprv_draw_typ.equalsIgnoreCase(name)) {
			return aprv_draw_typ();
		}
		if ($slo_cng_rsn.equalsIgnoreCase(name)) {
			return slo_cng_rsn();
		}
		if ($frc_rsn_cd.equalsIgnoreCase(name)) {
			return frc_rsn_cd();
		}
		if ($main_draw_no.equalsIgnoreCase(name)) {
			return main_draw_no();
		}
		if ($slo_cmnt_1.equalsIgnoreCase(name)) {
			return slo_cmnt_1();
		}
		if ($slo_cmnt_2.equalsIgnoreCase(name)) {
			return slo_cmnt_2();
		}
		if ($slo_cmnt_3.equalsIgnoreCase(name)) {
			return slo_cmnt_3();
		}
		if ($slo_cmnt_4.equalsIgnoreCase(name)) {
			return slo_cmnt_4();
		}
		if ($slo_cmnt_5.equalsIgnoreCase(name)) {
			return slo_cmnt_5();
		}
		if ($jip_slo_typ.equalsIgnoreCase(name)) {
			return jip_slo_typ();
		}
		if ($jip_cst_cd.equalsIgnoreCase(name)) {
			return jip_cst_cd();
		}
		return super.getStringNE(name);
	}

	public MCNumber getNumberNE(String name) {
		if ($slo_rev.equalsIgnoreCase(name)) {
			return slo_rev();
		}
		if ($cst_po_rev.equalsIgnoreCase(name)) {
			return cst_po_rev();
		}
		if ($xrate.equalsIgnoreCase(name)) {
			return xrate();
		}
		if ($ptax_xrate.equalsIgnoreCase(name)) {
			return ptax_xrate();
		}
		if ($qtn_rev.equalsIgnoreCase(name)) {
			return qtn_rev();
		}
		if ($adv_bill_amt.equalsIgnoreCase(name)) {
			return adv_bill_amt();
		}
		if ($adv_rcv_amt.equalsIgnoreCase(name)) {
			return adv_rcv_amt();
		}
		if ($cred_upd_amt.equalsIgnoreCase(name)) {
			return cred_upd_amt();
		}
		if ($edi_sub_num1.equalsIgnoreCase(name)) {
			return edi_sub_num1();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		if ($hdr_qty.equalsIgnoreCase(name)) {
			return hdr_qty();
		}
		if ($hdr_amt.equalsIgnoreCase(name)) {
			return hdr_amt();
		}
		if ($royalty_trg_amt.equalsIgnoreCase(name)) {
			return royalty_trg_amt();
		}
		if ($insp_rep_qty.equalsIgnoreCase(name)) {
			return insp_rep_qty();
		}
		if ($cons_draw_qty.equalsIgnoreCase(name)) {
			return cons_draw_qty();
		}
		if ($const_draw_qty.equalsIgnoreCase(name)) {
			return const_draw_qty();
		}
		if ($comp_draw_qty.equalsIgnoreCase(name)) {
			return comp_draw_qty();
		}
		if ($inst_manual_qty.equalsIgnoreCase(name)) {
			return inst_manual_qty();
		}
		if ($aprv_draw_qty.equalsIgnoreCase(name)) {
			return aprv_draw_qty();
		}
		return super.getNumberNE(name);
	}

	public MCDate getDateNE(String name) {
		if ($slo_dt.equalsIgnoreCase(name)) {
			return slo_dt();
		}
		if ($etd_dt.equalsIgnoreCase(name)) {
			return etd_dt();
		}
		if ($eta_dt.equalsIgnoreCase(name)) {
			return eta_dt();
		}
		if ($via_schd_dt.equalsIgnoreCase(name)) {
			return via_schd_dt();
		}
		if ($rcpt_dt.equalsIgnoreCase(name)) {
			return rcpt_dt();
		}
		if ($edi_sub_dt1.equalsIgnoreCase(name)) {
			return edi_sub_dt1();
		}
		if ($sls_dt.equalsIgnoreCase(name)) {
			return sls_dt();
		}
		if ($slo_aprv_dt.equalsIgnoreCase(name)) {
			return slo_aprv_dt();
		}
		if ($aprv_dt.equalsIgnoreCase(name)) {
			return aprv_dt();
		}
		if ($ord_dlv_dt.equalsIgnoreCase(name)) {
			return ord_dlv_dt();
		}
		if ($ps_sal_aft_dt.equalsIgnoreCase(name)) {
			return ps_sal_aft_dt();
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
		if ($xrate_inpt_flg.equalsIgnoreCase(name)) {
			return xrate_inpt_flg();
		}
		if ($ptax_xrate_inpt_flg.equalsIgnoreCase(name)) {
			return ptax_xrate_inpt_flg();
		}
		if ($aprv_flg.equalsIgnoreCase(name)) {
			return aprv_flg();
		}
		if ($edi_flg.equalsIgnoreCase(name)) {
			return edi_flg();
		}
		if ($can_flg.equalsIgnoreCase(name)) {
			return can_flg();
		}
		if ($ship_prnt_no_cst_nm_flg.equalsIgnoreCase(name)) {
			return ship_prnt_no_cst_nm_flg();
		}
		if ($slo_last_sls_flg.equalsIgnoreCase(name)) {
			return slo_last_sls_flg();
		}
		if ($src_ship_flg.equalsIgnoreCase(name)) {
			return src_ship_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($slo_no.equalsIgnoreCase(name)) {
			slo_no(value);
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
		if ($slo_typ.equalsIgnoreCase(name)) {
			slo_typ(value);
			return;
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			cst_cd(value);
			return;
		}
		if ($cst_po_no.equalsIgnoreCase(name)) {
			cst_po_no(value);
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
		if ($iv_no.equalsIgnoreCase(name)) {
			iv_no(value);
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
		if ($vssl_flght.equalsIgnoreCase(name)) {
			vssl_flght(value);
			return;
		}
		if ($load_port_cd.equalsIgnoreCase(name)) {
			load_port_cd(value);
			return;
		}
		if ($dschrg_port_cd.equalsIgnoreCase(name)) {
			dschrg_port_cd(value);
			return;
		}
		if ($via_port_cd.equalsIgnoreCase(name)) {
			via_port_cd(value);
			return;
		}
		if ($assort_typ.equalsIgnoreCase(name)) {
			assort_typ(value);
			return;
		}
		if ($sls_basis_typ.equalsIgnoreCase(name)) {
			sls_basis_typ(value);
			return;
		}
		if ($ar_dpt_cd.equalsIgnoreCase(name)) {
			ar_dpt_cd(value);
			return;
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			wrk_no(value);
			return;
		}
		if ($rcpt_usr_cd.equalsIgnoreCase(name)) {
			rcpt_usr_cd(value);
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
		if ($cst_po_rmrks.equalsIgnoreCase(name)) {
			cst_po_rmrks(value);
			return;
		}
		if ($qtn_no.equalsIgnoreCase(name)) {
			qtn_no(value);
			return;
		}
		if ($adv_ship_ctrl_typ.equalsIgnoreCase(name)) {
			adv_ship_ctrl_typ(value);
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
		if ($aprv_no.equalsIgnoreCase(name)) {
			aprv_no(value);
			return;
		}
		if ($aprv_sts_typ.equalsIgnoreCase(name)) {
			aprv_sts_typ(value);
			return;
		}
		if ($can_rsn_cd.equalsIgnoreCase(name)) {
			can_rsn_cd(value);
			return;
		}
		if ($can_rmrks.equalsIgnoreCase(name)) {
			can_rmrks(value);
			return;
		}
		if ($edi_sub_char1.equalsIgnoreCase(name)) {
			edi_sub_char1(value);
			return;
		}
		if ($edi_sub_char2.equalsIgnoreCase(name)) {
			edi_sub_char2(value);
			return;
		}
		if ($edi_sub_char3.equalsIgnoreCase(name)) {
			edi_sub_char3(value);
			return;
		}
		if ($edi_sub_char4.equalsIgnoreCase(name)) {
			edi_sub_char4(value);
			return;
		}
		if ($edi_sub_char5.equalsIgnoreCase(name)) {
			edi_sub_char5(value);
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
		if ($src_wrk_no.equalsIgnoreCase(name)) {
			src_wrk_no(value);
			return;
		}
		if ($zoho_sls_schd_no.equalsIgnoreCase(name)) {
			zoho_sls_schd_no(value);
			return;
		}
		if ($prod_itm_cd.equalsIgnoreCase(name)) {
			prod_itm_cd(value);
			return;
		}
		if ($prod_itm_sub1.equalsIgnoreCase(name)) {
			prod_itm_sub1(value);
			return;
		}
		if ($prod_itm_sub2.equalsIgnoreCase(name)) {
			prod_itm_sub2(value);
			return;
		}
		if ($prod_itm_sub3.equalsIgnoreCase(name)) {
			prod_itm_sub3(value);
			return;
		}
		if ($prod_itm_nm.equalsIgnoreCase(name)) {
			prod_itm_nm(value);
			return;
		}
		if ($surv_line_qty.equalsIgnoreCase(name)) {
			surv_line_qty(value);
			return;
		}
		if ($diameter.equalsIgnoreCase(name)) {
			diameter(value);
			return;
		}
		if ($match_key.equalsIgnoreCase(name)) {
			match_key(value);
			return;
		}
		if ($rcpt_no.equalsIgnoreCase(name)) {
			rcpt_no(value);
			return;
		}
		if ($appl_doc_no.equalsIgnoreCase(name)) {
			appl_doc_no(value);
			return;
		}
		if ($dlv_draw_no.equalsIgnoreCase(name)) {
			dlv_draw_no(value);
			return;
		}
		if ($slo_num_typ.equalsIgnoreCase(name)) {
			slo_num_typ(value);
			return;
		}
		if ($slo_num.equalsIgnoreCase(name)) {
			slo_num(value);
			return;
		}
		if ($paint_clr.equalsIgnoreCase(name)) {
			paint_clr(value);
			return;
		}
		if ($sales_cond.equalsIgnoreCase(name)) {
			sales_cond(value);
			return;
		}
		if ($ship_sp_instr_typ.equalsIgnoreCase(name)) {
			ship_sp_instr_typ(value);
			return;
		}
		if ($spec_dlv_note_typ.equalsIgnoreCase(name)) {
			spec_dlv_note_typ(value);
			return;
		}
		if ($mrkt_cd.equalsIgnoreCase(name)) {
			mrkt_cd(value);
			return;
		}
		if ($cntry_sign.equalsIgnoreCase(name)) {
			cntry_sign(value);
			return;
		}
		if ($ves_natl.equalsIgnoreCase(name)) {
			ves_natl(value);
			return;
		}
		if ($shipyard_cd.equalsIgnoreCase(name)) {
			shipyard_cd(value);
			return;
		}
		if ($ves_no.equalsIgnoreCase(name)) {
			ves_no(value);
			return;
		}
		if ($ves_nm.equalsIgnoreCase(name)) {
			ves_nm(value);
			return;
		}
		if ($tonnage.equalsIgnoreCase(name)) {
			tonnage(value);
			return;
		}
		if ($ves_typ.equalsIgnoreCase(name)) {
			ves_typ(value);
			return;
		}
		if ($insp_std.equalsIgnoreCase(name)) {
			insp_std(value);
			return;
		}
		if ($royalty_psppl.equalsIgnoreCase(name)) {
			royalty_psppl(value);
			return;
		}
		if ($ins_loc_1.equalsIgnoreCase(name)) {
			ins_loc_1(value);
			return;
		}
		if ($ins_loc_2.equalsIgnoreCase(name)) {
			ins_loc_2(value);
			return;
		}
		if ($sfi_no.equalsIgnoreCase(name)) {
			sfi_no(value);
			return;
		}
		if ($wit_insp_typ.equalsIgnoreCase(name)) {
			wit_insp_typ(value);
			return;
		}
		if ($equip_typ.equalsIgnoreCase(name)) {
			equip_typ(value);
			return;
		}
		if ($spec_doc_typ.equalsIgnoreCase(name)) {
			spec_doc_typ(value);
			return;
		}
		if ($model_jp_en_typ.equalsIgnoreCase(name)) {
			model_jp_en_typ(value);
			return;
		}
		if ($insp_rep_typ.equalsIgnoreCase(name)) {
			insp_rep_typ(value);
			return;
		}
		if ($cons_draw_typ.equalsIgnoreCase(name)) {
			cons_draw_typ(value);
			return;
		}
		if ($const_draw_typ.equalsIgnoreCase(name)) {
			const_draw_typ(value);
			return;
		}
		if ($comp_draw_typ.equalsIgnoreCase(name)) {
			comp_draw_typ(value);
			return;
		}
		if ($inst_manual_typ.equalsIgnoreCase(name)) {
			inst_manual_typ(value);
			return;
		}
		if ($aprv_draw_typ.equalsIgnoreCase(name)) {
			aprv_draw_typ(value);
			return;
		}
		if ($slo_cng_rsn.equalsIgnoreCase(name)) {
			slo_cng_rsn(value);
			return;
		}
		if ($frc_rsn_cd.equalsIgnoreCase(name)) {
			frc_rsn_cd(value);
			return;
		}
		if ($main_draw_no.equalsIgnoreCase(name)) {
			main_draw_no(value);
			return;
		}
		if ($slo_cmnt_1.equalsIgnoreCase(name)) {
			slo_cmnt_1(value);
			return;
		}
		if ($slo_cmnt_2.equalsIgnoreCase(name)) {
			slo_cmnt_2(value);
			return;
		}
		if ($slo_cmnt_3.equalsIgnoreCase(name)) {
			slo_cmnt_3(value);
			return;
		}
		if ($slo_cmnt_4.equalsIgnoreCase(name)) {
			slo_cmnt_4(value);
			return;
		}
		if ($slo_cmnt_5.equalsIgnoreCase(name)) {
			slo_cmnt_5(value);
			return;
		}
		if ($jip_slo_typ.equalsIgnoreCase(name)) {
			jip_slo_typ(value);
			return;
		}
		if ($jip_cst_cd.equalsIgnoreCase(name)) {
			jip_cst_cd(value);
			return;
		}
		super.setString(name, value);
	}

	public void setNumber(String name, MCNumber value) {
		if ($slo_rev.equalsIgnoreCase(name)) {
			slo_rev(value);
			return;
		}
		if ($cst_po_rev.equalsIgnoreCase(name)) {
			cst_po_rev(value);
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
		if ($qtn_rev.equalsIgnoreCase(name)) {
			qtn_rev(value);
			return;
		}
		if ($adv_bill_amt.equalsIgnoreCase(name)) {
			adv_bill_amt(value);
			return;
		}
		if ($adv_rcv_amt.equalsIgnoreCase(name)) {
			adv_rcv_amt(value);
			return;
		}
		if ($cred_upd_amt.equalsIgnoreCase(name)) {
			cred_upd_amt(value);
			return;
		}
		if ($edi_sub_num1.equalsIgnoreCase(name)) {
			edi_sub_num1(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		if ($hdr_qty.equalsIgnoreCase(name)) {
			hdr_qty(value);
			return;
		}
		if ($hdr_amt.equalsIgnoreCase(name)) {
			hdr_amt(value);
			return;
		}
		if ($royalty_trg_amt.equalsIgnoreCase(name)) {
			royalty_trg_amt(value);
			return;
		}
		if ($insp_rep_qty.equalsIgnoreCase(name)) {
			insp_rep_qty(value);
			return;
		}
		if ($cons_draw_qty.equalsIgnoreCase(name)) {
			cons_draw_qty(value);
			return;
		}
		if ($const_draw_qty.equalsIgnoreCase(name)) {
			const_draw_qty(value);
			return;
		}
		if ($comp_draw_qty.equalsIgnoreCase(name)) {
			comp_draw_qty(value);
			return;
		}
		if ($inst_manual_qty.equalsIgnoreCase(name)) {
			inst_manual_qty(value);
			return;
		}
		if ($aprv_draw_qty.equalsIgnoreCase(name)) {
			aprv_draw_qty(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, int value) {
		if ($slo_rev.equalsIgnoreCase(name)) {
			slo_rev(value);
			return;
		}
		if ($cst_po_rev.equalsIgnoreCase(name)) {
			cst_po_rev(value);
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
		if ($qtn_rev.equalsIgnoreCase(name)) {
			qtn_rev(value);
			return;
		}
		if ($adv_bill_amt.equalsIgnoreCase(name)) {
			adv_bill_amt(value);
			return;
		}
		if ($adv_rcv_amt.equalsIgnoreCase(name)) {
			adv_rcv_amt(value);
			return;
		}
		if ($cred_upd_amt.equalsIgnoreCase(name)) {
			cred_upd_amt(value);
			return;
		}
		if ($edi_sub_num1.equalsIgnoreCase(name)) {
			edi_sub_num1(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		if ($hdr_qty.equalsIgnoreCase(name)) {
			hdr_qty(value);
			return;
		}
		if ($hdr_amt.equalsIgnoreCase(name)) {
			hdr_amt(value);
			return;
		}
		if ($royalty_trg_amt.equalsIgnoreCase(name)) {
			royalty_trg_amt(value);
			return;
		}
		if ($insp_rep_qty.equalsIgnoreCase(name)) {
			insp_rep_qty(value);
			return;
		}
		if ($cons_draw_qty.equalsIgnoreCase(name)) {
			cons_draw_qty(value);
			return;
		}
		if ($const_draw_qty.equalsIgnoreCase(name)) {
			const_draw_qty(value);
			return;
		}
		if ($comp_draw_qty.equalsIgnoreCase(name)) {
			comp_draw_qty(value);
			return;
		}
		if ($inst_manual_qty.equalsIgnoreCase(name)) {
			inst_manual_qty(value);
			return;
		}
		if ($aprv_draw_qty.equalsIgnoreCase(name)) {
			aprv_draw_qty(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, long value) {
		if ($slo_rev.equalsIgnoreCase(name)) {
			slo_rev(value);
			return;
		}
		if ($cst_po_rev.equalsIgnoreCase(name)) {
			cst_po_rev(value);
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
		if ($qtn_rev.equalsIgnoreCase(name)) {
			qtn_rev(value);
			return;
		}
		if ($adv_bill_amt.equalsIgnoreCase(name)) {
			adv_bill_amt(value);
			return;
		}
		if ($adv_rcv_amt.equalsIgnoreCase(name)) {
			adv_rcv_amt(value);
			return;
		}
		if ($cred_upd_amt.equalsIgnoreCase(name)) {
			cred_upd_amt(value);
			return;
		}
		if ($edi_sub_num1.equalsIgnoreCase(name)) {
			edi_sub_num1(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		if ($hdr_qty.equalsIgnoreCase(name)) {
			hdr_qty(value);
			return;
		}
		if ($hdr_amt.equalsIgnoreCase(name)) {
			hdr_amt(value);
			return;
		}
		if ($royalty_trg_amt.equalsIgnoreCase(name)) {
			royalty_trg_amt(value);
			return;
		}
		if ($insp_rep_qty.equalsIgnoreCase(name)) {
			insp_rep_qty(value);
			return;
		}
		if ($cons_draw_qty.equalsIgnoreCase(name)) {
			cons_draw_qty(value);
			return;
		}
		if ($const_draw_qty.equalsIgnoreCase(name)) {
			const_draw_qty(value);
			return;
		}
		if ($comp_draw_qty.equalsIgnoreCase(name)) {
			comp_draw_qty(value);
			return;
		}
		if ($inst_manual_qty.equalsIgnoreCase(name)) {
			inst_manual_qty(value);
			return;
		}
		if ($aprv_draw_qty.equalsIgnoreCase(name)) {
			aprv_draw_qty(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, float value) {
		if ($slo_rev.equalsIgnoreCase(name)) {
			slo_rev(value);
			return;
		}
		if ($cst_po_rev.equalsIgnoreCase(name)) {
			cst_po_rev(value);
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
		if ($qtn_rev.equalsIgnoreCase(name)) {
			qtn_rev(value);
			return;
		}
		if ($adv_bill_amt.equalsIgnoreCase(name)) {
			adv_bill_amt(value);
			return;
		}
		if ($adv_rcv_amt.equalsIgnoreCase(name)) {
			adv_rcv_amt(value);
			return;
		}
		if ($cred_upd_amt.equalsIgnoreCase(name)) {
			cred_upd_amt(value);
			return;
		}
		if ($edi_sub_num1.equalsIgnoreCase(name)) {
			edi_sub_num1(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		if ($hdr_qty.equalsIgnoreCase(name)) {
			hdr_qty(value);
			return;
		}
		if ($hdr_amt.equalsIgnoreCase(name)) {
			hdr_amt(value);
			return;
		}
		if ($royalty_trg_amt.equalsIgnoreCase(name)) {
			royalty_trg_amt(value);
			return;
		}
		if ($insp_rep_qty.equalsIgnoreCase(name)) {
			insp_rep_qty(value);
			return;
		}
		if ($cons_draw_qty.equalsIgnoreCase(name)) {
			cons_draw_qty(value);
			return;
		}
		if ($const_draw_qty.equalsIgnoreCase(name)) {
			const_draw_qty(value);
			return;
		}
		if ($comp_draw_qty.equalsIgnoreCase(name)) {
			comp_draw_qty(value);
			return;
		}
		if ($inst_manual_qty.equalsIgnoreCase(name)) {
			inst_manual_qty(value);
			return;
		}
		if ($aprv_draw_qty.equalsIgnoreCase(name)) {
			aprv_draw_qty(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, double value) {
		if ($slo_rev.equalsIgnoreCase(name)) {
			slo_rev(value);
			return;
		}
		if ($cst_po_rev.equalsIgnoreCase(name)) {
			cst_po_rev(value);
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
		if ($qtn_rev.equalsIgnoreCase(name)) {
			qtn_rev(value);
			return;
		}
		if ($adv_bill_amt.equalsIgnoreCase(name)) {
			adv_bill_amt(value);
			return;
		}
		if ($adv_rcv_amt.equalsIgnoreCase(name)) {
			adv_rcv_amt(value);
			return;
		}
		if ($cred_upd_amt.equalsIgnoreCase(name)) {
			cred_upd_amt(value);
			return;
		}
		if ($edi_sub_num1.equalsIgnoreCase(name)) {
			edi_sub_num1(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		if ($hdr_qty.equalsIgnoreCase(name)) {
			hdr_qty(value);
			return;
		}
		if ($hdr_amt.equalsIgnoreCase(name)) {
			hdr_amt(value);
			return;
		}
		if ($royalty_trg_amt.equalsIgnoreCase(name)) {
			royalty_trg_amt(value);
			return;
		}
		if ($insp_rep_qty.equalsIgnoreCase(name)) {
			insp_rep_qty(value);
			return;
		}
		if ($cons_draw_qty.equalsIgnoreCase(name)) {
			cons_draw_qty(value);
			return;
		}
		if ($const_draw_qty.equalsIgnoreCase(name)) {
			const_draw_qty(value);
			return;
		}
		if ($comp_draw_qty.equalsIgnoreCase(name)) {
			comp_draw_qty(value);
			return;
		}
		if ($inst_manual_qty.equalsIgnoreCase(name)) {
			inst_manual_qty(value);
			return;
		}
		if ($aprv_draw_qty.equalsIgnoreCase(name)) {
			aprv_draw_qty(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setDate(String name, MCDate value) {
		if ($slo_dt.equalsIgnoreCase(name)) {
			slo_dt(value);
			return;
		}
		if ($etd_dt.equalsIgnoreCase(name)) {
			etd_dt(value);
			return;
		}
		if ($eta_dt.equalsIgnoreCase(name)) {
			eta_dt(value);
			return;
		}
		if ($via_schd_dt.equalsIgnoreCase(name)) {
			via_schd_dt(value);
			return;
		}
		if ($rcpt_dt.equalsIgnoreCase(name)) {
			rcpt_dt(value);
			return;
		}
		if ($edi_sub_dt1.equalsIgnoreCase(name)) {
			edi_sub_dt1(value);
			return;
		}
		if ($sls_dt.equalsIgnoreCase(name)) {
			sls_dt(value);
			return;
		}
		if ($slo_aprv_dt.equalsIgnoreCase(name)) {
			slo_aprv_dt(value);
			return;
		}
		if ($aprv_dt.equalsIgnoreCase(name)) {
			aprv_dt(value);
			return;
		}
		if ($ord_dlv_dt.equalsIgnoreCase(name)) {
			ord_dlv_dt(value);
			return;
		}
		if ($ps_sal_aft_dt.equalsIgnoreCase(name)) {
			ps_sal_aft_dt(value);
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
		if ($xrate_inpt_flg.equalsIgnoreCase(name)) {
			xrate_inpt_flg(value);
			return;
		}
		if ($ptax_xrate_inpt_flg.equalsIgnoreCase(name)) {
			ptax_xrate_inpt_flg(value);
			return;
		}
		if ($aprv_flg.equalsIgnoreCase(name)) {
			aprv_flg(value);
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
		if ($ship_prnt_no_cst_nm_flg.equalsIgnoreCase(name)) {
			ship_prnt_no_cst_nm_flg(value);
			return;
		}
		if ($slo_last_sls_flg.equalsIgnoreCase(name)) {
			slo_last_sls_flg(value);
			return;
		}
		if ($src_ship_flg.equalsIgnoreCase(name)) {
			src_ship_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($slo_no.equalsIgnoreCase(name)) {
			slo_no(value);
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
		if ($slo_typ.equalsIgnoreCase(name)) {
			slo_typ(value);
			return;
		}
		if ($cst_cd.equalsIgnoreCase(name)) {
			cst_cd(value);
			return;
		}
		if ($cst_po_no.equalsIgnoreCase(name)) {
			cst_po_no(value);
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
		if ($iv_no.equalsIgnoreCase(name)) {
			iv_no(value);
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
		if ($vssl_flght.equalsIgnoreCase(name)) {
			vssl_flght(value);
			return;
		}
		if ($load_port_cd.equalsIgnoreCase(name)) {
			load_port_cd(value);
			return;
		}
		if ($dschrg_port_cd.equalsIgnoreCase(name)) {
			dschrg_port_cd(value);
			return;
		}
		if ($via_port_cd.equalsIgnoreCase(name)) {
			via_port_cd(value);
			return;
		}
		if ($assort_typ.equalsIgnoreCase(name)) {
			assort_typ(value);
			return;
		}
		if ($sls_basis_typ.equalsIgnoreCase(name)) {
			sls_basis_typ(value);
			return;
		}
		if ($ar_dpt_cd.equalsIgnoreCase(name)) {
			ar_dpt_cd(value);
			return;
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			wrk_no(value);
			return;
		}
		if ($rcpt_usr_cd.equalsIgnoreCase(name)) {
			rcpt_usr_cd(value);
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
		if ($cst_po_rmrks.equalsIgnoreCase(name)) {
			cst_po_rmrks(value);
			return;
		}
		if ($qtn_no.equalsIgnoreCase(name)) {
			qtn_no(value);
			return;
		}
		if ($adv_ship_ctrl_typ.equalsIgnoreCase(name)) {
			adv_ship_ctrl_typ(value);
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
		if ($aprv_no.equalsIgnoreCase(name)) {
			aprv_no(value);
			return;
		}
		if ($aprv_sts_typ.equalsIgnoreCase(name)) {
			aprv_sts_typ(value);
			return;
		}
		if ($can_rsn_cd.equalsIgnoreCase(name)) {
			can_rsn_cd(value);
			return;
		}
		if ($can_rmrks.equalsIgnoreCase(name)) {
			can_rmrks(value);
			return;
		}
		if ($edi_sub_char1.equalsIgnoreCase(name)) {
			edi_sub_char1(value);
			return;
		}
		if ($edi_sub_char2.equalsIgnoreCase(name)) {
			edi_sub_char2(value);
			return;
		}
		if ($edi_sub_char3.equalsIgnoreCase(name)) {
			edi_sub_char3(value);
			return;
		}
		if ($edi_sub_char4.equalsIgnoreCase(name)) {
			edi_sub_char4(value);
			return;
		}
		if ($edi_sub_char5.equalsIgnoreCase(name)) {
			edi_sub_char5(value);
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
		if ($src_wrk_no.equalsIgnoreCase(name)) {
			src_wrk_no(value);
			return;
		}
		if ($zoho_sls_schd_no.equalsIgnoreCase(name)) {
			zoho_sls_schd_no(value);
			return;
		}
		if ($prod_itm_cd.equalsIgnoreCase(name)) {
			prod_itm_cd(value);
			return;
		}
		if ($prod_itm_sub1.equalsIgnoreCase(name)) {
			prod_itm_sub1(value);
			return;
		}
		if ($prod_itm_sub2.equalsIgnoreCase(name)) {
			prod_itm_sub2(value);
			return;
		}
		if ($prod_itm_sub3.equalsIgnoreCase(name)) {
			prod_itm_sub3(value);
			return;
		}
		if ($prod_itm_nm.equalsIgnoreCase(name)) {
			prod_itm_nm(value);
			return;
		}
		if ($surv_line_qty.equalsIgnoreCase(name)) {
			surv_line_qty(value);
			return;
		}
		if ($diameter.equalsIgnoreCase(name)) {
			diameter(value);
			return;
		}
		if ($match_key.equalsIgnoreCase(name)) {
			match_key(value);
			return;
		}
		if ($rcpt_no.equalsIgnoreCase(name)) {
			rcpt_no(value);
			return;
		}
		if ($appl_doc_no.equalsIgnoreCase(name)) {
			appl_doc_no(value);
			return;
		}
		if ($dlv_draw_no.equalsIgnoreCase(name)) {
			dlv_draw_no(value);
			return;
		}
		if ($slo_num_typ.equalsIgnoreCase(name)) {
			slo_num_typ(value);
			return;
		}
		if ($slo_num.equalsIgnoreCase(name)) {
			slo_num(value);
			return;
		}
		if ($paint_clr.equalsIgnoreCase(name)) {
			paint_clr(value);
			return;
		}
		if ($sales_cond.equalsIgnoreCase(name)) {
			sales_cond(value);
			return;
		}
		if ($ship_sp_instr_typ.equalsIgnoreCase(name)) {
			ship_sp_instr_typ(value);
			return;
		}
		if ($spec_dlv_note_typ.equalsIgnoreCase(name)) {
			spec_dlv_note_typ(value);
			return;
		}
		if ($mrkt_cd.equalsIgnoreCase(name)) {
			mrkt_cd(value);
			return;
		}
		if ($cntry_sign.equalsIgnoreCase(name)) {
			cntry_sign(value);
			return;
		}
		if ($ves_natl.equalsIgnoreCase(name)) {
			ves_natl(value);
			return;
		}
		if ($shipyard_cd.equalsIgnoreCase(name)) {
			shipyard_cd(value);
			return;
		}
		if ($ves_no.equalsIgnoreCase(name)) {
			ves_no(value);
			return;
		}
		if ($ves_nm.equalsIgnoreCase(name)) {
			ves_nm(value);
			return;
		}
		if ($tonnage.equalsIgnoreCase(name)) {
			tonnage(value);
			return;
		}
		if ($ves_typ.equalsIgnoreCase(name)) {
			ves_typ(value);
			return;
		}
		if ($insp_std.equalsIgnoreCase(name)) {
			insp_std(value);
			return;
		}
		if ($royalty_psppl.equalsIgnoreCase(name)) {
			royalty_psppl(value);
			return;
		}
		if ($ins_loc_1.equalsIgnoreCase(name)) {
			ins_loc_1(value);
			return;
		}
		if ($ins_loc_2.equalsIgnoreCase(name)) {
			ins_loc_2(value);
			return;
		}
		if ($sfi_no.equalsIgnoreCase(name)) {
			sfi_no(value);
			return;
		}
		if ($wit_insp_typ.equalsIgnoreCase(name)) {
			wit_insp_typ(value);
			return;
		}
		if ($equip_typ.equalsIgnoreCase(name)) {
			equip_typ(value);
			return;
		}
		if ($spec_doc_typ.equalsIgnoreCase(name)) {
			spec_doc_typ(value);
			return;
		}
		if ($model_jp_en_typ.equalsIgnoreCase(name)) {
			model_jp_en_typ(value);
			return;
		}
		if ($insp_rep_typ.equalsIgnoreCase(name)) {
			insp_rep_typ(value);
			return;
		}
		if ($cons_draw_typ.equalsIgnoreCase(name)) {
			cons_draw_typ(value);
			return;
		}
		if ($const_draw_typ.equalsIgnoreCase(name)) {
			const_draw_typ(value);
			return;
		}
		if ($comp_draw_typ.equalsIgnoreCase(name)) {
			comp_draw_typ(value);
			return;
		}
		if ($inst_manual_typ.equalsIgnoreCase(name)) {
			inst_manual_typ(value);
			return;
		}
		if ($aprv_draw_typ.equalsIgnoreCase(name)) {
			aprv_draw_typ(value);
			return;
		}
		if ($slo_cng_rsn.equalsIgnoreCase(name)) {
			slo_cng_rsn(value);
			return;
		}
		if ($frc_rsn_cd.equalsIgnoreCase(name)) {
			frc_rsn_cd(value);
			return;
		}
		if ($main_draw_no.equalsIgnoreCase(name)) {
			main_draw_no(value);
			return;
		}
		if ($slo_cmnt_1.equalsIgnoreCase(name)) {
			slo_cmnt_1(value);
			return;
		}
		if ($slo_cmnt_2.equalsIgnoreCase(name)) {
			slo_cmnt_2(value);
			return;
		}
		if ($slo_cmnt_3.equalsIgnoreCase(name)) {
			slo_cmnt_3(value);
			return;
		}
		if ($slo_cmnt_4.equalsIgnoreCase(name)) {
			slo_cmnt_4(value);
			return;
		}
		if ($slo_cmnt_5.equalsIgnoreCase(name)) {
			slo_cmnt_5(value);
			return;
		}
		if ($jip_slo_typ.equalsIgnoreCase(name)) {
			jip_slo_typ(value);
			return;
		}
		if ($jip_cst_cd.equalsIgnoreCase(name)) {
			jip_cst_cd(value);
			return;
		}
		super.setStringNE(name, value);
	}

	public void setNumberNE(String name, MCNumber value) {
		if ($slo_rev.equalsIgnoreCase(name)) {
			slo_rev(value);
			return;
		}
		if ($cst_po_rev.equalsIgnoreCase(name)) {
			cst_po_rev(value);
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
		if ($qtn_rev.equalsIgnoreCase(name)) {
			qtn_rev(value);
			return;
		}
		if ($adv_bill_amt.equalsIgnoreCase(name)) {
			adv_bill_amt(value);
			return;
		}
		if ($adv_rcv_amt.equalsIgnoreCase(name)) {
			adv_rcv_amt(value);
			return;
		}
		if ($cred_upd_amt.equalsIgnoreCase(name)) {
			cred_upd_amt(value);
			return;
		}
		if ($edi_sub_num1.equalsIgnoreCase(name)) {
			edi_sub_num1(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		if ($hdr_qty.equalsIgnoreCase(name)) {
			hdr_qty(value);
			return;
		}
		if ($hdr_amt.equalsIgnoreCase(name)) {
			hdr_amt(value);
			return;
		}
		if ($royalty_trg_amt.equalsIgnoreCase(name)) {
			royalty_trg_amt(value);
			return;
		}
		if ($insp_rep_qty.equalsIgnoreCase(name)) {
			insp_rep_qty(value);
			return;
		}
		if ($cons_draw_qty.equalsIgnoreCase(name)) {
			cons_draw_qty(value);
			return;
		}
		if ($const_draw_qty.equalsIgnoreCase(name)) {
			const_draw_qty(value);
			return;
		}
		if ($comp_draw_qty.equalsIgnoreCase(name)) {
			comp_draw_qty(value);
			return;
		}
		if ($inst_manual_qty.equalsIgnoreCase(name)) {
			inst_manual_qty(value);
			return;
		}
		if ($aprv_draw_qty.equalsIgnoreCase(name)) {
			aprv_draw_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, int value) {
		if ($slo_rev.equalsIgnoreCase(name)) {
			slo_rev(value);
			return;
		}
		if ($cst_po_rev.equalsIgnoreCase(name)) {
			cst_po_rev(value);
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
		if ($qtn_rev.equalsIgnoreCase(name)) {
			qtn_rev(value);
			return;
		}
		if ($adv_bill_amt.equalsIgnoreCase(name)) {
			adv_bill_amt(value);
			return;
		}
		if ($adv_rcv_amt.equalsIgnoreCase(name)) {
			adv_rcv_amt(value);
			return;
		}
		if ($cred_upd_amt.equalsIgnoreCase(name)) {
			cred_upd_amt(value);
			return;
		}
		if ($edi_sub_num1.equalsIgnoreCase(name)) {
			edi_sub_num1(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		if ($hdr_qty.equalsIgnoreCase(name)) {
			hdr_qty(value);
			return;
		}
		if ($hdr_amt.equalsIgnoreCase(name)) {
			hdr_amt(value);
			return;
		}
		if ($royalty_trg_amt.equalsIgnoreCase(name)) {
			royalty_trg_amt(value);
			return;
		}
		if ($insp_rep_qty.equalsIgnoreCase(name)) {
			insp_rep_qty(value);
			return;
		}
		if ($cons_draw_qty.equalsIgnoreCase(name)) {
			cons_draw_qty(value);
			return;
		}
		if ($const_draw_qty.equalsIgnoreCase(name)) {
			const_draw_qty(value);
			return;
		}
		if ($comp_draw_qty.equalsIgnoreCase(name)) {
			comp_draw_qty(value);
			return;
		}
		if ($inst_manual_qty.equalsIgnoreCase(name)) {
			inst_manual_qty(value);
			return;
		}
		if ($aprv_draw_qty.equalsIgnoreCase(name)) {
			aprv_draw_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, long value) {
		if ($slo_rev.equalsIgnoreCase(name)) {
			slo_rev(value);
			return;
		}
		if ($cst_po_rev.equalsIgnoreCase(name)) {
			cst_po_rev(value);
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
		if ($qtn_rev.equalsIgnoreCase(name)) {
			qtn_rev(value);
			return;
		}
		if ($adv_bill_amt.equalsIgnoreCase(name)) {
			adv_bill_amt(value);
			return;
		}
		if ($adv_rcv_amt.equalsIgnoreCase(name)) {
			adv_rcv_amt(value);
			return;
		}
		if ($cred_upd_amt.equalsIgnoreCase(name)) {
			cred_upd_amt(value);
			return;
		}
		if ($edi_sub_num1.equalsIgnoreCase(name)) {
			edi_sub_num1(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		if ($hdr_qty.equalsIgnoreCase(name)) {
			hdr_qty(value);
			return;
		}
		if ($hdr_amt.equalsIgnoreCase(name)) {
			hdr_amt(value);
			return;
		}
		if ($royalty_trg_amt.equalsIgnoreCase(name)) {
			royalty_trg_amt(value);
			return;
		}
		if ($insp_rep_qty.equalsIgnoreCase(name)) {
			insp_rep_qty(value);
			return;
		}
		if ($cons_draw_qty.equalsIgnoreCase(name)) {
			cons_draw_qty(value);
			return;
		}
		if ($const_draw_qty.equalsIgnoreCase(name)) {
			const_draw_qty(value);
			return;
		}
		if ($comp_draw_qty.equalsIgnoreCase(name)) {
			comp_draw_qty(value);
			return;
		}
		if ($inst_manual_qty.equalsIgnoreCase(name)) {
			inst_manual_qty(value);
			return;
		}
		if ($aprv_draw_qty.equalsIgnoreCase(name)) {
			aprv_draw_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, float value) {
		if ($slo_rev.equalsIgnoreCase(name)) {
			slo_rev(value);
			return;
		}
		if ($cst_po_rev.equalsIgnoreCase(name)) {
			cst_po_rev(value);
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
		if ($qtn_rev.equalsIgnoreCase(name)) {
			qtn_rev(value);
			return;
		}
		if ($adv_bill_amt.equalsIgnoreCase(name)) {
			adv_bill_amt(value);
			return;
		}
		if ($adv_rcv_amt.equalsIgnoreCase(name)) {
			adv_rcv_amt(value);
			return;
		}
		if ($cred_upd_amt.equalsIgnoreCase(name)) {
			cred_upd_amt(value);
			return;
		}
		if ($edi_sub_num1.equalsIgnoreCase(name)) {
			edi_sub_num1(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		if ($hdr_qty.equalsIgnoreCase(name)) {
			hdr_qty(value);
			return;
		}
		if ($hdr_amt.equalsIgnoreCase(name)) {
			hdr_amt(value);
			return;
		}
		if ($royalty_trg_amt.equalsIgnoreCase(name)) {
			royalty_trg_amt(value);
			return;
		}
		if ($insp_rep_qty.equalsIgnoreCase(name)) {
			insp_rep_qty(value);
			return;
		}
		if ($cons_draw_qty.equalsIgnoreCase(name)) {
			cons_draw_qty(value);
			return;
		}
		if ($const_draw_qty.equalsIgnoreCase(name)) {
			const_draw_qty(value);
			return;
		}
		if ($comp_draw_qty.equalsIgnoreCase(name)) {
			comp_draw_qty(value);
			return;
		}
		if ($inst_manual_qty.equalsIgnoreCase(name)) {
			inst_manual_qty(value);
			return;
		}
		if ($aprv_draw_qty.equalsIgnoreCase(name)) {
			aprv_draw_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, double value) {
		if ($slo_rev.equalsIgnoreCase(name)) {
			slo_rev(value);
			return;
		}
		if ($cst_po_rev.equalsIgnoreCase(name)) {
			cst_po_rev(value);
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
		if ($qtn_rev.equalsIgnoreCase(name)) {
			qtn_rev(value);
			return;
		}
		if ($adv_bill_amt.equalsIgnoreCase(name)) {
			adv_bill_amt(value);
			return;
		}
		if ($adv_rcv_amt.equalsIgnoreCase(name)) {
			adv_rcv_amt(value);
			return;
		}
		if ($cred_upd_amt.equalsIgnoreCase(name)) {
			cred_upd_amt(value);
			return;
		}
		if ($edi_sub_num1.equalsIgnoreCase(name)) {
			edi_sub_num1(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		if ($hdr_qty.equalsIgnoreCase(name)) {
			hdr_qty(value);
			return;
		}
		if ($hdr_amt.equalsIgnoreCase(name)) {
			hdr_amt(value);
			return;
		}
		if ($royalty_trg_amt.equalsIgnoreCase(name)) {
			royalty_trg_amt(value);
			return;
		}
		if ($insp_rep_qty.equalsIgnoreCase(name)) {
			insp_rep_qty(value);
			return;
		}
		if ($cons_draw_qty.equalsIgnoreCase(name)) {
			cons_draw_qty(value);
			return;
		}
		if ($const_draw_qty.equalsIgnoreCase(name)) {
			const_draw_qty(value);
			return;
		}
		if ($comp_draw_qty.equalsIgnoreCase(name)) {
			comp_draw_qty(value);
			return;
		}
		if ($inst_manual_qty.equalsIgnoreCase(name)) {
			inst_manual_qty(value);
			return;
		}
		if ($aprv_draw_qty.equalsIgnoreCase(name)) {
			aprv_draw_qty(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setDateNE(String name, MCDate value) {
		if ($slo_dt.equalsIgnoreCase(name)) {
			slo_dt(value);
			return;
		}
		if ($etd_dt.equalsIgnoreCase(name)) {
			etd_dt(value);
			return;
		}
		if ($eta_dt.equalsIgnoreCase(name)) {
			eta_dt(value);
			return;
		}
		if ($via_schd_dt.equalsIgnoreCase(name)) {
			via_schd_dt(value);
			return;
		}
		if ($rcpt_dt.equalsIgnoreCase(name)) {
			rcpt_dt(value);
			return;
		}
		if ($edi_sub_dt1.equalsIgnoreCase(name)) {
			edi_sub_dt1(value);
			return;
		}
		if ($sls_dt.equalsIgnoreCase(name)) {
			sls_dt(value);
			return;
		}
		if ($slo_aprv_dt.equalsIgnoreCase(name)) {
			slo_aprv_dt(value);
			return;
		}
		if ($aprv_dt.equalsIgnoreCase(name)) {
			aprv_dt(value);
			return;
		}
		if ($ord_dlv_dt.equalsIgnoreCase(name)) {
			ord_dlv_dt(value);
			return;
		}
		if ($ps_sal_aft_dt.equalsIgnoreCase(name)) {
			ps_sal_aft_dt(value);
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
		if ($xrate_inpt_flg.equalsIgnoreCase(name)) {
			xrate_inpt_flg(value);
			return;
		}
		if ($ptax_xrate_inpt_flg.equalsIgnoreCase(name)) {
			ptax_xrate_inpt_flg(value);
			return;
		}
		if ($aprv_flg.equalsIgnoreCase(name)) {
			aprv_flg(value);
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
		if ($ship_prnt_no_cst_nm_flg.equalsIgnoreCase(name)) {
			ship_prnt_no_cst_nm_flg(value);
			return;
		}
		if ($slo_last_sls_flg.equalsIgnoreCase(name)) {
			slo_last_sls_flg(value);
			return;
		}
		if ($src_ship_flg.equalsIgnoreCase(name)) {
			src_ship_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

}
