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
 * "請求受領ヘッダ // Billing receipt header"DBコンテナRowクラスです。<p>
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
 *  	<td>bill_rcpt_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>請求受領ＮＯ</td>
 *  	<td>Billing receipt No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>invalid_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>無効ＦＬＧ</td>
 *  	<td>Invalid flg.</td>
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
 *  	<td>pre_bill_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>先行請求日</td>
 *  	<td>Advance billing date</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>bill_st_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>請求期間開始日</td>
 *  	<td>Billing period start date</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>bill_end_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>請求期間終了日</td>
 *  	<td>Billing period end date</td>
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
 *  	<td>wrk_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>案件名</td>
 *  	<td>Sales project name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>bill_src_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>請求元ＣＤ</td>
 *  	<td>Billing source cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>bill_src_ein</td>
 *  	<td>C</td>
 *  	<td>13</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>請求元法人番号</td>
 *  	<td>Billing source corporation No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>bill_src_biz_co_no</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>請求元事業者ＮＯ</td>
 *  	<td>Billing source business No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>bill_src_zip_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>請求元郵便番号</td>
 *  	<td>Billing source zip code</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>bill_src_addr1</td>
 *  	<td>C</td>
 *  	<td>250</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>請求元住所１</td>
 *  	<td>Billing source address 1</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>bill_src_addr2</td>
 *  	<td>C</td>
 *  	<td>250</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>請求元住所２</td>
 *  	<td>Billing source address 2</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>bill_src_addr3</td>
 *  	<td>C</td>
 *  	<td>250</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>請求元住所３</td>
 *  	<td>Billing source address 3</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>bill_src_addr4</td>
 *  	<td>C</td>
 *  	<td>250</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>請求元住所４</td>
 *  	<td>Billing source address 4</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>bill_src_dpt</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>請求元部門</td>
 *  	<td>Billing source dept.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>bill_src_tel</td>
 *  	<td>C</td>
 *  	<td>30</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>請求元ＴＥＬ</td>
 *  	<td>Billing source TEL</td>
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
public class MST_BILL_RCPT_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.CO_VIEW;

	public static final String TABLE_NAME = "MST_BILL_RCPT";

	public static final boolean EX_CTRL = true;
	
	public static final boolean LCL_TABLE = false;
	
	/**
	 * 請求受領ＮＯ. Billing receipt No..<p>
	 *
	 */
	public static final String $bill_rcpt_no = "bill_rcpt_no";
	private static final MCPermColumnInfo _bill_rcpt_no = createColumnInfo("bill_rcpt_no");
	public final MCStringPermColumn bill_rcpt_no = createStringColumn(_bill_rcpt_no);
	
	/**
	 * 無効ＦＬＧ. Invalid flg..<p>
	 *
	 */
	public static final String $invalid_flg = "invalid_flg";
	private static final MCPermColumnInfo _invalid_flg = createColumnInfo("invalid_flg");
	public final MCBooleanPermColumn invalid_flg = createBooleanColumn(_invalid_flg);
	
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
	 * 口座ＣＤ. Bank account cd..<p>
	 *
	 */
	public static final String $bank_ac_cd = "bank_ac_cd";
	private static final MCPermColumnInfo _bank_ac_cd = createColumnInfo("bank_ac_cd");
	public final MCStringPermColumn bank_ac_cd = createStringColumn(_bank_ac_cd);
	
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
	
	public static final MCMeta bill_rcpt_no_META = createCommonMeta($bill_rcpt_no, mcframe.commonMA.meta.MA_META.BILL_RCPT_NO);
	public static final MCMeta invalid_flg_META = createCommonMeta($invalid_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bill_cl_dt_META = createCommonMeta($bill_cl_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta bill_dt_META = createCommonMeta($bill_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta bill_no_META = createCommonMeta($bill_no, mcframe.commonMA.meta.MA_META.BILL_NO);
	public static final MCMeta pre_bill_no_META = createCommonMeta($pre_bill_no, mcframe.commonMA.meta.MA_META.PRE_BILL_NO);
	public static final MCMeta pre_bill_dt_META = createCommonMeta($pre_bill_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta bill_st_dt_META = createCommonMeta($bill_st_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta bill_end_dt_META = createCommonMeta($bill_end_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta iv_no_META = createCommonMeta($iv_no, mcframe.commonMA.meta.MA_META.IV_NO);
	public static final MCMeta wrk_no_META = createCommonMeta($wrk_no, mcframe.commonMA.meta.MA_META.WRK_NO);
	public static final MCMeta wrk_nm_META = createCommonMeta($wrk_nm, mcframe.commonMA.meta.MA_META.WRK_NM);
	public static final MCMeta bill_src_cd_META = createCommonMeta($bill_src_cd, mcframe.commonMA.meta.MA_META.BP_CD);
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
	public static final MCMeta pay_schd_dt2_META = createCommonMeta($pay_schd_dt2, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta pay_schd_amt2_META = createCommonMeta($pay_schd_amt2, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta pay_mtd_cd2_META = createCommonMeta($pay_mtd_cd2, mcframe.commonMA.meta.MA_META.STTL_CD);
	public static final MCMeta pay_schd_dt3_META = createCommonMeta($pay_schd_dt3, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta pay_schd_amt3_META = createCommonMeta($pay_schd_amt3, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta pay_mtd_cd3_META = createCommonMeta($pay_mtd_cd3, mcframe.commonMA.meta.MA_META.STTL_CD);
	public static final MCMeta pay_schd_dt4_META = createCommonMeta($pay_schd_dt4, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta pay_schd_amt4_META = createCommonMeta($pay_schd_amt4, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta pay_mtd_cd4_META = createCommonMeta($pay_mtd_cd4, mcframe.commonMA.meta.MA_META.STTL_CD);
	public static final MCMeta pay_schd_dt5_META = createCommonMeta($pay_schd_dt5, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta pay_schd_amt5_META = createCommonMeta($pay_schd_amt5, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta pay_mtd_cd5_META = createCommonMeta($pay_mtd_cd5, mcframe.commonMA.meta.MA_META.STTL_CD);
	public static final MCMeta pay_schd_dt6_META = createCommonMeta($pay_schd_dt6, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta pay_schd_amt6_META = createCommonMeta($pay_schd_amt6, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta pay_mtd_cd6_META = createCommonMeta($pay_mtd_cd6, mcframe.commonMA.meta.MA_META.STTL_CD);
	public static final MCMeta pay_schd_dt7_META = createCommonMeta($pay_schd_dt7, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta pay_schd_amt7_META = createCommonMeta($pay_schd_amt7, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta pay_mtd_cd7_META = createCommonMeta($pay_mtd_cd7, mcframe.commonMA.meta.MA_META.STTL_CD);
	public static final MCMeta pay_schd_dt8_META = createCommonMeta($pay_schd_dt8, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta pay_schd_amt8_META = createCommonMeta($pay_schd_amt8, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta pay_mtd_cd8_META = createCommonMeta($pay_mtd_cd8, mcframe.commonMA.meta.MA_META.STTL_CD);
	public static final MCMeta pay_schd_dt9_META = createCommonMeta($pay_schd_dt9, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta pay_schd_amt9_META = createCommonMeta($pay_schd_amt9, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta pay_mtd_cd9_META = createCommonMeta($pay_mtd_cd9, mcframe.commonMA.meta.MA_META.STTL_CD);
	public static final MCMeta pay_schd_dt10_META = createCommonMeta($pay_schd_dt10, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta pay_schd_amt10_META = createCommonMeta($pay_schd_amt10, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta pay_mtd_cd10_META = createCommonMeta($pay_mtd_cd10, mcframe.commonMA.meta.MA_META.STTL_CD);
	public static final MCMeta bank_ac_cd_META = createCommonMeta($bank_ac_cd, mcframe.commonMA.meta.MA_META.BANK_AC_CD);
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
	
	protected static final ConstMetaList<MST_BILL_RCPT_R> constMetas = new ConstMetaList<MST_BILL_RCPT_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			bill_rcpt_no_META,
			invalid_flg_META,
			bill_cl_dt_META,
			bill_dt_META,
			bill_no_META,
			pre_bill_no_META,
			pre_bill_dt_META,
			bill_st_dt_META,
			bill_end_dt_META,
			iv_no_META,
			wrk_no_META,
			wrk_nm_META,
			bill_src_cd_META,
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
			pay_schd_dt2_META,
			pay_schd_amt2_META,
			pay_mtd_cd2_META,
			pay_schd_dt3_META,
			pay_schd_amt3_META,
			pay_mtd_cd3_META,
			pay_schd_dt4_META,
			pay_schd_amt4_META,
			pay_mtd_cd4_META,
			pay_schd_dt5_META,
			pay_schd_amt5_META,
			pay_mtd_cd5_META,
			pay_schd_dt6_META,
			pay_schd_amt6_META,
			pay_mtd_cd6_META,
			pay_schd_dt7_META,
			pay_schd_amt7_META,
			pay_mtd_cd7_META,
			pay_schd_dt8_META,
			pay_schd_amt8_META,
			pay_mtd_cd8_META,
			pay_schd_dt9_META,
			pay_schd_amt9_META,
			pay_mtd_cd9_META,
			pay_schd_dt10_META,
			pay_schd_amt10_META,
			pay_mtd_cd10_META,
			bank_ac_cd_META,
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
	protected MST_BILL_RCPT_R(ConstMetaList<? extends MST_BILL_RCPT_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MST_BILL_RCPT_R(ConstMetaList<? extends MST_BILL_RCPT_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MST_BILL_RCPT_R.$bill_rcpt_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RCPT_R.$bill_rcpt_no,
				"bill_rcpt_no",
				bill_rcpt_no,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_RCPT_R.$invalid_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_BILL_RCPT_R.$invalid_flg,
				"invalid_flg",
				invalid_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_RCPT_R.$bill_cl_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_BILL_RCPT_R.$bill_cl_dt,
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
			MST_BILL_RCPT_R.$bill_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_BILL_RCPT_R.$bill_dt,
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
			MST_BILL_RCPT_R.$bill_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RCPT_R.$bill_no,
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
			MST_BILL_RCPT_R.$pre_bill_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RCPT_R.$pre_bill_no,
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
			MST_BILL_RCPT_R.$pre_bill_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_BILL_RCPT_R.$pre_bill_dt,
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
			MST_BILL_RCPT_R.$bill_st_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_BILL_RCPT_R.$bill_st_dt,
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
			MST_BILL_RCPT_R.$bill_end_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_BILL_RCPT_R.$bill_end_dt,
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
			MST_BILL_RCPT_R.$iv_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RCPT_R.$iv_no,
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
			MST_BILL_RCPT_R.$wrk_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RCPT_R.$wrk_no,
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
			MST_BILL_RCPT_R.$wrk_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RCPT_R.$wrk_nm,
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
			MST_BILL_RCPT_R.$bill_src_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RCPT_R.$bill_src_cd,
				"bill_src_cd",
				bill_src_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_BILL_RCPT_R.$bill_src_ein,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RCPT_R.$bill_src_ein,
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
			MST_BILL_RCPT_R.$bill_src_biz_co_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RCPT_R.$bill_src_biz_co_no,
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
			MST_BILL_RCPT_R.$bill_src_zip_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RCPT_R.$bill_src_zip_cd,
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
			MST_BILL_RCPT_R.$bill_src_addr1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RCPT_R.$bill_src_addr1,
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
			MST_BILL_RCPT_R.$bill_src_addr2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RCPT_R.$bill_src_addr2,
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
			MST_BILL_RCPT_R.$bill_src_addr3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RCPT_R.$bill_src_addr3,
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
			MST_BILL_RCPT_R.$bill_src_addr4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RCPT_R.$bill_src_addr4,
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
			MST_BILL_RCPT_R.$bill_src_dpt,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RCPT_R.$bill_src_dpt,
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
			MST_BILL_RCPT_R.$bill_src_tel,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RCPT_R.$bill_src_tel,
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
			MST_BILL_RCPT_R.$trd_cur_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RCPT_R.$trd_cur_cd,
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
			MST_BILL_RCPT_R.$bill_xrate,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BILL_RCPT_R.$bill_xrate,
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
			MST_BILL_RCPT_R.$last_bill_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BILL_RCPT_R.$last_bill_amt,
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
			MST_BILL_RCPT_R.$rcv_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BILL_RCPT_R.$rcv_amt,
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
			MST_BILL_RCPT_R.$sw_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BILL_RCPT_R.$sw_amt,
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
			MST_BILL_RCPT_R.$setoff_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BILL_RCPT_R.$setoff_amt,
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
			MST_BILL_RCPT_R.$bfw_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BILL_RCPT_R.$bfw_amt,
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
			MST_BILL_RCPT_R.$sls_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BILL_RCPT_R.$sls_amt,
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
			MST_BILL_RCPT_R.$dscnt_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BILL_RCPT_R.$dscnt_amt,
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
			MST_BILL_RCPT_R.$ret_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BILL_RCPT_R.$ret_amt,
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
			MST_BILL_RCPT_R.$tax_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BILL_RCPT_R.$tax_amt,
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
			MST_BILL_RCPT_R.$sw_to_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BILL_RCPT_R.$sw_to_amt,
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
			MST_BILL_RCPT_R.$bill_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BILL_RCPT_R.$bill_amt,
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
			MST_BILL_RCPT_R.$tax_rate1,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BILL_RCPT_R.$tax_rate1,
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
			MST_BILL_RCPT_R.$tax_rate_sls_amt1,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BILL_RCPT_R.$tax_rate_sls_amt1,
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
			MST_BILL_RCPT_R.$tax_rate_tax_amt1,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BILL_RCPT_R.$tax_rate_tax_amt1,
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
			MST_BILL_RCPT_R.$tax_rate_base_tax_amt1,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BILL_RCPT_R.$tax_rate_base_tax_amt1,
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
			MST_BILL_RCPT_R.$tax_rate2,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BILL_RCPT_R.$tax_rate2,
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
			MST_BILL_RCPT_R.$tax_rate_sls_amt2,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BILL_RCPT_R.$tax_rate_sls_amt2,
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
			MST_BILL_RCPT_R.$tax_rate_tax_amt2,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BILL_RCPT_R.$tax_rate_tax_amt2,
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
			MST_BILL_RCPT_R.$tax_rate_base_tax_amt2,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BILL_RCPT_R.$tax_rate_base_tax_amt2,
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
			MST_BILL_RCPT_R.$tax_rate3,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BILL_RCPT_R.$tax_rate3,
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
			MST_BILL_RCPT_R.$tax_rate_sls_amt3,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BILL_RCPT_R.$tax_rate_sls_amt3,
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
			MST_BILL_RCPT_R.$tax_rate_tax_amt3,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BILL_RCPT_R.$tax_rate_tax_amt3,
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
			MST_BILL_RCPT_R.$tax_rate_base_tax_amt3,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BILL_RCPT_R.$tax_rate_base_tax_amt3,
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
			MST_BILL_RCPT_R.$tax_rate4,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BILL_RCPT_R.$tax_rate4,
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
			MST_BILL_RCPT_R.$tax_rate_sls_amt4,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BILL_RCPT_R.$tax_rate_sls_amt4,
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
			MST_BILL_RCPT_R.$tax_rate_tax_amt4,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BILL_RCPT_R.$tax_rate_tax_amt4,
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
			MST_BILL_RCPT_R.$tax_rate_base_tax_amt4,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BILL_RCPT_R.$tax_rate_base_tax_amt4,
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
			MST_BILL_RCPT_R.$tax_rate5,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BILL_RCPT_R.$tax_rate5,
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
			MST_BILL_RCPT_R.$tax_rate_sls_amt5,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BILL_RCPT_R.$tax_rate_sls_amt5,
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
			MST_BILL_RCPT_R.$tax_rate_tax_amt5,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BILL_RCPT_R.$tax_rate_tax_amt5,
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
			MST_BILL_RCPT_R.$tax_rate_base_tax_amt5,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BILL_RCPT_R.$tax_rate_base_tax_amt5,
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
			MST_BILL_RCPT_R.$tax_rate6,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BILL_RCPT_R.$tax_rate6,
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
			MST_BILL_RCPT_R.$tax_rate_sls_amt6,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BILL_RCPT_R.$tax_rate_sls_amt6,
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
			MST_BILL_RCPT_R.$tax_rate_tax_amt6,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BILL_RCPT_R.$tax_rate_tax_amt6,
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
			MST_BILL_RCPT_R.$tax_rate_base_tax_amt6,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BILL_RCPT_R.$tax_rate_base_tax_amt6,
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
			MST_BILL_RCPT_R.$tax_rate7,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BILL_RCPT_R.$tax_rate7,
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
			MST_BILL_RCPT_R.$tax_rate_sls_amt7,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BILL_RCPT_R.$tax_rate_sls_amt7,
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
			MST_BILL_RCPT_R.$tax_rate_tax_amt7,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BILL_RCPT_R.$tax_rate_tax_amt7,
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
			MST_BILL_RCPT_R.$tax_rate_base_tax_amt7,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BILL_RCPT_R.$tax_rate_base_tax_amt7,
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
			MST_BILL_RCPT_R.$tax_rate8,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BILL_RCPT_R.$tax_rate8,
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
			MST_BILL_RCPT_R.$tax_rate_sls_amt8,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BILL_RCPT_R.$tax_rate_sls_amt8,
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
			MST_BILL_RCPT_R.$tax_rate_tax_amt8,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BILL_RCPT_R.$tax_rate_tax_amt8,
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
			MST_BILL_RCPT_R.$tax_rate_base_tax_amt8,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BILL_RCPT_R.$tax_rate_base_tax_amt8,
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
			MST_BILL_RCPT_R.$tax_rate9,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BILL_RCPT_R.$tax_rate9,
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
			MST_BILL_RCPT_R.$tax_rate_sls_amt9,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BILL_RCPT_R.$tax_rate_sls_amt9,
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
			MST_BILL_RCPT_R.$tax_rate_tax_amt9,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BILL_RCPT_R.$tax_rate_tax_amt9,
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
			MST_BILL_RCPT_R.$tax_rate_base_tax_amt9,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BILL_RCPT_R.$tax_rate_base_tax_amt9,
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
			MST_BILL_RCPT_R.$tax_rate10,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BILL_RCPT_R.$tax_rate10,
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
			MST_BILL_RCPT_R.$tax_rate_sls_amt10,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BILL_RCPT_R.$tax_rate_sls_amt10,
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
			MST_BILL_RCPT_R.$tax_rate_tax_amt10,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BILL_RCPT_R.$tax_rate_tax_amt10,
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
			MST_BILL_RCPT_R.$tax_rate_base_tax_amt10,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BILL_RCPT_R.$tax_rate_base_tax_amt10,
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
			MST_BILL_RCPT_R.$adv_amt_bal,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BILL_RCPT_R.$adv_amt_bal,
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
			MST_BILL_RCPT_R.$adv_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BILL_RCPT_R.$adv_amt,
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
			MST_BILL_RCPT_R.$adv_setoff_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BILL_RCPT_R.$adv_setoff_amt,
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
			MST_BILL_RCPT_R.$adv_setoff_tax_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BILL_RCPT_R.$adv_setoff_tax_amt,
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
			MST_BILL_RCPT_R.$pay_schd_dt1,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_BILL_RCPT_R.$pay_schd_dt1,
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
			MST_BILL_RCPT_R.$pay_schd_amt1,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BILL_RCPT_R.$pay_schd_amt1,
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
			MST_BILL_RCPT_R.$pay_mtd_cd1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RCPT_R.$pay_mtd_cd1,
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
			MST_BILL_RCPT_R.$pay_schd_dt2,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_BILL_RCPT_R.$pay_schd_dt2,
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
			MST_BILL_RCPT_R.$pay_schd_amt2,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BILL_RCPT_R.$pay_schd_amt2,
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
			MST_BILL_RCPT_R.$pay_mtd_cd2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RCPT_R.$pay_mtd_cd2,
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
			MST_BILL_RCPT_R.$pay_schd_dt3,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_BILL_RCPT_R.$pay_schd_dt3,
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
			MST_BILL_RCPT_R.$pay_schd_amt3,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BILL_RCPT_R.$pay_schd_amt3,
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
			MST_BILL_RCPT_R.$pay_mtd_cd3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RCPT_R.$pay_mtd_cd3,
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
			MST_BILL_RCPT_R.$pay_schd_dt4,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_BILL_RCPT_R.$pay_schd_dt4,
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
			MST_BILL_RCPT_R.$pay_schd_amt4,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BILL_RCPT_R.$pay_schd_amt4,
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
			MST_BILL_RCPT_R.$pay_mtd_cd4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RCPT_R.$pay_mtd_cd4,
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
			MST_BILL_RCPT_R.$pay_schd_dt5,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_BILL_RCPT_R.$pay_schd_dt5,
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
			MST_BILL_RCPT_R.$pay_schd_amt5,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BILL_RCPT_R.$pay_schd_amt5,
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
			MST_BILL_RCPT_R.$pay_mtd_cd5,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RCPT_R.$pay_mtd_cd5,
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
			MST_BILL_RCPT_R.$pay_schd_dt6,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_BILL_RCPT_R.$pay_schd_dt6,
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
			MST_BILL_RCPT_R.$pay_schd_amt6,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BILL_RCPT_R.$pay_schd_amt6,
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
			MST_BILL_RCPT_R.$pay_mtd_cd6,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RCPT_R.$pay_mtd_cd6,
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
			MST_BILL_RCPT_R.$pay_schd_dt7,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_BILL_RCPT_R.$pay_schd_dt7,
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
			MST_BILL_RCPT_R.$pay_schd_amt7,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BILL_RCPT_R.$pay_schd_amt7,
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
			MST_BILL_RCPT_R.$pay_mtd_cd7,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RCPT_R.$pay_mtd_cd7,
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
			MST_BILL_RCPT_R.$pay_schd_dt8,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_BILL_RCPT_R.$pay_schd_dt8,
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
			MST_BILL_RCPT_R.$pay_schd_amt8,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BILL_RCPT_R.$pay_schd_amt8,
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
			MST_BILL_RCPT_R.$pay_mtd_cd8,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RCPT_R.$pay_mtd_cd8,
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
			MST_BILL_RCPT_R.$pay_schd_dt9,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_BILL_RCPT_R.$pay_schd_dt9,
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
			MST_BILL_RCPT_R.$pay_schd_amt9,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BILL_RCPT_R.$pay_schd_amt9,
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
			MST_BILL_RCPT_R.$pay_mtd_cd9,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RCPT_R.$pay_mtd_cd9,
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
			MST_BILL_RCPT_R.$pay_schd_dt10,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_BILL_RCPT_R.$pay_schd_dt10,
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
			MST_BILL_RCPT_R.$pay_schd_amt10,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BILL_RCPT_R.$pay_schd_amt10,
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
			MST_BILL_RCPT_R.$pay_mtd_cd10,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RCPT_R.$pay_mtd_cd10,
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
			MST_BILL_RCPT_R.$bank_ac_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RCPT_R.$bank_ac_cd,
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
			MST_BILL_RCPT_R.$bill_bcst_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RCPT_R.$bill_bcst_nm,
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
			MST_BILL_RCPT_R.$bill_ein,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RCPT_R.$bill_ein,
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
			MST_BILL_RCPT_R.$bill_biz_co_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RCPT_R.$bill_biz_co_no,
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
			MST_BILL_RCPT_R.$bill_zip_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RCPT_R.$bill_zip_cd,
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
			MST_BILL_RCPT_R.$bill_addr1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RCPT_R.$bill_addr1,
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
			MST_BILL_RCPT_R.$bill_addr2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RCPT_R.$bill_addr2,
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
			MST_BILL_RCPT_R.$bill_addr3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RCPT_R.$bill_addr3,
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
			MST_BILL_RCPT_R.$bill_addr4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RCPT_R.$bill_addr4,
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
			MST_BILL_RCPT_R.$bill_bcst_dpt,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RCPT_R.$bill_bcst_dpt,
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
			MST_BILL_RCPT_R.$bill_tel,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RCPT_R.$bill_tel,
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
			MST_BILL_RCPT_R.$ins_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RCPT_R.$ins_usr_id,
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
			MST_BILL_RCPT_R.$ins_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RCPT_R.$ins_usr_nm,
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
			MST_BILL_RCPT_R.$ins_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MST_BILL_RCPT_R.$ins_ts,
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
			MST_BILL_RCPT_R.$ins_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RCPT_R.$ins_func_id,
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
			MST_BILL_RCPT_R.$upd_cntr,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_BILL_RCPT_R.$upd_cntr,
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
			MST_BILL_RCPT_R.$upd_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RCPT_R.$upd_usr_id,
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
			MST_BILL_RCPT_R.$upd_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RCPT_R.$upd_usr_nm,
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
			MST_BILL_RCPT_R.$upd_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MST_BILL_RCPT_R.$upd_ts,
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
			MST_BILL_RCPT_R.$upd_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RCPT_R.$upd_func_id,
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
			MST_BILL_RCPT_R.$upd_srv_req_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_BILL_RCPT_R.$upd_srv_req_no,
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
	public static MST_BILL_RCPT_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MST_BILL_RCPT_R create(String alias) {
		MST_BILL_RCPT_R row = new MST_BILL_RCPT_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MST_BILL_RCPT_R createByName(T proto) {
		MST_BILL_RCPT_R row = MST_BILL_RCPT_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MST_BILL_RCPT_R clone() {
		return (MST_BILL_RCPT_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MST_BILL_RCPT_R createInstance() {
		return (MST_BILL_RCPT_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MST_BILL_RCPT_R getValues(String... names) {
		return (MST_BILL_RCPT_R) super.getValues(names);
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
	 public MSW_BILL_RCPT_KEY_R getPkWorkDbc(String alias) {
	 	return MSW_BILL_RCPT_KEY_R.create(alias);
	 }

	/*
	 * MCDBContainerのオーバーライドメソッドです。
	 */
	 public MSW_BILL_RCPT_KEY_R getPkWorkDbc() {
	 	return getPkWorkDbc(MSW_BILL_RCPT_KEY_R.TABLE_NAME);
	 }

	/**
	 * 請求受領ＮＯ. Billing receipt No..<p>
	 *
	 */
	public String bill_rcpt_no() {
		return getConstString(offset + 0, $bill_rcpt_no);
	}

	/**
	 * 請求受領ＮＯ. Billing receipt No..<p>
	 *
	 */
	public void bill_rcpt_no(String value) {
		setConstString(offset + 0, $bill_rcpt_no, value);
	}

	/**
	 * 無効ＦＬＧ. Invalid flg..<p>
	 *
	 */
	public boolean invalid_flg() {
		return getConstBoolean(offset + 1, $invalid_flg);
	}

	/**
	 * 無効ＦＬＧ. Invalid flg..<p>
	 *
	 */
	public void invalid_flg(boolean value) {
		setConstBoolean(offset + 1, $invalid_flg, value);
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
	 * 請求日. Billing date.<p>
	 *
	 */
	public MCDate bill_dt() {
		return getConstDate(offset + 3, $bill_dt);
	}

	/**
	 * 請求日. Billing date.<p>
	 *
	 */
	public void bill_dt(MCDate value) {
		setConstDate(offset + 3, $bill_dt, value);
	}

	/**
	 * 請求書ＮＯ. Invoice No..<p>
	 *
	 */
	public String bill_no() {
		return getConstString(offset + 4, $bill_no);
	}

	/**
	 * 請求書ＮＯ. Invoice No..<p>
	 *
	 */
	public void bill_no(String value) {
		setConstString(offset + 4, $bill_no, value);
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
	 * 先行請求日. Advance billing date.<p>
	 *
	 */
	public MCDate pre_bill_dt() {
		return getConstDate(offset + 6, $pre_bill_dt);
	}

	/**
	 * 先行請求日. Advance billing date.<p>
	 *
	 */
	public void pre_bill_dt(MCDate value) {
		setConstDate(offset + 6, $pre_bill_dt, value);
	}

	/**
	 * 請求期間開始日. Billing period start date.<p>
	 *
	 */
	public MCDate bill_st_dt() {
		return getConstDate(offset + 7, $bill_st_dt);
	}

	/**
	 * 請求期間開始日. Billing period start date.<p>
	 *
	 */
	public void bill_st_dt(MCDate value) {
		setConstDate(offset + 7, $bill_st_dt, value);
	}

	/**
	 * 請求期間終了日. Billing period end date.<p>
	 *
	 */
	public MCDate bill_end_dt() {
		return getConstDate(offset + 8, $bill_end_dt);
	}

	/**
	 * 請求期間終了日. Billing period end date.<p>
	 *
	 */
	public void bill_end_dt(MCDate value) {
		setConstDate(offset + 8, $bill_end_dt, value);
	}

	/**
	 * インボイスＮＯ. Invoice No..<p>
	 *
	 */
	public String iv_no() {
		return getConstString(offset + 9, $iv_no);
	}

	/**
	 * インボイスＮＯ. Invoice No..<p>
	 *
	 */
	public void iv_no(String value) {
		setConstString(offset + 9, $iv_no, value);
	}

	/**
	 * 案件ＮＯ. Sales project No..<p>
	 *
	 */
	public String wrk_no() {
		return getConstString(offset + 10, $wrk_no);
	}

	/**
	 * 案件ＮＯ. Sales project No..<p>
	 *
	 */
	public void wrk_no(String value) {
		setConstString(offset + 10, $wrk_no, value);
	}

	/**
	 * 案件名. Sales project name.<p>
	 *
	 */
	public String wrk_nm() {
		return getConstString(offset + 11, $wrk_nm);
	}

	/**
	 * 案件名. Sales project name.<p>
	 *
	 */
	public void wrk_nm(String value) {
		setConstString(offset + 11, $wrk_nm, value);
	}

	/**
	 * 請求元ＣＤ. Billing source cd..<p>
	 *
	 */
	public String bill_src_cd() {
		return getConstString(offset + 12, $bill_src_cd);
	}

	/**
	 * 請求元ＣＤ. Billing source cd..<p>
	 *
	 */
	public void bill_src_cd(String value) {
		setConstString(offset + 12, $bill_src_cd, value);
	}

	/**
	 * 請求元法人番号. Billing source corporation No..<p>
	 *
	 */
	public String bill_src_ein() {
		return getConstString(offset + 13, $bill_src_ein);
	}

	/**
	 * 請求元法人番号. Billing source corporation No..<p>
	 *
	 */
	public void bill_src_ein(String value) {
		setConstString(offset + 13, $bill_src_ein, value);
	}

	/**
	 * 請求元事業者ＮＯ. Billing source business No..<p>
	 *
	 */
	public String bill_src_biz_co_no() {
		return getConstString(offset + 14, $bill_src_biz_co_no);
	}

	/**
	 * 請求元事業者ＮＯ. Billing source business No..<p>
	 *
	 */
	public void bill_src_biz_co_no(String value) {
		setConstString(offset + 14, $bill_src_biz_co_no, value);
	}

	/**
	 * 請求元郵便番号. Billing source zip code.<p>
	 *
	 */
	public String bill_src_zip_cd() {
		return getConstString(offset + 15, $bill_src_zip_cd);
	}

	/**
	 * 請求元郵便番号. Billing source zip code.<p>
	 *
	 */
	public void bill_src_zip_cd(String value) {
		setConstString(offset + 15, $bill_src_zip_cd, value);
	}

	/**
	 * 請求元住所１. Billing source address 1.<p>
	 *
	 */
	public String bill_src_addr1() {
		return getConstString(offset + 16, $bill_src_addr1);
	}

	/**
	 * 請求元住所１. Billing source address 1.<p>
	 *
	 */
	public void bill_src_addr1(String value) {
		setConstString(offset + 16, $bill_src_addr1, value);
	}

	/**
	 * 請求元住所２. Billing source address 2.<p>
	 *
	 */
	public String bill_src_addr2() {
		return getConstString(offset + 17, $bill_src_addr2);
	}

	/**
	 * 請求元住所２. Billing source address 2.<p>
	 *
	 */
	public void bill_src_addr2(String value) {
		setConstString(offset + 17, $bill_src_addr2, value);
	}

	/**
	 * 請求元住所３. Billing source address 3.<p>
	 *
	 */
	public String bill_src_addr3() {
		return getConstString(offset + 18, $bill_src_addr3);
	}

	/**
	 * 請求元住所３. Billing source address 3.<p>
	 *
	 */
	public void bill_src_addr3(String value) {
		setConstString(offset + 18, $bill_src_addr3, value);
	}

	/**
	 * 請求元住所４. Billing source address 4.<p>
	 *
	 */
	public String bill_src_addr4() {
		return getConstString(offset + 19, $bill_src_addr4);
	}

	/**
	 * 請求元住所４. Billing source address 4.<p>
	 *
	 */
	public void bill_src_addr4(String value) {
		setConstString(offset + 19, $bill_src_addr4, value);
	}

	/**
	 * 請求元部門. Billing source dept..<p>
	 *
	 */
	public String bill_src_dpt() {
		return getConstString(offset + 20, $bill_src_dpt);
	}

	/**
	 * 請求元部門. Billing source dept..<p>
	 *
	 */
	public void bill_src_dpt(String value) {
		setConstString(offset + 20, $bill_src_dpt, value);
	}

	/**
	 * 請求元ＴＥＬ. Billing source TEL.<p>
	 *
	 */
	public String bill_src_tel() {
		return getConstString(offset + 21, $bill_src_tel);
	}

	/**
	 * 請求元ＴＥＬ. Billing source TEL.<p>
	 *
	 */
	public void bill_src_tel(String value) {
		setConstString(offset + 21, $bill_src_tel, value);
	}

	/**
	 * 取引通貨ＣＤ. Transaction currency cd..<p>
	 *
	 */
	public String trd_cur_cd() {
		return getConstString(offset + 22, $trd_cur_cd);
	}

	/**
	 * 取引通貨ＣＤ. Transaction currency cd..<p>
	 *
	 */
	public void trd_cur_cd(String value) {
		setConstString(offset + 22, $trd_cur_cd, value);
	}

	/**
	 * 請求為替レート. Billing exchange rate.<p>
	 *
	 */
	public MCNumber bill_xrate() {
		return getConstNumber(offset + 23, $bill_xrate);
	}

	/**
	 * 請求為替レート. Billing exchange rate.<p>
	 *
	 */
	public void bill_xrate(MCNumber value) {
		setConstNumber(offset + 23, $bill_xrate, value);
	}
	
	/**
	 * 請求為替レート. Billing exchange rate.<p>
	 *
	 */
	public void bill_xrate(int value) {
		setConstNumber(offset + 23, $bill_xrate, value);
	}
	
	/**
	 * 請求為替レート. Billing exchange rate.<p>
	 *
	 */
	public void bill_xrate(long value) {
		setConstNumber(offset + 23, $bill_xrate, value);
	}
	
	/**
	 * 請求為替レート. Billing exchange rate.<p>
	 *
	 */
	public void bill_xrate(float value) {
		setConstNumber(offset + 23, $bill_xrate, value);
	}
	
	/**
	 * 請求為替レート. Billing exchange rate.<p>
	 *
	 */
	public void bill_xrate(double value) {
		setConstNumber(offset + 23, $bill_xrate, value);
	}
	
	/**
	 * 前回請求額. Last billing amount.<p>
	 *
	 */
	public MCNumber last_bill_amt() {
		return getConstNumber(offset + 24, $last_bill_amt);
	}

	/**
	 * 前回請求額. Last billing amount.<p>
	 *
	 */
	public void last_bill_amt(MCNumber value) {
		setConstNumber(offset + 24, $last_bill_amt, value);
	}
	
	/**
	 * 前回請求額. Last billing amount.<p>
	 *
	 */
	public void last_bill_amt(int value) {
		setConstNumber(offset + 24, $last_bill_amt, value);
	}
	
	/**
	 * 前回請求額. Last billing amount.<p>
	 *
	 */
	public void last_bill_amt(long value) {
		setConstNumber(offset + 24, $last_bill_amt, value);
	}
	
	/**
	 * 前回請求額. Last billing amount.<p>
	 *
	 */
	public void last_bill_amt(float value) {
		setConstNumber(offset + 24, $last_bill_amt, value);
	}
	
	/**
	 * 前回請求額. Last billing amount.<p>
	 *
	 */
	public void last_bill_amt(double value) {
		setConstNumber(offset + 24, $last_bill_amt, value);
	}
	
	/**
	 * 支払額. Payment amount.<p>
	 *
	 */
	public MCNumber rcv_amt() {
		return getConstNumber(offset + 25, $rcv_amt);
	}

	/**
	 * 支払額. Payment amount.<p>
	 *
	 */
	public void rcv_amt(MCNumber value) {
		setConstNumber(offset + 25, $rcv_amt, value);
	}
	
	/**
	 * 支払額. Payment amount.<p>
	 *
	 */
	public void rcv_amt(int value) {
		setConstNumber(offset + 25, $rcv_amt, value);
	}
	
	/**
	 * 支払額. Payment amount.<p>
	 *
	 */
	public void rcv_amt(long value) {
		setConstNumber(offset + 25, $rcv_amt, value);
	}
	
	/**
	 * 支払額. Payment amount.<p>
	 *
	 */
	public void rcv_amt(float value) {
		setConstNumber(offset + 25, $rcv_amt, value);
	}
	
	/**
	 * 支払額. Payment amount.<p>
	 *
	 */
	public void rcv_amt(double value) {
		setConstNumber(offset + 25, $rcv_amt, value);
	}
	
	/**
	 * 振替額. Transfer amount.<p>
	 *
	 */
	public MCNumber sw_amt() {
		return getConstNumber(offset + 26, $sw_amt);
	}

	/**
	 * 振替額. Transfer amount.<p>
	 *
	 */
	public void sw_amt(MCNumber value) {
		setConstNumber(offset + 26, $sw_amt, value);
	}
	
	/**
	 * 振替額. Transfer amount.<p>
	 *
	 */
	public void sw_amt(int value) {
		setConstNumber(offset + 26, $sw_amt, value);
	}
	
	/**
	 * 振替額. Transfer amount.<p>
	 *
	 */
	public void sw_amt(long value) {
		setConstNumber(offset + 26, $sw_amt, value);
	}
	
	/**
	 * 振替額. Transfer amount.<p>
	 *
	 */
	public void sw_amt(float value) {
		setConstNumber(offset + 26, $sw_amt, value);
	}
	
	/**
	 * 振替額. Transfer amount.<p>
	 *
	 */
	public void sw_amt(double value) {
		setConstNumber(offset + 26, $sw_amt, value);
	}
	
	/**
	 * 相殺額. Offset amount.<p>
	 *
	 */
	public MCNumber setoff_amt() {
		return getConstNumber(offset + 27, $setoff_amt);
	}

	/**
	 * 相殺額. Offset amount.<p>
	 *
	 */
	public void setoff_amt(MCNumber value) {
		setConstNumber(offset + 27, $setoff_amt, value);
	}
	
	/**
	 * 相殺額. Offset amount.<p>
	 *
	 */
	public void setoff_amt(int value) {
		setConstNumber(offset + 27, $setoff_amt, value);
	}
	
	/**
	 * 相殺額. Offset amount.<p>
	 *
	 */
	public void setoff_amt(long value) {
		setConstNumber(offset + 27, $setoff_amt, value);
	}
	
	/**
	 * 相殺額. Offset amount.<p>
	 *
	 */
	public void setoff_amt(float value) {
		setConstNumber(offset + 27, $setoff_amt, value);
	}
	
	/**
	 * 相殺額. Offset amount.<p>
	 *
	 */
	public void setoff_amt(double value) {
		setConstNumber(offset + 27, $setoff_amt, value);
	}
	
	/**
	 * 差引繰越額. Variance carry-over amount.<p>
	 *
	 */
	public MCNumber bfw_amt() {
		return getConstNumber(offset + 28, $bfw_amt);
	}

	/**
	 * 差引繰越額. Variance carry-over amount.<p>
	 *
	 */
	public void bfw_amt(MCNumber value) {
		setConstNumber(offset + 28, $bfw_amt, value);
	}
	
	/**
	 * 差引繰越額. Variance carry-over amount.<p>
	 *
	 */
	public void bfw_amt(int value) {
		setConstNumber(offset + 28, $bfw_amt, value);
	}
	
	/**
	 * 差引繰越額. Variance carry-over amount.<p>
	 *
	 */
	public void bfw_amt(long value) {
		setConstNumber(offset + 28, $bfw_amt, value);
	}
	
	/**
	 * 差引繰越額. Variance carry-over amount.<p>
	 *
	 */
	public void bfw_amt(float value) {
		setConstNumber(offset + 28, $bfw_amt, value);
	}
	
	/**
	 * 差引繰越額. Variance carry-over amount.<p>
	 *
	 */
	public void bfw_amt(double value) {
		setConstNumber(offset + 28, $bfw_amt, value);
	}
	
	/**
	 * 今回買上額. Current payment amount.<p>
	 *
	 */
	public MCNumber sls_amt() {
		return getConstNumber(offset + 29, $sls_amt);
	}

	/**
	 * 今回買上額. Current payment amount.<p>
	 *
	 */
	public void sls_amt(MCNumber value) {
		setConstNumber(offset + 29, $sls_amt, value);
	}
	
	/**
	 * 今回買上額. Current payment amount.<p>
	 *
	 */
	public void sls_amt(int value) {
		setConstNumber(offset + 29, $sls_amt, value);
	}
	
	/**
	 * 今回買上額. Current payment amount.<p>
	 *
	 */
	public void sls_amt(long value) {
		setConstNumber(offset + 29, $sls_amt, value);
	}
	
	/**
	 * 今回買上額. Current payment amount.<p>
	 *
	 */
	public void sls_amt(float value) {
		setConstNumber(offset + 29, $sls_amt, value);
	}
	
	/**
	 * 今回買上額. Current payment amount.<p>
	 *
	 */
	public void sls_amt(double value) {
		setConstNumber(offset + 29, $sls_amt, value);
	}
	
	/**
	 * 今回値引額. Current discount amount.<p>
	 *
	 */
	public MCNumber dscnt_amt() {
		return getConstNumber(offset + 30, $dscnt_amt);
	}

	/**
	 * 今回値引額. Current discount amount.<p>
	 *
	 */
	public void dscnt_amt(MCNumber value) {
		setConstNumber(offset + 30, $dscnt_amt, value);
	}
	
	/**
	 * 今回値引額. Current discount amount.<p>
	 *
	 */
	public void dscnt_amt(int value) {
		setConstNumber(offset + 30, $dscnt_amt, value);
	}
	
	/**
	 * 今回値引額. Current discount amount.<p>
	 *
	 */
	public void dscnt_amt(long value) {
		setConstNumber(offset + 30, $dscnt_amt, value);
	}
	
	/**
	 * 今回値引額. Current discount amount.<p>
	 *
	 */
	public void dscnt_amt(float value) {
		setConstNumber(offset + 30, $dscnt_amt, value);
	}
	
	/**
	 * 今回値引額. Current discount amount.<p>
	 *
	 */
	public void dscnt_amt(double value) {
		setConstNumber(offset + 30, $dscnt_amt, value);
	}
	
	/**
	 * 今回返品額. Current return amount.<p>
	 *
	 */
	public MCNumber ret_amt() {
		return getConstNumber(offset + 31, $ret_amt);
	}

	/**
	 * 今回返品額. Current return amount.<p>
	 *
	 */
	public void ret_amt(MCNumber value) {
		setConstNumber(offset + 31, $ret_amt, value);
	}
	
	/**
	 * 今回返品額. Current return amount.<p>
	 *
	 */
	public void ret_amt(int value) {
		setConstNumber(offset + 31, $ret_amt, value);
	}
	
	/**
	 * 今回返品額. Current return amount.<p>
	 *
	 */
	public void ret_amt(long value) {
		setConstNumber(offset + 31, $ret_amt, value);
	}
	
	/**
	 * 今回返品額. Current return amount.<p>
	 *
	 */
	public void ret_amt(float value) {
		setConstNumber(offset + 31, $ret_amt, value);
	}
	
	/**
	 * 今回返品額. Current return amount.<p>
	 *
	 */
	public void ret_amt(double value) {
		setConstNumber(offset + 31, $ret_amt, value);
	}
	
	/**
	 * 今回税額. Current tax amount.<p>
	 *
	 */
	public MCNumber tax_amt() {
		return getConstNumber(offset + 32, $tax_amt);
	}

	/**
	 * 今回税額. Current tax amount.<p>
	 *
	 */
	public void tax_amt(MCNumber value) {
		setConstNumber(offset + 32, $tax_amt, value);
	}
	
	/**
	 * 今回税額. Current tax amount.<p>
	 *
	 */
	public void tax_amt(int value) {
		setConstNumber(offset + 32, $tax_amt, value);
	}
	
	/**
	 * 今回税額. Current tax amount.<p>
	 *
	 */
	public void tax_amt(long value) {
		setConstNumber(offset + 32, $tax_amt, value);
	}
	
	/**
	 * 今回税額. Current tax amount.<p>
	 *
	 */
	public void tax_amt(float value) {
		setConstNumber(offset + 32, $tax_amt, value);
	}
	
	/**
	 * 今回税額. Current tax amount.<p>
	 *
	 */
	public void tax_amt(double value) {
		setConstNumber(offset + 32, $tax_amt, value);
	}
	
	/**
	 * 今回振替額. Current transfer amount.<p>
	 *
	 */
	public MCNumber sw_to_amt() {
		return getConstNumber(offset + 33, $sw_to_amt);
	}

	/**
	 * 今回振替額. Current transfer amount.<p>
	 *
	 */
	public void sw_to_amt(MCNumber value) {
		setConstNumber(offset + 33, $sw_to_amt, value);
	}
	
	/**
	 * 今回振替額. Current transfer amount.<p>
	 *
	 */
	public void sw_to_amt(int value) {
		setConstNumber(offset + 33, $sw_to_amt, value);
	}
	
	/**
	 * 今回振替額. Current transfer amount.<p>
	 *
	 */
	public void sw_to_amt(long value) {
		setConstNumber(offset + 33, $sw_to_amt, value);
	}
	
	/**
	 * 今回振替額. Current transfer amount.<p>
	 *
	 */
	public void sw_to_amt(float value) {
		setConstNumber(offset + 33, $sw_to_amt, value);
	}
	
	/**
	 * 今回振替額. Current transfer amount.<p>
	 *
	 */
	public void sw_to_amt(double value) {
		setConstNumber(offset + 33, $sw_to_amt, value);
	}
	
	/**
	 * 今回請求額. Current billing amount.<p>
	 *
	 */
	public MCNumber bill_amt() {
		return getConstNumber(offset + 34, $bill_amt);
	}

	/**
	 * 今回請求額. Current billing amount.<p>
	 *
	 */
	public void bill_amt(MCNumber value) {
		setConstNumber(offset + 34, $bill_amt, value);
	}
	
	/**
	 * 今回請求額. Current billing amount.<p>
	 *
	 */
	public void bill_amt(int value) {
		setConstNumber(offset + 34, $bill_amt, value);
	}
	
	/**
	 * 今回請求額. Current billing amount.<p>
	 *
	 */
	public void bill_amt(long value) {
		setConstNumber(offset + 34, $bill_amt, value);
	}
	
	/**
	 * 今回請求額. Current billing amount.<p>
	 *
	 */
	public void bill_amt(float value) {
		setConstNumber(offset + 34, $bill_amt, value);
	}
	
	/**
	 * 今回請求額. Current billing amount.<p>
	 *
	 */
	public void bill_amt(double value) {
		setConstNumber(offset + 34, $bill_amt, value);
	}
	
	/**
	 * 税率１. Tax rate 1.<p>
	 *
	 */
	public MCNumber tax_rate1() {
		return getConstNumber(offset + 35, $tax_rate1);
	}

	/**
	 * 税率１. Tax rate 1.<p>
	 *
	 */
	public void tax_rate1(MCNumber value) {
		setConstNumber(offset + 35, $tax_rate1, value);
	}
	
	/**
	 * 税率１. Tax rate 1.<p>
	 *
	 */
	public void tax_rate1(int value) {
		setConstNumber(offset + 35, $tax_rate1, value);
	}
	
	/**
	 * 税率１. Tax rate 1.<p>
	 *
	 */
	public void tax_rate1(long value) {
		setConstNumber(offset + 35, $tax_rate1, value);
	}
	
	/**
	 * 税率１. Tax rate 1.<p>
	 *
	 */
	public void tax_rate1(float value) {
		setConstNumber(offset + 35, $tax_rate1, value);
	}
	
	/**
	 * 税率１. Tax rate 1.<p>
	 *
	 */
	public void tax_rate1(double value) {
		setConstNumber(offset + 35, $tax_rate1, value);
	}
	
	/**
	 * 税率毎買上額１. Purchase amount 1 per tax rate.<p>
	 *
	 */
	public MCNumber tax_rate_sls_amt1() {
		return getConstNumber(offset + 36, $tax_rate_sls_amt1);
	}

	/**
	 * 税率毎買上額１. Purchase amount 1 per tax rate.<p>
	 *
	 */
	public void tax_rate_sls_amt1(MCNumber value) {
		setConstNumber(offset + 36, $tax_rate_sls_amt1, value);
	}
	
	/**
	 * 税率毎買上額１. Purchase amount 1 per tax rate.<p>
	 *
	 */
	public void tax_rate_sls_amt1(int value) {
		setConstNumber(offset + 36, $tax_rate_sls_amt1, value);
	}
	
	/**
	 * 税率毎買上額１. Purchase amount 1 per tax rate.<p>
	 *
	 */
	public void tax_rate_sls_amt1(long value) {
		setConstNumber(offset + 36, $tax_rate_sls_amt1, value);
	}
	
	/**
	 * 税率毎買上額１. Purchase amount 1 per tax rate.<p>
	 *
	 */
	public void tax_rate_sls_amt1(float value) {
		setConstNumber(offset + 36, $tax_rate_sls_amt1, value);
	}
	
	/**
	 * 税率毎買上額１. Purchase amount 1 per tax rate.<p>
	 *
	 */
	public void tax_rate_sls_amt1(double value) {
		setConstNumber(offset + 36, $tax_rate_sls_amt1, value);
	}
	
	/**
	 * 税率毎税額１. Tax amount per tax rate 1.<p>
	 *
	 */
	public MCNumber tax_rate_tax_amt1() {
		return getConstNumber(offset + 37, $tax_rate_tax_amt1);
	}

	/**
	 * 税率毎税額１. Tax amount per tax rate 1.<p>
	 *
	 */
	public void tax_rate_tax_amt1(MCNumber value) {
		setConstNumber(offset + 37, $tax_rate_tax_amt1, value);
	}
	
	/**
	 * 税率毎税額１. Tax amount per tax rate 1.<p>
	 *
	 */
	public void tax_rate_tax_amt1(int value) {
		setConstNumber(offset + 37, $tax_rate_tax_amt1, value);
	}
	
	/**
	 * 税率毎税額１. Tax amount per tax rate 1.<p>
	 *
	 */
	public void tax_rate_tax_amt1(long value) {
		setConstNumber(offset + 37, $tax_rate_tax_amt1, value);
	}
	
	/**
	 * 税率毎税額１. Tax amount per tax rate 1.<p>
	 *
	 */
	public void tax_rate_tax_amt1(float value) {
		setConstNumber(offset + 37, $tax_rate_tax_amt1, value);
	}
	
	/**
	 * 税率毎税額１. Tax amount per tax rate 1.<p>
	 *
	 */
	public void tax_rate_tax_amt1(double value) {
		setConstNumber(offset + 37, $tax_rate_tax_amt1, value);
	}
	
	/**
	 * 税率毎基準通貨税額１. Tax amount (Base currency) per tax rate 1.<p>
	 *
	 */
	public MCNumber tax_rate_base_tax_amt1() {
		return getConstNumber(offset + 38, $tax_rate_base_tax_amt1);
	}

	/**
	 * 税率毎基準通貨税額１. Tax amount (Base currency) per tax rate 1.<p>
	 *
	 */
	public void tax_rate_base_tax_amt1(MCNumber value) {
		setConstNumber(offset + 38, $tax_rate_base_tax_amt1, value);
	}
	
	/**
	 * 税率毎基準通貨税額１. Tax amount (Base currency) per tax rate 1.<p>
	 *
	 */
	public void tax_rate_base_tax_amt1(int value) {
		setConstNumber(offset + 38, $tax_rate_base_tax_amt1, value);
	}
	
	/**
	 * 税率毎基準通貨税額１. Tax amount (Base currency) per tax rate 1.<p>
	 *
	 */
	public void tax_rate_base_tax_amt1(long value) {
		setConstNumber(offset + 38, $tax_rate_base_tax_amt1, value);
	}
	
	/**
	 * 税率毎基準通貨税額１. Tax amount (Base currency) per tax rate 1.<p>
	 *
	 */
	public void tax_rate_base_tax_amt1(float value) {
		setConstNumber(offset + 38, $tax_rate_base_tax_amt1, value);
	}
	
	/**
	 * 税率毎基準通貨税額１. Tax amount (Base currency) per tax rate 1.<p>
	 *
	 */
	public void tax_rate_base_tax_amt1(double value) {
		setConstNumber(offset + 38, $tax_rate_base_tax_amt1, value);
	}
	
	/**
	 * 税率２. Tax rate 2.<p>
	 *
	 */
	public MCNumber tax_rate2() {
		return getConstNumber(offset + 39, $tax_rate2);
	}

	/**
	 * 税率２. Tax rate 2.<p>
	 *
	 */
	public void tax_rate2(MCNumber value) {
		setConstNumber(offset + 39, $tax_rate2, value);
	}
	
	/**
	 * 税率２. Tax rate 2.<p>
	 *
	 */
	public void tax_rate2(int value) {
		setConstNumber(offset + 39, $tax_rate2, value);
	}
	
	/**
	 * 税率２. Tax rate 2.<p>
	 *
	 */
	public void tax_rate2(long value) {
		setConstNumber(offset + 39, $tax_rate2, value);
	}
	
	/**
	 * 税率２. Tax rate 2.<p>
	 *
	 */
	public void tax_rate2(float value) {
		setConstNumber(offset + 39, $tax_rate2, value);
	}
	
	/**
	 * 税率２. Tax rate 2.<p>
	 *
	 */
	public void tax_rate2(double value) {
		setConstNumber(offset + 39, $tax_rate2, value);
	}
	
	/**
	 * 税率毎買上額２. Purchase amount 2 per tax rate.<p>
	 *
	 */
	public MCNumber tax_rate_sls_amt2() {
		return getConstNumber(offset + 40, $tax_rate_sls_amt2);
	}

	/**
	 * 税率毎買上額２. Purchase amount 2 per tax rate.<p>
	 *
	 */
	public void tax_rate_sls_amt2(MCNumber value) {
		setConstNumber(offset + 40, $tax_rate_sls_amt2, value);
	}
	
	/**
	 * 税率毎買上額２. Purchase amount 2 per tax rate.<p>
	 *
	 */
	public void tax_rate_sls_amt2(int value) {
		setConstNumber(offset + 40, $tax_rate_sls_amt2, value);
	}
	
	/**
	 * 税率毎買上額２. Purchase amount 2 per tax rate.<p>
	 *
	 */
	public void tax_rate_sls_amt2(long value) {
		setConstNumber(offset + 40, $tax_rate_sls_amt2, value);
	}
	
	/**
	 * 税率毎買上額２. Purchase amount 2 per tax rate.<p>
	 *
	 */
	public void tax_rate_sls_amt2(float value) {
		setConstNumber(offset + 40, $tax_rate_sls_amt2, value);
	}
	
	/**
	 * 税率毎買上額２. Purchase amount 2 per tax rate.<p>
	 *
	 */
	public void tax_rate_sls_amt2(double value) {
		setConstNumber(offset + 40, $tax_rate_sls_amt2, value);
	}
	
	/**
	 * 税率毎税額２. Tax amount per tax rate 2.<p>
	 *
	 */
	public MCNumber tax_rate_tax_amt2() {
		return getConstNumber(offset + 41, $tax_rate_tax_amt2);
	}

	/**
	 * 税率毎税額２. Tax amount per tax rate 2.<p>
	 *
	 */
	public void tax_rate_tax_amt2(MCNumber value) {
		setConstNumber(offset + 41, $tax_rate_tax_amt2, value);
	}
	
	/**
	 * 税率毎税額２. Tax amount per tax rate 2.<p>
	 *
	 */
	public void tax_rate_tax_amt2(int value) {
		setConstNumber(offset + 41, $tax_rate_tax_amt2, value);
	}
	
	/**
	 * 税率毎税額２. Tax amount per tax rate 2.<p>
	 *
	 */
	public void tax_rate_tax_amt2(long value) {
		setConstNumber(offset + 41, $tax_rate_tax_amt2, value);
	}
	
	/**
	 * 税率毎税額２. Tax amount per tax rate 2.<p>
	 *
	 */
	public void tax_rate_tax_amt2(float value) {
		setConstNumber(offset + 41, $tax_rate_tax_amt2, value);
	}
	
	/**
	 * 税率毎税額２. Tax amount per tax rate 2.<p>
	 *
	 */
	public void tax_rate_tax_amt2(double value) {
		setConstNumber(offset + 41, $tax_rate_tax_amt2, value);
	}
	
	/**
	 * 税率毎基準通貨税額２. Tax amount (Base currency) per tax rate 2.<p>
	 *
	 */
	public MCNumber tax_rate_base_tax_amt2() {
		return getConstNumber(offset + 42, $tax_rate_base_tax_amt2);
	}

	/**
	 * 税率毎基準通貨税額２. Tax amount (Base currency) per tax rate 2.<p>
	 *
	 */
	public void tax_rate_base_tax_amt2(MCNumber value) {
		setConstNumber(offset + 42, $tax_rate_base_tax_amt2, value);
	}
	
	/**
	 * 税率毎基準通貨税額２. Tax amount (Base currency) per tax rate 2.<p>
	 *
	 */
	public void tax_rate_base_tax_amt2(int value) {
		setConstNumber(offset + 42, $tax_rate_base_tax_amt2, value);
	}
	
	/**
	 * 税率毎基準通貨税額２. Tax amount (Base currency) per tax rate 2.<p>
	 *
	 */
	public void tax_rate_base_tax_amt2(long value) {
		setConstNumber(offset + 42, $tax_rate_base_tax_amt2, value);
	}
	
	/**
	 * 税率毎基準通貨税額２. Tax amount (Base currency) per tax rate 2.<p>
	 *
	 */
	public void tax_rate_base_tax_amt2(float value) {
		setConstNumber(offset + 42, $tax_rate_base_tax_amt2, value);
	}
	
	/**
	 * 税率毎基準通貨税額２. Tax amount (Base currency) per tax rate 2.<p>
	 *
	 */
	public void tax_rate_base_tax_amt2(double value) {
		setConstNumber(offset + 42, $tax_rate_base_tax_amt2, value);
	}
	
	/**
	 * 税率３. Tax rate 3.<p>
	 *
	 */
	public MCNumber tax_rate3() {
		return getConstNumber(offset + 43, $tax_rate3);
	}

	/**
	 * 税率３. Tax rate 3.<p>
	 *
	 */
	public void tax_rate3(MCNumber value) {
		setConstNumber(offset + 43, $tax_rate3, value);
	}
	
	/**
	 * 税率３. Tax rate 3.<p>
	 *
	 */
	public void tax_rate3(int value) {
		setConstNumber(offset + 43, $tax_rate3, value);
	}
	
	/**
	 * 税率３. Tax rate 3.<p>
	 *
	 */
	public void tax_rate3(long value) {
		setConstNumber(offset + 43, $tax_rate3, value);
	}
	
	/**
	 * 税率３. Tax rate 3.<p>
	 *
	 */
	public void tax_rate3(float value) {
		setConstNumber(offset + 43, $tax_rate3, value);
	}
	
	/**
	 * 税率３. Tax rate 3.<p>
	 *
	 */
	public void tax_rate3(double value) {
		setConstNumber(offset + 43, $tax_rate3, value);
	}
	
	/**
	 * 税率毎買上額３. Purchase amount 3 per tax rate.<p>
	 *
	 */
	public MCNumber tax_rate_sls_amt3() {
		return getConstNumber(offset + 44, $tax_rate_sls_amt3);
	}

	/**
	 * 税率毎買上額３. Purchase amount 3 per tax rate.<p>
	 *
	 */
	public void tax_rate_sls_amt3(MCNumber value) {
		setConstNumber(offset + 44, $tax_rate_sls_amt3, value);
	}
	
	/**
	 * 税率毎買上額３. Purchase amount 3 per tax rate.<p>
	 *
	 */
	public void tax_rate_sls_amt3(int value) {
		setConstNumber(offset + 44, $tax_rate_sls_amt3, value);
	}
	
	/**
	 * 税率毎買上額３. Purchase amount 3 per tax rate.<p>
	 *
	 */
	public void tax_rate_sls_amt3(long value) {
		setConstNumber(offset + 44, $tax_rate_sls_amt3, value);
	}
	
	/**
	 * 税率毎買上額３. Purchase amount 3 per tax rate.<p>
	 *
	 */
	public void tax_rate_sls_amt3(float value) {
		setConstNumber(offset + 44, $tax_rate_sls_amt3, value);
	}
	
	/**
	 * 税率毎買上額３. Purchase amount 3 per tax rate.<p>
	 *
	 */
	public void tax_rate_sls_amt3(double value) {
		setConstNumber(offset + 44, $tax_rate_sls_amt3, value);
	}
	
	/**
	 * 税率毎税額３. Tax amount per tax rate 3.<p>
	 *
	 */
	public MCNumber tax_rate_tax_amt3() {
		return getConstNumber(offset + 45, $tax_rate_tax_amt3);
	}

	/**
	 * 税率毎税額３. Tax amount per tax rate 3.<p>
	 *
	 */
	public void tax_rate_tax_amt3(MCNumber value) {
		setConstNumber(offset + 45, $tax_rate_tax_amt3, value);
	}
	
	/**
	 * 税率毎税額３. Tax amount per tax rate 3.<p>
	 *
	 */
	public void tax_rate_tax_amt3(int value) {
		setConstNumber(offset + 45, $tax_rate_tax_amt3, value);
	}
	
	/**
	 * 税率毎税額３. Tax amount per tax rate 3.<p>
	 *
	 */
	public void tax_rate_tax_amt3(long value) {
		setConstNumber(offset + 45, $tax_rate_tax_amt3, value);
	}
	
	/**
	 * 税率毎税額３. Tax amount per tax rate 3.<p>
	 *
	 */
	public void tax_rate_tax_amt3(float value) {
		setConstNumber(offset + 45, $tax_rate_tax_amt3, value);
	}
	
	/**
	 * 税率毎税額３. Tax amount per tax rate 3.<p>
	 *
	 */
	public void tax_rate_tax_amt3(double value) {
		setConstNumber(offset + 45, $tax_rate_tax_amt3, value);
	}
	
	/**
	 * 税率毎基準通貨税額３. Tax amount (Base currency) per tax rate 3.<p>
	 *
	 */
	public MCNumber tax_rate_base_tax_amt3() {
		return getConstNumber(offset + 46, $tax_rate_base_tax_amt3);
	}

	/**
	 * 税率毎基準通貨税額３. Tax amount (Base currency) per tax rate 3.<p>
	 *
	 */
	public void tax_rate_base_tax_amt3(MCNumber value) {
		setConstNumber(offset + 46, $tax_rate_base_tax_amt3, value);
	}
	
	/**
	 * 税率毎基準通貨税額３. Tax amount (Base currency) per tax rate 3.<p>
	 *
	 */
	public void tax_rate_base_tax_amt3(int value) {
		setConstNumber(offset + 46, $tax_rate_base_tax_amt3, value);
	}
	
	/**
	 * 税率毎基準通貨税額３. Tax amount (Base currency) per tax rate 3.<p>
	 *
	 */
	public void tax_rate_base_tax_amt3(long value) {
		setConstNumber(offset + 46, $tax_rate_base_tax_amt3, value);
	}
	
	/**
	 * 税率毎基準通貨税額３. Tax amount (Base currency) per tax rate 3.<p>
	 *
	 */
	public void tax_rate_base_tax_amt3(float value) {
		setConstNumber(offset + 46, $tax_rate_base_tax_amt3, value);
	}
	
	/**
	 * 税率毎基準通貨税額３. Tax amount (Base currency) per tax rate 3.<p>
	 *
	 */
	public void tax_rate_base_tax_amt3(double value) {
		setConstNumber(offset + 46, $tax_rate_base_tax_amt3, value);
	}
	
	/**
	 * 税率４. Tax rate 4.<p>
	 *
	 */
	public MCNumber tax_rate4() {
		return getConstNumber(offset + 47, $tax_rate4);
	}

	/**
	 * 税率４. Tax rate 4.<p>
	 *
	 */
	public void tax_rate4(MCNumber value) {
		setConstNumber(offset + 47, $tax_rate4, value);
	}
	
	/**
	 * 税率４. Tax rate 4.<p>
	 *
	 */
	public void tax_rate4(int value) {
		setConstNumber(offset + 47, $tax_rate4, value);
	}
	
	/**
	 * 税率４. Tax rate 4.<p>
	 *
	 */
	public void tax_rate4(long value) {
		setConstNumber(offset + 47, $tax_rate4, value);
	}
	
	/**
	 * 税率４. Tax rate 4.<p>
	 *
	 */
	public void tax_rate4(float value) {
		setConstNumber(offset + 47, $tax_rate4, value);
	}
	
	/**
	 * 税率４. Tax rate 4.<p>
	 *
	 */
	public void tax_rate4(double value) {
		setConstNumber(offset + 47, $tax_rate4, value);
	}
	
	/**
	 * 税率毎買上額４. Purchase amount 4 per tax rate.<p>
	 *
	 */
	public MCNumber tax_rate_sls_amt4() {
		return getConstNumber(offset + 48, $tax_rate_sls_amt4);
	}

	/**
	 * 税率毎買上額４. Purchase amount 4 per tax rate.<p>
	 *
	 */
	public void tax_rate_sls_amt4(MCNumber value) {
		setConstNumber(offset + 48, $tax_rate_sls_amt4, value);
	}
	
	/**
	 * 税率毎買上額４. Purchase amount 4 per tax rate.<p>
	 *
	 */
	public void tax_rate_sls_amt4(int value) {
		setConstNumber(offset + 48, $tax_rate_sls_amt4, value);
	}
	
	/**
	 * 税率毎買上額４. Purchase amount 4 per tax rate.<p>
	 *
	 */
	public void tax_rate_sls_amt4(long value) {
		setConstNumber(offset + 48, $tax_rate_sls_amt4, value);
	}
	
	/**
	 * 税率毎買上額４. Purchase amount 4 per tax rate.<p>
	 *
	 */
	public void tax_rate_sls_amt4(float value) {
		setConstNumber(offset + 48, $tax_rate_sls_amt4, value);
	}
	
	/**
	 * 税率毎買上額４. Purchase amount 4 per tax rate.<p>
	 *
	 */
	public void tax_rate_sls_amt4(double value) {
		setConstNumber(offset + 48, $tax_rate_sls_amt4, value);
	}
	
	/**
	 * 税率毎税額４. Tax amount per tax rate 4.<p>
	 *
	 */
	public MCNumber tax_rate_tax_amt4() {
		return getConstNumber(offset + 49, $tax_rate_tax_amt4);
	}

	/**
	 * 税率毎税額４. Tax amount per tax rate 4.<p>
	 *
	 */
	public void tax_rate_tax_amt4(MCNumber value) {
		setConstNumber(offset + 49, $tax_rate_tax_amt4, value);
	}
	
	/**
	 * 税率毎税額４. Tax amount per tax rate 4.<p>
	 *
	 */
	public void tax_rate_tax_amt4(int value) {
		setConstNumber(offset + 49, $tax_rate_tax_amt4, value);
	}
	
	/**
	 * 税率毎税額４. Tax amount per tax rate 4.<p>
	 *
	 */
	public void tax_rate_tax_amt4(long value) {
		setConstNumber(offset + 49, $tax_rate_tax_amt4, value);
	}
	
	/**
	 * 税率毎税額４. Tax amount per tax rate 4.<p>
	 *
	 */
	public void tax_rate_tax_amt4(float value) {
		setConstNumber(offset + 49, $tax_rate_tax_amt4, value);
	}
	
	/**
	 * 税率毎税額４. Tax amount per tax rate 4.<p>
	 *
	 */
	public void tax_rate_tax_amt4(double value) {
		setConstNumber(offset + 49, $tax_rate_tax_amt4, value);
	}
	
	/**
	 * 税率毎基準通貨税額４. Tax amount (Base currency) per tax rate 4.<p>
	 *
	 */
	public MCNumber tax_rate_base_tax_amt4() {
		return getConstNumber(offset + 50, $tax_rate_base_tax_amt4);
	}

	/**
	 * 税率毎基準通貨税額４. Tax amount (Base currency) per tax rate 4.<p>
	 *
	 */
	public void tax_rate_base_tax_amt4(MCNumber value) {
		setConstNumber(offset + 50, $tax_rate_base_tax_amt4, value);
	}
	
	/**
	 * 税率毎基準通貨税額４. Tax amount (Base currency) per tax rate 4.<p>
	 *
	 */
	public void tax_rate_base_tax_amt4(int value) {
		setConstNumber(offset + 50, $tax_rate_base_tax_amt4, value);
	}
	
	/**
	 * 税率毎基準通貨税額４. Tax amount (Base currency) per tax rate 4.<p>
	 *
	 */
	public void tax_rate_base_tax_amt4(long value) {
		setConstNumber(offset + 50, $tax_rate_base_tax_amt4, value);
	}
	
	/**
	 * 税率毎基準通貨税額４. Tax amount (Base currency) per tax rate 4.<p>
	 *
	 */
	public void tax_rate_base_tax_amt4(float value) {
		setConstNumber(offset + 50, $tax_rate_base_tax_amt4, value);
	}
	
	/**
	 * 税率毎基準通貨税額４. Tax amount (Base currency) per tax rate 4.<p>
	 *
	 */
	public void tax_rate_base_tax_amt4(double value) {
		setConstNumber(offset + 50, $tax_rate_base_tax_amt4, value);
	}
	
	/**
	 * 税率５. Tax rate 5.<p>
	 *
	 */
	public MCNumber tax_rate5() {
		return getConstNumber(offset + 51, $tax_rate5);
	}

	/**
	 * 税率５. Tax rate 5.<p>
	 *
	 */
	public void tax_rate5(MCNumber value) {
		setConstNumber(offset + 51, $tax_rate5, value);
	}
	
	/**
	 * 税率５. Tax rate 5.<p>
	 *
	 */
	public void tax_rate5(int value) {
		setConstNumber(offset + 51, $tax_rate5, value);
	}
	
	/**
	 * 税率５. Tax rate 5.<p>
	 *
	 */
	public void tax_rate5(long value) {
		setConstNumber(offset + 51, $tax_rate5, value);
	}
	
	/**
	 * 税率５. Tax rate 5.<p>
	 *
	 */
	public void tax_rate5(float value) {
		setConstNumber(offset + 51, $tax_rate5, value);
	}
	
	/**
	 * 税率５. Tax rate 5.<p>
	 *
	 */
	public void tax_rate5(double value) {
		setConstNumber(offset + 51, $tax_rate5, value);
	}
	
	/**
	 * 税率毎買上額５. Purchase amount 5 per tax rate.<p>
	 *
	 */
	public MCNumber tax_rate_sls_amt5() {
		return getConstNumber(offset + 52, $tax_rate_sls_amt5);
	}

	/**
	 * 税率毎買上額５. Purchase amount 5 per tax rate.<p>
	 *
	 */
	public void tax_rate_sls_amt5(MCNumber value) {
		setConstNumber(offset + 52, $tax_rate_sls_amt5, value);
	}
	
	/**
	 * 税率毎買上額５. Purchase amount 5 per tax rate.<p>
	 *
	 */
	public void tax_rate_sls_amt5(int value) {
		setConstNumber(offset + 52, $tax_rate_sls_amt5, value);
	}
	
	/**
	 * 税率毎買上額５. Purchase amount 5 per tax rate.<p>
	 *
	 */
	public void tax_rate_sls_amt5(long value) {
		setConstNumber(offset + 52, $tax_rate_sls_amt5, value);
	}
	
	/**
	 * 税率毎買上額５. Purchase amount 5 per tax rate.<p>
	 *
	 */
	public void tax_rate_sls_amt5(float value) {
		setConstNumber(offset + 52, $tax_rate_sls_amt5, value);
	}
	
	/**
	 * 税率毎買上額５. Purchase amount 5 per tax rate.<p>
	 *
	 */
	public void tax_rate_sls_amt5(double value) {
		setConstNumber(offset + 52, $tax_rate_sls_amt5, value);
	}
	
	/**
	 * 税率毎税額５. Tax amount per tax rate 5.<p>
	 *
	 */
	public MCNumber tax_rate_tax_amt5() {
		return getConstNumber(offset + 53, $tax_rate_tax_amt5);
	}

	/**
	 * 税率毎税額５. Tax amount per tax rate 5.<p>
	 *
	 */
	public void tax_rate_tax_amt5(MCNumber value) {
		setConstNumber(offset + 53, $tax_rate_tax_amt5, value);
	}
	
	/**
	 * 税率毎税額５. Tax amount per tax rate 5.<p>
	 *
	 */
	public void tax_rate_tax_amt5(int value) {
		setConstNumber(offset + 53, $tax_rate_tax_amt5, value);
	}
	
	/**
	 * 税率毎税額５. Tax amount per tax rate 5.<p>
	 *
	 */
	public void tax_rate_tax_amt5(long value) {
		setConstNumber(offset + 53, $tax_rate_tax_amt5, value);
	}
	
	/**
	 * 税率毎税額５. Tax amount per tax rate 5.<p>
	 *
	 */
	public void tax_rate_tax_amt5(float value) {
		setConstNumber(offset + 53, $tax_rate_tax_amt5, value);
	}
	
	/**
	 * 税率毎税額５. Tax amount per tax rate 5.<p>
	 *
	 */
	public void tax_rate_tax_amt5(double value) {
		setConstNumber(offset + 53, $tax_rate_tax_amt5, value);
	}
	
	/**
	 * 税率毎基準通貨税額５. Tax amount (Base currency) per tax rate 5.<p>
	 *
	 */
	public MCNumber tax_rate_base_tax_amt5() {
		return getConstNumber(offset + 54, $tax_rate_base_tax_amt5);
	}

	/**
	 * 税率毎基準通貨税額５. Tax amount (Base currency) per tax rate 5.<p>
	 *
	 */
	public void tax_rate_base_tax_amt5(MCNumber value) {
		setConstNumber(offset + 54, $tax_rate_base_tax_amt5, value);
	}
	
	/**
	 * 税率毎基準通貨税額５. Tax amount (Base currency) per tax rate 5.<p>
	 *
	 */
	public void tax_rate_base_tax_amt5(int value) {
		setConstNumber(offset + 54, $tax_rate_base_tax_amt5, value);
	}
	
	/**
	 * 税率毎基準通貨税額５. Tax amount (Base currency) per tax rate 5.<p>
	 *
	 */
	public void tax_rate_base_tax_amt5(long value) {
		setConstNumber(offset + 54, $tax_rate_base_tax_amt5, value);
	}
	
	/**
	 * 税率毎基準通貨税額５. Tax amount (Base currency) per tax rate 5.<p>
	 *
	 */
	public void tax_rate_base_tax_amt5(float value) {
		setConstNumber(offset + 54, $tax_rate_base_tax_amt5, value);
	}
	
	/**
	 * 税率毎基準通貨税額５. Tax amount (Base currency) per tax rate 5.<p>
	 *
	 */
	public void tax_rate_base_tax_amt5(double value) {
		setConstNumber(offset + 54, $tax_rate_base_tax_amt5, value);
	}
	
	/**
	 * 税率６. Tax rate 6.<p>
	 *
	 */
	public MCNumber tax_rate6() {
		return getConstNumber(offset + 55, $tax_rate6);
	}

	/**
	 * 税率６. Tax rate 6.<p>
	 *
	 */
	public void tax_rate6(MCNumber value) {
		setConstNumber(offset + 55, $tax_rate6, value);
	}
	
	/**
	 * 税率６. Tax rate 6.<p>
	 *
	 */
	public void tax_rate6(int value) {
		setConstNumber(offset + 55, $tax_rate6, value);
	}
	
	/**
	 * 税率６. Tax rate 6.<p>
	 *
	 */
	public void tax_rate6(long value) {
		setConstNumber(offset + 55, $tax_rate6, value);
	}
	
	/**
	 * 税率６. Tax rate 6.<p>
	 *
	 */
	public void tax_rate6(float value) {
		setConstNumber(offset + 55, $tax_rate6, value);
	}
	
	/**
	 * 税率６. Tax rate 6.<p>
	 *
	 */
	public void tax_rate6(double value) {
		setConstNumber(offset + 55, $tax_rate6, value);
	}
	
	/**
	 * 税率毎買上額６. Purchase amount 6 per tax rate.<p>
	 *
	 */
	public MCNumber tax_rate_sls_amt6() {
		return getConstNumber(offset + 56, $tax_rate_sls_amt6);
	}

	/**
	 * 税率毎買上額６. Purchase amount 6 per tax rate.<p>
	 *
	 */
	public void tax_rate_sls_amt6(MCNumber value) {
		setConstNumber(offset + 56, $tax_rate_sls_amt6, value);
	}
	
	/**
	 * 税率毎買上額６. Purchase amount 6 per tax rate.<p>
	 *
	 */
	public void tax_rate_sls_amt6(int value) {
		setConstNumber(offset + 56, $tax_rate_sls_amt6, value);
	}
	
	/**
	 * 税率毎買上額６. Purchase amount 6 per tax rate.<p>
	 *
	 */
	public void tax_rate_sls_amt6(long value) {
		setConstNumber(offset + 56, $tax_rate_sls_amt6, value);
	}
	
	/**
	 * 税率毎買上額６. Purchase amount 6 per tax rate.<p>
	 *
	 */
	public void tax_rate_sls_amt6(float value) {
		setConstNumber(offset + 56, $tax_rate_sls_amt6, value);
	}
	
	/**
	 * 税率毎買上額６. Purchase amount 6 per tax rate.<p>
	 *
	 */
	public void tax_rate_sls_amt6(double value) {
		setConstNumber(offset + 56, $tax_rate_sls_amt6, value);
	}
	
	/**
	 * 税率毎税額６. Tax amount per tax rate 6.<p>
	 *
	 */
	public MCNumber tax_rate_tax_amt6() {
		return getConstNumber(offset + 57, $tax_rate_tax_amt6);
	}

	/**
	 * 税率毎税額６. Tax amount per tax rate 6.<p>
	 *
	 */
	public void tax_rate_tax_amt6(MCNumber value) {
		setConstNumber(offset + 57, $tax_rate_tax_amt6, value);
	}
	
	/**
	 * 税率毎税額６. Tax amount per tax rate 6.<p>
	 *
	 */
	public void tax_rate_tax_amt6(int value) {
		setConstNumber(offset + 57, $tax_rate_tax_amt6, value);
	}
	
	/**
	 * 税率毎税額６. Tax amount per tax rate 6.<p>
	 *
	 */
	public void tax_rate_tax_amt6(long value) {
		setConstNumber(offset + 57, $tax_rate_tax_amt6, value);
	}
	
	/**
	 * 税率毎税額６. Tax amount per tax rate 6.<p>
	 *
	 */
	public void tax_rate_tax_amt6(float value) {
		setConstNumber(offset + 57, $tax_rate_tax_amt6, value);
	}
	
	/**
	 * 税率毎税額６. Tax amount per tax rate 6.<p>
	 *
	 */
	public void tax_rate_tax_amt6(double value) {
		setConstNumber(offset + 57, $tax_rate_tax_amt6, value);
	}
	
	/**
	 * 税率毎基準通貨税額６. Tax amount (Base currency) per tax rate 6.<p>
	 *
	 */
	public MCNumber tax_rate_base_tax_amt6() {
		return getConstNumber(offset + 58, $tax_rate_base_tax_amt6);
	}

	/**
	 * 税率毎基準通貨税額６. Tax amount (Base currency) per tax rate 6.<p>
	 *
	 */
	public void tax_rate_base_tax_amt6(MCNumber value) {
		setConstNumber(offset + 58, $tax_rate_base_tax_amt6, value);
	}
	
	/**
	 * 税率毎基準通貨税額６. Tax amount (Base currency) per tax rate 6.<p>
	 *
	 */
	public void tax_rate_base_tax_amt6(int value) {
		setConstNumber(offset + 58, $tax_rate_base_tax_amt6, value);
	}
	
	/**
	 * 税率毎基準通貨税額６. Tax amount (Base currency) per tax rate 6.<p>
	 *
	 */
	public void tax_rate_base_tax_amt6(long value) {
		setConstNumber(offset + 58, $tax_rate_base_tax_amt6, value);
	}
	
	/**
	 * 税率毎基準通貨税額６. Tax amount (Base currency) per tax rate 6.<p>
	 *
	 */
	public void tax_rate_base_tax_amt6(float value) {
		setConstNumber(offset + 58, $tax_rate_base_tax_amt6, value);
	}
	
	/**
	 * 税率毎基準通貨税額６. Tax amount (Base currency) per tax rate 6.<p>
	 *
	 */
	public void tax_rate_base_tax_amt6(double value) {
		setConstNumber(offset + 58, $tax_rate_base_tax_amt6, value);
	}
	
	/**
	 * 税率７. Tax rate 7.<p>
	 *
	 */
	public MCNumber tax_rate7() {
		return getConstNumber(offset + 59, $tax_rate7);
	}

	/**
	 * 税率７. Tax rate 7.<p>
	 *
	 */
	public void tax_rate7(MCNumber value) {
		setConstNumber(offset + 59, $tax_rate7, value);
	}
	
	/**
	 * 税率７. Tax rate 7.<p>
	 *
	 */
	public void tax_rate7(int value) {
		setConstNumber(offset + 59, $tax_rate7, value);
	}
	
	/**
	 * 税率７. Tax rate 7.<p>
	 *
	 */
	public void tax_rate7(long value) {
		setConstNumber(offset + 59, $tax_rate7, value);
	}
	
	/**
	 * 税率７. Tax rate 7.<p>
	 *
	 */
	public void tax_rate7(float value) {
		setConstNumber(offset + 59, $tax_rate7, value);
	}
	
	/**
	 * 税率７. Tax rate 7.<p>
	 *
	 */
	public void tax_rate7(double value) {
		setConstNumber(offset + 59, $tax_rate7, value);
	}
	
	/**
	 * 税率毎買上額７. Purchase amount 7 per tax rate.<p>
	 *
	 */
	public MCNumber tax_rate_sls_amt7() {
		return getConstNumber(offset + 60, $tax_rate_sls_amt7);
	}

	/**
	 * 税率毎買上額７. Purchase amount 7 per tax rate.<p>
	 *
	 */
	public void tax_rate_sls_amt7(MCNumber value) {
		setConstNumber(offset + 60, $tax_rate_sls_amt7, value);
	}
	
	/**
	 * 税率毎買上額７. Purchase amount 7 per tax rate.<p>
	 *
	 */
	public void tax_rate_sls_amt7(int value) {
		setConstNumber(offset + 60, $tax_rate_sls_amt7, value);
	}
	
	/**
	 * 税率毎買上額７. Purchase amount 7 per tax rate.<p>
	 *
	 */
	public void tax_rate_sls_amt7(long value) {
		setConstNumber(offset + 60, $tax_rate_sls_amt7, value);
	}
	
	/**
	 * 税率毎買上額７. Purchase amount 7 per tax rate.<p>
	 *
	 */
	public void tax_rate_sls_amt7(float value) {
		setConstNumber(offset + 60, $tax_rate_sls_amt7, value);
	}
	
	/**
	 * 税率毎買上額７. Purchase amount 7 per tax rate.<p>
	 *
	 */
	public void tax_rate_sls_amt7(double value) {
		setConstNumber(offset + 60, $tax_rate_sls_amt7, value);
	}
	
	/**
	 * 税率毎税額７. Tax amount per tax rate 7.<p>
	 *
	 */
	public MCNumber tax_rate_tax_amt7() {
		return getConstNumber(offset + 61, $tax_rate_tax_amt7);
	}

	/**
	 * 税率毎税額７. Tax amount per tax rate 7.<p>
	 *
	 */
	public void tax_rate_tax_amt7(MCNumber value) {
		setConstNumber(offset + 61, $tax_rate_tax_amt7, value);
	}
	
	/**
	 * 税率毎税額７. Tax amount per tax rate 7.<p>
	 *
	 */
	public void tax_rate_tax_amt7(int value) {
		setConstNumber(offset + 61, $tax_rate_tax_amt7, value);
	}
	
	/**
	 * 税率毎税額７. Tax amount per tax rate 7.<p>
	 *
	 */
	public void tax_rate_tax_amt7(long value) {
		setConstNumber(offset + 61, $tax_rate_tax_amt7, value);
	}
	
	/**
	 * 税率毎税額７. Tax amount per tax rate 7.<p>
	 *
	 */
	public void tax_rate_tax_amt7(float value) {
		setConstNumber(offset + 61, $tax_rate_tax_amt7, value);
	}
	
	/**
	 * 税率毎税額７. Tax amount per tax rate 7.<p>
	 *
	 */
	public void tax_rate_tax_amt7(double value) {
		setConstNumber(offset + 61, $tax_rate_tax_amt7, value);
	}
	
	/**
	 * 税率毎基準通貨税額７. Tax amount (Base currency) per tax rate 7.<p>
	 *
	 */
	public MCNumber tax_rate_base_tax_amt7() {
		return getConstNumber(offset + 62, $tax_rate_base_tax_amt7);
	}

	/**
	 * 税率毎基準通貨税額７. Tax amount (Base currency) per tax rate 7.<p>
	 *
	 */
	public void tax_rate_base_tax_amt7(MCNumber value) {
		setConstNumber(offset + 62, $tax_rate_base_tax_amt7, value);
	}
	
	/**
	 * 税率毎基準通貨税額７. Tax amount (Base currency) per tax rate 7.<p>
	 *
	 */
	public void tax_rate_base_tax_amt7(int value) {
		setConstNumber(offset + 62, $tax_rate_base_tax_amt7, value);
	}
	
	/**
	 * 税率毎基準通貨税額７. Tax amount (Base currency) per tax rate 7.<p>
	 *
	 */
	public void tax_rate_base_tax_amt7(long value) {
		setConstNumber(offset + 62, $tax_rate_base_tax_amt7, value);
	}
	
	/**
	 * 税率毎基準通貨税額７. Tax amount (Base currency) per tax rate 7.<p>
	 *
	 */
	public void tax_rate_base_tax_amt7(float value) {
		setConstNumber(offset + 62, $tax_rate_base_tax_amt7, value);
	}
	
	/**
	 * 税率毎基準通貨税額７. Tax amount (Base currency) per tax rate 7.<p>
	 *
	 */
	public void tax_rate_base_tax_amt7(double value) {
		setConstNumber(offset + 62, $tax_rate_base_tax_amt7, value);
	}
	
	/**
	 * 税率８. Tax rate 8.<p>
	 *
	 */
	public MCNumber tax_rate8() {
		return getConstNumber(offset + 63, $tax_rate8);
	}

	/**
	 * 税率８. Tax rate 8.<p>
	 *
	 */
	public void tax_rate8(MCNumber value) {
		setConstNumber(offset + 63, $tax_rate8, value);
	}
	
	/**
	 * 税率８. Tax rate 8.<p>
	 *
	 */
	public void tax_rate8(int value) {
		setConstNumber(offset + 63, $tax_rate8, value);
	}
	
	/**
	 * 税率８. Tax rate 8.<p>
	 *
	 */
	public void tax_rate8(long value) {
		setConstNumber(offset + 63, $tax_rate8, value);
	}
	
	/**
	 * 税率８. Tax rate 8.<p>
	 *
	 */
	public void tax_rate8(float value) {
		setConstNumber(offset + 63, $tax_rate8, value);
	}
	
	/**
	 * 税率８. Tax rate 8.<p>
	 *
	 */
	public void tax_rate8(double value) {
		setConstNumber(offset + 63, $tax_rate8, value);
	}
	
	/**
	 * 税率毎買上額８. Purchase amount 8 per tax rate.<p>
	 *
	 */
	public MCNumber tax_rate_sls_amt8() {
		return getConstNumber(offset + 64, $tax_rate_sls_amt8);
	}

	/**
	 * 税率毎買上額８. Purchase amount 8 per tax rate.<p>
	 *
	 */
	public void tax_rate_sls_amt8(MCNumber value) {
		setConstNumber(offset + 64, $tax_rate_sls_amt8, value);
	}
	
	/**
	 * 税率毎買上額８. Purchase amount 8 per tax rate.<p>
	 *
	 */
	public void tax_rate_sls_amt8(int value) {
		setConstNumber(offset + 64, $tax_rate_sls_amt8, value);
	}
	
	/**
	 * 税率毎買上額８. Purchase amount 8 per tax rate.<p>
	 *
	 */
	public void tax_rate_sls_amt8(long value) {
		setConstNumber(offset + 64, $tax_rate_sls_amt8, value);
	}
	
	/**
	 * 税率毎買上額８. Purchase amount 8 per tax rate.<p>
	 *
	 */
	public void tax_rate_sls_amt8(float value) {
		setConstNumber(offset + 64, $tax_rate_sls_amt8, value);
	}
	
	/**
	 * 税率毎買上額８. Purchase amount 8 per tax rate.<p>
	 *
	 */
	public void tax_rate_sls_amt8(double value) {
		setConstNumber(offset + 64, $tax_rate_sls_amt8, value);
	}
	
	/**
	 * 税率毎税額８. Tax amount per tax rate 8.<p>
	 *
	 */
	public MCNumber tax_rate_tax_amt8() {
		return getConstNumber(offset + 65, $tax_rate_tax_amt8);
	}

	/**
	 * 税率毎税額８. Tax amount per tax rate 8.<p>
	 *
	 */
	public void tax_rate_tax_amt8(MCNumber value) {
		setConstNumber(offset + 65, $tax_rate_tax_amt8, value);
	}
	
	/**
	 * 税率毎税額８. Tax amount per tax rate 8.<p>
	 *
	 */
	public void tax_rate_tax_amt8(int value) {
		setConstNumber(offset + 65, $tax_rate_tax_amt8, value);
	}
	
	/**
	 * 税率毎税額８. Tax amount per tax rate 8.<p>
	 *
	 */
	public void tax_rate_tax_amt8(long value) {
		setConstNumber(offset + 65, $tax_rate_tax_amt8, value);
	}
	
	/**
	 * 税率毎税額８. Tax amount per tax rate 8.<p>
	 *
	 */
	public void tax_rate_tax_amt8(float value) {
		setConstNumber(offset + 65, $tax_rate_tax_amt8, value);
	}
	
	/**
	 * 税率毎税額８. Tax amount per tax rate 8.<p>
	 *
	 */
	public void tax_rate_tax_amt8(double value) {
		setConstNumber(offset + 65, $tax_rate_tax_amt8, value);
	}
	
	/**
	 * 税率毎基準通貨税額８. Tax amount (Base currency) per tax rate 8.<p>
	 *
	 */
	public MCNumber tax_rate_base_tax_amt8() {
		return getConstNumber(offset + 66, $tax_rate_base_tax_amt8);
	}

	/**
	 * 税率毎基準通貨税額８. Tax amount (Base currency) per tax rate 8.<p>
	 *
	 */
	public void tax_rate_base_tax_amt8(MCNumber value) {
		setConstNumber(offset + 66, $tax_rate_base_tax_amt8, value);
	}
	
	/**
	 * 税率毎基準通貨税額８. Tax amount (Base currency) per tax rate 8.<p>
	 *
	 */
	public void tax_rate_base_tax_amt8(int value) {
		setConstNumber(offset + 66, $tax_rate_base_tax_amt8, value);
	}
	
	/**
	 * 税率毎基準通貨税額８. Tax amount (Base currency) per tax rate 8.<p>
	 *
	 */
	public void tax_rate_base_tax_amt8(long value) {
		setConstNumber(offset + 66, $tax_rate_base_tax_amt8, value);
	}
	
	/**
	 * 税率毎基準通貨税額８. Tax amount (Base currency) per tax rate 8.<p>
	 *
	 */
	public void tax_rate_base_tax_amt8(float value) {
		setConstNumber(offset + 66, $tax_rate_base_tax_amt8, value);
	}
	
	/**
	 * 税率毎基準通貨税額８. Tax amount (Base currency) per tax rate 8.<p>
	 *
	 */
	public void tax_rate_base_tax_amt8(double value) {
		setConstNumber(offset + 66, $tax_rate_base_tax_amt8, value);
	}
	
	/**
	 * 税率９. Tax rate 9.<p>
	 *
	 */
	public MCNumber tax_rate9() {
		return getConstNumber(offset + 67, $tax_rate9);
	}

	/**
	 * 税率９. Tax rate 9.<p>
	 *
	 */
	public void tax_rate9(MCNumber value) {
		setConstNumber(offset + 67, $tax_rate9, value);
	}
	
	/**
	 * 税率９. Tax rate 9.<p>
	 *
	 */
	public void tax_rate9(int value) {
		setConstNumber(offset + 67, $tax_rate9, value);
	}
	
	/**
	 * 税率９. Tax rate 9.<p>
	 *
	 */
	public void tax_rate9(long value) {
		setConstNumber(offset + 67, $tax_rate9, value);
	}
	
	/**
	 * 税率９. Tax rate 9.<p>
	 *
	 */
	public void tax_rate9(float value) {
		setConstNumber(offset + 67, $tax_rate9, value);
	}
	
	/**
	 * 税率９. Tax rate 9.<p>
	 *
	 */
	public void tax_rate9(double value) {
		setConstNumber(offset + 67, $tax_rate9, value);
	}
	
	/**
	 * 税率毎買上額９. Purchase amount 9 per tax rate.<p>
	 *
	 */
	public MCNumber tax_rate_sls_amt9() {
		return getConstNumber(offset + 68, $tax_rate_sls_amt9);
	}

	/**
	 * 税率毎買上額９. Purchase amount 9 per tax rate.<p>
	 *
	 */
	public void tax_rate_sls_amt9(MCNumber value) {
		setConstNumber(offset + 68, $tax_rate_sls_amt9, value);
	}
	
	/**
	 * 税率毎買上額９. Purchase amount 9 per tax rate.<p>
	 *
	 */
	public void tax_rate_sls_amt9(int value) {
		setConstNumber(offset + 68, $tax_rate_sls_amt9, value);
	}
	
	/**
	 * 税率毎買上額９. Purchase amount 9 per tax rate.<p>
	 *
	 */
	public void tax_rate_sls_amt9(long value) {
		setConstNumber(offset + 68, $tax_rate_sls_amt9, value);
	}
	
	/**
	 * 税率毎買上額９. Purchase amount 9 per tax rate.<p>
	 *
	 */
	public void tax_rate_sls_amt9(float value) {
		setConstNumber(offset + 68, $tax_rate_sls_amt9, value);
	}
	
	/**
	 * 税率毎買上額９. Purchase amount 9 per tax rate.<p>
	 *
	 */
	public void tax_rate_sls_amt9(double value) {
		setConstNumber(offset + 68, $tax_rate_sls_amt9, value);
	}
	
	/**
	 * 税率毎税額９. Tax amount per tax rate 9.<p>
	 *
	 */
	public MCNumber tax_rate_tax_amt9() {
		return getConstNumber(offset + 69, $tax_rate_tax_amt9);
	}

	/**
	 * 税率毎税額９. Tax amount per tax rate 9.<p>
	 *
	 */
	public void tax_rate_tax_amt9(MCNumber value) {
		setConstNumber(offset + 69, $tax_rate_tax_amt9, value);
	}
	
	/**
	 * 税率毎税額９. Tax amount per tax rate 9.<p>
	 *
	 */
	public void tax_rate_tax_amt9(int value) {
		setConstNumber(offset + 69, $tax_rate_tax_amt9, value);
	}
	
	/**
	 * 税率毎税額９. Tax amount per tax rate 9.<p>
	 *
	 */
	public void tax_rate_tax_amt9(long value) {
		setConstNumber(offset + 69, $tax_rate_tax_amt9, value);
	}
	
	/**
	 * 税率毎税額９. Tax amount per tax rate 9.<p>
	 *
	 */
	public void tax_rate_tax_amt9(float value) {
		setConstNumber(offset + 69, $tax_rate_tax_amt9, value);
	}
	
	/**
	 * 税率毎税額９. Tax amount per tax rate 9.<p>
	 *
	 */
	public void tax_rate_tax_amt9(double value) {
		setConstNumber(offset + 69, $tax_rate_tax_amt9, value);
	}
	
	/**
	 * 税率毎基準通貨税額９. Tax amount (Base currency) per tax rate 9.<p>
	 *
	 */
	public MCNumber tax_rate_base_tax_amt9() {
		return getConstNumber(offset + 70, $tax_rate_base_tax_amt9);
	}

	/**
	 * 税率毎基準通貨税額９. Tax amount (Base currency) per tax rate 9.<p>
	 *
	 */
	public void tax_rate_base_tax_amt9(MCNumber value) {
		setConstNumber(offset + 70, $tax_rate_base_tax_amt9, value);
	}
	
	/**
	 * 税率毎基準通貨税額９. Tax amount (Base currency) per tax rate 9.<p>
	 *
	 */
	public void tax_rate_base_tax_amt9(int value) {
		setConstNumber(offset + 70, $tax_rate_base_tax_amt9, value);
	}
	
	/**
	 * 税率毎基準通貨税額９. Tax amount (Base currency) per tax rate 9.<p>
	 *
	 */
	public void tax_rate_base_tax_amt9(long value) {
		setConstNumber(offset + 70, $tax_rate_base_tax_amt9, value);
	}
	
	/**
	 * 税率毎基準通貨税額９. Tax amount (Base currency) per tax rate 9.<p>
	 *
	 */
	public void tax_rate_base_tax_amt9(float value) {
		setConstNumber(offset + 70, $tax_rate_base_tax_amt9, value);
	}
	
	/**
	 * 税率毎基準通貨税額９. Tax amount (Base currency) per tax rate 9.<p>
	 *
	 */
	public void tax_rate_base_tax_amt9(double value) {
		setConstNumber(offset + 70, $tax_rate_base_tax_amt9, value);
	}
	
	/**
	 * 税率１０. Tax rate 10.<p>
	 *
	 */
	public MCNumber tax_rate10() {
		return getConstNumber(offset + 71, $tax_rate10);
	}

	/**
	 * 税率１０. Tax rate 10.<p>
	 *
	 */
	public void tax_rate10(MCNumber value) {
		setConstNumber(offset + 71, $tax_rate10, value);
	}
	
	/**
	 * 税率１０. Tax rate 10.<p>
	 *
	 */
	public void tax_rate10(int value) {
		setConstNumber(offset + 71, $tax_rate10, value);
	}
	
	/**
	 * 税率１０. Tax rate 10.<p>
	 *
	 */
	public void tax_rate10(long value) {
		setConstNumber(offset + 71, $tax_rate10, value);
	}
	
	/**
	 * 税率１０. Tax rate 10.<p>
	 *
	 */
	public void tax_rate10(float value) {
		setConstNumber(offset + 71, $tax_rate10, value);
	}
	
	/**
	 * 税率１０. Tax rate 10.<p>
	 *
	 */
	public void tax_rate10(double value) {
		setConstNumber(offset + 71, $tax_rate10, value);
	}
	
	/**
	 * 税率毎買上額１０. Purchase amount 10 per tax rate.<p>
	 *
	 */
	public MCNumber tax_rate_sls_amt10() {
		return getConstNumber(offset + 72, $tax_rate_sls_amt10);
	}

	/**
	 * 税率毎買上額１０. Purchase amount 10 per tax rate.<p>
	 *
	 */
	public void tax_rate_sls_amt10(MCNumber value) {
		setConstNumber(offset + 72, $tax_rate_sls_amt10, value);
	}
	
	/**
	 * 税率毎買上額１０. Purchase amount 10 per tax rate.<p>
	 *
	 */
	public void tax_rate_sls_amt10(int value) {
		setConstNumber(offset + 72, $tax_rate_sls_amt10, value);
	}
	
	/**
	 * 税率毎買上額１０. Purchase amount 10 per tax rate.<p>
	 *
	 */
	public void tax_rate_sls_amt10(long value) {
		setConstNumber(offset + 72, $tax_rate_sls_amt10, value);
	}
	
	/**
	 * 税率毎買上額１０. Purchase amount 10 per tax rate.<p>
	 *
	 */
	public void tax_rate_sls_amt10(float value) {
		setConstNumber(offset + 72, $tax_rate_sls_amt10, value);
	}
	
	/**
	 * 税率毎買上額１０. Purchase amount 10 per tax rate.<p>
	 *
	 */
	public void tax_rate_sls_amt10(double value) {
		setConstNumber(offset + 72, $tax_rate_sls_amt10, value);
	}
	
	/**
	 * 税率毎税額１０. Tax amount per tax rate 10.<p>
	 *
	 */
	public MCNumber tax_rate_tax_amt10() {
		return getConstNumber(offset + 73, $tax_rate_tax_amt10);
	}

	/**
	 * 税率毎税額１０. Tax amount per tax rate 10.<p>
	 *
	 */
	public void tax_rate_tax_amt10(MCNumber value) {
		setConstNumber(offset + 73, $tax_rate_tax_amt10, value);
	}
	
	/**
	 * 税率毎税額１０. Tax amount per tax rate 10.<p>
	 *
	 */
	public void tax_rate_tax_amt10(int value) {
		setConstNumber(offset + 73, $tax_rate_tax_amt10, value);
	}
	
	/**
	 * 税率毎税額１０. Tax amount per tax rate 10.<p>
	 *
	 */
	public void tax_rate_tax_amt10(long value) {
		setConstNumber(offset + 73, $tax_rate_tax_amt10, value);
	}
	
	/**
	 * 税率毎税額１０. Tax amount per tax rate 10.<p>
	 *
	 */
	public void tax_rate_tax_amt10(float value) {
		setConstNumber(offset + 73, $tax_rate_tax_amt10, value);
	}
	
	/**
	 * 税率毎税額１０. Tax amount per tax rate 10.<p>
	 *
	 */
	public void tax_rate_tax_amt10(double value) {
		setConstNumber(offset + 73, $tax_rate_tax_amt10, value);
	}
	
	/**
	 * 税率毎基準通貨税額１０. Tax amount (Base currency) per tax rate 10.<p>
	 *
	 */
	public MCNumber tax_rate_base_tax_amt10() {
		return getConstNumber(offset + 74, $tax_rate_base_tax_amt10);
	}

	/**
	 * 税率毎基準通貨税額１０. Tax amount (Base currency) per tax rate 10.<p>
	 *
	 */
	public void tax_rate_base_tax_amt10(MCNumber value) {
		setConstNumber(offset + 74, $tax_rate_base_tax_amt10, value);
	}
	
	/**
	 * 税率毎基準通貨税額１０. Tax amount (Base currency) per tax rate 10.<p>
	 *
	 */
	public void tax_rate_base_tax_amt10(int value) {
		setConstNumber(offset + 74, $tax_rate_base_tax_amt10, value);
	}
	
	/**
	 * 税率毎基準通貨税額１０. Tax amount (Base currency) per tax rate 10.<p>
	 *
	 */
	public void tax_rate_base_tax_amt10(long value) {
		setConstNumber(offset + 74, $tax_rate_base_tax_amt10, value);
	}
	
	/**
	 * 税率毎基準通貨税額１０. Tax amount (Base currency) per tax rate 10.<p>
	 *
	 */
	public void tax_rate_base_tax_amt10(float value) {
		setConstNumber(offset + 74, $tax_rate_base_tax_amt10, value);
	}
	
	/**
	 * 税率毎基準通貨税額１０. Tax amount (Base currency) per tax rate 10.<p>
	 *
	 */
	public void tax_rate_base_tax_amt10(double value) {
		setConstNumber(offset + 74, $tax_rate_base_tax_amt10, value);
	}
	
	/**
	 * 前受金残高. Advance received balance.<p>
	 *
	 */
	public MCNumber adv_amt_bal() {
		return getConstNumber(offset + 75, $adv_amt_bal);
	}

	/**
	 * 前受金残高. Advance received balance.<p>
	 *
	 */
	public void adv_amt_bal(MCNumber value) {
		setConstNumber(offset + 75, $adv_amt_bal, value);
	}
	
	/**
	 * 前受金残高. Advance received balance.<p>
	 *
	 */
	public void adv_amt_bal(int value) {
		setConstNumber(offset + 75, $adv_amt_bal, value);
	}
	
	/**
	 * 前受金残高. Advance received balance.<p>
	 *
	 */
	public void adv_amt_bal(long value) {
		setConstNumber(offset + 75, $adv_amt_bal, value);
	}
	
	/**
	 * 前受金残高. Advance received balance.<p>
	 *
	 */
	public void adv_amt_bal(float value) {
		setConstNumber(offset + 75, $adv_amt_bal, value);
	}
	
	/**
	 * 前受金残高. Advance received balance.<p>
	 *
	 */
	public void adv_amt_bal(double value) {
		setConstNumber(offset + 75, $adv_amt_bal, value);
	}
	
	/**
	 * 前受金入金額. Advance received payment amount.<p>
	 *
	 */
	public MCNumber adv_amt() {
		return getConstNumber(offset + 76, $adv_amt);
	}

	/**
	 * 前受金入金額. Advance received payment amount.<p>
	 *
	 */
	public void adv_amt(MCNumber value) {
		setConstNumber(offset + 76, $adv_amt, value);
	}
	
	/**
	 * 前受金入金額. Advance received payment amount.<p>
	 *
	 */
	public void adv_amt(int value) {
		setConstNumber(offset + 76, $adv_amt, value);
	}
	
	/**
	 * 前受金入金額. Advance received payment amount.<p>
	 *
	 */
	public void adv_amt(long value) {
		setConstNumber(offset + 76, $adv_amt, value);
	}
	
	/**
	 * 前受金入金額. Advance received payment amount.<p>
	 *
	 */
	public void adv_amt(float value) {
		setConstNumber(offset + 76, $adv_amt, value);
	}
	
	/**
	 * 前受金入金額. Advance received payment amount.<p>
	 *
	 */
	public void adv_amt(double value) {
		setConstNumber(offset + 76, $adv_amt, value);
	}
	
	/**
	 * 前受金相殺額. Advance received offset amount.<p>
	 *
	 */
	public MCNumber adv_setoff_amt() {
		return getConstNumber(offset + 77, $adv_setoff_amt);
	}

	/**
	 * 前受金相殺額. Advance received offset amount.<p>
	 *
	 */
	public void adv_setoff_amt(MCNumber value) {
		setConstNumber(offset + 77, $adv_setoff_amt, value);
	}
	
	/**
	 * 前受金相殺額. Advance received offset amount.<p>
	 *
	 */
	public void adv_setoff_amt(int value) {
		setConstNumber(offset + 77, $adv_setoff_amt, value);
	}
	
	/**
	 * 前受金相殺額. Advance received offset amount.<p>
	 *
	 */
	public void adv_setoff_amt(long value) {
		setConstNumber(offset + 77, $adv_setoff_amt, value);
	}
	
	/**
	 * 前受金相殺額. Advance received offset amount.<p>
	 *
	 */
	public void adv_setoff_amt(float value) {
		setConstNumber(offset + 77, $adv_setoff_amt, value);
	}
	
	/**
	 * 前受金相殺額. Advance received offset amount.<p>
	 *
	 */
	public void adv_setoff_amt(double value) {
		setConstNumber(offset + 77, $adv_setoff_amt, value);
	}
	
	/**
	 * 前受金相殺税額. Advance received offset tax amount.<p>
	 *
	 */
	public MCNumber adv_setoff_tax_amt() {
		return getConstNumber(offset + 78, $adv_setoff_tax_amt);
	}

	/**
	 * 前受金相殺税額. Advance received offset tax amount.<p>
	 *
	 */
	public void adv_setoff_tax_amt(MCNumber value) {
		setConstNumber(offset + 78, $adv_setoff_tax_amt, value);
	}
	
	/**
	 * 前受金相殺税額. Advance received offset tax amount.<p>
	 *
	 */
	public void adv_setoff_tax_amt(int value) {
		setConstNumber(offset + 78, $adv_setoff_tax_amt, value);
	}
	
	/**
	 * 前受金相殺税額. Advance received offset tax amount.<p>
	 *
	 */
	public void adv_setoff_tax_amt(long value) {
		setConstNumber(offset + 78, $adv_setoff_tax_amt, value);
	}
	
	/**
	 * 前受金相殺税額. Advance received offset tax amount.<p>
	 *
	 */
	public void adv_setoff_tax_amt(float value) {
		setConstNumber(offset + 78, $adv_setoff_tax_amt, value);
	}
	
	/**
	 * 前受金相殺税額. Advance received offset tax amount.<p>
	 *
	 */
	public void adv_setoff_tax_amt(double value) {
		setConstNumber(offset + 78, $adv_setoff_tax_amt, value);
	}
	
	/**
	 * 支払予定日１. Scheduled payment date 1.<p>
	 *
	 */
	public MCDate pay_schd_dt1() {
		return getConstDate(offset + 79, $pay_schd_dt1);
	}

	/**
	 * 支払予定日１. Scheduled payment date 1.<p>
	 *
	 */
	public void pay_schd_dt1(MCDate value) {
		setConstDate(offset + 79, $pay_schd_dt1, value);
	}

	/**
	 * 支払予定額１. Payment schedule amount 1.<p>
	 *
	 */
	public MCNumber pay_schd_amt1() {
		return getConstNumber(offset + 80, $pay_schd_amt1);
	}

	/**
	 * 支払予定額１. Payment schedule amount 1.<p>
	 *
	 */
	public void pay_schd_amt1(MCNumber value) {
		setConstNumber(offset + 80, $pay_schd_amt1, value);
	}
	
	/**
	 * 支払予定額１. Payment schedule amount 1.<p>
	 *
	 */
	public void pay_schd_amt1(int value) {
		setConstNumber(offset + 80, $pay_schd_amt1, value);
	}
	
	/**
	 * 支払予定額１. Payment schedule amount 1.<p>
	 *
	 */
	public void pay_schd_amt1(long value) {
		setConstNumber(offset + 80, $pay_schd_amt1, value);
	}
	
	/**
	 * 支払予定額１. Payment schedule amount 1.<p>
	 *
	 */
	public void pay_schd_amt1(float value) {
		setConstNumber(offset + 80, $pay_schd_amt1, value);
	}
	
	/**
	 * 支払予定額１. Payment schedule amount 1.<p>
	 *
	 */
	public void pay_schd_amt1(double value) {
		setConstNumber(offset + 80, $pay_schd_amt1, value);
	}
	
	/**
	 * 支払方法ＣＤ１. Payment method cd. 1.<p>
	 *
	 */
	public String pay_mtd_cd1() {
		return getConstString(offset + 81, $pay_mtd_cd1);
	}

	/**
	 * 支払方法ＣＤ１. Payment method cd. 1.<p>
	 *
	 */
	public void pay_mtd_cd1(String value) {
		setConstString(offset + 81, $pay_mtd_cd1, value);
	}

	/**
	 * 支払予定日２. Scheduled payment date 2.<p>
	 *
	 */
	public MCDate pay_schd_dt2() {
		return getConstDate(offset + 82, $pay_schd_dt2);
	}

	/**
	 * 支払予定日２. Scheduled payment date 2.<p>
	 *
	 */
	public void pay_schd_dt2(MCDate value) {
		setConstDate(offset + 82, $pay_schd_dt2, value);
	}

	/**
	 * 支払予定額２. Payment schedule amount 2.<p>
	 *
	 */
	public MCNumber pay_schd_amt2() {
		return getConstNumber(offset + 83, $pay_schd_amt2);
	}

	/**
	 * 支払予定額２. Payment schedule amount 2.<p>
	 *
	 */
	public void pay_schd_amt2(MCNumber value) {
		setConstNumber(offset + 83, $pay_schd_amt2, value);
	}
	
	/**
	 * 支払予定額２. Payment schedule amount 2.<p>
	 *
	 */
	public void pay_schd_amt2(int value) {
		setConstNumber(offset + 83, $pay_schd_amt2, value);
	}
	
	/**
	 * 支払予定額２. Payment schedule amount 2.<p>
	 *
	 */
	public void pay_schd_amt2(long value) {
		setConstNumber(offset + 83, $pay_schd_amt2, value);
	}
	
	/**
	 * 支払予定額２. Payment schedule amount 2.<p>
	 *
	 */
	public void pay_schd_amt2(float value) {
		setConstNumber(offset + 83, $pay_schd_amt2, value);
	}
	
	/**
	 * 支払予定額２. Payment schedule amount 2.<p>
	 *
	 */
	public void pay_schd_amt2(double value) {
		setConstNumber(offset + 83, $pay_schd_amt2, value);
	}
	
	/**
	 * 支払方法ＣＤ２. Payment method cd. 2.<p>
	 *
	 */
	public String pay_mtd_cd2() {
		return getConstString(offset + 84, $pay_mtd_cd2);
	}

	/**
	 * 支払方法ＣＤ２. Payment method cd. 2.<p>
	 *
	 */
	public void pay_mtd_cd2(String value) {
		setConstString(offset + 84, $pay_mtd_cd2, value);
	}

	/**
	 * 支払予定日３. Scheduled payment date 3.<p>
	 *
	 */
	public MCDate pay_schd_dt3() {
		return getConstDate(offset + 85, $pay_schd_dt3);
	}

	/**
	 * 支払予定日３. Scheduled payment date 3.<p>
	 *
	 */
	public void pay_schd_dt3(MCDate value) {
		setConstDate(offset + 85, $pay_schd_dt3, value);
	}

	/**
	 * 支払予定額３. Payment schedule amount 3.<p>
	 *
	 */
	public MCNumber pay_schd_amt3() {
		return getConstNumber(offset + 86, $pay_schd_amt3);
	}

	/**
	 * 支払予定額３. Payment schedule amount 3.<p>
	 *
	 */
	public void pay_schd_amt3(MCNumber value) {
		setConstNumber(offset + 86, $pay_schd_amt3, value);
	}
	
	/**
	 * 支払予定額３. Payment schedule amount 3.<p>
	 *
	 */
	public void pay_schd_amt3(int value) {
		setConstNumber(offset + 86, $pay_schd_amt3, value);
	}
	
	/**
	 * 支払予定額３. Payment schedule amount 3.<p>
	 *
	 */
	public void pay_schd_amt3(long value) {
		setConstNumber(offset + 86, $pay_schd_amt3, value);
	}
	
	/**
	 * 支払予定額３. Payment schedule amount 3.<p>
	 *
	 */
	public void pay_schd_amt3(float value) {
		setConstNumber(offset + 86, $pay_schd_amt3, value);
	}
	
	/**
	 * 支払予定額３. Payment schedule amount 3.<p>
	 *
	 */
	public void pay_schd_amt3(double value) {
		setConstNumber(offset + 86, $pay_schd_amt3, value);
	}
	
	/**
	 * 支払方法ＣＤ３. Payment method cd. 3.<p>
	 *
	 */
	public String pay_mtd_cd3() {
		return getConstString(offset + 87, $pay_mtd_cd3);
	}

	/**
	 * 支払方法ＣＤ３. Payment method cd. 3.<p>
	 *
	 */
	public void pay_mtd_cd3(String value) {
		setConstString(offset + 87, $pay_mtd_cd3, value);
	}

	/**
	 * 支払予定日４. Scheduled payment date 4.<p>
	 *
	 */
	public MCDate pay_schd_dt4() {
		return getConstDate(offset + 88, $pay_schd_dt4);
	}

	/**
	 * 支払予定日４. Scheduled payment date 4.<p>
	 *
	 */
	public void pay_schd_dt4(MCDate value) {
		setConstDate(offset + 88, $pay_schd_dt4, value);
	}

	/**
	 * 支払予定額４. Payment schedule amount 4.<p>
	 *
	 */
	public MCNumber pay_schd_amt4() {
		return getConstNumber(offset + 89, $pay_schd_amt4);
	}

	/**
	 * 支払予定額４. Payment schedule amount 4.<p>
	 *
	 */
	public void pay_schd_amt4(MCNumber value) {
		setConstNumber(offset + 89, $pay_schd_amt4, value);
	}
	
	/**
	 * 支払予定額４. Payment schedule amount 4.<p>
	 *
	 */
	public void pay_schd_amt4(int value) {
		setConstNumber(offset + 89, $pay_schd_amt4, value);
	}
	
	/**
	 * 支払予定額４. Payment schedule amount 4.<p>
	 *
	 */
	public void pay_schd_amt4(long value) {
		setConstNumber(offset + 89, $pay_schd_amt4, value);
	}
	
	/**
	 * 支払予定額４. Payment schedule amount 4.<p>
	 *
	 */
	public void pay_schd_amt4(float value) {
		setConstNumber(offset + 89, $pay_schd_amt4, value);
	}
	
	/**
	 * 支払予定額４. Payment schedule amount 4.<p>
	 *
	 */
	public void pay_schd_amt4(double value) {
		setConstNumber(offset + 89, $pay_schd_amt4, value);
	}
	
	/**
	 * 支払方法ＣＤ４. Payment method cd. 4.<p>
	 *
	 */
	public String pay_mtd_cd4() {
		return getConstString(offset + 90, $pay_mtd_cd4);
	}

	/**
	 * 支払方法ＣＤ４. Payment method cd. 4.<p>
	 *
	 */
	public void pay_mtd_cd4(String value) {
		setConstString(offset + 90, $pay_mtd_cd4, value);
	}

	/**
	 * 支払予定日５. Scheduled payment date 5.<p>
	 *
	 */
	public MCDate pay_schd_dt5() {
		return getConstDate(offset + 91, $pay_schd_dt5);
	}

	/**
	 * 支払予定日５. Scheduled payment date 5.<p>
	 *
	 */
	public void pay_schd_dt5(MCDate value) {
		setConstDate(offset + 91, $pay_schd_dt5, value);
	}

	/**
	 * 支払予定額５. Payment schedule amount 5.<p>
	 *
	 */
	public MCNumber pay_schd_amt5() {
		return getConstNumber(offset + 92, $pay_schd_amt5);
	}

	/**
	 * 支払予定額５. Payment schedule amount 5.<p>
	 *
	 */
	public void pay_schd_amt5(MCNumber value) {
		setConstNumber(offset + 92, $pay_schd_amt5, value);
	}
	
	/**
	 * 支払予定額５. Payment schedule amount 5.<p>
	 *
	 */
	public void pay_schd_amt5(int value) {
		setConstNumber(offset + 92, $pay_schd_amt5, value);
	}
	
	/**
	 * 支払予定額５. Payment schedule amount 5.<p>
	 *
	 */
	public void pay_schd_amt5(long value) {
		setConstNumber(offset + 92, $pay_schd_amt5, value);
	}
	
	/**
	 * 支払予定額５. Payment schedule amount 5.<p>
	 *
	 */
	public void pay_schd_amt5(float value) {
		setConstNumber(offset + 92, $pay_schd_amt5, value);
	}
	
	/**
	 * 支払予定額５. Payment schedule amount 5.<p>
	 *
	 */
	public void pay_schd_amt5(double value) {
		setConstNumber(offset + 92, $pay_schd_amt5, value);
	}
	
	/**
	 * 支払方法ＣＤ５. Payment method cd. 5.<p>
	 *
	 */
	public String pay_mtd_cd5() {
		return getConstString(offset + 93, $pay_mtd_cd5);
	}

	/**
	 * 支払方法ＣＤ５. Payment method cd. 5.<p>
	 *
	 */
	public void pay_mtd_cd5(String value) {
		setConstString(offset + 93, $pay_mtd_cd5, value);
	}

	/**
	 * 支払予定日６. Scheduled payment date 6.<p>
	 *
	 */
	public MCDate pay_schd_dt6() {
		return getConstDate(offset + 94, $pay_schd_dt6);
	}

	/**
	 * 支払予定日６. Scheduled payment date 6.<p>
	 *
	 */
	public void pay_schd_dt6(MCDate value) {
		setConstDate(offset + 94, $pay_schd_dt6, value);
	}

	/**
	 * 支払予定額６. Payment schedule amount 6.<p>
	 *
	 */
	public MCNumber pay_schd_amt6() {
		return getConstNumber(offset + 95, $pay_schd_amt6);
	}

	/**
	 * 支払予定額６. Payment schedule amount 6.<p>
	 *
	 */
	public void pay_schd_amt6(MCNumber value) {
		setConstNumber(offset + 95, $pay_schd_amt6, value);
	}
	
	/**
	 * 支払予定額６. Payment schedule amount 6.<p>
	 *
	 */
	public void pay_schd_amt6(int value) {
		setConstNumber(offset + 95, $pay_schd_amt6, value);
	}
	
	/**
	 * 支払予定額６. Payment schedule amount 6.<p>
	 *
	 */
	public void pay_schd_amt6(long value) {
		setConstNumber(offset + 95, $pay_schd_amt6, value);
	}
	
	/**
	 * 支払予定額６. Payment schedule amount 6.<p>
	 *
	 */
	public void pay_schd_amt6(float value) {
		setConstNumber(offset + 95, $pay_schd_amt6, value);
	}
	
	/**
	 * 支払予定額６. Payment schedule amount 6.<p>
	 *
	 */
	public void pay_schd_amt6(double value) {
		setConstNumber(offset + 95, $pay_schd_amt6, value);
	}
	
	/**
	 * 支払方法ＣＤ６. Payment method cd. 6.<p>
	 *
	 */
	public String pay_mtd_cd6() {
		return getConstString(offset + 96, $pay_mtd_cd6);
	}

	/**
	 * 支払方法ＣＤ６. Payment method cd. 6.<p>
	 *
	 */
	public void pay_mtd_cd6(String value) {
		setConstString(offset + 96, $pay_mtd_cd6, value);
	}

	/**
	 * 支払予定日７. Scheduled payment date 7.<p>
	 *
	 */
	public MCDate pay_schd_dt7() {
		return getConstDate(offset + 97, $pay_schd_dt7);
	}

	/**
	 * 支払予定日７. Scheduled payment date 7.<p>
	 *
	 */
	public void pay_schd_dt7(MCDate value) {
		setConstDate(offset + 97, $pay_schd_dt7, value);
	}

	/**
	 * 支払予定額７. Payment schedule amount 7.<p>
	 *
	 */
	public MCNumber pay_schd_amt7() {
		return getConstNumber(offset + 98, $pay_schd_amt7);
	}

	/**
	 * 支払予定額７. Payment schedule amount 7.<p>
	 *
	 */
	public void pay_schd_amt7(MCNumber value) {
		setConstNumber(offset + 98, $pay_schd_amt7, value);
	}
	
	/**
	 * 支払予定額７. Payment schedule amount 7.<p>
	 *
	 */
	public void pay_schd_amt7(int value) {
		setConstNumber(offset + 98, $pay_schd_amt7, value);
	}
	
	/**
	 * 支払予定額７. Payment schedule amount 7.<p>
	 *
	 */
	public void pay_schd_amt7(long value) {
		setConstNumber(offset + 98, $pay_schd_amt7, value);
	}
	
	/**
	 * 支払予定額７. Payment schedule amount 7.<p>
	 *
	 */
	public void pay_schd_amt7(float value) {
		setConstNumber(offset + 98, $pay_schd_amt7, value);
	}
	
	/**
	 * 支払予定額７. Payment schedule amount 7.<p>
	 *
	 */
	public void pay_schd_amt7(double value) {
		setConstNumber(offset + 98, $pay_schd_amt7, value);
	}
	
	/**
	 * 支払方法ＣＤ７. Payment method cd. 7.<p>
	 *
	 */
	public String pay_mtd_cd7() {
		return getConstString(offset + 99, $pay_mtd_cd7);
	}

	/**
	 * 支払方法ＣＤ７. Payment method cd. 7.<p>
	 *
	 */
	public void pay_mtd_cd7(String value) {
		setConstString(offset + 99, $pay_mtd_cd7, value);
	}

	/**
	 * 支払予定日８. Scheduled payment date 8.<p>
	 *
	 */
	public MCDate pay_schd_dt8() {
		return getConstDate(offset + 100, $pay_schd_dt8);
	}

	/**
	 * 支払予定日８. Scheduled payment date 8.<p>
	 *
	 */
	public void pay_schd_dt8(MCDate value) {
		setConstDate(offset + 100, $pay_schd_dt8, value);
	}

	/**
	 * 支払予定額８. Payment schedule amount 8.<p>
	 *
	 */
	public MCNumber pay_schd_amt8() {
		return getConstNumber(offset + 101, $pay_schd_amt8);
	}

	/**
	 * 支払予定額８. Payment schedule amount 8.<p>
	 *
	 */
	public void pay_schd_amt8(MCNumber value) {
		setConstNumber(offset + 101, $pay_schd_amt8, value);
	}
	
	/**
	 * 支払予定額８. Payment schedule amount 8.<p>
	 *
	 */
	public void pay_schd_amt8(int value) {
		setConstNumber(offset + 101, $pay_schd_amt8, value);
	}
	
	/**
	 * 支払予定額８. Payment schedule amount 8.<p>
	 *
	 */
	public void pay_schd_amt8(long value) {
		setConstNumber(offset + 101, $pay_schd_amt8, value);
	}
	
	/**
	 * 支払予定額８. Payment schedule amount 8.<p>
	 *
	 */
	public void pay_schd_amt8(float value) {
		setConstNumber(offset + 101, $pay_schd_amt8, value);
	}
	
	/**
	 * 支払予定額８. Payment schedule amount 8.<p>
	 *
	 */
	public void pay_schd_amt8(double value) {
		setConstNumber(offset + 101, $pay_schd_amt8, value);
	}
	
	/**
	 * 支払方法ＣＤ８. Payment method cd. 8.<p>
	 *
	 */
	public String pay_mtd_cd8() {
		return getConstString(offset + 102, $pay_mtd_cd8);
	}

	/**
	 * 支払方法ＣＤ８. Payment method cd. 8.<p>
	 *
	 */
	public void pay_mtd_cd8(String value) {
		setConstString(offset + 102, $pay_mtd_cd8, value);
	}

	/**
	 * 支払予定日９. Scheduled payment date 9.<p>
	 *
	 */
	public MCDate pay_schd_dt9() {
		return getConstDate(offset + 103, $pay_schd_dt9);
	}

	/**
	 * 支払予定日９. Scheduled payment date 9.<p>
	 *
	 */
	public void pay_schd_dt9(MCDate value) {
		setConstDate(offset + 103, $pay_schd_dt9, value);
	}

	/**
	 * 支払予定額９. Payment schedule amount 9.<p>
	 *
	 */
	public MCNumber pay_schd_amt9() {
		return getConstNumber(offset + 104, $pay_schd_amt9);
	}

	/**
	 * 支払予定額９. Payment schedule amount 9.<p>
	 *
	 */
	public void pay_schd_amt9(MCNumber value) {
		setConstNumber(offset + 104, $pay_schd_amt9, value);
	}
	
	/**
	 * 支払予定額９. Payment schedule amount 9.<p>
	 *
	 */
	public void pay_schd_amt9(int value) {
		setConstNumber(offset + 104, $pay_schd_amt9, value);
	}
	
	/**
	 * 支払予定額９. Payment schedule amount 9.<p>
	 *
	 */
	public void pay_schd_amt9(long value) {
		setConstNumber(offset + 104, $pay_schd_amt9, value);
	}
	
	/**
	 * 支払予定額９. Payment schedule amount 9.<p>
	 *
	 */
	public void pay_schd_amt9(float value) {
		setConstNumber(offset + 104, $pay_schd_amt9, value);
	}
	
	/**
	 * 支払予定額９. Payment schedule amount 9.<p>
	 *
	 */
	public void pay_schd_amt9(double value) {
		setConstNumber(offset + 104, $pay_schd_amt9, value);
	}
	
	/**
	 * 支払方法ＣＤ９. Payment method cd. 9.<p>
	 *
	 */
	public String pay_mtd_cd9() {
		return getConstString(offset + 105, $pay_mtd_cd9);
	}

	/**
	 * 支払方法ＣＤ９. Payment method cd. 9.<p>
	 *
	 */
	public void pay_mtd_cd9(String value) {
		setConstString(offset + 105, $pay_mtd_cd9, value);
	}

	/**
	 * 支払予定日１０. Scheduled payment date 10.<p>
	 *
	 */
	public MCDate pay_schd_dt10() {
		return getConstDate(offset + 106, $pay_schd_dt10);
	}

	/**
	 * 支払予定日１０. Scheduled payment date 10.<p>
	 *
	 */
	public void pay_schd_dt10(MCDate value) {
		setConstDate(offset + 106, $pay_schd_dt10, value);
	}

	/**
	 * 支払予定額１０. Payment schedule amount 10.<p>
	 *
	 */
	public MCNumber pay_schd_amt10() {
		return getConstNumber(offset + 107, $pay_schd_amt10);
	}

	/**
	 * 支払予定額１０. Payment schedule amount 10.<p>
	 *
	 */
	public void pay_schd_amt10(MCNumber value) {
		setConstNumber(offset + 107, $pay_schd_amt10, value);
	}
	
	/**
	 * 支払予定額１０. Payment schedule amount 10.<p>
	 *
	 */
	public void pay_schd_amt10(int value) {
		setConstNumber(offset + 107, $pay_schd_amt10, value);
	}
	
	/**
	 * 支払予定額１０. Payment schedule amount 10.<p>
	 *
	 */
	public void pay_schd_amt10(long value) {
		setConstNumber(offset + 107, $pay_schd_amt10, value);
	}
	
	/**
	 * 支払予定額１０. Payment schedule amount 10.<p>
	 *
	 */
	public void pay_schd_amt10(float value) {
		setConstNumber(offset + 107, $pay_schd_amt10, value);
	}
	
	/**
	 * 支払予定額１０. Payment schedule amount 10.<p>
	 *
	 */
	public void pay_schd_amt10(double value) {
		setConstNumber(offset + 107, $pay_schd_amt10, value);
	}
	
	/**
	 * 支払方法ＣＤ１０. Payment method cd. 10.<p>
	 *
	 */
	public String pay_mtd_cd10() {
		return getConstString(offset + 108, $pay_mtd_cd10);
	}

	/**
	 * 支払方法ＣＤ１０. Payment method cd. 10.<p>
	 *
	 */
	public void pay_mtd_cd10(String value) {
		setConstString(offset + 108, $pay_mtd_cd10, value);
	}

	/**
	 * 口座ＣＤ. Bank account cd..<p>
	 *
	 */
	public String bank_ac_cd() {
		return getConstString(offset + 109, $bank_ac_cd);
	}

	/**
	 * 口座ＣＤ. Bank account cd..<p>
	 *
	 */
	public void bank_ac_cd(String value) {
		setConstString(offset + 109, $bank_ac_cd, value);
	}

	/**
	 * 請求書宛先. Invoice destination.<p>
	 *
	 */
	public String bill_bcst_nm() {
		return getConstString(offset + 110, $bill_bcst_nm);
	}

	/**
	 * 請求書宛先. Invoice destination.<p>
	 *
	 */
	public void bill_bcst_nm(String value) {
		setConstString(offset + 110, $bill_bcst_nm, value);
	}

	/**
	 * 請求書送付法人番号. Invoice send-to corporation No..<p>
	 *
	 */
	public String bill_ein() {
		return getConstString(offset + 111, $bill_ein);
	}

	/**
	 * 請求書送付法人番号. Invoice send-to corporation No..<p>
	 *
	 */
	public void bill_ein(String value) {
		setConstString(offset + 111, $bill_ein, value);
	}

	/**
	 * 請求書送付事業者ＮＯ. Invoice send-to business No..<p>
	 *
	 */
	public String bill_biz_co_no() {
		return getConstString(offset + 112, $bill_biz_co_no);
	}

	/**
	 * 請求書送付事業者ＮＯ. Invoice send-to business No..<p>
	 *
	 */
	public void bill_biz_co_no(String value) {
		setConstString(offset + 112, $bill_biz_co_no, value);
	}

	/**
	 * 請求書送付郵便番号. Invoice send-to zip code.<p>
	 *
	 */
	public String bill_zip_cd() {
		return getConstString(offset + 113, $bill_zip_cd);
	}

	/**
	 * 請求書送付郵便番号. Invoice send-to zip code.<p>
	 *
	 */
	public void bill_zip_cd(String value) {
		setConstString(offset + 113, $bill_zip_cd, value);
	}

	/**
	 * 請求書送付住所１. Invoice send-to address 1.<p>
	 *
	 */
	public String bill_addr1() {
		return getConstString(offset + 114, $bill_addr1);
	}

	/**
	 * 請求書送付住所１. Invoice send-to address 1.<p>
	 *
	 */
	public void bill_addr1(String value) {
		setConstString(offset + 114, $bill_addr1, value);
	}

	/**
	 * 請求書送付住所２. Invoice send-to address 2.<p>
	 *
	 */
	public String bill_addr2() {
		return getConstString(offset + 115, $bill_addr2);
	}

	/**
	 * 請求書送付住所２. Invoice send-to address 2.<p>
	 *
	 */
	public void bill_addr2(String value) {
		setConstString(offset + 115, $bill_addr2, value);
	}

	/**
	 * 請求書送付住所３. Invoice send-to address 3.<p>
	 *
	 */
	public String bill_addr3() {
		return getConstString(offset + 116, $bill_addr3);
	}

	/**
	 * 請求書送付住所３. Invoice send-to address 3.<p>
	 *
	 */
	public void bill_addr3(String value) {
		setConstString(offset + 116, $bill_addr3, value);
	}

	/**
	 * 請求書送付住所４. Invoice send-to address 4.<p>
	 *
	 */
	public String bill_addr4() {
		return getConstString(offset + 117, $bill_addr4);
	}

	/**
	 * 請求書送付住所４. Invoice send-to address 4.<p>
	 *
	 */
	public void bill_addr4(String value) {
		setConstString(offset + 117, $bill_addr4, value);
	}

	/**
	 * 請求書送付部署. Invoice send-to dept..<p>
	 *
	 */
	public String bill_bcst_dpt() {
		return getConstString(offset + 118, $bill_bcst_dpt);
	}

	/**
	 * 請求書送付部署. Invoice send-to dept..<p>
	 *
	 */
	public void bill_bcst_dpt(String value) {
		setConstString(offset + 118, $bill_bcst_dpt, value);
	}

	/**
	 * 請求書送付ＴＥＬ. Invoice send-to TEL.<p>
	 *
	 */
	public String bill_tel() {
		return getConstString(offset + 119, $bill_tel);
	}

	/**
	 * 請求書送付ＴＥＬ. Invoice send-to TEL.<p>
	 *
	 */
	public void bill_tel(String value) {
		setConstString(offset + 119, $bill_tel, value);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 120, $ins_usr_id);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 120, $ins_usr_id, value);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 121, $ins_usr_nm);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 121, $ins_usr_nm, value);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 122, $ins_ts);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 122, $ins_ts, value);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 123, $ins_func_id);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 123, $ins_func_id, value);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 124, $upd_cntr);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 124, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 124, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 124, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 124, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 124, $upd_cntr, value);
	}
	
	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 125, $upd_usr_id);
	}

	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 125, $upd_usr_id, value);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 126, $upd_usr_nm);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 126, $upd_usr_nm, value);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 127, $upd_ts);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 127, $upd_ts, value);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 128, $upd_func_id);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 128, $upd_func_id, value);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 129, $upd_srv_req_no);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 129, $upd_srv_req_no, value);
	}

	public String getString(String name) {
		if ($bill_rcpt_no.equalsIgnoreCase(name)) {
			return bill_rcpt_no();
		}
		if ($bill_no.equalsIgnoreCase(name)) {
			return bill_no();
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
		if ($pay_mtd_cd1.equalsIgnoreCase(name)) {
			return pay_mtd_cd1();
		}
		if ($pay_mtd_cd2.equalsIgnoreCase(name)) {
			return pay_mtd_cd2();
		}
		if ($pay_mtd_cd3.equalsIgnoreCase(name)) {
			return pay_mtd_cd3();
		}
		if ($pay_mtd_cd4.equalsIgnoreCase(name)) {
			return pay_mtd_cd4();
		}
		if ($pay_mtd_cd5.equalsIgnoreCase(name)) {
			return pay_mtd_cd5();
		}
		if ($pay_mtd_cd6.equalsIgnoreCase(name)) {
			return pay_mtd_cd6();
		}
		if ($pay_mtd_cd7.equalsIgnoreCase(name)) {
			return pay_mtd_cd7();
		}
		if ($pay_mtd_cd8.equalsIgnoreCase(name)) {
			return pay_mtd_cd8();
		}
		if ($pay_mtd_cd9.equalsIgnoreCase(name)) {
			return pay_mtd_cd9();
		}
		if ($pay_mtd_cd10.equalsIgnoreCase(name)) {
			return pay_mtd_cd10();
		}
		if ($bank_ac_cd.equalsIgnoreCase(name)) {
			return bank_ac_cd();
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
		if ($invalid_flg.equalsIgnoreCase(name)) {
			return invalid_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($bill_rcpt_no.equalsIgnoreCase(name)) {
			return bill_rcpt_no();
		}
		if ($bill_no.equalsIgnoreCase(name)) {
			return bill_no();
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
		if ($pay_mtd_cd1.equalsIgnoreCase(name)) {
			return pay_mtd_cd1();
		}
		if ($pay_mtd_cd2.equalsIgnoreCase(name)) {
			return pay_mtd_cd2();
		}
		if ($pay_mtd_cd3.equalsIgnoreCase(name)) {
			return pay_mtd_cd3();
		}
		if ($pay_mtd_cd4.equalsIgnoreCase(name)) {
			return pay_mtd_cd4();
		}
		if ($pay_mtd_cd5.equalsIgnoreCase(name)) {
			return pay_mtd_cd5();
		}
		if ($pay_mtd_cd6.equalsIgnoreCase(name)) {
			return pay_mtd_cd6();
		}
		if ($pay_mtd_cd7.equalsIgnoreCase(name)) {
			return pay_mtd_cd7();
		}
		if ($pay_mtd_cd8.equalsIgnoreCase(name)) {
			return pay_mtd_cd8();
		}
		if ($pay_mtd_cd9.equalsIgnoreCase(name)) {
			return pay_mtd_cd9();
		}
		if ($pay_mtd_cd10.equalsIgnoreCase(name)) {
			return pay_mtd_cd10();
		}
		if ($bank_ac_cd.equalsIgnoreCase(name)) {
			return bank_ac_cd();
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
		if ($invalid_flg.equalsIgnoreCase(name)) {
			return invalid_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($bill_rcpt_no.equalsIgnoreCase(name)) {
			bill_rcpt_no(value);
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
		if ($pay_mtd_cd1.equalsIgnoreCase(name)) {
			pay_mtd_cd1(value);
			return;
		}
		if ($pay_mtd_cd2.equalsIgnoreCase(name)) {
			pay_mtd_cd2(value);
			return;
		}
		if ($pay_mtd_cd3.equalsIgnoreCase(name)) {
			pay_mtd_cd3(value);
			return;
		}
		if ($pay_mtd_cd4.equalsIgnoreCase(name)) {
			pay_mtd_cd4(value);
			return;
		}
		if ($pay_mtd_cd5.equalsIgnoreCase(name)) {
			pay_mtd_cd5(value);
			return;
		}
		if ($pay_mtd_cd6.equalsIgnoreCase(name)) {
			pay_mtd_cd6(value);
			return;
		}
		if ($pay_mtd_cd7.equalsIgnoreCase(name)) {
			pay_mtd_cd7(value);
			return;
		}
		if ($pay_mtd_cd8.equalsIgnoreCase(name)) {
			pay_mtd_cd8(value);
			return;
		}
		if ($pay_mtd_cd9.equalsIgnoreCase(name)) {
			pay_mtd_cd9(value);
			return;
		}
		if ($pay_mtd_cd10.equalsIgnoreCase(name)) {
			pay_mtd_cd10(value);
			return;
		}
		if ($bank_ac_cd.equalsIgnoreCase(name)) {
			bank_ac_cd(value);
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
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, int value) {
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
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, long value) {
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
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, float value) {
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
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, double value) {
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
		if ($invalid_flg.equalsIgnoreCase(name)) {
			invalid_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($bill_rcpt_no.equalsIgnoreCase(name)) {
			bill_rcpt_no(value);
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
		if ($pay_mtd_cd1.equalsIgnoreCase(name)) {
			pay_mtd_cd1(value);
			return;
		}
		if ($pay_mtd_cd2.equalsIgnoreCase(name)) {
			pay_mtd_cd2(value);
			return;
		}
		if ($pay_mtd_cd3.equalsIgnoreCase(name)) {
			pay_mtd_cd3(value);
			return;
		}
		if ($pay_mtd_cd4.equalsIgnoreCase(name)) {
			pay_mtd_cd4(value);
			return;
		}
		if ($pay_mtd_cd5.equalsIgnoreCase(name)) {
			pay_mtd_cd5(value);
			return;
		}
		if ($pay_mtd_cd6.equalsIgnoreCase(name)) {
			pay_mtd_cd6(value);
			return;
		}
		if ($pay_mtd_cd7.equalsIgnoreCase(name)) {
			pay_mtd_cd7(value);
			return;
		}
		if ($pay_mtd_cd8.equalsIgnoreCase(name)) {
			pay_mtd_cd8(value);
			return;
		}
		if ($pay_mtd_cd9.equalsIgnoreCase(name)) {
			pay_mtd_cd9(value);
			return;
		}
		if ($pay_mtd_cd10.equalsIgnoreCase(name)) {
			pay_mtd_cd10(value);
			return;
		}
		if ($bank_ac_cd.equalsIgnoreCase(name)) {
			bank_ac_cd(value);
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
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, int value) {
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
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, long value) {
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
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, float value) {
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
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, double value) {
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
		if ($invalid_flg.equalsIgnoreCase(name)) {
			invalid_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

}
