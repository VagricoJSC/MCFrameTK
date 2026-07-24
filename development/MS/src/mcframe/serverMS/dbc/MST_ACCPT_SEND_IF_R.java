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
 * "検収送信ＩＦ // Acceptance export IF"DBコンテナRowクラスです。<p>
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
 *  	<td>bp_dlv_slip_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>業者納品書ＮＯ</td>
 *  	<td>Vendor delivery note No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>bp_dlv_slip_lno</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>業者納品書行ＮＯ</td>
 *  	<td>Vendor delivery note row No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>iv_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>インボイスＦＬＧ</td>
 *  	<td>Invoice flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>abort_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>打切ＦＬＧ</td>
 *  	<td>Cancel remaining flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>cntry_cd</td>
 *  	<td>C</td>
 *  	<td>2</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>国ＣＤ</td>
 *  	<td>Country cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>if_cntry_cd</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ国ＣＤ</td>
 *  	<td>IF country cd.</td>
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
 *  	<td>if_purc_dpt_cd</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ購買部門ＣＤ</td>
 *  	<td>IF purchasing dept. cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>purc_dpt_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>購買部門名</td>
 *  	<td>Purchasing dept. name</td>
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
 *  	<td>if_purc_usr_cd</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ購買担当者ＣＤ</td>
 *  	<td>IF purchasing PIC cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>purc_usr_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>購買担当者名</td>
 *  	<td>Purchasing PIC name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>wg_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ワーキンググループＣＤ</td>
 *  	<td>WG cd.</td>
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
 *  	<td>if_sppl_cd</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ発注先ＣＤ</td>
 *  	<td>IF supplier cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sppl_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>発注先名</td>
 *  	<td>Supplier name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sppl_cntry_cd</td>
 *  	<td>C</td>
 *  	<td>2</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>発注先国ＣＤ</td>
 *  	<td>Supplier country cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>if_sppl_cntry_cd</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ発注先国ＣＤ</td>
 *  	<td>IF supplier country cd.</td>
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
 *  	<td>red_slip_ac_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>赤伝計上日</td>
 *  	<td>Credit voucher recording date</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>red_slip_ac_ym</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>赤伝計上年月</td>
 *  	<td>Credit voucher recording month</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>pay_schd_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>支払予定日</td>
 *  	<td>Scheduled payment date</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>in_to_id_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>納入先識別区分</td>
 *  	<td>Delivery destination identification type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>in_to_id_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>納入先識別ＣＤ</td>
 *  	<td>Delivery destination identification cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>if_in_to_id_cd</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ納入先識別ＣＤ</td>
 *  	<td>IF delivery destination identification cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>in_to_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>納入先名</td>
 *  	<td>Delivery destination name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>in_to_zip_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>納入先郵便番号</td>
 *  	<td>Delivery destination zip code</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>in_to_addr1</td>
 *  	<td>C</td>
 *  	<td>250</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>納入先住所１</td>
 *  	<td>Delivery destination address1</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>in_to_addr2</td>
 *  	<td>C</td>
 *  	<td>250</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>納入先住所２</td>
 *  	<td>Delivery destination address2</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>in_to_addr3</td>
 *  	<td>C</td>
 *  	<td>250</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>納入先住所３</td>
 *  	<td>Delivery destination address3</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>in_to_addr4</td>
 *  	<td>C</td>
 *  	<td>250</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>納入先住所４</td>
 *  	<td>Delivery destination address4</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>in_to_cntct_dpt</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>納入先担当部署</td>
 *  	<td>Delivery destination dept. in charge</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>in_to_cntct_psn</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>納入先担当者</td>
 *  	<td>Delivery destination PIC</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>in_to_tel</td>
 *  	<td>C</td>
 *  	<td>30</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>納入先ＴＥＬ</td>
 *  	<td>Delivery destination TEL</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>in_to_fax</td>
 *  	<td>C</td>
 *  	<td>30</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>納入先ＦＡＸ</td>
 *  	<td>Delivery destination FAX</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>in_to_sundry_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>納入先諸口ＦＬＧ</td>
 *  	<td>Miscellaneous delivery destination flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>in_to_cntry_cd</td>
 *  	<td>C</td>
 *  	<td>2</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>納入先国ＣＤ</td>
 *  	<td>Delivery destination country cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>if_in_to_cntry_cd</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ納入先国ＣＤ</td>
 *  	<td>IF delivery destination country cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>tdlv_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>配送先ＣＤ</td>
 *  	<td>Receiving point cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>if_tdlv_cd</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ配送先ＣＤ</td>
 *  	<td>IF receiving point cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>tdlv_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>配送先名</td>
 *  	<td>Receiving point name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>tdlv_zip_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>配送先郵便番号</td>
 *  	<td>Receiving point zip code</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>tdlv_addr1</td>
 *  	<td>C</td>
 *  	<td>250</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>配送先住所１</td>
 *  	<td>Receiving point address 1</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>tdlv_addr2</td>
 *  	<td>C</td>
 *  	<td>250</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>配送先住所２</td>
 *  	<td>Receiving point address 2</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>tdlv_addr3</td>
 *  	<td>C</td>
 *  	<td>250</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>配送先住所３</td>
 *  	<td>Receiving point address 3</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>tdlv_addr4</td>
 *  	<td>C</td>
 *  	<td>250</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>配送先住所４</td>
 *  	<td>Receiving point address 4</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>tdlv_cntct_dpt</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>配送先担当部署</td>
 *  	<td>Delivery destination dept.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>tdlv_cntct_psn</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>配送先担当者</td>
 *  	<td>Receiving point PIC</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>tdlv_tel</td>
 *  	<td>C</td>
 *  	<td>30</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>配送先ＴＥＬ</td>
 *  	<td>Receiving point TEL</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>tdlv_fax</td>
 *  	<td>C</td>
 *  	<td>30</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>配送先ＦＡＸ</td>
 *  	<td>Receiving point FAX</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>tdlv_sundry_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>配送先諸口ＦＬＧ</td>
 *  	<td>Miscellaneous receiving point flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>tdlv_cntry_cd</td>
 *  	<td>C</td>
 *  	<td>2</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>配送先国ＣＤ</td>
 *  	<td>Receiving point country cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>if_tdlv_cntry_cd</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ配送先国ＣＤ</td>
 *  	<td>IF receiving point country cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>site_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>工場・物流倉庫ＣＤ</td>
 *  	<td>Factory/Distribution warehouse cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>if_site_cd</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ工場・物流倉庫ＣＤ</td>
 *  	<td>IF factory/distribution warehouse cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>site_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>工場・物流倉庫名</td>
 *  	<td>Factory/Distribution warehouse name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>drct_dlv_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>直送ＦＬＧ</td>
 *  	<td>Direct-delivery flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>drct_dlv_bp_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>直送先会社ＣＤ</td>
 *  	<td>Direct-delivery destination company cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>if_drct_dlv_bp_cd</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ直送先会社ＣＤ</td>
 *  	<td>IF direct-delivery destination company cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>drct_dlv_bp_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>直送先会社名</td>
 *  	<td>Direct-delivery destination company name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>drct_dlv_cntry_cd</td>
 *  	<td>C</td>
 *  	<td>2</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>直送先国ＣＤ</td>
 *  	<td>Direct-delivery destination country cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>if_drct_dlv_cntry_cd</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ直送先国ＣＤ</td>
 *  	<td>IF direct-delivery destination country</td>
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
 *  	<td>if_tterm_cd1</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ取引条件ＣＤ１</td>
 *  	<td>IF transaction terms cd. 1</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>tterm_nm1</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引条件名１</td>
 *  	<td>Transaction terms name 1</td>
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
 *  	<td>if_tterm_cd2</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ取引条件ＣＤ２</td>
 *  	<td>IF transaction terms cd. 2</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>tterm_nm2</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引条件名２</td>
 *  	<td>Transaction terms name 2</td>
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
 *  	<td>if_tterm_cd3</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ取引条件ＣＤ３</td>
 *  	<td>IF transaction terms cd. 3</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>tterm_nm3</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引条件名３</td>
 *  	<td>Transaction terms name 3</td>
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
 *  	<td>itm_cd</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>品目ＣＤ</td>
 *  	<td>Item cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>itm_sub1</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>枝番１</td>
 *  	<td>Branch No. 1</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>itm_sub2</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>枝番２</td>
 *  	<td>Branch No. 2</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>itm_sub3</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>枝番３</td>
 *  	<td>Branch No. 3</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>if_itm_cd</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ品目ＣＤ</td>
 *  	<td>IF item cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>if_itm_sub1</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ枝番１</td>
 *  	<td>IF branch No. 1</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>if_itm_sub2</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ枝番２</td>
 *  	<td>IF branch No. 2</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>if_itm_sub3</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ枝番３</td>
 *  	<td>IF branch No. 3</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sundry_itm_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>諸口品ＦＬＧ</td>
 *  	<td>Miscellaneous item flg.</td>
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
 *  	<td>iv_itm_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>インボイス表記品名</td>
 *  	<td>Item name for invoice</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sppl_itm_cd</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>発注先品目ＣＤ</td>
 *  	<td>Supplier item cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sppl_itm_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>発注先品名</td>
 *  	<td>Supplier item name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>bp_lot_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>業者ロットＮＯ</td>
 *  	<td>Vendor lot No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>trd_unit_cd</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>N</td>
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
 *  	<td>trd_cur_upri</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引通貨単価</td>
 *  	<td>Unit price (Transaction currency)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>trd_cur_amt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引通貨金額</td>
 *  	<td>Amount (Transaction currency)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>trd_cur_dscnt_amt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引通貨値引額</td>
 *  	<td>Discount amount (Transaction currency)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>dscnt_rsn_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>値引理由ＣＤ</td>
 *  	<td>Discount reason cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>if_dscnt_rsn_cd</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ値引理由ＣＤ</td>
 *  	<td>IF discount reason cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>dscnt_rsn_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>値引理由名</td>
 *  	<td>Discount reason name</td>
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
 *  	<td>tax_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>税区分</td>
 *  	<td>Tax type</td>
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
 *  	<td>tax_cd</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>税ＣＤ</td>
 *  	<td>Tax cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>if_tax_cd</td>
 *  	<td>C</td>
 *  	<td>500</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＩＦ税ＣＤ</td>
 *  	<td>IF tax cd.</td>
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
 *  <tr >
 *  	<td>C</td>
 *  	<td>tax_rate</td>
 *  	<td>N</td>
 *  	<td>5,2</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>税率</td>
 *  	<td>Tax rate</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>trd_cur_tax_amt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引通貨税額</td>
 *  	<td>Tax amount (Transaction currency)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>wtax_rate</td>
 *  	<td>N</td>
 *  	<td>5,2</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>源泉税率</td>
 *  	<td>Withholding tax rate</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>wtax_amt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>源泉税額</td>
 *  	<td>Withholding tax</td>
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
 *  	<td>accpt_dfct_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>検収不良ＦＬＧ</td>
 *  	<td>Acceptance defective flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>purc_act_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>仕入実績ＮＯ</td>
 *  	<td>Purchase result No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>purc_act_rev</td>
 *  	<td>N</td>
 *  	<td>4,0</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>仕入実績改訂番号</td>
 *  	<td>Purchase result rev. number</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>purc_act_d_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>仕入実績明細ＮＯ</td>
 *  	<td>Purchase result details No.</td>
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
 *  	<td>co_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>会社名</td>
 *  	<td>Company name</td>
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
 *  	<td>sub_char1</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＣＨＡＲ項目１</td>
 *  	<td>Spare CHAR column 1</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sub_char2</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＣＨＡＲ項目２</td>
 *  	<td>Spare CHAR column 2</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sub_char3</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＣＨＡＲ項目３</td>
 *  	<td>Spare CHAR column 3</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sub_char4</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＣＨＡＲ項目４</td>
 *  	<td>Spare CHAR column 4</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sub_char5</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＣＨＡＲ項目５</td>
 *  	<td>Spare CHAR column 5</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sub_char6</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＣＨＡＲ項目６</td>
 *  	<td>Spare CHAR column 6</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sub_char7</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＣＨＡＲ項目７</td>
 *  	<td>Spare CHAR column 7</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sub_char8</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＣＨＡＲ項目８</td>
 *  	<td>Spare CHAR column 8</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sub_char9</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＣＨＡＲ項目９</td>
 *  	<td>Spare CHAR column 9</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sub_char10</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＣＨＡＲ項目１０</td>
 *  	<td>Spare CHAR column 10</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sub_char11</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＣＨＡＲ項目１１</td>
 *  	<td>Spare CHAR column 11</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sub_char12</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＣＨＡＲ項目１２</td>
 *  	<td>Spare CHAR column 12</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sub_char13</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＣＨＡＲ項目１３</td>
 *  	<td>Spare CHAR column 13</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sub_char14</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＣＨＡＲ項目１４</td>
 *  	<td>Spare CHAR column 14</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sub_char15</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＣＨＡＲ項目１５</td>
 *  	<td>Spare CHAR column 15</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sub_char16</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＣＨＡＲ項目１６</td>
 *  	<td>Spare CHAR column 16</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sub_char17</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＣＨＡＲ項目１７</td>
 *  	<td>Spare CHAR column 17</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sub_char18</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＣＨＡＲ項目１８</td>
 *  	<td>Spare CHAR column 18</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sub_char19</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＣＨＡＲ項目１９</td>
 *  	<td>Spare CHAR column 19</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sub_char20</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＣＨＡＲ項目２０</td>
 *  	<td>Spare CHAR column 20</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sub_char21</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＣＨＡＲ項目２１</td>
 *  	<td>Spare CHAR column 21</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sub_char22</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＣＨＡＲ項目２２</td>
 *  	<td>Spare CHAR column 22</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sub_char23</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＣＨＡＲ項目２３</td>
 *  	<td>Spare CHAR column 23</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sub_char24</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＣＨＡＲ項目２４</td>
 *  	<td>Spare CHAR column 24</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sub_char25</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＣＨＡＲ項目２５</td>
 *  	<td>Spare CHAR column 25</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sub_char26</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＣＨＡＲ項目２６</td>
 *  	<td>Spare CHAR column 26</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sub_char27</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＣＨＡＲ項目２７</td>
 *  	<td>Spare CHAR column 27</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sub_char28</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＣＨＡＲ項目２８</td>
 *  	<td>Spare CHAR column 28</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sub_char29</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＣＨＡＲ項目２９</td>
 *  	<td>Spare CHAR column 29</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sub_char30</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＣＨＡＲ項目３０</td>
 *  	<td>Spare CHAR column 30</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sub_num1</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＮＵＭ項目１</td>
 *  	<td>Spare NUM column 1</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sub_num2</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＮＵＭ項目２</td>
 *  	<td>Spare NUM column 2</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sub_num3</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＮＵＭ項目３</td>
 *  	<td>Spare NUM column 3</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sub_num4</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＮＵＭ項目４</td>
 *  	<td>Spare NUM column 4</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sub_num5</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＮＵＭ項目５</td>
 *  	<td>Spare NUM column 5</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sub_dt1</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＤＡＴＥ項目１</td>
 *  	<td>Spare DATE column 1</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sub_dt2</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＤＡＴＥ項目２</td>
 *  	<td>Spare DATE column 2</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sub_dt3</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＤＡＴＥ項目３</td>
 *  	<td>Spare DATE column 3</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sub_dt4</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＤＡＴＥ項目４</td>
 *  	<td>Spare DATE column 4</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sub_dt5</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>予備ＤＡＴＥ項目５</td>
 *  	<td>Spare DATE column 5</td>
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
 *  	<td>sppl_cntry_nm</td>
 *  	<td>C</td>
 *  	<td>60</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>発注先国名</td>
 *  	<td>Supplier country name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>in_to_cntry_nm</td>
 *  	<td>C</td>
 *  	<td>60</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>納入先国名</td>
 *  	<td>Delivery destination country name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>tdlv_cntry_nm</td>
 *  	<td>C</td>
 *  	<td>60</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>配送先国名</td>
 *  	<td>Receiving point country name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>drct_dlv_cntry_nm</td>
 *  	<td>C</td>
 *  	<td>60</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>直送先国名</td>
 *  	<td>Direct-delivery destination country name</td>
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
 *  	<td>wg_nm</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ワーキンググループ名</td>
 *  	<td>WG name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>cntry_nm</td>
 *  	<td>C</td>
 *  	<td>60</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>国名</td>
 *  	<td>Country name</td>
 *  </tr>
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
public class MST_ACCPT_SEND_IF_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.CO_VIEW;

	public static final String TABLE_NAME = "MST_ACCPT_SEND_IF";

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
	 * 業者納品書ＮＯ. Vendor delivery note No..<p>
	 *
	 */
	public static final String $bp_dlv_slip_no = "bp_dlv_slip_no";
	private static final MCPermColumnInfo _bp_dlv_slip_no = createColumnInfo("bp_dlv_slip_no");
	public final MCStringPermColumn bp_dlv_slip_no = createStringColumn(_bp_dlv_slip_no);
	
	/**
	 * 業者納品書行ＮＯ. Vendor delivery note row No..<p>
	 *
	 */
	public static final String $bp_dlv_slip_lno = "bp_dlv_slip_lno";
	private static final MCPermColumnInfo _bp_dlv_slip_lno = createColumnInfo("bp_dlv_slip_lno");
	public final MCStringPermColumn bp_dlv_slip_lno = createStringColumn(_bp_dlv_slip_lno);
	
	/**
	 * インボイスＦＬＧ. Invoice flg..<p>
	 *
	 */
	public static final String $iv_flg = "iv_flg";
	private static final MCPermColumnInfo _iv_flg = createColumnInfo("iv_flg");
	public final MCBooleanPermColumn iv_flg = createBooleanColumn(_iv_flg);
	
	/**
	 * 打切ＦＬＧ. Cancel remaining flg..<p>
	 *
	 */
	public static final String $abort_flg = "abort_flg";
	private static final MCPermColumnInfo _abort_flg = createColumnInfo("abort_flg");
	public final MCBooleanPermColumn abort_flg = createBooleanColumn(_abort_flg);
	
	/**
	 * 国ＣＤ. Country cd..<p>
	 *
	 */
	public static final String $cntry_cd = "cntry_cd";
	private static final MCPermColumnInfo _cntry_cd = createColumnInfo("cntry_cd");
	public final MCStringPermColumn cntry_cd = createStringColumn(_cntry_cd);
	
	/**
	 * ＩＦ国ＣＤ. IF country cd..<p>
	 *
	 */
	public static final String $if_cntry_cd = "if_cntry_cd";
	private static final MCPermColumnInfo _if_cntry_cd = createColumnInfo("if_cntry_cd");
	public final MCStringPermColumn if_cntry_cd = createStringColumn(_if_cntry_cd);
	
	/**
	 * 購買部門ＣＤ. Purchasing dept. cd..<p>
	 *
	 */
	public static final String $purc_dpt_cd = "purc_dpt_cd";
	private static final MCPermColumnInfo _purc_dpt_cd = createColumnInfo("purc_dpt_cd");
	public final MCStringPermColumn purc_dpt_cd = createStringColumn(_purc_dpt_cd);
	
	/**
	 * ＩＦ購買部門ＣＤ. IF purchasing dept. cd..<p>
	 *
	 */
	public static final String $if_purc_dpt_cd = "if_purc_dpt_cd";
	private static final MCPermColumnInfo _if_purc_dpt_cd = createColumnInfo("if_purc_dpt_cd");
	public final MCStringPermColumn if_purc_dpt_cd = createStringColumn(_if_purc_dpt_cd);
	
	/**
	 * 購買部門名. Purchasing dept. name.<p>
	 *
	 */
	public static final String $purc_dpt_nm = "purc_dpt_nm";
	private static final MCPermColumnInfo _purc_dpt_nm = createColumnInfo("purc_dpt_nm");
	public final MCStringPermColumn purc_dpt_nm = createStringColumn(_purc_dpt_nm);
	
	/**
	 * 購買担当者ＣＤ. Purchasing PIC cd..<p>
	 *
	 */
	public static final String $purc_usr_cd = "purc_usr_cd";
	private static final MCPermColumnInfo _purc_usr_cd = createColumnInfo("purc_usr_cd");
	public final MCStringPermColumn purc_usr_cd = createStringColumn(_purc_usr_cd);
	
	/**
	 * ＩＦ購買担当者ＣＤ. IF purchasing PIC cd..<p>
	 *
	 */
	public static final String $if_purc_usr_cd = "if_purc_usr_cd";
	private static final MCPermColumnInfo _if_purc_usr_cd = createColumnInfo("if_purc_usr_cd");
	public final MCStringPermColumn if_purc_usr_cd = createStringColumn(_if_purc_usr_cd);
	
	/**
	 * 購買担当者名. Purchasing PIC name.<p>
	 *
	 */
	public static final String $purc_usr_nm = "purc_usr_nm";
	private static final MCPermColumnInfo _purc_usr_nm = createColumnInfo("purc_usr_nm");
	public final MCStringPermColumn purc_usr_nm = createStringColumn(_purc_usr_nm);
	
	/**
	 * ワーキンググループＣＤ. WG cd..<p>
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
	 * ＩＦ発注先ＣＤ. IF supplier cd..<p>
	 *
	 */
	public static final String $if_sppl_cd = "if_sppl_cd";
	private static final MCPermColumnInfo _if_sppl_cd = createColumnInfo("if_sppl_cd");
	public final MCStringPermColumn if_sppl_cd = createStringColumn(_if_sppl_cd);
	
	/**
	 * 発注先名. Supplier name.<p>
	 *
	 */
	public static final String $sppl_nm = "sppl_nm";
	private static final MCPermColumnInfo _sppl_nm = createColumnInfo("sppl_nm");
	public final MCStringPermColumn sppl_nm = createStringColumn(_sppl_nm);
	
	/**
	 * 発注先国ＣＤ. Supplier country cd..<p>
	 *
	 */
	public static final String $sppl_cntry_cd = "sppl_cntry_cd";
	private static final MCPermColumnInfo _sppl_cntry_cd = createColumnInfo("sppl_cntry_cd");
	public final MCStringPermColumn sppl_cntry_cd = createStringColumn(_sppl_cntry_cd);
	
	/**
	 * ＩＦ発注先国ＣＤ. IF supplier country cd..<p>
	 *
	 */
	public static final String $if_sppl_cntry_cd = "if_sppl_cntry_cd";
	private static final MCPermColumnInfo _if_sppl_cntry_cd = createColumnInfo("if_sppl_cntry_cd");
	public final MCStringPermColumn if_sppl_cntry_cd = createStringColumn(_if_sppl_cntry_cd);
	
	/**
	 * 計上日. Recording date.<p>
	 *
	 */
	public static final String $ac_dt = "ac_dt";
	private static final MCPermColumnInfo _ac_dt = createColumnInfo("ac_dt");
	public final MCDatePermColumn ac_dt = createDateColumn(_ac_dt);
	
	/**
	 * 計上年月. Recording month.<p>
	 *
	 */
	public static final String $ac_ym = "ac_ym";
	private static final MCPermColumnInfo _ac_ym = createColumnInfo("ac_ym");
	public final MCDatePermColumn ac_ym = createDateColumn(_ac_ym);
	
	/**
	 * 仕入日. Purchase date.<p>
	 *
	 */
	public static final String $purc_dt = "purc_dt";
	private static final MCPermColumnInfo _purc_dt = createColumnInfo("purc_dt");
	public final MCDatePermColumn purc_dt = createDateColumn(_purc_dt);
	
	/**
	 * 赤伝計上日. Credit voucher recording date.<p>
	 *
	 */
	public static final String $red_slip_ac_dt = "red_slip_ac_dt";
	private static final MCPermColumnInfo _red_slip_ac_dt = createColumnInfo("red_slip_ac_dt");
	public final MCDatePermColumn red_slip_ac_dt = createDateColumn(_red_slip_ac_dt);
	
	/**
	 * 赤伝計上年月. Credit voucher recording month.<p>
	 *
	 */
	public static final String $red_slip_ac_ym = "red_slip_ac_ym";
	private static final MCPermColumnInfo _red_slip_ac_ym = createColumnInfo("red_slip_ac_ym");
	public final MCDatePermColumn red_slip_ac_ym = createDateColumn(_red_slip_ac_ym);
	
	/**
	 * 支払予定日. Scheduled payment date.<p>
	 *
	 */
	public static final String $pay_schd_dt = "pay_schd_dt";
	private static final MCPermColumnInfo _pay_schd_dt = createColumnInfo("pay_schd_dt");
	public final MCDatePermColumn pay_schd_dt = createDateColumn(_pay_schd_dt);
	
	/**
	 * 納入先識別区分. Delivery destination identification type.<p>
	 *
	 */
	public static final String $in_to_id_typ = "in_to_id_typ";
	private static final MCPermColumnInfo _in_to_id_typ = createColumnInfo("in_to_id_typ");
	public final MCStringPermColumn in_to_id_typ = createStringColumn(_in_to_id_typ);
	
	/**
	 * 納入先識別ＣＤ. Delivery destination identification cd..<p>
	 *
	 */
	public static final String $in_to_id_cd = "in_to_id_cd";
	private static final MCPermColumnInfo _in_to_id_cd = createColumnInfo("in_to_id_cd");
	public final MCStringPermColumn in_to_id_cd = createStringColumn(_in_to_id_cd);
	
	/**
	 * ＩＦ納入先識別ＣＤ. IF delivery destination identification cd..<p>
	 *
	 */
	public static final String $if_in_to_id_cd = "if_in_to_id_cd";
	private static final MCPermColumnInfo _if_in_to_id_cd = createColumnInfo("if_in_to_id_cd");
	public final MCStringPermColumn if_in_to_id_cd = createStringColumn(_if_in_to_id_cd);
	
	/**
	 * 納入先名. Delivery destination name.<p>
	 *
	 */
	public static final String $in_to_nm = "in_to_nm";
	private static final MCPermColumnInfo _in_to_nm = createColumnInfo("in_to_nm");
	public final MCStringPermColumn in_to_nm = createStringColumn(_in_to_nm);
	
	/**
	 * 納入先郵便番号. Delivery destination zip code.<p>
	 *
	 */
	public static final String $in_to_zip_cd = "in_to_zip_cd";
	private static final MCPermColumnInfo _in_to_zip_cd = createColumnInfo("in_to_zip_cd");
	public final MCStringPermColumn in_to_zip_cd = createStringColumn(_in_to_zip_cd);
	
	/**
	 * 納入先住所１. Delivery destination address1.<p>
	 *
	 */
	public static final String $in_to_addr1 = "in_to_addr1";
	private static final MCPermColumnInfo _in_to_addr1 = createColumnInfo("in_to_addr1");
	public final MCStringPermColumn in_to_addr1 = createStringColumn(_in_to_addr1);
	
	/**
	 * 納入先住所２. Delivery destination address2.<p>
	 *
	 */
	public static final String $in_to_addr2 = "in_to_addr2";
	private static final MCPermColumnInfo _in_to_addr2 = createColumnInfo("in_to_addr2");
	public final MCStringPermColumn in_to_addr2 = createStringColumn(_in_to_addr2);
	
	/**
	 * 納入先住所３. Delivery destination address3.<p>
	 *
	 */
	public static final String $in_to_addr3 = "in_to_addr3";
	private static final MCPermColumnInfo _in_to_addr3 = createColumnInfo("in_to_addr3");
	public final MCStringPermColumn in_to_addr3 = createStringColumn(_in_to_addr3);
	
	/**
	 * 納入先住所４. Delivery destination address4.<p>
	 *
	 */
	public static final String $in_to_addr4 = "in_to_addr4";
	private static final MCPermColumnInfo _in_to_addr4 = createColumnInfo("in_to_addr4");
	public final MCStringPermColumn in_to_addr4 = createStringColumn(_in_to_addr4);
	
	/**
	 * 納入先担当部署. Delivery destination dept. in charge.<p>
	 *
	 */
	public static final String $in_to_cntct_dpt = "in_to_cntct_dpt";
	private static final MCPermColumnInfo _in_to_cntct_dpt = createColumnInfo("in_to_cntct_dpt");
	public final MCStringPermColumn in_to_cntct_dpt = createStringColumn(_in_to_cntct_dpt);
	
	/**
	 * 納入先担当者. Delivery destination PIC.<p>
	 *
	 */
	public static final String $in_to_cntct_psn = "in_to_cntct_psn";
	private static final MCPermColumnInfo _in_to_cntct_psn = createColumnInfo("in_to_cntct_psn");
	public final MCStringPermColumn in_to_cntct_psn = createStringColumn(_in_to_cntct_psn);
	
	/**
	 * 納入先ＴＥＬ. Delivery destination TEL.<p>
	 *
	 */
	public static final String $in_to_tel = "in_to_tel";
	private static final MCPermColumnInfo _in_to_tel = createColumnInfo("in_to_tel");
	public final MCStringPermColumn in_to_tel = createStringColumn(_in_to_tel);
	
	/**
	 * 納入先ＦＡＸ. Delivery destination FAX.<p>
	 *
	 */
	public static final String $in_to_fax = "in_to_fax";
	private static final MCPermColumnInfo _in_to_fax = createColumnInfo("in_to_fax");
	public final MCStringPermColumn in_to_fax = createStringColumn(_in_to_fax);
	
	/**
	 * 納入先諸口ＦＬＧ. Miscellaneous delivery destination flg..<p>
	 *
	 */
	public static final String $in_to_sundry_flg = "in_to_sundry_flg";
	private static final MCPermColumnInfo _in_to_sundry_flg = createColumnInfo("in_to_sundry_flg");
	public final MCBooleanPermColumn in_to_sundry_flg = createBooleanColumn(_in_to_sundry_flg);
	
	/**
	 * 納入先国ＣＤ. Delivery destination country cd..<p>
	 *
	 */
	public static final String $in_to_cntry_cd = "in_to_cntry_cd";
	private static final MCPermColumnInfo _in_to_cntry_cd = createColumnInfo("in_to_cntry_cd");
	public final MCStringPermColumn in_to_cntry_cd = createStringColumn(_in_to_cntry_cd);
	
	/**
	 * ＩＦ納入先国ＣＤ. IF delivery destination country cd..<p>
	 *
	 */
	public static final String $if_in_to_cntry_cd = "if_in_to_cntry_cd";
	private static final MCPermColumnInfo _if_in_to_cntry_cd = createColumnInfo("if_in_to_cntry_cd");
	public final MCStringPermColumn if_in_to_cntry_cd = createStringColumn(_if_in_to_cntry_cd);
	
	/**
	 * 配送先ＣＤ. Receiving point cd..<p>
	 *
	 */
	public static final String $tdlv_cd = "tdlv_cd";
	private static final MCPermColumnInfo _tdlv_cd = createColumnInfo("tdlv_cd");
	public final MCStringPermColumn tdlv_cd = createStringColumn(_tdlv_cd);
	
	/**
	 * ＩＦ配送先ＣＤ. IF receiving point cd..<p>
	 *
	 */
	public static final String $if_tdlv_cd = "if_tdlv_cd";
	private static final MCPermColumnInfo _if_tdlv_cd = createColumnInfo("if_tdlv_cd");
	public final MCStringPermColumn if_tdlv_cd = createStringColumn(_if_tdlv_cd);
	
	/**
	 * 配送先名. Receiving point name.<p>
	 *
	 */
	public static final String $tdlv_nm = "tdlv_nm";
	private static final MCPermColumnInfo _tdlv_nm = createColumnInfo("tdlv_nm");
	public final MCStringPermColumn tdlv_nm = createStringColumn(_tdlv_nm);
	
	/**
	 * 配送先郵便番号. Receiving point zip code.<p>
	 *
	 */
	public static final String $tdlv_zip_cd = "tdlv_zip_cd";
	private static final MCPermColumnInfo _tdlv_zip_cd = createColumnInfo("tdlv_zip_cd");
	public final MCStringPermColumn tdlv_zip_cd = createStringColumn(_tdlv_zip_cd);
	
	/**
	 * 配送先住所１. Receiving point address 1.<p>
	 *
	 */
	public static final String $tdlv_addr1 = "tdlv_addr1";
	private static final MCPermColumnInfo _tdlv_addr1 = createColumnInfo("tdlv_addr1");
	public final MCStringPermColumn tdlv_addr1 = createStringColumn(_tdlv_addr1);
	
	/**
	 * 配送先住所２. Receiving point address 2.<p>
	 *
	 */
	public static final String $tdlv_addr2 = "tdlv_addr2";
	private static final MCPermColumnInfo _tdlv_addr2 = createColumnInfo("tdlv_addr2");
	public final MCStringPermColumn tdlv_addr2 = createStringColumn(_tdlv_addr2);
	
	/**
	 * 配送先住所３. Receiving point address 3.<p>
	 *
	 */
	public static final String $tdlv_addr3 = "tdlv_addr3";
	private static final MCPermColumnInfo _tdlv_addr3 = createColumnInfo("tdlv_addr3");
	public final MCStringPermColumn tdlv_addr3 = createStringColumn(_tdlv_addr3);
	
	/**
	 * 配送先住所４. Receiving point address 4.<p>
	 *
	 */
	public static final String $tdlv_addr4 = "tdlv_addr4";
	private static final MCPermColumnInfo _tdlv_addr4 = createColumnInfo("tdlv_addr4");
	public final MCStringPermColumn tdlv_addr4 = createStringColumn(_tdlv_addr4);
	
	/**
	 * 配送先担当部署. Delivery destination dept..<p>
	 *
	 */
	public static final String $tdlv_cntct_dpt = "tdlv_cntct_dpt";
	private static final MCPermColumnInfo _tdlv_cntct_dpt = createColumnInfo("tdlv_cntct_dpt");
	public final MCStringPermColumn tdlv_cntct_dpt = createStringColumn(_tdlv_cntct_dpt);
	
	/**
	 * 配送先担当者. Receiving point PIC.<p>
	 *
	 */
	public static final String $tdlv_cntct_psn = "tdlv_cntct_psn";
	private static final MCPermColumnInfo _tdlv_cntct_psn = createColumnInfo("tdlv_cntct_psn");
	public final MCStringPermColumn tdlv_cntct_psn = createStringColumn(_tdlv_cntct_psn);
	
	/**
	 * 配送先ＴＥＬ. Receiving point TEL.<p>
	 *
	 */
	public static final String $tdlv_tel = "tdlv_tel";
	private static final MCPermColumnInfo _tdlv_tel = createColumnInfo("tdlv_tel");
	public final MCStringPermColumn tdlv_tel = createStringColumn(_tdlv_tel);
	
	/**
	 * 配送先ＦＡＸ. Receiving point FAX.<p>
	 *
	 */
	public static final String $tdlv_fax = "tdlv_fax";
	private static final MCPermColumnInfo _tdlv_fax = createColumnInfo("tdlv_fax");
	public final MCStringPermColumn tdlv_fax = createStringColumn(_tdlv_fax);
	
	/**
	 * 配送先諸口ＦＬＧ. Miscellaneous receiving point flg..<p>
	 *
	 */
	public static final String $tdlv_sundry_flg = "tdlv_sundry_flg";
	private static final MCPermColumnInfo _tdlv_sundry_flg = createColumnInfo("tdlv_sundry_flg");
	public final MCBooleanPermColumn tdlv_sundry_flg = createBooleanColumn(_tdlv_sundry_flg);
	
	/**
	 * 配送先国ＣＤ. Receiving point country cd..<p>
	 *
	 */
	public static final String $tdlv_cntry_cd = "tdlv_cntry_cd";
	private static final MCPermColumnInfo _tdlv_cntry_cd = createColumnInfo("tdlv_cntry_cd");
	public final MCStringPermColumn tdlv_cntry_cd = createStringColumn(_tdlv_cntry_cd);
	
	/**
	 * ＩＦ配送先国ＣＤ. IF receiving point country cd..<p>
	 *
	 */
	public static final String $if_tdlv_cntry_cd = "if_tdlv_cntry_cd";
	private static final MCPermColumnInfo _if_tdlv_cntry_cd = createColumnInfo("if_tdlv_cntry_cd");
	public final MCStringPermColumn if_tdlv_cntry_cd = createStringColumn(_if_tdlv_cntry_cd);
	
	/**
	 * 工場・物流倉庫ＣＤ. Factory/Distribution warehouse cd..<p>
	 *
	 */
	public static final String $site_cd = "site_cd";
	private static final MCPermColumnInfo _site_cd = createColumnInfo("site_cd");
	public final MCStringPermColumn site_cd = createStringColumn(_site_cd);
	
	/**
	 * ＩＦ工場・物流倉庫ＣＤ. IF factory/distribution warehouse cd..<p>
	 *
	 */
	public static final String $if_site_cd = "if_site_cd";
	private static final MCPermColumnInfo _if_site_cd = createColumnInfo("if_site_cd");
	public final MCStringPermColumn if_site_cd = createStringColumn(_if_site_cd);
	
	/**
	 * 工場・物流倉庫名. Factory/Distribution warehouse name.<p>
	 *
	 */
	public static final String $site_nm = "site_nm";
	private static final MCPermColumnInfo _site_nm = createColumnInfo("site_nm");
	public final MCStringPermColumn site_nm = createStringColumn(_site_nm);
	
	/**
	 * 直送ＦＬＧ. Direct-delivery flg..<p>
	 *
	 */
	public static final String $drct_dlv_flg = "drct_dlv_flg";
	private static final MCPermColumnInfo _drct_dlv_flg = createColumnInfo("drct_dlv_flg");
	public final MCBooleanPermColumn drct_dlv_flg = createBooleanColumn(_drct_dlv_flg);
	
	/**
	 * 直送先会社ＣＤ. Direct-delivery destination company cd..<p>
	 *
	 */
	public static final String $drct_dlv_bp_cd = "drct_dlv_bp_cd";
	private static final MCPermColumnInfo _drct_dlv_bp_cd = createColumnInfo("drct_dlv_bp_cd");
	public final MCStringPermColumn drct_dlv_bp_cd = createStringColumn(_drct_dlv_bp_cd);
	
	/**
	 * ＩＦ直送先会社ＣＤ. IF direct-delivery destination company cd..<p>
	 *
	 */
	public static final String $if_drct_dlv_bp_cd = "if_drct_dlv_bp_cd";
	private static final MCPermColumnInfo _if_drct_dlv_bp_cd = createColumnInfo("if_drct_dlv_bp_cd");
	public final MCStringPermColumn if_drct_dlv_bp_cd = createStringColumn(_if_drct_dlv_bp_cd);
	
	/**
	 * 直送先会社名. Direct-delivery destination company name.<p>
	 *
	 */
	public static final String $drct_dlv_bp_nm = "drct_dlv_bp_nm";
	private static final MCPermColumnInfo _drct_dlv_bp_nm = createColumnInfo("drct_dlv_bp_nm");
	public final MCStringPermColumn drct_dlv_bp_nm = createStringColumn(_drct_dlv_bp_nm);
	
	/**
	 * 直送先国ＣＤ. Direct-delivery destination country cd..<p>
	 *
	 */
	public static final String $drct_dlv_cntry_cd = "drct_dlv_cntry_cd";
	private static final MCPermColumnInfo _drct_dlv_cntry_cd = createColumnInfo("drct_dlv_cntry_cd");
	public final MCStringPermColumn drct_dlv_cntry_cd = createStringColumn(_drct_dlv_cntry_cd);
	
	/**
	 * ＩＦ直送先国ＣＤ. IF direct-delivery destination country.<p>
	 *
	 */
	public static final String $if_drct_dlv_cntry_cd = "if_drct_dlv_cntry_cd";
	private static final MCPermColumnInfo _if_drct_dlv_cntry_cd = createColumnInfo("if_drct_dlv_cntry_cd");
	public final MCStringPermColumn if_drct_dlv_cntry_cd = createStringColumn(_if_drct_dlv_cntry_cd);
	
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
	 * 取引条件ＣＤ１. Transaction terms cd. 1.<p>
	 *
	 */
	public static final String $tterm_cd1 = "tterm_cd1";
	private static final MCPermColumnInfo _tterm_cd1 = createColumnInfo("tterm_cd1");
	public final MCStringPermColumn tterm_cd1 = createStringColumn(_tterm_cd1);
	
	/**
	 * ＩＦ取引条件ＣＤ１. IF transaction terms cd. 1.<p>
	 *
	 */
	public static final String $if_tterm_cd1 = "if_tterm_cd1";
	private static final MCPermColumnInfo _if_tterm_cd1 = createColumnInfo("if_tterm_cd1");
	public final MCStringPermColumn if_tterm_cd1 = createStringColumn(_if_tterm_cd1);
	
	/**
	 * 取引条件名１. Transaction terms name 1.<p>
	 *
	 */
	public static final String $tterm_nm1 = "tterm_nm1";
	private static final MCPermColumnInfo _tterm_nm1 = createColumnInfo("tterm_nm1");
	public final MCStringPermColumn tterm_nm1 = createStringColumn(_tterm_nm1);
	
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
	 * ＩＦ取引条件ＣＤ２. IF transaction terms cd. 2.<p>
	 *
	 */
	public static final String $if_tterm_cd2 = "if_tterm_cd2";
	private static final MCPermColumnInfo _if_tterm_cd2 = createColumnInfo("if_tterm_cd2");
	public final MCStringPermColumn if_tterm_cd2 = createStringColumn(_if_tterm_cd2);
	
	/**
	 * 取引条件名２. Transaction terms name 2.<p>
	 *
	 */
	public static final String $tterm_nm2 = "tterm_nm2";
	private static final MCPermColumnInfo _tterm_nm2 = createColumnInfo("tterm_nm2");
	public final MCStringPermColumn tterm_nm2 = createStringColumn(_tterm_nm2);
	
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
	 * ＩＦ取引条件ＣＤ３. IF transaction terms cd. 3.<p>
	 *
	 */
	public static final String $if_tterm_cd3 = "if_tterm_cd3";
	private static final MCPermColumnInfo _if_tterm_cd3 = createColumnInfo("if_tterm_cd3");
	public final MCStringPermColumn if_tterm_cd3 = createStringColumn(_if_tterm_cd3);
	
	/**
	 * 取引条件名３. Transaction terms name 3.<p>
	 *
	 */
	public static final String $tterm_nm3 = "tterm_nm3";
	private static final MCPermColumnInfo _tterm_nm3 = createColumnInfo("tterm_nm3");
	public final MCStringPermColumn tterm_nm3 = createStringColumn(_tterm_nm3);
	
	/**
	 * 取引条件備考３. Transaction terms remarks 3.<p>
	 *
	 */
	public static final String $tterm_rmrks3 = "tterm_rmrks3";
	private static final MCPermColumnInfo _tterm_rmrks3 = createColumnInfo("tterm_rmrks3");
	public final MCStringPermColumn tterm_rmrks3 = createStringColumn(_tterm_rmrks3);
	
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
	 * 諸口品ＦＬＧ. Miscellaneous item flg..<p>
	 *
	 */
	public static final String $sundry_itm_flg = "sundry_itm_flg";
	private static final MCPermColumnInfo _sundry_itm_flg = createColumnInfo("sundry_itm_flg");
	public final MCBooleanPermColumn sundry_itm_flg = createBooleanColumn(_sundry_itm_flg);
	
	/**
	 * 品名. Item name.<p>
	 *
	 */
	public static final String $itm_nm = "itm_nm";
	private static final MCPermColumnInfo _itm_nm = createColumnInfo("itm_nm");
	public final MCStringPermColumn itm_nm = createStringColumn(_itm_nm);
	
	/**
	 * インボイス表記品名. Item name for invoice.<p>
	 *
	 */
	public static final String $iv_itm_nm = "iv_itm_nm";
	private static final MCPermColumnInfo _iv_itm_nm = createColumnInfo("iv_itm_nm");
	public final MCStringPermColumn iv_itm_nm = createStringColumn(_iv_itm_nm);
	
	/**
	 * 発注先品目ＣＤ. Supplier item cd..<p>
	 *
	 */
	public static final String $sppl_itm_cd = "sppl_itm_cd";
	private static final MCPermColumnInfo _sppl_itm_cd = createColumnInfo("sppl_itm_cd");
	public final MCStringPermColumn sppl_itm_cd = createStringColumn(_sppl_itm_cd);
	
	/**
	 * 発注先品名. Supplier item name.<p>
	 *
	 */
	public static final String $sppl_itm_nm = "sppl_itm_nm";
	private static final MCPermColumnInfo _sppl_itm_nm = createColumnInfo("sppl_itm_nm");
	public final MCStringPermColumn sppl_itm_nm = createStringColumn(_sppl_itm_nm);
	
	/**
	 * 業者ロットＮＯ. Vendor lot No..<p>
	 *
	 */
	public static final String $bp_lot_no = "bp_lot_no";
	private static final MCPermColumnInfo _bp_lot_no = createColumnInfo("bp_lot_no");
	public final MCStringPermColumn bp_lot_no = createStringColumn(_bp_lot_no);
	
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
	 * 取引単位名. Transaction unit name.<p>
	 *
	 */
	public static final String $trd_unit_nm = "trd_unit_nm";
	private static final MCPermColumnInfo _trd_unit_nm = createColumnInfo("trd_unit_nm");
	public final MCStringPermColumn trd_unit_nm = createStringColumn(_trd_unit_nm);
	
	/**
	 * 取引単位数量. Transaction unit qty..<p>
	 *
	 */
	public static final String $trd_unit_qty = "trd_unit_qty";
	private static final MCPermColumnInfo _trd_unit_qty = createColumnInfo("trd_unit_qty");
	public final MCNumberPermColumn trd_unit_qty = createNumberColumn(_trd_unit_qty);
	
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
	 * 値引理由ＣＤ. Discount reason cd..<p>
	 *
	 */
	public static final String $dscnt_rsn_cd = "dscnt_rsn_cd";
	private static final MCPermColumnInfo _dscnt_rsn_cd = createColumnInfo("dscnt_rsn_cd");
	public final MCStringPermColumn dscnt_rsn_cd = createStringColumn(_dscnt_rsn_cd);
	
	/**
	 * ＩＦ値引理由ＣＤ. IF discount reason cd..<p>
	 *
	 */
	public static final String $if_dscnt_rsn_cd = "if_dscnt_rsn_cd";
	private static final MCPermColumnInfo _if_dscnt_rsn_cd = createColumnInfo("if_dscnt_rsn_cd");
	public final MCStringPermColumn if_dscnt_rsn_cd = createStringColumn(_if_dscnt_rsn_cd);
	
	/**
	 * 値引理由名. Discount reason name.<p>
	 *
	 */
	public static final String $dscnt_rsn_nm = "dscnt_rsn_nm";
	private static final MCPermColumnInfo _dscnt_rsn_nm = createColumnInfo("dscnt_rsn_nm");
	public final MCStringPermColumn dscnt_rsn_nm = createStringColumn(_dscnt_rsn_nm);
	
	/**
	 * 仮単価ＦＬＧ. Temporary unit price flg..<p>
	 *
	 */
	public static final String $interim_flg = "interim_flg";
	private static final MCPermColumnInfo _interim_flg = createColumnInfo("interim_flg");
	public final MCBooleanPermColumn interim_flg = createBooleanColumn(_interim_flg);
	
	/**
	 * 税区分. Tax type.<p>
	 *
	 */
	public static final String $tax_typ = "tax_typ";
	private static final MCPermColumnInfo _tax_typ = createColumnInfo("tax_typ");
	public final MCStringPermColumn tax_typ = createStringColumn(_tax_typ);
	
	/**
	 * 内税ＦＬＧ. Tax inclusive flg..<p>
	 *
	 */
	public static final String $inc_tax_flg = "inc_tax_flg";
	private static final MCPermColumnInfo _inc_tax_flg = createColumnInfo("inc_tax_flg");
	public final MCBooleanPermColumn inc_tax_flg = createBooleanColumn(_inc_tax_flg);
	
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
	 * 税名. Tax name.<p>
	 *
	 */
	public static final String $tax_nm = "tax_nm";
	private static final MCPermColumnInfo _tax_nm = createColumnInfo("tax_nm");
	public final MCStringPermColumn tax_nm = createStringColumn(_tax_nm);
	
	/**
	 * 税率. Tax rate.<p>
	 *
	 */
	public static final String $tax_rate = "tax_rate";
	private static final MCPermColumnInfo _tax_rate = createColumnInfo("tax_rate");
	public final MCNumberPermColumn tax_rate = createNumberColumn(_tax_rate);
	
	/**
	 * 取引通貨税額. Tax amount (Transaction currency).<p>
	 *
	 */
	public static final String $trd_cur_tax_amt = "trd_cur_tax_amt";
	private static final MCPermColumnInfo _trd_cur_tax_amt = createColumnInfo("trd_cur_tax_amt");
	public final MCNumberPermColumn trd_cur_tax_amt = createNumberColumn(_trd_cur_tax_amt);
	
	/**
	 * 源泉税率. Withholding tax rate.<p>
	 *
	 */
	public static final String $wtax_rate = "wtax_rate";
	private static final MCPermColumnInfo _wtax_rate = createColumnInfo("wtax_rate");
	public final MCNumberPermColumn wtax_rate = createNumberColumn(_wtax_rate);
	
	/**
	 * 源泉税額. Withholding tax.<p>
	 *
	 */
	public static final String $wtax_amt = "wtax_amt";
	private static final MCPermColumnInfo _wtax_amt = createColumnInfo("wtax_amt");
	public final MCNumberPermColumn wtax_amt = createNumberColumn(_wtax_amt);
	
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
	 * 検収不良ＦＬＧ. Acceptance defective flg..<p>
	 *
	 */
	public static final String $accpt_dfct_flg = "accpt_dfct_flg";
	private static final MCPermColumnInfo _accpt_dfct_flg = createColumnInfo("accpt_dfct_flg");
	public final MCBooleanPermColumn accpt_dfct_flg = createBooleanColumn(_accpt_dfct_flg);
	
	/**
	 * 仕入実績ＮＯ. Purchase result No..<p>
	 *
	 */
	public static final String $purc_act_no = "purc_act_no";
	private static final MCPermColumnInfo _purc_act_no = createColumnInfo("purc_act_no");
	public final MCStringPermColumn purc_act_no = createStringColumn(_purc_act_no);
	
	/**
	 * 仕入実績改訂番号. Purchase result rev. number.<p>
	 *
	 */
	public static final String $purc_act_rev = "purc_act_rev";
	private static final MCPermColumnInfo _purc_act_rev = createColumnInfo("purc_act_rev");
	public final MCNumberPermColumn purc_act_rev = createNumberColumn(_purc_act_rev);
	
	/**
	 * 仕入実績明細ＮＯ. Purchase result details No..<p>
	 *
	 */
	public static final String $purc_act_d_no = "purc_act_d_no";
	private static final MCPermColumnInfo _purc_act_d_no = createColumnInfo("purc_act_d_no");
	public final MCStringPermColumn purc_act_d_no = createStringColumn(_purc_act_d_no);
	
	/**
	 * ＩＦ会社ＣＤ. IF company cd..<p>
	 *
	 */
	public static final String $if_co_cd = "if_co_cd";
	private static final MCPermColumnInfo _if_co_cd = createColumnInfo("if_co_cd");
	public final MCStringPermColumn if_co_cd = createStringColumn(_if_co_cd);
	
	/**
	 * 会社名. Company name.<p>
	 *
	 */
	public static final String $co_nm = "co_nm";
	private static final MCPermColumnInfo _co_nm = createColumnInfo("co_nm");
	public final MCStringPermColumn co_nm = createStringColumn(_co_nm);
	
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
	 * 発注先国名. Supplier country name.<p>
	 *
	 */
	public static final String $sppl_cntry_nm = "sppl_cntry_nm";
	
	/**
	 * 納入先国名. Delivery destination country name.<p>
	 *
	 */
	public static final String $in_to_cntry_nm = "in_to_cntry_nm";
	
	/**
	 * 配送先国名. Receiving point country name.<p>
	 *
	 */
	public static final String $tdlv_cntry_nm = "tdlv_cntry_nm";
	
	/**
	 * 直送先国名. Direct-delivery destination country name.<p>
	 *
	 */
	public static final String $drct_dlv_cntry_nm = "drct_dlv_cntry_nm";
	
	/**
	 * 取引通貨名. Transaction currency name.<p>
	 *
	 */
	public static final String $trd_cur_nm = "trd_cur_nm";
	
	/**
	 * ワーキンググループ名. WG name.<p>
	 *
	 */
	public static final String $wg_nm = "wg_nm";
	
	/**
	 * 国名. Country name.<p>
	 *
	 */
	public static final String $cntry_nm = "cntry_nm";
	
	public static final MCMeta data_lno_META = createCommonMeta($data_lno, mcframe.commonMA.meta.MA_META.IF_DATA_LNO);
	public static final MCMeta data_no_META = createCommonMeta($data_no, mcframe.commonMA.meta.MA_META.IF_DATA_NO);
	public static final MCMeta data_crud_typ_META = createCommonMeta($data_crud_typ, mcframe.commonMA.meta.MA_META.DATA_CRUD_TYP);
	public static final MCMeta exe_sts_typ_META = createCommonMeta($exe_sts_typ, mcframe.commonMA.meta.MA_META.EXE_STS_TYP);
	public static final MCMeta ext_sys_cd_META = createCommonMeta($ext_sys_cd, mcframe.commonMA.meta.MA_META.EXT_SYS_CD);
	public static final MCMeta po_no_META = createCommonMeta($po_no, mcframe.commonMA.meta.MA_META.PO_NO);
	public static final MCMeta po_d_no_META = createCommonMeta($po_d_no, mcframe.commonMA.meta.MA_META.PO_D_NO);
	public static final MCMeta bp_dlv_slip_no_META = createCommonMeta($bp_dlv_slip_no, mcframe.commonMA.meta.MA_META.DLV_SLIP_NO);
	public static final MCMeta bp_dlv_slip_lno_META = createCommonMeta($bp_dlv_slip_lno, mcframe.commonMA.meta.MA_META.DLV_SLIP_D_NO);
	public static final MCMeta iv_flg_META = createCommonMeta($iv_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta abort_flg_META = createCommonMeta($abort_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cntry_cd_META = createCommonMeta($cntry_cd, mcframe.commonMA.meta.MA_META.CNTRY_CD);
	public static final MCMeta if_cntry_cd_META = createCommonMeta($if_cntry_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta purc_dpt_cd_META = createCommonMeta($purc_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta if_purc_dpt_cd_META = createCommonMeta($if_purc_dpt_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta purc_dpt_nm_META = createCommonMeta($purc_dpt_nm, mcframe.commonMA.meta.MA_META.DPT_NM);
	public static final MCMeta purc_usr_cd_META = createCommonMeta($purc_usr_cd, mcframe.commonMA.meta.MA_META.USR_CD);
	public static final MCMeta if_purc_usr_cd_META = createCommonMeta($if_purc_usr_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta purc_usr_nm_META = createCommonMeta($purc_usr_nm, mcframe.commonMA.meta.MA_META.USR_NM);
	public static final MCMeta wg_cd_META = createCommonMeta($wg_cd, mcframe.commonMA.meta.MA_META.WG_CD);
	public static final MCMeta sppl_cd_META = createCommonMeta($sppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta if_sppl_cd_META = createCommonMeta($if_sppl_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta sppl_nm_META = createCommonMeta($sppl_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta sppl_cntry_cd_META = createCommonMeta($sppl_cntry_cd, mcframe.commonMA.meta.MA_META.CNTRY_CD);
	public static final MCMeta if_sppl_cntry_cd_META = createCommonMeta($if_sppl_cntry_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta ac_dt_META = createCommonMeta($ac_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta ac_ym_META = createCommonMeta($ac_ym, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta purc_dt_META = createCommonMeta($purc_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta red_slip_ac_dt_META = createCommonMeta($red_slip_ac_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta red_slip_ac_ym_META = createCommonMeta($red_slip_ac_ym, mcframe.commonMA.meta.MA_META.YM);
	public static final MCMeta pay_schd_dt_META = createCommonMeta($pay_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta in_to_id_typ_META = createCommonMeta($in_to_id_typ, mcframe.commonMS.meta.MS_META.SHIP_TO_ID_TYP);
	public static final MCMeta in_to_id_cd_META = createCommonMeta($in_to_id_cd, mcframe.commonMS.meta.MS_META.SHIP_TO_ID_CD);
	public static final MCMeta if_in_to_id_cd_META = createCommonMeta($if_in_to_id_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta in_to_nm_META = createCommonMeta($in_to_nm, mcframe.commonMS.meta.MS_META.SHIP_TO_ID_NM);
	public static final MCMeta in_to_zip_cd_META = createCommonMeta($in_to_zip_cd, mcframe.commonMA.meta.MA_META.ZIP_CD);
	public static final MCMeta in_to_addr1_META = createCommonMeta($in_to_addr1, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta in_to_addr2_META = createCommonMeta($in_to_addr2, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta in_to_addr3_META = createCommonMeta($in_to_addr3, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta in_to_addr4_META = createCommonMeta($in_to_addr4, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta in_to_cntct_dpt_META = createCommonMeta($in_to_cntct_dpt, mcframe.commonMA.meta.MA_META.BP_CNTCT_DPT);
	public static final MCMeta in_to_cntct_psn_META = createCommonMeta($in_to_cntct_psn, mcframe.commonMA.meta.MA_META.BP_CNTCT_PSN);
	public static final MCMeta in_to_tel_META = createCommonMeta($in_to_tel, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta in_to_fax_META = createCommonMeta($in_to_fax, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta in_to_sundry_flg_META = createCommonMeta($in_to_sundry_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta in_to_cntry_cd_META = createCommonMeta($in_to_cntry_cd, mcframe.commonMA.meta.MA_META.CNTRY_CD);
	public static final MCMeta if_in_to_cntry_cd_META = createCommonMeta($if_in_to_cntry_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta tdlv_cd_META = createCommonMeta($tdlv_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta if_tdlv_cd_META = createCommonMeta($if_tdlv_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta tdlv_nm_META = createCommonMeta($tdlv_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta tdlv_zip_cd_META = createCommonMeta($tdlv_zip_cd, mcframe.commonMA.meta.MA_META.ZIP_CD);
	public static final MCMeta tdlv_addr1_META = createCommonMeta($tdlv_addr1, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta tdlv_addr2_META = createCommonMeta($tdlv_addr2, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta tdlv_addr3_META = createCommonMeta($tdlv_addr3, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta tdlv_addr4_META = createCommonMeta($tdlv_addr4, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta tdlv_cntct_dpt_META = createCommonMeta($tdlv_cntct_dpt, mcframe.commonMA.meta.MA_META.BP_CNTCT_DPT);
	public static final MCMeta tdlv_cntct_psn_META = createCommonMeta($tdlv_cntct_psn, mcframe.commonMA.meta.MA_META.BP_CNTCT_PSN);
	public static final MCMeta tdlv_tel_META = createCommonMeta($tdlv_tel, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta tdlv_fax_META = createCommonMeta($tdlv_fax, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta tdlv_sundry_flg_META = createCommonMeta($tdlv_sundry_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta tdlv_cntry_cd_META = createCommonMeta($tdlv_cntry_cd, mcframe.commonMA.meta.MA_META.CNTRY_CD);
	public static final MCMeta if_tdlv_cntry_cd_META = createCommonMeta($if_tdlv_cntry_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta site_cd_META = createCommonMeta($site_cd, mcframe.commonMA.meta.MA_META.SITE_CD);
	public static final MCMeta if_site_cd_META = createCommonMeta($if_site_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta site_nm_META = createCommonMeta($site_nm, mcframe.commonMA.meta.MA_META.SITE_NM);
	public static final MCMeta drct_dlv_flg_META = createCommonMeta($drct_dlv_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta drct_dlv_bp_cd_META = createCommonMeta($drct_dlv_bp_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta if_drct_dlv_bp_cd_META = createCommonMeta($if_drct_dlv_bp_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta drct_dlv_bp_nm_META = createCommonMeta($drct_dlv_bp_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta drct_dlv_cntry_cd_META = createCommonMeta($drct_dlv_cntry_cd, mcframe.commonMA.meta.MA_META.CNTRY_CD);
	public static final MCMeta if_drct_dlv_cntry_cd_META = createCommonMeta($if_drct_dlv_cntry_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta trd_cur_cd_META = createCommonMeta($trd_cur_cd, mcframe.commonMA.meta.MA_META.CUR_CD);
	public static final MCMeta if_trd_cur_cd_META = createCommonMeta($if_trd_cur_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta tterm_cd1_META = createCommonMeta($tterm_cd1, mcframe.commonMA.meta.MA_META.TTERM_CD);
	public static final MCMeta if_tterm_cd1_META = createCommonMeta($if_tterm_cd1, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta tterm_nm1_META = createCommonMeta($tterm_nm1, mcframe.commonMA.meta.MA_META.TTERM_NM);
	public static final MCMeta tterm_rmrks1_META = createCommonMeta($tterm_rmrks1, mcframe.commonMS.meta.MS_META.TTERM_RMRKS1);
	public static final MCMeta tterm_cd2_META = createCommonMeta($tterm_cd2, mcframe.commonMA.meta.MA_META.TTERM_CD);
	public static final MCMeta if_tterm_cd2_META = createCommonMeta($if_tterm_cd2, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta tterm_nm2_META = createCommonMeta($tterm_nm2, mcframe.commonMA.meta.MA_META.TTERM_NM);
	public static final MCMeta tterm_rmrks2_META = createCommonMeta($tterm_rmrks2, mcframe.commonMS.meta.MS_META.TTERM_RMRKS2);
	public static final MCMeta tterm_cd3_META = createCommonMeta($tterm_cd3, mcframe.commonMA.meta.MA_META.TTERM_CD);
	public static final MCMeta if_tterm_cd3_META = createCommonMeta($if_tterm_cd3, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta tterm_nm3_META = createCommonMeta($tterm_nm3, mcframe.commonMA.meta.MA_META.TTERM_NM);
	public static final MCMeta tterm_rmrks3_META = createCommonMeta($tterm_rmrks3, mcframe.commonMS.meta.MS_META.TTERM_RMRKS3);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta if_itm_cd_META = createCommonMeta($if_itm_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta if_itm_sub1_META = createCommonMeta($if_itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta if_itm_sub2_META = createCommonMeta($if_itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta if_itm_sub3_META = createCommonMeta($if_itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta sundry_itm_flg_META = createCommonMeta($sundry_itm_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta itm_nm_META = createCommonMeta($itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta iv_itm_nm_META = createCommonMeta($iv_itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta sppl_itm_cd_META = createCommonMeta($sppl_itm_cd, mcframe.commonMA.meta.MA_META.BP_ITM_CD);
	public static final MCMeta sppl_itm_nm_META = createCommonMeta($sppl_itm_nm, mcframe.commonMA.meta.MA_META.BP_ITM_NM);
	public static final MCMeta bp_lot_no_META = createCommonMeta($bp_lot_no, mcframe.commonMA.meta.MA_META.BP_LOT_NO);
	public static final MCMeta trd_unit_cd_META = createCommonMeta($trd_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta if_trd_unit_cd_META = createCommonMeta($if_trd_unit_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta trd_unit_nm_META = createCommonMeta($trd_unit_nm, mcframe.commonMA.meta.MA_META.UNIT_NM);
	public static final MCMeta trd_unit_qty_META = createCommonMeta($trd_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta trd_cur_upri_META = createCommonMeta($trd_cur_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta trd_cur_amt_META = createCommonMeta($trd_cur_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta trd_cur_dscnt_amt_META = createCommonMeta($trd_cur_dscnt_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta dscnt_rsn_cd_META = createCommonMeta($dscnt_rsn_cd, mcframe.commonMA.meta.MA_META.BIZ_RSN_CD);
	public static final MCMeta if_dscnt_rsn_cd_META = createCommonMeta($if_dscnt_rsn_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta dscnt_rsn_nm_META = createCommonMeta($dscnt_rsn_nm, mcframe.commonMA.meta.MA_META.BIZ_RSN_NM);
	public static final MCMeta interim_flg_META = createCommonMeta($interim_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta tax_typ_META = createCommonMeta($tax_typ, mcframe.commonMA.meta.MA_META.TAX_TYP);
	public static final MCMeta inc_tax_flg_META = createCommonMeta($inc_tax_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta tax_cd_META = createCommonMeta($tax_cd, mcframe.commonMA.meta.MA_META.TAX_CD);
	public static final MCMeta if_tax_cd_META = createCommonMeta($if_tax_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta tax_nm_META = createCommonMeta($tax_nm, mcframe.commonMA.meta.MA_META.TAX_NM);
	public static final MCMeta tax_rate_META = createCommonMeta($tax_rate, mcframe.commonMA.meta.MA_META.TAX_RATE);
	public static final MCMeta trd_cur_tax_amt_META = createCommonMeta($trd_cur_tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta wtax_rate_META = createCommonMeta($wtax_rate, mcframe.commonMA.meta.MA_META.WTAX_RATE);
	public static final MCMeta wtax_amt_META = createCommonMeta($wtax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta sno1_META = createCommonMeta($sno1, mcframe.commonMA.meta.MA_META.SNO1);
	public static final MCMeta sno2_META = createCommonMeta($sno2, mcframe.commonMA.meta.MA_META.SNO2);
	public static final MCMeta sno3_META = createCommonMeta($sno3, mcframe.commonMA.meta.MA_META.SNO3);
	public static final MCMeta sno4_META = createCommonMeta($sno4, mcframe.commonMA.meta.MA_META.SNO4);
	public static final MCMeta accpt_dfct_flg_META = createCommonMeta($accpt_dfct_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta purc_act_no_META = createCommonMeta($purc_act_no, mcframe.commonMA.meta.MA_META.PURC_ACT_NO);
	public static final MCMeta purc_act_rev_META = createCommonMeta($purc_act_rev, mcframe.commonMA.meta.MA_META.SLIP_REV);
	public static final MCMeta purc_act_d_no_META = createCommonMeta($purc_act_d_no, mcframe.commonMA.meta.MA_META.PURC_ACT_D_NO);
	public static final MCMeta if_co_cd_META = createCommonMeta($if_co_cd, mcframe.commonMA.meta.MA_META.IF_EXT_SYS_CD);
	public static final MCMeta co_nm_META = createCommonMeta($co_nm, mcframe.commonMA.meta.MA_META.CO_NM);
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
	public static final MCMeta sppl_cntry_nm_META = createCommonMeta($sppl_cntry_nm, mcframe.commonMA.meta.MA_META.CNTRY_NM);
	public static final MCMeta in_to_cntry_nm_META = createCommonMeta($in_to_cntry_nm, mcframe.commonMA.meta.MA_META.CNTRY_NM);
	public static final MCMeta tdlv_cntry_nm_META = createCommonMeta($tdlv_cntry_nm, mcframe.commonMA.meta.MA_META.CNTRY_NM);
	public static final MCMeta drct_dlv_cntry_nm_META = createCommonMeta($drct_dlv_cntry_nm, mcframe.commonMA.meta.MA_META.CNTRY_NM);
	public static final MCMeta trd_cur_nm_META = createCommonMeta($trd_cur_nm, mcframe.commonMA.meta.MA_META.CUR_NM);
	public static final MCMeta wg_nm_META = createCommonMeta($wg_nm, mcframe.commonMA.meta.MA_META.WG_NM);
	public static final MCMeta cntry_nm_META = createCommonMeta($cntry_nm, mcframe.commonMA.meta.MA_META.CNTRY_NM);

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
					MST_ACCPT_SEND_IF_R own = MST_ACCPT_SEND_IF_R.create(alias);
					mcframe.serverPF.dbc.PFT_SDRV_IF_R ref = mcframe.serverPF.dbc.PFT_SDRV_IF_R.create("SDRV");
					MCPredicate cond = value(0).eq(value(0));
					cond = cond.and(own.data_no.eq(ref.data_no));
					return cond;
				}
			)
		);
	}
	
	protected static final ConstMetaList<MST_ACCPT_SEND_IF_R> constMetas = new ConstMetaList<MST_ACCPT_SEND_IF_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			data_lno_META,
			data_no_META,
			data_crud_typ_META,
			exe_sts_typ_META,
			ext_sys_cd_META,
			po_no_META,
			po_d_no_META,
			bp_dlv_slip_no_META,
			bp_dlv_slip_lno_META,
			iv_flg_META,
			abort_flg_META,
			cntry_cd_META,
			if_cntry_cd_META,
			purc_dpt_cd_META,
			if_purc_dpt_cd_META,
			purc_dpt_nm_META,
			purc_usr_cd_META,
			if_purc_usr_cd_META,
			purc_usr_nm_META,
			wg_cd_META,
			sppl_cd_META,
			if_sppl_cd_META,
			sppl_nm_META,
			sppl_cntry_cd_META,
			if_sppl_cntry_cd_META,
			ac_dt_META,
			ac_ym_META,
			purc_dt_META,
			red_slip_ac_dt_META,
			red_slip_ac_ym_META,
			pay_schd_dt_META,
			in_to_id_typ_META,
			in_to_id_cd_META,
			if_in_to_id_cd_META,
			in_to_nm_META,
			in_to_zip_cd_META,
			in_to_addr1_META,
			in_to_addr2_META,
			in_to_addr3_META,
			in_to_addr4_META,
			in_to_cntct_dpt_META,
			in_to_cntct_psn_META,
			in_to_tel_META,
			in_to_fax_META,
			in_to_sundry_flg_META,
			in_to_cntry_cd_META,
			if_in_to_cntry_cd_META,
			tdlv_cd_META,
			if_tdlv_cd_META,
			tdlv_nm_META,
			tdlv_zip_cd_META,
			tdlv_addr1_META,
			tdlv_addr2_META,
			tdlv_addr3_META,
			tdlv_addr4_META,
			tdlv_cntct_dpt_META,
			tdlv_cntct_psn_META,
			tdlv_tel_META,
			tdlv_fax_META,
			tdlv_sundry_flg_META,
			tdlv_cntry_cd_META,
			if_tdlv_cntry_cd_META,
			site_cd_META,
			if_site_cd_META,
			site_nm_META,
			drct_dlv_flg_META,
			drct_dlv_bp_cd_META,
			if_drct_dlv_bp_cd_META,
			drct_dlv_bp_nm_META,
			drct_dlv_cntry_cd_META,
			if_drct_dlv_cntry_cd_META,
			trd_cur_cd_META,
			if_trd_cur_cd_META,
			tterm_cd1_META,
			if_tterm_cd1_META,
			tterm_nm1_META,
			tterm_rmrks1_META,
			tterm_cd2_META,
			if_tterm_cd2_META,
			tterm_nm2_META,
			tterm_rmrks2_META,
			tterm_cd3_META,
			if_tterm_cd3_META,
			tterm_nm3_META,
			tterm_rmrks3_META,
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			if_itm_cd_META,
			if_itm_sub1_META,
			if_itm_sub2_META,
			if_itm_sub3_META,
			sundry_itm_flg_META,
			itm_nm_META,
			iv_itm_nm_META,
			sppl_itm_cd_META,
			sppl_itm_nm_META,
			bp_lot_no_META,
			trd_unit_cd_META,
			if_trd_unit_cd_META,
			trd_unit_nm_META,
			trd_unit_qty_META,
			trd_cur_upri_META,
			trd_cur_amt_META,
			trd_cur_dscnt_amt_META,
			dscnt_rsn_cd_META,
			if_dscnt_rsn_cd_META,
			dscnt_rsn_nm_META,
			interim_flg_META,
			tax_typ_META,
			inc_tax_flg_META,
			tax_cd_META,
			if_tax_cd_META,
			tax_nm_META,
			tax_rate_META,
			trd_cur_tax_amt_META,
			wtax_rate_META,
			wtax_amt_META,
			sno1_META,
			sno2_META,
			sno3_META,
			sno4_META,
			accpt_dfct_flg_META,
			purc_act_no_META,
			purc_act_rev_META,
			purc_act_d_no_META,
			if_co_cd_META,
			co_nm_META,
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
			sppl_cntry_nm_META,
			in_to_cntry_nm_META,
			tdlv_cntry_nm_META,
			drct_dlv_cntry_nm_META,
			trd_cur_nm_META,
			wg_nm_META,
			cntry_nm_META
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
	protected MST_ACCPT_SEND_IF_R(ConstMetaList<? extends MST_ACCPT_SEND_IF_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MST_ACCPT_SEND_IF_R(ConstMetaList<? extends MST_ACCPT_SEND_IF_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MST_ACCPT_SEND_IF_R.$data_lno,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_ACCPT_SEND_IF_R.$data_lno,
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
			MST_ACCPT_SEND_IF_R.$data_no,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_ACCPT_SEND_IF_R.$data_no,
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
			MST_ACCPT_SEND_IF_R.$data_crud_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ACCPT_SEND_IF_R.$data_crud_typ,
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
			MST_ACCPT_SEND_IF_R.$exe_sts_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ACCPT_SEND_IF_R.$exe_sts_typ,
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
			MST_ACCPT_SEND_IF_R.$ext_sys_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ACCPT_SEND_IF_R.$ext_sys_cd,
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
			MST_ACCPT_SEND_IF_R.$po_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ACCPT_SEND_IF_R.$po_no,
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
			MST_ACCPT_SEND_IF_R.$po_d_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ACCPT_SEND_IF_R.$po_d_no,
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
			MST_ACCPT_SEND_IF_R.$bp_dlv_slip_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ACCPT_SEND_IF_R.$bp_dlv_slip_no,
				"bp_dlv_slip_no",
				bp_dlv_slip_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ACCPT_SEND_IF_R.$bp_dlv_slip_lno,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ACCPT_SEND_IF_R.$bp_dlv_slip_lno,
				"bp_dlv_slip_lno",
				bp_dlv_slip_lno,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ACCPT_SEND_IF_R.$iv_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_ACCPT_SEND_IF_R.$iv_flg,
				"iv_flg",
				iv_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ACCPT_SEND_IF_R.$abort_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_ACCPT_SEND_IF_R.$abort_flg,
				"abort_flg",
				abort_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ACCPT_SEND_IF_R.$cntry_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ACCPT_SEND_IF_R.$cntry_cd,
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
			MST_ACCPT_SEND_IF_R.$if_cntry_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ACCPT_SEND_IF_R.$if_cntry_cd,
				"if_cntry_cd",
				if_cntry_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ACCPT_SEND_IF_R.$purc_dpt_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ACCPT_SEND_IF_R.$purc_dpt_cd,
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
			MST_ACCPT_SEND_IF_R.$if_purc_dpt_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ACCPT_SEND_IF_R.$if_purc_dpt_cd,
				"if_purc_dpt_cd",
				if_purc_dpt_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ACCPT_SEND_IF_R.$purc_dpt_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ACCPT_SEND_IF_R.$purc_dpt_nm,
				"purc_dpt_nm",
				purc_dpt_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ACCPT_SEND_IF_R.$purc_usr_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ACCPT_SEND_IF_R.$purc_usr_cd,
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
			MST_ACCPT_SEND_IF_R.$if_purc_usr_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ACCPT_SEND_IF_R.$if_purc_usr_cd,
				"if_purc_usr_cd",
				if_purc_usr_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ACCPT_SEND_IF_R.$purc_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ACCPT_SEND_IF_R.$purc_usr_nm,
				"purc_usr_nm",
				purc_usr_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ACCPT_SEND_IF_R.$wg_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ACCPT_SEND_IF_R.$wg_cd,
				"wg_cd",
				wg_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ACCPT_SEND_IF_R.$sppl_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ACCPT_SEND_IF_R.$sppl_cd,
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
			MST_ACCPT_SEND_IF_R.$if_sppl_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ACCPT_SEND_IF_R.$if_sppl_cd,
				"if_sppl_cd",
				if_sppl_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ACCPT_SEND_IF_R.$sppl_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ACCPT_SEND_IF_R.$sppl_nm,
				"sppl_nm",
				sppl_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ACCPT_SEND_IF_R.$sppl_cntry_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ACCPT_SEND_IF_R.$sppl_cntry_cd,
				"sppl_cntry_cd",
				sppl_cntry_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ACCPT_SEND_IF_R.$if_sppl_cntry_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ACCPT_SEND_IF_R.$if_sppl_cntry_cd,
				"if_sppl_cntry_cd",
				if_sppl_cntry_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ACCPT_SEND_IF_R.$ac_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_ACCPT_SEND_IF_R.$ac_dt,
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
			MST_ACCPT_SEND_IF_R.$ac_ym,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_ACCPT_SEND_IF_R.$ac_ym,
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
			MST_ACCPT_SEND_IF_R.$purc_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_ACCPT_SEND_IF_R.$purc_dt,
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
			MST_ACCPT_SEND_IF_R.$red_slip_ac_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_ACCPT_SEND_IF_R.$red_slip_ac_dt,
				"red_slip_ac_dt",
				red_slip_ac_dt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ACCPT_SEND_IF_R.$red_slip_ac_ym,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_ACCPT_SEND_IF_R.$red_slip_ac_ym,
				"red_slip_ac_ym",
				red_slip_ac_ym,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ACCPT_SEND_IF_R.$pay_schd_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_ACCPT_SEND_IF_R.$pay_schd_dt,
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
			MST_ACCPT_SEND_IF_R.$in_to_id_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ACCPT_SEND_IF_R.$in_to_id_typ,
				"in_to_id_typ",
				in_to_id_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ACCPT_SEND_IF_R.$in_to_id_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ACCPT_SEND_IF_R.$in_to_id_cd,
				"in_to_id_cd",
				in_to_id_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ACCPT_SEND_IF_R.$if_in_to_id_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ACCPT_SEND_IF_R.$if_in_to_id_cd,
				"if_in_to_id_cd",
				if_in_to_id_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ACCPT_SEND_IF_R.$in_to_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ACCPT_SEND_IF_R.$in_to_nm,
				"in_to_nm",
				in_to_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ACCPT_SEND_IF_R.$in_to_zip_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ACCPT_SEND_IF_R.$in_to_zip_cd,
				"in_to_zip_cd",
				in_to_zip_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ACCPT_SEND_IF_R.$in_to_addr1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ACCPT_SEND_IF_R.$in_to_addr1,
				"in_to_addr1",
				in_to_addr1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ACCPT_SEND_IF_R.$in_to_addr2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ACCPT_SEND_IF_R.$in_to_addr2,
				"in_to_addr2",
				in_to_addr2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ACCPT_SEND_IF_R.$in_to_addr3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ACCPT_SEND_IF_R.$in_to_addr3,
				"in_to_addr3",
				in_to_addr3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ACCPT_SEND_IF_R.$in_to_addr4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ACCPT_SEND_IF_R.$in_to_addr4,
				"in_to_addr4",
				in_to_addr4,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ACCPT_SEND_IF_R.$in_to_cntct_dpt,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ACCPT_SEND_IF_R.$in_to_cntct_dpt,
				"in_to_cntct_dpt",
				in_to_cntct_dpt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ACCPT_SEND_IF_R.$in_to_cntct_psn,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ACCPT_SEND_IF_R.$in_to_cntct_psn,
				"in_to_cntct_psn",
				in_to_cntct_psn,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ACCPT_SEND_IF_R.$in_to_tel,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ACCPT_SEND_IF_R.$in_to_tel,
				"in_to_tel",
				in_to_tel,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ACCPT_SEND_IF_R.$in_to_fax,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ACCPT_SEND_IF_R.$in_to_fax,
				"in_to_fax",
				in_to_fax,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ACCPT_SEND_IF_R.$in_to_sundry_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_ACCPT_SEND_IF_R.$in_to_sundry_flg,
				"in_to_sundry_flg",
				in_to_sundry_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ACCPT_SEND_IF_R.$in_to_cntry_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ACCPT_SEND_IF_R.$in_to_cntry_cd,
				"in_to_cntry_cd",
				in_to_cntry_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ACCPT_SEND_IF_R.$if_in_to_cntry_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ACCPT_SEND_IF_R.$if_in_to_cntry_cd,
				"if_in_to_cntry_cd",
				if_in_to_cntry_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ACCPT_SEND_IF_R.$tdlv_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ACCPT_SEND_IF_R.$tdlv_cd,
				"tdlv_cd",
				tdlv_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ACCPT_SEND_IF_R.$if_tdlv_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ACCPT_SEND_IF_R.$if_tdlv_cd,
				"if_tdlv_cd",
				if_tdlv_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ACCPT_SEND_IF_R.$tdlv_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ACCPT_SEND_IF_R.$tdlv_nm,
				"tdlv_nm",
				tdlv_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ACCPT_SEND_IF_R.$tdlv_zip_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ACCPT_SEND_IF_R.$tdlv_zip_cd,
				"tdlv_zip_cd",
				tdlv_zip_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ACCPT_SEND_IF_R.$tdlv_addr1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ACCPT_SEND_IF_R.$tdlv_addr1,
				"tdlv_addr1",
				tdlv_addr1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ACCPT_SEND_IF_R.$tdlv_addr2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ACCPT_SEND_IF_R.$tdlv_addr2,
				"tdlv_addr2",
				tdlv_addr2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ACCPT_SEND_IF_R.$tdlv_addr3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ACCPT_SEND_IF_R.$tdlv_addr3,
				"tdlv_addr3",
				tdlv_addr3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ACCPT_SEND_IF_R.$tdlv_addr4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ACCPT_SEND_IF_R.$tdlv_addr4,
				"tdlv_addr4",
				tdlv_addr4,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ACCPT_SEND_IF_R.$tdlv_cntct_dpt,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ACCPT_SEND_IF_R.$tdlv_cntct_dpt,
				"tdlv_cntct_dpt",
				tdlv_cntct_dpt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ACCPT_SEND_IF_R.$tdlv_cntct_psn,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ACCPT_SEND_IF_R.$tdlv_cntct_psn,
				"tdlv_cntct_psn",
				tdlv_cntct_psn,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ACCPT_SEND_IF_R.$tdlv_tel,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ACCPT_SEND_IF_R.$tdlv_tel,
				"tdlv_tel",
				tdlv_tel,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ACCPT_SEND_IF_R.$tdlv_fax,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ACCPT_SEND_IF_R.$tdlv_fax,
				"tdlv_fax",
				tdlv_fax,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ACCPT_SEND_IF_R.$tdlv_sundry_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_ACCPT_SEND_IF_R.$tdlv_sundry_flg,
				"tdlv_sundry_flg",
				tdlv_sundry_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ACCPT_SEND_IF_R.$tdlv_cntry_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ACCPT_SEND_IF_R.$tdlv_cntry_cd,
				"tdlv_cntry_cd",
				tdlv_cntry_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ACCPT_SEND_IF_R.$if_tdlv_cntry_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ACCPT_SEND_IF_R.$if_tdlv_cntry_cd,
				"if_tdlv_cntry_cd",
				if_tdlv_cntry_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ACCPT_SEND_IF_R.$site_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ACCPT_SEND_IF_R.$site_cd,
				"site_cd",
				site_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ACCPT_SEND_IF_R.$if_site_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ACCPT_SEND_IF_R.$if_site_cd,
				"if_site_cd",
				if_site_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ACCPT_SEND_IF_R.$site_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ACCPT_SEND_IF_R.$site_nm,
				"site_nm",
				site_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ACCPT_SEND_IF_R.$drct_dlv_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_ACCPT_SEND_IF_R.$drct_dlv_flg,
				"drct_dlv_flg",
				drct_dlv_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ACCPT_SEND_IF_R.$drct_dlv_bp_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ACCPT_SEND_IF_R.$drct_dlv_bp_cd,
				"drct_dlv_bp_cd",
				drct_dlv_bp_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ACCPT_SEND_IF_R.$if_drct_dlv_bp_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ACCPT_SEND_IF_R.$if_drct_dlv_bp_cd,
				"if_drct_dlv_bp_cd",
				if_drct_dlv_bp_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ACCPT_SEND_IF_R.$drct_dlv_bp_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ACCPT_SEND_IF_R.$drct_dlv_bp_nm,
				"drct_dlv_bp_nm",
				drct_dlv_bp_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ACCPT_SEND_IF_R.$drct_dlv_cntry_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ACCPT_SEND_IF_R.$drct_dlv_cntry_cd,
				"drct_dlv_cntry_cd",
				drct_dlv_cntry_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ACCPT_SEND_IF_R.$if_drct_dlv_cntry_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ACCPT_SEND_IF_R.$if_drct_dlv_cntry_cd,
				"if_drct_dlv_cntry_cd",
				if_drct_dlv_cntry_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ACCPT_SEND_IF_R.$trd_cur_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ACCPT_SEND_IF_R.$trd_cur_cd,
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
			MST_ACCPT_SEND_IF_R.$if_trd_cur_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ACCPT_SEND_IF_R.$if_trd_cur_cd,
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
			MST_ACCPT_SEND_IF_R.$tterm_cd1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ACCPT_SEND_IF_R.$tterm_cd1,
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
			MST_ACCPT_SEND_IF_R.$if_tterm_cd1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ACCPT_SEND_IF_R.$if_tterm_cd1,
				"if_tterm_cd1",
				if_tterm_cd1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ACCPT_SEND_IF_R.$tterm_nm1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ACCPT_SEND_IF_R.$tterm_nm1,
				"tterm_nm1",
				tterm_nm1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ACCPT_SEND_IF_R.$tterm_rmrks1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ACCPT_SEND_IF_R.$tterm_rmrks1,
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
			MST_ACCPT_SEND_IF_R.$tterm_cd2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ACCPT_SEND_IF_R.$tterm_cd2,
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
			MST_ACCPT_SEND_IF_R.$if_tterm_cd2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ACCPT_SEND_IF_R.$if_tterm_cd2,
				"if_tterm_cd2",
				if_tterm_cd2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ACCPT_SEND_IF_R.$tterm_nm2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ACCPT_SEND_IF_R.$tterm_nm2,
				"tterm_nm2",
				tterm_nm2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ACCPT_SEND_IF_R.$tterm_rmrks2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ACCPT_SEND_IF_R.$tterm_rmrks2,
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
			MST_ACCPT_SEND_IF_R.$tterm_cd3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ACCPT_SEND_IF_R.$tterm_cd3,
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
			MST_ACCPT_SEND_IF_R.$if_tterm_cd3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ACCPT_SEND_IF_R.$if_tterm_cd3,
				"if_tterm_cd3",
				if_tterm_cd3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ACCPT_SEND_IF_R.$tterm_nm3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ACCPT_SEND_IF_R.$tterm_nm3,
				"tterm_nm3",
				tterm_nm3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ACCPT_SEND_IF_R.$tterm_rmrks3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ACCPT_SEND_IF_R.$tterm_rmrks3,
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
			MST_ACCPT_SEND_IF_R.$itm_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ACCPT_SEND_IF_R.$itm_cd,
				"itm_cd",
				itm_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ACCPT_SEND_IF_R.$itm_sub1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ACCPT_SEND_IF_R.$itm_sub1,
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
			MST_ACCPT_SEND_IF_R.$itm_sub2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ACCPT_SEND_IF_R.$itm_sub2,
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
			MST_ACCPT_SEND_IF_R.$itm_sub3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ACCPT_SEND_IF_R.$itm_sub3,
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
			MST_ACCPT_SEND_IF_R.$if_itm_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ACCPT_SEND_IF_R.$if_itm_cd,
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
			MST_ACCPT_SEND_IF_R.$if_itm_sub1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ACCPT_SEND_IF_R.$if_itm_sub1,
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
			MST_ACCPT_SEND_IF_R.$if_itm_sub2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ACCPT_SEND_IF_R.$if_itm_sub2,
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
			MST_ACCPT_SEND_IF_R.$if_itm_sub3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ACCPT_SEND_IF_R.$if_itm_sub3,
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
			MST_ACCPT_SEND_IF_R.$sundry_itm_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_ACCPT_SEND_IF_R.$sundry_itm_flg,
				"sundry_itm_flg",
				sundry_itm_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ACCPT_SEND_IF_R.$itm_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ACCPT_SEND_IF_R.$itm_nm,
				"itm_nm",
				itm_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ACCPT_SEND_IF_R.$iv_itm_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ACCPT_SEND_IF_R.$iv_itm_nm,
				"iv_itm_nm",
				iv_itm_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ACCPT_SEND_IF_R.$sppl_itm_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ACCPT_SEND_IF_R.$sppl_itm_cd,
				"sppl_itm_cd",
				sppl_itm_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ACCPT_SEND_IF_R.$sppl_itm_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ACCPT_SEND_IF_R.$sppl_itm_nm,
				"sppl_itm_nm",
				sppl_itm_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ACCPT_SEND_IF_R.$bp_lot_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ACCPT_SEND_IF_R.$bp_lot_no,
				"bp_lot_no",
				bp_lot_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ACCPT_SEND_IF_R.$trd_unit_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ACCPT_SEND_IF_R.$trd_unit_cd,
				"trd_unit_cd",
				trd_unit_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ACCPT_SEND_IF_R.$if_trd_unit_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ACCPT_SEND_IF_R.$if_trd_unit_cd,
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
			MST_ACCPT_SEND_IF_R.$trd_unit_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ACCPT_SEND_IF_R.$trd_unit_nm,
				"trd_unit_nm",
				trd_unit_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ACCPT_SEND_IF_R.$trd_unit_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_ACCPT_SEND_IF_R.$trd_unit_qty,
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
			MST_ACCPT_SEND_IF_R.$trd_cur_upri,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_ACCPT_SEND_IF_R.$trd_cur_upri,
				"trd_cur_upri",
				trd_cur_upri,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ACCPT_SEND_IF_R.$trd_cur_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_ACCPT_SEND_IF_R.$trd_cur_amt,
				"trd_cur_amt",
				trd_cur_amt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ACCPT_SEND_IF_R.$trd_cur_dscnt_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_ACCPT_SEND_IF_R.$trd_cur_dscnt_amt,
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
			MST_ACCPT_SEND_IF_R.$dscnt_rsn_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ACCPT_SEND_IF_R.$dscnt_rsn_cd,
				"dscnt_rsn_cd",
				dscnt_rsn_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ACCPT_SEND_IF_R.$if_dscnt_rsn_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ACCPT_SEND_IF_R.$if_dscnt_rsn_cd,
				"if_dscnt_rsn_cd",
				if_dscnt_rsn_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ACCPT_SEND_IF_R.$dscnt_rsn_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ACCPT_SEND_IF_R.$dscnt_rsn_nm,
				"dscnt_rsn_nm",
				dscnt_rsn_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ACCPT_SEND_IF_R.$interim_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_ACCPT_SEND_IF_R.$interim_flg,
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
			MST_ACCPT_SEND_IF_R.$tax_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ACCPT_SEND_IF_R.$tax_typ,
				"tax_typ",
				tax_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ACCPT_SEND_IF_R.$inc_tax_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_ACCPT_SEND_IF_R.$inc_tax_flg,
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
			MST_ACCPT_SEND_IF_R.$tax_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ACCPT_SEND_IF_R.$tax_cd,
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
			MST_ACCPT_SEND_IF_R.$if_tax_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ACCPT_SEND_IF_R.$if_tax_cd,
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
			MST_ACCPT_SEND_IF_R.$tax_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ACCPT_SEND_IF_R.$tax_nm,
				"tax_nm",
				tax_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ACCPT_SEND_IF_R.$tax_rate,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_ACCPT_SEND_IF_R.$tax_rate,
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
			MST_ACCPT_SEND_IF_R.$trd_cur_tax_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_ACCPT_SEND_IF_R.$trd_cur_tax_amt,
				"trd_cur_tax_amt",
				trd_cur_tax_amt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ACCPT_SEND_IF_R.$wtax_rate,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_ACCPT_SEND_IF_R.$wtax_rate,
				"wtax_rate",
				wtax_rate,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ACCPT_SEND_IF_R.$wtax_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_ACCPT_SEND_IF_R.$wtax_amt,
				"wtax_amt",
				wtax_amt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ACCPT_SEND_IF_R.$sno1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ACCPT_SEND_IF_R.$sno1,
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
			MST_ACCPT_SEND_IF_R.$sno2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ACCPT_SEND_IF_R.$sno2,
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
			MST_ACCPT_SEND_IF_R.$sno3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ACCPT_SEND_IF_R.$sno3,
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
			MST_ACCPT_SEND_IF_R.$sno4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ACCPT_SEND_IF_R.$sno4,
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
			MST_ACCPT_SEND_IF_R.$accpt_dfct_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_ACCPT_SEND_IF_R.$accpt_dfct_flg,
				"accpt_dfct_flg",
				accpt_dfct_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ACCPT_SEND_IF_R.$purc_act_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ACCPT_SEND_IF_R.$purc_act_no,
				"purc_act_no",
				purc_act_no,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ACCPT_SEND_IF_R.$purc_act_rev,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_ACCPT_SEND_IF_R.$purc_act_rev,
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
			MST_ACCPT_SEND_IF_R.$purc_act_d_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ACCPT_SEND_IF_R.$purc_act_d_no,
				"purc_act_d_no",
				purc_act_d_no,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ACCPT_SEND_IF_R.$if_co_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ACCPT_SEND_IF_R.$if_co_cd,
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
			MST_ACCPT_SEND_IF_R.$co_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ACCPT_SEND_IF_R.$co_nm,
				"co_nm",
				co_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_ACCPT_SEND_IF_R.$batch_log_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ACCPT_SEND_IF_R.$batch_log_no,
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
			MST_ACCPT_SEND_IF_R.$log_sub_key1,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_ACCPT_SEND_IF_R.$log_sub_key1,
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
			MST_ACCPT_SEND_IF_R.$log_sub_key2,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_ACCPT_SEND_IF_R.$log_sub_key2,
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
			MST_ACCPT_SEND_IF_R.$sub_char1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ACCPT_SEND_IF_R.$sub_char1,
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
			MST_ACCPT_SEND_IF_R.$sub_char2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ACCPT_SEND_IF_R.$sub_char2,
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
			MST_ACCPT_SEND_IF_R.$sub_char3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ACCPT_SEND_IF_R.$sub_char3,
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
			MST_ACCPT_SEND_IF_R.$sub_char4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ACCPT_SEND_IF_R.$sub_char4,
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
			MST_ACCPT_SEND_IF_R.$sub_char5,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ACCPT_SEND_IF_R.$sub_char5,
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
			MST_ACCPT_SEND_IF_R.$sub_char6,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ACCPT_SEND_IF_R.$sub_char6,
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
			MST_ACCPT_SEND_IF_R.$sub_char7,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ACCPT_SEND_IF_R.$sub_char7,
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
			MST_ACCPT_SEND_IF_R.$sub_char8,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ACCPT_SEND_IF_R.$sub_char8,
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
			MST_ACCPT_SEND_IF_R.$sub_char9,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ACCPT_SEND_IF_R.$sub_char9,
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
			MST_ACCPT_SEND_IF_R.$sub_char10,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ACCPT_SEND_IF_R.$sub_char10,
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
			MST_ACCPT_SEND_IF_R.$sub_char11,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ACCPT_SEND_IF_R.$sub_char11,
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
			MST_ACCPT_SEND_IF_R.$sub_char12,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ACCPT_SEND_IF_R.$sub_char12,
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
			MST_ACCPT_SEND_IF_R.$sub_char13,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ACCPT_SEND_IF_R.$sub_char13,
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
			MST_ACCPT_SEND_IF_R.$sub_char14,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ACCPT_SEND_IF_R.$sub_char14,
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
			MST_ACCPT_SEND_IF_R.$sub_char15,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ACCPT_SEND_IF_R.$sub_char15,
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
			MST_ACCPT_SEND_IF_R.$sub_char16,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ACCPT_SEND_IF_R.$sub_char16,
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
			MST_ACCPT_SEND_IF_R.$sub_char17,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ACCPT_SEND_IF_R.$sub_char17,
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
			MST_ACCPT_SEND_IF_R.$sub_char18,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ACCPT_SEND_IF_R.$sub_char18,
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
			MST_ACCPT_SEND_IF_R.$sub_char19,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ACCPT_SEND_IF_R.$sub_char19,
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
			MST_ACCPT_SEND_IF_R.$sub_char20,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ACCPT_SEND_IF_R.$sub_char20,
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
			MST_ACCPT_SEND_IF_R.$sub_char21,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ACCPT_SEND_IF_R.$sub_char21,
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
			MST_ACCPT_SEND_IF_R.$sub_char22,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ACCPT_SEND_IF_R.$sub_char22,
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
			MST_ACCPT_SEND_IF_R.$sub_char23,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ACCPT_SEND_IF_R.$sub_char23,
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
			MST_ACCPT_SEND_IF_R.$sub_char24,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ACCPT_SEND_IF_R.$sub_char24,
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
			MST_ACCPT_SEND_IF_R.$sub_char25,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ACCPT_SEND_IF_R.$sub_char25,
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
			MST_ACCPT_SEND_IF_R.$sub_char26,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ACCPT_SEND_IF_R.$sub_char26,
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
			MST_ACCPT_SEND_IF_R.$sub_char27,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ACCPT_SEND_IF_R.$sub_char27,
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
			MST_ACCPT_SEND_IF_R.$sub_char28,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ACCPT_SEND_IF_R.$sub_char28,
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
			MST_ACCPT_SEND_IF_R.$sub_char29,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ACCPT_SEND_IF_R.$sub_char29,
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
			MST_ACCPT_SEND_IF_R.$sub_char30,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ACCPT_SEND_IF_R.$sub_char30,
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
			MST_ACCPT_SEND_IF_R.$sub_num1,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_ACCPT_SEND_IF_R.$sub_num1,
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
			MST_ACCPT_SEND_IF_R.$sub_num2,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_ACCPT_SEND_IF_R.$sub_num2,
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
			MST_ACCPT_SEND_IF_R.$sub_num3,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_ACCPT_SEND_IF_R.$sub_num3,
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
			MST_ACCPT_SEND_IF_R.$sub_num4,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_ACCPT_SEND_IF_R.$sub_num4,
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
			MST_ACCPT_SEND_IF_R.$sub_num5,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_ACCPT_SEND_IF_R.$sub_num5,
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
			MST_ACCPT_SEND_IF_R.$sub_dt1,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_ACCPT_SEND_IF_R.$sub_dt1,
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
			MST_ACCPT_SEND_IF_R.$sub_dt2,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_ACCPT_SEND_IF_R.$sub_dt2,
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
			MST_ACCPT_SEND_IF_R.$sub_dt3,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_ACCPT_SEND_IF_R.$sub_dt3,
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
			MST_ACCPT_SEND_IF_R.$sub_dt4,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_ACCPT_SEND_IF_R.$sub_dt4,
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
			MST_ACCPT_SEND_IF_R.$sub_dt5,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_ACCPT_SEND_IF_R.$sub_dt5,
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
			MST_ACCPT_SEND_IF_R.$ins_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ACCPT_SEND_IF_R.$ins_usr_id,
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
			MST_ACCPT_SEND_IF_R.$ins_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ACCPT_SEND_IF_R.$ins_usr_nm,
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
			MST_ACCPT_SEND_IF_R.$ins_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MST_ACCPT_SEND_IF_R.$ins_ts,
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
			MST_ACCPT_SEND_IF_R.$ins_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ACCPT_SEND_IF_R.$ins_func_id,
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
			MST_ACCPT_SEND_IF_R.$upd_cntr,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_ACCPT_SEND_IF_R.$upd_cntr,
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
			MST_ACCPT_SEND_IF_R.$upd_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ACCPT_SEND_IF_R.$upd_usr_id,
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
			MST_ACCPT_SEND_IF_R.$upd_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ACCPT_SEND_IF_R.$upd_usr_nm,
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
			MST_ACCPT_SEND_IF_R.$upd_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MST_ACCPT_SEND_IF_R.$upd_ts,
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
			MST_ACCPT_SEND_IF_R.$upd_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ACCPT_SEND_IF_R.$upd_func_id,
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
			MST_ACCPT_SEND_IF_R.$upd_srv_req_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ACCPT_SEND_IF_R.$upd_srv_req_no,
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
			MST_ACCPT_SEND_IF_R.$sdrv_sts_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ACCPT_SEND_IF_R.$sdrv_sts_typ,
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
			MST_ACCPT_SEND_IF_R.$sppl_cntry_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ACCPT_SEND_IF_R.$sppl_cntry_nm,
				"sppl_cntry_nm",
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
			MST_ACCPT_SEND_IF_R.$in_to_cntry_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ACCPT_SEND_IF_R.$in_to_cntry_nm,
				"in_to_cntry_nm",
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
			MST_ACCPT_SEND_IF_R.$tdlv_cntry_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ACCPT_SEND_IF_R.$tdlv_cntry_nm,
				"tdlv_cntry_nm",
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
			MST_ACCPT_SEND_IF_R.$drct_dlv_cntry_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ACCPT_SEND_IF_R.$drct_dlv_cntry_nm,
				"drct_dlv_cntry_nm",
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
			MST_ACCPT_SEND_IF_R.$trd_cur_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ACCPT_SEND_IF_R.$trd_cur_nm,
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
			MST_ACCPT_SEND_IF_R.$wg_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ACCPT_SEND_IF_R.$wg_nm,
				"wg_nm",
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
			MST_ACCPT_SEND_IF_R.$cntry_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_ACCPT_SEND_IF_R.$cntry_nm,
				"cntry_nm",
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
	public static MST_ACCPT_SEND_IF_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MST_ACCPT_SEND_IF_R create(String alias) {
		MST_ACCPT_SEND_IF_R row = new MST_ACCPT_SEND_IF_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MST_ACCPT_SEND_IF_R createByName(T proto) {
		MST_ACCPT_SEND_IF_R row = MST_ACCPT_SEND_IF_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MST_ACCPT_SEND_IF_R clone() {
		return (MST_ACCPT_SEND_IF_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MST_ACCPT_SEND_IF_R createInstance() {
		return (MST_ACCPT_SEND_IF_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MST_ACCPT_SEND_IF_R getValues(String... names) {
		return (MST_ACCPT_SEND_IF_R) super.getValues(names);
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
	 public MSW_ACCPT_SEND_IF_KEY_R getPkWorkDbc(String alias) {
	 	return MSW_ACCPT_SEND_IF_KEY_R.create(alias);
	 }

	/*
	 * MCDBContainerのオーバーライドメソッドです。
	 */
	 public MSW_ACCPT_SEND_IF_KEY_R getPkWorkDbc() {
	 	return getPkWorkDbc(MSW_ACCPT_SEND_IF_KEY_R.TABLE_NAME);
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
	 * 発注ＮＯ. PO No..<p>
	 *
	 */
	public String po_no() {
		return getConstString(offset + 5, $po_no);
	}

	/**
	 * 発注ＮＯ. PO No..<p>
	 *
	 */
	public void po_no(String value) {
		setConstString(offset + 5, $po_no, value);
	}

	/**
	 * 発注明細ＮＯ. PO details No..<p>
	 *
	 */
	public String po_d_no() {
		return getConstString(offset + 6, $po_d_no);
	}

	/**
	 * 発注明細ＮＯ. PO details No..<p>
	 *
	 */
	public void po_d_no(String value) {
		setConstString(offset + 6, $po_d_no, value);
	}

	/**
	 * 業者納品書ＮＯ. Vendor delivery note No..<p>
	 *
	 */
	public String bp_dlv_slip_no() {
		return getConstString(offset + 7, $bp_dlv_slip_no);
	}

	/**
	 * 業者納品書ＮＯ. Vendor delivery note No..<p>
	 *
	 */
	public void bp_dlv_slip_no(String value) {
		setConstString(offset + 7, $bp_dlv_slip_no, value);
	}

	/**
	 * 業者納品書行ＮＯ. Vendor delivery note row No..<p>
	 *
	 */
	public String bp_dlv_slip_lno() {
		return getConstString(offset + 8, $bp_dlv_slip_lno);
	}

	/**
	 * 業者納品書行ＮＯ. Vendor delivery note row No..<p>
	 *
	 */
	public void bp_dlv_slip_lno(String value) {
		setConstString(offset + 8, $bp_dlv_slip_lno, value);
	}

	/**
	 * インボイスＦＬＧ. Invoice flg..<p>
	 *
	 */
	public boolean iv_flg() {
		return getConstBoolean(offset + 9, $iv_flg);
	}

	/**
	 * インボイスＦＬＧ. Invoice flg..<p>
	 *
	 */
	public void iv_flg(boolean value) {
		setConstBoolean(offset + 9, $iv_flg, value);
	}

	/**
	 * 打切ＦＬＧ. Cancel remaining flg..<p>
	 *
	 */
	public boolean abort_flg() {
		return getConstBoolean(offset + 10, $abort_flg);
	}

	/**
	 * 打切ＦＬＧ. Cancel remaining flg..<p>
	 *
	 */
	public void abort_flg(boolean value) {
		setConstBoolean(offset + 10, $abort_flg, value);
	}

	/**
	 * 国ＣＤ. Country cd..<p>
	 *
	 */
	public String cntry_cd() {
		return getConstString(offset + 11, $cntry_cd);
	}

	/**
	 * 国ＣＤ. Country cd..<p>
	 *
	 */
	public void cntry_cd(String value) {
		setConstString(offset + 11, $cntry_cd, value);
	}

	/**
	 * ＩＦ国ＣＤ. IF country cd..<p>
	 *
	 */
	public String if_cntry_cd() {
		return getConstString(offset + 12, $if_cntry_cd);
	}

	/**
	 * ＩＦ国ＣＤ. IF country cd..<p>
	 *
	 */
	public void if_cntry_cd(String value) {
		setConstString(offset + 12, $if_cntry_cd, value);
	}

	/**
	 * 購買部門ＣＤ. Purchasing dept. cd..<p>
	 *
	 */
	public String purc_dpt_cd() {
		return getConstString(offset + 13, $purc_dpt_cd);
	}

	/**
	 * 購買部門ＣＤ. Purchasing dept. cd..<p>
	 *
	 */
	public void purc_dpt_cd(String value) {
		setConstString(offset + 13, $purc_dpt_cd, value);
	}

	/**
	 * ＩＦ購買部門ＣＤ. IF purchasing dept. cd..<p>
	 *
	 */
	public String if_purc_dpt_cd() {
		return getConstString(offset + 14, $if_purc_dpt_cd);
	}

	/**
	 * ＩＦ購買部門ＣＤ. IF purchasing dept. cd..<p>
	 *
	 */
	public void if_purc_dpt_cd(String value) {
		setConstString(offset + 14, $if_purc_dpt_cd, value);
	}

	/**
	 * 購買部門名. Purchasing dept. name.<p>
	 *
	 */
	public String purc_dpt_nm() {
		return getConstString(offset + 15, $purc_dpt_nm);
	}

	/**
	 * 購買部門名. Purchasing dept. name.<p>
	 *
	 */
	public void purc_dpt_nm(String value) {
		setConstString(offset + 15, $purc_dpt_nm, value);
	}

	/**
	 * 購買担当者ＣＤ. Purchasing PIC cd..<p>
	 *
	 */
	public String purc_usr_cd() {
		return getConstString(offset + 16, $purc_usr_cd);
	}

	/**
	 * 購買担当者ＣＤ. Purchasing PIC cd..<p>
	 *
	 */
	public void purc_usr_cd(String value) {
		setConstString(offset + 16, $purc_usr_cd, value);
	}

	/**
	 * ＩＦ購買担当者ＣＤ. IF purchasing PIC cd..<p>
	 *
	 */
	public String if_purc_usr_cd() {
		return getConstString(offset + 17, $if_purc_usr_cd);
	}

	/**
	 * ＩＦ購買担当者ＣＤ. IF purchasing PIC cd..<p>
	 *
	 */
	public void if_purc_usr_cd(String value) {
		setConstString(offset + 17, $if_purc_usr_cd, value);
	}

	/**
	 * 購買担当者名. Purchasing PIC name.<p>
	 *
	 */
	public String purc_usr_nm() {
		return getConstString(offset + 18, $purc_usr_nm);
	}

	/**
	 * 購買担当者名. Purchasing PIC name.<p>
	 *
	 */
	public void purc_usr_nm(String value) {
		setConstString(offset + 18, $purc_usr_nm, value);
	}

	/**
	 * ワーキンググループＣＤ. WG cd..<p>
	 *
	 */
	public String wg_cd() {
		return getConstString(offset + 19, $wg_cd);
	}

	/**
	 * ワーキンググループＣＤ. WG cd..<p>
	 *
	 */
	public void wg_cd(String value) {
		setConstString(offset + 19, $wg_cd, value);
	}

	/**
	 * 発注先ＣＤ. Supplier cd..<p>
	 *
	 */
	public String sppl_cd() {
		return getConstString(offset + 20, $sppl_cd);
	}

	/**
	 * 発注先ＣＤ. Supplier cd..<p>
	 *
	 */
	public void sppl_cd(String value) {
		setConstString(offset + 20, $sppl_cd, value);
	}

	/**
	 * ＩＦ発注先ＣＤ. IF supplier cd..<p>
	 *
	 */
	public String if_sppl_cd() {
		return getConstString(offset + 21, $if_sppl_cd);
	}

	/**
	 * ＩＦ発注先ＣＤ. IF supplier cd..<p>
	 *
	 */
	public void if_sppl_cd(String value) {
		setConstString(offset + 21, $if_sppl_cd, value);
	}

	/**
	 * 発注先名. Supplier name.<p>
	 *
	 */
	public String sppl_nm() {
		return getConstString(offset + 22, $sppl_nm);
	}

	/**
	 * 発注先名. Supplier name.<p>
	 *
	 */
	public void sppl_nm(String value) {
		setConstString(offset + 22, $sppl_nm, value);
	}

	/**
	 * 発注先国ＣＤ. Supplier country cd..<p>
	 *
	 */
	public String sppl_cntry_cd() {
		return getConstString(offset + 23, $sppl_cntry_cd);
	}

	/**
	 * 発注先国ＣＤ. Supplier country cd..<p>
	 *
	 */
	public void sppl_cntry_cd(String value) {
		setConstString(offset + 23, $sppl_cntry_cd, value);
	}

	/**
	 * ＩＦ発注先国ＣＤ. IF supplier country cd..<p>
	 *
	 */
	public String if_sppl_cntry_cd() {
		return getConstString(offset + 24, $if_sppl_cntry_cd);
	}

	/**
	 * ＩＦ発注先国ＣＤ. IF supplier country cd..<p>
	 *
	 */
	public void if_sppl_cntry_cd(String value) {
		setConstString(offset + 24, $if_sppl_cntry_cd, value);
	}

	/**
	 * 計上日. Recording date.<p>
	 *
	 */
	public MCDate ac_dt() {
		return getConstDate(offset + 25, $ac_dt);
	}

	/**
	 * 計上日. Recording date.<p>
	 *
	 */
	public void ac_dt(MCDate value) {
		setConstDate(offset + 25, $ac_dt, value);
	}

	/**
	 * 計上年月. Recording month.<p>
	 *
	 */
	public MCDate ac_ym() {
		return getConstDate(offset + 26, $ac_ym);
	}

	/**
	 * 計上年月. Recording month.<p>
	 *
	 */
	public void ac_ym(MCDate value) {
		setConstDate(offset + 26, $ac_ym, value);
	}

	/**
	 * 仕入日. Purchase date.<p>
	 *
	 */
	public MCDate purc_dt() {
		return getConstDate(offset + 27, $purc_dt);
	}

	/**
	 * 仕入日. Purchase date.<p>
	 *
	 */
	public void purc_dt(MCDate value) {
		setConstDate(offset + 27, $purc_dt, value);
	}

	/**
	 * 赤伝計上日. Credit voucher recording date.<p>
	 *
	 */
	public MCDate red_slip_ac_dt() {
		return getConstDate(offset + 28, $red_slip_ac_dt);
	}

	/**
	 * 赤伝計上日. Credit voucher recording date.<p>
	 *
	 */
	public void red_slip_ac_dt(MCDate value) {
		setConstDate(offset + 28, $red_slip_ac_dt, value);
	}

	/**
	 * 赤伝計上年月. Credit voucher recording month.<p>
	 *
	 */
	public MCDate red_slip_ac_ym() {
		return getConstDate(offset + 29, $red_slip_ac_ym);
	}

	/**
	 * 赤伝計上年月. Credit voucher recording month.<p>
	 *
	 */
	public void red_slip_ac_ym(MCDate value) {
		setConstDate(offset + 29, $red_slip_ac_ym, value);
	}

	/**
	 * 支払予定日. Scheduled payment date.<p>
	 *
	 */
	public MCDate pay_schd_dt() {
		return getConstDate(offset + 30, $pay_schd_dt);
	}

	/**
	 * 支払予定日. Scheduled payment date.<p>
	 *
	 */
	public void pay_schd_dt(MCDate value) {
		setConstDate(offset + 30, $pay_schd_dt, value);
	}

	/**
	 * 納入先識別区分. Delivery destination identification type.<p>
	 *
	 */
	public String in_to_id_typ() {
		return getConstString(offset + 31, $in_to_id_typ);
	}

	/**
	 * 納入先識別区分. Delivery destination identification type.<p>
	 *
	 */
	public void in_to_id_typ(String value) {
		setConstString(offset + 31, $in_to_id_typ, value);
	}

	/**
	 * 納入先識別ＣＤ. Delivery destination identification cd..<p>
	 *
	 */
	public String in_to_id_cd() {
		return getConstString(offset + 32, $in_to_id_cd);
	}

	/**
	 * 納入先識別ＣＤ. Delivery destination identification cd..<p>
	 *
	 */
	public void in_to_id_cd(String value) {
		setConstString(offset + 32, $in_to_id_cd, value);
	}

	/**
	 * ＩＦ納入先識別ＣＤ. IF delivery destination identification cd..<p>
	 *
	 */
	public String if_in_to_id_cd() {
		return getConstString(offset + 33, $if_in_to_id_cd);
	}

	/**
	 * ＩＦ納入先識別ＣＤ. IF delivery destination identification cd..<p>
	 *
	 */
	public void if_in_to_id_cd(String value) {
		setConstString(offset + 33, $if_in_to_id_cd, value);
	}

	/**
	 * 納入先名. Delivery destination name.<p>
	 *
	 */
	public String in_to_nm() {
		return getConstString(offset + 34, $in_to_nm);
	}

	/**
	 * 納入先名. Delivery destination name.<p>
	 *
	 */
	public void in_to_nm(String value) {
		setConstString(offset + 34, $in_to_nm, value);
	}

	/**
	 * 納入先郵便番号. Delivery destination zip code.<p>
	 *
	 */
	public String in_to_zip_cd() {
		return getConstString(offset + 35, $in_to_zip_cd);
	}

	/**
	 * 納入先郵便番号. Delivery destination zip code.<p>
	 *
	 */
	public void in_to_zip_cd(String value) {
		setConstString(offset + 35, $in_to_zip_cd, value);
	}

	/**
	 * 納入先住所１. Delivery destination address1.<p>
	 *
	 */
	public String in_to_addr1() {
		return getConstString(offset + 36, $in_to_addr1);
	}

	/**
	 * 納入先住所１. Delivery destination address1.<p>
	 *
	 */
	public void in_to_addr1(String value) {
		setConstString(offset + 36, $in_to_addr1, value);
	}

	/**
	 * 納入先住所２. Delivery destination address2.<p>
	 *
	 */
	public String in_to_addr2() {
		return getConstString(offset + 37, $in_to_addr2);
	}

	/**
	 * 納入先住所２. Delivery destination address2.<p>
	 *
	 */
	public void in_to_addr2(String value) {
		setConstString(offset + 37, $in_to_addr2, value);
	}

	/**
	 * 納入先住所３. Delivery destination address3.<p>
	 *
	 */
	public String in_to_addr3() {
		return getConstString(offset + 38, $in_to_addr3);
	}

	/**
	 * 納入先住所３. Delivery destination address3.<p>
	 *
	 */
	public void in_to_addr3(String value) {
		setConstString(offset + 38, $in_to_addr3, value);
	}

	/**
	 * 納入先住所４. Delivery destination address4.<p>
	 *
	 */
	public String in_to_addr4() {
		return getConstString(offset + 39, $in_to_addr4);
	}

	/**
	 * 納入先住所４. Delivery destination address4.<p>
	 *
	 */
	public void in_to_addr4(String value) {
		setConstString(offset + 39, $in_to_addr4, value);
	}

	/**
	 * 納入先担当部署. Delivery destination dept. in charge.<p>
	 *
	 */
	public String in_to_cntct_dpt() {
		return getConstString(offset + 40, $in_to_cntct_dpt);
	}

	/**
	 * 納入先担当部署. Delivery destination dept. in charge.<p>
	 *
	 */
	public void in_to_cntct_dpt(String value) {
		setConstString(offset + 40, $in_to_cntct_dpt, value);
	}

	/**
	 * 納入先担当者. Delivery destination PIC.<p>
	 *
	 */
	public String in_to_cntct_psn() {
		return getConstString(offset + 41, $in_to_cntct_psn);
	}

	/**
	 * 納入先担当者. Delivery destination PIC.<p>
	 *
	 */
	public void in_to_cntct_psn(String value) {
		setConstString(offset + 41, $in_to_cntct_psn, value);
	}

	/**
	 * 納入先ＴＥＬ. Delivery destination TEL.<p>
	 *
	 */
	public String in_to_tel() {
		return getConstString(offset + 42, $in_to_tel);
	}

	/**
	 * 納入先ＴＥＬ. Delivery destination TEL.<p>
	 *
	 */
	public void in_to_tel(String value) {
		setConstString(offset + 42, $in_to_tel, value);
	}

	/**
	 * 納入先ＦＡＸ. Delivery destination FAX.<p>
	 *
	 */
	public String in_to_fax() {
		return getConstString(offset + 43, $in_to_fax);
	}

	/**
	 * 納入先ＦＡＸ. Delivery destination FAX.<p>
	 *
	 */
	public void in_to_fax(String value) {
		setConstString(offset + 43, $in_to_fax, value);
	}

	/**
	 * 納入先諸口ＦＬＧ. Miscellaneous delivery destination flg..<p>
	 *
	 */
	public boolean in_to_sundry_flg() {
		return getConstBoolean(offset + 44, $in_to_sundry_flg);
	}

	/**
	 * 納入先諸口ＦＬＧ. Miscellaneous delivery destination flg..<p>
	 *
	 */
	public void in_to_sundry_flg(boolean value) {
		setConstBoolean(offset + 44, $in_to_sundry_flg, value);
	}

	/**
	 * 納入先国ＣＤ. Delivery destination country cd..<p>
	 *
	 */
	public String in_to_cntry_cd() {
		return getConstString(offset + 45, $in_to_cntry_cd);
	}

	/**
	 * 納入先国ＣＤ. Delivery destination country cd..<p>
	 *
	 */
	public void in_to_cntry_cd(String value) {
		setConstString(offset + 45, $in_to_cntry_cd, value);
	}

	/**
	 * ＩＦ納入先国ＣＤ. IF delivery destination country cd..<p>
	 *
	 */
	public String if_in_to_cntry_cd() {
		return getConstString(offset + 46, $if_in_to_cntry_cd);
	}

	/**
	 * ＩＦ納入先国ＣＤ. IF delivery destination country cd..<p>
	 *
	 */
	public void if_in_to_cntry_cd(String value) {
		setConstString(offset + 46, $if_in_to_cntry_cd, value);
	}

	/**
	 * 配送先ＣＤ. Receiving point cd..<p>
	 *
	 */
	public String tdlv_cd() {
		return getConstString(offset + 47, $tdlv_cd);
	}

	/**
	 * 配送先ＣＤ. Receiving point cd..<p>
	 *
	 */
	public void tdlv_cd(String value) {
		setConstString(offset + 47, $tdlv_cd, value);
	}

	/**
	 * ＩＦ配送先ＣＤ. IF receiving point cd..<p>
	 *
	 */
	public String if_tdlv_cd() {
		return getConstString(offset + 48, $if_tdlv_cd);
	}

	/**
	 * ＩＦ配送先ＣＤ. IF receiving point cd..<p>
	 *
	 */
	public void if_tdlv_cd(String value) {
		setConstString(offset + 48, $if_tdlv_cd, value);
	}

	/**
	 * 配送先名. Receiving point name.<p>
	 *
	 */
	public String tdlv_nm() {
		return getConstString(offset + 49, $tdlv_nm);
	}

	/**
	 * 配送先名. Receiving point name.<p>
	 *
	 */
	public void tdlv_nm(String value) {
		setConstString(offset + 49, $tdlv_nm, value);
	}

	/**
	 * 配送先郵便番号. Receiving point zip code.<p>
	 *
	 */
	public String tdlv_zip_cd() {
		return getConstString(offset + 50, $tdlv_zip_cd);
	}

	/**
	 * 配送先郵便番号. Receiving point zip code.<p>
	 *
	 */
	public void tdlv_zip_cd(String value) {
		setConstString(offset + 50, $tdlv_zip_cd, value);
	}

	/**
	 * 配送先住所１. Receiving point address 1.<p>
	 *
	 */
	public String tdlv_addr1() {
		return getConstString(offset + 51, $tdlv_addr1);
	}

	/**
	 * 配送先住所１. Receiving point address 1.<p>
	 *
	 */
	public void tdlv_addr1(String value) {
		setConstString(offset + 51, $tdlv_addr1, value);
	}

	/**
	 * 配送先住所２. Receiving point address 2.<p>
	 *
	 */
	public String tdlv_addr2() {
		return getConstString(offset + 52, $tdlv_addr2);
	}

	/**
	 * 配送先住所２. Receiving point address 2.<p>
	 *
	 */
	public void tdlv_addr2(String value) {
		setConstString(offset + 52, $tdlv_addr2, value);
	}

	/**
	 * 配送先住所３. Receiving point address 3.<p>
	 *
	 */
	public String tdlv_addr3() {
		return getConstString(offset + 53, $tdlv_addr3);
	}

	/**
	 * 配送先住所３. Receiving point address 3.<p>
	 *
	 */
	public void tdlv_addr3(String value) {
		setConstString(offset + 53, $tdlv_addr3, value);
	}

	/**
	 * 配送先住所４. Receiving point address 4.<p>
	 *
	 */
	public String tdlv_addr4() {
		return getConstString(offset + 54, $tdlv_addr4);
	}

	/**
	 * 配送先住所４. Receiving point address 4.<p>
	 *
	 */
	public void tdlv_addr4(String value) {
		setConstString(offset + 54, $tdlv_addr4, value);
	}

	/**
	 * 配送先担当部署. Delivery destination dept..<p>
	 *
	 */
	public String tdlv_cntct_dpt() {
		return getConstString(offset + 55, $tdlv_cntct_dpt);
	}

	/**
	 * 配送先担当部署. Delivery destination dept..<p>
	 *
	 */
	public void tdlv_cntct_dpt(String value) {
		setConstString(offset + 55, $tdlv_cntct_dpt, value);
	}

	/**
	 * 配送先担当者. Receiving point PIC.<p>
	 *
	 */
	public String tdlv_cntct_psn() {
		return getConstString(offset + 56, $tdlv_cntct_psn);
	}

	/**
	 * 配送先担当者. Receiving point PIC.<p>
	 *
	 */
	public void tdlv_cntct_psn(String value) {
		setConstString(offset + 56, $tdlv_cntct_psn, value);
	}

	/**
	 * 配送先ＴＥＬ. Receiving point TEL.<p>
	 *
	 */
	public String tdlv_tel() {
		return getConstString(offset + 57, $tdlv_tel);
	}

	/**
	 * 配送先ＴＥＬ. Receiving point TEL.<p>
	 *
	 */
	public void tdlv_tel(String value) {
		setConstString(offset + 57, $tdlv_tel, value);
	}

	/**
	 * 配送先ＦＡＸ. Receiving point FAX.<p>
	 *
	 */
	public String tdlv_fax() {
		return getConstString(offset + 58, $tdlv_fax);
	}

	/**
	 * 配送先ＦＡＸ. Receiving point FAX.<p>
	 *
	 */
	public void tdlv_fax(String value) {
		setConstString(offset + 58, $tdlv_fax, value);
	}

	/**
	 * 配送先諸口ＦＬＧ. Miscellaneous receiving point flg..<p>
	 *
	 */
	public boolean tdlv_sundry_flg() {
		return getConstBoolean(offset + 59, $tdlv_sundry_flg);
	}

	/**
	 * 配送先諸口ＦＬＧ. Miscellaneous receiving point flg..<p>
	 *
	 */
	public void tdlv_sundry_flg(boolean value) {
		setConstBoolean(offset + 59, $tdlv_sundry_flg, value);
	}

	/**
	 * 配送先国ＣＤ. Receiving point country cd..<p>
	 *
	 */
	public String tdlv_cntry_cd() {
		return getConstString(offset + 60, $tdlv_cntry_cd);
	}

	/**
	 * 配送先国ＣＤ. Receiving point country cd..<p>
	 *
	 */
	public void tdlv_cntry_cd(String value) {
		setConstString(offset + 60, $tdlv_cntry_cd, value);
	}

	/**
	 * ＩＦ配送先国ＣＤ. IF receiving point country cd..<p>
	 *
	 */
	public String if_tdlv_cntry_cd() {
		return getConstString(offset + 61, $if_tdlv_cntry_cd);
	}

	/**
	 * ＩＦ配送先国ＣＤ. IF receiving point country cd..<p>
	 *
	 */
	public void if_tdlv_cntry_cd(String value) {
		setConstString(offset + 61, $if_tdlv_cntry_cd, value);
	}

	/**
	 * 工場・物流倉庫ＣＤ. Factory/Distribution warehouse cd..<p>
	 *
	 */
	public String site_cd() {
		return getConstString(offset + 62, $site_cd);
	}

	/**
	 * 工場・物流倉庫ＣＤ. Factory/Distribution warehouse cd..<p>
	 *
	 */
	public void site_cd(String value) {
		setConstString(offset + 62, $site_cd, value);
	}

	/**
	 * ＩＦ工場・物流倉庫ＣＤ. IF factory/distribution warehouse cd..<p>
	 *
	 */
	public String if_site_cd() {
		return getConstString(offset + 63, $if_site_cd);
	}

	/**
	 * ＩＦ工場・物流倉庫ＣＤ. IF factory/distribution warehouse cd..<p>
	 *
	 */
	public void if_site_cd(String value) {
		setConstString(offset + 63, $if_site_cd, value);
	}

	/**
	 * 工場・物流倉庫名. Factory/Distribution warehouse name.<p>
	 *
	 */
	public String site_nm() {
		return getConstString(offset + 64, $site_nm);
	}

	/**
	 * 工場・物流倉庫名. Factory/Distribution warehouse name.<p>
	 *
	 */
	public void site_nm(String value) {
		setConstString(offset + 64, $site_nm, value);
	}

	/**
	 * 直送ＦＬＧ. Direct-delivery flg..<p>
	 *
	 */
	public boolean drct_dlv_flg() {
		return getConstBoolean(offset + 65, $drct_dlv_flg);
	}

	/**
	 * 直送ＦＬＧ. Direct-delivery flg..<p>
	 *
	 */
	public void drct_dlv_flg(boolean value) {
		setConstBoolean(offset + 65, $drct_dlv_flg, value);
	}

	/**
	 * 直送先会社ＣＤ. Direct-delivery destination company cd..<p>
	 *
	 */
	public String drct_dlv_bp_cd() {
		return getConstString(offset + 66, $drct_dlv_bp_cd);
	}

	/**
	 * 直送先会社ＣＤ. Direct-delivery destination company cd..<p>
	 *
	 */
	public void drct_dlv_bp_cd(String value) {
		setConstString(offset + 66, $drct_dlv_bp_cd, value);
	}

	/**
	 * ＩＦ直送先会社ＣＤ. IF direct-delivery destination company cd..<p>
	 *
	 */
	public String if_drct_dlv_bp_cd() {
		return getConstString(offset + 67, $if_drct_dlv_bp_cd);
	}

	/**
	 * ＩＦ直送先会社ＣＤ. IF direct-delivery destination company cd..<p>
	 *
	 */
	public void if_drct_dlv_bp_cd(String value) {
		setConstString(offset + 67, $if_drct_dlv_bp_cd, value);
	}

	/**
	 * 直送先会社名. Direct-delivery destination company name.<p>
	 *
	 */
	public String drct_dlv_bp_nm() {
		return getConstString(offset + 68, $drct_dlv_bp_nm);
	}

	/**
	 * 直送先会社名. Direct-delivery destination company name.<p>
	 *
	 */
	public void drct_dlv_bp_nm(String value) {
		setConstString(offset + 68, $drct_dlv_bp_nm, value);
	}

	/**
	 * 直送先国ＣＤ. Direct-delivery destination country cd..<p>
	 *
	 */
	public String drct_dlv_cntry_cd() {
		return getConstString(offset + 69, $drct_dlv_cntry_cd);
	}

	/**
	 * 直送先国ＣＤ. Direct-delivery destination country cd..<p>
	 *
	 */
	public void drct_dlv_cntry_cd(String value) {
		setConstString(offset + 69, $drct_dlv_cntry_cd, value);
	}

	/**
	 * ＩＦ直送先国ＣＤ. IF direct-delivery destination country.<p>
	 *
	 */
	public String if_drct_dlv_cntry_cd() {
		return getConstString(offset + 70, $if_drct_dlv_cntry_cd);
	}

	/**
	 * ＩＦ直送先国ＣＤ. IF direct-delivery destination country.<p>
	 *
	 */
	public void if_drct_dlv_cntry_cd(String value) {
		setConstString(offset + 70, $if_drct_dlv_cntry_cd, value);
	}

	/**
	 * 取引通貨ＣＤ. Transaction currency cd..<p>
	 *
	 */
	public String trd_cur_cd() {
		return getConstString(offset + 71, $trd_cur_cd);
	}

	/**
	 * 取引通貨ＣＤ. Transaction currency cd..<p>
	 *
	 */
	public void trd_cur_cd(String value) {
		setConstString(offset + 71, $trd_cur_cd, value);
	}

	/**
	 * ＩＦ取引通貨ＣＤ. IF transaction currency cd..<p>
	 *
	 */
	public String if_trd_cur_cd() {
		return getConstString(offset + 72, $if_trd_cur_cd);
	}

	/**
	 * ＩＦ取引通貨ＣＤ. IF transaction currency cd..<p>
	 *
	 */
	public void if_trd_cur_cd(String value) {
		setConstString(offset + 72, $if_trd_cur_cd, value);
	}

	/**
	 * 取引条件ＣＤ１. Transaction terms cd. 1.<p>
	 *
	 */
	public String tterm_cd1() {
		return getConstString(offset + 73, $tterm_cd1);
	}

	/**
	 * 取引条件ＣＤ１. Transaction terms cd. 1.<p>
	 *
	 */
	public void tterm_cd1(String value) {
		setConstString(offset + 73, $tterm_cd1, value);
	}

	/**
	 * ＩＦ取引条件ＣＤ１. IF transaction terms cd. 1.<p>
	 *
	 */
	public String if_tterm_cd1() {
		return getConstString(offset + 74, $if_tterm_cd1);
	}

	/**
	 * ＩＦ取引条件ＣＤ１. IF transaction terms cd. 1.<p>
	 *
	 */
	public void if_tterm_cd1(String value) {
		setConstString(offset + 74, $if_tterm_cd1, value);
	}

	/**
	 * 取引条件名１. Transaction terms name 1.<p>
	 *
	 */
	public String tterm_nm1() {
		return getConstString(offset + 75, $tterm_nm1);
	}

	/**
	 * 取引条件名１. Transaction terms name 1.<p>
	 *
	 */
	public void tterm_nm1(String value) {
		setConstString(offset + 75, $tterm_nm1, value);
	}

	/**
	 * 取引条件備考１. Transaction terms remarks 1.<p>
	 *
	 */
	public String tterm_rmrks1() {
		return getConstString(offset + 76, $tterm_rmrks1);
	}

	/**
	 * 取引条件備考１. Transaction terms remarks 1.<p>
	 *
	 */
	public void tterm_rmrks1(String value) {
		setConstString(offset + 76, $tterm_rmrks1, value);
	}

	/**
	 * 取引条件ＣＤ２. Transaction terms cd. 2.<p>
	 *
	 */
	public String tterm_cd2() {
		return getConstString(offset + 77, $tterm_cd2);
	}

	/**
	 * 取引条件ＣＤ２. Transaction terms cd. 2.<p>
	 *
	 */
	public void tterm_cd2(String value) {
		setConstString(offset + 77, $tterm_cd2, value);
	}

	/**
	 * ＩＦ取引条件ＣＤ２. IF transaction terms cd. 2.<p>
	 *
	 */
	public String if_tterm_cd2() {
		return getConstString(offset + 78, $if_tterm_cd2);
	}

	/**
	 * ＩＦ取引条件ＣＤ２. IF transaction terms cd. 2.<p>
	 *
	 */
	public void if_tterm_cd2(String value) {
		setConstString(offset + 78, $if_tterm_cd2, value);
	}

	/**
	 * 取引条件名２. Transaction terms name 2.<p>
	 *
	 */
	public String tterm_nm2() {
		return getConstString(offset + 79, $tterm_nm2);
	}

	/**
	 * 取引条件名２. Transaction terms name 2.<p>
	 *
	 */
	public void tterm_nm2(String value) {
		setConstString(offset + 79, $tterm_nm2, value);
	}

	/**
	 * 取引条件備考２. Transaction terms remarks 2.<p>
	 *
	 */
	public String tterm_rmrks2() {
		return getConstString(offset + 80, $tterm_rmrks2);
	}

	/**
	 * 取引条件備考２. Transaction terms remarks 2.<p>
	 *
	 */
	public void tterm_rmrks2(String value) {
		setConstString(offset + 80, $tterm_rmrks2, value);
	}

	/**
	 * 取引条件ＣＤ３. Transaction terms cd. 3.<p>
	 *
	 */
	public String tterm_cd3() {
		return getConstString(offset + 81, $tterm_cd3);
	}

	/**
	 * 取引条件ＣＤ３. Transaction terms cd. 3.<p>
	 *
	 */
	public void tterm_cd3(String value) {
		setConstString(offset + 81, $tterm_cd3, value);
	}

	/**
	 * ＩＦ取引条件ＣＤ３. IF transaction terms cd. 3.<p>
	 *
	 */
	public String if_tterm_cd3() {
		return getConstString(offset + 82, $if_tterm_cd3);
	}

	/**
	 * ＩＦ取引条件ＣＤ３. IF transaction terms cd. 3.<p>
	 *
	 */
	public void if_tterm_cd3(String value) {
		setConstString(offset + 82, $if_tterm_cd3, value);
	}

	/**
	 * 取引条件名３. Transaction terms name 3.<p>
	 *
	 */
	public String tterm_nm3() {
		return getConstString(offset + 83, $tterm_nm3);
	}

	/**
	 * 取引条件名３. Transaction terms name 3.<p>
	 *
	 */
	public void tterm_nm3(String value) {
		setConstString(offset + 83, $tterm_nm3, value);
	}

	/**
	 * 取引条件備考３. Transaction terms remarks 3.<p>
	 *
	 */
	public String tterm_rmrks3() {
		return getConstString(offset + 84, $tterm_rmrks3);
	}

	/**
	 * 取引条件備考３. Transaction terms remarks 3.<p>
	 *
	 */
	public void tterm_rmrks3(String value) {
		setConstString(offset + 84, $tterm_rmrks3, value);
	}

	/**
	 * 品目ＣＤ. Item cd..<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 85, $itm_cd);
	}

	/**
	 * 品目ＣＤ. Item cd..<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 85, $itm_cd, value);
	}

	/**
	 * 枝番１. Branch No. 1.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 86, $itm_sub1);
	}

	/**
	 * 枝番１. Branch No. 1.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 86, $itm_sub1, value);
	}

	/**
	 * 枝番２. Branch No. 2.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 87, $itm_sub2);
	}

	/**
	 * 枝番２. Branch No. 2.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 87, $itm_sub2, value);
	}

	/**
	 * 枝番３. Branch No. 3.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 88, $itm_sub3);
	}

	/**
	 * 枝番３. Branch No. 3.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 88, $itm_sub3, value);
	}

	/**
	 * ＩＦ品目ＣＤ. IF item cd..<p>
	 *
	 */
	public String if_itm_cd() {
		return getConstString(offset + 89, $if_itm_cd);
	}

	/**
	 * ＩＦ品目ＣＤ. IF item cd..<p>
	 *
	 */
	public void if_itm_cd(String value) {
		setConstString(offset + 89, $if_itm_cd, value);
	}

	/**
	 * ＩＦ枝番１. IF branch No. 1.<p>
	 *
	 */
	public String if_itm_sub1() {
		return getConstString(offset + 90, $if_itm_sub1);
	}

	/**
	 * ＩＦ枝番１. IF branch No. 1.<p>
	 *
	 */
	public void if_itm_sub1(String value) {
		setConstString(offset + 90, $if_itm_sub1, value);
	}

	/**
	 * ＩＦ枝番２. IF branch No. 2.<p>
	 *
	 */
	public String if_itm_sub2() {
		return getConstString(offset + 91, $if_itm_sub2);
	}

	/**
	 * ＩＦ枝番２. IF branch No. 2.<p>
	 *
	 */
	public void if_itm_sub2(String value) {
		setConstString(offset + 91, $if_itm_sub2, value);
	}

	/**
	 * ＩＦ枝番３. IF branch No. 3.<p>
	 *
	 */
	public String if_itm_sub3() {
		return getConstString(offset + 92, $if_itm_sub3);
	}

	/**
	 * ＩＦ枝番３. IF branch No. 3.<p>
	 *
	 */
	public void if_itm_sub3(String value) {
		setConstString(offset + 92, $if_itm_sub3, value);
	}

	/**
	 * 諸口品ＦＬＧ. Miscellaneous item flg..<p>
	 *
	 */
	public boolean sundry_itm_flg() {
		return getConstBoolean(offset + 93, $sundry_itm_flg);
	}

	/**
	 * 諸口品ＦＬＧ. Miscellaneous item flg..<p>
	 *
	 */
	public void sundry_itm_flg(boolean value) {
		setConstBoolean(offset + 93, $sundry_itm_flg, value);
	}

	/**
	 * 品名. Item name.<p>
	 *
	 */
	public String itm_nm() {
		return getConstString(offset + 94, $itm_nm);
	}

	/**
	 * 品名. Item name.<p>
	 *
	 */
	public void itm_nm(String value) {
		setConstString(offset + 94, $itm_nm, value);
	}

	/**
	 * インボイス表記品名. Item name for invoice.<p>
	 *
	 */
	public String iv_itm_nm() {
		return getConstString(offset + 95, $iv_itm_nm);
	}

	/**
	 * インボイス表記品名. Item name for invoice.<p>
	 *
	 */
	public void iv_itm_nm(String value) {
		setConstString(offset + 95, $iv_itm_nm, value);
	}

	/**
	 * 発注先品目ＣＤ. Supplier item cd..<p>
	 *
	 */
	public String sppl_itm_cd() {
		return getConstString(offset + 96, $sppl_itm_cd);
	}

	/**
	 * 発注先品目ＣＤ. Supplier item cd..<p>
	 *
	 */
	public void sppl_itm_cd(String value) {
		setConstString(offset + 96, $sppl_itm_cd, value);
	}

	/**
	 * 発注先品名. Supplier item name.<p>
	 *
	 */
	public String sppl_itm_nm() {
		return getConstString(offset + 97, $sppl_itm_nm);
	}

	/**
	 * 発注先品名. Supplier item name.<p>
	 *
	 */
	public void sppl_itm_nm(String value) {
		setConstString(offset + 97, $sppl_itm_nm, value);
	}

	/**
	 * 業者ロットＮＯ. Vendor lot No..<p>
	 *
	 */
	public String bp_lot_no() {
		return getConstString(offset + 98, $bp_lot_no);
	}

	/**
	 * 業者ロットＮＯ. Vendor lot No..<p>
	 *
	 */
	public void bp_lot_no(String value) {
		setConstString(offset + 98, $bp_lot_no, value);
	}

	/**
	 * 取引単位ＣＤ. Transaction unit cd..<p>
	 *
	 */
	public String trd_unit_cd() {
		return getConstString(offset + 99, $trd_unit_cd);
	}

	/**
	 * 取引単位ＣＤ. Transaction unit cd..<p>
	 *
	 */
	public void trd_unit_cd(String value) {
		setConstString(offset + 99, $trd_unit_cd, value);
	}

	/**
	 * ＩＦ取引単位ＣＤ. IF transaction unit cd..<p>
	 *
	 */
	public String if_trd_unit_cd() {
		return getConstString(offset + 100, $if_trd_unit_cd);
	}

	/**
	 * ＩＦ取引単位ＣＤ. IF transaction unit cd..<p>
	 *
	 */
	public void if_trd_unit_cd(String value) {
		setConstString(offset + 100, $if_trd_unit_cd, value);
	}

	/**
	 * 取引単位名. Transaction unit name.<p>
	 *
	 */
	public String trd_unit_nm() {
		return getConstString(offset + 101, $trd_unit_nm);
	}

	/**
	 * 取引単位名. Transaction unit name.<p>
	 *
	 */
	public void trd_unit_nm(String value) {
		setConstString(offset + 101, $trd_unit_nm, value);
	}

	/**
	 * 取引単位数量. Transaction unit qty..<p>
	 *
	 */
	public MCNumber trd_unit_qty() {
		return getConstNumber(offset + 102, $trd_unit_qty);
	}

	/**
	 * 取引単位数量. Transaction unit qty..<p>
	 *
	 */
	public void trd_unit_qty(MCNumber value) {
		setConstNumber(offset + 102, $trd_unit_qty, value);
	}
	
	/**
	 * 取引単位数量. Transaction unit qty..<p>
	 *
	 */
	public void trd_unit_qty(int value) {
		setConstNumber(offset + 102, $trd_unit_qty, value);
	}
	
	/**
	 * 取引単位数量. Transaction unit qty..<p>
	 *
	 */
	public void trd_unit_qty(long value) {
		setConstNumber(offset + 102, $trd_unit_qty, value);
	}
	
	/**
	 * 取引単位数量. Transaction unit qty..<p>
	 *
	 */
	public void trd_unit_qty(float value) {
		setConstNumber(offset + 102, $trd_unit_qty, value);
	}
	
	/**
	 * 取引単位数量. Transaction unit qty..<p>
	 *
	 */
	public void trd_unit_qty(double value) {
		setConstNumber(offset + 102, $trd_unit_qty, value);
	}
	
	/**
	 * 取引通貨単価. Unit price (Transaction currency).<p>
	 *
	 */
	public MCNumber trd_cur_upri() {
		return getConstNumber(offset + 103, $trd_cur_upri);
	}

	/**
	 * 取引通貨単価. Unit price (Transaction currency).<p>
	 *
	 */
	public void trd_cur_upri(MCNumber value) {
		setConstNumber(offset + 103, $trd_cur_upri, value);
	}
	
	/**
	 * 取引通貨単価. Unit price (Transaction currency).<p>
	 *
	 */
	public void trd_cur_upri(int value) {
		setConstNumber(offset + 103, $trd_cur_upri, value);
	}
	
	/**
	 * 取引通貨単価. Unit price (Transaction currency).<p>
	 *
	 */
	public void trd_cur_upri(long value) {
		setConstNumber(offset + 103, $trd_cur_upri, value);
	}
	
	/**
	 * 取引通貨単価. Unit price (Transaction currency).<p>
	 *
	 */
	public void trd_cur_upri(float value) {
		setConstNumber(offset + 103, $trd_cur_upri, value);
	}
	
	/**
	 * 取引通貨単価. Unit price (Transaction currency).<p>
	 *
	 */
	public void trd_cur_upri(double value) {
		setConstNumber(offset + 103, $trd_cur_upri, value);
	}
	
	/**
	 * 取引通貨金額. Amount (Transaction currency).<p>
	 *
	 */
	public MCNumber trd_cur_amt() {
		return getConstNumber(offset + 104, $trd_cur_amt);
	}

	/**
	 * 取引通貨金額. Amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_amt(MCNumber value) {
		setConstNumber(offset + 104, $trd_cur_amt, value);
	}
	
	/**
	 * 取引通貨金額. Amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_amt(int value) {
		setConstNumber(offset + 104, $trd_cur_amt, value);
	}
	
	/**
	 * 取引通貨金額. Amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_amt(long value) {
		setConstNumber(offset + 104, $trd_cur_amt, value);
	}
	
	/**
	 * 取引通貨金額. Amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_amt(float value) {
		setConstNumber(offset + 104, $trd_cur_amt, value);
	}
	
	/**
	 * 取引通貨金額. Amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_amt(double value) {
		setConstNumber(offset + 104, $trd_cur_amt, value);
	}
	
	/**
	 * 取引通貨値引額. Discount amount (Transaction currency).<p>
	 *
	 */
	public MCNumber trd_cur_dscnt_amt() {
		return getConstNumber(offset + 105, $trd_cur_dscnt_amt);
	}

	/**
	 * 取引通貨値引額. Discount amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_dscnt_amt(MCNumber value) {
		setConstNumber(offset + 105, $trd_cur_dscnt_amt, value);
	}
	
	/**
	 * 取引通貨値引額. Discount amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_dscnt_amt(int value) {
		setConstNumber(offset + 105, $trd_cur_dscnt_amt, value);
	}
	
	/**
	 * 取引通貨値引額. Discount amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_dscnt_amt(long value) {
		setConstNumber(offset + 105, $trd_cur_dscnt_amt, value);
	}
	
	/**
	 * 取引通貨値引額. Discount amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_dscnt_amt(float value) {
		setConstNumber(offset + 105, $trd_cur_dscnt_amt, value);
	}
	
	/**
	 * 取引通貨値引額. Discount amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_dscnt_amt(double value) {
		setConstNumber(offset + 105, $trd_cur_dscnt_amt, value);
	}
	
	/**
	 * 値引理由ＣＤ. Discount reason cd..<p>
	 *
	 */
	public String dscnt_rsn_cd() {
		return getConstString(offset + 106, $dscnt_rsn_cd);
	}

	/**
	 * 値引理由ＣＤ. Discount reason cd..<p>
	 *
	 */
	public void dscnt_rsn_cd(String value) {
		setConstString(offset + 106, $dscnt_rsn_cd, value);
	}

	/**
	 * ＩＦ値引理由ＣＤ. IF discount reason cd..<p>
	 *
	 */
	public String if_dscnt_rsn_cd() {
		return getConstString(offset + 107, $if_dscnt_rsn_cd);
	}

	/**
	 * ＩＦ値引理由ＣＤ. IF discount reason cd..<p>
	 *
	 */
	public void if_dscnt_rsn_cd(String value) {
		setConstString(offset + 107, $if_dscnt_rsn_cd, value);
	}

	/**
	 * 値引理由名. Discount reason name.<p>
	 *
	 */
	public String dscnt_rsn_nm() {
		return getConstString(offset + 108, $dscnt_rsn_nm);
	}

	/**
	 * 値引理由名. Discount reason name.<p>
	 *
	 */
	public void dscnt_rsn_nm(String value) {
		setConstString(offset + 108, $dscnt_rsn_nm, value);
	}

	/**
	 * 仮単価ＦＬＧ. Temporary unit price flg..<p>
	 *
	 */
	public boolean interim_flg() {
		return getConstBoolean(offset + 109, $interim_flg);
	}

	/**
	 * 仮単価ＦＬＧ. Temporary unit price flg..<p>
	 *
	 */
	public void interim_flg(boolean value) {
		setConstBoolean(offset + 109, $interim_flg, value);
	}

	/**
	 * 税区分. Tax type.<p>
	 *
	 */
	public String tax_typ() {
		return getConstString(offset + 110, $tax_typ);
	}

	/**
	 * 税区分. Tax type.<p>
	 *
	 */
	public void tax_typ(String value) {
		setConstString(offset + 110, $tax_typ, value);
	}

	/**
	 * 内税ＦＬＧ. Tax inclusive flg..<p>
	 *
	 */
	public boolean inc_tax_flg() {
		return getConstBoolean(offset + 111, $inc_tax_flg);
	}

	/**
	 * 内税ＦＬＧ. Tax inclusive flg..<p>
	 *
	 */
	public void inc_tax_flg(boolean value) {
		setConstBoolean(offset + 111, $inc_tax_flg, value);
	}

	/**
	 * 税ＣＤ. Tax cd..<p>
	 *
	 */
	public String tax_cd() {
		return getConstString(offset + 112, $tax_cd);
	}

	/**
	 * 税ＣＤ. Tax cd..<p>
	 *
	 */
	public void tax_cd(String value) {
		setConstString(offset + 112, $tax_cd, value);
	}

	/**
	 * ＩＦ税ＣＤ. IF tax cd..<p>
	 *
	 */
	public String if_tax_cd() {
		return getConstString(offset + 113, $if_tax_cd);
	}

	/**
	 * ＩＦ税ＣＤ. IF tax cd..<p>
	 *
	 */
	public void if_tax_cd(String value) {
		setConstString(offset + 113, $if_tax_cd, value);
	}

	/**
	 * 税名. Tax name.<p>
	 *
	 */
	public String tax_nm() {
		return getConstString(offset + 114, $tax_nm);
	}

	/**
	 * 税名. Tax name.<p>
	 *
	 */
	public void tax_nm(String value) {
		setConstString(offset + 114, $tax_nm, value);
	}

	/**
	 * 税率. Tax rate.<p>
	 *
	 */
	public MCNumber tax_rate() {
		return getConstNumber(offset + 115, $tax_rate);
	}

	/**
	 * 税率. Tax rate.<p>
	 *
	 */
	public void tax_rate(MCNumber value) {
		setConstNumber(offset + 115, $tax_rate, value);
	}
	
	/**
	 * 税率. Tax rate.<p>
	 *
	 */
	public void tax_rate(int value) {
		setConstNumber(offset + 115, $tax_rate, value);
	}
	
	/**
	 * 税率. Tax rate.<p>
	 *
	 */
	public void tax_rate(long value) {
		setConstNumber(offset + 115, $tax_rate, value);
	}
	
	/**
	 * 税率. Tax rate.<p>
	 *
	 */
	public void tax_rate(float value) {
		setConstNumber(offset + 115, $tax_rate, value);
	}
	
	/**
	 * 税率. Tax rate.<p>
	 *
	 */
	public void tax_rate(double value) {
		setConstNumber(offset + 115, $tax_rate, value);
	}
	
	/**
	 * 取引通貨税額. Tax amount (Transaction currency).<p>
	 *
	 */
	public MCNumber trd_cur_tax_amt() {
		return getConstNumber(offset + 116, $trd_cur_tax_amt);
	}

	/**
	 * 取引通貨税額. Tax amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_tax_amt(MCNumber value) {
		setConstNumber(offset + 116, $trd_cur_tax_amt, value);
	}
	
	/**
	 * 取引通貨税額. Tax amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_tax_amt(int value) {
		setConstNumber(offset + 116, $trd_cur_tax_amt, value);
	}
	
	/**
	 * 取引通貨税額. Tax amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_tax_amt(long value) {
		setConstNumber(offset + 116, $trd_cur_tax_amt, value);
	}
	
	/**
	 * 取引通貨税額. Tax amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_tax_amt(float value) {
		setConstNumber(offset + 116, $trd_cur_tax_amt, value);
	}
	
	/**
	 * 取引通貨税額. Tax amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_tax_amt(double value) {
		setConstNumber(offset + 116, $trd_cur_tax_amt, value);
	}
	
	/**
	 * 源泉税率. Withholding tax rate.<p>
	 *
	 */
	public MCNumber wtax_rate() {
		return getConstNumber(offset + 117, $wtax_rate);
	}

	/**
	 * 源泉税率. Withholding tax rate.<p>
	 *
	 */
	public void wtax_rate(MCNumber value) {
		setConstNumber(offset + 117, $wtax_rate, value);
	}
	
	/**
	 * 源泉税率. Withholding tax rate.<p>
	 *
	 */
	public void wtax_rate(int value) {
		setConstNumber(offset + 117, $wtax_rate, value);
	}
	
	/**
	 * 源泉税率. Withholding tax rate.<p>
	 *
	 */
	public void wtax_rate(long value) {
		setConstNumber(offset + 117, $wtax_rate, value);
	}
	
	/**
	 * 源泉税率. Withholding tax rate.<p>
	 *
	 */
	public void wtax_rate(float value) {
		setConstNumber(offset + 117, $wtax_rate, value);
	}
	
	/**
	 * 源泉税率. Withholding tax rate.<p>
	 *
	 */
	public void wtax_rate(double value) {
		setConstNumber(offset + 117, $wtax_rate, value);
	}
	
	/**
	 * 源泉税額. Withholding tax.<p>
	 *
	 */
	public MCNumber wtax_amt() {
		return getConstNumber(offset + 118, $wtax_amt);
	}

	/**
	 * 源泉税額. Withholding tax.<p>
	 *
	 */
	public void wtax_amt(MCNumber value) {
		setConstNumber(offset + 118, $wtax_amt, value);
	}
	
	/**
	 * 源泉税額. Withholding tax.<p>
	 *
	 */
	public void wtax_amt(int value) {
		setConstNumber(offset + 118, $wtax_amt, value);
	}
	
	/**
	 * 源泉税額. Withholding tax.<p>
	 *
	 */
	public void wtax_amt(long value) {
		setConstNumber(offset + 118, $wtax_amt, value);
	}
	
	/**
	 * 源泉税額. Withholding tax.<p>
	 *
	 */
	public void wtax_amt(float value) {
		setConstNumber(offset + 118, $wtax_amt, value);
	}
	
	/**
	 * 源泉税額. Withholding tax.<p>
	 *
	 */
	public void wtax_amt(double value) {
		setConstNumber(offset + 118, $wtax_amt, value);
	}
	
	/**
	 * 手配ＮＯ１. SEIBAN No. 1.<p>
	 *
	 */
	public String sno1() {
		return getConstString(offset + 119, $sno1);
	}

	/**
	 * 手配ＮＯ１. SEIBAN No. 1.<p>
	 *
	 */
	public void sno1(String value) {
		setConstString(offset + 119, $sno1, value);
	}

	/**
	 * 手配ＮＯ２. SEIBAN No. 2.<p>
	 *
	 */
	public String sno2() {
		return getConstString(offset + 120, $sno2);
	}

	/**
	 * 手配ＮＯ２. SEIBAN No. 2.<p>
	 *
	 */
	public void sno2(String value) {
		setConstString(offset + 120, $sno2, value);
	}

	/**
	 * 手配ＮＯ３. SEIBAN No. 3.<p>
	 *
	 */
	public String sno3() {
		return getConstString(offset + 121, $sno3);
	}

	/**
	 * 手配ＮＯ３. SEIBAN No. 3.<p>
	 *
	 */
	public void sno3(String value) {
		setConstString(offset + 121, $sno3, value);
	}

	/**
	 * 手配ＮＯ４. SEIBAN No. 4.<p>
	 *
	 */
	public String sno4() {
		return getConstString(offset + 122, $sno4);
	}

	/**
	 * 手配ＮＯ４. SEIBAN No. 4.<p>
	 *
	 */
	public void sno4(String value) {
		setConstString(offset + 122, $sno4, value);
	}

	/**
	 * 検収不良ＦＬＧ. Acceptance defective flg..<p>
	 *
	 */
	public boolean accpt_dfct_flg() {
		return getConstBoolean(offset + 123, $accpt_dfct_flg);
	}

	/**
	 * 検収不良ＦＬＧ. Acceptance defective flg..<p>
	 *
	 */
	public void accpt_dfct_flg(boolean value) {
		setConstBoolean(offset + 123, $accpt_dfct_flg, value);
	}

	/**
	 * 仕入実績ＮＯ. Purchase result No..<p>
	 *
	 */
	public String purc_act_no() {
		return getConstString(offset + 124, $purc_act_no);
	}

	/**
	 * 仕入実績ＮＯ. Purchase result No..<p>
	 *
	 */
	public void purc_act_no(String value) {
		setConstString(offset + 124, $purc_act_no, value);
	}

	/**
	 * 仕入実績改訂番号. Purchase result rev. number.<p>
	 *
	 */
	public MCNumber purc_act_rev() {
		return getConstNumber(offset + 125, $purc_act_rev);
	}

	/**
	 * 仕入実績改訂番号. Purchase result rev. number.<p>
	 *
	 */
	public void purc_act_rev(MCNumber value) {
		setConstNumber(offset + 125, $purc_act_rev, value);
	}
	
	/**
	 * 仕入実績改訂番号. Purchase result rev. number.<p>
	 *
	 */
	public void purc_act_rev(int value) {
		setConstNumber(offset + 125, $purc_act_rev, value);
	}
	
	/**
	 * 仕入実績改訂番号. Purchase result rev. number.<p>
	 *
	 */
	public void purc_act_rev(long value) {
		setConstNumber(offset + 125, $purc_act_rev, value);
	}
	
	/**
	 * 仕入実績改訂番号. Purchase result rev. number.<p>
	 *
	 */
	public void purc_act_rev(float value) {
		setConstNumber(offset + 125, $purc_act_rev, value);
	}
	
	/**
	 * 仕入実績改訂番号. Purchase result rev. number.<p>
	 *
	 */
	public void purc_act_rev(double value) {
		setConstNumber(offset + 125, $purc_act_rev, value);
	}
	
	/**
	 * 仕入実績明細ＮＯ. Purchase result details No..<p>
	 *
	 */
	public String purc_act_d_no() {
		return getConstString(offset + 126, $purc_act_d_no);
	}

	/**
	 * 仕入実績明細ＮＯ. Purchase result details No..<p>
	 *
	 */
	public void purc_act_d_no(String value) {
		setConstString(offset + 126, $purc_act_d_no, value);
	}

	/**
	 * ＩＦ会社ＣＤ. IF company cd..<p>
	 *
	 */
	public String if_co_cd() {
		return getConstString(offset + 127, $if_co_cd);
	}

	/**
	 * ＩＦ会社ＣＤ. IF company cd..<p>
	 *
	 */
	public void if_co_cd(String value) {
		setConstString(offset + 127, $if_co_cd, value);
	}

	/**
	 * 会社名. Company name.<p>
	 *
	 */
	public String co_nm() {
		return getConstString(offset + 128, $co_nm);
	}

	/**
	 * 会社名. Company name.<p>
	 *
	 */
	public void co_nm(String value) {
		setConstString(offset + 128, $co_nm, value);
	}

	/**
	 * ログＮＯ. Log No..<p>
	 *
	 */
	public String batch_log_no() {
		return getConstString(offset + 129, $batch_log_no);
	}

	/**
	 * ログＮＯ. Log No..<p>
	 *
	 */
	public void batch_log_no(String value) {
		setConstString(offset + 129, $batch_log_no, value);
	}

	/**
	 * ログサブキー１. Log sub key 1.<p>
	 *
	 */
	public MCNumber log_sub_key1() {
		return getConstNumber(offset + 130, $log_sub_key1);
	}

	/**
	 * ログサブキー１. Log sub key 1.<p>
	 *
	 */
	public void log_sub_key1(MCNumber value) {
		setConstNumber(offset + 130, $log_sub_key1, value);
	}
	
	/**
	 * ログサブキー１. Log sub key 1.<p>
	 *
	 */
	public void log_sub_key1(int value) {
		setConstNumber(offset + 130, $log_sub_key1, value);
	}
	
	/**
	 * ログサブキー１. Log sub key 1.<p>
	 *
	 */
	public void log_sub_key1(long value) {
		setConstNumber(offset + 130, $log_sub_key1, value);
	}
	
	/**
	 * ログサブキー１. Log sub key 1.<p>
	 *
	 */
	public void log_sub_key1(float value) {
		setConstNumber(offset + 130, $log_sub_key1, value);
	}
	
	/**
	 * ログサブキー１. Log sub key 1.<p>
	 *
	 */
	public void log_sub_key1(double value) {
		setConstNumber(offset + 130, $log_sub_key1, value);
	}
	
	/**
	 * ログサブキー２. Log sub key 2.<p>
	 *
	 */
	public MCNumber log_sub_key2() {
		return getConstNumber(offset + 131, $log_sub_key2);
	}

	/**
	 * ログサブキー２. Log sub key 2.<p>
	 *
	 */
	public void log_sub_key2(MCNumber value) {
		setConstNumber(offset + 131, $log_sub_key2, value);
	}
	
	/**
	 * ログサブキー２. Log sub key 2.<p>
	 *
	 */
	public void log_sub_key2(int value) {
		setConstNumber(offset + 131, $log_sub_key2, value);
	}
	
	/**
	 * ログサブキー２. Log sub key 2.<p>
	 *
	 */
	public void log_sub_key2(long value) {
		setConstNumber(offset + 131, $log_sub_key2, value);
	}
	
	/**
	 * ログサブキー２. Log sub key 2.<p>
	 *
	 */
	public void log_sub_key2(float value) {
		setConstNumber(offset + 131, $log_sub_key2, value);
	}
	
	/**
	 * ログサブキー２. Log sub key 2.<p>
	 *
	 */
	public void log_sub_key2(double value) {
		setConstNumber(offset + 131, $log_sub_key2, value);
	}
	
	/**
	 * 予備ＣＨＡＲ項目１. Spare CHAR column 1.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 132, $sub_char1);
	}

	/**
	 * 予備ＣＨＡＲ項目１. Spare CHAR column 1.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 132, $sub_char1, value);
	}

	/**
	 * 予備ＣＨＡＲ項目２. Spare CHAR column 2.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 133, $sub_char2);
	}

	/**
	 * 予備ＣＨＡＲ項目２. Spare CHAR column 2.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 133, $sub_char2, value);
	}

	/**
	 * 予備ＣＨＡＲ項目３. Spare CHAR column 3.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 134, $sub_char3);
	}

	/**
	 * 予備ＣＨＡＲ項目３. Spare CHAR column 3.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 134, $sub_char3, value);
	}

	/**
	 * 予備ＣＨＡＲ項目４. Spare CHAR column 4.<p>
	 *
	 */
	public String sub_char4() {
		return getConstString(offset + 135, $sub_char4);
	}

	/**
	 * 予備ＣＨＡＲ項目４. Spare CHAR column 4.<p>
	 *
	 */
	public void sub_char4(String value) {
		setConstString(offset + 135, $sub_char4, value);
	}

	/**
	 * 予備ＣＨＡＲ項目５. Spare CHAR column 5.<p>
	 *
	 */
	public String sub_char5() {
		return getConstString(offset + 136, $sub_char5);
	}

	/**
	 * 予備ＣＨＡＲ項目５. Spare CHAR column 5.<p>
	 *
	 */
	public void sub_char5(String value) {
		setConstString(offset + 136, $sub_char5, value);
	}

	/**
	 * 予備ＣＨＡＲ項目６. Spare CHAR column 6.<p>
	 *
	 */
	public String sub_char6() {
		return getConstString(offset + 137, $sub_char6);
	}

	/**
	 * 予備ＣＨＡＲ項目６. Spare CHAR column 6.<p>
	 *
	 */
	public void sub_char6(String value) {
		setConstString(offset + 137, $sub_char6, value);
	}

	/**
	 * 予備ＣＨＡＲ項目７. Spare CHAR column 7.<p>
	 *
	 */
	public String sub_char7() {
		return getConstString(offset + 138, $sub_char7);
	}

	/**
	 * 予備ＣＨＡＲ項目７. Spare CHAR column 7.<p>
	 *
	 */
	public void sub_char7(String value) {
		setConstString(offset + 138, $sub_char7, value);
	}

	/**
	 * 予備ＣＨＡＲ項目８. Spare CHAR column 8.<p>
	 *
	 */
	public String sub_char8() {
		return getConstString(offset + 139, $sub_char8);
	}

	/**
	 * 予備ＣＨＡＲ項目８. Spare CHAR column 8.<p>
	 *
	 */
	public void sub_char8(String value) {
		setConstString(offset + 139, $sub_char8, value);
	}

	/**
	 * 予備ＣＨＡＲ項目９. Spare CHAR column 9.<p>
	 *
	 */
	public String sub_char9() {
		return getConstString(offset + 140, $sub_char9);
	}

	/**
	 * 予備ＣＨＡＲ項目９. Spare CHAR column 9.<p>
	 *
	 */
	public void sub_char9(String value) {
		setConstString(offset + 140, $sub_char9, value);
	}

	/**
	 * 予備ＣＨＡＲ項目１０. Spare CHAR column 10.<p>
	 *
	 */
	public String sub_char10() {
		return getConstString(offset + 141, $sub_char10);
	}

	/**
	 * 予備ＣＨＡＲ項目１０. Spare CHAR column 10.<p>
	 *
	 */
	public void sub_char10(String value) {
		setConstString(offset + 141, $sub_char10, value);
	}

	/**
	 * 予備ＣＨＡＲ項目１１. Spare CHAR column 11.<p>
	 *
	 */
	public String sub_char11() {
		return getConstString(offset + 142, $sub_char11);
	}

	/**
	 * 予備ＣＨＡＲ項目１１. Spare CHAR column 11.<p>
	 *
	 */
	public void sub_char11(String value) {
		setConstString(offset + 142, $sub_char11, value);
	}

	/**
	 * 予備ＣＨＡＲ項目１２. Spare CHAR column 12.<p>
	 *
	 */
	public String sub_char12() {
		return getConstString(offset + 143, $sub_char12);
	}

	/**
	 * 予備ＣＨＡＲ項目１２. Spare CHAR column 12.<p>
	 *
	 */
	public void sub_char12(String value) {
		setConstString(offset + 143, $sub_char12, value);
	}

	/**
	 * 予備ＣＨＡＲ項目１３. Spare CHAR column 13.<p>
	 *
	 */
	public String sub_char13() {
		return getConstString(offset + 144, $sub_char13);
	}

	/**
	 * 予備ＣＨＡＲ項目１３. Spare CHAR column 13.<p>
	 *
	 */
	public void sub_char13(String value) {
		setConstString(offset + 144, $sub_char13, value);
	}

	/**
	 * 予備ＣＨＡＲ項目１４. Spare CHAR column 14.<p>
	 *
	 */
	public String sub_char14() {
		return getConstString(offset + 145, $sub_char14);
	}

	/**
	 * 予備ＣＨＡＲ項目１４. Spare CHAR column 14.<p>
	 *
	 */
	public void sub_char14(String value) {
		setConstString(offset + 145, $sub_char14, value);
	}

	/**
	 * 予備ＣＨＡＲ項目１５. Spare CHAR column 15.<p>
	 *
	 */
	public String sub_char15() {
		return getConstString(offset + 146, $sub_char15);
	}

	/**
	 * 予備ＣＨＡＲ項目１５. Spare CHAR column 15.<p>
	 *
	 */
	public void sub_char15(String value) {
		setConstString(offset + 146, $sub_char15, value);
	}

	/**
	 * 予備ＣＨＡＲ項目１６. Spare CHAR column 16.<p>
	 *
	 */
	public String sub_char16() {
		return getConstString(offset + 147, $sub_char16);
	}

	/**
	 * 予備ＣＨＡＲ項目１６. Spare CHAR column 16.<p>
	 *
	 */
	public void sub_char16(String value) {
		setConstString(offset + 147, $sub_char16, value);
	}

	/**
	 * 予備ＣＨＡＲ項目１７. Spare CHAR column 17.<p>
	 *
	 */
	public String sub_char17() {
		return getConstString(offset + 148, $sub_char17);
	}

	/**
	 * 予備ＣＨＡＲ項目１７. Spare CHAR column 17.<p>
	 *
	 */
	public void sub_char17(String value) {
		setConstString(offset + 148, $sub_char17, value);
	}

	/**
	 * 予備ＣＨＡＲ項目１８. Spare CHAR column 18.<p>
	 *
	 */
	public String sub_char18() {
		return getConstString(offset + 149, $sub_char18);
	}

	/**
	 * 予備ＣＨＡＲ項目１８. Spare CHAR column 18.<p>
	 *
	 */
	public void sub_char18(String value) {
		setConstString(offset + 149, $sub_char18, value);
	}

	/**
	 * 予備ＣＨＡＲ項目１９. Spare CHAR column 19.<p>
	 *
	 */
	public String sub_char19() {
		return getConstString(offset + 150, $sub_char19);
	}

	/**
	 * 予備ＣＨＡＲ項目１９. Spare CHAR column 19.<p>
	 *
	 */
	public void sub_char19(String value) {
		setConstString(offset + 150, $sub_char19, value);
	}

	/**
	 * 予備ＣＨＡＲ項目２０. Spare CHAR column 20.<p>
	 *
	 */
	public String sub_char20() {
		return getConstString(offset + 151, $sub_char20);
	}

	/**
	 * 予備ＣＨＡＲ項目２０. Spare CHAR column 20.<p>
	 *
	 */
	public void sub_char20(String value) {
		setConstString(offset + 151, $sub_char20, value);
	}

	/**
	 * 予備ＣＨＡＲ項目２１. Spare CHAR column 21.<p>
	 *
	 */
	public String sub_char21() {
		return getConstString(offset + 152, $sub_char21);
	}

	/**
	 * 予備ＣＨＡＲ項目２１. Spare CHAR column 21.<p>
	 *
	 */
	public void sub_char21(String value) {
		setConstString(offset + 152, $sub_char21, value);
	}

	/**
	 * 予備ＣＨＡＲ項目２２. Spare CHAR column 22.<p>
	 *
	 */
	public String sub_char22() {
		return getConstString(offset + 153, $sub_char22);
	}

	/**
	 * 予備ＣＨＡＲ項目２２. Spare CHAR column 22.<p>
	 *
	 */
	public void sub_char22(String value) {
		setConstString(offset + 153, $sub_char22, value);
	}

	/**
	 * 予備ＣＨＡＲ項目２３. Spare CHAR column 23.<p>
	 *
	 */
	public String sub_char23() {
		return getConstString(offset + 154, $sub_char23);
	}

	/**
	 * 予備ＣＨＡＲ項目２３. Spare CHAR column 23.<p>
	 *
	 */
	public void sub_char23(String value) {
		setConstString(offset + 154, $sub_char23, value);
	}

	/**
	 * 予備ＣＨＡＲ項目２４. Spare CHAR column 24.<p>
	 *
	 */
	public String sub_char24() {
		return getConstString(offset + 155, $sub_char24);
	}

	/**
	 * 予備ＣＨＡＲ項目２４. Spare CHAR column 24.<p>
	 *
	 */
	public void sub_char24(String value) {
		setConstString(offset + 155, $sub_char24, value);
	}

	/**
	 * 予備ＣＨＡＲ項目２５. Spare CHAR column 25.<p>
	 *
	 */
	public String sub_char25() {
		return getConstString(offset + 156, $sub_char25);
	}

	/**
	 * 予備ＣＨＡＲ項目２５. Spare CHAR column 25.<p>
	 *
	 */
	public void sub_char25(String value) {
		setConstString(offset + 156, $sub_char25, value);
	}

	/**
	 * 予備ＣＨＡＲ項目２６. Spare CHAR column 26.<p>
	 *
	 */
	public String sub_char26() {
		return getConstString(offset + 157, $sub_char26);
	}

	/**
	 * 予備ＣＨＡＲ項目２６. Spare CHAR column 26.<p>
	 *
	 */
	public void sub_char26(String value) {
		setConstString(offset + 157, $sub_char26, value);
	}

	/**
	 * 予備ＣＨＡＲ項目２７. Spare CHAR column 27.<p>
	 *
	 */
	public String sub_char27() {
		return getConstString(offset + 158, $sub_char27);
	}

	/**
	 * 予備ＣＨＡＲ項目２７. Spare CHAR column 27.<p>
	 *
	 */
	public void sub_char27(String value) {
		setConstString(offset + 158, $sub_char27, value);
	}

	/**
	 * 予備ＣＨＡＲ項目２８. Spare CHAR column 28.<p>
	 *
	 */
	public String sub_char28() {
		return getConstString(offset + 159, $sub_char28);
	}

	/**
	 * 予備ＣＨＡＲ項目２８. Spare CHAR column 28.<p>
	 *
	 */
	public void sub_char28(String value) {
		setConstString(offset + 159, $sub_char28, value);
	}

	/**
	 * 予備ＣＨＡＲ項目２９. Spare CHAR column 29.<p>
	 *
	 */
	public String sub_char29() {
		return getConstString(offset + 160, $sub_char29);
	}

	/**
	 * 予備ＣＨＡＲ項目２９. Spare CHAR column 29.<p>
	 *
	 */
	public void sub_char29(String value) {
		setConstString(offset + 160, $sub_char29, value);
	}

	/**
	 * 予備ＣＨＡＲ項目３０. Spare CHAR column 30.<p>
	 *
	 */
	public String sub_char30() {
		return getConstString(offset + 161, $sub_char30);
	}

	/**
	 * 予備ＣＨＡＲ項目３０. Spare CHAR column 30.<p>
	 *
	 */
	public void sub_char30(String value) {
		setConstString(offset + 161, $sub_char30, value);
	}

	/**
	 * 予備ＮＵＭ項目１. Spare NUM column 1.<p>
	 *
	 */
	public MCNumber sub_num1() {
		return getConstNumber(offset + 162, $sub_num1);
	}

	/**
	 * 予備ＮＵＭ項目１. Spare NUM column 1.<p>
	 *
	 */
	public void sub_num1(MCNumber value) {
		setConstNumber(offset + 162, $sub_num1, value);
	}
	
	/**
	 * 予備ＮＵＭ項目１. Spare NUM column 1.<p>
	 *
	 */
	public void sub_num1(int value) {
		setConstNumber(offset + 162, $sub_num1, value);
	}
	
	/**
	 * 予備ＮＵＭ項目１. Spare NUM column 1.<p>
	 *
	 */
	public void sub_num1(long value) {
		setConstNumber(offset + 162, $sub_num1, value);
	}
	
	/**
	 * 予備ＮＵＭ項目１. Spare NUM column 1.<p>
	 *
	 */
	public void sub_num1(float value) {
		setConstNumber(offset + 162, $sub_num1, value);
	}
	
	/**
	 * 予備ＮＵＭ項目１. Spare NUM column 1.<p>
	 *
	 */
	public void sub_num1(double value) {
		setConstNumber(offset + 162, $sub_num1, value);
	}
	
	/**
	 * 予備ＮＵＭ項目２. Spare NUM column 2.<p>
	 *
	 */
	public MCNumber sub_num2() {
		return getConstNumber(offset + 163, $sub_num2);
	}

	/**
	 * 予備ＮＵＭ項目２. Spare NUM column 2.<p>
	 *
	 */
	public void sub_num2(MCNumber value) {
		setConstNumber(offset + 163, $sub_num2, value);
	}
	
	/**
	 * 予備ＮＵＭ項目２. Spare NUM column 2.<p>
	 *
	 */
	public void sub_num2(int value) {
		setConstNumber(offset + 163, $sub_num2, value);
	}
	
	/**
	 * 予備ＮＵＭ項目２. Spare NUM column 2.<p>
	 *
	 */
	public void sub_num2(long value) {
		setConstNumber(offset + 163, $sub_num2, value);
	}
	
	/**
	 * 予備ＮＵＭ項目２. Spare NUM column 2.<p>
	 *
	 */
	public void sub_num2(float value) {
		setConstNumber(offset + 163, $sub_num2, value);
	}
	
	/**
	 * 予備ＮＵＭ項目２. Spare NUM column 2.<p>
	 *
	 */
	public void sub_num2(double value) {
		setConstNumber(offset + 163, $sub_num2, value);
	}
	
	/**
	 * 予備ＮＵＭ項目３. Spare NUM column 3.<p>
	 *
	 */
	public MCNumber sub_num3() {
		return getConstNumber(offset + 164, $sub_num3);
	}

	/**
	 * 予備ＮＵＭ項目３. Spare NUM column 3.<p>
	 *
	 */
	public void sub_num3(MCNumber value) {
		setConstNumber(offset + 164, $sub_num3, value);
	}
	
	/**
	 * 予備ＮＵＭ項目３. Spare NUM column 3.<p>
	 *
	 */
	public void sub_num3(int value) {
		setConstNumber(offset + 164, $sub_num3, value);
	}
	
	/**
	 * 予備ＮＵＭ項目３. Spare NUM column 3.<p>
	 *
	 */
	public void sub_num3(long value) {
		setConstNumber(offset + 164, $sub_num3, value);
	}
	
	/**
	 * 予備ＮＵＭ項目３. Spare NUM column 3.<p>
	 *
	 */
	public void sub_num3(float value) {
		setConstNumber(offset + 164, $sub_num3, value);
	}
	
	/**
	 * 予備ＮＵＭ項目３. Spare NUM column 3.<p>
	 *
	 */
	public void sub_num3(double value) {
		setConstNumber(offset + 164, $sub_num3, value);
	}
	
	/**
	 * 予備ＮＵＭ項目４. Spare NUM column 4.<p>
	 *
	 */
	public MCNumber sub_num4() {
		return getConstNumber(offset + 165, $sub_num4);
	}

	/**
	 * 予備ＮＵＭ項目４. Spare NUM column 4.<p>
	 *
	 */
	public void sub_num4(MCNumber value) {
		setConstNumber(offset + 165, $sub_num4, value);
	}
	
	/**
	 * 予備ＮＵＭ項目４. Spare NUM column 4.<p>
	 *
	 */
	public void sub_num4(int value) {
		setConstNumber(offset + 165, $sub_num4, value);
	}
	
	/**
	 * 予備ＮＵＭ項目４. Spare NUM column 4.<p>
	 *
	 */
	public void sub_num4(long value) {
		setConstNumber(offset + 165, $sub_num4, value);
	}
	
	/**
	 * 予備ＮＵＭ項目４. Spare NUM column 4.<p>
	 *
	 */
	public void sub_num4(float value) {
		setConstNumber(offset + 165, $sub_num4, value);
	}
	
	/**
	 * 予備ＮＵＭ項目４. Spare NUM column 4.<p>
	 *
	 */
	public void sub_num4(double value) {
		setConstNumber(offset + 165, $sub_num4, value);
	}
	
	/**
	 * 予備ＮＵＭ項目５. Spare NUM column 5.<p>
	 *
	 */
	public MCNumber sub_num5() {
		return getConstNumber(offset + 166, $sub_num5);
	}

	/**
	 * 予備ＮＵＭ項目５. Spare NUM column 5.<p>
	 *
	 */
	public void sub_num5(MCNumber value) {
		setConstNumber(offset + 166, $sub_num5, value);
	}
	
	/**
	 * 予備ＮＵＭ項目５. Spare NUM column 5.<p>
	 *
	 */
	public void sub_num5(int value) {
		setConstNumber(offset + 166, $sub_num5, value);
	}
	
	/**
	 * 予備ＮＵＭ項目５. Spare NUM column 5.<p>
	 *
	 */
	public void sub_num5(long value) {
		setConstNumber(offset + 166, $sub_num5, value);
	}
	
	/**
	 * 予備ＮＵＭ項目５. Spare NUM column 5.<p>
	 *
	 */
	public void sub_num5(float value) {
		setConstNumber(offset + 166, $sub_num5, value);
	}
	
	/**
	 * 予備ＮＵＭ項目５. Spare NUM column 5.<p>
	 *
	 */
	public void sub_num5(double value) {
		setConstNumber(offset + 166, $sub_num5, value);
	}
	
	/**
	 * 予備ＤＡＴＥ項目１. Spare DATE column 1.<p>
	 *
	 */
	public MCDate sub_dt1() {
		return getConstDate(offset + 167, $sub_dt1);
	}

	/**
	 * 予備ＤＡＴＥ項目１. Spare DATE column 1.<p>
	 *
	 */
	public void sub_dt1(MCDate value) {
		setConstDate(offset + 167, $sub_dt1, value);
	}

	/**
	 * 予備ＤＡＴＥ項目２. Spare DATE column 2.<p>
	 *
	 */
	public MCDate sub_dt2() {
		return getConstDate(offset + 168, $sub_dt2);
	}

	/**
	 * 予備ＤＡＴＥ項目２. Spare DATE column 2.<p>
	 *
	 */
	public void sub_dt2(MCDate value) {
		setConstDate(offset + 168, $sub_dt2, value);
	}

	/**
	 * 予備ＤＡＴＥ項目３. Spare DATE column 3.<p>
	 *
	 */
	public MCDate sub_dt3() {
		return getConstDate(offset + 169, $sub_dt3);
	}

	/**
	 * 予備ＤＡＴＥ項目３. Spare DATE column 3.<p>
	 *
	 */
	public void sub_dt3(MCDate value) {
		setConstDate(offset + 169, $sub_dt3, value);
	}

	/**
	 * 予備ＤＡＴＥ項目４. Spare DATE column 4.<p>
	 *
	 */
	public MCDate sub_dt4() {
		return getConstDate(offset + 170, $sub_dt4);
	}

	/**
	 * 予備ＤＡＴＥ項目４. Spare DATE column 4.<p>
	 *
	 */
	public void sub_dt4(MCDate value) {
		setConstDate(offset + 170, $sub_dt4, value);
	}

	/**
	 * 予備ＤＡＴＥ項目５. Spare DATE column 5.<p>
	 *
	 */
	public MCDate sub_dt5() {
		return getConstDate(offset + 171, $sub_dt5);
	}

	/**
	 * 予備ＤＡＴＥ項目５. Spare DATE column 5.<p>
	 *
	 */
	public void sub_dt5(MCDate value) {
		setConstDate(offset + 171, $sub_dt5, value);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 172, $ins_usr_id);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 172, $ins_usr_id, value);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 173, $ins_usr_nm);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 173, $ins_usr_nm, value);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 174, $ins_ts);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 174, $ins_ts, value);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 175, $ins_func_id);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 175, $ins_func_id, value);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 176, $upd_cntr);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 176, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 176, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 176, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 176, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 176, $upd_cntr, value);
	}
	
	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 177, $upd_usr_id);
	}

	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 177, $upd_usr_id, value);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 178, $upd_usr_nm);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 178, $upd_usr_nm, value);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 179, $upd_ts);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 179, $upd_ts, value);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 180, $upd_func_id);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 180, $upd_func_id, value);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 181, $upd_srv_req_no);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 181, $upd_srv_req_no, value);
	}

	/**
	 * 送受信状況区分. Exporting and importing status type.<p>
	 *
	 */
	public String sdrv_sts_typ() {
		return getConstString(offset + 182, $sdrv_sts_typ);
	}

	/**
	 * 送受信状況区分. Exporting and importing status type.<p>
	 *
	 */
	public void sdrv_sts_typ(String value) {
		setConstString(offset + 182, $sdrv_sts_typ, value);
	}

	/**
	 * 発注先国名. Supplier country name.<p>
	 *
	 */
	public String sppl_cntry_nm() {
		return getConstString(offset + 183, $sppl_cntry_nm);
	}

	/**
	 * 発注先国名. Supplier country name.<p>
	 *
	 */
	public void sppl_cntry_nm(String value) {
		setConstString(offset + 183, $sppl_cntry_nm, value);
	}

	/**
	 * 納入先国名. Delivery destination country name.<p>
	 *
	 */
	public String in_to_cntry_nm() {
		return getConstString(offset + 184, $in_to_cntry_nm);
	}

	/**
	 * 納入先国名. Delivery destination country name.<p>
	 *
	 */
	public void in_to_cntry_nm(String value) {
		setConstString(offset + 184, $in_to_cntry_nm, value);
	}

	/**
	 * 配送先国名. Receiving point country name.<p>
	 *
	 */
	public String tdlv_cntry_nm() {
		return getConstString(offset + 185, $tdlv_cntry_nm);
	}

	/**
	 * 配送先国名. Receiving point country name.<p>
	 *
	 */
	public void tdlv_cntry_nm(String value) {
		setConstString(offset + 185, $tdlv_cntry_nm, value);
	}

	/**
	 * 直送先国名. Direct-delivery destination country name.<p>
	 *
	 */
	public String drct_dlv_cntry_nm() {
		return getConstString(offset + 186, $drct_dlv_cntry_nm);
	}

	/**
	 * 直送先国名. Direct-delivery destination country name.<p>
	 *
	 */
	public void drct_dlv_cntry_nm(String value) {
		setConstString(offset + 186, $drct_dlv_cntry_nm, value);
	}

	/**
	 * 取引通貨名. Transaction currency name.<p>
	 *
	 */
	public String trd_cur_nm() {
		return getConstString(offset + 187, $trd_cur_nm);
	}

	/**
	 * 取引通貨名. Transaction currency name.<p>
	 *
	 */
	public void trd_cur_nm(String value) {
		setConstString(offset + 187, $trd_cur_nm, value);
	}

	/**
	 * ワーキンググループ名. WG name.<p>
	 *
	 */
	public String wg_nm() {
		return getConstString(offset + 188, $wg_nm);
	}

	/**
	 * ワーキンググループ名. WG name.<p>
	 *
	 */
	public void wg_nm(String value) {
		setConstString(offset + 188, $wg_nm, value);
	}

	/**
	 * 国名. Country name.<p>
	 *
	 */
	public String cntry_nm() {
		return getConstString(offset + 189, $cntry_nm);
	}

	/**
	 * 国名. Country name.<p>
	 *
	 */
	public void cntry_nm(String value) {
		setConstString(offset + 189, $cntry_nm, value);
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
		if ($po_no.equalsIgnoreCase(name)) {
			return po_no();
		}
		if ($po_d_no.equalsIgnoreCase(name)) {
			return po_d_no();
		}
		if ($bp_dlv_slip_no.equalsIgnoreCase(name)) {
			return bp_dlv_slip_no();
		}
		if ($bp_dlv_slip_lno.equalsIgnoreCase(name)) {
			return bp_dlv_slip_lno();
		}
		if ($cntry_cd.equalsIgnoreCase(name)) {
			return cntry_cd();
		}
		if ($if_cntry_cd.equalsIgnoreCase(name)) {
			return if_cntry_cd();
		}
		if ($purc_dpt_cd.equalsIgnoreCase(name)) {
			return purc_dpt_cd();
		}
		if ($if_purc_dpt_cd.equalsIgnoreCase(name)) {
			return if_purc_dpt_cd();
		}
		if ($purc_dpt_nm.equalsIgnoreCase(name)) {
			return purc_dpt_nm();
		}
		if ($purc_usr_cd.equalsIgnoreCase(name)) {
			return purc_usr_cd();
		}
		if ($if_purc_usr_cd.equalsIgnoreCase(name)) {
			return if_purc_usr_cd();
		}
		if ($purc_usr_nm.equalsIgnoreCase(name)) {
			return purc_usr_nm();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			return sppl_cd();
		}
		if ($if_sppl_cd.equalsIgnoreCase(name)) {
			return if_sppl_cd();
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			return sppl_nm();
		}
		if ($sppl_cntry_cd.equalsIgnoreCase(name)) {
			return sppl_cntry_cd();
		}
		if ($if_sppl_cntry_cd.equalsIgnoreCase(name)) {
			return if_sppl_cntry_cd();
		}
		if ($in_to_id_typ.equalsIgnoreCase(name)) {
			return in_to_id_typ();
		}
		if ($in_to_id_cd.equalsIgnoreCase(name)) {
			return in_to_id_cd();
		}
		if ($if_in_to_id_cd.equalsIgnoreCase(name)) {
			return if_in_to_id_cd();
		}
		if ($in_to_nm.equalsIgnoreCase(name)) {
			return in_to_nm();
		}
		if ($in_to_zip_cd.equalsIgnoreCase(name)) {
			return in_to_zip_cd();
		}
		if ($in_to_addr1.equalsIgnoreCase(name)) {
			return in_to_addr1();
		}
		if ($in_to_addr2.equalsIgnoreCase(name)) {
			return in_to_addr2();
		}
		if ($in_to_addr3.equalsIgnoreCase(name)) {
			return in_to_addr3();
		}
		if ($in_to_addr4.equalsIgnoreCase(name)) {
			return in_to_addr4();
		}
		if ($in_to_cntct_dpt.equalsIgnoreCase(name)) {
			return in_to_cntct_dpt();
		}
		if ($in_to_cntct_psn.equalsIgnoreCase(name)) {
			return in_to_cntct_psn();
		}
		if ($in_to_tel.equalsIgnoreCase(name)) {
			return in_to_tel();
		}
		if ($in_to_fax.equalsIgnoreCase(name)) {
			return in_to_fax();
		}
		if ($in_to_cntry_cd.equalsIgnoreCase(name)) {
			return in_to_cntry_cd();
		}
		if ($if_in_to_cntry_cd.equalsIgnoreCase(name)) {
			return if_in_to_cntry_cd();
		}
		if ($tdlv_cd.equalsIgnoreCase(name)) {
			return tdlv_cd();
		}
		if ($if_tdlv_cd.equalsIgnoreCase(name)) {
			return if_tdlv_cd();
		}
		if ($tdlv_nm.equalsIgnoreCase(name)) {
			return tdlv_nm();
		}
		if ($tdlv_zip_cd.equalsIgnoreCase(name)) {
			return tdlv_zip_cd();
		}
		if ($tdlv_addr1.equalsIgnoreCase(name)) {
			return tdlv_addr1();
		}
		if ($tdlv_addr2.equalsIgnoreCase(name)) {
			return tdlv_addr2();
		}
		if ($tdlv_addr3.equalsIgnoreCase(name)) {
			return tdlv_addr3();
		}
		if ($tdlv_addr4.equalsIgnoreCase(name)) {
			return tdlv_addr4();
		}
		if ($tdlv_cntct_dpt.equalsIgnoreCase(name)) {
			return tdlv_cntct_dpt();
		}
		if ($tdlv_cntct_psn.equalsIgnoreCase(name)) {
			return tdlv_cntct_psn();
		}
		if ($tdlv_tel.equalsIgnoreCase(name)) {
			return tdlv_tel();
		}
		if ($tdlv_fax.equalsIgnoreCase(name)) {
			return tdlv_fax();
		}
		if ($tdlv_cntry_cd.equalsIgnoreCase(name)) {
			return tdlv_cntry_cd();
		}
		if ($if_tdlv_cntry_cd.equalsIgnoreCase(name)) {
			return if_tdlv_cntry_cd();
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			return site_cd();
		}
		if ($if_site_cd.equalsIgnoreCase(name)) {
			return if_site_cd();
		}
		if ($site_nm.equalsIgnoreCase(name)) {
			return site_nm();
		}
		if ($drct_dlv_bp_cd.equalsIgnoreCase(name)) {
			return drct_dlv_bp_cd();
		}
		if ($if_drct_dlv_bp_cd.equalsIgnoreCase(name)) {
			return if_drct_dlv_bp_cd();
		}
		if ($drct_dlv_bp_nm.equalsIgnoreCase(name)) {
			return drct_dlv_bp_nm();
		}
		if ($drct_dlv_cntry_cd.equalsIgnoreCase(name)) {
			return drct_dlv_cntry_cd();
		}
		if ($if_drct_dlv_cntry_cd.equalsIgnoreCase(name)) {
			return if_drct_dlv_cntry_cd();
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($if_trd_cur_cd.equalsIgnoreCase(name)) {
			return if_trd_cur_cd();
		}
		if ($tterm_cd1.equalsIgnoreCase(name)) {
			return tterm_cd1();
		}
		if ($if_tterm_cd1.equalsIgnoreCase(name)) {
			return if_tterm_cd1();
		}
		if ($tterm_nm1.equalsIgnoreCase(name)) {
			return tterm_nm1();
		}
		if ($tterm_rmrks1.equalsIgnoreCase(name)) {
			return tterm_rmrks1();
		}
		if ($tterm_cd2.equalsIgnoreCase(name)) {
			return tterm_cd2();
		}
		if ($if_tterm_cd2.equalsIgnoreCase(name)) {
			return if_tterm_cd2();
		}
		if ($tterm_nm2.equalsIgnoreCase(name)) {
			return tterm_nm2();
		}
		if ($tterm_rmrks2.equalsIgnoreCase(name)) {
			return tterm_rmrks2();
		}
		if ($tterm_cd3.equalsIgnoreCase(name)) {
			return tterm_cd3();
		}
		if ($if_tterm_cd3.equalsIgnoreCase(name)) {
			return if_tterm_cd3();
		}
		if ($tterm_nm3.equalsIgnoreCase(name)) {
			return tterm_nm3();
		}
		if ($tterm_rmrks3.equalsIgnoreCase(name)) {
			return tterm_rmrks3();
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
		if ($itm_nm.equalsIgnoreCase(name)) {
			return itm_nm();
		}
		if ($iv_itm_nm.equalsIgnoreCase(name)) {
			return iv_itm_nm();
		}
		if ($sppl_itm_cd.equalsIgnoreCase(name)) {
			return sppl_itm_cd();
		}
		if ($sppl_itm_nm.equalsIgnoreCase(name)) {
			return sppl_itm_nm();
		}
		if ($bp_lot_no.equalsIgnoreCase(name)) {
			return bp_lot_no();
		}
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			return trd_unit_cd();
		}
		if ($if_trd_unit_cd.equalsIgnoreCase(name)) {
			return if_trd_unit_cd();
		}
		if ($trd_unit_nm.equalsIgnoreCase(name)) {
			return trd_unit_nm();
		}
		if ($dscnt_rsn_cd.equalsIgnoreCase(name)) {
			return dscnt_rsn_cd();
		}
		if ($if_dscnt_rsn_cd.equalsIgnoreCase(name)) {
			return if_dscnt_rsn_cd();
		}
		if ($dscnt_rsn_nm.equalsIgnoreCase(name)) {
			return dscnt_rsn_nm();
		}
		if ($tax_typ.equalsIgnoreCase(name)) {
			return tax_typ();
		}
		if ($tax_cd.equalsIgnoreCase(name)) {
			return tax_cd();
		}
		if ($if_tax_cd.equalsIgnoreCase(name)) {
			return if_tax_cd();
		}
		if ($tax_nm.equalsIgnoreCase(name)) {
			return tax_nm();
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
		if ($purc_act_no.equalsIgnoreCase(name)) {
			return purc_act_no();
		}
		if ($purc_act_d_no.equalsIgnoreCase(name)) {
			return purc_act_d_no();
		}
		if ($if_co_cd.equalsIgnoreCase(name)) {
			return if_co_cd();
		}
		if ($co_nm.equalsIgnoreCase(name)) {
			return co_nm();
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
		if ($sppl_cntry_nm.equalsIgnoreCase(name)) {
			return sppl_cntry_nm();
		}
		if ($in_to_cntry_nm.equalsIgnoreCase(name)) {
			return in_to_cntry_nm();
		}
		if ($tdlv_cntry_nm.equalsIgnoreCase(name)) {
			return tdlv_cntry_nm();
		}
		if ($drct_dlv_cntry_nm.equalsIgnoreCase(name)) {
			return drct_dlv_cntry_nm();
		}
		if ($trd_cur_nm.equalsIgnoreCase(name)) {
			return trd_cur_nm();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($cntry_nm.equalsIgnoreCase(name)) {
			return cntry_nm();
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
		if ($wtax_rate.equalsIgnoreCase(name)) {
			return wtax_rate();
		}
		if ($wtax_amt.equalsIgnoreCase(name)) {
			return wtax_amt();
		}
		if ($purc_act_rev.equalsIgnoreCase(name)) {
			return purc_act_rev();
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
		if ($ac_dt.equalsIgnoreCase(name)) {
			return ac_dt();
		}
		if ($ac_ym.equalsIgnoreCase(name)) {
			return ac_ym();
		}
		if ($purc_dt.equalsIgnoreCase(name)) {
			return purc_dt();
		}
		if ($red_slip_ac_dt.equalsIgnoreCase(name)) {
			return red_slip_ac_dt();
		}
		if ($red_slip_ac_ym.equalsIgnoreCase(name)) {
			return red_slip_ac_ym();
		}
		if ($pay_schd_dt.equalsIgnoreCase(name)) {
			return pay_schd_dt();
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
		if ($iv_flg.equalsIgnoreCase(name)) {
			return iv_flg();
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			return abort_flg();
		}
		if ($in_to_sundry_flg.equalsIgnoreCase(name)) {
			return in_to_sundry_flg();
		}
		if ($tdlv_sundry_flg.equalsIgnoreCase(name)) {
			return tdlv_sundry_flg();
		}
		if ($drct_dlv_flg.equalsIgnoreCase(name)) {
			return drct_dlv_flg();
		}
		if ($sundry_itm_flg.equalsIgnoreCase(name)) {
			return sundry_itm_flg();
		}
		if ($interim_flg.equalsIgnoreCase(name)) {
			return interim_flg();
		}
		if ($inc_tax_flg.equalsIgnoreCase(name)) {
			return inc_tax_flg();
		}
		if ($accpt_dfct_flg.equalsIgnoreCase(name)) {
			return accpt_dfct_flg();
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
		if ($po_no.equalsIgnoreCase(name)) {
			return po_no();
		}
		if ($po_d_no.equalsIgnoreCase(name)) {
			return po_d_no();
		}
		if ($bp_dlv_slip_no.equalsIgnoreCase(name)) {
			return bp_dlv_slip_no();
		}
		if ($bp_dlv_slip_lno.equalsIgnoreCase(name)) {
			return bp_dlv_slip_lno();
		}
		if ($cntry_cd.equalsIgnoreCase(name)) {
			return cntry_cd();
		}
		if ($if_cntry_cd.equalsIgnoreCase(name)) {
			return if_cntry_cd();
		}
		if ($purc_dpt_cd.equalsIgnoreCase(name)) {
			return purc_dpt_cd();
		}
		if ($if_purc_dpt_cd.equalsIgnoreCase(name)) {
			return if_purc_dpt_cd();
		}
		if ($purc_dpt_nm.equalsIgnoreCase(name)) {
			return purc_dpt_nm();
		}
		if ($purc_usr_cd.equalsIgnoreCase(name)) {
			return purc_usr_cd();
		}
		if ($if_purc_usr_cd.equalsIgnoreCase(name)) {
			return if_purc_usr_cd();
		}
		if ($purc_usr_nm.equalsIgnoreCase(name)) {
			return purc_usr_nm();
		}
		if ($wg_cd.equalsIgnoreCase(name)) {
			return wg_cd();
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			return sppl_cd();
		}
		if ($if_sppl_cd.equalsIgnoreCase(name)) {
			return if_sppl_cd();
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			return sppl_nm();
		}
		if ($sppl_cntry_cd.equalsIgnoreCase(name)) {
			return sppl_cntry_cd();
		}
		if ($if_sppl_cntry_cd.equalsIgnoreCase(name)) {
			return if_sppl_cntry_cd();
		}
		if ($in_to_id_typ.equalsIgnoreCase(name)) {
			return in_to_id_typ();
		}
		if ($in_to_id_cd.equalsIgnoreCase(name)) {
			return in_to_id_cd();
		}
		if ($if_in_to_id_cd.equalsIgnoreCase(name)) {
			return if_in_to_id_cd();
		}
		if ($in_to_nm.equalsIgnoreCase(name)) {
			return in_to_nm();
		}
		if ($in_to_zip_cd.equalsIgnoreCase(name)) {
			return in_to_zip_cd();
		}
		if ($in_to_addr1.equalsIgnoreCase(name)) {
			return in_to_addr1();
		}
		if ($in_to_addr2.equalsIgnoreCase(name)) {
			return in_to_addr2();
		}
		if ($in_to_addr3.equalsIgnoreCase(name)) {
			return in_to_addr3();
		}
		if ($in_to_addr4.equalsIgnoreCase(name)) {
			return in_to_addr4();
		}
		if ($in_to_cntct_dpt.equalsIgnoreCase(name)) {
			return in_to_cntct_dpt();
		}
		if ($in_to_cntct_psn.equalsIgnoreCase(name)) {
			return in_to_cntct_psn();
		}
		if ($in_to_tel.equalsIgnoreCase(name)) {
			return in_to_tel();
		}
		if ($in_to_fax.equalsIgnoreCase(name)) {
			return in_to_fax();
		}
		if ($in_to_cntry_cd.equalsIgnoreCase(name)) {
			return in_to_cntry_cd();
		}
		if ($if_in_to_cntry_cd.equalsIgnoreCase(name)) {
			return if_in_to_cntry_cd();
		}
		if ($tdlv_cd.equalsIgnoreCase(name)) {
			return tdlv_cd();
		}
		if ($if_tdlv_cd.equalsIgnoreCase(name)) {
			return if_tdlv_cd();
		}
		if ($tdlv_nm.equalsIgnoreCase(name)) {
			return tdlv_nm();
		}
		if ($tdlv_zip_cd.equalsIgnoreCase(name)) {
			return tdlv_zip_cd();
		}
		if ($tdlv_addr1.equalsIgnoreCase(name)) {
			return tdlv_addr1();
		}
		if ($tdlv_addr2.equalsIgnoreCase(name)) {
			return tdlv_addr2();
		}
		if ($tdlv_addr3.equalsIgnoreCase(name)) {
			return tdlv_addr3();
		}
		if ($tdlv_addr4.equalsIgnoreCase(name)) {
			return tdlv_addr4();
		}
		if ($tdlv_cntct_dpt.equalsIgnoreCase(name)) {
			return tdlv_cntct_dpt();
		}
		if ($tdlv_cntct_psn.equalsIgnoreCase(name)) {
			return tdlv_cntct_psn();
		}
		if ($tdlv_tel.equalsIgnoreCase(name)) {
			return tdlv_tel();
		}
		if ($tdlv_fax.equalsIgnoreCase(name)) {
			return tdlv_fax();
		}
		if ($tdlv_cntry_cd.equalsIgnoreCase(name)) {
			return tdlv_cntry_cd();
		}
		if ($if_tdlv_cntry_cd.equalsIgnoreCase(name)) {
			return if_tdlv_cntry_cd();
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			return site_cd();
		}
		if ($if_site_cd.equalsIgnoreCase(name)) {
			return if_site_cd();
		}
		if ($site_nm.equalsIgnoreCase(name)) {
			return site_nm();
		}
		if ($drct_dlv_bp_cd.equalsIgnoreCase(name)) {
			return drct_dlv_bp_cd();
		}
		if ($if_drct_dlv_bp_cd.equalsIgnoreCase(name)) {
			return if_drct_dlv_bp_cd();
		}
		if ($drct_dlv_bp_nm.equalsIgnoreCase(name)) {
			return drct_dlv_bp_nm();
		}
		if ($drct_dlv_cntry_cd.equalsIgnoreCase(name)) {
			return drct_dlv_cntry_cd();
		}
		if ($if_drct_dlv_cntry_cd.equalsIgnoreCase(name)) {
			return if_drct_dlv_cntry_cd();
		}
		if ($trd_cur_cd.equalsIgnoreCase(name)) {
			return trd_cur_cd();
		}
		if ($if_trd_cur_cd.equalsIgnoreCase(name)) {
			return if_trd_cur_cd();
		}
		if ($tterm_cd1.equalsIgnoreCase(name)) {
			return tterm_cd1();
		}
		if ($if_tterm_cd1.equalsIgnoreCase(name)) {
			return if_tterm_cd1();
		}
		if ($tterm_nm1.equalsIgnoreCase(name)) {
			return tterm_nm1();
		}
		if ($tterm_rmrks1.equalsIgnoreCase(name)) {
			return tterm_rmrks1();
		}
		if ($tterm_cd2.equalsIgnoreCase(name)) {
			return tterm_cd2();
		}
		if ($if_tterm_cd2.equalsIgnoreCase(name)) {
			return if_tterm_cd2();
		}
		if ($tterm_nm2.equalsIgnoreCase(name)) {
			return tterm_nm2();
		}
		if ($tterm_rmrks2.equalsIgnoreCase(name)) {
			return tterm_rmrks2();
		}
		if ($tterm_cd3.equalsIgnoreCase(name)) {
			return tterm_cd3();
		}
		if ($if_tterm_cd3.equalsIgnoreCase(name)) {
			return if_tterm_cd3();
		}
		if ($tterm_nm3.equalsIgnoreCase(name)) {
			return tterm_nm3();
		}
		if ($tterm_rmrks3.equalsIgnoreCase(name)) {
			return tterm_rmrks3();
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
		if ($itm_nm.equalsIgnoreCase(name)) {
			return itm_nm();
		}
		if ($iv_itm_nm.equalsIgnoreCase(name)) {
			return iv_itm_nm();
		}
		if ($sppl_itm_cd.equalsIgnoreCase(name)) {
			return sppl_itm_cd();
		}
		if ($sppl_itm_nm.equalsIgnoreCase(name)) {
			return sppl_itm_nm();
		}
		if ($bp_lot_no.equalsIgnoreCase(name)) {
			return bp_lot_no();
		}
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			return trd_unit_cd();
		}
		if ($if_trd_unit_cd.equalsIgnoreCase(name)) {
			return if_trd_unit_cd();
		}
		if ($trd_unit_nm.equalsIgnoreCase(name)) {
			return trd_unit_nm();
		}
		if ($dscnt_rsn_cd.equalsIgnoreCase(name)) {
			return dscnt_rsn_cd();
		}
		if ($if_dscnt_rsn_cd.equalsIgnoreCase(name)) {
			return if_dscnt_rsn_cd();
		}
		if ($dscnt_rsn_nm.equalsIgnoreCase(name)) {
			return dscnt_rsn_nm();
		}
		if ($tax_typ.equalsIgnoreCase(name)) {
			return tax_typ();
		}
		if ($tax_cd.equalsIgnoreCase(name)) {
			return tax_cd();
		}
		if ($if_tax_cd.equalsIgnoreCase(name)) {
			return if_tax_cd();
		}
		if ($tax_nm.equalsIgnoreCase(name)) {
			return tax_nm();
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
		if ($purc_act_no.equalsIgnoreCase(name)) {
			return purc_act_no();
		}
		if ($purc_act_d_no.equalsIgnoreCase(name)) {
			return purc_act_d_no();
		}
		if ($if_co_cd.equalsIgnoreCase(name)) {
			return if_co_cd();
		}
		if ($co_nm.equalsIgnoreCase(name)) {
			return co_nm();
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
		if ($sppl_cntry_nm.equalsIgnoreCase(name)) {
			return sppl_cntry_nm();
		}
		if ($in_to_cntry_nm.equalsIgnoreCase(name)) {
			return in_to_cntry_nm();
		}
		if ($tdlv_cntry_nm.equalsIgnoreCase(name)) {
			return tdlv_cntry_nm();
		}
		if ($drct_dlv_cntry_nm.equalsIgnoreCase(name)) {
			return drct_dlv_cntry_nm();
		}
		if ($trd_cur_nm.equalsIgnoreCase(name)) {
			return trd_cur_nm();
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			return wg_nm();
		}
		if ($cntry_nm.equalsIgnoreCase(name)) {
			return cntry_nm();
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
		if ($wtax_rate.equalsIgnoreCase(name)) {
			return wtax_rate();
		}
		if ($wtax_amt.equalsIgnoreCase(name)) {
			return wtax_amt();
		}
		if ($purc_act_rev.equalsIgnoreCase(name)) {
			return purc_act_rev();
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
		if ($ac_dt.equalsIgnoreCase(name)) {
			return ac_dt();
		}
		if ($ac_ym.equalsIgnoreCase(name)) {
			return ac_ym();
		}
		if ($purc_dt.equalsIgnoreCase(name)) {
			return purc_dt();
		}
		if ($red_slip_ac_dt.equalsIgnoreCase(name)) {
			return red_slip_ac_dt();
		}
		if ($red_slip_ac_ym.equalsIgnoreCase(name)) {
			return red_slip_ac_ym();
		}
		if ($pay_schd_dt.equalsIgnoreCase(name)) {
			return pay_schd_dt();
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
		if ($iv_flg.equalsIgnoreCase(name)) {
			return iv_flg();
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			return abort_flg();
		}
		if ($in_to_sundry_flg.equalsIgnoreCase(name)) {
			return in_to_sundry_flg();
		}
		if ($tdlv_sundry_flg.equalsIgnoreCase(name)) {
			return tdlv_sundry_flg();
		}
		if ($drct_dlv_flg.equalsIgnoreCase(name)) {
			return drct_dlv_flg();
		}
		if ($sundry_itm_flg.equalsIgnoreCase(name)) {
			return sundry_itm_flg();
		}
		if ($interim_flg.equalsIgnoreCase(name)) {
			return interim_flg();
		}
		if ($inc_tax_flg.equalsIgnoreCase(name)) {
			return inc_tax_flg();
		}
		if ($accpt_dfct_flg.equalsIgnoreCase(name)) {
			return accpt_dfct_flg();
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
		if ($po_no.equalsIgnoreCase(name)) {
			po_no(value);
			return;
		}
		if ($po_d_no.equalsIgnoreCase(name)) {
			po_d_no(value);
			return;
		}
		if ($bp_dlv_slip_no.equalsIgnoreCase(name)) {
			bp_dlv_slip_no(value);
			return;
		}
		if ($bp_dlv_slip_lno.equalsIgnoreCase(name)) {
			bp_dlv_slip_lno(value);
			return;
		}
		if ($cntry_cd.equalsIgnoreCase(name)) {
			cntry_cd(value);
			return;
		}
		if ($if_cntry_cd.equalsIgnoreCase(name)) {
			if_cntry_cd(value);
			return;
		}
		if ($purc_dpt_cd.equalsIgnoreCase(name)) {
			purc_dpt_cd(value);
			return;
		}
		if ($if_purc_dpt_cd.equalsIgnoreCase(name)) {
			if_purc_dpt_cd(value);
			return;
		}
		if ($purc_dpt_nm.equalsIgnoreCase(name)) {
			purc_dpt_nm(value);
			return;
		}
		if ($purc_usr_cd.equalsIgnoreCase(name)) {
			purc_usr_cd(value);
			return;
		}
		if ($if_purc_usr_cd.equalsIgnoreCase(name)) {
			if_purc_usr_cd(value);
			return;
		}
		if ($purc_usr_nm.equalsIgnoreCase(name)) {
			purc_usr_nm(value);
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
		if ($if_sppl_cd.equalsIgnoreCase(name)) {
			if_sppl_cd(value);
			return;
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			sppl_nm(value);
			return;
		}
		if ($sppl_cntry_cd.equalsIgnoreCase(name)) {
			sppl_cntry_cd(value);
			return;
		}
		if ($if_sppl_cntry_cd.equalsIgnoreCase(name)) {
			if_sppl_cntry_cd(value);
			return;
		}
		if ($in_to_id_typ.equalsIgnoreCase(name)) {
			in_to_id_typ(value);
			return;
		}
		if ($in_to_id_cd.equalsIgnoreCase(name)) {
			in_to_id_cd(value);
			return;
		}
		if ($if_in_to_id_cd.equalsIgnoreCase(name)) {
			if_in_to_id_cd(value);
			return;
		}
		if ($in_to_nm.equalsIgnoreCase(name)) {
			in_to_nm(value);
			return;
		}
		if ($in_to_zip_cd.equalsIgnoreCase(name)) {
			in_to_zip_cd(value);
			return;
		}
		if ($in_to_addr1.equalsIgnoreCase(name)) {
			in_to_addr1(value);
			return;
		}
		if ($in_to_addr2.equalsIgnoreCase(name)) {
			in_to_addr2(value);
			return;
		}
		if ($in_to_addr3.equalsIgnoreCase(name)) {
			in_to_addr3(value);
			return;
		}
		if ($in_to_addr4.equalsIgnoreCase(name)) {
			in_to_addr4(value);
			return;
		}
		if ($in_to_cntct_dpt.equalsIgnoreCase(name)) {
			in_to_cntct_dpt(value);
			return;
		}
		if ($in_to_cntct_psn.equalsIgnoreCase(name)) {
			in_to_cntct_psn(value);
			return;
		}
		if ($in_to_tel.equalsIgnoreCase(name)) {
			in_to_tel(value);
			return;
		}
		if ($in_to_fax.equalsIgnoreCase(name)) {
			in_to_fax(value);
			return;
		}
		if ($in_to_cntry_cd.equalsIgnoreCase(name)) {
			in_to_cntry_cd(value);
			return;
		}
		if ($if_in_to_cntry_cd.equalsIgnoreCase(name)) {
			if_in_to_cntry_cd(value);
			return;
		}
		if ($tdlv_cd.equalsIgnoreCase(name)) {
			tdlv_cd(value);
			return;
		}
		if ($if_tdlv_cd.equalsIgnoreCase(name)) {
			if_tdlv_cd(value);
			return;
		}
		if ($tdlv_nm.equalsIgnoreCase(name)) {
			tdlv_nm(value);
			return;
		}
		if ($tdlv_zip_cd.equalsIgnoreCase(name)) {
			tdlv_zip_cd(value);
			return;
		}
		if ($tdlv_addr1.equalsIgnoreCase(name)) {
			tdlv_addr1(value);
			return;
		}
		if ($tdlv_addr2.equalsIgnoreCase(name)) {
			tdlv_addr2(value);
			return;
		}
		if ($tdlv_addr3.equalsIgnoreCase(name)) {
			tdlv_addr3(value);
			return;
		}
		if ($tdlv_addr4.equalsIgnoreCase(name)) {
			tdlv_addr4(value);
			return;
		}
		if ($tdlv_cntct_dpt.equalsIgnoreCase(name)) {
			tdlv_cntct_dpt(value);
			return;
		}
		if ($tdlv_cntct_psn.equalsIgnoreCase(name)) {
			tdlv_cntct_psn(value);
			return;
		}
		if ($tdlv_tel.equalsIgnoreCase(name)) {
			tdlv_tel(value);
			return;
		}
		if ($tdlv_fax.equalsIgnoreCase(name)) {
			tdlv_fax(value);
			return;
		}
		if ($tdlv_cntry_cd.equalsIgnoreCase(name)) {
			tdlv_cntry_cd(value);
			return;
		}
		if ($if_tdlv_cntry_cd.equalsIgnoreCase(name)) {
			if_tdlv_cntry_cd(value);
			return;
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			site_cd(value);
			return;
		}
		if ($if_site_cd.equalsIgnoreCase(name)) {
			if_site_cd(value);
			return;
		}
		if ($site_nm.equalsIgnoreCase(name)) {
			site_nm(value);
			return;
		}
		if ($drct_dlv_bp_cd.equalsIgnoreCase(name)) {
			drct_dlv_bp_cd(value);
			return;
		}
		if ($if_drct_dlv_bp_cd.equalsIgnoreCase(name)) {
			if_drct_dlv_bp_cd(value);
			return;
		}
		if ($drct_dlv_bp_nm.equalsIgnoreCase(name)) {
			drct_dlv_bp_nm(value);
			return;
		}
		if ($drct_dlv_cntry_cd.equalsIgnoreCase(name)) {
			drct_dlv_cntry_cd(value);
			return;
		}
		if ($if_drct_dlv_cntry_cd.equalsIgnoreCase(name)) {
			if_drct_dlv_cntry_cd(value);
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
		if ($tterm_cd1.equalsIgnoreCase(name)) {
			tterm_cd1(value);
			return;
		}
		if ($if_tterm_cd1.equalsIgnoreCase(name)) {
			if_tterm_cd1(value);
			return;
		}
		if ($tterm_nm1.equalsIgnoreCase(name)) {
			tterm_nm1(value);
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
		if ($if_tterm_cd2.equalsIgnoreCase(name)) {
			if_tterm_cd2(value);
			return;
		}
		if ($tterm_nm2.equalsIgnoreCase(name)) {
			tterm_nm2(value);
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
		if ($if_tterm_cd3.equalsIgnoreCase(name)) {
			if_tterm_cd3(value);
			return;
		}
		if ($tterm_nm3.equalsIgnoreCase(name)) {
			tterm_nm3(value);
			return;
		}
		if ($tterm_rmrks3.equalsIgnoreCase(name)) {
			tterm_rmrks3(value);
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
		if ($itm_nm.equalsIgnoreCase(name)) {
			itm_nm(value);
			return;
		}
		if ($iv_itm_nm.equalsIgnoreCase(name)) {
			iv_itm_nm(value);
			return;
		}
		if ($sppl_itm_cd.equalsIgnoreCase(name)) {
			sppl_itm_cd(value);
			return;
		}
		if ($sppl_itm_nm.equalsIgnoreCase(name)) {
			sppl_itm_nm(value);
			return;
		}
		if ($bp_lot_no.equalsIgnoreCase(name)) {
			bp_lot_no(value);
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
		if ($trd_unit_nm.equalsIgnoreCase(name)) {
			trd_unit_nm(value);
			return;
		}
		if ($dscnt_rsn_cd.equalsIgnoreCase(name)) {
			dscnt_rsn_cd(value);
			return;
		}
		if ($if_dscnt_rsn_cd.equalsIgnoreCase(name)) {
			if_dscnt_rsn_cd(value);
			return;
		}
		if ($dscnt_rsn_nm.equalsIgnoreCase(name)) {
			dscnt_rsn_nm(value);
			return;
		}
		if ($tax_typ.equalsIgnoreCase(name)) {
			tax_typ(value);
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
		if ($tax_nm.equalsIgnoreCase(name)) {
			tax_nm(value);
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
		if ($purc_act_no.equalsIgnoreCase(name)) {
			purc_act_no(value);
			return;
		}
		if ($purc_act_d_no.equalsIgnoreCase(name)) {
			purc_act_d_no(value);
			return;
		}
		if ($if_co_cd.equalsIgnoreCase(name)) {
			if_co_cd(value);
			return;
		}
		if ($co_nm.equalsIgnoreCase(name)) {
			co_nm(value);
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
		if ($sppl_cntry_nm.equalsIgnoreCase(name)) {
			sppl_cntry_nm(value);
			return;
		}
		if ($in_to_cntry_nm.equalsIgnoreCase(name)) {
			in_to_cntry_nm(value);
			return;
		}
		if ($tdlv_cntry_nm.equalsIgnoreCase(name)) {
			tdlv_cntry_nm(value);
			return;
		}
		if ($drct_dlv_cntry_nm.equalsIgnoreCase(name)) {
			drct_dlv_cntry_nm(value);
			return;
		}
		if ($trd_cur_nm.equalsIgnoreCase(name)) {
			trd_cur_nm(value);
			return;
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			wg_nm(value);
			return;
		}
		if ($cntry_nm.equalsIgnoreCase(name)) {
			cntry_nm(value);
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
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($wtax_amt.equalsIgnoreCase(name)) {
			wtax_amt(value);
			return;
		}
		if ($purc_act_rev.equalsIgnoreCase(name)) {
			purc_act_rev(value);
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
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($wtax_amt.equalsIgnoreCase(name)) {
			wtax_amt(value);
			return;
		}
		if ($purc_act_rev.equalsIgnoreCase(name)) {
			purc_act_rev(value);
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
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($wtax_amt.equalsIgnoreCase(name)) {
			wtax_amt(value);
			return;
		}
		if ($purc_act_rev.equalsIgnoreCase(name)) {
			purc_act_rev(value);
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
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($wtax_amt.equalsIgnoreCase(name)) {
			wtax_amt(value);
			return;
		}
		if ($purc_act_rev.equalsIgnoreCase(name)) {
			purc_act_rev(value);
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
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($wtax_amt.equalsIgnoreCase(name)) {
			wtax_amt(value);
			return;
		}
		if ($purc_act_rev.equalsIgnoreCase(name)) {
			purc_act_rev(value);
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
		if ($ac_dt.equalsIgnoreCase(name)) {
			ac_dt(value);
			return;
		}
		if ($ac_ym.equalsIgnoreCase(name)) {
			ac_ym(value);
			return;
		}
		if ($purc_dt.equalsIgnoreCase(name)) {
			purc_dt(value);
			return;
		}
		if ($red_slip_ac_dt.equalsIgnoreCase(name)) {
			red_slip_ac_dt(value);
			return;
		}
		if ($red_slip_ac_ym.equalsIgnoreCase(name)) {
			red_slip_ac_ym(value);
			return;
		}
		if ($pay_schd_dt.equalsIgnoreCase(name)) {
			pay_schd_dt(value);
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
		if ($iv_flg.equalsIgnoreCase(name)) {
			iv_flg(value);
			return;
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			abort_flg(value);
			return;
		}
		if ($in_to_sundry_flg.equalsIgnoreCase(name)) {
			in_to_sundry_flg(value);
			return;
		}
		if ($tdlv_sundry_flg.equalsIgnoreCase(name)) {
			tdlv_sundry_flg(value);
			return;
		}
		if ($drct_dlv_flg.equalsIgnoreCase(name)) {
			drct_dlv_flg(value);
			return;
		}
		if ($sundry_itm_flg.equalsIgnoreCase(name)) {
			sundry_itm_flg(value);
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
		if ($accpt_dfct_flg.equalsIgnoreCase(name)) {
			accpt_dfct_flg(value);
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
		if ($po_no.equalsIgnoreCase(name)) {
			po_no(value);
			return;
		}
		if ($po_d_no.equalsIgnoreCase(name)) {
			po_d_no(value);
			return;
		}
		if ($bp_dlv_slip_no.equalsIgnoreCase(name)) {
			bp_dlv_slip_no(value);
			return;
		}
		if ($bp_dlv_slip_lno.equalsIgnoreCase(name)) {
			bp_dlv_slip_lno(value);
			return;
		}
		if ($cntry_cd.equalsIgnoreCase(name)) {
			cntry_cd(value);
			return;
		}
		if ($if_cntry_cd.equalsIgnoreCase(name)) {
			if_cntry_cd(value);
			return;
		}
		if ($purc_dpt_cd.equalsIgnoreCase(name)) {
			purc_dpt_cd(value);
			return;
		}
		if ($if_purc_dpt_cd.equalsIgnoreCase(name)) {
			if_purc_dpt_cd(value);
			return;
		}
		if ($purc_dpt_nm.equalsIgnoreCase(name)) {
			purc_dpt_nm(value);
			return;
		}
		if ($purc_usr_cd.equalsIgnoreCase(name)) {
			purc_usr_cd(value);
			return;
		}
		if ($if_purc_usr_cd.equalsIgnoreCase(name)) {
			if_purc_usr_cd(value);
			return;
		}
		if ($purc_usr_nm.equalsIgnoreCase(name)) {
			purc_usr_nm(value);
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
		if ($if_sppl_cd.equalsIgnoreCase(name)) {
			if_sppl_cd(value);
			return;
		}
		if ($sppl_nm.equalsIgnoreCase(name)) {
			sppl_nm(value);
			return;
		}
		if ($sppl_cntry_cd.equalsIgnoreCase(name)) {
			sppl_cntry_cd(value);
			return;
		}
		if ($if_sppl_cntry_cd.equalsIgnoreCase(name)) {
			if_sppl_cntry_cd(value);
			return;
		}
		if ($in_to_id_typ.equalsIgnoreCase(name)) {
			in_to_id_typ(value);
			return;
		}
		if ($in_to_id_cd.equalsIgnoreCase(name)) {
			in_to_id_cd(value);
			return;
		}
		if ($if_in_to_id_cd.equalsIgnoreCase(name)) {
			if_in_to_id_cd(value);
			return;
		}
		if ($in_to_nm.equalsIgnoreCase(name)) {
			in_to_nm(value);
			return;
		}
		if ($in_to_zip_cd.equalsIgnoreCase(name)) {
			in_to_zip_cd(value);
			return;
		}
		if ($in_to_addr1.equalsIgnoreCase(name)) {
			in_to_addr1(value);
			return;
		}
		if ($in_to_addr2.equalsIgnoreCase(name)) {
			in_to_addr2(value);
			return;
		}
		if ($in_to_addr3.equalsIgnoreCase(name)) {
			in_to_addr3(value);
			return;
		}
		if ($in_to_addr4.equalsIgnoreCase(name)) {
			in_to_addr4(value);
			return;
		}
		if ($in_to_cntct_dpt.equalsIgnoreCase(name)) {
			in_to_cntct_dpt(value);
			return;
		}
		if ($in_to_cntct_psn.equalsIgnoreCase(name)) {
			in_to_cntct_psn(value);
			return;
		}
		if ($in_to_tel.equalsIgnoreCase(name)) {
			in_to_tel(value);
			return;
		}
		if ($in_to_fax.equalsIgnoreCase(name)) {
			in_to_fax(value);
			return;
		}
		if ($in_to_cntry_cd.equalsIgnoreCase(name)) {
			in_to_cntry_cd(value);
			return;
		}
		if ($if_in_to_cntry_cd.equalsIgnoreCase(name)) {
			if_in_to_cntry_cd(value);
			return;
		}
		if ($tdlv_cd.equalsIgnoreCase(name)) {
			tdlv_cd(value);
			return;
		}
		if ($if_tdlv_cd.equalsIgnoreCase(name)) {
			if_tdlv_cd(value);
			return;
		}
		if ($tdlv_nm.equalsIgnoreCase(name)) {
			tdlv_nm(value);
			return;
		}
		if ($tdlv_zip_cd.equalsIgnoreCase(name)) {
			tdlv_zip_cd(value);
			return;
		}
		if ($tdlv_addr1.equalsIgnoreCase(name)) {
			tdlv_addr1(value);
			return;
		}
		if ($tdlv_addr2.equalsIgnoreCase(name)) {
			tdlv_addr2(value);
			return;
		}
		if ($tdlv_addr3.equalsIgnoreCase(name)) {
			tdlv_addr3(value);
			return;
		}
		if ($tdlv_addr4.equalsIgnoreCase(name)) {
			tdlv_addr4(value);
			return;
		}
		if ($tdlv_cntct_dpt.equalsIgnoreCase(name)) {
			tdlv_cntct_dpt(value);
			return;
		}
		if ($tdlv_cntct_psn.equalsIgnoreCase(name)) {
			tdlv_cntct_psn(value);
			return;
		}
		if ($tdlv_tel.equalsIgnoreCase(name)) {
			tdlv_tel(value);
			return;
		}
		if ($tdlv_fax.equalsIgnoreCase(name)) {
			tdlv_fax(value);
			return;
		}
		if ($tdlv_cntry_cd.equalsIgnoreCase(name)) {
			tdlv_cntry_cd(value);
			return;
		}
		if ($if_tdlv_cntry_cd.equalsIgnoreCase(name)) {
			if_tdlv_cntry_cd(value);
			return;
		}
		if ($site_cd.equalsIgnoreCase(name)) {
			site_cd(value);
			return;
		}
		if ($if_site_cd.equalsIgnoreCase(name)) {
			if_site_cd(value);
			return;
		}
		if ($site_nm.equalsIgnoreCase(name)) {
			site_nm(value);
			return;
		}
		if ($drct_dlv_bp_cd.equalsIgnoreCase(name)) {
			drct_dlv_bp_cd(value);
			return;
		}
		if ($if_drct_dlv_bp_cd.equalsIgnoreCase(name)) {
			if_drct_dlv_bp_cd(value);
			return;
		}
		if ($drct_dlv_bp_nm.equalsIgnoreCase(name)) {
			drct_dlv_bp_nm(value);
			return;
		}
		if ($drct_dlv_cntry_cd.equalsIgnoreCase(name)) {
			drct_dlv_cntry_cd(value);
			return;
		}
		if ($if_drct_dlv_cntry_cd.equalsIgnoreCase(name)) {
			if_drct_dlv_cntry_cd(value);
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
		if ($tterm_cd1.equalsIgnoreCase(name)) {
			tterm_cd1(value);
			return;
		}
		if ($if_tterm_cd1.equalsIgnoreCase(name)) {
			if_tterm_cd1(value);
			return;
		}
		if ($tterm_nm1.equalsIgnoreCase(name)) {
			tterm_nm1(value);
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
		if ($if_tterm_cd2.equalsIgnoreCase(name)) {
			if_tterm_cd2(value);
			return;
		}
		if ($tterm_nm2.equalsIgnoreCase(name)) {
			tterm_nm2(value);
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
		if ($if_tterm_cd3.equalsIgnoreCase(name)) {
			if_tterm_cd3(value);
			return;
		}
		if ($tterm_nm3.equalsIgnoreCase(name)) {
			tterm_nm3(value);
			return;
		}
		if ($tterm_rmrks3.equalsIgnoreCase(name)) {
			tterm_rmrks3(value);
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
		if ($itm_nm.equalsIgnoreCase(name)) {
			itm_nm(value);
			return;
		}
		if ($iv_itm_nm.equalsIgnoreCase(name)) {
			iv_itm_nm(value);
			return;
		}
		if ($sppl_itm_cd.equalsIgnoreCase(name)) {
			sppl_itm_cd(value);
			return;
		}
		if ($sppl_itm_nm.equalsIgnoreCase(name)) {
			sppl_itm_nm(value);
			return;
		}
		if ($bp_lot_no.equalsIgnoreCase(name)) {
			bp_lot_no(value);
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
		if ($trd_unit_nm.equalsIgnoreCase(name)) {
			trd_unit_nm(value);
			return;
		}
		if ($dscnt_rsn_cd.equalsIgnoreCase(name)) {
			dscnt_rsn_cd(value);
			return;
		}
		if ($if_dscnt_rsn_cd.equalsIgnoreCase(name)) {
			if_dscnt_rsn_cd(value);
			return;
		}
		if ($dscnt_rsn_nm.equalsIgnoreCase(name)) {
			dscnt_rsn_nm(value);
			return;
		}
		if ($tax_typ.equalsIgnoreCase(name)) {
			tax_typ(value);
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
		if ($tax_nm.equalsIgnoreCase(name)) {
			tax_nm(value);
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
		if ($purc_act_no.equalsIgnoreCase(name)) {
			purc_act_no(value);
			return;
		}
		if ($purc_act_d_no.equalsIgnoreCase(name)) {
			purc_act_d_no(value);
			return;
		}
		if ($if_co_cd.equalsIgnoreCase(name)) {
			if_co_cd(value);
			return;
		}
		if ($co_nm.equalsIgnoreCase(name)) {
			co_nm(value);
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
		if ($sppl_cntry_nm.equalsIgnoreCase(name)) {
			sppl_cntry_nm(value);
			return;
		}
		if ($in_to_cntry_nm.equalsIgnoreCase(name)) {
			in_to_cntry_nm(value);
			return;
		}
		if ($tdlv_cntry_nm.equalsIgnoreCase(name)) {
			tdlv_cntry_nm(value);
			return;
		}
		if ($drct_dlv_cntry_nm.equalsIgnoreCase(name)) {
			drct_dlv_cntry_nm(value);
			return;
		}
		if ($trd_cur_nm.equalsIgnoreCase(name)) {
			trd_cur_nm(value);
			return;
		}
		if ($wg_nm.equalsIgnoreCase(name)) {
			wg_nm(value);
			return;
		}
		if ($cntry_nm.equalsIgnoreCase(name)) {
			cntry_nm(value);
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
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($wtax_amt.equalsIgnoreCase(name)) {
			wtax_amt(value);
			return;
		}
		if ($purc_act_rev.equalsIgnoreCase(name)) {
			purc_act_rev(value);
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
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($wtax_amt.equalsIgnoreCase(name)) {
			wtax_amt(value);
			return;
		}
		if ($purc_act_rev.equalsIgnoreCase(name)) {
			purc_act_rev(value);
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
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($wtax_amt.equalsIgnoreCase(name)) {
			wtax_amt(value);
			return;
		}
		if ($purc_act_rev.equalsIgnoreCase(name)) {
			purc_act_rev(value);
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
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($wtax_amt.equalsIgnoreCase(name)) {
			wtax_amt(value);
			return;
		}
		if ($purc_act_rev.equalsIgnoreCase(name)) {
			purc_act_rev(value);
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
		if ($wtax_rate.equalsIgnoreCase(name)) {
			wtax_rate(value);
			return;
		}
		if ($wtax_amt.equalsIgnoreCase(name)) {
			wtax_amt(value);
			return;
		}
		if ($purc_act_rev.equalsIgnoreCase(name)) {
			purc_act_rev(value);
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
		if ($ac_dt.equalsIgnoreCase(name)) {
			ac_dt(value);
			return;
		}
		if ($ac_ym.equalsIgnoreCase(name)) {
			ac_ym(value);
			return;
		}
		if ($purc_dt.equalsIgnoreCase(name)) {
			purc_dt(value);
			return;
		}
		if ($red_slip_ac_dt.equalsIgnoreCase(name)) {
			red_slip_ac_dt(value);
			return;
		}
		if ($red_slip_ac_ym.equalsIgnoreCase(name)) {
			red_slip_ac_ym(value);
			return;
		}
		if ($pay_schd_dt.equalsIgnoreCase(name)) {
			pay_schd_dt(value);
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
		if ($iv_flg.equalsIgnoreCase(name)) {
			iv_flg(value);
			return;
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			abort_flg(value);
			return;
		}
		if ($in_to_sundry_flg.equalsIgnoreCase(name)) {
			in_to_sundry_flg(value);
			return;
		}
		if ($tdlv_sundry_flg.equalsIgnoreCase(name)) {
			tdlv_sundry_flg(value);
			return;
		}
		if ($drct_dlv_flg.equalsIgnoreCase(name)) {
			drct_dlv_flg(value);
			return;
		}
		if ($sundry_itm_flg.equalsIgnoreCase(name)) {
			sundry_itm_flg(value);
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
		if ($accpt_dfct_flg.equalsIgnoreCase(name)) {
			accpt_dfct_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

}
