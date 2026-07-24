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
 * "請求受信ＩＦ // Billing import IF"DBコンテナRowクラスです。<p>
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
 *  	<td>bill_cl_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>請求締年月日</td>
 *  	<td>Billing closing day</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>bill_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>請求日</td>
 *  	<td>Billing date</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>bill_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>請求書ＮＯ</td>
 *  	<td>Invoice No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>bill_d_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>請求明細ＮＯ</td>
 *  	<td>Billing details No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>pre_bill_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>先行請求書ＮＯ</td>
 *  	<td>Advance invoice No.</td>
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
 *  	<td>bill_st_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>請求期間開始日</td>
 *  	<td>Billing period start date</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>bill_end_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>請求期間終了日</td>
 *  	<td>Billing period end date</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>iv_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
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
 *  	<td>wrk_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>案件名</td>
 *  	<td>Sales project name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>bill_src_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>請求元ＣＤ</td>
 *  	<td>Billing source cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>if_bill_src_cd</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ請求元ＣＤ</td>
 *  	<td>IF billing source cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>if_bill_src_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ請求元名</td>
 *  	<td>IF billing source name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>bill_src_ein</td>
 *  	<td>C</td>
 *  	<td>13</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>請求元法人番号</td>
 *  	<td>Billing source corporation No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>bill_src_biz_co_no</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>請求元事業者ＮＯ</td>
 *  	<td>Billing source business No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>bill_src_zip_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>請求元郵便番号</td>
 *  	<td>Billing source zip code</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>bill_src_addr1</td>
 *  	<td>C</td>
 *  	<td>250</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>請求元住所１</td>
 *  	<td>Billing source address 1</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>bill_src_addr2</td>
 *  	<td>C</td>
 *  	<td>250</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>請求元住所２</td>
 *  	<td>Billing source address 2</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>bill_src_addr3</td>
 *  	<td>C</td>
 *  	<td>250</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>請求元住所３</td>
 *  	<td>Billing source address 3</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>bill_src_addr4</td>
 *  	<td>C</td>
 *  	<td>250</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>請求元住所４</td>
 *  	<td>Billing source address 4</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>bill_src_dpt</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>請求元部門</td>
 *  	<td>Billing source dept.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>bill_src_tel</td>
 *  	<td>C</td>
 *  	<td>30</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>請求元ＴＥＬ</td>
 *  	<td>Billing source TEL</td>
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
 *  	<td>if_trd_cur_cd</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ取引通貨ＣＤ</td>
 *  	<td>IF transaction currency cd.</td>
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
 *  	<td>rcv_amt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>支払額</td>
 *  	<td>Payment amount</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sw_amt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>振替額</td>
 *  	<td>Transfer amount</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>setoff_amt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>相殺額</td>
 *  	<td>Offset amount</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>bfw_amt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>差引繰越額</td>
 *  	<td>Variance carry-over amount</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sls_amt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>今回買上額</td>
 *  	<td>Current payment amount</td>
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
 *  	<td>sw_to_amt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>今回振替額</td>
 *  	<td>Current transfer amount</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>bill_amt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>今回請求額</td>
 *  	<td>Current billing amount</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>tax_rate1</td>
 *  	<td>N</td>
 *  	<td>5,2</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>税率１</td>
 *  	<td>Tax rate 1</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>tax_rate_sls_amt1</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>税率毎買上額１</td>
 *  	<td>Purchase amount 1 per tax rate</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>tax_rate_tax_amt1</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>税率毎税額１</td>
 *  	<td>Tax amount per tax rate 1</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>tax_rate_base_tax_amt1</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>税率毎基準通貨税額１</td>
 *  	<td>Tax amount (Base currency) per tax rate 1</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>tax_rate2</td>
 *  	<td>N</td>
 *  	<td>5,2</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>税率２</td>
 *  	<td>Tax rate 2</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>tax_rate_sls_amt2</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>税率毎買上額２</td>
 *  	<td>Purchase amount 2 per tax rate</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>tax_rate_tax_amt2</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>税率毎税額２</td>
 *  	<td>Tax amount per tax rate 2</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>tax_rate_base_tax_amt2</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>税率毎基準通貨税額２</td>
 *  	<td>Tax amount (Base currency) per tax rate 2</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>tax_rate3</td>
 *  	<td>N</td>
 *  	<td>5,2</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>税率３</td>
 *  	<td>Tax rate 3</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>tax_rate_sls_amt3</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>税率毎買上額３</td>
 *  	<td>Purchase amount 3 per tax rate</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>tax_rate_tax_amt3</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>税率毎税額３</td>
 *  	<td>Tax amount per tax rate 3</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>tax_rate_base_tax_amt3</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>税率毎基準通貨税額３</td>
 *  	<td>Tax amount (Base currency) per tax rate 3</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>tax_rate4</td>
 *  	<td>N</td>
 *  	<td>5,2</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>税率４</td>
 *  	<td>Tax rate 4</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>tax_rate_sls_amt4</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>税率毎買上額４</td>
 *  	<td>Purchase amount 4 per tax rate</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>tax_rate_tax_amt4</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>税率毎税額４</td>
 *  	<td>Tax amount per tax rate 4</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>tax_rate_base_tax_amt4</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>税率毎基準通貨税額４</td>
 *  	<td>Tax amount (Base currency) per tax rate 4</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>tax_rate5</td>
 *  	<td>N</td>
 *  	<td>5,2</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>税率５</td>
 *  	<td>Tax rate 5</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>tax_rate_sls_amt5</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>税率毎買上額５</td>
 *  	<td>Purchase amount 5 per tax rate</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>tax_rate_tax_amt5</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>税率毎税額５</td>
 *  	<td>Tax amount per tax rate 5</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>tax_rate_base_tax_amt5</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>税率毎基準通貨税額５</td>
 *  	<td>Tax amount (Base currency) per tax rate 5</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>tax_rate6</td>
 *  	<td>N</td>
 *  	<td>5,2</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>税率６</td>
 *  	<td>Tax rate 6</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>tax_rate_sls_amt6</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>税率毎買上額６</td>
 *  	<td>Purchase amount 6 per tax rate</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>tax_rate_tax_amt6</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>税率毎税額６</td>
 *  	<td>Tax amount per tax rate 6</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>tax_rate_base_tax_amt6</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>税率毎基準通貨税額６</td>
 *  	<td>Tax amount (Base currency) per tax rate 6</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>tax_rate7</td>
 *  	<td>N</td>
 *  	<td>5,2</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>税率７</td>
 *  	<td>Tax rate 7</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>tax_rate_sls_amt7</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>税率毎買上額７</td>
 *  	<td>Purchase amount 7 per tax rate</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>tax_rate_tax_amt7</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>税率毎税額７</td>
 *  	<td>Tax amount per tax rate 7</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>tax_rate_base_tax_amt7</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>税率毎基準通貨税額７</td>
 *  	<td>Tax amount (Base currency) per tax rate 7</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>tax_rate8</td>
 *  	<td>N</td>
 *  	<td>5,2</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>税率８</td>
 *  	<td>Tax rate 8</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>tax_rate_sls_amt8</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>税率毎買上額８</td>
 *  	<td>Purchase amount 8 per tax rate</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>tax_rate_tax_amt8</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>税率毎税額８</td>
 *  	<td>Tax amount per tax rate 8</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>tax_rate_base_tax_amt8</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>税率毎基準通貨税額８</td>
 *  	<td>Tax amount (Base currency) per tax rate 8</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>tax_rate9</td>
 *  	<td>N</td>
 *  	<td>5,2</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>税率９</td>
 *  	<td>Tax rate 9</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>tax_rate_sls_amt9</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>税率毎買上額９</td>
 *  	<td>Purchase amount 9 per tax rate</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>tax_rate_tax_amt9</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>税率毎税額９</td>
 *  	<td>Tax amount per tax rate 9</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>tax_rate_base_tax_amt9</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>税率毎基準通貨税額９</td>
 *  	<td>Tax amount (Base currency) per tax rate 9</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>tax_rate10</td>
 *  	<td>N</td>
 *  	<td>5,2</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>税率１０</td>
 *  	<td>Tax rate 10</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>tax_rate_sls_amt10</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>税率毎買上額１０</td>
 *  	<td>Purchase amount 10 per tax rate</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>tax_rate_tax_amt10</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>税率毎税額１０</td>
 *  	<td>Tax amount per tax rate 10</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>tax_rate_base_tax_amt10</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>税率毎基準通貨税額１０</td>
 *  	<td>Tax amount (Base currency) per tax rate 10</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>adv_amt_bal</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>前受金残高</td>
 *  	<td>Advance received balance</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>adv_amt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>前受金入金額</td>
 *  	<td>Advance received payment amount</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>adv_setoff_amt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>前受金相殺額</td>
 *  	<td>Advance received offset amount</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>adv_setoff_tax_amt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>前受金相殺税額</td>
 *  	<td>Advance received offset tax amount</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>pay_schd_dt1</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>支払予定日１</td>
 *  	<td>Scheduled payment date 1</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>pay_schd_amt1</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>支払予定額１</td>
 *  	<td>Payment schedule amount 1</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>pay_mtd_cd1</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>支払方法ＣＤ１</td>
 *  	<td>Payment method cd. 1</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>if_pay_mtd_cd1</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ支払方法ＣＤ１</td>
 *  	<td>IF payment method cd. 1</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>if_pay_mtd_nm1</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ支払方法名１</td>
 *  	<td>IF payment method name 1</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>pay_schd_dt2</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>支払予定日２</td>
 *  	<td>Scheduled payment date 2</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>pay_schd_amt2</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>支払予定額２</td>
 *  	<td>Payment schedule amount 2</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>pay_mtd_cd2</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>支払方法ＣＤ２</td>
 *  	<td>Payment method cd. 2</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>if_pay_mtd_cd2</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ支払方法ＣＤ２</td>
 *  	<td>IF payment method cd. 2</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>if_pay_mtd_nm2</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ支払方法名２</td>
 *  	<td>IF payment method name 2</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>pay_schd_dt3</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>支払予定日３</td>
 *  	<td>Scheduled payment date 3</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>pay_schd_amt3</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>支払予定額３</td>
 *  	<td>Payment schedule amount 3</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>pay_mtd_cd3</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>支払方法ＣＤ３</td>
 *  	<td>Payment method cd. 3</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>if_pay_mtd_cd3</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ支払方法ＣＤ３</td>
 *  	<td>IF payment method cd. 3</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>if_pay_mtd_nm3</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ支払方法名３</td>
 *  	<td>IF payment method name 3</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>pay_schd_dt4</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>支払予定日４</td>
 *  	<td>Scheduled payment date 4</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>pay_schd_amt4</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>支払予定額４</td>
 *  	<td>Payment schedule amount 4</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>pay_mtd_cd4</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>支払方法ＣＤ４</td>
 *  	<td>Payment method cd. 4</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>if_pay_mtd_cd4</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ支払方法ＣＤ４</td>
 *  	<td>IF payment method cd. 4</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>if_pay_mtd_nm4</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ支払方法名４</td>
 *  	<td>IF payment method name 4</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>pay_schd_dt5</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>支払予定日５</td>
 *  	<td>Scheduled payment date 5</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>pay_schd_amt5</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>支払予定額５</td>
 *  	<td>Payment schedule amount 5</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>pay_mtd_cd5</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>支払方法ＣＤ５</td>
 *  	<td>Payment method cd. 5</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>if_pay_mtd_cd5</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ支払方法ＣＤ５</td>
 *  	<td>IF payment method cd. 5</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>if_pay_mtd_nm5</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ支払方法名５</td>
 *  	<td>IF payment method name 5</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>pay_schd_dt6</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>支払予定日６</td>
 *  	<td>Scheduled payment date 6</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>pay_schd_amt6</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>支払予定額６</td>
 *  	<td>Payment schedule amount 6</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>pay_mtd_cd6</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>支払方法ＣＤ６</td>
 *  	<td>Payment method cd. 6</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>if_pay_mtd_cd6</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ支払方法ＣＤ６</td>
 *  	<td>IF payment method cd. 6</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>if_pay_mtd_nm6</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ支払方法名６</td>
 *  	<td>IF payment method name 6</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>pay_schd_dt7</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>支払予定日７</td>
 *  	<td>Scheduled payment date 7</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>pay_schd_amt7</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>支払予定額７</td>
 *  	<td>Payment schedule amount 7</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>pay_mtd_cd7</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>支払方法ＣＤ７</td>
 *  	<td>Payment method cd. 7</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>if_pay_mtd_cd7</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ支払方法ＣＤ７</td>
 *  	<td>IF payment method cd. 7</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>if_pay_mtd_nm7</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ支払方法名７</td>
 *  	<td>IF payment method name 7</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>pay_schd_dt8</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>支払予定日８</td>
 *  	<td>Scheduled payment date 8</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>pay_schd_amt8</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>支払予定額８</td>
 *  	<td>Payment schedule amount 8</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>pay_mtd_cd8</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>支払方法ＣＤ８</td>
 *  	<td>Payment method cd. 8</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>if_pay_mtd_cd8</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ支払方法ＣＤ８</td>
 *  	<td>IF payment method cd. 8</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>if_pay_mtd_nm8</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ支払方法名８</td>
 *  	<td>IF payment method name 8</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>pay_schd_dt9</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>支払予定日９</td>
 *  	<td>Scheduled payment date 9</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>pay_schd_amt9</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>支払予定額９</td>
 *  	<td>Payment schedule amount 9</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>pay_mtd_cd9</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>支払方法ＣＤ９</td>
 *  	<td>Payment method cd. 9</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>if_pay_mtd_cd9</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ支払方法ＣＤ９</td>
 *  	<td>IF payment method cd. 9</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>if_pay_mtd_nm9</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ支払方法名９</td>
 *  	<td>IF payment method name 9</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>pay_schd_dt10</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>支払予定日１０</td>
 *  	<td>Scheduled payment date 10</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>pay_schd_amt10</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>支払予定額１０</td>
 *  	<td>Payment schedule amount 10</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>pay_mtd_cd10</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>支払方法ＣＤ１０</td>
 *  	<td>Payment method cd. 10</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>if_pay_mtd_cd10</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ支払方法ＣＤ１０</td>
 *  	<td>IF payment method cd. 10</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>if_pay_mtd_nm10</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ支払方法名１０</td>
 *  	<td>IF payment method name 10</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>bank_ac_cd</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>口座ＣＤ</td>
 *  	<td>Bank account cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>if_bank_ac_cd</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ口座ＣＤ</td>
 *  	<td>IF bank account cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>bank_ac_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>口座区分</td>
 *  	<td>Bank account type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>bank_ac_no</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>口座番号</td>
 *  	<td>Bank account number</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>bank_ac_holder</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>口座名義</td>
 *  	<td>Bank account holder</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>bank_ac_holder_sub</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>口座名義別名</td>
 *  	<td>Account holder alias name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>bank_cd</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>銀行ＣＤ</td>
 *  	<td>Bank cd.</td>
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
 *  	<td>branch_cd</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>支店ＣＤ</td>
 *  	<td>Branch cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>branch_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>支店名</td>
 *  	<td>Branch name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>trd_cd</td>
 *  	<td>C</td>
 *  	<td>4</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引ＣＤ</td>
 *  	<td>Transaction cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>if_trd_cd</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ取引ＣＤ</td>
 *  	<td>IF transaction cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>if_trd_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ取引名</td>
 *  	<td>IF transaction name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>trd_ptn_typ</td>
 *  	<td>C</td>
 *  	<td>4</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引パタン区分</td>
 *  	<td>Transaction pattern type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>slip_sts_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>伝票状況区分</td>
 *  	<td>Slip status type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>dlv_slip_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>納品書ＮＯ</td>
 *  	<td>Delivery note No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>dlv_slip_d_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>納品書明細ＮＯ</td>
 *  	<td>Delivery note details No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ship_dlv_slip_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>出荷時納品書ＮＯ</td>
 *  	<td>Delivery note No. at shipping</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ship_dlv_slip_d_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>出荷時納品書明細ＮＯ</td>
 *  	<td>Delivery note details No. at shipping</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>act_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ヘッダ実績ＮＯ</td>
 *  	<td>Header result No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>act_rev</td>
 *  	<td>N</td>
 *  	<td>4,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ヘッダ実績改訂番号</td>
 *  	<td>Header result rev. number</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>act_d_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>明細実績ＮＯ</td>
 *  	<td>Details result No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>po_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>発注ＮＯ</td>
 *  	<td>PO No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>po_d_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>発注明細ＮＯ</td>
 *  	<td>PO details No.</td>
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
 *  	<td>dlv_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>納品日</td>
 *  	<td>Delivery date</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>rcv_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>入金日</td>
 *  	<td>Payment received date</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>bill_basis_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>請求起算日</td>
 *  	<td>Billing base date</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>base_ac_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>計上日（基）</td>
 *  	<td>Recording date (Base)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>itm_cd</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目ＣＤ</td>
 *  	<td>Item cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>itm_sub1</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>枝番１</td>
 *  	<td>Branch No. 1</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>itm_sub2</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>枝番２</td>
 *  	<td>Branch No. 2</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>itm_sub3</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>枝番３</td>
 *  	<td>Branch No. 3</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>if_itm_cd</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ品目ＣＤ</td>
 *  	<td>IF item cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>if_itm_sub1</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ枝番１</td>
 *  	<td>IF branch No. 1</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>if_itm_sub2</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ枝番２</td>
 *  	<td>IF branch No. 2</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>if_itm_sub3</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ枝番３</td>
 *  	<td>IF branch No. 3</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>if_itm_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ品名</td>
 *  	<td>IF item name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>itm_alt_nm1</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目別名１</td>
 *  	<td>Item alias name 1</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>itm_alt_nm2</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目別名２</td>
 *  	<td>Item alias name 2</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>itm_alt_nm3</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目別名３</td>
 *  	<td>Item alias name 3</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>itm_alt_nm4</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品目別名４</td>
 *  	<td>Item alias name 4</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sno1</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>手配ＮＯ１</td>
 *  	<td>SEIBAN No. 1</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sno2</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>手配ＮＯ２</td>
 *  	<td>SEIBAN No. 2</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sno3</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>手配ＮＯ３</td>
 *  	<td>SEIBAN No. 3</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sno4</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>手配ＮＯ４</td>
 *  	<td>SEIBAN No. 4</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>trd_unit_cd</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引単位ＣＤ</td>
 *  	<td>Transaction unit cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>if_trd_unit_cd</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ取引単位ＣＤ</td>
 *  	<td>IF transaction unit cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>if_trd_unit_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ取引単位名</td>
 *  	<td>IF transaction unit name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>trd_unit_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>取引単位数量</td>
 *  	<td>Transaction unit qty.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>interim_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>仮単価ＦＬＧ</td>
 *  	<td>Temporary unit price flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>trd_cur_upri</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>取引通貨単価</td>
 *  	<td>Unit price (Transaction currency)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>trd_cur_amt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>取引通貨金額</td>
 *  	<td>Amount (Transaction currency)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>trd_cur_dscnt_amt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引通貨値引額</td>
 *  	<td>Discount amount (Transaction currency)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>tax_cd</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>税ＣＤ</td>
 *  	<td>Tax cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>if_tax_cd</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ税ＣＤ</td>
 *  	<td>IF tax cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>if_tax_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ税名</td>
 *  	<td>IF tax name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>tax_rate</td>
 *  	<td>N</td>
 *  	<td>5,2</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>税率</td>
 *  	<td>Tax rate</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>inc_tax_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>内税ＦＬＧ</td>
 *  	<td>Tax inclusive flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>trd_cur_tax_amt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>取引通貨税額</td>
 *  	<td>Tax amount (Transaction currency)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>trd_d_rmrks</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>明細備考</td>
 *  	<td>Details remarks</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>if_co_cd</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ会社ＣＤ</td>
 *  	<td>IF company cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>if_co_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ会社名</td>
 *  	<td>IF company name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>bill_bcst_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>請求書宛先</td>
 *  	<td>Invoice destination</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>bill_ein</td>
 *  	<td>C</td>
 *  	<td>13</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>請求書送付法人番号</td>
 *  	<td>Invoice send-to corporation No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>bill_biz_co_no</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>請求書送付事業者ＮＯ</td>
 *  	<td>Invoice send-to business No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>bill_zip_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>請求書送付郵便番号</td>
 *  	<td>Invoice send-to zip code</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>bill_addr1</td>
 *  	<td>C</td>
 *  	<td>250</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>請求書送付住所１</td>
 *  	<td>Invoice send-to address 1</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>bill_addr2</td>
 *  	<td>C</td>
 *  	<td>250</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>請求書送付住所２</td>
 *  	<td>Invoice send-to address 2</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>bill_addr3</td>
 *  	<td>C</td>
 *  	<td>250</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>請求書送付住所３</td>
 *  	<td>Invoice send-to address 3</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>bill_addr4</td>
 *  	<td>C</td>
 *  	<td>250</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>請求書送付住所４</td>
 *  	<td>Invoice send-to address 4</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>bill_bcst_dpt</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>請求書送付部署</td>
 *  	<td>Invoice send-to dept.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>bill_tel</td>
 *  	<td>C</td>
 *  	<td>30</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>請求書送付ＴＥＬ</td>
 *  	<td>Invoice send-to TEL</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>batch_log_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ログＮＯ</td>
 *  	<td>Log No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>log_sub_key1</td>
 *  	<td>N</td>
 *  	<td>9,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ログサブキー１</td>
 *  	<td>Log sub key 1</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>log_sub_key2</td>
 *  	<td>N</td>
 *  	<td>9,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ログサブキー２</td>
 *  	<td>Log sub key 2</td>
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
 *  	<td>sdrv_sts_typ</td>
 *  	<td>C</td>
 *  	<td>2</td>
 *  	<td>Y</td>
 *  	<td>SDRV.SDRV_STS_TYP</td>
 *  	<td>送受信状況区分</td>
 *  	<td>Exporting and importing status type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>bill_src_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>請求元名</td>
 *  	<td>Billing source name</td>
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
 *  	<td>pay_mtd_nm1</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>支払方法名１</td>
 *  	<td>Payment method name 1</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>pay_mtd_nm2</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>支払方法名２</td>
 *  	<td>Payment method name 2</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>pay_mtd_nm3</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>支払方法名３</td>
 *  	<td>Payment method name 3</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>pay_mtd_nm4</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>支払方法名４</td>
 *  	<td>Payment method name 4</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>pay_mtd_nm5</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>支払方法名５</td>
 *  	<td>Payment method name 5</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>pay_mtd_nm6</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>支払方法名６</td>
 *  	<td>Payment method name 6</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>pay_mtd_nm7</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>支払方法名７</td>
 *  	<td>Payment method name 7</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>pay_mtd_nm8</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>支払方法名８</td>
 *  	<td>Payment method name 8</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>pay_mtd_nm9</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>支払方法名９</td>
 *  	<td>Payment method name 9</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>pay_mtd_nm10</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>支払方法名１０</td>
 *  	<td>Payment method name 10</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>trd_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引名</td>
 *  	<td>Transaction name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>itm_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品名</td>
 *  	<td>Item name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>trd_unit_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引単位名</td>
 *  	<td>Transaction unit name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>tax_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>税名</td>
 *  	<td>Tax name</td>
 *  </tr>
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
public class MST_BILL_RECV_IF_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.CO_VIEW;

	public static final String TABLE_NAME = "MST_BILL_RECV_IF";

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
	 * 請求締年月日. Billing closing day.<p>
	 *
	 */
	public static final String $bill_cl_dt = "bill_cl_dt";
	private static final MCPermColumnInfo _bill_cl_dt = createColumnInfo("bill_cl_dt");
	public final MCDatePermColumn bill_cl_dt = createDateColumn(_bill_cl_dt);
	
	/**
	 * 請求日. Billing date.<p>
	 *
	 */
	public static final String $bill_dt = "bill_dt";
	private static final MCPermColumnInfo _bill_dt = createColumnInfo("bill_dt");
	public final MCDatePermColumn bill_dt = createDateColumn(_bill_dt);
	
	/**
	 * 請求書ＮＯ. Invoice No..<p>
	 *
	 */
	public static final String $bill_no = "bill_no";
	private static final MCPermColumnInfo _bill_no = createColumnInfo("bill_no");
	public final MCStringPermColumn bill_no = createStringColumn(_bill_no);
	
	/**
	 * 請求明細ＮＯ. Billing details No..<p>
	 *
	 */
	public static final String $bill_d_no = "bill_d_no";
	private static final MCPermColumnInfo _bill_d_no = createColumnInfo("bill_d_no");
	public final MCStringPermColumn bill_d_no = createStringColumn(_bill_d_no);
	
	/**
	 * 先行請求書ＮＯ. Advance invoice No..<p>
	 *
	 */
	public static final String $pre_bill_no = "pre_bill_no";
	private static final MCPermColumnInfo _pre_bill_no = createColumnInfo("pre_bill_no");
	public final MCStringPermColumn pre_bill_no = createStringColumn(_pre_bill_no);
	
	/**
	 * 先行請求日. Advance billing date.<p>
	 *
	 */
	public static final String $pre_bill_dt = "pre_bill_dt";
	private static final MCPermColumnInfo _pre_bill_dt = createColumnInfo("pre_bill_dt");
	public final MCDatePermColumn pre_bill_dt = createDateColumn(_pre_bill_dt);
	
	/**
	 * 請求期間開始日. Billing period start date.<p>
	 *
	 */
	public static final String $bill_st_dt = "bill_st_dt";
	private static final MCPermColumnInfo _bill_st_dt = createColumnInfo("bill_st_dt");
	public final MCDatePermColumn bill_st_dt = createDateColumn(_bill_st_dt);
	
	/**
	 * 請求期間終了日. Billing period end date.<p>
	 *
	 */
	public static final String $bill_end_dt = "bill_end_dt";
	private static final MCPermColumnInfo _bill_end_dt = createColumnInfo("bill_end_dt");
	public final MCDatePermColumn bill_end_dt = createDateColumn(_bill_end_dt);
	
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
	 * 案件名. Sales project name.<p>
	 *
	 */
	public static final String $wrk_nm = "wrk_nm";
	private static final MCPermColumnInfo _wrk_nm = createColumnInfo("wrk_nm");
	public final MCStringPermColumn wrk_nm = createStringColumn(_wrk_nm);
	
	/**
	 * 請求元ＣＤ. Billing source cd..<p>
	 *
	 */
	public static final String $bill_src_cd = "bill_src_cd";
	private static final MCPermColumnInfo _bill_src_cd = createColumnInfo("bill_src_cd");
	public final MCStringPermColumn bill_src_cd = createStringColumn(_bill_src_cd);
	
	/**
	 * ＩＦ請求元ＣＤ. IF billing source cd..<p>
	 *
	 */
	public static final String $if_bill_src_cd = "if_bill_src_cd";
	private static final MCPermColumnInfo _if_bill_src_cd = createColumnInfo("if_bill_src_cd");
	public final MCStringPermColumn if_bill_src_cd = createStringColumn(_if_bill_src_cd);
	
	/**
	 * ＩＦ請求元名. IF billing source name.<p>
	 *
	 */
	public static final String $if_bill_src_nm = "if_bill_src_nm";
	private static final MCPermColumnInfo _if_bill_src_nm = createColumnInfo("if_bill_src_nm");
	public final MCStringPermColumn if_bill_src_nm = createStringColumn(_if_bill_src_nm);
	
	/**
	 * 請求元法人番号. Billing source corporation No..<p>
	 *
	 */
	public static final String $bill_src_ein = "bill_src_ein";
	private static final MCPermColumnInfo _bill_src_ein = createColumnInfo("bill_src_ein");
	public final MCStringPermColumn bill_src_ein = createStringColumn(_bill_src_ein);
	
	/**
	 * 請求元事業者ＮＯ. Billing source business No..<p>
	 *
	 */
	public static final String $bill_src_biz_co_no = "bill_src_biz_co_no";
	private static final MCPermColumnInfo _bill_src_biz_co_no = createColumnInfo("bill_src_biz_co_no");
	public final MCStringPermColumn bill_src_biz_co_no = createStringColumn(_bill_src_biz_co_no);
	
	/**
	 * 請求元郵便番号. Billing source zip code.<p>
	 *
	 */
	public static final String $bill_src_zip_cd = "bill_src_zip_cd";
	private static final MCPermColumnInfo _bill_src_zip_cd = createColumnInfo("bill_src_zip_cd");
	public final MCStringPermColumn bill_src_zip_cd = createStringColumn(_bill_src_zip_cd);
	
	/**
	 * 請求元住所１. Billing source address 1.<p>
	 *
	 */
	public static final String $bill_src_addr1 = "bill_src_addr1";
	private static final MCPermColumnInfo _bill_src_addr1 = createColumnInfo("bill_src_addr1");
	public final MCStringPermColumn bill_src_addr1 = createStringColumn(_bill_src_addr1);
	
	/**
	 * 請求元住所２. Billing source address 2.<p>
	 *
	 */
	public static final String $bill_src_addr2 = "bill_src_addr2";
	private static final MCPermColumnInfo _bill_src_addr2 = createColumnInfo("bill_src_addr2");
	public final MCStringPermColumn bill_src_addr2 = createStringColumn(_bill_src_addr2);
	
	/**
	 * 請求元住所３. Billing source address 3.<p>
	 *
	 */
	public static final String $bill_src_addr3 = "bill_src_addr3";
	private static final MCPermColumnInfo _bill_src_addr3 = createColumnInfo("bill_src_addr3");
	public final MCStringPermColumn bill_src_addr3 = createStringColumn(_bill_src_addr3);
	
	/**
	 * 請求元住所４. Billing source address 4.<p>
	 *
	 */
	public static final String $bill_src_addr4 = "bill_src_addr4";
	private static final MCPermColumnInfo _bill_src_addr4 = createColumnInfo("bill_src_addr4");
	public final MCStringPermColumn bill_src_addr4 = createStringColumn(_bill_src_addr4);
	
	/**
	 * 請求元部門. Billing source dept..<p>
	 *
	 */
	public static final String $bill_src_dpt = "bill_src_dpt";
	private static final MCPermColumnInfo _bill_src_dpt = createColumnInfo("bill_src_dpt");
	public final MCStringPermColumn bill_src_dpt = createStringColumn(_bill_src_dpt);
	
	/**
	 * 請求元ＴＥＬ. Billing source TEL.<p>
	 *
	 */
	public static final String $bill_src_tel = "bill_src_tel";
	private static final MCPermColumnInfo _bill_src_tel = createColumnInfo("bill_src_tel");
	public final MCStringPermColumn bill_src_tel = createStringColumn(_bill_src_tel);
	
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
	 * 請求為替レート. Billing exchange rate.<p>
	 *
	 */
	public static final String $bill_xrate = "bill_xrate";
	private static final MCPermColumnInfo _bill_xrate = createColumnInfo("bill_xrate");
	public final MCNumberPermColumn bill_xrate = createNumberColumn(_bill_xrate);
	
	/**
	 * 前回請求額. Last billing amount.<p>
	 *
	 */
	public static final String $last_bill_amt = "last_bill_amt";
	private static final MCPermColumnInfo _last_bill_amt = createColumnInfo("last_bill_amt");
	public final MCNumberPermColumn last_bill_amt = createNumberColumn(_last_bill_amt);
	
	/**
	 * 支払額. Payment amount.<p>
	 *
	 */
	public static final String $rcv_amt = "rcv_amt";
	private static final MCPermColumnInfo _rcv_amt = createColumnInfo("rcv_amt");
	public final MCNumberPermColumn rcv_amt = createNumberColumn(_rcv_amt);
	
	/**
	 * 振替額. Transfer amount.<p>
	 *
	 */
	public static final String $sw_amt = "sw_amt";
	private static final MCPermColumnInfo _sw_amt = createColumnInfo("sw_amt");
	public final MCNumberPermColumn sw_amt = createNumberColumn(_sw_amt);
	
	/**
	 * 相殺額. Offset amount.<p>
	 *
	 */
	public static final String $setoff_amt = "setoff_amt";
	private static final MCPermColumnInfo _setoff_amt = createColumnInfo("setoff_amt");
	public final MCNumberPermColumn setoff_amt = createNumberColumn(_setoff_amt);
	
	/**
	 * 差引繰越額. Variance carry-over amount.<p>
	 *
	 */
	public static final String $bfw_amt = "bfw_amt";
	private static final MCPermColumnInfo _bfw_amt = createColumnInfo("bfw_amt");
	public final MCNumberPermColumn bfw_amt = createNumberColumn(_bfw_amt);
	
	/**
	 * 今回買上額. Current payment amount.<p>
	 *
	 */
	public static final String $sls_amt = "sls_amt";
	private static final MCPermColumnInfo _sls_amt = createColumnInfo("sls_amt");
	public final MCNumberPermColumn sls_amt = createNumberColumn(_sls_amt);
	
	/**
	 * 今回値引額. Current discount amount.<p>
	 *
	 */
	public static final String $dscnt_amt = "dscnt_amt";
	private static final MCPermColumnInfo _dscnt_amt = createColumnInfo("dscnt_amt");
	public final MCNumberPermColumn dscnt_amt = createNumberColumn(_dscnt_amt);
	
	/**
	 * 今回返品額. Current return amount.<p>
	 *
	 */
	public static final String $ret_amt = "ret_amt";
	private static final MCPermColumnInfo _ret_amt = createColumnInfo("ret_amt");
	public final MCNumberPermColumn ret_amt = createNumberColumn(_ret_amt);
	
	/**
	 * 今回税額. Current tax amount.<p>
	 *
	 */
	public static final String $tax_amt = "tax_amt";
	private static final MCPermColumnInfo _tax_amt = createColumnInfo("tax_amt");
	public final MCNumberPermColumn tax_amt = createNumberColumn(_tax_amt);
	
	/**
	 * 今回振替額. Current transfer amount.<p>
	 *
	 */
	public static final String $sw_to_amt = "sw_to_amt";
	private static final MCPermColumnInfo _sw_to_amt = createColumnInfo("sw_to_amt");
	public final MCNumberPermColumn sw_to_amt = createNumberColumn(_sw_to_amt);
	
	/**
	 * 今回請求額. Current billing amount.<p>
	 *
	 */
	public static final String $bill_amt = "bill_amt";
	private static final MCPermColumnInfo _bill_amt = createColumnInfo("bill_amt");
	public final MCNumberPermColumn bill_amt = createNumberColumn(_bill_amt);
	
	/**
	 * 税率１. Tax rate 1.<p>
	 *
	 */
	public static final String $tax_rate1 = "tax_rate1";
	private static final MCPermColumnInfo _tax_rate1 = createColumnInfo("tax_rate1");
	public final MCNumberPermColumn tax_rate1 = createNumberColumn(_tax_rate1);
	
	/**
	 * 税率毎買上額１. Purchase amount 1 per tax rate.<p>
	 *
	 */
	public static final String $tax_rate_sls_amt1 = "tax_rate_sls_amt1";
	private static final MCPermColumnInfo _tax_rate_sls_amt1 = createColumnInfo("tax_rate_sls_amt1");
	public final MCNumberPermColumn tax_rate_sls_amt1 = createNumberColumn(_tax_rate_sls_amt1);
	
	/**
	 * 税率毎税額１. Tax amount per tax rate 1.<p>
	 *
	 */
	public static final String $tax_rate_tax_amt1 = "tax_rate_tax_amt1";
	private static final MCPermColumnInfo _tax_rate_tax_amt1 = createColumnInfo("tax_rate_tax_amt1");
	public final MCNumberPermColumn tax_rate_tax_amt1 = createNumberColumn(_tax_rate_tax_amt1);
	
	/**
	 * 税率毎基準通貨税額１. Tax amount (Base currency) per tax rate 1.<p>
	 *
	 */
	public static final String $tax_rate_base_tax_amt1 = "tax_rate_base_tax_amt1";
	private static final MCPermColumnInfo _tax_rate_base_tax_amt1 = createColumnInfo("tax_rate_base_tax_amt1");
	public final MCNumberPermColumn tax_rate_base_tax_amt1 = createNumberColumn(_tax_rate_base_tax_amt1);
	
	/**
	 * 税率２. Tax rate 2.<p>
	 *
	 */
	public static final String $tax_rate2 = "tax_rate2";
	private static final MCPermColumnInfo _tax_rate2 = createColumnInfo("tax_rate2");
	public final MCNumberPermColumn tax_rate2 = createNumberColumn(_tax_rate2);
	
	/**
	 * 税率毎買上額２. Purchase amount 2 per tax rate.<p>
	 *
	 */
	public static final String $tax_rate_sls_amt2 = "tax_rate_sls_amt2";
	private static final MCPermColumnInfo _tax_rate_sls_amt2 = createColumnInfo("tax_rate_sls_amt2");
	public final MCNumberPermColumn tax_rate_sls_amt2 = createNumberColumn(_tax_rate_sls_amt2);
	
	/**
	 * 税率毎税額２. Tax amount per tax rate 2.<p>
	 *
	 */
	public static final String $tax_rate_tax_amt2 = "tax_rate_tax_amt2";
	private static final MCPermColumnInfo _tax_rate_tax_amt2 = createColumnInfo("tax_rate_tax_amt2");
	public final MCNumberPermColumn tax_rate_tax_amt2 = createNumberColumn(_tax_rate_tax_amt2);
	
	/**
	 * 税率毎基準通貨税額２. Tax amount (Base currency) per tax rate 2.<p>
	 *
	 */
	public static final String $tax_rate_base_tax_amt2 = "tax_rate_base_tax_amt2";
	private static final MCPermColumnInfo _tax_rate_base_tax_amt2 = createColumnInfo("tax_rate_base_tax_amt2");
	public final MCNumberPermColumn tax_rate_base_tax_amt2 = createNumberColumn(_tax_rate_base_tax_amt2);
	
	/**
	 * 税率３. Tax rate 3.<p>
	 *
	 */
	public static final String $tax_rate3 = "tax_rate3";
	private static final MCPermColumnInfo _tax_rate3 = createColumnInfo("tax_rate3");
	public final MCNumberPermColumn tax_rate3 = createNumberColumn(_tax_rate3);
	
	/**
	 * 税率毎買上額３. Purchase amount 3 per tax rate.<p>
	 *
	 */
	public static final String $tax_rate_sls_amt3 = "tax_rate_sls_amt3";
	private static final MCPermColumnInfo _tax_rate_sls_amt3 = createColumnInfo("tax_rate_sls_amt3");
	public final MCNumberPermColumn tax_rate_sls_amt3 = createNumberColumn(_tax_rate_sls_amt3);
	
	/**
	 * 税率毎税額３. Tax amount per tax rate 3.<p>
	 *
	 */
	public static final String $tax_rate_tax_amt3 = "tax_rate_tax_amt3";
	private static final MCPermColumnInfo _tax_rate_tax_amt3 = createColumnInfo("tax_rate_tax_amt3");
	public final MCNumberPermColumn tax_rate_tax_amt3 = createNumberColumn(_tax_rate_tax_amt3);
	
	/**
	 * 税率毎基準通貨税額３. Tax amount (Base currency) per tax rate 3.<p>
	 *
	 */
	public static final String $tax_rate_base_tax_amt3 = "tax_rate_base_tax_amt3";
	private static final MCPermColumnInfo _tax_rate_base_tax_amt3 = createColumnInfo("tax_rate_base_tax_amt3");
	public final MCNumberPermColumn tax_rate_base_tax_amt3 = createNumberColumn(_tax_rate_base_tax_amt3);
	
	/**
	 * 税率４. Tax rate 4.<p>
	 *
	 */
	public static final String $tax_rate4 = "tax_rate4";
	private static final MCPermColumnInfo _tax_rate4 = createColumnInfo("tax_rate4");
	public final MCNumberPermColumn tax_rate4 = createNumberColumn(_tax_rate4);
	
	/**
	 * 税率毎買上額４. Purchase amount 4 per tax rate.<p>
	 *
	 */
	public static final String $tax_rate_sls_amt4 = "tax_rate_sls_amt4";
	private static final MCPermColumnInfo _tax_rate_sls_amt4 = createColumnInfo("tax_rate_sls_amt4");
	public final MCNumberPermColumn tax_rate_sls_amt4 = createNumberColumn(_tax_rate_sls_amt4);
	
	/**
	 * 税率毎税額４. Tax amount per tax rate 4.<p>
	 *
	 */
	public static final String $tax_rate_tax_amt4 = "tax_rate_tax_amt4";
	private static final MCPermColumnInfo _tax_rate_tax_amt4 = createColumnInfo("tax_rate_tax_amt4");
	public final MCNumberPermColumn tax_rate_tax_amt4 = createNumberColumn(_tax_rate_tax_amt4);
	
	/**
	 * 税率毎基準通貨税額４. Tax amount (Base currency) per tax rate 4.<p>
	 *
	 */
	public static final String $tax_rate_base_tax_amt4 = "tax_rate_base_tax_amt4";
	private static final MCPermColumnInfo _tax_rate_base_tax_amt4 = createColumnInfo("tax_rate_base_tax_amt4");
	public final MCNumberPermColumn tax_rate_base_tax_amt4 = createNumberColumn(_tax_rate_base_tax_amt4);
	
	/**
	 * 税率５. Tax rate 5.<p>
	 *
	 */
	public static final String $tax_rate5 = "tax_rate5";
	private static final MCPermColumnInfo _tax_rate5 = createColumnInfo("tax_rate5");
	public final MCNumberPermColumn tax_rate5 = createNumberColumn(_tax_rate5);
	
	/**
	 * 税率毎買上額５. Purchase amount 5 per tax rate.<p>
	 *
	 */
	public static final String $tax_rate_sls_amt5 = "tax_rate_sls_amt5";
	private static final MCPermColumnInfo _tax_rate_sls_amt5 = createColumnInfo("tax_rate_sls_amt5");
	public final MCNumberPermColumn tax_rate_sls_amt5 = createNumberColumn(_tax_rate_sls_amt5);
	
	/**
	 * 税率毎税額５. Tax amount per tax rate 5.<p>
	 *
	 */
	public static final String $tax_rate_tax_amt5 = "tax_rate_tax_amt5";
	private static final MCPermColumnInfo _tax_rate_tax_amt5 = createColumnInfo("tax_rate_tax_amt5");
	public final MCNumberPermColumn tax_rate_tax_amt5 = createNumberColumn(_tax_rate_tax_amt5);
	
	/**
	 * 税率毎基準通貨税額５. Tax amount (Base currency) per tax rate 5.<p>
	 *
	 */
	public static final String $tax_rate_base_tax_amt5 = "tax_rate_base_tax_amt5";
	private static final MCPermColumnInfo _tax_rate_base_tax_amt5 = createColumnInfo("tax_rate_base_tax_amt5");
	public final MCNumberPermColumn tax_rate_base_tax_amt5 = createNumberColumn(_tax_rate_base_tax_amt5);
	
	/**
	 * 税率６. Tax rate 6.<p>
	 *
	 */
	public static final String $tax_rate6 = "tax_rate6";
	private static final MCPermColumnInfo _tax_rate6 = createColumnInfo("tax_rate6");
	public final MCNumberPermColumn tax_rate6 = createNumberColumn(_tax_rate6);
	
	/**
	 * 税率毎買上額６. Purchase amount 6 per tax rate.<p>
	 *
	 */
	public static final String $tax_rate_sls_amt6 = "tax_rate_sls_amt6";
	private static final MCPermColumnInfo _tax_rate_sls_amt6 = createColumnInfo("tax_rate_sls_amt6");
	public final MCNumberPermColumn tax_rate_sls_amt6 = createNumberColumn(_tax_rate_sls_amt6);
	
	/**
	 * 税率毎税額６. Tax amount per tax rate 6.<p>
	 *
	 */
	public static final String $tax_rate_tax_amt6 = "tax_rate_tax_amt6";
	private static final MCPermColumnInfo _tax_rate_tax_amt6 = createColumnInfo("tax_rate_tax_amt6");
	public final MCNumberPermColumn tax_rate_tax_amt6 = createNumberColumn(_tax_rate_tax_amt6);
	
	/**
	 * 税率毎基準通貨税額６. Tax amount (Base currency) per tax rate 6.<p>
	 *
	 */
	public static final String $tax_rate_base_tax_amt6 = "tax_rate_base_tax_amt6";
	private static final MCPermColumnInfo _tax_rate_base_tax_amt6 = createColumnInfo("tax_rate_base_tax_amt6");
	public final MCNumberPermColumn tax_rate_base_tax_amt6 = createNumberColumn(_tax_rate_base_tax_amt6);
	
	/**
	 * 税率７. Tax rate 7.<p>
	 *
	 */
	public static final String $tax_rate7 = "tax_rate7";
	private static final MCPermColumnInfo _tax_rate7 = createColumnInfo("tax_rate7");
	public final MCNumberPermColumn tax_rate7 = createNumberColumn(_tax_rate7);
	
	/**
	 * 税率毎買上額７. Purchase amount 7 per tax rate.<p>
	 *
	 */
	public static final String $tax_rate_sls_amt7 = "tax_rate_sls_amt7";
	private static final MCPermColumnInfo _tax_rate_sls_amt7 = createColumnInfo("tax_rate_sls_amt7");
	public final MCNumberPermColumn tax_rate_sls_amt7 = createNumberColumn(_tax_rate_sls_amt7);
	
	/**
	 * 税率毎税額７. Tax amount per tax rate 7.<p>
	 *
	 */
	public static final String $tax_rate_tax_amt7 = "tax_rate_tax_amt7";
	private static final MCPermColumnInfo _tax_rate_tax_amt7 = createColumnInfo("tax_rate_tax_amt7");
	public final MCNumberPermColumn tax_rate_tax_amt7 = createNumberColumn(_tax_rate_tax_amt7);
	
	/**
	 * 税率毎基準通貨税額７. Tax amount (Base currency) per tax rate 7.<p>
	 *
	 */
	public static final String $tax_rate_base_tax_amt7 = "tax_rate_base_tax_amt7";
	private static final MCPermColumnInfo _tax_rate_base_tax_amt7 = createColumnInfo("tax_rate_base_tax_amt7");
	public final MCNumberPermColumn tax_rate_base_tax_amt7 = createNumberColumn(_tax_rate_base_tax_amt7);
	
	/**
	 * 税率８. Tax rate 8.<p>
	 *
	 */
	public static final String $tax_rate8 = "tax_rate8";
	private static final MCPermColumnInfo _tax_rate8 = createColumnInfo("tax_rate8");
	public final MCNumberPermColumn tax_rate8 = createNumberColumn(_tax_rate8);
	
	/**
	 * 税率毎買上額８. Purchase amount 8 per tax rate.<p>
	 *
	 */
	public static final String $tax_rate_sls_amt8 = "tax_rate_sls_amt8";
	private static final MCPermColumnInfo _tax_rate_sls_amt8 = createColumnInfo("tax_rate_sls_amt8");
	public final MCNumberPermColumn tax_rate_sls_amt8 = createNumberColumn(_tax_rate_sls_amt8);
	
	/**
	 * 税率毎税額８. Tax amount per tax rate 8.<p>
	 *
	 */
	public static final String $tax_rate_tax_amt8 = "tax_rate_tax_amt8";
	private static final MCPermColumnInfo _tax_rate_tax_amt8 = createColumnInfo("tax_rate_tax_amt8");
	public final MCNumberPermColumn tax_rate_tax_amt8 = createNumberColumn(_tax_rate_tax_amt8);
	
	/**
	 * 税率毎基準通貨税額８. Tax amount (Base currency) per tax rate 8.<p>
	 *
	 */
	public static final String $tax_rate_base_tax_amt8 = "tax_rate_base_tax_amt8";
	private static final MCPermColumnInfo _tax_rate_base_tax_amt8 = createColumnInfo("tax_rate_base_tax_amt8");
	public final MCNumberPermColumn tax_rate_base_tax_amt8 = createNumberColumn(_tax_rate_base_tax_amt8);
	
	/**
	 * 税率９. Tax rate 9.<p>
	 *
	 */
	public static final String $tax_rate9 = "tax_rate9";
	private static final MCPermColumnInfo _tax_rate9 = createColumnInfo("tax_rate9");
	public final MCNumberPermColumn tax_rate9 = createNumberColumn(_tax_rate9);
	
	/**
	 * 税率毎買上額９. Purchase amount 9 per tax rate.<p>
	 *
	 */
	public static final String $tax_rate_sls_amt9 = "tax_rate_sls_amt9";
	private static final MCPermColumnInfo _tax_rate_sls_amt9 = createColumnInfo("tax_rate_sls_amt9");
	public final MCNumberPermColumn tax_rate_sls_amt9 = createNumberColumn(_tax_rate_sls_amt9);
	
	/**
	 * 税率毎税額９. Tax amount per tax rate 9.<p>
	 *
	 */
	public static final String $tax_rate_tax_amt9 = "tax_rate_tax_amt9";
	private static final MCPermColumnInfo _tax_rate_tax_amt9 = createColumnInfo("tax_rate_tax_amt9");
	public final MCNumberPermColumn tax_rate_tax_amt9 = createNumberColumn(_tax_rate_tax_amt9);
	
	/**
	 * 税率毎基準通貨税額９. Tax amount (Base currency) per tax rate 9.<p>
	 *
	 */
	public static final String $tax_rate_base_tax_amt9 = "tax_rate_base_tax_amt9";
	private static final MCPermColumnInfo _tax_rate_base_tax_amt9 = createColumnInfo("tax_rate_base_tax_amt9");
	public final MCNumberPermColumn tax_rate_base_tax_amt9 = createNumberColumn(_tax_rate_base_tax_amt9);
	
	/**
	 * 税率１０. Tax rate 10.<p>
	 *
	 */
	public static final String $tax_rate10 = "tax_rate10";
	private static final MCPermColumnInfo _tax_rate10 = createColumnInfo("tax_rate10");
	public final MCNumberPermColumn tax_rate10 = createNumberColumn(_tax_rate10);
	
	/**
	 * 税率毎買上額１０. Purchase amount 10 per tax rate.<p>
	 *
	 */
	public static final String $tax_rate_sls_amt10 = "tax_rate_sls_amt10";
	private static final MCPermColumnInfo _tax_rate_sls_amt10 = createColumnInfo("tax_rate_sls_amt10");
	public final MCNumberPermColumn tax_rate_sls_amt10 = createNumberColumn(_tax_rate_sls_amt10);
	
	/**
	 * 税率毎税額１０. Tax amount per tax rate 10.<p>
	 *
	 */
	public static final String $tax_rate_tax_amt10 = "tax_rate_tax_amt10";
	private static final MCPermColumnInfo _tax_rate_tax_amt10 = createColumnInfo("tax_rate_tax_amt10");
	public final MCNumberPermColumn tax_rate_tax_amt10 = createNumberColumn(_tax_rate_tax_amt10);
	
	/**
	 * 税率毎基準通貨税額１０. Tax amount (Base currency) per tax rate 10.<p>
	 *
	 */
	public static final String $tax_rate_base_tax_amt10 = "tax_rate_base_tax_amt10";
	private static final MCPermColumnInfo _tax_rate_base_tax_amt10 = createColumnInfo("tax_rate_base_tax_amt10");
	public final MCNumberPermColumn tax_rate_base_tax_amt10 = createNumberColumn(_tax_rate_base_tax_amt10);
	
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
	 * 支払予定日１. Scheduled payment date 1.<p>
	 *
	 */
	public static final String $pay_schd_dt1 = "pay_schd_dt1";
	private static final MCPermColumnInfo _pay_schd_dt1 = createColumnInfo("pay_schd_dt1");
	public final MCDatePermColumn pay_schd_dt1 = createDateColumn(_pay_schd_dt1);
	
	/**
	 * 支払予定額１. Payment schedule amount 1.<p>
	 *
	 */
	public static final String $pay_schd_amt1 = "pay_schd_amt1";
	private static final MCPermColumnInfo _pay_schd_amt1 = createColumnInfo("pay_schd_amt1");
	public final MCNumberPermColumn pay_schd_amt1 = createNumberColumn(_pay_schd_amt1);
	
	/**
	 * 支払方法ＣＤ１. Payment method cd. 1.<p>
	 *
	 */
	public static final String $pay_mtd_cd1 = "pay_mtd_cd1";
	private static final MCPermColumnInfo _pay_mtd_cd1 = createColumnInfo("pay_mtd_cd1");
	public final MCStringPermColumn pay_mtd_cd1 = createStringColumn(_pay_mtd_cd1);
	
	/**
	 * ＩＦ支払方法ＣＤ１. IF payment method cd. 1.<p>
	 *
	 */
	public static final String $if_pay_mtd_cd1 = "if_pay_mtd_cd1";
	private static final MCPermColumnInfo _if_pay_mtd_cd1 = createColumnInfo("if_pay_mtd_cd1");
	public final MCStringPermColumn if_pay_mtd_cd1 = createStringColumn(_if_pay_mtd_cd1);
	
	/**
	 * ＩＦ支払方法名１. IF payment method name 1.<p>
	 *
	 */
	public static final String $if_pay_mtd_nm1 = "if_pay_mtd_nm1";
	private static final MCPermColumnInfo _if_pay_mtd_nm1 = createColumnInfo("if_pay_mtd_nm1");
	public final MCStringPermColumn if_pay_mtd_nm1 = createStringColumn(_if_pay_mtd_nm1);
	
	/**
	 * 支払予定日２. Scheduled payment date 2.<p>
	 *
	 */
	public static final String $pay_schd_dt2 = "pay_schd_dt2";
	private static final MCPermColumnInfo _pay_schd_dt2 = createColumnInfo("pay_schd_dt2");
	public final MCDatePermColumn pay_schd_dt2 = createDateColumn(_pay_schd_dt2);
	
	/**
	 * 支払予定額２. Payment schedule amount 2.<p>
	 *
	 */
	public static final String $pay_schd_amt2 = "pay_schd_amt2";
	private static final MCPermColumnInfo _pay_schd_amt2 = createColumnInfo("pay_schd_amt2");
	public final MCNumberPermColumn pay_schd_amt2 = createNumberColumn(_pay_schd_amt2);
	
	/**
	 * 支払方法ＣＤ２. Payment method cd. 2.<p>
	 *
	 */
	public static final String $pay_mtd_cd2 = "pay_mtd_cd2";
	private static final MCPermColumnInfo _pay_mtd_cd2 = createColumnInfo("pay_mtd_cd2");
	public final MCStringPermColumn pay_mtd_cd2 = createStringColumn(_pay_mtd_cd2);
	
	/**
	 * ＩＦ支払方法ＣＤ２. IF payment method cd. 2.<p>
	 *
	 */
	public static final String $if_pay_mtd_cd2 = "if_pay_mtd_cd2";
	private static final MCPermColumnInfo _if_pay_mtd_cd2 = createColumnInfo("if_pay_mtd_cd2");
	public final MCStringPermColumn if_pay_mtd_cd2 = createStringColumn(_if_pay_mtd_cd2);
	
	/**
	 * ＩＦ支払方法名２. IF payment method name 2.<p>
	 *
	 */
	public static final String $if_pay_mtd_nm2 = "if_pay_mtd_nm2";
	private static final MCPermColumnInfo _if_pay_mtd_nm2 = createColumnInfo("if_pay_mtd_nm2");
	public final MCStringPermColumn if_pay_mtd_nm2 = createStringColumn(_if_pay_mtd_nm2);
	
	/**
	 * 支払予定日３. Scheduled payment date 3.<p>
	 *
	 */
	public static final String $pay_schd_dt3 = "pay_schd_dt3";
	private static final MCPermColumnInfo _pay_schd_dt3 = createColumnInfo("pay_schd_dt3");
	public final MCDatePermColumn pay_schd_dt3 = createDateColumn(_pay_schd_dt3);
	
	/**
	 * 支払予定額３. Payment schedule amount 3.<p>
	 *
	 */
	public static final String $pay_schd_amt3 = "pay_schd_amt3";
	private static final MCPermColumnInfo _pay_schd_amt3 = createColumnInfo("pay_schd_amt3");
	public final MCNumberPermColumn pay_schd_amt3 = createNumberColumn(_pay_schd_amt3);
	
	/**
	 * 支払方法ＣＤ３. Payment method cd. 3.<p>
	 *
	 */
	public static final String $pay_mtd_cd3 = "pay_mtd_cd3";
	private static final MCPermColumnInfo _pay_mtd_cd3 = createColumnInfo("pay_mtd_cd3");
	public final MCStringPermColumn pay_mtd_cd3 = createStringColumn(_pay_mtd_cd3);
	
	/**
	 * ＩＦ支払方法ＣＤ３. IF payment method cd. 3.<p>
	 *
	 */
	public static final String $if_pay_mtd_cd3 = "if_pay_mtd_cd3";
	private static final MCPermColumnInfo _if_pay_mtd_cd3 = createColumnInfo("if_pay_mtd_cd3");
	public final MCStringPermColumn if_pay_mtd_cd3 = createStringColumn(_if_pay_mtd_cd3);
	
	/**
	 * ＩＦ支払方法名３. IF payment method name 3.<p>
	 *
	 */
	public static final String $if_pay_mtd_nm3 = "if_pay_mtd_nm3";
	private static final MCPermColumnInfo _if_pay_mtd_nm3 = createColumnInfo("if_pay_mtd_nm3");
	public final MCStringPermColumn if_pay_mtd_nm3 = createStringColumn(_if_pay_mtd_nm3);
	
	/**
	 * 支払予定日４. Scheduled payment date 4.<p>
	 *
	 */
	public static final String $pay_schd_dt4 = "pay_schd_dt4";
	private static final MCPermColumnInfo _pay_schd_dt4 = createColumnInfo("pay_schd_dt4");
	public final MCDatePermColumn pay_schd_dt4 = createDateColumn(_pay_schd_dt4);
	
	/**
	 * 支払予定額４. Payment schedule amount 4.<p>
	 *
	 */
	public static final String $pay_schd_amt4 = "pay_schd_amt4";
	private static final MCPermColumnInfo _pay_schd_amt4 = createColumnInfo("pay_schd_amt4");
	public final MCNumberPermColumn pay_schd_amt4 = createNumberColumn(_pay_schd_amt4);
	
	/**
	 * 支払方法ＣＤ４. Payment method cd. 4.<p>
	 *
	 */
	public static final String $pay_mtd_cd4 = "pay_mtd_cd4";
	private static final MCPermColumnInfo _pay_mtd_cd4 = createColumnInfo("pay_mtd_cd4");
	public final MCStringPermColumn pay_mtd_cd4 = createStringColumn(_pay_mtd_cd4);
	
	/**
	 * ＩＦ支払方法ＣＤ４. IF payment method cd. 4.<p>
	 *
	 */
	public static final String $if_pay_mtd_cd4 = "if_pay_mtd_cd4";
	private static final MCPermColumnInfo _if_pay_mtd_cd4 = createColumnInfo("if_pay_mtd_cd4");
	public final MCStringPermColumn if_pay_mtd_cd4 = createStringColumn(_if_pay_mtd_cd4);
	
	/**
	 * ＩＦ支払方法名４. IF payment method name 4.<p>
	 *
	 */
	public static final String $if_pay_mtd_nm4 = "if_pay_mtd_nm4";
	private static final MCPermColumnInfo _if_pay_mtd_nm4 = createColumnInfo("if_pay_mtd_nm4");
	public final MCStringPermColumn if_pay_mtd_nm4 = createStringColumn(_if_pay_mtd_nm4);
	
	/**
	 * 支払予定日５. Scheduled payment date 5.<p>
	 *
	 */
	public static final String $pay_schd_dt5 = "pay_schd_dt5";
	private static final MCPermColumnInfo _pay_schd_dt5 = createColumnInfo("pay_schd_dt5");
	public final MCDatePermColumn pay_schd_dt5 = createDateColumn(_pay_schd_dt5);
	
	/**
	 * 支払予定額５. Payment schedule amount 5.<p>
	 *
	 */
	public static final String $pay_schd_amt5 = "pay_schd_amt5";
	private static final MCPermColumnInfo _pay_schd_amt5 = createColumnInfo("pay_schd_amt5");
	public final MCNumberPermColumn pay_schd_amt5 = createNumberColumn(_pay_schd_amt5);
	
	/**
	 * 支払方法ＣＤ５. Payment method cd. 5.<p>
	 *
	 */
	public static final String $pay_mtd_cd5 = "pay_mtd_cd5";
	private static final MCPermColumnInfo _pay_mtd_cd5 = createColumnInfo("pay_mtd_cd5");
	public final MCStringPermColumn pay_mtd_cd5 = createStringColumn(_pay_mtd_cd5);
	
	/**
	 * ＩＦ支払方法ＣＤ５. IF payment method cd. 5.<p>
	 *
	 */
	public static final String $if_pay_mtd_cd5 = "if_pay_mtd_cd5";
	private static final MCPermColumnInfo _if_pay_mtd_cd5 = createColumnInfo("if_pay_mtd_cd5");
	public final MCStringPermColumn if_pay_mtd_cd5 = createStringColumn(_if_pay_mtd_cd5);
	
	/**
	 * ＩＦ支払方法名５. IF payment method name 5.<p>
	 *
	 */
	public static final String $if_pay_mtd_nm5 = "if_pay_mtd_nm5";
	private static final MCPermColumnInfo _if_pay_mtd_nm5 = createColumnInfo("if_pay_mtd_nm5");
	public final MCStringPermColumn if_pay_mtd_nm5 = createStringColumn(_if_pay_mtd_nm5);
	
	/**
	 * 支払予定日６. Scheduled payment date 6.<p>
	 *
	 */
	public static final String $pay_schd_dt6 = "pay_schd_dt6";
	private static final MCPermColumnInfo _pay_schd_dt6 = createColumnInfo("pay_schd_dt6");
	public final MCDatePermColumn pay_schd_dt6 = createDateColumn(_pay_schd_dt6);
	
	/**
	 * 支払予定額６. Payment schedule amount 6.<p>
	 *
	 */
	public static final String $pay_schd_amt6 = "pay_schd_amt6";
	private static final MCPermColumnInfo _pay_schd_amt6 = createColumnInfo("pay_schd_amt6");
	public final MCNumberPermColumn pay_schd_amt6 = createNumberColumn(_pay_schd_amt6);
	
	/**
	 * 支払方法ＣＤ６. Payment method cd. 6.<p>
	 *
	 */
	public static final String $pay_mtd_cd6 = "pay_mtd_cd6";
	private static final MCPermColumnInfo _pay_mtd_cd6 = createColumnInfo("pay_mtd_cd6");
	public final MCStringPermColumn pay_mtd_cd6 = createStringColumn(_pay_mtd_cd6);
	
	/**
	 * ＩＦ支払方法ＣＤ６. IF payment method cd. 6.<p>
	 *
	 */
	public static final String $if_pay_mtd_cd6 = "if_pay_mtd_cd6";
	private static final MCPermColumnInfo _if_pay_mtd_cd6 = createColumnInfo("if_pay_mtd_cd6");
	public final MCStringPermColumn if_pay_mtd_cd6 = createStringColumn(_if_pay_mtd_cd6);
	
	/**
	 * ＩＦ支払方法名６. IF payment method name 6.<p>
	 *
	 */
	public static final String $if_pay_mtd_nm6 = "if_pay_mtd_nm6";
	private static final MCPermColumnInfo _if_pay_mtd_nm6 = createColumnInfo("if_pay_mtd_nm6");
	public final MCStringPermColumn if_pay_mtd_nm6 = createStringColumn(_if_pay_mtd_nm6);
	
	/**
	 * 支払予定日７. Scheduled payment date 7.<p>
	 *
	 */
	public static final String $pay_schd_dt7 = "pay_schd_dt7";
	private static final MCPermColumnInfo _pay_schd_dt7 = createColumnInfo("pay_schd_dt7");
	public final MCDatePermColumn pay_schd_dt7 = createDateColumn(_pay_schd_dt7);
	
	/**
	 * 支払予定額７. Payment schedule amount 7.<p>
	 *
	 */
	public static final String $pay_schd_amt7 = "pay_schd_amt7";
	private static final MCPermColumnInfo _pay_schd_amt7 = createColumnInfo("pay_schd_amt7");
	public final MCNumberPermColumn pay_schd_amt7 = createNumberColumn(_pay_schd_amt7);
	
	/**
	 * 支払方法ＣＤ７. Payment method cd. 7.<p>
	 *
	 */
	public static final String $pay_mtd_cd7 = "pay_mtd_cd7";
	private static final MCPermColumnInfo _pay_mtd_cd7 = createColumnInfo("pay_mtd_cd7");
	public final MCStringPermColumn pay_mtd_cd7 = createStringColumn(_pay_mtd_cd7);
	
	/**
	 * ＩＦ支払方法ＣＤ７. IF payment method cd. 7.<p>
	 *
	 */
	public static final String $if_pay_mtd_cd7 = "if_pay_mtd_cd7";
	private static final MCPermColumnInfo _if_pay_mtd_cd7 = createColumnInfo("if_pay_mtd_cd7");
	public final MCStringPermColumn if_pay_mtd_cd7 = createStringColumn(_if_pay_mtd_cd7);
	
	/**
	 * ＩＦ支払方法名７. IF payment method name 7.<p>
	 *
	 */
	public static final String $if_pay_mtd_nm7 = "if_pay_mtd_nm7";
	private static final MCPermColumnInfo _if_pay_mtd_nm7 = createColumnInfo("if_pay_mtd_nm7");
	public final MCStringPermColumn if_pay_mtd_nm7 = createStringColumn(_if_pay_mtd_nm7);
	
	/**
	 * 支払予定日８. Scheduled payment date 8.<p>
	 *
	 */
	public static final String $pay_schd_dt8 = "pay_schd_dt8";
	private static final MCPermColumnInfo _pay_schd_dt8 = createColumnInfo("pay_schd_dt8");
	public final MCDatePermColumn pay_schd_dt8 = createDateColumn(_pay_schd_dt8);
	
	/**
	 * 支払予定額８. Payment schedule amount 8.<p>
	 *
	 */
	public static final String $pay_schd_amt8 = "pay_schd_amt8";
	private static final MCPermColumnInfo _pay_schd_amt8 = createColumnInfo("pay_schd_amt8");
	public final MCNumberPermColumn pay_schd_amt8 = createNumberColumn(_pay_schd_amt8);
	
	/**
	 * 支払方法ＣＤ８. Payment method cd. 8.<p>
	 *
	 */
	public static final String $pay_mtd_cd8 = "pay_mtd_cd8";
	private static final MCPermColumnInfo _pay_mtd_cd8 = createColumnInfo("pay_mtd_cd8");
	public final MCStringPermColumn pay_mtd_cd8 = createStringColumn(_pay_mtd_cd8);
	
	/**
	 * ＩＦ支払方法ＣＤ８. IF payment method cd. 8.<p>
	 *
	 */
	public static final String $if_pay_mtd_cd8 = "if_pay_mtd_cd8";
	private static final MCPermColumnInfo _if_pay_mtd_cd8 = createColumnInfo("if_pay_mtd_cd8");
	public final MCStringPermColumn if_pay_mtd_cd8 = createStringColumn(_if_pay_mtd_cd8);
	
	/**
	 * ＩＦ支払方法名８. IF payment method name 8.<p>
	 *
	 */
	public static final String $if_pay_mtd_nm8 = "if_pay_mtd_nm8";
	private static final MCPermColumnInfo _if_pay_mtd_nm8 = createColumnInfo("if_pay_mtd_nm8");
	public final MCStringPermColumn if_pay_mtd_nm8 = createStringColumn(_if_pay_mtd_nm8);
	
	/**
	 * 支払予定日９. Scheduled payment date 9.<p>
	 *
	 */
	public static final String $pay_schd_dt9 = "pay_schd_dt9";
	private static final MCPermColumnInfo _pay_schd_dt9 = createColumnInfo("pay_schd_dt9");
	public final MCDatePermColumn pay_schd_dt9 = createDateColumn(_pay_schd_dt9);
	
	/**
	 * 支払予定額９. Payment schedule amount 9.<p>
	 *
	 */
	public static final String $pay_schd_amt9 = "pay_schd_amt9";
	private static final MCPermColumnInfo _pay_schd_amt9 = createColumnInfo("pay_schd_amt9");
	public final MCNumberPermColumn pay_schd_amt9 = createNumberColumn(_pay_schd_amt9);
	
	/**
	 * 支払方法ＣＤ９. Payment method cd. 9.<p>
	 *
	 */
	public static final String $pay_mtd_cd9 = "pay_mtd_cd9";
	private static final MCPermColumnInfo _pay_mtd_cd9 = createColumnInfo("pay_mtd_cd9");
	public final MCStringPermColumn pay_mtd_cd9 = createStringColumn(_pay_mtd_cd9);
	
	/**
	 * ＩＦ支払方法ＣＤ９. IF payment method cd. 9.<p>
	 *
	 */
	public static final String $if_pay_mtd_cd9 = "if_pay_mtd_cd9";
	private static final MCPermColumnInfo _if_pay_mtd_cd9 = createColumnInfo("if_pay_mtd_cd9");
	public final MCStringPermColumn if_pay_mtd_cd9 = createStringColumn(_if_pay_mtd_cd9);
	
	/**
	 * ＩＦ支払方法名９. IF payment method name 9.<p>
	 *
	 */
	public static final String $if_pay_mtd_nm9 = "if_pay_mtd_nm9";
	private static final MCPermColumnInfo _if_pay_mtd_nm9 = createColumnInfo("if_pay_mtd_nm9");
	public final MCStringPermColumn if_pay_mtd_nm9 = createStringColumn(_if_pay_mtd_nm9);
	
	/**
	 * 支払予定日１０. Scheduled payment date 10.<p>
	 *
	 */
	public static final String $pay_schd_dt10 = "pay_schd_dt10";
	private static final MCPermColumnInfo _pay_schd_dt10 = createColumnInfo("pay_schd_dt10");
	public final MCDatePermColumn pay_schd_dt10 = createDateColumn(_pay_schd_dt10);
	
	/**
	 * 支払予定額１０. Payment schedule amount 10.<p>
	 *
	 */
	public static final String $pay_schd_amt10 = "pay_schd_amt10";
	private static final MCPermColumnInfo _pay_schd_amt10 = createColumnInfo("pay_schd_amt10");
	public final MCNumberPermColumn pay_schd_amt10 = createNumberColumn(_pay_schd_amt10);
	
	/**
	 * 支払方法ＣＤ１０. Payment method cd. 10.<p>
	 *
	 */
	public static final String $pay_mtd_cd10 = "pay_mtd_cd10";
	private static final MCPermColumnInfo _pay_mtd_cd10 = createColumnInfo("pay_mtd_cd10");
	public final MCStringPermColumn pay_mtd_cd10 = createStringColumn(_pay_mtd_cd10);
	
	/**
	 * ＩＦ支払方法ＣＤ１０. IF payment method cd. 10.<p>
	 *
	 */
	public static final String $if_pay_mtd_cd10 = "if_pay_mtd_cd10";
	private static final MCPermColumnInfo _if_pay_mtd_cd10 = createColumnInfo("if_pay_mtd_cd10");
	public final MCStringPermColumn if_pay_mtd_cd10 = createStringColumn(_if_pay_mtd_cd10);
	
	/**
	 * ＩＦ支払方法名１０. IF payment method name 10.<p>
	 *
	 */
	public static final String $if_pay_mtd_nm10 = "if_pay_mtd_nm10";
	private static final MCPermColumnInfo _if_pay_mtd_nm10 = createColumnInfo("if_pay_mtd_nm10");
	public final MCStringPermColumn if_pay_mtd_nm10 = createStringColumn(_if_pay_mtd_nm10);
	
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
	 * 口座区分. Bank account type.<p>
	 *
	 */
	public static final String $bank_ac_typ = "bank_ac_typ";
	private static final MCPermColumnInfo _bank_ac_typ = createColumnInfo("bank_ac_typ");
	public final MCStringPermColumn bank_ac_typ = createStringColumn(_bank_ac_typ);
	
	/**
	 * 口座番号. Bank account number.<p>
	 *
	 */
	public static final String $bank_ac_no = "bank_ac_no";
	private static final MCPermColumnInfo _bank_ac_no = createColumnInfo("bank_ac_no");
	public final MCStringPermColumn bank_ac_no = createStringColumn(_bank_ac_no);
	
	/**
	 * 口座名義. Bank account holder.<p>
	 *
	 */
	public static final String $bank_ac_holder = "bank_ac_holder";
	private static final MCPermColumnInfo _bank_ac_holder = createColumnInfo("bank_ac_holder");
	public final MCStringPermColumn bank_ac_holder = createStringColumn(_bank_ac_holder);
	
	/**
	 * 口座名義別名. Account holder alias name.<p>
	 *
	 */
	public static final String $bank_ac_holder_sub = "bank_ac_holder_sub";
	private static final MCPermColumnInfo _bank_ac_holder_sub = createColumnInfo("bank_ac_holder_sub");
	public final MCStringPermColumn bank_ac_holder_sub = createStringColumn(_bank_ac_holder_sub);
	
	/**
	 * 銀行ＣＤ. Bank cd..<p>
	 *
	 */
	public static final String $bank_cd = "bank_cd";
	private static final MCPermColumnInfo _bank_cd = createColumnInfo("bank_cd");
	public final MCStringPermColumn bank_cd = createStringColumn(_bank_cd);
	
	/**
	 * 銀行名. Bank name.<p>
	 *
	 */
	public static final String $bank_nm = "bank_nm";
	private static final MCPermColumnInfo _bank_nm = createColumnInfo("bank_nm");
	public final MCStringPermColumn bank_nm = createStringColumn(_bank_nm);
	
	/**
	 * 支店ＣＤ. Branch cd..<p>
	 *
	 */
	public static final String $branch_cd = "branch_cd";
	private static final MCPermColumnInfo _branch_cd = createColumnInfo("branch_cd");
	public final MCStringPermColumn branch_cd = createStringColumn(_branch_cd);
	
	/**
	 * 支店名. Branch name.<p>
	 *
	 */
	public static final String $branch_nm = "branch_nm";
	private static final MCPermColumnInfo _branch_nm = createColumnInfo("branch_nm");
	public final MCStringPermColumn branch_nm = createStringColumn(_branch_nm);
	
	/**
	 * 取引ＣＤ. Transaction cd..<p>
	 *
	 */
	public static final String $trd_cd = "trd_cd";
	private static final MCPermColumnInfo _trd_cd = createColumnInfo("trd_cd");
	public final MCStringPermColumn trd_cd = createStringColumn(_trd_cd);
	
	/**
	 * ＩＦ取引ＣＤ. IF transaction cd..<p>
	 *
	 */
	public static final String $if_trd_cd = "if_trd_cd";
	private static final MCPermColumnInfo _if_trd_cd = createColumnInfo("if_trd_cd");
	public final MCStringPermColumn if_trd_cd = createStringColumn(_if_trd_cd);
	
	/**
	 * ＩＦ取引名. IF transaction name.<p>
	 *
	 */
	public static final String $if_trd_nm = "if_trd_nm";
	private static final MCPermColumnInfo _if_trd_nm = createColumnInfo("if_trd_nm");
	public final MCStringPermColumn if_trd_nm = createStringColumn(_if_trd_nm);
	
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
	 * 納品書ＮＯ. Delivery note No..<p>
	 *
	 */
	public static final String $dlv_slip_no = "dlv_slip_no";
	private static final MCPermColumnInfo _dlv_slip_no = createColumnInfo("dlv_slip_no");
	public final MCStringPermColumn dlv_slip_no = createStringColumn(_dlv_slip_no);
	
	/**
	 * 納品書明細ＮＯ. Delivery note details No..<p>
	 *
	 */
	public static final String $dlv_slip_d_no = "dlv_slip_d_no";
	private static final MCPermColumnInfo _dlv_slip_d_no = createColumnInfo("dlv_slip_d_no");
	public final MCStringPermColumn dlv_slip_d_no = createStringColumn(_dlv_slip_d_no);
	
	/**
	 * 出荷時納品書ＮＯ. Delivery note No. at shipping.<p>
	 *
	 */
	public static final String $ship_dlv_slip_no = "ship_dlv_slip_no";
	private static final MCPermColumnInfo _ship_dlv_slip_no = createColumnInfo("ship_dlv_slip_no");
	public final MCStringPermColumn ship_dlv_slip_no = createStringColumn(_ship_dlv_slip_no);
	
	/**
	 * 出荷時納品書明細ＮＯ. Delivery note details No. at shipping.<p>
	 *
	 */
	public static final String $ship_dlv_slip_d_no = "ship_dlv_slip_d_no";
	private static final MCPermColumnInfo _ship_dlv_slip_d_no = createColumnInfo("ship_dlv_slip_d_no");
	public final MCStringPermColumn ship_dlv_slip_d_no = createStringColumn(_ship_dlv_slip_d_no);
	
	/**
	 * ヘッダ実績ＮＯ. Header result No..<p>
	 *
	 */
	public static final String $act_no = "act_no";
	private static final MCPermColumnInfo _act_no = createColumnInfo("act_no");
	public final MCStringPermColumn act_no = createStringColumn(_act_no);
	
	/**
	 * ヘッダ実績改訂番号. Header result rev. number.<p>
	 *
	 */
	public static final String $act_rev = "act_rev";
	private static final MCPermColumnInfo _act_rev = createColumnInfo("act_rev");
	public final MCNumberPermColumn act_rev = createNumberColumn(_act_rev);
	
	/**
	 * 明細実績ＮＯ. Details result No..<p>
	 *
	 */
	public static final String $act_d_no = "act_d_no";
	private static final MCPermColumnInfo _act_d_no = createColumnInfo("act_d_no");
	public final MCStringPermColumn act_d_no = createStringColumn(_act_d_no);
	
	/**
	 * 発注ＮＯ. PO No..<p>
	 *
	 */
	public static final String $po_no = "po_no";
	private static final MCPermColumnInfo _po_no = createColumnInfo("po_no");
	public final MCStringPermColumn po_no = createStringColumn(_po_no);
	
	/**
	 * 発注明細ＮＯ. PO details No..<p>
	 *
	 */
	public static final String $po_d_no = "po_d_no";
	private static final MCPermColumnInfo _po_d_no = createColumnInfo("po_d_no");
	public final MCStringPermColumn po_d_no = createStringColumn(_po_d_no);
	
	/**
	 * 計上日. Recording date.<p>
	 *
	 */
	public static final String $ac_dt = "ac_dt";
	private static final MCPermColumnInfo _ac_dt = createColumnInfo("ac_dt");
	public final MCDatePermColumn ac_dt = createDateColumn(_ac_dt);
	
	/**
	 * 納品日. Delivery date.<p>
	 *
	 */
	public static final String $dlv_dt = "dlv_dt";
	private static final MCPermColumnInfo _dlv_dt = createColumnInfo("dlv_dt");
	public final MCDatePermColumn dlv_dt = createDateColumn(_dlv_dt);
	
	/**
	 * 入金日. Payment received date.<p>
	 *
	 */
	public static final String $rcv_dt = "rcv_dt";
	private static final MCPermColumnInfo _rcv_dt = createColumnInfo("rcv_dt");
	public final MCDatePermColumn rcv_dt = createDateColumn(_rcv_dt);
	
	/**
	 * 請求起算日. Billing base date.<p>
	 *
	 */
	public static final String $bill_basis_dt = "bill_basis_dt";
	private static final MCPermColumnInfo _bill_basis_dt = createColumnInfo("bill_basis_dt");
	public final MCDatePermColumn bill_basis_dt = createDateColumn(_bill_basis_dt);
	
	/**
	 * 計上日（基）. Recording date (Base).<p>
	 *
	 */
	public static final String $base_ac_dt = "base_ac_dt";
	private static final MCPermColumnInfo _base_ac_dt = createColumnInfo("base_ac_dt");
	public final MCDatePermColumn base_ac_dt = createDateColumn(_base_ac_dt);
	
	/**
	 * 品目ＣＤ. Item cd..<p>
	 *
	 */
	public static final String $itm_cd = "itm_cd";
	private static final MCPermColumnInfo _itm_cd = createColumnInfo("itm_cd");
	public final MCStringPermColumn itm_cd = createStringColumn(_itm_cd);
	
	/**
	 * 枝番１. Branch No. 1.<p>
	 *
	 */
	public static final String $itm_sub1 = "itm_sub1";
	private static final MCPermColumnInfo _itm_sub1 = createColumnInfo("itm_sub1");
	public final MCStringPermColumn itm_sub1 = createStringColumn(_itm_sub1);
	
	/**
	 * 枝番２. Branch No. 2.<p>
	 *
	 */
	public static final String $itm_sub2 = "itm_sub2";
	private static final MCPermColumnInfo _itm_sub2 = createColumnInfo("itm_sub2");
	public final MCStringPermColumn itm_sub2 = createStringColumn(_itm_sub2);
	
	/**
	 * 枝番３. Branch No. 3.<p>
	 *
	 */
	public static final String $itm_sub3 = "itm_sub3";
	private static final MCPermColumnInfo _itm_sub3 = createColumnInfo("itm_sub3");
	public final MCStringPermColumn itm_sub3 = createStringColumn(_itm_sub3);
	
	/**
	 * ＩＦ品目ＣＤ. IF item cd..<p>
	 *
	 */
	public static final String $if_itm_cd = "if_itm_cd";
	private static final MCPermColumnInfo _if_itm_cd = createColumnInfo("if_itm_cd");
	public final MCStringPermColumn if_itm_cd = createStringColumn(_if_itm_cd);
	
	/**
	 * ＩＦ枝番１. IF branch No. 1.<p>
	 *
	 */
	public static final String $if_itm_sub1 = "if_itm_sub1";
	private static final MCPermColumnInfo _if_itm_sub1 = createColumnInfo("if_itm_sub1");
	public final MCStringPermColumn if_itm_sub1 = createStringColumn(_if_itm_sub1);
	
	/**
	 * ＩＦ枝番２. IF branch No. 2.<p>
	 *
	 */
	public static final String $if_itm_sub2 = "if_itm_sub2";
	private static final MCPermColumnInfo _if_itm_sub2 = createColumnInfo("if_itm_sub2");
	public final MCStringPermColumn if_itm_sub2 = createStringColumn(_if_itm_sub2);
	
	/**
	 * ＩＦ枝番３. IF branch No. 3.<p>
	 *
	 */
	public static final String $if_itm_sub3 = "if_itm_sub3";
	private static final MCPermColumnInfo _if_itm_sub3 = createColumnInfo("if_itm_sub3");
	public final MCStringPermColumn if_itm_sub3 = createStringColumn(_if_itm_sub3);
	
	/**
	 * ＩＦ品名. IF item name.<p>
	 *
	 */
	public static final String $if_itm_nm = "if_itm_nm";
	private static final MCPermColumnInfo _if_itm_nm = createColumnInfo("if_itm_nm");
	public final MCStringPermColumn if_itm_nm = createStringColumn(_if_itm_nm);
	
	/**
	 * 品目別名１. Item alias name 1.<p>
	 *
	 */
	public static final String $itm_alt_nm1 = "itm_alt_nm1";
	private static final MCPermColumnInfo _itm_alt_nm1 = createColumnInfo("itm_alt_nm1");
	public final MCStringPermColumn itm_alt_nm1 = createStringColumn(_itm_alt_nm1);
	
	/**
	 * 品目別名２. Item alias name 2.<p>
	 *
	 */
	public static final String $itm_alt_nm2 = "itm_alt_nm2";
	private static final MCPermColumnInfo _itm_alt_nm2 = createColumnInfo("itm_alt_nm2");
	public final MCStringPermColumn itm_alt_nm2 = createStringColumn(_itm_alt_nm2);
	
	/**
	 * 品目別名３. Item alias name 3.<p>
	 *
	 */
	public static final String $itm_alt_nm3 = "itm_alt_nm3";
	private static final MCPermColumnInfo _itm_alt_nm3 = createColumnInfo("itm_alt_nm3");
	public final MCStringPermColumn itm_alt_nm3 = createStringColumn(_itm_alt_nm3);
	
	/**
	 * 品目別名４. Item alias name 4.<p>
	 *
	 */
	public static final String $itm_alt_nm4 = "itm_alt_nm4";
	private static final MCPermColumnInfo _itm_alt_nm4 = createColumnInfo("itm_alt_nm4");
	public final MCStringPermColumn itm_alt_nm4 = createStringColumn(_itm_alt_nm4);
	
	/**
	 * 手配ＮＯ１. SEIBAN No. 1.<p>
	 *
	 */
	public static final String $sno1 = "sno1";
	private static final MCPermColumnInfo _sno1 = createColumnInfo("sno1");
	public final MCStringPermColumn sno1 = createStringColumn(_sno1);
	
	/**
	 * 手配ＮＯ２. SEIBAN No. 2.<p>
	 *
	 */
	public static final String $sno2 = "sno2";
	private static final MCPermColumnInfo _sno2 = createColumnInfo("sno2");
	public final MCStringPermColumn sno2 = createStringColumn(_sno2);
	
	/**
	 * 手配ＮＯ３. SEIBAN No. 3.<p>
	 *
	 */
	public static final String $sno3 = "sno3";
	private static final MCPermColumnInfo _sno3 = createColumnInfo("sno3");
	public final MCStringPermColumn sno3 = createStringColumn(_sno3);
	
	/**
	 * 手配ＮＯ４. SEIBAN No. 4.<p>
	 *
	 */
	public static final String $sno4 = "sno4";
	private static final MCPermColumnInfo _sno4 = createColumnInfo("sno4");
	public final MCStringPermColumn sno4 = createStringColumn(_sno4);
	
	/**
	 * 取引単位ＣＤ. Transaction unit cd..<p>
	 *
	 */
	public static final String $trd_unit_cd = "trd_unit_cd";
	private static final MCPermColumnInfo _trd_unit_cd = createColumnInfo("trd_unit_cd");
	public final MCStringPermColumn trd_unit_cd = createStringColumn(_trd_unit_cd);
	
	/**
	 * ＩＦ取引単位ＣＤ. IF transaction unit cd..<p>
	 *
	 */
	public static final String $if_trd_unit_cd = "if_trd_unit_cd";
	private static final MCPermColumnInfo _if_trd_unit_cd = createColumnInfo("if_trd_unit_cd");
	public final MCStringPermColumn if_trd_unit_cd = createStringColumn(_if_trd_unit_cd);
	
	/**
	 * ＩＦ取引単位名. IF transaction unit name.<p>
	 *
	 */
	public static final String $if_trd_unit_nm = "if_trd_unit_nm";
	private static final MCPermColumnInfo _if_trd_unit_nm = createColumnInfo("if_trd_unit_nm");
	public final MCStringPermColumn if_trd_unit_nm = createStringColumn(_if_trd_unit_nm);
	
	/**
	 * 取引単位数量. Transaction unit qty..<p>
	 *
	 */
	public static final String $trd_unit_qty = "trd_unit_qty";
	private static final MCPermColumnInfo _trd_unit_qty = createColumnInfo("trd_unit_qty");
	public final MCNumberPermColumn trd_unit_qty = createNumberColumn(_trd_unit_qty);
	
	/**
	 * 仮単価ＦＬＧ. Temporary unit price flg..<p>
	 *
	 */
	public static final String $interim_flg = "interim_flg";
	private static final MCPermColumnInfo _interim_flg = createColumnInfo("interim_flg");
	public final MCBooleanPermColumn interim_flg = createBooleanColumn(_interim_flg);
	
	/**
	 * 取引通貨単価. Unit price (Transaction currency).<p>
	 *
	 */
	public static final String $trd_cur_upri = "trd_cur_upri";
	private static final MCPermColumnInfo _trd_cur_upri = createColumnInfo("trd_cur_upri");
	public final MCNumberPermColumn trd_cur_upri = createNumberColumn(_trd_cur_upri);
	
	/**
	 * 取引通貨金額. Amount (Transaction currency).<p>
	 *
	 */
	public static final String $trd_cur_amt = "trd_cur_amt";
	private static final MCPermColumnInfo _trd_cur_amt = createColumnInfo("trd_cur_amt");
	public final MCNumberPermColumn trd_cur_amt = createNumberColumn(_trd_cur_amt);
	
	/**
	 * 取引通貨値引額. Discount amount (Transaction currency).<p>
	 *
	 */
	public static final String $trd_cur_dscnt_amt = "trd_cur_dscnt_amt";
	private static final MCPermColumnInfo _trd_cur_dscnt_amt = createColumnInfo("trd_cur_dscnt_amt");
	public final MCNumberPermColumn trd_cur_dscnt_amt = createNumberColumn(_trd_cur_dscnt_amt);
	
	/**
	 * 税ＣＤ. Tax cd..<p>
	 *
	 */
	public static final String $tax_cd = "tax_cd";
	private static final MCPermColumnInfo _tax_cd = createColumnInfo("tax_cd");
	public final MCStringPermColumn tax_cd = createStringColumn(_tax_cd);
	
	/**
	 * ＩＦ税ＣＤ. IF tax cd..<p>
	 *
	 */
	public static final String $if_tax_cd = "if_tax_cd";
	private static final MCPermColumnInfo _if_tax_cd = createColumnInfo("if_tax_cd");
	public final MCStringPermColumn if_tax_cd = createStringColumn(_if_tax_cd);
	
	/**
	 * ＩＦ税名. IF tax name.<p>
	 *
	 */
	public static final String $if_tax_nm = "if_tax_nm";
	private static final MCPermColumnInfo _if_tax_nm = createColumnInfo("if_tax_nm");
	public final MCStringPermColumn if_tax_nm = createStringColumn(_if_tax_nm);
	
	/**
	 * 税率. Tax rate.<p>
	 *
	 */
	public static final String $tax_rate = "tax_rate";
	private static final MCPermColumnInfo _tax_rate = createColumnInfo("tax_rate");
	public final MCNumberPermColumn tax_rate = createNumberColumn(_tax_rate);
	
	/**
	 * 内税ＦＬＧ. Tax inclusive flg..<p>
	 *
	 */
	public static final String $inc_tax_flg = "inc_tax_flg";
	private static final MCPermColumnInfo _inc_tax_flg = createColumnInfo("inc_tax_flg");
	public final MCBooleanPermColumn inc_tax_flg = createBooleanColumn(_inc_tax_flg);
	
	/**
	 * 取引通貨税額. Tax amount (Transaction currency).<p>
	 *
	 */
	public static final String $trd_cur_tax_amt = "trd_cur_tax_amt";
	private static final MCPermColumnInfo _trd_cur_tax_amt = createColumnInfo("trd_cur_tax_amt");
	public final MCNumberPermColumn trd_cur_tax_amt = createNumberColumn(_trd_cur_tax_amt);
	
	/**
	 * 明細備考. Details remarks.<p>
	 *
	 */
	public static final String $trd_d_rmrks = "trd_d_rmrks";
	private static final MCPermColumnInfo _trd_d_rmrks = createColumnInfo("trd_d_rmrks");
	public final MCStringPermColumn trd_d_rmrks = createStringColumn(_trd_d_rmrks);
	
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
	 * 請求書宛先. Invoice destination.<p>
	 *
	 */
	public static final String $bill_bcst_nm = "bill_bcst_nm";
	private static final MCPermColumnInfo _bill_bcst_nm = createColumnInfo("bill_bcst_nm");
	public final MCStringPermColumn bill_bcst_nm = createStringColumn(_bill_bcst_nm);
	
	/**
	 * 請求書送付法人番号. Invoice send-to corporation No..<p>
	 *
	 */
	public static final String $bill_ein = "bill_ein";
	private static final MCPermColumnInfo _bill_ein = createColumnInfo("bill_ein");
	public final MCStringPermColumn bill_ein = createStringColumn(_bill_ein);
	
	/**
	 * 請求書送付事業者ＮＯ. Invoice send-to business No..<p>
	 *
	 */
	public static final String $bill_biz_co_no = "bill_biz_co_no";
	private static final MCPermColumnInfo _bill_biz_co_no = createColumnInfo("bill_biz_co_no");
	public final MCStringPermColumn bill_biz_co_no = createStringColumn(_bill_biz_co_no);
	
	/**
	 * 請求書送付郵便番号. Invoice send-to zip code.<p>
	 *
	 */
	public static final String $bill_zip_cd = "bill_zip_cd";
	private static final MCPermColumnInfo _bill_zip_cd = createColumnInfo("bill_zip_cd");
	public final MCStringPermColumn bill_zip_cd = createStringColumn(_bill_zip_cd);
	
	/**
	 * 請求書送付住所１. Invoice send-to address 1.<p>
	 *
	 */
	public static final String $bill_addr1 = "bill_addr1";
	private static final MCPermColumnInfo _bill_addr1 = createColumnInfo("bill_addr1");
	public final MCStringPermColumn bill_addr1 = createStringColumn(_bill_addr1);
	
	/**
	 * 請求書送付住所２. Invoice send-to address 2.<p>
	 *
	 */
	public static final String $bill_addr2 = "bill_addr2";
	private static final MCPermColumnInfo _bill_addr2 = createColumnInfo("bill_addr2");
	public final MCStringPermColumn bill_addr2 = createStringColumn(_bill_addr2);
	
	/**
	 * 請求書送付住所３. Invoice send-to address 3.<p>
	 *
	 */
	public static final String $bill_addr3 = "bill_addr3";
	private static final MCPermColumnInfo _bill_addr3 = createColumnInfo("bill_addr3");
	public final MCStringPermColumn bill_addr3 = createStringColumn(_bill_addr3);
	
	/**
	 * 請求書送付住所４. Invoice send-to address 4.<p>
	 *
	 */
	public static final String $bill_addr4 = "bill_addr4";
	private static final MCPermColumnInfo _bill_addr4 = createColumnInfo("bill_addr4");
	public final MCStringPermColumn bill_addr4 = createStringColumn(_bill_addr4);
	
	/**
	 * 請求書送付部署. Invoice send-to dept..<p>
	 *
	 */
	public static final String $bill_bcst_dpt = "bill_bcst_dpt";
	private static final MCPermColumnInfo _bill_bcst_dpt = createColumnInfo("bill_bcst_dpt");
	public final MCStringPermColumn bill_bcst_dpt = createStringColumn(_bill_bcst_dpt);
	
	/**
	 * 請求書送付ＴＥＬ. Invoice send-to TEL.<p>
	 *
	 */
	public static final String $bill_tel = "bill_tel";
	private static final MCPermColumnInfo _bill_tel = createColumnInfo("bill_tel");
	public final MCStringPermColumn bill_tel = createStringColumn(_bill_tel);
	
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
	 * 請求元名. Billing source name.<p>
	 *
	 */
	public static final String $bill_src_nm = "bill_src_nm";
	
	/**
	 * 取引通貨名. Transaction currency name.<p>
	 *
	 */
	public static final String $trd_cur_nm = "trd_cur_nm";
	
	/**
	 * 口座名. Bank account name.<p>
	 *
	 */
	public static final String $bank_ac_nm = "bank_ac_nm";
	
	/**
	 * 支払方法名１. Payment method name 1.<p>
	 *
	 */
	public static final String $pay_mtd_nm1 = "pay_mtd_nm1";
	
	/**
	 * 支払方法名２. Payment method name 2.<p>
	 *
	 */
	public static final String $pay_mtd_nm2 = "pay_mtd_nm2";
	
	/**
	 * 支払方法名３. Payment method name 3.<p>
	 *
	 */
	public static final String $pay_mtd_nm3 = "pay_mtd_nm3";
	
	/**
	 * 支払方法名４. Payment method name 4.<p>
	 *
	 */
	public static final String $pay_mtd_nm4 = "pay_mtd_nm4";
	
	/**
	 * 支払方法名５. Payment method name 5.<p>
	 *
	 */
	public static final String $pay_mtd_nm5 = "pay_mtd_nm5";
	
	/**
	 * 支払方法名６. Payment method name 6.<p>
	 *
	 */
	public static final String $pay_mtd_nm6 = "pay_mtd_nm6";
	
	/**
	 * 支払方法名７. Payment method name 7.<p>
	 *
	 */
	public static final String $pay_mtd_nm7 = "pay_mtd_nm7";
	
	/**
	 * 支払方法名８. Payment method name 8.<p>
	 *
	 */
	public static final String $pay_mtd_nm8 = "pay_mtd_nm8";
	
	/**
	 * 支払方法名９. Payment method name 9.<p>
	 *
	 */
	public static final String $pay_mtd_nm9 = "pay_mtd_nm9";
	
	/**
	 * 支払方法名１０. Payment method name 10.<p>
	 *
	 */
	public static final String $pay_mtd_nm10 = "pay_mtd_nm10";
	
	/**
	 * 取引名. Transaction name.<p>
	 *
	 */
	public static final String $trd_nm = "trd_nm";
	
	/**
	 * 品名. Item name.<p>
	 *
	 */
	public static final String $itm_nm = "itm_nm";
	
	/**
	 * 取引単位名. Transaction unit name.<p>
	 *
	 */
	public static final String $trd_unit_nm = "trd_unit_nm";
	
	/**
	 * 税名. Tax name.<p>
	 *
	 */
	public static final String $tax_nm = "tax_nm";
	
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
	public static final MCMeta bill_cl_dt_META = createCommonMeta($bill_cl_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta bill_dt_META = createCommonMeta($bill_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta bill_no_META = createCommonMeta($bill_no, mcframe.commonMA.meta.MA_META.BILL_NO);
	public static final MCMeta bill_d_no_META = createCommonMeta($bill_d_no, mcframe.commonMA.meta.MA_META.BILL_D_NO);
	public static final MCMeta pre_bill_no_META = createCommonMeta($pre_bill_no, mcframe.commonMA.meta.MA_META.PRE_BILL_NO);
	public static final MCMeta pre_bill_dt_META = createCommonMeta($pre_bill_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta bill_st_dt_META = createCommonMeta($bill_st_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta bill_end_dt_META = createCommonMeta($bill_end_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta iv_no_META = createCommonMeta($iv_no, mcframe.commonMA.meta.MA_META.IV_NO);
	public static final MCMeta wrk_no_META = createCommonMeta($wrk_no, mcframe.commonMA.meta.MA_META.WRK_NO);
	public static final MCMeta wrk_nm_META = createCommonMeta($wrk_nm, mcframe.commonMA.meta.MA_META.WRK_NM);
	public static final MCMeta bill_src_cd_META = createCommonMeta($bill_src_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta if_bill_src_cd_META = createCommonMeta($if_bill_src_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta if_bill_src_nm_META = createCommonMeta($if_bill_src_nm, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_NM);
	public static final MCMeta bill_src_ein_META = createCommonMeta($bill_src_ein, mcframe.commonMA.meta.MA_META.EIN);
	public static final MCMeta bill_src_biz_co_no_META = createCommonMeta($bill_src_biz_co_no, mcframe.commonMA.meta.MA_META.BIZ_CO_NO);
	public static final MCMeta bill_src_zip_cd_META = createCommonMeta($bill_src_zip_cd, mcframe.commonMA.meta.MA_META.ZIP_CD);
	public static final MCMeta bill_src_addr1_META = createCommonMeta($bill_src_addr1, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta bill_src_addr2_META = createCommonMeta($bill_src_addr2, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta bill_src_addr3_META = createCommonMeta($bill_src_addr3, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta bill_src_addr4_META = createCommonMeta($bill_src_addr4, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta bill_src_dpt_META = createCommonMeta($bill_src_dpt, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta bill_src_tel_META = createCommonMeta($bill_src_tel, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta trd_cur_cd_META = createCommonMeta($trd_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta if_trd_cur_cd_META = createCommonMeta($if_trd_cur_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta bill_xrate_META = createCommonMeta($bill_xrate, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta last_bill_amt_META = createCommonMeta($last_bill_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta rcv_amt_META = createCommonMeta($rcv_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta sw_amt_META = createCommonMeta($sw_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta setoff_amt_META = createCommonMeta($setoff_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta bfw_amt_META = createCommonMeta($bfw_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta sls_amt_META = createCommonMeta($sls_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta dscnt_amt_META = createCommonMeta($dscnt_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta ret_amt_META = createCommonMeta($ret_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta tax_amt_META = createCommonMeta($tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta sw_to_amt_META = createCommonMeta($sw_to_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta bill_amt_META = createCommonMeta($bill_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta tax_rate1_META = createCommonMeta($tax_rate1, mcframe.commonMA.meta.MA_META.TAX_RATE);
	public static final MCMeta tax_rate_sls_amt1_META = createCommonMeta($tax_rate_sls_amt1, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta tax_rate_tax_amt1_META = createCommonMeta($tax_rate_tax_amt1, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta tax_rate_base_tax_amt1_META = createCommonMeta($tax_rate_base_tax_amt1, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta tax_rate2_META = createCommonMeta($tax_rate2, mcframe.commonMA.meta.MA_META.TAX_RATE);
	public static final MCMeta tax_rate_sls_amt2_META = createCommonMeta($tax_rate_sls_amt2, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta tax_rate_tax_amt2_META = createCommonMeta($tax_rate_tax_amt2, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta tax_rate_base_tax_amt2_META = createCommonMeta($tax_rate_base_tax_amt2, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta tax_rate3_META = createCommonMeta($tax_rate3, mcframe.commonMA.meta.MA_META.TAX_RATE);
	public static final MCMeta tax_rate_sls_amt3_META = createCommonMeta($tax_rate_sls_amt3, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta tax_rate_tax_amt3_META = createCommonMeta($tax_rate_tax_amt3, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta tax_rate_base_tax_amt3_META = createCommonMeta($tax_rate_base_tax_amt3, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta tax_rate4_META = createCommonMeta($tax_rate4, mcframe.commonMA.meta.MA_META.TAX_RATE);
	public static final MCMeta tax_rate_sls_amt4_META = createCommonMeta($tax_rate_sls_amt4, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta tax_rate_tax_amt4_META = createCommonMeta($tax_rate_tax_amt4, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta tax_rate_base_tax_amt4_META = createCommonMeta($tax_rate_base_tax_amt4, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta tax_rate5_META = createCommonMeta($tax_rate5, mcframe.commonMA.meta.MA_META.TAX_RATE);
	public static final MCMeta tax_rate_sls_amt5_META = createCommonMeta($tax_rate_sls_amt5, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta tax_rate_tax_amt5_META = createCommonMeta($tax_rate_tax_amt5, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta tax_rate_base_tax_amt5_META = createCommonMeta($tax_rate_base_tax_amt5, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta tax_rate6_META = createCommonMeta($tax_rate6, mcframe.commonMA.meta.MA_META.TAX_RATE);
	public static final MCMeta tax_rate_sls_amt6_META = createCommonMeta($tax_rate_sls_amt6, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta tax_rate_tax_amt6_META = createCommonMeta($tax_rate_tax_amt6, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta tax_rate_base_tax_amt6_META = createCommonMeta($tax_rate_base_tax_amt6, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta tax_rate7_META = createCommonMeta($tax_rate7, mcframe.commonMA.meta.MA_META.TAX_RATE);
	public static final MCMeta tax_rate_sls_amt7_META = createCommonMeta($tax_rate_sls_amt7, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta tax_rate_tax_amt7_META = createCommonMeta($tax_rate_tax_amt7, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta tax_rate_base_tax_amt7_META = createCommonMeta($tax_rate_base_tax_amt7, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta tax_rate8_META = createCommonMeta($tax_rate8, mcframe.commonMA.meta.MA_META.TAX_RATE);
	public static final MCMeta tax_rate_sls_amt8_META = createCommonMeta($tax_rate_sls_amt8, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta tax_rate_tax_amt8_META = createCommonMeta($tax_rate_tax_amt8, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta tax_rate_base_tax_amt8_META = createCommonMeta($tax_rate_base_tax_amt8, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta tax_rate9_META = createCommonMeta($tax_rate9, mcframe.commonMA.meta.MA_META.TAX_RATE);
	public static final MCMeta tax_rate_sls_amt9_META = createCommonMeta($tax_rate_sls_amt9, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta tax_rate_tax_amt9_META = createCommonMeta($tax_rate_tax_amt9, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta tax_rate_base_tax_amt9_META = createCommonMeta($tax_rate_base_tax_amt9, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta tax_rate10_META = createCommonMeta($tax_rate10, mcframe.commonMA.meta.MA_META.TAX_RATE);
	public static final MCMeta tax_rate_sls_amt10_META = createCommonMeta($tax_rate_sls_amt10, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta tax_rate_tax_amt10_META = createCommonMeta($tax_rate_tax_amt10, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta tax_rate_base_tax_amt10_META = createCommonMeta($tax_rate_base_tax_amt10, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta adv_amt_bal_META = createCommonMeta($adv_amt_bal, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta adv_amt_META = createCommonMeta($adv_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta adv_setoff_amt_META = createCommonMeta($adv_setoff_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta adv_setoff_tax_amt_META = createCommonMeta($adv_setoff_tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta pay_schd_dt1_META = createCommonMeta($pay_schd_dt1, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta pay_schd_amt1_META = createCommonMeta($pay_schd_amt1, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta pay_mtd_cd1_META = createCommonMeta($pay_mtd_cd1, mcframe.commonMA.meta.MA_META.STTL_CD);
	public static final MCMeta if_pay_mtd_cd1_META = createCommonMeta($if_pay_mtd_cd1, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta if_pay_mtd_nm1_META = createCommonMeta($if_pay_mtd_nm1, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_NM);
	public static final MCMeta pay_schd_dt2_META = createCommonMeta($pay_schd_dt2, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta pay_schd_amt2_META = createCommonMeta($pay_schd_amt2, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta pay_mtd_cd2_META = createCommonMeta($pay_mtd_cd2, mcframe.commonMA.meta.MA_META.STTL_CD);
	public static final MCMeta if_pay_mtd_cd2_META = createCommonMeta($if_pay_mtd_cd2, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta if_pay_mtd_nm2_META = createCommonMeta($if_pay_mtd_nm2, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_NM);
	public static final MCMeta pay_schd_dt3_META = createCommonMeta($pay_schd_dt3, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta pay_schd_amt3_META = createCommonMeta($pay_schd_amt3, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta pay_mtd_cd3_META = createCommonMeta($pay_mtd_cd3, mcframe.commonMA.meta.MA_META.STTL_CD);
	public static final MCMeta if_pay_mtd_cd3_META = createCommonMeta($if_pay_mtd_cd3, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta if_pay_mtd_nm3_META = createCommonMeta($if_pay_mtd_nm3, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_NM);
	public static final MCMeta pay_schd_dt4_META = createCommonMeta($pay_schd_dt4, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta pay_schd_amt4_META = createCommonMeta($pay_schd_amt4, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta pay_mtd_cd4_META = createCommonMeta($pay_mtd_cd4, mcframe.commonMA.meta.MA_META.STTL_CD);
	public static final MCMeta if_pay_mtd_cd4_META = createCommonMeta($if_pay_mtd_cd4, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta if_pay_mtd_nm4_META = createCommonMeta($if_pay_mtd_nm4, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_NM);
	public static final MCMeta pay_schd_dt5_META = createCommonMeta($pay_schd_dt5, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta pay_schd_amt5_META = createCommonMeta($pay_schd_amt5, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta pay_mtd_cd5_META = createCommonMeta($pay_mtd_cd5, mcframe.commonMA.meta.MA_META.STTL_CD);
	public static final MCMeta if_pay_mtd_cd5_META = createCommonMeta($if_pay_mtd_cd5, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta if_pay_mtd_nm5_META = createCommonMeta($if_pay_mtd_nm5, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_NM);
	public static final MCMeta pay_schd_dt6_META = createCommonMeta($pay_schd_dt6, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta pay_schd_amt6_META = createCommonMeta($pay_schd_amt6, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta pay_mtd_cd6_META = createCommonMeta($pay_mtd_cd6, mcframe.commonMA.meta.MA_META.STTL_CD);
	public static final MCMeta if_pay_mtd_cd6_META = createCommonMeta($if_pay_mtd_cd6, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta if_pay_mtd_nm6_META = createCommonMeta($if_pay_mtd_nm6, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_NM);
	public static final MCMeta pay_schd_dt7_META = createCommonMeta($pay_schd_dt7, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta pay_schd_amt7_META = createCommonMeta($pay_schd_amt7, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta pay_mtd_cd7_META = createCommonMeta($pay_mtd_cd7, mcframe.commonMA.meta.MA_META.STTL_CD);
	public static final MCMeta if_pay_mtd_cd7_META = createCommonMeta($if_pay_mtd_cd7, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta if_pay_mtd_nm7_META = createCommonMeta($if_pay_mtd_nm7, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_NM);
	public static final MCMeta pay_schd_dt8_META = createCommonMeta($pay_schd_dt8, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta pay_schd_amt8_META = createCommonMeta($pay_schd_amt8, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta pay_mtd_cd8_META = createCommonMeta($pay_mtd_cd8, mcframe.commonMA.meta.MA_META.STTL_CD);
	public static final MCMeta if_pay_mtd_cd8_META = createCommonMeta($if_pay_mtd_cd8, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta if_pay_mtd_nm8_META = createCommonMeta($if_pay_mtd_nm8, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_NM);
	public static final MCMeta pay_schd_dt9_META = createCommonMeta($pay_schd_dt9, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta pay_schd_amt9_META = createCommonMeta($pay_schd_amt9, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta pay_mtd_cd9_META = createCommonMeta($pay_mtd_cd9, mcframe.commonMA.meta.MA_META.STTL_CD);
	public static final MCMeta if_pay_mtd_cd9_META = createCommonMeta($if_pay_mtd_cd9, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta if_pay_mtd_nm9_META = createCommonMeta($if_pay_mtd_nm9, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_NM);
	public static final MCMeta pay_schd_dt10_META = createCommonMeta($pay_schd_dt10, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta pay_schd_amt10_META = createCommonMeta($pay_schd_amt10, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta pay_mtd_cd10_META = createCommonMeta($pay_mtd_cd10, mcframe.commonMA.meta.MA_META.STTL_CD);
	public static final MCMeta if_pay_mtd_cd10_META = createCommonMeta($if_pay_mtd_cd10, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta if_pay_mtd_nm10_META = createCommonMeta($if_pay_mtd_nm10, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_NM);
	public static final MCMeta bank_ac_cd_META = createCommonMeta($bank_ac_cd, mcframe.commonMA.meta.MA_META.BANK_AC_CD);
	public static final MCMeta if_bank_ac_cd_META = createCommonMeta($if_bank_ac_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta bank_ac_typ_META = createCommonMeta($bank_ac_typ, mcframe.commonMA.meta.MA_META.BANK_AC_TYP);
	public static final MCMeta bank_ac_no_META = createCommonMeta($bank_ac_no, mcframe.commonMA.meta.MA_META.BANK_AC_NO);
	public static final MCMeta bank_ac_holder_META = createCommonMeta($bank_ac_holder, mcframe.commonMA.meta.MA_META.BANK_AC_HOLDER);
	public static final MCMeta bank_ac_holder_sub_META = createCommonMeta($bank_ac_holder_sub, mcframe.commonMA.meta.MA_META.BANK_AC_HOLDER_SUB);
	public static final MCMeta bank_cd_META = createCommonMeta($bank_cd, mcframe.commonMA.meta.MA_META.BANK_CD);
	public static final MCMeta bank_nm_META = createCommonMeta($bank_nm, mcframe.commonMA.meta.MA_META.BANK_NM);
	public static final MCMeta branch_cd_META = createCommonMeta($branch_cd, mcframe.commonMA.meta.MA_META.BANK_BRANCH_CD);
	public static final MCMeta branch_nm_META = createCommonMeta($branch_nm, mcframe.commonMA.meta.MA_META.BANK_BRANCH_NM);
	public static final MCMeta trd_cd_META = createCommonMeta($trd_cd, mcframe.commonMA.meta.MA_META.TRD_CD);
	public static final MCMeta if_trd_cd_META = createCommonMeta($if_trd_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta if_trd_nm_META = createCommonMeta($if_trd_nm, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_NM);
	public static final MCMeta trd_ptn_typ_META = createCommonMeta($trd_ptn_typ, mcframe.commonMA.meta.MA_META.TRD_PTN_TYP);
	public static final MCMeta slip_sts_typ_META = createCommonMeta($slip_sts_typ, mcframe.commonMA.meta.MA_META.SLIP_STS_TYP);
	public static final MCMeta dlv_slip_no_META = createCommonMeta($dlv_slip_no, mcframe.commonMA.meta.MA_META.DLV_SLIP_NO);
	public static final MCMeta dlv_slip_d_no_META = createCommonMeta($dlv_slip_d_no, mcframe.commonMA.meta.MA_META.DLV_SLIP_D_NO);
	public static final MCMeta ship_dlv_slip_no_META = createCommonMeta($ship_dlv_slip_no, mcframe.commonMA.meta.MA_META.DLV_SLIP_NO);
	public static final MCMeta ship_dlv_slip_d_no_META = createCommonMeta($ship_dlv_slip_d_no, mcframe.commonMA.meta.MA_META.DLV_SLIP_D_NO);
	public static final MCMeta act_no_META = createCommonMeta($act_no, mcframe.commonMA.meta.MA_META.ACT_NO);
	public static final MCMeta act_rev_META = createCommonMeta($act_rev, mcframe.commonMA.meta.MA_META.SLIP_REV);
	public static final MCMeta act_d_no_META = createCommonMeta($act_d_no, mcframe.commonMA.meta.MA_META.ACT_D_NO);
	public static final MCMeta po_no_META = createCommonMeta($po_no, mcframe.commonMA.meta.MA_META.PO_NO);
	public static final MCMeta po_d_no_META = createCommonMeta($po_d_no, mcframe.commonMA.meta.MA_META.PO_D_NO);
	public static final MCMeta ac_dt_META = createCommonMeta($ac_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta dlv_dt_META = createCommonMeta($dlv_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta rcv_dt_META = createCommonMeta($rcv_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta bill_basis_dt_META = createCommonMeta($bill_basis_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta base_ac_dt_META = createCommonMeta($base_ac_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta if_itm_cd_META = createCommonMeta($if_itm_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta if_itm_sub1_META = createCommonMeta($if_itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta if_itm_sub2_META = createCommonMeta($if_itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta if_itm_sub3_META = createCommonMeta($if_itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta if_itm_nm_META = createCommonMeta($if_itm_nm, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_NM);
	public static final MCMeta itm_alt_nm1_META = createCommonMeta($itm_alt_nm1, mcframe.commonMA.meta.MA_META.ITM_ALT_NM1);
	public static final MCMeta itm_alt_nm2_META = createCommonMeta($itm_alt_nm2, mcframe.commonMA.meta.MA_META.ITM_ALT_NM2);
	public static final MCMeta itm_alt_nm3_META = createCommonMeta($itm_alt_nm3, mcframe.commonMA.meta.MA_META.ITM_ALT_NM3);
	public static final MCMeta itm_alt_nm4_META = createCommonMeta($itm_alt_nm4, mcframe.commonMA.meta.MA_META.ITM_ALT_NM4);
	public static final MCMeta sno1_META = createCommonMeta($sno1, mcframe.commonMA.meta.MA_META.SNO1);
	public static final MCMeta sno2_META = createCommonMeta($sno2, mcframe.commonMA.meta.MA_META.SNO2);
	public static final MCMeta sno3_META = createCommonMeta($sno3, mcframe.commonMA.meta.MA_META.SNO3);
	public static final MCMeta sno4_META = createCommonMeta($sno4, mcframe.commonMA.meta.MA_META.SNO4);
	public static final MCMeta trd_unit_cd_META = createCommonMeta($trd_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta if_trd_unit_cd_META = createCommonMeta($if_trd_unit_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta if_trd_unit_nm_META = createCommonMeta($if_trd_unit_nm, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_NM);
	public static final MCMeta trd_unit_qty_META = createCommonMeta($trd_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta interim_flg_META = createCommonMeta($interim_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta trd_cur_upri_META = createCommonMeta($trd_cur_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta trd_cur_amt_META = createCommonMeta($trd_cur_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta trd_cur_dscnt_amt_META = createCommonMeta($trd_cur_dscnt_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta tax_cd_META = createCommonMeta($tax_cd, mcframe.commonMA.meta.MA_META.TAX_CD);
	public static final MCMeta if_tax_cd_META = createCommonMeta($if_tax_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta if_tax_nm_META = createCommonMeta($if_tax_nm, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_NM);
	public static final MCMeta tax_rate_META = createCommonMeta($tax_rate, mcframe.commonMA.meta.MA_META.TAX_RATE);
	public static final MCMeta inc_tax_flg_META = createCommonMeta($inc_tax_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta trd_cur_tax_amt_META = createCommonMeta($trd_cur_tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta trd_d_rmrks_META = createCommonMeta($trd_d_rmrks, mcframe.commonMA.meta.MA_META.TRD_D_RMRKS);
	public static final MCMeta if_co_cd_META = createCommonMeta($if_co_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta if_co_nm_META = createCommonMeta($if_co_nm, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_NM);
	public static final MCMeta bill_bcst_nm_META = createCommonMeta($bill_bcst_nm, mcframe.commonMA.meta.MA_META.BILL_BCST_NM);
	public static final MCMeta bill_ein_META = createCommonMeta($bill_ein, mcframe.commonMA.meta.MA_META.EIN);
	public static final MCMeta bill_biz_co_no_META = createCommonMeta($bill_biz_co_no, mcframe.commonMA.meta.MA_META.BIZ_CO_NO);
	public static final MCMeta bill_zip_cd_META = createCommonMeta($bill_zip_cd, mcframe.commonMA.meta.MA_META.ZIP_CD);
	public static final MCMeta bill_addr1_META = createCommonMeta($bill_addr1, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta bill_addr2_META = createCommonMeta($bill_addr2, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta bill_addr3_META = createCommonMeta($bill_addr3, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta bill_addr4_META = createCommonMeta($bill_addr4, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta bill_bcst_dpt_META = createCommonMeta($bill_bcst_dpt, mcframe.commonMA.meta.MA_META.BP_CNTCT_DPT);
	public static final MCMeta bill_tel_META = createCommonMeta($bill_tel, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta batch_log_no_META = createCommonMeta($batch_log_no, mcframe.commonMA.meta.MA_META.BATCH_LOG_NO);
	public static final MCMeta log_sub_key1_META = createCommonMeta($log_sub_key1, mcframe.commonMA.meta.MA_META.BATCH_LOG_SUB_KEY1);
	public static final MCMeta log_sub_key2_META = createCommonMeta($log_sub_key2, mcframe.commonMA.meta.MA_META.BATCH_LOG_SUB_KEY2);
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
	public static final MCMeta bill_src_nm_META = createCommonMeta($bill_src_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta trd_cur_nm_META = createCommonMeta($trd_cur_nm, mcframe.commonMA.meta.MA_META.CUR_NM);
	public static final MCMeta bank_ac_nm_META = createCommonMeta($bank_ac_nm, mcframe.commonMA.meta.MA_META.BANK_AC_NM);
	public static final MCMeta pay_mtd_nm1_META = createCommonMeta($pay_mtd_nm1, mcframe.commonMA.meta.MA_META.STTL_NM);
	public static final MCMeta pay_mtd_nm2_META = createCommonMeta($pay_mtd_nm2, mcframe.commonMA.meta.MA_META.STTL_NM);
	public static final MCMeta pay_mtd_nm3_META = createCommonMeta($pay_mtd_nm3, mcframe.commonMA.meta.MA_META.STTL_NM);
	public static final MCMeta pay_mtd_nm4_META = createCommonMeta($pay_mtd_nm4, mcframe.commonMA.meta.MA_META.STTL_NM);
	public static final MCMeta pay_mtd_nm5_META = createCommonMeta($pay_mtd_nm5, mcframe.commonMA.meta.MA_META.STTL_NM);
	public static final MCMeta pay_mtd_nm6_META = createCommonMeta($pay_mtd_nm6, mcframe.commonMA.meta.MA_META.STTL_NM);
	public static final MCMeta pay_mtd_nm7_META = createCommonMeta($pay_mtd_nm7, mcframe.commonMA.meta.MA_META.STTL_NM);
	public static final MCMeta pay_mtd_nm8_META = createCommonMeta($pay_mtd_nm8, mcframe.commonMA.meta.MA_META.STTL_NM);
	public static final MCMeta pay_mtd_nm9_META = createCommonMeta($pay_mtd_nm9, mcframe.commonMA.meta.MA_META.STTL_NM);
	public static final MCMeta pay_mtd_nm10_META = createCommonMeta($pay_mtd_nm10, mcframe.commonMA.meta.MA_META.STTL_NM);
	public static final MCMeta trd_nm_META = createCommonMeta($trd_nm, mcframe.commonMA.meta.MA_META.TRD_NM);
	public static final MCMeta itm_nm_META = createCommonMeta($itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta trd_unit_nm_META = createCommonMeta($trd_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta tax_nm_META = createCommonMeta($tax_nm, mcframe.commonMA.meta.MA_META.TAX_NM);

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
					MST_BILL_RECV_IF_R own = MST_BILL_RECV_IF_R.create(alias);
					mcframe.serverPF.dbc.PFT_SDRV_IF_R ref = mcframe.serverPF.dbc.PFT_SDRV_IF_R.create("SDRV");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.data_no.eq(ref.data_no));
					return cond;
				}
			)
		);
	}
	
	protected static final ConstMetaList<MST_BILL_RECV_IF_R> constMetas = new ConstMetaList<MST_BILL_RECV_IF_R>(
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
			bill_cl_dt_META,
			bill_dt_META,
			bill_no_META,
			bill_d_no_META,
			pre_bill_no_META,
			pre_bill_dt_META,
			bill_st_dt_META,
			bill_end_dt_META,
			iv_no_META,
			wrk_no_META,
			wrk_nm_META,
			bill_src_cd_META,
			if_bill_src_cd_META,
			if_bill_src_nm_META,
			bill_src_ein_META,
			bill_src_biz_co_no_META,
			bill_src_zip_cd_META,
			bill_src_addr1_META,
			bill_src_addr2_META,
			bill_src_addr3_META,
			bill_src_addr4_META,
			bill_src_dpt_META,
			bill_src_tel_META,
			trd_cur_cd_META,
			if_trd_cur_cd_META,
			bill_xrate_META,
			last_bill_amt_META,
			rcv_amt_META,
			sw_amt_META,
			setoff_amt_META,
			bfw_amt_META,
			sls_amt_META,
			dscnt_amt_META,
			ret_amt_META,
			tax_amt_META,
			sw_to_amt_META,
			bill_amt_META,
			tax_rate1_META,
			tax_rate_sls_amt1_META,
			tax_rate_tax_amt1_META,
			tax_rate_base_tax_amt1_META,
			tax_rate2_META,
			tax_rate_sls_amt2_META,
			tax_rate_tax_amt2_META,
			tax_rate_base_tax_amt2_META,
			tax_rate3_META,
			tax_rate_sls_amt3_META,
			tax_rate_tax_amt3_META,
			tax_rate_base_tax_amt3_META,
			tax_rate4_META,
			tax_rate_sls_amt4_META,
			tax_rate_tax_amt4_META,
			tax_rate_base_tax_amt4_META,
			tax_rate5_META,
			tax_rate_sls_amt5_META,
			tax_rate_tax_amt5_META,
			tax_rate_base_tax_amt5_META,
			tax_rate6_META,
			tax_rate_sls_amt6_META,
			tax_rate_tax_amt6_META,
			tax_rate_base_tax_amt6_META,
			tax_rate7_META,
			tax_rate_sls_amt7_META,
			tax_rate_tax_amt7_META,
			tax_rate_base_tax_amt7_META,
			tax_rate8_META,
			tax_rate_sls_amt8_META,
			tax_rate_tax_amt8_META,
			tax_rate_base_tax_amt8_META,
			tax_rate9_META,
			tax_rate_sls_amt9_META,
			tax_rate_tax_amt9_META,
			tax_rate_base_tax_amt9_META,
			tax_rate10_META,
			tax_rate_sls_amt10_META,
			tax_rate_tax_amt10_META,
			tax_rate_base_tax_amt10_META,
			adv_amt_bal_META,
			adv_amt_META,
			adv_setoff_amt_META,
			adv_setoff_tax_amt_META,
			pay_schd_dt1_META,
			pay_schd_amt1_META,
			pay_mtd_cd1_META,
			if_pay_mtd_cd1_META,
			if_pay_mtd_nm1_META,
			pay_schd_dt2_META,
			pay_schd_amt2_META,
			pay_mtd_cd2_META,
			if_pay_mtd_cd2_META,
			if_pay_mtd_nm2_META,
			pay_schd_dt3_META,
			pay_schd_amt3_META,
			pay_mtd_cd3_META,
			if_pay_mtd_cd3_META,
			if_pay_mtd_nm3_META,
			pay_schd_dt4_META,
			pay_schd_amt4_META,
			pay_mtd_cd4_META,
			if_pay_mtd_cd4_META,
			if_pay_mtd_nm4_META,
			pay_schd_dt5_META,
			pay_schd_amt5_META,
			pay_mtd_cd5_META,
			if_pay_mtd_cd5_META,
			if_pay_mtd_nm5_META,
			pay_schd_dt6_META,
			pay_schd_amt6_META,
			pay_mtd_cd6_META,
			if_pay_mtd_cd6_META,
			if_pay_mtd_nm6_META,
			pay_schd_dt7_META,
			pay_schd_amt7_META,
			pay_mtd_cd7_META,
			if_pay_mtd_cd7_META,
			if_pay_mtd_nm7_META,
			pay_schd_dt8_META,
			pay_schd_amt8_META,
			pay_mtd_cd8_META,
			if_pay_mtd_cd8_META,
			if_pay_mtd_nm8_META,
			pay_schd_dt9_META,
			pay_schd_amt9_META,
			pay_mtd_cd9_META,
			if_pay_mtd_cd9_META,
			if_pay_mtd_nm9_META,
			pay_schd_dt10_META,
			pay_schd_amt10_META,
			pay_mtd_cd10_META,
			if_pay_mtd_cd10_META,
			if_pay_mtd_nm10_META,
			bank_ac_cd_META,
			if_bank_ac_cd_META,
			bank_ac_typ_META,
			bank_ac_no_META,
			bank_ac_holder_META,
			bank_ac_holder_sub_META,
			bank_cd_META,
			bank_nm_META,
			branch_cd_META,
			branch_nm_META,
			trd_cd_META,
			if_trd_cd_META,
			if_trd_nm_META,
			trd_ptn_typ_META,
			slip_sts_typ_META,
			dlv_slip_no_META,
			dlv_slip_d_no_META,
			ship_dlv_slip_no_META,
			ship_dlv_slip_d_no_META,
			act_no_META,
			act_rev_META,
			act_d_no_META,
			po_no_META,
			po_d_no_META,
			ac_dt_META,
			dlv_dt_META,
			rcv_dt_META,
			bill_basis_dt_META,
			base_ac_dt_META,
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			if_itm_cd_META,
			if_itm_sub1_META,
			if_itm_sub2_META,
			if_itm_sub3_META,
			if_itm_nm_META,
			itm_alt_nm1_META,
			itm_alt_nm2_META,
			itm_alt_nm3_META,
			itm_alt_nm4_META,
			sno1_META,
			sno2_META,
			sno3_META,
			sno4_META,
			trd_unit_cd_META,
			if_trd_unit_cd_META,
			if_trd_unit_nm_META,
			trd_unit_qty_META,
			interim_flg_META,
			trd_cur_upri_META,
			trd_cur_amt_META,
			trd_cur_dscnt_amt_META,
			tax_cd_META,
			if_tax_cd_META,
			if_tax_nm_META,
			tax_rate_META,
			inc_tax_flg_META,
			trd_cur_tax_amt_META,
			trd_d_rmrks_META,
			if_co_cd_META,
			if_co_nm_META,
			bill_bcst_nm_META,
			bill_ein_META,
			bill_biz_co_no_META,
			bill_zip_cd_META,
			bill_addr1_META,
			bill_addr2_META,
			bill_addr3_META,
			bill_addr4_META,
			bill_bcst_dpt_META,
			bill_tel_META,
			batch_log_no_META,
			log_sub_key1_META,
			log_sub_key2_META,
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
			bill_src_nm_META,
			trd_cur_nm_META,
			bank_ac_nm_META,
			pay_mtd_nm1_META,
			pay_mtd_nm2_META,
			pay_mtd_nm3_META,
			pay_mtd_nm4_META,
			pay_mtd_nm5_META,
			pay_mtd_nm6_META,
			pay_mtd_nm7_META,
			pay_mtd_nm8_META,
			pay_mtd_nm9_META,
			pay_mtd_nm10_META,
			trd_nm_META,
			itm_nm_META,
			trd_unit_nm_META,
			tax_nm_META
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
	protected MST_BILL_RECV_IF_R(ConstMetaList<? extends MST_BILL_RECV_IF_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MST_BILL_RECV_IF_R(ConstMetaList<? extends MST_BILL_RECV_IF_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MST_BILL_RECV_IF_R.$data_lno,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BILL_RECV_IF_R.$data_lno,
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
			MST_BILL_RECV_IF_R.$data_no,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BILL_RECV_IF_R.$data_no,
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
			MST_BILL_RECV_IF_R.$data_crud_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RECV_IF_R.$data_crud_typ,
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
			MST_BILL_RECV_IF_R.$exe_sts_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RECV_IF_R.$exe_sts_typ,
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
			MST_BILL_RECV_IF_R.$ext_sys_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RECV_IF_R.$ext_sys_cd,
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
			MST_BILL_RECV_IF_R.$ext_data_no,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BILL_RECV_IF_R.$ext_data_no,
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
			MST_BILL_RECV_IF_R.$ext_data_lno,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BILL_RECV_IF_R.$ext_data_lno,
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
			MST_BILL_RECV_IF_R.$data_make_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_BILL_RECV_IF_R.$data_make_dt,
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
			MST_BILL_RECV_IF_R.$imp_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_BILL_RECV_IF_R.$imp_flg,
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
			MST_BILL_RECV_IF_R.$recv_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_BILL_RECV_IF_R.$recv_dt,
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
			MST_BILL_RECV_IF_R.$bill_cl_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_BILL_RECV_IF_R.$bill_cl_dt,
				"bill_cl_dt",
				bill_cl_dt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_RECV_IF_R.$bill_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_BILL_RECV_IF_R.$bill_dt,
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
			MST_BILL_RECV_IF_R.$bill_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RECV_IF_R.$bill_no,
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
			MST_BILL_RECV_IF_R.$bill_d_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RECV_IF_R.$bill_d_no,
				"bill_d_no",
				bill_d_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_RECV_IF_R.$pre_bill_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RECV_IF_R.$pre_bill_no,
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
			MST_BILL_RECV_IF_R.$pre_bill_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_BILL_RECV_IF_R.$pre_bill_dt,
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
			MST_BILL_RECV_IF_R.$bill_st_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_BILL_RECV_IF_R.$bill_st_dt,
				"bill_st_dt",
				bill_st_dt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_RECV_IF_R.$bill_end_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_BILL_RECV_IF_R.$bill_end_dt,
				"bill_end_dt",
				bill_end_dt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_RECV_IF_R.$iv_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RECV_IF_R.$iv_no,
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
			MST_BILL_RECV_IF_R.$wrk_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RECV_IF_R.$wrk_no,
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
			MST_BILL_RECV_IF_R.$wrk_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RECV_IF_R.$wrk_nm,
				"wrk_nm",
				wrk_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_RECV_IF_R.$bill_src_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RECV_IF_R.$bill_src_cd,
				"bill_src_cd",
				bill_src_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_RECV_IF_R.$if_bill_src_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RECV_IF_R.$if_bill_src_cd,
				"if_bill_src_cd",
				if_bill_src_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_RECV_IF_R.$if_bill_src_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RECV_IF_R.$if_bill_src_nm,
				"if_bill_src_nm",
				if_bill_src_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_RECV_IF_R.$bill_src_ein,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RECV_IF_R.$bill_src_ein,
				"bill_src_ein",
				bill_src_ein,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_RECV_IF_R.$bill_src_biz_co_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RECV_IF_R.$bill_src_biz_co_no,
				"bill_src_biz_co_no",
				bill_src_biz_co_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_RECV_IF_R.$bill_src_zip_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RECV_IF_R.$bill_src_zip_cd,
				"bill_src_zip_cd",
				bill_src_zip_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_RECV_IF_R.$bill_src_addr1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RECV_IF_R.$bill_src_addr1,
				"bill_src_addr1",
				bill_src_addr1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_RECV_IF_R.$bill_src_addr2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RECV_IF_R.$bill_src_addr2,
				"bill_src_addr2",
				bill_src_addr2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_RECV_IF_R.$bill_src_addr3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RECV_IF_R.$bill_src_addr3,
				"bill_src_addr3",
				bill_src_addr3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_RECV_IF_R.$bill_src_addr4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RECV_IF_R.$bill_src_addr4,
				"bill_src_addr4",
				bill_src_addr4,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_RECV_IF_R.$bill_src_dpt,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RECV_IF_R.$bill_src_dpt,
				"bill_src_dpt",
				bill_src_dpt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_RECV_IF_R.$bill_src_tel,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RECV_IF_R.$bill_src_tel,
				"bill_src_tel",
				bill_src_tel,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_RECV_IF_R.$trd_cur_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RECV_IF_R.$trd_cur_cd,
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
			MST_BILL_RECV_IF_R.$if_trd_cur_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RECV_IF_R.$if_trd_cur_cd,
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
			MST_BILL_RECV_IF_R.$bill_xrate,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BILL_RECV_IF_R.$bill_xrate,
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
			MST_BILL_RECV_IF_R.$last_bill_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BILL_RECV_IF_R.$last_bill_amt,
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
			MST_BILL_RECV_IF_R.$rcv_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BILL_RECV_IF_R.$rcv_amt,
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
			MST_BILL_RECV_IF_R.$sw_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BILL_RECV_IF_R.$sw_amt,
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
			MST_BILL_RECV_IF_R.$setoff_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BILL_RECV_IF_R.$setoff_amt,
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
			MST_BILL_RECV_IF_R.$bfw_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BILL_RECV_IF_R.$bfw_amt,
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
			MST_BILL_RECV_IF_R.$sls_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BILL_RECV_IF_R.$sls_amt,
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
			MST_BILL_RECV_IF_R.$dscnt_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BILL_RECV_IF_R.$dscnt_amt,
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
			MST_BILL_RECV_IF_R.$ret_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BILL_RECV_IF_R.$ret_amt,
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
			MST_BILL_RECV_IF_R.$tax_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BILL_RECV_IF_R.$tax_amt,
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
			MST_BILL_RECV_IF_R.$sw_to_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BILL_RECV_IF_R.$sw_to_amt,
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
			MST_BILL_RECV_IF_R.$bill_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BILL_RECV_IF_R.$bill_amt,
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
			MST_BILL_RECV_IF_R.$tax_rate1,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BILL_RECV_IF_R.$tax_rate1,
				"tax_rate1",
				tax_rate1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_RECV_IF_R.$tax_rate_sls_amt1,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BILL_RECV_IF_R.$tax_rate_sls_amt1,
				"tax_rate_sls_amt1",
				tax_rate_sls_amt1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_RECV_IF_R.$tax_rate_tax_amt1,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BILL_RECV_IF_R.$tax_rate_tax_amt1,
				"tax_rate_tax_amt1",
				tax_rate_tax_amt1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_RECV_IF_R.$tax_rate_base_tax_amt1,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BILL_RECV_IF_R.$tax_rate_base_tax_amt1,
				"tax_rate_base_tax_amt1",
				tax_rate_base_tax_amt1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_RECV_IF_R.$tax_rate2,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BILL_RECV_IF_R.$tax_rate2,
				"tax_rate2",
				tax_rate2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_RECV_IF_R.$tax_rate_sls_amt2,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BILL_RECV_IF_R.$tax_rate_sls_amt2,
				"tax_rate_sls_amt2",
				tax_rate_sls_amt2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_RECV_IF_R.$tax_rate_tax_amt2,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BILL_RECV_IF_R.$tax_rate_tax_amt2,
				"tax_rate_tax_amt2",
				tax_rate_tax_amt2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_RECV_IF_R.$tax_rate_base_tax_amt2,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BILL_RECV_IF_R.$tax_rate_base_tax_amt2,
				"tax_rate_base_tax_amt2",
				tax_rate_base_tax_amt2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_RECV_IF_R.$tax_rate3,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BILL_RECV_IF_R.$tax_rate3,
				"tax_rate3",
				tax_rate3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_RECV_IF_R.$tax_rate_sls_amt3,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BILL_RECV_IF_R.$tax_rate_sls_amt3,
				"tax_rate_sls_amt3",
				tax_rate_sls_amt3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_RECV_IF_R.$tax_rate_tax_amt3,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BILL_RECV_IF_R.$tax_rate_tax_amt3,
				"tax_rate_tax_amt3",
				tax_rate_tax_amt3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_RECV_IF_R.$tax_rate_base_tax_amt3,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BILL_RECV_IF_R.$tax_rate_base_tax_amt3,
				"tax_rate_base_tax_amt3",
				tax_rate_base_tax_amt3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_RECV_IF_R.$tax_rate4,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BILL_RECV_IF_R.$tax_rate4,
				"tax_rate4",
				tax_rate4,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_RECV_IF_R.$tax_rate_sls_amt4,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BILL_RECV_IF_R.$tax_rate_sls_amt4,
				"tax_rate_sls_amt4",
				tax_rate_sls_amt4,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_RECV_IF_R.$tax_rate_tax_amt4,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BILL_RECV_IF_R.$tax_rate_tax_amt4,
				"tax_rate_tax_amt4",
				tax_rate_tax_amt4,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_RECV_IF_R.$tax_rate_base_tax_amt4,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BILL_RECV_IF_R.$tax_rate_base_tax_amt4,
				"tax_rate_base_tax_amt4",
				tax_rate_base_tax_amt4,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_RECV_IF_R.$tax_rate5,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BILL_RECV_IF_R.$tax_rate5,
				"tax_rate5",
				tax_rate5,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_RECV_IF_R.$tax_rate_sls_amt5,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BILL_RECV_IF_R.$tax_rate_sls_amt5,
				"tax_rate_sls_amt5",
				tax_rate_sls_amt5,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_RECV_IF_R.$tax_rate_tax_amt5,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BILL_RECV_IF_R.$tax_rate_tax_amt5,
				"tax_rate_tax_amt5",
				tax_rate_tax_amt5,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_RECV_IF_R.$tax_rate_base_tax_amt5,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BILL_RECV_IF_R.$tax_rate_base_tax_amt5,
				"tax_rate_base_tax_amt5",
				tax_rate_base_tax_amt5,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_RECV_IF_R.$tax_rate6,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BILL_RECV_IF_R.$tax_rate6,
				"tax_rate6",
				tax_rate6,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_RECV_IF_R.$tax_rate_sls_amt6,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BILL_RECV_IF_R.$tax_rate_sls_amt6,
				"tax_rate_sls_amt6",
				tax_rate_sls_amt6,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_RECV_IF_R.$tax_rate_tax_amt6,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BILL_RECV_IF_R.$tax_rate_tax_amt6,
				"tax_rate_tax_amt6",
				tax_rate_tax_amt6,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_RECV_IF_R.$tax_rate_base_tax_amt6,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BILL_RECV_IF_R.$tax_rate_base_tax_amt6,
				"tax_rate_base_tax_amt6",
				tax_rate_base_tax_amt6,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_RECV_IF_R.$tax_rate7,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BILL_RECV_IF_R.$tax_rate7,
				"tax_rate7",
				tax_rate7,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_RECV_IF_R.$tax_rate_sls_amt7,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BILL_RECV_IF_R.$tax_rate_sls_amt7,
				"tax_rate_sls_amt7",
				tax_rate_sls_amt7,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_RECV_IF_R.$tax_rate_tax_amt7,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BILL_RECV_IF_R.$tax_rate_tax_amt7,
				"tax_rate_tax_amt7",
				tax_rate_tax_amt7,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_RECV_IF_R.$tax_rate_base_tax_amt7,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BILL_RECV_IF_R.$tax_rate_base_tax_amt7,
				"tax_rate_base_tax_amt7",
				tax_rate_base_tax_amt7,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_RECV_IF_R.$tax_rate8,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BILL_RECV_IF_R.$tax_rate8,
				"tax_rate8",
				tax_rate8,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_RECV_IF_R.$tax_rate_sls_amt8,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BILL_RECV_IF_R.$tax_rate_sls_amt8,
				"tax_rate_sls_amt8",
				tax_rate_sls_amt8,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_RECV_IF_R.$tax_rate_tax_amt8,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BILL_RECV_IF_R.$tax_rate_tax_amt8,
				"tax_rate_tax_amt8",
				tax_rate_tax_amt8,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_RECV_IF_R.$tax_rate_base_tax_amt8,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BILL_RECV_IF_R.$tax_rate_base_tax_amt8,
				"tax_rate_base_tax_amt8",
				tax_rate_base_tax_amt8,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_RECV_IF_R.$tax_rate9,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BILL_RECV_IF_R.$tax_rate9,
				"tax_rate9",
				tax_rate9,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_RECV_IF_R.$tax_rate_sls_amt9,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BILL_RECV_IF_R.$tax_rate_sls_amt9,
				"tax_rate_sls_amt9",
				tax_rate_sls_amt9,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_RECV_IF_R.$tax_rate_tax_amt9,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BILL_RECV_IF_R.$tax_rate_tax_amt9,
				"tax_rate_tax_amt9",
				tax_rate_tax_amt9,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_RECV_IF_R.$tax_rate_base_tax_amt9,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BILL_RECV_IF_R.$tax_rate_base_tax_amt9,
				"tax_rate_base_tax_amt9",
				tax_rate_base_tax_amt9,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_RECV_IF_R.$tax_rate10,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BILL_RECV_IF_R.$tax_rate10,
				"tax_rate10",
				tax_rate10,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_RECV_IF_R.$tax_rate_sls_amt10,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BILL_RECV_IF_R.$tax_rate_sls_amt10,
				"tax_rate_sls_amt10",
				tax_rate_sls_amt10,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_RECV_IF_R.$tax_rate_tax_amt10,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BILL_RECV_IF_R.$tax_rate_tax_amt10,
				"tax_rate_tax_amt10",
				tax_rate_tax_amt10,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_RECV_IF_R.$tax_rate_base_tax_amt10,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BILL_RECV_IF_R.$tax_rate_base_tax_amt10,
				"tax_rate_base_tax_amt10",
				tax_rate_base_tax_amt10,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_RECV_IF_R.$adv_amt_bal,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BILL_RECV_IF_R.$adv_amt_bal,
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
			MST_BILL_RECV_IF_R.$adv_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BILL_RECV_IF_R.$adv_amt,
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
			MST_BILL_RECV_IF_R.$adv_setoff_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BILL_RECV_IF_R.$adv_setoff_amt,
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
			MST_BILL_RECV_IF_R.$adv_setoff_tax_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BILL_RECV_IF_R.$adv_setoff_tax_amt,
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
			MST_BILL_RECV_IF_R.$pay_schd_dt1,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_BILL_RECV_IF_R.$pay_schd_dt1,
				"pay_schd_dt1",
				pay_schd_dt1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_RECV_IF_R.$pay_schd_amt1,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BILL_RECV_IF_R.$pay_schd_amt1,
				"pay_schd_amt1",
				pay_schd_amt1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_RECV_IF_R.$pay_mtd_cd1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RECV_IF_R.$pay_mtd_cd1,
				"pay_mtd_cd1",
				pay_mtd_cd1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_RECV_IF_R.$if_pay_mtd_cd1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RECV_IF_R.$if_pay_mtd_cd1,
				"if_pay_mtd_cd1",
				if_pay_mtd_cd1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_RECV_IF_R.$if_pay_mtd_nm1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RECV_IF_R.$if_pay_mtd_nm1,
				"if_pay_mtd_nm1",
				if_pay_mtd_nm1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_RECV_IF_R.$pay_schd_dt2,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_BILL_RECV_IF_R.$pay_schd_dt2,
				"pay_schd_dt2",
				pay_schd_dt2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_RECV_IF_R.$pay_schd_amt2,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BILL_RECV_IF_R.$pay_schd_amt2,
				"pay_schd_amt2",
				pay_schd_amt2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_RECV_IF_R.$pay_mtd_cd2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RECV_IF_R.$pay_mtd_cd2,
				"pay_mtd_cd2",
				pay_mtd_cd2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_RECV_IF_R.$if_pay_mtd_cd2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RECV_IF_R.$if_pay_mtd_cd2,
				"if_pay_mtd_cd2",
				if_pay_mtd_cd2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_RECV_IF_R.$if_pay_mtd_nm2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RECV_IF_R.$if_pay_mtd_nm2,
				"if_pay_mtd_nm2",
				if_pay_mtd_nm2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_RECV_IF_R.$pay_schd_dt3,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_BILL_RECV_IF_R.$pay_schd_dt3,
				"pay_schd_dt3",
				pay_schd_dt3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_RECV_IF_R.$pay_schd_amt3,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BILL_RECV_IF_R.$pay_schd_amt3,
				"pay_schd_amt3",
				pay_schd_amt3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_RECV_IF_R.$pay_mtd_cd3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RECV_IF_R.$pay_mtd_cd3,
				"pay_mtd_cd3",
				pay_mtd_cd3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_RECV_IF_R.$if_pay_mtd_cd3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RECV_IF_R.$if_pay_mtd_cd3,
				"if_pay_mtd_cd3",
				if_pay_mtd_cd3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_RECV_IF_R.$if_pay_mtd_nm3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RECV_IF_R.$if_pay_mtd_nm3,
				"if_pay_mtd_nm3",
				if_pay_mtd_nm3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_RECV_IF_R.$pay_schd_dt4,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_BILL_RECV_IF_R.$pay_schd_dt4,
				"pay_schd_dt4",
				pay_schd_dt4,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_RECV_IF_R.$pay_schd_amt4,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BILL_RECV_IF_R.$pay_schd_amt4,
				"pay_schd_amt4",
				pay_schd_amt4,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_RECV_IF_R.$pay_mtd_cd4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RECV_IF_R.$pay_mtd_cd4,
				"pay_mtd_cd4",
				pay_mtd_cd4,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_RECV_IF_R.$if_pay_mtd_cd4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RECV_IF_R.$if_pay_mtd_cd4,
				"if_pay_mtd_cd4",
				if_pay_mtd_cd4,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_RECV_IF_R.$if_pay_mtd_nm4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RECV_IF_R.$if_pay_mtd_nm4,
				"if_pay_mtd_nm4",
				if_pay_mtd_nm4,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_RECV_IF_R.$pay_schd_dt5,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_BILL_RECV_IF_R.$pay_schd_dt5,
				"pay_schd_dt5",
				pay_schd_dt5,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_RECV_IF_R.$pay_schd_amt5,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BILL_RECV_IF_R.$pay_schd_amt5,
				"pay_schd_amt5",
				pay_schd_amt5,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_RECV_IF_R.$pay_mtd_cd5,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RECV_IF_R.$pay_mtd_cd5,
				"pay_mtd_cd5",
				pay_mtd_cd5,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_RECV_IF_R.$if_pay_mtd_cd5,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RECV_IF_R.$if_pay_mtd_cd5,
				"if_pay_mtd_cd5",
				if_pay_mtd_cd5,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_RECV_IF_R.$if_pay_mtd_nm5,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RECV_IF_R.$if_pay_mtd_nm5,
				"if_pay_mtd_nm5",
				if_pay_mtd_nm5,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_RECV_IF_R.$pay_schd_dt6,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_BILL_RECV_IF_R.$pay_schd_dt6,
				"pay_schd_dt6",
				pay_schd_dt6,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_RECV_IF_R.$pay_schd_amt6,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BILL_RECV_IF_R.$pay_schd_amt6,
				"pay_schd_amt6",
				pay_schd_amt6,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_RECV_IF_R.$pay_mtd_cd6,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RECV_IF_R.$pay_mtd_cd6,
				"pay_mtd_cd6",
				pay_mtd_cd6,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_RECV_IF_R.$if_pay_mtd_cd6,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RECV_IF_R.$if_pay_mtd_cd6,
				"if_pay_mtd_cd6",
				if_pay_mtd_cd6,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_RECV_IF_R.$if_pay_mtd_nm6,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RECV_IF_R.$if_pay_mtd_nm6,
				"if_pay_mtd_nm6",
				if_pay_mtd_nm6,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_RECV_IF_R.$pay_schd_dt7,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_BILL_RECV_IF_R.$pay_schd_dt7,
				"pay_schd_dt7",
				pay_schd_dt7,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_RECV_IF_R.$pay_schd_amt7,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BILL_RECV_IF_R.$pay_schd_amt7,
				"pay_schd_amt7",
				pay_schd_amt7,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_RECV_IF_R.$pay_mtd_cd7,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RECV_IF_R.$pay_mtd_cd7,
				"pay_mtd_cd7",
				pay_mtd_cd7,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_RECV_IF_R.$if_pay_mtd_cd7,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RECV_IF_R.$if_pay_mtd_cd7,
				"if_pay_mtd_cd7",
				if_pay_mtd_cd7,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_RECV_IF_R.$if_pay_mtd_nm7,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RECV_IF_R.$if_pay_mtd_nm7,
				"if_pay_mtd_nm7",
				if_pay_mtd_nm7,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_RECV_IF_R.$pay_schd_dt8,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_BILL_RECV_IF_R.$pay_schd_dt8,
				"pay_schd_dt8",
				pay_schd_dt8,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_RECV_IF_R.$pay_schd_amt8,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BILL_RECV_IF_R.$pay_schd_amt8,
				"pay_schd_amt8",
				pay_schd_amt8,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_RECV_IF_R.$pay_mtd_cd8,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RECV_IF_R.$pay_mtd_cd8,
				"pay_mtd_cd8",
				pay_mtd_cd8,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_RECV_IF_R.$if_pay_mtd_cd8,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RECV_IF_R.$if_pay_mtd_cd8,
				"if_pay_mtd_cd8",
				if_pay_mtd_cd8,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_RECV_IF_R.$if_pay_mtd_nm8,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RECV_IF_R.$if_pay_mtd_nm8,
				"if_pay_mtd_nm8",
				if_pay_mtd_nm8,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_RECV_IF_R.$pay_schd_dt9,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_BILL_RECV_IF_R.$pay_schd_dt9,
				"pay_schd_dt9",
				pay_schd_dt9,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_RECV_IF_R.$pay_schd_amt9,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BILL_RECV_IF_R.$pay_schd_amt9,
				"pay_schd_amt9",
				pay_schd_amt9,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_RECV_IF_R.$pay_mtd_cd9,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RECV_IF_R.$pay_mtd_cd9,
				"pay_mtd_cd9",
				pay_mtd_cd9,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_RECV_IF_R.$if_pay_mtd_cd9,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RECV_IF_R.$if_pay_mtd_cd9,
				"if_pay_mtd_cd9",
				if_pay_mtd_cd9,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_RECV_IF_R.$if_pay_mtd_nm9,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RECV_IF_R.$if_pay_mtd_nm9,
				"if_pay_mtd_nm9",
				if_pay_mtd_nm9,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_RECV_IF_R.$pay_schd_dt10,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_BILL_RECV_IF_R.$pay_schd_dt10,
				"pay_schd_dt10",
				pay_schd_dt10,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_RECV_IF_R.$pay_schd_amt10,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BILL_RECV_IF_R.$pay_schd_amt10,
				"pay_schd_amt10",
				pay_schd_amt10,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_RECV_IF_R.$pay_mtd_cd10,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RECV_IF_R.$pay_mtd_cd10,
				"pay_mtd_cd10",
				pay_mtd_cd10,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_RECV_IF_R.$if_pay_mtd_cd10,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RECV_IF_R.$if_pay_mtd_cd10,
				"if_pay_mtd_cd10",
				if_pay_mtd_cd10,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_RECV_IF_R.$if_pay_mtd_nm10,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RECV_IF_R.$if_pay_mtd_nm10,
				"if_pay_mtd_nm10",
				if_pay_mtd_nm10,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_RECV_IF_R.$bank_ac_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RECV_IF_R.$bank_ac_cd,
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
			MST_BILL_RECV_IF_R.$if_bank_ac_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RECV_IF_R.$if_bank_ac_cd,
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
			MST_BILL_RECV_IF_R.$bank_ac_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RECV_IF_R.$bank_ac_typ,
				"bank_ac_typ",
				bank_ac_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_RECV_IF_R.$bank_ac_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RECV_IF_R.$bank_ac_no,
				"bank_ac_no",
				bank_ac_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_RECV_IF_R.$bank_ac_holder,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RECV_IF_R.$bank_ac_holder,
				"bank_ac_holder",
				bank_ac_holder,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_RECV_IF_R.$bank_ac_holder_sub,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RECV_IF_R.$bank_ac_holder_sub,
				"bank_ac_holder_sub",
				bank_ac_holder_sub,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_RECV_IF_R.$bank_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RECV_IF_R.$bank_cd,
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
			MST_BILL_RECV_IF_R.$bank_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RECV_IF_R.$bank_nm,
				"bank_nm",
				bank_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_RECV_IF_R.$branch_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RECV_IF_R.$branch_cd,
				"branch_cd",
				branch_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_RECV_IF_R.$branch_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RECV_IF_R.$branch_nm,
				"branch_nm",
				branch_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_RECV_IF_R.$trd_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RECV_IF_R.$trd_cd,
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
			MST_BILL_RECV_IF_R.$if_trd_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RECV_IF_R.$if_trd_cd,
				"if_trd_cd",
				if_trd_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_RECV_IF_R.$if_trd_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RECV_IF_R.$if_trd_nm,
				"if_trd_nm",
				if_trd_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_RECV_IF_R.$trd_ptn_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RECV_IF_R.$trd_ptn_typ,
				"trd_ptn_typ",
				trd_ptn_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_RECV_IF_R.$slip_sts_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RECV_IF_R.$slip_sts_typ,
				"slip_sts_typ",
				slip_sts_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_RECV_IF_R.$dlv_slip_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RECV_IF_R.$dlv_slip_no,
				"dlv_slip_no",
				dlv_slip_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_RECV_IF_R.$dlv_slip_d_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RECV_IF_R.$dlv_slip_d_no,
				"dlv_slip_d_no",
				dlv_slip_d_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_RECV_IF_R.$ship_dlv_slip_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RECV_IF_R.$ship_dlv_slip_no,
				"ship_dlv_slip_no",
				ship_dlv_slip_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_RECV_IF_R.$ship_dlv_slip_d_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RECV_IF_R.$ship_dlv_slip_d_no,
				"ship_dlv_slip_d_no",
				ship_dlv_slip_d_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_RECV_IF_R.$act_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RECV_IF_R.$act_no,
				"act_no",
				act_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_RECV_IF_R.$act_rev,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BILL_RECV_IF_R.$act_rev,
				"act_rev",
				act_rev,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_RECV_IF_R.$act_d_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RECV_IF_R.$act_d_no,
				"act_d_no",
				act_d_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_RECV_IF_R.$po_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RECV_IF_R.$po_no,
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
			MST_BILL_RECV_IF_R.$po_d_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RECV_IF_R.$po_d_no,
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
			MST_BILL_RECV_IF_R.$ac_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_BILL_RECV_IF_R.$ac_dt,
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
			MST_BILL_RECV_IF_R.$dlv_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_BILL_RECV_IF_R.$dlv_dt,
				"dlv_dt",
				dlv_dt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_RECV_IF_R.$rcv_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_BILL_RECV_IF_R.$rcv_dt,
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
			MST_BILL_RECV_IF_R.$bill_basis_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_BILL_RECV_IF_R.$bill_basis_dt,
				"bill_basis_dt",
				bill_basis_dt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_RECV_IF_R.$base_ac_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_BILL_RECV_IF_R.$base_ac_dt,
				"base_ac_dt",
				base_ac_dt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_RECV_IF_R.$itm_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RECV_IF_R.$itm_cd,
				"itm_cd",
				itm_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_RECV_IF_R.$itm_sub1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RECV_IF_R.$itm_sub1,
				"itm_sub1",
				itm_sub1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_RECV_IF_R.$itm_sub2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RECV_IF_R.$itm_sub2,
				"itm_sub2",
				itm_sub2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_RECV_IF_R.$itm_sub3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RECV_IF_R.$itm_sub3,
				"itm_sub3",
				itm_sub3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_RECV_IF_R.$if_itm_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RECV_IF_R.$if_itm_cd,
				"if_itm_cd",
				if_itm_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_RECV_IF_R.$if_itm_sub1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RECV_IF_R.$if_itm_sub1,
				"if_itm_sub1",
				if_itm_sub1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_RECV_IF_R.$if_itm_sub2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RECV_IF_R.$if_itm_sub2,
				"if_itm_sub2",
				if_itm_sub2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_RECV_IF_R.$if_itm_sub3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RECV_IF_R.$if_itm_sub3,
				"if_itm_sub3",
				if_itm_sub3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_RECV_IF_R.$if_itm_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RECV_IF_R.$if_itm_nm,
				"if_itm_nm",
				if_itm_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_RECV_IF_R.$itm_alt_nm1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RECV_IF_R.$itm_alt_nm1,
				"itm_alt_nm1",
				itm_alt_nm1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_RECV_IF_R.$itm_alt_nm2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RECV_IF_R.$itm_alt_nm2,
				"itm_alt_nm2",
				itm_alt_nm2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_RECV_IF_R.$itm_alt_nm3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RECV_IF_R.$itm_alt_nm3,
				"itm_alt_nm3",
				itm_alt_nm3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_RECV_IF_R.$itm_alt_nm4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RECV_IF_R.$itm_alt_nm4,
				"itm_alt_nm4",
				itm_alt_nm4,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_RECV_IF_R.$sno1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RECV_IF_R.$sno1,
				"sno1",
				sno1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_RECV_IF_R.$sno2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RECV_IF_R.$sno2,
				"sno2",
				sno2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_RECV_IF_R.$sno3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RECV_IF_R.$sno3,
				"sno3",
				sno3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_RECV_IF_R.$sno4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RECV_IF_R.$sno4,
				"sno4",
				sno4,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_RECV_IF_R.$trd_unit_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RECV_IF_R.$trd_unit_cd,
				"trd_unit_cd",
				trd_unit_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_RECV_IF_R.$if_trd_unit_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RECV_IF_R.$if_trd_unit_cd,
				"if_trd_unit_cd",
				if_trd_unit_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_RECV_IF_R.$if_trd_unit_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RECV_IF_R.$if_trd_unit_nm,
				"if_trd_unit_nm",
				if_trd_unit_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_RECV_IF_R.$trd_unit_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BILL_RECV_IF_R.$trd_unit_qty,
				"trd_unit_qty",
				trd_unit_qty,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_RECV_IF_R.$interim_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_BILL_RECV_IF_R.$interim_flg,
				"interim_flg",
				interim_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_RECV_IF_R.$trd_cur_upri,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BILL_RECV_IF_R.$trd_cur_upri,
				"trd_cur_upri",
				trd_cur_upri,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_RECV_IF_R.$trd_cur_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BILL_RECV_IF_R.$trd_cur_amt,
				"trd_cur_amt",
				trd_cur_amt,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_RECV_IF_R.$trd_cur_dscnt_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BILL_RECV_IF_R.$trd_cur_dscnt_amt,
				"trd_cur_dscnt_amt",
				trd_cur_dscnt_amt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_RECV_IF_R.$tax_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RECV_IF_R.$tax_cd,
				"tax_cd",
				tax_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_RECV_IF_R.$if_tax_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RECV_IF_R.$if_tax_cd,
				"if_tax_cd",
				if_tax_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_RECV_IF_R.$if_tax_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RECV_IF_R.$if_tax_nm,
				"if_tax_nm",
				if_tax_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_RECV_IF_R.$tax_rate,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BILL_RECV_IF_R.$tax_rate,
				"tax_rate",
				tax_rate,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_RECV_IF_R.$inc_tax_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_BILL_RECV_IF_R.$inc_tax_flg,
				"inc_tax_flg",
				inc_tax_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_RECV_IF_R.$trd_cur_tax_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BILL_RECV_IF_R.$trd_cur_tax_amt,
				"trd_cur_tax_amt",
				trd_cur_tax_amt,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_RECV_IF_R.$trd_d_rmrks,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RECV_IF_R.$trd_d_rmrks,
				"trd_d_rmrks",
				trd_d_rmrks,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_RECV_IF_R.$if_co_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RECV_IF_R.$if_co_cd,
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
			MST_BILL_RECV_IF_R.$if_co_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RECV_IF_R.$if_co_nm,
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
			MST_BILL_RECV_IF_R.$bill_bcst_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RECV_IF_R.$bill_bcst_nm,
				"bill_bcst_nm",
				bill_bcst_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_RECV_IF_R.$bill_ein,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RECV_IF_R.$bill_ein,
				"bill_ein",
				bill_ein,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_RECV_IF_R.$bill_biz_co_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RECV_IF_R.$bill_biz_co_no,
				"bill_biz_co_no",
				bill_biz_co_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_RECV_IF_R.$bill_zip_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RECV_IF_R.$bill_zip_cd,
				"bill_zip_cd",
				bill_zip_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_RECV_IF_R.$bill_addr1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RECV_IF_R.$bill_addr1,
				"bill_addr1",
				bill_addr1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_RECV_IF_R.$bill_addr2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RECV_IF_R.$bill_addr2,
				"bill_addr2",
				bill_addr2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_RECV_IF_R.$bill_addr3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RECV_IF_R.$bill_addr3,
				"bill_addr3",
				bill_addr3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_RECV_IF_R.$bill_addr4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RECV_IF_R.$bill_addr4,
				"bill_addr4",
				bill_addr4,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_RECV_IF_R.$bill_bcst_dpt,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RECV_IF_R.$bill_bcst_dpt,
				"bill_bcst_dpt",
				bill_bcst_dpt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_RECV_IF_R.$bill_tel,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RECV_IF_R.$bill_tel,
				"bill_tel",
				bill_tel,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_RECV_IF_R.$batch_log_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RECV_IF_R.$batch_log_no,
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
			MST_BILL_RECV_IF_R.$log_sub_key1,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BILL_RECV_IF_R.$log_sub_key1,
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
			MST_BILL_RECV_IF_R.$log_sub_key2,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BILL_RECV_IF_R.$log_sub_key2,
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
			MST_BILL_RECV_IF_R.$sub_char1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RECV_IF_R.$sub_char1,
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
			MST_BILL_RECV_IF_R.$sub_char2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RECV_IF_R.$sub_char2,
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
			MST_BILL_RECV_IF_R.$sub_char3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RECV_IF_R.$sub_char3,
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
			MST_BILL_RECV_IF_R.$sub_char4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RECV_IF_R.$sub_char4,
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
			MST_BILL_RECV_IF_R.$sub_char5,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RECV_IF_R.$sub_char5,
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
			MST_BILL_RECV_IF_R.$sub_char6,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RECV_IF_R.$sub_char6,
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
			MST_BILL_RECV_IF_R.$sub_char7,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RECV_IF_R.$sub_char7,
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
			MST_BILL_RECV_IF_R.$sub_char8,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RECV_IF_R.$sub_char8,
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
			MST_BILL_RECV_IF_R.$sub_char9,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RECV_IF_R.$sub_char9,
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
			MST_BILL_RECV_IF_R.$sub_char10,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RECV_IF_R.$sub_char10,
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
			MST_BILL_RECV_IF_R.$sub_char11,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RECV_IF_R.$sub_char11,
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
			MST_BILL_RECV_IF_R.$sub_char12,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RECV_IF_R.$sub_char12,
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
			MST_BILL_RECV_IF_R.$sub_char13,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RECV_IF_R.$sub_char13,
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
			MST_BILL_RECV_IF_R.$sub_char14,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RECV_IF_R.$sub_char14,
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
			MST_BILL_RECV_IF_R.$sub_char15,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RECV_IF_R.$sub_char15,
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
			MST_BILL_RECV_IF_R.$sub_char16,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RECV_IF_R.$sub_char16,
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
			MST_BILL_RECV_IF_R.$sub_char17,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RECV_IF_R.$sub_char17,
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
			MST_BILL_RECV_IF_R.$sub_char18,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RECV_IF_R.$sub_char18,
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
			MST_BILL_RECV_IF_R.$sub_char19,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RECV_IF_R.$sub_char19,
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
			MST_BILL_RECV_IF_R.$sub_char20,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RECV_IF_R.$sub_char20,
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
			MST_BILL_RECV_IF_R.$sub_char21,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RECV_IF_R.$sub_char21,
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
			MST_BILL_RECV_IF_R.$sub_char22,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RECV_IF_R.$sub_char22,
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
			MST_BILL_RECV_IF_R.$sub_char23,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RECV_IF_R.$sub_char23,
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
			MST_BILL_RECV_IF_R.$sub_char24,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RECV_IF_R.$sub_char24,
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
			MST_BILL_RECV_IF_R.$sub_char25,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RECV_IF_R.$sub_char25,
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
			MST_BILL_RECV_IF_R.$sub_char26,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RECV_IF_R.$sub_char26,
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
			MST_BILL_RECV_IF_R.$sub_char27,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RECV_IF_R.$sub_char27,
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
			MST_BILL_RECV_IF_R.$sub_char28,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RECV_IF_R.$sub_char28,
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
			MST_BILL_RECV_IF_R.$sub_char29,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RECV_IF_R.$sub_char29,
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
			MST_BILL_RECV_IF_R.$sub_char30,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RECV_IF_R.$sub_char30,
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
			MST_BILL_RECV_IF_R.$sub_num1,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BILL_RECV_IF_R.$sub_num1,
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
			MST_BILL_RECV_IF_R.$sub_num2,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BILL_RECV_IF_R.$sub_num2,
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
			MST_BILL_RECV_IF_R.$sub_num3,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BILL_RECV_IF_R.$sub_num3,
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
			MST_BILL_RECV_IF_R.$sub_num4,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BILL_RECV_IF_R.$sub_num4,
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
			MST_BILL_RECV_IF_R.$sub_num5,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BILL_RECV_IF_R.$sub_num5,
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
			MST_BILL_RECV_IF_R.$sub_dt1,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_BILL_RECV_IF_R.$sub_dt1,
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
			MST_BILL_RECV_IF_R.$sub_dt2,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_BILL_RECV_IF_R.$sub_dt2,
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
			MST_BILL_RECV_IF_R.$sub_dt3,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_BILL_RECV_IF_R.$sub_dt3,
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
			MST_BILL_RECV_IF_R.$sub_dt4,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_BILL_RECV_IF_R.$sub_dt4,
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
			MST_BILL_RECV_IF_R.$sub_dt5,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_BILL_RECV_IF_R.$sub_dt5,
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
			MST_BILL_RECV_IF_R.$ins_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RECV_IF_R.$ins_usr_id,
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
			MST_BILL_RECV_IF_R.$ins_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RECV_IF_R.$ins_usr_nm,
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
			MST_BILL_RECV_IF_R.$ins_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MST_BILL_RECV_IF_R.$ins_ts,
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
			MST_BILL_RECV_IF_R.$ins_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RECV_IF_R.$ins_func_id,
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
			MST_BILL_RECV_IF_R.$upd_cntr,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BILL_RECV_IF_R.$upd_cntr,
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
			MST_BILL_RECV_IF_R.$upd_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RECV_IF_R.$upd_usr_id,
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
			MST_BILL_RECV_IF_R.$upd_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RECV_IF_R.$upd_usr_nm,
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
			MST_BILL_RECV_IF_R.$upd_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MST_BILL_RECV_IF_R.$upd_ts,
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
			MST_BILL_RECV_IF_R.$upd_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RECV_IF_R.$upd_func_id,
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
			MST_BILL_RECV_IF_R.$upd_srv_req_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RECV_IF_R.$upd_srv_req_no,
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
			MST_BILL_RECV_IF_R.$sdrv_sts_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RECV_IF_R.$sdrv_sts_typ,
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
			MST_BILL_RECV_IF_R.$bill_src_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RECV_IF_R.$bill_src_nm,
				"bill_src_nm",
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
			MST_BILL_RECV_IF_R.$trd_cur_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RECV_IF_R.$trd_cur_nm,
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
			MST_BILL_RECV_IF_R.$bank_ac_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RECV_IF_R.$bank_ac_nm,
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
			MST_BILL_RECV_IF_R.$pay_mtd_nm1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RECV_IF_R.$pay_mtd_nm1,
				"pay_mtd_nm1",
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
			MST_BILL_RECV_IF_R.$pay_mtd_nm2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RECV_IF_R.$pay_mtd_nm2,
				"pay_mtd_nm2",
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
			MST_BILL_RECV_IF_R.$pay_mtd_nm3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RECV_IF_R.$pay_mtd_nm3,
				"pay_mtd_nm3",
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
			MST_BILL_RECV_IF_R.$pay_mtd_nm4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RECV_IF_R.$pay_mtd_nm4,
				"pay_mtd_nm4",
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
			MST_BILL_RECV_IF_R.$pay_mtd_nm5,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RECV_IF_R.$pay_mtd_nm5,
				"pay_mtd_nm5",
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
			MST_BILL_RECV_IF_R.$pay_mtd_nm6,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RECV_IF_R.$pay_mtd_nm6,
				"pay_mtd_nm6",
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
			MST_BILL_RECV_IF_R.$pay_mtd_nm7,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RECV_IF_R.$pay_mtd_nm7,
				"pay_mtd_nm7",
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
			MST_BILL_RECV_IF_R.$pay_mtd_nm8,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RECV_IF_R.$pay_mtd_nm8,
				"pay_mtd_nm8",
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
			MST_BILL_RECV_IF_R.$pay_mtd_nm9,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RECV_IF_R.$pay_mtd_nm9,
				"pay_mtd_nm9",
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
			MST_BILL_RECV_IF_R.$pay_mtd_nm10,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RECV_IF_R.$pay_mtd_nm10,
				"pay_mtd_nm10",
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
			MST_BILL_RECV_IF_R.$trd_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RECV_IF_R.$trd_nm,
				"trd_nm",
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
			MST_BILL_RECV_IF_R.$itm_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RECV_IF_R.$itm_nm,
				"itm_nm",
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
			MST_BILL_RECV_IF_R.$trd_unit_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RECV_IF_R.$trd_unit_nm,
				"trd_unit_nm",
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
			MST_BILL_RECV_IF_R.$tax_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RECV_IF_R.$tax_nm,
				"tax_nm",
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
	public static MST_BILL_RECV_IF_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MST_BILL_RECV_IF_R create(String alias) {
		MST_BILL_RECV_IF_R row = new MST_BILL_RECV_IF_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MST_BILL_RECV_IF_R createByName(T proto) {
		MST_BILL_RECV_IF_R row = MST_BILL_RECV_IF_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MST_BILL_RECV_IF_R clone() {
		return (MST_BILL_RECV_IF_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MST_BILL_RECV_IF_R createInstance() {
		return (MST_BILL_RECV_IF_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MST_BILL_RECV_IF_R getValues(String... names) {
		return (MST_BILL_RECV_IF_R) super.getValues(names);
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
	 public MSW_BILL_RECV_IF_KEY_R getPkWorkDbc(String alias) {
	 	return MSW_BILL_RECV_IF_KEY_R.create(alias);
	 }

	/*
	 * MCDBContainerのオーバーライドメソッドです。
	 */
	 public MSW_BILL_RECV_IF_KEY_R getPkWorkDbc() {
	 	return getPkWorkDbc(MSW_BILL_RECV_IF_KEY_R.TABLE_NAME);
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
	 * 請求締年月日. Billing closing day.<p>
	 *
	 */
	public MCDate bill_cl_dt() {
		return getConstDate(offset + 10, $bill_cl_dt);
	}

	/**
	 * 請求締年月日. Billing closing day.<p>
	 *
	 */
	public void bill_cl_dt(MCDate value) {
		setConstDate(offset + 10, $bill_cl_dt, value);
	}

	/**
	 * 請求日. Billing date.<p>
	 *
	 */
	public MCDate bill_dt() {
		return getConstDate(offset + 11, $bill_dt);
	}

	/**
	 * 請求日. Billing date.<p>
	 *
	 */
	public void bill_dt(MCDate value) {
		setConstDate(offset + 11, $bill_dt, value);
	}

	/**
	 * 請求書ＮＯ. Invoice No..<p>
	 *
	 */
	public String bill_no() {
		return getConstString(offset + 12, $bill_no);
	}

	/**
	 * 請求書ＮＯ. Invoice No..<p>
	 *
	 */
	public void bill_no(String value) {
		setConstString(offset + 12, $bill_no, value);
	}

	/**
	 * 請求明細ＮＯ. Billing details No..<p>
	 *
	 */
	public String bill_d_no() {
		return getConstString(offset + 13, $bill_d_no);
	}

	/**
	 * 請求明細ＮＯ. Billing details No..<p>
	 *
	 */
	public void bill_d_no(String value) {
		setConstString(offset + 13, $bill_d_no, value);
	}

	/**
	 * 先行請求書ＮＯ. Advance invoice No..<p>
	 *
	 */
	public String pre_bill_no() {
		return getConstString(offset + 14, $pre_bill_no);
	}

	/**
	 * 先行請求書ＮＯ. Advance invoice No..<p>
	 *
	 */
	public void pre_bill_no(String value) {
		setConstString(offset + 14, $pre_bill_no, value);
	}

	/**
	 * 先行請求日. Advance billing date.<p>
	 *
	 */
	public MCDate pre_bill_dt() {
		return getConstDate(offset + 15, $pre_bill_dt);
	}

	/**
	 * 先行請求日. Advance billing date.<p>
	 *
	 */
	public void pre_bill_dt(MCDate value) {
		setConstDate(offset + 15, $pre_bill_dt, value);
	}

	/**
	 * 請求期間開始日. Billing period start date.<p>
	 *
	 */
	public MCDate bill_st_dt() {
		return getConstDate(offset + 16, $bill_st_dt);
	}

	/**
	 * 請求期間開始日. Billing period start date.<p>
	 *
	 */
	public void bill_st_dt(MCDate value) {
		setConstDate(offset + 16, $bill_st_dt, value);
	}

	/**
	 * 請求期間終了日. Billing period end date.<p>
	 *
	 */
	public MCDate bill_end_dt() {
		return getConstDate(offset + 17, $bill_end_dt);
	}

	/**
	 * 請求期間終了日. Billing period end date.<p>
	 *
	 */
	public void bill_end_dt(MCDate value) {
		setConstDate(offset + 17, $bill_end_dt, value);
	}

	/**
	 * インボイスＮＯ. Invoice No..<p>
	 *
	 */
	public String iv_no() {
		return getConstString(offset + 18, $iv_no);
	}

	/**
	 * インボイスＮＯ. Invoice No..<p>
	 *
	 */
	public void iv_no(String value) {
		setConstString(offset + 18, $iv_no, value);
	}

	/**
	 * 案件ＮＯ. Sales project No..<p>
	 *
	 */
	public String wrk_no() {
		return getConstString(offset + 19, $wrk_no);
	}

	/**
	 * 案件ＮＯ. Sales project No..<p>
	 *
	 */
	public void wrk_no(String value) {
		setConstString(offset + 19, $wrk_no, value);
	}

	/**
	 * 案件名. Sales project name.<p>
	 *
	 */
	public String wrk_nm() {
		return getConstString(offset + 20, $wrk_nm);
	}

	/**
	 * 案件名. Sales project name.<p>
	 *
	 */
	public void wrk_nm(String value) {
		setConstString(offset + 20, $wrk_nm, value);
	}

	/**
	 * 請求元ＣＤ. Billing source cd..<p>
	 *
	 */
	public String bill_src_cd() {
		return getConstString(offset + 21, $bill_src_cd);
	}

	/**
	 * 請求元ＣＤ. Billing source cd..<p>
	 *
	 */
	public void bill_src_cd(String value) {
		setConstString(offset + 21, $bill_src_cd, value);
	}

	/**
	 * ＩＦ請求元ＣＤ. IF billing source cd..<p>
	 *
	 */
	public String if_bill_src_cd() {
		return getConstString(offset + 22, $if_bill_src_cd);
	}

	/**
	 * ＩＦ請求元ＣＤ. IF billing source cd..<p>
	 *
	 */
	public void if_bill_src_cd(String value) {
		setConstString(offset + 22, $if_bill_src_cd, value);
	}

	/**
	 * ＩＦ請求元名. IF billing source name.<p>
	 *
	 */
	public String if_bill_src_nm() {
		return getConstString(offset + 23, $if_bill_src_nm);
	}

	/**
	 * ＩＦ請求元名. IF billing source name.<p>
	 *
	 */
	public void if_bill_src_nm(String value) {
		setConstString(offset + 23, $if_bill_src_nm, value);
	}

	/**
	 * 請求元法人番号. Billing source corporation No..<p>
	 *
	 */
	public String bill_src_ein() {
		return getConstString(offset + 24, $bill_src_ein);
	}

	/**
	 * 請求元法人番号. Billing source corporation No..<p>
	 *
	 */
	public void bill_src_ein(String value) {
		setConstString(offset + 24, $bill_src_ein, value);
	}

	/**
	 * 請求元事業者ＮＯ. Billing source business No..<p>
	 *
	 */
	public String bill_src_biz_co_no() {
		return getConstString(offset + 25, $bill_src_biz_co_no);
	}

	/**
	 * 請求元事業者ＮＯ. Billing source business No..<p>
	 *
	 */
	public void bill_src_biz_co_no(String value) {
		setConstString(offset + 25, $bill_src_biz_co_no, value);
	}

	/**
	 * 請求元郵便番号. Billing source zip code.<p>
	 *
	 */
	public String bill_src_zip_cd() {
		return getConstString(offset + 26, $bill_src_zip_cd);
	}

	/**
	 * 請求元郵便番号. Billing source zip code.<p>
	 *
	 */
	public void bill_src_zip_cd(String value) {
		setConstString(offset + 26, $bill_src_zip_cd, value);
	}

	/**
	 * 請求元住所１. Billing source address 1.<p>
	 *
	 */
	public String bill_src_addr1() {
		return getConstString(offset + 27, $bill_src_addr1);
	}

	/**
	 * 請求元住所１. Billing source address 1.<p>
	 *
	 */
	public void bill_src_addr1(String value) {
		setConstString(offset + 27, $bill_src_addr1, value);
	}

	/**
	 * 請求元住所２. Billing source address 2.<p>
	 *
	 */
	public String bill_src_addr2() {
		return getConstString(offset + 28, $bill_src_addr2);
	}

	/**
	 * 請求元住所２. Billing source address 2.<p>
	 *
	 */
	public void bill_src_addr2(String value) {
		setConstString(offset + 28, $bill_src_addr2, value);
	}

	/**
	 * 請求元住所３. Billing source address 3.<p>
	 *
	 */
	public String bill_src_addr3() {
		return getConstString(offset + 29, $bill_src_addr3);
	}

	/**
	 * 請求元住所３. Billing source address 3.<p>
	 *
	 */
	public void bill_src_addr3(String value) {
		setConstString(offset + 29, $bill_src_addr3, value);
	}

	/**
	 * 請求元住所４. Billing source address 4.<p>
	 *
	 */
	public String bill_src_addr4() {
		return getConstString(offset + 30, $bill_src_addr4);
	}

	/**
	 * 請求元住所４. Billing source address 4.<p>
	 *
	 */
	public void bill_src_addr4(String value) {
		setConstString(offset + 30, $bill_src_addr4, value);
	}

	/**
	 * 請求元部門. Billing source dept..<p>
	 *
	 */
	public String bill_src_dpt() {
		return getConstString(offset + 31, $bill_src_dpt);
	}

	/**
	 * 請求元部門. Billing source dept..<p>
	 *
	 */
	public void bill_src_dpt(String value) {
		setConstString(offset + 31, $bill_src_dpt, value);
	}

	/**
	 * 請求元ＴＥＬ. Billing source TEL.<p>
	 *
	 */
	public String bill_src_tel() {
		return getConstString(offset + 32, $bill_src_tel);
	}

	/**
	 * 請求元ＴＥＬ. Billing source TEL.<p>
	 *
	 */
	public void bill_src_tel(String value) {
		setConstString(offset + 32, $bill_src_tel, value);
	}

	/**
	 * 取引通貨ＣＤ. Transaction currency cd..<p>
	 *
	 */
	public String trd_cur_cd() {
		return getConstString(offset + 33, $trd_cur_cd);
	}

	/**
	 * 取引通貨ＣＤ. Transaction currency cd..<p>
	 *
	 */
	public void trd_cur_cd(String value) {
		setConstString(offset + 33, $trd_cur_cd, value);
	}

	/**
	 * ＩＦ取引通貨ＣＤ. IF transaction currency cd..<p>
	 *
	 */
	public String if_trd_cur_cd() {
		return getConstString(offset + 34, $if_trd_cur_cd);
	}

	/**
	 * ＩＦ取引通貨ＣＤ. IF transaction currency cd..<p>
	 *
	 */
	public void if_trd_cur_cd(String value) {
		setConstString(offset + 34, $if_trd_cur_cd, value);
	}

	/**
	 * 請求為替レート. Billing exchange rate.<p>
	 *
	 */
	public MCNumber bill_xrate() {
		return getConstNumber(offset + 35, $bill_xrate);
	}

	/**
	 * 請求為替レート. Billing exchange rate.<p>
	 *
	 */
	public void bill_xrate(MCNumber value) {
		setConstNumber(offset + 35, $bill_xrate, value);
	}
	
	/**
	 * 請求為替レート. Billing exchange rate.<p>
	 *
	 */
	public void bill_xrate(int value) {
		setConstNumber(offset + 35, $bill_xrate, value);
	}
	
	/**
	 * 請求為替レート. Billing exchange rate.<p>
	 *
	 */
	public void bill_xrate(long value) {
		setConstNumber(offset + 35, $bill_xrate, value);
	}
	
	/**
	 * 請求為替レート. Billing exchange rate.<p>
	 *
	 */
	public void bill_xrate(float value) {
		setConstNumber(offset + 35, $bill_xrate, value);
	}
	
	/**
	 * 請求為替レート. Billing exchange rate.<p>
	 *
	 */
	public void bill_xrate(double value) {
		setConstNumber(offset + 35, $bill_xrate, value);
	}
	
	/**
	 * 前回請求額. Last billing amount.<p>
	 *
	 */
	public MCNumber last_bill_amt() {
		return getConstNumber(offset + 36, $last_bill_amt);
	}

	/**
	 * 前回請求額. Last billing amount.<p>
	 *
	 */
	public void last_bill_amt(MCNumber value) {
		setConstNumber(offset + 36, $last_bill_amt, value);
	}
	
	/**
	 * 前回請求額. Last billing amount.<p>
	 *
	 */
	public void last_bill_amt(int value) {
		setConstNumber(offset + 36, $last_bill_amt, value);
	}
	
	/**
	 * 前回請求額. Last billing amount.<p>
	 *
	 */
	public void last_bill_amt(long value) {
		setConstNumber(offset + 36, $last_bill_amt, value);
	}
	
	/**
	 * 前回請求額. Last billing amount.<p>
	 *
	 */
	public void last_bill_amt(float value) {
		setConstNumber(offset + 36, $last_bill_amt, value);
	}
	
	/**
	 * 前回請求額. Last billing amount.<p>
	 *
	 */
	public void last_bill_amt(double value) {
		setConstNumber(offset + 36, $last_bill_amt, value);
	}
	
	/**
	 * 支払額. Payment amount.<p>
	 *
	 */
	public MCNumber rcv_amt() {
		return getConstNumber(offset + 37, $rcv_amt);
	}

	/**
	 * 支払額. Payment amount.<p>
	 *
	 */
	public void rcv_amt(MCNumber value) {
		setConstNumber(offset + 37, $rcv_amt, value);
	}
	
	/**
	 * 支払額. Payment amount.<p>
	 *
	 */
	public void rcv_amt(int value) {
		setConstNumber(offset + 37, $rcv_amt, value);
	}
	
	/**
	 * 支払額. Payment amount.<p>
	 *
	 */
	public void rcv_amt(long value) {
		setConstNumber(offset + 37, $rcv_amt, value);
	}
	
	/**
	 * 支払額. Payment amount.<p>
	 *
	 */
	public void rcv_amt(float value) {
		setConstNumber(offset + 37, $rcv_amt, value);
	}
	
	/**
	 * 支払額. Payment amount.<p>
	 *
	 */
	public void rcv_amt(double value) {
		setConstNumber(offset + 37, $rcv_amt, value);
	}
	
	/**
	 * 振替額. Transfer amount.<p>
	 *
	 */
	public MCNumber sw_amt() {
		return getConstNumber(offset + 38, $sw_amt);
	}

	/**
	 * 振替額. Transfer amount.<p>
	 *
	 */
	public void sw_amt(MCNumber value) {
		setConstNumber(offset + 38, $sw_amt, value);
	}
	
	/**
	 * 振替額. Transfer amount.<p>
	 *
	 */
	public void sw_amt(int value) {
		setConstNumber(offset + 38, $sw_amt, value);
	}
	
	/**
	 * 振替額. Transfer amount.<p>
	 *
	 */
	public void sw_amt(long value) {
		setConstNumber(offset + 38, $sw_amt, value);
	}
	
	/**
	 * 振替額. Transfer amount.<p>
	 *
	 */
	public void sw_amt(float value) {
		setConstNumber(offset + 38, $sw_amt, value);
	}
	
	/**
	 * 振替額. Transfer amount.<p>
	 *
	 */
	public void sw_amt(double value) {
		setConstNumber(offset + 38, $sw_amt, value);
	}
	
	/**
	 * 相殺額. Offset amount.<p>
	 *
	 */
	public MCNumber setoff_amt() {
		return getConstNumber(offset + 39, $setoff_amt);
	}

	/**
	 * 相殺額. Offset amount.<p>
	 *
	 */
	public void setoff_amt(MCNumber value) {
		setConstNumber(offset + 39, $setoff_amt, value);
	}
	
	/**
	 * 相殺額. Offset amount.<p>
	 *
	 */
	public void setoff_amt(int value) {
		setConstNumber(offset + 39, $setoff_amt, value);
	}
	
	/**
	 * 相殺額. Offset amount.<p>
	 *
	 */
	public void setoff_amt(long value) {
		setConstNumber(offset + 39, $setoff_amt, value);
	}
	
	/**
	 * 相殺額. Offset amount.<p>
	 *
	 */
	public void setoff_amt(float value) {
		setConstNumber(offset + 39, $setoff_amt, value);
	}
	
	/**
	 * 相殺額. Offset amount.<p>
	 *
	 */
	public void setoff_amt(double value) {
		setConstNumber(offset + 39, $setoff_amt, value);
	}
	
	/**
	 * 差引繰越額. Variance carry-over amount.<p>
	 *
	 */
	public MCNumber bfw_amt() {
		return getConstNumber(offset + 40, $bfw_amt);
	}

	/**
	 * 差引繰越額. Variance carry-over amount.<p>
	 *
	 */
	public void bfw_amt(MCNumber value) {
		setConstNumber(offset + 40, $bfw_amt, value);
	}
	
	/**
	 * 差引繰越額. Variance carry-over amount.<p>
	 *
	 */
	public void bfw_amt(int value) {
		setConstNumber(offset + 40, $bfw_amt, value);
	}
	
	/**
	 * 差引繰越額. Variance carry-over amount.<p>
	 *
	 */
	public void bfw_amt(long value) {
		setConstNumber(offset + 40, $bfw_amt, value);
	}
	
	/**
	 * 差引繰越額. Variance carry-over amount.<p>
	 *
	 */
	public void bfw_amt(float value) {
		setConstNumber(offset + 40, $bfw_amt, value);
	}
	
	/**
	 * 差引繰越額. Variance carry-over amount.<p>
	 *
	 */
	public void bfw_amt(double value) {
		setConstNumber(offset + 40, $bfw_amt, value);
	}
	
	/**
	 * 今回買上額. Current payment amount.<p>
	 *
	 */
	public MCNumber sls_amt() {
		return getConstNumber(offset + 41, $sls_amt);
	}

	/**
	 * 今回買上額. Current payment amount.<p>
	 *
	 */
	public void sls_amt(MCNumber value) {
		setConstNumber(offset + 41, $sls_amt, value);
	}
	
	/**
	 * 今回買上額. Current payment amount.<p>
	 *
	 */
	public void sls_amt(int value) {
		setConstNumber(offset + 41, $sls_amt, value);
	}
	
	/**
	 * 今回買上額. Current payment amount.<p>
	 *
	 */
	public void sls_amt(long value) {
		setConstNumber(offset + 41, $sls_amt, value);
	}
	
	/**
	 * 今回買上額. Current payment amount.<p>
	 *
	 */
	public void sls_amt(float value) {
		setConstNumber(offset + 41, $sls_amt, value);
	}
	
	/**
	 * 今回買上額. Current payment amount.<p>
	 *
	 */
	public void sls_amt(double value) {
		setConstNumber(offset + 41, $sls_amt, value);
	}
	
	/**
	 * 今回値引額. Current discount amount.<p>
	 *
	 */
	public MCNumber dscnt_amt() {
		return getConstNumber(offset + 42, $dscnt_amt);
	}

	/**
	 * 今回値引額. Current discount amount.<p>
	 *
	 */
	public void dscnt_amt(MCNumber value) {
		setConstNumber(offset + 42, $dscnt_amt, value);
	}
	
	/**
	 * 今回値引額. Current discount amount.<p>
	 *
	 */
	public void dscnt_amt(int value) {
		setConstNumber(offset + 42, $dscnt_amt, value);
	}
	
	/**
	 * 今回値引額. Current discount amount.<p>
	 *
	 */
	public void dscnt_amt(long value) {
		setConstNumber(offset + 42, $dscnt_amt, value);
	}
	
	/**
	 * 今回値引額. Current discount amount.<p>
	 *
	 */
	public void dscnt_amt(float value) {
		setConstNumber(offset + 42, $dscnt_amt, value);
	}
	
	/**
	 * 今回値引額. Current discount amount.<p>
	 *
	 */
	public void dscnt_amt(double value) {
		setConstNumber(offset + 42, $dscnt_amt, value);
	}
	
	/**
	 * 今回返品額. Current return amount.<p>
	 *
	 */
	public MCNumber ret_amt() {
		return getConstNumber(offset + 43, $ret_amt);
	}

	/**
	 * 今回返品額. Current return amount.<p>
	 *
	 */
	public void ret_amt(MCNumber value) {
		setConstNumber(offset + 43, $ret_amt, value);
	}
	
	/**
	 * 今回返品額. Current return amount.<p>
	 *
	 */
	public void ret_amt(int value) {
		setConstNumber(offset + 43, $ret_amt, value);
	}
	
	/**
	 * 今回返品額. Current return amount.<p>
	 *
	 */
	public void ret_amt(long value) {
		setConstNumber(offset + 43, $ret_amt, value);
	}
	
	/**
	 * 今回返品額. Current return amount.<p>
	 *
	 */
	public void ret_amt(float value) {
		setConstNumber(offset + 43, $ret_amt, value);
	}
	
	/**
	 * 今回返品額. Current return amount.<p>
	 *
	 */
	public void ret_amt(double value) {
		setConstNumber(offset + 43, $ret_amt, value);
	}
	
	/**
	 * 今回税額. Current tax amount.<p>
	 *
	 */
	public MCNumber tax_amt() {
		return getConstNumber(offset + 44, $tax_amt);
	}

	/**
	 * 今回税額. Current tax amount.<p>
	 *
	 */
	public void tax_amt(MCNumber value) {
		setConstNumber(offset + 44, $tax_amt, value);
	}
	
	/**
	 * 今回税額. Current tax amount.<p>
	 *
	 */
	public void tax_amt(int value) {
		setConstNumber(offset + 44, $tax_amt, value);
	}
	
	/**
	 * 今回税額. Current tax amount.<p>
	 *
	 */
	public void tax_amt(long value) {
		setConstNumber(offset + 44, $tax_amt, value);
	}
	
	/**
	 * 今回税額. Current tax amount.<p>
	 *
	 */
	public void tax_amt(float value) {
		setConstNumber(offset + 44, $tax_amt, value);
	}
	
	/**
	 * 今回税額. Current tax amount.<p>
	 *
	 */
	public void tax_amt(double value) {
		setConstNumber(offset + 44, $tax_amt, value);
	}
	
	/**
	 * 今回振替額. Current transfer amount.<p>
	 *
	 */
	public MCNumber sw_to_amt() {
		return getConstNumber(offset + 45, $sw_to_amt);
	}

	/**
	 * 今回振替額. Current transfer amount.<p>
	 *
	 */
	public void sw_to_amt(MCNumber value) {
		setConstNumber(offset + 45, $sw_to_amt, value);
	}
	
	/**
	 * 今回振替額. Current transfer amount.<p>
	 *
	 */
	public void sw_to_amt(int value) {
		setConstNumber(offset + 45, $sw_to_amt, value);
	}
	
	/**
	 * 今回振替額. Current transfer amount.<p>
	 *
	 */
	public void sw_to_amt(long value) {
		setConstNumber(offset + 45, $sw_to_amt, value);
	}
	
	/**
	 * 今回振替額. Current transfer amount.<p>
	 *
	 */
	public void sw_to_amt(float value) {
		setConstNumber(offset + 45, $sw_to_amt, value);
	}
	
	/**
	 * 今回振替額. Current transfer amount.<p>
	 *
	 */
	public void sw_to_amt(double value) {
		setConstNumber(offset + 45, $sw_to_amt, value);
	}
	
	/**
	 * 今回請求額. Current billing amount.<p>
	 *
	 */
	public MCNumber bill_amt() {
		return getConstNumber(offset + 46, $bill_amt);
	}

	/**
	 * 今回請求額. Current billing amount.<p>
	 *
	 */
	public void bill_amt(MCNumber value) {
		setConstNumber(offset + 46, $bill_amt, value);
	}
	
	/**
	 * 今回請求額. Current billing amount.<p>
	 *
	 */
	public void bill_amt(int value) {
		setConstNumber(offset + 46, $bill_amt, value);
	}
	
	/**
	 * 今回請求額. Current billing amount.<p>
	 *
	 */
	public void bill_amt(long value) {
		setConstNumber(offset + 46, $bill_amt, value);
	}
	
	/**
	 * 今回請求額. Current billing amount.<p>
	 *
	 */
	public void bill_amt(float value) {
		setConstNumber(offset + 46, $bill_amt, value);
	}
	
	/**
	 * 今回請求額. Current billing amount.<p>
	 *
	 */
	public void bill_amt(double value) {
		setConstNumber(offset + 46, $bill_amt, value);
	}
	
	/**
	 * 税率１. Tax rate 1.<p>
	 *
	 */
	public MCNumber tax_rate1() {
		return getConstNumber(offset + 47, $tax_rate1);
	}

	/**
	 * 税率１. Tax rate 1.<p>
	 *
	 */
	public void tax_rate1(MCNumber value) {
		setConstNumber(offset + 47, $tax_rate1, value);
	}
	
	/**
	 * 税率１. Tax rate 1.<p>
	 *
	 */
	public void tax_rate1(int value) {
		setConstNumber(offset + 47, $tax_rate1, value);
	}
	
	/**
	 * 税率１. Tax rate 1.<p>
	 *
	 */
	public void tax_rate1(long value) {
		setConstNumber(offset + 47, $tax_rate1, value);
	}
	
	/**
	 * 税率１. Tax rate 1.<p>
	 *
	 */
	public void tax_rate1(float value) {
		setConstNumber(offset + 47, $tax_rate1, value);
	}
	
	/**
	 * 税率１. Tax rate 1.<p>
	 *
	 */
	public void tax_rate1(double value) {
		setConstNumber(offset + 47, $tax_rate1, value);
	}
	
	/**
	 * 税率毎買上額１. Purchase amount 1 per tax rate.<p>
	 *
	 */
	public MCNumber tax_rate_sls_amt1() {
		return getConstNumber(offset + 48, $tax_rate_sls_amt1);
	}

	/**
	 * 税率毎買上額１. Purchase amount 1 per tax rate.<p>
	 *
	 */
	public void tax_rate_sls_amt1(MCNumber value) {
		setConstNumber(offset + 48, $tax_rate_sls_amt1, value);
	}
	
	/**
	 * 税率毎買上額１. Purchase amount 1 per tax rate.<p>
	 *
	 */
	public void tax_rate_sls_amt1(int value) {
		setConstNumber(offset + 48, $tax_rate_sls_amt1, value);
	}
	
	/**
	 * 税率毎買上額１. Purchase amount 1 per tax rate.<p>
	 *
	 */
	public void tax_rate_sls_amt1(long value) {
		setConstNumber(offset + 48, $tax_rate_sls_amt1, value);
	}
	
	/**
	 * 税率毎買上額１. Purchase amount 1 per tax rate.<p>
	 *
	 */
	public void tax_rate_sls_amt1(float value) {
		setConstNumber(offset + 48, $tax_rate_sls_amt1, value);
	}
	
	/**
	 * 税率毎買上額１. Purchase amount 1 per tax rate.<p>
	 *
	 */
	public void tax_rate_sls_amt1(double value) {
		setConstNumber(offset + 48, $tax_rate_sls_amt1, value);
	}
	
	/**
	 * 税率毎税額１. Tax amount per tax rate 1.<p>
	 *
	 */
	public MCNumber tax_rate_tax_amt1() {
		return getConstNumber(offset + 49, $tax_rate_tax_amt1);
	}

	/**
	 * 税率毎税額１. Tax amount per tax rate 1.<p>
	 *
	 */
	public void tax_rate_tax_amt1(MCNumber value) {
		setConstNumber(offset + 49, $tax_rate_tax_amt1, value);
	}
	
	/**
	 * 税率毎税額１. Tax amount per tax rate 1.<p>
	 *
	 */
	public void tax_rate_tax_amt1(int value) {
		setConstNumber(offset + 49, $tax_rate_tax_amt1, value);
	}
	
	/**
	 * 税率毎税額１. Tax amount per tax rate 1.<p>
	 *
	 */
	public void tax_rate_tax_amt1(long value) {
		setConstNumber(offset + 49, $tax_rate_tax_amt1, value);
	}
	
	/**
	 * 税率毎税額１. Tax amount per tax rate 1.<p>
	 *
	 */
	public void tax_rate_tax_amt1(float value) {
		setConstNumber(offset + 49, $tax_rate_tax_amt1, value);
	}
	
	/**
	 * 税率毎税額１. Tax amount per tax rate 1.<p>
	 *
	 */
	public void tax_rate_tax_amt1(double value) {
		setConstNumber(offset + 49, $tax_rate_tax_amt1, value);
	}
	
	/**
	 * 税率毎基準通貨税額１. Tax amount (Base currency) per tax rate 1.<p>
	 *
	 */
	public MCNumber tax_rate_base_tax_amt1() {
		return getConstNumber(offset + 50, $tax_rate_base_tax_amt1);
	}

	/**
	 * 税率毎基準通貨税額１. Tax amount (Base currency) per tax rate 1.<p>
	 *
	 */
	public void tax_rate_base_tax_amt1(MCNumber value) {
		setConstNumber(offset + 50, $tax_rate_base_tax_amt1, value);
	}
	
	/**
	 * 税率毎基準通貨税額１. Tax amount (Base currency) per tax rate 1.<p>
	 *
	 */
	public void tax_rate_base_tax_amt1(int value) {
		setConstNumber(offset + 50, $tax_rate_base_tax_amt1, value);
	}
	
	/**
	 * 税率毎基準通貨税額１. Tax amount (Base currency) per tax rate 1.<p>
	 *
	 */
	public void tax_rate_base_tax_amt1(long value) {
		setConstNumber(offset + 50, $tax_rate_base_tax_amt1, value);
	}
	
	/**
	 * 税率毎基準通貨税額１. Tax amount (Base currency) per tax rate 1.<p>
	 *
	 */
	public void tax_rate_base_tax_amt1(float value) {
		setConstNumber(offset + 50, $tax_rate_base_tax_amt1, value);
	}
	
	/**
	 * 税率毎基準通貨税額１. Tax amount (Base currency) per tax rate 1.<p>
	 *
	 */
	public void tax_rate_base_tax_amt1(double value) {
		setConstNumber(offset + 50, $tax_rate_base_tax_amt1, value);
	}
	
	/**
	 * 税率２. Tax rate 2.<p>
	 *
	 */
	public MCNumber tax_rate2() {
		return getConstNumber(offset + 51, $tax_rate2);
	}

	/**
	 * 税率２. Tax rate 2.<p>
	 *
	 */
	public void tax_rate2(MCNumber value) {
		setConstNumber(offset + 51, $tax_rate2, value);
	}
	
	/**
	 * 税率２. Tax rate 2.<p>
	 *
	 */
	public void tax_rate2(int value) {
		setConstNumber(offset + 51, $tax_rate2, value);
	}
	
	/**
	 * 税率２. Tax rate 2.<p>
	 *
	 */
	public void tax_rate2(long value) {
		setConstNumber(offset + 51, $tax_rate2, value);
	}
	
	/**
	 * 税率２. Tax rate 2.<p>
	 *
	 */
	public void tax_rate2(float value) {
		setConstNumber(offset + 51, $tax_rate2, value);
	}
	
	/**
	 * 税率２. Tax rate 2.<p>
	 *
	 */
	public void tax_rate2(double value) {
		setConstNumber(offset + 51, $tax_rate2, value);
	}
	
	/**
	 * 税率毎買上額２. Purchase amount 2 per tax rate.<p>
	 *
	 */
	public MCNumber tax_rate_sls_amt2() {
		return getConstNumber(offset + 52, $tax_rate_sls_amt2);
	}

	/**
	 * 税率毎買上額２. Purchase amount 2 per tax rate.<p>
	 *
	 */
	public void tax_rate_sls_amt2(MCNumber value) {
		setConstNumber(offset + 52, $tax_rate_sls_amt2, value);
	}
	
	/**
	 * 税率毎買上額２. Purchase amount 2 per tax rate.<p>
	 *
	 */
	public void tax_rate_sls_amt2(int value) {
		setConstNumber(offset + 52, $tax_rate_sls_amt2, value);
	}
	
	/**
	 * 税率毎買上額２. Purchase amount 2 per tax rate.<p>
	 *
	 */
	public void tax_rate_sls_amt2(long value) {
		setConstNumber(offset + 52, $tax_rate_sls_amt2, value);
	}
	
	/**
	 * 税率毎買上額２. Purchase amount 2 per tax rate.<p>
	 *
	 */
	public void tax_rate_sls_amt2(float value) {
		setConstNumber(offset + 52, $tax_rate_sls_amt2, value);
	}
	
	/**
	 * 税率毎買上額２. Purchase amount 2 per tax rate.<p>
	 *
	 */
	public void tax_rate_sls_amt2(double value) {
		setConstNumber(offset + 52, $tax_rate_sls_amt2, value);
	}
	
	/**
	 * 税率毎税額２. Tax amount per tax rate 2.<p>
	 *
	 */
	public MCNumber tax_rate_tax_amt2() {
		return getConstNumber(offset + 53, $tax_rate_tax_amt2);
	}

	/**
	 * 税率毎税額２. Tax amount per tax rate 2.<p>
	 *
	 */
	public void tax_rate_tax_amt2(MCNumber value) {
		setConstNumber(offset + 53, $tax_rate_tax_amt2, value);
	}
	
	/**
	 * 税率毎税額２. Tax amount per tax rate 2.<p>
	 *
	 */
	public void tax_rate_tax_amt2(int value) {
		setConstNumber(offset + 53, $tax_rate_tax_amt2, value);
	}
	
	/**
	 * 税率毎税額２. Tax amount per tax rate 2.<p>
	 *
	 */
	public void tax_rate_tax_amt2(long value) {
		setConstNumber(offset + 53, $tax_rate_tax_amt2, value);
	}
	
	/**
	 * 税率毎税額２. Tax amount per tax rate 2.<p>
	 *
	 */
	public void tax_rate_tax_amt2(float value) {
		setConstNumber(offset + 53, $tax_rate_tax_amt2, value);
	}
	
	/**
	 * 税率毎税額２. Tax amount per tax rate 2.<p>
	 *
	 */
	public void tax_rate_tax_amt2(double value) {
		setConstNumber(offset + 53, $tax_rate_tax_amt2, value);
	}
	
	/**
	 * 税率毎基準通貨税額２. Tax amount (Base currency) per tax rate 2.<p>
	 *
	 */
	public MCNumber tax_rate_base_tax_amt2() {
		return getConstNumber(offset + 54, $tax_rate_base_tax_amt2);
	}

	/**
	 * 税率毎基準通貨税額２. Tax amount (Base currency) per tax rate 2.<p>
	 *
	 */
	public void tax_rate_base_tax_amt2(MCNumber value) {
		setConstNumber(offset + 54, $tax_rate_base_tax_amt2, value);
	}
	
	/**
	 * 税率毎基準通貨税額２. Tax amount (Base currency) per tax rate 2.<p>
	 *
	 */
	public void tax_rate_base_tax_amt2(int value) {
		setConstNumber(offset + 54, $tax_rate_base_tax_amt2, value);
	}
	
	/**
	 * 税率毎基準通貨税額２. Tax amount (Base currency) per tax rate 2.<p>
	 *
	 */
	public void tax_rate_base_tax_amt2(long value) {
		setConstNumber(offset + 54, $tax_rate_base_tax_amt2, value);
	}
	
	/**
	 * 税率毎基準通貨税額２. Tax amount (Base currency) per tax rate 2.<p>
	 *
	 */
	public void tax_rate_base_tax_amt2(float value) {
		setConstNumber(offset + 54, $tax_rate_base_tax_amt2, value);
	}
	
	/**
	 * 税率毎基準通貨税額２. Tax amount (Base currency) per tax rate 2.<p>
	 *
	 */
	public void tax_rate_base_tax_amt2(double value) {
		setConstNumber(offset + 54, $tax_rate_base_tax_amt2, value);
	}
	
	/**
	 * 税率３. Tax rate 3.<p>
	 *
	 */
	public MCNumber tax_rate3() {
		return getConstNumber(offset + 55, $tax_rate3);
	}

	/**
	 * 税率３. Tax rate 3.<p>
	 *
	 */
	public void tax_rate3(MCNumber value) {
		setConstNumber(offset + 55, $tax_rate3, value);
	}
	
	/**
	 * 税率３. Tax rate 3.<p>
	 *
	 */
	public void tax_rate3(int value) {
		setConstNumber(offset + 55, $tax_rate3, value);
	}
	
	/**
	 * 税率３. Tax rate 3.<p>
	 *
	 */
	public void tax_rate3(long value) {
		setConstNumber(offset + 55, $tax_rate3, value);
	}
	
	/**
	 * 税率３. Tax rate 3.<p>
	 *
	 */
	public void tax_rate3(float value) {
		setConstNumber(offset + 55, $tax_rate3, value);
	}
	
	/**
	 * 税率３. Tax rate 3.<p>
	 *
	 */
	public void tax_rate3(double value) {
		setConstNumber(offset + 55, $tax_rate3, value);
	}
	
	/**
	 * 税率毎買上額３. Purchase amount 3 per tax rate.<p>
	 *
	 */
	public MCNumber tax_rate_sls_amt3() {
		return getConstNumber(offset + 56, $tax_rate_sls_amt3);
	}

	/**
	 * 税率毎買上額３. Purchase amount 3 per tax rate.<p>
	 *
	 */
	public void tax_rate_sls_amt3(MCNumber value) {
		setConstNumber(offset + 56, $tax_rate_sls_amt3, value);
	}
	
	/**
	 * 税率毎買上額３. Purchase amount 3 per tax rate.<p>
	 *
	 */
	public void tax_rate_sls_amt3(int value) {
		setConstNumber(offset + 56, $tax_rate_sls_amt3, value);
	}
	
	/**
	 * 税率毎買上額３. Purchase amount 3 per tax rate.<p>
	 *
	 */
	public void tax_rate_sls_amt3(long value) {
		setConstNumber(offset + 56, $tax_rate_sls_amt3, value);
	}
	
	/**
	 * 税率毎買上額３. Purchase amount 3 per tax rate.<p>
	 *
	 */
	public void tax_rate_sls_amt3(float value) {
		setConstNumber(offset + 56, $tax_rate_sls_amt3, value);
	}
	
	/**
	 * 税率毎買上額３. Purchase amount 3 per tax rate.<p>
	 *
	 */
	public void tax_rate_sls_amt3(double value) {
		setConstNumber(offset + 56, $tax_rate_sls_amt3, value);
	}
	
	/**
	 * 税率毎税額３. Tax amount per tax rate 3.<p>
	 *
	 */
	public MCNumber tax_rate_tax_amt3() {
		return getConstNumber(offset + 57, $tax_rate_tax_amt3);
	}

	/**
	 * 税率毎税額３. Tax amount per tax rate 3.<p>
	 *
	 */
	public void tax_rate_tax_amt3(MCNumber value) {
		setConstNumber(offset + 57, $tax_rate_tax_amt3, value);
	}
	
	/**
	 * 税率毎税額３. Tax amount per tax rate 3.<p>
	 *
	 */
	public void tax_rate_tax_amt3(int value) {
		setConstNumber(offset + 57, $tax_rate_tax_amt3, value);
	}
	
	/**
	 * 税率毎税額３. Tax amount per tax rate 3.<p>
	 *
	 */
	public void tax_rate_tax_amt3(long value) {
		setConstNumber(offset + 57, $tax_rate_tax_amt3, value);
	}
	
	/**
	 * 税率毎税額３. Tax amount per tax rate 3.<p>
	 *
	 */
	public void tax_rate_tax_amt3(float value) {
		setConstNumber(offset + 57, $tax_rate_tax_amt3, value);
	}
	
	/**
	 * 税率毎税額３. Tax amount per tax rate 3.<p>
	 *
	 */
	public void tax_rate_tax_amt3(double value) {
		setConstNumber(offset + 57, $tax_rate_tax_amt3, value);
	}
	
	/**
	 * 税率毎基準通貨税額３. Tax amount (Base currency) per tax rate 3.<p>
	 *
	 */
	public MCNumber tax_rate_base_tax_amt3() {
		return getConstNumber(offset + 58, $tax_rate_base_tax_amt3);
	}

	/**
	 * 税率毎基準通貨税額３. Tax amount (Base currency) per tax rate 3.<p>
	 *
	 */
	public void tax_rate_base_tax_amt3(MCNumber value) {
		setConstNumber(offset + 58, $tax_rate_base_tax_amt3, value);
	}
	
	/**
	 * 税率毎基準通貨税額３. Tax amount (Base currency) per tax rate 3.<p>
	 *
	 */
	public void tax_rate_base_tax_amt3(int value) {
		setConstNumber(offset + 58, $tax_rate_base_tax_amt3, value);
	}
	
	/**
	 * 税率毎基準通貨税額３. Tax amount (Base currency) per tax rate 3.<p>
	 *
	 */
	public void tax_rate_base_tax_amt3(long value) {
		setConstNumber(offset + 58, $tax_rate_base_tax_amt3, value);
	}
	
	/**
	 * 税率毎基準通貨税額３. Tax amount (Base currency) per tax rate 3.<p>
	 *
	 */
	public void tax_rate_base_tax_amt3(float value) {
		setConstNumber(offset + 58, $tax_rate_base_tax_amt3, value);
	}
	
	/**
	 * 税率毎基準通貨税額３. Tax amount (Base currency) per tax rate 3.<p>
	 *
	 */
	public void tax_rate_base_tax_amt3(double value) {
		setConstNumber(offset + 58, $tax_rate_base_tax_amt3, value);
	}
	
	/**
	 * 税率４. Tax rate 4.<p>
	 *
	 */
	public MCNumber tax_rate4() {
		return getConstNumber(offset + 59, $tax_rate4);
	}

	/**
	 * 税率４. Tax rate 4.<p>
	 *
	 */
	public void tax_rate4(MCNumber value) {
		setConstNumber(offset + 59, $tax_rate4, value);
	}
	
	/**
	 * 税率４. Tax rate 4.<p>
	 *
	 */
	public void tax_rate4(int value) {
		setConstNumber(offset + 59, $tax_rate4, value);
	}
	
	/**
	 * 税率４. Tax rate 4.<p>
	 *
	 */
	public void tax_rate4(long value) {
		setConstNumber(offset + 59, $tax_rate4, value);
	}
	
	/**
	 * 税率４. Tax rate 4.<p>
	 *
	 */
	public void tax_rate4(float value) {
		setConstNumber(offset + 59, $tax_rate4, value);
	}
	
	/**
	 * 税率４. Tax rate 4.<p>
	 *
	 */
	public void tax_rate4(double value) {
		setConstNumber(offset + 59, $tax_rate4, value);
	}
	
	/**
	 * 税率毎買上額４. Purchase amount 4 per tax rate.<p>
	 *
	 */
	public MCNumber tax_rate_sls_amt4() {
		return getConstNumber(offset + 60, $tax_rate_sls_amt4);
	}

	/**
	 * 税率毎買上額４. Purchase amount 4 per tax rate.<p>
	 *
	 */
	public void tax_rate_sls_amt4(MCNumber value) {
		setConstNumber(offset + 60, $tax_rate_sls_amt4, value);
	}
	
	/**
	 * 税率毎買上額４. Purchase amount 4 per tax rate.<p>
	 *
	 */
	public void tax_rate_sls_amt4(int value) {
		setConstNumber(offset + 60, $tax_rate_sls_amt4, value);
	}
	
	/**
	 * 税率毎買上額４. Purchase amount 4 per tax rate.<p>
	 *
	 */
	public void tax_rate_sls_amt4(long value) {
		setConstNumber(offset + 60, $tax_rate_sls_amt4, value);
	}
	
	/**
	 * 税率毎買上額４. Purchase amount 4 per tax rate.<p>
	 *
	 */
	public void tax_rate_sls_amt4(float value) {
		setConstNumber(offset + 60, $tax_rate_sls_amt4, value);
	}
	
	/**
	 * 税率毎買上額４. Purchase amount 4 per tax rate.<p>
	 *
	 */
	public void tax_rate_sls_amt4(double value) {
		setConstNumber(offset + 60, $tax_rate_sls_amt4, value);
	}
	
	/**
	 * 税率毎税額４. Tax amount per tax rate 4.<p>
	 *
	 */
	public MCNumber tax_rate_tax_amt4() {
		return getConstNumber(offset + 61, $tax_rate_tax_amt4);
	}

	/**
	 * 税率毎税額４. Tax amount per tax rate 4.<p>
	 *
	 */
	public void tax_rate_tax_amt4(MCNumber value) {
		setConstNumber(offset + 61, $tax_rate_tax_amt4, value);
	}
	
	/**
	 * 税率毎税額４. Tax amount per tax rate 4.<p>
	 *
	 */
	public void tax_rate_tax_amt4(int value) {
		setConstNumber(offset + 61, $tax_rate_tax_amt4, value);
	}
	
	/**
	 * 税率毎税額４. Tax amount per tax rate 4.<p>
	 *
	 */
	public void tax_rate_tax_amt4(long value) {
		setConstNumber(offset + 61, $tax_rate_tax_amt4, value);
	}
	
	/**
	 * 税率毎税額４. Tax amount per tax rate 4.<p>
	 *
	 */
	public void tax_rate_tax_amt4(float value) {
		setConstNumber(offset + 61, $tax_rate_tax_amt4, value);
	}
	
	/**
	 * 税率毎税額４. Tax amount per tax rate 4.<p>
	 *
	 */
	public void tax_rate_tax_amt4(double value) {
		setConstNumber(offset + 61, $tax_rate_tax_amt4, value);
	}
	
	/**
	 * 税率毎基準通貨税額４. Tax amount (Base currency) per tax rate 4.<p>
	 *
	 */
	public MCNumber tax_rate_base_tax_amt4() {
		return getConstNumber(offset + 62, $tax_rate_base_tax_amt4);
	}

	/**
	 * 税率毎基準通貨税額４. Tax amount (Base currency) per tax rate 4.<p>
	 *
	 */
	public void tax_rate_base_tax_amt4(MCNumber value) {
		setConstNumber(offset + 62, $tax_rate_base_tax_amt4, value);
	}
	
	/**
	 * 税率毎基準通貨税額４. Tax amount (Base currency) per tax rate 4.<p>
	 *
	 */
	public void tax_rate_base_tax_amt4(int value) {
		setConstNumber(offset + 62, $tax_rate_base_tax_amt4, value);
	}
	
	/**
	 * 税率毎基準通貨税額４. Tax amount (Base currency) per tax rate 4.<p>
	 *
	 */
	public void tax_rate_base_tax_amt4(long value) {
		setConstNumber(offset + 62, $tax_rate_base_tax_amt4, value);
	}
	
	/**
	 * 税率毎基準通貨税額４. Tax amount (Base currency) per tax rate 4.<p>
	 *
	 */
	public void tax_rate_base_tax_amt4(float value) {
		setConstNumber(offset + 62, $tax_rate_base_tax_amt4, value);
	}
	
	/**
	 * 税率毎基準通貨税額４. Tax amount (Base currency) per tax rate 4.<p>
	 *
	 */
	public void tax_rate_base_tax_amt4(double value) {
		setConstNumber(offset + 62, $tax_rate_base_tax_amt4, value);
	}
	
	/**
	 * 税率５. Tax rate 5.<p>
	 *
	 */
	public MCNumber tax_rate5() {
		return getConstNumber(offset + 63, $tax_rate5);
	}

	/**
	 * 税率５. Tax rate 5.<p>
	 *
	 */
	public void tax_rate5(MCNumber value) {
		setConstNumber(offset + 63, $tax_rate5, value);
	}
	
	/**
	 * 税率５. Tax rate 5.<p>
	 *
	 */
	public void tax_rate5(int value) {
		setConstNumber(offset + 63, $tax_rate5, value);
	}
	
	/**
	 * 税率５. Tax rate 5.<p>
	 *
	 */
	public void tax_rate5(long value) {
		setConstNumber(offset + 63, $tax_rate5, value);
	}
	
	/**
	 * 税率５. Tax rate 5.<p>
	 *
	 */
	public void tax_rate5(float value) {
		setConstNumber(offset + 63, $tax_rate5, value);
	}
	
	/**
	 * 税率５. Tax rate 5.<p>
	 *
	 */
	public void tax_rate5(double value) {
		setConstNumber(offset + 63, $tax_rate5, value);
	}
	
	/**
	 * 税率毎買上額５. Purchase amount 5 per tax rate.<p>
	 *
	 */
	public MCNumber tax_rate_sls_amt5() {
		return getConstNumber(offset + 64, $tax_rate_sls_amt5);
	}

	/**
	 * 税率毎買上額５. Purchase amount 5 per tax rate.<p>
	 *
	 */
	public void tax_rate_sls_amt5(MCNumber value) {
		setConstNumber(offset + 64, $tax_rate_sls_amt5, value);
	}
	
	/**
	 * 税率毎買上額５. Purchase amount 5 per tax rate.<p>
	 *
	 */
	public void tax_rate_sls_amt5(int value) {
		setConstNumber(offset + 64, $tax_rate_sls_amt5, value);
	}
	
	/**
	 * 税率毎買上額５. Purchase amount 5 per tax rate.<p>
	 *
	 */
	public void tax_rate_sls_amt5(long value) {
		setConstNumber(offset + 64, $tax_rate_sls_amt5, value);
	}
	
	/**
	 * 税率毎買上額５. Purchase amount 5 per tax rate.<p>
	 *
	 */
	public void tax_rate_sls_amt5(float value) {
		setConstNumber(offset + 64, $tax_rate_sls_amt5, value);
	}
	
	/**
	 * 税率毎買上額５. Purchase amount 5 per tax rate.<p>
	 *
	 */
	public void tax_rate_sls_amt5(double value) {
		setConstNumber(offset + 64, $tax_rate_sls_amt5, value);
	}
	
	/**
	 * 税率毎税額５. Tax amount per tax rate 5.<p>
	 *
	 */
	public MCNumber tax_rate_tax_amt5() {
		return getConstNumber(offset + 65, $tax_rate_tax_amt5);
	}

	/**
	 * 税率毎税額５. Tax amount per tax rate 5.<p>
	 *
	 */
	public void tax_rate_tax_amt5(MCNumber value) {
		setConstNumber(offset + 65, $tax_rate_tax_amt5, value);
	}
	
	/**
	 * 税率毎税額５. Tax amount per tax rate 5.<p>
	 *
	 */
	public void tax_rate_tax_amt5(int value) {
		setConstNumber(offset + 65, $tax_rate_tax_amt5, value);
	}
	
	/**
	 * 税率毎税額５. Tax amount per tax rate 5.<p>
	 *
	 */
	public void tax_rate_tax_amt5(long value) {
		setConstNumber(offset + 65, $tax_rate_tax_amt5, value);
	}
	
	/**
	 * 税率毎税額５. Tax amount per tax rate 5.<p>
	 *
	 */
	public void tax_rate_tax_amt5(float value) {
		setConstNumber(offset + 65, $tax_rate_tax_amt5, value);
	}
	
	/**
	 * 税率毎税額５. Tax amount per tax rate 5.<p>
	 *
	 */
	public void tax_rate_tax_amt5(double value) {
		setConstNumber(offset + 65, $tax_rate_tax_amt5, value);
	}
	
	/**
	 * 税率毎基準通貨税額５. Tax amount (Base currency) per tax rate 5.<p>
	 *
	 */
	public MCNumber tax_rate_base_tax_amt5() {
		return getConstNumber(offset + 66, $tax_rate_base_tax_amt5);
	}

	/**
	 * 税率毎基準通貨税額５. Tax amount (Base currency) per tax rate 5.<p>
	 *
	 */
	public void tax_rate_base_tax_amt5(MCNumber value) {
		setConstNumber(offset + 66, $tax_rate_base_tax_amt5, value);
	}
	
	/**
	 * 税率毎基準通貨税額５. Tax amount (Base currency) per tax rate 5.<p>
	 *
	 */
	public void tax_rate_base_tax_amt5(int value) {
		setConstNumber(offset + 66, $tax_rate_base_tax_amt5, value);
	}
	
	/**
	 * 税率毎基準通貨税額５. Tax amount (Base currency) per tax rate 5.<p>
	 *
	 */
	public void tax_rate_base_tax_amt5(long value) {
		setConstNumber(offset + 66, $tax_rate_base_tax_amt5, value);
	}
	
	/**
	 * 税率毎基準通貨税額５. Tax amount (Base currency) per tax rate 5.<p>
	 *
	 */
	public void tax_rate_base_tax_amt5(float value) {
		setConstNumber(offset + 66, $tax_rate_base_tax_amt5, value);
	}
	
	/**
	 * 税率毎基準通貨税額５. Tax amount (Base currency) per tax rate 5.<p>
	 *
	 */
	public void tax_rate_base_tax_amt5(double value) {
		setConstNumber(offset + 66, $tax_rate_base_tax_amt5, value);
	}
	
	/**
	 * 税率６. Tax rate 6.<p>
	 *
	 */
	public MCNumber tax_rate6() {
		return getConstNumber(offset + 67, $tax_rate6);
	}

	/**
	 * 税率６. Tax rate 6.<p>
	 *
	 */
	public void tax_rate6(MCNumber value) {
		setConstNumber(offset + 67, $tax_rate6, value);
	}
	
	/**
	 * 税率６. Tax rate 6.<p>
	 *
	 */
	public void tax_rate6(int value) {
		setConstNumber(offset + 67, $tax_rate6, value);
	}
	
	/**
	 * 税率６. Tax rate 6.<p>
	 *
	 */
	public void tax_rate6(long value) {
		setConstNumber(offset + 67, $tax_rate6, value);
	}
	
	/**
	 * 税率６. Tax rate 6.<p>
	 *
	 */
	public void tax_rate6(float value) {
		setConstNumber(offset + 67, $tax_rate6, value);
	}
	
	/**
	 * 税率６. Tax rate 6.<p>
	 *
	 */
	public void tax_rate6(double value) {
		setConstNumber(offset + 67, $tax_rate6, value);
	}
	
	/**
	 * 税率毎買上額６. Purchase amount 6 per tax rate.<p>
	 *
	 */
	public MCNumber tax_rate_sls_amt6() {
		return getConstNumber(offset + 68, $tax_rate_sls_amt6);
	}

	/**
	 * 税率毎買上額６. Purchase amount 6 per tax rate.<p>
	 *
	 */
	public void tax_rate_sls_amt6(MCNumber value) {
		setConstNumber(offset + 68, $tax_rate_sls_amt6, value);
	}
	
	/**
	 * 税率毎買上額６. Purchase amount 6 per tax rate.<p>
	 *
	 */
	public void tax_rate_sls_amt6(int value) {
		setConstNumber(offset + 68, $tax_rate_sls_amt6, value);
	}
	
	/**
	 * 税率毎買上額６. Purchase amount 6 per tax rate.<p>
	 *
	 */
	public void tax_rate_sls_amt6(long value) {
		setConstNumber(offset + 68, $tax_rate_sls_amt6, value);
	}
	
	/**
	 * 税率毎買上額６. Purchase amount 6 per tax rate.<p>
	 *
	 */
	public void tax_rate_sls_amt6(float value) {
		setConstNumber(offset + 68, $tax_rate_sls_amt6, value);
	}
	
	/**
	 * 税率毎買上額６. Purchase amount 6 per tax rate.<p>
	 *
	 */
	public void tax_rate_sls_amt6(double value) {
		setConstNumber(offset + 68, $tax_rate_sls_amt6, value);
	}
	
	/**
	 * 税率毎税額６. Tax amount per tax rate 6.<p>
	 *
	 */
	public MCNumber tax_rate_tax_amt6() {
		return getConstNumber(offset + 69, $tax_rate_tax_amt6);
	}

	/**
	 * 税率毎税額６. Tax amount per tax rate 6.<p>
	 *
	 */
	public void tax_rate_tax_amt6(MCNumber value) {
		setConstNumber(offset + 69, $tax_rate_tax_amt6, value);
	}
	
	/**
	 * 税率毎税額６. Tax amount per tax rate 6.<p>
	 *
	 */
	public void tax_rate_tax_amt6(int value) {
		setConstNumber(offset + 69, $tax_rate_tax_amt6, value);
	}
	
	/**
	 * 税率毎税額６. Tax amount per tax rate 6.<p>
	 *
	 */
	public void tax_rate_tax_amt6(long value) {
		setConstNumber(offset + 69, $tax_rate_tax_amt6, value);
	}
	
	/**
	 * 税率毎税額６. Tax amount per tax rate 6.<p>
	 *
	 */
	public void tax_rate_tax_amt6(float value) {
		setConstNumber(offset + 69, $tax_rate_tax_amt6, value);
	}
	
	/**
	 * 税率毎税額６. Tax amount per tax rate 6.<p>
	 *
	 */
	public void tax_rate_tax_amt6(double value) {
		setConstNumber(offset + 69, $tax_rate_tax_amt6, value);
	}
	
	/**
	 * 税率毎基準通貨税額６. Tax amount (Base currency) per tax rate 6.<p>
	 *
	 */
	public MCNumber tax_rate_base_tax_amt6() {
		return getConstNumber(offset + 70, $tax_rate_base_tax_amt6);
	}

	/**
	 * 税率毎基準通貨税額６. Tax amount (Base currency) per tax rate 6.<p>
	 *
	 */
	public void tax_rate_base_tax_amt6(MCNumber value) {
		setConstNumber(offset + 70, $tax_rate_base_tax_amt6, value);
	}
	
	/**
	 * 税率毎基準通貨税額６. Tax amount (Base currency) per tax rate 6.<p>
	 *
	 */
	public void tax_rate_base_tax_amt6(int value) {
		setConstNumber(offset + 70, $tax_rate_base_tax_amt6, value);
	}
	
	/**
	 * 税率毎基準通貨税額６. Tax amount (Base currency) per tax rate 6.<p>
	 *
	 */
	public void tax_rate_base_tax_amt6(long value) {
		setConstNumber(offset + 70, $tax_rate_base_tax_amt6, value);
	}
	
	/**
	 * 税率毎基準通貨税額６. Tax amount (Base currency) per tax rate 6.<p>
	 *
	 */
	public void tax_rate_base_tax_amt6(float value) {
		setConstNumber(offset + 70, $tax_rate_base_tax_amt6, value);
	}
	
	/**
	 * 税率毎基準通貨税額６. Tax amount (Base currency) per tax rate 6.<p>
	 *
	 */
	public void tax_rate_base_tax_amt6(double value) {
		setConstNumber(offset + 70, $tax_rate_base_tax_amt6, value);
	}
	
	/**
	 * 税率７. Tax rate 7.<p>
	 *
	 */
	public MCNumber tax_rate7() {
		return getConstNumber(offset + 71, $tax_rate7);
	}

	/**
	 * 税率７. Tax rate 7.<p>
	 *
	 */
	public void tax_rate7(MCNumber value) {
		setConstNumber(offset + 71, $tax_rate7, value);
	}
	
	/**
	 * 税率７. Tax rate 7.<p>
	 *
	 */
	public void tax_rate7(int value) {
		setConstNumber(offset + 71, $tax_rate7, value);
	}
	
	/**
	 * 税率７. Tax rate 7.<p>
	 *
	 */
	public void tax_rate7(long value) {
		setConstNumber(offset + 71, $tax_rate7, value);
	}
	
	/**
	 * 税率７. Tax rate 7.<p>
	 *
	 */
	public void tax_rate7(float value) {
		setConstNumber(offset + 71, $tax_rate7, value);
	}
	
	/**
	 * 税率７. Tax rate 7.<p>
	 *
	 */
	public void tax_rate7(double value) {
		setConstNumber(offset + 71, $tax_rate7, value);
	}
	
	/**
	 * 税率毎買上額７. Purchase amount 7 per tax rate.<p>
	 *
	 */
	public MCNumber tax_rate_sls_amt7() {
		return getConstNumber(offset + 72, $tax_rate_sls_amt7);
	}

	/**
	 * 税率毎買上額７. Purchase amount 7 per tax rate.<p>
	 *
	 */
	public void tax_rate_sls_amt7(MCNumber value) {
		setConstNumber(offset + 72, $tax_rate_sls_amt7, value);
	}
	
	/**
	 * 税率毎買上額７. Purchase amount 7 per tax rate.<p>
	 *
	 */
	public void tax_rate_sls_amt7(int value) {
		setConstNumber(offset + 72, $tax_rate_sls_amt7, value);
	}
	
	/**
	 * 税率毎買上額７. Purchase amount 7 per tax rate.<p>
	 *
	 */
	public void tax_rate_sls_amt7(long value) {
		setConstNumber(offset + 72, $tax_rate_sls_amt7, value);
	}
	
	/**
	 * 税率毎買上額７. Purchase amount 7 per tax rate.<p>
	 *
	 */
	public void tax_rate_sls_amt7(float value) {
		setConstNumber(offset + 72, $tax_rate_sls_amt7, value);
	}
	
	/**
	 * 税率毎買上額７. Purchase amount 7 per tax rate.<p>
	 *
	 */
	public void tax_rate_sls_amt7(double value) {
		setConstNumber(offset + 72, $tax_rate_sls_amt7, value);
	}
	
	/**
	 * 税率毎税額７. Tax amount per tax rate 7.<p>
	 *
	 */
	public MCNumber tax_rate_tax_amt7() {
		return getConstNumber(offset + 73, $tax_rate_tax_amt7);
	}

	/**
	 * 税率毎税額７. Tax amount per tax rate 7.<p>
	 *
	 */
	public void tax_rate_tax_amt7(MCNumber value) {
		setConstNumber(offset + 73, $tax_rate_tax_amt7, value);
	}
	
	/**
	 * 税率毎税額７. Tax amount per tax rate 7.<p>
	 *
	 */
	public void tax_rate_tax_amt7(int value) {
		setConstNumber(offset + 73, $tax_rate_tax_amt7, value);
	}
	
	/**
	 * 税率毎税額７. Tax amount per tax rate 7.<p>
	 *
	 */
	public void tax_rate_tax_amt7(long value) {
		setConstNumber(offset + 73, $tax_rate_tax_amt7, value);
	}
	
	/**
	 * 税率毎税額７. Tax amount per tax rate 7.<p>
	 *
	 */
	public void tax_rate_tax_amt7(float value) {
		setConstNumber(offset + 73, $tax_rate_tax_amt7, value);
	}
	
	/**
	 * 税率毎税額７. Tax amount per tax rate 7.<p>
	 *
	 */
	public void tax_rate_tax_amt7(double value) {
		setConstNumber(offset + 73, $tax_rate_tax_amt7, value);
	}
	
	/**
	 * 税率毎基準通貨税額７. Tax amount (Base currency) per tax rate 7.<p>
	 *
	 */
	public MCNumber tax_rate_base_tax_amt7() {
		return getConstNumber(offset + 74, $tax_rate_base_tax_amt7);
	}

	/**
	 * 税率毎基準通貨税額７. Tax amount (Base currency) per tax rate 7.<p>
	 *
	 */
	public void tax_rate_base_tax_amt7(MCNumber value) {
		setConstNumber(offset + 74, $tax_rate_base_tax_amt7, value);
	}
	
	/**
	 * 税率毎基準通貨税額７. Tax amount (Base currency) per tax rate 7.<p>
	 *
	 */
	public void tax_rate_base_tax_amt7(int value) {
		setConstNumber(offset + 74, $tax_rate_base_tax_amt7, value);
	}
	
	/**
	 * 税率毎基準通貨税額７. Tax amount (Base currency) per tax rate 7.<p>
	 *
	 */
	public void tax_rate_base_tax_amt7(long value) {
		setConstNumber(offset + 74, $tax_rate_base_tax_amt7, value);
	}
	
	/**
	 * 税率毎基準通貨税額７. Tax amount (Base currency) per tax rate 7.<p>
	 *
	 */
	public void tax_rate_base_tax_amt7(float value) {
		setConstNumber(offset + 74, $tax_rate_base_tax_amt7, value);
	}
	
	/**
	 * 税率毎基準通貨税額７. Tax amount (Base currency) per tax rate 7.<p>
	 *
	 */
	public void tax_rate_base_tax_amt7(double value) {
		setConstNumber(offset + 74, $tax_rate_base_tax_amt7, value);
	}
	
	/**
	 * 税率８. Tax rate 8.<p>
	 *
	 */
	public MCNumber tax_rate8() {
		return getConstNumber(offset + 75, $tax_rate8);
	}

	/**
	 * 税率８. Tax rate 8.<p>
	 *
	 */
	public void tax_rate8(MCNumber value) {
		setConstNumber(offset + 75, $tax_rate8, value);
	}
	
	/**
	 * 税率８. Tax rate 8.<p>
	 *
	 */
	public void tax_rate8(int value) {
		setConstNumber(offset + 75, $tax_rate8, value);
	}
	
	/**
	 * 税率８. Tax rate 8.<p>
	 *
	 */
	public void tax_rate8(long value) {
		setConstNumber(offset + 75, $tax_rate8, value);
	}
	
	/**
	 * 税率８. Tax rate 8.<p>
	 *
	 */
	public void tax_rate8(float value) {
		setConstNumber(offset + 75, $tax_rate8, value);
	}
	
	/**
	 * 税率８. Tax rate 8.<p>
	 *
	 */
	public void tax_rate8(double value) {
		setConstNumber(offset + 75, $tax_rate8, value);
	}
	
	/**
	 * 税率毎買上額８. Purchase amount 8 per tax rate.<p>
	 *
	 */
	public MCNumber tax_rate_sls_amt8() {
		return getConstNumber(offset + 76, $tax_rate_sls_amt8);
	}

	/**
	 * 税率毎買上額８. Purchase amount 8 per tax rate.<p>
	 *
	 */
	public void tax_rate_sls_amt8(MCNumber value) {
		setConstNumber(offset + 76, $tax_rate_sls_amt8, value);
	}
	
	/**
	 * 税率毎買上額８. Purchase amount 8 per tax rate.<p>
	 *
	 */
	public void tax_rate_sls_amt8(int value) {
		setConstNumber(offset + 76, $tax_rate_sls_amt8, value);
	}
	
	/**
	 * 税率毎買上額８. Purchase amount 8 per tax rate.<p>
	 *
	 */
	public void tax_rate_sls_amt8(long value) {
		setConstNumber(offset + 76, $tax_rate_sls_amt8, value);
	}
	
	/**
	 * 税率毎買上額８. Purchase amount 8 per tax rate.<p>
	 *
	 */
	public void tax_rate_sls_amt8(float value) {
		setConstNumber(offset + 76, $tax_rate_sls_amt8, value);
	}
	
	/**
	 * 税率毎買上額８. Purchase amount 8 per tax rate.<p>
	 *
	 */
	public void tax_rate_sls_amt8(double value) {
		setConstNumber(offset + 76, $tax_rate_sls_amt8, value);
	}
	
	/**
	 * 税率毎税額８. Tax amount per tax rate 8.<p>
	 *
	 */
	public MCNumber tax_rate_tax_amt8() {
		return getConstNumber(offset + 77, $tax_rate_tax_amt8);
	}

	/**
	 * 税率毎税額８. Tax amount per tax rate 8.<p>
	 *
	 */
	public void tax_rate_tax_amt8(MCNumber value) {
		setConstNumber(offset + 77, $tax_rate_tax_amt8, value);
	}
	
	/**
	 * 税率毎税額８. Tax amount per tax rate 8.<p>
	 *
	 */
	public void tax_rate_tax_amt8(int value) {
		setConstNumber(offset + 77, $tax_rate_tax_amt8, value);
	}
	
	/**
	 * 税率毎税額８. Tax amount per tax rate 8.<p>
	 *
	 */
	public void tax_rate_tax_amt8(long value) {
		setConstNumber(offset + 77, $tax_rate_tax_amt8, value);
	}
	
	/**
	 * 税率毎税額８. Tax amount per tax rate 8.<p>
	 *
	 */
	public void tax_rate_tax_amt8(float value) {
		setConstNumber(offset + 77, $tax_rate_tax_amt8, value);
	}
	
	/**
	 * 税率毎税額８. Tax amount per tax rate 8.<p>
	 *
	 */
	public void tax_rate_tax_amt8(double value) {
		setConstNumber(offset + 77, $tax_rate_tax_amt8, value);
	}
	
	/**
	 * 税率毎基準通貨税額８. Tax amount (Base currency) per tax rate 8.<p>
	 *
	 */
	public MCNumber tax_rate_base_tax_amt8() {
		return getConstNumber(offset + 78, $tax_rate_base_tax_amt8);
	}

	/**
	 * 税率毎基準通貨税額８. Tax amount (Base currency) per tax rate 8.<p>
	 *
	 */
	public void tax_rate_base_tax_amt8(MCNumber value) {
		setConstNumber(offset + 78, $tax_rate_base_tax_amt8, value);
	}
	
	/**
	 * 税率毎基準通貨税額８. Tax amount (Base currency) per tax rate 8.<p>
	 *
	 */
	public void tax_rate_base_tax_amt8(int value) {
		setConstNumber(offset + 78, $tax_rate_base_tax_amt8, value);
	}
	
	/**
	 * 税率毎基準通貨税額８. Tax amount (Base currency) per tax rate 8.<p>
	 *
	 */
	public void tax_rate_base_tax_amt8(long value) {
		setConstNumber(offset + 78, $tax_rate_base_tax_amt8, value);
	}
	
	/**
	 * 税率毎基準通貨税額８. Tax amount (Base currency) per tax rate 8.<p>
	 *
	 */
	public void tax_rate_base_tax_amt8(float value) {
		setConstNumber(offset + 78, $tax_rate_base_tax_amt8, value);
	}
	
	/**
	 * 税率毎基準通貨税額８. Tax amount (Base currency) per tax rate 8.<p>
	 *
	 */
	public void tax_rate_base_tax_amt8(double value) {
		setConstNumber(offset + 78, $tax_rate_base_tax_amt8, value);
	}
	
	/**
	 * 税率９. Tax rate 9.<p>
	 *
	 */
	public MCNumber tax_rate9() {
		return getConstNumber(offset + 79, $tax_rate9);
	}

	/**
	 * 税率９. Tax rate 9.<p>
	 *
	 */
	public void tax_rate9(MCNumber value) {
		setConstNumber(offset + 79, $tax_rate9, value);
	}
	
	/**
	 * 税率９. Tax rate 9.<p>
	 *
	 */
	public void tax_rate9(int value) {
		setConstNumber(offset + 79, $tax_rate9, value);
	}
	
	/**
	 * 税率９. Tax rate 9.<p>
	 *
	 */
	public void tax_rate9(long value) {
		setConstNumber(offset + 79, $tax_rate9, value);
	}
	
	/**
	 * 税率９. Tax rate 9.<p>
	 *
	 */
	public void tax_rate9(float value) {
		setConstNumber(offset + 79, $tax_rate9, value);
	}
	
	/**
	 * 税率９. Tax rate 9.<p>
	 *
	 */
	public void tax_rate9(double value) {
		setConstNumber(offset + 79, $tax_rate9, value);
	}
	
	/**
	 * 税率毎買上額９. Purchase amount 9 per tax rate.<p>
	 *
	 */
	public MCNumber tax_rate_sls_amt9() {
		return getConstNumber(offset + 80, $tax_rate_sls_amt9);
	}

	/**
	 * 税率毎買上額９. Purchase amount 9 per tax rate.<p>
	 *
	 */
	public void tax_rate_sls_amt9(MCNumber value) {
		setConstNumber(offset + 80, $tax_rate_sls_amt9, value);
	}
	
	/**
	 * 税率毎買上額９. Purchase amount 9 per tax rate.<p>
	 *
	 */
	public void tax_rate_sls_amt9(int value) {
		setConstNumber(offset + 80, $tax_rate_sls_amt9, value);
	}
	
	/**
	 * 税率毎買上額９. Purchase amount 9 per tax rate.<p>
	 *
	 */
	public void tax_rate_sls_amt9(long value) {
		setConstNumber(offset + 80, $tax_rate_sls_amt9, value);
	}
	
	/**
	 * 税率毎買上額９. Purchase amount 9 per tax rate.<p>
	 *
	 */
	public void tax_rate_sls_amt9(float value) {
		setConstNumber(offset + 80, $tax_rate_sls_amt9, value);
	}
	
	/**
	 * 税率毎買上額９. Purchase amount 9 per tax rate.<p>
	 *
	 */
	public void tax_rate_sls_amt9(double value) {
		setConstNumber(offset + 80, $tax_rate_sls_amt9, value);
	}
	
	/**
	 * 税率毎税額９. Tax amount per tax rate 9.<p>
	 *
	 */
	public MCNumber tax_rate_tax_amt9() {
		return getConstNumber(offset + 81, $tax_rate_tax_amt9);
	}

	/**
	 * 税率毎税額９. Tax amount per tax rate 9.<p>
	 *
	 */
	public void tax_rate_tax_amt9(MCNumber value) {
		setConstNumber(offset + 81, $tax_rate_tax_amt9, value);
	}
	
	/**
	 * 税率毎税額９. Tax amount per tax rate 9.<p>
	 *
	 */
	public void tax_rate_tax_amt9(int value) {
		setConstNumber(offset + 81, $tax_rate_tax_amt9, value);
	}
	
	/**
	 * 税率毎税額９. Tax amount per tax rate 9.<p>
	 *
	 */
	public void tax_rate_tax_amt9(long value) {
		setConstNumber(offset + 81, $tax_rate_tax_amt9, value);
	}
	
	/**
	 * 税率毎税額９. Tax amount per tax rate 9.<p>
	 *
	 */
	public void tax_rate_tax_amt9(float value) {
		setConstNumber(offset + 81, $tax_rate_tax_amt9, value);
	}
	
	/**
	 * 税率毎税額９. Tax amount per tax rate 9.<p>
	 *
	 */
	public void tax_rate_tax_amt9(double value) {
		setConstNumber(offset + 81, $tax_rate_tax_amt9, value);
	}
	
	/**
	 * 税率毎基準通貨税額９. Tax amount (Base currency) per tax rate 9.<p>
	 *
	 */
	public MCNumber tax_rate_base_tax_amt9() {
		return getConstNumber(offset + 82, $tax_rate_base_tax_amt9);
	}

	/**
	 * 税率毎基準通貨税額９. Tax amount (Base currency) per tax rate 9.<p>
	 *
	 */
	public void tax_rate_base_tax_amt9(MCNumber value) {
		setConstNumber(offset + 82, $tax_rate_base_tax_amt9, value);
	}
	
	/**
	 * 税率毎基準通貨税額９. Tax amount (Base currency) per tax rate 9.<p>
	 *
	 */
	public void tax_rate_base_tax_amt9(int value) {
		setConstNumber(offset + 82, $tax_rate_base_tax_amt9, value);
	}
	
	/**
	 * 税率毎基準通貨税額９. Tax amount (Base currency) per tax rate 9.<p>
	 *
	 */
	public void tax_rate_base_tax_amt9(long value) {
		setConstNumber(offset + 82, $tax_rate_base_tax_amt9, value);
	}
	
	/**
	 * 税率毎基準通貨税額９. Tax amount (Base currency) per tax rate 9.<p>
	 *
	 */
	public void tax_rate_base_tax_amt9(float value) {
		setConstNumber(offset + 82, $tax_rate_base_tax_amt9, value);
	}
	
	/**
	 * 税率毎基準通貨税額９. Tax amount (Base currency) per tax rate 9.<p>
	 *
	 */
	public void tax_rate_base_tax_amt9(double value) {
		setConstNumber(offset + 82, $tax_rate_base_tax_amt9, value);
	}
	
	/**
	 * 税率１０. Tax rate 10.<p>
	 *
	 */
	public MCNumber tax_rate10() {
		return getConstNumber(offset + 83, $tax_rate10);
	}

	/**
	 * 税率１０. Tax rate 10.<p>
	 *
	 */
	public void tax_rate10(MCNumber value) {
		setConstNumber(offset + 83, $tax_rate10, value);
	}
	
	/**
	 * 税率１０. Tax rate 10.<p>
	 *
	 */
	public void tax_rate10(int value) {
		setConstNumber(offset + 83, $tax_rate10, value);
	}
	
	/**
	 * 税率１０. Tax rate 10.<p>
	 *
	 */
	public void tax_rate10(long value) {
		setConstNumber(offset + 83, $tax_rate10, value);
	}
	
	/**
	 * 税率１０. Tax rate 10.<p>
	 *
	 */
	public void tax_rate10(float value) {
		setConstNumber(offset + 83, $tax_rate10, value);
	}
	
	/**
	 * 税率１０. Tax rate 10.<p>
	 *
	 */
	public void tax_rate10(double value) {
		setConstNumber(offset + 83, $tax_rate10, value);
	}
	
	/**
	 * 税率毎買上額１０. Purchase amount 10 per tax rate.<p>
	 *
	 */
	public MCNumber tax_rate_sls_amt10() {
		return getConstNumber(offset + 84, $tax_rate_sls_amt10);
	}

	/**
	 * 税率毎買上額１０. Purchase amount 10 per tax rate.<p>
	 *
	 */
	public void tax_rate_sls_amt10(MCNumber value) {
		setConstNumber(offset + 84, $tax_rate_sls_amt10, value);
	}
	
	/**
	 * 税率毎買上額１０. Purchase amount 10 per tax rate.<p>
	 *
	 */
	public void tax_rate_sls_amt10(int value) {
		setConstNumber(offset + 84, $tax_rate_sls_amt10, value);
	}
	
	/**
	 * 税率毎買上額１０. Purchase amount 10 per tax rate.<p>
	 *
	 */
	public void tax_rate_sls_amt10(long value) {
		setConstNumber(offset + 84, $tax_rate_sls_amt10, value);
	}
	
	/**
	 * 税率毎買上額１０. Purchase amount 10 per tax rate.<p>
	 *
	 */
	public void tax_rate_sls_amt10(float value) {
		setConstNumber(offset + 84, $tax_rate_sls_amt10, value);
	}
	
	/**
	 * 税率毎買上額１０. Purchase amount 10 per tax rate.<p>
	 *
	 */
	public void tax_rate_sls_amt10(double value) {
		setConstNumber(offset + 84, $tax_rate_sls_amt10, value);
	}
	
	/**
	 * 税率毎税額１０. Tax amount per tax rate 10.<p>
	 *
	 */
	public MCNumber tax_rate_tax_amt10() {
		return getConstNumber(offset + 85, $tax_rate_tax_amt10);
	}

	/**
	 * 税率毎税額１０. Tax amount per tax rate 10.<p>
	 *
	 */
	public void tax_rate_tax_amt10(MCNumber value) {
		setConstNumber(offset + 85, $tax_rate_tax_amt10, value);
	}
	
	/**
	 * 税率毎税額１０. Tax amount per tax rate 10.<p>
	 *
	 */
	public void tax_rate_tax_amt10(int value) {
		setConstNumber(offset + 85, $tax_rate_tax_amt10, value);
	}
	
	/**
	 * 税率毎税額１０. Tax amount per tax rate 10.<p>
	 *
	 */
	public void tax_rate_tax_amt10(long value) {
		setConstNumber(offset + 85, $tax_rate_tax_amt10, value);
	}
	
	/**
	 * 税率毎税額１０. Tax amount per tax rate 10.<p>
	 *
	 */
	public void tax_rate_tax_amt10(float value) {
		setConstNumber(offset + 85, $tax_rate_tax_amt10, value);
	}
	
	/**
	 * 税率毎税額１０. Tax amount per tax rate 10.<p>
	 *
	 */
	public void tax_rate_tax_amt10(double value) {
		setConstNumber(offset + 85, $tax_rate_tax_amt10, value);
	}
	
	/**
	 * 税率毎基準通貨税額１０. Tax amount (Base currency) per tax rate 10.<p>
	 *
	 */
	public MCNumber tax_rate_base_tax_amt10() {
		return getConstNumber(offset + 86, $tax_rate_base_tax_amt10);
	}

	/**
	 * 税率毎基準通貨税額１０. Tax amount (Base currency) per tax rate 10.<p>
	 *
	 */
	public void tax_rate_base_tax_amt10(MCNumber value) {
		setConstNumber(offset + 86, $tax_rate_base_tax_amt10, value);
	}
	
	/**
	 * 税率毎基準通貨税額１０. Tax amount (Base currency) per tax rate 10.<p>
	 *
	 */
	public void tax_rate_base_tax_amt10(int value) {
		setConstNumber(offset + 86, $tax_rate_base_tax_amt10, value);
	}
	
	/**
	 * 税率毎基準通貨税額１０. Tax amount (Base currency) per tax rate 10.<p>
	 *
	 */
	public void tax_rate_base_tax_amt10(long value) {
		setConstNumber(offset + 86, $tax_rate_base_tax_amt10, value);
	}
	
	/**
	 * 税率毎基準通貨税額１０. Tax amount (Base currency) per tax rate 10.<p>
	 *
	 */
	public void tax_rate_base_tax_amt10(float value) {
		setConstNumber(offset + 86, $tax_rate_base_tax_amt10, value);
	}
	
	/**
	 * 税率毎基準通貨税額１０. Tax amount (Base currency) per tax rate 10.<p>
	 *
	 */
	public void tax_rate_base_tax_amt10(double value) {
		setConstNumber(offset + 86, $tax_rate_base_tax_amt10, value);
	}
	
	/**
	 * 前受金残高. Advance received balance.<p>
	 *
	 */
	public MCNumber adv_amt_bal() {
		return getConstNumber(offset + 87, $adv_amt_bal);
	}

	/**
	 * 前受金残高. Advance received balance.<p>
	 *
	 */
	public void adv_amt_bal(MCNumber value) {
		setConstNumber(offset + 87, $adv_amt_bal, value);
	}
	
	/**
	 * 前受金残高. Advance received balance.<p>
	 *
	 */
	public void adv_amt_bal(int value) {
		setConstNumber(offset + 87, $adv_amt_bal, value);
	}
	
	/**
	 * 前受金残高. Advance received balance.<p>
	 *
	 */
	public void adv_amt_bal(long value) {
		setConstNumber(offset + 87, $adv_amt_bal, value);
	}
	
	/**
	 * 前受金残高. Advance received balance.<p>
	 *
	 */
	public void adv_amt_bal(float value) {
		setConstNumber(offset + 87, $adv_amt_bal, value);
	}
	
	/**
	 * 前受金残高. Advance received balance.<p>
	 *
	 */
	public void adv_amt_bal(double value) {
		setConstNumber(offset + 87, $adv_amt_bal, value);
	}
	
	/**
	 * 前受金入金額. Advance received payment amount.<p>
	 *
	 */
	public MCNumber adv_amt() {
		return getConstNumber(offset + 88, $adv_amt);
	}

	/**
	 * 前受金入金額. Advance received payment amount.<p>
	 *
	 */
	public void adv_amt(MCNumber value) {
		setConstNumber(offset + 88, $adv_amt, value);
	}
	
	/**
	 * 前受金入金額. Advance received payment amount.<p>
	 *
	 */
	public void adv_amt(int value) {
		setConstNumber(offset + 88, $adv_amt, value);
	}
	
	/**
	 * 前受金入金額. Advance received payment amount.<p>
	 *
	 */
	public void adv_amt(long value) {
		setConstNumber(offset + 88, $adv_amt, value);
	}
	
	/**
	 * 前受金入金額. Advance received payment amount.<p>
	 *
	 */
	public void adv_amt(float value) {
		setConstNumber(offset + 88, $adv_amt, value);
	}
	
	/**
	 * 前受金入金額. Advance received payment amount.<p>
	 *
	 */
	public void adv_amt(double value) {
		setConstNumber(offset + 88, $adv_amt, value);
	}
	
	/**
	 * 前受金相殺額. Advance received offset amount.<p>
	 *
	 */
	public MCNumber adv_setoff_amt() {
		return getConstNumber(offset + 89, $adv_setoff_amt);
	}

	/**
	 * 前受金相殺額. Advance received offset amount.<p>
	 *
	 */
	public void adv_setoff_amt(MCNumber value) {
		setConstNumber(offset + 89, $adv_setoff_amt, value);
	}
	
	/**
	 * 前受金相殺額. Advance received offset amount.<p>
	 *
	 */
	public void adv_setoff_amt(int value) {
		setConstNumber(offset + 89, $adv_setoff_amt, value);
	}
	
	/**
	 * 前受金相殺額. Advance received offset amount.<p>
	 *
	 */
	public void adv_setoff_amt(long value) {
		setConstNumber(offset + 89, $adv_setoff_amt, value);
	}
	
	/**
	 * 前受金相殺額. Advance received offset amount.<p>
	 *
	 */
	public void adv_setoff_amt(float value) {
		setConstNumber(offset + 89, $adv_setoff_amt, value);
	}
	
	/**
	 * 前受金相殺額. Advance received offset amount.<p>
	 *
	 */
	public void adv_setoff_amt(double value) {
		setConstNumber(offset + 89, $adv_setoff_amt, value);
	}
	
	/**
	 * 前受金相殺税額. Advance received offset tax amount.<p>
	 *
	 */
	public MCNumber adv_setoff_tax_amt() {
		return getConstNumber(offset + 90, $adv_setoff_tax_amt);
	}

	/**
	 * 前受金相殺税額. Advance received offset tax amount.<p>
	 *
	 */
	public void adv_setoff_tax_amt(MCNumber value) {
		setConstNumber(offset + 90, $adv_setoff_tax_amt, value);
	}
	
	/**
	 * 前受金相殺税額. Advance received offset tax amount.<p>
	 *
	 */
	public void adv_setoff_tax_amt(int value) {
		setConstNumber(offset + 90, $adv_setoff_tax_amt, value);
	}
	
	/**
	 * 前受金相殺税額. Advance received offset tax amount.<p>
	 *
	 */
	public void adv_setoff_tax_amt(long value) {
		setConstNumber(offset + 90, $adv_setoff_tax_amt, value);
	}
	
	/**
	 * 前受金相殺税額. Advance received offset tax amount.<p>
	 *
	 */
	public void adv_setoff_tax_amt(float value) {
		setConstNumber(offset + 90, $adv_setoff_tax_amt, value);
	}
	
	/**
	 * 前受金相殺税額. Advance received offset tax amount.<p>
	 *
	 */
	public void adv_setoff_tax_amt(double value) {
		setConstNumber(offset + 90, $adv_setoff_tax_amt, value);
	}
	
	/**
	 * 支払予定日１. Scheduled payment date 1.<p>
	 *
	 */
	public MCDate pay_schd_dt1() {
		return getConstDate(offset + 91, $pay_schd_dt1);
	}

	/**
	 * 支払予定日１. Scheduled payment date 1.<p>
	 *
	 */
	public void pay_schd_dt1(MCDate value) {
		setConstDate(offset + 91, $pay_schd_dt1, value);
	}

	/**
	 * 支払予定額１. Payment schedule amount 1.<p>
	 *
	 */
	public MCNumber pay_schd_amt1() {
		return getConstNumber(offset + 92, $pay_schd_amt1);
	}

	/**
	 * 支払予定額１. Payment schedule amount 1.<p>
	 *
	 */
	public void pay_schd_amt1(MCNumber value) {
		setConstNumber(offset + 92, $pay_schd_amt1, value);
	}
	
	/**
	 * 支払予定額１. Payment schedule amount 1.<p>
	 *
	 */
	public void pay_schd_amt1(int value) {
		setConstNumber(offset + 92, $pay_schd_amt1, value);
	}
	
	/**
	 * 支払予定額１. Payment schedule amount 1.<p>
	 *
	 */
	public void pay_schd_amt1(long value) {
		setConstNumber(offset + 92, $pay_schd_amt1, value);
	}
	
	/**
	 * 支払予定額１. Payment schedule amount 1.<p>
	 *
	 */
	public void pay_schd_amt1(float value) {
		setConstNumber(offset + 92, $pay_schd_amt1, value);
	}
	
	/**
	 * 支払予定額１. Payment schedule amount 1.<p>
	 *
	 */
	public void pay_schd_amt1(double value) {
		setConstNumber(offset + 92, $pay_schd_amt1, value);
	}
	
	/**
	 * 支払方法ＣＤ１. Payment method cd. 1.<p>
	 *
	 */
	public String pay_mtd_cd1() {
		return getConstString(offset + 93, $pay_mtd_cd1);
	}

	/**
	 * 支払方法ＣＤ１. Payment method cd. 1.<p>
	 *
	 */
	public void pay_mtd_cd1(String value) {
		setConstString(offset + 93, $pay_mtd_cd1, value);
	}

	/**
	 * ＩＦ支払方法ＣＤ１. IF payment method cd. 1.<p>
	 *
	 */
	public String if_pay_mtd_cd1() {
		return getConstString(offset + 94, $if_pay_mtd_cd1);
	}

	/**
	 * ＩＦ支払方法ＣＤ１. IF payment method cd. 1.<p>
	 *
	 */
	public void if_pay_mtd_cd1(String value) {
		setConstString(offset + 94, $if_pay_mtd_cd1, value);
	}

	/**
	 * ＩＦ支払方法名１. IF payment method name 1.<p>
	 *
	 */
	public String if_pay_mtd_nm1() {
		return getConstString(offset + 95, $if_pay_mtd_nm1);
	}

	/**
	 * ＩＦ支払方法名１. IF payment method name 1.<p>
	 *
	 */
	public void if_pay_mtd_nm1(String value) {
		setConstString(offset + 95, $if_pay_mtd_nm1, value);
	}

	/**
	 * 支払予定日２. Scheduled payment date 2.<p>
	 *
	 */
	public MCDate pay_schd_dt2() {
		return getConstDate(offset + 96, $pay_schd_dt2);
	}

	/**
	 * 支払予定日２. Scheduled payment date 2.<p>
	 *
	 */
	public void pay_schd_dt2(MCDate value) {
		setConstDate(offset + 96, $pay_schd_dt2, value);
	}

	/**
	 * 支払予定額２. Payment schedule amount 2.<p>
	 *
	 */
	public MCNumber pay_schd_amt2() {
		return getConstNumber(offset + 97, $pay_schd_amt2);
	}

	/**
	 * 支払予定額２. Payment schedule amount 2.<p>
	 *
	 */
	public void pay_schd_amt2(MCNumber value) {
		setConstNumber(offset + 97, $pay_schd_amt2, value);
	}
	
	/**
	 * 支払予定額２. Payment schedule amount 2.<p>
	 *
	 */
	public void pay_schd_amt2(int value) {
		setConstNumber(offset + 97, $pay_schd_amt2, value);
	}
	
	/**
	 * 支払予定額２. Payment schedule amount 2.<p>
	 *
	 */
	public void pay_schd_amt2(long value) {
		setConstNumber(offset + 97, $pay_schd_amt2, value);
	}
	
	/**
	 * 支払予定額２. Payment schedule amount 2.<p>
	 *
	 */
	public void pay_schd_amt2(float value) {
		setConstNumber(offset + 97, $pay_schd_amt2, value);
	}
	
	/**
	 * 支払予定額２. Payment schedule amount 2.<p>
	 *
	 */
	public void pay_schd_amt2(double value) {
		setConstNumber(offset + 97, $pay_schd_amt2, value);
	}
	
	/**
	 * 支払方法ＣＤ２. Payment method cd. 2.<p>
	 *
	 */
	public String pay_mtd_cd2() {
		return getConstString(offset + 98, $pay_mtd_cd2);
	}

	/**
	 * 支払方法ＣＤ２. Payment method cd. 2.<p>
	 *
	 */
	public void pay_mtd_cd2(String value) {
		setConstString(offset + 98, $pay_mtd_cd2, value);
	}

	/**
	 * ＩＦ支払方法ＣＤ２. IF payment method cd. 2.<p>
	 *
	 */
	public String if_pay_mtd_cd2() {
		return getConstString(offset + 99, $if_pay_mtd_cd2);
	}

	/**
	 * ＩＦ支払方法ＣＤ２. IF payment method cd. 2.<p>
	 *
	 */
	public void if_pay_mtd_cd2(String value) {
		setConstString(offset + 99, $if_pay_mtd_cd2, value);
	}

	/**
	 * ＩＦ支払方法名２. IF payment method name 2.<p>
	 *
	 */
	public String if_pay_mtd_nm2() {
		return getConstString(offset + 100, $if_pay_mtd_nm2);
	}

	/**
	 * ＩＦ支払方法名２. IF payment method name 2.<p>
	 *
	 */
	public void if_pay_mtd_nm2(String value) {
		setConstString(offset + 100, $if_pay_mtd_nm2, value);
	}

	/**
	 * 支払予定日３. Scheduled payment date 3.<p>
	 *
	 */
	public MCDate pay_schd_dt3() {
		return getConstDate(offset + 101, $pay_schd_dt3);
	}

	/**
	 * 支払予定日３. Scheduled payment date 3.<p>
	 *
	 */
	public void pay_schd_dt3(MCDate value) {
		setConstDate(offset + 101, $pay_schd_dt3, value);
	}

	/**
	 * 支払予定額３. Payment schedule amount 3.<p>
	 *
	 */
	public MCNumber pay_schd_amt3() {
		return getConstNumber(offset + 102, $pay_schd_amt3);
	}

	/**
	 * 支払予定額３. Payment schedule amount 3.<p>
	 *
	 */
	public void pay_schd_amt3(MCNumber value) {
		setConstNumber(offset + 102, $pay_schd_amt3, value);
	}
	
	/**
	 * 支払予定額３. Payment schedule amount 3.<p>
	 *
	 */
	public void pay_schd_amt3(int value) {
		setConstNumber(offset + 102, $pay_schd_amt3, value);
	}
	
	/**
	 * 支払予定額３. Payment schedule amount 3.<p>
	 *
	 */
	public void pay_schd_amt3(long value) {
		setConstNumber(offset + 102, $pay_schd_amt3, value);
	}
	
	/**
	 * 支払予定額３. Payment schedule amount 3.<p>
	 *
	 */
	public void pay_schd_amt3(float value) {
		setConstNumber(offset + 102, $pay_schd_amt3, value);
	}
	
	/**
	 * 支払予定額３. Payment schedule amount 3.<p>
	 *
	 */
	public void pay_schd_amt3(double value) {
		setConstNumber(offset + 102, $pay_schd_amt3, value);
	}
	
	/**
	 * 支払方法ＣＤ３. Payment method cd. 3.<p>
	 *
	 */
	public String pay_mtd_cd3() {
		return getConstString(offset + 103, $pay_mtd_cd3);
	}

	/**
	 * 支払方法ＣＤ３. Payment method cd. 3.<p>
	 *
	 */
	public void pay_mtd_cd3(String value) {
		setConstString(offset + 103, $pay_mtd_cd3, value);
	}

	/**
	 * ＩＦ支払方法ＣＤ３. IF payment method cd. 3.<p>
	 *
	 */
	public String if_pay_mtd_cd3() {
		return getConstString(offset + 104, $if_pay_mtd_cd3);
	}

	/**
	 * ＩＦ支払方法ＣＤ３. IF payment method cd. 3.<p>
	 *
	 */
	public void if_pay_mtd_cd3(String value) {
		setConstString(offset + 104, $if_pay_mtd_cd3, value);
	}

	/**
	 * ＩＦ支払方法名３. IF payment method name 3.<p>
	 *
	 */
	public String if_pay_mtd_nm3() {
		return getConstString(offset + 105, $if_pay_mtd_nm3);
	}

	/**
	 * ＩＦ支払方法名３. IF payment method name 3.<p>
	 *
	 */
	public void if_pay_mtd_nm3(String value) {
		setConstString(offset + 105, $if_pay_mtd_nm3, value);
	}

	/**
	 * 支払予定日４. Scheduled payment date 4.<p>
	 *
	 */
	public MCDate pay_schd_dt4() {
		return getConstDate(offset + 106, $pay_schd_dt4);
	}

	/**
	 * 支払予定日４. Scheduled payment date 4.<p>
	 *
	 */
	public void pay_schd_dt4(MCDate value) {
		setConstDate(offset + 106, $pay_schd_dt4, value);
	}

	/**
	 * 支払予定額４. Payment schedule amount 4.<p>
	 *
	 */
	public MCNumber pay_schd_amt4() {
		return getConstNumber(offset + 107, $pay_schd_amt4);
	}

	/**
	 * 支払予定額４. Payment schedule amount 4.<p>
	 *
	 */
	public void pay_schd_amt4(MCNumber value) {
		setConstNumber(offset + 107, $pay_schd_amt4, value);
	}
	
	/**
	 * 支払予定額４. Payment schedule amount 4.<p>
	 *
	 */
	public void pay_schd_amt4(int value) {
		setConstNumber(offset + 107, $pay_schd_amt4, value);
	}
	
	/**
	 * 支払予定額４. Payment schedule amount 4.<p>
	 *
	 */
	public void pay_schd_amt4(long value) {
		setConstNumber(offset + 107, $pay_schd_amt4, value);
	}
	
	/**
	 * 支払予定額４. Payment schedule amount 4.<p>
	 *
	 */
	public void pay_schd_amt4(float value) {
		setConstNumber(offset + 107, $pay_schd_amt4, value);
	}
	
	/**
	 * 支払予定額４. Payment schedule amount 4.<p>
	 *
	 */
	public void pay_schd_amt4(double value) {
		setConstNumber(offset + 107, $pay_schd_amt4, value);
	}
	
	/**
	 * 支払方法ＣＤ４. Payment method cd. 4.<p>
	 *
	 */
	public String pay_mtd_cd4() {
		return getConstString(offset + 108, $pay_mtd_cd4);
	}

	/**
	 * 支払方法ＣＤ４. Payment method cd. 4.<p>
	 *
	 */
	public void pay_mtd_cd4(String value) {
		setConstString(offset + 108, $pay_mtd_cd4, value);
	}

	/**
	 * ＩＦ支払方法ＣＤ４. IF payment method cd. 4.<p>
	 *
	 */
	public String if_pay_mtd_cd4() {
		return getConstString(offset + 109, $if_pay_mtd_cd4);
	}

	/**
	 * ＩＦ支払方法ＣＤ４. IF payment method cd. 4.<p>
	 *
	 */
	public void if_pay_mtd_cd4(String value) {
		setConstString(offset + 109, $if_pay_mtd_cd4, value);
	}

	/**
	 * ＩＦ支払方法名４. IF payment method name 4.<p>
	 *
	 */
	public String if_pay_mtd_nm4() {
		return getConstString(offset + 110, $if_pay_mtd_nm4);
	}

	/**
	 * ＩＦ支払方法名４. IF payment method name 4.<p>
	 *
	 */
	public void if_pay_mtd_nm4(String value) {
		setConstString(offset + 110, $if_pay_mtd_nm4, value);
	}

	/**
	 * 支払予定日５. Scheduled payment date 5.<p>
	 *
	 */
	public MCDate pay_schd_dt5() {
		return getConstDate(offset + 111, $pay_schd_dt5);
	}

	/**
	 * 支払予定日５. Scheduled payment date 5.<p>
	 *
	 */
	public void pay_schd_dt5(MCDate value) {
		setConstDate(offset + 111, $pay_schd_dt5, value);
	}

	/**
	 * 支払予定額５. Payment schedule amount 5.<p>
	 *
	 */
	public MCNumber pay_schd_amt5() {
		return getConstNumber(offset + 112, $pay_schd_amt5);
	}

	/**
	 * 支払予定額５. Payment schedule amount 5.<p>
	 *
	 */
	public void pay_schd_amt5(MCNumber value) {
		setConstNumber(offset + 112, $pay_schd_amt5, value);
	}
	
	/**
	 * 支払予定額５. Payment schedule amount 5.<p>
	 *
	 */
	public void pay_schd_amt5(int value) {
		setConstNumber(offset + 112, $pay_schd_amt5, value);
	}
	
	/**
	 * 支払予定額５. Payment schedule amount 5.<p>
	 *
	 */
	public void pay_schd_amt5(long value) {
		setConstNumber(offset + 112, $pay_schd_amt5, value);
	}
	
	/**
	 * 支払予定額５. Payment schedule amount 5.<p>
	 *
	 */
	public void pay_schd_amt5(float value) {
		setConstNumber(offset + 112, $pay_schd_amt5, value);
	}
	
	/**
	 * 支払予定額５. Payment schedule amount 5.<p>
	 *
	 */
	public void pay_schd_amt5(double value) {
		setConstNumber(offset + 112, $pay_schd_amt5, value);
	}
	
	/**
	 * 支払方法ＣＤ５. Payment method cd. 5.<p>
	 *
	 */
	public String pay_mtd_cd5() {
		return getConstString(offset + 113, $pay_mtd_cd5);
	}

	/**
	 * 支払方法ＣＤ５. Payment method cd. 5.<p>
	 *
	 */
	public void pay_mtd_cd5(String value) {
		setConstString(offset + 113, $pay_mtd_cd5, value);
	}

	/**
	 * ＩＦ支払方法ＣＤ５. IF payment method cd. 5.<p>
	 *
	 */
	public String if_pay_mtd_cd5() {
		return getConstString(offset + 114, $if_pay_mtd_cd5);
	}

	/**
	 * ＩＦ支払方法ＣＤ５. IF payment method cd. 5.<p>
	 *
	 */
	public void if_pay_mtd_cd5(String value) {
		setConstString(offset + 114, $if_pay_mtd_cd5, value);
	}

	/**
	 * ＩＦ支払方法名５. IF payment method name 5.<p>
	 *
	 */
	public String if_pay_mtd_nm5() {
		return getConstString(offset + 115, $if_pay_mtd_nm5);
	}

	/**
	 * ＩＦ支払方法名５. IF payment method name 5.<p>
	 *
	 */
	public void if_pay_mtd_nm5(String value) {
		setConstString(offset + 115, $if_pay_mtd_nm5, value);
	}

	/**
	 * 支払予定日６. Scheduled payment date 6.<p>
	 *
	 */
	public MCDate pay_schd_dt6() {
		return getConstDate(offset + 116, $pay_schd_dt6);
	}

	/**
	 * 支払予定日６. Scheduled payment date 6.<p>
	 *
	 */
	public void pay_schd_dt6(MCDate value) {
		setConstDate(offset + 116, $pay_schd_dt6, value);
	}

	/**
	 * 支払予定額６. Payment schedule amount 6.<p>
	 *
	 */
	public MCNumber pay_schd_amt6() {
		return getConstNumber(offset + 117, $pay_schd_amt6);
	}

	/**
	 * 支払予定額６. Payment schedule amount 6.<p>
	 *
	 */
	public void pay_schd_amt6(MCNumber value) {
		setConstNumber(offset + 117, $pay_schd_amt6, value);
	}
	
	/**
	 * 支払予定額６. Payment schedule amount 6.<p>
	 *
	 */
	public void pay_schd_amt6(int value) {
		setConstNumber(offset + 117, $pay_schd_amt6, value);
	}
	
	/**
	 * 支払予定額６. Payment schedule amount 6.<p>
	 *
	 */
	public void pay_schd_amt6(long value) {
		setConstNumber(offset + 117, $pay_schd_amt6, value);
	}
	
	/**
	 * 支払予定額６. Payment schedule amount 6.<p>
	 *
	 */
	public void pay_schd_amt6(float value) {
		setConstNumber(offset + 117, $pay_schd_amt6, value);
	}
	
	/**
	 * 支払予定額６. Payment schedule amount 6.<p>
	 *
	 */
	public void pay_schd_amt6(double value) {
		setConstNumber(offset + 117, $pay_schd_amt6, value);
	}
	
	/**
	 * 支払方法ＣＤ６. Payment method cd. 6.<p>
	 *
	 */
	public String pay_mtd_cd6() {
		return getConstString(offset + 118, $pay_mtd_cd6);
	}

	/**
	 * 支払方法ＣＤ６. Payment method cd. 6.<p>
	 *
	 */
	public void pay_mtd_cd6(String value) {
		setConstString(offset + 118, $pay_mtd_cd6, value);
	}

	/**
	 * ＩＦ支払方法ＣＤ６. IF payment method cd. 6.<p>
	 *
	 */
	public String if_pay_mtd_cd6() {
		return getConstString(offset + 119, $if_pay_mtd_cd6);
	}

	/**
	 * ＩＦ支払方法ＣＤ６. IF payment method cd. 6.<p>
	 *
	 */
	public void if_pay_mtd_cd6(String value) {
		setConstString(offset + 119, $if_pay_mtd_cd6, value);
	}

	/**
	 * ＩＦ支払方法名６. IF payment method name 6.<p>
	 *
	 */
	public String if_pay_mtd_nm6() {
		return getConstString(offset + 120, $if_pay_mtd_nm6);
	}

	/**
	 * ＩＦ支払方法名６. IF payment method name 6.<p>
	 *
	 */
	public void if_pay_mtd_nm6(String value) {
		setConstString(offset + 120, $if_pay_mtd_nm6, value);
	}

	/**
	 * 支払予定日７. Scheduled payment date 7.<p>
	 *
	 */
	public MCDate pay_schd_dt7() {
		return getConstDate(offset + 121, $pay_schd_dt7);
	}

	/**
	 * 支払予定日７. Scheduled payment date 7.<p>
	 *
	 */
	public void pay_schd_dt7(MCDate value) {
		setConstDate(offset + 121, $pay_schd_dt7, value);
	}

	/**
	 * 支払予定額７. Payment schedule amount 7.<p>
	 *
	 */
	public MCNumber pay_schd_amt7() {
		return getConstNumber(offset + 122, $pay_schd_amt7);
	}

	/**
	 * 支払予定額７. Payment schedule amount 7.<p>
	 *
	 */
	public void pay_schd_amt7(MCNumber value) {
		setConstNumber(offset + 122, $pay_schd_amt7, value);
	}
	
	/**
	 * 支払予定額７. Payment schedule amount 7.<p>
	 *
	 */
	public void pay_schd_amt7(int value) {
		setConstNumber(offset + 122, $pay_schd_amt7, value);
	}
	
	/**
	 * 支払予定額７. Payment schedule amount 7.<p>
	 *
	 */
	public void pay_schd_amt7(long value) {
		setConstNumber(offset + 122, $pay_schd_amt7, value);
	}
	
	/**
	 * 支払予定額７. Payment schedule amount 7.<p>
	 *
	 */
	public void pay_schd_amt7(float value) {
		setConstNumber(offset + 122, $pay_schd_amt7, value);
	}
	
	/**
	 * 支払予定額７. Payment schedule amount 7.<p>
	 *
	 */
	public void pay_schd_amt7(double value) {
		setConstNumber(offset + 122, $pay_schd_amt7, value);
	}
	
	/**
	 * 支払方法ＣＤ７. Payment method cd. 7.<p>
	 *
	 */
	public String pay_mtd_cd7() {
		return getConstString(offset + 123, $pay_mtd_cd7);
	}

	/**
	 * 支払方法ＣＤ７. Payment method cd. 7.<p>
	 *
	 */
	public void pay_mtd_cd7(String value) {
		setConstString(offset + 123, $pay_mtd_cd7, value);
	}

	/**
	 * ＩＦ支払方法ＣＤ７. IF payment method cd. 7.<p>
	 *
	 */
	public String if_pay_mtd_cd7() {
		return getConstString(offset + 124, $if_pay_mtd_cd7);
	}

	/**
	 * ＩＦ支払方法ＣＤ７. IF payment method cd. 7.<p>
	 *
	 */
	public void if_pay_mtd_cd7(String value) {
		setConstString(offset + 124, $if_pay_mtd_cd7, value);
	}

	/**
	 * ＩＦ支払方法名７. IF payment method name 7.<p>
	 *
	 */
	public String if_pay_mtd_nm7() {
		return getConstString(offset + 125, $if_pay_mtd_nm7);
	}

	/**
	 * ＩＦ支払方法名７. IF payment method name 7.<p>
	 *
	 */
	public void if_pay_mtd_nm7(String value) {
		setConstString(offset + 125, $if_pay_mtd_nm7, value);
	}

	/**
	 * 支払予定日８. Scheduled payment date 8.<p>
	 *
	 */
	public MCDate pay_schd_dt8() {
		return getConstDate(offset + 126, $pay_schd_dt8);
	}

	/**
	 * 支払予定日８. Scheduled payment date 8.<p>
	 *
	 */
	public void pay_schd_dt8(MCDate value) {
		setConstDate(offset + 126, $pay_schd_dt8, value);
	}

	/**
	 * 支払予定額８. Payment schedule amount 8.<p>
	 *
	 */
	public MCNumber pay_schd_amt8() {
		return getConstNumber(offset + 127, $pay_schd_amt8);
	}

	/**
	 * 支払予定額８. Payment schedule amount 8.<p>
	 *
	 */
	public void pay_schd_amt8(MCNumber value) {
		setConstNumber(offset + 127, $pay_schd_amt8, value);
	}
	
	/**
	 * 支払予定額８. Payment schedule amount 8.<p>
	 *
	 */
	public void pay_schd_amt8(int value) {
		setConstNumber(offset + 127, $pay_schd_amt8, value);
	}
	
	/**
	 * 支払予定額８. Payment schedule amount 8.<p>
	 *
	 */
	public void pay_schd_amt8(long value) {
		setConstNumber(offset + 127, $pay_schd_amt8, value);
	}
	
	/**
	 * 支払予定額８. Payment schedule amount 8.<p>
	 *
	 */
	public void pay_schd_amt8(float value) {
		setConstNumber(offset + 127, $pay_schd_amt8, value);
	}
	
	/**
	 * 支払予定額８. Payment schedule amount 8.<p>
	 *
	 */
	public void pay_schd_amt8(double value) {
		setConstNumber(offset + 127, $pay_schd_amt8, value);
	}
	
	/**
	 * 支払方法ＣＤ８. Payment method cd. 8.<p>
	 *
	 */
	public String pay_mtd_cd8() {
		return getConstString(offset + 128, $pay_mtd_cd8);
	}

	/**
	 * 支払方法ＣＤ８. Payment method cd. 8.<p>
	 *
	 */
	public void pay_mtd_cd8(String value) {
		setConstString(offset + 128, $pay_mtd_cd8, value);
	}

	/**
	 * ＩＦ支払方法ＣＤ８. IF payment method cd. 8.<p>
	 *
	 */
	public String if_pay_mtd_cd8() {
		return getConstString(offset + 129, $if_pay_mtd_cd8);
	}

	/**
	 * ＩＦ支払方法ＣＤ８. IF payment method cd. 8.<p>
	 *
	 */
	public void if_pay_mtd_cd8(String value) {
		setConstString(offset + 129, $if_pay_mtd_cd8, value);
	}

	/**
	 * ＩＦ支払方法名８. IF payment method name 8.<p>
	 *
	 */
	public String if_pay_mtd_nm8() {
		return getConstString(offset + 130, $if_pay_mtd_nm8);
	}

	/**
	 * ＩＦ支払方法名８. IF payment method name 8.<p>
	 *
	 */
	public void if_pay_mtd_nm8(String value) {
		setConstString(offset + 130, $if_pay_mtd_nm8, value);
	}

	/**
	 * 支払予定日９. Scheduled payment date 9.<p>
	 *
	 */
	public MCDate pay_schd_dt9() {
		return getConstDate(offset + 131, $pay_schd_dt9);
	}

	/**
	 * 支払予定日９. Scheduled payment date 9.<p>
	 *
	 */
	public void pay_schd_dt9(MCDate value) {
		setConstDate(offset + 131, $pay_schd_dt9, value);
	}

	/**
	 * 支払予定額９. Payment schedule amount 9.<p>
	 *
	 */
	public MCNumber pay_schd_amt9() {
		return getConstNumber(offset + 132, $pay_schd_amt9);
	}

	/**
	 * 支払予定額９. Payment schedule amount 9.<p>
	 *
	 */
	public void pay_schd_amt9(MCNumber value) {
		setConstNumber(offset + 132, $pay_schd_amt9, value);
	}
	
	/**
	 * 支払予定額９. Payment schedule amount 9.<p>
	 *
	 */
	public void pay_schd_amt9(int value) {
		setConstNumber(offset + 132, $pay_schd_amt9, value);
	}
	
	/**
	 * 支払予定額９. Payment schedule amount 9.<p>
	 *
	 */
	public void pay_schd_amt9(long value) {
		setConstNumber(offset + 132, $pay_schd_amt9, value);
	}
	
	/**
	 * 支払予定額９. Payment schedule amount 9.<p>
	 *
	 */
	public void pay_schd_amt9(float value) {
		setConstNumber(offset + 132, $pay_schd_amt9, value);
	}
	
	/**
	 * 支払予定額９. Payment schedule amount 9.<p>
	 *
	 */
	public void pay_schd_amt9(double value) {
		setConstNumber(offset + 132, $pay_schd_amt9, value);
	}
	
	/**
	 * 支払方法ＣＤ９. Payment method cd. 9.<p>
	 *
	 */
	public String pay_mtd_cd9() {
		return getConstString(offset + 133, $pay_mtd_cd9);
	}

	/**
	 * 支払方法ＣＤ９. Payment method cd. 9.<p>
	 *
	 */
	public void pay_mtd_cd9(String value) {
		setConstString(offset + 133, $pay_mtd_cd9, value);
	}

	/**
	 * ＩＦ支払方法ＣＤ９. IF payment method cd. 9.<p>
	 *
	 */
	public String if_pay_mtd_cd9() {
		return getConstString(offset + 134, $if_pay_mtd_cd9);
	}

	/**
	 * ＩＦ支払方法ＣＤ９. IF payment method cd. 9.<p>
	 *
	 */
	public void if_pay_mtd_cd9(String value) {
		setConstString(offset + 134, $if_pay_mtd_cd9, value);
	}

	/**
	 * ＩＦ支払方法名９. IF payment method name 9.<p>
	 *
	 */
	public String if_pay_mtd_nm9() {
		return getConstString(offset + 135, $if_pay_mtd_nm9);
	}

	/**
	 * ＩＦ支払方法名９. IF payment method name 9.<p>
	 *
	 */
	public void if_pay_mtd_nm9(String value) {
		setConstString(offset + 135, $if_pay_mtd_nm9, value);
	}

	/**
	 * 支払予定日１０. Scheduled payment date 10.<p>
	 *
	 */
	public MCDate pay_schd_dt10() {
		return getConstDate(offset + 136, $pay_schd_dt10);
	}

	/**
	 * 支払予定日１０. Scheduled payment date 10.<p>
	 *
	 */
	public void pay_schd_dt10(MCDate value) {
		setConstDate(offset + 136, $pay_schd_dt10, value);
	}

	/**
	 * 支払予定額１０. Payment schedule amount 10.<p>
	 *
	 */
	public MCNumber pay_schd_amt10() {
		return getConstNumber(offset + 137, $pay_schd_amt10);
	}

	/**
	 * 支払予定額１０. Payment schedule amount 10.<p>
	 *
	 */
	public void pay_schd_amt10(MCNumber value) {
		setConstNumber(offset + 137, $pay_schd_amt10, value);
	}
	
	/**
	 * 支払予定額１０. Payment schedule amount 10.<p>
	 *
	 */
	public void pay_schd_amt10(int value) {
		setConstNumber(offset + 137, $pay_schd_amt10, value);
	}
	
	/**
	 * 支払予定額１０. Payment schedule amount 10.<p>
	 *
	 */
	public void pay_schd_amt10(long value) {
		setConstNumber(offset + 137, $pay_schd_amt10, value);
	}
	
	/**
	 * 支払予定額１０. Payment schedule amount 10.<p>
	 *
	 */
	public void pay_schd_amt10(float value) {
		setConstNumber(offset + 137, $pay_schd_amt10, value);
	}
	
	/**
	 * 支払予定額１０. Payment schedule amount 10.<p>
	 *
	 */
	public void pay_schd_amt10(double value) {
		setConstNumber(offset + 137, $pay_schd_amt10, value);
	}
	
	/**
	 * 支払方法ＣＤ１０. Payment method cd. 10.<p>
	 *
	 */
	public String pay_mtd_cd10() {
		return getConstString(offset + 138, $pay_mtd_cd10);
	}

	/**
	 * 支払方法ＣＤ１０. Payment method cd. 10.<p>
	 *
	 */
	public void pay_mtd_cd10(String value) {
		setConstString(offset + 138, $pay_mtd_cd10, value);
	}

	/**
	 * ＩＦ支払方法ＣＤ１０. IF payment method cd. 10.<p>
	 *
	 */
	public String if_pay_mtd_cd10() {
		return getConstString(offset + 139, $if_pay_mtd_cd10);
	}

	/**
	 * ＩＦ支払方法ＣＤ１０. IF payment method cd. 10.<p>
	 *
	 */
	public void if_pay_mtd_cd10(String value) {
		setConstString(offset + 139, $if_pay_mtd_cd10, value);
	}

	/**
	 * ＩＦ支払方法名１０. IF payment method name 10.<p>
	 *
	 */
	public String if_pay_mtd_nm10() {
		return getConstString(offset + 140, $if_pay_mtd_nm10);
	}

	/**
	 * ＩＦ支払方法名１０. IF payment method name 10.<p>
	 *
	 */
	public void if_pay_mtd_nm10(String value) {
		setConstString(offset + 140, $if_pay_mtd_nm10, value);
	}

	/**
	 * 口座ＣＤ. Bank account cd..<p>
	 *
	 */
	public String bank_ac_cd() {
		return getConstString(offset + 141, $bank_ac_cd);
	}

	/**
	 * 口座ＣＤ. Bank account cd..<p>
	 *
	 */
	public void bank_ac_cd(String value) {
		setConstString(offset + 141, $bank_ac_cd, value);
	}

	/**
	 * ＩＦ口座ＣＤ. IF bank account cd..<p>
	 *
	 */
	public String if_bank_ac_cd() {
		return getConstString(offset + 142, $if_bank_ac_cd);
	}

	/**
	 * ＩＦ口座ＣＤ. IF bank account cd..<p>
	 *
	 */
	public void if_bank_ac_cd(String value) {
		setConstString(offset + 142, $if_bank_ac_cd, value);
	}

	/**
	 * 口座区分. Bank account type.<p>
	 *
	 */
	public String bank_ac_typ() {
		return getConstString(offset + 143, $bank_ac_typ);
	}

	/**
	 * 口座区分. Bank account type.<p>
	 *
	 */
	public void bank_ac_typ(String value) {
		setConstString(offset + 143, $bank_ac_typ, value);
	}

	/**
	 * 口座番号. Bank account number.<p>
	 *
	 */
	public String bank_ac_no() {
		return getConstString(offset + 144, $bank_ac_no);
	}

	/**
	 * 口座番号. Bank account number.<p>
	 *
	 */
	public void bank_ac_no(String value) {
		setConstString(offset + 144, $bank_ac_no, value);
	}

	/**
	 * 口座名義. Bank account holder.<p>
	 *
	 */
	public String bank_ac_holder() {
		return getConstString(offset + 145, $bank_ac_holder);
	}

	/**
	 * 口座名義. Bank account holder.<p>
	 *
	 */
	public void bank_ac_holder(String value) {
		setConstString(offset + 145, $bank_ac_holder, value);
	}

	/**
	 * 口座名義別名. Account holder alias name.<p>
	 *
	 */
	public String bank_ac_holder_sub() {
		return getConstString(offset + 146, $bank_ac_holder_sub);
	}

	/**
	 * 口座名義別名. Account holder alias name.<p>
	 *
	 */
	public void bank_ac_holder_sub(String value) {
		setConstString(offset + 146, $bank_ac_holder_sub, value);
	}

	/**
	 * 銀行ＣＤ. Bank cd..<p>
	 *
	 */
	public String bank_cd() {
		return getConstString(offset + 147, $bank_cd);
	}

	/**
	 * 銀行ＣＤ. Bank cd..<p>
	 *
	 */
	public void bank_cd(String value) {
		setConstString(offset + 147, $bank_cd, value);
	}

	/**
	 * 銀行名. Bank name.<p>
	 *
	 */
	public String bank_nm() {
		return getConstString(offset + 148, $bank_nm);
	}

	/**
	 * 銀行名. Bank name.<p>
	 *
	 */
	public void bank_nm(String value) {
		setConstString(offset + 148, $bank_nm, value);
	}

	/**
	 * 支店ＣＤ. Branch cd..<p>
	 *
	 */
	public String branch_cd() {
		return getConstString(offset + 149, $branch_cd);
	}

	/**
	 * 支店ＣＤ. Branch cd..<p>
	 *
	 */
	public void branch_cd(String value) {
		setConstString(offset + 149, $branch_cd, value);
	}

	/**
	 * 支店名. Branch name.<p>
	 *
	 */
	public String branch_nm() {
		return getConstString(offset + 150, $branch_nm);
	}

	/**
	 * 支店名. Branch name.<p>
	 *
	 */
	public void branch_nm(String value) {
		setConstString(offset + 150, $branch_nm, value);
	}

	/**
	 * 取引ＣＤ. Transaction cd..<p>
	 *
	 */
	public String trd_cd() {
		return getConstString(offset + 151, $trd_cd);
	}

	/**
	 * 取引ＣＤ. Transaction cd..<p>
	 *
	 */
	public void trd_cd(String value) {
		setConstString(offset + 151, $trd_cd, value);
	}

	/**
	 * ＩＦ取引ＣＤ. IF transaction cd..<p>
	 *
	 */
	public String if_trd_cd() {
		return getConstString(offset + 152, $if_trd_cd);
	}

	/**
	 * ＩＦ取引ＣＤ. IF transaction cd..<p>
	 *
	 */
	public void if_trd_cd(String value) {
		setConstString(offset + 152, $if_trd_cd, value);
	}

	/**
	 * ＩＦ取引名. IF transaction name.<p>
	 *
	 */
	public String if_trd_nm() {
		return getConstString(offset + 153, $if_trd_nm);
	}

	/**
	 * ＩＦ取引名. IF transaction name.<p>
	 *
	 */
	public void if_trd_nm(String value) {
		setConstString(offset + 153, $if_trd_nm, value);
	}

	/**
	 * 取引パタン区分. Transaction pattern type.<p>
	 *
	 */
	public String trd_ptn_typ() {
		return getConstString(offset + 154, $trd_ptn_typ);
	}

	/**
	 * 取引パタン区分. Transaction pattern type.<p>
	 *
	 */
	public void trd_ptn_typ(String value) {
		setConstString(offset + 154, $trd_ptn_typ, value);
	}

	/**
	 * 伝票状況区分. Slip status type.<p>
	 *
	 */
	public String slip_sts_typ() {
		return getConstString(offset + 155, $slip_sts_typ);
	}

	/**
	 * 伝票状況区分. Slip status type.<p>
	 *
	 */
	public void slip_sts_typ(String value) {
		setConstString(offset + 155, $slip_sts_typ, value);
	}

	/**
	 * 納品書ＮＯ. Delivery note No..<p>
	 *
	 */
	public String dlv_slip_no() {
		return getConstString(offset + 156, $dlv_slip_no);
	}

	/**
	 * 納品書ＮＯ. Delivery note No..<p>
	 *
	 */
	public void dlv_slip_no(String value) {
		setConstString(offset + 156, $dlv_slip_no, value);
	}

	/**
	 * 納品書明細ＮＯ. Delivery note details No..<p>
	 *
	 */
	public String dlv_slip_d_no() {
		return getConstString(offset + 157, $dlv_slip_d_no);
	}

	/**
	 * 納品書明細ＮＯ. Delivery note details No..<p>
	 *
	 */
	public void dlv_slip_d_no(String value) {
		setConstString(offset + 157, $dlv_slip_d_no, value);
	}

	/**
	 * 出荷時納品書ＮＯ. Delivery note No. at shipping.<p>
	 *
	 */
	public String ship_dlv_slip_no() {
		return getConstString(offset + 158, $ship_dlv_slip_no);
	}

	/**
	 * 出荷時納品書ＮＯ. Delivery note No. at shipping.<p>
	 *
	 */
	public void ship_dlv_slip_no(String value) {
		setConstString(offset + 158, $ship_dlv_slip_no, value);
	}

	/**
	 * 出荷時納品書明細ＮＯ. Delivery note details No. at shipping.<p>
	 *
	 */
	public String ship_dlv_slip_d_no() {
		return getConstString(offset + 159, $ship_dlv_slip_d_no);
	}

	/**
	 * 出荷時納品書明細ＮＯ. Delivery note details No. at shipping.<p>
	 *
	 */
	public void ship_dlv_slip_d_no(String value) {
		setConstString(offset + 159, $ship_dlv_slip_d_no, value);
	}

	/**
	 * ヘッダ実績ＮＯ. Header result No..<p>
	 *
	 */
	public String act_no() {
		return getConstString(offset + 160, $act_no);
	}

	/**
	 * ヘッダ実績ＮＯ. Header result No..<p>
	 *
	 */
	public void act_no(String value) {
		setConstString(offset + 160, $act_no, value);
	}

	/**
	 * ヘッダ実績改訂番号. Header result rev. number.<p>
	 *
	 */
	public MCNumber act_rev() {
		return getConstNumber(offset + 161, $act_rev);
	}

	/**
	 * ヘッダ実績改訂番号. Header result rev. number.<p>
	 *
	 */
	public void act_rev(MCNumber value) {
		setConstNumber(offset + 161, $act_rev, value);
	}
	
	/**
	 * ヘッダ実績改訂番号. Header result rev. number.<p>
	 *
	 */
	public void act_rev(int value) {
		setConstNumber(offset + 161, $act_rev, value);
	}
	
	/**
	 * ヘッダ実績改訂番号. Header result rev. number.<p>
	 *
	 */
	public void act_rev(long value) {
		setConstNumber(offset + 161, $act_rev, value);
	}
	
	/**
	 * ヘッダ実績改訂番号. Header result rev. number.<p>
	 *
	 */
	public void act_rev(float value) {
		setConstNumber(offset + 161, $act_rev, value);
	}
	
	/**
	 * ヘッダ実績改訂番号. Header result rev. number.<p>
	 *
	 */
	public void act_rev(double value) {
		setConstNumber(offset + 161, $act_rev, value);
	}
	
	/**
	 * 明細実績ＮＯ. Details result No..<p>
	 *
	 */
	public String act_d_no() {
		return getConstString(offset + 162, $act_d_no);
	}

	/**
	 * 明細実績ＮＯ. Details result No..<p>
	 *
	 */
	public void act_d_no(String value) {
		setConstString(offset + 162, $act_d_no, value);
	}

	/**
	 * 発注ＮＯ. PO No..<p>
	 *
	 */
	public String po_no() {
		return getConstString(offset + 163, $po_no);
	}

	/**
	 * 発注ＮＯ. PO No..<p>
	 *
	 */
	public void po_no(String value) {
		setConstString(offset + 163, $po_no, value);
	}

	/**
	 * 発注明細ＮＯ. PO details No..<p>
	 *
	 */
	public String po_d_no() {
		return getConstString(offset + 164, $po_d_no);
	}

	/**
	 * 発注明細ＮＯ. PO details No..<p>
	 *
	 */
	public void po_d_no(String value) {
		setConstString(offset + 164, $po_d_no, value);
	}

	/**
	 * 計上日. Recording date.<p>
	 *
	 */
	public MCDate ac_dt() {
		return getConstDate(offset + 165, $ac_dt);
	}

	/**
	 * 計上日. Recording date.<p>
	 *
	 */
	public void ac_dt(MCDate value) {
		setConstDate(offset + 165, $ac_dt, value);
	}

	/**
	 * 納品日. Delivery date.<p>
	 *
	 */
	public MCDate dlv_dt() {
		return getConstDate(offset + 166, $dlv_dt);
	}

	/**
	 * 納品日. Delivery date.<p>
	 *
	 */
	public void dlv_dt(MCDate value) {
		setConstDate(offset + 166, $dlv_dt, value);
	}

	/**
	 * 入金日. Payment received date.<p>
	 *
	 */
	public MCDate rcv_dt() {
		return getConstDate(offset + 167, $rcv_dt);
	}

	/**
	 * 入金日. Payment received date.<p>
	 *
	 */
	public void rcv_dt(MCDate value) {
		setConstDate(offset + 167, $rcv_dt, value);
	}

	/**
	 * 請求起算日. Billing base date.<p>
	 *
	 */
	public MCDate bill_basis_dt() {
		return getConstDate(offset + 168, $bill_basis_dt);
	}

	/**
	 * 請求起算日. Billing base date.<p>
	 *
	 */
	public void bill_basis_dt(MCDate value) {
		setConstDate(offset + 168, $bill_basis_dt, value);
	}

	/**
	 * 計上日（基）. Recording date (Base).<p>
	 *
	 */
	public MCDate base_ac_dt() {
		return getConstDate(offset + 169, $base_ac_dt);
	}

	/**
	 * 計上日（基）. Recording date (Base).<p>
	 *
	 */
	public void base_ac_dt(MCDate value) {
		setConstDate(offset + 169, $base_ac_dt, value);
	}

	/**
	 * 品目ＣＤ. Item cd..<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 170, $itm_cd);
	}

	/**
	 * 品目ＣＤ. Item cd..<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 170, $itm_cd, value);
	}

	/**
	 * 枝番１. Branch No. 1.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 171, $itm_sub1);
	}

	/**
	 * 枝番１. Branch No. 1.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 171, $itm_sub1, value);
	}

	/**
	 * 枝番２. Branch No. 2.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 172, $itm_sub2);
	}

	/**
	 * 枝番２. Branch No. 2.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 172, $itm_sub2, value);
	}

	/**
	 * 枝番３. Branch No. 3.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 173, $itm_sub3);
	}

	/**
	 * 枝番３. Branch No. 3.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 173, $itm_sub3, value);
	}

	/**
	 * ＩＦ品目ＣＤ. IF item cd..<p>
	 *
	 */
	public String if_itm_cd() {
		return getConstString(offset + 174, $if_itm_cd);
	}

	/**
	 * ＩＦ品目ＣＤ. IF item cd..<p>
	 *
	 */
	public void if_itm_cd(String value) {
		setConstString(offset + 174, $if_itm_cd, value);
	}

	/**
	 * ＩＦ枝番１. IF branch No. 1.<p>
	 *
	 */
	public String if_itm_sub1() {
		return getConstString(offset + 175, $if_itm_sub1);
	}

	/**
	 * ＩＦ枝番１. IF branch No. 1.<p>
	 *
	 */
	public void if_itm_sub1(String value) {
		setConstString(offset + 175, $if_itm_sub1, value);
	}

	/**
	 * ＩＦ枝番２. IF branch No. 2.<p>
	 *
	 */
	public String if_itm_sub2() {
		return getConstString(offset + 176, $if_itm_sub2);
	}

	/**
	 * ＩＦ枝番２. IF branch No. 2.<p>
	 *
	 */
	public void if_itm_sub2(String value) {
		setConstString(offset + 176, $if_itm_sub2, value);
	}

	/**
	 * ＩＦ枝番３. IF branch No. 3.<p>
	 *
	 */
	public String if_itm_sub3() {
		return getConstString(offset + 177, $if_itm_sub3);
	}

	/**
	 * ＩＦ枝番３. IF branch No. 3.<p>
	 *
	 */
	public void if_itm_sub3(String value) {
		setConstString(offset + 177, $if_itm_sub3, value);
	}

	/**
	 * ＩＦ品名. IF item name.<p>
	 *
	 */
	public String if_itm_nm() {
		return getConstString(offset + 178, $if_itm_nm);
	}

	/**
	 * ＩＦ品名. IF item name.<p>
	 *
	 */
	public void if_itm_nm(String value) {
		setConstString(offset + 178, $if_itm_nm, value);
	}

	/**
	 * 品目別名１. Item alias name 1.<p>
	 *
	 */
	public String itm_alt_nm1() {
		return getConstString(offset + 179, $itm_alt_nm1);
	}

	/**
	 * 品目別名１. Item alias name 1.<p>
	 *
	 */
	public void itm_alt_nm1(String value) {
		setConstString(offset + 179, $itm_alt_nm1, value);
	}

	/**
	 * 品目別名２. Item alias name 2.<p>
	 *
	 */
	public String itm_alt_nm2() {
		return getConstString(offset + 180, $itm_alt_nm2);
	}

	/**
	 * 品目別名２. Item alias name 2.<p>
	 *
	 */
	public void itm_alt_nm2(String value) {
		setConstString(offset + 180, $itm_alt_nm2, value);
	}

	/**
	 * 品目別名３. Item alias name 3.<p>
	 *
	 */
	public String itm_alt_nm3() {
		return getConstString(offset + 181, $itm_alt_nm3);
	}

	/**
	 * 品目別名３. Item alias name 3.<p>
	 *
	 */
	public void itm_alt_nm3(String value) {
		setConstString(offset + 181, $itm_alt_nm3, value);
	}

	/**
	 * 品目別名４. Item alias name 4.<p>
	 *
	 */
	public String itm_alt_nm4() {
		return getConstString(offset + 182, $itm_alt_nm4);
	}

	/**
	 * 品目別名４. Item alias name 4.<p>
	 *
	 */
	public void itm_alt_nm4(String value) {
		setConstString(offset + 182, $itm_alt_nm4, value);
	}

	/**
	 * 手配ＮＯ１. SEIBAN No. 1.<p>
	 *
	 */
	public String sno1() {
		return getConstString(offset + 183, $sno1);
	}

	/**
	 * 手配ＮＯ１. SEIBAN No. 1.<p>
	 *
	 */
	public void sno1(String value) {
		setConstString(offset + 183, $sno1, value);
	}

	/**
	 * 手配ＮＯ２. SEIBAN No. 2.<p>
	 *
	 */
	public String sno2() {
		return getConstString(offset + 184, $sno2);
	}

	/**
	 * 手配ＮＯ２. SEIBAN No. 2.<p>
	 *
	 */
	public void sno2(String value) {
		setConstString(offset + 184, $sno2, value);
	}

	/**
	 * 手配ＮＯ３. SEIBAN No. 3.<p>
	 *
	 */
	public String sno3() {
		return getConstString(offset + 185, $sno3);
	}

	/**
	 * 手配ＮＯ３. SEIBAN No. 3.<p>
	 *
	 */
	public void sno3(String value) {
		setConstString(offset + 185, $sno3, value);
	}

	/**
	 * 手配ＮＯ４. SEIBAN No. 4.<p>
	 *
	 */
	public String sno4() {
		return getConstString(offset + 186, $sno4);
	}

	/**
	 * 手配ＮＯ４. SEIBAN No. 4.<p>
	 *
	 */
	public void sno4(String value) {
		setConstString(offset + 186, $sno4, value);
	}

	/**
	 * 取引単位ＣＤ. Transaction unit cd..<p>
	 *
	 */
	public String trd_unit_cd() {
		return getConstString(offset + 187, $trd_unit_cd);
	}

	/**
	 * 取引単位ＣＤ. Transaction unit cd..<p>
	 *
	 */
	public void trd_unit_cd(String value) {
		setConstString(offset + 187, $trd_unit_cd, value);
	}

	/**
	 * ＩＦ取引単位ＣＤ. IF transaction unit cd..<p>
	 *
	 */
	public String if_trd_unit_cd() {
		return getConstString(offset + 188, $if_trd_unit_cd);
	}

	/**
	 * ＩＦ取引単位ＣＤ. IF transaction unit cd..<p>
	 *
	 */
	public void if_trd_unit_cd(String value) {
		setConstString(offset + 188, $if_trd_unit_cd, value);
	}

	/**
	 * ＩＦ取引単位名. IF transaction unit name.<p>
	 *
	 */
	public String if_trd_unit_nm() {
		return getConstString(offset + 189, $if_trd_unit_nm);
	}

	/**
	 * ＩＦ取引単位名. IF transaction unit name.<p>
	 *
	 */
	public void if_trd_unit_nm(String value) {
		setConstString(offset + 189, $if_trd_unit_nm, value);
	}

	/**
	 * 取引単位数量. Transaction unit qty..<p>
	 *
	 */
	public MCNumber trd_unit_qty() {
		return getConstNumber(offset + 190, $trd_unit_qty);
	}

	/**
	 * 取引単位数量. Transaction unit qty..<p>
	 *
	 */
	public void trd_unit_qty(MCNumber value) {
		setConstNumber(offset + 190, $trd_unit_qty, value);
	}
	
	/**
	 * 取引単位数量. Transaction unit qty..<p>
	 *
	 */
	public void trd_unit_qty(int value) {
		setConstNumber(offset + 190, $trd_unit_qty, value);
	}
	
	/**
	 * 取引単位数量. Transaction unit qty..<p>
	 *
	 */
	public void trd_unit_qty(long value) {
		setConstNumber(offset + 190, $trd_unit_qty, value);
	}
	
	/**
	 * 取引単位数量. Transaction unit qty..<p>
	 *
	 */
	public void trd_unit_qty(float value) {
		setConstNumber(offset + 190, $trd_unit_qty, value);
	}
	
	/**
	 * 取引単位数量. Transaction unit qty..<p>
	 *
	 */
	public void trd_unit_qty(double value) {
		setConstNumber(offset + 190, $trd_unit_qty, value);
	}
	
	/**
	 * 仮単価ＦＬＧ. Temporary unit price flg..<p>
	 *
	 */
	public boolean interim_flg() {
		return getConstBoolean(offset + 191, $interim_flg);
	}

	/**
	 * 仮単価ＦＬＧ. Temporary unit price flg..<p>
	 *
	 */
	public void interim_flg(boolean value) {
		setConstBoolean(offset + 191, $interim_flg, value);
	}

	/**
	 * 取引通貨単価. Unit price (Transaction currency).<p>
	 *
	 */
	public MCNumber trd_cur_upri() {
		return getConstNumber(offset + 192, $trd_cur_upri);
	}

	/**
	 * 取引通貨単価. Unit price (Transaction currency).<p>
	 *
	 */
	public void trd_cur_upri(MCNumber value) {
		setConstNumber(offset + 192, $trd_cur_upri, value);
	}
	
	/**
	 * 取引通貨単価. Unit price (Transaction currency).<p>
	 *
	 */
	public void trd_cur_upri(int value) {
		setConstNumber(offset + 192, $trd_cur_upri, value);
	}
	
	/**
	 * 取引通貨単価. Unit price (Transaction currency).<p>
	 *
	 */
	public void trd_cur_upri(long value) {
		setConstNumber(offset + 192, $trd_cur_upri, value);
	}
	
	/**
	 * 取引通貨単価. Unit price (Transaction currency).<p>
	 *
	 */
	public void trd_cur_upri(float value) {
		setConstNumber(offset + 192, $trd_cur_upri, value);
	}
	
	/**
	 * 取引通貨単価. Unit price (Transaction currency).<p>
	 *
	 */
	public void trd_cur_upri(double value) {
		setConstNumber(offset + 192, $trd_cur_upri, value);
	}
	
	/**
	 * 取引通貨金額. Amount (Transaction currency).<p>
	 *
	 */
	public MCNumber trd_cur_amt() {
		return getConstNumber(offset + 193, $trd_cur_amt);
	}

	/**
	 * 取引通貨金額. Amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_amt(MCNumber value) {
		setConstNumber(offset + 193, $trd_cur_amt, value);
	}
	
	/**
	 * 取引通貨金額. Amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_amt(int value) {
		setConstNumber(offset + 193, $trd_cur_amt, value);
	}
	
	/**
	 * 取引通貨金額. Amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_amt(long value) {
		setConstNumber(offset + 193, $trd_cur_amt, value);
	}
	
	/**
	 * 取引通貨金額. Amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_amt(float value) {
		setConstNumber(offset + 193, $trd_cur_amt, value);
	}
	
	/**
	 * 取引通貨金額. Amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_amt(double value) {
		setConstNumber(offset + 193, $trd_cur_amt, value);
	}
	
	/**
	 * 取引通貨値引額. Discount amount (Transaction currency).<p>
	 *
	 */
	public MCNumber trd_cur_dscnt_amt() {
		return getConstNumber(offset + 194, $trd_cur_dscnt_amt);
	}

	/**
	 * 取引通貨値引額. Discount amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_dscnt_amt(MCNumber value) {
		setConstNumber(offset + 194, $trd_cur_dscnt_amt, value);
	}
	
	/**
	 * 取引通貨値引額. Discount amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_dscnt_amt(int value) {
		setConstNumber(offset + 194, $trd_cur_dscnt_amt, value);
	}
	
	/**
	 * 取引通貨値引額. Discount amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_dscnt_amt(long value) {
		setConstNumber(offset + 194, $trd_cur_dscnt_amt, value);
	}
	
	/**
	 * 取引通貨値引額. Discount amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_dscnt_amt(float value) {
		setConstNumber(offset + 194, $trd_cur_dscnt_amt, value);
	}
	
	/**
	 * 取引通貨値引額. Discount amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_dscnt_amt(double value) {
		setConstNumber(offset + 194, $trd_cur_dscnt_amt, value);
	}
	
	/**
	 * 税ＣＤ. Tax cd..<p>
	 *
	 */
	public String tax_cd() {
		return getConstString(offset + 195, $tax_cd);
	}

	/**
	 * 税ＣＤ. Tax cd..<p>
	 *
	 */
	public void tax_cd(String value) {
		setConstString(offset + 195, $tax_cd, value);
	}

	/**
	 * ＩＦ税ＣＤ. IF tax cd..<p>
	 *
	 */
	public String if_tax_cd() {
		return getConstString(offset + 196, $if_tax_cd);
	}

	/**
	 * ＩＦ税ＣＤ. IF tax cd..<p>
	 *
	 */
	public void if_tax_cd(String value) {
		setConstString(offset + 196, $if_tax_cd, value);
	}

	/**
	 * ＩＦ税名. IF tax name.<p>
	 *
	 */
	public String if_tax_nm() {
		return getConstString(offset + 197, $if_tax_nm);
	}

	/**
	 * ＩＦ税名. IF tax name.<p>
	 *
	 */
	public void if_tax_nm(String value) {
		setConstString(offset + 197, $if_tax_nm, value);
	}

	/**
	 * 税率. Tax rate.<p>
	 *
	 */
	public MCNumber tax_rate() {
		return getConstNumber(offset + 198, $tax_rate);
	}

	/**
	 * 税率. Tax rate.<p>
	 *
	 */
	public void tax_rate(MCNumber value) {
		setConstNumber(offset + 198, $tax_rate, value);
	}
	
	/**
	 * 税率. Tax rate.<p>
	 *
	 */
	public void tax_rate(int value) {
		setConstNumber(offset + 198, $tax_rate, value);
	}
	
	/**
	 * 税率. Tax rate.<p>
	 *
	 */
	public void tax_rate(long value) {
		setConstNumber(offset + 198, $tax_rate, value);
	}
	
	/**
	 * 税率. Tax rate.<p>
	 *
	 */
	public void tax_rate(float value) {
		setConstNumber(offset + 198, $tax_rate, value);
	}
	
	/**
	 * 税率. Tax rate.<p>
	 *
	 */
	public void tax_rate(double value) {
		setConstNumber(offset + 198, $tax_rate, value);
	}
	
	/**
	 * 内税ＦＬＧ. Tax inclusive flg..<p>
	 *
	 */
	public boolean inc_tax_flg() {
		return getConstBoolean(offset + 199, $inc_tax_flg);
	}

	/**
	 * 内税ＦＬＧ. Tax inclusive flg..<p>
	 *
	 */
	public void inc_tax_flg(boolean value) {
		setConstBoolean(offset + 199, $inc_tax_flg, value);
	}

	/**
	 * 取引通貨税額. Tax amount (Transaction currency).<p>
	 *
	 */
	public MCNumber trd_cur_tax_amt() {
		return getConstNumber(offset + 200, $trd_cur_tax_amt);
	}

	/**
	 * 取引通貨税額. Tax amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_tax_amt(MCNumber value) {
		setConstNumber(offset + 200, $trd_cur_tax_amt, value);
	}
	
	/**
	 * 取引通貨税額. Tax amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_tax_amt(int value) {
		setConstNumber(offset + 200, $trd_cur_tax_amt, value);
	}
	
	/**
	 * 取引通貨税額. Tax amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_tax_amt(long value) {
		setConstNumber(offset + 200, $trd_cur_tax_amt, value);
	}
	
	/**
	 * 取引通貨税額. Tax amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_tax_amt(float value) {
		setConstNumber(offset + 200, $trd_cur_tax_amt, value);
	}
	
	/**
	 * 取引通貨税額. Tax amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_tax_amt(double value) {
		setConstNumber(offset + 200, $trd_cur_tax_amt, value);
	}
	
	/**
	 * 明細備考. Details remarks.<p>
	 *
	 */
	public String trd_d_rmrks() {
		return getConstString(offset + 201, $trd_d_rmrks);
	}

	/**
	 * 明細備考. Details remarks.<p>
	 *
	 */
	public void trd_d_rmrks(String value) {
		setConstString(offset + 201, $trd_d_rmrks, value);
	}

	/**
	 * ＩＦ会社ＣＤ. IF company cd..<p>
	 *
	 */
	public String if_co_cd() {
		return getConstString(offset + 202, $if_co_cd);
	}

	/**
	 * ＩＦ会社ＣＤ. IF company cd..<p>
	 *
	 */
	public void if_co_cd(String value) {
		setConstString(offset + 202, $if_co_cd, value);
	}

	/**
	 * ＩＦ会社名. IF company name.<p>
	 *
	 */
	public String if_co_nm() {
		return getConstString(offset + 203, $if_co_nm);
	}

	/**
	 * ＩＦ会社名. IF company name.<p>
	 *
	 */
	public void if_co_nm(String value) {
		setConstString(offset + 203, $if_co_nm, value);
	}

	/**
	 * 請求書宛先. Invoice destination.<p>
	 *
	 */
	public String bill_bcst_nm() {
		return getConstString(offset + 204, $bill_bcst_nm);
	}

	/**
	 * 請求書宛先. Invoice destination.<p>
	 *
	 */
	public void bill_bcst_nm(String value) {
		setConstString(offset + 204, $bill_bcst_nm, value);
	}

	/**
	 * 請求書送付法人番号. Invoice send-to corporation No..<p>
	 *
	 */
	public String bill_ein() {
		return getConstString(offset + 205, $bill_ein);
	}

	/**
	 * 請求書送付法人番号. Invoice send-to corporation No..<p>
	 *
	 */
	public void bill_ein(String value) {
		setConstString(offset + 205, $bill_ein, value);
	}

	/**
	 * 請求書送付事業者ＮＯ. Invoice send-to business No..<p>
	 *
	 */
	public String bill_biz_co_no() {
		return getConstString(offset + 206, $bill_biz_co_no);
	}

	/**
	 * 請求書送付事業者ＮＯ. Invoice send-to business No..<p>
	 *
	 */
	public void bill_biz_co_no(String value) {
		setConstString(offset + 206, $bill_biz_co_no, value);
	}

	/**
	 * 請求書送付郵便番号. Invoice send-to zip code.<p>
	 *
	 */
	public String bill_zip_cd() {
		return getConstString(offset + 207, $bill_zip_cd);
	}

	/**
	 * 請求書送付郵便番号. Invoice send-to zip code.<p>
	 *
	 */
	public void bill_zip_cd(String value) {
		setConstString(offset + 207, $bill_zip_cd, value);
	}

	/**
	 * 請求書送付住所１. Invoice send-to address 1.<p>
	 *
	 */
	public String bill_addr1() {
		return getConstString(offset + 208, $bill_addr1);
	}

	/**
	 * 請求書送付住所１. Invoice send-to address 1.<p>
	 *
	 */
	public void bill_addr1(String value) {
		setConstString(offset + 208, $bill_addr1, value);
	}

	/**
	 * 請求書送付住所２. Invoice send-to address 2.<p>
	 *
	 */
	public String bill_addr2() {
		return getConstString(offset + 209, $bill_addr2);
	}

	/**
	 * 請求書送付住所２. Invoice send-to address 2.<p>
	 *
	 */
	public void bill_addr2(String value) {
		setConstString(offset + 209, $bill_addr2, value);
	}

	/**
	 * 請求書送付住所３. Invoice send-to address 3.<p>
	 *
	 */
	public String bill_addr3() {
		return getConstString(offset + 210, $bill_addr3);
	}

	/**
	 * 請求書送付住所３. Invoice send-to address 3.<p>
	 *
	 */
	public void bill_addr3(String value) {
		setConstString(offset + 210, $bill_addr3, value);
	}

	/**
	 * 請求書送付住所４. Invoice send-to address 4.<p>
	 *
	 */
	public String bill_addr4() {
		return getConstString(offset + 211, $bill_addr4);
	}

	/**
	 * 請求書送付住所４. Invoice send-to address 4.<p>
	 *
	 */
	public void bill_addr4(String value) {
		setConstString(offset + 211, $bill_addr4, value);
	}

	/**
	 * 請求書送付部署. Invoice send-to dept..<p>
	 *
	 */
	public String bill_bcst_dpt() {
		return getConstString(offset + 212, $bill_bcst_dpt);
	}

	/**
	 * 請求書送付部署. Invoice send-to dept..<p>
	 *
	 */
	public void bill_bcst_dpt(String value) {
		setConstString(offset + 212, $bill_bcst_dpt, value);
	}

	/**
	 * 請求書送付ＴＥＬ. Invoice send-to TEL.<p>
	 *
	 */
	public String bill_tel() {
		return getConstString(offset + 213, $bill_tel);
	}

	/**
	 * 請求書送付ＴＥＬ. Invoice send-to TEL.<p>
	 *
	 */
	public void bill_tel(String value) {
		setConstString(offset + 213, $bill_tel, value);
	}

	/**
	 * ログＮＯ. Log No..<p>
	 *
	 */
	public String batch_log_no() {
		return getConstString(offset + 214, $batch_log_no);
	}

	/**
	 * ログＮＯ. Log No..<p>
	 *
	 */
	public void batch_log_no(String value) {
		setConstString(offset + 214, $batch_log_no, value);
	}

	/**
	 * ログサブキー１. Log sub key 1.<p>
	 *
	 */
	public MCNumber log_sub_key1() {
		return getConstNumber(offset + 215, $log_sub_key1);
	}

	/**
	 * ログサブキー１. Log sub key 1.<p>
	 *
	 */
	public void log_sub_key1(MCNumber value) {
		setConstNumber(offset + 215, $log_sub_key1, value);
	}
	
	/**
	 * ログサブキー１. Log sub key 1.<p>
	 *
	 */
	public void log_sub_key1(int value) {
		setConstNumber(offset + 215, $log_sub_key1, value);
	}
	
	/**
	 * ログサブキー１. Log sub key 1.<p>
	 *
	 */
	public void log_sub_key1(long value) {
		setConstNumber(offset + 215, $log_sub_key1, value);
	}
	
	/**
	 * ログサブキー１. Log sub key 1.<p>
	 *
	 */
	public void log_sub_key1(float value) {
		setConstNumber(offset + 215, $log_sub_key1, value);
	}
	
	/**
	 * ログサブキー１. Log sub key 1.<p>
	 *
	 */
	public void log_sub_key1(double value) {
		setConstNumber(offset + 215, $log_sub_key1, value);
	}
	
	/**
	 * ログサブキー２. Log sub key 2.<p>
	 *
	 */
	public MCNumber log_sub_key2() {
		return getConstNumber(offset + 216, $log_sub_key2);
	}

	/**
	 * ログサブキー２. Log sub key 2.<p>
	 *
	 */
	public void log_sub_key2(MCNumber value) {
		setConstNumber(offset + 216, $log_sub_key2, value);
	}
	
	/**
	 * ログサブキー２. Log sub key 2.<p>
	 *
	 */
	public void log_sub_key2(int value) {
		setConstNumber(offset + 216, $log_sub_key2, value);
	}
	
	/**
	 * ログサブキー２. Log sub key 2.<p>
	 *
	 */
	public void log_sub_key2(long value) {
		setConstNumber(offset + 216, $log_sub_key2, value);
	}
	
	/**
	 * ログサブキー２. Log sub key 2.<p>
	 *
	 */
	public void log_sub_key2(float value) {
		setConstNumber(offset + 216, $log_sub_key2, value);
	}
	
	/**
	 * ログサブキー２. Log sub key 2.<p>
	 *
	 */
	public void log_sub_key2(double value) {
		setConstNumber(offset + 216, $log_sub_key2, value);
	}
	
	/**
	 * 予備ＣＨＡＲ項目１. Spare CHAR column 1.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 217, $sub_char1);
	}

	/**
	 * 予備ＣＨＡＲ項目１. Spare CHAR column 1.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 217, $sub_char1, value);
	}

	/**
	 * 予備ＣＨＡＲ項目２. Spare CHAR column 2.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 218, $sub_char2);
	}

	/**
	 * 予備ＣＨＡＲ項目２. Spare CHAR column 2.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 218, $sub_char2, value);
	}

	/**
	 * 予備ＣＨＡＲ項目３. Spare CHAR column 3.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 219, $sub_char3);
	}

	/**
	 * 予備ＣＨＡＲ項目３. Spare CHAR column 3.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 219, $sub_char3, value);
	}

	/**
	 * 予備ＣＨＡＲ項目４. Spare CHAR column 4.<p>
	 *
	 */
	public String sub_char4() {
		return getConstString(offset + 220, $sub_char4);
	}

	/**
	 * 予備ＣＨＡＲ項目４. Spare CHAR column 4.<p>
	 *
	 */
	public void sub_char4(String value) {
		setConstString(offset + 220, $sub_char4, value);
	}

	/**
	 * 予備ＣＨＡＲ項目５. Spare CHAR column 5.<p>
	 *
	 */
	public String sub_char5() {
		return getConstString(offset + 221, $sub_char5);
	}

	/**
	 * 予備ＣＨＡＲ項目５. Spare CHAR column 5.<p>
	 *
	 */
	public void sub_char5(String value) {
		setConstString(offset + 221, $sub_char5, value);
	}

	/**
	 * 予備ＣＨＡＲ項目６. Spare CHAR column 6.<p>
	 *
	 */
	public String sub_char6() {
		return getConstString(offset + 222, $sub_char6);
	}

	/**
	 * 予備ＣＨＡＲ項目６. Spare CHAR column 6.<p>
	 *
	 */
	public void sub_char6(String value) {
		setConstString(offset + 222, $sub_char6, value);
	}

	/**
	 * 予備ＣＨＡＲ項目７. Spare CHAR column 7.<p>
	 *
	 */
	public String sub_char7() {
		return getConstString(offset + 223, $sub_char7);
	}

	/**
	 * 予備ＣＨＡＲ項目７. Spare CHAR column 7.<p>
	 *
	 */
	public void sub_char7(String value) {
		setConstString(offset + 223, $sub_char7, value);
	}

	/**
	 * 予備ＣＨＡＲ項目８. Spare CHAR column 8.<p>
	 *
	 */
	public String sub_char8() {
		return getConstString(offset + 224, $sub_char8);
	}

	/**
	 * 予備ＣＨＡＲ項目８. Spare CHAR column 8.<p>
	 *
	 */
	public void sub_char8(String value) {
		setConstString(offset + 224, $sub_char8, value);
	}

	/**
	 * 予備ＣＨＡＲ項目９. Spare CHAR column 9.<p>
	 *
	 */
	public String sub_char9() {
		return getConstString(offset + 225, $sub_char9);
	}

	/**
	 * 予備ＣＨＡＲ項目９. Spare CHAR column 9.<p>
	 *
	 */
	public void sub_char9(String value) {
		setConstString(offset + 225, $sub_char9, value);
	}

	/**
	 * 予備ＣＨＡＲ項目１０. Spare CHAR column 10.<p>
	 *
	 */
	public String sub_char10() {
		return getConstString(offset + 226, $sub_char10);
	}

	/**
	 * 予備ＣＨＡＲ項目１０. Spare CHAR column 10.<p>
	 *
	 */
	public void sub_char10(String value) {
		setConstString(offset + 226, $sub_char10, value);
	}

	/**
	 * 予備ＣＨＡＲ項目１１. Spare CHAR column 11.<p>
	 *
	 */
	public String sub_char11() {
		return getConstString(offset + 227, $sub_char11);
	}

	/**
	 * 予備ＣＨＡＲ項目１１. Spare CHAR column 11.<p>
	 *
	 */
	public void sub_char11(String value) {
		setConstString(offset + 227, $sub_char11, value);
	}

	/**
	 * 予備ＣＨＡＲ項目１２. Spare CHAR column 12.<p>
	 *
	 */
	public String sub_char12() {
		return getConstString(offset + 228, $sub_char12);
	}

	/**
	 * 予備ＣＨＡＲ項目１２. Spare CHAR column 12.<p>
	 *
	 */
	public void sub_char12(String value) {
		setConstString(offset + 228, $sub_char12, value);
	}

	/**
	 * 予備ＣＨＡＲ項目１３. Spare CHAR column 13.<p>
	 *
	 */
	public String sub_char13() {
		return getConstString(offset + 229, $sub_char13);
	}

	/**
	 * 予備ＣＨＡＲ項目１３. Spare CHAR column 13.<p>
	 *
	 */
	public void sub_char13(String value) {
		setConstString(offset + 229, $sub_char13, value);
	}

	/**
	 * 予備ＣＨＡＲ項目１４. Spare CHAR column 14.<p>
	 *
	 */
	public String sub_char14() {
		return getConstString(offset + 230, $sub_char14);
	}

	/**
	 * 予備ＣＨＡＲ項目１４. Spare CHAR column 14.<p>
	 *
	 */
	public void sub_char14(String value) {
		setConstString(offset + 230, $sub_char14, value);
	}

	/**
	 * 予備ＣＨＡＲ項目１５. Spare CHAR column 15.<p>
	 *
	 */
	public String sub_char15() {
		return getConstString(offset + 231, $sub_char15);
	}

	/**
	 * 予備ＣＨＡＲ項目１５. Spare CHAR column 15.<p>
	 *
	 */
	public void sub_char15(String value) {
		setConstString(offset + 231, $sub_char15, value);
	}

	/**
	 * 予備ＣＨＡＲ項目１６. Spare CHAR column 16.<p>
	 *
	 */
	public String sub_char16() {
		return getConstString(offset + 232, $sub_char16);
	}

	/**
	 * 予備ＣＨＡＲ項目１６. Spare CHAR column 16.<p>
	 *
	 */
	public void sub_char16(String value) {
		setConstString(offset + 232, $sub_char16, value);
	}

	/**
	 * 予備ＣＨＡＲ項目１７. Spare CHAR column 17.<p>
	 *
	 */
	public String sub_char17() {
		return getConstString(offset + 233, $sub_char17);
	}

	/**
	 * 予備ＣＨＡＲ項目１７. Spare CHAR column 17.<p>
	 *
	 */
	public void sub_char17(String value) {
		setConstString(offset + 233, $sub_char17, value);
	}

	/**
	 * 予備ＣＨＡＲ項目１８. Spare CHAR column 18.<p>
	 *
	 */
	public String sub_char18() {
		return getConstString(offset + 234, $sub_char18);
	}

	/**
	 * 予備ＣＨＡＲ項目１８. Spare CHAR column 18.<p>
	 *
	 */
	public void sub_char18(String value) {
		setConstString(offset + 234, $sub_char18, value);
	}

	/**
	 * 予備ＣＨＡＲ項目１９. Spare CHAR column 19.<p>
	 *
	 */
	public String sub_char19() {
		return getConstString(offset + 235, $sub_char19);
	}

	/**
	 * 予備ＣＨＡＲ項目１９. Spare CHAR column 19.<p>
	 *
	 */
	public void sub_char19(String value) {
		setConstString(offset + 235, $sub_char19, value);
	}

	/**
	 * 予備ＣＨＡＲ項目２０. Spare CHAR column 20.<p>
	 *
	 */
	public String sub_char20() {
		return getConstString(offset + 236, $sub_char20);
	}

	/**
	 * 予備ＣＨＡＲ項目２０. Spare CHAR column 20.<p>
	 *
	 */
	public void sub_char20(String value) {
		setConstString(offset + 236, $sub_char20, value);
	}

	/**
	 * 予備ＣＨＡＲ項目２１. Spare CHAR column 21.<p>
	 *
	 */
	public String sub_char21() {
		return getConstString(offset + 237, $sub_char21);
	}

	/**
	 * 予備ＣＨＡＲ項目２１. Spare CHAR column 21.<p>
	 *
	 */
	public void sub_char21(String value) {
		setConstString(offset + 237, $sub_char21, value);
	}

	/**
	 * 予備ＣＨＡＲ項目２２. Spare CHAR column 22.<p>
	 *
	 */
	public String sub_char22() {
		return getConstString(offset + 238, $sub_char22);
	}

	/**
	 * 予備ＣＨＡＲ項目２２. Spare CHAR column 22.<p>
	 *
	 */
	public void sub_char22(String value) {
		setConstString(offset + 238, $sub_char22, value);
	}

	/**
	 * 予備ＣＨＡＲ項目２３. Spare CHAR column 23.<p>
	 *
	 */
	public String sub_char23() {
		return getConstString(offset + 239, $sub_char23);
	}

	/**
	 * 予備ＣＨＡＲ項目２３. Spare CHAR column 23.<p>
	 *
	 */
	public void sub_char23(String value) {
		setConstString(offset + 239, $sub_char23, value);
	}

	/**
	 * 予備ＣＨＡＲ項目２４. Spare CHAR column 24.<p>
	 *
	 */
	public String sub_char24() {
		return getConstString(offset + 240, $sub_char24);
	}

	/**
	 * 予備ＣＨＡＲ項目２４. Spare CHAR column 24.<p>
	 *
	 */
	public void sub_char24(String value) {
		setConstString(offset + 240, $sub_char24, value);
	}

	/**
	 * 予備ＣＨＡＲ項目２５. Spare CHAR column 25.<p>
	 *
	 */
	public String sub_char25() {
		return getConstString(offset + 241, $sub_char25);
	}

	/**
	 * 予備ＣＨＡＲ項目２５. Spare CHAR column 25.<p>
	 *
	 */
	public void sub_char25(String value) {
		setConstString(offset + 241, $sub_char25, value);
	}

	/**
	 * 予備ＣＨＡＲ項目２６. Spare CHAR column 26.<p>
	 *
	 */
	public String sub_char26() {
		return getConstString(offset + 242, $sub_char26);
	}

	/**
	 * 予備ＣＨＡＲ項目２６. Spare CHAR column 26.<p>
	 *
	 */
	public void sub_char26(String value) {
		setConstString(offset + 242, $sub_char26, value);
	}

	/**
	 * 予備ＣＨＡＲ項目２７. Spare CHAR column 27.<p>
	 *
	 */
	public String sub_char27() {
		return getConstString(offset + 243, $sub_char27);
	}

	/**
	 * 予備ＣＨＡＲ項目２７. Spare CHAR column 27.<p>
	 *
	 */
	public void sub_char27(String value) {
		setConstString(offset + 243, $sub_char27, value);
	}

	/**
	 * 予備ＣＨＡＲ項目２８. Spare CHAR column 28.<p>
	 *
	 */
	public String sub_char28() {
		return getConstString(offset + 244, $sub_char28);
	}

	/**
	 * 予備ＣＨＡＲ項目２８. Spare CHAR column 28.<p>
	 *
	 */
	public void sub_char28(String value) {
		setConstString(offset + 244, $sub_char28, value);
	}

	/**
	 * 予備ＣＨＡＲ項目２９. Spare CHAR column 29.<p>
	 *
	 */
	public String sub_char29() {
		return getConstString(offset + 245, $sub_char29);
	}

	/**
	 * 予備ＣＨＡＲ項目２９. Spare CHAR column 29.<p>
	 *
	 */
	public void sub_char29(String value) {
		setConstString(offset + 245, $sub_char29, value);
	}

	/**
	 * 予備ＣＨＡＲ項目３０. Spare CHAR column 30.<p>
	 *
	 */
	public String sub_char30() {
		return getConstString(offset + 246, $sub_char30);
	}

	/**
	 * 予備ＣＨＡＲ項目３０. Spare CHAR column 30.<p>
	 *
	 */
	public void sub_char30(String value) {
		setConstString(offset + 246, $sub_char30, value);
	}

	/**
	 * 予備ＮＵＭ項目１. Spare NUM column 1.<p>
	 *
	 */
	public MCNumber sub_num1() {
		return getConstNumber(offset + 247, $sub_num1);
	}

	/**
	 * 予備ＮＵＭ項目１. Spare NUM column 1.<p>
	 *
	 */
	public void sub_num1(MCNumber value) {
		setConstNumber(offset + 247, $sub_num1, value);
	}
	
	/**
	 * 予備ＮＵＭ項目１. Spare NUM column 1.<p>
	 *
	 */
	public void sub_num1(int value) {
		setConstNumber(offset + 247, $sub_num1, value);
	}
	
	/**
	 * 予備ＮＵＭ項目１. Spare NUM column 1.<p>
	 *
	 */
	public void sub_num1(long value) {
		setConstNumber(offset + 247, $sub_num1, value);
	}
	
	/**
	 * 予備ＮＵＭ項目１. Spare NUM column 1.<p>
	 *
	 */
	public void sub_num1(float value) {
		setConstNumber(offset + 247, $sub_num1, value);
	}
	
	/**
	 * 予備ＮＵＭ項目１. Spare NUM column 1.<p>
	 *
	 */
	public void sub_num1(double value) {
		setConstNumber(offset + 247, $sub_num1, value);
	}
	
	/**
	 * 予備ＮＵＭ項目２. Spare NUM column 2.<p>
	 *
	 */
	public MCNumber sub_num2() {
		return getConstNumber(offset + 248, $sub_num2);
	}

	/**
	 * 予備ＮＵＭ項目２. Spare NUM column 2.<p>
	 *
	 */
	public void sub_num2(MCNumber value) {
		setConstNumber(offset + 248, $sub_num2, value);
	}
	
	/**
	 * 予備ＮＵＭ項目２. Spare NUM column 2.<p>
	 *
	 */
	public void sub_num2(int value) {
		setConstNumber(offset + 248, $sub_num2, value);
	}
	
	/**
	 * 予備ＮＵＭ項目２. Spare NUM column 2.<p>
	 *
	 */
	public void sub_num2(long value) {
		setConstNumber(offset + 248, $sub_num2, value);
	}
	
	/**
	 * 予備ＮＵＭ項目２. Spare NUM column 2.<p>
	 *
	 */
	public void sub_num2(float value) {
		setConstNumber(offset + 248, $sub_num2, value);
	}
	
	/**
	 * 予備ＮＵＭ項目２. Spare NUM column 2.<p>
	 *
	 */
	public void sub_num2(double value) {
		setConstNumber(offset + 248, $sub_num2, value);
	}
	
	/**
	 * 予備ＮＵＭ項目３. Spare NUM column 3.<p>
	 *
	 */
	public MCNumber sub_num3() {
		return getConstNumber(offset + 249, $sub_num3);
	}

	/**
	 * 予備ＮＵＭ項目３. Spare NUM column 3.<p>
	 *
	 */
	public void sub_num3(MCNumber value) {
		setConstNumber(offset + 249, $sub_num3, value);
	}
	
	/**
	 * 予備ＮＵＭ項目３. Spare NUM column 3.<p>
	 *
	 */
	public void sub_num3(int value) {
		setConstNumber(offset + 249, $sub_num3, value);
	}
	
	/**
	 * 予備ＮＵＭ項目３. Spare NUM column 3.<p>
	 *
	 */
	public void sub_num3(long value) {
		setConstNumber(offset + 249, $sub_num3, value);
	}
	
	/**
	 * 予備ＮＵＭ項目３. Spare NUM column 3.<p>
	 *
	 */
	public void sub_num3(float value) {
		setConstNumber(offset + 249, $sub_num3, value);
	}
	
	/**
	 * 予備ＮＵＭ項目３. Spare NUM column 3.<p>
	 *
	 */
	public void sub_num3(double value) {
		setConstNumber(offset + 249, $sub_num3, value);
	}
	
	/**
	 * 予備ＮＵＭ項目４. Spare NUM column 4.<p>
	 *
	 */
	public MCNumber sub_num4() {
		return getConstNumber(offset + 250, $sub_num4);
	}

	/**
	 * 予備ＮＵＭ項目４. Spare NUM column 4.<p>
	 *
	 */
	public void sub_num4(MCNumber value) {
		setConstNumber(offset + 250, $sub_num4, value);
	}
	
	/**
	 * 予備ＮＵＭ項目４. Spare NUM column 4.<p>
	 *
	 */
	public void sub_num4(int value) {
		setConstNumber(offset + 250, $sub_num4, value);
	}
	
	/**
	 * 予備ＮＵＭ項目４. Spare NUM column 4.<p>
	 *
	 */
	public void sub_num4(long value) {
		setConstNumber(offset + 250, $sub_num4, value);
	}
	
	/**
	 * 予備ＮＵＭ項目４. Spare NUM column 4.<p>
	 *
	 */
	public void sub_num4(float value) {
		setConstNumber(offset + 250, $sub_num4, value);
	}
	
	/**
	 * 予備ＮＵＭ項目４. Spare NUM column 4.<p>
	 *
	 */
	public void sub_num4(double value) {
		setConstNumber(offset + 250, $sub_num4, value);
	}
	
	/**
	 * 予備ＮＵＭ項目５. Spare NUM column 5.<p>
	 *
	 */
	public MCNumber sub_num5() {
		return getConstNumber(offset + 251, $sub_num5);
	}

	/**
	 * 予備ＮＵＭ項目５. Spare NUM column 5.<p>
	 *
	 */
	public void sub_num5(MCNumber value) {
		setConstNumber(offset + 251, $sub_num5, value);
	}
	
	/**
	 * 予備ＮＵＭ項目５. Spare NUM column 5.<p>
	 *
	 */
	public void sub_num5(int value) {
		setConstNumber(offset + 251, $sub_num5, value);
	}
	
	/**
	 * 予備ＮＵＭ項目５. Spare NUM column 5.<p>
	 *
	 */
	public void sub_num5(long value) {
		setConstNumber(offset + 251, $sub_num5, value);
	}
	
	/**
	 * 予備ＮＵＭ項目５. Spare NUM column 5.<p>
	 *
	 */
	public void sub_num5(float value) {
		setConstNumber(offset + 251, $sub_num5, value);
	}
	
	/**
	 * 予備ＮＵＭ項目５. Spare NUM column 5.<p>
	 *
	 */
	public void sub_num5(double value) {
		setConstNumber(offset + 251, $sub_num5, value);
	}
	
	/**
	 * 予備ＤＡＴＥ項目１. Spare DATE column 1.<p>
	 *
	 */
	public MCDate sub_dt1() {
		return getConstDate(offset + 252, $sub_dt1);
	}

	/**
	 * 予備ＤＡＴＥ項目１. Spare DATE column 1.<p>
	 *
	 */
	public void sub_dt1(MCDate value) {
		setConstDate(offset + 252, $sub_dt1, value);
	}

	/**
	 * 予備ＤＡＴＥ項目２. Spare DATE column 2.<p>
	 *
	 */
	public MCDate sub_dt2() {
		return getConstDate(offset + 253, $sub_dt2);
	}

	/**
	 * 予備ＤＡＴＥ項目２. Spare DATE column 2.<p>
	 *
	 */
	public void sub_dt2(MCDate value) {
		setConstDate(offset + 253, $sub_dt2, value);
	}

	/**
	 * 予備ＤＡＴＥ項目３. Spare DATE column 3.<p>
	 *
	 */
	public MCDate sub_dt3() {
		return getConstDate(offset + 254, $sub_dt3);
	}

	/**
	 * 予備ＤＡＴＥ項目３. Spare DATE column 3.<p>
	 *
	 */
	public void sub_dt3(MCDate value) {
		setConstDate(offset + 254, $sub_dt3, value);
	}

	/**
	 * 予備ＤＡＴＥ項目４. Spare DATE column 4.<p>
	 *
	 */
	public MCDate sub_dt4() {
		return getConstDate(offset + 255, $sub_dt4);
	}

	/**
	 * 予備ＤＡＴＥ項目４. Spare DATE column 4.<p>
	 *
	 */
	public void sub_dt4(MCDate value) {
		setConstDate(offset + 255, $sub_dt4, value);
	}

	/**
	 * 予備ＤＡＴＥ項目５. Spare DATE column 5.<p>
	 *
	 */
	public MCDate sub_dt5() {
		return getConstDate(offset + 256, $sub_dt5);
	}

	/**
	 * 予備ＤＡＴＥ項目５. Spare DATE column 5.<p>
	 *
	 */
	public void sub_dt5(MCDate value) {
		setConstDate(offset + 256, $sub_dt5, value);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 257, $ins_usr_id);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 257, $ins_usr_id, value);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 258, $ins_usr_nm);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 258, $ins_usr_nm, value);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 259, $ins_ts);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 259, $ins_ts, value);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 260, $ins_func_id);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 260, $ins_func_id, value);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 261, $upd_cntr);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 261, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 261, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 261, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 261, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 261, $upd_cntr, value);
	}
	
	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 262, $upd_usr_id);
	}

	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 262, $upd_usr_id, value);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 263, $upd_usr_nm);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 263, $upd_usr_nm, value);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 264, $upd_ts);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 264, $upd_ts, value);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 265, $upd_func_id);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 265, $upd_func_id, value);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 266, $upd_srv_req_no);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 266, $upd_srv_req_no, value);
	}

	/**
	 * 送受信状況区分. Exporting and importing status type.<p>
	 *
	 */
	public String sdrv_sts_typ() {
		return getConstString(offset + 267, $sdrv_sts_typ);
	}

	/**
	 * 送受信状況区分. Exporting and importing status type.<p>
	 *
	 */
	public void sdrv_sts_typ(String value) {
		setConstString(offset + 267, $sdrv_sts_typ, value);
	}

	/**
	 * 請求元名. Billing source name.<p>
	 *
	 */
	public String bill_src_nm() {
		return getConstString(offset + 268, $bill_src_nm);
	}

	/**
	 * 請求元名. Billing source name.<p>
	 *
	 */
	public void bill_src_nm(String value) {
		setConstString(offset + 268, $bill_src_nm, value);
	}

	/**
	 * 取引通貨名. Transaction currency name.<p>
	 *
	 */
	public String trd_cur_nm() {
		return getConstString(offset + 269, $trd_cur_nm);
	}

	/**
	 * 取引通貨名. Transaction currency name.<p>
	 *
	 */
	public void trd_cur_nm(String value) {
		setConstString(offset + 269, $trd_cur_nm, value);
	}

	/**
	 * 口座名. Bank account name.<p>
	 *
	 */
	public String bank_ac_nm() {
		return getConstString(offset + 270, $bank_ac_nm);
	}

	/**
	 * 口座名. Bank account name.<p>
	 *
	 */
	public void bank_ac_nm(String value) {
		setConstString(offset + 270, $bank_ac_nm, value);
	}

	/**
	 * 支払方法名１. Payment method name 1.<p>
	 *
	 */
	public String pay_mtd_nm1() {
		return getConstString(offset + 271, $pay_mtd_nm1);
	}

	/**
	 * 支払方法名１. Payment method name 1.<p>
	 *
	 */
	public void pay_mtd_nm1(String value) {
		setConstString(offset + 271, $pay_mtd_nm1, value);
	}

	/**
	 * 支払方法名２. Payment method name 2.<p>
	 *
	 */
	public String pay_mtd_nm2() {
		return getConstString(offset + 272, $pay_mtd_nm2);
	}

	/**
	 * 支払方法名２. Payment method name 2.<p>
	 *
	 */
	public void pay_mtd_nm2(String value) {
		setConstString(offset + 272, $pay_mtd_nm2, value);
	}

	/**
	 * 支払方法名３. Payment method name 3.<p>
	 *
	 */
	public String pay_mtd_nm3() {
		return getConstString(offset + 273, $pay_mtd_nm3);
	}

	/**
	 * 支払方法名３. Payment method name 3.<p>
	 *
	 */
	public void pay_mtd_nm3(String value) {
		setConstString(offset + 273, $pay_mtd_nm3, value);
	}

	/**
	 * 支払方法名４. Payment method name 4.<p>
	 *
	 */
	public String pay_mtd_nm4() {
		return getConstString(offset + 274, $pay_mtd_nm4);
	}

	/**
	 * 支払方法名４. Payment method name 4.<p>
	 *
	 */
	public void pay_mtd_nm4(String value) {
		setConstString(offset + 274, $pay_mtd_nm4, value);
	}

	/**
	 * 支払方法名５. Payment method name 5.<p>
	 *
	 */
	public String pay_mtd_nm5() {
		return getConstString(offset + 275, $pay_mtd_nm5);
	}

	/**
	 * 支払方法名５. Payment method name 5.<p>
	 *
	 */
	public void pay_mtd_nm5(String value) {
		setConstString(offset + 275, $pay_mtd_nm5, value);
	}

	/**
	 * 支払方法名６. Payment method name 6.<p>
	 *
	 */
	public String pay_mtd_nm6() {
		return getConstString(offset + 276, $pay_mtd_nm6);
	}

	/**
	 * 支払方法名６. Payment method name 6.<p>
	 *
	 */
	public void pay_mtd_nm6(String value) {
		setConstString(offset + 276, $pay_mtd_nm6, value);
	}

	/**
	 * 支払方法名７. Payment method name 7.<p>
	 *
	 */
	public String pay_mtd_nm7() {
		return getConstString(offset + 277, $pay_mtd_nm7);
	}

	/**
	 * 支払方法名７. Payment method name 7.<p>
	 *
	 */
	public void pay_mtd_nm7(String value) {
		setConstString(offset + 277, $pay_mtd_nm7, value);
	}

	/**
	 * 支払方法名８. Payment method name 8.<p>
	 *
	 */
	public String pay_mtd_nm8() {
		return getConstString(offset + 278, $pay_mtd_nm8);
	}

	/**
	 * 支払方法名８. Payment method name 8.<p>
	 *
	 */
	public void pay_mtd_nm8(String value) {
		setConstString(offset + 278, $pay_mtd_nm8, value);
	}

	/**
	 * 支払方法名９. Payment method name 9.<p>
	 *
	 */
	public String pay_mtd_nm9() {
		return getConstString(offset + 279, $pay_mtd_nm9);
	}

	/**
	 * 支払方法名９. Payment method name 9.<p>
	 *
	 */
	public void pay_mtd_nm9(String value) {
		setConstString(offset + 279, $pay_mtd_nm9, value);
	}

	/**
	 * 支払方法名１０. Payment method name 10.<p>
	 *
	 */
	public String pay_mtd_nm10() {
		return getConstString(offset + 280, $pay_mtd_nm10);
	}

	/**
	 * 支払方法名１０. Payment method name 10.<p>
	 *
	 */
	public void pay_mtd_nm10(String value) {
		setConstString(offset + 280, $pay_mtd_nm10, value);
	}

	/**
	 * 取引名. Transaction name.<p>
	 *
	 */
	public String trd_nm() {
		return getConstString(offset + 281, $trd_nm);
	}

	/**
	 * 取引名. Transaction name.<p>
	 *
	 */
	public void trd_nm(String value) {
		setConstString(offset + 281, $trd_nm, value);
	}

	/**
	 * 品名. Item name.<p>
	 *
	 */
	public String itm_nm() {
		return getConstString(offset + 282, $itm_nm);
	}

	/**
	 * 品名. Item name.<p>
	 *
	 */
	public void itm_nm(String value) {
		setConstString(offset + 282, $itm_nm, value);
	}

	/**
	 * 取引単位名. Transaction unit name.<p>
	 *
	 */
	public String trd_unit_nm() {
		return getConstString(offset + 283, $trd_unit_nm);
	}

	/**
	 * 取引単位名. Transaction unit name.<p>
	 *
	 */
	public void trd_unit_nm(String value) {
		setConstString(offset + 283, $trd_unit_nm, value);
	}

	/**
	 * 税名. Tax name.<p>
	 *
	 */
	public String tax_nm() {
		return getConstString(offset + 284, $tax_nm);
	}

	/**
	 * 税名. Tax name.<p>
	 *
	 */
	public void tax_nm(String value) {
		setConstString(offset + 284, $tax_nm, value);
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
		if ($bill_no.equalsIgnoreCase(name)) {
			return bill_no();
		}
		if ($bill_d_no.equalsIgnoreCase(name)) {
			return bill_d_no();
		}
		if ($pre_bill_no.equalsIgnoreCase(name)) {
			return pre_bill_no();
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			return iv_no();
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			return wrk_no();
		}
		if ($wrk_nm.equalsIgnoreCase(name)) {
			return wrk_nm();
		}
		if ($bill_src_cd.equalsIgnoreCase(name)) {
			return bill_src_cd();
		}
		if ($if_bill_src_cd.equalsIgnoreCase(name)) {
			return if_bill_src_cd();
		}
		if ($if_bill_src_nm.equalsIgnoreCase(name)) {
			return if_bill_src_nm();
		}
		if ($bill_src_ein.equalsIgnoreCase(name)) {
			return bill_src_ein();
		}
		if ($bill_src_biz_co_no.equalsIgnoreCase(name)) {
			return bill_src_biz_co_no();
		}
		if ($bill_src_zip_cd.equalsIgnoreCase(name)) {
			return bill_src_zip_cd();
		}
		if ($bill_src_addr1.equalsIgnoreCase(name)) {
			return bill_src_addr1();
		}
		if ($bill_src_addr2.equalsIgnoreCase(name)) {
			return bill_src_addr2();
		}
		if ($bill_src_addr3.equalsIgnoreCase(name)) {
			return bill_src_addr3();
		}
		if ($bill_src_addr4.equalsIgnoreCase(name)) {
			return bill_src_addr4();
		}
		if ($bill_src_dpt.equalsIgnoreCase(name)) {
			return bill_src_dpt();
		}
		if ($bill_src_tel.equalsIgnoreCase(name)) {
			return bill_src_tel();
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($if_trd_cur_cd.equalsIgnoreCase(name)) {
			return if_trd_cur_cd();
		}
		if ($pay_mtd_cd1.equalsIgnoreCase(name)) {
			return pay_mtd_cd1();
		}
		if ($if_pay_mtd_cd1.equalsIgnoreCase(name)) {
			return if_pay_mtd_cd1();
		}
		if ($if_pay_mtd_nm1.equalsIgnoreCase(name)) {
			return if_pay_mtd_nm1();
		}
		if ($pay_mtd_cd2.equalsIgnoreCase(name)) {
			return pay_mtd_cd2();
		}
		if ($if_pay_mtd_cd2.equalsIgnoreCase(name)) {
			return if_pay_mtd_cd2();
		}
		if ($if_pay_mtd_nm2.equalsIgnoreCase(name)) {
			return if_pay_mtd_nm2();
		}
		if ($pay_mtd_cd3.equalsIgnoreCase(name)) {
			return pay_mtd_cd3();
		}
		if ($if_pay_mtd_cd3.equalsIgnoreCase(name)) {
			return if_pay_mtd_cd3();
		}
		if ($if_pay_mtd_nm3.equalsIgnoreCase(name)) {
			return if_pay_mtd_nm3();
		}
		if ($pay_mtd_cd4.equalsIgnoreCase(name)) {
			return pay_mtd_cd4();
		}
		if ($if_pay_mtd_cd4.equalsIgnoreCase(name)) {
			return if_pay_mtd_cd4();
		}
		if ($if_pay_mtd_nm4.equalsIgnoreCase(name)) {
			return if_pay_mtd_nm4();
		}
		if ($pay_mtd_cd5.equalsIgnoreCase(name)) {
			return pay_mtd_cd5();
		}
		if ($if_pay_mtd_cd5.equalsIgnoreCase(name)) {
			return if_pay_mtd_cd5();
		}
		if ($if_pay_mtd_nm5.equalsIgnoreCase(name)) {
			return if_pay_mtd_nm5();
		}
		if ($pay_mtd_cd6.equalsIgnoreCase(name)) {
			return pay_mtd_cd6();
		}
		if ($if_pay_mtd_cd6.equalsIgnoreCase(name)) {
			return if_pay_mtd_cd6();
		}
		if ($if_pay_mtd_nm6.equalsIgnoreCase(name)) {
			return if_pay_mtd_nm6();
		}
		if ($pay_mtd_cd7.equalsIgnoreCase(name)) {
			return pay_mtd_cd7();
		}
		if ($if_pay_mtd_cd7.equalsIgnoreCase(name)) {
			return if_pay_mtd_cd7();
		}
		if ($if_pay_mtd_nm7.equalsIgnoreCase(name)) {
			return if_pay_mtd_nm7();
		}
		if ($pay_mtd_cd8.equalsIgnoreCase(name)) {
			return pay_mtd_cd8();
		}
		if ($if_pay_mtd_cd8.equalsIgnoreCase(name)) {
			return if_pay_mtd_cd8();
		}
		if ($if_pay_mtd_nm8.equalsIgnoreCase(name)) {
			return if_pay_mtd_nm8();
		}
		if ($pay_mtd_cd9.equalsIgnoreCase(name)) {
			return pay_mtd_cd9();
		}
		if ($if_pay_mtd_cd9.equalsIgnoreCase(name)) {
			return if_pay_mtd_cd9();
		}
		if ($if_pay_mtd_nm9.equalsIgnoreCase(name)) {
			return if_pay_mtd_nm9();
		}
		if ($pay_mtd_cd10.equalsIgnoreCase(name)) {
			return pay_mtd_cd10();
		}
		if ($if_pay_mtd_cd10.equalsIgnoreCase(name)) {
			return if_pay_mtd_cd10();
		}
		if ($if_pay_mtd_nm10.equalsIgnoreCase(name)) {
			return if_pay_mtd_nm10();
		}
		if ($bank_ac_cd.equalsIgnoreCase(name)) {
			return bank_ac_cd();
		}
		if ($if_bank_ac_cd.equalsIgnoreCase(name)) {
			return if_bank_ac_cd();
		}
		if ($bank_ac_typ.equalsIgnoreCase(name)) {
			return bank_ac_typ();
		}
		if ($bank_ac_no.equalsIgnoreCase(name)) {
			return bank_ac_no();
		}
		if ($bank_ac_holder.equalsIgnoreCase(name)) {
			return bank_ac_holder();
		}
		if ($bank_ac_holder_sub.equalsIgnoreCase(name)) {
			return bank_ac_holder_sub();
		}
		if ($bank_cd.equalsIgnoreCase(name)) {
			return bank_cd();
		}
		if ($bank_nm.equalsIgnoreCase(name)) {
			return bank_nm();
		}
		if ($branch_cd.equalsIgnoreCase(name)) {
			return branch_cd();
		}
		if ($branch_nm.equalsIgnoreCase(name)) {
			return branch_nm();
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			return trd_cd();
		}
		if ($if_trd_cd.equalsIgnoreCase(name)) {
			return if_trd_cd();
		}
		if ($if_trd_nm.equalsIgnoreCase(name)) {
			return if_trd_nm();
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			return trd_ptn_typ();
		}
		if ($slip_sts_typ.equalsIgnoreCase(name)) {
			return slip_sts_typ();
		}
		if ($dlv_slip_no.equalsIgnoreCase(name)) {
			return dlv_slip_no();
		}
		if ($dlv_slip_d_no.equalsIgnoreCase(name)) {
			return dlv_slip_d_no();
		}
		if ($ship_dlv_slip_no.equalsIgnoreCase(name)) {
			return ship_dlv_slip_no();
		}
		if ($ship_dlv_slip_d_no.equalsIgnoreCase(name)) {
			return ship_dlv_slip_d_no();
		}
		if ($act_no.equalsIgnoreCase(name)) {
			return act_no();
		}
		if ($act_d_no.equalsIgnoreCase(name)) {
			return act_d_no();
		}
		if ($po_no.equalsIgnoreCase(name)) {
			return po_no();
		}
		if ($po_d_no.equalsIgnoreCase(name)) {
			return po_d_no();
		}
		if ($itm_cd.equalsIgnoreCase(name)) {
			return itm_cd();
		}
		if ($itm_sub1.equalsIgnoreCase(name)) {
			return itm_sub1();
		}
		if ($itm_sub2.equalsIgnoreCase(name)) {
			return itm_sub2();
		}
		if ($itm_sub3.equalsIgnoreCase(name)) {
			return itm_sub3();
		}
		if ($if_itm_cd.equalsIgnoreCase(name)) {
			return if_itm_cd();
		}
		if ($if_itm_sub1.equalsIgnoreCase(name)) {
			return if_itm_sub1();
		}
		if ($if_itm_sub2.equalsIgnoreCase(name)) {
			return if_itm_sub2();
		}
		if ($if_itm_sub3.equalsIgnoreCase(name)) {
			return if_itm_sub3();
		}
		if ($if_itm_nm.equalsIgnoreCase(name)) {
			return if_itm_nm();
		}
		if ($itm_alt_nm1.equalsIgnoreCase(name)) {
			return itm_alt_nm1();
		}
		if ($itm_alt_nm2.equalsIgnoreCase(name)) {
			return itm_alt_nm2();
		}
		if ($itm_alt_nm3.equalsIgnoreCase(name)) {
			return itm_alt_nm3();
		}
		if ($itm_alt_nm4.equalsIgnoreCase(name)) {
			return itm_alt_nm4();
		}
		if ($sno1.equalsIgnoreCase(name)) {
			return sno1();
		}
		if ($sno2.equalsIgnoreCase(name)) {
			return sno2();
		}
		if ($sno3.equalsIgnoreCase(name)) {
			return sno3();
		}
		if ($sno4.equalsIgnoreCase(name)) {
			return sno4();
		}
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			return trd_unit_cd();
		}
		if ($if_trd_unit_cd.equalsIgnoreCase(name)) {
			return if_trd_unit_cd();
		}
		if ($if_trd_unit_nm.equalsIgnoreCase(name)) {
			return if_trd_unit_nm();
		}
		if ($tax_cd.equalsIgnoreCase(name)) {
			return tax_cd();
		}
		if ($if_tax_cd.equalsIgnoreCase(name)) {
			return if_tax_cd();
		}
		if ($if_tax_nm.equalsIgnoreCase(name)) {
			return if_tax_nm();
		}
		if ($trd_d_rmrks.equalsIgnoreCase(name)) {
			return trd_d_rmrks();
		}
		if ($if_co_cd.equalsIgnoreCase(name)) {
			return if_co_cd();
		}
		if ($if_co_nm.equalsIgnoreCase(name)) {
			return if_co_nm();
		}
		if ($bill_bcst_nm.equalsIgnoreCase(name)) {
			return bill_bcst_nm();
		}
		if ($bill_ein.equalsIgnoreCase(name)) {
			return bill_ein();
		}
		if ($bill_biz_co_no.equalsIgnoreCase(name)) {
			return bill_biz_co_no();
		}
		if ($bill_zip_cd.equalsIgnoreCase(name)) {
			return bill_zip_cd();
		}
		if ($bill_addr1.equalsIgnoreCase(name)) {
			return bill_addr1();
		}
		if ($bill_addr2.equalsIgnoreCase(name)) {
			return bill_addr2();
		}
		if ($bill_addr3.equalsIgnoreCase(name)) {
			return bill_addr3();
		}
		if ($bill_addr4.equalsIgnoreCase(name)) {
			return bill_addr4();
		}
		if ($bill_bcst_dpt.equalsIgnoreCase(name)) {
			return bill_bcst_dpt();
		}
		if ($bill_tel.equalsIgnoreCase(name)) {
			return bill_tel();
		}
		if ($batch_log_no.equalsIgnoreCase(name)) {
			return batch_log_no();
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
		if ($bill_src_nm.equalsIgnoreCase(name)) {
			return bill_src_nm();
		}
		if ($trd_cur_nm.equalsIgnoreCase(name)) {
			return trd_cur_nm();
		}
		if ($bank_ac_nm.equalsIgnoreCase(name)) {
			return bank_ac_nm();
		}
		if ($pay_mtd_nm1.equalsIgnoreCase(name)) {
			return pay_mtd_nm1();
		}
		if ($pay_mtd_nm2.equalsIgnoreCase(name)) {
			return pay_mtd_nm2();
		}
		if ($pay_mtd_nm3.equalsIgnoreCase(name)) {
			return pay_mtd_nm3();
		}
		if ($pay_mtd_nm4.equalsIgnoreCase(name)) {
			return pay_mtd_nm4();
		}
		if ($pay_mtd_nm5.equalsIgnoreCase(name)) {
			return pay_mtd_nm5();
		}
		if ($pay_mtd_nm6.equalsIgnoreCase(name)) {
			return pay_mtd_nm6();
		}
		if ($pay_mtd_nm7.equalsIgnoreCase(name)) {
			return pay_mtd_nm7();
		}
		if ($pay_mtd_nm8.equalsIgnoreCase(name)) {
			return pay_mtd_nm8();
		}
		if ($pay_mtd_nm9.equalsIgnoreCase(name)) {
			return pay_mtd_nm9();
		}
		if ($pay_mtd_nm10.equalsIgnoreCase(name)) {
			return pay_mtd_nm10();
		}
		if ($trd_nm.equalsIgnoreCase(name)) {
			return trd_nm();
		}
		if ($itm_nm.equalsIgnoreCase(name)) {
			return itm_nm();
		}
		if ($trd_unit_nm.equalsIgnoreCase(name)) {
			return trd_unit_nm();
		}
		if ($tax_nm.equalsIgnoreCase(name)) {
			return tax_nm();
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
		if ($bill_xrate.equalsIgnoreCase(name)) {
			return bill_xrate();
		}
		if ($last_bill_amt.equalsIgnoreCase(name)) {
			return last_bill_amt();
		}
		if ($rcv_amt.equalsIgnoreCase(name)) {
			return rcv_amt();
		}
		if ($sw_amt.equalsIgnoreCase(name)) {
			return sw_amt();
		}
		if ($setoff_amt.equalsIgnoreCase(name)) {
			return setoff_amt();
		}
		if ($bfw_amt.equalsIgnoreCase(name)) {
			return bfw_amt();
		}
		if ($sls_amt.equalsIgnoreCase(name)) {
			return sls_amt();
		}
		if ($dscnt_amt.equalsIgnoreCase(name)) {
			return dscnt_amt();
		}
		if ($ret_amt.equalsIgnoreCase(name)) {
			return ret_amt();
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			return tax_amt();
		}
		if ($sw_to_amt.equalsIgnoreCase(name)) {
			return sw_to_amt();
		}
		if ($bill_amt.equalsIgnoreCase(name)) {
			return bill_amt();
		}
		if ($tax_rate1.equalsIgnoreCase(name)) {
			return tax_rate1();
		}
		if ($tax_rate_sls_amt1.equalsIgnoreCase(name)) {
			return tax_rate_sls_amt1();
		}
		if ($tax_rate_tax_amt1.equalsIgnoreCase(name)) {
			return tax_rate_tax_amt1();
		}
		if ($tax_rate_base_tax_amt1.equalsIgnoreCase(name)) {
			return tax_rate_base_tax_amt1();
		}
		if ($tax_rate2.equalsIgnoreCase(name)) {
			return tax_rate2();
		}
		if ($tax_rate_sls_amt2.equalsIgnoreCase(name)) {
			return tax_rate_sls_amt2();
		}
		if ($tax_rate_tax_amt2.equalsIgnoreCase(name)) {
			return tax_rate_tax_amt2();
		}
		if ($tax_rate_base_tax_amt2.equalsIgnoreCase(name)) {
			return tax_rate_base_tax_amt2();
		}
		if ($tax_rate3.equalsIgnoreCase(name)) {
			return tax_rate3();
		}
		if ($tax_rate_sls_amt3.equalsIgnoreCase(name)) {
			return tax_rate_sls_amt3();
		}
		if ($tax_rate_tax_amt3.equalsIgnoreCase(name)) {
			return tax_rate_tax_amt3();
		}
		if ($tax_rate_base_tax_amt3.equalsIgnoreCase(name)) {
			return tax_rate_base_tax_amt3();
		}
		if ($tax_rate4.equalsIgnoreCase(name)) {
			return tax_rate4();
		}
		if ($tax_rate_sls_amt4.equalsIgnoreCase(name)) {
			return tax_rate_sls_amt4();
		}
		if ($tax_rate_tax_amt4.equalsIgnoreCase(name)) {
			return tax_rate_tax_amt4();
		}
		if ($tax_rate_base_tax_amt4.equalsIgnoreCase(name)) {
			return tax_rate_base_tax_amt4();
		}
		if ($tax_rate5.equalsIgnoreCase(name)) {
			return tax_rate5();
		}
		if ($tax_rate_sls_amt5.equalsIgnoreCase(name)) {
			return tax_rate_sls_amt5();
		}
		if ($tax_rate_tax_amt5.equalsIgnoreCase(name)) {
			return tax_rate_tax_amt5();
		}
		if ($tax_rate_base_tax_amt5.equalsIgnoreCase(name)) {
			return tax_rate_base_tax_amt5();
		}
		if ($tax_rate6.equalsIgnoreCase(name)) {
			return tax_rate6();
		}
		if ($tax_rate_sls_amt6.equalsIgnoreCase(name)) {
			return tax_rate_sls_amt6();
		}
		if ($tax_rate_tax_amt6.equalsIgnoreCase(name)) {
			return tax_rate_tax_amt6();
		}
		if ($tax_rate_base_tax_amt6.equalsIgnoreCase(name)) {
			return tax_rate_base_tax_amt6();
		}
		if ($tax_rate7.equalsIgnoreCase(name)) {
			return tax_rate7();
		}
		if ($tax_rate_sls_amt7.equalsIgnoreCase(name)) {
			return tax_rate_sls_amt7();
		}
		if ($tax_rate_tax_amt7.equalsIgnoreCase(name)) {
			return tax_rate_tax_amt7();
		}
		if ($tax_rate_base_tax_amt7.equalsIgnoreCase(name)) {
			return tax_rate_base_tax_amt7();
		}
		if ($tax_rate8.equalsIgnoreCase(name)) {
			return tax_rate8();
		}
		if ($tax_rate_sls_amt8.equalsIgnoreCase(name)) {
			return tax_rate_sls_amt8();
		}
		if ($tax_rate_tax_amt8.equalsIgnoreCase(name)) {
			return tax_rate_tax_amt8();
		}
		if ($tax_rate_base_tax_amt8.equalsIgnoreCase(name)) {
			return tax_rate_base_tax_amt8();
		}
		if ($tax_rate9.equalsIgnoreCase(name)) {
			return tax_rate9();
		}
		if ($tax_rate_sls_amt9.equalsIgnoreCase(name)) {
			return tax_rate_sls_amt9();
		}
		if ($tax_rate_tax_amt9.equalsIgnoreCase(name)) {
			return tax_rate_tax_amt9();
		}
		if ($tax_rate_base_tax_amt9.equalsIgnoreCase(name)) {
			return tax_rate_base_tax_amt9();
		}
		if ($tax_rate10.equalsIgnoreCase(name)) {
			return tax_rate10();
		}
		if ($tax_rate_sls_amt10.equalsIgnoreCase(name)) {
			return tax_rate_sls_amt10();
		}
		if ($tax_rate_tax_amt10.equalsIgnoreCase(name)) {
			return tax_rate_tax_amt10();
		}
		if ($tax_rate_base_tax_amt10.equalsIgnoreCase(name)) {
			return tax_rate_base_tax_amt10();
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
		if ($pay_schd_amt1.equalsIgnoreCase(name)) {
			return pay_schd_amt1();
		}
		if ($pay_schd_amt2.equalsIgnoreCase(name)) {
			return pay_schd_amt2();
		}
		if ($pay_schd_amt3.equalsIgnoreCase(name)) {
			return pay_schd_amt3();
		}
		if ($pay_schd_amt4.equalsIgnoreCase(name)) {
			return pay_schd_amt4();
		}
		if ($pay_schd_amt5.equalsIgnoreCase(name)) {
			return pay_schd_amt5();
		}
		if ($pay_schd_amt6.equalsIgnoreCase(name)) {
			return pay_schd_amt6();
		}
		if ($pay_schd_amt7.equalsIgnoreCase(name)) {
			return pay_schd_amt7();
		}
		if ($pay_schd_amt8.equalsIgnoreCase(name)) {
			return pay_schd_amt8();
		}
		if ($pay_schd_amt9.equalsIgnoreCase(name)) {
			return pay_schd_amt9();
		}
		if ($pay_schd_amt10.equalsIgnoreCase(name)) {
			return pay_schd_amt10();
		}
		if ($act_rev.equalsIgnoreCase(name)) {
			return act_rev();
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			return trd_unit_qty();
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			return trd_cur_upri();
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			return trd_cur_amt();
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			return trd_cur_dscnt_amt();
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			return tax_rate();
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			return trd_cur_tax_amt();
		}
		if ($log_sub_key1.equalsIgnoreCase(name)) {
			return log_sub_key1();
		}
		if ($log_sub_key2.equalsIgnoreCase(name)) {
			return log_sub_key2();
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
		if ($bill_cl_dt.equalsIgnoreCase(name)) {
			return bill_cl_dt();
		}
		if ($bill_dt.equalsIgnoreCase(name)) {
			return bill_dt();
		}
		if ($pre_bill_dt.equalsIgnoreCase(name)) {
			return pre_bill_dt();
		}
		if ($bill_st_dt.equalsIgnoreCase(name)) {
			return bill_st_dt();
		}
		if ($bill_end_dt.equalsIgnoreCase(name)) {
			return bill_end_dt();
		}
		if ($pay_schd_dt1.equalsIgnoreCase(name)) {
			return pay_schd_dt1();
		}
		if ($pay_schd_dt2.equalsIgnoreCase(name)) {
			return pay_schd_dt2();
		}
		if ($pay_schd_dt3.equalsIgnoreCase(name)) {
			return pay_schd_dt3();
		}
		if ($pay_schd_dt4.equalsIgnoreCase(name)) {
			return pay_schd_dt4();
		}
		if ($pay_schd_dt5.equalsIgnoreCase(name)) {
			return pay_schd_dt5();
		}
		if ($pay_schd_dt6.equalsIgnoreCase(name)) {
			return pay_schd_dt6();
		}
		if ($pay_schd_dt7.equalsIgnoreCase(name)) {
			return pay_schd_dt7();
		}
		if ($pay_schd_dt8.equalsIgnoreCase(name)) {
			return pay_schd_dt8();
		}
		if ($pay_schd_dt9.equalsIgnoreCase(name)) {
			return pay_schd_dt9();
		}
		if ($pay_schd_dt10.equalsIgnoreCase(name)) {
			return pay_schd_dt10();
		}
		if ($ac_dt.equalsIgnoreCase(name)) {
			return ac_dt();
		}
		if ($dlv_dt.equalsIgnoreCase(name)) {
			return dlv_dt();
		}
		if ($rcv_dt.equalsIgnoreCase(name)) {
			return rcv_dt();
		}
		if ($bill_basis_dt.equalsIgnoreCase(name)) {
			return bill_basis_dt();
		}
		if ($base_ac_dt.equalsIgnoreCase(name)) {
			return base_ac_dt();
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
		if ($interim_flg.equalsIgnoreCase(name)) {
			return interim_flg();
		}
		if ($inc_tax_flg.equalsIgnoreCase(name)) {
			return inc_tax_flg();
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
		if ($bill_no.equalsIgnoreCase(name)) {
			return bill_no();
		}
		if ($bill_d_no.equalsIgnoreCase(name)) {
			return bill_d_no();
		}
		if ($pre_bill_no.equalsIgnoreCase(name)) {
			return pre_bill_no();
		}
		if ($iv_no.equalsIgnoreCase(name)) {
			return iv_no();
		}
		if ($wrk_no.equalsIgnoreCase(name)) {
			return wrk_no();
		}
		if ($wrk_nm.equalsIgnoreCase(name)) {
			return wrk_nm();
		}
		if ($bill_src_cd.equalsIgnoreCase(name)) {
			return bill_src_cd();
		}
		if ($if_bill_src_cd.equalsIgnoreCase(name)) {
			return if_bill_src_cd();
		}
		if ($if_bill_src_nm.equalsIgnoreCase(name)) {
			return if_bill_src_nm();
		}
		if ($bill_src_ein.equalsIgnoreCase(name)) {
			return bill_src_ein();
		}
		if ($bill_src_biz_co_no.equalsIgnoreCase(name)) {
			return bill_src_biz_co_no();
		}
		if ($bill_src_zip_cd.equalsIgnoreCase(name)) {
			return bill_src_zip_cd();
		}
		if ($bill_src_addr1.equalsIgnoreCase(name)) {
			return bill_src_addr1();
		}
		if ($bill_src_addr2.equalsIgnoreCase(name)) {
			return bill_src_addr2();
		}
		if ($bill_src_addr3.equalsIgnoreCase(name)) {
			return bill_src_addr3();
		}
		if ($bill_src_addr4.equalsIgnoreCase(name)) {
			return bill_src_addr4();
		}
		if ($bill_src_dpt.equalsIgnoreCase(name)) {
			return bill_src_dpt();
		}
		if ($bill_src_tel.equalsIgnoreCase(name)) {
			return bill_src_tel();
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($if_trd_cur_cd.equalsIgnoreCase(name)) {
			return if_trd_cur_cd();
		}
		if ($pay_mtd_cd1.equalsIgnoreCase(name)) {
			return pay_mtd_cd1();
		}
		if ($if_pay_mtd_cd1.equalsIgnoreCase(name)) {
			return if_pay_mtd_cd1();
		}
		if ($if_pay_mtd_nm1.equalsIgnoreCase(name)) {
			return if_pay_mtd_nm1();
		}
		if ($pay_mtd_cd2.equalsIgnoreCase(name)) {
			return pay_mtd_cd2();
		}
		if ($if_pay_mtd_cd2.equalsIgnoreCase(name)) {
			return if_pay_mtd_cd2();
		}
		if ($if_pay_mtd_nm2.equalsIgnoreCase(name)) {
			return if_pay_mtd_nm2();
		}
		if ($pay_mtd_cd3.equalsIgnoreCase(name)) {
			return pay_mtd_cd3();
		}
		if ($if_pay_mtd_cd3.equalsIgnoreCase(name)) {
			return if_pay_mtd_cd3();
		}
		if ($if_pay_mtd_nm3.equalsIgnoreCase(name)) {
			return if_pay_mtd_nm3();
		}
		if ($pay_mtd_cd4.equalsIgnoreCase(name)) {
			return pay_mtd_cd4();
		}
		if ($if_pay_mtd_cd4.equalsIgnoreCase(name)) {
			return if_pay_mtd_cd4();
		}
		if ($if_pay_mtd_nm4.equalsIgnoreCase(name)) {
			return if_pay_mtd_nm4();
		}
		if ($pay_mtd_cd5.equalsIgnoreCase(name)) {
			return pay_mtd_cd5();
		}
		if ($if_pay_mtd_cd5.equalsIgnoreCase(name)) {
			return if_pay_mtd_cd5();
		}
		if ($if_pay_mtd_nm5.equalsIgnoreCase(name)) {
			return if_pay_mtd_nm5();
		}
		if ($pay_mtd_cd6.equalsIgnoreCase(name)) {
			return pay_mtd_cd6();
		}
		if ($if_pay_mtd_cd6.equalsIgnoreCase(name)) {
			return if_pay_mtd_cd6();
		}
		if ($if_pay_mtd_nm6.equalsIgnoreCase(name)) {
			return if_pay_mtd_nm6();
		}
		if ($pay_mtd_cd7.equalsIgnoreCase(name)) {
			return pay_mtd_cd7();
		}
		if ($if_pay_mtd_cd7.equalsIgnoreCase(name)) {
			return if_pay_mtd_cd7();
		}
		if ($if_pay_mtd_nm7.equalsIgnoreCase(name)) {
			return if_pay_mtd_nm7();
		}
		if ($pay_mtd_cd8.equalsIgnoreCase(name)) {
			return pay_mtd_cd8();
		}
		if ($if_pay_mtd_cd8.equalsIgnoreCase(name)) {
			return if_pay_mtd_cd8();
		}
		if ($if_pay_mtd_nm8.equalsIgnoreCase(name)) {
			return if_pay_mtd_nm8();
		}
		if ($pay_mtd_cd9.equalsIgnoreCase(name)) {
			return pay_mtd_cd9();
		}
		if ($if_pay_mtd_cd9.equalsIgnoreCase(name)) {
			return if_pay_mtd_cd9();
		}
		if ($if_pay_mtd_nm9.equalsIgnoreCase(name)) {
			return if_pay_mtd_nm9();
		}
		if ($pay_mtd_cd10.equalsIgnoreCase(name)) {
			return pay_mtd_cd10();
		}
		if ($if_pay_mtd_cd10.equalsIgnoreCase(name)) {
			return if_pay_mtd_cd10();
		}
		if ($if_pay_mtd_nm10.equalsIgnoreCase(name)) {
			return if_pay_mtd_nm10();
		}
		if ($bank_ac_cd.equalsIgnoreCase(name)) {
			return bank_ac_cd();
		}
		if ($if_bank_ac_cd.equalsIgnoreCase(name)) {
			return if_bank_ac_cd();
		}
		if ($bank_ac_typ.equalsIgnoreCase(name)) {
			return bank_ac_typ();
		}
		if ($bank_ac_no.equalsIgnoreCase(name)) {
			return bank_ac_no();
		}
		if ($bank_ac_holder.equalsIgnoreCase(name)) {
			return bank_ac_holder();
		}
		if ($bank_ac_holder_sub.equalsIgnoreCase(name)) {
			return bank_ac_holder_sub();
		}
		if ($bank_cd.equalsIgnoreCase(name)) {
			return bank_cd();
		}
		if ($bank_nm.equalsIgnoreCase(name)) {
			return bank_nm();
		}
		if ($branch_cd.equalsIgnoreCase(name)) {
			return branch_cd();
		}
		if ($branch_nm.equalsIgnoreCase(name)) {
			return branch_nm();
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			return trd_cd();
		}
		if ($if_trd_cd.equalsIgnoreCase(name)) {
			return if_trd_cd();
		}
		if ($if_trd_nm.equalsIgnoreCase(name)) {
			return if_trd_nm();
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			return trd_ptn_typ();
		}
		if ($slip_sts_typ.equalsIgnoreCase(name)) {
			return slip_sts_typ();
		}
		if ($dlv_slip_no.equalsIgnoreCase(name)) {
			return dlv_slip_no();
		}
		if ($dlv_slip_d_no.equalsIgnoreCase(name)) {
			return dlv_slip_d_no();
		}
		if ($ship_dlv_slip_no.equalsIgnoreCase(name)) {
			return ship_dlv_slip_no();
		}
		if ($ship_dlv_slip_d_no.equalsIgnoreCase(name)) {
			return ship_dlv_slip_d_no();
		}
		if ($act_no.equalsIgnoreCase(name)) {
			return act_no();
		}
		if ($act_d_no.equalsIgnoreCase(name)) {
			return act_d_no();
		}
		if ($po_no.equalsIgnoreCase(name)) {
			return po_no();
		}
		if ($po_d_no.equalsIgnoreCase(name)) {
			return po_d_no();
		}
		if ($itm_cd.equalsIgnoreCase(name)) {
			return itm_cd();
		}
		if ($itm_sub1.equalsIgnoreCase(name)) {
			return itm_sub1();
		}
		if ($itm_sub2.equalsIgnoreCase(name)) {
			return itm_sub2();
		}
		if ($itm_sub3.equalsIgnoreCase(name)) {
			return itm_sub3();
		}
		if ($if_itm_cd.equalsIgnoreCase(name)) {
			return if_itm_cd();
		}
		if ($if_itm_sub1.equalsIgnoreCase(name)) {
			return if_itm_sub1();
		}
		if ($if_itm_sub2.equalsIgnoreCase(name)) {
			return if_itm_sub2();
		}
		if ($if_itm_sub3.equalsIgnoreCase(name)) {
			return if_itm_sub3();
		}
		if ($if_itm_nm.equalsIgnoreCase(name)) {
			return if_itm_nm();
		}
		if ($itm_alt_nm1.equalsIgnoreCase(name)) {
			return itm_alt_nm1();
		}
		if ($itm_alt_nm2.equalsIgnoreCase(name)) {
			return itm_alt_nm2();
		}
		if ($itm_alt_nm3.equalsIgnoreCase(name)) {
			return itm_alt_nm3();
		}
		if ($itm_alt_nm4.equalsIgnoreCase(name)) {
			return itm_alt_nm4();
		}
		if ($sno1.equalsIgnoreCase(name)) {
			return sno1();
		}
		if ($sno2.equalsIgnoreCase(name)) {
			return sno2();
		}
		if ($sno3.equalsIgnoreCase(name)) {
			return sno3();
		}
		if ($sno4.equalsIgnoreCase(name)) {
			return sno4();
		}
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			return trd_unit_cd();
		}
		if ($if_trd_unit_cd.equalsIgnoreCase(name)) {
			return if_trd_unit_cd();
		}
		if ($if_trd_unit_nm.equalsIgnoreCase(name)) {
			return if_trd_unit_nm();
		}
		if ($tax_cd.equalsIgnoreCase(name)) {
			return tax_cd();
		}
		if ($if_tax_cd.equalsIgnoreCase(name)) {
			return if_tax_cd();
		}
		if ($if_tax_nm.equalsIgnoreCase(name)) {
			return if_tax_nm();
		}
		if ($trd_d_rmrks.equalsIgnoreCase(name)) {
			return trd_d_rmrks();
		}
		if ($if_co_cd.equalsIgnoreCase(name)) {
			return if_co_cd();
		}
		if ($if_co_nm.equalsIgnoreCase(name)) {
			return if_co_nm();
		}
		if ($bill_bcst_nm.equalsIgnoreCase(name)) {
			return bill_bcst_nm();
		}
		if ($bill_ein.equalsIgnoreCase(name)) {
			return bill_ein();
		}
		if ($bill_biz_co_no.equalsIgnoreCase(name)) {
			return bill_biz_co_no();
		}
		if ($bill_zip_cd.equalsIgnoreCase(name)) {
			return bill_zip_cd();
		}
		if ($bill_addr1.equalsIgnoreCase(name)) {
			return bill_addr1();
		}
		if ($bill_addr2.equalsIgnoreCase(name)) {
			return bill_addr2();
		}
		if ($bill_addr3.equalsIgnoreCase(name)) {
			return bill_addr3();
		}
		if ($bill_addr4.equalsIgnoreCase(name)) {
			return bill_addr4();
		}
		if ($bill_bcst_dpt.equalsIgnoreCase(name)) {
			return bill_bcst_dpt();
		}
		if ($bill_tel.equalsIgnoreCase(name)) {
			return bill_tel();
		}
		if ($batch_log_no.equalsIgnoreCase(name)) {
			return batch_log_no();
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
		if ($bill_src_nm.equalsIgnoreCase(name)) {
			return bill_src_nm();
		}
		if ($trd_cur_nm.equalsIgnoreCase(name)) {
			return trd_cur_nm();
		}
		if ($bank_ac_nm.equalsIgnoreCase(name)) {
			return bank_ac_nm();
		}
		if ($pay_mtd_nm1.equalsIgnoreCase(name)) {
			return pay_mtd_nm1();
		}
		if ($pay_mtd_nm2.equalsIgnoreCase(name)) {
			return pay_mtd_nm2();
		}
		if ($pay_mtd_nm3.equalsIgnoreCase(name)) {
			return pay_mtd_nm3();
		}
		if ($pay_mtd_nm4.equalsIgnoreCase(name)) {
			return pay_mtd_nm4();
		}
		if ($pay_mtd_nm5.equalsIgnoreCase(name)) {
			return pay_mtd_nm5();
		}
		if ($pay_mtd_nm6.equalsIgnoreCase(name)) {
			return pay_mtd_nm6();
		}
		if ($pay_mtd_nm7.equalsIgnoreCase(name)) {
			return pay_mtd_nm7();
		}
		if ($pay_mtd_nm8.equalsIgnoreCase(name)) {
			return pay_mtd_nm8();
		}
		if ($pay_mtd_nm9.equalsIgnoreCase(name)) {
			return pay_mtd_nm9();
		}
		if ($pay_mtd_nm10.equalsIgnoreCase(name)) {
			return pay_mtd_nm10();
		}
		if ($trd_nm.equalsIgnoreCase(name)) {
			return trd_nm();
		}
		if ($itm_nm.equalsIgnoreCase(name)) {
			return itm_nm();
		}
		if ($trd_unit_nm.equalsIgnoreCase(name)) {
			return trd_unit_nm();
		}
		if ($tax_nm.equalsIgnoreCase(name)) {
			return tax_nm();
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
		if ($bill_xrate.equalsIgnoreCase(name)) {
			return bill_xrate();
		}
		if ($last_bill_amt.equalsIgnoreCase(name)) {
			return last_bill_amt();
		}
		if ($rcv_amt.equalsIgnoreCase(name)) {
			return rcv_amt();
		}
		if ($sw_amt.equalsIgnoreCase(name)) {
			return sw_amt();
		}
		if ($setoff_amt.equalsIgnoreCase(name)) {
			return setoff_amt();
		}
		if ($bfw_amt.equalsIgnoreCase(name)) {
			return bfw_amt();
		}
		if ($sls_amt.equalsIgnoreCase(name)) {
			return sls_amt();
		}
		if ($dscnt_amt.equalsIgnoreCase(name)) {
			return dscnt_amt();
		}
		if ($ret_amt.equalsIgnoreCase(name)) {
			return ret_amt();
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			return tax_amt();
		}
		if ($sw_to_amt.equalsIgnoreCase(name)) {
			return sw_to_amt();
		}
		if ($bill_amt.equalsIgnoreCase(name)) {
			return bill_amt();
		}
		if ($tax_rate1.equalsIgnoreCase(name)) {
			return tax_rate1();
		}
		if ($tax_rate_sls_amt1.equalsIgnoreCase(name)) {
			return tax_rate_sls_amt1();
		}
		if ($tax_rate_tax_amt1.equalsIgnoreCase(name)) {
			return tax_rate_tax_amt1();
		}
		if ($tax_rate_base_tax_amt1.equalsIgnoreCase(name)) {
			return tax_rate_base_tax_amt1();
		}
		if ($tax_rate2.equalsIgnoreCase(name)) {
			return tax_rate2();
		}
		if ($tax_rate_sls_amt2.equalsIgnoreCase(name)) {
			return tax_rate_sls_amt2();
		}
		if ($tax_rate_tax_amt2.equalsIgnoreCase(name)) {
			return tax_rate_tax_amt2();
		}
		if ($tax_rate_base_tax_amt2.equalsIgnoreCase(name)) {
			return tax_rate_base_tax_amt2();
		}
		if ($tax_rate3.equalsIgnoreCase(name)) {
			return tax_rate3();
		}
		if ($tax_rate_sls_amt3.equalsIgnoreCase(name)) {
			return tax_rate_sls_amt3();
		}
		if ($tax_rate_tax_amt3.equalsIgnoreCase(name)) {
			return tax_rate_tax_amt3();
		}
		if ($tax_rate_base_tax_amt3.equalsIgnoreCase(name)) {
			return tax_rate_base_tax_amt3();
		}
		if ($tax_rate4.equalsIgnoreCase(name)) {
			return tax_rate4();
		}
		if ($tax_rate_sls_amt4.equalsIgnoreCase(name)) {
			return tax_rate_sls_amt4();
		}
		if ($tax_rate_tax_amt4.equalsIgnoreCase(name)) {
			return tax_rate_tax_amt4();
		}
		if ($tax_rate_base_tax_amt4.equalsIgnoreCase(name)) {
			return tax_rate_base_tax_amt4();
		}
		if ($tax_rate5.equalsIgnoreCase(name)) {
			return tax_rate5();
		}
		if ($tax_rate_sls_amt5.equalsIgnoreCase(name)) {
			return tax_rate_sls_amt5();
		}
		if ($tax_rate_tax_amt5.equalsIgnoreCase(name)) {
			return tax_rate_tax_amt5();
		}
		if ($tax_rate_base_tax_amt5.equalsIgnoreCase(name)) {
			return tax_rate_base_tax_amt5();
		}
		if ($tax_rate6.equalsIgnoreCase(name)) {
			return tax_rate6();
		}
		if ($tax_rate_sls_amt6.equalsIgnoreCase(name)) {
			return tax_rate_sls_amt6();
		}
		if ($tax_rate_tax_amt6.equalsIgnoreCase(name)) {
			return tax_rate_tax_amt6();
		}
		if ($tax_rate_base_tax_amt6.equalsIgnoreCase(name)) {
			return tax_rate_base_tax_amt6();
		}
		if ($tax_rate7.equalsIgnoreCase(name)) {
			return tax_rate7();
		}
		if ($tax_rate_sls_amt7.equalsIgnoreCase(name)) {
			return tax_rate_sls_amt7();
		}
		if ($tax_rate_tax_amt7.equalsIgnoreCase(name)) {
			return tax_rate_tax_amt7();
		}
		if ($tax_rate_base_tax_amt7.equalsIgnoreCase(name)) {
			return tax_rate_base_tax_amt7();
		}
		if ($tax_rate8.equalsIgnoreCase(name)) {
			return tax_rate8();
		}
		if ($tax_rate_sls_amt8.equalsIgnoreCase(name)) {
			return tax_rate_sls_amt8();
		}
		if ($tax_rate_tax_amt8.equalsIgnoreCase(name)) {
			return tax_rate_tax_amt8();
		}
		if ($tax_rate_base_tax_amt8.equalsIgnoreCase(name)) {
			return tax_rate_base_tax_amt8();
		}
		if ($tax_rate9.equalsIgnoreCase(name)) {
			return tax_rate9();
		}
		if ($tax_rate_sls_amt9.equalsIgnoreCase(name)) {
			return tax_rate_sls_amt9();
		}
		if ($tax_rate_tax_amt9.equalsIgnoreCase(name)) {
			return tax_rate_tax_amt9();
		}
		if ($tax_rate_base_tax_amt9.equalsIgnoreCase(name)) {
			return tax_rate_base_tax_amt9();
		}
		if ($tax_rate10.equalsIgnoreCase(name)) {
			return tax_rate10();
		}
		if ($tax_rate_sls_amt10.equalsIgnoreCase(name)) {
			return tax_rate_sls_amt10();
		}
		if ($tax_rate_tax_amt10.equalsIgnoreCase(name)) {
			return tax_rate_tax_amt10();
		}
		if ($tax_rate_base_tax_amt10.equalsIgnoreCase(name)) {
			return tax_rate_base_tax_amt10();
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
		if ($pay_schd_amt1.equalsIgnoreCase(name)) {
			return pay_schd_amt1();
		}
		if ($pay_schd_amt2.equalsIgnoreCase(name)) {
			return pay_schd_amt2();
		}
		if ($pay_schd_amt3.equalsIgnoreCase(name)) {
			return pay_schd_amt3();
		}
		if ($pay_schd_amt4.equalsIgnoreCase(name)) {
			return pay_schd_amt4();
		}
		if ($pay_schd_amt5.equalsIgnoreCase(name)) {
			return pay_schd_amt5();
		}
		if ($pay_schd_amt6.equalsIgnoreCase(name)) {
			return pay_schd_amt6();
		}
		if ($pay_schd_amt7.equalsIgnoreCase(name)) {
			return pay_schd_amt7();
		}
		if ($pay_schd_amt8.equalsIgnoreCase(name)) {
			return pay_schd_amt8();
		}
		if ($pay_schd_amt9.equalsIgnoreCase(name)) {
			return pay_schd_amt9();
		}
		if ($pay_schd_amt10.equalsIgnoreCase(name)) {
			return pay_schd_amt10();
		}
		if ($act_rev.equalsIgnoreCase(name)) {
			return act_rev();
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			return trd_unit_qty();
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			return trd_cur_upri();
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			return trd_cur_amt();
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			return trd_cur_dscnt_amt();
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			return tax_rate();
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			return trd_cur_tax_amt();
		}
		if ($log_sub_key1.equalsIgnoreCase(name)) {
			return log_sub_key1();
		}
		if ($log_sub_key2.equalsIgnoreCase(name)) {
			return log_sub_key2();
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
		if ($bill_cl_dt.equalsIgnoreCase(name)) {
			return bill_cl_dt();
		}
		if ($bill_dt.equalsIgnoreCase(name)) {
			return bill_dt();
		}
		if ($pre_bill_dt.equalsIgnoreCase(name)) {
			return pre_bill_dt();
		}
		if ($bill_st_dt.equalsIgnoreCase(name)) {
			return bill_st_dt();
		}
		if ($bill_end_dt.equalsIgnoreCase(name)) {
			return bill_end_dt();
		}
		if ($pay_schd_dt1.equalsIgnoreCase(name)) {
			return pay_schd_dt1();
		}
		if ($pay_schd_dt2.equalsIgnoreCase(name)) {
			return pay_schd_dt2();
		}
		if ($pay_schd_dt3.equalsIgnoreCase(name)) {
			return pay_schd_dt3();
		}
		if ($pay_schd_dt4.equalsIgnoreCase(name)) {
			return pay_schd_dt4();
		}
		if ($pay_schd_dt5.equalsIgnoreCase(name)) {
			return pay_schd_dt5();
		}
		if ($pay_schd_dt6.equalsIgnoreCase(name)) {
			return pay_schd_dt6();
		}
		if ($pay_schd_dt7.equalsIgnoreCase(name)) {
			return pay_schd_dt7();
		}
		if ($pay_schd_dt8.equalsIgnoreCase(name)) {
			return pay_schd_dt8();
		}
		if ($pay_schd_dt9.equalsIgnoreCase(name)) {
			return pay_schd_dt9();
		}
		if ($pay_schd_dt10.equalsIgnoreCase(name)) {
			return pay_schd_dt10();
		}
		if ($ac_dt.equalsIgnoreCase(name)) {
			return ac_dt();
		}
		if ($dlv_dt.equalsIgnoreCase(name)) {
			return dlv_dt();
		}
		if ($rcv_dt.equalsIgnoreCase(name)) {
			return rcv_dt();
		}
		if ($bill_basis_dt.equalsIgnoreCase(name)) {
			return bill_basis_dt();
		}
		if ($base_ac_dt.equalsIgnoreCase(name)) {
			return base_ac_dt();
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
		if ($interim_flg.equalsIgnoreCase(name)) {
			return interim_flg();
		}
		if ($inc_tax_flg.equalsIgnoreCase(name)) {
			return inc_tax_flg();
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
		if ($bill_no.equalsIgnoreCase(name)) {
			bill_no(value);
			return;
		}
		if ($bill_d_no.equalsIgnoreCase(name)) {
			bill_d_no(value);
			return;
		}
		if ($pre_bill_no.equalsIgnoreCase(name)) {
			pre_bill_no(value);
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
		if ($wrk_nm.equalsIgnoreCase(name)) {
			wrk_nm(value);
			return;
		}
		if ($bill_src_cd.equalsIgnoreCase(name)) {
			bill_src_cd(value);
			return;
		}
		if ($if_bill_src_cd.equalsIgnoreCase(name)) {
			if_bill_src_cd(value);
			return;
		}
		if ($if_bill_src_nm.equalsIgnoreCase(name)) {
			if_bill_src_nm(value);
			return;
		}
		if ($bill_src_ein.equalsIgnoreCase(name)) {
			bill_src_ein(value);
			return;
		}
		if ($bill_src_biz_co_no.equalsIgnoreCase(name)) {
			bill_src_biz_co_no(value);
			return;
		}
		if ($bill_src_zip_cd.equalsIgnoreCase(name)) {
			bill_src_zip_cd(value);
			return;
		}
		if ($bill_src_addr1.equalsIgnoreCase(name)) {
			bill_src_addr1(value);
			return;
		}
		if ($bill_src_addr2.equalsIgnoreCase(name)) {
			bill_src_addr2(value);
			return;
		}
		if ($bill_src_addr3.equalsIgnoreCase(name)) {
			bill_src_addr3(value);
			return;
		}
		if ($bill_src_addr4.equalsIgnoreCase(name)) {
			bill_src_addr4(value);
			return;
		}
		if ($bill_src_dpt.equalsIgnoreCase(name)) {
			bill_src_dpt(value);
			return;
		}
		if ($bill_src_tel.equalsIgnoreCase(name)) {
			bill_src_tel(value);
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
		if ($pay_mtd_cd1.equalsIgnoreCase(name)) {
			pay_mtd_cd1(value);
			return;
		}
		if ($if_pay_mtd_cd1.equalsIgnoreCase(name)) {
			if_pay_mtd_cd1(value);
			return;
		}
		if ($if_pay_mtd_nm1.equalsIgnoreCase(name)) {
			if_pay_mtd_nm1(value);
			return;
		}
		if ($pay_mtd_cd2.equalsIgnoreCase(name)) {
			pay_mtd_cd2(value);
			return;
		}
		if ($if_pay_mtd_cd2.equalsIgnoreCase(name)) {
			if_pay_mtd_cd2(value);
			return;
		}
		if ($if_pay_mtd_nm2.equalsIgnoreCase(name)) {
			if_pay_mtd_nm2(value);
			return;
		}
		if ($pay_mtd_cd3.equalsIgnoreCase(name)) {
			pay_mtd_cd3(value);
			return;
		}
		if ($if_pay_mtd_cd3.equalsIgnoreCase(name)) {
			if_pay_mtd_cd3(value);
			return;
		}
		if ($if_pay_mtd_nm3.equalsIgnoreCase(name)) {
			if_pay_mtd_nm3(value);
			return;
		}
		if ($pay_mtd_cd4.equalsIgnoreCase(name)) {
			pay_mtd_cd4(value);
			return;
		}
		if ($if_pay_mtd_cd4.equalsIgnoreCase(name)) {
			if_pay_mtd_cd4(value);
			return;
		}
		if ($if_pay_mtd_nm4.equalsIgnoreCase(name)) {
			if_pay_mtd_nm4(value);
			return;
		}
		if ($pay_mtd_cd5.equalsIgnoreCase(name)) {
			pay_mtd_cd5(value);
			return;
		}
		if ($if_pay_mtd_cd5.equalsIgnoreCase(name)) {
			if_pay_mtd_cd5(value);
			return;
		}
		if ($if_pay_mtd_nm5.equalsIgnoreCase(name)) {
			if_pay_mtd_nm5(value);
			return;
		}
		if ($pay_mtd_cd6.equalsIgnoreCase(name)) {
			pay_mtd_cd6(value);
			return;
		}
		if ($if_pay_mtd_cd6.equalsIgnoreCase(name)) {
			if_pay_mtd_cd6(value);
			return;
		}
		if ($if_pay_mtd_nm6.equalsIgnoreCase(name)) {
			if_pay_mtd_nm6(value);
			return;
		}
		if ($pay_mtd_cd7.equalsIgnoreCase(name)) {
			pay_mtd_cd7(value);
			return;
		}
		if ($if_pay_mtd_cd7.equalsIgnoreCase(name)) {
			if_pay_mtd_cd7(value);
			return;
		}
		if ($if_pay_mtd_nm7.equalsIgnoreCase(name)) {
			if_pay_mtd_nm7(value);
			return;
		}
		if ($pay_mtd_cd8.equalsIgnoreCase(name)) {
			pay_mtd_cd8(value);
			return;
		}
		if ($if_pay_mtd_cd8.equalsIgnoreCase(name)) {
			if_pay_mtd_cd8(value);
			return;
		}
		if ($if_pay_mtd_nm8.equalsIgnoreCase(name)) {
			if_pay_mtd_nm8(value);
			return;
		}
		if ($pay_mtd_cd9.equalsIgnoreCase(name)) {
			pay_mtd_cd9(value);
			return;
		}
		if ($if_pay_mtd_cd9.equalsIgnoreCase(name)) {
			if_pay_mtd_cd9(value);
			return;
		}
		if ($if_pay_mtd_nm9.equalsIgnoreCase(name)) {
			if_pay_mtd_nm9(value);
			return;
		}
		if ($pay_mtd_cd10.equalsIgnoreCase(name)) {
			pay_mtd_cd10(value);
			return;
		}
		if ($if_pay_mtd_cd10.equalsIgnoreCase(name)) {
			if_pay_mtd_cd10(value);
			return;
		}
		if ($if_pay_mtd_nm10.equalsIgnoreCase(name)) {
			if_pay_mtd_nm10(value);
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
		if ($bank_ac_typ.equalsIgnoreCase(name)) {
			bank_ac_typ(value);
			return;
		}
		if ($bank_ac_no.equalsIgnoreCase(name)) {
			bank_ac_no(value);
			return;
		}
		if ($bank_ac_holder.equalsIgnoreCase(name)) {
			bank_ac_holder(value);
			return;
		}
		if ($bank_ac_holder_sub.equalsIgnoreCase(name)) {
			bank_ac_holder_sub(value);
			return;
		}
		if ($bank_cd.equalsIgnoreCase(name)) {
			bank_cd(value);
			return;
		}
		if ($bank_nm.equalsIgnoreCase(name)) {
			bank_nm(value);
			return;
		}
		if ($branch_cd.equalsIgnoreCase(name)) {
			branch_cd(value);
			return;
		}
		if ($branch_nm.equalsIgnoreCase(name)) {
			branch_nm(value);
			return;
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			trd_cd(value);
			return;
		}
		if ($if_trd_cd.equalsIgnoreCase(name)) {
			if_trd_cd(value);
			return;
		}
		if ($if_trd_nm.equalsIgnoreCase(name)) {
			if_trd_nm(value);
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
		if ($dlv_slip_no.equalsIgnoreCase(name)) {
			dlv_slip_no(value);
			return;
		}
		if ($dlv_slip_d_no.equalsIgnoreCase(name)) {
			dlv_slip_d_no(value);
			return;
		}
		if ($ship_dlv_slip_no.equalsIgnoreCase(name)) {
			ship_dlv_slip_no(value);
			return;
		}
		if ($ship_dlv_slip_d_no.equalsIgnoreCase(name)) {
			ship_dlv_slip_d_no(value);
			return;
		}
		if ($act_no.equalsIgnoreCase(name)) {
			act_no(value);
			return;
		}
		if ($act_d_no.equalsIgnoreCase(name)) {
			act_d_no(value);
			return;
		}
		if ($po_no.equalsIgnoreCase(name)) {
			po_no(value);
			return;
		}
		if ($po_d_no.equalsIgnoreCase(name)) {
			po_d_no(value);
			return;
		}
		if ($itm_cd.equalsIgnoreCase(name)) {
			itm_cd(value);
			return;
		}
		if ($itm_sub1.equalsIgnoreCase(name)) {
			itm_sub1(value);
			return;
		}
		if ($itm_sub2.equalsIgnoreCase(name)) {
			itm_sub2(value);
			return;
		}
		if ($itm_sub3.equalsIgnoreCase(name)) {
			itm_sub3(value);
			return;
		}
		if ($if_itm_cd.equalsIgnoreCase(name)) {
			if_itm_cd(value);
			return;
		}
		if ($if_itm_sub1.equalsIgnoreCase(name)) {
			if_itm_sub1(value);
			return;
		}
		if ($if_itm_sub2.equalsIgnoreCase(name)) {
			if_itm_sub2(value);
			return;
		}
		if ($if_itm_sub3.equalsIgnoreCase(name)) {
			if_itm_sub3(value);
			return;
		}
		if ($if_itm_nm.equalsIgnoreCase(name)) {
			if_itm_nm(value);
			return;
		}
		if ($itm_alt_nm1.equalsIgnoreCase(name)) {
			itm_alt_nm1(value);
			return;
		}
		if ($itm_alt_nm2.equalsIgnoreCase(name)) {
			itm_alt_nm2(value);
			return;
		}
		if ($itm_alt_nm3.equalsIgnoreCase(name)) {
			itm_alt_nm3(value);
			return;
		}
		if ($itm_alt_nm4.equalsIgnoreCase(name)) {
			itm_alt_nm4(value);
			return;
		}
		if ($sno1.equalsIgnoreCase(name)) {
			sno1(value);
			return;
		}
		if ($sno2.equalsIgnoreCase(name)) {
			sno2(value);
			return;
		}
		if ($sno3.equalsIgnoreCase(name)) {
			sno3(value);
			return;
		}
		if ($sno4.equalsIgnoreCase(name)) {
			sno4(value);
			return;
		}
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			trd_unit_cd(value);
			return;
		}
		if ($if_trd_unit_cd.equalsIgnoreCase(name)) {
			if_trd_unit_cd(value);
			return;
		}
		if ($if_trd_unit_nm.equalsIgnoreCase(name)) {
			if_trd_unit_nm(value);
			return;
		}
		if ($tax_cd.equalsIgnoreCase(name)) {
			tax_cd(value);
			return;
		}
		if ($if_tax_cd.equalsIgnoreCase(name)) {
			if_tax_cd(value);
			return;
		}
		if ($if_tax_nm.equalsIgnoreCase(name)) {
			if_tax_nm(value);
			return;
		}
		if ($trd_d_rmrks.equalsIgnoreCase(name)) {
			trd_d_rmrks(value);
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
		if ($bill_bcst_nm.equalsIgnoreCase(name)) {
			bill_bcst_nm(value);
			return;
		}
		if ($bill_ein.equalsIgnoreCase(name)) {
			bill_ein(value);
			return;
		}
		if ($bill_biz_co_no.equalsIgnoreCase(name)) {
			bill_biz_co_no(value);
			return;
		}
		if ($bill_zip_cd.equalsIgnoreCase(name)) {
			bill_zip_cd(value);
			return;
		}
		if ($bill_addr1.equalsIgnoreCase(name)) {
			bill_addr1(value);
			return;
		}
		if ($bill_addr2.equalsIgnoreCase(name)) {
			bill_addr2(value);
			return;
		}
		if ($bill_addr3.equalsIgnoreCase(name)) {
			bill_addr3(value);
			return;
		}
		if ($bill_addr4.equalsIgnoreCase(name)) {
			bill_addr4(value);
			return;
		}
		if ($bill_bcst_dpt.equalsIgnoreCase(name)) {
			bill_bcst_dpt(value);
			return;
		}
		if ($bill_tel.equalsIgnoreCase(name)) {
			bill_tel(value);
			return;
		}
		if ($batch_log_no.equalsIgnoreCase(name)) {
			batch_log_no(value);
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
		if ($bill_src_nm.equalsIgnoreCase(name)) {
			bill_src_nm(value);
			return;
		}
		if ($trd_cur_nm.equalsIgnoreCase(name)) {
			trd_cur_nm(value);
			return;
		}
		if ($bank_ac_nm.equalsIgnoreCase(name)) {
			bank_ac_nm(value);
			return;
		}
		if ($pay_mtd_nm1.equalsIgnoreCase(name)) {
			pay_mtd_nm1(value);
			return;
		}
		if ($pay_mtd_nm2.equalsIgnoreCase(name)) {
			pay_mtd_nm2(value);
			return;
		}
		if ($pay_mtd_nm3.equalsIgnoreCase(name)) {
			pay_mtd_nm3(value);
			return;
		}
		if ($pay_mtd_nm4.equalsIgnoreCase(name)) {
			pay_mtd_nm4(value);
			return;
		}
		if ($pay_mtd_nm5.equalsIgnoreCase(name)) {
			pay_mtd_nm5(value);
			return;
		}
		if ($pay_mtd_nm6.equalsIgnoreCase(name)) {
			pay_mtd_nm6(value);
			return;
		}
		if ($pay_mtd_nm7.equalsIgnoreCase(name)) {
			pay_mtd_nm7(value);
			return;
		}
		if ($pay_mtd_nm8.equalsIgnoreCase(name)) {
			pay_mtd_nm8(value);
			return;
		}
		if ($pay_mtd_nm9.equalsIgnoreCase(name)) {
			pay_mtd_nm9(value);
			return;
		}
		if ($pay_mtd_nm10.equalsIgnoreCase(name)) {
			pay_mtd_nm10(value);
			return;
		}
		if ($trd_nm.equalsIgnoreCase(name)) {
			trd_nm(value);
			return;
		}
		if ($itm_nm.equalsIgnoreCase(name)) {
			itm_nm(value);
			return;
		}
		if ($trd_unit_nm.equalsIgnoreCase(name)) {
			trd_unit_nm(value);
			return;
		}
		if ($tax_nm.equalsIgnoreCase(name)) {
			tax_nm(value);
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
		if ($bill_xrate.equalsIgnoreCase(name)) {
			bill_xrate(value);
			return;
		}
		if ($last_bill_amt.equalsIgnoreCase(name)) {
			last_bill_amt(value);
			return;
		}
		if ($rcv_amt.equalsIgnoreCase(name)) {
			rcv_amt(value);
			return;
		}
		if ($sw_amt.equalsIgnoreCase(name)) {
			sw_amt(value);
			return;
		}
		if ($setoff_amt.equalsIgnoreCase(name)) {
			setoff_amt(value);
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
		if ($dscnt_amt.equalsIgnoreCase(name)) {
			dscnt_amt(value);
			return;
		}
		if ($ret_amt.equalsIgnoreCase(name)) {
			ret_amt(value);
			return;
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			tax_amt(value);
			return;
		}
		if ($sw_to_amt.equalsIgnoreCase(name)) {
			sw_to_amt(value);
			return;
		}
		if ($bill_amt.equalsIgnoreCase(name)) {
			bill_amt(value);
			return;
		}
		if ($tax_rate1.equalsIgnoreCase(name)) {
			tax_rate1(value);
			return;
		}
		if ($tax_rate_sls_amt1.equalsIgnoreCase(name)) {
			tax_rate_sls_amt1(value);
			return;
		}
		if ($tax_rate_tax_amt1.equalsIgnoreCase(name)) {
			tax_rate_tax_amt1(value);
			return;
		}
		if ($tax_rate_base_tax_amt1.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt1(value);
			return;
		}
		if ($tax_rate2.equalsIgnoreCase(name)) {
			tax_rate2(value);
			return;
		}
		if ($tax_rate_sls_amt2.equalsIgnoreCase(name)) {
			tax_rate_sls_amt2(value);
			return;
		}
		if ($tax_rate_tax_amt2.equalsIgnoreCase(name)) {
			tax_rate_tax_amt2(value);
			return;
		}
		if ($tax_rate_base_tax_amt2.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt2(value);
			return;
		}
		if ($tax_rate3.equalsIgnoreCase(name)) {
			tax_rate3(value);
			return;
		}
		if ($tax_rate_sls_amt3.equalsIgnoreCase(name)) {
			tax_rate_sls_amt3(value);
			return;
		}
		if ($tax_rate_tax_amt3.equalsIgnoreCase(name)) {
			tax_rate_tax_amt3(value);
			return;
		}
		if ($tax_rate_base_tax_amt3.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt3(value);
			return;
		}
		if ($tax_rate4.equalsIgnoreCase(name)) {
			tax_rate4(value);
			return;
		}
		if ($tax_rate_sls_amt4.equalsIgnoreCase(name)) {
			tax_rate_sls_amt4(value);
			return;
		}
		if ($tax_rate_tax_amt4.equalsIgnoreCase(name)) {
			tax_rate_tax_amt4(value);
			return;
		}
		if ($tax_rate_base_tax_amt4.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt4(value);
			return;
		}
		if ($tax_rate5.equalsIgnoreCase(name)) {
			tax_rate5(value);
			return;
		}
		if ($tax_rate_sls_amt5.equalsIgnoreCase(name)) {
			tax_rate_sls_amt5(value);
			return;
		}
		if ($tax_rate_tax_amt5.equalsIgnoreCase(name)) {
			tax_rate_tax_amt5(value);
			return;
		}
		if ($tax_rate_base_tax_amt5.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt5(value);
			return;
		}
		if ($tax_rate6.equalsIgnoreCase(name)) {
			tax_rate6(value);
			return;
		}
		if ($tax_rate_sls_amt6.equalsIgnoreCase(name)) {
			tax_rate_sls_amt6(value);
			return;
		}
		if ($tax_rate_tax_amt6.equalsIgnoreCase(name)) {
			tax_rate_tax_amt6(value);
			return;
		}
		if ($tax_rate_base_tax_amt6.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt6(value);
			return;
		}
		if ($tax_rate7.equalsIgnoreCase(name)) {
			tax_rate7(value);
			return;
		}
		if ($tax_rate_sls_amt7.equalsIgnoreCase(name)) {
			tax_rate_sls_amt7(value);
			return;
		}
		if ($tax_rate_tax_amt7.equalsIgnoreCase(name)) {
			tax_rate_tax_amt7(value);
			return;
		}
		if ($tax_rate_base_tax_amt7.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt7(value);
			return;
		}
		if ($tax_rate8.equalsIgnoreCase(name)) {
			tax_rate8(value);
			return;
		}
		if ($tax_rate_sls_amt8.equalsIgnoreCase(name)) {
			tax_rate_sls_amt8(value);
			return;
		}
		if ($tax_rate_tax_amt8.equalsIgnoreCase(name)) {
			tax_rate_tax_amt8(value);
			return;
		}
		if ($tax_rate_base_tax_amt8.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt8(value);
			return;
		}
		if ($tax_rate9.equalsIgnoreCase(name)) {
			tax_rate9(value);
			return;
		}
		if ($tax_rate_sls_amt9.equalsIgnoreCase(name)) {
			tax_rate_sls_amt9(value);
			return;
		}
		if ($tax_rate_tax_amt9.equalsIgnoreCase(name)) {
			tax_rate_tax_amt9(value);
			return;
		}
		if ($tax_rate_base_tax_amt9.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt9(value);
			return;
		}
		if ($tax_rate10.equalsIgnoreCase(name)) {
			tax_rate10(value);
			return;
		}
		if ($tax_rate_sls_amt10.equalsIgnoreCase(name)) {
			tax_rate_sls_amt10(value);
			return;
		}
		if ($tax_rate_tax_amt10.equalsIgnoreCase(name)) {
			tax_rate_tax_amt10(value);
			return;
		}
		if ($tax_rate_base_tax_amt10.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt10(value);
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
		if ($pay_schd_amt1.equalsIgnoreCase(name)) {
			pay_schd_amt1(value);
			return;
		}
		if ($pay_schd_amt2.equalsIgnoreCase(name)) {
			pay_schd_amt2(value);
			return;
		}
		if ($pay_schd_amt3.equalsIgnoreCase(name)) {
			pay_schd_amt3(value);
			return;
		}
		if ($pay_schd_amt4.equalsIgnoreCase(name)) {
			pay_schd_amt4(value);
			return;
		}
		if ($pay_schd_amt5.equalsIgnoreCase(name)) {
			pay_schd_amt5(value);
			return;
		}
		if ($pay_schd_amt6.equalsIgnoreCase(name)) {
			pay_schd_amt6(value);
			return;
		}
		if ($pay_schd_amt7.equalsIgnoreCase(name)) {
			pay_schd_amt7(value);
			return;
		}
		if ($pay_schd_amt8.equalsIgnoreCase(name)) {
			pay_schd_amt8(value);
			return;
		}
		if ($pay_schd_amt9.equalsIgnoreCase(name)) {
			pay_schd_amt9(value);
			return;
		}
		if ($pay_schd_amt10.equalsIgnoreCase(name)) {
			pay_schd_amt10(value);
			return;
		}
		if ($act_rev.equalsIgnoreCase(name)) {
			act_rev(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
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
		if ($bill_xrate.equalsIgnoreCase(name)) {
			bill_xrate(value);
			return;
		}
		if ($last_bill_amt.equalsIgnoreCase(name)) {
			last_bill_amt(value);
			return;
		}
		if ($rcv_amt.equalsIgnoreCase(name)) {
			rcv_amt(value);
			return;
		}
		if ($sw_amt.equalsIgnoreCase(name)) {
			sw_amt(value);
			return;
		}
		if ($setoff_amt.equalsIgnoreCase(name)) {
			setoff_amt(value);
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
		if ($dscnt_amt.equalsIgnoreCase(name)) {
			dscnt_amt(value);
			return;
		}
		if ($ret_amt.equalsIgnoreCase(name)) {
			ret_amt(value);
			return;
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			tax_amt(value);
			return;
		}
		if ($sw_to_amt.equalsIgnoreCase(name)) {
			sw_to_amt(value);
			return;
		}
		if ($bill_amt.equalsIgnoreCase(name)) {
			bill_amt(value);
			return;
		}
		if ($tax_rate1.equalsIgnoreCase(name)) {
			tax_rate1(value);
			return;
		}
		if ($tax_rate_sls_amt1.equalsIgnoreCase(name)) {
			tax_rate_sls_amt1(value);
			return;
		}
		if ($tax_rate_tax_amt1.equalsIgnoreCase(name)) {
			tax_rate_tax_amt1(value);
			return;
		}
		if ($tax_rate_base_tax_amt1.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt1(value);
			return;
		}
		if ($tax_rate2.equalsIgnoreCase(name)) {
			tax_rate2(value);
			return;
		}
		if ($tax_rate_sls_amt2.equalsIgnoreCase(name)) {
			tax_rate_sls_amt2(value);
			return;
		}
		if ($tax_rate_tax_amt2.equalsIgnoreCase(name)) {
			tax_rate_tax_amt2(value);
			return;
		}
		if ($tax_rate_base_tax_amt2.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt2(value);
			return;
		}
		if ($tax_rate3.equalsIgnoreCase(name)) {
			tax_rate3(value);
			return;
		}
		if ($tax_rate_sls_amt3.equalsIgnoreCase(name)) {
			tax_rate_sls_amt3(value);
			return;
		}
		if ($tax_rate_tax_amt3.equalsIgnoreCase(name)) {
			tax_rate_tax_amt3(value);
			return;
		}
		if ($tax_rate_base_tax_amt3.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt3(value);
			return;
		}
		if ($tax_rate4.equalsIgnoreCase(name)) {
			tax_rate4(value);
			return;
		}
		if ($tax_rate_sls_amt4.equalsIgnoreCase(name)) {
			tax_rate_sls_amt4(value);
			return;
		}
		if ($tax_rate_tax_amt4.equalsIgnoreCase(name)) {
			tax_rate_tax_amt4(value);
			return;
		}
		if ($tax_rate_base_tax_amt4.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt4(value);
			return;
		}
		if ($tax_rate5.equalsIgnoreCase(name)) {
			tax_rate5(value);
			return;
		}
		if ($tax_rate_sls_amt5.equalsIgnoreCase(name)) {
			tax_rate_sls_amt5(value);
			return;
		}
		if ($tax_rate_tax_amt5.equalsIgnoreCase(name)) {
			tax_rate_tax_amt5(value);
			return;
		}
		if ($tax_rate_base_tax_amt5.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt5(value);
			return;
		}
		if ($tax_rate6.equalsIgnoreCase(name)) {
			tax_rate6(value);
			return;
		}
		if ($tax_rate_sls_amt6.equalsIgnoreCase(name)) {
			tax_rate_sls_amt6(value);
			return;
		}
		if ($tax_rate_tax_amt6.equalsIgnoreCase(name)) {
			tax_rate_tax_amt6(value);
			return;
		}
		if ($tax_rate_base_tax_amt6.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt6(value);
			return;
		}
		if ($tax_rate7.equalsIgnoreCase(name)) {
			tax_rate7(value);
			return;
		}
		if ($tax_rate_sls_amt7.equalsIgnoreCase(name)) {
			tax_rate_sls_amt7(value);
			return;
		}
		if ($tax_rate_tax_amt7.equalsIgnoreCase(name)) {
			tax_rate_tax_amt7(value);
			return;
		}
		if ($tax_rate_base_tax_amt7.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt7(value);
			return;
		}
		if ($tax_rate8.equalsIgnoreCase(name)) {
			tax_rate8(value);
			return;
		}
		if ($tax_rate_sls_amt8.equalsIgnoreCase(name)) {
			tax_rate_sls_amt8(value);
			return;
		}
		if ($tax_rate_tax_amt8.equalsIgnoreCase(name)) {
			tax_rate_tax_amt8(value);
			return;
		}
		if ($tax_rate_base_tax_amt8.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt8(value);
			return;
		}
		if ($tax_rate9.equalsIgnoreCase(name)) {
			tax_rate9(value);
			return;
		}
		if ($tax_rate_sls_amt9.equalsIgnoreCase(name)) {
			tax_rate_sls_amt9(value);
			return;
		}
		if ($tax_rate_tax_amt9.equalsIgnoreCase(name)) {
			tax_rate_tax_amt9(value);
			return;
		}
		if ($tax_rate_base_tax_amt9.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt9(value);
			return;
		}
		if ($tax_rate10.equalsIgnoreCase(name)) {
			tax_rate10(value);
			return;
		}
		if ($tax_rate_sls_amt10.equalsIgnoreCase(name)) {
			tax_rate_sls_amt10(value);
			return;
		}
		if ($tax_rate_tax_amt10.equalsIgnoreCase(name)) {
			tax_rate_tax_amt10(value);
			return;
		}
		if ($tax_rate_base_tax_amt10.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt10(value);
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
		if ($pay_schd_amt1.equalsIgnoreCase(name)) {
			pay_schd_amt1(value);
			return;
		}
		if ($pay_schd_amt2.equalsIgnoreCase(name)) {
			pay_schd_amt2(value);
			return;
		}
		if ($pay_schd_amt3.equalsIgnoreCase(name)) {
			pay_schd_amt3(value);
			return;
		}
		if ($pay_schd_amt4.equalsIgnoreCase(name)) {
			pay_schd_amt4(value);
			return;
		}
		if ($pay_schd_amt5.equalsIgnoreCase(name)) {
			pay_schd_amt5(value);
			return;
		}
		if ($pay_schd_amt6.equalsIgnoreCase(name)) {
			pay_schd_amt6(value);
			return;
		}
		if ($pay_schd_amt7.equalsIgnoreCase(name)) {
			pay_schd_amt7(value);
			return;
		}
		if ($pay_schd_amt8.equalsIgnoreCase(name)) {
			pay_schd_amt8(value);
			return;
		}
		if ($pay_schd_amt9.equalsIgnoreCase(name)) {
			pay_schd_amt9(value);
			return;
		}
		if ($pay_schd_amt10.equalsIgnoreCase(name)) {
			pay_schd_amt10(value);
			return;
		}
		if ($act_rev.equalsIgnoreCase(name)) {
			act_rev(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
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
		if ($bill_xrate.equalsIgnoreCase(name)) {
			bill_xrate(value);
			return;
		}
		if ($last_bill_amt.equalsIgnoreCase(name)) {
			last_bill_amt(value);
			return;
		}
		if ($rcv_amt.equalsIgnoreCase(name)) {
			rcv_amt(value);
			return;
		}
		if ($sw_amt.equalsIgnoreCase(name)) {
			sw_amt(value);
			return;
		}
		if ($setoff_amt.equalsIgnoreCase(name)) {
			setoff_amt(value);
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
		if ($dscnt_amt.equalsIgnoreCase(name)) {
			dscnt_amt(value);
			return;
		}
		if ($ret_amt.equalsIgnoreCase(name)) {
			ret_amt(value);
			return;
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			tax_amt(value);
			return;
		}
		if ($sw_to_amt.equalsIgnoreCase(name)) {
			sw_to_amt(value);
			return;
		}
		if ($bill_amt.equalsIgnoreCase(name)) {
			bill_amt(value);
			return;
		}
		if ($tax_rate1.equalsIgnoreCase(name)) {
			tax_rate1(value);
			return;
		}
		if ($tax_rate_sls_amt1.equalsIgnoreCase(name)) {
			tax_rate_sls_amt1(value);
			return;
		}
		if ($tax_rate_tax_amt1.equalsIgnoreCase(name)) {
			tax_rate_tax_amt1(value);
			return;
		}
		if ($tax_rate_base_tax_amt1.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt1(value);
			return;
		}
		if ($tax_rate2.equalsIgnoreCase(name)) {
			tax_rate2(value);
			return;
		}
		if ($tax_rate_sls_amt2.equalsIgnoreCase(name)) {
			tax_rate_sls_amt2(value);
			return;
		}
		if ($tax_rate_tax_amt2.equalsIgnoreCase(name)) {
			tax_rate_tax_amt2(value);
			return;
		}
		if ($tax_rate_base_tax_amt2.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt2(value);
			return;
		}
		if ($tax_rate3.equalsIgnoreCase(name)) {
			tax_rate3(value);
			return;
		}
		if ($tax_rate_sls_amt3.equalsIgnoreCase(name)) {
			tax_rate_sls_amt3(value);
			return;
		}
		if ($tax_rate_tax_amt3.equalsIgnoreCase(name)) {
			tax_rate_tax_amt3(value);
			return;
		}
		if ($tax_rate_base_tax_amt3.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt3(value);
			return;
		}
		if ($tax_rate4.equalsIgnoreCase(name)) {
			tax_rate4(value);
			return;
		}
		if ($tax_rate_sls_amt4.equalsIgnoreCase(name)) {
			tax_rate_sls_amt4(value);
			return;
		}
		if ($tax_rate_tax_amt4.equalsIgnoreCase(name)) {
			tax_rate_tax_amt4(value);
			return;
		}
		if ($tax_rate_base_tax_amt4.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt4(value);
			return;
		}
		if ($tax_rate5.equalsIgnoreCase(name)) {
			tax_rate5(value);
			return;
		}
		if ($tax_rate_sls_amt5.equalsIgnoreCase(name)) {
			tax_rate_sls_amt5(value);
			return;
		}
		if ($tax_rate_tax_amt5.equalsIgnoreCase(name)) {
			tax_rate_tax_amt5(value);
			return;
		}
		if ($tax_rate_base_tax_amt5.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt5(value);
			return;
		}
		if ($tax_rate6.equalsIgnoreCase(name)) {
			tax_rate6(value);
			return;
		}
		if ($tax_rate_sls_amt6.equalsIgnoreCase(name)) {
			tax_rate_sls_amt6(value);
			return;
		}
		if ($tax_rate_tax_amt6.equalsIgnoreCase(name)) {
			tax_rate_tax_amt6(value);
			return;
		}
		if ($tax_rate_base_tax_amt6.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt6(value);
			return;
		}
		if ($tax_rate7.equalsIgnoreCase(name)) {
			tax_rate7(value);
			return;
		}
		if ($tax_rate_sls_amt7.equalsIgnoreCase(name)) {
			tax_rate_sls_amt7(value);
			return;
		}
		if ($tax_rate_tax_amt7.equalsIgnoreCase(name)) {
			tax_rate_tax_amt7(value);
			return;
		}
		if ($tax_rate_base_tax_amt7.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt7(value);
			return;
		}
		if ($tax_rate8.equalsIgnoreCase(name)) {
			tax_rate8(value);
			return;
		}
		if ($tax_rate_sls_amt8.equalsIgnoreCase(name)) {
			tax_rate_sls_amt8(value);
			return;
		}
		if ($tax_rate_tax_amt8.equalsIgnoreCase(name)) {
			tax_rate_tax_amt8(value);
			return;
		}
		if ($tax_rate_base_tax_amt8.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt8(value);
			return;
		}
		if ($tax_rate9.equalsIgnoreCase(name)) {
			tax_rate9(value);
			return;
		}
		if ($tax_rate_sls_amt9.equalsIgnoreCase(name)) {
			tax_rate_sls_amt9(value);
			return;
		}
		if ($tax_rate_tax_amt9.equalsIgnoreCase(name)) {
			tax_rate_tax_amt9(value);
			return;
		}
		if ($tax_rate_base_tax_amt9.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt9(value);
			return;
		}
		if ($tax_rate10.equalsIgnoreCase(name)) {
			tax_rate10(value);
			return;
		}
		if ($tax_rate_sls_amt10.equalsIgnoreCase(name)) {
			tax_rate_sls_amt10(value);
			return;
		}
		if ($tax_rate_tax_amt10.equalsIgnoreCase(name)) {
			tax_rate_tax_amt10(value);
			return;
		}
		if ($tax_rate_base_tax_amt10.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt10(value);
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
		if ($pay_schd_amt1.equalsIgnoreCase(name)) {
			pay_schd_amt1(value);
			return;
		}
		if ($pay_schd_amt2.equalsIgnoreCase(name)) {
			pay_schd_amt2(value);
			return;
		}
		if ($pay_schd_amt3.equalsIgnoreCase(name)) {
			pay_schd_amt3(value);
			return;
		}
		if ($pay_schd_amt4.equalsIgnoreCase(name)) {
			pay_schd_amt4(value);
			return;
		}
		if ($pay_schd_amt5.equalsIgnoreCase(name)) {
			pay_schd_amt5(value);
			return;
		}
		if ($pay_schd_amt6.equalsIgnoreCase(name)) {
			pay_schd_amt6(value);
			return;
		}
		if ($pay_schd_amt7.equalsIgnoreCase(name)) {
			pay_schd_amt7(value);
			return;
		}
		if ($pay_schd_amt8.equalsIgnoreCase(name)) {
			pay_schd_amt8(value);
			return;
		}
		if ($pay_schd_amt9.equalsIgnoreCase(name)) {
			pay_schd_amt9(value);
			return;
		}
		if ($pay_schd_amt10.equalsIgnoreCase(name)) {
			pay_schd_amt10(value);
			return;
		}
		if ($act_rev.equalsIgnoreCase(name)) {
			act_rev(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
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
		if ($bill_xrate.equalsIgnoreCase(name)) {
			bill_xrate(value);
			return;
		}
		if ($last_bill_amt.equalsIgnoreCase(name)) {
			last_bill_amt(value);
			return;
		}
		if ($rcv_amt.equalsIgnoreCase(name)) {
			rcv_amt(value);
			return;
		}
		if ($sw_amt.equalsIgnoreCase(name)) {
			sw_amt(value);
			return;
		}
		if ($setoff_amt.equalsIgnoreCase(name)) {
			setoff_amt(value);
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
		if ($dscnt_amt.equalsIgnoreCase(name)) {
			dscnt_amt(value);
			return;
		}
		if ($ret_amt.equalsIgnoreCase(name)) {
			ret_amt(value);
			return;
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			tax_amt(value);
			return;
		}
		if ($sw_to_amt.equalsIgnoreCase(name)) {
			sw_to_amt(value);
			return;
		}
		if ($bill_amt.equalsIgnoreCase(name)) {
			bill_amt(value);
			return;
		}
		if ($tax_rate1.equalsIgnoreCase(name)) {
			tax_rate1(value);
			return;
		}
		if ($tax_rate_sls_amt1.equalsIgnoreCase(name)) {
			tax_rate_sls_amt1(value);
			return;
		}
		if ($tax_rate_tax_amt1.equalsIgnoreCase(name)) {
			tax_rate_tax_amt1(value);
			return;
		}
		if ($tax_rate_base_tax_amt1.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt1(value);
			return;
		}
		if ($tax_rate2.equalsIgnoreCase(name)) {
			tax_rate2(value);
			return;
		}
		if ($tax_rate_sls_amt2.equalsIgnoreCase(name)) {
			tax_rate_sls_amt2(value);
			return;
		}
		if ($tax_rate_tax_amt2.equalsIgnoreCase(name)) {
			tax_rate_tax_amt2(value);
			return;
		}
		if ($tax_rate_base_tax_amt2.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt2(value);
			return;
		}
		if ($tax_rate3.equalsIgnoreCase(name)) {
			tax_rate3(value);
			return;
		}
		if ($tax_rate_sls_amt3.equalsIgnoreCase(name)) {
			tax_rate_sls_amt3(value);
			return;
		}
		if ($tax_rate_tax_amt3.equalsIgnoreCase(name)) {
			tax_rate_tax_amt3(value);
			return;
		}
		if ($tax_rate_base_tax_amt3.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt3(value);
			return;
		}
		if ($tax_rate4.equalsIgnoreCase(name)) {
			tax_rate4(value);
			return;
		}
		if ($tax_rate_sls_amt4.equalsIgnoreCase(name)) {
			tax_rate_sls_amt4(value);
			return;
		}
		if ($tax_rate_tax_amt4.equalsIgnoreCase(name)) {
			tax_rate_tax_amt4(value);
			return;
		}
		if ($tax_rate_base_tax_amt4.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt4(value);
			return;
		}
		if ($tax_rate5.equalsIgnoreCase(name)) {
			tax_rate5(value);
			return;
		}
		if ($tax_rate_sls_amt5.equalsIgnoreCase(name)) {
			tax_rate_sls_amt5(value);
			return;
		}
		if ($tax_rate_tax_amt5.equalsIgnoreCase(name)) {
			tax_rate_tax_amt5(value);
			return;
		}
		if ($tax_rate_base_tax_amt5.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt5(value);
			return;
		}
		if ($tax_rate6.equalsIgnoreCase(name)) {
			tax_rate6(value);
			return;
		}
		if ($tax_rate_sls_amt6.equalsIgnoreCase(name)) {
			tax_rate_sls_amt6(value);
			return;
		}
		if ($tax_rate_tax_amt6.equalsIgnoreCase(name)) {
			tax_rate_tax_amt6(value);
			return;
		}
		if ($tax_rate_base_tax_amt6.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt6(value);
			return;
		}
		if ($tax_rate7.equalsIgnoreCase(name)) {
			tax_rate7(value);
			return;
		}
		if ($tax_rate_sls_amt7.equalsIgnoreCase(name)) {
			tax_rate_sls_amt7(value);
			return;
		}
		if ($tax_rate_tax_amt7.equalsIgnoreCase(name)) {
			tax_rate_tax_amt7(value);
			return;
		}
		if ($tax_rate_base_tax_amt7.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt7(value);
			return;
		}
		if ($tax_rate8.equalsIgnoreCase(name)) {
			tax_rate8(value);
			return;
		}
		if ($tax_rate_sls_amt8.equalsIgnoreCase(name)) {
			tax_rate_sls_amt8(value);
			return;
		}
		if ($tax_rate_tax_amt8.equalsIgnoreCase(name)) {
			tax_rate_tax_amt8(value);
			return;
		}
		if ($tax_rate_base_tax_amt8.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt8(value);
			return;
		}
		if ($tax_rate9.equalsIgnoreCase(name)) {
			tax_rate9(value);
			return;
		}
		if ($tax_rate_sls_amt9.equalsIgnoreCase(name)) {
			tax_rate_sls_amt9(value);
			return;
		}
		if ($tax_rate_tax_amt9.equalsIgnoreCase(name)) {
			tax_rate_tax_amt9(value);
			return;
		}
		if ($tax_rate_base_tax_amt9.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt9(value);
			return;
		}
		if ($tax_rate10.equalsIgnoreCase(name)) {
			tax_rate10(value);
			return;
		}
		if ($tax_rate_sls_amt10.equalsIgnoreCase(name)) {
			tax_rate_sls_amt10(value);
			return;
		}
		if ($tax_rate_tax_amt10.equalsIgnoreCase(name)) {
			tax_rate_tax_amt10(value);
			return;
		}
		if ($tax_rate_base_tax_amt10.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt10(value);
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
		if ($pay_schd_amt1.equalsIgnoreCase(name)) {
			pay_schd_amt1(value);
			return;
		}
		if ($pay_schd_amt2.equalsIgnoreCase(name)) {
			pay_schd_amt2(value);
			return;
		}
		if ($pay_schd_amt3.equalsIgnoreCase(name)) {
			pay_schd_amt3(value);
			return;
		}
		if ($pay_schd_amt4.equalsIgnoreCase(name)) {
			pay_schd_amt4(value);
			return;
		}
		if ($pay_schd_amt5.equalsIgnoreCase(name)) {
			pay_schd_amt5(value);
			return;
		}
		if ($pay_schd_amt6.equalsIgnoreCase(name)) {
			pay_schd_amt6(value);
			return;
		}
		if ($pay_schd_amt7.equalsIgnoreCase(name)) {
			pay_schd_amt7(value);
			return;
		}
		if ($pay_schd_amt8.equalsIgnoreCase(name)) {
			pay_schd_amt8(value);
			return;
		}
		if ($pay_schd_amt9.equalsIgnoreCase(name)) {
			pay_schd_amt9(value);
			return;
		}
		if ($pay_schd_amt10.equalsIgnoreCase(name)) {
			pay_schd_amt10(value);
			return;
		}
		if ($act_rev.equalsIgnoreCase(name)) {
			act_rev(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
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
		if ($bill_xrate.equalsIgnoreCase(name)) {
			bill_xrate(value);
			return;
		}
		if ($last_bill_amt.equalsIgnoreCase(name)) {
			last_bill_amt(value);
			return;
		}
		if ($rcv_amt.equalsIgnoreCase(name)) {
			rcv_amt(value);
			return;
		}
		if ($sw_amt.equalsIgnoreCase(name)) {
			sw_amt(value);
			return;
		}
		if ($setoff_amt.equalsIgnoreCase(name)) {
			setoff_amt(value);
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
		if ($dscnt_amt.equalsIgnoreCase(name)) {
			dscnt_amt(value);
			return;
		}
		if ($ret_amt.equalsIgnoreCase(name)) {
			ret_amt(value);
			return;
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			tax_amt(value);
			return;
		}
		if ($sw_to_amt.equalsIgnoreCase(name)) {
			sw_to_amt(value);
			return;
		}
		if ($bill_amt.equalsIgnoreCase(name)) {
			bill_amt(value);
			return;
		}
		if ($tax_rate1.equalsIgnoreCase(name)) {
			tax_rate1(value);
			return;
		}
		if ($tax_rate_sls_amt1.equalsIgnoreCase(name)) {
			tax_rate_sls_amt1(value);
			return;
		}
		if ($tax_rate_tax_amt1.equalsIgnoreCase(name)) {
			tax_rate_tax_amt1(value);
			return;
		}
		if ($tax_rate_base_tax_amt1.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt1(value);
			return;
		}
		if ($tax_rate2.equalsIgnoreCase(name)) {
			tax_rate2(value);
			return;
		}
		if ($tax_rate_sls_amt2.equalsIgnoreCase(name)) {
			tax_rate_sls_amt2(value);
			return;
		}
		if ($tax_rate_tax_amt2.equalsIgnoreCase(name)) {
			tax_rate_tax_amt2(value);
			return;
		}
		if ($tax_rate_base_tax_amt2.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt2(value);
			return;
		}
		if ($tax_rate3.equalsIgnoreCase(name)) {
			tax_rate3(value);
			return;
		}
		if ($tax_rate_sls_amt3.equalsIgnoreCase(name)) {
			tax_rate_sls_amt3(value);
			return;
		}
		if ($tax_rate_tax_amt3.equalsIgnoreCase(name)) {
			tax_rate_tax_amt3(value);
			return;
		}
		if ($tax_rate_base_tax_amt3.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt3(value);
			return;
		}
		if ($tax_rate4.equalsIgnoreCase(name)) {
			tax_rate4(value);
			return;
		}
		if ($tax_rate_sls_amt4.equalsIgnoreCase(name)) {
			tax_rate_sls_amt4(value);
			return;
		}
		if ($tax_rate_tax_amt4.equalsIgnoreCase(name)) {
			tax_rate_tax_amt4(value);
			return;
		}
		if ($tax_rate_base_tax_amt4.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt4(value);
			return;
		}
		if ($tax_rate5.equalsIgnoreCase(name)) {
			tax_rate5(value);
			return;
		}
		if ($tax_rate_sls_amt5.equalsIgnoreCase(name)) {
			tax_rate_sls_amt5(value);
			return;
		}
		if ($tax_rate_tax_amt5.equalsIgnoreCase(name)) {
			tax_rate_tax_amt5(value);
			return;
		}
		if ($tax_rate_base_tax_amt5.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt5(value);
			return;
		}
		if ($tax_rate6.equalsIgnoreCase(name)) {
			tax_rate6(value);
			return;
		}
		if ($tax_rate_sls_amt6.equalsIgnoreCase(name)) {
			tax_rate_sls_amt6(value);
			return;
		}
		if ($tax_rate_tax_amt6.equalsIgnoreCase(name)) {
			tax_rate_tax_amt6(value);
			return;
		}
		if ($tax_rate_base_tax_amt6.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt6(value);
			return;
		}
		if ($tax_rate7.equalsIgnoreCase(name)) {
			tax_rate7(value);
			return;
		}
		if ($tax_rate_sls_amt7.equalsIgnoreCase(name)) {
			tax_rate_sls_amt7(value);
			return;
		}
		if ($tax_rate_tax_amt7.equalsIgnoreCase(name)) {
			tax_rate_tax_amt7(value);
			return;
		}
		if ($tax_rate_base_tax_amt7.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt7(value);
			return;
		}
		if ($tax_rate8.equalsIgnoreCase(name)) {
			tax_rate8(value);
			return;
		}
		if ($tax_rate_sls_amt8.equalsIgnoreCase(name)) {
			tax_rate_sls_amt8(value);
			return;
		}
		if ($tax_rate_tax_amt8.equalsIgnoreCase(name)) {
			tax_rate_tax_amt8(value);
			return;
		}
		if ($tax_rate_base_tax_amt8.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt8(value);
			return;
		}
		if ($tax_rate9.equalsIgnoreCase(name)) {
			tax_rate9(value);
			return;
		}
		if ($tax_rate_sls_amt9.equalsIgnoreCase(name)) {
			tax_rate_sls_amt9(value);
			return;
		}
		if ($tax_rate_tax_amt9.equalsIgnoreCase(name)) {
			tax_rate_tax_amt9(value);
			return;
		}
		if ($tax_rate_base_tax_amt9.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt9(value);
			return;
		}
		if ($tax_rate10.equalsIgnoreCase(name)) {
			tax_rate10(value);
			return;
		}
		if ($tax_rate_sls_amt10.equalsIgnoreCase(name)) {
			tax_rate_sls_amt10(value);
			return;
		}
		if ($tax_rate_tax_amt10.equalsIgnoreCase(name)) {
			tax_rate_tax_amt10(value);
			return;
		}
		if ($tax_rate_base_tax_amt10.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt10(value);
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
		if ($pay_schd_amt1.equalsIgnoreCase(name)) {
			pay_schd_amt1(value);
			return;
		}
		if ($pay_schd_amt2.equalsIgnoreCase(name)) {
			pay_schd_amt2(value);
			return;
		}
		if ($pay_schd_amt3.equalsIgnoreCase(name)) {
			pay_schd_amt3(value);
			return;
		}
		if ($pay_schd_amt4.equalsIgnoreCase(name)) {
			pay_schd_amt4(value);
			return;
		}
		if ($pay_schd_amt5.equalsIgnoreCase(name)) {
			pay_schd_amt5(value);
			return;
		}
		if ($pay_schd_amt6.equalsIgnoreCase(name)) {
			pay_schd_amt6(value);
			return;
		}
		if ($pay_schd_amt7.equalsIgnoreCase(name)) {
			pay_schd_amt7(value);
			return;
		}
		if ($pay_schd_amt8.equalsIgnoreCase(name)) {
			pay_schd_amt8(value);
			return;
		}
		if ($pay_schd_amt9.equalsIgnoreCase(name)) {
			pay_schd_amt9(value);
			return;
		}
		if ($pay_schd_amt10.equalsIgnoreCase(name)) {
			pay_schd_amt10(value);
			return;
		}
		if ($act_rev.equalsIgnoreCase(name)) {
			act_rev(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
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
		if ($bill_st_dt.equalsIgnoreCase(name)) {
			bill_st_dt(value);
			return;
		}
		if ($bill_end_dt.equalsIgnoreCase(name)) {
			bill_end_dt(value);
			return;
		}
		if ($pay_schd_dt1.equalsIgnoreCase(name)) {
			pay_schd_dt1(value);
			return;
		}
		if ($pay_schd_dt2.equalsIgnoreCase(name)) {
			pay_schd_dt2(value);
			return;
		}
		if ($pay_schd_dt3.equalsIgnoreCase(name)) {
			pay_schd_dt3(value);
			return;
		}
		if ($pay_schd_dt4.equalsIgnoreCase(name)) {
			pay_schd_dt4(value);
			return;
		}
		if ($pay_schd_dt5.equalsIgnoreCase(name)) {
			pay_schd_dt5(value);
			return;
		}
		if ($pay_schd_dt6.equalsIgnoreCase(name)) {
			pay_schd_dt6(value);
			return;
		}
		if ($pay_schd_dt7.equalsIgnoreCase(name)) {
			pay_schd_dt7(value);
			return;
		}
		if ($pay_schd_dt8.equalsIgnoreCase(name)) {
			pay_schd_dt8(value);
			return;
		}
		if ($pay_schd_dt9.equalsIgnoreCase(name)) {
			pay_schd_dt9(value);
			return;
		}
		if ($pay_schd_dt10.equalsIgnoreCase(name)) {
			pay_schd_dt10(value);
			return;
		}
		if ($ac_dt.equalsIgnoreCase(name)) {
			ac_dt(value);
			return;
		}
		if ($dlv_dt.equalsIgnoreCase(name)) {
			dlv_dt(value);
			return;
		}
		if ($rcv_dt.equalsIgnoreCase(name)) {
			rcv_dt(value);
			return;
		}
		if ($bill_basis_dt.equalsIgnoreCase(name)) {
			bill_basis_dt(value);
			return;
		}
		if ($base_ac_dt.equalsIgnoreCase(name)) {
			base_ac_dt(value);
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
		if ($interim_flg.equalsIgnoreCase(name)) {
			interim_flg(value);
			return;
		}
		if ($inc_tax_flg.equalsIgnoreCase(name)) {
			inc_tax_flg(value);
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
		if ($bill_no.equalsIgnoreCase(name)) {
			bill_no(value);
			return;
		}
		if ($bill_d_no.equalsIgnoreCase(name)) {
			bill_d_no(value);
			return;
		}
		if ($pre_bill_no.equalsIgnoreCase(name)) {
			pre_bill_no(value);
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
		if ($wrk_nm.equalsIgnoreCase(name)) {
			wrk_nm(value);
			return;
		}
		if ($bill_src_cd.equalsIgnoreCase(name)) {
			bill_src_cd(value);
			return;
		}
		if ($if_bill_src_cd.equalsIgnoreCase(name)) {
			if_bill_src_cd(value);
			return;
		}
		if ($if_bill_src_nm.equalsIgnoreCase(name)) {
			if_bill_src_nm(value);
			return;
		}
		if ($bill_src_ein.equalsIgnoreCase(name)) {
			bill_src_ein(value);
			return;
		}
		if ($bill_src_biz_co_no.equalsIgnoreCase(name)) {
			bill_src_biz_co_no(value);
			return;
		}
		if ($bill_src_zip_cd.equalsIgnoreCase(name)) {
			bill_src_zip_cd(value);
			return;
		}
		if ($bill_src_addr1.equalsIgnoreCase(name)) {
			bill_src_addr1(value);
			return;
		}
		if ($bill_src_addr2.equalsIgnoreCase(name)) {
			bill_src_addr2(value);
			return;
		}
		if ($bill_src_addr3.equalsIgnoreCase(name)) {
			bill_src_addr3(value);
			return;
		}
		if ($bill_src_addr4.equalsIgnoreCase(name)) {
			bill_src_addr4(value);
			return;
		}
		if ($bill_src_dpt.equalsIgnoreCase(name)) {
			bill_src_dpt(value);
			return;
		}
		if ($bill_src_tel.equalsIgnoreCase(name)) {
			bill_src_tel(value);
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
		if ($pay_mtd_cd1.equalsIgnoreCase(name)) {
			pay_mtd_cd1(value);
			return;
		}
		if ($if_pay_mtd_cd1.equalsIgnoreCase(name)) {
			if_pay_mtd_cd1(value);
			return;
		}
		if ($if_pay_mtd_nm1.equalsIgnoreCase(name)) {
			if_pay_mtd_nm1(value);
			return;
		}
		if ($pay_mtd_cd2.equalsIgnoreCase(name)) {
			pay_mtd_cd2(value);
			return;
		}
		if ($if_pay_mtd_cd2.equalsIgnoreCase(name)) {
			if_pay_mtd_cd2(value);
			return;
		}
		if ($if_pay_mtd_nm2.equalsIgnoreCase(name)) {
			if_pay_mtd_nm2(value);
			return;
		}
		if ($pay_mtd_cd3.equalsIgnoreCase(name)) {
			pay_mtd_cd3(value);
			return;
		}
		if ($if_pay_mtd_cd3.equalsIgnoreCase(name)) {
			if_pay_mtd_cd3(value);
			return;
		}
		if ($if_pay_mtd_nm3.equalsIgnoreCase(name)) {
			if_pay_mtd_nm3(value);
			return;
		}
		if ($pay_mtd_cd4.equalsIgnoreCase(name)) {
			pay_mtd_cd4(value);
			return;
		}
		if ($if_pay_mtd_cd4.equalsIgnoreCase(name)) {
			if_pay_mtd_cd4(value);
			return;
		}
		if ($if_pay_mtd_nm4.equalsIgnoreCase(name)) {
			if_pay_mtd_nm4(value);
			return;
		}
		if ($pay_mtd_cd5.equalsIgnoreCase(name)) {
			pay_mtd_cd5(value);
			return;
		}
		if ($if_pay_mtd_cd5.equalsIgnoreCase(name)) {
			if_pay_mtd_cd5(value);
			return;
		}
		if ($if_pay_mtd_nm5.equalsIgnoreCase(name)) {
			if_pay_mtd_nm5(value);
			return;
		}
		if ($pay_mtd_cd6.equalsIgnoreCase(name)) {
			pay_mtd_cd6(value);
			return;
		}
		if ($if_pay_mtd_cd6.equalsIgnoreCase(name)) {
			if_pay_mtd_cd6(value);
			return;
		}
		if ($if_pay_mtd_nm6.equalsIgnoreCase(name)) {
			if_pay_mtd_nm6(value);
			return;
		}
		if ($pay_mtd_cd7.equalsIgnoreCase(name)) {
			pay_mtd_cd7(value);
			return;
		}
		if ($if_pay_mtd_cd7.equalsIgnoreCase(name)) {
			if_pay_mtd_cd7(value);
			return;
		}
		if ($if_pay_mtd_nm7.equalsIgnoreCase(name)) {
			if_pay_mtd_nm7(value);
			return;
		}
		if ($pay_mtd_cd8.equalsIgnoreCase(name)) {
			pay_mtd_cd8(value);
			return;
		}
		if ($if_pay_mtd_cd8.equalsIgnoreCase(name)) {
			if_pay_mtd_cd8(value);
			return;
		}
		if ($if_pay_mtd_nm8.equalsIgnoreCase(name)) {
			if_pay_mtd_nm8(value);
			return;
		}
		if ($pay_mtd_cd9.equalsIgnoreCase(name)) {
			pay_mtd_cd9(value);
			return;
		}
		if ($if_pay_mtd_cd9.equalsIgnoreCase(name)) {
			if_pay_mtd_cd9(value);
			return;
		}
		if ($if_pay_mtd_nm9.equalsIgnoreCase(name)) {
			if_pay_mtd_nm9(value);
			return;
		}
		if ($pay_mtd_cd10.equalsIgnoreCase(name)) {
			pay_mtd_cd10(value);
			return;
		}
		if ($if_pay_mtd_cd10.equalsIgnoreCase(name)) {
			if_pay_mtd_cd10(value);
			return;
		}
		if ($if_pay_mtd_nm10.equalsIgnoreCase(name)) {
			if_pay_mtd_nm10(value);
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
		if ($bank_ac_typ.equalsIgnoreCase(name)) {
			bank_ac_typ(value);
			return;
		}
		if ($bank_ac_no.equalsIgnoreCase(name)) {
			bank_ac_no(value);
			return;
		}
		if ($bank_ac_holder.equalsIgnoreCase(name)) {
			bank_ac_holder(value);
			return;
		}
		if ($bank_ac_holder_sub.equalsIgnoreCase(name)) {
			bank_ac_holder_sub(value);
			return;
		}
		if ($bank_cd.equalsIgnoreCase(name)) {
			bank_cd(value);
			return;
		}
		if ($bank_nm.equalsIgnoreCase(name)) {
			bank_nm(value);
			return;
		}
		if ($branch_cd.equalsIgnoreCase(name)) {
			branch_cd(value);
			return;
		}
		if ($branch_nm.equalsIgnoreCase(name)) {
			branch_nm(value);
			return;
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			trd_cd(value);
			return;
		}
		if ($if_trd_cd.equalsIgnoreCase(name)) {
			if_trd_cd(value);
			return;
		}
		if ($if_trd_nm.equalsIgnoreCase(name)) {
			if_trd_nm(value);
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
		if ($dlv_slip_no.equalsIgnoreCase(name)) {
			dlv_slip_no(value);
			return;
		}
		if ($dlv_slip_d_no.equalsIgnoreCase(name)) {
			dlv_slip_d_no(value);
			return;
		}
		if ($ship_dlv_slip_no.equalsIgnoreCase(name)) {
			ship_dlv_slip_no(value);
			return;
		}
		if ($ship_dlv_slip_d_no.equalsIgnoreCase(name)) {
			ship_dlv_slip_d_no(value);
			return;
		}
		if ($act_no.equalsIgnoreCase(name)) {
			act_no(value);
			return;
		}
		if ($act_d_no.equalsIgnoreCase(name)) {
			act_d_no(value);
			return;
		}
		if ($po_no.equalsIgnoreCase(name)) {
			po_no(value);
			return;
		}
		if ($po_d_no.equalsIgnoreCase(name)) {
			po_d_no(value);
			return;
		}
		if ($itm_cd.equalsIgnoreCase(name)) {
			itm_cd(value);
			return;
		}
		if ($itm_sub1.equalsIgnoreCase(name)) {
			itm_sub1(value);
			return;
		}
		if ($itm_sub2.equalsIgnoreCase(name)) {
			itm_sub2(value);
			return;
		}
		if ($itm_sub3.equalsIgnoreCase(name)) {
			itm_sub3(value);
			return;
		}
		if ($if_itm_cd.equalsIgnoreCase(name)) {
			if_itm_cd(value);
			return;
		}
		if ($if_itm_sub1.equalsIgnoreCase(name)) {
			if_itm_sub1(value);
			return;
		}
		if ($if_itm_sub2.equalsIgnoreCase(name)) {
			if_itm_sub2(value);
			return;
		}
		if ($if_itm_sub3.equalsIgnoreCase(name)) {
			if_itm_sub3(value);
			return;
		}
		if ($if_itm_nm.equalsIgnoreCase(name)) {
			if_itm_nm(value);
			return;
		}
		if ($itm_alt_nm1.equalsIgnoreCase(name)) {
			itm_alt_nm1(value);
			return;
		}
		if ($itm_alt_nm2.equalsIgnoreCase(name)) {
			itm_alt_nm2(value);
			return;
		}
		if ($itm_alt_nm3.equalsIgnoreCase(name)) {
			itm_alt_nm3(value);
			return;
		}
		if ($itm_alt_nm4.equalsIgnoreCase(name)) {
			itm_alt_nm4(value);
			return;
		}
		if ($sno1.equalsIgnoreCase(name)) {
			sno1(value);
			return;
		}
		if ($sno2.equalsIgnoreCase(name)) {
			sno2(value);
			return;
		}
		if ($sno3.equalsIgnoreCase(name)) {
			sno3(value);
			return;
		}
		if ($sno4.equalsIgnoreCase(name)) {
			sno4(value);
			return;
		}
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			trd_unit_cd(value);
			return;
		}
		if ($if_trd_unit_cd.equalsIgnoreCase(name)) {
			if_trd_unit_cd(value);
			return;
		}
		if ($if_trd_unit_nm.equalsIgnoreCase(name)) {
			if_trd_unit_nm(value);
			return;
		}
		if ($tax_cd.equalsIgnoreCase(name)) {
			tax_cd(value);
			return;
		}
		if ($if_tax_cd.equalsIgnoreCase(name)) {
			if_tax_cd(value);
			return;
		}
		if ($if_tax_nm.equalsIgnoreCase(name)) {
			if_tax_nm(value);
			return;
		}
		if ($trd_d_rmrks.equalsIgnoreCase(name)) {
			trd_d_rmrks(value);
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
		if ($bill_bcst_nm.equalsIgnoreCase(name)) {
			bill_bcst_nm(value);
			return;
		}
		if ($bill_ein.equalsIgnoreCase(name)) {
			bill_ein(value);
			return;
		}
		if ($bill_biz_co_no.equalsIgnoreCase(name)) {
			bill_biz_co_no(value);
			return;
		}
		if ($bill_zip_cd.equalsIgnoreCase(name)) {
			bill_zip_cd(value);
			return;
		}
		if ($bill_addr1.equalsIgnoreCase(name)) {
			bill_addr1(value);
			return;
		}
		if ($bill_addr2.equalsIgnoreCase(name)) {
			bill_addr2(value);
			return;
		}
		if ($bill_addr3.equalsIgnoreCase(name)) {
			bill_addr3(value);
			return;
		}
		if ($bill_addr4.equalsIgnoreCase(name)) {
			bill_addr4(value);
			return;
		}
		if ($bill_bcst_dpt.equalsIgnoreCase(name)) {
			bill_bcst_dpt(value);
			return;
		}
		if ($bill_tel.equalsIgnoreCase(name)) {
			bill_tel(value);
			return;
		}
		if ($batch_log_no.equalsIgnoreCase(name)) {
			batch_log_no(value);
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
		if ($bill_src_nm.equalsIgnoreCase(name)) {
			bill_src_nm(value);
			return;
		}
		if ($trd_cur_nm.equalsIgnoreCase(name)) {
			trd_cur_nm(value);
			return;
		}
		if ($bank_ac_nm.equalsIgnoreCase(name)) {
			bank_ac_nm(value);
			return;
		}
		if ($pay_mtd_nm1.equalsIgnoreCase(name)) {
			pay_mtd_nm1(value);
			return;
		}
		if ($pay_mtd_nm2.equalsIgnoreCase(name)) {
			pay_mtd_nm2(value);
			return;
		}
		if ($pay_mtd_nm3.equalsIgnoreCase(name)) {
			pay_mtd_nm3(value);
			return;
		}
		if ($pay_mtd_nm4.equalsIgnoreCase(name)) {
			pay_mtd_nm4(value);
			return;
		}
		if ($pay_mtd_nm5.equalsIgnoreCase(name)) {
			pay_mtd_nm5(value);
			return;
		}
		if ($pay_mtd_nm6.equalsIgnoreCase(name)) {
			pay_mtd_nm6(value);
			return;
		}
		if ($pay_mtd_nm7.equalsIgnoreCase(name)) {
			pay_mtd_nm7(value);
			return;
		}
		if ($pay_mtd_nm8.equalsIgnoreCase(name)) {
			pay_mtd_nm8(value);
			return;
		}
		if ($pay_mtd_nm9.equalsIgnoreCase(name)) {
			pay_mtd_nm9(value);
			return;
		}
		if ($pay_mtd_nm10.equalsIgnoreCase(name)) {
			pay_mtd_nm10(value);
			return;
		}
		if ($trd_nm.equalsIgnoreCase(name)) {
			trd_nm(value);
			return;
		}
		if ($itm_nm.equalsIgnoreCase(name)) {
			itm_nm(value);
			return;
		}
		if ($trd_unit_nm.equalsIgnoreCase(name)) {
			trd_unit_nm(value);
			return;
		}
		if ($tax_nm.equalsIgnoreCase(name)) {
			tax_nm(value);
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
		if ($bill_xrate.equalsIgnoreCase(name)) {
			bill_xrate(value);
			return;
		}
		if ($last_bill_amt.equalsIgnoreCase(name)) {
			last_bill_amt(value);
			return;
		}
		if ($rcv_amt.equalsIgnoreCase(name)) {
			rcv_amt(value);
			return;
		}
		if ($sw_amt.equalsIgnoreCase(name)) {
			sw_amt(value);
			return;
		}
		if ($setoff_amt.equalsIgnoreCase(name)) {
			setoff_amt(value);
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
		if ($dscnt_amt.equalsIgnoreCase(name)) {
			dscnt_amt(value);
			return;
		}
		if ($ret_amt.equalsIgnoreCase(name)) {
			ret_amt(value);
			return;
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			tax_amt(value);
			return;
		}
		if ($sw_to_amt.equalsIgnoreCase(name)) {
			sw_to_amt(value);
			return;
		}
		if ($bill_amt.equalsIgnoreCase(name)) {
			bill_amt(value);
			return;
		}
		if ($tax_rate1.equalsIgnoreCase(name)) {
			tax_rate1(value);
			return;
		}
		if ($tax_rate_sls_amt1.equalsIgnoreCase(name)) {
			tax_rate_sls_amt1(value);
			return;
		}
		if ($tax_rate_tax_amt1.equalsIgnoreCase(name)) {
			tax_rate_tax_amt1(value);
			return;
		}
		if ($tax_rate_base_tax_amt1.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt1(value);
			return;
		}
		if ($tax_rate2.equalsIgnoreCase(name)) {
			tax_rate2(value);
			return;
		}
		if ($tax_rate_sls_amt2.equalsIgnoreCase(name)) {
			tax_rate_sls_amt2(value);
			return;
		}
		if ($tax_rate_tax_amt2.equalsIgnoreCase(name)) {
			tax_rate_tax_amt2(value);
			return;
		}
		if ($tax_rate_base_tax_amt2.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt2(value);
			return;
		}
		if ($tax_rate3.equalsIgnoreCase(name)) {
			tax_rate3(value);
			return;
		}
		if ($tax_rate_sls_amt3.equalsIgnoreCase(name)) {
			tax_rate_sls_amt3(value);
			return;
		}
		if ($tax_rate_tax_amt3.equalsIgnoreCase(name)) {
			tax_rate_tax_amt3(value);
			return;
		}
		if ($tax_rate_base_tax_amt3.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt3(value);
			return;
		}
		if ($tax_rate4.equalsIgnoreCase(name)) {
			tax_rate4(value);
			return;
		}
		if ($tax_rate_sls_amt4.equalsIgnoreCase(name)) {
			tax_rate_sls_amt4(value);
			return;
		}
		if ($tax_rate_tax_amt4.equalsIgnoreCase(name)) {
			tax_rate_tax_amt4(value);
			return;
		}
		if ($tax_rate_base_tax_amt4.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt4(value);
			return;
		}
		if ($tax_rate5.equalsIgnoreCase(name)) {
			tax_rate5(value);
			return;
		}
		if ($tax_rate_sls_amt5.equalsIgnoreCase(name)) {
			tax_rate_sls_amt5(value);
			return;
		}
		if ($tax_rate_tax_amt5.equalsIgnoreCase(name)) {
			tax_rate_tax_amt5(value);
			return;
		}
		if ($tax_rate_base_tax_amt5.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt5(value);
			return;
		}
		if ($tax_rate6.equalsIgnoreCase(name)) {
			tax_rate6(value);
			return;
		}
		if ($tax_rate_sls_amt6.equalsIgnoreCase(name)) {
			tax_rate_sls_amt6(value);
			return;
		}
		if ($tax_rate_tax_amt6.equalsIgnoreCase(name)) {
			tax_rate_tax_amt6(value);
			return;
		}
		if ($tax_rate_base_tax_amt6.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt6(value);
			return;
		}
		if ($tax_rate7.equalsIgnoreCase(name)) {
			tax_rate7(value);
			return;
		}
		if ($tax_rate_sls_amt7.equalsIgnoreCase(name)) {
			tax_rate_sls_amt7(value);
			return;
		}
		if ($tax_rate_tax_amt7.equalsIgnoreCase(name)) {
			tax_rate_tax_amt7(value);
			return;
		}
		if ($tax_rate_base_tax_amt7.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt7(value);
			return;
		}
		if ($tax_rate8.equalsIgnoreCase(name)) {
			tax_rate8(value);
			return;
		}
		if ($tax_rate_sls_amt8.equalsIgnoreCase(name)) {
			tax_rate_sls_amt8(value);
			return;
		}
		if ($tax_rate_tax_amt8.equalsIgnoreCase(name)) {
			tax_rate_tax_amt8(value);
			return;
		}
		if ($tax_rate_base_tax_amt8.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt8(value);
			return;
		}
		if ($tax_rate9.equalsIgnoreCase(name)) {
			tax_rate9(value);
			return;
		}
		if ($tax_rate_sls_amt9.equalsIgnoreCase(name)) {
			tax_rate_sls_amt9(value);
			return;
		}
		if ($tax_rate_tax_amt9.equalsIgnoreCase(name)) {
			tax_rate_tax_amt9(value);
			return;
		}
		if ($tax_rate_base_tax_amt9.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt9(value);
			return;
		}
		if ($tax_rate10.equalsIgnoreCase(name)) {
			tax_rate10(value);
			return;
		}
		if ($tax_rate_sls_amt10.equalsIgnoreCase(name)) {
			tax_rate_sls_amt10(value);
			return;
		}
		if ($tax_rate_tax_amt10.equalsIgnoreCase(name)) {
			tax_rate_tax_amt10(value);
			return;
		}
		if ($tax_rate_base_tax_amt10.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt10(value);
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
		if ($pay_schd_amt1.equalsIgnoreCase(name)) {
			pay_schd_amt1(value);
			return;
		}
		if ($pay_schd_amt2.equalsIgnoreCase(name)) {
			pay_schd_amt2(value);
			return;
		}
		if ($pay_schd_amt3.equalsIgnoreCase(name)) {
			pay_schd_amt3(value);
			return;
		}
		if ($pay_schd_amt4.equalsIgnoreCase(name)) {
			pay_schd_amt4(value);
			return;
		}
		if ($pay_schd_amt5.equalsIgnoreCase(name)) {
			pay_schd_amt5(value);
			return;
		}
		if ($pay_schd_amt6.equalsIgnoreCase(name)) {
			pay_schd_amt6(value);
			return;
		}
		if ($pay_schd_amt7.equalsIgnoreCase(name)) {
			pay_schd_amt7(value);
			return;
		}
		if ($pay_schd_amt8.equalsIgnoreCase(name)) {
			pay_schd_amt8(value);
			return;
		}
		if ($pay_schd_amt9.equalsIgnoreCase(name)) {
			pay_schd_amt9(value);
			return;
		}
		if ($pay_schd_amt10.equalsIgnoreCase(name)) {
			pay_schd_amt10(value);
			return;
		}
		if ($act_rev.equalsIgnoreCase(name)) {
			act_rev(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
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
		if ($bill_xrate.equalsIgnoreCase(name)) {
			bill_xrate(value);
			return;
		}
		if ($last_bill_amt.equalsIgnoreCase(name)) {
			last_bill_amt(value);
			return;
		}
		if ($rcv_amt.equalsIgnoreCase(name)) {
			rcv_amt(value);
			return;
		}
		if ($sw_amt.equalsIgnoreCase(name)) {
			sw_amt(value);
			return;
		}
		if ($setoff_amt.equalsIgnoreCase(name)) {
			setoff_amt(value);
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
		if ($dscnt_amt.equalsIgnoreCase(name)) {
			dscnt_amt(value);
			return;
		}
		if ($ret_amt.equalsIgnoreCase(name)) {
			ret_amt(value);
			return;
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			tax_amt(value);
			return;
		}
		if ($sw_to_amt.equalsIgnoreCase(name)) {
			sw_to_amt(value);
			return;
		}
		if ($bill_amt.equalsIgnoreCase(name)) {
			bill_amt(value);
			return;
		}
		if ($tax_rate1.equalsIgnoreCase(name)) {
			tax_rate1(value);
			return;
		}
		if ($tax_rate_sls_amt1.equalsIgnoreCase(name)) {
			tax_rate_sls_amt1(value);
			return;
		}
		if ($tax_rate_tax_amt1.equalsIgnoreCase(name)) {
			tax_rate_tax_amt1(value);
			return;
		}
		if ($tax_rate_base_tax_amt1.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt1(value);
			return;
		}
		if ($tax_rate2.equalsIgnoreCase(name)) {
			tax_rate2(value);
			return;
		}
		if ($tax_rate_sls_amt2.equalsIgnoreCase(name)) {
			tax_rate_sls_amt2(value);
			return;
		}
		if ($tax_rate_tax_amt2.equalsIgnoreCase(name)) {
			tax_rate_tax_amt2(value);
			return;
		}
		if ($tax_rate_base_tax_amt2.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt2(value);
			return;
		}
		if ($tax_rate3.equalsIgnoreCase(name)) {
			tax_rate3(value);
			return;
		}
		if ($tax_rate_sls_amt3.equalsIgnoreCase(name)) {
			tax_rate_sls_amt3(value);
			return;
		}
		if ($tax_rate_tax_amt3.equalsIgnoreCase(name)) {
			tax_rate_tax_amt3(value);
			return;
		}
		if ($tax_rate_base_tax_amt3.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt3(value);
			return;
		}
		if ($tax_rate4.equalsIgnoreCase(name)) {
			tax_rate4(value);
			return;
		}
		if ($tax_rate_sls_amt4.equalsIgnoreCase(name)) {
			tax_rate_sls_amt4(value);
			return;
		}
		if ($tax_rate_tax_amt4.equalsIgnoreCase(name)) {
			tax_rate_tax_amt4(value);
			return;
		}
		if ($tax_rate_base_tax_amt4.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt4(value);
			return;
		}
		if ($tax_rate5.equalsIgnoreCase(name)) {
			tax_rate5(value);
			return;
		}
		if ($tax_rate_sls_amt5.equalsIgnoreCase(name)) {
			tax_rate_sls_amt5(value);
			return;
		}
		if ($tax_rate_tax_amt5.equalsIgnoreCase(name)) {
			tax_rate_tax_amt5(value);
			return;
		}
		if ($tax_rate_base_tax_amt5.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt5(value);
			return;
		}
		if ($tax_rate6.equalsIgnoreCase(name)) {
			tax_rate6(value);
			return;
		}
		if ($tax_rate_sls_amt6.equalsIgnoreCase(name)) {
			tax_rate_sls_amt6(value);
			return;
		}
		if ($tax_rate_tax_amt6.equalsIgnoreCase(name)) {
			tax_rate_tax_amt6(value);
			return;
		}
		if ($tax_rate_base_tax_amt6.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt6(value);
			return;
		}
		if ($tax_rate7.equalsIgnoreCase(name)) {
			tax_rate7(value);
			return;
		}
		if ($tax_rate_sls_amt7.equalsIgnoreCase(name)) {
			tax_rate_sls_amt7(value);
			return;
		}
		if ($tax_rate_tax_amt7.equalsIgnoreCase(name)) {
			tax_rate_tax_amt7(value);
			return;
		}
		if ($tax_rate_base_tax_amt7.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt7(value);
			return;
		}
		if ($tax_rate8.equalsIgnoreCase(name)) {
			tax_rate8(value);
			return;
		}
		if ($tax_rate_sls_amt8.equalsIgnoreCase(name)) {
			tax_rate_sls_amt8(value);
			return;
		}
		if ($tax_rate_tax_amt8.equalsIgnoreCase(name)) {
			tax_rate_tax_amt8(value);
			return;
		}
		if ($tax_rate_base_tax_amt8.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt8(value);
			return;
		}
		if ($tax_rate9.equalsIgnoreCase(name)) {
			tax_rate9(value);
			return;
		}
		if ($tax_rate_sls_amt9.equalsIgnoreCase(name)) {
			tax_rate_sls_amt9(value);
			return;
		}
		if ($tax_rate_tax_amt9.equalsIgnoreCase(name)) {
			tax_rate_tax_amt9(value);
			return;
		}
		if ($tax_rate_base_tax_amt9.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt9(value);
			return;
		}
		if ($tax_rate10.equalsIgnoreCase(name)) {
			tax_rate10(value);
			return;
		}
		if ($tax_rate_sls_amt10.equalsIgnoreCase(name)) {
			tax_rate_sls_amt10(value);
			return;
		}
		if ($tax_rate_tax_amt10.equalsIgnoreCase(name)) {
			tax_rate_tax_amt10(value);
			return;
		}
		if ($tax_rate_base_tax_amt10.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt10(value);
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
		if ($pay_schd_amt1.equalsIgnoreCase(name)) {
			pay_schd_amt1(value);
			return;
		}
		if ($pay_schd_amt2.equalsIgnoreCase(name)) {
			pay_schd_amt2(value);
			return;
		}
		if ($pay_schd_amt3.equalsIgnoreCase(name)) {
			pay_schd_amt3(value);
			return;
		}
		if ($pay_schd_amt4.equalsIgnoreCase(name)) {
			pay_schd_amt4(value);
			return;
		}
		if ($pay_schd_amt5.equalsIgnoreCase(name)) {
			pay_schd_amt5(value);
			return;
		}
		if ($pay_schd_amt6.equalsIgnoreCase(name)) {
			pay_schd_amt6(value);
			return;
		}
		if ($pay_schd_amt7.equalsIgnoreCase(name)) {
			pay_schd_amt7(value);
			return;
		}
		if ($pay_schd_amt8.equalsIgnoreCase(name)) {
			pay_schd_amt8(value);
			return;
		}
		if ($pay_schd_amt9.equalsIgnoreCase(name)) {
			pay_schd_amt9(value);
			return;
		}
		if ($pay_schd_amt10.equalsIgnoreCase(name)) {
			pay_schd_amt10(value);
			return;
		}
		if ($act_rev.equalsIgnoreCase(name)) {
			act_rev(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
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
		if ($bill_xrate.equalsIgnoreCase(name)) {
			bill_xrate(value);
			return;
		}
		if ($last_bill_amt.equalsIgnoreCase(name)) {
			last_bill_amt(value);
			return;
		}
		if ($rcv_amt.equalsIgnoreCase(name)) {
			rcv_amt(value);
			return;
		}
		if ($sw_amt.equalsIgnoreCase(name)) {
			sw_amt(value);
			return;
		}
		if ($setoff_amt.equalsIgnoreCase(name)) {
			setoff_amt(value);
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
		if ($dscnt_amt.equalsIgnoreCase(name)) {
			dscnt_amt(value);
			return;
		}
		if ($ret_amt.equalsIgnoreCase(name)) {
			ret_amt(value);
			return;
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			tax_amt(value);
			return;
		}
		if ($sw_to_amt.equalsIgnoreCase(name)) {
			sw_to_amt(value);
			return;
		}
		if ($bill_amt.equalsIgnoreCase(name)) {
			bill_amt(value);
			return;
		}
		if ($tax_rate1.equalsIgnoreCase(name)) {
			tax_rate1(value);
			return;
		}
		if ($tax_rate_sls_amt1.equalsIgnoreCase(name)) {
			tax_rate_sls_amt1(value);
			return;
		}
		if ($tax_rate_tax_amt1.equalsIgnoreCase(name)) {
			tax_rate_tax_amt1(value);
			return;
		}
		if ($tax_rate_base_tax_amt1.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt1(value);
			return;
		}
		if ($tax_rate2.equalsIgnoreCase(name)) {
			tax_rate2(value);
			return;
		}
		if ($tax_rate_sls_amt2.equalsIgnoreCase(name)) {
			tax_rate_sls_amt2(value);
			return;
		}
		if ($tax_rate_tax_amt2.equalsIgnoreCase(name)) {
			tax_rate_tax_amt2(value);
			return;
		}
		if ($tax_rate_base_tax_amt2.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt2(value);
			return;
		}
		if ($tax_rate3.equalsIgnoreCase(name)) {
			tax_rate3(value);
			return;
		}
		if ($tax_rate_sls_amt3.equalsIgnoreCase(name)) {
			tax_rate_sls_amt3(value);
			return;
		}
		if ($tax_rate_tax_amt3.equalsIgnoreCase(name)) {
			tax_rate_tax_amt3(value);
			return;
		}
		if ($tax_rate_base_tax_amt3.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt3(value);
			return;
		}
		if ($tax_rate4.equalsIgnoreCase(name)) {
			tax_rate4(value);
			return;
		}
		if ($tax_rate_sls_amt4.equalsIgnoreCase(name)) {
			tax_rate_sls_amt4(value);
			return;
		}
		if ($tax_rate_tax_amt4.equalsIgnoreCase(name)) {
			tax_rate_tax_amt4(value);
			return;
		}
		if ($tax_rate_base_tax_amt4.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt4(value);
			return;
		}
		if ($tax_rate5.equalsIgnoreCase(name)) {
			tax_rate5(value);
			return;
		}
		if ($tax_rate_sls_amt5.equalsIgnoreCase(name)) {
			tax_rate_sls_amt5(value);
			return;
		}
		if ($tax_rate_tax_amt5.equalsIgnoreCase(name)) {
			tax_rate_tax_amt5(value);
			return;
		}
		if ($tax_rate_base_tax_amt5.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt5(value);
			return;
		}
		if ($tax_rate6.equalsIgnoreCase(name)) {
			tax_rate6(value);
			return;
		}
		if ($tax_rate_sls_amt6.equalsIgnoreCase(name)) {
			tax_rate_sls_amt6(value);
			return;
		}
		if ($tax_rate_tax_amt6.equalsIgnoreCase(name)) {
			tax_rate_tax_amt6(value);
			return;
		}
		if ($tax_rate_base_tax_amt6.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt6(value);
			return;
		}
		if ($tax_rate7.equalsIgnoreCase(name)) {
			tax_rate7(value);
			return;
		}
		if ($tax_rate_sls_amt7.equalsIgnoreCase(name)) {
			tax_rate_sls_amt7(value);
			return;
		}
		if ($tax_rate_tax_amt7.equalsIgnoreCase(name)) {
			tax_rate_tax_amt7(value);
			return;
		}
		if ($tax_rate_base_tax_amt7.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt7(value);
			return;
		}
		if ($tax_rate8.equalsIgnoreCase(name)) {
			tax_rate8(value);
			return;
		}
		if ($tax_rate_sls_amt8.equalsIgnoreCase(name)) {
			tax_rate_sls_amt8(value);
			return;
		}
		if ($tax_rate_tax_amt8.equalsIgnoreCase(name)) {
			tax_rate_tax_amt8(value);
			return;
		}
		if ($tax_rate_base_tax_amt8.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt8(value);
			return;
		}
		if ($tax_rate9.equalsIgnoreCase(name)) {
			tax_rate9(value);
			return;
		}
		if ($tax_rate_sls_amt9.equalsIgnoreCase(name)) {
			tax_rate_sls_amt9(value);
			return;
		}
		if ($tax_rate_tax_amt9.equalsIgnoreCase(name)) {
			tax_rate_tax_amt9(value);
			return;
		}
		if ($tax_rate_base_tax_amt9.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt9(value);
			return;
		}
		if ($tax_rate10.equalsIgnoreCase(name)) {
			tax_rate10(value);
			return;
		}
		if ($tax_rate_sls_amt10.equalsIgnoreCase(name)) {
			tax_rate_sls_amt10(value);
			return;
		}
		if ($tax_rate_tax_amt10.equalsIgnoreCase(name)) {
			tax_rate_tax_amt10(value);
			return;
		}
		if ($tax_rate_base_tax_amt10.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt10(value);
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
		if ($pay_schd_amt1.equalsIgnoreCase(name)) {
			pay_schd_amt1(value);
			return;
		}
		if ($pay_schd_amt2.equalsIgnoreCase(name)) {
			pay_schd_amt2(value);
			return;
		}
		if ($pay_schd_amt3.equalsIgnoreCase(name)) {
			pay_schd_amt3(value);
			return;
		}
		if ($pay_schd_amt4.equalsIgnoreCase(name)) {
			pay_schd_amt4(value);
			return;
		}
		if ($pay_schd_amt5.equalsIgnoreCase(name)) {
			pay_schd_amt5(value);
			return;
		}
		if ($pay_schd_amt6.equalsIgnoreCase(name)) {
			pay_schd_amt6(value);
			return;
		}
		if ($pay_schd_amt7.equalsIgnoreCase(name)) {
			pay_schd_amt7(value);
			return;
		}
		if ($pay_schd_amt8.equalsIgnoreCase(name)) {
			pay_schd_amt8(value);
			return;
		}
		if ($pay_schd_amt9.equalsIgnoreCase(name)) {
			pay_schd_amt9(value);
			return;
		}
		if ($pay_schd_amt10.equalsIgnoreCase(name)) {
			pay_schd_amt10(value);
			return;
		}
		if ($act_rev.equalsIgnoreCase(name)) {
			act_rev(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
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
		if ($bill_xrate.equalsIgnoreCase(name)) {
			bill_xrate(value);
			return;
		}
		if ($last_bill_amt.equalsIgnoreCase(name)) {
			last_bill_amt(value);
			return;
		}
		if ($rcv_amt.equalsIgnoreCase(name)) {
			rcv_amt(value);
			return;
		}
		if ($sw_amt.equalsIgnoreCase(name)) {
			sw_amt(value);
			return;
		}
		if ($setoff_amt.equalsIgnoreCase(name)) {
			setoff_amt(value);
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
		if ($dscnt_amt.equalsIgnoreCase(name)) {
			dscnt_amt(value);
			return;
		}
		if ($ret_amt.equalsIgnoreCase(name)) {
			ret_amt(value);
			return;
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			tax_amt(value);
			return;
		}
		if ($sw_to_amt.equalsIgnoreCase(name)) {
			sw_to_amt(value);
			return;
		}
		if ($bill_amt.equalsIgnoreCase(name)) {
			bill_amt(value);
			return;
		}
		if ($tax_rate1.equalsIgnoreCase(name)) {
			tax_rate1(value);
			return;
		}
		if ($tax_rate_sls_amt1.equalsIgnoreCase(name)) {
			tax_rate_sls_amt1(value);
			return;
		}
		if ($tax_rate_tax_amt1.equalsIgnoreCase(name)) {
			tax_rate_tax_amt1(value);
			return;
		}
		if ($tax_rate_base_tax_amt1.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt1(value);
			return;
		}
		if ($tax_rate2.equalsIgnoreCase(name)) {
			tax_rate2(value);
			return;
		}
		if ($tax_rate_sls_amt2.equalsIgnoreCase(name)) {
			tax_rate_sls_amt2(value);
			return;
		}
		if ($tax_rate_tax_amt2.equalsIgnoreCase(name)) {
			tax_rate_tax_amt2(value);
			return;
		}
		if ($tax_rate_base_tax_amt2.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt2(value);
			return;
		}
		if ($tax_rate3.equalsIgnoreCase(name)) {
			tax_rate3(value);
			return;
		}
		if ($tax_rate_sls_amt3.equalsIgnoreCase(name)) {
			tax_rate_sls_amt3(value);
			return;
		}
		if ($tax_rate_tax_amt3.equalsIgnoreCase(name)) {
			tax_rate_tax_amt3(value);
			return;
		}
		if ($tax_rate_base_tax_amt3.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt3(value);
			return;
		}
		if ($tax_rate4.equalsIgnoreCase(name)) {
			tax_rate4(value);
			return;
		}
		if ($tax_rate_sls_amt4.equalsIgnoreCase(name)) {
			tax_rate_sls_amt4(value);
			return;
		}
		if ($tax_rate_tax_amt4.equalsIgnoreCase(name)) {
			tax_rate_tax_amt4(value);
			return;
		}
		if ($tax_rate_base_tax_amt4.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt4(value);
			return;
		}
		if ($tax_rate5.equalsIgnoreCase(name)) {
			tax_rate5(value);
			return;
		}
		if ($tax_rate_sls_amt5.equalsIgnoreCase(name)) {
			tax_rate_sls_amt5(value);
			return;
		}
		if ($tax_rate_tax_amt5.equalsIgnoreCase(name)) {
			tax_rate_tax_amt5(value);
			return;
		}
		if ($tax_rate_base_tax_amt5.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt5(value);
			return;
		}
		if ($tax_rate6.equalsIgnoreCase(name)) {
			tax_rate6(value);
			return;
		}
		if ($tax_rate_sls_amt6.equalsIgnoreCase(name)) {
			tax_rate_sls_amt6(value);
			return;
		}
		if ($tax_rate_tax_amt6.equalsIgnoreCase(name)) {
			tax_rate_tax_amt6(value);
			return;
		}
		if ($tax_rate_base_tax_amt6.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt6(value);
			return;
		}
		if ($tax_rate7.equalsIgnoreCase(name)) {
			tax_rate7(value);
			return;
		}
		if ($tax_rate_sls_amt7.equalsIgnoreCase(name)) {
			tax_rate_sls_amt7(value);
			return;
		}
		if ($tax_rate_tax_amt7.equalsIgnoreCase(name)) {
			tax_rate_tax_amt7(value);
			return;
		}
		if ($tax_rate_base_tax_amt7.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt7(value);
			return;
		}
		if ($tax_rate8.equalsIgnoreCase(name)) {
			tax_rate8(value);
			return;
		}
		if ($tax_rate_sls_amt8.equalsIgnoreCase(name)) {
			tax_rate_sls_amt8(value);
			return;
		}
		if ($tax_rate_tax_amt8.equalsIgnoreCase(name)) {
			tax_rate_tax_amt8(value);
			return;
		}
		if ($tax_rate_base_tax_amt8.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt8(value);
			return;
		}
		if ($tax_rate9.equalsIgnoreCase(name)) {
			tax_rate9(value);
			return;
		}
		if ($tax_rate_sls_amt9.equalsIgnoreCase(name)) {
			tax_rate_sls_amt9(value);
			return;
		}
		if ($tax_rate_tax_amt9.equalsIgnoreCase(name)) {
			tax_rate_tax_amt9(value);
			return;
		}
		if ($tax_rate_base_tax_amt9.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt9(value);
			return;
		}
		if ($tax_rate10.equalsIgnoreCase(name)) {
			tax_rate10(value);
			return;
		}
		if ($tax_rate_sls_amt10.equalsIgnoreCase(name)) {
			tax_rate_sls_amt10(value);
			return;
		}
		if ($tax_rate_tax_amt10.equalsIgnoreCase(name)) {
			tax_rate_tax_amt10(value);
			return;
		}
		if ($tax_rate_base_tax_amt10.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt10(value);
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
		if ($pay_schd_amt1.equalsIgnoreCase(name)) {
			pay_schd_amt1(value);
			return;
		}
		if ($pay_schd_amt2.equalsIgnoreCase(name)) {
			pay_schd_amt2(value);
			return;
		}
		if ($pay_schd_amt3.equalsIgnoreCase(name)) {
			pay_schd_amt3(value);
			return;
		}
		if ($pay_schd_amt4.equalsIgnoreCase(name)) {
			pay_schd_amt4(value);
			return;
		}
		if ($pay_schd_amt5.equalsIgnoreCase(name)) {
			pay_schd_amt5(value);
			return;
		}
		if ($pay_schd_amt6.equalsIgnoreCase(name)) {
			pay_schd_amt6(value);
			return;
		}
		if ($pay_schd_amt7.equalsIgnoreCase(name)) {
			pay_schd_amt7(value);
			return;
		}
		if ($pay_schd_amt8.equalsIgnoreCase(name)) {
			pay_schd_amt8(value);
			return;
		}
		if ($pay_schd_amt9.equalsIgnoreCase(name)) {
			pay_schd_amt9(value);
			return;
		}
		if ($pay_schd_amt10.equalsIgnoreCase(name)) {
			pay_schd_amt10(value);
			return;
		}
		if ($act_rev.equalsIgnoreCase(name)) {
			act_rev(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
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
		if ($bill_xrate.equalsIgnoreCase(name)) {
			bill_xrate(value);
			return;
		}
		if ($last_bill_amt.equalsIgnoreCase(name)) {
			last_bill_amt(value);
			return;
		}
		if ($rcv_amt.equalsIgnoreCase(name)) {
			rcv_amt(value);
			return;
		}
		if ($sw_amt.equalsIgnoreCase(name)) {
			sw_amt(value);
			return;
		}
		if ($setoff_amt.equalsIgnoreCase(name)) {
			setoff_amt(value);
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
		if ($dscnt_amt.equalsIgnoreCase(name)) {
			dscnt_amt(value);
			return;
		}
		if ($ret_amt.equalsIgnoreCase(name)) {
			ret_amt(value);
			return;
		}
		if ($tax_amt.equalsIgnoreCase(name)) {
			tax_amt(value);
			return;
		}
		if ($sw_to_amt.equalsIgnoreCase(name)) {
			sw_to_amt(value);
			return;
		}
		if ($bill_amt.equalsIgnoreCase(name)) {
			bill_amt(value);
			return;
		}
		if ($tax_rate1.equalsIgnoreCase(name)) {
			tax_rate1(value);
			return;
		}
		if ($tax_rate_sls_amt1.equalsIgnoreCase(name)) {
			tax_rate_sls_amt1(value);
			return;
		}
		if ($tax_rate_tax_amt1.equalsIgnoreCase(name)) {
			tax_rate_tax_amt1(value);
			return;
		}
		if ($tax_rate_base_tax_amt1.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt1(value);
			return;
		}
		if ($tax_rate2.equalsIgnoreCase(name)) {
			tax_rate2(value);
			return;
		}
		if ($tax_rate_sls_amt2.equalsIgnoreCase(name)) {
			tax_rate_sls_amt2(value);
			return;
		}
		if ($tax_rate_tax_amt2.equalsIgnoreCase(name)) {
			tax_rate_tax_amt2(value);
			return;
		}
		if ($tax_rate_base_tax_amt2.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt2(value);
			return;
		}
		if ($tax_rate3.equalsIgnoreCase(name)) {
			tax_rate3(value);
			return;
		}
		if ($tax_rate_sls_amt3.equalsIgnoreCase(name)) {
			tax_rate_sls_amt3(value);
			return;
		}
		if ($tax_rate_tax_amt3.equalsIgnoreCase(name)) {
			tax_rate_tax_amt3(value);
			return;
		}
		if ($tax_rate_base_tax_amt3.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt3(value);
			return;
		}
		if ($tax_rate4.equalsIgnoreCase(name)) {
			tax_rate4(value);
			return;
		}
		if ($tax_rate_sls_amt4.equalsIgnoreCase(name)) {
			tax_rate_sls_amt4(value);
			return;
		}
		if ($tax_rate_tax_amt4.equalsIgnoreCase(name)) {
			tax_rate_tax_amt4(value);
			return;
		}
		if ($tax_rate_base_tax_amt4.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt4(value);
			return;
		}
		if ($tax_rate5.equalsIgnoreCase(name)) {
			tax_rate5(value);
			return;
		}
		if ($tax_rate_sls_amt5.equalsIgnoreCase(name)) {
			tax_rate_sls_amt5(value);
			return;
		}
		if ($tax_rate_tax_amt5.equalsIgnoreCase(name)) {
			tax_rate_tax_amt5(value);
			return;
		}
		if ($tax_rate_base_tax_amt5.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt5(value);
			return;
		}
		if ($tax_rate6.equalsIgnoreCase(name)) {
			tax_rate6(value);
			return;
		}
		if ($tax_rate_sls_amt6.equalsIgnoreCase(name)) {
			tax_rate_sls_amt6(value);
			return;
		}
		if ($tax_rate_tax_amt6.equalsIgnoreCase(name)) {
			tax_rate_tax_amt6(value);
			return;
		}
		if ($tax_rate_base_tax_amt6.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt6(value);
			return;
		}
		if ($tax_rate7.equalsIgnoreCase(name)) {
			tax_rate7(value);
			return;
		}
		if ($tax_rate_sls_amt7.equalsIgnoreCase(name)) {
			tax_rate_sls_amt7(value);
			return;
		}
		if ($tax_rate_tax_amt7.equalsIgnoreCase(name)) {
			tax_rate_tax_amt7(value);
			return;
		}
		if ($tax_rate_base_tax_amt7.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt7(value);
			return;
		}
		if ($tax_rate8.equalsIgnoreCase(name)) {
			tax_rate8(value);
			return;
		}
		if ($tax_rate_sls_amt8.equalsIgnoreCase(name)) {
			tax_rate_sls_amt8(value);
			return;
		}
		if ($tax_rate_tax_amt8.equalsIgnoreCase(name)) {
			tax_rate_tax_amt8(value);
			return;
		}
		if ($tax_rate_base_tax_amt8.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt8(value);
			return;
		}
		if ($tax_rate9.equalsIgnoreCase(name)) {
			tax_rate9(value);
			return;
		}
		if ($tax_rate_sls_amt9.equalsIgnoreCase(name)) {
			tax_rate_sls_amt9(value);
			return;
		}
		if ($tax_rate_tax_amt9.equalsIgnoreCase(name)) {
			tax_rate_tax_amt9(value);
			return;
		}
		if ($tax_rate_base_tax_amt9.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt9(value);
			return;
		}
		if ($tax_rate10.equalsIgnoreCase(name)) {
			tax_rate10(value);
			return;
		}
		if ($tax_rate_sls_amt10.equalsIgnoreCase(name)) {
			tax_rate_sls_amt10(value);
			return;
		}
		if ($tax_rate_tax_amt10.equalsIgnoreCase(name)) {
			tax_rate_tax_amt10(value);
			return;
		}
		if ($tax_rate_base_tax_amt10.equalsIgnoreCase(name)) {
			tax_rate_base_tax_amt10(value);
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
		if ($pay_schd_amt1.equalsIgnoreCase(name)) {
			pay_schd_amt1(value);
			return;
		}
		if ($pay_schd_amt2.equalsIgnoreCase(name)) {
			pay_schd_amt2(value);
			return;
		}
		if ($pay_schd_amt3.equalsIgnoreCase(name)) {
			pay_schd_amt3(value);
			return;
		}
		if ($pay_schd_amt4.equalsIgnoreCase(name)) {
			pay_schd_amt4(value);
			return;
		}
		if ($pay_schd_amt5.equalsIgnoreCase(name)) {
			pay_schd_amt5(value);
			return;
		}
		if ($pay_schd_amt6.equalsIgnoreCase(name)) {
			pay_schd_amt6(value);
			return;
		}
		if ($pay_schd_amt7.equalsIgnoreCase(name)) {
			pay_schd_amt7(value);
			return;
		}
		if ($pay_schd_amt8.equalsIgnoreCase(name)) {
			pay_schd_amt8(value);
			return;
		}
		if ($pay_schd_amt9.equalsIgnoreCase(name)) {
			pay_schd_amt9(value);
			return;
		}
		if ($pay_schd_amt10.equalsIgnoreCase(name)) {
			pay_schd_amt10(value);
			return;
		}
		if ($act_rev.equalsIgnoreCase(name)) {
			act_rev(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			trd_cur_amt(value);
			return;
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			trd_cur_dscnt_amt(value);
			return;
		}
		if ($tax_rate.equalsIgnoreCase(name)) {
			tax_rate(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
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
		if ($bill_st_dt.equalsIgnoreCase(name)) {
			bill_st_dt(value);
			return;
		}
		if ($bill_end_dt.equalsIgnoreCase(name)) {
			bill_end_dt(value);
			return;
		}
		if ($pay_schd_dt1.equalsIgnoreCase(name)) {
			pay_schd_dt1(value);
			return;
		}
		if ($pay_schd_dt2.equalsIgnoreCase(name)) {
			pay_schd_dt2(value);
			return;
		}
		if ($pay_schd_dt3.equalsIgnoreCase(name)) {
			pay_schd_dt3(value);
			return;
		}
		if ($pay_schd_dt4.equalsIgnoreCase(name)) {
			pay_schd_dt4(value);
			return;
		}
		if ($pay_schd_dt5.equalsIgnoreCase(name)) {
			pay_schd_dt5(value);
			return;
		}
		if ($pay_schd_dt6.equalsIgnoreCase(name)) {
			pay_schd_dt6(value);
			return;
		}
		if ($pay_schd_dt7.equalsIgnoreCase(name)) {
			pay_schd_dt7(value);
			return;
		}
		if ($pay_schd_dt8.equalsIgnoreCase(name)) {
			pay_schd_dt8(value);
			return;
		}
		if ($pay_schd_dt9.equalsIgnoreCase(name)) {
			pay_schd_dt9(value);
			return;
		}
		if ($pay_schd_dt10.equalsIgnoreCase(name)) {
			pay_schd_dt10(value);
			return;
		}
		if ($ac_dt.equalsIgnoreCase(name)) {
			ac_dt(value);
			return;
		}
		if ($dlv_dt.equalsIgnoreCase(name)) {
			dlv_dt(value);
			return;
		}
		if ($rcv_dt.equalsIgnoreCase(name)) {
			rcv_dt(value);
			return;
		}
		if ($bill_basis_dt.equalsIgnoreCase(name)) {
			bill_basis_dt(value);
			return;
		}
		if ($base_ac_dt.equalsIgnoreCase(name)) {
			base_ac_dt(value);
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
		if ($interim_flg.equalsIgnoreCase(name)) {
			interim_flg(value);
			return;
		}
		if ($inc_tax_flg.equalsIgnoreCase(name)) {
			inc_tax_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

}
