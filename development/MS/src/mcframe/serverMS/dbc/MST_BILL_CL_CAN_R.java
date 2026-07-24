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
 * "請求締解除実績 // Billing closing cancel result"DBコンテナRowクラスです。<p>
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
 *  	<td>bill_mng_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>請求管理ＮＯ</td>
 *  	<td>Billing management No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>bcst_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>請求先ＣＤ</td>
 *  	<td>Billing customer cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>bill_cl_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>請求締年月日</td>
 *  	<td>Billing closing day</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>bill_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>請求書ＮＯ</td>
 *  	<td>Invoice No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>bill_rev</td>
 *  	<td>N</td>
 *  	<td>4,0</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>請求書改訂番号</td>
 *  	<td>Invoice rev. number</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>pre_bill_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>先行請求書ＮＯ</td>
 *  	<td>Advance invoice No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>trd_cur_cd</td>
 *  	<td>C</td>
 *  	<td>3</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>取引通貨ＣＤ</td>
 *  	<td>Transaction currency cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>bill_xrate</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>請求為替レート</td>
 *  	<td>Billing exchange rate</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>iv_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>インボイスＮＯ</td>
 *  	<td>Invoice No.</td>
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
 *  	<td>bill_dpt_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>請求部門ＣＤ</td>
 *  	<td>Billing dept. cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>wg_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>ワーキンググループＣＤ</td>
 *  	<td>WG cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>bill_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>請求日</td>
 *  	<td>Billing date</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>pre_bill_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>先行請求日</td>
 *  	<td>Advance billing date</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>last_bill_amt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>前回請求額</td>
 *  	<td>Last billing amount</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>xfr_amt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>今回振込入金額</td>
 *  	<td>Current transfer payment received amount</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>note_amt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>今回手形入金額</td>
 *  	<td>Current notes payment received amount</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>cash_amt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>今回現金入金額</td>
 *  	<td>Current cash payment received amount</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>setoff_amt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>今回相殺額</td>
 *  	<td>Current offset amount</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>setoff_tax_amt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>今回相殺税額</td>
 *  	<td>Current offset tax amount</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sw_amt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>今回振替額</td>
 *  	<td>Current transfer amount</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>bfw_amt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>今回繰越額</td>
 *  	<td>Current carry-over amount</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sls_amt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>今回売上額</td>
 *  	<td>Current sales amount</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ret_amt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>今回返品額</td>
 *  	<td>Current return amount</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>dscnt_amt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>今回値引額</td>
 *  	<td>Current discount amount</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sw_to_amt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>今回振替額（振替先）</td>
 *  	<td>Current transfer amount (Transfer destination)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>tax_amt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>今回税額</td>
 *  	<td>Current tax amount</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>bill_amt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>今回請求額</td>
 *  	<td>Current billing amount</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>adv_amt_bal</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>前受金残高</td>
 *  	<td>Advance received balance</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>adv_amt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>前受金入金額</td>
 *  	<td>Advance received payment amount</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>adv_setoff_amt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>前受金相殺額</td>
 *  	<td>Advance received offset amount</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>adv_setoff_tax_amt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>前受金相殺税額</td>
 *  	<td>Advance received offset tax amount</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>bill_each_sls_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>売上都度請求ＦＬＧ</td>
 *  	<td>Billing at each sales flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>bill_cl_sts_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>請求締状況区分</td>
 *  	<td>Billing closing status type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>bill_cl_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>請求締処理区分</td>
 *  	<td>Billing closing type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>foreign_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>国外ＦＬＧ</td>
 *  	<td>Foreign flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>bill_tax_calc_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>税計算区分</td>
 *  	<td>Tax calculation type</td>
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
 *  	<td>bill_rq_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>請求書要否ＦＬＧ</td>
 *  	<td>Invoice required flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>base_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>基準日</td>
 *  	<td>Base date</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>rcv_schd_amt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>入金予定額</td>
 *  	<td>Amount of payment receipt schedule</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>rcv_act_amt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>入金実績額</td>
 *  	<td>Payment received result amount</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>not_appl_bal</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>未消込残高</td>
 *  	<td>Unreconciled balance</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>last_rcv_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>最終入金日</td>
 *  	<td>Last payment received date</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>rcv_schd_adjst_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>入金予定調整済ＦＬＧ</td>
 *  	<td>Payment receipt schedule adjusted flg.</td>
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
 *  	<td>exists_interim_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>仮単価存在ＦＬＧ</td>
 *  	<td>Temporary unit price exist flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>dtl_cnt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>請求明細数</td>
 *  	<td>Number of billing details</td>
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
public class MST_BILL_CL_CAN_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.CO_VIEW;

	public static final String TABLE_NAME = "MST_BILL_CL_CAN";

	public static final boolean EX_CTRL = true;
	
	public static final boolean LCL_TABLE = false;
	
	/**
	 * 請求管理ＮＯ. Billing management No..<p>
	 *
	 */
	public static final String $bill_mng_no = "bill_mng_no";
	private static final MCPermColumnInfo _bill_mng_no = createColumnInfo("bill_mng_no");
	public final MCStringPermColumn bill_mng_no = createStringColumn(_bill_mng_no);
	
	/**
	 * 請求先ＣＤ. Billing customer cd..<p>
	 *
	 */
	public static final String $bcst_cd = "bcst_cd";
	private static final MCPermColumnInfo _bcst_cd = createColumnInfo("bcst_cd");
	public final MCStringPermColumn bcst_cd = createStringColumn(_bcst_cd);
	
	/**
	 * 請求締年月日. Billing closing day.<p>
	 *
	 */
	public static final String $bill_cl_dt = "bill_cl_dt";
	private static final MCPermColumnInfo _bill_cl_dt = createColumnInfo("bill_cl_dt");
	public final MCDatePermColumn bill_cl_dt = createDateColumn(_bill_cl_dt);
	
	/**
	 * 請求書ＮＯ. Invoice No..<p>
	 *
	 */
	public static final String $bill_no = "bill_no";
	private static final MCPermColumnInfo _bill_no = createColumnInfo("bill_no");
	public final MCStringPermColumn bill_no = createStringColumn(_bill_no);
	
	/**
	 * 請求書改訂番号. Invoice rev. number.<p>
	 *
	 */
	public static final String $bill_rev = "bill_rev";
	private static final MCPermColumnInfo _bill_rev = createColumnInfo("bill_rev");
	public final MCNumberPermColumn bill_rev = createNumberColumn(_bill_rev);
	
	/**
	 * 先行請求書ＮＯ. Advance invoice No..<p>
	 *
	 */
	public static final String $pre_bill_no = "pre_bill_no";
	private static final MCPermColumnInfo _pre_bill_no = createColumnInfo("pre_bill_no");
	public final MCStringPermColumn pre_bill_no = createStringColumn(_pre_bill_no);
	
	/**
	 * 取引通貨ＣＤ. Transaction currency cd..<p>
	 *
	 */
	public static final String $trd_cur_cd = "trd_cur_cd";
	private static final MCPermColumnInfo _trd_cur_cd = createColumnInfo("trd_cur_cd");
	public final MCStringPermColumn trd_cur_cd = createStringColumn(_trd_cur_cd);
	
	/**
	 * 請求為替レート. Billing exchange rate.<p>
	 *
	 */
	public static final String $bill_xrate = "bill_xrate";
	private static final MCPermColumnInfo _bill_xrate = createColumnInfo("bill_xrate");
	public final MCNumberPermColumn bill_xrate = createNumberColumn(_bill_xrate);
	
	/**
	 * インボイスＮＯ. Invoice No..<p>
	 *
	 */
	public static final String $iv_no = "iv_no";
	private static final MCPermColumnInfo _iv_no = createColumnInfo("iv_no");
	public final MCStringPermColumn iv_no = createStringColumn(_iv_no);
	
	/**
	 * 案件ＮＯ. Sales project No..<p>
	 *
	 */
	public static final String $wrk_no = "wrk_no";
	private static final MCPermColumnInfo _wrk_no = createColumnInfo("wrk_no");
	public final MCStringPermColumn wrk_no = createStringColumn(_wrk_no);
	
	/**
	 * 請求部門ＣＤ. Billing dept. cd..<p>
	 *
	 */
	public static final String $bill_dpt_cd = "bill_dpt_cd";
	private static final MCPermColumnInfo _bill_dpt_cd = createColumnInfo("bill_dpt_cd");
	public final MCStringPermColumn bill_dpt_cd = createStringColumn(_bill_dpt_cd);
	
	/**
	 * ワーキンググループＣＤ. WG cd..<p>
	 *
	 */
	public static final String $wg_cd = "wg_cd";
	private static final MCPermColumnInfo _wg_cd = createColumnInfo("wg_cd");
	public final MCStringPermColumn wg_cd = createStringColumn(_wg_cd);
	
	/**
	 * 請求日. Billing date.<p>
	 *
	 */
	public static final String $bill_dt = "bill_dt";
	private static final MCPermColumnInfo _bill_dt = createColumnInfo("bill_dt");
	public final MCDatePermColumn bill_dt = createDateColumn(_bill_dt);
	
	/**
	 * 先行請求日. Advance billing date.<p>
	 *
	 */
	public static final String $pre_bill_dt = "pre_bill_dt";
	private static final MCPermColumnInfo _pre_bill_dt = createColumnInfo("pre_bill_dt");
	public final MCDatePermColumn pre_bill_dt = createDateColumn(_pre_bill_dt);
	
	/**
	 * 前回請求額. Last billing amount.<p>
	 *
	 */
	public static final String $last_bill_amt = "last_bill_amt";
	private static final MCPermColumnInfo _last_bill_amt = createColumnInfo("last_bill_amt");
	public final MCNumberPermColumn last_bill_amt = createNumberColumn(_last_bill_amt);
	
	/**
	 * 今回振込入金額. Current transfer payment received amount.<p>
	 *
	 */
	public static final String $xfr_amt = "xfr_amt";
	private static final MCPermColumnInfo _xfr_amt = createColumnInfo("xfr_amt");
	public final MCNumberPermColumn xfr_amt = createNumberColumn(_xfr_amt);
	
	/**
	 * 今回手形入金額. Current notes payment received amount.<p>
	 *
	 */
	public static final String $note_amt = "note_amt";
	private static final MCPermColumnInfo _note_amt = createColumnInfo("note_amt");
	public final MCNumberPermColumn note_amt = createNumberColumn(_note_amt);
	
	/**
	 * 今回現金入金額. Current cash payment received amount.<p>
	 *
	 */
	public static final String $cash_amt = "cash_amt";
	private static final MCPermColumnInfo _cash_amt = createColumnInfo("cash_amt");
	public final MCNumberPermColumn cash_amt = createNumberColumn(_cash_amt);
	
	/**
	 * 今回相殺額. Current offset amount.<p>
	 *
	 */
	public static final String $setoff_amt = "setoff_amt";
	private static final MCPermColumnInfo _setoff_amt = createColumnInfo("setoff_amt");
	public final MCNumberPermColumn setoff_amt = createNumberColumn(_setoff_amt);
	
	/**
	 * 今回相殺税額. Current offset tax amount.<p>
	 *
	 */
	public static final String $setoff_tax_amt = "setoff_tax_amt";
	private static final MCPermColumnInfo _setoff_tax_amt = createColumnInfo("setoff_tax_amt");
	public final MCNumberPermColumn setoff_tax_amt = createNumberColumn(_setoff_tax_amt);
	
	/**
	 * 今回振替額. Current transfer amount.<p>
	 *
	 */
	public static final String $sw_amt = "sw_amt";
	private static final MCPermColumnInfo _sw_amt = createColumnInfo("sw_amt");
	public final MCNumberPermColumn sw_amt = createNumberColumn(_sw_amt);
	
	/**
	 * 今回繰越額. Current carry-over amount.<p>
	 *
	 */
	public static final String $bfw_amt = "bfw_amt";
	private static final MCPermColumnInfo _bfw_amt = createColumnInfo("bfw_amt");
	public final MCNumberPermColumn bfw_amt = createNumberColumn(_bfw_amt);
	
	/**
	 * 今回売上額. Current sales amount.<p>
	 *
	 */
	public static final String $sls_amt = "sls_amt";
	private static final MCPermColumnInfo _sls_amt = createColumnInfo("sls_amt");
	public final MCNumberPermColumn sls_amt = createNumberColumn(_sls_amt);
	
	/**
	 * 今回返品額. Current return amount.<p>
	 *
	 */
	public static final String $ret_amt = "ret_amt";
	private static final MCPermColumnInfo _ret_amt = createColumnInfo("ret_amt");
	public final MCNumberPermColumn ret_amt = createNumberColumn(_ret_amt);
	
	/**
	 * 今回値引額. Current discount amount.<p>
	 *
	 */
	public static final String $dscnt_amt = "dscnt_amt";
	private static final MCPermColumnInfo _dscnt_amt = createColumnInfo("dscnt_amt");
	public final MCNumberPermColumn dscnt_amt = createNumberColumn(_dscnt_amt);
	
	/**
	 * 今回振替額（振替先）. Current transfer amount (Transfer destination).<p>
	 *
	 */
	public static final String $sw_to_amt = "sw_to_amt";
	private static final MCPermColumnInfo _sw_to_amt = createColumnInfo("sw_to_amt");
	public final MCNumberPermColumn sw_to_amt = createNumberColumn(_sw_to_amt);
	
	/**
	 * 今回税額. Current tax amount.<p>
	 *
	 */
	public static final String $tax_amt = "tax_amt";
	private static final MCPermColumnInfo _tax_amt = createColumnInfo("tax_amt");
	public final MCNumberPermColumn tax_amt = createNumberColumn(_tax_amt);
	
	/**
	 * 今回請求額. Current billing amount.<p>
	 *
	 */
	public static final String $bill_amt = "bill_amt";
	private static final MCPermColumnInfo _bill_amt = createColumnInfo("bill_amt");
	public final MCNumberPermColumn bill_amt = createNumberColumn(_bill_amt);
	
	/**
	 * 前受金残高. Advance received balance.<p>
	 *
	 */
	public static final String $adv_amt_bal = "adv_amt_bal";
	private static final MCPermColumnInfo _adv_amt_bal = createColumnInfo("adv_amt_bal");
	public final MCNumberPermColumn adv_amt_bal = createNumberColumn(_adv_amt_bal);
	
	/**
	 * 前受金入金額. Advance received payment amount.<p>
	 *
	 */
	public static final String $adv_amt = "adv_amt";
	private static final MCPermColumnInfo _adv_amt = createColumnInfo("adv_amt");
	public final MCNumberPermColumn adv_amt = createNumberColumn(_adv_amt);
	
	/**
	 * 前受金相殺額. Advance received offset amount.<p>
	 *
	 */
	public static final String $adv_setoff_amt = "adv_setoff_amt";
	private static final MCPermColumnInfo _adv_setoff_amt = createColumnInfo("adv_setoff_amt");
	public final MCNumberPermColumn adv_setoff_amt = createNumberColumn(_adv_setoff_amt);
	
	/**
	 * 前受金相殺税額. Advance received offset tax amount.<p>
	 *
	 */
	public static final String $adv_setoff_tax_amt = "adv_setoff_tax_amt";
	private static final MCPermColumnInfo _adv_setoff_tax_amt = createColumnInfo("adv_setoff_tax_amt");
	public final MCNumberPermColumn adv_setoff_tax_amt = createNumberColumn(_adv_setoff_tax_amt);
	
	/**
	 * 売上都度請求ＦＬＧ. Billing at each sales flg..<p>
	 *
	 */
	public static final String $bill_each_sls_flg = "bill_each_sls_flg";
	private static final MCPermColumnInfo _bill_each_sls_flg = createColumnInfo("bill_each_sls_flg");
	public final MCBooleanPermColumn bill_each_sls_flg = createBooleanColumn(_bill_each_sls_flg);
	
	/**
	 * 請求締状況区分. Billing closing status type.<p>
	 *
	 */
	public static final String $bill_cl_sts_typ = "bill_cl_sts_typ";
	private static final MCPermColumnInfo _bill_cl_sts_typ = createColumnInfo("bill_cl_sts_typ");
	public final MCStringPermColumn bill_cl_sts_typ = createStringColumn(_bill_cl_sts_typ);
	
	/**
	 * 請求締処理区分. Billing closing type.<p>
	 *
	 */
	public static final String $bill_cl_typ = "bill_cl_typ";
	private static final MCPermColumnInfo _bill_cl_typ = createColumnInfo("bill_cl_typ");
	public final MCStringPermColumn bill_cl_typ = createStringColumn(_bill_cl_typ);
	
	/**
	 * 国外ＦＬＧ. Foreign flg..<p>
	 *
	 */
	public static final String $foreign_flg = "foreign_flg";
	private static final MCPermColumnInfo _foreign_flg = createColumnInfo("foreign_flg");
	public final MCBooleanPermColumn foreign_flg = createBooleanColumn(_foreign_flg);
	
	/**
	 * 税計算区分. Tax calculation type.<p>
	 *
	 */
	public static final String $bill_tax_calc_typ = "bill_tax_calc_typ";
	private static final MCPermColumnInfo _bill_tax_calc_typ = createColumnInfo("bill_tax_calc_typ");
	public final MCStringPermColumn bill_tax_calc_typ = createStringColumn(_bill_tax_calc_typ);
	
	/**
	 * 発行済ＦＬＧ. Issued flg..<p>
	 *
	 */
	public static final String $prnt_flg = "prnt_flg";
	private static final MCPermColumnInfo _prnt_flg = createColumnInfo("prnt_flg");
	public final MCBooleanPermColumn prnt_flg = createBooleanColumn(_prnt_flg);
	
	/**
	 * 請求書要否ＦＬＧ. Invoice required flg..<p>
	 *
	 */
	public static final String $bill_rq_flg = "bill_rq_flg";
	private static final MCPermColumnInfo _bill_rq_flg = createColumnInfo("bill_rq_flg");
	public final MCBooleanPermColumn bill_rq_flg = createBooleanColumn(_bill_rq_flg);
	
	/**
	 * 基準日. Base date.<p>
	 *
	 */
	public static final String $base_dt = "base_dt";
	private static final MCPermColumnInfo _base_dt = createColumnInfo("base_dt");
	public final MCDatePermColumn base_dt = createDateColumn(_base_dt);
	
	/**
	 * 入金予定額. Amount of payment receipt schedule.<p>
	 *
	 */
	public static final String $rcv_schd_amt = "rcv_schd_amt";
	private static final MCPermColumnInfo _rcv_schd_amt = createColumnInfo("rcv_schd_amt");
	public final MCNumberPermColumn rcv_schd_amt = createNumberColumn(_rcv_schd_amt);
	
	/**
	 * 入金実績額. Payment received result amount.<p>
	 *
	 */
	public static final String $rcv_act_amt = "rcv_act_amt";
	private static final MCPermColumnInfo _rcv_act_amt = createColumnInfo("rcv_act_amt");
	public final MCNumberPermColumn rcv_act_amt = createNumberColumn(_rcv_act_amt);
	
	/**
	 * 未消込残高. Unreconciled balance.<p>
	 *
	 */
	public static final String $not_appl_bal = "not_appl_bal";
	private static final MCPermColumnInfo _not_appl_bal = createColumnInfo("not_appl_bal");
	public final MCNumberPermColumn not_appl_bal = createNumberColumn(_not_appl_bal);
	
	/**
	 * 最終入金日. Last payment received date.<p>
	 *
	 */
	public static final String $last_rcv_dt = "last_rcv_dt";
	private static final MCPermColumnInfo _last_rcv_dt = createColumnInfo("last_rcv_dt");
	public final MCDatePermColumn last_rcv_dt = createDateColumn(_last_rcv_dt);
	
	/**
	 * 入金予定調整済ＦＬＧ. Payment receipt schedule adjusted flg..<p>
	 *
	 */
	public static final String $rcv_schd_adjst_flg = "rcv_schd_adjst_flg";
	private static final MCPermColumnInfo _rcv_schd_adjst_flg = createColumnInfo("rcv_schd_adjst_flg");
	public final MCBooleanPermColumn rcv_schd_adjst_flg = createBooleanColumn(_rcv_schd_adjst_flg);
	
	/**
	 * ＥＤＩＦＬＧ. EDI flg..<p>
	 *
	 */
	public static final String $edi_flg = "edi_flg";
	private static final MCPermColumnInfo _edi_flg = createColumnInfo("edi_flg");
	public final MCBooleanPermColumn edi_flg = createBooleanColumn(_edi_flg);
	
	/**
	 * 仮単価存在ＦＬＧ. Temporary unit price exist flg..<p>
	 *
	 */
	public static final String $exists_interim_flg = "exists_interim_flg";
	private static final MCPermColumnInfo _exists_interim_flg = createColumnInfo("exists_interim_flg");
	public final MCBooleanPermColumn exists_interim_flg = createBooleanColumn(_exists_interim_flg);
	
	/**
	 * 請求明細数. Number of billing details.<p>
	 *
	 */
	public static final String $dtl_cnt = "dtl_cnt";
	private static final MCPermColumnInfo _dtl_cnt = createColumnInfo("dtl_cnt");
	public final MCNumberPermColumn dtl_cnt = createNumberColumn(_dtl_cnt);
	
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
	
	public static final MCMeta bill_mng_no_META = createCommonMeta($bill_mng_no, mcframe.commonMA.meta.MA_META.BILL_MNG_NO);
	public static final MCMeta bcst_cd_META = createCommonMeta($bcst_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta bill_cl_dt_META = createCommonMeta($bill_cl_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta bill_no_META = createCommonMeta($bill_no, mcframe.commonMA.meta.MA_META.BILL_NO);
	public static final MCMeta bill_rev_META = createCommonMeta($bill_rev, mcframe.commonMA.meta.MA_META.SLIP_REV);
	public static final MCMeta pre_bill_no_META = createCommonMeta($pre_bill_no, mcframe.commonMA.meta.MA_META.PRE_BILL_NO);
	public static final MCMeta trd_cur_cd_META = createCommonMeta($trd_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta bill_xrate_META = createCommonMeta($bill_xrate, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta iv_no_META = createCommonMeta($iv_no, mcframe.commonMA.meta.MA_META.IV_NO);
	public static final MCMeta wrk_no_META = createCommonMeta($wrk_no, mcframe.commonMA.meta.MA_META.WRK_NO);
	public static final MCMeta bill_dpt_cd_META = createCommonMeta($bill_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta bill_dt_META = createCommonMeta($bill_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta pre_bill_dt_META = createCommonMeta($pre_bill_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta last_bill_amt_META = createCommonMeta($last_bill_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta xfr_amt_META = createCommonMeta($xfr_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta note_amt_META = createCommonMeta($note_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta cash_amt_META = createCommonMeta($cash_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta setoff_amt_META = createCommonMeta($setoff_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta setoff_tax_amt_META = createCommonMeta($setoff_tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta sw_amt_META = createCommonMeta($sw_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta bfw_amt_META = createCommonMeta($bfw_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta sls_amt_META = createCommonMeta($sls_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta ret_amt_META = createCommonMeta($ret_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta dscnt_amt_META = createCommonMeta($dscnt_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta sw_to_amt_META = createCommonMeta($sw_to_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta tax_amt_META = createCommonMeta($tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta bill_amt_META = createCommonMeta($bill_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta adv_amt_bal_META = createCommonMeta($adv_amt_bal, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta adv_amt_META = createCommonMeta($adv_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta adv_setoff_amt_META = createCommonMeta($adv_setoff_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta adv_setoff_tax_amt_META = createCommonMeta($adv_setoff_tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta bill_each_sls_flg_META = createCommonMeta($bill_each_sls_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bill_cl_sts_typ_META = createCommonMeta($bill_cl_sts_typ, mcframe.commonMS.meta.MS_META.BILL_CL_STS_TYP);
	public static final MCMeta bill_cl_typ_META = createCommonMeta($bill_cl_typ, mcframe.commonMA.meta.MA_META.BILL_CL_TYP);
	public static final MCMeta foreign_flg_META = createCommonMeta($foreign_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bill_tax_calc_typ_META = createCommonMeta($bill_tax_calc_typ, mcframe.commonMS.meta.MS_META.BILL_TAX_CALC_TYP);
	public static final MCMeta prnt_flg_META = createCommonMeta($prnt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bill_rq_flg_META = createCommonMeta($bill_rq_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta base_dt_META = createCommonMeta($base_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta rcv_schd_amt_META = createCommonMeta($rcv_schd_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta rcv_act_amt_META = createCommonMeta($rcv_act_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta not_appl_bal_META = createCommonMeta($not_appl_bal, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta last_rcv_dt_META = createCommonMeta($last_rcv_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta rcv_schd_adjst_flg_META = createCommonMeta($rcv_schd_adjst_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta edi_flg_META = createCommonMeta($edi_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta exists_interim_flg_META = createCommonMeta($exists_interim_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dtl_cnt_META = createCommonMeta($dtl_cnt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.BILL_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.BILL_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.BILL_SUB_CHAR3);
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
	public static final String $CUR1 = "CUR1";
	static {
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_CUR",
				$CUR1,
				new String[][]{
						{"trd_cur_cd", "cur_cd"}
				},
				() -> {
					return mcframe.serverMA.dbc.MAM_CUR_R.create("CUR1");
				},
				(alias) -> {
					MST_BILL_CL_CAN_R own = MST_BILL_CL_CAN_R.create(alias);
					mcframe.serverMA.dbc.MAM_CUR_R ref = mcframe.serverMA.dbc.MAM_CUR_R.create("CUR1");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.trd_cur_cd.eq(ref.cur_cd));
					return cond;
				}
			)
		);
	}
	
	protected static final ConstMetaList<MST_BILL_CL_CAN_R> constMetas = new ConstMetaList<MST_BILL_CL_CAN_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			bill_mng_no_META,
			bcst_cd_META,
			bill_cl_dt_META,
			bill_no_META,
			bill_rev_META,
			pre_bill_no_META,
			trd_cur_cd_META,
			bill_xrate_META,
			iv_no_META,
			wrk_no_META,
			bill_dpt_cd_META,
			wg_cd_META,
			bill_dt_META,
			pre_bill_dt_META,
			last_bill_amt_META,
			xfr_amt_META,
			note_amt_META,
			cash_amt_META,
			setoff_amt_META,
			setoff_tax_amt_META,
			sw_amt_META,
			bfw_amt_META,
			sls_amt_META,
			ret_amt_META,
			dscnt_amt_META,
			sw_to_amt_META,
			tax_amt_META,
			bill_amt_META,
			adv_amt_bal_META,
			adv_amt_META,
			adv_setoff_amt_META,
			adv_setoff_tax_amt_META,
			bill_each_sls_flg_META,
			bill_cl_sts_typ_META,
			bill_cl_typ_META,
			foreign_flg_META,
			bill_tax_calc_typ_META,
			prnt_flg_META,
			bill_rq_flg_META,
			base_dt_META,
			rcv_schd_amt_META,
			rcv_act_amt_META,
			not_appl_bal_META,
			last_rcv_dt_META,
			rcv_schd_adjst_flg_META,
			edi_flg_META,
			exists_interim_flg_META,
			dtl_cnt_META,
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
	protected MST_BILL_CL_CAN_R(ConstMetaList<? extends MST_BILL_CL_CAN_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MST_BILL_CL_CAN_R(ConstMetaList<? extends MST_BILL_CL_CAN_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MST_BILL_CL_CAN_R.$bill_mng_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_CL_CAN_R.$bill_mng_no,
				"bill_mng_no",
				bill_mng_no,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_CL_CAN_R.$bcst_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_CL_CAN_R.$bcst_cd,
				"bcst_cd",
				bcst_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_CL_CAN_R.$bill_cl_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_BILL_CL_CAN_R.$bill_cl_dt,
				"bill_cl_dt",
				bill_cl_dt,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_CL_CAN_R.$bill_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_CL_CAN_R.$bill_no,
				"bill_no",
				bill_no,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_CL_CAN_R.$bill_rev,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BILL_CL_CAN_R.$bill_rev,
				"bill_rev",
				bill_rev,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_CL_CAN_R.$pre_bill_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_CL_CAN_R.$pre_bill_no,
				"pre_bill_no",
				pre_bill_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_CL_CAN_R.$trd_cur_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_CL_CAN_R.$trd_cur_cd,
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
			MST_BILL_CL_CAN_R.$bill_xrate,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BILL_CL_CAN_R.$bill_xrate,
				"bill_xrate",
				bill_xrate,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_CL_CAN_R.$iv_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_CL_CAN_R.$iv_no,
				"iv_no",
				iv_no,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_CL_CAN_R.$wrk_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_CL_CAN_R.$wrk_no,
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
			MST_BILL_CL_CAN_R.$bill_dpt_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_CL_CAN_R.$bill_dpt_cd,
				"bill_dpt_cd",
				bill_dpt_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_CL_CAN_R.$wg_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_CL_CAN_R.$wg_cd,
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
			MST_BILL_CL_CAN_R.$bill_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_BILL_CL_CAN_R.$bill_dt,
				"bill_dt",
				bill_dt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_CL_CAN_R.$pre_bill_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_BILL_CL_CAN_R.$pre_bill_dt,
				"pre_bill_dt",
				pre_bill_dt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_CL_CAN_R.$last_bill_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BILL_CL_CAN_R.$last_bill_amt,
				"last_bill_amt",
				last_bill_amt,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_CL_CAN_R.$xfr_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BILL_CL_CAN_R.$xfr_amt,
				"xfr_amt",
				xfr_amt,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_CL_CAN_R.$note_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BILL_CL_CAN_R.$note_amt,
				"note_amt",
				note_amt,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_CL_CAN_R.$cash_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BILL_CL_CAN_R.$cash_amt,
				"cash_amt",
				cash_amt,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_CL_CAN_R.$setoff_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BILL_CL_CAN_R.$setoff_amt,
				"setoff_amt",
				setoff_amt,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_CL_CAN_R.$setoff_tax_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BILL_CL_CAN_R.$setoff_tax_amt,
				"setoff_tax_amt",
				setoff_tax_amt,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_CL_CAN_R.$sw_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BILL_CL_CAN_R.$sw_amt,
				"sw_amt",
				sw_amt,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_CL_CAN_R.$bfw_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BILL_CL_CAN_R.$bfw_amt,
				"bfw_amt",
				bfw_amt,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_CL_CAN_R.$sls_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BILL_CL_CAN_R.$sls_amt,
				"sls_amt",
				sls_amt,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_CL_CAN_R.$ret_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BILL_CL_CAN_R.$ret_amt,
				"ret_amt",
				ret_amt,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_CL_CAN_R.$dscnt_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BILL_CL_CAN_R.$dscnt_amt,
				"dscnt_amt",
				dscnt_amt,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_CL_CAN_R.$sw_to_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BILL_CL_CAN_R.$sw_to_amt,
				"sw_to_amt",
				sw_to_amt,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_CL_CAN_R.$tax_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BILL_CL_CAN_R.$tax_amt,
				"tax_amt",
				tax_amt,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_CL_CAN_R.$bill_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BILL_CL_CAN_R.$bill_amt,
				"bill_amt",
				bill_amt,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_CL_CAN_R.$adv_amt_bal,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BILL_CL_CAN_R.$adv_amt_bal,
				"adv_amt_bal",
				adv_amt_bal,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_CL_CAN_R.$adv_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BILL_CL_CAN_R.$adv_amt,
				"adv_amt",
				adv_amt,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_CL_CAN_R.$adv_setoff_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BILL_CL_CAN_R.$adv_setoff_amt,
				"adv_setoff_amt",
				adv_setoff_amt,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_CL_CAN_R.$adv_setoff_tax_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BILL_CL_CAN_R.$adv_setoff_tax_amt,
				"adv_setoff_tax_amt",
				adv_setoff_tax_amt,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_CL_CAN_R.$bill_each_sls_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_BILL_CL_CAN_R.$bill_each_sls_flg,
				"bill_each_sls_flg",
				bill_each_sls_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_CL_CAN_R.$bill_cl_sts_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_CL_CAN_R.$bill_cl_sts_typ,
				"bill_cl_sts_typ",
				bill_cl_sts_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_CL_CAN_R.$bill_cl_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_CL_CAN_R.$bill_cl_typ,
				"bill_cl_typ",
				bill_cl_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_CL_CAN_R.$foreign_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_BILL_CL_CAN_R.$foreign_flg,
				"foreign_flg",
				foreign_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_CL_CAN_R.$bill_tax_calc_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_CL_CAN_R.$bill_tax_calc_typ,
				"bill_tax_calc_typ",
				bill_tax_calc_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_CL_CAN_R.$prnt_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_BILL_CL_CAN_R.$prnt_flg,
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
			MST_BILL_CL_CAN_R.$bill_rq_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_BILL_CL_CAN_R.$bill_rq_flg,
				"bill_rq_flg",
				bill_rq_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_CL_CAN_R.$base_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_BILL_CL_CAN_R.$base_dt,
				"base_dt",
				base_dt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_CL_CAN_R.$rcv_schd_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BILL_CL_CAN_R.$rcv_schd_amt,
				"rcv_schd_amt",
				rcv_schd_amt,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_CL_CAN_R.$rcv_act_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BILL_CL_CAN_R.$rcv_act_amt,
				"rcv_act_amt",
				rcv_act_amt,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_CL_CAN_R.$not_appl_bal,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BILL_CL_CAN_R.$not_appl_bal,
				"not_appl_bal",
				not_appl_bal,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_CL_CAN_R.$last_rcv_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_BILL_CL_CAN_R.$last_rcv_dt,
				"last_rcv_dt",
				last_rcv_dt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_CL_CAN_R.$rcv_schd_adjst_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_BILL_CL_CAN_R.$rcv_schd_adjst_flg,
				"rcv_schd_adjst_flg",
				rcv_schd_adjst_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_CL_CAN_R.$edi_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_BILL_CL_CAN_R.$edi_flg,
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
			MST_BILL_CL_CAN_R.$exists_interim_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_BILL_CL_CAN_R.$exists_interim_flg,
				"exists_interim_flg",
				exists_interim_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_CL_CAN_R.$dtl_cnt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BILL_CL_CAN_R.$dtl_cnt,
				"dtl_cnt",
				dtl_cnt,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_CL_CAN_R.$sub_char1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_CL_CAN_R.$sub_char1,
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
			MST_BILL_CL_CAN_R.$sub_char2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_CL_CAN_R.$sub_char2,
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
			MST_BILL_CL_CAN_R.$sub_char3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_CL_CAN_R.$sub_char3,
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
			MST_BILL_CL_CAN_R.$ins_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_CL_CAN_R.$ins_usr_id,
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
			MST_BILL_CL_CAN_R.$ins_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_CL_CAN_R.$ins_usr_nm,
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
			MST_BILL_CL_CAN_R.$ins_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MST_BILL_CL_CAN_R.$ins_ts,
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
			MST_BILL_CL_CAN_R.$ins_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_CL_CAN_R.$ins_func_id,
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
			MST_BILL_CL_CAN_R.$upd_cntr,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BILL_CL_CAN_R.$upd_cntr,
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
			MST_BILL_CL_CAN_R.$upd_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_CL_CAN_R.$upd_usr_id,
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
			MST_BILL_CL_CAN_R.$upd_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_CL_CAN_R.$upd_usr_nm,
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
			MST_BILL_CL_CAN_R.$upd_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MST_BILL_CL_CAN_R.$upd_ts,
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
			MST_BILL_CL_CAN_R.$upd_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_CL_CAN_R.$upd_func_id,
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
			MST_BILL_CL_CAN_R.$upd_srv_req_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_CL_CAN_R.$upd_srv_req_no,
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
	public static MST_BILL_CL_CAN_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MST_BILL_CL_CAN_R create(String alias) {
		MST_BILL_CL_CAN_R row = new MST_BILL_CL_CAN_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MST_BILL_CL_CAN_R createByName(T proto) {
		MST_BILL_CL_CAN_R row = MST_BILL_CL_CAN_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MST_BILL_CL_CAN_R clone() {
		return (MST_BILL_CL_CAN_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MST_BILL_CL_CAN_R createInstance() {
		return (MST_BILL_CL_CAN_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MST_BILL_CL_CAN_R getValues(String... names) {
		return (MST_BILL_CL_CAN_R) super.getValues(names);
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
	 public MSW_BILL_CL_CAN_KEY_R getPkWorkDbc(String alias) {
	 	return MSW_BILL_CL_CAN_KEY_R.create(alias);
	 }

	/*
	 * MCDBContainerのオーバーライドメソッドです。
	 */
	 public MSW_BILL_CL_CAN_KEY_R getPkWorkDbc() {
	 	return getPkWorkDbc(MSW_BILL_CL_CAN_KEY_R.TABLE_NAME);
	 }

	/**
	 * 請求管理ＮＯ. Billing management No..<p>
	 *
	 */
	public String bill_mng_no() {
		return getConstString(offset + 0, $bill_mng_no);
	}

	/**
	 * 請求管理ＮＯ. Billing management No..<p>
	 *
	 */
	public void bill_mng_no(String value) {
		setConstString(offset + 0, $bill_mng_no, value);
	}

	/**
	 * 請求先ＣＤ. Billing customer cd..<p>
	 *
	 */
	public String bcst_cd() {
		return getConstString(offset + 1, $bcst_cd);
	}

	/**
	 * 請求先ＣＤ. Billing customer cd..<p>
	 *
	 */
	public void bcst_cd(String value) {
		setConstString(offset + 1, $bcst_cd, value);
	}

	/**
	 * 請求締年月日. Billing closing day.<p>
	 *
	 */
	public MCDate bill_cl_dt() {
		return getConstDate(offset + 2, $bill_cl_dt);
	}

	/**
	 * 請求締年月日. Billing closing day.<p>
	 *
	 */
	public void bill_cl_dt(MCDate value) {
		setConstDate(offset + 2, $bill_cl_dt, value);
	}

	/**
	 * 請求書ＮＯ. Invoice No..<p>
	 *
	 */
	public String bill_no() {
		return getConstString(offset + 3, $bill_no);
	}

	/**
	 * 請求書ＮＯ. Invoice No..<p>
	 *
	 */
	public void bill_no(String value) {
		setConstString(offset + 3, $bill_no, value);
	}

	/**
	 * 請求書改訂番号. Invoice rev. number.<p>
	 *
	 */
	public MCNumber bill_rev() {
		return getConstNumber(offset + 4, $bill_rev);
	}

	/**
	 * 請求書改訂番号. Invoice rev. number.<p>
	 *
	 */
	public void bill_rev(MCNumber value) {
		setConstNumber(offset + 4, $bill_rev, value);
	}
	
	/**
	 * 請求書改訂番号. Invoice rev. number.<p>
	 *
	 */
	public void bill_rev(int value) {
		setConstNumber(offset + 4, $bill_rev, value);
	}
	
	/**
	 * 請求書改訂番号. Invoice rev. number.<p>
	 *
	 */
	public void bill_rev(long value) {
		setConstNumber(offset + 4, $bill_rev, value);
	}
	
	/**
	 * 請求書改訂番号. Invoice rev. number.<p>
	 *
	 */
	public void bill_rev(float value) {
		setConstNumber(offset + 4, $bill_rev, value);
	}
	
	/**
	 * 請求書改訂番号. Invoice rev. number.<p>
	 *
	 */
	public void bill_rev(double value) {
		setConstNumber(offset + 4, $bill_rev, value);
	}
	
	/**
	 * 先行請求書ＮＯ. Advance invoice No..<p>
	 *
	 */
	public String pre_bill_no() {
		return getConstString(offset + 5, $pre_bill_no);
	}

	/**
	 * 先行請求書ＮＯ. Advance invoice No..<p>
	 *
	 */
	public void pre_bill_no(String value) {
		setConstString(offset + 5, $pre_bill_no, value);
	}

	/**
	 * 取引通貨ＣＤ. Transaction currency cd..<p>
	 *
	 */
	public String trd_cur_cd() {
		return getConstString(offset + 6, $trd_cur_cd);
	}

	/**
	 * 取引通貨ＣＤ. Transaction currency cd..<p>
	 *
	 */
	public void trd_cur_cd(String value) {
		setConstString(offset + 6, $trd_cur_cd, value);
	}

	/**
	 * 請求為替レート. Billing exchange rate.<p>
	 *
	 */
	public MCNumber bill_xrate() {
		return getConstNumber(offset + 7, $bill_xrate);
	}

	/**
	 * 請求為替レート. Billing exchange rate.<p>
	 *
	 */
	public void bill_xrate(MCNumber value) {
		setConstNumber(offset + 7, $bill_xrate, value);
	}
	
	/**
	 * 請求為替レート. Billing exchange rate.<p>
	 *
	 */
	public void bill_xrate(int value) {
		setConstNumber(offset + 7, $bill_xrate, value);
	}
	
	/**
	 * 請求為替レート. Billing exchange rate.<p>
	 *
	 */
	public void bill_xrate(long value) {
		setConstNumber(offset + 7, $bill_xrate, value);
	}
	
	/**
	 * 請求為替レート. Billing exchange rate.<p>
	 *
	 */
	public void bill_xrate(float value) {
		setConstNumber(offset + 7, $bill_xrate, value);
	}
	
	/**
	 * 請求為替レート. Billing exchange rate.<p>
	 *
	 */
	public void bill_xrate(double value) {
		setConstNumber(offset + 7, $bill_xrate, value);
	}
	
	/**
	 * インボイスＮＯ. Invoice No..<p>
	 *
	 */
	public String iv_no() {
		return getConstString(offset + 8, $iv_no);
	}

	/**
	 * インボイスＮＯ. Invoice No..<p>
	 *
	 */
	public void iv_no(String value) {
		setConstString(offset + 8, $iv_no, value);
	}

	/**
	 * 案件ＮＯ. Sales project No..<p>
	 *
	 */
	public String wrk_no() {
		return getConstString(offset + 9, $wrk_no);
	}

	/**
	 * 案件ＮＯ. Sales project No..<p>
	 *
	 */
	public void wrk_no(String value) {
		setConstString(offset + 9, $wrk_no, value);
	}

	/**
	 * 請求部門ＣＤ. Billing dept. cd..<p>
	 *
	 */
	public String bill_dpt_cd() {
		return getConstString(offset + 10, $bill_dpt_cd);
	}

	/**
	 * 請求部門ＣＤ. Billing dept. cd..<p>
	 *
	 */
	public void bill_dpt_cd(String value) {
		setConstString(offset + 10, $bill_dpt_cd, value);
	}

	/**
	 * ワーキンググループＣＤ. WG cd..<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 11, $wg_cd);
	}

	/**
	 * ワーキンググループＣＤ. WG cd..<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 11, $wg_cd, value);
	}

	/**
	 * 請求日. Billing date.<p>
	 *
	 */
	public MCDate bill_dt() {
		return getConstDate(offset + 12, $bill_dt);
	}

	/**
	 * 請求日. Billing date.<p>
	 *
	 */
	public void bill_dt(MCDate value) {
		setConstDate(offset + 12, $bill_dt, value);
	}

	/**
	 * 先行請求日. Advance billing date.<p>
	 *
	 */
	public MCDate pre_bill_dt() {
		return getConstDate(offset + 13, $pre_bill_dt);
	}

	/**
	 * 先行請求日. Advance billing date.<p>
	 *
	 */
	public void pre_bill_dt(MCDate value) {
		setConstDate(offset + 13, $pre_bill_dt, value);
	}

	/**
	 * 前回請求額. Last billing amount.<p>
	 *
	 */
	public MCNumber last_bill_amt() {
		return getConstNumber(offset + 14, $last_bill_amt);
	}

	/**
	 * 前回請求額. Last billing amount.<p>
	 *
	 */
	public void last_bill_amt(MCNumber value) {
		setConstNumber(offset + 14, $last_bill_amt, value);
	}
	
	/**
	 * 前回請求額. Last billing amount.<p>
	 *
	 */
	public void last_bill_amt(int value) {
		setConstNumber(offset + 14, $last_bill_amt, value);
	}
	
	/**
	 * 前回請求額. Last billing amount.<p>
	 *
	 */
	public void last_bill_amt(long value) {
		setConstNumber(offset + 14, $last_bill_amt, value);
	}
	
	/**
	 * 前回請求額. Last billing amount.<p>
	 *
	 */
	public void last_bill_amt(float value) {
		setConstNumber(offset + 14, $last_bill_amt, value);
	}
	
	/**
	 * 前回請求額. Last billing amount.<p>
	 *
	 */
	public void last_bill_amt(double value) {
		setConstNumber(offset + 14, $last_bill_amt, value);
	}
	
	/**
	 * 今回振込入金額. Current transfer payment received amount.<p>
	 *
	 */
	public MCNumber xfr_amt() {
		return getConstNumber(offset + 15, $xfr_amt);
	}

	/**
	 * 今回振込入金額. Current transfer payment received amount.<p>
	 *
	 */
	public void xfr_amt(MCNumber value) {
		setConstNumber(offset + 15, $xfr_amt, value);
	}
	
	/**
	 * 今回振込入金額. Current transfer payment received amount.<p>
	 *
	 */
	public void xfr_amt(int value) {
		setConstNumber(offset + 15, $xfr_amt, value);
	}
	
	/**
	 * 今回振込入金額. Current transfer payment received amount.<p>
	 *
	 */
	public void xfr_amt(long value) {
		setConstNumber(offset + 15, $xfr_amt, value);
	}
	
	/**
	 * 今回振込入金額. Current transfer payment received amount.<p>
	 *
	 */
	public void xfr_amt(float value) {
		setConstNumber(offset + 15, $xfr_amt, value);
	}
	
	/**
	 * 今回振込入金額. Current transfer payment received amount.<p>
	 *
	 */
	public void xfr_amt(double value) {
		setConstNumber(offset + 15, $xfr_amt, value);
	}
	
	/**
	 * 今回手形入金額. Current notes payment received amount.<p>
	 *
	 */
	public MCNumber note_amt() {
		return getConstNumber(offset + 16, $note_amt);
	}

	/**
	 * 今回手形入金額. Current notes payment received amount.<p>
	 *
	 */
	public void note_amt(MCNumber value) {
		setConstNumber(offset + 16, $note_amt, value);
	}
	
	/**
	 * 今回手形入金額. Current notes payment received amount.<p>
	 *
	 */
	public void note_amt(int value) {
		setConstNumber(offset + 16, $note_amt, value);
	}
	
	/**
	 * 今回手形入金額. Current notes payment received amount.<p>
	 *
	 */
	public void note_amt(long value) {
		setConstNumber(offset + 16, $note_amt, value);
	}
	
	/**
	 * 今回手形入金額. Current notes payment received amount.<p>
	 *
	 */
	public void note_amt(float value) {
		setConstNumber(offset + 16, $note_amt, value);
	}
	
	/**
	 * 今回手形入金額. Current notes payment received amount.<p>
	 *
	 */
	public void note_amt(double value) {
		setConstNumber(offset + 16, $note_amt, value);
	}
	
	/**
	 * 今回現金入金額. Current cash payment received amount.<p>
	 *
	 */
	public MCNumber cash_amt() {
		return getConstNumber(offset + 17, $cash_amt);
	}

	/**
	 * 今回現金入金額. Current cash payment received amount.<p>
	 *
	 */
	public void cash_amt(MCNumber value) {
		setConstNumber(offset + 17, $cash_amt, value);
	}
	
	/**
	 * 今回現金入金額. Current cash payment received amount.<p>
	 *
	 */
	public void cash_amt(int value) {
		setConstNumber(offset + 17, $cash_amt, value);
	}
	
	/**
	 * 今回現金入金額. Current cash payment received amount.<p>
	 *
	 */
	public void cash_amt(long value) {
		setConstNumber(offset + 17, $cash_amt, value);
	}
	
	/**
	 * 今回現金入金額. Current cash payment received amount.<p>
	 *
	 */
	public void cash_amt(float value) {
		setConstNumber(offset + 17, $cash_amt, value);
	}
	
	/**
	 * 今回現金入金額. Current cash payment received amount.<p>
	 *
	 */
	public void cash_amt(double value) {
		setConstNumber(offset + 17, $cash_amt, value);
	}
	
	/**
	 * 今回相殺額. Current offset amount.<p>
	 *
	 */
	public MCNumber setoff_amt() {
		return getConstNumber(offset + 18, $setoff_amt);
	}

	/**
	 * 今回相殺額. Current offset amount.<p>
	 *
	 */
	public void setoff_amt(MCNumber value) {
		setConstNumber(offset + 18, $setoff_amt, value);
	}
	
	/**
	 * 今回相殺額. Current offset amount.<p>
	 *
	 */
	public void setoff_amt(int value) {
		setConstNumber(offset + 18, $setoff_amt, value);
	}
	
	/**
	 * 今回相殺額. Current offset amount.<p>
	 *
	 */
	public void setoff_amt(long value) {
		setConstNumber(offset + 18, $setoff_amt, value);
	}
	
	/**
	 * 今回相殺額. Current offset amount.<p>
	 *
	 */
	public void setoff_amt(float value) {
		setConstNumber(offset + 18, $setoff_amt, value);
	}
	
	/**
	 * 今回相殺額. Current offset amount.<p>
	 *
	 */
	public void setoff_amt(double value) {
		setConstNumber(offset + 18, $setoff_amt, value);
	}
	
	/**
	 * 今回相殺税額. Current offset tax amount.<p>
	 *
	 */
	public MCNumber setoff_tax_amt() {
		return getConstNumber(offset + 19, $setoff_tax_amt);
	}

	/**
	 * 今回相殺税額. Current offset tax amount.<p>
	 *
	 */
	public void setoff_tax_amt(MCNumber value) {
		setConstNumber(offset + 19, $setoff_tax_amt, value);
	}
	
	/**
	 * 今回相殺税額. Current offset tax amount.<p>
	 *
	 */
	public void setoff_tax_amt(int value) {
		setConstNumber(offset + 19, $setoff_tax_amt, value);
	}
	
	/**
	 * 今回相殺税額. Current offset tax amount.<p>
	 *
	 */
	public void setoff_tax_amt(long value) {
		setConstNumber(offset + 19, $setoff_tax_amt, value);
	}
	
	/**
	 * 今回相殺税額. Current offset tax amount.<p>
	 *
	 */
	public void setoff_tax_amt(float value) {
		setConstNumber(offset + 19, $setoff_tax_amt, value);
	}
	
	/**
	 * 今回相殺税額. Current offset tax amount.<p>
	 *
	 */
	public void setoff_tax_amt(double value) {
		setConstNumber(offset + 19, $setoff_tax_amt, value);
	}
	
	/**
	 * 今回振替額. Current transfer amount.<p>
	 *
	 */
	public MCNumber sw_amt() {
		return getConstNumber(offset + 20, $sw_amt);
	}

	/**
	 * 今回振替額. Current transfer amount.<p>
	 *
	 */
	public void sw_amt(MCNumber value) {
		setConstNumber(offset + 20, $sw_amt, value);
	}
	
	/**
	 * 今回振替額. Current transfer amount.<p>
	 *
	 */
	public void sw_amt(int value) {
		setConstNumber(offset + 20, $sw_amt, value);
	}
	
	/**
	 * 今回振替額. Current transfer amount.<p>
	 *
	 */
	public void sw_amt(long value) {
		setConstNumber(offset + 20, $sw_amt, value);
	}
	
	/**
	 * 今回振替額. Current transfer amount.<p>
	 *
	 */
	public void sw_amt(float value) {
		setConstNumber(offset + 20, $sw_amt, value);
	}
	
	/**
	 * 今回振替額. Current transfer amount.<p>
	 *
	 */
	public void sw_amt(double value) {
		setConstNumber(offset + 20, $sw_amt, value);
	}
	
	/**
	 * 今回繰越額. Current carry-over amount.<p>
	 *
	 */
	public MCNumber bfw_amt() {
		return getConstNumber(offset + 21, $bfw_amt);
	}

	/**
	 * 今回繰越額. Current carry-over amount.<p>
	 *
	 */
	public void bfw_amt(MCNumber value) {
		setConstNumber(offset + 21, $bfw_amt, value);
	}
	
	/**
	 * 今回繰越額. Current carry-over amount.<p>
	 *
	 */
	public void bfw_amt(int value) {
		setConstNumber(offset + 21, $bfw_amt, value);
	}
	
	/**
	 * 今回繰越額. Current carry-over amount.<p>
	 *
	 */
	public void bfw_amt(long value) {
		setConstNumber(offset + 21, $bfw_amt, value);
	}
	
	/**
	 * 今回繰越額. Current carry-over amount.<p>
	 *
	 */
	public void bfw_amt(float value) {
		setConstNumber(offset + 21, $bfw_amt, value);
	}
	
	/**
	 * 今回繰越額. Current carry-over amount.<p>
	 *
	 */
	public void bfw_amt(double value) {
		setConstNumber(offset + 21, $bfw_amt, value);
	}
	
	/**
	 * 今回売上額. Current sales amount.<p>
	 *
	 */
	public MCNumber sls_amt() {
		return getConstNumber(offset + 22, $sls_amt);
	}

	/**
	 * 今回売上額. Current sales amount.<p>
	 *
	 */
	public void sls_amt(MCNumber value) {
		setConstNumber(offset + 22, $sls_amt, value);
	}
	
	/**
	 * 今回売上額. Current sales amount.<p>
	 *
	 */
	public void sls_amt(int value) {
		setConstNumber(offset + 22, $sls_amt, value);
	}
	
	/**
	 * 今回売上額. Current sales amount.<p>
	 *
	 */
	public void sls_amt(long value) {
		setConstNumber(offset + 22, $sls_amt, value);
	}
	
	/**
	 * 今回売上額. Current sales amount.<p>
	 *
	 */
	public void sls_amt(float value) {
		setConstNumber(offset + 22, $sls_amt, value);
	}
	
	/**
	 * 今回売上額. Current sales amount.<p>
	 *
	 */
	public void sls_amt(double value) {
		setConstNumber(offset + 22, $sls_amt, value);
	}
	
	/**
	 * 今回返品額. Current return amount.<p>
	 *
	 */
	public MCNumber ret_amt() {
		return getConstNumber(offset + 23, $ret_amt);
	}

	/**
	 * 今回返品額. Current return amount.<p>
	 *
	 */
	public void ret_amt(MCNumber value) {
		setConstNumber(offset + 23, $ret_amt, value);
	}
	
	/**
	 * 今回返品額. Current return amount.<p>
	 *
	 */
	public void ret_amt(int value) {
		setConstNumber(offset + 23, $ret_amt, value);
	}
	
	/**
	 * 今回返品額. Current return amount.<p>
	 *
	 */
	public void ret_amt(long value) {
		setConstNumber(offset + 23, $ret_amt, value);
	}
	
	/**
	 * 今回返品額. Current return amount.<p>
	 *
	 */
	public void ret_amt(float value) {
		setConstNumber(offset + 23, $ret_amt, value);
	}
	
	/**
	 * 今回返品額. Current return amount.<p>
	 *
	 */
	public void ret_amt(double value) {
		setConstNumber(offset + 23, $ret_amt, value);
	}
	
	/**
	 * 今回値引額. Current discount amount.<p>
	 *
	 */
	public MCNumber dscnt_amt() {
		return getConstNumber(offset + 24, $dscnt_amt);
	}

	/**
	 * 今回値引額. Current discount amount.<p>
	 *
	 */
	public void dscnt_amt(MCNumber value) {
		setConstNumber(offset + 24, $dscnt_amt, value);
	}
	
	/**
	 * 今回値引額. Current discount amount.<p>
	 *
	 */
	public void dscnt_amt(int value) {
		setConstNumber(offset + 24, $dscnt_amt, value);
	}
	
	/**
	 * 今回値引額. Current discount amount.<p>
	 *
	 */
	public void dscnt_amt(long value) {
		setConstNumber(offset + 24, $dscnt_amt, value);
	}
	
	/**
	 * 今回値引額. Current discount amount.<p>
	 *
	 */
	public void dscnt_amt(float value) {
		setConstNumber(offset + 24, $dscnt_amt, value);
	}
	
	/**
	 * 今回値引額. Current discount amount.<p>
	 *
	 */
	public void dscnt_amt(double value) {
		setConstNumber(offset + 24, $dscnt_amt, value);
	}
	
	/**
	 * 今回振替額（振替先）. Current transfer amount (Transfer destination).<p>
	 *
	 */
	public MCNumber sw_to_amt() {
		return getConstNumber(offset + 25, $sw_to_amt);
	}

	/**
	 * 今回振替額（振替先）. Current transfer amount (Transfer destination).<p>
	 *
	 */
	public void sw_to_amt(MCNumber value) {
		setConstNumber(offset + 25, $sw_to_amt, value);
	}
	
	/**
	 * 今回振替額（振替先）. Current transfer amount (Transfer destination).<p>
	 *
	 */
	public void sw_to_amt(int value) {
		setConstNumber(offset + 25, $sw_to_amt, value);
	}
	
	/**
	 * 今回振替額（振替先）. Current transfer amount (Transfer destination).<p>
	 *
	 */
	public void sw_to_amt(long value) {
		setConstNumber(offset + 25, $sw_to_amt, value);
	}
	
	/**
	 * 今回振替額（振替先）. Current transfer amount (Transfer destination).<p>
	 *
	 */
	public void sw_to_amt(float value) {
		setConstNumber(offset + 25, $sw_to_amt, value);
	}
	
	/**
	 * 今回振替額（振替先）. Current transfer amount (Transfer destination).<p>
	 *
	 */
	public void sw_to_amt(double value) {
		setConstNumber(offset + 25, $sw_to_amt, value);
	}
	
	/**
	 * 今回税額. Current tax amount.<p>
	 *
	 */
	public MCNumber tax_amt() {
		return getConstNumber(offset + 26, $tax_amt);
	}

	/**
	 * 今回税額. Current tax amount.<p>
	 *
	 */
	public void tax_amt(MCNumber value) {
		setConstNumber(offset + 26, $tax_amt, value);
	}
	
	/**
	 * 今回税額. Current tax amount.<p>
	 *
	 */
	public void tax_amt(int value) {
		setConstNumber(offset + 26, $tax_amt, value);
	}
	
	/**
	 * 今回税額. Current tax amount.<p>
	 *
	 */
	public void tax_amt(long value) {
		setConstNumber(offset + 26, $tax_amt, value);
	}
	
	/**
	 * 今回税額. Current tax amount.<p>
	 *
	 */
	public void tax_amt(float value) {
		setConstNumber(offset + 26, $tax_amt, value);
	}
	
	/**
	 * 今回税額. Current tax amount.<p>
	 *
	 */
	public void tax_amt(double value) {
		setConstNumber(offset + 26, $tax_amt, value);
	}
	
	/**
	 * 今回請求額. Current billing amount.<p>
	 *
	 */
	public MCNumber bill_amt() {
		return getConstNumber(offset + 27, $bill_amt);
	}

	/**
	 * 今回請求額. Current billing amount.<p>
	 *
	 */
	public void bill_amt(MCNumber value) {
		setConstNumber(offset + 27, $bill_amt, value);
	}
	
	/**
	 * 今回請求額. Current billing amount.<p>
	 *
	 */
	public void bill_amt(int value) {
		setConstNumber(offset + 27, $bill_amt, value);
	}
	
	/**
	 * 今回請求額. Current billing amount.<p>
	 *
	 */
	public void bill_amt(long value) {
		setConstNumber(offset + 27, $bill_amt, value);
	}
	
	/**
	 * 今回請求額. Current billing amount.<p>
	 *
	 */
	public void bill_amt(float value) {
		setConstNumber(offset + 27, $bill_amt, value);
	}
	
	/**
	 * 今回請求額. Current billing amount.<p>
	 *
	 */
	public void bill_amt(double value) {
		setConstNumber(offset + 27, $bill_amt, value);
	}
	
	/**
	 * 前受金残高. Advance received balance.<p>
	 *
	 */
	public MCNumber adv_amt_bal() {
		return getConstNumber(offset + 28, $adv_amt_bal);
	}

	/**
	 * 前受金残高. Advance received balance.<p>
	 *
	 */
	public void adv_amt_bal(MCNumber value) {
		setConstNumber(offset + 28, $adv_amt_bal, value);
	}
	
	/**
	 * 前受金残高. Advance received balance.<p>
	 *
	 */
	public void adv_amt_bal(int value) {
		setConstNumber(offset + 28, $adv_amt_bal, value);
	}
	
	/**
	 * 前受金残高. Advance received balance.<p>
	 *
	 */
	public void adv_amt_bal(long value) {
		setConstNumber(offset + 28, $adv_amt_bal, value);
	}
	
	/**
	 * 前受金残高. Advance received balance.<p>
	 *
	 */
	public void adv_amt_bal(float value) {
		setConstNumber(offset + 28, $adv_amt_bal, value);
	}
	
	/**
	 * 前受金残高. Advance received balance.<p>
	 *
	 */
	public void adv_amt_bal(double value) {
		setConstNumber(offset + 28, $adv_amt_bal, value);
	}
	
	/**
	 * 前受金入金額. Advance received payment amount.<p>
	 *
	 */
	public MCNumber adv_amt() {
		return getConstNumber(offset + 29, $adv_amt);
	}

	/**
	 * 前受金入金額. Advance received payment amount.<p>
	 *
	 */
	public void adv_amt(MCNumber value) {
		setConstNumber(offset + 29, $adv_amt, value);
	}
	
	/**
	 * 前受金入金額. Advance received payment amount.<p>
	 *
	 */
	public void adv_amt(int value) {
		setConstNumber(offset + 29, $adv_amt, value);
	}
	
	/**
	 * 前受金入金額. Advance received payment amount.<p>
	 *
	 */
	public void adv_amt(long value) {
		setConstNumber(offset + 29, $adv_amt, value);
	}
	
	/**
	 * 前受金入金額. Advance received payment amount.<p>
	 *
	 */
	public void adv_amt(float value) {
		setConstNumber(offset + 29, $adv_amt, value);
	}
	
	/**
	 * 前受金入金額. Advance received payment amount.<p>
	 *
	 */
	public void adv_amt(double value) {
		setConstNumber(offset + 29, $adv_amt, value);
	}
	
	/**
	 * 前受金相殺額. Advance received offset amount.<p>
	 *
	 */
	public MCNumber adv_setoff_amt() {
		return getConstNumber(offset + 30, $adv_setoff_amt);
	}

	/**
	 * 前受金相殺額. Advance received offset amount.<p>
	 *
	 */
	public void adv_setoff_amt(MCNumber value) {
		setConstNumber(offset + 30, $adv_setoff_amt, value);
	}
	
	/**
	 * 前受金相殺額. Advance received offset amount.<p>
	 *
	 */
	public void adv_setoff_amt(int value) {
		setConstNumber(offset + 30, $adv_setoff_amt, value);
	}
	
	/**
	 * 前受金相殺額. Advance received offset amount.<p>
	 *
	 */
	public void adv_setoff_amt(long value) {
		setConstNumber(offset + 30, $adv_setoff_amt, value);
	}
	
	/**
	 * 前受金相殺額. Advance received offset amount.<p>
	 *
	 */
	public void adv_setoff_amt(float value) {
		setConstNumber(offset + 30, $adv_setoff_amt, value);
	}
	
	/**
	 * 前受金相殺額. Advance received offset amount.<p>
	 *
	 */
	public void adv_setoff_amt(double value) {
		setConstNumber(offset + 30, $adv_setoff_amt, value);
	}
	
	/**
	 * 前受金相殺税額. Advance received offset tax amount.<p>
	 *
	 */
	public MCNumber adv_setoff_tax_amt() {
		return getConstNumber(offset + 31, $adv_setoff_tax_amt);
	}

	/**
	 * 前受金相殺税額. Advance received offset tax amount.<p>
	 *
	 */
	public void adv_setoff_tax_amt(MCNumber value) {
		setConstNumber(offset + 31, $adv_setoff_tax_amt, value);
	}
	
	/**
	 * 前受金相殺税額. Advance received offset tax amount.<p>
	 *
	 */
	public void adv_setoff_tax_amt(int value) {
		setConstNumber(offset + 31, $adv_setoff_tax_amt, value);
	}
	
	/**
	 * 前受金相殺税額. Advance received offset tax amount.<p>
	 *
	 */
	public void adv_setoff_tax_amt(long value) {
		setConstNumber(offset + 31, $adv_setoff_tax_amt, value);
	}
	
	/**
	 * 前受金相殺税額. Advance received offset tax amount.<p>
	 *
	 */
	public void adv_setoff_tax_amt(float value) {
		setConstNumber(offset + 31, $adv_setoff_tax_amt, value);
	}
	
	/**
	 * 前受金相殺税額. Advance received offset tax amount.<p>
	 *
	 */
	public void adv_setoff_tax_amt(double value) {
		setConstNumber(offset + 31, $adv_setoff_tax_amt, value);
	}
	
	/**
	 * 売上都度請求ＦＬＧ. Billing at each sales flg..<p>
	 *
	 */
	public boolean bill_each_sls_flg() {
		return getConstBoolean(offset + 32, $bill_each_sls_flg);
	}

	/**
	 * 売上都度請求ＦＬＧ. Billing at each sales flg..<p>
	 *
	 */
	public void bill_each_sls_flg(boolean value) {
		setConstBoolean(offset + 32, $bill_each_sls_flg, value);
	}

	/**
	 * 請求締状況区分. Billing closing status type.<p>
	 *
	 */
	public String bill_cl_sts_typ() {
		return getConstString(offset + 33, $bill_cl_sts_typ);
	}

	/**
	 * 請求締状況区分. Billing closing status type.<p>
	 *
	 */
	public void bill_cl_sts_typ(String value) {
		setConstString(offset + 33, $bill_cl_sts_typ, value);
	}

	/**
	 * 請求締処理区分. Billing closing type.<p>
	 *
	 */
	public String bill_cl_typ() {
		return getConstString(offset + 34, $bill_cl_typ);
	}

	/**
	 * 請求締処理区分. Billing closing type.<p>
	 *
	 */
	public void bill_cl_typ(String value) {
		setConstString(offset + 34, $bill_cl_typ, value);
	}

	/**
	 * 国外ＦＬＧ. Foreign flg..<p>
	 *
	 */
	public boolean foreign_flg() {
		return getConstBoolean(offset + 35, $foreign_flg);
	}

	/**
	 * 国外ＦＬＧ. Foreign flg..<p>
	 *
	 */
	public void foreign_flg(boolean value) {
		setConstBoolean(offset + 35, $foreign_flg, value);
	}

	/**
	 * 税計算区分. Tax calculation type.<p>
	 *
	 */
	public String bill_tax_calc_typ() {
		return getConstString(offset + 36, $bill_tax_calc_typ);
	}

	/**
	 * 税計算区分. Tax calculation type.<p>
	 *
	 */
	public void bill_tax_calc_typ(String value) {
		setConstString(offset + 36, $bill_tax_calc_typ, value);
	}

	/**
	 * 発行済ＦＬＧ. Issued flg..<p>
	 *
	 */
	public boolean prnt_flg() {
		return getConstBoolean(offset + 37, $prnt_flg);
	}

	/**
	 * 発行済ＦＬＧ. Issued flg..<p>
	 *
	 */
	public void prnt_flg(boolean value) {
		setConstBoolean(offset + 37, $prnt_flg, value);
	}

	/**
	 * 請求書要否ＦＬＧ. Invoice required flg..<p>
	 *
	 */
	public boolean bill_rq_flg() {
		return getConstBoolean(offset + 38, $bill_rq_flg);
	}

	/**
	 * 請求書要否ＦＬＧ. Invoice required flg..<p>
	 *
	 */
	public void bill_rq_flg(boolean value) {
		setConstBoolean(offset + 38, $bill_rq_flg, value);
	}

	/**
	 * 基準日. Base date.<p>
	 *
	 */
	public MCDate base_dt() {
		return getConstDate(offset + 39, $base_dt);
	}

	/**
	 * 基準日. Base date.<p>
	 *
	 */
	public void base_dt(MCDate value) {
		setConstDate(offset + 39, $base_dt, value);
	}

	/**
	 * 入金予定額. Amount of payment receipt schedule.<p>
	 *
	 */
	public MCNumber rcv_schd_amt() {
		return getConstNumber(offset + 40, $rcv_schd_amt);
	}

	/**
	 * 入金予定額. Amount of payment receipt schedule.<p>
	 *
	 */
	public void rcv_schd_amt(MCNumber value) {
		setConstNumber(offset + 40, $rcv_schd_amt, value);
	}
	
	/**
	 * 入金予定額. Amount of payment receipt schedule.<p>
	 *
	 */
	public void rcv_schd_amt(int value) {
		setConstNumber(offset + 40, $rcv_schd_amt, value);
	}
	
	/**
	 * 入金予定額. Amount of payment receipt schedule.<p>
	 *
	 */
	public void rcv_schd_amt(long value) {
		setConstNumber(offset + 40, $rcv_schd_amt, value);
	}
	
	/**
	 * 入金予定額. Amount of payment receipt schedule.<p>
	 *
	 */
	public void rcv_schd_amt(float value) {
		setConstNumber(offset + 40, $rcv_schd_amt, value);
	}
	
	/**
	 * 入金予定額. Amount of payment receipt schedule.<p>
	 *
	 */
	public void rcv_schd_amt(double value) {
		setConstNumber(offset + 40, $rcv_schd_amt, value);
	}
	
	/**
	 * 入金実績額. Payment received result amount.<p>
	 *
	 */
	public MCNumber rcv_act_amt() {
		return getConstNumber(offset + 41, $rcv_act_amt);
	}

	/**
	 * 入金実績額. Payment received result amount.<p>
	 *
	 */
	public void rcv_act_amt(MCNumber value) {
		setConstNumber(offset + 41, $rcv_act_amt, value);
	}
	
	/**
	 * 入金実績額. Payment received result amount.<p>
	 *
	 */
	public void rcv_act_amt(int value) {
		setConstNumber(offset + 41, $rcv_act_amt, value);
	}
	
	/**
	 * 入金実績額. Payment received result amount.<p>
	 *
	 */
	public void rcv_act_amt(long value) {
		setConstNumber(offset + 41, $rcv_act_amt, value);
	}
	
	/**
	 * 入金実績額. Payment received result amount.<p>
	 *
	 */
	public void rcv_act_amt(float value) {
		setConstNumber(offset + 41, $rcv_act_amt, value);
	}
	
	/**
	 * 入金実績額. Payment received result amount.<p>
	 *
	 */
	public void rcv_act_amt(double value) {
		setConstNumber(offset + 41, $rcv_act_amt, value);
	}
	
	/**
	 * 未消込残高. Unreconciled balance.<p>
	 *
	 */
	public MCNumber not_appl_bal() {
		return getConstNumber(offset + 42, $not_appl_bal);
	}

	/**
	 * 未消込残高. Unreconciled balance.<p>
	 *
	 */
	public void not_appl_bal(MCNumber value) {
		setConstNumber(offset + 42, $not_appl_bal, value);
	}
	
	/**
	 * 未消込残高. Unreconciled balance.<p>
	 *
	 */
	public void not_appl_bal(int value) {
		setConstNumber(offset + 42, $not_appl_bal, value);
	}
	
	/**
	 * 未消込残高. Unreconciled balance.<p>
	 *
	 */
	public void not_appl_bal(long value) {
		setConstNumber(offset + 42, $not_appl_bal, value);
	}
	
	/**
	 * 未消込残高. Unreconciled balance.<p>
	 *
	 */
	public void not_appl_bal(float value) {
		setConstNumber(offset + 42, $not_appl_bal, value);
	}
	
	/**
	 * 未消込残高. Unreconciled balance.<p>
	 *
	 */
	public void not_appl_bal(double value) {
		setConstNumber(offset + 42, $not_appl_bal, value);
	}
	
	/**
	 * 最終入金日. Last payment received date.<p>
	 *
	 */
	public MCDate last_rcv_dt() {
		return getConstDate(offset + 43, $last_rcv_dt);
	}

	/**
	 * 最終入金日. Last payment received date.<p>
	 *
	 */
	public void last_rcv_dt(MCDate value) {
		setConstDate(offset + 43, $last_rcv_dt, value);
	}

	/**
	 * 入金予定調整済ＦＬＧ. Payment receipt schedule adjusted flg..<p>
	 *
	 */
	public boolean rcv_schd_adjst_flg() {
		return getConstBoolean(offset + 44, $rcv_schd_adjst_flg);
	}

	/**
	 * 入金予定調整済ＦＬＧ. Payment receipt schedule adjusted flg..<p>
	 *
	 */
	public void rcv_schd_adjst_flg(boolean value) {
		setConstBoolean(offset + 44, $rcv_schd_adjst_flg, value);
	}

	/**
	 * ＥＤＩＦＬＧ. EDI flg..<p>
	 *
	 */
	public boolean edi_flg() {
		return getConstBoolean(offset + 45, $edi_flg);
	}

	/**
	 * ＥＤＩＦＬＧ. EDI flg..<p>
	 *
	 */
	public void edi_flg(boolean value) {
		setConstBoolean(offset + 45, $edi_flg, value);
	}

	/**
	 * 仮単価存在ＦＬＧ. Temporary unit price exist flg..<p>
	 *
	 */
	public boolean exists_interim_flg() {
		return getConstBoolean(offset + 46, $exists_interim_flg);
	}

	/**
	 * 仮単価存在ＦＬＧ. Temporary unit price exist flg..<p>
	 *
	 */
	public void exists_interim_flg(boolean value) {
		setConstBoolean(offset + 46, $exists_interim_flg, value);
	}

	/**
	 * 請求明細数. Number of billing details.<p>
	 *
	 */
	public MCNumber dtl_cnt() {
		return getConstNumber(offset + 47, $dtl_cnt);
	}

	/**
	 * 請求明細数. Number of billing details.<p>
	 *
	 */
	public void dtl_cnt(MCNumber value) {
		setConstNumber(offset + 47, $dtl_cnt, value);
	}
	
	/**
	 * 請求明細数. Number of billing details.<p>
	 *
	 */
	public void dtl_cnt(int value) {
		setConstNumber(offset + 47, $dtl_cnt, value);
	}
	
	/**
	 * 請求明細数. Number of billing details.<p>
	 *
	 */
	public void dtl_cnt(long value) {
		setConstNumber(offset + 47, $dtl_cnt, value);
	}
	
	/**
	 * 請求明細数. Number of billing details.<p>
	 *
	 */
	public void dtl_cnt(float value) {
		setConstNumber(offset + 47, $dtl_cnt, value);
	}
	
	/**
	 * 請求明細数. Number of billing details.<p>
	 *
	 */
	public void dtl_cnt(double value) {
		setConstNumber(offset + 47, $dtl_cnt, value);
	}
	
	/**
	 * 予備１. Spare 1.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 48, $sub_char1);
	}

	/**
	 * 予備１. Spare 1.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 48, $sub_char1, value);
	}

	/**
	 * 予備２. Spare 2.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 49, $sub_char2);
	}

	/**
	 * 予備２. Spare 2.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 49, $sub_char2, value);
	}

	/**
	 * 予備３. Spare 3.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 50, $sub_char3);
	}

	/**
	 * 予備３. Spare 3.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 50, $sub_char3, value);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 51, $ins_usr_id);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 51, $ins_usr_id, value);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 52, $ins_usr_nm);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 52, $ins_usr_nm, value);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 53, $ins_ts);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 53, $ins_ts, value);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 54, $ins_func_id);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 54, $ins_func_id, value);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 55, $upd_cntr);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 55, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 55, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 55, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 55, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 55, $upd_cntr, value);
	}
	
	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 56, $upd_usr_id);
	}

	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 56, $upd_usr_id, value);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 57, $upd_usr_nm);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 57, $upd_usr_nm, value);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 58, $upd_ts);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 58, $upd_ts, value);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 59, $upd_func_id);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 59, $upd_func_id, value);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 60, $upd_srv_req_no);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 60, $upd_srv_req_no, value);
	}

	public String getString(String name) {
		if ($bill_mng_no.equalsIgnoreCase(name)) {
			return bill_mng_no();
		}
		if ($bcst_cd.equalsIgnoreCase(name)) {
			return bcst_cd();
		}
		if ($bill_no.equalsIgnoreCase(name)) {
			return bill_no();
		}
		if ($pre_bill_no.equalsIgnoreCase(name)) {
			return pre_bill_no();
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			return iv_no();
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			return wrk_no();
		}
		if ($bill_dpt_cd.equalsIgnoreCase(name)) {
			return bill_dpt_cd();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($bill_cl_sts_typ.equalsIgnoreCase(name)) {
			return bill_cl_sts_typ();
		}
		if ($bill_cl_typ.equalsIgnoreCase(name)) {
			return bill_cl_typ();
		}
		if ($bill_tax_calc_typ.equalsIgnoreCase(name)) {
			return bill_tax_calc_typ();
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
		if ($bill_rev.equalsIgnoreCase(name)) {
			return bill_rev();
		}
		if ($bill_xrate.equalsIgnoreCase(name)) {
			return bill_xrate();
		}
		if ($last_bill_amt.equalsIgnoreCase(name)) {
			return last_bill_amt();
		}
		if ($xfr_amt.equalsIgnoreCase(name)) {
			return xfr_amt();
		}
		if ($note_amt.equalsIgnoreCase(name)) {
			return note_amt();
		}
		if ($cash_amt.equalsIgnoreCase(name)) {
			return cash_amt();
		}
		if ($setoff_amt.equalsIgnoreCase(name)) {
			return setoff_amt();
		}
		if ($setoff_tax_amt.equalsIgnoreCase(name)) {
			return setoff_tax_amt();
		}
		if ($sw_amt.equalsIgnoreCase(name)) {
			return sw_amt();
		}
		if ($bfw_amt.equalsIgnoreCase(name)) {
			return bfw_amt();
		}
		if ($sls_amt.equalsIgnoreCase(name)) {
			return sls_amt();
		}
		if ($ret_amt.equalsIgnoreCase(name)) {
			return ret_amt();
		}
		if ($dscnt_amt.equalsIgnoreCase(name)) {
			return dscnt_amt();
		}
		if ($sw_to_amt.equalsIgnoreCase(name)) {
			return sw_to_amt();
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			return tax_amt();
		}
		if ($bill_amt.equalsIgnoreCase(name)) {
			return bill_amt();
		}
		if ($adv_amt_bal.equalsIgnoreCase(name)) {
			return adv_amt_bal();
		}
		if ($adv_amt.equalsIgnoreCase(name)) {
			return adv_amt();
		}
		if ($adv_setoff_amt.equalsIgnoreCase(name)) {
			return adv_setoff_amt();
		}
		if ($adv_setoff_tax_amt.equalsIgnoreCase(name)) {
			return adv_setoff_tax_amt();
		}
		if ($rcv_schd_amt.equalsIgnoreCase(name)) {
			return rcv_schd_amt();
		}
		if ($rcv_act_amt.equalsIgnoreCase(name)) {
			return rcv_act_amt();
		}
		if ($not_appl_bal.equalsIgnoreCase(name)) {
			return not_appl_bal();
		}
		if ($dtl_cnt.equalsIgnoreCase(name)) {
			return dtl_cnt();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumber(name);
	}

	public MCDate getDate(String name) {
		if ($bill_cl_dt.equalsIgnoreCase(name)) {
			return bill_cl_dt();
		}
		if ($bill_dt.equalsIgnoreCase(name)) {
			return bill_dt();
		}
		if ($pre_bill_dt.equalsIgnoreCase(name)) {
			return pre_bill_dt();
		}
		if ($base_dt.equalsIgnoreCase(name)) {
			return base_dt();
		}
		if ($last_rcv_dt.equalsIgnoreCase(name)) {
			return last_rcv_dt();
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
		if ($bill_each_sls_flg.equalsIgnoreCase(name)) {
			return bill_each_sls_flg();
		}
		if ($foreign_flg.equalsIgnoreCase(name)) {
			return foreign_flg();
		}
		if ($prnt_flg.equalsIgnoreCase(name)) {
			return prnt_flg();
		}
		if ($bill_rq_flg.equalsIgnoreCase(name)) {
			return bill_rq_flg();
		}
		if ($rcv_schd_adjst_flg.equalsIgnoreCase(name)) {
			return rcv_schd_adjst_flg();
		}
		if ($edi_flg.equalsIgnoreCase(name)) {
			return edi_flg();
		}
		if ($exists_interim_flg.equalsIgnoreCase(name)) {
			return exists_interim_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($bill_mng_no.equalsIgnoreCase(name)) {
			return bill_mng_no();
		}
		if ($bcst_cd.equalsIgnoreCase(name)) {
			return bcst_cd();
		}
		if ($bill_no.equalsIgnoreCase(name)) {
			return bill_no();
		}
		if ($pre_bill_no.equalsIgnoreCase(name)) {
			return pre_bill_no();
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			return iv_no();
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			return wrk_no();
		}
		if ($bill_dpt_cd.equalsIgnoreCase(name)) {
			return bill_dpt_cd();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($bill_cl_sts_typ.equalsIgnoreCase(name)) {
			return bill_cl_sts_typ();
		}
		if ($bill_cl_typ.equalsIgnoreCase(name)) {
			return bill_cl_typ();
		}
		if ($bill_tax_calc_typ.equalsIgnoreCase(name)) {
			return bill_tax_calc_typ();
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
		if ($bill_rev.equalsIgnoreCase(name)) {
			return bill_rev();
		}
		if ($bill_xrate.equalsIgnoreCase(name)) {
			return bill_xrate();
		}
		if ($last_bill_amt.equalsIgnoreCase(name)) {
			return last_bill_amt();
		}
		if ($xfr_amt.equalsIgnoreCase(name)) {
			return xfr_amt();
		}
		if ($note_amt.equalsIgnoreCase(name)) {
			return note_amt();
		}
		if ($cash_amt.equalsIgnoreCase(name)) {
			return cash_amt();
		}
		if ($setoff_amt.equalsIgnoreCase(name)) {
			return setoff_amt();
		}
		if ($setoff_tax_amt.equalsIgnoreCase(name)) {
			return setoff_tax_amt();
		}
		if ($sw_amt.equalsIgnoreCase(name)) {
			return sw_amt();
		}
		if ($bfw_amt.equalsIgnoreCase(name)) {
			return bfw_amt();
		}
		if ($sls_amt.equalsIgnoreCase(name)) {
			return sls_amt();
		}
		if ($ret_amt.equalsIgnoreCase(name)) {
			return ret_amt();
		}
		if ($dscnt_amt.equalsIgnoreCase(name)) {
			return dscnt_amt();
		}
		if ($sw_to_amt.equalsIgnoreCase(name)) {
			return sw_to_amt();
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			return tax_amt();
		}
		if ($bill_amt.equalsIgnoreCase(name)) {
			return bill_amt();
		}
		if ($adv_amt_bal.equalsIgnoreCase(name)) {
			return adv_amt_bal();
		}
		if ($adv_amt.equalsIgnoreCase(name)) {
			return adv_amt();
		}
		if ($adv_setoff_amt.equalsIgnoreCase(name)) {
			return adv_setoff_amt();
		}
		if ($adv_setoff_tax_amt.equalsIgnoreCase(name)) {
			return adv_setoff_tax_amt();
		}
		if ($rcv_schd_amt.equalsIgnoreCase(name)) {
			return rcv_schd_amt();
		}
		if ($rcv_act_amt.equalsIgnoreCase(name)) {
			return rcv_act_amt();
		}
		if ($not_appl_bal.equalsIgnoreCase(name)) {
			return not_appl_bal();
		}
		if ($dtl_cnt.equalsIgnoreCase(name)) {
			return dtl_cnt();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumberNE(name);
	}

	public MCDate getDateNE(String name) {
		if ($bill_cl_dt.equalsIgnoreCase(name)) {
			return bill_cl_dt();
		}
		if ($bill_dt.equalsIgnoreCase(name)) {
			return bill_dt();
		}
		if ($pre_bill_dt.equalsIgnoreCase(name)) {
			return pre_bill_dt();
		}
		if ($base_dt.equalsIgnoreCase(name)) {
			return base_dt();
		}
		if ($last_rcv_dt.equalsIgnoreCase(name)) {
			return last_rcv_dt();
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
		if ($bill_each_sls_flg.equalsIgnoreCase(name)) {
			return bill_each_sls_flg();
		}
		if ($foreign_flg.equalsIgnoreCase(name)) {
			return foreign_flg();
		}
		if ($prnt_flg.equalsIgnoreCase(name)) {
			return prnt_flg();
		}
		if ($bill_rq_flg.equalsIgnoreCase(name)) {
			return bill_rq_flg();
		}
		if ($rcv_schd_adjst_flg.equalsIgnoreCase(name)) {
			return rcv_schd_adjst_flg();
		}
		if ($edi_flg.equalsIgnoreCase(name)) {
			return edi_flg();
		}
		if ($exists_interim_flg.equalsIgnoreCase(name)) {
			return exists_interim_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($bill_mng_no.equalsIgnoreCase(name)) {
			bill_mng_no(value);
			return;
		}
		if ($bcst_cd.equalsIgnoreCase(name)) {
			bcst_cd(value);
			return;
		}
		if ($bill_no.equalsIgnoreCase(name)) {
			bill_no(value);
			return;
		}
		if ($pre_bill_no.equalsIgnoreCase(name)) {
			pre_bill_no(value);
			return;
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			trd_cur_cd(value);
			return;
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			iv_no(value);
			return;
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			wrk_no(value);
			return;
		}
		if ($bill_dpt_cd.equalsIgnoreCase(name)) {
			bill_dpt_cd(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($bill_cl_sts_typ.equalsIgnoreCase(name)) {
			bill_cl_sts_typ(value);
			return;
		}
		if ($bill_cl_typ.equalsIgnoreCase(name)) {
			bill_cl_typ(value);
			return;
		}
		if ($bill_tax_calc_typ.equalsIgnoreCase(name)) {
			bill_tax_calc_typ(value);
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
		if ($bill_rev.equalsIgnoreCase(name)) {
			bill_rev(value);
			return;
		}
		if ($bill_xrate.equalsIgnoreCase(name)) {
			bill_xrate(value);
			return;
		}
		if ($last_bill_amt.equalsIgnoreCase(name)) {
			last_bill_amt(value);
			return;
		}
		if ($xfr_amt.equalsIgnoreCase(name)) {
			xfr_amt(value);
			return;
		}
		if ($note_amt.equalsIgnoreCase(name)) {
			note_amt(value);
			return;
		}
		if ($cash_amt.equalsIgnoreCase(name)) {
			cash_amt(value);
			return;
		}
		if ($setoff_amt.equalsIgnoreCase(name)) {
			setoff_amt(value);
			return;
		}
		if ($setoff_tax_amt.equalsIgnoreCase(name)) {
			setoff_tax_amt(value);
			return;
		}
		if ($sw_amt.equalsIgnoreCase(name)) {
			sw_amt(value);
			return;
		}
		if ($bfw_amt.equalsIgnoreCase(name)) {
			bfw_amt(value);
			return;
		}
		if ($sls_amt.equalsIgnoreCase(name)) {
			sls_amt(value);
			return;
		}
		if ($ret_amt.equalsIgnoreCase(name)) {
			ret_amt(value);
			return;
		}
		if ($dscnt_amt.equalsIgnoreCase(name)) {
			dscnt_amt(value);
			return;
		}
		if ($sw_to_amt.equalsIgnoreCase(name)) {
			sw_to_amt(value);
			return;
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			tax_amt(value);
			return;
		}
		if ($bill_amt.equalsIgnoreCase(name)) {
			bill_amt(value);
			return;
		}
		if ($adv_amt_bal.equalsIgnoreCase(name)) {
			adv_amt_bal(value);
			return;
		}
		if ($adv_amt.equalsIgnoreCase(name)) {
			adv_amt(value);
			return;
		}
		if ($adv_setoff_amt.equalsIgnoreCase(name)) {
			adv_setoff_amt(value);
			return;
		}
		if ($adv_setoff_tax_amt.equalsIgnoreCase(name)) {
			adv_setoff_tax_amt(value);
			return;
		}
		if ($rcv_schd_amt.equalsIgnoreCase(name)) {
			rcv_schd_amt(value);
			return;
		}
		if ($rcv_act_amt.equalsIgnoreCase(name)) {
			rcv_act_amt(value);
			return;
		}
		if ($not_appl_bal.equalsIgnoreCase(name)) {
			not_appl_bal(value);
			return;
		}
		if ($dtl_cnt.equalsIgnoreCase(name)) {
			dtl_cnt(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, int value) {
		if ($bill_rev.equalsIgnoreCase(name)) {
			bill_rev(value);
			return;
		}
		if ($bill_xrate.equalsIgnoreCase(name)) {
			bill_xrate(value);
			return;
		}
		if ($last_bill_amt.equalsIgnoreCase(name)) {
			last_bill_amt(value);
			return;
		}
		if ($xfr_amt.equalsIgnoreCase(name)) {
			xfr_amt(value);
			return;
		}
		if ($note_amt.equalsIgnoreCase(name)) {
			note_amt(value);
			return;
		}
		if ($cash_amt.equalsIgnoreCase(name)) {
			cash_amt(value);
			return;
		}
		if ($setoff_amt.equalsIgnoreCase(name)) {
			setoff_amt(value);
			return;
		}
		if ($setoff_tax_amt.equalsIgnoreCase(name)) {
			setoff_tax_amt(value);
			return;
		}
		if ($sw_amt.equalsIgnoreCase(name)) {
			sw_amt(value);
			return;
		}
		if ($bfw_amt.equalsIgnoreCase(name)) {
			bfw_amt(value);
			return;
		}
		if ($sls_amt.equalsIgnoreCase(name)) {
			sls_amt(value);
			return;
		}
		if ($ret_amt.equalsIgnoreCase(name)) {
			ret_amt(value);
			return;
		}
		if ($dscnt_amt.equalsIgnoreCase(name)) {
			dscnt_amt(value);
			return;
		}
		if ($sw_to_amt.equalsIgnoreCase(name)) {
			sw_to_amt(value);
			return;
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			tax_amt(value);
			return;
		}
		if ($bill_amt.equalsIgnoreCase(name)) {
			bill_amt(value);
			return;
		}
		if ($adv_amt_bal.equalsIgnoreCase(name)) {
			adv_amt_bal(value);
			return;
		}
		if ($adv_amt.equalsIgnoreCase(name)) {
			adv_amt(value);
			return;
		}
		if ($adv_setoff_amt.equalsIgnoreCase(name)) {
			adv_setoff_amt(value);
			return;
		}
		if ($adv_setoff_tax_amt.equalsIgnoreCase(name)) {
			adv_setoff_tax_amt(value);
			return;
		}
		if ($rcv_schd_amt.equalsIgnoreCase(name)) {
			rcv_schd_amt(value);
			return;
		}
		if ($rcv_act_amt.equalsIgnoreCase(name)) {
			rcv_act_amt(value);
			return;
		}
		if ($not_appl_bal.equalsIgnoreCase(name)) {
			not_appl_bal(value);
			return;
		}
		if ($dtl_cnt.equalsIgnoreCase(name)) {
			dtl_cnt(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, long value) {
		if ($bill_rev.equalsIgnoreCase(name)) {
			bill_rev(value);
			return;
		}
		if ($bill_xrate.equalsIgnoreCase(name)) {
			bill_xrate(value);
			return;
		}
		if ($last_bill_amt.equalsIgnoreCase(name)) {
			last_bill_amt(value);
			return;
		}
		if ($xfr_amt.equalsIgnoreCase(name)) {
			xfr_amt(value);
			return;
		}
		if ($note_amt.equalsIgnoreCase(name)) {
			note_amt(value);
			return;
		}
		if ($cash_amt.equalsIgnoreCase(name)) {
			cash_amt(value);
			return;
		}
		if ($setoff_amt.equalsIgnoreCase(name)) {
			setoff_amt(value);
			return;
		}
		if ($setoff_tax_amt.equalsIgnoreCase(name)) {
			setoff_tax_amt(value);
			return;
		}
		if ($sw_amt.equalsIgnoreCase(name)) {
			sw_amt(value);
			return;
		}
		if ($bfw_amt.equalsIgnoreCase(name)) {
			bfw_amt(value);
			return;
		}
		if ($sls_amt.equalsIgnoreCase(name)) {
			sls_amt(value);
			return;
		}
		if ($ret_amt.equalsIgnoreCase(name)) {
			ret_amt(value);
			return;
		}
		if ($dscnt_amt.equalsIgnoreCase(name)) {
			dscnt_amt(value);
			return;
		}
		if ($sw_to_amt.equalsIgnoreCase(name)) {
			sw_to_amt(value);
			return;
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			tax_amt(value);
			return;
		}
		if ($bill_amt.equalsIgnoreCase(name)) {
			bill_amt(value);
			return;
		}
		if ($adv_amt_bal.equalsIgnoreCase(name)) {
			adv_amt_bal(value);
			return;
		}
		if ($adv_amt.equalsIgnoreCase(name)) {
			adv_amt(value);
			return;
		}
		if ($adv_setoff_amt.equalsIgnoreCase(name)) {
			adv_setoff_amt(value);
			return;
		}
		if ($adv_setoff_tax_amt.equalsIgnoreCase(name)) {
			adv_setoff_tax_amt(value);
			return;
		}
		if ($rcv_schd_amt.equalsIgnoreCase(name)) {
			rcv_schd_amt(value);
			return;
		}
		if ($rcv_act_amt.equalsIgnoreCase(name)) {
			rcv_act_amt(value);
			return;
		}
		if ($not_appl_bal.equalsIgnoreCase(name)) {
			not_appl_bal(value);
			return;
		}
		if ($dtl_cnt.equalsIgnoreCase(name)) {
			dtl_cnt(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, float value) {
		if ($bill_rev.equalsIgnoreCase(name)) {
			bill_rev(value);
			return;
		}
		if ($bill_xrate.equalsIgnoreCase(name)) {
			bill_xrate(value);
			return;
		}
		if ($last_bill_amt.equalsIgnoreCase(name)) {
			last_bill_amt(value);
			return;
		}
		if ($xfr_amt.equalsIgnoreCase(name)) {
			xfr_amt(value);
			return;
		}
		if ($note_amt.equalsIgnoreCase(name)) {
			note_amt(value);
			return;
		}
		if ($cash_amt.equalsIgnoreCase(name)) {
			cash_amt(value);
			return;
		}
		if ($setoff_amt.equalsIgnoreCase(name)) {
			setoff_amt(value);
			return;
		}
		if ($setoff_tax_amt.equalsIgnoreCase(name)) {
			setoff_tax_amt(value);
			return;
		}
		if ($sw_amt.equalsIgnoreCase(name)) {
			sw_amt(value);
			return;
		}
		if ($bfw_amt.equalsIgnoreCase(name)) {
			bfw_amt(value);
			return;
		}
		if ($sls_amt.equalsIgnoreCase(name)) {
			sls_amt(value);
			return;
		}
		if ($ret_amt.equalsIgnoreCase(name)) {
			ret_amt(value);
			return;
		}
		if ($dscnt_amt.equalsIgnoreCase(name)) {
			dscnt_amt(value);
			return;
		}
		if ($sw_to_amt.equalsIgnoreCase(name)) {
			sw_to_amt(value);
			return;
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			tax_amt(value);
			return;
		}
		if ($bill_amt.equalsIgnoreCase(name)) {
			bill_amt(value);
			return;
		}
		if ($adv_amt_bal.equalsIgnoreCase(name)) {
			adv_amt_bal(value);
			return;
		}
		if ($adv_amt.equalsIgnoreCase(name)) {
			adv_amt(value);
			return;
		}
		if ($adv_setoff_amt.equalsIgnoreCase(name)) {
			adv_setoff_amt(value);
			return;
		}
		if ($adv_setoff_tax_amt.equalsIgnoreCase(name)) {
			adv_setoff_tax_amt(value);
			return;
		}
		if ($rcv_schd_amt.equalsIgnoreCase(name)) {
			rcv_schd_amt(value);
			return;
		}
		if ($rcv_act_amt.equalsIgnoreCase(name)) {
			rcv_act_amt(value);
			return;
		}
		if ($not_appl_bal.equalsIgnoreCase(name)) {
			not_appl_bal(value);
			return;
		}
		if ($dtl_cnt.equalsIgnoreCase(name)) {
			dtl_cnt(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, double value) {
		if ($bill_rev.equalsIgnoreCase(name)) {
			bill_rev(value);
			return;
		}
		if ($bill_xrate.equalsIgnoreCase(name)) {
			bill_xrate(value);
			return;
		}
		if ($last_bill_amt.equalsIgnoreCase(name)) {
			last_bill_amt(value);
			return;
		}
		if ($xfr_amt.equalsIgnoreCase(name)) {
			xfr_amt(value);
			return;
		}
		if ($note_amt.equalsIgnoreCase(name)) {
			note_amt(value);
			return;
		}
		if ($cash_amt.equalsIgnoreCase(name)) {
			cash_amt(value);
			return;
		}
		if ($setoff_amt.equalsIgnoreCase(name)) {
			setoff_amt(value);
			return;
		}
		if ($setoff_tax_amt.equalsIgnoreCase(name)) {
			setoff_tax_amt(value);
			return;
		}
		if ($sw_amt.equalsIgnoreCase(name)) {
			sw_amt(value);
			return;
		}
		if ($bfw_amt.equalsIgnoreCase(name)) {
			bfw_amt(value);
			return;
		}
		if ($sls_amt.equalsIgnoreCase(name)) {
			sls_amt(value);
			return;
		}
		if ($ret_amt.equalsIgnoreCase(name)) {
			ret_amt(value);
			return;
		}
		if ($dscnt_amt.equalsIgnoreCase(name)) {
			dscnt_amt(value);
			return;
		}
		if ($sw_to_amt.equalsIgnoreCase(name)) {
			sw_to_amt(value);
			return;
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			tax_amt(value);
			return;
		}
		if ($bill_amt.equalsIgnoreCase(name)) {
			bill_amt(value);
			return;
		}
		if ($adv_amt_bal.equalsIgnoreCase(name)) {
			adv_amt_bal(value);
			return;
		}
		if ($adv_amt.equalsIgnoreCase(name)) {
			adv_amt(value);
			return;
		}
		if ($adv_setoff_amt.equalsIgnoreCase(name)) {
			adv_setoff_amt(value);
			return;
		}
		if ($adv_setoff_tax_amt.equalsIgnoreCase(name)) {
			adv_setoff_tax_amt(value);
			return;
		}
		if ($rcv_schd_amt.equalsIgnoreCase(name)) {
			rcv_schd_amt(value);
			return;
		}
		if ($rcv_act_amt.equalsIgnoreCase(name)) {
			rcv_act_amt(value);
			return;
		}
		if ($not_appl_bal.equalsIgnoreCase(name)) {
			not_appl_bal(value);
			return;
		}
		if ($dtl_cnt.equalsIgnoreCase(name)) {
			dtl_cnt(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setDate(String name, MCDate value) {
		if ($bill_cl_dt.equalsIgnoreCase(name)) {
			bill_cl_dt(value);
			return;
		}
		if ($bill_dt.equalsIgnoreCase(name)) {
			bill_dt(value);
			return;
		}
		if ($pre_bill_dt.equalsIgnoreCase(name)) {
			pre_bill_dt(value);
			return;
		}
		if ($base_dt.equalsIgnoreCase(name)) {
			base_dt(value);
			return;
		}
		if ($last_rcv_dt.equalsIgnoreCase(name)) {
			last_rcv_dt(value);
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
		if ($bill_each_sls_flg.equalsIgnoreCase(name)) {
			bill_each_sls_flg(value);
			return;
		}
		if ($foreign_flg.equalsIgnoreCase(name)) {
			foreign_flg(value);
			return;
		}
		if ($prnt_flg.equalsIgnoreCase(name)) {
			prnt_flg(value);
			return;
		}
		if ($bill_rq_flg.equalsIgnoreCase(name)) {
			bill_rq_flg(value);
			return;
		}
		if ($rcv_schd_adjst_flg.equalsIgnoreCase(name)) {
			rcv_schd_adjst_flg(value);
			return;
		}
		if ($edi_flg.equalsIgnoreCase(name)) {
			edi_flg(value);
			return;
		}
		if ($exists_interim_flg.equalsIgnoreCase(name)) {
			exists_interim_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($bill_mng_no.equalsIgnoreCase(name)) {
			bill_mng_no(value);
			return;
		}
		if ($bcst_cd.equalsIgnoreCase(name)) {
			bcst_cd(value);
			return;
		}
		if ($bill_no.equalsIgnoreCase(name)) {
			bill_no(value);
			return;
		}
		if ($pre_bill_no.equalsIgnoreCase(name)) {
			pre_bill_no(value);
			return;
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			trd_cur_cd(value);
			return;
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			iv_no(value);
			return;
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			wrk_no(value);
			return;
		}
		if ($bill_dpt_cd.equalsIgnoreCase(name)) {
			bill_dpt_cd(value);
			return;
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			wg_cd(value);
			return;
		}
		if ($bill_cl_sts_typ.equalsIgnoreCase(name)) {
			bill_cl_sts_typ(value);
			return;
		}
		if ($bill_cl_typ.equalsIgnoreCase(name)) {
			bill_cl_typ(value);
			return;
		}
		if ($bill_tax_calc_typ.equalsIgnoreCase(name)) {
			bill_tax_calc_typ(value);
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
		if ($bill_rev.equalsIgnoreCase(name)) {
			bill_rev(value);
			return;
		}
		if ($bill_xrate.equalsIgnoreCase(name)) {
			bill_xrate(value);
			return;
		}
		if ($last_bill_amt.equalsIgnoreCase(name)) {
			last_bill_amt(value);
			return;
		}
		if ($xfr_amt.equalsIgnoreCase(name)) {
			xfr_amt(value);
			return;
		}
		if ($note_amt.equalsIgnoreCase(name)) {
			note_amt(value);
			return;
		}
		if ($cash_amt.equalsIgnoreCase(name)) {
			cash_amt(value);
			return;
		}
		if ($setoff_amt.equalsIgnoreCase(name)) {
			setoff_amt(value);
			return;
		}
		if ($setoff_tax_amt.equalsIgnoreCase(name)) {
			setoff_tax_amt(value);
			return;
		}
		if ($sw_amt.equalsIgnoreCase(name)) {
			sw_amt(value);
			return;
		}
		if ($bfw_amt.equalsIgnoreCase(name)) {
			bfw_amt(value);
			return;
		}
		if ($sls_amt.equalsIgnoreCase(name)) {
			sls_amt(value);
			return;
		}
		if ($ret_amt.equalsIgnoreCase(name)) {
			ret_amt(value);
			return;
		}
		if ($dscnt_amt.equalsIgnoreCase(name)) {
			dscnt_amt(value);
			return;
		}
		if ($sw_to_amt.equalsIgnoreCase(name)) {
			sw_to_amt(value);
			return;
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			tax_amt(value);
			return;
		}
		if ($bill_amt.equalsIgnoreCase(name)) {
			bill_amt(value);
			return;
		}
		if ($adv_amt_bal.equalsIgnoreCase(name)) {
			adv_amt_bal(value);
			return;
		}
		if ($adv_amt.equalsIgnoreCase(name)) {
			adv_amt(value);
			return;
		}
		if ($adv_setoff_amt.equalsIgnoreCase(name)) {
			adv_setoff_amt(value);
			return;
		}
		if ($adv_setoff_tax_amt.equalsIgnoreCase(name)) {
			adv_setoff_tax_amt(value);
			return;
		}
		if ($rcv_schd_amt.equalsIgnoreCase(name)) {
			rcv_schd_amt(value);
			return;
		}
		if ($rcv_act_amt.equalsIgnoreCase(name)) {
			rcv_act_amt(value);
			return;
		}
		if ($not_appl_bal.equalsIgnoreCase(name)) {
			not_appl_bal(value);
			return;
		}
		if ($dtl_cnt.equalsIgnoreCase(name)) {
			dtl_cnt(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, int value) {
		if ($bill_rev.equalsIgnoreCase(name)) {
			bill_rev(value);
			return;
		}
		if ($bill_xrate.equalsIgnoreCase(name)) {
			bill_xrate(value);
			return;
		}
		if ($last_bill_amt.equalsIgnoreCase(name)) {
			last_bill_amt(value);
			return;
		}
		if ($xfr_amt.equalsIgnoreCase(name)) {
			xfr_amt(value);
			return;
		}
		if ($note_amt.equalsIgnoreCase(name)) {
			note_amt(value);
			return;
		}
		if ($cash_amt.equalsIgnoreCase(name)) {
			cash_amt(value);
			return;
		}
		if ($setoff_amt.equalsIgnoreCase(name)) {
			setoff_amt(value);
			return;
		}
		if ($setoff_tax_amt.equalsIgnoreCase(name)) {
			setoff_tax_amt(value);
			return;
		}
		if ($sw_amt.equalsIgnoreCase(name)) {
			sw_amt(value);
			return;
		}
		if ($bfw_amt.equalsIgnoreCase(name)) {
			bfw_amt(value);
			return;
		}
		if ($sls_amt.equalsIgnoreCase(name)) {
			sls_amt(value);
			return;
		}
		if ($ret_amt.equalsIgnoreCase(name)) {
			ret_amt(value);
			return;
		}
		if ($dscnt_amt.equalsIgnoreCase(name)) {
			dscnt_amt(value);
			return;
		}
		if ($sw_to_amt.equalsIgnoreCase(name)) {
			sw_to_amt(value);
			return;
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			tax_amt(value);
			return;
		}
		if ($bill_amt.equalsIgnoreCase(name)) {
			bill_amt(value);
			return;
		}
		if ($adv_amt_bal.equalsIgnoreCase(name)) {
			adv_amt_bal(value);
			return;
		}
		if ($adv_amt.equalsIgnoreCase(name)) {
			adv_amt(value);
			return;
		}
		if ($adv_setoff_amt.equalsIgnoreCase(name)) {
			adv_setoff_amt(value);
			return;
		}
		if ($adv_setoff_tax_amt.equalsIgnoreCase(name)) {
			adv_setoff_tax_amt(value);
			return;
		}
		if ($rcv_schd_amt.equalsIgnoreCase(name)) {
			rcv_schd_amt(value);
			return;
		}
		if ($rcv_act_amt.equalsIgnoreCase(name)) {
			rcv_act_amt(value);
			return;
		}
		if ($not_appl_bal.equalsIgnoreCase(name)) {
			not_appl_bal(value);
			return;
		}
		if ($dtl_cnt.equalsIgnoreCase(name)) {
			dtl_cnt(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, long value) {
		if ($bill_rev.equalsIgnoreCase(name)) {
			bill_rev(value);
			return;
		}
		if ($bill_xrate.equalsIgnoreCase(name)) {
			bill_xrate(value);
			return;
		}
		if ($last_bill_amt.equalsIgnoreCase(name)) {
			last_bill_amt(value);
			return;
		}
		if ($xfr_amt.equalsIgnoreCase(name)) {
			xfr_amt(value);
			return;
		}
		if ($note_amt.equalsIgnoreCase(name)) {
			note_amt(value);
			return;
		}
		if ($cash_amt.equalsIgnoreCase(name)) {
			cash_amt(value);
			return;
		}
		if ($setoff_amt.equalsIgnoreCase(name)) {
			setoff_amt(value);
			return;
		}
		if ($setoff_tax_amt.equalsIgnoreCase(name)) {
			setoff_tax_amt(value);
			return;
		}
		if ($sw_amt.equalsIgnoreCase(name)) {
			sw_amt(value);
			return;
		}
		if ($bfw_amt.equalsIgnoreCase(name)) {
			bfw_amt(value);
			return;
		}
		if ($sls_amt.equalsIgnoreCase(name)) {
			sls_amt(value);
			return;
		}
		if ($ret_amt.equalsIgnoreCase(name)) {
			ret_amt(value);
			return;
		}
		if ($dscnt_amt.equalsIgnoreCase(name)) {
			dscnt_amt(value);
			return;
		}
		if ($sw_to_amt.equalsIgnoreCase(name)) {
			sw_to_amt(value);
			return;
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			tax_amt(value);
			return;
		}
		if ($bill_amt.equalsIgnoreCase(name)) {
			bill_amt(value);
			return;
		}
		if ($adv_amt_bal.equalsIgnoreCase(name)) {
			adv_amt_bal(value);
			return;
		}
		if ($adv_amt.equalsIgnoreCase(name)) {
			adv_amt(value);
			return;
		}
		if ($adv_setoff_amt.equalsIgnoreCase(name)) {
			adv_setoff_amt(value);
			return;
		}
		if ($adv_setoff_tax_amt.equalsIgnoreCase(name)) {
			adv_setoff_tax_amt(value);
			return;
		}
		if ($rcv_schd_amt.equalsIgnoreCase(name)) {
			rcv_schd_amt(value);
			return;
		}
		if ($rcv_act_amt.equalsIgnoreCase(name)) {
			rcv_act_amt(value);
			return;
		}
		if ($not_appl_bal.equalsIgnoreCase(name)) {
			not_appl_bal(value);
			return;
		}
		if ($dtl_cnt.equalsIgnoreCase(name)) {
			dtl_cnt(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, float value) {
		if ($bill_rev.equalsIgnoreCase(name)) {
			bill_rev(value);
			return;
		}
		if ($bill_xrate.equalsIgnoreCase(name)) {
			bill_xrate(value);
			return;
		}
		if ($last_bill_amt.equalsIgnoreCase(name)) {
			last_bill_amt(value);
			return;
		}
		if ($xfr_amt.equalsIgnoreCase(name)) {
			xfr_amt(value);
			return;
		}
		if ($note_amt.equalsIgnoreCase(name)) {
			note_amt(value);
			return;
		}
		if ($cash_amt.equalsIgnoreCase(name)) {
			cash_amt(value);
			return;
		}
		if ($setoff_amt.equalsIgnoreCase(name)) {
			setoff_amt(value);
			return;
		}
		if ($setoff_tax_amt.equalsIgnoreCase(name)) {
			setoff_tax_amt(value);
			return;
		}
		if ($sw_amt.equalsIgnoreCase(name)) {
			sw_amt(value);
			return;
		}
		if ($bfw_amt.equalsIgnoreCase(name)) {
			bfw_amt(value);
			return;
		}
		if ($sls_amt.equalsIgnoreCase(name)) {
			sls_amt(value);
			return;
		}
		if ($ret_amt.equalsIgnoreCase(name)) {
			ret_amt(value);
			return;
		}
		if ($dscnt_amt.equalsIgnoreCase(name)) {
			dscnt_amt(value);
			return;
		}
		if ($sw_to_amt.equalsIgnoreCase(name)) {
			sw_to_amt(value);
			return;
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			tax_amt(value);
			return;
		}
		if ($bill_amt.equalsIgnoreCase(name)) {
			bill_amt(value);
			return;
		}
		if ($adv_amt_bal.equalsIgnoreCase(name)) {
			adv_amt_bal(value);
			return;
		}
		if ($adv_amt.equalsIgnoreCase(name)) {
			adv_amt(value);
			return;
		}
		if ($adv_setoff_amt.equalsIgnoreCase(name)) {
			adv_setoff_amt(value);
			return;
		}
		if ($adv_setoff_tax_amt.equalsIgnoreCase(name)) {
			adv_setoff_tax_amt(value);
			return;
		}
		if ($rcv_schd_amt.equalsIgnoreCase(name)) {
			rcv_schd_amt(value);
			return;
		}
		if ($rcv_act_amt.equalsIgnoreCase(name)) {
			rcv_act_amt(value);
			return;
		}
		if ($not_appl_bal.equalsIgnoreCase(name)) {
			not_appl_bal(value);
			return;
		}
		if ($dtl_cnt.equalsIgnoreCase(name)) {
			dtl_cnt(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, double value) {
		if ($bill_rev.equalsIgnoreCase(name)) {
			bill_rev(value);
			return;
		}
		if ($bill_xrate.equalsIgnoreCase(name)) {
			bill_xrate(value);
			return;
		}
		if ($last_bill_amt.equalsIgnoreCase(name)) {
			last_bill_amt(value);
			return;
		}
		if ($xfr_amt.equalsIgnoreCase(name)) {
			xfr_amt(value);
			return;
		}
		if ($note_amt.equalsIgnoreCase(name)) {
			note_amt(value);
			return;
		}
		if ($cash_amt.equalsIgnoreCase(name)) {
			cash_amt(value);
			return;
		}
		if ($setoff_amt.equalsIgnoreCase(name)) {
			setoff_amt(value);
			return;
		}
		if ($setoff_tax_amt.equalsIgnoreCase(name)) {
			setoff_tax_amt(value);
			return;
		}
		if ($sw_amt.equalsIgnoreCase(name)) {
			sw_amt(value);
			return;
		}
		if ($bfw_amt.equalsIgnoreCase(name)) {
			bfw_amt(value);
			return;
		}
		if ($sls_amt.equalsIgnoreCase(name)) {
			sls_amt(value);
			return;
		}
		if ($ret_amt.equalsIgnoreCase(name)) {
			ret_amt(value);
			return;
		}
		if ($dscnt_amt.equalsIgnoreCase(name)) {
			dscnt_amt(value);
			return;
		}
		if ($sw_to_amt.equalsIgnoreCase(name)) {
			sw_to_amt(value);
			return;
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			tax_amt(value);
			return;
		}
		if ($bill_amt.equalsIgnoreCase(name)) {
			bill_amt(value);
			return;
		}
		if ($adv_amt_bal.equalsIgnoreCase(name)) {
			adv_amt_bal(value);
			return;
		}
		if ($adv_amt.equalsIgnoreCase(name)) {
			adv_amt(value);
			return;
		}
		if ($adv_setoff_amt.equalsIgnoreCase(name)) {
			adv_setoff_amt(value);
			return;
		}
		if ($adv_setoff_tax_amt.equalsIgnoreCase(name)) {
			adv_setoff_tax_amt(value);
			return;
		}
		if ($rcv_schd_amt.equalsIgnoreCase(name)) {
			rcv_schd_amt(value);
			return;
		}
		if ($rcv_act_amt.equalsIgnoreCase(name)) {
			rcv_act_amt(value);
			return;
		}
		if ($not_appl_bal.equalsIgnoreCase(name)) {
			not_appl_bal(value);
			return;
		}
		if ($dtl_cnt.equalsIgnoreCase(name)) {
			dtl_cnt(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setDateNE(String name, MCDate value) {
		if ($bill_cl_dt.equalsIgnoreCase(name)) {
			bill_cl_dt(value);
			return;
		}
		if ($bill_dt.equalsIgnoreCase(name)) {
			bill_dt(value);
			return;
		}
		if ($pre_bill_dt.equalsIgnoreCase(name)) {
			pre_bill_dt(value);
			return;
		}
		if ($base_dt.equalsIgnoreCase(name)) {
			base_dt(value);
			return;
		}
		if ($last_rcv_dt.equalsIgnoreCase(name)) {
			last_rcv_dt(value);
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
		if ($bill_each_sls_flg.equalsIgnoreCase(name)) {
			bill_each_sls_flg(value);
			return;
		}
		if ($foreign_flg.equalsIgnoreCase(name)) {
			foreign_flg(value);
			return;
		}
		if ($prnt_flg.equalsIgnoreCase(name)) {
			prnt_flg(value);
			return;
		}
		if ($bill_rq_flg.equalsIgnoreCase(name)) {
			bill_rq_flg(value);
			return;
		}
		if ($rcv_schd_adjst_flg.equalsIgnoreCase(name)) {
			rcv_schd_adjst_flg(value);
			return;
		}
		if ($edi_flg.equalsIgnoreCase(name)) {
			edi_flg(value);
			return;
		}
		if ($exists_interim_flg.equalsIgnoreCase(name)) {
			exists_interim_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

}
