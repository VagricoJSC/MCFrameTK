package mcframe.serverMA.dbc;

import static mcframe.serverCore.queryapi.IFMCSQL.*;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import mcframe.commonCore.container.MCExtMap;
import mcframe.commonCore.container.MCRow;
import mcframe.commonCore.lang.MCNumber;
import mcframe.serverCore.queryapi.IFMCSQL.MCStringPermColumn;
import mcframe.serverCore.queryapi.IFMCSQL.MCNumberPermColumn;
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
 * "会社マスタ // Company master"DBコンテナRowクラスです。<p>
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
 *  	<td>co_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>会社ＣＤ</td>
 *  	<td>Company cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>co_alt_nm1</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>会社別名１</td>
 *  	<td>Company alias 1</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>base_co_alt_nm1</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>会社別名１（ベース）</td>
 *  	<td>Company alias 1(Base)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>co_alt_nm2</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>会社別名２</td>
 *  	<td>Company alias 2</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>base_co_alt_nm2</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>会社別名２（ベース）</td>
 *  	<td>Company alias 2(Base)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>co_alt_nm3</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>会社別名３</td>
 *  	<td>Company alias 3</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>base_co_alt_nm3</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>会社別名３（ベース）</td>
 *  	<td>Company alias 3(Base)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>co_alt_nm4</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>会社別名４</td>
 *  	<td>Company alias 4</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>base_co_alt_nm4</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>会社別名４（ベース）</td>
 *  	<td>Company alias 4(Base)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>zip_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>郵便番号</td>
 *  	<td>Zip code</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>base_zip_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>郵便番号（ベース）</td>
 *  	<td>Zip code(Base)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>addr1</td>
 *  	<td>C</td>
 *  	<td>250</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>住所１</td>
 *  	<td>Address 1</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>base_addr1</td>
 *  	<td>C</td>
 *  	<td>250</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>住所１（ベース）</td>
 *  	<td>Address 1(Base)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>addr2</td>
 *  	<td>C</td>
 *  	<td>250</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>住所２</td>
 *  	<td>Address 2</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>base_addr2</td>
 *  	<td>C</td>
 *  	<td>250</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>住所２（ベース）</td>
 *  	<td>Address 2(Base)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>addr3</td>
 *  	<td>C</td>
 *  	<td>250</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>住所３</td>
 *  	<td>Address 3</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>base_addr3</td>
 *  	<td>C</td>
 *  	<td>250</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>住所３（ベース）</td>
 *  	<td>Address 3(Base)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>addr4</td>
 *  	<td>C</td>
 *  	<td>250</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>住所４</td>
 *  	<td>Address 4</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>base_addr4</td>
 *  	<td>C</td>
 *  	<td>250</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>住所４（ベース）</td>
 *  	<td>Address 4(Base)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>tel</td>
 *  	<td>C</td>
 *  	<td>30</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＴＥＬ</td>
 *  	<td>TEL</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>base_tel</td>
 *  	<td>C</td>
 *  	<td>30</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＴＥＬ（ベース）</td>
 *  	<td>TEL(Base)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>fax</td>
 *  	<td>C</td>
 *  	<td>30</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＦＡＸ</td>
 *  	<td>FAX</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>base_fax</td>
 *  	<td>C</td>
 *  	<td>30</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＦＡＸ（ベース）</td>
 *  	<td>FAX(Base)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>co_repl_nm</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>代表者名</td>
 *  	<td>Representative name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>base_co_repl_nm</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>代表者名（ベース）</td>
 *  	<td>Representative name(Base)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ein</td>
 *  	<td>C</td>
 *  	<td>13</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>法人番号</td>
 *  	<td>Corporation number</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>biz_co_no</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>事業者ＮＯ</td>
 *  	<td>Business No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>std_co_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>標準企業コード</td>
 *  	<td>Standard company code</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>cntry_cd</td>
 *  	<td>C</td>
 *  	<td>2</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>国ＣＤ</td>
 *  	<td>Country cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>area_cd</td>
 *  	<td>C</td>
 *  	<td>3</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>地域ＣＤ</td>
 *  	<td>Region cd.</td>
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
 *  	<td>ptax_cur_cd</td>
 *  	<td>C</td>
 *  	<td>3</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>納税通貨ＣＤ</td>
 *  	<td>Taxpaying currency cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>st_mon</td>
 *  	<td>N</td>
 *  	<td>2,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>期首年月</td>
 *  	<td>Beginning year</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ac_cl_day</td>
 *  	<td>N</td>
 *  	<td>2,0</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>会計締日</td>
 *  	<td>Accounting closing day</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ac_cl_mon_base</td>
 *  	<td>N</td>
 *  	<td>1,0</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>会計月度基準</td>
 *  	<td>Accounting month basis</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>dt_switch_time</td>
 *  	<td>N</td>
 *  	<td>2,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>日付切替時間</td>
 *  	<td>Date switching time</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ar_no_use_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>債権不使用ＦＬＧ</td>
 *  	<td>AR not use flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ap_no_use_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>債務不使用ＦＬＧ</td>
 *  	<td>AP not used flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>temp_ap_use_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>暫定買掛使用ＦＬＧ</td>
 *  	<td>Temporary AP use flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>std_cal_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>標準カレンダＣＤ</td>
 *  	<td>Standard calendar cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>bill_cl_cal_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>請求締カレンダＣＤ</td>
 *  	<td>Billing closing calendar cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>pay_schd_cl_cal_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>支払予定締カレンダＣＤ</td>
 *  	<td>Payment schedule closing calendar cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sls_cl_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>売上締ＦＬＧ</td>
 *  	<td>Sales closing flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>rcv_cl_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>入金締ＦＬＧ</td>
 *  	<td>Payment received closing flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>purc_cl_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>仕入締ＦＬＧ</td>
 *  	<td>Purchase closing flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>pay_cl_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>支払締ＦＬＧ</td>
 *  	<td>Payment closing flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sls_cl_cal_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>売上締カレンダＣＤ</td>
 *  	<td>Sales closing calendar cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>rcv_cl_cal_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>入金締カレンダＣＤ</td>
 *  	<td>Payment received closing calendar cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>purc_cl_cal_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>仕入締カレンダＣＤ</td>
 *  	<td>Purchase closing calendar cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>pay_cl_cal_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>支払締カレンダＣＤ</td>
 *  	<td>Payment closing calendar cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>stk_cl_cal_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>在庫締カレンダＣＤ</td>
 *  	<td>Inventory closing calendar cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sls_cl_delay_days</td>
 *  	<td>N</td>
 *  	<td>2,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>売上締日遅延日数</td>
 *  	<td>Delay days (Sales closing day)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sls_cl_ba_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>売上締日前後区分</td>
 *  	<td>Sales closing day before/after type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>rcv_cl_delay_days</td>
 *  	<td>N</td>
 *  	<td>2,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>入金締日遅延日数</td>
 *  	<td>Delayed days (Payment received closing day)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>rcv_cl_ba_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>入金締日前後区分</td>
 *  	<td>Payment received closing day before/after type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>purc_cl_delay_days</td>
 *  	<td>N</td>
 *  	<td>2,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>仕入締日遅延日数</td>
 *  	<td>Delay days (Purchase closing day)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>purc_cl_ba_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>仕入締日前後区分</td>
 *  	<td>Purchase closing day before/after type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>pay_cl_delay_days</td>
 *  	<td>N</td>
 *  	<td>2,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>支払締日遅延日数</td>
 *  	<td>Delay days (Payment closing day)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>pay_cl_ba_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>支払締日前後区分</td>
 *  	<td>Payment closing day before/after type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>stk_cl_delay_days</td>
 *  	<td>N</td>
 *  	<td>2,0</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>在庫締日遅延日数</td>
 *  	<td>Delay days (Inventory closing day)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>stk_cl_ba_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>在庫締日前後区分</td>
 *  	<td>Inventory closing day before/after type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sls_xrate_cd</td>
 *  	<td>C</td>
 *  	<td>2</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>売上為替レートＣＤ</td>
 *  	<td>Sales exchange rate cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>purc_xrate_cd</td>
 *  	<td>C</td>
 *  	<td>2</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>仕入為替レートＣＤ</td>
 *  	<td>Purchase exchange rate cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>prov_xrate_cd</td>
 *  	<td>C</td>
 *  	<td>2</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>支給為替レートＣＤ</td>
 *  	<td>Supply exchange rate cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>bill_xrate_conv_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>請求時為替レート換算ＦＬＧ</td>
 *  	<td>Convert at exchange rate upon billing flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>bill_xrate_cd</td>
 *  	<td>C</td>
 *  	<td>2</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>請求為替レートＣＤ</td>
 *  	<td>Billing exchange rate cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>pay_xrate_conv_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>支払照合時為替レート換算ＦＬＧ</td>
 *  	<td>Convert at exchange rate upon payment collation flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>pay_xrate_cd</td>
 *  	<td>C</td>
 *  	<td>2</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>支払照合為替レートＣＤ</td>
 *  	<td>Payment collation exchange rate cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>mon01_xrate_rev_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>１月為替レート評価替ＦＬＧ</td>
 *  	<td>Exchange rate revaluation flg. in January</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>mon02_xrate_rev_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>２月為替レート評価替ＦＬＧ</td>
 *  	<td>Exchange rate revaluation flg. in February</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>mon03_xrate_rev_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>３月為替レート評価替ＦＬＧ</td>
 *  	<td>Exchange rate revaluation flg. in March</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>mon04_xrate_rev_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>４月為替レート評価替ＦＬＧ</td>
 *  	<td>Exchange rate revaluation flg. in April</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>mon05_xrate_rev_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>５月為替レート評価替ＦＬＧ</td>
 *  	<td>Exchange rate revaluation flg. in May</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>mon06_xrate_rev_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>６月為替レート評価替ＦＬＧ</td>
 *  	<td>Exchange rate revaluation flg. in June</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>mon07_xrate_rev_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>７月為替レート評価替ＦＬＧ</td>
 *  	<td>Exchange rate revaluation flg. in July</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>mon08_xrate_rev_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>８月為替レート評価替ＦＬＧ</td>
 *  	<td>Exchange rate revaluation flg. in August</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>mon09_xrate_rev_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>９月為替レート評価替ＦＬＧ</td>
 *  	<td>Exchange rate revaluation flg. in September</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>mon10_xrate_rev_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>１０月為替レート評価替ＦＬＧ</td>
 *  	<td>Exchange rate revaluation flg. in October</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>mon11_xrate_rev_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>１１月為替レート評価替ＦＬＧ</td>
 *  	<td>Exchange rate revaluation flg. in November</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>mon12_xrate_rev_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>１２月為替レート評価替ＦＬＧ</td>
 *  	<td>Exchange rate revaluation flg. in December</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sls_upri_req_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>販売単価取得区分</td>
 *  	<td>Sales unit price acquisition type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>purc_upri_req_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>購買単価取得区分</td>
 *  	<td>Purchase unit price acquisition type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>outsrc_upri_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>外注単価区分</td>
 *  	<td>Subcontracting unit price type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sls_basis_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>売上計上区分</td>
 *  	<td>Revenue recording type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>bill_basis_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>請求起算区分</td>
 *  	<td>Billing initial base type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ship_schd_split_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>出荷予定分割区分</td>
 *  	<td>Shipping schedule split type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>xfr_stk_mng_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>積送在庫管轄先区分</td>
 *  	<td>In-transit inventory controlled site type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>setoff_tax_rnd_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>相殺税額端数処理区分</td>
 *  	<td>Offset tax rounding type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>xrate_rnd_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>為替端数処理区分</td>
 *  	<td>Exchange rounding type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>com_paid_tax_rnd_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>支払手数料税額端数処理区分</td>
 *  	<td>Rounding type (Payment fee tax)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>wtax_rnd_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>源泉税額端数処理区分</td>
 *  	<td>Withholding tax rounding type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>stk_amt_rnd_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>在庫金額端数処理区分</td>
 *  	<td>Inventory amount rounding type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>stk_amt_dec_place</td>
 *  	<td>N</td>
 *  	<td>2,0</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>在庫金額小数部有効桁数</td>
 *  	<td>Inventory amount number of decimal places</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sls_bdj_rnd_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>販売予算単位区分</td>
 *  	<td>Sales budget unit type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>po_print_cd</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>注文書表示ＣＤ</td>
 *  	<td>Display PO sheet cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>stk_lst_cnf_num</td>
 *  	<td>N</td>
 *  	<td>4,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>現品票確認枚数</td>
 *  	<td>Checked number of identification tags</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>stk_lst_limit_num</td>
 *  	<td>N</td>
 *  	<td>4,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>現品票印刷上限枚数</td>
 *  	<td>Maximum number of identification tag printing</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>gm_std_upri_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>標準単価取得区分（粗利計算用）</td>
 *  	<td>Standard unit cost acquisition type (For gross profit calculation)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>stk_std_upri_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>標準単価取得区分（在庫評価用）</td>
 *  	<td>Standard unit cost acquisition type (For inventory valuation)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ac_slip_digit</td>
 *  	<td>N</td>
 *  	<td>2,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>仕訳伝票ＮＯ桁数</td>
 *  	<td>Journal slip No. digits</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ac_slip_seq_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>貸借明細番号ＦＬＧ</td>
 *  	<td>Debit credit details number flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>cst_prnt_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>帳票発行区分（得意先）</td>
 *  	<td>Slip issue type (Customer)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>acst_prnt_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>帳票発行区分（売掛先）</td>
 *  	<td>Slip issue type (AR customer)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>bcst_prnt_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>帳票発行区分（請求先）</td>
 *  	<td>Slip issue type (Billing customer)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>rcst_prnt_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>帳票発行区分（入金先）</td>
 *  	<td>Slip issue type (Payer)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sppl_prnt_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>帳票発行区分（発注先）</td>
 *  	<td>Slip issue type (Supplier)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>asppl_prnt_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>帳票発行区分（買掛先）</td>
 *  	<td>Slip issue type (AP supplier)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>bsppl_prnt_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>帳票発行区分（支払予定管理先）</td>
 *  	<td>Slip issue type (Scheduled payee)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>psppl_prnt_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>帳票発行区分（支払先）</td>
 *  	<td>Slip issue type (Payee)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>dlv_prnt_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>帳票発行区分（納品先）</td>
 *  	<td>Slip issue type (Delivery destination)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>rpt_strg_ext_sys_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>帳票保存システムＣＤ</td>
 *  	<td>Report storage external system cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>memo1</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>メモ１</td>
 *  	<td>Memo 1</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>memo2</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>メモ２</td>
 *  	<td>Memo 2</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>memo3</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>メモ３</td>
 *  	<td>Memo 3</td>
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
 *  	<td>early_ship_dt_add_days</td>
 *  	<td>N</td>
 *  	<td>3,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>最早出荷日加算日数</td>
 *  	<td>Number of days added to earliest shipping date</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>co_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td>CO1.CO_NM</td>
 *  	<td>会社名</td>
 *  	<td>Company name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>cntry_nm</td>
 *  	<td>C</td>
 *  	<td>60</td>
 *  	<td>Y</td>
 *  	<td>CNTRY1.CNTRY_NM</td>
 *  	<td>国名</td>
 *  	<td>Country name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>area_nm</td>
 *  	<td>C</td>
 *  	<td>60</td>
 *  	<td>Y</td>
 *  	<td>AREA1.AREA_NM</td>
 *  	<td>地域名</td>
 *  	<td>Region name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>base_cur_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td>CUR1.CUR_NM</td>
 *  	<td>基準通貨名</td>
 *  	<td>Base currency name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ptax_cur_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td>CUR2.CUR_NM</td>
 *  	<td>納税通貨名</td>
 *  	<td>Tax currency name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>std_cal_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td>CAL_BASE1.CAL_NM</td>
 *  	<td>標準カレンダ名</td>
 *  	<td>Standard calendar name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sls_cl_cal_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td>CAL_BASE2.CAL_NM</td>
 *  	<td>売上締カレンダ名</td>
 *  	<td>Sales closing calendar name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>bill_cl_cal_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td>CAL_BASE3.CAL_NM</td>
 *  	<td>請求締カレンダ名</td>
 *  	<td>Billing closing calendar name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>rcv_cl_cal_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td>CAL_BASE4.CAL_NM</td>
 *  	<td>入金締カレンダ名</td>
 *  	<td>Payment received closing calendar name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>purc_cl_cal_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td>CAL_BASE5.CAL_NM</td>
 *  	<td>仕入締カレンダ名</td>
 *  	<td>Purchase closing calendar name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>pay_cl_cal_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td>CAL_BASE6.CAL_NM</td>
 *  	<td>支払締カレンダ名</td>
 *  	<td>Payment closing calendar name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>stk_cl_cal_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td>CAL_BASE7.CAL_NM</td>
 *  	<td>在庫締カレンダ名</td>
 *  	<td>Inventory closing calendar name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sls_xrate_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td>XRATE1.XRATE_NM</td>
 *  	<td>売上為替レート名</td>
 *  	<td>Sales exchange rate name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>purc_xrate_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td>XRATE2.XRATE_NM</td>
 *  	<td>仕入為替レート名</td>
 *  	<td>Purchase exchange rate name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>prov_xrate_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td>XRATE3.XRATE_NM</td>
 *  	<td>支給為替レート名</td>
 *  	<td>Supply exchange rate name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>pay_xrate_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td>XRATE4.XRATE_NM</td>
 *  	<td>支払照合為替レート名</td>
 *  	<td>Payment collation exchange rate name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>bill_xrate_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td>XRATE5.XRATE_NM</td>
 *  	<td>請求為替レート名</td>
 *  	<td>Billing exchange rate name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>po_print_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td>PO_PRINT1.PO_PRINT_NM</td>
 *  	<td>注文書表示名</td>
 *  	<td>Display PO sheet name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>pay_schd_cl_cal_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td>CAL_BASE8.CAL_NM</td>
 *  	<td>支払予定締カレンダ名</td>
 *  	<td>Payment schedule closing calendar name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>rpt_strg_ext_sys_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td>EXT_SYS1.EXT_SYS_NM</td>
 *  	<td>帳票保存システム名</td>
 *  	<td>Report storage external system name</td>
 *  </tr>
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
public class MAM_CO_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.CO_VIEW;

	public static final String TABLE_NAME = "MAM_CO";

	public static final boolean EX_CTRL = true;
	
	public static final boolean LCL_TABLE = false;
	
	/**
	 * 会社ＣＤ. Company cd..<p>
	 *
	 */
	public static final String $co_cd = "co_cd";
	private static final MCPermColumnInfo _co_cd = createColumnInfo("co_cd");
	public final MCStringPermColumn co_cd = createStringColumn(_co_cd);
	
	/**
	 * 会社別名１. Company alias 1.<p>
	 *
	 */
	public static final String $co_alt_nm1 = "co_alt_nm1";
	private static final MCPermColumnInfo _co_alt_nm1 = createColumnInfo("co_alt_nm1");
	public final MCStringPermColumn co_alt_nm1 = createStringColumn(_co_alt_nm1);
	
	/**
	 * 会社別名１（ベース）. Company alias 1(Base).<p>
	 *
	 */
	public static final String $base_co_alt_nm1 = "base_co_alt_nm1";
	private static final MCPermColumnInfo _base_co_alt_nm1 = createColumnInfo("base_co_alt_nm1");
	public final MCStringPermColumn base_co_alt_nm1 = createStringColumn(_base_co_alt_nm1);
	
	/**
	 * 会社別名２. Company alias 2.<p>
	 *
	 */
	public static final String $co_alt_nm2 = "co_alt_nm2";
	private static final MCPermColumnInfo _co_alt_nm2 = createColumnInfo("co_alt_nm2");
	public final MCStringPermColumn co_alt_nm2 = createStringColumn(_co_alt_nm2);
	
	/**
	 * 会社別名２（ベース）. Company alias 2(Base).<p>
	 *
	 */
	public static final String $base_co_alt_nm2 = "base_co_alt_nm2";
	private static final MCPermColumnInfo _base_co_alt_nm2 = createColumnInfo("base_co_alt_nm2");
	public final MCStringPermColumn base_co_alt_nm2 = createStringColumn(_base_co_alt_nm2);
	
	/**
	 * 会社別名３. Company alias 3.<p>
	 *
	 */
	public static final String $co_alt_nm3 = "co_alt_nm3";
	private static final MCPermColumnInfo _co_alt_nm3 = createColumnInfo("co_alt_nm3");
	public final MCStringPermColumn co_alt_nm3 = createStringColumn(_co_alt_nm3);
	
	/**
	 * 会社別名３（ベース）. Company alias 3(Base).<p>
	 *
	 */
	public static final String $base_co_alt_nm3 = "base_co_alt_nm3";
	private static final MCPermColumnInfo _base_co_alt_nm3 = createColumnInfo("base_co_alt_nm3");
	public final MCStringPermColumn base_co_alt_nm3 = createStringColumn(_base_co_alt_nm3);
	
	/**
	 * 会社別名４. Company alias 4.<p>
	 *
	 */
	public static final String $co_alt_nm4 = "co_alt_nm4";
	private static final MCPermColumnInfo _co_alt_nm4 = createColumnInfo("co_alt_nm4");
	public final MCStringPermColumn co_alt_nm4 = createStringColumn(_co_alt_nm4);
	
	/**
	 * 会社別名４（ベース）. Company alias 4(Base).<p>
	 *
	 */
	public static final String $base_co_alt_nm4 = "base_co_alt_nm4";
	private static final MCPermColumnInfo _base_co_alt_nm4 = createColumnInfo("base_co_alt_nm4");
	public final MCStringPermColumn base_co_alt_nm4 = createStringColumn(_base_co_alt_nm4);
	
	/**
	 * 郵便番号. Zip code.<p>
	 *
	 */
	public static final String $zip_cd = "zip_cd";
	private static final MCPermColumnInfo _zip_cd = createColumnInfo("zip_cd");
	public final MCStringPermColumn zip_cd = createStringColumn(_zip_cd);
	
	/**
	 * 郵便番号（ベース）. Zip code(Base).<p>
	 *
	 */
	public static final String $base_zip_cd = "base_zip_cd";
	private static final MCPermColumnInfo _base_zip_cd = createColumnInfo("base_zip_cd");
	public final MCStringPermColumn base_zip_cd = createStringColumn(_base_zip_cd);
	
	/**
	 * 住所１. Address 1.<p>
	 *
	 */
	public static final String $addr1 = "addr1";
	private static final MCPermColumnInfo _addr1 = createColumnInfo("addr1");
	public final MCStringPermColumn addr1 = createStringColumn(_addr1);
	
	/**
	 * 住所１（ベース）. Address 1(Base).<p>
	 *
	 */
	public static final String $base_addr1 = "base_addr1";
	private static final MCPermColumnInfo _base_addr1 = createColumnInfo("base_addr1");
	public final MCStringPermColumn base_addr1 = createStringColumn(_base_addr1);
	
	/**
	 * 住所２. Address 2.<p>
	 *
	 */
	public static final String $addr2 = "addr2";
	private static final MCPermColumnInfo _addr2 = createColumnInfo("addr2");
	public final MCStringPermColumn addr2 = createStringColumn(_addr2);
	
	/**
	 * 住所２（ベース）. Address 2(Base).<p>
	 *
	 */
	public static final String $base_addr2 = "base_addr2";
	private static final MCPermColumnInfo _base_addr2 = createColumnInfo("base_addr2");
	public final MCStringPermColumn base_addr2 = createStringColumn(_base_addr2);
	
	/**
	 * 住所３. Address 3.<p>
	 *
	 */
	public static final String $addr3 = "addr3";
	private static final MCPermColumnInfo _addr3 = createColumnInfo("addr3");
	public final MCStringPermColumn addr3 = createStringColumn(_addr3);
	
	/**
	 * 住所３（ベース）. Address 3(Base).<p>
	 *
	 */
	public static final String $base_addr3 = "base_addr3";
	private static final MCPermColumnInfo _base_addr3 = createColumnInfo("base_addr3");
	public final MCStringPermColumn base_addr3 = createStringColumn(_base_addr3);
	
	/**
	 * 住所４. Address 4.<p>
	 *
	 */
	public static final String $addr4 = "addr4";
	private static final MCPermColumnInfo _addr4 = createColumnInfo("addr4");
	public final MCStringPermColumn addr4 = createStringColumn(_addr4);
	
	/**
	 * 住所４（ベース）. Address 4(Base).<p>
	 *
	 */
	public static final String $base_addr4 = "base_addr4";
	private static final MCPermColumnInfo _base_addr4 = createColumnInfo("base_addr4");
	public final MCStringPermColumn base_addr4 = createStringColumn(_base_addr4);
	
	/**
	 * ＴＥＬ. TEL.<p>
	 *
	 */
	public static final String $tel = "tel";
	private static final MCPermColumnInfo _tel = createColumnInfo("tel");
	public final MCStringPermColumn tel = createStringColumn(_tel);
	
	/**
	 * ＴＥＬ（ベース）. TEL(Base).<p>
	 *
	 */
	public static final String $base_tel = "base_tel";
	private static final MCPermColumnInfo _base_tel = createColumnInfo("base_tel");
	public final MCStringPermColumn base_tel = createStringColumn(_base_tel);
	
	/**
	 * ＦＡＸ. FAX.<p>
	 *
	 */
	public static final String $fax = "fax";
	private static final MCPermColumnInfo _fax = createColumnInfo("fax");
	public final MCStringPermColumn fax = createStringColumn(_fax);
	
	/**
	 * ＦＡＸ（ベース）. FAX(Base).<p>
	 *
	 */
	public static final String $base_fax = "base_fax";
	private static final MCPermColumnInfo _base_fax = createColumnInfo("base_fax");
	public final MCStringPermColumn base_fax = createStringColumn(_base_fax);
	
	/**
	 * 代表者名. Representative name.<p>
	 *
	 */
	public static final String $co_repl_nm = "co_repl_nm";
	private static final MCPermColumnInfo _co_repl_nm = createColumnInfo("co_repl_nm");
	public final MCStringPermColumn co_repl_nm = createStringColumn(_co_repl_nm);
	
	/**
	 * 代表者名（ベース）. Representative name(Base).<p>
	 *
	 */
	public static final String $base_co_repl_nm = "base_co_repl_nm";
	private static final MCPermColumnInfo _base_co_repl_nm = createColumnInfo("base_co_repl_nm");
	public final MCStringPermColumn base_co_repl_nm = createStringColumn(_base_co_repl_nm);
	
	/**
	 * 法人番号. Corporation number.<p>
	 *
	 */
	public static final String $ein = "ein";
	private static final MCPermColumnInfo _ein = createColumnInfo("ein");
	public final MCStringPermColumn ein = createStringColumn(_ein);
	
	/**
	 * 事業者ＮＯ. Business No..<p>
	 *
	 */
	public static final String $biz_co_no = "biz_co_no";
	private static final MCPermColumnInfo _biz_co_no = createColumnInfo("biz_co_no");
	public final MCStringPermColumn biz_co_no = createStringColumn(_biz_co_no);
	
	/**
	 * 標準企業コード. Standard company code.<p>
	 *
	 */
	public static final String $std_co_cd = "std_co_cd";
	private static final MCPermColumnInfo _std_co_cd = createColumnInfo("std_co_cd");
	public final MCStringPermColumn std_co_cd = createStringColumn(_std_co_cd);
	
	/**
	 * 国ＣＤ. Country cd..<p>
	 *
	 */
	public static final String $cntry_cd = "cntry_cd";
	private static final MCPermColumnInfo _cntry_cd = createColumnInfo("cntry_cd");
	public final MCStringPermColumn cntry_cd = createStringColumn(_cntry_cd);
	
	/**
	 * 地域ＣＤ. Region cd..<p>
	 *
	 */
	public static final String $area_cd = "area_cd";
	private static final MCPermColumnInfo _area_cd = createColumnInfo("area_cd");
	public final MCStringPermColumn area_cd = createStringColumn(_area_cd);
	
	/**
	 * 基準通貨ＣＤ. Base currency cd..<p>
	 *
	 */
	public static final String $base_cur_cd = "base_cur_cd";
	private static final MCPermColumnInfo _base_cur_cd = createColumnInfo("base_cur_cd");
	public final MCStringPermColumn base_cur_cd = createStringColumn(_base_cur_cd);
	
	/**
	 * 納税通貨ＣＤ. Taxpaying currency cd..<p>
	 *
	 */
	public static final String $ptax_cur_cd = "ptax_cur_cd";
	private static final MCPermColumnInfo _ptax_cur_cd = createColumnInfo("ptax_cur_cd");
	public final MCStringPermColumn ptax_cur_cd = createStringColumn(_ptax_cur_cd);
	
	/**
	 * 期首年月. Beginning year.<p>
	 *
	 */
	public static final String $st_mon = "st_mon";
	private static final MCPermColumnInfo _st_mon = createColumnInfo("st_mon");
	public final MCNumberPermColumn st_mon = createNumberColumn(_st_mon);
	
	/**
	 * 会計締日. Accounting closing day.<p>
	 *
	 */
	public static final String $ac_cl_day = "ac_cl_day";
	private static final MCPermColumnInfo _ac_cl_day = createColumnInfo("ac_cl_day");
	public final MCNumberPermColumn ac_cl_day = createNumberColumn(_ac_cl_day);
	
	/**
	 * 会計月度基準. Accounting month basis.<p>
	 *
	 */
	public static final String $ac_cl_mon_base = "ac_cl_mon_base";
	private static final MCPermColumnInfo _ac_cl_mon_base = createColumnInfo("ac_cl_mon_base");
	public final MCNumberPermColumn ac_cl_mon_base = createNumberColumn(_ac_cl_mon_base);
	
	/**
	 * 日付切替時間. Date switching time.<p>
	 *
	 */
	public static final String $dt_switch_time = "dt_switch_time";
	private static final MCPermColumnInfo _dt_switch_time = createColumnInfo("dt_switch_time");
	public final MCNumberPermColumn dt_switch_time = createNumberColumn(_dt_switch_time);
	
	/**
	 * 債権不使用ＦＬＧ. AR not use flg..<p>
	 *
	 */
	public static final String $ar_no_use_flg = "ar_no_use_flg";
	private static final MCPermColumnInfo _ar_no_use_flg = createColumnInfo("ar_no_use_flg");
	public final MCBooleanPermColumn ar_no_use_flg = createBooleanColumn(_ar_no_use_flg);
	
	/**
	 * 債務不使用ＦＬＧ. AP not used flg..<p>
	 *
	 */
	public static final String $ap_no_use_flg = "ap_no_use_flg";
	private static final MCPermColumnInfo _ap_no_use_flg = createColumnInfo("ap_no_use_flg");
	public final MCBooleanPermColumn ap_no_use_flg = createBooleanColumn(_ap_no_use_flg);
	
	/**
	 * 暫定買掛使用ＦＬＧ. Temporary AP use flg..<p>
	 *
	 */
	public static final String $temp_ap_use_flg = "temp_ap_use_flg";
	private static final MCPermColumnInfo _temp_ap_use_flg = createColumnInfo("temp_ap_use_flg");
	public final MCBooleanPermColumn temp_ap_use_flg = createBooleanColumn(_temp_ap_use_flg);
	
	/**
	 * 標準カレンダＣＤ. Standard calendar cd..<p>
	 *
	 */
	public static final String $std_cal_cd = "std_cal_cd";
	private static final MCPermColumnInfo _std_cal_cd = createColumnInfo("std_cal_cd");
	public final MCStringPermColumn std_cal_cd = createStringColumn(_std_cal_cd);
	
	/**
	 * 請求締カレンダＣＤ. Billing closing calendar cd..<p>
	 *
	 */
	public static final String $bill_cl_cal_cd = "bill_cl_cal_cd";
	private static final MCPermColumnInfo _bill_cl_cal_cd = createColumnInfo("bill_cl_cal_cd");
	public final MCStringPermColumn bill_cl_cal_cd = createStringColumn(_bill_cl_cal_cd);
	
	/**
	 * 支払予定締カレンダＣＤ. Payment schedule closing calendar cd..<p>
	 *
	 */
	public static final String $pay_schd_cl_cal_cd = "pay_schd_cl_cal_cd";
	private static final MCPermColumnInfo _pay_schd_cl_cal_cd = createColumnInfo("pay_schd_cl_cal_cd");
	public final MCStringPermColumn pay_schd_cl_cal_cd = createStringColumn(_pay_schd_cl_cal_cd);
	
	/**
	 * 売上締ＦＬＧ. Sales closing flg..<p>
	 *
	 */
	public static final String $sls_cl_flg = "sls_cl_flg";
	private static final MCPermColumnInfo _sls_cl_flg = createColumnInfo("sls_cl_flg");
	public final MCBooleanPermColumn sls_cl_flg = createBooleanColumn(_sls_cl_flg);
	
	/**
	 * 入金締ＦＬＧ. Payment received closing flg..<p>
	 *
	 */
	public static final String $rcv_cl_flg = "rcv_cl_flg";
	private static final MCPermColumnInfo _rcv_cl_flg = createColumnInfo("rcv_cl_flg");
	public final MCBooleanPermColumn rcv_cl_flg = createBooleanColumn(_rcv_cl_flg);
	
	/**
	 * 仕入締ＦＬＧ. Purchase closing flg..<p>
	 *
	 */
	public static final String $purc_cl_flg = "purc_cl_flg";
	private static final MCPermColumnInfo _purc_cl_flg = createColumnInfo("purc_cl_flg");
	public final MCBooleanPermColumn purc_cl_flg = createBooleanColumn(_purc_cl_flg);
	
	/**
	 * 支払締ＦＬＧ. Payment closing flg..<p>
	 *
	 */
	public static final String $pay_cl_flg = "pay_cl_flg";
	private static final MCPermColumnInfo _pay_cl_flg = createColumnInfo("pay_cl_flg");
	public final MCBooleanPermColumn pay_cl_flg = createBooleanColumn(_pay_cl_flg);
	
	/**
	 * 売上締カレンダＣＤ. Sales closing calendar cd..<p>
	 *
	 */
	public static final String $sls_cl_cal_cd = "sls_cl_cal_cd";
	private static final MCPermColumnInfo _sls_cl_cal_cd = createColumnInfo("sls_cl_cal_cd");
	public final MCStringPermColumn sls_cl_cal_cd = createStringColumn(_sls_cl_cal_cd);
	
	/**
	 * 入金締カレンダＣＤ. Payment received closing calendar cd..<p>
	 *
	 */
	public static final String $rcv_cl_cal_cd = "rcv_cl_cal_cd";
	private static final MCPermColumnInfo _rcv_cl_cal_cd = createColumnInfo("rcv_cl_cal_cd");
	public final MCStringPermColumn rcv_cl_cal_cd = createStringColumn(_rcv_cl_cal_cd);
	
	/**
	 * 仕入締カレンダＣＤ. Purchase closing calendar cd..<p>
	 *
	 */
	public static final String $purc_cl_cal_cd = "purc_cl_cal_cd";
	private static final MCPermColumnInfo _purc_cl_cal_cd = createColumnInfo("purc_cl_cal_cd");
	public final MCStringPermColumn purc_cl_cal_cd = createStringColumn(_purc_cl_cal_cd);
	
	/**
	 * 支払締カレンダＣＤ. Payment closing calendar cd..<p>
	 *
	 */
	public static final String $pay_cl_cal_cd = "pay_cl_cal_cd";
	private static final MCPermColumnInfo _pay_cl_cal_cd = createColumnInfo("pay_cl_cal_cd");
	public final MCStringPermColumn pay_cl_cal_cd = createStringColumn(_pay_cl_cal_cd);
	
	/**
	 * 在庫締カレンダＣＤ. Inventory closing calendar cd..<p>
	 *
	 */
	public static final String $stk_cl_cal_cd = "stk_cl_cal_cd";
	private static final MCPermColumnInfo _stk_cl_cal_cd = createColumnInfo("stk_cl_cal_cd");
	public final MCStringPermColumn stk_cl_cal_cd = createStringColumn(_stk_cl_cal_cd);
	
	/**
	 * 売上締日遅延日数. Delay days (Sales closing day).<p>
	 *
	 */
	public static final String $sls_cl_delay_days = "sls_cl_delay_days";
	private static final MCPermColumnInfo _sls_cl_delay_days = createColumnInfo("sls_cl_delay_days");
	public final MCNumberPermColumn sls_cl_delay_days = createNumberColumn(_sls_cl_delay_days);
	
	/**
	 * 売上締日前後区分. Sales closing day before/after type.<p>
	 *
	 */
	public static final String $sls_cl_ba_typ = "sls_cl_ba_typ";
	private static final MCPermColumnInfo _sls_cl_ba_typ = createColumnInfo("sls_cl_ba_typ");
	public final MCStringPermColumn sls_cl_ba_typ = createStringColumn(_sls_cl_ba_typ);
	
	/**
	 * 入金締日遅延日数. Delayed days (Payment received closing day).<p>
	 *
	 */
	public static final String $rcv_cl_delay_days = "rcv_cl_delay_days";
	private static final MCPermColumnInfo _rcv_cl_delay_days = createColumnInfo("rcv_cl_delay_days");
	public final MCNumberPermColumn rcv_cl_delay_days = createNumberColumn(_rcv_cl_delay_days);
	
	/**
	 * 入金締日前後区分. Payment received closing day before/after type.<p>
	 *
	 */
	public static final String $rcv_cl_ba_typ = "rcv_cl_ba_typ";
	private static final MCPermColumnInfo _rcv_cl_ba_typ = createColumnInfo("rcv_cl_ba_typ");
	public final MCStringPermColumn rcv_cl_ba_typ = createStringColumn(_rcv_cl_ba_typ);
	
	/**
	 * 仕入締日遅延日数. Delay days (Purchase closing day).<p>
	 *
	 */
	public static final String $purc_cl_delay_days = "purc_cl_delay_days";
	private static final MCPermColumnInfo _purc_cl_delay_days = createColumnInfo("purc_cl_delay_days");
	public final MCNumberPermColumn purc_cl_delay_days = createNumberColumn(_purc_cl_delay_days);
	
	/**
	 * 仕入締日前後区分. Purchase closing day before/after type.<p>
	 *
	 */
	public static final String $purc_cl_ba_typ = "purc_cl_ba_typ";
	private static final MCPermColumnInfo _purc_cl_ba_typ = createColumnInfo("purc_cl_ba_typ");
	public final MCStringPermColumn purc_cl_ba_typ = createStringColumn(_purc_cl_ba_typ);
	
	/**
	 * 支払締日遅延日数. Delay days (Payment closing day).<p>
	 *
	 */
	public static final String $pay_cl_delay_days = "pay_cl_delay_days";
	private static final MCPermColumnInfo _pay_cl_delay_days = createColumnInfo("pay_cl_delay_days");
	public final MCNumberPermColumn pay_cl_delay_days = createNumberColumn(_pay_cl_delay_days);
	
	/**
	 * 支払締日前後区分. Payment closing day before/after type.<p>
	 *
	 */
	public static final String $pay_cl_ba_typ = "pay_cl_ba_typ";
	private static final MCPermColumnInfo _pay_cl_ba_typ = createColumnInfo("pay_cl_ba_typ");
	public final MCStringPermColumn pay_cl_ba_typ = createStringColumn(_pay_cl_ba_typ);
	
	/**
	 * 在庫締日遅延日数. Delay days (Inventory closing day).<p>
	 *
	 */
	public static final String $stk_cl_delay_days = "stk_cl_delay_days";
	private static final MCPermColumnInfo _stk_cl_delay_days = createColumnInfo("stk_cl_delay_days");
	public final MCNumberPermColumn stk_cl_delay_days = createNumberColumn(_stk_cl_delay_days);
	
	/**
	 * 在庫締日前後区分. Inventory closing day before/after type.<p>
	 *
	 */
	public static final String $stk_cl_ba_typ = "stk_cl_ba_typ";
	private static final MCPermColumnInfo _stk_cl_ba_typ = createColumnInfo("stk_cl_ba_typ");
	public final MCStringPermColumn stk_cl_ba_typ = createStringColumn(_stk_cl_ba_typ);
	
	/**
	 * 売上為替レートＣＤ. Sales exchange rate cd..<p>
	 *
	 */
	public static final String $sls_xrate_cd = "sls_xrate_cd";
	private static final MCPermColumnInfo _sls_xrate_cd = createColumnInfo("sls_xrate_cd");
	public final MCStringPermColumn sls_xrate_cd = createStringColumn(_sls_xrate_cd);
	
	/**
	 * 仕入為替レートＣＤ. Purchase exchange rate cd..<p>
	 *
	 */
	public static final String $purc_xrate_cd = "purc_xrate_cd";
	private static final MCPermColumnInfo _purc_xrate_cd = createColumnInfo("purc_xrate_cd");
	public final MCStringPermColumn purc_xrate_cd = createStringColumn(_purc_xrate_cd);
	
	/**
	 * 支給為替レートＣＤ. Supply exchange rate cd..<p>
	 *
	 */
	public static final String $prov_xrate_cd = "prov_xrate_cd";
	private static final MCPermColumnInfo _prov_xrate_cd = createColumnInfo("prov_xrate_cd");
	public final MCStringPermColumn prov_xrate_cd = createStringColumn(_prov_xrate_cd);
	
	/**
	 * 請求時為替レート換算ＦＬＧ. Convert at exchange rate upon billing flg..<p>
	 *
	 */
	public static final String $bill_xrate_conv_flg = "bill_xrate_conv_flg";
	private static final MCPermColumnInfo _bill_xrate_conv_flg = createColumnInfo("bill_xrate_conv_flg");
	public final MCBooleanPermColumn bill_xrate_conv_flg = createBooleanColumn(_bill_xrate_conv_flg);
	
	/**
	 * 請求為替レートＣＤ. Billing exchange rate cd..<p>
	 *
	 */
	public static final String $bill_xrate_cd = "bill_xrate_cd";
	private static final MCPermColumnInfo _bill_xrate_cd = createColumnInfo("bill_xrate_cd");
	public final MCStringPermColumn bill_xrate_cd = createStringColumn(_bill_xrate_cd);
	
	/**
	 * 支払照合時為替レート換算ＦＬＧ. Convert at exchange rate upon payment collation flg..<p>
	 *
	 */
	public static final String $pay_xrate_conv_flg = "pay_xrate_conv_flg";
	private static final MCPermColumnInfo _pay_xrate_conv_flg = createColumnInfo("pay_xrate_conv_flg");
	public final MCBooleanPermColumn pay_xrate_conv_flg = createBooleanColumn(_pay_xrate_conv_flg);
	
	/**
	 * 支払照合為替レートＣＤ. Payment collation exchange rate cd..<p>
	 *
	 */
	public static final String $pay_xrate_cd = "pay_xrate_cd";
	private static final MCPermColumnInfo _pay_xrate_cd = createColumnInfo("pay_xrate_cd");
	public final MCStringPermColumn pay_xrate_cd = createStringColumn(_pay_xrate_cd);
	
	/**
	 * １月為替レート評価替ＦＬＧ. Exchange rate revaluation flg. in January.<p>
	 *
	 */
	public static final String $mon01_xrate_rev_flg = "mon01_xrate_rev_flg";
	private static final MCPermColumnInfo _mon01_xrate_rev_flg = createColumnInfo("mon01_xrate_rev_flg");
	public final MCBooleanPermColumn mon01_xrate_rev_flg = createBooleanColumn(_mon01_xrate_rev_flg);
	
	/**
	 * ２月為替レート評価替ＦＬＧ. Exchange rate revaluation flg. in February.<p>
	 *
	 */
	public static final String $mon02_xrate_rev_flg = "mon02_xrate_rev_flg";
	private static final MCPermColumnInfo _mon02_xrate_rev_flg = createColumnInfo("mon02_xrate_rev_flg");
	public final MCBooleanPermColumn mon02_xrate_rev_flg = createBooleanColumn(_mon02_xrate_rev_flg);
	
	/**
	 * ３月為替レート評価替ＦＬＧ. Exchange rate revaluation flg. in March.<p>
	 *
	 */
	public static final String $mon03_xrate_rev_flg = "mon03_xrate_rev_flg";
	private static final MCPermColumnInfo _mon03_xrate_rev_flg = createColumnInfo("mon03_xrate_rev_flg");
	public final MCBooleanPermColumn mon03_xrate_rev_flg = createBooleanColumn(_mon03_xrate_rev_flg);
	
	/**
	 * ４月為替レート評価替ＦＬＧ. Exchange rate revaluation flg. in April.<p>
	 *
	 */
	public static final String $mon04_xrate_rev_flg = "mon04_xrate_rev_flg";
	private static final MCPermColumnInfo _mon04_xrate_rev_flg = createColumnInfo("mon04_xrate_rev_flg");
	public final MCBooleanPermColumn mon04_xrate_rev_flg = createBooleanColumn(_mon04_xrate_rev_flg);
	
	/**
	 * ５月為替レート評価替ＦＬＧ. Exchange rate revaluation flg. in May.<p>
	 *
	 */
	public static final String $mon05_xrate_rev_flg = "mon05_xrate_rev_flg";
	private static final MCPermColumnInfo _mon05_xrate_rev_flg = createColumnInfo("mon05_xrate_rev_flg");
	public final MCBooleanPermColumn mon05_xrate_rev_flg = createBooleanColumn(_mon05_xrate_rev_flg);
	
	/**
	 * ６月為替レート評価替ＦＬＧ. Exchange rate revaluation flg. in June.<p>
	 *
	 */
	public static final String $mon06_xrate_rev_flg = "mon06_xrate_rev_flg";
	private static final MCPermColumnInfo _mon06_xrate_rev_flg = createColumnInfo("mon06_xrate_rev_flg");
	public final MCBooleanPermColumn mon06_xrate_rev_flg = createBooleanColumn(_mon06_xrate_rev_flg);
	
	/**
	 * ７月為替レート評価替ＦＬＧ. Exchange rate revaluation flg. in July.<p>
	 *
	 */
	public static final String $mon07_xrate_rev_flg = "mon07_xrate_rev_flg";
	private static final MCPermColumnInfo _mon07_xrate_rev_flg = createColumnInfo("mon07_xrate_rev_flg");
	public final MCBooleanPermColumn mon07_xrate_rev_flg = createBooleanColumn(_mon07_xrate_rev_flg);
	
	/**
	 * ８月為替レート評価替ＦＬＧ. Exchange rate revaluation flg. in August.<p>
	 *
	 */
	public static final String $mon08_xrate_rev_flg = "mon08_xrate_rev_flg";
	private static final MCPermColumnInfo _mon08_xrate_rev_flg = createColumnInfo("mon08_xrate_rev_flg");
	public final MCBooleanPermColumn mon08_xrate_rev_flg = createBooleanColumn(_mon08_xrate_rev_flg);
	
	/**
	 * ９月為替レート評価替ＦＬＧ. Exchange rate revaluation flg. in September.<p>
	 *
	 */
	public static final String $mon09_xrate_rev_flg = "mon09_xrate_rev_flg";
	private static final MCPermColumnInfo _mon09_xrate_rev_flg = createColumnInfo("mon09_xrate_rev_flg");
	public final MCBooleanPermColumn mon09_xrate_rev_flg = createBooleanColumn(_mon09_xrate_rev_flg);
	
	/**
	 * １０月為替レート評価替ＦＬＧ. Exchange rate revaluation flg. in October.<p>
	 *
	 */
	public static final String $mon10_xrate_rev_flg = "mon10_xrate_rev_flg";
	private static final MCPermColumnInfo _mon10_xrate_rev_flg = createColumnInfo("mon10_xrate_rev_flg");
	public final MCBooleanPermColumn mon10_xrate_rev_flg = createBooleanColumn(_mon10_xrate_rev_flg);
	
	/**
	 * １１月為替レート評価替ＦＬＧ. Exchange rate revaluation flg. in November.<p>
	 *
	 */
	public static final String $mon11_xrate_rev_flg = "mon11_xrate_rev_flg";
	private static final MCPermColumnInfo _mon11_xrate_rev_flg = createColumnInfo("mon11_xrate_rev_flg");
	public final MCBooleanPermColumn mon11_xrate_rev_flg = createBooleanColumn(_mon11_xrate_rev_flg);
	
	/**
	 * １２月為替レート評価替ＦＬＧ. Exchange rate revaluation flg. in December.<p>
	 *
	 */
	public static final String $mon12_xrate_rev_flg = "mon12_xrate_rev_flg";
	private static final MCPermColumnInfo _mon12_xrate_rev_flg = createColumnInfo("mon12_xrate_rev_flg");
	public final MCBooleanPermColumn mon12_xrate_rev_flg = createBooleanColumn(_mon12_xrate_rev_flg);
	
	/**
	 * 販売単価取得区分. Sales unit price acquisition type.<p>
	 *
	 */
	public static final String $sls_upri_req_typ = "sls_upri_req_typ";
	private static final MCPermColumnInfo _sls_upri_req_typ = createColumnInfo("sls_upri_req_typ");
	public final MCStringPermColumn sls_upri_req_typ = createStringColumn(_sls_upri_req_typ);
	
	/**
	 * 購買単価取得区分. Purchase unit price acquisition type.<p>
	 *
	 */
	public static final String $purc_upri_req_typ = "purc_upri_req_typ";
	private static final MCPermColumnInfo _purc_upri_req_typ = createColumnInfo("purc_upri_req_typ");
	public final MCStringPermColumn purc_upri_req_typ = createStringColumn(_purc_upri_req_typ);
	
	/**
	 * 外注単価区分. Subcontracting unit price type.<p>
	 *
	 */
	public static final String $outsrc_upri_typ = "outsrc_upri_typ";
	private static final MCPermColumnInfo _outsrc_upri_typ = createColumnInfo("outsrc_upri_typ");
	public final MCStringPermColumn outsrc_upri_typ = createStringColumn(_outsrc_upri_typ);
	
	/**
	 * 売上計上区分. Revenue recording type.<p>
	 *
	 */
	public static final String $sls_basis_typ = "sls_basis_typ";
	private static final MCPermColumnInfo _sls_basis_typ = createColumnInfo("sls_basis_typ");
	public final MCStringPermColumn sls_basis_typ = createStringColumn(_sls_basis_typ);
	
	/**
	 * 請求起算区分. Billing initial base type.<p>
	 *
	 */
	public static final String $bill_basis_typ = "bill_basis_typ";
	private static final MCPermColumnInfo _bill_basis_typ = createColumnInfo("bill_basis_typ");
	public final MCStringPermColumn bill_basis_typ = createStringColumn(_bill_basis_typ);
	
	/**
	 * 出荷予定分割区分. Shipping schedule split type.<p>
	 *
	 */
	public static final String $ship_schd_split_typ = "ship_schd_split_typ";
	private static final MCPermColumnInfo _ship_schd_split_typ = createColumnInfo("ship_schd_split_typ");
	public final MCStringPermColumn ship_schd_split_typ = createStringColumn(_ship_schd_split_typ);
	
	/**
	 * 積送在庫管轄先区分. In-transit inventory controlled site type.<p>
	 *
	 */
	public static final String $xfr_stk_mng_typ = "xfr_stk_mng_typ";
	private static final MCPermColumnInfo _xfr_stk_mng_typ = createColumnInfo("xfr_stk_mng_typ");
	public final MCStringPermColumn xfr_stk_mng_typ = createStringColumn(_xfr_stk_mng_typ);
	
	/**
	 * 相殺税額端数処理区分. Offset tax rounding type.<p>
	 *
	 */
	public static final String $setoff_tax_rnd_typ = "setoff_tax_rnd_typ";
	private static final MCPermColumnInfo _setoff_tax_rnd_typ = createColumnInfo("setoff_tax_rnd_typ");
	public final MCStringPermColumn setoff_tax_rnd_typ = createStringColumn(_setoff_tax_rnd_typ);
	
	/**
	 * 為替端数処理区分. Exchange rounding type.<p>
	 *
	 */
	public static final String $xrate_rnd_typ = "xrate_rnd_typ";
	private static final MCPermColumnInfo _xrate_rnd_typ = createColumnInfo("xrate_rnd_typ");
	public final MCStringPermColumn xrate_rnd_typ = createStringColumn(_xrate_rnd_typ);
	
	/**
	 * 支払手数料税額端数処理区分. Rounding type (Payment fee tax).<p>
	 *
	 */
	public static final String $com_paid_tax_rnd_typ = "com_paid_tax_rnd_typ";
	private static final MCPermColumnInfo _com_paid_tax_rnd_typ = createColumnInfo("com_paid_tax_rnd_typ");
	public final MCStringPermColumn com_paid_tax_rnd_typ = createStringColumn(_com_paid_tax_rnd_typ);
	
	/**
	 * 源泉税額端数処理区分. Withholding tax rounding type.<p>
	 *
	 */
	public static final String $wtax_rnd_typ = "wtax_rnd_typ";
	private static final MCPermColumnInfo _wtax_rnd_typ = createColumnInfo("wtax_rnd_typ");
	public final MCStringPermColumn wtax_rnd_typ = createStringColumn(_wtax_rnd_typ);
	
	/**
	 * 在庫金額端数処理区分. Inventory amount rounding type.<p>
	 *
	 */
	public static final String $stk_amt_rnd_typ = "stk_amt_rnd_typ";
	private static final MCPermColumnInfo _stk_amt_rnd_typ = createColumnInfo("stk_amt_rnd_typ");
	public final MCStringPermColumn stk_amt_rnd_typ = createStringColumn(_stk_amt_rnd_typ);
	
	/**
	 * 在庫金額小数部有効桁数. Inventory amount number of decimal places.<p>
	 *
	 */
	public static final String $stk_amt_dec_place = "stk_amt_dec_place";
	private static final MCPermColumnInfo _stk_amt_dec_place = createColumnInfo("stk_amt_dec_place");
	public final MCNumberPermColumn stk_amt_dec_place = createNumberColumn(_stk_amt_dec_place);
	
	/**
	 * 販売予算単位区分. Sales budget unit type.<p>
	 *
	 */
	public static final String $sls_bdj_rnd_typ = "sls_bdj_rnd_typ";
	private static final MCPermColumnInfo _sls_bdj_rnd_typ = createColumnInfo("sls_bdj_rnd_typ");
	public final MCStringPermColumn sls_bdj_rnd_typ = createStringColumn(_sls_bdj_rnd_typ);
	
	/**
	 * 注文書表示ＣＤ. Display PO sheet cd..<p>
	 *
	 */
	public static final String $po_print_cd = "po_print_cd";
	private static final MCPermColumnInfo _po_print_cd = createColumnInfo("po_print_cd");
	public final MCStringPermColumn po_print_cd = createStringColumn(_po_print_cd);
	
	/**
	 * 現品票確認枚数. Checked number of identification tags.<p>
	 *
	 */
	public static final String $stk_lst_cnf_num = "stk_lst_cnf_num";
	private static final MCPermColumnInfo _stk_lst_cnf_num = createColumnInfo("stk_lst_cnf_num");
	public final MCNumberPermColumn stk_lst_cnf_num = createNumberColumn(_stk_lst_cnf_num);
	
	/**
	 * 現品票印刷上限枚数. Maximum number of identification tag printing.<p>
	 *
	 */
	public static final String $stk_lst_limit_num = "stk_lst_limit_num";
	private static final MCPermColumnInfo _stk_lst_limit_num = createColumnInfo("stk_lst_limit_num");
	public final MCNumberPermColumn stk_lst_limit_num = createNumberColumn(_stk_lst_limit_num);
	
	/**
	 * 標準単価取得区分（粗利計算用）. Standard unit cost acquisition type (For gross profit calculation).<p>
	 *
	 */
	public static final String $gm_std_upri_typ = "gm_std_upri_typ";
	private static final MCPermColumnInfo _gm_std_upri_typ = createColumnInfo("gm_std_upri_typ");
	public final MCStringPermColumn gm_std_upri_typ = createStringColumn(_gm_std_upri_typ);
	
	/**
	 * 標準単価取得区分（在庫評価用）. Standard unit cost acquisition type (For inventory valuation).<p>
	 *
	 */
	public static final String $stk_std_upri_typ = "stk_std_upri_typ";
	private static final MCPermColumnInfo _stk_std_upri_typ = createColumnInfo("stk_std_upri_typ");
	public final MCStringPermColumn stk_std_upri_typ = createStringColumn(_stk_std_upri_typ);
	
	/**
	 * 仕訳伝票ＮＯ桁数. Journal slip No. digits.<p>
	 *
	 */
	public static final String $ac_slip_digit = "ac_slip_digit";
	private static final MCPermColumnInfo _ac_slip_digit = createColumnInfo("ac_slip_digit");
	public final MCNumberPermColumn ac_slip_digit = createNumberColumn(_ac_slip_digit);
	
	/**
	 * 貸借明細番号ＦＬＧ. Debit credit details number flg..<p>
	 *
	 */
	public static final String $ac_slip_seq_flg = "ac_slip_seq_flg";
	private static final MCPermColumnInfo _ac_slip_seq_flg = createColumnInfo("ac_slip_seq_flg");
	public final MCBooleanPermColumn ac_slip_seq_flg = createBooleanColumn(_ac_slip_seq_flg);
	
	/**
	 * 帳票発行区分（得意先）. Slip issue type (Customer).<p>
	 *
	 */
	public static final String $cst_prnt_typ = "cst_prnt_typ";
	private static final MCPermColumnInfo _cst_prnt_typ = createColumnInfo("cst_prnt_typ");
	public final MCStringPermColumn cst_prnt_typ = createStringColumn(_cst_prnt_typ);
	
	/**
	 * 帳票発行区分（売掛先）. Slip issue type (AR customer).<p>
	 *
	 */
	public static final String $acst_prnt_typ = "acst_prnt_typ";
	private static final MCPermColumnInfo _acst_prnt_typ = createColumnInfo("acst_prnt_typ");
	public final MCStringPermColumn acst_prnt_typ = createStringColumn(_acst_prnt_typ);
	
	/**
	 * 帳票発行区分（請求先）. Slip issue type (Billing customer).<p>
	 *
	 */
	public static final String $bcst_prnt_typ = "bcst_prnt_typ";
	private static final MCPermColumnInfo _bcst_prnt_typ = createColumnInfo("bcst_prnt_typ");
	public final MCStringPermColumn bcst_prnt_typ = createStringColumn(_bcst_prnt_typ);
	
	/**
	 * 帳票発行区分（入金先）. Slip issue type (Payer).<p>
	 *
	 */
	public static final String $rcst_prnt_typ = "rcst_prnt_typ";
	private static final MCPermColumnInfo _rcst_prnt_typ = createColumnInfo("rcst_prnt_typ");
	public final MCStringPermColumn rcst_prnt_typ = createStringColumn(_rcst_prnt_typ);
	
	/**
	 * 帳票発行区分（発注先）. Slip issue type (Supplier).<p>
	 *
	 */
	public static final String $sppl_prnt_typ = "sppl_prnt_typ";
	private static final MCPermColumnInfo _sppl_prnt_typ = createColumnInfo("sppl_prnt_typ");
	public final MCStringPermColumn sppl_prnt_typ = createStringColumn(_sppl_prnt_typ);
	
	/**
	 * 帳票発行区分（買掛先）. Slip issue type (AP supplier).<p>
	 *
	 */
	public static final String $asppl_prnt_typ = "asppl_prnt_typ";
	private static final MCPermColumnInfo _asppl_prnt_typ = createColumnInfo("asppl_prnt_typ");
	public final MCStringPermColumn asppl_prnt_typ = createStringColumn(_asppl_prnt_typ);
	
	/**
	 * 帳票発行区分（支払予定管理先）. Slip issue type (Scheduled payee).<p>
	 *
	 */
	public static final String $bsppl_prnt_typ = "bsppl_prnt_typ";
	private static final MCPermColumnInfo _bsppl_prnt_typ = createColumnInfo("bsppl_prnt_typ");
	public final MCStringPermColumn bsppl_prnt_typ = createStringColumn(_bsppl_prnt_typ);
	
	/**
	 * 帳票発行区分（支払先）. Slip issue type (Payee).<p>
	 *
	 */
	public static final String $psppl_prnt_typ = "psppl_prnt_typ";
	private static final MCPermColumnInfo _psppl_prnt_typ = createColumnInfo("psppl_prnt_typ");
	public final MCStringPermColumn psppl_prnt_typ = createStringColumn(_psppl_prnt_typ);
	
	/**
	 * 帳票発行区分（納品先）. Slip issue type (Delivery destination).<p>
	 *
	 */
	public static final String $dlv_prnt_typ = "dlv_prnt_typ";
	private static final MCPermColumnInfo _dlv_prnt_typ = createColumnInfo("dlv_prnt_typ");
	public final MCStringPermColumn dlv_prnt_typ = createStringColumn(_dlv_prnt_typ);
	
	/**
	 * 帳票保存システムＣＤ. Report storage external system cd..<p>
	 *
	 */
	public static final String $rpt_strg_ext_sys_cd = "rpt_strg_ext_sys_cd";
	private static final MCPermColumnInfo _rpt_strg_ext_sys_cd = createColumnInfo("rpt_strg_ext_sys_cd");
	public final MCStringPermColumn rpt_strg_ext_sys_cd = createStringColumn(_rpt_strg_ext_sys_cd);
	
	/**
	 * メモ１. Memo 1.<p>
	 *
	 */
	public static final String $memo1 = "memo1";
	private static final MCPermColumnInfo _memo1 = createColumnInfo("memo1");
	public final MCStringPermColumn memo1 = createStringColumn(_memo1);
	
	/**
	 * メモ２. Memo 2.<p>
	 *
	 */
	public static final String $memo2 = "memo2";
	private static final MCPermColumnInfo _memo2 = createColumnInfo("memo2");
	public final MCStringPermColumn memo2 = createStringColumn(_memo2);
	
	/**
	 * メモ３. Memo 3.<p>
	 *
	 */
	public static final String $memo3 = "memo3";
	private static final MCPermColumnInfo _memo3 = createColumnInfo("memo3");
	public final MCStringPermColumn memo3 = createStringColumn(_memo3);
	
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
	 * 最早出荷日加算日数. Number of days added to earliest shipping date.<p>
	 *
	 */
	public static final String $early_ship_dt_add_days = "early_ship_dt_add_days";
	private static final MCPermColumnInfo _early_ship_dt_add_days = createColumnInfo("early_ship_dt_add_days");
	public final MCNumberPermColumn early_ship_dt_add_days = createNumberColumn(_early_ship_dt_add_days);
	
	/**
	 * 会社名. Company name.<p>
	 *
	 */
	public static final String $co_nm = "co_nm";
	
	/**
	 * 国名. Country name.<p>
	 *
	 */
	public static final String $cntry_nm = "cntry_nm";
	
	/**
	 * 地域名. Region name.<p>
	 *
	 */
	public static final String $area_nm = "area_nm";
	
	/**
	 * 基準通貨名. Base currency name.<p>
	 *
	 */
	public static final String $base_cur_nm = "base_cur_nm";
	
	/**
	 * 納税通貨名. Tax currency name.<p>
	 *
	 */
	public static final String $ptax_cur_nm = "ptax_cur_nm";
	
	/**
	 * 標準カレンダ名. Standard calendar name.<p>
	 *
	 */
	public static final String $std_cal_nm = "std_cal_nm";
	
	/**
	 * 売上締カレンダ名. Sales closing calendar name.<p>
	 *
	 */
	public static final String $sls_cl_cal_nm = "sls_cl_cal_nm";
	
	/**
	 * 請求締カレンダ名. Billing closing calendar name.<p>
	 *
	 */
	public static final String $bill_cl_cal_nm = "bill_cl_cal_nm";
	
	/**
	 * 入金締カレンダ名. Payment received closing calendar name.<p>
	 *
	 */
	public static final String $rcv_cl_cal_nm = "rcv_cl_cal_nm";
	
	/**
	 * 仕入締カレンダ名. Purchase closing calendar name.<p>
	 *
	 */
	public static final String $purc_cl_cal_nm = "purc_cl_cal_nm";
	
	/**
	 * 支払締カレンダ名. Payment closing calendar name.<p>
	 *
	 */
	public static final String $pay_cl_cal_nm = "pay_cl_cal_nm";
	
	/**
	 * 在庫締カレンダ名. Inventory closing calendar name.<p>
	 *
	 */
	public static final String $stk_cl_cal_nm = "stk_cl_cal_nm";
	
	/**
	 * 売上為替レート名. Sales exchange rate name.<p>
	 *
	 */
	public static final String $sls_xrate_nm = "sls_xrate_nm";
	
	/**
	 * 仕入為替レート名. Purchase exchange rate name.<p>
	 *
	 */
	public static final String $purc_xrate_nm = "purc_xrate_nm";
	
	/**
	 * 支給為替レート名. Supply exchange rate name.<p>
	 *
	 */
	public static final String $prov_xrate_nm = "prov_xrate_nm";
	
	/**
	 * 支払照合為替レート名. Payment collation exchange rate name.<p>
	 *
	 */
	public static final String $pay_xrate_nm = "pay_xrate_nm";
	
	/**
	 * 請求為替レート名. Billing exchange rate name.<p>
	 *
	 */
	public static final String $bill_xrate_nm = "bill_xrate_nm";
	
	/**
	 * 注文書表示名. Display PO sheet name.<p>
	 *
	 */
	public static final String $po_print_nm = "po_print_nm";
	
	/**
	 * 支払予定締カレンダ名. Payment schedule closing calendar name.<p>
	 *
	 */
	public static final String $pay_schd_cl_cal_nm = "pay_schd_cl_cal_nm";
	
	/**
	 * 帳票保存システム名. Report storage external system name.<p>
	 *
	 */
	public static final String $rpt_strg_ext_sys_nm = "rpt_strg_ext_sys_nm";
	
	public static final MCMeta co_cd_META = createCommonMeta($co_cd, mcframe.commonMA.meta.MA_META.CO_CD);
	public static final MCMeta co_alt_nm1_META = createCommonMeta($co_alt_nm1, mcframe.commonMA.meta.MA_META.CO_ALT_NM1);
	public static final MCMeta base_co_alt_nm1_META = createCommonMeta($base_co_alt_nm1, mcframe.commonMA.meta.MA_META.CO_ALT_NM1);
	public static final MCMeta co_alt_nm2_META = createCommonMeta($co_alt_nm2, mcframe.commonMA.meta.MA_META.CO_ALT_NM2);
	public static final MCMeta base_co_alt_nm2_META = createCommonMeta($base_co_alt_nm2, mcframe.commonMA.meta.MA_META.CO_ALT_NM2);
	public static final MCMeta co_alt_nm3_META = createCommonMeta($co_alt_nm3, mcframe.commonMA.meta.MA_META.CO_ALT_NM3);
	public static final MCMeta base_co_alt_nm3_META = createCommonMeta($base_co_alt_nm3, mcframe.commonMA.meta.MA_META.CO_ALT_NM3);
	public static final MCMeta co_alt_nm4_META = createCommonMeta($co_alt_nm4, mcframe.commonMA.meta.MA_META.CO_ALT_NM4);
	public static final MCMeta base_co_alt_nm4_META = createCommonMeta($base_co_alt_nm4, mcframe.commonMA.meta.MA_META.CO_ALT_NM4);
	public static final MCMeta zip_cd_META = createCommonMeta($zip_cd, mcframe.commonMA.meta.MA_META.ZIP_CD);
	public static final MCMeta base_zip_cd_META = createCommonMeta($base_zip_cd, mcframe.commonMA.meta.MA_META.ZIP_CD);
	public static final MCMeta addr1_META = createCommonMeta($addr1, mcframe.commonMA.meta.MA_META.ADDR1);
	public static final MCMeta base_addr1_META = createCommonMeta($base_addr1, mcframe.commonMA.meta.MA_META.ADDR1);
	public static final MCMeta addr2_META = createCommonMeta($addr2, mcframe.commonMA.meta.MA_META.ADDR2);
	public static final MCMeta base_addr2_META = createCommonMeta($base_addr2, mcframe.commonMA.meta.MA_META.ADDR2);
	public static final MCMeta addr3_META = createCommonMeta($addr3, mcframe.commonMA.meta.MA_META.ADDR3);
	public static final MCMeta base_addr3_META = createCommonMeta($base_addr3, mcframe.commonMA.meta.MA_META.ADDR3);
	public static final MCMeta addr4_META = createCommonMeta($addr4, mcframe.commonMA.meta.MA_META.ADDR4);
	public static final MCMeta base_addr4_META = createCommonMeta($base_addr4, mcframe.commonMA.meta.MA_META.ADDR4);
	public static final MCMeta tel_META = createCommonMeta($tel, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta base_tel_META = createCommonMeta($base_tel, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta fax_META = createCommonMeta($fax, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta base_fax_META = createCommonMeta($base_fax, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta co_repl_nm_META = createCommonMeta($co_repl_nm, mcframe.commonMA.meta.MA_META.CO_REPL_NM);
	public static final MCMeta base_co_repl_nm_META = createCommonMeta($base_co_repl_nm, mcframe.commonMA.meta.MA_META.CO_REPL_NM);
	public static final MCMeta ein_META = createCommonMeta($ein, mcframe.commonMA.meta.MA_META.EIN);
	public static final MCMeta biz_co_no_META = createCommonMeta($biz_co_no, mcframe.commonMA.meta.MA_META.BIZ_CO_NO);
	public static final MCMeta std_co_cd_META = createCommonMeta($std_co_cd, mcframe.commonMA.meta.MA_META.STD_CO_CD);
	public static final MCMeta cntry_cd_META = createCommonMeta($cntry_cd, mcframe.commonMA.meta.MA_META.CNTRY_CD);
	public static final MCMeta area_cd_META = createCommonMeta($area_cd, mcframe.commonMA.meta.MA_META.AREA_CD);
	public static final MCMeta base_cur_cd_META = createCommonMeta($base_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta ptax_cur_cd_META = createCommonMeta($ptax_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta st_mon_META = createCommonMeta($st_mon, mcframe.commonMA.meta.MA_META.MON);
	public static final MCMeta ac_cl_day_META = createCommonMeta($ac_cl_day, mcframe.commonMA.meta.MA_META.CL_DAY);
	public static final MCMeta ac_cl_mon_base_META = createCommonMeta($ac_cl_mon_base, mcframe.commonMA.meta.MA_META.CL_MON_BASE);
	public static final MCMeta dt_switch_time_META = createCommonMeta($dt_switch_time, mcframe.commonMA.meta.MA_META.INT2);
	public static final MCMeta ar_no_use_flg_META = createCommonMeta($ar_no_use_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ap_no_use_flg_META = createCommonMeta($ap_no_use_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta temp_ap_use_flg_META = createCommonMeta($temp_ap_use_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta std_cal_cd_META = createCommonMeta($std_cal_cd, mcframe.commonMA.meta.MA_META.CAL_CD);
	public static final MCMeta bill_cl_cal_cd_META = createCommonMeta($bill_cl_cal_cd, mcframe.commonMA.meta.MA_META.CAL_CD);
	public static final MCMeta pay_schd_cl_cal_cd_META = createCommonMeta($pay_schd_cl_cal_cd, mcframe.commonMA.meta.MA_META.CAL_CD);
	public static final MCMeta sls_cl_flg_META = createCommonMeta($sls_cl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rcv_cl_flg_META = createCommonMeta($rcv_cl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta purc_cl_flg_META = createCommonMeta($purc_cl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta pay_cl_flg_META = createCommonMeta($pay_cl_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sls_cl_cal_cd_META = createCommonMeta($sls_cl_cal_cd, mcframe.commonMA.meta.MA_META.CAL_CD);
	public static final MCMeta rcv_cl_cal_cd_META = createCommonMeta($rcv_cl_cal_cd, mcframe.commonMA.meta.MA_META.CAL_CD);
	public static final MCMeta purc_cl_cal_cd_META = createCommonMeta($purc_cl_cal_cd, mcframe.commonMA.meta.MA_META.CAL_CD);
	public static final MCMeta pay_cl_cal_cd_META = createCommonMeta($pay_cl_cal_cd, mcframe.commonMA.meta.MA_META.CAL_CD);
	public static final MCMeta stk_cl_cal_cd_META = createCommonMeta($stk_cl_cal_cd, mcframe.commonMA.meta.MA_META.CAL_CD);
	public static final MCMeta sls_cl_delay_days_META = createCommonMeta($sls_cl_delay_days, mcframe.commonMA.meta.MA_META.DELAY_DAYS);
	public static final MCMeta sls_cl_ba_typ_META = createCommonMeta($sls_cl_ba_typ, mcframe.commonMA.meta.MA_META.BA_TYP);
	public static final MCMeta rcv_cl_delay_days_META = createCommonMeta($rcv_cl_delay_days, mcframe.commonMA.meta.MA_META.DELAY_DAYS);
	public static final MCMeta rcv_cl_ba_typ_META = createCommonMeta($rcv_cl_ba_typ, mcframe.commonMA.meta.MA_META.BA_TYP);
	public static final MCMeta purc_cl_delay_days_META = createCommonMeta($purc_cl_delay_days, mcframe.commonMA.meta.MA_META.DELAY_DAYS);
	public static final MCMeta purc_cl_ba_typ_META = createCommonMeta($purc_cl_ba_typ, mcframe.commonMA.meta.MA_META.BA_TYP);
	public static final MCMeta pay_cl_delay_days_META = createCommonMeta($pay_cl_delay_days, mcframe.commonMA.meta.MA_META.DELAY_DAYS);
	public static final MCMeta pay_cl_ba_typ_META = createCommonMeta($pay_cl_ba_typ, mcframe.commonMA.meta.MA_META.BA_TYP);
	public static final MCMeta stk_cl_delay_days_META = createCommonMeta($stk_cl_delay_days, mcframe.commonMA.meta.MA_META.DELAY_DAYS);
	public static final MCMeta stk_cl_ba_typ_META = createCommonMeta($stk_cl_ba_typ, mcframe.commonMA.meta.MA_META.BA_TYP);
	public static final MCMeta sls_xrate_cd_META = createCommonMeta($sls_xrate_cd, mcframe.commonMA.meta.MA_META.XRATE_CD);
	public static final MCMeta purc_xrate_cd_META = createCommonMeta($purc_xrate_cd, mcframe.commonMA.meta.MA_META.XRATE_CD);
	public static final MCMeta prov_xrate_cd_META = createCommonMeta($prov_xrate_cd, mcframe.commonMA.meta.MA_META.XRATE_CD);
	public static final MCMeta bill_xrate_conv_flg_META = createCommonMeta($bill_xrate_conv_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta bill_xrate_cd_META = createCommonMeta($bill_xrate_cd, mcframe.commonMA.meta.MA_META.XRATE_CD);
	public static final MCMeta pay_xrate_conv_flg_META = createCommonMeta($pay_xrate_conv_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta pay_xrate_cd_META = createCommonMeta($pay_xrate_cd, mcframe.commonMA.meta.MA_META.XRATE_CD);
	public static final MCMeta mon01_xrate_rev_flg_META = createCommonMeta($mon01_xrate_rev_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta mon02_xrate_rev_flg_META = createCommonMeta($mon02_xrate_rev_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta mon03_xrate_rev_flg_META = createCommonMeta($mon03_xrate_rev_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta mon04_xrate_rev_flg_META = createCommonMeta($mon04_xrate_rev_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta mon05_xrate_rev_flg_META = createCommonMeta($mon05_xrate_rev_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta mon06_xrate_rev_flg_META = createCommonMeta($mon06_xrate_rev_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta mon07_xrate_rev_flg_META = createCommonMeta($mon07_xrate_rev_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta mon08_xrate_rev_flg_META = createCommonMeta($mon08_xrate_rev_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta mon09_xrate_rev_flg_META = createCommonMeta($mon09_xrate_rev_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta mon10_xrate_rev_flg_META = createCommonMeta($mon10_xrate_rev_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta mon11_xrate_rev_flg_META = createCommonMeta($mon11_xrate_rev_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta mon12_xrate_rev_flg_META = createCommonMeta($mon12_xrate_rev_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sls_upri_req_typ_META = createCommonMeta($sls_upri_req_typ, mcframe.commonMA.meta.MA_META.SLS_UPRI_REQ_TYP);
	public static final MCMeta purc_upri_req_typ_META = createCommonMeta($purc_upri_req_typ, mcframe.commonMA.meta.MA_META.PURC_UPRI_REQ_TYP);
	public static final MCMeta outsrc_upri_typ_META = createCommonMeta($outsrc_upri_typ, mcframe.commonMA.meta.MA_META.OUTSRC_UPRI_TYP);
	public static final MCMeta sls_basis_typ_META = createCommonMeta($sls_basis_typ, mcframe.commonMA.meta.MA_META.SLS_BASIS_TYP);
	public static final MCMeta bill_basis_typ_META = createCommonMeta($bill_basis_typ, mcframe.commonMA.meta.MA_META.BILL_BASIS_TYP);
	public static final MCMeta ship_schd_split_typ_META = createCommonMeta($ship_schd_split_typ, mcframe.commonMA.meta.MA_META.SHIP_SCHD_SPLIT_TYP);
	public static final MCMeta xfr_stk_mng_typ_META = createCommonMeta($xfr_stk_mng_typ, mcframe.commonMA.meta.MA_META.XFR_STK_MNG_TYP);
	public static final MCMeta setoff_tax_rnd_typ_META = createCommonMeta($setoff_tax_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta xrate_rnd_typ_META = createCommonMeta($xrate_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta com_paid_tax_rnd_typ_META = createCommonMeta($com_paid_tax_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta wtax_rnd_typ_META = createCommonMeta($wtax_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta stk_amt_rnd_typ_META = createCommonMeta($stk_amt_rnd_typ, mcframe.commonMA.meta.MA_META.RND_TYP);
	public static final MCMeta stk_amt_dec_place_META = createCommonMeta($stk_amt_dec_place, mcframe.commonMA.meta.MA_META.DEC_PLACE);
	public static final MCMeta sls_bdj_rnd_typ_META = createCommonMeta($sls_bdj_rnd_typ, mcframe.commonMA.meta.MA_META.BIG_NUM_RND_TYP);
	public static final MCMeta po_print_cd_META = createCommonMeta($po_print_cd, mcframe.commonMA.meta.MA_META.PO_PRINT_CD);
	public static final MCMeta stk_lst_cnf_num_META = createCommonMeta($stk_lst_cnf_num, mcframe.commonMA.meta.MA_META.INT4);
	public static final MCMeta stk_lst_limit_num_META = createCommonMeta($stk_lst_limit_num, mcframe.commonMA.meta.MA_META.INT4);
	public static final MCMeta gm_std_upri_typ_META = createCommonMeta($gm_std_upri_typ, mcframe.commonMA.meta.MA_META.STD_UPRI_SEL_TYP);
	public static final MCMeta stk_std_upri_typ_META = createCommonMeta($stk_std_upri_typ, mcframe.commonMA.meta.MA_META.STD_UPRI_SEL_TYP);
	public static final MCMeta ac_slip_digit_META = createCommonMeta($ac_slip_digit, mcframe.commonMA.meta.MA_META.INT_DIGIT);
	public static final MCMeta ac_slip_seq_flg_META = createCommonMeta($ac_slip_seq_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cst_prnt_typ_META = createCommonMeta($cst_prnt_typ, mcframe.commonMA.meta.MA_META.PRNT_TYP);
	public static final MCMeta acst_prnt_typ_META = createCommonMeta($acst_prnt_typ, mcframe.commonMA.meta.MA_META.PRNT_TYP);
	public static final MCMeta bcst_prnt_typ_META = createCommonMeta($bcst_prnt_typ, mcframe.commonMA.meta.MA_META.PRNT_TYP);
	public static final MCMeta rcst_prnt_typ_META = createCommonMeta($rcst_prnt_typ, mcframe.commonMA.meta.MA_META.PRNT_TYP);
	public static final MCMeta sppl_prnt_typ_META = createCommonMeta($sppl_prnt_typ, mcframe.commonMA.meta.MA_META.PRNT_TYP);
	public static final MCMeta asppl_prnt_typ_META = createCommonMeta($asppl_prnt_typ, mcframe.commonMA.meta.MA_META.PRNT_TYP);
	public static final MCMeta bsppl_prnt_typ_META = createCommonMeta($bsppl_prnt_typ, mcframe.commonMA.meta.MA_META.PRNT_TYP);
	public static final MCMeta psppl_prnt_typ_META = createCommonMeta($psppl_prnt_typ, mcframe.commonMA.meta.MA_META.PRNT_TYP);
	public static final MCMeta dlv_prnt_typ_META = createCommonMeta($dlv_prnt_typ, mcframe.commonMA.meta.MA_META.PRNT_TYP);
	public static final MCMeta rpt_strg_ext_sys_cd_META = createCommonMeta($rpt_strg_ext_sys_cd, mcframe.commonMA.meta.MA_META.EXT_SYS_CD);
	public static final MCMeta memo1_META = createCommonMeta($memo1, mcframe.commonMA.meta.MA_META.MST_MEMO1);
	public static final MCMeta memo2_META = createCommonMeta($memo2, mcframe.commonMA.meta.MA_META.MST_MEMO2);
	public static final MCMeta memo3_META = createCommonMeta($memo3, mcframe.commonMA.meta.MA_META.MST_MEMO3);
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
	public static final MCMeta early_ship_dt_add_days_META = createCommonMeta($early_ship_dt_add_days, mcframe.commonMA.meta.MA_META.DAYS);
	public static final MCMeta co_nm_META = createCommonMeta($co_nm, mcframe.commonMA.meta.MA_META.CO_NM);
	public static final MCMeta cntry_nm_META = createCommonMeta($cntry_nm, mcframe.commonMA.meta.MA_META.CNTRY_NM);
	public static final MCMeta area_nm_META = createCommonMeta($area_nm, mcframe.commonMA.meta.MA_META.AREA_NM);
	public static final MCMeta base_cur_nm_META = createCommonMeta($base_cur_nm, mcframe.commonMA.meta.MA_META.CUR_NM);
	public static final MCMeta ptax_cur_nm_META = createCommonMeta($ptax_cur_nm, mcframe.commonMA.meta.MA_META.CUR_NM);
	public static final MCMeta std_cal_nm_META = createCommonMeta($std_cal_nm, mcframe.commonMA.meta.MA_META.CAL_NM);
	public static final MCMeta sls_cl_cal_nm_META = createCommonMeta($sls_cl_cal_nm, mcframe.commonMA.meta.MA_META.CAL_NM);
	public static final MCMeta bill_cl_cal_nm_META = createCommonMeta($bill_cl_cal_nm, mcframe.commonMA.meta.MA_META.CAL_NM);
	public static final MCMeta rcv_cl_cal_nm_META = createCommonMeta($rcv_cl_cal_nm, mcframe.commonMA.meta.MA_META.CAL_NM);
	public static final MCMeta purc_cl_cal_nm_META = createCommonMeta($purc_cl_cal_nm, mcframe.commonMA.meta.MA_META.CAL_NM);
	public static final MCMeta pay_cl_cal_nm_META = createCommonMeta($pay_cl_cal_nm, mcframe.commonMA.meta.MA_META.CAL_NM);
	public static final MCMeta stk_cl_cal_nm_META = createCommonMeta($stk_cl_cal_nm, mcframe.commonMA.meta.MA_META.CAL_NM);
	public static final MCMeta sls_xrate_nm_META = createCommonMeta($sls_xrate_nm, mcframe.commonMA.meta.MA_META.XRATE_NM);
	public static final MCMeta purc_xrate_nm_META = createCommonMeta($purc_xrate_nm, mcframe.commonMA.meta.MA_META.XRATE_NM);
	public static final MCMeta prov_xrate_nm_META = createCommonMeta($prov_xrate_nm, mcframe.commonMA.meta.MA_META.XRATE_NM);
	public static final MCMeta pay_xrate_nm_META = createCommonMeta($pay_xrate_nm, mcframe.commonMA.meta.MA_META.XRATE_NM);
	public static final MCMeta bill_xrate_nm_META = createCommonMeta($bill_xrate_nm, mcframe.commonMA.meta.MA_META.XRATE_NM);
	public static final MCMeta po_print_nm_META = createCommonMeta($po_print_nm, mcframe.commonMA.meta.MA_META.PO_PRINT_NM);
	public static final MCMeta pay_schd_cl_cal_nm_META = createCommonMeta($pay_schd_cl_cal_nm, mcframe.commonMA.meta.MA_META.CAL_NM);
	public static final MCMeta rpt_strg_ext_sys_nm_META = createCommonMeta($rpt_strg_ext_sys_nm, mcframe.commonMA.meta.MA_META.EXT_SYS_NM);

	protected static final List<MCForeignInfo> FOREIGN_INFO_LIST = new ArrayList<>();
	public static final String $CNTRY1 = "CNTRY1";
	public static final String $AREA1 = "AREA1";
	public static final String $CUR1 = "CUR1";
	public static final String $CUR2 = "CUR2";
	public static final String $CAL_BASE1 = "CAL_BASE1";
	public static final String $CAL_BASE2 = "CAL_BASE2";
	public static final String $CAL_BASE3 = "CAL_BASE3";
	public static final String $CAL_BASE4 = "CAL_BASE4";
	public static final String $CAL_BASE5 = "CAL_BASE5";
	public static final String $CAL_BASE6 = "CAL_BASE6";
	public static final String $CAL_BASE7 = "CAL_BASE7";
	public static final String $XRATE1 = "XRATE1";
	public static final String $XRATE2 = "XRATE2";
	public static final String $XRATE3 = "XRATE3";
	public static final String $XRATE5 = "XRATE5";
	public static final String $XRATE4 = "XRATE4";
	public static final String $PO_PRINT1 = "PO_PRINT1";
	public static final String $CAL_BASE8 = "CAL_BASE8";
	public static final String $EXT_SYS1 = "EXT_SYS1";
	public static final String $CO1 = "CO1";
	static {
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_CNTRY",
				$CNTRY1,
				new String[][]{
						{"cntry_cd", "cntry_cd"}
				},
				() -> {
					return mcframe.serverMA.dbc.MAM_CNTRY_R.create("CNTRY1");
				},
				(alias) -> {
					MAM_CO_R own = MAM_CO_R.create(alias);
					mcframe.serverMA.dbc.MAM_CNTRY_R ref = mcframe.serverMA.dbc.MAM_CNTRY_R.create("CNTRY1");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.cntry_cd.eq(ref.cntry_cd));
					return cond;
				}
			)
		);
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_AREA",
				$AREA1,
				new String[][]{
						{"area_cd", "area_cd"}
				},
				() -> {
					return mcframe.serverMA.dbc.MAM_AREA_R.create("AREA1");
				},
				(alias) -> {
					MAM_CO_R own = MAM_CO_R.create(alias);
					mcframe.serverMA.dbc.MAM_AREA_R ref = mcframe.serverMA.dbc.MAM_AREA_R.create("AREA1");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.area_cd.eq(ref.area_cd));
					return cond;
				}
			)
		);
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_CUR",
				$CUR1,
				new String[][]{
						{"base_cur_cd", "cur_cd"}
				},
				() -> {
					return mcframe.serverMA.dbc.MAM_CUR_R.create("CUR1");
				},
				(alias) -> {
					MAM_CO_R own = MAM_CO_R.create(alias);
					mcframe.serverMA.dbc.MAM_CUR_R ref = mcframe.serverMA.dbc.MAM_CUR_R.create("CUR1");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.base_cur_cd.eq(ref.cur_cd));
					return cond;
				}
			)
		);
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_CUR",
				$CUR2,
				new String[][]{
						{"ptax_cur_cd", "cur_cd"}
				},
				() -> {
					return mcframe.serverMA.dbc.MAM_CUR_R.create("CUR2");
				},
				(alias) -> {
					MAM_CO_R own = MAM_CO_R.create(alias);
					mcframe.serverMA.dbc.MAM_CUR_R ref = mcframe.serverMA.dbc.MAM_CUR_R.create("CUR2");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.ptax_cur_cd.eq(ref.cur_cd));
					return cond;
				}
			)
		);
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_CAL_BASE",
				$CAL_BASE1,
				new String[][]{
						{"std_cal_cd", "cal_cd"}
				},
				() -> {
					return mcframe.serverMA.dbc.MAM_CAL_BASE_R.create("CAL_BASE1");
				},
				(alias) -> {
					MAM_CO_R own = MAM_CO_R.create(alias);
					mcframe.serverMA.dbc.MAM_CAL_BASE_R ref = mcframe.serverMA.dbc.MAM_CAL_BASE_R.create("CAL_BASE1");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.std_cal_cd.eq(ref.cal_cd));
					return cond;
				}
			)
		);
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_CAL_BASE",
				$CAL_BASE2,
				new String[][]{
						{"sls_cl_cal_cd", "cal_cd"}
				},
				() -> {
					return mcframe.serverMA.dbc.MAM_CAL_BASE_R.create("CAL_BASE2");
				},
				(alias) -> {
					MAM_CO_R own = MAM_CO_R.create(alias);
					mcframe.serverMA.dbc.MAM_CAL_BASE_R ref = mcframe.serverMA.dbc.MAM_CAL_BASE_R.create("CAL_BASE2");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.sls_cl_cal_cd.eq(ref.cal_cd));
					return cond;
				}
			)
		);
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_CAL_BASE",
				$CAL_BASE3,
				new String[][]{
						{"bill_cl_cal_cd", "cal_cd"}
				},
				() -> {
					return mcframe.serverMA.dbc.MAM_CAL_BASE_R.create("CAL_BASE3");
				},
				(alias) -> {
					MAM_CO_R own = MAM_CO_R.create(alias);
					mcframe.serverMA.dbc.MAM_CAL_BASE_R ref = mcframe.serverMA.dbc.MAM_CAL_BASE_R.create("CAL_BASE3");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.bill_cl_cal_cd.eq(ref.cal_cd));
					return cond;
				}
			)
		);
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_CAL_BASE",
				$CAL_BASE4,
				new String[][]{
						{"rcv_cl_cal_cd", "cal_cd"}
				},
				() -> {
					return mcframe.serverMA.dbc.MAM_CAL_BASE_R.create("CAL_BASE4");
				},
				(alias) -> {
					MAM_CO_R own = MAM_CO_R.create(alias);
					mcframe.serverMA.dbc.MAM_CAL_BASE_R ref = mcframe.serverMA.dbc.MAM_CAL_BASE_R.create("CAL_BASE4");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.rcv_cl_cal_cd.eq(ref.cal_cd));
					return cond;
				}
			)
		);
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_CAL_BASE",
				$CAL_BASE5,
				new String[][]{
						{"purc_cl_cal_cd", "cal_cd"}
				},
				() -> {
					return mcframe.serverMA.dbc.MAM_CAL_BASE_R.create("CAL_BASE5");
				},
				(alias) -> {
					MAM_CO_R own = MAM_CO_R.create(alias);
					mcframe.serverMA.dbc.MAM_CAL_BASE_R ref = mcframe.serverMA.dbc.MAM_CAL_BASE_R.create("CAL_BASE5");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.purc_cl_cal_cd.eq(ref.cal_cd));
					return cond;
				}
			)
		);
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_CAL_BASE",
				$CAL_BASE6,
				new String[][]{
						{"pay_cl_cal_cd", "cal_cd"}
				},
				() -> {
					return mcframe.serverMA.dbc.MAM_CAL_BASE_R.create("CAL_BASE6");
				},
				(alias) -> {
					MAM_CO_R own = MAM_CO_R.create(alias);
					mcframe.serverMA.dbc.MAM_CAL_BASE_R ref = mcframe.serverMA.dbc.MAM_CAL_BASE_R.create("CAL_BASE6");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.pay_cl_cal_cd.eq(ref.cal_cd));
					return cond;
				}
			)
		);
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_CAL_BASE",
				$CAL_BASE7,
				new String[][]{
						{"stk_cl_cal_cd", "cal_cd"}
				},
				() -> {
					return mcframe.serverMA.dbc.MAM_CAL_BASE_R.create("CAL_BASE7");
				},
				(alias) -> {
					MAM_CO_R own = MAM_CO_R.create(alias);
					mcframe.serverMA.dbc.MAM_CAL_BASE_R ref = mcframe.serverMA.dbc.MAM_CAL_BASE_R.create("CAL_BASE7");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.stk_cl_cal_cd.eq(ref.cal_cd));
					return cond;
				}
			)
		);
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_XRATE",
				$XRATE1,
				new String[][]{
						{"sls_xrate_cd", "xrate_cd"}
				},
				() -> {
					return mcframe.serverMA.dbc.MAM_XRATE_R.create("XRATE1");
				},
				(alias) -> {
					MAM_CO_R own = MAM_CO_R.create(alias);
					mcframe.serverMA.dbc.MAM_XRATE_R ref = mcframe.serverMA.dbc.MAM_XRATE_R.create("XRATE1");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.sls_xrate_cd.eq(ref.xrate_cd));
					return cond;
				}
			)
		);
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_XRATE",
				$XRATE2,
				new String[][]{
						{"purc_xrate_cd", "xrate_cd"}
				},
				() -> {
					return mcframe.serverMA.dbc.MAM_XRATE_R.create("XRATE2");
				},
				(alias) -> {
					MAM_CO_R own = MAM_CO_R.create(alias);
					mcframe.serverMA.dbc.MAM_XRATE_R ref = mcframe.serverMA.dbc.MAM_XRATE_R.create("XRATE2");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.purc_xrate_cd.eq(ref.xrate_cd));
					return cond;
				}
			)
		);
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_XRATE",
				$XRATE3,
				new String[][]{
						{"prov_xrate_cd", "xrate_cd"}
				},
				() -> {
					return mcframe.serverMA.dbc.MAM_XRATE_R.create("XRATE3");
				},
				(alias) -> {
					MAM_CO_R own = MAM_CO_R.create(alias);
					mcframe.serverMA.dbc.MAM_XRATE_R ref = mcframe.serverMA.dbc.MAM_XRATE_R.create("XRATE3");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.prov_xrate_cd.eq(ref.xrate_cd));
					return cond;
				}
			)
		);
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_XRATE",
				$XRATE5,
				new String[][]{
						{"bill_xrate_cd", "xrate_cd"}
				},
				() -> {
					return mcframe.serverMA.dbc.MAM_XRATE_R.create("XRATE5");
				},
				(alias) -> {
					MAM_CO_R own = MAM_CO_R.create(alias);
					mcframe.serverMA.dbc.MAM_XRATE_R ref = mcframe.serverMA.dbc.MAM_XRATE_R.create("XRATE5");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.bill_xrate_cd.eq(ref.xrate_cd));
					return cond;
				}
			)
		);
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_XRATE",
				$XRATE4,
				new String[][]{
						{"pay_xrate_cd", "xrate_cd"}
				},
				() -> {
					return mcframe.serverMA.dbc.MAM_XRATE_R.create("XRATE4");
				},
				(alias) -> {
					MAM_CO_R own = MAM_CO_R.create(alias);
					mcframe.serverMA.dbc.MAM_XRATE_R ref = mcframe.serverMA.dbc.MAM_XRATE_R.create("XRATE4");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.pay_xrate_cd.eq(ref.xrate_cd));
					return cond;
				}
			)
		);
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_PO_PRINT",
				$PO_PRINT1,
				new String[][]{
						{"po_print_cd", "po_print_cd"}
				},
				() -> {
					return mcframe.serverMA.dbc.MAM_PO_PRINT_R.create("PO_PRINT1");
				},
				(alias) -> {
					MAM_CO_R own = MAM_CO_R.create(alias);
					mcframe.serverMA.dbc.MAM_PO_PRINT_R ref = mcframe.serverMA.dbc.MAM_PO_PRINT_R.create("PO_PRINT1");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.po_print_cd.eq(ref.po_print_cd));
					return cond;
				}
			)
		);
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_CAL_BASE",
				$CAL_BASE8,
				new String[][]{
						{"pay_schd_cl_cal_cd", "cal_cd"}
				},
				() -> {
					return mcframe.serverMA.dbc.MAM_CAL_BASE_R.create("CAL_BASE8");
				},
				(alias) -> {
					MAM_CO_R own = MAM_CO_R.create(alias);
					mcframe.serverMA.dbc.MAM_CAL_BASE_R ref = mcframe.serverMA.dbc.MAM_CAL_BASE_R.create("CAL_BASE8");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.pay_schd_cl_cal_cd.eq(ref.cal_cd));
					return cond;
				}
			)
		);
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_EXT_SYS",
				$EXT_SYS1,
				new String[][]{
						{"rpt_strg_ext_sys_cd", "ext_sys_cd"}
				},
				() -> {
					return mcframe.serverMA.dbc.MAM_EXT_SYS_R.create("EXT_SYS1");
				},
				(alias) -> {
					MAM_CO_R own = MAM_CO_R.create(alias);
					mcframe.serverMA.dbc.MAM_EXT_SYS_R ref = mcframe.serverMA.dbc.MAM_EXT_SYS_R.create("EXT_SYS1");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.rpt_strg_ext_sys_cd.eq(ref.ext_sys_cd));
					return cond;
				}
			)
		);
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"FCM_CO",
				$CO1,
				new String[][]{
						{"co_cd", "co_cd"}
				},
				() -> {
					return mcframe.serverCore.dbc.FCM_CO_R.create("CO1");
				},
				(alias) -> {
					MAM_CO_R own = MAM_CO_R.create(alias);
					mcframe.serverCore.dbc.FCM_CO_R ref = mcframe.serverCore.dbc.FCM_CO_R.create("CO1");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.co_cd.eq(ref.co_cd));
					return cond;
				}
			)
		);
	}
	
	protected static final ConstMetaList<MAM_CO_R> constMetas = new ConstMetaList<MAM_CO_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			co_cd_META,
			co_alt_nm1_META,
			base_co_alt_nm1_META,
			co_alt_nm2_META,
			base_co_alt_nm2_META,
			co_alt_nm3_META,
			base_co_alt_nm3_META,
			co_alt_nm4_META,
			base_co_alt_nm4_META,
			zip_cd_META,
			base_zip_cd_META,
			addr1_META,
			base_addr1_META,
			addr2_META,
			base_addr2_META,
			addr3_META,
			base_addr3_META,
			addr4_META,
			base_addr4_META,
			tel_META,
			base_tel_META,
			fax_META,
			base_fax_META,
			co_repl_nm_META,
			base_co_repl_nm_META,
			ein_META,
			biz_co_no_META,
			std_co_cd_META,
			cntry_cd_META,
			area_cd_META,
			base_cur_cd_META,
			ptax_cur_cd_META,
			st_mon_META,
			ac_cl_day_META,
			ac_cl_mon_base_META,
			dt_switch_time_META,
			ar_no_use_flg_META,
			ap_no_use_flg_META,
			temp_ap_use_flg_META,
			std_cal_cd_META,
			bill_cl_cal_cd_META,
			pay_schd_cl_cal_cd_META,
			sls_cl_flg_META,
			rcv_cl_flg_META,
			purc_cl_flg_META,
			pay_cl_flg_META,
			sls_cl_cal_cd_META,
			rcv_cl_cal_cd_META,
			purc_cl_cal_cd_META,
			pay_cl_cal_cd_META,
			stk_cl_cal_cd_META,
			sls_cl_delay_days_META,
			sls_cl_ba_typ_META,
			rcv_cl_delay_days_META,
			rcv_cl_ba_typ_META,
			purc_cl_delay_days_META,
			purc_cl_ba_typ_META,
			pay_cl_delay_days_META,
			pay_cl_ba_typ_META,
			stk_cl_delay_days_META,
			stk_cl_ba_typ_META,
			sls_xrate_cd_META,
			purc_xrate_cd_META,
			prov_xrate_cd_META,
			bill_xrate_conv_flg_META,
			bill_xrate_cd_META,
			pay_xrate_conv_flg_META,
			pay_xrate_cd_META,
			mon01_xrate_rev_flg_META,
			mon02_xrate_rev_flg_META,
			mon03_xrate_rev_flg_META,
			mon04_xrate_rev_flg_META,
			mon05_xrate_rev_flg_META,
			mon06_xrate_rev_flg_META,
			mon07_xrate_rev_flg_META,
			mon08_xrate_rev_flg_META,
			mon09_xrate_rev_flg_META,
			mon10_xrate_rev_flg_META,
			mon11_xrate_rev_flg_META,
			mon12_xrate_rev_flg_META,
			sls_upri_req_typ_META,
			purc_upri_req_typ_META,
			outsrc_upri_typ_META,
			sls_basis_typ_META,
			bill_basis_typ_META,
			ship_schd_split_typ_META,
			xfr_stk_mng_typ_META,
			setoff_tax_rnd_typ_META,
			xrate_rnd_typ_META,
			com_paid_tax_rnd_typ_META,
			wtax_rnd_typ_META,
			stk_amt_rnd_typ_META,
			stk_amt_dec_place_META,
			sls_bdj_rnd_typ_META,
			po_print_cd_META,
			stk_lst_cnf_num_META,
			stk_lst_limit_num_META,
			gm_std_upri_typ_META,
			stk_std_upri_typ_META,
			ac_slip_digit_META,
			ac_slip_seq_flg_META,
			cst_prnt_typ_META,
			acst_prnt_typ_META,
			bcst_prnt_typ_META,
			rcst_prnt_typ_META,
			sppl_prnt_typ_META,
			asppl_prnt_typ_META,
			bsppl_prnt_typ_META,
			psppl_prnt_typ_META,
			dlv_prnt_typ_META,
			rpt_strg_ext_sys_cd_META,
			memo1_META,
			memo2_META,
			memo3_META,
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
			early_ship_dt_add_days_META,
			co_nm_META,
			cntry_nm_META,
			area_nm_META,
			base_cur_nm_META,
			ptax_cur_nm_META,
			std_cal_nm_META,
			sls_cl_cal_nm_META,
			bill_cl_cal_nm_META,
			rcv_cl_cal_nm_META,
			purc_cl_cal_nm_META,
			pay_cl_cal_nm_META,
			stk_cl_cal_nm_META,
			sls_xrate_nm_META,
			purc_xrate_nm_META,
			prov_xrate_nm_META,
			pay_xrate_nm_META,
			bill_xrate_nm_META,
			po_print_nm_META,
			pay_schd_cl_cal_nm_META,
			rpt_strg_ext_sys_nm_META
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
	protected MAM_CO_R(ConstMetaList<? extends MAM_CO_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MAM_CO_R(ConstMetaList<? extends MAM_CO_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MAM_CO_R.$co_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CO_R.$co_cd,
				"co_cd",
				co_cd,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CO_R.$co_alt_nm1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CO_R.$co_alt_nm1,
				"co_alt_nm1",
				co_alt_nm1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CO_R.$base_co_alt_nm1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CO_R.$base_co_alt_nm1,
				"base_co_alt_nm1",
				base_co_alt_nm1,
				false,
				true,
				true,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CO_R.$co_alt_nm2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CO_R.$co_alt_nm2,
				"co_alt_nm2",
				co_alt_nm2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CO_R.$base_co_alt_nm2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CO_R.$base_co_alt_nm2,
				"base_co_alt_nm2",
				base_co_alt_nm2,
				false,
				true,
				true,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CO_R.$co_alt_nm3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CO_R.$co_alt_nm3,
				"co_alt_nm3",
				co_alt_nm3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CO_R.$base_co_alt_nm3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CO_R.$base_co_alt_nm3,
				"base_co_alt_nm3",
				base_co_alt_nm3,
				false,
				true,
				true,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CO_R.$co_alt_nm4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CO_R.$co_alt_nm4,
				"co_alt_nm4",
				co_alt_nm4,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CO_R.$base_co_alt_nm4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CO_R.$base_co_alt_nm4,
				"base_co_alt_nm4",
				base_co_alt_nm4,
				false,
				true,
				true,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CO_R.$zip_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CO_R.$zip_cd,
				"zip_cd",
				zip_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CO_R.$base_zip_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CO_R.$base_zip_cd,
				"base_zip_cd",
				base_zip_cd,
				false,
				true,
				true,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CO_R.$addr1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CO_R.$addr1,
				"addr1",
				addr1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CO_R.$base_addr1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CO_R.$base_addr1,
				"base_addr1",
				base_addr1,
				false,
				true,
				true,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CO_R.$addr2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CO_R.$addr2,
				"addr2",
				addr2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CO_R.$base_addr2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CO_R.$base_addr2,
				"base_addr2",
				base_addr2,
				false,
				true,
				true,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CO_R.$addr3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CO_R.$addr3,
				"addr3",
				addr3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CO_R.$base_addr3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CO_R.$base_addr3,
				"base_addr3",
				base_addr3,
				false,
				true,
				true,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CO_R.$addr4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CO_R.$addr4,
				"addr4",
				addr4,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CO_R.$base_addr4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CO_R.$base_addr4,
				"base_addr4",
				base_addr4,
				false,
				true,
				true,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CO_R.$tel,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CO_R.$tel,
				"tel",
				tel,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CO_R.$base_tel,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CO_R.$base_tel,
				"base_tel",
				base_tel,
				false,
				true,
				true,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CO_R.$fax,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CO_R.$fax,
				"fax",
				fax,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CO_R.$base_fax,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CO_R.$base_fax,
				"base_fax",
				base_fax,
				false,
				true,
				true,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CO_R.$co_repl_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CO_R.$co_repl_nm,
				"co_repl_nm",
				co_repl_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CO_R.$base_co_repl_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CO_R.$base_co_repl_nm,
				"base_co_repl_nm",
				base_co_repl_nm,
				false,
				true,
				true,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CO_R.$ein,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CO_R.$ein,
				"ein",
				ein,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CO_R.$biz_co_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CO_R.$biz_co_no,
				"biz_co_no",
				biz_co_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CO_R.$std_co_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CO_R.$std_co_cd,
				"std_co_cd",
				std_co_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CO_R.$cntry_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CO_R.$cntry_cd,
				"cntry_cd",
				cntry_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CO_R.$area_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CO_R.$area_cd,
				"area_cd",
				area_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CO_R.$base_cur_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CO_R.$base_cur_cd,
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
			MAM_CO_R.$ptax_cur_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CO_R.$ptax_cur_cd,
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
			MAM_CO_R.$st_mon,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_CO_R.$st_mon,
				"st_mon",
				st_mon,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CO_R.$ac_cl_day,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_CO_R.$ac_cl_day,
				"ac_cl_day",
				ac_cl_day,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CO_R.$ac_cl_mon_base,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_CO_R.$ac_cl_mon_base,
				"ac_cl_mon_base",
				ac_cl_mon_base,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CO_R.$dt_switch_time,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_CO_R.$dt_switch_time,
				"dt_switch_time",
				dt_switch_time,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CO_R.$ar_no_use_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_CO_R.$ar_no_use_flg,
				"ar_no_use_flg",
				ar_no_use_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CO_R.$ap_no_use_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_CO_R.$ap_no_use_flg,
				"ap_no_use_flg",
				ap_no_use_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CO_R.$temp_ap_use_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_CO_R.$temp_ap_use_flg,
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
			MAM_CO_R.$std_cal_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CO_R.$std_cal_cd,
				"std_cal_cd",
				std_cal_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CO_R.$bill_cl_cal_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CO_R.$bill_cl_cal_cd,
				"bill_cl_cal_cd",
				bill_cl_cal_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CO_R.$pay_schd_cl_cal_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CO_R.$pay_schd_cl_cal_cd,
				"pay_schd_cl_cal_cd",
				pay_schd_cl_cal_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CO_R.$sls_cl_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_CO_R.$sls_cl_flg,
				"sls_cl_flg",
				sls_cl_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CO_R.$rcv_cl_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_CO_R.$rcv_cl_flg,
				"rcv_cl_flg",
				rcv_cl_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CO_R.$purc_cl_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_CO_R.$purc_cl_flg,
				"purc_cl_flg",
				purc_cl_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CO_R.$pay_cl_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_CO_R.$pay_cl_flg,
				"pay_cl_flg",
				pay_cl_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CO_R.$sls_cl_cal_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CO_R.$sls_cl_cal_cd,
				"sls_cl_cal_cd",
				sls_cl_cal_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CO_R.$rcv_cl_cal_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CO_R.$rcv_cl_cal_cd,
				"rcv_cl_cal_cd",
				rcv_cl_cal_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CO_R.$purc_cl_cal_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CO_R.$purc_cl_cal_cd,
				"purc_cl_cal_cd",
				purc_cl_cal_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CO_R.$pay_cl_cal_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CO_R.$pay_cl_cal_cd,
				"pay_cl_cal_cd",
				pay_cl_cal_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CO_R.$stk_cl_cal_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CO_R.$stk_cl_cal_cd,
				"stk_cl_cal_cd",
				stk_cl_cal_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CO_R.$sls_cl_delay_days,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_CO_R.$sls_cl_delay_days,
				"sls_cl_delay_days",
				sls_cl_delay_days,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CO_R.$sls_cl_ba_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CO_R.$sls_cl_ba_typ,
				"sls_cl_ba_typ",
				sls_cl_ba_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CO_R.$rcv_cl_delay_days,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_CO_R.$rcv_cl_delay_days,
				"rcv_cl_delay_days",
				rcv_cl_delay_days,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CO_R.$rcv_cl_ba_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CO_R.$rcv_cl_ba_typ,
				"rcv_cl_ba_typ",
				rcv_cl_ba_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CO_R.$purc_cl_delay_days,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_CO_R.$purc_cl_delay_days,
				"purc_cl_delay_days",
				purc_cl_delay_days,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CO_R.$purc_cl_ba_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CO_R.$purc_cl_ba_typ,
				"purc_cl_ba_typ",
				purc_cl_ba_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CO_R.$pay_cl_delay_days,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_CO_R.$pay_cl_delay_days,
				"pay_cl_delay_days",
				pay_cl_delay_days,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CO_R.$pay_cl_ba_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CO_R.$pay_cl_ba_typ,
				"pay_cl_ba_typ",
				pay_cl_ba_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CO_R.$stk_cl_delay_days,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_CO_R.$stk_cl_delay_days,
				"stk_cl_delay_days",
				stk_cl_delay_days,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CO_R.$stk_cl_ba_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CO_R.$stk_cl_ba_typ,
				"stk_cl_ba_typ",
				stk_cl_ba_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CO_R.$sls_xrate_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CO_R.$sls_xrate_cd,
				"sls_xrate_cd",
				sls_xrate_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CO_R.$purc_xrate_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CO_R.$purc_xrate_cd,
				"purc_xrate_cd",
				purc_xrate_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CO_R.$prov_xrate_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CO_R.$prov_xrate_cd,
				"prov_xrate_cd",
				prov_xrate_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CO_R.$bill_xrate_conv_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_CO_R.$bill_xrate_conv_flg,
				"bill_xrate_conv_flg",
				bill_xrate_conv_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CO_R.$bill_xrate_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CO_R.$bill_xrate_cd,
				"bill_xrate_cd",
				bill_xrate_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CO_R.$pay_xrate_conv_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_CO_R.$pay_xrate_conv_flg,
				"pay_xrate_conv_flg",
				pay_xrate_conv_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CO_R.$pay_xrate_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CO_R.$pay_xrate_cd,
				"pay_xrate_cd",
				pay_xrate_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CO_R.$mon01_xrate_rev_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_CO_R.$mon01_xrate_rev_flg,
				"mon01_xrate_rev_flg",
				mon01_xrate_rev_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CO_R.$mon02_xrate_rev_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_CO_R.$mon02_xrate_rev_flg,
				"mon02_xrate_rev_flg",
				mon02_xrate_rev_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CO_R.$mon03_xrate_rev_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_CO_R.$mon03_xrate_rev_flg,
				"mon03_xrate_rev_flg",
				mon03_xrate_rev_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CO_R.$mon04_xrate_rev_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_CO_R.$mon04_xrate_rev_flg,
				"mon04_xrate_rev_flg",
				mon04_xrate_rev_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CO_R.$mon05_xrate_rev_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_CO_R.$mon05_xrate_rev_flg,
				"mon05_xrate_rev_flg",
				mon05_xrate_rev_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CO_R.$mon06_xrate_rev_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_CO_R.$mon06_xrate_rev_flg,
				"mon06_xrate_rev_flg",
				mon06_xrate_rev_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CO_R.$mon07_xrate_rev_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_CO_R.$mon07_xrate_rev_flg,
				"mon07_xrate_rev_flg",
				mon07_xrate_rev_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CO_R.$mon08_xrate_rev_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_CO_R.$mon08_xrate_rev_flg,
				"mon08_xrate_rev_flg",
				mon08_xrate_rev_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CO_R.$mon09_xrate_rev_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_CO_R.$mon09_xrate_rev_flg,
				"mon09_xrate_rev_flg",
				mon09_xrate_rev_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CO_R.$mon10_xrate_rev_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_CO_R.$mon10_xrate_rev_flg,
				"mon10_xrate_rev_flg",
				mon10_xrate_rev_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CO_R.$mon11_xrate_rev_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_CO_R.$mon11_xrate_rev_flg,
				"mon11_xrate_rev_flg",
				mon11_xrate_rev_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CO_R.$mon12_xrate_rev_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_CO_R.$mon12_xrate_rev_flg,
				"mon12_xrate_rev_flg",
				mon12_xrate_rev_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CO_R.$sls_upri_req_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CO_R.$sls_upri_req_typ,
				"sls_upri_req_typ",
				sls_upri_req_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CO_R.$purc_upri_req_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CO_R.$purc_upri_req_typ,
				"purc_upri_req_typ",
				purc_upri_req_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CO_R.$outsrc_upri_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CO_R.$outsrc_upri_typ,
				"outsrc_upri_typ",
				outsrc_upri_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CO_R.$sls_basis_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CO_R.$sls_basis_typ,
				"sls_basis_typ",
				sls_basis_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CO_R.$bill_basis_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CO_R.$bill_basis_typ,
				"bill_basis_typ",
				bill_basis_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CO_R.$ship_schd_split_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CO_R.$ship_schd_split_typ,
				"ship_schd_split_typ",
				ship_schd_split_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CO_R.$xfr_stk_mng_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CO_R.$xfr_stk_mng_typ,
				"xfr_stk_mng_typ",
				xfr_stk_mng_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CO_R.$setoff_tax_rnd_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CO_R.$setoff_tax_rnd_typ,
				"setoff_tax_rnd_typ",
				setoff_tax_rnd_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CO_R.$xrate_rnd_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CO_R.$xrate_rnd_typ,
				"xrate_rnd_typ",
				xrate_rnd_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CO_R.$com_paid_tax_rnd_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CO_R.$com_paid_tax_rnd_typ,
				"com_paid_tax_rnd_typ",
				com_paid_tax_rnd_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CO_R.$wtax_rnd_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CO_R.$wtax_rnd_typ,
				"wtax_rnd_typ",
				wtax_rnd_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CO_R.$stk_amt_rnd_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CO_R.$stk_amt_rnd_typ,
				"stk_amt_rnd_typ",
				stk_amt_rnd_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CO_R.$stk_amt_dec_place,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_CO_R.$stk_amt_dec_place,
				"stk_amt_dec_place",
				stk_amt_dec_place,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CO_R.$sls_bdj_rnd_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CO_R.$sls_bdj_rnd_typ,
				"sls_bdj_rnd_typ",
				sls_bdj_rnd_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CO_R.$po_print_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CO_R.$po_print_cd,
				"po_print_cd",
				po_print_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CO_R.$stk_lst_cnf_num,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_CO_R.$stk_lst_cnf_num,
				"stk_lst_cnf_num",
				stk_lst_cnf_num,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CO_R.$stk_lst_limit_num,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_CO_R.$stk_lst_limit_num,
				"stk_lst_limit_num",
				stk_lst_limit_num,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CO_R.$gm_std_upri_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CO_R.$gm_std_upri_typ,
				"gm_std_upri_typ",
				gm_std_upri_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CO_R.$stk_std_upri_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CO_R.$stk_std_upri_typ,
				"stk_std_upri_typ",
				stk_std_upri_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CO_R.$ac_slip_digit,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_CO_R.$ac_slip_digit,
				"ac_slip_digit",
				ac_slip_digit,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CO_R.$ac_slip_seq_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_CO_R.$ac_slip_seq_flg,
				"ac_slip_seq_flg",
				ac_slip_seq_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CO_R.$cst_prnt_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CO_R.$cst_prnt_typ,
				"cst_prnt_typ",
				cst_prnt_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CO_R.$acst_prnt_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CO_R.$acst_prnt_typ,
				"acst_prnt_typ",
				acst_prnt_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CO_R.$bcst_prnt_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CO_R.$bcst_prnt_typ,
				"bcst_prnt_typ",
				bcst_prnt_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CO_R.$rcst_prnt_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CO_R.$rcst_prnt_typ,
				"rcst_prnt_typ",
				rcst_prnt_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CO_R.$sppl_prnt_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CO_R.$sppl_prnt_typ,
				"sppl_prnt_typ",
				sppl_prnt_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CO_R.$asppl_prnt_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CO_R.$asppl_prnt_typ,
				"asppl_prnt_typ",
				asppl_prnt_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CO_R.$bsppl_prnt_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CO_R.$bsppl_prnt_typ,
				"bsppl_prnt_typ",
				bsppl_prnt_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CO_R.$psppl_prnt_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CO_R.$psppl_prnt_typ,
				"psppl_prnt_typ",
				psppl_prnt_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CO_R.$dlv_prnt_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CO_R.$dlv_prnt_typ,
				"dlv_prnt_typ",
				dlv_prnt_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CO_R.$rpt_strg_ext_sys_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CO_R.$rpt_strg_ext_sys_cd,
				"rpt_strg_ext_sys_cd",
				rpt_strg_ext_sys_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CO_R.$memo1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CO_R.$memo1,
				"memo1",
				memo1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CO_R.$memo2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CO_R.$memo2,
				"memo2",
				memo2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CO_R.$memo3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CO_R.$memo3,
				"memo3",
				memo3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CO_R.$ins_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CO_R.$ins_usr_id,
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
			MAM_CO_R.$ins_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CO_R.$ins_usr_nm,
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
			MAM_CO_R.$ins_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MAM_CO_R.$ins_ts,
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
			MAM_CO_R.$ins_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CO_R.$ins_func_id,
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
			MAM_CO_R.$upd_cntr,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_CO_R.$upd_cntr,
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
			MAM_CO_R.$upd_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CO_R.$upd_usr_id,
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
			MAM_CO_R.$upd_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CO_R.$upd_usr_nm,
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
			MAM_CO_R.$upd_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MAM_CO_R.$upd_ts,
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
			MAM_CO_R.$upd_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CO_R.$upd_func_id,
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
			MAM_CO_R.$upd_srv_req_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CO_R.$upd_srv_req_no,
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
			MAM_CO_R.$early_ship_dt_add_days,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_CO_R.$early_ship_dt_add_days,
				"early_ship_dt_add_days",
				early_ship_dt_add_days,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_CO_R.$co_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CO_R.$co_nm,
				"co_nm",
				null,
				false,
				true,
				false,
				false,
				true,
				"CO1.CO_NM"
			)
		);
		COLUMN_MAP.put(
			MAM_CO_R.$cntry_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CO_R.$cntry_nm,
				"cntry_nm",
				null,
				false,
				true,
				false,
				false,
				true,
				"CNTRY1.CNTRY_NM"
			)
		);
		COLUMN_MAP.put(
			MAM_CO_R.$area_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CO_R.$area_nm,
				"area_nm",
				null,
				false,
				true,
				false,
				false,
				true,
				"AREA1.AREA_NM"
			)
		);
		COLUMN_MAP.put(
			MAM_CO_R.$base_cur_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CO_R.$base_cur_nm,
				"base_cur_nm",
				null,
				false,
				true,
				false,
				false,
				true,
				"CUR1.CUR_NM"
			)
		);
		COLUMN_MAP.put(
			MAM_CO_R.$ptax_cur_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CO_R.$ptax_cur_nm,
				"ptax_cur_nm",
				null,
				false,
				true,
				false,
				false,
				true,
				"CUR2.CUR_NM"
			)
		);
		COLUMN_MAP.put(
			MAM_CO_R.$std_cal_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CO_R.$std_cal_nm,
				"std_cal_nm",
				null,
				false,
				true,
				false,
				false,
				true,
				"CAL_BASE1.CAL_NM"
			)
		);
		COLUMN_MAP.put(
			MAM_CO_R.$sls_cl_cal_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CO_R.$sls_cl_cal_nm,
				"sls_cl_cal_nm",
				null,
				false,
				true,
				false,
				false,
				true,
				"CAL_BASE2.CAL_NM"
			)
		);
		COLUMN_MAP.put(
			MAM_CO_R.$bill_cl_cal_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CO_R.$bill_cl_cal_nm,
				"bill_cl_cal_nm",
				null,
				false,
				true,
				false,
				false,
				true,
				"CAL_BASE3.CAL_NM"
			)
		);
		COLUMN_MAP.put(
			MAM_CO_R.$rcv_cl_cal_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CO_R.$rcv_cl_cal_nm,
				"rcv_cl_cal_nm",
				null,
				false,
				true,
				false,
				false,
				true,
				"CAL_BASE4.CAL_NM"
			)
		);
		COLUMN_MAP.put(
			MAM_CO_R.$purc_cl_cal_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CO_R.$purc_cl_cal_nm,
				"purc_cl_cal_nm",
				null,
				false,
				true,
				false,
				false,
				true,
				"CAL_BASE5.CAL_NM"
			)
		);
		COLUMN_MAP.put(
			MAM_CO_R.$pay_cl_cal_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CO_R.$pay_cl_cal_nm,
				"pay_cl_cal_nm",
				null,
				false,
				true,
				false,
				false,
				true,
				"CAL_BASE6.CAL_NM"
			)
		);
		COLUMN_MAP.put(
			MAM_CO_R.$stk_cl_cal_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CO_R.$stk_cl_cal_nm,
				"stk_cl_cal_nm",
				null,
				false,
				true,
				false,
				false,
				true,
				"CAL_BASE7.CAL_NM"
			)
		);
		COLUMN_MAP.put(
			MAM_CO_R.$sls_xrate_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CO_R.$sls_xrate_nm,
				"sls_xrate_nm",
				null,
				false,
				true,
				false,
				false,
				true,
				"XRATE1.XRATE_NM"
			)
		);
		COLUMN_MAP.put(
			MAM_CO_R.$purc_xrate_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CO_R.$purc_xrate_nm,
				"purc_xrate_nm",
				null,
				false,
				true,
				false,
				false,
				true,
				"XRATE2.XRATE_NM"
			)
		);
		COLUMN_MAP.put(
			MAM_CO_R.$prov_xrate_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CO_R.$prov_xrate_nm,
				"prov_xrate_nm",
				null,
				false,
				true,
				false,
				false,
				true,
				"XRATE3.XRATE_NM"
			)
		);
		COLUMN_MAP.put(
			MAM_CO_R.$pay_xrate_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CO_R.$pay_xrate_nm,
				"pay_xrate_nm",
				null,
				false,
				true,
				false,
				false,
				true,
				"XRATE4.XRATE_NM"
			)
		);
		COLUMN_MAP.put(
			MAM_CO_R.$bill_xrate_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CO_R.$bill_xrate_nm,
				"bill_xrate_nm",
				null,
				false,
				true,
				false,
				false,
				true,
				"XRATE5.XRATE_NM"
			)
		);
		COLUMN_MAP.put(
			MAM_CO_R.$po_print_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CO_R.$po_print_nm,
				"po_print_nm",
				null,
				false,
				true,
				false,
				false,
				true,
				"PO_PRINT1.PO_PRINT_NM"
			)
		);
		COLUMN_MAP.put(
			MAM_CO_R.$pay_schd_cl_cal_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CO_R.$pay_schd_cl_cal_nm,
				"pay_schd_cl_cal_nm",
				null,
				false,
				true,
				false,
				false,
				true,
				"CAL_BASE8.CAL_NM"
			)
		);
		COLUMN_MAP.put(
			MAM_CO_R.$rpt_strg_ext_sys_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_CO_R.$rpt_strg_ext_sys_nm,
				"rpt_strg_ext_sys_nm",
				null,
				false,
				true,
				false,
				false,
				true,
				"EXT_SYS1.EXT_SYS_NM"
			)
		);
		return COLUMN_MAP;
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MAM_CO_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MAM_CO_R create(String alias) {
		MAM_CO_R row = new MAM_CO_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MAM_CO_R createByName(T proto) {
		MAM_CO_R row = MAM_CO_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAM_CO_R clone() {
		return (MAM_CO_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAM_CO_R createInstance() {
		return (MAM_CO_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAM_CO_R getValues(String... names) {
		return (MAM_CO_R) super.getValues(names);
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
		return true;
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
	 * 会社ＣＤ. Company cd..<p>
	 *
	 */
	public String co_cd() {
		return getConstString(offset + 0, $co_cd);
	}

	/**
	 * 会社ＣＤ. Company cd..<p>
	 *
	 */
	public void co_cd(String value) {
		setConstString(offset + 0, $co_cd, value);
	}

	/**
	 * 会社別名１. Company alias 1.<p>
	 *
	 */
	public String co_alt_nm1() {
		return getConstString(offset + 1, $co_alt_nm1);
	}

	/**
	 * 会社別名１. Company alias 1.<p>
	 *
	 */
	public void co_alt_nm1(String value) {
		setConstString(offset + 1, $co_alt_nm1, value);
	}

	/**
	 * 会社別名１（ベース）. Company alias 1(Base).<p>
	 *
	 */
	public String base_co_alt_nm1() {
		return getConstString(offset + 2, $base_co_alt_nm1);
	}

	/**
	 * 会社別名１（ベース）. Company alias 1(Base).<p>
	 *
	 */
	public void base_co_alt_nm1(String value) {
		setConstString(offset + 2, $base_co_alt_nm1, value);
	}

	/**
	 * 会社別名２. Company alias 2.<p>
	 *
	 */
	public String co_alt_nm2() {
		return getConstString(offset + 3, $co_alt_nm2);
	}

	/**
	 * 会社別名２. Company alias 2.<p>
	 *
	 */
	public void co_alt_nm2(String value) {
		setConstString(offset + 3, $co_alt_nm2, value);
	}

	/**
	 * 会社別名２（ベース）. Company alias 2(Base).<p>
	 *
	 */
	public String base_co_alt_nm2() {
		return getConstString(offset + 4, $base_co_alt_nm2);
	}

	/**
	 * 会社別名２（ベース）. Company alias 2(Base).<p>
	 *
	 */
	public void base_co_alt_nm2(String value) {
		setConstString(offset + 4, $base_co_alt_nm2, value);
	}

	/**
	 * 会社別名３. Company alias 3.<p>
	 *
	 */
	public String co_alt_nm3() {
		return getConstString(offset + 5, $co_alt_nm3);
	}

	/**
	 * 会社別名３. Company alias 3.<p>
	 *
	 */
	public void co_alt_nm3(String value) {
		setConstString(offset + 5, $co_alt_nm3, value);
	}

	/**
	 * 会社別名３（ベース）. Company alias 3(Base).<p>
	 *
	 */
	public String base_co_alt_nm3() {
		return getConstString(offset + 6, $base_co_alt_nm3);
	}

	/**
	 * 会社別名３（ベース）. Company alias 3(Base).<p>
	 *
	 */
	public void base_co_alt_nm3(String value) {
		setConstString(offset + 6, $base_co_alt_nm3, value);
	}

	/**
	 * 会社別名４. Company alias 4.<p>
	 *
	 */
	public String co_alt_nm4() {
		return getConstString(offset + 7, $co_alt_nm4);
	}

	/**
	 * 会社別名４. Company alias 4.<p>
	 *
	 */
	public void co_alt_nm4(String value) {
		setConstString(offset + 7, $co_alt_nm4, value);
	}

	/**
	 * 会社別名４（ベース）. Company alias 4(Base).<p>
	 *
	 */
	public String base_co_alt_nm4() {
		return getConstString(offset + 8, $base_co_alt_nm4);
	}

	/**
	 * 会社別名４（ベース）. Company alias 4(Base).<p>
	 *
	 */
	public void base_co_alt_nm4(String value) {
		setConstString(offset + 8, $base_co_alt_nm4, value);
	}

	/**
	 * 郵便番号. Zip code.<p>
	 *
	 */
	public String zip_cd() {
		return getConstString(offset + 9, $zip_cd);
	}

	/**
	 * 郵便番号. Zip code.<p>
	 *
	 */
	public void zip_cd(String value) {
		setConstString(offset + 9, $zip_cd, value);
	}

	/**
	 * 郵便番号（ベース）. Zip code(Base).<p>
	 *
	 */
	public String base_zip_cd() {
		return getConstString(offset + 10, $base_zip_cd);
	}

	/**
	 * 郵便番号（ベース）. Zip code(Base).<p>
	 *
	 */
	public void base_zip_cd(String value) {
		setConstString(offset + 10, $base_zip_cd, value);
	}

	/**
	 * 住所１. Address 1.<p>
	 *
	 */
	public String addr1() {
		return getConstString(offset + 11, $addr1);
	}

	/**
	 * 住所１. Address 1.<p>
	 *
	 */
	public void addr1(String value) {
		setConstString(offset + 11, $addr1, value);
	}

	/**
	 * 住所１（ベース）. Address 1(Base).<p>
	 *
	 */
	public String base_addr1() {
		return getConstString(offset + 12, $base_addr1);
	}

	/**
	 * 住所１（ベース）. Address 1(Base).<p>
	 *
	 */
	public void base_addr1(String value) {
		setConstString(offset + 12, $base_addr1, value);
	}

	/**
	 * 住所２. Address 2.<p>
	 *
	 */
	public String addr2() {
		return getConstString(offset + 13, $addr2);
	}

	/**
	 * 住所２. Address 2.<p>
	 *
	 */
	public void addr2(String value) {
		setConstString(offset + 13, $addr2, value);
	}

	/**
	 * 住所２（ベース）. Address 2(Base).<p>
	 *
	 */
	public String base_addr2() {
		return getConstString(offset + 14, $base_addr2);
	}

	/**
	 * 住所２（ベース）. Address 2(Base).<p>
	 *
	 */
	public void base_addr2(String value) {
		setConstString(offset + 14, $base_addr2, value);
	}

	/**
	 * 住所３. Address 3.<p>
	 *
	 */
	public String addr3() {
		return getConstString(offset + 15, $addr3);
	}

	/**
	 * 住所３. Address 3.<p>
	 *
	 */
	public void addr3(String value) {
		setConstString(offset + 15, $addr3, value);
	}

	/**
	 * 住所３（ベース）. Address 3(Base).<p>
	 *
	 */
	public String base_addr3() {
		return getConstString(offset + 16, $base_addr3);
	}

	/**
	 * 住所３（ベース）. Address 3(Base).<p>
	 *
	 */
	public void base_addr3(String value) {
		setConstString(offset + 16, $base_addr3, value);
	}

	/**
	 * 住所４. Address 4.<p>
	 *
	 */
	public String addr4() {
		return getConstString(offset + 17, $addr4);
	}

	/**
	 * 住所４. Address 4.<p>
	 *
	 */
	public void addr4(String value) {
		setConstString(offset + 17, $addr4, value);
	}

	/**
	 * 住所４（ベース）. Address 4(Base).<p>
	 *
	 */
	public String base_addr4() {
		return getConstString(offset + 18, $base_addr4);
	}

	/**
	 * 住所４（ベース）. Address 4(Base).<p>
	 *
	 */
	public void base_addr4(String value) {
		setConstString(offset + 18, $base_addr4, value);
	}

	/**
	 * ＴＥＬ. TEL.<p>
	 *
	 */
	public String tel() {
		return getConstString(offset + 19, $tel);
	}

	/**
	 * ＴＥＬ. TEL.<p>
	 *
	 */
	public void tel(String value) {
		setConstString(offset + 19, $tel, value);
	}

	/**
	 * ＴＥＬ（ベース）. TEL(Base).<p>
	 *
	 */
	public String base_tel() {
		return getConstString(offset + 20, $base_tel);
	}

	/**
	 * ＴＥＬ（ベース）. TEL(Base).<p>
	 *
	 */
	public void base_tel(String value) {
		setConstString(offset + 20, $base_tel, value);
	}

	/**
	 * ＦＡＸ. FAX.<p>
	 *
	 */
	public String fax() {
		return getConstString(offset + 21, $fax);
	}

	/**
	 * ＦＡＸ. FAX.<p>
	 *
	 */
	public void fax(String value) {
		setConstString(offset + 21, $fax, value);
	}

	/**
	 * ＦＡＸ（ベース）. FAX(Base).<p>
	 *
	 */
	public String base_fax() {
		return getConstString(offset + 22, $base_fax);
	}

	/**
	 * ＦＡＸ（ベース）. FAX(Base).<p>
	 *
	 */
	public void base_fax(String value) {
		setConstString(offset + 22, $base_fax, value);
	}

	/**
	 * 代表者名. Representative name.<p>
	 *
	 */
	public String co_repl_nm() {
		return getConstString(offset + 23, $co_repl_nm);
	}

	/**
	 * 代表者名. Representative name.<p>
	 *
	 */
	public void co_repl_nm(String value) {
		setConstString(offset + 23, $co_repl_nm, value);
	}

	/**
	 * 代表者名（ベース）. Representative name(Base).<p>
	 *
	 */
	public String base_co_repl_nm() {
		return getConstString(offset + 24, $base_co_repl_nm);
	}

	/**
	 * 代表者名（ベース）. Representative name(Base).<p>
	 *
	 */
	public void base_co_repl_nm(String value) {
		setConstString(offset + 24, $base_co_repl_nm, value);
	}

	/**
	 * 法人番号. Corporation number.<p>
	 *
	 */
	public String ein() {
		return getConstString(offset + 25, $ein);
	}

	/**
	 * 法人番号. Corporation number.<p>
	 *
	 */
	public void ein(String value) {
		setConstString(offset + 25, $ein, value);
	}

	/**
	 * 事業者ＮＯ. Business No..<p>
	 *
	 */
	public String biz_co_no() {
		return getConstString(offset + 26, $biz_co_no);
	}

	/**
	 * 事業者ＮＯ. Business No..<p>
	 *
	 */
	public void biz_co_no(String value) {
		setConstString(offset + 26, $biz_co_no, value);
	}

	/**
	 * 標準企業コード. Standard company code.<p>
	 *
	 */
	public String std_co_cd() {
		return getConstString(offset + 27, $std_co_cd);
	}

	/**
	 * 標準企業コード. Standard company code.<p>
	 *
	 */
	public void std_co_cd(String value) {
		setConstString(offset + 27, $std_co_cd, value);
	}

	/**
	 * 国ＣＤ. Country cd..<p>
	 *
	 */
	public String cntry_cd() {
		return getConstString(offset + 28, $cntry_cd);
	}

	/**
	 * 国ＣＤ. Country cd..<p>
	 *
	 */
	public void cntry_cd(String value) {
		setConstString(offset + 28, $cntry_cd, value);
	}

	/**
	 * 地域ＣＤ. Region cd..<p>
	 *
	 */
	public String area_cd() {
		return getConstString(offset + 29, $area_cd);
	}

	/**
	 * 地域ＣＤ. Region cd..<p>
	 *
	 */
	public void area_cd(String value) {
		setConstString(offset + 29, $area_cd, value);
	}

	/**
	 * 基準通貨ＣＤ. Base currency cd..<p>
	 *
	 */
	public String base_cur_cd() {
		return getConstString(offset + 30, $base_cur_cd);
	}

	/**
	 * 基準通貨ＣＤ. Base currency cd..<p>
	 *
	 */
	public void base_cur_cd(String value) {
		setConstString(offset + 30, $base_cur_cd, value);
	}

	/**
	 * 納税通貨ＣＤ. Taxpaying currency cd..<p>
	 *
	 */
	public String ptax_cur_cd() {
		return getConstString(offset + 31, $ptax_cur_cd);
	}

	/**
	 * 納税通貨ＣＤ. Taxpaying currency cd..<p>
	 *
	 */
	public void ptax_cur_cd(String value) {
		setConstString(offset + 31, $ptax_cur_cd, value);
	}

	/**
	 * 期首年月. Beginning year.<p>
	 *
	 */
	public MCNumber st_mon() {
		return getConstNumber(offset + 32, $st_mon);
	}

	/**
	 * 期首年月. Beginning year.<p>
	 *
	 */
	public void st_mon(MCNumber value) {
		setConstNumber(offset + 32, $st_mon, value);
	}
	
	/**
	 * 期首年月. Beginning year.<p>
	 *
	 */
	public void st_mon(int value) {
		setConstNumber(offset + 32, $st_mon, value);
	}
	
	/**
	 * 期首年月. Beginning year.<p>
	 *
	 */
	public void st_mon(long value) {
		setConstNumber(offset + 32, $st_mon, value);
	}
	
	/**
	 * 期首年月. Beginning year.<p>
	 *
	 */
	public void st_mon(float value) {
		setConstNumber(offset + 32, $st_mon, value);
	}
	
	/**
	 * 期首年月. Beginning year.<p>
	 *
	 */
	public void st_mon(double value) {
		setConstNumber(offset + 32, $st_mon, value);
	}
	
	/**
	 * 会計締日. Accounting closing day.<p>
	 *
	 */
	public MCNumber ac_cl_day() {
		return getConstNumber(offset + 33, $ac_cl_day);
	}

	/**
	 * 会計締日. Accounting closing day.<p>
	 *
	 */
	public void ac_cl_day(MCNumber value) {
		setConstNumber(offset + 33, $ac_cl_day, value);
	}
	
	/**
	 * 会計締日. Accounting closing day.<p>
	 *
	 */
	public void ac_cl_day(int value) {
		setConstNumber(offset + 33, $ac_cl_day, value);
	}
	
	/**
	 * 会計締日. Accounting closing day.<p>
	 *
	 */
	public void ac_cl_day(long value) {
		setConstNumber(offset + 33, $ac_cl_day, value);
	}
	
	/**
	 * 会計締日. Accounting closing day.<p>
	 *
	 */
	public void ac_cl_day(float value) {
		setConstNumber(offset + 33, $ac_cl_day, value);
	}
	
	/**
	 * 会計締日. Accounting closing day.<p>
	 *
	 */
	public void ac_cl_day(double value) {
		setConstNumber(offset + 33, $ac_cl_day, value);
	}
	
	/**
	 * 会計月度基準. Accounting month basis.<p>
	 *
	 */
	public MCNumber ac_cl_mon_base() {
		return getConstNumber(offset + 34, $ac_cl_mon_base);
	}

	/**
	 * 会計月度基準. Accounting month basis.<p>
	 *
	 */
	public void ac_cl_mon_base(MCNumber value) {
		setConstNumber(offset + 34, $ac_cl_mon_base, value);
	}
	
	/**
	 * 会計月度基準. Accounting month basis.<p>
	 *
	 */
	public void ac_cl_mon_base(int value) {
		setConstNumber(offset + 34, $ac_cl_mon_base, value);
	}
	
	/**
	 * 会計月度基準. Accounting month basis.<p>
	 *
	 */
	public void ac_cl_mon_base(long value) {
		setConstNumber(offset + 34, $ac_cl_mon_base, value);
	}
	
	/**
	 * 会計月度基準. Accounting month basis.<p>
	 *
	 */
	public void ac_cl_mon_base(float value) {
		setConstNumber(offset + 34, $ac_cl_mon_base, value);
	}
	
	/**
	 * 会計月度基準. Accounting month basis.<p>
	 *
	 */
	public void ac_cl_mon_base(double value) {
		setConstNumber(offset + 34, $ac_cl_mon_base, value);
	}
	
	/**
	 * 日付切替時間. Date switching time.<p>
	 *
	 */
	public MCNumber dt_switch_time() {
		return getConstNumber(offset + 35, $dt_switch_time);
	}

	/**
	 * 日付切替時間. Date switching time.<p>
	 *
	 */
	public void dt_switch_time(MCNumber value) {
		setConstNumber(offset + 35, $dt_switch_time, value);
	}
	
	/**
	 * 日付切替時間. Date switching time.<p>
	 *
	 */
	public void dt_switch_time(int value) {
		setConstNumber(offset + 35, $dt_switch_time, value);
	}
	
	/**
	 * 日付切替時間. Date switching time.<p>
	 *
	 */
	public void dt_switch_time(long value) {
		setConstNumber(offset + 35, $dt_switch_time, value);
	}
	
	/**
	 * 日付切替時間. Date switching time.<p>
	 *
	 */
	public void dt_switch_time(float value) {
		setConstNumber(offset + 35, $dt_switch_time, value);
	}
	
	/**
	 * 日付切替時間. Date switching time.<p>
	 *
	 */
	public void dt_switch_time(double value) {
		setConstNumber(offset + 35, $dt_switch_time, value);
	}
	
	/**
	 * 債権不使用ＦＬＧ. AR not use flg..<p>
	 *
	 */
	public boolean ar_no_use_flg() {
		return getConstBoolean(offset + 36, $ar_no_use_flg);
	}

	/**
	 * 債権不使用ＦＬＧ. AR not use flg..<p>
	 *
	 */
	public void ar_no_use_flg(boolean value) {
		setConstBoolean(offset + 36, $ar_no_use_flg, value);
	}

	/**
	 * 債務不使用ＦＬＧ. AP not used flg..<p>
	 *
	 */
	public boolean ap_no_use_flg() {
		return getConstBoolean(offset + 37, $ap_no_use_flg);
	}

	/**
	 * 債務不使用ＦＬＧ. AP not used flg..<p>
	 *
	 */
	public void ap_no_use_flg(boolean value) {
		setConstBoolean(offset + 37, $ap_no_use_flg, value);
	}

	/**
	 * 暫定買掛使用ＦＬＧ. Temporary AP use flg..<p>
	 *
	 */
	public boolean temp_ap_use_flg() {
		return getConstBoolean(offset + 38, $temp_ap_use_flg);
	}

	/**
	 * 暫定買掛使用ＦＬＧ. Temporary AP use flg..<p>
	 *
	 */
	public void temp_ap_use_flg(boolean value) {
		setConstBoolean(offset + 38, $temp_ap_use_flg, value);
	}

	/**
	 * 標準カレンダＣＤ. Standard calendar cd..<p>
	 *
	 */
	public String std_cal_cd() {
		return getConstString(offset + 39, $std_cal_cd);
	}

	/**
	 * 標準カレンダＣＤ. Standard calendar cd..<p>
	 *
	 */
	public void std_cal_cd(String value) {
		setConstString(offset + 39, $std_cal_cd, value);
	}

	/**
	 * 請求締カレンダＣＤ. Billing closing calendar cd..<p>
	 *
	 */
	public String bill_cl_cal_cd() {
		return getConstString(offset + 40, $bill_cl_cal_cd);
	}

	/**
	 * 請求締カレンダＣＤ. Billing closing calendar cd..<p>
	 *
	 */
	public void bill_cl_cal_cd(String value) {
		setConstString(offset + 40, $bill_cl_cal_cd, value);
	}

	/**
	 * 支払予定締カレンダＣＤ. Payment schedule closing calendar cd..<p>
	 *
	 */
	public String pay_schd_cl_cal_cd() {
		return getConstString(offset + 41, $pay_schd_cl_cal_cd);
	}

	/**
	 * 支払予定締カレンダＣＤ. Payment schedule closing calendar cd..<p>
	 *
	 */
	public void pay_schd_cl_cal_cd(String value) {
		setConstString(offset + 41, $pay_schd_cl_cal_cd, value);
	}

	/**
	 * 売上締ＦＬＧ. Sales closing flg..<p>
	 *
	 */
	public boolean sls_cl_flg() {
		return getConstBoolean(offset + 42, $sls_cl_flg);
	}

	/**
	 * 売上締ＦＬＧ. Sales closing flg..<p>
	 *
	 */
	public void sls_cl_flg(boolean value) {
		setConstBoolean(offset + 42, $sls_cl_flg, value);
	}

	/**
	 * 入金締ＦＬＧ. Payment received closing flg..<p>
	 *
	 */
	public boolean rcv_cl_flg() {
		return getConstBoolean(offset + 43, $rcv_cl_flg);
	}

	/**
	 * 入金締ＦＬＧ. Payment received closing flg..<p>
	 *
	 */
	public void rcv_cl_flg(boolean value) {
		setConstBoolean(offset + 43, $rcv_cl_flg, value);
	}

	/**
	 * 仕入締ＦＬＧ. Purchase closing flg..<p>
	 *
	 */
	public boolean purc_cl_flg() {
		return getConstBoolean(offset + 44, $purc_cl_flg);
	}

	/**
	 * 仕入締ＦＬＧ. Purchase closing flg..<p>
	 *
	 */
	public void purc_cl_flg(boolean value) {
		setConstBoolean(offset + 44, $purc_cl_flg, value);
	}

	/**
	 * 支払締ＦＬＧ. Payment closing flg..<p>
	 *
	 */
	public boolean pay_cl_flg() {
		return getConstBoolean(offset + 45, $pay_cl_flg);
	}

	/**
	 * 支払締ＦＬＧ. Payment closing flg..<p>
	 *
	 */
	public void pay_cl_flg(boolean value) {
		setConstBoolean(offset + 45, $pay_cl_flg, value);
	}

	/**
	 * 売上締カレンダＣＤ. Sales closing calendar cd..<p>
	 *
	 */
	public String sls_cl_cal_cd() {
		return getConstString(offset + 46, $sls_cl_cal_cd);
	}

	/**
	 * 売上締カレンダＣＤ. Sales closing calendar cd..<p>
	 *
	 */
	public void sls_cl_cal_cd(String value) {
		setConstString(offset + 46, $sls_cl_cal_cd, value);
	}

	/**
	 * 入金締カレンダＣＤ. Payment received closing calendar cd..<p>
	 *
	 */
	public String rcv_cl_cal_cd() {
		return getConstString(offset + 47, $rcv_cl_cal_cd);
	}

	/**
	 * 入金締カレンダＣＤ. Payment received closing calendar cd..<p>
	 *
	 */
	public void rcv_cl_cal_cd(String value) {
		setConstString(offset + 47, $rcv_cl_cal_cd, value);
	}

	/**
	 * 仕入締カレンダＣＤ. Purchase closing calendar cd..<p>
	 *
	 */
	public String purc_cl_cal_cd() {
		return getConstString(offset + 48, $purc_cl_cal_cd);
	}

	/**
	 * 仕入締カレンダＣＤ. Purchase closing calendar cd..<p>
	 *
	 */
	public void purc_cl_cal_cd(String value) {
		setConstString(offset + 48, $purc_cl_cal_cd, value);
	}

	/**
	 * 支払締カレンダＣＤ. Payment closing calendar cd..<p>
	 *
	 */
	public String pay_cl_cal_cd() {
		return getConstString(offset + 49, $pay_cl_cal_cd);
	}

	/**
	 * 支払締カレンダＣＤ. Payment closing calendar cd..<p>
	 *
	 */
	public void pay_cl_cal_cd(String value) {
		setConstString(offset + 49, $pay_cl_cal_cd, value);
	}

	/**
	 * 在庫締カレンダＣＤ. Inventory closing calendar cd..<p>
	 *
	 */
	public String stk_cl_cal_cd() {
		return getConstString(offset + 50, $stk_cl_cal_cd);
	}

	/**
	 * 在庫締カレンダＣＤ. Inventory closing calendar cd..<p>
	 *
	 */
	public void stk_cl_cal_cd(String value) {
		setConstString(offset + 50, $stk_cl_cal_cd, value);
	}

	/**
	 * 売上締日遅延日数. Delay days (Sales closing day).<p>
	 *
	 */
	public MCNumber sls_cl_delay_days() {
		return getConstNumber(offset + 51, $sls_cl_delay_days);
	}

	/**
	 * 売上締日遅延日数. Delay days (Sales closing day).<p>
	 *
	 */
	public void sls_cl_delay_days(MCNumber value) {
		setConstNumber(offset + 51, $sls_cl_delay_days, value);
	}
	
	/**
	 * 売上締日遅延日数. Delay days (Sales closing day).<p>
	 *
	 */
	public void sls_cl_delay_days(int value) {
		setConstNumber(offset + 51, $sls_cl_delay_days, value);
	}
	
	/**
	 * 売上締日遅延日数. Delay days (Sales closing day).<p>
	 *
	 */
	public void sls_cl_delay_days(long value) {
		setConstNumber(offset + 51, $sls_cl_delay_days, value);
	}
	
	/**
	 * 売上締日遅延日数. Delay days (Sales closing day).<p>
	 *
	 */
	public void sls_cl_delay_days(float value) {
		setConstNumber(offset + 51, $sls_cl_delay_days, value);
	}
	
	/**
	 * 売上締日遅延日数. Delay days (Sales closing day).<p>
	 *
	 */
	public void sls_cl_delay_days(double value) {
		setConstNumber(offset + 51, $sls_cl_delay_days, value);
	}
	
	/**
	 * 売上締日前後区分. Sales closing day before/after type.<p>
	 *
	 */
	public String sls_cl_ba_typ() {
		return getConstString(offset + 52, $sls_cl_ba_typ);
	}

	/**
	 * 売上締日前後区分. Sales closing day before/after type.<p>
	 *
	 */
	public void sls_cl_ba_typ(String value) {
		setConstString(offset + 52, $sls_cl_ba_typ, value);
	}

	/**
	 * 入金締日遅延日数. Delayed days (Payment received closing day).<p>
	 *
	 */
	public MCNumber rcv_cl_delay_days() {
		return getConstNumber(offset + 53, $rcv_cl_delay_days);
	}

	/**
	 * 入金締日遅延日数. Delayed days (Payment received closing day).<p>
	 *
	 */
	public void rcv_cl_delay_days(MCNumber value) {
		setConstNumber(offset + 53, $rcv_cl_delay_days, value);
	}
	
	/**
	 * 入金締日遅延日数. Delayed days (Payment received closing day).<p>
	 *
	 */
	public void rcv_cl_delay_days(int value) {
		setConstNumber(offset + 53, $rcv_cl_delay_days, value);
	}
	
	/**
	 * 入金締日遅延日数. Delayed days (Payment received closing day).<p>
	 *
	 */
	public void rcv_cl_delay_days(long value) {
		setConstNumber(offset + 53, $rcv_cl_delay_days, value);
	}
	
	/**
	 * 入金締日遅延日数. Delayed days (Payment received closing day).<p>
	 *
	 */
	public void rcv_cl_delay_days(float value) {
		setConstNumber(offset + 53, $rcv_cl_delay_days, value);
	}
	
	/**
	 * 入金締日遅延日数. Delayed days (Payment received closing day).<p>
	 *
	 */
	public void rcv_cl_delay_days(double value) {
		setConstNumber(offset + 53, $rcv_cl_delay_days, value);
	}
	
	/**
	 * 入金締日前後区分. Payment received closing day before/after type.<p>
	 *
	 */
	public String rcv_cl_ba_typ() {
		return getConstString(offset + 54, $rcv_cl_ba_typ);
	}

	/**
	 * 入金締日前後区分. Payment received closing day before/after type.<p>
	 *
	 */
	public void rcv_cl_ba_typ(String value) {
		setConstString(offset + 54, $rcv_cl_ba_typ, value);
	}

	/**
	 * 仕入締日遅延日数. Delay days (Purchase closing day).<p>
	 *
	 */
	public MCNumber purc_cl_delay_days() {
		return getConstNumber(offset + 55, $purc_cl_delay_days);
	}

	/**
	 * 仕入締日遅延日数. Delay days (Purchase closing day).<p>
	 *
	 */
	public void purc_cl_delay_days(MCNumber value) {
		setConstNumber(offset + 55, $purc_cl_delay_days, value);
	}
	
	/**
	 * 仕入締日遅延日数. Delay days (Purchase closing day).<p>
	 *
	 */
	public void purc_cl_delay_days(int value) {
		setConstNumber(offset + 55, $purc_cl_delay_days, value);
	}
	
	/**
	 * 仕入締日遅延日数. Delay days (Purchase closing day).<p>
	 *
	 */
	public void purc_cl_delay_days(long value) {
		setConstNumber(offset + 55, $purc_cl_delay_days, value);
	}
	
	/**
	 * 仕入締日遅延日数. Delay days (Purchase closing day).<p>
	 *
	 */
	public void purc_cl_delay_days(float value) {
		setConstNumber(offset + 55, $purc_cl_delay_days, value);
	}
	
	/**
	 * 仕入締日遅延日数. Delay days (Purchase closing day).<p>
	 *
	 */
	public void purc_cl_delay_days(double value) {
		setConstNumber(offset + 55, $purc_cl_delay_days, value);
	}
	
	/**
	 * 仕入締日前後区分. Purchase closing day before/after type.<p>
	 *
	 */
	public String purc_cl_ba_typ() {
		return getConstString(offset + 56, $purc_cl_ba_typ);
	}

	/**
	 * 仕入締日前後区分. Purchase closing day before/after type.<p>
	 *
	 */
	public void purc_cl_ba_typ(String value) {
		setConstString(offset + 56, $purc_cl_ba_typ, value);
	}

	/**
	 * 支払締日遅延日数. Delay days (Payment closing day).<p>
	 *
	 */
	public MCNumber pay_cl_delay_days() {
		return getConstNumber(offset + 57, $pay_cl_delay_days);
	}

	/**
	 * 支払締日遅延日数. Delay days (Payment closing day).<p>
	 *
	 */
	public void pay_cl_delay_days(MCNumber value) {
		setConstNumber(offset + 57, $pay_cl_delay_days, value);
	}
	
	/**
	 * 支払締日遅延日数. Delay days (Payment closing day).<p>
	 *
	 */
	public void pay_cl_delay_days(int value) {
		setConstNumber(offset + 57, $pay_cl_delay_days, value);
	}
	
	/**
	 * 支払締日遅延日数. Delay days (Payment closing day).<p>
	 *
	 */
	public void pay_cl_delay_days(long value) {
		setConstNumber(offset + 57, $pay_cl_delay_days, value);
	}
	
	/**
	 * 支払締日遅延日数. Delay days (Payment closing day).<p>
	 *
	 */
	public void pay_cl_delay_days(float value) {
		setConstNumber(offset + 57, $pay_cl_delay_days, value);
	}
	
	/**
	 * 支払締日遅延日数. Delay days (Payment closing day).<p>
	 *
	 */
	public void pay_cl_delay_days(double value) {
		setConstNumber(offset + 57, $pay_cl_delay_days, value);
	}
	
	/**
	 * 支払締日前後区分. Payment closing day before/after type.<p>
	 *
	 */
	public String pay_cl_ba_typ() {
		return getConstString(offset + 58, $pay_cl_ba_typ);
	}

	/**
	 * 支払締日前後区分. Payment closing day before/after type.<p>
	 *
	 */
	public void pay_cl_ba_typ(String value) {
		setConstString(offset + 58, $pay_cl_ba_typ, value);
	}

	/**
	 * 在庫締日遅延日数. Delay days (Inventory closing day).<p>
	 *
	 */
	public MCNumber stk_cl_delay_days() {
		return getConstNumber(offset + 59, $stk_cl_delay_days);
	}

	/**
	 * 在庫締日遅延日数. Delay days (Inventory closing day).<p>
	 *
	 */
	public void stk_cl_delay_days(MCNumber value) {
		setConstNumber(offset + 59, $stk_cl_delay_days, value);
	}
	
	/**
	 * 在庫締日遅延日数. Delay days (Inventory closing day).<p>
	 *
	 */
	public void stk_cl_delay_days(int value) {
		setConstNumber(offset + 59, $stk_cl_delay_days, value);
	}
	
	/**
	 * 在庫締日遅延日数. Delay days (Inventory closing day).<p>
	 *
	 */
	public void stk_cl_delay_days(long value) {
		setConstNumber(offset + 59, $stk_cl_delay_days, value);
	}
	
	/**
	 * 在庫締日遅延日数. Delay days (Inventory closing day).<p>
	 *
	 */
	public void stk_cl_delay_days(float value) {
		setConstNumber(offset + 59, $stk_cl_delay_days, value);
	}
	
	/**
	 * 在庫締日遅延日数. Delay days (Inventory closing day).<p>
	 *
	 */
	public void stk_cl_delay_days(double value) {
		setConstNumber(offset + 59, $stk_cl_delay_days, value);
	}
	
	/**
	 * 在庫締日前後区分. Inventory closing day before/after type.<p>
	 *
	 */
	public String stk_cl_ba_typ() {
		return getConstString(offset + 60, $stk_cl_ba_typ);
	}

	/**
	 * 在庫締日前後区分. Inventory closing day before/after type.<p>
	 *
	 */
	public void stk_cl_ba_typ(String value) {
		setConstString(offset + 60, $stk_cl_ba_typ, value);
	}

	/**
	 * 売上為替レートＣＤ. Sales exchange rate cd..<p>
	 *
	 */
	public String sls_xrate_cd() {
		return getConstString(offset + 61, $sls_xrate_cd);
	}

	/**
	 * 売上為替レートＣＤ. Sales exchange rate cd..<p>
	 *
	 */
	public void sls_xrate_cd(String value) {
		setConstString(offset + 61, $sls_xrate_cd, value);
	}

	/**
	 * 仕入為替レートＣＤ. Purchase exchange rate cd..<p>
	 *
	 */
	public String purc_xrate_cd() {
		return getConstString(offset + 62, $purc_xrate_cd);
	}

	/**
	 * 仕入為替レートＣＤ. Purchase exchange rate cd..<p>
	 *
	 */
	public void purc_xrate_cd(String value) {
		setConstString(offset + 62, $purc_xrate_cd, value);
	}

	/**
	 * 支給為替レートＣＤ. Supply exchange rate cd..<p>
	 *
	 */
	public String prov_xrate_cd() {
		return getConstString(offset + 63, $prov_xrate_cd);
	}

	/**
	 * 支給為替レートＣＤ. Supply exchange rate cd..<p>
	 *
	 */
	public void prov_xrate_cd(String value) {
		setConstString(offset + 63, $prov_xrate_cd, value);
	}

	/**
	 * 請求時為替レート換算ＦＬＧ. Convert at exchange rate upon billing flg..<p>
	 *
	 */
	public boolean bill_xrate_conv_flg() {
		return getConstBoolean(offset + 64, $bill_xrate_conv_flg);
	}

	/**
	 * 請求時為替レート換算ＦＬＧ. Convert at exchange rate upon billing flg..<p>
	 *
	 */
	public void bill_xrate_conv_flg(boolean value) {
		setConstBoolean(offset + 64, $bill_xrate_conv_flg, value);
	}

	/**
	 * 請求為替レートＣＤ. Billing exchange rate cd..<p>
	 *
	 */
	public String bill_xrate_cd() {
		return getConstString(offset + 65, $bill_xrate_cd);
	}

	/**
	 * 請求為替レートＣＤ. Billing exchange rate cd..<p>
	 *
	 */
	public void bill_xrate_cd(String value) {
		setConstString(offset + 65, $bill_xrate_cd, value);
	}

	/**
	 * 支払照合時為替レート換算ＦＬＧ. Convert at exchange rate upon payment collation flg..<p>
	 *
	 */
	public boolean pay_xrate_conv_flg() {
		return getConstBoolean(offset + 66, $pay_xrate_conv_flg);
	}

	/**
	 * 支払照合時為替レート換算ＦＬＧ. Convert at exchange rate upon payment collation flg..<p>
	 *
	 */
	public void pay_xrate_conv_flg(boolean value) {
		setConstBoolean(offset + 66, $pay_xrate_conv_flg, value);
	}

	/**
	 * 支払照合為替レートＣＤ. Payment collation exchange rate cd..<p>
	 *
	 */
	public String pay_xrate_cd() {
		return getConstString(offset + 67, $pay_xrate_cd);
	}

	/**
	 * 支払照合為替レートＣＤ. Payment collation exchange rate cd..<p>
	 *
	 */
	public void pay_xrate_cd(String value) {
		setConstString(offset + 67, $pay_xrate_cd, value);
	}

	/**
	 * １月為替レート評価替ＦＬＧ. Exchange rate revaluation flg. in January.<p>
	 *
	 */
	public boolean mon01_xrate_rev_flg() {
		return getConstBoolean(offset + 68, $mon01_xrate_rev_flg);
	}

	/**
	 * １月為替レート評価替ＦＬＧ. Exchange rate revaluation flg. in January.<p>
	 *
	 */
	public void mon01_xrate_rev_flg(boolean value) {
		setConstBoolean(offset + 68, $mon01_xrate_rev_flg, value);
	}

	/**
	 * ２月為替レート評価替ＦＬＧ. Exchange rate revaluation flg. in February.<p>
	 *
	 */
	public boolean mon02_xrate_rev_flg() {
		return getConstBoolean(offset + 69, $mon02_xrate_rev_flg);
	}

	/**
	 * ２月為替レート評価替ＦＬＧ. Exchange rate revaluation flg. in February.<p>
	 *
	 */
	public void mon02_xrate_rev_flg(boolean value) {
		setConstBoolean(offset + 69, $mon02_xrate_rev_flg, value);
	}

	/**
	 * ３月為替レート評価替ＦＬＧ. Exchange rate revaluation flg. in March.<p>
	 *
	 */
	public boolean mon03_xrate_rev_flg() {
		return getConstBoolean(offset + 70, $mon03_xrate_rev_flg);
	}

	/**
	 * ３月為替レート評価替ＦＬＧ. Exchange rate revaluation flg. in March.<p>
	 *
	 */
	public void mon03_xrate_rev_flg(boolean value) {
		setConstBoolean(offset + 70, $mon03_xrate_rev_flg, value);
	}

	/**
	 * ４月為替レート評価替ＦＬＧ. Exchange rate revaluation flg. in April.<p>
	 *
	 */
	public boolean mon04_xrate_rev_flg() {
		return getConstBoolean(offset + 71, $mon04_xrate_rev_flg);
	}

	/**
	 * ４月為替レート評価替ＦＬＧ. Exchange rate revaluation flg. in April.<p>
	 *
	 */
	public void mon04_xrate_rev_flg(boolean value) {
		setConstBoolean(offset + 71, $mon04_xrate_rev_flg, value);
	}

	/**
	 * ５月為替レート評価替ＦＬＧ. Exchange rate revaluation flg. in May.<p>
	 *
	 */
	public boolean mon05_xrate_rev_flg() {
		return getConstBoolean(offset + 72, $mon05_xrate_rev_flg);
	}

	/**
	 * ５月為替レート評価替ＦＬＧ. Exchange rate revaluation flg. in May.<p>
	 *
	 */
	public void mon05_xrate_rev_flg(boolean value) {
		setConstBoolean(offset + 72, $mon05_xrate_rev_flg, value);
	}

	/**
	 * ６月為替レート評価替ＦＬＧ. Exchange rate revaluation flg. in June.<p>
	 *
	 */
	public boolean mon06_xrate_rev_flg() {
		return getConstBoolean(offset + 73, $mon06_xrate_rev_flg);
	}

	/**
	 * ６月為替レート評価替ＦＬＧ. Exchange rate revaluation flg. in June.<p>
	 *
	 */
	public void mon06_xrate_rev_flg(boolean value) {
		setConstBoolean(offset + 73, $mon06_xrate_rev_flg, value);
	}

	/**
	 * ７月為替レート評価替ＦＬＧ. Exchange rate revaluation flg. in July.<p>
	 *
	 */
	public boolean mon07_xrate_rev_flg() {
		return getConstBoolean(offset + 74, $mon07_xrate_rev_flg);
	}

	/**
	 * ７月為替レート評価替ＦＬＧ. Exchange rate revaluation flg. in July.<p>
	 *
	 */
	public void mon07_xrate_rev_flg(boolean value) {
		setConstBoolean(offset + 74, $mon07_xrate_rev_flg, value);
	}

	/**
	 * ８月為替レート評価替ＦＬＧ. Exchange rate revaluation flg. in August.<p>
	 *
	 */
	public boolean mon08_xrate_rev_flg() {
		return getConstBoolean(offset + 75, $mon08_xrate_rev_flg);
	}

	/**
	 * ８月為替レート評価替ＦＬＧ. Exchange rate revaluation flg. in August.<p>
	 *
	 */
	public void mon08_xrate_rev_flg(boolean value) {
		setConstBoolean(offset + 75, $mon08_xrate_rev_flg, value);
	}

	/**
	 * ９月為替レート評価替ＦＬＧ. Exchange rate revaluation flg. in September.<p>
	 *
	 */
	public boolean mon09_xrate_rev_flg() {
		return getConstBoolean(offset + 76, $mon09_xrate_rev_flg);
	}

	/**
	 * ９月為替レート評価替ＦＬＧ. Exchange rate revaluation flg. in September.<p>
	 *
	 */
	public void mon09_xrate_rev_flg(boolean value) {
		setConstBoolean(offset + 76, $mon09_xrate_rev_flg, value);
	}

	/**
	 * １０月為替レート評価替ＦＬＧ. Exchange rate revaluation flg. in October.<p>
	 *
	 */
	public boolean mon10_xrate_rev_flg() {
		return getConstBoolean(offset + 77, $mon10_xrate_rev_flg);
	}

	/**
	 * １０月為替レート評価替ＦＬＧ. Exchange rate revaluation flg. in October.<p>
	 *
	 */
	public void mon10_xrate_rev_flg(boolean value) {
		setConstBoolean(offset + 77, $mon10_xrate_rev_flg, value);
	}

	/**
	 * １１月為替レート評価替ＦＬＧ. Exchange rate revaluation flg. in November.<p>
	 *
	 */
	public boolean mon11_xrate_rev_flg() {
		return getConstBoolean(offset + 78, $mon11_xrate_rev_flg);
	}

	/**
	 * １１月為替レート評価替ＦＬＧ. Exchange rate revaluation flg. in November.<p>
	 *
	 */
	public void mon11_xrate_rev_flg(boolean value) {
		setConstBoolean(offset + 78, $mon11_xrate_rev_flg, value);
	}

	/**
	 * １２月為替レート評価替ＦＬＧ. Exchange rate revaluation flg. in December.<p>
	 *
	 */
	public boolean mon12_xrate_rev_flg() {
		return getConstBoolean(offset + 79, $mon12_xrate_rev_flg);
	}

	/**
	 * １２月為替レート評価替ＦＬＧ. Exchange rate revaluation flg. in December.<p>
	 *
	 */
	public void mon12_xrate_rev_flg(boolean value) {
		setConstBoolean(offset + 79, $mon12_xrate_rev_flg, value);
	}

	/**
	 * 販売単価取得区分. Sales unit price acquisition type.<p>
	 *
	 */
	public String sls_upri_req_typ() {
		return getConstString(offset + 80, $sls_upri_req_typ);
	}

	/**
	 * 販売単価取得区分. Sales unit price acquisition type.<p>
	 *
	 */
	public void sls_upri_req_typ(String value) {
		setConstString(offset + 80, $sls_upri_req_typ, value);
	}

	/**
	 * 購買単価取得区分. Purchase unit price acquisition type.<p>
	 *
	 */
	public String purc_upri_req_typ() {
		return getConstString(offset + 81, $purc_upri_req_typ);
	}

	/**
	 * 購買単価取得区分. Purchase unit price acquisition type.<p>
	 *
	 */
	public void purc_upri_req_typ(String value) {
		setConstString(offset + 81, $purc_upri_req_typ, value);
	}

	/**
	 * 外注単価区分. Subcontracting unit price type.<p>
	 *
	 */
	public String outsrc_upri_typ() {
		return getConstString(offset + 82, $outsrc_upri_typ);
	}

	/**
	 * 外注単価区分. Subcontracting unit price type.<p>
	 *
	 */
	public void outsrc_upri_typ(String value) {
		setConstString(offset + 82, $outsrc_upri_typ, value);
	}

	/**
	 * 売上計上区分. Revenue recording type.<p>
	 *
	 */
	public String sls_basis_typ() {
		return getConstString(offset + 83, $sls_basis_typ);
	}

	/**
	 * 売上計上区分. Revenue recording type.<p>
	 *
	 */
	public void sls_basis_typ(String value) {
		setConstString(offset + 83, $sls_basis_typ, value);
	}

	/**
	 * 請求起算区分. Billing initial base type.<p>
	 *
	 */
	public String bill_basis_typ() {
		return getConstString(offset + 84, $bill_basis_typ);
	}

	/**
	 * 請求起算区分. Billing initial base type.<p>
	 *
	 */
	public void bill_basis_typ(String value) {
		setConstString(offset + 84, $bill_basis_typ, value);
	}

	/**
	 * 出荷予定分割区分. Shipping schedule split type.<p>
	 *
	 */
	public String ship_schd_split_typ() {
		return getConstString(offset + 85, $ship_schd_split_typ);
	}

	/**
	 * 出荷予定分割区分. Shipping schedule split type.<p>
	 *
	 */
	public void ship_schd_split_typ(String value) {
		setConstString(offset + 85, $ship_schd_split_typ, value);
	}

	/**
	 * 積送在庫管轄先区分. In-transit inventory controlled site type.<p>
	 *
	 */
	public String xfr_stk_mng_typ() {
		return getConstString(offset + 86, $xfr_stk_mng_typ);
	}

	/**
	 * 積送在庫管轄先区分. In-transit inventory controlled site type.<p>
	 *
	 */
	public void xfr_stk_mng_typ(String value) {
		setConstString(offset + 86, $xfr_stk_mng_typ, value);
	}

	/**
	 * 相殺税額端数処理区分. Offset tax rounding type.<p>
	 *
	 */
	public String setoff_tax_rnd_typ() {
		return getConstString(offset + 87, $setoff_tax_rnd_typ);
	}

	/**
	 * 相殺税額端数処理区分. Offset tax rounding type.<p>
	 *
	 */
	public void setoff_tax_rnd_typ(String value) {
		setConstString(offset + 87, $setoff_tax_rnd_typ, value);
	}

	/**
	 * 為替端数処理区分. Exchange rounding type.<p>
	 *
	 */
	public String xrate_rnd_typ() {
		return getConstString(offset + 88, $xrate_rnd_typ);
	}

	/**
	 * 為替端数処理区分. Exchange rounding type.<p>
	 *
	 */
	public void xrate_rnd_typ(String value) {
		setConstString(offset + 88, $xrate_rnd_typ, value);
	}

	/**
	 * 支払手数料税額端数処理区分. Rounding type (Payment fee tax).<p>
	 *
	 */
	public String com_paid_tax_rnd_typ() {
		return getConstString(offset + 89, $com_paid_tax_rnd_typ);
	}

	/**
	 * 支払手数料税額端数処理区分. Rounding type (Payment fee tax).<p>
	 *
	 */
	public void com_paid_tax_rnd_typ(String value) {
		setConstString(offset + 89, $com_paid_tax_rnd_typ, value);
	}

	/**
	 * 源泉税額端数処理区分. Withholding tax rounding type.<p>
	 *
	 */
	public String wtax_rnd_typ() {
		return getConstString(offset + 90, $wtax_rnd_typ);
	}

	/**
	 * 源泉税額端数処理区分. Withholding tax rounding type.<p>
	 *
	 */
	public void wtax_rnd_typ(String value) {
		setConstString(offset + 90, $wtax_rnd_typ, value);
	}

	/**
	 * 在庫金額端数処理区分. Inventory amount rounding type.<p>
	 *
	 */
	public String stk_amt_rnd_typ() {
		return getConstString(offset + 91, $stk_amt_rnd_typ);
	}

	/**
	 * 在庫金額端数処理区分. Inventory amount rounding type.<p>
	 *
	 */
	public void stk_amt_rnd_typ(String value) {
		setConstString(offset + 91, $stk_amt_rnd_typ, value);
	}

	/**
	 * 在庫金額小数部有効桁数. Inventory amount number of decimal places.<p>
	 *
	 */
	public MCNumber stk_amt_dec_place() {
		return getConstNumber(offset + 92, $stk_amt_dec_place);
	}

	/**
	 * 在庫金額小数部有効桁数. Inventory amount number of decimal places.<p>
	 *
	 */
	public void stk_amt_dec_place(MCNumber value) {
		setConstNumber(offset + 92, $stk_amt_dec_place, value);
	}
	
	/**
	 * 在庫金額小数部有効桁数. Inventory amount number of decimal places.<p>
	 *
	 */
	public void stk_amt_dec_place(int value) {
		setConstNumber(offset + 92, $stk_amt_dec_place, value);
	}
	
	/**
	 * 在庫金額小数部有効桁数. Inventory amount number of decimal places.<p>
	 *
	 */
	public void stk_amt_dec_place(long value) {
		setConstNumber(offset + 92, $stk_amt_dec_place, value);
	}
	
	/**
	 * 在庫金額小数部有効桁数. Inventory amount number of decimal places.<p>
	 *
	 */
	public void stk_amt_dec_place(float value) {
		setConstNumber(offset + 92, $stk_amt_dec_place, value);
	}
	
	/**
	 * 在庫金額小数部有効桁数. Inventory amount number of decimal places.<p>
	 *
	 */
	public void stk_amt_dec_place(double value) {
		setConstNumber(offset + 92, $stk_amt_dec_place, value);
	}
	
	/**
	 * 販売予算単位区分. Sales budget unit type.<p>
	 *
	 */
	public String sls_bdj_rnd_typ() {
		return getConstString(offset + 93, $sls_bdj_rnd_typ);
	}

	/**
	 * 販売予算単位区分. Sales budget unit type.<p>
	 *
	 */
	public void sls_bdj_rnd_typ(String value) {
		setConstString(offset + 93, $sls_bdj_rnd_typ, value);
	}

	/**
	 * 注文書表示ＣＤ. Display PO sheet cd..<p>
	 *
	 */
	public String po_print_cd() {
		return getConstString(offset + 94, $po_print_cd);
	}

	/**
	 * 注文書表示ＣＤ. Display PO sheet cd..<p>
	 *
	 */
	public void po_print_cd(String value) {
		setConstString(offset + 94, $po_print_cd, value);
	}

	/**
	 * 現品票確認枚数. Checked number of identification tags.<p>
	 *
	 */
	public MCNumber stk_lst_cnf_num() {
		return getConstNumber(offset + 95, $stk_lst_cnf_num);
	}

	/**
	 * 現品票確認枚数. Checked number of identification tags.<p>
	 *
	 */
	public void stk_lst_cnf_num(MCNumber value) {
		setConstNumber(offset + 95, $stk_lst_cnf_num, value);
	}
	
	/**
	 * 現品票確認枚数. Checked number of identification tags.<p>
	 *
	 */
	public void stk_lst_cnf_num(int value) {
		setConstNumber(offset + 95, $stk_lst_cnf_num, value);
	}
	
	/**
	 * 現品票確認枚数. Checked number of identification tags.<p>
	 *
	 */
	public void stk_lst_cnf_num(long value) {
		setConstNumber(offset + 95, $stk_lst_cnf_num, value);
	}
	
	/**
	 * 現品票確認枚数. Checked number of identification tags.<p>
	 *
	 */
	public void stk_lst_cnf_num(float value) {
		setConstNumber(offset + 95, $stk_lst_cnf_num, value);
	}
	
	/**
	 * 現品票確認枚数. Checked number of identification tags.<p>
	 *
	 */
	public void stk_lst_cnf_num(double value) {
		setConstNumber(offset + 95, $stk_lst_cnf_num, value);
	}
	
	/**
	 * 現品票印刷上限枚数. Maximum number of identification tag printing.<p>
	 *
	 */
	public MCNumber stk_lst_limit_num() {
		return getConstNumber(offset + 96, $stk_lst_limit_num);
	}

	/**
	 * 現品票印刷上限枚数. Maximum number of identification tag printing.<p>
	 *
	 */
	public void stk_lst_limit_num(MCNumber value) {
		setConstNumber(offset + 96, $stk_lst_limit_num, value);
	}
	
	/**
	 * 現品票印刷上限枚数. Maximum number of identification tag printing.<p>
	 *
	 */
	public void stk_lst_limit_num(int value) {
		setConstNumber(offset + 96, $stk_lst_limit_num, value);
	}
	
	/**
	 * 現品票印刷上限枚数. Maximum number of identification tag printing.<p>
	 *
	 */
	public void stk_lst_limit_num(long value) {
		setConstNumber(offset + 96, $stk_lst_limit_num, value);
	}
	
	/**
	 * 現品票印刷上限枚数. Maximum number of identification tag printing.<p>
	 *
	 */
	public void stk_lst_limit_num(float value) {
		setConstNumber(offset + 96, $stk_lst_limit_num, value);
	}
	
	/**
	 * 現品票印刷上限枚数. Maximum number of identification tag printing.<p>
	 *
	 */
	public void stk_lst_limit_num(double value) {
		setConstNumber(offset + 96, $stk_lst_limit_num, value);
	}
	
	/**
	 * 標準単価取得区分（粗利計算用）. Standard unit cost acquisition type (For gross profit calculation).<p>
	 *
	 */
	public String gm_std_upri_typ() {
		return getConstString(offset + 97, $gm_std_upri_typ);
	}

	/**
	 * 標準単価取得区分（粗利計算用）. Standard unit cost acquisition type (For gross profit calculation).<p>
	 *
	 */
	public void gm_std_upri_typ(String value) {
		setConstString(offset + 97, $gm_std_upri_typ, value);
	}

	/**
	 * 標準単価取得区分（在庫評価用）. Standard unit cost acquisition type (For inventory valuation).<p>
	 *
	 */
	public String stk_std_upri_typ() {
		return getConstString(offset + 98, $stk_std_upri_typ);
	}

	/**
	 * 標準単価取得区分（在庫評価用）. Standard unit cost acquisition type (For inventory valuation).<p>
	 *
	 */
	public void stk_std_upri_typ(String value) {
		setConstString(offset + 98, $stk_std_upri_typ, value);
	}

	/**
	 * 仕訳伝票ＮＯ桁数. Journal slip No. digits.<p>
	 *
	 */
	public MCNumber ac_slip_digit() {
		return getConstNumber(offset + 99, $ac_slip_digit);
	}

	/**
	 * 仕訳伝票ＮＯ桁数. Journal slip No. digits.<p>
	 *
	 */
	public void ac_slip_digit(MCNumber value) {
		setConstNumber(offset + 99, $ac_slip_digit, value);
	}
	
	/**
	 * 仕訳伝票ＮＯ桁数. Journal slip No. digits.<p>
	 *
	 */
	public void ac_slip_digit(int value) {
		setConstNumber(offset + 99, $ac_slip_digit, value);
	}
	
	/**
	 * 仕訳伝票ＮＯ桁数. Journal slip No. digits.<p>
	 *
	 */
	public void ac_slip_digit(long value) {
		setConstNumber(offset + 99, $ac_slip_digit, value);
	}
	
	/**
	 * 仕訳伝票ＮＯ桁数. Journal slip No. digits.<p>
	 *
	 */
	public void ac_slip_digit(float value) {
		setConstNumber(offset + 99, $ac_slip_digit, value);
	}
	
	/**
	 * 仕訳伝票ＮＯ桁数. Journal slip No. digits.<p>
	 *
	 */
	public void ac_slip_digit(double value) {
		setConstNumber(offset + 99, $ac_slip_digit, value);
	}
	
	/**
	 * 貸借明細番号ＦＬＧ. Debit credit details number flg..<p>
	 *
	 */
	public boolean ac_slip_seq_flg() {
		return getConstBoolean(offset + 100, $ac_slip_seq_flg);
	}

	/**
	 * 貸借明細番号ＦＬＧ. Debit credit details number flg..<p>
	 *
	 */
	public void ac_slip_seq_flg(boolean value) {
		setConstBoolean(offset + 100, $ac_slip_seq_flg, value);
	}

	/**
	 * 帳票発行区分（得意先）. Slip issue type (Customer).<p>
	 *
	 */
	public String cst_prnt_typ() {
		return getConstString(offset + 101, $cst_prnt_typ);
	}

	/**
	 * 帳票発行区分（得意先）. Slip issue type (Customer).<p>
	 *
	 */
	public void cst_prnt_typ(String value) {
		setConstString(offset + 101, $cst_prnt_typ, value);
	}

	/**
	 * 帳票発行区分（売掛先）. Slip issue type (AR customer).<p>
	 *
	 */
	public String acst_prnt_typ() {
		return getConstString(offset + 102, $acst_prnt_typ);
	}

	/**
	 * 帳票発行区分（売掛先）. Slip issue type (AR customer).<p>
	 *
	 */
	public void acst_prnt_typ(String value) {
		setConstString(offset + 102, $acst_prnt_typ, value);
	}

	/**
	 * 帳票発行区分（請求先）. Slip issue type (Billing customer).<p>
	 *
	 */
	public String bcst_prnt_typ() {
		return getConstString(offset + 103, $bcst_prnt_typ);
	}

	/**
	 * 帳票発行区分（請求先）. Slip issue type (Billing customer).<p>
	 *
	 */
	public void bcst_prnt_typ(String value) {
		setConstString(offset + 103, $bcst_prnt_typ, value);
	}

	/**
	 * 帳票発行区分（入金先）. Slip issue type (Payer).<p>
	 *
	 */
	public String rcst_prnt_typ() {
		return getConstString(offset + 104, $rcst_prnt_typ);
	}

	/**
	 * 帳票発行区分（入金先）. Slip issue type (Payer).<p>
	 *
	 */
	public void rcst_prnt_typ(String value) {
		setConstString(offset + 104, $rcst_prnt_typ, value);
	}

	/**
	 * 帳票発行区分（発注先）. Slip issue type (Supplier).<p>
	 *
	 */
	public String sppl_prnt_typ() {
		return getConstString(offset + 105, $sppl_prnt_typ);
	}

	/**
	 * 帳票発行区分（発注先）. Slip issue type (Supplier).<p>
	 *
	 */
	public void sppl_prnt_typ(String value) {
		setConstString(offset + 105, $sppl_prnt_typ, value);
	}

	/**
	 * 帳票発行区分（買掛先）. Slip issue type (AP supplier).<p>
	 *
	 */
	public String asppl_prnt_typ() {
		return getConstString(offset + 106, $asppl_prnt_typ);
	}

	/**
	 * 帳票発行区分（買掛先）. Slip issue type (AP supplier).<p>
	 *
	 */
	public void asppl_prnt_typ(String value) {
		setConstString(offset + 106, $asppl_prnt_typ, value);
	}

	/**
	 * 帳票発行区分（支払予定管理先）. Slip issue type (Scheduled payee).<p>
	 *
	 */
	public String bsppl_prnt_typ() {
		return getConstString(offset + 107, $bsppl_prnt_typ);
	}

	/**
	 * 帳票発行区分（支払予定管理先）. Slip issue type (Scheduled payee).<p>
	 *
	 */
	public void bsppl_prnt_typ(String value) {
		setConstString(offset + 107, $bsppl_prnt_typ, value);
	}

	/**
	 * 帳票発行区分（支払先）. Slip issue type (Payee).<p>
	 *
	 */
	public String psppl_prnt_typ() {
		return getConstString(offset + 108, $psppl_prnt_typ);
	}

	/**
	 * 帳票発行区分（支払先）. Slip issue type (Payee).<p>
	 *
	 */
	public void psppl_prnt_typ(String value) {
		setConstString(offset + 108, $psppl_prnt_typ, value);
	}

	/**
	 * 帳票発行区分（納品先）. Slip issue type (Delivery destination).<p>
	 *
	 */
	public String dlv_prnt_typ() {
		return getConstString(offset + 109, $dlv_prnt_typ);
	}

	/**
	 * 帳票発行区分（納品先）. Slip issue type (Delivery destination).<p>
	 *
	 */
	public void dlv_prnt_typ(String value) {
		setConstString(offset + 109, $dlv_prnt_typ, value);
	}

	/**
	 * 帳票保存システムＣＤ. Report storage external system cd..<p>
	 *
	 */
	public String rpt_strg_ext_sys_cd() {
		return getConstString(offset + 110, $rpt_strg_ext_sys_cd);
	}

	/**
	 * 帳票保存システムＣＤ. Report storage external system cd..<p>
	 *
	 */
	public void rpt_strg_ext_sys_cd(String value) {
		setConstString(offset + 110, $rpt_strg_ext_sys_cd, value);
	}

	/**
	 * メモ１. Memo 1.<p>
	 *
	 */
	public String memo1() {
		return getConstString(offset + 111, $memo1);
	}

	/**
	 * メモ１. Memo 1.<p>
	 *
	 */
	public void memo1(String value) {
		setConstString(offset + 111, $memo1, value);
	}

	/**
	 * メモ２. Memo 2.<p>
	 *
	 */
	public String memo2() {
		return getConstString(offset + 112, $memo2);
	}

	/**
	 * メモ２. Memo 2.<p>
	 *
	 */
	public void memo2(String value) {
		setConstString(offset + 112, $memo2, value);
	}

	/**
	 * メモ３. Memo 3.<p>
	 *
	 */
	public String memo3() {
		return getConstString(offset + 113, $memo3);
	}

	/**
	 * メモ３. Memo 3.<p>
	 *
	 */
	public void memo3(String value) {
		setConstString(offset + 113, $memo3, value);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 114, $ins_usr_id);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 114, $ins_usr_id, value);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 115, $ins_usr_nm);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 115, $ins_usr_nm, value);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 116, $ins_ts);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 116, $ins_ts, value);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 117, $ins_func_id);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 117, $ins_func_id, value);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 118, $upd_cntr);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 118, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 118, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 118, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 118, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 118, $upd_cntr, value);
	}
	
	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 119, $upd_usr_id);
	}

	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 119, $upd_usr_id, value);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 120, $upd_usr_nm);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 120, $upd_usr_nm, value);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 121, $upd_ts);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 121, $upd_ts, value);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 122, $upd_func_id);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 122, $upd_func_id, value);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 123, $upd_srv_req_no);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 123, $upd_srv_req_no, value);
	}

	/**
	 * 最早出荷日加算日数. Number of days added to earliest shipping date.<p>
	 *
	 */
	public MCNumber early_ship_dt_add_days() {
		return getConstNumber(offset + 124, $early_ship_dt_add_days);
	}

	/**
	 * 最早出荷日加算日数. Number of days added to earliest shipping date.<p>
	 *
	 */
	public void early_ship_dt_add_days(MCNumber value) {
		setConstNumber(offset + 124, $early_ship_dt_add_days, value);
	}
	
	/**
	 * 最早出荷日加算日数. Number of days added to earliest shipping date.<p>
	 *
	 */
	public void early_ship_dt_add_days(int value) {
		setConstNumber(offset + 124, $early_ship_dt_add_days, value);
	}
	
	/**
	 * 最早出荷日加算日数. Number of days added to earliest shipping date.<p>
	 *
	 */
	public void early_ship_dt_add_days(long value) {
		setConstNumber(offset + 124, $early_ship_dt_add_days, value);
	}
	
	/**
	 * 最早出荷日加算日数. Number of days added to earliest shipping date.<p>
	 *
	 */
	public void early_ship_dt_add_days(float value) {
		setConstNumber(offset + 124, $early_ship_dt_add_days, value);
	}
	
	/**
	 * 最早出荷日加算日数. Number of days added to earliest shipping date.<p>
	 *
	 */
	public void early_ship_dt_add_days(double value) {
		setConstNumber(offset + 124, $early_ship_dt_add_days, value);
	}
	
	/**
	 * 会社名. Company name.<p>
	 *
	 */
	public String co_nm() {
		return getConstString(offset + 125, $co_nm);
	}

	/**
	 * 会社名. Company name.<p>
	 *
	 */
	public void co_nm(String value) {
		setConstString(offset + 125, $co_nm, value);
	}

	/**
	 * 国名. Country name.<p>
	 *
	 */
	public String cntry_nm() {
		return getConstString(offset + 126, $cntry_nm);
	}

	/**
	 * 国名. Country name.<p>
	 *
	 */
	public void cntry_nm(String value) {
		setConstString(offset + 126, $cntry_nm, value);
	}

	/**
	 * 地域名. Region name.<p>
	 *
	 */
	public String area_nm() {
		return getConstString(offset + 127, $area_nm);
	}

	/**
	 * 地域名. Region name.<p>
	 *
	 */
	public void area_nm(String value) {
		setConstString(offset + 127, $area_nm, value);
	}

	/**
	 * 基準通貨名. Base currency name.<p>
	 *
	 */
	public String base_cur_nm() {
		return getConstString(offset + 128, $base_cur_nm);
	}

	/**
	 * 基準通貨名. Base currency name.<p>
	 *
	 */
	public void base_cur_nm(String value) {
		setConstString(offset + 128, $base_cur_nm, value);
	}

	/**
	 * 納税通貨名. Tax currency name.<p>
	 *
	 */
	public String ptax_cur_nm() {
		return getConstString(offset + 129, $ptax_cur_nm);
	}

	/**
	 * 納税通貨名. Tax currency name.<p>
	 *
	 */
	public void ptax_cur_nm(String value) {
		setConstString(offset + 129, $ptax_cur_nm, value);
	}

	/**
	 * 標準カレンダ名. Standard calendar name.<p>
	 *
	 */
	public String std_cal_nm() {
		return getConstString(offset + 130, $std_cal_nm);
	}

	/**
	 * 標準カレンダ名. Standard calendar name.<p>
	 *
	 */
	public void std_cal_nm(String value) {
		setConstString(offset + 130, $std_cal_nm, value);
	}

	/**
	 * 売上締カレンダ名. Sales closing calendar name.<p>
	 *
	 */
	public String sls_cl_cal_nm() {
		return getConstString(offset + 131, $sls_cl_cal_nm);
	}

	/**
	 * 売上締カレンダ名. Sales closing calendar name.<p>
	 *
	 */
	public void sls_cl_cal_nm(String value) {
		setConstString(offset + 131, $sls_cl_cal_nm, value);
	}

	/**
	 * 請求締カレンダ名. Billing closing calendar name.<p>
	 *
	 */
	public String bill_cl_cal_nm() {
		return getConstString(offset + 132, $bill_cl_cal_nm);
	}

	/**
	 * 請求締カレンダ名. Billing closing calendar name.<p>
	 *
	 */
	public void bill_cl_cal_nm(String value) {
		setConstString(offset + 132, $bill_cl_cal_nm, value);
	}

	/**
	 * 入金締カレンダ名. Payment received closing calendar name.<p>
	 *
	 */
	public String rcv_cl_cal_nm() {
		return getConstString(offset + 133, $rcv_cl_cal_nm);
	}

	/**
	 * 入金締カレンダ名. Payment received closing calendar name.<p>
	 *
	 */
	public void rcv_cl_cal_nm(String value) {
		setConstString(offset + 133, $rcv_cl_cal_nm, value);
	}

	/**
	 * 仕入締カレンダ名. Purchase closing calendar name.<p>
	 *
	 */
	public String purc_cl_cal_nm() {
		return getConstString(offset + 134, $purc_cl_cal_nm);
	}

	/**
	 * 仕入締カレンダ名. Purchase closing calendar name.<p>
	 *
	 */
	public void purc_cl_cal_nm(String value) {
		setConstString(offset + 134, $purc_cl_cal_nm, value);
	}

	/**
	 * 支払締カレンダ名. Payment closing calendar name.<p>
	 *
	 */
	public String pay_cl_cal_nm() {
		return getConstString(offset + 135, $pay_cl_cal_nm);
	}

	/**
	 * 支払締カレンダ名. Payment closing calendar name.<p>
	 *
	 */
	public void pay_cl_cal_nm(String value) {
		setConstString(offset + 135, $pay_cl_cal_nm, value);
	}

	/**
	 * 在庫締カレンダ名. Inventory closing calendar name.<p>
	 *
	 */
	public String stk_cl_cal_nm() {
		return getConstString(offset + 136, $stk_cl_cal_nm);
	}

	/**
	 * 在庫締カレンダ名. Inventory closing calendar name.<p>
	 *
	 */
	public void stk_cl_cal_nm(String value) {
		setConstString(offset + 136, $stk_cl_cal_nm, value);
	}

	/**
	 * 売上為替レート名. Sales exchange rate name.<p>
	 *
	 */
	public String sls_xrate_nm() {
		return getConstString(offset + 137, $sls_xrate_nm);
	}

	/**
	 * 売上為替レート名. Sales exchange rate name.<p>
	 *
	 */
	public void sls_xrate_nm(String value) {
		setConstString(offset + 137, $sls_xrate_nm, value);
	}

	/**
	 * 仕入為替レート名. Purchase exchange rate name.<p>
	 *
	 */
	public String purc_xrate_nm() {
		return getConstString(offset + 138, $purc_xrate_nm);
	}

	/**
	 * 仕入為替レート名. Purchase exchange rate name.<p>
	 *
	 */
	public void purc_xrate_nm(String value) {
		setConstString(offset + 138, $purc_xrate_nm, value);
	}

	/**
	 * 支給為替レート名. Supply exchange rate name.<p>
	 *
	 */
	public String prov_xrate_nm() {
		return getConstString(offset + 139, $prov_xrate_nm);
	}

	/**
	 * 支給為替レート名. Supply exchange rate name.<p>
	 *
	 */
	public void prov_xrate_nm(String value) {
		setConstString(offset + 139, $prov_xrate_nm, value);
	}

	/**
	 * 支払照合為替レート名. Payment collation exchange rate name.<p>
	 *
	 */
	public String pay_xrate_nm() {
		return getConstString(offset + 140, $pay_xrate_nm);
	}

	/**
	 * 支払照合為替レート名. Payment collation exchange rate name.<p>
	 *
	 */
	public void pay_xrate_nm(String value) {
		setConstString(offset + 140, $pay_xrate_nm, value);
	}

	/**
	 * 請求為替レート名. Billing exchange rate name.<p>
	 *
	 */
	public String bill_xrate_nm() {
		return getConstString(offset + 141, $bill_xrate_nm);
	}

	/**
	 * 請求為替レート名. Billing exchange rate name.<p>
	 *
	 */
	public void bill_xrate_nm(String value) {
		setConstString(offset + 141, $bill_xrate_nm, value);
	}

	/**
	 * 注文書表示名. Display PO sheet name.<p>
	 *
	 */
	public String po_print_nm() {
		return getConstString(offset + 142, $po_print_nm);
	}

	/**
	 * 注文書表示名. Display PO sheet name.<p>
	 *
	 */
	public void po_print_nm(String value) {
		setConstString(offset + 142, $po_print_nm, value);
	}

	/**
	 * 支払予定締カレンダ名. Payment schedule closing calendar name.<p>
	 *
	 */
	public String pay_schd_cl_cal_nm() {
		return getConstString(offset + 143, $pay_schd_cl_cal_nm);
	}

	/**
	 * 支払予定締カレンダ名. Payment schedule closing calendar name.<p>
	 *
	 */
	public void pay_schd_cl_cal_nm(String value) {
		setConstString(offset + 143, $pay_schd_cl_cal_nm, value);
	}

	/**
	 * 帳票保存システム名. Report storage external system name.<p>
	 *
	 */
	public String rpt_strg_ext_sys_nm() {
		return getConstString(offset + 144, $rpt_strg_ext_sys_nm);
	}

	/**
	 * 帳票保存システム名. Report storage external system name.<p>
	 *
	 */
	public void rpt_strg_ext_sys_nm(String value) {
		setConstString(offset + 144, $rpt_strg_ext_sys_nm, value);
	}

	public String getString(String name) {
		if ($co_cd.equalsIgnoreCase(name)) {
			return co_cd();
		}
		if ($co_alt_nm1.equalsIgnoreCase(name)) {
			return co_alt_nm1();
		}
		if ($base_co_alt_nm1.equalsIgnoreCase(name)) {
			return base_co_alt_nm1();
		}
		if ($co_alt_nm2.equalsIgnoreCase(name)) {
			return co_alt_nm2();
		}
		if ($base_co_alt_nm2.equalsIgnoreCase(name)) {
			return base_co_alt_nm2();
		}
		if ($co_alt_nm3.equalsIgnoreCase(name)) {
			return co_alt_nm3();
		}
		if ($base_co_alt_nm3.equalsIgnoreCase(name)) {
			return base_co_alt_nm3();
		}
		if ($co_alt_nm4.equalsIgnoreCase(name)) {
			return co_alt_nm4();
		}
		if ($base_co_alt_nm4.equalsIgnoreCase(name)) {
			return base_co_alt_nm4();
		}
		if ($zip_cd.equalsIgnoreCase(name)) {
			return zip_cd();
		}
		if ($base_zip_cd.equalsIgnoreCase(name)) {
			return base_zip_cd();
		}
		if ($addr1.equalsIgnoreCase(name)) {
			return addr1();
		}
		if ($base_addr1.equalsIgnoreCase(name)) {
			return base_addr1();
		}
		if ($addr2.equalsIgnoreCase(name)) {
			return addr2();
		}
		if ($base_addr2.equalsIgnoreCase(name)) {
			return base_addr2();
		}
		if ($addr3.equalsIgnoreCase(name)) {
			return addr3();
		}
		if ($base_addr3.equalsIgnoreCase(name)) {
			return base_addr3();
		}
		if ($addr4.equalsIgnoreCase(name)) {
			return addr4();
		}
		if ($base_addr4.equalsIgnoreCase(name)) {
			return base_addr4();
		}
		if ($tel.equalsIgnoreCase(name)) {
			return tel();
		}
		if ($base_tel.equalsIgnoreCase(name)) {
			return base_tel();
		}
		if ($fax.equalsIgnoreCase(name)) {
			return fax();
		}
		if ($base_fax.equalsIgnoreCase(name)) {
			return base_fax();
		}
		if ($co_repl_nm.equalsIgnoreCase(name)) {
			return co_repl_nm();
		}
		if ($base_co_repl_nm.equalsIgnoreCase(name)) {
			return base_co_repl_nm();
		}
		if ($ein.equalsIgnoreCase(name)) {
			return ein();
		}
		if ($biz_co_no.equalsIgnoreCase(name)) {
			return biz_co_no();
		}
		if ($std_co_cd.equalsIgnoreCase(name)) {
			return std_co_cd();
		}
		if ($cntry_cd.equalsIgnoreCase(name)) {
			return cntry_cd();
		}
		if ($area_cd.equalsIgnoreCase(name)) {
			return area_cd();
		}
		if ($base_cur_cd.equalsIgnoreCase(name)) {
			return base_cur_cd();
		}
		if ($ptax_cur_cd.equalsIgnoreCase(name)) {
			return ptax_cur_cd();
		}
		if ($std_cal_cd.equalsIgnoreCase(name)) {
			return std_cal_cd();
		}
		if ($bill_cl_cal_cd.equalsIgnoreCase(name)) {
			return bill_cl_cal_cd();
		}
		if ($pay_schd_cl_cal_cd.equalsIgnoreCase(name)) {
			return pay_schd_cl_cal_cd();
		}
		if ($sls_cl_cal_cd.equalsIgnoreCase(name)) {
			return sls_cl_cal_cd();
		}
		if ($rcv_cl_cal_cd.equalsIgnoreCase(name)) {
			return rcv_cl_cal_cd();
		}
		if ($purc_cl_cal_cd.equalsIgnoreCase(name)) {
			return purc_cl_cal_cd();
		}
		if ($pay_cl_cal_cd.equalsIgnoreCase(name)) {
			return pay_cl_cal_cd();
		}
		if ($stk_cl_cal_cd.equalsIgnoreCase(name)) {
			return stk_cl_cal_cd();
		}
		if ($sls_cl_ba_typ.equalsIgnoreCase(name)) {
			return sls_cl_ba_typ();
		}
		if ($rcv_cl_ba_typ.equalsIgnoreCase(name)) {
			return rcv_cl_ba_typ();
		}
		if ($purc_cl_ba_typ.equalsIgnoreCase(name)) {
			return purc_cl_ba_typ();
		}
		if ($pay_cl_ba_typ.equalsIgnoreCase(name)) {
			return pay_cl_ba_typ();
		}
		if ($stk_cl_ba_typ.equalsIgnoreCase(name)) {
			return stk_cl_ba_typ();
		}
		if ($sls_xrate_cd.equalsIgnoreCase(name)) {
			return sls_xrate_cd();
		}
		if ($purc_xrate_cd.equalsIgnoreCase(name)) {
			return purc_xrate_cd();
		}
		if ($prov_xrate_cd.equalsIgnoreCase(name)) {
			return prov_xrate_cd();
		}
		if ($bill_xrate_cd.equalsIgnoreCase(name)) {
			return bill_xrate_cd();
		}
		if ($pay_xrate_cd.equalsIgnoreCase(name)) {
			return pay_xrate_cd();
		}
		if ($sls_upri_req_typ.equalsIgnoreCase(name)) {
			return sls_upri_req_typ();
		}
		if ($purc_upri_req_typ.equalsIgnoreCase(name)) {
			return purc_upri_req_typ();
		}
		if ($outsrc_upri_typ.equalsIgnoreCase(name)) {
			return outsrc_upri_typ();
		}
		if ($sls_basis_typ.equalsIgnoreCase(name)) {
			return sls_basis_typ();
		}
		if ($bill_basis_typ.equalsIgnoreCase(name)) {
			return bill_basis_typ();
		}
		if ($ship_schd_split_typ.equalsIgnoreCase(name)) {
			return ship_schd_split_typ();
		}
		if ($xfr_stk_mng_typ.equalsIgnoreCase(name)) {
			return xfr_stk_mng_typ();
		}
		if ($setoff_tax_rnd_typ.equalsIgnoreCase(name)) {
			return setoff_tax_rnd_typ();
		}
		if ($xrate_rnd_typ.equalsIgnoreCase(name)) {
			return xrate_rnd_typ();
		}
		if ($com_paid_tax_rnd_typ.equalsIgnoreCase(name)) {
			return com_paid_tax_rnd_typ();
		}
		if ($wtax_rnd_typ.equalsIgnoreCase(name)) {
			return wtax_rnd_typ();
		}
		if ($stk_amt_rnd_typ.equalsIgnoreCase(name)) {
			return stk_amt_rnd_typ();
		}
		if ($sls_bdj_rnd_typ.equalsIgnoreCase(name)) {
			return sls_bdj_rnd_typ();
		}
		if ($po_print_cd.equalsIgnoreCase(name)) {
			return po_print_cd();
		}
		if ($gm_std_upri_typ.equalsIgnoreCase(name)) {
			return gm_std_upri_typ();
		}
		if ($stk_std_upri_typ.equalsIgnoreCase(name)) {
			return stk_std_upri_typ();
		}
		if ($cst_prnt_typ.equalsIgnoreCase(name)) {
			return cst_prnt_typ();
		}
		if ($acst_prnt_typ.equalsIgnoreCase(name)) {
			return acst_prnt_typ();
		}
		if ($bcst_prnt_typ.equalsIgnoreCase(name)) {
			return bcst_prnt_typ();
		}
		if ($rcst_prnt_typ.equalsIgnoreCase(name)) {
			return rcst_prnt_typ();
		}
		if ($sppl_prnt_typ.equalsIgnoreCase(name)) {
			return sppl_prnt_typ();
		}
		if ($asppl_prnt_typ.equalsIgnoreCase(name)) {
			return asppl_prnt_typ();
		}
		if ($bsppl_prnt_typ.equalsIgnoreCase(name)) {
			return bsppl_prnt_typ();
		}
		if ($psppl_prnt_typ.equalsIgnoreCase(name)) {
			return psppl_prnt_typ();
		}
		if ($dlv_prnt_typ.equalsIgnoreCase(name)) {
			return dlv_prnt_typ();
		}
		if ($rpt_strg_ext_sys_cd.equalsIgnoreCase(name)) {
			return rpt_strg_ext_sys_cd();
		}
		if ($memo1.equalsIgnoreCase(name)) {
			return memo1();
		}
		if ($memo2.equalsIgnoreCase(name)) {
			return memo2();
		}
		if ($memo3.equalsIgnoreCase(name)) {
			return memo3();
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
		if ($co_nm.equalsIgnoreCase(name)) {
			return co_nm();
		}
		if ($cntry_nm.equalsIgnoreCase(name)) {
			return cntry_nm();
		}
		if ($area_nm.equalsIgnoreCase(name)) {
			return area_nm();
		}
		if ($base_cur_nm.equalsIgnoreCase(name)) {
			return base_cur_nm();
		}
		if ($ptax_cur_nm.equalsIgnoreCase(name)) {
			return ptax_cur_nm();
		}
		if ($std_cal_nm.equalsIgnoreCase(name)) {
			return std_cal_nm();
		}
		if ($sls_cl_cal_nm.equalsIgnoreCase(name)) {
			return sls_cl_cal_nm();
		}
		if ($bill_cl_cal_nm.equalsIgnoreCase(name)) {
			return bill_cl_cal_nm();
		}
		if ($rcv_cl_cal_nm.equalsIgnoreCase(name)) {
			return rcv_cl_cal_nm();
		}
		if ($purc_cl_cal_nm.equalsIgnoreCase(name)) {
			return purc_cl_cal_nm();
		}
		if ($pay_cl_cal_nm.equalsIgnoreCase(name)) {
			return pay_cl_cal_nm();
		}
		if ($stk_cl_cal_nm.equalsIgnoreCase(name)) {
			return stk_cl_cal_nm();
		}
		if ($sls_xrate_nm.equalsIgnoreCase(name)) {
			return sls_xrate_nm();
		}
		if ($purc_xrate_nm.equalsIgnoreCase(name)) {
			return purc_xrate_nm();
		}
		if ($prov_xrate_nm.equalsIgnoreCase(name)) {
			return prov_xrate_nm();
		}
		if ($pay_xrate_nm.equalsIgnoreCase(name)) {
			return pay_xrate_nm();
		}
		if ($bill_xrate_nm.equalsIgnoreCase(name)) {
			return bill_xrate_nm();
		}
		if ($po_print_nm.equalsIgnoreCase(name)) {
			return po_print_nm();
		}
		if ($pay_schd_cl_cal_nm.equalsIgnoreCase(name)) {
			return pay_schd_cl_cal_nm();
		}
		if ($rpt_strg_ext_sys_nm.equalsIgnoreCase(name)) {
			return rpt_strg_ext_sys_nm();
		}
		return super.getString(name);
	}

	public MCNumber getNumber(String name) {
		if ($st_mon.equalsIgnoreCase(name)) {
			return st_mon();
		}
		if ($ac_cl_day.equalsIgnoreCase(name)) {
			return ac_cl_day();
		}
		if ($ac_cl_mon_base.equalsIgnoreCase(name)) {
			return ac_cl_mon_base();
		}
		if ($dt_switch_time.equalsIgnoreCase(name)) {
			return dt_switch_time();
		}
		if ($sls_cl_delay_days.equalsIgnoreCase(name)) {
			return sls_cl_delay_days();
		}
		if ($rcv_cl_delay_days.equalsIgnoreCase(name)) {
			return rcv_cl_delay_days();
		}
		if ($purc_cl_delay_days.equalsIgnoreCase(name)) {
			return purc_cl_delay_days();
		}
		if ($pay_cl_delay_days.equalsIgnoreCase(name)) {
			return pay_cl_delay_days();
		}
		if ($stk_cl_delay_days.equalsIgnoreCase(name)) {
			return stk_cl_delay_days();
		}
		if ($stk_amt_dec_place.equalsIgnoreCase(name)) {
			return stk_amt_dec_place();
		}
		if ($stk_lst_cnf_num.equalsIgnoreCase(name)) {
			return stk_lst_cnf_num();
		}
		if ($stk_lst_limit_num.equalsIgnoreCase(name)) {
			return stk_lst_limit_num();
		}
		if ($ac_slip_digit.equalsIgnoreCase(name)) {
			return ac_slip_digit();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		if ($early_ship_dt_add_days.equalsIgnoreCase(name)) {
			return early_ship_dt_add_days();
		}
		return super.getNumber(name);
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
		if ($ar_no_use_flg.equalsIgnoreCase(name)) {
			return ar_no_use_flg();
		}
		if ($ap_no_use_flg.equalsIgnoreCase(name)) {
			return ap_no_use_flg();
		}
		if ($temp_ap_use_flg.equalsIgnoreCase(name)) {
			return temp_ap_use_flg();
		}
		if ($sls_cl_flg.equalsIgnoreCase(name)) {
			return sls_cl_flg();
		}
		if ($rcv_cl_flg.equalsIgnoreCase(name)) {
			return rcv_cl_flg();
		}
		if ($purc_cl_flg.equalsIgnoreCase(name)) {
			return purc_cl_flg();
		}
		if ($pay_cl_flg.equalsIgnoreCase(name)) {
			return pay_cl_flg();
		}
		if ($bill_xrate_conv_flg.equalsIgnoreCase(name)) {
			return bill_xrate_conv_flg();
		}
		if ($pay_xrate_conv_flg.equalsIgnoreCase(name)) {
			return pay_xrate_conv_flg();
		}
		if ($mon01_xrate_rev_flg.equalsIgnoreCase(name)) {
			return mon01_xrate_rev_flg();
		}
		if ($mon02_xrate_rev_flg.equalsIgnoreCase(name)) {
			return mon02_xrate_rev_flg();
		}
		if ($mon03_xrate_rev_flg.equalsIgnoreCase(name)) {
			return mon03_xrate_rev_flg();
		}
		if ($mon04_xrate_rev_flg.equalsIgnoreCase(name)) {
			return mon04_xrate_rev_flg();
		}
		if ($mon05_xrate_rev_flg.equalsIgnoreCase(name)) {
			return mon05_xrate_rev_flg();
		}
		if ($mon06_xrate_rev_flg.equalsIgnoreCase(name)) {
			return mon06_xrate_rev_flg();
		}
		if ($mon07_xrate_rev_flg.equalsIgnoreCase(name)) {
			return mon07_xrate_rev_flg();
		}
		if ($mon08_xrate_rev_flg.equalsIgnoreCase(name)) {
			return mon08_xrate_rev_flg();
		}
		if ($mon09_xrate_rev_flg.equalsIgnoreCase(name)) {
			return mon09_xrate_rev_flg();
		}
		if ($mon10_xrate_rev_flg.equalsIgnoreCase(name)) {
			return mon10_xrate_rev_flg();
		}
		if ($mon11_xrate_rev_flg.equalsIgnoreCase(name)) {
			return mon11_xrate_rev_flg();
		}
		if ($mon12_xrate_rev_flg.equalsIgnoreCase(name)) {
			return mon12_xrate_rev_flg();
		}
		if ($ac_slip_seq_flg.equalsIgnoreCase(name)) {
			return ac_slip_seq_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($co_cd.equalsIgnoreCase(name)) {
			return co_cd();
		}
		if ($co_alt_nm1.equalsIgnoreCase(name)) {
			return co_alt_nm1();
		}
		if ($base_co_alt_nm1.equalsIgnoreCase(name)) {
			return base_co_alt_nm1();
		}
		if ($co_alt_nm2.equalsIgnoreCase(name)) {
			return co_alt_nm2();
		}
		if ($base_co_alt_nm2.equalsIgnoreCase(name)) {
			return base_co_alt_nm2();
		}
		if ($co_alt_nm3.equalsIgnoreCase(name)) {
			return co_alt_nm3();
		}
		if ($base_co_alt_nm3.equalsIgnoreCase(name)) {
			return base_co_alt_nm3();
		}
		if ($co_alt_nm4.equalsIgnoreCase(name)) {
			return co_alt_nm4();
		}
		if ($base_co_alt_nm4.equalsIgnoreCase(name)) {
			return base_co_alt_nm4();
		}
		if ($zip_cd.equalsIgnoreCase(name)) {
			return zip_cd();
		}
		if ($base_zip_cd.equalsIgnoreCase(name)) {
			return base_zip_cd();
		}
		if ($addr1.equalsIgnoreCase(name)) {
			return addr1();
		}
		if ($base_addr1.equalsIgnoreCase(name)) {
			return base_addr1();
		}
		if ($addr2.equalsIgnoreCase(name)) {
			return addr2();
		}
		if ($base_addr2.equalsIgnoreCase(name)) {
			return base_addr2();
		}
		if ($addr3.equalsIgnoreCase(name)) {
			return addr3();
		}
		if ($base_addr3.equalsIgnoreCase(name)) {
			return base_addr3();
		}
		if ($addr4.equalsIgnoreCase(name)) {
			return addr4();
		}
		if ($base_addr4.equalsIgnoreCase(name)) {
			return base_addr4();
		}
		if ($tel.equalsIgnoreCase(name)) {
			return tel();
		}
		if ($base_tel.equalsIgnoreCase(name)) {
			return base_tel();
		}
		if ($fax.equalsIgnoreCase(name)) {
			return fax();
		}
		if ($base_fax.equalsIgnoreCase(name)) {
			return base_fax();
		}
		if ($co_repl_nm.equalsIgnoreCase(name)) {
			return co_repl_nm();
		}
		if ($base_co_repl_nm.equalsIgnoreCase(name)) {
			return base_co_repl_nm();
		}
		if ($ein.equalsIgnoreCase(name)) {
			return ein();
		}
		if ($biz_co_no.equalsIgnoreCase(name)) {
			return biz_co_no();
		}
		if ($std_co_cd.equalsIgnoreCase(name)) {
			return std_co_cd();
		}
		if ($cntry_cd.equalsIgnoreCase(name)) {
			return cntry_cd();
		}
		if ($area_cd.equalsIgnoreCase(name)) {
			return area_cd();
		}
		if ($base_cur_cd.equalsIgnoreCase(name)) {
			return base_cur_cd();
		}
		if ($ptax_cur_cd.equalsIgnoreCase(name)) {
			return ptax_cur_cd();
		}
		if ($std_cal_cd.equalsIgnoreCase(name)) {
			return std_cal_cd();
		}
		if ($bill_cl_cal_cd.equalsIgnoreCase(name)) {
			return bill_cl_cal_cd();
		}
		if ($pay_schd_cl_cal_cd.equalsIgnoreCase(name)) {
			return pay_schd_cl_cal_cd();
		}
		if ($sls_cl_cal_cd.equalsIgnoreCase(name)) {
			return sls_cl_cal_cd();
		}
		if ($rcv_cl_cal_cd.equalsIgnoreCase(name)) {
			return rcv_cl_cal_cd();
		}
		if ($purc_cl_cal_cd.equalsIgnoreCase(name)) {
			return purc_cl_cal_cd();
		}
		if ($pay_cl_cal_cd.equalsIgnoreCase(name)) {
			return pay_cl_cal_cd();
		}
		if ($stk_cl_cal_cd.equalsIgnoreCase(name)) {
			return stk_cl_cal_cd();
		}
		if ($sls_cl_ba_typ.equalsIgnoreCase(name)) {
			return sls_cl_ba_typ();
		}
		if ($rcv_cl_ba_typ.equalsIgnoreCase(name)) {
			return rcv_cl_ba_typ();
		}
		if ($purc_cl_ba_typ.equalsIgnoreCase(name)) {
			return purc_cl_ba_typ();
		}
		if ($pay_cl_ba_typ.equalsIgnoreCase(name)) {
			return pay_cl_ba_typ();
		}
		if ($stk_cl_ba_typ.equalsIgnoreCase(name)) {
			return stk_cl_ba_typ();
		}
		if ($sls_xrate_cd.equalsIgnoreCase(name)) {
			return sls_xrate_cd();
		}
		if ($purc_xrate_cd.equalsIgnoreCase(name)) {
			return purc_xrate_cd();
		}
		if ($prov_xrate_cd.equalsIgnoreCase(name)) {
			return prov_xrate_cd();
		}
		if ($bill_xrate_cd.equalsIgnoreCase(name)) {
			return bill_xrate_cd();
		}
		if ($pay_xrate_cd.equalsIgnoreCase(name)) {
			return pay_xrate_cd();
		}
		if ($sls_upri_req_typ.equalsIgnoreCase(name)) {
			return sls_upri_req_typ();
		}
		if ($purc_upri_req_typ.equalsIgnoreCase(name)) {
			return purc_upri_req_typ();
		}
		if ($outsrc_upri_typ.equalsIgnoreCase(name)) {
			return outsrc_upri_typ();
		}
		if ($sls_basis_typ.equalsIgnoreCase(name)) {
			return sls_basis_typ();
		}
		if ($bill_basis_typ.equalsIgnoreCase(name)) {
			return bill_basis_typ();
		}
		if ($ship_schd_split_typ.equalsIgnoreCase(name)) {
			return ship_schd_split_typ();
		}
		if ($xfr_stk_mng_typ.equalsIgnoreCase(name)) {
			return xfr_stk_mng_typ();
		}
		if ($setoff_tax_rnd_typ.equalsIgnoreCase(name)) {
			return setoff_tax_rnd_typ();
		}
		if ($xrate_rnd_typ.equalsIgnoreCase(name)) {
			return xrate_rnd_typ();
		}
		if ($com_paid_tax_rnd_typ.equalsIgnoreCase(name)) {
			return com_paid_tax_rnd_typ();
		}
		if ($wtax_rnd_typ.equalsIgnoreCase(name)) {
			return wtax_rnd_typ();
		}
		if ($stk_amt_rnd_typ.equalsIgnoreCase(name)) {
			return stk_amt_rnd_typ();
		}
		if ($sls_bdj_rnd_typ.equalsIgnoreCase(name)) {
			return sls_bdj_rnd_typ();
		}
		if ($po_print_cd.equalsIgnoreCase(name)) {
			return po_print_cd();
		}
		if ($gm_std_upri_typ.equalsIgnoreCase(name)) {
			return gm_std_upri_typ();
		}
		if ($stk_std_upri_typ.equalsIgnoreCase(name)) {
			return stk_std_upri_typ();
		}
		if ($cst_prnt_typ.equalsIgnoreCase(name)) {
			return cst_prnt_typ();
		}
		if ($acst_prnt_typ.equalsIgnoreCase(name)) {
			return acst_prnt_typ();
		}
		if ($bcst_prnt_typ.equalsIgnoreCase(name)) {
			return bcst_prnt_typ();
		}
		if ($rcst_prnt_typ.equalsIgnoreCase(name)) {
			return rcst_prnt_typ();
		}
		if ($sppl_prnt_typ.equalsIgnoreCase(name)) {
			return sppl_prnt_typ();
		}
		if ($asppl_prnt_typ.equalsIgnoreCase(name)) {
			return asppl_prnt_typ();
		}
		if ($bsppl_prnt_typ.equalsIgnoreCase(name)) {
			return bsppl_prnt_typ();
		}
		if ($psppl_prnt_typ.equalsIgnoreCase(name)) {
			return psppl_prnt_typ();
		}
		if ($dlv_prnt_typ.equalsIgnoreCase(name)) {
			return dlv_prnt_typ();
		}
		if ($rpt_strg_ext_sys_cd.equalsIgnoreCase(name)) {
			return rpt_strg_ext_sys_cd();
		}
		if ($memo1.equalsIgnoreCase(name)) {
			return memo1();
		}
		if ($memo2.equalsIgnoreCase(name)) {
			return memo2();
		}
		if ($memo3.equalsIgnoreCase(name)) {
			return memo3();
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
		if ($co_nm.equalsIgnoreCase(name)) {
			return co_nm();
		}
		if ($cntry_nm.equalsIgnoreCase(name)) {
			return cntry_nm();
		}
		if ($area_nm.equalsIgnoreCase(name)) {
			return area_nm();
		}
		if ($base_cur_nm.equalsIgnoreCase(name)) {
			return base_cur_nm();
		}
		if ($ptax_cur_nm.equalsIgnoreCase(name)) {
			return ptax_cur_nm();
		}
		if ($std_cal_nm.equalsIgnoreCase(name)) {
			return std_cal_nm();
		}
		if ($sls_cl_cal_nm.equalsIgnoreCase(name)) {
			return sls_cl_cal_nm();
		}
		if ($bill_cl_cal_nm.equalsIgnoreCase(name)) {
			return bill_cl_cal_nm();
		}
		if ($rcv_cl_cal_nm.equalsIgnoreCase(name)) {
			return rcv_cl_cal_nm();
		}
		if ($purc_cl_cal_nm.equalsIgnoreCase(name)) {
			return purc_cl_cal_nm();
		}
		if ($pay_cl_cal_nm.equalsIgnoreCase(name)) {
			return pay_cl_cal_nm();
		}
		if ($stk_cl_cal_nm.equalsIgnoreCase(name)) {
			return stk_cl_cal_nm();
		}
		if ($sls_xrate_nm.equalsIgnoreCase(name)) {
			return sls_xrate_nm();
		}
		if ($purc_xrate_nm.equalsIgnoreCase(name)) {
			return purc_xrate_nm();
		}
		if ($prov_xrate_nm.equalsIgnoreCase(name)) {
			return prov_xrate_nm();
		}
		if ($pay_xrate_nm.equalsIgnoreCase(name)) {
			return pay_xrate_nm();
		}
		if ($bill_xrate_nm.equalsIgnoreCase(name)) {
			return bill_xrate_nm();
		}
		if ($po_print_nm.equalsIgnoreCase(name)) {
			return po_print_nm();
		}
		if ($pay_schd_cl_cal_nm.equalsIgnoreCase(name)) {
			return pay_schd_cl_cal_nm();
		}
		if ($rpt_strg_ext_sys_nm.equalsIgnoreCase(name)) {
			return rpt_strg_ext_sys_nm();
		}
		return super.getStringNE(name);
	}

	public MCNumber getNumberNE(String name) {
		if ($st_mon.equalsIgnoreCase(name)) {
			return st_mon();
		}
		if ($ac_cl_day.equalsIgnoreCase(name)) {
			return ac_cl_day();
		}
		if ($ac_cl_mon_base.equalsIgnoreCase(name)) {
			return ac_cl_mon_base();
		}
		if ($dt_switch_time.equalsIgnoreCase(name)) {
			return dt_switch_time();
		}
		if ($sls_cl_delay_days.equalsIgnoreCase(name)) {
			return sls_cl_delay_days();
		}
		if ($rcv_cl_delay_days.equalsIgnoreCase(name)) {
			return rcv_cl_delay_days();
		}
		if ($purc_cl_delay_days.equalsIgnoreCase(name)) {
			return purc_cl_delay_days();
		}
		if ($pay_cl_delay_days.equalsIgnoreCase(name)) {
			return pay_cl_delay_days();
		}
		if ($stk_cl_delay_days.equalsIgnoreCase(name)) {
			return stk_cl_delay_days();
		}
		if ($stk_amt_dec_place.equalsIgnoreCase(name)) {
			return stk_amt_dec_place();
		}
		if ($stk_lst_cnf_num.equalsIgnoreCase(name)) {
			return stk_lst_cnf_num();
		}
		if ($stk_lst_limit_num.equalsIgnoreCase(name)) {
			return stk_lst_limit_num();
		}
		if ($ac_slip_digit.equalsIgnoreCase(name)) {
			return ac_slip_digit();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		if ($early_ship_dt_add_days.equalsIgnoreCase(name)) {
			return early_ship_dt_add_days();
		}
		return super.getNumberNE(name);
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
		if ($ar_no_use_flg.equalsIgnoreCase(name)) {
			return ar_no_use_flg();
		}
		if ($ap_no_use_flg.equalsIgnoreCase(name)) {
			return ap_no_use_flg();
		}
		if ($temp_ap_use_flg.equalsIgnoreCase(name)) {
			return temp_ap_use_flg();
		}
		if ($sls_cl_flg.equalsIgnoreCase(name)) {
			return sls_cl_flg();
		}
		if ($rcv_cl_flg.equalsIgnoreCase(name)) {
			return rcv_cl_flg();
		}
		if ($purc_cl_flg.equalsIgnoreCase(name)) {
			return purc_cl_flg();
		}
		if ($pay_cl_flg.equalsIgnoreCase(name)) {
			return pay_cl_flg();
		}
		if ($bill_xrate_conv_flg.equalsIgnoreCase(name)) {
			return bill_xrate_conv_flg();
		}
		if ($pay_xrate_conv_flg.equalsIgnoreCase(name)) {
			return pay_xrate_conv_flg();
		}
		if ($mon01_xrate_rev_flg.equalsIgnoreCase(name)) {
			return mon01_xrate_rev_flg();
		}
		if ($mon02_xrate_rev_flg.equalsIgnoreCase(name)) {
			return mon02_xrate_rev_flg();
		}
		if ($mon03_xrate_rev_flg.equalsIgnoreCase(name)) {
			return mon03_xrate_rev_flg();
		}
		if ($mon04_xrate_rev_flg.equalsIgnoreCase(name)) {
			return mon04_xrate_rev_flg();
		}
		if ($mon05_xrate_rev_flg.equalsIgnoreCase(name)) {
			return mon05_xrate_rev_flg();
		}
		if ($mon06_xrate_rev_flg.equalsIgnoreCase(name)) {
			return mon06_xrate_rev_flg();
		}
		if ($mon07_xrate_rev_flg.equalsIgnoreCase(name)) {
			return mon07_xrate_rev_flg();
		}
		if ($mon08_xrate_rev_flg.equalsIgnoreCase(name)) {
			return mon08_xrate_rev_flg();
		}
		if ($mon09_xrate_rev_flg.equalsIgnoreCase(name)) {
			return mon09_xrate_rev_flg();
		}
		if ($mon10_xrate_rev_flg.equalsIgnoreCase(name)) {
			return mon10_xrate_rev_flg();
		}
		if ($mon11_xrate_rev_flg.equalsIgnoreCase(name)) {
			return mon11_xrate_rev_flg();
		}
		if ($mon12_xrate_rev_flg.equalsIgnoreCase(name)) {
			return mon12_xrate_rev_flg();
		}
		if ($ac_slip_seq_flg.equalsIgnoreCase(name)) {
			return ac_slip_seq_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($co_cd.equalsIgnoreCase(name)) {
			co_cd(value);
			return;
		}
		if ($co_alt_nm1.equalsIgnoreCase(name)) {
			co_alt_nm1(value);
			return;
		}
		if ($base_co_alt_nm1.equalsIgnoreCase(name)) {
			base_co_alt_nm1(value);
			return;
		}
		if ($co_alt_nm2.equalsIgnoreCase(name)) {
			co_alt_nm2(value);
			return;
		}
		if ($base_co_alt_nm2.equalsIgnoreCase(name)) {
			base_co_alt_nm2(value);
			return;
		}
		if ($co_alt_nm3.equalsIgnoreCase(name)) {
			co_alt_nm3(value);
			return;
		}
		if ($base_co_alt_nm3.equalsIgnoreCase(name)) {
			base_co_alt_nm3(value);
			return;
		}
		if ($co_alt_nm4.equalsIgnoreCase(name)) {
			co_alt_nm4(value);
			return;
		}
		if ($base_co_alt_nm4.equalsIgnoreCase(name)) {
			base_co_alt_nm4(value);
			return;
		}
		if ($zip_cd.equalsIgnoreCase(name)) {
			zip_cd(value);
			return;
		}
		if ($base_zip_cd.equalsIgnoreCase(name)) {
			base_zip_cd(value);
			return;
		}
		if ($addr1.equalsIgnoreCase(name)) {
			addr1(value);
			return;
		}
		if ($base_addr1.equalsIgnoreCase(name)) {
			base_addr1(value);
			return;
		}
		if ($addr2.equalsIgnoreCase(name)) {
			addr2(value);
			return;
		}
		if ($base_addr2.equalsIgnoreCase(name)) {
			base_addr2(value);
			return;
		}
		if ($addr3.equalsIgnoreCase(name)) {
			addr3(value);
			return;
		}
		if ($base_addr3.equalsIgnoreCase(name)) {
			base_addr3(value);
			return;
		}
		if ($addr4.equalsIgnoreCase(name)) {
			addr4(value);
			return;
		}
		if ($base_addr4.equalsIgnoreCase(name)) {
			base_addr4(value);
			return;
		}
		if ($tel.equalsIgnoreCase(name)) {
			tel(value);
			return;
		}
		if ($base_tel.equalsIgnoreCase(name)) {
			base_tel(value);
			return;
		}
		if ($fax.equalsIgnoreCase(name)) {
			fax(value);
			return;
		}
		if ($base_fax.equalsIgnoreCase(name)) {
			base_fax(value);
			return;
		}
		if ($co_repl_nm.equalsIgnoreCase(name)) {
			co_repl_nm(value);
			return;
		}
		if ($base_co_repl_nm.equalsIgnoreCase(name)) {
			base_co_repl_nm(value);
			return;
		}
		if ($ein.equalsIgnoreCase(name)) {
			ein(value);
			return;
		}
		if ($biz_co_no.equalsIgnoreCase(name)) {
			biz_co_no(value);
			return;
		}
		if ($std_co_cd.equalsIgnoreCase(name)) {
			std_co_cd(value);
			return;
		}
		if ($cntry_cd.equalsIgnoreCase(name)) {
			cntry_cd(value);
			return;
		}
		if ($area_cd.equalsIgnoreCase(name)) {
			area_cd(value);
			return;
		}
		if ($base_cur_cd.equalsIgnoreCase(name)) {
			base_cur_cd(value);
			return;
		}
		if ($ptax_cur_cd.equalsIgnoreCase(name)) {
			ptax_cur_cd(value);
			return;
		}
		if ($std_cal_cd.equalsIgnoreCase(name)) {
			std_cal_cd(value);
			return;
		}
		if ($bill_cl_cal_cd.equalsIgnoreCase(name)) {
			bill_cl_cal_cd(value);
			return;
		}
		if ($pay_schd_cl_cal_cd.equalsIgnoreCase(name)) {
			pay_schd_cl_cal_cd(value);
			return;
		}
		if ($sls_cl_cal_cd.equalsIgnoreCase(name)) {
			sls_cl_cal_cd(value);
			return;
		}
		if ($rcv_cl_cal_cd.equalsIgnoreCase(name)) {
			rcv_cl_cal_cd(value);
			return;
		}
		if ($purc_cl_cal_cd.equalsIgnoreCase(name)) {
			purc_cl_cal_cd(value);
			return;
		}
		if ($pay_cl_cal_cd.equalsIgnoreCase(name)) {
			pay_cl_cal_cd(value);
			return;
		}
		if ($stk_cl_cal_cd.equalsIgnoreCase(name)) {
			stk_cl_cal_cd(value);
			return;
		}
		if ($sls_cl_ba_typ.equalsIgnoreCase(name)) {
			sls_cl_ba_typ(value);
			return;
		}
		if ($rcv_cl_ba_typ.equalsIgnoreCase(name)) {
			rcv_cl_ba_typ(value);
			return;
		}
		if ($purc_cl_ba_typ.equalsIgnoreCase(name)) {
			purc_cl_ba_typ(value);
			return;
		}
		if ($pay_cl_ba_typ.equalsIgnoreCase(name)) {
			pay_cl_ba_typ(value);
			return;
		}
		if ($stk_cl_ba_typ.equalsIgnoreCase(name)) {
			stk_cl_ba_typ(value);
			return;
		}
		if ($sls_xrate_cd.equalsIgnoreCase(name)) {
			sls_xrate_cd(value);
			return;
		}
		if ($purc_xrate_cd.equalsIgnoreCase(name)) {
			purc_xrate_cd(value);
			return;
		}
		if ($prov_xrate_cd.equalsIgnoreCase(name)) {
			prov_xrate_cd(value);
			return;
		}
		if ($bill_xrate_cd.equalsIgnoreCase(name)) {
			bill_xrate_cd(value);
			return;
		}
		if ($pay_xrate_cd.equalsIgnoreCase(name)) {
			pay_xrate_cd(value);
			return;
		}
		if ($sls_upri_req_typ.equalsIgnoreCase(name)) {
			sls_upri_req_typ(value);
			return;
		}
		if ($purc_upri_req_typ.equalsIgnoreCase(name)) {
			purc_upri_req_typ(value);
			return;
		}
		if ($outsrc_upri_typ.equalsIgnoreCase(name)) {
			outsrc_upri_typ(value);
			return;
		}
		if ($sls_basis_typ.equalsIgnoreCase(name)) {
			sls_basis_typ(value);
			return;
		}
		if ($bill_basis_typ.equalsIgnoreCase(name)) {
			bill_basis_typ(value);
			return;
		}
		if ($ship_schd_split_typ.equalsIgnoreCase(name)) {
			ship_schd_split_typ(value);
			return;
		}
		if ($xfr_stk_mng_typ.equalsIgnoreCase(name)) {
			xfr_stk_mng_typ(value);
			return;
		}
		if ($setoff_tax_rnd_typ.equalsIgnoreCase(name)) {
			setoff_tax_rnd_typ(value);
			return;
		}
		if ($xrate_rnd_typ.equalsIgnoreCase(name)) {
			xrate_rnd_typ(value);
			return;
		}
		if ($com_paid_tax_rnd_typ.equalsIgnoreCase(name)) {
			com_paid_tax_rnd_typ(value);
			return;
		}
		if ($wtax_rnd_typ.equalsIgnoreCase(name)) {
			wtax_rnd_typ(value);
			return;
		}
		if ($stk_amt_rnd_typ.equalsIgnoreCase(name)) {
			stk_amt_rnd_typ(value);
			return;
		}
		if ($sls_bdj_rnd_typ.equalsIgnoreCase(name)) {
			sls_bdj_rnd_typ(value);
			return;
		}
		if ($po_print_cd.equalsIgnoreCase(name)) {
			po_print_cd(value);
			return;
		}
		if ($gm_std_upri_typ.equalsIgnoreCase(name)) {
			gm_std_upri_typ(value);
			return;
		}
		if ($stk_std_upri_typ.equalsIgnoreCase(name)) {
			stk_std_upri_typ(value);
			return;
		}
		if ($cst_prnt_typ.equalsIgnoreCase(name)) {
			cst_prnt_typ(value);
			return;
		}
		if ($acst_prnt_typ.equalsIgnoreCase(name)) {
			acst_prnt_typ(value);
			return;
		}
		if ($bcst_prnt_typ.equalsIgnoreCase(name)) {
			bcst_prnt_typ(value);
			return;
		}
		if ($rcst_prnt_typ.equalsIgnoreCase(name)) {
			rcst_prnt_typ(value);
			return;
		}
		if ($sppl_prnt_typ.equalsIgnoreCase(name)) {
			sppl_prnt_typ(value);
			return;
		}
		if ($asppl_prnt_typ.equalsIgnoreCase(name)) {
			asppl_prnt_typ(value);
			return;
		}
		if ($bsppl_prnt_typ.equalsIgnoreCase(name)) {
			bsppl_prnt_typ(value);
			return;
		}
		if ($psppl_prnt_typ.equalsIgnoreCase(name)) {
			psppl_prnt_typ(value);
			return;
		}
		if ($dlv_prnt_typ.equalsIgnoreCase(name)) {
			dlv_prnt_typ(value);
			return;
		}
		if ($rpt_strg_ext_sys_cd.equalsIgnoreCase(name)) {
			rpt_strg_ext_sys_cd(value);
			return;
		}
		if ($memo1.equalsIgnoreCase(name)) {
			memo1(value);
			return;
		}
		if ($memo2.equalsIgnoreCase(name)) {
			memo2(value);
			return;
		}
		if ($memo3.equalsIgnoreCase(name)) {
			memo3(value);
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
		if ($co_nm.equalsIgnoreCase(name)) {
			co_nm(value);
			return;
		}
		if ($cntry_nm.equalsIgnoreCase(name)) {
			cntry_nm(value);
			return;
		}
		if ($area_nm.equalsIgnoreCase(name)) {
			area_nm(value);
			return;
		}
		if ($base_cur_nm.equalsIgnoreCase(name)) {
			base_cur_nm(value);
			return;
		}
		if ($ptax_cur_nm.equalsIgnoreCase(name)) {
			ptax_cur_nm(value);
			return;
		}
		if ($std_cal_nm.equalsIgnoreCase(name)) {
			std_cal_nm(value);
			return;
		}
		if ($sls_cl_cal_nm.equalsIgnoreCase(name)) {
			sls_cl_cal_nm(value);
			return;
		}
		if ($bill_cl_cal_nm.equalsIgnoreCase(name)) {
			bill_cl_cal_nm(value);
			return;
		}
		if ($rcv_cl_cal_nm.equalsIgnoreCase(name)) {
			rcv_cl_cal_nm(value);
			return;
		}
		if ($purc_cl_cal_nm.equalsIgnoreCase(name)) {
			purc_cl_cal_nm(value);
			return;
		}
		if ($pay_cl_cal_nm.equalsIgnoreCase(name)) {
			pay_cl_cal_nm(value);
			return;
		}
		if ($stk_cl_cal_nm.equalsIgnoreCase(name)) {
			stk_cl_cal_nm(value);
			return;
		}
		if ($sls_xrate_nm.equalsIgnoreCase(name)) {
			sls_xrate_nm(value);
			return;
		}
		if ($purc_xrate_nm.equalsIgnoreCase(name)) {
			purc_xrate_nm(value);
			return;
		}
		if ($prov_xrate_nm.equalsIgnoreCase(name)) {
			prov_xrate_nm(value);
			return;
		}
		if ($pay_xrate_nm.equalsIgnoreCase(name)) {
			pay_xrate_nm(value);
			return;
		}
		if ($bill_xrate_nm.equalsIgnoreCase(name)) {
			bill_xrate_nm(value);
			return;
		}
		if ($po_print_nm.equalsIgnoreCase(name)) {
			po_print_nm(value);
			return;
		}
		if ($pay_schd_cl_cal_nm.equalsIgnoreCase(name)) {
			pay_schd_cl_cal_nm(value);
			return;
		}
		if ($rpt_strg_ext_sys_nm.equalsIgnoreCase(name)) {
			rpt_strg_ext_sys_nm(value);
			return;
		}
		super.setString(name, value);
	}

	public void setNumber(String name, MCNumber value) {
		if ($st_mon.equalsIgnoreCase(name)) {
			st_mon(value);
			return;
		}
		if ($ac_cl_day.equalsIgnoreCase(name)) {
			ac_cl_day(value);
			return;
		}
		if ($ac_cl_mon_base.equalsIgnoreCase(name)) {
			ac_cl_mon_base(value);
			return;
		}
		if ($dt_switch_time.equalsIgnoreCase(name)) {
			dt_switch_time(value);
			return;
		}
		if ($sls_cl_delay_days.equalsIgnoreCase(name)) {
			sls_cl_delay_days(value);
			return;
		}
		if ($rcv_cl_delay_days.equalsIgnoreCase(name)) {
			rcv_cl_delay_days(value);
			return;
		}
		if ($purc_cl_delay_days.equalsIgnoreCase(name)) {
			purc_cl_delay_days(value);
			return;
		}
		if ($pay_cl_delay_days.equalsIgnoreCase(name)) {
			pay_cl_delay_days(value);
			return;
		}
		if ($stk_cl_delay_days.equalsIgnoreCase(name)) {
			stk_cl_delay_days(value);
			return;
		}
		if ($stk_amt_dec_place.equalsIgnoreCase(name)) {
			stk_amt_dec_place(value);
			return;
		}
		if ($stk_lst_cnf_num.equalsIgnoreCase(name)) {
			stk_lst_cnf_num(value);
			return;
		}
		if ($stk_lst_limit_num.equalsIgnoreCase(name)) {
			stk_lst_limit_num(value);
			return;
		}
		if ($ac_slip_digit.equalsIgnoreCase(name)) {
			ac_slip_digit(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		if ($early_ship_dt_add_days.equalsIgnoreCase(name)) {
			early_ship_dt_add_days(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, int value) {
		if ($st_mon.equalsIgnoreCase(name)) {
			st_mon(value);
			return;
		}
		if ($ac_cl_day.equalsIgnoreCase(name)) {
			ac_cl_day(value);
			return;
		}
		if ($ac_cl_mon_base.equalsIgnoreCase(name)) {
			ac_cl_mon_base(value);
			return;
		}
		if ($dt_switch_time.equalsIgnoreCase(name)) {
			dt_switch_time(value);
			return;
		}
		if ($sls_cl_delay_days.equalsIgnoreCase(name)) {
			sls_cl_delay_days(value);
			return;
		}
		if ($rcv_cl_delay_days.equalsIgnoreCase(name)) {
			rcv_cl_delay_days(value);
			return;
		}
		if ($purc_cl_delay_days.equalsIgnoreCase(name)) {
			purc_cl_delay_days(value);
			return;
		}
		if ($pay_cl_delay_days.equalsIgnoreCase(name)) {
			pay_cl_delay_days(value);
			return;
		}
		if ($stk_cl_delay_days.equalsIgnoreCase(name)) {
			stk_cl_delay_days(value);
			return;
		}
		if ($stk_amt_dec_place.equalsIgnoreCase(name)) {
			stk_amt_dec_place(value);
			return;
		}
		if ($stk_lst_cnf_num.equalsIgnoreCase(name)) {
			stk_lst_cnf_num(value);
			return;
		}
		if ($stk_lst_limit_num.equalsIgnoreCase(name)) {
			stk_lst_limit_num(value);
			return;
		}
		if ($ac_slip_digit.equalsIgnoreCase(name)) {
			ac_slip_digit(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		if ($early_ship_dt_add_days.equalsIgnoreCase(name)) {
			early_ship_dt_add_days(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, long value) {
		if ($st_mon.equalsIgnoreCase(name)) {
			st_mon(value);
			return;
		}
		if ($ac_cl_day.equalsIgnoreCase(name)) {
			ac_cl_day(value);
			return;
		}
		if ($ac_cl_mon_base.equalsIgnoreCase(name)) {
			ac_cl_mon_base(value);
			return;
		}
		if ($dt_switch_time.equalsIgnoreCase(name)) {
			dt_switch_time(value);
			return;
		}
		if ($sls_cl_delay_days.equalsIgnoreCase(name)) {
			sls_cl_delay_days(value);
			return;
		}
		if ($rcv_cl_delay_days.equalsIgnoreCase(name)) {
			rcv_cl_delay_days(value);
			return;
		}
		if ($purc_cl_delay_days.equalsIgnoreCase(name)) {
			purc_cl_delay_days(value);
			return;
		}
		if ($pay_cl_delay_days.equalsIgnoreCase(name)) {
			pay_cl_delay_days(value);
			return;
		}
		if ($stk_cl_delay_days.equalsIgnoreCase(name)) {
			stk_cl_delay_days(value);
			return;
		}
		if ($stk_amt_dec_place.equalsIgnoreCase(name)) {
			stk_amt_dec_place(value);
			return;
		}
		if ($stk_lst_cnf_num.equalsIgnoreCase(name)) {
			stk_lst_cnf_num(value);
			return;
		}
		if ($stk_lst_limit_num.equalsIgnoreCase(name)) {
			stk_lst_limit_num(value);
			return;
		}
		if ($ac_slip_digit.equalsIgnoreCase(name)) {
			ac_slip_digit(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		if ($early_ship_dt_add_days.equalsIgnoreCase(name)) {
			early_ship_dt_add_days(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, float value) {
		if ($st_mon.equalsIgnoreCase(name)) {
			st_mon(value);
			return;
		}
		if ($ac_cl_day.equalsIgnoreCase(name)) {
			ac_cl_day(value);
			return;
		}
		if ($ac_cl_mon_base.equalsIgnoreCase(name)) {
			ac_cl_mon_base(value);
			return;
		}
		if ($dt_switch_time.equalsIgnoreCase(name)) {
			dt_switch_time(value);
			return;
		}
		if ($sls_cl_delay_days.equalsIgnoreCase(name)) {
			sls_cl_delay_days(value);
			return;
		}
		if ($rcv_cl_delay_days.equalsIgnoreCase(name)) {
			rcv_cl_delay_days(value);
			return;
		}
		if ($purc_cl_delay_days.equalsIgnoreCase(name)) {
			purc_cl_delay_days(value);
			return;
		}
		if ($pay_cl_delay_days.equalsIgnoreCase(name)) {
			pay_cl_delay_days(value);
			return;
		}
		if ($stk_cl_delay_days.equalsIgnoreCase(name)) {
			stk_cl_delay_days(value);
			return;
		}
		if ($stk_amt_dec_place.equalsIgnoreCase(name)) {
			stk_amt_dec_place(value);
			return;
		}
		if ($stk_lst_cnf_num.equalsIgnoreCase(name)) {
			stk_lst_cnf_num(value);
			return;
		}
		if ($stk_lst_limit_num.equalsIgnoreCase(name)) {
			stk_lst_limit_num(value);
			return;
		}
		if ($ac_slip_digit.equalsIgnoreCase(name)) {
			ac_slip_digit(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		if ($early_ship_dt_add_days.equalsIgnoreCase(name)) {
			early_ship_dt_add_days(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, double value) {
		if ($st_mon.equalsIgnoreCase(name)) {
			st_mon(value);
			return;
		}
		if ($ac_cl_day.equalsIgnoreCase(name)) {
			ac_cl_day(value);
			return;
		}
		if ($ac_cl_mon_base.equalsIgnoreCase(name)) {
			ac_cl_mon_base(value);
			return;
		}
		if ($dt_switch_time.equalsIgnoreCase(name)) {
			dt_switch_time(value);
			return;
		}
		if ($sls_cl_delay_days.equalsIgnoreCase(name)) {
			sls_cl_delay_days(value);
			return;
		}
		if ($rcv_cl_delay_days.equalsIgnoreCase(name)) {
			rcv_cl_delay_days(value);
			return;
		}
		if ($purc_cl_delay_days.equalsIgnoreCase(name)) {
			purc_cl_delay_days(value);
			return;
		}
		if ($pay_cl_delay_days.equalsIgnoreCase(name)) {
			pay_cl_delay_days(value);
			return;
		}
		if ($stk_cl_delay_days.equalsIgnoreCase(name)) {
			stk_cl_delay_days(value);
			return;
		}
		if ($stk_amt_dec_place.equalsIgnoreCase(name)) {
			stk_amt_dec_place(value);
			return;
		}
		if ($stk_lst_cnf_num.equalsIgnoreCase(name)) {
			stk_lst_cnf_num(value);
			return;
		}
		if ($stk_lst_limit_num.equalsIgnoreCase(name)) {
			stk_lst_limit_num(value);
			return;
		}
		if ($ac_slip_digit.equalsIgnoreCase(name)) {
			ac_slip_digit(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		if ($early_ship_dt_add_days.equalsIgnoreCase(name)) {
			early_ship_dt_add_days(value);
			return;
		}
		super.setNumber(name, value);
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
		if ($ar_no_use_flg.equalsIgnoreCase(name)) {
			ar_no_use_flg(value);
			return;
		}
		if ($ap_no_use_flg.equalsIgnoreCase(name)) {
			ap_no_use_flg(value);
			return;
		}
		if ($temp_ap_use_flg.equalsIgnoreCase(name)) {
			temp_ap_use_flg(value);
			return;
		}
		if ($sls_cl_flg.equalsIgnoreCase(name)) {
			sls_cl_flg(value);
			return;
		}
		if ($rcv_cl_flg.equalsIgnoreCase(name)) {
			rcv_cl_flg(value);
			return;
		}
		if ($purc_cl_flg.equalsIgnoreCase(name)) {
			purc_cl_flg(value);
			return;
		}
		if ($pay_cl_flg.equalsIgnoreCase(name)) {
			pay_cl_flg(value);
			return;
		}
		if ($bill_xrate_conv_flg.equalsIgnoreCase(name)) {
			bill_xrate_conv_flg(value);
			return;
		}
		if ($pay_xrate_conv_flg.equalsIgnoreCase(name)) {
			pay_xrate_conv_flg(value);
			return;
		}
		if ($mon01_xrate_rev_flg.equalsIgnoreCase(name)) {
			mon01_xrate_rev_flg(value);
			return;
		}
		if ($mon02_xrate_rev_flg.equalsIgnoreCase(name)) {
			mon02_xrate_rev_flg(value);
			return;
		}
		if ($mon03_xrate_rev_flg.equalsIgnoreCase(name)) {
			mon03_xrate_rev_flg(value);
			return;
		}
		if ($mon04_xrate_rev_flg.equalsIgnoreCase(name)) {
			mon04_xrate_rev_flg(value);
			return;
		}
		if ($mon05_xrate_rev_flg.equalsIgnoreCase(name)) {
			mon05_xrate_rev_flg(value);
			return;
		}
		if ($mon06_xrate_rev_flg.equalsIgnoreCase(name)) {
			mon06_xrate_rev_flg(value);
			return;
		}
		if ($mon07_xrate_rev_flg.equalsIgnoreCase(name)) {
			mon07_xrate_rev_flg(value);
			return;
		}
		if ($mon08_xrate_rev_flg.equalsIgnoreCase(name)) {
			mon08_xrate_rev_flg(value);
			return;
		}
		if ($mon09_xrate_rev_flg.equalsIgnoreCase(name)) {
			mon09_xrate_rev_flg(value);
			return;
		}
		if ($mon10_xrate_rev_flg.equalsIgnoreCase(name)) {
			mon10_xrate_rev_flg(value);
			return;
		}
		if ($mon11_xrate_rev_flg.equalsIgnoreCase(name)) {
			mon11_xrate_rev_flg(value);
			return;
		}
		if ($mon12_xrate_rev_flg.equalsIgnoreCase(name)) {
			mon12_xrate_rev_flg(value);
			return;
		}
		if ($ac_slip_seq_flg.equalsIgnoreCase(name)) {
			ac_slip_seq_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($co_cd.equalsIgnoreCase(name)) {
			co_cd(value);
			return;
		}
		if ($co_alt_nm1.equalsIgnoreCase(name)) {
			co_alt_nm1(value);
			return;
		}
		if ($base_co_alt_nm1.equalsIgnoreCase(name)) {
			base_co_alt_nm1(value);
			return;
		}
		if ($co_alt_nm2.equalsIgnoreCase(name)) {
			co_alt_nm2(value);
			return;
		}
		if ($base_co_alt_nm2.equalsIgnoreCase(name)) {
			base_co_alt_nm2(value);
			return;
		}
		if ($co_alt_nm3.equalsIgnoreCase(name)) {
			co_alt_nm3(value);
			return;
		}
		if ($base_co_alt_nm3.equalsIgnoreCase(name)) {
			base_co_alt_nm3(value);
			return;
		}
		if ($co_alt_nm4.equalsIgnoreCase(name)) {
			co_alt_nm4(value);
			return;
		}
		if ($base_co_alt_nm4.equalsIgnoreCase(name)) {
			base_co_alt_nm4(value);
			return;
		}
		if ($zip_cd.equalsIgnoreCase(name)) {
			zip_cd(value);
			return;
		}
		if ($base_zip_cd.equalsIgnoreCase(name)) {
			base_zip_cd(value);
			return;
		}
		if ($addr1.equalsIgnoreCase(name)) {
			addr1(value);
			return;
		}
		if ($base_addr1.equalsIgnoreCase(name)) {
			base_addr1(value);
			return;
		}
		if ($addr2.equalsIgnoreCase(name)) {
			addr2(value);
			return;
		}
		if ($base_addr2.equalsIgnoreCase(name)) {
			base_addr2(value);
			return;
		}
		if ($addr3.equalsIgnoreCase(name)) {
			addr3(value);
			return;
		}
		if ($base_addr3.equalsIgnoreCase(name)) {
			base_addr3(value);
			return;
		}
		if ($addr4.equalsIgnoreCase(name)) {
			addr4(value);
			return;
		}
		if ($base_addr4.equalsIgnoreCase(name)) {
			base_addr4(value);
			return;
		}
		if ($tel.equalsIgnoreCase(name)) {
			tel(value);
			return;
		}
		if ($base_tel.equalsIgnoreCase(name)) {
			base_tel(value);
			return;
		}
		if ($fax.equalsIgnoreCase(name)) {
			fax(value);
			return;
		}
		if ($base_fax.equalsIgnoreCase(name)) {
			base_fax(value);
			return;
		}
		if ($co_repl_nm.equalsIgnoreCase(name)) {
			co_repl_nm(value);
			return;
		}
		if ($base_co_repl_nm.equalsIgnoreCase(name)) {
			base_co_repl_nm(value);
			return;
		}
		if ($ein.equalsIgnoreCase(name)) {
			ein(value);
			return;
		}
		if ($biz_co_no.equalsIgnoreCase(name)) {
			biz_co_no(value);
			return;
		}
		if ($std_co_cd.equalsIgnoreCase(name)) {
			std_co_cd(value);
			return;
		}
		if ($cntry_cd.equalsIgnoreCase(name)) {
			cntry_cd(value);
			return;
		}
		if ($area_cd.equalsIgnoreCase(name)) {
			area_cd(value);
			return;
		}
		if ($base_cur_cd.equalsIgnoreCase(name)) {
			base_cur_cd(value);
			return;
		}
		if ($ptax_cur_cd.equalsIgnoreCase(name)) {
			ptax_cur_cd(value);
			return;
		}
		if ($std_cal_cd.equalsIgnoreCase(name)) {
			std_cal_cd(value);
			return;
		}
		if ($bill_cl_cal_cd.equalsIgnoreCase(name)) {
			bill_cl_cal_cd(value);
			return;
		}
		if ($pay_schd_cl_cal_cd.equalsIgnoreCase(name)) {
			pay_schd_cl_cal_cd(value);
			return;
		}
		if ($sls_cl_cal_cd.equalsIgnoreCase(name)) {
			sls_cl_cal_cd(value);
			return;
		}
		if ($rcv_cl_cal_cd.equalsIgnoreCase(name)) {
			rcv_cl_cal_cd(value);
			return;
		}
		if ($purc_cl_cal_cd.equalsIgnoreCase(name)) {
			purc_cl_cal_cd(value);
			return;
		}
		if ($pay_cl_cal_cd.equalsIgnoreCase(name)) {
			pay_cl_cal_cd(value);
			return;
		}
		if ($stk_cl_cal_cd.equalsIgnoreCase(name)) {
			stk_cl_cal_cd(value);
			return;
		}
		if ($sls_cl_ba_typ.equalsIgnoreCase(name)) {
			sls_cl_ba_typ(value);
			return;
		}
		if ($rcv_cl_ba_typ.equalsIgnoreCase(name)) {
			rcv_cl_ba_typ(value);
			return;
		}
		if ($purc_cl_ba_typ.equalsIgnoreCase(name)) {
			purc_cl_ba_typ(value);
			return;
		}
		if ($pay_cl_ba_typ.equalsIgnoreCase(name)) {
			pay_cl_ba_typ(value);
			return;
		}
		if ($stk_cl_ba_typ.equalsIgnoreCase(name)) {
			stk_cl_ba_typ(value);
			return;
		}
		if ($sls_xrate_cd.equalsIgnoreCase(name)) {
			sls_xrate_cd(value);
			return;
		}
		if ($purc_xrate_cd.equalsIgnoreCase(name)) {
			purc_xrate_cd(value);
			return;
		}
		if ($prov_xrate_cd.equalsIgnoreCase(name)) {
			prov_xrate_cd(value);
			return;
		}
		if ($bill_xrate_cd.equalsIgnoreCase(name)) {
			bill_xrate_cd(value);
			return;
		}
		if ($pay_xrate_cd.equalsIgnoreCase(name)) {
			pay_xrate_cd(value);
			return;
		}
		if ($sls_upri_req_typ.equalsIgnoreCase(name)) {
			sls_upri_req_typ(value);
			return;
		}
		if ($purc_upri_req_typ.equalsIgnoreCase(name)) {
			purc_upri_req_typ(value);
			return;
		}
		if ($outsrc_upri_typ.equalsIgnoreCase(name)) {
			outsrc_upri_typ(value);
			return;
		}
		if ($sls_basis_typ.equalsIgnoreCase(name)) {
			sls_basis_typ(value);
			return;
		}
		if ($bill_basis_typ.equalsIgnoreCase(name)) {
			bill_basis_typ(value);
			return;
		}
		if ($ship_schd_split_typ.equalsIgnoreCase(name)) {
			ship_schd_split_typ(value);
			return;
		}
		if ($xfr_stk_mng_typ.equalsIgnoreCase(name)) {
			xfr_stk_mng_typ(value);
			return;
		}
		if ($setoff_tax_rnd_typ.equalsIgnoreCase(name)) {
			setoff_tax_rnd_typ(value);
			return;
		}
		if ($xrate_rnd_typ.equalsIgnoreCase(name)) {
			xrate_rnd_typ(value);
			return;
		}
		if ($com_paid_tax_rnd_typ.equalsIgnoreCase(name)) {
			com_paid_tax_rnd_typ(value);
			return;
		}
		if ($wtax_rnd_typ.equalsIgnoreCase(name)) {
			wtax_rnd_typ(value);
			return;
		}
		if ($stk_amt_rnd_typ.equalsIgnoreCase(name)) {
			stk_amt_rnd_typ(value);
			return;
		}
		if ($sls_bdj_rnd_typ.equalsIgnoreCase(name)) {
			sls_bdj_rnd_typ(value);
			return;
		}
		if ($po_print_cd.equalsIgnoreCase(name)) {
			po_print_cd(value);
			return;
		}
		if ($gm_std_upri_typ.equalsIgnoreCase(name)) {
			gm_std_upri_typ(value);
			return;
		}
		if ($stk_std_upri_typ.equalsIgnoreCase(name)) {
			stk_std_upri_typ(value);
			return;
		}
		if ($cst_prnt_typ.equalsIgnoreCase(name)) {
			cst_prnt_typ(value);
			return;
		}
		if ($acst_prnt_typ.equalsIgnoreCase(name)) {
			acst_prnt_typ(value);
			return;
		}
		if ($bcst_prnt_typ.equalsIgnoreCase(name)) {
			bcst_prnt_typ(value);
			return;
		}
		if ($rcst_prnt_typ.equalsIgnoreCase(name)) {
			rcst_prnt_typ(value);
			return;
		}
		if ($sppl_prnt_typ.equalsIgnoreCase(name)) {
			sppl_prnt_typ(value);
			return;
		}
		if ($asppl_prnt_typ.equalsIgnoreCase(name)) {
			asppl_prnt_typ(value);
			return;
		}
		if ($bsppl_prnt_typ.equalsIgnoreCase(name)) {
			bsppl_prnt_typ(value);
			return;
		}
		if ($psppl_prnt_typ.equalsIgnoreCase(name)) {
			psppl_prnt_typ(value);
			return;
		}
		if ($dlv_prnt_typ.equalsIgnoreCase(name)) {
			dlv_prnt_typ(value);
			return;
		}
		if ($rpt_strg_ext_sys_cd.equalsIgnoreCase(name)) {
			rpt_strg_ext_sys_cd(value);
			return;
		}
		if ($memo1.equalsIgnoreCase(name)) {
			memo1(value);
			return;
		}
		if ($memo2.equalsIgnoreCase(name)) {
			memo2(value);
			return;
		}
		if ($memo3.equalsIgnoreCase(name)) {
			memo3(value);
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
		if ($co_nm.equalsIgnoreCase(name)) {
			co_nm(value);
			return;
		}
		if ($cntry_nm.equalsIgnoreCase(name)) {
			cntry_nm(value);
			return;
		}
		if ($area_nm.equalsIgnoreCase(name)) {
			area_nm(value);
			return;
		}
		if ($base_cur_nm.equalsIgnoreCase(name)) {
			base_cur_nm(value);
			return;
		}
		if ($ptax_cur_nm.equalsIgnoreCase(name)) {
			ptax_cur_nm(value);
			return;
		}
		if ($std_cal_nm.equalsIgnoreCase(name)) {
			std_cal_nm(value);
			return;
		}
		if ($sls_cl_cal_nm.equalsIgnoreCase(name)) {
			sls_cl_cal_nm(value);
			return;
		}
		if ($bill_cl_cal_nm.equalsIgnoreCase(name)) {
			bill_cl_cal_nm(value);
			return;
		}
		if ($rcv_cl_cal_nm.equalsIgnoreCase(name)) {
			rcv_cl_cal_nm(value);
			return;
		}
		if ($purc_cl_cal_nm.equalsIgnoreCase(name)) {
			purc_cl_cal_nm(value);
			return;
		}
		if ($pay_cl_cal_nm.equalsIgnoreCase(name)) {
			pay_cl_cal_nm(value);
			return;
		}
		if ($stk_cl_cal_nm.equalsIgnoreCase(name)) {
			stk_cl_cal_nm(value);
			return;
		}
		if ($sls_xrate_nm.equalsIgnoreCase(name)) {
			sls_xrate_nm(value);
			return;
		}
		if ($purc_xrate_nm.equalsIgnoreCase(name)) {
			purc_xrate_nm(value);
			return;
		}
		if ($prov_xrate_nm.equalsIgnoreCase(name)) {
			prov_xrate_nm(value);
			return;
		}
		if ($pay_xrate_nm.equalsIgnoreCase(name)) {
			pay_xrate_nm(value);
			return;
		}
		if ($bill_xrate_nm.equalsIgnoreCase(name)) {
			bill_xrate_nm(value);
			return;
		}
		if ($po_print_nm.equalsIgnoreCase(name)) {
			po_print_nm(value);
			return;
		}
		if ($pay_schd_cl_cal_nm.equalsIgnoreCase(name)) {
			pay_schd_cl_cal_nm(value);
			return;
		}
		if ($rpt_strg_ext_sys_nm.equalsIgnoreCase(name)) {
			rpt_strg_ext_sys_nm(value);
			return;
		}
		super.setStringNE(name, value);
	}

	public void setNumberNE(String name, MCNumber value) {
		if ($st_mon.equalsIgnoreCase(name)) {
			st_mon(value);
			return;
		}
		if ($ac_cl_day.equalsIgnoreCase(name)) {
			ac_cl_day(value);
			return;
		}
		if ($ac_cl_mon_base.equalsIgnoreCase(name)) {
			ac_cl_mon_base(value);
			return;
		}
		if ($dt_switch_time.equalsIgnoreCase(name)) {
			dt_switch_time(value);
			return;
		}
		if ($sls_cl_delay_days.equalsIgnoreCase(name)) {
			sls_cl_delay_days(value);
			return;
		}
		if ($rcv_cl_delay_days.equalsIgnoreCase(name)) {
			rcv_cl_delay_days(value);
			return;
		}
		if ($purc_cl_delay_days.equalsIgnoreCase(name)) {
			purc_cl_delay_days(value);
			return;
		}
		if ($pay_cl_delay_days.equalsIgnoreCase(name)) {
			pay_cl_delay_days(value);
			return;
		}
		if ($stk_cl_delay_days.equalsIgnoreCase(name)) {
			stk_cl_delay_days(value);
			return;
		}
		if ($stk_amt_dec_place.equalsIgnoreCase(name)) {
			stk_amt_dec_place(value);
			return;
		}
		if ($stk_lst_cnf_num.equalsIgnoreCase(name)) {
			stk_lst_cnf_num(value);
			return;
		}
		if ($stk_lst_limit_num.equalsIgnoreCase(name)) {
			stk_lst_limit_num(value);
			return;
		}
		if ($ac_slip_digit.equalsIgnoreCase(name)) {
			ac_slip_digit(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		if ($early_ship_dt_add_days.equalsIgnoreCase(name)) {
			early_ship_dt_add_days(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, int value) {
		if ($st_mon.equalsIgnoreCase(name)) {
			st_mon(value);
			return;
		}
		if ($ac_cl_day.equalsIgnoreCase(name)) {
			ac_cl_day(value);
			return;
		}
		if ($ac_cl_mon_base.equalsIgnoreCase(name)) {
			ac_cl_mon_base(value);
			return;
		}
		if ($dt_switch_time.equalsIgnoreCase(name)) {
			dt_switch_time(value);
			return;
		}
		if ($sls_cl_delay_days.equalsIgnoreCase(name)) {
			sls_cl_delay_days(value);
			return;
		}
		if ($rcv_cl_delay_days.equalsIgnoreCase(name)) {
			rcv_cl_delay_days(value);
			return;
		}
		if ($purc_cl_delay_days.equalsIgnoreCase(name)) {
			purc_cl_delay_days(value);
			return;
		}
		if ($pay_cl_delay_days.equalsIgnoreCase(name)) {
			pay_cl_delay_days(value);
			return;
		}
		if ($stk_cl_delay_days.equalsIgnoreCase(name)) {
			stk_cl_delay_days(value);
			return;
		}
		if ($stk_amt_dec_place.equalsIgnoreCase(name)) {
			stk_amt_dec_place(value);
			return;
		}
		if ($stk_lst_cnf_num.equalsIgnoreCase(name)) {
			stk_lst_cnf_num(value);
			return;
		}
		if ($stk_lst_limit_num.equalsIgnoreCase(name)) {
			stk_lst_limit_num(value);
			return;
		}
		if ($ac_slip_digit.equalsIgnoreCase(name)) {
			ac_slip_digit(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		if ($early_ship_dt_add_days.equalsIgnoreCase(name)) {
			early_ship_dt_add_days(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, long value) {
		if ($st_mon.equalsIgnoreCase(name)) {
			st_mon(value);
			return;
		}
		if ($ac_cl_day.equalsIgnoreCase(name)) {
			ac_cl_day(value);
			return;
		}
		if ($ac_cl_mon_base.equalsIgnoreCase(name)) {
			ac_cl_mon_base(value);
			return;
		}
		if ($dt_switch_time.equalsIgnoreCase(name)) {
			dt_switch_time(value);
			return;
		}
		if ($sls_cl_delay_days.equalsIgnoreCase(name)) {
			sls_cl_delay_days(value);
			return;
		}
		if ($rcv_cl_delay_days.equalsIgnoreCase(name)) {
			rcv_cl_delay_days(value);
			return;
		}
		if ($purc_cl_delay_days.equalsIgnoreCase(name)) {
			purc_cl_delay_days(value);
			return;
		}
		if ($pay_cl_delay_days.equalsIgnoreCase(name)) {
			pay_cl_delay_days(value);
			return;
		}
		if ($stk_cl_delay_days.equalsIgnoreCase(name)) {
			stk_cl_delay_days(value);
			return;
		}
		if ($stk_amt_dec_place.equalsIgnoreCase(name)) {
			stk_amt_dec_place(value);
			return;
		}
		if ($stk_lst_cnf_num.equalsIgnoreCase(name)) {
			stk_lst_cnf_num(value);
			return;
		}
		if ($stk_lst_limit_num.equalsIgnoreCase(name)) {
			stk_lst_limit_num(value);
			return;
		}
		if ($ac_slip_digit.equalsIgnoreCase(name)) {
			ac_slip_digit(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		if ($early_ship_dt_add_days.equalsIgnoreCase(name)) {
			early_ship_dt_add_days(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, float value) {
		if ($st_mon.equalsIgnoreCase(name)) {
			st_mon(value);
			return;
		}
		if ($ac_cl_day.equalsIgnoreCase(name)) {
			ac_cl_day(value);
			return;
		}
		if ($ac_cl_mon_base.equalsIgnoreCase(name)) {
			ac_cl_mon_base(value);
			return;
		}
		if ($dt_switch_time.equalsIgnoreCase(name)) {
			dt_switch_time(value);
			return;
		}
		if ($sls_cl_delay_days.equalsIgnoreCase(name)) {
			sls_cl_delay_days(value);
			return;
		}
		if ($rcv_cl_delay_days.equalsIgnoreCase(name)) {
			rcv_cl_delay_days(value);
			return;
		}
		if ($purc_cl_delay_days.equalsIgnoreCase(name)) {
			purc_cl_delay_days(value);
			return;
		}
		if ($pay_cl_delay_days.equalsIgnoreCase(name)) {
			pay_cl_delay_days(value);
			return;
		}
		if ($stk_cl_delay_days.equalsIgnoreCase(name)) {
			stk_cl_delay_days(value);
			return;
		}
		if ($stk_amt_dec_place.equalsIgnoreCase(name)) {
			stk_amt_dec_place(value);
			return;
		}
		if ($stk_lst_cnf_num.equalsIgnoreCase(name)) {
			stk_lst_cnf_num(value);
			return;
		}
		if ($stk_lst_limit_num.equalsIgnoreCase(name)) {
			stk_lst_limit_num(value);
			return;
		}
		if ($ac_slip_digit.equalsIgnoreCase(name)) {
			ac_slip_digit(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		if ($early_ship_dt_add_days.equalsIgnoreCase(name)) {
			early_ship_dt_add_days(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, double value) {
		if ($st_mon.equalsIgnoreCase(name)) {
			st_mon(value);
			return;
		}
		if ($ac_cl_day.equalsIgnoreCase(name)) {
			ac_cl_day(value);
			return;
		}
		if ($ac_cl_mon_base.equalsIgnoreCase(name)) {
			ac_cl_mon_base(value);
			return;
		}
		if ($dt_switch_time.equalsIgnoreCase(name)) {
			dt_switch_time(value);
			return;
		}
		if ($sls_cl_delay_days.equalsIgnoreCase(name)) {
			sls_cl_delay_days(value);
			return;
		}
		if ($rcv_cl_delay_days.equalsIgnoreCase(name)) {
			rcv_cl_delay_days(value);
			return;
		}
		if ($purc_cl_delay_days.equalsIgnoreCase(name)) {
			purc_cl_delay_days(value);
			return;
		}
		if ($pay_cl_delay_days.equalsIgnoreCase(name)) {
			pay_cl_delay_days(value);
			return;
		}
		if ($stk_cl_delay_days.equalsIgnoreCase(name)) {
			stk_cl_delay_days(value);
			return;
		}
		if ($stk_amt_dec_place.equalsIgnoreCase(name)) {
			stk_amt_dec_place(value);
			return;
		}
		if ($stk_lst_cnf_num.equalsIgnoreCase(name)) {
			stk_lst_cnf_num(value);
			return;
		}
		if ($stk_lst_limit_num.equalsIgnoreCase(name)) {
			stk_lst_limit_num(value);
			return;
		}
		if ($ac_slip_digit.equalsIgnoreCase(name)) {
			ac_slip_digit(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		if ($early_ship_dt_add_days.equalsIgnoreCase(name)) {
			early_ship_dt_add_days(value);
			return;
		}
		super.setNumberNE(name, value);
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
		if ($ar_no_use_flg.equalsIgnoreCase(name)) {
			ar_no_use_flg(value);
			return;
		}
		if ($ap_no_use_flg.equalsIgnoreCase(name)) {
			ap_no_use_flg(value);
			return;
		}
		if ($temp_ap_use_flg.equalsIgnoreCase(name)) {
			temp_ap_use_flg(value);
			return;
		}
		if ($sls_cl_flg.equalsIgnoreCase(name)) {
			sls_cl_flg(value);
			return;
		}
		if ($rcv_cl_flg.equalsIgnoreCase(name)) {
			rcv_cl_flg(value);
			return;
		}
		if ($purc_cl_flg.equalsIgnoreCase(name)) {
			purc_cl_flg(value);
			return;
		}
		if ($pay_cl_flg.equalsIgnoreCase(name)) {
			pay_cl_flg(value);
			return;
		}
		if ($bill_xrate_conv_flg.equalsIgnoreCase(name)) {
			bill_xrate_conv_flg(value);
			return;
		}
		if ($pay_xrate_conv_flg.equalsIgnoreCase(name)) {
			pay_xrate_conv_flg(value);
			return;
		}
		if ($mon01_xrate_rev_flg.equalsIgnoreCase(name)) {
			mon01_xrate_rev_flg(value);
			return;
		}
		if ($mon02_xrate_rev_flg.equalsIgnoreCase(name)) {
			mon02_xrate_rev_flg(value);
			return;
		}
		if ($mon03_xrate_rev_flg.equalsIgnoreCase(name)) {
			mon03_xrate_rev_flg(value);
			return;
		}
		if ($mon04_xrate_rev_flg.equalsIgnoreCase(name)) {
			mon04_xrate_rev_flg(value);
			return;
		}
		if ($mon05_xrate_rev_flg.equalsIgnoreCase(name)) {
			mon05_xrate_rev_flg(value);
			return;
		}
		if ($mon06_xrate_rev_flg.equalsIgnoreCase(name)) {
			mon06_xrate_rev_flg(value);
			return;
		}
		if ($mon07_xrate_rev_flg.equalsIgnoreCase(name)) {
			mon07_xrate_rev_flg(value);
			return;
		}
		if ($mon08_xrate_rev_flg.equalsIgnoreCase(name)) {
			mon08_xrate_rev_flg(value);
			return;
		}
		if ($mon09_xrate_rev_flg.equalsIgnoreCase(name)) {
			mon09_xrate_rev_flg(value);
			return;
		}
		if ($mon10_xrate_rev_flg.equalsIgnoreCase(name)) {
			mon10_xrate_rev_flg(value);
			return;
		}
		if ($mon11_xrate_rev_flg.equalsIgnoreCase(name)) {
			mon11_xrate_rev_flg(value);
			return;
		}
		if ($mon12_xrate_rev_flg.equalsIgnoreCase(name)) {
			mon12_xrate_rev_flg(value);
			return;
		}
		if ($ac_slip_seq_flg.equalsIgnoreCase(name)) {
			ac_slip_seq_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

}
