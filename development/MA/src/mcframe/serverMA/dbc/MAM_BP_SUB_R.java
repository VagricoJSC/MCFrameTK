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
 * "取引先補助マスタ // BP auxiliary master"DBコンテナRowクラスです。<p>
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
 *  	<td>bp_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>取引先ＣＤ</td>
 *  	<td>BP cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>K</td>
 *  	<td>st_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>適用開始日</td>
 *  	<td>Application start date</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>end_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>適用終了日</td>
 *  	<td>Application end date</td>
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
 *  	<td>addr1</td>
 *  	<td>C</td>
 *  	<td>250</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>住所１</td>
 *  	<td>Address 1</td>
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
 *  	<td>addr3</td>
 *  	<td>C</td>
 *  	<td>250</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>住所３</td>
 *  	<td>Address 3</td>
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
 *  	<td>tel</td>
 *  	<td>C</td>
 *  	<td>30</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＴＥＬ</td>
 *  	<td>TEL</td>
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
 *  	<td>cst_cntct_psn_title</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>得意先担当者敬称</td>
 *  	<td>Form of address for Customer PIC</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sls_tax_cd</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>売上税ＣＤ</td>
 *  	<td>Sales tax cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sls_anly_cd1</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>販売分析ＣＤ１</td>
 *  	<td>Sales analysis cd. 1</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sls_anly_cd2</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>販売分析ＣＤ２</td>
 *  	<td>Sales analysis cd. 2</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sls_anly_cd3</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>販売分析ＣＤ３</td>
 *  	<td>Sales analysis cd. 3</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>bcst_dpt_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>請求先担当部門ＣＤ</td>
 *  	<td>Billing customer dept. in charge cd.</td>
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
 *  	<td>bill_tel</td>
 *  	<td>C</td>
 *  	<td>30</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>請求書送付ＴＥＬ</td>
 *  	<td>Invoice send-to TEL</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>bill_bcst_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>請求書宛先</td>
 *  	<td>Invoice destination</td>
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
 *  	<td>bill_bcst_psn</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>請求書送付担当者</td>
 *  	<td>Invoice send-to PIC</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>bill_bcst_psn_title</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>請求書送付担当者敬称</td>
 *  	<td>Invoice send-to PIC honorific</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>vmi_purc_dpt_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＶＭＩ購買部門ＣＤ</td>
 *  	<td>VMI purchasing dept. cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sppl_cntct_dpt</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>発注先部署</td>
 *  	<td>Supplier dept.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sppl_cntct_psn</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>発注先担当者</td>
 *  	<td>Supplier PIC</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sppl_cntct_psn_title</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>発注先担当者敬称</td>
 *  	<td>Supplier PIC form of address</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>purc_tax_cd</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>仕入税ＣＤ</td>
 *  	<td>Purchase tax cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>prov_tax_cd</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>支給税ＣＤ</td>
 *  	<td>Supply tax cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ap_dpt_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>債務部門ＣＤ</td>
 *  	<td>AP dept. cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>bsppl_dpt_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>支払予定管理先担当部門ＣＤ</td>
 *  	<td>Cd. of dept. in charge of scheduled payee</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>pay_dpt_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>支払部門ＣＤ</td>
 *  	<td>Payment dept. cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>dlv_cntct_dpt</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>納品先部署</td>
 *  	<td>Delivery destination dept.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>dlv_cntct_psn</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>納品先担当者</td>
 *  	<td>Delivery destination PIC</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>dlv_cntct_psn_title</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>納品先担当者敬称</td>
 *  	<td>Delivery destination PIC honorific</td>
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
 *  	<td>del_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>論理削除ＦＬＧ</td>
 *  	<td>Logical delete flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>del_usr_id</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>論理削除ユーザＩＤ</td>
 *  	<td>Logical delete user ID</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>del_usr_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>論理削除ユーザ名</td>
 *  	<td>Logical delete user name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>del_ts</td>
 *  	<td>TS</td>
 *  	<td>0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>論理削除日時</td>
 *  	<td>Logical delete date and time</td>
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
 *  	<td>memo4</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>メモ４</td>
 *  	<td>Memo 4</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>memo5</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>メモ５</td>
 *  	<td>Memo 5</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>memo6</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>メモ６</td>
 *  	<td>Memo 6</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>memo7</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>メモ７</td>
 *  	<td>Memo 7</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>memo8</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>メモ８</td>
 *  	<td>Memo 8</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>memo9</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>メモ９</td>
 *  	<td>Memo 9</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>memo10</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>メモ１０</td>
 *  	<td>Memo 10</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>memo11</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>メモ１１</td>
 *  	<td>Memo 11</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>memo12</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>メモ１２</td>
 *  	<td>Memo 12</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>memo13</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>メモ１３</td>
 *  	<td>Memo 13</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>memo14</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>メモ１４</td>
 *  	<td>Memo 14</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>memo15</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>メモ１５</td>
 *  	<td>Memo 15</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>memo16</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>メモ１６</td>
 *  	<td>Memo 16</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>memo17</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>メモ１７</td>
 *  	<td>Memo 17</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>memo18</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>メモ１８</td>
 *  	<td>Memo 18</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>memo19</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>メモ１９</td>
 *  	<td>Memo 19</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>memo20</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>メモ２０</td>
 *  	<td>Memo 20</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>bp_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td>BP1.BP_NM</td>
 *  	<td>取引先名</td>
 *  	<td>BP name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sls_tax_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td>TAX1.TAX_NM</td>
 *  	<td>売上税名</td>
 *  	<td>Sales tax name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>purc_tax_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td>TAX2.TAX_NM</td>
 *  	<td>仕入税名</td>
 *  	<td>Purchase tax type name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>prov_tax_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td>TAX3.TAX_NM</td>
 *  	<td>支給税名</td>
 *  	<td>Supply tax name</td>
 *  </tr>
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
public class MAM_BP_SUB_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.CO_VIEW;

	public static final String TABLE_NAME = "MAM_BP_SUB";

	public static final boolean EX_CTRL = true;
	
	public static final boolean LCL_TABLE = false;
	
	/**
	 * 取引先ＣＤ. BP cd..<p>
	 *
	 */
	public static final String $bp_cd = "bp_cd";
	private static final MCPermColumnInfo _bp_cd = createColumnInfo("bp_cd");
	public final MCStringPermColumn bp_cd = createStringColumn(_bp_cd);
	
	/**
	 * 適用開始日. Application start date.<p>
	 *
	 */
	public static final String $st_dt = "st_dt";
	private static final MCPermColumnInfo _st_dt = createColumnInfo("st_dt");
	public final MCDatePermColumn st_dt = createDateColumn(_st_dt);
	
	/**
	 * 適用終了日. Application end date.<p>
	 *
	 */
	public static final String $end_dt = "end_dt";
	private static final MCPermColumnInfo _end_dt = createColumnInfo("end_dt");
	public final MCDatePermColumn end_dt = createDateColumn(_end_dt);
	
	/**
	 * 郵便番号. Zip code.<p>
	 *
	 */
	public static final String $zip_cd = "zip_cd";
	private static final MCPermColumnInfo _zip_cd = createColumnInfo("zip_cd");
	public final MCStringPermColumn zip_cd = createStringColumn(_zip_cd);
	
	/**
	 * 住所１. Address 1.<p>
	 *
	 */
	public static final String $addr1 = "addr1";
	private static final MCPermColumnInfo _addr1 = createColumnInfo("addr1");
	public final MCStringPermColumn addr1 = createStringColumn(_addr1);
	
	/**
	 * 住所２. Address 2.<p>
	 *
	 */
	public static final String $addr2 = "addr2";
	private static final MCPermColumnInfo _addr2 = createColumnInfo("addr2");
	public final MCStringPermColumn addr2 = createStringColumn(_addr2);
	
	/**
	 * 住所３. Address 3.<p>
	 *
	 */
	public static final String $addr3 = "addr3";
	private static final MCPermColumnInfo _addr3 = createColumnInfo("addr3");
	public final MCStringPermColumn addr3 = createStringColumn(_addr3);
	
	/**
	 * 住所４. Address 4.<p>
	 *
	 */
	public static final String $addr4 = "addr4";
	private static final MCPermColumnInfo _addr4 = createColumnInfo("addr4");
	public final MCStringPermColumn addr4 = createStringColumn(_addr4);
	
	/**
	 * ＴＥＬ. TEL.<p>
	 *
	 */
	public static final String $tel = "tel";
	private static final MCPermColumnInfo _tel = createColumnInfo("tel");
	public final MCStringPermColumn tel = createStringColumn(_tel);
	
	/**
	 * ＦＡＸ. FAX.<p>
	 *
	 */
	public static final String $fax = "fax";
	private static final MCPermColumnInfo _fax = createColumnInfo("fax");
	public final MCStringPermColumn fax = createStringColumn(_fax);
	
	/**
	 * 債権部門ＣＤ. AR dept. cd..<p>
	 *
	 */
	public static final String $ar_dpt_cd = "ar_dpt_cd";
	private static final MCPermColumnInfo _ar_dpt_cd = createColumnInfo("ar_dpt_cd");
	public final MCStringPermColumn ar_dpt_cd = createStringColumn(_ar_dpt_cd);
	
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
	 * 得意先担当者敬称. Form of address for Customer PIC.<p>
	 *
	 */
	public static final String $cst_cntct_psn_title = "cst_cntct_psn_title";
	private static final MCPermColumnInfo _cst_cntct_psn_title = createColumnInfo("cst_cntct_psn_title");
	public final MCStringPermColumn cst_cntct_psn_title = createStringColumn(_cst_cntct_psn_title);
	
	/**
	 * 売上税ＣＤ. Sales tax cd..<p>
	 *
	 */
	public static final String $sls_tax_cd = "sls_tax_cd";
	private static final MCPermColumnInfo _sls_tax_cd = createColumnInfo("sls_tax_cd");
	public final MCStringPermColumn sls_tax_cd = createStringColumn(_sls_tax_cd);
	
	/**
	 * 販売分析ＣＤ１. Sales analysis cd. 1.<p>
	 *
	 */
	public static final String $sls_anly_cd1 = "sls_anly_cd1";
	private static final MCPermColumnInfo _sls_anly_cd1 = createColumnInfo("sls_anly_cd1");
	public final MCStringPermColumn sls_anly_cd1 = createStringColumn(_sls_anly_cd1);
	
	/**
	 * 販売分析ＣＤ２. Sales analysis cd. 2.<p>
	 *
	 */
	public static final String $sls_anly_cd2 = "sls_anly_cd2";
	private static final MCPermColumnInfo _sls_anly_cd2 = createColumnInfo("sls_anly_cd2");
	public final MCStringPermColumn sls_anly_cd2 = createStringColumn(_sls_anly_cd2);
	
	/**
	 * 販売分析ＣＤ３. Sales analysis cd. 3.<p>
	 *
	 */
	public static final String $sls_anly_cd3 = "sls_anly_cd3";
	private static final MCPermColumnInfo _sls_anly_cd3 = createColumnInfo("sls_anly_cd3");
	public final MCStringPermColumn sls_anly_cd3 = createStringColumn(_sls_anly_cd3);
	
	/**
	 * 請求先担当部門ＣＤ. Billing customer dept. in charge cd..<p>
	 *
	 */
	public static final String $bcst_dpt_cd = "bcst_dpt_cd";
	private static final MCPermColumnInfo _bcst_dpt_cd = createColumnInfo("bcst_dpt_cd");
	public final MCStringPermColumn bcst_dpt_cd = createStringColumn(_bcst_dpt_cd);
	
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
	 * 請求書送付ＴＥＬ. Invoice send-to TEL.<p>
	 *
	 */
	public static final String $bill_tel = "bill_tel";
	private static final MCPermColumnInfo _bill_tel = createColumnInfo("bill_tel");
	public final MCStringPermColumn bill_tel = createStringColumn(_bill_tel);
	
	/**
	 * 請求書宛先. Invoice destination.<p>
	 *
	 */
	public static final String $bill_bcst_nm = "bill_bcst_nm";
	private static final MCPermColumnInfo _bill_bcst_nm = createColumnInfo("bill_bcst_nm");
	public final MCStringPermColumn bill_bcst_nm = createStringColumn(_bill_bcst_nm);
	
	/**
	 * 請求書送付部署. Invoice send-to dept..<p>
	 *
	 */
	public static final String $bill_bcst_dpt = "bill_bcst_dpt";
	private static final MCPermColumnInfo _bill_bcst_dpt = createColumnInfo("bill_bcst_dpt");
	public final MCStringPermColumn bill_bcst_dpt = createStringColumn(_bill_bcst_dpt);
	
	/**
	 * 請求書送付担当者. Invoice send-to PIC.<p>
	 *
	 */
	public static final String $bill_bcst_psn = "bill_bcst_psn";
	private static final MCPermColumnInfo _bill_bcst_psn = createColumnInfo("bill_bcst_psn");
	public final MCStringPermColumn bill_bcst_psn = createStringColumn(_bill_bcst_psn);
	
	/**
	 * 請求書送付担当者敬称. Invoice send-to PIC honorific.<p>
	 *
	 */
	public static final String $bill_bcst_psn_title = "bill_bcst_psn_title";
	private static final MCPermColumnInfo _bill_bcst_psn_title = createColumnInfo("bill_bcst_psn_title");
	public final MCStringPermColumn bill_bcst_psn_title = createStringColumn(_bill_bcst_psn_title);
	
	/**
	 * ＶＭＩ購買部門ＣＤ. VMI purchasing dept. cd..<p>
	 *
	 */
	public static final String $vmi_purc_dpt_cd = "vmi_purc_dpt_cd";
	private static final MCPermColumnInfo _vmi_purc_dpt_cd = createColumnInfo("vmi_purc_dpt_cd");
	public final MCStringPermColumn vmi_purc_dpt_cd = createStringColumn(_vmi_purc_dpt_cd);
	
	/**
	 * 発注先部署. Supplier dept..<p>
	 *
	 */
	public static final String $sppl_cntct_dpt = "sppl_cntct_dpt";
	private static final MCPermColumnInfo _sppl_cntct_dpt = createColumnInfo("sppl_cntct_dpt");
	public final MCStringPermColumn sppl_cntct_dpt = createStringColumn(_sppl_cntct_dpt);
	
	/**
	 * 発注先担当者. Supplier PIC.<p>
	 *
	 */
	public static final String $sppl_cntct_psn = "sppl_cntct_psn";
	private static final MCPermColumnInfo _sppl_cntct_psn = createColumnInfo("sppl_cntct_psn");
	public final MCStringPermColumn sppl_cntct_psn = createStringColumn(_sppl_cntct_psn);
	
	/**
	 * 発注先担当者敬称. Supplier PIC form of address.<p>
	 *
	 */
	public static final String $sppl_cntct_psn_title = "sppl_cntct_psn_title";
	private static final MCPermColumnInfo _sppl_cntct_psn_title = createColumnInfo("sppl_cntct_psn_title");
	public final MCStringPermColumn sppl_cntct_psn_title = createStringColumn(_sppl_cntct_psn_title);
	
	/**
	 * 仕入税ＣＤ. Purchase tax cd..<p>
	 *
	 */
	public static final String $purc_tax_cd = "purc_tax_cd";
	private static final MCPermColumnInfo _purc_tax_cd = createColumnInfo("purc_tax_cd");
	public final MCStringPermColumn purc_tax_cd = createStringColumn(_purc_tax_cd);
	
	/**
	 * 支給税ＣＤ. Supply tax cd..<p>
	 *
	 */
	public static final String $prov_tax_cd = "prov_tax_cd";
	private static final MCPermColumnInfo _prov_tax_cd = createColumnInfo("prov_tax_cd");
	public final MCStringPermColumn prov_tax_cd = createStringColumn(_prov_tax_cd);
	
	/**
	 * 債務部門ＣＤ. AP dept. cd..<p>
	 *
	 */
	public static final String $ap_dpt_cd = "ap_dpt_cd";
	private static final MCPermColumnInfo _ap_dpt_cd = createColumnInfo("ap_dpt_cd");
	public final MCStringPermColumn ap_dpt_cd = createStringColumn(_ap_dpt_cd);
	
	/**
	 * 支払予定管理先担当部門ＣＤ. Cd. of dept. in charge of scheduled payee.<p>
	 *
	 */
	public static final String $bsppl_dpt_cd = "bsppl_dpt_cd";
	private static final MCPermColumnInfo _bsppl_dpt_cd = createColumnInfo("bsppl_dpt_cd");
	public final MCStringPermColumn bsppl_dpt_cd = createStringColumn(_bsppl_dpt_cd);
	
	/**
	 * 支払部門ＣＤ. Payment dept. cd..<p>
	 *
	 */
	public static final String $pay_dpt_cd = "pay_dpt_cd";
	private static final MCPermColumnInfo _pay_dpt_cd = createColumnInfo("pay_dpt_cd");
	public final MCStringPermColumn pay_dpt_cd = createStringColumn(_pay_dpt_cd);
	
	/**
	 * 納品先部署. Delivery destination dept..<p>
	 *
	 */
	public static final String $dlv_cntct_dpt = "dlv_cntct_dpt";
	private static final MCPermColumnInfo _dlv_cntct_dpt = createColumnInfo("dlv_cntct_dpt");
	public final MCStringPermColumn dlv_cntct_dpt = createStringColumn(_dlv_cntct_dpt);
	
	/**
	 * 納品先担当者. Delivery destination PIC.<p>
	 *
	 */
	public static final String $dlv_cntct_psn = "dlv_cntct_psn";
	private static final MCPermColumnInfo _dlv_cntct_psn = createColumnInfo("dlv_cntct_psn");
	public final MCStringPermColumn dlv_cntct_psn = createStringColumn(_dlv_cntct_psn);
	
	/**
	 * 納品先担当者敬称. Delivery destination PIC honorific.<p>
	 *
	 */
	public static final String $dlv_cntct_psn_title = "dlv_cntct_psn_title";
	private static final MCPermColumnInfo _dlv_cntct_psn_title = createColumnInfo("dlv_cntct_psn_title");
	public final MCStringPermColumn dlv_cntct_psn_title = createStringColumn(_dlv_cntct_psn_title);
	
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
	 * 論理削除ＦＬＧ. Logical delete flg..<p>
	 *
	 */
	public static final String $del_flg = "del_flg";
	private static final MCPermColumnInfo _del_flg = createColumnInfo("del_flg");
	public final MCBooleanPermColumn del_flg = createBooleanColumn(_del_flg);
	
	/**
	 * 論理削除ユーザＩＤ. Logical delete user ID.<p>
	 *
	 */
	public static final String $del_usr_id = "del_usr_id";
	private static final MCPermColumnInfo _del_usr_id = createColumnInfo("del_usr_id");
	public final MCStringPermColumn del_usr_id = createStringColumn(_del_usr_id);
	
	/**
	 * 論理削除ユーザ名. Logical delete user name.<p>
	 *
	 */
	public static final String $del_usr_nm = "del_usr_nm";
	private static final MCPermColumnInfo _del_usr_nm = createColumnInfo("del_usr_nm");
	public final MCStringPermColumn del_usr_nm = createStringColumn(_del_usr_nm);
	
	/**
	 * 論理削除日時. Logical delete date and time.<p>
	 *
	 */
	public static final String $del_ts = "del_ts";
	private static final MCPermColumnInfo _del_ts = createColumnInfo("del_ts");
	public final MCTimestampPermColumn del_ts = createTimestampColumn(_del_ts);
	
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
	 * メモ４. Memo 4.<p>
	 *
	 */
	public static final String $memo4 = "memo4";
	private static final MCPermColumnInfo _memo4 = createColumnInfo("memo4");
	public final MCStringPermColumn memo4 = createStringColumn(_memo4);
	
	/**
	 * メモ５. Memo 5.<p>
	 *
	 */
	public static final String $memo5 = "memo5";
	private static final MCPermColumnInfo _memo5 = createColumnInfo("memo5");
	public final MCStringPermColumn memo5 = createStringColumn(_memo5);
	
	/**
	 * メモ６. Memo 6.<p>
	 *
	 */
	public static final String $memo6 = "memo6";
	private static final MCPermColumnInfo _memo6 = createColumnInfo("memo6");
	public final MCStringPermColumn memo6 = createStringColumn(_memo6);
	
	/**
	 * メモ７. Memo 7.<p>
	 *
	 */
	public static final String $memo7 = "memo7";
	private static final MCPermColumnInfo _memo7 = createColumnInfo("memo7");
	public final MCStringPermColumn memo7 = createStringColumn(_memo7);
	
	/**
	 * メモ８. Memo 8.<p>
	 *
	 */
	public static final String $memo8 = "memo8";
	private static final MCPermColumnInfo _memo8 = createColumnInfo("memo8");
	public final MCStringPermColumn memo8 = createStringColumn(_memo8);
	
	/**
	 * メモ９. Memo 9.<p>
	 *
	 */
	public static final String $memo9 = "memo9";
	private static final MCPermColumnInfo _memo9 = createColumnInfo("memo9");
	public final MCStringPermColumn memo9 = createStringColumn(_memo9);
	
	/**
	 * メモ１０. Memo 10.<p>
	 *
	 */
	public static final String $memo10 = "memo10";
	private static final MCPermColumnInfo _memo10 = createColumnInfo("memo10");
	public final MCStringPermColumn memo10 = createStringColumn(_memo10);
	
	/**
	 * メモ１１. Memo 11.<p>
	 *
	 */
	public static final String $memo11 = "memo11";
	private static final MCPermColumnInfo _memo11 = createColumnInfo("memo11");
	public final MCStringPermColumn memo11 = createStringColumn(_memo11);
	
	/**
	 * メモ１２. Memo 12.<p>
	 *
	 */
	public static final String $memo12 = "memo12";
	private static final MCPermColumnInfo _memo12 = createColumnInfo("memo12");
	public final MCStringPermColumn memo12 = createStringColumn(_memo12);
	
	/**
	 * メモ１３. Memo 13.<p>
	 *
	 */
	public static final String $memo13 = "memo13";
	private static final MCPermColumnInfo _memo13 = createColumnInfo("memo13");
	public final MCStringPermColumn memo13 = createStringColumn(_memo13);
	
	/**
	 * メモ１４. Memo 14.<p>
	 *
	 */
	public static final String $memo14 = "memo14";
	private static final MCPermColumnInfo _memo14 = createColumnInfo("memo14");
	public final MCStringPermColumn memo14 = createStringColumn(_memo14);
	
	/**
	 * メモ１５. Memo 15.<p>
	 *
	 */
	public static final String $memo15 = "memo15";
	private static final MCPermColumnInfo _memo15 = createColumnInfo("memo15");
	public final MCStringPermColumn memo15 = createStringColumn(_memo15);
	
	/**
	 * メモ１６. Memo 16.<p>
	 *
	 */
	public static final String $memo16 = "memo16";
	private static final MCPermColumnInfo _memo16 = createColumnInfo("memo16");
	public final MCStringPermColumn memo16 = createStringColumn(_memo16);
	
	/**
	 * メモ１７. Memo 17.<p>
	 *
	 */
	public static final String $memo17 = "memo17";
	private static final MCPermColumnInfo _memo17 = createColumnInfo("memo17");
	public final MCStringPermColumn memo17 = createStringColumn(_memo17);
	
	/**
	 * メモ１８. Memo 18.<p>
	 *
	 */
	public static final String $memo18 = "memo18";
	private static final MCPermColumnInfo _memo18 = createColumnInfo("memo18");
	public final MCStringPermColumn memo18 = createStringColumn(_memo18);
	
	/**
	 * メモ１９. Memo 19.<p>
	 *
	 */
	public static final String $memo19 = "memo19";
	private static final MCPermColumnInfo _memo19 = createColumnInfo("memo19");
	public final MCStringPermColumn memo19 = createStringColumn(_memo19);
	
	/**
	 * メモ２０. Memo 20.<p>
	 *
	 */
	public static final String $memo20 = "memo20";
	private static final MCPermColumnInfo _memo20 = createColumnInfo("memo20");
	public final MCStringPermColumn memo20 = createStringColumn(_memo20);
	
	/**
	 * 取引先名. BP name.<p>
	 *
	 */
	public static final String $bp_nm = "bp_nm";
	
	/**
	 * 売上税名. Sales tax name.<p>
	 *
	 */
	public static final String $sls_tax_nm = "sls_tax_nm";
	
	/**
	 * 仕入税名. Purchase tax type name.<p>
	 *
	 */
	public static final String $purc_tax_nm = "purc_tax_nm";
	
	/**
	 * 支給税名. Supply tax name.<p>
	 *
	 */
	public static final String $prov_tax_nm = "prov_tax_nm";
	
	public static final MCMeta bp_cd_META = createCommonMeta($bp_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta st_dt_META = createCommonMeta($st_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta end_dt_META = createCommonMeta($end_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta zip_cd_META = createCommonMeta($zip_cd, mcframe.commonMA.meta.MA_META.ZIP_CD);
	public static final MCMeta addr1_META = createCommonMeta($addr1, mcframe.commonMA.meta.MA_META.ADDR1);
	public static final MCMeta addr2_META = createCommonMeta($addr2, mcframe.commonMA.meta.MA_META.ADDR2);
	public static final MCMeta addr3_META = createCommonMeta($addr3, mcframe.commonMA.meta.MA_META.ADDR3);
	public static final MCMeta addr4_META = createCommonMeta($addr4, mcframe.commonMA.meta.MA_META.ADDR4);
	public static final MCMeta tel_META = createCommonMeta($tel, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta fax_META = createCommonMeta($fax, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta ar_dpt_cd_META = createCommonMeta($ar_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta cst_cntct_dpt_META = createCommonMeta($cst_cntct_dpt, mcframe.commonMA.meta.MA_META.CNTCT_DPT);
	public static final MCMeta cst_cntct_psn_META = createCommonMeta($cst_cntct_psn, mcframe.commonMA.meta.MA_META.CNTCT_PSN);
	public static final MCMeta cst_cntct_psn_title_META = createCommonMeta($cst_cntct_psn_title, mcframe.commonMA.meta.MA_META.BP_PSN_TITLE);
	public static final MCMeta sls_tax_cd_META = createCommonMeta($sls_tax_cd, mcframe.commonMA.meta.MA_META.TAX_CD);
	public static final MCMeta sls_anly_cd1_META = createCommonMeta($sls_anly_cd1, mcframe.commonMA.meta.MA_META.SLS_ANLY_CD);
	public static final MCMeta sls_anly_cd2_META = createCommonMeta($sls_anly_cd2, mcframe.commonMA.meta.MA_META.SLS_ANLY_CD);
	public static final MCMeta sls_anly_cd3_META = createCommonMeta($sls_anly_cd3, mcframe.commonMA.meta.MA_META.SLS_ANLY_CD);
	public static final MCMeta bcst_dpt_cd_META = createCommonMeta($bcst_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta bill_zip_cd_META = createCommonMeta($bill_zip_cd, mcframe.commonMA.meta.MA_META.ZIP_CD);
	public static final MCMeta bill_addr1_META = createCommonMeta($bill_addr1, mcframe.commonMA.meta.MA_META.ADDR1);
	public static final MCMeta bill_addr2_META = createCommonMeta($bill_addr2, mcframe.commonMA.meta.MA_META.ADDR2);
	public static final MCMeta bill_addr3_META = createCommonMeta($bill_addr3, mcframe.commonMA.meta.MA_META.ADDR3);
	public static final MCMeta bill_addr4_META = createCommonMeta($bill_addr4, mcframe.commonMA.meta.MA_META.ADDR4);
	public static final MCMeta bill_tel_META = createCommonMeta($bill_tel, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta bill_bcst_nm_META = createCommonMeta($bill_bcst_nm, mcframe.commonMA.meta.MA_META.BILL_BCST_NM);
	public static final MCMeta bill_bcst_dpt_META = createCommonMeta($bill_bcst_dpt, mcframe.commonMA.meta.MA_META.BP_CNTCT_DPT);
	public static final MCMeta bill_bcst_psn_META = createCommonMeta($bill_bcst_psn, mcframe.commonMA.meta.MA_META.BP_CNTCT_PSN);
	public static final MCMeta bill_bcst_psn_title_META = createCommonMeta($bill_bcst_psn_title, mcframe.commonMA.meta.MA_META.BP_PSN_TITLE);
	public static final MCMeta vmi_purc_dpt_cd_META = createCommonMeta($vmi_purc_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta sppl_cntct_dpt_META = createCommonMeta($sppl_cntct_dpt, mcframe.commonMA.meta.MA_META.CNTCT_DPT);
	public static final MCMeta sppl_cntct_psn_META = createCommonMeta($sppl_cntct_psn, mcframe.commonMA.meta.MA_META.CNTCT_PSN);
	public static final MCMeta sppl_cntct_psn_title_META = createCommonMeta($sppl_cntct_psn_title, mcframe.commonMA.meta.MA_META.BP_PSN_TITLE);
	public static final MCMeta purc_tax_cd_META = createCommonMeta($purc_tax_cd, mcframe.commonMA.meta.MA_META.TAX_CD);
	public static final MCMeta prov_tax_cd_META = createCommonMeta($prov_tax_cd, mcframe.commonMA.meta.MA_META.TAX_CD);
	public static final MCMeta ap_dpt_cd_META = createCommonMeta($ap_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta bsppl_dpt_cd_META = createCommonMeta($bsppl_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta pay_dpt_cd_META = createCommonMeta($pay_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta dlv_cntct_dpt_META = createCommonMeta($dlv_cntct_dpt, mcframe.commonMA.meta.MA_META.BP_CNTCT_DPT);
	public static final MCMeta dlv_cntct_psn_META = createCommonMeta($dlv_cntct_psn, mcframe.commonMA.meta.MA_META.BP_CNTCT_PSN);
	public static final MCMeta dlv_cntct_psn_title_META = createCommonMeta($dlv_cntct_psn_title, mcframe.commonMA.meta.MA_META.BP_PSN_TITLE);
	public static final MCMeta memo1_META = createCommonMeta($memo1, mcframe.commonMA.meta.MA_META.MST_MEMO1);
	public static final MCMeta memo2_META = createCommonMeta($memo2, mcframe.commonMA.meta.MA_META.MST_MEMO2);
	public static final MCMeta memo3_META = createCommonMeta($memo3, mcframe.commonMA.meta.MA_META.MST_MEMO3);
	public static final MCMeta del_flg_META = createCommonMeta($del_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta del_usr_id_META = createCommonMeta($del_usr_id, mcframe.commonMA.meta.MA_META.FCM_USR_ID);
	public static final MCMeta del_usr_nm_META = createCommonMeta($del_usr_nm, mcframe.commonMA.meta.MA_META.FCM_USR_NM);
	public static final MCMeta del_ts_META = createCommonMeta($del_ts, mcframe.commonMA.meta.MA_META.SYS_TS);
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
	public static final MCMeta memo4_META = createCommonMeta($memo4, mcframe.commonMA.meta.MA_META.MST_MEMO4);
	public static final MCMeta memo5_META = createCommonMeta($memo5, mcframe.commonMA.meta.MA_META.MST_MEMO5);
	public static final MCMeta memo6_META = createCommonMeta($memo6, mcframe.commonMA.meta.MA_META.MST_MEMO6);
	public static final MCMeta memo7_META = createCommonMeta($memo7, mcframe.commonMA.meta.MA_META.MST_MEMO7);
	public static final MCMeta memo8_META = createCommonMeta($memo8, mcframe.commonMA.meta.MA_META.MST_MEMO8);
	public static final MCMeta memo9_META = createCommonMeta($memo9, mcframe.commonMA.meta.MA_META.MST_MEMO9);
	public static final MCMeta memo10_META = createCommonMeta($memo10, mcframe.commonMA.meta.MA_META.MST_MEMO10);
	public static final MCMeta memo11_META = createCommonMeta($memo11, mcframe.commonMA.meta.MA_META.MST_MEMO11);
	public static final MCMeta memo12_META = createCommonMeta($memo12, mcframe.commonMA.meta.MA_META.MST_MEMO12);
	public static final MCMeta memo13_META = createCommonMeta($memo13, mcframe.commonMA.meta.MA_META.MST_MEMO13);
	public static final MCMeta memo14_META = createCommonMeta($memo14, mcframe.commonMA.meta.MA_META.MST_MEMO14);
	public static final MCMeta memo15_META = createCommonMeta($memo15, mcframe.commonMA.meta.MA_META.MST_MEMO15);
	public static final MCMeta memo16_META = createCommonMeta($memo16, mcframe.commonMA.meta.MA_META.MST_MEMO16);
	public static final MCMeta memo17_META = createCommonMeta($memo17, mcframe.commonMA.meta.MA_META.MST_MEMO17);
	public static final MCMeta memo18_META = createCommonMeta($memo18, mcframe.commonMA.meta.MA_META.MST_MEMO18);
	public static final MCMeta memo19_META = createCommonMeta($memo19, mcframe.commonMA.meta.MA_META.MST_MEMO19);
	public static final MCMeta memo20_META = createCommonMeta($memo20, mcframe.commonMA.meta.MA_META.MST_MEMO20);
	public static final MCMeta bp_nm_META = createCommonMeta($bp_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta sls_tax_nm_META = createCommonMeta($sls_tax_nm, mcframe.commonMA.meta.MA_META.TAX_NM);
	public static final MCMeta purc_tax_nm_META = createCommonMeta($purc_tax_nm, mcframe.commonMA.meta.MA_META.TAX_NM);
	public static final MCMeta prov_tax_nm_META = createCommonMeta($prov_tax_nm, mcframe.commonMA.meta.MA_META.TAX_NM);

	protected static final List<MCForeignInfo> FOREIGN_INFO_LIST = new ArrayList<>();
	public static final String $BP1 = "BP1";
	public static final String $TAX1 = "TAX1";
	public static final String $TAX2 = "TAX2";
	public static final String $TAX3 = "TAX3";
	static {
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_BP",
				$BP1,
				new String[][]{
						{"bp_cd", "bp_cd"}
				},
				() -> {
					return mcframe.serverMA.dbc.MAM_BP_R.create("BP1");
				},
				(alias) -> {
					MAM_BP_SUB_R own = MAM_BP_SUB_R.create(alias);
					mcframe.serverMA.dbc.MAM_BP_R ref = mcframe.serverMA.dbc.MAM_BP_R.create("BP1");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.bp_cd.eq(ref.bp_cd));
					return cond;
				}
			)
		);
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_TAX",
				$TAX1,
				new String[][]{
						{"sls_tax_cd", "tax_cd"}
				},
				() -> {
					return mcframe.serverMA.dbc.MAM_TAX_R.create("TAX1");
				},
				(alias) -> {
					MAM_BP_SUB_R own = MAM_BP_SUB_R.create(alias);
					mcframe.serverMA.dbc.MAM_TAX_R ref = mcframe.serverMA.dbc.MAM_TAX_R.create("TAX1");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.sls_tax_cd.eq(ref.tax_cd));
					return cond;
				}
			)
		);
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_TAX",
				$TAX2,
				new String[][]{
						{"purc_tax_cd", "tax_cd"}
				},
				() -> {
					return mcframe.serverMA.dbc.MAM_TAX_R.create("TAX2");
				},
				(alias) -> {
					MAM_BP_SUB_R own = MAM_BP_SUB_R.create(alias);
					mcframe.serverMA.dbc.MAM_TAX_R ref = mcframe.serverMA.dbc.MAM_TAX_R.create("TAX2");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.purc_tax_cd.eq(ref.tax_cd));
					return cond;
				}
			)
		);
		FOREIGN_INFO_LIST.add(
			new MCForeignInfo(
				"MAM_TAX",
				$TAX3,
				new String[][]{
						{"prov_tax_cd", "tax_cd"}
				},
				() -> {
					return mcframe.serverMA.dbc.MAM_TAX_R.create("TAX3");
				},
				(alias) -> {
					MAM_BP_SUB_R own = MAM_BP_SUB_R.create(alias);
					mcframe.serverMA.dbc.MAM_TAX_R ref = mcframe.serverMA.dbc.MAM_TAX_R.create("TAX3");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.prov_tax_cd.eq(ref.tax_cd));
					return cond;
				}
			)
		);
	}
	
	protected static final ConstMetaList<MAM_BP_SUB_R> constMetas = new ConstMetaList<MAM_BP_SUB_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			bp_cd_META,
			st_dt_META,
			end_dt_META,
			zip_cd_META,
			addr1_META,
			addr2_META,
			addr3_META,
			addr4_META,
			tel_META,
			fax_META,
			ar_dpt_cd_META,
			cst_cntct_dpt_META,
			cst_cntct_psn_META,
			cst_cntct_psn_title_META,
			sls_tax_cd_META,
			sls_anly_cd1_META,
			sls_anly_cd2_META,
			sls_anly_cd3_META,
			bcst_dpt_cd_META,
			bill_zip_cd_META,
			bill_addr1_META,
			bill_addr2_META,
			bill_addr3_META,
			bill_addr4_META,
			bill_tel_META,
			bill_bcst_nm_META,
			bill_bcst_dpt_META,
			bill_bcst_psn_META,
			bill_bcst_psn_title_META,
			vmi_purc_dpt_cd_META,
			sppl_cntct_dpt_META,
			sppl_cntct_psn_META,
			sppl_cntct_psn_title_META,
			purc_tax_cd_META,
			prov_tax_cd_META,
			ap_dpt_cd_META,
			bsppl_dpt_cd_META,
			pay_dpt_cd_META,
			dlv_cntct_dpt_META,
			dlv_cntct_psn_META,
			dlv_cntct_psn_title_META,
			memo1_META,
			memo2_META,
			memo3_META,
			del_flg_META,
			del_usr_id_META,
			del_usr_nm_META,
			del_ts_META,
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
			memo4_META,
			memo5_META,
			memo6_META,
			memo7_META,
			memo8_META,
			memo9_META,
			memo10_META,
			memo11_META,
			memo12_META,
			memo13_META,
			memo14_META,
			memo15_META,
			memo16_META,
			memo17_META,
			memo18_META,
			memo19_META,
			memo20_META,
			bp_nm_META,
			sls_tax_nm_META,
			purc_tax_nm_META,
			prov_tax_nm_META
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
	protected MAM_BP_SUB_R(ConstMetaList<? extends MAM_BP_SUB_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MAM_BP_SUB_R(ConstMetaList<? extends MAM_BP_SUB_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MAM_BP_SUB_R.$bp_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_BP_SUB_R.$bp_cd,
				"bp_cd",
				bp_cd,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_BP_SUB_R.$st_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MAM_BP_SUB_R.$st_dt,
				"st_dt",
				st_dt,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_BP_SUB_R.$end_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MAM_BP_SUB_R.$end_dt,
				"end_dt",
				end_dt,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_BP_SUB_R.$zip_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_BP_SUB_R.$zip_cd,
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
			MAM_BP_SUB_R.$addr1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_BP_SUB_R.$addr1,
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
			MAM_BP_SUB_R.$addr2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_BP_SUB_R.$addr2,
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
			MAM_BP_SUB_R.$addr3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_BP_SUB_R.$addr3,
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
			MAM_BP_SUB_R.$addr4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_BP_SUB_R.$addr4,
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
			MAM_BP_SUB_R.$tel,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_BP_SUB_R.$tel,
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
			MAM_BP_SUB_R.$fax,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_BP_SUB_R.$fax,
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
			MAM_BP_SUB_R.$ar_dpt_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_BP_SUB_R.$ar_dpt_cd,
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
			MAM_BP_SUB_R.$cst_cntct_dpt,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_BP_SUB_R.$cst_cntct_dpt,
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
			MAM_BP_SUB_R.$cst_cntct_psn,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_BP_SUB_R.$cst_cntct_psn,
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
			MAM_BP_SUB_R.$cst_cntct_psn_title,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_BP_SUB_R.$cst_cntct_psn_title,
				"cst_cntct_psn_title",
				cst_cntct_psn_title,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_BP_SUB_R.$sls_tax_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_BP_SUB_R.$sls_tax_cd,
				"sls_tax_cd",
				sls_tax_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_BP_SUB_R.$sls_anly_cd1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_BP_SUB_R.$sls_anly_cd1,
				"sls_anly_cd1",
				sls_anly_cd1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_BP_SUB_R.$sls_anly_cd2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_BP_SUB_R.$sls_anly_cd2,
				"sls_anly_cd2",
				sls_anly_cd2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_BP_SUB_R.$sls_anly_cd3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_BP_SUB_R.$sls_anly_cd3,
				"sls_anly_cd3",
				sls_anly_cd3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_BP_SUB_R.$bcst_dpt_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_BP_SUB_R.$bcst_dpt_cd,
				"bcst_dpt_cd",
				bcst_dpt_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_BP_SUB_R.$bill_zip_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_BP_SUB_R.$bill_zip_cd,
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
			MAM_BP_SUB_R.$bill_addr1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_BP_SUB_R.$bill_addr1,
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
			MAM_BP_SUB_R.$bill_addr2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_BP_SUB_R.$bill_addr2,
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
			MAM_BP_SUB_R.$bill_addr3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_BP_SUB_R.$bill_addr3,
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
			MAM_BP_SUB_R.$bill_addr4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_BP_SUB_R.$bill_addr4,
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
			MAM_BP_SUB_R.$bill_tel,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_BP_SUB_R.$bill_tel,
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
			MAM_BP_SUB_R.$bill_bcst_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_BP_SUB_R.$bill_bcst_nm,
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
			MAM_BP_SUB_R.$bill_bcst_dpt,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_BP_SUB_R.$bill_bcst_dpt,
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
			MAM_BP_SUB_R.$bill_bcst_psn,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_BP_SUB_R.$bill_bcst_psn,
				"bill_bcst_psn",
				bill_bcst_psn,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_BP_SUB_R.$bill_bcst_psn_title,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_BP_SUB_R.$bill_bcst_psn_title,
				"bill_bcst_psn_title",
				bill_bcst_psn_title,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_BP_SUB_R.$vmi_purc_dpt_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_BP_SUB_R.$vmi_purc_dpt_cd,
				"vmi_purc_dpt_cd",
				vmi_purc_dpt_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_BP_SUB_R.$sppl_cntct_dpt,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_BP_SUB_R.$sppl_cntct_dpt,
				"sppl_cntct_dpt",
				sppl_cntct_dpt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_BP_SUB_R.$sppl_cntct_psn,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_BP_SUB_R.$sppl_cntct_psn,
				"sppl_cntct_psn",
				sppl_cntct_psn,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_BP_SUB_R.$sppl_cntct_psn_title,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_BP_SUB_R.$sppl_cntct_psn_title,
				"sppl_cntct_psn_title",
				sppl_cntct_psn_title,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_BP_SUB_R.$purc_tax_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_BP_SUB_R.$purc_tax_cd,
				"purc_tax_cd",
				purc_tax_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_BP_SUB_R.$prov_tax_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_BP_SUB_R.$prov_tax_cd,
				"prov_tax_cd",
				prov_tax_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_BP_SUB_R.$ap_dpt_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_BP_SUB_R.$ap_dpt_cd,
				"ap_dpt_cd",
				ap_dpt_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_BP_SUB_R.$bsppl_dpt_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_BP_SUB_R.$bsppl_dpt_cd,
				"bsppl_dpt_cd",
				bsppl_dpt_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_BP_SUB_R.$pay_dpt_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_BP_SUB_R.$pay_dpt_cd,
				"pay_dpt_cd",
				pay_dpt_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_BP_SUB_R.$dlv_cntct_dpt,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_BP_SUB_R.$dlv_cntct_dpt,
				"dlv_cntct_dpt",
				dlv_cntct_dpt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_BP_SUB_R.$dlv_cntct_psn,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_BP_SUB_R.$dlv_cntct_psn,
				"dlv_cntct_psn",
				dlv_cntct_psn,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_BP_SUB_R.$dlv_cntct_psn_title,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_BP_SUB_R.$dlv_cntct_psn_title,
				"dlv_cntct_psn_title",
				dlv_cntct_psn_title,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_BP_SUB_R.$memo1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_BP_SUB_R.$memo1,
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
			MAM_BP_SUB_R.$memo2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_BP_SUB_R.$memo2,
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
			MAM_BP_SUB_R.$memo3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_BP_SUB_R.$memo3,
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
			MAM_BP_SUB_R.$del_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MAM_BP_SUB_R.$del_flg,
				"del_flg",
				del_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_BP_SUB_R.$del_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_BP_SUB_R.$del_usr_id,
				"del_usr_id",
				del_usr_id,
				false,
				true,
				true,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_BP_SUB_R.$del_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_BP_SUB_R.$del_usr_nm,
				"del_usr_nm",
				del_usr_nm,
				false,
				true,
				true,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_BP_SUB_R.$del_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MAM_BP_SUB_R.$del_ts,
				"del_ts",
				del_ts,
				false,
				true,
				true,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_BP_SUB_R.$ins_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_BP_SUB_R.$ins_usr_id,
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
			MAM_BP_SUB_R.$ins_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_BP_SUB_R.$ins_usr_nm,
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
			MAM_BP_SUB_R.$ins_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MAM_BP_SUB_R.$ins_ts,
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
			MAM_BP_SUB_R.$ins_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_BP_SUB_R.$ins_func_id,
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
			MAM_BP_SUB_R.$upd_cntr,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MAM_BP_SUB_R.$upd_cntr,
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
			MAM_BP_SUB_R.$upd_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_BP_SUB_R.$upd_usr_id,
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
			MAM_BP_SUB_R.$upd_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_BP_SUB_R.$upd_usr_nm,
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
			MAM_BP_SUB_R.$upd_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MAM_BP_SUB_R.$upd_ts,
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
			MAM_BP_SUB_R.$upd_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_BP_SUB_R.$upd_func_id,
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
			MAM_BP_SUB_R.$upd_srv_req_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_BP_SUB_R.$upd_srv_req_no,
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
			MAM_BP_SUB_R.$memo4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_BP_SUB_R.$memo4,
				"memo4",
				memo4,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_BP_SUB_R.$memo5,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_BP_SUB_R.$memo5,
				"memo5",
				memo5,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_BP_SUB_R.$memo6,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_BP_SUB_R.$memo6,
				"memo6",
				memo6,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_BP_SUB_R.$memo7,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_BP_SUB_R.$memo7,
				"memo7",
				memo7,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_BP_SUB_R.$memo8,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_BP_SUB_R.$memo8,
				"memo8",
				memo8,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_BP_SUB_R.$memo9,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_BP_SUB_R.$memo9,
				"memo9",
				memo9,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_BP_SUB_R.$memo10,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_BP_SUB_R.$memo10,
				"memo10",
				memo10,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_BP_SUB_R.$memo11,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_BP_SUB_R.$memo11,
				"memo11",
				memo11,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_BP_SUB_R.$memo12,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_BP_SUB_R.$memo12,
				"memo12",
				memo12,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_BP_SUB_R.$memo13,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_BP_SUB_R.$memo13,
				"memo13",
				memo13,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_BP_SUB_R.$memo14,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_BP_SUB_R.$memo14,
				"memo14",
				memo14,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_BP_SUB_R.$memo15,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_BP_SUB_R.$memo15,
				"memo15",
				memo15,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_BP_SUB_R.$memo16,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_BP_SUB_R.$memo16,
				"memo16",
				memo16,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_BP_SUB_R.$memo17,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_BP_SUB_R.$memo17,
				"memo17",
				memo17,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_BP_SUB_R.$memo18,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_BP_SUB_R.$memo18,
				"memo18",
				memo18,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_BP_SUB_R.$memo19,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_BP_SUB_R.$memo19,
				"memo19",
				memo19,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_BP_SUB_R.$memo20,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_BP_SUB_R.$memo20,
				"memo20",
				memo20,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MAM_BP_SUB_R.$bp_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_BP_SUB_R.$bp_nm,
				"bp_nm",
				null,
				false,
				true,
				false,
				false,
				true,
				"BP1.BP_NM"
			)
		);
		COLUMN_MAP.put(
			MAM_BP_SUB_R.$sls_tax_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_BP_SUB_R.$sls_tax_nm,
				"sls_tax_nm",
				null,
				false,
				true,
				false,
				false,
				true,
				"TAX1.TAX_NM"
			)
		);
		COLUMN_MAP.put(
			MAM_BP_SUB_R.$purc_tax_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_BP_SUB_R.$purc_tax_nm,
				"purc_tax_nm",
				null,
				false,
				true,
				false,
				false,
				true,
				"TAX2.TAX_NM"
			)
		);
		COLUMN_MAP.put(
			MAM_BP_SUB_R.$prov_tax_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MAM_BP_SUB_R.$prov_tax_nm,
				"prov_tax_nm",
				null,
				false,
				true,
				false,
				false,
				true,
				"TAX3.TAX_NM"
			)
		);
		return COLUMN_MAP;
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MAM_BP_SUB_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MAM_BP_SUB_R create(String alias) {
		MAM_BP_SUB_R row = new MAM_BP_SUB_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MAM_BP_SUB_R createByName(T proto) {
		MAM_BP_SUB_R row = MAM_BP_SUB_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAM_BP_SUB_R clone() {
		return (MAM_BP_SUB_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAM_BP_SUB_R createInstance() {
		return (MAM_BP_SUB_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MAM_BP_SUB_R getValues(String... names) {
		return (MAM_BP_SUB_R) super.getValues(names);
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
	 public MAW_BP_SUB_KEY_R getPkWorkDbc(String alias) {
	 	return MAW_BP_SUB_KEY_R.create(alias);
	 }

	/*
	 * MCDBContainerのオーバーライドメソッドです。
	 */
	 public MAW_BP_SUB_KEY_R getPkWorkDbc() {
	 	return getPkWorkDbc(MAW_BP_SUB_KEY_R.TABLE_NAME);
	 }

	/**
	 * 取引先ＣＤ. BP cd..<p>
	 *
	 */
	public String bp_cd() {
		return getConstString(offset + 0, $bp_cd);
	}

	/**
	 * 取引先ＣＤ. BP cd..<p>
	 *
	 */
	public void bp_cd(String value) {
		setConstString(offset + 0, $bp_cd, value);
	}

	/**
	 * 適用開始日. Application start date.<p>
	 *
	 */
	public MCDate st_dt() {
		return getConstDate(offset + 1, $st_dt);
	}

	/**
	 * 適用開始日. Application start date.<p>
	 *
	 */
	public void st_dt(MCDate value) {
		setConstDate(offset + 1, $st_dt, value);
	}

	/**
	 * 適用終了日. Application end date.<p>
	 *
	 */
	public MCDate end_dt() {
		return getConstDate(offset + 2, $end_dt);
	}

	/**
	 * 適用終了日. Application end date.<p>
	 *
	 */
	public void end_dt(MCDate value) {
		setConstDate(offset + 2, $end_dt, value);
	}

	/**
	 * 郵便番号. Zip code.<p>
	 *
	 */
	public String zip_cd() {
		return getConstString(offset + 3, $zip_cd);
	}

	/**
	 * 郵便番号. Zip code.<p>
	 *
	 */
	public void zip_cd(String value) {
		setConstString(offset + 3, $zip_cd, value);
	}

	/**
	 * 住所１. Address 1.<p>
	 *
	 */
	public String addr1() {
		return getConstString(offset + 4, $addr1);
	}

	/**
	 * 住所１. Address 1.<p>
	 *
	 */
	public void addr1(String value) {
		setConstString(offset + 4, $addr1, value);
	}

	/**
	 * 住所２. Address 2.<p>
	 *
	 */
	public String addr2() {
		return getConstString(offset + 5, $addr2);
	}

	/**
	 * 住所２. Address 2.<p>
	 *
	 */
	public void addr2(String value) {
		setConstString(offset + 5, $addr2, value);
	}

	/**
	 * 住所３. Address 3.<p>
	 *
	 */
	public String addr3() {
		return getConstString(offset + 6, $addr3);
	}

	/**
	 * 住所３. Address 3.<p>
	 *
	 */
	public void addr3(String value) {
		setConstString(offset + 6, $addr3, value);
	}

	/**
	 * 住所４. Address 4.<p>
	 *
	 */
	public String addr4() {
		return getConstString(offset + 7, $addr4);
	}

	/**
	 * 住所４. Address 4.<p>
	 *
	 */
	public void addr4(String value) {
		setConstString(offset + 7, $addr4, value);
	}

	/**
	 * ＴＥＬ. TEL.<p>
	 *
	 */
	public String tel() {
		return getConstString(offset + 8, $tel);
	}

	/**
	 * ＴＥＬ. TEL.<p>
	 *
	 */
	public void tel(String value) {
		setConstString(offset + 8, $tel, value);
	}

	/**
	 * ＦＡＸ. FAX.<p>
	 *
	 */
	public String fax() {
		return getConstString(offset + 9, $fax);
	}

	/**
	 * ＦＡＸ. FAX.<p>
	 *
	 */
	public void fax(String value) {
		setConstString(offset + 9, $fax, value);
	}

	/**
	 * 債権部門ＣＤ. AR dept. cd..<p>
	 *
	 */
	public String ar_dpt_cd() {
		return getConstString(offset + 10, $ar_dpt_cd);
	}

	/**
	 * 債権部門ＣＤ. AR dept. cd..<p>
	 *
	 */
	public void ar_dpt_cd(String value) {
		setConstString(offset + 10, $ar_dpt_cd, value);
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
	 * 得意先担当者敬称. Form of address for Customer PIC.<p>
	 *
	 */
	public String cst_cntct_psn_title() {
		return getConstString(offset + 13, $cst_cntct_psn_title);
	}

	/**
	 * 得意先担当者敬称. Form of address for Customer PIC.<p>
	 *
	 */
	public void cst_cntct_psn_title(String value) {
		setConstString(offset + 13, $cst_cntct_psn_title, value);
	}

	/**
	 * 売上税ＣＤ. Sales tax cd..<p>
	 *
	 */
	public String sls_tax_cd() {
		return getConstString(offset + 14, $sls_tax_cd);
	}

	/**
	 * 売上税ＣＤ. Sales tax cd..<p>
	 *
	 */
	public void sls_tax_cd(String value) {
		setConstString(offset + 14, $sls_tax_cd, value);
	}

	/**
	 * 販売分析ＣＤ１. Sales analysis cd. 1.<p>
	 *
	 */
	public String sls_anly_cd1() {
		return getConstString(offset + 15, $sls_anly_cd1);
	}

	/**
	 * 販売分析ＣＤ１. Sales analysis cd. 1.<p>
	 *
	 */
	public void sls_anly_cd1(String value) {
		setConstString(offset + 15, $sls_anly_cd1, value);
	}

	/**
	 * 販売分析ＣＤ２. Sales analysis cd. 2.<p>
	 *
	 */
	public String sls_anly_cd2() {
		return getConstString(offset + 16, $sls_anly_cd2);
	}

	/**
	 * 販売分析ＣＤ２. Sales analysis cd. 2.<p>
	 *
	 */
	public void sls_anly_cd2(String value) {
		setConstString(offset + 16, $sls_anly_cd2, value);
	}

	/**
	 * 販売分析ＣＤ３. Sales analysis cd. 3.<p>
	 *
	 */
	public String sls_anly_cd3() {
		return getConstString(offset + 17, $sls_anly_cd3);
	}

	/**
	 * 販売分析ＣＤ３. Sales analysis cd. 3.<p>
	 *
	 */
	public void sls_anly_cd3(String value) {
		setConstString(offset + 17, $sls_anly_cd3, value);
	}

	/**
	 * 請求先担当部門ＣＤ. Billing customer dept. in charge cd..<p>
	 *
	 */
	public String bcst_dpt_cd() {
		return getConstString(offset + 18, $bcst_dpt_cd);
	}

	/**
	 * 請求先担当部門ＣＤ. Billing customer dept. in charge cd..<p>
	 *
	 */
	public void bcst_dpt_cd(String value) {
		setConstString(offset + 18, $bcst_dpt_cd, value);
	}

	/**
	 * 請求書送付郵便番号. Invoice send-to zip code.<p>
	 *
	 */
	public String bill_zip_cd() {
		return getConstString(offset + 19, $bill_zip_cd);
	}

	/**
	 * 請求書送付郵便番号. Invoice send-to zip code.<p>
	 *
	 */
	public void bill_zip_cd(String value) {
		setConstString(offset + 19, $bill_zip_cd, value);
	}

	/**
	 * 請求書送付住所１. Invoice send-to address 1.<p>
	 *
	 */
	public String bill_addr1() {
		return getConstString(offset + 20, $bill_addr1);
	}

	/**
	 * 請求書送付住所１. Invoice send-to address 1.<p>
	 *
	 */
	public void bill_addr1(String value) {
		setConstString(offset + 20, $bill_addr1, value);
	}

	/**
	 * 請求書送付住所２. Invoice send-to address 2.<p>
	 *
	 */
	public String bill_addr2() {
		return getConstString(offset + 21, $bill_addr2);
	}

	/**
	 * 請求書送付住所２. Invoice send-to address 2.<p>
	 *
	 */
	public void bill_addr2(String value) {
		setConstString(offset + 21, $bill_addr2, value);
	}

	/**
	 * 請求書送付住所３. Invoice send-to address 3.<p>
	 *
	 */
	public String bill_addr3() {
		return getConstString(offset + 22, $bill_addr3);
	}

	/**
	 * 請求書送付住所３. Invoice send-to address 3.<p>
	 *
	 */
	public void bill_addr3(String value) {
		setConstString(offset + 22, $bill_addr3, value);
	}

	/**
	 * 請求書送付住所４. Invoice send-to address 4.<p>
	 *
	 */
	public String bill_addr4() {
		return getConstString(offset + 23, $bill_addr4);
	}

	/**
	 * 請求書送付住所４. Invoice send-to address 4.<p>
	 *
	 */
	public void bill_addr4(String value) {
		setConstString(offset + 23, $bill_addr4, value);
	}

	/**
	 * 請求書送付ＴＥＬ. Invoice send-to TEL.<p>
	 *
	 */
	public String bill_tel() {
		return getConstString(offset + 24, $bill_tel);
	}

	/**
	 * 請求書送付ＴＥＬ. Invoice send-to TEL.<p>
	 *
	 */
	public void bill_tel(String value) {
		setConstString(offset + 24, $bill_tel, value);
	}

	/**
	 * 請求書宛先. Invoice destination.<p>
	 *
	 */
	public String bill_bcst_nm() {
		return getConstString(offset + 25, $bill_bcst_nm);
	}

	/**
	 * 請求書宛先. Invoice destination.<p>
	 *
	 */
	public void bill_bcst_nm(String value) {
		setConstString(offset + 25, $bill_bcst_nm, value);
	}

	/**
	 * 請求書送付部署. Invoice send-to dept..<p>
	 *
	 */
	public String bill_bcst_dpt() {
		return getConstString(offset + 26, $bill_bcst_dpt);
	}

	/**
	 * 請求書送付部署. Invoice send-to dept..<p>
	 *
	 */
	public void bill_bcst_dpt(String value) {
		setConstString(offset + 26, $bill_bcst_dpt, value);
	}

	/**
	 * 請求書送付担当者. Invoice send-to PIC.<p>
	 *
	 */
	public String bill_bcst_psn() {
		return getConstString(offset + 27, $bill_bcst_psn);
	}

	/**
	 * 請求書送付担当者. Invoice send-to PIC.<p>
	 *
	 */
	public void bill_bcst_psn(String value) {
		setConstString(offset + 27, $bill_bcst_psn, value);
	}

	/**
	 * 請求書送付担当者敬称. Invoice send-to PIC honorific.<p>
	 *
	 */
	public String bill_bcst_psn_title() {
		return getConstString(offset + 28, $bill_bcst_psn_title);
	}

	/**
	 * 請求書送付担当者敬称. Invoice send-to PIC honorific.<p>
	 *
	 */
	public void bill_bcst_psn_title(String value) {
		setConstString(offset + 28, $bill_bcst_psn_title, value);
	}

	/**
	 * ＶＭＩ購買部門ＣＤ. VMI purchasing dept. cd..<p>
	 *
	 */
	public String vmi_purc_dpt_cd() {
		return getConstString(offset + 29, $vmi_purc_dpt_cd);
	}

	/**
	 * ＶＭＩ購買部門ＣＤ. VMI purchasing dept. cd..<p>
	 *
	 */
	public void vmi_purc_dpt_cd(String value) {
		setConstString(offset + 29, $vmi_purc_dpt_cd, value);
	}

	/**
	 * 発注先部署. Supplier dept..<p>
	 *
	 */
	public String sppl_cntct_dpt() {
		return getConstString(offset + 30, $sppl_cntct_dpt);
	}

	/**
	 * 発注先部署. Supplier dept..<p>
	 *
	 */
	public void sppl_cntct_dpt(String value) {
		setConstString(offset + 30, $sppl_cntct_dpt, value);
	}

	/**
	 * 発注先担当者. Supplier PIC.<p>
	 *
	 */
	public String sppl_cntct_psn() {
		return getConstString(offset + 31, $sppl_cntct_psn);
	}

	/**
	 * 発注先担当者. Supplier PIC.<p>
	 *
	 */
	public void sppl_cntct_psn(String value) {
		setConstString(offset + 31, $sppl_cntct_psn, value);
	}

	/**
	 * 発注先担当者敬称. Supplier PIC form of address.<p>
	 *
	 */
	public String sppl_cntct_psn_title() {
		return getConstString(offset + 32, $sppl_cntct_psn_title);
	}

	/**
	 * 発注先担当者敬称. Supplier PIC form of address.<p>
	 *
	 */
	public void sppl_cntct_psn_title(String value) {
		setConstString(offset + 32, $sppl_cntct_psn_title, value);
	}

	/**
	 * 仕入税ＣＤ. Purchase tax cd..<p>
	 *
	 */
	public String purc_tax_cd() {
		return getConstString(offset + 33, $purc_tax_cd);
	}

	/**
	 * 仕入税ＣＤ. Purchase tax cd..<p>
	 *
	 */
	public void purc_tax_cd(String value) {
		setConstString(offset + 33, $purc_tax_cd, value);
	}

	/**
	 * 支給税ＣＤ. Supply tax cd..<p>
	 *
	 */
	public String prov_tax_cd() {
		return getConstString(offset + 34, $prov_tax_cd);
	}

	/**
	 * 支給税ＣＤ. Supply tax cd..<p>
	 *
	 */
	public void prov_tax_cd(String value) {
		setConstString(offset + 34, $prov_tax_cd, value);
	}

	/**
	 * 債務部門ＣＤ. AP dept. cd..<p>
	 *
	 */
	public String ap_dpt_cd() {
		return getConstString(offset + 35, $ap_dpt_cd);
	}

	/**
	 * 債務部門ＣＤ. AP dept. cd..<p>
	 *
	 */
	public void ap_dpt_cd(String value) {
		setConstString(offset + 35, $ap_dpt_cd, value);
	}

	/**
	 * 支払予定管理先担当部門ＣＤ. Cd. of dept. in charge of scheduled payee.<p>
	 *
	 */
	public String bsppl_dpt_cd() {
		return getConstString(offset + 36, $bsppl_dpt_cd);
	}

	/**
	 * 支払予定管理先担当部門ＣＤ. Cd. of dept. in charge of scheduled payee.<p>
	 *
	 */
	public void bsppl_dpt_cd(String value) {
		setConstString(offset + 36, $bsppl_dpt_cd, value);
	}

	/**
	 * 支払部門ＣＤ. Payment dept. cd..<p>
	 *
	 */
	public String pay_dpt_cd() {
		return getConstString(offset + 37, $pay_dpt_cd);
	}

	/**
	 * 支払部門ＣＤ. Payment dept. cd..<p>
	 *
	 */
	public void pay_dpt_cd(String value) {
		setConstString(offset + 37, $pay_dpt_cd, value);
	}

	/**
	 * 納品先部署. Delivery destination dept..<p>
	 *
	 */
	public String dlv_cntct_dpt() {
		return getConstString(offset + 38, $dlv_cntct_dpt);
	}

	/**
	 * 納品先部署. Delivery destination dept..<p>
	 *
	 */
	public void dlv_cntct_dpt(String value) {
		setConstString(offset + 38, $dlv_cntct_dpt, value);
	}

	/**
	 * 納品先担当者. Delivery destination PIC.<p>
	 *
	 */
	public String dlv_cntct_psn() {
		return getConstString(offset + 39, $dlv_cntct_psn);
	}

	/**
	 * 納品先担当者. Delivery destination PIC.<p>
	 *
	 */
	public void dlv_cntct_psn(String value) {
		setConstString(offset + 39, $dlv_cntct_psn, value);
	}

	/**
	 * 納品先担当者敬称. Delivery destination PIC honorific.<p>
	 *
	 */
	public String dlv_cntct_psn_title() {
		return getConstString(offset + 40, $dlv_cntct_psn_title);
	}

	/**
	 * 納品先担当者敬称. Delivery destination PIC honorific.<p>
	 *
	 */
	public void dlv_cntct_psn_title(String value) {
		setConstString(offset + 40, $dlv_cntct_psn_title, value);
	}

	/**
	 * メモ１. Memo 1.<p>
	 *
	 */
	public String memo1() {
		return getConstString(offset + 41, $memo1);
	}

	/**
	 * メモ１. Memo 1.<p>
	 *
	 */
	public void memo1(String value) {
		setConstString(offset + 41, $memo1, value);
	}

	/**
	 * メモ２. Memo 2.<p>
	 *
	 */
	public String memo2() {
		return getConstString(offset + 42, $memo2);
	}

	/**
	 * メモ２. Memo 2.<p>
	 *
	 */
	public void memo2(String value) {
		setConstString(offset + 42, $memo2, value);
	}

	/**
	 * メモ３. Memo 3.<p>
	 *
	 */
	public String memo3() {
		return getConstString(offset + 43, $memo3);
	}

	/**
	 * メモ３. Memo 3.<p>
	 *
	 */
	public void memo3(String value) {
		setConstString(offset + 43, $memo3, value);
	}

	/**
	 * 論理削除ＦＬＧ. Logical delete flg..<p>
	 *
	 */
	public boolean del_flg() {
		return getConstBoolean(offset + 44, $del_flg);
	}

	/**
	 * 論理削除ＦＬＧ. Logical delete flg..<p>
	 *
	 */
	public void del_flg(boolean value) {
		setConstBoolean(offset + 44, $del_flg, value);
	}

	/**
	 * 論理削除ユーザＩＤ. Logical delete user ID.<p>
	 *
	 */
	public String del_usr_id() {
		return getConstString(offset + 45, $del_usr_id);
	}

	/**
	 * 論理削除ユーザＩＤ. Logical delete user ID.<p>
	 *
	 */
	public void del_usr_id(String value) {
		setConstString(offset + 45, $del_usr_id, value);
	}

	/**
	 * 論理削除ユーザ名. Logical delete user name.<p>
	 *
	 */
	public String del_usr_nm() {
		return getConstString(offset + 46, $del_usr_nm);
	}

	/**
	 * 論理削除ユーザ名. Logical delete user name.<p>
	 *
	 */
	public void del_usr_nm(String value) {
		setConstString(offset + 46, $del_usr_nm, value);
	}

	/**
	 * 論理削除日時. Logical delete date and time.<p>
	 *
	 */
	public MCTimestamp del_ts() {
		return getConstTimestamp(offset + 47, $del_ts);
	}

	/**
	 * 論理削除日時. Logical delete date and time.<p>
	 *
	 */
	public void del_ts(MCTimestamp value) {
		setConstTimestamp(offset + 47, $del_ts, value);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 48, $ins_usr_id);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 48, $ins_usr_id, value);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 49, $ins_usr_nm);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 49, $ins_usr_nm, value);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 50, $ins_ts);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 50, $ins_ts, value);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 51, $ins_func_id);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 51, $ins_func_id, value);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 52, $upd_cntr);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 52, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 52, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 52, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 52, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 52, $upd_cntr, value);
	}
	
	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 53, $upd_usr_id);
	}

	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 53, $upd_usr_id, value);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 54, $upd_usr_nm);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 54, $upd_usr_nm, value);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 55, $upd_ts);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 55, $upd_ts, value);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 56, $upd_func_id);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 56, $upd_func_id, value);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 57, $upd_srv_req_no);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 57, $upd_srv_req_no, value);
	}

	/**
	 * メモ４. Memo 4.<p>
	 *
	 */
	public String memo4() {
		return getConstString(offset + 58, $memo4);
	}

	/**
	 * メモ４. Memo 4.<p>
	 *
	 */
	public void memo4(String value) {
		setConstString(offset + 58, $memo4, value);
	}

	/**
	 * メモ５. Memo 5.<p>
	 *
	 */
	public String memo5() {
		return getConstString(offset + 59, $memo5);
	}

	/**
	 * メモ５. Memo 5.<p>
	 *
	 */
	public void memo5(String value) {
		setConstString(offset + 59, $memo5, value);
	}

	/**
	 * メモ６. Memo 6.<p>
	 *
	 */
	public String memo6() {
		return getConstString(offset + 60, $memo6);
	}

	/**
	 * メモ６. Memo 6.<p>
	 *
	 */
	public void memo6(String value) {
		setConstString(offset + 60, $memo6, value);
	}

	/**
	 * メモ７. Memo 7.<p>
	 *
	 */
	public String memo7() {
		return getConstString(offset + 61, $memo7);
	}

	/**
	 * メモ７. Memo 7.<p>
	 *
	 */
	public void memo7(String value) {
		setConstString(offset + 61, $memo7, value);
	}

	/**
	 * メモ８. Memo 8.<p>
	 *
	 */
	public String memo8() {
		return getConstString(offset + 62, $memo8);
	}

	/**
	 * メモ８. Memo 8.<p>
	 *
	 */
	public void memo8(String value) {
		setConstString(offset + 62, $memo8, value);
	}

	/**
	 * メモ９. Memo 9.<p>
	 *
	 */
	public String memo9() {
		return getConstString(offset + 63, $memo9);
	}

	/**
	 * メモ９. Memo 9.<p>
	 *
	 */
	public void memo9(String value) {
		setConstString(offset + 63, $memo9, value);
	}

	/**
	 * メモ１０. Memo 10.<p>
	 *
	 */
	public String memo10() {
		return getConstString(offset + 64, $memo10);
	}

	/**
	 * メモ１０. Memo 10.<p>
	 *
	 */
	public void memo10(String value) {
		setConstString(offset + 64, $memo10, value);
	}

	/**
	 * メモ１１. Memo 11.<p>
	 *
	 */
	public String memo11() {
		return getConstString(offset + 65, $memo11);
	}

	/**
	 * メモ１１. Memo 11.<p>
	 *
	 */
	public void memo11(String value) {
		setConstString(offset + 65, $memo11, value);
	}

	/**
	 * メモ１２. Memo 12.<p>
	 *
	 */
	public String memo12() {
		return getConstString(offset + 66, $memo12);
	}

	/**
	 * メモ１２. Memo 12.<p>
	 *
	 */
	public void memo12(String value) {
		setConstString(offset + 66, $memo12, value);
	}

	/**
	 * メモ１３. Memo 13.<p>
	 *
	 */
	public String memo13() {
		return getConstString(offset + 67, $memo13);
	}

	/**
	 * メモ１３. Memo 13.<p>
	 *
	 */
	public void memo13(String value) {
		setConstString(offset + 67, $memo13, value);
	}

	/**
	 * メモ１４. Memo 14.<p>
	 *
	 */
	public String memo14() {
		return getConstString(offset + 68, $memo14);
	}

	/**
	 * メモ１４. Memo 14.<p>
	 *
	 */
	public void memo14(String value) {
		setConstString(offset + 68, $memo14, value);
	}

	/**
	 * メモ１５. Memo 15.<p>
	 *
	 */
	public String memo15() {
		return getConstString(offset + 69, $memo15);
	}

	/**
	 * メモ１５. Memo 15.<p>
	 *
	 */
	public void memo15(String value) {
		setConstString(offset + 69, $memo15, value);
	}

	/**
	 * メモ１６. Memo 16.<p>
	 *
	 */
	public String memo16() {
		return getConstString(offset + 70, $memo16);
	}

	/**
	 * メモ１６. Memo 16.<p>
	 *
	 */
	public void memo16(String value) {
		setConstString(offset + 70, $memo16, value);
	}

	/**
	 * メモ１７. Memo 17.<p>
	 *
	 */
	public String memo17() {
		return getConstString(offset + 71, $memo17);
	}

	/**
	 * メモ１７. Memo 17.<p>
	 *
	 */
	public void memo17(String value) {
		setConstString(offset + 71, $memo17, value);
	}

	/**
	 * メモ１８. Memo 18.<p>
	 *
	 */
	public String memo18() {
		return getConstString(offset + 72, $memo18);
	}

	/**
	 * メモ１８. Memo 18.<p>
	 *
	 */
	public void memo18(String value) {
		setConstString(offset + 72, $memo18, value);
	}

	/**
	 * メモ１９. Memo 19.<p>
	 *
	 */
	public String memo19() {
		return getConstString(offset + 73, $memo19);
	}

	/**
	 * メモ１９. Memo 19.<p>
	 *
	 */
	public void memo19(String value) {
		setConstString(offset + 73, $memo19, value);
	}

	/**
	 * メモ２０. Memo 20.<p>
	 *
	 */
	public String memo20() {
		return getConstString(offset + 74, $memo20);
	}

	/**
	 * メモ２０. Memo 20.<p>
	 *
	 */
	public void memo20(String value) {
		setConstString(offset + 74, $memo20, value);
	}

	/**
	 * 取引先名. BP name.<p>
	 *
	 */
	public String bp_nm() {
		return getConstString(offset + 75, $bp_nm);
	}

	/**
	 * 取引先名. BP name.<p>
	 *
	 */
	public void bp_nm(String value) {
		setConstString(offset + 75, $bp_nm, value);
	}

	/**
	 * 売上税名. Sales tax name.<p>
	 *
	 */
	public String sls_tax_nm() {
		return getConstString(offset + 76, $sls_tax_nm);
	}

	/**
	 * 売上税名. Sales tax name.<p>
	 *
	 */
	public void sls_tax_nm(String value) {
		setConstString(offset + 76, $sls_tax_nm, value);
	}

	/**
	 * 仕入税名. Purchase tax type name.<p>
	 *
	 */
	public String purc_tax_nm() {
		return getConstString(offset + 77, $purc_tax_nm);
	}

	/**
	 * 仕入税名. Purchase tax type name.<p>
	 *
	 */
	public void purc_tax_nm(String value) {
		setConstString(offset + 77, $purc_tax_nm, value);
	}

	/**
	 * 支給税名. Supply tax name.<p>
	 *
	 */
	public String prov_tax_nm() {
		return getConstString(offset + 78, $prov_tax_nm);
	}

	/**
	 * 支給税名. Supply tax name.<p>
	 *
	 */
	public void prov_tax_nm(String value) {
		setConstString(offset + 78, $prov_tax_nm, value);
	}

	public String getString(String name) {
		if ($bp_cd.equalsIgnoreCase(name)) {
			return bp_cd();
		}
		if ($zip_cd.equalsIgnoreCase(name)) {
			return zip_cd();
		}
		if ($addr1.equalsIgnoreCase(name)) {
			return addr1();
		}
		if ($addr2.equalsIgnoreCase(name)) {
			return addr2();
		}
		if ($addr3.equalsIgnoreCase(name)) {
			return addr3();
		}
		if ($addr4.equalsIgnoreCase(name)) {
			return addr4();
		}
		if ($tel.equalsIgnoreCase(name)) {
			return tel();
		}
		if ($fax.equalsIgnoreCase(name)) {
			return fax();
		}
		if ($ar_dpt_cd.equalsIgnoreCase(name)) {
			return ar_dpt_cd();
		}
		if ($cst_cntct_dpt.equalsIgnoreCase(name)) {
			return cst_cntct_dpt();
		}
		if ($cst_cntct_psn.equalsIgnoreCase(name)) {
			return cst_cntct_psn();
		}
		if ($cst_cntct_psn_title.equalsIgnoreCase(name)) {
			return cst_cntct_psn_title();
		}
		if ($sls_tax_cd.equalsIgnoreCase(name)) {
			return sls_tax_cd();
		}
		if ($sls_anly_cd1.equalsIgnoreCase(name)) {
			return sls_anly_cd1();
		}
		if ($sls_anly_cd2.equalsIgnoreCase(name)) {
			return sls_anly_cd2();
		}
		if ($sls_anly_cd3.equalsIgnoreCase(name)) {
			return sls_anly_cd3();
		}
		if ($bcst_dpt_cd.equalsIgnoreCase(name)) {
			return bcst_dpt_cd();
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
		if ($bill_tel.equalsIgnoreCase(name)) {
			return bill_tel();
		}
		if ($bill_bcst_nm.equalsIgnoreCase(name)) {
			return bill_bcst_nm();
		}
		if ($bill_bcst_dpt.equalsIgnoreCase(name)) {
			return bill_bcst_dpt();
		}
		if ($bill_bcst_psn.equalsIgnoreCase(name)) {
			return bill_bcst_psn();
		}
		if ($bill_bcst_psn_title.equalsIgnoreCase(name)) {
			return bill_bcst_psn_title();
		}
		if ($vmi_purc_dpt_cd.equalsIgnoreCase(name)) {
			return vmi_purc_dpt_cd();
		}
		if ($sppl_cntct_dpt.equalsIgnoreCase(name)) {
			return sppl_cntct_dpt();
		}
		if ($sppl_cntct_psn.equalsIgnoreCase(name)) {
			return sppl_cntct_psn();
		}
		if ($sppl_cntct_psn_title.equalsIgnoreCase(name)) {
			return sppl_cntct_psn_title();
		}
		if ($purc_tax_cd.equalsIgnoreCase(name)) {
			return purc_tax_cd();
		}
		if ($prov_tax_cd.equalsIgnoreCase(name)) {
			return prov_tax_cd();
		}
		if ($ap_dpt_cd.equalsIgnoreCase(name)) {
			return ap_dpt_cd();
		}
		if ($bsppl_dpt_cd.equalsIgnoreCase(name)) {
			return bsppl_dpt_cd();
		}
		if ($pay_dpt_cd.equalsIgnoreCase(name)) {
			return pay_dpt_cd();
		}
		if ($dlv_cntct_dpt.equalsIgnoreCase(name)) {
			return dlv_cntct_dpt();
		}
		if ($dlv_cntct_psn.equalsIgnoreCase(name)) {
			return dlv_cntct_psn();
		}
		if ($dlv_cntct_psn_title.equalsIgnoreCase(name)) {
			return dlv_cntct_psn_title();
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
		if ($del_usr_id.equalsIgnoreCase(name)) {
			return del_usr_id();
		}
		if ($del_usr_nm.equalsIgnoreCase(name)) {
			return del_usr_nm();
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
		if ($memo4.equalsIgnoreCase(name)) {
			return memo4();
		}
		if ($memo5.equalsIgnoreCase(name)) {
			return memo5();
		}
		if ($memo6.equalsIgnoreCase(name)) {
			return memo6();
		}
		if ($memo7.equalsIgnoreCase(name)) {
			return memo7();
		}
		if ($memo8.equalsIgnoreCase(name)) {
			return memo8();
		}
		if ($memo9.equalsIgnoreCase(name)) {
			return memo9();
		}
		if ($memo10.equalsIgnoreCase(name)) {
			return memo10();
		}
		if ($memo11.equalsIgnoreCase(name)) {
			return memo11();
		}
		if ($memo12.equalsIgnoreCase(name)) {
			return memo12();
		}
		if ($memo13.equalsIgnoreCase(name)) {
			return memo13();
		}
		if ($memo14.equalsIgnoreCase(name)) {
			return memo14();
		}
		if ($memo15.equalsIgnoreCase(name)) {
			return memo15();
		}
		if ($memo16.equalsIgnoreCase(name)) {
			return memo16();
		}
		if ($memo17.equalsIgnoreCase(name)) {
			return memo17();
		}
		if ($memo18.equalsIgnoreCase(name)) {
			return memo18();
		}
		if ($memo19.equalsIgnoreCase(name)) {
			return memo19();
		}
		if ($memo20.equalsIgnoreCase(name)) {
			return memo20();
		}
		if ($bp_nm.equalsIgnoreCase(name)) {
			return bp_nm();
		}
		if ($sls_tax_nm.equalsIgnoreCase(name)) {
			return sls_tax_nm();
		}
		if ($purc_tax_nm.equalsIgnoreCase(name)) {
			return purc_tax_nm();
		}
		if ($prov_tax_nm.equalsIgnoreCase(name)) {
			return prov_tax_nm();
		}
		return super.getString(name);
	}

	public MCNumber getNumber(String name) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumber(name);
	}

	public MCDate getDate(String name) {
		if ($st_dt.equalsIgnoreCase(name)) {
			return st_dt();
		}
		if ($end_dt.equalsIgnoreCase(name)) {
			return end_dt();
		}
		return super.getDate(name);
	}

	public MCTimestamp getTimestamp(String name) {
		if ($del_ts.equalsIgnoreCase(name)) {
			return del_ts();
		}
		if ($ins_ts.equalsIgnoreCase(name)) {
			return ins_ts();
		}
		if ($upd_ts.equalsIgnoreCase(name)) {
			return upd_ts();
		}
		return super.getTimestamp(name);
	}

	public boolean getBoolean(String name) {
		if ($del_flg.equalsIgnoreCase(name)) {
			return del_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($bp_cd.equalsIgnoreCase(name)) {
			return bp_cd();
		}
		if ($zip_cd.equalsIgnoreCase(name)) {
			return zip_cd();
		}
		if ($addr1.equalsIgnoreCase(name)) {
			return addr1();
		}
		if ($addr2.equalsIgnoreCase(name)) {
			return addr2();
		}
		if ($addr3.equalsIgnoreCase(name)) {
			return addr3();
		}
		if ($addr4.equalsIgnoreCase(name)) {
			return addr4();
		}
		if ($tel.equalsIgnoreCase(name)) {
			return tel();
		}
		if ($fax.equalsIgnoreCase(name)) {
			return fax();
		}
		if ($ar_dpt_cd.equalsIgnoreCase(name)) {
			return ar_dpt_cd();
		}
		if ($cst_cntct_dpt.equalsIgnoreCase(name)) {
			return cst_cntct_dpt();
		}
		if ($cst_cntct_psn.equalsIgnoreCase(name)) {
			return cst_cntct_psn();
		}
		if ($cst_cntct_psn_title.equalsIgnoreCase(name)) {
			return cst_cntct_psn_title();
		}
		if ($sls_tax_cd.equalsIgnoreCase(name)) {
			return sls_tax_cd();
		}
		if ($sls_anly_cd1.equalsIgnoreCase(name)) {
			return sls_anly_cd1();
		}
		if ($sls_anly_cd2.equalsIgnoreCase(name)) {
			return sls_anly_cd2();
		}
		if ($sls_anly_cd3.equalsIgnoreCase(name)) {
			return sls_anly_cd3();
		}
		if ($bcst_dpt_cd.equalsIgnoreCase(name)) {
			return bcst_dpt_cd();
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
		if ($bill_tel.equalsIgnoreCase(name)) {
			return bill_tel();
		}
		if ($bill_bcst_nm.equalsIgnoreCase(name)) {
			return bill_bcst_nm();
		}
		if ($bill_bcst_dpt.equalsIgnoreCase(name)) {
			return bill_bcst_dpt();
		}
		if ($bill_bcst_psn.equalsIgnoreCase(name)) {
			return bill_bcst_psn();
		}
		if ($bill_bcst_psn_title.equalsIgnoreCase(name)) {
			return bill_bcst_psn_title();
		}
		if ($vmi_purc_dpt_cd.equalsIgnoreCase(name)) {
			return vmi_purc_dpt_cd();
		}
		if ($sppl_cntct_dpt.equalsIgnoreCase(name)) {
			return sppl_cntct_dpt();
		}
		if ($sppl_cntct_psn.equalsIgnoreCase(name)) {
			return sppl_cntct_psn();
		}
		if ($sppl_cntct_psn_title.equalsIgnoreCase(name)) {
			return sppl_cntct_psn_title();
		}
		if ($purc_tax_cd.equalsIgnoreCase(name)) {
			return purc_tax_cd();
		}
		if ($prov_tax_cd.equalsIgnoreCase(name)) {
			return prov_tax_cd();
		}
		if ($ap_dpt_cd.equalsIgnoreCase(name)) {
			return ap_dpt_cd();
		}
		if ($bsppl_dpt_cd.equalsIgnoreCase(name)) {
			return bsppl_dpt_cd();
		}
		if ($pay_dpt_cd.equalsIgnoreCase(name)) {
			return pay_dpt_cd();
		}
		if ($dlv_cntct_dpt.equalsIgnoreCase(name)) {
			return dlv_cntct_dpt();
		}
		if ($dlv_cntct_psn.equalsIgnoreCase(name)) {
			return dlv_cntct_psn();
		}
		if ($dlv_cntct_psn_title.equalsIgnoreCase(name)) {
			return dlv_cntct_psn_title();
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
		if ($del_usr_id.equalsIgnoreCase(name)) {
			return del_usr_id();
		}
		if ($del_usr_nm.equalsIgnoreCase(name)) {
			return del_usr_nm();
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
		if ($memo4.equalsIgnoreCase(name)) {
			return memo4();
		}
		if ($memo5.equalsIgnoreCase(name)) {
			return memo5();
		}
		if ($memo6.equalsIgnoreCase(name)) {
			return memo6();
		}
		if ($memo7.equalsIgnoreCase(name)) {
			return memo7();
		}
		if ($memo8.equalsIgnoreCase(name)) {
			return memo8();
		}
		if ($memo9.equalsIgnoreCase(name)) {
			return memo9();
		}
		if ($memo10.equalsIgnoreCase(name)) {
			return memo10();
		}
		if ($memo11.equalsIgnoreCase(name)) {
			return memo11();
		}
		if ($memo12.equalsIgnoreCase(name)) {
			return memo12();
		}
		if ($memo13.equalsIgnoreCase(name)) {
			return memo13();
		}
		if ($memo14.equalsIgnoreCase(name)) {
			return memo14();
		}
		if ($memo15.equalsIgnoreCase(name)) {
			return memo15();
		}
		if ($memo16.equalsIgnoreCase(name)) {
			return memo16();
		}
		if ($memo17.equalsIgnoreCase(name)) {
			return memo17();
		}
		if ($memo18.equalsIgnoreCase(name)) {
			return memo18();
		}
		if ($memo19.equalsIgnoreCase(name)) {
			return memo19();
		}
		if ($memo20.equalsIgnoreCase(name)) {
			return memo20();
		}
		if ($bp_nm.equalsIgnoreCase(name)) {
			return bp_nm();
		}
		if ($sls_tax_nm.equalsIgnoreCase(name)) {
			return sls_tax_nm();
		}
		if ($purc_tax_nm.equalsIgnoreCase(name)) {
			return purc_tax_nm();
		}
		if ($prov_tax_nm.equalsIgnoreCase(name)) {
			return prov_tax_nm();
		}
		return super.getStringNE(name);
	}

	public MCNumber getNumberNE(String name) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumberNE(name);
	}

	public MCDate getDateNE(String name) {
		if ($st_dt.equalsIgnoreCase(name)) {
			return st_dt();
		}
		if ($end_dt.equalsIgnoreCase(name)) {
			return end_dt();
		}
		return super.getDateNE(name);
	}

	public MCTimestamp getTimestampNE(String name) {
		if ($del_ts.equalsIgnoreCase(name)) {
			return del_ts();
		}
		if ($ins_ts.equalsIgnoreCase(name)) {
			return ins_ts();
		}
		if ($upd_ts.equalsIgnoreCase(name)) {
			return upd_ts();
		}
		return super.getTimestampNE(name);
	}

	public boolean getBooleanNE(String name) {
		if ($del_flg.equalsIgnoreCase(name)) {
			return del_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($bp_cd.equalsIgnoreCase(name)) {
			bp_cd(value);
			return;
		}
		if ($zip_cd.equalsIgnoreCase(name)) {
			zip_cd(value);
			return;
		}
		if ($addr1.equalsIgnoreCase(name)) {
			addr1(value);
			return;
		}
		if ($addr2.equalsIgnoreCase(name)) {
			addr2(value);
			return;
		}
		if ($addr3.equalsIgnoreCase(name)) {
			addr3(value);
			return;
		}
		if ($addr4.equalsIgnoreCase(name)) {
			addr4(value);
			return;
		}
		if ($tel.equalsIgnoreCase(name)) {
			tel(value);
			return;
		}
		if ($fax.equalsIgnoreCase(name)) {
			fax(value);
			return;
		}
		if ($ar_dpt_cd.equalsIgnoreCase(name)) {
			ar_dpt_cd(value);
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
		if ($cst_cntct_psn_title.equalsIgnoreCase(name)) {
			cst_cntct_psn_title(value);
			return;
		}
		if ($sls_tax_cd.equalsIgnoreCase(name)) {
			sls_tax_cd(value);
			return;
		}
		if ($sls_anly_cd1.equalsIgnoreCase(name)) {
			sls_anly_cd1(value);
			return;
		}
		if ($sls_anly_cd2.equalsIgnoreCase(name)) {
			sls_anly_cd2(value);
			return;
		}
		if ($sls_anly_cd3.equalsIgnoreCase(name)) {
			sls_anly_cd3(value);
			return;
		}
		if ($bcst_dpt_cd.equalsIgnoreCase(name)) {
			bcst_dpt_cd(value);
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
		if ($bill_tel.equalsIgnoreCase(name)) {
			bill_tel(value);
			return;
		}
		if ($bill_bcst_nm.equalsIgnoreCase(name)) {
			bill_bcst_nm(value);
			return;
		}
		if ($bill_bcst_dpt.equalsIgnoreCase(name)) {
			bill_bcst_dpt(value);
			return;
		}
		if ($bill_bcst_psn.equalsIgnoreCase(name)) {
			bill_bcst_psn(value);
			return;
		}
		if ($bill_bcst_psn_title.equalsIgnoreCase(name)) {
			bill_bcst_psn_title(value);
			return;
		}
		if ($vmi_purc_dpt_cd.equalsIgnoreCase(name)) {
			vmi_purc_dpt_cd(value);
			return;
		}
		if ($sppl_cntct_dpt.equalsIgnoreCase(name)) {
			sppl_cntct_dpt(value);
			return;
		}
		if ($sppl_cntct_psn.equalsIgnoreCase(name)) {
			sppl_cntct_psn(value);
			return;
		}
		if ($sppl_cntct_psn_title.equalsIgnoreCase(name)) {
			sppl_cntct_psn_title(value);
			return;
		}
		if ($purc_tax_cd.equalsIgnoreCase(name)) {
			purc_tax_cd(value);
			return;
		}
		if ($prov_tax_cd.equalsIgnoreCase(name)) {
			prov_tax_cd(value);
			return;
		}
		if ($ap_dpt_cd.equalsIgnoreCase(name)) {
			ap_dpt_cd(value);
			return;
		}
		if ($bsppl_dpt_cd.equalsIgnoreCase(name)) {
			bsppl_dpt_cd(value);
			return;
		}
		if ($pay_dpt_cd.equalsIgnoreCase(name)) {
			pay_dpt_cd(value);
			return;
		}
		if ($dlv_cntct_dpt.equalsIgnoreCase(name)) {
			dlv_cntct_dpt(value);
			return;
		}
		if ($dlv_cntct_psn.equalsIgnoreCase(name)) {
			dlv_cntct_psn(value);
			return;
		}
		if ($dlv_cntct_psn_title.equalsIgnoreCase(name)) {
			dlv_cntct_psn_title(value);
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
		if ($del_usr_id.equalsIgnoreCase(name)) {
			del_usr_id(value);
			return;
		}
		if ($del_usr_nm.equalsIgnoreCase(name)) {
			del_usr_nm(value);
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
		if ($memo4.equalsIgnoreCase(name)) {
			memo4(value);
			return;
		}
		if ($memo5.equalsIgnoreCase(name)) {
			memo5(value);
			return;
		}
		if ($memo6.equalsIgnoreCase(name)) {
			memo6(value);
			return;
		}
		if ($memo7.equalsIgnoreCase(name)) {
			memo7(value);
			return;
		}
		if ($memo8.equalsIgnoreCase(name)) {
			memo8(value);
			return;
		}
		if ($memo9.equalsIgnoreCase(name)) {
			memo9(value);
			return;
		}
		if ($memo10.equalsIgnoreCase(name)) {
			memo10(value);
			return;
		}
		if ($memo11.equalsIgnoreCase(name)) {
			memo11(value);
			return;
		}
		if ($memo12.equalsIgnoreCase(name)) {
			memo12(value);
			return;
		}
		if ($memo13.equalsIgnoreCase(name)) {
			memo13(value);
			return;
		}
		if ($memo14.equalsIgnoreCase(name)) {
			memo14(value);
			return;
		}
		if ($memo15.equalsIgnoreCase(name)) {
			memo15(value);
			return;
		}
		if ($memo16.equalsIgnoreCase(name)) {
			memo16(value);
			return;
		}
		if ($memo17.equalsIgnoreCase(name)) {
			memo17(value);
			return;
		}
		if ($memo18.equalsIgnoreCase(name)) {
			memo18(value);
			return;
		}
		if ($memo19.equalsIgnoreCase(name)) {
			memo19(value);
			return;
		}
		if ($memo20.equalsIgnoreCase(name)) {
			memo20(value);
			return;
		}
		if ($bp_nm.equalsIgnoreCase(name)) {
			bp_nm(value);
			return;
		}
		if ($sls_tax_nm.equalsIgnoreCase(name)) {
			sls_tax_nm(value);
			return;
		}
		if ($purc_tax_nm.equalsIgnoreCase(name)) {
			purc_tax_nm(value);
			return;
		}
		if ($prov_tax_nm.equalsIgnoreCase(name)) {
			prov_tax_nm(value);
			return;
		}
		super.setString(name, value);
	}

	public void setNumber(String name, MCNumber value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, int value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, long value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, float value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, double value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setDate(String name, MCDate value) {
		if ($st_dt.equalsIgnoreCase(name)) {
			st_dt(value);
			return;
		}
		if ($end_dt.equalsIgnoreCase(name)) {
			end_dt(value);
			return;
		}
		super.setDate(name, value);
	}

	public void setTimestamp(String name, MCTimestamp value) {
		if ($del_ts.equalsIgnoreCase(name)) {
			del_ts(value);
			return;
		}
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
		if ($del_flg.equalsIgnoreCase(name)) {
			del_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($bp_cd.equalsIgnoreCase(name)) {
			bp_cd(value);
			return;
		}
		if ($zip_cd.equalsIgnoreCase(name)) {
			zip_cd(value);
			return;
		}
		if ($addr1.equalsIgnoreCase(name)) {
			addr1(value);
			return;
		}
		if ($addr2.equalsIgnoreCase(name)) {
			addr2(value);
			return;
		}
		if ($addr3.equalsIgnoreCase(name)) {
			addr3(value);
			return;
		}
		if ($addr4.equalsIgnoreCase(name)) {
			addr4(value);
			return;
		}
		if ($tel.equalsIgnoreCase(name)) {
			tel(value);
			return;
		}
		if ($fax.equalsIgnoreCase(name)) {
			fax(value);
			return;
		}
		if ($ar_dpt_cd.equalsIgnoreCase(name)) {
			ar_dpt_cd(value);
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
		if ($cst_cntct_psn_title.equalsIgnoreCase(name)) {
			cst_cntct_psn_title(value);
			return;
		}
		if ($sls_tax_cd.equalsIgnoreCase(name)) {
			sls_tax_cd(value);
			return;
		}
		if ($sls_anly_cd1.equalsIgnoreCase(name)) {
			sls_anly_cd1(value);
			return;
		}
		if ($sls_anly_cd2.equalsIgnoreCase(name)) {
			sls_anly_cd2(value);
			return;
		}
		if ($sls_anly_cd3.equalsIgnoreCase(name)) {
			sls_anly_cd3(value);
			return;
		}
		if ($bcst_dpt_cd.equalsIgnoreCase(name)) {
			bcst_dpt_cd(value);
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
		if ($bill_tel.equalsIgnoreCase(name)) {
			bill_tel(value);
			return;
		}
		if ($bill_bcst_nm.equalsIgnoreCase(name)) {
			bill_bcst_nm(value);
			return;
		}
		if ($bill_bcst_dpt.equalsIgnoreCase(name)) {
			bill_bcst_dpt(value);
			return;
		}
		if ($bill_bcst_psn.equalsIgnoreCase(name)) {
			bill_bcst_psn(value);
			return;
		}
		if ($bill_bcst_psn_title.equalsIgnoreCase(name)) {
			bill_bcst_psn_title(value);
			return;
		}
		if ($vmi_purc_dpt_cd.equalsIgnoreCase(name)) {
			vmi_purc_dpt_cd(value);
			return;
		}
		if ($sppl_cntct_dpt.equalsIgnoreCase(name)) {
			sppl_cntct_dpt(value);
			return;
		}
		if ($sppl_cntct_psn.equalsIgnoreCase(name)) {
			sppl_cntct_psn(value);
			return;
		}
		if ($sppl_cntct_psn_title.equalsIgnoreCase(name)) {
			sppl_cntct_psn_title(value);
			return;
		}
		if ($purc_tax_cd.equalsIgnoreCase(name)) {
			purc_tax_cd(value);
			return;
		}
		if ($prov_tax_cd.equalsIgnoreCase(name)) {
			prov_tax_cd(value);
			return;
		}
		if ($ap_dpt_cd.equalsIgnoreCase(name)) {
			ap_dpt_cd(value);
			return;
		}
		if ($bsppl_dpt_cd.equalsIgnoreCase(name)) {
			bsppl_dpt_cd(value);
			return;
		}
		if ($pay_dpt_cd.equalsIgnoreCase(name)) {
			pay_dpt_cd(value);
			return;
		}
		if ($dlv_cntct_dpt.equalsIgnoreCase(name)) {
			dlv_cntct_dpt(value);
			return;
		}
		if ($dlv_cntct_psn.equalsIgnoreCase(name)) {
			dlv_cntct_psn(value);
			return;
		}
		if ($dlv_cntct_psn_title.equalsIgnoreCase(name)) {
			dlv_cntct_psn_title(value);
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
		if ($del_usr_id.equalsIgnoreCase(name)) {
			del_usr_id(value);
			return;
		}
		if ($del_usr_nm.equalsIgnoreCase(name)) {
			del_usr_nm(value);
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
		if ($memo4.equalsIgnoreCase(name)) {
			memo4(value);
			return;
		}
		if ($memo5.equalsIgnoreCase(name)) {
			memo5(value);
			return;
		}
		if ($memo6.equalsIgnoreCase(name)) {
			memo6(value);
			return;
		}
		if ($memo7.equalsIgnoreCase(name)) {
			memo7(value);
			return;
		}
		if ($memo8.equalsIgnoreCase(name)) {
			memo8(value);
			return;
		}
		if ($memo9.equalsIgnoreCase(name)) {
			memo9(value);
			return;
		}
		if ($memo10.equalsIgnoreCase(name)) {
			memo10(value);
			return;
		}
		if ($memo11.equalsIgnoreCase(name)) {
			memo11(value);
			return;
		}
		if ($memo12.equalsIgnoreCase(name)) {
			memo12(value);
			return;
		}
		if ($memo13.equalsIgnoreCase(name)) {
			memo13(value);
			return;
		}
		if ($memo14.equalsIgnoreCase(name)) {
			memo14(value);
			return;
		}
		if ($memo15.equalsIgnoreCase(name)) {
			memo15(value);
			return;
		}
		if ($memo16.equalsIgnoreCase(name)) {
			memo16(value);
			return;
		}
		if ($memo17.equalsIgnoreCase(name)) {
			memo17(value);
			return;
		}
		if ($memo18.equalsIgnoreCase(name)) {
			memo18(value);
			return;
		}
		if ($memo19.equalsIgnoreCase(name)) {
			memo19(value);
			return;
		}
		if ($memo20.equalsIgnoreCase(name)) {
			memo20(value);
			return;
		}
		if ($bp_nm.equalsIgnoreCase(name)) {
			bp_nm(value);
			return;
		}
		if ($sls_tax_nm.equalsIgnoreCase(name)) {
			sls_tax_nm(value);
			return;
		}
		if ($purc_tax_nm.equalsIgnoreCase(name)) {
			purc_tax_nm(value);
			return;
		}
		if ($prov_tax_nm.equalsIgnoreCase(name)) {
			prov_tax_nm(value);
			return;
		}
		super.setStringNE(name, value);
	}

	public void setNumberNE(String name, MCNumber value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, int value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, long value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, float value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, double value) {
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setDateNE(String name, MCDate value) {
		if ($st_dt.equalsIgnoreCase(name)) {
			st_dt(value);
			return;
		}
		if ($end_dt.equalsIgnoreCase(name)) {
			end_dt(value);
			return;
		}
		super.setDateNE(name, value);
	}

	public void setTimestampNE(String name, MCTimestamp value) {
		if ($del_ts.equalsIgnoreCase(name)) {
			del_ts(value);
			return;
		}
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
		if ($del_flg.equalsIgnoreCase(name)) {
			del_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

}
