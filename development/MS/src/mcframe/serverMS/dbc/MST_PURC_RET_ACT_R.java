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
 * "仕入返品実績ヘッダ // Purchase return result header"DBコンテナRowクラスです。<p>
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
 *  	<td>purc_ret_act_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>仕入返品実績ＮＯ</td>
 *  	<td>Purchase return result No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>purc_ret_act_rev</td>
 *  	<td>N</td>
 *  	<td>4,0</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>仕入返品実績改訂番号</td>
 *  	<td>Purchase return result rev. number</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>purc_ret_schd_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>仕入返品予定ＮＯ</td>
 *  	<td>Purchase return schedule No.</td>
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
 *  	<td>purc_usr_cd</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>購買担当者ＣＤ</td>
 *  	<td>Purchasing PIC cd.</td>
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
 *  	<td>sppl_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>発注先ＣＤ</td>
 *  	<td>Supplier cd.</td>
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
 *  	<td>sppl_zip_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>発注先郵便番号</td>
 *  	<td>Supplier zip code</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sppl_addr1</td>
 *  	<td>C</td>
 *  	<td>250</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>発注先住所１</td>
 *  	<td>Supplier address 1</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sppl_addr2</td>
 *  	<td>C</td>
 *  	<td>250</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>発注先住所２</td>
 *  	<td>Supplier address 2</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sppl_addr3</td>
 *  	<td>C</td>
 *  	<td>250</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>発注先住所３</td>
 *  	<td>Supplier address 3</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sppl_addr4</td>
 *  	<td>C</td>
 *  	<td>250</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>発注先住所４</td>
 *  	<td>Supplier address 4</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sppl_tel</td>
 *  	<td>C</td>
 *  	<td>30</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>発注先ＴＥＬ</td>
 *  	<td>Supplier TEL</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sppl_fax</td>
 *  	<td>C</td>
 *  	<td>30</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>発注先ＦＡＸ</td>
 *  	<td>Supplier FAX</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ret_sppl_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>返品先名</td>
 *  	<td>Return-to name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ret_sppl_cntct_dpt</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>返品先部署</td>
 *  	<td>Return-to dept.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ret_sppl_cntct_psn</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>返品先担当者</td>
 *  	<td>Return-to PIC</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ret_sppl_cntct_psn_title</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>返品先担当者敬称</td>
 *  	<td>Return-to PIC form of address</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ret_sppl_zip_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>返品先郵便番号</td>
 *  	<td>Return-to zip code</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ret_sppl_addr1</td>
 *  	<td>C</td>
 *  	<td>250</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>返品先住所１</td>
 *  	<td>Return-to address 1</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ret_sppl_addr2</td>
 *  	<td>C</td>
 *  	<td>250</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>返品先住所２</td>
 *  	<td>Return-to address 2</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ret_sppl_addr3</td>
 *  	<td>C</td>
 *  	<td>250</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>返品先住所３</td>
 *  	<td>Return-to address 3</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ret_sppl_addr4</td>
 *  	<td>C</td>
 *  	<td>250</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>返品先住所４</td>
 *  	<td>Return-to address 4</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ret_sppl_tel</td>
 *  	<td>C</td>
 *  	<td>30</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>返品先ＴＥＬ</td>
 *  	<td>Return-to TEL</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ret_sppl_fax</td>
 *  	<td>C</td>
 *  	<td>30</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>返品先ＦＡＸ</td>
 *  	<td>Return-to FAX</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>purc_ret_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>仕入返品日</td>
 *  	<td>Purchase return date</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>purc_ret_print_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>返品票発行日時</td>
 *  	<td>Return slip issue date and time</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>purc_ret_print_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>返品票発行済ＦＬＧ</td>
 *  	<td>Return slip issued flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>last_purc_ret_print_rev</td>
 *  	<td>N</td>
 *  	<td>4,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>最新返品票改訂番号</td>
 *  	<td>Latest return slip rev. number</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>can_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>取消ＦＬＧ</td>
 *  	<td>Cancel flg.</td>
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
 *  	<td>purc_ret_print_rmrks</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>仕入返品票備考</td>
 *  	<td>Purchase return slip remarks</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sub_char1</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備項目１</td>
 *  	<td>Spare column 1</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sub_char2</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備項目２</td>
 *  	<td>Spare column 2</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sub_char3</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備項目３</td>
 *  	<td>Spare column 3</td>
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
public class MST_PURC_RET_ACT_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.CO_VIEW;

	public static final String TABLE_NAME = "MST_PURC_RET_ACT";

	public static final boolean EX_CTRL = true;
	
	public static final boolean LCL_TABLE = false;
	
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
	 * 仕入返品予定ＮＯ. Purchase return schedule No..<p>
	 *
	 */
	public static final String $purc_ret_schd_no = "purc_ret_schd_no";
	private static final MCPermColumnInfo _purc_ret_schd_no = createColumnInfo("purc_ret_schd_no");
	public final MCStringPermColumn purc_ret_schd_no = createStringColumn(_purc_ret_schd_no);
	
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
	 * 計上日. Recording date.<p>
	 *
	 */
	public static final String $ac_dt = "ac_dt";
	private static final MCPermColumnInfo _ac_dt = createColumnInfo("ac_dt");
	public final MCDatePermColumn ac_dt = createDateColumn(_ac_dt);
	
	/**
	 * 購買担当者ＣＤ. Purchasing PIC cd..<p>
	 *
	 */
	public static final String $purc_usr_cd = "purc_usr_cd";
	private static final MCPermColumnInfo _purc_usr_cd = createColumnInfo("purc_usr_cd");
	public final MCStringPermColumn purc_usr_cd = createStringColumn(_purc_usr_cd);
	
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
	 * 発注先ＣＤ. Supplier cd..<p>
	 *
	 */
	public static final String $sppl_cd = "sppl_cd";
	private static final MCPermColumnInfo _sppl_cd = createColumnInfo("sppl_cd");
	public final MCStringPermColumn sppl_cd = createStringColumn(_sppl_cd);
	
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
	 * 発注先郵便番号. Supplier zip code.<p>
	 *
	 */
	public static final String $sppl_zip_cd = "sppl_zip_cd";
	private static final MCPermColumnInfo _sppl_zip_cd = createColumnInfo("sppl_zip_cd");
	public final MCStringPermColumn sppl_zip_cd = createStringColumn(_sppl_zip_cd);
	
	/**
	 * 発注先住所１. Supplier address 1.<p>
	 *
	 */
	public static final String $sppl_addr1 = "sppl_addr1";
	private static final MCPermColumnInfo _sppl_addr1 = createColumnInfo("sppl_addr1");
	public final MCStringPermColumn sppl_addr1 = createStringColumn(_sppl_addr1);
	
	/**
	 * 発注先住所２. Supplier address 2.<p>
	 *
	 */
	public static final String $sppl_addr2 = "sppl_addr2";
	private static final MCPermColumnInfo _sppl_addr2 = createColumnInfo("sppl_addr2");
	public final MCStringPermColumn sppl_addr2 = createStringColumn(_sppl_addr2);
	
	/**
	 * 発注先住所３. Supplier address 3.<p>
	 *
	 */
	public static final String $sppl_addr3 = "sppl_addr3";
	private static final MCPermColumnInfo _sppl_addr3 = createColumnInfo("sppl_addr3");
	public final MCStringPermColumn sppl_addr3 = createStringColumn(_sppl_addr3);
	
	/**
	 * 発注先住所４. Supplier address 4.<p>
	 *
	 */
	public static final String $sppl_addr4 = "sppl_addr4";
	private static final MCPermColumnInfo _sppl_addr4 = createColumnInfo("sppl_addr4");
	public final MCStringPermColumn sppl_addr4 = createStringColumn(_sppl_addr4);
	
	/**
	 * 発注先ＴＥＬ. Supplier TEL.<p>
	 *
	 */
	public static final String $sppl_tel = "sppl_tel";
	private static final MCPermColumnInfo _sppl_tel = createColumnInfo("sppl_tel");
	public final MCStringPermColumn sppl_tel = createStringColumn(_sppl_tel);
	
	/**
	 * 発注先ＦＡＸ. Supplier FAX.<p>
	 *
	 */
	public static final String $sppl_fax = "sppl_fax";
	private static final MCPermColumnInfo _sppl_fax = createColumnInfo("sppl_fax");
	public final MCStringPermColumn sppl_fax = createStringColumn(_sppl_fax);
	
	/**
	 * 返品先名. Return-to name.<p>
	 *
	 */
	public static final String $ret_sppl_nm = "ret_sppl_nm";
	private static final MCPermColumnInfo _ret_sppl_nm = createColumnInfo("ret_sppl_nm");
	public final MCStringPermColumn ret_sppl_nm = createStringColumn(_ret_sppl_nm);
	
	/**
	 * 返品先部署. Return-to dept..<p>
	 *
	 */
	public static final String $ret_sppl_cntct_dpt = "ret_sppl_cntct_dpt";
	private static final MCPermColumnInfo _ret_sppl_cntct_dpt = createColumnInfo("ret_sppl_cntct_dpt");
	public final MCStringPermColumn ret_sppl_cntct_dpt = createStringColumn(_ret_sppl_cntct_dpt);
	
	/**
	 * 返品先担当者. Return-to PIC.<p>
	 *
	 */
	public static final String $ret_sppl_cntct_psn = "ret_sppl_cntct_psn";
	private static final MCPermColumnInfo _ret_sppl_cntct_psn = createColumnInfo("ret_sppl_cntct_psn");
	public final MCStringPermColumn ret_sppl_cntct_psn = createStringColumn(_ret_sppl_cntct_psn);
	
	/**
	 * 返品先担当者敬称. Return-to PIC form of address.<p>
	 *
	 */
	public static final String $ret_sppl_cntct_psn_title = "ret_sppl_cntct_psn_title";
	private static final MCPermColumnInfo _ret_sppl_cntct_psn_title = createColumnInfo("ret_sppl_cntct_psn_title");
	public final MCStringPermColumn ret_sppl_cntct_psn_title = createStringColumn(_ret_sppl_cntct_psn_title);
	
	/**
	 * 返品先郵便番号. Return-to zip code.<p>
	 *
	 */
	public static final String $ret_sppl_zip_cd = "ret_sppl_zip_cd";
	private static final MCPermColumnInfo _ret_sppl_zip_cd = createColumnInfo("ret_sppl_zip_cd");
	public final MCStringPermColumn ret_sppl_zip_cd = createStringColumn(_ret_sppl_zip_cd);
	
	/**
	 * 返品先住所１. Return-to address 1.<p>
	 *
	 */
	public static final String $ret_sppl_addr1 = "ret_sppl_addr1";
	private static final MCPermColumnInfo _ret_sppl_addr1 = createColumnInfo("ret_sppl_addr1");
	public final MCStringPermColumn ret_sppl_addr1 = createStringColumn(_ret_sppl_addr1);
	
	/**
	 * 返品先住所２. Return-to address 2.<p>
	 *
	 */
	public static final String $ret_sppl_addr2 = "ret_sppl_addr2";
	private static final MCPermColumnInfo _ret_sppl_addr2 = createColumnInfo("ret_sppl_addr2");
	public final MCStringPermColumn ret_sppl_addr2 = createStringColumn(_ret_sppl_addr2);
	
	/**
	 * 返品先住所３. Return-to address 3.<p>
	 *
	 */
	public static final String $ret_sppl_addr3 = "ret_sppl_addr3";
	private static final MCPermColumnInfo _ret_sppl_addr3 = createColumnInfo("ret_sppl_addr3");
	public final MCStringPermColumn ret_sppl_addr3 = createStringColumn(_ret_sppl_addr3);
	
	/**
	 * 返品先住所４. Return-to address 4.<p>
	 *
	 */
	public static final String $ret_sppl_addr4 = "ret_sppl_addr4";
	private static final MCPermColumnInfo _ret_sppl_addr4 = createColumnInfo("ret_sppl_addr4");
	public final MCStringPermColumn ret_sppl_addr4 = createStringColumn(_ret_sppl_addr4);
	
	/**
	 * 返品先ＴＥＬ. Return-to TEL.<p>
	 *
	 */
	public static final String $ret_sppl_tel = "ret_sppl_tel";
	private static final MCPermColumnInfo _ret_sppl_tel = createColumnInfo("ret_sppl_tel");
	public final MCStringPermColumn ret_sppl_tel = createStringColumn(_ret_sppl_tel);
	
	/**
	 * 返品先ＦＡＸ. Return-to FAX.<p>
	 *
	 */
	public static final String $ret_sppl_fax = "ret_sppl_fax";
	private static final MCPermColumnInfo _ret_sppl_fax = createColumnInfo("ret_sppl_fax");
	public final MCStringPermColumn ret_sppl_fax = createStringColumn(_ret_sppl_fax);
	
	/**
	 * 仕入返品日. Purchase return date.<p>
	 *
	 */
	public static final String $purc_ret_dt = "purc_ret_dt";
	private static final MCPermColumnInfo _purc_ret_dt = createColumnInfo("purc_ret_dt");
	public final MCDatePermColumn purc_ret_dt = createDateColumn(_purc_ret_dt);
	
	/**
	 * 返品票発行日時. Return slip issue date and time.<p>
	 *
	 */
	public static final String $purc_ret_print_dt = "purc_ret_print_dt";
	private static final MCPermColumnInfo _purc_ret_print_dt = createColumnInfo("purc_ret_print_dt");
	public final MCDatePermColumn purc_ret_print_dt = createDateColumn(_purc_ret_print_dt);
	
	/**
	 * 返品票発行済ＦＬＧ. Return slip issued flg..<p>
	 *
	 */
	public static final String $purc_ret_print_flg = "purc_ret_print_flg";
	private static final MCPermColumnInfo _purc_ret_print_flg = createColumnInfo("purc_ret_print_flg");
	public final MCBooleanPermColumn purc_ret_print_flg = createBooleanColumn(_purc_ret_print_flg);
	
	/**
	 * 最新返品票改訂番号. Latest return slip rev. number.<p>
	 *
	 */
	public static final String $last_purc_ret_print_rev = "last_purc_ret_print_rev";
	private static final MCPermColumnInfo _last_purc_ret_print_rev = createColumnInfo("last_purc_ret_print_rev");
	public final MCNumberPermColumn last_purc_ret_print_rev = createNumberColumn(_last_purc_ret_print_rev);
	
	/**
	 * 取消ＦＬＧ. Cancel flg..<p>
	 *
	 */
	public static final String $can_flg = "can_flg";
	private static final MCPermColumnInfo _can_flg = createColumnInfo("can_flg");
	public final MCBooleanPermColumn can_flg = createBooleanColumn(_can_flg);
	
	/**
	 * 受領インボイスＮＯ. Purchase invoice No..<p>
	 *
	 */
	public static final String $rcpt_iv_no = "rcpt_iv_no";
	private static final MCPermColumnInfo _rcpt_iv_no = createColumnInfo("rcpt_iv_no");
	public final MCStringPermColumn rcpt_iv_no = createStringColumn(_rcpt_iv_no);
	
	/**
	 * 対応受領インボイスＮＯ. Corresponding purchase I/V No..<p>
	 *
	 */
	public static final String $ref_rcpt_iv_no = "ref_rcpt_iv_no";
	private static final MCPermColumnInfo _ref_rcpt_iv_no = createColumnInfo("ref_rcpt_iv_no");
	public final MCStringPermColumn ref_rcpt_iv_no = createStringColumn(_ref_rcpt_iv_no);
	
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
	 * 仕入返品票備考. Purchase return slip remarks.<p>
	 *
	 */
	public static final String $purc_ret_print_rmrks = "purc_ret_print_rmrks";
	private static final MCPermColumnInfo _purc_ret_print_rmrks = createColumnInfo("purc_ret_print_rmrks");
	public final MCStringPermColumn purc_ret_print_rmrks = createStringColumn(_purc_ret_print_rmrks);
	
	/**
	 * 予備項目１. Spare column 1.<p>
	 *
	 */
	public static final String $sub_char1 = "sub_char1";
	private static final MCPermColumnInfo _sub_char1 = createColumnInfo("sub_char1");
	public final MCStringPermColumn sub_char1 = createStringColumn(_sub_char1);
	
	/**
	 * 予備項目２. Spare column 2.<p>
	 *
	 */
	public static final String $sub_char2 = "sub_char2";
	private static final MCPermColumnInfo _sub_char2 = createColumnInfo("sub_char2");
	public final MCStringPermColumn sub_char2 = createStringColumn(_sub_char2);
	
	/**
	 * 予備項目３. Spare column 3.<p>
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
	
	public static final MCMeta purc_ret_act_no_META = createCommonMeta($purc_ret_act_no, mcframe.commonMA.meta.MA_META.PURC_RET_ACT_NO);
	public static final MCMeta purc_ret_act_rev_META = createCommonMeta($purc_ret_act_rev, mcframe.commonMA.meta.MA_META.SLIP_REV);
	public static final MCMeta purc_ret_schd_no_META = createCommonMeta($purc_ret_schd_no, mcframe.commonMA.meta.MA_META.PURC_RET_SCHD_NO);
	public static final MCMeta trd_cd_META = createCommonMeta($trd_cd, mcframe.commonMA.meta.MA_META.TRD_CD);
	public static final MCMeta trd_ptn_typ_META = createCommonMeta($trd_ptn_typ, mcframe.commonMA.meta.MA_META.TRD_PTN_TYP);
	public static final MCMeta ac_dt_META = createCommonMeta($ac_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta purc_usr_cd_META = createCommonMeta($purc_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta purc_dpt_cd_META = createCommonMeta($purc_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta sppl_cd_META = createCommonMeta($sppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta sppl_cntct_dpt_META = createCommonMeta($sppl_cntct_dpt, mcframe.commonMA.meta.MA_META.BP_CNTCT_DPT);
	public static final MCMeta sppl_cntct_psn_META = createCommonMeta($sppl_cntct_psn, mcframe.commonMA.meta.MA_META.BP_CNTCT_PSN);
	public static final MCMeta sppl_zip_cd_META = createCommonMeta($sppl_zip_cd, mcframe.commonMA.meta.MA_META.ZIP_CD);
	public static final MCMeta sppl_addr1_META = createCommonMeta($sppl_addr1, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta sppl_addr2_META = createCommonMeta($sppl_addr2, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta sppl_addr3_META = createCommonMeta($sppl_addr3, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta sppl_addr4_META = createCommonMeta($sppl_addr4, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta sppl_tel_META = createCommonMeta($sppl_tel, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta sppl_fax_META = createCommonMeta($sppl_fax, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta ret_sppl_nm_META = createCommonMeta($ret_sppl_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta ret_sppl_cntct_dpt_META = createCommonMeta($ret_sppl_cntct_dpt, mcframe.commonMA.meta.MA_META.BP_CNTCT_DPT);
	public static final MCMeta ret_sppl_cntct_psn_META = createCommonMeta($ret_sppl_cntct_psn, mcframe.commonMA.meta.MA_META.BP_CNTCT_PSN);
	public static final MCMeta ret_sppl_cntct_psn_title_META = createCommonMeta($ret_sppl_cntct_psn_title, mcframe.commonMA.meta.MA_META.BP_PSN_TITLE);
	public static final MCMeta ret_sppl_zip_cd_META = createCommonMeta($ret_sppl_zip_cd, mcframe.commonMA.meta.MA_META.ZIP_CD);
	public static final MCMeta ret_sppl_addr1_META = createCommonMeta($ret_sppl_addr1, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta ret_sppl_addr2_META = createCommonMeta($ret_sppl_addr2, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta ret_sppl_addr3_META = createCommonMeta($ret_sppl_addr3, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta ret_sppl_addr4_META = createCommonMeta($ret_sppl_addr4, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta ret_sppl_tel_META = createCommonMeta($ret_sppl_tel, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta ret_sppl_fax_META = createCommonMeta($ret_sppl_fax, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta purc_ret_dt_META = createCommonMeta($purc_ret_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta purc_ret_print_dt_META = createCommonMeta($purc_ret_print_dt, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta purc_ret_print_flg_META = createCommonMeta($purc_ret_print_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta last_purc_ret_print_rev_META = createCommonMeta($last_purc_ret_print_rev, mcframe.commonMA.meta.MA_META.SLIP_REV);
	public static final MCMeta can_flg_META = createCommonMeta($can_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rcpt_iv_no_META = createCommonMeta($rcpt_iv_no, mcframe.commonMA.meta.MA_META.IV_NO);
	public static final MCMeta ref_rcpt_iv_no_META = createCommonMeta($ref_rcpt_iv_no, mcframe.commonMA.meta.MA_META.IV_NO);
	public static final MCMeta tterm_cd1_META = createCommonMeta($tterm_cd1, mcframe.commonMA.meta.MA_META.TTERM_CD);
	public static final MCMeta tterm_rmrks1_META = createCommonMeta($tterm_rmrks1, mcframe.commonMS.meta.MS_META.TTERM_RMRKS1);
	public static final MCMeta tterm_cd2_META = createCommonMeta($tterm_cd2, mcframe.commonMA.meta.MA_META.TTERM_CD);
	public static final MCMeta tterm_rmrks2_META = createCommonMeta($tterm_rmrks2, mcframe.commonMS.meta.MS_META.TTERM_RMRKS2);
	public static final MCMeta tterm_cd3_META = createCommonMeta($tterm_cd3, mcframe.commonMA.meta.MA_META.TTERM_CD);
	public static final MCMeta tterm_rmrks3_META = createCommonMeta($tterm_rmrks3, mcframe.commonMS.meta.MS_META.TTERM_RMRKS3);
	public static final MCMeta trd_rmrks_META = createCommonMeta($trd_rmrks, mcframe.commonMA.meta.MA_META.TRD_RMRKS);
	public static final MCMeta intr_rmrks_META = createCommonMeta($intr_rmrks, mcframe.commonMS.meta.MS_META.PURC_RET_ACT_INTR_RMRKS);
	public static final MCMeta purc_ret_print_rmrks_META = createCommonMeta($purc_ret_print_rmrks, mcframe.commonMS.meta.MS_META.PURC_RET_PRINT_RMRKS);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.PURC_RET_ACT_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.PURC_RET_ACT_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.PURC_RET_ACT_SUB_CHAR3);
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
	
	protected static final ConstMetaList<MST_PURC_RET_ACT_R> constMetas = new ConstMetaList<MST_PURC_RET_ACT_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			purc_ret_act_no_META,
			purc_ret_act_rev_META,
			purc_ret_schd_no_META,
			trd_cd_META,
			trd_ptn_typ_META,
			ac_dt_META,
			purc_usr_cd_META,
			purc_dpt_cd_META,
			wg_cd_META,
			sppl_cd_META,
			sppl_cntct_dpt_META,
			sppl_cntct_psn_META,
			sppl_zip_cd_META,
			sppl_addr1_META,
			sppl_addr2_META,
			sppl_addr3_META,
			sppl_addr4_META,
			sppl_tel_META,
			sppl_fax_META,
			ret_sppl_nm_META,
			ret_sppl_cntct_dpt_META,
			ret_sppl_cntct_psn_META,
			ret_sppl_cntct_psn_title_META,
			ret_sppl_zip_cd_META,
			ret_sppl_addr1_META,
			ret_sppl_addr2_META,
			ret_sppl_addr3_META,
			ret_sppl_addr4_META,
			ret_sppl_tel_META,
			ret_sppl_fax_META,
			purc_ret_dt_META,
			purc_ret_print_dt_META,
			purc_ret_print_flg_META,
			last_purc_ret_print_rev_META,
			can_flg_META,
			rcpt_iv_no_META,
			ref_rcpt_iv_no_META,
			tterm_cd1_META,
			tterm_rmrks1_META,
			tterm_cd2_META,
			tterm_rmrks2_META,
			tterm_cd3_META,
			tterm_rmrks3_META,
			trd_rmrks_META,
			intr_rmrks_META,
			purc_ret_print_rmrks_META,
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
	protected MST_PURC_RET_ACT_R(ConstMetaList<? extends MST_PURC_RET_ACT_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MST_PURC_RET_ACT_R(ConstMetaList<? extends MST_PURC_RET_ACT_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MST_PURC_RET_ACT_R.$purc_ret_act_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PURC_RET_ACT_R.$purc_ret_act_no,
				"purc_ret_act_no",
				purc_ret_act_no,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PURC_RET_ACT_R.$purc_ret_act_rev,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_PURC_RET_ACT_R.$purc_ret_act_rev,
				"purc_ret_act_rev",
				purc_ret_act_rev,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PURC_RET_ACT_R.$purc_ret_schd_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PURC_RET_ACT_R.$purc_ret_schd_no,
				"purc_ret_schd_no",
				purc_ret_schd_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PURC_RET_ACT_R.$trd_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PURC_RET_ACT_R.$trd_cd,
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
			MST_PURC_RET_ACT_R.$trd_ptn_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PURC_RET_ACT_R.$trd_ptn_typ,
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
			MST_PURC_RET_ACT_R.$ac_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_PURC_RET_ACT_R.$ac_dt,
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
			MST_PURC_RET_ACT_R.$purc_usr_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PURC_RET_ACT_R.$purc_usr_cd,
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
			MST_PURC_RET_ACT_R.$purc_dpt_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PURC_RET_ACT_R.$purc_dpt_cd,
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
			MST_PURC_RET_ACT_R.$wg_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PURC_RET_ACT_R.$wg_cd,
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
			MST_PURC_RET_ACT_R.$sppl_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PURC_RET_ACT_R.$sppl_cd,
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
			MST_PURC_RET_ACT_R.$sppl_cntct_dpt,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PURC_RET_ACT_R.$sppl_cntct_dpt,
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
			MST_PURC_RET_ACT_R.$sppl_cntct_psn,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PURC_RET_ACT_R.$sppl_cntct_psn,
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
			MST_PURC_RET_ACT_R.$sppl_zip_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PURC_RET_ACT_R.$sppl_zip_cd,
				"sppl_zip_cd",
				sppl_zip_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PURC_RET_ACT_R.$sppl_addr1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PURC_RET_ACT_R.$sppl_addr1,
				"sppl_addr1",
				sppl_addr1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PURC_RET_ACT_R.$sppl_addr2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PURC_RET_ACT_R.$sppl_addr2,
				"sppl_addr2",
				sppl_addr2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PURC_RET_ACT_R.$sppl_addr3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PURC_RET_ACT_R.$sppl_addr3,
				"sppl_addr3",
				sppl_addr3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PURC_RET_ACT_R.$sppl_addr4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PURC_RET_ACT_R.$sppl_addr4,
				"sppl_addr4",
				sppl_addr4,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PURC_RET_ACT_R.$sppl_tel,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PURC_RET_ACT_R.$sppl_tel,
				"sppl_tel",
				sppl_tel,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PURC_RET_ACT_R.$sppl_fax,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PURC_RET_ACT_R.$sppl_fax,
				"sppl_fax",
				sppl_fax,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PURC_RET_ACT_R.$ret_sppl_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PURC_RET_ACT_R.$ret_sppl_nm,
				"ret_sppl_nm",
				ret_sppl_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PURC_RET_ACT_R.$ret_sppl_cntct_dpt,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PURC_RET_ACT_R.$ret_sppl_cntct_dpt,
				"ret_sppl_cntct_dpt",
				ret_sppl_cntct_dpt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PURC_RET_ACT_R.$ret_sppl_cntct_psn,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PURC_RET_ACT_R.$ret_sppl_cntct_psn,
				"ret_sppl_cntct_psn",
				ret_sppl_cntct_psn,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PURC_RET_ACT_R.$ret_sppl_cntct_psn_title,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PURC_RET_ACT_R.$ret_sppl_cntct_psn_title,
				"ret_sppl_cntct_psn_title",
				ret_sppl_cntct_psn_title,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PURC_RET_ACT_R.$ret_sppl_zip_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PURC_RET_ACT_R.$ret_sppl_zip_cd,
				"ret_sppl_zip_cd",
				ret_sppl_zip_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PURC_RET_ACT_R.$ret_sppl_addr1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PURC_RET_ACT_R.$ret_sppl_addr1,
				"ret_sppl_addr1",
				ret_sppl_addr1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PURC_RET_ACT_R.$ret_sppl_addr2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PURC_RET_ACT_R.$ret_sppl_addr2,
				"ret_sppl_addr2",
				ret_sppl_addr2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PURC_RET_ACT_R.$ret_sppl_addr3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PURC_RET_ACT_R.$ret_sppl_addr3,
				"ret_sppl_addr3",
				ret_sppl_addr3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PURC_RET_ACT_R.$ret_sppl_addr4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PURC_RET_ACT_R.$ret_sppl_addr4,
				"ret_sppl_addr4",
				ret_sppl_addr4,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PURC_RET_ACT_R.$ret_sppl_tel,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PURC_RET_ACT_R.$ret_sppl_tel,
				"ret_sppl_tel",
				ret_sppl_tel,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PURC_RET_ACT_R.$ret_sppl_fax,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PURC_RET_ACT_R.$ret_sppl_fax,
				"ret_sppl_fax",
				ret_sppl_fax,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PURC_RET_ACT_R.$purc_ret_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_PURC_RET_ACT_R.$purc_ret_dt,
				"purc_ret_dt",
				purc_ret_dt,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PURC_RET_ACT_R.$purc_ret_print_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_PURC_RET_ACT_R.$purc_ret_print_dt,
				"purc_ret_print_dt",
				purc_ret_print_dt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PURC_RET_ACT_R.$purc_ret_print_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_PURC_RET_ACT_R.$purc_ret_print_flg,
				"purc_ret_print_flg",
				purc_ret_print_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PURC_RET_ACT_R.$last_purc_ret_print_rev,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_PURC_RET_ACT_R.$last_purc_ret_print_rev,
				"last_purc_ret_print_rev",
				last_purc_ret_print_rev,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PURC_RET_ACT_R.$can_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_PURC_RET_ACT_R.$can_flg,
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
			MST_PURC_RET_ACT_R.$rcpt_iv_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PURC_RET_ACT_R.$rcpt_iv_no,
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
			MST_PURC_RET_ACT_R.$ref_rcpt_iv_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PURC_RET_ACT_R.$ref_rcpt_iv_no,
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
			MST_PURC_RET_ACT_R.$tterm_cd1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PURC_RET_ACT_R.$tterm_cd1,
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
			MST_PURC_RET_ACT_R.$tterm_rmrks1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PURC_RET_ACT_R.$tterm_rmrks1,
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
			MST_PURC_RET_ACT_R.$tterm_cd2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PURC_RET_ACT_R.$tterm_cd2,
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
			MST_PURC_RET_ACT_R.$tterm_rmrks2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PURC_RET_ACT_R.$tterm_rmrks2,
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
			MST_PURC_RET_ACT_R.$tterm_cd3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PURC_RET_ACT_R.$tterm_cd3,
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
			MST_PURC_RET_ACT_R.$tterm_rmrks3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PURC_RET_ACT_R.$tterm_rmrks3,
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
			MST_PURC_RET_ACT_R.$trd_rmrks,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PURC_RET_ACT_R.$trd_rmrks,
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
			MST_PURC_RET_ACT_R.$intr_rmrks,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PURC_RET_ACT_R.$intr_rmrks,
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
			MST_PURC_RET_ACT_R.$purc_ret_print_rmrks,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PURC_RET_ACT_R.$purc_ret_print_rmrks,
				"purc_ret_print_rmrks",
				purc_ret_print_rmrks,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_PURC_RET_ACT_R.$sub_char1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PURC_RET_ACT_R.$sub_char1,
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
			MST_PURC_RET_ACT_R.$sub_char2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PURC_RET_ACT_R.$sub_char2,
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
			MST_PURC_RET_ACT_R.$sub_char3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PURC_RET_ACT_R.$sub_char3,
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
			MST_PURC_RET_ACT_R.$ins_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PURC_RET_ACT_R.$ins_usr_id,
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
			MST_PURC_RET_ACT_R.$ins_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PURC_RET_ACT_R.$ins_usr_nm,
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
			MST_PURC_RET_ACT_R.$ins_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MST_PURC_RET_ACT_R.$ins_ts,
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
			MST_PURC_RET_ACT_R.$ins_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PURC_RET_ACT_R.$ins_func_id,
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
			MST_PURC_RET_ACT_R.$upd_cntr,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_PURC_RET_ACT_R.$upd_cntr,
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
			MST_PURC_RET_ACT_R.$upd_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PURC_RET_ACT_R.$upd_usr_id,
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
			MST_PURC_RET_ACT_R.$upd_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PURC_RET_ACT_R.$upd_usr_nm,
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
			MST_PURC_RET_ACT_R.$upd_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MST_PURC_RET_ACT_R.$upd_ts,
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
			MST_PURC_RET_ACT_R.$upd_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PURC_RET_ACT_R.$upd_func_id,
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
			MST_PURC_RET_ACT_R.$upd_srv_req_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_PURC_RET_ACT_R.$upd_srv_req_no,
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
	public static MST_PURC_RET_ACT_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MST_PURC_RET_ACT_R create(String alias) {
		MST_PURC_RET_ACT_R row = new MST_PURC_RET_ACT_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MST_PURC_RET_ACT_R createByName(T proto) {
		MST_PURC_RET_ACT_R row = MST_PURC_RET_ACT_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MST_PURC_RET_ACT_R clone() {
		return (MST_PURC_RET_ACT_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MST_PURC_RET_ACT_R createInstance() {
		return (MST_PURC_RET_ACT_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MST_PURC_RET_ACT_R getValues(String... names) {
		return (MST_PURC_RET_ACT_R) super.getValues(names);
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
	 public MSW_PURC_RET_ACT_KEY_R getPkWorkDbc(String alias) {
	 	return MSW_PURC_RET_ACT_KEY_R.create(alias);
	 }

	/*
	 * MCDBContainerのオーバーライドメソッドです。
	 */
	 public MSW_PURC_RET_ACT_KEY_R getPkWorkDbc() {
	 	return getPkWorkDbc(MSW_PURC_RET_ACT_KEY_R.TABLE_NAME);
	 }

	/**
	 * 仕入返品実績ＮＯ. Purchase return result No..<p>
	 *
	 */
	public String purc_ret_act_no() {
		return getConstString(offset + 0, $purc_ret_act_no);
	}

	/**
	 * 仕入返品実績ＮＯ. Purchase return result No..<p>
	 *
	 */
	public void purc_ret_act_no(String value) {
		setConstString(offset + 0, $purc_ret_act_no, value);
	}

	/**
	 * 仕入返品実績改訂番号. Purchase return result rev. number.<p>
	 *
	 */
	public MCNumber purc_ret_act_rev() {
		return getConstNumber(offset + 1, $purc_ret_act_rev);
	}

	/**
	 * 仕入返品実績改訂番号. Purchase return result rev. number.<p>
	 *
	 */
	public void purc_ret_act_rev(MCNumber value) {
		setConstNumber(offset + 1, $purc_ret_act_rev, value);
	}
	
	/**
	 * 仕入返品実績改訂番号. Purchase return result rev. number.<p>
	 *
	 */
	public void purc_ret_act_rev(int value) {
		setConstNumber(offset + 1, $purc_ret_act_rev, value);
	}
	
	/**
	 * 仕入返品実績改訂番号. Purchase return result rev. number.<p>
	 *
	 */
	public void purc_ret_act_rev(long value) {
		setConstNumber(offset + 1, $purc_ret_act_rev, value);
	}
	
	/**
	 * 仕入返品実績改訂番号. Purchase return result rev. number.<p>
	 *
	 */
	public void purc_ret_act_rev(float value) {
		setConstNumber(offset + 1, $purc_ret_act_rev, value);
	}
	
	/**
	 * 仕入返品実績改訂番号. Purchase return result rev. number.<p>
	 *
	 */
	public void purc_ret_act_rev(double value) {
		setConstNumber(offset + 1, $purc_ret_act_rev, value);
	}
	
	/**
	 * 仕入返品予定ＮＯ. Purchase return schedule No..<p>
	 *
	 */
	public String purc_ret_schd_no() {
		return getConstString(offset + 2, $purc_ret_schd_no);
	}

	/**
	 * 仕入返品予定ＮＯ. Purchase return schedule No..<p>
	 *
	 */
	public void purc_ret_schd_no(String value) {
		setConstString(offset + 2, $purc_ret_schd_no, value);
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
	 * 計上日. Recording date.<p>
	 *
	 */
	public MCDate ac_dt() {
		return getConstDate(offset + 5, $ac_dt);
	}

	/**
	 * 計上日. Recording date.<p>
	 *
	 */
	public void ac_dt(MCDate value) {
		setConstDate(offset + 5, $ac_dt, value);
	}

	/**
	 * 購買担当者ＣＤ. Purchasing PIC cd..<p>
	 *
	 */
	public String purc_usr_cd() {
		return getConstString(offset + 6, $purc_usr_cd);
	}

	/**
	 * 購買担当者ＣＤ. Purchasing PIC cd..<p>
	 *
	 */
	public void purc_usr_cd(String value) {
		setConstString(offset + 6, $purc_usr_cd, value);
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
	 * 発注先ＣＤ. Supplier cd..<p>
	 *
	 */
	public String sppl_cd() {
		return getConstString(offset + 9, $sppl_cd);
	}

	/**
	 * 発注先ＣＤ. Supplier cd..<p>
	 *
	 */
	public void sppl_cd(String value) {
		setConstString(offset + 9, $sppl_cd, value);
	}

	/**
	 * 発注先部署. Supplier dept..<p>
	 *
	 */
	public String sppl_cntct_dpt() {
		return getConstString(offset + 10, $sppl_cntct_dpt);
	}

	/**
	 * 発注先部署. Supplier dept..<p>
	 *
	 */
	public void sppl_cntct_dpt(String value) {
		setConstString(offset + 10, $sppl_cntct_dpt, value);
	}

	/**
	 * 発注先担当者. Supplier PIC.<p>
	 *
	 */
	public String sppl_cntct_psn() {
		return getConstString(offset + 11, $sppl_cntct_psn);
	}

	/**
	 * 発注先担当者. Supplier PIC.<p>
	 *
	 */
	public void sppl_cntct_psn(String value) {
		setConstString(offset + 11, $sppl_cntct_psn, value);
	}

	/**
	 * 発注先郵便番号. Supplier zip code.<p>
	 *
	 */
	public String sppl_zip_cd() {
		return getConstString(offset + 12, $sppl_zip_cd);
	}

	/**
	 * 発注先郵便番号. Supplier zip code.<p>
	 *
	 */
	public void sppl_zip_cd(String value) {
		setConstString(offset + 12, $sppl_zip_cd, value);
	}

	/**
	 * 発注先住所１. Supplier address 1.<p>
	 *
	 */
	public String sppl_addr1() {
		return getConstString(offset + 13, $sppl_addr1);
	}

	/**
	 * 発注先住所１. Supplier address 1.<p>
	 *
	 */
	public void sppl_addr1(String value) {
		setConstString(offset + 13, $sppl_addr1, value);
	}

	/**
	 * 発注先住所２. Supplier address 2.<p>
	 *
	 */
	public String sppl_addr2() {
		return getConstString(offset + 14, $sppl_addr2);
	}

	/**
	 * 発注先住所２. Supplier address 2.<p>
	 *
	 */
	public void sppl_addr2(String value) {
		setConstString(offset + 14, $sppl_addr2, value);
	}

	/**
	 * 発注先住所３. Supplier address 3.<p>
	 *
	 */
	public String sppl_addr3() {
		return getConstString(offset + 15, $sppl_addr3);
	}

	/**
	 * 発注先住所３. Supplier address 3.<p>
	 *
	 */
	public void sppl_addr3(String value) {
		setConstString(offset + 15, $sppl_addr3, value);
	}

	/**
	 * 発注先住所４. Supplier address 4.<p>
	 *
	 */
	public String sppl_addr4() {
		return getConstString(offset + 16, $sppl_addr4);
	}

	/**
	 * 発注先住所４. Supplier address 4.<p>
	 *
	 */
	public void sppl_addr4(String value) {
		setConstString(offset + 16, $sppl_addr4, value);
	}

	/**
	 * 発注先ＴＥＬ. Supplier TEL.<p>
	 *
	 */
	public String sppl_tel() {
		return getConstString(offset + 17, $sppl_tel);
	}

	/**
	 * 発注先ＴＥＬ. Supplier TEL.<p>
	 *
	 */
	public void sppl_tel(String value) {
		setConstString(offset + 17, $sppl_tel, value);
	}

	/**
	 * 発注先ＦＡＸ. Supplier FAX.<p>
	 *
	 */
	public String sppl_fax() {
		return getConstString(offset + 18, $sppl_fax);
	}

	/**
	 * 発注先ＦＡＸ. Supplier FAX.<p>
	 *
	 */
	public void sppl_fax(String value) {
		setConstString(offset + 18, $sppl_fax, value);
	}

	/**
	 * 返品先名. Return-to name.<p>
	 *
	 */
	public String ret_sppl_nm() {
		return getConstString(offset + 19, $ret_sppl_nm);
	}

	/**
	 * 返品先名. Return-to name.<p>
	 *
	 */
	public void ret_sppl_nm(String value) {
		setConstString(offset + 19, $ret_sppl_nm, value);
	}

	/**
	 * 返品先部署. Return-to dept..<p>
	 *
	 */
	public String ret_sppl_cntct_dpt() {
		return getConstString(offset + 20, $ret_sppl_cntct_dpt);
	}

	/**
	 * 返品先部署. Return-to dept..<p>
	 *
	 */
	public void ret_sppl_cntct_dpt(String value) {
		setConstString(offset + 20, $ret_sppl_cntct_dpt, value);
	}

	/**
	 * 返品先担当者. Return-to PIC.<p>
	 *
	 */
	public String ret_sppl_cntct_psn() {
		return getConstString(offset + 21, $ret_sppl_cntct_psn);
	}

	/**
	 * 返品先担当者. Return-to PIC.<p>
	 *
	 */
	public void ret_sppl_cntct_psn(String value) {
		setConstString(offset + 21, $ret_sppl_cntct_psn, value);
	}

	/**
	 * 返品先担当者敬称. Return-to PIC form of address.<p>
	 *
	 */
	public String ret_sppl_cntct_psn_title() {
		return getConstString(offset + 22, $ret_sppl_cntct_psn_title);
	}

	/**
	 * 返品先担当者敬称. Return-to PIC form of address.<p>
	 *
	 */
	public void ret_sppl_cntct_psn_title(String value) {
		setConstString(offset + 22, $ret_sppl_cntct_psn_title, value);
	}

	/**
	 * 返品先郵便番号. Return-to zip code.<p>
	 *
	 */
	public String ret_sppl_zip_cd() {
		return getConstString(offset + 23, $ret_sppl_zip_cd);
	}

	/**
	 * 返品先郵便番号. Return-to zip code.<p>
	 *
	 */
	public void ret_sppl_zip_cd(String value) {
		setConstString(offset + 23, $ret_sppl_zip_cd, value);
	}

	/**
	 * 返品先住所１. Return-to address 1.<p>
	 *
	 */
	public String ret_sppl_addr1() {
		return getConstString(offset + 24, $ret_sppl_addr1);
	}

	/**
	 * 返品先住所１. Return-to address 1.<p>
	 *
	 */
	public void ret_sppl_addr1(String value) {
		setConstString(offset + 24, $ret_sppl_addr1, value);
	}

	/**
	 * 返品先住所２. Return-to address 2.<p>
	 *
	 */
	public String ret_sppl_addr2() {
		return getConstString(offset + 25, $ret_sppl_addr2);
	}

	/**
	 * 返品先住所２. Return-to address 2.<p>
	 *
	 */
	public void ret_sppl_addr2(String value) {
		setConstString(offset + 25, $ret_sppl_addr2, value);
	}

	/**
	 * 返品先住所３. Return-to address 3.<p>
	 *
	 */
	public String ret_sppl_addr3() {
		return getConstString(offset + 26, $ret_sppl_addr3);
	}

	/**
	 * 返品先住所３. Return-to address 3.<p>
	 *
	 */
	public void ret_sppl_addr3(String value) {
		setConstString(offset + 26, $ret_sppl_addr3, value);
	}

	/**
	 * 返品先住所４. Return-to address 4.<p>
	 *
	 */
	public String ret_sppl_addr4() {
		return getConstString(offset + 27, $ret_sppl_addr4);
	}

	/**
	 * 返品先住所４. Return-to address 4.<p>
	 *
	 */
	public void ret_sppl_addr4(String value) {
		setConstString(offset + 27, $ret_sppl_addr4, value);
	}

	/**
	 * 返品先ＴＥＬ. Return-to TEL.<p>
	 *
	 */
	public String ret_sppl_tel() {
		return getConstString(offset + 28, $ret_sppl_tel);
	}

	/**
	 * 返品先ＴＥＬ. Return-to TEL.<p>
	 *
	 */
	public void ret_sppl_tel(String value) {
		setConstString(offset + 28, $ret_sppl_tel, value);
	}

	/**
	 * 返品先ＦＡＸ. Return-to FAX.<p>
	 *
	 */
	public String ret_sppl_fax() {
		return getConstString(offset + 29, $ret_sppl_fax);
	}

	/**
	 * 返品先ＦＡＸ. Return-to FAX.<p>
	 *
	 */
	public void ret_sppl_fax(String value) {
		setConstString(offset + 29, $ret_sppl_fax, value);
	}

	/**
	 * 仕入返品日. Purchase return date.<p>
	 *
	 */
	public MCDate purc_ret_dt() {
		return getConstDate(offset + 30, $purc_ret_dt);
	}

	/**
	 * 仕入返品日. Purchase return date.<p>
	 *
	 */
	public void purc_ret_dt(MCDate value) {
		setConstDate(offset + 30, $purc_ret_dt, value);
	}

	/**
	 * 返品票発行日時. Return slip issue date and time.<p>
	 *
	 */
	public MCDate purc_ret_print_dt() {
		return getConstDate(offset + 31, $purc_ret_print_dt);
	}

	/**
	 * 返品票発行日時. Return slip issue date and time.<p>
	 *
	 */
	public void purc_ret_print_dt(MCDate value) {
		setConstDate(offset + 31, $purc_ret_print_dt, value);
	}

	/**
	 * 返品票発行済ＦＬＧ. Return slip issued flg..<p>
	 *
	 */
	public boolean purc_ret_print_flg() {
		return getConstBoolean(offset + 32, $purc_ret_print_flg);
	}

	/**
	 * 返品票発行済ＦＬＧ. Return slip issued flg..<p>
	 *
	 */
	public void purc_ret_print_flg(boolean value) {
		setConstBoolean(offset + 32, $purc_ret_print_flg, value);
	}

	/**
	 * 最新返品票改訂番号. Latest return slip rev. number.<p>
	 *
	 */
	public MCNumber last_purc_ret_print_rev() {
		return getConstNumber(offset + 33, $last_purc_ret_print_rev);
	}

	/**
	 * 最新返品票改訂番号. Latest return slip rev. number.<p>
	 *
	 */
	public void last_purc_ret_print_rev(MCNumber value) {
		setConstNumber(offset + 33, $last_purc_ret_print_rev, value);
	}
	
	/**
	 * 最新返品票改訂番号. Latest return slip rev. number.<p>
	 *
	 */
	public void last_purc_ret_print_rev(int value) {
		setConstNumber(offset + 33, $last_purc_ret_print_rev, value);
	}
	
	/**
	 * 最新返品票改訂番号. Latest return slip rev. number.<p>
	 *
	 */
	public void last_purc_ret_print_rev(long value) {
		setConstNumber(offset + 33, $last_purc_ret_print_rev, value);
	}
	
	/**
	 * 最新返品票改訂番号. Latest return slip rev. number.<p>
	 *
	 */
	public void last_purc_ret_print_rev(float value) {
		setConstNumber(offset + 33, $last_purc_ret_print_rev, value);
	}
	
	/**
	 * 最新返品票改訂番号. Latest return slip rev. number.<p>
	 *
	 */
	public void last_purc_ret_print_rev(double value) {
		setConstNumber(offset + 33, $last_purc_ret_print_rev, value);
	}
	
	/**
	 * 取消ＦＬＧ. Cancel flg..<p>
	 *
	 */
	public boolean can_flg() {
		return getConstBoolean(offset + 34, $can_flg);
	}

	/**
	 * 取消ＦＬＧ. Cancel flg..<p>
	 *
	 */
	public void can_flg(boolean value) {
		setConstBoolean(offset + 34, $can_flg, value);
	}

	/**
	 * 受領インボイスＮＯ. Purchase invoice No..<p>
	 *
	 */
	public String rcpt_iv_no() {
		return getConstString(offset + 35, $rcpt_iv_no);
	}

	/**
	 * 受領インボイスＮＯ. Purchase invoice No..<p>
	 *
	 */
	public void rcpt_iv_no(String value) {
		setConstString(offset + 35, $rcpt_iv_no, value);
	}

	/**
	 * 対応受領インボイスＮＯ. Corresponding purchase I/V No..<p>
	 *
	 */
	public String ref_rcpt_iv_no() {
		return getConstString(offset + 36, $ref_rcpt_iv_no);
	}

	/**
	 * 対応受領インボイスＮＯ. Corresponding purchase I/V No..<p>
	 *
	 */
	public void ref_rcpt_iv_no(String value) {
		setConstString(offset + 36, $ref_rcpt_iv_no, value);
	}

	/**
	 * 取引条件ＣＤ１. Transaction terms cd. 1.<p>
	 *
	 */
	public String tterm_cd1() {
		return getConstString(offset + 37, $tterm_cd1);
	}

	/**
	 * 取引条件ＣＤ１. Transaction terms cd. 1.<p>
	 *
	 */
	public void tterm_cd1(String value) {
		setConstString(offset + 37, $tterm_cd1, value);
	}

	/**
	 * 取引条件備考１. Transaction terms remarks 1.<p>
	 *
	 */
	public String tterm_rmrks1() {
		return getConstString(offset + 38, $tterm_rmrks1);
	}

	/**
	 * 取引条件備考１. Transaction terms remarks 1.<p>
	 *
	 */
	public void tterm_rmrks1(String value) {
		setConstString(offset + 38, $tterm_rmrks1, value);
	}

	/**
	 * 取引条件ＣＤ２. Transaction terms cd. 2.<p>
	 *
	 */
	public String tterm_cd2() {
		return getConstString(offset + 39, $tterm_cd2);
	}

	/**
	 * 取引条件ＣＤ２. Transaction terms cd. 2.<p>
	 *
	 */
	public void tterm_cd2(String value) {
		setConstString(offset + 39, $tterm_cd2, value);
	}

	/**
	 * 取引条件備考２. Transaction terms remarks 2.<p>
	 *
	 */
	public String tterm_rmrks2() {
		return getConstString(offset + 40, $tterm_rmrks2);
	}

	/**
	 * 取引条件備考２. Transaction terms remarks 2.<p>
	 *
	 */
	public void tterm_rmrks2(String value) {
		setConstString(offset + 40, $tterm_rmrks2, value);
	}

	/**
	 * 取引条件ＣＤ３. Transaction terms cd. 3.<p>
	 *
	 */
	public String tterm_cd3() {
		return getConstString(offset + 41, $tterm_cd3);
	}

	/**
	 * 取引条件ＣＤ３. Transaction terms cd. 3.<p>
	 *
	 */
	public void tterm_cd3(String value) {
		setConstString(offset + 41, $tterm_cd3, value);
	}

	/**
	 * 取引条件備考３. Transaction terms remarks 3.<p>
	 *
	 */
	public String tterm_rmrks3() {
		return getConstString(offset + 42, $tterm_rmrks3);
	}

	/**
	 * 取引条件備考３. Transaction terms remarks 3.<p>
	 *
	 */
	public void tterm_rmrks3(String value) {
		setConstString(offset + 42, $tterm_rmrks3, value);
	}

	/**
	 * 取引備考. Transaction remarks.<p>
	 *
	 */
	public String trd_rmrks() {
		return getConstString(offset + 43, $trd_rmrks);
	}

	/**
	 * 取引備考. Transaction remarks.<p>
	 *
	 */
	public void trd_rmrks(String value) {
		setConstString(offset + 43, $trd_rmrks, value);
	}

	/**
	 * 内部備考. Internal remarks.<p>
	 *
	 */
	public String intr_rmrks() {
		return getConstString(offset + 44, $intr_rmrks);
	}

	/**
	 * 内部備考. Internal remarks.<p>
	 *
	 */
	public void intr_rmrks(String value) {
		setConstString(offset + 44, $intr_rmrks, value);
	}

	/**
	 * 仕入返品票備考. Purchase return slip remarks.<p>
	 *
	 */
	public String purc_ret_print_rmrks() {
		return getConstString(offset + 45, $purc_ret_print_rmrks);
	}

	/**
	 * 仕入返品票備考. Purchase return slip remarks.<p>
	 *
	 */
	public void purc_ret_print_rmrks(String value) {
		setConstString(offset + 45, $purc_ret_print_rmrks, value);
	}

	/**
	 * 予備項目１. Spare column 1.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 46, $sub_char1);
	}

	/**
	 * 予備項目１. Spare column 1.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 46, $sub_char1, value);
	}

	/**
	 * 予備項目２. Spare column 2.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 47, $sub_char2);
	}

	/**
	 * 予備項目２. Spare column 2.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 47, $sub_char2, value);
	}

	/**
	 * 予備項目３. Spare column 3.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 48, $sub_char3);
	}

	/**
	 * 予備項目３. Spare column 3.<p>
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
		if ($purc_ret_act_no.equalsIgnoreCase(name)) {
			return purc_ret_act_no();
		}
		if ($purc_ret_schd_no.equalsIgnoreCase(name)) {
			return purc_ret_schd_no();
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			return trd_cd();
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			return trd_ptn_typ();
		}
		if ($purc_usr_cd.equalsIgnoreCase(name)) {
			return purc_usr_cd();
		}
		if ($purc_dpt_cd.equalsIgnoreCase(name)) {
			return purc_dpt_cd();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			return sppl_cd();
		}
		if ($sppl_cntct_dpt.equalsIgnoreCase(name)) {
			return sppl_cntct_dpt();
		}
		if ($sppl_cntct_psn.equalsIgnoreCase(name)) {
			return sppl_cntct_psn();
		}
		if ($sppl_zip_cd.equalsIgnoreCase(name)) {
			return sppl_zip_cd();
		}
		if ($sppl_addr1.equalsIgnoreCase(name)) {
			return sppl_addr1();
		}
		if ($sppl_addr2.equalsIgnoreCase(name)) {
			return sppl_addr2();
		}
		if ($sppl_addr3.equalsIgnoreCase(name)) {
			return sppl_addr3();
		}
		if ($sppl_addr4.equalsIgnoreCase(name)) {
			return sppl_addr4();
		}
		if ($sppl_tel.equalsIgnoreCase(name)) {
			return sppl_tel();
		}
		if ($sppl_fax.equalsIgnoreCase(name)) {
			return sppl_fax();
		}
		if ($ret_sppl_nm.equalsIgnoreCase(name)) {
			return ret_sppl_nm();
		}
		if ($ret_sppl_cntct_dpt.equalsIgnoreCase(name)) {
			return ret_sppl_cntct_dpt();
		}
		if ($ret_sppl_cntct_psn.equalsIgnoreCase(name)) {
			return ret_sppl_cntct_psn();
		}
		if ($ret_sppl_cntct_psn_title.equalsIgnoreCase(name)) {
			return ret_sppl_cntct_psn_title();
		}
		if ($ret_sppl_zip_cd.equalsIgnoreCase(name)) {
			return ret_sppl_zip_cd();
		}
		if ($ret_sppl_addr1.equalsIgnoreCase(name)) {
			return ret_sppl_addr1();
		}
		if ($ret_sppl_addr2.equalsIgnoreCase(name)) {
			return ret_sppl_addr2();
		}
		if ($ret_sppl_addr3.equalsIgnoreCase(name)) {
			return ret_sppl_addr3();
		}
		if ($ret_sppl_addr4.equalsIgnoreCase(name)) {
			return ret_sppl_addr4();
		}
		if ($ret_sppl_tel.equalsIgnoreCase(name)) {
			return ret_sppl_tel();
		}
		if ($ret_sppl_fax.equalsIgnoreCase(name)) {
			return ret_sppl_fax();
		}
		if ($rcpt_iv_no.equalsIgnoreCase(name)) {
			return rcpt_iv_no();
		}
		if ($ref_rcpt_iv_no.equalsIgnoreCase(name)) {
			return ref_rcpt_iv_no();
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
		if ($purc_ret_print_rmrks.equalsIgnoreCase(name)) {
			return purc_ret_print_rmrks();
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
		if ($purc_ret_act_rev.equalsIgnoreCase(name)) {
			return purc_ret_act_rev();
		}
		if ($last_purc_ret_print_rev.equalsIgnoreCase(name)) {
			return last_purc_ret_print_rev();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumber(name);
	}

	public MCDate getDate(String name) {
		if ($ac_dt.equalsIgnoreCase(name)) {
			return ac_dt();
		}
		if ($purc_ret_dt.equalsIgnoreCase(name)) {
			return purc_ret_dt();
		}
		if ($purc_ret_print_dt.equalsIgnoreCase(name)) {
			return purc_ret_print_dt();
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
		if ($purc_ret_print_flg.equalsIgnoreCase(name)) {
			return purc_ret_print_flg();
		}
		if ($can_flg.equalsIgnoreCase(name)) {
			return can_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($purc_ret_act_no.equalsIgnoreCase(name)) {
			return purc_ret_act_no();
		}
		if ($purc_ret_schd_no.equalsIgnoreCase(name)) {
			return purc_ret_schd_no();
		}
		if ($trd_cd.equalsIgnoreCase(name)) {
			return trd_cd();
		}
		if ($trd_ptn_typ.equalsIgnoreCase(name)) {
			return trd_ptn_typ();
		}
		if ($purc_usr_cd.equalsIgnoreCase(name)) {
			return purc_usr_cd();
		}
		if ($purc_dpt_cd.equalsIgnoreCase(name)) {
			return purc_dpt_cd();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			return sppl_cd();
		}
		if ($sppl_cntct_dpt.equalsIgnoreCase(name)) {
			return sppl_cntct_dpt();
		}
		if ($sppl_cntct_psn.equalsIgnoreCase(name)) {
			return sppl_cntct_psn();
		}
		if ($sppl_zip_cd.equalsIgnoreCase(name)) {
			return sppl_zip_cd();
		}
		if ($sppl_addr1.equalsIgnoreCase(name)) {
			return sppl_addr1();
		}
		if ($sppl_addr2.equalsIgnoreCase(name)) {
			return sppl_addr2();
		}
		if ($sppl_addr3.equalsIgnoreCase(name)) {
			return sppl_addr3();
		}
		if ($sppl_addr4.equalsIgnoreCase(name)) {
			return sppl_addr4();
		}
		if ($sppl_tel.equalsIgnoreCase(name)) {
			return sppl_tel();
		}
		if ($sppl_fax.equalsIgnoreCase(name)) {
			return sppl_fax();
		}
		if ($ret_sppl_nm.equalsIgnoreCase(name)) {
			return ret_sppl_nm();
		}
		if ($ret_sppl_cntct_dpt.equalsIgnoreCase(name)) {
			return ret_sppl_cntct_dpt();
		}
		if ($ret_sppl_cntct_psn.equalsIgnoreCase(name)) {
			return ret_sppl_cntct_psn();
		}
		if ($ret_sppl_cntct_psn_title.equalsIgnoreCase(name)) {
			return ret_sppl_cntct_psn_title();
		}
		if ($ret_sppl_zip_cd.equalsIgnoreCase(name)) {
			return ret_sppl_zip_cd();
		}
		if ($ret_sppl_addr1.equalsIgnoreCase(name)) {
			return ret_sppl_addr1();
		}
		if ($ret_sppl_addr2.equalsIgnoreCase(name)) {
			return ret_sppl_addr2();
		}
		if ($ret_sppl_addr3.equalsIgnoreCase(name)) {
			return ret_sppl_addr3();
		}
		if ($ret_sppl_addr4.equalsIgnoreCase(name)) {
			return ret_sppl_addr4();
		}
		if ($ret_sppl_tel.equalsIgnoreCase(name)) {
			return ret_sppl_tel();
		}
		if ($ret_sppl_fax.equalsIgnoreCase(name)) {
			return ret_sppl_fax();
		}
		if ($rcpt_iv_no.equalsIgnoreCase(name)) {
			return rcpt_iv_no();
		}
		if ($ref_rcpt_iv_no.equalsIgnoreCase(name)) {
			return ref_rcpt_iv_no();
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
		if ($purc_ret_print_rmrks.equalsIgnoreCase(name)) {
			return purc_ret_print_rmrks();
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
		if ($purc_ret_act_rev.equalsIgnoreCase(name)) {
			return purc_ret_act_rev();
		}
		if ($last_purc_ret_print_rev.equalsIgnoreCase(name)) {
			return last_purc_ret_print_rev();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumberNE(name);
	}

	public MCDate getDateNE(String name) {
		if ($ac_dt.equalsIgnoreCase(name)) {
			return ac_dt();
		}
		if ($purc_ret_dt.equalsIgnoreCase(name)) {
			return purc_ret_dt();
		}
		if ($purc_ret_print_dt.equalsIgnoreCase(name)) {
			return purc_ret_print_dt();
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
		if ($purc_ret_print_flg.equalsIgnoreCase(name)) {
			return purc_ret_print_flg();
		}
		if ($can_flg.equalsIgnoreCase(name)) {
			return can_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($purc_ret_act_no.equalsIgnoreCase(name)) {
			purc_ret_act_no(value);
			return;
		}
		if ($purc_ret_schd_no.equalsIgnoreCase(name)) {
			purc_ret_schd_no(value);
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
		if ($purc_usr_cd.equalsIgnoreCase(name)) {
			purc_usr_cd(value);
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
		if ($sppl_cd.equalsIgnoreCase(name)) {
			sppl_cd(value);
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
		if ($sppl_zip_cd.equalsIgnoreCase(name)) {
			sppl_zip_cd(value);
			return;
		}
		if ($sppl_addr1.equalsIgnoreCase(name)) {
			sppl_addr1(value);
			return;
		}
		if ($sppl_addr2.equalsIgnoreCase(name)) {
			sppl_addr2(value);
			return;
		}
		if ($sppl_addr3.equalsIgnoreCase(name)) {
			sppl_addr3(value);
			return;
		}
		if ($sppl_addr4.equalsIgnoreCase(name)) {
			sppl_addr4(value);
			return;
		}
		if ($sppl_tel.equalsIgnoreCase(name)) {
			sppl_tel(value);
			return;
		}
		if ($sppl_fax.equalsIgnoreCase(name)) {
			sppl_fax(value);
			return;
		}
		if ($ret_sppl_nm.equalsIgnoreCase(name)) {
			ret_sppl_nm(value);
			return;
		}
		if ($ret_sppl_cntct_dpt.equalsIgnoreCase(name)) {
			ret_sppl_cntct_dpt(value);
			return;
		}
		if ($ret_sppl_cntct_psn.equalsIgnoreCase(name)) {
			ret_sppl_cntct_psn(value);
			return;
		}
		if ($ret_sppl_cntct_psn_title.equalsIgnoreCase(name)) {
			ret_sppl_cntct_psn_title(value);
			return;
		}
		if ($ret_sppl_zip_cd.equalsIgnoreCase(name)) {
			ret_sppl_zip_cd(value);
			return;
		}
		if ($ret_sppl_addr1.equalsIgnoreCase(name)) {
			ret_sppl_addr1(value);
			return;
		}
		if ($ret_sppl_addr2.equalsIgnoreCase(name)) {
			ret_sppl_addr2(value);
			return;
		}
		if ($ret_sppl_addr3.equalsIgnoreCase(name)) {
			ret_sppl_addr3(value);
			return;
		}
		if ($ret_sppl_addr4.equalsIgnoreCase(name)) {
			ret_sppl_addr4(value);
			return;
		}
		if ($ret_sppl_tel.equalsIgnoreCase(name)) {
			ret_sppl_tel(value);
			return;
		}
		if ($ret_sppl_fax.equalsIgnoreCase(name)) {
			ret_sppl_fax(value);
			return;
		}
		if ($rcpt_iv_no.equalsIgnoreCase(name)) {
			rcpt_iv_no(value);
			return;
		}
		if ($ref_rcpt_iv_no.equalsIgnoreCase(name)) {
			ref_rcpt_iv_no(value);
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
		if ($purc_ret_print_rmrks.equalsIgnoreCase(name)) {
			purc_ret_print_rmrks(value);
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
		if ($purc_ret_act_rev.equalsIgnoreCase(name)) {
			purc_ret_act_rev(value);
			return;
		}
		if ($last_purc_ret_print_rev.equalsIgnoreCase(name)) {
			last_purc_ret_print_rev(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, int value) {
		if ($purc_ret_act_rev.equalsIgnoreCase(name)) {
			purc_ret_act_rev(value);
			return;
		}
		if ($last_purc_ret_print_rev.equalsIgnoreCase(name)) {
			last_purc_ret_print_rev(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, long value) {
		if ($purc_ret_act_rev.equalsIgnoreCase(name)) {
			purc_ret_act_rev(value);
			return;
		}
		if ($last_purc_ret_print_rev.equalsIgnoreCase(name)) {
			last_purc_ret_print_rev(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, float value) {
		if ($purc_ret_act_rev.equalsIgnoreCase(name)) {
			purc_ret_act_rev(value);
			return;
		}
		if ($last_purc_ret_print_rev.equalsIgnoreCase(name)) {
			last_purc_ret_print_rev(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, double value) {
		if ($purc_ret_act_rev.equalsIgnoreCase(name)) {
			purc_ret_act_rev(value);
			return;
		}
		if ($last_purc_ret_print_rev.equalsIgnoreCase(name)) {
			last_purc_ret_print_rev(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setDate(String name, MCDate value) {
		if ($ac_dt.equalsIgnoreCase(name)) {
			ac_dt(value);
			return;
		}
		if ($purc_ret_dt.equalsIgnoreCase(name)) {
			purc_ret_dt(value);
			return;
		}
		if ($purc_ret_print_dt.equalsIgnoreCase(name)) {
			purc_ret_print_dt(value);
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
		if ($purc_ret_print_flg.equalsIgnoreCase(name)) {
			purc_ret_print_flg(value);
			return;
		}
		if ($can_flg.equalsIgnoreCase(name)) {
			can_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($purc_ret_act_no.equalsIgnoreCase(name)) {
			purc_ret_act_no(value);
			return;
		}
		if ($purc_ret_schd_no.equalsIgnoreCase(name)) {
			purc_ret_schd_no(value);
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
		if ($purc_usr_cd.equalsIgnoreCase(name)) {
			purc_usr_cd(value);
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
		if ($sppl_cd.equalsIgnoreCase(name)) {
			sppl_cd(value);
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
		if ($sppl_zip_cd.equalsIgnoreCase(name)) {
			sppl_zip_cd(value);
			return;
		}
		if ($sppl_addr1.equalsIgnoreCase(name)) {
			sppl_addr1(value);
			return;
		}
		if ($sppl_addr2.equalsIgnoreCase(name)) {
			sppl_addr2(value);
			return;
		}
		if ($sppl_addr3.equalsIgnoreCase(name)) {
			sppl_addr3(value);
			return;
		}
		if ($sppl_addr4.equalsIgnoreCase(name)) {
			sppl_addr4(value);
			return;
		}
		if ($sppl_tel.equalsIgnoreCase(name)) {
			sppl_tel(value);
			return;
		}
		if ($sppl_fax.equalsIgnoreCase(name)) {
			sppl_fax(value);
			return;
		}
		if ($ret_sppl_nm.equalsIgnoreCase(name)) {
			ret_sppl_nm(value);
			return;
		}
		if ($ret_sppl_cntct_dpt.equalsIgnoreCase(name)) {
			ret_sppl_cntct_dpt(value);
			return;
		}
		if ($ret_sppl_cntct_psn.equalsIgnoreCase(name)) {
			ret_sppl_cntct_psn(value);
			return;
		}
		if ($ret_sppl_cntct_psn_title.equalsIgnoreCase(name)) {
			ret_sppl_cntct_psn_title(value);
			return;
		}
		if ($ret_sppl_zip_cd.equalsIgnoreCase(name)) {
			ret_sppl_zip_cd(value);
			return;
		}
		if ($ret_sppl_addr1.equalsIgnoreCase(name)) {
			ret_sppl_addr1(value);
			return;
		}
		if ($ret_sppl_addr2.equalsIgnoreCase(name)) {
			ret_sppl_addr2(value);
			return;
		}
		if ($ret_sppl_addr3.equalsIgnoreCase(name)) {
			ret_sppl_addr3(value);
			return;
		}
		if ($ret_sppl_addr4.equalsIgnoreCase(name)) {
			ret_sppl_addr4(value);
			return;
		}
		if ($ret_sppl_tel.equalsIgnoreCase(name)) {
			ret_sppl_tel(value);
			return;
		}
		if ($ret_sppl_fax.equalsIgnoreCase(name)) {
			ret_sppl_fax(value);
			return;
		}
		if ($rcpt_iv_no.equalsIgnoreCase(name)) {
			rcpt_iv_no(value);
			return;
		}
		if ($ref_rcpt_iv_no.equalsIgnoreCase(name)) {
			ref_rcpt_iv_no(value);
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
		if ($purc_ret_print_rmrks.equalsIgnoreCase(name)) {
			purc_ret_print_rmrks(value);
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
		if ($purc_ret_act_rev.equalsIgnoreCase(name)) {
			purc_ret_act_rev(value);
			return;
		}
		if ($last_purc_ret_print_rev.equalsIgnoreCase(name)) {
			last_purc_ret_print_rev(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, int value) {
		if ($purc_ret_act_rev.equalsIgnoreCase(name)) {
			purc_ret_act_rev(value);
			return;
		}
		if ($last_purc_ret_print_rev.equalsIgnoreCase(name)) {
			last_purc_ret_print_rev(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, long value) {
		if ($purc_ret_act_rev.equalsIgnoreCase(name)) {
			purc_ret_act_rev(value);
			return;
		}
		if ($last_purc_ret_print_rev.equalsIgnoreCase(name)) {
			last_purc_ret_print_rev(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, float value) {
		if ($purc_ret_act_rev.equalsIgnoreCase(name)) {
			purc_ret_act_rev(value);
			return;
		}
		if ($last_purc_ret_print_rev.equalsIgnoreCase(name)) {
			last_purc_ret_print_rev(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, double value) {
		if ($purc_ret_act_rev.equalsIgnoreCase(name)) {
			purc_ret_act_rev(value);
			return;
		}
		if ($last_purc_ret_print_rev.equalsIgnoreCase(name)) {
			last_purc_ret_print_rev(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setDateNE(String name, MCDate value) {
		if ($ac_dt.equalsIgnoreCase(name)) {
			ac_dt(value);
			return;
		}
		if ($purc_ret_dt.equalsIgnoreCase(name)) {
			purc_ret_dt(value);
			return;
		}
		if ($purc_ret_print_dt.equalsIgnoreCase(name)) {
			purc_ret_print_dt(value);
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
		if ($purc_ret_print_flg.equalsIgnoreCase(name)) {
			purc_ret_print_flg(value);
			return;
		}
		if ($can_flg.equalsIgnoreCase(name)) {
			can_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

}
