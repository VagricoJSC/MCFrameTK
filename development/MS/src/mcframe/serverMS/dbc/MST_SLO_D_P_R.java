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
 * "受注明細（改訂履歴） // Sales order details (Rev. history)"DBコンテナRowクラスです。<p>
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
 *  	<td>slo_d_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>受注明細ＮＯ</td>
 *  	<td>Sales order details No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>slo_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>受注ＮＯ</td>
 *  	<td>Sales order No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>K</td>
 *  	<td>slo_rev</td>
 *  	<td>N</td>
 *  	<td>4,0</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>受注改訂番号</td>
 *  	<td>Sales order rev. number</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>disp_seq</td>
 *  	<td>N</td>
 *  	<td>5,0</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>表示順</td>
 *  	<td>Display order</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>itm_cd</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>品目ＣＤ</td>
 *  	<td>Item cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>itm_sub1</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>枝番１</td>
 *  	<td>Branch No. 1</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>itm_sub2</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>枝番２</td>
 *  	<td>Branch No. 2</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>itm_sub3</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>枝番３</td>
 *  	<td>Branch No. 3</td>
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
 *  	<td>sno1</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>手配ＮＯ１</td>
 *  	<td>SEIBAN No. 1</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sno1_null_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>手配ＮＯ１無し可ＦＬＧ</td>
 *  	<td>Allow without SEIBAN No. 1 flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sno2</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>手配ＮＯ２</td>
 *  	<td>SEIBAN No. 2</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sno2_null_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>手配ＮＯ２無し可ＦＬＧ</td>
 *  	<td>Allow without SEIBAN No. 2 flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sno3</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>手配ＮＯ３</td>
 *  	<td>SEIBAN No. 3</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sno3_null_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>手配ＮＯ３無し可ＦＬＧ</td>
 *  	<td>Allow without SEIBAN No. 3 flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sno4</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>手配ＮＯ４</td>
 *  	<td>SEIBAN No. 4</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sno4_null_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>手配ＮＯ４無し可ＦＬＧ</td>
 *  	<td>Allow without SEIBAN No. 4 flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ver_no</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>版ＮＯ</td>
 *  	<td>Version No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>gd_cd</td>
 *  	<td>C</td>
 *  	<td>2</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>格付ＣＤ</td>
 *  	<td>Grading cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sundry_itm_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>諸口品ＦＬＧ</td>
 *  	<td>Miscellaneous item flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sls_itm_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>販売品目ＮＯ</td>
 *  	<td>Sales item No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ship_inst_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>出荷指図区分</td>
 *  	<td>Shipping order type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ship_schd_split_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>出荷予定分割区分</td>
 *  	<td>Shipping schedule split type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>cntry_org_cd</td>
 *  	<td>C</td>
 *  	<td>2</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>原産地ＣＤ</td>
 *  	<td>Place of origin cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>dlv_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>納品先ＣＤ</td>
 *  	<td>Delivery destination cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>dlv_sundry_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>納品先諸口ＦＬＧ</td>
 *  	<td>Miscellaneous delivery destination flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>dlv_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>納品先名</td>
 *  	<td>Delivery destination name</td>
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
 *  	<td>dlv_zip_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>納品先郵便番号</td>
 *  	<td>Zip code (Delivery destination)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>dlv_addr1</td>
 *  	<td>C</td>
 *  	<td>250</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>納品先住所１</td>
 *  	<td>Address 1 (Delivery destination)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>dlv_addr2</td>
 *  	<td>C</td>
 *  	<td>250</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>納品先住所２</td>
 *  	<td>Address 2 (Delivery destination)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>dlv_addr3</td>
 *  	<td>C</td>
 *  	<td>250</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>納品先住所３</td>
 *  	<td>Address 3 (Delivery destination)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>dlv_addr4</td>
 *  	<td>C</td>
 *  	<td>250</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>納品先住所４</td>
 *  	<td>Address 4 (Delivery destination)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>dlv_tel</td>
 *  	<td>C</td>
 *  	<td>30</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>納品先ＴＥＬ</td>
 *  	<td>TEL (Delivery destination)</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>dlv_fax</td>
 *  	<td>C</td>
 *  	<td>30</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>納品先ＦＡＸ</td>
 *  	<td>FAX (Delivery destination)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>dlv_lg_grp_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>納品先物流グループＣＤ</td>
 *  	<td>Delivery destination distribution group cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>pri_prnt_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>価格印字ＦＬＧ</td>
 *  	<td>Print price flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>dest_cd1</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>仕向先ＣＤ１</td>
 *  	<td>Distribution channel cd. 1</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>dest_cd2</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>仕向先ＣＤ２</td>
 *  	<td>Distribution channel cd. 2</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>dest_cd3</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>仕向先ＣＤ３</td>
 *  	<td>Distribution channel cd. 3</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>tdlv_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>配送先ＣＤ</td>
 *  	<td>Receiving point cd.</td>
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
 *  	<td>tdlv_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>配送先名</td>
 *  	<td>Receiving point name</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>via_dlv_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>配送先経由区分</td>
 *  	<td>Receiving point stopover type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>tdlv_cntct_dpt</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>配送先部署</td>
 *  	<td>Receiving point dept.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>tdlv_cntct_psn</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>配送先担当者</td>
 *  	<td>Receiving point PIC</td>
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
 *  	<td>tdlv_lg_grp_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>配送先物流グループＣＤ</td>
 *  	<td>Receiving point distribution group cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>dlv_day_week_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>着曜日</td>
 *  	<td>Arrival day of week</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sls_cststk_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>預り売上ＦＬＧ</td>
 *  	<td>Sales keeping customer inventory flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>trd_unit_cd</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>取引単位ＣＤ</td>
 *  	<td>Transaction unit cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>trd_unit_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>取引単位数量</td>
 *  	<td>Transaction unit qty.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>base_unit_cd</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>基準単位ＣＤ</td>
 *  	<td>Base unit cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>base_unit_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>基準単位数量</td>
 *  	<td>Base unit qty.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>trd_cur_upri</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引通貨単価</td>
 *  	<td>Unit price (Transaction currency)</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>upri_not_tgt_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>単価再取得対象外ＦＬＧ</td>
 *  	<td>Not to reacquire unit price flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>cost_upri</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>原価単価</td>
 *  	<td>Unit cost</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>cost_amt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>原価金額</td>
 *  	<td>Total cost</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>interim_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>仮単価ＦＬＧ</td>
 *  	<td>Temporary unit price flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>trd_cur_amt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
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
 *  	<td>dscnt_rsn_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>値引理由ＣＤ</td>
 *  	<td>Discount reason cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>iv_upri</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>インボイス表記単価</td>
 *  	<td>Unit price for invoice</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>iv_amt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>インボイス表記金額</td>
 *  	<td>Amount for invoice</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>tax_fix_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>税指定ＦＬＧ</td>
 *  	<td>Tax specified flg.</td>
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
 *  	<td>proc_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>手配区分</td>
 *  	<td>Procurement type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sls_upri_req_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>販売単価取得区分</td>
 *  	<td>Sales unit price acquisition type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>set_itm_grp_no</td>
 *  	<td>N</td>
 *  	<td>3,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>品揃グループＮＯ</td>
 *  	<td>Assortment group No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>ship_rqst_tm</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>出荷希望日時</td>
 *  	<td>Desired shipping date and time</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>dlv_rqst_tm</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>納入希望日時</td>
 *  	<td>Desired delivery date and time</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sls_schd_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>売上予定日</td>
 *  	<td>Scheduled sales date</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>accpt_schd_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>検収予定日</td>
 *  	<td>Scheduled acceptance date</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>prms_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>納期回答ＦＬＧ</td>
 *  	<td>Order promising flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>rqst_to_loc_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>依頼先場所ＣＤ</td>
 *  	<td>Requested location cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sppl_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>発注先ＣＤ</td>
 *  	<td>Supplier cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>maker_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>メーカＣＤ</td>
 *  	<td>Maker cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>alloc_scope_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>引当範囲区分</td>
 *  	<td>Allocation range type</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>alloc_typ</td>
 *  	<td>C</td>
 *  	<td>1</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>引当区分</td>
 *  	<td>Allocation type</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>alloc_grp_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>総量引当場所グループＣＤ</td>
 *  	<td>Gross allocation location group cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ship_lg_grp_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>出荷物流グループＣＤ</td>
 *  	<td>Shipping distribution group cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>def_loc_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>デフォルト場所ＣＤ</td>
 *  	<td>Default location cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>loc_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>場所ＣＤ</td>
 *  	<td>Location cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>str_ln_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>棚・ラインＣＤ</td>
 *  	<td>Rack/Line cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>lot_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ロットＮＯ</td>
 *  	<td>Lot No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>sublot_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>サブロットＮＯ</td>
 *  	<td>Sublot No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>vmi_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>貸出ＦＬＧ</td>
 *  	<td>Consignment flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>wtax_rate</td>
 *  	<td>N</td>
 *  	<td>5,2</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>源泉税率</td>
 *  	<td>Withholding tax rate</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>wtax_amt</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>源泉税額</td>
 *  	<td>Withholding tax</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>wg_rqst_cnt_rmrks</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>依頼連絡備考</td>
 *  	<td>Request contact remarks</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ship_term_cd</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>出荷条件ＣＤ</td>
 *  	<td>Shipping conditions cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>bill_crryovr_times</td>
 *  	<td>N</td>
 *  	<td>2,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>請求繰越回数</td>
 *  	<td>Billing carry-over count</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>cst_po_d_no</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>得意先注文明細ＮＯ</td>
 *  	<td>Customer order details No.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>cst_itm_cd</td>
 *  	<td>C</td>
 *  	<td>40</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>得意先品目ＣＤ</td>
 *  	<td>Customer item cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>cst_itm_nm</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>得意先品名</td>
 *  	<td>Customer item name</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>cst_po_d_rmrks</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>得意先注文明細備考</td>
 *  	<td>Customer order details remarks</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>sls_rsn_cd</td>
 *  	<td>C</td>
 *  	<td>10</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>売上理由ＣＤ</td>
 *  	<td>Sales reason cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>bd_dpt_cd</td>
 *  	<td>C</td>
 *  	<td>20</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>負担部門ＣＤ</td>
 *  	<td>Charged dept. cd.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>rqst_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>依頼日</td>
 *  	<td>Request date</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>rqst_dlv_rqst_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>依頼納入希望日</td>
 *  	<td>Request desired delivery date</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>rqst_prms_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>依頼回答日</td>
 *  	<td>Request replied date</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>rqst_prms_dlv_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>依頼回答納入日</td>
 *  	<td>Request replied delivery date</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>rqst_unit_cd</td>
 *  	<td>C</td>
 *  	<td>5</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>依頼単位ＣＤ</td>
 *  	<td>Request unit cd.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>rqst_qty</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>依頼数量</td>
 *  	<td>Request qty.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>slo_sum_base_dt</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>受注集計基準日</td>
 *  	<td>Sales order aggregated base date</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>qtn_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>見積ＮＯ</td>
 *  	<td>Quotation No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>qtn_rev</td>
 *  	<td>N</td>
 *  	<td>4,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>見積改訂番号</td>
 *  	<td>Quotation rev. number</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>qtn_d_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>見積明細ＮＯ</td>
 *  	<td>Quotation details No.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>ship_cnt_rmrks</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>出荷連絡備考</td>
 *  	<td>Shipping notification remarks</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>trd_d_rmrks</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>取引明細備考</td>
 *  	<td>Transaction details remarks</td>
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
 *  	<td>io_schd_pr_no</td>
 *  	<td>C</td>
 *  	<td>15</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>受払進捗管理ＮＯ</td>
 *  	<td>GR/GI progress management No.</td>
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
 *  	<td>itm_comp_seq</td>
 *  	<td>N</td>
 *  	<td>3,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>構成表連番</td>
 *  	<td>Configuration table sequence number</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>itm_spec_seq</td>
 *  	<td>N</td>
 *  	<td>3,0</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>仕様表連番</td>
 *  	<td>Specification table sequence number</td>
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
 *  	<td>slo_d_can_rmkrs</td>
 *  	<td>C</td>
 *  	<td>100</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>明細取消備考</td>
 *  	<td>Details cancel remarks</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>edi_sub_d_char1</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＥＤＩ明細予備ＣＨＡＲ項目１</td>
 *  	<td>EDI details spare CHAR column 1</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>edi_sub_d_char2</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＥＤＩ明細予備ＣＨＡＲ項目２</td>
 *  	<td>EDI details spare CHAR column 2</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>edi_sub_d_char3</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＥＤＩ明細予備ＣＨＡＲ項目３</td>
 *  	<td>EDI details spare CHAR column 3</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>edi_sub_d_char4</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＥＤＩ明細予備ＣＨＡＲ項目４</td>
 *  	<td>EDI details spare CHAR column 4</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>edi_sub_d_char5</td>
 *  	<td>C</td>
 *  	<td>50</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＥＤＩ明細予備ＣＨＡＲ項目５</td>
 *  	<td>EDI details spare CHAR column 5</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>edi_sub_d_num1</td>
 *  	<td>N</td>
 *  	<td>21,8</td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＥＤＩ明細予備ＮＵＭ項目１</td>
 *  	<td>EDI details spare NUM column 1</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>edi_sub_d_dt1</td>
 *  	<td>D</td>
 *  	<td></td>
 *  	<td>Y</td>
 *  	<td></td>
 *  	<td>ＥＤＩ明細予備ＤＡＴＥ項目１</td>
 *  	<td>EDI details spare DATE column 1</td>
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
 *  	<td>not_lg_mix_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>物流グループ混在不可ＦＬＧ</td>
 *  	<td>Prohibit mixed distribution group flg.</td>
 *  </tr>
 *  <tr bgcolor="Moccasin">
 *  	<td>C</td>
 *  	<td>not_lot_mix_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>ロット混在不可ＦＬＧ</td>
 *  	<td>Prohibit mixed lots flg.</td>
 *  </tr>
 *  <tr >
 *  	<td>C</td>
 *  	<td>not_sublot_mix_flg</td>
 *  	<td>F</td>
 *  	<td></td>
 *  	<td>N</td>
 *  	<td></td>
 *  	<td>サブロット混在不可ＦＬＧ</td>
 *  	<td>Prohibit mixed sublots flg.</td>
 *  </tr>
 * </table>
 *
 * <br>
 * 実装仕様書から自動生成されるクラスです。カスタマイズできません。
 */
@SuppressWarnings({"all"})
public class MST_SLO_D_P_R extends MCDBContainer {

	public static final MCTableType TABLE_TYPE = MCTableType.CO_VIEW;

	public static final String TABLE_NAME = "MST_SLO_D_P";

	public static final boolean EX_CTRL = true;
	
	public static final boolean LCL_TABLE = false;
	
	/**
	 * 受注明細ＮＯ. Sales order details No..<p>
	 *
	 */
	public static final String $slo_d_no = "slo_d_no";
	private static final MCPermColumnInfo _slo_d_no = createColumnInfo("slo_d_no");
	public final MCStringPermColumn slo_d_no = createStringColumn(_slo_d_no);
	
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
	 * 表示順. Display order.<p>
	 *
	 */
	public static final String $disp_seq = "disp_seq";
	private static final MCPermColumnInfo _disp_seq = createColumnInfo("disp_seq");
	public final MCNumberPermColumn disp_seq = createNumberColumn(_disp_seq);
	
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
	 * 手配ＮＯ１. SEIBAN No. 1.<p>
	 *
	 */
	public static final String $sno1 = "sno1";
	private static final MCPermColumnInfo _sno1 = createColumnInfo("sno1");
	public final MCStringPermColumn sno1 = createStringColumn(_sno1);
	
	/**
	 * 手配ＮＯ１無し可ＦＬＧ. Allow without SEIBAN No. 1 flg..<p>
	 *
	 */
	public static final String $sno1_null_flg = "sno1_null_flg";
	private static final MCPermColumnInfo _sno1_null_flg = createColumnInfo("sno1_null_flg");
	public final MCBooleanPermColumn sno1_null_flg = createBooleanColumn(_sno1_null_flg);
	
	/**
	 * 手配ＮＯ２. SEIBAN No. 2.<p>
	 *
	 */
	public static final String $sno2 = "sno2";
	private static final MCPermColumnInfo _sno2 = createColumnInfo("sno2");
	public final MCStringPermColumn sno2 = createStringColumn(_sno2);
	
	/**
	 * 手配ＮＯ２無し可ＦＬＧ. Allow without SEIBAN No. 2 flg..<p>
	 *
	 */
	public static final String $sno2_null_flg = "sno2_null_flg";
	private static final MCPermColumnInfo _sno2_null_flg = createColumnInfo("sno2_null_flg");
	public final MCBooleanPermColumn sno2_null_flg = createBooleanColumn(_sno2_null_flg);
	
	/**
	 * 手配ＮＯ３. SEIBAN No. 3.<p>
	 *
	 */
	public static final String $sno3 = "sno3";
	private static final MCPermColumnInfo _sno3 = createColumnInfo("sno3");
	public final MCStringPermColumn sno3 = createStringColumn(_sno3);
	
	/**
	 * 手配ＮＯ３無し可ＦＬＧ. Allow without SEIBAN No. 3 flg..<p>
	 *
	 */
	public static final String $sno3_null_flg = "sno3_null_flg";
	private static final MCPermColumnInfo _sno3_null_flg = createColumnInfo("sno3_null_flg");
	public final MCBooleanPermColumn sno3_null_flg = createBooleanColumn(_sno3_null_flg);
	
	/**
	 * 手配ＮＯ４. SEIBAN No. 4.<p>
	 *
	 */
	public static final String $sno4 = "sno4";
	private static final MCPermColumnInfo _sno4 = createColumnInfo("sno4");
	public final MCStringPermColumn sno4 = createStringColumn(_sno4);
	
	/**
	 * 手配ＮＯ４無し可ＦＬＧ. Allow without SEIBAN No. 4 flg..<p>
	 *
	 */
	public static final String $sno4_null_flg = "sno4_null_flg";
	private static final MCPermColumnInfo _sno4_null_flg = createColumnInfo("sno4_null_flg");
	public final MCBooleanPermColumn sno4_null_flg = createBooleanColumn(_sno4_null_flg);
	
	/**
	 * 版ＮＯ. Version No..<p>
	 *
	 */
	public static final String $ver_no = "ver_no";
	private static final MCPermColumnInfo _ver_no = createColumnInfo("ver_no");
	public final MCStringPermColumn ver_no = createStringColumn(_ver_no);
	
	/**
	 * 格付ＣＤ. Grading cd..<p>
	 *
	 */
	public static final String $gd_cd = "gd_cd";
	private static final MCPermColumnInfo _gd_cd = createColumnInfo("gd_cd");
	public final MCStringPermColumn gd_cd = createStringColumn(_gd_cd);
	
	/**
	 * 諸口品ＦＬＧ. Miscellaneous item flg..<p>
	 *
	 */
	public static final String $sundry_itm_flg = "sundry_itm_flg";
	private static final MCPermColumnInfo _sundry_itm_flg = createColumnInfo("sundry_itm_flg");
	public final MCBooleanPermColumn sundry_itm_flg = createBooleanColumn(_sundry_itm_flg);
	
	/**
	 * 販売品目ＮＯ. Sales item No..<p>
	 *
	 */
	public static final String $sls_itm_no = "sls_itm_no";
	private static final MCPermColumnInfo _sls_itm_no = createColumnInfo("sls_itm_no");
	public final MCStringPermColumn sls_itm_no = createStringColumn(_sls_itm_no);
	
	/**
	 * 出荷指図区分. Shipping order type.<p>
	 *
	 */
	public static final String $ship_inst_typ = "ship_inst_typ";
	private static final MCPermColumnInfo _ship_inst_typ = createColumnInfo("ship_inst_typ");
	public final MCStringPermColumn ship_inst_typ = createStringColumn(_ship_inst_typ);
	
	/**
	 * 出荷予定分割区分. Shipping schedule split type.<p>
	 *
	 */
	public static final String $ship_schd_split_typ = "ship_schd_split_typ";
	private static final MCPermColumnInfo _ship_schd_split_typ = createColumnInfo("ship_schd_split_typ");
	public final MCStringPermColumn ship_schd_split_typ = createStringColumn(_ship_schd_split_typ);
	
	/**
	 * 原産地ＣＤ. Place of origin cd..<p>
	 *
	 */
	public static final String $cntry_org_cd = "cntry_org_cd";
	private static final MCPermColumnInfo _cntry_org_cd = createColumnInfo("cntry_org_cd");
	public final MCStringPermColumn cntry_org_cd = createStringColumn(_cntry_org_cd);
	
	/**
	 * 納品先ＣＤ. Delivery destination cd..<p>
	 *
	 */
	public static final String $dlv_cd = "dlv_cd";
	private static final MCPermColumnInfo _dlv_cd = createColumnInfo("dlv_cd");
	public final MCStringPermColumn dlv_cd = createStringColumn(_dlv_cd);
	
	/**
	 * 納品先諸口ＦＬＧ. Miscellaneous delivery destination flg..<p>
	 *
	 */
	public static final String $dlv_sundry_flg = "dlv_sundry_flg";
	private static final MCPermColumnInfo _dlv_sundry_flg = createColumnInfo("dlv_sundry_flg");
	public final MCBooleanPermColumn dlv_sundry_flg = createBooleanColumn(_dlv_sundry_flg);
	
	/**
	 * 納品先名. Delivery destination name.<p>
	 *
	 */
	public static final String $dlv_nm = "dlv_nm";
	private static final MCPermColumnInfo _dlv_nm = createColumnInfo("dlv_nm");
	public final MCStringPermColumn dlv_nm = createStringColumn(_dlv_nm);
	
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
	 * 納品先郵便番号. Zip code (Delivery destination).<p>
	 *
	 */
	public static final String $dlv_zip_cd = "dlv_zip_cd";
	private static final MCPermColumnInfo _dlv_zip_cd = createColumnInfo("dlv_zip_cd");
	public final MCStringPermColumn dlv_zip_cd = createStringColumn(_dlv_zip_cd);
	
	/**
	 * 納品先住所１. Address 1 (Delivery destination).<p>
	 *
	 */
	public static final String $dlv_addr1 = "dlv_addr1";
	private static final MCPermColumnInfo _dlv_addr1 = createColumnInfo("dlv_addr1");
	public final MCStringPermColumn dlv_addr1 = createStringColumn(_dlv_addr1);
	
	/**
	 * 納品先住所２. Address 2 (Delivery destination).<p>
	 *
	 */
	public static final String $dlv_addr2 = "dlv_addr2";
	private static final MCPermColumnInfo _dlv_addr2 = createColumnInfo("dlv_addr2");
	public final MCStringPermColumn dlv_addr2 = createStringColumn(_dlv_addr2);
	
	/**
	 * 納品先住所３. Address 3 (Delivery destination).<p>
	 *
	 */
	public static final String $dlv_addr3 = "dlv_addr3";
	private static final MCPermColumnInfo _dlv_addr3 = createColumnInfo("dlv_addr3");
	public final MCStringPermColumn dlv_addr3 = createStringColumn(_dlv_addr3);
	
	/**
	 * 納品先住所４. Address 4 (Delivery destination).<p>
	 *
	 */
	public static final String $dlv_addr4 = "dlv_addr4";
	private static final MCPermColumnInfo _dlv_addr4 = createColumnInfo("dlv_addr4");
	public final MCStringPermColumn dlv_addr4 = createStringColumn(_dlv_addr4);
	
	/**
	 * 納品先ＴＥＬ. TEL (Delivery destination).<p>
	 *
	 */
	public static final String $dlv_tel = "dlv_tel";
	private static final MCPermColumnInfo _dlv_tel = createColumnInfo("dlv_tel");
	public final MCStringPermColumn dlv_tel = createStringColumn(_dlv_tel);
	
	/**
	 * 納品先ＦＡＸ. FAX (Delivery destination).<p>
	 *
	 */
	public static final String $dlv_fax = "dlv_fax";
	private static final MCPermColumnInfo _dlv_fax = createColumnInfo("dlv_fax");
	public final MCStringPermColumn dlv_fax = createStringColumn(_dlv_fax);
	
	/**
	 * 納品先物流グループＣＤ. Delivery destination distribution group cd..<p>
	 *
	 */
	public static final String $dlv_lg_grp_cd = "dlv_lg_grp_cd";
	private static final MCPermColumnInfo _dlv_lg_grp_cd = createColumnInfo("dlv_lg_grp_cd");
	public final MCStringPermColumn dlv_lg_grp_cd = createStringColumn(_dlv_lg_grp_cd);
	
	/**
	 * 価格印字ＦＬＧ. Print price flg..<p>
	 *
	 */
	public static final String $pri_prnt_flg = "pri_prnt_flg";
	private static final MCPermColumnInfo _pri_prnt_flg = createColumnInfo("pri_prnt_flg");
	public final MCBooleanPermColumn pri_prnt_flg = createBooleanColumn(_pri_prnt_flg);
	
	/**
	 * 仕向先ＣＤ１. Distribution channel cd. 1.<p>
	 *
	 */
	public static final String $dest_cd1 = "dest_cd1";
	private static final MCPermColumnInfo _dest_cd1 = createColumnInfo("dest_cd1");
	public final MCStringPermColumn dest_cd1 = createStringColumn(_dest_cd1);
	
	/**
	 * 仕向先ＣＤ２. Distribution channel cd. 2.<p>
	 *
	 */
	public static final String $dest_cd2 = "dest_cd2";
	private static final MCPermColumnInfo _dest_cd2 = createColumnInfo("dest_cd2");
	public final MCStringPermColumn dest_cd2 = createStringColumn(_dest_cd2);
	
	/**
	 * 仕向先ＣＤ３. Distribution channel cd. 3.<p>
	 *
	 */
	public static final String $dest_cd3 = "dest_cd3";
	private static final MCPermColumnInfo _dest_cd3 = createColumnInfo("dest_cd3");
	public final MCStringPermColumn dest_cd3 = createStringColumn(_dest_cd3);
	
	/**
	 * 配送先ＣＤ. Receiving point cd..<p>
	 *
	 */
	public static final String $tdlv_cd = "tdlv_cd";
	private static final MCPermColumnInfo _tdlv_cd = createColumnInfo("tdlv_cd");
	public final MCStringPermColumn tdlv_cd = createStringColumn(_tdlv_cd);
	
	/**
	 * 配送先諸口ＦＬＧ. Miscellaneous receiving point flg..<p>
	 *
	 */
	public static final String $tdlv_sundry_flg = "tdlv_sundry_flg";
	private static final MCPermColumnInfo _tdlv_sundry_flg = createColumnInfo("tdlv_sundry_flg");
	public final MCBooleanPermColumn tdlv_sundry_flg = createBooleanColumn(_tdlv_sundry_flg);
	
	/**
	 * 配送先名. Receiving point name.<p>
	 *
	 */
	public static final String $tdlv_nm = "tdlv_nm";
	private static final MCPermColumnInfo _tdlv_nm = createColumnInfo("tdlv_nm");
	public final MCStringPermColumn tdlv_nm = createStringColumn(_tdlv_nm);
	
	/**
	 * 配送先経由区分. Receiving point stopover type.<p>
	 *
	 */
	public static final String $via_dlv_typ = "via_dlv_typ";
	private static final MCPermColumnInfo _via_dlv_typ = createColumnInfo("via_dlv_typ");
	public final MCStringPermColumn via_dlv_typ = createStringColumn(_via_dlv_typ);
	
	/**
	 * 配送先部署. Receiving point dept..<p>
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
	 * 配送先物流グループＣＤ. Receiving point distribution group cd..<p>
	 *
	 */
	public static final String $tdlv_lg_grp_cd = "tdlv_lg_grp_cd";
	private static final MCPermColumnInfo _tdlv_lg_grp_cd = createColumnInfo("tdlv_lg_grp_cd");
	public final MCStringPermColumn tdlv_lg_grp_cd = createStringColumn(_tdlv_lg_grp_cd);
	
	/**
	 * 着曜日. Arrival day of week.<p>
	 *
	 */
	public static final String $dlv_day_week_typ = "dlv_day_week_typ";
	private static final MCPermColumnInfo _dlv_day_week_typ = createColumnInfo("dlv_day_week_typ");
	public final MCStringPermColumn dlv_day_week_typ = createStringColumn(_dlv_day_week_typ);
	
	/**
	 * 預り売上ＦＬＧ. Sales keeping customer inventory flg..<p>
	 *
	 */
	public static final String $sls_cststk_flg = "sls_cststk_flg";
	private static final MCPermColumnInfo _sls_cststk_flg = createColumnInfo("sls_cststk_flg");
	public final MCBooleanPermColumn sls_cststk_flg = createBooleanColumn(_sls_cststk_flg);
	
	/**
	 * 取引単位ＣＤ. Transaction unit cd..<p>
	 *
	 */
	public static final String $trd_unit_cd = "trd_unit_cd";
	private static final MCPermColumnInfo _trd_unit_cd = createColumnInfo("trd_unit_cd");
	public final MCStringPermColumn trd_unit_cd = createStringColumn(_trd_unit_cd);
	
	/**
	 * 取引単位数量. Transaction unit qty..<p>
	 *
	 */
	public static final String $trd_unit_qty = "trd_unit_qty";
	private static final MCPermColumnInfo _trd_unit_qty = createColumnInfo("trd_unit_qty");
	public final MCNumberPermColumn trd_unit_qty = createNumberColumn(_trd_unit_qty);
	
	/**
	 * 基準単位ＣＤ. Base unit cd..<p>
	 *
	 */
	public static final String $base_unit_cd = "base_unit_cd";
	private static final MCPermColumnInfo _base_unit_cd = createColumnInfo("base_unit_cd");
	public final MCStringPermColumn base_unit_cd = createStringColumn(_base_unit_cd);
	
	/**
	 * 基準単位数量. Base unit qty..<p>
	 *
	 */
	public static final String $base_unit_qty = "base_unit_qty";
	private static final MCPermColumnInfo _base_unit_qty = createColumnInfo("base_unit_qty");
	public final MCNumberPermColumn base_unit_qty = createNumberColumn(_base_unit_qty);
	
	/**
	 * 取引通貨単価. Unit price (Transaction currency).<p>
	 *
	 */
	public static final String $trd_cur_upri = "trd_cur_upri";
	private static final MCPermColumnInfo _trd_cur_upri = createColumnInfo("trd_cur_upri");
	public final MCNumberPermColumn trd_cur_upri = createNumberColumn(_trd_cur_upri);
	
	/**
	 * 単価再取得対象外ＦＬＧ. Not to reacquire unit price flg..<p>
	 *
	 */
	public static final String $upri_not_tgt_flg = "upri_not_tgt_flg";
	private static final MCPermColumnInfo _upri_not_tgt_flg = createColumnInfo("upri_not_tgt_flg");
	public final MCBooleanPermColumn upri_not_tgt_flg = createBooleanColumn(_upri_not_tgt_flg);
	
	/**
	 * 原価単価. Unit cost.<p>
	 *
	 */
	public static final String $cost_upri = "cost_upri";
	private static final MCPermColumnInfo _cost_upri = createColumnInfo("cost_upri");
	public final MCNumberPermColumn cost_upri = createNumberColumn(_cost_upri);
	
	/**
	 * 原価金額. Total cost.<p>
	 *
	 */
	public static final String $cost_amt = "cost_amt";
	private static final MCPermColumnInfo _cost_amt = createColumnInfo("cost_amt");
	public final MCNumberPermColumn cost_amt = createNumberColumn(_cost_amt);
	
	/**
	 * 仮単価ＦＬＧ. Temporary unit price flg..<p>
	 *
	 */
	public static final String $interim_flg = "interim_flg";
	private static final MCPermColumnInfo _interim_flg = createColumnInfo("interim_flg");
	public final MCBooleanPermColumn interim_flg = createBooleanColumn(_interim_flg);
	
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
	 * インボイス表記単価. Unit price for invoice.<p>
	 *
	 */
	public static final String $iv_upri = "iv_upri";
	private static final MCPermColumnInfo _iv_upri = createColumnInfo("iv_upri");
	public final MCNumberPermColumn iv_upri = createNumberColumn(_iv_upri);
	
	/**
	 * インボイス表記金額. Amount for invoice.<p>
	 *
	 */
	public static final String $iv_amt = "iv_amt";
	private static final MCPermColumnInfo _iv_amt = createColumnInfo("iv_amt");
	public final MCNumberPermColumn iv_amt = createNumberColumn(_iv_amt);
	
	/**
	 * 税指定ＦＬＧ. Tax specified flg..<p>
	 *
	 */
	public static final String $tax_fix_flg = "tax_fix_flg";
	private static final MCPermColumnInfo _tax_fix_flg = createColumnInfo("tax_fix_flg");
	public final MCBooleanPermColumn tax_fix_flg = createBooleanColumn(_tax_fix_flg);
	
	/**
	 * 税ＣＤ. Tax cd..<p>
	 *
	 */
	public static final String $tax_cd = "tax_cd";
	private static final MCPermColumnInfo _tax_cd = createColumnInfo("tax_cd");
	public final MCStringPermColumn tax_cd = createStringColumn(_tax_cd);
	
	/**
	 * 取引通貨税額. Tax amount (Transaction currency).<p>
	 *
	 */
	public static final String $trd_cur_tax_amt = "trd_cur_tax_amt";
	private static final MCPermColumnInfo _trd_cur_tax_amt = createColumnInfo("trd_cur_tax_amt");
	public final MCNumberPermColumn trd_cur_tax_amt = createNumberColumn(_trd_cur_tax_amt);
	
	/**
	 * 手配区分. Procurement type.<p>
	 *
	 */
	public static final String $proc_typ = "proc_typ";
	private static final MCPermColumnInfo _proc_typ = createColumnInfo("proc_typ");
	public final MCStringPermColumn proc_typ = createStringColumn(_proc_typ);
	
	/**
	 * 販売単価取得区分. Sales unit price acquisition type.<p>
	 *
	 */
	public static final String $sls_upri_req_typ = "sls_upri_req_typ";
	private static final MCPermColumnInfo _sls_upri_req_typ = createColumnInfo("sls_upri_req_typ");
	public final MCStringPermColumn sls_upri_req_typ = createStringColumn(_sls_upri_req_typ);
	
	/**
	 * 品揃グループＮＯ. Assortment group No..<p>
	 *
	 */
	public static final String $set_itm_grp_no = "set_itm_grp_no";
	private static final MCPermColumnInfo _set_itm_grp_no = createColumnInfo("set_itm_grp_no");
	public final MCNumberPermColumn set_itm_grp_no = createNumberColumn(_set_itm_grp_no);
	
	/**
	 * 出荷希望日時. Desired shipping date and time.<p>
	 *
	 */
	public static final String $ship_rqst_tm = "ship_rqst_tm";
	private static final MCPermColumnInfo _ship_rqst_tm = createColumnInfo("ship_rqst_tm");
	public final MCDatePermColumn ship_rqst_tm = createDateColumn(_ship_rqst_tm);
	
	/**
	 * 納入希望日時. Desired delivery date and time.<p>
	 *
	 */
	public static final String $dlv_rqst_tm = "dlv_rqst_tm";
	private static final MCPermColumnInfo _dlv_rqst_tm = createColumnInfo("dlv_rqst_tm");
	public final MCDatePermColumn dlv_rqst_tm = createDateColumn(_dlv_rqst_tm);
	
	/**
	 * 売上予定日. Scheduled sales date.<p>
	 *
	 */
	public static final String $sls_schd_dt = "sls_schd_dt";
	private static final MCPermColumnInfo _sls_schd_dt = createColumnInfo("sls_schd_dt");
	public final MCDatePermColumn sls_schd_dt = createDateColumn(_sls_schd_dt);
	
	/**
	 * 検収予定日. Scheduled acceptance date.<p>
	 *
	 */
	public static final String $accpt_schd_dt = "accpt_schd_dt";
	private static final MCPermColumnInfo _accpt_schd_dt = createColumnInfo("accpt_schd_dt");
	public final MCDatePermColumn accpt_schd_dt = createDateColumn(_accpt_schd_dt);
	
	/**
	 * 納期回答ＦＬＧ. Order promising flg..<p>
	 *
	 */
	public static final String $prms_flg = "prms_flg";
	private static final MCPermColumnInfo _prms_flg = createColumnInfo("prms_flg");
	public final MCBooleanPermColumn prms_flg = createBooleanColumn(_prms_flg);
	
	/**
	 * 依頼先場所ＣＤ. Requested location cd..<p>
	 *
	 */
	public static final String $rqst_to_loc_cd = "rqst_to_loc_cd";
	private static final MCPermColumnInfo _rqst_to_loc_cd = createColumnInfo("rqst_to_loc_cd");
	public final MCStringPermColumn rqst_to_loc_cd = createStringColumn(_rqst_to_loc_cd);
	
	/**
	 * 発注先ＣＤ. Supplier cd..<p>
	 *
	 */
	public static final String $sppl_cd = "sppl_cd";
	private static final MCPermColumnInfo _sppl_cd = createColumnInfo("sppl_cd");
	public final MCStringPermColumn sppl_cd = createStringColumn(_sppl_cd);
	
	/**
	 * メーカＣＤ. Maker cd..<p>
	 *
	 */
	public static final String $maker_cd = "maker_cd";
	private static final MCPermColumnInfo _maker_cd = createColumnInfo("maker_cd");
	public final MCStringPermColumn maker_cd = createStringColumn(_maker_cd);
	
	/**
	 * 引当範囲区分. Allocation range type.<p>
	 *
	 */
	public static final String $alloc_scope_typ = "alloc_scope_typ";
	private static final MCPermColumnInfo _alloc_scope_typ = createColumnInfo("alloc_scope_typ");
	public final MCStringPermColumn alloc_scope_typ = createStringColumn(_alloc_scope_typ);
	
	/**
	 * 引当区分. Allocation type.<p>
	 *
	 */
	public static final String $alloc_typ = "alloc_typ";
	private static final MCPermColumnInfo _alloc_typ = createColumnInfo("alloc_typ");
	public final MCStringPermColumn alloc_typ = createStringColumn(_alloc_typ);
	
	/**
	 * 総量引当場所グループＣＤ. Gross allocation location group cd..<p>
	 *
	 */
	public static final String $alloc_grp_cd = "alloc_grp_cd";
	private static final MCPermColumnInfo _alloc_grp_cd = createColumnInfo("alloc_grp_cd");
	public final MCStringPermColumn alloc_grp_cd = createStringColumn(_alloc_grp_cd);
	
	/**
	 * 出荷物流グループＣＤ. Shipping distribution group cd..<p>
	 *
	 */
	public static final String $ship_lg_grp_cd = "ship_lg_grp_cd";
	private static final MCPermColumnInfo _ship_lg_grp_cd = createColumnInfo("ship_lg_grp_cd");
	public final MCStringPermColumn ship_lg_grp_cd = createStringColumn(_ship_lg_grp_cd);
	
	/**
	 * デフォルト場所ＣＤ. Default location cd..<p>
	 *
	 */
	public static final String $def_loc_cd = "def_loc_cd";
	private static final MCPermColumnInfo _def_loc_cd = createColumnInfo("def_loc_cd");
	public final MCStringPermColumn def_loc_cd = createStringColumn(_def_loc_cd);
	
	/**
	 * 場所ＣＤ. Location cd..<p>
	 *
	 */
	public static final String $loc_cd = "loc_cd";
	private static final MCPermColumnInfo _loc_cd = createColumnInfo("loc_cd");
	public final MCStringPermColumn loc_cd = createStringColumn(_loc_cd);
	
	/**
	 * 棚・ラインＣＤ. Rack/Line cd..<p>
	 *
	 */
	public static final String $str_ln_cd = "str_ln_cd";
	private static final MCPermColumnInfo _str_ln_cd = createColumnInfo("str_ln_cd");
	public final MCStringPermColumn str_ln_cd = createStringColumn(_str_ln_cd);
	
	/**
	 * ロットＮＯ. Lot No..<p>
	 *
	 */
	public static final String $lot_no = "lot_no";
	private static final MCPermColumnInfo _lot_no = createColumnInfo("lot_no");
	public final MCStringPermColumn lot_no = createStringColumn(_lot_no);
	
	/**
	 * サブロットＮＯ. Sublot No..<p>
	 *
	 */
	public static final String $sublot_no = "sublot_no";
	private static final MCPermColumnInfo _sublot_no = createColumnInfo("sublot_no");
	public final MCStringPermColumn sublot_no = createStringColumn(_sublot_no);
	
	/**
	 * 貸出ＦＬＧ. Consignment flg..<p>
	 *
	 */
	public static final String $vmi_flg = "vmi_flg";
	private static final MCPermColumnInfo _vmi_flg = createColumnInfo("vmi_flg");
	public final MCBooleanPermColumn vmi_flg = createBooleanColumn(_vmi_flg);
	
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
	 * 依頼連絡備考. Request contact remarks.<p>
	 *
	 */
	public static final String $wg_rqst_cnt_rmrks = "wg_rqst_cnt_rmrks";
	private static final MCPermColumnInfo _wg_rqst_cnt_rmrks = createColumnInfo("wg_rqst_cnt_rmrks");
	public final MCStringPermColumn wg_rqst_cnt_rmrks = createStringColumn(_wg_rqst_cnt_rmrks);
	
	/**
	 * 出荷条件ＣＤ. Shipping conditions cd..<p>
	 *
	 */
	public static final String $ship_term_cd = "ship_term_cd";
	private static final MCPermColumnInfo _ship_term_cd = createColumnInfo("ship_term_cd");
	public final MCStringPermColumn ship_term_cd = createStringColumn(_ship_term_cd);
	
	/**
	 * 請求繰越回数. Billing carry-over count.<p>
	 *
	 */
	public static final String $bill_crryovr_times = "bill_crryovr_times";
	private static final MCPermColumnInfo _bill_crryovr_times = createColumnInfo("bill_crryovr_times");
	public final MCNumberPermColumn bill_crryovr_times = createNumberColumn(_bill_crryovr_times);
	
	/**
	 * 得意先注文明細ＮＯ. Customer order details No..<p>
	 *
	 */
	public static final String $cst_po_d_no = "cst_po_d_no";
	private static final MCPermColumnInfo _cst_po_d_no = createColumnInfo("cst_po_d_no");
	public final MCStringPermColumn cst_po_d_no = createStringColumn(_cst_po_d_no);
	
	/**
	 * 得意先品目ＣＤ. Customer item cd..<p>
	 *
	 */
	public static final String $cst_itm_cd = "cst_itm_cd";
	private static final MCPermColumnInfo _cst_itm_cd = createColumnInfo("cst_itm_cd");
	public final MCStringPermColumn cst_itm_cd = createStringColumn(_cst_itm_cd);
	
	/**
	 * 得意先品名. Customer item name.<p>
	 *
	 */
	public static final String $cst_itm_nm = "cst_itm_nm";
	private static final MCPermColumnInfo _cst_itm_nm = createColumnInfo("cst_itm_nm");
	public final MCStringPermColumn cst_itm_nm = createStringColumn(_cst_itm_nm);
	
	/**
	 * 得意先注文明細備考. Customer order details remarks.<p>
	 *
	 */
	public static final String $cst_po_d_rmrks = "cst_po_d_rmrks";
	private static final MCPermColumnInfo _cst_po_d_rmrks = createColumnInfo("cst_po_d_rmrks");
	public final MCStringPermColumn cst_po_d_rmrks = createStringColumn(_cst_po_d_rmrks);
	
	/**
	 * 売上理由ＣＤ. Sales reason cd..<p>
	 *
	 */
	public static final String $sls_rsn_cd = "sls_rsn_cd";
	private static final MCPermColumnInfo _sls_rsn_cd = createColumnInfo("sls_rsn_cd");
	public final MCStringPermColumn sls_rsn_cd = createStringColumn(_sls_rsn_cd);
	
	/**
	 * 負担部門ＣＤ. Charged dept. cd..<p>
	 *
	 */
	public static final String $bd_dpt_cd = "bd_dpt_cd";
	private static final MCPermColumnInfo _bd_dpt_cd = createColumnInfo("bd_dpt_cd");
	public final MCStringPermColumn bd_dpt_cd = createStringColumn(_bd_dpt_cd);
	
	/**
	 * 依頼日. Request date.<p>
	 *
	 */
	public static final String $rqst_dt = "rqst_dt";
	private static final MCPermColumnInfo _rqst_dt = createColumnInfo("rqst_dt");
	public final MCDatePermColumn rqst_dt = createDateColumn(_rqst_dt);
	
	/**
	 * 依頼納入希望日. Request desired delivery date.<p>
	 *
	 */
	public static final String $rqst_dlv_rqst_dt = "rqst_dlv_rqst_dt";
	private static final MCPermColumnInfo _rqst_dlv_rqst_dt = createColumnInfo("rqst_dlv_rqst_dt");
	public final MCDatePermColumn rqst_dlv_rqst_dt = createDateColumn(_rqst_dlv_rqst_dt);
	
	/**
	 * 依頼回答日. Request replied date.<p>
	 *
	 */
	public static final String $rqst_prms_dt = "rqst_prms_dt";
	private static final MCPermColumnInfo _rqst_prms_dt = createColumnInfo("rqst_prms_dt");
	public final MCDatePermColumn rqst_prms_dt = createDateColumn(_rqst_prms_dt);
	
	/**
	 * 依頼回答納入日. Request replied delivery date.<p>
	 *
	 */
	public static final String $rqst_prms_dlv_dt = "rqst_prms_dlv_dt";
	private static final MCPermColumnInfo _rqst_prms_dlv_dt = createColumnInfo("rqst_prms_dlv_dt");
	public final MCDatePermColumn rqst_prms_dlv_dt = createDateColumn(_rqst_prms_dlv_dt);
	
	/**
	 * 依頼単位ＣＤ. Request unit cd..<p>
	 *
	 */
	public static final String $rqst_unit_cd = "rqst_unit_cd";
	private static final MCPermColumnInfo _rqst_unit_cd = createColumnInfo("rqst_unit_cd");
	public final MCStringPermColumn rqst_unit_cd = createStringColumn(_rqst_unit_cd);
	
	/**
	 * 依頼数量. Request qty..<p>
	 *
	 */
	public static final String $rqst_qty = "rqst_qty";
	private static final MCPermColumnInfo _rqst_qty = createColumnInfo("rqst_qty");
	public final MCNumberPermColumn rqst_qty = createNumberColumn(_rqst_qty);
	
	/**
	 * 受注集計基準日. Sales order aggregated base date.<p>
	 *
	 */
	public static final String $slo_sum_base_dt = "slo_sum_base_dt";
	private static final MCPermColumnInfo _slo_sum_base_dt = createColumnInfo("slo_sum_base_dt");
	public final MCDatePermColumn slo_sum_base_dt = createDateColumn(_slo_sum_base_dt);
	
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
	 * 見積明細ＮＯ. Quotation details No..<p>
	 *
	 */
	public static final String $qtn_d_no = "qtn_d_no";
	private static final MCPermColumnInfo _qtn_d_no = createColumnInfo("qtn_d_no");
	public final MCStringPermColumn qtn_d_no = createStringColumn(_qtn_d_no);
	
	/**
	 * 出荷連絡備考. Shipping notification remarks.<p>
	 *
	 */
	public static final String $ship_cnt_rmrks = "ship_cnt_rmrks";
	private static final MCPermColumnInfo _ship_cnt_rmrks = createColumnInfo("ship_cnt_rmrks");
	public final MCStringPermColumn ship_cnt_rmrks = createStringColumn(_ship_cnt_rmrks);
	
	/**
	 * 取引明細備考. Transaction details remarks.<p>
	 *
	 */
	public static final String $trd_d_rmrks = "trd_d_rmrks";
	private static final MCPermColumnInfo _trd_d_rmrks = createColumnInfo("trd_d_rmrks");
	public final MCStringPermColumn trd_d_rmrks = createStringColumn(_trd_d_rmrks);
	
	/**
	 * 内部備考. Internal remarks.<p>
	 *
	 */
	public static final String $intr_rmrks = "intr_rmrks";
	private static final MCPermColumnInfo _intr_rmrks = createColumnInfo("intr_rmrks");
	public final MCStringPermColumn intr_rmrks = createStringColumn(_intr_rmrks);
	
	/**
	 * 受払進捗管理ＮＯ. GR/GI progress management No..<p>
	 *
	 */
	public static final String $io_schd_pr_no = "io_schd_pr_no";
	private static final MCPermColumnInfo _io_schd_pr_no = createColumnInfo("io_schd_pr_no");
	public final MCStringPermColumn io_schd_pr_no = createStringColumn(_io_schd_pr_no);
	
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
	 * 構成表連番. Configuration table sequence number.<p>
	 *
	 */
	public static final String $itm_comp_seq = "itm_comp_seq";
	private static final MCPermColumnInfo _itm_comp_seq = createColumnInfo("itm_comp_seq");
	public final MCNumberPermColumn itm_comp_seq = createNumberColumn(_itm_comp_seq);
	
	/**
	 * 仕様表連番. Specification table sequence number.<p>
	 *
	 */
	public static final String $itm_spec_seq = "itm_spec_seq";
	private static final MCPermColumnInfo _itm_spec_seq = createColumnInfo("itm_spec_seq");
	public final MCNumberPermColumn itm_spec_seq = createNumberColumn(_itm_spec_seq);
	
	/**
	 * 打切ＦＬＧ. Cancel remaining flg..<p>
	 *
	 */
	public static final String $abort_flg = "abort_flg";
	private static final MCPermColumnInfo _abort_flg = createColumnInfo("abort_flg");
	public final MCBooleanPermColumn abort_flg = createBooleanColumn(_abort_flg);
	
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
	 * 明細取消備考. Details cancel remarks.<p>
	 *
	 */
	public static final String $slo_d_can_rmkrs = "slo_d_can_rmkrs";
	private static final MCPermColumnInfo _slo_d_can_rmkrs = createColumnInfo("slo_d_can_rmkrs");
	public final MCStringPermColumn slo_d_can_rmkrs = createStringColumn(_slo_d_can_rmkrs);
	
	/**
	 * ＥＤＩ明細予備ＣＨＡＲ項目１. EDI details spare CHAR column 1.<p>
	 *
	 */
	public static final String $edi_sub_d_char1 = "edi_sub_d_char1";
	private static final MCPermColumnInfo _edi_sub_d_char1 = createColumnInfo("edi_sub_d_char1");
	public final MCStringPermColumn edi_sub_d_char1 = createStringColumn(_edi_sub_d_char1);
	
	/**
	 * ＥＤＩ明細予備ＣＨＡＲ項目２. EDI details spare CHAR column 2.<p>
	 *
	 */
	public static final String $edi_sub_d_char2 = "edi_sub_d_char2";
	private static final MCPermColumnInfo _edi_sub_d_char2 = createColumnInfo("edi_sub_d_char2");
	public final MCStringPermColumn edi_sub_d_char2 = createStringColumn(_edi_sub_d_char2);
	
	/**
	 * ＥＤＩ明細予備ＣＨＡＲ項目３. EDI details spare CHAR column 3.<p>
	 *
	 */
	public static final String $edi_sub_d_char3 = "edi_sub_d_char3";
	private static final MCPermColumnInfo _edi_sub_d_char3 = createColumnInfo("edi_sub_d_char3");
	public final MCStringPermColumn edi_sub_d_char3 = createStringColumn(_edi_sub_d_char3);
	
	/**
	 * ＥＤＩ明細予備ＣＨＡＲ項目４. EDI details spare CHAR column 4.<p>
	 *
	 */
	public static final String $edi_sub_d_char4 = "edi_sub_d_char4";
	private static final MCPermColumnInfo _edi_sub_d_char4 = createColumnInfo("edi_sub_d_char4");
	public final MCStringPermColumn edi_sub_d_char4 = createStringColumn(_edi_sub_d_char4);
	
	/**
	 * ＥＤＩ明細予備ＣＨＡＲ項目５. EDI details spare CHAR column 5.<p>
	 *
	 */
	public static final String $edi_sub_d_char5 = "edi_sub_d_char5";
	private static final MCPermColumnInfo _edi_sub_d_char5 = createColumnInfo("edi_sub_d_char5");
	public final MCStringPermColumn edi_sub_d_char5 = createStringColumn(_edi_sub_d_char5);
	
	/**
	 * ＥＤＩ明細予備ＮＵＭ項目１. EDI details spare NUM column 1.<p>
	 *
	 */
	public static final String $edi_sub_d_num1 = "edi_sub_d_num1";
	private static final MCPermColumnInfo _edi_sub_d_num1 = createColumnInfo("edi_sub_d_num1");
	public final MCNumberPermColumn edi_sub_d_num1 = createNumberColumn(_edi_sub_d_num1);
	
	/**
	 * ＥＤＩ明細予備ＤＡＴＥ項目１. EDI details spare DATE column 1.<p>
	 *
	 */
	public static final String $edi_sub_d_dt1 = "edi_sub_d_dt1";
	private static final MCPermColumnInfo _edi_sub_d_dt1 = createColumnInfo("edi_sub_d_dt1");
	public final MCDatePermColumn edi_sub_d_dt1 = createDateColumn(_edi_sub_d_dt1);
	
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
	 * 物流グループ混在不可ＦＬＧ. Prohibit mixed distribution group flg..<p>
	 *
	 */
	public static final String $not_lg_mix_flg = "not_lg_mix_flg";
	private static final MCPermColumnInfo _not_lg_mix_flg = createColumnInfo("not_lg_mix_flg");
	public final MCBooleanPermColumn not_lg_mix_flg = createBooleanColumn(_not_lg_mix_flg);
	
	/**
	 * ロット混在不可ＦＬＧ. Prohibit mixed lots flg..<p>
	 *
	 */
	public static final String $not_lot_mix_flg = "not_lot_mix_flg";
	private static final MCPermColumnInfo _not_lot_mix_flg = createColumnInfo("not_lot_mix_flg");
	public final MCBooleanPermColumn not_lot_mix_flg = createBooleanColumn(_not_lot_mix_flg);
	
	/**
	 * サブロット混在不可ＦＬＧ. Prohibit mixed sublots flg..<p>
	 *
	 */
	public static final String $not_sublot_mix_flg = "not_sublot_mix_flg";
	private static final MCPermColumnInfo _not_sublot_mix_flg = createColumnInfo("not_sublot_mix_flg");
	public final MCBooleanPermColumn not_sublot_mix_flg = createBooleanColumn(_not_sublot_mix_flg);
	
	public static final MCMeta slo_d_no_META = createCommonMeta($slo_d_no, mcframe.commonMA.meta.MA_META.SLO_D_NO);
	public static final MCMeta slo_no_META = createCommonMeta($slo_no, mcframe.commonMA.meta.MA_META.SLO_NO);
	public static final MCMeta slo_rev_META = createCommonMeta($slo_rev, mcframe.commonMA.meta.MA_META.SLIP_REV);
	public static final MCMeta disp_seq_META = createCommonMeta($disp_seq, mcframe.commonMA.meta.MA_META.DISP_SEQ);
	public static final MCMeta itm_cd_META = createCommonMeta($itm_cd, mcframe.commonMA.meta.MA_META.ITM_CD);
	public static final MCMeta itm_sub1_META = createCommonMeta($itm_sub1, mcframe.commonMA.meta.MA_META.ITM_SUB1);
	public static final MCMeta itm_sub2_META = createCommonMeta($itm_sub2, mcframe.commonMA.meta.MA_META.ITM_SUB2);
	public static final MCMeta itm_sub3_META = createCommonMeta($itm_sub3, mcframe.commonMA.meta.MA_META.ITM_SUB3);
	public static final MCMeta itm_nm_META = createCommonMeta($itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta iv_itm_nm_META = createCommonMeta($iv_itm_nm, mcframe.commonMA.meta.MA_META.ITM_NM);
	public static final MCMeta sno1_META = createCommonMeta($sno1, mcframe.commonMA.meta.MA_META.SNO1);
	public static final MCMeta sno1_null_flg_META = createCommonMeta($sno1_null_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sno2_META = createCommonMeta($sno2, mcframe.commonMA.meta.MA_META.SNO2);
	public static final MCMeta sno2_null_flg_META = createCommonMeta($sno2_null_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sno3_META = createCommonMeta($sno3, mcframe.commonMA.meta.MA_META.SNO3);
	public static final MCMeta sno3_null_flg_META = createCommonMeta($sno3_null_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sno4_META = createCommonMeta($sno4, mcframe.commonMA.meta.MA_META.SNO4);
	public static final MCMeta sno4_null_flg_META = createCommonMeta($sno4_null_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta ver_no_META = createCommonMeta($ver_no, mcframe.commonMA.meta.MA_META.VER_NO);
	public static final MCMeta gd_cd_META = createCommonMeta($gd_cd, mcframe.commonMA.meta.MA_META.STK_GD_CD);
	public static final MCMeta sundry_itm_flg_META = createCommonMeta($sundry_itm_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta sls_itm_no_META = createCommonMeta($sls_itm_no, mcframe.commonMA.meta.MA_META.SLS_ITM_NO);
	public static final MCMeta ship_inst_typ_META = createCommonMeta($ship_inst_typ, mcframe.commonMA.meta.MA_META.SHIP_INST_TYP);
	public static final MCMeta ship_schd_split_typ_META = createCommonMeta($ship_schd_split_typ, mcframe.commonMA.meta.MA_META.SHIP_SCHD_SPLIT_TYP);
	public static final MCMeta cntry_org_cd_META = createCommonMeta($cntry_org_cd, mcframe.commonMA.meta.MA_META.CNTRY_CD);
	public static final MCMeta dlv_cd_META = createCommonMeta($dlv_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta dlv_sundry_flg_META = createCommonMeta($dlv_sundry_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dlv_nm_META = createCommonMeta($dlv_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta dlv_cntct_dpt_META = createCommonMeta($dlv_cntct_dpt, mcframe.commonMA.meta.MA_META.BP_CNTCT_DPT);
	public static final MCMeta dlv_cntct_psn_META = createCommonMeta($dlv_cntct_psn, mcframe.commonMA.meta.MA_META.BP_CNTCT_PSN);
	public static final MCMeta dlv_zip_cd_META = createCommonMeta($dlv_zip_cd, mcframe.commonMA.meta.MA_META.ZIP_CD);
	public static final MCMeta dlv_addr1_META = createCommonMeta($dlv_addr1, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta dlv_addr2_META = createCommonMeta($dlv_addr2, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta dlv_addr3_META = createCommonMeta($dlv_addr3, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta dlv_addr4_META = createCommonMeta($dlv_addr4, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta dlv_tel_META = createCommonMeta($dlv_tel, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta dlv_fax_META = createCommonMeta($dlv_fax, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta dlv_lg_grp_cd_META = createCommonMeta($dlv_lg_grp_cd, mcframe.commonMA.meta.MA_META.LG_GRP_CD);
	public static final MCMeta pri_prnt_flg_META = createCommonMeta($pri_prnt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta dest_cd1_META = createCommonMeta($dest_cd1, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta dest_cd2_META = createCommonMeta($dest_cd2, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta dest_cd3_META = createCommonMeta($dest_cd3, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta tdlv_cd_META = createCommonMeta($tdlv_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta tdlv_sundry_flg_META = createCommonMeta($tdlv_sundry_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta tdlv_nm_META = createCommonMeta($tdlv_nm, mcframe.commonMA.meta.MA_META.BP_NM);
	public static final MCMeta via_dlv_typ_META = createCommonMeta($via_dlv_typ, mcframe.commonMA.meta.MA_META.VIA_DLV_TYP);
	public static final MCMeta tdlv_cntct_dpt_META = createCommonMeta($tdlv_cntct_dpt, mcframe.commonMA.meta.MA_META.BP_CNTCT_DPT);
	public static final MCMeta tdlv_cntct_psn_META = createCommonMeta($tdlv_cntct_psn, mcframe.commonMA.meta.MA_META.BP_CNTCT_PSN);
	public static final MCMeta tdlv_zip_cd_META = createCommonMeta($tdlv_zip_cd, mcframe.commonMA.meta.MA_META.ZIP_CD);
	public static final MCMeta tdlv_addr1_META = createCommonMeta($tdlv_addr1, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta tdlv_addr2_META = createCommonMeta($tdlv_addr2, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta tdlv_addr3_META = createCommonMeta($tdlv_addr3, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta tdlv_addr4_META = createCommonMeta($tdlv_addr4, mcframe.commonMA.meta.MA_META.ADDR);
	public static final MCMeta tdlv_tel_META = createCommonMeta($tdlv_tel, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta tdlv_fax_META = createCommonMeta($tdlv_fax, mcframe.commonMA.meta.MA_META.TEL);
	public static final MCMeta tdlv_lg_grp_cd_META = createCommonMeta($tdlv_lg_grp_cd, mcframe.commonMA.meta.MA_META.LG_GRP_CD);
	public static final MCMeta dlv_day_week_typ_META = createCommonMeta($dlv_day_week_typ, mcframe.commonMA.meta.MA_META.DAY_WEEK_TYP);
	public static final MCMeta sls_cststk_flg_META = createCommonMeta($sls_cststk_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta trd_unit_cd_META = createCommonMeta($trd_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta trd_unit_qty_META = createCommonMeta($trd_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta base_unit_cd_META = createCommonMeta($base_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta base_unit_qty_META = createCommonMeta($base_unit_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta trd_cur_upri_META = createCommonMeta($trd_cur_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta upri_not_tgt_flg_META = createCommonMeta($upri_not_tgt_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta cost_upri_META = createCommonMeta($cost_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta cost_amt_META = createCommonMeta($cost_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta interim_flg_META = createCommonMeta($interim_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta trd_cur_amt_META = createCommonMeta($trd_cur_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta trd_cur_dscnt_amt_META = createCommonMeta($trd_cur_dscnt_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta dscnt_rsn_cd_META = createCommonMeta($dscnt_rsn_cd, mcframe.commonMA.meta.MA_META.BIZ_RSN_CD);
	public static final MCMeta iv_upri_META = createCommonMeta($iv_upri, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta iv_amt_META = createCommonMeta($iv_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta tax_fix_flg_META = createCommonMeta($tax_fix_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta tax_cd_META = createCommonMeta($tax_cd, mcframe.commonMA.meta.MA_META.TAX_CD);
	public static final MCMeta trd_cur_tax_amt_META = createCommonMeta($trd_cur_tax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta proc_typ_META = createCommonMeta($proc_typ, mcframe.commonMA.meta.MA_META.SLO_PROC_TYP);
	public static final MCMeta sls_upri_req_typ_META = createCommonMeta($sls_upri_req_typ, mcframe.commonMA.meta.MA_META.SLS_UPRI_REQ_TYP);
	public static final MCMeta set_itm_grp_no_META = createCommonMeta($set_itm_grp_no, mcframe.commonMA.meta.MA_META.SET_ITM_GRP_NO);
	public static final MCMeta ship_rqst_tm_META = createCommonMeta($ship_rqst_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta dlv_rqst_tm_META = createCommonMeta($dlv_rqst_tm, mcframe.commonMA.meta.MA_META.TM);
	public static final MCMeta sls_schd_dt_META = createCommonMeta($sls_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta accpt_schd_dt_META = createCommonMeta($accpt_schd_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta prms_flg_META = createCommonMeta($prms_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta rqst_to_loc_cd_META = createCommonMeta($rqst_to_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta sppl_cd_META = createCommonMeta($sppl_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta maker_cd_META = createCommonMeta($maker_cd, mcframe.commonMA.meta.MA_META.BP_CD);
	public static final MCMeta alloc_scope_typ_META = createCommonMeta($alloc_scope_typ, mcframe.commonMA.meta.MA_META.ALLOC_SCOPE_TYP);
	public static final MCMeta alloc_typ_META = createCommonMeta($alloc_typ, mcframe.commonMA.meta.MA_META.ALLOC_TYP);
	public static final MCMeta alloc_grp_cd_META = createCommonMeta($alloc_grp_cd, mcframe.commonMA.meta.MA_META.ALLOC_GRP_CD);
	public static final MCMeta ship_lg_grp_cd_META = createCommonMeta($ship_lg_grp_cd, mcframe.commonMA.meta.MA_META.LG_GRP_CD);
	public static final MCMeta def_loc_cd_META = createCommonMeta($def_loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta loc_cd_META = createCommonMeta($loc_cd, mcframe.commonMA.meta.MA_META.LOC_CD);
	public static final MCMeta str_ln_cd_META = createCommonMeta($str_ln_cd, mcframe.commonMA.meta.MA_META.STR_LN_CD);
	public static final MCMeta lot_no_META = createCommonMeta($lot_no, mcframe.commonMA.meta.MA_META.LOT_NO);
	public static final MCMeta sublot_no_META = createCommonMeta($sublot_no, mcframe.commonMA.meta.MA_META.SUBLOT_NO);
	public static final MCMeta vmi_flg_META = createCommonMeta($vmi_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta wtax_rate_META = createCommonMeta($wtax_rate, mcframe.commonMA.meta.MA_META.TAX_RATE);
	public static final MCMeta wtax_amt_META = createCommonMeta($wtax_amt, mcframe.commonMA.meta.MA_META.MONEY);
	public static final MCMeta wg_rqst_cnt_rmrks_META = createCommonMeta($wg_rqst_cnt_rmrks, mcframe.commonMS.meta.MS_META.WG_RQST_CNT_RMRKS);
	public static final MCMeta ship_term_cd_META = createCommonMeta($ship_term_cd, mcframe.commonMA.meta.MA_META.SHIP_TERM_CD);
	public static final MCMeta bill_crryovr_times_META = createCommonMeta($bill_crryovr_times, mcframe.commonMA.meta.MA_META.CRRYOVR_TIMES);
	public static final MCMeta cst_po_d_no_META = createCommonMeta($cst_po_d_no, mcframe.commonMA.meta.MA_META.CST_PO_D_NO);
	public static final MCMeta cst_itm_cd_META = createCommonMeta($cst_itm_cd, mcframe.commonMA.meta.MA_META.BP_ITM_CD);
	public static final MCMeta cst_itm_nm_META = createCommonMeta($cst_itm_nm, mcframe.commonMA.meta.MA_META.BP_ITM_NM);
	public static final MCMeta cst_po_d_rmrks_META = createCommonMeta($cst_po_d_rmrks, mcframe.commonMS.meta.MS_META.CST_PO_D_RMRKS);
	public static final MCMeta sls_rsn_cd_META = createCommonMeta($sls_rsn_cd, mcframe.commonMA.meta.MA_META.BIZ_RSN_CD);
	public static final MCMeta bd_dpt_cd_META = createCommonMeta($bd_dpt_cd, mcframe.commonMA.meta.MA_META.DPT_CD);
	public static final MCMeta rqst_dt_META = createCommonMeta($rqst_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta rqst_dlv_rqst_dt_META = createCommonMeta($rqst_dlv_rqst_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta rqst_prms_dt_META = createCommonMeta($rqst_prms_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta rqst_prms_dlv_dt_META = createCommonMeta($rqst_prms_dlv_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta rqst_unit_cd_META = createCommonMeta($rqst_unit_cd, mcframe.commonMA.meta.MA_META.UNIT_CD);
	public static final MCMeta rqst_qty_META = createCommonMeta($rqst_qty, mcframe.commonMA.meta.MA_META.QTY);
	public static final MCMeta slo_sum_base_dt_META = createCommonMeta($slo_sum_base_dt, mcframe.commonMA.meta.MA_META.DT);
	public static final MCMeta qtn_no_META = createCommonMeta($qtn_no, mcframe.commonMA.meta.MA_META.QTN_NO);
	public static final MCMeta qtn_rev_META = createCommonMeta($qtn_rev, mcframe.commonMA.meta.MA_META.SLIP_REV);
	public static final MCMeta qtn_d_no_META = createCommonMeta($qtn_d_no, mcframe.commonMA.meta.MA_META.QTN_D_NO);
	public static final MCMeta ship_cnt_rmrks_META = createCommonMeta($ship_cnt_rmrks, mcframe.commonMS.meta.MS_META.SHIP_CNT_RMRKS);
	public static final MCMeta trd_d_rmrks_META = createCommonMeta($trd_d_rmrks, mcframe.commonMA.meta.MA_META.TRD_D_RMRKS);
	public static final MCMeta intr_rmrks_META = createCommonMeta($intr_rmrks, mcframe.commonMS.meta.MS_META.SLO_D_INTR_RMRKS);
	public static final MCMeta io_schd_pr_no_META = createCommonMeta($io_schd_pr_no, mcframe.commonMA.meta.MA_META.IO_SCHD_PR_NO);
	public static final MCMeta sub_char1_META = createCommonMeta($sub_char1, mcframe.commonMS.meta.MS_META.SLO_D_SUB_CHAR1);
	public static final MCMeta sub_char2_META = createCommonMeta($sub_char2, mcframe.commonMS.meta.MS_META.SLO_D_SUB_CHAR2);
	public static final MCMeta sub_char3_META = createCommonMeta($sub_char3, mcframe.commonMS.meta.MS_META.SLO_D_SUB_CHAR3);
	public static final MCMeta itm_comp_seq_META = createCommonMeta($itm_comp_seq, mcframe.commonMA.meta.MA_META.PRNT_SEQ);
	public static final MCMeta itm_spec_seq_META = createCommonMeta($itm_spec_seq, mcframe.commonMA.meta.MA_META.PRNT_SEQ);
	public static final MCMeta abort_flg_META = createCommonMeta($abort_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta can_flg_META = createCommonMeta($can_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta can_rsn_cd_META = createCommonMeta($can_rsn_cd, mcframe.commonMS.meta.MS_META.SLO_RSN_CD);
	public static final MCMeta slo_d_can_rmkrs_META = createCommonMeta($slo_d_can_rmkrs, mcframe.commonMS.meta.MS_META.SLO_D_CAN_RMKRS);
	public static final MCMeta edi_sub_d_char1_META = createCommonMeta($edi_sub_d_char1, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR1);
	public static final MCMeta edi_sub_d_char2_META = createCommonMeta($edi_sub_d_char2, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR2);
	public static final MCMeta edi_sub_d_char3_META = createCommonMeta($edi_sub_d_char3, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR3);
	public static final MCMeta edi_sub_d_char4_META = createCommonMeta($edi_sub_d_char4, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR4);
	public static final MCMeta edi_sub_d_char5_META = createCommonMeta($edi_sub_d_char5, mcframe.commonMA.meta.MA_META.IF_SUB_CHAR5);
	public static final MCMeta edi_sub_d_num1_META = createCommonMeta($edi_sub_d_num1, mcframe.commonMA.meta.MA_META.IF_SUB_NUM1);
	public static final MCMeta edi_sub_d_dt1_META = createCommonMeta($edi_sub_d_dt1, mcframe.commonMA.meta.MA_META.DT);
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
	public static final MCMeta not_lg_mix_flg_META = createCommonMeta($not_lg_mix_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta not_lot_mix_flg_META = createCommonMeta($not_lot_mix_flg, mcframe.commonMA.meta.MA_META.FLG);
	public static final MCMeta not_sublot_mix_flg_META = createCommonMeta($not_sublot_mix_flg, mcframe.commonMA.meta.MA_META.FLG);

	protected static final List<MCForeignInfo> FOREIGN_INFO_LIST = new ArrayList<>();
	static {
	}
	
	protected static final ConstMetaList<MST_SLO_D_P_R> constMetas = new ConstMetaList<MST_SLO_D_P_R>(
		MCDBContainer.constMetas,
		new MCMeta[]{
			slo_d_no_META,
			slo_no_META,
			slo_rev_META,
			disp_seq_META,
			itm_cd_META,
			itm_sub1_META,
			itm_sub2_META,
			itm_sub3_META,
			itm_nm_META,
			iv_itm_nm_META,
			sno1_META,
			sno1_null_flg_META,
			sno2_META,
			sno2_null_flg_META,
			sno3_META,
			sno3_null_flg_META,
			sno4_META,
			sno4_null_flg_META,
			ver_no_META,
			gd_cd_META,
			sundry_itm_flg_META,
			sls_itm_no_META,
			ship_inst_typ_META,
			ship_schd_split_typ_META,
			cntry_org_cd_META,
			dlv_cd_META,
			dlv_sundry_flg_META,
			dlv_nm_META,
			dlv_cntct_dpt_META,
			dlv_cntct_psn_META,
			dlv_zip_cd_META,
			dlv_addr1_META,
			dlv_addr2_META,
			dlv_addr3_META,
			dlv_addr4_META,
			dlv_tel_META,
			dlv_fax_META,
			dlv_lg_grp_cd_META,
			pri_prnt_flg_META,
			dest_cd1_META,
			dest_cd2_META,
			dest_cd3_META,
			tdlv_cd_META,
			tdlv_sundry_flg_META,
			tdlv_nm_META,
			via_dlv_typ_META,
			tdlv_cntct_dpt_META,
			tdlv_cntct_psn_META,
			tdlv_zip_cd_META,
			tdlv_addr1_META,
			tdlv_addr2_META,
			tdlv_addr3_META,
			tdlv_addr4_META,
			tdlv_tel_META,
			tdlv_fax_META,
			tdlv_lg_grp_cd_META,
			dlv_day_week_typ_META,
			sls_cststk_flg_META,
			trd_unit_cd_META,
			trd_unit_qty_META,
			base_unit_cd_META,
			base_unit_qty_META,
			trd_cur_upri_META,
			upri_not_tgt_flg_META,
			cost_upri_META,
			cost_amt_META,
			interim_flg_META,
			trd_cur_amt_META,
			trd_cur_dscnt_amt_META,
			dscnt_rsn_cd_META,
			iv_upri_META,
			iv_amt_META,
			tax_fix_flg_META,
			tax_cd_META,
			trd_cur_tax_amt_META,
			proc_typ_META,
			sls_upri_req_typ_META,
			set_itm_grp_no_META,
			ship_rqst_tm_META,
			dlv_rqst_tm_META,
			sls_schd_dt_META,
			accpt_schd_dt_META,
			prms_flg_META,
			rqst_to_loc_cd_META,
			sppl_cd_META,
			maker_cd_META,
			alloc_scope_typ_META,
			alloc_typ_META,
			alloc_grp_cd_META,
			ship_lg_grp_cd_META,
			def_loc_cd_META,
			loc_cd_META,
			str_ln_cd_META,
			lot_no_META,
			sublot_no_META,
			vmi_flg_META,
			wtax_rate_META,
			wtax_amt_META,
			wg_rqst_cnt_rmrks_META,
			ship_term_cd_META,
			bill_crryovr_times_META,
			cst_po_d_no_META,
			cst_itm_cd_META,
			cst_itm_nm_META,
			cst_po_d_rmrks_META,
			sls_rsn_cd_META,
			bd_dpt_cd_META,
			rqst_dt_META,
			rqst_dlv_rqst_dt_META,
			rqst_prms_dt_META,
			rqst_prms_dlv_dt_META,
			rqst_unit_cd_META,
			rqst_qty_META,
			slo_sum_base_dt_META,
			qtn_no_META,
			qtn_rev_META,
			qtn_d_no_META,
			ship_cnt_rmrks_META,
			trd_d_rmrks_META,
			intr_rmrks_META,
			io_schd_pr_no_META,
			sub_char1_META,
			sub_char2_META,
			sub_char3_META,
			itm_comp_seq_META,
			itm_spec_seq_META,
			abort_flg_META,
			can_flg_META,
			can_rsn_cd_META,
			slo_d_can_rmkrs_META,
			edi_sub_d_char1_META,
			edi_sub_d_char2_META,
			edi_sub_d_char3_META,
			edi_sub_d_char4_META,
			edi_sub_d_char5_META,
			edi_sub_d_num1_META,
			edi_sub_d_dt1_META,
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
			not_lg_mix_flg_META,
			not_lot_mix_flg_META,
			not_sublot_mix_flg_META
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
	protected MST_SLO_D_P_R(ConstMetaList<? extends MST_SLO_D_P_R> metas, String alias) {
		super(metas, TABLE_TYPE, TABLE_NAME, alias, EX_CTRL, LCL_TABLE, FOREIGN_INFO_LIST);
		super.setColumnMap(getColumnMap());
	}

	protected MST_SLO_D_P_R(ConstMetaList<? extends MST_SLO_D_P_R> metas) {
		this(metas, TABLE_NAME);
	}

	protected LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> getColumnMap() {
		LinkedHashMap<String, MCDBContainerColulmnInfo<? extends MCPermColumn>> COLUMN_MAP = new LinkedHashMap<>();
		COLUMN_MAP.put(
			MST_SLO_D_P_R.$slo_d_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_D_P_R.$slo_d_no,
				"slo_d_no",
				slo_d_no,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_D_P_R.$slo_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_D_P_R.$slo_no,
				"slo_no",
				slo_no,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_D_P_R.$slo_rev,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_SLO_D_P_R.$slo_rev,
				"slo_rev",
				slo_rev,
				true,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_D_P_R.$disp_seq,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_SLO_D_P_R.$disp_seq,
				"disp_seq",
				disp_seq,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_D_P_R.$itm_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_D_P_R.$itm_cd,
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
			MST_SLO_D_P_R.$itm_sub1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_D_P_R.$itm_sub1,
				"itm_sub1",
				itm_sub1,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_D_P_R.$itm_sub2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_D_P_R.$itm_sub2,
				"itm_sub2",
				itm_sub2,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_D_P_R.$itm_sub3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_D_P_R.$itm_sub3,
				"itm_sub3",
				itm_sub3,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_D_P_R.$itm_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_D_P_R.$itm_nm,
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
			MST_SLO_D_P_R.$iv_itm_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_D_P_R.$iv_itm_nm,
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
			MST_SLO_D_P_R.$sno1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_D_P_R.$sno1,
				"sno1",
				sno1,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_D_P_R.$sno1_null_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_SLO_D_P_R.$sno1_null_flg,
				"sno1_null_flg",
				sno1_null_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_D_P_R.$sno2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_D_P_R.$sno2,
				"sno2",
				sno2,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_D_P_R.$sno2_null_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_SLO_D_P_R.$sno2_null_flg,
				"sno2_null_flg",
				sno2_null_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_D_P_R.$sno3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_D_P_R.$sno3,
				"sno3",
				sno3,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_D_P_R.$sno3_null_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_SLO_D_P_R.$sno3_null_flg,
				"sno3_null_flg",
				sno3_null_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_D_P_R.$sno4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_D_P_R.$sno4,
				"sno4",
				sno4,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_D_P_R.$sno4_null_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_SLO_D_P_R.$sno4_null_flg,
				"sno4_null_flg",
				sno4_null_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_D_P_R.$ver_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_D_P_R.$ver_no,
				"ver_no",
				ver_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_D_P_R.$gd_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_D_P_R.$gd_cd,
				"gd_cd",
				gd_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_D_P_R.$sundry_itm_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_SLO_D_P_R.$sundry_itm_flg,
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
			MST_SLO_D_P_R.$sls_itm_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_D_P_R.$sls_itm_no,
				"sls_itm_no",
				sls_itm_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_D_P_R.$ship_inst_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_D_P_R.$ship_inst_typ,
				"ship_inst_typ",
				ship_inst_typ,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_D_P_R.$ship_schd_split_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_D_P_R.$ship_schd_split_typ,
				"ship_schd_split_typ",
				ship_schd_split_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_D_P_R.$cntry_org_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_D_P_R.$cntry_org_cd,
				"cntry_org_cd",
				cntry_org_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_D_P_R.$dlv_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_D_P_R.$dlv_cd,
				"dlv_cd",
				dlv_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_D_P_R.$dlv_sundry_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_SLO_D_P_R.$dlv_sundry_flg,
				"dlv_sundry_flg",
				dlv_sundry_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_D_P_R.$dlv_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_D_P_R.$dlv_nm,
				"dlv_nm",
				dlv_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_D_P_R.$dlv_cntct_dpt,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_D_P_R.$dlv_cntct_dpt,
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
			MST_SLO_D_P_R.$dlv_cntct_psn,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_D_P_R.$dlv_cntct_psn,
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
			MST_SLO_D_P_R.$dlv_zip_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_D_P_R.$dlv_zip_cd,
				"dlv_zip_cd",
				dlv_zip_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_D_P_R.$dlv_addr1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_D_P_R.$dlv_addr1,
				"dlv_addr1",
				dlv_addr1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_D_P_R.$dlv_addr2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_D_P_R.$dlv_addr2,
				"dlv_addr2",
				dlv_addr2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_D_P_R.$dlv_addr3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_D_P_R.$dlv_addr3,
				"dlv_addr3",
				dlv_addr3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_D_P_R.$dlv_addr4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_D_P_R.$dlv_addr4,
				"dlv_addr4",
				dlv_addr4,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_D_P_R.$dlv_tel,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_D_P_R.$dlv_tel,
				"dlv_tel",
				dlv_tel,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_D_P_R.$dlv_fax,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_D_P_R.$dlv_fax,
				"dlv_fax",
				dlv_fax,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_D_P_R.$dlv_lg_grp_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_D_P_R.$dlv_lg_grp_cd,
				"dlv_lg_grp_cd",
				dlv_lg_grp_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_D_P_R.$pri_prnt_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_SLO_D_P_R.$pri_prnt_flg,
				"pri_prnt_flg",
				pri_prnt_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_D_P_R.$dest_cd1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_D_P_R.$dest_cd1,
				"dest_cd1",
				dest_cd1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_D_P_R.$dest_cd2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_D_P_R.$dest_cd2,
				"dest_cd2",
				dest_cd2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_D_P_R.$dest_cd3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_D_P_R.$dest_cd3,
				"dest_cd3",
				dest_cd3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_D_P_R.$tdlv_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_D_P_R.$tdlv_cd,
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
			MST_SLO_D_P_R.$tdlv_sundry_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_SLO_D_P_R.$tdlv_sundry_flg,
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
			MST_SLO_D_P_R.$tdlv_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_D_P_R.$tdlv_nm,
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
			MST_SLO_D_P_R.$via_dlv_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_D_P_R.$via_dlv_typ,
				"via_dlv_typ",
				via_dlv_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_D_P_R.$tdlv_cntct_dpt,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_D_P_R.$tdlv_cntct_dpt,
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
			MST_SLO_D_P_R.$tdlv_cntct_psn,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_D_P_R.$tdlv_cntct_psn,
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
			MST_SLO_D_P_R.$tdlv_zip_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_D_P_R.$tdlv_zip_cd,
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
			MST_SLO_D_P_R.$tdlv_addr1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_D_P_R.$tdlv_addr1,
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
			MST_SLO_D_P_R.$tdlv_addr2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_D_P_R.$tdlv_addr2,
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
			MST_SLO_D_P_R.$tdlv_addr3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_D_P_R.$tdlv_addr3,
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
			MST_SLO_D_P_R.$tdlv_addr4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_D_P_R.$tdlv_addr4,
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
			MST_SLO_D_P_R.$tdlv_tel,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_D_P_R.$tdlv_tel,
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
			MST_SLO_D_P_R.$tdlv_fax,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_D_P_R.$tdlv_fax,
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
			MST_SLO_D_P_R.$tdlv_lg_grp_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_D_P_R.$tdlv_lg_grp_cd,
				"tdlv_lg_grp_cd",
				tdlv_lg_grp_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_D_P_R.$dlv_day_week_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_D_P_R.$dlv_day_week_typ,
				"dlv_day_week_typ",
				dlv_day_week_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_D_P_R.$sls_cststk_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_SLO_D_P_R.$sls_cststk_flg,
				"sls_cststk_flg",
				sls_cststk_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_D_P_R.$trd_unit_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_D_P_R.$trd_unit_cd,
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
			MST_SLO_D_P_R.$trd_unit_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_SLO_D_P_R.$trd_unit_qty,
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
			MST_SLO_D_P_R.$base_unit_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_D_P_R.$base_unit_cd,
				"base_unit_cd",
				base_unit_cd,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_D_P_R.$base_unit_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_SLO_D_P_R.$base_unit_qty,
				"base_unit_qty",
				base_unit_qty,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_D_P_R.$trd_cur_upri,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_SLO_D_P_R.$trd_cur_upri,
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
			MST_SLO_D_P_R.$upri_not_tgt_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_SLO_D_P_R.$upri_not_tgt_flg,
				"upri_not_tgt_flg",
				upri_not_tgt_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_D_P_R.$cost_upri,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_SLO_D_P_R.$cost_upri,
				"cost_upri",
				cost_upri,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_D_P_R.$cost_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_SLO_D_P_R.$cost_amt,
				"cost_amt",
				cost_amt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_D_P_R.$interim_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_SLO_D_P_R.$interim_flg,
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
			MST_SLO_D_P_R.$trd_cur_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_SLO_D_P_R.$trd_cur_amt,
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
			MST_SLO_D_P_R.$trd_cur_dscnt_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_SLO_D_P_R.$trd_cur_dscnt_amt,
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
			MST_SLO_D_P_R.$dscnt_rsn_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_D_P_R.$dscnt_rsn_cd,
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
			MST_SLO_D_P_R.$iv_upri,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_SLO_D_P_R.$iv_upri,
				"iv_upri",
				iv_upri,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_D_P_R.$iv_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_SLO_D_P_R.$iv_amt,
				"iv_amt",
				iv_amt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_D_P_R.$tax_fix_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_SLO_D_P_R.$tax_fix_flg,
				"tax_fix_flg",
				tax_fix_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_D_P_R.$tax_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_D_P_R.$tax_cd,
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
			MST_SLO_D_P_R.$trd_cur_tax_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_SLO_D_P_R.$trd_cur_tax_amt,
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
			MST_SLO_D_P_R.$proc_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_D_P_R.$proc_typ,
				"proc_typ",
				proc_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_D_P_R.$sls_upri_req_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_D_P_R.$sls_upri_req_typ,
				"sls_upri_req_typ",
				sls_upri_req_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_D_P_R.$set_itm_grp_no,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_SLO_D_P_R.$set_itm_grp_no,
				"set_itm_grp_no",
				set_itm_grp_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_D_P_R.$ship_rqst_tm,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_SLO_D_P_R.$ship_rqst_tm,
				"ship_rqst_tm",
				ship_rqst_tm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_D_P_R.$dlv_rqst_tm,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_SLO_D_P_R.$dlv_rqst_tm,
				"dlv_rqst_tm",
				dlv_rqst_tm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_D_P_R.$sls_schd_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_SLO_D_P_R.$sls_schd_dt,
				"sls_schd_dt",
				sls_schd_dt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_D_P_R.$accpt_schd_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_SLO_D_P_R.$accpt_schd_dt,
				"accpt_schd_dt",
				accpt_schd_dt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_D_P_R.$prms_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_SLO_D_P_R.$prms_flg,
				"prms_flg",
				prms_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_D_P_R.$rqst_to_loc_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_D_P_R.$rqst_to_loc_cd,
				"rqst_to_loc_cd",
				rqst_to_loc_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_D_P_R.$sppl_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_D_P_R.$sppl_cd,
				"sppl_cd",
				sppl_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_D_P_R.$maker_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_D_P_R.$maker_cd,
				"maker_cd",
				maker_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_D_P_R.$alloc_scope_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_D_P_R.$alloc_scope_typ,
				"alloc_scope_typ",
				alloc_scope_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_D_P_R.$alloc_typ,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_D_P_R.$alloc_typ,
				"alloc_typ",
				alloc_typ,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_D_P_R.$alloc_grp_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_D_P_R.$alloc_grp_cd,
				"alloc_grp_cd",
				alloc_grp_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_D_P_R.$ship_lg_grp_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_D_P_R.$ship_lg_grp_cd,
				"ship_lg_grp_cd",
				ship_lg_grp_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_D_P_R.$def_loc_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_D_P_R.$def_loc_cd,
				"def_loc_cd",
				def_loc_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_D_P_R.$loc_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_D_P_R.$loc_cd,
				"loc_cd",
				loc_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_D_P_R.$str_ln_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_D_P_R.$str_ln_cd,
				"str_ln_cd",
				str_ln_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_D_P_R.$lot_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_D_P_R.$lot_no,
				"lot_no",
				lot_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_D_P_R.$sublot_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_D_P_R.$sublot_no,
				"sublot_no",
				sublot_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_D_P_R.$vmi_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_SLO_D_P_R.$vmi_flg,
				"vmi_flg",
				vmi_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_D_P_R.$wtax_rate,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_SLO_D_P_R.$wtax_rate,
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
			MST_SLO_D_P_R.$wtax_amt,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_SLO_D_P_R.$wtax_amt,
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
			MST_SLO_D_P_R.$wg_rqst_cnt_rmrks,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_D_P_R.$wg_rqst_cnt_rmrks,
				"wg_rqst_cnt_rmrks",
				wg_rqst_cnt_rmrks,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_D_P_R.$ship_term_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_D_P_R.$ship_term_cd,
				"ship_term_cd",
				ship_term_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_D_P_R.$bill_crryovr_times,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_SLO_D_P_R.$bill_crryovr_times,
				"bill_crryovr_times",
				bill_crryovr_times,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_D_P_R.$cst_po_d_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_D_P_R.$cst_po_d_no,
				"cst_po_d_no",
				cst_po_d_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_D_P_R.$cst_itm_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_D_P_R.$cst_itm_cd,
				"cst_itm_cd",
				cst_itm_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_D_P_R.$cst_itm_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_D_P_R.$cst_itm_nm,
				"cst_itm_nm",
				cst_itm_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_D_P_R.$cst_po_d_rmrks,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_D_P_R.$cst_po_d_rmrks,
				"cst_po_d_rmrks",
				cst_po_d_rmrks,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_D_P_R.$sls_rsn_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_D_P_R.$sls_rsn_cd,
				"sls_rsn_cd",
				sls_rsn_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_D_P_R.$bd_dpt_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_D_P_R.$bd_dpt_cd,
				"bd_dpt_cd",
				bd_dpt_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_D_P_R.$rqst_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_SLO_D_P_R.$rqst_dt,
				"rqst_dt",
				rqst_dt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_D_P_R.$rqst_dlv_rqst_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_SLO_D_P_R.$rqst_dlv_rqst_dt,
				"rqst_dlv_rqst_dt",
				rqst_dlv_rqst_dt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_D_P_R.$rqst_prms_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_SLO_D_P_R.$rqst_prms_dt,
				"rqst_prms_dt",
				rqst_prms_dt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_D_P_R.$rqst_prms_dlv_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_SLO_D_P_R.$rqst_prms_dlv_dt,
				"rqst_prms_dlv_dt",
				rqst_prms_dlv_dt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_D_P_R.$rqst_unit_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_D_P_R.$rqst_unit_cd,
				"rqst_unit_cd",
				rqst_unit_cd,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_D_P_R.$rqst_qty,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_SLO_D_P_R.$rqst_qty,
				"rqst_qty",
				rqst_qty,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_D_P_R.$slo_sum_base_dt,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_SLO_D_P_R.$slo_sum_base_dt,
				"slo_sum_base_dt",
				slo_sum_base_dt,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_D_P_R.$qtn_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_D_P_R.$qtn_no,
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
			MST_SLO_D_P_R.$qtn_rev,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_SLO_D_P_R.$qtn_rev,
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
			MST_SLO_D_P_R.$qtn_d_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_D_P_R.$qtn_d_no,
				"qtn_d_no",
				qtn_d_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_D_P_R.$ship_cnt_rmrks,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_D_P_R.$ship_cnt_rmrks,
				"ship_cnt_rmrks",
				ship_cnt_rmrks,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_D_P_R.$trd_d_rmrks,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_D_P_R.$trd_d_rmrks,
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
			MST_SLO_D_P_R.$intr_rmrks,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_D_P_R.$intr_rmrks,
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
			MST_SLO_D_P_R.$io_schd_pr_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_D_P_R.$io_schd_pr_no,
				"io_schd_pr_no",
				io_schd_pr_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_D_P_R.$sub_char1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_D_P_R.$sub_char1,
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
			MST_SLO_D_P_R.$sub_char2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_D_P_R.$sub_char2,
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
			MST_SLO_D_P_R.$sub_char3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_D_P_R.$sub_char3,
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
			MST_SLO_D_P_R.$itm_comp_seq,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_SLO_D_P_R.$itm_comp_seq,
				"itm_comp_seq",
				itm_comp_seq,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_D_P_R.$itm_spec_seq,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_SLO_D_P_R.$itm_spec_seq,
				"itm_spec_seq",
				itm_spec_seq,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_D_P_R.$abort_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_SLO_D_P_R.$abort_flg,
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
			MST_SLO_D_P_R.$can_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_SLO_D_P_R.$can_flg,
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
			MST_SLO_D_P_R.$can_rsn_cd,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_D_P_R.$can_rsn_cd,
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
			MST_SLO_D_P_R.$slo_d_can_rmkrs,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_D_P_R.$slo_d_can_rmkrs,
				"slo_d_can_rmkrs",
				slo_d_can_rmkrs,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_D_P_R.$edi_sub_d_char1,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_D_P_R.$edi_sub_d_char1,
				"edi_sub_d_char1",
				edi_sub_d_char1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_D_P_R.$edi_sub_d_char2,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_D_P_R.$edi_sub_d_char2,
				"edi_sub_d_char2",
				edi_sub_d_char2,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_D_P_R.$edi_sub_d_char3,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_D_P_R.$edi_sub_d_char3,
				"edi_sub_d_char3",
				edi_sub_d_char3,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_D_P_R.$edi_sub_d_char4,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_D_P_R.$edi_sub_d_char4,
				"edi_sub_d_char4",
				edi_sub_d_char4,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_D_P_R.$edi_sub_d_char5,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_D_P_R.$edi_sub_d_char5,
				"edi_sub_d_char5",
				edi_sub_d_char5,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_D_P_R.$edi_sub_d_num1,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_SLO_D_P_R.$edi_sub_d_num1,
				"edi_sub_d_num1",
				edi_sub_d_num1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_D_P_R.$edi_sub_d_dt1,
			new MCDBContainerColulmnInfo<MCDatePermColumn>(
				MCDataType.DATE,
				MST_SLO_D_P_R.$edi_sub_d_dt1,
				"edi_sub_d_dt1",
				edi_sub_d_dt1,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_D_P_R.$ins_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_D_P_R.$ins_usr_id,
				"ins_usr_id",
				ins_usr_id,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_D_P_R.$ins_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_D_P_R.$ins_usr_nm,
				"ins_usr_nm",
				ins_usr_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_D_P_R.$ins_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MST_SLO_D_P_R.$ins_ts,
				"ins_ts",
				ins_ts,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_D_P_R.$ins_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_D_P_R.$ins_func_id,
				"ins_func_id",
				ins_func_id,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_D_P_R.$upd_cntr,
			new MCDBContainerColulmnInfo<MCNumberPermColumn>(
				MCDataType.NUMBER,
				MST_SLO_D_P_R.$upd_cntr,
				"upd_cntr",
				upd_cntr,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_D_P_R.$upd_usr_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_D_P_R.$upd_usr_id,
				"upd_usr_id",
				upd_usr_id,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_D_P_R.$upd_usr_nm,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_D_P_R.$upd_usr_nm,
				"upd_usr_nm",
				upd_usr_nm,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_D_P_R.$upd_ts,
			new MCDBContainerColulmnInfo<MCTimestampPermColumn>(
				MCDataType.TIMESTAMP,
				MST_SLO_D_P_R.$upd_ts,
				"upd_ts",
				upd_ts,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_D_P_R.$upd_func_id,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_D_P_R.$upd_func_id,
				"upd_func_id",
				upd_func_id,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_D_P_R.$upd_srv_req_no,
			new MCDBContainerColulmnInfo<MCStringPermColumn>(
				MCDataType.STRING,
				MST_SLO_D_P_R.$upd_srv_req_no,
				"upd_srv_req_no",
				upd_srv_req_no,
				false,
				true,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_D_P_R.$not_lg_mix_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_SLO_D_P_R.$not_lg_mix_flg,
				"not_lg_mix_flg",
				not_lg_mix_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_D_P_R.$not_lot_mix_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_SLO_D_P_R.$not_lot_mix_flg,
				"not_lot_mix_flg",
				not_lot_mix_flg,
				false,
				false,
				false,
				false,
				false,
				""
			)
		);
		COLUMN_MAP.put(
			MST_SLO_D_P_R.$not_sublot_mix_flg,
			new MCDBContainerColulmnInfo<MCBooleanPermColumn>(
				MCDataType.BOOLEAN,
				MST_SLO_D_P_R.$not_sublot_mix_flg,
				"not_sublot_mix_flg",
				not_sublot_mix_flg,
				false,
				false,
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
	public static MST_SLO_D_P_R create() {
		return create(TABLE_NAME);
	}

	/**
	 * 新しいRowを生成します。
	 *
	 * @return 新しいインスタンス
	 */
	public static MST_SLO_D_P_R create(String alias) {
		MST_SLO_D_P_R row = new MST_SLO_D_P_R(constMetas, alias);
		return row;
	}

	/**
	 * 新しいRowを生成し別のRowの内容を設定します。
	 *
	 * @param proto 設定するRow
	 * @return 内容を設定した新しいインスタンス
	 */
	public static <T extends MCRow> MST_SLO_D_P_R createByName(T proto) {
		MST_SLO_D_P_R row = MST_SLO_D_P_R.create();
		copyByName(row, proto);
		return row;
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MST_SLO_D_P_R clone() {
		return (MST_SLO_D_P_R) super.clone();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MST_SLO_D_P_R createInstance() {
		return (MST_SLO_D_P_R) super.createInstance();
	}

	/*
	 * MCRowのオーバーライドメソッドです。
	 */
	public MST_SLO_D_P_R getValues(String... names) {
		return (MST_SLO_D_P_R) super.getValues(names);
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
	 public MSW_SLO_D_P_KEY_R getPkWorkDbc(String alias) {
	 	return MSW_SLO_D_P_KEY_R.create(alias);
	 }

	/*
	 * MCDBContainerのオーバーライドメソッドです。
	 */
	 public MSW_SLO_D_P_KEY_R getPkWorkDbc() {
	 	return getPkWorkDbc(MSW_SLO_D_P_KEY_R.TABLE_NAME);
	 }

	/**
	 * 受注明細ＮＯ. Sales order details No..<p>
	 *
	 */
	public String slo_d_no() {
		return getConstString(offset + 0, $slo_d_no);
	}

	/**
	 * 受注明細ＮＯ. Sales order details No..<p>
	 *
	 */
	public void slo_d_no(String value) {
		setConstString(offset + 0, $slo_d_no, value);
	}

	/**
	 * 受注ＮＯ. Sales order No..<p>
	 *
	 */
	public String slo_no() {
		return getConstString(offset + 1, $slo_no);
	}

	/**
	 * 受注ＮＯ. Sales order No..<p>
	 *
	 */
	public void slo_no(String value) {
		setConstString(offset + 1, $slo_no, value);
	}

	/**
	 * 受注改訂番号. Sales order rev. number.<p>
	 *
	 */
	public MCNumber slo_rev() {
		return getConstNumber(offset + 2, $slo_rev);
	}

	/**
	 * 受注改訂番号. Sales order rev. number.<p>
	 *
	 */
	public void slo_rev(MCNumber value) {
		setConstNumber(offset + 2, $slo_rev, value);
	}
	
	/**
	 * 受注改訂番号. Sales order rev. number.<p>
	 *
	 */
	public void slo_rev(int value) {
		setConstNumber(offset + 2, $slo_rev, value);
	}
	
	/**
	 * 受注改訂番号. Sales order rev. number.<p>
	 *
	 */
	public void slo_rev(long value) {
		setConstNumber(offset + 2, $slo_rev, value);
	}
	
	/**
	 * 受注改訂番号. Sales order rev. number.<p>
	 *
	 */
	public void slo_rev(float value) {
		setConstNumber(offset + 2, $slo_rev, value);
	}
	
	/**
	 * 受注改訂番号. Sales order rev. number.<p>
	 *
	 */
	public void slo_rev(double value) {
		setConstNumber(offset + 2, $slo_rev, value);
	}
	
	/**
	 * 表示順. Display order.<p>
	 *
	 */
	public MCNumber disp_seq() {
		return getConstNumber(offset + 3, $disp_seq);
	}

	/**
	 * 表示順. Display order.<p>
	 *
	 */
	public void disp_seq(MCNumber value) {
		setConstNumber(offset + 3, $disp_seq, value);
	}
	
	/**
	 * 表示順. Display order.<p>
	 *
	 */
	public void disp_seq(int value) {
		setConstNumber(offset + 3, $disp_seq, value);
	}
	
	/**
	 * 表示順. Display order.<p>
	 *
	 */
	public void disp_seq(long value) {
		setConstNumber(offset + 3, $disp_seq, value);
	}
	
	/**
	 * 表示順. Display order.<p>
	 *
	 */
	public void disp_seq(float value) {
		setConstNumber(offset + 3, $disp_seq, value);
	}
	
	/**
	 * 表示順. Display order.<p>
	 *
	 */
	public void disp_seq(double value) {
		setConstNumber(offset + 3, $disp_seq, value);
	}
	
	/**
	 * 品目ＣＤ. Item cd..<p>
	 *
	 */
	public String itm_cd() {
		return getConstString(offset + 4, $itm_cd);
	}

	/**
	 * 品目ＣＤ. Item cd..<p>
	 *
	 */
	public void itm_cd(String value) {
		setConstString(offset + 4, $itm_cd, value);
	}

	/**
	 * 枝番１. Branch No. 1.<p>
	 *
	 */
	public String itm_sub1() {
		return getConstString(offset + 5, $itm_sub1);
	}

	/**
	 * 枝番１. Branch No. 1.<p>
	 *
	 */
	public void itm_sub1(String value) {
		setConstString(offset + 5, $itm_sub1, value);
	}

	/**
	 * 枝番２. Branch No. 2.<p>
	 *
	 */
	public String itm_sub2() {
		return getConstString(offset + 6, $itm_sub2);
	}

	/**
	 * 枝番２. Branch No. 2.<p>
	 *
	 */
	public void itm_sub2(String value) {
		setConstString(offset + 6, $itm_sub2, value);
	}

	/**
	 * 枝番３. Branch No. 3.<p>
	 *
	 */
	public String itm_sub3() {
		return getConstString(offset + 7, $itm_sub3);
	}

	/**
	 * 枝番３. Branch No. 3.<p>
	 *
	 */
	public void itm_sub3(String value) {
		setConstString(offset + 7, $itm_sub3, value);
	}

	/**
	 * 品名. Item name.<p>
	 *
	 */
	public String itm_nm() {
		return getConstString(offset + 8, $itm_nm);
	}

	/**
	 * 品名. Item name.<p>
	 *
	 */
	public void itm_nm(String value) {
		setConstString(offset + 8, $itm_nm, value);
	}

	/**
	 * インボイス表記品名. Item name for invoice.<p>
	 *
	 */
	public String iv_itm_nm() {
		return getConstString(offset + 9, $iv_itm_nm);
	}

	/**
	 * インボイス表記品名. Item name for invoice.<p>
	 *
	 */
	public void iv_itm_nm(String value) {
		setConstString(offset + 9, $iv_itm_nm, value);
	}

	/**
	 * 手配ＮＯ１. SEIBAN No. 1.<p>
	 *
	 */
	public String sno1() {
		return getConstString(offset + 10, $sno1);
	}

	/**
	 * 手配ＮＯ１. SEIBAN No. 1.<p>
	 *
	 */
	public void sno1(String value) {
		setConstString(offset + 10, $sno1, value);
	}

	/**
	 * 手配ＮＯ１無し可ＦＬＧ. Allow without SEIBAN No. 1 flg..<p>
	 *
	 */
	public boolean sno1_null_flg() {
		return getConstBoolean(offset + 11, $sno1_null_flg);
	}

	/**
	 * 手配ＮＯ１無し可ＦＬＧ. Allow without SEIBAN No. 1 flg..<p>
	 *
	 */
	public void sno1_null_flg(boolean value) {
		setConstBoolean(offset + 11, $sno1_null_flg, value);
	}

	/**
	 * 手配ＮＯ２. SEIBAN No. 2.<p>
	 *
	 */
	public String sno2() {
		return getConstString(offset + 12, $sno2);
	}

	/**
	 * 手配ＮＯ２. SEIBAN No. 2.<p>
	 *
	 */
	public void sno2(String value) {
		setConstString(offset + 12, $sno2, value);
	}

	/**
	 * 手配ＮＯ２無し可ＦＬＧ. Allow without SEIBAN No. 2 flg..<p>
	 *
	 */
	public boolean sno2_null_flg() {
		return getConstBoolean(offset + 13, $sno2_null_flg);
	}

	/**
	 * 手配ＮＯ２無し可ＦＬＧ. Allow without SEIBAN No. 2 flg..<p>
	 *
	 */
	public void sno2_null_flg(boolean value) {
		setConstBoolean(offset + 13, $sno2_null_flg, value);
	}

	/**
	 * 手配ＮＯ３. SEIBAN No. 3.<p>
	 *
	 */
	public String sno3() {
		return getConstString(offset + 14, $sno3);
	}

	/**
	 * 手配ＮＯ３. SEIBAN No. 3.<p>
	 *
	 */
	public void sno3(String value) {
		setConstString(offset + 14, $sno3, value);
	}

	/**
	 * 手配ＮＯ３無し可ＦＬＧ. Allow without SEIBAN No. 3 flg..<p>
	 *
	 */
	public boolean sno3_null_flg() {
		return getConstBoolean(offset + 15, $sno3_null_flg);
	}

	/**
	 * 手配ＮＯ３無し可ＦＬＧ. Allow without SEIBAN No. 3 flg..<p>
	 *
	 */
	public void sno3_null_flg(boolean value) {
		setConstBoolean(offset + 15, $sno3_null_flg, value);
	}

	/**
	 * 手配ＮＯ４. SEIBAN No. 4.<p>
	 *
	 */
	public String sno4() {
		return getConstString(offset + 16, $sno4);
	}

	/**
	 * 手配ＮＯ４. SEIBAN No. 4.<p>
	 *
	 */
	public void sno4(String value) {
		setConstString(offset + 16, $sno4, value);
	}

	/**
	 * 手配ＮＯ４無し可ＦＬＧ. Allow without SEIBAN No. 4 flg..<p>
	 *
	 */
	public boolean sno4_null_flg() {
		return getConstBoolean(offset + 17, $sno4_null_flg);
	}

	/**
	 * 手配ＮＯ４無し可ＦＬＧ. Allow without SEIBAN No. 4 flg..<p>
	 *
	 */
	public void sno4_null_flg(boolean value) {
		setConstBoolean(offset + 17, $sno4_null_flg, value);
	}

	/**
	 * 版ＮＯ. Version No..<p>
	 *
	 */
	public String ver_no() {
		return getConstString(offset + 18, $ver_no);
	}

	/**
	 * 版ＮＯ. Version No..<p>
	 *
	 */
	public void ver_no(String value) {
		setConstString(offset + 18, $ver_no, value);
	}

	/**
	 * 格付ＣＤ. Grading cd..<p>
	 *
	 */
	public String gd_cd() {
		return getConstString(offset + 19, $gd_cd);
	}

	/**
	 * 格付ＣＤ. Grading cd..<p>
	 *
	 */
	public void gd_cd(String value) {
		setConstString(offset + 19, $gd_cd, value);
	}

	/**
	 * 諸口品ＦＬＧ. Miscellaneous item flg..<p>
	 *
	 */
	public boolean sundry_itm_flg() {
		return getConstBoolean(offset + 20, $sundry_itm_flg);
	}

	/**
	 * 諸口品ＦＬＧ. Miscellaneous item flg..<p>
	 *
	 */
	public void sundry_itm_flg(boolean value) {
		setConstBoolean(offset + 20, $sundry_itm_flg, value);
	}

	/**
	 * 販売品目ＮＯ. Sales item No..<p>
	 *
	 */
	public String sls_itm_no() {
		return getConstString(offset + 21, $sls_itm_no);
	}

	/**
	 * 販売品目ＮＯ. Sales item No..<p>
	 *
	 */
	public void sls_itm_no(String value) {
		setConstString(offset + 21, $sls_itm_no, value);
	}

	/**
	 * 出荷指図区分. Shipping order type.<p>
	 *
	 */
	public String ship_inst_typ() {
		return getConstString(offset + 22, $ship_inst_typ);
	}

	/**
	 * 出荷指図区分. Shipping order type.<p>
	 *
	 */
	public void ship_inst_typ(String value) {
		setConstString(offset + 22, $ship_inst_typ, value);
	}

	/**
	 * 出荷予定分割区分. Shipping schedule split type.<p>
	 *
	 */
	public String ship_schd_split_typ() {
		return getConstString(offset + 23, $ship_schd_split_typ);
	}

	/**
	 * 出荷予定分割区分. Shipping schedule split type.<p>
	 *
	 */
	public void ship_schd_split_typ(String value) {
		setConstString(offset + 23, $ship_schd_split_typ, value);
	}

	/**
	 * 原産地ＣＤ. Place of origin cd..<p>
	 *
	 */
	public String cntry_org_cd() {
		return getConstString(offset + 24, $cntry_org_cd);
	}

	/**
	 * 原産地ＣＤ. Place of origin cd..<p>
	 *
	 */
	public void cntry_org_cd(String value) {
		setConstString(offset + 24, $cntry_org_cd, value);
	}

	/**
	 * 納品先ＣＤ. Delivery destination cd..<p>
	 *
	 */
	public String dlv_cd() {
		return getConstString(offset + 25, $dlv_cd);
	}

	/**
	 * 納品先ＣＤ. Delivery destination cd..<p>
	 *
	 */
	public void dlv_cd(String value) {
		setConstString(offset + 25, $dlv_cd, value);
	}

	/**
	 * 納品先諸口ＦＬＧ. Miscellaneous delivery destination flg..<p>
	 *
	 */
	public boolean dlv_sundry_flg() {
		return getConstBoolean(offset + 26, $dlv_sundry_flg);
	}

	/**
	 * 納品先諸口ＦＬＧ. Miscellaneous delivery destination flg..<p>
	 *
	 */
	public void dlv_sundry_flg(boolean value) {
		setConstBoolean(offset + 26, $dlv_sundry_flg, value);
	}

	/**
	 * 納品先名. Delivery destination name.<p>
	 *
	 */
	public String dlv_nm() {
		return getConstString(offset + 27, $dlv_nm);
	}

	/**
	 * 納品先名. Delivery destination name.<p>
	 *
	 */
	public void dlv_nm(String value) {
		setConstString(offset + 27, $dlv_nm, value);
	}

	/**
	 * 納品先部署. Delivery destination dept..<p>
	 *
	 */
	public String dlv_cntct_dpt() {
		return getConstString(offset + 28, $dlv_cntct_dpt);
	}

	/**
	 * 納品先部署. Delivery destination dept..<p>
	 *
	 */
	public void dlv_cntct_dpt(String value) {
		setConstString(offset + 28, $dlv_cntct_dpt, value);
	}

	/**
	 * 納品先担当者. Delivery destination PIC.<p>
	 *
	 */
	public String dlv_cntct_psn() {
		return getConstString(offset + 29, $dlv_cntct_psn);
	}

	/**
	 * 納品先担当者. Delivery destination PIC.<p>
	 *
	 */
	public void dlv_cntct_psn(String value) {
		setConstString(offset + 29, $dlv_cntct_psn, value);
	}

	/**
	 * 納品先郵便番号. Zip code (Delivery destination).<p>
	 *
	 */
	public String dlv_zip_cd() {
		return getConstString(offset + 30, $dlv_zip_cd);
	}

	/**
	 * 納品先郵便番号. Zip code (Delivery destination).<p>
	 *
	 */
	public void dlv_zip_cd(String value) {
		setConstString(offset + 30, $dlv_zip_cd, value);
	}

	/**
	 * 納品先住所１. Address 1 (Delivery destination).<p>
	 *
	 */
	public String dlv_addr1() {
		return getConstString(offset + 31, $dlv_addr1);
	}

	/**
	 * 納品先住所１. Address 1 (Delivery destination).<p>
	 *
	 */
	public void dlv_addr1(String value) {
		setConstString(offset + 31, $dlv_addr1, value);
	}

	/**
	 * 納品先住所２. Address 2 (Delivery destination).<p>
	 *
	 */
	public String dlv_addr2() {
		return getConstString(offset + 32, $dlv_addr2);
	}

	/**
	 * 納品先住所２. Address 2 (Delivery destination).<p>
	 *
	 */
	public void dlv_addr2(String value) {
		setConstString(offset + 32, $dlv_addr2, value);
	}

	/**
	 * 納品先住所３. Address 3 (Delivery destination).<p>
	 *
	 */
	public String dlv_addr3() {
		return getConstString(offset + 33, $dlv_addr3);
	}

	/**
	 * 納品先住所３. Address 3 (Delivery destination).<p>
	 *
	 */
	public void dlv_addr3(String value) {
		setConstString(offset + 33, $dlv_addr3, value);
	}

	/**
	 * 納品先住所４. Address 4 (Delivery destination).<p>
	 *
	 */
	public String dlv_addr4() {
		return getConstString(offset + 34, $dlv_addr4);
	}

	/**
	 * 納品先住所４. Address 4 (Delivery destination).<p>
	 *
	 */
	public void dlv_addr4(String value) {
		setConstString(offset + 34, $dlv_addr4, value);
	}

	/**
	 * 納品先ＴＥＬ. TEL (Delivery destination).<p>
	 *
	 */
	public String dlv_tel() {
		return getConstString(offset + 35, $dlv_tel);
	}

	/**
	 * 納品先ＴＥＬ. TEL (Delivery destination).<p>
	 *
	 */
	public void dlv_tel(String value) {
		setConstString(offset + 35, $dlv_tel, value);
	}

	/**
	 * 納品先ＦＡＸ. FAX (Delivery destination).<p>
	 *
	 */
	public String dlv_fax() {
		return getConstString(offset + 36, $dlv_fax);
	}

	/**
	 * 納品先ＦＡＸ. FAX (Delivery destination).<p>
	 *
	 */
	public void dlv_fax(String value) {
		setConstString(offset + 36, $dlv_fax, value);
	}

	/**
	 * 納品先物流グループＣＤ. Delivery destination distribution group cd..<p>
	 *
	 */
	public String dlv_lg_grp_cd() {
		return getConstString(offset + 37, $dlv_lg_grp_cd);
	}

	/**
	 * 納品先物流グループＣＤ. Delivery destination distribution group cd..<p>
	 *
	 */
	public void dlv_lg_grp_cd(String value) {
		setConstString(offset + 37, $dlv_lg_grp_cd, value);
	}

	/**
	 * 価格印字ＦＬＧ. Print price flg..<p>
	 *
	 */
	public boolean pri_prnt_flg() {
		return getConstBoolean(offset + 38, $pri_prnt_flg);
	}

	/**
	 * 価格印字ＦＬＧ. Print price flg..<p>
	 *
	 */
	public void pri_prnt_flg(boolean value) {
		setConstBoolean(offset + 38, $pri_prnt_flg, value);
	}

	/**
	 * 仕向先ＣＤ１. Distribution channel cd. 1.<p>
	 *
	 */
	public String dest_cd1() {
		return getConstString(offset + 39, $dest_cd1);
	}

	/**
	 * 仕向先ＣＤ１. Distribution channel cd. 1.<p>
	 *
	 */
	public void dest_cd1(String value) {
		setConstString(offset + 39, $dest_cd1, value);
	}

	/**
	 * 仕向先ＣＤ２. Distribution channel cd. 2.<p>
	 *
	 */
	public String dest_cd2() {
		return getConstString(offset + 40, $dest_cd2);
	}

	/**
	 * 仕向先ＣＤ２. Distribution channel cd. 2.<p>
	 *
	 */
	public void dest_cd2(String value) {
		setConstString(offset + 40, $dest_cd2, value);
	}

	/**
	 * 仕向先ＣＤ３. Distribution channel cd. 3.<p>
	 *
	 */
	public String dest_cd3() {
		return getConstString(offset + 41, $dest_cd3);
	}

	/**
	 * 仕向先ＣＤ３. Distribution channel cd. 3.<p>
	 *
	 */
	public void dest_cd3(String value) {
		setConstString(offset + 41, $dest_cd3, value);
	}

	/**
	 * 配送先ＣＤ. Receiving point cd..<p>
	 *
	 */
	public String tdlv_cd() {
		return getConstString(offset + 42, $tdlv_cd);
	}

	/**
	 * 配送先ＣＤ. Receiving point cd..<p>
	 *
	 */
	public void tdlv_cd(String value) {
		setConstString(offset + 42, $tdlv_cd, value);
	}

	/**
	 * 配送先諸口ＦＬＧ. Miscellaneous receiving point flg..<p>
	 *
	 */
	public boolean tdlv_sundry_flg() {
		return getConstBoolean(offset + 43, $tdlv_sundry_flg);
	}

	/**
	 * 配送先諸口ＦＬＧ. Miscellaneous receiving point flg..<p>
	 *
	 */
	public void tdlv_sundry_flg(boolean value) {
		setConstBoolean(offset + 43, $tdlv_sundry_flg, value);
	}

	/**
	 * 配送先名. Receiving point name.<p>
	 *
	 */
	public String tdlv_nm() {
		return getConstString(offset + 44, $tdlv_nm);
	}

	/**
	 * 配送先名. Receiving point name.<p>
	 *
	 */
	public void tdlv_nm(String value) {
		setConstString(offset + 44, $tdlv_nm, value);
	}

	/**
	 * 配送先経由区分. Receiving point stopover type.<p>
	 *
	 */
	public String via_dlv_typ() {
		return getConstString(offset + 45, $via_dlv_typ);
	}

	/**
	 * 配送先経由区分. Receiving point stopover type.<p>
	 *
	 */
	public void via_dlv_typ(String value) {
		setConstString(offset + 45, $via_dlv_typ, value);
	}

	/**
	 * 配送先部署. Receiving point dept..<p>
	 *
	 */
	public String tdlv_cntct_dpt() {
		return getConstString(offset + 46, $tdlv_cntct_dpt);
	}

	/**
	 * 配送先部署. Receiving point dept..<p>
	 *
	 */
	public void tdlv_cntct_dpt(String value) {
		setConstString(offset + 46, $tdlv_cntct_dpt, value);
	}

	/**
	 * 配送先担当者. Receiving point PIC.<p>
	 *
	 */
	public String tdlv_cntct_psn() {
		return getConstString(offset + 47, $tdlv_cntct_psn);
	}

	/**
	 * 配送先担当者. Receiving point PIC.<p>
	 *
	 */
	public void tdlv_cntct_psn(String value) {
		setConstString(offset + 47, $tdlv_cntct_psn, value);
	}

	/**
	 * 配送先郵便番号. Receiving point zip code.<p>
	 *
	 */
	public String tdlv_zip_cd() {
		return getConstString(offset + 48, $tdlv_zip_cd);
	}

	/**
	 * 配送先郵便番号. Receiving point zip code.<p>
	 *
	 */
	public void tdlv_zip_cd(String value) {
		setConstString(offset + 48, $tdlv_zip_cd, value);
	}

	/**
	 * 配送先住所１. Receiving point address 1.<p>
	 *
	 */
	public String tdlv_addr1() {
		return getConstString(offset + 49, $tdlv_addr1);
	}

	/**
	 * 配送先住所１. Receiving point address 1.<p>
	 *
	 */
	public void tdlv_addr1(String value) {
		setConstString(offset + 49, $tdlv_addr1, value);
	}

	/**
	 * 配送先住所２. Receiving point address 2.<p>
	 *
	 */
	public String tdlv_addr2() {
		return getConstString(offset + 50, $tdlv_addr2);
	}

	/**
	 * 配送先住所２. Receiving point address 2.<p>
	 *
	 */
	public void tdlv_addr2(String value) {
		setConstString(offset + 50, $tdlv_addr2, value);
	}

	/**
	 * 配送先住所３. Receiving point address 3.<p>
	 *
	 */
	public String tdlv_addr3() {
		return getConstString(offset + 51, $tdlv_addr3);
	}

	/**
	 * 配送先住所３. Receiving point address 3.<p>
	 *
	 */
	public void tdlv_addr3(String value) {
		setConstString(offset + 51, $tdlv_addr3, value);
	}

	/**
	 * 配送先住所４. Receiving point address 4.<p>
	 *
	 */
	public String tdlv_addr4() {
		return getConstString(offset + 52, $tdlv_addr4);
	}

	/**
	 * 配送先住所４. Receiving point address 4.<p>
	 *
	 */
	public void tdlv_addr4(String value) {
		setConstString(offset + 52, $tdlv_addr4, value);
	}

	/**
	 * 配送先ＴＥＬ. Receiving point TEL.<p>
	 *
	 */
	public String tdlv_tel() {
		return getConstString(offset + 53, $tdlv_tel);
	}

	/**
	 * 配送先ＴＥＬ. Receiving point TEL.<p>
	 *
	 */
	public void tdlv_tel(String value) {
		setConstString(offset + 53, $tdlv_tel, value);
	}

	/**
	 * 配送先ＦＡＸ. Receiving point FAX.<p>
	 *
	 */
	public String tdlv_fax() {
		return getConstString(offset + 54, $tdlv_fax);
	}

	/**
	 * 配送先ＦＡＸ. Receiving point FAX.<p>
	 *
	 */
	public void tdlv_fax(String value) {
		setConstString(offset + 54, $tdlv_fax, value);
	}

	/**
	 * 配送先物流グループＣＤ. Receiving point distribution group cd..<p>
	 *
	 */
	public String tdlv_lg_grp_cd() {
		return getConstString(offset + 55, $tdlv_lg_grp_cd);
	}

	/**
	 * 配送先物流グループＣＤ. Receiving point distribution group cd..<p>
	 *
	 */
	public void tdlv_lg_grp_cd(String value) {
		setConstString(offset + 55, $tdlv_lg_grp_cd, value);
	}

	/**
	 * 着曜日. Arrival day of week.<p>
	 *
	 */
	public String dlv_day_week_typ() {
		return getConstString(offset + 56, $dlv_day_week_typ);
	}

	/**
	 * 着曜日. Arrival day of week.<p>
	 *
	 */
	public void dlv_day_week_typ(String value) {
		setConstString(offset + 56, $dlv_day_week_typ, value);
	}

	/**
	 * 預り売上ＦＬＧ. Sales keeping customer inventory flg..<p>
	 *
	 */
	public boolean sls_cststk_flg() {
		return getConstBoolean(offset + 57, $sls_cststk_flg);
	}

	/**
	 * 預り売上ＦＬＧ. Sales keeping customer inventory flg..<p>
	 *
	 */
	public void sls_cststk_flg(boolean value) {
		setConstBoolean(offset + 57, $sls_cststk_flg, value);
	}

	/**
	 * 取引単位ＣＤ. Transaction unit cd..<p>
	 *
	 */
	public String trd_unit_cd() {
		return getConstString(offset + 58, $trd_unit_cd);
	}

	/**
	 * 取引単位ＣＤ. Transaction unit cd..<p>
	 *
	 */
	public void trd_unit_cd(String value) {
		setConstString(offset + 58, $trd_unit_cd, value);
	}

	/**
	 * 取引単位数量. Transaction unit qty..<p>
	 *
	 */
	public MCNumber trd_unit_qty() {
		return getConstNumber(offset + 59, $trd_unit_qty);
	}

	/**
	 * 取引単位数量. Transaction unit qty..<p>
	 *
	 */
	public void trd_unit_qty(MCNumber value) {
		setConstNumber(offset + 59, $trd_unit_qty, value);
	}
	
	/**
	 * 取引単位数量. Transaction unit qty..<p>
	 *
	 */
	public void trd_unit_qty(int value) {
		setConstNumber(offset + 59, $trd_unit_qty, value);
	}
	
	/**
	 * 取引単位数量. Transaction unit qty..<p>
	 *
	 */
	public void trd_unit_qty(long value) {
		setConstNumber(offset + 59, $trd_unit_qty, value);
	}
	
	/**
	 * 取引単位数量. Transaction unit qty..<p>
	 *
	 */
	public void trd_unit_qty(float value) {
		setConstNumber(offset + 59, $trd_unit_qty, value);
	}
	
	/**
	 * 取引単位数量. Transaction unit qty..<p>
	 *
	 */
	public void trd_unit_qty(double value) {
		setConstNumber(offset + 59, $trd_unit_qty, value);
	}
	
	/**
	 * 基準単位ＣＤ. Base unit cd..<p>
	 *
	 */
	public String base_unit_cd() {
		return getConstString(offset + 60, $base_unit_cd);
	}

	/**
	 * 基準単位ＣＤ. Base unit cd..<p>
	 *
	 */
	public void base_unit_cd(String value) {
		setConstString(offset + 60, $base_unit_cd, value);
	}

	/**
	 * 基準単位数量. Base unit qty..<p>
	 *
	 */
	public MCNumber base_unit_qty() {
		return getConstNumber(offset + 61, $base_unit_qty);
	}

	/**
	 * 基準単位数量. Base unit qty..<p>
	 *
	 */
	public void base_unit_qty(MCNumber value) {
		setConstNumber(offset + 61, $base_unit_qty, value);
	}
	
	/**
	 * 基準単位数量. Base unit qty..<p>
	 *
	 */
	public void base_unit_qty(int value) {
		setConstNumber(offset + 61, $base_unit_qty, value);
	}
	
	/**
	 * 基準単位数量. Base unit qty..<p>
	 *
	 */
	public void base_unit_qty(long value) {
		setConstNumber(offset + 61, $base_unit_qty, value);
	}
	
	/**
	 * 基準単位数量. Base unit qty..<p>
	 *
	 */
	public void base_unit_qty(float value) {
		setConstNumber(offset + 61, $base_unit_qty, value);
	}
	
	/**
	 * 基準単位数量. Base unit qty..<p>
	 *
	 */
	public void base_unit_qty(double value) {
		setConstNumber(offset + 61, $base_unit_qty, value);
	}
	
	/**
	 * 取引通貨単価. Unit price (Transaction currency).<p>
	 *
	 */
	public MCNumber trd_cur_upri() {
		return getConstNumber(offset + 62, $trd_cur_upri);
	}

	/**
	 * 取引通貨単価. Unit price (Transaction currency).<p>
	 *
	 */
	public void trd_cur_upri(MCNumber value) {
		setConstNumber(offset + 62, $trd_cur_upri, value);
	}
	
	/**
	 * 取引通貨単価. Unit price (Transaction currency).<p>
	 *
	 */
	public void trd_cur_upri(int value) {
		setConstNumber(offset + 62, $trd_cur_upri, value);
	}
	
	/**
	 * 取引通貨単価. Unit price (Transaction currency).<p>
	 *
	 */
	public void trd_cur_upri(long value) {
		setConstNumber(offset + 62, $trd_cur_upri, value);
	}
	
	/**
	 * 取引通貨単価. Unit price (Transaction currency).<p>
	 *
	 */
	public void trd_cur_upri(float value) {
		setConstNumber(offset + 62, $trd_cur_upri, value);
	}
	
	/**
	 * 取引通貨単価. Unit price (Transaction currency).<p>
	 *
	 */
	public void trd_cur_upri(double value) {
		setConstNumber(offset + 62, $trd_cur_upri, value);
	}
	
	/**
	 * 単価再取得対象外ＦＬＧ. Not to reacquire unit price flg..<p>
	 *
	 */
	public boolean upri_not_tgt_flg() {
		return getConstBoolean(offset + 63, $upri_not_tgt_flg);
	}

	/**
	 * 単価再取得対象外ＦＬＧ. Not to reacquire unit price flg..<p>
	 *
	 */
	public void upri_not_tgt_flg(boolean value) {
		setConstBoolean(offset + 63, $upri_not_tgt_flg, value);
	}

	/**
	 * 原価単価. Unit cost.<p>
	 *
	 */
	public MCNumber cost_upri() {
		return getConstNumber(offset + 64, $cost_upri);
	}

	/**
	 * 原価単価. Unit cost.<p>
	 *
	 */
	public void cost_upri(MCNumber value) {
		setConstNumber(offset + 64, $cost_upri, value);
	}
	
	/**
	 * 原価単価. Unit cost.<p>
	 *
	 */
	public void cost_upri(int value) {
		setConstNumber(offset + 64, $cost_upri, value);
	}
	
	/**
	 * 原価単価. Unit cost.<p>
	 *
	 */
	public void cost_upri(long value) {
		setConstNumber(offset + 64, $cost_upri, value);
	}
	
	/**
	 * 原価単価. Unit cost.<p>
	 *
	 */
	public void cost_upri(float value) {
		setConstNumber(offset + 64, $cost_upri, value);
	}
	
	/**
	 * 原価単価. Unit cost.<p>
	 *
	 */
	public void cost_upri(double value) {
		setConstNumber(offset + 64, $cost_upri, value);
	}
	
	/**
	 * 原価金額. Total cost.<p>
	 *
	 */
	public MCNumber cost_amt() {
		return getConstNumber(offset + 65, $cost_amt);
	}

	/**
	 * 原価金額. Total cost.<p>
	 *
	 */
	public void cost_amt(MCNumber value) {
		setConstNumber(offset + 65, $cost_amt, value);
	}
	
	/**
	 * 原価金額. Total cost.<p>
	 *
	 */
	public void cost_amt(int value) {
		setConstNumber(offset + 65, $cost_amt, value);
	}
	
	/**
	 * 原価金額. Total cost.<p>
	 *
	 */
	public void cost_amt(long value) {
		setConstNumber(offset + 65, $cost_amt, value);
	}
	
	/**
	 * 原価金額. Total cost.<p>
	 *
	 */
	public void cost_amt(float value) {
		setConstNumber(offset + 65, $cost_amt, value);
	}
	
	/**
	 * 原価金額. Total cost.<p>
	 *
	 */
	public void cost_amt(double value) {
		setConstNumber(offset + 65, $cost_amt, value);
	}
	
	/**
	 * 仮単価ＦＬＧ. Temporary unit price flg..<p>
	 *
	 */
	public boolean interim_flg() {
		return getConstBoolean(offset + 66, $interim_flg);
	}

	/**
	 * 仮単価ＦＬＧ. Temporary unit price flg..<p>
	 *
	 */
	public void interim_flg(boolean value) {
		setConstBoolean(offset + 66, $interim_flg, value);
	}

	/**
	 * 取引通貨金額. Amount (Transaction currency).<p>
	 *
	 */
	public MCNumber trd_cur_amt() {
		return getConstNumber(offset + 67, $trd_cur_amt);
	}

	/**
	 * 取引通貨金額. Amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_amt(MCNumber value) {
		setConstNumber(offset + 67, $trd_cur_amt, value);
	}
	
	/**
	 * 取引通貨金額. Amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_amt(int value) {
		setConstNumber(offset + 67, $trd_cur_amt, value);
	}
	
	/**
	 * 取引通貨金額. Amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_amt(long value) {
		setConstNumber(offset + 67, $trd_cur_amt, value);
	}
	
	/**
	 * 取引通貨金額. Amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_amt(float value) {
		setConstNumber(offset + 67, $trd_cur_amt, value);
	}
	
	/**
	 * 取引通貨金額. Amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_amt(double value) {
		setConstNumber(offset + 67, $trd_cur_amt, value);
	}
	
	/**
	 * 取引通貨値引額. Discount amount (Transaction currency).<p>
	 *
	 */
	public MCNumber trd_cur_dscnt_amt() {
		return getConstNumber(offset + 68, $trd_cur_dscnt_amt);
	}

	/**
	 * 取引通貨値引額. Discount amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_dscnt_amt(MCNumber value) {
		setConstNumber(offset + 68, $trd_cur_dscnt_amt, value);
	}
	
	/**
	 * 取引通貨値引額. Discount amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_dscnt_amt(int value) {
		setConstNumber(offset + 68, $trd_cur_dscnt_amt, value);
	}
	
	/**
	 * 取引通貨値引額. Discount amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_dscnt_amt(long value) {
		setConstNumber(offset + 68, $trd_cur_dscnt_amt, value);
	}
	
	/**
	 * 取引通貨値引額. Discount amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_dscnt_amt(float value) {
		setConstNumber(offset + 68, $trd_cur_dscnt_amt, value);
	}
	
	/**
	 * 取引通貨値引額. Discount amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_dscnt_amt(double value) {
		setConstNumber(offset + 68, $trd_cur_dscnt_amt, value);
	}
	
	/**
	 * 値引理由ＣＤ. Discount reason cd..<p>
	 *
	 */
	public String dscnt_rsn_cd() {
		return getConstString(offset + 69, $dscnt_rsn_cd);
	}

	/**
	 * 値引理由ＣＤ. Discount reason cd..<p>
	 *
	 */
	public void dscnt_rsn_cd(String value) {
		setConstString(offset + 69, $dscnt_rsn_cd, value);
	}

	/**
	 * インボイス表記単価. Unit price for invoice.<p>
	 *
	 */
	public MCNumber iv_upri() {
		return getConstNumber(offset + 70, $iv_upri);
	}

	/**
	 * インボイス表記単価. Unit price for invoice.<p>
	 *
	 */
	public void iv_upri(MCNumber value) {
		setConstNumber(offset + 70, $iv_upri, value);
	}
	
	/**
	 * インボイス表記単価. Unit price for invoice.<p>
	 *
	 */
	public void iv_upri(int value) {
		setConstNumber(offset + 70, $iv_upri, value);
	}
	
	/**
	 * インボイス表記単価. Unit price for invoice.<p>
	 *
	 */
	public void iv_upri(long value) {
		setConstNumber(offset + 70, $iv_upri, value);
	}
	
	/**
	 * インボイス表記単価. Unit price for invoice.<p>
	 *
	 */
	public void iv_upri(float value) {
		setConstNumber(offset + 70, $iv_upri, value);
	}
	
	/**
	 * インボイス表記単価. Unit price for invoice.<p>
	 *
	 */
	public void iv_upri(double value) {
		setConstNumber(offset + 70, $iv_upri, value);
	}
	
	/**
	 * インボイス表記金額. Amount for invoice.<p>
	 *
	 */
	public MCNumber iv_amt() {
		return getConstNumber(offset + 71, $iv_amt);
	}

	/**
	 * インボイス表記金額. Amount for invoice.<p>
	 *
	 */
	public void iv_amt(MCNumber value) {
		setConstNumber(offset + 71, $iv_amt, value);
	}
	
	/**
	 * インボイス表記金額. Amount for invoice.<p>
	 *
	 */
	public void iv_amt(int value) {
		setConstNumber(offset + 71, $iv_amt, value);
	}
	
	/**
	 * インボイス表記金額. Amount for invoice.<p>
	 *
	 */
	public void iv_amt(long value) {
		setConstNumber(offset + 71, $iv_amt, value);
	}
	
	/**
	 * インボイス表記金額. Amount for invoice.<p>
	 *
	 */
	public void iv_amt(float value) {
		setConstNumber(offset + 71, $iv_amt, value);
	}
	
	/**
	 * インボイス表記金額. Amount for invoice.<p>
	 *
	 */
	public void iv_amt(double value) {
		setConstNumber(offset + 71, $iv_amt, value);
	}
	
	/**
	 * 税指定ＦＬＧ. Tax specified flg..<p>
	 *
	 */
	public boolean tax_fix_flg() {
		return getConstBoolean(offset + 72, $tax_fix_flg);
	}

	/**
	 * 税指定ＦＬＧ. Tax specified flg..<p>
	 *
	 */
	public void tax_fix_flg(boolean value) {
		setConstBoolean(offset + 72, $tax_fix_flg, value);
	}

	/**
	 * 税ＣＤ. Tax cd..<p>
	 *
	 */
	public String tax_cd() {
		return getConstString(offset + 73, $tax_cd);
	}

	/**
	 * 税ＣＤ. Tax cd..<p>
	 *
	 */
	public void tax_cd(String value) {
		setConstString(offset + 73, $tax_cd, value);
	}

	/**
	 * 取引通貨税額. Tax amount (Transaction currency).<p>
	 *
	 */
	public MCNumber trd_cur_tax_amt() {
		return getConstNumber(offset + 74, $trd_cur_tax_amt);
	}

	/**
	 * 取引通貨税額. Tax amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_tax_amt(MCNumber value) {
		setConstNumber(offset + 74, $trd_cur_tax_amt, value);
	}
	
	/**
	 * 取引通貨税額. Tax amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_tax_amt(int value) {
		setConstNumber(offset + 74, $trd_cur_tax_amt, value);
	}
	
	/**
	 * 取引通貨税額. Tax amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_tax_amt(long value) {
		setConstNumber(offset + 74, $trd_cur_tax_amt, value);
	}
	
	/**
	 * 取引通貨税額. Tax amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_tax_amt(float value) {
		setConstNumber(offset + 74, $trd_cur_tax_amt, value);
	}
	
	/**
	 * 取引通貨税額. Tax amount (Transaction currency).<p>
	 *
	 */
	public void trd_cur_tax_amt(double value) {
		setConstNumber(offset + 74, $trd_cur_tax_amt, value);
	}
	
	/**
	 * 手配区分. Procurement type.<p>
	 *
	 */
	public String proc_typ() {
		return getConstString(offset + 75, $proc_typ);
	}

	/**
	 * 手配区分. Procurement type.<p>
	 *
	 */
	public void proc_typ(String value) {
		setConstString(offset + 75, $proc_typ, value);
	}

	/**
	 * 販売単価取得区分. Sales unit price acquisition type.<p>
	 *
	 */
	public String sls_upri_req_typ() {
		return getConstString(offset + 76, $sls_upri_req_typ);
	}

	/**
	 * 販売単価取得区分. Sales unit price acquisition type.<p>
	 *
	 */
	public void sls_upri_req_typ(String value) {
		setConstString(offset + 76, $sls_upri_req_typ, value);
	}

	/**
	 * 品揃グループＮＯ. Assortment group No..<p>
	 *
	 */
	public MCNumber set_itm_grp_no() {
		return getConstNumber(offset + 77, $set_itm_grp_no);
	}

	/**
	 * 品揃グループＮＯ. Assortment group No..<p>
	 *
	 */
	public void set_itm_grp_no(MCNumber value) {
		setConstNumber(offset + 77, $set_itm_grp_no, value);
	}
	
	/**
	 * 品揃グループＮＯ. Assortment group No..<p>
	 *
	 */
	public void set_itm_grp_no(int value) {
		setConstNumber(offset + 77, $set_itm_grp_no, value);
	}
	
	/**
	 * 品揃グループＮＯ. Assortment group No..<p>
	 *
	 */
	public void set_itm_grp_no(long value) {
		setConstNumber(offset + 77, $set_itm_grp_no, value);
	}
	
	/**
	 * 品揃グループＮＯ. Assortment group No..<p>
	 *
	 */
	public void set_itm_grp_no(float value) {
		setConstNumber(offset + 77, $set_itm_grp_no, value);
	}
	
	/**
	 * 品揃グループＮＯ. Assortment group No..<p>
	 *
	 */
	public void set_itm_grp_no(double value) {
		setConstNumber(offset + 77, $set_itm_grp_no, value);
	}
	
	/**
	 * 出荷希望日時. Desired shipping date and time.<p>
	 *
	 */
	public MCDate ship_rqst_tm() {
		return getConstDate(offset + 78, $ship_rqst_tm);
	}

	/**
	 * 出荷希望日時. Desired shipping date and time.<p>
	 *
	 */
	public void ship_rqst_tm(MCDate value) {
		setConstDate(offset + 78, $ship_rqst_tm, value);
	}

	/**
	 * 納入希望日時. Desired delivery date and time.<p>
	 *
	 */
	public MCDate dlv_rqst_tm() {
		return getConstDate(offset + 79, $dlv_rqst_tm);
	}

	/**
	 * 納入希望日時. Desired delivery date and time.<p>
	 *
	 */
	public void dlv_rqst_tm(MCDate value) {
		setConstDate(offset + 79, $dlv_rqst_tm, value);
	}

	/**
	 * 売上予定日. Scheduled sales date.<p>
	 *
	 */
	public MCDate sls_schd_dt() {
		return getConstDate(offset + 80, $sls_schd_dt);
	}

	/**
	 * 売上予定日. Scheduled sales date.<p>
	 *
	 */
	public void sls_schd_dt(MCDate value) {
		setConstDate(offset + 80, $sls_schd_dt, value);
	}

	/**
	 * 検収予定日. Scheduled acceptance date.<p>
	 *
	 */
	public MCDate accpt_schd_dt() {
		return getConstDate(offset + 81, $accpt_schd_dt);
	}

	/**
	 * 検収予定日. Scheduled acceptance date.<p>
	 *
	 */
	public void accpt_schd_dt(MCDate value) {
		setConstDate(offset + 81, $accpt_schd_dt, value);
	}

	/**
	 * 納期回答ＦＬＧ. Order promising flg..<p>
	 *
	 */
	public boolean prms_flg() {
		return getConstBoolean(offset + 82, $prms_flg);
	}

	/**
	 * 納期回答ＦＬＧ. Order promising flg..<p>
	 *
	 */
	public void prms_flg(boolean value) {
		setConstBoolean(offset + 82, $prms_flg, value);
	}

	/**
	 * 依頼先場所ＣＤ. Requested location cd..<p>
	 *
	 */
	public String rqst_to_loc_cd() {
		return getConstString(offset + 83, $rqst_to_loc_cd);
	}

	/**
	 * 依頼先場所ＣＤ. Requested location cd..<p>
	 *
	 */
	public void rqst_to_loc_cd(String value) {
		setConstString(offset + 83, $rqst_to_loc_cd, value);
	}

	/**
	 * 発注先ＣＤ. Supplier cd..<p>
	 *
	 */
	public String sppl_cd() {
		return getConstString(offset + 84, $sppl_cd);
	}

	/**
	 * 発注先ＣＤ. Supplier cd..<p>
	 *
	 */
	public void sppl_cd(String value) {
		setConstString(offset + 84, $sppl_cd, value);
	}

	/**
	 * メーカＣＤ. Maker cd..<p>
	 *
	 */
	public String maker_cd() {
		return getConstString(offset + 85, $maker_cd);
	}

	/**
	 * メーカＣＤ. Maker cd..<p>
	 *
	 */
	public void maker_cd(String value) {
		setConstString(offset + 85, $maker_cd, value);
	}

	/**
	 * 引当範囲区分. Allocation range type.<p>
	 *
	 */
	public String alloc_scope_typ() {
		return getConstString(offset + 86, $alloc_scope_typ);
	}

	/**
	 * 引当範囲区分. Allocation range type.<p>
	 *
	 */
	public void alloc_scope_typ(String value) {
		setConstString(offset + 86, $alloc_scope_typ, value);
	}

	/**
	 * 引当区分. Allocation type.<p>
	 *
	 */
	public String alloc_typ() {
		return getConstString(offset + 87, $alloc_typ);
	}

	/**
	 * 引当区分. Allocation type.<p>
	 *
	 */
	public void alloc_typ(String value) {
		setConstString(offset + 87, $alloc_typ, value);
	}

	/**
	 * 総量引当場所グループＣＤ. Gross allocation location group cd..<p>
	 *
	 */
	public String alloc_grp_cd() {
		return getConstString(offset + 88, $alloc_grp_cd);
	}

	/**
	 * 総量引当場所グループＣＤ. Gross allocation location group cd..<p>
	 *
	 */
	public void alloc_grp_cd(String value) {
		setConstString(offset + 88, $alloc_grp_cd, value);
	}

	/**
	 * 出荷物流グループＣＤ. Shipping distribution group cd..<p>
	 *
	 */
	public String ship_lg_grp_cd() {
		return getConstString(offset + 89, $ship_lg_grp_cd);
	}

	/**
	 * 出荷物流グループＣＤ. Shipping distribution group cd..<p>
	 *
	 */
	public void ship_lg_grp_cd(String value) {
		setConstString(offset + 89, $ship_lg_grp_cd, value);
	}

	/**
	 * デフォルト場所ＣＤ. Default location cd..<p>
	 *
	 */
	public String def_loc_cd() {
		return getConstString(offset + 90, $def_loc_cd);
	}

	/**
	 * デフォルト場所ＣＤ. Default location cd..<p>
	 *
	 */
	public void def_loc_cd(String value) {
		setConstString(offset + 90, $def_loc_cd, value);
	}

	/**
	 * 場所ＣＤ. Location cd..<p>
	 *
	 */
	public String loc_cd() {
		return getConstString(offset + 91, $loc_cd);
	}

	/**
	 * 場所ＣＤ. Location cd..<p>
	 *
	 */
	public void loc_cd(String value) {
		setConstString(offset + 91, $loc_cd, value);
	}

	/**
	 * 棚・ラインＣＤ. Rack/Line cd..<p>
	 *
	 */
	public String str_ln_cd() {
		return getConstString(offset + 92, $str_ln_cd);
	}

	/**
	 * 棚・ラインＣＤ. Rack/Line cd..<p>
	 *
	 */
	public void str_ln_cd(String value) {
		setConstString(offset + 92, $str_ln_cd, value);
	}

	/**
	 * ロットＮＯ. Lot No..<p>
	 *
	 */
	public String lot_no() {
		return getConstString(offset + 93, $lot_no);
	}

	/**
	 * ロットＮＯ. Lot No..<p>
	 *
	 */
	public void lot_no(String value) {
		setConstString(offset + 93, $lot_no, value);
	}

	/**
	 * サブロットＮＯ. Sublot No..<p>
	 *
	 */
	public String sublot_no() {
		return getConstString(offset + 94, $sublot_no);
	}

	/**
	 * サブロットＮＯ. Sublot No..<p>
	 *
	 */
	public void sublot_no(String value) {
		setConstString(offset + 94, $sublot_no, value);
	}

	/**
	 * 貸出ＦＬＧ. Consignment flg..<p>
	 *
	 */
	public boolean vmi_flg() {
		return getConstBoolean(offset + 95, $vmi_flg);
	}

	/**
	 * 貸出ＦＬＧ. Consignment flg..<p>
	 *
	 */
	public void vmi_flg(boolean value) {
		setConstBoolean(offset + 95, $vmi_flg, value);
	}

	/**
	 * 源泉税率. Withholding tax rate.<p>
	 *
	 */
	public MCNumber wtax_rate() {
		return getConstNumber(offset + 96, $wtax_rate);
	}

	/**
	 * 源泉税率. Withholding tax rate.<p>
	 *
	 */
	public void wtax_rate(MCNumber value) {
		setConstNumber(offset + 96, $wtax_rate, value);
	}
	
	/**
	 * 源泉税率. Withholding tax rate.<p>
	 *
	 */
	public void wtax_rate(int value) {
		setConstNumber(offset + 96, $wtax_rate, value);
	}
	
	/**
	 * 源泉税率. Withholding tax rate.<p>
	 *
	 */
	public void wtax_rate(long value) {
		setConstNumber(offset + 96, $wtax_rate, value);
	}
	
	/**
	 * 源泉税率. Withholding tax rate.<p>
	 *
	 */
	public void wtax_rate(float value) {
		setConstNumber(offset + 96, $wtax_rate, value);
	}
	
	/**
	 * 源泉税率. Withholding tax rate.<p>
	 *
	 */
	public void wtax_rate(double value) {
		setConstNumber(offset + 96, $wtax_rate, value);
	}
	
	/**
	 * 源泉税額. Withholding tax.<p>
	 *
	 */
	public MCNumber wtax_amt() {
		return getConstNumber(offset + 97, $wtax_amt);
	}

	/**
	 * 源泉税額. Withholding tax.<p>
	 *
	 */
	public void wtax_amt(MCNumber value) {
		setConstNumber(offset + 97, $wtax_amt, value);
	}
	
	/**
	 * 源泉税額. Withholding tax.<p>
	 *
	 */
	public void wtax_amt(int value) {
		setConstNumber(offset + 97, $wtax_amt, value);
	}
	
	/**
	 * 源泉税額. Withholding tax.<p>
	 *
	 */
	public void wtax_amt(long value) {
		setConstNumber(offset + 97, $wtax_amt, value);
	}
	
	/**
	 * 源泉税額. Withholding tax.<p>
	 *
	 */
	public void wtax_amt(float value) {
		setConstNumber(offset + 97, $wtax_amt, value);
	}
	
	/**
	 * 源泉税額. Withholding tax.<p>
	 *
	 */
	public void wtax_amt(double value) {
		setConstNumber(offset + 97, $wtax_amt, value);
	}
	
	/**
	 * 依頼連絡備考. Request contact remarks.<p>
	 *
	 */
	public String wg_rqst_cnt_rmrks() {
		return getConstString(offset + 98, $wg_rqst_cnt_rmrks);
	}

	/**
	 * 依頼連絡備考. Request contact remarks.<p>
	 *
	 */
	public void wg_rqst_cnt_rmrks(String value) {
		setConstString(offset + 98, $wg_rqst_cnt_rmrks, value);
	}

	/**
	 * 出荷条件ＣＤ. Shipping conditions cd..<p>
	 *
	 */
	public String ship_term_cd() {
		return getConstString(offset + 99, $ship_term_cd);
	}

	/**
	 * 出荷条件ＣＤ. Shipping conditions cd..<p>
	 *
	 */
	public void ship_term_cd(String value) {
		setConstString(offset + 99, $ship_term_cd, value);
	}

	/**
	 * 請求繰越回数. Billing carry-over count.<p>
	 *
	 */
	public MCNumber bill_crryovr_times() {
		return getConstNumber(offset + 100, $bill_crryovr_times);
	}

	/**
	 * 請求繰越回数. Billing carry-over count.<p>
	 *
	 */
	public void bill_crryovr_times(MCNumber value) {
		setConstNumber(offset + 100, $bill_crryovr_times, value);
	}
	
	/**
	 * 請求繰越回数. Billing carry-over count.<p>
	 *
	 */
	public void bill_crryovr_times(int value) {
		setConstNumber(offset + 100, $bill_crryovr_times, value);
	}
	
	/**
	 * 請求繰越回数. Billing carry-over count.<p>
	 *
	 */
	public void bill_crryovr_times(long value) {
		setConstNumber(offset + 100, $bill_crryovr_times, value);
	}
	
	/**
	 * 請求繰越回数. Billing carry-over count.<p>
	 *
	 */
	public void bill_crryovr_times(float value) {
		setConstNumber(offset + 100, $bill_crryovr_times, value);
	}
	
	/**
	 * 請求繰越回数. Billing carry-over count.<p>
	 *
	 */
	public void bill_crryovr_times(double value) {
		setConstNumber(offset + 100, $bill_crryovr_times, value);
	}
	
	/**
	 * 得意先注文明細ＮＯ. Customer order details No..<p>
	 *
	 */
	public String cst_po_d_no() {
		return getConstString(offset + 101, $cst_po_d_no);
	}

	/**
	 * 得意先注文明細ＮＯ. Customer order details No..<p>
	 *
	 */
	public void cst_po_d_no(String value) {
		setConstString(offset + 101, $cst_po_d_no, value);
	}

	/**
	 * 得意先品目ＣＤ. Customer item cd..<p>
	 *
	 */
	public String cst_itm_cd() {
		return getConstString(offset + 102, $cst_itm_cd);
	}

	/**
	 * 得意先品目ＣＤ. Customer item cd..<p>
	 *
	 */
	public void cst_itm_cd(String value) {
		setConstString(offset + 102, $cst_itm_cd, value);
	}

	/**
	 * 得意先品名. Customer item name.<p>
	 *
	 */
	public String cst_itm_nm() {
		return getConstString(offset + 103, $cst_itm_nm);
	}

	/**
	 * 得意先品名. Customer item name.<p>
	 *
	 */
	public void cst_itm_nm(String value) {
		setConstString(offset + 103, $cst_itm_nm, value);
	}

	/**
	 * 得意先注文明細備考. Customer order details remarks.<p>
	 *
	 */
	public String cst_po_d_rmrks() {
		return getConstString(offset + 104, $cst_po_d_rmrks);
	}

	/**
	 * 得意先注文明細備考. Customer order details remarks.<p>
	 *
	 */
	public void cst_po_d_rmrks(String value) {
		setConstString(offset + 104, $cst_po_d_rmrks, value);
	}

	/**
	 * 売上理由ＣＤ. Sales reason cd..<p>
	 *
	 */
	public String sls_rsn_cd() {
		return getConstString(offset + 105, $sls_rsn_cd);
	}

	/**
	 * 売上理由ＣＤ. Sales reason cd..<p>
	 *
	 */
	public void sls_rsn_cd(String value) {
		setConstString(offset + 105, $sls_rsn_cd, value);
	}

	/**
	 * 負担部門ＣＤ. Charged dept. cd..<p>
	 *
	 */
	public String bd_dpt_cd() {
		return getConstString(offset + 106, $bd_dpt_cd);
	}

	/**
	 * 負担部門ＣＤ. Charged dept. cd..<p>
	 *
	 */
	public void bd_dpt_cd(String value) {
		setConstString(offset + 106, $bd_dpt_cd, value);
	}

	/**
	 * 依頼日. Request date.<p>
	 *
	 */
	public MCDate rqst_dt() {
		return getConstDate(offset + 107, $rqst_dt);
	}

	/**
	 * 依頼日. Request date.<p>
	 *
	 */
	public void rqst_dt(MCDate value) {
		setConstDate(offset + 107, $rqst_dt, value);
	}

	/**
	 * 依頼納入希望日. Request desired delivery date.<p>
	 *
	 */
	public MCDate rqst_dlv_rqst_dt() {
		return getConstDate(offset + 108, $rqst_dlv_rqst_dt);
	}

	/**
	 * 依頼納入希望日. Request desired delivery date.<p>
	 *
	 */
	public void rqst_dlv_rqst_dt(MCDate value) {
		setConstDate(offset + 108, $rqst_dlv_rqst_dt, value);
	}

	/**
	 * 依頼回答日. Request replied date.<p>
	 *
	 */
	public MCDate rqst_prms_dt() {
		return getConstDate(offset + 109, $rqst_prms_dt);
	}

	/**
	 * 依頼回答日. Request replied date.<p>
	 *
	 */
	public void rqst_prms_dt(MCDate value) {
		setConstDate(offset + 109, $rqst_prms_dt, value);
	}

	/**
	 * 依頼回答納入日. Request replied delivery date.<p>
	 *
	 */
	public MCDate rqst_prms_dlv_dt() {
		return getConstDate(offset + 110, $rqst_prms_dlv_dt);
	}

	/**
	 * 依頼回答納入日. Request replied delivery date.<p>
	 *
	 */
	public void rqst_prms_dlv_dt(MCDate value) {
		setConstDate(offset + 110, $rqst_prms_dlv_dt, value);
	}

	/**
	 * 依頼単位ＣＤ. Request unit cd..<p>
	 *
	 */
	public String rqst_unit_cd() {
		return getConstString(offset + 111, $rqst_unit_cd);
	}

	/**
	 * 依頼単位ＣＤ. Request unit cd..<p>
	 *
	 */
	public void rqst_unit_cd(String value) {
		setConstString(offset + 111, $rqst_unit_cd, value);
	}

	/**
	 * 依頼数量. Request qty..<p>
	 *
	 */
	public MCNumber rqst_qty() {
		return getConstNumber(offset + 112, $rqst_qty);
	}

	/**
	 * 依頼数量. Request qty..<p>
	 *
	 */
	public void rqst_qty(MCNumber value) {
		setConstNumber(offset + 112, $rqst_qty, value);
	}
	
	/**
	 * 依頼数量. Request qty..<p>
	 *
	 */
	public void rqst_qty(int value) {
		setConstNumber(offset + 112, $rqst_qty, value);
	}
	
	/**
	 * 依頼数量. Request qty..<p>
	 *
	 */
	public void rqst_qty(long value) {
		setConstNumber(offset + 112, $rqst_qty, value);
	}
	
	/**
	 * 依頼数量. Request qty..<p>
	 *
	 */
	public void rqst_qty(float value) {
		setConstNumber(offset + 112, $rqst_qty, value);
	}
	
	/**
	 * 依頼数量. Request qty..<p>
	 *
	 */
	public void rqst_qty(double value) {
		setConstNumber(offset + 112, $rqst_qty, value);
	}
	
	/**
	 * 受注集計基準日. Sales order aggregated base date.<p>
	 *
	 */
	public MCDate slo_sum_base_dt() {
		return getConstDate(offset + 113, $slo_sum_base_dt);
	}

	/**
	 * 受注集計基準日. Sales order aggregated base date.<p>
	 *
	 */
	public void slo_sum_base_dt(MCDate value) {
		setConstDate(offset + 113, $slo_sum_base_dt, value);
	}

	/**
	 * 見積ＮＯ. Quotation No..<p>
	 *
	 */
	public String qtn_no() {
		return getConstString(offset + 114, $qtn_no);
	}

	/**
	 * 見積ＮＯ. Quotation No..<p>
	 *
	 */
	public void qtn_no(String value) {
		setConstString(offset + 114, $qtn_no, value);
	}

	/**
	 * 見積改訂番号. Quotation rev. number.<p>
	 *
	 */
	public MCNumber qtn_rev() {
		return getConstNumber(offset + 115, $qtn_rev);
	}

	/**
	 * 見積改訂番号. Quotation rev. number.<p>
	 *
	 */
	public void qtn_rev(MCNumber value) {
		setConstNumber(offset + 115, $qtn_rev, value);
	}
	
	/**
	 * 見積改訂番号. Quotation rev. number.<p>
	 *
	 */
	public void qtn_rev(int value) {
		setConstNumber(offset + 115, $qtn_rev, value);
	}
	
	/**
	 * 見積改訂番号. Quotation rev. number.<p>
	 *
	 */
	public void qtn_rev(long value) {
		setConstNumber(offset + 115, $qtn_rev, value);
	}
	
	/**
	 * 見積改訂番号. Quotation rev. number.<p>
	 *
	 */
	public void qtn_rev(float value) {
		setConstNumber(offset + 115, $qtn_rev, value);
	}
	
	/**
	 * 見積改訂番号. Quotation rev. number.<p>
	 *
	 */
	public void qtn_rev(double value) {
		setConstNumber(offset + 115, $qtn_rev, value);
	}
	
	/**
	 * 見積明細ＮＯ. Quotation details No..<p>
	 *
	 */
	public String qtn_d_no() {
		return getConstString(offset + 116, $qtn_d_no);
	}

	/**
	 * 見積明細ＮＯ. Quotation details No..<p>
	 *
	 */
	public void qtn_d_no(String value) {
		setConstString(offset + 116, $qtn_d_no, value);
	}

	/**
	 * 出荷連絡備考. Shipping notification remarks.<p>
	 *
	 */
	public String ship_cnt_rmrks() {
		return getConstString(offset + 117, $ship_cnt_rmrks);
	}

	/**
	 * 出荷連絡備考. Shipping notification remarks.<p>
	 *
	 */
	public void ship_cnt_rmrks(String value) {
		setConstString(offset + 117, $ship_cnt_rmrks, value);
	}

	/**
	 * 取引明細備考. Transaction details remarks.<p>
	 *
	 */
	public String trd_d_rmrks() {
		return getConstString(offset + 118, $trd_d_rmrks);
	}

	/**
	 * 取引明細備考. Transaction details remarks.<p>
	 *
	 */
	public void trd_d_rmrks(String value) {
		setConstString(offset + 118, $trd_d_rmrks, value);
	}

	/**
	 * 内部備考. Internal remarks.<p>
	 *
	 */
	public String intr_rmrks() {
		return getConstString(offset + 119, $intr_rmrks);
	}

	/**
	 * 内部備考. Internal remarks.<p>
	 *
	 */
	public void intr_rmrks(String value) {
		setConstString(offset + 119, $intr_rmrks, value);
	}

	/**
	 * 受払進捗管理ＮＯ. GR/GI progress management No..<p>
	 *
	 */
	public String io_schd_pr_no() {
		return getConstString(offset + 120, $io_schd_pr_no);
	}

	/**
	 * 受払進捗管理ＮＯ. GR/GI progress management No..<p>
	 *
	 */
	public void io_schd_pr_no(String value) {
		setConstString(offset + 120, $io_schd_pr_no, value);
	}

	/**
	 * 予備１. Spare 1.<p>
	 *
	 */
	public String sub_char1() {
		return getConstString(offset + 121, $sub_char1);
	}

	/**
	 * 予備１. Spare 1.<p>
	 *
	 */
	public void sub_char1(String value) {
		setConstString(offset + 121, $sub_char1, value);
	}

	/**
	 * 予備２. Spare 2.<p>
	 *
	 */
	public String sub_char2() {
		return getConstString(offset + 122, $sub_char2);
	}

	/**
	 * 予備２. Spare 2.<p>
	 *
	 */
	public void sub_char2(String value) {
		setConstString(offset + 122, $sub_char2, value);
	}

	/**
	 * 予備３. Spare 3.<p>
	 *
	 */
	public String sub_char3() {
		return getConstString(offset + 123, $sub_char3);
	}

	/**
	 * 予備３. Spare 3.<p>
	 *
	 */
	public void sub_char3(String value) {
		setConstString(offset + 123, $sub_char3, value);
	}

	/**
	 * 構成表連番. Configuration table sequence number.<p>
	 *
	 */
	public MCNumber itm_comp_seq() {
		return getConstNumber(offset + 124, $itm_comp_seq);
	}

	/**
	 * 構成表連番. Configuration table sequence number.<p>
	 *
	 */
	public void itm_comp_seq(MCNumber value) {
		setConstNumber(offset + 124, $itm_comp_seq, value);
	}
	
	/**
	 * 構成表連番. Configuration table sequence number.<p>
	 *
	 */
	public void itm_comp_seq(int value) {
		setConstNumber(offset + 124, $itm_comp_seq, value);
	}
	
	/**
	 * 構成表連番. Configuration table sequence number.<p>
	 *
	 */
	public void itm_comp_seq(long value) {
		setConstNumber(offset + 124, $itm_comp_seq, value);
	}
	
	/**
	 * 構成表連番. Configuration table sequence number.<p>
	 *
	 */
	public void itm_comp_seq(float value) {
		setConstNumber(offset + 124, $itm_comp_seq, value);
	}
	
	/**
	 * 構成表連番. Configuration table sequence number.<p>
	 *
	 */
	public void itm_comp_seq(double value) {
		setConstNumber(offset + 124, $itm_comp_seq, value);
	}
	
	/**
	 * 仕様表連番. Specification table sequence number.<p>
	 *
	 */
	public MCNumber itm_spec_seq() {
		return getConstNumber(offset + 125, $itm_spec_seq);
	}

	/**
	 * 仕様表連番. Specification table sequence number.<p>
	 *
	 */
	public void itm_spec_seq(MCNumber value) {
		setConstNumber(offset + 125, $itm_spec_seq, value);
	}
	
	/**
	 * 仕様表連番. Specification table sequence number.<p>
	 *
	 */
	public void itm_spec_seq(int value) {
		setConstNumber(offset + 125, $itm_spec_seq, value);
	}
	
	/**
	 * 仕様表連番. Specification table sequence number.<p>
	 *
	 */
	public void itm_spec_seq(long value) {
		setConstNumber(offset + 125, $itm_spec_seq, value);
	}
	
	/**
	 * 仕様表連番. Specification table sequence number.<p>
	 *
	 */
	public void itm_spec_seq(float value) {
		setConstNumber(offset + 125, $itm_spec_seq, value);
	}
	
	/**
	 * 仕様表連番. Specification table sequence number.<p>
	 *
	 */
	public void itm_spec_seq(double value) {
		setConstNumber(offset + 125, $itm_spec_seq, value);
	}
	
	/**
	 * 打切ＦＬＧ. Cancel remaining flg..<p>
	 *
	 */
	public boolean abort_flg() {
		return getConstBoolean(offset + 126, $abort_flg);
	}

	/**
	 * 打切ＦＬＧ. Cancel remaining flg..<p>
	 *
	 */
	public void abort_flg(boolean value) {
		setConstBoolean(offset + 126, $abort_flg, value);
	}

	/**
	 * 取消ＦＬＧ. Cancel flg..<p>
	 *
	 */
	public boolean can_flg() {
		return getConstBoolean(offset + 127, $can_flg);
	}

	/**
	 * 取消ＦＬＧ. Cancel flg..<p>
	 *
	 */
	public void can_flg(boolean value) {
		setConstBoolean(offset + 127, $can_flg, value);
	}

	/**
	 * 取消理由ＣＤ. Canceling reason cd..<p>
	 *
	 */
	public String can_rsn_cd() {
		return getConstString(offset + 128, $can_rsn_cd);
	}

	/**
	 * 取消理由ＣＤ. Canceling reason cd..<p>
	 *
	 */
	public void can_rsn_cd(String value) {
		setConstString(offset + 128, $can_rsn_cd, value);
	}

	/**
	 * 明細取消備考. Details cancel remarks.<p>
	 *
	 */
	public String slo_d_can_rmkrs() {
		return getConstString(offset + 129, $slo_d_can_rmkrs);
	}

	/**
	 * 明細取消備考. Details cancel remarks.<p>
	 *
	 */
	public void slo_d_can_rmkrs(String value) {
		setConstString(offset + 129, $slo_d_can_rmkrs, value);
	}

	/**
	 * ＥＤＩ明細予備ＣＨＡＲ項目１. EDI details spare CHAR column 1.<p>
	 *
	 */
	public String edi_sub_d_char1() {
		return getConstString(offset + 130, $edi_sub_d_char1);
	}

	/**
	 * ＥＤＩ明細予備ＣＨＡＲ項目１. EDI details spare CHAR column 1.<p>
	 *
	 */
	public void edi_sub_d_char1(String value) {
		setConstString(offset + 130, $edi_sub_d_char1, value);
	}

	/**
	 * ＥＤＩ明細予備ＣＨＡＲ項目２. EDI details spare CHAR column 2.<p>
	 *
	 */
	public String edi_sub_d_char2() {
		return getConstString(offset + 131, $edi_sub_d_char2);
	}

	/**
	 * ＥＤＩ明細予備ＣＨＡＲ項目２. EDI details spare CHAR column 2.<p>
	 *
	 */
	public void edi_sub_d_char2(String value) {
		setConstString(offset + 131, $edi_sub_d_char2, value);
	}

	/**
	 * ＥＤＩ明細予備ＣＨＡＲ項目３. EDI details spare CHAR column 3.<p>
	 *
	 */
	public String edi_sub_d_char3() {
		return getConstString(offset + 132, $edi_sub_d_char3);
	}

	/**
	 * ＥＤＩ明細予備ＣＨＡＲ項目３. EDI details spare CHAR column 3.<p>
	 *
	 */
	public void edi_sub_d_char3(String value) {
		setConstString(offset + 132, $edi_sub_d_char3, value);
	}

	/**
	 * ＥＤＩ明細予備ＣＨＡＲ項目４. EDI details spare CHAR column 4.<p>
	 *
	 */
	public String edi_sub_d_char4() {
		return getConstString(offset + 133, $edi_sub_d_char4);
	}

	/**
	 * ＥＤＩ明細予備ＣＨＡＲ項目４. EDI details spare CHAR column 4.<p>
	 *
	 */
	public void edi_sub_d_char4(String value) {
		setConstString(offset + 133, $edi_sub_d_char4, value);
	}

	/**
	 * ＥＤＩ明細予備ＣＨＡＲ項目５. EDI details spare CHAR column 5.<p>
	 *
	 */
	public String edi_sub_d_char5() {
		return getConstString(offset + 134, $edi_sub_d_char5);
	}

	/**
	 * ＥＤＩ明細予備ＣＨＡＲ項目５. EDI details spare CHAR column 5.<p>
	 *
	 */
	public void edi_sub_d_char5(String value) {
		setConstString(offset + 134, $edi_sub_d_char5, value);
	}

	/**
	 * ＥＤＩ明細予備ＮＵＭ項目１. EDI details spare NUM column 1.<p>
	 *
	 */
	public MCNumber edi_sub_d_num1() {
		return getConstNumber(offset + 135, $edi_sub_d_num1);
	}

	/**
	 * ＥＤＩ明細予備ＮＵＭ項目１. EDI details spare NUM column 1.<p>
	 *
	 */
	public void edi_sub_d_num1(MCNumber value) {
		setConstNumber(offset + 135, $edi_sub_d_num1, value);
	}
	
	/**
	 * ＥＤＩ明細予備ＮＵＭ項目１. EDI details spare NUM column 1.<p>
	 *
	 */
	public void edi_sub_d_num1(int value) {
		setConstNumber(offset + 135, $edi_sub_d_num1, value);
	}
	
	/**
	 * ＥＤＩ明細予備ＮＵＭ項目１. EDI details spare NUM column 1.<p>
	 *
	 */
	public void edi_sub_d_num1(long value) {
		setConstNumber(offset + 135, $edi_sub_d_num1, value);
	}
	
	/**
	 * ＥＤＩ明細予備ＮＵＭ項目１. EDI details spare NUM column 1.<p>
	 *
	 */
	public void edi_sub_d_num1(float value) {
		setConstNumber(offset + 135, $edi_sub_d_num1, value);
	}
	
	/**
	 * ＥＤＩ明細予備ＮＵＭ項目１. EDI details spare NUM column 1.<p>
	 *
	 */
	public void edi_sub_d_num1(double value) {
		setConstNumber(offset + 135, $edi_sub_d_num1, value);
	}
	
	/**
	 * ＥＤＩ明細予備ＤＡＴＥ項目１. EDI details spare DATE column 1.<p>
	 *
	 */
	public MCDate edi_sub_d_dt1() {
		return getConstDate(offset + 136, $edi_sub_d_dt1);
	}

	/**
	 * ＥＤＩ明細予備ＤＡＴＥ項目１. EDI details spare DATE column 1.<p>
	 *
	 */
	public void edi_sub_d_dt1(MCDate value) {
		setConstDate(offset + 136, $edi_sub_d_dt1, value);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public String ins_usr_id() {
		return getConstString(offset + 137, $ins_usr_id);
	}

	/**
	 * 登録ユーザＩＤ. Entry user ID.<p>
	 *
	 */
	public void ins_usr_id(String value) {
		setConstString(offset + 137, $ins_usr_id, value);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public String ins_usr_nm() {
		return getConstString(offset + 138, $ins_usr_nm);
	}

	/**
	 * 登録ユーザ名. Entry user name.<p>
	 *
	 */
	public void ins_usr_nm(String value) {
		setConstString(offset + 138, $ins_usr_nm, value);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public MCTimestamp ins_ts() {
		return getConstTimestamp(offset + 139, $ins_ts);
	}

	/**
	 * 登録日時. Entry date and time.<p>
	 *
	 */
	public void ins_ts(MCTimestamp value) {
		setConstTimestamp(offset + 139, $ins_ts, value);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public String ins_func_id() {
		return getConstString(offset + 140, $ins_func_id);
	}

	/**
	 * 登録機能ＩＤ. Entry function ID.<p>
	 *
	 */
	public void ins_func_id(String value) {
		setConstString(offset + 140, $ins_func_id, value);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public MCNumber upd_cntr() {
		return getConstNumber(offset + 141, $upd_cntr);
	}

	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(MCNumber value) {
		setConstNumber(offset + 141, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(int value) {
		setConstNumber(offset + 141, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(long value) {
		setConstNumber(offset + 141, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(float value) {
		setConstNumber(offset + 141, $upd_cntr, value);
	}
	
	/**
	 * 更新カウンタ. Update counter.<p>
	 *
	 */
	public void upd_cntr(double value) {
		setConstNumber(offset + 141, $upd_cntr, value);
	}
	
	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public String upd_usr_id() {
		return getConstString(offset + 142, $upd_usr_id);
	}

	/**
	 * 更新ユーザＩＤ. Update user ID.<p>
	 *
	 */
	public void upd_usr_id(String value) {
		setConstString(offset + 142, $upd_usr_id, value);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public String upd_usr_nm() {
		return getConstString(offset + 143, $upd_usr_nm);
	}

	/**
	 * 更新ユーザ名. Update user name.<p>
	 *
	 */
	public void upd_usr_nm(String value) {
		setConstString(offset + 143, $upd_usr_nm, value);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public MCTimestamp upd_ts() {
		return getConstTimestamp(offset + 144, $upd_ts);
	}

	/**
	 * 更新日時. Update date and time.<p>
	 *
	 */
	public void upd_ts(MCTimestamp value) {
		setConstTimestamp(offset + 144, $upd_ts, value);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public String upd_func_id() {
		return getConstString(offset + 145, $upd_func_id);
	}

	/**
	 * 更新機能ＩＤ. Update function ID.<p>
	 *
	 */
	public void upd_func_id(String value) {
		setConstString(offset + 145, $upd_func_id, value);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public String upd_srv_req_no() {
		return getConstString(offset + 146, $upd_srv_req_no);
	}

	/**
	 * 更新リクエストＮＯ. Update request No..<p>
	 *
	 */
	public void upd_srv_req_no(String value) {
		setConstString(offset + 146, $upd_srv_req_no, value);
	}

	/**
	 * 物流グループ混在不可ＦＬＧ. Prohibit mixed distribution group flg..<p>
	 *
	 */
	public boolean not_lg_mix_flg() {
		return getConstBoolean(offset + 147, $not_lg_mix_flg);
	}

	/**
	 * 物流グループ混在不可ＦＬＧ. Prohibit mixed distribution group flg..<p>
	 *
	 */
	public void not_lg_mix_flg(boolean value) {
		setConstBoolean(offset + 147, $not_lg_mix_flg, value);
	}

	/**
	 * ロット混在不可ＦＬＧ. Prohibit mixed lots flg..<p>
	 *
	 */
	public boolean not_lot_mix_flg() {
		return getConstBoolean(offset + 148, $not_lot_mix_flg);
	}

	/**
	 * ロット混在不可ＦＬＧ. Prohibit mixed lots flg..<p>
	 *
	 */
	public void not_lot_mix_flg(boolean value) {
		setConstBoolean(offset + 148, $not_lot_mix_flg, value);
	}

	/**
	 * サブロット混在不可ＦＬＧ. Prohibit mixed sublots flg..<p>
	 *
	 */
	public boolean not_sublot_mix_flg() {
		return getConstBoolean(offset + 149, $not_sublot_mix_flg);
	}

	/**
	 * サブロット混在不可ＦＬＧ. Prohibit mixed sublots flg..<p>
	 *
	 */
	public void not_sublot_mix_flg(boolean value) {
		setConstBoolean(offset + 149, $not_sublot_mix_flg, value);
	}

	public String getString(String name) {
		if ($slo_d_no.equalsIgnoreCase(name)) {
			return slo_d_no();
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			return slo_no();
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
		if ($itm_nm.equalsIgnoreCase(name)) {
			return itm_nm();
		}
		if ($iv_itm_nm.equalsIgnoreCase(name)) {
			return iv_itm_nm();
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
		if ($ver_no.equalsIgnoreCase(name)) {
			return ver_no();
		}
		if ($gd_cd.equalsIgnoreCase(name)) {
			return gd_cd();
		}
		if ($sls_itm_no.equalsIgnoreCase(name)) {
			return sls_itm_no();
		}
		if ($ship_inst_typ.equalsIgnoreCase(name)) {
			return ship_inst_typ();
		}
		if ($ship_schd_split_typ.equalsIgnoreCase(name)) {
			return ship_schd_split_typ();
		}
		if ($cntry_org_cd.equalsIgnoreCase(name)) {
			return cntry_org_cd();
		}
		if ($dlv_cd.equalsIgnoreCase(name)) {
			return dlv_cd();
		}
		if ($dlv_nm.equalsIgnoreCase(name)) {
			return dlv_nm();
		}
		if ($dlv_cntct_dpt.equalsIgnoreCase(name)) {
			return dlv_cntct_dpt();
		}
		if ($dlv_cntct_psn.equalsIgnoreCase(name)) {
			return dlv_cntct_psn();
		}
		if ($dlv_zip_cd.equalsIgnoreCase(name)) {
			return dlv_zip_cd();
		}
		if ($dlv_addr1.equalsIgnoreCase(name)) {
			return dlv_addr1();
		}
		if ($dlv_addr2.equalsIgnoreCase(name)) {
			return dlv_addr2();
		}
		if ($dlv_addr3.equalsIgnoreCase(name)) {
			return dlv_addr3();
		}
		if ($dlv_addr4.equalsIgnoreCase(name)) {
			return dlv_addr4();
		}
		if ($dlv_tel.equalsIgnoreCase(name)) {
			return dlv_tel();
		}
		if ($dlv_fax.equalsIgnoreCase(name)) {
			return dlv_fax();
		}
		if ($dlv_lg_grp_cd.equalsIgnoreCase(name)) {
			return dlv_lg_grp_cd();
		}
		if ($dest_cd1.equalsIgnoreCase(name)) {
			return dest_cd1();
		}
		if ($dest_cd2.equalsIgnoreCase(name)) {
			return dest_cd2();
		}
		if ($dest_cd3.equalsIgnoreCase(name)) {
			return dest_cd3();
		}
		if ($tdlv_cd.equalsIgnoreCase(name)) {
			return tdlv_cd();
		}
		if ($tdlv_nm.equalsIgnoreCase(name)) {
			return tdlv_nm();
		}
		if ($via_dlv_typ.equalsIgnoreCase(name)) {
			return via_dlv_typ();
		}
		if ($tdlv_cntct_dpt.equalsIgnoreCase(name)) {
			return tdlv_cntct_dpt();
		}
		if ($tdlv_cntct_psn.equalsIgnoreCase(name)) {
			return tdlv_cntct_psn();
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
		if ($tdlv_tel.equalsIgnoreCase(name)) {
			return tdlv_tel();
		}
		if ($tdlv_fax.equalsIgnoreCase(name)) {
			return tdlv_fax();
		}
		if ($tdlv_lg_grp_cd.equalsIgnoreCase(name)) {
			return tdlv_lg_grp_cd();
		}
		if ($dlv_day_week_typ.equalsIgnoreCase(name)) {
			return dlv_day_week_typ();
		}
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			return trd_unit_cd();
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($dscnt_rsn_cd.equalsIgnoreCase(name)) {
			return dscnt_rsn_cd();
		}
		if ($tax_cd.equalsIgnoreCase(name)) {
			return tax_cd();
		}
		if ($proc_typ.equalsIgnoreCase(name)) {
			return proc_typ();
		}
		if ($sls_upri_req_typ.equalsIgnoreCase(name)) {
			return sls_upri_req_typ();
		}
		if ($rqst_to_loc_cd.equalsIgnoreCase(name)) {
			return rqst_to_loc_cd();
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			return sppl_cd();
		}
		if ($maker_cd.equalsIgnoreCase(name)) {
			return maker_cd();
		}
		if ($alloc_scope_typ.equalsIgnoreCase(name)) {
			return alloc_scope_typ();
		}
		if ($alloc_typ.equalsIgnoreCase(name)) {
			return alloc_typ();
		}
		if ($alloc_grp_cd.equalsIgnoreCase(name)) {
			return alloc_grp_cd();
		}
		if ($ship_lg_grp_cd.equalsIgnoreCase(name)) {
			return ship_lg_grp_cd();
		}
		if ($def_loc_cd.equalsIgnoreCase(name)) {
			return def_loc_cd();
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			return loc_cd();
		}
		if ($str_ln_cd.equalsIgnoreCase(name)) {
			return str_ln_cd();
		}
		if ($lot_no.equalsIgnoreCase(name)) {
			return lot_no();
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			return sublot_no();
		}
		if ($wg_rqst_cnt_rmrks.equalsIgnoreCase(name)) {
			return wg_rqst_cnt_rmrks();
		}
		if ($ship_term_cd.equalsIgnoreCase(name)) {
			return ship_term_cd();
		}
		if ($cst_po_d_no.equalsIgnoreCase(name)) {
			return cst_po_d_no();
		}
		if ($cst_itm_cd.equalsIgnoreCase(name)) {
			return cst_itm_cd();
		}
		if ($cst_itm_nm.equalsIgnoreCase(name)) {
			return cst_itm_nm();
		}
		if ($cst_po_d_rmrks.equalsIgnoreCase(name)) {
			return cst_po_d_rmrks();
		}
		if ($sls_rsn_cd.equalsIgnoreCase(name)) {
			return sls_rsn_cd();
		}
		if ($bd_dpt_cd.equalsIgnoreCase(name)) {
			return bd_dpt_cd();
		}
		if ($rqst_unit_cd.equalsIgnoreCase(name)) {
			return rqst_unit_cd();
		}
		if ($qtn_no.equalsIgnoreCase(name)) {
			return qtn_no();
		}
		if ($qtn_d_no.equalsIgnoreCase(name)) {
			return qtn_d_no();
		}
		if ($ship_cnt_rmrks.equalsIgnoreCase(name)) {
			return ship_cnt_rmrks();
		}
		if ($trd_d_rmrks.equalsIgnoreCase(name)) {
			return trd_d_rmrks();
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			return intr_rmrks();
		}
		if ($io_schd_pr_no.equalsIgnoreCase(name)) {
			return io_schd_pr_no();
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
		if ($can_rsn_cd.equalsIgnoreCase(name)) {
			return can_rsn_cd();
		}
		if ($slo_d_can_rmkrs.equalsIgnoreCase(name)) {
			return slo_d_can_rmkrs();
		}
		if ($edi_sub_d_char1.equalsIgnoreCase(name)) {
			return edi_sub_d_char1();
		}
		if ($edi_sub_d_char2.equalsIgnoreCase(name)) {
			return edi_sub_d_char2();
		}
		if ($edi_sub_d_char3.equalsIgnoreCase(name)) {
			return edi_sub_d_char3();
		}
		if ($edi_sub_d_char4.equalsIgnoreCase(name)) {
			return edi_sub_d_char4();
		}
		if ($edi_sub_d_char5.equalsIgnoreCase(name)) {
			return edi_sub_d_char5();
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
		if ($slo_rev.equalsIgnoreCase(name)) {
			return slo_rev();
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			return disp_seq();
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			return trd_unit_qty();
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			return base_unit_qty();
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			return trd_cur_upri();
		}
		if ($cost_upri.equalsIgnoreCase(name)) {
			return cost_upri();
		}
		if ($cost_amt.equalsIgnoreCase(name)) {
			return cost_amt();
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			return trd_cur_amt();
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			return trd_cur_dscnt_amt();
		}
		if ($iv_upri.equalsIgnoreCase(name)) {
			return iv_upri();
		}
		if ($iv_amt.equalsIgnoreCase(name)) {
			return iv_amt();
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			return trd_cur_tax_amt();
		}
		if ($set_itm_grp_no.equalsIgnoreCase(name)) {
			return set_itm_grp_no();
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			return wtax_rate();
		}
		if ($wtax_amt.equalsIgnoreCase(name)) {
			return wtax_amt();
		}
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			return bill_crryovr_times();
		}
		if ($rqst_qty.equalsIgnoreCase(name)) {
			return rqst_qty();
		}
		if ($qtn_rev.equalsIgnoreCase(name)) {
			return qtn_rev();
		}
		if ($itm_comp_seq.equalsIgnoreCase(name)) {
			return itm_comp_seq();
		}
		if ($itm_spec_seq.equalsIgnoreCase(name)) {
			return itm_spec_seq();
		}
		if ($edi_sub_d_num1.equalsIgnoreCase(name)) {
			return edi_sub_d_num1();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumber(name);
	}

	public MCDate getDate(String name) {
		if ($ship_rqst_tm.equalsIgnoreCase(name)) {
			return ship_rqst_tm();
		}
		if ($dlv_rqst_tm.equalsIgnoreCase(name)) {
			return dlv_rqst_tm();
		}
		if ($sls_schd_dt.equalsIgnoreCase(name)) {
			return sls_schd_dt();
		}
		if ($accpt_schd_dt.equalsIgnoreCase(name)) {
			return accpt_schd_dt();
		}
		if ($rqst_dt.equalsIgnoreCase(name)) {
			return rqst_dt();
		}
		if ($rqst_dlv_rqst_dt.equalsIgnoreCase(name)) {
			return rqst_dlv_rqst_dt();
		}
		if ($rqst_prms_dt.equalsIgnoreCase(name)) {
			return rqst_prms_dt();
		}
		if ($rqst_prms_dlv_dt.equalsIgnoreCase(name)) {
			return rqst_prms_dlv_dt();
		}
		if ($slo_sum_base_dt.equalsIgnoreCase(name)) {
			return slo_sum_base_dt();
		}
		if ($edi_sub_d_dt1.equalsIgnoreCase(name)) {
			return edi_sub_d_dt1();
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
		if ($sno1_null_flg.equalsIgnoreCase(name)) {
			return sno1_null_flg();
		}
		if ($sno2_null_flg.equalsIgnoreCase(name)) {
			return sno2_null_flg();
		}
		if ($sno3_null_flg.equalsIgnoreCase(name)) {
			return sno3_null_flg();
		}
		if ($sno4_null_flg.equalsIgnoreCase(name)) {
			return sno4_null_flg();
		}
		if ($sundry_itm_flg.equalsIgnoreCase(name)) {
			return sundry_itm_flg();
		}
		if ($dlv_sundry_flg.equalsIgnoreCase(name)) {
			return dlv_sundry_flg();
		}
		if ($pri_prnt_flg.equalsIgnoreCase(name)) {
			return pri_prnt_flg();
		}
		if ($tdlv_sundry_flg.equalsIgnoreCase(name)) {
			return tdlv_sundry_flg();
		}
		if ($sls_cststk_flg.equalsIgnoreCase(name)) {
			return sls_cststk_flg();
		}
		if ($upri_not_tgt_flg.equalsIgnoreCase(name)) {
			return upri_not_tgt_flg();
		}
		if ($interim_flg.equalsIgnoreCase(name)) {
			return interim_flg();
		}
		if ($tax_fix_flg.equalsIgnoreCase(name)) {
			return tax_fix_flg();
		}
		if ($prms_flg.equalsIgnoreCase(name)) {
			return prms_flg();
		}
		if ($vmi_flg.equalsIgnoreCase(name)) {
			return vmi_flg();
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			return abort_flg();
		}
		if ($can_flg.equalsIgnoreCase(name)) {
			return can_flg();
		}
		if ($not_lg_mix_flg.equalsIgnoreCase(name)) {
			return not_lg_mix_flg();
		}
		if ($not_lot_mix_flg.equalsIgnoreCase(name)) {
			return not_lot_mix_flg();
		}
		if ($not_sublot_mix_flg.equalsIgnoreCase(name)) {
			return not_sublot_mix_flg();
		}
		return super.getBoolean(name);
	}

	public String getStringNE(String name) {
		if ($slo_d_no.equalsIgnoreCase(name)) {
			return slo_d_no();
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			return slo_no();
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
		if ($itm_nm.equalsIgnoreCase(name)) {
			return itm_nm();
		}
		if ($iv_itm_nm.equalsIgnoreCase(name)) {
			return iv_itm_nm();
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
		if ($ver_no.equalsIgnoreCase(name)) {
			return ver_no();
		}
		if ($gd_cd.equalsIgnoreCase(name)) {
			return gd_cd();
		}
		if ($sls_itm_no.equalsIgnoreCase(name)) {
			return sls_itm_no();
		}
		if ($ship_inst_typ.equalsIgnoreCase(name)) {
			return ship_inst_typ();
		}
		if ($ship_schd_split_typ.equalsIgnoreCase(name)) {
			return ship_schd_split_typ();
		}
		if ($cntry_org_cd.equalsIgnoreCase(name)) {
			return cntry_org_cd();
		}
		if ($dlv_cd.equalsIgnoreCase(name)) {
			return dlv_cd();
		}
		if ($dlv_nm.equalsIgnoreCase(name)) {
			return dlv_nm();
		}
		if ($dlv_cntct_dpt.equalsIgnoreCase(name)) {
			return dlv_cntct_dpt();
		}
		if ($dlv_cntct_psn.equalsIgnoreCase(name)) {
			return dlv_cntct_psn();
		}
		if ($dlv_zip_cd.equalsIgnoreCase(name)) {
			return dlv_zip_cd();
		}
		if ($dlv_addr1.equalsIgnoreCase(name)) {
			return dlv_addr1();
		}
		if ($dlv_addr2.equalsIgnoreCase(name)) {
			return dlv_addr2();
		}
		if ($dlv_addr3.equalsIgnoreCase(name)) {
			return dlv_addr3();
		}
		if ($dlv_addr4.equalsIgnoreCase(name)) {
			return dlv_addr4();
		}
		if ($dlv_tel.equalsIgnoreCase(name)) {
			return dlv_tel();
		}
		if ($dlv_fax.equalsIgnoreCase(name)) {
			return dlv_fax();
		}
		if ($dlv_lg_grp_cd.equalsIgnoreCase(name)) {
			return dlv_lg_grp_cd();
		}
		if ($dest_cd1.equalsIgnoreCase(name)) {
			return dest_cd1();
		}
		if ($dest_cd2.equalsIgnoreCase(name)) {
			return dest_cd2();
		}
		if ($dest_cd3.equalsIgnoreCase(name)) {
			return dest_cd3();
		}
		if ($tdlv_cd.equalsIgnoreCase(name)) {
			return tdlv_cd();
		}
		if ($tdlv_nm.equalsIgnoreCase(name)) {
			return tdlv_nm();
		}
		if ($via_dlv_typ.equalsIgnoreCase(name)) {
			return via_dlv_typ();
		}
		if ($tdlv_cntct_dpt.equalsIgnoreCase(name)) {
			return tdlv_cntct_dpt();
		}
		if ($tdlv_cntct_psn.equalsIgnoreCase(name)) {
			return tdlv_cntct_psn();
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
		if ($tdlv_tel.equalsIgnoreCase(name)) {
			return tdlv_tel();
		}
		if ($tdlv_fax.equalsIgnoreCase(name)) {
			return tdlv_fax();
		}
		if ($tdlv_lg_grp_cd.equalsIgnoreCase(name)) {
			return tdlv_lg_grp_cd();
		}
		if ($dlv_day_week_typ.equalsIgnoreCase(name)) {
			return dlv_day_week_typ();
		}
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			return trd_unit_cd();
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			return base_unit_cd();
		}
		if ($dscnt_rsn_cd.equalsIgnoreCase(name)) {
			return dscnt_rsn_cd();
		}
		if ($tax_cd.equalsIgnoreCase(name)) {
			return tax_cd();
		}
		if ($proc_typ.equalsIgnoreCase(name)) {
			return proc_typ();
		}
		if ($sls_upri_req_typ.equalsIgnoreCase(name)) {
			return sls_upri_req_typ();
		}
		if ($rqst_to_loc_cd.equalsIgnoreCase(name)) {
			return rqst_to_loc_cd();
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			return sppl_cd();
		}
		if ($maker_cd.equalsIgnoreCase(name)) {
			return maker_cd();
		}
		if ($alloc_scope_typ.equalsIgnoreCase(name)) {
			return alloc_scope_typ();
		}
		if ($alloc_typ.equalsIgnoreCase(name)) {
			return alloc_typ();
		}
		if ($alloc_grp_cd.equalsIgnoreCase(name)) {
			return alloc_grp_cd();
		}
		if ($ship_lg_grp_cd.equalsIgnoreCase(name)) {
			return ship_lg_grp_cd();
		}
		if ($def_loc_cd.equalsIgnoreCase(name)) {
			return def_loc_cd();
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			return loc_cd();
		}
		if ($str_ln_cd.equalsIgnoreCase(name)) {
			return str_ln_cd();
		}
		if ($lot_no.equalsIgnoreCase(name)) {
			return lot_no();
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			return sublot_no();
		}
		if ($wg_rqst_cnt_rmrks.equalsIgnoreCase(name)) {
			return wg_rqst_cnt_rmrks();
		}
		if ($ship_term_cd.equalsIgnoreCase(name)) {
			return ship_term_cd();
		}
		if ($cst_po_d_no.equalsIgnoreCase(name)) {
			return cst_po_d_no();
		}
		if ($cst_itm_cd.equalsIgnoreCase(name)) {
			return cst_itm_cd();
		}
		if ($cst_itm_nm.equalsIgnoreCase(name)) {
			return cst_itm_nm();
		}
		if ($cst_po_d_rmrks.equalsIgnoreCase(name)) {
			return cst_po_d_rmrks();
		}
		if ($sls_rsn_cd.equalsIgnoreCase(name)) {
			return sls_rsn_cd();
		}
		if ($bd_dpt_cd.equalsIgnoreCase(name)) {
			return bd_dpt_cd();
		}
		if ($rqst_unit_cd.equalsIgnoreCase(name)) {
			return rqst_unit_cd();
		}
		if ($qtn_no.equalsIgnoreCase(name)) {
			return qtn_no();
		}
		if ($qtn_d_no.equalsIgnoreCase(name)) {
			return qtn_d_no();
		}
		if ($ship_cnt_rmrks.equalsIgnoreCase(name)) {
			return ship_cnt_rmrks();
		}
		if ($trd_d_rmrks.equalsIgnoreCase(name)) {
			return trd_d_rmrks();
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			return intr_rmrks();
		}
		if ($io_schd_pr_no.equalsIgnoreCase(name)) {
			return io_schd_pr_no();
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
		if ($can_rsn_cd.equalsIgnoreCase(name)) {
			return can_rsn_cd();
		}
		if ($slo_d_can_rmkrs.equalsIgnoreCase(name)) {
			return slo_d_can_rmkrs();
		}
		if ($edi_sub_d_char1.equalsIgnoreCase(name)) {
			return edi_sub_d_char1();
		}
		if ($edi_sub_d_char2.equalsIgnoreCase(name)) {
			return edi_sub_d_char2();
		}
		if ($edi_sub_d_char3.equalsIgnoreCase(name)) {
			return edi_sub_d_char3();
		}
		if ($edi_sub_d_char4.equalsIgnoreCase(name)) {
			return edi_sub_d_char4();
		}
		if ($edi_sub_d_char5.equalsIgnoreCase(name)) {
			return edi_sub_d_char5();
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
		if ($slo_rev.equalsIgnoreCase(name)) {
			return slo_rev();
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			return disp_seq();
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			return trd_unit_qty();
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			return base_unit_qty();
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			return trd_cur_upri();
		}
		if ($cost_upri.equalsIgnoreCase(name)) {
			return cost_upri();
		}
		if ($cost_amt.equalsIgnoreCase(name)) {
			return cost_amt();
		}
		if ($trd_cur_amt.equalsIgnoreCase(name)) {
			return trd_cur_amt();
		}
		if ($trd_cur_dscnt_amt.equalsIgnoreCase(name)) {
			return trd_cur_dscnt_amt();
		}
		if ($iv_upri.equalsIgnoreCase(name)) {
			return iv_upri();
		}
		if ($iv_amt.equalsIgnoreCase(name)) {
			return iv_amt();
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			return trd_cur_tax_amt();
		}
		if ($set_itm_grp_no.equalsIgnoreCase(name)) {
			return set_itm_grp_no();
		}
		if ($wtax_rate.equalsIgnoreCase(name)) {
			return wtax_rate();
		}
		if ($wtax_amt.equalsIgnoreCase(name)) {
			return wtax_amt();
		}
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			return bill_crryovr_times();
		}
		if ($rqst_qty.equalsIgnoreCase(name)) {
			return rqst_qty();
		}
		if ($qtn_rev.equalsIgnoreCase(name)) {
			return qtn_rev();
		}
		if ($itm_comp_seq.equalsIgnoreCase(name)) {
			return itm_comp_seq();
		}
		if ($itm_spec_seq.equalsIgnoreCase(name)) {
			return itm_spec_seq();
		}
		if ($edi_sub_d_num1.equalsIgnoreCase(name)) {
			return edi_sub_d_num1();
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			return upd_cntr();
		}
		return super.getNumberNE(name);
	}

	public MCDate getDateNE(String name) {
		if ($ship_rqst_tm.equalsIgnoreCase(name)) {
			return ship_rqst_tm();
		}
		if ($dlv_rqst_tm.equalsIgnoreCase(name)) {
			return dlv_rqst_tm();
		}
		if ($sls_schd_dt.equalsIgnoreCase(name)) {
			return sls_schd_dt();
		}
		if ($accpt_schd_dt.equalsIgnoreCase(name)) {
			return accpt_schd_dt();
		}
		if ($rqst_dt.equalsIgnoreCase(name)) {
			return rqst_dt();
		}
		if ($rqst_dlv_rqst_dt.equalsIgnoreCase(name)) {
			return rqst_dlv_rqst_dt();
		}
		if ($rqst_prms_dt.equalsIgnoreCase(name)) {
			return rqst_prms_dt();
		}
		if ($rqst_prms_dlv_dt.equalsIgnoreCase(name)) {
			return rqst_prms_dlv_dt();
		}
		if ($slo_sum_base_dt.equalsIgnoreCase(name)) {
			return slo_sum_base_dt();
		}
		if ($edi_sub_d_dt1.equalsIgnoreCase(name)) {
			return edi_sub_d_dt1();
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
		if ($sno1_null_flg.equalsIgnoreCase(name)) {
			return sno1_null_flg();
		}
		if ($sno2_null_flg.equalsIgnoreCase(name)) {
			return sno2_null_flg();
		}
		if ($sno3_null_flg.equalsIgnoreCase(name)) {
			return sno3_null_flg();
		}
		if ($sno4_null_flg.equalsIgnoreCase(name)) {
			return sno4_null_flg();
		}
		if ($sundry_itm_flg.equalsIgnoreCase(name)) {
			return sundry_itm_flg();
		}
		if ($dlv_sundry_flg.equalsIgnoreCase(name)) {
			return dlv_sundry_flg();
		}
		if ($pri_prnt_flg.equalsIgnoreCase(name)) {
			return pri_prnt_flg();
		}
		if ($tdlv_sundry_flg.equalsIgnoreCase(name)) {
			return tdlv_sundry_flg();
		}
		if ($sls_cststk_flg.equalsIgnoreCase(name)) {
			return sls_cststk_flg();
		}
		if ($upri_not_tgt_flg.equalsIgnoreCase(name)) {
			return upri_not_tgt_flg();
		}
		if ($interim_flg.equalsIgnoreCase(name)) {
			return interim_flg();
		}
		if ($tax_fix_flg.equalsIgnoreCase(name)) {
			return tax_fix_flg();
		}
		if ($prms_flg.equalsIgnoreCase(name)) {
			return prms_flg();
		}
		if ($vmi_flg.equalsIgnoreCase(name)) {
			return vmi_flg();
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			return abort_flg();
		}
		if ($can_flg.equalsIgnoreCase(name)) {
			return can_flg();
		}
		if ($not_lg_mix_flg.equalsIgnoreCase(name)) {
			return not_lg_mix_flg();
		}
		if ($not_lot_mix_flg.equalsIgnoreCase(name)) {
			return not_lot_mix_flg();
		}
		if ($not_sublot_mix_flg.equalsIgnoreCase(name)) {
			return not_sublot_mix_flg();
		}
		return super.getBooleanNE(name);
	}

	public void setString(String name, String value) {
		if ($slo_d_no.equalsIgnoreCase(name)) {
			slo_d_no(value);
			return;
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			slo_no(value);
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
		if ($itm_nm.equalsIgnoreCase(name)) {
			itm_nm(value);
			return;
		}
		if ($iv_itm_nm.equalsIgnoreCase(name)) {
			iv_itm_nm(value);
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
		if ($ver_no.equalsIgnoreCase(name)) {
			ver_no(value);
			return;
		}
		if ($gd_cd.equalsIgnoreCase(name)) {
			gd_cd(value);
			return;
		}
		if ($sls_itm_no.equalsIgnoreCase(name)) {
			sls_itm_no(value);
			return;
		}
		if ($ship_inst_typ.equalsIgnoreCase(name)) {
			ship_inst_typ(value);
			return;
		}
		if ($ship_schd_split_typ.equalsIgnoreCase(name)) {
			ship_schd_split_typ(value);
			return;
		}
		if ($cntry_org_cd.equalsIgnoreCase(name)) {
			cntry_org_cd(value);
			return;
		}
		if ($dlv_cd.equalsIgnoreCase(name)) {
			dlv_cd(value);
			return;
		}
		if ($dlv_nm.equalsIgnoreCase(name)) {
			dlv_nm(value);
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
		if ($dlv_zip_cd.equalsIgnoreCase(name)) {
			dlv_zip_cd(value);
			return;
		}
		if ($dlv_addr1.equalsIgnoreCase(name)) {
			dlv_addr1(value);
			return;
		}
		if ($dlv_addr2.equalsIgnoreCase(name)) {
			dlv_addr2(value);
			return;
		}
		if ($dlv_addr3.equalsIgnoreCase(name)) {
			dlv_addr3(value);
			return;
		}
		if ($dlv_addr4.equalsIgnoreCase(name)) {
			dlv_addr4(value);
			return;
		}
		if ($dlv_tel.equalsIgnoreCase(name)) {
			dlv_tel(value);
			return;
		}
		if ($dlv_fax.equalsIgnoreCase(name)) {
			dlv_fax(value);
			return;
		}
		if ($dlv_lg_grp_cd.equalsIgnoreCase(name)) {
			dlv_lg_grp_cd(value);
			return;
		}
		if ($dest_cd1.equalsIgnoreCase(name)) {
			dest_cd1(value);
			return;
		}
		if ($dest_cd2.equalsIgnoreCase(name)) {
			dest_cd2(value);
			return;
		}
		if ($dest_cd3.equalsIgnoreCase(name)) {
			dest_cd3(value);
			return;
		}
		if ($tdlv_cd.equalsIgnoreCase(name)) {
			tdlv_cd(value);
			return;
		}
		if ($tdlv_nm.equalsIgnoreCase(name)) {
			tdlv_nm(value);
			return;
		}
		if ($via_dlv_typ.equalsIgnoreCase(name)) {
			via_dlv_typ(value);
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
		if ($tdlv_tel.equalsIgnoreCase(name)) {
			tdlv_tel(value);
			return;
		}
		if ($tdlv_fax.equalsIgnoreCase(name)) {
			tdlv_fax(value);
			return;
		}
		if ($tdlv_lg_grp_cd.equalsIgnoreCase(name)) {
			tdlv_lg_grp_cd(value);
			return;
		}
		if ($dlv_day_week_typ.equalsIgnoreCase(name)) {
			dlv_day_week_typ(value);
			return;
		}
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			trd_unit_cd(value);
			return;
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			base_unit_cd(value);
			return;
		}
		if ($dscnt_rsn_cd.equalsIgnoreCase(name)) {
			dscnt_rsn_cd(value);
			return;
		}
		if ($tax_cd.equalsIgnoreCase(name)) {
			tax_cd(value);
			return;
		}
		if ($proc_typ.equalsIgnoreCase(name)) {
			proc_typ(value);
			return;
		}
		if ($sls_upri_req_typ.equalsIgnoreCase(name)) {
			sls_upri_req_typ(value);
			return;
		}
		if ($rqst_to_loc_cd.equalsIgnoreCase(name)) {
			rqst_to_loc_cd(value);
			return;
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			sppl_cd(value);
			return;
		}
		if ($maker_cd.equalsIgnoreCase(name)) {
			maker_cd(value);
			return;
		}
		if ($alloc_scope_typ.equalsIgnoreCase(name)) {
			alloc_scope_typ(value);
			return;
		}
		if ($alloc_typ.equalsIgnoreCase(name)) {
			alloc_typ(value);
			return;
		}
		if ($alloc_grp_cd.equalsIgnoreCase(name)) {
			alloc_grp_cd(value);
			return;
		}
		if ($ship_lg_grp_cd.equalsIgnoreCase(name)) {
			ship_lg_grp_cd(value);
			return;
		}
		if ($def_loc_cd.equalsIgnoreCase(name)) {
			def_loc_cd(value);
			return;
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			loc_cd(value);
			return;
		}
		if ($str_ln_cd.equalsIgnoreCase(name)) {
			str_ln_cd(value);
			return;
		}
		if ($lot_no.equalsIgnoreCase(name)) {
			lot_no(value);
			return;
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			sublot_no(value);
			return;
		}
		if ($wg_rqst_cnt_rmrks.equalsIgnoreCase(name)) {
			wg_rqst_cnt_rmrks(value);
			return;
		}
		if ($ship_term_cd.equalsIgnoreCase(name)) {
			ship_term_cd(value);
			return;
		}
		if ($cst_po_d_no.equalsIgnoreCase(name)) {
			cst_po_d_no(value);
			return;
		}
		if ($cst_itm_cd.equalsIgnoreCase(name)) {
			cst_itm_cd(value);
			return;
		}
		if ($cst_itm_nm.equalsIgnoreCase(name)) {
			cst_itm_nm(value);
			return;
		}
		if ($cst_po_d_rmrks.equalsIgnoreCase(name)) {
			cst_po_d_rmrks(value);
			return;
		}
		if ($sls_rsn_cd.equalsIgnoreCase(name)) {
			sls_rsn_cd(value);
			return;
		}
		if ($bd_dpt_cd.equalsIgnoreCase(name)) {
			bd_dpt_cd(value);
			return;
		}
		if ($rqst_unit_cd.equalsIgnoreCase(name)) {
			rqst_unit_cd(value);
			return;
		}
		if ($qtn_no.equalsIgnoreCase(name)) {
			qtn_no(value);
			return;
		}
		if ($qtn_d_no.equalsIgnoreCase(name)) {
			qtn_d_no(value);
			return;
		}
		if ($ship_cnt_rmrks.equalsIgnoreCase(name)) {
			ship_cnt_rmrks(value);
			return;
		}
		if ($trd_d_rmrks.equalsIgnoreCase(name)) {
			trd_d_rmrks(value);
			return;
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			intr_rmrks(value);
			return;
		}
		if ($io_schd_pr_no.equalsIgnoreCase(name)) {
			io_schd_pr_no(value);
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
		if ($can_rsn_cd.equalsIgnoreCase(name)) {
			can_rsn_cd(value);
			return;
		}
		if ($slo_d_can_rmkrs.equalsIgnoreCase(name)) {
			slo_d_can_rmkrs(value);
			return;
		}
		if ($edi_sub_d_char1.equalsIgnoreCase(name)) {
			edi_sub_d_char1(value);
			return;
		}
		if ($edi_sub_d_char2.equalsIgnoreCase(name)) {
			edi_sub_d_char2(value);
			return;
		}
		if ($edi_sub_d_char3.equalsIgnoreCase(name)) {
			edi_sub_d_char3(value);
			return;
		}
		if ($edi_sub_d_char4.equalsIgnoreCase(name)) {
			edi_sub_d_char4(value);
			return;
		}
		if ($edi_sub_d_char5.equalsIgnoreCase(name)) {
			edi_sub_d_char5(value);
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
		if ($slo_rev.equalsIgnoreCase(name)) {
			slo_rev(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($cost_upri.equalsIgnoreCase(name)) {
			cost_upri(value);
			return;
		}
		if ($cost_amt.equalsIgnoreCase(name)) {
			cost_amt(value);
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
		if ($iv_upri.equalsIgnoreCase(name)) {
			iv_upri(value);
			return;
		}
		if ($iv_amt.equalsIgnoreCase(name)) {
			iv_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($set_itm_grp_no.equalsIgnoreCase(name)) {
			set_itm_grp_no(value);
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
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			bill_crryovr_times(value);
			return;
		}
		if ($rqst_qty.equalsIgnoreCase(name)) {
			rqst_qty(value);
			return;
		}
		if ($qtn_rev.equalsIgnoreCase(name)) {
			qtn_rev(value);
			return;
		}
		if ($itm_comp_seq.equalsIgnoreCase(name)) {
			itm_comp_seq(value);
			return;
		}
		if ($itm_spec_seq.equalsIgnoreCase(name)) {
			itm_spec_seq(value);
			return;
		}
		if ($edi_sub_d_num1.equalsIgnoreCase(name)) {
			edi_sub_d_num1(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, int value) {
		if ($slo_rev.equalsIgnoreCase(name)) {
			slo_rev(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($cost_upri.equalsIgnoreCase(name)) {
			cost_upri(value);
			return;
		}
		if ($cost_amt.equalsIgnoreCase(name)) {
			cost_amt(value);
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
		if ($iv_upri.equalsIgnoreCase(name)) {
			iv_upri(value);
			return;
		}
		if ($iv_amt.equalsIgnoreCase(name)) {
			iv_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($set_itm_grp_no.equalsIgnoreCase(name)) {
			set_itm_grp_no(value);
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
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			bill_crryovr_times(value);
			return;
		}
		if ($rqst_qty.equalsIgnoreCase(name)) {
			rqst_qty(value);
			return;
		}
		if ($qtn_rev.equalsIgnoreCase(name)) {
			qtn_rev(value);
			return;
		}
		if ($itm_comp_seq.equalsIgnoreCase(name)) {
			itm_comp_seq(value);
			return;
		}
		if ($itm_spec_seq.equalsIgnoreCase(name)) {
			itm_spec_seq(value);
			return;
		}
		if ($edi_sub_d_num1.equalsIgnoreCase(name)) {
			edi_sub_d_num1(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, long value) {
		if ($slo_rev.equalsIgnoreCase(name)) {
			slo_rev(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($cost_upri.equalsIgnoreCase(name)) {
			cost_upri(value);
			return;
		}
		if ($cost_amt.equalsIgnoreCase(name)) {
			cost_amt(value);
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
		if ($iv_upri.equalsIgnoreCase(name)) {
			iv_upri(value);
			return;
		}
		if ($iv_amt.equalsIgnoreCase(name)) {
			iv_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($set_itm_grp_no.equalsIgnoreCase(name)) {
			set_itm_grp_no(value);
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
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			bill_crryovr_times(value);
			return;
		}
		if ($rqst_qty.equalsIgnoreCase(name)) {
			rqst_qty(value);
			return;
		}
		if ($qtn_rev.equalsIgnoreCase(name)) {
			qtn_rev(value);
			return;
		}
		if ($itm_comp_seq.equalsIgnoreCase(name)) {
			itm_comp_seq(value);
			return;
		}
		if ($itm_spec_seq.equalsIgnoreCase(name)) {
			itm_spec_seq(value);
			return;
		}
		if ($edi_sub_d_num1.equalsIgnoreCase(name)) {
			edi_sub_d_num1(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, float value) {
		if ($slo_rev.equalsIgnoreCase(name)) {
			slo_rev(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($cost_upri.equalsIgnoreCase(name)) {
			cost_upri(value);
			return;
		}
		if ($cost_amt.equalsIgnoreCase(name)) {
			cost_amt(value);
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
		if ($iv_upri.equalsIgnoreCase(name)) {
			iv_upri(value);
			return;
		}
		if ($iv_amt.equalsIgnoreCase(name)) {
			iv_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($set_itm_grp_no.equalsIgnoreCase(name)) {
			set_itm_grp_no(value);
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
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			bill_crryovr_times(value);
			return;
		}
		if ($rqst_qty.equalsIgnoreCase(name)) {
			rqst_qty(value);
			return;
		}
		if ($qtn_rev.equalsIgnoreCase(name)) {
			qtn_rev(value);
			return;
		}
		if ($itm_comp_seq.equalsIgnoreCase(name)) {
			itm_comp_seq(value);
			return;
		}
		if ($itm_spec_seq.equalsIgnoreCase(name)) {
			itm_spec_seq(value);
			return;
		}
		if ($edi_sub_d_num1.equalsIgnoreCase(name)) {
			edi_sub_d_num1(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setNumber(String name, double value) {
		if ($slo_rev.equalsIgnoreCase(name)) {
			slo_rev(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($cost_upri.equalsIgnoreCase(name)) {
			cost_upri(value);
			return;
		}
		if ($cost_amt.equalsIgnoreCase(name)) {
			cost_amt(value);
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
		if ($iv_upri.equalsIgnoreCase(name)) {
			iv_upri(value);
			return;
		}
		if ($iv_amt.equalsIgnoreCase(name)) {
			iv_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($set_itm_grp_no.equalsIgnoreCase(name)) {
			set_itm_grp_no(value);
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
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			bill_crryovr_times(value);
			return;
		}
		if ($rqst_qty.equalsIgnoreCase(name)) {
			rqst_qty(value);
			return;
		}
		if ($qtn_rev.equalsIgnoreCase(name)) {
			qtn_rev(value);
			return;
		}
		if ($itm_comp_seq.equalsIgnoreCase(name)) {
			itm_comp_seq(value);
			return;
		}
		if ($itm_spec_seq.equalsIgnoreCase(name)) {
			itm_spec_seq(value);
			return;
		}
		if ($edi_sub_d_num1.equalsIgnoreCase(name)) {
			edi_sub_d_num1(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumber(name, value);
	}

	public void setDate(String name, MCDate value) {
		if ($ship_rqst_tm.equalsIgnoreCase(name)) {
			ship_rqst_tm(value);
			return;
		}
		if ($dlv_rqst_tm.equalsIgnoreCase(name)) {
			dlv_rqst_tm(value);
			return;
		}
		if ($sls_schd_dt.equalsIgnoreCase(name)) {
			sls_schd_dt(value);
			return;
		}
		if ($accpt_schd_dt.equalsIgnoreCase(name)) {
			accpt_schd_dt(value);
			return;
		}
		if ($rqst_dt.equalsIgnoreCase(name)) {
			rqst_dt(value);
			return;
		}
		if ($rqst_dlv_rqst_dt.equalsIgnoreCase(name)) {
			rqst_dlv_rqst_dt(value);
			return;
		}
		if ($rqst_prms_dt.equalsIgnoreCase(name)) {
			rqst_prms_dt(value);
			return;
		}
		if ($rqst_prms_dlv_dt.equalsIgnoreCase(name)) {
			rqst_prms_dlv_dt(value);
			return;
		}
		if ($slo_sum_base_dt.equalsIgnoreCase(name)) {
			slo_sum_base_dt(value);
			return;
		}
		if ($edi_sub_d_dt1.equalsIgnoreCase(name)) {
			edi_sub_d_dt1(value);
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
		if ($sno1_null_flg.equalsIgnoreCase(name)) {
			sno1_null_flg(value);
			return;
		}
		if ($sno2_null_flg.equalsIgnoreCase(name)) {
			sno2_null_flg(value);
			return;
		}
		if ($sno3_null_flg.equalsIgnoreCase(name)) {
			sno3_null_flg(value);
			return;
		}
		if ($sno4_null_flg.equalsIgnoreCase(name)) {
			sno4_null_flg(value);
			return;
		}
		if ($sundry_itm_flg.equalsIgnoreCase(name)) {
			sundry_itm_flg(value);
			return;
		}
		if ($dlv_sundry_flg.equalsIgnoreCase(name)) {
			dlv_sundry_flg(value);
			return;
		}
		if ($pri_prnt_flg.equalsIgnoreCase(name)) {
			pri_prnt_flg(value);
			return;
		}
		if ($tdlv_sundry_flg.equalsIgnoreCase(name)) {
			tdlv_sundry_flg(value);
			return;
		}
		if ($sls_cststk_flg.equalsIgnoreCase(name)) {
			sls_cststk_flg(value);
			return;
		}
		if ($upri_not_tgt_flg.equalsIgnoreCase(name)) {
			upri_not_tgt_flg(value);
			return;
		}
		if ($interim_flg.equalsIgnoreCase(name)) {
			interim_flg(value);
			return;
		}
		if ($tax_fix_flg.equalsIgnoreCase(name)) {
			tax_fix_flg(value);
			return;
		}
		if ($prms_flg.equalsIgnoreCase(name)) {
			prms_flg(value);
			return;
		}
		if ($vmi_flg.equalsIgnoreCase(name)) {
			vmi_flg(value);
			return;
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			abort_flg(value);
			return;
		}
		if ($can_flg.equalsIgnoreCase(name)) {
			can_flg(value);
			return;
		}
		if ($not_lg_mix_flg.equalsIgnoreCase(name)) {
			not_lg_mix_flg(value);
			return;
		}
		if ($not_lot_mix_flg.equalsIgnoreCase(name)) {
			not_lot_mix_flg(value);
			return;
		}
		if ($not_sublot_mix_flg.equalsIgnoreCase(name)) {
			not_sublot_mix_flg(value);
			return;
		}
		super.setBoolean(name, value);
	}

	public void setStringNE(String name, String value) {
		if ($slo_d_no.equalsIgnoreCase(name)) {
			slo_d_no(value);
			return;
		}
		if ($slo_no.equalsIgnoreCase(name)) {
			slo_no(value);
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
		if ($itm_nm.equalsIgnoreCase(name)) {
			itm_nm(value);
			return;
		}
		if ($iv_itm_nm.equalsIgnoreCase(name)) {
			iv_itm_nm(value);
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
		if ($ver_no.equalsIgnoreCase(name)) {
			ver_no(value);
			return;
		}
		if ($gd_cd.equalsIgnoreCase(name)) {
			gd_cd(value);
			return;
		}
		if ($sls_itm_no.equalsIgnoreCase(name)) {
			sls_itm_no(value);
			return;
		}
		if ($ship_inst_typ.equalsIgnoreCase(name)) {
			ship_inst_typ(value);
			return;
		}
		if ($ship_schd_split_typ.equalsIgnoreCase(name)) {
			ship_schd_split_typ(value);
			return;
		}
		if ($cntry_org_cd.equalsIgnoreCase(name)) {
			cntry_org_cd(value);
			return;
		}
		if ($dlv_cd.equalsIgnoreCase(name)) {
			dlv_cd(value);
			return;
		}
		if ($dlv_nm.equalsIgnoreCase(name)) {
			dlv_nm(value);
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
		if ($dlv_zip_cd.equalsIgnoreCase(name)) {
			dlv_zip_cd(value);
			return;
		}
		if ($dlv_addr1.equalsIgnoreCase(name)) {
			dlv_addr1(value);
			return;
		}
		if ($dlv_addr2.equalsIgnoreCase(name)) {
			dlv_addr2(value);
			return;
		}
		if ($dlv_addr3.equalsIgnoreCase(name)) {
			dlv_addr3(value);
			return;
		}
		if ($dlv_addr4.equalsIgnoreCase(name)) {
			dlv_addr4(value);
			return;
		}
		if ($dlv_tel.equalsIgnoreCase(name)) {
			dlv_tel(value);
			return;
		}
		if ($dlv_fax.equalsIgnoreCase(name)) {
			dlv_fax(value);
			return;
		}
		if ($dlv_lg_grp_cd.equalsIgnoreCase(name)) {
			dlv_lg_grp_cd(value);
			return;
		}
		if ($dest_cd1.equalsIgnoreCase(name)) {
			dest_cd1(value);
			return;
		}
		if ($dest_cd2.equalsIgnoreCase(name)) {
			dest_cd2(value);
			return;
		}
		if ($dest_cd3.equalsIgnoreCase(name)) {
			dest_cd3(value);
			return;
		}
		if ($tdlv_cd.equalsIgnoreCase(name)) {
			tdlv_cd(value);
			return;
		}
		if ($tdlv_nm.equalsIgnoreCase(name)) {
			tdlv_nm(value);
			return;
		}
		if ($via_dlv_typ.equalsIgnoreCase(name)) {
			via_dlv_typ(value);
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
		if ($tdlv_tel.equalsIgnoreCase(name)) {
			tdlv_tel(value);
			return;
		}
		if ($tdlv_fax.equalsIgnoreCase(name)) {
			tdlv_fax(value);
			return;
		}
		if ($tdlv_lg_grp_cd.equalsIgnoreCase(name)) {
			tdlv_lg_grp_cd(value);
			return;
		}
		if ($dlv_day_week_typ.equalsIgnoreCase(name)) {
			dlv_day_week_typ(value);
			return;
		}
		if ($trd_unit_cd.equalsIgnoreCase(name)) {
			trd_unit_cd(value);
			return;
		}
		if ($base_unit_cd.equalsIgnoreCase(name)) {
			base_unit_cd(value);
			return;
		}
		if ($dscnt_rsn_cd.equalsIgnoreCase(name)) {
			dscnt_rsn_cd(value);
			return;
		}
		if ($tax_cd.equalsIgnoreCase(name)) {
			tax_cd(value);
			return;
		}
		if ($proc_typ.equalsIgnoreCase(name)) {
			proc_typ(value);
			return;
		}
		if ($sls_upri_req_typ.equalsIgnoreCase(name)) {
			sls_upri_req_typ(value);
			return;
		}
		if ($rqst_to_loc_cd.equalsIgnoreCase(name)) {
			rqst_to_loc_cd(value);
			return;
		}
		if ($sppl_cd.equalsIgnoreCase(name)) {
			sppl_cd(value);
			return;
		}
		if ($maker_cd.equalsIgnoreCase(name)) {
			maker_cd(value);
			return;
		}
		if ($alloc_scope_typ.equalsIgnoreCase(name)) {
			alloc_scope_typ(value);
			return;
		}
		if ($alloc_typ.equalsIgnoreCase(name)) {
			alloc_typ(value);
			return;
		}
		if ($alloc_grp_cd.equalsIgnoreCase(name)) {
			alloc_grp_cd(value);
			return;
		}
		if ($ship_lg_grp_cd.equalsIgnoreCase(name)) {
			ship_lg_grp_cd(value);
			return;
		}
		if ($def_loc_cd.equalsIgnoreCase(name)) {
			def_loc_cd(value);
			return;
		}
		if ($loc_cd.equalsIgnoreCase(name)) {
			loc_cd(value);
			return;
		}
		if ($str_ln_cd.equalsIgnoreCase(name)) {
			str_ln_cd(value);
			return;
		}
		if ($lot_no.equalsIgnoreCase(name)) {
			lot_no(value);
			return;
		}
		if ($sublot_no.equalsIgnoreCase(name)) {
			sublot_no(value);
			return;
		}
		if ($wg_rqst_cnt_rmrks.equalsIgnoreCase(name)) {
			wg_rqst_cnt_rmrks(value);
			return;
		}
		if ($ship_term_cd.equalsIgnoreCase(name)) {
			ship_term_cd(value);
			return;
		}
		if ($cst_po_d_no.equalsIgnoreCase(name)) {
			cst_po_d_no(value);
			return;
		}
		if ($cst_itm_cd.equalsIgnoreCase(name)) {
			cst_itm_cd(value);
			return;
		}
		if ($cst_itm_nm.equalsIgnoreCase(name)) {
			cst_itm_nm(value);
			return;
		}
		if ($cst_po_d_rmrks.equalsIgnoreCase(name)) {
			cst_po_d_rmrks(value);
			return;
		}
		if ($sls_rsn_cd.equalsIgnoreCase(name)) {
			sls_rsn_cd(value);
			return;
		}
		if ($bd_dpt_cd.equalsIgnoreCase(name)) {
			bd_dpt_cd(value);
			return;
		}
		if ($rqst_unit_cd.equalsIgnoreCase(name)) {
			rqst_unit_cd(value);
			return;
		}
		if ($qtn_no.equalsIgnoreCase(name)) {
			qtn_no(value);
			return;
		}
		if ($qtn_d_no.equalsIgnoreCase(name)) {
			qtn_d_no(value);
			return;
		}
		if ($ship_cnt_rmrks.equalsIgnoreCase(name)) {
			ship_cnt_rmrks(value);
			return;
		}
		if ($trd_d_rmrks.equalsIgnoreCase(name)) {
			trd_d_rmrks(value);
			return;
		}
		if ($intr_rmrks.equalsIgnoreCase(name)) {
			intr_rmrks(value);
			return;
		}
		if ($io_schd_pr_no.equalsIgnoreCase(name)) {
			io_schd_pr_no(value);
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
		if ($can_rsn_cd.equalsIgnoreCase(name)) {
			can_rsn_cd(value);
			return;
		}
		if ($slo_d_can_rmkrs.equalsIgnoreCase(name)) {
			slo_d_can_rmkrs(value);
			return;
		}
		if ($edi_sub_d_char1.equalsIgnoreCase(name)) {
			edi_sub_d_char1(value);
			return;
		}
		if ($edi_sub_d_char2.equalsIgnoreCase(name)) {
			edi_sub_d_char2(value);
			return;
		}
		if ($edi_sub_d_char3.equalsIgnoreCase(name)) {
			edi_sub_d_char3(value);
			return;
		}
		if ($edi_sub_d_char4.equalsIgnoreCase(name)) {
			edi_sub_d_char4(value);
			return;
		}
		if ($edi_sub_d_char5.equalsIgnoreCase(name)) {
			edi_sub_d_char5(value);
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
		if ($slo_rev.equalsIgnoreCase(name)) {
			slo_rev(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($cost_upri.equalsIgnoreCase(name)) {
			cost_upri(value);
			return;
		}
		if ($cost_amt.equalsIgnoreCase(name)) {
			cost_amt(value);
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
		if ($iv_upri.equalsIgnoreCase(name)) {
			iv_upri(value);
			return;
		}
		if ($iv_amt.equalsIgnoreCase(name)) {
			iv_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($set_itm_grp_no.equalsIgnoreCase(name)) {
			set_itm_grp_no(value);
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
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			bill_crryovr_times(value);
			return;
		}
		if ($rqst_qty.equalsIgnoreCase(name)) {
			rqst_qty(value);
			return;
		}
		if ($qtn_rev.equalsIgnoreCase(name)) {
			qtn_rev(value);
			return;
		}
		if ($itm_comp_seq.equalsIgnoreCase(name)) {
			itm_comp_seq(value);
			return;
		}
		if ($itm_spec_seq.equalsIgnoreCase(name)) {
			itm_spec_seq(value);
			return;
		}
		if ($edi_sub_d_num1.equalsIgnoreCase(name)) {
			edi_sub_d_num1(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, int value) {
		if ($slo_rev.equalsIgnoreCase(name)) {
			slo_rev(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($cost_upri.equalsIgnoreCase(name)) {
			cost_upri(value);
			return;
		}
		if ($cost_amt.equalsIgnoreCase(name)) {
			cost_amt(value);
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
		if ($iv_upri.equalsIgnoreCase(name)) {
			iv_upri(value);
			return;
		}
		if ($iv_amt.equalsIgnoreCase(name)) {
			iv_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($set_itm_grp_no.equalsIgnoreCase(name)) {
			set_itm_grp_no(value);
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
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			bill_crryovr_times(value);
			return;
		}
		if ($rqst_qty.equalsIgnoreCase(name)) {
			rqst_qty(value);
			return;
		}
		if ($qtn_rev.equalsIgnoreCase(name)) {
			qtn_rev(value);
			return;
		}
		if ($itm_comp_seq.equalsIgnoreCase(name)) {
			itm_comp_seq(value);
			return;
		}
		if ($itm_spec_seq.equalsIgnoreCase(name)) {
			itm_spec_seq(value);
			return;
		}
		if ($edi_sub_d_num1.equalsIgnoreCase(name)) {
			edi_sub_d_num1(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, long value) {
		if ($slo_rev.equalsIgnoreCase(name)) {
			slo_rev(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($cost_upri.equalsIgnoreCase(name)) {
			cost_upri(value);
			return;
		}
		if ($cost_amt.equalsIgnoreCase(name)) {
			cost_amt(value);
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
		if ($iv_upri.equalsIgnoreCase(name)) {
			iv_upri(value);
			return;
		}
		if ($iv_amt.equalsIgnoreCase(name)) {
			iv_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($set_itm_grp_no.equalsIgnoreCase(name)) {
			set_itm_grp_no(value);
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
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			bill_crryovr_times(value);
			return;
		}
		if ($rqst_qty.equalsIgnoreCase(name)) {
			rqst_qty(value);
			return;
		}
		if ($qtn_rev.equalsIgnoreCase(name)) {
			qtn_rev(value);
			return;
		}
		if ($itm_comp_seq.equalsIgnoreCase(name)) {
			itm_comp_seq(value);
			return;
		}
		if ($itm_spec_seq.equalsIgnoreCase(name)) {
			itm_spec_seq(value);
			return;
		}
		if ($edi_sub_d_num1.equalsIgnoreCase(name)) {
			edi_sub_d_num1(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, float value) {
		if ($slo_rev.equalsIgnoreCase(name)) {
			slo_rev(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($cost_upri.equalsIgnoreCase(name)) {
			cost_upri(value);
			return;
		}
		if ($cost_amt.equalsIgnoreCase(name)) {
			cost_amt(value);
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
		if ($iv_upri.equalsIgnoreCase(name)) {
			iv_upri(value);
			return;
		}
		if ($iv_amt.equalsIgnoreCase(name)) {
			iv_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($set_itm_grp_no.equalsIgnoreCase(name)) {
			set_itm_grp_no(value);
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
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			bill_crryovr_times(value);
			return;
		}
		if ($rqst_qty.equalsIgnoreCase(name)) {
			rqst_qty(value);
			return;
		}
		if ($qtn_rev.equalsIgnoreCase(name)) {
			qtn_rev(value);
			return;
		}
		if ($itm_comp_seq.equalsIgnoreCase(name)) {
			itm_comp_seq(value);
			return;
		}
		if ($itm_spec_seq.equalsIgnoreCase(name)) {
			itm_spec_seq(value);
			return;
		}
		if ($edi_sub_d_num1.equalsIgnoreCase(name)) {
			edi_sub_d_num1(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setNumberNE(String name, double value) {
		if ($slo_rev.equalsIgnoreCase(name)) {
			slo_rev(value);
			return;
		}
		if ($disp_seq.equalsIgnoreCase(name)) {
			disp_seq(value);
			return;
		}
		if ($trd_unit_qty.equalsIgnoreCase(name)) {
			trd_unit_qty(value);
			return;
		}
		if ($base_unit_qty.equalsIgnoreCase(name)) {
			base_unit_qty(value);
			return;
		}
		if ($trd_cur_upri.equalsIgnoreCase(name)) {
			trd_cur_upri(value);
			return;
		}
		if ($cost_upri.equalsIgnoreCase(name)) {
			cost_upri(value);
			return;
		}
		if ($cost_amt.equalsIgnoreCase(name)) {
			cost_amt(value);
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
		if ($iv_upri.equalsIgnoreCase(name)) {
			iv_upri(value);
			return;
		}
		if ($iv_amt.equalsIgnoreCase(name)) {
			iv_amt(value);
			return;
		}
		if ($trd_cur_tax_amt.equalsIgnoreCase(name)) {
			trd_cur_tax_amt(value);
			return;
		}
		if ($set_itm_grp_no.equalsIgnoreCase(name)) {
			set_itm_grp_no(value);
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
		if ($bill_crryovr_times.equalsIgnoreCase(name)) {
			bill_crryovr_times(value);
			return;
		}
		if ($rqst_qty.equalsIgnoreCase(name)) {
			rqst_qty(value);
			return;
		}
		if ($qtn_rev.equalsIgnoreCase(name)) {
			qtn_rev(value);
			return;
		}
		if ($itm_comp_seq.equalsIgnoreCase(name)) {
			itm_comp_seq(value);
			return;
		}
		if ($itm_spec_seq.equalsIgnoreCase(name)) {
			itm_spec_seq(value);
			return;
		}
		if ($edi_sub_d_num1.equalsIgnoreCase(name)) {
			edi_sub_d_num1(value);
			return;
		}
		if ($upd_cntr.equalsIgnoreCase(name)) {
			upd_cntr(value);
			return;
		}
		super.setNumberNE(name, value);
	}

	public void setDateNE(String name, MCDate value) {
		if ($ship_rqst_tm.equalsIgnoreCase(name)) {
			ship_rqst_tm(value);
			return;
		}
		if ($dlv_rqst_tm.equalsIgnoreCase(name)) {
			dlv_rqst_tm(value);
			return;
		}
		if ($sls_schd_dt.equalsIgnoreCase(name)) {
			sls_schd_dt(value);
			return;
		}
		if ($accpt_schd_dt.equalsIgnoreCase(name)) {
			accpt_schd_dt(value);
			return;
		}
		if ($rqst_dt.equalsIgnoreCase(name)) {
			rqst_dt(value);
			return;
		}
		if ($rqst_dlv_rqst_dt.equalsIgnoreCase(name)) {
			rqst_dlv_rqst_dt(value);
			return;
		}
		if ($rqst_prms_dt.equalsIgnoreCase(name)) {
			rqst_prms_dt(value);
			return;
		}
		if ($rqst_prms_dlv_dt.equalsIgnoreCase(name)) {
			rqst_prms_dlv_dt(value);
			return;
		}
		if ($slo_sum_base_dt.equalsIgnoreCase(name)) {
			slo_sum_base_dt(value);
			return;
		}
		if ($edi_sub_d_dt1.equalsIgnoreCase(name)) {
			edi_sub_d_dt1(value);
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
		if ($sno1_null_flg.equalsIgnoreCase(name)) {
			sno1_null_flg(value);
			return;
		}
		if ($sno2_null_flg.equalsIgnoreCase(name)) {
			sno2_null_flg(value);
			return;
		}
		if ($sno3_null_flg.equalsIgnoreCase(name)) {
			sno3_null_flg(value);
			return;
		}
		if ($sno4_null_flg.equalsIgnoreCase(name)) {
			sno4_null_flg(value);
			return;
		}
		if ($sundry_itm_flg.equalsIgnoreCase(name)) {
			sundry_itm_flg(value);
			return;
		}
		if ($dlv_sundry_flg.equalsIgnoreCase(name)) {
			dlv_sundry_flg(value);
			return;
		}
		if ($pri_prnt_flg.equalsIgnoreCase(name)) {
			pri_prnt_flg(value);
			return;
		}
		if ($tdlv_sundry_flg.equalsIgnoreCase(name)) {
			tdlv_sundry_flg(value);
			return;
		}
		if ($sls_cststk_flg.equalsIgnoreCase(name)) {
			sls_cststk_flg(value);
			return;
		}
		if ($upri_not_tgt_flg.equalsIgnoreCase(name)) {
			upri_not_tgt_flg(value);
			return;
		}
		if ($interim_flg.equalsIgnoreCase(name)) {
			interim_flg(value);
			return;
		}
		if ($tax_fix_flg.equalsIgnoreCase(name)) {
			tax_fix_flg(value);
			return;
		}
		if ($prms_flg.equalsIgnoreCase(name)) {
			prms_flg(value);
			return;
		}
		if ($vmi_flg.equalsIgnoreCase(name)) {
			vmi_flg(value);
			return;
		}
		if ($abort_flg.equalsIgnoreCase(name)) {
			abort_flg(value);
			return;
		}
		if ($can_flg.equalsIgnoreCase(name)) {
			can_flg(value);
			return;
		}
		if ($not_lg_mix_flg.equalsIgnoreCase(name)) {
			not_lg_mix_flg(value);
			return;
		}
		if ($not_lot_mix_flg.equalsIgnoreCase(name)) {
			not_lot_mix_flg(value);
			return;
		}
		if ($not_sublot_mix_flg.equalsIgnoreCase(name)) {
			not_sublot_mix_flg(value);
			return;
		}
		super.setBooleanNE(name, value);
	}

}
